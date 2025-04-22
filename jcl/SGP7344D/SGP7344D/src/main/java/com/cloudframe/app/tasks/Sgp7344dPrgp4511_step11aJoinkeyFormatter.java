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
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortIn0;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortIn1;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11aSortOut;
import com.cloudframe.app.sort.file.records.Sgp7344dPrgp4511_step11aKeys;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sgp7344dPrgp4511_step11aDetail;
import com.cloudframe.app.data.Field;

public class Sgp7344dPrgp4511_step11aJoinkeyFormatter extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(Sgp7344dPrgp4511_step11aJoinkeyFormatter.class);

	private String useTempFile = "yes";

	@Autowired
	@Qualifier("batch_sgp7344dprgp4511_step11a")
	Sgp7344dPrgp4511_step11aDetail sortDetail;
	
	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11aSortOut")
	Sgp7344dPrgp4511_step11aSortOut sortOut;
	
	
    /**
	 * Executor Service Initialize is used for SORT statements Creates an Executor
	 * that uses a single worker thread operating off an unbounded queue.
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		startExecutorServ();
	}

	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11aSortIn0")
	Sgp7344dPrgp4511_step11aSortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11aSortIn1")
	Sgp7344dPrgp4511_step11aSortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
    private String filePath = "";
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
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.info("STEPNAME: SGP7344DPRGP4511_STEP11A Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<Sgp7344dPrgp4511_step11aKeys> sortRecKeys = sortDetail.getSortRecKeys();
		Sgp7344dPrgp4511_step11aKeys relKey = new Sgp7344dPrgp4511_step11aKeys();
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
