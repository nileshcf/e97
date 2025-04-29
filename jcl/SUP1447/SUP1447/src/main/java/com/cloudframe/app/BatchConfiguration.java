package com.cloudframe.app;
 
import java.util.Map;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.tasks.*;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.observability.BatchMetrics;
import com.cloudframe.app.utility.SpringContextHandler;
import com.cloudframe.app.exception.CFException;
    
@Configuration
    
public class BatchConfiguration {
    
    
    @Autowired
    CFStepHandler cfStepHandler;
    
    private static final String JOBNAME = "SUP1447";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * STEP015 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step015Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * STEP015 SORT starts here
     */
    
    private static final String STEP015_STEP = "step015";
    @Bean
    @JobScope
    public Sup1447Step015InputReader sup1447Step015InputReader() {
    	return new Sup1447Step015InputReader();
    }
    
    @Bean
    @JobScope
    public Sup1447Step015Processor sup1447Step015Processor() {
    	return new Sup1447Step015Processor();
    }
    
    @Bean
    @JobScope
    public Sup1447Step015OutputWriter sup1447Step015OutputWriter() {
    	return new Sup1447Step015OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSup1447Step015SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSup1447Step015SortInput",jobRepository).tasklet(sup1447Step015InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSup1447Step015Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSup1447Step015Process",jobRepository).tasklet(sup1447Step015Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSup1447Step015SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSup1447Step015SortOutput",jobRepository).tasklet(sup1447Step015OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step015Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step015Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP015_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP015_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP015_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP015_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=COPY                                                       00000100
     */
    @Bean
    public Flow step015Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step015Executor")
             .start(step015Decider(jobRepository, transactionManager))
             .from(step015Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSup1447Step015SortInput(jobRepository, transactionManager))
             .next(processSup1447Step015Sort(jobRepository, transactionManager))
             .next(writeSup1447Step015SortOutput(jobRepository, transactionManager))
             .from(step015Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP015 SORT Ends here 
     */
    
	
	@Bean
	public Step printSummary(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    return new StepBuilder("printSummary", jobRepository).tasklet(new Tasklet() {
	    @Override
	    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
          cfStepHandler.printExecutionSummary();
          return RepeatStatus.FINISHED;
      }
	  }, transactionManager).build();
	}
	    
}
