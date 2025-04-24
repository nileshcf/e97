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
import com.cloudframe.app.sort.file.records.SortvsamVsam2qsamKeys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.SortvsamVsam2qsamDetail;
import com.cloudframe.app.vsam.VSAMRecordData;
import com.cloudframe.app.vsam.dao.VsamRepository;
public class SortvsamVsam2qsamInputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(SortvsamVsam2qsamInputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_sortvsamvsam2qsam")
	SortvsamVsam2qsamDetail sortDetail;
	
    @Autowired 
    @Qualifier("vsamRepository")
    public VsamRepository  vsamRepos;
    
	@Value("${cf.sort.vsam.sortin:1}")
	private int noOfInFile;  

	private String vsamPropName = "SortvsamVsam2qsamSortIn";
	List<VSAMRecordData> result = null;
    private String useTempFile="yes";

    int recCounter = 0;
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		useTempFile = sortDetail.useTempFile(true);		
		initializeSort();
	}

	private void initializeSort() {
        this.setRecPos(0);
        this.setRecIndex(-1);
		this.recCounter = 0;
        useSortTempFile(useTempFile);
	        doSortPresets();
	        this.getWriteCounter().set(0);
	        sortDetail.setWriteCounter(this.getWriteCounter());
	        sortDetail.setSortFile(this.getRaFile());
	        sortDetail.setTempFile(this.getTmpFile());
	        sortDetail.setExecutorService(this.getExecutorService());
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        boolean hasMoreFile = (noOfInFile>1);
		for (int i = 0; i < noOfInFile ; i++) {
			String clusterName = sortDetail.getPropKeyValue(vsamPropName,i,hasMoreFile);
			result = vsamRepos.fetchClusterData(clusterName);        
			for (VSAMRecordData b : result) {
				addSortRecordBytes(b.getRecordData());
			}
			recCounter += result.size();
			result = null;
		}	
        sortDetail.setRecInCounter(recCounter);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
		return ExitStatus.COMPLETED;
	}

	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<SortvsamVsam2qsamKeys> sortRecKeys = sortDetail.getSortRecKeys();
		SortvsamVsam2qsamKeys relKey = new SortvsamVsam2qsamKeys();
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
		sortRecKeys.add(relKey);
            setRecPos(getRecPos() + byteLen); /* next record position in tempFile */
            writeToTempFile(recordByte);
	}

	/**
	 * This Method is used to add sort record with COND
	 * @param
	 */	
    protected void addSortRecordBytes(byte[] record){ 
         addRecordBytes4Sorting(record,record.length);
    }

}
