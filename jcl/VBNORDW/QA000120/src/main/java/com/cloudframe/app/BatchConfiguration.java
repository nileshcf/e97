package com.cloudframe.app;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.batch.core.configuration.annotation.JobScope;
import com.cloudframe.app.process.Iovb32k;
import java.util.Map;
import com.cloudframe.app.process.Iovb32k;
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
    
    private static final String JOBNAME = "QA000120";
    
    /* Driver Programs used in steps */  
    private static final String IOVB32K_BEAN = "iovb32k";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    
    /** 
     *   Execute the Job that consists of 
     * DELETE - IEFBR14
     * WRITEVB - IOVB32K
     * READVB - IOVB32K
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(delete(jobRepository, transactionManager))
			.next(writevb(jobRepository, transactionManager)) /*  */

			.next(readvb(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 

    			.build();
    } 
    /*
     * DELETE IEFBR14 starts here
     */
    
    private static final String DELETE_STEP = "delete";
    
    @Bean
    public Step delete(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(DELETE_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(DELETE_STEP)) {
 	 					int rc = 0; // IEFBR14 PROGRAM 
                      try {
 		    	   		cfStepHandler.handleStepOverrides(DELETE_STEP);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(DELETE_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(DELETE_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * DELETE IEFBR14 Ends here 
     */
    
    /*
     * WRITEVB IOVB32K starts here
     */
    
    private static final String WRITEVB_STEP = "writevb";
    
    
    @Value("${WRITEVB.IOVB32K.inputValue:'W,32700,32750'}")
    private String writevbIovb32kParm ;
    
    @Bean
    public Step writevb(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(WRITEVB_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(WRITEVB_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Iovb32k)cfStepHandler.initAndGetProcessBean(WRITEVB_STEP,IOVB32K_BEAN)).setParameter( cfStepHandler.getParm(writevbIovb32kParm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(WRITEVB_STEP, rc ,IOVB32K_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(WRITEVB_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * WRITEVB IOVB32K Ends here 
     */
    
    /*
     * READVB IOVB32K starts here
     */
    
    private static final String READVB_STEP = "readvb";
    
    
    @Value("${READVB.IOVB32K.inputValue:'R,32700,32750'}")
    private String readvbIovb32kParm ;
    
    @Bean
    public Step readvb(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(READVB_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(READVB_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Iovb32k)cfStepHandler.initAndGetProcessBean(READVB_STEP,IOVB32K_BEAN)).setParameter( cfStepHandler.getParm(readvbIovb32kParm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(READVB_STEP, rc ,IOVB32K_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(READVB_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * READVB IOVB32K Ends here 
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
