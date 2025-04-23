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
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.records.McgcmsSort014Keys;
import com.cloudframe.app.sort.file.records.McgcmsSort014JoinKeys;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import com.cloudframe.app.sort.SortProperties;
import org.springframework.context.annotation.Lazy;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McgcmsSort014Detail;
import com.cloudframe.app.sort.file.McgcmsSort014SortIn0;
import com.cloudframe.app.sort.file.McgcmsSort014SortIn1;
import com.cloudframe.app.sort.file.McgcmsSort014SortOut0;
import com.cloudframe.app.sort.file.McgcmsSort014SortOut1;
import com.cloudframe.app.sort.file.McgcmsSort014SortOut2;
public class McgcmsSort014InputReader extends BaseProcess implements Tasklet, StepExecutionListener {
	private final Logger logger = LoggerFactory.getLogger(McgcmsSort014InputReader.class);
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
	@Autowired
	@Qualifier("batch_mcgcmssort014")
	McgcmsSort014Detail sortDetail;
	
	@Autowired
	@Qualifier("McgcmsSort014SortIn0")
	McgcmsSort014SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McgcmsSort014SortIn1")
	McgcmsSort014SortIn1 sortIn1;
	
	@Autowired
	@Qualifier("McgcmsSort014SortOut0")
	McgcmsSort014SortOut0 sortOut0;
	
	@Autowired
	@Qualifier("McgcmsSort014SortOut1")
	McgcmsSort014SortOut1 sortOut1;
	
	@Autowired
	@Qualifier("McgcmsSort014SortOut2")
	McgcmsSort014SortOut2 sortOut2;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 0;
	static final int JNKEY_LEN0 = 7;
	static final int JNKEY_POS1 = 7;
	static final int JNKEY_LEN1 = 11;
	static final int JNKEY_POS2 = 18;
	static final int JNKEY_LEN2 = 2;
	static final int JNKEY_POS3 = 20;
	static final int JNKEY_LEN3 = 4;
	static final int JNKEY_POS4 = 24;
	static final int JNKEY_LEN4 = 3;
	static final int JNKEY_POS5 = 0;
	static final int JNKEY_LEN5 = 7;
	static final int JNKEY_POS6 = 7;
	static final int JNKEY_LEN6 = 11;
	static final int JNKEY_POS7 = 18;
	static final int JNKEY_LEN7 = 2;
	static final int JNKEY_POS8 = 20;
	static final int JNKEY_LEN8 = 4;
	static final int JNKEY_POS9 = 24;
	static final int JNKEY_LEN9 = 3;
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



private void processJoinKeys1() throws Exception {
		String inFileName = filePath + sortIn0.getAccessFileName(sortIn0.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn0.getRecordLen(), sortIn0.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn0_" + sortIn0.getFileName(), sortIn0.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key0"/* name */, JNKEY_POS0/* pos */, JNKEY_LEN0/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key1"/* name */, JNKEY_POS1/* pos */, JNKEY_LEN1/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key2"/* name */, JNKEY_POS2/* pos */, JNKEY_LEN2/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key3"/* name */, JNKEY_POS3/* pos */, JNKEY_LEN3/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key4"/* name */, JNKEY_POS4/* pos */, JNKEY_LEN4/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn1RecKeys(sortProcesser.getKeys());
	}

private void processJoinKeys2() throws Exception {	
		String inFileName = filePath + sortIn1.getAccessFileName(sortIn1.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn1.getFileName(), sortIn1.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key5"/* name */, JNKEY_POS5/* pos */, JNKEY_LEN5/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key6"/* name */, JNKEY_POS6/* pos */, JNKEY_LEN6/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key7"/* name */, JNKEY_POS7/* pos */, JNKEY_LEN7/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key8"/* name */, JNKEY_POS8/* pos */, JNKEY_LEN8/* len */, false/* descending */,"CH" /* type */,sortProperties);
sortDecider.addSortKeysInfo("Key9"/* name */, JNKEY_POS9/* pos */, JNKEY_LEN9/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn2RecKeys(sortProcesser.getKeys());
		sortDetail.setRecInCounter(sortDetail.getJn1RecKeys().size() + sortDetail.getJn2RecKeys().size());
	}	

	
}
