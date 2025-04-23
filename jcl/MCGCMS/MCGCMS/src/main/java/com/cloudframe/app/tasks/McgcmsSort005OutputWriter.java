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
import com.cloudframe.app.sort.file.McgcmsSort005SortIn;
import com.cloudframe.app.sort.file.McgcmsSort005SortOut;
import com.cloudframe.app.sort.file.records.McgcmsSort005Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort005Detail;
public class McgcmsSort005OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort005OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort005")
	McgcmsSort005Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort005SortOut")
	McgcmsSort005SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort005SortIn")
	McgcmsSort005SortIn sortIn;
	
	
    int recordCount = 0;


    static final int OUTREC_SIZE = 62;    
	int recordLen = 0;
	


    final byte[] fillBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes3 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));


	static final int OUTREC_POS1=68;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=43;
	static final int OUTREC_POS4=0;
	static final int OUTREC_POS5=54;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=58;
	static final int OUTREC_POS8=0;
	static final int OUTREC_POS9=70;
	static final int OUTREC_LEN1=1;
	static final int OUTREC_LEN2=1;
	static final int OUTREC_LEN3=7;
	static final int OUTREC_LEN4=1;
	static final int OUTREC_LEN5=4;
	static final int OUTREC_LEN6=1;
	static final int OUTREC_LEN7=10;
	static final int OUTREC_LEN8=1;
	static final int OUTREC_LEN9=10;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=1;
	static final int OUTREC_DES_POS3=2;
	static final int OUTREC_DES_POS4=9;
	static final int OUTREC_DES_POS5=10;
	static final int OUTREC_DES_POS6=20;
	static final int OUTREC_DES_POS7=21;
	static final int OUTREC_DES_POS8=41;
	static final int OUTREC_DES_POS9=42;
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

	List<McgcmsSort005Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getOutRecord(i); 
		  
		    		    
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
logger.info("STEPNAME: MCGCMSSORT005 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			McgcmsSort005Keys k = sortRecKeys.get(index);
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

	private byte[] getOutRecord(int i) {
  		byte[] record = getSortedRecord(i); 
	    recordLen = record.length;
		byte[] recBytes = new byte[recordLen];
			copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
             copyRecordBytes(fillBytes,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS4,OUTREC_DES_POS4,OUTREC_LEN4);
copyToRecordFormatBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5,"BI","ZD",false);
             copyRecordBytes(fillBytes2,recBytes,OUTREC_POS6,OUTREC_DES_POS6,OUTREC_LEN6);
copyHexRecordBytes(record, recBytes, OUTREC_POS7, OUTREC_DES_POS7,OUTREC_LEN7);
             copyRecordBytes(fillBytes3,recBytes,OUTREC_POS8,OUTREC_DES_POS8,OUTREC_LEN8);
copyHexRecordBytes(record, recBytes, OUTREC_POS9, OUTREC_DES_POS9,OUTREC_LEN9);

		return recBytes;
  	}  
	  
	  
	  
	  	
}
