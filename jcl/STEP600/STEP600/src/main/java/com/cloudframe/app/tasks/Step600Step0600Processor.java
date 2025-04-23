package com.cloudframe.app.tasks;

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

import com.cloudframe.app.sort.file.records.Step600Step0600Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Step600Step0600Detail;

public class Step600Step0600Processor extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Step600Step0600Processor.class);

	@Autowired
	@Qualifier("batch_step600step0600")
	Step600Step0600Detail sortDetail;
	
	private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   Step600Step0600Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(Step600Step0600Keys.getKeyDecimal2Comparator(true/*isAscending*/))               
                   .thenComparing(Step600Step0600Keys.getKeyCharacter3Comparator(true/*isAscending*/))               
                   .thenComparing(Step600Step0600Keys.getKeyCharacter4Comparator(true/*isAscending*/))               
		);
		
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// Sort algorithm here
		Comparator<Step600Step0600Keys> sortComp = sortDetail.getSortComp();

		List<Step600Step0600Keys> sortRecKeys = sortDetail.getSortRecKeys();
        sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());  
        sortDetail.setSortRecKeys(sortRecKeys);	      
		if(isWriteInTempFile()) {
            // Make sure the input file is fully loaded
            boolean isCountMatches = true;
            this.setWriteCounter(sortDetail.getWriteCounter());
			int joinRecCount = sortDetail.getRecInCounter();
			while (isCountMatches) { 
			    isCountMatches = joinRecCount != getWriteCounter().get();

            }
        }                	
		
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort Processor ended.");
		return ExitStatus.COMPLETED;
	}
}
