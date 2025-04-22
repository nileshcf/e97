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
import com.cloudframe.app.sort.file.Ice002P030_16SortIn;
import com.cloudframe.app.sort.file.Ice002P030_16SortOut;
import com.cloudframe.app.sort.file.records.Ice002P030_16Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Ice002P030_16Detail;
import com.cloudframe.app.data.Field;
public class Ice002P030_16OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Ice002P030_16OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_ice002p030_16")
	Ice002P030_16Detail sortDetail;
	
	@Autowired
	@Qualifier("Ice002P030_16SortOut")
	Ice002P030_16SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Ice002P030_16SortIn")
	Ice002P030_16SortIn sortIn;
	
	
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

	List<Ice002P030_16Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  addSumRecord(i);					
        }

		if(sumRec!=null) writeSumOut(sumRec);
		cfStepHandler.updateSortStepExecution("p030_16");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: ICE002P030_16 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
	Ice002P030_16Keys sortKey = null;
	int sortKey1Len = 3;
	int sumKey1Pos = 4;
	int sumKey1Len = 8;
	int sumKey2Pos = 13;
	int sumKey2Len = 8;
	int sumKey3Pos = 22;
	int sumKey3Len = 8;
	int sumKey4Pos = 31;
	int sumKey4Len = 8;
	int sumKey5Pos = 40;
	int sumKey5Len = 8;
	int sumKey6Pos = 49;
	int sumKey6Len = 8;
	int sumKey7Pos = 58;
	int sumKey7Len = 8;
	private void addSumRecord(int index) throws Exception {
		try {
			Ice002P030_16Keys recKey = sortRecKeys.get(index);
			byte[] recBytes = null;
				recBytes = readFromBuffer(recKey.getSortRecPos(), recKey.getSortRecLen()); 
			if (sumRec == null) {
				setSumRecord(recKey, recBytes);
			} else {
				// check SumRec keys and fetched record keys
				if(				
				(Field.compareBytes(sortKey.getKeyCharacter1(), recKey.getKeyCharacter1(), 0, 0, sortKey1Len, sortKey1Len) == 0)
				) {				
					BigDecimal sumKey1Val = addZoneDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					BigDecimal sumKey2Val = addZoneDecimalBytes(sumRec, sumKey2Pos, recBytes,sumKey2Pos, sumKey2Len);
					BigDecimal sumKey3Val = addZoneDecimalBytes(sumRec, sumKey3Pos, recBytes,sumKey3Pos, sumKey3Len);
					BigDecimal sumKey4Val = addZoneDecimalBytes(sumRec, sumKey4Pos, recBytes,sumKey4Pos, sumKey4Len);
					BigDecimal sumKey5Val = addZoneDecimalBytes(sumRec, sumKey5Pos, recBytes,sumKey5Pos, sumKey5Len);
					BigDecimal sumKey6Val = addZoneDecimalBytes(sumRec, sumKey6Pos, recBytes,sumKey6Pos, sumKey6Len);
					BigDecimal sumKey7Val = addZoneDecimalBytes(sumRec, sumKey7Pos, recBytes,sumKey7Pos, sumKey7Len);
					if(sumKey1Val.precision()<=sumKey1Len && sumKey2Val.precision()<=sumKey2Len && sumKey3Val.precision()<=sumKey3Len && sumKey4Val.precision()<=sumKey4Len && sumKey5Val.precision()<=sumKey5Len && sumKey6Val.precision()<=sumKey6Len && sumKey7Val.precision()<=sumKey7Len) {				
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey1Val.toString(),sumKey1Len),sumRec,0,sumKey1Pos, sumKey1Len);
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey2Val.toString(),sumKey2Len),sumRec,0,sumKey2Pos, sumKey2Len);
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey3Val.toString(),sumKey3Len),sumRec,0,sumKey3Pos, sumKey3Len);
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey4Val.toString(),sumKey4Len),sumRec,0,sumKey4Pos, sumKey4Len);
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey5Val.toString(),sumKey5Len),sumRec,0,sumKey5Pos, sumKey5Len);
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey6Val.toString(),sumKey6Len),sumRec,0,sumKey6Pos, sumKey6Len);
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey7Val.toString(),sumKey7Len),sumRec,0,sumKey7Pos, sumKey7Len);
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
	
  private void setSumRecord(Ice002P030_16Keys key, byte[] recBytes) {
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
