package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.file.McgcmsStep020SortOut;
import com.cloudframe.app.sort.SortProperties;
import com.cloudframe.app.sort.file.McgcmsStep020SortIn1;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.McgcmsStep020SortIn1;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.file.records.McgcmsStep020Keys;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import com.cloudframe.app.sort.file.McgcmsStep020SortIn0;
import java.io.RandomAccessFile;
import java.util.Collections;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.sort.file.McgcmsStep020SortIn0;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.McgcmsStep020Detail;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
public class McgcmsStep020Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsStep020Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmsstep020")
	McgcmsStep020Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsStep020SortOut")
	McgcmsStep020SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsStep020SortIn0")
	McgcmsStep020SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsStep020SortIn1")
	McgcmsStep020SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;



    private String filePath = "";

	List<McgcmsStep020Keys> sortRecKeys = null;
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    private String useTempFile="yes";

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 11;
	static final int JNKEY_LEN0 = 11;
	static final int JNKEY_POS1 = 28;
	static final int JNKEY_LEN1 = 16;
	static final int JNKEY_POS2 = 11;
	static final int JNKEY_LEN2 = 11;
	static final int JNKEY_POS3 = 28;
	static final int JNKEY_LEN3 = 16;
	int reformatCount = 0;
	static final int REFORMAT_KEY_LEN = 41;
	static final int REFORMAT_KEY_SRCPOS1 = 4;
	static final int REFORMAT_KEY_POS1 = 0;
	static final int REFORMAT_KEY_LEN1 = 7;
	static final int REFORMAT_KEY_SRCPOS2 = 11;
	static final int REFORMAT_KEY_POS2 = 7;
	static final int REFORMAT_KEY_LEN2 = 11;
	static final int REFORMAT_KEY_SRCPOS3 = 22;
	static final int REFORMAT_KEY_POS3 = 18;
	static final int REFORMAT_KEY_LEN3 = 22;
	static final int REFORMAT_KEY_SRCPOS4 = 44;
	static final int REFORMAT_KEY_POS4 = 40;
	static final int REFORMAT_KEY_LEN4 = 1;
	static final int REFORMAT_KEY_SRCPOS5 = 44;
	static final int REFORMAT_KEY_POS5 = 41;
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
            byte[] outRecBytes = getSortedRecord(i);
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("step020");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCGCMSSTEP020 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			McgcmsStep020Keys k = sortRecKeys.get(index);
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
        sortProcesser.sort();
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

        List<InMemoryKeySortKeyObject> joinRecKeys1 =  sortDetail.getJn1RecKeys();
        List<InMemoryKeySortKeyObject> joinRecKeys2 =  sortDetail.getJn2RecKeys();
		for (InMemoryKeySortKeyObject jnKey1 : joinRecKeys1) {
			byte[] key = getJnReturnRecord(jnKey1,0);
			joinRecKeys2.stream().filter(k -> (Field.compareBytes(k.getRecordKey(), jnKey1.getRecordKey())==0))
					.forEach(k -> {
						try {
                           byte[] key2 = getJnReturnRecord(k,1);
                           int remainRecLen =  key2.length - 44; // Record Length - Position
						   int totalLen = REFORMAT_KEY_LEN +remainRecLen;
						   byte[] outRecBytes  =  new byte[totalLen]; 
        						copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
        						copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS4, REFORMAT_KEY_POS4, REFORMAT_KEY_LEN4);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS2, REFORMAT_KEY_POS2, REFORMAT_KEY_LEN2);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS3, REFORMAT_KEY_POS3, REFORMAT_KEY_LEN3);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS5, REFORMAT_KEY_POS5, remainRecLen);
							addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
							reformatCount++;
						}catch(Exception e) {
							logger.info("Unable to process JoinKey2 record: {}",e.getMessage());
						}
					});
		}			
		sortDetail.setRecInCounter(reformatCount);
		logger.info("STEPNAME: STEP020 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<McgcmsStep020Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsStep020Keys relKey = new McgcmsStep020Keys();
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
