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
import org.springframework.context.ApplicationContext;
import com.cloudframe.app.dto.GlobalExecutorCtx;
    
@Configuration
    
public class BatchConfiguration {
    
    
    @Autowired
    CFStepHandler cfStepHandler;
    
    @Autowired
    ApplicationContext context;
    
    private static final String JOBNAME = "ICET020";
    
    /* Driver Programs used in steps */  
   private static final String ICETOOL = "ICETOOL";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * MERGE - ICETOOL
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(mergeExecutor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * MERGE ICETOOL starts here
     */
    
    private static final String MERGE_STEP = "merge";
    @Bean
    @JobScope
    public Icet020MergeInputReader icet020MergeInputReader() {
    	return new Icet020MergeInputReader();
    }
    
    @Bean
    @JobScope
    public Icet020MergeProcessor icet020MergeProcessor() {
    	return new Icet020MergeProcessor();
    }
    
    @Bean
    @JobScope
    public Icet020MergeOutputWriter icet020MergeOutputWriter() {
    	return new Icet020MergeOutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcet020MergeSortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcet020MergeSortInput",jobRepository).tasklet(icet020MergeInputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcet020MergeSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcet020MergeProcess",jobRepository).tasklet(icet020MergeProcessor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcet020MergeSortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcet020MergeSortOutput",jobRepository).tasklet(icet020MergeOutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step mergeDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mergeDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MERGE_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MERGE_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MERGE_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(MERGE_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  MERGE FROM(IN1,IN2,IN3) TO(OUT) USING(CTL1)                                    
     *   MERGE FIELDS=(1,4,CH,A)                                                       
     */
    @Bean
    public Flow mergeExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mergeExecutor")
             .start(mergeDecider(jobRepository, transactionManager))
             .from(mergeDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readIcet020MergeSortInput(jobRepository, transactionManager))
             .next(processIcet020MergeSort(jobRepository, transactionManager))
             .next(writeIcet020MergeSortOutput(jobRepository, transactionManager))
             .from(mergeDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MERGE ICETOOL Ends here 
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
