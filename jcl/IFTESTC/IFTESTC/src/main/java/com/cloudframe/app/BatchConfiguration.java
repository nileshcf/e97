package com.cloudframe.app;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.process.Retcode;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode2;
import com.cloudframe.app.process.Retcode;
import com.cloudframe.app.tasks.*;
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
    
    private static final String JOBNAME = "IFTESTC";
    
    /* Driver Programs used in steps */  
    private static final String RETCODE2_BEAN = "retcode2";
   private static final String SORT = "SORT";
    private static final String RETCODE_BEAN = "retcode";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /*
     * step1_step10Flow Starts here 
     */
    
    @Bean
    public Flow step1_step10Flow(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new FlowBuilder<SimpleFlow>("step1_step10Flow").start(step1_step10(jobRepository,transactionManager)).build();
    }
    
    /*
     *  step1_step10Flow Ends here 
     */
    
    /** 
     *   Execute the Job that consists of 
     * STEP1_STEP10 - RETCODE2
     * SORT001 - SORT
     * ABEND001 - RETCODE
     * STEP2_STEP10 - RETCODE2
     * STEP3_STEP10 - RETCODE2
     * STEP4 - RETCODE2
     * STEP5 - RETCODE2
     * SORT002 - SORT
     * STEP6 - RETCODE2
     * STEP7 - RETCODE2
     * ABEND002 - RETCODE
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step1_step10Flow(jobRepository, transactionManager))
			// SORT Starts
			.next(sort001Executor(jobRepository, transactionManager)) /*  */

			.next(abend001(jobRepository, transactionManager)) /*  */

			.next(step2_step10(jobRepository, transactionManager)) /*  */

			.next(step3_step10(jobRepository, transactionManager)) /*  */

			.next(step4(jobRepository, transactionManager)) /* (4,EQ,STEP1_STEP10) */

			.next(step5(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort002Executor(jobRepository, transactionManager)) /*  */

			.next(step6(jobRepository, transactionManager)) /*  */

			.next(step7(jobRepository, transactionManager)) /*  */

			.next(abend002(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
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
     * SORT001 SORT starts here
     */
    
    private static final String SORT001_STEP = "sort001";
    @Bean
    @JobScope
    public IftestcSort001InputReader retcode2Sort001InputReader() {
    	return new IftestcSort001InputReader();
    }
    
    @Bean
    @JobScope
    public IftestcSort001Processor retcode2Sort001Processor() {
    	return new IftestcSort001Processor();
    }
    
    @Bean
    @JobScope
    public IftestcSort001OutputWriter retcode2Sort001OutputWriter() {
    	return new IftestcSort001OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIftestcSort001SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIftestcSort001SortInput",jobRepository).tasklet(retcode2Sort001InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIftestcSort001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIftestcSort001Process",jobRepository).tasklet(retcode2Sort001Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIftestcSort001SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIftestcSort001SortOutput",jobRepository).tasklet(retcode2Sort001OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort001Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort001Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT001_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT001_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT001_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT001_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(45,2,A,48,17,A),FORMAT=CH,EQUALS                                 
     *   INCLUDE COND=(20,1,CH,EQ,C'5',AND,21,1,CH,EQ,C'4')                            
     *   OUTFIL FNAMES=SORTOUT,VTOF,OUTREC=(5,32748)                                   
     */
    @Bean
    public Flow sort001Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort001Executor")
             .start(sort001Decider(jobRepository, transactionManager))
             .from(sort001Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readIftestcSort001SortInput(jobRepository, transactionManager))
             .next(processIftestcSort001Sort(jobRepository, transactionManager))
             .next(writeIftestcSort001SortOutput(jobRepository, transactionManager))
             .from(sort001Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT001 SORT Ends here 
     */
    
    /*
     * ABEND001 RETCODE starts here
     */
    
    private static final String ABEND001_STEP = "abend001";
    
    
    @Value("${ABEND001.RETCODE.inputValue:'00999'}")
    private String abend001RetcodeParm ;
    
    @Bean
    public Step abend001(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(ABEND001_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(ABEND001_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode)cfStepHandler.initAndGetProcessBean(ABEND001_STEP,RETCODE_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE"), cfStepHandler.getParm(abend001RetcodeParm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(ABEND001_STEP, rc ,RETCODE_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(ABEND001_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * ABEND001 RETCODE Ends here 
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
     * SORT002 SORT starts here
     */
    
    private static final String SORT002_STEP = "sort002";
    @Bean
    @JobScope
    public IftestcSort002InputReader retcode2Sort002InputReader() {
    	return new IftestcSort002InputReader();
    }
    
    @Bean
    @JobScope
    public IftestcSort002Processor retcode2Sort002Processor() {
    	return new IftestcSort002Processor();
    }
    
    @Bean
    @JobScope
    public IftestcSort002OutputWriter retcode2Sort002OutputWriter() {
    	return new IftestcSort002OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIftestcSort002SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIftestcSort002SortInput",jobRepository).tasklet(retcode2Sort002InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIftestcSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIftestcSort002Process",jobRepository).tasklet(retcode2Sort002Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIftestcSort002SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIftestcSort002SortOutput",jobRepository).tasklet(retcode2Sort002OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=(45,2,A,48,17,A),FORMAT=CH,EQUALS                                 
     *   INCLUDE COND=(20,1,CH,EQ,C'5',AND,21,1,CH,EQ,C'4')                            
     *   OUTFIL FNAMES=SORTOUT,VTOF,OUTREC=(5,30000)                                   
     */
    @Bean
    public Flow sort002Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort002Executor")
             .start(sort002Decider(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readIftestcSort002SortInput(jobRepository, transactionManager))
             .next(processIftestcSort002Sort(jobRepository, transactionManager))
             .next(writeIftestcSort002SortOutput(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT002 SORT Ends here 
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
    
    /*
     * ABEND002 RETCODE starts here
     */
    
    private static final String ABEND002_STEP = "abend002";
    
    
    @Value("${ABEND002.RETCODE.inputValue:'00999'}")
    private String abend002RetcodeParm ;
    
    @Bean
    public Step abend002(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(ABEND002_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(ABEND002_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Retcode)cfStepHandler.initAndGetProcessBean(ABEND002_STEP,RETCODE_BEAN)).setParameter(new GlobalExecutorCtx().getContext("RETCODE"), cfStepHandler.getParm(abend002RetcodeParm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(ABEND002_STEP, rc ,RETCODE_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(ABEND002_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * ABEND002 RETCODE Ends here 
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
