  package com.cloudframe.app.process.impl;
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
  import com.cloudframe.app.ip343900.Ip343900Ctx.*;
  import com.cloudframe.app.ip343900.Ip343900Ctx;
  import com.cloudframe.app.process.Ip343900;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.process.Ip750080;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.Ip081110;
  import com.cloudframe.app.process.Ip282210;
  import com.cloudframe.app.process.Ip996020;
  import com.cloudframe.app.process.Ip703020;
  import com.cloudframe.app.process.Ip532010;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.ip343900.dto.*;
  import com.cloudframe.app.ip343900.dto.Parms;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.global.sharedvar.Ip34631Tipapim;
  import com.cloudframe.app.ip343900.dto.AbendMessage900;
  import com.cloudframe.app.ip343900.dto.IoErrorSys067601;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
  import com.cloudframe.app.ip343900.file.records.Sys001PimLoadRec;
  import com.cloudframe.app.ip343900.dto.IoErrorType600;
  import com.cloudframe.app.ip343900.file.records.Sys067EnvrmentRecord;
  import com.cloudframe.app.ip343900.dto.AbendParaName900;
  import com.cloudframe.app.ip343900.dto.EnvrmentFileData800;
  import com.cloudframe.app.ip343900.dto.Ip28221PaTableRestart;
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
  
  public class Ip343900Impl extends CommonProcess implements Ip343900 {
  
  Logger logger = LoggerFactory.getLogger(Ip343900Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip343900_sys067EnvrmentFile")
  Sys067EnvrmentFile sys067EnvrmentFile;
  @Autowired 
  @Qualifier("ip343900_sys001PmmFixUnloadFile")
  Sys001PmmFixUnloadFile sys001PmmFixUnloadFile;
  
  
  
  
  
  
      @Override
      public int setParameter(Ip343900Ctx programCtx, String parms) throws Exception {
      		if(parms != null)
      		    programCtx.getParms().setString(com.cloudframe.app.data.Field.getParm(parms),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip343900Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
          ;
//  PERFORM 0000-PROCESS-MAINLINE
          processMainline(programCtx.getProcessMainlineInCtx());/*0000-PROCESS-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
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
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public ProcessMainlineOutCtx processMainline(ProcessMainlineInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *  This pragraph drives the main logic of the program            *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
ProcessMainlineOutCtx methodOut = methodIn.getProcessMainlineOutCtx();
//  PERFORM 1000-DO-INITIALIZE
          doInitialize(programCtx.getDoInitializeInCtx());/*1000-DO-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2000-DO-PROCESS
          doProcess(programCtx.getDoProcessInCtx());/*2000-DO-PROCESS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 3000-CLOSE-PMM-FIX-UNLOAD-FILE
          closePmmFixUnloadFile(programCtx.getClosePmmFixUnloadFileInCtx());/*3000-CLOSE-PMM-FIX-UNLOAD-FILE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  IF 88-100-IT-IS-GLOBAL
          if ( methodIn.isItIsGlobal88100()  ) { 
//  SET 88-IP75081-END-OF-PROCESS TO TRUE
              methodOut.setIp75081EndOfProcess88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
//  PERFORM 4000-CLOSE-DISCONNECT-Q
              closeDisconnectQ(programCtx.getCloseDisconnectQInCtx());/*4000-CLOSE-DISCONNECT-Q*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
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
      @Override
      public DoInitializeOutCtx doInitialize(DoInitializeInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph initializes all necessary variables and         *
// * performs a routine to display the execution messages.          *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
DoInitializeOutCtx methodOut = methodIn.getDoInitializeOutCtx();
//  MOVE 300-PROGRAM-ID TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getProgramId300());
//  PERFORM 1100-DISPLAY-EXEC-MSGS
          displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  SET 800-PTR-IP532010 TO ENTRY 300-PGM-IP532010
          methodOut.setPtrIp532010800(methodIn.getPgmIp532010300()); 
          
//  SET 800-ABEND-PTR TO ENTRY 300-ABEND-PGM
          methodOut.setAbendPtr800(methodIn.getAbendPgm300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          methodOut.setPtrIp081110800(methodIn.getPgmIp081110300()); 
          
//  SET 800-PTR-IP282210 TO ENTRY 300-PGM-IP282210
          methodOut.setPtrIp282210800(methodIn.getPgmIp282210300()); 
          
//  SET 800-PTR-IP703020 TO ENTRY 300-PGM-IP703020
          methodOut.setPtrIp703020800(methodIn.getPgmIp703020300()); 
          
//  SET 800-PTR-IP750080 TO ENTRY 300-PGM-IP750080
          methodOut.setPtrIp750080800(methodIn.getPgmIp750080300()); 
          
//  SET 800-PTR-IP996020 TO ENTRY 300-PGM-IP996020
          methodOut.setPtrIp996020800(methodIn.getPgmIp996020300()); 
          
//  SET 88-100-FIRST-PUT-PIM TO TRUE
          methodOut.setFirstPutPim88100True(); 
          
//  SET 88-IP75081-NT-END-OF-PROCESS TO TRUE
          methodOut.setIp75081NtEndOfProcess88True(); 
          
//  SET 88-IP75081-IS-FROM-PIM TO TRUE
          methodOut.setIp75081IsFromPim88True(); 
          
//  PERFORM 1200-OPEN-PMM-FIX-UNLOAD-FILE
          openPmmFixUnloadFile(programCtx.getOpenPmmFixUnloadFileInCtx());/*1200-OPEN-PMM-FIX-UNLOAD-FILE*/
//  PERFORM 1300-GET-RUN-CNTRL-FILE
          getRunCntrlFile(programCtx.getGetRunCntrlFileInCtx());/*1300-GET-RUN-CNTRL-FILE*/
//  PERFORM 1350-OPEN-READ-SYS067-INFILE
          openReadSys067Infile(programCtx);/*1350-OPEN-READ-SYS067-INFILE*/
//  PERFORM 1400-GET-PA-INFO
          getPaInfo(programCtx.getGetPaInfoInCtx());/*1400-GET-PA-INFO*/
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-GLOBAL
          if (		compareChars(methodIn.getIp02014PrcssAgrmtId(),methodIn.getValueGlobal300()) == 0 ) { 
//  PERFORM 1500-ESTABLISH-MQ-CONNECTION
              establishMqConnection(programCtx.getEstablishMqConnectionInCtx());/*1500-ESTABLISH-MQ-CONNECTION*/
          }
//  PERFORM 8000-READ-PMM-FIX-UNLOAD-FILE
          readPmmFixUnloadFile(programCtx.getReadPmmFixUnloadFileInCtx());/*8000-READ-PMM-FIX-UNLOAD-FILE*/
          ;
      
      return methodOut;
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
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph displays program execution messages             *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  MOVE 300-PROGRAM-ID TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getProgramId300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1357197638));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
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
      @Override
      public OpenPmmFixUnloadFileOutCtx openPmmFixUnloadFile(OpenPmmFixUnloadFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para opens the pmm fix unload file. there is any file     *
// * opening error, it displays appropriate abend message,populates *
// * event error log and calls abend routine.                       *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
OpenPmmFixUnloadFileOutCtx methodOut = methodIn.getOpenPmmFixUnloadFileOutCtx();
//  OPEN INPUT SYS001-PMM-FIX-UNLOAD-FILE
          sys001PmmFixUnloadFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001PmmFixUnloadFile.getFileName(),sys001PmmFixUnloadFile.getSys001PmmFixUnloadFileCharSet(),sys001PmmFixUnloadFile.getSys001PmmFixUnloadFileCrlfFlag());
          methodOut.setSys001Status200(sys001PmmFixUnloadFile.getStatus() );
//  IF 88-200-SYS001-GOOD
//  ELSE
          if (!(methodOut.isSys001Good88200()) ) { 
//  SET 88-300-PARA-1200 TO TRUE
              methodOut.setPara120088300True(); 
              
//  SET 88-600-OPEN-ERROR TO TRUE
              methodOut.setOpenError88600True(); 
              
//  MOVE 200-SYS001-STATUS TO 600-SYS001-FILE-STAT
              methodOut.setSys001FileStat600(methodOut.getSys001Status200());
              // MOVE 600-IO-ERROR-TYPE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoErrorType600().toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getParaName300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public GetRunCntrlFileOutCtx getRunCntrlFile(GetRunCntrlFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph call ip081110 to get the run control file details*
// *it will then move the run control date to get the records from  *
// *oneday file.                                                    *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
GetRunCntrlFileOutCtx methodOut = methodIn.getGetRunCntrlFileOutCtx();
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	programCtx.setRc( ip081110.process(programCtx.getGlobalCtx().getContext("IP081110")));
//  MOVE IP08101-PROCESS-DATE (1 : 4) TO IP50005-CLEARING-DT (1 : 4)
          methodOut.setIp50005ClearingDt(replace(methodOut.getIp50005ClearingDt(),String.valueOf(substring(methodOut.getIp08101ProcessDateString(),0,4)).toCharArray(),0,4));
//  MOVE IP08101-PROCESS-DATE (5 : 2) TO IP50005-CLEARING-DT (5 : 2)
          methodOut.setIp50005ClearingDt(replace(methodOut.getIp50005ClearingDt(),String.valueOf(substring(methodOut.getIp08101ProcessDateString(),4,6)).toCharArray(),4,6));
//  MOVE IP08101-PROCESS-DATE (7 : 2) TO IP50005-CLEARING-DT (7 : 2)
          methodOut.setIp50005ClearingDt(replace(methodOut.getIp50005ClearingDt(),String.valueOf(substring(methodOut.getIp08101ProcessDateString(),6,8)).toCharArray(),6,8));
//  MOVE IP08101-RPT-PROCESS-TIME (1 : 2) TO IP50005-CLEARING-TM (1 : 2)
          methodOut.getIp50005ClearingDtTm().replace(methodIn.getIp08101RunControlRecord()/*parent*/,44/*fromOffset - (ip50005ClearingTm) */,2/*fromLen*/,8/*toOffset - (ip08101RptProcessTime) */,2/*toLen*/);
      
      return methodOut;
      }
      /**
      * openReadSys067Infile 
      *   This method is derived from 
  *   COBOL Paragraph - 1350-OPEN-READ-SYS067-INFILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void openReadSys067Infile(Ip343900Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph open/read/close sys067 environment file
// *-----------------------------------------------------------------
//  PERFORM 1351-OPEN-INPUT-SYS067
          openInputSys067(programCtx.getOpenInputSys067InCtx());/*1351-OPEN-INPUT-SYS067*/
//  PERFORM 1352-READ-INPUT-SYS067
          readInputSys067(programCtx.getReadInputSys067InCtx());/*1352-READ-INPUT-SYS067*/
//  PERFORM 1353-CLOSE-INPUT-SYS067
          closeInputSys067(programCtx.getCloseInputSys067InCtx());/*1353-CLOSE-INPUT-SYS067*/
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
      @Override
      public OpenInputSys067OutCtx openInputSys067(OpenInputSys067InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph open sys067 in input mode and check file status
// *-----------------------------------------------------------------
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
OpenInputSys067OutCtx methodOut = methodIn.getOpenInputSys067OutCtx();
//  OPEN INPUT SYS067-ENVRMENT-FILE
          sys067EnvrmentFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys067EnvrmentFile.getFileName(),sys067EnvrmentFile.getSys067EnvrmentFileCharSet(),sys067EnvrmentFile.getSys067EnvrmentFileCrlfFlag());
          methodOut.setSys067Status200(sys067EnvrmentFile.getStatusString() );
//  IF 88-200-SYS067-IO-GOOD
//  ELSE
          if (!(methodOut.isSys067IoGood88200()) ) { 
//  SET 88-300-PARA-1351 TO TRUE
              methodOut.setPara135188300True(); 
              
//  SET 88-601-OPEN-ERROR TO TRUE
              methodOut.setOpenError88601True(); 
              
//  MOVE 200-SYS067-STATUS TO 600-SYS001-FILE-STAT
              methodOut.setSys001FileStat600(padLeftZeros(2,methodOut.getSys067Status200(),false));
              // MOVE 601-IO-ERROR-SYS067 TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoErrorSys067601().toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getParaName300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public ReadInputSys067OutCtx readInputSys067(ReadInputSys067InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph read sys067 and check file status
// *-----------------------------------------------------------------
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
ReadInputSys067OutCtx methodOut = methodIn.getReadInputSys067OutCtx();
//  READ SYS067-ENVRMENT-FILE INTO 800-ENVRMENT-FILE-DATA END-READ
          	sys067EnvrmentFile.read();
          methodOut.setSys067Status200(sys067EnvrmentFile.getStatusString() );
          if (!sys067EnvrmentFile.hasEnded()) {
             methodOut.getSys067EnvrmentRecord().setString(sys067EnvrmentFile.getRecord());
             methodIn.getEnvrmentFileData800().setString(methodOut.getSys067EnvrmentRecord().toCharArray());
          }
//  IF 88-200-SYS067-IO-GOOD
          if ( methodOut.isSys067IoGood88200()  ) { 
//  MOVE 800-PARM-ENV-IDENTIFIER TO IP70511-ENV-CD
              methodOut.setIp70511EnvCd(methodOut.getParmEnvIdentifier800());
          }
//  ELSE
          else { 
//  SET 88-300-PARA-1352 TO TRUE
              methodOut.setPara135288300True(); 
              
//  SET 88-601-READ-ERROR TO TRUE
              methodOut.setReadError88601True(); 
              
//  MOVE 200-SYS067-STATUS TO 600-SYS001-FILE-STAT
              methodOut.setSys001FileStat600(padLeftZeros(2,methodOut.getSys067Status200(),false));
              // MOVE 601-IO-ERROR-SYS067 TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoErrorSys067601().toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getParaName300());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getReadAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public CloseInputSys067OutCtx closeInputSys067(CloseInputSys067InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph close sys067 and check file status
// *-----------------------------------------------------------------
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
CloseInputSys067OutCtx methodOut = methodIn.getCloseInputSys067OutCtx();
//  CLOSE SYS067-ENVRMENT-FILE
          sys067EnvrmentFile.close(); 
          methodOut.setSys067Status200(sys067EnvrmentFile.getStatusString() );
//  IF 88-200-SYS067-IO-GOOD
//  ELSE
          if (!(methodIn.isSys067IoGood88200()) ) { 
//  SET 88-300-PARA-1353 TO TRUE
              methodOut.setPara135388300True(); 
              
//  SET 88-601-CLOSE-ERROR TO TRUE
              methodOut.setCloseError88601True(); 
              
//  MOVE 200-SYS067-STATUS TO 600-SYS001-FILE-STAT
              methodOut.setSys001FileStat600(padLeftZeros(2,methodOut.getSys067Status200(),false));
              // MOVE 601-IO-ERROR-SYS067 TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoErrorSys067601().toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getParaName300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public GetPaInfoOutCtx getPaInfo(GetPaInfoInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph call ip282210 to retrieve the processing         *
// *agreement information.  it is then determined if the program    *
// *is executing remotely (on soil) or locally (saint louis gcms)   *
// *                                                                *
// *if the program is executing on soil, program ip699930 is called *
// *to obtain the database connection info for the remote site.     *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
GetPaInfoOutCtx methodOut = methodIn.getGetPaInfoOutCtx();
//  INITIALIZE IP02015-PRCSS-AGRMT-TABLE
          methodOut.getIp02015PrcssAgrmtTable().initialize();
//  SET 88-IP28221-IP282210-NO-RESTRT TO TRUE
          methodOut.setIp28221Ip282210NoRestrt88True(); 
          
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               programCtx.setRc( ip282210.call(programCtx.getGlobalCtx().getContext("IP282210"),methodOut.getIp28221PaTableRestart()));
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP02014-PRCSS-AGRMT-ID
          methodOut.setIp02014PrcssAgrmtId(methodOut.getIp02015HostPrcssAgrmtId());
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               programCtx.setRc( ip282210.call(programCtx.getGlobalCtx().getContext("IP282210"),methodOut.getIp28221PaTableRestart()));
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-GLOBAL
          if (		compareChars(methodOut.getIp02014PrcssAgrmtId(),methodIn.getValueGlobal300()) == 0 ) { 
//  SET 88-100-IT-IS-GLOBAL TO TRUE
              methodOut.setItIsGlobal88100True(); 
              
          }
      
      return methodOut;
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
      @Override
      public EstablishMqConnectionOutCtx establishMqConnection(EstablishMqConnectionInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph is used to perform the mq connection.
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
EstablishMqConnectionOutCtx methodOut = methodIn.getEstablishMqConnectionOutCtx();
//  MOVE 800-CLONE-OWNER-ID TO IP70511-CLONE-OWNER-ID
          methodOut.setIp70511CloneOwnerId(methodOut.getCloneOwnerId800());
//  CALL 800-PTR-IP996020
          // CALL 800-PTR-IP996020
          	programCtx.setRc( ip996020.process(programCtx.getGlobalCtx().getContext("IP996020")));
//  MOVE IP996021-LPAR-NAME TO IP70511-CPU
          methodOut.setIp70511Cpu(methodOut.getIp996021LparName());
//  MOVE 800-PARM-JOBGROUP TO IP57901-JOB-GROUP
          methodOut.setIp57901JobGroup(methodOut.getParmJobgroup800());
//  MOVE 800-PARM-JOBGRP-NUM TO IP57901-JOB-GRP-NUM
          methodOut.setIp57901JobGrpNum( methodOut.getParmJobgrpNum800());
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP70511-HOST-PRCSS-AGRMT-ID
          methodOut.setIp70511HostPrcssAgrmtId(methodOut.getIp02015HostPrcssAgrmtId());
//  SET 88-IP34051-REQUEST-START TO TRUE
          methodOut.setIp34051RequestStart88True(); 
          
//  SET 88-IP34051-REQUEST-Q TO TRUE
          methodOut.setIp34051RequestQ88True(); 
          
//  SET 88-IP34051-SERV-CD-PIMMAP TO TRUE
          methodOut.setIp34051ServCdPimmap88True(); 
          
//  SET 88-IP34051-FUNC-CD-GENERAL TO TRUE
          methodOut.setIp34051FuncCdGeneral88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-Y TO TRUE
          methodOut.setIp34051TipacliActiveY88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-Y TO TRUE
          methodOut.setIp34051TipasvcActiveY88True(); 
          
//  SET 88-IP34051-IP545110-N TO TRUE
          methodOut.setIp34051Ip545110N88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
//  MOVE 300-VALUE-LPIDN TO IP02014-PRCSS-AGRMT-ID
          methodOut.setIp02014PrcssAgrmtId(methodOut.getValueLpidn300());
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               programCtx.setRc( ip282210.call(programCtx.getGlobalCtx().getContext("IP282210"),methodOut.getIp28221PaTableRestart()));
//  MOVE IP02014-AMS-ONSOIL-SW TO 800-AMS-ONSOIL-SW
          methodOut.setAmsOnsoilSw800(methodOut.getIp02014AmsOnsoilSw());
      
      return methodOut;
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
      @Override
      public DoProcessOutCtx doProcess(DoProcessInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para to perform the insert para until end of file is      *
// * reached.                                                       *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
DoProcessOutCtx methodOut = methodIn.getDoProcessOutCtx();
//  PERFORM 2100-INSERT-TIPAPIM-TBL UNTIL 88-200-SYS001-EOF
          while (!(methodIn.isSys001Eof88200()) ) {
             insertTipapimTbl(programCtx.getInsertTipapimTblInCtx());/*2100-INSERT-TIPAPIM-TBL*/
          }
//  SET 88-IP75081-MQ-SEND TO TRUE
          methodOut.setIp75081MqSend88True(); 
          
//  CALL 800-PTR-IP750080
          // CALL 800-PTR-IP750080
          	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
      
      return methodOut;
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
      @Override
      public InsertTipapimTblOutCtx insertTipapimTbl(InsertTipapimTblInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph will call the routine ip532010 to insert the    *
// * values in tipapim table                                        *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
InsertTipapimTblOutCtx methodOut = methodIn.getInsertTipapimTblOutCtx();
//  IF 88-200-SYS001-GOOD
          if ( methodIn.isSys001Good88200()  ) { 
//  SET 88-100-INSERT-RTN TO TRUE
              methodOut.setInsertRtn88100True(); 
              
//  MOVE 300-VALUE-4 TO QUERY-NO
              methodOut.setQueryNo((short) methodOut.getValue4300());
//  CALL 800-PTR-IP532010
              // CALL 800-PTR-IP532010
              	programCtx.setRc( ip532010.process(programCtx.getGlobalCtx().getContext("IP532010")));
//  IF 88-100-ROWS-FOUND
              if ( methodIn.isRowsFound88100()  ) { 
                  methodOut.setInsRecCnt400((long)Math.abs(methodOut.getInsRecCnt400() + methodIn.getValue1300()));
                  methodOut.setInsCmtCnt400((int)Math.abs(methodOut.getInsCmtCnt400() + methodIn.getValue1300()));
//  IF 400-INS-CMT-CNT >= 800-COMMIT-CNT
                  if (	( methodOut.getInsCmtCnt400() >= methodIn.getCommitCnt800() )) { 
//  SET 88-100-COMMIT-RTN TO TRUE
                      methodOut.setCommitRtn88100True(); 
                      
//  CALL 800-PTR-IP532010
                      // CALL 800-PTR-IP532010
                      	programCtx.setRc( ip532010.process(programCtx.getGlobalCtx().getContext("IP532010")));
//  MOVE ZERO TO 400-INS-CMT-CNT
                      methodOut.setInsCmtCnt400(0);
                  }
//  PERFORM 2110-ONSOIL-PROCESS
                  onsoilProcess(programCtx.getOnsoilProcessInCtx());/*2110-ONSOIL-PROCESS*/
              }
          }
//  PERFORM 8000-READ-PMM-FIX-UNLOAD-FILE
          readPmmFixUnloadFile(programCtx.getReadPmmFixUnloadFileInCtx());/*8000-READ-PMM-FIX-UNLOAD-FILE*/
          ;
      
      return methodOut;
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
      @Override
      public OnsoilProcessOutCtx onsoilProcess(OnsoilProcessInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph is used to invoke mq paylaod pai to put message  *
// *in queue.                                                       *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
OnsoilProcessOutCtx methodOut = methodIn.getOnsoilProcessOutCtx();
//  IF 88-800-AMS-ONSOIL-SW-N
          if ( methodIn.isAmsOnsoilSwN88800()  ) { 
//  SET 88-IP75081-MQ-PUT TO TRUE
              methodOut.setIp75081MqPut88True(); 
              
//  SET 88-IP75081-IS-FOR-PIM TO TRUE
              methodOut.setIp75081IsForPim88True(); 
              
//  MOVE IP34631-VIRTUAL-ACCOUNT-NBR TO IP75081-ACCNT-NUM
              methodOut.setIp75081AccntNum(methodOut.getIp34631VirtualAccountNbr());
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
          }
      
      return methodOut;
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
      @Override
      public ClosePmmFixUnloadFileOutCtx closePmmFixUnloadFile(ClosePmmFixUnloadFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para will close pmm load file and is there any closing    *
// * error, it displays appropriate abend message, populates event  *
// * error log and calls abend routine.                             *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
ClosePmmFixUnloadFileOutCtx methodOut = methodIn.getClosePmmFixUnloadFileOutCtx();
//  CLOSE SYS001-PMM-FIX-UNLOAD-FILE
          sys001PmmFixUnloadFile.close(); 
          methodOut.setSys001Status200(sys001PmmFixUnloadFile.getStatus() );
//  IF 88-200-SYS001-GOOD
          if ( methodIn.isSys001Good88200()  ) { 
//  DISPLAY 600-NO-OF-RECORDS 400-INS-REC-CNT
              logger.info("{}{}", new String(methodIn.getNoOfRecords600()), String.valueOf(methodIn.getInsRecCnt400())); 
          }
//  ELSE
          else { 
//  SET 88-300-PARA-3000 TO TRUE
              methodOut.setPara300088300True(); 
              
//  SET 88-600-CLOSE-ERROR TO TRUE
              methodOut.setCloseError88600True(); 
              
//  MOVE 200-SYS001-STATUS TO 600-SYS001-FILE-STAT
              methodOut.setSys001FileStat600(methodOut.getSys001Status200());
              // MOVE 600-IO-ERROR-TYPE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoErrorType600().toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getParaName300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public CloseDisconnectQOutCtx closeDisconnectQ(CloseDisconnectQInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is to close and disconnect the mq
// *-----------------------------------------------------------------
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
CloseDisconnectQOutCtx methodOut = methodIn.getCloseDisconnectQOutCtx();
//  SET 88-IP34051-REQUEST-END TO TRUE
          methodOut.setIp34051RequestEnd88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
          methodOut.setIp34051TipacliActiveN88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
          methodOut.setIp34051TipasvcActiveN88True(); 
          
//  SET 88-IP34051-SERV-CD-PIMMAP TO TRUE
          methodOut.setIp34051ServCdPimmap88True(); 
          
//  SET 88-IP34051-FUNC-CD-GENERAL TO TRUE
          methodOut.setIp34051FuncCdGeneral88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));

// * For disonnecting the queue manager:
//  SET 88-IP34051-REQUEST-DISCNCT TO TRUE
          methodOut.setIp34051RequestDiscnct88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
      
      return methodOut;
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
      @Override
      public ReadPmmFixUnloadFileOutCtx readPmmFixUnloadFile(ReadPmmFixUnloadFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para reads the pmm-fix-unload-file. if there is any file  *
// * read error, it displays appropriate abend message, populates   *
// * event error log and calls abend routine.                       *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
ReadPmmFixUnloadFileOutCtx methodOut = methodIn.getReadPmmFixUnloadFileOutCtx();
//  READ SYS001-PMM-FIX-UNLOAD-FILE
          	sys001PmmFixUnloadFile.read();
          methodOut.setSys001Status200(sys001PmmFixUnloadFile.getStatus() );
          if (!sys001PmmFixUnloadFile.hasEnded()) {
          	methodOut.getSys001PimLoadRec().setString(sys001PmmFixUnloadFile.getRecord());
          }
          // MOVE SYS001-PIM-LOAD-REC TO IP34631-TIPAPIM
          methodOut.getIp34631Tipapim().setString(methodOut.getSys001PimLoadRec().getCharArray());
//  IF 88-200-SYS001-GOOD OR 88-200-SYS001-EOF
//  ELSE
          if (!(methodOut.isSys001Good88200())  && !(methodOut.isSys001Eof88200()) ) { 
//  SET 88-300-PARA-8000 TO TRUE
              methodOut.setPara800088300True(); 
              
//  SET 88-600-READ-ERROR TO TRUE
              methodOut.setReadError88600True(); 
              
//  MOVE 200-SYS001-STATUS TO 600-SYS001-FILE-STAT
              methodOut.setSys001FileStat600(methodOut.getSys001Status200());
              // MOVE 600-IO-ERROR-TYPE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getIoErrorType600().toCharArray());
//  MOVE 300-PARA-NAME TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getParaName300());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getReadAbendCode300());
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
      @Override
      public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph is called whenever abend occurs.                *
// *----------------------------------------------------------------*
Ip343900Ctx programCtx = methodIn.getIp343900Ctx();
TerminateOnErrorOutCtx methodOut = methodIn.getTerminateOnErrorOutCtx();
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(methodIn.getAstriskLine900())); 
//  DISPLAY 900-ABEND-ABEND
          logger.info(new String(methodIn.getAbendAbend900())); 
//  DISPLAY 900-ABEND-ABEND-PGM
          logger.info(new String(methodIn.getAbendAbendPgm900())); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(methodIn.getAstriskLine900())); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
          // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendMessage900().toCharArray());
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodOut.getAbendMessage900().toString()); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(methodIn.getAstriskLine900())); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Ip343900Ctx programCtx = (Ip343900Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParms().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Ip343900Ctx programCtx = (Ip343900Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parms) {
                       	programCtx.setParms((Parms) parameters[index]);
                  	} else {
                       	programCtx.getParms().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromIp282210(Ip343900Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getIp28221PaTableRestart().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getIp28221PaTableRestart().setString((char[])params[0] );
      }
  
  
  
  
  
  }
