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
import com.cloudframe.app.sort.file.McgcmsSort023SortIn;
import com.cloudframe.app.sort.file.McgcmsSort023SortOut;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort023Detail;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.McgcmsSort023SortIn;
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
import com.cloudframe.app.sort.McgcmsSort023Detail;
import org.springframework.beans.factory.annotation.Value;
public class McgcmsSort023Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort023Sort.class);

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
	@Qualifier("batch_mcgcmssort023")
	McgcmsSort023Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort023SortOut")
	McgcmsSort023SortOut sortOut;
	


	
	@Autowired
	@Qualifier("McgcmsSort023SortIn")
	McgcmsSort023SortIn sortIn;
	
	
    int recordCount = 0;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_SRCPOS000 = 41;
	static final int OUTFIL_BUILD_POS000 = 0;
	static final int OUTFIL_BUILD_LEN000 = 11;
	static final int OUTFIL_BUILD_XSRCPOS000 = 0;
	static final int OUTFIL_BUILD_XPOS000 = 11;
	static final int OUTFIL_BUILD_XLEN000 = 1;
	static final int OUTFIL_BUILD_SRCPOS001 = 168;
	static final int OUTFIL_BUILD_POS001 = 12;
	static final int OUTFIL_BUILD_LEN001 = 3;
	static final int OUTFIL_BUILD_XSRCPOS001 = 0;
	static final int OUTFIL_BUILD_XPOS001 = 15;
	static final int OUTFIL_BUILD_XLEN001 = 1;
	static final int OUTFIL_BUILD_SRCPOS002 = 147;
	static final int OUTFIL_BUILD_POS002 = 16;
	static final int OUTFIL_BUILD_LEN002 = 20;
	static final int OUTFIL_BUILD_SRCPOS010 = 41;
	static final int OUTFIL_BUILD_POS010 = 0;
	static final int OUTFIL_BUILD_LEN010 = 11;
	static final int OUTFIL_BUILD_XSRCPOS010 = 0;
	static final int OUTFIL_BUILD_XPOS010 = 11;
	static final int OUTFIL_BUILD_XLEN010 = 1;
	static final int OUTFIL_BUILD_SRCPOS011 = 168;
	static final int OUTFIL_BUILD_POS011 = 12;
	static final int OUTFIL_BUILD_LEN011 = 3;
	static final int OUTFIL_BUILD_XSRCPOS011 = 0;
	static final int OUTFIL_BUILD_XPOS011 = 15;
	static final int OUTFIL_BUILD_XLEN011 = 1;
	static final int OUTFIL_BUILD_SRCPOS012 = 147;
	static final int OUTFIL_BUILD_POS012 = 16;
	static final int OUTFIL_BUILD_LEN012 = 20;


	final byte[] whenBytes000 = convertChar2EbcdicBytes("C".toCharArray());
	final byte[] fillBytes000 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	final byte[] fillBytes001 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	final byte[] fillBytes010 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	final byte[] fillBytes011 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	static final int OUTFIL_BUILD_REC_SIZE0 = 27;
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


		cfStepHandler.updateSortStepExecution("sort023");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MCGCMSSORT023 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
		if (Field.compareBytes(record,whenBytes000, 259, 0, 1, whenBytes000.length)  == 0) { 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS000, OUTFIL_BUILD_POS000, OUTFIL_BUILD_LEN000); 
                     copyRecordBytes(fillBytes000,buildRec, OUTFIL_BUILD_XSRCPOS000, OUTFIL_BUILD_XPOS000, OUTFIL_BUILD_XLEN000);
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS001, OUTFIL_BUILD_POS001, OUTFIL_BUILD_LEN001); 
                     copyRecordBytes(fillBytes001,buildRec, OUTFIL_BUILD_XSRCPOS001, OUTFIL_BUILD_XPOS001, OUTFIL_BUILD_XLEN001);
                    copyBuildArithmeticBytes01(record, buildRec, OUTFIL_BUILD_POS002);
       }else  { 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS010, OUTFIL_BUILD_POS010, OUTFIL_BUILD_LEN010); 
                     copyRecordBytes(fillBytes010,buildRec, OUTFIL_BUILD_XSRCPOS010, OUTFIL_BUILD_XPOS010, OUTFIL_BUILD_XLEN010);
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS011, OUTFIL_BUILD_POS011, OUTFIL_BUILD_LEN011); 
                     copyRecordBytes(fillBytes011,buildRec, OUTFIL_BUILD_XSRCPOS011, OUTFIL_BUILD_XPOS011, OUTFIL_BUILD_XLEN011);
                    copyBuildArithmeticBytes02(record, buildRec, OUTFIL_BUILD_POS012);
       }
         break;
		default:
			copyRecordBytes(record, buildRec, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, recSize);
			break;
		}
		return buildRec;
	}	


	 private void copyBuildArithmeticBytes01(byte[] record,byte[] recBytes,int outrecDesPos) {
          BigDecimal mulValue = BigDecimal.valueOf(1);
          BigDecimal big = mulZoneDecimalBytes(record , 147, 20 , mulValue);
        String decimalVal =  fillZeroFormatLength(big,11);
        byte[] copyArithmeticBytes = convertChar2EbcdicBytes(decimalVal.toCharArray());
        byte[] tempArray = new byte[decimalVal.length()];
        copyToRecordFormatBytes(copyArithmeticBytes, tempArray, 0 , 0,  decimalVal.length(),"ZD", "PD",true);
           copyRecordBytes(tempArray,recBytes, 0, outrecDesPos,decimalVal.length());
}
	 private void copyBuildArithmeticBytes02(byte[] record,byte[] recBytes,int outrecDesPos) {
          BigDecimal mulValue = BigDecimal.valueOf(-1);
          BigDecimal big = mulZoneDecimalBytes(record , 147, 20 , mulValue);
        String decimalVal =  fillZeroFormatLength(big,11);
        byte[] copyArithmeticBytes = convertChar2EbcdicBytes(decimalVal.toCharArray());
        byte[] tempArray = new byte[decimalVal.length()];
        copyToRecordFormatBytes(copyArithmeticBytes, tempArray, 0 , 0,  decimalVal.length(),"ZD", "PD",true);
           copyRecordBytes(tempArray,recBytes, 0, outrecDesPos,decimalVal.length());
}
}
