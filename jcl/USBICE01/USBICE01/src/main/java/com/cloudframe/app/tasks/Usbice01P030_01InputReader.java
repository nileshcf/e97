package com.cloudframe.app.tasks;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.records.Usbice01P030_01Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Usbice01P030_01Detail;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.Usbice01P030_01SortIn;
public class Usbice01P030_01InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Usbice01P030_01InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_usbice01p030_01")
	Usbice01P030_01Detail sortDetail;
	
	@Autowired
	@Qualifier("Usbice01P030_01SortIn")
	Usbice01P030_01SortIn sortIn;
	
    private String useTempFile="yes";

    int recCounter = 0;
     byte[] filter1 = convertChar2EbcdicBytes("NONVSAM".toCharArray());
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
		initializeSort();
	}

	private void initializeSort() {
        this.setRecPos(0);
        this.setRecIndex(-1);
		this.recCounter = 0;
        useSortTempFile(useTempFile);
        sortDetail.setTempFileVal(useTempFile);
        if (isWriteInTempFile()) {
	        doSortPresets();
	        this.getWriteCounter().set(0);
	        sortDetail.setWriteCounter(this.getWriteCounter());
	        sortDetail.setSortFile(this.getRaFile());
	        sortDetail.setTempFile(this.getTmpFile());
	        sortDetail.setExecutorService(this.getExecutorService());
        }
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		byte[] record = null;
		if(isUsingSortInFile())  setRecPos(0);	 
		record = sortIn.readRecord();					
		while (!sortIn.hasEnded() && record != null) {
			if(isUsingSortInFile()) setRecPos(getRecPos()+4);  /* Variable record data start position */
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn.readRecord();
		}
        sortDetail.setRecInCounter(recCounter);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
		return ExitStatus.COMPLETED;
	}

	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<Usbice01P030_01Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Usbice01P030_01Keys relKey = new Usbice01P030_01Keys();
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
		sortRecKeys.add(relKey);
        if (isWriteInTempFile()) {
            setRecPos(getRecPos() + byteLen); /* next record position in tempFile */
            writeToTempFile(recordByte);
        }
	}

	/**
	 * This Method is used to add sort record with COND
	 * @param
	 */	
    protected void addSortRecordBytes(byte[] record){ 
		int originalLen = sortIn.getRecordLen() - 4;
    	boolean isVlscmp = record.length < originalLen;
    	byte[] tempRecord = isVlscmp ? createPaddedRecord(record, originalLen) : record;
	   if(((Field.compareBytes(tempRecord,filter1,1,0,7,7) == 0))) {
         addRecordBytes4Sorting(record,record.length);
	   }
    }

    /**
	 * This method adds empty spaces at the end of a record to ensure it matches a specified record length. 
	 * It is intended for comparison purposes and is specifically used with VB records that have a COND attribute.
	 */
    private byte[] createPaddedRecord(byte[] record, int originalLen) {
        byte[] tempRecord = new byte[originalLen];
        byte[] fillBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(originalLen - record.length));
        copyRecordBytes(record, tempRecord, 0, 0, record.length);
        copyRecordBytes(fillBytes, tempRecord, 0, record.length, fillBytes.length);
        return tempRecord;
    }
}
