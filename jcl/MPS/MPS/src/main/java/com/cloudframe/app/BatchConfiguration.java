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
    
    private static final String JOBNAME = "MPS";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /** 
     *   Execute the Job that consists of 
     * MPS001 - SORT
     * STEP020 - SORT
     * MPS002 - SORT
     * MPS003 - SORT
     * MPS004 - SORT
     * MPS005 - SORT
     * MPS006 - SORT
     * STEP020_2 - SORT
     * STEP040 - SORT
     * 
     * @param jobRepository 
     * @param transactionManager 
     * @return 
     */ 
    @Bean 
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	    return new JobBuilder(JOBNAME, jobRepository)
			.start(mps001Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(step020Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(mps002Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(mps003Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(mps004Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(mps005Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(mps006Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(step020_2Executor(jobRepository, transactionManager)) /*  */

			// SORT Starts
			.next(step040Executor(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

    			.build();
    } 
    /*
     * MPS001 SORT starts here
     */
    
    private static final String MPS001_STEP = "mps001";
    @Bean
    @JobScope
    public MpsMps001InputReader mpsMps001InputReader() {
    	return new MpsMps001InputReader();
    }
    
    @Bean
    @JobScope
    public MpsMps001Processor mpsMps001Processor() {
    	return new MpsMps001Processor();
    }
    
    @Bean
    @JobScope
    public MpsMps001OutputWriter mpsMps001OutputWriter() {
    	return new MpsMps001OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsMps001SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsMps001SortInput",jobRepository).tasklet(mpsMps001InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsMps001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsMps001Process",jobRepository).tasklet(mpsMps001Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsMps001SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsMps001SortOutput",jobRepository).tasklet(mpsMps001OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step mps001Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mps001Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MPS001_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MPS001_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MPS001_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(MPS001_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY     
     * 
     *   OUTFIL REMOVECC, NODETAIL,        
     * 
     * TRAILER1=(COUNT=(M11,LENGTH=8))
     */
    @Bean
    public Flow mps001Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mps001Executor")
             .start(mps001Decider(jobRepository, transactionManager))
             .from(mps001Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsMps001SortInput(jobRepository, transactionManager))
             .next(processMpsMps001Sort(jobRepository, transactionManager))
             .next(writeMpsMps001SortOutput(jobRepository, transactionManager))
             .from(mps001Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MPS001 SORT Ends here 
     */
    
    /*
     * STEP020 SORT starts here
     */
    
    private static final String STEP020_STEP = "step020";
    @Bean
    @JobScope
    public MpsStep020InputReader mpsStep020InputReader() {
    	return new MpsStep020InputReader();
    }
    
    @Bean
    @JobScope
    public MpsStep020Processor mpsStep020Processor() {
    	return new MpsStep020Processor();
    }
    
    @Bean
    @JobScope
    public MpsStep020OutputWriter mpsStep020OutputWriter() {
    	return new MpsStep020OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsStep020SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsStep020SortInput",jobRepository).tasklet(mpsStep020InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsStep020Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsStep020Process",jobRepository).tasklet(mpsStep020Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsStep020SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsStep020SortOutput",jobRepository).tasklet(mpsStep020OutputWriter(), transactionManager).build();  
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
     * SORT FIELDS=COPY     
     * 
     * OUTFIL REMOVECC,NODETAIL,        
     * 
     * TRAILER1=(C'DSACONTROLSV1.0',16:COUNT=(ZD,LENGTH=6),235X)
     */
    @Bean
    public Flow step020Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step020Executor")
             .start(step020Decider(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsStep020SortInput(jobRepository, transactionManager))
             .next(processMpsStep020Sort(jobRepository, transactionManager))
             .next(writeMpsStep020SortOutput(jobRepository, transactionManager))
             .from(step020Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP020 SORT Ends here 
     */
    
    /*
     * MPS002 SORT starts here
     */
    
    private static final String MPS002_STEP = "mps002";
    @Bean
    @JobScope
    public MpsMps002InputReader mpsMps002InputReader() {
    	return new MpsMps002InputReader();
    }
    
    @Bean
    @JobScope
    public MpsMps002Processor mpsMps002Processor() {
    	return new MpsMps002Processor();
    }
    
    @Bean
    @JobScope
    public MpsMps002OutputWriter mpsMps002OutputWriter() {
    	return new MpsMps002OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsMps002SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsMps002SortInput",jobRepository).tasklet(mpsMps002InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsMps002Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsMps002Process",jobRepository).tasklet(mpsMps002Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsMps002SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsMps002SortOutput",jobRepository).tasklet(mpsMps002OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step mps002Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mps002Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MPS002_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MPS002_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MPS002_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(MPS002_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=(1,7,PD,A,11,3,CH,D),STOPAFT=20                                                              
     */
    @Bean
    public Flow mps002Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mps002Executor")
             .start(mps002Decider(jobRepository, transactionManager))
             .from(mps002Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsMps002SortInput(jobRepository, transactionManager))
             .next(processMpsMps002Sort(jobRepository, transactionManager))
             .next(writeMpsMps002SortOutput(jobRepository, transactionManager))
             .from(mps002Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MPS002 SORT Ends here 
     */
    
    /*
     * MPS003 SORT starts here
     */
    
    private static final String MPS003_STEP = "mps003";
    @Bean
    @JobScope
    public MpsMps003InputReader mpsMps003InputReader() {
    	return new MpsMps003InputReader();
    }
    
    @Bean
    @JobScope
    public MpsMps003Processor mpsMps003Processor() {
    	return new MpsMps003Processor();
    }
    
    @Bean
    @JobScope
    public MpsMps003OutputWriter mpsMps003OutputWriter() {
    	return new MpsMps003OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsMps003SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsMps003SortInput",jobRepository).tasklet(mpsMps003InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsMps003Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsMps003Process",jobRepository).tasklet(mpsMps003Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsMps003SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsMps003SortOutput",jobRepository).tasklet(mpsMps003OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step mps003Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mps003Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MPS003_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MPS003_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MPS003_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(MPS003_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * *REPLACE THE SMMS7010 SORT CARD FOR SRQ7737138 R2019Q3                  00010006
     *   SORT FIELDS=COPY                                                      00020004
     *   ALTSEQ CODE=(0437,052D,062E,072F,0816,0905,0A25,143C,153D,1632,       00030004
     *                 1726,1A3F,1B27,2040,215A,227F,237B,245B,256C,2650,      00040004
     *                 277D,284D,295D,2A5C,2B4E,2C6B,2D60,2E4B,2F61,30F0,      00050004
     *                 31F1,32F2,33F3,34F4,35F5,36F6,37F7,38F8,39F9,3A7A,      00060004
     *                 3B5E,3C4C,3D7E,3E6E,3F6F,407C,41C1,42C2,43C3,44C4,      00070004
     *                 45C5,46C6,47C7,48C8,49C9,4AD1,4BD2,4CD3,4DD4,4ED5,      00080004
     *                 4FD6,50D7,51D8,52D9,53E2,54E3,55E4,56E5,57E6,58E7,      00090004
     *                 59E8,5AE9,5B4A,5CE0,5D5A,5EB0,5F6D,6079,6181,6282,      00100004
     *                 6383,6484,6585,6686,6787,6888,6989,6A91,6B92,6C93,      00110004
     *                 6D94,6E95,6F96,7097,7198,7299,73A2,74A3,75A4,76A5,      00120004
     *                 77A6,78A7,79A8,7AA9,7BC0,7C4F,7DD0,7EA1,7F07,8020,      00130004
     *                 8121,8222,8323,8424,8515,8606,8717,8828,8929,8A2A,      00140004
     *                 8B2B,8C2C,8D09,8E0A,8F1B,9030,9131,921A,9333,9434,      00150004
     *                 9535,9636,9708,9838,9939,9A3A,9B3B,9C04,9D14,9E3E,      00160004
     *                 9FE1,A041,A142,A243,A344,A445,A546,A647,A748,A849,      00170004
     *                 A951,AA52,AB53,AC54,AD55,AE56,AF57,B058,B159,B262,      00180004
     *                 B363,B464,B565,B666,B767,B868,B969,BA70,BB71,BC72,      00190004
     *                 BD73,BE74,BF75,C076,C177,C278,C380,C48A,C58B,C68C,      00200004
     *                 C78D,C88E,C98F,CA90,CB9A,CC9B,CD9C,CE9D,CF9E,D09F,      00210004
     *                 D1A0,D2AA,D3AB,D4AC,D5AD,D6AE,D7AF,D8B0,D9B1,DAB2,      00220004
     *                 DBB3,DCB4,DDB5,DEB6,DFB7,E0B8,E1B9,E2BA,E3BB,E4BC,      00230004
     *                 E5BD,E6BE,E7BF,E8CA,E9CB,EACC,EBCD,ECCE,EDCF,EEDA,      00240004
     *                 EFDB,F0DC,F1DD,F2DE,F3DF,F4EA,F5EB,F6EC,F7ED,F8EE,      00250004
     *                 F9EF)                                                   00260004
     *    OUTFIL FILES=01,                                                     00270004
     *         IFTHEN=(WHEN=(1,2,CH,EQ,X'3031',OR,1,2,CH,EQ,X'3032',           00280004
     *                       OR,1,2,CH,EQ,X'3430'),                            00290004
     *             BUILD=(1,2,TRAN=ALTSEQ,                                     00300004
     *                    3,12,                                                00310004
     *                    15,4723,TRAN=ALTSEQ,                                 00320004
     *                    4738,255,                                            00330004
     *                    4993,03,TRAN=ALTSEQ,                                 00340004
     *                    4996,255,                                            00350004
     *                    5251,7038,TRAN=ALTSEQ)),                             00360004
     *         IFTHEN=(WHEN=(1,2,CH,EQ,X'3030',OR,1,2,CH,EQ,X'3939'),          00370004
     *             BUILD=(1,12288,TRAN=ALTSEQ)),                               00380004
     *         IFTHEN=(WHEN=(1,2,CH,NE,X'3031',AND,1,2,CH,NE,X'3032',          00390004
     *                   AND,1,2,CH,NE,X'3430',AND,1,2,CH,NE,X'3030',          00400004
     *                   AND,1,2,CH,NE,X'3939'),                               00410004
     *             BUILD=(1,2,TRAN=ALTSEQ,                                     00420004
     *                    3,12,                                                00430004
     *                    15,12274,TRAN=ALTSEQ)),                              00440004
     *              OMIT=(1,2,CH,EQ,X'4040',OR,1,2,CH,EQ,X'2020')              00450004
     */
    @Bean
    public Flow mps003Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mps003Executor")
             .start(mps003Decider(jobRepository, transactionManager))
             .from(mps003Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsMps003SortInput(jobRepository, transactionManager))
             .next(processMpsMps003Sort(jobRepository, transactionManager))
             .next(writeMpsMps003SortOutput(jobRepository, transactionManager))
             .from(mps003Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MPS003 SORT Ends here 
     */
    
    /*
     * MPS004 SORT starts here
     */
    
    private static final String MPS004_STEP = "mps004";
    @Bean
    @JobScope
    public MpsMps004InputReader mpsMps004InputReader() {
    	return new MpsMps004InputReader();
    }
    
    @Bean
    @JobScope
    public MpsMps004Processor mpsMps004Processor() {
    	return new MpsMps004Processor();
    }
    
    @Bean
    @JobScope
    public MpsMps004OutputWriter mpsMps004OutputWriter() {
    	return new MpsMps004OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsMps004SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsMps004SortInput",jobRepository).tasklet(mpsMps004InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsMps004Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsMps004Process",jobRepository).tasklet(mpsMps004Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsMps004SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsMps004SortOutput",jobRepository).tasklet(mpsMps004OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step mps004Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mps004Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MPS004_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MPS004_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MPS004_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(MPS004_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY
     * OUTFIL FILES=01,OMIT=(05,02,CH,EQ,C'02')
     * OUTFIL FILES=02,INCLUDE=(05,02,CH,EQ,C'02')
     * OUTFIL FILES=03,
     * OMIT=((05,02,CH,EQ,C'01',AND,       
     *         640,01,CH,EQ,C'6',AND,       
     *        1152,10,ZD,EQ,0),OR,         
     *         (05,02,CH,EQ,C'00')),        
     * OUTREC=(07,06,13,09,66,19,3100,4),CONVERT
     */
    @Bean
    public Flow mps004Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mps004Executor")
             .start(mps004Decider(jobRepository, transactionManager))
             .from(mps004Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsMps004SortInput(jobRepository, transactionManager))
             .next(processMpsMps004Sort(jobRepository, transactionManager))
             .next(writeMpsMps004SortOutput(jobRepository, transactionManager))
             .from(mps004Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MPS004 SORT Ends here 
     */
    
    /*
     * MPS005 SORT starts here
     */
    
    private static final String MPS005_STEP = "mps005";
    @Bean
    @JobScope
    public MpsMps005InputReader mpsMps005InputReader() {
    	return new MpsMps005InputReader();
    }
    
    @Bean
    @JobScope
    public MpsMps005Processor mpsMps005Processor() {
    	return new MpsMps005Processor();
    }
    
    @Bean
    @JobScope
    public MpsMps005OutputWriter mpsMps005OutputWriter() {
    	return new MpsMps005OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsMps005SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsMps005SortInput",jobRepository).tasklet(mpsMps005InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsMps005Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsMps005Process",jobRepository).tasklet(mpsMps005Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsMps005SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsMps005SortOutput",jobRepository).tasklet(mpsMps005OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step mps005Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mps005Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MPS005_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MPS005_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MPS005_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(MPS005_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY
     *   OUTFIL FILES=01,
     *    IFTRAIL=(HD=YES,TRLID=(1,2,CH,EQ,C'99'),
     *     TRLUPD=(41:COUNT=(M11,LENGTH=12)))
     *   OUTFIL FILES=02,INCLUDE=((1,2,CH,EQ,C'01',AND,
     *                            810,3,CH,EQ,C'356'),OR,
     *                           (1,2,CH,EQ,C'01',AND,
     *                            858,3,CH,EQ,C'356',AND,
     *                            1203,3,CH,EQ,C'IND'),OR,
     *                           (1,2,CH,EQ,C'02',AND,
     *                            35,4,CH,EQ,C'0400',AND,
     *                            807,3,CH,EQ,C'IND',AND,
     *                            1094,3,CH,EQ,C'356'),OR,
     *                           (1,2,CH,EQ,C'02',AND,
     *                            35,4,CH,EQ,C'0420',AND,
     *                            890,3,CH,EQ,C'356')),
     *    IFTRAIL=(HD=YES,TRLID=(1,2,CH,EQ,C'99'),
     *     TRLUPD=(41:COUNT=(M11,LENGTH=12)))
     */
    @Bean
    public Flow mps005Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mps005Executor")
             .start(mps005Decider(jobRepository, transactionManager))
             .from(mps005Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsMps005SortInput(jobRepository, transactionManager))
             .next(processMpsMps005Sort(jobRepository, transactionManager))
             .next(writeMpsMps005SortOutput(jobRepository, transactionManager))
             .from(mps005Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MPS005 SORT Ends here 
     */
    
    /*
     * MPS006 SORT starts here
     */
    
    private static final String MPS006_STEP = "mps006";
    @Bean
    @JobScope
    public MpsMps006InputReader mpsMps006InputReader() {
    	return new MpsMps006InputReader();
    }
    
    @Bean
    @JobScope
    public MpsMps006Processor mpsMps006Processor() {
    	return new MpsMps006Processor();
    }
    
    @Bean
    @JobScope
    public MpsMps006OutputWriter mpsMps006OutputWriter() {
    	return new MpsMps006OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsMps006SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsMps006SortInput",jobRepository).tasklet(mpsMps006InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsMps006Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsMps006Process",jobRepository).tasklet(mpsMps006Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsMps006SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsMps006SortOutput",jobRepository).tasklet(mpsMps006OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step mps006Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("mps006Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(MPS006_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(MPS006_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(MPS006_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(MPS006_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     * SORT FIELDS=COPY
     *   OUTFIL FILES=01,INCLUDE=(1,2,CH,EQ,C'00'),ACCEPT=1
     *   OUTFIL FILES=02,INCLUDE=(1,2,CH,EQ,C'99'),ACCEPT=1
     *   OUTFIL FILES=03,OMIT=(1,2,CH,EQ,C'00',OR,1,2,CH,EQ,C'99')
     */
    @Bean
    public Flow mps006Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("mps006Executor")
             .start(mps006Decider(jobRepository, transactionManager))
             .from(mps006Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsMps006SortInput(jobRepository, transactionManager))
             .next(processMpsMps006Sort(jobRepository, transactionManager))
             .next(writeMpsMps006SortOutput(jobRepository, transactionManager))
             .from(mps006Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * MPS006 SORT Ends here 
     */
    
    /*
     * STEP020_2 SORT starts here
     */
    
    private static final String STEP020_2_STEP = "step020_2";
    @Bean
    @JobScope
    public MpsStep020_2InputReader mpsStep020_2InputReader() {
    	return new MpsStep020_2InputReader();
    }
    
    @Bean
    @JobScope
    public MpsStep020_2Processor mpsStep020_2Processor() {
    	return new MpsStep020_2Processor();
    }
    
    @Bean
    @JobScope
    public MpsStep020_2OutputWriter mpsStep020_2OutputWriter() {
    	return new MpsStep020_2OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsStep020_2SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsStep020_2SortInput",jobRepository).tasklet(mpsStep020_2InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsStep020_2Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsStep020_2Process",jobRepository).tasklet(mpsStep020_2Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsStep020_2SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsStep020_2SortOutput",jobRepository).tasklet(mpsStep020_2OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step020_2Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step020_2Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP020_2_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP020_2_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP020_2_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP020_2_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *   OPTION COPY                                                                   
     *   OUTFIL REMOVECC,NODETAIL,                                                     
     *   TRAILER1=(C'DSACONTROLSV1.0',16:COUNT=(ZD,LENGTH=6),235X)                     
     */
    @Bean
    public Flow step020_2Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step020_2Executor")
             .start(step020_2Decider(jobRepository, transactionManager))
             .from(step020_2Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsStep020_2SortInput(jobRepository, transactionManager))
             .next(processMpsStep020_2Sort(jobRepository, transactionManager))
             .next(writeMpsStep020_2SortOutput(jobRepository, transactionManager))
             .from(step020_2Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP020_2 SORT Ends here 
     */
    
    /*
     * STEP040 SORT starts here
     */
    
    private static final String STEP040_STEP = "step040";
    @Bean
    @JobScope
    public MpsStep040InputReader mpsStep040InputReader() {
    	return new MpsStep040InputReader();
    }
    
    @Bean
    @JobScope
    public MpsStep040Processor mpsStep040Processor() {
    	return new MpsStep040Processor();
    }
    
    @Bean
    @JobScope
    public MpsStep040OutputWriter mpsStep040OutputWriter() {
    	return new MpsStep040OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readMpsStep040SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readMpsStep040SortInput",jobRepository).tasklet(mpsStep040InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processMpsStep040Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortMpsStep040Process",jobRepository).tasklet(mpsStep040Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeMpsStep040SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeMpsStep040SortOutput",jobRepository).tasklet(mpsStep040OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step040Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step040Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP040_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP040_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP040_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP040_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
  /*  
     * Member Info:
     *  SORT FIELDS=COPY                                                               
     */
    @Bean
    public Flow step040Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step040Executor")
             .start(step040Decider(jobRepository, transactionManager))
             .from(step040Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readMpsStep040SortInput(jobRepository, transactionManager))
             .next(processMpsStep040Sort(jobRepository, transactionManager))
             .next(writeMpsStep040SortOutput(jobRepository, transactionManager))
             .from(step040Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP040 SORT Ends here 
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
