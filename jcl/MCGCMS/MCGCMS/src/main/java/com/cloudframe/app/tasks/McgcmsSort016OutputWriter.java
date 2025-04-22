package com.cloudframe.app.tasks;

import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;
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
import com.cloudframe.app.sort.file.McgcmsSort016SortIn0;
import com.cloudframe.app.sort.file.McgcmsSort016SortIn1;
import com.cloudframe.app.sort.file.McgcmsSort016SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort016SortOut1;
import com.cloudframe.app.sort.file.records.McgcmsSort016Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort016Detail;
import com.cloudframe.app.data.Field;
import java.util.Arrays;
public class McgcmsSort016OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort016OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort016")
	McgcmsSort016Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort016SortOut0")
	McgcmsSort016SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort016SortOut1")
	McgcmsSort016SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("McgcmsSort016SortIn0")
	McgcmsSort016SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort016SortIn1")
	McgcmsSort016SortIn1 sortIn1;
	
	RandomAccessFile raFile0;
	
	RandomAccessFile raFile1;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;


    static final int OUTREC_SIZE = 247;    
	int recordLen = 0;
	

	byte[] repBytes = convertChar2EbcdicBytes("|REPRY|CYC_ID =".toCharArray());
	byte[] repBytes1 = convertChar2EbcdicBytes("0".toCharArray());
	byte[] repBytes2 = convertChar2EbcdicBytes("|PROC_DT =".toCharArray());
	byte[] repBytes3 = convertChar2EbcdicBytes("|PROC_ID =".toCharArray());
	byte[] repBytes4 = convertChar2EbcdicBytes("|MEMBER_NAME =".toCharArray());
	byte[] repBytes5 = convertChar2EbcdicBytes("|REGION =".toCharArray());
	byte[] repBytes6 = convertChar2EbcdicBytes("|COUNTRY =".toCharArray());
	byte[] repBytes7 = convertChar2EbcdicBytes("|GFT_DATASET_NAME =".toCharArray());
	byte[] repBytes8 = convertChar2EbcdicBytes("|AVAIL_TMS =".toCharArray());
	byte[] repBytes9 = convertChar2EbcdicBytes("|OLD_PRTY =".toCharArray());
	byte[] repBytes10 = convertChar2EbcdicBytes("|NEW_PRTY =".toCharArray());
	byte[] repBytes11 = convertChar2EbcdicBytes("|UPD_IND =".toCharArray());
	byte[] repBytes12 = convertChar2EbcdicBytes("|UPD_TMS =".toCharArray());
	byte[] repBytes13 = convertChar2EbcdicBytes("|NET_GLBL_TXN_AMT =".toCharArray());
	byte[] repBytes14 = convertChar2EbcdicBytes("|NET_GLBL_TXN_CNT =".toCharArray());
	byte[] repBytes15 = convertChar2EbcdicBytes("|".toCharArray());

    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    byte[] dateTimeBytes1 = convertChar2EbcdicBytes(CFUtil.getCurrentDateInFormat("DATE1/"));
    final byte[] fillBytes2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    byte[] dateTimeBytes3 = convertChar2EbcdicBytes(CFUtil.getCurrentTimeInFormat("TIME"));
    byte[] repHexBytes4 = convertHexChar2Bytes("7F");
    byte[] repHexBytes5 = convertHexChar2Bytes("7F");
    byte[] repHexBytes6 = convertHexChar2Bytes("7F");
    final byte[] fillBytes7 = convertChar2EbcdicBytes(CFUtil.fillSpaces(8));
    byte[] repHexBytes8 = convertHexChar2Bytes("7F");
    byte[] repHexBytes9 = convertHexChar2Bytes("7F");
    byte[] repHexBytes10 = convertHexChar2Bytes("7F");
    byte[] repHexBytes11 = convertHexChar2Bytes("7F");
    byte[] repHexBytes12 = convertHexChar2Bytes("7F");
    byte[] repHexBytes13 = convertHexChar2Bytes("7F");
    byte[] repHexBytes14 = convertHexChar2Bytes("7F");
    byte[] repHexBytes15 = convertHexChar2Bytes("7F");
    byte[] repHexBytes16 = convertHexChar2Bytes("7F");
    byte[] repHexBytes17 = convertHexChar2Bytes("7F");
    byte[] repHexBytes18 = convertHexChar2Bytes("7F");
    byte[] repHexBytes19 = convertHexChar2Bytes("7F");
    byte[] repHexBytes20 = convertHexChar2Bytes("7F");
    byte[] repHexBytes21 = convertHexChar2Bytes("7F");
    static final int CONVERT_LENGTH1 = 2;
    static final String MASK_PATTERN1 = "M11";
    static final String MASK_FORMAT1 = "PD";
    byte[] repHexBytes25 = convertHexChar2Bytes("7F");
    byte[] repHexBytes26 = convertHexChar2Bytes("7F");
    static final int CONVERT_LENGTH2 = 2;
    static final String MASK_PATTERN2 = "M11";
    static final String MASK_FORMAT2 = "PD";
    byte[] repHexBytes30 = convertHexChar2Bytes("7F");
    byte[] repHexBytes31 = convertHexChar2Bytes("7F");
    byte[] repHexBytes32 = convertHexChar2Bytes("7F");
    byte[] repHexBytes33 = convertHexChar2Bytes("7F");
    byte[] repHexBytes34 = convertHexChar2Bytes("7F");
    byte[] repHexBytes35 = convertHexChar2Bytes("7F");
    static final int CONVERT_LENGTH3 = 15;
    static final String MASK_PATTERN3 = "M11";
    static final String MASK_FORMAT3 = "PD";
    byte[] repHexBytes39 = convertHexChar2Bytes("7F");
    byte[] repHexBytes40 = convertHexChar2Bytes("7F");
    static final int CONVERT_LENGTH4 = 12;
    static final String MASK_PATTERN4 = "M11";
    static final String MASK_FORMAT4 = "PD";
    byte[] repHexBytes44 = convertHexChar2Bytes("7F");
    final byte[] fillBytes45 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2090));
    static final int OUTREC_SIZE0 = 2500;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    final byte[] fillBytes48 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes49 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    final byte[] fillBytes50 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes51 = convertChar2EbcdicBytes(CFUtil.fillSpaces(3));
    final byte[] fillBytes52 = convertChar2EbcdicBytes(CFUtil.fillSpaces(6));
    final byte[] fillBytes53 = convertChar2EbcdicBytes(CFUtil.fillSpaces(3));
    final byte[] fillBytes54 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    final byte[] fillBytes55 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    static final int CONVERT_LENGTH5 = 2;
    static final String MASK_PATTERN5 = "M11";
    static final String MASK_FORMAT5 = "PD";
    final byte[] fillBytes59 = convertChar2EbcdicBytes(CFUtil.fillSpaces(3));
    static final int CONVERT_LENGTH6 = 2;
    static final String MASK_PATTERN6 = "M11";
    static final String MASK_FORMAT6 = "PD";
    final byte[] fillBytes63 = convertChar2EbcdicBytes(CFUtil.fillSpaces(3));
    final byte[] fillBytes64 = convertChar2EbcdicBytes(CFUtil.fillSpaces(3));
    final byte[] fillBytes65 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final String EDIT_FORMAT1 = "PD";
    final byte[] fillBytes67 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final String EDIT_FORMAT2 = "PD";
    final byte[] fillBytes69 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    byte[] dateTimeBytes70 = convertChar2EbcdicBytes(CFUtil.getCurrentDateInFormat("DATE5"));
    static final int OUTREC_SIZE1 = 247;


	byte[] outfilH1100 = convertChar2EbcdicBytes("1/".toCharArray());
	byte[] outfilH1101 = convertChar2EbcdicBytes("IP876120-AA".toCharArray());
	byte[] outfilH1102 = convertChar2EbcdicBytes(CFUtil.fillSpaces(40));
	byte[] outfilH1103 = convertChar2EbcdicBytes("CLEARING SETTLEMENT REPRIORITIZA".toCharArray());
	byte[] outfilH1104 = convertChar2EbcdicBytes("TION - DETAIL REPORT".toCharArray());
	byte[] outfilH1105 = convertChar2EbcdicBytes(CFUtil.fillSpaces(5));
	byte[] outfilH1106 = convertChar2EbcdicBytes("                                                   DATE: ".toCharArray());
	byte[] outfilH1107 = convertChar2EbcdicBytes(CFUtil.getCurrentDateInFormat("MD4/"));
	byte[] outfilH1108 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH1109 = convertChar2EbcdicBytes(CFUtil.getCurrentTimeInFormat("TIME"));
	byte[] outfilH11010 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] outfilH21011 = convertChar2EbcdicBytes("1CYC".toCharArray());
	byte[] outfilH21012 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH21013 = convertChar2EbcdicBytes("  SNDR MBR".toCharArray());
	byte[] outfilH21014 = convertChar2EbcdicBytes(CFUtil.fillSpaces(10));
	byte[] outfilH21015 = convertChar2EbcdicBytes("MBR NAME".toCharArray());
	byte[] outfilH21016 = convertChar2EbcdicBytes(CFUtil.fillSpaces(15));
	byte[] outfilH21017 = convertChar2EbcdicBytes("COUNTRY".toCharArray());
	byte[] outfilH21018 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH21019 = convertChar2EbcdicBytes("REGION".toCharArray());
	byte[] outfilH21020 = convertChar2EbcdicBytes(CFUtil.fillSpaces(14));
	byte[] outfilH21021 = convertChar2EbcdicBytes("GFT DASET NAM".toCharArray());
	byte[] outfilH21022 = convertChar2EbcdicBytes(CFUtil.fillSpaces(25));
	byte[] outfilH21023 = convertChar2EbcdicBytes("AVAIL TIMESTAMP".toCharArray());
	byte[] outfilH21024 = convertChar2EbcdicBytes(CFUtil.fillSpaces(7));
	byte[] outfilH21025 = convertChar2EbcdicBytes("OLD".toCharArray());
	byte[] outfilH21026 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
	byte[] outfilH21027 = convertChar2EbcdicBytes("NEW".toCharArray());
	byte[] outfilH21028 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
	byte[] outfilH21029 = convertChar2EbcdicBytes("UPD".toCharArray());
	byte[] outfilH21030 = convertChar2EbcdicBytes(CFUtil.fillSpaces(9));
	byte[] outfilH21031 = convertChar2EbcdicBytes("UPD TIMESTAMP".toCharArray());
	byte[] outfilH21032 = convertChar2EbcdicBytes(CFUtil.fillSpaces(17));
	byte[] outfilH21033 = convertChar2EbcdicBytes("NET GLBL TXN. AMT".toCharArray());
	byte[] outfilH21034 = convertChar2EbcdicBytes(CFUtil.fillSpaces(7));
	byte[] outfilH21035 = convertChar2EbcdicBytes("TRAN. CNT".toCharArray());
	byte[] outfilH21036 = convertChar2EbcdicBytes(CFUtil.fillSpaces(6));
	byte[] outfilH21037 = convertChar2EbcdicBytes("CURRENT TIMESTMP".toCharArray());
	byte[] outfilH21038 = convertChar2EbcdicBytes("/".toCharArray());
	byte[] outfilH21039 = convertChar2EbcdicBytes(CFUtil.fillSpaces(135));
	byte[] outfilH21040 = convertChar2EbcdicBytes("PRY".toCharArray());
	byte[] outfilH21041 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
	byte[] outfilH21042 = convertChar2EbcdicBytes("PRY".toCharArray());
	byte[] outfilH21043 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH21044 = convertChar2EbcdicBytes("/".toCharArray());
	static final int PAGE_BREAK_LINENO = 60;
	static final int SORT0_HEADER2LINES = 0;		
	static final int SORT1_HEADER2LINES = 3;		
	int sort0header2Count = 0;
	int sort1header2Count = 0;
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=0;
	static final int OUTREC_POS4=165;
	static final int OUTREC_POS5=0;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=0;
	static final int OUTREC_POS8=0;
	static final int OUTREC_POS9=0;
	static final int OUTREC_POS10=11;
	static final int OUTREC_POS11=0;
	static final int OUTREC_POS12=166;
	static final int OUTREC_POS13=0;
	static final int OUTREC_POS14=167;
	static final int OUTREC_POS15=0;
	static final int OUTREC_POS16=41;
	static final int OUTREC_POS17=0;
	static final int OUTREC_POS18=85;
	static final int OUTREC_POS19=0;
	static final int OUTREC_POS20=111;
	static final int OUTREC_POS21=0;
	static final int OUTREC_POS22=113;
	static final int OUTREC_POS23=0;
	static final int OUTREC_POS24=115;
	static final int OUTREC_POS25=0;
	static final int OUTREC_POS26=116;
	static final int OUTREC_POS27=0;
	static final int OUTREC_POS28=142;
	static final int OUTREC_POS29=0;
	static final int OUTREC_POS30=155;
	static final int OUTREC_POS31=0;
	static final int OUTREC_POS32=0;
	static final int OUTREC_POS33=0;
	static final int OUTREC_POS34=165;
	static final int OUTREC_POS35=0;
	static final int OUTREC_POS36=0;
	static final int OUTREC_POS37=0;
	static final int OUTREC_POS38=11;
	static final int OUTREC_POS39=0;
	static final int OUTREC_POS40=167;
	static final int OUTREC_POS41=0;
	static final int OUTREC_POS42=166;
	static final int OUTREC_POS43=0;
	static final int OUTREC_POS44=41;
	static final int OUTREC_POS45=0;
	static final int OUTREC_POS46=85;
	static final int OUTREC_POS47=0;
	static final int OUTREC_POS48=111;
	static final int OUTREC_POS49=0;
	static final int OUTREC_POS50=113;
	static final int OUTREC_POS51=0;
	static final int OUTREC_POS52=115;
	static final int OUTREC_POS53=0;
	static final int OUTREC_POS54=116;
	static final int OUTREC_POS55=0;
	static final int OUTREC_POS56=142;
	static final int OUTREC_POS57=0;
	static final int OUTREC_POS58=155;
	static final int OUTREC_POS59=0;
	static final int OUTREC_LEN1=1;
	static final int OUTREC_LEN2=15;
	static final int OUTREC_LEN3=1;
	static final int OUTREC_LEN4=1;
	static final int OUTREC_LEN5=10;
	static final int OUTREC_LEN6=8;
	static final int OUTREC_LEN7=10;
	static final int OUTREC_LEN8=11;
	static final int OUTREC_LEN9=14;
	static final int OUTREC_LEN10=30;
	static final int OUTREC_LEN11=9;
	static final int OUTREC_LEN12=1;
	static final int OUTREC_LEN13=10;
	static final int OUTREC_LEN14=3;
	static final int OUTREC_LEN15=19;
	static final int OUTREC_LEN16=44;
	static final int OUTREC_LEN17=12;
	static final int OUTREC_LEN18=26;
	static final int OUTREC_LEN19=11;
	static final int OUTREC_LEN20=2;
	static final int OUTREC_LEN21=11;
	static final int OUTREC_LEN22=2;
	static final int OUTREC_LEN23=10;
	static final int OUTREC_LEN24=1;
	static final int OUTREC_LEN25=10;
	static final int OUTREC_LEN26=26;
	static final int OUTREC_LEN27=19;
	static final int OUTREC_LEN28=13;
	static final int OUTREC_LEN29=19;
	static final int OUTREC_LEN30=10;
	static final int OUTREC_LEN31=1;
	static final int OUTREC_LEN32=2090;
	static final int OUTREC_LEN33=1;
	static final int OUTREC_LEN34=1;
	static final int OUTREC_LEN35=2;
	static final int OUTREC_LEN36=11;
	static final int OUTREC_LEN37=1;
	static final int OUTREC_LEN38=30;
	static final int OUTREC_LEN39=3;
	static final int OUTREC_LEN40=3;
	static final int OUTREC_LEN41=6;
	static final int OUTREC_LEN42=1;
	static final int OUTREC_LEN43=3;
	static final int OUTREC_LEN44=44;
	static final int OUTREC_LEN45=2;
	static final int OUTREC_LEN46=26;
	static final int OUTREC_LEN47=2;
	static final int OUTREC_LEN48=2;
	static final int OUTREC_LEN49=3;
	static final int OUTREC_LEN50=2;
	static final int OUTREC_LEN51=3;
	static final int OUTREC_LEN52=1;
	static final int OUTREC_LEN53=3;
	static final int OUTREC_LEN54=26;
	static final int OUTREC_LEN55=1;
	static final int OUTREC_LEN56=13;
	static final int OUTREC_LEN57=1;
	static final int OUTREC_LEN58=10;
	static final int OUTREC_LEN59=1;
	static final int OUTREC_DES_POS1=10;
	static final int OUTREC_DES_POS2=19;
	static final int OUTREC_DES_POS3=35;
	static final int OUTREC_DES_POS4=36;
	static final int OUTREC_DES_POS5=38;
	static final int OUTREC_DES_POS6=49;
	static final int OUTREC_DES_POS7=58;
	static final int OUTREC_DES_POS8=69;
	static final int OUTREC_DES_POS9=81;
	static final int OUTREC_DES_POS10=96;
	static final int OUTREC_DES_POS11=127;
	static final int OUTREC_DES_POS12=137;
	static final int OUTREC_DES_POS13=139;
	static final int OUTREC_DES_POS14=150;
	static final int OUTREC_DES_POS15=154;
	static final int OUTREC_DES_POS16=174;
	static final int OUTREC_DES_POS17=219;
	static final int OUTREC_DES_POS18=232;
	static final int OUTREC_DES_POS19=259;
	static final int OUTREC_DES_POS20=271;
	static final int OUTREC_DES_POS21=274;
	static final int OUTREC_DES_POS22=286;
	static final int OUTREC_DES_POS23=289;
	static final int OUTREC_DES_POS24=300;
	static final int OUTREC_DES_POS25=302;
	static final int OUTREC_DES_POS26=313;
	static final int OUTREC_DES_POS27=340;
	static final int OUTREC_DES_POS28=360;
	static final int OUTREC_DES_POS29=376;
	static final int OUTREC_DES_POS30=396;
	static final int OUTREC_DES_POS31=409;
	static final int OUTREC_DES_POS32=410;
	static final int OUTREC_DES_POS33=0;
	static final int OUTREC_DES_POS34=1;
	static final int OUTREC_DES_POS35=2;
	static final int OUTREC_DES_POS36=4;
	static final int OUTREC_DES_POS37=15;
	static final int OUTREC_DES_POS38=16;
	static final int OUTREC_DES_POS39=46;
	static final int OUTREC_DES_POS40=49;
	static final int OUTREC_DES_POS41=52;
	static final int OUTREC_DES_POS42=58;
	static final int OUTREC_DES_POS43=59;
	static final int OUTREC_DES_POS44=62;
	static final int OUTREC_DES_POS45=106;
	static final int OUTREC_DES_POS46=108;
	static final int OUTREC_DES_POS47=134;
	static final int OUTREC_DES_POS48=136;
	static final int OUTREC_DES_POS49=138;
	static final int OUTREC_DES_POS50=141;
	static final int OUTREC_DES_POS51=143;
	static final int OUTREC_DES_POS52=146;
	static final int OUTREC_DES_POS53=147;
	static final int OUTREC_DES_POS54=150;
	static final int OUTREC_DES_POS55=176;
	static final int OUTREC_DES_POS56=177;
	static final int OUTREC_DES_POS57=204;
	static final int OUTREC_DES_POS58=205;
	static final int OUTREC_DES_POS59=220;
	static final String SIGN1= "";
	static final String SIGN2= "";
	static final String EDIT1="$III,III,III,III,III,IIT.TT";
	static final String EDIT2="III,III,III,IIT";
    private String filePath = "";
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
	    useSortTempFile(sortDetail.getTempFileVal());

		sortOut0.open("w", filePath + sortOut0.getFileName(), sortOut0.getRecordLen(), sortOut0.isFBRec());  
		sortOut1.open("w", filePath + sortOut1.getFileName(), sortOut1.getRecordLen(), sortOut1.isFBRec());  
		if (isWriteInTempFile()) {
            this.setRaFile(sortDetail.getRaFile());
            this.setTmpFile(sortDetail.getTempFile());
            this.setExecutorService(sortDetail.getExecutorService());
		} else {
            configMemMapFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<McgcmsSort016Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        if (isWriteInTempFile()) doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		addOutFileHeaders();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  byte[] outRecBytes = getSortedRecord(i); 
		  
		    //write into sortOut0 file		    
		    byte[] outRecord0 = getOutRecord(outRecBytes,0);
			sortOut0.setRecord(outRecord0, sortOut0.getRecordLen());
			sortOut0.write(); recordCount0++;
		        sort0header2Count++;
	       if(sort0header2Count%PAGE_BREAK_LINENO == 0) {
	           addHeader2ToOutFile(0);
	       }

		  
		    //write into sortOut1 file		    
		    byte[] outRecord1 = getOutRecord(outRecBytes,1);
			sortOut1.setRecord(outRecord1, sortOut1.getRecordLen());
			sortOut1.write(); recordCount1++;
		        sort1header2Count++;
	       if(sort1header2Count%PAGE_BREAK_LINENO == 0) {
	           addHeader2ToOutFile(1);
	       }

        }

		cfStepHandler.updateSortStepExecution("sort016");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {

         logger.info("STEPNAME: MCGCMSSORT016 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT016 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
		sortRecKeys.clear();
		if(isWriteInTempFile()) {
			stopExecutorServ();
			removeTempFile();
		} else 
		    clearMemMapFiles();
		logger.debug("Sort Writer ended.");
		SpringContextHandler.handleDispPostionAtStepEnd(true);
		return ExitStatus.COMPLETED;
	}

	/**
	 * This method return sorted record data as byte array
	 * 
	 * @return
	 */ 
	private byte[] getSortedRecord(int index) {
		try {
			McgcmsSort016Keys k = sortRecKeys.get(index);
           if (isWriteInTempFile()) {
				return readFromBuffer(k.getSortRecPos(), k.getSortRecLen());
		   } else
			    return readFromBuffer(k.getSortRecPos(), k.getSortRecLen(), k.getFileIndx());
		} catch (Exception e) {
			logger.error("Error in return record : {}", e.getMessage());
		}
		return new byte[0];
	}
    private void configMemMapFile() {
	    try {
		    // File 0
		    raFile0 = new RandomAccessFile(new File(filePath + sortIn0.getFileName()), "rw");

		    // File 1
		    raFile1 = new RandomAccessFile(new File(filePath + sortIn1.getFileName()), "rw");

	    } catch (FileNotFoundException e) {
		    logger.error("Error access on file - Exception: {} ", e.getMessage());
		}    
	}

    protected byte[] readFromBuffer(long offSet, int dataLen, int fileInID)  throws IOException {
	    byte[] data = new byte[dataLen];
	    switch (fileInID) {
	        case 0:// File 0
				   raFile0.seek(offSet);	// Record Position
	               raFile0.read(data);	// read record
                break;
	        case 1:// File 1
				   raFile1.seek(offSet);	// Record Position
	               raFile1.read(data);	// read record
                break;
	        default:
		        break;
	    }
	    return data;
    }

    protected void clearMemMapFiles() {
	    try {
		    raFile0.close();
		    raFile1.close();
	    } catch (IOException e) {
		   logger.error("Error: Handling Memory Map file - Exception: {} ", e.getMessage());
	    }
	}
	private byte[] getOutRecord(byte[] record, int fileIndx) {
        byte[] recBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE));
					switch(fileIndx) {
	case 0:
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(dateTimeBytes1, recBytes, 0, 0,10);
             copyRecordBytes(fillBytes2,recBytes,OUTREC_POS1,OUTREC_DES_POS1,OUTREC_LEN1);
copyRecordBytes(dateTimeBytes3, recBytes, 0, 11,8);
copyRecordBytes(repBytes, recBytes, OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(repHexBytes4, recBytes, 0, 34,1);
copyRecordBytes(repBytes1, recBytes, OUTREC_POS3,OUTREC_DES_POS3,OUTREC_LEN3);
copyRecordBytes(record, recBytes, OUTREC_POS4, OUTREC_DES_POS4,OUTREC_LEN4);
copyRecordBytes(repHexBytes5, recBytes, 0, 37,1);
copyRecordBytes(repBytes2, recBytes, OUTREC_POS5,OUTREC_DES_POS5,OUTREC_LEN5);
copyRecordBytes(repHexBytes6, recBytes, 0, 48,1);
             copyRecordBytes(fillBytes7,recBytes,OUTREC_POS6,OUTREC_DES_POS6,OUTREC_LEN6);
copyRecordBytes(repHexBytes8, recBytes, 0, 57,1);
copyRecordBytes(repBytes3, recBytes, OUTREC_POS7,OUTREC_DES_POS7,OUTREC_LEN7);
copyRecordBytes(repHexBytes9, recBytes, 0, 68,1);
copyRecordBytes(record, recBytes, OUTREC_POS8, OUTREC_DES_POS8,OUTREC_LEN8);
copyRecordBytes(repHexBytes10, recBytes, 0, 80,1);
copyRecordBytes(repBytes4, recBytes, OUTREC_POS9,OUTREC_DES_POS9,OUTREC_LEN9);
copyRecordBytes(repHexBytes11, recBytes, 0, 95,1);
copyRecordBytes(record, recBytes, OUTREC_POS10, OUTREC_DES_POS10,OUTREC_LEN10);
copyRecordBytes(repHexBytes12, recBytes, 0, 126,1);
copyRecordBytes(repBytes5, recBytes, OUTREC_POS11,OUTREC_DES_POS11,OUTREC_LEN11);
copyRecordBytes(repHexBytes13, recBytes, 0, 136,1);
copyRecordBytes(record, recBytes, OUTREC_POS12, OUTREC_DES_POS12,OUTREC_LEN12);
copyRecordBytes(repHexBytes14, recBytes, 0, 138,1);
copyRecordBytes(repBytes6, recBytes, OUTREC_POS13,OUTREC_DES_POS13,OUTREC_LEN13);
copyRecordBytes(repHexBytes15, recBytes, 0, 149,1);
copyRecordBytes(record, recBytes, OUTREC_POS14, OUTREC_DES_POS14,OUTREC_LEN14);
copyRecordBytes(repHexBytes16, recBytes, 0, 153,1);
copyRecordBytes(repBytes7, recBytes, OUTREC_POS15,OUTREC_DES_POS15,OUTREC_LEN15);
copyRecordBytes(repHexBytes17, recBytes, 0, 173,1);
copyRecordBytes(record, recBytes, OUTREC_POS16, OUTREC_DES_POS16,OUTREC_LEN16);
copyRecordBytes(repHexBytes18, recBytes, 0, 218,1);
copyRecordBytes(repBytes8, recBytes, OUTREC_POS17,OUTREC_DES_POS17,OUTREC_LEN17);
copyRecordBytes(repHexBytes19, recBytes, 0, 231,1);
copyRecordBytes(record, recBytes, OUTREC_POS18, OUTREC_DES_POS18,OUTREC_LEN18);
copyRecordBytes(repHexBytes20, recBytes, 0, 258,1);
copyRecordBytes(repBytes9, recBytes, OUTREC_POS19,OUTREC_DES_POS19,OUTREC_LEN19);
copyRecordBytes(repHexBytes21, recBytes, 0, 270,1);
copyMaskBytes(record, recBytes, OUTREC_POS20, OUTREC_DES_POS20, OUTREC_LEN20, MASK_PATTERN1, MASK_FORMAT1,CONVERT_LENGTH1);
copyRecordBytes(repHexBytes25, recBytes, 0, 273,1);
copyRecordBytes(repBytes10, recBytes, OUTREC_POS21,OUTREC_DES_POS21,OUTREC_LEN21);
copyRecordBytes(repHexBytes26, recBytes, 0, 285,1);
copyMaskBytes(record, recBytes, OUTREC_POS22, OUTREC_DES_POS22, OUTREC_LEN22, MASK_PATTERN2, MASK_FORMAT2,CONVERT_LENGTH2);
copyRecordBytes(repHexBytes30, recBytes, 0, 288,1);
copyRecordBytes(repBytes11, recBytes, OUTREC_POS23,OUTREC_DES_POS23,OUTREC_LEN23);
copyRecordBytes(repHexBytes31, recBytes, 0, 299,1);
copyRecordBytes(record, recBytes, OUTREC_POS24, OUTREC_DES_POS24,OUTREC_LEN24);
copyRecordBytes(repHexBytes32, recBytes, 0, 301,1);
copyRecordBytes(repBytes12, recBytes, OUTREC_POS25,OUTREC_DES_POS25,OUTREC_LEN25);
copyRecordBytes(repHexBytes33, recBytes, 0, 312,1);
copyRecordBytes(record, recBytes, OUTREC_POS26, OUTREC_DES_POS26,OUTREC_LEN26);
copyRecordBytes(repHexBytes34, recBytes, 0, 339,1);
copyRecordBytes(repBytes13, recBytes, OUTREC_POS27,OUTREC_DES_POS27,OUTREC_LEN27);
copyRecordBytes(repHexBytes35, recBytes, 0, 359,1);
copyMaskBytes(record, recBytes, OUTREC_POS28, OUTREC_DES_POS28, OUTREC_LEN28, MASK_PATTERN3, MASK_FORMAT3,CONVERT_LENGTH3);
copyRecordBytes(repHexBytes39, recBytes, 0, 375,1);
copyRecordBytes(repBytes14, recBytes, OUTREC_POS29,OUTREC_DES_POS29,OUTREC_LEN29);
copyRecordBytes(repHexBytes40, recBytes, 0, 395,1);
copyMaskBytes(record, recBytes, OUTREC_POS30, OUTREC_DES_POS30, OUTREC_LEN30, MASK_PATTERN4, MASK_FORMAT4,CONVERT_LENGTH4);
copyRecordBytes(repHexBytes44, recBytes, 0, 408,1);
copyRecordBytes(repBytes15, recBytes, OUTREC_POS31,OUTREC_DES_POS31,OUTREC_LEN31);
             copyRecordBytes(fillBytes45,recBytes,OUTREC_POS32,OUTREC_DES_POS32,OUTREC_LEN32);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
             copyRecordBytes(fillBytes48,recBytes,OUTREC_POS33,OUTREC_DES_POS33,OUTREC_LEN33);
copyRecordBytes(record, recBytes, OUTREC_POS34, OUTREC_DES_POS34,OUTREC_LEN34);
             copyRecordBytes(fillBytes49,recBytes,OUTREC_POS35,OUTREC_DES_POS35,OUTREC_LEN35);
copyRecordBytes(record, recBytes, OUTREC_POS36, OUTREC_DES_POS36,OUTREC_LEN36);
             copyRecordBytes(fillBytes50,recBytes,OUTREC_POS37,OUTREC_DES_POS37,OUTREC_LEN37);
copyRecordBytes(record, recBytes, OUTREC_POS38, OUTREC_DES_POS38,OUTREC_LEN38);
             copyRecordBytes(fillBytes51,recBytes,OUTREC_POS39,OUTREC_DES_POS39,OUTREC_LEN39);
copyRecordBytes(record, recBytes, OUTREC_POS40, OUTREC_DES_POS40,OUTREC_LEN40);
             copyRecordBytes(fillBytes52,recBytes,OUTREC_POS41,OUTREC_DES_POS41,OUTREC_LEN41);
copyRecordBytes(record, recBytes, OUTREC_POS42, OUTREC_DES_POS42,OUTREC_LEN42);
             copyRecordBytes(fillBytes53,recBytes,OUTREC_POS43,OUTREC_DES_POS43,OUTREC_LEN43);
copyRecordBytes(record, recBytes, OUTREC_POS44, OUTREC_DES_POS44,OUTREC_LEN44);
             copyRecordBytes(fillBytes54,recBytes,OUTREC_POS45,OUTREC_DES_POS45,OUTREC_LEN45);
copyRecordBytes(record, recBytes, OUTREC_POS46, OUTREC_DES_POS46,OUTREC_LEN46);
             copyRecordBytes(fillBytes55,recBytes,OUTREC_POS47,OUTREC_DES_POS47,OUTREC_LEN47);
copyMaskBytes(record, recBytes, OUTREC_POS48, OUTREC_DES_POS48, OUTREC_LEN48, MASK_PATTERN5, MASK_FORMAT5,CONVERT_LENGTH5);
             copyRecordBytes(fillBytes59,recBytes,OUTREC_POS49,OUTREC_DES_POS49,OUTREC_LEN49);
copyMaskBytes(record, recBytes, OUTREC_POS50, OUTREC_DES_POS50, OUTREC_LEN50, MASK_PATTERN6, MASK_FORMAT6,CONVERT_LENGTH6);
             copyRecordBytes(fillBytes63,recBytes,OUTREC_POS51,OUTREC_DES_POS51,OUTREC_LEN51);
copyRecordBytes(record, recBytes, OUTREC_POS52, OUTREC_DES_POS52,OUTREC_LEN52);
             copyRecordBytes(fillBytes64,recBytes,OUTREC_POS53,OUTREC_DES_POS53,OUTREC_LEN53);
copyRecordBytes(record, recBytes, OUTREC_POS54, OUTREC_DES_POS54,OUTREC_LEN54);
             copyRecordBytes(fillBytes65,recBytes,OUTREC_POS55,OUTREC_DES_POS55,OUTREC_LEN55);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS56, OUTREC_DES_POS56,OUTREC_LEN56, EDIT1,SIGN1, EDIT_FORMAT1);
             copyRecordBytes(fillBytes67,recBytes,OUTREC_POS57,OUTREC_DES_POS57,OUTREC_LEN57);
copyEditSignRecordBytes(record, recBytes, OUTREC_POS58, OUTREC_DES_POS58,OUTREC_LEN58, EDIT2,SIGN2, EDIT_FORMAT2);
             copyRecordBytes(fillBytes69,recBytes,OUTREC_POS59,OUTREC_DES_POS59,OUTREC_LEN59);
copyRecordBytes(dateTimeBytes70, recBytes, 0, 221,26);
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
	   default:
			break;	
	   }
	   return convertChar2EbcdicBytes(CFUtil.fillSpaces(len));	
	}
	
	private void addHeader1ToOutFile(int outfileIndx){
		switch(outfileIndx) {	
		case 0:
			addHeaderTrailerRecords(Arrays.asList(/* NO HEADER1 EXISTS */),0);
			break;		
		case 1:
			addHeaderTrailerRecords(Arrays.asList(outfilH1100,outfilH1101,outfilH1102,outfilH1103,outfilH1104,outfilH1105,outfilH1106,outfilH1107,outfilH1108,outfilH1109,outfilH11010),1);
			break;		
		default:
			break;	
	   }
	}
	
	private void addHeader2ToOutFile(int outfileIndx){
		switch(outfileIndx) {
		case 0:
			addHeaderTrailerRecords(Arrays.asList(/* NO HEADER2 EXISTS */),0);
			sort0header2Count +=SORT0_HEADER2LINES;
			break;
		case 1:
			addHeaderTrailerRecords(Arrays.asList(outfilH21011,outfilH21012,outfilH21013,outfilH21014,outfilH21015,outfilH21016,outfilH21017,outfilH21018,outfilH21019,outfilH21020,outfilH21021,outfilH21022,outfilH21023,outfilH21024,outfilH21025,outfilH21026,outfilH21027,outfilH21028,outfilH21029,outfilH21030,outfilH21031,outfilH21032,outfilH21033,outfilH21034,outfilH21035,outfilH21036,outfilH21037,outfilH21038,outfilH21039,outfilH21040,outfilH21041,outfilH21042,outfilH21043,outfilH21044),1);
			sort1header2Count +=SORT1_HEADER2LINES;
			break;
		default:
			break;	
	   }
	}

	private void addOutFileHeaders() {
		addHeader1ToOutFile(0);
		addHeader1ToOutFile(1);
		addHeader2ToOutFile(0);
		addHeader2ToOutFile(1);
	}
	  	
}
