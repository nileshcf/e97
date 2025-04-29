package com.cloudframe.app.tasks;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

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
import com.cloudframe.app.sort.file.records.Sort037Step020Keys;
import com.cloudframe.app.sort.file.records.Sort037Step020JoinKeys;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import com.cloudframe.app.sort.SortProperties;
import org.springframework.context.annotation.Lazy;
import com.cloudframe.app.utility.CFFile;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.Sort037Step020Detail;
import com.cloudframe.app.sort.file.Sort037Step020SortIn0;
import com.cloudframe.app.sort.file.Sort037Step020SortIn1;
import com.cloudframe.app.sort.file.Sort037Step020SortIn2;
import com.cloudframe.app.sort.file.Sort037Step020SortIn3;
import com.cloudframe.app.sort.file.Sort037Step020SortIn4;
import com.cloudframe.app.sort.file.Sort037Step020SortIn5;
public class Sort037Step020InputReader extends BaseProcess implements Tasklet, StepExecutionListener, InitializingBean {
	private final Logger logger = LoggerFactory.getLogger(Sort037Step020InputReader.class);
/**
 * Executor Service Initialize is used for SORT statements
 * Creates an Executor that uses a single worker thread operating off an unbounded queue.
 */
@Override
public void afterPropertiesSet() throws Exception {
	startExecutorServ();
}

    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
	@Autowired
	@Qualifier("batch_sort037step020")
	Sort037Step020Detail sortDetail;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn0")
	Sort037Step020SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn1")
	Sort037Step020SortIn1 sortIn1;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn2")
	Sort037Step020SortIn2 sortIn2;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn3")
	Sort037Step020SortIn3 sortIn3;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn4")
	Sort037Step020SortIn4 sortIn4;
	
	@Autowired
	@Qualifier("Sort037Step020SortIn5")
	Sort037Step020SortIn5 sortIn5;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 0;
	static final int JNKEY_LEN0 = 58;
	static final int JNKEY_POS1 = 0;
	static final int JNKEY_LEN1 = 58;
    private String filePath = "";
    
	@Override
	public void beforeStep(StepExecution stepExecution) {
		sortDetail.setSortRecKeys(new ArrayList<>());
        sortDetail.setJoinRecKey1(new ArrayList<>());
        sortDetail.setJoinRecKey2(new ArrayList<>());
        sortDetail.setJn1RecKeys(new ArrayList<>());
        sortDetail.setJn2RecKeys(new ArrayList<>());    
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
		processJoinKeys1();
		processJoinKeys2();
		return RepeatStatus.FINISHED;
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.debug("Sort input Reader ended.");
		return ExitStatus.COMPLETED;
	}

	/**
	 * This Method is used to add SortStep keys for field sort
	 * @param
	 **/
	public void addRecordBytes4Sorting(byte[] recordByte, int byteLen) {
		List<Sort037Step020Keys> sortRecKeys = sortDetail.getSortRecKeys();
		Sort037Step020Keys relKey = new Sort037Step020Keys();
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
         addRecordBytes4Sorting(record,record.length);
    }

private void processJoinKeys1() throws Exception {
		String inFileName = filePath + sortIn0.getAccessFileName(sortIn0.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn0_" + sortIn0.getFileName(), sortIn0.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key0"/* name */, JNKEY_POS0/* pos */, JNKEY_LEN0/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn1RecKeys(sortProcesser.getKeys());
	}

private void processJoinKeys2() throws Exception {	
        mergeJnKey2files();
		String inFileName = filePath + sortIn5.getAccessFileName(sortIn5.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn5.getFileName(), sortIn1.getRecordLen());	
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key1"/* name */, JNKEY_POS1/* pos */, JNKEY_LEN1/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn2RecKeys(sortProcesser.getKeys());
		sortDetail.setRecInCounter(sortDetail.getJn1RecKeys().size() + sortDetail.getJn2RecKeys().size());
	}	

	
	private void mergeJnKey2files() throws Exception {
		List<CFFile> jnFiles = new ArrayList<>();
        jnFiles.add(sortIn1);
        jnFiles.add(sortIn2);
        jnFiles.add(sortIn3);
        jnFiles.add(sortIn4);
		sortIn5.open("w",sortIn5.getFileName(),sortIn1.getRecordLen(),sortIn1.isFBRec());
		jnFiles.stream().forEach(f -> {
			try {
				f.open("r", f.getFileName(), sortIn1.getRecordLen(), sortIn1.isFBRec());
				byte[] rec = f.readRecord();
				while (!f.hasEnded() && rec != null) {
					sortIn5.setRecord(rec, rec.length);
					sortIn5.write();
					rec = f.readRecord();
				}
				f.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		sortIn5.close();
	}
}
