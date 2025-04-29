package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import java.math.BigDecimal;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.records.McgcmsSort004Keys;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.exception.CFException;
import java.util.stream.Collectors;
import com.cloudframe.app.utility.ByteUtil;
import com.cloudframe.app.data.Field;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import com.cloudframe.app.sort.McgcmsSort004Detail;
import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.McgcmsSort004SortOut;
import java.io.FileNotFoundException;
import com.cloudframe.app.sort.file.McgcmsSort004SortIn;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.file.McgcmsSort004SortIn;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class McgcmsSort004Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort004Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort004")
	McgcmsSort004Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort004SortOut")
	McgcmsSort004SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort004SortIn")
	McgcmsSort004SortIn sortIn;
	
	
    int recordCount = 0;


    static final int OUTREC_SIZE = 264;    
	int recordLen = 0;
	

	byte[] repBytes = convertChar2EbcdicBytes("R".toCharArray());
	byte[] repBytes1 = convertChar2EbcdicBytes("R".toCharArray());
	byte[] repBytes2 = convertChar2EbcdicBytes("R".toCharArray());



	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=40;
	static final int OUTREC_POS3=112;
	static final int OUTREC_POS4=123;
	static final int OUTREC_POS5=138;
	static final int OUTREC_POS6=123;
	static final int OUTREC_POS7=0;
	static final int OUTREC_POS8=170;
	static final int OUTREC_POS9=185;
	static final int OUTREC_POS10=170;
	static final int OUTREC_POS11=0;
	static final int OUTREC_POS12=217;
	static final int OUTREC_POS13=232;
	static final int OUTREC_POS14=217;
	static final int OUTREC_POS15=0;
	static final int OUTREC_LEN1=40;
	static final int OUTREC_LEN2=72;
	static final int OUTREC_LEN3=11;
	static final int OUTREC_LEN4=15;
	static final int OUTREC_LEN5=15;
	static final int OUTREC_LEN6=15;
	static final int OUTREC_LEN7=1;
	static final int OUTREC_LEN8=15;
	static final int OUTREC_LEN9=15;
	static final int OUTREC_LEN10=15;
	static final int OUTREC_LEN11=1;
	static final int OUTREC_LEN12=15;
	static final int OUTREC_LEN13=15;
	static final int OUTREC_LEN14=15;
	static final int OUTREC_LEN15=1;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=40;
	static final int OUTREC_DES_POS3=112;
	static final int OUTREC_DES_POS4=123;
	static final int OUTREC_DES_POS5=138;
	static final int OUTREC_DES_POS6=153;
	static final int OUTREC_DES_POS7=169;
	static final int OUTREC_DES_POS8=170;
	static final int OUTREC_DES_POS9=185;
	static final int OUTREC_DES_POS10=200;
	static final int OUTREC_DES_POS11=216;
	static final int OUTREC_DES_POS12=217;
	static final int OUTREC_DES_POS13=232;
	static final int OUTREC_DES_POS14=247;
	static final int OUTREC_DES_POS15=263;
	static final int ARITHMETIC_POS1= 123;
	static final int ARITHMETIC_LEN1= 15;
	static final int CONVERT_LENGTH1= 15;
	static final int ARITHMETIC_POS1_1= 138;
	static final int ARITHMETIC_LEN1_1= 15;
	static final int ARITHMETIC_OPERAND_VAL1_1= -1;
	static final int ARITHMETIC_POS2= 170;
	static final int ARITHMETIC_LEN2= 15;
	static final int CONVERT_LENGTH2= 15;
	static final int ARITHMETIC_POS2_1= 185;
	static final int ARITHMETIC_LEN2_1= 15;
	static final int ARITHMETIC_OPERAND_VAL2_1= -1;
	static final int ARITHMETIC_POS3= 217;
	static final int ARITHMETIC_LEN3= 15;
	static final int CONVERT_LENGTH3= 15;
	static final int ARITHMETIC_POS3_1= 232;
	static final int ARITHMETIC_LEN3_1= 15;
	static final int ARITHMETIC_OPERAND_VAL3_1= -1;
	static final String ARITHMETIC_FORMAT1= "ZD";
	static final String ARITHMETIC_EDIT1= "TTTTTTTTTTTTTTTS";
	static final String ARITHMETIC_SIGN1= ",D,C";
	static final String ARITHMETIC_FORMAT1_1= "ZD";
	static final String ARITHMETIC_FORMAT2= "ZD";
	static final String ARITHMETIC_EDIT2= "TTTTTTTTTTTTTTTS";
	static final String ARITHMETIC_SIGN2= ",D,C";
	static final String ARITHMETIC_FORMAT2_1= "ZD";
	static final String ARITHMETIC_FORMAT3= "ZD";
	static final String ARITHMETIC_EDIT3= "TTTTTTTTTTTTTTTS";
	static final String ARITHMETIC_SIGN3= ",D,C";
	static final String ARITHMETIC_FORMAT3_1= "ZD";
    private String filePath = "";

	List<McgcmsSort004Keys> sortRecKeys = null;
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
	static final int KEY_POS1 = 40;
	static final int KEY_LEN0 = 40;
	static final int KEY_LEN1 = 72;
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
		cfStepHandler.updateSortStepExecution("sort004");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCGCMSSORT004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
	private byte[] getOutRecord(byte[] record) {
  	 	byte[] recBytes = new byte[OUTREC_SIZE]; 
	    recordLen = record.length;
			copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
copyRecordBytes(record, recBytes, OUTREC_POS2, OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
copyRecordBytes(record, recBytes, OUTREC_POS4, OUTREC_DES_POS4,OUTREC_LEN4);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
copyArithmeticBytes1(record, recBytes, OUTREC_DES_POS6);
 copyRecordBytes(repBytes, recBytes, OUTREC_POS7,OUTREC_DES_POS7,OUTREC_LEN7);
copyRecordBytes(record, recBytes, OUTREC_POS8, OUTREC_DES_POS8,OUTREC_LEN8);
copyRecordBytes(record, recBytes, OUTREC_POS9, OUTREC_DES_POS9,OUTREC_LEN9);
copyArithmeticBytes2(record, recBytes, OUTREC_DES_POS10);
 copyRecordBytes(repBytes1, recBytes, OUTREC_POS11,OUTREC_DES_POS11,OUTREC_LEN11);
copyRecordBytes(record, recBytes, OUTREC_POS12, OUTREC_DES_POS12,OUTREC_LEN12);
copyRecordBytes(record, recBytes, OUTREC_POS13, OUTREC_DES_POS13,OUTREC_LEN13);
copyArithmeticBytes3(record, recBytes, OUTREC_DES_POS14);
 copyRecordBytes(repBytes2, recBytes, OUTREC_POS15,OUTREC_DES_POS15,OUTREC_LEN15);

		return recBytes;
  	}  
	
	    private void copyArithmeticBytes1(byte[] record,byte[] recBytes,int outrecDesPos) {
  BigDecimal big = subZoneDecimalBytes(record, ARITHMETIC_POS1, ARITHMETIC_POS1_1,  ARITHMETIC_LEN1, ARITHMETIC_LEN1_1);
  String decimalVal =  fillZeroFormatLength(big,16);
  decimalVal =  maskNumberFormatter(decimalVal, ARITHMETIC_EDIT1, ARITHMETIC_SIGN1);
  decimalVal =  fillSpaceFormatLength(decimalVal,16);
  byte[] copyArithmeticBytes = convertChar2EbcdicBytes(decimalVal.toCharArray());
   copyRecordBytes(copyArithmeticBytes,recBytes,  0, outrecDesPos,decimalVal.length());
}
	    private void copyArithmeticBytes2(byte[] record,byte[] recBytes,int outrecDesPos) {
  BigDecimal big = subZoneDecimalBytes(record, ARITHMETIC_POS2, ARITHMETIC_POS2_1,  ARITHMETIC_LEN2, ARITHMETIC_LEN2_1);
  String decimalVal =  fillZeroFormatLength(big,16);
  decimalVal =  maskNumberFormatter(decimalVal, ARITHMETIC_EDIT2, ARITHMETIC_SIGN2);
  decimalVal =  fillSpaceFormatLength(decimalVal,16);
  byte[] copyArithmeticBytes = convertChar2EbcdicBytes(decimalVal.toCharArray());
   copyRecordBytes(copyArithmeticBytes,recBytes,  0, outrecDesPos,decimalVal.length());
}
	    private void copyArithmeticBytes3(byte[] record,byte[] recBytes,int outrecDesPos) {
  BigDecimal big = subZoneDecimalBytes(record, ARITHMETIC_POS3, ARITHMETIC_POS3_1,  ARITHMETIC_LEN3, ARITHMETIC_LEN3_1);
  String decimalVal =  fillZeroFormatLength(big,16);
  decimalVal =  maskNumberFormatter(decimalVal, ARITHMETIC_EDIT3, ARITHMETIC_SIGN3);
  decimalVal =  fillSpaceFormatLength(decimalVal,16);
  byte[] copyArithmeticBytes = convertChar2EbcdicBytes(decimalVal.toCharArray());
   copyRecordBytes(copyArithmeticBytes,recBytes,  0, outrecDesPos,decimalVal.length());
}
	  
	byte[] sumRec = null;
	McgcmsSort004Keys sortKey = null;
	int sortKey1Len = 40;
	int sortKey2Len = 72;
	int sumKey1Pos = 112;
	int sumKey1Len = 11;
	int sumKey2Pos = 123;
	int sumKey2Len = 15;
	int sumKey3Pos = 138;
	int sumKey3Len = 15;
	int sumKey4Pos = 170;
	int sumKey4Len = 15;
	int sumKey5Pos = 185;
	int sumKey5Len = 15;
	int sumKey6Pos = 217;
	int sumKey6Len = 15;
	int sumKey7Pos = 232;
	int sumKey7Len = 15;
	private void addSumRecord(int index) throws Exception {
		try {
			McgcmsSort004Keys recKey = sortRecKeys.get(index);
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
	
  private void setSumRecord(McgcmsSort004Keys key, byte[] recBytes) {
	sumRec = new byte[key.getSortRecLen()];
	copyRecordBytes(recBytes,sumRec,0,0,key.getSortRecLen());
	sortKey = key;
  }
 

  private void writeSumOut(byte[] outRecBytes) throws CFException{
  	  outRecBytes = getOutRecord(outRecBytes);
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
		List<McgcmsSort004Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort004Keys relKey = new McgcmsSort004Keys();
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
         addRecordBytes4Sorting(record,record.length);
    }
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   McgcmsSort004Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(McgcmsSort004Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<McgcmsSort004Keys> sortComp = sortDetail.getSortComp();

		List<McgcmsSort004Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
