package com.cloudframe.app.tasks;
import org.slf4j.Logger;
import org.springframework.batch.core.ExitStatus;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
import com.cloudframe.app.utility.CFUtil;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.MpsStep020_2Detail;
import com.cloudframe.app.data.Field;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;

import com.cloudframe.app.sort.file.MpsStep020_2SortIn;
import com.cloudframe.app.sort.file.MpsStep020_2SortOut;
import org.springframework.batch.repeat.RepeatStatus;
import java.util.List;
import java.io.RandomAccessFile;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.process.BaseProcess;
import java.util.Comparator;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudframe.app.sort.file.records.MpsStep020_2Keys;
import java.io.FileNotFoundException;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.StepExecution;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.sort.file.MpsStep020_2SortIn;
public class MpsStep020_2Sort extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(MpsStep020_2Sort.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_mpsstep020_2")
	MpsStep020_2Detail sortDetail;
	
	@Autowired
	@Qualifier("MpsStep020_2SortOut")
	MpsStep020_2SortOut sortOut;
	

	
	@Autowired
	@Qualifier("MpsStep020_2SortIn")
	MpsStep020_2SortIn sortIn;
	
	
    int recordCount = 0;



	byte[] outfilT1000 = convertChar2EbcdicBytes("DSACONTROLSV1.0".toCharArray());
	byte[] outfilT1001 = convertChar2EbcdicBytes(CFUtil.fillSpaces(235));
    private String filePath = "";

	List<MpsStep020_2Keys> sortRecKeys = null;
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
            byte[] outRecBytes = getSortedRecord(i);
		  
		    //NODETAIL available		     			
			recordCount++;
        }

	    addTrailer1ToOutFile();
		cfStepHandler.updateSortStepExecution("step020_2");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		sortIn.close();
		logger.debug("Sort input Reader ended.");
logger.info("STEPNAME: MPSSTEP020_2 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			MpsStep020_2Keys k = sortRecKeys.get(index);
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
		addHeaderTrailerRecords(Arrays.asList(outfilT1000,getZoneDecimalToEbcdicChar(Integer.toString(recordCount), 6),outfilT1001));
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
		List<MpsStep020_2Keys> sortRecKeys = sortDetail.getSortRecKeys();
		MpsStep020_2Keys relKey = new MpsStep020_2Keys();
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
         addRecordBytes4Sorting(record,record.length);
    }
	public void sortProcessor() throws Exception {
		logger.debug("Sort Processor initialized.");
		useSortTempFile(sortDetail.getTempFileVal());
	  doSort();
    }	
	public void doSort() throws Exception {
		// Sort algorithm here
		List<MpsStep020_2Keys> sortRecKeys = sortDetail.getSortRecKeys();
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
