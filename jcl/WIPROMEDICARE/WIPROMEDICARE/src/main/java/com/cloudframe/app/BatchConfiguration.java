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
    
    private static final String JOBNAME = "WIPROMEDICARE";
    
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
    public WipromedicareSort001InputReader wipromedicareSort001InputReader() {
    	return new WipromedicareSort001InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort001Processor wipromedicareSort001Processor() {
    	return new WipromedicareSort001Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort001OutputWriter wipromedicareSort001OutputWriter() {
    	return new WipromedicareSort001OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort001SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort001SortInput",jobRepository).tasklet(wipromedicareSort001InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort001Process",jobRepository).tasklet(wipromedicareSort001Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort001SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort001SortOutput",jobRepository).tasklet(wipromedicareSort001OutputWriter(), transactionManager).build();  
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
     * * FORCE HEADER AND DETAIL (RECORD TYPES 1 AND 3) TO TOP OF FILE                 
     *  SORT FIELDS=(1,1,AQ,A)                                                         
     *  ALTSEQ CODE=(F100,F301)                                                        
     */
    @Bean
    public Flow sort001Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort001Executor")
             .start(sort001Decider(jobRepository, transactionManager))
             .from(sort001Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort001SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort001Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort001SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort002InputReader wipromedicareSort002InputReader() {
    	return new WipromedicareSort002InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort002Processor wipromedicareSort002Processor() {
    	return new WipromedicareSort002Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort002OutputWriter wipromedicareSort002OutputWriter() {
    	return new WipromedicareSort002OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort002SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort002SortInput",jobRepository).tasklet(wipromedicareSort002InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort002Process",jobRepository).tasklet(wipromedicareSort002Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort002SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort002SortOutput",jobRepository).tasklet(wipromedicareSort002OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=(1,1,CH,D,2,12,CH,A)                                      00010000
     * * SPLIT HEADER RECORDS AND NON-HEADER RECORDS INTO DIFFERENT FILES      00020000
     *   OUTFIL INCLUDE=(1,1,CH,EQ,C'H'),                                      00030000
     *   FNAMES=HDR,                                                           00040000
     *   REMOVECC                                                              00050000
     *   OUTFIL FNAMES=NOTHDR,SAVE,                                            00060000
     *   REMOVECC                                                              00070000
     */
    @Bean
    public Flow sort002Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort002Executor")
             .start(sort002Decider(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort002SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort002Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort002SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort003InputReader wipromedicareSort003InputReader() {
    	return new WipromedicareSort003InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort003Processor wipromedicareSort003Processor() {
    	return new WipromedicareSort003Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort003OutputWriter wipromedicareSort003OutputWriter() {
    	return new WipromedicareSort003OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort003SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort003SortInput",jobRepository).tasklet(wipromedicareSort003InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort003Process",jobRepository).tasklet(wipromedicareSort003Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort003SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort003SortOutput",jobRepository).tasklet(wipromedicareSort003OutputWriter(), transactionManager).build();  
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
     *  SORT FIELDS=(1,1,A,61,2,A),FORMAT=BI                                           
     */
    @Bean
    public Flow sort003Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort003Executor")
             .start(sort003Decider(jobRepository, transactionManager))
             .from(sort003Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort003SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort003Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort003SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort004InputReader wipromedicareSort004InputReader() {
    	return new WipromedicareSort004InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort004Processor wipromedicareSort004Processor() {
    	return new WipromedicareSort004Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort004OutputWriter wipromedicareSort004OutputWriter() {
    	return new WipromedicareSort004OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort004SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort004SortInput",jobRepository).tasklet(wipromedicareSort004InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort004Process",jobRepository).tasklet(wipromedicareSort004Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort004SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort004SortOutput",jobRepository).tasklet(wipromedicareSort004OutputWriter(), transactionManager).build();  
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
     *  SORT FIELDS=(1,13,A),FORMAT=BI                                                 
     * * SPLIT HEADER RECORDS AND NON-HEADER RECORDS INTO DIFFERENT FILES              
     *  OUTFIL INCLUDE=(1,1,CH,EQ,C'1'),                                               
     *  FNAMES=HDR,                                                                    
     *  REMOVECC                                                                       
     *  OUTFIL FNAMES=NOTHDR,SAVE,                                                     
     *  REMOVECC                                                                       
     */
    @Bean
    public Flow sort004Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort004Executor")
             .start(sort004Decider(jobRepository, transactionManager))
             .from(sort004Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort004SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort004Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort004SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort005InputReader wipromedicareSort005InputReader() {
    	return new WipromedicareSort005InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort005Processor wipromedicareSort005Processor() {
    	return new WipromedicareSort005Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort005OutputWriter wipromedicareSort005OutputWriter() {
    	return new WipromedicareSort005OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort005SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort005SortInput",jobRepository).tasklet(wipromedicareSort005InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort005Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort005Process",jobRepository).tasklet(wipromedicareSort005Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort005SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort005SortOutput",jobRepository).tasklet(wipromedicareSort005OutputWriter(), transactionManager).build();  
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
     * * MOVE OVERRIDDEN (99) RECORDS TO THE BOTTOM WITH THE ACCEPTED (00)             
     * * RECORDS                                                                       
     *  INREC  IFTHEN=(WHEN=(451,2,CH,EQ,C'99'),                                       
     *                 OVERLAY=(451:X'0000'))                                          
     *  OUTREC IFTHEN=(WHEN=(451,2,BI,EQ,X'0000'),                                     
     *                 OVERLAY=(451:C'99'))                                            
     *  SORT FIELDS=(451,2,BI,D,2,12,BI,A)                                             
     */
    @Bean
    public Flow sort005Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort005Executor")
             .start(sort005Decider(jobRepository, transactionManager))
             .from(sort005Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort005SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort005Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort005SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort006InputReader wipromedicareSort006InputReader() {
    	return new WipromedicareSort006InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort006Processor wipromedicareSort006Processor() {
    	return new WipromedicareSort006Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort006OutputWriter wipromedicareSort006OutputWriter() {
    	return new WipromedicareSort006OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort006SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort006SortInput",jobRepository).tasklet(wipromedicareSort006InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort006Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort006Process",jobRepository).tasklet(wipromedicareSort006Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort006SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort006SortOutput",jobRepository).tasklet(wipromedicareSort006OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=COPY                                                              
     *   OUTFIL HEADER1=(C'RUN DATE & TIME:',DATE,1X,TIME),                            
     *   REMOVECC                                                                      
     */
    @Bean
    public Flow sort006Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort006Executor")
             .start(sort006Decider(jobRepository, transactionManager))
             .from(sort006Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort006SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort006Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort006SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort007InputReader wipromedicareSort007InputReader() {
    	return new WipromedicareSort007InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort007Processor wipromedicareSort007Processor() {
    	return new WipromedicareSort007Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort007OutputWriter wipromedicareSort007OutputWriter() {
    	return new WipromedicareSort007OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort007SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort007SortInput",jobRepository).tasklet(wipromedicareSort007InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort007Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort007Process",jobRepository).tasklet(wipromedicareSort007Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort007SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort007SortOutput",jobRepository).tasklet(wipromedicareSort007OutputWriter(), transactionManager).build();  
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
     * * MOVE OVERRIDDEN (99) RECORDS TO THE BOTTOM WITH THE ACCEPTED (00)             
     * * RECORDS                                                                       
     *  INREC  IFTHEN=(WHEN=(451,2,CH,EQ,C'99'),                                       
     *                 OVERLAY=(451:X'0000'))                                          
     *  OUTREC IFTHEN=(WHEN=(451,2,BI,EQ,X'0000'),                                     
     *                 OVERLAY=(451:C'99'))                                            
     *  SORT FIELDS=(451,2,BI,D,2,12,BI,A)                                             
     */
    @Bean
    public Flow sort007Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort007Executor")
             .start(sort007Decider(jobRepository, transactionManager))
             .from(sort007Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort007SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort007Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort007SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort008InputReader wipromedicareSort008InputReader() {
    	return new WipromedicareSort008InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort008Processor wipromedicareSort008Processor() {
    	return new WipromedicareSort008Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort008OutputWriter wipromedicareSort008OutputWriter() {
    	return new WipromedicareSort008OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort008SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort008SortInput",jobRepository).tasklet(wipromedicareSort008InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort008Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort008Process",jobRepository).tasklet(wipromedicareSort008Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort008SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort008SortOutput",jobRepository).tasklet(wipromedicareSort008OutputWriter(), transactionManager).build();  
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
     * * FORCE HEADER AND DETAIL (RECORD TYPES 1 AND 3) TO TOP OF FILE                 
     *  SORT FIELDS=(1,1,AQ,A)                                                         
     *  ALTSEQ CODE=(F100,F301)                                                        
     */
    @Bean
    public Flow sort008Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort008Executor")
             .start(sort008Decider(jobRepository, transactionManager))
             .from(sort008Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort008SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort008Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort008SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort009InputReader wipromedicareSort009InputReader() {
    	return new WipromedicareSort009InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort009Processor wipromedicareSort009Processor() {
    	return new WipromedicareSort009Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort009OutputWriter wipromedicareSort009OutputWriter() {
    	return new WipromedicareSort009OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort009SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort009SortInput",jobRepository).tasklet(wipromedicareSort009InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort009Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort009Process",jobRepository).tasklet(wipromedicareSort009Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort009SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort009SortOutput",jobRepository).tasklet(wipromedicareSort009OutputWriter(), transactionManager).build();  
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
     * * MOVE OVERRIDDEN (99) RECORDS TO THE BOTTOM WITH THE ACCEPTED (00)             
     * * RECORDS                                                                       
     *  INREC  IFTHEN=(WHEN=(451,2,CH,EQ,C'99'),                                       
     *                 OVERLAY=(451:X'0000'))                                          
     *  OUTREC IFTHEN=(WHEN=(451,2,BI,EQ,X'0000'),                                     
     *                 OVERLAY=(451:C'99'))                                            
     *  SORT FIELDS=(451,2,BI,D,2,12,BI,A)                                             
     */
    @Bean
    public Flow sort009Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort009Executor")
             .start(sort009Decider(jobRepository, transactionManager))
             .from(sort009Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort009SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort009Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort009SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort010InputReader wipromedicareSort010InputReader() {
    	return new WipromedicareSort010InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort010Processor wipromedicareSort010Processor() {
    	return new WipromedicareSort010Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort010OutputWriter wipromedicareSort010OutputWriter() {
    	return new WipromedicareSort010OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort010SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort010SortInput",jobRepository).tasklet(wipromedicareSort010InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort010Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort010Process",jobRepository).tasklet(wipromedicareSort010Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort010SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort010SortOutput",jobRepository).tasklet(wipromedicareSort010OutputWriter(), transactionManager).build();  
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
     * * FORCE HEADER AND DETAIL (RECORD TYPES 1 AND 3) TO TOP OF FILE                 
     *  SORT FIELDS=(1,1,AQ,A)                                                         
     *  ALTSEQ CODE=(F100,F301)                                                        
     */
    @Bean
    public Flow sort010Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort010Executor")
             .start(sort010Decider(jobRepository, transactionManager))
             .from(sort010Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort010SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort010Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort010SortOutput(jobRepository, transactionManager))
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
    public WipromedicareSort011InputReader wipromedicareSort011InputReader() {
    	return new WipromedicareSort011InputReader();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort011Processor wipromedicareSort011Processor() {
    	return new WipromedicareSort011Processor();
    }
    
    @Bean
    @JobScope
    public WipromedicareSort011OutputWriter wipromedicareSort011OutputWriter() {
    	return new WipromedicareSort011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readWipromedicareSort011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readWipromedicareSort011SortInput",jobRepository).tasklet(wipromedicareSort011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processWipromedicareSort011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortWipromedicareSort011Process",jobRepository).tasklet(wipromedicareSort011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeWipromedicareSort011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeWipromedicareSort011SortOutput",jobRepository).tasklet(wipromedicareSort011OutputWriter(), transactionManager).build();  
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
     * * FORCE HEADER AND DETAIL (RECORD TYPES 1 AND 3) TO TOP OF FILE                 
     *  SORT FIELDS=(1,1,AQ,A)                                                         
     *  ALTSEQ CODE=(F100,F301)                                                        
     */
    @Bean
    public Flow sort011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort011Executor")
             .start(sort011Decider(jobRepository, transactionManager))
             .from(sort011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readWipromedicareSort011SortInput(jobRepository, transactionManager))
             .next(processWipromedicareSort011Sort(jobRepository, transactionManager))
             .next(writeWipromedicareSort011SortOutput(jobRepository, transactionManager))
             .from(sort011Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT011 SORT Ends here 
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
