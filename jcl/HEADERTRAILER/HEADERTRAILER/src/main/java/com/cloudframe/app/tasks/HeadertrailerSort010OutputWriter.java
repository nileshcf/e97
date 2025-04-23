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
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.sort.file.HeadertrailerSort010SortIn;
import com.cloudframe.app.sort.file.HeadertrailerSort010SortOut;
import com.cloudframe.app.sort.file.records.HeadertrailerSort010Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.HeadertrailerSort010Detail;
import com.cloudframe.app.data.Field;
import java.util.Arrays;
public class HeadertrailerSort010OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(HeadertrailerSort010OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_headertrailersort010")
	HeadertrailerSort010Detail sortDetail;
	
	@Autowired
	@Qualifier("HeadertrailerSort010SortOut")
	HeadertrailerSort010SortOut sortOut;
	

	
	@Autowired
	@Qualifier("HeadertrailerSort010SortIn")
	HeadertrailerSort010SortIn sortIn;
	
	
    int recordCount = 0;


    static final int OUTREC_SIZE = 5000;    
	int recordLen = 0;
	


    final byte[] fillBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));


	byte[] outfilH1000S1 = convertChar2EbcdicBytes("HEADER-".toCharArray());
	byte[] outfilH1001S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH1001S1 = convertChar2EbcdicBytes("UNLOADED TABLE FOR IOS".toCharArray());
	byte[] outfilH1003S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH1003S1 = convertChar2EbcdicBytes("TGPAPQD".toCharArray());
	byte[] outfilH1005S0 = convertChar2EbcdicBytes(CFUtil.fillSpaces(1));
	byte[] outfilH1005S1 = convertChar2EbcdicBytes("04/10/2023".toCharArray());
	byte[] outfilH1007 = convertChar2EbcdicBytes("@".toCharArray());
	byte[] outfilH1008 = convertChar2EbcdicBytes("09:52:04".toCharArray());
	byte[] outfilT1009S1 = convertChar2EbcdicBytes("NUMBER OF RECORDS FOR TGPAPQD: ".toCharArray());
	final String COUNT_MASK_PATTERN_OUTFILT10010="M11";
	final int COUNT_MASK_LENGTH_OUTFILT10010=9;
	static final int OUTREC_POS1=0;
	static final int OUTREC_POS2=0;
	static final int OUTREC_LEN1=91;
	static final int OUTREC_LEN2=1;
	static final int OUTREC_DES_POS1=0;
	static final int OUTREC_DES_POS2=4999;
    private String filePath = "";
     
	@Override
	public void beforeStep(StepExecution stepExecution) {
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

	List<HeadertrailerSort010Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		addOutFileHeaders();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
		  byte[] outRecBytes = getSortedRecord(i); 
		  
		    //write into sortOut file		    
		    byte[] outRecord = getOutRecord(outRecBytes);
			sortOut.setRecord(outRecord, sortOut.getRecordLen());
			sortOut.write(); recordCount++;
		
        }

	    addTrailer1ToOutFile();
		cfStepHandler.updateSortStepExecution("sort010");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: HEADERTRAILERSORT010 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			HeadertrailerSort010Keys k = sortRecKeys.get(index);
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

	private byte[] getOutRecord(byte[] record) {
        byte[] recBytes = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTREC_SIZE));
			copyRecordBytes(record, recBytes, OUTREC_POS1, OUTREC_DES_POS1,OUTREC_LEN1);
             copyRecordBytes(fillBytes,recBytes,OUTREC_POS2,OUTREC_DES_POS2,OUTREC_LEN2);

		return recBytes;
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
	
	private void addHeader1ToOutFile(){
		addHeaderTrailerRecords(Arrays.asList(outfilH1000S1,outfilH1001S0,outfilH1001S1,outfilH1003S0,outfilH1003S1,outfilH1005S0,outfilH1005S1,outfilH1007,outfilH1008));
	}


	private void addTrailer1ToOutFile(){
		addHeaderTrailerRecords(Arrays.asList(outfilT1009S1,convertChar2EbcdicBytes(copyMaskBytes(Integer.toString(recordCount), COUNT_MASK_PATTERN_OUTFILT10010, COUNT_MASK_LENGTH_OUTFILT10010))));
	}

	private void addOutFileHeaders() {
		addHeader1ToOutFile();
	}
	  	
}
