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
    
    private static final String JOBNAME = "SORT037";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * STEP020 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step020Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * STEP020 SORT starts here
     */
    
    private static final String STEP020_STEP = "step020";
    @Bean
    @JobScope
    public Sort037Step020Sort sort037Step020Sort() {
    	return new Sort037Step020Sort();
    }
    
    @Bean
    @JobScope
    protected Step Sort037Step020Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Sort037Step020Sort",jobRepository).tasklet(sort037Step020Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step step020Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step020Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP020_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP020_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP020_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP020_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   OPTION COPY                                                                   
     *   JOINKEYS FILE=F1,FIELDS=(1,58,A)                                              
     *   JOINKEYS FILE=F2,FIELDS=(1,58,A)                                              
     *   JOIN UNPAIRED                                                                 
     *   REFORMAT FIELDS=(F1:1,58,F2:1,58,?)                                           
     *   OUTFIL FNAMES=UNMATCH,INCLUDE=(117,1,CH,EQ,C'1'),                             
     *     BUILD=(1,5,6:C' - DOES NOT HAVE AN MATCH IN THE T002/9Z FILE')              
     *   OUTFIL FNAMES=MATCH,INCLUDE=(117,1,CH,EQ,C'B'),                               
     *     BUILD=(1,5,6:C' - BASE FILE ENTRY MATCHES THE T002/9Z ENTRY ')              
     */
    @Bean
    public Flow step020Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step020Executor")
             .start(step020Decider(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Sort037Step020Sort(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP020 SORT Ends here 
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
