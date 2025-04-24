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
    public McsfsortSort001InputReader mcsfsortSort001InputReader() {
    	return new McsfsortSort001InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort001Processor mcsfsortSort001Processor() {
    	return new McsfsortSort001Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort001OutputWriter mcsfsortSort001OutputWriter() {
    	return new McsfsortSort001OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort001SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort001SortInput",jobRepository).tasklet(mcsfsortSort001InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort001Process",jobRepository).tasklet(mcsfsortSort001Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort001SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort001SortOutput",jobRepository).tasklet(mcsfsortSort001OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort001SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort001Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort001SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort002InputReader mcsfsortSort002InputReader() {
    	return new McsfsortSort002InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort002Processor mcsfsortSort002Processor() {
    	return new McsfsortSort002Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort002OutputWriter mcsfsortSort002OutputWriter() {
    	return new McsfsortSort002OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort002SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort002SortInput",jobRepository).tasklet(mcsfsortSort002InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort002Process",jobRepository).tasklet(mcsfsortSort002Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort002SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort002SortOutput",jobRepository).tasklet(mcsfsortSort002OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort002SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort002Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort002SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort003InputReader mcsfsortSort003InputReader() {
    	return new McsfsortSort003InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort003Processor mcsfsortSort003Processor() {
    	return new McsfsortSort003Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort003OutputWriter mcsfsortSort003OutputWriter() {
    	return new McsfsortSort003OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort003SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort003SortInput",jobRepository).tasklet(mcsfsortSort003InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort003Process",jobRepository).tasklet(mcsfsortSort003Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort003SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort003SortOutput",jobRepository).tasklet(mcsfsortSort003OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort003SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort003Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort003SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort004InputReader mcsfsortSort004InputReader() {
    	return new McsfsortSort004InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort004Processor mcsfsortSort004Processor() {
    	return new McsfsortSort004Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort004OutputWriter mcsfsortSort004OutputWriter() {
    	return new McsfsortSort004OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort004SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort004SortInput",jobRepository).tasklet(mcsfsortSort004InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort004Process",jobRepository).tasklet(mcsfsortSort004Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort004SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort004SortOutput",jobRepository).tasklet(mcsfsortSort004OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort004SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort004Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort004SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort005InputReader mcsfsortSort005InputReader() {
    	return new McsfsortSort005InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort005Processor mcsfsortSort005Processor() {
    	return new McsfsortSort005Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort005OutputWriter mcsfsortSort005OutputWriter() {
    	return new McsfsortSort005OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort005SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort005SortInput",jobRepository).tasklet(mcsfsortSort005InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort005Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort005Process",jobRepository).tasklet(mcsfsortSort005Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort005SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort005SortOutput",jobRepository).tasklet(mcsfsortSort005OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort005SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort005Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort005SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort006InputReader mcsfsortSort006InputReader() {
    	return new McsfsortSort006InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort006Processor mcsfsortSort006Processor() {
    	return new McsfsortSort006Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort006OutputWriter mcsfsortSort006OutputWriter() {
    	return new McsfsortSort006OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort006SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort006SortInput",jobRepository).tasklet(mcsfsortSort006InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort006Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort006Process",jobRepository).tasklet(mcsfsortSort006Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort006SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort006SortOutput",jobRepository).tasklet(mcsfsortSort006OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort006SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort006Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort006SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort007InputReader mcsfsortSort007InputReader() {
    	return new McsfsortSort007InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort007Processor mcsfsortSort007Processor() {
    	return new McsfsortSort007Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort007OutputWriter mcsfsortSort007OutputWriter() {
    	return new McsfsortSort007OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort007SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort007SortInput",jobRepository).tasklet(mcsfsortSort007InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort007Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort007Process",jobRepository).tasklet(mcsfsortSort007Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort007SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort007SortOutput",jobRepository).tasklet(mcsfsortSort007OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort007SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort007Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort007SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort008InputReader mcsfsortSort008InputReader() {
    	return new McsfsortSort008InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort008JoinkeyFormatter mcsfsortSort008JoinkeyFormatter() {
    	return new McsfsortSort008JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McsfsortSort008Processor mcsfsortSort008Processor() {
    	return new McsfsortSort008Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort008OutputWriter mcsfsortSort008OutputWriter() {
    	return new McsfsortSort008OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort008SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort008SortInput",jobRepository).tasklet(mcsfsortSort008InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcsfsortSort008JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcsfsortSort008Joinkeys",jobRepository).tasklet(mcsfsortSort008JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort008Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort008Process",jobRepository).tasklet(mcsfsortSort008Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort008SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort008SortOutput",jobRepository).tasklet(mcsfsortSort008OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort008SortInput(jobRepository, transactionManager))
             .next(reformatMcsfsortSort008JoinKeys(jobRepository, transactionManager))
             .next(processMcsfsortSort008Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort008SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort009InputReader mcsfsortSort009InputReader() {
    	return new McsfsortSort009InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort009Processor mcsfsortSort009Processor() {
    	return new McsfsortSort009Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort009OutputWriter mcsfsortSort009OutputWriter() {
    	return new McsfsortSort009OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort009SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort009SortInput",jobRepository).tasklet(mcsfsortSort009InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort009Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort009Process",jobRepository).tasklet(mcsfsortSort009Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort009SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort009SortOutput",jobRepository).tasklet(mcsfsortSort009OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort009SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort009Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort009SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort010InputReader mcsfsortSort010InputReader() {
    	return new McsfsortSort010InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort010Processor mcsfsortSort010Processor() {
    	return new McsfsortSort010Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort010OutputWriter mcsfsortSort010OutputWriter() {
    	return new McsfsortSort010OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort010SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort010SortInput",jobRepository).tasklet(mcsfsortSort010InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort010Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort010Process",jobRepository).tasklet(mcsfsortSort010Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort010SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort010SortOutput",jobRepository).tasklet(mcsfsortSort010OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort010SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort010Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort010SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort011InputReader mcsfsortSort011InputReader() {
    	return new McsfsortSort011InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort011Processor mcsfsortSort011Processor() {
    	return new McsfsortSort011Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort011OutputWriter mcsfsortSort011OutputWriter() {
    	return new McsfsortSort011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort011SortInput",jobRepository).tasklet(mcsfsortSort011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort011Process",jobRepository).tasklet(mcsfsortSort011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort011SortOutput",jobRepository).tasklet(mcsfsortSort011OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort011SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort011Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort011SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort012InputReader mcsfsortSort012InputReader() {
    	return new McsfsortSort012InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort012Processor mcsfsortSort012Processor() {
    	return new McsfsortSort012Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort012OutputWriter mcsfsortSort012OutputWriter() {
    	return new McsfsortSort012OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort012SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort012SortInput",jobRepository).tasklet(mcsfsortSort012InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort012Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort012Process",jobRepository).tasklet(mcsfsortSort012Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort012SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort012SortOutput",jobRepository).tasklet(mcsfsortSort012OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort012SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort012Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort012SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort013InputReader mcsfsortSort013InputReader() {
    	return new McsfsortSort013InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort013Processor mcsfsortSort013Processor() {
    	return new McsfsortSort013Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort013OutputWriter mcsfsortSort013OutputWriter() {
    	return new McsfsortSort013OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort013SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort013SortInput",jobRepository).tasklet(mcsfsortSort013InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort013Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort013Process",jobRepository).tasklet(mcsfsortSort013Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort013SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort013SortOutput",jobRepository).tasklet(mcsfsortSort013OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort013SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort013Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort013SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort014InputReader mcsfsortSort014InputReader() {
    	return new McsfsortSort014InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort014Processor mcsfsortSort014Processor() {
    	return new McsfsortSort014Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort014OutputWriter mcsfsortSort014OutputWriter() {
    	return new McsfsortSort014OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort014SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort014SortInput",jobRepository).tasklet(mcsfsortSort014InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort014Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort014Process",jobRepository).tasklet(mcsfsortSort014Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort014SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort014SortOutput",jobRepository).tasklet(mcsfsortSort014OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort014SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort014Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort014SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort015InputReader mcsfsortSort015InputReader() {
    	return new McsfsortSort015InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort015JoinkeyFormatter mcsfsortSort015JoinkeyFormatter() {
    	return new McsfsortSort015JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McsfsortSort015Processor mcsfsortSort015Processor() {
    	return new McsfsortSort015Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort015OutputWriter mcsfsortSort015OutputWriter() {
    	return new McsfsortSort015OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort015SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort015SortInput",jobRepository).tasklet(mcsfsortSort015InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcsfsortSort015JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcsfsortSort015Joinkeys",jobRepository).tasklet(mcsfsortSort015JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort015Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort015Process",jobRepository).tasklet(mcsfsortSort015Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort015SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort015SortOutput",jobRepository).tasklet(mcsfsortSort015OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort015SortInput(jobRepository, transactionManager))
             .next(reformatMcsfsortSort015JoinKeys(jobRepository, transactionManager))
             .next(processMcsfsortSort015Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort015SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort016InputReader mcsfsortSort016InputReader() {
    	return new McsfsortSort016InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort016Processor mcsfsortSort016Processor() {
    	return new McsfsortSort016Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort016OutputWriter mcsfsortSort016OutputWriter() {
    	return new McsfsortSort016OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort016SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort016SortInput",jobRepository).tasklet(mcsfsortSort016InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort016Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort016Process",jobRepository).tasklet(mcsfsortSort016Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort016SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort016SortOutput",jobRepository).tasklet(mcsfsortSort016OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort016SortInput(jobRepository, transactionManager))
             .next(processMcsfsortSort016Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort016SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort017InputReader mcsfsortSort017InputReader() {
    	return new McsfsortSort017InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort017JoinkeyFormatter mcsfsortSort017JoinkeyFormatter() {
    	return new McsfsortSort017JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McsfsortSort017Processor mcsfsortSort017Processor() {
    	return new McsfsortSort017Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort017OutputWriter mcsfsortSort017OutputWriter() {
    	return new McsfsortSort017OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort017SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort017SortInput",jobRepository).tasklet(mcsfsortSort017InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcsfsortSort017JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcsfsortSort017Joinkeys",jobRepository).tasklet(mcsfsortSort017JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort017Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort017Process",jobRepository).tasklet(mcsfsortSort017Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort017SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort017SortOutput",jobRepository).tasklet(mcsfsortSort017OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort017SortInput(jobRepository, transactionManager))
             .next(reformatMcsfsortSort017JoinKeys(jobRepository, transactionManager))
             .next(processMcsfsortSort017Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort017SortOutput(jobRepository, transactionManager))
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
    public McsfsortSort018InputReader mcsfsortSort018InputReader() {
    	return new McsfsortSort018InputReader();
    }
    
    @Bean
    @JobScope
    public McsfsortSort018JoinkeyFormatter mcsfsortSort018JoinkeyFormatter() {
    	return new McsfsortSort018JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McsfsortSort018Processor mcsfsortSort018Processor() {
    	return new McsfsortSort018Processor();
    }
    
    @Bean
    @JobScope
    public McsfsortSort018OutputWriter mcsfsortSort018OutputWriter() {
    	return new McsfsortSort018OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcsfsortSort018SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcsfsortSort018SortInput",jobRepository).tasklet(mcsfsortSort018InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcsfsortSort018JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcsfsortSort018Joinkeys",jobRepository).tasklet(mcsfsortSort018JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcsfsortSort018Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcsfsortSort018Process",jobRepository).tasklet(mcsfsortSort018Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcsfsortSort018SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcsfsortSort018SortOutput",jobRepository).tasklet(mcsfsortSort018OutputWriter(), transactionManager).build();  
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
             .to(readMcsfsortSort018SortInput(jobRepository, transactionManager))
             .next(reformatMcsfsortSort018JoinKeys(jobRepository, transactionManager))
             .next(processMcsfsortSort018Sort(jobRepository, transactionManager))
             .next(writeMcsfsortSort018SortOutput(jobRepository, transactionManager))
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
