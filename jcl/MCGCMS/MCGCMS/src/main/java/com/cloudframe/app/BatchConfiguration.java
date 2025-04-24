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
    
    private static final String JOBNAME = "MCGCMS";
    
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
     * SORT019 - SORT
     * SORT020 - SORT
     * SORT021 - SORT
     * SORT021_2 - SORT
     * SORT022 - SORT
     * SORT023 - SORT
     * SORT024 - SORT
     * STEPSUM - SORT
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

			// SORT Starts
			.next(sort019Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort020Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort021Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort021_2Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort022Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort023Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(sort024Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(stepsumExecutor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(step010Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(step020Executor(jobRepository, transactionManager)) /*  */
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
    public McgcmsSort001InputReader mcgcmsSort001InputReader() {
    	return new McgcmsSort001InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort001Processor mcgcmsSort001Processor() {
    	return new McgcmsSort001Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort001OutputWriter mcgcmsSort001OutputWriter() {
    	return new McgcmsSort001OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort001SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort001SortInput",jobRepository).tasklet(mcgcmsSort001InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort001Process",jobRepository).tasklet(mcgcmsSort001Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort001SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort001SortOutput",jobRepository).tasklet(mcgcmsSort001OutputWriter(), transactionManager).build();  
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
     *   INREC FIELDS=(1,7,8:X'000000000000001C')                                      
     *   SORT FIELDS=(1,7,CH,A)                                                        
     *   SUM FIELDS=(8,8,PD)                                                           
     *   OUTFIL OUTREC=(1,7,X,8,8,PD,M11)                                              
     */
    @Bean
    public Flow sort001Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort001Executor")
             .start(sort001Decider(jobRepository, transactionManager))
             .from(sort001Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort001SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort001Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort001SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort002InputReader mcgcmsSort002InputReader() {
    	return new McgcmsSort002InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort002Processor mcgcmsSort002Processor() {
    	return new McgcmsSort002Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort002OutputWriter mcgcmsSort002OutputWriter() {
    	return new McgcmsSort002OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort002SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort002SortInput",jobRepository).tasklet(mcgcmsSort002InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort002Process",jobRepository).tasklet(mcgcmsSort002Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort002SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort002SortOutput",jobRepository).tasklet(mcgcmsSort002OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=COPY                                                              
     *   OUTFIL FNAMES=SORTOF1,OUTREC=(68,44,36X),CONVERT                              
     *   OUTFIL FNAMES=SORTOF2,INCLUDE=(24,1,CH,EQ,C'Y'),                              
     *   OUTREC=(1,6,PD,M11,C';',7,5,PD,M11,C';',                                      
     *   12,4,BI,M11,C';',16,5,BI,M11,C';',24,1,C';',                                  
     *   25,44,C';',69,44,C';',113,9,122,6,PD,M11,128,3,PD,M11)                        
     *   OUTFIL FNAMES=SORTOF3,INCLUDE=(24,1,CH,NE,C'Y'),                              
     *   OUTREC=(1,6,PD,M11,C';',7,5,PD,M11,C';',                                      
     *   12,4,BI,M11,C';',16,5,BI,M11,C';',24,1,C';',                                  
     *   25,44,C';',69,44,C';',113,9,122,6,PD,M11,128,3,PD,M11)                        
     */
    @Bean
    public Flow sort002Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort002Executor")
             .start(sort002Decider(jobRepository, transactionManager))
             .from(sort002Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort002SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort002Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort002SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort003InputReader mcgcmsSort003InputReader() {
    	return new McgcmsSort003InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort003Processor mcgcmsSort003Processor() {
    	return new McgcmsSort003Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort003OutputWriter mcgcmsSort003OutputWriter() {
    	return new McgcmsSort003OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort003SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort003SortInput",jobRepository).tasklet(mcgcmsSort003InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort003Process",jobRepository).tasklet(mcgcmsSort003Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort003SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort003SortOutput",jobRepository).tasklet(mcgcmsSort003OutputWriter(), transactionManager).build();  
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
     *   INREC FIELDS=(1,9,C' => PROCESS DATE')                                        
     *   SORT FIELDS=COPY                                                              
     *   OUTREC FIELDS=(2,8,10,16),CONVERT                                             
     */
    @Bean
    public Flow sort003Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort003Executor")
             .start(sort003Decider(jobRepository, transactionManager))
             .from(sort003Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort003SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort003Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort003SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort004InputReader mcgcmsSort004InputReader() {
    	return new McgcmsSort004InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort004Processor mcgcmsSort004Processor() {
    	return new McgcmsSort004Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort004OutputWriter mcgcmsSort004OutputWriter() {
    	return new McgcmsSort004OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort004SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort004SortInput",jobRepository).tasklet(mcgcmsSort004InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort004Process",jobRepository).tasklet(mcgcmsSort004Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort004SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort004SortOutput",jobRepository).tasklet(mcgcmsSort004OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=(1,40,CH,A,41,72,CH,A)              :T:-SORT-FIELD                
     *    SUM FIELDS=(113,11,ZD,                         :T:-COUNT                     
     *                124,15,ZD,                         :T:-TXN-BASE-AMT-DR           
     *                139,15,ZD,                         :T:-TXN-BASE-AMT-CR           
     *                171,15,ZD,                         :T:-INTERCHNG-FEE-DR          
     *                186,15,ZD,                         :T:-INTERCHNG-FEE-CR          
     *                218,15,ZD,                         :T:-SETLMENT-AMT-DR           
     *                233,15,ZD)                         :T:-SETLMENT-AMT-CR           
     *    OUTFIL FNAMES=SORTOF01,                                                      
     *           OUTREC=(1,40,                           :T:-DISTRIB-KEY               
     *                   41,72,                          :T:-DISTRIB-DATA              
     *                   113,11,                         :T:-COUNT                     
     *                   124,15,                         :T:-TXN-BASE-AMT-DR           
     *                   139,15,                         :T:-TXN-BASE-AMT-CR           
     *                   124,15,ZD,SUB,139,15,ZD,                                      
     *                   EDIT=('TTTTTTTTTTTTTTTS'),LENGTH=16,                          
     *                   SIGNS=(,,D,C),C'R',                                           
     *                   171,15,                         :T:-INTERCHNG-FEE-DR          
     *                   186,15,                         :T:-INTERCHNG-FEE-CR          
     *                   171,15,ZD,SUB,186,15,ZD,                                      
     *                   EDIT=('TTTTTTTTTTTTTTTS'),LENGTH=16,                          
     *                   SIGNS=(,,D,C),C'R',                                           
     *                   218,15,                         :T:-SETLMENT-AMT-DR           
     *                   233,15,                         :T:-SETLMENT-AMT-CR           
     *                   218,15,ZD,SUB,233,15,ZD,                                      
     *                   EDIT=('TTTTTTTTTTTTTTTS'),LENGTH=16,                          
     *                   SIGNS=(,,D,C),C'R')                                           
     */
    @Bean
    public Flow sort004Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort004Executor")
             .start(sort004Decider(jobRepository, transactionManager))
             .from(sort004Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort004SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort004Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort004SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort005InputReader mcgcmsSort005InputReader() {
    	return new McgcmsSort005InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort005Processor mcgcmsSort005Processor() {
    	return new McgcmsSort005Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort005OutputWriter mcgcmsSort005OutputWriter() {
    	return new McgcmsSort005OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort005SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort005SortInput",jobRepository).tasklet(mcgcmsSort005InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort005Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort005Process",jobRepository).tasklet(mcgcmsSort005Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort005SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort005SortOutput",jobRepository).tasklet(mcgcmsSort005OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=(44,7,CH,A,69,1,CH,A,70,1,CH,A)                                   
     *   OUTREC FIELDS=(69,1,X,44,7,X,55,4,BI,ZD,X,59,10,HEX,X,71,10,HEX)              
     */
    @Bean
    public Flow sort005Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort005Executor")
             .start(sort005Decider(jobRepository, transactionManager))
             .from(sort005Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort005SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort005Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort005SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort006InputReader mcgcmsSort006InputReader() {
    	return new McgcmsSort006InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort006Processor mcgcmsSort006Processor() {
    	return new McgcmsSort006Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort006OutputWriter mcgcmsSort006OutputWriter() {
    	return new McgcmsSort006OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort006SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort006SortInput",jobRepository).tasklet(mcgcmsSort006InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort006Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort006Process",jobRepository).tasklet(mcgcmsSort006Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort006SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort006SortOutput",jobRepository).tasklet(mcgcmsSort006OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=(1,35,CH,A,36,1,CH,D,37,25,CH,A)    :T:-SORT-FIELD                
     *   SUM FIELDS=(62,09,PD,                          :T:-SETL-DR                    
     *   71,09,PD)                          :T:-SETL-CR                                
     *   OUTFIL FILES=1,                                                               
     *   OUTREC=(01,61,                           :T:-SORT-FIELD                       
     *   62,09,                           :T:-SETL-AMT-DR                              
     *   71,09,                           :T:-SETL-AMT-CR                              
     *   62,09,PD,SUB,71,09,PD,                                                        
     *   EDIT=('TTTTTTTTTTTTTTTTTS'),     :T:-SETL-AMT-NET                             
     *   SIGNS=(,,D,C),C'R')              :T:-SETL-AMT-DR-CR                           
     *   OUTFIL FILES=2,                                                               
     *   INCLUDE=(12,1,CH,NE,C'A')                 :T:-GROUP-ID                        
     */
    @Bean
    public Flow sort006Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort006Executor")
             .start(sort006Decider(jobRepository, transactionManager))
             .from(sort006Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort006SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort006Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort006SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort007InputReader mcgcmsSort007InputReader() {
    	return new McgcmsSort007InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort007Processor mcgcmsSort007Processor() {
    	return new McgcmsSort007Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort007OutputWriter mcgcmsSort007OutputWriter() {
    	return new McgcmsSort007OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort007SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort007SortInput",jobRepository).tasklet(mcgcmsSort007InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort007Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort007Process",jobRepository).tasklet(mcgcmsSort007Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort007SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort007SortOutput",jobRepository).tasklet(mcgcmsSort007OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=(52,3,CH,A)                                                       
     *   SUM FIELDS=(56,9,ZD,118,8,ZD)                                                 
     *   INREC BUILD=(1,126,24X)                                                       
     *   OUTFIL FNAMES=SORTOUT,OUTREC=(1:C'CLR',4:52,3,ZD,M10,7:C':',                  
     *   8:56,9,ZD,DIV,118,8,ZD,MUL,+60,M12,LENGTH=12,130X),                           
     *   HEADER1=(1:C'**START OF TPM COUNT**'),                                        
     *   TRAILER1=(1:C'**END OF TPM COUNT**')                                          
     */
    @Bean
    public Flow sort007Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort007Executor")
             .start(sort007Decider(jobRepository, transactionManager))
             .from(sort007Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort007SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort007Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort007SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort008InputReader mcgcmsSort008InputReader() {
    	return new McgcmsSort008InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort008JoinkeyFormatter mcgcmsSort008JoinkeyFormatter() {
    	return new McgcmsSort008JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McgcmsSort008Processor mcgcmsSort008Processor() {
    	return new McgcmsSort008Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort008OutputWriter mcgcmsSort008OutputWriter() {
    	return new McgcmsSort008OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort008SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort008SortInput",jobRepository).tasklet(mcgcmsSort008InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcgcmsSort008JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcgcmsSort008Joinkeys",jobRepository).tasklet(mcgcmsSort008JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort008Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort008Process",jobRepository).tasklet(mcgcmsSort008Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort008SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort008SortOutput",jobRepository).tasklet(mcgcmsSort008OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=COPY                                                              
     *   JOINKEYS FILE=F1,FIELDS=(50,11,A,61,11,A)                                     
     *   JOINKEYS FILE=F2,FIELDS=(20,11,A,33,11,A)                                     
     *   JOIN UNPAIRED,F1,F2                                                           
     *   REFORMAT FIELDS=(F1:001,102,F2:001,095)                                       
     *   OUTFIL FNAMES=SORTOUT,OMIT=(01,01,CH,EQ,C' ')                                 
     *   OUTREC IFTHEN=(WHEN=(001,001,CH,NE,C' ',AND,                                  
     *   103,001,CH,NE,C' '),                                                          
     *   BUILD=(020,66,                                                                
     *   173,25,                                                                       
     *   C'*******',                                                                   
     *   C'*******************',                                                       
     *   C'*******************')),                                                     
     *   IFTHEN=(WHEN=(001,001,CH,NE,C' ',AND,                                         
     *   103,001,CH,EQ,C' '),                                                          
     *   BUILD=(020,66,                                                                
     *   C'*************************',                                                 
     *   C'*******',                                                                   
     *   C'*******************',                                                       
     *   C'*******************')),                                                     
     *   IFTHEN=(WHEN=(NONE),                                                          
     *   BUILD=(136X))                                                                 
     */
    @Bean
    public Flow sort008Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort008Executor")
             .start(sort008Decider(jobRepository, transactionManager))
             .from(sort008Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort008SortInput(jobRepository, transactionManager))
             .next(reformatMcgcmsSort008JoinKeys(jobRepository, transactionManager))
             .next(processMcgcmsSort008Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort008SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort009InputReader mcgcmsSort009InputReader() {
    	return new McgcmsSort009InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort009JoinkeyFormatter mcgcmsSort009JoinkeyFormatter() {
    	return new McgcmsSort009JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McgcmsSort009Processor mcgcmsSort009Processor() {
    	return new McgcmsSort009Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort009OutputWriter mcgcmsSort009OutputWriter() {
    	return new McgcmsSort009OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort009SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort009SortInput",jobRepository).tasklet(mcgcmsSort009InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcgcmsSort009JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcgcmsSort009Joinkeys",jobRepository).tasklet(mcgcmsSort009JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort009Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort009Process",jobRepository).tasklet(mcgcmsSort009Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort009SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort009SortOutput",jobRepository).tasklet(mcgcmsSort009OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=COPY                                                              
     *   JOINKEYS FILE=F1,FIELDS=(50,11,A,61,11,A)                                     
     *   JOINKEYS FILE=F2,FIELDS=(20,11,A,33,11,A)                                     
     *   JOIN UNPAIRED,F1,F2                                                           
     *   REFORMAT FIELDS=(F1:001,102,F2:001,095)                                       
     *   OUTFIL FNAMES=SORTOUT                                                         
     *   OUTREC IFTHEN=(WHEN=(001,001,CH,NE,C' ',AND,                                  
     *   103,001,CH,NE,C' '),                                                          
     *   BUILD=(020,66,                                                                
     *   173,25,                                                                       
     *   C'*******',                                                                   
     *   C'*******************',                                                       
     *   C'*******************')),                                                     
     *   IFTHEN=(WHEN=(001,001,CH,NE,C' ',AND,                                         
     *   103,001,CH,EQ,C' '),                                                          
     *   BUILD=(020,66,                                                                
     *   C'*************************',                                                 
     *   C'*******',                                                                   
     *   C'*******************',                                                       
     *   C'*******************')),                                                     
     *   IFTHEN=(WHEN=(NONE),                                                          
     *   BUILD=(136X))                                                                 
     */
    @Bean
    public Flow sort009Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort009Executor")
             .start(sort009Decider(jobRepository, transactionManager))
             .from(sort009Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort009SortInput(jobRepository, transactionManager))
             .next(reformatMcgcmsSort009JoinKeys(jobRepository, transactionManager))
             .next(processMcgcmsSort009Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort009SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort010InputReader mcgcmsSort010InputReader() {
    	return new McgcmsSort010InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort010Processor mcgcmsSort010Processor() {
    	return new McgcmsSort010Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort010OutputWriter mcgcmsSort010OutputWriter() {
    	return new McgcmsSort010OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort010SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort010SortInput",jobRepository).tasklet(mcgcmsSort010InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort010Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort010Process",jobRepository).tasklet(mcgcmsSort010Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort010SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort010SortOutput",jobRepository).tasklet(mcgcmsSort010OutputWriter(), transactionManager).build();  
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
     *  SORT FIELDS=(5,8,CH,D,14,11,CH,A)                                              
     *  OUTFIL FNAMES=SORTOF1,INCLUDE=(31,1,CH,EQ,C'M'),                               
     *  HEADER1=('***** MASTERCARD WORLDWIDE - NON COLLECTION ONLY  *****'),           
     *  HEADER2=(/,3:'COUNT',13:'MBRID',22:'ERRCD',28:'IND',40:'INFILE-ID',/),         
     *  OUTREC=(5,8,X,14,11,2X,26,4,2X,31,1,X,33,25),CONVERT                           
     *  OUTFIL FNAMES=SORTOF2,INCLUDE=(31,1,CH,EQ,C'C'),                               
     *  HEADER1=('*****  MASTERCARD WORLDWIDE - COLLECTION ONLY *****'),               
     *  HEADER2=(/,3:'COUNT',13:'MBRID',22:'ERRCD',28:'IND',40:'INFILE-ID',/),         
     *  OUTREC=(5,8,X,14,11,2X,26,4,2X,31,1,X,33,25),CONVERT                           
     */
    @Bean
    public Flow sort010Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort010Executor")
             .start(sort010Decider(jobRepository, transactionManager))
             .from(sort010Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort010SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort010Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort010SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort011InputReader mcgcmsSort011InputReader() {
    	return new McgcmsSort011InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort011Processor mcgcmsSort011Processor() {
    	return new McgcmsSort011Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort011OutputWriter mcgcmsSort011OutputWriter() {
    	return new McgcmsSort011OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort011SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort011SortInput",jobRepository).tasklet(mcgcmsSort011InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort011Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort011Process",jobRepository).tasklet(mcgcmsSort011Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort011SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort011SortOutput",jobRepository).tasklet(mcgcmsSort011OutputWriter(), transactionManager).build();  
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
     *  SORT FIELDS=COPY                                                               
     *  OUTFIL FNAMES=SORTOF1,                                                         
     *  OUTREC=(1,29,30,9,ZD,EDIT=(III,III,IIT)),                                      
     *  INCLUDE=(1,03,CH,EQ,C'001'),                                                   
     *  TRAILER1=(1/,1:C'TOT FOR CYCLE 001 : ',                                        
     *  30:TOT=(30,9,ZD,EDIT=(III,III,IIT)),1/)                                        
     *  OUTFIL FNAMES=SORTOF2,                                                         
     *  OUTREC=(1,29,30,9,ZD,EDIT=(III,III,IIT)),                                      
     *  INCLUDE=(1,03,CH,EQ,C'002'),                                                   
     *  TRAILER1=(1/,1:C'TOT FOR CYCLE 002 : ',                                        
     *  30:TOT=(30,9,ZD,EDIT=(III,III,IIT)),1/)                                        
     *  OUTFIL FNAMES=SORTOF3,                                                         
     *  OUTREC=(1,29,30,9,ZD,EDIT=(III,III,IIT)),                                      
     *  INCLUDE=(1,03,CH,EQ,C'003'),                                                   
     *  TRAILER1=(1/,1:C'TOT FOR CYCLE 003 : ',                                        
     *  30:TOT=(30,9,ZD,EDIT=(III,III,IIT)),1/)                                        
     *  OUTFIL FNAMES=SORTOF4,                                                         
     *  OUTREC=(1,29,30,9,ZD,EDIT=(III,III,IIT)),                                      
     *  INCLUDE=(1,03,CH,EQ,C'004'),                                                   
     *  TRAILER1=(1/,1:C'TOT FOR CYCLE 004 : ',                                        
     *  30:TOT=(30,9,ZD,EDIT=(III,III,IIT)),1/)                                        
     *  OUTFIL FNAMES=SORTOF5,                                                         
     *  OUTREC=(1,29,30,9,ZD,EDIT=(III,III,IIT)),                                      
     *  INCLUDE=(1,03,CH,EQ,C'005'),                                                   
     *  TRAILER1=(1/,1:C'TOT FOR CYCLE 005 : ',                                        
     *  30:TOT=(30,9,ZD,EDIT=(III,III,IIT)),1/)                                        
     *  OUTFIL FNAMES=SORTOF6,                                                         
     *  OUTREC=(1,29,30,9,ZD,EDIT=(III,III,IIT)),                                      
     *  INCLUDE=(1,03,CH,EQ,C'006'),                                                   
     *  TRAILER1=(1/,1:C'TOT FOR CYCLE 006 : ',                                        
     *  30:TOT=(30,9,ZD,EDIT=(III,III,IIT)),1/)                                        
     *  OUTFIL FNAMES=SORTOF7,                                                         
     *  OUTREC=(1,29,30,9,ZD,EDIT=(III,III,IIT)),                                      
     *  INCLUDE=(1,03,CH,EQ,C'007'),                                                   
     *  TRAILER1=(1/,1:C'TOT FOR CYCLE 007 : ',                                        
     *  30:TOT=(30,9,ZD,EDIT=(III,III,IIT)),1/)                                        
     */
    @Bean
    public Flow sort011Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort011Executor")
             .start(sort011Decider(jobRepository, transactionManager))
             .from(sort011Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort011SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort011Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort011SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort012InputReader mcgcmsSort012InputReader() {
    	return new McgcmsSort012InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort012JoinkeyFormatter mcgcmsSort012JoinkeyFormatter() {
    	return new McgcmsSort012JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McgcmsSort012Processor mcgcmsSort012Processor() {
    	return new McgcmsSort012Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort012OutputWriter mcgcmsSort012OutputWriter() {
    	return new McgcmsSort012OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort012SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort012SortInput",jobRepository).tasklet(mcgcmsSort012InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcgcmsSort012JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcgcmsSort012Joinkeys",jobRepository).tasklet(mcgcmsSort012JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort012Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort012Process",jobRepository).tasklet(mcgcmsSort012Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort012SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort012SortOutput",jobRepository).tasklet(mcgcmsSort012OutputWriter(), transactionManager).build();  
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
     *   JOINKEYS FILE=F1,FIELDS=(145,10,A)                                            
     *   JOINKEYS FILE=F2,FIELDS=(01,10,A)                                             
     *   JOIN UNPAIRED,F1,F2                                                           
     *   REFORMAT FIELDS=(F1:001,154,F2:001,010,F1:165,16)                             
     *   OUTFIL FNAMES=SORTOF1                                                         
     *   OUTFIL FNAMES=SORTOF2,OMIT=(154,10,CH,EQ,154,10,CH)                           
     */
    @Bean
    public Flow sort012Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort012Executor")
             .start(sort012Decider(jobRepository, transactionManager))
             .from(sort012Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort012SortInput(jobRepository, transactionManager))
             .next(reformatMcgcmsSort012JoinKeys(jobRepository, transactionManager))
             .next(processMcgcmsSort012Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort012SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort013InputReader mcgcmsSort013InputReader() {
    	return new McgcmsSort013InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort013JoinkeyFormatter mcgcmsSort013JoinkeyFormatter() {
    	return new McgcmsSort013JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McgcmsSort013Processor mcgcmsSort013Processor() {
    	return new McgcmsSort013Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort013OutputWriter mcgcmsSort013OutputWriter() {
    	return new McgcmsSort013OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort013SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort013SortInput",jobRepository).tasklet(mcgcmsSort013InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcgcmsSort013JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcgcmsSort013Joinkeys",jobRepository).tasklet(mcgcmsSort013JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort013Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort013Process",jobRepository).tasklet(mcgcmsSort013Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort013SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort013SortOutput",jobRepository).tasklet(mcgcmsSort013OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=COPY                                                              
     *   JOINKEYS FILE=F1,FIELDS=(145,10,A)                                            
     *   JOINKEYS FILE=F2,FIELDS=(01,10,A)                                             
     *   JOIN UNPAIRED,F1,F2                                                           
     *   REFORMAT FIELDS=(F1:001,154,F2:001,010,F1:165,16)                             
     *   OUTFIL FNAMES=SORTOF1                                                         
     *   OUTFIL FNAMES=SORTOF2,OMIT=(145,10,CH,EQ,155,10,CH)                           
     */
    @Bean
    public Flow sort013Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort013Executor")
             .start(sort013Decider(jobRepository, transactionManager))
             .from(sort013Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort013SortInput(jobRepository, transactionManager))
             .next(reformatMcgcmsSort013JoinKeys(jobRepository, transactionManager))
             .next(processMcgcmsSort013Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort013SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort014InputReader mcgcmsSort014InputReader() {
    	return new McgcmsSort014InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort014JoinkeyFormatter mcgcmsSort014JoinkeyFormatter() {
    	return new McgcmsSort014JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McgcmsSort014Processor mcgcmsSort014Processor() {
    	return new McgcmsSort014Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort014OutputWriter mcgcmsSort014OutputWriter() {
    	return new McgcmsSort014OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort014SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort014SortInput",jobRepository).tasklet(mcgcmsSort014InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcgcmsSort014JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcgcmsSort014Joinkeys",jobRepository).tasklet(mcgcmsSort014JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort014Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort014Process",jobRepository).tasklet(mcgcmsSort014Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort014SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort014SortOutput",jobRepository).tasklet(mcgcmsSort014OutputWriter(), transactionManager).build();  
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
     * * COPYBOOK IP718511                                                             
     *      JOINKEYS FILES=F1,FIELDS=(1,7,A,8,11,A,19,2,A,21,4,A,25,3,A)               
     *      JOINKEYS FILES=F2,FIELDS=(1,7,A,8,11,A,19,2,A,21,4,A,25,3,A)               
     *      JOIN UNPAIRED,F1,F2                                                        
     *      REFORMAT FIELDS=(F1:1,35,F2:1,35),FILL=C'-'                                
     *      SORT FIELDS=COPY                                                           
     *      OUTFIL FNAMES=F1ONLY,INCLUDE=(36,1,CH,EQ,C'-'),                            
     *         OUTREC=(1,35,8Z)                                                        
     *      OUTFIL FNAMES=F2ONLY,INCLUDE=(1,1,CH,EQ,C'-'),                             
     *         OUTREC=(36,27,8Z,63,8)                                                  
     *      OUTFIL FNAMES=BOTH,INCLUDE=(36,1,CH,NE,C'-',AND,1,1,CH,NE,C'-'),           
     *         OUTREC=(1,35,63,8)                                                      
     */
    @Bean
    public Flow sort014Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort014Executor")
             .start(sort014Decider(jobRepository, transactionManager))
             .from(sort014Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort014SortInput(jobRepository, transactionManager))
             .next(reformatMcgcmsSort014JoinKeys(jobRepository, transactionManager))
             .next(processMcgcmsSort014Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort014SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort015InputReader mcgcmsSort015InputReader() {
    	return new McgcmsSort015InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort015Processor mcgcmsSort015Processor() {
    	return new McgcmsSort015Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort015OutputWriter mcgcmsSort015OutputWriter() {
    	return new McgcmsSort015OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort015SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort015SortInput",jobRepository).tasklet(mcgcmsSort015InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort015Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort015Process",jobRepository).tasklet(mcgcmsSort015Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort015SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort015SortOutput",jobRepository).tasklet(mcgcmsSort015OutputWriter(), transactionManager).build();  
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
     *   INCLUDE COND=(24,2,CH,EQ,C'61',OR,24,2,CH,EQ,C'62')                   00010000
     *   INREC FIELDS=(1,4,24,2,38,1,C'000000000000000001')                    00011000
     *   SORT FIELDS=(5,2,CH,A,7,1,CH,A)                                       00020000
     *   SUM FIELDS=(8,18,ZD)                                                  00030000
     *   OUTFIL FNAMES=SORTOF1,INCLUDE=(7,1,CH,EQ,C'C'),                       00040000
     *       OUTREC=(5,2,X,7,1,X,8,18),CONVERT                                 00050000
     *   OUTFIL FNAMES=SORTOF2,SAVE,                                           00060000
     *       OUTREC=(5,2,X,7,1,X,8,18),CONVERT                                 00070000
     */
    @Bean
    public Flow sort015Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort015Executor")
             .start(sort015Decider(jobRepository, transactionManager))
             .from(sort015Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort015SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort015Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort015SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort016InputReader mcgcmsSort016InputReader() {
    	return new McgcmsSort016InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort016JoinkeyFormatter mcgcmsSort016JoinkeyFormatter() {
    	return new McgcmsSort016JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McgcmsSort016Processor mcgcmsSort016Processor() {
    	return new McgcmsSort016Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort016OutputWriter mcgcmsSort016OutputWriter() {
    	return new McgcmsSort016OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort016SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort016SortInput",jobRepository).tasklet(mcgcmsSort016InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcgcmsSort016JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcgcmsSort016Joinkeys",jobRepository).tasklet(mcgcmsSort016JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort016Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort016Process",jobRepository).tasklet(mcgcmsSort016Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort016SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort016SortOutput",jobRepository).tasklet(mcgcmsSort016OutputWriter(), transactionManager).build();  
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
     * *----------------------------------------------------------------------         
     * *SORT CONTROL CARD TO GENERATE FILE REPRIORITY STATS REPORT PRODUCED            
     * *FROM THE OUTPUT FILE BY IP876120. ALSO, IT CREATES SPLUNK FEED                 
     * *----------------------------------------------------------------------         
     *  SORT FIELDS=COPY                                                               
     *  JOINKEYS FILE=F1,FIELDS=(01,11,A)                                              
     *  JOINKEYS FILE=F2,FIELDS=(03,11,A)                                              
     *  REFORMAT FIELDS=(F2:03,011,F2:15,30,                                           
     *                   F1:12,125,F2:01,01,F2:46,03)                                  
     *  OUTFIL FNAMES=SORTOF1,                                                         
     *     OUTREC=(1:DATE1(/),X,TIME,C'|REPRY|CYC_ID =',X'7F',C'0',                    
     *             166,01,X'7F',C'|PROC_DT =',X'7F',8X,X'7F',                          
     *             C'|PROC_ID =',X'7F',                                                
     *             001,11,X'7F',C'|MEMBER_NAME =',X'7F',                               
     *             012,30,X'7F',C'|REGION =',X'7F',                                    
     *             167,01,X'7F',C'|COUNTRY =',X'7F',                                   
     *             168,03,X'7F',C'|GFT_DATASET_NAME =',X'7F',                          
     *             042,44,X'7F',C'|AVAIL_TMS =',X'7F',                                 
     *             086,26,X'7F',C'|OLD_PRTY =',X'7F',                                  
     *             112,02,PD,M11,LENGTH=2,X'7F',                                       
     *             C'|NEW_PRTY =',X'7F',                                               
     *             114,02,PD,M11,LENGTH=2,X'7F',                                       
     *             C'|UPD_IND =',X'7F',                                                
     *             116,01,X'7F',                                                       
     *             C'|UPD_TMS =',X'7F',                                                
     *             117,26,X'7F',                                                       
     *             C'|NET_GLBL_TXN_AMT =',X'7F',                                       
     *             143,13,PD,M11,LENGTH=15,X'7F',                                      
     *             C'|NET_GLBL_TXN_CNT =',X'7F',                                       
     *             156,10,PD,M11,LENGTH=12,X'7F',C'|',2090X)                           
     *  OUTFIL FNAMES=SORTOF2,                                                         
     *     HEADER1=(1/,1'IP876120-AA',                                                 
     *                40X,1'CLEARING SETTLEMENT REPRIORITIZA',                         
     *                'TION - DETAIL REPORT',                                          
     *                5X,160:C'DATE: ',DATE=(MD4/),X,TIME,/),                          
     *      HEADER2=(C'CYC',X,                                                         
     *               C'  SNDR MBR',10X,                                                
     *               C'MBR NAME',15X,                                                  
     *               C'COUNTRY',X,                                                     
     *               C'REGION',14X,                                                    
     *               C'GFT DASET NAM',25X,                                             
     *               C'AVAIL TIMESTAMP',7X,                                            
     *               C'OLD',2X,                                                        
     *               C'NEW',2X,                                                        
     *               C'UPD',9X,                                                        
     *               C'UPD TIMESTAMP',17X,                                             
     *               C'NET GLBL TXN. AMT',7X,                                          
     *               C'TRAN. CNT',6X,                                                  
     *               C'CURRENT TIMESTMP',/,135X,                                       
     *               C'PRY',2X,                                                        
     *               C'PRY',X,/),                                                      
     *      OUTREC=(001:X,                                                             
     *              166,01,2X,                                                         
     *              001,11,X,                                                          
     *              012,30,3X,                                                         
     *              168,03,6X,                                                         
     *              167,01,3X,                                                         
     *              042,44,2X,                                                         
     *              086,26,2X,                                                         
     *              112,02,PD,M11,LENGTH=2,3X,                                         
     *              114,02,PD,M11,LENGTH=2,3X,                                         
     *              116,01,3X,                                                         
     *              117,26,X,                                                          
     *              143,13,PD,EDIT=($III,III,III,III,III,IIT.TT),X,                    
     *              156,10,PD,EDIT=(III,III,III,IIT),X,DATE5)                          
     */
    @Bean
    public Flow sort016Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort016Executor")
             .start(sort016Decider(jobRepository, transactionManager))
             .from(sort016Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort016SortInput(jobRepository, transactionManager))
             .next(reformatMcgcmsSort016JoinKeys(jobRepository, transactionManager))
             .next(processMcgcmsSort016Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort016SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort017InputReader mcgcmsSort017InputReader() {
    	return new McgcmsSort017InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort017Processor mcgcmsSort017Processor() {
    	return new McgcmsSort017Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort017OutputWriter mcgcmsSort017OutputWriter() {
    	return new McgcmsSort017OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort017SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort017SortInput",jobRepository).tasklet(mcgcmsSort017InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort017Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort017Process",jobRepository).tasklet(mcgcmsSort017Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort017SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort017SortOutput",jobRepository).tasklet(mcgcmsSort017OutputWriter(), transactionManager).build();  
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
     * *-----------------------------------------------------------------------        
     * *THIS SORT CONTROL CARD IS TO COUNT THE TOTAL NUMBER OF RECORDS                 
     * *IN INPUT FILE OF VARIABLE FORMAT                                               
     * *-----------------------------------------------------------------------        
     *   INREC FIELDS=(01,04,X,C'0000000001')                                          
     *   SORT FIELDS=(05,01,CH,A)                                                      
     *   SUM FIELDS=(06,10,ZD)                                                         
     *   OUTFIL FNAMES=SORTOUT,OUTREC=(06,10),CONVERT                                  
     */
    @Bean
    public Flow sort017Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort017Executor")
             .start(sort017Decider(jobRepository, transactionManager))
             .from(sort017Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort017SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort017Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort017SortOutput(jobRepository, transactionManager))
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
    public McgcmsSort018InputReader mcgcmsSort018InputReader() {
    	return new McgcmsSort018InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort018Processor mcgcmsSort018Processor() {
    	return new McgcmsSort018Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort018OutputWriter mcgcmsSort018OutputWriter() {
    	return new McgcmsSort018OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort018SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort018SortInput",jobRepository).tasklet(mcgcmsSort018InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort018Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort018Process",jobRepository).tasklet(mcgcmsSort018Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort018SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort018SortOutput",jobRepository).tasklet(mcgcmsSort018OutputWriter(), transactionManager).build();  
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
     *  SORT FIELDS=(1,7,CH,A,8,11,CH,A,33,7,CH,A,133,3,CH,A)                          
     *  SUM FIELDS=(58,13,ZD,104,13,ZD)                                                
     */
    @Bean
    public Flow sort018Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort018Executor")
             .start(sort018Decider(jobRepository, transactionManager))
             .from(sort018Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort018SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort018Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort018SortOutput(jobRepository, transactionManager))
             .from(sort018Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT018 SORT Ends here 
     */
    
    /*
     * SORT019 SORT starts here
     */
    
    private static final String SORT019_STEP = "sort019";
    @Bean
    @JobScope
    public McgcmsSort019InputReader mcgcmsSort019InputReader() {
    	return new McgcmsSort019InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort019Processor mcgcmsSort019Processor() {
    	return new McgcmsSort019Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort019OutputWriter mcgcmsSort019OutputWriter() {
    	return new McgcmsSort019OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort019SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort019SortInput",jobRepository).tasklet(mcgcmsSort019InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort019Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort019Process",jobRepository).tasklet(mcgcmsSort019Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort019SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort019SortOutput",jobRepository).tasklet(mcgcmsSort019OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort019Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort019Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT019_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT019_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT019_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT019_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(1,1,CH,A,2,11,CH,A,13,11,CH,A,24,25,CH,A,113,3,CH,A)             
     *   SUM FIELDS=(50,16,ZD,66,16,ZD,82,16,ZD)                                       
     */
    @Bean
    public Flow sort019Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort019Executor")
             .start(sort019Decider(jobRepository, transactionManager))
             .from(sort019Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort019SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort019Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort019SortOutput(jobRepository, transactionManager))
             .from(sort019Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT019 SORT Ends here 
     */
    
    /*
     * SORT020 SORT starts here
     */
    
    private static final String SORT020_STEP = "sort020";
    @Bean
    @JobScope
    public McgcmsSort020InputReader mcgcmsSort020InputReader() {
    	return new McgcmsSort020InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort020Processor mcgcmsSort020Processor() {
    	return new McgcmsSort020Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort020OutputWriter mcgcmsSort020OutputWriter() {
    	return new McgcmsSort020OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort020SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort020SortInput",jobRepository).tasklet(mcgcmsSort020InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort020Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort020Process",jobRepository).tasklet(mcgcmsSort020Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort020SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort020SortOutput",jobRepository).tasklet(mcgcmsSort020OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort020Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort020Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT020_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT020_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT020_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT020_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(001,103,CH,A,104,103,CH,A,                                       
     *                 236,003,CH,A,                                                   
     *                 250,007,CH,A,                                                   
     *                 257,002,CH,A,                                                   
     *                 313,007,CH,A,                                                   
     *                 320,002,CH,A)                                                   
     *   SUM FIELDS=(365,11,PD,376,11,PD,                                              
     *                387,11,PD,398,11,PD,                                             
     *                409,11,PD,420,11,PD,                                             
     *                431,06,PD,                                                       
     *                437,11,PD,448,11,PD,                                             
     *                459,11,PD,470,11,PD,                                             
     *                481,11,PD,492,11,PD,                                             
     *                503,06,PD)                                                       
     */
    @Bean
    public Flow sort020Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort020Executor")
             .start(sort020Decider(jobRepository, transactionManager))
             .from(sort020Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort020SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort020Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort020SortOutput(jobRepository, transactionManager))
             .from(sort020Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT020 SORT Ends here 
     */
    
    /*
     * SORT021 SORT starts here
     */
    
    private static final String SORT021_STEP = "sort021";
    @Bean
    @JobScope
    public McgcmsSort021InputReader mcgcmsSort021InputReader() {
    	return new McgcmsSort021InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort021Processor mcgcmsSort021Processor() {
    	return new McgcmsSort021Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort021OutputWriter mcgcmsSort021OutputWriter() {
    	return new McgcmsSort021OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort021SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort021SortInput",jobRepository).tasklet(mcgcmsSort021InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort021Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort021Process",jobRepository).tasklet(mcgcmsSort021Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort021SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort021SortOutput",jobRepository).tasklet(mcgcmsSort021OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort021Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort021Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT021_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT021_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT021_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT021_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(147,2,ZD,EQ,02,OR,                                              
     *                 147,2,ZD,EQ,03)                                                 
     *   INREC FIELDS=(223,11,ZD,PD,                     MEMBER ID                     
     *                 C'M',                             SETTLE INDIC                  
     *                 075,01,                           DIRECTION                     
     *                 076,03,                           CURRENCY                      
     *                 234,1,CHANGE=(4,C'X',C'XSIF'),    FIELD                         
     *                             NOMATCH=(C'SIF '),                                  
     *                 107,01,C'R',                      DR/CR                         
     *                 108,11,                           AMOUNT                        
     *                 141,06)                           COUNT                         
     *   SORT FIELDS=(1,17,CH,A)                                                       
     *   SUM FIELDS=(18,11,PD,29,06,PD)                                                
     */
    @Bean
    public Flow sort021Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort021Executor")
             .start(sort021Decider(jobRepository, transactionManager))
             .from(sort021Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort021SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort021Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort021SortOutput(jobRepository, transactionManager))
             .from(sort021Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT021 SORT Ends here 
     */
    
    /*
     * SORT021_2 SORT starts here
     */
    
    private static final String SORT021_2_STEP = "sort021_2";
    @Bean
    @JobScope
    public McgcmsSort021_2InputReader mcgcmsSort021_2InputReader() {
    	return new McgcmsSort021_2InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort021_2Processor mcgcmsSort021_2Processor() {
    	return new McgcmsSort021_2Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort021_2OutputWriter mcgcmsSort021_2OutputWriter() {
    	return new McgcmsSort021_2OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort021_2SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort021_2SortInput",jobRepository).tasklet(mcgcmsSort021_2InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort021_2Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort021_2Process",jobRepository).tasklet(mcgcmsSort021_2Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort021_2SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort021_2SortOutput",jobRepository).tasklet(mcgcmsSort021_2OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort021_2Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort021_2Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT021_2_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT021_2_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT021_2_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT021_2_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INCLUDE COND=(147,2,ZD,EQ,02,OR,                                              
     *                 147,2,ZD,EQ,03)                                                 
     *   INREC FIELDS=(223,11,ZD,PD,                     MEMBER ID                     
     *                 C'M',                             SETTLE INDIC                  
     *                 075,01,                           DIRECTION                     
     *                 076,03,                           CURRENCY                      
     *                 234,1,CHANGE=(4,C'X',C'XSIF'),    FIELD                         
     *                             NOMATCH=(C'SIF '),                                  
     *                 107,01,C'R',                      DR/CR                         
     *                 108,11,                           AMOUNT                        
     *                 141,06)                           COUNT                         
     *   SORT FIELDS=(1,17,CH,A)                                                       
     *   SUM FIELDS=(18,11,PD,29,06,PD)                                                
     */
    @Bean
    public Flow sort021_2Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort021_2Executor")
             .start(sort021_2Decider(jobRepository, transactionManager))
             .from(sort021_2Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort021_2SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort021_2Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort021_2SortOutput(jobRepository, transactionManager))
             .from(sort021_2Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT021_2 SORT Ends here 
     */
    
    /*
     * SORT022 SORT starts here
     */
    
    private static final String SORT022_STEP = "sort022";
    @Bean
    @JobScope
    public McgcmsSort022InputReader mcgcmsSort022InputReader() {
    	return new McgcmsSort022InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort022Processor mcgcmsSort022Processor() {
    	return new McgcmsSort022Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort022OutputWriter mcgcmsSort022OutputWriter() {
    	return new McgcmsSort022OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort022SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort022SortInput",jobRepository).tasklet(mcgcmsSort022InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort022Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort022Process",jobRepository).tasklet(mcgcmsSort022Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort022SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort022SortOutput",jobRepository).tasklet(mcgcmsSort022OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort022Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort022Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT022_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT022_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT022_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT022_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * *-----------------------------------------------------------------------        
     * * SPLIT SINGLE NET/DUAL NET RECORDS OF BAU SIF FILE IN IP981302                 
     * * AND IP981303 LAYOUT.                                                          
     * *-----------------------------------------------------------------------        
     *   SORT FIELDS=COPY                                                              
     *   OUTFIL FNAMES=SORTOF1,INCLUDE=(005,01,CH,EQ,C'D',AND,                         
     *                                   058,02,CH,NE,C'11',AND,                       
     *                                   152,20,ZD,GT,0),                              
     *           OUTREC=(005,260),CONVERT                                              
     *   OUTFIL FNAMES=SORTOF2,INCLUDE=(005,01,CH,EQ,C'P',AND,                         
     *                                   058,02,CH,NE,C'11',AND,                       
     *                                   310,20,ZD,GT,0),                              
     *           OUTREC=(005,394),CONVERT                                              
     */
    @Bean
    public Flow sort022Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort022Executor")
             .start(sort022Decider(jobRepository, transactionManager))
             .from(sort022Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort022SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort022Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort022SortOutput(jobRepository, transactionManager))
             .from(sort022Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT022 SORT Ends here 
     */
    
    /*
     * SORT023 SORT starts here
     */
    
    private static final String SORT023_STEP = "sort023";
    @Bean
    @JobScope
    public McgcmsSort023InputReader mcgcmsSort023InputReader() {
    	return new McgcmsSort023InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort023Processor mcgcmsSort023Processor() {
    	return new McgcmsSort023Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort023OutputWriter mcgcmsSort023OutputWriter() {
    	return new McgcmsSort023OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort023SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort023SortInput",jobRepository).tasklet(mcgcmsSort023InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort023Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort023Process",jobRepository).tasklet(mcgcmsSort023Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort023SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort023SortOutput",jobRepository).tasklet(mcgcmsSort023OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort023Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort023Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT023_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT023_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT023_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT023_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * * INPUT FILE IS IN COPYBOOK LAYOUT IP981302                                     
     *   SORT FIELDS=COPY                                                              
     *   OUTFIL FNAMES=SORTOUT,                                                        
     *          IFTHEN=(WHEN=(260,01,CH,EQ,C'C'),                                      
     *           BUILD=(042,011,X,                                                     
     *                  169,003,X,                                                     
     *                  148,020,ZD,MUL,+1,PD,LENGTH=11)),                              
     *          IFTHEN=(WHEN=(NONE),                                                   
     *           BUILD=(042,011,X,                                                     
     *                  169,003,X,                                                     
     *                  148,020,ZD,MUL,-1,PD,LENGTH=11))                               
     */
    @Bean
    public Flow sort023Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort023Executor")
             .start(sort023Decider(jobRepository, transactionManager))
             .from(sort023Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort023SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort023Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort023SortOutput(jobRepository, transactionManager))
             .from(sort023Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT023 SORT Ends here 
     */
    
    /*
     * SORT024 SORT starts here
     */
    
    private static final String SORT024_STEP = "sort024";
    @Bean
    @JobScope
    public McgcmsSort024InputReader mcgcmsSort024InputReader() {
    	return new McgcmsSort024InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsSort024Processor mcgcmsSort024Processor() {
    	return new McgcmsSort024Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsSort024OutputWriter mcgcmsSort024OutputWriter() {
    	return new McgcmsSort024OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsSort024SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsSort024SortInput",jobRepository).tasklet(mcgcmsSort024InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsSort024Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsSort024Process",jobRepository).tasklet(mcgcmsSort024Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsSort024SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsSort024SortOutput",jobRepository).tasklet(mcgcmsSort024OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step sort024Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("sort024Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(SORT024_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(SORT024_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(SORT024_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(SORT024_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * * COPYBOOK IP981201                                                             
     *  SORT FIELDS=(75,1,CH,A,107,1,CH,A)                                             
     *  SUM FIELDS=(130,11,PD)                                                         
     *  OUTREC FIELDS=(C'DIRECTION = ',75,1,                                  +        
     *                 C' DR/CR = ',107,1,                                    +        
     *                 C' AMOUNT IN USD = ',130,9,HEX)                                 
     */
    @Bean
    public Flow sort024Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("sort024Executor")
             .start(sort024Decider(jobRepository, transactionManager))
             .from(sort024Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsSort024SortInput(jobRepository, transactionManager))
             .next(processMcgcmsSort024Sort(jobRepository, transactionManager))
             .next(writeMcgcmsSort024SortOutput(jobRepository, transactionManager))
             .from(sort024Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * SORT024 SORT Ends here 
     */
    
    /*
     * STEPSUM SORT starts here
     */
    
    private static final String STEPSUM_STEP = "stepsum";
    @Bean
    @JobScope
    public McgcmsStepsumInputReader mcgcmsStepsumInputReader() {
    	return new McgcmsStepsumInputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsStepsumProcessor mcgcmsStepsumProcessor() {
    	return new McgcmsStepsumProcessor();
    }
    
    @Bean
    @JobScope
    public McgcmsStepsumOutputWriter mcgcmsStepsumOutputWriter() {
    	return new McgcmsStepsumOutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsStepsumSortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsStepsumSortInput",jobRepository).tasklet(mcgcmsStepsumInputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsStepsumSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsStepsumProcess",jobRepository).tasklet(mcgcmsStepsumProcessor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsStepsumSortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsStepsumSortOutput",jobRepository).tasklet(mcgcmsStepsumOutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step stepsumDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("stepsumDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEPSUM_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEPSUM_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEPSUM_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEPSUM_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   SORT FIELDS=(1,7,ZD,A,8,11,ZD,A,19,2,CH,A,21,4,ZD,A,25,3,ZD,A),EQUALS         
     *   SUM FIELDS=(28,8,BI)                                                          
     */
    @Bean
    public Flow stepsumExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("stepsumExecutor")
             .start(stepsumDecider(jobRepository, transactionManager))
             .from(stepsumDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsStepsumSortInput(jobRepository, transactionManager))
             .next(processMcgcmsStepsumSort(jobRepository, transactionManager))
             .next(writeMcgcmsStepsumSortOutput(jobRepository, transactionManager))
             .from(stepsumDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEPSUM SORT Ends here 
     */
    
    /*
     * STEP010 SORT starts here
     */
    
    private static final String STEP010_STEP = "step010";
    @Bean
    @JobScope
    public McgcmsStep010InputReader mcgcmsStep010InputReader() {
    	return new McgcmsStep010InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsStep010Processor mcgcmsStep010Processor() {
    	return new McgcmsStep010Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsStep010OutputWriter mcgcmsStep010OutputWriter() {
    	return new McgcmsStep010OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsStep010SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsStep010SortInput",jobRepository).tasklet(mcgcmsStep010InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsStep010Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsStep010Process",jobRepository).tasklet(mcgcmsStep010Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsStep010SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsStep010SortOutput",jobRepository).tasklet(mcgcmsStep010OutputWriter(), transactionManager).build();  
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
     *   SORT FIELDS=(12,11,CH,A,            RDW + MEMBER-ID                           
     *                29,16,CH,A),           RDW + DISTRIBUTION FILE                   
     *                EQUALS                                                           
     */
    @Bean
    public Flow step010Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step010Executor")
             .start(step010Decider(jobRepository, transactionManager))
             .from(step010Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsStep010SortInput(jobRepository, transactionManager))
             .next(processMcgcmsStep010Sort(jobRepository, transactionManager))
             .next(writeMcgcmsStep010SortOutput(jobRepository, transactionManager))
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
    public McgcmsStep020InputReader mcgcmsStep020InputReader() {
    	return new McgcmsStep020InputReader();
    }
    
    @Bean
    @JobScope
    public McgcmsStep020JoinkeyFormatter mcgcmsStep020JoinkeyFormatter() {
    	return new McgcmsStep020JoinkeyFormatter();
    }
    
    @Bean
    @JobScope
    public McgcmsStep020Processor mcgcmsStep020Processor() {
    	return new McgcmsStep020Processor();
    }
    
    @Bean
    @JobScope
    public McgcmsStep020OutputWriter mcgcmsStep020OutputWriter() {
    	return new McgcmsStep020OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMcgcmsStep020SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMcgcmsStep020SortInput",jobRepository).tasklet(mcgcmsStep020InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step reformatMcgcmsStep020JoinKeys(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("reformatMcgcmsStep020Joinkeys",jobRepository).tasklet(mcgcmsStep020JoinkeyFormatter(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMcgcmsStep020Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMcgcmsStep020Process",jobRepository).tasklet(mcgcmsStep020Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMcgcmsStep020SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMcgcmsStep020SortOutput",jobRepository).tasklet(mcgcmsStep020OutputWriter(), transactionManager).build();  
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
     *   JOINKEYS FILE=F1,FIELDS=(12,11,A,   RDW + MEMBER ID                           
     *                29,16,A)               RDW + DISTRIBUTION FILE                   
     *   JOINKEYS FILE=F2,FIELDS=(12,11,A,   RDW + MEMBER ID                           
     *                29,16,A)               RDW + DISTRIBUTION FILE                   
     *   REFORMAT FIELDS=(F2:01,04,          RDW                                       
     *                F1:05,07,              RDW + MGOS ENDPOINT                       
     *                F2:12,11,              RDW + MEMBER ID                           
     *                F2:23,22,              RDW + DISTRIBUTION ID                     
     *                F1:45,01,              RDW + MGOS MEDIA CODE                     
     *                F2:45)                 RDW + APPLICATION DATA                    
     *   SORT FIELDS=COPY                                                              
     */
    @Bean
    public Flow step020Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step020Executor")
             .start(step020Decider(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMcgcmsStep020SortInput(jobRepository, transactionManager))
             .next(reformatMcgcmsStep020JoinKeys(jobRepository, transactionManager))
             .next(processMcgcmsStep020Sort(jobRepository, transactionManager))
             .next(writeMcgcmsStep020SortOutput(jobRepository, transactionManager))
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
