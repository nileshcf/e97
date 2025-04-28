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
    
    private static final String JOBNAME = "SORTZDCOMP1";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * MRGZPMTS_SORT - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(mrgzpmts_sortExecutor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * MRGZPMTS_SORT SORT starts here
     */
    
    private static final String MRGZPMTS_SORT_STEP = "mrgzpmts_sort";
    @Bean
    @JobScope
    public Sortzdcomp1Mrgzpmts_sortSort sortzdcomp1Mrgzpmts_sortSort() {
    	return new Sortzdcomp1Mrgzpmts_sortSort();
    }
    
    @Bean
    @JobScope
    protected Step Sortzdcomp1Mrgzpmts_sortSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Sortzdcomp1Mrgzpmts_sortSort",jobRepository).tasklet(sortzdcomp1Mrgzpmts_sortSort(), transactionManager).build();  
    }
    
    @Bean
    public Step mrgzpmts_sortDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mrgzpmts_sortDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MRGZPMTS_SORT_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MRGZPMTS_SORT_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MRGZPMTS_SORT_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(MRGZPMTS_SORT_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(31,10,ZD,A,1,8,ZD,A,26,1,CH,A,86,10,CH,A,96,8,CH,A)      
     *   RECORD TYPE=F,LENGTH=113                                              
     *   DEBUG ABEND                  --> IF SORT FAILS WILL ABEND/STOP JOB    
     *   END                                                                   
     *                                                                         
     */
    @Bean
    public Flow mrgzpmts_sortExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mrgzpmts_sortExecutor")
             .start(mrgzpmts_sortDecider(jobRepository, transactionManager))
             .from(mrgzpmts_sortDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Sortzdcomp1Mrgzpmts_sortSort(jobRepository, transactionManager))
             .from(mrgzpmts_sortDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MRGZPMTS_SORT SORT Ends here 
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
