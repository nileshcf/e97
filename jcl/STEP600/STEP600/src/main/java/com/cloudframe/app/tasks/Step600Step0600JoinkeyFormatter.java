package com.cloudframe.app.tasks;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Collections;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.Comparator;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.Step600Step0600SortIn0;
import com.cloudframe.app.sort.file.Step600Step0600SortIn1;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.sort.file.Step600Step0600SortOut;
import com.cloudframe.app.sort.file.records.Step600Step0600Keys;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Step600Step0600Detail;
import com.cloudframe.app.data.Field;

public class Step600Step0600JoinkeyFormatter extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(Step600Step0600JoinkeyFormatter.class);

	private String useTempFile = "yes";

	@Autowired
	@Qualifier("batch_step600step0600")
	Step600Step0600Detail sortDetail;
	
	@Autowired
	@Qualifier("Step600Step0600SortOut")
	Step600Step0600SortOut sortOut;
	
	
    /**
	 * Executor Service Initialize is used for SORT statements Creates an Executor
	 * that uses a single worker thread operating off an unbounded queue.
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		startExecutorServ();
	}

	@Autowired
	@Qualifier("Step600Step0600SortIn0")
	Step600Step0600SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Step600Step0600SortIn1")
	Step600Step0600SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
    private String filePath = "";
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

	byte[] unpairedValB = convertChar2EbcdicBytes("B".toCharArray());
	byte[] unpairedVal1 = convertChar2EbcdicBytes("1".toCharArray());

	@Override
	public void beforeStep(StepExecution stepExecution) {
		reformatCount = 0;
    	sortDetail.setTempFileVal(useTempFile);
    	useSortTempFile(useTempFile);
    	doSortPresets();
		sortDetail.setSortFile(this.getRaFile());
		sortDetail.setTempFile(this.getTmpFile());
        sortDetail.setWriteCounter(this.getWriteCounter());		
		sortDetail.setExecutorService(this.getExecutorService());
        configMemoryMapFile();
		logger.debug("Joinkey Formatter initialized.");
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
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
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.info("STEPNAME: STEP600STEP0600 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
	    clearMemoryMapFile();
		logger.debug("JoinKey Formatter ended.");
		return ExitStatus.COMPLETED;
	}

	private byte[] getJnReturnRecord(InMemoryKeySortKeyObject k, int index) throws Exception {
		return readFromBuffer(k.getMemoryOffset(), k.getRecordLength(), index);
	}   

	/**
	 * This Method is used to add Reformatted record bytes value
	 * into Sort keys to perform sort.
	 * 
	 * @param
	 */
     public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) { 
		Field field = new Field(); 
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

   private void configMemoryMapFile() {
	    try {
		    // File 0
		    raFile0 = new RandomAccessFile(new File(filePath + sortIn0.getFileName()), "rw");

		    // File 1
		    raFile1 = new RandomAccessFile(new File(filePath + sortIn1.getFileName()), "rw");

	    } catch (FileNotFoundException e) {
		    logger.error("Random Access File Error : {} ", e.getMessage());
		}    
	}

    protected byte[] readFromBuffer(long offSet, int dataLen, int fileInID) throws IOException {
	    byte[] data = new byte[dataLen];
	    switch (fileInID) {
	        case 0:// File 0
				   raFile0.seek(offSet);	// Start Position
	               raFile0.read(data);	// Record Bytes
                break;
	        case 1:// File 1
				   raFile1.seek(offSet);	// Start Position
	               raFile1.read(data);	// Record Bytes
                break;
	        default:
		        break;
	    }
	    return data;
    }

	protected void clearMemoryMapFile() {
	    try {
            raFile0.close();
            raFile1.close();
	    } catch (IOException e) {
		   logger.error("Error: cleaning up Memory Map File - Exception: {} ", e.getMessage());
	    }
	}

}
