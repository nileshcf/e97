package com.cloudframe.app.tasks;

import java.util.List;
import com.cloudframe.app.utility.SpringContextHandler;
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
import java.math.BigDecimal;
import com.cloudframe.app.utility.ByteUtil;
import com.cloudframe.app.exception.CFException;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.McgcmsSort006SortIn;
import com.cloudframe.app.sort.file.McgcmsSort006SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort006SortOut1;
import com.cloudframe.app.sort.file.records.McgcmsSort006Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort006Detail;
import com.cloudframe.app.data.Field;
public class McgcmsSort006OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort006OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort006")
	McgcmsSort006Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort006SortOut0")
	McgcmsSort006SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort006SortOut1")
	McgcmsSort006SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("McgcmsSort006SortIn")
	McgcmsSort006SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;


    static final int OUTREC_SIZE = 0;    
	int recordLen = 0;
	

	byte[] repBytes = convertChar2EbcdicBytes("R".toCharArray());

    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    static final int OUTREC_SIZE0 = 98;
    static final int OUTREC_SIZE1 = 0;


	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=61;
	static final int OUTREC_POS3=70;
	static final int OUTREC_POS4=61;
	static final int OUTREC_POS5=0;
	static final int OUTREC_LEN1=61;
	static final int OUTREC_LEN2=9;
	static final int OUTREC_LEN3=9;
	static final int OUTREC_LEN4=9;
	static final int OUTREC_LEN5=1;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=61;
	static final int OUTREC_DES_POS3=70;
	static final int OUTREC_DES_POS4=79;
	static final int OUTREC_DES_POS5=97;
	static final int ARITHMETIC_POS1= 61;
	static final int ARITHMETIC_LEN1= 9;
	static final int ARITHMETIC_POS1_1= 70;
	static final int ARITHMETIC_LEN1_1= 9;
	static final int ARITHMETIC_OPERAND_VAL1_1= -1;
	static final String ARITHMETIC_FORMAT1= "PD";
	static final String ARITHMETIC_EDIT1= "TTTTTTTTTTTTTTTTTS";
	static final String ARITHMETIC_SIGN1= ",D,C";
	static final String ARITHMETIC_FORMAT1_1= "PD";
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
		    createRandomAccessFile();
		}
		logger.debug("Sort Writer initialized.");
	}

	List<McgcmsSort006Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		executeSumOutRecords();

		cfStepHandler.updateSortStepExecution("sort006");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {

         logger.info("STEPNAME: MCGCMSSORT006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT006 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
         sortOut1.close();
		sortRecKeys.clear();
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
  	 	byte[] recBytes = new byte[OUTREC_SIZE]; 
	    recordLen = record.length;
					switch(fileIndx) {
	case 0:
     	recBytes = new byte[OUTREC_SIZE0];
     	copyRecordBytes(fillSpace0, recBytes, 0, 0, OUTREC_SIZE0);
copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
copyRecordBytes(record, recBytes, OUTREC_POS2, OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
copyArithmeticBytes1(record, recBytes, OUTREC_DES_POS4);
 copyRecordBytes(repBytes, recBytes, OUTREC_POS5,OUTREC_DES_POS5,OUTREC_LEN5);
			break;
	case 1:
     /* No fields available for copy, return recevied record */ 
     recBytes = record; 
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	
	    private void copyArithmeticBytes1(byte[] record,byte[] recBytes,int outrecDesPos) {
  BigDecimal big = subPackDecimalBytes(record, ARITHMETIC_POS1, ARITHMETIC_POS1_1,  ARITHMETIC_LEN1, ARITHMETIC_LEN1_1);
  String decimalVal =  fillZeroFormatLength(big,18);
  decimalVal =  maskNumberFormatter(decimalVal, ARITHMETIC_EDIT1, ARITHMETIC_SIGN1);
  decimalVal =  fillSpaceFormatLength(decimalVal,18);
  byte[] copyArithmeticBytes = convertChar2EbcdicBytes(decimalVal.toCharArray());
   copyRecordBytes(copyArithmeticBytes,recBytes,  0, outrecDesPos,decimalVal.length());
}
	  
	final int OUTFILE_COUNT = 2;
	byte[] sumRec = null;
	McgcmsSort006Keys sortKey = null;
	int sortKey1Len = 35;
	int sortKey2Len = 1;
	int sortKey3Len = 25;
	int sumKey1Pos = 61;
	int sumKey1Len = 9;
	int sumKey1MaxPrec = (sumKey1Len-1)*2 +1;
	int sumKey2Pos = 70;
	int sumKey2Len = 9;
	int sumKey2MaxPrec = (sumKey2Len-1)*2 +1;
	private void addSumRecord(int index,int num) throws Exception {
		try {
			McgcmsSort006Keys recKey = sortRecKeys.get(index);
			byte[] recBytes = null;
				recBytes = readFromBuffer(recKey.getSortRecPos(), recKey.getSortRecLen()); 
			// Add Include or omit cases based on outrec Index
		    if(!validateSumRecord(recBytes, num)){
		    	return;
		    }
			if (sumRec == null) {
				setSumRecord(recKey, recBytes);
			} else {
				// check SumRec keys and fetched record keys
				if(				
				(Field.compareBytes(sortKey.getKeyCharacter1(), recKey.getKeyCharacter1(), 0, 0, sortKey1Len, sortKey1Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter2(), recKey.getKeyCharacter2(), 0, 0, sortKey2Len, sortKey2Len) == 0)
				 && 				
				(Field.compareBytes(sortKey.getKeyCharacter3(), recKey.getKeyCharacter3(), 0, 0, sortKey3Len, sortKey3Len) == 0)
				) {				
					BigDecimal sumKey1Val = addPackDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					BigDecimal sumKey2Val = addPackDecimalBytes(sumRec, sumKey2Pos, recBytes,sumKey2Pos, sumKey2Len);
					if(sumKey1Val.precision()<=sumKey1MaxPrec && sumKey2Val.precision()<=sumKey2MaxPrec) {
						ByteUtil.putPackedDecimalBigDecimal(sumKey1Val, sumRec, sumKey1Pos, sumKey1Len, true);
						ByteUtil.putPackedDecimalBigDecimal(sumKey2Val, sumRec, sumKey2Pos, sumKey2Len, true);
					} else {
						writeSumOut(sumRec,num);	/* overflow	*/					
						setSumRecord(recKey, recBytes);	/* reset sum Record value */
					}
				} else {
					writeSumOut(sumRec,num); /* record key not matches */					
					setSumRecord(recKey, recBytes); /* reset sum Record value */
				}
			}
		} catch (Exception e) {
			logger.error("Error in sum record : {}", e.getMessage());
		}
	}
	
	private void executeSumOutRecords() throws Exception {
		for (int f=0; f<OUTFILE_COUNT;f++) {
			sumRec = null;
			for (int i = 0; i < sortRecKeys.size(); i++) {
				addSumRecord(i, f);
			}
			if(sumRec!=null) writeSumOut(sumRec, f);
		}
	}	
  	
    private void setSumRecord(McgcmsSort006Keys key, byte[] recBytes) {
	    sumRec = new byte[key.getSortRecLen()];
	    copyRecordBytes(recBytes,sumRec,0,0,key.getSortRecLen());
	    sortKey = key;
    }
 
  	private void writeSumOut(byte[] outRecBytes, int num) throws CFException {
  	    outRecBytes = getOutRecord(outRecBytes, num);
		switch(num){
		case 0:		
			sortOut0.setRecord(outRecBytes, sortOut0.getRecordLen());
			sortOut0.write();
			recordCount0++;
			break;
		case 1:		
			sortOut1.setRecord(outRecBytes, sortOut1.getRecordLen());
			sortOut1.write();
			recordCount1++;
			break;
		default:
			break;
		}
	}
	
	private boolean validateSumRecord(byte[] outRecBytes,int num){
		boolean isValid = false;
		switch(num){
			case 0:			
		   if (true/*always execute*/) {  isValid = true; }
		  break;
			case 1:			
		  if ((Field.compareByte(outRecBytes[11],(byte)0xC1) != 0)) {  isValid = true; }
		  break;
		default:
			break;  		
		}
		return isValid; 
	}
	  
	  	
}
