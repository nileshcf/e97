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
    
    private static final String JOBNAME = "TRAN";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * SORT001 - SORT
     * SORT002 - SORT
     * SORT003 - SORT
     * SORT004 - SORT
     * SORT005 - SORT
     * SORT006 - SORT
     * SORT007 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(sort001Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort002Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort003Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort004Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort005Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort006Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort007Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * SORT001 SORT starts here
     */
    
    private static final String SORT001_STEP = "sort001";
    @Bean
    @JobScope
    public TranSort001Sort tranSort001Sort() {
    	return new TranSort001Sort();
    }
    
    @Bean
    @JobScope
    protected Step TranSort001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("TranSort001Sort",jobRepository).tasklet(tranSort001Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort001Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort001Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT001_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT001_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT001_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT001_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * 
     *   SORT FIELDS=COPY                                                              
     *   JOINKEYS FILE=F1,FIELDS=(50,11,A,61,11,A)                                     
     *   JOINKEYS FILE=F2,FIELDS=(20,11,A,33,11,A)                                     
     *   JOIN UNPAIRED,F1,F2                                                           
     *   REFORMAT FIELDS=(F1:001,102,F2:001,095)                                       
     *   OUTFIL FNAMES=SORTOUT,OMIT=(01,01,CH,EQ,C' ')                                 
     *   OUTREC IFTHEN=(WHEN=(001,001,CH,NE,C' ',AND,                                  
     *   103,001,CH,NE,C' '),                                                          
     *   BUILD=(020,66,TRAN=ETOA,                                                                
     *   173,25,                                                                       
     *   C'*******',                                                                   
     *   C'*******************',                                                       
     *   C'*******************')),                                                     
     *   IFTHEN=(WHEN=(001,001,CH,NE,C' ',AND,                                         
     *   103,001,CH,EQ,C' '),                                                          
     *   BUILD=(020,66,TRAN=ETOA,                                                                
     *   C'*************************',                                                 
     *   C'*******',                                                                   
     *   C'*******************',                                                       
     *   C'*******************')),                                                     
     *   IFTHEN=(WHEN=(NONE),                                                          
     *   BUILD=(136X))
     */
    @Bean
    public Flow sort001Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort001Executor")
             .start(sort001Decider(jobRepository, transactionManager))
             .from(sort001Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(TranSort001Sort(jobRepository, transactionManager))
             .from(sort001Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT001 SORT Ends here 
     */
    
    /*
     * SORT002 SORT starts here
     */
    
    private static final String SORT002_STEP = "sort002";
    @Bean
    @JobScope
    public TranSort002Sort tranSort002Sort() {
    	return new TranSort002Sort();
    }
    
    @Bean
    @JobScope
    protected Step TranSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("TranSort002Sort",jobRepository).tasklet(tranSort002Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort002Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort002Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT002_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT002_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT002_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT002_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY                                                      
     *   OUTREC IFTHEN=(WHEN=(1,1,CH,EQ,C'A'),                              
     *           BUILD=(1,50,TRAN=ETOA)
     */
    @Bean
    public Flow sort002Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort002Executor")
             .start(sort002Decider(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(TranSort002Sort(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT002 SORT Ends here 
     */
    
    /*
     * SORT003 SORT starts here
     */
    
    private static final String SORT003_STEP = "sort003";
    @Bean
    @JobScope
    public TranSort003Sort tranSort003Sort() {
    	return new TranSort003Sort();
    }
    
    @Bean
    @JobScope
    protected Step TranSort003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("TranSort003Sort",jobRepository).tasklet(tranSort003Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort003Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort003Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT003_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT003_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT003_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT003_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY                                                      
     *   OUTFIL FILES=01,IFTHEN=(WHEN=(1,1,CH,EQ,C'A'),                              
     *           BUILD=(1,50,TRAN=ETOA))
     */
    @Bean
    public Flow sort003Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort003Executor")
             .start(sort003Decider(jobRepository, transactionManager))
             .from(sort003Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(TranSort003Sort(jobRepository, transactionManager))
             .from(sort003Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT003 SORT Ends here 
     */
    
    /*
     * SORT004 SORT starts here
     */
    
    private static final String SORT004_STEP = "sort004";
    @Bean
    @JobScope
    public TranSort004Sort tranSort004Sort() {
    	return new TranSort004Sort();
    }
    
    @Bean
    @JobScope
    protected Step TranSort004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("TranSort004Sort",jobRepository).tasklet(tranSort004Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort004Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort004Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT004_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT004_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT004_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT004_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY 
     * OUTFIL FILES=01,
     *        IFTHEN=(WHEN=(1,1,CH,EQ,C'A'),                              
     *        BUILD=(1,20,21,15,TRAN=ETOA,36,15))
     */
    @Bean
    public Flow sort004Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort004Executor")
             .start(sort004Decider(jobRepository, transactionManager))
             .from(sort004Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(TranSort004Sort(jobRepository, transactionManager))
             .from(sort004Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT004 SORT Ends here 
     */
    
    /*
     * SORT005 SORT starts here
     */
    
    private static final String SORT005_STEP = "sort005";
    @Bean
    @JobScope
    public TranSort005Sort tranSort005Sort() {
    	return new TranSort005Sort();
    }
    
    @Bean
    @JobScope
    protected Step TranSort005Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("TranSort005Sort",jobRepository).tasklet(tranSort005Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort005Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort005Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT005_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT005_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT005_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT005_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY 
     * OUTFIL FILES=01,
     *        IFTHEN=(WHEN=(1,1,CH,EQ,X'C1'),                              
     *        BUILD=(1,20,21,15,TRAN=ETOA,36,15))
     */
    @Bean
    public Flow sort005Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort005Executor")
             .start(sort005Decider(jobRepository, transactionManager))
             .from(sort005Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(TranSort005Sort(jobRepository, transactionManager))
             .from(sort005Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT005 SORT Ends here 
     */
    
    /*
     * SORT006 SORT starts here
     */
    
    private static final String SORT006_STEP = "sort006";
    @Bean
    @JobScope
    public TranSort006Sort tranSort006Sort() {
    	return new TranSort006Sort();
    }
    
    @Bean
    @JobScope
    protected Step TranSort006Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("TranSort006Sort",jobRepository).tasklet(tranSort006Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort006Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort006Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT006_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT006_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT006_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT006_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY                                                      
     *   OUTREC IFTHEN=(WHEN=(1,1,CH,EQ,C'A'),                              
     *           BUILD=(1,50,TRAN=ETOA)),IFTHEN=(WHEN=(NONE),BUILD=(1,20,21,15,TRAN=ETOA,15X))
     */
    @Bean
    public Flow sort006Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort006Executor")
             .start(sort006Decider(jobRepository, transactionManager))
             .from(sort006Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(TranSort006Sort(jobRepository, transactionManager))
             .from(sort006Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT006 SORT Ends here 
     */
    
    /*
     * SORT007 SORT starts here
     */
    
    private static final String SORT007_STEP = "sort007";
    @Bean
    @JobScope
    public TranSort007Sort tranSort007Sort() {
    	return new TranSort007Sort();
    }
    
    @Bean
    @JobScope
    protected Step TranSort007Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("TranSort007Sort",jobRepository).tasklet(tranSort007Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort007Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort007Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT007_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT007_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT007_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT007_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY                                                      
     *   OUTREC IFTHEN=(WHEN=(1,1,CH,NE,X'C1'),                              
     *           BUILD=(1,20,21,15,TRAN=ETOA,C'***************')),IFTHEN=(WHEN=(NONE),BUILD=(1,20,21,15,TRAN=ETOA,15X))
     */
    @Bean
    public Flow sort007Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort007Executor")
             .start(sort007Decider(jobRepository, transactionManager))
             .from(sort007Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(TranSort007Sort(jobRepository, transactionManager))
             .from(sort007Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT007 SORT Ends here 
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
