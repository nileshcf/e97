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
    
    private static final String JOBNAME = "LFIX531";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * S010_P0309 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(s010_p0309Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * S010_P0309 SORT starts here
     */
    
    private static final String S010_P0309_STEP = "s010_p0309";
    @Bean
    @JobScope
    public Lfix531S010_p0309InputReader lfix531S010_p0309InputReader() {
    	return new Lfix531S010_p0309InputReader();
    }
    
    @Bean
    @JobScope
    public Lfix531S010_p0309Processor lfix531S010_p0309Processor() {
    	return new Lfix531S010_p0309Processor();
    }
    
    @Bean
    @JobScope
    public Lfix531S010_p0309OutputWriter lfix531S010_p0309OutputWriter() {
    	return new Lfix531S010_p0309OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readLfix531S010_p0309SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readLfix531S010_p0309SortInput",jobRepository).tasklet(lfix531S010_p0309InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processLfix531S010_p0309Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortLfix531S010_p0309Process",jobRepository).tasklet(lfix531S010_p0309Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeLfix531S010_p0309SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeLfix531S010_p0309SortOutput",jobRepository).tasklet(lfix531S010_p0309OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step s010_p0309Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("s010_p0309Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(S010_P0309_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(S010_P0309_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(S010_P0309_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(S010_P0309_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  OUTFIL BUILD=(1:C'END 00000000 00000001 00000000 00000000 00000000 000X        
     *  00000 00000000',14X)                                                           
     *  SORT FIELDS=(1,3,A),FORMAT=BI                                                  
     *  OPTION ZDPRINT                                                                 
     */
    @Bean
    public Flow s010_p0309Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("s010_p0309Executor")
             .start(s010_p0309Decider(jobRepository, transactionManager))
             .from(s010_p0309Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readLfix531S010_p0309SortInput(jobRepository, transactionManager))
             .next(processLfix531S010_p0309Sort(jobRepository, transactionManager))
             .next(writeLfix531S010_p0309SortOutput(jobRepository, transactionManager))
             .from(s010_p0309Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * S010_P0309 SORT Ends here 
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
