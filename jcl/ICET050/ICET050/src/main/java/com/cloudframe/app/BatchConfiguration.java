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
    
    private static final String JOBNAME = "ICET050";
    
    /* Driver Programs used in steps */  
   private static final String ICETOOL = "ICETOOL";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * MERGE - ICETOOL
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(mergeExecutor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * MERGE ICETOOL starts here
     */
    
    private static final String MERGE_STEP = "merge";
    @Bean
    @JobScope
    public Icet050MergeSort icet050MergeSort() {
    	return new Icet050MergeSort();
    }
    
    @Bean
    @JobScope
    protected Step Icet050MergeSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("Icet050MergeSort",jobRepository).tasklet(icet050MergeSort(), transactionManager).build();  
    }
    
    @Bean
    public Step mergeDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mergeDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MERGE_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MERGE_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MERGE_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(MERGE_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  MERGE FROM(INABC,INDEF) USING(CTL1)                                    
     *   SORT FIELDS=(1,4,CH,A)   
     *   OUTFIL FNAMES=OUTACE,
     *   INCLUDE=(1,1,CH,EQ,C'A',OR,1,1,CH,EQ,C'C',OR,1,1,CH,EQ,C'E')
     *   OUTFIL FNAMES=OUTBDF,
     *   INCLUDE=(1,1,CH,EQ,C'B',OR,1,1,CH,EQ,C'D',OR,1,1,CH,EQ,C'F')  
     */
    @Bean
    public Flow mergeExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mergeExecutor")
             .start(mergeDecider(jobRepository, transactionManager))
             .from(mergeDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(Icet050MergeSort(jobRepository, transactionManager))
             .from(mergeDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MERGE ICETOOL Ends here 
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
