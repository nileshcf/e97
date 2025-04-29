  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip606130.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip5000TableId;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.global.sharedvar.Ip5000ParameterMasterData;
  import com.cloudframe.app.global.sharedvar.Ip67002Ccyyddd;
  import com.cloudframe.app.process.Ip670010;
  import com.cloudframe.app.ip606130.dto.Ip0040TableDataFields;
  import com.cloudframe.app.ip606130.dto.Ip0040RegionSubreg;
  import com.cloudframe.app.ip606130.dto.Ip00901ParameterMasterData;
  import com.cloudframe.app.ip606130.dto.Ip0040TableDataKey;
  import com.cloudframe.app.ip606130.dto.Ip00901TableData;
  import com.cloudframe.app.ip606130.dto.Ip0041TableData;
  import com.cloudframe.app.ip606130.dto.Ip0041RegionTable;
  import com.cloudframe.app.ip606130.dto.Ip00911ParameterMasterData;
  import com.cloudframe.app.ip606130.dto.Ip00911TableData;
  import com.cloudframe.app.ip606130.file.records.Sort1TableIdKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.ip606130.file.records.SortRec1;
  import com.cloudframe.app.ip606130.dto.*;
  import com.cloudframe.app.ip606130.dto.AbendMessage900;
  import com.cloudframe.app.ip606130.dto.Ip0040ArMaster;
  import com.cloudframe.app.ip606130.dto.Sys001Read300;
  import com.cloudframe.app.ip606130.dto.Ip0041BinTable;
  import com.cloudframe.app.global.sharedvar.Ip5000ParameterMasterRec;
  import com.cloudframe.app.ip606130.dto.AbendParaName900;
  import com.cloudframe.app.ip606130.dto.Ip6063008600;
  import com.cloudframe.app.ip606130.dto.Ip00901BsArMaster;
  import com.cloudframe.app.ip606130.file.records.Sys200ExpParmMasterRec;
  import com.cloudframe.app.ip606130.dto.Sys200Written300;
  import com.cloudframe.app.ip606130.dto.Tbl90UpdatedTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.Ip00911BsBinMaster;
  import com.cloudframe.app.ip606130.dto.InavalidDateMsg600;
  import com.cloudframe.app.ip606130.dto.TrailerErrMessage600;
  import com.cloudframe.app.ip606130.dto.Tbl91DfltBsl2Msg600;
  import com.cloudframe.app.ip606130.dto.EndOfStepMsg300;
  import com.cloudframe.app.ip606130.dto.Tbl91DfltBsl1Msg600;
  import com.cloudframe.app.ip606130.dto.Table36LoadMessage600;
  import com.cloudframe.app.ip606130.dto.Ip00361DefaultBsAgrmts;
  import com.cloudframe.app.ip606130.dto.Tbl90DfltBsl1Msg600;
  import com.cloudframe.app.ip606130.dto.FinalOriginalTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.Tbl91OriginalTrlrMsg600;
  import com.cloudframe.app.global.sharedvar.Ip0201ReducedFileFormat;
  import com.cloudframe.app.ip606130.dto.Tbl90DfltBsl2Msg600;
  import com.cloudframe.app.ip606130.dto.Tbl90OriginalTrlrMsg600;
  import com.cloudframe.app.ip606130.dto.Tbl91UpdatedTrlrMsg600;
  import com.cloudframe.app.ip606130.file.records.SortRec;
  import com.cloudframe.app.ip606130.dto.Ip6063009600;
  import com.cloudframe.app.ip606130.dto.IoError600;
  import com.cloudframe.app.ip606130.file.records.Sys001ReducedParmMasterRec;
  import com.cloudframe.app.ip606130.dto.FinalUpdatedTrlrMsg600;
  import com.cloudframe.app.ip606130.file.records.Sys105TempTable90Rec;
  import com.cloudframe.app.ip606130.file.records.Sys106TempTable91Rec;
  import com.cloudframe.app.ip606130.dto.TotalDefaultsMsg600;
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
  
  public class Ip606130 extends CommonProcess implements InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Ip606130.class);
  
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private Ip0040ArMaster ip0040ArMaster = new Ip0040ArMaster() ;
  private Sys001Read300 sys001Read300 = new Sys001Read300() ;
  private Ip0041BinTable ip0041BinTable = new Ip0041BinTable() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private Ip6063008600 ip6063008600 = new Ip6063008600() ;
  private Ip00901BsArMaster ip00901BsArMaster = new Ip00901BsArMaster() ;
  private Sys200ExpParmMasterRec sys200ExpParmMasterRec = new Sys200ExpParmMasterRec() ;
  private Sys200Written300 sys200Written300 = new Sys200Written300() ;
  private Tbl90UpdatedTrlrMsg600 tbl90UpdatedTrlrMsg600 = new Tbl90UpdatedTrlrMsg600() ;
  private Ip00911BsBinMaster ip00911BsBinMaster = new Ip00911BsBinMaster() ;
  private InavalidDateMsg600 inavalidDateMsg600 = new InavalidDateMsg600() ;
  private TrailerErrMessage600 trailerErrMessage600 = new TrailerErrMessage600() ;
  private Tbl91DfltBsl2Msg600 tbl91DfltBsl2Msg600 = new Tbl91DfltBsl2Msg600() ;
  private EndOfStepMsg300 endOfStepMsg300 = new EndOfStepMsg300() ;
  private Tbl91DfltBsl1Msg600 tbl91DfltBsl1Msg600 = new Tbl91DfltBsl1Msg600() ;
  private Table36LoadMessage600 table36LoadMessage600 = new Table36LoadMessage600() ;
  private Ip00361DefaultBsAgrmts ip00361DefaultBsAgrmts = new Ip00361DefaultBsAgrmts() ;
  private Tbl90DfltBsl1Msg600 tbl90DfltBsl1Msg600 = new Tbl90DfltBsl1Msg600() ;
  private FinalOriginalTrlrMsg600 finalOriginalTrlrMsg600 = new FinalOriginalTrlrMsg600() ;
  private Tbl91OriginalTrlrMsg600 tbl91OriginalTrlrMsg600 = new Tbl91OriginalTrlrMsg600() ;
  private Tbl90DfltBsl2Msg600 tbl90DfltBsl2Msg600 = new Tbl90DfltBsl2Msg600() ;
  private Tbl90OriginalTrlrMsg600 tbl90OriginalTrlrMsg600 = new Tbl90OriginalTrlrMsg600() ;
  private Tbl91UpdatedTrlrMsg600 tbl91UpdatedTrlrMsg600 = new Tbl91UpdatedTrlrMsg600() ;
  private SortRec sortRec = new SortRec() ;
  private Ip6063009600 ip6063009600 = new Ip6063009600() ;
  private IoError600 ioError600 = new IoError600() ;
  private Sys001ReducedParmMasterRec sys001ReducedParmMasterRec = new Sys001ReducedParmMasterRec() ;
  private FinalUpdatedTrlrMsg600 finalUpdatedTrlrMsg600 = new FinalUpdatedTrlrMsg600() ;
  private Sys105TempTable90Rec sys105TempTable90Rec = new Sys105TempTable90Rec() ;
  private Sys106TempTable91Rec sys106TempTable91Rec = new Sys106TempTable91Rec() ;
  private TotalDefaultsMsg600 totalDefaultsMsg600 = new TotalDefaultsMsg600() ;
  private UpdateTrailerRecGroup200 updateTrailerRecGroup200 = new UpdateTrailerRecGroup200() ;
  private Ip00002Table0Data ip00002Table0Data = new Ip00002Table0Data() ;
  private BussServDftls600 bussServDftls600 = new BussServDftls600() ;
  private Work work = new Work() ;
  
  
  
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
  @Qualifier("global_ip5000ParameterMasterRec")
  Ip5000ParameterMasterRec ip5000ParameterMasterRec;
  @Autowired 
  @Qualifier("global_ip0201ReducedFileFormat")
  Ip0201ReducedFileFormat ip0201ReducedFileFormat;
  @Autowired 
  @Qualifier("global_ip60001EventLogWorkArea")
  Ip60001EventLogWorkArea ip60001EventLogWorkArea;
  
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
  
  int ip00002Table0Idx;
  
  
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
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls routines to,                              *
// *  a. initialize the process.                                    *
// *  b. routine to read the first record from the input file.      *
// *  c. routine to restore the mpe record size.                    *
// *----------------------------------------------------------------*
//  PERFORM 1000-INITIALIZE-PROCESS
          initializeProcess();/*1000-INITIALIZE-PROCESS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-INPUT-FILE UNTIL 88-100-INPUT-FILE-DONE
          while (!(work.isInputFileDone88100()) ) {
             processInputFile();/*2000-PROCESS-INPUT-FILE*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 3000-END-OF-JOB
          endOfJob();/*3000-END-OF-JOB*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 4000-PRINT-COUNTS
          printCounts();/*4000-PRINT-COUNTS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void initializeProcess() throws Exception {
			// Declare local variables used in the method
			 final int IP_5000_EFFECTIVE_DATE_LENGTH = 10;
			 final int IP_5000_ACTION_CODE_LENGTH = 1;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph calls routines to,                              *
// *  a. update event log                                           *
// *  b. display execution messages                                 *
// *----------------------------------------------------------------*
//  MOVE 300-PGM-NAME TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getPgmName300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog();/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MESSAGES
              displayExecMessages();/*1100-DISPLAY-EXEC-MESSAGES*/
//  PERFORM 1200-FILE-OPEN-PROCESS
              fileOpenProcess();/*1200-FILE-OPEN-PROCESS*/
//  PERFORM 2241-10-OPEN-TEMP-FILES
              _10OpenTempFiles();/*2241-10-OPEN-TEMP-FILES*/
//  MOVE ZERO TO 800-EXPANDED-LENGTH
              work.setExpandedLength800(0);

// *Swb     set 800-ptr-ip610010            to entry 300-pgm-ip610010
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
              work.setPtrIp670010800(work.getPgmIp670010300()); 
              
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  SET 88-100-IT-IS-FIRST-READ TO TRUE
              work.setItIsFirstRead88100True(); 
              
//  ADD LENGTH OF IP5000-EFFECTIVE-DATE LENGTH OF IP5000-ACTION-CODE LENGTH OF IP5000-TABLE-ID TO 800-EXPANDED-LENGTH
              work.setExpandedLength800(work.getExpandedLength800()+IP_5000_EFFECTIVE_DATE_LENGTH+IP_5000_ACTION_CODE_LENGTH+Ip5000TableId.getIp5000TableIdFieldLength());
//  MOVE LENGTH OF IP0040-AR-MASTER TO 800-TABLE-40-LENGTH
              work.setTable40Length800(Ip0040ArMaster.getIp0040ArMasterFieldLength());
          }
//  PERFORM 8000-READ-INPUT-FILE
          readInputFile();/*8000-READ-INPUT-FILE*/
//  PERFORM 1300-CHECK-FOR-HEADERS
          checkForHeaders();/*1300-CHECK-FOR-HEADERS*/
//  SET 88-100-IT-IS-NOT-FIRST-READ TO TRUE
          work.setItIsNotFirstRead88100True(); 
          
      
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
      private void displayExecMessages() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph displays program execution messages by calling  *
// * program - ip996010.                                            *
// *----------------------------------------------------------------*

// *Swb set  800-ptr-ip996010         to entry 300-pgm-ip996010
//  MOVE 300-PGM-NAME TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getPgmName300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
//  MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CONSTANTS.LITERAL_479954777);

// *Swb call 800-ptr-ip996010.

// *----------------------------------------------------------------*
// * This paragraph opens input and output files. it reads the first*
// * record from the input file.                                    *
// *----------------------------------------------------------------*
//  DISPLAY 'IN IP606130 - COMMENTED IP996010 CALL'
          logger.info("IN IP606130 - COMMENTED IP996010 CALL"); 
      
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
      private void fileOpenProcess() throws Exception {
//  PERFORM 8350-OPEN-INPUT-SYS001
          openInputSys001();/*8350-OPEN-INPUT-SYS001*/
//  OPEN OUTPUT SYS200-EXPANDED-PARM-MASTER
          sys200ExpandedParmMaster.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys200ExpandedParmMaster.getFileName(),sys200ExpandedParmMaster.getSys200ExpandedParmMasterCharSet(),sys200ExpandedParmMaster.getSys200ExpandedParmMasterCrlfFlag());
          work.setOutputFileStatus200(sys200ExpandedParmMaster.getStatusString() );
//  IF 88-200-SYS200-STATUS-GOOD
//  ELSE
          if (!(work.isSys200StatusGood88200()) ) { 
//  MOVE 300-SYS200-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys200File300());
//  MOVE 200-OUTPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getOutputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  MOVE 300-OPEN-SYS200-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenSys200File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void checkForHeaders() throws Exception {
			// Declare local variables used in the method
			char[] updateHdrRec300 = null;
			char[] replacmntHdrRec300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para checks for expected header record. if update or      *
// * replacement header record is not found, program abends.        *
// *----------------------------------------------------------------*
//  IF IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-UPDATE-HDR-REC OR 300-REPLACMNT-HDR-REC
          replacmntHdrRec300 = work.getReplacmntHdrRec300();
          updateHdrRec300 = work.getUpdateHdrRec300();
//  ELSE
          if (!(Field.compareChar(ip0201ReducedFileFormat.toCharArray() , updateHdrRec300 , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) && !(Field.compareChar(ip0201ReducedFileFormat.toCharArray() , replacmntHdrRec300 , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/))) { 
//  DISPLAY 600-HEADER-RECORD-MISSING
              logger.info(new String(work.getHeaderRecordMissing600())); 
//  MOVE 300-PARA-1300 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1300300());
//  MOVE 300-HDR-MISSING-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getHdrMissingAbendCode300());
//  MOVE 600-HEADER-RECORD-MISSING TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getHeaderRecordMissing600(),SPACE_CHAR,RIGHT_PAD));
              // MOVE 12 TO 300-COND-CODE
              endOfStepMsg300.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
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
      private void processInputFile() throws Exception {
			// Declare local variables used in the method
			char[] trailerRecord300 = null;
			char[] updateHdrRec300 = null;
			char[] replacmntHdrRec300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph calls another routine to expand the current mpe *
// * record. for header/trailer records, a routine is performed to  *
// * process these records.                                         *
// *----------------------------------------------------------------*
          trailerRecord300 = work.getTrailerRecord300();
          replacmntHdrRec300 = work.getReplacmntHdrRec300();
          updateHdrRec300 = work.getUpdateHdrRec300();
//  IF IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD OR 300-UPDATE-HDR-REC OR 300-REPLACMNT-HDR-REC
          if (Field.compareChar(ip0201ReducedFileFormat.toCharArray() , trailerRecord300 , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/) || Field.compareChar(ip0201ReducedFileFormat.toCharArray() , updateHdrRec300 , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/) || Field.compareChar(ip0201ReducedFileFormat.toCharArray() , replacmntHdrRec300 , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) { 
//  PERFORM 2100-PROCESS-HEADER-TRAILER
              processHeaderTrailer();/*2100-PROCESS-HEADER-TRAILER*/
          }
  
//  ELSE
          else { 
//  PERFORM 2200-EXPAND-MPE
              expandMpe();/*2200-EXPAND-MPE*/
          }
//  IF 88-100-WRITE
          if ( work.isWrite88100()  ) { 
//  PERFORM 8200-WRITE-EXPANDED-RECORD
              writeExpandedRecord();/*8200-WRITE-EXPANDED-RECORD*/
          }
//  ELSE
          else { 
//  SET 88-100-WRITE TO TRUE
              work.setWrite88100True(); 
              
          }
//  PERFORM 8000-READ-INPUT-FILE
          readInputFile();/*8000-READ-INPUT-FILE*/
          ;
      
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
      private void processHeaderTrailer() throws Exception {
			// Declare local variables used in the method
			char[] trailerRecord300 = null;
			char[] updateTrailerTable1200 = null;
			char[] finalTrailer300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para process the tailer and header records.               *
// *----------------------------------------------------------------*
//  MOVE IP0201-REDUCED-FILE-FORMAT TO 200-UPDATE-TRAILER-REC
          updateTrailerRecGroup200.setUpdateTrailerRec200(ip0201ReducedFileFormat.getCharArray());
          finalTrailer300 = work.getFinalTrailer300();
          updateTrailerTable1200 = updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerTable1200();
//  EVALUATE 200-UPDATE-TRAILER-TABLE1
          if  (		compareChars(updateTrailerTable1200,work.getTableIp0036t1300()) == 0 ) { 
//  PERFORM 2140-CHECK-TRAILER-COUNTS
              checkTrailerCounts();/*2140-CHECK-TRAILER-COUNTS*/
//  SET 88-100-DO-NOT-WRITE TO TRUE
              work.setDoNotWrite88100True(); 
              
          }
          else if  (		compareChars(updateTrailerTable1200,work.getTableIp0090t1300()) == 0 ) { 
//  IF 88-100-BUILD-DFLT-AGRMNT
              if ( work.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM 2150-PROCESS-IP9000T1
                  processIp9000t1();/*2150-PROCESS-IP9000T1*/
//  PERFORM 2110-PROCESS-TABLE90-TRAILER
                  processTable90Trailer();/*2110-PROCESS-TABLE90-TRAILER*/
//  PERFORM 2160-PROCESS-OTHER-TBLS
                  processOtherTbls();/*2160-PROCESS-OTHER-TBLS*/
              }
//  ELSE
              else { 
//  PERFORM 2110-PROCESS-TABLE90-TRAILER
                  processTable90Trailer();/*2110-PROCESS-TABLE90-TRAILER*/
              }
          }
          else if  (		compareChars(updateTrailerTable1200,work.getTableIp0091t1300()) == 0 ) { 
//  PERFORM 2120-PROCESS-TABLE91-TRAILER
              processTable91Trailer();/*2120-PROCESS-TABLE91-TRAILER*/
          }
          else if  (		compareChars(updateTrailerTable1200,finalTrailer300) == 0 ) { 
//  PERFORM 2130-PROCESS-FINAL-TRAILER
              processFinalTrailer();/*2130-PROCESS-FINAL-TRAILER*/
          }
          else   { 
              trailerRecord300 = work.getTrailerRecord300();
//  IF IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD
              if (Field.compareChar(ip0201ReducedFileFormat.toCharArray() , trailerRecord300 , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) { 
//  PERFORM 2140-CHECK-TRAILER-COUNTS
                  checkTrailerCounts();/*2140-CHECK-TRAILER-COUNTS*/
              }
  
          }
  
//  MOVE 200-UPDATE-TRAILER-REC TO IP5000-PARAMETER-MASTER-REC (1 : 800-SYS001-RDW-IN )
          ip5000ParameterMasterRec.replace(updateTrailerRecGroup200/*parent*/,0/*fromOffset - (ip5000ParameterMasterRec) */,80/*fromLen*/,0/*toOffset - (updateTrailerRec200) */,(int) work.getSys001RdwIn800()/*toLen*/);
//  MOVE 800-SYS001-RDW-IN TO 800-SYS200-RDW-OUT
          work.setSys200RdwOut800(work.getSys001RdwIn800());
          // MOVE ZERO TO 400-RECORDS-COUNT
          work.setRecordsCount400(0);
      
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
      private void processTable90Trailer() throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the trailer record for table 90.if build dflt*
// * agreement switch is set, the para sorts the temp file and then *
// * write all the records to output file including the trailer     *
// * record. the count is updated.                                  *
// * if build dflt agreement switch is not set, then para simply    *
// * write the trailer record with the original count.              *
// *----------------------------------------------------------------*
//  PERFORM 2140-CHECK-TRAILER-COUNTS
          checkTrailerCounts();/*2140-CHECK-TRAILER-COUNTS*/
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-TABLE90-ORIGINAL-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          tbl90OriginalTrlrMsg600.setTable90OriginalCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerCount1200()).toCharArray()));
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM 8400-CLOSE-TEMP90-FILE
              closeTemp90File();/*8400-CLOSE-TEMP90-FILE*/
//  PERFORM 7000-SORT-THE-TEMP-FILE
              sortTheTempFile();/*7000-SORT-THE-TEMP-FILE*/
//  MOVE 400-NO-OF-SORTED-RECS TO 200-UPDATE-TRAILER-COUNT1 600-TABLE90-UPDATE-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().setUpdateTrailerCount1200(work.getNoOfSortedRecs400());
              tbl90UpdatedTrlrMsg600.setTable90UpdateCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getNoOfSortedRecs400()).toCharArray()));
          }
      
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
      private void processTable91Trailer() throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the trailer record for table 91.if build dflt*
// * agreement switch is set, the para sorts the temp file and then *
// * write all the records to output file including the trailer     *
// * record. the count is updated.                                  *
// * if build dflt agreement switch is not set, then para simply    *
// * write the trailer record with the original count.              *
// *----------------------------------------------------------------*
//  PERFORM 2140-CHECK-TRAILER-COUNTS
          checkTrailerCounts();/*2140-CHECK-TRAILER-COUNTS*/
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-TABLE91-ORIGINAL-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          tbl91OriginalTrlrMsg600.setTable91OriginalCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerCount1200()).toCharArray()));
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM 8500-CLOSE-TEMP91-FILE
              closeTemp91File();/*8500-CLOSE-TEMP91-FILE*/
//  PERFORM 7000-SORT-THE-TEMP-FILE
              sortTheTempFile();/*7000-SORT-THE-TEMP-FILE*/
//  MOVE 400-NO-OF-SORTED-RECS TO 200-UPDATE-TRAILER-COUNT1 600-TABLE91-UPDATE-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().setUpdateTrailerCount1200(work.getNoOfSortedRecs400());
              tbl91UpdatedTrlrMsg600.setTable91UpdateCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getNoOfSortedRecs400()).toCharArray()));
          }
      
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
      private void processFinalTrailer() throws Exception {
      
// *----------------------------------------------------------------*
// * This para process the final trailer record.
// *----------------------------------------------------------------*
          work.setFinalRecords400((long)Math.abs(work.getRecsWritten400() + 1));
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-FINAL-TRLR-ORIGINAL-CNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          finalOriginalTrlrMsg600.setFinalTrlrOriginalCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerCount1200()).toCharArray()));
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-FINAL-TRLR-ORIGINAL-CNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              finalOriginalTrlrMsg600.setFinalTrlrOriginalCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerCount1200()).toCharArray()));
//  MOVE 400-RECS-READ TO 400-RECORDS-COUNT
              work.setRecordsCount400(work.getRecsRead400());
//  PERFORM 2140-CHECK-TRAILER-COUNTS
              checkTrailerCounts();/*2140-CHECK-TRAILER-COUNTS*/
//  MOVE 400-FINAL-RECORDS TO 200-UPDATE-TRAILER-COUNT1 600-FINAL-TRLR-UPDATED-CNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().setUpdateTrailerCount1200(work.getFinalRecords400());
              finalUpdatedTrlrMsg600.setFinalTrlrUpdatedCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getFinalRecords400()).toCharArray()));
          }
//  ELSE
          else { 
              // MOVE 400-FINAL-RECORDS TO 400-RECORDS-COUNT
              work.setRecordsCount400(work.getFinalRecords400());
//  PERFORM 2140-CHECK-TRAILER-COUNTS
              checkTrailerCounts();/*2140-CHECK-TRAILER-COUNTS*/
          }
      
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
      private void checkTrailerCounts() throws Exception {
			// Declare local variables used in the method
			long recordsCount400 = 0;
			long updateTrailerCount1200 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para process the trailer record for table 91.if build dflt*
// * agreement switch is set, the para sorts the temp file and then *
// *----------------------------------------------------------------*
//  IF 400-RECORDS-COUNT = 200-UPDATE-TRAILER-COUNT1
          updateTrailerCount1200 = updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerCount1200();
          recordsCount400 = work.getRecordsCount400();
//  ELSE
          if (	( recordsCount400 != updateTrailerCount1200 )) { 
//  MOVE 400-RECORDS-COUNT TO 600-ERROR-INP-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              trailerErrMessage600.setErrorInpCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getRecordsCount400()).toCharArray()));
//  MOVE 200-UPDATE-TRAILER-COUNT1 TO 600-ERROR-TRL-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              trailerErrMessage600.setErrorTrlCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerCount1200()).toCharArray()));
//  MOVE 200-UPDATE-TRAILER-TABLE1 TO 600-ERROR-TABLE-NBR
              trailerErrMessage600.setErrorTableNbr600(updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerTable1200());
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  DISPLAY 600-TRAILER-ERR-MESSAGE
              logger.info(trailerErrMessage600.toString()); 
          }
  
      
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
      private void processIp9000t1() throws Exception {
			// Declare local variables used in the method
			Ip5000ParameterMasterData ip5000ParameterMasterData = ip5000ParameterMasterRec.getIp5000ParameterMasterData();
			Ip5000TableId ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
			char[] tableIp9000t1300 = null;
			char[] ip0201TblSubId = null;
			char[] tblIp9000t1SubId800 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para processes table ip9000t1 records. for ip9000t1 record*
// * table 90 default agreeement is built.                          *
// *----------------------------------------------------------------*
//  MOVE 400-RECS-READ TO 400-HOLD-RECS-READ
          work.setHoldRecsRead400(work.getRecsRead400());
//  MOVE ZEROES TO 400-RECS-READ
          work.setRecsRead400(0);
//  PERFORM UNTIL 88-100-INPUT-FILE-DONE OR IP0201-REDUCED-FILE-FORMAT (16 : 8) = 300-FINAL-TRAILER OR IP0201-TBL-SUB-ID = 800-TBL-IP9000T1-SUB-ID
          while ((!(work.isInputFileDone88100())  && !(Field.compareChar(ip0201ReducedFileFormat.toCharArray() , work.getFinalTrailer300() , ( 15 /*start*/ ), 8 /*left len*/ , 8 /*right len*/)) && 		compareChars(ip0201ReducedFileFormat.getIp0201TblSubId(),work.getTblIp9000t1SubId800()) != 0 )) {
//  PERFORM 8000-READ-INPUT-FILE
              readInputFile();/*8000-READ-INPUT-FILE*/
          }
          tblIp9000t1SubId800 = work.getTblIp9000t1SubId800();
          ip0201TblSubId = ip0201ReducedFileFormat.getIp0201TblSubId();
//  IF IP0201-TBL-SUB-ID EQUAL 800-TBL-IP9000T1-SUB-ID
          if (		compareChars(ip0201TblSubId,tblIp9000t1SubId800) == 0 ) { 
//  PERFORM UNTIL 88-100-INPUT-FILE-DONE OR IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD
              while ((!(work.isInputFileDone88100())  && !(Field.compareChar(ip0201ReducedFileFormat.toCharArray() , work.getTrailerRecord300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)))) {
//  PERFORM 2220-DATE-CONVERSION
                  dateConversion();/*2220-DATE-CONVERSION*/
//  PERFORM 2230-TABLE-ID-CONVERSION
                  tableIdConversion();/*2230-TABLE-ID-CONVERSION*/
                  ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
                  tableIp9000t1300 = work.getTableIp9000t1300();
//  IF IP5000-TABLE-ID = 300-TABLE-IP9000T1
                  if (		compareChars(ip5000TableId,tableIp9000t1300) == 0 ) { 
//  PERFORM 2242-BUILD-TABLE90-DFLTS
                      buildTable90Dflts();/*2242-BUILD-TABLE90-DFLTS*/
                  }
  
//  PERFORM 8000-READ-INPUT-FILE
                  readInputFile();/*8000-READ-INPUT-FILE*/
              }
          }
  
      
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
      private void processOtherTbls() throws Exception {
      
// *----------------------------------------------------------------*
// * This para is used to have a dummy read upto table 90 trailer   *
// * record.                                                        *
// *----------------------------------------------------------------*
//  PERFORM 8300-CLOSE-SYS001
          closeSys001();/*8300-CLOSE-SYS001*/
//  PERFORM 8350-OPEN-INPUT-SYS001
          openInputSys001();/*8350-OPEN-INPUT-SYS001*/
//  PERFORM 8000-READ-INPUT-FILE
          readInputFile();/*8000-READ-INPUT-FILE*/
//  PERFORM UNTIL 88-100-INPUT-FILE-DONE OR ( IP0201-REDUCED-FILE-FORMAT (1 : 10) = 300-TRAILER-RECORD AND IP0201-REDUCED-FILE-FORMAT (16 : 8) = 300-TABLE-IP0090T1 )
          while ((!(work.isInputFileDone88100())  && (!(Field.compareChar(ip0201ReducedFileFormat.toCharArray() , work.getTrailerRecord300() , ( 0 /*start*/ ), 10 /*left len*/ , 10 /*right len*/)) || !(Field.compareChar(ip0201ReducedFileFormat.toCharArray() , work.getTableIp0090t1300() , ( 15 /*start*/ ), 8 /*left len*/ , 8 /*right len*/))))) {
//  PERFORM 8000-READ-INPUT-FILE
              readInputFile();/*8000-READ-INPUT-FILE*/
          }
//  MOVE 400-HOLD-RECS-READ TO 400-RECS-READ
          work.setRecsRead400(work.getHoldRecsRead400());
      
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
      private void expandMpe() throws Exception {
      
// * B. calls routine to convert table-id and change rdw as required*
// * c. calls routine to perform table by table conversion          *
// *----------------------------------------------------------------*
//  IF SYS001-REDUCED-PARM-MASTER-REC (12 : 8) EQUAL 'IP0000T1'
//  LITERAL_IP0000T1 = 'IP0000T1'
          if (Field.compareChar(sys001ReducedParmMasterRec.toCharArray() , CONSTANTS.LITERAL_IP0000T1 , ( 11 /*start*/ ), 8 /*left len*/ , 8 /*right len*/)) { 
//  MOVE 800-SYS001-RDW-IN TO 800-SYS200-RDW-OUT
              work.setSys200RdwOut800(work.getSys001RdwIn800());
//  MOVE SYS001-REDUCED-PARM-MASTER-REC TO IP5000-PARAMETER-MASTER-REC
              ip5000ParameterMasterRec.setString(pad(32756,sys001ReducedParmMasterRec.getCharArray(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 2210-LOAD-TABLE0-RECORDS
              loadTable0Records();/*2210-LOAD-TABLE0-RECORDS*/
          }
//  ELSE
          else { 
//  PERFORM 2220-DATE-CONVERSION
              dateConversion();/*2220-DATE-CONVERSION*/
//  PERFORM 2230-TABLE-ID-CONVERSION
              tableIdConversion();/*2230-TABLE-ID-CONVERSION*/
//  PERFORM 2240-SPECIAL-PROCESSING
              specialProcessing();/*2240-SPECIAL-PROCESSING*/
          }
      
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
      private void loadTable0Records() throws Exception {
			// Declare local variables used in the method
			short ip00002Table0Entries = 0;
			short ip00002Table0EntriesMax = 0;
			char[] tblIp9000t1SubId800 = null;
			char[] tableIp9000t1300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * Loading the internal for table zero.                           *
// *----------------------------------------------------------------*
          ip00002Table0Entries = work.getIp00002Table0Entries();
          ip00002Table0EntriesMax = work.getIp00002Table0EntriesMax();
//  IF IP00002-TABLE-0-ENTRIES GREATER THAN IP00002-TABLE-0-ENTRIES-MAX
          if (	( ip00002Table0Entries > ip00002Table0EntriesMax )) { 
//  MOVE IP00002-TABLE-0-ENTRIES-MAX TO 600-3008-MAX-ENTRIES
              ip6063008600.setMaxEntries6003008(work.getIp00002Table0EntriesMax());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2210300());
//  MOVE 300-TABLE-ZERO-OVERFLOW TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getTableZeroOverflow300());
              // MOVE 600-IP606-3008 TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ip6063008600.toCharArray());
              // MOVE 12 TO 300-COND-CODE
              endOfStepMsg300.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
//  ELSE
          else { 
//  ADD 300-VALUE-ONE TO IP00002-TABLE-0-ENTRIES
              work.setIp00002Table0Entries( (short) (work.getIp00002Table0Entries()+(short) work.getValueOne300()));
//  SET IP00002-TABLE-0-IDX TO IP00002-TABLE-0-ENTRIES
              ip00002Table0Idx = work.getIp00002Table0Entries(); 
              
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP00002-TABLE-0-ENTRY ( IP00002-TABLE-0-IDX )
              ip00002Table0Data.setIp00002Table0Entry((ip00002Table0Idx - 1),ip5000ParameterMasterRec.getCharArray());
              tblIp9000t1SubId800 = work.getTblIp9000t1SubId800();
              tableIp9000t1300 = work.getTableIp9000t1300();
//  IF 800-TBL-IP9000T1-SUB-ID EQUAL SPACES AND IP00002-TABLE-ID-INFO ( IP00002-TABLE-0-IDX ) EQUAL 300-TABLE-IP9000T1
              if (        ( allSpaces(tblIp9000t1SubId800)   ) && 		compareChars(ip00002Table0Data.getIp00002Table0Entry(ip00002Table0Idx - 1).getIp00002TableIdData().getIp00002TableIdInfo(),tableIp9000t1300) == 0 ) { 
//  MOVE IP00002-TBL-SUB-ID ( IP00002-TABLE-0-IDX ) TO 800-TBL-IP9000T1-SUB-ID
                  work.setTblIp9000t1SubId800(ip00002Table0Data.getIp00002Table0Entry(ip00002Table0Idx - 1).getIp00002TableIdData().getIp00002TblSubId());
              }
  
//  ADD 1 TO 400-RECORDS-COUNT
              work.setRecordsCount400(work.getRecordsCount400()+(long)1);
          }
      
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
      private void dateConversion() throws Exception {
			// Declare local variables used in the method
			Ip67002Ccyyddd ip67002Ccyyddd = ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph converts the effective date from julian format  *
// * to gregorian format.                                           *
// *----------------------------------------------------------------*
//  MOVE IP0201-EFFECTIVE-DATE TO IP67002-YYDDD
          ip67002Ccyyddd.getIp67002Yyddd().setString(ip0201ReducedFileFormat.getIp0201EffectiveDate());
  
//  SET 88-IP67002-CONVERT-FROM-JULIAN TO TRUE
          ip67002DateParm.setIp67002ConvertFromJulian88True(); 
          
//  CALL 800-PTR-IP670010
          // CALL 800-PTR-IP670010
          	this.setRc( ip670010.process());
//  IF RETURN-CODE EQUAL ZERO
          if (	( getRc() == 0 )) { 
//  MOVE IP67002-DATE TO IP5000-EFFECTIVE-DATE (1 : 8)
              ip5000ParameterMasterRec.setIp5000EffectiveDate(replace(ip5000ParameterMasterRec.getIp5000EffectiveDate(),String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray(),0,8));
//  MOVE IP0201-EFFECTIVE-HOUR TO IP5000-EFFECTIVE-DATE (9 : 2)
              ip5000ParameterMasterRec.replace(ip0201ReducedFileFormat/*parent*/,5/*fromOffset - (ip5000EffectiveDate) */,2/*fromLen*/,0+9 - 1/*toOffset - (ip0201EffectiveHour) */,2/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE IP0201-EFFECTIVE-DATE TO 600-INVALID-JULIAN-DATE
              inavalidDateMsg600.setInvalidJulianDate600(ip0201ReducedFileFormat.getIp0201EffectiveDate());
//  MOVE 300-PARA-2220 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2220300());
//  MOVE 300-INVALID-DATE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getInvalidDate300());
              // MOVE 600-INAVALID-DATE-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(inavalidDateMsg600.toCharArray());
              // MOVE 12 TO 300-COND-CODE
              endOfStepMsg300.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void tableIdConversion() throws Exception {
			// Declare local variables used in the method
			Ip5000ParameterMasterData ip5000ParameterMasterData = ip5000ParameterMasterRec.getIp5000ParameterMasterData();
			boolean keepSearching = true;
			char[] ip0201TblSubId = null;
			char[] tableIp0040t1300 = null;
			char[] tableIp0041t1300 = null;
			char[] tableIp9000t1300 = null;
			char[] tableIp0090t1300 = null;
			char[] tableIp0091t1300 = null;
			Ip5000TableId ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph populates the table data and table id for       *
// * tables other than table zero.                                  *
// *----------------------------------------------------------------*
//  MOVE ZERO TO 800-DATA-LENGTH
          work.setDataLength800(0);
//  SUBTRACT 300-VALUE-11 FROM 800-SYS001-RDW-IN GIVING 800-DATA-LENGTH
          work.setDataLength800(Math.abs(work.getSys001RdwIn800()-(int) work.getValue11300()));
//  MOVE IP0201-TABLE-DATA (1 : 800-DATA-LENGTH ) TO IP5000-TABLE-DATA (1 : 800-DATA-LENGTH )
          ip5000ParameterMasterRec.replace(ip0201ReducedFileFormat/*parent*/,11/*fromOffset - (ip5000TableData) */,(int) work.getDataLength800()/*fromLen*/,19/*toOffset - (ip0201TableData) */,(int) work.getDataLength800()/*toLen*/);
//  MOVE IP0201-ACTION-CODE TO IP5000-ACTION-CODE
          ip5000ParameterMasterRec.setIp5000ActionCode(ip0201ReducedFileFormat.getIp0201ActionCode());
//  ADD 800-EXPANDED-LENGTH TO 800-DATA-LENGTH GIVING 800-SYS200-RDW-OUT
          work.setSys200RdwOut800(work.getDataLength800()+work.getExpandedLength800());
//  SET IP00002-TABLE-0-IDX TO 1
          ip00002Table0Idx = 1; 
          
          ip0201TblSubId = ip0201ReducedFileFormat.getIp0201TblSubId();
//  SEARCH IP00002-TABLE-0-ENTRY
          keepSearching = true;
          if(work.getIp00002Table0Entries() == 0){ 
          keepSearching = false; 
          }
          while(keepSearching) {
          	if  (		compareChars(ip00002Table0Data.getIp00002Table0Entry(ip00002Table0Idx - 1).getIp00002TableIdData().getIp00002TblSubId(),ip0201TblSubId) == 0 ) { 
//  MOVE IP00002-TABLE-ID-INFO ( IP00002-TABLE-0-IDX ) TO IP5000-TABLE-ID
              ip5000ParameterMasterData.getIp5000TableId().setString(ip00002Table0Data.getIp00002Table0Entry(ip00002Table0Idx - 1).getIp00002TableIdData().getIp00002TableIdInfo());
  
          	break;
          	}
          	ip00002Table0Idx++;
          	if (ip00002Table0Idx > work.getIp00002Table0Entries()) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  PERFORM 2231-DISPLAY-MISSING-MSG
              displayMissingMsg();/*2231-DISPLAY-MISSING-MSG*/
          	}
  
          ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
          tableIp0040t1300 = work.getTableIp0040t1300();
          tableIp0041t1300 = work.getTableIp0041t1300();
          tableIp9000t1300 = work.getTableIp9000t1300();
//  IF IP5000-TABLE-ID = 300-TABLE-IP0040T1 OR 300-TABLE-IP0041T1 OR 300-TABLE-IP9000T1
          if (		compareChars(ip5000TableId,tableIp0040t1300) == 0  || 		compareChars(ip5000TableId,tableIp0041t1300) == 0  || 		compareChars(ip5000TableId,tableIp9000t1300) == 0 ) { 
//  PERFORM 2232-CALCULATE-NEW-RDW
              calculateNewRdw();/*2232-CALCULATE-NEW-RDW*/
          }
  
          tableIp0090t1300 = work.getTableIp0090t1300();
          ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
//  IF IP5000-TABLE-ID = 300-TABLE-IP0090T1
          if (		compareChars(ip5000TableId,tableIp0090t1300) == 0 ) { 
//  MOVE IP00002-TABLE-KEY-LNGTH ( IP00002-TABLE-0-IDX ) TO 800-TABLE-90-KEY-LNGTH
              work.setTable90KeyLngth800(ip00002Table0Data.getIp00002Table0Entry(ip00002Table0Idx - 1).getIp00002TableIdData().getIp00002TableKeyLngth());
          }
  
          tableIp0091t1300 = work.getTableIp0091t1300();
          ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
//  IF IP5000-TABLE-ID = 300-TABLE-IP0091T1
          if (		compareChars(ip5000TableId,tableIp0091t1300) == 0 ) { 
//  MOVE IP00002-TABLE-KEY-LNGTH ( IP00002-TABLE-0-IDX ) TO 800-TABLE-91-KEY-LNGTH
              work.setTable91KeyLngth800(ip00002Table0Data.getIp00002Table0Entry(ip00002Table0Idx - 1).getIp00002TableIdData().getIp00002TableKeyLngth());
          }
  
      
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
      private void displayMissingMsg() throws Exception {
      
// * Corresponding table zero entry.                                *
// *----------------------------------------------------------------*
//  MOVE IP0201-TBL-SUB-ID TO 600-3009-TAB-SUB-ID
          ip6063009600.setTabSubId6003009(ip0201ReducedFileFormat.getIp0201TblSubId());
//  MOVE 300-PARA-2231 TO 900-ABEND-PARA
          abendParaName900.setAbendPara900(work.getPara2231300());
//  MOVE 300-TBL-SUB-ID-NOT-FOUND TO 900-ABEND-CODE
          abendMessage900.setAbendCode900(work.getTblSubIdNotFound300());
          // MOVE 600-IP606-3009 TO 900-ABEND-TEXT
          abendMessage900.setAbendText900(ip6063009600.toCharArray());
          // MOVE 12 TO 300-COND-CODE
          endOfStepMsg300.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
          terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          ;
      
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
      private void calculateNewRdw() throws Exception {
			// Declare local variables used in the method
			Ip5000ParameterMasterData ip5000ParameterMasterData = ip5000ParameterMasterRec.getIp5000ParameterMasterData();
			Ip5000TableId ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
			char[] tableIp0040t1300 = null;
			char[] tableIp9000t1300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph calculates rdw length.                          *
// *----------------------------------------------------------------*
          ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
          tableIp0040t1300 = work.getTableIp0040t1300();
          tableIp9000t1300 = work.getTableIp9000t1300();
//  IF ( IP5000-TABLE-ID = 300-TABLE-IP0040T1 OR IP5000-TABLE-ID = 300-TABLE-IP9000T1 )
          if ((		compareChars(ip5000TableId,tableIp0040t1300) == 0  || 		compareChars(ip5000TableId,tableIp9000t1300) == 0 )) { 
//  INITIALIZE IP0040-AR-MASTER
              ip0040ArMaster.initialize();
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP0040-AR-MASTER (1 : 800-SYS200-RDW-OUT )
              ip0040ArMaster.replace(ip5000ParameterMasterRec.getCharArray(),0,ip5000ParameterMasterRec.length(),0,(int) work.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-TABLE-40-LENGTH TO 800-SYS200-RDW-OUT
              work.setSys200RdwOut800((int) work.getTable40Length800());
//  MOVE IP0040-AR-MASTER TO IP5000-PARAMETER-MASTER-REC (1 : 800-SYS200-RDW-OUT )
              ip5000ParameterMasterRec.replace(ip0040ArMaster.getCharArray(),0,ip0040ArMaster.length(),0,(int) work.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
  
//  ELSE
          else { 
//  INITIALIZE IP0041-BIN-TABLE
              ip0041BinTable.initialize();
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP0041-BIN-TABLE (1 : 800-SYS200-RDW-OUT )
              ip0041BinTable.replace(ip5000ParameterMasterRec.getCharArray(),0,ip5000ParameterMasterRec.length(),0,(int) work.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
      
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
      private void specialProcessing() throws Exception {
			// Declare local variables used in the method
			Ip5000ParameterMasterData ip5000ParameterMasterData = ip5000ParameterMasterRec.getIp5000ParameterMasterData();
			Ip5000TableId ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
			char[] tableIp0091t1300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph performs the conversion based on table-id.      *
// *----------------------------------------------------------------*
//  ADD 1 TO 400-RECORDS-COUNT
          work.setRecordsCount400(work.getRecordsCount400()+(long)1);
          tableIp0091t1300 = work.getTableIp0091t1300();
          ip5000TableId = ip5000ParameterMasterData.getIp5000TableId();
//  EVALUATE IP5000-TABLE-ID
          if  (		compareChars(ip5000TableId,work.getTableIp0036t1300()) == 0 ) { 
//  PERFORM 2241-STORE-TABLE36
              storeTable36();/*2241-STORE-TABLE36*/
          }
          else if  (		compareChars(ip5000TableId,work.getTableIp0040t1300()) == 0 ) { 
//  PERFORM 2242-BUILD-TABLE90-DFLTS
              buildTable90Dflts();/*2242-BUILD-TABLE90-DFLTS*/
          }
          else if  (		compareChars(ip5000TableId,work.getTableIp0041t1300()) == 0 ) { 
//  PERFORM 2243-BUILD-TABLE91-DFLTS
              buildTable91Dflts();/*2243-BUILD-TABLE91-DFLTS*/
          }
          else if  (		compareChars(ip5000TableId,work.getTableIp0090t1300()) == 0 ) { 
//  PERFORM 2244-BUILD-TABLE90
              buildTable90();/*2244-BUILD-TABLE90*/
          }
          else if  (		compareChars(ip5000TableId,tableIp0091t1300) == 0 ) { 
//  PERFORM 2245-BUILD-TABLE91
              buildTable91();/*2245-BUILD-TABLE91*/
          }
  
      
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
      private void storeTable36() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph sets the switch to build the defualt agreement  *
// * stores all the table 36 records in internal table. this table  *
// * will be used by table 40 and 41 records to build table 90 and  *
// * 91 records.                                                    *
// *----------------------------------------------------------------*
          // MOVE IP5000-PARAMETER-MASTER-REC TO IP00361-DEFAULT-BS-AGRMTS
          ip00361DefaultBsAgrmts.setString(ip5000ParameterMasterRec.getCharArray());
//  SET 88-100-BUILD-DFLT-AGRMNT TO TRUE
          work.setBuildDfltAgrmnt88100True(); 
          
//  ADD 1 TO 400-TABLE36-BSL-SUB
          work.setTable36BslSub400(work.getTable36BslSub400()+(long)1);
//  MOVE IP00361-TABLE-DATA TO 600-TABLE36-BSL ( 400-TABLE36-BSL-SUB )
          bussServDftls600.setTable36Bsl600(((int) work.getTable36BslSub400() - 1),ip00361DefaultBsAgrmts.getIp00361TableData());
//  SET 88-100-DO-NOT-WRITE TO TRUE
          work.setDoNotWrite88100True(); 
          
      
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
      private void _10OpenTempFiles() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the temp files for table90 and table91.   *
// *----------------------------------------------------------------*
//  OPEN OUTPUT SYS105-TEMP-TABLE90 OUTPUT SYS106-TEMP-TABLE91
          sys105TempTable90.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys105TempTable90.getFileName(),sys105TempTable90.getSys105TempTable90CharSet(),sys105TempTable90.getSys105TempTable90CrlfFlag());
          work.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
          sys106TempTable91.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys106TempTable91.getFileName(),sys106TempTable91.getSys106TempTable91CharSet(),sys106TempTable91.getSys106TempTable91CrlfFlag());
          work.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(work.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-2241-10 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara224110300());
//  MOVE 300-OPEN-SYS105-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(work.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-2241-10 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara224110300());
//  MOVE 300-OPEN-SYS106-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void buildTable90Dflts() throws Exception {
			// Declare local variables used in the method
			Ip0040TableDataFields ip0040TableDataFields = ip0040ArMaster.getIp0040TableData().getIp0040PreEditFields().getIp0040TableDataFields();
			Ip0040RegionSubreg ip0040RegionSubreg = ip0040ArMaster.getIp0040TableData().getIp0040PreEditFields().getIp0040TableDataFields().getIp0040RegionSubreg();
			char[] ip0040Region = null;
			char[] ip0040Ab = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph checks if its required to build the default     *
// * agreements, if yes builds the default agreement for table90.   *
// *----------------------------------------------------------------*
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM VARYING 400-SUB FROM 1 BY 1 UNTIL 400-SUB > 400-TABLE36-BSL-SUB
              for (work.setSub400(1); (	( work.getSub400() <= work.getTable36BslSub400() )) ; work.setSub400((int) work.getSub400() + 1) ) {
                  ip0040Region = ip0040RegionSubreg.getIp0040Region();
                  ip0040Ab = ip0040TableDataFields.getIp0040Ab();
//  IF 600-TO-REGION ( 400-SUB ) = IP0040-REGION AND 600-ACC-BRAND ( 400-SUB ) = IP0040-AB
                  if (		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getToRegion600(),ip0040Region) == 0  && 		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getAccBrand600(),ip0040Ab) == 0 ) { 
//  ADD 1 TO 400-90BSL-1-BUILD-COUNTER
                      work.setBsl1BuildCounter40090(work.getBsl1BuildCounter40090()+(long)1);
//  PERFORM 2242-10-MOVE-TO-90-LAYOUT
                      _10MoveTo90Layout();/*2242-10-MOVE-TO-90-LAYOUT*/
                  }
  
                  ip0040Region = ip0040RegionSubreg.getIp0040Region();
                  ip0040Ab = ip0040TableDataFields.getIp0040Ab();
//  IF 600-REGION ( 400-SUB ) = IP0040-REGION AND 600-ACC-BRAND ( 400-SUB ) = IP0040-AB
                  if (		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getRegion600(),ip0040Region) == 0  && 		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getAccBrand600(),ip0040Ab) == 0 ) { 
//  ADD 1 TO 400-90BSL-2-BUILD-COUNTER
                      work.setBsl2BuildCounter40090(work.getBsl2BuildCounter40090()+(long)1);
//  PERFORM 2242-10-MOVE-TO-90-LAYOUT
                      _10MoveTo90Layout();/*2242-10-MOVE-TO-90-LAYOUT*/
                  }
  
              }
          }
      
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
      private void _10MoveTo90Layout() throws Exception {
			// Declare local variables used in the method
			Ip00901ParameterMasterData ip00901ParameterMasterData = ip00901BsArMaster.getIp00901ParameterMasterData();
			Ip0040TableDataKey ip0040TableDataKey = ip0040ArMaster.getIp0040TableData().getIp0040PreEditFields().getIp0040TableDataKey();
			Ip00901TableData ip00901TableData = ip00901BsArMaster.getIp00901TableData();
			Ip0040TableDataFields ip0040TableDataFields = ip0040ArMaster.getIp0040TableData().getIp0040PreEditFields().getIp0040TableDataFields();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph moves variables to table 90 layout and write the
// * record to temp file.
// *----------------------------------------------------------------*
//  INITIALIZE IP00901-BS-AR-MASTER
          ip00901BsArMaster.initialize();
//  ADD 1 TO 400-DEFAULTS-BUILD
          work.setDefaultsBuild400(work.getDefaultsBuild400()+(long)1);
//  MOVE IP5000-EFFECTIVE-DATE TO IP00901-EFFECTIVE-DATE
          ip00901BsArMaster.setIp00901EffectiveDate(ip5000ParameterMasterRec.getIp5000EffectiveDate());
//  MOVE IP5000-ACTION-CODE TO IP00901-ACTIVE-INACTIVE
          ip00901BsArMaster.setIp00901ActiveInactive(ip5000ParameterMasterRec.getIp5000ActionCode());
//  MOVE 300-TABLE-IP0090T1 TO IP00901-TABLE-ID
          ip00901ParameterMasterData.getIp00901TableId().setString(work.getTableIp0090t1300());
  
//  MOVE IP0040-ACC-RANGE-L TO IP00901-BS-ACC-RNG-L
          ip00901TableData.setIp00901BsAccRngL(ip0040TableDataKey.getIp0040AccRangeL());
  
//  MOVE IP0040-AB TO IP00901-BS-AR-ACC-BRAND
          ip00901TableData.setIp00901BsArAccBrand(ip0040TableDataFields.getIp0040Ab());
  
//  MOVE IP0040-ACC-RANGE-H TO IP00901-BS-ACC-RNG-H
          ip00901TableData.setIp00901BsAccRngH(ip0040TableDataFields.getIp0040AccRangeH());
  
//  MOVE IP0040-PRIORITY-CODE TO IP00901-BS-AR-AB-PRIORITY
          ip00901TableData.setIp00901BsArAbPriority(ip0040TableDataFields.getIp0040PriorityCode());
  
//  MOVE 600-BUS-SRV-LVL ( 400-SUB ) TO IP00901-BS-AR-BUS-SRV-LVL
          ip00901TableData.setIp00901BsArBusSrvLvl(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBusSrvLvl600());
  
//  MOVE 600-BUS-SRV-ID ( 400-SUB ) TO IP00901-BS-AR-BUS-SRV-ID
          ip00901TableData.setIp00901BsArBusSrvId(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBusSrvId600());
  
//  MOVE 600-BS-PRIORITY ( 400-SUB ) TO IP00901-BS-AR-BS-PRIORITY
          ip00901TableData.setIp00901BsArBsPriority(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBsPriority600());
  
//  MOVE 600-BS-LIFECYL-IND ( 400-SUB ) TO IP00901-BS-AR-LIFECYL-IND
          ip00901TableData.setIp00901BsArLifecylInd(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBsLifecylInd600());
  
//  MOVE 600-BS-BSSE-CD ( 400-SUB ) TO IP00901-BS-AR-BSSE-CD
          ip00901TableData.setIp00901BsArBsseCd(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBsBsseCd600());
  
//  MOVE LENGTH OF IP00901-BS-AR-MASTER TO 800-TEMP-TBL90-RDW
          work.setTempTbl90Rdw800(Ip00901BsArMaster.getIp00901BsArMasterFieldLength());
//  PERFORM 8100-WRITE-90-DFLT-TO-TEMP
          write90DfltToTemp();/*8100-WRITE-90-DFLT-TO-TEMP*/
          ;
      
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
      private void buildTable91Dflts() throws Exception {
			// Declare local variables used in the method
			Ip0041TableData ip0041TableData = ip0041BinTable.getIp0041TableData();
			Ip0041RegionTable ip0041RegionTable = ip0041BinTable.getIp0041TableData().getIp0041RegionTable();
			char[] ip0041Ab = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph checks if its required to build the default     *
// * agreements, if yes builds the default agreement for table91.   *
// *----------------------------------------------------------------*
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  PERFORM VARYING 400-SUB FROM 1 BY 1 UNTIL 400-SUB > 400-TABLE36-BSL-SUB
              for (work.setSub400(1); (	( work.getSub400() <= work.getTable36BslSub400() )) ; work.setSub400((int) work.getSub400() + 1) ) {
//  PERFORM VARYING 400-SUB1 FROM 1 BY 1 UNTIL 400-SUB1 > 400-REGION-MAX OR IP0041-REGION ( 400-SUB1 ) = SPACES
                  for (work.setSub1400(1); (	( work.getSub1400() <= work.getRegionMax400() )  &&         ( !allSpaces(ip0041RegionTable.getIp0041Region((int) work.getSub1400() - 1))  )) ; work.setSub1400((int) work.getSub1400() + 1) ) {
                      ip0041Ab = ip0041TableData.getIp0041Ab();
//  IF 600-FROM-REGION ( 400-SUB ) = IP0041-REGION ( 400-SUB1 ) AND 600-ACC-BRAND ( 400-SUB ) = IP0041-AB
                      if (		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getFromRegion600(),ip0041RegionTable.getIp0041Region((int) work.getSub1400() - 1)) == 0  && 		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getAccBrand600(),ip0041Ab) == 0 ) { 
//  ADD 1 TO 400-91BSL-1-BUILD-COUNTER
                          work.setBsl1BuildCounter40091(work.getBsl1BuildCounter40091()+(long)1);
//  PERFORM 2243-10-MOVE-TO-91-LAYOUT
                          _10MoveTo91Layout();/*2243-10-MOVE-TO-91-LAYOUT*/
                      }
  
                      ip0041Ab = ip0041TableData.getIp0041Ab();
//  IF 600-REGION ( 400-SUB ) = IP0041-REGION ( 400-SUB1 ) AND 600-ACC-BRAND ( 400-SUB ) = IP0041-AB
                      if (		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getRegion600(),ip0041RegionTable.getIp0041Region((int) work.getSub1400() - 1)) == 0  && 		compareChars(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getAccBrand600(),ip0041Ab) == 0 ) { 
//  ADD 1 TO 400-91BSL-2-BUILD-COUNTER
                          work.setBsl2BuildCounter40091(work.getBsl2BuildCounter40091()+(long)1);
//  PERFORM 2243-10-MOVE-TO-91-LAYOUT
                          _10MoveTo91Layout();/*2243-10-MOVE-TO-91-LAYOUT*/
                      }
  
                  }
  
              }
          }
      
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
      private void _10MoveTo91Layout() throws Exception {
			// Declare local variables used in the method
			Ip00911ParameterMasterData ip00911ParameterMasterData = ip00911BsBinMaster.getIp00911ParameterMasterData();
			Ip0041TableData ip0041TableData = ip0041BinTable.getIp0041TableData();
			Ip00911TableData ip00911TableData = ip00911BsBinMaster.getIp00911TableData();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph moves variables to table 91 layout and write the
// * record to temp file.
// *----------------------------------------------------------------*
//  INITIALIZE IP00911-BS-BIN-MASTER
          ip00911BsBinMaster.initialize();
//  ADD 1 TO 400-DEFAULTS-BUILD
          work.setDefaultsBuild400(work.getDefaultsBuild400()+(long)1);
//  MOVE IP5000-EFFECTIVE-DATE TO IP00911-EFFECTIVE-DATE
          ip00911BsBinMaster.setIp00911EffectiveDate(ip5000ParameterMasterRec.getIp5000EffectiveDate());
//  MOVE IP5000-ACTION-CODE TO IP00911-ACTIVE-INACTIVE
          ip00911BsBinMaster.setIp00911ActiveInactive(ip5000ParameterMasterRec.getIp5000ActionCode());
//  MOVE 300-TABLE-IP0091T1 TO IP00911-TABLE-ID
          ip00911ParameterMasterData.getIp00911TableId().setString(work.getTableIp0091t1300());
  
          // MOVE IP0041-BIN TO IP00911-BS-BIN
          ip00911BsBinMaster.getIp00911TableData().setIp00911BsBin(ip0041BinTable.getIp0041TableData().getIp0041Bin());
  
//  MOVE IP0041-AB TO IP00911-BS-BIN-ACC-BRAND
          ip00911TableData.setIp00911BsBinAccBrand(ip0041TableData.getIp0041Ab());
  
//  MOVE 600-BUS-SRV-LVL ( 400-SUB ) TO IP00911-BS-BIN-BUS-SRV-LVL
          ip00911TableData.setIp00911BsBinBusSrvLvl(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBusSrvLvl600());
  
//  MOVE 600-BUS-SRV-ID ( 400-SUB ) TO IP00911-BS-BIN-BUS-SRV-ID
          ip00911TableData.setIp00911BsBinBusSrvId(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBusSrvId600());
  
//  MOVE 600-BS-PRIORITY ( 400-SUB ) TO IP00911-BS-BIN-BS-PRIORITY
          ip00911TableData.setIp00911BsBinBsPriority(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBsPriority600());
  
//  MOVE 600-BS-LIFECYL-IND ( 400-SUB ) TO IP00911-BS-BIN-LIFECYL-IND
          ip00911TableData.setIp00911BsBinLifecylInd(bussServDftls600.getTable36Bsl600((int) work.getSub400() - 1).getBsLifecylInd600());
  
//  MOVE LENGTH OF IP00911-BS-BIN-MASTER TO 800-TEMP-TBL91-RDW
          work.setTempTbl91Rdw800(Ip00911BsBinMaster.getIp00911BsBinMasterFieldLength());
//  PERFORM 8250-WRITE-91-DFLT-TO-TEMP
          write91DfltToTemp();/*8250-WRITE-91-DFLT-TO-TEMP*/
          ;
      
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
      private void buildTable90() throws Exception {
      
// *----------------------------------------------------------------*
// * This para writes the original record to temp file if build dflt
// * agreement switch is set.
// *----------------------------------------------------------------*
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  SET 88-100-DO-NOT-WRITE TO TRUE
              work.setDoNotWrite88100True(); 
              
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP00901-BS-AR-MASTER (1 : 800-SYS200-RDW-OUT )
              ip00901BsArMaster.replace(ip5000ParameterMasterRec.getCharArray(),0,ip5000ParameterMasterRec.length(),0,(int) work.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-SYS200-RDW-OUT TO 800-TEMP-TBL90-RDW
              work.setTempTbl90Rdw800(work.getSys200RdwOut800());
//  PERFORM 8100-WRITE-90-DFLT-TO-TEMP
              write90DfltToTemp();/*8100-WRITE-90-DFLT-TO-TEMP*/
          }
//  ELSE
      
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
      private void buildTable91() throws Exception {
      
// *----------------------------------------------------------------*
// * This para writes the original record to temp file if build dflt
// * agreement switch is set.
// *----------------------------------------------------------------*
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  SET 88-100-DO-NOT-WRITE TO TRUE
              work.setDoNotWrite88100True(); 
              
//  MOVE IP5000-PARAMETER-MASTER-REC TO IP00911-BS-BIN-MASTER (1 : 800-SYS200-RDW-OUT )
              ip00911BsBinMaster.replace(ip5000ParameterMasterRec.getCharArray(),0,ip5000ParameterMasterRec.length(),0,(int) work.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-SYS200-RDW-OUT TO 800-TEMP-TBL91-RDW
              work.setTempTbl91Rdw800(work.getSys200RdwOut800());
//  PERFORM 8250-WRITE-91-DFLT-TO-TEMP
              write91DfltToTemp();/*8250-WRITE-91-DFLT-TO-TEMP*/
          }
//  ELSE
      
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
      private void endOfJob() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph close the input and output file.                *
// *----------------------------------------------------------------*
//  PERFORM 8300-CLOSE-SYS001
          closeSys001();/*8300-CLOSE-SYS001*/
//  CLOSE SYS200-EXPANDED-PARM-MASTER
          sys200ExpandedParmMaster.close(); 
          work.setOutputFileStatus200(sys200ExpandedParmMaster.getStatusString() );
//  IF 88-200-SYS200-STATUS-GOOD
//  ELSE
          if (!(work.isSys200StatusGood88200()) ) { 
//  MOVE 300-SYS200-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys200File300());
//  MOVE 200-OUTPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getOutputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-3000 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3000300());
//  MOVE 300-CLOSE-SYS200-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseSys200File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void printCounts() throws Exception {
      
// *----------------------------------------------------------------*
// * Displays the counts                                            *
// *----------------------------------------------------------------*
//  IF 88-100-BUILD-DFLT-AGRMNT
          if ( work.isBuildDfltAgrmnt88100()  ) { 
//  MOVE 400-TABLE36-BSL-SUB TO 600-TABLE36-BSL-SUB
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              table36LoadMessage600.setTable36BslSub600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getTable36BslSub400()).toCharArray()));
//  MOVE 400-90BSL-1-BUILD-COUNTER TO 600-90BSL-1-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              tbl90DfltBsl1Msg600.setBsl1BuildCount60090(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getBsl1BuildCounter40090()).toCharArray()));
//  MOVE 400-90BSL-2-BUILD-COUNTER TO 600-90BSL-2-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              tbl90DfltBsl2Msg600.setBsl2BuildCount60090(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getBsl2BuildCounter40090()).toCharArray()));
//  MOVE 400-91BSL-1-BUILD-COUNTER TO 600-91BSL-1-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              tbl91DfltBsl1Msg600.setBsl1BuildCount60091(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getBsl1BuildCounter40091()).toCharArray()));
//  MOVE 400-91BSL-2-BUILD-COUNTER TO 600-91BSL-2-BUILD-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              tbl91DfltBsl2Msg600.setBsl2BuildCount60091(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getBsl2BuildCounter40091()).toCharArray()));
//  MOVE 400-DEFAULTS-BUILD TO 600-DEFAULTS-BUILD
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              totalDefaultsMsg600.setDefaultsBuild600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getDefaultsBuild400()).toCharArray()));
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  DISPLAY 600-STATS-MESSAGE
              logger.info(new String(work.getStatsMessage600())); 
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  DISPLAY 600-TABLE36-LOAD-MESSAGE
              logger.info(table36LoadMessage600.toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  DISPLAY 600-TBL90-DFLT-BSL1-MSG
              logger.info(tbl90DfltBsl1Msg600.toString()); 
//  DISPLAY 600-TBL90-DFLT-BSL2-MSG
              logger.info(tbl90DfltBsl2Msg600.toString()); 
//  DISPLAY 600-TBL91-DFLT-BSL1-MSG
              logger.info(tbl91DfltBsl1Msg600.toString()); 
//  DISPLAY 600-TBL91-DFLT-BSL2-MSG
              logger.info(tbl91DfltBsl2Msg600.toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  DISPLAY 600-TOTAL-DEFAULTS-MSG
              logger.info(totalDefaultsMsg600.toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  DISPLAY 600-TBL90-ORIGINAL-TRLR-MSG
              logger.info(tbl90OriginalTrlrMsg600.toString()); 
//  DISPLAY 600-TBL90-UPDATED-TRLR-MSG
              logger.info(tbl90UpdatedTrlrMsg600.toString()); 
//  DISPLAY 600-TBL91-ORIGINAL-TRLR-MSG
              logger.info(tbl91OriginalTrlrMsg600.toString()); 
//  DISPLAY 600-TBL91-UPDATED-TRLR-MSG
              logger.info(tbl91UpdatedTrlrMsg600.toString()); 
//  DISPLAY 600-FINAL-ORIGINAL-TRLR-MSG
              logger.info(finalOriginalTrlrMsg600.toString()); 
//  DISPLAY 600-FINAL-UPDATED-TRLR-MSG
              logger.info(finalUpdatedTrlrMsg600.toString()); 
//  DISPLAY 600-SPACE
              logger.info(new String(work.getSpace600())); 
//  MOVE 400-RECS-READ TO 300-SYS001-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              sys001Read300.setSys001Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getRecsRead400()).toCharArray()));
//  MOVE 400-RECS-WRITTEN TO 300-SYS200-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              sys200Written300.setSys200Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getRecsWritten400()).toCharArray()));
//  DISPLAY 300-SYS001-READ
              logger.info(sys001Read300.toString()); 
//  DISPLAY 300-SYS200-WRITTEN
              logger.info(sys200Written300.toString()); 
//  DISPLAY 300-END-OF-STEP-MSG
              logger.info(endOfStepMsg300.toString()); 
          }
//  ELSE
          else { 
//  MOVE 400-RECS-READ TO 300-SYS001-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              sys001Read300.setSys001Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getRecsRead400()).toCharArray()));
//  MOVE 400-RECS-WRITTEN TO 300-SYS200-REC
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              sys200Written300.setSys200Rec300(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getRecsWritten400()).toCharArray()));
//  DISPLAY 300-SYS001-READ
              logger.info(sys001Read300.toString()); 
//  DISPLAY 300-SYS200-WRITTEN
              logger.info(sys200Written300.toString()); 
//  DISPLAY 300-END-OF-STEP-MSG
              logger.info(endOfStepMsg300.toString()); 
          }
      
      }
      /**
      * sortTheTempFile 
      *   This method is derived from 
  *   COBOL Paragraph - 7000-SORT-THE-TEMP-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void sortTheTempFile() throws Exception {
			// Declare local variables used in the method
			SortRec1 sortRec1 = sortRec.getSortRec1();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para sorts the temp file and write the sorted records to
// * output file.
// *----------------------------------------------------------------*
//  SORT SORT-FILE ON ASCENDING KEY SORT1-TABLE-ID ASCENDING KEY SORT1-KEY DESCENDING KEY SORT1-TABLE-EFF-DATE INPUT PROCEDURE IS 7100-FORMAT-SORT-REC OUTPUT PROCEDURE IS 7400-FORMAT-OP-REC
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
                formatSortRec();
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
                formatOpRec();
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
      private void formatSortRec() throws Exception {
			// Declare local variables used in the method
			char[] updateTrailerTable1200 = null;
			char[] tableIp0090t1300 = null;
			char[] tableIp0091t1300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * Format sort record
// *----------------------------------------------------------------*
          tableIp0090t1300 = work.getTableIp0090t1300();
          updateTrailerTable1200 = updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerTable1200();
//  IF 200-UPDATE-TRAILER-TABLE1 = 300-TABLE-IP0090T1
          if (		compareChars(updateTrailerTable1200,tableIp0090t1300) == 0 ) { 
//  PERFORM 8600-OPEN-TEMP90-FILE
              openTemp90File();/*8600-OPEN-TEMP90-FILE*/
//  PERFORM 7500-READ-TEMP90-FILE
              readTemp90File();/*7500-READ-TEMP90-FILE*/
//  PERFORM 7200-READ-RELEASE-TBL90 UNTIL 88-200-TEMP90-STATUS-EOF
              while (!(work.isTemp90StatusEof88200()) ) {
                 readReleaseTbl90();/*7200-READ-RELEASE-TBL90*/
              }
          }
  
//  ELSE
          else { 
              tableIp0091t1300 = work.getTableIp0091t1300();
              updateTrailerTable1200 = updateTrailerRecGroup200.getUpdateTrailerRec200Redefined().getUpdateTrailerTable1200();
//  IF 200-UPDATE-TRAILER-TABLE1 = 300-TABLE-IP0091T1
              if (		compareChars(updateTrailerTable1200,tableIp0091t1300) == 0 ) { 
//  PERFORM 8700-OPEN-TEMP91-FILE
                  openTemp91File();/*8700-OPEN-TEMP91-FILE*/
//  PERFORM 7600-READ-TEMP91-FILE
                  readTemp91File();/*7600-READ-TEMP91-FILE*/
//  PERFORM 7300-READ-RELEASE-TBL91 UNTIL 88-200-TEMP91-STATUS-EOF
                  while (!(work.isTemp91StatusEof88200()) ) {
                     readReleaseTbl91();/*7300-READ-RELEASE-TBL91*/
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
      private void readReleaseTbl90() throws Exception {
			// Declare local variables used in the method
			Ip5000ParameterMasterData ip5000ParameterMasterData = ip5000ParameterMasterRec.getIp5000ParameterMasterData();
			SortRec1 sortRec1 = sortRec.getSortRec1();
			 final int SORT_1_KEY_LENGTH = 99;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * Read release record
// *----------------------------------------------------------------*
          // MOVE IP5000-TABLE-ID TO SORT1-TABLE-ID
          sortRec.getSortRec1().setSort1TableId(ip5000ParameterMasterRec.getIp5000ParameterMasterData().getIp5000TableId().toCharArray());
  
//  MOVE IP5000-EFFECTIVE-DATE TO SORT1-TABLE-EFF-DATE
          sortRec1.setSort1TableEffDate(ip5000ParameterMasterRec.getIp5000EffectiveDate());
  

// *----------------------------------------------------------------*
// *Added move to retain action code from the input record          *
// *----------------------------------------------------------------*
//  MOVE IP5000-ACTION-CODE TO SORT1-ACTION-CODE
          sortRec1.setSort1ActionCode(ip5000ParameterMasterRec.getIp5000ActionCode());
  
//  MOVE IP5000-TABLE-DATA (1 : 800-TABLE-90-KEY-LNGTH ) TO SORT1-KEY (1 : 800-TABLE-90-KEY-LNGTH )
          sortRec.replace(ip5000ParameterMasterRec/*parent*/,19/*fromOffset - (sort1Key) */,(int) work.getTable90KeyLngth800()/*fromLen*/,8/*toOffset - (ip5000TableData) */,(int) work.getTable90KeyLngth800()/*toLen*/);
//  MOVE IP5000-TABLE-DATA TO SORT1-TABLE-DATA
          sortRec1.setSort1TableData(ip5000ParameterMasterData.getIp5000TableData());
  
//  MOVE 800-TEMP-TBL90-RDW TO SORT-RDW
          work.setSortRdw(work.getTempTbl90Rdw800());
//  ADD LENGTH OF SORT1-KEY TO SORT-RDW
          work.setSortRdw(work.getSortRdw()+SORT_1_KEY_LENGTH);
//  RELEASE SORT-REC
          if(useSortFileStrategy()) {
          sortFileInternIn.write(sortRec.toCharArray(),(int) work.getSortRdw());
          } else
            addReleaseRecord(sortRec.toCharArray(),(int) work.getSortRdw());
//  PERFORM 7500-READ-TEMP90-FILE
          readTemp90File();/*7500-READ-TEMP90-FILE*/
          ;
      
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
      private void readReleaseTbl91() throws Exception {
			// Declare local variables used in the method
			Ip5000ParameterMasterData ip5000ParameterMasterData = ip5000ParameterMasterRec.getIp5000ParameterMasterData();
			SortRec1 sortRec1 = sortRec.getSortRec1();
			 final int SORT_1_KEY_LENGTH = 99;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * Read release record
// *----------------------------------------------------------------*
          // MOVE IP5000-TABLE-ID TO SORT1-TABLE-ID
          sortRec.getSortRec1().setSort1TableId(ip5000ParameterMasterRec.getIp5000ParameterMasterData().getIp5000TableId().toCharArray());
  
//  MOVE IP5000-EFFECTIVE-DATE TO SORT1-TABLE-EFF-DATE
          sortRec1.setSort1TableEffDate(ip5000ParameterMasterRec.getIp5000EffectiveDate());
  

// *----------------------------------------------------------------*
// *Added move to retain action code from the input record          *
// *----------------------------------------------------------------*
//  MOVE IP5000-ACTION-CODE TO SORT1-ACTION-CODE
          sortRec1.setSort1ActionCode(ip5000ParameterMasterRec.getIp5000ActionCode());
  
//  MOVE IP5000-TABLE-DATA (1 : 800-TABLE-91-KEY-LNGTH ) TO SORT1-KEY (1 : 800-TABLE-91-KEY-LNGTH )
          sortRec.replace(ip5000ParameterMasterRec/*parent*/,19/*fromOffset - (sort1Key) */,(int) work.getTable91KeyLngth800()/*fromLen*/,8/*toOffset - (ip5000TableData) */,(int) work.getTable91KeyLngth800()/*toLen*/);
//  MOVE IP5000-TABLE-DATA TO SORT1-TABLE-DATA
          sortRec1.setSort1TableData(ip5000ParameterMasterData.getIp5000TableData());
  
//  MOVE 800-TEMP-TBL91-RDW TO SORT-RDW
          work.setSortRdw(work.getTempTbl91Rdw800());
//  ADD LENGTH OF SORT1-KEY TO SORT-RDW
          work.setSortRdw(work.getSortRdw()+SORT_1_KEY_LENGTH);
//  RELEASE SORT-REC
          if(useSortFileStrategy()) {
          sortFileInternIn.write(sortRec.toCharArray(),(int) work.getSortRdw());
          } else
            addReleaseRecord(sortRec.toCharArray(),(int) work.getSortRdw());
//  PERFORM 7600-READ-TEMP91-FILE
          readTemp91File();/*7600-READ-TEMP91-FILE*/
          ;
      
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
      private void formatOpRec() throws Exception {
			// Declare local variables used in the method
			 final int SORT_1_KEY_LENGTH = 99;
			SortRec1 sortRec1 = sortRec.getSortRec1();
			Ip5000ParameterMasterData ip5000ParameterMasterData = ip5000ParameterMasterRec.getIp5000ParameterMasterData();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para formats the record.                                  *
// *----------------------------------------------------------------*
          // MOVE 0 TO 400-NO-OF-SORTED-RECS
          work.setNoOfSortedRecs400((long)0);
//  SET 88-100-SORT-EOF-N TO TRUE
          work.setSortEofN88100True(); 
          
//  RETURN SORT-FILE
                if(useSortFileStrategy()) {
                  sortFileInternOut.read();
                  if (!sortFileInternOut.hasEnded()) {
                  	sortRec.setString(sortFileInternOut.getRecord());
                  	work.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             byte[] tmpBytes = getReturnRecord(getRecIndex());
             work.setSortRdw(tmpBytes.length);
             sortRec.setString(tmpBytes); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  SET 88-100-SORT-EOF-Y TO TRUE
                  work.setSortEofY88100True(); 
                  
                }
//  PERFORM UNTIL 88-100-SORT-EOF-Y
          while ((!(work.isSortEofY88100()) )) {
//  ADD 1 TO 400-NO-OF-SORTED-RECS
              work.setNoOfSortedRecs400(work.getNoOfSortedRecs400()+(long)1);
//  MOVE SORT-RDW TO 800-SYS200-RDW-OUT
              work.setSys200RdwOut800(work.getSortRdw());
//  SUBTRACT LENGTH OF SORT1-KEY FROM 800-SYS200-RDW-OUT
              work.setSys200RdwOut800(Math.abs(work.getSys200RdwOut800()-SORT_1_KEY_LENGTH));
//  MOVE SORT1-TABLE-ID TO IP5000-TABLE-ID
              ip5000ParameterMasterData.getIp5000TableId().setString(sortRec1.getSort1TableId());
  
//  MOVE SORT1-TABLE-EFF-DATE TO IP5000-EFFECTIVE-DATE
              ip5000ParameterMasterRec.setIp5000EffectiveDate(sortRec1.getSort1TableEffDate());
  

// *----------------------------------------------------------------*
// *Move the action code to the output record                       *
// *----------------------------------------------------------------*
//  MOVE SORT1-ACTION-CODE TO IP5000-ACTION-CODE
              ip5000ParameterMasterRec.setIp5000ActionCode(sortRec1.getSort1ActionCode());
  
//  SUBTRACT 19 FROM SORT-RDW
              work.setSortRdw(Math.abs(work.getSortRdw()-(long)19));
//  MOVE SORT1-TABLE-DATA TO IP5000-TABLE-DATA (1 : SORT-RDW )
              ip5000ParameterMasterRec.replace(sortRec/*parent*/,118/*fromOffset - (ip5000TableData) */,32634/*fromLen*/,19/*toOffset - (sort1TableData) */,(int) work.getSortRdw()/*toLen*/);
  
//  PERFORM 8200-WRITE-EXPANDED-RECORD
              writeExpandedRecord();/*8200-WRITE-EXPANDED-RECORD*/
//  RETURN SORT-FILE
                    if(useSortFileStrategy()) {
                      sortFileInternOut.read();
                      if (!sortFileInternOut.hasEnded()) {
                      	sortRec.setString(sortFileInternOut.getRecord());
                      	work.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                      }    
                  } else {
              setRecIndex(getRecIndex()+1);
              if (getRecIndex() < sortRecKeys.size() ) { 
                 byte[] tmpBytes = getReturnRecord(getRecIndex());
                 work.setSortRdw(tmpBytes.length);
                 sortRec.setString(tmpBytes); 
              }
              }
//  AT END
                  if (isSortRecordsEnded()) { 
//  SET 88-100-SORT-EOF-Y TO TRUE
                      work.setSortEofY88100True(); 
                      
                    }
          }
      
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
      private void readTemp90File() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file.                           *
// *----------------------------------------------------------------*
//  READ SYS105-TEMP-TABLE90
          	sys105TempTable90.read();
          work.setTempTbl90Rdw800(sys105TempTable90.getRecLen());
          work.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
          if (!sys105TempTable90.hasEnded()) {
          	sys105TempTable90Rec.setString(sys105TempTable90.getRecord());
          }
//  IF 88-200-TEMP90-STATUS-GOOD
          if ( work.isTemp90StatusGood88200()  ) { 
//  MOVE SYS105-TEMP-TABLE90-REC TO IP5000-PARAMETER-MASTER-REC (1 : 800-TEMP-TBL90-RDW )
              ip5000ParameterMasterRec.replace(sys105TempTable90Rec.getCharArray(),0,sys105TempTable90Rec.length(),0,(int) work.getTempTbl90Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
//  ELSE
          else { 
//  IF 88-200-TEMP90-STATUS-EOF
//  ELSE
              if (!(work.isTemp90StatusEof88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
                  ioError600.setFileName600(work.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
                  ioError600.setBadIoStatusCode600(pad(4,work.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-7500 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara7500300());
//  MOVE 300-READ-SYS105-FILE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(work.getReadSys105File300());
                  // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError();/*9000-TERMINATE-ON-ERROR*/
              }
          }
      
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
      private void readTemp91File() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file.                           *
// *----------------------------------------------------------------*
//  READ SYS106-TEMP-TABLE91
          	sys106TempTable91.read();
          work.setTempTbl91Rdw800(sys106TempTable91.getRecLen());
          work.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
          if (!sys106TempTable91.hasEnded()) {
          	sys106TempTable91Rec.setString(sys106TempTable91.getRecord());
          }
//  IF 88-200-TEMP91-STATUS-GOOD
          if ( work.isTemp91StatusGood88200()  ) { 
//  MOVE SYS106-TEMP-TABLE91-REC TO IP5000-PARAMETER-MASTER-REC (1 : 800-TEMP-TBL91-RDW )
              ip5000ParameterMasterRec.replace(sys106TempTable91Rec.getCharArray(),0,sys106TempTable91Rec.length(),0,(int) work.getTempTbl91Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
//  ELSE
          else { 
//  IF 88-200-TEMP91-STATUS-EOF
//  ELSE
              if (!(work.isTemp91StatusEof88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
                  ioError600.setFileName600(work.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
                  ioError600.setBadIoStatusCode600(pad(4,work.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-7600 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara7600300());
//  MOVE 300-OPEN-SYS106-FILE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(work.getOpenSys106File300());
                  // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError();/*9000-TERMINATE-ON-ERROR*/
              }
          }
      
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
      private void readInputFile() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file.                           *
// *----------------------------------------------------------------*
//  READ SYS001-REDUCED-PARM-MASTER
          	sys001ReducedParmMaster.read();
          work.setSys001RdwIn800(sys001ReducedParmMaster.getRecLen());
          work.setInputFileStatus200(sys001ReducedParmMaster.getStatusString() );
          if (!sys001ReducedParmMaster.hasEnded()) {
          	sys001ReducedParmMasterRec.setString(sys001ReducedParmMaster.getRecord());
          }
//  IF 88-200-SYS001-STATUS-GOOD
          if ( work.isSys001StatusGood88200()  ) { 
//  MOVE SYS001-REDUCED-PARM-MASTER-REC TO IP0201-REDUCED-FILE-FORMAT (1 : 800-SYS001-RDW-IN )
              ip0201ReducedFileFormat.replace(sys001ReducedParmMasterRec.getCharArray(),0,sys001ReducedParmMasterRec.length(),0,(int) work.getSys001RdwIn800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  ADD 1 TO 400-RECS-READ
              work.setRecsRead400(work.getRecsRead400()+(long)1);
          }
//  ELSE
          else { 
//  IF 88-200-SYS001-STATUS-EOF
              if ( work.isSys001StatusEof88200()  ) { 
//  IF 88-100-IT-IS-FIRST-READ
                  if ( work.isItIsFirstRead88100()  ) { 
//  MOVE 300-PARA-8000 TO 900-ABEND-PARA
                      abendParaName900.setAbendPara900(work.getPara8000300());
//  MOVE 300-ONEDAY-FILE-EMPTY TO 900-ABEND-CODE
                      abendMessage900.setAbendCode900(work.getOnedayFileEmpty300());
//  MOVE 600-IP606-3007 TO 900-ABEND-TEXT
                      abendMessage900.setAbendText900(pad(66,work.getIp6063007600(),SPACE_CHAR,RIGHT_PAD));
                      // MOVE 12 TO 300-COND-CODE
                      endOfStepMsg300.setCondCode300(12);
//  PERFORM 9000-TERMINATE-ON-ERROR
                      terminateOnError();/*9000-TERMINATE-ON-ERROR*/
                  }
//  ELSE
                  else { 
//  SET 88-100-INPUT-FILE-DONE TO TRUE
                      work.setInputFileDone88100True(); 
                      
                  }
              }
//  ELSE
              else { 
//  MOVE 300-SYS001-FILE TO 600-FILE-NAME
                  ioError600.setFileName600(work.getSys001File300());
//  MOVE 200-INPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
                  ioError600.setBadIoStatusCode600(pad(4,work.getInputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8000 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara8000300());
//  MOVE 300-OPEN-SYS001-FILE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(work.getOpenSys001File300());
                  // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError();/*9000-TERMINATE-ON-ERROR*/
              }
          }
      
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
      private void write90DfltToTemp() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph write the table 90 records to temp file.        *
// *----------------------------------------------------------------*
//  MOVE IP00901-BS-AR-MASTER TO SYS105-TEMP-TABLE90-REC (1 : 800-TEMP-TBL90-RDW )
          sys105TempTable90Rec.replace(ip00901BsArMaster.getCharArray(),0,ip00901BsArMaster.length(),0,(int) work.getTempTbl90Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE SYS105-TEMP-TABLE90-REC
          sys105TempTable90.setRecord(substring(sys105TempTable90Rec.toCharArray(),0,(int) work.getTempTbl90Rdw800()));
          sys105TempTable90.write((int) work.getTempTbl90Rdw800()); 
          work.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(work.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8100300());
//  MOVE 300-WRITE-SYS105-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getWriteSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void writeExpandedRecord() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph write into the output.                          *
// *----------------------------------------------------------------*
//  MOVE IP5000-PARAMETER-MASTER-REC TO SYS200-EXP-PARM-MASTER-REC (1 : 800-SYS200-RDW-OUT )
          sys200ExpParmMasterRec.replace(ip5000ParameterMasterRec.getCharArray(),0,ip5000ParameterMasterRec.length(),0,(int) work.getSys200RdwOut800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE SYS200-EXP-PARM-MASTER-REC
          sys200ExpandedParmMaster.setRecord(substring(sys200ExpParmMasterRec.toCharArray(),0,(int) work.getSys200RdwOut800()));
          sys200ExpandedParmMaster.write((int) work.getSys200RdwOut800()); 
          work.setOutputFileStatus200(sys200ExpandedParmMaster.getStatusString() );
//  IF 88-200-SYS200-STATUS-GOOD
          if ( work.isSys200StatusGood88200()  ) { 
//  ADD 1 TO 400-RECS-WRITTEN
              work.setRecsWritten400(work.getRecsWritten400()+(long)1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS200-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys200File300());
//  MOVE 200-OUTPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getOutputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8200300());
//  MOVE 300-WRITE-SYS200-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getWriteSys200File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void write91DfltToTemp() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph write the table 91 records to temp file.        *
// *----------------------------------------------------------------*
//  MOVE IP00911-BS-BIN-MASTER TO SYS106-TEMP-TABLE91-REC (1 : 800-TEMP-TBL91-RDW )
          sys106TempTable91Rec.replace(ip00911BsBinMaster.getCharArray(),0,ip00911BsBinMaster.length(),0,(int) work.getTempTbl91Rdw800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE SYS106-TEMP-TABLE91-REC
          sys106TempTable91.setRecord(substring(sys106TempTable91Rec.toCharArray(),0,(int) work.getTempTbl91Rdw800()));
          sys106TempTable91.write((int) work.getTempTbl91Rdw800()); 
          work.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(work.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8250 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8250300());
//  MOVE 300-WRITE-SYS106-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getWriteSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void closeSys001() throws Exception {
      
// *----------------------------------------------------------------*
// * This para closes the input file.                               *
// *----------------------------------------------------------------*
//  CLOSE SYS001-REDUCED-PARM-MASTER
          sys001ReducedParmMaster.close(); 
          work.setInputFileStatus200(sys001ReducedParmMaster.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(work.isSys001StatusGood88200()) ) { 
//  MOVE 300-SYS001-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys001File300());
//  MOVE 200-INPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getInputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8300 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8300300());
//  MOVE 300-CLOSE-SYS001-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseSys001File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void openInputSys001() throws Exception {
      
// *----------------------------------------------------------------*
// * This para opens the input file.                                *
// *----------------------------------------------------------------*
//  OPEN INPUT SYS001-REDUCED-PARM-MASTER
          sys001ReducedParmMaster.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001ReducedParmMaster.getFileName(),sys001ReducedParmMaster.getSys001ReducedParmMasterCharSet(),sys001ReducedParmMaster.getSys001ReducedParmMasterCrlfFlag());
          work.setInputFileStatus200(sys001ReducedParmMaster.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
          if ( work.isSys001StatusGood88200()  ) { 
//  MOVE SPACES TO 100-INPUT-FILE-SW
              work.setInputFileSw100(CONSTANTS.SPACE);
          }
//  ELSE
          else { 
//  MOVE 300-SYS001-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys001File300());
//  MOVE 200-INPUT-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getInputFileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8350 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8350300());
//  MOVE 300-OPEN-SYS001-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenSys001File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void closeTemp90File() throws Exception {
      
// *----------------------------------------------------------------*
// * This para closes the temp90 file.                              *
// *----------------------------------------------------------------*
//  CLOSE SYS105-TEMP-TABLE90
          sys105TempTable90.close(); 
          work.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(work.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8400 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8400300());
//  MOVE 300-CLOSE-SYS105-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void closeTemp91File() throws Exception {
      
// *----------------------------------------------------------------*
// * This para closes the temp91 file.                              *
// *----------------------------------------------------------------*
//  CLOSE SYS106-TEMP-TABLE91
          sys106TempTable91.close(); 
          work.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(work.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8500 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8500300());
//  MOVE 300-CLOSE-SYS106-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void openTemp90File() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the temp files for table90 in input mode  *
// *----------------------------------------------------------------*
//  OPEN INPUT SYS105-TEMP-TABLE90
          sys105TempTable90.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys105TempTable90.getFileName(),sys105TempTable90.getSys105TempTable90CharSet(),sys105TempTable90.getSys105TempTable90CrlfFlag());
          work.setTmp90FileStatus200(sys105TempTable90.getStatusString() );
//  IF 88-200-TEMP90-STATUS-GOOD
//  ELSE
          if (!(work.isTemp90StatusGood88200()) ) { 
//  MOVE 300-SYS105-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys105File300());
//  MOVE 200-TMP90-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp90FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8600 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8600300());
//  MOVE 300-OPEN-SYS105-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenSys105File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void openTemp91File() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the temp files for table90 in input mode  *
// *----------------------------------------------------------------*
//  OPEN INPUT SYS106-TEMP-TABLE91
          sys106TempTable91.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys106TempTable91.getFileName(),sys106TempTable91.getSys106TempTable91CharSet(),sys106TempTable91.getSys106TempTable91CrlfFlag());
          work.setTmp91FileStatus200(sys106TempTable91.getStatusString() );
//  IF 88-200-TEMP91-STATUS-GOOD
//  ELSE
          if (!(work.isTemp91StatusGood88200()) ) { 
//  MOVE 300-SYS106-FILE TO 600-FILE-NAME
              ioError600.setFileName600(work.getSys106File300());
//  MOVE 200-TMP91-FILE-STATUS TO 600-BAD-IO-STATUS-CODE
              ioError600.setBadIoStatusCode600(pad(4,work.getTmp91FileStatus200(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-8700 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8700300());
//  MOVE 300-OPEN-SYS106-FILE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenSys106File300());
              // MOVE 600-IO-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioError600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void terminateOnError() throws Exception {
      
// *----------------------------------------------------------------*
// * Displays abend messages using abend routine                    *
// *----------------------------------------------------------------*
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE RETURN-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
          this.setRc(CFUtil.getInt(abendMessage900.getAbendCode900()));
//  DISPLAY 900-DISPLAY-ABEND-MSG-TXT
          logger.info(new String(work.getDisplayAbendMsgTxt900())); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 'IN IP606130 - COMMENTED ABEND HANDLER IP610010 CALL'
          logger.info("IN IP606130 - COMMENTED ABEND HANDLER IP610010 CALL"); 
          ;
      
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
      private void updateEventLog() throws Exception {
			// Declare local variables used in the method
			long ip60001Subscript = 0;
			// End of variable declaration

      
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
//  IF 88-IP60001-LOG-EVENT
          if ( ip60001EventLogWorkArea.isIp60001LogEvent88()  ) { 
              ip60001Subscript = ip60001EventLogWorkArea.getIp60001Subscript();
//  IF IP60001-SUBSCRIPT = 500
              if (	( ip60001Subscript == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript((long)1);
              }
  
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript(ip60001EventLogWorkArea.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              ip60001EventLogWorkArea.getIp60001EventEntry((int) ip60001EventLogWorkArea.getIp60001Subscript() - 1).setIp60001PgmName(ip60001EventLogWorkArea.getIp60001HoldPgmName());
          }
      
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
