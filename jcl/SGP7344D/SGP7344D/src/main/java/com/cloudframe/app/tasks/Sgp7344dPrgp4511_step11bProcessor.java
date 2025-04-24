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

import com.cloudframe.app.sort.file.records.Sgp7344dPrgp4511_step11bKeys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sgp7344dPrgp4511_step11bDetail;

public class Sgp7344dPrgp4511_step11bProcessor extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Sgp7344dPrgp4511_step11bProcessor.class);

	@Autowired
	@Qualifier("batch_sgp7344dprgp4511_step11b")
	Sgp7344dPrgp4511_step11bDetail sortDetail;
	
	private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   Sgp7344dPrgp4511_step11bKeys.getKeyCharacter1Comparator(true/*isAscending*/)               
		);
		
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// Sort algorithm here
		Comparator<Sgp7344dPrgp4511_step11bKeys> sortComp = sortDetail.getSortComp();

        List<Sgp7344dPrgp4511_step11bKeys> sortRecKeys = null;
        Set<Sgp7344dPrgp4511_step11bKeys> setRecKeys = sortDetail.getSortDistRecKeys();
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
