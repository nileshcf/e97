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
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.sort.file.records.McsfsortSort008Keys;
import com.cloudframe.app.sort.file.records.McsfsortSort008JoinKeys;
import java.util.stream.Collectors;
import com.cloudframe.app.sort.strategy.SortPathStrategy;
import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
import com.cloudframe.app.sort.SortProperties;
import org.springframework.context.annotation.Lazy;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.sort.McsfsortSort008Detail;
import com.cloudframe.app.sort.file.McsfsortSort008SortIn0;
import com.cloudframe.app.sort.file.McsfsortSort008SortIn1;
import com.cloudframe.app.sort.file.McsfsortSort008SortOut;
public class McsfsortSort008InputReader extends BaseProcess implements Tasklet, StepExecutionListener {
	private final Logger logger = LoggerFactory.getLogger(McsfsortSort008InputReader.class);
    SortPathStrategy sortProcesser;
    @Autowired
    @Lazy
    SortStrategyDecider sortDecider;
	@Autowired
	@Qualifier("batch_mcsfsortsort008")
	McsfsortSort008Detail sortDetail;
	
	@Autowired
	@Qualifier("McsfsortSort008SortIn0")
	McsfsortSort008SortIn0 sortIn0;
	
	@Autowired
	@Qualifier("McsfsortSort008SortIn1")
	McsfsortSort008SortIn1 sortIn1;
	
	@Autowired
	@Qualifier("McsfsortSort008SortOut")
	McsfsortSort008SortOut sortOut;
	
    @Value("${cf.sort.useTempFile:yes}")
    private String useTempFile;    

    int fileIndx = 1;
    int recCounter = 0;
	static final int JNKEY_POS0 = 5;
	static final int JNKEY_LEN0 = 6;
	static final int JNKEY_POS1 = 39;
	static final int JNKEY_LEN1 = 6;
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

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn1RecKeys(sortProcesser.getKeys());
	}

private void processJoinKeys2() throws Exception {	
		String inFileName = filePath + sortIn1.getAccessFileName(sortIn1.getFileName());
		sortDecider.setInFileDetails(inFileName, sortIn1.getRecordLen(), sortIn1.isFBRec());
		sortDecider.setOutFileName(filePath + "TempOut_sortIn1_" + sortIn1.getFileName(), sortIn1.getRecordLen());
		SortProperties sortProperties = new SortProperties();
        sortDecider.addSortKeysInfo("Key1"/* name */, JNKEY_POS1/* pos */, JNKEY_LEN1/* len */, false/* descending */,"CH" /* type */,sortProperties);

		sortProcesser = sortDecider.decideSortStrategy(sortProperties);
        sortProcesser.sort();
		sortDetail.setJn2RecKeys(sortProcesser.getKeys());
		sortDetail.setRecInCounter(sortDetail.getJn1RecKeys().size() + sortDetail.getJn2RecKeys().size());
	}	

	
}
