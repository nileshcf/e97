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
    
    private static final String JOBNAME = "USBSORT";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * SORT002 - SORT
     * SORT003 - SORT
     * SORT004 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(sort002Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort003Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort004Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * SORT002 SORT starts here
     */
    
    private static final String SORT002_STEP = "sort002";
    @Bean
    @JobScope
    public UsbsortSort002InputReader usbsortSort002InputReader() {
    	return new UsbsortSort002InputReader();
    }
    
    @Bean
    @JobScope
    public UsbsortSort002Processor usbsortSort002Processor() {
    	return new UsbsortSort002Processor();
    }
    
    @Bean
    @JobScope
    public UsbsortSort002OutputWriter usbsortSort002OutputWriter() {
    	return new UsbsortSort002OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readUsbsortSort002SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readUsbsortSort002SortInput",jobRepository).tasklet(usbsortSort002InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processUsbsortSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortUsbsortSort002Process",jobRepository).tasklet(usbsortSort002Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeUsbsortSort002SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeUsbsortSort002SortOutput",jobRepository).tasklet(usbsortSort002OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort002Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort002Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT002_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT002_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT002_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT002_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(1,5,A),FORMAT=CH,EQUALS                                           
     *  OUTFIL FNAMES=OUT1,                                                            
     *  OUTREC=(1,5,6:+0,TO=PD,LENGTH=6,+0,TO=PD,LENGTH=6,                             
     *          (-4096),ZD,LENGTH=12)                                                  
     */
    @Bean
    public Flow sort002Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort002Executor")
             .start(sort002Decider(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readUsbsortSort002SortInput(jobRepository, transactionManager))
             .next(processUsbsortSort002Sort(jobRepository, transactionManager))
             .next(writeUsbsortSort002SortOutput(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT002 SORT Ends here 
     */
    
    /*
     * SORT003 SORT starts here
     */
    
    private static final String SORT003_STEP = "sort003";
    @Bean
    @JobScope
    public UsbsortSort003InputReader usbsortSort003InputReader() {
    	return new UsbsortSort003InputReader();
    }
    
    @Bean
    @JobScope
    public UsbsortSort003Processor usbsortSort003Processor() {
    	return new UsbsortSort003Processor();
    }
    
    @Bean
    @JobScope
    public UsbsortSort003OutputWriter usbsortSort003OutputWriter() {
    	return new UsbsortSort003OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readUsbsortSort003SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readUsbsortSort003SortInput",jobRepository).tasklet(usbsortSort003InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processUsbsortSort003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortUsbsortSort003Process",jobRepository).tasklet(usbsortSort003Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeUsbsortSort003SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeUsbsortSort003SortOutput",jobRepository).tasklet(usbsortSort003OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort003Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort003Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT003_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT003_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT003_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT003_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(1,29,A),FORMAT=BI                                                 
     *  SUM FIELDS=(30,8,ZD)                                                           
     *  OPTION ZDPRINT                                                                 
     */
    @Bean
    public Flow sort003Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort003Executor")
             .start(sort003Decider(jobRepository, transactionManager))
             .from(sort003Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readUsbsortSort003SortInput(jobRepository, transactionManager))
             .next(processUsbsortSort003Sort(jobRepository, transactionManager))
             .next(writeUsbsortSort003SortOutput(jobRepository, transactionManager))
             .from(sort003Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT003 SORT Ends here 
     */
    
    /*
     * SORT004 SORT starts here
     */
    
    private static final String SORT004_STEP = "sort004";
    @Bean
    @JobScope
    public UsbsortSort004InputReader usbsortSort004InputReader() {
    	return new UsbsortSort004InputReader();
    }
    
    @Bean
    @JobScope
    public UsbsortSort004Processor usbsortSort004Processor() {
    	return new UsbsortSort004Processor();
    }
    
    @Bean
    @JobScope
    public UsbsortSort004OutputWriter usbsortSort004OutputWriter() {
    	return new UsbsortSort004OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readUsbsortSort004SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readUsbsortSort004SortInput",jobRepository).tasklet(usbsortSort004InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processUsbsortSort004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortUsbsortSort004Process",jobRepository).tasklet(usbsortSort004Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeUsbsortSort004SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeUsbsortSort004SortOutput",jobRepository).tasklet(usbsortSort004OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort004Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort004Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT004_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT004_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT004_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT004_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *         OPTION VLSCMP                                                   
     *         INCLUDE COND=(228,7,CH,EQ,C'NONVSAM')                           
     *         SORT FIELDS=COPY                                                
     */
    @Bean
    public Flow sort004Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort004Executor")
             .start(sort004Decider(jobRepository, transactionManager))
             .from(sort004Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readUsbsortSort004SortInput(jobRepository, transactionManager))
             .next(processUsbsortSort004Sort(jobRepository, transactionManager))
             .next(writeUsbsortSort004SortOutput(jobRepository, transactionManager))
             .from(sort004Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT004 SORT Ends here 
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
