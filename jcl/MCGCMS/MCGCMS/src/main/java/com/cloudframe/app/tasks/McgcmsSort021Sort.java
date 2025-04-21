package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import java.math.BigDecimal;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.McgcmsSort021SortIn0;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.McgcmsSort021SortOut;
import java.io.File;
import com.cloudframe.app.sort.file.records.McgcmsSort021Keys;
import com.cloudframe.app.exception.CFException;
import java.util.stream.Collectors;
import com.cloudframe.app.utility.ByteUtil;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.McgcmsSort021Detail;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import com.cloudframe.app.sort.file.McgcmsSort021SortIn1;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.file.McgcmsSort021SortIn0;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays; 
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.file.McgcmsSort021SortIn1;
public class McgcmsSort021Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort021Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort021")
	McgcmsSort021Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort021SortOut")
	McgcmsSort021SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort021SortIn0")
	McgcmsSort021SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort021SortIn1")
	McgcmsSort021SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;



    private String filePath = "";

	List<McgcmsSort021Keys> sortRecKeys = null;
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

    int fileIndx = 1;
    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_LEN0 = 17;
	final int INREC_POS1=222;
	final int INREC_POS2=0;
	final int INREC_POS3=74;
	final int INREC_POS4=75;
	final int INREC_POS5=106;
	final int INREC_POS6=0;
	final int INREC_POS7=107;
	final int INREC_POS8=140;
	final int INREC_LEN1=11;
	final int INREC_LEN2=1;
	final int INREC_LEN3=1;
	final int INREC_LEN4=3;
	final int INREC_LEN5=1;
	final int INREC_LEN6=1;
	final int INREC_LEN7=11;
	final int INREC_LEN8=6;
	final int INREC_DES_POS1=0;
	final int INREC_DES_POS2=6;
	final int INREC_DES_POS3=7;
	final int INREC_DES_POS4=8;
	final int INREC_DES_POS5=15;
	final int INREC_DES_POS6=16;
	final int INREC_DES_POS7=17;
	final int INREC_DES_POS8=28;
     byte[] filter1 = convertChar2EbcdicBytes("02".toCharArray());
     byte[] filter2 = convertChar2EbcdicBytes("03".toCharArray());
    byte[] changeCond0 = convertChar2EbcdicBytes("X".toCharArray());
    byte[] changeVal0 = convertChar2EbcdicBytes("XSIF".toCharArray());
    byte[] noMatchVal2 = convertChar2EbcdicBytes("SIF ".toCharArray());
    final byte[] repBytes = convertChar2EbcdicBytes("M".toCharArray());
    final byte[] repBytes1 = convertChar2EbcdicBytes("R".toCharArray());
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		useTempFile = sortDetail.useTempFile(true); 
		sortIn0.open("r", sortIn0.getFileName(), sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortIn1.open("r", sortIn1.getFileName(), sortIn1.getRecordLen(), sortIn1.isFBRec());
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
            configMemMapFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        if (isWriteInTempFile()) doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  addSumRecord(i);					
        }

		if(sumRec!=null) writeSumOut(sumRec);
		cfStepHandler.updateSortStepExecution("sort021");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn0.close();
		sortIn1.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCGCMSSORT021 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

		sortRecKeys.clear();
		if(isWriteInTempFile()) {
			stopExecutorServ();
			removeTempFile();
		} else 
		    clearMemMapFiles();
		logger.debug("Sort Writer ended.");
		SpringContextHandler.handleDispPostionAtStepEnd(true);
		return ExitStatus.COMPLETED;
	}



    private void configMemMapFile() {
	    try {
		    // File 0
		    raFile0 = new RandomAccessFile(new File(filePath + sortIn0.getFileName()), "rw");

		    // File 1
		    raFile1 = new RandomAccessFile(new File(filePath + sortIn1.getFileName()), "rw");

	    } catch (FileNotFoundException e) {
		    logger.error("Error access on file - Exception: {} ", e.getMessage());
		}    
	}
    protected byte[] readFromBuffer(long offSet, int dataLen, int fileInID)  throws IOException {
	    byte[] data = new byte[dataLen];
	    switch (fileInID) {
	        case 0:// File 0
				   raFile0.seek(offSet);	// Record Position
	               raFile0.read(data);	// read record
                break;
	        case 1:// File 1
				   raFile1.seek(offSet);	// Record Position
	               raFile1.read(data);	// read record
                break;
	        default:
		        break;
	    }
	    return data;
    }

    protected void clearMemMapFiles() {
	    try {
		    raFile0.close();
		    raFile1.close();
	    } catch (IOException e) {
		   logger.error("Error: Handling Memory Map file - Exception: {} ", e.getMessage());
	    }
	}
	  
	byte[] sumRec = null;
	McgcmsSort021Keys sortKey = null;
	int sortKey1Len = 17;
	int sumKey1Pos = 17;
	int sumKey1Len = 11;
	int sumKey1MaxPrec = (sumKey1Len-1)*2 +1;
	int sumKey2Pos = 28;
	int sumKey2Len = 6;
	int sumKey2MaxPrec = (sumKey2Len-1)*2 +1;
	private void addSumRecord(int index) throws Exception {
		try {
			McgcmsSort021Keys recKey = sortRecKeys.get(index);
			byte[] recBytes = null;
			if(isWriteInTempFile())
				recBytes = readFromBuffer(recKey.getSortRecPos(), recKey.getSortRecLen());			
			else
				recBytes = readFromBuffer(recKey.getSortRecPos(), recKey.getSortRecLen(),recKey.getFileIndx()); 
			if (sumRec == null) {
				setSumRecord(recKey, recBytes);
			} else {
				// check SumRec keys and fetched record keys
				if(				
				(Field.compareBytes(sortKey.getKeyCharacter1(), recKey.getKeyCharacter1(), 0, 0, sortKey1Len, sortKey1Len) == 0)
				) {				
					BigDecimal sumKey1Val = addPackDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					BigDecimal sumKey2Val = addPackDecimalBytes(sumRec, sumKey2Pos, recBytes,sumKey2Pos, sumKey2Len);
					if(sumKey1Val.precision()<=sumKey1MaxPrec && sumKey2Val.precision()<=sumKey2MaxPrec) {				
						ByteUtil.putPackedDecimalBigDecimal(sumKey1Val, sumRec, sumKey1Pos, sumKey1Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey2Val, sumRec, sumKey2Pos, sumKey2Len, true);
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
	
  private void setSumRecord(McgcmsSort021Keys key, byte[] recBytes) {
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
		if(isUsingSortInFile())  setRecPos(0); fileIndx=0;	 
		record = sortIn0.readRecord();					
		while (!sortIn0.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn0.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=1;	 
		record = sortIn1.readRecord();					
		while (!sortIn1.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn1.readRecord();
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
		List<McgcmsSort021Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort021Keys relKey = new McgcmsSort021Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
        relKey.setFileIndx(fileIndx);
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
	   if(((Field.compareBytes(record,filter1,146,0,2,2) == 0) || (Field.compareBytes(record,filter2,146,0,2,2) == 0))) {
        byte[] inrec = getInrecRecord(record);
    	addRecordBytes4Sorting(inrec, inrec.length);
	   }
    }
    private byte[] getInrecRecord(byte[] record) {  
	    byte[] recBytes = new byte[34];	 	
	    copyToRecordFormatBytes(record, recBytes, INREC_POS1, INREC_DES_POS1,INREC_LEN1,"ZD","PD",false);
copyRecordBytes(repBytes, recBytes, INREC_POS2,INREC_DES_POS2,INREC_LEN2);
copyRecordBytes(record, recBytes, INREC_POS3, INREC_DES_POS3,INREC_LEN3);
copyRecordBytes(record, recBytes, INREC_POS4, INREC_DES_POS4,INREC_LEN4);
setChangeBytes(record,recBytes,11,0/*caseId*/);
copyRecordBytes(record, recBytes, INREC_POS5, INREC_DES_POS5,INREC_LEN5);
copyRecordBytes(repBytes1, recBytes, INREC_POS6,INREC_DES_POS6,INREC_LEN6);
copyRecordBytes(record, recBytes, INREC_POS7, INREC_DES_POS7,INREC_LEN7);
copyRecordBytes(record, recBytes, INREC_POS8, INREC_DES_POS8,INREC_LEN8);
	
	    return recBytes;
  	}
	private void setChangeBytes(byte[] record,byte[] recBytes,int pos, int changeId) {
              if (Field.compareBytes(record, changeCond0,233, 0,1,1) == 0) {
                copyRecordBytes(changeVal0, recBytes, 0, pos,4);
              } else {
                copyRecordBytes(noMatchVal2,recBytes, 0,  pos,4);
              } 
	}	
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   McgcmsSort021Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<McgcmsSort021Keys> sortComp = sortDetail.getSortComp();

		List<McgcmsSort021Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
