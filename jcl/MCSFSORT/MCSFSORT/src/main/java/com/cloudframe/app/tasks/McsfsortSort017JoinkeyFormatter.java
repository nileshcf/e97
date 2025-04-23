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
import com.cloudframe.app.sort.file.McsfsortSort017SortIn0;
import com.cloudframe.app.sort.file.McsfsortSort017SortIn1;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.sort.file.McsfsortSort017SortOut;
import com.cloudframe.app.sort.file.records.McsfsortSort017Keys;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McsfsortSort017Detail;
import com.cloudframe.app.data.Field;

public class McsfsortSort017JoinkeyFormatter extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(McsfsortSort017JoinkeyFormatter.class);

	private String useTempFile = "yes";

	@Autowired
	@Qualifier("batch_mcsfsortsort017")
	McsfsortSort017Detail sortDetail;
	
	@Autowired
	@Qualifier("McsfsortSort017SortOut")
	McsfsortSort017SortOut sortOut;
	
	
    /**
	 * Executor Service Initialize is used for SORT statements Creates an Executor
	 * that uses a single worker thread operating off an unbounded queue.
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		startExecutorServ();
	}

	@Autowired
	@Qualifier("McsfsortSort017SortIn0")
	McsfsortSort017SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McsfsortSort017SortIn1")
	McsfsortSort017SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
    private String filePath = "";
	int reformatCount = 0;
	static final int REFORMAT_KEY_LEN = 200;
	static final int REFORMAT_KEY_SRCPOS0 = 0;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 100;
	static final int REFORMAT_KEY_SRCPOS1 = 0;
	static final int REFORMAT_KEY_POS1 = 100;
	static final int REFORMAT_KEY_LEN1 = 100;


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
			addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
			reformatCount++;
		}
		sortDetail.setRecInCounter(reformatCount);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.info("STEPNAME: MCSFSORTSORT017 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<McsfsortSort017Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McsfsortSort017Keys relKey = new McsfsortSort017Keys();
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
