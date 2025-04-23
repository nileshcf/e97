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
    public IcemanSort1InputReader icemanSort1InputReader() {
    	return new IcemanSort1InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort1Processor icemanSort1Processor() {
    	return new IcemanSort1Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort1OutputWriter icemanSort1OutputWriter() {
    	return new IcemanSort1OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort1SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort1SortInput",jobRepository).tasklet(icemanSort1InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort1Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort1Process",jobRepository).tasklet(icemanSort1Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort1SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort1SortOutput",jobRepository).tasklet(icemanSort1OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort1SortInput(jobRepository, transactionManager))
             .next(processIcemanSort1Sort(jobRepository, transactionManager))
             .next(writeIcemanSort1SortOutput(jobRepository, transactionManager))
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
    public IcemanSort2InputReader icemanSort2InputReader() {
    	return new IcemanSort2InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort2Processor icemanSort2Processor() {
    	return new IcemanSort2Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort2OutputWriter icemanSort2OutputWriter() {
    	return new IcemanSort2OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort2SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort2SortInput",jobRepository).tasklet(icemanSort2InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort2Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort2Process",jobRepository).tasklet(icemanSort2Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort2SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort2SortOutput",jobRepository).tasklet(icemanSort2OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort2SortInput(jobRepository, transactionManager))
             .next(processIcemanSort2Sort(jobRepository, transactionManager))
             .next(writeIcemanSort2SortOutput(jobRepository, transactionManager))
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
    public IcemanSort3InputReader icemanSort3InputReader() {
    	return new IcemanSort3InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort3Processor icemanSort3Processor() {
    	return new IcemanSort3Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort3OutputWriter icemanSort3OutputWriter() {
    	return new IcemanSort3OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort3SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort3SortInput",jobRepository).tasklet(icemanSort3InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort3Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort3Process",jobRepository).tasklet(icemanSort3Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort3SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort3SortOutput",jobRepository).tasklet(icemanSort3OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort3SortInput(jobRepository, transactionManager))
             .next(processIcemanSort3Sort(jobRepository, transactionManager))
             .next(writeIcemanSort3SortOutput(jobRepository, transactionManager))
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
    public IcemanSort4InputReader icemanSort4InputReader() {
    	return new IcemanSort4InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort4Processor icemanSort4Processor() {
    	return new IcemanSort4Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort4OutputWriter icemanSort4OutputWriter() {
    	return new IcemanSort4OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort4SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort4SortInput",jobRepository).tasklet(icemanSort4InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort4Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort4Process",jobRepository).tasklet(icemanSort4Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort4SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort4SortOutput",jobRepository).tasklet(icemanSort4OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort4SortInput(jobRepository, transactionManager))
             .next(processIcemanSort4Sort(jobRepository, transactionManager))
             .next(writeIcemanSort4SortOutput(jobRepository, transactionManager))
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
    public IcemanSort5InputReader icemanSort5InputReader() {
    	return new IcemanSort5InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort5Processor icemanSort5Processor() {
    	return new IcemanSort5Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort5OutputWriter icemanSort5OutputWriter() {
    	return new IcemanSort5OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort5SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort5SortInput",jobRepository).tasklet(icemanSort5InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort5Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort5Process",jobRepository).tasklet(icemanSort5Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort5SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort5SortOutput",jobRepository).tasklet(icemanSort5OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort5SortInput(jobRepository, transactionManager))
             .next(processIcemanSort5Sort(jobRepository, transactionManager))
             .next(writeIcemanSort5SortOutput(jobRepository, transactionManager))
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
    public IcemanSort6InputReader icemanSort6InputReader() {
    	return new IcemanSort6InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort6Processor icemanSort6Processor() {
    	return new IcemanSort6Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort6OutputWriter icemanSort6OutputWriter() {
    	return new IcemanSort6OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort6SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort6SortInput",jobRepository).tasklet(icemanSort6InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort6Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort6Process",jobRepository).tasklet(icemanSort6Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort6SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort6SortOutput",jobRepository).tasklet(icemanSort6OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort6SortInput(jobRepository, transactionManager))
             .next(processIcemanSort6Sort(jobRepository, transactionManager))
             .next(writeIcemanSort6SortOutput(jobRepository, transactionManager))
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
    public IcemanSort7InputReader icemanSort7InputReader() {
    	return new IcemanSort7InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort7Processor icemanSort7Processor() {
    	return new IcemanSort7Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort7OutputWriter icemanSort7OutputWriter() {
    	return new IcemanSort7OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort7SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort7SortInput",jobRepository).tasklet(icemanSort7InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort7Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort7Process",jobRepository).tasklet(icemanSort7Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort7SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort7SortOutput",jobRepository).tasklet(icemanSort7OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort7SortInput(jobRepository, transactionManager))
             .next(processIcemanSort7Sort(jobRepository, transactionManager))
             .next(writeIcemanSort7SortOutput(jobRepository, transactionManager))
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
    public IcemanSort8InputReader icemanSort8InputReader() {
    	return new IcemanSort8InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort8Processor icemanSort8Processor() {
    	return new IcemanSort8Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort8OutputWriter icemanSort8OutputWriter() {
    	return new IcemanSort8OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort8SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort8SortInput",jobRepository).tasklet(icemanSort8InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort8Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort8Process",jobRepository).tasklet(icemanSort8Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort8SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort8SortOutput",jobRepository).tasklet(icemanSort8OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort8SortInput(jobRepository, transactionManager))
             .next(processIcemanSort8Sort(jobRepository, transactionManager))
             .next(writeIcemanSort8SortOutput(jobRepository, transactionManager))
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
    public IcemanSort9InputReader icemanSort9InputReader() {
    	return new IcemanSort9InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort9Processor icemanSort9Processor() {
    	return new IcemanSort9Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort9OutputWriter icemanSort9OutputWriter() {
    	return new IcemanSort9OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort9SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort9SortInput",jobRepository).tasklet(icemanSort9InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort9Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort9Process",jobRepository).tasklet(icemanSort9Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort9SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort9SortOutput",jobRepository).tasklet(icemanSort9OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort9SortInput(jobRepository, transactionManager))
             .next(processIcemanSort9Sort(jobRepository, transactionManager))
             .next(writeIcemanSort9SortOutput(jobRepository, transactionManager))
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
    public IcemanSort10InputReader icemanSort10InputReader() {
    	return new IcemanSort10InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort10Processor icemanSort10Processor() {
    	return new IcemanSort10Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort10OutputWriter icemanSort10OutputWriter() {
    	return new IcemanSort10OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort10SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort10SortInput",jobRepository).tasklet(icemanSort10InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort10Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort10Process",jobRepository).tasklet(icemanSort10Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort10SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort10SortOutput",jobRepository).tasklet(icemanSort10OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort10SortInput(jobRepository, transactionManager))
             .next(processIcemanSort10Sort(jobRepository, transactionManager))
             .next(writeIcemanSort10SortOutput(jobRepository, transactionManager))
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
    public IcemanSort11InputReader icemanSort11InputReader() {
    	return new IcemanSort11InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort11Processor icemanSort11Processor() {
    	return new IcemanSort11Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort11OutputWriter icemanSort11OutputWriter() {
    	return new IcemanSort11OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort11SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort11SortInput",jobRepository).tasklet(icemanSort11InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort11Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort11Process",jobRepository).tasklet(icemanSort11Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort11SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort11SortOutput",jobRepository).tasklet(icemanSort11OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort11SortInput(jobRepository, transactionManager))
             .next(processIcemanSort11Sort(jobRepository, transactionManager))
             .next(writeIcemanSort11SortOutput(jobRepository, transactionManager))
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
    public IcemanSort12InputReader icemanSort12InputReader() {
    	return new IcemanSort12InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort12Processor icemanSort12Processor() {
    	return new IcemanSort12Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort12OutputWriter icemanSort12OutputWriter() {
    	return new IcemanSort12OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort12SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort12SortInput",jobRepository).tasklet(icemanSort12InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort12Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort12Process",jobRepository).tasklet(icemanSort12Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort12SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort12SortOutput",jobRepository).tasklet(icemanSort12OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort12SortInput(jobRepository, transactionManager))
             .next(processIcemanSort12Sort(jobRepository, transactionManager))
             .next(writeIcemanSort12SortOutput(jobRepository, transactionManager))
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
    public IcemanSort13InputReader icemanSort13InputReader() {
    	return new IcemanSort13InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort13Processor icemanSort13Processor() {
    	return new IcemanSort13Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort13OutputWriter icemanSort13OutputWriter() {
    	return new IcemanSort13OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort13SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort13SortInput",jobRepository).tasklet(icemanSort13InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort13Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort13Process",jobRepository).tasklet(icemanSort13Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort13SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort13SortOutput",jobRepository).tasklet(icemanSort13OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort13SortInput(jobRepository, transactionManager))
             .next(processIcemanSort13Sort(jobRepository, transactionManager))
             .next(writeIcemanSort13SortOutput(jobRepository, transactionManager))
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
    public IcemanSort14InputReader icemanSort14InputReader() {
    	return new IcemanSort14InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort14Processor icemanSort14Processor() {
    	return new IcemanSort14Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort14OutputWriter icemanSort14OutputWriter() {
    	return new IcemanSort14OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort14SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort14SortInput",jobRepository).tasklet(icemanSort14InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort14Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort14Process",jobRepository).tasklet(icemanSort14Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort14SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort14SortOutput",jobRepository).tasklet(icemanSort14OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort14SortInput(jobRepository, transactionManager))
             .next(processIcemanSort14Sort(jobRepository, transactionManager))
             .next(writeIcemanSort14SortOutput(jobRepository, transactionManager))
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
    public IcemanSort15InputReader icemanSort15InputReader() {
    	return new IcemanSort15InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort15Processor icemanSort15Processor() {
    	return new IcemanSort15Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort15OutputWriter icemanSort15OutputWriter() {
    	return new IcemanSort15OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort15SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort15SortInput",jobRepository).tasklet(icemanSort15InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort15Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort15Process",jobRepository).tasklet(icemanSort15Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort15SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort15SortOutput",jobRepository).tasklet(icemanSort15OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort15SortInput(jobRepository, transactionManager))
             .next(processIcemanSort15Sort(jobRepository, transactionManager))
             .next(writeIcemanSort15SortOutput(jobRepository, transactionManager))
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
    public IcemanSort16InputReader icemanSort16InputReader() {
    	return new IcemanSort16InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort16Processor icemanSort16Processor() {
    	return new IcemanSort16Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort16OutputWriter icemanSort16OutputWriter() {
    	return new IcemanSort16OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort16SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort16SortInput",jobRepository).tasklet(icemanSort16InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort16Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort16Process",jobRepository).tasklet(icemanSort16Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort16SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort16SortOutput",jobRepository).tasklet(icemanSort16OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort16SortInput(jobRepository, transactionManager))
             .next(processIcemanSort16Sort(jobRepository, transactionManager))
             .next(writeIcemanSort16SortOutput(jobRepository, transactionManager))
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
    public IcemanSort18InputReader icemanSort18InputReader() {
    	return new IcemanSort18InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort18Processor icemanSort18Processor() {
    	return new IcemanSort18Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort18OutputWriter icemanSort18OutputWriter() {
    	return new IcemanSort18OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort18SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort18SortInput",jobRepository).tasklet(icemanSort18InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort18Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort18Process",jobRepository).tasklet(icemanSort18Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort18SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort18SortOutput",jobRepository).tasklet(icemanSort18OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort18SortInput(jobRepository, transactionManager))
             .next(processIcemanSort18Sort(jobRepository, transactionManager))
             .next(writeIcemanSort18SortOutput(jobRepository, transactionManager))
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
    public IcemanSort19InputReader icemanSort19InputReader() {
    	return new IcemanSort19InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort19Processor icemanSort19Processor() {
    	return new IcemanSort19Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort19OutputWriter icemanSort19OutputWriter() {
    	return new IcemanSort19OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort19SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort19SortInput",jobRepository).tasklet(icemanSort19InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort19Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort19Process",jobRepository).tasklet(icemanSort19Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort19SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort19SortOutput",jobRepository).tasklet(icemanSort19OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort19SortInput(jobRepository, transactionManager))
             .next(processIcemanSort19Sort(jobRepository, transactionManager))
             .next(writeIcemanSort19SortOutput(jobRepository, transactionManager))
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
    public IcemanSort20InputReader icemanSort20InputReader() {
    	return new IcemanSort20InputReader();
    }
    
    @Bean
    @JobScope
    public IcemanSort20Processor icemanSort20Processor() {
    	return new IcemanSort20Processor();
    }
    
    @Bean
    @JobScope
    public IcemanSort20OutputWriter icemanSort20OutputWriter() {
    	return new IcemanSort20OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readIcemanSort20SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readIcemanSort20SortInput",jobRepository).tasklet(icemanSort20InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processIcemanSort20Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortIcemanSort20Process",jobRepository).tasklet(icemanSort20Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeIcemanSort20SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeIcemanSort20SortOutput",jobRepository).tasklet(icemanSort20OutputWriter(), transactionManager).build();  
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
             .to(readIcemanSort20SortInput(jobRepository, transactionManager))
             .next(processIcemanSort20Sort(jobRepository, transactionManager))
             .next(writeIcemanSort20SortOutput(jobRepository, transactionManager))
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
