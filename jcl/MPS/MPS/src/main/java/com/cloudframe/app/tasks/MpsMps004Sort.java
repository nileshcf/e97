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
import com.cloudframe.app.sort.file.MpsMps004SortIn;
import com.cloudframe.app.sort.file.MpsMps004SortOut0;
import com.cloudframe.app.sort.file.MpsMps004SortOut1;
import com.cloudframe.app.sort.file.MpsMps004SortOut2;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.MpsMps004Detail;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.MpsMps004SortIn;
import com.cloudframe.app.sort.file.MpsMps004SortOut0;
import com.cloudframe.app.sort.file.MpsMps004SortOut1;
import com.cloudframe.app.sort.file.MpsMps004SortOut2;
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
import com.cloudframe.app.sort.MpsMps004Detail;
import org.springframework.beans.factory.annotation.Value;
public class MpsMps004Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(MpsMps004Sort.class);

/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    private String useTempFile="yes";

    int recCounter = 0;
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mpsmps004")
	MpsMps004Detail sortDetail;
	
	@Autowired
	@Qualifier("MpsMps004SortOut0")
	MpsMps004SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("MpsMps004SortOut1")
	MpsMps004SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("MpsMps004SortOut2")
	MpsMps004SortOut2 sortOut2;
	


	
	@Autowired
	@Qualifier("MpsMps004SortIn")
	MpsMps004SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
    int recordCount2 = 0;


    static final int OUTREC_SIZE = 38;    
	int recordLen = 0;
	


    static final int OUTREC_SIZE0 = 0;
    static final int OUTREC_SIZE1 = 0;
    final byte[] fillSpace2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE2));
    static final int OUTREC_SIZE2 = 38;


	byte[] cond01 = convertChar2EbcdicBytes("02".toCharArray());
	byte[] cond11 = convertChar2EbcdicBytes("02".toCharArray());
	byte[] cond21 = convertChar2EbcdicBytes("01".toCharArray());
	byte[] cond22 = convertChar2EbcdicBytes("6".toCharArray());
	byte[] cond23 = convertChar2EbcdicBytes("0".toCharArray());
	byte[] cond24 = convertChar2EbcdicBytes("00".toCharArray());
	static final int OUTREC_POS1=2;
	static final int OUTREC_POS2=8;
	static final int OUTREC_POS3=61;
	static final int OUTREC_POS4=3095;
	static final int OUTREC_LEN1=6;
	static final int OUTREC_LEN2=9;
	static final int OUTREC_LEN3=19;
	static final int OUTREC_LEN4=4;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=6;
	static final int OUTREC_DES_POS3=15;
	static final int OUTREC_DES_POS4=34;
    private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
	    useSortTempFile(sortDetail.getTempFileVal());
		sortOut0.open("w", filePath + sortOut0.getFileName(), sortOut0.getRecordLen(), sortOut0.isFBRec());  
		sortOut1.open("w", filePath + sortOut1.getFileName(), sortOut1.getRecordLen(), sortOut1.isFBRec());  
		sortOut2.open("w", filePath + sortOut2.getFileName(), sortOut2.getRecordLen(), sortOut2.isFBRec());  
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


		  if (!((Field.compareBytes(outRecBytes,cond01,0,0,2,2) == 0))){
                   
		    //write into sortOut0 file
		 	sortOut0.setRecord(getOutRecord(outRecBytes,0), sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,cond11,0,0,2,2) == 0)) {
                   
		    //write into sortOut1 file
		 	sortOut1.setRecord(getOutRecord(outRecBytes,1), sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
		  if (!(((Field.compareBytes(outRecBytes,cond21,0,0,2,2) == 0) && (Field.compareBytes(outRecBytes,cond22,635,0,1,1) == 0) && (Field.compareBytes(outRecBytes,cond23,1147,0,10,1) == 0)) || ((Field.compareBytes(outRecBytes,cond24,0,0,2,2) == 0)))){
                   
		    //write into sortOut2 file
		 	sortOut2.setRecord(getOutRecord(outRecBytes,2), sortOut2.getRecordLen());
		 	
			sortOut2.write(); recordCount2++;
		  }	
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("mps004");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MPSMPS004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MPSMPS004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MPSMPS004 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
         sortOut2.close();
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
	private byte[] getOutRecord(byte[] record,int fileIndx) {
	    recordLen = record.length;
		byte[] recBytes = new byte[recordLen];
					switch(fileIndx) {
	case 0:
     /* No fields available for copy, return recevied record */ 
     recBytes = record; 
			break;
	case 1:
     /* No fields available for copy, return recevied record */ 
     recBytes = record; 
			break;
	case 2:
     	recBytes = new byte[OUTREC_SIZE2];
     	copyRecordBytes(fillSpace2, recBytes, 0, 0, OUTREC_SIZE2);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
copyRecordBytes(record, recBytes, OUTREC_POS2, OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
copyRecordBytes(record, recBytes, OUTREC_POS4, OUTREC_DES_POS4,OUTREC_LEN4);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	  
	  
	  







}
