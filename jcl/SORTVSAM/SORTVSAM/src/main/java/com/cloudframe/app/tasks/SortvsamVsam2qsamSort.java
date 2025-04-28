package com.cloudframe.app.tasks;
import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.InitializingBean;
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
import com.cloudframe.app.sort.file.SortvsamVsam2qsamSortOut;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.SortvsamVsam2qsamDetail;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.vsam.VSAMRecordData;
import com.cloudframe.app.vsam.dao.VsamRepository;
import java.util.List;
import java.util.Comparator;
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

import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.SortvsamVsam2qsamDetail;
import org.springframework.beans.factory.annotation.Value;
public class SortvsamVsam2qsamSort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(SortvsamVsam2qsamSort.class);

/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    @Autowired 
    @Qualifier("vsamRepository")
    public VsamRepository  vsamRepos;
    
	@Value("${cf.sort.vsam.sortin:1}")
	private int noOfInFile;  

	private String vsamPropName = "SortvsamVsam2qsamSortIn";
	List<VSAMRecordData> result = null;
    private String useTempFile="yes";

    int recCounter = 0;
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_sortvsamvsam2qsam")
	SortvsamVsam2qsamDetail sortDetail;
	
	@Autowired
	@Qualifier("SortvsamVsam2qsamSortOut")
	SortvsamVsam2qsamSortOut sortOut;
	


	
	
    int recordCount = 0;



    private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
	    useSortTempFile(sortDetail.getTempFileVal());
		sortOut.open("w", filePath + sortOut.getFileName(), sortOut.getRecordLen(), sortOut.isFBRec());  
            this.setRaFile(sortDetail.getRaFile());
            this.setTmpFile(sortDetail.getTempFile());
            this.setExecutorService(sortDetail.getExecutorService());
		logger.debug("Sort Writer initialized.");
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// FileOut write process begin, Extract sorted record and write it to the output file
        boolean hasMoreFile = (noOfInFile>1);
		for (int i = 0; i < noOfInFile ; i++) {
			String clusterName = sortDetail.getPropKeyValue(vsamPropName,i,hasMoreFile);
			result = vsamRepos.fetchClusterData(clusterName);        
			for (VSAMRecordData b : result) {
				sortOut.setRecord(b.getRecordData(), sortOut.getRecordLen());
                sortOut.write();
                recordCount++;
			}
			recCounter += result.size();
			result = null;
		}	
		cfStepHandler.updateSortStepExecution("vsam2qsam");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: SORTVSAMVSAM2QSAM Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

			stopExecutorServ();
		removeTempFile();
		logger.debug("Sort Writer ended.");
		SpringContextHandler.handleDispPostionAtStepEnd(true);
		return ExitStatus.COMPLETED;
	}



	  
	  
	  
	  







}
