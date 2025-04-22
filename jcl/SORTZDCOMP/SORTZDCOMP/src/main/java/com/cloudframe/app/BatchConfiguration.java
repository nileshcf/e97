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
    
    private static final String JOBNAME = "SORTZDCOMP";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * PRIP7001_STEP030 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(prip7001_step030Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * PRIP7001_STEP030 SORT starts here
     */
    
    private static final String PRIP7001_STEP030_STEP = "prip7001_step030";
    @Bean
    @JobScope
    public SortzdcompPrip7001_step030InputReader sortzdcompPrip7001_step030InputReader() {
    	return new SortzdcompPrip7001_step030InputReader();
    }
    
    @Bean
    @JobScope
    public SortzdcompPrip7001_step030Processor sortzdcompPrip7001_step030Processor() {
    	return new SortzdcompPrip7001_step030Processor();
    }
    
    @Bean
    @JobScope
    public SortzdcompPrip7001_step030OutputWriter sortzdcompPrip7001_step030OutputWriter() {
    	return new SortzdcompPrip7001_step030OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortzdcompPrip7001_step030SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortzdcompPrip7001_step030SortInput",jobRepository).tasklet(sortzdcompPrip7001_step030InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortzdcompPrip7001_step030Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortzdcompPrip7001_step030Process",jobRepository).tasklet(sortzdcompPrip7001_step030Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortzdcompPrip7001_step030SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortzdcompPrip7001_step030SortOutput",jobRepository).tasklet(sortzdcompPrip7001_step030OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step prip7001_step030Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("prip7001_step030Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(PRIP7001_STEP030_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(PRIP7001_STEP030_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(PRIP7001_STEP030_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(PRIP7001_STEP030_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(1,19,ZD,A,20,19,ZD,A,66,2,BI,A,39,10,CH,D),EQUALS        00010002
     *   SUM FIELDS=NONE                                                       00020004
     */
    @Bean
    public Flow prip7001_step030Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("prip7001_step030Executor")
             .start(prip7001_step030Decider(jobRepository, transactionManager))
             .from(prip7001_step030Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSortzdcompPrip7001_step030SortInput(jobRepository, transactionManager))
             .next(processSortzdcompPrip7001_step030Sort(jobRepository, transactionManager))
             .next(writeSortzdcompPrip7001_step030SortOutput(jobRepository, transactionManager))
             .from(prip7001_step030Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * PRIP7001_STEP030 SORT Ends here 
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
