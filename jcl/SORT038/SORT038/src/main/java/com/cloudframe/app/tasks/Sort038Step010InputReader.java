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
import com.cloudframe.app.sort.file.records.Sort038Step010Keys;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sort038Step010Detail;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import java.math.BigDecimal;
import com.cloudframe.app.sort.file.Sort038Step010SortIn;
public class Sort038Step010InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Sort038Step010InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

	@Autowired
	@Qualifier("batch_sort038step010")
	Sort038Step010Detail sortDetail;
	
	@Autowired
	@Qualifier("Sort038Step010SortIn")
	Sort038Step010SortIn sortIn;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int recCounter = 0;
	final int OUTREC_POS1=0;
	final int OUTREC_POS2=9;
	final int OUTREC_POS3=10;
	final int OUTREC_POS4=11;
	final int OUTREC_POS5=12;
	final int OUTREC_POS6=13;
	final int OUTREC_POS7=14;
	final int OUTREC_POS8=15;
	final int OUTREC_POS9=16;
	final int OUTREC_LEN1=9;
	final int OUTREC_LEN2=1;
	final int OUTREC_LEN3=1;
	final int OUTREC_LEN4=1;
	final int OUTREC_LEN5=1;
	final int OUTREC_LEN6=1;
	final int OUTREC_LEN7=1;
	final int OUTREC_LEN8=1;
	final int OUTREC_LEN9=1;
	final int OUTREC_DES_POS1=80;
	final int OUTREC_DES_POS2=90;
	final int OUTREC_DES_POS3=92;
	final int OUTREC_DES_POS4=94;
	final int OUTREC_DES_POS5=96;
	final int OUTREC_DES_POS6=98;
	final int OUTREC_DES_POS7=100;
	final int OUTREC_DES_POS8=102;
	final int OUTREC_DES_POS9=104;
    byte[] overlay1 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] overlay2 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] overlay3 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] overlay4 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] overlay5 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] overlay6 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] overlay7 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] overlay8 = convertChar2EbcdicBytes("0".toCharArray());
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
		List<Sort038Step010Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Sort038Step010Keys relKey = new Sort038Step010Keys();
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
        byte[] inrecBuild = createInrecBuildRecord(inrec);
        addRecordBytes4Sorting(inrecBuild, inrecBuild.length);
    }

    private byte[] getInrecRecord(byte[] record) {  
        
        

         int newInRecSize = 105;
         byte[] rec = new byte[newInRecSize];

         copyRecordBytes(record, rec, 0, 0, record.length);
      copyRecordBytes( record, rec, OUTREC_POS1, OUTREC_DES_POS1, OUTREC_LEN1); 
         copyRecordBytes(overlay1,rec, 0, 89, overlay1.length); 
      copyRecordBytes( record, rec, OUTREC_POS2, OUTREC_DES_POS2, OUTREC_LEN2); 
         copyRecordBytes(overlay2,rec, 0, 91, overlay2.length); 
      copyRecordBytes( record, rec, OUTREC_POS3, OUTREC_DES_POS3, OUTREC_LEN3); 
         copyRecordBytes(overlay3,rec, 0, 93, overlay3.length); 
      copyRecordBytes( record, rec, OUTREC_POS4, OUTREC_DES_POS4, OUTREC_LEN4); 
         copyRecordBytes(overlay4,rec, 0, 95, overlay4.length); 
      copyRecordBytes( record, rec, OUTREC_POS5, OUTREC_DES_POS5, OUTREC_LEN5); 
         copyRecordBytes(overlay5,rec, 0, 97, overlay5.length); 
      copyRecordBytes( record, rec, OUTREC_POS6, OUTREC_DES_POS6, OUTREC_LEN6); 
         copyRecordBytes(overlay6,rec, 0, 99, overlay6.length); 
      copyRecordBytes( record, rec, OUTREC_POS7, OUTREC_DES_POS7, OUTREC_LEN7); 
         copyRecordBytes(overlay7,rec, 0, 101, overlay7.length); 
      copyRecordBytes( record, rec, OUTREC_POS8, OUTREC_DES_POS8, OUTREC_LEN8); 
         copyRecordBytes(overlay8,rec, 0, 103, overlay8.length); 
      copyRecordBytes( record, rec, OUTREC_POS9, OUTREC_DES_POS9, OUTREC_LEN9); 

      setFindrepRecordBytes(rec);
      return rec;
  	}  

        byte[] findrepIn1 = convertChar2EbcdicBytes("0A".toCharArray());
        byte[] findrepOut1 = convertChar2EbcdicBytes("10".toCharArray());
        byte[] findrepIn2 = convertChar2EbcdicBytes("0B".toCharArray());
        byte[] findrepOut2 = convertChar2EbcdicBytes("11".toCharArray());
        byte[] findrepIn3 = convertChar2EbcdicBytes("0C".toCharArray());
        byte[] findrepOut3 = convertChar2EbcdicBytes("12".toCharArray());
        byte[] findrepIn4 = convertChar2EbcdicBytes("0D".toCharArray());
        byte[] findrepOut4 = convertChar2EbcdicBytes("13".toCharArray());
        byte[] findrepIn5 = convertChar2EbcdicBytes("0E".toCharArray());
        byte[] findrepOut5 = convertChar2EbcdicBytes("14".toCharArray());
        byte[] findrepIn6 = convertChar2EbcdicBytes("0F".toCharArray());
        byte[] findrepOut6 = convertChar2EbcdicBytes("15".toCharArray());

    public void setFindrepRecordBytes(byte[] recBytes){ 
        
          for (int i = 89; i < recBytes.length;)
          {
          byte[] findRep1 = new byte[2];

          copyRecordBytes(recBytes, findRep1, i, 0, 2);
          if (Field.compareBytes(findRep1, findrepIn1) == 0)
          copyRecordBytes(findrepOut1, recBytes, 0, i, 2);
          byte[] findRep2 = new byte[2];

          copyRecordBytes(recBytes, findRep2, i, 0, 2);
          if (Field.compareBytes(findRep2, findrepIn2) == 0)
          copyRecordBytes(findrepOut2, recBytes, 0, i, 2);
          byte[] findRep3 = new byte[2];

          copyRecordBytes(recBytes, findRep3, i, 0, 2);
          if (Field.compareBytes(findRep3, findrepIn3) == 0)
          copyRecordBytes(findrepOut3, recBytes, 0, i, 2);
          byte[] findRep4 = new byte[2];

          copyRecordBytes(recBytes, findRep4, i, 0, 2);
          if (Field.compareBytes(findRep4, findrepIn4) == 0)
          copyRecordBytes(findrepOut4, recBytes, 0, i, 2);
          byte[] findRep5 = new byte[2];

          copyRecordBytes(recBytes, findRep5, i, 0, 2);
          if (Field.compareBytes(findRep5, findrepIn5) == 0)
          copyRecordBytes(findrepOut5, recBytes, 0, i, 2);
          byte[] findRep6 = new byte[2];

          copyRecordBytes(recBytes, findRep6, i, 0, 2);
          if (Field.compareBytes(findRep6, findrepIn6) == 0)
          copyRecordBytes(findrepOut6, recBytes, 0, i, 2);
             i = i + 2;
        }
    }
       static final int BUILD_INREC_SIZE = 17;

   public byte[] createInrecBuildRecord(byte[] record) {
          byte[] buildRec = new byte[BUILD_INREC_SIZE];
       copyRecordBytes(record, buildRec, 80,0,9); 
       BigDecimal result = (mulZoneDecimalBytes(record, 89,2,BigDecimal.valueOf(+201326592))) 
       .add(mulZoneDecimalBytes(record, 91,2,BigDecimal.valueOf(+16777516))) 
       .add(mulZoneDecimalBytes(record, 93,2,BigDecimal.valueOf(+1048576))) 
       .add(mulZoneDecimalBytes(record, 95,2,BigDecimal.valueOf(+65536))) 
       .add(mulZoneDecimalBytes(record, 97,2,BigDecimal.valueOf(+4096))) 
       .add(mulZoneDecimalBytes(record, 99,2,BigDecimal.valueOf(+256))) 
       .add(mulZoneDecimalBytes(record, 101,2,BigDecimal.valueOf(+16))) 
       .add(mulZoneDecimalBytes(record, 103,2,BigDecimal.valueOf(1))); 
       String resultStr = result.toString(); 
       while (resultStr.length() < 8) {
       resultStr = "0" + resultStr;  }
       if (resultStr.length() > 8) {
       resultStr = resultStr.substring((resultStr.length() - 8)); }
       copyRecordBytes(convertChar2EbcdicBytes(resultStr.toCharArray()), buildRec, 0, 9, 8);
       return buildRec;
   }
}
