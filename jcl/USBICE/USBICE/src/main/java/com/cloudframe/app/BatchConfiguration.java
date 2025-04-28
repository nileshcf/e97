package com.cloudframe.app;
 
import com.cloudframe.app.utility.CopyUtil;
import org.springframework.batch.core.configuration.annotation.JobScope;
import java.util.Map;
import com.cloudframe.utils.CFVsam;
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
    
    @Autowired
    CopyUtil copyUtil;
    
    private static final String JOBNAME = "USBICE";
    
    /* Driver Programs used in steps */  
   private static final String ICETOOL = "ICETOOL";
   private static final String IDCAMS = "IDCAMS";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * P030 - ICETOOL
     * P0301 - ICETOOL
     * P040 - IDCAMS
     * P050 - IDCAMS
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(p030Executor(jobRepository, transactionManager)) /*  */

			// ICETOOL Starts
			.next(p0301Executor(jobRepository, transactionManager)) /*  */

			.next(p040(jobRepository, transactionManager)) /*  */

			.next(p050(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * P030 ICETOOL starts here
     */
    
    private static final String P030_STEP = "p030";
    @Bean
    @JobScope
    public UsbiceP030Sort usbiceP030Sort() {
    	return new UsbiceP030Sort();
    }
    
    @Bean
    @JobScope
    protected Step UsbiceP030Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("UsbiceP030Sort",jobRepository).tasklet(usbiceP030Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     */
    @Bean
    public Flow p030Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030Executor")
             .start(p030Decider(jobRepository, transactionManager))
             .from(p030Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(UsbiceP030Sort(jobRepository, transactionManager))
             .from(p030Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030 ICETOOL Ends here 
     */
    
    /*
     * P0301 ICETOOL starts here
     */
    
    private static final String P0301_STEP = "p0301";
    @Bean
    @JobScope
    public UsbiceP0301Sort usbiceP0301Sort() {
    	return new UsbiceP0301Sort();
    }
    
    @Bean
    @JobScope
    protected Step UsbiceP0301Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("UsbiceP0301Sort",jobRepository).tasklet(usbiceP0301Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p0301Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p0301Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P0301_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P0301_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P0301_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P0301_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     */
    @Bean
    public Flow p0301Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p0301Executor")
             .start(p0301Decider(jobRepository, transactionManager))
             .from(p0301Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(UsbiceP0301Sort(jobRepository, transactionManager))
             .from(p0301Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P0301 ICETOOL Ends here 
     */
    
    /*
     * P040 IDCAMS starts here
     */
    
    private static final String P040_STEP = "p040";
    
    @Bean
    public Step p040(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P040_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P040_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = copyUtil.copy("P040.IDCAMS.Sysin");
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P040_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(P040_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * P040 IDCAMS Ends here 
     */
    
    /*
     * P050 IDCAMS starts here
     */
    
    private static final String P050_STEP = "p050";
    
    @Bean
    public Step p050(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P050_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P050_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = copyUtil.copy("P050.IDCAMS.Sysin");
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P050_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(P050_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * P050 IDCAMS Ends here 
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
