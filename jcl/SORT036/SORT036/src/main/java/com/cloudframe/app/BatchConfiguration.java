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
    
    private static final String JOBNAME = "SORT036";
    
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
    public Sort036Step020Sort sort036Step020Sort() {
    	return new Sort036Step020Sort();
    }
    
    @Bean
    @JobScope
    protected Step Sort036Step020Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Sort036Step020Sort",jobRepository).tasklet(sort036Step020Sort(), transactionManager).build();  
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
     *  SORT FIELDS=COPY                                                               
     *  OUTREC IFTHEN=(WHEN=(45,2,BI,EQ,18),OVERLAY=(45:+70,TO=BI,LENGTH=2),           
     *      HIT=NEXT),                                                                 
     *      IFTHEN=(WHEN=(45,2,BI,EQ,23),OVERLAY=(45:+74,TO=BI,LENGTH=2),              
     *      HIT=NEXT),                                                                 
     *      IFTHEN=(WHEN=(103,2,BI,EQ,18),OVERLAY=(103:+70,TO=BI,LENGTH=2),            
     *      HIT=NEXT),                                                                 
     *      IFTHEN=(WHEN=(103,2,BI,EQ,23),OVERLAY=(103:+74,TO=BI,LENGTH=2),            
     *      HIT=NEXT),                                                                 
     *      IFTHEN=(WHEN=(161,2,BI,EQ,18),OVERLAY=(161:+70,TO=BI,LENGTH=2),            
     *      HIT=NEXT),                                                                 
     *      IFTHEN=(WHEN=(161,2,BI,EQ,23),OVERLAY=(161:+74,TO=BI,LENGTH=2),            
     *      HIT=NEXT),                                                                 
     *      IFTHEN=(WHEN=(219,2,BI,EQ,18),OVERLAY=(219:+70,TO=BI,LENGTH=2),            
     *      HIT=NEXT),                                                                 
     *      IFTHEN=(WHEN=(219,2,BI,EQ,23),OVERLAY=(219:+74,TO=BI,LENGTH=2),            
     *      HIT=NEXT)                                                                  
     */
    @Bean
    public Flow step020Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step020Executor")
             .start(step020Decider(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Sort036Step020Sort(jobRepository, transactionManager))
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
