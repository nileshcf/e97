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
    
    private static final String JOBNAME = "STEP500";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * STEP0500 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step0500Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * STEP0500 SORT starts here
     */
    
    private static final String STEP0500_STEP = "step0500";
    @Bean
    @JobScope
    public Step500Step0500InputReader step500Step0500InputReader() {
    	return new Step500Step0500InputReader();
    }
    
    @Bean
    @JobScope
    public Step500Step0500JoinkeyFormatter step500Step0500JoinkeyFormatter() {
    	return new Step500Step0500JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public Step500Step0500Processor step500Step0500Processor() {
    	return new Step500Step0500Processor();
    }
    
    @Bean
    @JobScope
    public Step500Step0500OutputWriter step500Step0500OutputWriter() {
    	return new Step500Step0500OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readStep500Step0500SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readStep500Step0500SortInput",jobRepository).tasklet(step500Step0500InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatStep500Step0500JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatStep500Step0500Joinkeys",jobRepository).tasklet(step500Step0500JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processStep500Step0500Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortStep500Step0500Process",jobRepository).tasklet(step500Step0500Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeStep500Step0500SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeStep500Step0500SortOutput",jobRepository).tasklet(step500Step0500OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step0500Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step0500Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP0500_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP0500_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP0500_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP0500_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  JOINKEYS F1=SORTJNF1,FIELDS(17,9,A)                                                                                                 
     *  JOINKEYS F2=SORTJNF2,FIELDS(2,9,A),SORTED,NOSEQCK                                                                                   
     *  JOIN UNPAIRED,F1                                                                                                                    
     *  REFORMAT FIELDS=(F1:1,39,F2:1,1,F1:41,9,?)                                                                                          
     *     OUTFIL FNAMES=BOTH,INCLUDE=(50,1,CH,EQ,C'B'),                                                                                    
     *                BUILD=(1,49,50:+0,TO=PD,LENGTH=3,                                                                                     
     *                            53:+0,TO=PD,LENGTH=3,                                                                                     
     *                            56:+0,TO=PD,LENGTH=3,80:X)                                                                                
     *     OUTFIL FNAMES=F1ONLY,INCLUDE=(50,1,CH,EQ,C'1'),                                                                                  
     *                BUILD=(1,39,C' ',41,9,                                                                                                
     *                       50:+0,TO=PD,LENGTH=3,                                                                                          
     *                       53:+0,TO=PD,LENGTH=3,                                                                                          
     *                       56:+0,TO=PD,LENGTH=3,80:X)                                                                                     
     *    SORT FIELDS=(1,8,PD,A,40,1,CH,A)                                                                                                  
     */
    @Bean
    public Flow step0500Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step0500Executor")
             .start(step0500Decider(jobRepository, transactionManager))
             .from(step0500Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readStep500Step0500SortInput(jobRepository, transactionManager))
             .next(reformatStep500Step0500JoinKeys(jobRepository, transactionManager))
             .next(processStep500Step0500Sort(jobRepository, transactionManager))
             .next(writeStep500Step0500SortOutput(jobRepository, transactionManager))
             .from(step0500Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP0500 SORT Ends here 
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
