  package com.cloudframe.app.process.impl;
  /* 
*****************************************************************
*                                                               *
* input files:                                                  *
*   tm smm file       - smm.extract file from tm eod            *
*   site parm         - parm that associates sorters w sites    *
*   system parm       - parm that tells us what environment     *
*                       we are in                               *
* output files:                                                 *
*   load file         - sorted smm load file for vsam           *
*                                                               *
* error return codes:                                           *
*   +100 - invalid system parm in ussystem parm                 *
*   +101 - table exceeded - more than 200 sorters in tmsorter   *
*****************************************************************
* usbank modification log:                                      *
*                                                               *
* ccn     date     userid  description                          *
* ------- -------- ------- ------------------------------------ *
* ccn0032 10/18/11 mffago  initial release                      *
*****************************************************************
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.tmsmmcpy.file.*;
  import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx.*;
  import com.cloudframe.app.tmsmmcpy.TmsmmcpyCtx;
  import com.cloudframe.app.process.Tmsmmcpy;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.tmsmmcpy.file.records.SortKey01Keys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.exception.Terminate;
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;
  import com.cloudframe.app.utility.Pair;
  import java.util.stream.IntStream;
  import java.nio.CharBuffer;
  import java.util.Arrays;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.tmsmmcpy.dto.*;
  import com.cloudframe.app.tmsmmcpy.dto.SmmRec;
  import com.cloudframe.app.tmsmmcpy.dto.SortKey;
  import com.cloudframe.app.tmsmmcpy.file.records.SortRecord;
  import com.cloudframe.app.tmsmmcpy.file.records.SmmRecord;
  import com.cloudframe.app.tmsmmcpy.file.records.SmmRecordOut;
  import com.cloudframe.app.tmsmmcpy.dto.WorkFieldGroup;
  import com.cloudframe.app.tmsmmcpy.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import org.springframework.beans.factory.InitializingBean;
  import org.springframework.beans.factory.DisposableBean;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sort.SortProperties;
  import com.cloudframe.app.sort.strategy.SortPathStrategy;
  import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
  import com.cloudframe.app.sort.model.SortKeyObject;
  import org.springframework.context.annotation.Lazy;
  
  @Component("tmsmmcpy")
  
  public class TmsmmcpyImpl extends CommonProcess implements Tmsmmcpy, InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(TmsmmcpyImpl.class);
  
  
  
  
  @Autowired 
  @Qualifier("tmsmmcpy_smmFileIn")
  SmmFileIn smmFileIn;
  @Autowired 
  @Qualifier("tmsmmcpy_sortFileInternIn")
  SortFileInternIn sortFileInternIn;
  @Autowired 
  @Qualifier("tmsmmcpy_sortFileInternOut")
  SortFileInternOut sortFileInternOut;
  @Autowired 
  @Qualifier("tmsmmcpy_smmFileOut")
  SmmFileOut smmFileOut;
  
  @Autowired
  @Lazy
  SortStrategyDecider sortDecider;
  
  SortPathStrategy sortProcesser;
  
  @Value("${cf.sort.using.file.strategy:no}")
  private String usingSortFileStrategy;  
  
  @Value("${cf.sort.useTempFile:yes}")
  private String useTempFile;
  
  
  private static final int SORTKEY01_OFFSET = 0;
  private static final int SORTKEY01_LENGTH = 100;
  private List<SortKey01Keys> sortRecKeys = new ArrayList<>();
  private Comparator<SortKey01Keys> sortComp = null;
  private Map<String, Pattern> patternMap = new HashMap<>();
  
  
  
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
      public int process(TmsmmcpyCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(smmFileIn.hasOpened() && !smmFileIn.isReadOnly()) { 
      			smmFileIn.flush(); 
      		}
      		if(sortFileInternIn.hasOpened() && !sortFileInternIn.isReadOnly()) { 
      			sortFileInternIn.flush(); 
      		}
      		if(sortFileInternOut.hasOpened() && !sortFileInternOut.isReadOnly()) { 
      			sortFileInternOut.flush(); 
      		}
      		if(smmFileOut.hasOpened() && !smmFileOut.isReadOnly()) { 
      			smmFileOut.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - endSw                          COBOL Name: WS-END-SW
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
          // MOVE LOW-VALUES TO WS-END-SW
          methodOut.setEndSw(CONSTANTS.LOW_VALUE_1703015924);
//  PERFORM 1000-INITIALIZATION THRU 1000-EXIT
          initialization(programCtx.getInitializationInCtx());/*1000-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  SORT SORT-FILE ASCENDING KEY SORT-KEY INPUT PROCEDURE 2000-READ-SMM THRU 2000-EXIT OUTPUT PROCEDURE 3000-OUTPUT-SMM THRU 3000-EXIT
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
                readSmm(programCtx.getReadSmmInCtx());
              if(sortFileInternIn.hasOpened()) {
                 sortFileInternIn.close();
              }
              if(useSortFileStrategy()) {
              	// implement code here
                   sortDecider.setInFileDetails(sortFileInternIn.getAccessFileName(sortFileInternIn.getFileName()),sortFileInternIn.getRecLen(),sortFileInternIn.isFixedBlock());
                   sortDecider.setOutFileName(sortFileInternOut.getAccessFileName(sortFileInternOut.getFileName()),sortFileInternOut.getRecLen());
          		 SortProperties sortProperties = new SortProperties();
          		 // SORT key information
                   sortDecider.addSortKeysInfo("SORTKEY01"/*name*/,SORTKEY01_OFFSET/*pos*/,SORTKEY01_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
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
          		 sortFileInternOut.open("r", sortFileInternOut.getFileName(), sortFileInternOut.getSortFileInternOutCharSet(),sortFileInternOut.getSortFileInternOutCrlfFlag());
              } else {
              sortComp = SortKey01Keys.getSortKey01Comparator(true/*isAscending*/);
          
              sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
          
              if (isWriteInTempFile()){
                     boolean isCountMatches = true;
                     int recordKeyCount = sortRecKeys.size();
                     while (isCountMatches) {
                             isCountMatches = recordKeyCount != getWriteCounter().get();
                     }
              }
              doPresetForRead();
              }
              while(programCtx.getLoopOutputSmm()){
                outputSmm(programCtx.getOutputSmmInCtx());
              }
               if(sortFileInternOut.hasOpened()) {
          	    sortFileInternOut.close(); 
               }
          } catch(Exception e) {
              logger.error("",e);
          } finally {
              removeTempFile();
              sortRecKeys.clear();
              removeInternFile();
          }
//  PERFORM 9000-TERMINATION THRU 9000-EXIT
          termination(programCtx.getTerminationInCtx());/*9000-TERMINATION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * initialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZATION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void initialization(InitializationInCtx methodIn) throws Exception {
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
//  OPEN INPUT SMM-FILE-IN OUTPUT SMM-FILE-OUT
          smmFileIn.open(new String(CONSTANTS.MODE_READ_ONLY_36242),smmFileIn.getFileName(),smmFileIn.getSmmFileInCharSet(),smmFileIn.getSmmFileInCrlfFlag());
          smmFileOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),smmFileOut.getFileName(),smmFileOut.getSmmFileOutCharSet(),smmFileOut.getSmmFileOutCrlfFlag());
      
      }
      /**
      * readSmm 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-READ-SMM COBOL Cyclomatic complexity - 2
      * Input  :  

      * - smmEofSw                       COBOL Name: WS-SMM-EOF-SW
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void readSmm(ReadSmmInCtx methodIn) throws Exception {
      
// *****************************************************************
// *    Sort input process - read and save bie file to sort work   *
// *****************************************************************
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
//  PERFORM 2100-READ-AND-PROCESS-SMM THRU 2100-EXIT UNTIL WS-SMM-EOF
          while (!(methodIn.isSmmEof()) ) {
             readAndProcessSmm(programCtx.getReadAndProcessSmmInCtx());/*2100-READ-AND-PROCESS-SMM*/
          }
          ;
      
      }
      /**
      * readAndProcessSmm 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-READ-AND-PROCESS-SMM COBOL Cyclomatic complexity - 8
      * Input  :  

      * - smmRecordsRead                 COBOL Name: WS-SMM-RECORDS-READ
      * - smmEnd                         COBOL Name: SMM-END
      * - smmDdrKey                      COBOL Name: SMM-DDR-KEY
      * - smmBatchKey                    COBOL Name: SMM-BATCH-KEY
      * - smmExtCapXptId                 COBOL Name: SMM-EXT-CAP-XPT-ID
      * - smmField3                      COBOL Name: SMM-FIELD3
      * - smmField1                      COBOL Name: SMM-FIELD1
      * - smmDataserverId                COBOL Name: SMM-DATASERVER-ID
      * - invalidSmmCnt                  COBOL Name: WS-INVALID-SMM-CNT
      * - smmRec                         COBOL Name: SMM-REC
      * - sortKey                        COBOL Name: WS-SORT-KEY
      *
      * Output :  

      * - smmRecord                      COBOL Name: SMM-RECORD
      * - smmEofSw                       COBOL Name: WS-SMM-EOF-SW
      * - smmRecordsRead                 COBOL Name: WS-SMM-RECORDS-READ
      * - workField                      COBOL Name: WS-WORK-FIELD
      * - smmDdrKey                      COBOL Name: SMM-DDR-KEY
      * - sortDdrKey                     COBOL Name: WS-SORT-DDR-KEY
      * - smmBatchKey                    COBOL Name: SMM-BATCH-KEY
      * - sortBatchKey                   COBOL Name: WS-SORT-BATCH-KEY
      * - sortExtCapXptId                COBOL Name: WS-SORT-EXT-CAP-XPT-ID
      * - smmExtCapXptId                 COBOL Name: SMM-EXT-CAP-XPT-ID
      * - sortField3                     COBOL Name: WS-SORT-FIELD3
      * - smmField3                      COBOL Name: SMM-FIELD3
      * - smmField1                      COBOL Name: SMM-FIELD1
      * - sortField1                     COBOL Name: WS-SORT-FIELD1
      * - smmDataserverId                COBOL Name: SMM-DATASERVER-ID
      * - sortDsrvId                     COBOL Name: WS-SORT-DSRV-ID
      * - invalidSmmCnt                  COBOL Name: WS-INVALID-SMM-CNT
      * - sortRecord                     COBOL Name: SORT-RECORD
      * - smmRec                         COBOL Name: SMM-REC
      * - sortKey01                      COBOL Name: SORT-KEY
      * - sortKey                        COBOL Name: WS-SORT-KEY
      *
      * @throws CFException
      */
      @Override
      public ReadAndProcessSmmOutCtx readAndProcessSmm(ReadAndProcessSmmInCtx methodIn) throws Exception {
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
ReadAndProcessSmmOutCtx methodOut = methodIn.getReadAndProcessSmmOutCtx();
//  READ SMM-FILE-IN
          	smmFileIn.read();
          if (!smmFileIn.hasEnded()) {
          	methodOut.getSmmRecord().setString(smmFileIn.getRecord());
          }
//  AT END
          if (smmFileIn.hasEnded()) {  
//  SET WS-SMM-EOF TO TRUE
              methodOut.setSmmEofTrue(); 
              
//cobolCode::GO TO 2100-EXIT
return methodOut;
//cobolCodeEnds::GO TO 2100-EXIT
            }
//  IF WS-SMM-NOT-EOF
          if ( methodOut.isSmmNotEof()  ) { 
//  ADD +1 TO WS-SMM-RECORDS-READ
              methodOut.setSmmRecordsRead(methodOut.getSmmRecordsRead()+1);
//  PERFORM 7000-UNSTRING THRU 7000-UNSTRING-EXIT
              unstring(programCtx.getUnstringInCtx());/*7000-UNSTRING*/
          }

// ********Display ' smm-rec ->' smm-rec
// ********        ' smm-end ->' smm-end
//  IF SMM-END NOT = 'END'
//  LITERAL_END = 'END'
          if (compareChars(methodIn.getSmmEnd(),CONSTANTS.LITERAL_END) != 0) { 
//  DISPLAY '=TMSMMCPY=> SMM EXTRACT RECORD OUT OF SYNC'
              logger.info("=TMSMMCPY=> SMM EXTRACT RECORD OUT OF SYNC"); 
//  DISPLAY '=TMSMMCPY=> LAST FIELD IN RECORD NOT "END"'
              logger.info("=TMSMMCPY=> LAST FIELD IN RECORD NOT \"END\""); 
//  DISPLAY '=TMSMMCPY=> RECORD NUMBER = ' , WS-SMM-RECORDS-READ
              logger.info("=TMSMMCPY=> RECORD NUMBER = {}", String.valueOf(methodOut.getSmmRecordsRead())); 
          }
//  MOVE SMM-DDR-KEY (1 : 10) TO WS-WORK-FIELD
          methodOut.setWorkField(methodOut.getSmmDdrKey());
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField(programCtx.getReformatFieldInCtx());/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD TO WS-SORT-DDR-KEY
          methodOut.setSortDdrKey(methodOut.getWorkField());
//  MOVE SMM-BATCH-KEY (1 : 10) TO WS-WORK-FIELD
          methodIn.getWorkFieldGroup().replace(methodOut.getSmmRec()/*parent*/,10/*fromOffset - (workField) */,10/*fromLen*/,0/*toOffset - (smmBatchKey) */,10/*toLen*/);
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField(programCtx.getReformatFieldInCtx());/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD TO WS-SORT-BATCH-KEY
          methodOut.setSortBatchKey(methodOut.getWorkField());
//  MOVE SMM-EXT-CAP-XPT-ID TO WS-SORT-EXT-CAP-XPT-ID
          methodOut.setSortExtCapXptId(methodOut.getSmmExtCapXptId());
//  MOVE SMM-FIELD3 TO WS-SORT-FIELD3
          methodOut.setSortField3(methodOut.getSmmField3());
//  MOVE SMM-FIELD1 (1 : 10) TO WS-WORK-FIELD
          methodIn.getWorkFieldGroup().replace(methodOut.getSmmRec()/*parent*/,70/*fromOffset - (workField) */,10/*fromLen*/,0/*toOffset - (smmField1) */,10/*toLen*/);
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField(programCtx.getReformatFieldInCtx());/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD TO WS-SORT-FIELD1
          methodOut.setSortField1(methodOut.getWorkField());
//  MOVE SMM-DATASERVER-ID TO WS-WORK-FIELD
          methodOut.setWorkField(methodOut.getSmmDataserverId());
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField(programCtx.getReformatFieldInCtx());/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD (7 : 4) TO WS-SORT-DSRV-ID
          methodOut.getSortKey().replace(methodIn.getWorkFieldGroup()/*parent*/,0+7 - 1/*fromOffset - (sortDsrvId) */,4/*fromLen*/,36/*toOffset - (workField) */,4/*toLen*/);
//  IF WS-SORT-DDR-KEY NOT > ZERO OR WS-SORT-BATCH-KEY NOT > ZERO OR WS-SORT-FIELD1 NOT > SPACES OR WS-SORT-FIELD3 NOT > SPACES OR WS-SORT-DSRV-ID NOT > ZERO
          if (( compareChars(methodOut.getSortDdrKey(), CONSTANTS.LITERAL_0000000000) <= 0 ) /*  <=  zeros*/ || ( compareChars(methodOut.getSortBatchKey(), CONSTANTS.LITERAL_0000000000) <= 0 ) /*  <=  zeros*/ ||                    ( isLessOrEqualSpaces(methodOut.getSortField1()) ) ||                    ( isLessOrEqualSpaces(methodOut.getSortField3()) ) || ( compareChars(methodOut.getSortDsrvId(), CONSTANTS.LITERAL_0000) <= 0 ) /*  <=  zeros*/) { 

// *    Or ws-sort-ext-cap-xpt-id not > spaces
//  ADD +1 TO WS-INVALID-SMM-CNT
              methodOut.setInvalidSmmCnt(methodOut.getInvalidSmmCnt()+(long)1);
//cobolCode::GO TO 2100-EXIT
return methodOut;
//cobolCodeEnds::GO TO 2100-EXIT
          }

// *****Display  ' ws-sort-key->' ws-sort-key.
          // MOVE SMM-REC TO SORT-RECORD
          methodOut.getSortRecord().setString(methodOut.getSmmRec().getCharArray());
          // MOVE WS-SORT-KEY TO SORT-KEY
          methodOut.setSortKey01(methodOut.getSortKey().toCharArray());

// *****Display ' sort-record->' sort-record.

// *****Go to 2100-read-and-process-smm.
//  RELEASE SORT-RECORD
          if(useSortFileStrategy()) {
          sortFileInternIn.write(methodOut.getSortRecord().toCharArray(),methodOut.getSortRecord().length());
          } else
            addReleaseRecord(methodOut.getSortRecord().toCharArray(),methodOut.getSortRecord().length());
      
      return methodOut;
      }
      /**
      * reformatField 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-REFORMAT-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - workField                      COBOL Name: WS-WORK-FIELD
      *
      * Output :  

      * - workField                      COBOL Name: WS-WORK-FIELD
      *
      * @throws CFException
      */
      @Override
      public ReformatFieldOutCtx reformatField(ReformatFieldInCtx methodIn) throws Exception {
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
ReformatFieldOutCtx methodOut = methodIn.getReformatFieldOutCtx();
//  PERFORM UNTIL WS-WORK-FIELD (10 : 1) NUMERIC
          while ((    !( isNumeric(substring(methodOut.getWorkField(),9,10)) ))) {
//  MOVE WS-WORK-FIELD (9 : 1) TO WS-WORK-FIELD (10 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+9 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+10 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (8 : 1) TO WS-WORK-FIELD (9 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+8 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+9 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (7 : 1) TO WS-WORK-FIELD (8 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+7 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+8 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (6 : 1) TO WS-WORK-FIELD (7 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+6 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+7 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (5 : 1) TO WS-WORK-FIELD (6 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+5 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+6 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (4 : 1) TO WS-WORK-FIELD (5 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+4 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+5 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (3 : 1) TO WS-WORK-FIELD (4 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+3 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+4 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (2 : 1) TO WS-WORK-FIELD (3 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0+2 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+3 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (1 : 1) TO WS-WORK-FIELD (2 : 1)
              methodOut.getWorkFieldGroup().replace(methodOut.getWorkFieldGroup()/*parent*/,0/*fromOffset - (workField) */,1/*fromLen*/,0+2 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE ZEROS TO WS-WORK-FIELD (1 : 1)
              methodOut.setWorkField(replace(methodOut.getWorkField(),CONSTANTS.ZERO_1,0,1));
          }
      
      return methodOut;
      }
      /**
      * outputSmm 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-OUTPUT-SMM COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sortKey01                      COBOL Name: SORT-KEY
      * - smmKeyHold                     COBOL Name: WS-SMM-KEY-HOLD
      * - sortRecord                     COBOL Name: SORT-RECORD
      * - depDupKey                      COBOL Name: WS-DEP-DUP-KEY
      * - smmDupCnt                      COBOL Name: WS-SMM-DUP-CNT
      * - writeSmmCnt                    COBOL Name: WS-WRITE-SMM-CNT
      *
      * Output :  

      * - sortEofSw                      COBOL Name: WS-SORT-EOF-SW
      * - sortKey                        COBOL Name: WS-SORT-KEY
      * - sortKey01                      COBOL Name: SORT-KEY
      * - smmRec                         COBOL Name: SMM-REC
      * - sortRecord                     COBOL Name: SORT-RECORD
      * - depDupKey                      COBOL Name: WS-DEP-DUP-KEY
      * - smmDupCnt                      COBOL Name: WS-SMM-DUP-CNT
      * - smmField3                      COBOL Name: SMM-FIELD3
      * - smmRecordOut                   COBOL Name: SMM-RECORD-OUT
      * - smmKeyHold                     COBOL Name: WS-SMM-KEY-HOLD
      * - writeSmmCnt                    COBOL Name: WS-WRITE-SMM-CNT
      *
      * @throws CFException
      */
      @Override
      public OutputSmmOutCtx outputSmm(OutputSmmInCtx methodIn) throws Exception {
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
          programCtx.setLoopOutputSmm(false);
OutputSmmOutCtx methodOut = methodIn.getOutputSmmOutCtx();
//  RETURN SORT-FILE
                if(useSortFileStrategy()) {
                  sortFileInternOut.read();
                  if (!sortFileInternOut.hasEnded()) {
                  	methodOut.getSortRecord().setString(sortFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) methodOut.getSortRecord().setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else methodOut.getSortRecord().setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  SET WS-SORT-EOF TO TRUE
                  methodOut.setSortEofTrue(); 
                  
//cobolCode::GO TO 3000-EXIT
unstring(programCtx.getUnstringInCtx());
displaySmmRec(programCtx.getDisplaySmmRecInCtx());
termination(programCtx.getTerminationInCtx());
return methodOut;
//cobolCodeEnds::GO TO 3000-EXIT
                }
//  MOVE SORT-KEY TO WS-SORT-KEY
          methodOut.getSortKey().setString(methodOut.getSortKey01());
//  IF WS-SORT-KEY = WS-SMM-KEY-HOLD
          if (		compareChars(methodOut.getSortKey(),methodOut.getSmmKeyHold()) == 0 ) { 
              // MOVE SORT-RECORD TO SMM-REC
              methodOut.getSmmRec().setString(methodOut.getSortRecord().getCharArray());
//  ADD 1 TO WS-DEP-DUP-KEY WS-SMM-DUP-CNT
              methodOut.setDepDupKey(methodOut.getDepDupKey()+(long)1);
              methodOut.setSmmDupCnt(methodOut.getSmmDupCnt()+(long)1);
//  MOVE WS-DEP-DUP-KEY TO SMM-FIELD3 (25 : 5)
              methodOut.setSmmField3(replace(methodOut.getSmmField3(),String.valueOf(methodOut.getDepDupKeyString()).toCharArray(),24,29));
//  PERFORM 8920-DISPLAY-SMM-REC THRU 8920-EXIT
              displaySmmRec(programCtx.getDisplaySmmRecInCtx());/*8920-DISPLAY-SMM-REC*/
              // MOVE SMM-REC TO SMM-RECORD-OUT
              methodOut.getSmmRecordOut().setString(methodOut.getSmmRec().getCharArray());
          }
//  ELSE
          else { 
              // MOVE SORT-RECORD TO SMM-RECORD-OUT
              methodOut.getSmmRecordOut().setString(methodOut.getSortRecord().getCharArray());
              // MOVE ZEROES TO WS-DEP-DUP-KEY
              methodOut.setDepDupKey(0);
          }
//  WRITE SMM-RECORD-OUT
          smmFileOut.write(methodOut.getSmmRecordOut().toCharArray()); 
          methodOut.getSmmRecordOut().setString(CONSTANTS.LOW_VALUE_215544411);
          // MOVE WS-SORT-KEY TO WS-SMM-KEY-HOLD
          methodOut.setSmmKeyHold(methodOut.getSortKey().toCharArray());
//  ADD +1 TO WS-WRITE-SMM-CNT
          methodOut.setWriteSmmCnt(methodOut.getWriteSmmCnt()+(long)1);

// *****Display ' smm-record-out written '.
//cobolCode::GO TO 3000-OUTPUT-SMM
programCtx.setLoopOutputSmm(true); 
 return methodOut;
//cobolCodeEnds::GO TO 3000-OUTPUT-SMM
      
      }
      /**
      * unstring 
      *   This method is derived from 
  *   COBOL Paragraph - 7000-UNSTRING COBOL Cyclomatic complexity - 1
      * Input  :  

      * - smmRecord                      COBOL Name: SMM-RECORD
      *
      * Output :  

      * - smmDdrKey                      COBOL Name: SMM-DDR-KEY
      * - smmBatchKey                    COBOL Name: SMM-BATCH-KEY
      * - smmExtCapXptId                 COBOL Name: SMM-EXT-CAP-XPT-ID
      * - smmSsDdrKey                    COBOL Name: SMM-SS-DDR-KEY
      * - smmMatchStatus                 COBOL Name: SMM-MATCH-STATUS
      * - smmClassification              COBOL Name: SMM-CLASSIFICATION
      * - smmField1                      COBOL Name: SMM-FIELD1
      * - smmField2                      COBOL Name: SMM-FIELD2
      * - smmField3                      COBOL Name: SMM-FIELD3
      * - smmField4                      COBOL Name: SMM-FIELD4
      * - smmField5                      COBOL Name: SMM-FIELD5
      * - smmField6                      COBOL Name: SMM-FIELD6
      * - smmField7                      COBOL Name: SMM-FIELD7
      * - smmField8                      COBOL Name: SMM-FIELD8
      * - smmField9                      COBOL Name: SMM-FIELD9
      * - smmField10                     COBOL Name: SMM-FIELD10
      * - smmField11                     COBOL Name: SMM-FIELD11
      * - smmField12                     COBOL Name: SMM-FIELD12
      * - smmField13                     COBOL Name: SMM-FIELD13
      * - smmField14                     COBOL Name: SMM-FIELD14
      * - smmField15                     COBOL Name: SMM-FIELD15
      * - smmBranch                      COBOL Name: SMM-BRANCH
      * - smmTeller                      COBOL Name: SMM-TELLER
      * - smmHash                        COBOL Name: SMM-HASH
      * - smmType                        COBOL Name: SMM-TYPE
      * - smmAppTypePsetNum              COBOL Name: SMM-APP-TYPE-PSET-NUM
      * - smmPostingDate                 COBOL Name: SMM-POSTING-DATE
      * - smmTransTime                   COBOL Name: SMM-TRANS-TIME
      * - smmRefText1                    COBOL Name: SMM-REF-TEXT1
      * - smmRefText2                    COBOL Name: SMM-REF-TEXT2
      * - smmRefText3                    COBOL Name: SMM-REF-TEXT3
      * - smmRefText4                    COBOL Name: SMM-REF-TEXT4
      * - smmRefText5                    COBOL Name: SMM-REF-TEXT5
      * - smmRefNum1                     COBOL Name: SMM-REF-NUM1
      * - smmRefNum2                     COBOL Name: SMM-REF-NUM2
      * - smmSubclass                    COBOL Name: SMM-SUBCLASS
      * - smmFlags                       COBOL Name: SMM-FLAGS
      * - smmDataserverId                COBOL Name: SMM-DATASERVER-ID
      * - smmCycleNo                     COBOL Name: SMM-CYCLE-NO
      * - smmCycleDate                   COBOL Name: SMM-CYCLE-DATE
      * - smmEnd                         COBOL Name: SMM-END
      *
      * @throws CFException
      */
      @Override
      public UnstringOutCtx unstring(UnstringInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			int loop = 0;
			int pointerCnt = 0;
			String updatedRegEx = null;
			char[] resultKey = null;
			char[] resultValue = null;
			char[] padArr = new char[] {' '};
			char[] plusSign = new char[] {'+'};
			char[] actualUnstringStr = null;
			ArrayList<String> splitBy = null;
			List<Pair> result = null;
			// End of variable declaration

TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
UnstringOutCtx methodOut = methodIn.getUnstringOutCtx();
//  UNSTRING SMM-RECORD DELIMITED BY '|' INTO SMM-DDR-KEY SMM-BATCH-KEY SMM-EXT-CAP-XPT-ID SMM-SS-DDR-KEY SMM-MATCH-STATUS SMM-CLASSIFICATION SMM-FIELD1 SMM-FIELD2 SMM-FIELD3 SMM-FIELD4 SMM-FIELD5 SMM-FIELD6 SMM-FIELD7 SMM-FIELD8 SMM-FIELD9 SMM-FIELD10 SMM-FIELD11 SMM-FIELD12 SMM-FIELD13 SMM-FIELD14 SMM-FIELD15 SMM-BRANCH SMM-TELLER SMM-HASH SMM-TYPE SMM-APP-TYPE-PSET-NUM SMM-POSTING-DATE SMM-TRANS-TIME SMM-REF-TEXT1 SMM-REF-TEXT2 SMM-REF-TEXT3 SMM-REF-TEXT4 SMM-REF-TEXT5 SMM-REF-NUM1 SMM-REF-NUM2 SMM-SUBCLASS SMM-FLAGS SMM-DATASERVER-ID SMM-CYCLE-NO SMM-CYCLE-DATE SMM-END END-UNSTRING
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = methodOut.getSmmRecord().toCharArray();
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_36552);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmDdrKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmBatchKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmExtCapXptId(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmSsDdrKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmMatchStatus(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmClassification(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField6(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField7(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField8(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField9(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField10(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField11(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField12(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField13(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField14(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmField15(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmBranch(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmTeller(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmHash(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmType(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmAppTypePsetNum(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmPostingDate(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmTransTime(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmRefText1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmRefText2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmRefText3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmRefText4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmRefText5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmRefNum1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmRefNum2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmSubclass(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmFlags(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmDataserverId(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmCycleNo(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmCycleDate(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setSmmEnd(resultKey);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
      
      return methodOut;
      }
      /**
      * displaySmmRec 
      *   This method is derived from 
  *   COBOL Paragraph - 8920-DISPLAY-SMM-REC COBOL Cyclomatic complexity - 1
      * Input  :  

      * - smmDdrKey                      COBOL Name: SMM-DDR-KEY
      * - smmBatchKey                    COBOL Name: SMM-BATCH-KEY
      * - smmExtCapXptId                 COBOL Name: SMM-EXT-CAP-XPT-ID
      * - smmSsDdrKey                    COBOL Name: SMM-SS-DDR-KEY
      * - smmMatchStatus                 COBOL Name: SMM-MATCH-STATUS
      * - smmClassification              COBOL Name: SMM-CLASSIFICATION
      * - smmField1                      COBOL Name: SMM-FIELD1
      * - smmField2                      COBOL Name: SMM-FIELD2
      * - smmField3                      COBOL Name: SMM-FIELD3
      * - smmField4                      COBOL Name: SMM-FIELD4
      * - smmField5                      COBOL Name: SMM-FIELD5
      * - smmField6                      COBOL Name: SMM-FIELD6
      * - smmField7                      COBOL Name: SMM-FIELD7
      * - smmField8                      COBOL Name: SMM-FIELD8
      * - smmField9                      COBOL Name: SMM-FIELD9
      * - smmField10                     COBOL Name: SMM-FIELD10
      * - smmField11                     COBOL Name: SMM-FIELD11
      * - smmField12                     COBOL Name: SMM-FIELD12
      * - smmField13                     COBOL Name: SMM-FIELD13
      * - smmField14                     COBOL Name: SMM-FIELD14
      * - smmField15                     COBOL Name: SMM-FIELD15
      * - smmBranch                      COBOL Name: SMM-BRANCH
      * - smmTeller                      COBOL Name: SMM-TELLER
      * - smmHash                        COBOL Name: SMM-HASH
      * - smmType                        COBOL Name: SMM-TYPE
      * - smmAppTypePsetNum              COBOL Name: SMM-APP-TYPE-PSET-NUM
      * - smmPostingDate                 COBOL Name: SMM-POSTING-DATE
      * - smmTransTime                   COBOL Name: SMM-TRANS-TIME
      * - smmRefText1                    COBOL Name: SMM-REF-TEXT1
      * - smmRefText2                    COBOL Name: SMM-REF-TEXT2
      * - smmRefText3                    COBOL Name: SMM-REF-TEXT3
      * - smmRefText4                    COBOL Name: SMM-REF-TEXT4
      * - smmRefText5                    COBOL Name: SMM-REF-TEXT5
      * - smmRefNum1                     COBOL Name: SMM-REF-NUM1
      * - smmRefNum2                     COBOL Name: SMM-REF-NUM2
      * - smmSubclass                    COBOL Name: SMM-SUBCLASS
      * - smmFlags                       COBOL Name: SMM-FLAGS
      * - smmDataserverId                COBOL Name: SMM-DATASERVER-ID
      * - smmCycleNo                     COBOL Name: SMM-CYCLE-NO
      * - smmCycleDate                   COBOL Name: SMM-CYCLE-DATE
      * - smmEnd                         COBOL Name: SMM-END
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void displaySmmRec(DisplaySmmRecInCtx methodIn) throws Exception {
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
//  DISPLAY ' SMM-REC INDIVIDUAL VALUES FOR DUPLICATE SMM KEY'
          logger.info(" SMM-REC INDIVIDUAL VALUES FOR DUPLICATE SMM KEY"); 
//  DISPLAY '---------------------------'
          logger.info("---------------------------"); 
//  DISPLAY ' SMM-DDR-KEY->' SMM-DDR-KEY
          logger.info(" SMM-DDR-KEY->{}", new String(methodIn.getSmmDdrKey())); 
//  DISPLAY ' SMM-BATCH-KEY->' SMM-BATCH-KEY
          logger.info(" SMM-BATCH-KEY->{}", new String(methodIn.getSmmBatchKey())); 
//  DISPLAY ' SMM-EXT-CAP-XPT-ID->' SMM-EXT-CAP-XPT-ID
          logger.info(" SMM-EXT-CAP-XPT-ID->{}", new String(methodIn.getSmmExtCapXptId())); 
//  DISPLAY ' SMM-SS-DDR-KEY->' SMM-SS-DDR-KEY
          logger.info(" SMM-SS-DDR-KEY->{}", new String(methodIn.getSmmSsDdrKey())); 
//  DISPLAY ' SMM-MATCH-STATUS->' SMM-MATCH-STATUS
          logger.info(" SMM-MATCH-STATUS->{}", new String(methodIn.getSmmMatchStatus())); 
//  DISPLAY ' SMM-CLASSIFICATION->' SMM-CLASSIFICATION
          logger.info(" SMM-CLASSIFICATION->{}", new String(methodIn.getSmmClassification())); 
//  DISPLAY ' SMM-FIELD1->' SMM-FIELD1
          logger.info(" SMM-FIELD1->{}", new String(methodIn.getSmmField1())); 
//  DISPLAY ' SMM-FIELD2->' SMM-FIELD2
          logger.info(" SMM-FIELD2->{}", new String(methodIn.getSmmField2())); 
//  DISPLAY ' SMM-FIELD3->' SMM-FIELD3
          logger.info(" SMM-FIELD3->{}", new String(methodIn.getSmmField3())); 
//  DISPLAY ' SMM-FIELD4->' SMM-FIELD4
          logger.info(" SMM-FIELD4->{}", new String(methodIn.getSmmField4())); 
//  DISPLAY ' SMM-FIELD5->' SMM-FIELD5
          logger.info(" SMM-FIELD5->{}", new String(methodIn.getSmmField5())); 
//  DISPLAY ' SMM-FIELD6->' SMM-FIELD6
          logger.info(" SMM-FIELD6->{}", new String(methodIn.getSmmField6())); 
//  DISPLAY ' SMM-FIELD7->' SMM-FIELD7
          logger.info(" SMM-FIELD7->{}", new String(methodIn.getSmmField7())); 
//  DISPLAY ' SMM-FIELD8->' SMM-FIELD8
          logger.info(" SMM-FIELD8->{}", new String(methodIn.getSmmField8())); 
//  DISPLAY ' SMM-FIELD9->' SMM-FIELD9
          logger.info(" SMM-FIELD9->{}", new String(methodIn.getSmmField9())); 
//  DISPLAY ' SMM-FIELD10->' SMM-FIELD10
          logger.info(" SMM-FIELD10->{}", new String(methodIn.getSmmField10())); 
//  DISPLAY ' SMM-FIELD11->' SMM-FIELD11
          logger.info(" SMM-FIELD11->{}", new String(methodIn.getSmmField11())); 
//  DISPLAY ' SMM-FIELD12->' SMM-FIELD12
          logger.info(" SMM-FIELD12->{}", new String(methodIn.getSmmField12())); 
//  DISPLAY ' SMM-FIELD13->' SMM-FIELD13
          logger.info(" SMM-FIELD13->{}", new String(methodIn.getSmmField13())); 
//  DISPLAY ' SMM-FIELD14->' SMM-FIELD14
          logger.info(" SMM-FIELD14->{}", new String(methodIn.getSmmField14())); 
//  DISPLAY ' SMM-FIELD15->' SMM-FIELD15
          logger.info(" SMM-FIELD15->{}", new String(methodIn.getSmmField15())); 
//  DISPLAY ' SMM-BRANCH->' SMM-BRANCH
          logger.info(" SMM-BRANCH->{}", new String(methodIn.getSmmBranch())); 
//  DISPLAY ' SMM-TELLER->' SMM-TELLER
          logger.info(" SMM-TELLER->{}", new String(methodIn.getSmmTeller())); 
//  DISPLAY ' SMM-HASH->' SMM-HASH
          logger.info(" SMM-HASH->{}", new String(methodIn.getSmmHash())); 
//  DISPLAY ' SMM-TYPE->' SMM-TYPE
          logger.info(" SMM-TYPE->{}", new String(methodIn.getSmmType())); 
//  DISPLAY ' SMM-APP-TYPE-PSET-NUM->' SMM-APP-TYPE-PSET-NUM
          logger.info(" SMM-APP-TYPE-PSET-NUM->{}", new String(methodIn.getSmmAppTypePsetNum())); 
//  DISPLAY ' SMM-POSTING-DATE->' SMM-POSTING-DATE
          logger.info(" SMM-POSTING-DATE->{}", new String(methodIn.getSmmPostingDate())); 
//  DISPLAY ' SMM-TRANS-TIME->' SMM-TRANS-TIME
          logger.info(" SMM-TRANS-TIME->{}", new String(methodIn.getSmmTransTime())); 
//  DISPLAY ' SMM-REF-TEXT1->' SMM-REF-TEXT1
          logger.info(" SMM-REF-TEXT1->{}", new String(methodIn.getSmmRefText1())); 
//  DISPLAY ' SMM-REF-TEXT2->' SMM-REF-TEXT2
          logger.info(" SMM-REF-TEXT2->{}", new String(methodIn.getSmmRefText2())); 
//  DISPLAY ' SMM-REF-TEXT3->' SMM-REF-TEXT3
          logger.info(" SMM-REF-TEXT3->{}", new String(methodIn.getSmmRefText3())); 
//  DISPLAY ' SMM-REF-TEXT4->' SMM-REF-TEXT4
          logger.info(" SMM-REF-TEXT4->{}", new String(methodIn.getSmmRefText4())); 
//  DISPLAY ' SMM-REF-TEXT5->' SMM-REF-TEXT5
          logger.info(" SMM-REF-TEXT5->{}", new String(methodIn.getSmmRefText5())); 
//  DISPLAY ' SMM-REF-NUM1->' SMM-REF-NUM1
          logger.info(" SMM-REF-NUM1->{}", new String(methodIn.getSmmRefNum1())); 
//  DISPLAY ' SMM-REF-NUM2->' SMM-REF-NUM2
          logger.info(" SMM-REF-NUM2->{}", new String(methodIn.getSmmRefNum2())); 
//  DISPLAY ' SMM-SUBCLASS->' SMM-SUBCLASS
          logger.info(" SMM-SUBCLASS->{}", new String(methodIn.getSmmSubclass())); 
//  DISPLAY ' SMM-FLAGS->' SMM-FLAGS
          logger.info(" SMM-FLAGS->{}", new String(methodIn.getSmmFlags())); 
//  DISPLAY ' SMM-DATASERVER-ID->' SMM-DATASERVER-ID
          logger.info(" SMM-DATASERVER-ID->{}", new String(methodIn.getSmmDataserverId())); 
//  DISPLAY ' SMM-CYCLE-NO->' SMM-CYCLE-NO
          logger.info(" SMM-CYCLE-NO->{}", new String(methodIn.getSmmCycleNo())); 
//  DISPLAY ' SMM-CYCLE-DATE->' SMM-CYCLE-DATE
          logger.info(" SMM-CYCLE-DATE->{}", new String(methodIn.getSmmCycleDate())); 
//  DISPLAY ' SMM-END->' SMM-END
          logger.info(" SMM-END->{}", new String(methodIn.getSmmEnd())); 
//  DISPLAY '---------------------------'
          logger.info("---------------------------"); 
//  DISPLAY ' '
          logger.info(" "); 
      
      }
      /**
      * termination 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - smmRecordsRead                 COBOL Name: WS-SMM-RECORDS-READ
      * - invalidSmmCnt                  COBOL Name: WS-INVALID-SMM-CNT
      * - smmDupCnt                      COBOL Name: WS-SMM-DUP-CNT
      * - writeSmmCnt                    COBOL Name: WS-WRITE-SMM-CNT
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminationOutCtx termination(TerminationInCtx methodIn) throws Exception {
TmsmmcpyCtx programCtx = methodIn.getTmsmmcpyCtx();
TerminationOutCtx methodOut = methodIn.getTerminationOutCtx();
//  DISPLAY 'SUCCESSFUL COMPLETION OF TMSMMCPY'
          logger.info("SUCCESSFUL COMPLETION OF TMSMMCPY"); 
//  DISPLAY 'RECORDS READ = ' WS-SMM-RECORDS-READ
          logger.info("RECORDS READ = {}", String.valueOf(methodIn.getSmmRecordsRead())); 
//  DISPLAY 'INVALID RECORDS DROPPED = ' WS-INVALID-SMM-CNT
          logger.info("INVALID RECORDS DROPPED = {}", String.valueOf(methodIn.getInvalidSmmCnt())); 
//  DISPLAY 'DUPLICATE SMM KEYS (CORRECTED) = ' WS-SMM-DUP-CNT
          logger.info("DUPLICATE SMM KEYS (CORRECTED) = {}", String.valueOf(methodIn.getSmmDupCnt())); 
//  DISPLAY 'RECORDS WRITTEN = ' WS-WRITE-SMM-CNT
          logger.info("RECORDS WRITTEN = {}", String.valueOf(methodIn.getWriteSmmCnt())); 
//  CLOSE SMM-FILE-IN SMM-FILE-OUT
          smmFileIn.close(); 
          smmFileOut.close(); 
//  IF WS-SMM-DUP-CNT > ZERO
          if (	( methodIn.getSmmDupCnt() > 0 ) ) { 
              // MOVE 4 TO RETURN-CODE
              programCtx.setRc( 4);
          }
      
      return methodOut;
      }
  
  
  
  
      /**
       * Method is used to collect SortKey01 sort keys 
       * from each record to perform COBOL sort statement. 
       *  
       * @param record
       * @param recLen    
       */
      public void addReleaseRecord(char[] record, int recLen) throws Exception {
      	if(recLen > record.length)  recLen = record.length;
      	SortKey01Keys relKey = new SortKey01Keys();
                  char[] keySortKey01 = new char[SORTKEY01_LENGTH];
    System.arraycopy(record,SORTKEY01_OFFSET,keySortKey01,0,SORTKEY01_LENGTH);
    relKey.setSortKey01(convertChar2EbcdicBytes(keySortKey01)); 
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
       * Method is used to return sorted records using SortKey01Keys object.
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
      		SortKey01Keys k = sortRecKeys.get(index);
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
      
      /**
        * Sort record array has ended or sort-return code has modified
        * @return boolean flag
        */
      private boolean isSortRecordsEnded() {
          if(useSortFileStrategy()) {
            return (sortFileInternOut.hasEnded());
          }
      	return (sortRecKeys.size() <= getRecIndex());
      }
        /**
         * Split the Original String with the given splitBy and return the ArrayList<Pair> 
         * @param original - Eg: one,two,,three,four,,five
         * @param splitBy - , 
         * @return result - List<Pair> (splitString,delimiter)
         */
              public List<Pair> splitString(char[] original,String splitBy) {
            	 	List<Pair> resultStrArr = new ArrayList<>();
                   Pattern pattern = patternMap.computeIfAbsent(splitBy, k -> Pattern.compile(splitBy));
                   Matcher m = pattern.matcher(CharBuffer.wrap(original));
                  	int start = 0;
                  	while (m.find()) {
                  		resultStrArr.add(new Pair(Arrays.copyOfRange(original, start, m.start()),m.group().toCharArray()));
                  		start = m.end();
                  	}
                  	if(start<original.length)
                  	   resultStrArr.add(new Pair(Arrays.copyOfRange(original, start,original.length),new char[0]));
                    return resultStrArr;
              }
      
        
  
  
  
  
  }
