package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.file.Sort037Step020SortIn0;
import com.cloudframe.app.sort.file.Sort037Step020SortIn5;
import com.cloudframe.app.sort.SortProperties;
import java.util.Set;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.records.Sort037Step020Keys;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.utility.CFFile;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.Sort037Step020SortIn5;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.sort.file.Sort037Step020SortIn2;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import com.cloudframe.app.sort.Sort037Step020Detail;
import com.cloudframe.app.sort.file.records.Sort037Step020JoinKeys;
import org.springframework.context.annotation.Lazy;
import java.util.List;
import com.cloudframe.app.sort.file.Sort037Step020SortIn0;
import com.cloudframe.app.sort.file.Sort037Step020SortIn3;
import com.cloudframe.app.sort.file.Sort037Step020SortOut1;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.file.Sort037Step020SortIn1;
import com.cloudframe.app.sort.file.Sort037Step020SortIn4;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.Sort037Step020SortIn1;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.Sort037Step020SortIn2;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.cloudframe.app.sort.file.Sort037Step020SortIn3;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import org.springframework.batch.core.StepExecution;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.sort.file.Sort037Step020SortOut0;
import com.cloudframe.app.sort.file.Sort037Step020SortIn4;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
public class Sort037Step020Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Sort037Step020Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_sort037step020")
	Sort037Step020Detail sortDetail;
	
	@Autowired
	@Qualifier("Sort037Step020SortOut0")
	Sort037Step020SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("Sort037Step020SortOut1")
	Sort037Step020SortOut1 sortOut1;
	

    private String useOutrecTempFile="no";    
	
	@Autowired
	@Qualifier("Sort037Step020SortIn0")
	Sort037Step020SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn1")
	Sort037Step020SortIn1 sortIn1;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn2")
	Sort037Step020SortIn2 sortIn2;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn3")
	Sort037Step020SortIn3 sortIn3;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn4")
	Sort037Step020SortIn4 sortIn4;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn5")
	Sort037Step020SortIn5 sortIn5;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	RandomAccessFile raFile2;
	
	RandomAccessFile raFile3;
	
	RandomAccessFile raFile4;
	
	RandomAccessFile raFile5;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
	static final int REFORMAT_KEY_LEN = 117;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 58;
	static final int REFORMAT_KEY_SRCPOS1 = 0;
	static final int REFORMAT_KEY_POS1 = 58;
	static final int REFORMAT_KEY_LEN1 = 58;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_REC_SIZE = 50;
    static final int OUTFIL_BUILD_REC_SIZE0 = 50;
    static final int OUTFIL_BUILD_REC_SIZE1 = 50;
	static final int OUTFIL_BUILD_SRCPOS00 = 0;
	static final int OUTFIL_BUILD_POS00 = 0;
	static final int OUTFIL_BUILD_LEN00 = 5;
	static final int OUTFIL_BUILD_SRCPOS01 = 5;
	static final int OUTFIL_BUILD_POS01 = 5;
	static final int OUTFIL_BUILD_LEN01 = 45;
	static final int OUTFIL_BUILD_SRCPOS10 = 0;
	static final int OUTFIL_BUILD_POS10 = 0;
	static final int OUTFIL_BUILD_LEN10 = 5;
	static final int OUTFIL_BUILD_SRCPOS11 = 5;
	static final int OUTFIL_BUILD_POS11 = 5;
	static final int OUTFIL_BUILD_LEN11 = 45;


	byte[] unmatchCond01 = convertChar2EbcdicBytes("1".toCharArray());
	byte[] matchCond11 = convertChar2EbcdicBytes("B".toCharArray());
	byte[] outfilBuildLtrl01 = convertChar2EbcdicBytes(" - DOES NOT HAVE AN MATCH IN THE T002/9Z FILE".toCharArray());
	byte[] outfilBuildLtrl11 = convertChar2EbcdicBytes(" - BASE FILE ENTRY MATCHES THE T002/9Z ENTRY ".toCharArray());
    private String filePath = "";

/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 0;
	static final int JNKEY_LEN0 = 58;
	static final int JNKEY_POS1 = 0;
	static final int JNKEY_LEN1 = 58;
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
       sortProcessor();
	} catch (Exception e) {
	   logger.error("Error in SORT Process : {}", e.getMessage());
	}	
        		
	    sortDetail.setTempFileVal(useOutrecTempFile);
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
		boolean isF1RecMatches = false;

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
			    key2 = getJnReturnRecord(jnKey2,5);
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
			  outRecBytes[116] = matchCond11[0];
			  f1count++;
			  f2count++;
			} else if (compareInt < 0) {
        	   	copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS0, REFORMAT_KEY_POS0, REFORMAT_KEY_LEN0);
			   outRecBytes[116] = unmatchCond01[0];
			   f1count++;
			} else {
		       	copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
				f2count++;
			}		
		  if ((Field.compareBytes(outRecBytes,unmatchCond01,116,0,1,1) == 0)) {
			byte[] buildBytes = buildOutRecBytes(outRecBytes,0,OUTFIL_BUILD_REC_SIZE0);
		  
		    //write into sortOut0 file
			sortOut0.setRecord(buildBytes, sortOut0.getRecordLen());
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,matchCond11,116,0,1,1) == 0)) {
			byte[] buildBytes = buildOutRecBytes(outRecBytes,1,OUTFIL_BUILD_REC_SIZE1);
		  
		    //write into sortOut1 file
			sortOut1.setRecord(buildBytes, sortOut1.getRecordLen());
			sortOut1.write(); recordCount1++;
		  }	
        }

		cfStepHandler.updateSortStepExecution("step020");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: SORT037STEP020 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: SORT037STEP020 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
		if(isWriteInTempFile()) {
			stopExecutorServ();
			removeTempFile();
		} else 
		    clearMemMapFiles();
		logger.debug("Sort Writer ended.");
		SpringContextHandler.handleDispPostionAtStepEnd(true);
        removeTempFile(sortIn5.getFileName());
		return ExitStatus.COMPLETED;
	}

	private byte[] getJnReturnRecord(InMemoryKeySortKeyObject k, int index) throws Exception {
		return readFromBuffer(k.getMemoryOffset(), k.getRecordLength(), index);
	}	


    private void configMemMapFile() {
	    try {
		    // File 0
		    raFile0 = new RandomAccessFile(new File(filePath + sortIn0.getFileName()), "rw");

		    // File 1
		    raFile1 = new RandomAccessFile(new File(filePath + sortIn1.getFileName()), "rw");

		    // File 2
		    raFile2 = new RandomAccessFile(new File(filePath + sortIn2.getFileName()), "rw");

		    // File 3
		    raFile3 = new RandomAccessFile(new File(filePath + sortIn3.getFileName()), "rw");

		    // File 4
		    raFile4 = new RandomAccessFile(new File(filePath + sortIn4.getFileName()), "rw");

		    // File 5
		    raFile5 = new RandomAccessFile(new File(filePath + sortIn5.getFileName()), "rw");

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
	        case 2:// File 2
				   raFile2.seek(offSet);	// Record Position
	               raFile2.read(data);	// read record
                break;
	        case 3:// File 3
				   raFile3.seek(offSet);	// Record Position
	               raFile3.read(data);	// read record
                break;
	        case 4:// File 4
				   raFile4.seek(offSet);	// Record Position
	               raFile4.read(data);	// read record
                break;
	        case 5:// File 5
				   raFile5.seek(offSet);	// Record Position
	               raFile5.read(data);	// read record
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
		    raFile2.close();
		    raFile3.close();
		    raFile4.close();
		    raFile5.close();
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
		    break;
		case 1:
		    copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_SRCPOS10, OUTFIL_BUILD_POS10, OUTFIL_BUILD_LEN10);
		    copyRecordBytes(outfilBuildLtrl11, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS11, OUTFIL_BUILD_LEN11);
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
		List<Sort037Step020Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Sort037Step020Keys relKey = new Sort037Step020Keys();
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
        relKey.setFileIndx(fileIndx);
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
        mergeJnKey2files();
		String inFileName = filePath + sortIn5.getAccessFileName(sortIn5.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn5.getFileName(), sortIn1.getRecordLen());	
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key1"/* name */, JNKEY_POS1/* pos */, JNKEY_LEN1/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn2RecKeys(sortProcesser.getKeys());
		sortDetail.setRecInCounter(sortDetail.getJn1RecKeys().size() + sortDetail.getJn2RecKeys().size());
	}	

	
	private void mergeJnKey2files() throws Exception {
		List<CFFile> jnFiles = new ArrayList<>();
        jnFiles.add(sortIn1);
        jnFiles.add(sortIn2);
        jnFiles.add(sortIn3);
        jnFiles.add(sortIn4);
		sortIn5.open("w",sortIn5.getFileName(),sortIn1.getRecordLen(),sortIn1.isFBRec());
		jnFiles.stream().forEach(f -> {
			try {
				f.open("r", f.getFileName(), sortIn1.getRecordLen(), sortIn1.isFBRec());
				byte[] rec = f.readRecord();
				while (!f.hasEnded() && rec != null) {
					sortIn5.setRecord(rec, rec.length);
					sortIn5.write();
					rec = f.readRecord();
				}
				f.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		sortIn5.close();
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
