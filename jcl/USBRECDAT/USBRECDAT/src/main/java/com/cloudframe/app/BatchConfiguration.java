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
    
    private static final String JOBNAME = "USBRECDAT";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * DATE1IN - SORT
     * DATE1OUT - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(date1inExecutor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(date1outExecutor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * DATE1IN SORT starts here
     */
    
    private static final String DATE1IN_STEP = "date1in";
    @Bean
    @JobScope
    public UsbrecdatDate1inInputReader usbrecdatDate1inInputReader() {
    	return new UsbrecdatDate1inInputReader();
    }
    
    @Bean
    @JobScope
    public UsbrecdatDate1inProcessor usbrecdatDate1inProcessor() {
    	return new UsbrecdatDate1inProcessor();
    }
    
    @Bean
    @JobScope
    public UsbrecdatDate1inOutputWriter usbrecdatDate1inOutputWriter() {
    	return new UsbrecdatDate1inOutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readUsbrecdatDate1inSortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readUsbrecdatDate1inSortInput",jobRepository).tasklet(usbrecdatDate1inInputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processUsbrecdatDate1inSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortUsbrecdatDate1inProcess",jobRepository).tasklet(usbrecdatDate1inProcessor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeUsbrecdatDate1inSortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeUsbrecdatDate1inSortOutput",jobRepository).tasklet(usbrecdatDate1inOutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step date1inDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("date1inDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(DATE1IN_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(DATE1IN_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(DATE1IN_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(DATE1IN_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *         INREC FIELDS=(1,33,6X,29,4,25,4,2X,&DATE1-5,23X)                
     *         SORT FIELDS=COPY                                                
     */
    @Bean
    public Flow date1inExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("date1inExecutor")
             .start(date1inDecider(jobRepository, transactionManager))
             .from(date1inDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readUsbrecdatDate1inSortInput(jobRepository, transactionManager))
             .next(processUsbrecdatDate1inSort(jobRepository, transactionManager))
             .next(writeUsbrecdatDate1inSortOutput(jobRepository, transactionManager))
             .from(date1inDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * DATE1IN SORT Ends here 
     */
    
    /*
     * DATE1OUT SORT starts here
     */
    
    private static final String DATE1OUT_STEP = "date1out";
    @Bean
    @JobScope
    public UsbrecdatDate1outInputReader usbrecdatDate1outInputReader() {
    	return new UsbrecdatDate1outInputReader();
    }
    
    @Bean
    @JobScope
    public UsbrecdatDate1outProcessor usbrecdatDate1outProcessor() {
    	return new UsbrecdatDate1outProcessor();
    }
    
    @Bean
    @JobScope
    public UsbrecdatDate1outOutputWriter usbrecdatDate1outOutputWriter() {
    	return new UsbrecdatDate1outOutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readUsbrecdatDate1outSortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readUsbrecdatDate1outSortInput",jobRepository).tasklet(usbrecdatDate1outInputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processUsbrecdatDate1outSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortUsbrecdatDate1outProcess",jobRepository).tasklet(usbrecdatDate1outProcessor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeUsbrecdatDate1outSortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeUsbrecdatDate1outSortOutput",jobRepository).tasklet(usbrecdatDate1outOutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step date1outDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("date1outDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(DATE1OUT_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(DATE1OUT_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(DATE1OUT_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(DATE1OUT_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *         SORT FIELDS=COPY                                                
     *         OUTREC OVERLAY=(1:1,123,1X,&DATE1-5)                            
     */
    @Bean
    public Flow date1outExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("date1outExecutor")
             .start(date1outDecider(jobRepository, transactionManager))
             .from(date1outDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readUsbrecdatDate1outSortInput(jobRepository, transactionManager))
             .next(processUsbrecdatDate1outSort(jobRepository, transactionManager))
             .next(writeUsbrecdatDate1outSortOutput(jobRepository, transactionManager))
             .from(date1outDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * DATE1OUT SORT Ends here 
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
