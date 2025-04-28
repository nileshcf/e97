package com.cloudframe.app;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import java.util.Map;
import com.cloudframe.app.process.Retcode2;
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
    
    private static final String JOBNAME = "IFTESTB";
    
    /* Driver Programs used in steps */  
    private static final String RETCODE2_BEAN = "retcode2";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    
    /** 
     *   Execute the Job that consists of 
     * STEP10 - RETCODE2
     * STEP1_STEP10 - RETCODE2
     * STEP2_STEP10 - RETCODE2
     * STEP3_STEP10 - RETCODE2
     * STEP4 - RETCODE2
     * STEP5 - RETCODE2
     * STEP6 - RETCODE2
     * STEP7 - RETCODE2
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step10(jobRepository, transactionManager))
			.next(step1_step10(jobRepository, transactionManager)) /*  */

			.next(step2_step10(jobRepository, transactionManager)) /*  */

			.next(step3_step10(jobRepository, transactionManager)) /*  */

			.next(step4(jobRepository, transactionManager)) /*  */

			.next(step5(jobRepository, transactionManager)) /*  */

			.next(step6(jobRepository, transactionManager)) /*  */

			.next(step7(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 

    			.build();
    } 
    /*
     * STEP10 RETCODE2 starts here
     */
    
    private static final String STEP10_STEP = "step10";
    
    
    @Value("${STEP10.RETCODE2.inputValue:'&RETCODE'}")
    private String step10Retcode2Parm ;
    
    @Bean
    public Step step10(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP10_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP10_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP10_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step10Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP10_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP10_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP10 RETCODE2 Ends here 
     */
    
    /*
     * STEP1_STEP10 RETCODE2 starts here
     */
    
    private static final String STEP1_STEP10_STEP = "step1_step10";
    
    
    @Value("${STEP1_STEP10.RETCODE2.inputValue:'00001'}")
    private String step1_step10Retcode2Parm ;
    
    @Bean
    public Step step1_step10(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP1_STEP10_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP1_STEP10_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP1_STEP10_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step1_step10Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP1_STEP10_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP1_STEP10_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP1_STEP10 RETCODE2 Ends here 
     */
    
    /*
     * STEP2_STEP10 RETCODE2 starts here
     */
    
    private static final String STEP2_STEP10_STEP = "step2_step10";
    
    
    @Value("${STEP2_STEP10.RETCODE2.inputValue:'00002'}")
    private String step2_step10Retcode2Parm ;
    
    @Bean
    public Step step2_step10(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP2_STEP10_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP2_STEP10_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP2_STEP10_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step2_step10Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP2_STEP10_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP2_STEP10_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP2_STEP10 RETCODE2 Ends here 
     */
    
    /*
     * STEP3_STEP10 RETCODE2 starts here
     */
    
    private static final String STEP3_STEP10_STEP = "step3_step10";
    
    
    @Value("${STEP3_STEP10.RETCODE2.inputValue:'00033'}")
    private String step3_step10Retcode2Parm ;
    
    @Bean
    public Step step3_step10(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP3_STEP10_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP3_STEP10_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP3_STEP10_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step3_step10Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP3_STEP10_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP3_STEP10_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP3_STEP10 RETCODE2 Ends here 
     */
    
    /*
     * STEP4 RETCODE2 starts here
     */
    
    private static final String STEP4_STEP = "step4";
    
    
    @Value("${STEP4.RETCODE2.inputValue:'00004'}")
    private String step4Retcode2Parm ;
    
    @Bean
    public Step step4(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP4_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP4_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP4_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step4Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP4_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP4_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP4 RETCODE2 Ends here 
     */
    
    /*
     * STEP5 RETCODE2 starts here
     */
    
    private static final String STEP5_STEP = "step5";
    
    
    @Value("${STEP5.RETCODE2.inputValue:'00005'}")
    private String step5Retcode2Parm ;
    
    @Bean
    public Step step5(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP5_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP5_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP5_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step5Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP5_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP5_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP5 RETCODE2 Ends here 
     */
    
    /*
     * STEP6 RETCODE2 starts here
     */
    
    private static final String STEP6_STEP = "step6";
    
    
    @Value("${STEP6.RETCODE2.inputValue:'00006'}")
    private String step6Retcode2Parm ;
    
    @Bean
    public Step step6(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP6_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP6_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP6_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step6Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP6_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP6_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP6 RETCODE2 Ends here 
     */
    
    /*
     * STEP7 RETCODE2 starts here
     */
    
    private static final String STEP7_STEP = "step7";
    
    
    @Value("${STEP7.RETCODE2.inputValue:'00007'}")
    private String step7Retcode2Parm ;
    
    @Bean
    public Step step7(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP7_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP7_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP7_STEP,RETCODE2_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE2"), cfStepHandler.getParm(step7Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP7_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP7_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP7 RETCODE2 Ends here 
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
