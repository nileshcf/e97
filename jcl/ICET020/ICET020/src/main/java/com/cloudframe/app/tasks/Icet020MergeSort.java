package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.file.Icet020MergeSortIn1;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.Icet020MergeSortOut;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.Icet020MergeSortIn0;
import java.io.File;
import com.cloudframe.app.sort.file.Icet020MergeSortIn1;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.file.Icet020MergeSortIn2;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import com.cloudframe.app.sort.file.records.Icet020MergeKeys;
import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import com.cloudframe.app.sort.file.Icet020MergeSortIn0;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.Icet020MergeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.Icet020MergeSortIn2;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class Icet020MergeSort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Icet020MergeSort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_icet020merge")
	Icet020MergeDetail sortDetail;
	
	@Autowired
	@Qualifier("Icet020MergeSortOut")
	Icet020MergeSortOut sortOut;
	

	
	@Autowired
	@Qualifier("Icet020MergeSortIn0")
	Icet020MergeSortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Icet020MergeSortIn1")
	Icet020MergeSortIn1 sortIn1;
	
	@Autowired
	@Qualifier("Icet020MergeSortIn2")
	Icet020MergeSortIn2 sortIn2;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	RandomAccessFile raFile2;
	
	
    int recordCount = 0;



    private String filePath = "";

	List<Icet020MergeKeys> sortRecKeys = null;
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
	static final int KEY_LEN0 = 4;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		sortIn0.open("r", sortIn0.getFileName(), sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortIn1.open("r", sortIn1.getFileName(), sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortIn2.open("r", sortIn2.getFileName(), sortIn2.getRecordLen(), sortIn2.isFBRec());
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
            byte[] outRecBytes = getSortedRecord(i);
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("merge");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn0.close();
		sortIn1.close();
		sortIn2.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: ICET020MERGE Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			Icet020MergeKeys k = sortRecKeys.get(index);
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
	    } catch (IOException e) {
		   logger.error("Error: Handling Memory Map file - Exception: {} ", e.getMessage());
	    }
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
		List<Icet020MergeKeys> sortRecKeys = sortDetail.getSortRecKeys();
		Icet020MergeKeys relKey = new Icet020MergeKeys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
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
                   Icet020MergeKeys.getKeyCharacter1Comparator(true/*isAscending*/)               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<Icet020MergeKeys> sortComp = sortDetail.getSortComp();

		List<Icet020MergeKeys> sortRecKeys = sortDetail.getSortRecKeys();
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
