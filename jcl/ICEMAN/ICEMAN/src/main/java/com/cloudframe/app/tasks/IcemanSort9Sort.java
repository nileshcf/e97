package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import com.cloudframe.app.sort.file.records.IcemanSort9Keys;
import java.util.Set;
import org.springframework.batch.core.ExitStatus;
import com.cloudframe.app.sort.file.IcemanSort9SortOut;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import java.util.HashSet;
import java.util.stream.Collectors;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.IcemanSort9SortIn;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import com.cloudframe.app.sort.file.IcemanSort9SortIn;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import com.cloudframe.app.sort.IcemanSort9Detail;
import java.util.Arrays; 
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class IcemanSort9Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(IcemanSort9Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_icemansort9")
	IcemanSort9Detail sortDetail;
	
	@Autowired
	@Qualifier("IcemanSort9SortOut")
	IcemanSort9SortOut sortOut;
	

	
	@Autowired
	@Qualifier("IcemanSort9SortIn")
	IcemanSort9SortIn sortIn;
	
	
    int recordCount = 0;


    static final int OUTREC_SIZE = 8;    
	int recordLen = 0;
	

	byte[] repBytes = convertChar2EbcdicBytes("0".toCharArray());



	static final int OUTREC_POS1=39;
	static final int OUTREC_POS2=0;
	static final int OUTREC_LEN1=7;
	static final int OUTREC_LEN2=1;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=7;
    private String filePath = "";

	List<IcemanSort9Keys> sortRecKeys = null;
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
	static final int KEY_POS0 = 39;
	static final int KEY_LEN0 = 7;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortDistRecKeys(new HashSet<>());
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
            byte[] outRecBytes = getOutRecord(i); 
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("sort9");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: ICEMANSORT9 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			IcemanSort9Keys k = sortRecKeys.get(index);
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
	private byte[] getOutRecord(int i) {
  		byte[] record = getSortedRecord(i); 
	    recordLen = record.length;
		byte[] recBytes = new byte[recordLen];
			copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
copyRecordBytes(repBytes, recBytes, OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);

		return recBytes;
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
		Set<IcemanSort9Keys> setRecKeys = sortDetail.getSortDistRecKeys();
		IcemanSort9Keys relKey = new IcemanSort9Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
		boolean keyAdded = setRecKeys.add(relKey);
        if(keyAdded && isWriteInTempFile()){
           setRecPos(getRecPos() + byteLen);  /* next record position in tempFile */
           writeToTempFile(recordByte);
        }   
	}
	/**
	 * This Method is used to add sort record with COND
	 * @param
	 */	
    protected void addSortRecordBytes(byte[] record){ 
	   if(((Field.compareByte(record[48],(byte)0x40) > 0) && (Field.compareByte(record[39],(byte)0xFF) != 0))) {
         addRecordBytes4Sorting(record,record.length);
	   }
    }
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   IcemanSort9Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<IcemanSort9Keys> sortComp = sortDetail.getSortComp();

        List<IcemanSort9Keys> sortRecKeys = null;
        Set<IcemanSort9Keys> setRecKeys = sortDetail.getSortDistRecKeys();
        sortRecKeys = setRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
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
