package com.cloudframe.app;
 
import java.util.Map;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.tasks.*;
import com.cloudframe.app.utility.ListCatReportGen;
import com.cloudframe.utils.CFVsam;
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
    
    @Autowired
    ListCatReportGen listCatReportGen;
    
    private static final String JOBNAME = "USBICE01";
    
    /* Driver Programs used in steps */  
   private static final String IDCAMS = "IDCAMS";
   private static final String ICETOOL = "ICETOOL";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /*
     * p010Flow Starts here 
     */
    
    @Bean
    public Flow p010Flow(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new FlowBuilder<SimpleFlow>("p010Flow").start(p010(jobRepository,transactionManager)).build();
    }
    
    /*
     *  p010Flow Ends here 
     */
    
    /** 
     *   Execute the Job that consists of 
     * P010 - IEFBR14
     * P020 - IDCAMS
     * P030_01 - ICETOOL
     * P030_02 - ICETOOL
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(p010Flow(jobRepository, transactionManager))
			.next(p020(jobRepository, transactionManager)) /*  */

			// ICETOOL Starts
			.next(p030_01Executor(jobRepository, transactionManager)) /*  */
			.next(p030_02Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * P010 IEFBR14 starts here
     */
    
    private static final String P010_STEP = "p010";
    
    @Bean
    public Step p010(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P010_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P010_STEP)) {
 	 					int rc = 0; // IEFBR14 PROGRAM 
                      try {
 		    	   		cfStepHandler.handleStepOverrides(P010_STEP);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P010_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(P010_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * P010 IEFBR14 Ends here 
     */
    
    /*
     * P020 IDCAMS starts here
     */
    
    private static final String P020_STEP = "p020";
    
    @Bean
    public Step p020(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(P020_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(P020_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = listCatReportGen.generateReport("P020.IDCAMS.Sysin");
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(P020_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(P020_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * P020 IDCAMS Ends here 
     */
    
    /*
     * P030_01 ICETOOL starts here
     */
    
    private static final String P030_01_STEP = "p030_01";
    @Bean
    @JobScope
    public Usbice01P030_01InputReader usbice01P030_01InputReader() {
    	return new Usbice01P030_01InputReader();
    }
    
    @Bean
    @JobScope
    public Usbice01P030_01Processor usbice01P030_01Processor() {
    	return new Usbice01P030_01Processor();
    }
    
    @Bean
    @JobScope
    public Usbice01P030_01OutputWriter usbice01P030_01OutputWriter() {
    	return new Usbice01P030_01OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readUsbice01P030_01SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readUsbice01P030_01SortInput",jobRepository).tasklet(usbice01P030_01InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processUsbice01P030_01Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortUsbice01P030_01Process",jobRepository).tasklet(usbice01P030_01Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeUsbice01P030_01SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeUsbice01P030_01SortOutput",jobRepository).tasklet(usbice01P030_01OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_01Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_01Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_01_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_01_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_01_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_01_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   OPTION VLSCMP
     *   INCLUDE COND=(6,7,CH,EQ,C'NONVSAM')
     *   SORT FIELDS=COPY
     */
    @Bean
    public Flow p030_01Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_01Executor")
             .start(p030_01Decider(jobRepository, transactionManager))
             .from(p030_01Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readUsbice01P030_01SortInput(jobRepository, transactionManager))
             .next(processUsbice01P030_01Sort(jobRepository, transactionManager))
             .next(writeUsbice01P030_01SortOutput(jobRepository, transactionManager))
             .from(p030_01Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_01 ICETOOL Ends here 
     */
    
    /*
     * P030_02 ICETOOL starts here
     */
    
    private static final String P030_02_STEP = "p030_02";
    @Bean
    @JobScope
    public Usbice01P030_02InputReader usbice01P030_02InputReader() {
    	return new Usbice01P030_02InputReader();
    }
    
    @Bean
    @JobScope
    public Usbice01P030_02Processor usbice01P030_02Processor() {
    	return new Usbice01P030_02Processor();
    }
    
    @Bean
    @JobScope
    public Usbice01P030_02OutputWriter usbice01P030_02OutputWriter() {
    	return new Usbice01P030_02OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readUsbice01P030_02SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readUsbice01P030_02SortInput",jobRepository).tasklet(usbice01P030_02InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processUsbice01P030_02Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortUsbice01P030_02Process",jobRepository).tasklet(usbice01P030_02Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeUsbice01P030_02SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeUsbice01P030_02SortOutput",jobRepository).tasklet(usbice01P030_02OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step p030_02Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("p030_02Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(P030_02_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(P030_02_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(P030_02_STEP, rc, ICETOOL );
    		      cfStepHandler.updateStepExecution(P030_02_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   INREC  IFTHEN=(WHEN=(30,3,CH,EQ,C'TM.'),
     *          BUILD=(1:1,4,5:C'REPRO IDS(',15:22,36,C') OFILE(MODDD2)'),
     *          HIT=NEXT),
     *          IFTHEN=(WHEN=(30,3,CH,EQ,C'TM3'),
     *          BUILD=(1:1,4,5:C'REPRO IDS(',15:22,37,C') OFILE(MODDD2)'),
     *          HIT=NEXT),
     *          IFTHEN=(WHEN=(30,3,CH,EQ,C'TME'),
     *          BUILD=(1:1,4,5:C'REPRO IDS(',15:22,37,C') OFILE(MODDD2)'),
     *          HIT=NEXT),
     *          IFTHEN=(WHEN=(29,3,CH,EQ,C'TM.'),
     *          BUILD=(1:1,4,5:C'REPRO IDS(',15:21,36,C') OFILE(MODDD2)'),
     *          HIT=NEXT),
     *          IFTHEN=(WHEN=(29,3,CH,EQ,C'TM3'),
     *          BUILD=(1:1,4,5:C'REPRO IDS(',15:21,37,C') OFILE(MODDD2)'),
     *          HIT=NEXT),
     *          IFTHEN=(WHEN=(29,3,CH,EQ,C'TME'),
     *          BUILD=(1:1,4,5:C'REPRO IDS(',15:21,37,C') OFILE(MODDD2)'),
     *          HIT=NEXT)
     *   OUTFIL FNAMES=FLE3,VTOF,
     *         BUILD=(2X,3:5,67,11X),
     *   REMOVECC,
     *   TRAILER1=(8X,9:C'SET MAXCC=0')
     */
    @Bean
    public Flow p030_02Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("p030_02Executor")
             .start(p030_02Decider(jobRepository, transactionManager))
             .from(p030_02Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readUsbice01P030_02SortInput(jobRepository, transactionManager))
             .next(processUsbice01P030_02Sort(jobRepository, transactionManager))
             .next(writeUsbice01P030_02SortOutput(jobRepository, transactionManager))
             .from(p030_02Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * P030_02 ICETOOL Ends here 
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
