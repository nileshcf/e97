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
import com.cloudframe.app.sort.file.records.Ice002P060Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Ice002P060Detail;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import java.math.BigDecimal;
import com.cloudframe.app.sort.file.Ice002P060SortIn;
public class Ice002P060InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Ice002P060InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_ice002p060")
	Ice002P060Detail sortDetail;
	
	@Autowired
	@Qualifier("Ice002P060SortIn")
	Ice002P060SortIn sortIn;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
	static final int KEY_POS0 = 0;
	static final int KEY_POS1 = 3;
	static final int KEY_LEN0 = 3;
	static final int KEY_LEN1 = 43;
     byte[] filter1 = convertChar2EbcdicBytes("END".toCharArray());
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
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
		List<Ice002P060Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Ice002P060Keys relKey = new Ice002P060Keys();
        relKey.setKeyBinary1(getRecordKeyBytes(recordByte, KEY_POS0 , KEY_LEN0)); 
        relKey.setKeyBinary2(getRecordKeyBytes(recordByte, KEY_POS1 , KEY_LEN1)); 
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
	   if(!((Field.compareBytes(record,filter1,0,0,3,3) == 0))) {
        byte[] inrecBuild = createInrecBuildRecord(record);
        addRecordBytes4Sorting(inrecBuild, inrecBuild.length);
	   }
    }

       final byte[] whenBytes00 = convertChar2EbcdicBytes("AK1".toCharArray());
       final byte[] fillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_OUTREC_SIZE));
       final byte[] outrecBuildLtrl01 = convertChar2EbcdicBytes("  ".toCharArray());
       static final int BUILD_OUTREC_SIZE = 54;

   public byte[] createInrecBuildRecord(byte[] record) {
    byte[] buildRec = new byte[BUILD_OUTREC_SIZE];
    copyRecordBytes(fillBuildBytes, buildRec, 0, 0,BUILD_OUTREC_SIZE);
          if (Field.compareBytes(record, whenBytes00, 0, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,44);
copyRecordBytes(outrecBuildLtrl01, buildRec, 0,44,2); 
copyRecordBytes(record, buildRec, 44,46,8);
 }else { return record;}
    return buildRec;
   }
}
