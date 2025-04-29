  package com.cloudframe.app.process;
  /* 
* element ip343900 as of 09/22/19 08:02:55                    [vc]
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
*author.        wipro.                                           *
*date-written.  october  ,2018.                                  *
*date-compiled. october  ,2018.                                  *
*security.      property of mastercard international, inc.       *
*----------------------------------------------------------------*
* program functionality:                                         *
*----------------------------------------------------------------*
* this program is to insert the records from pmm fix unload file *
* to the tipapim table by calling ip532010 and display the       *
* number of records inserted.                                    *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 - i5256                 *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :intial version.                            *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4                         *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/10/30                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to receive commit         *
*                     frequency '100' for tipapim insert.        *
*----------------------------------------------------------------*
*    project         :pbi000000000666                            *
*    date            :2018/11/29                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to perform 1350- para     *
*                     to populate environment value.             *
*----------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip343900.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.process.Ip750080;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip02014TableDataKey;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.Ip081110;
  import com.cloudframe.app.global.sharedvar.Ip70511TableKey;
  import com.cloudframe.app.process.Ip282210;
  import com.cloudframe.app.process.Ip996020;
  import com.cloudframe.app.global.sharedvar.Ip57901TipaqprEntries;
  import com.cloudframe.app.process.Ip703020;
  import com.cloudframe.app.global.sharedvar.Ip02014TableDataFields;
  import com.cloudframe.app.process.Ip532010;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.ip343900.dto.*;
  import com.cloudframe.app.ip343900.dto.Parms;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.ip343900.file.records.Sys067EnvrmentRecord;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
  import com.cloudframe.app.ip343900.dto.Ip28221PaTableRestart;
  import com.cloudframe.app.ip343900.dto.AbendParaName900;
  import com.cloudframe.app.ip343900.dto.AbendMessage900;
  import com.cloudframe.app.global.sharedvar.Ip34631Tipapim;
  import com.cloudframe.app.ip343900.dto.IoErrorSys067601;
  import com.cloudframe.app.ip343900.file.records.Sys001PimLoadRec;
  import com.cloudframe.app.ip343900.dto.IoErrorType600;
  import com.cloudframe.app.ip343900.dto.EnvrmentFileData800;
  import com.cloudframe.app.global.sharedvar.ApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip34051MqProcessParameters;
  import com.cloudframe.app.global.sharedvar.Ip57901Tipaqpr;
  import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip75081MqSwitches;
  import com.cloudframe.app.global.sharedvar.Ip70511Table;
  import com.cloudframe.app.global.sharedvar.Ip70511EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.Ip996021JobInformation;
  import com.cloudframe.app.global.sharedvar.CheckFirstPutPimGroup100;
  import com.cloudframe.app.ip343900.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip343900")
  
  public class Ip343900 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip343900.class);
  
  private Parms parms = new Parms() ;
  private Sys067EnvrmentRecord sys067EnvrmentRecord = new Sys067EnvrmentRecord() ;
  private Ip28221PaTableRestart ip28221PaTableRestart = new Ip28221PaTableRestart() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private IoErrorSys067601 ioErrorSys067601 = new IoErrorSys067601() ;
  private Sys001PimLoadRec sys001PimLoadRec = new Sys001PimLoadRec() ;
  private IoErrorType600 ioErrorType600 = new IoErrorType600() ;
  private EnvrmentFileData800 envrmentFileData800 = new EnvrmentFileData800() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip343900_sys067EnvrmentFile")
  Sys067EnvrmentFile sys067EnvrmentFile;
  @Autowired 
  @Qualifier("ip343900_sys001PmmFixUnloadFile")
  Sys001PmmFixUnloadFile sys001PmmFixUnloadFile;
  
  
  
  
  
  
      public int setParameter(String parms) throws Exception {
      		if(parms != null)
      		    this.parms.setString(com.cloudframe.app.data.Field.getParm(parms),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process();
      		return getRc();
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
//  PERFORM 0000-PROCESS-MAINLINE
          processMainline();/*0000-PROCESS-MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(sys067EnvrmentFile.hasOpened() && !sys067EnvrmentFile.isReadOnly()) { 
      			sys067EnvrmentFile.flush(); 
      		}
      		if(sys001PmmFixUnloadFile.hasOpened() && !sys001PmmFixUnloadFile.isReadOnly()) { 
      			sys001PmmFixUnloadFile.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * processMainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-PROCESS-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - checkIsItGlobal100             COBOL Name: 100-CHECK-IS-IT-GLOBAL
      *
      * Output :  

      * - ip75081IsItEndOfProcess        COBOL Name: IP75081-IS-IT-END-OF-PROCESS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void processMainline() throws Exception {
      
// *----------------------------------------------------------------*
// *  This pragraph drives the main logic of the program            *
// *----------------------------------------------------------------*
//  PERFORM 1000-DO-INITIALIZE
          doInitialize();/*1000-DO-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-DO-PROCESS
          doProcess();/*2000-DO-PROCESS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-CLOSE-PMM-FIX-UNLOAD-FILE
          closePmmFixUnloadFile();/*3000-CLOSE-PMM-FIX-UNLOAD-FILE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  IF 88-100-IT-IS-GLOBAL
          if ( work.isItIsGlobal88100()  ) { 
//  SET 88-IP75081-END-OF-PROCESS TO TRUE
              ip75081MqSwitches.setIp75081EndOfProcess88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	this.setRc( ip750080.process());
//  PERFORM 4000-CLOSE-DISCONNECT-Q
              closeDisconnectQ();/*4000-CLOSE-DISCONNECT-Q*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * doInitialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DO-INITIALIZE COBOL Cyclomatic complexity - 9
      * Input  :  

      * - programId300                   COBOL Name: 300-PROGRAM-ID
      * - pgmIp532010300                 COBOL Name: 300-PGM-IP532010
      * - abendPgm300                    COBOL Name: 300-ABEND-PGM
      * - pgmIp081110300                 COBOL Name: 300-PGM-IP081110
      * - pgmIp282210300                 COBOL Name: 300-PGM-IP282210
      * - pgmIp703020300                 COBOL Name: 300-PGM-IP703020
      * - pgmIp750080300                 COBOL Name: 300-PGM-IP750080
      * - pgmIp996020300                 COBOL Name: 300-PGM-IP996020
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - valueGlobal300                 COBOL Name: 300-VALUE-GLOBAL
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - programId300                   COBOL Name: 300-PROGRAM-ID
      * - ptrIp532010800                 COBOL Name: 800-PTR-IP532010
      * - abendPtr800                    COBOL Name: 800-ABEND-PTR
      * - ptrIp081110800                 COBOL Name: 800-PTR-IP081110
      * - ptrIp282210800                 COBOL Name: 800-PTR-IP282210
      * - ptrIp703020800                 COBOL Name: 800-PTR-IP703020
      * - ptrIp750080800                 COBOL Name: 800-PTR-IP750080
      * - ptrIp996020800                 COBOL Name: 800-PTR-IP996020
      * - checkFirstPutPim100            COBOL Name: 100-CHECK-FIRST-PUT-PIM
      * - ip75081IsItEndOfProcess        COBOL Name: IP75081-IS-IT-END-OF-PROCESS
      * - ip75081IsFromPgm               COBOL Name: IP75081-IS-FROM-PGM
      *
      * @throws CFException
      */
      private void doInitialize() throws Exception {
			// Declare local variables used in the method
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			char[] ip02014PrcssAgrmtId = null;
			char[] valueGlobal300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph initializes all necessary variables and         *
// * performs a routine to display the execution messages.          *
// *----------------------------------------------------------------*
//  MOVE 300-PROGRAM-ID TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getProgramId300());
//  PERFORM 1100-DISPLAY-EXEC-MSGS
          displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  SET 800-PTR-IP532010 TO ENTRY 300-PGM-IP532010
          work.setPtrIp532010800(work.getPgmIp532010300()); 
          
//  SET 800-ABEND-PTR TO ENTRY 300-ABEND-PGM
          work.setAbendPtr800(work.getAbendPgm300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          work.setPtrIp081110800(work.getPgmIp081110300()); 
          
//  SET 800-PTR-IP282210 TO ENTRY 300-PGM-IP282210
          work.setPtrIp282210800(work.getPgmIp282210300()); 
          
//  SET 800-PTR-IP703020 TO ENTRY 300-PGM-IP703020
          work.setPtrIp703020800(work.getPgmIp703020300()); 
          
//  SET 800-PTR-IP750080 TO ENTRY 300-PGM-IP750080
          work.setPtrIp750080800(work.getPgmIp750080300()); 
          
//  SET 800-PTR-IP996020 TO ENTRY 300-PGM-IP996020
          work.setPtrIp996020800(work.getPgmIp996020300()); 
          
//  SET 88-100-FIRST-PUT-PIM TO TRUE
          checkFirstPutPimGroup100.setFirstPutPim88100True(); 
          
//  SET 88-IP75081-NT-END-OF-PROCESS TO TRUE
          ip75081MqSwitches.setIp75081NtEndOfProcess88True(); 
          
//  SET 88-IP75081-IS-FROM-PIM TO TRUE
          ip75081MqSwitches.setIp75081IsFromPim88True(); 
          
//  PERFORM 1200-OPEN-PMM-FIX-UNLOAD-FILE
          openPmmFixUnloadFile();/*1200-OPEN-PMM-FIX-UNLOAD-FILE*/
//  PERFORM 1300-GET-RUN-CNTRL-FILE
          getRunCntrlFile();/*1300-GET-RUN-CNTRL-FILE*/
//  PERFORM 1350-OPEN-READ-SYS067-INFILE
          openReadSys067Infile();/*1350-OPEN-READ-SYS067-INFILE*/
//  PERFORM 1400-GET-PA-INFO
          getPaInfo();/*1400-GET-PA-INFO*/
          ip02014PrcssAgrmtId = ip02014TableDataKey.getIp02014PrcssAgrmtId();
          valueGlobal300 = work.getValueGlobal300();
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-GLOBAL
          if (		compareChars(ip02014PrcssAgrmtId,valueGlobal300) == 0 ) { 
//  PERFORM 1500-ESTABLISH-MQ-CONNECTION
              establishMqConnection();/*1500-ESTABLISH-MQ-CONNECTION*/
          }
  
//  PERFORM 8000-READ-PMM-FIX-UNLOAD-FILE
          readPmmFixUnloadFile();/*8000-READ-PMM-FIX-UNLOAD-FILE*/
          ;
      
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - programId300                   COBOL Name: 300-PROGRAM-ID
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - programId300                   COBOL Name: 300-PROGRAM-ID
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void displayExecMsgs() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph displays program execution messages             *
// *----------------------------------------------------------------*
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  MOVE 300-PROGRAM-ID TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getProgramId300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1357197638));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
      }
      /**
      * openPmmFixUnloadFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-OPEN-PMM-FIX-UNLOAD-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ioErrorType600                 COBOL Name: 600-IO-ERROR-TYPE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      *
      * Output :  

      * - sys001Status200                COBOL Name: 200-SYS001-STATUS
      * - sys067Status200                COBOL Name: 200-SYS067-STATUS
      * - paraName300                    COBOL Name: 300-PARA-NAME
      * - ioErrTxt600                    COBOL Name: 600-IO-ERR-TXT
      * - sys001FileStat600              COBOL Name: 600-SYS001-FILE-STAT
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioErrorType600                 COBOL Name: 600-IO-ERROR-TYPE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      *
      * @throws CFException
      */
      private void openPmmFixUnloadFile() throws Exception {
      
// *----------------------------------------------------------------*
// * This para opens the pmm fix unload file. there is any file     *
// * opening error, it displays appropriate abend message,populates *
// * event error log and calls abend routine.                       *
// *----------------------------------------------------------------*
//  OPEN INPUT SYS001-PMM-FIX-UNLOAD-FILE
          sys001PmmFixUnloadFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001PmmFixUnloadFile.getFileName(),sys001PmmFixUnloadFile.getSys001PmmFixUnloadFileCharSet(),sys001PmmFixUnloadFile.getSys001PmmFixUnloadFileCrlfFlag());
          work.setSys001Status200(sys001PmmFixUnloadFile.getStatus() );
//  IF 88-200-SYS001-GOOD
//  ELSE
          if (!(work.isSys001Good88200()) ) { 
//  SET 88-300-PARA-1200 TO TRUE
              work.setPara120088300True(); 
              
//  SET 88-600-OPEN-ERROR TO TRUE
              ioErrorType600.setOpenError88600True(); 
              
//  MOVE 200-SYS001-STATUS TO 600-SYS001-FILE-STAT
              ioErrorType600.setSys001FileStat600(work.getSys001Status200());
              // MOVE 600-IO-ERROR-TYPE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioErrorType600.toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getParaName300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * getRunCntrlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-GET-RUN-CNTRL-FILE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip50005ClearingDt              COBOL Name: IP50005-CLEARING-DT
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip50005ClearingTm              COBOL Name: IP50005-CLEARING-TM
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      *
      * @throws CFException
      */
      private void getRunCntrlFile() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph call ip081110 to get the run control file details*
// *it will then move the run control date to get the records from  *
// *oneday file.                                                    *
// *----------------------------------------------------------------*
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	this.setRc( ip081110.process());
//  MOVE IP08101-PROCESS-DATE (1 : 4) TO IP50005-CLEARING-DT (1 : 4)
          ip50005ClearingDtTm.setIp50005ClearingDt(replace(ip50005ClearingDtTm.getIp50005ClearingDt(),String.valueOf(substring(ip08101RunControlRecord.getIp08101ProcessDateString(),0,4)).toCharArray(),0,4));
//  MOVE IP08101-PROCESS-DATE (5 : 2) TO IP50005-CLEARING-DT (5 : 2)
          ip50005ClearingDtTm.setIp50005ClearingDt(replace(ip50005ClearingDtTm.getIp50005ClearingDt(),String.valueOf(substring(ip08101RunControlRecord.getIp08101ProcessDateString(),4,6)).toCharArray(),4,6));
//  MOVE IP08101-PROCESS-DATE (7 : 2) TO IP50005-CLEARING-DT (7 : 2)
          ip50005ClearingDtTm.setIp50005ClearingDt(replace(ip50005ClearingDtTm.getIp50005ClearingDt(),String.valueOf(substring(ip08101RunControlRecord.getIp08101ProcessDateString(),6,8)).toCharArray(),6,8));
//  MOVE IP08101-RPT-PROCESS-TIME (1 : 2) TO IP50005-CLEARING-TM (1 : 2)
          ip50005ClearingDtTm.replace(ip08101RunControlRecord/*parent*/,44/*fromOffset - (ip50005ClearingTm) */,2/*fromLen*/,8/*toOffset - (ip08101RptProcessTime) */,2/*toLen*/);
      
      }
      /**
      * openReadSys067Infile 
      *   This method is derived from 
  *   COBOL Paragraph - 1350-OPEN-READ-SYS067-INFILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void openReadSys067Infile() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph open/read/close sys067 environment file
// *-----------------------------------------------------------------
//  PERFORM 1351-OPEN-INPUT-SYS067
          openInputSys067();/*1351-OPEN-INPUT-SYS067*/
//  PERFORM 1352-READ-INPUT-SYS067
          readInputSys067();/*1352-READ-INPUT-SYS067*/
//  PERFORM 1353-CLOSE-INPUT-SYS067
          closeInputSys067();/*1353-CLOSE-INPUT-SYS067*/
          ;
      
      }
      /**
      * openInputSys067 
      *   This method is derived from 
  *   COBOL Paragraph - 1351-OPEN-INPUT-SYS067 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ioErrorSys067601               COBOL Name: 601-IO-ERROR-SYS067
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      *
      * Output :  

      * - sys001Status200                COBOL Name: 200-SYS001-STATUS
      * - sys067Status200                COBOL Name: 200-SYS067-STATUS
      * - paraName300                    COBOL Name: 300-PARA-NAME
      * - ioErrTxt601                    COBOL Name: 601-IO-ERR-TXT
      * - sys001FileStat600              COBOL Name: 600-SYS001-FILE-STAT
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioErrorSys067601               COBOL Name: 601-IO-ERROR-SYS067
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      *
      * @throws CFException
      */
      private void openInputSys067() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph open sys067 in input mode and check file status
// *-----------------------------------------------------------------
//  OPEN INPUT SYS067-ENVRMENT-FILE
          sys067EnvrmentFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys067EnvrmentFile.getFileName(),sys067EnvrmentFile.getSys067EnvrmentFileCharSet(),sys067EnvrmentFile.getSys067EnvrmentFileCrlfFlag());
          work.setSys067Status200(sys067EnvrmentFile.getStatusString() );
//  IF 88-200-SYS067-IO-GOOD
//  ELSE
          if (!(work.isSys067IoGood88200()) ) { 
//  SET 88-300-PARA-1351 TO TRUE
              work.setPara135188300True(); 
              
//  SET 88-601-OPEN-ERROR TO TRUE
              ioErrorSys067601.setOpenError88601True(); 
              
//  MOVE 200-SYS067-STATUS TO 600-SYS001-FILE-STAT
              ioErrorType600.setSys001FileStat600(padLeftZeros(2,work.getSys067Status200(),false));
              // MOVE 601-IO-ERROR-SYS067 TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioErrorSys067601.toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getParaName300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * readInputSys067 
      *   This method is derived from 
  *   COBOL Paragraph - 1352-READ-INPUT-SYS067 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - parmEnvIdentifier800           COBOL Name: 800-PARM-ENV-IDENTIFIER
      * - ioErrorSys067601               COBOL Name: 601-IO-ERROR-SYS067
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      *
      * Output :  

      * - sys067EnvrmentRecord           COBOL Name: SYS067-ENVRMENT-RECORD
      * - sys067Status200                COBOL Name: 200-SYS067-STATUS
      * - ip70511EnvCd                   COBOL Name: IP70511-ENV-CD
      * - parmEnvIdentifier800           COBOL Name: 800-PARM-ENV-IDENTIFIER
      * - paraName300                    COBOL Name: 300-PARA-NAME
      * - ioErrTxt601                    COBOL Name: 601-IO-ERR-TXT
      * - sys001FileStat600              COBOL Name: 600-SYS001-FILE-STAT
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioErrorSys067601               COBOL Name: 601-IO-ERROR-SYS067
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      *
      * @throws CFException
      */
      private void readInputSys067() throws Exception {
			// Declare local variables used in the method
			Ip70511TableKey ip70511TableKey = ip70511Table.getIp70511TableKey();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph read sys067 and check file status
// *-----------------------------------------------------------------
//  READ SYS067-ENVRMENT-FILE INTO 800-ENVRMENT-FILE-DATA END-READ
          	sys067EnvrmentFile.read();
          work.setSys067Status200(sys067EnvrmentFile.getStatusString() );
          if (!sys067EnvrmentFile.hasEnded()) {
             sys067EnvrmentRecord.setString(sys067EnvrmentFile.getRecord());
             envrmentFileData800.setString(sys067EnvrmentRecord.toCharArray());
          }
//  IF 88-200-SYS067-IO-GOOD
          if ( work.isSys067IoGood88200()  ) { 
//  MOVE 800-PARM-ENV-IDENTIFIER TO IP70511-ENV-CD
              ip70511TableKey.setIp70511EnvCd(envrmentFileData800.getParmEnvIdentifier800());
  
          }
//  ELSE
          else { 
//  SET 88-300-PARA-1352 TO TRUE
              work.setPara135288300True(); 
              
//  SET 88-601-READ-ERROR TO TRUE
              ioErrorSys067601.setReadError88601True(); 
              
//  MOVE 200-SYS067-STATUS TO 600-SYS001-FILE-STAT
              ioErrorType600.setSys001FileStat600(padLeftZeros(2,work.getSys067Status200(),false));
              // MOVE 601-IO-ERROR-SYS067 TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioErrorSys067601.toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getParaName300());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getReadAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * closeInputSys067 
      *   This method is derived from 
  *   COBOL Paragraph - 1353-CLOSE-INPUT-SYS067 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys067Status200                COBOL Name: 200-SYS067-STATUS
      * - ioErrorSys067601               COBOL Name: 601-IO-ERROR-SYS067
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      *
      * Output :  

      * - paraName300                    COBOL Name: 300-PARA-NAME
      * - ioErrTxt601                    COBOL Name: 601-IO-ERR-TXT
      * - sys001FileStat600              COBOL Name: 600-SYS001-FILE-STAT
      * - sys067Status200                COBOL Name: 200-SYS067-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioErrorSys067601               COBOL Name: 601-IO-ERROR-SYS067
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      *
      * @throws CFException
      */
      private void closeInputSys067() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph close sys067 and check file status
// *-----------------------------------------------------------------
//  CLOSE SYS067-ENVRMENT-FILE
          sys067EnvrmentFile.close(); 
          work.setSys067Status200(sys067EnvrmentFile.getStatusString() );
//  IF 88-200-SYS067-IO-GOOD
//  ELSE
          if (!(work.isSys067IoGood88200()) ) { 
//  SET 88-300-PARA-1353 TO TRUE
              work.setPara135388300True(); 
              
//  SET 88-601-CLOSE-ERROR TO TRUE
              ioErrorSys067601.setCloseError88601True(); 
              
//  MOVE 200-SYS067-STATUS TO 600-SYS001-FILE-STAT
              ioErrorType600.setSys001FileStat600(padLeftZeros(2,work.getSys067Status200(),false));
              // MOVE 601-IO-ERROR-SYS067 TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioErrorSys067601.toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getParaName300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * getPaInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-GET-PA-INFO COBOL Cyclomatic complexity - 2
      * Input  :  

      * - valueGlobal300                 COBOL Name: 300-VALUE-GLOBAL
      *
      * Output :  

      * - ip02015PrcssAgrmtTable         COBOL Name: IP02015-PRCSS-AGRMT-TABLE
      * - ip28221Restart                 COBOL Name: IP28221-RESTART
      * - rc                             COBOL Name: RETURN-CODE
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - checkIsItGlobal100             COBOL Name: 100-CHECK-IS-IT-GLOBAL
      *
      * @throws CFException
      */
      private void getPaInfo() throws Exception {
			// Declare local variables used in the method
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			char[] ip02014PrcssAgrmtId = null;
			char[] valueGlobal300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph call ip282210 to retrieve the processing         *
// *agreement information.  it is then determined if the program    *
// *is executing remotely (on soil) or locally (saint louis gcms)   *
// *                                                                *
// *if the program is executing on soil, program ip699930 is called *
// *to obtain the database connection info for the remote site.     *
// *----------------------------------------------------------------*
//  INITIALIZE IP02015-PRCSS-AGRMT-TABLE
          ip02015PrcssAgrmtTable.initialize();
//  SET 88-IP28221-IP282210-NO-RESTRT TO TRUE
          ip28221PaTableRestart.setIp28221Ip282210NoRestrt88True(); 
          
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               this.setRc( ip282210.call(ip28221PaTableRestart));
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP02014-PRCSS-AGRMT-ID
          ip02014TableDataKey.setIp02014PrcssAgrmtId(ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId());
  
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               this.setRc( ip282210.call(ip28221PaTableRestart));
          ip02014PrcssAgrmtId = ip02014TableDataKey.getIp02014PrcssAgrmtId();
          valueGlobal300 = work.getValueGlobal300();
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-GLOBAL
          if (		compareChars(ip02014PrcssAgrmtId,valueGlobal300) == 0 ) { 
//  SET 88-100-IT-IS-GLOBAL TO TRUE
              work.setItIsGlobal88100True(); 
              
          }
  
      
      }
      /**
      * establishMqConnection 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-ESTABLISH-MQ-CONNECTION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - cloneOwnerId800                COBOL Name: 800-CLONE-OWNER-ID
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      * - parmJobgroup800                COBOL Name: 800-PARM-JOBGROUP
      * - parmJobgrpNum800               COBOL Name: 800-PARM-JOBGRP-NUM
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - valueLpidn300                  COBOL Name: 300-VALUE-LPIDN
      * - ip02014AmsOnsoilSw             COBOL Name: IP02014-AMS-ONSOIL-SW
      *
      * Output :  

      * - ip70511CloneOwnerId            COBOL Name: IP70511-CLONE-OWNER-ID
      * - cloneOwnerId800                COBOL Name: 800-CLONE-OWNER-ID
      * - rc                             COBOL Name: RETURN-CODE
      * - ip70511Cpu                     COBOL Name: IP70511-CPU
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      * - ip57901JobGroup                COBOL Name: IP57901-JOB-GROUP
      * - parmJobgroup800                COBOL Name: 800-PARM-JOBGROUP
      * - ip57901JobGrpNum               COBOL Name: IP57901-JOB-GRP-NUM
      * - parmJobgrpNum800               COBOL Name: 800-PARM-JOBGRP-NUM
      * - ip70511HostPrcssAgrmtId        COBOL Name: IP70511-HOST-PRCSS-AGRMT-ID
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip34051ProcessSwitch           COBOL Name: IP34051-PROCESS-SWITCH
      * - ip34051QueueType               COBOL Name: IP34051-QUEUE-TYPE
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip34051FuncCd                  COBOL Name: IP34051-FUNC-CD
      * - ip34051TipacliSwitch           COBOL Name: IP34051-TIPACLI-SWITCH
      * - ip34051TipasvcSwitch           COBOL Name: IP34051-TIPASVC-SWITCH
      * - ip34051CallFromIp545110        COBOL Name: IP34051-CALL-FROM-IP545110
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - valueLpidn300                  COBOL Name: 300-VALUE-LPIDN
      * - amsOnsoilSw800                 COBOL Name: 800-AMS-ONSOIL-SW
      * - ip02014AmsOnsoilSw             COBOL Name: IP02014-AMS-ONSOIL-SW
      *
      * @throws CFException
      */
      private void establishMqConnection() throws Exception {
			// Declare local variables used in the method
			Ip70511TableKey ip70511TableKey = ip70511Table.getIp70511TableKey();
			Ip57901TipaqprEntries ip57901TipaqprEntries = ip57901Tipaqpr.getIp57901TipaqprEntries();
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			Ip02014TableDataFields ip02014TableDataFields = ip02014PrcssAgrmtTable.getIp02014TableDataFields();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph is used to perform the mq connection.
// *----------------------------------------------------------------*
//  MOVE 800-CLONE-OWNER-ID TO IP70511-CLONE-OWNER-ID
          ip70511TableKey.setIp70511CloneOwnerId(parms.getCloneOwnerId800());
  
//  CALL 800-PTR-IP996020
          // CALL 800-PTR-IP996020
          	this.setRc( ip996020.process());
//  MOVE IP996021-LPAR-NAME TO IP70511-CPU
          ip70511TableKey.setIp70511Cpu(ip996021JobInformation.getIp996021LparName());
  
//  MOVE 800-PARM-JOBGROUP TO IP57901-JOB-GROUP
          ip57901TipaqprEntries.setIp57901JobGroup(parms.getParmJobgroup800());
  
//  MOVE 800-PARM-JOBGRP-NUM TO IP57901-JOB-GRP-NUM
          ip57901TipaqprEntries.setIp57901JobGrpNum( parms.getParmJobgrpNum800());
  
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP70511-HOST-PRCSS-AGRMT-ID
          ip70511TableKey.setIp70511HostPrcssAgrmtId(ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId());
  
//  SET 88-IP34051-REQUEST-START TO TRUE
          ip34051MqProcessParameters.setIp34051RequestStart88True(); 
          
//  SET 88-IP34051-REQUEST-Q TO TRUE
          ip34051MqProcessParameters.setIp34051RequestQ88True(); 
          
//  SET 88-IP34051-SERV-CD-PIMMAP TO TRUE
          ip34051MqProcessParameters.setIp34051ServCdPimmap88True(); 
          
//  SET 88-IP34051-FUNC-CD-GENERAL TO TRUE
          ip34051MqProcessParameters.setIp34051FuncCdGeneral88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-Y TO TRUE
          ip34051MqProcessParameters.setIp34051TipacliActiveY88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-Y TO TRUE
          ip34051MqProcessParameters.setIp34051TipasvcActiveY88True(); 
          
//  SET 88-IP34051-IP545110-N TO TRUE
          ip34051MqProcessParameters.setIp34051Ip545110N88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	this.setRc( ip703020.process());
//  MOVE 300-VALUE-LPIDN TO IP02014-PRCSS-AGRMT-ID
          ip02014TableDataKey.setIp02014PrcssAgrmtId(work.getValueLpidn300());
  
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               this.setRc( ip282210.call(ip28221PaTableRestart));
//  MOVE IP02014-AMS-ONSOIL-SW TO 800-AMS-ONSOIL-SW
          work.setAmsOnsoilSw800(ip02014TableDataFields.getIp02014AmsOnsoilSw());
  
      
      }
      /**
      * doProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-DO-PROCESS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001Status200                COBOL Name: 200-SYS001-STATUS
      *
      * Output :  

      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void doProcess() throws Exception {
      
// *----------------------------------------------------------------*
// * This para to perform the insert para until end of file is      *
// * reached.                                                       *
// *----------------------------------------------------------------*
//  PERFORM 2100-INSERT-TIPAPIM-TBL UNTIL 88-200-SYS001-EOF
          while (!(work.isSys001Eof88200()) ) {
             insertTipapimTbl();/*2100-INSERT-TIPAPIM-TBL*/
          }
//  SET 88-IP75081-MQ-SEND TO TRUE
          ip75081MqSwitches.setIp75081MqSend88True(); 
          
//  CALL 800-PTR-IP750080
          // CALL 800-PTR-IP750080
          	this.setRc( ip750080.process());
      
      }
      /**
      * insertTipapimTbl 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-INSERT-TIPAPIM-TBL COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sys001Status200                COBOL Name: 200-SYS001-STATUS
      * - value4300                      COBOL Name: 300-VALUE-4
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - insRecCnt400                   COBOL Name: 400-INS-REC-CNT
      * - value1300                      COBOL Name: 300-VALUE-1
      * - insCmtCnt400                   COBOL Name: 400-INS-CMT-CNT
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      *
      * Output :  

      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value4300                      COBOL Name: 300-VALUE-4
      * - rc                             COBOL Name: RETURN-CODE
      * - insRecCnt400                   COBOL Name: 400-INS-REC-CNT
      * - insCmtCnt400                   COBOL Name: 400-INS-CMT-CNT
      *
      * @throws CFException
      */
      private void insertTipapimTbl() throws Exception {
			// Declare local variables used in the method
			int insCmtCnt400 = 0;
			int commitCnt800 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph will call the routine ip532010 to insert the    *
// * values in tipapim table                                        *
// *----------------------------------------------------------------*
//  IF 88-200-SYS001-GOOD
          if ( work.isSys001Good88200()  ) { 
//  SET 88-100-INSERT-RTN TO TRUE
              apiLayout.setInsertRtn88100True(); 
              
//  MOVE 300-VALUE-4 TO QUERY-NO
              apiLayout.setQueryNo((short) work.getValue4300());
//  CALL 800-PTR-IP532010
              // CALL 800-PTR-IP532010
              	this.setRc( ip532010.process());
//  IF 88-100-ROWS-FOUND
              if ( apiLayout.isRowsFound88100()  ) { 
                  work.setInsRecCnt400((long)Math.abs(work.getInsRecCnt400() + work.getValue1300()));
                  work.setInsCmtCnt400((int)Math.abs(work.getInsCmtCnt400() + work.getValue1300()));
                  insCmtCnt400 = work.getInsCmtCnt400();
                  commitCnt800 = parms.getCommitCnt800();
//  IF 400-INS-CMT-CNT >= 800-COMMIT-CNT
                  if (	( insCmtCnt400 >= commitCnt800 )) { 
//  SET 88-100-COMMIT-RTN TO TRUE
                      apiLayout.setCommitRtn88100True(); 
                      
//  CALL 800-PTR-IP532010
                      // CALL 800-PTR-IP532010
                      	this.setRc( ip532010.process());
//  MOVE ZERO TO 400-INS-CMT-CNT
                      work.setInsCmtCnt400(0);
                  }
  
//  PERFORM 2110-ONSOIL-PROCESS
                  onsoilProcess();/*2110-ONSOIL-PROCESS*/
              }
          }
//  PERFORM 8000-READ-PMM-FIX-UNLOAD-FILE
          readPmmFixUnloadFile();/*8000-READ-PMM-FIX-UNLOAD-FILE*/
          ;
      
      }
      /**
      * onsoilProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-ONSOIL-PROCESS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - amsOnsoilSw800                 COBOL Name: 800-AMS-ONSOIL-SW
      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      *
      * Output :  

      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - ip75081IsForTable              COBOL Name: IP75081-IS-FOR-TABLE
      * - ip75081AccntNum                COBOL Name: IP75081-ACCNT-NUM
      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void onsoilProcess() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph is used to invoke mq paylaod pai to put message  *
// *in queue.                                                       *
// *----------------------------------------------------------------*
//  IF 88-800-AMS-ONSOIL-SW-N
          if ( work.isAmsOnsoilSwN88800()  ) { 
//  SET 88-IP75081-MQ-PUT TO TRUE
              ip75081MqSwitches.setIp75081MqPut88True(); 
              
//  SET 88-IP75081-IS-FOR-PIM TO TRUE
              ip75081MqSwitches.setIp75081IsForPim88True(); 
              
//  MOVE IP34631-VIRTUAL-ACCOUNT-NBR TO IP75081-ACCNT-NUM
              ip75081MqSwitches.setIp75081AccntNum(ip34631Tipapim.getIp34631VirtualAccountNbr());
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	this.setRc( ip750080.process());
          }
      
      }
      /**
      * closePmmFixUnloadFile 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-CLOSE-PMM-FIX-UNLOAD-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001Status200                COBOL Name: 200-SYS001-STATUS
      * - noOfRecords600                 COBOL Name: 600-NO-OF-RECORDS
      * - insRecCnt400                   COBOL Name: 400-INS-REC-CNT
      * - ioErrorType600                 COBOL Name: 600-IO-ERROR-TYPE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      *
      * Output :  

      * - paraName300                    COBOL Name: 300-PARA-NAME
      * - ioErrTxt600                    COBOL Name: 600-IO-ERR-TXT
      * - sys001FileStat600              COBOL Name: 600-SYS001-FILE-STAT
      * - sys001Status200                COBOL Name: 200-SYS001-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioErrorType600                 COBOL Name: 600-IO-ERROR-TYPE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      *
      * @throws CFException
      */
      private void closePmmFixUnloadFile() throws Exception {
      
// *----------------------------------------------------------------*
// * This para will close pmm load file and is there any closing    *
// * error, it displays appropriate abend message, populates event  *
// * error log and calls abend routine.                             *
// *----------------------------------------------------------------*
//  CLOSE SYS001-PMM-FIX-UNLOAD-FILE
          sys001PmmFixUnloadFile.close(); 
          work.setSys001Status200(sys001PmmFixUnloadFile.getStatus() );
//  IF 88-200-SYS001-GOOD
          if ( work.isSys001Good88200()  ) { 
//  DISPLAY 600-NO-OF-RECORDS 400-INS-REC-CNT
              logger.info("{}{}", new String(ioErrorType600.getNoOfRecords600()), String.valueOf(work.getInsRecCnt400())); 
          }
//  ELSE
          else { 
//  SET 88-300-PARA-3000 TO TRUE
              work.setPara300088300True(); 
              
//  SET 88-600-CLOSE-ERROR TO TRUE
              ioErrorType600.setCloseError88600True(); 
              
//  MOVE 200-SYS001-STATUS TO 600-SYS001-FILE-STAT
              ioErrorType600.setSys001FileStat600(work.getSys001Status200());
              // MOVE 600-IO-ERROR-TYPE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioErrorType600.toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getParaName300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * closeDisconnectQ 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-CLOSE-DISCONNECT-Q COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip34051ProcessSwitch           COBOL Name: IP34051-PROCESS-SWITCH
      * - ip34051TipacliSwitch           COBOL Name: IP34051-TIPACLI-SWITCH
      * - ip34051TipasvcSwitch           COBOL Name: IP34051-TIPASVC-SWITCH
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip34051FuncCd                  COBOL Name: IP34051-FUNC-CD
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void closeDisconnectQ() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is to close and disconnect the mq
// *-----------------------------------------------------------------
//  SET 88-IP34051-REQUEST-END TO TRUE
          ip34051MqProcessParameters.setIp34051RequestEnd88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
          ip34051MqProcessParameters.setIp34051TipacliActiveN88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
          ip34051MqProcessParameters.setIp34051TipasvcActiveN88True(); 
          
//  SET 88-IP34051-SERV-CD-PIMMAP TO TRUE
          ip34051MqProcessParameters.setIp34051ServCdPimmap88True(); 
          
//  SET 88-IP34051-FUNC-CD-GENERAL TO TRUE
          ip34051MqProcessParameters.setIp34051FuncCdGeneral88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	this.setRc( ip703020.process());

// * For disonnecting the queue manager:
//  SET 88-IP34051-REQUEST-DISCNCT TO TRUE
          ip34051MqProcessParameters.setIp34051RequestDiscnct88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	this.setRc( ip703020.process());
      
      }
      /**
      * readPmmFixUnloadFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-READ-PMM-FIX-UNLOAD-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ioErrorType600                 COBOL Name: 600-IO-ERROR-TYPE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      *
      * Output :  

      * - sys001PimLoadRec               COBOL Name: SYS001-PIM-LOAD-REC
      * - sys001Status200                COBOL Name: 200-SYS001-STATUS
      * - ip34631Tipapim                 COBOL Name: IP34631-TIPAPIM
      * - paraName300                    COBOL Name: 300-PARA-NAME
      * - ioErrTxt600                    COBOL Name: 600-IO-ERR-TXT
      * - sys001FileStat600              COBOL Name: 600-SYS001-FILE-STAT
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ioErrorType600                 COBOL Name: 600-IO-ERROR-TYPE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      *
      * @throws CFException
      */
      private void readPmmFixUnloadFile() throws Exception {
      
// *----------------------------------------------------------------*
// * This para reads the pmm-fix-unload-file. if there is any file  *
// * read error, it displays appropriate abend message, populates   *
// * event error log and calls abend routine.                       *
// *----------------------------------------------------------------*
//  READ SYS001-PMM-FIX-UNLOAD-FILE
          	sys001PmmFixUnloadFile.read();
          work.setSys001Status200(sys001PmmFixUnloadFile.getStatus() );
          if (!sys001PmmFixUnloadFile.hasEnded()) {
          	sys001PimLoadRec.setString(sys001PmmFixUnloadFile.getRecord());
          }
          // MOVE SYS001-PIM-LOAD-REC TO IP34631-TIPAPIM
          ip34631Tipapim.setString(sys001PimLoadRec.getCharArray());
//  IF 88-200-SYS001-GOOD OR 88-200-SYS001-EOF
//  ELSE
          if (!(work.isSys001Good88200())  && !(work.isSys001Eof88200()) ) { 
//  SET 88-300-PARA-8000 TO TRUE
              work.setPara800088300True(); 
              
//  SET 88-600-READ-ERROR TO TRUE
              ioErrorType600.setReadError88600True(); 
              
//  MOVE 200-SYS001-STATUS TO 600-SYS001-FILE-STAT
              ioErrorType600.setSys001FileStat600(work.getSys001Status200());
              // MOVE 600-IO-ERROR-TYPE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(ioErrorType600.toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getParaName300());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getReadAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - astriskLine900                 COBOL Name: 900-ASTRISK-LINE
      * - abendAbend900                  COBOL Name: 900-ABEND-ABEND
      * - abendAbendPgm900               COBOL Name: 900-ABEND-ABEND-PGM
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void terminateOnError() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph is called whenever abend occurs.                *
// *----------------------------------------------------------------*
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  DISPLAY 900-ABEND-ABEND
          logger.info(new String(work.getAbendAbend900())); 
//  DISPLAY 900-ABEND-ABEND-PGM
          logger.info(new String(work.getAbendAbendPgm900())); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
          // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.toCharArray());
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	this.setRc( ip610010.process());
      
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
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            parms.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parms) {
                       	this.parms = ((Parms) parameters[index]);
                  	} else {
                       	this.parms.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
      public void setFromIp282210(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   ip28221PaTableRestart.setString(((Field)params[0] ).toCharArray());
 else    ip28221PaTableRestart.setString((char[])params[0] );
      }
  
  
  
  
  
  }
