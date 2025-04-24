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
    
    private static final String JOBNAME = "SORT241";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * SORT241A_S0011 - SORT
     * SORT241B_S0011 - SORT
     * SORT241C_S0011 - SORT
     * SORT241D_S0011 - SORT
     * SORT241E_S0011 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(sort241a_s0011Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort241b_s0011Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort241c_s0011Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort241d_s0011Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort241e_s0011Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * SORT241A_S0011 SORT starts here
     */
    
    private static final String SORT241A_S0011_STEP = "sort241a_s0011";
    @Bean
    @JobScope
    public Sort241Sort241a_s0011InputReader sort241Sort241a_s0011InputReader() {
    	return new Sort241Sort241a_s0011InputReader();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241a_s0011Processor sort241Sort241a_s0011Processor() {
    	return new Sort241Sort241a_s0011Processor();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241a_s0011OutputWriter sort241Sort241a_s0011OutputWriter() {
    	return new Sort241Sort241a_s0011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSort241Sort241a_s0011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSort241Sort241a_s0011SortInput",jobRepository).tasklet(sort241Sort241a_s0011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSort241Sort241a_s0011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSort241Sort241a_s0011Process",jobRepository).tasklet(sort241Sort241a_s0011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSort241Sort241a_s0011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSort241Sort241a_s0011SortOutput",jobRepository).tasklet(sort241Sort241a_s0011OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort241a_s0011Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort241a_s0011Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT241A_S0011_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT241A_S0011_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT241A_S0011_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT241A_S0011_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *     SORT FIELDS=COPY                                                    00010000
     */
    @Bean
    public Flow sort241a_s0011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort241a_s0011Executor")
             .start(sort241a_s0011Decider(jobRepository, transactionManager))
             .from(sort241a_s0011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSort241Sort241a_s0011SortInput(jobRepository, transactionManager))
             .next(processSort241Sort241a_s0011Sort(jobRepository, transactionManager))
             .next(writeSort241Sort241a_s0011SortOutput(jobRepository, transactionManager))
             .from(sort241a_s0011Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT241A_S0011 SORT Ends here 
     */
    
    /*
     * SORT241B_S0011 SORT starts here
     */
    
    private static final String SORT241B_S0011_STEP = "sort241b_s0011";
    @Bean
    @JobScope
    public Sort241Sort241b_s0011InputReader sort241Sort241b_s0011InputReader() {
    	return new Sort241Sort241b_s0011InputReader();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241b_s0011Processor sort241Sort241b_s0011Processor() {
    	return new Sort241Sort241b_s0011Processor();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241b_s0011OutputWriter sort241Sort241b_s0011OutputWriter() {
    	return new Sort241Sort241b_s0011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSort241Sort241b_s0011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSort241Sort241b_s0011SortInput",jobRepository).tasklet(sort241Sort241b_s0011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSort241Sort241b_s0011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSort241Sort241b_s0011Process",jobRepository).tasklet(sort241Sort241b_s0011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSort241Sort241b_s0011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSort241Sort241b_s0011SortOutput",jobRepository).tasklet(sort241Sort241b_s0011OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort241b_s0011Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort241b_s0011Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT241B_S0011_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT241B_S0011_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT241B_S0011_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT241B_S0011_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *     SORT FIELDS=COPY                                                    00010000
     */
    @Bean
    public Flow sort241b_s0011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort241b_s0011Executor")
             .start(sort241b_s0011Decider(jobRepository, transactionManager))
             .from(sort241b_s0011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSort241Sort241b_s0011SortInput(jobRepository, transactionManager))
             .next(processSort241Sort241b_s0011Sort(jobRepository, transactionManager))
             .next(writeSort241Sort241b_s0011SortOutput(jobRepository, transactionManager))
             .from(sort241b_s0011Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT241B_S0011 SORT Ends here 
     */
    
    /*
     * SORT241C_S0011 SORT starts here
     */
    
    private static final String SORT241C_S0011_STEP = "sort241c_s0011";
    @Bean
    @JobScope
    public Sort241Sort241c_s0011InputReader sort241Sort241c_s0011InputReader() {
    	return new Sort241Sort241c_s0011InputReader();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241c_s0011Processor sort241Sort241c_s0011Processor() {
    	return new Sort241Sort241c_s0011Processor();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241c_s0011OutputWriter sort241Sort241c_s0011OutputWriter() {
    	return new Sort241Sort241c_s0011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSort241Sort241c_s0011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSort241Sort241c_s0011SortInput",jobRepository).tasklet(sort241Sort241c_s0011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSort241Sort241c_s0011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSort241Sort241c_s0011Process",jobRepository).tasklet(sort241Sort241c_s0011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSort241Sort241c_s0011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSort241Sort241c_s0011SortOutput",jobRepository).tasklet(sort241Sort241c_s0011OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort241c_s0011Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort241c_s0011Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT241C_S0011_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT241C_S0011_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT241C_S0011_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT241C_S0011_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *     SORT FIELDS=COPY                                                    00010000
     */
    @Bean
    public Flow sort241c_s0011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort241c_s0011Executor")
             .start(sort241c_s0011Decider(jobRepository, transactionManager))
             .from(sort241c_s0011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSort241Sort241c_s0011SortInput(jobRepository, transactionManager))
             .next(processSort241Sort241c_s0011Sort(jobRepository, transactionManager))
             .next(writeSort241Sort241c_s0011SortOutput(jobRepository, transactionManager))
             .from(sort241c_s0011Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT241C_S0011 SORT Ends here 
     */
    
    /*
     * SORT241D_S0011 SORT starts here
     */
    
    private static final String SORT241D_S0011_STEP = "sort241d_s0011";
    @Bean
    @JobScope
    public Sort241Sort241d_s0011InputReader sort241Sort241d_s0011InputReader() {
    	return new Sort241Sort241d_s0011InputReader();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241d_s0011Processor sort241Sort241d_s0011Processor() {
    	return new Sort241Sort241d_s0011Processor();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241d_s0011OutputWriter sort241Sort241d_s0011OutputWriter() {
    	return new Sort241Sort241d_s0011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSort241Sort241d_s0011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSort241Sort241d_s0011SortInput",jobRepository).tasklet(sort241Sort241d_s0011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSort241Sort241d_s0011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSort241Sort241d_s0011Process",jobRepository).tasklet(sort241Sort241d_s0011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSort241Sort241d_s0011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSort241Sort241d_s0011SortOutput",jobRepository).tasklet(sort241Sort241d_s0011OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort241d_s0011Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort241d_s0011Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT241D_S0011_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT241D_S0011_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT241D_S0011_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT241D_S0011_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *     SORT FIELDS=COPY                                                    00010000
     */
    @Bean
    public Flow sort241d_s0011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort241d_s0011Executor")
             .start(sort241d_s0011Decider(jobRepository, transactionManager))
             .from(sort241d_s0011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSort241Sort241d_s0011SortInput(jobRepository, transactionManager))
             .next(processSort241Sort241d_s0011Sort(jobRepository, transactionManager))
             .next(writeSort241Sort241d_s0011SortOutput(jobRepository, transactionManager))
             .from(sort241d_s0011Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT241D_S0011 SORT Ends here 
     */
    
    /*
     * SORT241E_S0011 SORT starts here
     */
    
    private static final String SORT241E_S0011_STEP = "sort241e_s0011";
    @Bean
    @JobScope
    public Sort241Sort241e_s0011InputReader sort241Sort241e_s0011InputReader() {
    	return new Sort241Sort241e_s0011InputReader();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241e_s0011Processor sort241Sort241e_s0011Processor() {
    	return new Sort241Sort241e_s0011Processor();
    }
    
    @Bean
    @JobScope
    public Sort241Sort241e_s0011OutputWriter sort241Sort241e_s0011OutputWriter() {
    	return new Sort241Sort241e_s0011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSort241Sort241e_s0011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSort241Sort241e_s0011SortInput",jobRepository).tasklet(sort241Sort241e_s0011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSort241Sort241e_s0011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSort241Sort241e_s0011Process",jobRepository).tasklet(sort241Sort241e_s0011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSort241Sort241e_s0011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSort241Sort241e_s0011SortOutput",jobRepository).tasklet(sort241Sort241e_s0011OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort241e_s0011Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort241e_s0011Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT241E_S0011_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT241E_S0011_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT241E_S0011_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT241E_S0011_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *     SORT FIELDS=COPY                                                    00010000
     */
    @Bean
    public Flow sort241e_s0011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort241e_s0011Executor")
             .start(sort241e_s0011Decider(jobRepository, transactionManager))
             .from(sort241e_s0011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSort241Sort241e_s0011SortInput(jobRepository, transactionManager))
             .next(processSort241Sort241e_s0011Sort(jobRepository, transactionManager))
             .next(writeSort241Sort241e_s0011SortOutput(jobRepository, transactionManager))
             .from(sort241e_s0011Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT241E_S0011 SORT Ends here 
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
