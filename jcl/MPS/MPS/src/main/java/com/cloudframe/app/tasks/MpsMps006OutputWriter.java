package com.cloudframe.app.tasks;

import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.MpsMps006SortIn;
import com.cloudframe.app.sort.file.MpsMps006SortOut0;
import com.cloudframe.app.sort.file.MpsMps006SortOut1;
import com.cloudframe.app.sort.file.MpsMps006SortOut2;
import com.cloudframe.app.sort.file.records.MpsMps006Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.MpsMps006Detail;
import com.cloudframe.app.data.Field;
public class MpsMps006OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(MpsMps006OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mpsmps006")
	MpsMps006Detail sortDetail;
	
	@Autowired
	@Qualifier("MpsMps006SortOut0")
	MpsMps006SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("MpsMps006SortOut1")
	MpsMps006SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("MpsMps006SortOut2")
	MpsMps006SortOut2 sortOut2;
	

	
	@Autowired
	@Qualifier("MpsMps006SortIn")
	MpsMps006SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
    int recordCount2 = 0;



	byte[] cond01 = convertChar2EbcdicBytes("00".toCharArray());
	static final int ACCEPT0 = 1;
	byte[] cond11 = convertChar2EbcdicBytes("99".toCharArray());
	static final int ACCEPT1 = 1;
	byte[] cond21 = convertChar2EbcdicBytes("00".toCharArray());
	byte[] cond22 = convertChar2EbcdicBytes("99".toCharArray());
    private String filePath = "";
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
	    useSortTempFile(sortDetail.getTempFileVal());

		sortOut0.open("w", filePath + sortOut0.getFileName(), sortOut0.getRecordLen(), sortOut0.isFBRec());  
		sortOut1.open("w", filePath + sortOut1.getFileName(), sortOut1.getRecordLen(), sortOut1.isFBRec());  
		sortOut2.open("w", filePath + sortOut2.getFileName(), sortOut2.getRecordLen(), sortOut2.isFBRec());  
		if (isWriteInTempFile()) {
            this.setRaFile(sortDetail.getRaFile());
            this.setTmpFile(sortDetail.getTempFile());
            this.setExecutorService(sortDetail.getExecutorService());
		} else {
		    createRandomAccessFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<MpsMps006Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getSortedRecord(i);
		  if ((Field.compareBytes(outRecBytes,cond01,0,0,2,2) == 0) && (recordCount0 < ACCEPT0)) {
		  
                  
		    //write into sortOut0 file
		 	sortOut0.setRecord(outRecBytes, sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,cond11,0,0,2,2) == 0) && (recordCount1 < ACCEPT1)) {
		  
                  
		    //write into sortOut1 file
		 	sortOut1.setRecord(outRecBytes, sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
		  if (!((Field.compareBytes(outRecBytes,cond21,0,0,2,2) == 0) || (Field.compareBytes(outRecBytes,cond22,0,0,2,2) == 0))){
		  
                  
		    //write into sortOut2 file
		 	sortOut2.setRecord(outRecBytes, sortOut2.getRecordLen());
		 	
			sortOut2.write(); recordCount2++;
		  }	
        }

		cfStepHandler.updateSortStepExecution("mps006");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {

         logger.info("STEPNAME: MPSMPS006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MPSMPS006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MPSMPS006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
         sortOut2.close();
		sortRecKeys.clear();
		if(isWriteInTempFile()) {
			stopExecutorServ();
		}
		removeTempFile();	
		logger.debug("Sort Writer ended.");
		SpringContextHandler.handleDispPostionAtStepEnd(true);
		return ExitStatus.COMPLETED;
	}

	/**
	 * This method return sorted record data as byte array
	 * 
	 * @return
	 */ 
	private byte[] getSortedRecord(int index) {
		try {
			MpsMps006Keys k = sortRecKeys.get(index);
			return readFromBuffer(k.getSortRecPos(), k.getSortRecLen());
		} catch (Exception e) {
			logger.error("Error in return record : {}", e.getMessage());
		}
		return new byte[0];
	}
    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }

	  
	  
	  
	  	
}
