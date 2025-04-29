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
import com.cloudframe.app.sort.file.TranSort007SortIn;
import com.cloudframe.app.sort.file.TranSort007SortOut;
import com.cloudframe.app.sort.file.records.TranSort007Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.TranSort007Detail;
import com.cloudframe.app.data.Field;
public class TranSort007OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(TranSort007OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_transort007")
	TranSort007Detail sortDetail;
	
	@Autowired
	@Qualifier("TranSort007SortOut")
	TranSort007SortOut sortOut;
	

	
	@Autowired
	@Qualifier("TranSort007SortIn")
	TranSort007SortIn sortIn;
	
	
    int recordCount = 0;



	final byte[] whenBytes00 = convertHexChar2Bytes("C1");
	final byte[] fillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
	final byte[] outrecBuildLtrl02 = convertChar2EbcdicBytes("***************".toCharArray());
	final byte[] fillBytes12 = convertChar2EbcdicBytes(CFUtil.fillSpaces(15));
	static final int BUILD_OUTREC_SIZE = 50;
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

	List<TranSort007Keys> sortRecKeys = null;

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

		cfStepHandler.updateSortStepExecution("sort007");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: TRANSORT007 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			TranSort007Keys k = sortRecKeys.get(index);
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
      byte[] buildRec = new byte[BUILD_OUTREC_SIZE]; 
      copyRecordBytes(fillBuildBytes, buildRec, 0, 0,BUILD_OUTREC_SIZE);
        if (Field.compareBytes(record, whenBytes00, 0, 0, 1, 1)  != 0) { 
copyRecordBytes(record, buildRec, 0,0,20);
copyTranslateEbcdic2Ascii(record, buildRec, 20,20,15); 
copyRecordBytes(outrecBuildLtrl02, buildRec, 0,35,15); 
 }else  { 
copyRecordBytes(record, buildRec, 0,0,20);
copyTranslateEbcdic2Ascii(record, buildRec, 20,20,15); 
copyRecordBytes(fillBytes12,buildRec,0,35,15);
 }
      return buildRec;
    }
	  
	  
	  
	  	
}
