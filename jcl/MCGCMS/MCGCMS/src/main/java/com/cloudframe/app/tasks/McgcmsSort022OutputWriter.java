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
import com.cloudframe.app.sort.file.McgcmsSort022SortIn;
import com.cloudframe.app.sort.file.McgcmsSort022SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort022SortOut1;
import com.cloudframe.app.sort.file.records.McgcmsSort022Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort022Detail;
import com.cloudframe.app.data.Field;
public class McgcmsSort022OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort022OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort022")
	McgcmsSort022Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort022SortOut0")
	McgcmsSort022SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort022SortOut1")
	McgcmsSort022SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("McgcmsSort022SortIn")
	McgcmsSort022SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;


    static final int OUTREC_SIZE = 394;    
	int recordLen = 0;
	


    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    static final int OUTREC_SIZE0 = 260;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    static final int OUTREC_SIZE1 = 394;


	byte[] sortof1Cond01 = convertChar2EbcdicBytes("D".toCharArray());
	byte[] sortof1Cond02 = convertChar2EbcdicBytes("11".toCharArray());
	byte[] sortof1Cond03 = convertChar2EbcdicBytes("0".toCharArray());
	byte[] sortof2Cond11 = convertChar2EbcdicBytes("P".toCharArray());
	byte[] sortof2Cond12 = convertChar2EbcdicBytes("11".toCharArray());
	byte[] sortof2Cond13 = convertChar2EbcdicBytes("0".toCharArray());
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_LEN1=260;
	static final int OUTREC_LEN2=394;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=0;
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
		    createRandomAccessFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<McgcmsSort022Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getSortedRecord(i); 
		  if ((Field.compareBytes(outRecBytes,sortof1Cond01,0,0,1,1) == 0) && (Field.compareBytes(outRecBytes,sortof1Cond02,53,0,2,2) != 0) && (Field.compareBytes(outRecBytes,sortof1Cond03,147,0,20,1) > 0)) {
                   
		    //write into sortOut0 file
		 	sortOut0.setRecord(getOutRecord(outRecBytes,0), sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof2Cond11,0,0,1,1) == 0) && (Field.compareBytes(outRecBytes,sortof2Cond12,53,0,2,2) != 0) && (Field.compareBytes(outRecBytes,sortof2Cond13,305,0,20,1) > 0)) {
                   
		    //write into sortOut1 file
		 	sortOut1.setRecord(getOutRecord(outRecBytes,1), sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
        }

		cfStepHandler.updateSortStepExecution("sort022");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {

         logger.info("STEPNAME: MCGCMSSORT022 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT022 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
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
			McgcmsSort022Keys k = sortRecKeys.get(index);
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

	private byte[] getOutRecord(byte[] record,int fileIndx) {
	    recordLen = record.length;
		byte[] recBytes = new byte[OUTREC_SIZE];
					switch(fileIndx) {
	case 0:
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
copyRecordBytes(record, recBytes, OUTREC_POS2, OUTREC_DES_POS2,OUTREC_LEN2);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	  
	  
	  	
}
