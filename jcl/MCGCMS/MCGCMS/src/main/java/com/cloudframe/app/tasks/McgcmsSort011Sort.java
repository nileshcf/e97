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
import com.cloudframe.app.sort.file.McgcmsSort011SortIn;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut1;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut2;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut3;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut4;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut5;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut6;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort011Detail;
import com.cloudframe.app.data.Field;
import java.util.Arrays;
import java.util.ArrayList;

import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.McgcmsSort011SortIn;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut1;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut2;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut3;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut4;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut5;
import com.cloudframe.app.sort.file.McgcmsSort011SortOut6;
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
import com.cloudframe.app.sort.McgcmsSort011Detail;
import org.springframework.beans.factory.annotation.Value;
public class McgcmsSort011Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort011Sort.class);

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
	@Qualifier("batch_mcgcmssort011")
	McgcmsSort011Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut0")
	McgcmsSort011SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut1")
	McgcmsSort011SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut2")
	McgcmsSort011SortOut2 sortOut2;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut3")
	McgcmsSort011SortOut3 sortOut3;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut4")
	McgcmsSort011SortOut4 sortOut4;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut5")
	McgcmsSort011SortOut5 sortOut5;
	
	@Autowired
	@Qualifier("McgcmsSort011SortOut6")
	McgcmsSort011SortOut6 sortOut6;
	


	
	@Autowired
	@Qualifier("McgcmsSort011SortIn")
	McgcmsSort011SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;
    int recordCount2 = 0;
    int recordCount3 = 0;
    int recordCount4 = 0;
    int recordCount5 = 0;
    int recordCount6 = 0;


    static final int OUTREC_SIZE = 41;    
	int recordLen = 0;
	


    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    static final String EDIT_FORMAT1 = "ZD";
    static final int OUTREC_SIZE0 = 41;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    static final String EDIT_FORMAT2 = "ZD";
    static final int OUTREC_SIZE1 = 41;
    final byte[] fillSpace2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE2));
    static final String EDIT_FORMAT3 = "ZD";
    static final int OUTREC_SIZE2 = 41;
    final byte[] fillSpace3 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE3));
    static final String EDIT_FORMAT4 = "ZD";
    static final int OUTREC_SIZE3 = 41;
    final byte[] fillSpace4 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE4));
    static final String EDIT_FORMAT5 = "ZD";
    static final int OUTREC_SIZE4 = 41;
    final byte[] fillSpace5 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE5));
    static final String EDIT_FORMAT6 = "ZD";
    static final int OUTREC_SIZE5 = 41;
    final byte[] fillSpace6 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE6));
    static final String EDIT_FORMAT7 = "ZD";
    static final int OUTREC_SIZE6 = 41;


    final String TOT_PATTERN_T10020 = "III,III,IIT";
    final String TOT_SIGN_PATTERN_T10020 = "";
    final int TOT_PATTERN_OFFSET_T10020 =29;
    final int TOT_PATTERN_LENGTH_T10020 = 9;
    final String TOT_PATTERN_FORMAT_T10020 = "ZD";
    byte[] tot_T10020 = null;
    int fbaCountT10020 = 0;
    final String TOT_PATTERN_T11020 = "III,III,IIT";
    final String TOT_SIGN_PATTERN_T11020 = "";
    final int TOT_PATTERN_OFFSET_T11020 =29;
    final int TOT_PATTERN_LENGTH_T11020 = 9;
    final String TOT_PATTERN_FORMAT_T11020 = "ZD";
    byte[] tot_T11020 = null;
    int fbaCountT11020 = 0;
    final String TOT_PATTERN_T12020 = "III,III,IIT";
    final String TOT_SIGN_PATTERN_T12020 = "";
    final int TOT_PATTERN_OFFSET_T12020 =29;
    final int TOT_PATTERN_LENGTH_T12020 = 9;
    final String TOT_PATTERN_FORMAT_T12020 = "ZD";
    byte[] tot_T12020 = null;
    int fbaCountT12020 = 0;
    final String TOT_PATTERN_T13020 = "III,III,IIT";
    final String TOT_SIGN_PATTERN_T13020 = "";
    final int TOT_PATTERN_OFFSET_T13020 =29;
    final int TOT_PATTERN_LENGTH_T13020 = 9;
    final String TOT_PATTERN_FORMAT_T13020 = "ZD";
    byte[] tot_T13020 = null;
    int fbaCountT13020 = 0;
    final String TOT_PATTERN_T14020 = "III,III,IIT";
    final String TOT_SIGN_PATTERN_T14020 = "";
    final int TOT_PATTERN_OFFSET_T14020 =29;
    final int TOT_PATTERN_LENGTH_T14020 = 9;
    final String TOT_PATTERN_FORMAT_T14020 = "ZD";
    byte[] tot_T14020 = null;
    int fbaCountT14020 = 0;
    final String TOT_PATTERN_T15020 = "III,III,IIT";
    final String TOT_SIGN_PATTERN_T15020 = "";
    final int TOT_PATTERN_OFFSET_T15020 =29;
    final int TOT_PATTERN_LENGTH_T15020 = 9;
    final String TOT_PATTERN_FORMAT_T15020 = "ZD";
    byte[] tot_T15020 = null;
    int fbaCountT15020 = 0;
    final String TOT_PATTERN_T16020 = "III,III,IIT";
    final String TOT_SIGN_PATTERN_T16020 = "";
    final int TOT_PATTERN_OFFSET_T16020 =29;
    final int TOT_PATTERN_LENGTH_T16020 = 9;
    final String TOT_PATTERN_FORMAT_T16020 = "ZD";
    byte[] tot_T16020 = null;
    int fbaCountT16020 = 0;
	byte[] sortof1Cond01 = convertChar2EbcdicBytes("001".toCharArray());
	byte[] outfilT1000 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilT1001 = convertChar2EbcdicBytes(" TOT FOR CYCLE 001 : ".toCharArray());
	byte[] outfilT1002S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilT1002S1 = new byte[TOT_PATTERN_T10020.length()];
	byte[] outfilT1004 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] sortof2Cond11 = convertChar2EbcdicBytes("002".toCharArray());
	byte[] outfilT1100 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilT1101 = convertChar2EbcdicBytes(" TOT FOR CYCLE 002 : ".toCharArray());
	byte[] outfilT1102S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilT1102S1 = new byte[TOT_PATTERN_T11020.length()];
	byte[] outfilT1104 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] sortof3Cond21 = convertChar2EbcdicBytes("003".toCharArray());
	byte[] outfilT1200 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilT1201 = convertChar2EbcdicBytes(" TOT FOR CYCLE 003 : ".toCharArray());
	byte[] outfilT1202S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilT1202S1 = new byte[TOT_PATTERN_T12020.length()];
	byte[] outfilT1204 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] sortof4Cond31 = convertChar2EbcdicBytes("004".toCharArray());
	byte[] outfilT1300 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilT1301 = convertChar2EbcdicBytes(" TOT FOR CYCLE 004 : ".toCharArray());
	byte[] outfilT1302S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilT1302S1 = new byte[TOT_PATTERN_T13020.length()];
	byte[] outfilT1304 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] sortof5Cond41 = convertChar2EbcdicBytes("005".toCharArray());
	byte[] outfilT1400 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilT1401 = convertChar2EbcdicBytes(" TOT FOR CYCLE 005 : ".toCharArray());
	byte[] outfilT1402S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilT1402S1 = new byte[TOT_PATTERN_T14020.length()];
	byte[] outfilT1404 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] sortof6Cond51 = convertChar2EbcdicBytes("006".toCharArray());
	byte[] outfilT1500 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilT1501 = convertChar2EbcdicBytes(" TOT FOR CYCLE 006 : ".toCharArray());
	byte[] outfilT1502S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilT1502S1 = new byte[TOT_PATTERN_T15020.length()];
	byte[] outfilT1504 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] sortof7Cond61 = convertChar2EbcdicBytes("007".toCharArray());
	byte[] outfilT1600 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilT1601 = convertChar2EbcdicBytes(" TOT FOR CYCLE 007 : ".toCharArray());
	byte[] outfilT1602S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilT1602S1 = new byte[TOT_PATTERN_T16020.length()];
	byte[] outfilT1604 = convertChar2EbcdicBytes("/".toCharArray());
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=29;
	static final int OUTREC_POS3=0;
	static final int OUTREC_POS4=29;
	static final int OUTREC_POS5=0;
	static final int OUTREC_POS6=29;
	static final int OUTREC_POS7=0;
	static final int OUTREC_POS8=29;
	static final int OUTREC_POS9=0;
	static final int OUTREC_POS10=29;
	static final int OUTREC_POS11=0;
	static final int OUTREC_POS12=29;
	static final int OUTREC_POS13=0;
	static final int OUTREC_POS14=29;
	static final int OUTREC_LEN1=29;
	static final int OUTREC_LEN2=9;
	static final int OUTREC_LEN3=29;
	static final int OUTREC_LEN4=9;
	static final int OUTREC_LEN5=29;
	static final int OUTREC_LEN6=9;
	static final int OUTREC_LEN7=29;
	static final int OUTREC_LEN8=9;
	static final int OUTREC_LEN9=29;
	static final int OUTREC_LEN10=9;
	static final int OUTREC_LEN11=29;
	static final int OUTREC_LEN12=9;
	static final int OUTREC_LEN13=29;
	static final int OUTREC_LEN14=9;
	static final int OUTREC_DES_POS1=1;
	static final int OUTREC_DES_POS2=30;
	static final int OUTREC_DES_POS3=1;
	static final int OUTREC_DES_POS4=30;
	static final int OUTREC_DES_POS5=1;
	static final int OUTREC_DES_POS6=30;
	static final int OUTREC_DES_POS7=1;
	static final int OUTREC_DES_POS8=30;
	static final int OUTREC_DES_POS9=1;
	static final int OUTREC_DES_POS10=30;
	static final int OUTREC_DES_POS11=1;
	static final int OUTREC_DES_POS12=30;
	static final int OUTREC_DES_POS13=1;
	static final int OUTREC_DES_POS14=30;
	static final String SIGN1= "";
	static final String SIGN2= "";
	static final String SIGN3= "";
	static final String SIGN4= "";
	static final String SIGN5= "";
	static final String SIGN6= "";
	static final String SIGN7= "";
	static final String EDIT1="III,III,IIT";
	static final String EDIT2="III,III,IIT";
	static final String EDIT3="III,III,IIT";
	static final String EDIT4="III,III,IIT";
	static final String EDIT5="III,III,IIT";
	static final String EDIT6="III,III,IIT";
	static final String EDIT7="III,III,IIT";
    private String filePath = "";

	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
	    useSortTempFile(sortDetail.getTempFileVal());
		sortOut0.open("w", filePath + sortOut0.getFileName(), sortOut0.getRecordLen(), sortOut0.isFBRec());  
		sortOut1.open("w", filePath + sortOut1.getFileName(), sortOut1.getRecordLen(), sortOut1.isFBRec());  
		sortOut2.open("w", filePath + sortOut2.getFileName(), sortOut2.getRecordLen(), sortOut2.isFBRec());  
		sortOut3.open("w", filePath + sortOut3.getFileName(), sortOut3.getRecordLen(), sortOut3.isFBRec());  
		sortOut4.open("w", filePath + sortOut4.getFileName(), sortOut4.getRecordLen(), sortOut4.isFBRec());  
		sortOut5.open("w", filePath + sortOut5.getFileName(), sortOut5.getRecordLen(), sortOut5.isFBRec());  
		sortOut6.open("w", filePath + sortOut6.getFileName(), sortOut6.getRecordLen(), sortOut6.isFBRec());  
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


		  if ((Field.compareBytes(outRecBytes,sortof1Cond01,0,0,3,3) == 0)) {
                   addTotSumRecord(record, 0);
		    //write into sortOut0 file
		 	sortOut0.setRecord(getOutRecord(outRecBytes,0), sortOut0.getRecordLen());
		 	if(fbaCountT10020 == 0 || fbaCountT10020 % 60 == 0) {
	          byte[] tempBytes = sortOut0.getRecordBytes();
            copyRecordBytes(convertChar2EbcdicBytes("1".toCharArray()), tempBytes,0,0,1); }
            fbaCountT10020++;
			sortOut0.write(); recordCount0++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof2Cond11,0,0,3,3) == 0)) {
                   addTotSumRecord(record, 1);
		    //write into sortOut1 file
		 	sortOut1.setRecord(getOutRecord(outRecBytes,1), sortOut1.getRecordLen());
		 	if(fbaCountT11020 == 0 || fbaCountT11020 % 60 == 0) {
	          byte[] tempBytes = sortOut1.getRecordBytes();
            copyRecordBytes(convertChar2EbcdicBytes("1".toCharArray()), tempBytes,0,0,1); }
            fbaCountT11020++;
			sortOut1.write(); recordCount1++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof3Cond21,0,0,3,3) == 0)) {
                   addTotSumRecord(record, 2);
		    //write into sortOut2 file
		 	sortOut2.setRecord(getOutRecord(outRecBytes,2), sortOut2.getRecordLen());
		 	if(fbaCountT12020 == 0 || fbaCountT12020 % 60 == 0) {
	          byte[] tempBytes = sortOut2.getRecordBytes();
            copyRecordBytes(convertChar2EbcdicBytes("1".toCharArray()), tempBytes,0,0,1); }
            fbaCountT12020++;
			sortOut2.write(); recordCount2++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof4Cond31,0,0,3,3) == 0)) {
                   addTotSumRecord(record, 3);
		    //write into sortOut3 file
		 	sortOut3.setRecord(getOutRecord(outRecBytes,3), sortOut3.getRecordLen());
		 	if(fbaCountT13020 == 0 || fbaCountT13020 % 60 == 0) {
	          byte[] tempBytes = sortOut3.getRecordBytes();
            copyRecordBytes(convertChar2EbcdicBytes("1".toCharArray()), tempBytes,0,0,1); }
            fbaCountT13020++;
			sortOut3.write(); recordCount3++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof5Cond41,0,0,3,3) == 0)) {
                   addTotSumRecord(record, 4);
		    //write into sortOut4 file
		 	sortOut4.setRecord(getOutRecord(outRecBytes,4), sortOut4.getRecordLen());
		 	if(fbaCountT14020 == 0 || fbaCountT14020 % 60 == 0) {
	          byte[] tempBytes = sortOut4.getRecordBytes();
            copyRecordBytes(convertChar2EbcdicBytes("1".toCharArray()), tempBytes,0,0,1); }
            fbaCountT14020++;
			sortOut4.write(); recordCount4++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof6Cond51,0,0,3,3) == 0)) {
                   addTotSumRecord(record, 5);
		    //write into sortOut5 file
		 	sortOut5.setRecord(getOutRecord(outRecBytes,5), sortOut5.getRecordLen());
		 	if(fbaCountT15020 == 0 || fbaCountT15020 % 60 == 0) {
	          byte[] tempBytes = sortOut5.getRecordBytes();
            copyRecordBytes(convertChar2EbcdicBytes("1".toCharArray()), tempBytes,0,0,1); }
            fbaCountT15020++;
			sortOut5.write(); recordCount5++;
		  }	
		  if ((Field.compareBytes(outRecBytes,sortof7Cond61,0,0,3,3) == 0)) {
                   addTotSumRecord(record, 6);
		    //write into sortOut6 file
		 	sortOut6.setRecord(getOutRecord(outRecBytes,6), sortOut6.getRecordLen());
		 	if(fbaCountT16020 == 0 || fbaCountT16020 % 60 == 0) {
	          byte[] tempBytes = sortOut6.getRecordBytes();
            copyRecordBytes(convertChar2EbcdicBytes("1".toCharArray()), tempBytes,0,0,1); }
            fbaCountT16020++;
			sortOut6.write(); recordCount6++;
		  }	
		record = sortIn.readRecord();
        }

	    addTrailer1ToOutFile();

		cfStepHandler.updateSortStepExecution("sort011");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");

         logger.info("STEPNAME: MCGCMSSORT011 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT011 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
         logger.info("STEPNAME: MCGCMSSORT011 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount2);
         sortOut2.close();
         logger.info("STEPNAME: MCGCMSSORT011 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount3);
         sortOut3.close();
         logger.info("STEPNAME: MCGCMSSORT011 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount4);
         sortOut4.close();
         logger.info("STEPNAME: MCGCMSSORT011 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount5);
         sortOut5.close();
         logger.info("STEPNAME: MCGCMSSORT011 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount6);
         sortOut6.close();
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
	private byte[] getOutRecord(byte[] record, int fileIndx) {
        byte[] recBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE));
					switch(fileIndx) {
	case 0:
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS2, OUTREC_DES_POS2,OUTREC_LEN2, EDIT1,SIGN1, EDIT_FORMAT1);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS4, OUTREC_DES_POS4,OUTREC_LEN4, EDIT2,SIGN2, EDIT_FORMAT2);
			break;
	case 2:
     	recBytes = new byte[OUTREC_SIZE2];
     	copyRecordBytes(fillSpace2, recBytes, 0, 0, OUTREC_SIZE2);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS6, OUTREC_DES_POS6,OUTREC_LEN6, EDIT3,SIGN3, EDIT_FORMAT3);
			break;
	case 3:
     	recBytes = new byte[OUTREC_SIZE3];
     	copyRecordBytes(fillSpace3, recBytes, 0, 0, OUTREC_SIZE3);
copyRecordBytes(record, recBytes, OUTREC_POS7, OUTREC_DES_POS7,OUTREC_LEN7);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS8, OUTREC_DES_POS8,OUTREC_LEN8, EDIT4,SIGN4, EDIT_FORMAT4);
			break;
	case 4:
     	recBytes = new byte[OUTREC_SIZE4];
     	copyRecordBytes(fillSpace4, recBytes, 0, 0, OUTREC_SIZE4);
copyRecordBytes(record, recBytes, OUTREC_POS9, OUTREC_DES_POS9,OUTREC_LEN9);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS10, OUTREC_DES_POS10,OUTREC_LEN10, EDIT5,SIGN5, EDIT_FORMAT5);
			break;
	case 5:
     	recBytes = new byte[OUTREC_SIZE5];
     	copyRecordBytes(fillSpace5, recBytes, 0, 0, OUTREC_SIZE5);
copyRecordBytes(record, recBytes, OUTREC_POS11, OUTREC_DES_POS11,OUTREC_LEN11);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS12, OUTREC_DES_POS12,OUTREC_LEN12, EDIT6,SIGN6, EDIT_FORMAT6);
			break;
	case 6:
     	recBytes = new byte[OUTREC_SIZE6];
     	copyRecordBytes(fillSpace6, recBytes, 0, 0, OUTREC_SIZE6);
copyRecordBytes(record, recBytes, OUTREC_POS13, OUTREC_DES_POS13,OUTREC_LEN13);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS14, OUTREC_DES_POS14,OUTREC_LEN14, EDIT7,SIGN7, EDIT_FORMAT7);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	  
	  
	private void addHeaderTrailerRecords(List<byte[]>  recordList, int outfileIndx) {
		//
	 	byte[] startRec = convertChar2EbcdicBytes("1/".toCharArray());
		byte[] startChar = convertChar2EbcdicBytes("1".toCharArray());
	 	byte[] nextRec = convertChar2EbcdicBytes("/".toCharArray());
        byte[] recordByte = getHeaderSpaceBytes(outfileIndx);
		int pos=0;
		int len=0;
		boolean recordBytesAdded = false;
		for(int i=0; i<recordList.size();i++) {
			byte[] bArr = recordList.get(i);
			len =bArr.length;
			if (len==1 && Field.compareBytes(nextRec, bArr, 0, 0, 1, 1) == 0
				|| len==2 && Field.compareBytes(startRec, bArr, 0, 0, 2, 2) == 0) {
				if(recordBytesAdded)
					writeHeaderTrailers(recordByte,outfileIndx);
				recordByte = getHeaderSpaceBytes(outfileIndx);
				if(len==2)
					copyRecordBytes(startChar, recordByte, 0, 0, 1);

				if(i>0 && i<(recordList.size()-1)) {
					byte[] bArr2 = recordList.get(++i);
					len =bArr2.length;
					copyRecordBytes(bArr2, recordByte, 0, 0, len);
					pos = 0+bArr2.length; // next start position
					recordBytesAdded = true;
				} else {
					writeHeaderTrailers(recordByte,outfileIndx);
					pos=0;recordBytesAdded = false;
				}
				continue;
			}
			copyRecordBytes(bArr, recordByte, 0, pos, len);
			pos = pos+bArr.length; // next start position
			recordBytesAdded = true;
		}
		// write last record if exists
		if(recordBytesAdded)
			writeHeaderTrailers(recordByte,outfileIndx);
	}

	private void writeHeaderTrailers(byte[] record, int outfileIndx) {
		try {
			switch(outfileIndx) {
		    case 0:
		    	//write into sortOut0 file
				sortOut0.setRecord(record, sortOut0.getRecordLen());
				sortOut0.write();
				break;
		    case 1:
		    	//write into sortOut1 file
				sortOut1.setRecord(record, sortOut1.getRecordLen());
				sortOut1.write();
				break;
		    case 2:
		    	//write into sortOut2 file
				sortOut2.setRecord(record, sortOut2.getRecordLen());
				sortOut2.write();
				break;
		    case 3:
		    	//write into sortOut3 file
				sortOut3.setRecord(record, sortOut3.getRecordLen());
				sortOut3.write();
				break;
		    case 4:
		    	//write into sortOut4 file
				sortOut4.setRecord(record, sortOut4.getRecordLen());
				sortOut4.write();
				break;
		    case 5:
		    	//write into sortOut5 file
				sortOut5.setRecord(record, sortOut5.getRecordLen());
				sortOut5.write();
				break;
		    case 6:
		    	//write into sortOut6 file
				sortOut6.setRecord(record, sortOut6.getRecordLen());
				sortOut6.write();
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private byte[] getHeaderSpaceBytes(int outfileIndx) {
	   int len = 0;
	   switch(outfileIndx){
	   case 0:
		 	len = sortOut0.getRecordLen();
		 	break;
	   case 1:
		 	len = sortOut1.getRecordLen();
		 	break;
	   case 2:
		 	len = sortOut2.getRecordLen();
		 	break;
	   case 3:
		 	len = sortOut3.getRecordLen();
		 	break;
	   case 4:
		 	len = sortOut4.getRecordLen();
		 	break;
	   case 5:
		 	len = sortOut5.getRecordLen();
		 	break;
	   case 6:
		 	len = sortOut6.getRecordLen();
		 	break;
	   default:
			break;
	   }
	   return convertChar2EbcdicBytes(CFUtil.fillSpaces(len));
	}
private void addTotSumRecord(byte[] record, int trailerSwtch) throws Exception {
		try {

			byte[] recBytes = record;
		switch(trailerSwtch) {
            case 0:
			     if (tot_T10020 == null) {
				     tot_T10020 = new byte[TOT_PATTERN_LENGTH_T10020];
				     copyRecordBytes(recBytes, tot_T10020, TOT_PATTERN_OFFSET_T10020, 0, TOT_PATTERN_LENGTH_T10020);
			      } else {
				     tot_T10020 = addTrailer1TotBytes(recBytes, TOT_PATTERN_OFFSET_T10020, tot_T10020, 0, TOT_PATTERN_LENGTH_T10020, TOT_PATTERN_FORMAT_T10020);
			    }
			      break;
            case 1:
			     if (tot_T11020 == null) {
				     tot_T11020 = new byte[TOT_PATTERN_LENGTH_T11020];
				     copyRecordBytes(recBytes, tot_T11020, TOT_PATTERN_OFFSET_T11020, 0, TOT_PATTERN_LENGTH_T11020);
			      } else {
				     tot_T11020 = addTrailer1TotBytes(recBytes, TOT_PATTERN_OFFSET_T11020, tot_T11020, 0, TOT_PATTERN_LENGTH_T11020, TOT_PATTERN_FORMAT_T11020);
			    }
			      break;
            case 2:
			     if (tot_T12020 == null) {
				     tot_T12020 = new byte[TOT_PATTERN_LENGTH_T12020];
				     copyRecordBytes(recBytes, tot_T12020, TOT_PATTERN_OFFSET_T12020, 0, TOT_PATTERN_LENGTH_T12020);
			      } else {
				     tot_T12020 = addTrailer1TotBytes(recBytes, TOT_PATTERN_OFFSET_T12020, tot_T12020, 0, TOT_PATTERN_LENGTH_T12020, TOT_PATTERN_FORMAT_T12020);
			    }
			      break;
            case 3:
			     if (tot_T13020 == null) {
				     tot_T13020 = new byte[TOT_PATTERN_LENGTH_T13020];
				     copyRecordBytes(recBytes, tot_T13020, TOT_PATTERN_OFFSET_T13020, 0, TOT_PATTERN_LENGTH_T13020);
			      } else {
				     tot_T13020 = addTrailer1TotBytes(recBytes, TOT_PATTERN_OFFSET_T13020, tot_T13020, 0, TOT_PATTERN_LENGTH_T13020, TOT_PATTERN_FORMAT_T13020);
			    }
			      break;
            case 4:
			     if (tot_T14020 == null) {
				     tot_T14020 = new byte[TOT_PATTERN_LENGTH_T14020];
				     copyRecordBytes(recBytes, tot_T14020, TOT_PATTERN_OFFSET_T14020, 0, TOT_PATTERN_LENGTH_T14020);
			      } else {
				     tot_T14020 = addTrailer1TotBytes(recBytes, TOT_PATTERN_OFFSET_T14020, tot_T14020, 0, TOT_PATTERN_LENGTH_T14020, TOT_PATTERN_FORMAT_T14020);
			    }
			      break;
            case 5:
			     if (tot_T15020 == null) {
				     tot_T15020 = new byte[TOT_PATTERN_LENGTH_T15020];
				     copyRecordBytes(recBytes, tot_T15020, TOT_PATTERN_OFFSET_T15020, 0, TOT_PATTERN_LENGTH_T15020);
			      } else {
				     tot_T15020 = addTrailer1TotBytes(recBytes, TOT_PATTERN_OFFSET_T15020, tot_T15020, 0, TOT_PATTERN_LENGTH_T15020, TOT_PATTERN_FORMAT_T15020);
			    }
			      break;
            case 6:
			     if (tot_T16020 == null) {
				     tot_T16020 = new byte[TOT_PATTERN_LENGTH_T16020];
				     copyRecordBytes(recBytes, tot_T16020, TOT_PATTERN_OFFSET_T16020, 0, TOT_PATTERN_LENGTH_T16020);
			      } else {
				     tot_T16020 = addTrailer1TotBytes(recBytes, TOT_PATTERN_OFFSET_T16020, tot_T16020, 0, TOT_PATTERN_LENGTH_T16020, TOT_PATTERN_FORMAT_T16020);
			    }
			      break;
		    default:
			break;
		  }
		} catch (Exception e) {
			logger.error("Error in sum record : {}", e.getMessage());
		}
	}


	private void addTrailer1ToOutFile(){
		copyEditSignRecordBytes(tot_T10020, outfilT1002S1, 0,0 ,TOT_PATTERN_LENGTH_T10020, TOT_PATTERN_T10020,TOT_SIGN_PATTERN_T10020, TOT_PATTERN_FORMAT_T10020);

		copyEditSignRecordBytes(tot_T11020, outfilT1102S1, 0,0 ,TOT_PATTERN_LENGTH_T11020, TOT_PATTERN_T11020,TOT_SIGN_PATTERN_T11020, TOT_PATTERN_FORMAT_T11020);

		copyEditSignRecordBytes(tot_T12020, outfilT1202S1, 0,0 ,TOT_PATTERN_LENGTH_T12020, TOT_PATTERN_T12020,TOT_SIGN_PATTERN_T12020, TOT_PATTERN_FORMAT_T12020);

		copyEditSignRecordBytes(tot_T13020, outfilT1302S1, 0,0 ,TOT_PATTERN_LENGTH_T13020, TOT_PATTERN_T13020,TOT_SIGN_PATTERN_T13020, TOT_PATTERN_FORMAT_T13020);

		copyEditSignRecordBytes(tot_T14020, outfilT1402S1, 0,0 ,TOT_PATTERN_LENGTH_T14020, TOT_PATTERN_T14020,TOT_SIGN_PATTERN_T14020, TOT_PATTERN_FORMAT_T14020);

		copyEditSignRecordBytes(tot_T15020, outfilT1502S1, 0,0 ,TOT_PATTERN_LENGTH_T15020, TOT_PATTERN_T15020,TOT_SIGN_PATTERN_T15020, TOT_PATTERN_FORMAT_T15020);

		copyEditSignRecordBytes(tot_T16020, outfilT1602S1, 0,0 ,TOT_PATTERN_LENGTH_T16020, TOT_PATTERN_T16020,TOT_SIGN_PATTERN_T16020, TOT_PATTERN_FORMAT_T16020);

		addHeaderTrailerRecords(Arrays.asList(outfilT1000,outfilT1001,outfilT1002S0,outfilT1002S1,outfilT1004),0);
		addHeaderTrailerRecords(Arrays.asList(outfilT1100,outfilT1101,outfilT1102S0,outfilT1102S1,outfilT1104),1);
		addHeaderTrailerRecords(Arrays.asList(outfilT1200,outfilT1201,outfilT1202S0,outfilT1202S1,outfilT1204),2);
		addHeaderTrailerRecords(Arrays.asList(outfilT1300,outfilT1301,outfilT1302S0,outfilT1302S1,outfilT1304),3);
		addHeaderTrailerRecords(Arrays.asList(outfilT1400,outfilT1401,outfilT1402S0,outfilT1402S1,outfilT1404),4);
		addHeaderTrailerRecords(Arrays.asList(outfilT1500,outfilT1501,outfilT1502S0,outfilT1502S1,outfilT1504),5);
		addHeaderTrailerRecords(Arrays.asList(outfilT1600,outfilT1601,outfilT1602S0,outfilT1602S1,outfilT1604),6);
	}
	  







}
