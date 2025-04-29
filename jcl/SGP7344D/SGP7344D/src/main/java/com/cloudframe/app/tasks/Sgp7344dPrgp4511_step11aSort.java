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
import com.cloudframe.app.sort.Sgp7344dPrgp4511_step11aDetail;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import java.io.RandomAccessFile;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortIn0;
import java.util.Collections;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortOut;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortIn1;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortIn0;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortIn1;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.sort.file.records.Sgp7344dPrgp4511_step11aKeys;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
public class Sgp7344dPrgp4511_step11aSort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Sgp7344dPrgp4511_step11aSort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_sgp7344dprgp4511_step11a")
	Sgp7344dPrgp4511_step11aDetail sortDetail;
	
	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11aSortOut")
	Sgp7344dPrgp4511_step11aSortOut sortOut;
	

	
	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11aSortIn0")
	Sgp7344dPrgp4511_step11aSortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11aSortIn1")
	Sgp7344dPrgp4511_step11aSortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;



	final byte[] outrecFillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
	final byte[] outrecfillBytes01 = convertChar2EbcdicBytes(CFUtil.fillSpaces(69));
	static final int BUILD_OUTREC_SIZE = 128;
    private String filePath = "";

	List<Sgp7344dPrgp4511_step11aKeys> sortRecKeys = null;
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 0;
	static final int JNKEY_LEN0 = 19;
	static final int JNKEY_POS1 = 19;
	static final int JNKEY_LEN1 = 19;
	static final int JNKEY_POS2 = 38;
	static final int JNKEY_LEN2 = 2;
	static final int JNKEY_POS3 = 40;
	static final int JNKEY_LEN3 = 2;
	static final int JNKEY_POS4 = 42;
	static final int JNKEY_LEN4 = 3;
	static final int JNKEY_POS5 = 45;
	static final int JNKEY_LEN5 = 11;
	static final int JNKEY_POS6 = 0;
	static final int JNKEY_LEN6 = 19;
	static final int JNKEY_POS7 = 19;
	static final int JNKEY_LEN7 = 19;
	static final int JNKEY_POS8 = 38;
	static final int JNKEY_LEN8 = 2;
	static final int JNKEY_POS9 = 40;
	static final int JNKEY_LEN9 = 2;
	static final int JNKEY_POS10 = 42;
	static final int JNKEY_LEN10 = 3;
	static final int JNKEY_POS11 = 45;
	static final int JNKEY_LEN11 = 11;
	int reformatCount = 0;
	static final int REFORMAT_KEY_LEN = 59;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 42;
	static final int REFORMAT_KEY_SRCPOS1 = 46;
	static final int REFORMAT_KEY_POS1 = 42;
	static final int REFORMAT_KEY_LEN1 = 10;
	static final int REFORMAT_KEY_SRCPOS2 = 42;
	static final int REFORMAT_KEY_POS2 = 52;
	static final int REFORMAT_KEY_LEN2 = 3;
	static final int REFORMAT_KEY_SRCPOS3 = 56;
	static final int REFORMAT_KEY_POS3 = 55;
	static final int REFORMAT_KEY_LEN3 = 4;
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

		cfStepHandler.updateSortStepExecution("prgp4511_step11a");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: SGP7344DPRGP4511_STEP11A Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			Sgp7344dPrgp4511_step11aKeys k = sortRecKeys.get(index);
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
        copyRecordBytes(record, buildRec, 0,0,59);
copyRecordBytes(outrecfillBytes01,buildRec,0,59,69);

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
sortDecider.addSortKeysInfo("Key2"/* name */, JNKEY_POS2/* pos */, JNKEY_LEN2/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key3"/* name */, JNKEY_POS3/* pos */, JNKEY_LEN3/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key4"/* name */, JNKEY_POS4/* pos */, JNKEY_LEN4/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key5"/* name */, JNKEY_POS5/* pos */, JNKEY_LEN5/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn1RecKeys(sortProcesser.getKeys());
	}

private void processJoinKeys2() throws Exception {	
		String inFileName = filePath + sortIn1.getAccessFileName(sortIn1.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn1.getFileName(), sortIn1.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key6"/* name */, JNKEY_POS6/* pos */, JNKEY_LEN6/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key7"/* name */, JNKEY_POS7/* pos */, JNKEY_LEN7/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key8"/* name */, JNKEY_POS8/* pos */, JNKEY_LEN8/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key9"/* name */, JNKEY_POS9/* pos */, JNKEY_LEN9/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key10"/* name */, JNKEY_POS10/* pos */, JNKEY_LEN10/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key11"/* name */, JNKEY_POS11/* pos */, JNKEY_LEN11/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn2RecKeys(sortProcesser.getKeys());
		sortDetail.setRecInCounter(sortDetail.getJn1RecKeys().size() + sortDetail.getJn2RecKeys().size());
	}	

	
	public void processReformat() throws Exception {
        reformatbeforeStep();
        doPresetForRead();

       List<InMemoryKeySortKeyObject> joinRecKeys1 =  sortDetail.getJn1RecKeys().stream()
				.filter(jk1 -> !sortDetail.getJn2RecKeys().contains(jk1)).collect(Collectors.toList());
		byte[]  fillEmptySpaces = convertChar2EbcdicBytes(CFUtil.fillSpaces(REFORMAT_KEY_LEN));
    	for (int i=0; i<joinRecKeys1.size(); i++) {
    		byte[] outRecBytes = new byte[REFORMAT_KEY_LEN];
			byte[] key = getJnReturnRecord(joinRecKeys1.get(i),0);
			copyRecordBytes(fillEmptySpaces, outRecBytes, 0, 0, REFORMAT_KEY_LEN);
			copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS0, REFORMAT_KEY_POS0, REFORMAT_KEY_LEN0);
			copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
			copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS2, REFORMAT_KEY_POS2, REFORMAT_KEY_LEN2);
			copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS3, REFORMAT_KEY_POS3, REFORMAT_KEY_LEN3);
			addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
			reformatCount++;
		}
		sortDetail.setRecInCounter(reformatCount);
		logger.info("STEPNAME: PRGP4511_STEP11A Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<Sgp7344dPrgp4511_step11aKeys> sortRecKeys = sortDetail.getSortRecKeys();
		Sgp7344dPrgp4511_step11aKeys relKey = new Sgp7344dPrgp4511_step11aKeys();
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
