package com.cloudframe.app;
 
import java.util.Map;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.process.Cfbooks;
import com.cloudframe.app.process.Mcvsam1;
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
    
    private static final String JOBNAME = "JCLSORTCOBOLVSAMDB2";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    private static final String MCVSAM1_BEAN = "mcvsam1";
    private static final String CFBOOKS_BEAN = "cfbooks";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * STEP01 - SORT
     * TEST - MCVSAM1
     * STEP02 - CFBOOKS
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step01Executor(jobRepository, transactionManager)) /*  */

			.next(test(jobRepository, transactionManager)) /*  */

			.next(step02(jobRepository, transactionManager)) /* (4,LT) */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * STEP01 SORT starts here
     */
    
    private static final String STEP01_STEP = "step01";
    @Bean
    @JobScope
    public Jclsortcobolvsamdb2Step01InputReader cfbooksStep01InputReader() {
    	return new Jclsortcobolvsamdb2Step01InputReader();
    }
    
    @Bean
    @JobScope
    public Jclsortcobolvsamdb2Step01Processor cfbooksStep01Processor() {
    	return new Jclsortcobolvsamdb2Step01Processor();
    }
    
    @Bean
    @JobScope
    public Jclsortcobolvsamdb2Step01OutputWriter cfbooksStep01OutputWriter() {
    	return new Jclsortcobolvsamdb2Step01OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readJclsortcobolvsamdb2Step01SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readJclsortcobolvsamdb2Step01SortInput",jobRepository).tasklet(cfbooksStep01InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processJclsortcobolvsamdb2Step01Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortJclsortcobolvsamdb2Step01Process",jobRepository).tasklet(cfbooksStep01Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeJclsortcobolvsamdb2Step01SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeJclsortcobolvsamdb2Step01SortOutput",jobRepository).tasklet(cfbooksStep01OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step01Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step01Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP01_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP01_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP01_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP01_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT   FIELDS=(1,16,ZD,A,17,10,CH,A,27,10,CH,A)
     */
    @Bean
    public Flow step01Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step01Executor")
             .start(step01Decider(jobRepository, transactionManager))
             .from(step01Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readJclsortcobolvsamdb2Step01SortInput(jobRepository, transactionManager))
             .next(processJclsortcobolvsamdb2Step01Sort(jobRepository, transactionManager))
             .next(writeJclsortcobolvsamdb2Step01SortOutput(jobRepository, transactionManager))
             .from(step01Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP01 SORT Ends here 
     */
    
    /*
     * TEST MCVSAM1 starts here
     */
    
    private static final String TEST_STEP = "test";
    
    @Bean
    public Step test(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(TEST_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(TEST_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Mcvsam1)cfStepHandler.initAndGetProcessBean(TEST_STEP,MCVSAM1_BEAN)).process(new GlobalExecutorCtx().getContext("MCVSAM1"));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(TEST_STEP, rc ,MCVSAM1_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(TEST_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * TEST MCVSAM1 Ends here 
     */
    
    /*
     * STEP02 CFBOOKS starts here
     */
    
    private static final String STEP02_STEP = "step02";
    
    @Bean
    public Step step02(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP02_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP02_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Cfbooks)cfStepHandler.initAndGetProcessBean(STEP02_STEP,CFBOOKS_BEAN)).process(new GlobalExecutorCtx().getContext("CFBOOKS"));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP02_STEP, rc ,CFBOOKS_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP02_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP02 CFBOOKS Ends here 
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
