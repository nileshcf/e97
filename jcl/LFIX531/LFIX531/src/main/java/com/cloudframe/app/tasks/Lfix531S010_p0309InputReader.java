package com.cloudframe.app.tasks;

import java.util.List;
import java.util.ArrayList;

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
import com.cloudframe.app.sort.file.records.Lfix531S010_p0309Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Lfix531S010_p0309Detail;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn0;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn1;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn2;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn3;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn4;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn5;
import com.cloudframe.app.sort.file.Lfix531S010_p0309SortIn6;
public class Lfix531S010_p0309InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Lfix531S010_p0309InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_lfix531s010_p0309")
	Lfix531S010_p0309Detail sortDetail;
	
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
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_LEN0 = 3;
    private String filePath = "";
    
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
		return ExitStatus.COMPLETED;
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

}
