package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import java.math.BigDecimal;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.Ice002P030_16SortIn;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.sort.file.Ice002P030_16SortIn;
import java.util.stream.Collectors;
import com.cloudframe.app.utility.ByteUtil;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.records.Ice002P030_16Keys;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Ice002P030_16Detail;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.Ice002P030_16SortOut;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class Ice002P030_16Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Ice002P030_16Sort.class);
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

	List<Ice002P030_16Keys> sortRecKeys = null;
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_LEN0 = 3;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
		initializeSort();
	try {
	   processRead();
       sortProcessor();
	} catch (Exception e) {
	   logger.error("Error in SORT Process : {}", e.getMessage());
	}	
        		
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
		sortIn.close();
		logger.debug("Sort input Reader ended.");
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
	  
	  



	public void processRead() throws Exception {
		byte[] record = null;
		if(isUsingSortInFile())  setRecPos(0);	 
		record = sortIn.readRecord();					
		while (!sortIn.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn.readRecord();
		}
        sortDetail.setRecInCounter(recCounter);	
	}
	private void initializeSort() {
        this.setRecPos(0);
        this.setRecIndex(-1);
		this.recCounter = 0;
        useSortTempFile(useTempFile);
        sortDetail.setTempFileVal(useTempFile);
        if (isWriteInTempFile()) {
	        doSortPresets();
	        this.getWriteCounter().set(0);
	        sortDetail.setWriteCounter(this.getWriteCounter());
	        sortDetail.setSortFile(this.getRaFile());
	        sortDetail.setTempFile(this.getTmpFile());
	        sortDetail.setExecutorService(this.getExecutorService());
        }
	}
	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<Ice002P030_16Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Ice002P030_16Keys relKey = new Ice002P030_16Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
		sortRecKeys.add(relKey);
        if (isWriteInTempFile()) {
            setRecPos(getRecPos() + byteLen); /* next record position in tempFile */
            writeToTempFile(recordByte);
        }
	}
	/**
	 * This Method is used to add sort record with COND
	 * @param
	 */	
    protected void addSortRecordBytes(byte[] record){ 
         addRecordBytes4Sorting(record,record.length);
    }
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   Ice002P030_16Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<Ice002P030_16Keys> sortComp = sortDetail.getSortComp();

		List<Ice002P030_16Keys> sortRecKeys = sortDetail.getSortRecKeys();
        sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());  
        sortDetail.setSortRecKeys(sortRecKeys);	      
		if(isWriteInTempFile()) {
            // Make sure the input file is fully loaded
            boolean isCountMatches = true;
            this.setWriteCounter(sortDetail.getWriteCounter());
               int recordKeyCount = sortRecKeys.size();
               while (isCountMatches) { 
                   isCountMatches = recordKeyCount != getWriteCounter().get();

            }
        }                	
		logger.debug("Sort Processor ended.");
	}
}
