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
import com.cloudframe.app.sort.file.Sort036Step020SortIn;
import com.cloudframe.app.sort.file.Sort036Step020SortOut;
import com.cloudframe.app.sort.file.records.Sort036Step020Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sort036Step020Detail;
import com.cloudframe.app.data.Field;
public class Sort036Step020OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Sort036Step020OutputWriter.class);
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



    byte[] when1 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] when2 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] when3 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] when4 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] when5 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] when6 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] when7 = convertHexChar2Bytes(Integer.toHexString(18).toUpperCase());
    byte[] when8 = convertHexChar2Bytes(Integer.toHexString(23).toUpperCase());
    byte[] overlay1 = convertBinaryString2Bytes("+70",2);
    byte[] overlay2 = convertBinaryString2Bytes("+74",2);
    byte[] overlay3 = convertBinaryString2Bytes("+70",2);
    byte[] overlay4 = convertBinaryString2Bytes("+74",2);
    byte[] overlay5 = convertBinaryString2Bytes("+70",2);
    byte[] overlay6 = convertBinaryString2Bytes("+74",2);
    byte[] overlay7 = convertBinaryString2Bytes("+70",2);
    byte[] overlay8 = convertBinaryString2Bytes("+74",2);
    private String filePath = "";
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
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

	List<Sort036Step020Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
			byte[] outRecBytes = getOutrecRecord(getSortedRecord(i));
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("step020");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: SORT036STEP020 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

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
			Sort036Step020Keys k = sortRecKeys.get(index);
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


    private byte[] getOutrecRecord(byte[] record) {  
        if (compareBinaryBytes(record, when1, 44, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay1,record, 0, 44, overlay1.length); 

        } 
        if (compareBinaryBytes(record, when2, 44, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay2,record, 0, 44, overlay2.length); 

        } 
        if (compareBinaryBytes(record, when3, 102, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay3,record, 0, 102, overlay3.length); 

        } 
        if (compareBinaryBytes(record, when4, 102, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay4,record, 0, 102, overlay4.length); 

        } 
        if (compareBinaryBytes(record, when5, 160, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay5,record, 0, 160, overlay5.length); 

        } 
        if (compareBinaryBytes(record, when6, 160, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay6,record, 0, 160, overlay6.length); 

        } 
        if (compareBinaryBytes(record, when7, 218, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay7,record, 0, 218, overlay7.length); 

        } 
        if (compareBinaryBytes(record, when8, 218, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay8,record, 0, 218, overlay8.length); }

          return record;
    }
    
	  
	  
	  
	  	
}
