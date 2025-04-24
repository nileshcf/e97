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
    
    private static final String JOBNAME = "SYNCSORT";
    
    /* Driver Programs used in steps */  
   private static final String SYNCSORT = "SYNCSORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * SORT1 - SYNCSORT
     * SORT2 - SYNCSORT
     * SORT3 - SYNCSORT
     * SORT4 - SYNCSORT
     * SORT5 - SYNCSORT
     * SORT6 - SYNCSORT
     * SORT7 - SYNCSORT
     * SORT8 - SYNCSORT
     * SORT9 - SYNCSORT
     * SORT10 - SYNCSORT
     * SORT11 - SYNCSORT
     * SORT12 - SYNCSORT
     * SORT13 - SYNCSORT
     * SORT14 - SYNCSORT
     * SORT15 - SYNCSORT
     * SORT16 - SYNCSORT
     * SORT18 - SYNCSORT
     * SORT19 - SYNCSORT
     * SORT20 - SYNCSORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(sort1Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort2Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort3Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort4Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort5Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort6Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort7Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort8Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort9Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort10Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort11Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort12Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort13Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort14Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort15Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort16Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort18Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort19Executor(jobRepository, transactionManager)) /* (0,NE) */

			// SYNCSORT Starts
			.next(sort20Executor(jobRepository, transactionManager)) /* (0,NE) */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * SORT1 SYNCSORT starts here
     */
    
    private static final String SORT1_STEP = "sort1";
    @Bean
    @JobScope
    public SyncsortSort1InputReader syncsortSort1InputReader() {
    	return new SyncsortSort1InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort1Processor syncsortSort1Processor() {
    	return new SyncsortSort1Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort1OutputWriter syncsortSort1OutputWriter() {
    	return new SyncsortSort1OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort1SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort1SortInput",jobRepository).tasklet(syncsortSort1InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort1Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort1Process",jobRepository).tasklet(syncsortSort1Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort1SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort1SortOutput",jobRepository).tasklet(syncsortSort1OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT1_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort1SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort1Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort1SortOutput(jobRepository, transactionManager))
             .from(sort1Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT1 SYNCSORT Ends here 
     */
    
    /*
     * SORT2 SYNCSORT starts here
     */
    
    private static final String SORT2_STEP = "sort2";
    @Bean
    @JobScope
    public SyncsortSort2InputReader syncsortSort2InputReader() {
    	return new SyncsortSort2InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort2Processor syncsortSort2Processor() {
    	return new SyncsortSort2Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort2OutputWriter syncsortSort2OutputWriter() {
    	return new SyncsortSort2OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort2SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort2SortInput",jobRepository).tasklet(syncsortSort2InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort2Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort2Process",jobRepository).tasklet(syncsortSort2Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort2SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort2SortOutput",jobRepository).tasklet(syncsortSort2OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT2_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort2SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort2Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort2SortOutput(jobRepository, transactionManager))
             .from(sort2Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT2 SYNCSORT Ends here 
     */
    
    /*
     * SORT3 SYNCSORT starts here
     */
    
    private static final String SORT3_STEP = "sort3";
    @Bean
    @JobScope
    public SyncsortSort3InputReader syncsortSort3InputReader() {
    	return new SyncsortSort3InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort3Processor syncsortSort3Processor() {
    	return new SyncsortSort3Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort3OutputWriter syncsortSort3OutputWriter() {
    	return new SyncsortSort3OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort3SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort3SortInput",jobRepository).tasklet(syncsortSort3InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort3Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort3Process",jobRepository).tasklet(syncsortSort3Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort3SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort3SortOutput",jobRepository).tasklet(syncsortSort3OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT3_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort3SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort3Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort3SortOutput(jobRepository, transactionManager))
             .from(sort3Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT3 SYNCSORT Ends here 
     */
    
    /*
     * SORT4 SYNCSORT starts here
     */
    
    private static final String SORT4_STEP = "sort4";
    @Bean
    @JobScope
    public SyncsortSort4InputReader syncsortSort4InputReader() {
    	return new SyncsortSort4InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort4Processor syncsortSort4Processor() {
    	return new SyncsortSort4Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort4OutputWriter syncsortSort4OutputWriter() {
    	return new SyncsortSort4OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort4SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort4SortInput",jobRepository).tasklet(syncsortSort4InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort4Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort4Process",jobRepository).tasklet(syncsortSort4Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort4SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort4SortOutput",jobRepository).tasklet(syncsortSort4OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT4_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort4SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort4Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort4SortOutput(jobRepository, transactionManager))
             .from(sort4Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT4 SYNCSORT Ends here 
     */
    
    /*
     * SORT5 SYNCSORT starts here
     */
    
    private static final String SORT5_STEP = "sort5";
    @Bean
    @JobScope
    public SyncsortSort5InputReader syncsortSort5InputReader() {
    	return new SyncsortSort5InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort5Processor syncsortSort5Processor() {
    	return new SyncsortSort5Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort5OutputWriter syncsortSort5OutputWriter() {
    	return new SyncsortSort5OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort5SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort5SortInput",jobRepository).tasklet(syncsortSort5InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort5Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort5Process",jobRepository).tasklet(syncsortSort5Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort5SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort5SortOutput",jobRepository).tasklet(syncsortSort5OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT5_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort5SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort5Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort5SortOutput(jobRepository, transactionManager))
             .from(sort5Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT5 SYNCSORT Ends here 
     */
    
    /*
     * SORT6 SYNCSORT starts here
     */
    
    private static final String SORT6_STEP = "sort6";
    @Bean
    @JobScope
    public SyncsortSort6InputReader syncsortSort6InputReader() {
    	return new SyncsortSort6InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort6Processor syncsortSort6Processor() {
    	return new SyncsortSort6Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort6OutputWriter syncsortSort6OutputWriter() {
    	return new SyncsortSort6OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort6SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort6SortInput",jobRepository).tasklet(syncsortSort6InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort6Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort6Process",jobRepository).tasklet(syncsortSort6Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort6SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort6SortOutput",jobRepository).tasklet(syncsortSort6OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT6_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort6SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort6Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort6SortOutput(jobRepository, transactionManager))
             .from(sort6Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT6 SYNCSORT Ends here 
     */
    
    /*
     * SORT7 SYNCSORT starts here
     */
    
    private static final String SORT7_STEP = "sort7";
    @Bean
    @JobScope
    public SyncsortSort7InputReader syncsortSort7InputReader() {
    	return new SyncsortSort7InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort7Processor syncsortSort7Processor() {
    	return new SyncsortSort7Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort7OutputWriter syncsortSort7OutputWriter() {
    	return new SyncsortSort7OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort7SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort7SortInput",jobRepository).tasklet(syncsortSort7InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort7Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort7Process",jobRepository).tasklet(syncsortSort7Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort7SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort7SortOutput",jobRepository).tasklet(syncsortSort7OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT7_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort7SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort7Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort7SortOutput(jobRepository, transactionManager))
             .from(sort7Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT7 SYNCSORT Ends here 
     */
    
    /*
     * SORT8 SYNCSORT starts here
     */
    
    private static final String SORT8_STEP = "sort8";
    @Bean
    @JobScope
    public SyncsortSort8InputReader syncsortSort8InputReader() {
    	return new SyncsortSort8InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort8Processor syncsortSort8Processor() {
    	return new SyncsortSort8Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort8OutputWriter syncsortSort8OutputWriter() {
    	return new SyncsortSort8OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort8SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort8SortInput",jobRepository).tasklet(syncsortSort8InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort8Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort8Process",jobRepository).tasklet(syncsortSort8Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort8SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort8SortOutput",jobRepository).tasklet(syncsortSort8OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT8_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort8SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort8Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort8SortOutput(jobRepository, transactionManager))
             .from(sort8Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT8 SYNCSORT Ends here 
     */
    
    /*
     * SORT9 SYNCSORT starts here
     */
    
    private static final String SORT9_STEP = "sort9";
    @Bean
    @JobScope
    public SyncsortSort9InputReader syncsortSort9InputReader() {
    	return new SyncsortSort9InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort9Processor syncsortSort9Processor() {
    	return new SyncsortSort9Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort9OutputWriter syncsortSort9OutputWriter() {
    	return new SyncsortSort9OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort9SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort9SortInput",jobRepository).tasklet(syncsortSort9InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort9Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort9Process",jobRepository).tasklet(syncsortSort9Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort9SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort9SortOutput",jobRepository).tasklet(syncsortSort9OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT9_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort9SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort9Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort9SortOutput(jobRepository, transactionManager))
             .from(sort9Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT9 SYNCSORT Ends here 
     */
    
    /*
     * SORT10 SYNCSORT starts here
     */
    
    private static final String SORT10_STEP = "sort10";
    @Bean
    @JobScope
    public SyncsortSort10InputReader syncsortSort10InputReader() {
    	return new SyncsortSort10InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort10Processor syncsortSort10Processor() {
    	return new SyncsortSort10Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort10OutputWriter syncsortSort10OutputWriter() {
    	return new SyncsortSort10OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort10SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort10SortInput",jobRepository).tasklet(syncsortSort10InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort10Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort10Process",jobRepository).tasklet(syncsortSort10Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort10SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort10SortOutput",jobRepository).tasklet(syncsortSort10OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT10_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort10SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort10Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort10SortOutput(jobRepository, transactionManager))
             .from(sort10Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT10 SYNCSORT Ends here 
     */
    
    /*
     * SORT11 SYNCSORT starts here
     */
    
    private static final String SORT11_STEP = "sort11";
    @Bean
    @JobScope
    public SyncsortSort11InputReader syncsortSort11InputReader() {
    	return new SyncsortSort11InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort11Processor syncsortSort11Processor() {
    	return new SyncsortSort11Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort11OutputWriter syncsortSort11OutputWriter() {
    	return new SyncsortSort11OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort11SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort11SortInput",jobRepository).tasklet(syncsortSort11InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort11Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort11Process",jobRepository).tasklet(syncsortSort11Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort11SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort11SortOutput",jobRepository).tasklet(syncsortSort11OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT11_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort11SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort11Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort11SortOutput(jobRepository, transactionManager))
             .from(sort11Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT11 SYNCSORT Ends here 
     */
    
    /*
     * SORT12 SYNCSORT starts here
     */
    
    private static final String SORT12_STEP = "sort12";
    @Bean
    @JobScope
    public SyncsortSort12InputReader syncsortSort12InputReader() {
    	return new SyncsortSort12InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort12Processor syncsortSort12Processor() {
    	return new SyncsortSort12Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort12OutputWriter syncsortSort12OutputWriter() {
    	return new SyncsortSort12OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort12SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort12SortInput",jobRepository).tasklet(syncsortSort12InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort12Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort12Process",jobRepository).tasklet(syncsortSort12Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort12SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort12SortOutput",jobRepository).tasklet(syncsortSort12OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT12_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort12SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort12Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort12SortOutput(jobRepository, transactionManager))
             .from(sort12Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT12 SYNCSORT Ends here 
     */
    
    /*
     * SORT13 SYNCSORT starts here
     */
    
    private static final String SORT13_STEP = "sort13";
    @Bean
    @JobScope
    public SyncsortSort13InputReader syncsortSort13InputReader() {
    	return new SyncsortSort13InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort13Processor syncsortSort13Processor() {
    	return new SyncsortSort13Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort13OutputWriter syncsortSort13OutputWriter() {
    	return new SyncsortSort13OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort13SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort13SortInput",jobRepository).tasklet(syncsortSort13InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort13Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort13Process",jobRepository).tasklet(syncsortSort13Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort13SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort13SortOutput",jobRepository).tasklet(syncsortSort13OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT13_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort13SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort13Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort13SortOutput(jobRepository, transactionManager))
             .from(sort13Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT13 SYNCSORT Ends here 
     */
    
    /*
     * SORT14 SYNCSORT starts here
     */
    
    private static final String SORT14_STEP = "sort14";
    @Bean
    @JobScope
    public SyncsortSort14InputReader syncsortSort14InputReader() {
    	return new SyncsortSort14InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort14Processor syncsortSort14Processor() {
    	return new SyncsortSort14Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort14OutputWriter syncsortSort14OutputWriter() {
    	return new SyncsortSort14OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort14SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort14SortInput",jobRepository).tasklet(syncsortSort14InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort14Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort14Process",jobRepository).tasklet(syncsortSort14Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort14SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort14SortOutput",jobRepository).tasklet(syncsortSort14OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT14_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort14SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort14Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort14SortOutput(jobRepository, transactionManager))
             .from(sort14Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT14 SYNCSORT Ends here 
     */
    
    /*
     * SORT15 SYNCSORT starts here
     */
    
    private static final String SORT15_STEP = "sort15";
    @Bean
    @JobScope
    public SyncsortSort15InputReader syncsortSort15InputReader() {
    	return new SyncsortSort15InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort15Processor syncsortSort15Processor() {
    	return new SyncsortSort15Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort15OutputWriter syncsortSort15OutputWriter() {
    	return new SyncsortSort15OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort15SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort15SortInput",jobRepository).tasklet(syncsortSort15InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort15Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort15Process",jobRepository).tasklet(syncsortSort15Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort15SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort15SortOutput",jobRepository).tasklet(syncsortSort15OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT15_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort15SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort15Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort15SortOutput(jobRepository, transactionManager))
             .from(sort15Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT15 SYNCSORT Ends here 
     */
    
    /*
     * SORT16 SYNCSORT starts here
     */
    
    private static final String SORT16_STEP = "sort16";
    @Bean
    @JobScope
    public SyncsortSort16InputReader syncsortSort16InputReader() {
    	return new SyncsortSort16InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort16Processor syncsortSort16Processor() {
    	return new SyncsortSort16Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort16OutputWriter syncsortSort16OutputWriter() {
    	return new SyncsortSort16OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort16SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort16SortInput",jobRepository).tasklet(syncsortSort16InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort16Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort16Process",jobRepository).tasklet(syncsortSort16Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort16SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort16SortOutput",jobRepository).tasklet(syncsortSort16OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT16_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort16SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort16Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort16SortOutput(jobRepository, transactionManager))
             .from(sort16Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT16 SYNCSORT Ends here 
     */
    
    /*
     * SORT18 SYNCSORT starts here
     */
    
    private static final String SORT18_STEP = "sort18";
    @Bean
    @JobScope
    public SyncsortSort18InputReader syncsortSort18InputReader() {
    	return new SyncsortSort18InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort18Processor syncsortSort18Processor() {
    	return new SyncsortSort18Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort18OutputWriter syncsortSort18OutputWriter() {
    	return new SyncsortSort18OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort18SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort18SortInput",jobRepository).tasklet(syncsortSort18InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort18Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort18Process",jobRepository).tasklet(syncsortSort18Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort18SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort18SortOutput",jobRepository).tasklet(syncsortSort18OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT18_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort18SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort18Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort18SortOutput(jobRepository, transactionManager))
             .from(sort18Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT18 SYNCSORT Ends here 
     */
    
    /*
     * SORT19 SYNCSORT starts here
     */
    
    private static final String SORT19_STEP = "sort19";
    @Bean
    @JobScope
    public SyncsortSort19InputReader syncsortSort19InputReader() {
    	return new SyncsortSort19InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort19Processor syncsortSort19Processor() {
    	return new SyncsortSort19Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort19OutputWriter syncsortSort19OutputWriter() {
    	return new SyncsortSort19OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort19SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort19SortInput",jobRepository).tasklet(syncsortSort19InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort19Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort19Process",jobRepository).tasklet(syncsortSort19Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort19SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort19SortOutput",jobRepository).tasklet(syncsortSort19OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT19_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort19SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort19Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort19SortOutput(jobRepository, transactionManager))
             .from(sort19Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT19 SYNCSORT Ends here 
     */
    
    /*
     * SORT20 SYNCSORT starts here
     */
    
    private static final String SORT20_STEP = "sort20";
    @Bean
    @JobScope
    public SyncsortSort20InputReader syncsortSort20InputReader() {
    	return new SyncsortSort20InputReader();
    }
    
    @Bean
    @JobScope
    public SyncsortSort20Processor syncsortSort20Processor() {
    	return new SyncsortSort20Processor();
    }
    
    @Bean
    @JobScope
    public SyncsortSort20OutputWriter syncsortSort20OutputWriter() {
    	return new SyncsortSort20OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSyncsortSort20SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSyncsortSort20SortInput",jobRepository).tasklet(syncsortSort20InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSyncsortSort20Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSyncsortSort20Process",jobRepository).tasklet(syncsortSort20Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSyncsortSort20SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSyncsortSort20SortOutput",jobRepository).tasklet(syncsortSort20OutputWriter(), transactionManager).build();  
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
 		    	  cfStepHandler.postStepExecution(SORT20_STEP, rc, SYNCSORT );
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
             .to(readSyncsortSort20SortInput(jobRepository, transactionManager))
             .next(processSyncsortSort20Sort(jobRepository, transactionManager))
             .next(writeSyncsortSort20SortOutput(jobRepository, transactionManager))
             .from(sort20Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT20 SYNCSORT Ends here 
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
