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
    
    private static final String JOBNAME = "SGP7344D";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * PRGP4511_STEP11A - SORT
     * PRGP4511_STEP11B - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(prgp4511_step11aExecutor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(prgp4511_step11bExecutor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * PRGP4511_STEP11A SORT starts here
     */
    
    private static final String PRGP4511_STEP11A_STEP = "prgp4511_step11a";
    @Bean
    @JobScope
    public Sgp7344dPrgp4511_step11aSort sgp7344dPrgp4511_step11aSort() {
    	return new Sgp7344dPrgp4511_step11aSort();
    }
    
    @Bean
    @JobScope
    protected Step Sgp7344dPrgp4511_step11aSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Sgp7344dPrgp4511_step11aSort",jobRepository).tasklet(sgp7344dPrgp4511_step11aSort(), transactionManager).build();  
    }
    
    @Bean
    public Step prgp4511_step11aDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("prgp4511_step11aDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(PRGP4511_STEP11A_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(PRGP4511_STEP11A_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(PRGP4511_STEP11A_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(PRGP4511_STEP11A_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   JOINKEYS FILE=F1,FIELDS=(1,19,A,                                      00020003
     *                           20,19,A,                                      00030003
     *                           39,2,A,                                       00040003
     *                           41,2,A,                                       00050003
     *                           43,3,A,                                       00060003
     *                           46,11,A)                                      00070004
     *   JOINKEYS FILE=F2,FIELDS=(1,19,A,                                      00080003
     *                           20,19,A,                                      00090003
     *                           39,2,A,                                       00100003
     *                           41,2,A,                                       00110003
     *                           43,3,A,                                       00120003
     *                           46,11,A)                                      00130004
     *   JOIN UNPAIRED,F1,ONLY                                                 00140003
     *   REFORMAT FIELDS=(F1:1,42,47,10,43,3,57,4)                             00150010
     *   SORT FIELDS=COPY                                                      00160015
     *   OUTREC BUILD=(1,59,69X)                                               00170010
     */
    @Bean
    public Flow prgp4511_step11aExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("prgp4511_step11aExecutor")
             .start(prgp4511_step11aDecider(jobRepository, transactionManager))
             .from(prgp4511_step11aDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Sgp7344dPrgp4511_step11aSort(jobRepository, transactionManager))
             .from(prgp4511_step11aDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * PRGP4511_STEP11A SORT Ends here 
     */
    
    /*
     * PRGP4511_STEP11B SORT starts here
     */
    
    private static final String PRGP4511_STEP11B_STEP = "prgp4511_step11b";
    @Bean
    @JobScope
    public Sgp7344dPrgp4511_step11bSort sgp7344dPrgp4511_step11bSort() {
    	return new Sgp7344dPrgp4511_step11bSort();
    }
    
    @Bean
    @JobScope
    protected Step Sgp7344dPrgp4511_step11bSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Sgp7344dPrgp4511_step11bSort",jobRepository).tasklet(sgp7344dPrgp4511_step11bSort(), transactionManager).build();  
    }
    
    @Bean
    public Step prgp4511_step11bDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("prgp4511_step11bDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(PRGP4511_STEP11B_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(PRGP4511_STEP11B_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(PRGP4511_STEP11B_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(PRGP4511_STEP11B_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(1,55,CH,A)                                               00020009
     *   SUM FIELDS=NONE                                                       00021009
     *   OMIT COND=(1,3,CH,EQ,C'TRL')                                          00030007
     *   OUTFIL REMOVECC,                                                      00040007
     *   TRAILER1=('TRL',COUNT-1=(M11,LENGTH=11))                              00050007
     */
    @Bean
    public Flow prgp4511_step11bExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("prgp4511_step11bExecutor")
             .start(prgp4511_step11bDecider(jobRepository, transactionManager))
             .from(prgp4511_step11bDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Sgp7344dPrgp4511_step11bSort(jobRepository, transactionManager))
             .from(prgp4511_step11bDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * PRGP4511_STEP11B SORT Ends here 
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
