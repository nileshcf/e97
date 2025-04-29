package com.cloudframe.app;
 
import com.cloudframe.app.utility.CopyUtil;
import org.springframework.batch.core.configuration.annotation.JobScope;
import java.util.Map;
import com.cloudframe.app.tasks.*;
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
    
@Configuration
    
public class BatchConfiguration {
    
    
    @Autowired
    CFStepHandler cfStepHandler;
    
    @Autowired
    CopyUtil copyUtil;
    
    private static final String JOBNAME = "SORTVSAM";
    
    /* Driver Programs used in steps */  
   private static final String IDCAMS = "IDCAMS";
   private static final String SORT = "SORT";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /*
     * delclusrFlow Starts here 
     */
    
    @Bean
    public Flow delclusrFlow(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new FlowBuilder<SimpleFlow>("delclusrFlow").start(delclusr(jobRepository,transactionManager)).build();
    }
    
    /*
     *  delclusrFlow Ends here 
     */
    
    /** 
     *   Execute the Job that consists of 
     * DELCLUSR - IDCAMS
     * DEFCLUSR - IDCAMS
     * QSAM2VSAM - SORT
     * VSAM2QSAM - SORT
     * IDCAMSOUT - IDCAMS
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(delclusrFlow(jobRepository, transactionManager))
			.next(defclusr(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(qsam2vsamExecutor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(vsam2qsamExecutor(jobRepository, transactionManager)) /*  */

			.next(idcamsout(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * DELCLUSR IDCAMS starts here
     */
    
    private static final String DELCLUSR_STEP = "delclusr";
    
    @Bean
    public Step delclusr(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(DELCLUSR_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(DELCLUSR_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = CFVsam.deleteCluster("CLOUDFRM_IDCAMS_MONITOR.json"/*Cluster json*/);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(DELCLUSR_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(DELCLUSR_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * DELCLUSR IDCAMS Ends here 
     */
    
    /*
     * DEFCLUSR IDCAMS starts here
     */
    
    private static final String DEFCLUSR_STEP = "defclusr";
    
    @Bean
    public Step defclusr(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(DEFCLUSR_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(DEFCLUSR_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = CFVsam.createCluster("CLOUDFRM_IDCAMS_MONITOR.json"/*Cluster json*/);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(DEFCLUSR_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(DEFCLUSR_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * DEFCLUSR IDCAMS Ends here 
     */
    
    /*
     * QSAM2VSAM SORT starts here
     */
    
    private static final String QSAM2VSAM_STEP = "qsam2vsam";
    @Bean
    @JobScope
    public SortvsamQsam2vsamSort sortvsamQsam2vsamSort() {
    	return new SortvsamQsam2vsamSort();
    }
    
    @Bean
    @JobScope
    protected Step SortvsamQsam2vsamSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("SortvsamQsam2vsamSort",jobRepository).tasklet(sortvsamQsam2vsamSort(), transactionManager).build();  
    }
    
    @Bean
    public Step qsam2vsamDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("qsam2vsamDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(QSAM2VSAM_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(QSAM2VSAM_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(QSAM2VSAM_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(QSAM2VSAM_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *      SORT FIELDS=COPY                                                   
     */
    @Bean
    public Flow qsam2vsamExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("qsam2vsamExecutor")
             .start(qsam2vsamDecider(jobRepository, transactionManager))
             .from(qsam2vsamDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(SortvsamQsam2vsamSort(jobRepository, transactionManager))
             .from(qsam2vsamDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * QSAM2VSAM SORT Ends here 
     */
    
    /*
     * VSAM2QSAM SORT starts here
     */
    
    private static final String VSAM2QSAM_STEP = "vsam2qsam";
    @Bean
    @JobScope
    public SortvsamVsam2qsamSort sortvsamVsam2qsamSort() {
    	return new SortvsamVsam2qsamSort();
    }
    
    @Bean
    @JobScope
    protected Step SortvsamVsam2qsamSort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("SortvsamVsam2qsamSort",jobRepository).tasklet(sortvsamVsam2qsamSort(), transactionManager).build();  
    }
    
    @Bean
    public Step vsam2qsamDecider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("vsam2qsamDecider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(VSAM2QSAM_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(VSAM2QSAM_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(VSAM2QSAM_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(VSAM2QSAM_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *      SORT FIELDS=COPY                                                   
     */
    @Bean
    public Flow vsam2qsamExecutor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("vsam2qsamExecutor")
             .start(vsam2qsamDecider(jobRepository, transactionManager))
             .from(vsam2qsamDecider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(SortvsamVsam2qsamSort(jobRepository, transactionManager))
             .from(vsam2qsamDecider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * VSAM2QSAM SORT Ends here 
     */
    
    /*
     * IDCAMSOUT IDCAMS starts here
     */
    
    private static final String IDCAMSOUT_STEP = "idcamsout";
    
    @Bean
    public Step idcamsout(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(IDCAMSOUT_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(IDCAMSOUT_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		cfStepHandler.handleStepOverrides(IDCAMSOUT_STEP);
 		    	   		rc = copyUtil.performCopy(IDCAMSOUT_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(IDCAMSOUT_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(IDCAMSOUT_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * IDCAMSOUT IDCAMS Ends here 
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
