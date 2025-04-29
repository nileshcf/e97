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
import com.cloudframe.app.sort.file.McgcmsSort020SortIn;
import com.cloudframe.app.sort.file.McgcmsSort020SortOut;
import com.cloudframe.app.sort.file.records.McgcmsSort020Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort020Detail;
import com.cloudframe.app.data.Field;
public class McgcmsSort020OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort020OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort020")
	McgcmsSort020Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort020SortOut")
	McgcmsSort020SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort020SortIn")
	McgcmsSort020SortIn sortIn;
	
	
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

	List<McgcmsSort020Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  addSumRecord(i);					
        }

		if(sumRec!=null) writeSumOut(sumRec);
		cfStepHandler.updateSortStepExecution("sort020");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: MCGCMSSORT020 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
	McgcmsSort020Keys sortKey = null;
	int sortKey1Len = 103;
	int sortKey2Len = 103;
	int sortKey3Len = 3;
	int sortKey4Len = 7;
	int sortKey5Len = 2;
	int sortKey6Len = 7;
	int sortKey7Len = 2;
	int sumKey1Pos = 364;
	int sumKey1Len = 11;
	int sumKey1MaxPrec = (sumKey1Len-1)*2 +1;
	int sumKey2Pos = 375;
	int sumKey2Len = 11;
	int sumKey2MaxPrec = (sumKey2Len-1)*2 +1;
	int sumKey3Pos = 386;
	int sumKey3Len = 11;
	int sumKey3MaxPrec = (sumKey3Len-1)*2 +1;
	int sumKey4Pos = 397;
	int sumKey4Len = 11;
	int sumKey4MaxPrec = (sumKey4Len-1)*2 +1;
	int sumKey5Pos = 408;
	int sumKey5Len = 11;
	int sumKey5MaxPrec = (sumKey5Len-1)*2 +1;
	int sumKey6Pos = 419;
	int sumKey6Len = 11;
	int sumKey6MaxPrec = (sumKey6Len-1)*2 +1;
	int sumKey7Pos = 430;
	int sumKey7Len = 6;
	int sumKey7MaxPrec = (sumKey7Len-1)*2 +1;
	int sumKey8Pos = 436;
	int sumKey8Len = 11;
	int sumKey8MaxPrec = (sumKey8Len-1)*2 +1;
	int sumKey9Pos = 447;
	int sumKey9Len = 11;
	int sumKey9MaxPrec = (sumKey9Len-1)*2 +1;
	int sumKey10Pos = 458;
	int sumKey10Len = 11;
	int sumKey10MaxPrec = (sumKey10Len-1)*2 +1;
	int sumKey11Pos = 469;
	int sumKey11Len = 11;
	int sumKey11MaxPrec = (sumKey11Len-1)*2 +1;
	int sumKey12Pos = 480;
	int sumKey12Len = 11;
	int sumKey12MaxPrec = (sumKey12Len-1)*2 +1;
	int sumKey13Pos = 491;
	int sumKey13Len = 11;
	int sumKey13MaxPrec = (sumKey13Len-1)*2 +1;
	int sumKey14Pos = 502;
	int sumKey14Len = 6;
	int sumKey14MaxPrec = (sumKey14Len-1)*2 +1;
	private void addSumRecord(int index) throws Exception {
		try {
			McgcmsSort020Keys recKey = sortRecKeys.get(index);
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
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter6(), recKey.getKeyCharacter6(), 0, 0, sortKey6Len, sortKey6Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter7(), recKey.getKeyCharacter7(), 0, 0, sortKey7Len, sortKey7Len) == 0)
				) {				
					BigDecimal sumKey1Val = addPackDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					BigDecimal sumKey2Val = addPackDecimalBytes(sumRec, sumKey2Pos, recBytes,sumKey2Pos, sumKey2Len);
					BigDecimal sumKey3Val = addPackDecimalBytes(sumRec, sumKey3Pos, recBytes,sumKey3Pos, sumKey3Len);
					BigDecimal sumKey4Val = addPackDecimalBytes(sumRec, sumKey4Pos, recBytes,sumKey4Pos, sumKey4Len);
					BigDecimal sumKey5Val = addPackDecimalBytes(sumRec, sumKey5Pos, recBytes,sumKey5Pos, sumKey5Len);
					BigDecimal sumKey6Val = addPackDecimalBytes(sumRec, sumKey6Pos, recBytes,sumKey6Pos, sumKey6Len);
					BigDecimal sumKey7Val = addPackDecimalBytes(sumRec, sumKey7Pos, recBytes,sumKey7Pos, sumKey7Len);
					BigDecimal sumKey8Val = addPackDecimalBytes(sumRec, sumKey8Pos, recBytes,sumKey8Pos, sumKey8Len);
					BigDecimal sumKey9Val = addPackDecimalBytes(sumRec, sumKey9Pos, recBytes,sumKey9Pos, sumKey9Len);
					BigDecimal sumKey10Val = addPackDecimalBytes(sumRec, sumKey10Pos, recBytes,sumKey10Pos, sumKey10Len);
					BigDecimal sumKey11Val = addPackDecimalBytes(sumRec, sumKey11Pos, recBytes,sumKey11Pos, sumKey11Len);
					BigDecimal sumKey12Val = addPackDecimalBytes(sumRec, sumKey12Pos, recBytes,sumKey12Pos, sumKey12Len);
					BigDecimal sumKey13Val = addPackDecimalBytes(sumRec, sumKey13Pos, recBytes,sumKey13Pos, sumKey13Len);
					BigDecimal sumKey14Val = addPackDecimalBytes(sumRec, sumKey14Pos, recBytes,sumKey14Pos, sumKey14Len);
					if(sumKey1Val.precision()<=sumKey1MaxPrec && sumKey2Val.precision()<=sumKey2MaxPrec && sumKey3Val.precision()<=sumKey3MaxPrec && sumKey4Val.precision()<=sumKey4MaxPrec && sumKey5Val.precision()<=sumKey5MaxPrec && sumKey6Val.precision()<=sumKey6MaxPrec && sumKey7Val.precision()<=sumKey7MaxPrec && sumKey8Val.precision()<=sumKey8MaxPrec && sumKey9Val.precision()<=sumKey9MaxPrec && sumKey10Val.precision()<=sumKey10MaxPrec && sumKey11Val.precision()<=sumKey11MaxPrec && sumKey12Val.precision()<=sumKey12MaxPrec && sumKey13Val.precision()<=sumKey13MaxPrec && sumKey14Val.precision()<=sumKey14MaxPrec) {				
						ByteUtil.putPackedDecimalBigDecimal(sumKey1Val, sumRec, sumKey1Pos, sumKey1Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey2Val, sumRec, sumKey2Pos, sumKey2Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey3Val, sumRec, sumKey3Pos, sumKey3Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey4Val, sumRec, sumKey4Pos, sumKey4Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey5Val, sumRec, sumKey5Pos, sumKey5Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey6Val, sumRec, sumKey6Pos, sumKey6Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey7Val, sumRec, sumKey7Pos, sumKey7Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey8Val, sumRec, sumKey8Pos, sumKey8Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey9Val, sumRec, sumKey9Pos, sumKey9Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey10Val, sumRec, sumKey10Pos, sumKey10Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey11Val, sumRec, sumKey11Pos, sumKey11Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey12Val, sumRec, sumKey12Pos, sumKey12Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey13Val, sumRec, sumKey13Pos, sumKey13Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey14Val, sumRec, sumKey14Pos, sumKey14Len, true);
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
	
  private void setSumRecord(McgcmsSort020Keys key, byte[] recBytes) {
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
