package com.cloudframe.app.tasks;
import com.cloudframe.app.sort.file.McgcmsSort007SortOut;
import org.slf4j.Logger;
import java.math.BigDecimal;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.exception.CFException;
import java.util.stream.Collectors;
import com.cloudframe.app.utility.ByteUtil;
import com.cloudframe.app.sort.McgcmsSort007Detail;
import com.cloudframe.app.data.Field;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.records.McgcmsSort007Keys;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.sort.file.McgcmsSort007SortIn;
import java.util.Arrays;
import com.cloudframe.app.utility.SpringContextHandler;
import com.cloudframe.app.sort.file.McgcmsSort007SortIn;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class McgcmsSort007Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort007Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort007")
	McgcmsSort007Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort007SortOut")
	McgcmsSort007SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort007SortIn")
	McgcmsSort007SortIn sortIn;
	
	
    int recordCount = 0;


    static final int OUTREC_SIZE = 150;    
	int recordLen = 0;
	

	byte[] repBytes = convertChar2EbcdicBytes("CLR".toCharArray());
	byte[] repBytes1 = convertChar2EbcdicBytes(":".toCharArray());

    static final String MASK_PATTERN1 = "M10";
    static final String MASK_FORMAT1 = "ZD";
    final byte[] fillBytes2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(130));


	byte[] outfilH1000 = convertChar2EbcdicBytes("1**START OF TPM COUNT**".toCharArray());
	byte[] outfilT1001 = convertChar2EbcdicBytes("1**END OF TPM COUNT**".toCharArray());
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=51;
	static final int OUTREC_POS3=0;
	static final int OUTREC_POS4=55;
	static final int OUTREC_POS5=0;
	static final int OUTREC_LEN1=3;
	static final int OUTREC_LEN2=3;
	static final int OUTREC_LEN3=1;
	static final int OUTREC_LEN4=9;
	static final int OUTREC_LEN5=130;
	static final int OUTREC_DES_POS1=1;
	static final int OUTREC_DES_POS2=4;
	static final int OUTREC_DES_POS3=7;
	static final int OUTREC_DES_POS4=8;
	static final int OUTREC_DES_POS5=20;
	static final int ARITHMETIC_POS1= 55;
	static final int ARITHMETIC_LEN1= 9;
	static final int CONVERT_LENGTH1= 9;
	static final int ARITHMETIC_POS1_1= 117;
	static final int ARITHMETIC_LEN1_1= 8;
	static final int ARITHMETIC_OPERAND_VAL1_1= -1;
	static final int ARITHMETIC_OPERAND_VAL1_1_2= 60;
	static final String ARITHMETIC_FORMAT1= "ZD";
	static final String ARITHMETIC_EDIT1= "M12";
	static final String ARITHMETIC_SIGN1= "";
	static final String ARITHMETIC_FORMAT1_1= "ZD";
    private String filePath = "";

	List<McgcmsSort007Keys> sortRecKeys = null;
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
	static final int KEY_POS0 = 51;
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
		addOutFileHeaders();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  addSumRecord(i);					
        }

		if(sumRec!=null) writeSumOut(sumRec);
	    addTrailer1ToOutFile();
		cfStepHandler.updateSortStepExecution("sort007");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCGCMSSORT007 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
        byte[] recBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE));
			copyRecordBytes(repBytes, recBytes, OUTREC_POS1,OUTREC_DES_POS1,OUTREC_LEN1);
copyMaskBytes(record, recBytes, OUTREC_POS2, OUTREC_DES_POS2, OUTREC_LEN2, MASK_PATTERN1, MASK_FORMAT1);
copyRecordBytes(repBytes1, recBytes, OUTREC_POS3,OUTREC_DES_POS3,OUTREC_LEN3);
copyArithmeticBytes1(record, recBytes, OUTREC_DES_POS4);
              copyRecordBytes(fillBytes2,recBytes,OUTREC_POS5,OUTREC_DES_POS5,OUTREC_LEN5);

		return recBytes;
  	}  
	
	    private void copyArithmeticBytes1(byte[] record,byte[] recBytes,int outrecDesPos) {
  BigDecimal big = divZoneDecimalBytes(record, ARITHMETIC_POS1, ARITHMETIC_POS1_1,  ARITHMETIC_LEN1, ARITHMETIC_LEN1_1);
  big = big.multiply(BigDecimal.valueOf(60));
  String decimalVal =  fillZeroFormatLength(big,12);
  decimalVal =  maskNumberFormatter(decimalVal, ARITHMETIC_EDIT1, ARITHMETIC_SIGN1);
  decimalVal =  fillSpaceFormatLength(decimalVal,12);
  byte[] copyArithmeticBytes = convertChar2EbcdicBytes(decimalVal.toCharArray());
   copyRecordBytes(copyArithmeticBytes,recBytes,  0, outrecDesPos,decimalVal.length());
}
	  
	byte[] fbaStartBytes1 = convertChar2EbcdicBytes("1".toCharArray());
	byte[] fbaStartBytes2 = convertChar2EbcdicBytes(" ".toCharArray());
	byte[] sumRec = null;
	McgcmsSort007Keys sortKey = null;
	int sortKey1Len = 3;
	int sumKey1Pos = 55;
	int sumKey1Len = 9;
	int sumKey2Pos = 117;
	int sumKey2Len = 8;
	private void addSumRecord(int index) throws Exception {
		try {
			McgcmsSort007Keys recKey = sortRecKeys.get(index);
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
	
  private void setSumRecord(McgcmsSort007Keys key, byte[] recBytes) {
	sumRec = new byte[key.getSortRecLen()];
	copyRecordBytes(recBytes,sumRec,0,0,key.getSortRecLen());
	sortKey = key;
  }
 

  private void writeSumOut(byte[] outRecBytes) throws CFException{
  	  outRecBytes = getOutRecord(outRecBytes);
		if(recordCount==0 ||recordCount%60==0) {
			copyRecordBytes(fbaStartBytes1, outRecBytes, 0, 0, 1);
		} else {
			copyRecordBytes(fbaStartBytes2, outRecBytes, 0, 0, 1);
		}
	  sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
      sortOut.write();
      recordCount++;
  }
	  
	private void addHeaderTrailerRecords(List<byte[]>  recordList) {	
		//
	 	byte[] startRec = convertChar2EbcdicBytes("1/".toCharArray());
		byte[] startChar = convertChar2EbcdicBytes("1".toCharArray());
	 	byte[] nextRec = convertChar2EbcdicBytes("/".toCharArray());
        byte[] recordByte = getHeaderSpaceBytes();
		int pos=0;
		int len=0; 
		boolean recordBytesAdded = false;
		for(int i=0; i<recordList.size();i++) {
			byte[] bArr = recordList.get(i);
			len =bArr.length;
			if (len==1 && Field.compareBytes(nextRec, bArr, 0, 0, 1, 1) == 0 
				|| len==2 && Field.compareBytes(startRec, bArr, 0, 0, 2, 2) == 0) {
				if(recordBytesAdded)					
					writeHeaderTrailers(recordByte);
				recordByte = getHeaderSpaceBytes();
				if(len==2) 
					copyRecordBytes(startChar, recordByte, 0, 0, 1);

				if(i>0 && i<(recordList.size()-1)) {
					byte[] bArr2 = recordList.get(++i);
					len =bArr2.length;
					copyRecordBytes(bArr2, recordByte, 0, 0, len);
					pos = 0+bArr2.length; // next start position
					recordBytesAdded = true;
				} else {
					writeHeaderTrailers(recordByte);
					pos=0;recordBytesAdded = false;
				}
				continue;
			}
			copyRecordBytes(bArr, recordByte, 0, pos, len);
			pos = pos+bArr.length; // next start position
			recordBytesAdded = true;
		}
		// write last record if exists
		if(recordBytesAdded)
			writeHeaderTrailers(recordByte);
	}
	
	private void writeHeaderTrailers(byte[] record) {
		try {
			sortOut.setRecord(record, sortOut.getRecordLen());
			sortOut.write();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private byte[] getHeaderSpaceBytes() {
	   return convertChar2EbcdicBytes(CFUtil.fillSpaces(sortOut.getRecordLen()));	
	}
	
	private void addHeader1ToOutFile(){
		addHeaderTrailerRecords(Arrays.asList(outfilH1000));
	}


	private void addTrailer1ToOutFile(){
		addHeaderTrailerRecords(Arrays.asList(outfilT1001));
	}
	  

	private void addOutFileHeaders() {
		addHeader1ToOutFile();
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
		List<McgcmsSort007Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort007Keys relKey = new McgcmsSort007Keys();
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
        byte[] inrecBuild = createInrecBuildRecord(record);
        addRecordBytes4Sorting(inrecBuild, inrecBuild.length);
    }
       final byte[] inrecFillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_INREC_SIZE));
       final byte[] inrecfillBytes01 = convertChar2EbcdicBytes(CFUtil.fillSpaces(24));
       static final int BUILD_INREC_SIZE = 150;

   public byte[] createInrecBuildRecord(byte[] record) {
    byte[] buildRec = new byte[BUILD_INREC_SIZE];
    copyRecordBytes(inrecFillBuildBytes, buildRec, 0, 0,BUILD_INREC_SIZE);
     copyRecordBytes(record, buildRec, 0,0,126);
copyRecordBytes(inrecfillBytes01,buildRec,0,126,24);

    return buildRec;
   }
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   McgcmsSort007Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<McgcmsSort007Keys> sortComp = sortDetail.getSortComp();

		List<McgcmsSort007Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
