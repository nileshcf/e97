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
    public TranSort001InputReader tranSort001InputReader() {
    	return new TranSort001InputReader();
    }
    
    @Bean
    @JobScope
    public TranSort001JoinkeyFormatter tranSort001JoinkeyFormatter() {
    	return new TranSort001JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public TranSort001Processor tranSort001Processor() {
    	return new TranSort001Processor();
    }
    
    @Bean
    @JobScope
    public TranSort001OutputWriter tranSort001OutputWriter() {
    	return new TranSort001OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readTranSort001SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readTranSort001SortInput",jobRepository).tasklet(tranSort001InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatTranSort001JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatTranSort001Joinkeys",jobRepository).tasklet(tranSort001JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processTranSort001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortTranSort001Process",jobRepository).tasklet(tranSort001Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeTranSort001SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeTranSort001SortOutput",jobRepository).tasklet(tranSort001OutputWriter(), transactionManager).build();  
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
             .to(readTranSort001SortInput(jobRepository, transactionManager))
             .next(reformatTranSort001JoinKeys(jobRepository, transactionManager))
             .next(processTranSort001Sort(jobRepository, transactionManager))
             .next(writeTranSort001SortOutput(jobRepository, transactionManager))
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
    public TranSort002InputReader tranSort002InputReader() {
    	return new TranSort002InputReader();
    }
    
    @Bean
    @JobScope
    public TranSort002Processor tranSort002Processor() {
    	return new TranSort002Processor();
    }
    
    @Bean
    @JobScope
    public TranSort002OutputWriter tranSort002OutputWriter() {
    	return new TranSort002OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readTranSort002SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readTranSort002SortInput",jobRepository).tasklet(tranSort002InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processTranSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortTranSort002Process",jobRepository).tasklet(tranSort002Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeTranSort002SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeTranSort002SortOutput",jobRepository).tasklet(tranSort002OutputWriter(), transactionManager).build();  
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
             .to(readTranSort002SortInput(jobRepository, transactionManager))
             .next(processTranSort002Sort(jobRepository, transactionManager))
             .next(writeTranSort002SortOutput(jobRepository, transactionManager))
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
    public TranSort003InputReader tranSort003InputReader() {
    	return new TranSort003InputReader();
    }
    
    @Bean
    @JobScope
    public TranSort003Processor tranSort003Processor() {
    	return new TranSort003Processor();
    }
    
    @Bean
    @JobScope
    public TranSort003OutputWriter tranSort003OutputWriter() {
    	return new TranSort003OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readTranSort003SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readTranSort003SortInput",jobRepository).tasklet(tranSort003InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processTranSort003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortTranSort003Process",jobRepository).tasklet(tranSort003Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeTranSort003SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeTranSort003SortOutput",jobRepository).tasklet(tranSort003OutputWriter(), transactionManager).build();  
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
             .to(readTranSort003SortInput(jobRepository, transactionManager))
             .next(processTranSort003Sort(jobRepository, transactionManager))
             .next(writeTranSort003SortOutput(jobRepository, transactionManager))
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
    public TranSort004InputReader tranSort004InputReader() {
    	return new TranSort004InputReader();
    }
    
    @Bean
    @JobScope
    public TranSort004Processor tranSort004Processor() {
    	return new TranSort004Processor();
    }
    
    @Bean
    @JobScope
    public TranSort004OutputWriter tranSort004OutputWriter() {
    	return new TranSort004OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readTranSort004SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readTranSort004SortInput",jobRepository).tasklet(tranSort004InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processTranSort004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortTranSort004Process",jobRepository).tasklet(tranSort004Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeTranSort004SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeTranSort004SortOutput",jobRepository).tasklet(tranSort004OutputWriter(), transactionManager).build();  
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
             .to(readTranSort004SortInput(jobRepository, transactionManager))
             .next(processTranSort004Sort(jobRepository, transactionManager))
             .next(writeTranSort004SortOutput(jobRepository, transactionManager))
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
    public TranSort005InputReader tranSort005InputReader() {
    	return new TranSort005InputReader();
    }
    
    @Bean
    @JobScope
    public TranSort005Processor tranSort005Processor() {
    	return new TranSort005Processor();
    }
    
    @Bean
    @JobScope
    public TranSort005OutputWriter tranSort005OutputWriter() {
    	return new TranSort005OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readTranSort005SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readTranSort005SortInput",jobRepository).tasklet(tranSort005InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processTranSort005Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortTranSort005Process",jobRepository).tasklet(tranSort005Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeTranSort005SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeTranSort005SortOutput",jobRepository).tasklet(tranSort005OutputWriter(), transactionManager).build();  
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
             .to(readTranSort005SortInput(jobRepository, transactionManager))
             .next(processTranSort005Sort(jobRepository, transactionManager))
             .next(writeTranSort005SortOutput(jobRepository, transactionManager))
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
    public TranSort006InputReader tranSort006InputReader() {
    	return new TranSort006InputReader();
    }
    
    @Bean
    @JobScope
    public TranSort006Processor tranSort006Processor() {
    	return new TranSort006Processor();
    }
    
    @Bean
    @JobScope
    public TranSort006OutputWriter tranSort006OutputWriter() {
    	return new TranSort006OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readTranSort006SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readTranSort006SortInput",jobRepository).tasklet(tranSort006InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processTranSort006Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortTranSort006Process",jobRepository).tasklet(tranSort006Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeTranSort006SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeTranSort006SortOutput",jobRepository).tasklet(tranSort006OutputWriter(), transactionManager).build();  
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
             .to(readTranSort006SortInput(jobRepository, transactionManager))
             .next(processTranSort006Sort(jobRepository, transactionManager))
             .next(writeTranSort006SortOutput(jobRepository, transactionManager))
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
    public TranSort007InputReader tranSort007InputReader() {
    	return new TranSort007InputReader();
    }
    
    @Bean
    @JobScope
    public TranSort007Processor tranSort007Processor() {
    	return new TranSort007Processor();
    }
    
    @Bean
    @JobScope
    public TranSort007OutputWriter tranSort007OutputWriter() {
    	return new TranSort007OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readTranSort007SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readTranSort007SortInput",jobRepository).tasklet(tranSort007InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processTranSort007Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortTranSort007Process",jobRepository).tasklet(tranSort007Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeTranSort007SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeTranSort007SortOutput",jobRepository).tasklet(tranSort007OutputWriter(), transactionManager).build();  
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
             .to(readTranSort007SortInput(jobRepository, transactionManager))
             .next(processTranSort007Sort(jobRepository, transactionManager))
             .next(writeTranSort007SortOutput(jobRepository, transactionManager))
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
