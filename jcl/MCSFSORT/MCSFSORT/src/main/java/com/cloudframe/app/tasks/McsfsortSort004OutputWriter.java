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
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.McsfsortSort004SortIn;
import com.cloudframe.app.sort.file.McsfsortSort004SortOut0;
import com.cloudframe.app.sort.file.McsfsortSort004SortOut1;
import com.cloudframe.app.sort.file.McsfsortSort004SortOut2;
import com.cloudframe.app.sort.file.McsfsortSort004SortOut3;
import com.cloudframe.app.sort.file.McsfsortSort004SortOut4;
import com.cloudframe.app.sort.file.records.McsfsortSort004Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McsfsortSort004Detail;
import com.cloudframe.app.data.Field;
public class McsfsortSort004OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McsfsortSort004OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcsfsortsort004")
	McsfsortSort004Detail sortDetail;
	
	@Autowired
	@Qualifier("McsfsortSort004SortOut0")
	McsfsortSort004SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McsfsortSort004SortOut1")
	McsfsortSort004SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("McsfsortSort004SortOut2")
	McsfsortSort004SortOut2 sortOut2;
	
	@Autowired
	@Qualifier("McsfsortSort004SortOut3")
	McsfsortSort004SortOut3 sortOut3;
	
	@Autowired
	@Qualifier("McsfsortSort004SortOut4")
	McsfsortSort004SortOut4 sortOut4;
	

	
	@Autowired
	@Qualifier("McsfsortSort004SortIn")
	McsfsortSort004SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
    int recordCount2 = 0;
    int recordCount3 = 0;
    int recordCount4 = 0;



	byte[] cond21 = convertChar2EbcdicBytes("9".toCharArray());
	byte[] cond22 = convertChar2EbcdicBytes("Z".toCharArray());
	byte[] cond31 = convertChar2EbcdicBytes("9".toCharArray());
	byte[] cond32 = convertChar2EbcdicBytes("2 ".toCharArray());
	byte[] cond33 = convertChar2EbcdicBytes("0210".toCharArray());
	byte[] cond34 = convertChar2EbcdicBytes("0210".toCharArray());
	byte[] cond41 = convertChar2EbcdicBytes("C".toCharArray());
    private String filePath = "";
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
	    useSortTempFile(sortDetail.getTempFileVal());

		sortOut0.open("w", filePath + sortOut0.getFileName(), sortOut0.getRecordLen(), sortOut0.isFBRec());  
		sortOut1.open("w", filePath + sortOut1.getFileName(), sortOut1.getRecordLen(), sortOut1.isFBRec());  
		sortOut2.open("w", filePath + sortOut2.getFileName(), sortOut2.getRecordLen(), sortOut2.isFBRec());  
		sortOut3.open("w", filePath + sortOut3.getFileName(), sortOut3.getRecordLen(), sortOut3.isFBRec());  
		sortOut4.open("w", filePath + sortOut4.getFileName(), sortOut4.getRecordLen(), sortOut4.isFBRec());  
		if (isWriteInTempFile()) {
            this.setRaFile(sortDetail.getRaFile());
            this.setTmpFile(sortDetail.getTempFile());
            this.setExecutorService(sortDetail.getExecutorService());
		} else {
		    createRandomAccessFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<McsfsortSort004Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getSortedRecord(i);
		  if ((Field.compareByte(outRecBytes[0],(byte)0xF9) != 0) && (Field.compareByte(outRecBytes[0],(byte)0xE9) != 0) && (Field.compareByte(outRecBytes[0],(byte)0xC3) != 0)) {
		  
                  
		    //write into sortOut0 file
		 	sortOut0.setRecord(outRecBytes, sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareByte(outRecBytes[0],(byte)0xF9) != 0) && (Field.compareByte(outRecBytes[0],(byte)0xE9) != 0) && (Field.compareByte(outRecBytes[0],(byte)0xC3) != 0)) {
		  
                  
		    //write into sortOut1 file
		 	sortOut1.setRecord(outRecBytes, sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
		  if ((Field.compareBytes(outRecBytes,cond21,0,0,1,1) == 0) || (Field.compareBytes(outRecBytes,cond22,0,0,1,1) == 0)) {
		  
                  
		    //write into sortOut2 file
		 	sortOut2.setRecord(outRecBytes, sortOut2.getRecordLen());
		 	
			sortOut2.write(); recordCount2++;
		  }	
		  if ((Field.compareBytes(outRecBytes,cond31,0,0,1,1) == 0) && (Field.compareBytes(outRecBytes,cond32,1,0,2,2) == 0) && ((Field.compareBytes(outRecBytes,cond33,68,0,4,4) == 0) || (Field.compareBytes(outRecBytes,cond34,87,0,4,4) == 0))) {
		  
                  
		    //write into sortOut3 file
		 	sortOut3.setRecord(outRecBytes, sortOut3.getRecordLen());
		 	
			sortOut3.write(); recordCount3++;
		  }	
		  if ((Field.compareBytes(outRecBytes,cond41,0,0,1,1) == 0)) {
		  
                  
		    //write into sortOut4 file
		 	sortOut4.setRecord(outRecBytes, sortOut4.getRecordLen());
		 	
			sortOut4.write(); recordCount4++;
		  }	
        }

		cfStepHandler.updateSortStepExecution("sort004");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {

         logger.info("STEPNAME: MCSFSORTSORT004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCSFSORTSORT004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MCSFSORTSORT004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
         sortOut2.close();
         logger.info("STEPNAME: MCSFSORTSORT004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount3);
         sortOut3.close();
         logger.info("STEPNAME: MCSFSORTSORT004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount4);
         sortOut4.close();
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
			McsfsortSort004Keys k = sortRecKeys.get(index);
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

	  
	  
	  
	  	
}
