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
import com.cloudframe.app.sort.file.TranSort005SortIn;
import com.cloudframe.app.sort.file.TranSort005SortOut;
import com.cloudframe.app.sort.file.records.TranSort005Keys;
import com.cloudframe.app.CFStepHandler;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.TranSort005Detail;
import com.cloudframe.app.data.Field;
public class TranSort005OutputWriter extends BaseProcess implements Tasklet, StepExecutionListener {

	private final Logger logger = LoggerFactory.getLogger(TranSort005OutputWriter.class);
	@Autowired
	CFStepHandler cfStepHandler;

	@Autowired
	@Qualifier("batch_transort005")
	TranSort005Detail sortDetail;
	
	@Autowired
	@Qualifier("TranSort005SortOut")
	TranSort005SortOut sortOut;
	

	
	@Autowired
	@Qualifier("TranSort005SortIn")
	TranSort005SortIn sortIn;
	
	
    int recordCount = 0;

	static final int OUTFIL_BUILD_POS_ZERO = 0;
	static final int OUTFIL_BUILD_SRCPOS000 = 0;
	static final int OUTFIL_BUILD_POS000 = 0;
	static final int OUTFIL_BUILD_LEN000 = 20;
	static final int OUTFIL_BUILD_SRCPOS001 = 20;
	static final int OUTFIL_BUILD_POS001 = 20;
	static final int OUTFIL_BUILD_LEN001 = 15;
	static final int OUTFIL_BUILD_SRCPOS002 = 35;
	static final int OUTFIL_BUILD_POS002 = 35;
	static final int OUTFIL_BUILD_LEN002 = 15;


	final byte[] whenBytes000 = convertHexChar2Bytes("C1");
	static final int OUTFIL_BUILD_REC_SIZE0 = 50;
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

	List<TranSort005Keys> sortRecKeys = null;

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		doPresetForRead();
		sortRecKeys = sortDetail.getSortRecKeys();
		// FileOut write process begin, Extract sorted record and write it to the output file
		for (int i = 0; i < sortRecKeys.size(); i++) {
            byte[] outRecBytes = getSortedRecord(i);
		  
		  
          byte[] buildRec = convertChar2EbcdicBytes(CFUtil.fillSpaces(OUTFIL_BUILD_REC_SIZE0));
			byte[] buildBytes = buildOutRecIfThenBytes(outRecBytes,0, buildRec, OUTFIL_BUILD_REC_SIZE0);
		    //write into sortOut file
			sortOut.setRecord(buildBytes, sortOut.getRecordLen());
			sortOut.write(); recordCount++;
        }

		cfStepHandler.updateSortStepExecution("sort005");
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
logger.info("STEPNAME: TRANSORT005 Execution completed, number of RECORDS - IN: {},  OUT: {}", sortDetail.getRecInCounter(), recordCount);
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
			TranSort005Keys k = sortRecKeys.get(index);
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

	  
	  
	  
	  	

	private byte[] buildOutRecIfThenBytes(byte[] record, int num, byte[] buildRec, int recSize) {
		switch(num){
		case 0:
		if (Field.compareBytes(record,whenBytes000, 0, 0, 1, whenBytes000.length)  == 0) { 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS000, OUTFIL_BUILD_POS000, OUTFIL_BUILD_LEN000); 
                     copyTranslateEbcdic2Ascii(record, buildRec, OUTFIL_BUILD_SRCPOS001, OUTFIL_BUILD_POS001, OUTFIL_BUILD_LEN001); 
                     copyRecordBytes(record, buildRec, OUTFIL_BUILD_SRCPOS002, OUTFIL_BUILD_POS002, OUTFIL_BUILD_LEN002); 
      }else { copyRecordBytes(record, buildRec, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, recSize);  }
         break;
		default:
			copyRecordBytes(record, buildRec, OUTFIL_BUILD_POS_ZERO, OUTFIL_BUILD_POS_ZERO, recSize);
			break;
		}
		return buildRec;
	}	
}
