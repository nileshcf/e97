package com.cloudframe.app.tasks;

import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;
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
import com.cloudframe.app.sort.file.McgcmsSort009SortIn0;
import com.cloudframe.app.sort.file.McgcmsSort009SortIn1;
import com.cloudframe.app.sort.file.McgcmsSort009SortOut;
import com.cloudframe.app.sort.file.records.McgcmsSort009Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort009Detail;
import com.cloudframe.app.data.Field;
public class McgcmsSort009OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort009OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort009")
	McgcmsSort009Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort009SortOut")
	McgcmsSort009SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort009SortIn0")
	McgcmsSort009SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort009SortIn1")
	McgcmsSort009SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;



	final byte[] whenBytes00 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] whenBytes01 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] fillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
	final byte[] outrecBuildLtrl02 = convertChar2EbcdicBytes("*******".toCharArray());
	final byte[] outrecBuildLtrl03 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] outrecBuildLtrl04 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] whenBytes10 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] whenBytes11 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] outrecBuildLtrl11 = convertChar2EbcdicBytes("*************************".toCharArray());
	final byte[] outrecBuildLtrl12 = convertChar2EbcdicBytes("*******".toCharArray());
	final byte[] outrecBuildLtrl13 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] outrecBuildLtrl14 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] fillBytes20 = convertChar2EbcdicBytes(CFUtil.fillSpaces(136));
	static final int BUILD_OUTREC_SIZE = 136;
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

	List<McgcmsSort009Keys> sortRecKeys = null;

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

		cfStepHandler.updateSortStepExecution("sort009");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: MCGCMSSORT009 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			McgcmsSort009Keys k = sortRecKeys.get(index);
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
        if (Field.compareBytes(record, whenBytes00, 0, 0, 1, 1)  != 0 && Field.compareBytes(record, whenBytes01, 102, 0, 1, 1)  != 0) { 
copyRecordBytes(record, buildRec, 19,0,66);
copyRecordBytes(record, buildRec, 172,66,25);
copyRecordBytes(outrecBuildLtrl02, buildRec, 0,91,7); 
copyRecordBytes(outrecBuildLtrl03, buildRec, 0,98,19); 
copyRecordBytes(outrecBuildLtrl04, buildRec, 0,117,19); 
 } else if (Field.compareBytes(record, whenBytes10, 0, 0, 1, 1)  != 0 && Field.compareBytes(record, whenBytes11, 102, 0, 1, 1)  == 0) { 
copyRecordBytes(record, buildRec, 19,0,66);
copyRecordBytes(outrecBuildLtrl11, buildRec, 0,66,25); 
copyRecordBytes(outrecBuildLtrl12, buildRec, 0,91,7); 
copyRecordBytes(outrecBuildLtrl13, buildRec, 0,98,19); 
copyRecordBytes(outrecBuildLtrl14, buildRec, 0,117,19); 
 }else  { 
copyRecordBytes(fillBytes20,buildRec,0,0,136);
 }
      return buildRec;
    }
	  
	  
	  
	  	
}
