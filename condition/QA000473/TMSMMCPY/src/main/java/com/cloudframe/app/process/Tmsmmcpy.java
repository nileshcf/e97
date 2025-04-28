  package com.cloudframe.app.process;
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
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.tmsmmcpy.file.records.SortKey01Keys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.tmsmmcpy.dto.SmmKey;
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
  import com.cloudframe.app.tmsmmcpy.file.records.SortRecord;
  import com.cloudframe.app.tmsmmcpy.file.records.SmmRecord;
  import com.cloudframe.app.tmsmmcpy.dto.SortKey;
  import com.cloudframe.app.tmsmmcpy.file.records.SmmRecordOut;
  import com.cloudframe.app.tmsmmcpy.dto.SmmRec;
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
  
  public class Tmsmmcpy extends CommonProcess implements InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Tmsmmcpy.class);
  
  private SortRecord sortRecord = new SortRecord() ;
  private SmmRecord smmRecord = new SmmRecord() ;
  private SortKey sortKey = new SortKey() ;
  private SmmRecordOut smmRecordOut = new SmmRecordOut() ;
  private SmmRec smmRec = new SmmRec() ;
  private WorkFieldGroup workFieldGroup = new WorkFieldGroup() ;
  private Work work = new Work() ;
  
  
  
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
  private boolean loopOutputSmm = true;
  
  
  
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
//  PERFORM 0000-MAINLINE
          mainline();/*0000-MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
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
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
          // MOVE LOW-VALUES TO WS-END-SW
          work.setEndSw(CONSTANTS.LOW_VALUE_1703015924);
//  PERFORM 1000-INITIALIZATION THRU 1000-EXIT
          initialization();/*1000-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  SORT SORT-FILE ASCENDING KEY SORT-KEY INPUT PROCEDURE 2000-READ-SMM THRU 2000-EXIT OUTPUT PROCEDURE 3000-OUTPUT-SMM THRU 3000-EXIT
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
                readSmm();
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
              while(loopOutputSmm){
                outputSmm();
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
          termination();/*9000-TERMINATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZATION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void initialization() throws Exception {
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
      private void readSmm() throws Exception {
      
// *****************************************************************
// *    Sort input process - read and save bie file to sort work   *
// *****************************************************************
//  PERFORM 2100-READ-AND-PROCESS-SMM THRU 2100-EXIT UNTIL WS-SMM-EOF
          while (!(work.isSmmEof()) ) {
             readAndProcessSmm();/*2100-READ-AND-PROCESS-SMM*/
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
      private void readAndProcessSmm() throws Exception {
			// Declare local variables used in the method
			char[] smmEnd = null;
			char[] sortDdrKey = null;
			char[] sortBatchKey = null;
			char[] sortField1 = null;
			char[] sortField3 = null;
			char[] sortDsrvId = null;
			SmmKey smmKey = smmRec.getSmmKey();
			// End of variable declaration

//  READ SMM-FILE-IN
          	smmFileIn.read();
          if (!smmFileIn.hasEnded()) {
          	smmRecord.setString(smmFileIn.getRecord());
          }
//  AT END
          if (smmFileIn.hasEnded()) {  
//  SET WS-SMM-EOF TO TRUE
              work.setSmmEofTrue(); 
              
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
            }
//  IF WS-SMM-NOT-EOF
          if ( work.isSmmNotEof()  ) { 
//  ADD +1 TO WS-SMM-RECORDS-READ
              work.setSmmRecordsRead(work.getSmmRecordsRead()+1);
//  PERFORM 7000-UNSTRING THRU 7000-UNSTRING-EXIT
              unstring();/*7000-UNSTRING*/
          }

// ********Display ' smm-rec ->' smm-rec
// ********        ' smm-end ->' smm-end
          smmEnd = smmRec.getSmmEnd();
//  IF SMM-END NOT = 'END'
//  LITERAL_END = 'END'
          if (compareChars(smmEnd,CONSTANTS.LITERAL_END) != 0) { 
//  DISPLAY '=TMSMMCPY=> SMM EXTRACT RECORD OUT OF SYNC'
              logger.info("=TMSMMCPY=> SMM EXTRACT RECORD OUT OF SYNC"); 
//  DISPLAY '=TMSMMCPY=> LAST FIELD IN RECORD NOT "END"'
              logger.info("=TMSMMCPY=> LAST FIELD IN RECORD NOT \"END\""); 
//  DISPLAY '=TMSMMCPY=> RECORD NUMBER = ' , WS-SMM-RECORDS-READ
              logger.info("=TMSMMCPY=> RECORD NUMBER = {}", String.valueOf(work.getSmmRecordsRead())); 
          }
  
//  MOVE SMM-DDR-KEY (1 : 10) TO WS-WORK-FIELD
          workFieldGroup.setWorkField(smmRec.getSmmKey().getSmmDdrKey());
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField();/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD TO WS-SORT-DDR-KEY
          sortKey.setSortDdrKey(workFieldGroup.getWorkField());
//  MOVE SMM-BATCH-KEY (1 : 10) TO WS-WORK-FIELD
          workFieldGroup.replace(smmRec/*parent*/,10/*fromOffset - (workField) */,10/*fromLen*/,0/*toOffset - (smmBatchKey) */,10/*toLen*/);
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField();/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD TO WS-SORT-BATCH-KEY
          sortKey.setSortBatchKey(workFieldGroup.getWorkField());
//  MOVE SMM-EXT-CAP-XPT-ID TO WS-SORT-EXT-CAP-XPT-ID
          sortKey.setSortExtCapXptId(smmKey.getSmmExtCapXptId());
  
//  MOVE SMM-FIELD3 TO WS-SORT-FIELD3
          sortKey.setSortField3(smmKey.getSmmField3());
  
//  MOVE SMM-FIELD1 (1 : 10) TO WS-WORK-FIELD
          workFieldGroup.replace(smmRec/*parent*/,70/*fromOffset - (workField) */,10/*fromLen*/,0/*toOffset - (smmField1) */,10/*toLen*/);
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField();/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD TO WS-SORT-FIELD1
          sortKey.setSortField1(workFieldGroup.getWorkField());
//  MOVE SMM-DATASERVER-ID TO WS-WORK-FIELD
          workFieldGroup.setWorkField(smmKey.getSmmDataserverId());
  
//  PERFORM 2200-REFORMAT-FIELD THRU 2200-EXIT
          reformatField();/*2200-REFORMAT-FIELD*/
//  MOVE WS-WORK-FIELD (7 : 4) TO WS-SORT-DSRV-ID
          sortKey.replace(workFieldGroup/*parent*/,0+7 - 1/*fromOffset - (sortDsrvId) */,4/*fromLen*/,36/*toOffset - (workField) */,4/*toLen*/);
          sortBatchKey = sortKey.getSortBatchKey();
          sortField3 = sortKey.getSortField3();
          sortField1 = sortKey.getSortField1();
          sortDsrvId = sortKey.getSortDsrvId();
          sortDdrKey = sortKey.getSortDdrKey();
//  IF WS-SORT-DDR-KEY NOT > ZERO OR WS-SORT-BATCH-KEY NOT > ZERO OR WS-SORT-FIELD1 NOT > SPACES OR WS-SORT-FIELD3 NOT > SPACES OR WS-SORT-DSRV-ID NOT > ZERO
          if (( compareChars(sortDdrKey, CONSTANTS.LITERAL_0000000000) <= 0 ) /*  <=  zeros*/ || ( compareChars(sortBatchKey, CONSTANTS.LITERAL_0000000000) <= 0 ) /*  <=  zeros*/ ||                    ( isLessOrEqualSpaces(sortField1) ) ||                    ( isLessOrEqualSpaces(sortField3) ) || ( compareChars(sortDsrvId, CONSTANTS.LITERAL_0000) <= 0 ) /*  <=  zeros*/) { 

// *    Or ws-sort-ext-cap-xpt-id not > spaces
//  ADD +1 TO WS-INVALID-SMM-CNT
              work.setInvalidSmmCnt(work.getInvalidSmmCnt()+(long)1);
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
          }
  

// *****Display  ' ws-sort-key->' ws-sort-key.
          // MOVE SMM-REC TO SORT-RECORD
          sortRecord.setString(smmRec.getCharArray());
          // MOVE WS-SORT-KEY TO SORT-KEY
          sortRecord.setSortKey01(sortKey.toCharArray());

// *****Display ' sort-record->' sort-record.

// *****Go to 2100-read-and-process-smm.
//  RELEASE SORT-RECORD
          if(useSortFileStrategy()) {
          sortFileInternIn.write(sortRecord.toCharArray(),sortRecord.length());
          } else
            addReleaseRecord(sortRecord.toCharArray(),sortRecord.length());
      
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
      private void reformatField() throws Exception {
//  PERFORM UNTIL WS-WORK-FIELD (10 : 1) NUMERIC
          while ((    !( isNumeric(substring(workFieldGroup.getWorkField(),9,10)) ))) {
//  MOVE WS-WORK-FIELD (9 : 1) TO WS-WORK-FIELD (10 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+9 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+10 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (8 : 1) TO WS-WORK-FIELD (9 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+8 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+9 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (7 : 1) TO WS-WORK-FIELD (8 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+7 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+8 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (6 : 1) TO WS-WORK-FIELD (7 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+6 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+7 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (5 : 1) TO WS-WORK-FIELD (6 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+5 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+6 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (4 : 1) TO WS-WORK-FIELD (5 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+4 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+5 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (3 : 1) TO WS-WORK-FIELD (4 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+3 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+4 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (2 : 1) TO WS-WORK-FIELD (3 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0+2 - 1/*fromOffset - (workField) */,1/*fromLen*/,0+3 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE WS-WORK-FIELD (1 : 1) TO WS-WORK-FIELD (2 : 1)
              workFieldGroup.replace(workFieldGroup/*parent*/,0/*fromOffset - (workField) */,1/*fromLen*/,0+2 - 1/*toOffset - (workField) */,1/*toLen*/);
//  MOVE ZEROS TO WS-WORK-FIELD (1 : 1)
              workFieldGroup.setWorkField(replace(workFieldGroup.getWorkField(),CONSTANTS.ZERO_1,0,1));
          }
      
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
      private void outputSmm() throws Exception {
			// Declare local variables used in the method
			char[] smmKeyHold = null;
			// End of variable declaration

          loopOutputSmm = false;
//  RETURN SORT-FILE
                if(useSortFileStrategy()) {
                  sortFileInternOut.read();
                  if (!sortFileInternOut.hasEnded()) {
                  	sortRecord.setString(sortFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) sortRecord.setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else sortRecord.setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  SET WS-SORT-EOF TO TRUE
                  work.setSortEofTrue(); 
                  
//cobolCode::GO TO 3000-EXIT
unstring();
displaySmmRec();
termination();
return ;
//cobolCodeEnds::GO TO 3000-EXIT
                }
//  MOVE SORT-KEY TO WS-SORT-KEY
          sortKey.setString(sortRecord.getSortKey01());
          smmKeyHold = work.getSmmKeyHold();
//  IF WS-SORT-KEY = WS-SMM-KEY-HOLD
          if (		compareChars(sortKey,smmKeyHold) == 0 ) { 
              // MOVE SORT-RECORD TO SMM-REC
              smmRec.setString(sortRecord.getCharArray());
//  ADD 1 TO WS-DEP-DUP-KEY WS-SMM-DUP-CNT
              work.setDepDupKey(work.getDepDupKey()+(long)1);
              work.setSmmDupCnt(work.getSmmDupCnt()+(long)1);
//  MOVE WS-DEP-DUP-KEY TO SMM-FIELD3 (25 : 5)
              smmRec.getSmmKey().setSmmField3(replace(smmRec.getSmmKey().getSmmField3(),String.valueOf(work.getDepDupKeyString()).toCharArray(),24,29));
//  PERFORM 8920-DISPLAY-SMM-REC THRU 8920-EXIT
              displaySmmRec();/*8920-DISPLAY-SMM-REC*/
              // MOVE SMM-REC TO SMM-RECORD-OUT
              smmRecordOut.setString(smmRec.getCharArray());
          }
  
//  ELSE
          else { 
              // MOVE SORT-RECORD TO SMM-RECORD-OUT
              smmRecordOut.setString(sortRecord.getCharArray());
              // MOVE ZEROES TO WS-DEP-DUP-KEY
              work.setDepDupKey(0);
          }
//  WRITE SMM-RECORD-OUT
          smmFileOut.write(smmRecordOut.toCharArray()); 
          smmRecordOut.setString(CONSTANTS.LOW_VALUE_215544411);
          // MOVE WS-SORT-KEY TO WS-SMM-KEY-HOLD
          work.setSmmKeyHold(sortKey.toCharArray());
//  ADD +1 TO WS-WRITE-SMM-CNT
          work.setWriteSmmCnt(work.getWriteSmmCnt()+(long)1);

// *****Display ' smm-record-out written '.
//cobolCode::GO TO 3000-OUTPUT-SMM
loopOutputSmm = true; 
 return ;
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
      private void unstring() throws Exception {
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
			SmmKey smmKey = smmRec.getSmmKey();
			// End of variable declaration

//  UNSTRING SMM-RECORD DELIMITED BY '|' INTO SMM-DDR-KEY SMM-BATCH-KEY SMM-EXT-CAP-XPT-ID SMM-SS-DDR-KEY SMM-MATCH-STATUS SMM-CLASSIFICATION SMM-FIELD1 SMM-FIELD2 SMM-FIELD3 SMM-FIELD4 SMM-FIELD5 SMM-FIELD6 SMM-FIELD7 SMM-FIELD8 SMM-FIELD9 SMM-FIELD10 SMM-FIELD11 SMM-FIELD12 SMM-FIELD13 SMM-FIELD14 SMM-FIELD15 SMM-BRANCH SMM-TELLER SMM-HASH SMM-TYPE SMM-APP-TYPE-PSET-NUM SMM-POSTING-DATE SMM-TRANS-TIME SMM-REF-TEXT1 SMM-REF-TEXT2 SMM-REF-TEXT3 SMM-REF-TEXT4 SMM-REF-TEXT5 SMM-REF-NUM1 SMM-REF-NUM2 SMM-SUBCLASS SMM-FLAGS SMM-DATASERVER-ID SMM-CYCLE-NO SMM-CYCLE-DATE SMM-END END-UNSTRING
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = smmRecord.toCharArray();
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
          	smmKey.setSmmDdrKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmKey.setSmmBatchKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmKey.setSmmExtCapXptId(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmSsDdrKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmMatchStatus(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmClassification(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmKey.setSmmField1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmKey.setSmmField3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField6(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField7(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField8(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField9(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField10(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField11(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField12(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField13(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField14(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmField15(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmBranch(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmTeller(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmHash(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmType(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmAppTypePsetNum(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmPostingDate(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmTransTime(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmRefText1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmRefText2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmRefText3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmRefText4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmRefText5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmRefNum1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmRefNum2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmSubclass(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmFlags(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmKey.setSmmDataserverId(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmCycleNo(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmCycleDate(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	smmRec.setSmmEnd(resultKey);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
  
      
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
      private void displaySmmRec() throws Exception {
			// Declare local variables used in the method
			SmmKey smmKey = smmRec.getSmmKey();
			// End of variable declaration

//  DISPLAY ' SMM-REC INDIVIDUAL VALUES FOR DUPLICATE SMM KEY'
          logger.info(" SMM-REC INDIVIDUAL VALUES FOR DUPLICATE SMM KEY"); 
//  DISPLAY '---------------------------'
          logger.info("---------------------------"); 
//  DISPLAY ' SMM-DDR-KEY->' SMM-DDR-KEY
          logger.info(" SMM-DDR-KEY->{}", new String(smmKey.getSmmDdrKey())); 
  
//  DISPLAY ' SMM-BATCH-KEY->' SMM-BATCH-KEY
          logger.info(" SMM-BATCH-KEY->{}", new String(smmKey.getSmmBatchKey())); 
  
//  DISPLAY ' SMM-EXT-CAP-XPT-ID->' SMM-EXT-CAP-XPT-ID
          logger.info(" SMM-EXT-CAP-XPT-ID->{}", new String(smmKey.getSmmExtCapXptId())); 
  
//  DISPLAY ' SMM-SS-DDR-KEY->' SMM-SS-DDR-KEY
          logger.info(" SMM-SS-DDR-KEY->{}", new String(smmRec.getSmmSsDdrKey())); 
//  DISPLAY ' SMM-MATCH-STATUS->' SMM-MATCH-STATUS
          logger.info(" SMM-MATCH-STATUS->{}", new String(smmRec.getSmmMatchStatus())); 
//  DISPLAY ' SMM-CLASSIFICATION->' SMM-CLASSIFICATION
          logger.info(" SMM-CLASSIFICATION->{}", new String(smmRec.getSmmClassification())); 
//  DISPLAY ' SMM-FIELD1->' SMM-FIELD1
          logger.info(" SMM-FIELD1->{}", new String(smmKey.getSmmField1())); 
  
//  DISPLAY ' SMM-FIELD2->' SMM-FIELD2
          logger.info(" SMM-FIELD2->{}", new String(smmRec.getSmmField2())); 
//  DISPLAY ' SMM-FIELD3->' SMM-FIELD3
          logger.info(" SMM-FIELD3->{}", new String(smmKey.getSmmField3())); 
  
//  DISPLAY ' SMM-FIELD4->' SMM-FIELD4
          logger.info(" SMM-FIELD4->{}", new String(smmRec.getSmmField4())); 
//  DISPLAY ' SMM-FIELD5->' SMM-FIELD5
          logger.info(" SMM-FIELD5->{}", new String(smmRec.getSmmField5())); 
//  DISPLAY ' SMM-FIELD6->' SMM-FIELD6
          logger.info(" SMM-FIELD6->{}", new String(smmRec.getSmmField6())); 
//  DISPLAY ' SMM-FIELD7->' SMM-FIELD7
          logger.info(" SMM-FIELD7->{}", new String(smmRec.getSmmField7())); 
//  DISPLAY ' SMM-FIELD8->' SMM-FIELD8
          logger.info(" SMM-FIELD8->{}", new String(smmRec.getSmmField8())); 
//  DISPLAY ' SMM-FIELD9->' SMM-FIELD9
          logger.info(" SMM-FIELD9->{}", new String(smmRec.getSmmField9())); 
//  DISPLAY ' SMM-FIELD10->' SMM-FIELD10
          logger.info(" SMM-FIELD10->{}", new String(smmRec.getSmmField10())); 
//  DISPLAY ' SMM-FIELD11->' SMM-FIELD11
          logger.info(" SMM-FIELD11->{}", new String(smmRec.getSmmField11())); 
//  DISPLAY ' SMM-FIELD12->' SMM-FIELD12
          logger.info(" SMM-FIELD12->{}", new String(smmRec.getSmmField12())); 
//  DISPLAY ' SMM-FIELD13->' SMM-FIELD13
          logger.info(" SMM-FIELD13->{}", new String(smmRec.getSmmField13())); 
//  DISPLAY ' SMM-FIELD14->' SMM-FIELD14
          logger.info(" SMM-FIELD14->{}", new String(smmRec.getSmmField14())); 
//  DISPLAY ' SMM-FIELD15->' SMM-FIELD15
          logger.info(" SMM-FIELD15->{}", new String(smmRec.getSmmField15())); 
//  DISPLAY ' SMM-BRANCH->' SMM-BRANCH
          logger.info(" SMM-BRANCH->{}", new String(smmRec.getSmmBranch())); 
//  DISPLAY ' SMM-TELLER->' SMM-TELLER
          logger.info(" SMM-TELLER->{}", new String(smmRec.getSmmTeller())); 
//  DISPLAY ' SMM-HASH->' SMM-HASH
          logger.info(" SMM-HASH->{}", new String(smmRec.getSmmHash())); 
//  DISPLAY ' SMM-TYPE->' SMM-TYPE
          logger.info(" SMM-TYPE->{}", new String(smmRec.getSmmType())); 
//  DISPLAY ' SMM-APP-TYPE-PSET-NUM->' SMM-APP-TYPE-PSET-NUM
          logger.info(" SMM-APP-TYPE-PSET-NUM->{}", new String(smmRec.getSmmAppTypePsetNum())); 
//  DISPLAY ' SMM-POSTING-DATE->' SMM-POSTING-DATE
          logger.info(" SMM-POSTING-DATE->{}", new String(smmRec.getSmmPostingDate())); 
//  DISPLAY ' SMM-TRANS-TIME->' SMM-TRANS-TIME
          logger.info(" SMM-TRANS-TIME->{}", new String(smmRec.getSmmTransTime())); 
//  DISPLAY ' SMM-REF-TEXT1->' SMM-REF-TEXT1
          logger.info(" SMM-REF-TEXT1->{}", new String(smmRec.getSmmRefText1())); 
//  DISPLAY ' SMM-REF-TEXT2->' SMM-REF-TEXT2
          logger.info(" SMM-REF-TEXT2->{}", new String(smmRec.getSmmRefText2())); 
//  DISPLAY ' SMM-REF-TEXT3->' SMM-REF-TEXT3
          logger.info(" SMM-REF-TEXT3->{}", new String(smmRec.getSmmRefText3())); 
//  DISPLAY ' SMM-REF-TEXT4->' SMM-REF-TEXT4
          logger.info(" SMM-REF-TEXT4->{}", new String(smmRec.getSmmRefText4())); 
//  DISPLAY ' SMM-REF-TEXT5->' SMM-REF-TEXT5
          logger.info(" SMM-REF-TEXT5->{}", new String(smmRec.getSmmRefText5())); 
//  DISPLAY ' SMM-REF-NUM1->' SMM-REF-NUM1
          logger.info(" SMM-REF-NUM1->{}", new String(smmRec.getSmmRefNum1())); 
//  DISPLAY ' SMM-REF-NUM2->' SMM-REF-NUM2
          logger.info(" SMM-REF-NUM2->{}", new String(smmRec.getSmmRefNum2())); 
//  DISPLAY ' SMM-SUBCLASS->' SMM-SUBCLASS
          logger.info(" SMM-SUBCLASS->{}", new String(smmRec.getSmmSubclass())); 
//  DISPLAY ' SMM-FLAGS->' SMM-FLAGS
          logger.info(" SMM-FLAGS->{}", new String(smmRec.getSmmFlags())); 
//  DISPLAY ' SMM-DATASERVER-ID->' SMM-DATASERVER-ID
          logger.info(" SMM-DATASERVER-ID->{}", new String(smmKey.getSmmDataserverId())); 
  
//  DISPLAY ' SMM-CYCLE-NO->' SMM-CYCLE-NO
          logger.info(" SMM-CYCLE-NO->{}", new String(smmRec.getSmmCycleNo())); 
//  DISPLAY ' SMM-CYCLE-DATE->' SMM-CYCLE-DATE
          logger.info(" SMM-CYCLE-DATE->{}", new String(smmRec.getSmmCycleDate())); 
//  DISPLAY ' SMM-END->' SMM-END
          logger.info(" SMM-END->{}", new String(smmRec.getSmmEnd())); 
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
      private void termination() throws Exception {
			// Declare local variables used in the method
			long smmDupCnt = 0;
			// End of variable declaration

//  DISPLAY 'SUCCESSFUL COMPLETION OF TMSMMCPY'
          logger.info("SUCCESSFUL COMPLETION OF TMSMMCPY"); 
//  DISPLAY 'RECORDS READ = ' WS-SMM-RECORDS-READ
          logger.info("RECORDS READ = {}", String.valueOf(work.getSmmRecordsRead())); 
//  DISPLAY 'INVALID RECORDS DROPPED = ' WS-INVALID-SMM-CNT
          logger.info("INVALID RECORDS DROPPED = {}", String.valueOf(work.getInvalidSmmCnt())); 
//  DISPLAY 'DUPLICATE SMM KEYS (CORRECTED) = ' WS-SMM-DUP-CNT
          logger.info("DUPLICATE SMM KEYS (CORRECTED) = {}", String.valueOf(work.getSmmDupCnt())); 
//  DISPLAY 'RECORDS WRITTEN = ' WS-WRITE-SMM-CNT
          logger.info("RECORDS WRITTEN = {}", String.valueOf(work.getWriteSmmCnt())); 
//  CLOSE SMM-FILE-IN SMM-FILE-OUT
          smmFileIn.close(); 
          smmFileOut.close(); 
//  IF WS-SMM-DUP-CNT > ZERO
          if (	( work.getSmmDupCnt() > 0 ) ) { 
              // MOVE 4 TO RETURN-CODE
              this.setRc( 4);
          }
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
       loopOutputSmm = true;
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
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
