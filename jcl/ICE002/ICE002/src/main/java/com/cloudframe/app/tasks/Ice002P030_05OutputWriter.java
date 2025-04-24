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
import com.cloudframe.app.sort.file.Ice002P030_05SortIn;
import com.cloudframe.app.sort.file.Ice002P030_05SortOut;
import com.cloudframe.app.sort.file.records.Ice002P030_05Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Ice002P030_05Detail;
import com.cloudframe.app.data.Field;
public class Ice002P030_05OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Ice002P030_05OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_ice002p030_05")
	Ice002P030_05Detail sortDetail;
	
	@Autowired
	@Qualifier("Ice002P030_05SortOut")
	Ice002P030_05SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Ice002P030_05SortIn")
	Ice002P030_05SortIn sortIn;
	
	
    int recordCount = 0;



    static final int OVERLAY_OUTREC_SIZE = 0;
    byte[] overlay1 = convertChar2EbcdicBytes("                     ".toCharArray());
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

	List<Ice002P030_05Keys> sortRecKeys = null;

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

		cfStepHandler.updateSortStepExecution("p030_05");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: ICE002P030_05 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			Ice002P030_05Keys k = sortRecKeys.get(index);
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
        byte[] tempRecord = new byte[OVERLAY_OUTREC_SIZE];
        
         copyRecordBytes(overlay1,tempRecord, 0, 59, overlay1.length); 
          return tempRecord;
    }
    
	  
	  
	  
	  	
}
