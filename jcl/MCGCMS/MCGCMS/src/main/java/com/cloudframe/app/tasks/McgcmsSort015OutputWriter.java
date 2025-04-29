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
import com.cloudframe.app.sort.file.McgcmsSort015SortIn;
import com.cloudframe.app.sort.file.McgcmsSort015SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort015SortOut1;
import com.cloudframe.app.sort.file.records.McgcmsSort015Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort015Detail;
import com.cloudframe.app.data.Field;
public class McgcmsSort015OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(McgcmsSort015OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mcgcmssort015")
	McgcmsSort015Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort015SortOut0")
	McgcmsSort015SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort015SortOut1")
	McgcmsSort015SortOut1 sortOut1;
	

	
	@Autowired
	@Qualifier("McgcmsSort015SortIn")
	McgcmsSort015SortIn sortIn;
	
	
    int recordCount0 = 0;
    int recordCount1 = 0;


    static final int OUTREC_SIZE = 23;    
	int recordLen = 0;
	


    final byte[] fillSpace0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE0));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes2 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final int OUTREC_SIZE0 = 23;
    final byte[] fillSpace1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE1));
    final byte[] fillBytes5 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    final byte[] fillBytes6 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
    static final int OUTREC_SIZE1 = 23;


	byte[] sortof1Cond01 = convertChar2EbcdicBytes("C".toCharArray());
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_POS3=2;
	static final int OUTREC_POS4=0;
	static final int OUTREC_POS5=3;
	static final int OUTREC_POS6=0;
	static final int OUTREC_POS7=0;
	static final int OUTREC_POS8=2;
	static final int OUTREC_POS9=0;
	static final int OUTREC_POS10=3;
	static final int OUTREC_LEN1=2;
	static final int OUTREC_LEN2=1;
	static final int OUTREC_LEN3=1;
	static final int OUTREC_LEN4=1;
	static final int OUTREC_LEN5=18;
	static final int OUTREC_LEN6=2;
	static final int OUTREC_LEN7=1;
	static final int OUTREC_LEN8=1;
	static final int OUTREC_LEN9=1;
	static final int OUTREC_LEN10=18;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=2;
	static final int OUTREC_DES_POS3=3;
	static final int OUTREC_DES_POS4=4;
	static final int OUTREC_DES_POS5=5;
	static final int OUTREC_DES_POS6=0;
	static final int OUTREC_DES_POS7=2;
	static final int OUTREC_DES_POS8=3;
	static final int OUTREC_DES_POS9=4;
	static final int OUTREC_DES_POS10=5;
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

	List<McgcmsSort015Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		executeSumOutRecords();

		cfStepHandler.updateSortStepExecution("sort015");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {

         logger.info("STEPNAME: MCGCMSSORT015 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount0);
         sortOut0.close();
         logger.info("STEPNAME: MCGCMSSORT015 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount1);
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
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
             copyRecordBytes(fillBytes2,recBytes,OUTREC_POS4,OUTREC_DES_POS4,OUTREC_LEN4);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
			break;
	case 1:
     	recBytes = new byte[OUTREC_SIZE1];
     	copyRecordBytes(fillSpace1, recBytes, 0, 0, OUTREC_SIZE1);
copyRecordBytes(record, recBytes, OUTREC_POS6, OUTREC_DES_POS6,OUTREC_LEN6);
             copyRecordBytes(fillBytes5,recBytes,OUTREC_POS7,OUTREC_DES_POS7,OUTREC_LEN7);
copyRecordBytes(record, recBytes, OUTREC_POS8, OUTREC_DES_POS8,OUTREC_LEN8);
             copyRecordBytes(fillBytes6,recBytes,OUTREC_POS9,OUTREC_DES_POS9,OUTREC_LEN9);
copyRecordBytes(record, recBytes, OUTREC_POS10, OUTREC_DES_POS10,OUTREC_LEN10);
			break;
	default:
			break;
	}

		return recBytes;
  	}  
	  
	final int OUTFILE_COUNT = 2;
	byte[] sumRec = null;
	McgcmsSort015Keys sortKey = null;
	int sortKey1Len = 2;
	int sortKey2Len = 1;
	int sumKey1Pos = 3;
	int sumKey1Len = 18;
	private void addSumRecord(int index,int num) throws Exception {
		try {
			McgcmsSort015Keys recKey = sortRecKeys.get(index);
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
				) {				
					BigDecimal sumKey1Val = addZoneDecimalBytes(sumRec, sumKey1Pos, recBytes,sumKey1Pos, sumKey1Len);
					if(sumKey1Val.precision()<=sumKey1Len) {
						copyRecordBytes(getZoneDecimalToEbcdicChar(sumKey1Val.toString(),sumKey1Len),sumRec,0,sumKey1Pos, sumKey1Len);
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
  	
    private void setSumRecord(McgcmsSort015Keys key, byte[] recBytes) {
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
		  if ((Field.compareBytes(outRecBytes,sortof1Cond01,2,0,1,1) == 0)) {  isValid = true; }
		  break;
			case 1:			
		  if (!((Field.compareBytes(outRecBytes,sortof1Cond01,2,0,1,1) == 0))) {  isValid = true; }
		  break;
		default:
			break;  		
		}
		return isValid; 
	}
	  
	  	
}
