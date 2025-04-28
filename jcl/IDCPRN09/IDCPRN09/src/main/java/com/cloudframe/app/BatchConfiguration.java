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
    
    private static final String JOBNAME = "IDCPRN09";
    
    /* Driver Programs used in steps */  
   private static final String IDCAMS = "IDCAMS";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    
    /** 
     *   Execute the Job that consists of 
     * DEFCL - IDCAMS
     * VSAMINIT - IDCAMS
     * PRINT01 - IDCAMS
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
      GlobalExecutorCtx.load(BatchConfiguration.class, context);
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(defcl(jobRepository, transactionManager))
			.next(vsaminit(jobRepository, transactionManager)) /*  */

			.next(print01(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 

    			.build();
    } 
    /*
     * DEFCL IDCAMS starts here
     */
    
    private static final String DEFCL_STEP = "defcl";
    
    @Bean
    public Step defcl(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(DEFCL_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(DEFCL_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = CFVsam.deleteCluster("CLOUDFRM_IDCAMS_PRINT_VSAMKSDS.json"/*Cluster json*/);
 		    	   		rc = CFVsam.createCluster("CLOUDFRM_IDCAMS_PRINT_VSAMKSDS.json"/*Cluster json*/);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(DEFCL_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(DEFCL_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * DEFCL IDCAMS Ends here 
     */
    
    /*
     * VSAMINIT IDCAMS starts here
     */
    
    private static final String VSAMINIT_STEP = "vsaminit";
    
    @Bean
    public Step vsaminit(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(VSAMINIT_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(VSAMINIT_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		cfStepHandler.handleStepOverrides(VSAMINIT_STEP);
 		    	   		rc = copyUtil.performCopy(VSAMINIT_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(VSAMINIT_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(VSAMINIT_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * VSAMINIT IDCAMS Ends here 
     */
    
    /*
     * PRINT01 IDCAMS starts here
     */
    
    private static final String PRINT01_STEP = "print01";
    
    @Bean
    public Step print01(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(PRINT01_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(PRINT01_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		cfStepHandler.handleStepOverrides(PRINT01_STEP);
 		    	   		rc = copyUtil.performCopy(PRINT01_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(PRINT01_STEP, rc ,IDCAMS);
                      } 
    			   cfStepHandler.updateStepExecution(PRINT01_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * PRINT01 IDCAMS Ends here 
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
