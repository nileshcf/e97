package com.cloudframe.app.tasks;

import java.util.List;
import java.util.ArrayList;

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
import com.cloudframe.app.sort.file.records.UsbrecdatDate1inKeys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.UsbrecdatDate1inDetail;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.UsbrecdatDate1inSortIn;
public class UsbrecdatDate1inInputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(UsbrecdatDate1inInputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_usbrecdatdate1in")
	UsbrecdatDate1inDetail sortDetail;
	
	@Autowired
	@Qualifier("UsbrecdatDate1inSortIn")
	UsbrecdatDate1inSortIn sortIn;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
	final int OUTREC_POS1=0;
	final int OUTREC_POS2=0;
	final int OUTREC_POS3=28;
	final int OUTREC_POS4=24;
	final int OUTREC_POS5=0;
	final int OUTREC_POS6=0;
	final int OUTREC_LEN1=33;
	final int OUTREC_LEN2=6;
	final int OUTREC_LEN3=4;
	final int OUTREC_LEN4=4;
	final int OUTREC_LEN5=2;
	final int OUTREC_LEN6=23;
	final int OUTREC_DES_POS1=0;
	final int OUTREC_DES_POS2=33;
	final int OUTREC_DES_POS3=39;
	final int OUTREC_DES_POS4=43;
	final int OUTREC_DES_POS5=47;
	final int OUTREC_DES_POS6=57;
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		useTempFile = sortDetail.useTempFile(true); 
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
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
		if(isUsingSortInFile())  setRecPos(0);	 
		record = sortIn.readRecord();					
		while (!sortIn.hasEnded() && record != null) {
			
			addSortRecordBytes(record);
			recCounter++;
			if(isUsingSortInFile()) setRecPos(getRecPos() + record.length); /* next record start position in SORT-IN File */
		    record = sortIn.readRecord();
		}
        sortDetail.setRecInCounter(recCounter);	
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
		return ExitStatus.COMPLETED;
	}

	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<UsbrecdatDate1inKeys> sortRecKeys = sortDetail.getSortRecKeys();
		UsbrecdatDate1inKeys relKey = new UsbrecdatDate1inKeys();
		relKey.setSortRecPos(getRecPos()); /* current record start position */
		relKey.setSortRecLen(byteLen);			
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
        byte[] inrec = getInrecRecord(record);
    	addRecordBytes4Sorting(inrec, inrec.length);
    }
    final byte[] fillBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(6));
    final byte[] fillBytes1 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
    byte[] dateTimeBytes2 = convertChar2EbcdicBytes(getCustomDateFormatValue("&DATE1","-5"));
    final byte[] fillBytes3 = convertChar2EbcdicBytes(CFUtil.fillSpaces(23));

    private byte[] getInrecRecord(byte[] record) {  
	    byte[] recBytes = new byte[80];	 	
	    copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
             copyRecordBytes(fillBytes,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);
copyRecordBytes(record, recBytes, OUTREC_POS3, OUTREC_DES_POS3,OUTREC_LEN3);
copyRecordBytes(record, recBytes, OUTREC_POS4, OUTREC_DES_POS4,OUTREC_LEN4);
             copyRecordBytes(fillBytes1,recBytes,OUTREC_POS5,OUTREC_DES_POS5,OUTREC_LEN5);
copyRecordBytes(dateTimeBytes2, recBytes, 0, 49,8);
             copyRecordBytes(fillBytes3,recBytes,OUTREC_POS6,OUTREC_DES_POS6,OUTREC_LEN6);
	
	    return recBytes;
  	}  

}
