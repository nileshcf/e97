package com.cloudframe.app.tasks;
import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.InitializingBean;
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
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.MpsMps006Detail;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.MpsMps006SortIn;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
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

import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.MpsMps006Detail;
import org.springframework.beans.factory.annotation.Value;
public class MpsMps006Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(MpsMps006Sort.class);

/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
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
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
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

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// FileOut write process begin, Extract sorted record and write it to the output file
          byte[] record = sortIn.readRecord();
          while (!sortIn.hasEnded() && record != null) {
           byte[] outRecBytes = record;


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
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("mps006");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MPSMPS006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MPSMPS006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MPSMPS006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
         sortOut2.close();
		if(isWriteInTempFile()) {
			stopExecutorServ();
		}
		removeTempFile();
		logger.debug("Sort Writer ended.");
		SpringContextHandler.handleDispPostionAtStepEnd(true);
		return ExitStatus.COMPLETED;
	}



    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }
	  
	  
	  
	  







}
