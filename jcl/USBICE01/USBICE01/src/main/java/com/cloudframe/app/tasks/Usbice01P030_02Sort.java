package com.cloudframe.app.tasks;
import com.cloudframe.app.sort.file.Usbice01P030_02SortIn;
import org.slf4j.Logger;
import java.math.BigDecimal;
import com.cloudframe.app.sort.file.Usbice01P030_02SortIn;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.data.Field;
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
import com.cloudframe.app.sort.Usbice01P030_02Detail;
import com.cloudframe.app.sort.file.records.Usbice01P030_02Keys;
import org.springframework.batch.core.StepExecutionListener;
import com.cloudframe.app.sort.file.Usbice01P030_02SortOut;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
public class Usbice01P030_02Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Usbice01P030_02Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_usbice01p030_02")
	Usbice01P030_02Detail sortDetail;
	
	@Autowired
	@Qualifier("Usbice01P030_02SortOut")
	Usbice01P030_02SortOut sortOut;
	

	
	@Autowired
	@Qualifier("Usbice01P030_02SortIn")
	Usbice01P030_02SortIn sortIn;
	
	
    int recordCount = 0;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_REC_SIZE = 80;
    static final int OUTFIL_BUILD_REC_SIZE0 = 80;
	static final int OUTFIL_BUILD_SRCPOS00 = 0;
	static final int OUTFIL_BUILD_POS00 = 0;
	static final int OUTFIL_BUILD_LEN00 = 2;
	static final int OUTFIL_BUILD_SRCPOS01 = 4;
	static final int OUTFIL_BUILD_POS01 = 2;
	static final int OUTFIL_BUILD_LEN01 = 67;
	static final int OUTFIL_BUILD_SRCPOS02 = 0;
	static final int OUTFIL_BUILD_POS02 = 69;
	static final int OUTFIL_BUILD_LEN02 = 11;


	byte[] outfilT1000 = convertChar2EbcdicBytes(CFUtil.fillSpaces(8));
	byte[] outfilT1001 = convertChar2EbcdicBytes("SET MAXCC=0".toCharArray());
	final byte[] outfilBuildLtrl00 = convertChar2EbcdicBytes(CFUtil.fillSpaces(2));
	final byte[] outfilBuildLtrl02 = convertChar2EbcdicBytes(CFUtil.fillSpaces(11));
    private String filePath = "";

	List<Usbice01P030_02Keys> sortRecKeys = null;
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    private String useTempFile="yes";

    int recCounter = 0;
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
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
            byte[] outRecBytes = buildOutRecBytes(getSortedRecord(i),0,OUTFIL_BUILD_REC_SIZE);
		  
		    		    
		    //write into sortOut file
			sortOut.setRecord(outRecBytes, sortOut.getRecordLen());
			sortOut.write(); 			
			recordCount++;
			//ended
        }

	    addTrailer1ToOutFile();
		cfStepHandler.updateSortStepExecution("p030_02");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: USBICE01P030_02 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			Usbice01P030_02Keys k = sortRecKeys.get(index);
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
	  
	  
	  
	private void addHeaderTrailerRecords(List<byte[]>  recordList) {	
		//
	 	byte[] startRec = convertChar2EbcdicBytes("1/".toCharArray());
		byte[] startChar = convertChar2EbcdicBytes("1".toCharArray());
	 	byte[] nextRec = convertChar2EbcdicBytes("/".toCharArray());
        byte[] recordByte = getHeaderSpaceBytes();
		int pos=0;
		int len=0; 
		boolean recordBytesAdded = false;
		for(int i=0; i<recordList.size();i++) {
			byte[] bArr = recordList.get(i);
			len =bArr.length;
			if (len==1 && Field.compareBytes(nextRec, bArr, 0, 0, 1, 1) == 0 
				|| len==2 && Field.compareBytes(startRec, bArr, 0, 0, 2, 2) == 0) {
				if(recordBytesAdded)					
					writeHeaderTrailers(recordByte);
				recordByte = getHeaderSpaceBytes();
				if(len==2) 
					copyRecordBytes(startChar, recordByte, 0, 0, 1);

				if(i>0 && i<(recordList.size()-1)) {
					byte[] bArr2 = recordList.get(++i);
					len =bArr2.length;
					copyRecordBytes(bArr2, recordByte, 0, 0, len);
					pos = 0+bArr2.length; // next start position
					recordBytesAdded = true;
				} else {
					writeHeaderTrailers(recordByte);
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
			writeHeaderTrailers(recordByte);
	}
	
	private void writeHeaderTrailers(byte[] record) {
		try {
			sortOut.setRecord(record, sortOut.getRecordLen());
			sortOut.write();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private byte[] getHeaderSpaceBytes() {
	   return convertChar2EbcdicBytes(CFUtil.fillSpaces(sortOut.getRecordLen()));	
	}


	private void addTrailer1ToOutFile(){
		addHeaderTrailerRecords(Arrays.asList(outfilT1000,outfilT1001));
	}
	  


	private byte[] buildOutRecBytes(byte[] outrec, int num, int buildSize) {
		byte[] outRecBytes = new byte[buildSize];
        final byte[] fillCondBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(buildSize));
		copyRecordBytes(fillCondBuildBytes, outRecBytes, 0, 0,buildSize);
		switch(num){
		case 0:
		    copyRecordBytes(outfilBuildLtrl00, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS00, OUTFIL_BUILD_LEN00);
		    copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_SRCPOS01, OUTFIL_BUILD_POS01, OUTFIL_BUILD_LEN01);
		    copyRecordBytes(outfilBuildLtrl02, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS02, OUTFIL_BUILD_LEN02);
			break;	
		default:
			copyRecordBytes(outrec, outRecBytes, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, buildSize);
			break;
		}
		return outRecBytes;
	}	


	public void processRead() throws Exception {
		byte[] record = null;
		if(isUsingSortInFile())  setRecPos(0);	 
		record = sortIn.readRecord();					
		while (!sortIn.hasEnded() && record != null) {
			if(isUsingSortInFile()) setRecPos(getRecPos()+4);  /* Variable record data start position */
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
		List<Usbice01P030_02Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Usbice01P030_02Keys relKey = new Usbice01P030_02Keys();
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
        byte[] inrecBuild = createInrecBuildRecord(record);
        addRecordBytes4Sorting(inrecBuild, inrecBuild.length);
    }
       final byte[] inrecwhenBytes00 = convertChar2EbcdicBytes("TM.".toCharArray());
       final byte[] inrecFillBuildBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(BUILD_INREC_SIZE));
       final byte[] inrecBuildLtrl01 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] inrecBuildLtrl03 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] inrecwhenBytes10 = convertChar2EbcdicBytes("TM3".toCharArray());
       final byte[] inrecBuildLtrl11 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] inrecBuildLtrl13 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] inrecwhenBytes20 = convertChar2EbcdicBytes("TME".toCharArray());
       final byte[] inrecBuildLtrl21 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] inrecBuildLtrl23 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] inrecwhenBytes30 = convertChar2EbcdicBytes("TM.".toCharArray());
       final byte[] inrecBuildLtrl31 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] inrecBuildLtrl33 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] inrecwhenBytes40 = convertChar2EbcdicBytes("TM3".toCharArray());
       final byte[] inrecBuildLtrl41 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] inrecBuildLtrl43 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       final byte[] inrecwhenBytes50 = convertChar2EbcdicBytes("TME".toCharArray());
       final byte[] inrecBuildLtrl51 = convertChar2EbcdicBytes("REPRO IDS(".toCharArray());
       final byte[] inrecBuildLtrl53 = convertChar2EbcdicBytes(") OFILE(MODDD2)".toCharArray());
       static final int BUILD_INREC_SIZE = 125;

   public byte[] createInrecBuildRecord(byte[] record) {
    byte[] buildRec = new byte[BUILD_INREC_SIZE];
    copyRecordBytes(inrecFillBuildBytes, buildRec, 0, 0,BUILD_INREC_SIZE);
     if (Field.compareBytes(record, inrecwhenBytes00, 25, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(inrecBuildLtrl01, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 17,14,36);
copyRecordBytes(inrecBuildLtrl03, buildRec, 0,50,15); 
 } else if (Field.compareBytes(record, inrecwhenBytes10, 25, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(inrecBuildLtrl11, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 17,14,37);
copyRecordBytes(inrecBuildLtrl13, buildRec, 0,51,15); 
 } else if (Field.compareBytes(record, inrecwhenBytes20, 25, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(inrecBuildLtrl21, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 17,14,37);
copyRecordBytes(inrecBuildLtrl23, buildRec, 0,51,15); 
 } else if (Field.compareBytes(record, inrecwhenBytes30, 24, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(inrecBuildLtrl31, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 16,14,36);
copyRecordBytes(inrecBuildLtrl33, buildRec, 0,50,15); 
 } else if (Field.compareBytes(record, inrecwhenBytes40, 24, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(inrecBuildLtrl41, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 16,14,37);
copyRecordBytes(inrecBuildLtrl43, buildRec, 0,51,15); 
 } else if (Field.compareBytes(record, inrecwhenBytes50, 24, 0, 3, 3)  == 0) { 
copyRecordBytes(record, buildRec, 0,0,4);
copyRecordBytes(inrecBuildLtrl51, buildRec, 0,4,10); 
copyRecordBytes(record, buildRec, 16,14,37);
copyRecordBytes(inrecBuildLtrl53, buildRec, 0,51,15); 
 }else { return record;}
    return buildRec;
   }
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		List<Usbice01P030_02Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
