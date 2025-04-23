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
    
    private static final String JOBNAME = "SORTALLJCL";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * SORT1 - SORT
     * SORT2 - SORT
     * SORT3 - SORT
     * SORT4 - SORT
     * SORT5 - SORT
     * SORT6 - SORT
     * SORT7 - SORT
     * SORT8 - SORT
     * SORT9 - SORT
     * SORT10 - SORT
     * SORT11 - SORT
     * SORT12 - SORT
     * SORT13 - SORT
     * SORT14 - SORT
     * SORT15 - SORT
     * SORT16 - SORT
     * SORT18 - SORT
     * SORT19 - SORT
     * SORT20 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(sort1Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort2Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort3Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort4Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort5Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort6Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort7Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort8Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort9Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort10Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort11Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort12Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort13Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort14Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort15Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort16Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort18Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort19Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SORT Starts
			.next(sort20Executor(jobRepository, transactionManager)) /* (0,NE) */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * SORT1 SORT starts here
     */
    
    private static final String SORT1_STEP = "sort1";
    @Bean
    @JobScope
    public SortalljclSort1InputReader sortalljclSort1InputReader() {
    	return new SortalljclSort1InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort1Processor sortalljclSort1Processor() {
    	return new SortalljclSort1Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort1OutputWriter sortalljclSort1OutputWriter() {
    	return new SortalljclSort1OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort1SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort1SortInput",jobRepository).tasklet(sortalljclSort1InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort1Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort1Process",jobRepository).tasklet(sortalljclSort1Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort1SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort1SortOutput",jobRepository).tasklet(sortalljclSort1OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT1_STEP, rc, SORT );
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
             .to(readSortalljclSort1SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort1Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort1SortOutput(jobRepository, transactionManager))
             .from(sort1Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT1 SORT Ends here 
     */
    
    /*
     * SORT2 SORT starts here
     */
    
    private static final String SORT2_STEP = "sort2";
    @Bean
    @JobScope
    public SortalljclSort2InputReader sortalljclSort2InputReader() {
    	return new SortalljclSort2InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort2Processor sortalljclSort2Processor() {
    	return new SortalljclSort2Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort2OutputWriter sortalljclSort2OutputWriter() {
    	return new SortalljclSort2OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort2SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort2SortInput",jobRepository).tasklet(sortalljclSort2InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort2Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort2Process",jobRepository).tasklet(sortalljclSort2Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort2SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort2SortOutput",jobRepository).tasklet(sortalljclSort2OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT2_STEP, rc, SORT );
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
             .to(readSortalljclSort2SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort2Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort2SortOutput(jobRepository, transactionManager))
             .from(sort2Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT2 SORT Ends here 
     */
    
    /*
     * SORT3 SORT starts here
     */
    
    private static final String SORT3_STEP = "sort3";
    @Bean
    @JobScope
    public SortalljclSort3InputReader sortalljclSort3InputReader() {
    	return new SortalljclSort3InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort3Processor sortalljclSort3Processor() {
    	return new SortalljclSort3Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort3OutputWriter sortalljclSort3OutputWriter() {
    	return new SortalljclSort3OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort3SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort3SortInput",jobRepository).tasklet(sortalljclSort3InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort3Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort3Process",jobRepository).tasklet(sortalljclSort3Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort3SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort3SortOutput",jobRepository).tasklet(sortalljclSort3OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT3_STEP, rc, SORT );
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
             .to(readSortalljclSort3SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort3Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort3SortOutput(jobRepository, transactionManager))
             .from(sort3Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT3 SORT Ends here 
     */
    
    /*
     * SORT4 SORT starts here
     */
    
    private static final String SORT4_STEP = "sort4";
    @Bean
    @JobScope
    public SortalljclSort4InputReader sortalljclSort4InputReader() {
    	return new SortalljclSort4InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort4Processor sortalljclSort4Processor() {
    	return new SortalljclSort4Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort4OutputWriter sortalljclSort4OutputWriter() {
    	return new SortalljclSort4OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort4SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort4SortInput",jobRepository).tasklet(sortalljclSort4InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort4Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort4Process",jobRepository).tasklet(sortalljclSort4Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort4SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort4SortOutput",jobRepository).tasklet(sortalljclSort4OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT4_STEP, rc, SORT );
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
             .to(readSortalljclSort4SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort4Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort4SortOutput(jobRepository, transactionManager))
             .from(sort4Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT4 SORT Ends here 
     */
    
    /*
     * SORT5 SORT starts here
     */
    
    private static final String SORT5_STEP = "sort5";
    @Bean
    @JobScope
    public SortalljclSort5InputReader sortalljclSort5InputReader() {
    	return new SortalljclSort5InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort5Processor sortalljclSort5Processor() {
    	return new SortalljclSort5Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort5OutputWriter sortalljclSort5OutputWriter() {
    	return new SortalljclSort5OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort5SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort5SortInput",jobRepository).tasklet(sortalljclSort5InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort5Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort5Process",jobRepository).tasklet(sortalljclSort5Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort5SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort5SortOutput",jobRepository).tasklet(sortalljclSort5OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT5_STEP, rc, SORT );
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
             .to(readSortalljclSort5SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort5Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort5SortOutput(jobRepository, transactionManager))
             .from(sort5Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT5 SORT Ends here 
     */
    
    /*
     * SORT6 SORT starts here
     */
    
    private static final String SORT6_STEP = "sort6";
    @Bean
    @JobScope
    public SortalljclSort6InputReader sortalljclSort6InputReader() {
    	return new SortalljclSort6InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort6Processor sortalljclSort6Processor() {
    	return new SortalljclSort6Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort6OutputWriter sortalljclSort6OutputWriter() {
    	return new SortalljclSort6OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort6SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort6SortInput",jobRepository).tasklet(sortalljclSort6InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort6Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort6Process",jobRepository).tasklet(sortalljclSort6Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort6SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort6SortOutput",jobRepository).tasklet(sortalljclSort6OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT6_STEP, rc, SORT );
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
             .to(readSortalljclSort6SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort6Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort6SortOutput(jobRepository, transactionManager))
             .from(sort6Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT6 SORT Ends here 
     */
    
    /*
     * SORT7 SORT starts here
     */
    
    private static final String SORT7_STEP = "sort7";
    @Bean
    @JobScope
    public SortalljclSort7InputReader sortalljclSort7InputReader() {
    	return new SortalljclSort7InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort7Processor sortalljclSort7Processor() {
    	return new SortalljclSort7Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort7OutputWriter sortalljclSort7OutputWriter() {
    	return new SortalljclSort7OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort7SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort7SortInput",jobRepository).tasklet(sortalljclSort7InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort7Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort7Process",jobRepository).tasklet(sortalljclSort7Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort7SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort7SortOutput",jobRepository).tasklet(sortalljclSort7OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT7_STEP, rc, SORT );
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
             .to(readSortalljclSort7SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort7Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort7SortOutput(jobRepository, transactionManager))
             .from(sort7Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT7 SORT Ends here 
     */
    
    /*
     * SORT8 SORT starts here
     */
    
    private static final String SORT8_STEP = "sort8";
    @Bean
    @JobScope
    public SortalljclSort8InputReader sortalljclSort8InputReader() {
    	return new SortalljclSort8InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort8Processor sortalljclSort8Processor() {
    	return new SortalljclSort8Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort8OutputWriter sortalljclSort8OutputWriter() {
    	return new SortalljclSort8OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort8SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort8SortInput",jobRepository).tasklet(sortalljclSort8InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort8Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort8Process",jobRepository).tasklet(sortalljclSort8Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort8SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort8SortOutput",jobRepository).tasklet(sortalljclSort8OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT8_STEP, rc, SORT );
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
             .to(readSortalljclSort8SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort8Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort8SortOutput(jobRepository, transactionManager))
             .from(sort8Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT8 SORT Ends here 
     */
    
    /*
     * SORT9 SORT starts here
     */
    
    private static final String SORT9_STEP = "sort9";
    @Bean
    @JobScope
    public SortalljclSort9InputReader sortalljclSort9InputReader() {
    	return new SortalljclSort9InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort9Processor sortalljclSort9Processor() {
    	return new SortalljclSort9Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort9OutputWriter sortalljclSort9OutputWriter() {
    	return new SortalljclSort9OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort9SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort9SortInput",jobRepository).tasklet(sortalljclSort9InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort9Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort9Process",jobRepository).tasklet(sortalljclSort9Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort9SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort9SortOutput",jobRepository).tasklet(sortalljclSort9OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT9_STEP, rc, SORT );
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
             .to(readSortalljclSort9SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort9Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort9SortOutput(jobRepository, transactionManager))
             .from(sort9Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT9 SORT Ends here 
     */
    
    /*
     * SORT10 SORT starts here
     */
    
    private static final String SORT10_STEP = "sort10";
    @Bean
    @JobScope
    public SortalljclSort10InputReader sortalljclSort10InputReader() {
    	return new SortalljclSort10InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort10Processor sortalljclSort10Processor() {
    	return new SortalljclSort10Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort10OutputWriter sortalljclSort10OutputWriter() {
    	return new SortalljclSort10OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort10SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort10SortInput",jobRepository).tasklet(sortalljclSort10InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort10Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort10Process",jobRepository).tasklet(sortalljclSort10Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort10SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort10SortOutput",jobRepository).tasklet(sortalljclSort10OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT10_STEP, rc, SORT );
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
             .to(readSortalljclSort10SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort10Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort10SortOutput(jobRepository, transactionManager))
             .from(sort10Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT10 SORT Ends here 
     */
    
    /*
     * SORT11 SORT starts here
     */
    
    private static final String SORT11_STEP = "sort11";
    @Bean
    @JobScope
    public SortalljclSort11InputReader sortalljclSort11InputReader() {
    	return new SortalljclSort11InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort11Processor sortalljclSort11Processor() {
    	return new SortalljclSort11Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort11OutputWriter sortalljclSort11OutputWriter() {
    	return new SortalljclSort11OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort11SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort11SortInput",jobRepository).tasklet(sortalljclSort11InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort11Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort11Process",jobRepository).tasklet(sortalljclSort11Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort11SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort11SortOutput",jobRepository).tasklet(sortalljclSort11OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT11_STEP, rc, SORT );
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
             .to(readSortalljclSort11SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort11Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort11SortOutput(jobRepository, transactionManager))
             .from(sort11Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT11 SORT Ends here 
     */
    
    /*
     * SORT12 SORT starts here
     */
    
    private static final String SORT12_STEP = "sort12";
    @Bean
    @JobScope
    public SortalljclSort12InputReader sortalljclSort12InputReader() {
    	return new SortalljclSort12InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort12Processor sortalljclSort12Processor() {
    	return new SortalljclSort12Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort12OutputWriter sortalljclSort12OutputWriter() {
    	return new SortalljclSort12OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort12SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort12SortInput",jobRepository).tasklet(sortalljclSort12InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort12Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort12Process",jobRepository).tasklet(sortalljclSort12Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort12SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort12SortOutput",jobRepository).tasklet(sortalljclSort12OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT12_STEP, rc, SORT );
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
             .to(readSortalljclSort12SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort12Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort12SortOutput(jobRepository, transactionManager))
             .from(sort12Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT12 SORT Ends here 
     */
    
    /*
     * SORT13 SORT starts here
     */
    
    private static final String SORT13_STEP = "sort13";
    @Bean
    @JobScope
    public SortalljclSort13InputReader sortalljclSort13InputReader() {
    	return new SortalljclSort13InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort13Processor sortalljclSort13Processor() {
    	return new SortalljclSort13Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort13OutputWriter sortalljclSort13OutputWriter() {
    	return new SortalljclSort13OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort13SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort13SortInput",jobRepository).tasklet(sortalljclSort13InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort13Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort13Process",jobRepository).tasklet(sortalljclSort13Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort13SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort13SortOutput",jobRepository).tasklet(sortalljclSort13OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT13_STEP, rc, SORT );
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
             .to(readSortalljclSort13SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort13Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort13SortOutput(jobRepository, transactionManager))
             .from(sort13Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT13 SORT Ends here 
     */
    
    /*
     * SORT14 SORT starts here
     */
    
    private static final String SORT14_STEP = "sort14";
    @Bean
    @JobScope
    public SortalljclSort14InputReader sortalljclSort14InputReader() {
    	return new SortalljclSort14InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort14Processor sortalljclSort14Processor() {
    	return new SortalljclSort14Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort14OutputWriter sortalljclSort14OutputWriter() {
    	return new SortalljclSort14OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort14SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort14SortInput",jobRepository).tasklet(sortalljclSort14InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort14Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort14Process",jobRepository).tasklet(sortalljclSort14Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort14SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort14SortOutput",jobRepository).tasklet(sortalljclSort14OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT14_STEP, rc, SORT );
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
             .to(readSortalljclSort14SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort14Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort14SortOutput(jobRepository, transactionManager))
             .from(sort14Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT14 SORT Ends here 
     */
    
    /*
     * SORT15 SORT starts here
     */
    
    private static final String SORT15_STEP = "sort15";
    @Bean
    @JobScope
    public SortalljclSort15InputReader sortalljclSort15InputReader() {
    	return new SortalljclSort15InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort15Processor sortalljclSort15Processor() {
    	return new SortalljclSort15Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort15OutputWriter sortalljclSort15OutputWriter() {
    	return new SortalljclSort15OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort15SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort15SortInput",jobRepository).tasklet(sortalljclSort15InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort15Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort15Process",jobRepository).tasklet(sortalljclSort15Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort15SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort15SortOutput",jobRepository).tasklet(sortalljclSort15OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT15_STEP, rc, SORT );
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
             .to(readSortalljclSort15SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort15Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort15SortOutput(jobRepository, transactionManager))
             .from(sort15Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT15 SORT Ends here 
     */
    
    /*
     * SORT16 SORT starts here
     */
    
    private static final String SORT16_STEP = "sort16";
    @Bean
    @JobScope
    public SortalljclSort16InputReader sortalljclSort16InputReader() {
    	return new SortalljclSort16InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort16Processor sortalljclSort16Processor() {
    	return new SortalljclSort16Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort16OutputWriter sortalljclSort16OutputWriter() {
    	return new SortalljclSort16OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort16SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort16SortInput",jobRepository).tasklet(sortalljclSort16InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort16Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort16Process",jobRepository).tasklet(sortalljclSort16Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort16SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort16SortOutput",jobRepository).tasklet(sortalljclSort16OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT16_STEP, rc, SORT );
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
             .to(readSortalljclSort16SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort16Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort16SortOutput(jobRepository, transactionManager))
             .from(sort16Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT16 SORT Ends here 
     */
    
    /*
     * SORT18 SORT starts here
     */
    
    private static final String SORT18_STEP = "sort18";
    @Bean
    @JobScope
    public SortalljclSort18InputReader sortalljclSort18InputReader() {
    	return new SortalljclSort18InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort18Processor sortalljclSort18Processor() {
    	return new SortalljclSort18Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort18OutputWriter sortalljclSort18OutputWriter() {
    	return new SortalljclSort18OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort18SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort18SortInput",jobRepository).tasklet(sortalljclSort18InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort18Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort18Process",jobRepository).tasklet(sortalljclSort18Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort18SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort18SortOutput",jobRepository).tasklet(sortalljclSort18OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT18_STEP, rc, SORT );
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
             .to(readSortalljclSort18SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort18Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort18SortOutput(jobRepository, transactionManager))
             .from(sort18Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT18 SORT Ends here 
     */
    
    /*
     * SORT19 SORT starts here
     */
    
    private static final String SORT19_STEP = "sort19";
    @Bean
    @JobScope
    public SortalljclSort19InputReader sortalljclSort19InputReader() {
    	return new SortalljclSort19InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort19Processor sortalljclSort19Processor() {
    	return new SortalljclSort19Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort19OutputWriter sortalljclSort19OutputWriter() {
    	return new SortalljclSort19OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort19SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort19SortInput",jobRepository).tasklet(sortalljclSort19InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort19Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort19Process",jobRepository).tasklet(sortalljclSort19Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort19SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort19SortOutput",jobRepository).tasklet(sortalljclSort19OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT19_STEP, rc, SORT );
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
             .to(readSortalljclSort19SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort19Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort19SortOutput(jobRepository, transactionManager))
             .from(sort19Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT19 SORT Ends here 
     */
    
    /*
     * SORT20 SORT starts here
     */
    
    private static final String SORT20_STEP = "sort20";
    @Bean
    @JobScope
    public SortalljclSort20InputReader sortalljclSort20InputReader() {
    	return new SortalljclSort20InputReader();
    }
    
    @Bean
    @JobScope
    public SortalljclSort20Processor sortalljclSort20Processor() {
    	return new SortalljclSort20Processor();
    }
    
    @Bean
    @JobScope
    public SortalljclSort20OutputWriter sortalljclSort20OutputWriter() {
    	return new SortalljclSort20OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSortalljclSort20SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSortalljclSort20SortInput",jobRepository).tasklet(sortalljclSort20InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSortalljclSort20Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSortalljclSort20Process",jobRepository).tasklet(sortalljclSort20Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSortalljclSort20SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSortalljclSort20SortOutput",jobRepository).tasklet(sortalljclSort20OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT20_STEP, rc, SORT );
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
             .to(readSortalljclSort20SortInput(jobRepository, transactionManager))
             .next(processSortalljclSort20Sort(jobRepository, transactionManager))
             .next(writeSortalljclSort20SortOutput(jobRepository, transactionManager))
             .from(sort20Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT20 SORT Ends here 
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
