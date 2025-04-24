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
import com.cloudframe.app.sort.file.records.WipromedicareSort001Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.WipromedicareSort001Detail;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.WipromedicareSort001SortIn;
public class WipromedicareSort001InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(WipromedicareSort001InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_wipromedicaresort001")
	WipromedicareSort001Detail sortDetail;
	
	@Autowired
	@Qualifier("WipromedicareSort001SortIn")
	WipromedicareSort001SortIn sortIn;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_LEN0 = 1;
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
		List<WipromedicareSort001Keys> sortRecKeys = sortDetail.getSortRecKeys();
		WipromedicareSort001Keys relKey = new WipromedicareSort001Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(getAltSeqRecordBytes(recordByte), KEY_POS0 , KEY_LEN0)); 
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
         addRecordBytes4Sorting(record,record.length);
    }

      String altSeqStr= "F100,F301";
    List<String> altSeqCodeLst = Arrays.asList(altSeqStr.split(","));
   private byte[] getAltSeqRecordBytes(byte[] record) {
		for(String lst: altSeqCodeLst) {
			byte[] altSeqKey = convertHexChar2Bytes(lst.substring(0, 2));
			byte[] altSeqValue = convertHexChar2Bytes(lst.substring(2, 4));
			int i = 0;
			for(byte rc: record) {
				if(altSeqKey[0]== rc) {
					record[i] = altSeqValue[0];
				  }
				i++;
			}
		}
		return record; 
	}
}
