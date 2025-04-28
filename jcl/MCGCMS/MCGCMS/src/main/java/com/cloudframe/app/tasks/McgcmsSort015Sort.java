package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import java.math.BigDecimal;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.McgcmsSort015Detail;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.exception.CFException;
import java.util.stream.Collectors;
import com.cloudframe.app.utility.ByteUtil;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.records.McgcmsSort015Keys;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import com.cloudframe.app.sort.file.McgcmsSort015SortOut0;
import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import com.cloudframe.app.sort.file.McgcmsSort015SortIn;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.file.McgcmsSort015SortIn;
import com.cloudframe.app.sort.file.McgcmsSort015SortOut1;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import java.util.Arrays; 
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class McgcmsSort015Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort015Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort015")
	McgcmsSort015Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort015SortOut0")
	McgcmsSort015SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort015SortOut1")
	McgcmsSort015SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("McgcmsSort015SortIn")
	McgcmsSort015SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;


    static final int OUTREC_SIZE = 23;    
	int recordLen = 0;
	


    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final int OUTREC_SIZE0 = 23;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    final byte[] fillBytes5 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes6 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final int OUTREC_SIZE1 = 23;


	byte[] sortof1Cond01 = convertChar2EbcdicBytes("C".toCharArray());
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=2;
	static final int OUTREC_POS4=0;
	static final int OUTREC_POS5=3;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=0;
	static final int OUTREC_POS8=2;
	static final int OUTREC_POS9=0;
	static final int OUTREC_POS10=3;
	static final int OUTREC_LEN1=2;
	static final int OUTREC_LEN2=1;
	static final int OUTREC_LEN3=1;
	static final int OUTREC_LEN4=1;
	static final int OUTREC_LEN5=18;
	static final int OUTREC_LEN6=2;
	static final int OUTREC_LEN7=1;
	static final int OUTREC_LEN8=1;
	static final int OUTREC_LEN9=1;
	static final int OUTREC_LEN10=18;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=2;
	static final int OUTREC_DES_POS3=3;
	static final int OUTREC_DES_POS4=4;
	static final int OUTREC_DES_POS5=5;
	static final int OUTREC_DES_POS6=0;
	static final int OUTREC_DES_POS7=2;
	static final int OUTREC_DES_POS8=3;
	static final int OUTREC_DES_POS9=4;
	static final int OUTREC_DES_POS10=5;
    private String filePath = "";

	List<McgcmsSort015Keys> sortRecKeys = null;
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    private String useTempFile="yes";

    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_POS1 = 2;
	static final int KEY_LEN0 = 2;
	static final int KEY_LEN1 = 1;
	final int INREC_POS1=19;
	final int INREC_POS2=33;
	final int INREC_POS3=0;
	final int INREC_LEN1=2;
	final int INREC_LEN2=1;
	final int INREC_LEN3=18;
	final int INREC_DES_POS1=0;
	final int INREC_DES_POS2=2;
	final int INREC_DES_POS3=3;
     byte[] filter1 = convertChar2EbcdicBytes("61".toCharArray());
     byte[] filter2 = convertChar2EbcdicBytes("62".toCharArray());
    final byte[] repBytes = convertChar2EbcdicBytes("000000000000000001".toCharArray());
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		useTempFile = sortDetail.useTempFile(true); 
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
		initializeSort();
	try {
	   processRead();
       sortProcessor();
	} catch (Exception e) {
	   logger.error("Error in SORT Process : {}", e.getMessage());
	}	
        		
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

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		executeSumOutRecords();

		cfStepHandler.updateSortStepExecution("sort015");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MCGCMSSORT015 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT015 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
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



    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }
	private byte[] getOutRecord(byte[] record, int fileIndx) {
  	 	byte[] recBytes = new byte[OUTREC_SIZE]; 
	    recordLen = record.length;
					switch(fileIndx) {
	case 0:
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
             copyRecordBytes(fillBytes2,recBytes,OUTREC_POS4,OUTREC_DES_POS4,OUTREC_LEN4);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
copyRecordBytes(record, recBytes, OUTREC_POS6, OUTREC_DES_POS6,OUTREC_LEN6);
             copyRecordBytes(fillBytes5,recBytes,OUTREC_POS7,OUTREC_DES_POS7,OUTREC_LEN7);
copyRecordBytes(record, recBytes, OUTREC_POS8, OUTREC_DES_POS8,OUTREC_LEN8);
             copyRecordBytes(fillBytes6,recBytes,OUTREC_POS9,OUTREC_DES_POS9,OUTREC_LEN9);
copyRecordBytes(record, recBytes, OUTREC_POS10, OUTREC_DES_POS10,OUTREC_LEN10);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	final int OUTFILE_COUNT = 2;
	byte[] sumRec = null;
	McgcmsSort015Keys sortKey = null;
	int sortKey1Len = 2;
	int sortKey2Len = 1;
	int sumKey1Pos = 3;
	int sumKey1Len = 18;
	private void addSumRecord(int index,int num) throws Exception {
		try {
			McgcmsSort015Keys recKey = sortRecKeys.get(index);
			byte[] recBytes = null;
				recBytes = readFromBuffer(recKey.getSortRecPos(), recKey.getSortRecLen()); 
			// Add Include or omit cases based on outrec Index
		    if(!validateSumRecord(recBytes, num)){
		    	return;
		    }
			if (sumRec == null) {
				setSumRecord(recKey, recBytes);
			} else {
				// check SumRec keys and fetched record keys
				if(				
				(Field.compareBytes(sortKey.getKeyCharacter1(), recKey.getKeyCharacter1(), 0, 0, sortKey1Len, sortKey1Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter2(), recKey.getKeyCharacter2(), 0, 0, sortKey2Len, sortKey2Len) == 0)
				) {				
					BigDecimal sumKey1Val = addZoneDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					if(sumKey1Val.precision()<=sumKey1Len) {
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey1Val.toString(),sumKey1Len),sumRec,0,sumKey1Pos, sumKey1Len);
					} else {
						writeSumOut(sumRec,num);	/* overflow	*/					
						setSumRecord(recKey, recBytes);	/* reset sum Record value */
					}
				} else {
					writeSumOut(sumRec,num); /* record key not matches */					
					setSumRecord(recKey, recBytes); /* reset sum Record value */
				}
			}
		} catch (Exception e) {
			logger.error("Error in sum record : {}", e.getMessage());
		}
	}
	
	private void executeSumOutRecords() throws Exception {
		for (int f=0; f<OUTFILE_COUNT;f++) {
			sumRec = null;
			for (int i = 0; i < sortRecKeys.size(); i++) {
				addSumRecord(i, f);
			}
			if(sumRec!=null) writeSumOut(sumRec, f);
		}
	}	
  	
    private void setSumRecord(McgcmsSort015Keys key, byte[] recBytes) {
	    sumRec = new byte[key.getSortRecLen()];
	    copyRecordBytes(recBytes,sumRec,0,0,key.getSortRecLen());
	    sortKey = key;
    }
 
  	private void writeSumOut(byte[] outRecBytes, int num) throws CFException {
  	    outRecBytes = getOutRecord(outRecBytes, num);
		switch(num){
		case 0:		
			sortOut0.setRecord(outRecBytes, sortOut0.getRecordLen());
			sortOut0.write();
			recordCount0++;
			break;
		case 1:		
			sortOut1.setRecord(outRecBytes, sortOut1.getRecordLen());
			sortOut1.write();
			recordCount1++;
			break;
		default:
			break;
		}
	}
	
	private boolean validateSumRecord(byte[] outRecBytes,int num){
		boolean isValid = false;
		switch(num){
			case 0:			
		  if ((Field.compareBytes(outRecBytes,sortof1Cond01,2,0,1,1) == 0)) {  isValid = true; }
		  break;
			case 1:			
		  if (!((Field.compareBytes(outRecBytes,sortof1Cond01,2,0,1,1) == 0))) {  isValid = true; }
		  break;
		default:
			break;  		
		}
		return isValid; 
	}
	  
	  



	public void processRead() throws Exception {
		byte[] record = null;
		if(isUsingSortInFile())  setRecPos(0);	 
		record = sortIn.readRecord();					
		while (!sortIn.hasEnded() && record != null) {
			if(isUsingSortInFile()) setRecPos(getRecPos()+4);  /* Variable record data start position */
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
		List<McgcmsSort015Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort015Keys relKey = new McgcmsSort015Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
        relKey.setKeyCharacter2(getRecordKeyBytes(recordByte, KEY_POS1 , KEY_LEN1)); 
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
	   if(((Field.compareBytes(record,filter1,19,0,2,2) == 0) || (Field.compareBytes(record,filter2,19,0,2,2) == 0))) {
        byte[] inrec = getInrecRecord(record);
    	addRecordBytes4Sorting(inrec, inrec.length);
	   }
    }
    private byte[] getInrecRecord(byte[] record) {  
	    byte[] recBytes = new byte[21];	 	
	    copyRecordBytes(record, recBytes, INREC_POS1, INREC_DES_POS1,INREC_LEN1);
copyRecordBytes(record, recBytes, INREC_POS2, INREC_DES_POS2,INREC_LEN2);
copyRecordBytes(repBytes, recBytes, INREC_POS3,INREC_DES_POS3,INREC_LEN3);
	
	    return recBytes;
  	}
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   McgcmsSort015Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(McgcmsSort015Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<McgcmsSort015Keys> sortComp = sortDetail.getSortComp();

		List<McgcmsSort015Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
