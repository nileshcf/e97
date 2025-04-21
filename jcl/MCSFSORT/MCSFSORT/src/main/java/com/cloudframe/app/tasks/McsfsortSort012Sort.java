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
import com.cloudframe.app.sort.file.McsfsortSort012SortIn;
import com.cloudframe.app.sort.file.McsfsortSort012SortOut0;
import com.cloudframe.app.sort.file.McsfsortSort012SortOut1;
import com.cloudframe.app.sort.file.McsfsortSort012SortOut2;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McsfsortSort012Detail;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.McsfsortSort012SortIn;
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
import com.cloudframe.app.sort.McsfsortSort012Detail;
import org.springframework.beans.factory.annotation.Value;
public class McsfsortSort012Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(McsfsortSort012Sort.class);

/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    private String useTempFile="yes";

    int recCounter = 0;
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcsfsortsort012")
	McsfsortSort012Detail sortDetail;
	
	@Autowired
	@Qualifier("McsfsortSort012SortOut0")
	McsfsortSort012SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McsfsortSort012SortOut1")
	McsfsortSort012SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("McsfsortSort012SortOut2")
	McsfsortSort012SortOut2 sortOut2;
	


	
	@Autowired
	@Qualifier("McsfsortSort012SortIn")
	McsfsortSort012SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
    int recordCount2 = 0;



	byte[] cond01 = convertChar2EbcdicBytes("N".toCharArray());
	byte[] cond11 = convertChar2EbcdicBytes("WA".toCharArray());
	byte[] cond12 = convertChar2EbcdicBytes("2A".toCharArray());
	byte[] cond21 = convertChar2EbcdicBytes("B".toCharArray());
	byte[] cond22 = convertHexChar2Bytes("4040404040404040404040404040");
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


		  if ((Field.compareBytes(outRecBytes,cond01,15,0,1,1) == 0)) {
		  
                  
		    //write into sortOut0 file
		 	sortOut0.setRecord(outRecBytes, sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,cond11,15,0,2,2) == 0) || (Field.compareBytes(outRecBytes,cond12,15,0,2,2) == 0)) {
		  
                  
		    //write into sortOut1 file
		 	sortOut1.setRecord(outRecBytes, sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
		  if ((Field.compareBytes(outRecBytes,cond21,15,0,1,1) == 0) && (Field.compareBytes(outRecBytes,cond22,16,0,14,14) > 0)) {
		  
                  
		    //write into sortOut2 file
		 	sortOut2.setRecord(outRecBytes, sortOut2.getRecordLen());
		 	
			sortOut2.write(); recordCount2++;
		  }	
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("sort012");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MCSFSORTSORT012 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCSFSORTSORT012 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MCSFSORTSORT012 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
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
