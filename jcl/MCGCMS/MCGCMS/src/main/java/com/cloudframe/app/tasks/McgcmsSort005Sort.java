package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.McgcmsSort005Detail;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import com.cloudframe.app.sort.file.McgcmsSort005SortIn;
import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.file.records.McgcmsSort005Keys;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.McgcmsSort005SortIn;
import java.io.FileNotFoundException;
import com.cloudframe.app.sort.file.McgcmsSort005SortOut;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class McgcmsSort005Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort005Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort005")
	McgcmsSort005Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort005SortOut")
	McgcmsSort005SortOut sortOut;
	

	
	@Autowired
	@Qualifier("McgcmsSort005SortIn")
	McgcmsSort005SortIn sortIn;
	
	
    int recordCount = 0;


    static final int OUTREC_SIZE = 62;    
	int recordLen = 0;
	


    final byte[] fillBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes3 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));


	static final int OUTREC_POS1=68;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=43;
	static final int OUTREC_POS4=0;
	static final int OUTREC_POS5=54;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=58;
	static final int OUTREC_POS8=0;
	static final int OUTREC_POS9=70;
	static final int OUTREC_LEN1=1;
	static final int OUTREC_LEN2=1;
	static final int OUTREC_LEN3=7;
	static final int OUTREC_LEN4=1;
	static final int OUTREC_LEN5=4;
	static final int OUTREC_LEN6=1;
	static final int OUTREC_LEN7=10;
	static final int OUTREC_LEN8=1;
	static final int OUTREC_LEN9=10;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=1;
	static final int OUTREC_DES_POS3=2;
	static final int OUTREC_DES_POS4=9;
	static final int OUTREC_DES_POS5=10;
	static final int OUTREC_DES_POS6=20;
	static final int OUTREC_DES_POS7=21;
	static final int OUTREC_DES_POS8=41;
	static final int OUTREC_DES_POS9=42;
    private String filePath = "";

	List<McgcmsSort005Keys> sortRecKeys = null;
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
	static final int KEY_POS0 = 43;
	static final int KEY_POS1 = 68;
	static final int KEY_POS2 = 69;
	static final int KEY_LEN0 = 7;
	static final int KEY_LEN1 = 1;
	static final int KEY_LEN2 = 1;
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
            byte[] outRecBytes = getOutRecord(i); 
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("sort005");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCGCMSSORT005 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			McgcmsSort005Keys k = sortRecKeys.get(index);
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
             copyRecordBytes(fillBytes,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS4,OUTREC_DES_POS4,OUTREC_LEN4);
copyToRecordFormatBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5,"BI","ZD",false);
             copyRecordBytes(fillBytes2,recBytes,OUTREC_POS6,OUTREC_DES_POS6,OUTREC_LEN6);
copyHexRecordBytes(record, recBytes, OUTREC_POS7, OUTREC_DES_POS7,OUTREC_LEN7);
             copyRecordBytes(fillBytes3,recBytes,OUTREC_POS8,OUTREC_DES_POS8,OUTREC_LEN8);
copyHexRecordBytes(record, recBytes, OUTREC_POS9, OUTREC_DES_POS9,OUTREC_LEN9);

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
		List<McgcmsSort005Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort005Keys relKey = new McgcmsSort005Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
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
                   McgcmsSort005Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(McgcmsSort005Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
                   .thenComparing(McgcmsSort005Keys.getKeyCharacter3Comparator(true/*isAscending*/))               
		);
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		Comparator<McgcmsSort005Keys> sortComp = sortDetail.getSortComp();

		List<McgcmsSort005Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
