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
import com.cloudframe.app.sort.file.UsbrecdatDate1outSortIn;
import com.cloudframe.app.sort.file.UsbrecdatDate1outSortOut;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.UsbrecdatDate1outDetail;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.UsbrecdatDate1outSortIn;
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
import com.cloudframe.app.sort.UsbrecdatDate1outDetail;
import org.springframework.beans.factory.annotation.Value;
public class UsbrecdatDate1outSort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(UsbrecdatDate1outSort.class);

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
	@Qualifier("batch_usbrecdatdate1out")
	UsbrecdatDate1outDetail sortDetail;
	
	@Autowired
	@Qualifier("UsbrecdatDate1outSortOut")
	UsbrecdatDate1outSortOut sortOut;
	


	
	@Autowired
	@Qualifier("UsbrecdatDate1outSortIn")
	UsbrecdatDate1outSortIn sortIn;
	
	
    int recordCount = 0;



    static final int OVERLAY_OUTREC_SIZE = 132;
    byte[] outrecOverlay1 = new byte[1];
    byte[] outrecOverlay2 = convertChar2EbcdicBytes(getFilledSpaces(1));
    byte[] outrecOverlay3 = convertChar2EbcdicBytes(getCustomDateFormatValue("&DATE1","-5"));
	static final int OUTREC_POS1=0;
	static final int OUTREC_LEN1=123;
	static final int OUTREC_DES_POS1=0;
    private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
	    useSortTempFile(sortDetail.getTempFileVal());
		sortOut.open("w", filePath + sortOut.getFileName(), sortOut.getRecordLen(), sortOut.isFBRec());  
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
			byte[] outRecBytes = getOutrecRecord(record);


		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("date1out");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: USBRECDATDATE1OUT Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

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

    private byte[] getOutrecRecord(byte[] record) {  
        byte[] tempRecord = new byte[OVERLAY_OUTREC_SIZE];
        
      copyRecordBytes( record, tempRecord, OUTREC_POS1, OUTREC_DES_POS1, OUTREC_LEN1); 
                 copyRecordBytes(outrecOverlay2,tempRecord, 0, 123, outrecOverlay2.length); 
                 copyRecordBytes(outrecOverlay3,tempRecord, 0, 124, outrecOverlay3.length); 
          return tempRecord;
    }
    
	  
	  
	  
	  







}
