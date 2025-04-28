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
    
    private static final String JOBNAME = "MCSFSORT";
    
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
     * SORT008 - SORT
     * SORT009 - SORT
     * SORT010 - SORT
     * SORT011 - SORT
     * SORT012 - SORT
     * SORT013 - SORT
     * SORT014 - SORT
     * SORT015 - SORT
     * SORT016 - SORT
     * SORT017 - SORT
     * SORT018 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
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

			// SORT Starts
			.next(sort008Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort009Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort010Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort011Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort012Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort013Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort014Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort015Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort016Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort017Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort018Executor(jobRepository, transactionManager)) /*  */
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
    public McsfsortSort001Sort mcsfsortSort001Sort() {
    	return new McsfsortSort001Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort001Sort",jobRepository).tasklet(mcsfsortSort001Sort(), transactionManager).build();  
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
     *   SORT FIELDS=(45,2,A,48,17,A),FORMAT=CH,EQUALS                                 
     *   INCLUDE COND=(20,1,CH,EQ,C'5',AND,21,1,CH,EQ,C'4')                            
     *   OUTFIL FNAMES=SORTOUT,VTOF,OUTREC=(5,32748)                                   
     */
    @Bean
    public Flow sort001Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort001Executor")
             .start(sort001Decider(jobRepository, transactionManager))
             .from(sort001Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort001Sort(jobRepository, transactionManager))
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
    public McsfsortSort002Sort mcsfsortSort002Sort() {
    	return new McsfsortSort002Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort002Sort",jobRepository).tasklet(mcsfsortSort002Sort(), transactionManager).build();  
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
     *   SORT FIELDS=(45,2,A,48,17,A),FORMAT=CH                                        
     *   INCLUDE COND=(20,1,CH,EQ,C'5',AND,21,1,CH,EQ,C'4')                            
     *   OUTFIL FNAMES=SORTOUT,VTOF,OUTREC=(5,30000)                                   
     */
    @Bean
    public Flow sort002Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort002Executor")
             .start(sort002Decider(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort002Sort(jobRepository, transactionManager))
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
    public McsfsortSort003Sort mcsfsortSort003Sort() {
    	return new McsfsortSort003Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort003Sort",jobRepository).tasklet(mcsfsortSort003Sort(), transactionManager).build();  
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
     *   SORT FIELDS=(1,1,A,50,3,A),                                                   
     *   FORMAT=BI,EQUALS                                                              
     */
    @Bean
    public Flow sort003Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort003Executor")
             .start(sort003Decider(jobRepository, transactionManager))
             .from(sort003Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort003Sort(jobRepository, transactionManager))
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
    public McsfsortSort004Sort mcsfsortSort004Sort() {
    	return new McsfsortSort004Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort004Sort",jobRepository).tasklet(mcsfsortSort004Sort(), transactionManager).build();  
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
     *   SORT FIELDS=COPY                                                              
     *   OUTFIL FILES=1,INCLUDE=(5,1,CH,NE,C'9',AND,5,1,CH,NE,C'Z',                    
     *   AND,5,1,CH,NE,C'C')                                                           
     *   OUTFIL FILES=2,INCLUDE=(5,1,CH,NE,C'9',AND,5,1,CH,NE,C'Z',                    
     *   AND,5,1,CH,NE,C'C')                                                           
     *   OUTFIL FILES=3,INCLUDE=(5,1,CH,EQ,C'9',OR,5,1,CH,EQ,C'Z')                     
     *   OUTFIL FILES=4,INCLUDE=(5,1,CH,EQ,C'9',AND,6,2,CH,EQ,C'2 ',                   
     *   AND,(73,4,CH,EQ,C'0210',OR,92,4,CH,EQ,C'0210'))                               
     *   OUTFIL FILES=5,INCLUDE=(5,1,CH,EQ,C'C')                                       
     *   END                                                                           
     */
    @Bean
    public Flow sort004Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort004Executor")
             .start(sort004Decider(jobRepository, transactionManager))
             .from(sort004Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort004Sort(jobRepository, transactionManager))
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
    public McsfsortSort005Sort mcsfsortSort005Sort() {
    	return new McsfsortSort005Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort005Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort005Sort",jobRepository).tasklet(mcsfsortSort005Sort(), transactionManager).build();  
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
     *   SORT FIELDS=(5,53,CH,A),EQUALS                                                
     *   SUM FIELDS=NONE                                                               
     *   OUTREC FIELDS=(1,4,5:58)                                                      
     */
    @Bean
    public Flow sort005Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort005Executor")
             .start(sort005Decider(jobRepository, transactionManager))
             .from(sort005Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort005Sort(jobRepository, transactionManager))
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
    public McsfsortSort006Sort mcsfsortSort006Sort() {
    	return new McsfsortSort006Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort006Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort006Sort",jobRepository).tasklet(mcsfsortSort006Sort(), transactionManager).build();  
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
     *   SORT FIELDS=(1,13,CH,A)                                                       
     *    OUTREC FIELDS=(1:14,900)                                                     
     */
    @Bean
    public Flow sort006Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort006Executor")
             .start(sort006Decider(jobRepository, transactionManager))
             .from(sort006Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort006Sort(jobRepository, transactionManager))
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
    public McsfsortSort007Sort mcsfsortSort007Sort() {
    	return new McsfsortSort007Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort007Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort007Sort",jobRepository).tasklet(mcsfsortSort007Sort(), transactionManager).build();  
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
     *   SORT FIELDS=(17,1,CH,A)                                                       
     *    INCLUDE COND=(16,1,BI,EQ,8)                                                  
     */
    @Bean
    public Flow sort007Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort007Executor")
             .start(sort007Decider(jobRepository, transactionManager))
             .from(sort007Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort007Sort(jobRepository, transactionManager))
             .from(sort007Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT007 SORT Ends here 
     */
    
    /*
     * SORT008 SORT starts here
     */
    
    private static final String SORT008_STEP = "sort008";
    @Bean
    @JobScope
    public McsfsortSort008Sort mcsfsortSort008Sort() {
    	return new McsfsortSort008Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort008Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort008Sort",jobRepository).tasklet(mcsfsortSort008Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort008Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort008Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT008_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT008_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT008_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT008_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   JOINKEYS FILE=F1,FIELDS=(06,6,A)                                              
     *    JOINKEYS FILE=F2,FIELDS=(40,6,A)                                             
     *    SORT FIELDS=(20,2,CH,A,99,3,CH,A,74,1,CH,A,116,3,ZD,A)                       
     *    REFORMAT FIELDS=(F2:1,120,F1:26,1,F2:122,58)                                 
     *    OUTFIL FNAMES=SORTOUT,OUTREC=(C'1740',1,19,C'190000',20,2,                   
     *    26,6,32,4,C'783',95,4,C'00000',46,6,52,12,                                   
     *    66,8,74,1,CHANGE=(2,C'0',C'B ',                                              
     *    C'1',C'R ',                                                                  
     *    C'2',C'R ',                                                                  
     *    C'3',C'R '),                                                                 
     *    NOMATCH=(C' '),                                                              
     *    22,4,C'00000',40,6,75,20,C'M',                                               
     *    20,2,CHANGE=(1,C'91',C'U',                                                   
     *    C'92',C'C'),                                                                 
     *    NOMATCH=(C' '),                                                              
     *    121,1,C' ',99,21,C'000',123,5,129,31)                                        
     */
    @Bean
    public Flow sort008Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort008Executor")
             .start(sort008Decider(jobRepository, transactionManager))
             .from(sort008Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort008Sort(jobRepository, transactionManager))
             .from(sort008Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT008 SORT Ends here 
     */
    
    /*
     * SORT009 SORT starts here
     */
    
    private static final String SORT009_STEP = "sort009";
    @Bean
    @JobScope
    public McsfsortSort009Sort mcsfsortSort009Sort() {
    	return new McsfsortSort009Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort009Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort009Sort",jobRepository).tasklet(mcsfsortSort009Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort009Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort009Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT009_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT009_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT009_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT009_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(20,8,CH,A,79,4,CH,A),EQUALS                                      
     *    SUM FIELDS=NONE                                                              
     */
    @Bean
    public Flow sort009Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort009Executor")
             .start(sort009Decider(jobRepository, transactionManager))
             .from(sort009Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort009Sort(jobRepository, transactionManager))
             .from(sort009Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT009 SORT Ends here 
     */
    
    /*
     * SORT010 SORT starts here
     */
    
    private static final String SORT010_STEP = "sort010";
    @Bean
    @JobScope
    public McsfsortSort010Sort mcsfsortSort010Sort() {
    	return new McsfsortSort010Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort010Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort010Sort",jobRepository).tasklet(mcsfsortSort010Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort010Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort010Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT010_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT010_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT010_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT010_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=COPY                                                              
     *    OUTFIL FILES=1,INCLUDE=(20,1,CH,EQ,C'I')                                     
     *    END                                                                          
     */
    @Bean
    public Flow sort010Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort010Executor")
             .start(sort010Decider(jobRepository, transactionManager))
             .from(sort010Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort010Sort(jobRepository, transactionManager))
             .from(sort010Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT010 SORT Ends here 
     */
    
    /*
     * SORT011 SORT starts here
     */
    
    private static final String SORT011_STEP = "sort011";
    @Bean
    @JobScope
    public McsfsortSort011Sort mcsfsortSort011Sort() {
    	return new McsfsortSort011Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort011Sort",jobRepository).tasklet(mcsfsortSort011Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort011Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort011Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT011_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT011_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT011_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT011_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(1,53,CH,A),EQUALS                                                
     *    SUM FIELDS=NONE                                                              
     *    OUTREC FIELDS=(54,2000)                                                      
     */
    @Bean
    public Flow sort011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort011Executor")
             .start(sort011Decider(jobRepository, transactionManager))
             .from(sort011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort011Sort(jobRepository, transactionManager))
             .from(sort011Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT011 SORT Ends here 
     */
    
    /*
     * SORT012 SORT starts here
     */
    
    private static final String SORT012_STEP = "sort012";
    @Bean
    @JobScope
    public McsfsortSort012Sort mcsfsortSort012Sort() {
    	return new McsfsortSort012Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort012Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort012Sort",jobRepository).tasklet(mcsfsortSort012Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort012Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort012Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT012_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT012_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT012_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT012_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=COPY                                                              
     *    OUTFIL FILES=1,INCLUDE=(20,1,CH,EQ,C'N')                                     
     *    OUTFIL FILES=2,INCLUDE=(20,2,CH,EQ,C'WA',                                    
     *    OR,20,2,CH,EQ,C'2A')                                                         
     *    OUTFIL FILES=3,INCLUDE=(20,1,CH,EQ,C'B',AND,                                 
     *    21,14,CH,GT,X'4040404040404040404040404040')                                 
     *    END                                                                          
     */
    @Bean
    public Flow sort012Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort012Executor")
             .start(sort012Decider(jobRepository, transactionManager))
             .from(sort012Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort012Sort(jobRepository, transactionManager))
             .from(sort012Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT012 SORT Ends here 
     */
    
    /*
     * SORT013 SORT starts here
     */
    
    private static final String SORT013_STEP = "sort013";
    @Bean
    @JobScope
    public McsfsortSort013Sort mcsfsortSort013Sort() {
    	return new McsfsortSort013Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort013Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort013Sort",jobRepository).tasklet(mcsfsortSort013Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort013Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort013Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT013_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT013_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT013_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT013_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(9,3,CH,A,12,6,CH,A)                                              
     *    INCLUDE COND=(81,4,CH,GT,C'1000')                                            
     */
    @Bean
    public Flow sort013Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort013Executor")
             .start(sort013Decider(jobRepository, transactionManager))
             .from(sort013Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort013Sort(jobRepository, transactionManager))
             .from(sort013Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT013 SORT Ends here 
     */
    
    /*
     * SORT014 SORT starts here
     */
    
    private static final String SORT014_STEP = "sort014";
    @Bean
    @JobScope
    public McsfsortSort014Sort mcsfsortSort014Sort() {
    	return new McsfsortSort014Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort014Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort014Sort",jobRepository).tasklet(mcsfsortSort014Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort014Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort014Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT014_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT014_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT014_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT014_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(17,1,CH,A)                                                       
     *    INCLUDE COND=(16,1,BI,EQ,C'8')                                               
     */
    @Bean
    public Flow sort014Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort014Executor")
             .start(sort014Decider(jobRepository, transactionManager))
             .from(sort014Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort014Sort(jobRepository, transactionManager))
             .from(sort014Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT014 SORT Ends here 
     */
    
    /*
     * SORT015 SORT starts here
     */
    
    private static final String SORT015_STEP = "sort015";
    @Bean
    @JobScope
    public McsfsortSort015Sort mcsfsortSort015Sort() {
    	return new McsfsortSort015Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort015Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort015Sort",jobRepository).tasklet(mcsfsortSort015Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort015Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort015Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT015_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT015_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT015_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT015_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   JOINKEYS FILE=F1,FIELDS(1,100,A)                                      00010000
     *   JOINKEYS FILE=F2,FIELDS(1,100,A)                                      00020000
     *   JOIN UNPAIRED,F1,F2,ONLY                                              00030000
     *   REFORMAT FIELDS=(F1:1,100,F2:1,100)                                   00040000
     *   SORT FIELDS=COPY                                                      00050000
     */
    @Bean
    public Flow sort015Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort015Executor")
             .start(sort015Decider(jobRepository, transactionManager))
             .from(sort015Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort015Sort(jobRepository, transactionManager))
             .from(sort015Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT015 SORT Ends here 
     */
    
    /*
     * SORT016 SORT starts here
     */
    
    private static final String SORT016_STEP = "sort016";
    @Bean
    @JobScope
    public McsfsortSort016Sort mcsfsortSort016Sort() {
    	return new McsfsortSort016Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort016Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort016Sort",jobRepository).tasklet(mcsfsortSort016Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort016Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort016Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT016_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT016_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT016_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT016_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   JOINKEYS F1=FILE01,FIELDS=(1,38,A)                                            
     *   JOINKEYS F2=FILE02,FIELDS=(1,38,A)                                            
     *   JOIN UNPAIRED,F1,F2                                                           
     *   REFORMAT FIELDS=(?,F1:1,38,F2:1,38)                                           
     *   OPTION COPY                                                                   
     *   OUTFIL FNAMES=SORTMTCH,INCLUDE=(1,1,CH,EQ,C'B'),                              
     *                                  BUILD=(1:2,38,39:C'0591        ')              
     *   OUTFIL FNAMES=SORTUN01,INCLUDE=(1,1,CH,EQ,C'1'),                              
     *                                  BUILD=(1:2,38,39:C'05          ')              
     *   OUTFIL FNAMES=SORTUN02,INCLUDE=(1,1,CH,EQ,C'2'),                              
     *                                  BUILD=(1:40,38,39:C'  91        ')             
     */
    @Bean
    public Flow sort016Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort016Executor")
             .start(sort016Decider(jobRepository, transactionManager))
             .from(sort016Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort016Sort(jobRepository, transactionManager))
             .from(sort016Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT016 SORT Ends here 
     */
    
    /*
     * SORT017 SORT starts here
     */
    
    private static final String SORT017_STEP = "sort017";
    @Bean
    @JobScope
    public McsfsortSort017Sort mcsfsortSort017Sort() {
    	return new McsfsortSort017Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort017Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort017Sort",jobRepository).tasklet(mcsfsortSort017Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort017Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort017Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT017_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT017_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT017_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT017_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   JOINKEYS FILE=F1,FIELDS(1,100,A)                                              
     *   JOINKEYS FILE=F2,FIELDS(1,100,A)                                              
     *   JOIN UNPAIRED,F1,ONLY                                                         
     *   REFORMAT FIELDS=(F1:1,100,F2:1,100)                                           
     *   SORT FIELDS=COPY                                                              
     */
    @Bean
    public Flow sort017Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort017Executor")
             .start(sort017Decider(jobRepository, transactionManager))
             .from(sort017Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort017Sort(jobRepository, transactionManager))
             .from(sort017Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT017 SORT Ends here 
     */
    
    /*
     * SORT018 SORT starts here
     */
    
    private static final String SORT018_STEP = "sort018";
    @Bean
    @JobScope
    public McsfsortSort018Sort mcsfsortSort018Sort() {
    	return new McsfsortSort018Sort();
    }
    
    @Bean
    @JobScope
    protected Step McsfsortSort018Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("McsfsortSort018Sort",jobRepository).tasklet(mcsfsortSort018Sort(), transactionManager).build();  
    }
    
    @Bean
    public Step sort018Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort018Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT018_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT018_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT018_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT018_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   JOINKEYS FILE=F1,FIELDS(1,100,A)                                              
     *   JOINKEYS FILE=F2,FIELDS(1,100,A)                                              
     *   JOIN UNPAIRED,F2,ONLY                                                         
     *   REFORMAT FIELDS=(F1:1,100,F2:1,100)                                           
     *   SORT FIELDS=COPY                                                              
     */
    @Bean
    public Flow sort018Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort018Executor")
             .start(sort018Decider(jobRepository, transactionManager))
             .from(sort018Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(McsfsortSort018Sort(jobRepository, transactionManager))
             .from(sort018Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT018 SORT Ends here 
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
