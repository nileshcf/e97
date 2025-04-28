package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn4;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn5;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn2;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn6;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn3;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn3;

import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn5;
import org.springframework.batch.repeat.RepeatStatus;
import com.cloudframe.app.sort.Lfix531S010_p0309Detail;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn4;
import java.util.List;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn6;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn0;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn1;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortOut;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn1;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn2;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.cloudframe.app.sort.file.records.Lfix531S010_p0309Keys;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn0;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class Lfix531S010_p0309Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Lfix531S010_p0309Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_lfix531s010_p0309")
	Lfix531S010_p0309Detail sortDetail;
	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortOut")
	Lfix531S010_p0309SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortIn0")
	Lfix531S010_p0309SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortIn1")
	Lfix531S010_p0309SortIn1 sortIn1;
	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortIn2")
	Lfix531S010_p0309SortIn2 sortIn2;
	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortIn3")
	Lfix531S010_p0309SortIn3 sortIn3;
	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortIn4")
	Lfix531S010_p0309SortIn4 sortIn4;
	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortIn5")
	Lfix531S010_p0309SortIn5 sortIn5;
	
	@Autowired
	@Qualifier("Lfix531S010_p0309SortIn6")
	Lfix531S010_p0309SortIn6 sortIn6;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	RandomAccessFile raFile2;
	
	RandomAccessFile raFile3;
	
	RandomAccessFile raFile4;
	
	RandomAccessFile raFile5;
	
	RandomAccessFile raFile6;
	
	
    int recordCount = 0;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_REC_SIZE = 81;
    static final int OUTFIL_BUILD_REC_SIZE0 = 81;
	static final int OUTFIL_BUILD_SRCPOS00 = 0;
	static final int OUTFIL_BUILD_POS00 = 0;
	static final int OUTFIL_BUILD_LEN00 = 67;
	static final int OUTFIL_BUILD_SRCPOS01 = 0;
	static final int OUTFIL_BUILD_POS01 = 67;
	static final int OUTFIL_BUILD_LEN01 = 14;


	byte[] outfilBuildLtrl00 = convertChar2EbcdicBytes("END 00000000 00000001 00000000 00000000 00000000 000X00000 00000000".toCharArray());
	final byte[] outfilBuildLtrl01 = convertChar2EbcdicBytes(CFUtil.fillSpaces(14));
    private String filePath = "";

	List<Lfix531S010_p0309Keys> sortRecKeys = null;
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_LEN0 = 3;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		sortIn0.open("r", sortIn0.getFileName(), sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortIn1.open("r", sortIn1.getFileName(), sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortIn2.open("r", sortIn2.getFileName(), sortIn2.getRecordLen(), sortIn2.isFBRec());
		sortIn3.open("r", sortIn3.getFileName(), sortIn3.getRecordLen(), sortIn3.isFBRec());
		sortIn4.open("r", sortIn4.getFileName(), sortIn4.getRecordLen(), sortIn4.isFBRec());
		sortIn5.open("r", sortIn5.getFileName(), sortIn5.getRecordLen(), sortIn5.isFBRec());
		sortIn6.open("r", sortIn6.getFileName(), sortIn6.getRecordLen(), sortIn6.isFBRec());
		initializeSort();
	try {
	   processRead();
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
            byte[] outRecBytes = buildOutRecBytes(getSortedRecord(i),0,OUTFIL_BUILD_REC_SIZE);
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("s010_p0309");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn0.close();
		sortIn1.close();
		sortIn2.close();
		sortIn3.close();
		sortIn4.close();
		sortIn5.close();
		sortIn6.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: LFIX531S010_P0309 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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


	/**
	 * This method return sorted record data as byte array
	 * 
	 * @return
	 */ 
	private byte[] getSortedRecord(int index) {
		try {
			Lfix531S010_p0309Keys k = sortRecKeys.get(index);
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

		    // File 2
		    raFile2 = new RandomAccessFile(new File(filePath + sortIn2.getFileName()), "rw");

		    // File 3
		    raFile3 = new RandomAccessFile(new File(filePath + sortIn3.getFileName()), "rw");

		    // File 4
		    raFile4 = new RandomAccessFile(new File(filePath + sortIn4.getFileName()), "rw");

		    // File 5
		    raFile5 = new RandomAccessFile(new File(filePath + sortIn5.getFileName()), "rw");

		    // File 6
		    raFile6 = new RandomAccessFile(new File(filePath + sortIn6.getFileName()), "rw");

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
	        case 6:// File 6
				   raFile6.seek(offSet);	// Record Position
	               raFile6.read(data);	// read record
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
		    raFile6.close();
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
		    copyRecordBytes(outfilBuildLtrl00, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS00, OUTFIL_BUILD_LEN00);
		    copyRecordBytes(outfilBuildLtrl01, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS01, OUTFIL_BUILD_LEN01);
			break;	
		default:
			copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, buildSize);
			break;
		}
		return outRecBytes;
	}	


	public void processRead() throws Exception {
		byte[] record = null;
		if(isUsingSortInFile())  setRecPos(0); fileIndx=0;	 
		record = sortIn0.readRecord();					
		while (!sortIn0.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn0.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=1;	 
		record = sortIn1.readRecord();					
		while (!sortIn1.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn1.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=2;	 
		record = sortIn2.readRecord();					
		while (!sortIn2.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn2.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=3;	 
		record = sortIn3.readRecord();					
		while (!sortIn3.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn3.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=4;	 
		record = sortIn4.readRecord();					
		while (!sortIn4.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn4.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=5;	 
		record = sortIn5.readRecord();					
		while (!sortIn5.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn5.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=6;	 
		record = sortIn6.readRecord();					
		while (!sortIn6.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn6.readRecord();
		}
        sortDetail.setRecInCounter(recCounter);	
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
		List<Lfix531S010_p0309Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Lfix531S010_p0309Keys relKey = new Lfix531S010_p0309Keys();
        relKey.setKeyBinary1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
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
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   Lfix531S010_p0309Keys.getKeyBinary1Comparator(true/*isAscending*/)               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<Lfix531S010_p0309Keys> sortComp = sortDetail.getSortComp();

		List<Lfix531S010_p0309Keys> sortRecKeys = sortDetail.getSortRecKeys();
        sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());  
        sortDetail.setSortRecKeys(sortRecKeys);	      
		if(isWriteInTempFile()) {
            // Make sure the input file is fully loaded
            boolean isCountMatches = true;
            this.setWriteCounter(sortDetail.getWriteCounter());
               int recordKeyCount = sortRecKeys.size();
               while (isCountMatches) { 
                   isCountMatches = recordKeyCount != getWriteCounter().get();

            }
        }                	
		logger.debug("Sort Processor ended.");
	}
}
