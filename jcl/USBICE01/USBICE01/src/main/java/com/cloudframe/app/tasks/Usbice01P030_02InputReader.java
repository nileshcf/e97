package com.cloudframe.app.tasks;

import java.util.List;
import java.util.ArrayList;

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
import com.cloudframe.app.sort.file.records.Usbice01P030_02Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Usbice01P030_02Detail;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import java.math.BigDecimal;
import com.cloudframe.app.sort.file.Usbice01P030_02SortIn;
public class Usbice01P030_02InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Usbice01P030_02InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_usbice01p030_02")
	Usbice01P030_02Detail sortDetail;
	
	@Autowired
	@Qualifier("Usbice01P030_02SortIn")
	Usbice01P030_02SortIn sortIn;
	
    private String useTempFile="yes";

    int recCounter = 0;
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
		List<Usbice01P030_02Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Usbice01P030_02Keys relKey = new Usbice01P030_02Keys();
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
        byte[] inrecBuild = createInrecBuildRecord(record);
        addRecordBytes4Sorting(inrecBuild, inrecBuild.length);
    }

       final byte[] whenBytes00 = convertChar2EbcdicBytes("TM.".toCharArray());
       final byte[] fillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
       final byte[] outrecBuildLtrl01 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] outrecBuildLtrl03 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] whenBytes10 = convertChar2EbcdicBytes("TM3".toCharArray());
       final byte[] outrecBuildLtrl11 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] outrecBuildLtrl13 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] whenBytes20 = convertChar2EbcdicBytes("TME".toCharArray());
       final byte[] outrecBuildLtrl21 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] outrecBuildLtrl23 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] whenBytes30 = convertChar2EbcdicBytes("TM.".toCharArray());
       final byte[] outrecBuildLtrl31 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] outrecBuildLtrl33 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] whenBytes40 = convertChar2EbcdicBytes("TM3".toCharArray());
       final byte[] outrecBuildLtrl41 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] outrecBuildLtrl43 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] whenBytes50 = convertChar2EbcdicBytes("TME".toCharArray());
       final byte[] outrecBuildLtrl51 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] outrecBuildLtrl53 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       static final int BUILD_OUTREC_SIZE = 125;

   public byte[] createInrecBuildRecord(byte[] record) {
    byte[] buildRec = new byte[BUILD_OUTREC_SIZE];
    copyRecordBytes(fillBuildBytes, buildRec, 0, 0,BUILD_OUTREC_SIZE);
          if (Field.compareBytes(record, whenBytes00, 25, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(outrecBuildLtrl01, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 17,14,36);
copyRecordBytes(outrecBuildLtrl03, buildRec, 0,50,15); 
 } else if (Field.compareBytes(record, whenBytes10, 25, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(outrecBuildLtrl11, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 17,14,37);
copyRecordBytes(outrecBuildLtrl13, buildRec, 0,51,15); 
 } else if (Field.compareBytes(record, whenBytes20, 25, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(outrecBuildLtrl21, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 17,14,37);
copyRecordBytes(outrecBuildLtrl23, buildRec, 0,51,15); 
 } else if (Field.compareBytes(record, whenBytes30, 24, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(outrecBuildLtrl31, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 16,14,36);
copyRecordBytes(outrecBuildLtrl33, buildRec, 0,50,15); 
 } else if (Field.compareBytes(record, whenBytes40, 24, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(outrecBuildLtrl41, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 16,14,37);
copyRecordBytes(outrecBuildLtrl43, buildRec, 0,51,15); 
 } else if (Field.compareBytes(record, whenBytes50, 24, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(outrecBuildLtrl51, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 16,14,37);
copyRecordBytes(outrecBuildLtrl53, buildRec, 0,51,15); 
 }else { return record;}
    return buildRec;
   }
}
