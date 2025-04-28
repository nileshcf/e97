package com.cloudframe.app;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.utility.SqlUtil;
import java.util.Map;
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
    SqlUtil sqlUtil;
    
    private static final String JOBNAME = "DSNUTILB1";
    
    /* Driver Programs used in steps */  
    private static final String DSNTEP2_BEAN = "dsntep2";
    private static final String DSNUTILB_BEAN = "dsnutilb";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    
    /** 
     *   Execute the Job that consists of 
     * STEP010 - DSNTEP2
     * CLP_DSNUPROC - DSNUTILB
     * STEP011 - DSNTEP2
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(step010(jobRepository, transactionManager))
			.next(clp_dsnuproc(jobRepository, transactionManager)) /*  */

			.next(step011(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 

    			.build();
    } 
    /*
     * STEP010 DSNTEP2 starts here
     */
    
    private static final String STEP010_STEP = "step010";
    
    @Bean
    public Step step010(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP010_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP010_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = sqlUtil.execute(STEP010_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP010_STEP, rc ,DSNTEP2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP010_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP010 DSNTEP2 Ends here 
     */
    
    /*
     * CLP_DSNUPROC DSNUTILB starts here
     */
    
    private static final String CLP_DSNUPROC_STEP = "clp_dsnuproc";
    
    
    @Value("${CLP_DSNUPROC.DSNUTILB.inputValue:'DBCG,CF,'}")
    private String clp_dsnuprocDsnutilbParm ;
    
    @Bean
    public Step clp_dsnuproc(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(CLP_DSNUPROC_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(CLP_DSNUPROC_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = sqlUtil.execute(CLP_DSNUPROC_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(CLP_DSNUPROC_STEP, rc ,DSNUTILB_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(CLP_DSNUPROC_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * CLP_DSNUPROC DSNUTILB Ends here 
     */
    
    /*
     * STEP011 DSNTEP2 starts here
     */
    
    private static final String STEP011_STEP = "step011";
    
    @Bean
    public Step step011(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP011_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP011_STEP)) {
 		    	   		int rc =0;
                  try {
 		    	   		rc = sqlUtil.execute(STEP011_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP011_STEP, rc ,DSNTEP2_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP011_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP011 DSNTEP2 Ends here 
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
