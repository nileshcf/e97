package com.cloudframe.app.tasks;

import java.util.List;
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

import com.cloudframe.app.sort.file.records.Sgp7344dPrgp4511_step11aKeys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sgp7344dPrgp4511_step11aDetail;

public class Sgp7344dPrgp4511_step11aProcessor extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Sgp7344dPrgp4511_step11aProcessor.class);

	@Autowired
	@Qualifier("batch_sgp7344dprgp4511_step11a")
	Sgp7344dPrgp4511_step11aDetail sortDetail;
	
	private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// Sort algorithm here
		
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
