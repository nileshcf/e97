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
    
    private static final String JOBNAME = "SORT038";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * STEP010 - SORT
     * STEP020 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step010Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(step020Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * STEP010 SORT starts here
     */
    
    private static final String STEP010_STEP = "step010";
    @Bean
    @JobScope
    public Sort038Step010InputReader sort038Step010InputReader() {
    	return new Sort038Step010InputReader();
    }
    
    @Bean
    @JobScope
    public Sort038Step010Processor sort038Step010Processor() {
    	return new Sort038Step010Processor();
    }
    
    @Bean
    @JobScope
    public Sort038Step010OutputWriter sort038Step010OutputWriter() {
    	return new Sort038Step010OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSort038Step010SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSort038Step010SortInput",jobRepository).tasklet(sort038Step010InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSort038Step010Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSort038Step010Process",jobRepository).tasklet(sort038Step010Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSort038Step010SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSort038Step010SortOutput",jobRepository).tasklet(sort038Step010OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step010Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step010Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP010_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP010_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP010_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP010_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   OPTION COPY
     *     INREC  IFTHEN=(WHEN=INIT,
     *              OVERLAY=(81:1,9,C'0',10,1,C'0',11,1,C'0',12,1,C'0',13,1,
     *                              C'0',14,1,C'0',15,1,C'0',16,1,C'0',17,1)),
     *            IFTHEN=(WHEN=INIT,FINDREP=(STARTPOS=90,
     *              INOUT=(C'0A',C'10',C'0B',C'11',C'0C',C'12',
     *                     C'0D',C'13',C'0E',C'14',C'0F',C'15'))),
     *            IFTHEN=(WHEN=INIT,
     *              BUILD=(81,9,
     *                    ((090,2,ZD,MUL,+201326592),ADD,
     *                     (092,2,ZD,MUL,+16777516),ADD,
     *                     (094,2,ZD,MUL,+1048576),ADD,
     *                     (096,2,ZD,MUL,+65536),ADD,
     *                     (098,2,ZD,MUL,+4096),ADD,
     *                     (100,2,ZD,MUL,+256),ADD,
     *                     (102,2,ZD,MUL,+16),ADD,
     *                     (104,2,ZD)),TO=ZDF,LENGTH=8))
     */
    @Bean
    public Flow step010Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step010Executor")
             .start(step010Decider(jobRepository, transactionManager))
             .from(step010Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSort038Step010SortInput(jobRepository, transactionManager))
             .next(processSort038Step010Sort(jobRepository, transactionManager))
             .next(writeSort038Step010SortOutput(jobRepository, transactionManager))
             .from(step010Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP010 SORT Ends here 
     */
    
    /*
     * STEP020 SORT starts here
     */
    
    private static final String STEP020_STEP = "step020";
    @Bean
    @JobScope
    public Sort038Step020InputReader sort038Step020InputReader() {
    	return new Sort038Step020InputReader();
    }
    
    @Bean
    @JobScope
    public Sort038Step020Processor sort038Step020Processor() {
    	return new Sort038Step020Processor();
    }
    
    @Bean
    @JobScope
    public Sort038Step020OutputWriter sort038Step020OutputWriter() {
    	return new Sort038Step020OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readSort038Step020SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readSort038Step020SortInput",jobRepository).tasklet(sort038Step020InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processSort038Step020Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortSort038Step020Process",jobRepository).tasklet(sort038Step020Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeSort038Step020SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeSort038Step020SortOutput",jobRepository).tasklet(sort038Step020OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step020Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step020Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP020_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP020_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP020_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP020_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   OPTION COPY
     *     INREC  IFTHEN=(WHEN=INIT,
     *              OVERLAY=(81:1,9,C'0',10,1,C'0',11,1,C'0',12,1,C'0',13,1,
     *                              C'0',14,1,C'0',15,1,C'0',16,1,C'0',17,1)),
     *            IFTHEN=(WHEN=INIT,FINDREP=(STARTPOS=90,
     *              INOUT=(C'0A',C'10',C'0B',C'11',C'0C',C'12',
     *                     C'0D',C'13',C'0E',C'14',C'0F',C'15'))),
     *            IFTHEN=(WHEN=INIT,
     *              BUILD=(81,9,
     *                    ((090,2,ZD,MUL,+201326592),ADD,
     *                     (092,2,ZD,MUL,+16777516),ADD,
     *                     (094,2,ZD,MUL,+1048576),ADD,
     *                     (096,2,ZD,MUL,+65536),ADD,
     *                     (098,2,ZD,MUL,+4096),ADD,
     *                     (100,2,ZD,MUL,+256),ADD,
     *                     (102,2,ZD,MUL,+16),ADD,
     *                     (104,2,ZD)),TO=ZDF,LENGTH=8))
     */
    @Bean
    public Flow step020Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step020Executor")
             .start(step020Decider(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readSort038Step020SortInput(jobRepository, transactionManager))
             .next(processSort038Step020Sort(jobRepository, transactionManager))
             .next(writeSort038Step020SortOutput(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP020 SORT Ends here 
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
