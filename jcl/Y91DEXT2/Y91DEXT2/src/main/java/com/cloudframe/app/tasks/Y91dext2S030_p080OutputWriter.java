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
import com.cloudframe.app.sort.file.Y91dext2S030_p080SortIn;
import com.cloudframe.app.sort.file.Y91dext2S030_p080SortOut;
import com.cloudframe.app.sort.file.records.Y91dext2S030_p080Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Y91dext2S030_p080Detail;
import com.cloudframe.app.data.Field;
public class Y91dext2S030_p080OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Y91dext2S030_p080OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_y91dext2s030_p080")
	Y91dext2S030_p080Detail sortDetail;
	
	@Autowired
	@Qualifier("Y91dext2S030_p080SortOut")
	Y91dext2S030_p080SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Y91dext2S030_p080SortIn")
	Y91dext2S030_p080SortIn sortIn;
	
	
    int recordCount = 0;



    static final int OVERLAY_OUTREC_SIZE = 132;
    byte[] overlay1 = new byte[1];
    byte[] overlay2 = convertChar2EbcdicBytes(getFilledSpaces(1));
    byte[] overlay3 = convertChar2EbcdicBytes(getCustomDateFormatValue("&DATE1","-5"));
	static final int OUTREC_POS1=0;
	static final int OUTREC_LEN1=123;
	static final int OUTREC_DES_POS1=0;
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

	List<Y91dext2S030_p080Keys> sortRecKeys = null;

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

		cfStepHandler.updateSortStepExecution("s030_p080");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: Y91DEXT2S030_P080 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			Y91dext2S030_p080Keys k = sortRecKeys.get(index);
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
        
      copyRecordBytes( record, tempRecord, OUTREC_POS1, OUTREC_DES_POS1, OUTREC_LEN1); 
                 copyRecordBytes(overlay2,tempRecord, 0, 123, overlay2.length); 
                 copyRecordBytes(overlay3,tempRecord, 0, 124, overlay3.length); 
          return tempRecord;
    }
    
	  
	  
	  
	  	
}
