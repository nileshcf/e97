  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip606130.file.*;
  import com.cloudframe.app.ip606130.Ip606130Ctx.*;
  import com.cloudframe.app.ip606130.Ip606130Ctx;
  import com.cloudframe.app.process.Ip606130;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip5000TableId;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip670010;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.ip606130.file.records.Sort1TableIdKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.ip606130.dto.*;
  import com.cloudframe.app.ip606130.dto.Ip0040ArMaster;
  import com.cloudframe.app.ip606130.dto.Tbl91UpdatedTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.AbendParaName900;
  import com.cloudframe.app.ip606130.dto.Table36LoadMessage600;
  import com.cloudframe.app.ip606130.dto.Ip6063008600;
  import com.cloudframe.app.ip606130.dto.EndOfStepMsg300;
  import com.cloudframe.app.ip606130.dto.AbendMessage900;
  import com.cloudframe.app.ip606130.dto.Tbl90UpdatedTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.Tbl90DfltBsl2Msg600;
  import com.cloudframe.app.ip606130.file.records.Sys105TempTable90Rec;
  import com.cloudframe.app.ip606130.dto.Ip00361DefaultBsAgrmts;
  import com.cloudframe.app.ip606130.dto.Tbl90DfltBsl1Msg600;
  import com.cloudframe.app.ip606130.dto.Tbl91OriginalTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.Sys001Read300;
  import com.cloudframe.app.ip606130.dto.Ip00901BsArMaster;
  import com.cloudframe.app.ip606130.dto.Ip00911BsBinMaster;
  import com.cloudframe.app.ip606130.file.records.SortRec;
  import com.cloudframe.app.ip606130.dto.Ip0041BinTable;
  import com.cloudframe.app.ip606130.dto.Tbl90OriginalTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.Tbl91DfltBsl2Msg600;
  import com.cloudframe.app.ip606130.dto.IoError600;
  import com.cloudframe.app.ip606130.dto.FinalUpdatedTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.Ip6063009600;
  import com.cloudframe.app.ip606130.dto.Sys200Written300;
  import com.cloudframe.app.ip606130.dto.Tbl91DfltBsl1Msg600;
  import com.cloudframe.app.global.sharedvar.Ip0201ReducedFileFormat;
  import com.cloudframe.app.ip606130.file.records.Sys106TempTable91Rec;
  import com.cloudframe.app.ip606130.file.records.Sys200ExpParmMasterRec;
  import com.cloudframe.app.ip606130.dto.TotalDefaultsMsg600;
  import com.cloudframe.app.ip606130.file.records.Sys001ReducedParmMasterRec;
  import com.cloudframe.app.ip606130.dto.TrailerErrMessage600;
  import com.cloudframe.app.ip606130.dto.FinalOriginalTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.InavalidDateMsg600;
  import com.cloudframe.app.global.sharedvar.Ip5000ParameterMasterRec;
  import com.cloudframe.app.ip606130.dto.UpdateTrailerRecGroup200;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip606130.dto.Ip00002Table0Data;
  import com.cloudframe.app.ip606130.dto.BussServDftls600;
  import com.cloudframe.app.ip606130.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import org.springframework.beans.factory.InitializingBean;
  import org.springframework.beans.factory.DisposableBean;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sort.SortProperties;
  import com.cloudframe.app.sort.strategy.SortPathStrategy;
  import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
  import com.cloudframe.app.sort.model.SortKeyObject;
  import org.springframework.context.annotation.Lazy;
  
  @Component("ip606130")
  
  public class Ip606130Impl extends CommonProcess implements Ip606130, InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Ip606130Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip606130_sys105TempTable90")
  Sys105TempTable90 sys105TempTable90;
  @Autowired 
  @Qualifier("ip606130_sys106TempTable91")
  Sys106TempTable91 sys106TempTable91;
  @Autowired 
  @Qualifier("ip606130_sys001ReducedParmMaster")
  Sys001ReducedParmMaster sys001ReducedParmMaster;
  @Autowired 
  @Qualifier("ip606130_sys200ExpandedParmMaster")
  Sys200ExpandedParmMaster sys200ExpandedParmMaster;
  @Autowired 
  @Qualifier("ip670010")
  Ip670010 ip670010;
  @Autowired 
  @Qualifier("ip606130_sortFileInternIn")
  SortFileInternIn sortFileInternIn;
  @Autowired 
  @Qualifier("ip606130_sortFileInternOut")
  SortFileInternOut sortFileInternOut;
  
  @Autowired
  @Lazy
  SortStrategyDecider sortDecider;
  
  SortPathStrategy sortProcesser;
  
  @Value("${cf.sort.using.file.strategy:no}")
  private String usingSortFileStrategy;  
  
  @Value("${cf.sort.useTempFile:yes}")
  private String useTempFile;
  
  
  private static final int SORT1TABLEID_OFFSET = 0;
  private static final int SORT1TABLEID_LENGTH = 8;
  private static final int SORT1KEY_OFFSET = 8;
  private static final int SORT1KEY_LENGTH = 99;
  private static final int SORT1TABLEEFFDATE_OFFSET = 107;
  private static final int SORT1TABLEEFFDATE_LENGTH = 10;
  private List<Sort1TableIdKeys> sortRecKeys = new ArrayList<>();
  private Comparator<Sort1TableIdKeys> sortComp = null;
  
  
  
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
      public int process(Ip606130Ctx programCtx) throws Exception {
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
      		if(sys105TempTable90.hasOpened() && !sys105TempTable90.isReadOnly()) { 
      			sys105TempTable90.flush(); 
      		}
      		if(sys106TempTable91.hasOpened() && !sys106TempTable91.isReadOnly()) { 
      			sys106TempTable91.flush(); 
      		}
      		if(sys001ReducedParmMaster.hasOpened() && !sys001ReducedParmMaster.isReadOnly()) { 
      			sys001ReducedParmMaster.flush(); 
      		}
      		if(sys200ExpandedParmMaster.hasOpened() && !sys200ExpandedParmMaster.isReadOnly()) { 
      			sys200ExpandedParmMaster.flush(); 
      		}
      		if(sortFileInternIn.hasOpened() && !sortFileInternIn.isReadOnly()) { 
      			sortFileInternIn.flush(); 
      		}
      		if(sortFileInternOut.hasOpened() && !sortFileInternOut.isReadOnly()) { 
      			sortFileInternOut.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - inputFileSw100                 COBOL Name: 100-INPUT-FILE-SW
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls routines to,                              *
// *  a. initialize the process.                                    *
// *  b. routine to read the first record from the input file.      *
// *  c. routine to restore the mpe record size.                    *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
//  PERFORM 1000-INITIALIZE-PROCESS
          initializeProcess(programCtx.getInitializeProcessInCtx());/*1000-INITIALIZE-PROCESS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-INPUT-FILE UNTIL 88-100-INPUT-FILE-DONE
          while (!(methodIn.isInputFileDone88100()) ) {
             processInputFile(programCtx.getProcessInputFileInCtx());/*2000-PROCESS-INPUT-FILE*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 3000-END-OF-JOB
          endOfJob(programCtx.getEndOfJobInCtx());/*3000-END-OF-JOB*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 4000-PRINT-COUNTS
          printCounts(programCtx.getPrintCountsInCtx());/*4000-PRINT-COUNTS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * initializeProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE-PROCESS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - pgmName300                     COBOL Name: 300-PGM-NAME
      * - isItFirstTime100               COBOL Name: 100-IS-IT-FIRST-TIME
      * - pgmIp670010300                 COBOL Name: 300-PGM-IP670010
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmName300                     COBOL Name: 300-PGM-NAME
      * - expandedLength800              COBOL Name: 800-EXPANDED-LENGTH
      * - ptrIp670010800                 COBOL Name: 800-PTR-IP670010
      * - isItFirstTime100               COBOL Name: 100-IS-IT-FIRST-TIME
      * - isItFirstRead100               COBOL Name: 100-IS-IT-FIRST-READ
      * - table40Length800               COBOL Name: 800-TABLE-40-LENGTH
      *
      * @throws CFException
      */
      @Override
      public InitializeProcessOutCtx initializeProcess(InitializeProcessInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int IP_5000_EFFECTIVE_DATE_LENGTH = 10;
			 final int IP_5000_ACTION_CODE_LENGTH = 1;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph calls routines to,                              *
// *  a. update event log                                           *
// *  b. display execution messages                                 *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
InitializeProcessOutCtx methodOut = methodIn.getInitializeProcessOutCtx();
//  MOVE 300-PGM-NAME TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getPgmName300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MESSAGES
              displayExecMessages(programCtx.getDisplayExecMessagesInCtx());/*1100-DISPLAY-EXEC-MESSAGES*/
//  PERFORM 1200-FILE-OPEN-PROCESS
              fileOpenProcess(programCtx.getFileOpenProcessInCtx());/*1200-FILE-OPEN-PROCESS*/
//  PERFORM 2241-10-OPEN-TEMP-FILES
              _10OpenTempFiles(programCtx.get_10OpenTempFilesInCtx());/*2241-10-OPEN-TEMP-FILES*/
//  MOVE ZERO TO 800-EXPANDED-LENGTH
              methodOut.setExpandedLength800(0);

// *Swb     set 800-ptr-ip610010            to entry 300-pgm-ip610010
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
              methodOut.setPtrIp670010800(methodIn.getPgmIp670010300()); 
              
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
//  SET 88-100-IT-IS-FIRST-READ TO TRUE
              methodOut.setItIsFirstRead88100True(); 
              
//  ADD LENGTH OF IP5000-EFFECTIVE-DATE LENGTH OF IP5000-ACTION-CODE LENGTH OF IP5000-TABLE-ID TO 800-EXPANDED-LENGTH
              methodOut.setExpandedLength800(methodOut.getExpandedLength800()+IP_5000_EFFECTIVE_DATE_LENGTH+IP_5000_ACTION_CODE_LENGTH+Ip5000TableId.getIp5000TableIdFieldLength());
//  MOVE LENGTH OF IP0040-AR-MASTER TO 800-TABLE-40-LENGTH
              methodOut.setTable40Length800(Ip0040ArMaster.getIp0040ArMasterFieldLength());
          }
//  PERFORM 8000-READ-INPUT-FILE
          readInputFile(programCtx.getReadInputFileInCtx());/*8000-READ-INPUT-FILE*/
//  PERFORM 1300-CHECK-FOR-HEADERS
          checkForHeaders(programCtx.getCheckForHeadersInCtx());/*1300-CHECK-FOR-HEADERS*/
//  SET 88-100-IT-IS-NOT-FIRST-READ TO TRUE
          methodOut.setItIsNotFirstRead88100True(); 
          
      
      return methodOut;
      }
      /**
      * displayExecMessages 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MESSAGES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - pgmName300                     COBOL Name: 300-PGM-NAME
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmName300                     COBOL Name: 300-PGM-NAME
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      *
      * @throws CFException
      */
      @Override
      public DisplayExecMessagesOutCtx displayExecMessages(DisplayExecMessagesInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph displays program execution messages by calling  *
// * program - ip996010.                                            *
// *----------------------------------------------------------------*

// *Swb set  800-ptr-ip996010         to entry 300-pgm-ip996010
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
DisplayExecMessagesOutCtx methodOut = methodIn.getDisplayExecMessagesOutCtx();
//  MOVE 300-PGM-NAME TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmName300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
//  MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          methodOut.setIp996011WhenCompiled(CONSTANTS.LITERAL_479954777);

// *Swb call 800-ptr-ip996010.

// *----------------------------------------------------------------*
// * This paragraph opens input and output files. it reads the first*
// * record from the input file.                                    *
// *----------------------------------------------------------------*
//  DISPLAY 'IN IP606130 - COMMENTED IP996010 CALL'
          logger.info("IN IP606130 - COMMENTED IP996010 CALL"); 
      
      return methodOut;
      }
      /**
      * fileOpenProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-FILE-OPEN-PROCESS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys200File300                  COBOL Name: 300-SYS200-FILE
      * - para1200300                    COBOL Name: 300-PARA-1200
      * - openSys200File300              COBOL Name: 300-OPEN-SYS200-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys200File300                  COBOL Name: 300-SYS200-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1200300                    COBOL Name: 300-PARA-1200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openSys200File300              COBOL Name: 300-OPEN-SYS200-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public FileOpenProcessOutCtx fileOpenProcess(FileOpenProcessInCtx methodIn) throws Exception {
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
FileOpenProcessOutCtx methodOut = methodIn.getFileOpenProcessOutCtx();
//  PERFORM 8350-OPEN-INPUT-SYS001
          openInputSys001(programCtx.getOpenInputSys001InCtx());/*8350-OPEN-INPUT-SYS001*/
//  OPEN OUTPUT SYS200-EXPANDED-PARM-MASTER
          sys200ExpandedParmMaster.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys200ExpandedParmMaster.getFileName(),sys200ExpandedParmMaster.getSys200ExpandedParmMasterCharSet(),sys200ExpandedParmMaster.getSys200ExpandedParmMasterCrlfFlag());
          methodOut.setOutputFileStatus200(sys200ExpandedParmMaster.getStatusString() );
//  IF 88-200-SYS200-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys200StatusGood88200()) ) { 
//  MOVE 300-SYS200-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys200File300());
//  MOVE 200-OUTPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getOutputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  MOVE 300-OPEN-SYS200-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenSys200File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * checkForHeaders 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-CHECK-FOR-HEADERS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip0201ReducedFileFormat        COBOL Name: IP0201-REDUCED-FILE-FORMAT
      * - updateHdrRec300                COBOL Name: 300-UPDATE-HDR-REC
      * - replacmntHdrRec300             COBOL Name: 300-REPLACMNT-HDR-REC
      * - headerRecordMissing600         COBOL Name: 600-HEADER-RECORD-MISSING
      * - para1300300                    COBOL Name: 300-PARA-1300
      * - hdrMissingAbendCode300         COBOL Name: 300-HDR-MISSING-ABEND-CODE
      *
      * Output :  

      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1300300                    COBOL Name: 300-PARA-1300
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - hdrMissingAbendCode300         COBOL Name: 300-HDR-MISSING-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - headerRecordMissing600         COBOL Name: 600-HEADER-RECORD-MISSING
      * - condCode300                    COBOL Name: 300-COND-CODE
      *
      * @throws CFException
      */
      @Override
      public CheckForHeadersOutCtx checkForHeaders(CheckForHeadersInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para checks for expected header record. if update or      *
// * replacement header record is not found, program abends.        *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
CheckForHeadersOutCtx methodOut = methodIn.getCheckForHeadersOutCtx();
//  IF IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-UPDATE-HDR-REC OR 300-REPLACMNT-HDR-REC
//  ELSE
          if (!(Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getUpdateHdrRec300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) && !(Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getReplacmntHdrRec300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/))) { 
//  DISPLAY 600-HEADER-RECORD-MISSING
              logger.info(new String(methodOut.getHeaderRecordMissing600())); 
//  MOVE 300-PARA-1300 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1300300());
//  MOVE 300-HDR-MISSING-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getHdrMissingAbendCode300());
//  MOVE 600-HEADER-RECORD-MISSING TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(66,methodOut.getHeaderRecordMissing600(),SPACE_CHAR,RIGHT_PAD));
              // MOVE 12 TO 300-COND-CODE
              methodOut.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * processInputFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-INPUT-FILE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ip0201ReducedFileFormat        COBOL Name: IP0201-REDUCED-FILE-FORMAT
      * - trailerRecord300               COBOL Name: 300-TRAILER-RECORD
      * - updateHdrRec300                COBOL Name: 300-UPDATE-HDR-REC
      * - replacmntHdrRec300             COBOL Name: 300-REPLACMNT-HDR-REC
      * - writeTheRecord100              COBOL Name: 100-WRITE-THE-RECORD
      *
      * Output :  

      * - writeTheRecord100              COBOL Name: 100-WRITE-THE-RECORD
      *
      * @throws CFException
      */
      @Override
      public ProcessInputFileOutCtx processInputFile(ProcessInputFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls another routine to expand the current mpe *
// * record. for header/trailer records, a routine is performed to  *
// * process these records.                                         *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ProcessInputFileOutCtx methodOut = methodIn.getProcessInputFileOutCtx();
//  IF IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD OR 300-UPDATE-HDR-REC OR 300-REPLACMNT-HDR-REC
          if (Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getTrailerRecord300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/) || Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getUpdateHdrRec300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/) || Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getReplacmntHdrRec300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) { 
//  PERFORM 2100-PROCESS-HEADER-TRAILER
              processHeaderTrailer(programCtx.getProcessHeaderTrailerInCtx());/*2100-PROCESS-HEADER-TRAILER*/
          }
//  ELSE
          else { 
//  PERFORM 2200-EXPAND-MPE
              expandMpe(programCtx.getExpandMpeInCtx());/*2200-EXPAND-MPE*/
          }
//  IF 88-100-WRITE
          if ( methodOut.isWrite88100()  ) { 
//  PERFORM 8200-WRITE-EXPANDED-RECORD
              writeExpandedRecord(programCtx.getWriteExpandedRecordInCtx());/*8200-WRITE-EXPANDED-RECORD*/
          }
//  ELSE
          else { 
//  SET 88-100-WRITE TO TRUE
              methodOut.setWrite88100True(); 
              
          }
//  PERFORM 8000-READ-INPUT-FILE
          readInputFile(programCtx.getReadInputFileInCtx());/*8000-READ-INPUT-FILE*/
          ;
      
      return methodOut;
      }
      /**
      * processHeaderTrailer 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-PROCESS-HEADER-TRAILER COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ip0201ReducedFileFormat        COBOL Name: IP0201-REDUCED-FILE-FORMAT
      * - tableIp0036t1300               COBOL Name: 300-TABLE-IP0036T1
      * - tableIp0090t1300               COBOL Name: 300-TABLE-IP0090T1
      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - tableIp0091t1300               COBOL Name: 300-TABLE-IP0091T1
      * - finalTrailer300                COBOL Name: 300-FINAL-TRAILER
      * - trailerRecord300               COBOL Name: 300-TRAILER-RECORD
      * - sys001RdwIn800                 COBOL Name: 800-SYS001-RDW-IN
      *
      * Output :  

      * - updateTrailerRec200            COBOL Name: 200-UPDATE-TRAILER-REC
      * - ip0201ReducedFileFormat        COBOL Name: IP0201-REDUCED-FILE-FORMAT
      * - writeTheRecord100              COBOL Name: 100-WRITE-THE-RECORD
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      * - sys001RdwIn800                 COBOL Name: 800-SYS001-RDW-IN
      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      *
      * @throws CFException
      */
      @Override
      public ProcessHeaderTrailerOutCtx processHeaderTrailer(ProcessHeaderTrailerInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the tailer and header records.               *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ProcessHeaderTrailerOutCtx methodOut = methodIn.getProcessHeaderTrailerOutCtx();
//  MOVE IP0201-REDUCED-FILE-FORMAT TO 200-UPDATE-TRAILER-REC
          methodOut.setUpdateTrailerRec200(methodOut.getIp0201ReducedFileFormat().getCharArray());
//  EVALUATE 200-UPDATE-TRAILER-TABLE1
          if  (		compareChars(methodIn.getUpdateTrailerTable1200(),methodIn.getTableIp0036t1300()) == 0 ) { 
//  PERFORM 2140-CHECK-TRAILER-COUNTS
              checkTrailerCounts(programCtx.getCheckTrailerCountsInCtx());/*2140-CHECK-TRAILER-COUNTS*/
//  SET 88-100-DO-NOT-WRITE TO TRUE
              methodOut.setDoNotWrite88100True(); 
              
          }
          else if  (		compareChars(methodIn.getUpdateTrailerTable1200(),methodIn.getTableIp0090t1300()) == 0 ) { 
//  IF 88-100-BUILD-DFLT-AGRMNT
              if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM 2150-PROCESS-IP9000T1
                  processIp9000t1(programCtx.getProcessIp9000t1InCtx());/*2150-PROCESS-IP9000T1*/
//  PERFORM 2110-PROCESS-TABLE90-TRAILER
                  processTable90Trailer(programCtx.getProcessTable90TrailerInCtx());/*2110-PROCESS-TABLE90-TRAILER*/
//  PERFORM 2160-PROCESS-OTHER-TBLS
                  processOtherTbls(programCtx.getProcessOtherTblsInCtx());/*2160-PROCESS-OTHER-TBLS*/
              }
//  ELSE
              else { 
//  PERFORM 2110-PROCESS-TABLE90-TRAILER
                  processTable90Trailer(programCtx.getProcessTable90TrailerInCtx());/*2110-PROCESS-TABLE90-TRAILER*/
              }
          }
          else if  (		compareChars(methodIn.getUpdateTrailerTable1200(),methodIn.getTableIp0091t1300()) == 0 ) { 
//  PERFORM 2120-PROCESS-TABLE91-TRAILER
              processTable91Trailer(programCtx.getProcessTable91TrailerInCtx());/*2120-PROCESS-TABLE91-TRAILER*/
          }
          else if  (		compareChars(methodIn.getUpdateTrailerTable1200(),methodIn.getFinalTrailer300()) == 0 ) { 
//  PERFORM 2130-PROCESS-FINAL-TRAILER
              processFinalTrailer(programCtx.getProcessFinalTrailerInCtx());/*2130-PROCESS-FINAL-TRAILER*/
          }
          else   { 
//  IF IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD
              if (Field.compareChar(methodOut.getIp0201ReducedFileFormat().toCharArray() , methodIn.getTrailerRecord300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) { 
//  PERFORM 2140-CHECK-TRAILER-COUNTS
                  checkTrailerCounts(programCtx.getCheckTrailerCountsInCtx());/*2140-CHECK-TRAILER-COUNTS*/
              }
          }
//  MOVE 200-UPDATE-TRAILER-REC TO IP5000-PARAMETER-MASTER-REC (1 : 800-SYS001-RDW-IN )
          methodOut.getIp5000ParameterMasterRec().replace(methodIn.getUpdateTrailerRecGroup200()/*parent*/,0/*fromOffset - (ip5000ParameterMasterRec) */,80/*fromLen*/,0/*toOffset - (updateTrailerRec200) */,(int) methodOut.getSys001RdwIn800()/*toLen*/);
//  MOVE 800-SYS001-RDW-IN TO 800-SYS200-RDW-OUT
          methodOut.setSys200RdwOut800(methodOut.getSys001RdwIn800());
          // MOVE ZERO TO 400-RECORDS-COUNT
          methodOut.setRecordsCount400(0);
      
      return methodOut;
      }
      /**
      * processTable90Trailer 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-PROCESS-TABLE90-TRAILER COBOL Cyclomatic complexity - 2
      * Input  :  

      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - noOfSortedRecs400              COBOL Name: 400-NO-OF-SORTED-RECS
      *
      * Output :  

      * - table90OriginalCount600        COBOL Name: 600-TABLE90-ORIGINAL-COUNT
      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - table90UpdateCount600          COBOL Name: 600-TABLE90-UPDATE-COUNT
      * - noOfSortedRecs400              COBOL Name: 400-NO-OF-SORTED-RECS
      *
      * @throws CFException
      */
      @Override
      public ProcessTable90TrailerOutCtx processTable90Trailer(ProcessTable90TrailerInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the trailer record for table 90.if build dflt*
// * agreement switch is set, the para sorts the temp file and then *
// * write all the records to output file including the trailer     *
// * record. the count is updated.                                  *
// * if build dflt agreement switch is not set, then para simply    *
// * write the trailer record with the original count.              *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ProcessTable90TrailerOutCtx methodOut = methodIn.getProcessTable90TrailerOutCtx();
//  PERFORM 2140-CHECK-TRAILER-COUNTS
          checkTrailerCounts(programCtx.getCheckTrailerCountsInCtx());/*2140-CHECK-TRAILER-COUNTS*/
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-TABLE90-ORIGINAL-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setTable90OriginalCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getUpdateTrailerCount1200()).toCharArray()));
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM 8400-CLOSE-TEMP90-FILE
              closeTemp90File(programCtx.getCloseTemp90FileInCtx());/*8400-CLOSE-TEMP90-FILE*/
//  PERFORM 7000-SORT-THE-TEMP-FILE
              sortTheTempFile(programCtx.getSortTheTempFileInCtx());/*7000-SORT-THE-TEMP-FILE*/
//  MOVE 400-NO-OF-SORTED-RECS TO 200-UPDATE-TRAILER-COUNT1 600-TABLE90-UPDATE-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setUpdateTrailerCount1200(methodOut.getNoOfSortedRecs400());
              methodOut.setTable90UpdateCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getNoOfSortedRecs400()).toCharArray()));
          }
      
      return methodOut;
      }
      /**
      * processTable91Trailer 
      *   This method is derived from 
  *   COBOL Paragraph - 2120-PROCESS-TABLE91-TRAILER COBOL Cyclomatic complexity - 2
      * Input  :  

      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - noOfSortedRecs400              COBOL Name: 400-NO-OF-SORTED-RECS
      *
      * Output :  

      * - table91OriginalCount600        COBOL Name: 600-TABLE91-ORIGINAL-COUNT
      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - table91UpdateCount600          COBOL Name: 600-TABLE91-UPDATE-COUNT
      * - noOfSortedRecs400              COBOL Name: 400-NO-OF-SORTED-RECS
      *
      * @throws CFException
      */
      @Override
      public ProcessTable91TrailerOutCtx processTable91Trailer(ProcessTable91TrailerInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the trailer record for table 91.if build dflt*
// * agreement switch is set, the para sorts the temp file and then *
// * write all the records to output file including the trailer     *
// * record. the count is updated.                                  *
// * if build dflt agreement switch is not set, then para simply    *
// * write the trailer record with the original count.              *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ProcessTable91TrailerOutCtx methodOut = methodIn.getProcessTable91TrailerOutCtx();
//  PERFORM 2140-CHECK-TRAILER-COUNTS
          checkTrailerCounts(programCtx.getCheckTrailerCountsInCtx());/*2140-CHECK-TRAILER-COUNTS*/
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-TABLE91-ORIGINAL-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setTable91OriginalCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getUpdateTrailerCount1200()).toCharArray()));
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM 8500-CLOSE-TEMP91-FILE
              closeTemp91File(programCtx.getCloseTemp91FileInCtx());/*8500-CLOSE-TEMP91-FILE*/
//  PERFORM 7000-SORT-THE-TEMP-FILE
              sortTheTempFile(programCtx.getSortTheTempFileInCtx());/*7000-SORT-THE-TEMP-FILE*/
//  MOVE 400-NO-OF-SORTED-RECS TO 200-UPDATE-TRAILER-COUNT1 600-TABLE91-UPDATE-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setUpdateTrailerCount1200(methodOut.getNoOfSortedRecs400());
              methodOut.setTable91UpdateCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getNoOfSortedRecs400()).toCharArray()));
          }
      
      return methodOut;
      }
      /**
      * processFinalTrailer 
      *   This method is derived from 
  *   COBOL Paragraph - 2130-PROCESS-FINAL-TRAILER COBOL Cyclomatic complexity - 2
      * Input  :  

      * - recsWritten400                 COBOL Name: 400-RECS-WRITTEN
      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - recsRead400                    COBOL Name: 400-RECS-READ
      *
      * Output :  

      * - finalRecords400                COBOL Name: 400-FINAL-RECORDS
      * - finalTrlrOriginalCnt600        COBOL Name: 600-FINAL-TRLR-ORIGINAL-CNT
      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - finalTrlrUpdatedCnt600         COBOL Name: 600-FINAL-TRLR-UPDATED-CNT
      *
      * @throws CFException
      */
      @Override
      public ProcessFinalTrailerOutCtx processFinalTrailer(ProcessFinalTrailerInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the final trailer record.
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ProcessFinalTrailerOutCtx methodOut = methodIn.getProcessFinalTrailerOutCtx();
          methodOut.setFinalRecords400((long)Math.abs(methodIn.getRecsWritten400() + 1));
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-FINAL-TRLR-ORIGINAL-CNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setFinalTrlrOriginalCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getUpdateTrailerCount1200()).toCharArray()));
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-FINAL-TRLR-ORIGINAL-CNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setFinalTrlrOriginalCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getUpdateTrailerCount1200()).toCharArray()));
//  MOVE 400-RECS-READ TO 400-RECORDS-COUNT
              methodOut.setRecordsCount400(methodOut.getRecsRead400());
//  PERFORM 2140-CHECK-TRAILER-COUNTS
              checkTrailerCounts(programCtx.getCheckTrailerCountsInCtx());/*2140-CHECK-TRAILER-COUNTS*/
//  MOVE 400-FINAL-RECORDS TO 200-UPDATE-TRAILER-COUNT1 600-FINAL-TRLR-UPDATED-CNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setUpdateTrailerCount1200(methodOut.getFinalRecords400());
              methodOut.setFinalTrlrUpdatedCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getFinalRecords400()).toCharArray()));
          }
//  ELSE
          else { 
              // MOVE 400-FINAL-RECORDS TO 400-RECORDS-COUNT
              methodOut.setRecordsCount400(methodOut.getFinalRecords400());
//  PERFORM 2140-CHECK-TRAILER-COUNTS
              checkTrailerCounts(programCtx.getCheckTrailerCountsInCtx());/*2140-CHECK-TRAILER-COUNTS*/
          }
      
      return methodOut;
      }
      /**
      * checkTrailerCounts 
      *   This method is derived from 
  *   COBOL Paragraph - 2140-CHECK-TRAILER-COUNTS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - updateTrailerTable1200         COBOL Name: 200-UPDATE-TRAILER-TABLE1
      * - space600                       COBOL Name: 600-SPACE
      * - trailerErrMessage600           COBOL Name: 600-TRAILER-ERR-MESSAGE
      *
      * Output :  

      * - errorInpCount600               COBOL Name: 600-ERROR-INP-COUNT
      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      * - errorTrlCount600               COBOL Name: 600-ERROR-TRL-COUNT
      * - updateTrailerCount1200         COBOL Name: 200-UPDATE-TRAILER-COUNT1
      * - errorTableNbr600               COBOL Name: 600-ERROR-TABLE-NBR
      * - updateTrailerTable1200         COBOL Name: 200-UPDATE-TRAILER-TABLE1
      *
      * @throws CFException
      */
      @Override
      public CheckTrailerCountsOutCtx checkTrailerCounts(CheckTrailerCountsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the trailer record for table 91.if build dflt*
// * agreement switch is set, the para sorts the temp file and then *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
CheckTrailerCountsOutCtx methodOut = methodIn.getCheckTrailerCountsOutCtx();
//  IF 400-RECORDS-COUNT = 200-UPDATE-TRAILER-COUNT1
//  ELSE
          if (	( methodOut.getRecordsCount400() != methodOut.getUpdateTrailerCount1200() )) { 
//  MOVE 400-RECORDS-COUNT TO 600-ERROR-INP-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setErrorInpCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getRecordsCount400()).toCharArray()));
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-ERROR-TRL-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setErrorTrlCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getUpdateTrailerCount1200()).toCharArray()));
//  MOVE 200-UPDATE-TRAILER-TABLE1 TO 600-ERROR-TABLE-NBR
              methodOut.setErrorTableNbr600(methodOut.getUpdateTrailerTable1200());
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  DISPLAY 600-TRAILER-ERR-MESSAGE
              logger.info(methodIn.getTrailerErrMessage600().toString()); 
          }
      
      return methodOut;
      }
      /**
      * processIp9000t1 
      *   This method is derived from 
  *   COBOL Paragraph - 2150-PROCESS-IP9000T1 COBOL Cyclomatic complexity - 8
      * Input  :  

      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - inputFileSw100                 COBOL Name: 100-INPUT-FILE-SW
      * - ip0201ReducedFileFormat        COBOL Name: IP0201-REDUCED-FILE-FORMAT
      * - finalTrailer300                COBOL Name: 300-FINAL-TRAILER
      * - ip0201TblSubId                 COBOL Name: IP0201-TBL-SUB-ID
      * - tblIp9000t1SubId800            COBOL Name: 800-TBL-IP9000T1-SUB-ID
      * - trailerRecord300               COBOL Name: 300-TRAILER-RECORD
      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - tableIp9000t1300               COBOL Name: 300-TABLE-IP9000T1
      *
      * Output :  

      * - holdRecsRead400                COBOL Name: 400-HOLD-RECS-READ
      * - recsRead400                    COBOL Name: 400-RECS-READ
      *
      * @throws CFException
      */
      @Override
      public ProcessIp9000t1OutCtx processIp9000t1(ProcessIp9000t1InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para processes table ip9000t1 records. for ip9000t1 record*
// * table 90 default agreeement is built.                          *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ProcessIp9000t1OutCtx methodOut = methodIn.getProcessIp9000t1OutCtx();
//  MOVE 400-RECS-READ TO 400-HOLD-RECS-READ
          methodOut.setHoldRecsRead400(methodOut.getRecsRead400());
//  MOVE ZEROES TO 400-RECS-READ
          methodOut.setRecsRead400(0);
//  PERFORM UNTIL 88-100-INPUT-FILE-DONE OR IP0201-REDUCED-FILE-FORMAT (16 : 8) = 300-FINAL-TRAILER OR IP0201-TBL-SUB-ID = 800-TBL-IP9000T1-SUB-ID
          while ((!(methodIn.isInputFileDone88100())  && !(Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getFinalTrailer300() , ( 15 /*start*/ ), 8 /*left len*/ , 8 /*right len*/)) && 		compareChars(methodIn.getIp0201TblSubId(),methodIn.getTblIp9000t1SubId800()) != 0 )) {
//  PERFORM 8000-READ-INPUT-FILE
              readInputFile(programCtx.getReadInputFileInCtx());/*8000-READ-INPUT-FILE*/
          }
//  IF IP0201-TBL-SUB-ID EQUAL 800-TBL-IP9000T1-SUB-ID
          if (		compareChars(methodIn.getIp0201TblSubId(),methodIn.getTblIp9000t1SubId800()) == 0 ) { 
//  PERFORM UNTIL 88-100-INPUT-FILE-DONE OR IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD
              while ((!(methodIn.isInputFileDone88100())  && !(Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getTrailerRecord300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)))) {
//  PERFORM 2220-DATE-CONVERSION
                  dateConversion(programCtx.getDateConversionInCtx());/*2220-DATE-CONVERSION*/
//  PERFORM 2230-TABLE-ID-CONVERSION
                  tableIdConversion(programCtx.getTableIdConversionInCtx());/*2230-TABLE-ID-CONVERSION*/
//  IF IP5000-TABLE-ID = 300-TABLE-IP9000T1
                  if (		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp9000t1300()) == 0 ) { 
//  PERFORM 2242-BUILD-TABLE90-DFLTS
                      buildTable90Dflts(programCtx.getBuildTable90DfltsInCtx());/*2242-BUILD-TABLE90-DFLTS*/
                  }
//  PERFORM 8000-READ-INPUT-FILE
                  readInputFile(programCtx.getReadInputFileInCtx());/*8000-READ-INPUT-FILE*/
              }
          }
      
      return methodOut;
      }
      /**
      * processOtherTbls 
      *   This method is derived from 
  *   COBOL Paragraph - 2160-PROCESS-OTHER-TBLS COBOL Cyclomatic complexity - 4
      * Input  :  

      * - inputFileSw100                 COBOL Name: 100-INPUT-FILE-SW
      * - ip0201ReducedFileFormat        COBOL Name: IP0201-REDUCED-FILE-FORMAT
      * - trailerRecord300               COBOL Name: 300-TRAILER-RECORD
      * - tableIp0090t1300               COBOL Name: 300-TABLE-IP0090T1
      * - holdRecsRead400                COBOL Name: 400-HOLD-RECS-READ
      *
      * Output :  

      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - holdRecsRead400                COBOL Name: 400-HOLD-RECS-READ
      *
      * @throws CFException
      */
      @Override
      public ProcessOtherTblsOutCtx processOtherTbls(ProcessOtherTblsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para is used to have a dummy read upto table 90 trailer   *
// * record.                                                        *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ProcessOtherTblsOutCtx methodOut = methodIn.getProcessOtherTblsOutCtx();
//  PERFORM 8300-CLOSE-SYS001
          closeSys001(programCtx.getCloseSys001InCtx());/*8300-CLOSE-SYS001*/
//  PERFORM 8350-OPEN-INPUT-SYS001
          openInputSys001(programCtx.getOpenInputSys001InCtx());/*8350-OPEN-INPUT-SYS001*/
//  PERFORM 8000-READ-INPUT-FILE
          readInputFile(programCtx.getReadInputFileInCtx());/*8000-READ-INPUT-FILE*/
//  PERFORM UNTIL 88-100-INPUT-FILE-DONE OR ( IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD AND IP0201-REDUCED-FILE-FORMAT (16 : 8) = 300-TABLE-IP0090T1 )
          while ((!(methodIn.isInputFileDone88100())  && (!(Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getTrailerRecord300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) || !(Field.compareChar(methodIn.getIp0201ReducedFileFormat().toCharArray() , methodIn.getTableIp0090t1300() , ( 15 /*start*/ ), 8 /*left len*/ , 8 /*right len*/))))) {
//  PERFORM 8000-READ-INPUT-FILE
              readInputFile(programCtx.getReadInputFileInCtx());/*8000-READ-INPUT-FILE*/
          }
//  MOVE 400-HOLD-RECS-READ TO 400-RECS-READ
          methodOut.setRecsRead400(methodOut.getHoldRecsRead400());
      
      return methodOut;
      }
      /**
      * expandMpe 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-EXPAND-MPE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001ReducedParmMasterRec     COBOL Name: SYS001-REDUCED-PARM-MASTER-REC
      * - sys001RdwIn800                 COBOL Name: 800-SYS001-RDW-IN
      *
      * Output :  

      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      * - sys001RdwIn800                 COBOL Name: 800-SYS001-RDW-IN
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - sys001ReducedParmMasterRec     COBOL Name: SYS001-REDUCED-PARM-MASTER-REC
      *
      * @throws CFException
      */
      @Override
      public ExpandMpeOutCtx expandMpe(ExpandMpeInCtx methodIn) throws Exception {
      
// * B. calls routine to convert table-id and change rdw as required*
// * c. calls routine to perform table by table conversion          *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ExpandMpeOutCtx methodOut = methodIn.getExpandMpeOutCtx();
//  IF SYS001-REDUCED-PARM-MASTER-REC (12 : 8) EQUAL 'IP0000T1'
//  LITERAL_IP0000T1 = 'IP0000T1'
          if (Field.compareChar(methodOut.getSys001ReducedParmMasterRec().toCharArray() , CONSTANTS.LITERAL_IP0000T1 , ( 11 /*start*/ ), 8 /*left len*/ , 8 /*right len*/)) { 
//  MOVE 800-SYS001-RDW-IN TO 800-SYS200-RDW-OUT
              methodOut.setSys200RdwOut800(methodOut.getSys001RdwIn800());
//  MOVE SYS001-REDUCED-PARM-MASTER-REC TO IP5000-PARAMETER-MASTER-REC
              methodOut.getIp5000ParameterMasterRec().setString(pad(32756,methodOut.getSys001ReducedParmMasterRec().getCharArray(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 2210-LOAD-TABLE0-RECORDS
              loadTable0Records(programCtx.getLoadTable0RecordsInCtx());/*2210-LOAD-TABLE0-RECORDS*/
          }
//  ELSE
          else { 
//  PERFORM 2220-DATE-CONVERSION
              dateConversion(programCtx.getDateConversionInCtx());/*2220-DATE-CONVERSION*/
//  PERFORM 2230-TABLE-ID-CONVERSION
              tableIdConversion(programCtx.getTableIdConversionInCtx());/*2230-TABLE-ID-CONVERSION*/
//  PERFORM 2240-SPECIAL-PROCESSING
              specialProcessing(programCtx.getSpecialProcessingInCtx());/*2240-SPECIAL-PROCESSING*/
          }
      
      return methodOut;
      }
      /**
      * loadTable0Records 
      *   This method is derived from 
  *   COBOL Paragraph - 2210-LOAD-TABLE0-RECORDS COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip00002Table0Entries           COBOL Name: IP00002-TABLE-0-ENTRIES
      * - ip00002Table0EntriesMax        COBOL Name: IP00002-TABLE-0-ENTRIES-MAX
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - tableZeroOverflow300           COBOL Name: 300-TABLE-ZERO-OVERFLOW
      * - ip6063008600                   COBOL Name: 600-IP606-3008
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - tblIp9000t1SubId800            COBOL Name: 800-TBL-IP9000T1-SUB-ID
      * - tableIp9000t1300               COBOL Name: 300-TABLE-IP9000T1
      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      *
      * Output :  

      * - maxEntries6003008              COBOL Name: 600-3008-MAX-ENTRIES
      * - ip00002Table0EntriesMax        COBOL Name: IP00002-TABLE-0-ENTRIES-MAX
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - tableZeroOverflow300           COBOL Name: 300-TABLE-ZERO-OVERFLOW
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip6063008600                   COBOL Name: 600-IP606-3008
      * - condCode300                    COBOL Name: 300-COND-CODE
      * - ip00002Table0Entries           COBOL Name: IP00002-TABLE-0-ENTRIES
      * - ip00002Table0Idx               COBOL Name: IP00002-TABLE-0-IDX
      * - ip00002Table0Entry             COBOL Name: IP00002-TABLE-0-ENTRY
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - ip00002TableIdInfo             COBOL Name: IP00002-TABLE-ID-INFO
      * - ip00002TblSubId                COBOL Name: IP00002-TBL-SUB-ID
      * - tblIp9000t1SubId800            COBOL Name: 800-TBL-IP9000T1-SUB-ID
      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      *
      * @throws CFException
      */
      @Override
      public LoadTable0RecordsOutCtx loadTable0Records(LoadTable0RecordsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * Loading the internal for table zero.                           *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
LoadTable0RecordsOutCtx methodOut = methodIn.getLoadTable0RecordsOutCtx();
//  IF IP00002-TABLE-0-ENTRIES GREATER THAN IP00002-TABLE-0-ENTRIES-MAX
          if (	( methodOut.getIp00002Table0Entries() > methodOut.getIp00002Table0EntriesMax() )) { 
//  MOVE IP00002-TABLE-0-ENTRIES-MAX TO 600-3008-MAX-ENTRIES
              methodOut.setMaxEntries6003008(methodOut.getIp00002Table0EntriesMax());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2210300());
//  MOVE 300-TABLE-ZERO-OVERFLOW TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getTableZeroOverflow300());
              // MOVE 600-IP606-3008 TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIp6063008600().toCharArray());
              // MOVE 12 TO 300-COND-CODE
              methodOut.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
//  ELSE
          else { 
//  ADD 300-VALUE-ONE TO IP00002-TABLE-0-ENTRIES
              methodOut.setIp00002Table0Entries( (short) (methodOut.getIp00002Table0Entries()+(short) methodIn.getValueOne300()));
//  SET IP00002-TABLE-0-IDX TO IP00002-TABLE-0-ENTRIES
              methodOut.setIp00002Table0Idx(methodOut.getIp00002Table0Entries()); 
              
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP00002-TABLE-0-ENTRY ( IP00002-TABLE-0-IDX )
              methodOut.setIp00002Table0Entry(methodOut.getIp00002Table0Idx() - 1,methodOut.getIp5000ParameterMasterRec().getCharArray());
//  IF 800-TBL-IP9000T1-SUB-ID EQUAL SPACES AND IP00002-TABLE-ID-INFO ( IP00002-TABLE-0-IDX ) EQUAL 300-TABLE-IP9000T1
              if (        ( allSpaces(methodOut.getTblIp9000t1SubId800())   ) && 		compareChars(methodOut.getIp00002TableIdInfo(methodOut.getIp00002Table0Idx() - 1),methodIn.getTableIp9000t1300()) == 0 ) { 
//  MOVE IP00002-TBL-SUB-ID ( IP00002-TABLE-0-IDX ) TO 800-TBL-IP9000T1-SUB-ID
                  methodOut.setTblIp9000t1SubId800(methodOut.getIp00002TblSubId(methodOut.getIp00002Table0Idx() - 1));
              }
//  ADD 1 TO 400-RECORDS-COUNT
              methodOut.setRecordsCount400(methodOut.getRecordsCount400()+(long)1);
          }
      
      return methodOut;
      }
      /**
      * dateConversion 
      *   This method is derived from 
  *   COBOL Paragraph - 2220-DATE-CONVERSION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip0201EffectiveDate            COBOL Name: IP0201-EFFECTIVE-DATE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - ip0201EffectiveHour            COBOL Name: IP0201-EFFECTIVE-HOUR
      * - para2220300                    COBOL Name: 300-PARA-2220
      * - invalidDate300                 COBOL Name: 300-INVALID-DATE
      * - inavalidDateMsg600             COBOL Name: 600-INAVALID-DATE-MSG
      *
      * Output :  

      * - ip67002Yyddd                   COBOL Name: IP67002-YYDDD
      * - ip0201EffectiveDate            COBOL Name: IP0201-EFFECTIVE-DATE
      * - ip67002Cntl                    COBOL Name: IP67002-CNTL
      * - rc                             COBOL Name: RETURN-CODE
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - ip0201EffectiveHour            COBOL Name: IP0201-EFFECTIVE-HOUR
      * - invalidJulianDate600           COBOL Name: 600-INVALID-JULIAN-DATE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2220300                    COBOL Name: 300-PARA-2220
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - invalidDate300                 COBOL Name: 300-INVALID-DATE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - inavalidDateMsg600             COBOL Name: 600-INAVALID-DATE-MSG
      * - condCode300                    COBOL Name: 300-COND-CODE
      *
      * @throws CFException
      */
      @Override
      public DateConversionOutCtx dateConversion(DateConversionInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph converts the effective date from julian format  *
// * to gregorian format.                                           *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
DateConversionOutCtx methodOut = methodIn.getDateConversionOutCtx();
//  MOVE IP0201-EFFECTIVE-DATE TO IP67002-YYDDD
          methodOut.getIp67002Yyddd().setString(methodOut.getIp0201EffectiveDate());
//  SET 88-IP67002-CONVERT-FROM-JULIAN TO TRUE
          methodOut.setIp67002ConvertFromJulian88True(); 
          
//  CALL 800-PTR-IP670010
          // CALL 800-PTR-IP670010
          	programCtx.setRc( ip670010.process(programCtx.getGlobalCtx().getContext("IP670010")));
//  IF RETURN-CODE EQUAL ZERO
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE IP67002-DATE TO IP5000-EFFECTIVE-DATE (1 : 8)
              methodOut.setIp5000EffectiveDate(replace(methodOut.getIp5000EffectiveDate(),String.valueOf(methodOut.getIp67002DateString()).toCharArray(),0,8));
//  MOVE IP0201-EFFECTIVE-HOUR TO IP5000-EFFECTIVE-DATE (9 : 2)
              methodOut.getIp5000ParameterMasterRec().replace(methodIn.getIp0201ReducedFileFormat()/*parent*/,5/*fromOffset - (ip5000EffectiveDate) */,2/*fromLen*/,0+9 - 1/*toOffset - (ip0201EffectiveHour) */,2/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE IP0201-EFFECTIVE-DATE TO 600-INVALID-JULIAN-DATE
              methodOut.setInvalidJulianDate600(methodOut.getIp0201EffectiveDate());
//  MOVE 300-PARA-2220 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2220300());
//  MOVE 300-INVALID-DATE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getInvalidDate300());
              // MOVE 600-INAVALID-DATE-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getInavalidDateMsg600().toCharArray());
              // MOVE 12 TO 300-COND-CODE
              methodOut.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * tableIdConversion 
      *   This method is derived from 
  *   COBOL Paragraph - 2230-TABLE-ID-CONVERSION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - sys001RdwIn800                 COBOL Name: 800-SYS001-RDW-IN
      * - value11300                     COBOL Name: 300-VALUE-11
      * - ip0201TableData                COBOL Name: IP0201-TABLE-DATA
      * - ip0201ActionCode               COBOL Name: IP0201-ACTION-CODE
      * - expandedLength800              COBOL Name: 800-EXPANDED-LENGTH
      * - ip00002Table0Entry             COBOL Name: IP00002-TABLE-0-ENTRY
      * - ip00002TblSubId                COBOL Name: IP00002-TBL-SUB-ID
      * - ip0201TblSubId                 COBOL Name: IP0201-TBL-SUB-ID
      * - ip00002TableIdInfo             COBOL Name: IP00002-TABLE-ID-INFO
      * - tableIp0040t1300               COBOL Name: 300-TABLE-IP0040T1
      * - tableIp0041t1300               COBOL Name: 300-TABLE-IP0041T1
      * - tableIp9000t1300               COBOL Name: 300-TABLE-IP9000T1
      * - tableIp0090t1300               COBOL Name: 300-TABLE-IP0090T1
      * - ip00002TableKeyLngth           COBOL Name: IP00002-TABLE-KEY-LNGTH
      * - tableIp0091t1300               COBOL Name: 300-TABLE-IP0091T1
      *
      * Output :  

      * - dataLength800                  COBOL Name: 800-DATA-LENGTH
      * - ip5000TableData                COBOL Name: IP5000-TABLE-DATA
      * - ip0201TableData                COBOL Name: IP0201-TABLE-DATA
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - ip0201ActionCode               COBOL Name: IP0201-ACTION-CODE
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      * - ip00002Table0Idx               COBOL Name: IP00002-TABLE-0-IDX
      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - ip00002TableIdInfo             COBOL Name: IP00002-TABLE-ID-INFO
      * - table90KeyLngth800             COBOL Name: 800-TABLE-90-KEY-LNGTH
      * - ip00002TableKeyLngth           COBOL Name: IP00002-TABLE-KEY-LNGTH
      * - table91KeyLngth800             COBOL Name: 800-TABLE-91-KEY-LNGTH
      *
      * @throws CFException
      */
      @Override
      public TableIdConversionOutCtx tableIdConversion(TableIdConversionInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph populates the table data and table id for       *
// * tables other than table zero.                                  *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
TableIdConversionOutCtx methodOut = methodIn.getTableIdConversionOutCtx();
//  MOVE ZERO TO 800-DATA-LENGTH
          methodOut.setDataLength800(0);
//  SUBTRACT 300-VALUE-11 FROM 800-SYS001-RDW-IN GIVING 800-DATA-LENGTH
          methodOut.setDataLength800(Math.abs(methodIn.getSys001RdwIn800()-(int) methodIn.getValue11300()));
//  MOVE IP0201-TABLE-DATA (1 : 800-DATA-LENGTH ) TO IP5000-TABLE-DATA (1 : 800-DATA-LENGTH )
          methodOut.getIp5000ParameterMasterRec().replace(methodIn.getIp0201ReducedFileFormat()/*parent*/,11/*fromOffset - (ip5000TableData) */,(int) methodOut.getDataLength800()/*fromLen*/,19/*toOffset - (ip0201TableData) */,(int) methodOut.getDataLength800()/*toLen*/);
//  MOVE IP0201-ACTION-CODE TO IP5000-ACTION-CODE
          methodOut.setIp5000ActionCode(methodOut.getIp0201ActionCode());
//  ADD 800-EXPANDED-LENGTH TO 800-DATA-LENGTH GIVING 800-SYS200-RDW-OUT
          methodOut.setSys200RdwOut800(methodOut.getDataLength800()+methodIn.getExpandedLength800());
//  SET IP00002-TABLE-0-IDX TO 1
          methodOut.setIp00002Table0Idx(1); 
          
//  SEARCH IP00002-TABLE-0-ENTRY
          keepSearching = true;
          if(methodIn.getIp00002Table0Entries() == 0){ 
          keepSearching = false; 
          }
          while(keepSearching) {
          	if  (		compareChars(methodIn.getIp00002TblSubId(methodOut.getIp00002Table0Idx() - 1),methodIn.getIp0201TblSubId()) == 0 ) { 
//  MOVE IP00002-TABLE-ID-INFO ( IP00002-TABLE-0-IDX ) TO IP5000-TABLE-ID
              methodOut.getIp5000TableId().setString(methodOut.getIp00002TableIdInfo(methodOut.getIp00002Table0Idx() - 1));
          	break;
          	}
          	methodOut.setIp00002Table0Idx(methodOut.getIp00002Table0Idx() + 1);
          	if (methodOut.getIp00002Table0Idx() > methodIn.getIp00002Table0Entries()) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  PERFORM 2231-DISPLAY-MISSING-MSG
              displayMissingMsg(programCtx.getDisplayMissingMsgInCtx());/*2231-DISPLAY-MISSING-MSG*/
          	}
//  IF IP5000-TABLE-ID = 300-TABLE-IP0040T1 OR 300-TABLE-IP0041T1 OR 300-TABLE-IP9000T1
          if (		compareChars(methodOut.getIp5000TableId(),methodIn.getTableIp0040t1300()) == 0  || 		compareChars(methodOut.getIp5000TableId(),methodIn.getTableIp0041t1300()) == 0  || 		compareChars(methodOut.getIp5000TableId(),methodIn.getTableIp9000t1300()) == 0 ) { 
//  PERFORM 2232-CALCULATE-NEW-RDW
              calculateNewRdw(programCtx.getCalculateNewRdwInCtx());/*2232-CALCULATE-NEW-RDW*/
          }
//  IF IP5000-TABLE-ID = 300-TABLE-IP0090T1
          if (		compareChars(methodOut.getIp5000TableId(),methodIn.getTableIp0090t1300()) == 0 ) { 
//  MOVE IP00002-TABLE-KEY-LNGTH ( IP00002-TABLE-0-IDX ) TO 800-TABLE-90-KEY-LNGTH
              methodOut.setTable90KeyLngth800(methodOut.getIp00002TableKeyLngth(methodOut.getIp00002Table0Idx() - 1));
          }
//  IF IP5000-TABLE-ID = 300-TABLE-IP0091T1
          if (		compareChars(methodOut.getIp5000TableId(),methodIn.getTableIp0091t1300()) == 0 ) { 
//  MOVE IP00002-TABLE-KEY-LNGTH ( IP00002-TABLE-0-IDX ) TO 800-TABLE-91-KEY-LNGTH
              methodOut.setTable91KeyLngth800(methodOut.getIp00002TableKeyLngth(methodOut.getIp00002Table0Idx() - 1));
          }
      
      return methodOut;
      }
      /**
      * displayMissingMsg 
      *   This method is derived from 
  *   COBOL Paragraph - 2231-DISPLAY-MISSING-MSG COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip0201TblSubId                 COBOL Name: IP0201-TBL-SUB-ID
      * - para2231300                    COBOL Name: 300-PARA-2231
      * - tblSubIdNotFound300            COBOL Name: 300-TBL-SUB-ID-NOT-FOUND
      * - ip6063009600                   COBOL Name: 600-IP606-3009
      *
      * Output :  

      * - tabSubId6003009                COBOL Name: 600-3009-TAB-SUB-ID
      * - ip0201TblSubId                 COBOL Name: IP0201-TBL-SUB-ID
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2231300                    COBOL Name: 300-PARA-2231
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - tblSubIdNotFound300            COBOL Name: 300-TBL-SUB-ID-NOT-FOUND
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip6063009600                   COBOL Name: 600-IP606-3009
      * - condCode300                    COBOL Name: 300-COND-CODE
      *
      * @throws CFException
      */
      @Override
      public DisplayMissingMsgOutCtx displayMissingMsg(DisplayMissingMsgInCtx methodIn) throws Exception {
      
// * Corresponding table zero entry.                                *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
DisplayMissingMsgOutCtx methodOut = methodIn.getDisplayMissingMsgOutCtx();
//  MOVE IP0201-TBL-SUB-ID TO 600-3009-TAB-SUB-ID
          methodOut.setTabSubId6003009(methodOut.getIp0201TblSubId());
//  MOVE 300-PARA-2231 TO 900-ABEND-PARA
          methodOut.setAbendPara900(methodOut.getPara2231300());
//  MOVE 300-TBL-SUB-ID-NOT-FOUND TO 900-ABEND-CODE
          methodOut.setAbendCode900(methodOut.getTblSubIdNotFound300());
          // MOVE 600-IP606-3009 TO 900-ABEND-TEXT
          methodOut.setAbendText900(methodOut.getIp6063009600().toCharArray());
          // MOVE 12 TO 300-COND-CODE
          methodOut.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
          terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          ;
      
      return methodOut;
      }
      /**
      * calculateNewRdw 
      *   This method is derived from 
  *   COBOL Paragraph - 2232-CALCULATE-NEW-RDW COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - tableIp0040t1300               COBOL Name: 300-TABLE-IP0040T1
      * - tableIp9000t1300               COBOL Name: 300-TABLE-IP9000T1
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - table40Length800               COBOL Name: 800-TABLE-40-LENGTH
      *
      * Output :  

      * - ip0040ArMaster                 COBOL Name: IP0040-AR-MASTER
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      * - table40Length800               COBOL Name: 800-TABLE-40-LENGTH
      * - ip0041BinTable                 COBOL Name: IP0041-BIN-TABLE
      *
      * @throws CFException
      */
      @Override
      public CalculateNewRdwOutCtx calculateNewRdw(CalculateNewRdwInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calculates rdw length.                          *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
CalculateNewRdwOutCtx methodOut = methodIn.getCalculateNewRdwOutCtx();
//  IF ( IP5000-TABLE-ID = 300-TABLE-IP0040T1 OR IP5000-TABLE-ID = 300-TABLE-IP9000T1 )
          if ((		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp0040t1300()) == 0  || 		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp9000t1300()) == 0 )) { 
//  INITIALIZE IP0040-AR-MASTER
              methodOut.getIp0040ArMaster().initialize();
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP0040-AR-MASTER (1 : 800-SYS200-RDW-OUT )
              methodOut.getIp0040ArMaster().replace(methodOut.getIp5000ParameterMasterRec().getCharArray(),0,methodOut.getIp5000ParameterMasterRec().length(),0,(int) methodOut.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-TABLE-40-LENGTH TO 800-SYS200-RDW-OUT
              methodOut.setSys200RdwOut800((int) methodOut.getTable40Length800());
//  MOVE IP0040-AR-MASTER TO IP5000-PARAMETER-MASTER-REC (1 : 800-SYS200-RDW-OUT )
              methodOut.getIp5000ParameterMasterRec().replace(methodOut.getIp0040ArMaster().getCharArray(),0,methodOut.getIp0040ArMaster().length(),0,(int) methodOut.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
//  ELSE
          else { 
//  INITIALIZE IP0041-BIN-TABLE
              methodOut.getIp0041BinTable().initialize();
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP0041-BIN-TABLE (1 : 800-SYS200-RDW-OUT )
              methodOut.getIp0041BinTable().replace(methodOut.getIp5000ParameterMasterRec().getCharArray(),0,methodOut.getIp5000ParameterMasterRec().length(),0,(int) methodOut.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
      
      return methodOut;
      }
      /**
      * specialProcessing 
      *   This method is derived from 
  *   COBOL Paragraph - 2240-SPECIAL-PROCESSING COBOL Cyclomatic complexity - 6
      * Input  :  

      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      * - tableIp0036t1300               COBOL Name: 300-TABLE-IP0036T1
      * - tableIp0040t1300               COBOL Name: 300-TABLE-IP0040T1
      * - tableIp0041t1300               COBOL Name: 300-TABLE-IP0041T1
      * - tableIp0090t1300               COBOL Name: 300-TABLE-IP0090T1
      * - tableIp0091t1300               COBOL Name: 300-TABLE-IP0091T1
      *
      * Output :  

      * - recordsCount400                COBOL Name: 400-RECORDS-COUNT
      *
      * @throws CFException
      */
      @Override
      public SpecialProcessingOutCtx specialProcessing(SpecialProcessingInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph performs the conversion based on table-id.      *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
SpecialProcessingOutCtx methodOut = methodIn.getSpecialProcessingOutCtx();
//  ADD 1 TO 400-RECORDS-COUNT
          methodOut.setRecordsCount400(methodOut.getRecordsCount400()+(long)1);
//  EVALUATE IP5000-TABLE-ID
          if  (		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp0036t1300()) == 0 ) { 
//  PERFORM 2241-STORE-TABLE36
              storeTable36(programCtx.getStoreTable36InCtx());/*2241-STORE-TABLE36*/
          }
          else if  (		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp0040t1300()) == 0 ) { 
//  PERFORM 2242-BUILD-TABLE90-DFLTS
              buildTable90Dflts(programCtx.getBuildTable90DfltsInCtx());/*2242-BUILD-TABLE90-DFLTS*/
          }
          else if  (		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp0041t1300()) == 0 ) { 
//  PERFORM 2243-BUILD-TABLE91-DFLTS
              buildTable91Dflts(programCtx.getBuildTable91DfltsInCtx());/*2243-BUILD-TABLE91-DFLTS*/
          }
          else if  (		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp0090t1300()) == 0 ) { 
//  PERFORM 2244-BUILD-TABLE90
              buildTable90(programCtx.getBuildTable90InCtx());/*2244-BUILD-TABLE90*/
          }
          else if  (		compareChars(methodIn.getIp5000TableId(),methodIn.getTableIp0091t1300()) == 0 ) { 
//  PERFORM 2245-BUILD-TABLE91
              buildTable91(programCtx.getBuildTable91InCtx());/*2245-BUILD-TABLE91*/
          }
      
      return methodOut;
      }
      /**
      * storeTable36 
      *   This method is derived from 
  *   COBOL Paragraph - 2241-STORE-TABLE36 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - table36BslSub400               COBOL Name: 400-TABLE36-BSL-SUB
      *
      * Output :  

      * - ip00361DefaultBsAgrmts         COBOL Name: IP00361-DEFAULT-BS-AGRMTS
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - table36BslSub400               COBOL Name: 400-TABLE36-BSL-SUB
      * - ip00361TableData               COBOL Name: IP00361-TABLE-DATA
      * - table36Bsl600                  COBOL Name: 600-TABLE36-BSL
      * - writeTheRecord100              COBOL Name: 100-WRITE-THE-RECORD
      *
      * @throws CFException
      */
      @Override
      public StoreTable36OutCtx storeTable36(StoreTable36InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph sets the switch to build the defualt agreement  *
// * stores all the table 36 records in internal table. this table  *
// * will be used by table 40 and 41 records to build table 90 and  *
// * 91 records.                                                    *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
StoreTable36OutCtx methodOut = methodIn.getStoreTable36OutCtx();
          // MOVE IP5000-PARAMETER-MASTER-REC TO IP00361-DEFAULT-BS-AGRMTS
          methodOut.getIp00361DefaultBsAgrmts().setString(methodOut.getIp5000ParameterMasterRec().getCharArray());
//  SET 88-100-BUILD-DFLT-AGRMNT TO TRUE
          methodOut.setBuildDfltAgrmnt88100True(); 
          
//  ADD 1 TO 400-TABLE36-BSL-SUB
          methodOut.setTable36BslSub400(methodOut.getTable36BslSub400()+(long)1);
//  MOVE IP00361-TABLE-DATA TO 600-TABLE36-BSL ( 400-TABLE36-BSL-SUB )
          methodOut.setTable36Bsl600((int) methodOut.getTable36BslSub400() - 1,methodOut.getIp00361TableData());
//  SET 88-100-DO-NOT-WRITE TO TRUE
          methodOut.setDoNotWrite88100True(); 
          
      
      return methodOut;
      }
      /**
      * _10OpenTempFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 2241-10-OPEN-TEMP-FILES COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - para224110300                  COBOL Name: 300-PARA-2241-10
      * - openSys105File300              COBOL Name: 300-OPEN-SYS105-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - openSys106File300              COBOL Name: 300-OPEN-SYS106-FILE
      *
      * Output :  

      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para224110300                  COBOL Name: 300-PARA-2241-10
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openSys105File300              COBOL Name: 300-OPEN-SYS105-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - openSys106File300              COBOL Name: 300-OPEN-SYS106-FILE
      *
      * @throws CFException
      */
      @Override
      public _10OpenTempFilesOutCtx _10OpenTempFiles(_10OpenTempFilesInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the temp files for table90 and table91.   *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
_10OpenTempFilesOutCtx methodOut = methodIn.get_10OpenTempFilesOutCtx();
//  OPEN OUTPUT SYS105-TEMP-TABLE90 OUTPUT SYS106-TEMP-TABLE91
          sys105TempTable90.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys105TempTable90.getFileName(),sys105TempTable90.getSys105TempTable90CharSet(),sys105TempTable90.getSys105TempTable90CrlfFlag());
          methodOut.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
          sys106TempTable91.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys106TempTable91.getFileName(),sys106TempTable91.getSys106TempTable91CharSet(),sys106TempTable91.getSys106TempTable91CrlfFlag());
          methodOut.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(methodOut.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-2241-10 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara224110300());
//  MOVE 300-OPEN-SYS105-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(methodOut.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-2241-10 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara224110300());
//  MOVE 300-OPEN-SYS106-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * buildTable90Dflts 
      *   This method is derived from 
  *   COBOL Paragraph - 2242-BUILD-TABLE90-DFLTS COBOL Cyclomatic complexity - 8
      * Input  :  

      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - sub400                         COBOL Name: 400-SUB
      * - table36BslSub400               COBOL Name: 400-TABLE36-BSL-SUB
      * - toRegion600                    COBOL Name: 600-TO-REGION
      * - ip0040Region                   COBOL Name: IP0040-REGION
      * - accBrand600                    COBOL Name: 600-ACC-BRAND
      * - ip0040Ab                       COBOL Name: IP0040-AB
      * - bsl1BuildCounter40090          COBOL Name: 400-90BSL-1-BUILD-COUNTER
      * - region600                      COBOL Name: 600-REGION
      * - bsl2BuildCounter40090          COBOL Name: 400-90BSL-2-BUILD-COUNTER
      *
      * Output :  

      * - sub400                         COBOL Name: 400-SUB
      * - bsl1BuildCounter40090          COBOL Name: 400-90BSL-1-BUILD-COUNTER
      * - bsl2BuildCounter40090          COBOL Name: 400-90BSL-2-BUILD-COUNTER
      *
      * @throws CFException
      */
      @Override
      public BuildTable90DfltsOutCtx buildTable90Dflts(BuildTable90DfltsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph checks if its required to build the default     *
// * agreements, if yes builds the default agreement for table90.   *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
BuildTable90DfltsOutCtx methodOut = methodIn.getBuildTable90DfltsOutCtx();
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM VARYING 400-SUB FROM 1 BY 1 UNTIL 400-SUB > 400-TABLE36-BSL-SUB
              for (methodOut.setSub400(1); (	( methodOut.getSub400() <= methodIn.getTable36BslSub400() )) ; methodOut.setSub400((int) methodOut.getSub400() + 1) ) {
//  IF 600-TO-REGION ( 400-SUB ) = IP0040-REGION AND 600-ACC-BRAND ( 400-SUB ) = IP0040-AB
                  if (		compareChars(methodIn.getToRegion600((int) methodOut.getSub400() - 1),methodIn.getIp0040Region()) == 0  && 		compareChars(methodIn.getAccBrand600((int) methodOut.getSub400() - 1),methodIn.getIp0040Ab()) == 0 ) { 
//  ADD 1 TO 400-90BSL-1-BUILD-COUNTER
                      methodOut.setBsl1BuildCounter40090(methodOut.getBsl1BuildCounter40090()+(long)1);
//  PERFORM 2242-10-MOVE-TO-90-LAYOUT
                      _10MoveTo90Layout(programCtx.get_10MoveTo90LayoutInCtx());/*2242-10-MOVE-TO-90-LAYOUT*/
                  }
//  IF 600-REGION ( 400-SUB ) = IP0040-REGION AND 600-ACC-BRAND ( 400-SUB ) = IP0040-AB
                  if (		compareChars(methodIn.getRegion600((int) methodOut.getSub400() - 1),methodIn.getIp0040Region()) == 0  && 		compareChars(methodIn.getAccBrand600((int) methodOut.getSub400() - 1),methodIn.getIp0040Ab()) == 0 ) { 
//  ADD 1 TO 400-90BSL-2-BUILD-COUNTER
                      methodOut.setBsl2BuildCounter40090(methodOut.getBsl2BuildCounter40090()+(long)1);
//  PERFORM 2242-10-MOVE-TO-90-LAYOUT
                      _10MoveTo90Layout(programCtx.get_10MoveTo90LayoutInCtx());/*2242-10-MOVE-TO-90-LAYOUT*/
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * _10MoveTo90Layout 
      *   This method is derived from 
  *   COBOL Paragraph - 2242-10-MOVE-TO-90-LAYOUT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - defaultsBuild400               COBOL Name: 400-DEFAULTS-BUILD
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - tableIp0090t1300               COBOL Name: 300-TABLE-IP0090T1
      * - ip0040AccRangeL                COBOL Name: IP0040-ACC-RANGE-L
      * - ip0040Ab                       COBOL Name: IP0040-AB
      * - ip0040AccRangeH                COBOL Name: IP0040-ACC-RANGE-H
      * - ip0040PriorityCode             COBOL Name: IP0040-PRIORITY-CODE
      * - busSrvLvl600                   COBOL Name: 600-BUS-SRV-LVL
      * - busSrvId600                    COBOL Name: 600-BUS-SRV-ID
      * - bsPriority600                  COBOL Name: 600-BS-PRIORITY
      * - bsLifecylInd600                COBOL Name: 600-BS-LIFECYL-IND
      * - bsBsseCd600                    COBOL Name: 600-BS-BSSE-CD
      *
      * Output :  

      * - ip00901BsArMaster              COBOL Name: IP00901-BS-AR-MASTER
      * - defaultsBuild400               COBOL Name: 400-DEFAULTS-BUILD
      * - ip00901EffectiveDate           COBOL Name: IP00901-EFFECTIVE-DATE
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - ip00901ActiveInactive          COBOL Name: IP00901-ACTIVE-INACTIVE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - ip00901TableId                 COBOL Name: IP00901-TABLE-ID
      * - tableIp0090t1300               COBOL Name: 300-TABLE-IP0090T1
      * - ip00901BsAccRngL               COBOL Name: IP00901-BS-ACC-RNG-L
      * - ip0040AccRangeL                COBOL Name: IP0040-ACC-RANGE-L
      * - ip00901BsArAccBrand            COBOL Name: IP00901-BS-AR-ACC-BRAND
      * - ip0040Ab                       COBOL Name: IP0040-AB
      * - ip00901BsAccRngH               COBOL Name: IP00901-BS-ACC-RNG-H
      * - ip0040AccRangeH                COBOL Name: IP0040-ACC-RANGE-H
      * - ip00901BsArAbPriority          COBOL Name: IP00901-BS-AR-AB-PRIORITY
      * - ip0040PriorityCode             COBOL Name: IP0040-PRIORITY-CODE
      * - ip00901BsArBusSrvLvl           COBOL Name: IP00901-BS-AR-BUS-SRV-LVL
      * - busSrvLvl600                   COBOL Name: 600-BUS-SRV-LVL
      * - ip00901BsArBusSrvId            COBOL Name: IP00901-BS-AR-BUS-SRV-ID
      * - busSrvId600                    COBOL Name: 600-BUS-SRV-ID
      * - ip00901BsArBsPriority          COBOL Name: IP00901-BS-AR-BS-PRIORITY
      * - bsPriority600                  COBOL Name: 600-BS-PRIORITY
      * - ip00901BsArLifecylInd          COBOL Name: IP00901-BS-AR-LIFECYL-IND
      * - bsLifecylInd600                COBOL Name: 600-BS-LIFECYL-IND
      * - ip00901BsArBsseCd              COBOL Name: IP00901-BS-AR-BSSE-CD
      * - bsBsseCd600                    COBOL Name: 600-BS-BSSE-CD
      * - tempTbl90Rdw800                COBOL Name: 800-TEMP-TBL90-RDW
      *
      * @throws CFException
      */
      @Override
      public _10MoveTo90LayoutOutCtx _10MoveTo90Layout(_10MoveTo90LayoutInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph moves variables to table 90 layout and write the
// * record to temp file.
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
_10MoveTo90LayoutOutCtx methodOut = methodIn.get_10MoveTo90LayoutOutCtx();
//  INITIALIZE IP00901-BS-AR-MASTER
          methodOut.getIp00901BsArMaster().initialize();
//  ADD 1 TO 400-DEFAULTS-BUILD
          methodOut.setDefaultsBuild400(methodOut.getDefaultsBuild400()+(long)1);
//  MOVE IP5000-EFFECTIVE-DATE TO IP00901-EFFECTIVE-DATE
          methodOut.setIp00901EffectiveDate(methodOut.getIp5000EffectiveDate());
//  MOVE IP5000-ACTION-CODE TO IP00901-ACTIVE-INACTIVE
          methodOut.setIp00901ActiveInactive(methodOut.getIp5000ActionCode());
//  MOVE 300-TABLE-IP0090T1 TO IP00901-TABLE-ID
          methodOut.getIp00901TableId().setString(methodOut.getTableIp0090t1300());
//  MOVE IP0040-ACC-RANGE-L TO IP00901-BS-ACC-RNG-L
          methodOut.setIp00901BsAccRngL(methodOut.getIp0040AccRangeL());
//  MOVE IP0040-AB TO IP00901-BS-AR-ACC-BRAND
          methodOut.setIp00901BsArAccBrand(methodOut.getIp0040Ab());
//  MOVE IP0040-ACC-RANGE-H TO IP00901-BS-ACC-RNG-H
          methodOut.setIp00901BsAccRngH(methodOut.getIp0040AccRangeH());
//  MOVE IP0040-PRIORITY-CODE TO IP00901-BS-AR-AB-PRIORITY
          methodOut.setIp00901BsArAbPriority(methodOut.getIp0040PriorityCode());
//  MOVE 600-BUS-SRV-LVL ( 400-SUB ) TO IP00901-BS-AR-BUS-SRV-LVL
          methodOut.setIp00901BsArBusSrvLvl(methodOut.getBusSrvLvl600((int) methodIn.getSub400() - 1));
//  MOVE 600-BUS-SRV-ID ( 400-SUB ) TO IP00901-BS-AR-BUS-SRV-ID
          methodOut.setIp00901BsArBusSrvId(methodOut.getBusSrvId600((int) methodIn.getSub400() - 1));
//  MOVE 600-BS-PRIORITY ( 400-SUB ) TO IP00901-BS-AR-BS-PRIORITY
          methodOut.setIp00901BsArBsPriority(methodOut.getBsPriority600((int) methodIn.getSub400() - 1));
//  MOVE 600-BS-LIFECYL-IND ( 400-SUB ) TO IP00901-BS-AR-LIFECYL-IND
          methodOut.setIp00901BsArLifecylInd(methodOut.getBsLifecylInd600((int) methodIn.getSub400() - 1));
//  MOVE 600-BS-BSSE-CD ( 400-SUB ) TO IP00901-BS-AR-BSSE-CD
          methodOut.setIp00901BsArBsseCd(methodOut.getBsBsseCd600((int) methodIn.getSub400() - 1));
//  MOVE LENGTH OF IP00901-BS-AR-MASTER TO 800-TEMP-TBL90-RDW
          methodOut.setTempTbl90Rdw800(Ip00901BsArMaster.getIp00901BsArMasterFieldLength());
//  PERFORM 8100-WRITE-90-DFLT-TO-TEMP
          write90DfltToTemp(programCtx.getWrite90DfltToTempInCtx());/*8100-WRITE-90-DFLT-TO-TEMP*/
          ;
      
      return methodOut;
      }
      /**
      * buildTable91Dflts 
      *   This method is derived from 
  *   COBOL Paragraph - 2243-BUILD-TABLE91-DFLTS COBOL Cyclomatic complexity - 11
      * Input  :  

      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - sub400                         COBOL Name: 400-SUB
      * - table36BslSub400               COBOL Name: 400-TABLE36-BSL-SUB
      * - sub1400                        COBOL Name: 400-SUB1
      * - regionMax400                   COBOL Name: 400-REGION-MAX
      * - ip0041Region                   COBOL Name: IP0041-REGION
      * - fromRegion600                  COBOL Name: 600-FROM-REGION
      * - accBrand600                    COBOL Name: 600-ACC-BRAND
      * - ip0041Ab                       COBOL Name: IP0041-AB
      * - bsl1BuildCounter40091          COBOL Name: 400-91BSL-1-BUILD-COUNTER
      * - region600                      COBOL Name: 600-REGION
      * - bsl2BuildCounter40091          COBOL Name: 400-91BSL-2-BUILD-COUNTER
      *
      * Output :  

      * - sub400                         COBOL Name: 400-SUB
      * - sub1400                        COBOL Name: 400-SUB1
      * - bsl1BuildCounter40091          COBOL Name: 400-91BSL-1-BUILD-COUNTER
      * - bsl2BuildCounter40091          COBOL Name: 400-91BSL-2-BUILD-COUNTER
      *
      * @throws CFException
      */
      @Override
      public BuildTable91DfltsOutCtx buildTable91Dflts(BuildTable91DfltsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph checks if its required to build the default     *
// * agreements, if yes builds the default agreement for table91.   *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
BuildTable91DfltsOutCtx methodOut = methodIn.getBuildTable91DfltsOutCtx();
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM VARYING 400-SUB FROM 1 BY 1 UNTIL 400-SUB > 400-TABLE36-BSL-SUB
              for (methodOut.setSub400(1); (	( methodOut.getSub400() <= methodIn.getTable36BslSub400() )) ; methodOut.setSub400((int) methodOut.getSub400() + 1) ) {
//  PERFORM VARYING 400-SUB1 FROM 1 BY 1 UNTIL 400-SUB1 > 400-REGION-MAX OR IP0041-REGION ( 400-SUB1 ) = SPACES
                  for (methodOut.setSub1400(1); (	( methodOut.getSub1400() <= methodIn.getRegionMax400() )  &&         ( !allSpaces(methodIn.getIp0041Region((int) methodOut.getSub1400() - 1))  )) ; methodOut.setSub1400((int) methodOut.getSub1400() + 1) ) {
//  IF 600-FROM-REGION ( 400-SUB ) = IP0041-REGION ( 400-SUB1 ) AND 600-ACC-BRAND ( 400-SUB ) = IP0041-AB
                      if (		compareChars(methodIn.getFromRegion600((int) methodOut.getSub400() - 1),methodIn.getIp0041Region((int) methodOut.getSub1400() - 1)) == 0  && 		compareChars(methodIn.getAccBrand600((int) methodOut.getSub400() - 1),methodIn.getIp0041Ab()) == 0 ) { 
//  ADD 1 TO 400-91BSL-1-BUILD-COUNTER
                          methodOut.setBsl1BuildCounter40091(methodOut.getBsl1BuildCounter40091()+(long)1);
//  PERFORM 2243-10-MOVE-TO-91-LAYOUT
                          _10MoveTo91Layout(programCtx.get_10MoveTo91LayoutInCtx());/*2243-10-MOVE-TO-91-LAYOUT*/
                      }
//  IF 600-REGION ( 400-SUB ) = IP0041-REGION ( 400-SUB1 ) AND 600-ACC-BRAND ( 400-SUB ) = IP0041-AB
                      if (		compareChars(methodIn.getRegion600((int) methodOut.getSub400() - 1),methodIn.getIp0041Region((int) methodOut.getSub1400() - 1)) == 0  && 		compareChars(methodIn.getAccBrand600((int) methodOut.getSub400() - 1),methodIn.getIp0041Ab()) == 0 ) { 
//  ADD 1 TO 400-91BSL-2-BUILD-COUNTER
                          methodOut.setBsl2BuildCounter40091(methodOut.getBsl2BuildCounter40091()+(long)1);
//  PERFORM 2243-10-MOVE-TO-91-LAYOUT
                          _10MoveTo91Layout(programCtx.get_10MoveTo91LayoutInCtx());/*2243-10-MOVE-TO-91-LAYOUT*/
                      }
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * _10MoveTo91Layout 
      *   This method is derived from 
  *   COBOL Paragraph - 2243-10-MOVE-TO-91-LAYOUT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - defaultsBuild400               COBOL Name: 400-DEFAULTS-BUILD
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - tableIp0091t1300               COBOL Name: 300-TABLE-IP0091T1
      * - ip0041Bin                      COBOL Name: IP0041-BIN
      * - ip0041Ab                       COBOL Name: IP0041-AB
      * - busSrvLvl600                   COBOL Name: 600-BUS-SRV-LVL
      * - busSrvId600                    COBOL Name: 600-BUS-SRV-ID
      * - bsPriority600                  COBOL Name: 600-BS-PRIORITY
      * - bsLifecylInd600                COBOL Name: 600-BS-LIFECYL-IND
      *
      * Output :  

      * - ip00911BsBinMaster             COBOL Name: IP00911-BS-BIN-MASTER
      * - defaultsBuild400               COBOL Name: 400-DEFAULTS-BUILD
      * - ip00911EffectiveDate           COBOL Name: IP00911-EFFECTIVE-DATE
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - ip00911ActiveInactive          COBOL Name: IP00911-ACTIVE-INACTIVE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - ip00911TableId                 COBOL Name: IP00911-TABLE-ID
      * - tableIp0091t1300               COBOL Name: 300-TABLE-IP0091T1
      * - ip00911BsBin                   COBOL Name: IP00911-BS-BIN
      * - ip0041Bin                      COBOL Name: IP0041-BIN
      * - ip00911BsBinAccBrand           COBOL Name: IP00911-BS-BIN-ACC-BRAND
      * - ip0041Ab                       COBOL Name: IP0041-AB
      * - ip00911BsBinBusSrvLvl          COBOL Name: IP00911-BS-BIN-BUS-SRV-LVL
      * - busSrvLvl600                   COBOL Name: 600-BUS-SRV-LVL
      * - ip00911BsBinBusSrvId           COBOL Name: IP00911-BS-BIN-BUS-SRV-ID
      * - busSrvId600                    COBOL Name: 600-BUS-SRV-ID
      * - ip00911BsBinBsPriority         COBOL Name: IP00911-BS-BIN-BS-PRIORITY
      * - bsPriority600                  COBOL Name: 600-BS-PRIORITY
      * - ip00911BsBinLifecylInd         COBOL Name: IP00911-BS-BIN-LIFECYL-IND
      * - bsLifecylInd600                COBOL Name: 600-BS-LIFECYL-IND
      * - tempTbl91Rdw800                COBOL Name: 800-TEMP-TBL91-RDW
      *
      * @throws CFException
      */
      @Override
      public _10MoveTo91LayoutOutCtx _10MoveTo91Layout(_10MoveTo91LayoutInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph moves variables to table 91 layout and write the
// * record to temp file.
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
_10MoveTo91LayoutOutCtx methodOut = methodIn.get_10MoveTo91LayoutOutCtx();
//  INITIALIZE IP00911-BS-BIN-MASTER
          methodOut.getIp00911BsBinMaster().initialize();
//  ADD 1 TO 400-DEFAULTS-BUILD
          methodOut.setDefaultsBuild400(methodOut.getDefaultsBuild400()+(long)1);
//  MOVE IP5000-EFFECTIVE-DATE TO IP00911-EFFECTIVE-DATE
          methodOut.setIp00911EffectiveDate(methodOut.getIp5000EffectiveDate());
//  MOVE IP5000-ACTION-CODE TO IP00911-ACTIVE-INACTIVE
          methodOut.setIp00911ActiveInactive(methodOut.getIp5000ActionCode());
//  MOVE 300-TABLE-IP0091T1 TO IP00911-TABLE-ID
          methodOut.getIp00911TableId().setString(methodOut.getTableIp0091t1300());
          // MOVE IP0041-BIN TO IP00911-BS-BIN
          methodOut.setIp00911BsBin(methodOut.getIp0041Bin());
//  MOVE IP0041-AB TO IP00911-BS-BIN-ACC-BRAND
          methodOut.setIp00911BsBinAccBrand(methodOut.getIp0041Ab());
//  MOVE 600-BUS-SRV-LVL ( 400-SUB ) TO IP00911-BS-BIN-BUS-SRV-LVL
          methodOut.setIp00911BsBinBusSrvLvl(methodOut.getBusSrvLvl600((int) methodIn.getSub400() - 1));
//  MOVE 600-BUS-SRV-ID ( 400-SUB ) TO IP00911-BS-BIN-BUS-SRV-ID
          methodOut.setIp00911BsBinBusSrvId(methodOut.getBusSrvId600((int) methodIn.getSub400() - 1));
//  MOVE 600-BS-PRIORITY ( 400-SUB ) TO IP00911-BS-BIN-BS-PRIORITY
          methodOut.setIp00911BsBinBsPriority(methodOut.getBsPriority600((int) methodIn.getSub400() - 1));
//  MOVE 600-BS-LIFECYL-IND ( 400-SUB ) TO IP00911-BS-BIN-LIFECYL-IND
          methodOut.setIp00911BsBinLifecylInd(methodOut.getBsLifecylInd600((int) methodIn.getSub400() - 1));
//  MOVE LENGTH OF IP00911-BS-BIN-MASTER TO 800-TEMP-TBL91-RDW
          methodOut.setTempTbl91Rdw800(Ip00911BsBinMaster.getIp00911BsBinMasterFieldLength());
//  PERFORM 8250-WRITE-91-DFLT-TO-TEMP
          write91DfltToTemp(programCtx.getWrite91DfltToTempInCtx());/*8250-WRITE-91-DFLT-TO-TEMP*/
          ;
      
      return methodOut;
      }
      /**
      * buildTable90 
      *   This method is derived from 
  *   COBOL Paragraph - 2244-BUILD-TABLE90 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      *
      * Output :  

      * - writeTheRecord100              COBOL Name: 100-WRITE-THE-RECORD
      * - ip00901BsArMaster              COBOL Name: IP00901-BS-AR-MASTER
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - tempTbl90Rdw800                COBOL Name: 800-TEMP-TBL90-RDW
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      *
      * @throws CFException
      */
      @Override
      public BuildTable90OutCtx buildTable90(BuildTable90InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para writes the original record to temp file if build dflt
// * agreement switch is set.
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
BuildTable90OutCtx methodOut = methodIn.getBuildTable90OutCtx();
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  SET 88-100-DO-NOT-WRITE TO TRUE
              methodOut.setDoNotWrite88100True(); 
              
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP00901-BS-AR-MASTER (1 : 800-SYS200-RDW-OUT )
              methodOut.getIp00901BsArMaster().replace(methodOut.getIp5000ParameterMasterRec().getCharArray(),0,methodOut.getIp5000ParameterMasterRec().length(),0,(int) methodOut.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-SYS200-RDW-OUT TO 800-TEMP-TBL90-RDW
              methodOut.setTempTbl90Rdw800(methodOut.getSys200RdwOut800());
//  PERFORM 8100-WRITE-90-DFLT-TO-TEMP
              write90DfltToTemp(programCtx.getWrite90DfltToTempInCtx());/*8100-WRITE-90-DFLT-TO-TEMP*/
          }
//  ELSE
      
      return methodOut;
      }
      /**
      * buildTable91 
      *   This method is derived from 
  *   COBOL Paragraph - 2245-BUILD-TABLE91 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      *
      * Output :  

      * - writeTheRecord100              COBOL Name: 100-WRITE-THE-RECORD
      * - ip00911BsBinMaster             COBOL Name: IP00911-BS-BIN-MASTER
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - tempTbl91Rdw800                COBOL Name: 800-TEMP-TBL91-RDW
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      *
      * @throws CFException
      */
      @Override
      public BuildTable91OutCtx buildTable91(BuildTable91InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para writes the original record to temp file if build dflt
// * agreement switch is set.
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
BuildTable91OutCtx methodOut = methodIn.getBuildTable91OutCtx();
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  SET 88-100-DO-NOT-WRITE TO TRUE
              methodOut.setDoNotWrite88100True(); 
              
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP00911-BS-BIN-MASTER (1 : 800-SYS200-RDW-OUT )
              methodOut.getIp00911BsBinMaster().replace(methodOut.getIp5000ParameterMasterRec().getCharArray(),0,methodOut.getIp5000ParameterMasterRec().length(),0,(int) methodOut.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-SYS200-RDW-OUT TO 800-TEMP-TBL91-RDW
              methodOut.setTempTbl91Rdw800(methodOut.getSys200RdwOut800());
//  PERFORM 8250-WRITE-91-DFLT-TO-TEMP
              write91DfltToTemp(programCtx.getWrite91DfltToTempInCtx());/*8250-WRITE-91-DFLT-TO-TEMP*/
          }
//  ELSE
      
      return methodOut;
      }
      /**
      * endOfJob 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-END-OF-JOB COBOL Cyclomatic complexity - 2
      * Input  :  

      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - sys200File300                  COBOL Name: 300-SYS200-FILE
      * - para3000300                    COBOL Name: 300-PARA-3000
      * - closeSys200File300             COBOL Name: 300-CLOSE-SYS200-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys200File300                  COBOL Name: 300-SYS200-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3000300                    COBOL Name: 300-PARA-3000
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeSys200File300             COBOL Name: 300-CLOSE-SYS200-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public EndOfJobOutCtx endOfJob(EndOfJobInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph close the input and output file.                *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
EndOfJobOutCtx methodOut = methodIn.getEndOfJobOutCtx();
//  PERFORM 8300-CLOSE-SYS001
          closeSys001(programCtx.getCloseSys001InCtx());/*8300-CLOSE-SYS001*/
//  CLOSE SYS200-EXPANDED-PARM-MASTER
          sys200ExpandedParmMaster.close(); 
          methodOut.setOutputFileStatus200(sys200ExpandedParmMaster.getStatusString() );
//  IF 88-200-SYS200-STATUS-GOOD
//  ELSE
          if (!(methodIn.isSys200StatusGood88200()) ) { 
//  MOVE 300-SYS200-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys200File300());
//  MOVE 200-OUTPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getOutputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-3000 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3000300());
//  MOVE 300-CLOSE-SYS200-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseSys200File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * printCounts 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-PRINT-COUNTS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isDfltAgrmntTobeBuild100       COBOL Name: 100-IS-DFLT-AGRMNT-TOBE-BUILD
      * - table36BslSub400               COBOL Name: 400-TABLE36-BSL-SUB
      * - bsl1BuildCounter40090          COBOL Name: 400-90BSL-1-BUILD-COUNTER
      * - bsl2BuildCounter40090          COBOL Name: 400-90BSL-2-BUILD-COUNTER
      * - bsl1BuildCounter40091          COBOL Name: 400-91BSL-1-BUILD-COUNTER
      * - bsl2BuildCounter40091          COBOL Name: 400-91BSL-2-BUILD-COUNTER
      * - defaultsBuild400               COBOL Name: 400-DEFAULTS-BUILD
      * - space600                       COBOL Name: 600-SPACE
      * - statsMessage600                COBOL Name: 600-STATS-MESSAGE
      * - table36LoadMessage600          COBOL Name: 600-TABLE36-LOAD-MESSAGE
      * - tbl90DfltBsl1Msg600            COBOL Name: 600-TBL90-DFLT-BSL1-MSG
      * - tbl90DfltBsl2Msg600            COBOL Name: 600-TBL90-DFLT-BSL2-MSG
      * - tbl91DfltBsl1Msg600            COBOL Name: 600-TBL91-DFLT-BSL1-MSG
      * - tbl91DfltBsl2Msg600            COBOL Name: 600-TBL91-DFLT-BSL2-MSG
      * - totalDefaultsMsg600            COBOL Name: 600-TOTAL-DEFAULTS-MSG
      * - tbl90OriginalTrlrMsg600        COBOL Name: 600-TBL90-ORIGINAL-TRLR-MSG
      * - tbl90UpdatedTrlrMsg600         COBOL Name: 600-TBL90-UPDATED-TRLR-MSG
      * - tbl91OriginalTrlrMsg600        COBOL Name: 600-TBL91-ORIGINAL-TRLR-MSG
      * - tbl91UpdatedTrlrMsg600         COBOL Name: 600-TBL91-UPDATED-TRLR-MSG
      * - finalOriginalTrlrMsg600        COBOL Name: 600-FINAL-ORIGINAL-TRLR-MSG
      * - finalUpdatedTrlrMsg600         COBOL Name: 600-FINAL-UPDATED-TRLR-MSG
      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - recsWritten400                 COBOL Name: 400-RECS-WRITTEN
      * - sys001Read300                  COBOL Name: 300-SYS001-READ
      * - sys200Written300               COBOL Name: 300-SYS200-WRITTEN
      * - endOfStepMsg300                COBOL Name: 300-END-OF-STEP-MSG
      *
      * Output :  

      * - table36BslSub600               COBOL Name: 600-TABLE36-BSL-SUB
      * - table36BslSub400               COBOL Name: 400-TABLE36-BSL-SUB
      * - bsl1BuildCount60090            COBOL Name: 600-90BSL-1-BUILD-COUNT
      * - bsl1BuildCounter40090          COBOL Name: 400-90BSL-1-BUILD-COUNTER
      * - bsl2BuildCount60090            COBOL Name: 600-90BSL-2-BUILD-COUNT
      * - bsl2BuildCounter40090          COBOL Name: 400-90BSL-2-BUILD-COUNTER
      * - bsl1BuildCount60091            COBOL Name: 600-91BSL-1-BUILD-COUNT
      * - bsl1BuildCounter40091          COBOL Name: 400-91BSL-1-BUILD-COUNTER
      * - bsl2BuildCount60091            COBOL Name: 600-91BSL-2-BUILD-COUNT
      * - bsl2BuildCounter40091          COBOL Name: 400-91BSL-2-BUILD-COUNTER
      * - defaultsBuild600               COBOL Name: 600-DEFAULTS-BUILD
      * - defaultsBuild400               COBOL Name: 400-DEFAULTS-BUILD
      * - sys001Rec300                   COBOL Name: 300-SYS001-REC
      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - sys200Rec300                   COBOL Name: 300-SYS200-REC
      * - recsWritten400                 COBOL Name: 400-RECS-WRITTEN
      *
      * @throws CFException
      */
      @Override
      public PrintCountsOutCtx printCounts(PrintCountsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * Displays the counts                                            *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
PrintCountsOutCtx methodOut = methodIn.getPrintCountsOutCtx();
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( methodIn.isBuildDfltAgrmnt88100()  ) { 
//  MOVE 400-TABLE36-BSL-SUB TO 600-TABLE36-BSL-SUB
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setTable36BslSub600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getTable36BslSub400()).toCharArray()));
//  MOVE 400-90BSL-1-BUILD-COUNTER TO 600-90BSL-1-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setBsl1BuildCount60090(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getBsl1BuildCounter40090()).toCharArray()));
//  MOVE 400-90BSL-2-BUILD-COUNTER TO 600-90BSL-2-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setBsl2BuildCount60090(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getBsl2BuildCounter40090()).toCharArray()));
//  MOVE 400-91BSL-1-BUILD-COUNTER TO 600-91BSL-1-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setBsl1BuildCount60091(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getBsl1BuildCounter40091()).toCharArray()));
//  MOVE 400-91BSL-2-BUILD-COUNTER TO 600-91BSL-2-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setBsl2BuildCount60091(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getBsl2BuildCounter40091()).toCharArray()));
//  MOVE 400-DEFAULTS-BUILD TO 600-DEFAULTS-BUILD
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setDefaultsBuild600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getDefaultsBuild400()).toCharArray()));
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  DISPLAY 600-STATS-MESSAGE
              logger.info(new String(methodIn.getStatsMessage600())); 
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  DISPLAY 600-TABLE36-LOAD-MESSAGE
              logger.info(methodIn.getTable36LoadMessage600().toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  DISPLAY 600-TBL90-DFLT-BSL1-MSG
              logger.info(methodIn.getTbl90DfltBsl1Msg600().toString()); 
//  DISPLAY 600-TBL90-DFLT-BSL2-MSG
              logger.info(methodIn.getTbl90DfltBsl2Msg600().toString()); 
//  DISPLAY 600-TBL91-DFLT-BSL1-MSG
              logger.info(methodIn.getTbl91DfltBsl1Msg600().toString()); 
//  DISPLAY 600-TBL91-DFLT-BSL2-MSG
              logger.info(methodIn.getTbl91DfltBsl2Msg600().toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  DISPLAY 600-TOTAL-DEFAULTS-MSG
              logger.info(methodIn.getTotalDefaultsMsg600().toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  DISPLAY 600-TBL90-ORIGINAL-TRLR-MSG
              logger.info(methodIn.getTbl90OriginalTrlrMsg600().toString()); 
//  DISPLAY 600-TBL90-UPDATED-TRLR-MSG
              logger.info(methodIn.getTbl90UpdatedTrlrMsg600().toString()); 
//  DISPLAY 600-TBL91-ORIGINAL-TRLR-MSG
              logger.info(methodIn.getTbl91OriginalTrlrMsg600().toString()); 
//  DISPLAY 600-TBL91-UPDATED-TRLR-MSG
              logger.info(methodIn.getTbl91UpdatedTrlrMsg600().toString()); 
//  DISPLAY 600-FINAL-ORIGINAL-TRLR-MSG
              logger.info(methodIn.getFinalOriginalTrlrMsg600().toString()); 
//  DISPLAY 600-FINAL-UPDATED-TRLR-MSG
              logger.info(methodIn.getFinalUpdatedTrlrMsg600().toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(methodIn.getSpace600())); 
//  MOVE 400-RECS-READ TO 300-SYS001-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setSys001Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getRecsRead400()).toCharArray()));
//  MOVE 400-RECS-WRITTEN TO 300-SYS200-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setSys200Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getRecsWritten400()).toCharArray()));
//  DISPLAY 300-SYS001-READ
              logger.info(methodIn.getSys001Read300().toString()); 
//  DISPLAY 300-SYS200-WRITTEN
              logger.info(methodIn.getSys200Written300().toString()); 
//  DISPLAY 300-END-OF-STEP-MSG
              logger.info(methodIn.getEndOfStepMsg300().toString()); 
          }
//  ELSE
          else { 
//  MOVE 400-RECS-READ TO 300-SYS001-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setSys001Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getRecsRead400()).toCharArray()));
//  MOVE 400-RECS-WRITTEN TO 300-SYS200-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setSys200Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getRecsWritten400()).toCharArray()));
//  DISPLAY 300-SYS001-READ
              logger.info(methodIn.getSys001Read300().toString()); 
//  DISPLAY 300-SYS200-WRITTEN
              logger.info(methodIn.getSys200Written300().toString()); 
//  DISPLAY 300-END-OF-STEP-MSG
              logger.info(methodIn.getEndOfStepMsg300().toString()); 
          }
      
      return methodOut;
      }
      /**
      * sortTheTempFile 
      *   This method is derived from 
  *   COBOL Paragraph - 7000-SORT-THE-TEMP-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void sortTheTempFile(SortTheTempFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para sorts the temp file and write the sorted records to
// * output file.
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
//  SORT SORT-FILE ON ASCENDING KEY SORT1-TABLE-ID ASCENDING KEY SORT1-KEY DESCENDING KEY SORT1-TABLE-EFF-DATE INPUT PROCEDURE IS 7100-FORMAT-SORT-REC OUTPUT PROCEDURE IS 7400-FORMAT-OP-REC
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
                formatSortRec(programCtx.getFormatSortRecInCtx());
              if(sortFileInternIn.hasOpened()) {
                 sortFileInternIn.close();
              }
              if(useSortFileStrategy()) {
              	// implement code here
                   sortDecider.setInFileDetails(sortFileInternIn.getAccessFileName(sortFileInternIn.getFileName()),sortFileInternIn.getRecLen(),sortFileInternIn.isFixedBlock());
                   sortDecider.setOutFileName(sortFileInternOut.getAccessFileName(sortFileInternOut.getFileName()),sortFileInternOut.getRecLen());
          		 SortProperties sortProperties = new SortProperties();
          		 // SORT key information
                   sortDecider.addSortKeysInfo("SORT1TABLEID"/*name*/,SORT1TABLEID_OFFSET + 4/*pos*/,SORT1TABLEID_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT1KEY"/*name*/,SORT1KEY_OFFSET + 4/*pos*/,SORT1KEY_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT1TABLEEFFDATE"/*name*/,SORT1TABLEEFFDATE_OFFSET + 4/*pos*/,SORT1TABLEEFFDATE_LENGTH/*len*/,true/*descending*/,"CH"/*type*/,sortProperties);
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
              sortComp = Sort1TableIdKeys.getSort1TableIdComparator(true/*isAscending*/)
                .thenComparing(Sort1TableIdKeys.getSort1KeyComparator(true/*isAscending*/))
                .thenComparing(Sort1TableIdKeys.getSort1TableEffDateComparator(false/*isAscending*/));
          
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
                formatOpRec(programCtx.getFormatOpRecInCtx());
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
      
      }
      /**
      * formatSortRec 
      *   This method is derived from 
  *   COBOL Paragraph - 7100-FORMAT-SORT-REC COBOL Cyclomatic complexity - 5
      * Input  :  

      * - updateTrailerTable1200         COBOL Name: 200-UPDATE-TRAILER-TABLE1
      * - tableIp0090t1300               COBOL Name: 300-TABLE-IP0090T1
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - tableIp0091t1300               COBOL Name: 300-TABLE-IP0091T1
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void formatSortRec(FormatSortRecInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * Format sort record
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
//  IF 200-UPDATE-TRAILER-TABLE1 = 300-TABLE-IP0090T1
          if (		compareChars(methodIn.getUpdateTrailerTable1200(),methodIn.getTableIp0090t1300()) == 0 ) { 
//  PERFORM 8600-OPEN-TEMP90-FILE
              openTemp90File(programCtx.getOpenTemp90FileInCtx());/*8600-OPEN-TEMP90-FILE*/
//  PERFORM 7500-READ-TEMP90-FILE
              readTemp90File(programCtx.getReadTemp90FileInCtx());/*7500-READ-TEMP90-FILE*/
//  PERFORM 7200-READ-RELEASE-TBL90 UNTIL 88-200-TEMP90-STATUS-EOF
              while (!(methodIn.isTemp90StatusEof88200()) ) {
                 readReleaseTbl90(programCtx.getReadReleaseTbl90InCtx());/*7200-READ-RELEASE-TBL90*/
              }
          }
//  ELSE
          else { 
//  IF 200-UPDATE-TRAILER-TABLE1 = 300-TABLE-IP0091T1
              if (		compareChars(methodIn.getUpdateTrailerTable1200(),methodIn.getTableIp0091t1300()) == 0 ) { 
//  PERFORM 8700-OPEN-TEMP91-FILE
                  openTemp91File(programCtx.getOpenTemp91FileInCtx());/*8700-OPEN-TEMP91-FILE*/
//  PERFORM 7600-READ-TEMP91-FILE
                  readTemp91File(programCtx.getReadTemp91FileInCtx());/*7600-READ-TEMP91-FILE*/
//  PERFORM 7300-READ-RELEASE-TBL91 UNTIL 88-200-TEMP91-STATUS-EOF
                  while (!(methodIn.isTemp91StatusEof88200()) ) {
                     readReleaseTbl91(programCtx.getReadReleaseTbl91InCtx());/*7300-READ-RELEASE-TBL91*/
                  }
              }
          }
      
      }
      /**
      * readReleaseTbl90 
      *   This method is derived from 
  *   COBOL Paragraph - 7200-READ-RELEASE-TBL90 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - ip5000TableData                COBOL Name: IP5000-TABLE-DATA
      * - tempTbl90Rdw800                COBOL Name: 800-TEMP-TBL90-RDW
      *
      * Output :  

      * - sort1TableId                   COBOL Name: SORT1-TABLE-ID
      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - sort1TableEffDate              COBOL Name: SORT1-TABLE-EFF-DATE
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - sort1ActionCode                COBOL Name: SORT1-ACTION-CODE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - sort1Key                       COBOL Name: SORT1-KEY
      * - ip5000TableData                COBOL Name: IP5000-TABLE-DATA
      * - sort1TableData                 COBOL Name: SORT1-TABLE-DATA
      * - sortRdw                        COBOL Name: SORT-RDW
      * - tempTbl90Rdw800                COBOL Name: 800-TEMP-TBL90-RDW
      *
      * @throws CFException
      */
      @Override
      public ReadReleaseTbl90OutCtx readReleaseTbl90(ReadReleaseTbl90InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int SORT_1_KEY_LENGTH = 99;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * Read release record
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ReadReleaseTbl90OutCtx methodOut = methodIn.getReadReleaseTbl90OutCtx();
          // MOVE IP5000-TABLE-ID TO SORT1-TABLE-ID
          methodOut.setSort1TableId(methodOut.getIp5000TableId().toCharArray());
//  MOVE IP5000-EFFECTIVE-DATE TO SORT1-TABLE-EFF-DATE
          methodOut.setSort1TableEffDate(methodOut.getIp5000EffectiveDate());

// *----------------------------------------------------------------*
// *Added move to retain action code from the input record          *
// *----------------------------------------------------------------*
//  MOVE IP5000-ACTION-CODE TO SORT1-ACTION-CODE
          methodOut.setSort1ActionCode(methodOut.getIp5000ActionCode());
//  MOVE IP5000-TABLE-DATA (1 : 800-TABLE-90-KEY-LNGTH ) TO SORT1-KEY (1 : 800-TABLE-90-KEY-LNGTH )
          methodOut.getSortRec().replace(methodIn.getIp5000ParameterMasterRec()/*parent*/,19/*fromOffset - (sort1Key) */,(int) methodIn.getTable90KeyLngth800()/*fromLen*/,8/*toOffset - (ip5000TableData) */,(int) methodIn.getTable90KeyLngth800()/*toLen*/);
//  MOVE IP5000-TABLE-DATA TO SORT1-TABLE-DATA
          methodOut.setSort1TableData(methodOut.getIp5000TableData());
//  MOVE 800-TEMP-TBL90-RDW TO SORT-RDW
          methodOut.setSortRdw(methodOut.getTempTbl90Rdw800());
//  ADD LENGTH OF SORT1-KEY TO SORT-RDW
          methodOut.setSortRdw(methodOut.getSortRdw()+SORT_1_KEY_LENGTH);
//  RELEASE SORT-REC
          if(useSortFileStrategy()) {
          sortFileInternIn.write(methodOut.getSortRec().toCharArray(),(int) methodOut.getSortRdw());
          } else
            addReleaseRecord(methodOut.getSortRec().toCharArray(),(int) methodOut.getSortRdw());
//  PERFORM 7500-READ-TEMP90-FILE
          readTemp90File(programCtx.getReadTemp90FileInCtx());/*7500-READ-TEMP90-FILE*/
          ;
      
      return methodOut;
      }
      /**
      * readReleaseTbl91 
      *   This method is derived from 
  *   COBOL Paragraph - 7300-READ-RELEASE-TBL91 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - ip5000TableData                COBOL Name: IP5000-TABLE-DATA
      * - tempTbl91Rdw800                COBOL Name: 800-TEMP-TBL91-RDW
      *
      * Output :  

      * - sort1TableId                   COBOL Name: SORT1-TABLE-ID
      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - sort1TableEffDate              COBOL Name: SORT1-TABLE-EFF-DATE
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - sort1ActionCode                COBOL Name: SORT1-ACTION-CODE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - sort1Key                       COBOL Name: SORT1-KEY
      * - ip5000TableData                COBOL Name: IP5000-TABLE-DATA
      * - sort1TableData                 COBOL Name: SORT1-TABLE-DATA
      * - sortRdw                        COBOL Name: SORT-RDW
      * - tempTbl91Rdw800                COBOL Name: 800-TEMP-TBL91-RDW
      *
      * @throws CFException
      */
      @Override
      public ReadReleaseTbl91OutCtx readReleaseTbl91(ReadReleaseTbl91InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int SORT_1_KEY_LENGTH = 99;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * Read release record
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ReadReleaseTbl91OutCtx methodOut = methodIn.getReadReleaseTbl91OutCtx();
          // MOVE IP5000-TABLE-ID TO SORT1-TABLE-ID
          methodOut.setSort1TableId(methodOut.getIp5000TableId().toCharArray());
//  MOVE IP5000-EFFECTIVE-DATE TO SORT1-TABLE-EFF-DATE
          methodOut.setSort1TableEffDate(methodOut.getIp5000EffectiveDate());

// *----------------------------------------------------------------*
// *Added move to retain action code from the input record          *
// *----------------------------------------------------------------*
//  MOVE IP5000-ACTION-CODE TO SORT1-ACTION-CODE
          methodOut.setSort1ActionCode(methodOut.getIp5000ActionCode());
//  MOVE IP5000-TABLE-DATA (1 : 800-TABLE-91-KEY-LNGTH ) TO SORT1-KEY (1 : 800-TABLE-91-KEY-LNGTH )
          methodOut.getSortRec().replace(methodIn.getIp5000ParameterMasterRec()/*parent*/,19/*fromOffset - (sort1Key) */,(int) methodIn.getTable91KeyLngth800()/*fromLen*/,8/*toOffset - (ip5000TableData) */,(int) methodIn.getTable91KeyLngth800()/*toLen*/);
//  MOVE IP5000-TABLE-DATA TO SORT1-TABLE-DATA
          methodOut.setSort1TableData(methodOut.getIp5000TableData());
//  MOVE 800-TEMP-TBL91-RDW TO SORT-RDW
          methodOut.setSortRdw(methodOut.getTempTbl91Rdw800());
//  ADD LENGTH OF SORT1-KEY TO SORT-RDW
          methodOut.setSortRdw(methodOut.getSortRdw()+SORT_1_KEY_LENGTH);
//  RELEASE SORT-REC
          if(useSortFileStrategy()) {
          sortFileInternIn.write(methodOut.getSortRec().toCharArray(),(int) methodOut.getSortRdw());
          } else
            addReleaseRecord(methodOut.getSortRec().toCharArray(),(int) methodOut.getSortRdw());
//  PERFORM 7600-READ-TEMP91-FILE
          readTemp91File(programCtx.getReadTemp91FileInCtx());/*7600-READ-TEMP91-FILE*/
          ;
      
      return methodOut;
      }
      /**
      * formatOpRec 
      *   This method is derived from 
  *   COBOL Paragraph - 7400-FORMAT-OP-REC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sortRdw                        COBOL Name: SORT-RDW
      * - sort1TableId                   COBOL Name: SORT1-TABLE-ID
      * - sort1TableEffDate              COBOL Name: SORT1-TABLE-EFF-DATE
      * - sort1ActionCode                COBOL Name: SORT1-ACTION-CODE
      * - sort1TableData                 COBOL Name: SORT1-TABLE-DATA
      *
      * Output :  

      * - noOfSortedRecs400              COBOL Name: 400-NO-OF-SORTED-RECS
      * - sortInpEof100                  COBOL Name: 100-SORT-INP-EOF
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      * - sortRdw                        COBOL Name: SORT-RDW
      * - ip5000TableId                  COBOL Name: IP5000-TABLE-ID
      * - sort1TableId                   COBOL Name: SORT1-TABLE-ID
      * - ip5000EffectiveDate            COBOL Name: IP5000-EFFECTIVE-DATE
      * - sort1TableEffDate              COBOL Name: SORT1-TABLE-EFF-DATE
      * - ip5000ActionCode               COBOL Name: IP5000-ACTION-CODE
      * - sort1ActionCode                COBOL Name: SORT1-ACTION-CODE
      * - ip5000TableData                COBOL Name: IP5000-TABLE-DATA
      * - sort1TableData                 COBOL Name: SORT1-TABLE-DATA
      *
      * @throws CFException
      */
      @Override
      public FormatOpRecOutCtx formatOpRec(FormatOpRecInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int SORT_1_KEY_LENGTH = 99;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para formats the record.                                  *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
FormatOpRecOutCtx methodOut = methodIn.getFormatOpRecOutCtx();
          // MOVE 0 TO 400-NO-OF-SORTED-RECS
          methodOut.setNoOfSortedRecs400((long)0);
//  SET 88-100-SORT-EOF-N TO TRUE
          methodOut.setSortEofN88100True(); 
          
//  RETURN SORT-FILE
                if(useSortFileStrategy()) {
                  sortFileInternOut.read();
                  if (!sortFileInternOut.hasEnded()) {
                  	methodOut.getSortRec().setString(sortFileInternOut.getRecord());
                  	methodOut.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             byte[] tmpBytes = getReturnRecord(getRecIndex());
             methodOut.setSortRdw(tmpBytes.length);
             methodOut.getSortRec().setString(tmpBytes); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  SET 88-100-SORT-EOF-Y TO TRUE
                  methodOut.setSortEofY88100True(); 
                  
                }
//  PERFORM UNTIL 88-100-SORT-EOF-Y
          while ((!(methodOut.isSortEofY88100()) )) {
//  ADD 1 TO 400-NO-OF-SORTED-RECS
              methodOut.setNoOfSortedRecs400(methodOut.getNoOfSortedRecs400()+(long)1);
//  MOVE SORT-RDW TO 800-SYS200-RDW-OUT
              methodOut.setSys200RdwOut800(methodOut.getSortRdw());
//  SUBTRACT LENGTH OF SORT1-KEY FROM 800-SYS200-RDW-OUT
              methodOut.setSys200RdwOut800(Math.abs(methodOut.getSys200RdwOut800()-SORT_1_KEY_LENGTH));
//  MOVE SORT1-TABLE-ID TO IP5000-TABLE-ID
              methodOut.getIp5000TableId().setString(methodOut.getSort1TableId());
//  MOVE SORT1-TABLE-EFF-DATE TO IP5000-EFFECTIVE-DATE
              methodOut.setIp5000EffectiveDate(methodOut.getSort1TableEffDate());

// *----------------------------------------------------------------*
// *Move the action code to the output record                       *
// *----------------------------------------------------------------*
//  MOVE SORT1-ACTION-CODE TO IP5000-ACTION-CODE
              methodOut.setIp5000ActionCode(methodOut.getSort1ActionCode());
//  SUBTRACT 19 FROM SORT-RDW
              methodOut.setSortRdw(Math.abs(methodOut.getSortRdw()-(long)19));
//  MOVE SORT1-TABLE-DATA TO IP5000-TABLE-DATA (1 : SORT-RDW )
              methodOut.getIp5000ParameterMasterRec().replace(methodOut.getSortRec()/*parent*/,118/*fromOffset - (ip5000TableData) */,32634/*fromLen*/,19/*toOffset - (sort1TableData) */,(int) methodOut.getSortRdw()/*toLen*/);
//  PERFORM 8200-WRITE-EXPANDED-RECORD
              writeExpandedRecord(programCtx.getWriteExpandedRecordInCtx());/*8200-WRITE-EXPANDED-RECORD*/
//  RETURN SORT-FILE
                    if(useSortFileStrategy()) {
                      sortFileInternOut.read();
                      if (!sortFileInternOut.hasEnded()) {
                      	methodOut.getSortRec().setString(sortFileInternOut.getRecord());
                      	methodOut.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                      }    
                  } else {
              setRecIndex(getRecIndex()+1);
              if (getRecIndex() < sortRecKeys.size() ) { 
                 byte[] tmpBytes = getReturnRecord(getRecIndex());
                 methodOut.setSortRdw(tmpBytes.length);
                 methodOut.getSortRec().setString(tmpBytes); 
              }
              }
//  AT END
                  if (isSortRecordsEnded()) { 
//  SET 88-100-SORT-EOF-Y TO TRUE
                      methodOut.setSortEofY88100True(); 
                      
                    }
          }
      
      return methodOut;
      }
      /**
      * readTemp90File 
      *   This method is derived from 
  *   COBOL Paragraph - 7500-READ-TEMP90-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - para7500300                    COBOL Name: 300-PARA-7500
      * - readSys105File300              COBOL Name: 300-READ-SYS105-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - sys105TempTable90Rec           COBOL Name: SYS105-TEMP-TABLE90-REC
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - tempTbl90Rdw800                COBOL Name: 800-TEMP-TBL90-RDW
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para7500300                    COBOL Name: 300-PARA-7500
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readSys105File300              COBOL Name: 300-READ-SYS105-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public ReadTemp90FileOutCtx readTemp90File(ReadTemp90FileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file.                           *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ReadTemp90FileOutCtx methodOut = methodIn.getReadTemp90FileOutCtx();
//  READ SYS105-TEMP-TABLE90
          	sys105TempTable90.read();
          methodOut.setTempTbl90Rdw800(sys105TempTable90.getRecLen());
          methodOut.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
          if (!sys105TempTable90.hasEnded()) {
          	methodOut.getSys105TempTable90Rec().setString(sys105TempTable90.getRecord());
          }
//  IF 88-200-TEMP90-STATUS-GOOD
          if ( methodOut.isTemp90StatusGood88200()  ) { 
//  MOVE SYS105-TEMP-TABLE90-REC TO IP5000-PARAMETER-MASTER-REC (1 : 800-TEMP-TBL90-RDW )
              methodOut.getIp5000ParameterMasterRec().replace(methodOut.getSys105TempTable90Rec().getCharArray(),0,methodOut.getSys105TempTable90Rec().length(),0,(int) methodOut.getTempTbl90Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
//  ELSE
          else { 
//  IF 88-200-TEMP90-STATUS-EOF
//  ELSE
              if (!(methodOut.isTemp90StatusEof88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
                  methodOut.setFileName600(methodOut.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
                  methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-7500 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara7500300());
//  MOVE 300-READ-SYS105-FILE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(methodOut.getReadSys105File300());
                  // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
              }
          }
      
      return methodOut;
      }
      /**
      * readTemp91File 
      *   This method is derived from 
  *   COBOL Paragraph - 7600-READ-TEMP91-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - para7600300                    COBOL Name: 300-PARA-7600
      * - openSys106File300              COBOL Name: 300-OPEN-SYS106-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - sys106TempTable91Rec           COBOL Name: SYS106-TEMP-TABLE91-REC
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - tempTbl91Rdw800                COBOL Name: 800-TEMP-TBL91-RDW
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para7600300                    COBOL Name: 300-PARA-7600
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openSys106File300              COBOL Name: 300-OPEN-SYS106-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public ReadTemp91FileOutCtx readTemp91File(ReadTemp91FileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file.                           *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ReadTemp91FileOutCtx methodOut = methodIn.getReadTemp91FileOutCtx();
//  READ SYS106-TEMP-TABLE91
          	sys106TempTable91.read();
          methodOut.setTempTbl91Rdw800(sys106TempTable91.getRecLen());
          methodOut.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
          if (!sys106TempTable91.hasEnded()) {
          	methodOut.getSys106TempTable91Rec().setString(sys106TempTable91.getRecord());
          }
//  IF 88-200-TEMP91-STATUS-GOOD
          if ( methodOut.isTemp91StatusGood88200()  ) { 
//  MOVE SYS106-TEMP-TABLE91-REC TO IP5000-PARAMETER-MASTER-REC (1 : 800-TEMP-TBL91-RDW )
              methodOut.getIp5000ParameterMasterRec().replace(methodOut.getSys106TempTable91Rec().getCharArray(),0,methodOut.getSys106TempTable91Rec().length(),0,(int) methodOut.getTempTbl91Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
//  ELSE
          else { 
//  IF 88-200-TEMP91-STATUS-EOF
//  ELSE
              if (!(methodOut.isTemp91StatusEof88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
                  methodOut.setFileName600(methodOut.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
                  methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-7600 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara7600300());
//  MOVE 300-OPEN-SYS106-FILE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(methodOut.getOpenSys106File300());
                  // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
              }
          }
      
      return methodOut;
      }
      /**
      * readInputFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-READ-INPUT-FILE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - isItFirstRead100               COBOL Name: 100-IS-IT-FIRST-READ
      * - para8000300                    COBOL Name: 300-PARA-8000
      * - onedayFileEmpty300             COBOL Name: 300-ONEDAY-FILE-EMPTY
      * - ip6063007600                   COBOL Name: 600-IP606-3007
      * - sys001File300                  COBOL Name: 300-SYS001-FILE
      * - openSys001File300              COBOL Name: 300-OPEN-SYS001-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - sys001ReducedParmMasterRec     COBOL Name: SYS001-REDUCED-PARM-MASTER-REC
      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - sys001RdwIn800                 COBOL Name: 800-SYS001-RDW-IN
      * - ip0201ReducedFileFormat        COBOL Name: IP0201-REDUCED-FILE-FORMAT
      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8000300                    COBOL Name: 300-PARA-8000
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - onedayFileEmpty300             COBOL Name: 300-ONEDAY-FILE-EMPTY
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip6063007600                   COBOL Name: 600-IP606-3007
      * - condCode300                    COBOL Name: 300-COND-CODE
      * - inputFileSw100                 COBOL Name: 100-INPUT-FILE-SW
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys001File300                  COBOL Name: 300-SYS001-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - openSys001File300              COBOL Name: 300-OPEN-SYS001-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public ReadInputFileOutCtx readInputFile(ReadInputFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file.                           *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
ReadInputFileOutCtx methodOut = methodIn.getReadInputFileOutCtx();
//  READ SYS001-REDUCED-PARM-MASTER
          	sys001ReducedParmMaster.read();
          methodOut.setSys001RdwIn800(sys001ReducedParmMaster.getRecLen());
          methodOut.setInputFileStatus200(sys001ReducedParmMaster.getStatusString() );
          if (!sys001ReducedParmMaster.hasEnded()) {
          	methodOut.getSys001ReducedParmMasterRec().setString(sys001ReducedParmMaster.getRecord());
          }
//  IF 88-200-SYS001-STATUS-GOOD
          if ( methodOut.isSys001StatusGood88200()  ) { 
//  MOVE SYS001-REDUCED-PARM-MASTER-REC TO IP0201-REDUCED-FILE-FORMAT (1 : 800-SYS001-RDW-IN )
              methodOut.getIp0201ReducedFileFormat().replace(methodOut.getSys001ReducedParmMasterRec().getCharArray(),0,methodOut.getSys001ReducedParmMasterRec().length(),0,(int) methodOut.getSys001RdwIn800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  ADD 1 TO 400-RECS-READ
              methodOut.setRecsRead400(methodOut.getRecsRead400()+(long)1);
          }
//  ELSE
          else { 
//  IF 88-200-SYS001-STATUS-EOF
              if ( methodOut.isSys001StatusEof88200()  ) { 
//  IF 88-100-IT-IS-FIRST-READ
                  if ( methodIn.isItIsFirstRead88100()  ) { 
//  MOVE 300-PARA-8000 TO 900-ABEND-PARA
                      methodOut.setAbendPara900(methodOut.getPara8000300());
//  MOVE 300-ONEDAY-FILE-EMPTY TO 900-ABEND-CODE
                      methodOut.setAbendCode900(methodOut.getOnedayFileEmpty300());
//  MOVE 600-IP606-3007 TO 900-ABEND-TEXT
                      methodOut.setAbendText900(pad(66,methodOut.getIp6063007600(),SPACE_CHAR,RIGHT_PAD));
                      // MOVE 12 TO 300-COND-CODE
                      methodOut.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
                      terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
                  }
//  ELSE
                  else { 
//  SET 88-100-INPUT-FILE-DONE TO TRUE
                      methodOut.setInputFileDone88100True(); 
                      
                  }
              }
//  ELSE
              else { 
//  MOVE 300-SYS001-FILE TO 600-FILE-NAME
                  methodOut.setFileName600(methodOut.getSys001File300());
//  MOVE 200-INPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
                  methodOut.setBadIoStatusCode600(pad(4,methodOut.getInputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8000 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara8000300());
//  MOVE 300-OPEN-SYS001-FILE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(methodOut.getOpenSys001File300());
                  // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
              }
          }
      
      return methodOut;
      }
      /**
      * write90DfltToTemp 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-WRITE-90-DFLT-TO-TEMP COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip00901BsArMaster              COBOL Name: IP00901-BS-AR-MASTER
      * - tempTbl90Rdw800                COBOL Name: 800-TEMP-TBL90-RDW
      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - writeSys105File300             COBOL Name: 300-WRITE-SYS105-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - sys105TempTable90Rec           COBOL Name: SYS105-TEMP-TABLE90-REC
      * - ip00901BsArMaster              COBOL Name: IP00901-BS-AR-MASTER
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeSys105File300             COBOL Name: 300-WRITE-SYS105-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public Write90DfltToTempOutCtx write90DfltToTemp(Write90DfltToTempInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph write the table 90 records to temp file.        *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
Write90DfltToTempOutCtx methodOut = methodIn.getWrite90DfltToTempOutCtx();
//  MOVE IP00901-BS-AR-MASTER TO SYS105-TEMP-TABLE90-REC (1 : 800-TEMP-TBL90-RDW )
          methodOut.getSys105TempTable90Rec().replace(methodOut.getIp00901BsArMaster().getCharArray(),0,methodOut.getIp00901BsArMaster().length(),0,(int) methodIn.getTempTbl90Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE SYS105-TEMP-TABLE90-REC
          sys105TempTable90.setRecord(substring(methodOut.getSys105TempTable90Rec().toCharArray(),0,(int) methodIn.getTempTbl90Rdw800()));
          sys105TempTable90.write((int) methodIn.getTempTbl90Rdw800()); 
          methodOut.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(methodOut.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8100300());
//  MOVE 300-WRITE-SYS105-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getWriteSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * writeExpandedRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-EXPANDED-RECORD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - sys200RdwOut800                COBOL Name: 800-SYS200-RDW-OUT
      * - recsWritten400                 COBOL Name: 400-RECS-WRITTEN
      * - sys200File300                  COBOL Name: 300-SYS200-FILE
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - writeSys200File300             COBOL Name: 300-WRITE-SYS200-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - sys200ExpParmMasterRec         COBOL Name: SYS200-EXP-PARM-MASTER-REC
      * - ip5000ParameterMasterRec       COBOL Name: IP5000-PARAMETER-MASTER-REC
      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - recsWritten400                 COBOL Name: 400-RECS-WRITTEN
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys200File300                  COBOL Name: 300-SYS200-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeSys200File300             COBOL Name: 300-WRITE-SYS200-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public WriteExpandedRecordOutCtx writeExpandedRecord(WriteExpandedRecordInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph write into the output.                          *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
WriteExpandedRecordOutCtx methodOut = methodIn.getWriteExpandedRecordOutCtx();
//  MOVE IP5000-PARAMETER-MASTER-REC TO SYS200-EXP-PARM-MASTER-REC (1 : 800-SYS200-RDW-OUT )
          methodOut.getSys200ExpParmMasterRec().replace(methodOut.getIp5000ParameterMasterRec().getCharArray(),0,methodOut.getIp5000ParameterMasterRec().length(),0,(int) methodIn.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE SYS200-EXP-PARM-MASTER-REC
          sys200ExpandedParmMaster.setRecord(substring(methodOut.getSys200ExpParmMasterRec().toCharArray(),0,(int) methodIn.getSys200RdwOut800()));
          sys200ExpandedParmMaster.write((int) methodIn.getSys200RdwOut800()); 
          methodOut.setOutputFileStatus200(sys200ExpandedParmMaster.getStatusString() );
//  IF 88-200-SYS200-STATUS-GOOD
          if ( methodOut.isSys200StatusGood88200()  ) { 
//  ADD 1 TO 400-RECS-WRITTEN
              methodOut.setRecsWritten400(methodOut.getRecsWritten400()+(long)1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS200-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys200File300());
//  MOVE 200-OUTPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getOutputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8200300());
//  MOVE 300-WRITE-SYS200-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getWriteSys200File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * write91DfltToTemp 
      *   This method is derived from 
  *   COBOL Paragraph - 8250-WRITE-91-DFLT-TO-TEMP COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip00911BsBinMaster             COBOL Name: IP00911-BS-BIN-MASTER
      * - tempTbl91Rdw800                COBOL Name: 800-TEMP-TBL91-RDW
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - para8250300                    COBOL Name: 300-PARA-8250
      * - writeSys106File300             COBOL Name: 300-WRITE-SYS106-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - sys106TempTable91Rec           COBOL Name: SYS106-TEMP-TABLE91-REC
      * - ip00911BsBinMaster             COBOL Name: IP00911-BS-BIN-MASTER
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8250300                    COBOL Name: 300-PARA-8250
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeSys106File300             COBOL Name: 300-WRITE-SYS106-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public Write91DfltToTempOutCtx write91DfltToTemp(Write91DfltToTempInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph write the table 91 records to temp file.        *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
Write91DfltToTempOutCtx methodOut = methodIn.getWrite91DfltToTempOutCtx();
//  MOVE IP00911-BS-BIN-MASTER TO SYS106-TEMP-TABLE91-REC (1 : 800-TEMP-TBL91-RDW )
          methodOut.getSys106TempTable91Rec().replace(methodOut.getIp00911BsBinMaster().getCharArray(),0,methodOut.getIp00911BsBinMaster().length(),0,(int) methodIn.getTempTbl91Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE SYS106-TEMP-TABLE91-REC
          sys106TempTable91.setRecord(substring(methodOut.getSys106TempTable91Rec().toCharArray(),0,(int) methodIn.getTempTbl91Rdw800()));
          sys106TempTable91.write((int) methodIn.getTempTbl91Rdw800()); 
          methodOut.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(methodOut.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8250 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8250300());
//  MOVE 300-WRITE-SYS106-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getWriteSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * closeSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CLOSE-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - sys001File300                  COBOL Name: 300-SYS001-FILE
      * - para8300300                    COBOL Name: 300-PARA-8300
      * - closeSys001File300             COBOL Name: 300-CLOSE-SYS001-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys001File300                  COBOL Name: 300-SYS001-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8300300                    COBOL Name: 300-PARA-8300
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeSys001File300             COBOL Name: 300-CLOSE-SYS001-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public CloseSys001OutCtx closeSys001(CloseSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para closes the input file.                               *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
CloseSys001OutCtx methodOut = methodIn.getCloseSys001OutCtx();
//  CLOSE SYS001-REDUCED-PARM-MASTER
          sys001ReducedParmMaster.close(); 
          methodOut.setInputFileStatus200(sys001ReducedParmMaster.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(methodIn.isSys001StatusGood88200()) ) { 
//  MOVE 300-SYS001-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys001File300());
//  MOVE 200-INPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getInputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8300 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8300300());
//  MOVE 300-CLOSE-SYS001-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseSys001File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * openInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8350-OPEN-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001File300                  COBOL Name: 300-SYS001-FILE
      * - para8350300                    COBOL Name: 300-PARA-8350
      * - openSys001File300              COBOL Name: 300-OPEN-SYS001-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - inputFileSw100                 COBOL Name: 100-INPUT-FILE-SW
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys001File300                  COBOL Name: 300-SYS001-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8350300                    COBOL Name: 300-PARA-8350
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openSys001File300              COBOL Name: 300-OPEN-SYS001-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para opens the input file.                                *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
OpenInputSys001OutCtx methodOut = methodIn.getOpenInputSys001OutCtx();
//  OPEN INPUT SYS001-REDUCED-PARM-MASTER
          sys001ReducedParmMaster.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001ReducedParmMaster.getFileName(),sys001ReducedParmMaster.getSys001ReducedParmMasterCharSet(),sys001ReducedParmMaster.getSys001ReducedParmMasterCrlfFlag());
          methodOut.setInputFileStatus200(sys001ReducedParmMaster.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
          if ( methodOut.isSys001StatusGood88200()  ) { 
//  MOVE SPACES TO 100-INPUT-FILE-SW
              methodOut.setInputFileSw100(CONSTANTS.SPACE);
          }
//  ELSE
          else { 
//  MOVE 300-SYS001-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys001File300());
//  MOVE 200-INPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getInputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8350 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8350300());
//  MOVE 300-OPEN-SYS001-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenSys001File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * closeTemp90File 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-CLOSE-TEMP90-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - para8400300                    COBOL Name: 300-PARA-8400
      * - closeSys105File300             COBOL Name: 300-CLOSE-SYS105-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8400300                    COBOL Name: 300-PARA-8400
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeSys105File300             COBOL Name: 300-CLOSE-SYS105-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public CloseTemp90FileOutCtx closeTemp90File(CloseTemp90FileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para closes the temp90 file.                              *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
CloseTemp90FileOutCtx methodOut = methodIn.getCloseTemp90FileOutCtx();
//  CLOSE SYS105-TEMP-TABLE90
          sys105TempTable90.close(); 
          methodOut.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(methodIn.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8400 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8400300());
//  MOVE 300-CLOSE-SYS105-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * closeTemp91File 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-CLOSE-TEMP91-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - para8500300                    COBOL Name: 300-PARA-8500
      * - closeSys106File300             COBOL Name: 300-CLOSE-SYS106-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8500300                    COBOL Name: 300-PARA-8500
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeSys106File300             COBOL Name: 300-CLOSE-SYS106-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public CloseTemp91FileOutCtx closeTemp91File(CloseTemp91FileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para closes the temp91 file.                              *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
CloseTemp91FileOutCtx methodOut = methodIn.getCloseTemp91FileOutCtx();
//  CLOSE SYS106-TEMP-TABLE91
          sys106TempTable91.close(); 
          methodOut.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(methodIn.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8500 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8500300());
//  MOVE 300-CLOSE-SYS106-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * openTemp90File 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-OPEN-TEMP90-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - para8600300                    COBOL Name: 300-PARA-8600
      * - openSys105File300              COBOL Name: 300-OPEN-SYS105-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys105File300                  COBOL Name: 300-SYS105-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8600300                    COBOL Name: 300-PARA-8600
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openSys105File300              COBOL Name: 300-OPEN-SYS105-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public OpenTemp90FileOutCtx openTemp90File(OpenTemp90FileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the temp files for table90 in input mode  *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
OpenTemp90FileOutCtx methodOut = methodIn.getOpenTemp90FileOutCtx();
//  OPEN INPUT SYS105-TEMP-TABLE90
          sys105TempTable90.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys105TempTable90.getFileName(),sys105TempTable90.getSys105TempTable90CharSet(),sys105TempTable90.getSys105TempTable90CrlfFlag());
          methodOut.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(methodOut.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8600 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8600300());
//  MOVE 300-OPEN-SYS105-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * openTemp91File 
      *   This method is derived from 
  *   COBOL Paragraph - 8700-OPEN-TEMP91-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - para8700300                    COBOL Name: 300-PARA-8700
      * - openSys106File300              COBOL Name: 300-OPEN-SYS106-FILE
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * Output :  

      * - inputFileStatus200             COBOL Name: 200-INPUT-FILE-STATUS
      * - tmp90FileStatus200             COBOL Name: 200-TMP90-FILE-STATUS
      * - tmp91FileStatus200             COBOL Name: 200-TMP91-FILE-STATUS
      * - outputFileStatus200            COBOL Name: 200-OUTPUT-FILE-STATUS
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - sys106File300                  COBOL Name: 300-SYS106-FILE
      * - badIoStatusCode600             COBOL Name: 600-BAD-IO-STATUS-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8700300                    COBOL Name: 300-PARA-8700
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openSys106File300              COBOL Name: 300-OPEN-SYS106-FILE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioError600                     COBOL Name: 600-IO-ERROR
      *
      * @throws CFException
      */
      @Override
      public OpenTemp91FileOutCtx openTemp91File(OpenTemp91FileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the temp files for table90 in input mode  *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
OpenTemp91FileOutCtx methodOut = methodIn.getOpenTemp91FileOutCtx();
//  OPEN INPUT SYS106-TEMP-TABLE91
          sys106TempTable91.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys106TempTable91.getFileName(),sys106TempTable91.getSys106TempTable91CharSet(),sys106TempTable91.getSys106TempTable91CrlfFlag());
          methodOut.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(methodOut.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              methodOut.setBadIoStatusCode600(pad(4,methodOut.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8700 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8700300());
//  MOVE 300-OPEN-SYS106-FILE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoError600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - displayAbendMsgTxt900          COBOL Name: 900-DISPLAY-ABEND-MSG-TXT
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      *
      * Output :  

      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - rc                             COBOL Name: RETURN-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * Displays abend messages using abend routine                    *
// *----------------------------------------------------------------*
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
TerminateOnErrorOutCtx methodOut = methodIn.getTerminateOnErrorOutCtx();
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE RETURN-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
          programCtx.setRc(CFUtil.getInt(methodOut.getAbendCode900()));
//  DISPLAY 900-DISPLAY-ABEND-MSG-TXT
          logger.info(new String(methodIn.getDisplayAbendMsgTxt900())); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 'IN IP606130 - COMMENTED ABEND HANDLER IP610010 CALL'
          logger.info("IN IP606130 - COMMENTED ABEND HANDLER IP610010 CALL"); 
          ;
      
      return methodOut;
      }
      /**
      * updateEventLog 
      *   This method is derived from 
  *   COBOL Paragraph - 9950-UPDATE-EVENT-LOG COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * Output :  

      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001PgmName                 COBOL Name: IP60001-PGM-NAME
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * @throws CFException
      */
      @Override
      public UpdateEventLogOutCtx updateEventLog(UpdateEventLogInCtx methodIn) throws Exception {
      
// * Element ip601011 as of 10/31/02 04:53:52                    �vc?
// ******************************************************************
// *   description: this is the procedure division copybook to      *
// *                fill the event log table.  move the current     *
// *                program name to ip60001-hold-pgm-name and       *
// *                the current paragraph name to                   *
// *                ip60001-hold-para-name.  then perform paragraph *
// *                9950-update-event-log.                          *
// ******************************************************************
// *   modifications history                                        *
// *   date             project     modifications                   *
// *   07/30/99         2526        created                         *
// *   mm/dd/yy         xxxxxxx     description                     *
// ******************************************************************
// *  layout description:  event log update                         *
// ******************************************************************
// *  start copybook member ip601011 - event log update             *
// ******************************************************************
Ip606130Ctx programCtx = methodIn.getIp606130Ctx();
UpdateEventLogOutCtx methodOut = methodIn.getUpdateEventLogOutCtx();
//  IF 88-IP60001-LOG-EVENT
          if ( methodIn.isIp60001LogEvent88()  ) { 
//  IF IP60001-SUBSCRIPT = 500
              if (	( methodOut.getIp60001Subscript() == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
                  methodOut.setIp60001Subscript((long)1);
              }
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  methodOut.setIp60001Subscript(methodOut.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              methodOut.setIp60001PgmName((int) methodOut.getIp60001Subscript() - 1,methodOut.getIp60001HoldPgmName());
          }
      
      return methodOut;
      }
  
  
  
  
      /**
       * Method is used to collect Sort1TableId sort keys 
       * from each record to perform COBOL sort statement. 
       *  
       * @param record
       * @param recLen    
       */
      public void addReleaseRecord(char[] record, int recLen) throws Exception {
      	if(recLen > record.length)  recLen = record.length;
      	Sort1TableIdKeys relKey = new Sort1TableIdKeys();
                  char[] keySort1TableId = new char[SORT1TABLEID_LENGTH];
    System.arraycopy(record,SORT1TABLEID_OFFSET,keySort1TableId,0,SORT1TABLEID_LENGTH);
    relKey.setSort1TableId(convertChar2EbcdicBytes(keySort1TableId)); 
                  char[] keySort1Key = new char[SORT1KEY_LENGTH];
    System.arraycopy(record,SORT1KEY_OFFSET,keySort1Key,0,SORT1KEY_LENGTH);
    relKey.setSort1Key(convertChar2EbcdicBytes(keySort1Key)); 
                  char[] keySort1TableEffDate = new char[SORT1TABLEEFFDATE_LENGTH];
    System.arraycopy(record,SORT1TABLEEFFDATE_OFFSET,keySort1TableEffDate,0,SORT1TABLEEFFDATE_LENGTH);
    relKey.setSort1TableEffDate(convertChar2EbcdicBytes(keySort1TableEffDate)); 
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
       * Method is used to return sorted records using Sort1TableIdKeys object.
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
      		Sort1TableIdKeys k = sortRecKeys.get(index);
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
  
  
  
  
  }
  /* 
* element ip606130 as of 11/18/19 08:37:03                    �vc?
*$set nossrange
*----------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --             *
*    this item contains information and procedures which are     *
*    proprietary to mastercard international, incorporated,      *
*    and which are confidential.  it is provided with the        *
*    express understanding that it is to be used only for the    *
*    benefit of interbank card association, and is not to be     *
*    used, copied, or disclosed for any other purpose.  any      *
*    authorized reproduction (in whole or in part) of this       *
*    material must be marked with this legend.                   *
*----------------------------------------------------------------*
*author.        mpact.                                           *
*date-written.  april, 2005.                                     *
*date-compiled. april, 2005.                                     *
*security.      property of mastercard international, inc.       *
*----------------------------------------------------------------*
*program functionality:                                          *
*----------------------------------------------------------------*
* this program restores the reduced mpe records to their original*
* parm master layout.                                            *
* 1) expand the reduced fields.                                  *
* 2) program checks the trailer counts to make sure no records   *
*    are lost in transmission                                    *
* 3) program checks if there is need to build default agreements *
*    if yes,builds the default agreements in table90 and 91 and  *
*    updates the trailer counts in the output file.              *
*    only default service level 1 and 2 is build.                *
*                                                                *
* input  - 1. reduced, filtered update or replace file           *
* output - 1. expanded, filtered update or replace file          *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
*    project         :gcms 05.2 - 8035-nn mpe reduction          *
*    date            :2005/10/07                                 *
*    programmer      :mpact                                      *
*    modification    :initial version                            *
*----------------------------------------------------------------*
*    project         :gcms 06.1 - asd04450 fix                   *
*    date            :2005/10/18                                 *
*    programmer      :rupesh shinde                              *
*    modification    :recompile only                             *
*----------------------------------------------------------------*
*    project         :gcms 06.1 - asd04715 fix                   *
*    date            :2005/10/18                                 *
*    programmer      :rupesh shinde                              *
*    modification    :retain the record status code of the       *
*                     input records throughout the mpe expansion *
*                     code logic                                 *
*----------------------------------------------------------------*
*    project         :gcms 06.2 - asd05001 shadow bin            *
*    date            :2006/10/13                                 *
*    programmer      :shankar subramanian                        *
*    modification    :included the logic to build table 90 default
*                     agreements for ip9000t1 records.           *
*----------------------------------------------------------------*
*    project         : gcms release 7.1 - crf # c04698-25        *
*                      enforce domestic interchange.             *
*    date            : 04/13/2007.                               *
*    programmer      : mpact.                                    *
*    modification    : added logic to populate the field         *
*                      ip00901-bs-ar-bsse-cd from 600-bs-bsse-cd *
*                      in para 2242-10-move-to-90-layout.        *
*----------------------------------------------------------------*
*    project         :gcms release 8.2  - c09740                 *
*                     payment transaction processing.            *
*    date            :2008/10/03.                                *
*    programmer      :mpact.                                     *
*    modification    :table 41 de-compression logic is removed   *
*                     in order to add the field                  *
*                     :t:-re-power-ind in the pre-edit mpe       *
*                     in 2232-calculate-new-rdw para.            *
*----------------------------------------------------------------*
*    project         : gcms release 9.1                          *
*    date            : 03/02/2009                                *
*    programmer      : shankar subramanian                       *
*    modification    : added an explicit logic to populate       *
*                      spaces for the 17 bytes filler defined at *
*                      the end of copybook as initialize statement
*                      defaults the null value.                  *
*----------------------------------------------------------------*
*    project         : gcms release 9.2 - scr06996               *
*    date            : 10/10/2009                                *
*    programmer      : shankar subramanian                       *
*    modification    : backout the changes done in 09.1 release  *
*                      and eliminate compiler warning messages,  *
*                      dead data.                                *
*----------------------------------------------------------------*
*    project         :gcms release 10.1 - c12150                 *
*                     bsa tables restructuring                   *
*    date            :2010/04/16                                 *
*    programmer      :wipro                                      *
*    modification    :modified the program to increase the       *
*                     occurence of 600-table36-bsl from          *
*                     9000 to 20000.                             *
*----------------------------------------------------------------*
* project      : gcms release 11.q4 - c25054                     *
*                release agility - enhanced gcms member profile  *
* date         : 2011/10/14                                      *
* programmer   : wipro                                           *
* modification : initialized table 90 & 91 mpe layouts so that   *
*                filler can have value spaces.                   *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4                         *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/06/06                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to include the compiler   *
*                     directives to support in linux             *
*----------------------------------------------------------------*
*/
