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

import com.cloudframe.app.sort.file.records.UsbrecdatDate1inKeys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.UsbrecdatDate1inDetail;

public class UsbrecdatDate1inProcessor extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(UsbrecdatDate1inProcessor.class);

	@Autowired
	@Qualifier("batch_usbrecdatdate1in")
	UsbrecdatDate1inDetail sortDetail;
	
	private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// Sort algorithm here
		List<UsbrecdatDate1inKeys> sortRecKeys = sortDetail.getSortRecKeys();
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
