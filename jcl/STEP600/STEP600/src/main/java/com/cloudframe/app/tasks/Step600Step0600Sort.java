package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.SortProperties;
import java.util.Set;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.sort.file.records.Step600Step0600Keys;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import com.cloudframe.app.sort.Step600Step0600Detail;
import java.io.RandomAccessFile;
import java.util.Collections;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.Step600Step0600SortIn1;
import com.cloudframe.app.sort.file.Step600Step0600SortIn1;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.Step600Step0600SortOut;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.cloudframe.app.sort.file.Step600Step0600SortIn0;
import com.cloudframe.app.sort.file.Step600Step0600SortIn0;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
public class Step600Step0600Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Step600Step0600Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_step600step0600")
	Step600Step0600Detail sortDetail;
	
	@Autowired
	@Qualifier("Step600Step0600SortOut")
	Step600Step0600SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Step600Step0600SortIn0")
	Step600Step0600SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Step600Step0600SortIn1")
	Step600Step0600SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;

	byte[] unpairedValB = convertChar2EbcdicBytes("B".toCharArray());
	byte[] unpairedVal1 = convertChar2EbcdicBytes("1".toCharArray());


	final byte[] outrecwhenBytes00 = convertChar2EbcdicBytes("B".toCharArray());
	final byte[] outrecFillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
	final byte[] outrecfillBytes02 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	final byte[] outrecwhenBytes10 = convertChar2EbcdicBytes("1".toCharArray());
	final byte[] outrecBuildLtrl11 = convertToPackedDecimalBytes(0,3);
	final byte[] outrecBuildLtrl12 = convertToPackedDecimalBytes(0,3);
	final byte[] outrecBuildLtrl13 = convertToPackedDecimalBytes(0,3);
	final byte[] outrecfillBytes14 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	static final int BUILD_OUTREC_SIZE = 80;
    private String filePath = "";

	List<Step600Step0600Keys> sortRecKeys = null;
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 0;
	static final int JNKEY_LEN0 = 8;
	static final int JNKEY_POS1 = 39;
	static final int JNKEY_LEN1 = 1;
	static final int JNKEY_POS2 = 0;
	static final int JNKEY_LEN2 = 8;
	static final int JNKEY_POS3 = 8;
	static final int JNKEY_LEN3 = 1;
	int reformatCount = 0;
	static final int KEY_POS0 = 10;
	static final int KEY_POS1 = 0;
	static final int KEY_POS2 = 39;
	static final int KEY_POS3 = 16;
	static final int KEY_LEN0 = 6;
	static final int KEY_LEN1 = 8;
	static final int KEY_LEN2 = 1;
	static final int KEY_LEN3 = 9;
	static final int REFORMAT_KEY_LEN = 68;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 49;
	static final int REFORMAT_KEY_SRCPOS1 = 0;
	static final int REFORMAT_KEY_POS1 = 49;
	static final int REFORMAT_KEY_LEN1 = 18;
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
			byte[] outRecBytes = getOutrecRecord(getSortedRecord(i));
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("step0600");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: STEP600STEP0600 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			Step600Step0600Keys k = sortRecKeys.get(index);
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
    private byte[] getOutrecRecord(byte[] record) {  
      byte[] buildRec = new byte[BUILD_OUTREC_SIZE]; 
      copyRecordBytes(outrecFillBuildBytes, buildRec, 0, 0,BUILD_OUTREC_SIZE);
        if (Field.compareBytes(record, outrecwhenBytes00, 67, 0, 1, 1)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,49);
copyRecordBytes(record, buildRec, 58,49,9);
copyRecordBytes(outrecfillBytes02,buildRec,0,79,1);
 } else if (Field.compareBytes(record, outrecwhenBytes10, 67, 0, 1, 1)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,49);
copyRecordBytes(outrecBuildLtrl11, buildRec, 0,49,3); 
copyRecordBytes(outrecBuildLtrl12, buildRec, 0,52,3); 
copyRecordBytes(outrecBuildLtrl13, buildRec, 0,55,3); 
copyRecordBytes(outrecfillBytes14,buildRec,0,79,1);
 }else { return record;}
      return buildRec;
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

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.setKeys();
		sortDetail.setJn1RecKeys(sortProcesser.getKeys());
	}

private void processJoinKeys2() throws Exception {	
		String inFileName = filePath + sortIn1.getAccessFileName(sortIn1.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn1.getFileName(), sortIn1.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key2"/* name */, JNKEY_POS2/* pos */, JNKEY_LEN2/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key3"/* name */, JNKEY_POS3/* pos */, JNKEY_LEN3/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn2RecKeys(sortProcesser.getKeys());
		sortDetail.setRecInCounter(sortDetail.getJn1RecKeys().size() + sortDetail.getJn2RecKeys().size());
	}	

	
	public void processReformat() throws Exception {
        reformatbeforeStep();
        doPresetForRead();
		boolean isF1RecMatches = false;
        List<InMemoryKeySortKeyObject> joinRecKeys1 =  sortDetail.getJn1RecKeys();
        List<InMemoryKeySortKeyObject> joinRecKeys2 =  sortDetail.getJn2RecKeys();
        Comparator<AbstractSortKeyObject> binaryCompare = InMemoryKeySortKeyObject.getRecordKeyComparator(true);
		for (InMemoryKeySortKeyObject jnKey1 : joinRecKeys1) {
			byte[] outRecBytes  =  convertChar2EbcdicBytes(CFUtil.fillSpaces(REFORMAT_KEY_LEN));
			byte[] key = getJnReturnRecord(jnKey1,0);
				copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS0, REFORMAT_KEY_POS0, REFORMAT_KEY_LEN0);
			int ind = Collections.binarySearch(joinRecKeys2, jnKey1,binaryCompare);
			if(ind > -1) {
				byte[] key2 = getJnReturnRecord(joinRecKeys2.get(ind),1);
            		copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
			  outRecBytes[67] = unpairedValB[0];
			} else {
			  outRecBytes[67] = unpairedVal1[0];
			}
	         addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
	         reformatCount++;
		}

		sortDetail.setRecInCounter(reformatCount);
		logger.info("STEPNAME: STEP0600 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<Step600Step0600Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Step600Step0600Keys relKey = new Step600Step0600Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
        relKey.setKeyDecimal2(getRecordKeyBytes(recordByte, KEY_POS1 , KEY_LEN1)); 
        relKey.setKeyCharacter3(getRecordKeyBytes(recordByte, KEY_POS2 , KEY_LEN2)); 
        relKey.setKeyCharacter4(getRecordKeyBytes(recordByte, KEY_POS3 , KEY_LEN3)); 
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
                   Step600Step0600Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(Step600Step0600Keys.getKeyDecimal2Comparator(true/*isAscending*/))               
                   .thenComparing(Step600Step0600Keys.getKeyCharacter3Comparator(true/*isAscending*/))               
                   .thenComparing(Step600Step0600Keys.getKeyCharacter4Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<Step600Step0600Keys> sortComp = sortDetail.getSortComp();

		List<Step600Step0600Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
