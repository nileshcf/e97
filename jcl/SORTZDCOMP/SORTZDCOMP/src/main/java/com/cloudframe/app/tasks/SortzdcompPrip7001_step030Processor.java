package com.cloudframe.app.tasks;

import java.util.List;
import java.util.Set;
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

import com.cloudframe.app.sort.file.records.SortzdcompPrip7001_step030Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.SortzdcompPrip7001_step030Detail;

public class SortzdcompPrip7001_step030Processor extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(SortzdcompPrip7001_step030Processor.class);

	@Autowired
	@Qualifier("batch_sortzdcompprip7001_step030")
	SortzdcompPrip7001_step030Detail sortDetail;
	
	private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   SortzdcompPrip7001_step030Keys.getKeyCharacter1Comparator(true/*isAscending*/)               
                   .thenComparing(SortzdcompPrip7001_step030Keys.getKeyCharacter2Comparator(true/*isAscending*/))               
                   .thenComparing(SortzdcompPrip7001_step030Keys.getKeyBinary3Comparator(true/*isAscending*/))               
                   .thenComparing(SortzdcompPrip7001_step030Keys.getKeyCharacter4Comparator(false/*isAscending*/))               
		);
		
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// Sort algorithm here
		Comparator<SortzdcompPrip7001_step030Keys> sortComp = sortDetail.getSortComp();

        List<SortzdcompPrip7001_step030Keys> sortRecKeys = null;
        Set<SortzdcompPrip7001_step030Keys> setRecKeys = sortDetail.getSortDistRecKeys();
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
		
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort Processor ended.");
		return ExitStatus.COMPLETED;
	}
}
