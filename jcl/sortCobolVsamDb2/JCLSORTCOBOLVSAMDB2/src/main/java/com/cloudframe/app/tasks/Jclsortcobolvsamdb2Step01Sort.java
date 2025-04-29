package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.file.Jclsortcobolvsamdb2Step01SortIn;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.Jclsortcobolvsamdb2Step01Detail;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import com.cloudframe.app.sort.file.Jclsortcobolvsamdb2Step01SortOut;
import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.file.records.Jclsortcobolvsamdb2Step01Keys;
import org.springframework.batch.core.StepExecution;
import com.cloudframe.app.sort.file.Jclsortcobolvsamdb2Step01SortIn;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class Jclsortcobolvsamdb2Step01Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Jclsortcobolvsamdb2Step01Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_jclsortcobolvsamdb2step01")
	Jclsortcobolvsamdb2Step01Detail sortDetail;
	
	@Autowired
	@Qualifier("Jclsortcobolvsamdb2Step01SortOut")
	Jclsortcobolvsamdb2Step01SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Jclsortcobolvsamdb2Step01SortIn")
	Jclsortcobolvsamdb2Step01SortIn sortIn;
	
	
    int recordCount = 0;



    private String filePath = "";

	List<Jclsortcobolvsamdb2Step01Keys> sortRecKeys = null;
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

    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_POS1 = 16;
	static final int KEY_POS2 = 26;
	static final int KEY_LEN0 = 16;
	static final int KEY_LEN1 = 10;
	static final int KEY_LEN2 = 10;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
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
		    createRandomAccessFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
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

		cfStepHandler.updateSortStepExecution("step01");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: JCLSORTCOBOLVSAMDB2STEP01 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

		sortRecKeys.clear();
		if(isWriteInTempFile()) {
			stopExecutorServ();
		}
		removeTempFile();	
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
			Jclsortcobolvsamdb2Step01Keys k = sortRecKeys.get(index);
			return readFromBuffer(k.getSortRecPos(), k.getSortRecLen());
		} catch (Exception e) {
			logger.error("Error in return record : {}", e.getMessage());
		}
		return new byte[0];
	}

    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }
	  
	  
	  
	  



	public void processRead() throws Exception {
		byte[] record = null;
		if(isUsingSortInFile())  setRecPos(0);	 
		record = sortIn.readRecord();					
		while (!sortIn.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn.readRecord();
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
		List<Jclsortcobolvsamdb2Step01Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Jclsortcobolvsamdb2Step01Keys relKey = new Jclsortcobolvsamdb2Step01Keys();
        relKey.setKeyCharacter1(getZoneDecimalRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
        relKey.setKeyCharacter2(getRecordKeyBytes(recordByte, KEY_POS1 , KEY_LEN1)); 
        relKey.setKeyCharacter3(getRecordKeyBytes(recordByte, KEY_POS2 , KEY_LEN2)); 
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
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
                   Jclsortcobolvsamdb2Step01Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(Jclsortcobolvsamdb2Step01Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
                   .thenComparing(Jclsortcobolvsamdb2Step01Keys.getKeyCharacter3Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<Jclsortcobolvsamdb2Step01Keys> sortComp = sortDetail.getSortComp();

		List<Jclsortcobolvsamdb2Step01Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
