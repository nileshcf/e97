package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.SortProperties;
import java.util.Set;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.Step500Step0500SortIn0;
import java.util.stream.Collectors;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import java.io.RandomAccessFile;
import com.cloudframe.app.sort.file.Step500Step0500SortOut0;
import com.cloudframe.app.sort.file.Step500Step0500SortIn1;
import java.util.Collections;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.Step500Step0500Detail;
import com.cloudframe.app.sort.file.Step500Step0500SortOut1;
import com.cloudframe.app.sort.file.Step500Step0500SortIn0;
import com.cloudframe.app.sort.file.records.Step500Step0500Keys;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.Step500Step0500SortIn1;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class Step500Step0500Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Step500Step0500Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_step500step0500")
	Step500Step0500Detail sortDetail;
	
	@Autowired
	@Qualifier("Step500Step0500SortOut0")
	Step500Step0500SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("Step500Step0500SortOut1")
	Step500Step0500SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("Step500Step0500SortIn0")
	Step500Step0500SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Step500Step0500SortIn1")
	Step500Step0500SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_REC_SIZE = 80;
    static final int OUTFIL_BUILD_REC_SIZE0 = 80;
    static final int OUTFIL_BUILD_REC_SIZE1 = 80;
	static final int OUTFIL_BUILD_SRCPOS00 = 0;
	static final int OUTFIL_BUILD_POS00 = 0;
	static final int OUTFIL_BUILD_LEN00 = 49;
	static final int OUTFIL_BUILD_SRCPOS01 = 0;
	static final int OUTFIL_BUILD_POS01 = 49;
	static final int OUTFIL_BUILD_LEN01 = 3;
	static final int OUTFIL_BUILD_SRCPOS03 = 0;
	static final int OUTFIL_BUILD_POS03 = 52;
	static final int OUTFIL_BUILD_LEN03 = 3;
	static final int OUTFIL_BUILD_SRCPOS05 = 0;
	static final int OUTFIL_BUILD_POS05 = 55;
	static final int OUTFIL_BUILD_LEN05 = 3;
	static final int OUTFIL_BUILD_SRCPOS06 = 0;
	static final int OUTFIL_BUILD_POS06 = 79;
	static final int OUTFIL_BUILD_LEN06 = 1;
	static final int OUTFIL_BUILD_SRCPOS10 = 0;
	static final int OUTFIL_BUILD_POS10 = 0;
	static final int OUTFIL_BUILD_LEN10 = 39;
	static final int OUTFIL_BUILD_SRCPOS11 = -2;
	static final int OUTFIL_BUILD_POS11 = 39;
	static final int OUTFIL_BUILD_LEN11 = 1;
	static final int OUTFIL_BUILD_SRCPOS12 = 40;
	static final int OUTFIL_BUILD_POS12 = 40;
	static final int OUTFIL_BUILD_LEN12 = 9;
	static final int OUTFIL_BUILD_SRCPOS13 = 0;
	static final int OUTFIL_BUILD_POS13 = 49;
	static final int OUTFIL_BUILD_LEN13 = 3;
	static final int OUTFIL_BUILD_SRCPOS15 = 0;
	static final int OUTFIL_BUILD_POS15 = 52;
	static final int OUTFIL_BUILD_LEN15 = 3;
	static final int OUTFIL_BUILD_SRCPOS17 = 0;
	static final int OUTFIL_BUILD_POS17 = 55;
	static final int OUTFIL_BUILD_LEN17 = 3;
	static final int OUTFIL_BUILD_SRCPOS18 = 0;
	static final int OUTFIL_BUILD_POS18 = 79;
	static final int OUTFIL_BUILD_LEN18 = 1;
	byte[] unpairedValB = convertChar2EbcdicBytes("B".toCharArray());
	byte[] unpairedVal1 = convertChar2EbcdicBytes("1".toCharArray());


	byte[] bothCond01 = convertChar2EbcdicBytes("B".toCharArray());
	byte[] f1onlyCond11 = convertChar2EbcdicBytes("1".toCharArray());
	final byte[] outfilBuildLtrl01 = convertToPackedDecimalBytes(0,3);
	final byte[] outfilBuildLtrl03 = convertToPackedDecimalBytes(0,3);
	final byte[] outfilBuildLtrl05 = convertToPackedDecimalBytes(0,3);
	final byte[] outfilBuildLtrl06 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilBuildLtrl11 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] outfilBuildLtrl13 = convertToPackedDecimalBytes(0,3);
	final byte[] outfilBuildLtrl15 = convertToPackedDecimalBytes(0,3);
	final byte[] outfilBuildLtrl17 = convertToPackedDecimalBytes(0,3);
	final byte[] outfilBuildLtrl18 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    private String filePath = "";

	List<Step500Step0500Keys> sortRecKeys = null;
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 16;
	static final int JNKEY_LEN0 = 9;
	static final int JNKEY_POS1 = 1;
	static final int JNKEY_LEN1 = 9;
	int reformatCount = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_POS1 = 39;
	static final int KEY_LEN0 = 8;
	static final int KEY_LEN1 = 1;
	static final int REFORMAT_KEY_LEN = 50;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 39;
	static final int REFORMAT_KEY_SRCPOS1 = 0;
	static final int REFORMAT_KEY_POS1 = 39;
	static final int REFORMAT_KEY_LEN1 = 1;
	static final int REFORMAT_KEY_SRCPOS2 = 40;
	static final int REFORMAT_KEY_POS2 = 40;
	static final int REFORMAT_KEY_LEN2 = 9;
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
		  if ((Field.compareBytes(outRecBytes,bothCond01,49,0,1,1) == 0)) {
			byte[] buildBytes = buildOutRecBytes(outRecBytes,0,OUTFIL_BUILD_REC_SIZE0);
		  
		    //write into sortOut0 file
			sortOut0.setRecord(buildBytes, sortOut0.getRecordLen());
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,f1onlyCond11,49,0,1,1) == 0)) {
			byte[] buildBytes = buildOutRecBytes(outRecBytes,1,OUTFIL_BUILD_REC_SIZE1);
		  
		    //write into sortOut1 file
			sortOut1.setRecord(buildBytes, sortOut1.getRecordLen());
			sortOut1.write(); recordCount1++;
		  }	
        }

		cfStepHandler.updateSortStepExecution("step0500");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: STEP500STEP0500 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: STEP500STEP0500 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
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
			Step500Step0500Keys k = sortRecKeys.get(index);
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
	  
	  
	  
	  


	private byte[] buildOutRecBytes(byte[] outrec, int num, int buildSize) {
		byte[] outRecBytes = new byte[buildSize];
        final byte[] fillCondBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(buildSize));
		copyRecordBytes(fillCondBuildBytes, outRecBytes, 0, 0,buildSize);
		switch(num){
		case 0:
		    copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_SRCPOS00, OUTFIL_BUILD_POS00, OUTFIL_BUILD_LEN00);
		    copyRecordBytes(outfilBuildLtrl01, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS01, OUTFIL_BUILD_LEN01);
		    copyRecordBytes(outfilBuildLtrl03, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS03, OUTFIL_BUILD_LEN03);
		    copyRecordBytes(outfilBuildLtrl05, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS05, OUTFIL_BUILD_LEN05);
		    copyRecordBytes(outfilBuildLtrl06, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS06, OUTFIL_BUILD_LEN06);
		    break;
		case 1:
		    copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_SRCPOS10, OUTFIL_BUILD_POS10, OUTFIL_BUILD_LEN10);
		    copyRecordBytes(outfilBuildLtrl11, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS11, OUTFIL_BUILD_LEN11);
		    copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_SRCPOS12, OUTFIL_BUILD_POS12, OUTFIL_BUILD_LEN12);
		    copyRecordBytes(outfilBuildLtrl13, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS13, OUTFIL_BUILD_LEN13);
		    copyRecordBytes(outfilBuildLtrl15, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS15, OUTFIL_BUILD_LEN15);
		    copyRecordBytes(outfilBuildLtrl17, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS17, OUTFIL_BUILD_LEN17);
		    copyRecordBytes(outfilBuildLtrl18, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS18, OUTFIL_BUILD_LEN18);
			break;	
		default:
			copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, buildSize);
			break;
		}
		return outRecBytes;
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
        sortProcesser.setKeys();
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
				copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS2, REFORMAT_KEY_POS2, REFORMAT_KEY_LEN2);
			int ind = Collections.binarySearch(joinRecKeys2, jnKey1,binaryCompare);
			if(ind > -1) {
				byte[] key2 = getJnReturnRecord(joinRecKeys2.get(ind),1);
            		copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
			  outRecBytes[49] = unpairedValB[0];
			} else {
			  outRecBytes[49] = unpairedVal1[0];
			}
	         addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
	         reformatCount++;
		}

		sortDetail.setRecInCounter(reformatCount);
		logger.info("STEPNAME: STEP0500 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<Step500Step0500Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Step500Step0500Keys relKey = new Step500Step0500Keys();
        relKey.setKeyDecimal1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
        relKey.setKeyCharacter2(getRecordKeyBytes(recordByte, KEY_POS1 , KEY_LEN1)); 
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
                   Step500Step0500Keys.getKeyDecimal1Comparator(true/*isAscending*/)               
                   .thenComparing(Step500Step0500Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<Step500Step0500Keys> sortComp = sortDetail.getSortComp();

		List<Step500Step0500Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
