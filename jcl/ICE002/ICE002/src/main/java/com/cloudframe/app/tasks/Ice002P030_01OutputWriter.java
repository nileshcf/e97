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
import com.cloudframe.app.sort.file.Ice002P030_01SortIn;
import com.cloudframe.app.sort.file.Ice002P030_01SortOut;
import com.cloudframe.app.sort.file.records.Ice002P030_01Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Ice002P030_01Detail;
import com.cloudframe.app.data.Field;
public class Ice002P030_01OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Ice002P030_01OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_ice002p030_01")
	Ice002P030_01Detail sortDetail;
	
	@Autowired
	@Qualifier("Ice002P030_01SortOut")
	Ice002P030_01SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Ice002P030_01SortIn")
	Ice002P030_01SortIn sortIn;
	
	
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

	List<Ice002P030_01Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  addSumRecord(i);					
        }

		if(sumRec!=null) writeSumOut(sumRec);
		cfStepHandler.updateSortStepExecution("p030_01");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: ICE002P030_01 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
	Ice002P030_01Keys sortKey = null;
	int sortKey1Len = 41;
	int sumKey1Pos = 42;
	int sumKey1Len = 8;
	private void addSumRecord(int index) throws Exception {
		try {
			Ice002P030_01Keys recKey = sortRecKeys.get(index);
			byte[] recBytes = null;
				recBytes = readFromBuffer(recKey.getSortRecPos(), recKey.getSortRecLen()); 
			if (sumRec == null) {
				setSumRecord(recKey, recBytes);
			} else {
				// check SumRec keys and fetched record keys
				if(				
				(Field.compareBytes(sortKey.getKeyBinary1(), recKey.getKeyBinary1(), 0, 0, sortKey1Len, sortKey1Len) == 0)
				) {				
					BigDecimal sumKey1Val = addZoneDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					if(sumKey1Val.precision()<=sumKey1Len) {				
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey1Val.toString(),sumKey1Len),sumRec,0,sumKey1Pos, sumKey1Len);
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
	
  private void setSumRecord(Ice002P030_01Keys key, byte[] recBytes) {
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
