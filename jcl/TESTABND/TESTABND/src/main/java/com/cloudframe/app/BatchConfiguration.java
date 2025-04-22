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
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Cfabcall;
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
    
@Configuration
    
public class BatchConfiguration {
    
    
    @Autowired
    CFStepHandler cfStepHandler;
    
    private static final String JOBNAME = "TESTABND";
    
    /* Driver Programs used in steps */  
    private static final String RETCODE2_BEAN = "retcode2";
    private static final String CFABCALL_BEAN = "cfabcall";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    
    /** 
     *   Execute the Job that consists of 
     * STEP1 - RETCODE2
     * ABEND1 - CFABCALL
     * STEP2 - RETCODE2
     * STEP3 - RETCODE2
     * STEP4095 - RETCODE2
     * STEP4 - RETCODE2
     * STEP5 - RETCODE2
     * STEP6 - RETCODE2
     * STEP7 - RETCODE2
     * STEP8 - RETCODE2
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step1(jobRepository, transactionManager))
			.next(abend1(jobRepository, transactionManager)) /*  */

			.next(step2(jobRepository, transactionManager)) /* (01,NE,STEP1) */

			.next(step3(jobRepository, transactionManager)) /* EVEN */

			.next(step4095(jobRepository, transactionManager)) /* ((01,NE,STEP1),(02,NE,STEP2)) */

			.next(step4(jobRepository, transactionManager)) /* (03,LT) */

			.next(step5(jobRepository, transactionManager)) /* (03,LT) */

			.next(step6(jobRepository, transactionManager)) /* (05,LT) */

			.next(step7(jobRepository, transactionManager)) /*  */

			.next(step8(jobRepository, transactionManager)) /* ONLY */
		.next(printSummary(jobRepository, transactionManager)) 

    			.build();
    } 
    /*
     * STEP1 RETCODE2 starts here
     */
    
    private static final String STEP1_STEP = "step1";
    
    
    @Value("${STEP1.RETCODE2.inputValue:'00001'}")
    private String step1Retcode2Parm ;
    
    @Bean
    public Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP1_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP1_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP1_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step1Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP1_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP1_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP1 RETCODE2 Ends here 
     */
    
    /*
     * ABEND1 CFABCALL starts here
     */
    
    private static final String ABEND1_STEP = "abend1";
    
    
    @Value("${ABEND1.CFABCALL.inputValue:'C0789'}")
    private String abend1CfabcallParm ;
    
    @Bean
    public Step abend1(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(ABEND1_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(ABEND1_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Cfabcall)cfStepHandler.initAndGetProcessBean(ABEND1_STEP,CFABCALL_BEAN)).setParameter( cfStepHandler.getParm(abend1CfabcallParm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(ABEND1_STEP, rc ,CFABCALL_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(ABEND1_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * ABEND1 CFABCALL Ends here 
     */
    
    /*
     * STEP2 RETCODE2 starts here
     */
    
    private static final String STEP2_STEP = "step2";
    
    
    @Value("${STEP2.RETCODE2.inputValue:'00002'}")
    private String step2Retcode2Parm ;
    
    @Bean
    public Step step2(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP2_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP2_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP2_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step2Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP2_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP2_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP2 RETCODE2 Ends here 
     */
    
    /*
     * STEP3 RETCODE2 starts here
     */
    
    private static final String STEP3_STEP = "step3";
    
    
    @Value("${STEP3.RETCODE2.inputValue:'00003'}")
    private String step3Retcode2Parm ;
    
    @Bean
    public Step step3(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP3_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP3_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP3_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step3Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP3_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP3_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP3 RETCODE2 Ends here 
     */
    
    /*
     * STEP4095 RETCODE2 starts here
     */
    
    private static final String STEP4095_STEP = "step4095";
    
    
    @Value("${STEP4095.RETCODE2.inputValue:'00001'}")
    private String step4095Retcode2Parm ;
    
    @Bean
    public Step step4095(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP4095_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP4095_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP4095_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step4095Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP4095_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP4095_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP4095 RETCODE2 Ends here 
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
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP4_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step4Retcode2Parm));
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
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP5_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step5Retcode2Parm));
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
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP6_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step6Retcode2Parm));
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
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP7_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step7Retcode2Parm));
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
    
    /*
     * STEP8 RETCODE2 starts here
     */
    
    private static final String STEP8_STEP = "step8";
    
    
    @Value("${STEP8.RETCODE2.inputValue:'00008'}")
    private String step8Retcode2Parm ;
    
    @Bean
    public Step step8(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP8_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP8_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode2)cfStepHandler.initAndGetProcessBean(STEP8_STEP,RETCODE2_BEAN)).setParameter( cfStepHandler.getParm(step8Retcode2Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP8_STEP, rc ,RETCODE2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP8_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP8 RETCODE2 Ends here 
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
