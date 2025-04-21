package com.cloudframe.app.tasks;
import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.InitializingBean;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.sort.file.UsbrecdatDate1inSortIn;
import com.cloudframe.app.sort.file.UsbrecdatDate1inSortOut;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.UsbrecdatDate1inDetail;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.UsbrecdatDate1inSortIn;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;

import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.UsbrecdatDate1inDetail;
import org.springframework.beans.factory.annotation.Value;
public class UsbrecdatDate1inSort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(UsbrecdatDate1inSort.class);

/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
	final int INREC_POS1=0;
	final int INREC_POS2=0;
	final int INREC_POS3=28;
	final int INREC_POS4=24;
	final int INREC_POS5=0;
	final int INREC_POS6=0;
	final int INREC_LEN1=33;
	final int INREC_LEN2=6;
	final int INREC_LEN3=4;
	final int INREC_LEN4=4;
	final int INREC_LEN5=2;
	final int INREC_LEN6=23;
	final int INREC_DES_POS1=0;
	final int INREC_DES_POS2=33;
	final int INREC_DES_POS3=39;
	final int INREC_DES_POS4=43;
	final int INREC_DES_POS5=47;
	final int INREC_DES_POS6=57;
    final byte[] fillBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(6));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    byte[] dateTimeBytes2 = convertChar2EbcdicBytes(getCustomDateFormatValue("&DATE1","-5"));
    final byte[] fillBytes3 = convertChar2EbcdicBytes(CFUtil.fillSpaces(23));
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_usbrecdatdate1in")
	UsbrecdatDate1inDetail sortDetail;
	
	@Autowired
	@Qualifier("UsbrecdatDate1inSortOut")
	UsbrecdatDate1inSortOut sortOut;
	


	
	@Autowired
	@Qualifier("UsbrecdatDate1inSortIn")
	UsbrecdatDate1inSortIn sortIn;
	
	
    int recordCount = 0;



    private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		useTempFile = sortDetail.useTempFile(true); 
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
	    useSortTempFile(sortDetail.getTempFileVal());
		sortOut.open("w", filePath + sortOut.getFileName(), sortOut.getRecordLen(), sortOut.isFBRec());  
		if (isWriteInTempFile()) {
            this.setRaFile(sortDetail.getRaFile());
            this.setTmpFile(sortDetail.getTempFile());
            this.setExecutorService(sortDetail.getExecutorService());
		} else {
		    createRandomAccessFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		// FileOut write process begin, Extract sorted record and write it to the output file
          byte[] record = sortIn.readRecord();
          while (!sortIn.hasEnded() && record != null) {
           byte[] outRecBytes = record;


		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("date1in");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: USBRECDATDATE1IN Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

		if(isWriteInTempFile()) {
			stopExecutorServ();
		}
		removeTempFile();
		logger.debug("Sort Writer ended.");
		SpringContextHandler.handleDispPostionAtStepEnd(true);
		return ExitStatus.COMPLETED;
	}



    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }
	  
	  
	  
	  



    private byte[] getInrecRecord(byte[] record) {  
	    byte[] recBytes = new byte[80];	 	
	    copyRecordBytes(record, recBytes, INREC_POS1, INREC_DES_POS1,INREC_LEN1);
             copyRecordBytes(fillBytes,recBytes,INREC_POS2,INREC_DES_POS2,INREC_LEN2);
copyRecordBytes(record, recBytes, INREC_POS3, INREC_DES_POS3,INREC_LEN3);
copyRecordBytes(record, recBytes, INREC_POS4, INREC_DES_POS4,INREC_LEN4);
             copyRecordBytes(fillBytes1,recBytes,INREC_POS5,INREC_DES_POS5,INREC_LEN5);
copyRecordBytes(dateTimeBytes2, recBytes, 0, 49,8);
             copyRecordBytes(fillBytes3,recBytes,INREC_POS6,INREC_DES_POS6,INREC_LEN6);
	
	    return recBytes;
  	}




}
