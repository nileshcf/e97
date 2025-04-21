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
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.TranSort004SortIn;
import com.cloudframe.app.sort.file.TranSort004SortOut;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.TranSort004Detail;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.TranSort004SortIn;
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
import com.cloudframe.app.sort.TranSort004Detail;
import org.springframework.beans.factory.annotation.Value;
public class TranSort004Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(TranSort004Sort.class);

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
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_transort004")
	TranSort004Detail sortDetail;
	
	@Autowired
	@Qualifier("TranSort004SortOut")
	TranSort004SortOut sortOut;
	


	
	@Autowired
	@Qualifier("TranSort004SortIn")
	TranSort004SortIn sortIn;
	
	
    int recordCount = 0;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_SRCPOS000 = 0;
	static final int OUTFIL_BUILD_POS000 = 0;
	static final int OUTFIL_BUILD_LEN000 = 20;
	static final int OUTFIL_BUILD_SRCPOS001 = 20;
	static final int OUTFIL_BUILD_POS001 = 20;
	static final int OUTFIL_BUILD_LEN001 = 15;
	static final int OUTFIL_BUILD_SRCPOS002 = 35;
	static final int OUTFIL_BUILD_POS002 = 35;
	static final int OUTFIL_BUILD_LEN002 = 15;


	final byte[] whenBytes000 = convertChar2EbcdicBytes("A".toCharArray());
	static final int OUTFIL_BUILD_REC_SIZE0 = 50;
    private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
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


		  
		  
          byte[] buildRec = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTFIL_BUILD_REC_SIZE0));
			byte[] buildBytes = buildOutRecIfThenBytes(outRecBytes,0, buildRec, OUTFIL_BUILD_REC_SIZE0);
		    //write into sortOut file
			sortOut.setRecord(buildBytes, sortOut.getRecordLen());
			sortOut.write(); recordCount++;
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("sort004");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: TRANSORT004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
	  
	  
	  
	  







	private byte[] buildOutRecIfThenBytes(byte[] record, int num, byte[] buildRec, int recSize) {
		switch(num){
		case 0:
		if (Field.compareBytes(record,whenBytes000, 0, 0, 1, whenBytes000.length)  == 0) { 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS000, OUTFIL_BUILD_POS000, OUTFIL_BUILD_LEN000); 
                     copyTranslateEbcdic2Ascii(record, buildRec, OUTFIL_BUILD_SRCPOS001, OUTFIL_BUILD_POS001, OUTFIL_BUILD_LEN001); 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS002, OUTFIL_BUILD_POS002, OUTFIL_BUILD_LEN002); 
      }else { copyRecordBytes(record, buildRec, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, recSize);  }
         break;
		default:
			copyRecordBytes(record, buildRec, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, recSize);
			break;
		}
		return buildRec;
	}	

}
