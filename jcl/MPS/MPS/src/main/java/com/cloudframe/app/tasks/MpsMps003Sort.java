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
import com.cloudframe.app.sort.file.MpsMps003SortIn;
import com.cloudframe.app.sort.file.MpsMps003SortOut;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.MpsMps003Detail;
import com.cloudframe.app.data.Field;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Arrays;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.MpsMps003SortIn;
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
import com.cloudframe.app.sort.MpsMps003Detail;
import org.springframework.beans.factory.annotation.Value;
public class MpsMps003Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {

	private final Logger logger = LoggerFactory.getLogger(MpsMps003Sort.class);

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
	@Qualifier("batch_mpsmps003")
	MpsMps003Detail sortDetail;
	
	@Autowired
	@Qualifier("MpsMps003SortOut")
	MpsMps003SortOut sortOut;
	


	
	@Autowired
	@Qualifier("MpsMps003SortIn")
	MpsMps003SortIn sortIn;
	
	
    int recordCount = 0;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_SRCPOS000 = 0;
	static final int OUTFIL_BUILD_POS000 = 0;
	static final int OUTFIL_BUILD_LEN000 = 2;
	static final int OUTFIL_BUILD_SRCPOS001 = 2;
	static final int OUTFIL_BUILD_POS001 = 2;
	static final int OUTFIL_BUILD_LEN001 = 12;
	static final int OUTFIL_BUILD_SRCPOS002 = 14;
	static final int OUTFIL_BUILD_POS002 = 14;
	static final int OUTFIL_BUILD_LEN002 = 4723;
	static final int OUTFIL_BUILD_SRCPOS003 = 4737;
	static final int OUTFIL_BUILD_POS003 = 4737;
	static final int OUTFIL_BUILD_LEN003 = 255;
	static final int OUTFIL_BUILD_SRCPOS004 = 4992;
	static final int OUTFIL_BUILD_POS004 = 4992;
	static final int OUTFIL_BUILD_LEN004 = 3;
	static final int OUTFIL_BUILD_SRCPOS005 = 4995;
	static final int OUTFIL_BUILD_POS005 = 4995;
	static final int OUTFIL_BUILD_LEN005 = 255;
	static final int OUTFIL_BUILD_SRCPOS006 = 5250;
	static final int OUTFIL_BUILD_POS006 = 5250;
	static final int OUTFIL_BUILD_LEN006 = 7038;
	static final int OUTFIL_BUILD_SRCPOS010 = 0;
	static final int OUTFIL_BUILD_POS010 = 0;
	static final int OUTFIL_BUILD_LEN010 = 12288;
	static final int OUTFIL_BUILD_SRCPOS020 = 0;
	static final int OUTFIL_BUILD_POS020 = 0;
	static final int OUTFIL_BUILD_LEN020 = 2;
	static final int OUTFIL_BUILD_SRCPOS021 = 2;
	static final int OUTFIL_BUILD_POS021 = 2;
	static final int OUTFIL_BUILD_LEN021 = 12;
	static final int OUTFIL_BUILD_SRCPOS022 = 14;
	static final int OUTFIL_BUILD_POS022 = 14;
	static final int OUTFIL_BUILD_LEN022 = 12274;


	byte[] cond01 = convertHexChar2Bytes("4040");
	byte[] cond02 = convertHexChar2Bytes("2020");
	final byte[] whenBytes000 = convertHexChar2Bytes("3031");
	final byte[] whenBytes001 = convertHexChar2Bytes("3032");
	final byte[] whenBytes002 = convertHexChar2Bytes("3430");
	final byte[] whenBytes010 = convertHexChar2Bytes("3030");
	final byte[] whenBytes011 = convertHexChar2Bytes("3939");
	final byte[] whenBytes020 = convertHexChar2Bytes("3031");
	final byte[] whenBytes021 = convertHexChar2Bytes("3032");
	final byte[] whenBytes022 = convertHexChar2Bytes("3430");
	final byte[] whenBytes023 = convertHexChar2Bytes("3030");
	final byte[] whenBytes024 = convertHexChar2Bytes("3939");
	static final int OUTFIL_BUILD_REC_SIZE0 = 12288;
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


		  if (!((Field.compareBytes(outRecBytes,cond01,0,0,2,2) == 0) || (Field.compareBytes(outRecBytes,cond02,0,0,2,2) == 0))){
		  
          byte[] buildRec = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTFIL_BUILD_REC_SIZE0));
			byte[] buildBytes = buildOutRecIfThenBytes(outRecBytes,0, buildRec, OUTFIL_BUILD_REC_SIZE0);
		    //write into sortOut file
			sortOut.setRecord(buildBytes, sortOut.getRecordLen());
			sortOut.write(); recordCount++;
		  }	
		record = sortIn.readRecord();
        }


		cfStepHandler.updateSortStepExecution("mps003");
		return RepeatStatus.FINISHED;
	}

@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MPSMPS003 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
		if (Field.compareBytes(record,whenBytes000, 0, 0, 2, whenBytes000.length)  == 0 || Field.compareBytes(record,whenBytes001, 0, 0, 2, whenBytes001.length)  == 0 || Field.compareBytes(record,whenBytes002, 0, 0, 2, whenBytes002.length)  == 0) { 
                     copyAltSeqRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS000, OUTFIL_BUILD_POS000, OUTFIL_BUILD_LEN000); 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS001, OUTFIL_BUILD_POS001, OUTFIL_BUILD_LEN001); 
                     copyAltSeqRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS002, OUTFIL_BUILD_POS002, OUTFIL_BUILD_LEN002); 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS003, OUTFIL_BUILD_POS003, OUTFIL_BUILD_LEN003); 
                     copyAltSeqRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS004, OUTFIL_BUILD_POS004, OUTFIL_BUILD_LEN004); 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS005, OUTFIL_BUILD_POS005, OUTFIL_BUILD_LEN005); 
                     copyAltSeqRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS006, OUTFIL_BUILD_POS006, OUTFIL_BUILD_LEN006); 
      } else if (Field.compareBytes(record,whenBytes010, 0, 0, 2, whenBytes010.length)  == 0 || Field.compareBytes(record,whenBytes011, 0, 0, 2, whenBytes011.length)  == 0) { 
                     copyAltSeqRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS010, OUTFIL_BUILD_POS010, OUTFIL_BUILD_LEN010); 
      } else if (Field.compareBytes(record,whenBytes020, 0, 0, 2, whenBytes020.length)  != 0 && Field.compareBytes(record,whenBytes021, 0, 0, 2, whenBytes021.length)  != 0 && Field.compareBytes(record,whenBytes022, 0, 0, 2, whenBytes022.length)  != 0 && Field.compareBytes(record,whenBytes023, 0, 0, 2, whenBytes023.length)  != 0 && Field.compareBytes(record,whenBytes024, 0, 0, 2, whenBytes024.length)  != 0) { 
                     copyAltSeqRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS020, OUTFIL_BUILD_POS020, OUTFIL_BUILD_LEN020); 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS021, OUTFIL_BUILD_POS021, OUTFIL_BUILD_LEN021); 
                     copyAltSeqRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS022, OUTFIL_BUILD_POS022, OUTFIL_BUILD_LEN022); 
      }else { copyRecordBytes(record, buildRec, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, recSize);  }
         break;
		default:
			copyRecordBytes(record, buildRec, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, recSize);
			break;
		}
		return buildRec;
	}	

     String altSeqStr= "0437,052D,062E,072F,0816,0905,0A25,143C,153D,1632,1726,1A3F,1B27,2040,215A,227F,237B,245B,256C,2650,277D,284D,295D,2A5C,2B4E,2C6B,2D60,2E4B,2F61,30F0,31F1,32F2,33F3,34F4,35F5,36F6,37F7,38F8,39F9,3A7A,3B5E,3C4C,3D7E,3E6E,3F6F,407C,41C1,42C2,43C3,44C4,45C5,46C6,47C7,48C8,49C9,4AD1,4BD2,4CD3,4DD4,4ED5,4FD6,50D7,51D8,52D9,53E2,54E3,55E4,56E5,57E6,58E7,59E8,5AE9,5B4A,5CE0,5D5A,5EB0,5F6D,6079,6181,6282,6383,6484,6585,6686,6787,6888,6989,6A91,6B92,6C93,6D94,6E95,6F96,7097,7198,7299,73A2,74A3,75A4,76A5,77A6,78A7,79A8,7AA9,7BC0,7C4F,7DD0,7EA1,7F07,8020,8121,8222,8323,8424,8515,8606,8717,8828,8929,8A2A,8B2B,8C2C,8D09,8E0A,8F1B,9030,9131,921A,9333,9434,9535,9636,9708,9838,9939,9A3A,9B3B,9C04,9D14,9E3E,9FE1,A041,A142,A243,A344,A445,A546,A647,A748,A849,A951,AA52,AB53,AC54,AD55,AE56,AF57,B058,B159,B262,B363,B464,B565,B666,B767,B868,B969,BA70,BB71,BC72,BD73,BE74,BF75,C076,C177,C278,C380,C48A,C58B,C68C,C78D,C88E,C98F,CA90,CB9A,CC9B,CD9C,CE9D,CF9E,D09F,D1A0,D2AA,D3AB,D4AC,D5AD,D6AE,D7AF,D8B0,D9B1,DAB2,DBB3,DCB4,DDB5,DEB6,DFB7,E0B8,E1B9,E2BA,E3BB,E4BC,E5BD,E6BE,E7BF,E8CA,E9CB,EACC,EBCD,ECCE,EDCF,EEDA,EFDB,F0DC,F1DD,F2DE,F3DF,F4EA,F5EB,F6EC,F7ED,F8EE,F9EF";
    List<String> altSeqCodeLst = Arrays.asList(altSeqStr.split(","));
    
    private void copyAltSeqRecordBytes(byte[] record, byte[] buildRec, int srcPos, int desPos, int len) {
		copyRecordBytes(record, buildRec, srcPos, desPos, len);
		transAltSeq(buildRec,  desPos, len);
	} 
	private void transAltSeq(byte[] buildRec, int srcPos, int len) {
		
		for(String lst: altSeqCodeLst) {
			byte[] altSeqKey = convertHexChar2Bytes(lst.substring(0, 2));
			byte[] altSeqValue = convertHexChar2Bytes(lst.substring(2, 4));
			int srcLen = srcPos + len;
			for (int i = srcPos; i < srcLen; i++) {
				if(buildRec[i]== altSeqKey[0]) {
					buildRec[i] = altSeqValue[0];
				}
			}
		}
	}	
}
