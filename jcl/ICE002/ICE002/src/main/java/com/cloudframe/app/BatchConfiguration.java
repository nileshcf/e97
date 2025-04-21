package com.cloudframe.app;
 
import com.cloudframe.app.utility.CopyUtil;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.tasks.*;
import java.util.Map;
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
    
    @Autowired
    CopyUtil copyUtil;
    
    private static final String JOBNAME = "ICE002";
    
    /* Driver Programs used in steps */  
    private static final String IEBGENER_BEAN = "iebgener";
   private static final String ICETOOL = "ICETOOL";
   private static final String SORT = "SORT";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /*
     * p010Flow Starts here 
     */
    
    @Bean
    public Flow p010Flow(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new FlowBuilder<SimpleFlow>("p010Flow").start(p010(jobRepository,transactionManager)).build();
    }
    
    /*
     *  p010Flow Ends here 
     */
    
    /** 
     *   Execute the Job that consists of 
     * P010 - IEFBR14
     * P020 - IEBGENER
     * P030_01 - ICETOOL
     * P030_02 - ICETOOL
     * P030_03 - ICETOOL
     * P030_04 - ICETOOL
     * P030_05 - ICETOOL
     * P030_06 - ICETOOL
     * P030_07 - ICETOOL
     * P030_08 - ICETOOL
     * P030_09 - ICETOOL
     * P030_10 - ICETOOL
     * P030_11 - ICETOOL
     * P030_12 - ICETOOL
     * P030_13 - ICETOOL
     * P030_14 - ICETOOL
     * P030_15 - ICETOOL
     * P030_16 - ICETOOL
     * P030_17 - ICETOOL
     * P030_18 - ICETOOL
     * P030_19 - ICETOOL
     * P030_20 - ICETOOL
     * P030_21 - ICETOOL
     * P030_22 - ICETOOL
     * P030_23 - ICETOOL
     * P030_24 - ICETOOL
     * P050 - IEBGENER
     * P060 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(p010Flow(jobRepository, transactionManager))
			.next(p020(jobRepository, transactionManager)) /*  */

			// ICETOOL Starts
			.next(p030_01Executor(jobRepository, transactionManager)) /*  */
			.next(p030_02Executor(jobRepository, transactionManager)) /*  */
			.next(p030_03Executor(jobRepository, transactionManager)) /*  */
			.next(p030_04Executor(jobRepository, transactionManager)) /*  */
			.next(p030_05Executor(jobRepository, transactionManager)) /*  */
			.next(p030_06Executor(jobRepository, transactionManager)) /*  */
			.next(p030_07Executor(jobRepository, transactionManager)) /*  */
			.next(p030_08Executor(jobRepository, transactionManager)) /*  */
			.next(p030_09Executor(jobRepository, transactionManager)) /*  */
			.next(p030_10Executor(jobRepository, transactionManager)) /*  */
			.next(p030_11Executor(jobRepository, transactionManager)) /*  */
			.next(p030_12Executor(jobRepository, transactionManager)) /*  */
			.next(p030_13Executor(jobRepository, transactionManager)) /*  */
			.next(p030_14Executor(jobRepository, transactionManager)) /*  */
			.next(p030_15Executor(jobRepository, transactionManager)) /*  */
			.next(p030_16Executor(jobRepository, transactionManager)) /*  */
			.next(p030_17(jobRepository, transactionManager)) /*  */
			.next(p030_18(jobRepository, transactionManager)) /*  */
			.next(p030_19(jobRepository, transactionManager)) /*  */
			.next(p030_20(jobRepository, transactionManager)) /*  */
			.next(p030_21(jobRepository, transactionManager)) /*  */
			.next(p030_22(jobRepository, transactionManager)) /*  */
			.next(p030_23(jobRepository, transactionManager)) /*  */
			.next(p030_24(jobRepository, transactionManager)) /*  */

			.next(p050(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(p060Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * P010 IEFBR14 starts here
     */
    
    private static final String P010_STEP = "p010";
    
    @Bean
    public Step p010(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P010_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P010_STEP)) {
 	 					int rc = 0; // IEFBR14 PROGRAM 
                      try {
 		    	   		cfStepHandler.handleStepOverrides(P010_STEP);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P010_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P010_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * P010 IEFBR14 Ends here 
     */
    
    /*
     * P020 IEBGENER starts here
     */
    
    private static final String P020_STEP = "p020";
    
    @Bean
    public Step p020(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P020_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P020_STEP)) {
 	 					int rc = 0; // IEBGENER PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P020_STEP);
 		    	   		rc = copyUtil.performCopy(P020_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P020_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P020_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * P020 IEBGENER Ends here 
     */
    
    /*
     * P030_01 ICETOOL starts here
     */
    
    private static final String P030_01_STEP = "p030_01";
    @Bean
    @JobScope
    public Ice002P030_01Sort ice002P030_01Sort() {
    	return new Ice002P030_01Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_01Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_01Sort",jobRepository).tasklet(ice002P030_01Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_01Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_01Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_01_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_01_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_01_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_01_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  INCLUDE COND=(1,3,CH,EQ,C'AK1')
     *  SORT FIELDS=(1,41,A),FORMAT=BI
     *  SUM FIELDS=(43,8,ZD)
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_01Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_01Executor")
             .start(p030_01Decider(jobRepository, transactionManager))
             .from(p030_01Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_01Sort(jobRepository, transactionManager))
             .from(p030_01Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_01 ICETOOL Ends here 
     */
    
    /*
     * P030_02 ICETOOL starts here
     */
    
    private static final String P030_02_STEP = "p030_02";
    @Bean
    @JobScope
    public Ice002P030_02Sort ice002P030_02Sort() {
    	return new Ice002P030_02Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_02Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_02Sort",jobRepository).tasklet(ice002P030_02Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_02Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_02Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_02_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_02_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_02_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_02_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(1,3,CH,EQ,C'CLC')
     *   SORT FIELDS=(1,41,A),FORMAT=BI
     *   SUM FIELDS=(45,8,ZD)
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_02Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_02Executor")
             .start(p030_02Decider(jobRepository, transactionManager))
             .from(p030_02Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_02Sort(jobRepository, transactionManager))
             .from(p030_02Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_02 ICETOOL Ends here 
     */
    
    /*
     * P030_03 ICETOOL starts here
     */
    
    private static final String P030_03_STEP = "p030_03";
    @Bean
    @JobScope
    public Ice002P030_03Sort ice002P030_03Sort() {
    	return new Ice002P030_03Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_03Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_03Sort",jobRepository).tasklet(ice002P030_03Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_03Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_03Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_03_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_03_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_03_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_03_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(1,3,CH,EQ,C'BA1')
     *   SORT FIELDS=(1,41,A),FORMAT=BI
     *   SUM FIELDS=(45,8,ZD)
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_03Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_03Executor")
             .start(p030_03Decider(jobRepository, transactionManager))
             .from(p030_03Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_03Sort(jobRepository, transactionManager))
             .from(p030_03Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_03 ICETOOL Ends here 
     */
    
    /*
     * P030_04 ICETOOL starts here
     */
    
    private static final String P030_04_STEP = "p030_04";
    @Bean
    @JobScope
    public Ice002P030_04Sort ice002P030_04Sort() {
    	return new Ice002P030_04Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_04Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_04Sort",jobRepository).tasklet(ice002P030_04Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_04Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_04Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_04_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_04_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_04_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_04_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(1,3,CH,EQ,C'BA2')
     *   SORT FIELDS=(1,32,A),FORMAT=BI
     *   SUM FIELDS=(34,8,ZD)
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_04Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_04Executor")
             .start(p030_04Decider(jobRepository, transactionManager))
             .from(p030_04Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_04Sort(jobRepository, transactionManager))
             .from(p030_04Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_04 ICETOOL Ends here 
     */
    
    /*
     * P030_05 ICETOOL starts here
     */
    
    private static final String P030_05_STEP = "p030_05";
    @Bean
    @JobScope
    public Ice002P030_05Sort ice002P030_05Sort() {
    	return new Ice002P030_05Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_05Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_05Sort",jobRepository).tasklet(ice002P030_05Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_05Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_05Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_05_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_05_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_05_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_05_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(1,3,CH,EQ,C'BA3')
     *   SORT FIELDS=(1,29,A,38,3,A),FORMAT=BI
     *   SUM FIELDS=NONE
     *   OUTREC OVERLAY=(60:C'                     ')
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_05Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_05Executor")
             .start(p030_05Decider(jobRepository, transactionManager))
             .from(p030_05Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_05Sort(jobRepository, transactionManager))
             .from(p030_05Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_05 ICETOOL Ends here 
     */
    
    /*
     * P030_06 ICETOOL starts here
     */
    
    private static final String P030_06_STEP = "p030_06";
    @Bean
    @JobScope
    public Ice002P030_06Sort ice002P030_06Sort() {
    	return new Ice002P030_06Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_06Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_06Sort",jobRepository).tasklet(ice002P030_06Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_06Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_06Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_06_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_06_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_06_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_06_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(1,29,A),FORMAT=BI
     *   SUM FIELDS=NONE
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_06Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_06Executor")
             .start(p030_06Decider(jobRepository, transactionManager))
             .from(p030_06Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_06Sort(jobRepository, transactionManager))
             .from(p030_06Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_06 ICETOOL Ends here 
     */
    
    /*
     * P030_07 ICETOOL starts here
     */
    
    private static final String P030_07_STEP = "p030_07";
    @Bean
    @JobScope
    public Ice002P030_07Sort ice002P030_07Sort() {
    	return new Ice002P030_07Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_07Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_07Sort",jobRepository).tasklet(ice002P030_07Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_07Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_07Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_07_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_07_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_07_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_07_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(1,3,CH,EQ,C'BA4')
     *   SORT FIELDS=(1,30,A),FORMAT=BI
     *   SUM FIELDS=NONE
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_07Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_07Executor")
             .start(p030_07Decider(jobRepository, transactionManager))
             .from(p030_07Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_07Sort(jobRepository, transactionManager))
             .from(p030_07Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_07 ICETOOL Ends here 
     */
    
    /*
     * P030_08 ICETOOL starts here
     */
    
    private static final String P030_08_STEP = "p030_08";
    @Bean
    @JobScope
    public Ice002P030_08Sort ice002P030_08Sort() {
    	return new Ice002P030_08Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_08Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_08Sort",jobRepository).tasklet(ice002P030_08Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_08Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_08Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_08_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_08_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_08_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_08_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(1,3,CH,EQ,C'ITM')
     *   SORT FIELDS=(1,58,A),FORMAT=BI
     *   SUM FIELDS=NONE
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_08Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_08Executor")
             .start(p030_08Decider(jobRepository, transactionManager))
             .from(p030_08Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_08Sort(jobRepository, transactionManager))
             .from(p030_08Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_08 ICETOOL Ends here 
     */
    
    /*
     * P030_09 ICETOOL starts here
     */
    
    private static final String P030_09_STEP = "p030_09";
    @Bean
    @JobScope
    public Ice002P030_09Sort ice002P030_09Sort() {
    	return new Ice002P030_09Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_09Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_09Sort",jobRepository).tasklet(ice002P030_09Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_09Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_09Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_09_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_09_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_09_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_09_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000000 00000001 00000000 00000000 00000000 000
     *  00000 00000000',14X)
     *  SORT FIELDS=(1,3,A),FORMAT=BI
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_09Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_09Executor")
             .start(p030_09Decider(jobRepository, transactionManager))
             .from(p030_09Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_09Sort(jobRepository, transactionManager))
             .from(p030_09Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_09 ICETOOL Ends here 
     */
    
    /*
     * P030_10 ICETOOL starts here
     */
    
    private static final String P030_10_STEP = "p030_10";
    @Bean
    @JobScope
    public Ice002P030_10Sort ice002P030_10Sort() {
    	return new Ice002P030_10Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_10Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_10Sort",jobRepository).tasklet(ice002P030_10Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_10Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_10Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_10_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_10_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_10_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_10_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000001 00000000 00000000 00000000 00000000 000
     *  00000 00000000',14X)
     *  SORT FIELDS=(1,3,A),FORMAT=BI
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_10Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_10Executor")
             .start(p030_10Decider(jobRepository, transactionManager))
             .from(p030_10Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_10Sort(jobRepository, transactionManager))
             .from(p030_10Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_10 ICETOOL Ends here 
     */
    
    /*
     * P030_11 ICETOOL starts here
     */
    
    private static final String P030_11_STEP = "p030_11";
    @Bean
    @JobScope
    public Ice002P030_11Sort ice002P030_11Sort() {
    	return new Ice002P030_11Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_11Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_11Sort",jobRepository).tasklet(ice002P030_11Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_11Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_11Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_11_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_11_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_11_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_11_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000000 00000000 00000001 00000000 00000000 000
     *  00000 00000000',14X)
     *  SORT FIELDS=(1,3,A),FORMAT=BI
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_11Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_11Executor")
             .start(p030_11Decider(jobRepository, transactionManager))
             .from(p030_11Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_11Sort(jobRepository, transactionManager))
             .from(p030_11Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_11 ICETOOL Ends here 
     */
    
    /*
     * P030_12 ICETOOL starts here
     */
    
    private static final String P030_12_STEP = "p030_12";
    @Bean
    @JobScope
    public Ice002P030_12Sort ice002P030_12Sort() {
    	return new Ice002P030_12Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_12Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_12Sort",jobRepository).tasklet(ice002P030_12Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_12Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_12Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_12_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_12_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_12_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_12_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000000 00000000 00000000 00000001 00000000 000
     *  00000 00000000',14X)
     *  SORT FIELDS=(1,3,A),FORMAT=BI
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_12Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_12Executor")
             .start(p030_12Decider(jobRepository, transactionManager))
             .from(p030_12Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_12Sort(jobRepository, transactionManager))
             .from(p030_12Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_12 ICETOOL Ends here 
     */
    
    /*
     * P030_13 ICETOOL starts here
     */
    
    private static final String P030_13_STEP = "p030_13";
    @Bean
    @JobScope
    public Ice002P030_13Sort ice002P030_13Sort() {
    	return new Ice002P030_13Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_13Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_13Sort",jobRepository).tasklet(ice002P030_13Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_13Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_13Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_13_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_13_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_13_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_13_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000000 00000000 00000000 00000000 00000001 000
     *  00000 00000000',14X)
     *  SORT FIELDS=(1,3,A),FORMAT=BI
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_13Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_13Executor")
             .start(p030_13Decider(jobRepository, transactionManager))
             .from(p030_13Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_13Sort(jobRepository, transactionManager))
             .from(p030_13Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_13 ICETOOL Ends here 
     */
    
    /*
     * P030_14 ICETOOL starts here
     */
    
    private static final String P030_14_STEP = "p030_14";
    @Bean
    @JobScope
    public Ice002P030_14Sort ice002P030_14Sort() {
    	return new Ice002P030_14Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_14Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_14Sort",jobRepository).tasklet(ice002P030_14Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_14Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_14Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_14_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_14_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_14_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_14_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000000 00000000 00000000 00000000 00000000 000
     *  00001 00000000',14X)
     *  SORT FIELDS=(1,3,A),FORMAT=BI
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_14Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_14Executor")
             .start(p030_14Decider(jobRepository, transactionManager))
             .from(p030_14Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_14Sort(jobRepository, transactionManager))
             .from(p030_14Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_14 ICETOOL Ends here 
     */
    
    /*
     * P030_15 ICETOOL starts here
     */
    
    private static final String P030_15_STEP = "p030_15";
    @Bean
    @JobScope
    public Ice002P030_15Sort ice002P030_15Sort() {
    	return new Ice002P030_15Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_15Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_15Sort",jobRepository).tasklet(ice002P030_15Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_15Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_15Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_15_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_15_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_15_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_15_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000000 00000000 00000000 00000000 00000000 000
     *  00000 00000001',14X)
     *  SORT FIELDS=(1,3,A),FORMAT=BI
     *  OPTION ZDPRINT
     */
    @Bean
    public Flow p030_15Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_15Executor")
             .start(p030_15Decider(jobRepository, transactionManager))
             .from(p030_15Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_15Sort(jobRepository, transactionManager))
             .from(p030_15Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_15 ICETOOL Ends here 
     */
    
    /*
     * P030_16 ICETOOL starts here
     */
    
    private static final String P030_16_STEP = "p030_16";
    @Bean
    @JobScope
    public Ice002P030_16Sort ice002P030_16Sort() {
    	return new Ice002P030_16Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P030_16Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P030_16Sort",jobRepository).tasklet(ice002P030_16Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_16Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_16Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_16_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_16_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_16_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_16_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(1,3,CH,A)
     *   SUM FIELDS=(05,8,ZD,14,8,ZD,23,8,ZD,32,8,ZD,41,8,ZD,50,8,ZD,59,8,ZD)
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p030_16Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_16Executor")
             .start(p030_16Decider(jobRepository, transactionManager))
             .from(p030_16Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P030_16Sort(jobRepository, transactionManager))
             .from(p030_16Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_16 ICETOOL Ends here 
     */
    
    /*
     * P030_17 ICETOOL starts here
     */
    
    private static final String P030_17_STEP = "p030_17";
    @Bean
    public Step p030_17(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_17_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_17_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_17_STEP);
 		    	   		rc = copyUtil.performCopy(P030_17_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_17_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_17_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_17 ICETOOL Ends here 
     */
    
    /*
     * P030_18 ICETOOL starts here
     */
    
    private static final String P030_18_STEP = "p030_18";
    @Bean
    public Step p030_18(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_18_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_18_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_18_STEP);
 		    	   		rc = copyUtil.performCopy(P030_18_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_18_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_18_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_18 ICETOOL Ends here 
     */
    
    /*
     * P030_19 ICETOOL starts here
     */
    
    private static final String P030_19_STEP = "p030_19";
    @Bean
    public Step p030_19(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_19_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_19_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_19_STEP);
 		    	   		rc = copyUtil.performCopy(P030_19_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_19_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_19_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_19 ICETOOL Ends here 
     */
    
    /*
     * P030_20 ICETOOL starts here
     */
    
    private static final String P030_20_STEP = "p030_20";
    @Bean
    public Step p030_20(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_20_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_20_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_20_STEP);
 		    	   		rc = copyUtil.performCopy(P030_20_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_20_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_20_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_20 ICETOOL Ends here 
     */
    
    /*
     * P030_21 ICETOOL starts here
     */
    
    private static final String P030_21_STEP = "p030_21";
    @Bean
    public Step p030_21(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_21_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_21_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_21_STEP);
 		    	   		rc = copyUtil.performCopy(P030_21_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_21_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_21_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_21 ICETOOL Ends here 
     */
    
    /*
     * P030_22 ICETOOL starts here
     */
    
    private static final String P030_22_STEP = "p030_22";
    @Bean
    public Step p030_22(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_22_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_22_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_22_STEP);
 		    	   		rc = copyUtil.performCopy(P030_22_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_22_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_22_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_22 ICETOOL Ends here 
     */
    
    /*
     * P030_23 ICETOOL starts here
     */
    
    private static final String P030_23_STEP = "p030_23";
    @Bean
    public Step p030_23(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_23_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_23_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_23_STEP);
 		    	   		rc = copyUtil.performCopy(P030_23_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_23_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_23_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_23 ICETOOL Ends here 
     */
    
    /*
     * P030_24 ICETOOL starts here
     */
    
    private static final String P030_24_STEP = "p030_24";
    @Bean
    public Step p030_24(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P030_24_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P030_24_STEP)) {
 	 					int rc = 0; // ICETOOL PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P030_24_STEP);
 		    	   		rc = copyUtil.performCopy(P030_24_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P030_24_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P030_24_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	  , transactionManager  ).build();
    
    }
    /*
     * P030_24 ICETOOL Ends here 
     */
    
    /*
     * P050 IEBGENER starts here
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
 	 					int rc = 0; // IEBGENER PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(P050_STEP);
 		    	   		rc = copyUtil.performCopy(P050_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P050_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P050_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * P050 IEBGENER Ends here 
     */
    
    /*
     * P060 SORT starts here
     */
    
    private static final String P060_STEP = "p060";
    @Bean
    @JobScope
    public Ice002P060Sort ice002P060Sort() {
    	return new Ice002P060Sort();
    }
    
    @Bean
    @JobScope
    protected Step Ice002P060Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Ice002P060Sort",jobRepository).tasklet(ice002P060Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step p060Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p060Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P060_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P060_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P060_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(P060_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INREC  IFTHEN=(WHEN=(1,3,CH,EQ,C'AK1'),
     *          BUILD=(1:1,44,45:C'  ',47:45,8))
     *   OMIT FORMAT=BI,COND=(01,3,EQ,C'END')
     *   SORT FIELDS=(1,3,A,4,43,A),FORMAT=BI
     *   SUM  FIELDS=(47,8,ZD)
     *   OUTREC IFTHEN=(WHEN=(1,3,CH,EQ,C'AK1'),
     *          BUILD=(1:1,44,45:47,8))
     *   OPTION ZDPRINT
     */
    @Bean
    public Flow p060Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p060Executor")
             .start(p060Decider(jobRepository, transactionManager))
             .from(p060Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Ice002P060Sort(jobRepository, transactionManager))
             .from(p060Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P060 SORT Ends here 
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
