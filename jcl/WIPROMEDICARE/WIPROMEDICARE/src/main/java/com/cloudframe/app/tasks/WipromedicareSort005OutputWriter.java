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
import com.cloudframe.app.sort.file.WipromedicareSort005SortIn;
import com.cloudframe.app.sort.file.WipromedicareSort005SortOut;
import com.cloudframe.app.sort.file.records.WipromedicareSort005Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.WipromedicareSort005Detail;
import com.cloudframe.app.data.Field;
public class WipromedicareSort005OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(WipromedicareSort005OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_wipromedicaresort005")
	WipromedicareSort005Detail sortDetail;
	
	@Autowired
	@Qualifier("WipromedicareSort005SortOut")
	WipromedicareSort005SortOut sortOut;
	

	
	@Autowired
	@Qualifier("WipromedicareSort005SortIn")
	WipromedicareSort005SortIn sortIn;
	
	
    int recordCount = 0;



    byte[] when1 = convertHexChar2Bytes("0000");
    byte[] overlay1 = convertChar2EbcdicBytes("99".toCharArray());
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

	List<WipromedicareSort005Keys> sortRecKeys = null;

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

		cfStepHandler.updateSortStepExecution("sort005");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: WIPROMEDICARESORT005 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			WipromedicareSort005Keys k = sortRecKeys.get(index);
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
        if (Field.compareBytes(record, when1, 450, 0, 2, 2)  == 0) {
        
         copyRecordBytes(overlay1,record, 0, 450, overlay1.length); }

          return record;
    }
    
	  
	  
	  
	  	
}
