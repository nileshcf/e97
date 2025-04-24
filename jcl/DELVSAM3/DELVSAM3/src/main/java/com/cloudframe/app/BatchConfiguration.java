package com.cloudframe.app;
 
import com.cloudframe.app.utility.CopyUtil;
import org.springframework.batch.core.configuration.annotation.JobScope;
import java.util.Map;
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
    CopyUtil copyUtil;
    
    private static final String JOBNAME = "DELVSAM3";
    
    /* Driver Programs used in steps */  
   private static final String IDCAMS = "IDCAMS";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    
    /** 
     *   Execute the Job that consists of 
     * DELVSAM - IDCAMS
     * DEFVSAM - IDCAMS
     * REPVSAM - IDCAMS
     * VSAMOUT - IDCAMS
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(delvsam(jobRepository, transactionManager))
			.next(defvsam(jobRepository, transactionManager)) /*  */

			.next(repvsam(jobRepository, transactionManager)) /*  */

			.next(vsamout(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 

    			.build();
    } 
    /*
     * DELVSAM IDCAMS starts here
     */
    
    private static final String DELVSAM_STEP = "delvsam";
    
    @Bean
    public Step delvsam(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(DELVSAM_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(DELVSAM_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = CFVsam.deleteCluster("CLOUDFRM_IDCAMS_PRINT_VSAMKSDS.json"/*Cluster json*/);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(DELVSAM_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(DELVSAM_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * DELVSAM IDCAMS Ends here 
     */
    
    /*
     * DEFVSAM IDCAMS starts here
     */
    
    private static final String DEFVSAM_STEP = "defvsam";
    
    @Bean
    public Step defvsam(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(DEFVSAM_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(DEFVSAM_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = CFVsam.createCluster("CLOUDFRM_IDCAMS_PRINT_VSAMKSDS.json"/*Cluster json*/);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(DEFVSAM_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(DEFVSAM_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * DEFVSAM IDCAMS Ends here 
     */
    
    /*
     * REPVSAM IDCAMS starts here
     */
    
    private static final String REPVSAM_STEP = "repvsam";
    
    @Bean
    public Step repvsam(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(REPVSAM_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(REPVSAM_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		cfStepHandler.handleStepOverrides(REPVSAM_STEP);
 		    	   		rc = copyUtil.performCopy(REPVSAM_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(REPVSAM_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(REPVSAM_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * REPVSAM IDCAMS Ends here 
     */
    
    /*
     * VSAMOUT IDCAMS starts here
     */
    
    private static final String VSAMOUT_STEP = "vsamout";
    
    @Bean
    public Step vsamout(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(VSAMOUT_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(VSAMOUT_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		cfStepHandler.handleStepOverrides(VSAMOUT_STEP);
 		    	   		rc = copyUtil.performCopy(VSAMOUT_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(VSAMOUT_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(VSAMOUT_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * VSAMOUT IDCAMS Ends here 
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
