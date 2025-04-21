package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.SortProperties;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.sort.file.McsfsortSort008SortIn0;
import java.util.stream.Collectors;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import java.io.RandomAccessFile;
import com.cloudframe.app.sort.file.McsfsortSort008SortIn1;
import com.cloudframe.app.sort.McsfsortSort008Detail;
import com.cloudframe.app.sort.file.McsfsortSort008SortIn1;
import java.util.Collections;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.McsfsortSort008SortIn0;
import com.cloudframe.app.sort.file.McsfsortSort008SortOut;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.file.records.McsfsortSort008Keys;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
public class McsfsortSort008Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McsfsortSort008Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcsfsortsort008")
	McsfsortSort008Detail sortDetail;
	
	@Autowired
	@Qualifier("McsfsortSort008SortOut")
	McsfsortSort008SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McsfsortSort008SortIn0")
	McsfsortSort008SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McsfsortSort008SortIn1")
	McsfsortSort008SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;


    static final int OUTREC_SIZE = 180;    
	int recordLen = 0;
	

	byte[] repBytes = convertChar2EbcdicBytes("1740".toCharArray());
	byte[] repBytes1 = convertChar2EbcdicBytes("190000".toCharArray());
	byte[] repBytes2 = convertChar2EbcdicBytes("783".toCharArray());
	byte[] repBytes3 = convertChar2EbcdicBytes("00000".toCharArray());
	byte[] repBytes4 = convertChar2EbcdicBytes("00000".toCharArray());
	byte[] repBytes5 = convertChar2EbcdicBytes("M".toCharArray());
	byte[] repBytes6 = convertChar2EbcdicBytes(" ".toCharArray());
	byte[] repBytes7 = convertChar2EbcdicBytes("000".toCharArray());


    byte[] changeCond0 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] changeVal0 = convertChar2EbcdicBytes("B ".toCharArray());
    byte[] changeCond2 = convertChar2EbcdicBytes("1".toCharArray());
    byte[] changeVal2 = convertChar2EbcdicBytes("R ".toCharArray());
    byte[] changeCond4 = convertChar2EbcdicBytes("2".toCharArray());
    byte[] changeVal4 = convertChar2EbcdicBytes("R ".toCharArray());
    byte[] changeCond6 = convertChar2EbcdicBytes("3".toCharArray());
    byte[] changeVal6 = convertChar2EbcdicBytes("R ".toCharArray());
    byte[] noMatchVal8 = convertChar2EbcdicBytes("  ".toCharArray());
    byte[] changeCond9 = convertChar2EbcdicBytes("91".toCharArray());
    byte[] changeVal9 = convertChar2EbcdicBytes("U".toCharArray());
    byte[] changeCond11 = convertChar2EbcdicBytes("92".toCharArray());
    byte[] changeVal11 = convertChar2EbcdicBytes("C".toCharArray());
    byte[] noMatchVal13 = convertChar2EbcdicBytes(" ".toCharArray());

	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=0;
	static final int OUTREC_POS4=19;
	static final int OUTREC_POS5=25;
	static final int OUTREC_POS6=31;
	static final int OUTREC_POS7=0;
	static final int OUTREC_POS8=94;
	static final int OUTREC_POS9=0;
	static final int OUTREC_POS10=45;
	static final int OUTREC_POS11=51;
	static final int OUTREC_POS12=65;
	static final int OUTREC_POS13=21;
	static final int OUTREC_POS14=0;
	static final int OUTREC_POS15=39;
	static final int OUTREC_POS16=74;
	static final int OUTREC_POS17=0;
	static final int OUTREC_POS18=120;
	static final int OUTREC_POS19=0;
	static final int OUTREC_POS20=98;
	static final int OUTREC_POS21=0;
	static final int OUTREC_POS22=122;
	static final int OUTREC_POS23=128;
	static final int OUTREC_LEN1=4;
	static final int OUTREC_LEN2=19;
	static final int OUTREC_LEN3=6;
	static final int OUTREC_LEN4=2;
	static final int OUTREC_LEN5=6;
	static final int OUTREC_LEN6=4;
	static final int OUTREC_LEN7=3;
	static final int OUTREC_LEN8=4;
	static final int OUTREC_LEN9=5;
	static final int OUTREC_LEN10=6;
	static final int OUTREC_LEN11=12;
	static final int OUTREC_LEN12=8;
	static final int OUTREC_LEN13=4;
	static final int OUTREC_LEN14=5;
	static final int OUTREC_LEN15=6;
	static final int OUTREC_LEN16=20;
	static final int OUTREC_LEN17=1;
	static final int OUTREC_LEN18=1;
	static final int OUTREC_LEN19=1;
	static final int OUTREC_LEN20=21;
	static final int OUTREC_LEN21=3;
	static final int OUTREC_LEN22=5;
	static final int OUTREC_LEN23=31;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=4;
	static final int OUTREC_DES_POS3=23;
	static final int OUTREC_DES_POS4=29;
	static final int OUTREC_DES_POS5=31;
	static final int OUTREC_DES_POS6=37;
	static final int OUTREC_DES_POS7=41;
	static final int OUTREC_DES_POS8=44;
	static final int OUTREC_DES_POS9=48;
	static final int OUTREC_DES_POS10=53;
	static final int OUTREC_DES_POS11=59;
	static final int OUTREC_DES_POS12=71;
	static final int OUTREC_DES_POS13=81;
	static final int OUTREC_DES_POS14=85;
	static final int OUTREC_DES_POS15=90;
	static final int OUTREC_DES_POS16=96;
	static final int OUTREC_DES_POS17=116;
	static final int OUTREC_DES_POS18=118;
	static final int OUTREC_DES_POS19=119;
	static final int OUTREC_DES_POS20=120;
	static final int OUTREC_DES_POS21=141;
	static final int OUTREC_DES_POS22=144;
	static final int OUTREC_DES_POS23=149;
    private String filePath = "";

	List<McsfsortSort008Keys> sortRecKeys = null;
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 5;
	static final int JNKEY_LEN0 = 6;
	static final int JNKEY_POS1 = 39;
	static final int JNKEY_LEN1 = 6;
	int reformatCount = 0;
	static final int KEY_POS0 = 19;
	static final int KEY_POS1 = 98;
	static final int KEY_POS2 = 73;
	static final int KEY_POS3 = 115;
	static final int KEY_LEN0 = 2;
	static final int KEY_LEN1 = 3;
	static final int KEY_LEN2 = 1;
	static final int KEY_LEN3 = 3;
	static final int REFORMAT_KEY_LEN = 179;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 120;
	static final int REFORMAT_KEY_SRCPOS1 = 25;
	static final int REFORMAT_KEY_POS1 = 120;
	static final int REFORMAT_KEY_LEN1 = 1;
	static final int REFORMAT_KEY_SRCPOS2 = 121;
	static final int REFORMAT_KEY_POS2 = 121;
	static final int REFORMAT_KEY_LEN2 = 58;
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
            byte[] outRecBytes = getOutRecord(i); 
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("sort008");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCSFSORTSORT008 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			McsfsortSort008Keys k = sortRecKeys.get(index);
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
	private byte[] getOutRecord(int i) {
  		byte[] record = getSortedRecord(i); 
		byte[] recBytes = new byte[OUTREC_SIZE]; 
			copyRecordBytes(repBytes, recBytes, OUTREC_POS1,OUTREC_DES_POS1,OUTREC_LEN1);
copyRecordBytes(record, recBytes, OUTREC_POS2, OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(repBytes1, recBytes, OUTREC_POS3,OUTREC_DES_POS3,OUTREC_LEN3);
copyRecordBytes(record, recBytes, OUTREC_POS4, OUTREC_DES_POS4,OUTREC_LEN4);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
copyRecordBytes(record, recBytes, OUTREC_POS6, OUTREC_DES_POS6,OUTREC_LEN6);
copyRecordBytes(repBytes2, recBytes, OUTREC_POS7,OUTREC_DES_POS7,OUTREC_LEN7);
copyRecordBytes(record, recBytes, OUTREC_POS8, OUTREC_DES_POS8,OUTREC_LEN8);
copyRecordBytes(repBytes3, recBytes, OUTREC_POS9,OUTREC_DES_POS9,OUTREC_LEN9);
copyRecordBytes(record, recBytes, OUTREC_POS10, OUTREC_DES_POS10,OUTREC_LEN10);
copyRecordBytes(record, recBytes, OUTREC_POS11, OUTREC_DES_POS11,OUTREC_LEN11);
copyRecordBytes(record, recBytes, OUTREC_POS12, OUTREC_DES_POS12,OUTREC_LEN12);
setChangeBytes(record,recBytes,79,0/*caseId*/);
copyRecordBytes(record, recBytes, OUTREC_POS13, OUTREC_DES_POS13,OUTREC_LEN13);
copyRecordBytes(repBytes4, recBytes, OUTREC_POS14,OUTREC_DES_POS14,OUTREC_LEN14);
copyRecordBytes(record, recBytes, OUTREC_POS15, OUTREC_DES_POS15,OUTREC_LEN15);
copyRecordBytes(record, recBytes, OUTREC_POS16, OUTREC_DES_POS16,OUTREC_LEN16);
copyRecordBytes(repBytes5, recBytes, OUTREC_POS17,OUTREC_DES_POS17,OUTREC_LEN17);
setChangeBytes(record,recBytes,117,1/*caseId*/);
copyRecordBytes(record, recBytes, OUTREC_POS18, OUTREC_DES_POS18,OUTREC_LEN18);
copyRecordBytes(repBytes6, recBytes, OUTREC_POS19,OUTREC_DES_POS19,OUTREC_LEN19);
copyRecordBytes(record, recBytes, OUTREC_POS20, OUTREC_DES_POS20,OUTREC_LEN20);
copyRecordBytes(repBytes7, recBytes, OUTREC_POS21,OUTREC_DES_POS21,OUTREC_LEN21);
copyRecordBytes(record, recBytes, OUTREC_POS22, OUTREC_DES_POS22,OUTREC_LEN22);
copyRecordBytes(record, recBytes, OUTREC_POS23, OUTREC_DES_POS23,OUTREC_LEN23);

		return recBytes;
  	}  
	private void setChangeBytes(byte[] record,byte[] recBytes,int pos, int changeId) {
        switch (changeId) {
        case 0:
              if (Field.compareBytes(record, changeCond0,73, 0,1,1) == 0) {
                copyRecordBytes(changeVal0, recBytes, 0, pos,2);
              } else if (Field.compareBytes(record, changeCond2,73, 0,1,1) == 0) {
                copyRecordBytes(changeVal2, recBytes, 0, pos,2);
              } else if (Field.compareBytes(record, changeCond4,73, 0,1,1) == 0) {
                copyRecordBytes(changeVal4, recBytes, 0, pos,2);
              } else if (Field.compareBytes(record, changeCond6,73, 0,1,1) == 0) {
                copyRecordBytes(changeVal6, recBytes, 0, pos,2);
              } else {
                copyRecordBytes(noMatchVal8,recBytes, 0,  pos,2);
              } 
            break;
        case 1:
              if (Field.compareBytes(record, changeCond9,19, 0,2,2) == 0) {
                copyRecordBytes(changeVal9, recBytes, 0, pos,1);
              } else if (Field.compareBytes(record, changeCond11,19, 0,2,2) == 0) {
                copyRecordBytes(changeVal11, recBytes, 0, pos,1);
              } else {
                copyRecordBytes(noMatchVal13,recBytes, 0,  pos,1);
              } 
            break;
        default:
            break;
        } 
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

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn1RecKeys(sortProcesser.getKeys());
	}

private void processJoinKeys2() throws Exception {	
		String inFileName = filePath + sortIn1.getAccessFileName(sortIn1.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn1.getFileName(), sortIn1.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key1"/* name */, JNKEY_POS1/* pos */, JNKEY_LEN1/* len */, false/* descending */,"CH" /* type */,sortProperties);

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
		for (InMemoryKeySortKeyObject jnKey1 : joinRecKeys1) {
			byte[] key = getJnReturnRecord(jnKey1,0);
			joinRecKeys2.stream().filter(k -> (Field.compareBytes(k.getRecordKey(), jnKey1.getRecordKey())==0))
					.forEach(k -> {
						try {
                           byte[] key2 = getJnReturnRecord(k,1);
			               byte[] outRecBytes  =  new byte[REFORMAT_KEY_LEN];  
        						copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS0, REFORMAT_KEY_POS0, REFORMAT_KEY_LEN0);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS2, REFORMAT_KEY_POS2, REFORMAT_KEY_LEN2);
							addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
							reformatCount++;
						}catch(Exception e) {
							logger.info("Unable to process JoinKey2 record: {}",e.getMessage());
						}
					});
		}			
		sortDetail.setRecInCounter(reformatCount);
		logger.info("STEPNAME: SORT008 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<McsfsortSort008Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McsfsortSort008Keys relKey = new McsfsortSort008Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
        relKey.setKeyCharacter2(getRecordKeyBytes(recordByte, KEY_POS1 , KEY_LEN1)); 
        relKey.setKeyCharacter3(getRecordKeyBytes(recordByte, KEY_POS2 , KEY_LEN2)); 
        relKey.setKeyCharacter4(getZoneDecimalRecordKeyBytes(recordByte, KEY_POS3 , KEY_LEN3)); 
		relKey.setSortRecPos(getRecPos()); /* set current record start position */
		relKey.setSortRecLen(byteLen);		
		sortRecKeys.add(relKey);
        writeToTempFile(recordByte);
        setRecPos(getRecPos() + byteLen);  /* next record start position in tempFile */
	}


	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   McsfsortSort008Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(McsfsortSort008Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
                   .thenComparing(McsfsortSort008Keys.getKeyCharacter3Comparator(true/*isAscending*/))               
                   .thenComparing(McsfsortSort008Keys.getKeyCharacter4Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<McsfsortSort008Keys> sortComp = sortDetail.getSortComp();

		List<McsfsortSort008Keys> sortRecKeys = sortDetail.getSortRecKeys();
        sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());  
        sortDetail.setSortRecKeys(sortRecKeys);	      
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
