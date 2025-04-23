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
import com.cloudframe.app.sort.file.Usbice01P030_02SortIn;
import com.cloudframe.app.sort.file.Usbice01P030_02SortOut;
import com.cloudframe.app.sort.file.records.Usbice01P030_02Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Usbice01P030_02Detail;
import com.cloudframe.app.data.Field;
import java.util.Arrays;
public class Usbice01P030_02OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(Usbice01P030_02OutputWriter.class);
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

	List<Usbice01P030_02Keys> sortRecKeys = null;

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
}
