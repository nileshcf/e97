package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.SortProperties;
import java.util.Set;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.McgcmsSort014SortIn0;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.sort.file.records.McgcmsSort014Keys;
import com.cloudframe.app.sort.McgcmsSort014Detail;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import java.io.RandomAccessFile;
import java.util.Collections;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.cloudframe.app.sort.file.McgcmsSort014SortIn1;
import com.cloudframe.app.sort.file.McgcmsSort014SortOut1;
import com.cloudframe.app.sort.file.McgcmsSort014SortOut0;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.sort.file.McgcmsSort014SortOut2;
import com.cloudframe.app.sort.file.McgcmsSort014SortIn0;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
import com.cloudframe.app.sort.file.McgcmsSort014SortIn1;
public class McgcmsSort014Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort014Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort014")
	McgcmsSort014Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort014SortOut0")
	McgcmsSort014SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort014SortOut1")
	McgcmsSort014SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("McgcmsSort014SortOut2")
	McgcmsSort014SortOut2 sortOut2;
	

	
	@Autowired
	@Qualifier("McgcmsSort014SortIn0")
	McgcmsSort014SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort014SortIn1")
	McgcmsSort014SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
    int recordCount2 = 0;


    static final int OUTREC_SIZE = 43;    
	int recordLen = 0;
	


    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    final byte[] fillBytes1 = new byte[8];
    static final int OUTREC_SIZE0 = 43;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    final byte[] fillBytes4 = new byte[8];
    static final int OUTREC_SIZE1 = 43;
    final byte[] fillSpace2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE2));
    static final int OUTREC_SIZE2 = 43;


	byte[] f1onlyCond01 = convertChar2EbcdicBytes("-".toCharArray());
	byte[] f2onlyCond11 = convertChar2EbcdicBytes("-".toCharArray());
		byte[] reformatFill = convertChar2EbcdicBytes("-----------------------------------".toCharArray());
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=35;
	static final int OUTREC_POS4=0;
	static final int OUTREC_POS5=62;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=62;
	static final int OUTREC_LEN1=35;
	static final int OUTREC_LEN2=8;
	static final int OUTREC_LEN3=27;
	static final int OUTREC_LEN4=8;
	static final int OUTREC_LEN5=8;
	static final int OUTREC_LEN6=35;
	static final int OUTREC_LEN7=8;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=35;
	static final int OUTREC_DES_POS3=0;
	static final int OUTREC_DES_POS4=27;
	static final int OUTREC_DES_POS5=35;
	static final int OUTREC_DES_POS6=0;
	static final int OUTREC_DES_POS7=35;
    private String filePath = "";

	List<McgcmsSort014Keys> sortRecKeys = null;
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 0;
	static final int JNKEY_LEN0 = 7;
	static final int JNKEY_POS1 = 7;
	static final int JNKEY_LEN1 = 11;
	static final int JNKEY_POS2 = 18;
	static final int JNKEY_LEN2 = 2;
	static final int JNKEY_POS3 = 20;
	static final int JNKEY_LEN3 = 4;
	static final int JNKEY_POS4 = 24;
	static final int JNKEY_LEN4 = 3;
	static final int JNKEY_POS5 = 0;
	static final int JNKEY_LEN5 = 7;
	static final int JNKEY_POS6 = 7;
	static final int JNKEY_LEN6 = 11;
	static final int JNKEY_POS7 = 18;
	static final int JNKEY_LEN7 = 2;
	static final int JNKEY_POS8 = 20;
	static final int JNKEY_LEN8 = 4;
	static final int JNKEY_POS9 = 24;
	static final int JNKEY_LEN9 = 3;
	int reformatCount = 0;
	static final int REFORMAT_KEY_LEN = 70;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 35;
	static final int REFORMAT_KEY_SRCPOS1 = 0;
	static final int REFORMAT_KEY_POS1 = 35;
	static final int REFORMAT_KEY_LEN1 = 35;
	static final int REFORMAT_KEY_SRCPOS2 = 0;
	static final int REFORMAT_KEY_POS2 = 35;
	static final int REFORMAT_KEY_LEN2 = 35;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
        sortDetail.setJoinRecKey1(new ArrayList<>());
        sortDetail.setJoinRecKey2(new ArrayList<>());
        sortDetail.setJn1RecKeys(new ArrayList<>());
        sortDetail.setJn2RecKeys(new ArrayList<>());    
		initializeSort();
	try {
	   processRead();
       processReformat();
       sortProcessor();
	} catch (Exception e) {
	   logger.error("Error in SORT Process : {}", e.getMessage());
	}	
        		
	    useSortTempFile(sortDetail.getTempFileVal());
		sortOut0.open("w", filePath + sortOut0.getFileName(), sortOut0.getRecordLen(), sortOut0.isFBRec());  
		sortOut1.open("w", filePath + sortOut1.getFileName(), sortOut1.getRecordLen(), sortOut1.isFBRec());  
		sortOut2.open("w", filePath + sortOut2.getFileName(), sortOut2.getRecordLen(), sortOut2.isFBRec());  
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
            byte[] outRecBytes = getSortedRecord(i); 
		  if ((Field.compareBytes(outRecBytes,f1onlyCond01,35,0,1,1) == 0)) {
                   
		    //write into sortOut0 file
		 	sortOut0.setRecord(getOutRecord(outRecBytes,0), sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,f2onlyCond11,0,0,1,1) == 0)) {
                   
		    //write into sortOut1 file
		 	sortOut1.setRecord(getOutRecord(outRecBytes,1), sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
		  if ((Field.compareByte(outRecBytes[35],(byte)0x60) != 0) && (Field.compareByte(outRecBytes[0],(byte)0x60) != 0)) {
                   
		    //write into sortOut2 file
		 	sortOut2.setRecord(getOutRecord(outRecBytes,2), sortOut2.getRecordLen());
		 	
			sortOut2.write(); recordCount2++;
		  }	
        }

		cfStepHandler.updateSortStepExecution("sort014");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MCGCMSSORT014 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT014 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MCGCMSSORT014 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
         sortOut2.close();
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

	private byte[] getJnReturnRecord(InMemoryKeySortKeyObject k, int index) throws Exception {
		return readFromBuffer(k.getMemoryOffset(), k.getRecordLength(), index);
	}

	/**
	 * This method return sorted record data as byte array
	 * 
	 * @return
	 */ 
	private byte[] getSortedRecord(int index) {
		try {
			McgcmsSort014Keys k = sortRecKeys.get(index);
           if (isWriteInTempFile()) {
				return readFromBuffer(k.getSortRecPos(), k.getSortRecLen());
		   } else
			    return readFromBuffer(k.getSortRecPos(), k.getSortRecLen(), k.getFileIndx());
		} catch (Exception e) {
			logger.error("Error in return record : {}", e.getMessage());
		}
		return new byte[0];
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
	private byte[] getOutRecord(byte[] record,int fileIndx) {
		byte[] recBytes = new byte[OUTREC_SIZE]; 
					switch(fileIndx) {
	case 0:
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
             copyRecordBytes(fillBytes4,recBytes,OUTREC_POS4,OUTREC_DES_POS4,OUTREC_LEN4);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
			break;
	case 2:
     	recBytes = new byte[OUTREC_SIZE2];
     	copyRecordBytes(fillSpace2, recBytes, 0, 0, OUTREC_SIZE2);
copyRecordBytes(record, recBytes, OUTREC_POS6, OUTREC_DES_POS6,OUTREC_LEN6);
copyRecordBytes(record, recBytes, OUTREC_POS7, OUTREC_DES_POS7,OUTREC_LEN7);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	  
	  
	  



	public void processRead() throws Exception {
		processJoinKeys1();
		processJoinKeys2();
	}
	private void initializeSort() {
        this.setRecPos(0);
        this.setRecIndex(-1);
		this.recCounter = 0;
	}
private void processJoinKeys1() throws Exception {
		String inFileName = filePath + sortIn0.getAccessFileName(sortIn0.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn0_" + sortIn0.getFileName(), sortIn0.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key0"/* name */, JNKEY_POS0/* pos */, JNKEY_LEN0/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key1"/* name */, JNKEY_POS1/* pos */, JNKEY_LEN1/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key2"/* name */, JNKEY_POS2/* pos */, JNKEY_LEN2/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key3"/* name */, JNKEY_POS3/* pos */, JNKEY_LEN3/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key4"/* name */, JNKEY_POS4/* pos */, JNKEY_LEN4/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn1RecKeys(sortProcesser.getKeys());
	}

private void processJoinKeys2() throws Exception {	
		String inFileName = filePath + sortIn1.getAccessFileName(sortIn1.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn1.getFileName(), sortIn1.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key5"/* name */, JNKEY_POS5/* pos */, JNKEY_LEN5/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key6"/* name */, JNKEY_POS6/* pos */, JNKEY_LEN6/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key7"/* name */, JNKEY_POS7/* pos */, JNKEY_LEN7/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key8"/* name */, JNKEY_POS8/* pos */, JNKEY_LEN8/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key9"/* name */, JNKEY_POS9/* pos */, JNKEY_LEN9/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn2RecKeys(sortProcesser.getKeys());
		sortDetail.setRecInCounter(sortDetail.getJn1RecKeys().size() + sortDetail.getJn2RecKeys().size());
	}	

	
	public void processReformat() throws Exception {
        reformatbeforeStep();
        doPresetForRead();

        List<InMemoryKeySortKeyObject> joinRecKeys1 =  sortDetail.getJn1RecKeys();
        List<InMemoryKeySortKeyObject> joinRecKeys2 =  sortDetail.getJn2RecKeys();
        int f1count = 0;
		int f2count = 0;
		boolean SortKeyF1MoreRecords = true;
		boolean SortKeyF2MoreRecords = true;
		while (SortKeyF1MoreRecords || SortKeyF2MoreRecords) {
			byte[] outRecBytes = convertChar2EbcdicBytes(CFUtil.fill(REFORMAT_KEY_LEN,"-"));
			if (f1count >= joinRecKeys1.size()) {
				SortKeyF1MoreRecords = false;
			}
			if (f2count >= joinRecKeys2.size()) {
				SortKeyF2MoreRecords = false;
			}
			if (!SortKeyF1MoreRecords && !SortKeyF2MoreRecords) {
				break;
			}

            InMemoryKeySortKeyObject jnKey1 = null;
			InMemoryKeySortKeyObject jnKey2 = null;
            byte[] key = null;
			byte[] key2 = null;
			
			if(SortKeyF1MoreRecords) {
			    jnKey1 = joinRecKeys1.get(f1count);
			    key = getJnReturnRecord(jnKey1,0);
			}
			if(SortKeyF2MoreRecords) {
			    jnKey2 = joinRecKeys2.get(f2count);
			    key2 = getJnReturnRecord(jnKey2,1);
			}
			int compareInt = 0;
        	if (SortKeyF1MoreRecords && SortKeyF2MoreRecords) {
        	compareInt = Field.compareBytes(jnKey1.getRecordKey(), jnKey2.getRecordKey());
        	if(compareInt == 0) compareInt = Field.compareBytes(jnKey1.getRecordKey(), jnKey2.getRecordKey());
        	} else if (SortKeyF1MoreRecords && !SortKeyF2MoreRecords) {
        		compareInt = -1;
        	} else {
        		compareInt = 1;
        		if(!SortKeyF1MoreRecords && SortKeyF2MoreRecords) {
    			    key = getJnReturnRecord(jnKey2,0);
    			    if(key != null && (Field.compareBytes(key, key2) == 0)) { 
    			    	compareInt = 0;
    			    }
        		}
        	}
			if (compareInt == 0) {
        	  	copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS0, REFORMAT_KEY_POS0, REFORMAT_KEY_LEN0);        	    
		      	copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
			  f1count++;
			  f2count++;
			} else if (compareInt < 0) {
        	   	copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS0, REFORMAT_KEY_POS0, REFORMAT_KEY_LEN0);
			   f1count++;
			} else {
		       	copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
				f2count++;
			}		
	addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
	reformatCount++;
		}
		sortDetail.setRecInCounter(reformatCount);
		logger.info("STEPNAME: SORT014 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
		clearMemMapFiles();
        logger.debug("JoinKey Formatter ended.");
	}

	/**
     * Executor Service Initialize is used for SORT statements
     * Creates an Executor that uses a single worker thread operating off an unbounded queue.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
    	startExecutorServ();
    }
    public void reformatbeforeStep() {
        reformatCount = 0;
        useTempFile = "yes";
        sortDetail.setTempFileVal(useTempFile);
        useSortTempFile(useTempFile);
        doSortPresets();
        sortDetail.setSortFile(this.getRaFile());
        sortDetail.setTempFile(this.getTmpFile());
        sortDetail.setWriteCounter(this.getWriteCounter());
        sortDetail.setExecutorService(this.getExecutorService());
        configMemMapFile();
        logger.debug("Joinkey Formatter initialized.");
    }
     public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) { 
		List<McgcmsSort014Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort014Keys relKey = new McgcmsSort014Keys();
		relKey.setSortRecPos(getRecPos()); /* set current record start position */
		relKey.setSortRecLen(byteLen);		
		sortRecKeys.add(relKey);
        writeToTempFile(recordByte);
        setRecPos(getRecPos() + byteLen);  /* next record start position in tempFile */
	}


	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		
		if(isWriteInTempFile()) {
            // Make sure the input file is fully loaded
            boolean isCountMatches = true;
            this.setWriteCounter(sortDetail.getWriteCounter());
			int joinRecCount = sortDetail.getRecInCounter();
			while (isCountMatches) { 
			    isCountMatches = joinRecCount != getWriteCounter().get();

            }
        }                	
		logger.debug("Sort Processor ended.");
	}
}
