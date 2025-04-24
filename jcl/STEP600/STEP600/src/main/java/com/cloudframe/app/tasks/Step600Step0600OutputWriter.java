package com.cloudframe.app.tasks;

import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.Collections;
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
import com.cloudframe.app.sort.file.Step600Step0600SortIn0;
import com.cloudframe.app.sort.file.Step600Step0600SortIn1;
import com.cloudframe.app.sort.file.Step600Step0600SortOut;
import com.cloudframe.app.sort.file.records.Step600Step0600Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Step600Step0600Detail;
import com.cloudframe.app.data.Field;
public class Step600Step0600OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Step600Step0600OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_step600step0600")
	Step600Step0600Detail sortDetail;
	
	@Autowired
	@Qualifier("Step600Step0600SortOut")
	Step600Step0600SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Step600Step0600SortIn0")
	Step600Step0600SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Step600Step0600SortIn1")
	Step600Step0600SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;

	byte[] unpairedValB = convertChar2EbcdicBytes("B".toCharArray());
	byte[] unpairedVal1 = convertChar2EbcdicBytes("1".toCharArray());


	final byte[] whenBytes00 = convertChar2EbcdicBytes("B".toCharArray());
	final byte[] fillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
	final byte[] fillBytes02 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	final byte[] whenBytes10 = convertChar2EbcdicBytes("1".toCharArray());
	final byte[] outrecBuildLtrl11 = convertToPackedDecimalBytes(0,3);
	final byte[] outrecBuildLtrl12 = convertToPackedDecimalBytes(0,3);
	final byte[] outrecBuildLtrl13 = convertToPackedDecimalBytes(0,3);
	final byte[] fillBytes14 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	static final int BUILD_OUTREC_SIZE = 80;
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
            configMemMapFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<Step600Step0600Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        if (isWriteInTempFile()) doPresetForRead();
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

		cfStepHandler.updateSortStepExecution("step0600");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: STEP600STEP0600 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

		sortRecKeys.clear();
		if(isWriteInTempFile()) {
			stopExecutorServ();
			removeTempFile();
		} else 
		    clearMemMapFiles();
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
			Step600Step0600Keys k = sortRecKeys.get(index);
           if (isWriteInTempFile()) {
				return readFromBuffer(k.getSortRecPos(), k.getSortRecLen());
		   } else
			    return readFromBuffer(k.getSortRecPos(), k.getSortRecLen(), k.getFileIndx());
		} catch (Exception e) {
			logger.error("Error in return record : {}", e.getMessage());
		}
		return new byte[0];
	}
    private void configMemMapFile() {
	    try {
		    // File 0
		    raFile0 = new RandomAccessFile(new File(filePath + sortIn0.getFileName()), "rw");

		    // File 1
		    raFile1 = new RandomAccessFile(new File(filePath + sortIn1.getFileName()), "rw");

	    } catch (FileNotFoundException e) {
		    logger.error("Error access on file - Exception: {} ", e.getMessage());
		}    
	}

    protected byte[] readFromBuffer(long offSet, int dataLen, int fileInID)  throws IOException {
	    byte[] data = new byte[dataLen];
	    switch (fileInID) {
	        case 0:// File 0
				   raFile0.seek(offSet);	// Record Position
	               raFile0.read(data);	// read record
                break;
	        case 1:// File 1
				   raFile1.seek(offSet);	// Record Position
	               raFile1.read(data);	// read record
                break;
	        default:
		        break;
	    }
	    return data;
    }

    protected void clearMemMapFiles() {
	    try {
		    raFile0.close();
		    raFile1.close();
	    } catch (IOException e) {
		   logger.error("Error: Handling Memory Map file - Exception: {} ", e.getMessage());
	    }
	}
    private byte[] getOutrecRecord(byte[] record) {  
      byte[] buildRec = new byte[BUILD_OUTREC_SIZE]; 
      copyRecordBytes(fillBuildBytes, buildRec, 0, 0,BUILD_OUTREC_SIZE);
        if (Field.compareBytes(record, whenBytes00, 67, 0, 1, 1)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,49);
copyRecordBytes(record, buildRec, 58,49,9);
copyRecordBytes(fillBytes02,buildRec,0,79,1);
 } else if (Field.compareBytes(record, whenBytes10, 67, 0, 1, 1)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,49);
copyRecordBytes(outrecBuildLtrl11, buildRec, 0,49,3); 
copyRecordBytes(outrecBuildLtrl12, buildRec, 0,52,3); 
copyRecordBytes(outrecBuildLtrl13, buildRec, 0,55,3); 
copyRecordBytes(fillBytes14,buildRec,0,79,1);
 }else { return record;}
      return buildRec;
    }
	  
	  
	  
	  	
}
