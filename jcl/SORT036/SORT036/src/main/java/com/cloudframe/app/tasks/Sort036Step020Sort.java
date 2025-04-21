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
import com.cloudframe.app.sort.file.Sort036Step020SortIn;
import com.cloudframe.app.sort.file.Sort036Step020SortOut;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sort036Step020Detail;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.Sort036Step020SortIn;
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
import com.cloudframe.app.sort.Sort036Step020Detail;
import org.springframework.beans.factory.annotation.Value;
public class Sort036Step020Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(Sort036Step020Sort.class);

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
	@Qualifier("batch_sort036step020")
	Sort036Step020Detail sortDetail;
	
	@Autowired
	@Qualifier("Sort036Step020SortOut")
	Sort036Step020SortOut sortOut;
	


	
	@Autowired
	@Qualifier("Sort036Step020SortIn")
	Sort036Step020SortIn sortIn;
	
	
    int recordCount = 0;



    byte[] outrecWhen1 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] outrecWhen2 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] outrecWhen3 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] outrecWhen4 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] outrecWhen5 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] outrecWhen6 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] outrecWhen7 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] outrecWhen8 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] outrecOverlay1 = convertBinaryString2Bytes("+70",2);
    byte[] outrecOverlay2 = convertBinaryString2Bytes("+74",2);
    byte[] outrecOverlay3 = convertBinaryString2Bytes("+70",2);
    byte[] outrecOverlay4 = convertBinaryString2Bytes("+74",2);
    byte[] outrecOverlay5 = convertBinaryString2Bytes("+70",2);
    byte[] outrecOverlay6 = convertBinaryString2Bytes("+74",2);
    byte[] outrecOverlay7 = convertBinaryString2Bytes("+70",2);
    byte[] outrecOverlay8 = convertBinaryString2Bytes("+74",2);
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


		cfStepHandler.updateSortStepExecution("step020");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: SORT036STEP020 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
        if (compareBinaryBytes(record, outrecWhen1, 44, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay1,record, 0, 44, outrecOverlay1.length); 

        } 
        if (compareBinaryBytes(record, outrecWhen2, 44, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay2,record, 0, 44, outrecOverlay2.length); 

        } 
        if (compareBinaryBytes(record, outrecWhen3, 102, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay3,record, 0, 102, outrecOverlay3.length); 

        } 
        if (compareBinaryBytes(record, outrecWhen4, 102, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay4,record, 0, 102, outrecOverlay4.length); 

        } 
        if (compareBinaryBytes(record, outrecWhen5, 160, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay5,record, 0, 160, outrecOverlay5.length); 

        } 
        if (compareBinaryBytes(record, outrecWhen6, 160, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay6,record, 0, 160, outrecOverlay6.length); 

        } 
        if (compareBinaryBytes(record, outrecWhen7, 218, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay7,record, 0, 218, outrecOverlay7.length); 

        } 
        if (compareBinaryBytes(record, outrecWhen8, 218, 0, 2, 2)  == 0) {
        
         copyRecordBytes(outrecOverlay8,record, 0, 218, outrecOverlay8.length); }

          return record;
    }
    
	  
	  
	  
	  







}
