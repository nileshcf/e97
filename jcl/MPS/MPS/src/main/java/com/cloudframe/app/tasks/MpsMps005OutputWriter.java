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
import com.cloudframe.app.sort.file.MpsMps005SortIn0;
import com.cloudframe.app.sort.file.MpsMps005SortIn1;
import com.cloudframe.app.sort.file.MpsMps005SortIn2;
import com.cloudframe.app.sort.file.MpsMps005SortOut0;
import com.cloudframe.app.sort.file.MpsMps005SortOut1;
import com.cloudframe.app.sort.file.records.MpsMps005Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.MpsMps005Detail;
import com.cloudframe.app.data.Field;
public class MpsMps005OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(MpsMps005OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mpsmps005")
	MpsMps005Detail sortDetail;
	
	@Autowired
	@Qualifier("MpsMps005SortOut0")
	MpsMps005SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("MpsMps005SortOut1")
	MpsMps005SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("MpsMps005SortIn0")
	MpsMps005SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("MpsMps005SortIn1")
	MpsMps005SortIn1 sortIn1;
	
	@Autowired
	@Qualifier("MpsMps005SortIn2")
	MpsMps005SortIn2 sortIn2;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	RandomAccessFile raFile2;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;



	byte[] cond11 = convertChar2EbcdicBytes("01".toCharArray());
	byte[] cond12 = convertChar2EbcdicBytes("356".toCharArray());
	byte[] cond13 = convertChar2EbcdicBytes("01".toCharArray());
	byte[] cond14 = convertChar2EbcdicBytes("356".toCharArray());
	byte[] cond15 = convertChar2EbcdicBytes("IND".toCharArray());
	byte[] cond16 = convertChar2EbcdicBytes("02".toCharArray());
	byte[] cond17 = convertChar2EbcdicBytes("0400".toCharArray());
	byte[] cond18 = convertChar2EbcdicBytes("IND".toCharArray());
	byte[] cond19 = convertChar2EbcdicBytes("356".toCharArray());
	byte[] cond110 = convertChar2EbcdicBytes("02".toCharArray());
	byte[] cond111 = convertChar2EbcdicBytes("0420".toCharArray());
	byte[] cond112 = convertChar2EbcdicBytes("356".toCharArray());
	boolean hd0 = true;
	byte[] ifTrailCond01 = convertChar2EbcdicBytes("99".toCharArray());
	final String IFTRAIL_COUNT_MASK_PATTERN01 = "M11";
	final int IFTRAIL_COUNT_MASK_LENGTH01 = 12;
	boolean ifTrailReached0 = false;
	boolean hd1 = true;
	byte[] ifTrailCond11 = convertChar2EbcdicBytes("99".toCharArray());
	final String IFTRAIL_COUNT_MASK_PATTERN11 = "M11";
	final int IFTRAIL_COUNT_MASK_LENGTH11 = 12;
	boolean ifTrailReached1 = false;
	final int HEADER_REC1 = 0;
    private String filePath = "";
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
	    useSortTempFile(sortDetail.getTempFileVal());

		sortOut0.open("w", filePath + sortOut0.getFileName(), sortOut0.getRecordLen(), sortOut0.isFBRec());  
		sortOut1.open("w", filePath + sortOut1.getFileName(), sortOut1.getRecordLen(), sortOut1.isFBRec());  
		if (isWriteInTempFile()) {
            this.setRaFile(sortDetail.getRaFile());
            this.setTmpFile(sortDetail.getTempFile());
            this.setExecutorService(sortDetail.getExecutorService());
		} else {
            configMemMapFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<MpsMps005Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        if (isWriteInTempFile()) doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getSortedRecord(i);
         boolean iftrail0 = (!ifTrailReached0 && (Field.compareBytes(outRecBytes,ifTrailCond01,0,0,2,2) == 0));
         boolean iftrail1 = (!ifTrailReached1 && (Field.compareBytes(outRecBytes,ifTrailCond11,0,0,2,2) == 0));
		   if (!ifTrailReached0) { 

		     if(iftrail0)   { 
              if(hd0) recordCount0 = recordCount0 - 1;
              byte[] temp = convertChar2EbcdicBytes(copyMaskBytes(Integer.toString(recordCount0), IFTRAIL_COUNT_MASK_PATTERN01, IFTRAIL_COUNT_MASK_LENGTH01));
              copyRecordBytes(temp,outRecBytes, 0, 40, 12);
              ifTrailReached0 = true;
            }

                  
		    //write into sortOut0 file
		 	sortOut0.setRecord(outRecBytes, sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((HEADER_REC1 == i || iftrail1) || !ifTrailReached1 &&((Field.compareBytes(outRecBytes,cond11,0,0,2,2) == 0) && (Field.compareBytes(outRecBytes,cond12,809,0,3,3) == 0)) || ((Field.compareBytes(outRecBytes,cond13,0,0,2,2) == 0) && (Field.compareBytes(outRecBytes,cond14,857,0,3,3) == 0) && (Field.compareBytes(outRecBytes,cond15,1202,0,3,3) == 0)) || ((Field.compareBytes(outRecBytes,cond16,0,0,2,2) == 0) && (Field.compareBytes(outRecBytes,cond17,34,0,4,4) == 0) && (Field.compareBytes(outRecBytes,cond18,806,0,3,3) == 0) && (Field.compareBytes(outRecBytes,cond19,1093,0,3,3) == 0)) || ((Field.compareBytes(outRecBytes,cond110,0,0,2,2) == 0) && (Field.compareBytes(outRecBytes,cond111,34,0,4,4) == 0) && (Field.compareBytes(outRecBytes,cond112,889,0,3,3) == 0))) {
		     if(iftrail1)   { 
              if(hd1) recordCount1 = recordCount1 - 1;
              byte[] temp = convertChar2EbcdicBytes(copyMaskBytes(Integer.toString(recordCount1), IFTRAIL_COUNT_MASK_PATTERN11, IFTRAIL_COUNT_MASK_LENGTH11));
              copyRecordBytes(temp,outRecBytes, 0, 40, 12);
              ifTrailReached1 = true;
            }

                  
		    //write into sortOut1 file
		 	sortOut1.setRecord(outRecBytes, sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
        }

		cfStepHandler.updateSortStepExecution("mps005");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {

         logger.info("STEPNAME: MPSMPS005 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MPSMPS005 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
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
			MpsMps005Keys k = sortRecKeys.get(index);
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

		    // File 2
		    raFile2 = new RandomAccessFile(new File(filePath + sortIn2.getFileName()), "rw");

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
	        case 2:// File 2
				   raFile2.seek(offSet);	// Record Position
	               raFile2.read(data);	// read record
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
		    raFile2.close();
	    } catch (IOException e) {
		   logger.error("Error: Handling Memory Map file - Exception: {} ", e.getMessage());
	    }
	}
	  
	  
	  
	  	
}
