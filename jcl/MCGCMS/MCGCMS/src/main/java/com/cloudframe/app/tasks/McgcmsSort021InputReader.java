package com.cloudframe.app.tasks;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.records.McgcmsSort021Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort021Detail;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.McgcmsSort021SortIn0;
import com.cloudframe.app.sort.file.McgcmsSort021SortIn1;
public class McgcmsSort021InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort021InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_mcgcmssort021")
	McgcmsSort021Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort021SortIn0")
	McgcmsSort021SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort021SortIn1")
	McgcmsSort021SortIn1 sortIn1;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_LEN0 = 17;
	final int OUTREC_POS1=222;
	final int OUTREC_POS2=0;
	final int OUTREC_POS3=74;
	final int OUTREC_POS4=75;
	final int OUTREC_POS5=106;
	final int OUTREC_POS6=0;
	final int OUTREC_POS7=107;
	final int OUTREC_POS8=140;
	final int OUTREC_LEN1=11;
	final int OUTREC_LEN2=1;
	final int OUTREC_LEN3=1;
	final int OUTREC_LEN4=3;
	final int OUTREC_LEN5=1;
	final int OUTREC_LEN6=1;
	final int OUTREC_LEN7=11;
	final int OUTREC_LEN8=6;
	final int OUTREC_DES_POS1=0;
	final int OUTREC_DES_POS2=6;
	final int OUTREC_DES_POS3=7;
	final int OUTREC_DES_POS4=8;
	final int OUTREC_DES_POS5=15;
	final int OUTREC_DES_POS6=16;
	final int OUTREC_DES_POS7=17;
	final int OUTREC_DES_POS8=28;
     byte[] filter1 = convertChar2EbcdicBytes("02".toCharArray());
     byte[] filter2 = convertChar2EbcdicBytes("03".toCharArray());
    byte[] changeCond0 = convertChar2EbcdicBytes("X".toCharArray());
    byte[] changeVal0 = convertChar2EbcdicBytes("XSIF".toCharArray());
    byte[] noMatchVal2 = convertChar2EbcdicBytes("SIF ".toCharArray());
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		useTempFile = sortDetail.useTempFile(true); 
		sortIn0.open("r", sortIn0.getFileName(), sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortIn1.open("r", sortIn1.getFileName(), sortIn1.getRecordLen(), sortIn1.isFBRec());
		initializeSort();
	}

	private void initializeSort() {
        this.setRecPos(0);
        this.setRecIndex(-1);
		this.recCounter = 0;
        useSortTempFile(useTempFile);
        sortDetail.setTempFileVal(useTempFile);
        if (isWriteInTempFile()) {
	        doSortPresets();
	        this.getWriteCounter().set(0);
	        sortDetail.setWriteCounter(this.getWriteCounter());
	        sortDetail.setSortFile(this.getRaFile());
	        sortDetail.setTempFile(this.getTmpFile());
	        sortDetail.setExecutorService(this.getExecutorService());
        }
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		byte[] record = null;
		if(isUsingSortInFile())  setRecPos(0); fileIndx=0;	 
		record = sortIn0.readRecord();					
		while (!sortIn0.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn0.readRecord();
		}
		if(isUsingSortInFile())  setRecPos(0); fileIndx=1;	 
		record = sortIn1.readRecord();					
		while (!sortIn1.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn1.readRecord();
		}
        sortDetail.setRecInCounter(recCounter);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn0.close();
		sortIn1.close();
		logger.debug("Sort input Reader ended.");
		return ExitStatus.COMPLETED;
	}

	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<McgcmsSort021Keys> sortRecKeys = sortDetail.getSortRecKeys();
		McgcmsSort021Keys relKey = new McgcmsSort021Keys();
        relKey.setKeyCharacter1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
        relKey.setFileIndx(fileIndx);
		sortRecKeys.add(relKey);
        if (isWriteInTempFile()) {
            setRecPos(getRecPos() + byteLen); /* next record position in tempFile */
            writeToTempFile(recordByte);
        }
	}

	/**
	 * This Method is used to add sort record with COND
	 * @param
	 */	
    protected void addSortRecordBytes(byte[] record){ 
	   if(((Field.compareBytes(record,filter1,146,0,2,2) == 0) || (Field.compareBytes(record,filter2,146,0,2,2) == 0))) {
        byte[] inrec = getInrecRecord(record);
    	addRecordBytes4Sorting(inrec, inrec.length);
	   }
    }
    final byte[] repBytes = convertChar2EbcdicBytes("M".toCharArray());
    final byte[] repBytes1 = convertChar2EbcdicBytes("R".toCharArray());

    private byte[] getInrecRecord(byte[] record) {  
	    byte[] recBytes = new byte[34];	 	
	    copyToRecordFormatBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1,"ZD","PD",false);
copyRecordBytes(repBytes, recBytes, OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
copyRecordBytes(record, recBytes, OUTREC_POS4, OUTREC_DES_POS4,OUTREC_LEN4);
setChangeBytes(record,recBytes,11,0/*caseId*/);
copyRecordBytes(record, recBytes, OUTREC_POS5, OUTREC_DES_POS5,OUTREC_LEN5);
copyRecordBytes(repBytes1, recBytes, OUTREC_POS6,OUTREC_DES_POS6,OUTREC_LEN6);
copyRecordBytes(record, recBytes, OUTREC_POS7, OUTREC_DES_POS7,OUTREC_LEN7);
copyRecordBytes(record, recBytes, OUTREC_POS8, OUTREC_DES_POS8,OUTREC_LEN8);
	
	    return recBytes;
  	}  

	private void setChangeBytes(byte[] record,byte[] recBytes,int pos, int changeId) {
              if (Field.compareBytes(record, changeCond0,233, 0,1,1) == 0) {
                copyRecordBytes(changeVal0, recBytes, 0, pos,4);
              } else {
                copyRecordBytes(noMatchVal2,recBytes, 0,  pos,4);
              } 
	}	
}
