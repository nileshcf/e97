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
import com.cloudframe.app.sort.file.McgcmsSort002SortIn;
import com.cloudframe.app.sort.file.McgcmsSort002SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort002SortOut1;
import com.cloudframe.app.sort.file.McgcmsSort002SortOut2;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort002Detail;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.McgcmsSort002SortIn;
import com.cloudframe.app.sort.file.McgcmsSort002SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort002SortOut1;
import com.cloudframe.app.sort.file.McgcmsSort002SortOut2;
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
import com.cloudframe.app.sort.McgcmsSort002Detail;
import org.springframework.beans.factory.annotation.Value;
public class McgcmsSort002Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort002Sort.class);

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
	@Qualifier("batch_mcgcmssort002")
	McgcmsSort002Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort002SortOut0")
	McgcmsSort002SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort002SortOut1")
	McgcmsSort002SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("McgcmsSort002SortOut2")
	McgcmsSort002SortOut2 sortOut2;
	


	
	@Autowired
	@Qualifier("McgcmsSort002SortIn")
	McgcmsSort002SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
    int recordCount2 = 0;


    static final int OUTREC_SIZE = 164;    
	int recordLen = 0;
	

	byte[] repBytes = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes1 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes2 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes3 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes4 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes5 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes6 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes7 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes8 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes9 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes10 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes11 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes12 = convertChar2EbcdicBytes(";".toCharArray());
	byte[] repBytes13 = convertChar2EbcdicBytes(";".toCharArray());

    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(36));
    static final int OUTREC_SIZE0 = 80;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    static final String MASK_PATTERN1 = "M11";
    static final String MASK_FORMAT1 = "PD";
    static final String MASK_PATTERN2 = "M11";
    static final String MASK_FORMAT2 = "PD";
    static final String MASK_PATTERN3 = "M11";
    static final String MASK_FORMAT3 = "BI";
    static final String MASK_PATTERN4 = "M11";
    static final String MASK_FORMAT4 = "BI";
    static final String MASK_PATTERN5 = "M11";
    static final String MASK_FORMAT5 = "PD";
    static final String MASK_PATTERN6 = "M11";
    static final String MASK_FORMAT6 = "PD";
    static final int OUTREC_SIZE1 = 164;
    final byte[] fillSpace2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE2));
    static final String MASK_PATTERN7 = "M11";
    static final String MASK_FORMAT7 = "PD";
    static final String MASK_PATTERN8 = "M11";
    static final String MASK_FORMAT8 = "PD";
    static final String MASK_PATTERN9 = "M11";
    static final String MASK_FORMAT9 = "BI";
    static final String MASK_PATTERN10 = "M11";
    static final String MASK_FORMAT10 = "BI";
    static final String MASK_PATTERN11 = "M11";
    static final String MASK_FORMAT11 = "PD";
    static final String MASK_PATTERN12 = "M11";
    static final String MASK_FORMAT12 = "PD";
    static final int OUTREC_SIZE2 = 164;


	byte[] sortof2Cond11 = convertChar2EbcdicBytes("Y".toCharArray());
	static final int OUTREC_POS1=67;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=0;
	static final int OUTREC_POS4=0;
	static final int OUTREC_POS5=6;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=11;
	static final int OUTREC_POS8=0;
	static final int OUTREC_POS9=15;
	static final int OUTREC_POS10=0;
	static final int OUTREC_POS11=23;
	static final int OUTREC_POS12=0;
	static final int OUTREC_POS13=24;
	static final int OUTREC_POS14=0;
	static final int OUTREC_POS15=68;
	static final int OUTREC_POS16=0;
	static final int OUTREC_POS17=112;
	static final int OUTREC_POS18=121;
	static final int OUTREC_POS19=127;
	static final int OUTREC_POS20=0;
	static final int OUTREC_POS21=0;
	static final int OUTREC_POS22=6;
	static final int OUTREC_POS23=0;
	static final int OUTREC_POS24=11;
	static final int OUTREC_POS25=0;
	static final int OUTREC_POS26=15;
	static final int OUTREC_POS27=0;
	static final int OUTREC_POS28=23;
	static final int OUTREC_POS29=0;
	static final int OUTREC_POS30=24;
	static final int OUTREC_POS31=0;
	static final int OUTREC_POS32=68;
	static final int OUTREC_POS33=0;
	static final int OUTREC_POS34=112;
	static final int OUTREC_POS35=121;
	static final int OUTREC_POS36=127;
	static final int OUTREC_LEN1=44;
	static final int OUTREC_LEN2=36;
	static final int OUTREC_LEN3=6;
	static final int OUTREC_LEN4=1;
	static final int OUTREC_LEN5=5;
	static final int OUTREC_LEN6=1;
	static final int OUTREC_LEN7=4;
	static final int OUTREC_LEN8=1;
	static final int OUTREC_LEN9=5;
	static final int OUTREC_LEN10=1;
	static final int OUTREC_LEN11=1;
	static final int OUTREC_LEN12=1;
	static final int OUTREC_LEN13=44;
	static final int OUTREC_LEN14=1;
	static final int OUTREC_LEN15=44;
	static final int OUTREC_LEN16=1;
	static final int OUTREC_LEN17=9;
	static final int OUTREC_LEN18=6;
	static final int OUTREC_LEN19=3;
	static final int OUTREC_LEN20=6;
	static final int OUTREC_LEN21=1;
	static final int OUTREC_LEN22=5;
	static final int OUTREC_LEN23=1;
	static final int OUTREC_LEN24=4;
	static final int OUTREC_LEN25=1;
	static final int OUTREC_LEN26=5;
	static final int OUTREC_LEN27=1;
	static final int OUTREC_LEN28=1;
	static final int OUTREC_LEN29=1;
	static final int OUTREC_LEN30=44;
	static final int OUTREC_LEN31=1;
	static final int OUTREC_LEN32=44;
	static final int OUTREC_LEN33=1;
	static final int OUTREC_LEN34=9;
	static final int OUTREC_LEN35=6;
	static final int OUTREC_LEN36=3;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=44;
	static final int OUTREC_DES_POS3=0;
	static final int OUTREC_DES_POS4=11;
	static final int OUTREC_DES_POS5=12;
	static final int OUTREC_DES_POS6=21;
	static final int OUTREC_DES_POS7=22;
	static final int OUTREC_DES_POS8=32;
	static final int OUTREC_DES_POS9=33;
	static final int OUTREC_DES_POS10=46;
	static final int OUTREC_DES_POS11=47;
	static final int OUTREC_DES_POS12=48;
	static final int OUTREC_DES_POS13=49;
	static final int OUTREC_DES_POS14=93;
	static final int OUTREC_DES_POS15=94;
	static final int OUTREC_DES_POS16=138;
	static final int OUTREC_DES_POS17=139;
	static final int OUTREC_DES_POS18=148;
	static final int OUTREC_DES_POS19=159;
	static final int OUTREC_DES_POS20=0;
	static final int OUTREC_DES_POS21=11;
	static final int OUTREC_DES_POS22=12;
	static final int OUTREC_DES_POS23=21;
	static final int OUTREC_DES_POS24=22;
	static final int OUTREC_DES_POS25=32;
	static final int OUTREC_DES_POS26=33;
	static final int OUTREC_DES_POS27=46;
	static final int OUTREC_DES_POS28=47;
	static final int OUTREC_DES_POS29=48;
	static final int OUTREC_DES_POS30=49;
	static final int OUTREC_DES_POS31=93;
	static final int OUTREC_DES_POS32=94;
	static final int OUTREC_DES_POS33=138;
	static final int OUTREC_DES_POS34=139;
	static final int OUTREC_DES_POS35=148;
	static final int OUTREC_DES_POS36=159;
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


		   if (true/*always execute*/) {
                   
		    //write into sortOut0 file
		 	sortOut0.setRecord(getOutRecord(outRecBytes,0), sortOut0.getRecordLen());
		 	
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof2Cond11,23,0,1,1) == 0)) {
                   
		    //write into sortOut1 file
		 	sortOut1.setRecord(getOutRecord(outRecBytes,1), sortOut1.getRecordLen());
		 	
			sortOut1.write(); recordCount1++;
		  }	
		  if ((Field.compareByte(outRecBytes[23],(byte)0xE8) != 0)) {
                   
		    //write into sortOut2 file
		 	sortOut2.setRecord(getOutRecord(outRecBytes,2), sortOut2.getRecordLen());
		 	
			sortOut2.write(); recordCount2++;
		  }	
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("sort002");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MCGCMSSORT002 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT002 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MCGCMSSORT002 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
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
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
copyMaskBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3, OUTREC_LEN3, MASK_PATTERN1, MASK_FORMAT1);
copyRecordBytes(repBytes, recBytes, OUTREC_POS4,OUTREC_DES_POS4,OUTREC_LEN4);
copyMaskBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5, OUTREC_LEN5, MASK_PATTERN2, MASK_FORMAT2);
copyRecordBytes(repBytes1, recBytes, OUTREC_POS6,OUTREC_DES_POS6,OUTREC_LEN6);
copyMaskBytes(record, recBytes, OUTREC_POS7, OUTREC_DES_POS7, OUTREC_LEN7, MASK_PATTERN3, MASK_FORMAT3);
copyRecordBytes(repBytes2, recBytes, OUTREC_POS8,OUTREC_DES_POS8,OUTREC_LEN8);
copyMaskBytes(record, recBytes, OUTREC_POS9, OUTREC_DES_POS9, OUTREC_LEN9, MASK_PATTERN4, MASK_FORMAT4);
copyRecordBytes(repBytes3, recBytes, OUTREC_POS10,OUTREC_DES_POS10,OUTREC_LEN10);
copyRecordBytes(record, recBytes, OUTREC_POS11, OUTREC_DES_POS11,OUTREC_LEN11);
copyRecordBytes(repBytes4, recBytes, OUTREC_POS12,OUTREC_DES_POS12,OUTREC_LEN12);
copyRecordBytes(record, recBytes, OUTREC_POS13, OUTREC_DES_POS13,OUTREC_LEN13);
copyRecordBytes(repBytes5, recBytes, OUTREC_POS14,OUTREC_DES_POS14,OUTREC_LEN14);
copyRecordBytes(record, recBytes, OUTREC_POS15, OUTREC_DES_POS15,OUTREC_LEN15);
copyRecordBytes(repBytes6, recBytes, OUTREC_POS16,OUTREC_DES_POS16,OUTREC_LEN16);
copyRecordBytes(record, recBytes, OUTREC_POS17, OUTREC_DES_POS17,OUTREC_LEN17);
copyMaskBytes(record, recBytes, OUTREC_POS18, OUTREC_DES_POS18, OUTREC_LEN18, MASK_PATTERN5, MASK_FORMAT5);
copyMaskBytes(record, recBytes, OUTREC_POS19, OUTREC_DES_POS19, OUTREC_LEN19, MASK_PATTERN6, MASK_FORMAT6);
			break;
	case 2:
     	recBytes = new byte[OUTREC_SIZE2];
     	copyRecordBytes(fillSpace2, recBytes, 0, 0, OUTREC_SIZE2);
copyMaskBytes(record, recBytes, OUTREC_POS20, OUTREC_DES_POS20, OUTREC_LEN20, MASK_PATTERN7, MASK_FORMAT7);
copyRecordBytes(repBytes7, recBytes, OUTREC_POS21,OUTREC_DES_POS21,OUTREC_LEN21);
copyMaskBytes(record, recBytes, OUTREC_POS22, OUTREC_DES_POS22, OUTREC_LEN22, MASK_PATTERN8, MASK_FORMAT8);
copyRecordBytes(repBytes8, recBytes, OUTREC_POS23,OUTREC_DES_POS23,OUTREC_LEN23);
copyMaskBytes(record, recBytes, OUTREC_POS24, OUTREC_DES_POS24, OUTREC_LEN24, MASK_PATTERN9, MASK_FORMAT9);
copyRecordBytes(repBytes9, recBytes, OUTREC_POS25,OUTREC_DES_POS25,OUTREC_LEN25);
copyMaskBytes(record, recBytes, OUTREC_POS26, OUTREC_DES_POS26, OUTREC_LEN26, MASK_PATTERN10, MASK_FORMAT10);
copyRecordBytes(repBytes10, recBytes, OUTREC_POS27,OUTREC_DES_POS27,OUTREC_LEN27);
copyRecordBytes(record, recBytes, OUTREC_POS28, OUTREC_DES_POS28,OUTREC_LEN28);
copyRecordBytes(repBytes11, recBytes, OUTREC_POS29,OUTREC_DES_POS29,OUTREC_LEN29);
copyRecordBytes(record, recBytes, OUTREC_POS30, OUTREC_DES_POS30,OUTREC_LEN30);
copyRecordBytes(repBytes12, recBytes, OUTREC_POS31,OUTREC_DES_POS31,OUTREC_LEN31);
copyRecordBytes(record, recBytes, OUTREC_POS32, OUTREC_DES_POS32,OUTREC_LEN32);
copyRecordBytes(repBytes13, recBytes, OUTREC_POS33,OUTREC_DES_POS33,OUTREC_LEN33);
copyRecordBytes(record, recBytes, OUTREC_POS34, OUTREC_DES_POS34,OUTREC_LEN34);
copyMaskBytes(record, recBytes, OUTREC_POS35, OUTREC_DES_POS35, OUTREC_LEN35, MASK_PATTERN11, MASK_FORMAT11);
copyMaskBytes(record, recBytes, OUTREC_POS36, OUTREC_DES_POS36, OUTREC_LEN36, MASK_PATTERN12, MASK_FORMAT12);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	  
	  
	  







}
