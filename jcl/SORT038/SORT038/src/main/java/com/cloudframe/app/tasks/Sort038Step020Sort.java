package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import java.math.BigDecimal;
import com.cloudframe.app.sort.Sort038Step020Detail;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.file.Sort038Step020SortOut;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sort.file.Sort038Step020SortIn;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;
import com.cloudframe.app.sort.file.Sort038Step020SortIn;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.sort.file.records.Sort038Step020Keys;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class Sort038Step020Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Sort038Step020Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_sort038step020")
	Sort038Step020Detail sortDetail;
	
	@Autowired
	@Qualifier("Sort038Step020SortOut")
	Sort038Step020SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Sort038Step020SortIn")
	Sort038Step020SortIn sortIn;
	
	
    int recordCount = 0;



    private String filePath = "";

	List<Sort038Step020Keys> sortRecKeys = null;
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
	final int INREC_POS1=0;
	final int INREC_POS2=9;
	final int INREC_POS3=10;
	final int INREC_POS4=11;
	final int INREC_POS5=12;
	final int INREC_POS6=13;
	final int INREC_POS7=14;
	final int INREC_POS8=15;
	final int INREC_POS9=16;
	final int INREC_LEN1=9;
	final int INREC_LEN2=1;
	final int INREC_LEN3=1;
	final int INREC_LEN4=1;
	final int INREC_LEN5=1;
	final int INREC_LEN6=1;
	final int INREC_LEN7=1;
	final int INREC_LEN8=1;
	final int INREC_LEN9=1;
	final int INREC_DES_POS1=80;
	final int INREC_DES_POS2=90;
	final int INREC_DES_POS3=92;
	final int INREC_DES_POS4=94;
	final int INREC_DES_POS5=96;
	final int INREC_DES_POS6=98;
	final int INREC_DES_POS7=100;
	final int INREC_DES_POS8=102;
	final int INREC_DES_POS9=104;
    byte[] inrecOverlay1 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] inrecOverlay2 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] inrecOverlay3 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] inrecOverlay4 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] inrecOverlay5 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] inrecOverlay6 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] inrecOverlay7 = convertChar2EbcdicBytes("0".toCharArray());
    byte[] inrecOverlay8 = convertChar2EbcdicBytes("0".toCharArray());
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
		useTempFile = sortDetail.useTempFile(true); 
		sortIn.open("r", sortIn.getFileName(), sortIn.getRecordLen(), sortIn.isFBRec());
		initializeSort();
	try {
	   processRead();
       sortProcessor();
	} catch (Exception e) {
	   logger.error("Error in SORT Process : {}", e.getMessage());
	}	
        		
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
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getSortedRecord(i);
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

		cfStepHandler.updateSortStepExecution("step020");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: SORT038STEP020 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
		sortOut.close();

		sortRecKeys.clear();
		if(isWriteInTempFile()) {
			stopExecutorServ();
		}
		removeTempFile();	
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
			Sort038Step020Keys k = sortRecKeys.get(index);
			return readFromBuffer(k.getSortRecPos(), k.getSortRecLen());
		} catch (Exception e) {
			logger.error("Error in return record : {}", e.getMessage());
		}
		return new byte[0];
	}

    private void createRandomAccessFile() {          
		try {
			this.setRaFile(new RandomAccessFile(new File(filePath + sortIn.getFileName()), "rw"));
		} catch (FileNotFoundException e) {
			logger.error("Error access on file - Exception: {} ", e.getMessage());
		}
    }
	  
	  
	  
	  



	public void processRead() throws Exception {
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
	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<Sort038Step020Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Sort038Step020Keys relKey = new Sort038Step020Keys();
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
      copyRecordBytes( record, rec, INREC_POS1, INREC_DES_POS1, INREC_LEN1); 
         copyRecordBytes(inrecOverlay1,rec, 0, 89, inrecOverlay1.length); 
      copyRecordBytes( record, rec, INREC_POS2, INREC_DES_POS2, INREC_LEN2); 
         copyRecordBytes(inrecOverlay2,rec, 0, 91, inrecOverlay2.length); 
      copyRecordBytes( record, rec, INREC_POS3, INREC_DES_POS3, INREC_LEN3); 
         copyRecordBytes(inrecOverlay3,rec, 0, 93, inrecOverlay3.length); 
      copyRecordBytes( record, rec, INREC_POS4, INREC_DES_POS4, INREC_LEN4); 
         copyRecordBytes(inrecOverlay4,rec, 0, 95, inrecOverlay4.length); 
      copyRecordBytes( record, rec, INREC_POS5, INREC_DES_POS5, INREC_LEN5); 
         copyRecordBytes(inrecOverlay5,rec, 0, 97, inrecOverlay5.length); 
      copyRecordBytes( record, rec, INREC_POS6, INREC_DES_POS6, INREC_LEN6); 
         copyRecordBytes(inrecOverlay6,rec, 0, 99, inrecOverlay6.length); 
      copyRecordBytes( record, rec, INREC_POS7, INREC_DES_POS7, INREC_LEN7); 
         copyRecordBytes(inrecOverlay7,rec, 0, 101, inrecOverlay7.length); 
      copyRecordBytes( record, rec, INREC_POS8, INREC_DES_POS8, INREC_LEN8); 
         copyRecordBytes(inrecOverlay8,rec, 0, 103, inrecOverlay8.length); 
      copyRecordBytes( record, rec, INREC_POS9, INREC_DES_POS9, INREC_LEN9); 

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
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		List<Sort038Step020Keys> sortRecKeys = sortDetail.getSortRecKeys();
		if(isWriteInTempFile()) {
            // Make sure the input file is fully loaded
            boolean isCountMatches = true;
            this.setWriteCounter(sortDetail.getWriteCounter());
               int recordKeyCount = sortRecKeys.size();
               while (isCountMatches) { 
                   isCountMatches = recordKeyCount != getWriteCounter().get();

            }
        }                	
		logger.debug("Sort Processor ended.");
	}
}
