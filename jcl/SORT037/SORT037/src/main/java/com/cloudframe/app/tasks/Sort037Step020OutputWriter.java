package com.cloudframe.app.tasks;

import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;
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
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.Sort037Step020SortIn0;
import com.cloudframe.app.sort.file.Sort037Step020SortIn1;
import com.cloudframe.app.sort.file.Sort037Step020SortIn2;
import com.cloudframe.app.sort.file.Sort037Step020SortIn3;
import com.cloudframe.app.sort.file.Sort037Step020SortIn4;
import com.cloudframe.app.sort.file.Sort037Step020SortIn5;
import com.cloudframe.app.sort.file.Sort037Step020SortOut0;
import com.cloudframe.app.sort.file.Sort037Step020SortOut1;
import com.cloudframe.app.sort.file.records.Sort037Step020Keys;
import com.cloudframe.app.sort.file.records.Sort037Step020JoinKeys;
import com.cloudframe.app.sort.model.AbstractSortKeyObject;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import java.util.Comparator;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sort037Step020Detail;
import com.cloudframe.app.data.Field;
public class Sort037Step020OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Sort037Step020OutputWriter.class);
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
	

    private String useTempFile="no";    
	
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
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
	    sortDetail.setTempFileVal(useTempFile);
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
}
