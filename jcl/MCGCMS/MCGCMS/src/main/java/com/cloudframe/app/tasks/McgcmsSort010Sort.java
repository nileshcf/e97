package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.McgcmsSort010SortOut0;
import com.cloudframe.app.sort.McgcmsSort010Detail;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.McgcmsSort010SortOut1;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import com.cloudframe.app.sort.file.records.McgcmsSort010Keys;
import java.io.RandomAccessFile;
import com.cloudframe.app.sort.file.McgcmsSort010SortIn;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.McgcmsSort010SortIn;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class McgcmsSort010Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort010Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort010")
	McgcmsSort010Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort010SortOut0")
	McgcmsSort010SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort010SortOut1")
	McgcmsSort010SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("McgcmsSort010SortIn")
	McgcmsSort010SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;


    static final int OUTREC_SIZE = 56;    
	int recordLen = 0;
	


    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    final byte[] fillBytes3 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    final byte[] fillBytes4 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final int OUTREC_SIZE0 = 56;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    final byte[] fillBytes7 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes8 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    final byte[] fillBytes9 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    final byte[] fillBytes10 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final int OUTREC_SIZE1 = 56;


	byte[] sortof1Cond01 = convertChar2EbcdicBytes("M".toCharArray());
	byte[] outfilH1000 = convertChar2EbcdicBytes("1***** MASTERCARD WORLDWIDE - NON COLLECTION ONLY  *****".toCharArray());
	byte[] outfilH2001 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilH2002S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(3));
	byte[] outfilH2002S1 = convertChar2EbcdicBytes("COUNT".toCharArray());
	byte[] outfilH2004S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(5));
	byte[] outfilH2004S1 = convertChar2EbcdicBytes("MBRID".toCharArray());
	byte[] outfilH2006S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(4));
	byte[] outfilH2006S1 = convertChar2EbcdicBytes("ERRCD".toCharArray());
	byte[] outfilH2008S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH2008S1 = convertChar2EbcdicBytes("IND".toCharArray());
	byte[] outfilH20010S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilH20010S1 = convertChar2EbcdicBytes("INFILE-ID".toCharArray());
	byte[] outfilH20012 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] sortof2Cond11 = convertChar2EbcdicBytes("C".toCharArray());
	byte[] outfilH1100 = convertChar2EbcdicBytes("1*****  MASTERCARD WORLDWIDE - COLLECTION ONLY *****".toCharArray());
	byte[] outfilH2101 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilH2102S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(3));
	byte[] outfilH2102S1 = convertChar2EbcdicBytes("COUNT".toCharArray());
	byte[] outfilH2104S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(5));
	byte[] outfilH2104S1 = convertChar2EbcdicBytes("MBRID".toCharArray());
	byte[] outfilH2106S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(4));
	byte[] outfilH2106S1 = convertChar2EbcdicBytes("ERRCD".toCharArray());
	byte[] outfilH2108S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH2108S1 = convertChar2EbcdicBytes("IND".toCharArray());
	byte[] outfilH21010S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilH21010S1 = convertChar2EbcdicBytes("INFILE-ID".toCharArray());
	byte[] outfilH21012 = convertChar2EbcdicBytes("/".toCharArray());
	static final int PAGE_BREAK_LINENO = 60;
	static final int SORT0_HEADER2LINES = 3;		
	static final int SORT1_HEADER2LINES = 3;		
	int sort0header2Count = 0;
	int sort1header2Count = 0;
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=9;
	static final int OUTREC_POS4=0;
	static final int OUTREC_POS5=21;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=26;
	static final int OUTREC_POS8=0;
	static final int OUTREC_POS9=28;
	static final int OUTREC_POS10=0;
	static final int OUTREC_POS11=0;
	static final int OUTREC_POS12=9;
	static final int OUTREC_POS13=0;
	static final int OUTREC_POS14=21;
	static final int OUTREC_POS15=0;
	static final int OUTREC_POS16=26;
	static final int OUTREC_POS17=0;
	static final int OUTREC_POS18=28;
	static final int OUTREC_LEN1=8;
	static final int OUTREC_LEN2=1;
	static final int OUTREC_LEN3=11;
	static final int OUTREC_LEN4=2;
	static final int OUTREC_LEN5=4;
	static final int OUTREC_LEN6=2;
	static final int OUTREC_LEN7=1;
	static final int OUTREC_LEN8=1;
	static final int OUTREC_LEN9=25;
	static final int OUTREC_LEN10=8;
	static final int OUTREC_LEN11=1;
	static final int OUTREC_LEN12=11;
	static final int OUTREC_LEN13=2;
	static final int OUTREC_LEN14=4;
	static final int OUTREC_LEN15=2;
	static final int OUTREC_LEN16=1;
	static final int OUTREC_LEN17=1;
	static final int OUTREC_LEN18=25;
	static final int OUTREC_DES_POS1=1;
	static final int OUTREC_DES_POS2=9;
	static final int OUTREC_DES_POS3=10;
	static final int OUTREC_DES_POS4=21;
	static final int OUTREC_DES_POS5=23;
	static final int OUTREC_DES_POS6=27;
	static final int OUTREC_DES_POS7=29;
	static final int OUTREC_DES_POS8=30;
	static final int OUTREC_DES_POS9=31;
	static final int OUTREC_DES_POS10=1;
	static final int OUTREC_DES_POS11=9;
	static final int OUTREC_DES_POS12=10;
	static final int OUTREC_DES_POS13=21;
	static final int OUTREC_DES_POS14=23;
	static final int OUTREC_DES_POS15=27;
	static final int OUTREC_DES_POS16=29;
	static final int OUTREC_DES_POS17=30;
	static final int OUTREC_DES_POS18=31;
    private String filePath = "";

	List<McgcmsSort010Keys> sortRecKeys = null;
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
	static final int KEY_POS1 = 9;
	static final int KEY_LEN0 = 8;
	static final int KEY_LEN1 = 11;
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
		addOutFileHeaders();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  byte[] outRecBytes = getSortedRecord(i); 
		  if ((Field.compareBytes(outRecBytes,sortof1Cond01,26,0,1,1) == 0)) {
		    //write into sortOut0 file		    
		    byte[] outRecord0 = getOutRecord(outRecBytes,0);
			sortOut0.setRecord(outRecord0, sortOut0.getRecordLen());
			sortOut0.write(); recordCount0++;
		        sort0header2Count++;
	       if(sort0header2Count%PAGE_BREAK_LINENO == 0) {
	           addHeader2ToOutFile(0);
	       }
      }

		  if ((Field.compareBytes(outRecBytes,sortof2Cond11,26,0,1,1) == 0)) {
		    //write into sortOut1 file		    
		    byte[] outRecord1 = getOutRecord(outRecBytes,1);
			sortOut1.setRecord(outRecord1, sortOut1.getRecordLen());
			sortOut1.write(); recordCount1++;
		        sort1header2Count++;
	       if(sort1header2Count%PAGE_BREAK_LINENO == 0) {
	           addHeader2ToOutFile(1);
	       }
      }

        }

		cfStepHandler.updateSortStepExecution("sort010");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MCGCMSSORT010 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT010 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
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


	/**
	 * This method return sorted record data as byte array
	 * 
	 * @return
	 */ 
	private byte[] getSortedRecord(int index) {
		try {
			McgcmsSort010Keys k = sortRecKeys.get(index);
			return readFromBuffer(k.getSortRecPos(), k.getSortRecLen());
		} catch (Exception e) {
			logger.error("Error in return record : {}", e.getMessage());
		}
		return new byte[0];
	}

    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }
	private byte[] getOutRecord(byte[] record, int fileIndx) {
        byte[] recBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE));
					switch(fileIndx) {
	case 0:
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
             copyRecordBytes(fillBytes2,recBytes,OUTREC_POS4,OUTREC_DES_POS4,OUTREC_LEN4);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
             copyRecordBytes(fillBytes3,recBytes,OUTREC_POS6,OUTREC_DES_POS6,OUTREC_LEN6);
copyRecordBytes(record, recBytes, OUTREC_POS7, OUTREC_DES_POS7,OUTREC_LEN7);
             copyRecordBytes(fillBytes4,recBytes,OUTREC_POS8,OUTREC_DES_POS8,OUTREC_LEN8);
copyRecordBytes(record, recBytes, OUTREC_POS9, OUTREC_DES_POS9,OUTREC_LEN9);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
copyRecordBytes(record, recBytes, OUTREC_POS10, OUTREC_DES_POS10,OUTREC_LEN10);
             copyRecordBytes(fillBytes7,recBytes,OUTREC_POS11,OUTREC_DES_POS11,OUTREC_LEN11);
copyRecordBytes(record, recBytes, OUTREC_POS12, OUTREC_DES_POS12,OUTREC_LEN12);
             copyRecordBytes(fillBytes8,recBytes,OUTREC_POS13,OUTREC_DES_POS13,OUTREC_LEN13);
copyRecordBytes(record, recBytes, OUTREC_POS14, OUTREC_DES_POS14,OUTREC_LEN14);
             copyRecordBytes(fillBytes9,recBytes,OUTREC_POS15,OUTREC_DES_POS15,OUTREC_LEN15);
copyRecordBytes(record, recBytes, OUTREC_POS16, OUTREC_DES_POS16,OUTREC_LEN16);
             copyRecordBytes(fillBytes10,recBytes,OUTREC_POS17,OUTREC_DES_POS17,OUTREC_LEN17);
copyRecordBytes(record, recBytes, OUTREC_POS18, OUTREC_DES_POS18,OUTREC_LEN18);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	  
	  
	private void addHeaderTrailerRecords(List<byte[]>  recordList, int outfileIndx) {	
		//
	 	byte[] startRec = convertChar2EbcdicBytes("1/".toCharArray());
		byte[] startChar = convertChar2EbcdicBytes("1".toCharArray());
	 	byte[] nextRec = convertChar2EbcdicBytes("/".toCharArray());
        byte[] recordByte = getHeaderSpaceBytes(outfileIndx);
		int pos=0;
		int len=0; 
		boolean recordBytesAdded = false;
		for(int i=0; i<recordList.size();i++) {
			byte[] bArr = recordList.get(i);
			len =bArr.length;
			if (len==1 && Field.compareBytes(nextRec, bArr, 0, 0, 1, 1) == 0 
				|| len==2 && Field.compareBytes(startRec, bArr, 0, 0, 2, 2) == 0) {
				if(recordBytesAdded)					
					writeHeaderTrailers(recordByte,outfileIndx);
				recordByte = getHeaderSpaceBytes(outfileIndx);
				if(len==2) 
					copyRecordBytes(startChar, recordByte, 0, 0, 1);
				
				if(i>0 && i<(recordList.size()-1)) {
					byte[] bArr2 = recordList.get(++i);
					len =bArr2.length;
					copyRecordBytes(bArr2, recordByte, 0, 0, len);
					pos = 0+bArr2.length; // next start position
					recordBytesAdded = true;
				} else {	
					writeHeaderTrailers(recordByte,outfileIndx);
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
			writeHeaderTrailers(recordByte,outfileIndx);
	}
	
	private void writeHeaderTrailers(byte[] record, int outfileIndx) {
		try {
			switch(outfileIndx) {
		    case 0:
		    	//write into sortOut0 file
				sortOut0.setRecord(record, sortOut0.getRecordLen());
				sortOut0.write();
				break;
		    case 1:
		    	//write into sortOut1 file
				sortOut1.setRecord(record, sortOut1.getRecordLen());
				sortOut1.write();
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private byte[] getHeaderSpaceBytes(int outfileIndx) {
	   int len = 0;
	   switch(outfileIndx){
	   case 0:		
		 	len = sortOut0.getRecordLen();
		 	break;
	   case 1:		
		 	len = sortOut1.getRecordLen();
		 	break;
	   default:
			break;	
	   }
	   return convertChar2EbcdicBytes(CFUtil.fillSpaces(len));	
	}
	
	private void addHeader1ToOutFile(int outfileIndx){
		switch(outfileIndx) {	
		case 0:
			addHeaderTrailerRecords(Arrays.asList(outfilH1000),0);
			break;		
		case 1:
			addHeaderTrailerRecords(Arrays.asList(outfilH1100),1);
			break;		
		default:
			break;	
	   }
	}
	
	private void addHeader2ToOutFile(int outfileIndx){
		switch(outfileIndx) {
		case 0:
			addHeaderTrailerRecords(Arrays.asList(outfilH2001,outfilH2002S0,outfilH2002S1,outfilH2004S0,outfilH2004S1,outfilH2006S0,outfilH2006S1,outfilH2008S0,outfilH2008S1,outfilH20010S0,outfilH20010S1,outfilH20012),0);
			sort0header2Count +=SORT0_HEADER2LINES;
			break;
		case 1:
			addHeaderTrailerRecords(Arrays.asList(outfilH2101,outfilH2102S0,outfilH2102S1,outfilH2104S0,outfilH2104S1,outfilH2106S0,outfilH2106S1,outfilH2108S0,outfilH2108S1,outfilH21010S0,outfilH21010S1,outfilH21012),1);
			sort1header2Count +=SORT1_HEADER2LINES;
			break;
		default:
			break;	
	   }
	}
	  

	private void addOutFileHeaders() {
		addHeader1ToOutFile(0);
		addHeader1ToOutFile(1);
		addHeader2ToOutFile(0);
		addHeader2ToOutFile(1);
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
		List<McgcmsSort010Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort010Keys relKey = new McgcmsSort010Keys();
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
                   McgcmsSort010Keys.getKeyCharacter1Comparator(false/*isAscending*/)               
                   .thenComparing(McgcmsSort010Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<McgcmsSort010Keys> sortComp = sortDetail.getSortComp();

		List<McgcmsSort010Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
