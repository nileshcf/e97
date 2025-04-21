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
    
    private static final String JOBNAME = "ICE003";
    
    /* Driver Programs used in steps */  
   private static final String ICETOOL = "ICETOOL";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * P050_01 - ICETOOL
     * P050_02 - ICETOOL
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(p050_01Executor(jobRepository, transactionManager)) /*  */
			.next(p050_02Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * P050_01 ICETOOL starts here
     */
    
    private static final String P050_01_STEP = "p050_01";
    @Bean
    @JobScope
    public Ice003P050_01Sort ice003P050_01Sort() {
    	return new Ice003P050_01Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice003P050_01Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice003P050_01Sort",jobRepository).tasklet(ice003P050_01Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p050_01Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p050_01Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P050_01_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P050_01_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P050_01_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P050_01_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(26,04,CH,A,                     **** ENTRY NUMBER
     *               15,10,CH,A)                     **** DRN
     */
    @Bean
    public Flow p050_01Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p050_01Executor")
             .start(p050_01Decider(jobRepository, transactionManager))
             .from(p050_01Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice003P050_01Sort(jobRepository, transactionManager))
             .from(p050_01Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P050_01 ICETOOL Ends here 
     */
    
    /*
     * P050_02 ICETOOL starts here
     */
    
    private static final String P050_02_STEP = "p050_02";
    @Bean
    @JobScope
    public Ice003P050_02Sort ice003P050_02Sort() {
    	return new Ice003P050_02Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice003P050_02Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice003P050_02Sort",jobRepository).tasklet(ice003P050_02Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p050_02Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p050_02Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P050_02_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P050_02_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P050_02_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P050_02_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     */
    @Bean
    public Flow p050_02Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p050_02Executor")
             .start(p050_02Decider(jobRepository, transactionManager))
             .from(p050_02Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice003P050_02Sort(jobRepository, transactionManager))
             .from(p050_02Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P050_02 ICETOOL Ends here 
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
