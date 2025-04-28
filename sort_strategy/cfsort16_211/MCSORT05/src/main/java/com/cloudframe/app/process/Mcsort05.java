  package com.cloudframe.app.process;
  /* 
****************************************************************
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.mcsort05.file.*;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.mcsort05.file.records.Ip40005GrpFileSeqNbrKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.mcsort05.dto.*;
  import com.cloudframe.app.mcsort05.file.records.Sys001GroupStatRec;
  import com.cloudframe.app.mcsort05.file.records.Sys201SortedGroupStatRec;
  import com.cloudframe.app.mcsort05.file.records.Ip40005GroupStatusRec;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.mcsort05.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.InitializingBean;
  import org.springframework.beans.factory.DisposableBean;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sort.SortProperties;
  import com.cloudframe.app.sort.strategy.SortPathStrategy;
  import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
  import com.cloudframe.app.sort.model.SortKeyObject;
  import org.springframework.context.annotation.Lazy;
  
  @Component("mcsort05")
  
  public class Mcsort05 extends CommonProcess implements InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Mcsort05.class);
  
  private Sys001GroupStatRec sys001GroupStatRec = new Sys001GroupStatRec() ;
  private Sys201SortedGroupStatRec sys201SortedGroupStatRec = new Sys201SortedGroupStatRec() ;
  private Ip40005GroupStatusRec ip40005GroupStatusRec = new Ip40005GroupStatusRec() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("mcsort05_sys001GroupStatFile")
  Sys001GroupStatFile sys001GroupStatFile;
  @Autowired 
  @Qualifier("mcsort05_sys201SortedGroupStatFile")
  Sys201SortedGroupStatFile sys201SortedGroupStatFile;
  @Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
  Ip996011ProgramStartMessage ip996011ProgramStartMessage;
  
  @Autowired
  @Lazy
  SortStrategyDecider sortDecider;
  
  SortPathStrategy sortProcesser;
  
  @Value("${cf.sort.using.file.strategy:no}")
  private String usingSortFileStrategy;  
  
  @Value("${cf.sort.useTempFile:yes}")
  private String useTempFile;
  
  
  private static final int IP40005GRPFILESEQNBR_OFFSET = 1;
  private static final int IP40005GRPFILESEQNBR_LENGTH = 3;
  private static final int IP40005GROUPSEQNUM_OFFSET = 29;
  private static final int IP40005GROUPSEQNUM_LENGTH = 4;
  private List<Ip40005GrpFileSeqNbrKeys> sortRecKeys = new ArrayList<>();
  private Comparator<Ip40005GrpFileSeqNbrKeys> sortComp = null;
  
  
  
  /**
   * Executor Service Initialize is used for SORT statements
   * Creates an Executor that uses a single worker thread operating off an unbounded queue.
   */
  @Override
  public void afterPropertiesSet() throws Exception {
  	startExecutorServ();
  }
  
  /**
   * ExecutorService shutdown is used for SORT statements  
   * Initiates an orderly shutdown in which previously submitted tasks are executed.
   */
  @Override 
  public void destroy() {
  	stopExecutorServ();
  }
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
          ;
//  PERFORM 0000-MAIN-PROCESS
          mainProcess();/*0000-MAIN-PROCESS*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(sys001GroupStatFile.hasOpened() && !sys001GroupStatFile.isReadOnly()) { 
      			sys001GroupStatFile.flush(); 
      		}
      		if(sys201SortedGroupStatFile.hasOpened() && !sys201SortedGroupStatFile.isReadOnly()) { 
      			sys201SortedGroupStatFile.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-PROCESS COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainProcess() throws Exception {
//  PERFORM 1000-INITIALIZE
          initialize();/*1000-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-SORT-FILE
          sortFile();/*2000-SORT-FILE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 9500-PROCESS-TERMINATION
          processTermination();/*9500-PROCESS-TERMINATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - pgmMcsort05300                 COBOL Name: 300-PGM-MCSORT05
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmMcsort05300                 COBOL Name: 300-PGM-MCSORT05
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      *
      * @throws CFException
      */
      private void initialize() throws Exception {
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  MOVE 300-PGM-MCSORT05 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getPgmMcsort05300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
//  MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CONSTANTS.LITERAL_601786682);
      
      }
      /**
      * sortFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-SORT-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void sortFile() throws Exception {
//  SORT SORT-FILE ON ASCENDING KEY IP40005-GRP-FILE-SEQ-NBR IP40005-GROUP-SEQ-NUM COLLATING SEQUENCE IS EBCDIC USING SYS001-GROUP-STAT-FILE GIVING SYS201-SORTED-GROUP-STAT-FILE
          try {
              if(useSortFileStrategy()) {
              	// implement code here
                   sortDecider.setInFileDetails(sys001GroupStatFile.getAccessFileName(sys001GroupStatFile.getFileName()),sys001GroupStatFile.getRecLen(),sys001GroupStatFile.isFixedBlock());
                   sortDecider.setOutFileName(sys201SortedGroupStatFile.getAccessFileName(sys201SortedGroupStatFile.getFileName()),sys201SortedGroupStatFile.getRecLen());
          		 SortProperties sortProperties = new SortProperties();
          		 // SORT key information
                   sortDecider.addSortKeysInfo("IP40005GRPFILESEQNBR"/*name*/,IP40005GRPFILESEQNBR_OFFSET/*pos*/,IP40005GRPFILESEQNBR_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("IP40005GROUPSEQNUM"/*name*/,IP40005GROUPSEQNUM_OFFSET/*pos*/,IP40005GROUPSEQNUM_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
          		 logger.info("Start reading SORT INPUT file Information ...");
          		 //Pre-process input file details and read sort keys information
          		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
          
          		 logger.info("Start process SORT using fetched SORT keys...");
          		 //Perform SORT based on sort keys information
          		 sortProcesser.sort();
          		 logger.info("Start process the sorted record to GIVING out file...");
          		 //Perform output file write by merging the sorted file(s)
          		 sortProcesser.merge();
          		 logger.info("SORT process using file strategy ends.");
              } else {
              byte[] record = null;
              useSortTempFile(useTempFile);
              sortRecKeys = new ArrayList<>();
              doSortPresets();
              //  USING sys001GroupStatFile read process begin
              sys001GroupStatFile.open("r",sys001GroupStatFile.getFileName(),sys001GroupStatFile.getSys001GroupStatFileCharSet(),sys001GroupStatFile.getSys001GroupStatFileCrlfFlag());
              setVBSortInFile(!sys001GroupStatFile.isFixedBlock());
              
          	record = sys001GroupStatFile.readRecord();
          	while (!sys001GroupStatFile.hasEnded() && record != null) {
                  addReleaseRecord(getRecordChar(record,sys001GroupStatFile.getFileCharSet()),record.length);
                  record = sys001GroupStatFile.readRecord();
              }
              sys001GroupStatFile.close();
          
              sortComp = Comparator.comparingInt(Ip40005GrpFileSeqNbrKeys::getIp40005GrpFileSeqNbr)
                .thenComparing(Comparator.comparingLong(Ip40005GrpFileSeqNbrKeys::getIp40005GroupSeqNum));
          
              sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
          
              if (isWriteInTempFile()){
                     boolean isCountMatches = true;
                     int recordKeyCount = sortRecKeys.size();
                     while (isCountMatches) {
                             isCountMatches = recordKeyCount != getWriteCounter().get();
                     }
              }
              if (isUsingSortInFile())
                  createRAFile(sys001GroupStatFile.getFileName());
          
              doPresetForRead();
              // GIVING FileOut write process begin
              sys201SortedGroupStatFile.open("w",sys201SortedGroupStatFile.getFileName(),sys201SortedGroupStatFile.getSys201SortedGroupStatFileCharSet(),sys201SortedGroupStatFile.getSys201SortedGroupStatFileCrlfFlag());
              for(int i=0; i<sortRecKeys.size(); i++){
              	if(isUsingSortInFile()) sys201SortedGroupStatFile.setRecord(getReturnRecord(i));
              	else sys201SortedGroupStatFile.setRecord(convertUTF2Ebcdic(getReturnRecord(i),sys201SortedGroupStatFile.getFileCharSet()));
                  sys201SortedGroupStatFile.write();
              }
              sys201SortedGroupStatFile.close();
              }
          } catch(Exception e) {
              logger.error("",e);
          } finally {
              removeTempFile();
              sortRecKeys.clear();
          }
      
      }
      /**
      * processTermination 
      *   This method is derived from 
  *   COBOL Paragraph - 9500-PROCESS-TERMINATION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - endOfStepMsg301                COBOL Name: 301-END-OF-STEP-MSG
      *
      * Output : None 

      * @throws CFException
      */
      private void processTermination() throws Exception {
//  DISPLAY 301-END-OF-STEP-MSG
          logger.info(new String(work.getEndOfStepMsg301())); 
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
      /**
       * Method is used to collect Ip40005GrpFileSeqNbr sort keys 
       * from each record to perform COBOL sort statement. 
       *  
       * @param record
       * @param recLen    
       */
      public void addReleaseRecord(char[] record, int recLen) throws Exception {
      	if(recLen > record.length)  recLen = record.length;
      	Ip40005GrpFileSeqNbrKeys relKey = new Ip40005GrpFileSeqNbrKeys();
                  char[] keyIp40005GrpFileSeqNbr = new char[IP40005GRPFILESEQNBR_LENGTH];
    System.arraycopy(record,IP40005GRPFILESEQNBR_OFFSET,keyIp40005GrpFileSeqNbr,0,IP40005GRPFILESEQNBR_LENGTH);
    relKey.setIp40005GrpFileSeqNbr((int)Field.convertString2Number(keyIp40005GrpFileSeqNbr,true/*isSigned*/, true/*isSignTrailing*/, false/*isSignSeparate*/)); 
                  char[] keyIp40005GroupSeqNum = new char[IP40005GROUPSEQNUM_LENGTH];
    System.arraycopy(record,IP40005GROUPSEQNUM_OFFSET,keyIp40005GroupSeqNum,0,IP40005GROUPSEQNUM_LENGTH);
    relKey.setIp40005GroupSeqNum(Field.getLongBinary(keyIp40005GroupSeqNum)); 
          // Record start Posting 
          if (isUsingSortInFile() && isVBSortInFile()) setRecPos(getRecPos()+4);	
      	relKey.setSortRecPos(getRecPos()); // current record start position
      	relKey.setSortRecLen(recLen);
      	relKey.setFileIndx(getFileIndex());
      	sortRecKeys.add(relKey);
      	setRecPos(getRecPos()+recLen); // current record end position
          if(isWriteInTempFile()) writeRecordToTempFile(record,recLen); 
      } 
      /**
       * Method is used to return sorted records using Ip40005GrpFileSeqNbrKeys object.
       * By passing records start position and records length, each record will
       * seek from memory mapped file and return as byte array.
       *  
       * @param index
       * @return  
       */  
      private byte[] getReturnRecord(int index) {
          byte[] record = new byte[0];
           if (sortProcesser != null) {
              record = sortProcesser.getRecord(index);
           }else {
      	try {
      		Ip40005GrpFileSeqNbrKeys k = sortRecKeys.get(index);
      		record = readFromBuffer(k.getSortRecPos(),k.getSortRecLen());
      	} catch (Exception e) {
      		logger.error("Error in return record : {}",e.getMessage()); 
      	}
      	}
      	return record;
      }
      /**
       * Method is used to set the sort file need to fetch process  
       * based on File size and system memory 
       * @param useSortFileStartegy
       */
      private boolean useSortFileStrategy() {
      	return usingSortFileStrategy.equals("yes");
      }
  
  
  
  
  }
