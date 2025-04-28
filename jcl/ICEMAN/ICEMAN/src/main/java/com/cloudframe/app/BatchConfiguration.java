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
    
    private static final String JOBNAME = "ICEMAN";
    
    /* Driver Programs used in steps */  
   private static final String ICEMAN = "ICEMAN";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * SORT1 - ICEMAN
     * SORT2 - ICEMAN
     * SORT3 - ICEMAN
     * SORT4 - ICEMAN
     * SORT5 - ICEMAN
     * SORT6 - ICEMAN
     * SORT7 - ICEMAN
     * SORT8 - ICEMAN
     * SORT9 - ICEMAN
     * SORT10 - ICEMAN
     * SORT11 - ICEMAN
     * SORT12 - ICEMAN
     * SORT13 - ICEMAN
     * SORT14 - ICEMAN
     * SORT15 - ICEMAN
     * SORT16 - ICEMAN
     * SORT18 - ICEMAN
     * SORT19 - ICEMAN
     * SORT20 - ICEMAN
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(sort1Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort2Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort3Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort4Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort5Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort6Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort7Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort8Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort9Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort10Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort11Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort12Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort13Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort14Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort15Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort16Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort18Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort19Executor(jobRepository, transactionManager)) /* (0,NE) */

			// ICEMAN Starts
			.next(sort20Executor(jobRepository, transactionManager)) /* (0,NE) */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * SORT1 ICEMAN starts here
     */
    
    private static final String SORT1_STEP = "sort1";
    @Bean
    @JobScope
    public IcemanSort1Sort icemanSort1Sort() {
    	return new IcemanSort1Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort1Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort1Sort",jobRepository).tasklet(icemanSort1Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort1Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort1Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT1_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT1_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT1_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT1_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *    SORT FIELDS=(54,9,CH,A,50,3,CH,A),EQUALS                                     
     *    SUM FIELDS=NONE                                                              
     */
    @Bean
    public Flow sort1Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort1Executor")
             .start(sort1Decider(jobRepository, transactionManager))
             .from(sort1Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort1Sort(jobRepository, transactionManager))
             .from(sort1Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT1 ICEMAN Ends here 
     */
    
    /*
     * SORT2 ICEMAN starts here
     */
    
    private static final String SORT2_STEP = "sort2";
    @Bean
    @JobScope
    public IcemanSort2Sort icemanSort2Sort() {
    	return new IcemanSort2Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort2Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort2Sort",jobRepository).tasklet(icemanSort2Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort2Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort2Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT2_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT2_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT2_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT2_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=COPY                                                               
     *  OMIT    COND=(54,9,EQ,C'CUSIP6191',OR,54,9,EQ,C'CUSIP6701'),                   
     *          FORMAT=CH                                                              
     */
    @Bean
    public Flow sort2Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort2Executor")
             .start(sort2Decider(jobRepository, transactionManager))
             .from(sort2Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort2Sort(jobRepository, transactionManager))
             .from(sort2Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT2 ICEMAN Ends here 
     */
    
    /*
     * SORT3 ICEMAN starts here
     */
    
    private static final String SORT3_STEP = "sort3";
    @Bean
    @JobScope
    public IcemanSort3Sort icemanSort3Sort() {
    	return new IcemanSort3Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort3Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort3Sort",jobRepository).tasklet(icemanSort3Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort3Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort3Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT3_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT3_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT3_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT3_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *    SORT FIELDS=(54,9,CH,A,50,3,CH,A),EQUALS                                     
     *  INCLUDE COND=(54,9,EQ,C'CUSIP6191',OR,54,9,EQ,C'CUSIP6701'),                   
     *          FORMAT=CH                                                              
     */
    @Bean
    public Flow sort3Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort3Executor")
             .start(sort3Decider(jobRepository, transactionManager))
             .from(sort3Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort3Sort(jobRepository, transactionManager))
             .from(sort3Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT3 ICEMAN Ends here 
     */
    
    /*
     * SORT4 ICEMAN starts here
     */
    
    private static final String SORT4_STEP = "sort4";
    @Bean
    @JobScope
    public IcemanSort4Sort icemanSort4Sort() {
    	return new IcemanSort4Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort4Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort4Sort",jobRepository).tasklet(icemanSort4Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort4Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort4Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT4_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT4_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT4_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT4_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(54,9,CH,A,50,3,CH,A)                                              
     *  SUM FIELDS=NONE                                                                
     *  INCLUDE COND=(54,9,EQ,C'CUSIP6191',OR,54,9,EQ,C'CUSIP6701'),                   
     *          FORMAT=CH                                                              
     */
    @Bean
    public Flow sort4Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort4Executor")
             .start(sort4Decider(jobRepository, transactionManager))
             .from(sort4Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort4Sort(jobRepository, transactionManager))
             .from(sort4Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT4 ICEMAN Ends here 
     */
    
    /*
     * SORT5 ICEMAN starts here
     */
    
    private static final String SORT5_STEP = "sort5";
    @Bean
    @JobScope
    public IcemanSort5Sort icemanSort5Sort() {
    	return new IcemanSort5Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort5Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort5Sort",jobRepository).tasklet(icemanSort5Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort5Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort5Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT5_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT5_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT5_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT5_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=COPY                                                               
     */
    @Bean
    public Flow sort5Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort5Executor")
             .start(sort5Decider(jobRepository, transactionManager))
             .from(sort5Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort5Sort(jobRepository, transactionManager))
             .from(sort5Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT5 ICEMAN Ends here 
     */
    
    /*
     * SORT6 ICEMAN starts here
     */
    
    private static final String SORT6_STEP = "sort6";
    @Bean
    @JobScope
    public IcemanSort6Sort icemanSort6Sort() {
    	return new IcemanSort6Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort6Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort6Sort",jobRepository).tasklet(icemanSort6Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort6Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort6Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT6_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT6_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT6_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT6_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(54,9,CH,A)                                                        
     *  SUM  FIELDS=NONE                                                               
     *  OUTREC FIELDS=(54,9)                                                           
     */
    @Bean
    public Flow sort6Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort6Executor")
             .start(sort6Decider(jobRepository, transactionManager))
             .from(sort6Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort6Sort(jobRepository, transactionManager))
             .from(sort6Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT6 ICEMAN Ends here 
     */
    
    /*
     * SORT7 ICEMAN starts here
     */
    
    private static final String SORT7_STEP = "sort7";
    @Bean
    @JobScope
    public IcemanSort7Sort icemanSort7Sort() {
    	return new IcemanSort7Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort7Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort7Sort",jobRepository).tasklet(icemanSort7Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort7Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort7Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT7_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT7_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT7_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT7_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(54,9,CH,A),EQUALS                                                 
     *  SUM FIELDS=NONE                                                                
     *  OMIT   COND=(49,1,CH,LE,C' ')                                                  
     */
    @Bean
    public Flow sort7Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort7Executor")
             .start(sort7Decider(jobRepository, transactionManager))
             .from(sort7Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort7Sort(jobRepository, transactionManager))
             .from(sort7Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT7 ICEMAN Ends here 
     */
    
    /*
     * SORT8 ICEMAN starts here
     */
    
    private static final String SORT8_STEP = "sort8";
    @Bean
    @JobScope
    public IcemanSort8Sort icemanSort8Sort() {
    	return new IcemanSort8Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort8Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort8Sort",jobRepository).tasklet(icemanSort8Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort8Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort8Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT8_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT8_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT8_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT8_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(54,9,CH,A)                                                        
     *  SUM FIELDS=NONE                                                                
     *  OMIT   COND=(1,1,CH,LE,C' ')                                                   
     *  OUTREC FIELDS=(54,9,                                                           
     *  10:1C'USD')                                                                    
     */
    @Bean
    public Flow sort8Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort8Executor")
             .start(sort8Decider(jobRepository, transactionManager))
             .from(sort8Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort8Sort(jobRepository, transactionManager))
             .from(sort8Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT8 ICEMAN Ends here 
     */
    
    /*
     * SORT9 ICEMAN starts here
     */
    
    private static final String SORT9_STEP = "sort9";
    @Bean
    @JobScope
    public IcemanSort9Sort icemanSort9Sort() {
    	return new IcemanSort9Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort9Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort9Sort",jobRepository).tasklet(icemanSort9Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort9Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort9Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT9_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT9_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT9_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT9_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(40,07,CH,A)                                                       
     *  INCLUDE COND=(49,01,CH,GT,C' ',AND,40,01,CH,NE,X'FF')                          
     *  OUTREC FIELDS=(40,07,C'0')                                                     
     *  SUM FIELDS=NONE                                                                
     */
    @Bean
    public Flow sort9Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort9Executor")
             .start(sort9Decider(jobRepository, transactionManager))
             .from(sort9Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort9Sort(jobRepository, transactionManager))
             .from(sort9Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT9 ICEMAN Ends here 
     */
    
    /*
     * SORT10 ICEMAN starts here
     */
    
    private static final String SORT10_STEP = "sort10";
    @Bean
    @JobScope
    public IcemanSort10Sort icemanSort10Sort() {
    	return new IcemanSort10Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort10Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort10Sort",jobRepository).tasklet(icemanSort10Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort10Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort10Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT10_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT10_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT10_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT10_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=(1,8,CH,A),EQUALS                                                  
     *   INREC IFTHEN=(WHEN=(26,3,CH,NE,C'USD'),OVERLAY=(26:C'USD'))                   
     *   SUM  FIELDS=NONE                                                              
     */
    @Bean
    public Flow sort10Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort10Executor")
             .start(sort10Decider(jobRepository, transactionManager))
             .from(sort10Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort10Sort(jobRepository, transactionManager))
             .from(sort10Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT10 ICEMAN Ends here 
     */
    
    /*
     * SORT11 ICEMAN starts here
     */
    
    private static final String SORT11_STEP = "sort11";
    @Bean
    @JobScope
    public IcemanSort11Sort icemanSort11Sort() {
    	return new IcemanSort11Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort11Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort11Sort",jobRepository).tasklet(icemanSort11Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort11Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort11Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT11_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT11_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT11_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT11_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT   FIELDS=(1,8,CH,A),EQUALS                                                
     *  SUM    FIELDS=NONE                                                             
     *  OMIT   COND=(1,1,CH,LE,C' ')                                                   
     *  OUTREC FIELDS=(1,8,                                                            
     *                 10,3,CHANGE=(3,C'   ',C'USD'),                                  
     *                      NOMATCH=(10,3))                                            
     */
    @Bean
    public Flow sort11Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort11Executor")
             .start(sort11Decider(jobRepository, transactionManager))
             .from(sort11Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort11Sort(jobRepository, transactionManager))
             .from(sort11Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT11 ICEMAN Ends here 
     */
    
    /*
     * SORT12 ICEMAN starts here
     */
    
    private static final String SORT12_STEP = "sort12";
    @Bean
    @JobScope
    public IcemanSort12Sort icemanSort12Sort() {
    	return new IcemanSort12Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort12Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort12Sort",jobRepository).tasklet(icemanSort12Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort12Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort12Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT12_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT12_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT12_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT12_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT   FIELDS=(1,8,CH,A),EQUALS                                               
     *   SUM    FIELDS=NONE                                                            
     *   OMIT   COND=(1,1,CH,EQ,C'1')                                                  
     */
    @Bean
    public Flow sort12Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort12Executor")
             .start(sort12Decider(jobRepository, transactionManager))
             .from(sort12Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort12Sort(jobRepository, transactionManager))
             .from(sort12Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT12 ICEMAN Ends here 
     */
    
    /*
     * SORT13 ICEMAN starts here
     */
    
    private static final String SORT13_STEP = "sort13";
    @Bean
    @JobScope
    public IcemanSort13Sort icemanSort13Sort() {
    	return new IcemanSort13Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort13Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort13Sort",jobRepository).tasklet(icemanSort13Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort13Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort13Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT13_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT13_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT13_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT13_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT   FIELDS=(1,8,CH,A),EQUALS                                               
     *   SUM    FIELDS=NONE                                                            
     *   OMIT   COND=(1,1,CH,LE,C'1')                                                  
     */
    @Bean
    public Flow sort13Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort13Executor")
             .start(sort13Decider(jobRepository, transactionManager))
             .from(sort13Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort13Sort(jobRepository, transactionManager))
             .from(sort13Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT13 ICEMAN Ends here 
     */
    
    /*
     * SORT14 ICEMAN starts here
     */
    
    private static final String SORT14_STEP = "sort14";
    @Bean
    @JobScope
    public IcemanSort14Sort icemanSort14Sort() {
    	return new IcemanSort14Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort14Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort14Sort",jobRepository).tasklet(icemanSort14Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort14Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort14Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT14_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT14_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT14_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT14_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  MERGE   FIELDS=COPY                                                            
     */
    @Bean
    public Flow sort14Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort14Executor")
             .start(sort14Decider(jobRepository, transactionManager))
             .from(sort14Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort14Sort(jobRepository, transactionManager))
             .from(sort14Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT14 ICEMAN Ends here 
     */
    
    /*
     * SORT15 ICEMAN starts here
     */
    
    private static final String SORT15_STEP = "sort15";
    @Bean
    @JobScope
    public IcemanSort15Sort icemanSort15Sort() {
    	return new IcemanSort15Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort15Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort15Sort",jobRepository).tasklet(icemanSort15Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort15Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort15Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT15_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT15_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT15_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT15_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *    SORT FIELDS=(54,9,CH,A,50,3,CH,A),EQUALS                                     
     *    SUM FIELDS=NONE                                                              
     */
    @Bean
    public Flow sort15Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort15Executor")
             .start(sort15Decider(jobRepository, transactionManager))
             .from(sort15Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort15Sort(jobRepository, transactionManager))
             .from(sort15Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT15 ICEMAN Ends here 
     */
    
    /*
     * SORT16 ICEMAN starts here
     */
    
    private static final String SORT16_STEP = "sort16";
    @Bean
    @JobScope
    public IcemanSort16Sort icemanSort16Sort() {
    	return new IcemanSort16Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort16Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort16Sort",jobRepository).tasklet(icemanSort16Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort16Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort16Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT16_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT16_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT16_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT16_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *    SORT FIELDS=COPY                                                             
     */
    @Bean
    public Flow sort16Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort16Executor")
             .start(sort16Decider(jobRepository, transactionManager))
             .from(sort16Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort16Sort(jobRepository, transactionManager))
             .from(sort16Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT16 ICEMAN Ends here 
     */
    
    /*
     * SORT18 ICEMAN starts here
     */
    
    private static final String SORT18_STEP = "sort18";
    @Bean
    @JobScope
    public IcemanSort18Sort icemanSort18Sort() {
    	return new IcemanSort18Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort18Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort18Sort",jobRepository).tasklet(icemanSort18Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort18Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort18Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT18_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT18_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT18_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT18_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT   FIELDS=(1,8,CH,A),EQUALS                                                
     *  SUM    FIELDS=NONE                                                             
     *  OMIT   COND=(1,1,CH,LE,C' ')                                                   
     *  OUTREC FIELDS=(1,8,                                                            
     *                 10,3,CHANGE=(3,C'   ',C'USD'),                                  
     *                      NOMATCH=(10,3))                                            
     */
    @Bean
    public Flow sort18Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort18Executor")
             .start(sort18Decider(jobRepository, transactionManager))
             .from(sort18Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort18Sort(jobRepository, transactionManager))
             .from(sort18Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT18 ICEMAN Ends here 
     */
    
    /*
     * SORT19 ICEMAN starts here
     */
    
    private static final String SORT19_STEP = "sort19";
    @Bean
    @JobScope
    public IcemanSort19Sort icemanSort19Sort() {
    	return new IcemanSort19Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort19Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort19Sort",jobRepository).tasklet(icemanSort19Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort19Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort19Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT19_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT19_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT19_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT19_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *    SORT FIELDS=(54,9,CH,A,50,3,CH,A),EQUALS                                     
     *    SUM FIELDS=NONE                                                              
     */
    @Bean
    public Flow sort19Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort19Executor")
             .start(sort19Decider(jobRepository, transactionManager))
             .from(sort19Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort19Sort(jobRepository, transactionManager))
             .from(sort19Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT19 ICEMAN Ends here 
     */
    
    /*
     * SORT20 ICEMAN starts here
     */
    
    private static final String SORT20_STEP = "sort20";
    @Bean
    @JobScope
    public IcemanSort20Sort icemanSort20Sort() {
    	return new IcemanSort20Sort();
    }
    
    @Bean
    @JobScope
    protected Step IcemanSort20Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("IcemanSort20Sort",jobRepository).tasklet(icemanSort20Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort20Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort20Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT20_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT20_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT20_STEP, rc, ICEMAN );
    		      cfStepHandler.updateStepExecution(SORT20_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT   FIELDS=(1,8,CH,A),EQUALS                                                
     *  SUM    FIELDS=NONE                                                             
     *  OMIT   COND=(1,1,CH,LE,C' ')                                                   
     *  OUTREC FIELDS=(1,8,                                                            
     *                 10,3,CHANGE=(3,C'   ',C'USD'),                                  
     *                      NOMATCH=(10,3))                                            
     */
    @Bean
    public Flow sort20Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort20Executor")
             .start(sort20Decider(jobRepository, transactionManager))
             .from(sort20Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(IcemanSort20Sort(jobRepository, transactionManager))
             .from(sort20Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT20 ICEMAN Ends here 
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
