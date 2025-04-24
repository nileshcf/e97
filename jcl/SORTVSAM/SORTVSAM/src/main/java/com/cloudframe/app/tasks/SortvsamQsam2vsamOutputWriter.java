package com.cloudframe.app.tasks;

import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
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
import com.cloudframe.app.sort.file.SortvsamQsam2vsamSortIn;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.vsam.VsamJclParser;
import com.cloudframe.app.sort.file.records.SortvsamQsam2vsamKeys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.SortvsamQsam2vsamDetail;
public class SortvsamQsam2vsamOutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(SortvsamQsam2vsamOutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_sortvsamqsam2vsam")
	SortvsamQsam2vsamDetail sortDetail;
	
    @Autowired
    @Qualifier("vsamJclParser")
    VsamJclParser vsamParser;
    
	@Value("${cf.sort.vsam.sortout:1}")
	private int noOfOutFile;    

	@Value("${cf.sort.vsam.sortout.insert.each:1000}")
	private int insertToClusterForEach;	    
	
	private String vsamPropName = "SortvsamQsam2vsamSortOut";
	List<String> outputClusters = new ArrayList<>();	

	
	@Autowired
	@Qualifier("SortvsamQsam2vsamSortIn")
	SortvsamQsam2vsamSortIn sortIn;
	
	
    int recordCount = 0;



    private String filePath = "";
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
	    useSortTempFile(sortDetail.getTempFileVal());

		if (isWriteInTempFile()) {
            this.setRaFile(sortDetail.getRaFile());
            this.setTmpFile(sortDetail.getTempFile());
            this.setExecutorService(sortDetail.getExecutorService());
		} else {
		    createRandomAccessFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<SortvsamQsam2vsamKeys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
        boolean hasMoreFile = (noOfOutFile>1);
		for (int i = 0; i < noOfOutFile; i++) {
			String clusterName = sortDetail.getPropKeyValue(vsamPropName,i,hasMoreFile);
			outputClusters.add(clusterName);
			vsamParser.setClusterInfo(clusterName, clusterName);
		}
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getSortedRecord(i);
			for (int j = 0; j < outputClusters.size(); j++) {
				// Cluster OutRec logic comes here based on cluster index
				vsamParser.updateRecord(outputClusters.get(j), outRecBytes);
			}
			vsamParser.writeToCluster((i+1)%insertToClusterForEach==0);
        }
    // write remaining records if any
	vsamParser.writeToCluster();

		cfStepHandler.updateSortStepExecution("qsam2vsam");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
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
			SortvsamQsam2vsamKeys k = sortRecKeys.get(index);
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

	  
	  
	  
	  	
}
