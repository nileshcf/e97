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

import com.cloudframe.app.sort.file.records.WipromedicareSort009Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.WipromedicareSort009Detail;

public class WipromedicareSort009Processor extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(WipromedicareSort009Processor.class);

	@Autowired
	@Qualifier("batch_wipromedicaresort009")
	WipromedicareSort009Detail sortDetail;
	
	private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
		sortDetail.setSortComp(
                   WipromedicareSort009Keys.getKeyBinary1Comparator(false/*isAscending*/)               
                   .thenComparing(WipromedicareSort009Keys.getKeyBinary2Comparator(true/*isAscending*/))               
		);
		
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// Sort algorithm here
		Comparator<WipromedicareSort009Keys> sortComp = sortDetail.getSortComp();

		List<WipromedicareSort009Keys> sortRecKeys = sortDetail.getSortRecKeys();
        sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());  
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
