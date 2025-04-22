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
import com.cloudframe.app.sort.file.McgcmsSort009SortIn0;
import com.cloudframe.app.sort.file.McgcmsSort009SortIn1;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.sort.file.McgcmsSort009SortOut;
import com.cloudframe.app.sort.file.records.McgcmsSort009Keys;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort009Detail;
import com.cloudframe.app.data.Field;

public class McgcmsSort009JoinkeyFormatter extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort009JoinkeyFormatter.class);

	private String useTempFile = "yes";

	@Autowired
	@Qualifier("batch_mcgcmssort009")
	McgcmsSort009Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort009SortOut")
	McgcmsSort009SortOut sortOut;
	
	
    /**
	 * Executor Service Initialize is used for SORT statements Creates an Executor
	 * that uses a single worker thread operating off an unbounded queue.
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		startExecutorServ();
	}

	@Autowired
	@Qualifier("McgcmsSort009SortIn0")
	McgcmsSort009SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort009SortIn1")
	McgcmsSort009SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
    private String filePath = "";
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
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.info("STEPNAME: MCGCMSSORT009 Joinkey Formatter execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), reformatCount);
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
		List<McgcmsSort009Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort009Keys relKey = new McgcmsSort009Keys();
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
