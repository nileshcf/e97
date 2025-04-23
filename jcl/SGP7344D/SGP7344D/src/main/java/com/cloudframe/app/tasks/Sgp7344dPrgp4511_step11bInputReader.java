package com.cloudframe.app.tasks;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import java.util.Arrays; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.records.Sgp7344dPrgp4511_step11bKeys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sgp7344dPrgp4511_step11bDetail;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11bSortIn0;
import com.cloudframe.app.sort.file.Sgp7344dPrgp4511_step11bSortIn1;
public class Sgp7344dPrgp4511_step11bInputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Sgp7344dPrgp4511_step11bInputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_sgp7344dprgp4511_step11b")
	Sgp7344dPrgp4511_step11bDetail sortDetail;
	
	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11bSortIn0")
	Sgp7344dPrgp4511_step11bSortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Sgp7344dPrgp4511_step11bSortIn1")
	Sgp7344dPrgp4511_step11bSortIn1 sortIn1;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_LEN0 = 55;
     byte[] filter1 = convertChar2EbcdicBytes("TRL".toCharArray());
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortDistRecKeys(new HashSet<>());
		sortIn0.open("r", sortIn0.getFileName(), sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortIn1.open("r", sortIn1.getFileName(), sortIn1.getRecordLen(), sortIn1.isFBRec());
		initializeSort();
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

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
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
        sortDetail.setRecInCounter(recCounter);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn0.close();
		sortIn1.close();
		logger.debug("Sort input Reader ended.");
		return ExitStatus.COMPLETED;
	}

	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		Set<Sgp7344dPrgp4511_step11bKeys> setRecKeys = sortDetail.getSortDistRecKeys();
		Sgp7344dPrgp4511_step11bKeys relKey = new Sgp7344dPrgp4511_step11bKeys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
        relKey.setFileIndx(fileIndx);
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
	   if(!((Field.compareBytes(record,filter1,0,0,3,3) == 0))) {
         addRecordBytes4Sorting(record,record.length);
	   }
    }

}
