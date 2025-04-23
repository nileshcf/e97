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
import com.cloudframe.app.sort.file.McgcmsSort016SortIn0;
import com.cloudframe.app.sort.file.McgcmsSort016SortIn1;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.sort.file.McgcmsSort016SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort016SortOut1;
import com.cloudframe.app.sort.file.records.McgcmsSort016Keys;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort016Detail;
import com.cloudframe.app.data.Field;
import java.util.Arrays;

public class McgcmsSort016JoinkeyFormatter extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort016JoinkeyFormatter.class);

	private String useTempFile = "yes";

	@Autowired
	@Qualifier("batch_mcgcmssort016")
	McgcmsSort016Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort016SortOut0")
	McgcmsSort016SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort016SortOut1")
	McgcmsSort016SortOut1 sortOut1;
	
	
    /**
	 * Executor Service Initialize is used for SORT statements Creates an Executor
	 * that uses a single worker thread operating off an unbounded queue.
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		startExecutorServ();
	}

	@Autowired
	@Qualifier("McgcmsSort016SortIn0")
	McgcmsSort016SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort016SortIn1")
	McgcmsSort016SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
    private String filePath = "";
	int reformatCount = 0;
	static final int REFORMAT_KEY_LEN = 170;
	static final int REFORMAT_KEY_SRCPOS0 = 2;
	static final int REFORMAT_KEY_POS0 = 0;
	static final int REFORMAT_KEY_LEN0 = 11;
	static final int REFORMAT_KEY_SRCPOS1 = 14;
	static final int REFORMAT_KEY_POS1 = 11;
	static final int REFORMAT_KEY_LEN1 = 30;
	static final int REFORMAT_KEY_SRCPOS2 = 11;
	static final int REFORMAT_KEY_POS2 = 41;
	static final int REFORMAT_KEY_LEN2 = 125;
	static final int REFORMAT_KEY_SRCPOS3 = 0;
	static final int REFORMAT_KEY_POS3 = 166;
	static final int REFORMAT_KEY_LEN3 = 1;
	static final int REFORMAT_KEY_SRCPOS4 = 45;
	static final int REFORMAT_KEY_POS4 = 167;
	static final int REFORMAT_KEY_LEN4 = 3;


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

        List<InMemoryKeySortKeyObject> joinRecKeys1 =  sortDetail.getJn1RecKeys();
        List<InMemoryKeySortKeyObject> joinRecKeys2 =  sortDetail.getJn2RecKeys();
		for (InMemoryKeySortKeyObject jnKey1 : joinRecKeys1) {
			byte[] key = getJnReturnRecord(jnKey1,0);
			joinRecKeys2.stream().filter(k -> (Field.compareBytes(k.getRecordKey(), jnKey1.getRecordKey())==0))
					.forEach(k -> {
						try {
                           byte[] key2 = getJnReturnRecord(k,1);
			               byte[] outRecBytes  =  new byte[REFORMAT_KEY_LEN];  
        						copyRecordBytes(key, outRecBytes, REFORMAT_KEY_SRCPOS2, REFORMAT_KEY_POS2, REFORMAT_KEY_LEN2);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS0, REFORMAT_KEY_POS0, REFORMAT_KEY_LEN0);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS1, REFORMAT_KEY_POS1, REFORMAT_KEY_LEN1);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS3, REFORMAT_KEY_POS3, REFORMAT_KEY_LEN3);
		    					copyRecordBytes(key2, outRecBytes, REFORMAT_KEY_SRCPOS4, REFORMAT_KEY_POS4, REFORMAT_KEY_LEN4);
							addRecordBytes4Sorting(outRecBytes,outRecBytes.length);
							reformatCount++;
						}catch(Exception e) {
							logger.info("Unable to process JoinKey2 record: {}",e.getMessage());
						}
					});
		}			
		sortDetail.setRecInCounter(reformatCount);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.info("STEPNAME: MCGCMSSORT016 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<McgcmsSort016Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort016Keys relKey = new McgcmsSort016Keys();
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
