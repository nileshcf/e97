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
    
    private static final String JOBNAME = "STEP600";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * STEP0600 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step0600Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * STEP0600 SORT starts here
     */
    
    private static final String STEP0600_STEP = "step0600";
    @Bean
    @JobScope
    public Step600Step0600InputReader step600Step0600InputReader() {
    	return new Step600Step0600InputReader();
    }
    
    @Bean
    @JobScope
    public Step600Step0600JoinkeyFormatter step600Step0600JoinkeyFormatter() {
    	return new Step600Step0600JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public Step600Step0600Processor step600Step0600Processor() {
    	return new Step600Step0600Processor();
    }
    
    @Bean
    @JobScope
    public Step600Step0600OutputWriter step600Step0600OutputWriter() {
    	return new Step600Step0600OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readStep600Step0600SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readStep600Step0600SortInput",jobRepository).tasklet(step600Step0600InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatStep600Step0600JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatStep600Step0600Joinkeys",jobRepository).tasklet(step600Step0600JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processStep600Step0600Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortStep600Step0600Process",jobRepository).tasklet(step600Step0600Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeStep600Step0600SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeStep600Step0600SortOutput",jobRepository).tasklet(step600Step0600OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step0600Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step0600Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP0600_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP0600_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP0600_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP0600_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *    JOINKEYS F1=SORTJNF1,FIELDS(1,8,A,40,1,A),SORTED,NOSEQCK                                                                          
     *    JOINKEYS F2=SORTJNF2,FIELDS(1,8,A,9,1,A)                                                                                          
     *    JOIN UNPAIRED,F1                                                                                                                  
     *    REFORMAT FIELDS=(F1:1,49,F2:1,18,?)                                                                                               
     *     OUTREC IFTHEN(WHEN=(68,1,CH,EQ,C'B'),                                                                                            
     *                BUILD=(1,49,59,9,80:X)),                                                                                              
     *            IFTHEN(WHEN=(68,1,CH,EQ,C'1'),                                                                                            
     *                BUILD=(1,49,50:+0,TO=PD,LENGTH=3,                                                                                     
     *                            53:+0,TO=PD,LENGTH=3,                                                                                     
     *                            56:+0,TO=PD,LENGTH=3,80:X))                                                                               
     *    SORT FIELDS=(11,6,CH,A,1,8,PD,A,40,1,CH,A,17,9,CH,A)                                                                              
     */
    @Bean
    public Flow step0600Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step0600Executor")
             .start(step0600Decider(jobRepository, transactionManager))
             .from(step0600Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readStep600Step0600SortInput(jobRepository, transactionManager))
             .next(reformatStep600Step0600JoinKeys(jobRepository, transactionManager))
             .next(processStep600Step0600Sort(jobRepository, transactionManager))
             .next(writeStep600Step0600SortOutput(jobRepository, transactionManager))
             .from(step0600Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP0600 SORT Ends here 
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
