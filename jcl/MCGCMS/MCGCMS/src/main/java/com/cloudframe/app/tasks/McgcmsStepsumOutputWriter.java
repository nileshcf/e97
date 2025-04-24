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
import java.math.BigDecimal;
import com.cloudframe.app.utility.ByteUtil;
import com.cloudframe.app.exception.CFException;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.sort.file.McgcmsStepsumSortIn;
import com.cloudframe.app.sort.file.McgcmsStepsumSortOut;
import com.cloudframe.app.sort.file.records.McgcmsStepsumKeys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsStepsumDetail;
import com.cloudframe.app.data.Field;
public class McgcmsStepsumOutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsStepsumOutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmsstepsum")
	McgcmsStepsumDetail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsStepsumSortOut")
	McgcmsStepsumSortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsStepsumSortIn")
	McgcmsStepsumSortIn sortIn;
	
	
    int recordCount = 0;



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

	List<McgcmsStepsumKeys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  addSumRecord(i);					
        }

		if(sumRec!=null) writeSumOut(sumRec);
		cfStepHandler.updateSortStepExecution("stepsum");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: MCGCMSSTEPSUM Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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

    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }

	  
	byte[] sumRec = null;
	McgcmsStepsumKeys sortKey = null;
	int sortKey1Len = 7;
	int sortKey2Len = 11;
	int sortKey3Len = 2;
	int sortKey4Len = 4;
	int sortKey5Len = 3;
	int sumKey1Pos = 27;
	int sumKey1Len = 8;
	private void addSumRecord(int index) throws Exception {
		try {
			McgcmsStepsumKeys recKey = sortRecKeys.get(index);
			byte[] recBytes = null;
				recBytes = readFromBuffer(recKey.getSortRecPos(), recKey.getSortRecLen()); 
			if (sumRec == null) {
				setSumRecord(recKey, recBytes);
			} else {
				// check SumRec keys and fetched record keys
				if(				
				(Field.compareBytes(sortKey.getKeyCharacter1(), recKey.getKeyCharacter1(), 0, 0, sortKey1Len, sortKey1Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter2(), recKey.getKeyCharacter2(), 0, 0, sortKey2Len, sortKey2Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter3(), recKey.getKeyCharacter3(), 0, 0, sortKey3Len, sortKey3Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter4(), recKey.getKeyCharacter4(), 0, 0, sortKey4Len, sortKey4Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter5(), recKey.getKeyCharacter5(), 0, 0, sortKey5Len, sortKey5Len) == 0)
				) {				
					byte[] sumKey1Val = addBinaryDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					if(sumKey1Val.length <= sumKey1Len) {				
					    copyRecordBytes(sumKey1Val,sumRec,0,sumKey1Pos, sumKey1Len);
					} else {
						writeSumOut(sumRec);	/* overflow	*/					
						setSumRecord(recKey, recBytes);	/* reset sum Record value */
					}					
				} else {
					writeSumOut(sumRec); /* record key not matches */					
					setSumRecord(recKey, recBytes); /* reset sum Record value */
				}
			}
		} catch (Exception e) {
			logger.error("Error in sum record : {}", e.getMessage());
		}
	}
	
  private void setSumRecord(McgcmsStepsumKeys key, byte[] recBytes) {
	sumRec = new byte[key.getSortRecLen()];
	copyRecordBytes(recBytes,sumRec,0,0,key.getSortRecLen());
	sortKey = key;
  }
 

  private void writeSumOut(byte[] outRecBytes) throws CFException{
	  sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
      sortOut.write();
      recordCount++;
  }
	  
	  	
}
