package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.SortProperties;
import java.util.Set;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.file.McgcmsSort009SortIn0;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import com.cloudframe.app.sort.file.records.McgcmsSort009Keys;

import com.cloudframe.app.sort.file.McgcmsSort009SortIn1;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import java.io.RandomAccessFile;
import java.util.Collections;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.McgcmsSort009Detail;
import com.cloudframe.app.sort.file.McgcmsSort009SortIn1;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.McgcmsSort009SortIn0;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.cloudframe.app.sort.file.McgcmsSort009SortOut;
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
public class McgcmsSort009Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort009Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort009")
	McgcmsSort009Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort009SortOut")
	McgcmsSort009SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort009SortIn0")
	McgcmsSort009SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort009SortIn1")
	McgcmsSort009SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount = 0;



	final byte[] outrecwhenBytes00 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] outrecwhenBytes01 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] outrecFillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
	final byte[] outrecBuildLtrl02 = convertChar2EbcdicBytes("*******".toCharArray());
	final byte[] outrecBuildLtrl03 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] outrecBuildLtrl04 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] outrecwhenBytes10 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] outrecwhenBytes11 = convertChar2EbcdicBytes(" ".toCharArray());
	final byte[] outrecBuildLtrl11 = convertChar2EbcdicBytes("*************************".toCharArray());
	final byte[] outrecBuildLtrl12 = convertChar2EbcdicBytes("*******".toCharArray());
	final byte[] outrecBuildLtrl13 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] outrecBuildLtrl14 = convertChar2EbcdicBytes("*******************".toCharArray());
	final byte[] outrecfillBytes20 = convertChar2EbcdicBytes(CFUtil.fillSpaces(136));
	static final int BUILD_OUTREC_SIZE = 136;
    private String filePath = "";

	List<McgcmsSort009Keys> sortRecKeys = null;
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 49;
	static final int JNKEY_LEN0 = 11;
	static final int JNKEY_POS1 = 60;
	static final int JNKEY_LEN1 = 11;
	static final int JNKEY_POS2 = 19;
	static final int JNKEY_LEN2 = 11;
	static final int JNKEY_POS3 = 32;
	static final int JNKEY_LEN3 = 11;
	int reformatCount = 0;
	static final int REFORMAT_KEY_LEN = 197;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 102;
	static final int REFORMAT_KEY_SRCPOS1 = 0;
	static final int REFORMAT_KEY_POS1 = 102;
	static final int REFORMAT_KEY_LEN1 = 95;
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

		cfStepHandler.updateSortStepExecution("sort009");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCGCMSSORT009 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			McgcmsSort009Keys k = sortRecKeys.get(index);
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
        if (Field.compareBytes(record, outrecwhenBytes00, 0, 0, 1, 1)  != 0 && Field.compareBytes(record, outrecwhenBytes01, 102, 0, 1, 1)  != 0) { 
copyRecordBytes(record, buildRec, 19,0,66);
copyRecordBytes(record, buildRec, 172,66,25);
copyRecordBytes(outrecBuildLtrl02, buildRec, 0,91,7); 
copyRecordBytes(outrecBuildLtrl03, buildRec, 0,98,19); 
copyRecordBytes(outrecBuildLtrl04, buildRec, 0,117,19); 
 } else if (Field.compareBytes(record, outrecwhenBytes10, 0, 0, 1, 1)  != 0 && Field.compareBytes(record, outrecwhenBytes11, 102, 0, 1, 1)  == 0) { 
copyRecordBytes(record, buildRec, 19,0,66);
copyRecordBytes(outrecBuildLtrl11, buildRec, 0,66,25); 
copyRecordBytes(outrecBuildLtrl12, buildRec, 0,91,7); 
copyRecordBytes(outrecBuildLtrl13, buildRec, 0,98,19); 
copyRecordBytes(outrecBuildLtrl14, buildRec, 0,117,19); 
 }else  { 
copyRecordBytes(outrecfillBytes20,buildRec,0,0,136);
 }
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
        int f1count = 0;
		int f2count = 0;
		boolean SortKeyF1MoreRecords = true;
		boolean SortKeyF2MoreRecords = true;
		while (SortKeyF1MoreRecords || SortKeyF2MoreRecords) {
			byte[] outRecBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(REFORMAT_KEY_LEN));
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
		logger.info("STEPNAME: SORT009 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<McgcmsSort009Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort009Keys relKey = new McgcmsSort009Keys();
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
