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
import com.cloudframe.app.sort.file.records.McgcmsSort011Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort011Detail;
import com.cloudframe.app.sort.file.McgcmsSort011SortIn;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut1;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut2;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut3;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut4;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut5;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut6;
public class McgcmsSort011InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort011InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_mcgcmssort011")
	McgcmsSort011Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort011SortIn")
	McgcmsSort011SortIn sortIn;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut0")
	McgcmsSort011SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut1")
	McgcmsSort011SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut2")
	McgcmsSort011SortOut2 sortOut2;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut3")
	McgcmsSort011SortOut3 sortOut3;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut4")
	McgcmsSort011SortOut4 sortOut4;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut5")
	McgcmsSort011SortOut5 sortOut5;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut6")
	McgcmsSort011SortOut6 sortOut6;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
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
		if(isUsingSortInFile())  setRecPos(0);	 
		record = sortIn.readRecord();					
		while (!sortIn.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn.readRecord();
		}
        sortDetail.setRecInCounter(recCounter);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
		return ExitStatus.COMPLETED;
	}

	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<McgcmsSort011Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort011Keys relKey = new McgcmsSort011Keys();
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

}
