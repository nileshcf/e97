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
import com.cloudframe.app.sort.file.McgcmsSort018SortIn;
import com.cloudframe.app.sort.file.McgcmsSort018SortOut;
import com.cloudframe.app.sort.file.records.McgcmsSort018Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort018Detail;
import com.cloudframe.app.data.Field;
public class McgcmsSort018OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort018OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort018")
	McgcmsSort018Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort018SortOut")
	McgcmsSort018SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort018SortIn")
	McgcmsSort018SortIn sortIn;
	
	
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

	List<McgcmsSort018Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  addSumRecord(i);					
        }

		if(sumRec!=null) writeSumOut(sumRec);
		cfStepHandler.updateSortStepExecution("sort018");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: MCGCMSSORT018 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
	McgcmsSort018Keys sortKey = null;
	int sortKey1Len = 7;
	int sortKey2Len = 11;
	int sortKey3Len = 7;
	int sortKey4Len = 3;
	int sumKey1Pos = 57;
	int sumKey1Len = 13;
	int sumKey2Pos = 103;
	int sumKey2Len = 13;
	private void addSumRecord(int index) throws Exception {
		try {
			McgcmsSort018Keys recKey = sortRecKeys.get(index);
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
				) {				
					BigDecimal sumKey1Val = addZoneDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					BigDecimal sumKey2Val = addZoneDecimalBytes(sumRec, sumKey2Pos, recBytes,sumKey2Pos, sumKey2Len);
					if(sumKey1Val.precision()<=sumKey1Len && sumKey2Val.precision()<=sumKey2Len) {				
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey1Val.toString(),sumKey1Len),sumRec,0,sumKey1Pos, sumKey1Len);
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey2Val.toString(),sumKey2Len),sumRec,0,sumKey2Pos, sumKey2Len);
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
	
  private void setSumRecord(McgcmsSort018Keys key, byte[] recBytes) {
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
