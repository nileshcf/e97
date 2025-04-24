  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip798030.file.*;
  import com.cloudframe.app.ip798030.Ip798030Ctx.*;
  import com.cloudframe.app.ip798030.Ip798030Ctx;
  import com.cloudframe.app.process.Ip798030;
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
  import com.cloudframe.app.global.sharedvar.Ip34631Tipapim;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.Ip081190;
  import com.cloudframe.app.process.Ip081110;
  import com.cloudframe.app.process.Ip282210;
  import com.cloudframe.app.process.Ip699930;
  import com.cloudframe.app.process.Ip996020;
  import com.cloudframe.app.process.Ip703020;
  import com.cloudframe.app.process.Ip699910;
  import com.cloudframe.app.process.Ip534110;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip532110;
  import com.cloudframe.app.process.Ip532010;
  import com.cloudframe.app.process.Ip081050;
  import com.cloudframe.app.process.Ip760010;
  import com.cloudframe.app.process.Ip595010;
  import com.cloudframe.app.process.Ip500920;
  import com.cloudframe.app.process.Ip708020;
  import com.cloudframe.app.process.Ip282240;
  import com.cloudframe.app.process.Ip648010;
  import com.cloudframe.app.process.Ip599050;
  import com.cloudframe.app.process.Ip599810;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.ip798030.dto.*;
  import com.cloudframe.app.ip798030.dto.Parms;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
  import com.cloudframe.app.ip798030.dto.Jobname800;
  import com.cloudframe.app.ip798030.file.records.Sys210MqDataRec;
  import com.cloudframe.app.ip798030.dto.AbendMessage900;
  import com.cloudframe.app.ip798030.dto.FileIoErrMsgTxt600;
  import com.cloudframe.app.ip798030.dto.AbendParaName900;
  import com.cloudframe.app.ip798030.dto.Ip28221PaTableRestart;
  import com.cloudframe.app.ip798030.dto.McdynamErrorMsgTxt640;
  import com.cloudframe.app.global.sharedvar.CutoffTsData800;
  import com.cloudframe.app.ip798030.file.records.Sys202PmaRecord;
  import com.cloudframe.app.ip798030.file.records.Sys001CutoffRecord;
  import com.cloudframe.app.global.sharedvar.Ip38201McidynamParms;
  import com.cloudframe.app.global.sharedvar.CutoffCkpData800;
  import com.cloudframe.app.global.sharedvar.Ip08151PassedParms;
  import com.cloudframe.app.global.sharedvar.Ip08151ReturnParms;
  import com.cloudframe.app.global.sharedvar.Ip08151PartnStrtGroup;
  import com.cloudframe.app.global.sharedvar.Ip08151PartnEndGroup;
  import com.cloudframe.app.global.sharedvar.Ip75081MqSwitches;
  import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip02044ArPa;
  import com.cloudframe.app.global.sharedvar.ApiLayout;
  import com.cloudframe.app.global.sharedvar.EnvArea800;
  import com.cloudframe.app.global.sharedvar.Ip30771TipacliTable;
  import com.cloudframe.app.global.sharedvar.Ip30881Db2McwaitInputValue;
  import com.cloudframe.app.global.sharedvar.Ip32101TipackpTable;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip50921Variables;
  import com.cloudframe.app.global.sharedvar.Ip58041Tipapma;
  import com.cloudframe.app.global.sharedvar.Ip57901Tipaqpr;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip64801LrmCommBlock;
  import com.cloudframe.app.global.sharedvar.Ip69901CafLinkGroup;
  import com.cloudframe.app.global.sharedvar.Ip69901CpuInformationGroup;
  import com.cloudframe.app.global.sharedvar.Ip69901OptionalConnectPrms;
  import com.cloudframe.app.global.sharedvar.Ip69931Linkage;
  import com.cloudframe.app.global.sharedvar.Ip34051MqProcessParameters;
  import com.cloudframe.app.global.sharedvar.Ip70521MqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromWlmGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromNspkGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsMqReqSentSwGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsFraudMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsCemreqMqSrvActveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsCemresMqSrvActveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301CemauthMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301CemnspkMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301FastpayMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301InstallMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301QrRfndMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301MpAchMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmtmapMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaIdnMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaRusMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PimmapMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.ArePhysicalFilesOverGroup100;
  import com.cloudframe.app.global.sharedvar.CheckCloseQueueGroup100;
  import com.cloudframe.app.global.sharedvar.CheckGetQueueGroup100;
  import com.cloudframe.app.global.sharedvar.CheckPutQueueGroup100;
  import com.cloudframe.app.global.sharedvar.Ip70301LnCloneOwnerIdGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301LnCommitCntGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301OrigMsgLenGroup;
  import com.cloudframe.app.global.sharedvar.Ip70511Table;
  import com.cloudframe.app.global.sharedvar.Ip70511EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip7051pm2Table;
  import com.cloudframe.app.global.sharedvar.Ip7051pm2EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip7051pmrTable;
  import com.cloudframe.app.global.sharedvar.Ip7051pmrEntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip7052pm2MqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip7052pmrMqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.Ip996021JobInformation;
  import com.cloudframe.app.global.sharedvar.Ip66601TipalrmEntries;
  import com.cloudframe.app.global.sharedvar.IsDebugSwOnGroup100;
  import com.cloudframe.app.global.sharedvar.CheckFirstGetPimGroup100;
  import com.cloudframe.app.global.sharedvar.CheckFirstPutPimGroup100;
  import com.cloudframe.app.global.sharedvar.IsRowsFoundGroup100;
  import com.cloudframe.app.global.sharedvar.IsOpenSwGroup100;
  import com.cloudframe.app.global.sharedvar.GetBrowseCallsGroup100;
  import com.cloudframe.app.global.sharedvar.Tab204KeyFoundGroup100;
  import com.cloudframe.app.global.sharedvar.CutoffEndGroup800;
  import com.cloudframe.app.global.sharedvar.SvcStkCountGroup800;
  import com.cloudframe.app.global.sharedvar.ExtValues800;
  import com.cloudframe.app.global.sharedvar.EndOfFileIndicator800;
  import com.cloudframe.app.ip798030.dto.LrmStat630;
  import com.cloudframe.app.ip798030.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip798030")
  
  public class Ip798030Impl extends CommonProcess implements Ip798030 {
  
  Logger logger = LoggerFactory.getLogger(Ip798030Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip798030_sys001CutoffFile")
  Sys001CutoffFile sys001CutoffFile;
  @Autowired 
  @Qualifier("ip798030_sys202PmaFile")
  Sys202PmaFile sys202PmaFile;
  @Autowired 
  @Qualifier("ip081190")
  Ip081190 ip081190;
  @Autowired 
  @Qualifier("ip699930")
  Ip699930 ip699930;
  @Autowired 
  @Qualifier("ip798030_sys210MqDataFile")
  Sys210MqDataFile sys210MqDataFile;
  @Autowired 
  @Qualifier("ip699910")
  Ip699910 ip699910;
  @Autowired 
  @Qualifier("ip534110")
  Ip534110 ip534110;
  @Autowired 
  @Qualifier("ip532110")
  Ip532110 ip532110;
  @Autowired 
  @Qualifier("ip081050")
  Ip081050 ip081050;
  @Autowired 
  @Qualifier("ip760010")
  Ip760010 ip760010;
  @Autowired 
  @Qualifier("ip595010")
  Ip595010 ip595010;
  @Autowired 
  @Qualifier("ip500920")
  Ip500920 ip500920;
  @Autowired 
  @Qualifier("ip282240")
  Ip282240 ip282240;
  @Autowired 
  @Qualifier("ip599050")
  Ip599050 ip599050;
  
  
  
  
  
  
      @Override
      public int setParameter(Ip798030Ctx programCtx, String parms) throws Exception {
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
      public int process(Ip798030Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
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
      		if(sys001CutoffFile.hasOpened() && !sys001CutoffFile.isReadOnly()) { 
      			sys001CutoffFile.flush(); 
      		}
      		if(sys202PmaFile.hasOpened() && !sys202PmaFile.isReadOnly()) { 
      			sys202PmaFile.flush(); 
      		}
      		if(sys210MqDataFile.hasOpened() && !sys210MqDataFile.isReadOnly()) { 
      			sys210MqDataFile.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - ip02014OperSysId               COBOL Name: IP02014-OPER-SYS-ID
      * - valueZos300                    COBOL Name: 300-VALUE-ZOS
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - valueLprus300                  COBOL Name: 300-VALUE-LPRUS
      * - valueRpnspk300                 COBOL Name: 300-VALUE-RPNSPK
      * - isDebugSwOn100                 COBOL Name: 100-IS-DEBUG-SW-ON
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      *
      * Output :  

      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - rc                             COBOL Name: RETURN-CODE
      * - ip75081IsItEndOfProcess        COBOL Name: IP75081-IS-IT-END-OF-PROCESS
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
      
// *    Code is r and into an internal table if not               = *
// * 3. read the records from the dynamic files or internal table   *
// *    and insert into tipapim table.                              *
// * 4. on successful insertion of records into the gcms pim, delete*
// *    those rows from tamapma.                                    *
// *==> processing remotely                                         *
// * 1. retrieve data from remote tipapim                           *
// * 2. write the retrieved records into dynamic files.             *
// * 3. read the records from the dynamic files and insert into     *
// *    local tipapim table.                                        *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  PERFORM 1000-INITIALIZE-PROCESS
          initializeProcess(programCtx.getInitializeProcessInCtx());/*1000-INITIALIZE-PROCESS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2000-PROCESS-AUTH-TABLES UNTIL IP64801-88-LRM-STAT-END
          while (!(methodIn.isIp6480188LrmStatEnd()) ) {
             processAuthTables(programCtx.getProcessAuthTablesInCtx());/*2000-PROCESS-AUTH-TABLES*/
             if (programCtx.isProgramEnded()) {
                 return methodOut;
             }
          }
//  PERFORM 4000-OPEN-WRITE-SYS001-OUTFIL
          openWriteSys001Outfil(programCtx);/*4000-OPEN-WRITE-SYS001-OUTFIL*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-ZOS
          if (		compareChars(methodIn.getIp02014OperSysId(),methodIn.getValueZos300()) == 0 ) { 
//  SET 88-IP75081-MQ-SEND TO TRUE
              methodOut.setIp75081MqSend88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
//  SET 88-IP75081-END-OF-PROCESS TO TRUE
              methodOut.setIp75081EndOfProcess88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
          }
//  ELSE
          else { 
//  PERFORM 6000-END-PROCESS
              endProcess6000(programCtx.getEndProcess6000InCtx());/*6000-END-PROCESS*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-LPRUS OR IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-RPNSPK
//  ELSE
          if (		compareChars(methodIn.getIp02014PrcssAgrmtId(),methodIn.getValueLprus300()) != 0  && 		compareChars(methodIn.getIp02014PrcssAgrmtId(),methodIn.getValueRpnspk300()) != 0 ) { 
//  PERFORM 7000-CLOSE-DISCONNECT-Q
              closeDisconnectQ(programCtx.getCloseDisconnectQInCtx());/*7000-CLOSE-DISCONNECT-Q*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF 88-100-DEBUG-SW-Y AND 88-100-PROCESSING-REMOTELY
          if ( methodIn.isDebugSwY88100()   &&  methodIn.isProcessingRemotely88100()  ) { 
//  PERFORM 4500-CLOSE-SYS210-FILE
              closeSys210File(programCtx.getCloseSys210FileInCtx());/*4500-CLOSE-SYS210-FILE*/
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
      * initializeProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE-PROCESS COBOL Cyclomatic complexity - 7
      * Input  :  

      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - valueLprus300                  COBOL Name: 300-VALUE-LPRUS
      * - valueRpnspk300                 COBOL Name: 300-VALUE-RPNSPK
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      * - debugFlag800                   COBOL Name: 800-DEBUG-FLAG
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - tableRows100                   COBOL Name: 100-TABLE-ROWS
      * - checkFirstGetPim100            COBOL Name: 100-CHECK-FIRST-GET-PIM
      * - checkFirstPutPim100            COBOL Name: 100-CHECK-FIRST-PUT-PIM
      * - ip75081IsItEndOfProcess        COBOL Name: IP75081-IS-IT-END-OF-PROCESS
      * - ip75081IsFromPgm               COBOL Name: IP75081-IS-FROM-PGM
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - pimLen800                      COBOL Name: 800-PIM-LEN
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - isDebugSwOn100                 COBOL Name: 100-IS-DEBUG-SW-ON
      * - ip64801LrmRequest              COBOL Name: IP64801-LRM-REQUEST
      *
      * @throws CFException
      */
      @Override
      public InitializeProcessOutCtx initializeProcess(InitializeProcessInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph calls routines to,                               *
// * 1. update event log                                            *
// * 2. display execution messages                                  *
// * 3. set procedure pointers to called programs                   *
// * 4. open required files                                         *
// * 5. retrieve processing agreement information.                  *
// * 6. establish mq connection.                                    *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
InitializeProcessOutCtx methodOut = methodIn.getInitializeProcessOutCtx();
//  MOVE 300-PGM-IP798030 TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getPgmIp798030300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers(programCtx.getSetProcedurePointersInCtx());/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-POPULATE-PARM-TO-XTRNAL
              populateParmToXtrnal(programCtx.getPopulateParmToXtrnalInCtx());/*1300-POPULATE-PARM-TO-XTRNAL*/
//  PERFORM 1500-OPEN-READ-SYS001-INFILE
              openReadSys001Infile(programCtx);/*1500-OPEN-READ-SYS001-INFILE*/
//  PERFORM 1600-GET-ENV-CNTRL-INFO
              getEnvCntrlInfo(programCtx.getGetEnvCntrlInfoInCtx());/*1600-GET-ENV-CNTRL-INFO*/
//  PERFORM 1700-GET-RUN-CNTRL-FILE
              getRunCntrlFile(programCtx.getGetRunCntrlFileInCtx());/*1700-GET-RUN-CNTRL-FILE*/
//  PERFORM 1800-GET-PA-INFO
              getPaInfo(programCtx.getGetPaInfoInCtx());/*1800-GET-PA-INFO*/
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-LPRUS OR IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-RPNSPK
//  ELSE
              if (		compareChars(methodIn.getIp02014PrcssAgrmtId(),methodIn.getValueLprus300()) != 0  && 		compareChars(methodIn.getIp02014PrcssAgrmtId(),methodIn.getValueRpnspk300()) != 0 ) { 
//  PERFORM 1900-ESTABLISH-MQ-CONNECTION
                  establishMqConnection(programCtx.getEstablishMqConnectionInCtx());/*1900-ESTABLISH-MQ-CONNECTION*/
              }
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
//  SET IP64801-88-LRM-STAT-AOK TO TRUE
              methodOut.setIp6480188LrmStatAokTrue(); 
              
//  SET 88-TABLE-ROWS-REMAINING TO TRUE
              methodOut.setTableRowsRemaining88True(); 
              
//  DISPLAY 'IP798030-COMMIT FREQUENCY => ' 800-COMMIT-CNT
              logger.info("IP798030-COMMIT FREQUENCY => {}", String.valueOf(methodIn.getCommitCnt800())); 
//  SET 88-100-FIRST-GET-PIM TO TRUE
              methodOut.setFirstGetPim88100True(); 
              
//  SET 88-100-FIRST-PUT-PIM TO TRUE
              methodOut.setFirstPutPim88100True(); 
              
//  SET 88-IP75081-NT-END-OF-PROCESS TO TRUE
              methodOut.setIp75081NtEndOfProcess88True(); 
              
//  SET 88-IP75081-IS-FROM-PIM TO TRUE
              methodOut.setIp75081IsFromPim88True(); 
              
//  MOVE ZEROES TO 400-NO-OF-VALID-TRANS 400-MQ-PIM-REC
              methodOut.setNoOfValidTrans400(0);
              methodOut.setMqPimRec400(0);
//  MOVE LENGTH OF IP34631-TIPAPIM TO 800-PIM-LEN
              methodOut.setPimLen800(Ip34631Tipapim.getIp34631TipapimFieldLength());
//  MOVE SPACES TO IP70521-MSG-BUFFER
              methodOut.setIp70521MsgBuffer(CONSTANTS.SPACE_4000000);
//  SET 88-100-DEBUG-SW-N TO TRUE
              methodOut.setDebugSwN88100True(); 
              
//  IF 88-800-DEBUG-FLAG-Y
              if ( methodIn.isDebugFlagY88800()  ) { 
//  SET 88-100-DEBUG-SW-Y TO TRUE
                  methodOut.setDebugSwY88100True(); 
                  
              }
//  IF 88-100-DEBUG-SW-Y AND 88-100-PROCESSING-REMOTELY
              if ( methodOut.isDebugSwY88100()   &&  methodIn.isProcessingRemotely88100()  ) { 
//  PERFORM 1950-OPEN-SYS210-FILE
                  openSys210File(programCtx.getOpenSys210FileInCtx());/*1950-OPEN-SYS210-FILE*/
              }
          }
//  SET IP64801-88-LRM-STRT-REQ TO TRUE
          methodOut.setIp6480188LrmStrtReqTrue(); 
          
      
      return methodOut;
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
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
// *This paragraph displays program execution messages like program *
// *name, version, compiled date and time, etc.                     *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  MOVE 300-PGM-IP798030 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmIp798030300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_149012105));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 23
      * Input  :  

      * - pgmIp610010300                 COBOL Name: 300-PGM-IP610010
      * - pgmIp081050300                 COBOL Name: 300-PGM-IP081050
      * - pgmIp081110300                 COBOL Name: 300-PGM-IP081110
      * - pgmIp081190300                 COBOL Name: 300-PGM-IP081190
      * - pgmIp282210300                 COBOL Name: 300-PGM-IP282210
      * - pgmIp282240300                 COBOL Name: 300-PGM-IP282240
      * - pgmIp500920300                 COBOL Name: 300-PGM-IP500920
      * - pgmIp532010300                 COBOL Name: 300-PGM-IP532010
      * - pgmIp532110300                 COBOL Name: 300-PGM-IP532110
      * - pgmIp534110300                 COBOL Name: 300-PGM-IP534110
      * - pgmIp595010300                 COBOL Name: 300-PGM-IP595010
      * - pgmIp599050300                 COBOL Name: 300-PGM-IP599050
      * - pgmIp599810300                 COBOL Name: 300-PGM-IP599810
      * - pgmIp648010300                 COBOL Name: 300-PGM-IP648010
      * - pgmIp670010300                 COBOL Name: 300-PGM-IP670010
      * - pgmIp699910300                 COBOL Name: 300-PGM-IP699910
      * - pgmIp699930300                 COBOL Name: 300-PGM-IP699930
      * - pgmIp760010300                 COBOL Name: 300-PGM-IP760010
      * - pgmIp750080300                 COBOL Name: 300-PGM-IP750080
      * - pgmIp703020300                 COBOL Name: 300-PGM-IP703020
      * - pgmIp708020300                 COBOL Name: 300-PGM-IP708020
      * - pgmIp996020300                 COBOL Name: 300-PGM-IP996020
      *
      * Output :  

      * - abendPtr800                    COBOL Name: 800-ABEND-PTR
      * - ptrIp081050800                 COBOL Name: 800-PTR-IP081050
      * - ptrIp081110800                 COBOL Name: 800-PTR-IP081110
      * - ptrIp081190800                 COBOL Name: 800-PTR-IP081190
      * - ptrIp282210800                 COBOL Name: 800-PTR-IP282210
      * - ptrIp282240800                 COBOL Name: 800-PTR-IP282240
      * - ptrIp500920800                 COBOL Name: 800-PTR-IP500920
      * - ptrIp532010800                 COBOL Name: 800-PTR-IP532010
      * - ptrIp532110800                 COBOL Name: 800-PTR-IP532110
      * - ptrIp534110800                 COBOL Name: 800-PTR-IP534110
      * - ptrIp595010800                 COBOL Name: 800-PTR-IP595010
      * - ptrIp599050800                 COBOL Name: 800-PTR-IP599050
      * - ptrIp599810800                 COBOL Name: 800-PTR-IP599810
      * - ptrIp648010800                 COBOL Name: 800-PTR-IP648010
      * - ptrIp670010800                 COBOL Name: 800-PTR-IP670010
      * - ptrIp699910800                 COBOL Name: 800-PTR-IP699910
      * - ptrIp699930800                 COBOL Name: 800-PTR-IP699930
      * - ptrIp760010800                 COBOL Name: 800-PTR-IP760010
      * - ptrIp750080800                 COBOL Name: 800-PTR-IP750080
      * - ptrIp703020800                 COBOL Name: 800-PTR-IP703020
      * - ptrIp708020800                 COBOL Name: 800-PTR-IP708020
      * - ptrIp996020800                 COBOL Name: 800-PTR-IP996020
      *
      * @throws CFException
      */
      @Override
      public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph sets the procedure pointers for the called       *
// *programs.                                                       *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
SetProcedurePointersOutCtx methodOut = methodIn.getSetProcedurePointersOutCtx();
//  SET 800-ABEND-PTR TO ENTRY 300-PGM-IP610010
          methodOut.setAbendPtr800(methodIn.getPgmIp610010300()); 
          
//  SET 800-PTR-IP081050 TO ENTRY 300-PGM-IP081050
          methodOut.setPtrIp081050800(methodIn.getPgmIp081050300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          methodOut.setPtrIp081110800(methodIn.getPgmIp081110300()); 
          
//  SET 800-PTR-IP081190 TO ENTRY 300-PGM-IP081190
          methodOut.setPtrIp081190800(methodIn.getPgmIp081190300()); 
          
//  SET 800-PTR-IP282210 TO ENTRY 300-PGM-IP282210
          methodOut.setPtrIp282210800(methodIn.getPgmIp282210300()); 
          
//  SET 800-PTR-IP282240 TO ENTRY 300-PGM-IP282240
          methodOut.setPtrIp282240800(methodIn.getPgmIp282240300()); 
          
//  SET 800-PTR-IP500920 TO ENTRY 300-PGM-IP500920
          methodOut.setPtrIp500920800(methodIn.getPgmIp500920300()); 
          
//  SET 800-PTR-IP532010 TO ENTRY 300-PGM-IP532010
          methodOut.setPtrIp532010800(methodIn.getPgmIp532010300()); 
          
//  SET 800-PTR-IP532110 TO ENTRY 300-PGM-IP532110
          methodOut.setPtrIp532110800(methodIn.getPgmIp532110300()); 
          
//  SET 800-PTR-IP534110 TO ENTRY 300-PGM-IP534110
          methodOut.setPtrIp534110800(methodIn.getPgmIp534110300()); 
          
//  SET 800-PTR-IP595010 TO ENTRY 300-PGM-IP595010
          methodOut.setPtrIp595010800(methodIn.getPgmIp595010300()); 
          
//  SET 800-PTR-IP599050 TO ENTRY 300-PGM-IP599050
          methodOut.setPtrIp599050800(methodIn.getPgmIp599050300()); 
          
//  SET 800-PTR-IP599810 TO ENTRY 300-PGM-IP599810
          methodOut.setPtrIp599810800(methodIn.getPgmIp599810300()); 
          
//  SET 800-PTR-IP648010 TO ENTRY 300-PGM-IP648010
          methodOut.setPtrIp648010800(methodIn.getPgmIp648010300()); 
          
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
          methodOut.setPtrIp670010800(methodIn.getPgmIp670010300()); 
          
//  SET 800-PTR-IP699910 TO ENTRY 300-PGM-IP699910
          methodOut.setPtrIp699910800(methodIn.getPgmIp699910300()); 
          
//  SET 800-PTR-IP699930 TO ENTRY 300-PGM-IP699930
          methodOut.setPtrIp699930800(methodIn.getPgmIp699930300()); 
          
//  SET 800-PTR-IP760010 TO ENTRY 300-PGM-IP760010
          methodOut.setPtrIp760010800(methodIn.getPgmIp760010300()); 
          
//  SET 800-PTR-IP750080 TO ENTRY 300-PGM-IP750080
          methodOut.setPtrIp750080800(methodIn.getPgmIp750080300()); 
          
//  SET 800-PTR-IP703020 TO ENTRY 300-PGM-IP703020
          methodOut.setPtrIp703020800(methodIn.getPgmIp703020300()); 
          
//  SET 800-PTR-IP708020 TO ENTRY 300-PGM-IP708020
          methodOut.setPtrIp708020800(methodIn.getPgmIp708020300()); 
          
//  SET 800-PTR-IP996020 TO ENTRY 300-PGM-IP996020
          methodOut.setPtrIp996020800(methodIn.getPgmIp996020300()); 
          
      
      return methodOut;
      }
      /**
      * populateParmToXtrnal 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-POPULATE-PARM-TO-XTRNAL COBOL Cyclomatic complexity - 5
      * Input  :  

      * - retryCount800                  COBOL Name: 800-RETRY-COUNT
      * - parmJobgroup800                COBOL Name: 800-PARM-JOBGROUP
      * - parmJobgrpNum800               COBOL Name: 800-PARM-JOBGRP-NUM
      * - para1300300                    COBOL Name: 300-PARA-1300
      * - invalidParmMsgTxt696           COBOL Name: 696-INVALID-PARM-MSG-TXT
      * - jobgrpNoErrAbendCode300        COBOL Name: 300-JOBGRP-NO-ERR-ABEND-CODE
      *
      * Output :  

      * - ip30881911RetryValue           COBOL Name: IP30881-911-RETRY-VALUE
      * - retryCount800                  COBOL Name: 800-RETRY-COUNT
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1300300                    COBOL Name: 300-PARA-1300
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - invalidParmMsgTxt696           COBOL Name: 696-INVALID-PARM-MSG-TXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - jobgrpNoErrAbendCode300        COBOL Name: 300-JOBGRP-NO-ERR-ABEND-CODE
      * - jobname800                     COBOL Name: 800-JOBNAME
      * - parmJobgroup800                COBOL Name: 800-PARM-JOBGROUP
      * - jobNumber800                   COBOL Name: 800-JOB-NUMBER
      * - parmJobgrpNum800               COBOL Name: 800-PARM-JOBGRP-NUM
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      *
      * @throws CFException
      */
      @Override
      public PopulateParmToXtrnalOutCtx populateParmToXtrnal(PopulateParmToXtrnalInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This para retrieves clearing supervisor jobgroup and job number
// * from the jcl and does the validation. used as a os-job-name in
// * the tipatsk table.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
PopulateParmToXtrnalOutCtx methodOut = methodIn.getPopulateParmToXtrnalOutCtx();
//  MOVE 800-RETRY-COUNT TO IP30881-911-RETRY-VALUE
          methodOut.setIp30881911RetryValue(methodOut.getRetryCount800());
//  IF 800-PARM-JOBGROUP IS EQUAL TO SPACES OR 800-PARM-JOBGRP-NUM IS EQUAL TO ( LOW-VALUES OR SPACES OR ZEROS)
          if (        ( allSpaces(methodOut.getParmJobgroup800())   ) || (			( checkLowValue(methodOut.getParmJobgrpNum800String()) )  || compareChars(methodIn.getParms().getParmJobgrpNum800String(),CONSTANTS.SPACE_2) == 0 || 	( methodOut.getParmJobgrpNum800() == 0 ))) { 
//  MOVE 300-PARA-1300 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1300300());
//  MOVE 696-INVALID-PARM-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(66,methodOut.getInvalidParmMsgTxt696(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-JOBGRP-NO-ERR-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getJobgrpNoErrAbendCode300());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  ELSE
          else { 
//  MOVE 800-PARM-JOBGROUP TO 800-JOBNAME
              methodOut.getJobname800().setString(methodOut.getParmJobgroup800());
//  MOVE 800-PARM-JOBGRP-NUM TO 800-JOB-NUMBER
              methodOut.setJobNumber800(methodOut.getParmJobgrpNum800());
//  MOVE 800-PARM-JOBGROUP TO IP64801-LRM-JOBGRP-NAME
              methodOut.setIp64801LrmJobgrpName(methodOut.getParmJobgroup800());
//  MOVE 800-PARM-JOBGRP-NUM TO IP64801-LRM-JOBGRP-NUM
              methodOut.setIp64801LrmJobgrpNum(methodOut.getParmJobgrpNum800());
          }
      
      return methodOut;
      }
      /**
      * openReadSys001Infile 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-OPEN-READ-SYS001-INFILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void openReadSys001Infile(Ip798030Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph performs routines to open & read the settlement  *
// *code control card                                               *
// *----------------------------------------------------------------*
//  PERFORM 1510-OPEN-INPUT-SYS001
          openInputSys001(programCtx.getOpenInputSys001InCtx());/*1510-OPEN-INPUT-SYS001*/
//  PERFORM 1520-READ-INPUT-SYS001
          readInputSys001(programCtx.getReadInputSys001InCtx());/*1520-READ-INPUT-SYS001*/
//  PERFORM 8400-CLOSE-SYS001-CUTOFF
          closeSys001Cutoff(programCtx.getCloseSys001CutoffInCtx());/*8400-CLOSE-SYS001-CUTOFF*/
          ;
      
      }
      /**
      * openInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 1510-OPEN-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1510300                    COBOL Name: 300-PARA-1510
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1510300                    COBOL Name: 300-PARA-1510
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
OpenInputSys001OutCtx methodOut = methodIn.getOpenInputSys001OutCtx();
//  OPEN INPUT SYS001-CUTOFF-FILE
          sys001CutoffFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001CutoffFile.getFileName(),sys001CutoffFile.getSys001CutoffFileCharSet(),sys001CutoffFile.getSys001CutoffFileCrlfFlag());
          methodOut.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(methodOut.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              methodOut.setSys00188800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              methodOut.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1510300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * readInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 1520-READ-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1520300                    COBOL Name: 300-PARA-1520
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001CutoffRecord             COBOL Name: SYS001-CUTOFF-RECORD
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1520300                    COBOL Name: 300-PARA-1520
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public ReadInputSys001OutCtx readInputSys001(ReadInputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph reads sys001 and check file status.              *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ReadInputSys001OutCtx methodOut = methodIn.getReadInputSys001OutCtx();
//  READ SYS001-CUTOFF-FILE INTO 800-CUTOFF-TS-DATA END-READ
          	sys001CutoffFile.read();
          methodOut.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
          if (!sys001CutoffFile.hasEnded()) {
             methodOut.getSys001CutoffRecord().setString(sys001CutoffFile.getRecord());
             methodIn.getCutoffTsData800().setString(methodOut.getSys001CutoffRecord().toCharArray());
          }
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(methodOut.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              methodOut.setSys00188800True(); 
              
//  SET 88-600-FILE-READ-ERR TO TRUE
              methodOut.setFileReadErr88600True(); 
              
//  MOVE 300-PARA-1520 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1520300());
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getReadAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * getEnvCntrlInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 1600-GET-ENV-CNTRL-INFO COBOL Cyclomatic complexity - 1
      * Input  :  

      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip70511EnvCd                   COBOL Name: IP70511-ENV-CD
      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      *
      * @throws CFException
      */
      @Override
      public GetEnvCntrlInfoOutCtx getEnvCntrlInfo(GetEnvCntrlInfoInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph open/read/close sys067 environment file
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
GetEnvCntrlInfoOutCtx methodOut = methodIn.getGetEnvCntrlInfoOutCtx();
//  CALL 800-PTR-IP081190
          // CALL 800-PTR-IP081190
          	programCtx.setRc( ip081190.process(programCtx.getGlobalCtx().getContext("IP081190")));
//  MOVE 800-ENVIRONMENT-IND TO IP70511-ENV-CD
          methodOut.setIp70511EnvCd(methodOut.getEnvironmentInd800());
      
      return methodOut;
      }
      /**
      * getRunCntrlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1700-GET-RUN-CNTRL-FILE COBOL Cyclomatic complexity - 1
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
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
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
      * getPaInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 1800-GET-PA-INFO COBOL Cyclomatic complexity - 8
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - clearingApplicationId300       COBOL Name: 300-CLEARING-APPLICATION-ID
      * - ip69931ResponseStatus          COBOL Name: IP69931-RESPONSE-STATUS
      * - para1800300                    COBOL Name: 300-PARA-1800
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - ip699930ErrAbendCode300        COBOL Name: 300-IP699930-ERR-ABEND-CODE
      *
      * Output :  

      * - ip02015PrcssAgrmtTable         COBOL Name: IP02015-PRCSS-AGRMT-TABLE
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip28221Restart                 COBOL Name: IP28221-RESTART
      * - rc                             COBOL Name: RETURN-CODE
      * - ip02015HostGeoScopeCode        COBOL Name: IP02015-HOST-GEO-SCOPE-CODE
      * - ip02015PaIndex                 COBOL Name: IP02015-PA-INDEX
      * - ip02015PasFoundCount           COBOL Name: IP02015-PAS-FOUND-COUNT
      * - ip02015GeoScopeCode            COBOL Name: IP02015-GEO-SCOPE-CODE
      * - ip02015PrcssAgrmtId            COBOL Name: IP02015-PRCSS-AGRMT-ID
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - ip69931ApplicationSystemId     COBOL Name: IP69931-APPLICATION-SYSTEM-ID
      * - clearingApplicationId300       COBOL Name: 300-CLEARING-APPLICATION-ID
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1800300                    COBOL Name: 300-PARA-1800
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip699930ErrAbendCode300        COBOL Name: 300-IP699930-ERR-ABEND-CODE
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
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
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
GetPaInfoOutCtx methodOut = methodIn.getGetPaInfoOutCtx();
//  INITIALIZE IP02015-PRCSS-AGRMT-TABLE
          methodOut.getIp02015PrcssAgrmtTable().initialize();
//  SET 88-100-PROCESSING-LOCAL TO TRUE
          methodOut.setProcessingLocal88100True(); 
          
//  SET 88-IP28221-IP282210-NO-RESTRT TO TRUE
          methodOut.setIp28221Ip282210NoRestrt88True(); 
          
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               programCtx.setRc( ip282210.call(programCtx.getGlobalCtx().getContext("IP282210"),methodOut.getIp28221PaTableRestart()));
//  IF 88-IP02015-HOST-PA-LOCAL OR 88-IP02015-HOST-PA-REGIONAL
          if ( methodOut.isIp02015HostPaLocal88()   ||  methodOut.isIp02015HostPaRegional88()  ) { 
//  SET 88-100-PROCESSING-REMOTELY TO TRUE
              methodOut.setProcessingRemotely88100True(); 
              
//  PERFORM VARYING IP02015-PA-INDEX FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL IP02015-PA-INDEX > IP02015-PAS-FOUND-COUNT OR IP69931-PROCESSING-AGREEMENT > SPACES
              for (methodOut.setIp02015PaIndex(methodIn.getValue1300()); (	( methodOut.getIp02015PaIndex() <= methodOut.getIp02015PasFoundCount() ) &&                    ( isLessOrEqualSpaces(methodOut.getIp69931ProcessingAgreement()) )) ; methodOut.setIp02015PaIndex(methodOut.getIp02015PaIndex() + methodIn.getValue1300()) ) {
//  IF IP02015-GEO-SCOPE-CODE ( IP02015-PA-INDEX ) = 'G'
                  if (methodOut.getIp02015GeoScopeCode(methodOut.getIp02015PaIndex() - 1)[0] == 'G') { 
//  MOVE IP02015-PRCSS-AGRMT-ID ( IP02015-PA-INDEX ) TO IP69931-PROCESSING-AGREEMENT
                      methodOut.setIp69931ProcessingAgreement(methodOut.getIp02015PrcssAgrmtId(methodOut.getIp02015PaIndex() - 1));
//  MOVE 300-CLEARING-APPLICATION-ID TO IP69931-APPLICATION-SYSTEM-ID
                      methodOut.setIp69931ApplicationSystemId(methodOut.getClearingApplicationId300());
//  CALL 800-PTR-IP699930
                      // CALL 800-PTR-IP699930
                      	programCtx.setRc( ip699930.process(programCtx.getGlobalCtx().getContext("IP699930")));
//  IF 88-IP69931-REQUEST-FAILED
                      if ( methodIn.isIp69931RequestFailed88()  ) { 
//  MOVE 300-PARA-1800 TO 900-ABEND-PARA
                          methodOut.setAbendPara900(methodOut.getPara1800300());
//  MOVE IP69931-ERROR-MSG TO 900-ABEND-TEXT
                          methodOut.setAbendText900(methodOut.getIp69931ErrorMsg());
//  MOVE 300-IP699930-ERR-ABEND-CODE TO 900-ABEND-CODE
                          methodOut.setAbendCode900(methodOut.getIp699930ErrAbendCode300());
//  PERFORM 9500-ABEND-THE-PROGRAM
                          abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
                      }
                  }
              }
          }
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP02014-PRCSS-AGRMT-ID
          methodOut.setIp02014PrcssAgrmtId(methodOut.getIp02015HostPrcssAgrmtId());
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               programCtx.setRc( ip282210.call(programCtx.getGlobalCtx().getContext("IP282210"),methodOut.getIp28221PaTableRestart()));
      
      return methodOut;
      }
      /**
      * establishMqConnection 
      *   This method is derived from 
  *   COBOL Paragraph - 1900-ESTABLISH-MQ-CONNECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - cloneOwnerId800                COBOL Name: 800-CLONE-OWNER-ID
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip02014OperSysId               COBOL Name: IP02014-OPER-SYS-ID
      * - valueLinux300                  COBOL Name: 300-VALUE-LINUX
      *
      * Output :  

      * - ip70511CloneOwnerId            COBOL Name: IP70511-CLONE-OWNER-ID
      * - cloneOwnerId800                COBOL Name: 800-CLONE-OWNER-ID
      * - rc                             COBOL Name: RETURN-CODE
      * - ip70511Cpu                     COBOL Name: IP70511-CPU
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      * - ip57901JobGroup                COBOL Name: IP57901-JOB-GROUP
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip57901JobGrpNum               COBOL Name: IP57901-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip70511HostPrcssAgrmtId        COBOL Name: IP70511-HOST-PRCSS-AGRMT-ID
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip34051ProcessSwitch           COBOL Name: IP34051-PROCESS-SWITCH
      * - ip34051QueueType               COBOL Name: IP34051-QUEUE-TYPE
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip34051FuncCd                  COBOL Name: IP34051-FUNC-CD
      * - ip34051TipacliSwitch           COBOL Name: IP34051-TIPACLI-SWITCH
      * - ip34051TipasvcSwitch           COBOL Name: IP34051-TIPASVC-SWITCH
      * - ip34051CallFromIp545110        COBOL Name: IP34051-CALL-FROM-IP545110
      *
      * @throws CFException
      */
      @Override
      public EstablishMqConnectionOutCtx establishMqConnection(EstablishMqConnectionInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph is used to perform the mq connection.
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
EstablishMqConnectionOutCtx methodOut = methodIn.getEstablishMqConnectionOutCtx();
//  MOVE 800-CLONE-OWNER-ID TO IP70511-CLONE-OWNER-ID
          methodOut.setIp70511CloneOwnerId(methodOut.getCloneOwnerId800());
//  CALL 800-PTR-IP996020
          // CALL 800-PTR-IP996020
          	programCtx.setRc( ip996020.process(programCtx.getGlobalCtx().getContext("IP996020")));
//  MOVE IP996021-LPAR-NAME TO IP70511-CPU
          methodOut.setIp70511Cpu(methodOut.getIp996021LparName());
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP57901-JOB-GROUP
          methodOut.setIp57901JobGroup(methodOut.getIp64801LrmJobgrpName());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP57901-JOB-GRP-NUM
          methodOut.setIp57901JobGrpNum( methodOut.getIp64801LrmJobgrpNum());
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP70511-HOST-PRCSS-AGRMT-ID
          methodOut.setIp70511HostPrcssAgrmtId(methodOut.getIp02015HostPrcssAgrmtId());
//  SET 88-IP34051-REQUEST-START TO TRUE
          methodOut.setIp34051RequestStart88True(); 
          
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-LINUX
          if (		compareChars(methodIn.getIp02014OperSysId(),methodIn.getValueLinux300()) == 0 ) { 
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              methodOut.setIp34051RespnseQ88True(); 
              
          }
//  ELSE
          else { 
//  SET 88-IP34051-REQUEST-Q TO TRUE
              methodOut.setIp34051RequestQ88True(); 
              
          }
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
      
      return methodOut;
      }
      /**
      * openSys210File 
      *   This method is derived from 
  *   COBOL Paragraph - 1950-OPEN-SYS210-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1950300                    COBOL Name: 300-PARA-1950
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1950300                    COBOL Name: 300-PARA-1950
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenSys210FileOutCtx openSys210File(OpenSys210FileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragrpah is used to open sys210 file.
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
OpenSys210FileOutCtx methodOut = methodIn.getOpenSys210FileOutCtx();
//  OPEN OUTPUT SYS210-MQ-DATA-FILE
          sys210MqDataFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys210MqDataFile.getFileName(),sys210MqDataFile.getSys210MqDataFileCharSet(),sys210MqDataFile.getSys210MqDataFileCrlfFlag());
          methodOut.setSys210FileStatus200(sys210MqDataFile.getStatusString() );
//  IF 88-200-SYS210-IO-GOOD
//  ELSE
          if (!(methodOut.isSys210IoGood88200()) ) { 
//  SET 88-800-SYS210 TO TRUE
              methodOut.setSys21088800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              methodOut.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS210-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys210FileStatus200());
//  MOVE 300-PARA-1950 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1950300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * processAuthTables 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-AUTH-TABLES COBOL Cyclomatic complexity - 10
      * Input  :  

      * - launchType800                  COBOL Name: 800-LAUNCH-TYPE
      * - value1300                      COBOL Name: 300-VALUE-1
      * - is1stLrmSwitch100              COBOL Name: 100-IS-1ST-LRM-SWITCH
      * - ip02014OperSysId               COBOL Name: IP02014-OPER-SYS-ID
      * - valueZos300                    COBOL Name: 300-VALUE-ZOS
      * - valueLinux300                  COBOL Name: 300-VALUE-LINUX
      * - cyclId7800                     COBOL Name: 800-CYCL-ID-7
      *
      * Output :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - value1300                      COBOL Name: 300-VALUE-1
      * - is1stLrmSwitch100              COBOL Name: 100-IS-1ST-LRM-SWITCH
      * - tableRows100                   COBOL Name: 100-TABLE-ROWS
      * - ip64801LrmRequest              COBOL Name: IP64801-LRM-REQUEST
      *
      * @throws CFException
      */
      @Override
      public ProcessAuthTablesOutCtx processAuthTables(ProcessAuthTablesInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph skips lrm look-up if it is of pre-clearing       *
// *catch-up process. this is because irrespective of lrm status,   *
// *we need to ensure all records from auth tables are synced up    *
// *to clearing gcms side. this would eliminate the need for        *
// *tipalrm table to be updated as part of pre-launch schedule.     *
// *(i.e.) the catch-up lrm process should be independent of        *
// *clearing pre-launch schedule.                                   *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessAuthTablesOutCtx methodOut = methodIn.getProcessAuthTablesOutCtx();
//  PERFORM 8500-SELECT-CKP
          selectCkp(programCtx.getSelectCkpInCtx());/*8500-SELECT-CKP*/
//  PERFORM 2800-SET-BEGINNING-TS
          setBeginningTs(programCtx.getSetBeginningTsInCtx());/*2800-SET-BEGINNING-TS*/
//  EVALUATE TRUE
          if  ( methodIn.isItIsPreclear88800()  ) { 
//  SET IP64801-88-LRM-STAT-AOK TO TRUE
              methodOut.setIp6480188LrmStatAokTrue(); 
              
//  MOVE 300-VALUE-1 TO IP30771-CLR-CYCL-ID
              methodOut.setIp30771ClrCyclId(methodOut.getValue1300());
          }
          else if  ( methodIn.isItIs1stSet88100()  ) { 
//  PERFORM 2700-CHECK-CLR-CYCL-ID
              checkClrCyclId(programCtx.getCheckClrCyclIdInCtx());/*2700-CHECK-CLR-CYCL-ID*/
//  PERFORM 8200-CALL-LRM-IP648010
              callLrmIp648010(programCtx.getCallLrmIp648010InCtx());/*8200-CALL-LRM-IP648010*/
//  SET 88-100-IT-IS-1ST-NO-SET TO TRUE
              methodOut.setItIs1stNoSet88100True(); 
              
          }
          else   { 
//  PERFORM 2700-CHECK-CLR-CYCL-ID
              checkClrCyclId(programCtx.getCheckClrCyclIdInCtx());/*2700-CHECK-CLR-CYCL-ID*/
          }
//  IF IP64801-88-LRM-STAT-AOK
          if ( methodOut.isIp6480188LrmStatAok()  ) { 
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-ZOS
              if (		compareChars(methodIn.getIp02014OperSysId(),methodIn.getValueZos300()) == 0 ) { 
//  PERFORM 2100-RETRV-AUTH-DB2-DATA
                  retrvAuthDb2Data(programCtx.getRetrvAuthDb2DataInCtx());/*2100-RETRV-AUTH-DB2-DATA*/
//  PERFORM 2200-PROCESS-AUTH-DB2-DATA
                  processAuthDb2Data(programCtx.getProcessAuthDb2DataInCtx());/*2200-PROCESS-AUTH-DB2-DATA*/
//  PERFORM 2300-DELETE-AUTH-DB2-DATA
                  deleteAuthDb2Data(programCtx.getDeleteAuthDb2DataInCtx());/*2300-DELETE-AUTH-DB2-DATA*/
//  PERFORM 3000-END-PROCESS
                  endProcess(programCtx.getEndProcessInCtx());/*3000-END-PROCESS*/
              }
//  ELSE
              else { 
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-LINUX
                  if (		compareChars(methodIn.getIp02014OperSysId(),methodIn.getValueLinux300()) == 0 ) { 
//  PERFORM 5000-PROCESS-VIA-MQ
                      processViaMq(programCtx.getProcessViaMqInCtx());/*5000-PROCESS-VIA-MQ*/
//  SET 88-TABLE-ROWS-END TO TRUE
                      methodOut.setTableRowsEnd88True(); 
                      
                  }
              }
//  IF 88-TABLE-ROWS-END OR IP30771-CLR-CYCL-ID EQUAL 800-CYCL-ID-7
              if ( methodOut.isTableRowsEnd88()   || 	( methodOut.getIp30771ClrCyclId() == methodIn.getCyclId7800() ) ) { 
//  IF 88-800-IT-IS-PRECLEAR
                  if ( methodIn.isItIsPreclear88800()  ) { 
//  SET IP64801-88-LRM-STAT-END TO TRUE
                      methodOut.setIp6480188LrmStatEndTrue(); 
                      
                  }
//  ELSE
                  else { 
//  SET IP64801-88-LRM-DONE-REQ TO TRUE
                      methodOut.setIp6480188LrmDoneReqTrue(); 
                      
//  PERFORM 8200-CALL-LRM-IP648010
                      callLrmIp648010(programCtx.getCallLrmIp648010InCtx());/*8200-CALL-LRM-IP648010*/
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * retrvAuthDb2Data 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-RETRV-AUTH-DB2-DATA COBOL Cyclomatic complexity - 3
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip69931DatabaseId              COBOL Name: IP69931-DATABASE-ID
      * - ip69931CollectionId            COBOL Name: IP69931-COLLECTION-ID
      *
      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - ip69901DatabaseId              COBOL Name: IP69901-DATABASE-ID
      * - ip69931DatabaseId              COBOL Name: IP69931-DATABASE-ID
      * - ip69901CollectionId            COBOL Name: IP69901-COLLECTION-ID
      * - ip69931CollectionId            COBOL Name: IP69931-COLLECTION-ID
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public RetrvAuthDb2DataOutCtx retrvAuthDb2Data(RetrvAuthDb2DataInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph establishes connection to either the auth db2    *
// *server or remote processing site for retrieval of data from     *
// *tamapma.                                                        *
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
RetrvAuthDb2DataOutCtx methodOut = methodIn.getRetrvAuthDb2DataOutCtx();
//  SET 88-IP69901-CAF-INIT TO TRUE
          methodOut.setIp69901CafInit88True(); 
          
//  IF 88-100-PROCESSING-REMOTELY
          if ( methodIn.isProcessingRemotely88100()  ) { 
//  MOVE IP69931-DATABASE-ID TO IP69901-DATABASE-ID
              methodOut.setIp69901DatabaseId(methodOut.getIp69931DatabaseId());
//  MOVE IP69931-COLLECTION-ID TO IP69901-COLLECTION-ID
              methodOut.setIp69901CollectionId(methodOut.getIp69931CollectionId());
          }
//  CALL 800-PTR-IP699910
          // CALL 800-PTR-IP699910
          	programCtx.setRc( ip699910.process(programCtx.getGlobalCtx().getContext("IP699910")));
//  IF 88-100-PROCESSING-REMOTELY
          if ( methodIn.isProcessingRemotely88100()  ) { 
//  PERFORM 2120-PROCESS-AUTH-PIM
              processAuthPim(programCtx.getProcessAuthPimInCtx());/*2120-PROCESS-AUTH-PIM*/
          }
//  ELSE
          else { 
//  PERFORM 2110-PROCESS-AUTH-PMA
              processAuthPma(programCtx.getProcessAuthPmaInCtx());/*2110-PROCESS-AUTH-PMA*/
          }
      
      return methodOut;
      }
      /**
      * processAuthPma 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-PROCESS-AUTH-PMA COBOL Cyclomatic complexity - 6
      * Input  :  

      * - value5300                      COBOL Name: 300-VALUE-5
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      * - ip58041ActionCode              COBOL Name: IP58041-ACTION-CODE
      * - valueR300                      COBOL Name: 300-VALUE-R
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - isSys202OpenSw100              COBOL Name: 100-IS-SYS202-OPEN-SW
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - apiSwitch100                   COBOL Name: 100-API-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value5300                      COBOL Name: 300-VALUE-5
      * - rc                             COBOL Name: RETURN-CODE
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      *
      * @throws CFException
      */
      @Override
      public ProcessAuthPmaOutCtx processAuthPma(ProcessAuthPmaInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph -                                                *
// *1) retrieve auth data from tamapma or tipapim for remote        *
// *2) write the pma records to internal table/file                 *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessAuthPmaOutCtx methodOut = methodIn.getProcessAuthPmaOutCtx();
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          
//  SET 88-100-OPEN-FIRST-TIME TO TRUE
          methodOut.setOpenFirstTime88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-5 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue5300());
//  CALL 800-PTR-IP534110
          // CALL 800-PTR-IP534110
          	programCtx.setRc( ip534110.process(programCtx.getGlobalCtx().getContext("IP534110")));
//  IF 88-100-ROWS-FOUND
          if ( methodOut.isRowsFound88100()  ) { 
//  SET 88-100-END-PROS-N TO TRUE
              methodOut.setEndProsN88100True(); 
              
//  ADD 1 TO 400-TAMAPMA-ROWS-FETCHED
              methodOut.setTamapmaRowsFetched400(methodOut.getTamapmaRowsFetched400()+1);
//  IF IP58041-ACTION-CODE = 300-VALUE-R
              if (		compareChars(methodIn.getIp58041ActionCode(),methodIn.getValueR300()) == 0 ) { 
//  PERFORM 2111-ALLOCATE-SYS202-OUTFILE
                  allocateSys202Outfile(programCtx.getAllocateSys202OutfileInCtx());/*2111-ALLOCATE-SYS202-OUTFILE*/
//  PERFORM 2112-OPEN-OP-SYS202-PMAFILE
                  openOpSys202Pmafile(programCtx.getOpenOpSys202PmafileInCtx());/*2112-OPEN-OP-SYS202-PMAFILE*/
              }
//  IF 88-100-PROCESSING-LOCAL AND IP58041-ACTION-CODE NOT = 300-VALUE-R
//  ELSE
              if (!(methodIn.isProcessingLocal88100())  || 		compareChars(methodIn.getIp58041ActionCode(),methodIn.getValueR300()) == 0 ) { 
//  PERFORM 2114-FETCH-VCN
                  fetchVcn(programCtx.getFetchVcnInCtx());/*2114-FETCH-VCN*/
              }
          }
//  ELSE
          else { 
//  SET 88-100-END-PROS-Y TO TRUE
              methodOut.setEndProsY88100True(); 
              
          }
//  IF 88-100-SYS202-OPEN-Y
          if ( methodIn.isSys202OpenY88100()  ) { 
//  PERFORM 8420-CLOSE-SYS202-PMAFILE
              closeSys202Pmafile(programCtx.getCloseSys202PmafileInCtx());/*8420-CLOSE-SYS202-PMAFILE*/
          }
      
      return methodOut;
      }
      /**
      * allocateSys202Outfile 
      *   This method is derived from 
  *   COBOL Paragraph - 2111-ALLOCATE-SYS202-OUTFILE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - pimBulkFileTypeCd800           COBOL Name: 800-PIM-BULK-FILE-TYPE-CD
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - outputDsn800                   COBOL Name: 800-OUTPUT-DSN
      *
      * Output :  

      * - ip38201McidynamParms           COBOL Name: IP38201-MCIDYNAM-PARMS
      * - ip38201Lrecl                   COBOL Name: IP38201-LRECL
      * - ip38201Dd                      COBOL Name: IP38201-DD
      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - ip38201BulkType                COBOL Name: IP38201-BULK-TYPE
      * - pimBulkFileTypeCd800           COBOL Name: 800-PIM-BULK-FILE-TYPE-CD
      * - ip38201ClearingIdentifier      COBOL Name: IP38201-CLEARING-IDENTIFIER
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - sys202Dsn800                   COBOL Name: 800-SYS202-DSN
      * - outputDsn800                   COBOL Name: 800-OUTPUT-DSN
      *
      * @throws CFException
      */
      @Override
      public AllocateSys202OutfileOutCtx allocateSys202Outfile(AllocateSys202OutfileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *Allocate output file dynamically by calling ip760010            *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
AllocateSys202OutfileOutCtx methodOut = methodIn.getAllocateSys202OutfileOutCtx();
//  INITIALIZE IP38201-MCIDYNAM-PARMS
          methodOut.getIp38201McidynamParms().initialize();
//  MOVE LENGTH OF IP34631-TIPAPIM TO IP38201-LRECL
          methodOut.setIp38201Lrecl(Ip34631Tipapim.getIp34631TipapimFieldLength());
//  MOVE 300-DD-SYS202 TO IP38201-DD
          methodOut.setIp38201Dd(pad(8,methodOut.getDdSys202300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-PIM-BULK-FILE-TYPE-CD TO IP38201-BULK-TYPE
          methodOut.setIp38201BulkType(methodOut.getPimBulkFileTypeCd800());
//  MOVE 300-VALUE-PIM (1 : 3) TO IP38201-CLEARING-IDENTIFIER (1 : 3)
          methodOut.setIp38201ClearingIdentifier(methodOut.getValuePim300(),0/* valuePim300 */ ,3,0,3 /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8300-CALL-MCDYNAM-ROUTINE
          callMcdynamRoutine(programCtx.getCallMcdynamRoutineInCtx());/*8300-CALL-MCDYNAM-ROUTINE*/
          // MOVE 800-OUTPUT-DSN TO 800-SYS202-DSN
          methodOut.setSys202Dsn800(methodOut.getOutputDsn800());
      
      return methodOut;
      }
      /**
      * openOpSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 2112-OPEN-OP-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para2112300                    COBOL Name: 300-PARA-2112
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - isSys202OpenSw100              COBOL Name: 100-IS-SYS202-OPEN-SW
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2112300                    COBOL Name: 300-PARA-2112
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenOpSys202PmafileOutCtx openOpSys202Pmafile(OpenOpSys202PmafileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens the pma file for output                    *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
OpenOpSys202PmafileOutCtx methodOut = methodIn.getOpenOpSys202PmafileOutCtx();
//  OPEN OUTPUT SYS202-PMA-FILE
          sys202PmaFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202PmaFile.getFileName(),sys202PmaFile.getSys202PmaFileCharSet(),sys202PmaFile.getSys202PmaFileCrlfFlag());
          methodOut.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
          if ( methodOut.isSys202IoGood88200()  ) { 
//  SET 88-100-SYS202-OPEN-Y TO TRUE
              methodOut.setSys202OpenY88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-800-SYS202 TO TRUE
              methodOut.setSys20288800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              methodOut.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys202FileStatus200());
//  MOVE 300-PARA-2112 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2112300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * writePmaRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 2113-WRITE-PMA-RECORD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202PmaRecord                COBOL Name: SYS202-PMA-RECORD
      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - para2113300                    COBOL Name: 300-PARA-2113
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2113300                    COBOL Name: 300-PARA-2113
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public WritePmaRecordOutCtx writePmaRecord(WritePmaRecordInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph writes pma record read from auth table.          *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
WritePmaRecordOutCtx methodOut = methodIn.getWritePmaRecordOutCtx();
//  WRITE SYS202-PMA-RECORD FROM IP34631-TIPAPIM
          sys202PmaFile.write(methodIn.getIp34631Tipapim().toCharArray()); 
          methodOut.getSys202PmaRecord().setString(CONSTANTS.LOW_VALUE_1253878022);
          methodOut.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
          if ( methodOut.isSys202IoGood88200()  ) { 
//  ADD 1 TO 400-SYS202-COUNT
              methodOut.setSys202Count400(methodOut.getSys202Count400()+1);
          }
//  ELSE
          else { 
//  SET 88-800-SYS202 TO TRUE
              methodOut.setSys20288800True(); 
              
//  SET 88-600-FILE-WRITE-ERR TO TRUE
              methodOut.setFileWriteErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys202FileStatus200());
//  MOVE 300-PARA-2113 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2113300());
//  MOVE 300-WRITE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getWriteAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * fetchVcn 
      *   This method is derived from 
  *   COBOL Paragraph - 2114-FETCH-VCN COBOL Cyclomatic complexity - 3
      * Input  :  

      * - value18300                     COBOL Name: 300-VALUE-18
      * - tipapimRowsReplaced400         COBOL Name: 400-TIPAPIM-ROWS-REPLACED
      *
      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - rc                             COBOL Name: RETURN-CODE
      * - isRowsFound100                 COBOL Name: 100-IS-ROWS-FOUND
      * - isOpenSw100                    COBOL Name: 100-IS-OPEN-SW
      * - queryNo                        COBOL Name: QUERY-NO
      * - value18300                     COBOL Name: 300-VALUE-18
      * - tipapimRowsReplaced400         COBOL Name: 400-TIPAPIM-ROWS-REPLACED
      * - ip34631ObsAccessTs             COBOL Name: IP34631-OBS-ACCESS-TS
      * - ip34631ObsAccessTsN            COBOL Name: IP34631-OBS-ACCESS-TS-N
      *
      * @throws CFException
      */
      @Override
      public FetchVcnOutCtx fetchVcn(FetchVcnInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Fetch vcn for old rcn and write ercords to o/p file
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
FetchVcnOutCtx methodOut = methodIn.getFetchVcnOutCtx();
//  SET 88-IP69901-CAF-RESET TO TRUE
          methodOut.setIp69901CafReset88True(); 
          
//  CALL 800-PTR-IP699910
          // CALL 800-PTR-IP699910
          	programCtx.setRc( ip699910.process(programCtx.getGlobalCtx().getContext("IP699910")));
//  SET 88-100-ROWS-FOUND-R TO TRUE
          methodOut.setRowsFoundR88100True(); 
          
//  SET 88-100-OPEN-FIRST-TIME-R TO TRUE
          methodOut.setOpenFirstTimeR88100True(); 
          
//  MOVE 300-VALUE-18 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue18300());
//  PERFORM UNTIL 88-100-ROWS-NOT-FND-R
          while ((!(methodOut.isRowsNotFndR88100()) )) {
//  CALL 800-PTR-IP532110
              // CALL 800-PTR-IP532110
              	programCtx.setRc( ip532110.process(programCtx.getGlobalCtx().getContext("IP532110")));
//  IF 88-100-ROWS-FOUND-R
              if ( methodOut.isRowsFoundR88100()  ) { 
//  ADD 1 TO 400-TIPAPIM-ROWS-REPLACED
                  methodOut.setTipapimRowsReplaced400(methodOut.getTipapimRowsReplaced400()+1);
//  PERFORM 8220-POPULATE-PIM-VARIABLES
                  populatePimVariables(programCtx.getPopulatePimVariablesInCtx());/*8220-POPULATE-PIM-VARIABLES*/
//  MOVE SPACES TO IP34631-OBS-ACCESS-TS
                  methodOut.setIp34631ObsAccessTs(CONSTANTS.SPACE_26);
//  MOVE ZEROS TO IP34631-OBS-ACCESS-TS-N
                  methodOut.setIp34631ObsAccessTsN(CONSTANTS.ZERO_1);
//  PERFORM 2113-WRITE-PMA-RECORD
                  writePmaRecord(programCtx.getWritePmaRecordInCtx());/*2113-WRITE-PMA-RECORD*/
              }
          }
      
      return methodOut;
      }
      /**
      * processAuthPim 
      *   This method is derived from 
  *   COBOL Paragraph - 2120-PROCESS-AUTH-PIM COBOL Cyclomatic complexity - 8
      * Input  :  

      * - value17300                     COBOL Name: 300-VALUE-17
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip34631PrimAccountNbr          COBOL Name: IP34631-PRIM-ACCOUNT-NBR
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - apiSwitch100                   COBOL Name: 100-API-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value17300                     COBOL Name: 300-VALUE-17
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - rc                             COBOL Name: RETURN-CODE
      * - isRecordEligible100            COBOL Name: 100-IS-RECORD-ELIGIBLE
      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      * - ip34631PrimAccountNbr          COBOL Name: IP34631-PRIM-ACCOUNT-NBR
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      *
      * @throws CFException
      */
      @Override
      public ProcessAuthPimOutCtx processAuthPim(ProcessAuthPimInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph -                                                *
// *1) retrieve auth data from tiappim for remote                   *
// *2) allocate sys202 file in output mode                          *
// *3) write the pim records to dynamically allocated output file   *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessAuthPimOutCtx methodOut = methodIn.getProcessAuthPimOutCtx();
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          
//  SET 88-100-OPEN-FIRST-TIME TO TRUE
          methodOut.setOpenFirstTime88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  MOVE 300-VALUE-17 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue17300());
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  PERFORM UNTIL 88-100-ROWS-NOT-FND
          while ((!(methodOut.isRowsNotFnd88100()) )) {
//  CALL 800-PTR-IP532010
              // CALL 800-PTR-IP532010
              	programCtx.setRc( ip532010.process(programCtx.getGlobalCtx().getContext("IP532010")));
//  IF 88-100-ROWS-FOUND
              if ( methodOut.isRowsFound88100()  ) { 
//  SET 88-100-RECORD-ELIGIBLE TO TRUE
                  methodOut.setRecordEligible88100True(); 
                  
//  IF 88-100-PROCESSING-REMOTELY
                  if ( methodIn.isProcessingRemotely88100()  ) { 
//  MOVE IP34631-PRIM-ACCOUNT-NBR TO IP08151-PASSED-ACCT-NBR
                      methodOut.setIp08151PassedAcctNbr(methodOut.getIp34631PrimAccountNbr());
//  CALL 800-PTR-IP081050
                      // CALL 800-PTR-IP081050
                      	programCtx.setRc( ip081050.process(programCtx.getGlobalCtx().getContext("IP081050")));
//  PERFORM 8100-FIND-ACC-ELIGIBILITY
                      findAccEligibility(programCtx.getFindAccEligibilityInCtx());/*8100-FIND-ACC-ELIGIBILITY*/
                  }
//  IF 88-100-RECORD-ELIGIBLE
                  if ( methodOut.isRecordEligible88100()  ) { 
//  ADD 1 TO 400-TIPAPIM-ROWS-FETCHED
                      methodOut.setTipapimRowsFetched400(methodOut.getTipapimRowsFetched400()+1);
//  IF 400-TIPAPIM-ROWS-FETCHED EQUAL 1
                      if (	( methodOut.getTipapimRowsFetched400() == 1 )) { 
//  PERFORM 2111-ALLOCATE-SYS202-OUTFILE
                          allocateSys202Outfile(programCtx.getAllocateSys202OutfileInCtx());/*2111-ALLOCATE-SYS202-OUTFILE*/
//  PERFORM 2112-OPEN-OP-SYS202-PMAFILE
                          openOpSys202Pmafile(programCtx.getOpenOpSys202PmafileInCtx());/*2112-OPEN-OP-SYS202-PMAFILE*/
                      }
//  PERFORM 2113-WRITE-PMA-RECORD
                      writePmaRecord(programCtx.getWritePmaRecordInCtx());/*2113-WRITE-PMA-RECORD*/
                  }
              }
          }
//  IF 88-100-ROWS-NOT-FND
          if ( methodOut.isRowsNotFnd88100()  ) { 
//  SET 88-100-END-PROS-Y TO TRUE
              methodOut.setEndProsY88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-100-END-PROS-N TO TRUE
              methodOut.setEndProsN88100True(); 
              
          }
//  IF 400-TIPAPIM-ROWS-FETCHED GREATER THAN ZEROES
          if (	( methodOut.getTipapimRowsFetched400() > 0 )) { 
//  PERFORM 8420-CLOSE-SYS202-PMAFILE
              closeSys202Pmafile(programCtx.getCloseSys202PmafileInCtx());/*8420-CLOSE-SYS202-PMAFILE*/
          }
      
      return methodOut;
      }
      /**
      * processAuthDb2Data 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-AUTH-DB2-DATA COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ProcessAuthDb2DataOutCtx processAuthDb2Data(ProcessAuthDb2DataInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph -                                                *
// *1) establishes db2 connection from auth server or remote site   *
// *2) processes dynamically allocated pim entries and insert into  *
// *   gcms tables.                                                 *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessAuthDb2DataOutCtx methodOut = methodIn.getProcessAuthDb2DataOutCtx();
//  SET 88-IP69901-CAF-RESET TO TRUE
          methodOut.setIp69901CafReset88True(); 
          
//  CALL 800-PTR-IP699910
          // CALL 800-PTR-IP699910
          	programCtx.setRc( ip699910.process(programCtx.getGlobalCtx().getContext("IP699910")));
//  PERFORM 2210-PROCESS-PMA-ENTRIES
          processPmaEntries(programCtx.getProcessPmaEntriesInCtx());/*2210-PROCESS-PMA-ENTRIES*/
          ;
      
      return methodOut;
      }
      /**
      * processPmaEntries 
      *   This method is derived from 
  *   COBOL Paragraph - 2210-PROCESS-PMA-ENTRIES COBOL Cyclomatic complexity - 6
      * Input  :  

      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - cutoffPimTmpTs800              COBOL Name: 800-CUTOFF-PIM-TMP-TS
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      *
      * Output :  

      * - updateModFileInd800            COBOL Name: 800-UPDATE-MOD-FILE-IND
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      * - cutoffPimTmpTs800              COBOL Name: 800-CUTOFF-PIM-TMP-TS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      *
      * @throws CFException
      */
      @Override
      public ProcessPmaEntriesOutCtx processPmaEntries(ProcessPmaEntriesInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Perform inserts into the gcms pim table only if any record was
// *was retrieved and written for the cutoff timestamps from the auth
// *or global pma table.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessPmaEntriesOutCtx methodOut = methodIn.getProcessPmaEntriesOutCtx();
//  IF 400-SYS202-COUNT > ZEROES
          if (	( methodIn.getSys202Count400() > 0 )) { 
//  PERFORM 8430-OPEN-IP-SYS202-PMAFILE
              openIpSys202Pmafile(programCtx.getOpenIpSys202PmafileInCtx());/*8430-OPEN-IP-SYS202-PMAFILE*/
//  MOVE 300-VALUE-PIM TO 800-UPDATE-MOD-FILE-IND
              methodOut.setUpdateModFileInd800(methodOut.getValuePim300());
//  PERFORM 2211-READ-PMA-INSERT-PIM UNTIL 88-200-SYS202-EOF
              while (!(methodIn.isSys202Eof88200()) ) {
                 readPmaInsertPim(programCtx.getReadPmaInsertPimInCtx());/*2211-READ-PMA-INSERT-PIM*/
              }
//  PERFORM 8420-CLOSE-SYS202-PMAFILE
              closeSys202Pmafile(programCtx.getCloseSys202PmafileInCtx());/*8420-CLOSE-SYS202-PMAFILE*/
//  MOVE 800-CUTOFF-PIM-TMP-TS TO 800-CUTOFF-PIM-BEGIN
              methodOut.setCutoffPimBegin800(methodOut.getCutoffPimTmpTs800());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2210300());
//  PERFORM 8520-UPDATE-CKP-ROW
              updateCkpRow(programCtx.getUpdateCkpRowInCtx());/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
              commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
//  PERFORM 2213-DELETE-SYS202-PMAFILE
              deleteSys202Pmafile(programCtx.getDeleteSys202PmafileInCtx());/*2213-DELETE-SYS202-PMAFILE*/
          }
//  ELSE
          else { 
//  IF 88-100-END-PROS-N AND 88-100-PROCESSING-LOCAL
              if ( methodIn.isEndProsN88100()   &&  methodIn.isProcessingLocal88100()  ) { 
//  PERFORM 2212-READ-PMA-INSERT-PIM
                  readPmaInsertPim2212(programCtx.getReadPmaInsertPim2212InCtx());/*2212-READ-PMA-INSERT-PIM*/
//  MOVE 800-CUTOFF-PIM-TMP-TS TO 800-CUTOFF-PIM-BEGIN
                  methodOut.setCutoffPimBegin800(methodOut.getCutoffPimTmpTs800());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara2210300());
//  IF 400-PIM-COMMIT-CNT >= 800-COMMIT-CNT
                  if (	( methodOut.getPimCommitCnt400() >= methodIn.getCommitCnt800() )) { 
//  MOVE ZEROES TO 400-PIM-COMMIT-CNT
                      methodOut.setPimCommitCnt400(0);
//  PERFORM 8520-UPDATE-CKP-ROW
                      updateCkpRow(programCtx.getUpdateCkpRowInCtx());/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                      commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * readPmaInsertPim 
      *   This method is derived from 
  *   COBOL Paragraph - 2211-READ-PMA-INSERT-PIM COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      * - para2211300                    COBOL Name: 300-PARA-2211
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys202PmaRecord                COBOL Name: SYS202-PMA-RECORD
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - ip75081IsForTable              COBOL Name: IP75081-IS-FOR-TABLE
      * - ip75081AccntNum                COBOL Name: IP75081-ACCNT-NUM
      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      * - rc                             COBOL Name: RETURN-CODE
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2211300                    COBOL Name: 300-PARA-2211
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public ReadPmaInsertPimOutCtx readPmaInsertPim(ReadPmaInsertPimInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Read each pma record and call routine to insert into gcms table
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ReadPmaInsertPimOutCtx methodOut = methodIn.getReadPmaInsertPimOutCtx();
//  READ SYS202-PMA-FILE INTO IP34631-TIPAPIM END-READ
          	sys202PmaFile.read();
          methodOut.setSys202FileStatus200(sys202PmaFile.getStatusString() );
          if (!sys202PmaFile.hasEnded()) {
             methodOut.getSys202PmaRecord().setString(sys202PmaFile.getRecord());
             methodIn.getIp34631Tipapim().setString(methodOut.getSys202PmaRecord().toCharArray());
          }
//  EVALUATE TRUE
          if  ( methodOut.isSys202IoGood88200()  ) { 
//  PERFORM 8700-INSERT-TIPAPIM
              insertTipapim(programCtx.getInsertTipapimInCtx());/*8700-INSERT-TIPAPIM*/
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
          else if  ( methodOut.isSys202Eof88200()  ) { 
//  SET 88-IP75081-MQ-SEND TO TRUE
              methodOut.setIp75081MqSend88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
          }
          else   { 
//  SET 88-800-SYS202 TO TRUE
              methodOut.setSys20288800True(); 
              
//  SET 88-600-FILE-READ-ERR TO TRUE
              methodOut.setFileReadErr88600True(); 
              
//  MOVE 300-PARA-2211 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2211300());
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys202FileStatus200());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getReadAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
          }
      
      return methodOut;
      }
      /**
      * readPmaInsertPim2212 
      *   This method is derived from 
  *   COBOL Paragraph - 2212-READ-PMA-INSERT-PIM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip58041VirtualAccountNbr       COBOL Name: IP58041-VIRTUAL-ACCOUNT-NBR
      *
      * Output :  

      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      * - ip58041VirtualAccountNbr       COBOL Name: IP58041-VIRTUAL-ACCOUNT-NBR
      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - ip75081IsForTable              COBOL Name: IP75081-IS-FOR-TABLE
      * - ip75081AccntNum                COBOL Name: IP75081-ACCNT-NUM
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ReadPmaInsertPim2212OutCtx readPmaInsertPim2212(ReadPmaInsertPim2212InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Read each pma record and call routine to insert into gcms table
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ReadPmaInsertPim2212OutCtx methodOut = methodIn.getReadPmaInsertPim2212OutCtx();
//  MOVE IP58041-VIRTUAL-ACCOUNT-NBR TO IP34631-VIRTUAL-ACCOUNT-NBR
          methodOut.setIp34631VirtualAccountNbr(methodOut.getIp58041VirtualAccountNbr());
//  PERFORM 8220-POPULATE-PIM-VARIABLES
          populatePimVariables(programCtx.getPopulatePimVariablesInCtx());/*8220-POPULATE-PIM-VARIABLES*/
//  PERFORM 8700-INSERT-TIPAPIM
          insertTipapim(programCtx.getInsertTipapimInCtx());/*8700-INSERT-TIPAPIM*/
//  SET 88-IP75081-MQ-PUT TO TRUE
          methodOut.setIp75081MqPut88True(); 
          
//  SET 88-IP75081-IS-FOR-PIM TO TRUE
          methodOut.setIp75081IsForPim88True(); 
          
//  MOVE IP34631-VIRTUAL-ACCOUNT-NBR TO IP75081-ACCNT-NUM
          methodOut.setIp75081AccntNum(methodOut.getIp34631VirtualAccountNbr());
//  CALL 800-PTR-IP750080
          // CALL 800-PTR-IP750080
          	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
      
      return methodOut;
      }
      /**
      * deleteSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 2213-DELETE-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202Dsn800                   COBOL Name: 800-SYS202-DSN
      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - para2213300                    COBOL Name: 300-PARA-2213
      *
      * Output :  

      * - ip38201McidynamParms           COBOL Name: IP38201-MCIDYNAM-PARMS
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - sys202Dsn800                   COBOL Name: 800-SYS202-DSN
      * - ip38201Dd                      COBOL Name: IP38201-DD
      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - ip38201Function                COBOL Name: IP38201-FUNCTION
      * - rc                             COBOL Name: RETURN-CODE
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2213300                    COBOL Name: 300-PARA-2213
      * - mcdynamRequest640              COBOL Name: 640-MCDYNAM-REQUEST
      *
      * @throws CFException
      */
      @Override
      public DeleteSys202PmafileOutCtx deleteSys202Pmafile(DeleteSys202PmafileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph deletes the pma file                             *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
DeleteSys202PmafileOutCtx methodOut = methodIn.getDeleteSys202PmafileOutCtx();
//  INITIALIZE IP38201-MCIDYNAM-PARMS
          methodOut.getIp38201McidynamParms().initialize();
//  MOVE 800-SYS202-DSN TO IP38201-DSN
          methodOut.setIp38201Dsn(methodOut.getSys202Dsn800());
//  MOVE 300-DD-SYS202 TO IP38201-DD
          methodOut.setIp38201Dd(pad(8,methodOut.getDdSys202300(),SPACE_CHAR,RIGHT_PAD));
//  SET 88-IP38201-UNALLOCATE TO TRUE
          methodOut.setIp38201Unallocate88True(); 
          
//  CALL 800-PTR-IP760010
          // CALL 800-PTR-IP760010
          	programCtx.setRc( ip760010.process(programCtx.getGlobalCtx().getContext("IP760010")));
//  SET 88-IP38201-DELETE TO TRUE
          methodOut.setIp38201Delete88True(); 
          
//  CALL 800-PTR-IP760010
          // CALL 800-PTR-IP760010
          	programCtx.setRc( ip760010.process(programCtx.getGlobalCtx().getContext("IP760010")));
//  IF IP38201-RETURN-CODE EQUAL ZERO
//  ELSE
          if (!( allZeros(methodOut.getIp38201ReturnCode()) ) /*  !=  zeros*/) { 
//  MOVE 300-PARA-2213 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2213300());
//  SET 88-640-MCDYNAM-DELETE TO TRUE
              methodOut.setMcdynamDelete88640True(); 
              
//  PERFORM 8310-ABEND-ON-MCDYNAM-ERROR
              abendOnMcdynamError(programCtx.getAbendOnMcdynamErrorInCtx());/*8310-ABEND-ON-MCDYNAM-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * readInsertPim 
      *   This method is derived from 
  *   COBOL Paragraph - 2221-READ-INSERT-PIM COBOL Cyclomatic complexity - 5
      * Input  :  

      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      * - para2221300                    COBOL Name: 300-PARA-2221
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys202PmaRecord                COBOL Name: SYS202-PMA-RECORD
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2221300                    COBOL Name: 300-PARA-2221
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public ReadInsertPimOutCtx readInsertPim(ReadInsertPimInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Read each pmi record and call routine to insert into gcms table
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ReadInsertPimOutCtx methodOut = methodIn.getReadInsertPimOutCtx();
//  READ SYS202-PMA-FILE INTO IP34631-TIPAPIM END-READ
          	sys202PmaFile.read();
          methodOut.setSys202FileStatus200(sys202PmaFile.getStatusString() );
          if (!sys202PmaFile.hasEnded()) {
             methodOut.getSys202PmaRecord().setString(sys202PmaFile.getRecord());
             methodIn.getIp34631Tipapim().setString(methodOut.getSys202PmaRecord().toCharArray());
          }
//  EVALUATE TRUE
          if  ( methodOut.isSys202IoGood88200()  ) { 
//  PERFORM 8700-INSERT-TIPAPIM
              insertTipapim(programCtx.getInsertTipapimInCtx());/*8700-INSERT-TIPAPIM*/
//  IF 400-PIM-COMMIT-CNT >= 800-COMMIT-CNT
              if (	( methodOut.getPimCommitCnt400() >= methodIn.getCommitCnt800() )) { 
//  MOVE ZEROES TO 400-PIM-COMMIT-CNT
                  methodOut.setPimCommitCnt400(0);
//  PERFORM 8520-UPDATE-CKP-ROW
                  updateCkpRow(programCtx.getUpdateCkpRowInCtx());/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                  commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
              }
          }
          else if  ( methodOut.isSys202Eof88200()  ) { 
              ;
          }
          else   { 
//  SET 88-800-SYS202 TO TRUE
              methodOut.setSys20288800True(); 
              
//  SET 88-600-FILE-READ-ERR TO TRUE
              methodOut.setFileReadErr88600True(); 
              
//  MOVE 300-PARA-2221 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2221300());
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys202FileStatus200());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getReadAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
          }
      
      return methodOut;
      }
      /**
      * deleteAuthDb2Data 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-DELETE-AUTH-DB2-DATA COBOL Cyclomatic complexity - 2
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      *
      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public DeleteAuthDb2DataOutCtx deleteAuthDb2Data(DeleteAuthDb2DataInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph deletes data from db2 auth after it has been     *
// *updated to gcms tables.                                         *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
DeleteAuthDb2DataOutCtx methodOut = methodIn.getDeleteAuthDb2DataOutCtx();
//  IF 88-100-PROCESSING-LOCAL
          if ( methodIn.isProcessingLocal88100()  ) { 
//  SET 88-IP69901-CAF-INIT TO TRUE
              methodOut.setIp69901CafInit88True(); 
              
//  CALL 800-PTR-IP699910
              // CALL 800-PTR-IP699910
              	programCtx.setRc( ip699910.process(programCtx.getGlobalCtx().getContext("IP699910")));
//  PERFORM 2310-DELETE-TAMAPMA
              deleteTamapma(programCtx.getDeleteTamapmaInCtx());/*2310-DELETE-TAMAPMA*/
//  SET 88-IP69901-CAF-RESET TO TRUE
              methodOut.setIp69901CafReset88True(); 
              
//  CALL 800-PTR-IP699910
              // CALL 800-PTR-IP699910
              	programCtx.setRc( ip699910.process(programCtx.getGlobalCtx().getContext("IP699910")));
          }
      
      return methodOut;
      }
      /**
      * deleteTamapma 
      *   This method is derived from 
  *   COBOL Paragraph - 2310-DELETE-TAMAPMA COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      * - para2310300                    COBOL Name: 300-PARA-2310
      *
      * Output :  

      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2310300                    COBOL Name: 300-PARA-2310
      *
      * @throws CFException
      */
      @Override
      public DeleteTamapmaOutCtx deleteTamapma(DeleteTamapmaInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph -
// *1) initiate db2 connection to auth server
// *2) call routine to delete entries from auth table
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
DeleteTamapmaOutCtx methodOut = methodIn.getDeleteTamapmaOutCtx();
//  IF 400-SYS202-COUNT > ZEROS OR 400-TAMAPMA-ROWS-FETCHED > ZEROS
          if (	( methodIn.getSys202Count400() > 0 ) || 	( methodIn.getTamapmaRowsFetched400() > 0 )) { 
//  PERFORM 2311-DELETE-AUTH-PMA-DATA
              deleteAuthPmaData(programCtx.getDeleteAuthPmaDataInCtx());/*2311-DELETE-AUTH-PMA-DATA*/
//  MOVE 300-PARA-2310 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2310300());
//  PERFORM 8800-COMMIT-SQL
              commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
          }
      
      return methodOut;
      }
      /**
      * deleteAuthPmaData 
      *   This method is derived from 
  *   COBOL Paragraph - 2311-DELETE-AUTH-PMA-DATA COBOL Cyclomatic complexity - 2
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - pmaDeleteCnt400                COBOL Name: 400-PMA-DELETE-CNT
      *
      * Output :  

      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - rc                             COBOL Name: RETURN-CODE
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - pmaDeleteCnt400                COBOL Name: 400-PMA-DELETE-CNT
      *
      * @throws CFException
      */
      @Override
      public DeleteAuthPmaDataOutCtx deleteAuthPmaData(DeleteAuthPmaDataInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Delete entries from pma table.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
DeleteAuthPmaDataOutCtx methodOut = methodIn.getDeleteAuthPmaDataOutCtx();
//  SET 88-100-DELETE-RTN TO TRUE
          methodOut.setDeleteRtn88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue1300());
//  CALL 800-PTR-IP534110
          // CALL 800-PTR-IP534110
          	programCtx.setRc( ip534110.process(programCtx.getGlobalCtx().getContext("IP534110")));
//  IF 88-100-ROWS-FOUND
          if ( methodIn.isRowsFound88100()  ) { 
//  ADD 1 TO 400-TAMAPMA-ROWS-DELETED 400-PMA-DELETE-CNT
              methodOut.setTamapmaRowsDeleted400(methodOut.getTamapmaRowsDeleted400()+1);
              methodOut.setPmaDeleteCnt400(methodOut.getPmaDeleteCnt400()+1);
          }
      
      return methodOut;
      }
      /**
      * checkClrCyclId 
      *   This method is derived from 
  *   COBOL Paragraph - 2700-CHECK-CLR-CYCL-ID COBOL Cyclomatic complexity - 3
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - clrCyclNotFoundMsgTxt660       COBOL Name: 660-CLR-CYCL-NOT-FOUND-MSG-TXT
      * - para2700300                    COBOL Name: 300-PARA-2700
      * - getClrDtTmAbendCode300         COBOL Name: 300-GET-CLR-DT-TM-ABEND-CODE
      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - cyclId99800                    COBOL Name: 800-CYCL-ID-99
      * - cyclId6800                     COBOL Name: 800-CYCL-ID-6
      *
      * Output :  

      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - rc                             COBOL Name: RETURN-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2700300                    COBOL Name: 300-PARA-2700
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - getClrDtTmAbendCode300         COBOL Name: 300-GET-CLR-DT-TM-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - clrCyclNotFoundMsgTxt660       COBOL Name: 660-CLR-CYCL-NOT-FOUND-MSG-TXT
      * - clrCyclId800                   COBOL Name: 800-CLR-CYCL-ID
      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - cyclId6800                     COBOL Name: 800-CYCL-ID-6
      *
      * @throws CFException
      */
      @Override
      public CheckClrCyclIdOutCtx checkClrCyclId(CheckClrCyclIdInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph retrieves the current clearing cycle and moves   *
// * cycle-id 6 if the current cycle is 99. this would handle the   *
// * scenario where the eod job has kicked of and this lrm is still *
// * in process                                                     *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
CheckClrCyclIdOutCtx methodOut = methodIn.getCheckClrCyclIdOutCtx();
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue1300());
//  CALL 800-PTR-IP595010
          // CALL 800-PTR-IP595010
          	programCtx.setRc( ip595010.process(programCtx.getGlobalCtx().getContext("IP595010")));
//  IF 88-100-ROWS-NOT-FND
          if ( methodIn.isRowsNotFnd88100()  ) { 
//  DISPLAY 660-CLR-CYCL-NOT-FOUND-MSG-TXT
              logger.info(new String(methodOut.getClrCyclNotFoundMsgTxt660())); 
//  MOVE 300-PARA-2700 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2700300());
//  MOVE 300-GET-CLR-DT-TM-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getGetClrDtTmAbendCode300());
//  MOVE 660-CLR-CYCL-NOT-FOUND-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(66,methodOut.getClrCyclNotFoundMsgTxt660(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  MOVE IP30771-CLR-CYCL-ID TO 800-CLR-CYCL-ID
          methodOut.setClrCyclId800(methodOut.getIp30771ClrCyclId());
//  IF 800-CLR-CYCL-ID EQUAL 800-CYCL-ID-99
          if (	( methodOut.getClrCyclId800() == methodIn.getCyclId99800() )) { 
//  MOVE 800-CYCL-ID-6 TO 800-CLR-CYCL-ID
              methodOut.setClrCyclId800(methodOut.getCyclId6800());
          }
      
      return methodOut;
      }
      /**
      * setBeginningTs 
      *   This method is derived from 
  *   COBOL Paragraph - 2800-SET-BEGINNING-TS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      * - cutoffPimPrev800               COBOL Name: 800-CUTOFF-PIM-PREV
      *
      * Output :  

      * - cutoffEnd800                   COBOL Name: 800-CUTOFF-END
      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - cutoffPimPrev800               COBOL Name: 800-CUTOFF-PIM-PREV
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      *
      * @throws CFException
      */
      @Override
      public SetBeginningTsOutCtx setBeginningTs(SetBeginningTsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph sets the cut off timestamp to be current         *
// *timestamp.                                                      *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
SetBeginningTsOutCtx methodOut = methodIn.getSetBeginningTsOutCtx();
//  PERFORM 2810-GET-CUTOFF-TIMESTAMP
          getCutoffTimestamp(programCtx.getGetCutoffTimestampInCtx());/*2810-GET-CUTOFF-TIMESTAMP*/
//  MOVE IP50921-CURRENT-TS TO 800-CUTOFF-END
          methodOut.setCutoffEnd800(methodOut.getIp50921CurrentTs());
//  IF 800-CUTOFF-PIM-BEGIN = 800-CUTOFF-PIM-PREV
//  ELSE
          if (		compareChars(methodOut.getCutoffPimBegin800(),methodOut.getCutoffPimPrev800()) != 0 ) { 
              // MOVE 800-CUTOFF-PIM-BEGIN TO 800-CUTOFF-PIM-PREV
              methodOut.setCutoffPimPrev800(methodOut.getCutoffPimBegin800());
          }
      
      return methodOut;
      }
      /**
      * getCutoffTimestamp 
      *   This method is derived from 
  *   COBOL Paragraph - 2810-GET-CUTOFF-TIMESTAMP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - value2300                      COBOL Name: 300-VALUE-2
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value2300                      COBOL Name: 300-VALUE-2
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public GetCutoffTimestampOutCtx getCutoffTimestamp(GetCutoffTimestampInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls routine to get current timestamp - 5 minute
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
GetCutoffTimestampOutCtx methodOut = methodIn.getGetCutoffTimestampOutCtx();
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-2 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue2300());
//  CALL 800-PTR-IP500920
          // CALL 800-PTR-IP500920
          	programCtx.setRc( ip500920.process(programCtx.getGlobalCtx().getContext("IP500920")));
      
      return methodOut;
      }
      /**
      * endProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-END-PROCESS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      *
      * Output :  

      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - rc                             COBOL Name: RETURN-CODE
      * - tableRows100                   COBOL Name: 100-TABLE-ROWS
      *
      * @throws CFException
      */
      @Override
      public EndProcessOutCtx endProcess(EndProcessInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph performs routines to end the process to display  *
// *the number of records inserted into gcms processing tables from *
// *auth db2 tables.                                                *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
EndProcessOutCtx methodOut = methodIn.getEndProcessOutCtx();
//  IF 88-100-PROCESSING-REMOTELY
          if ( methodIn.isProcessingRemotely88100()  ) { 
//  DISPLAY '# OF GCMS PIM ROWS FETCHED  : ' 400-TIPAPIM-ROWS-FETCHED
              logger.info("# OF GCMS PIM ROWS FETCHED  : {}", String.valueOf(methodOut.getTipapimRowsFetched400())); 
//  DISPLAY '# OF SYS202 RECORDS WRITTEN : ' 400-SYS202-COUNT
              logger.info("# OF SYS202 RECORDS WRITTEN : {}", String.valueOf(methodOut.getSys202Count400())); 
          }
//  MOVE ZEROS TO 400-SYS202-COUNT 400-TIPAPIM-ROWS-FETCHED
          methodOut.setSys202Count400(0);
          methodOut.setTipapimRowsFetched400(0);
//  SET 88-IP75081-MQ-SEND TO TRUE
          methodOut.setIp75081MqSend88True(); 
          
//  CALL 800-PTR-IP750080
          // CALL 800-PTR-IP750080
          	programCtx.setRc( ip750080.process(programCtx.getGlobalCtx().getContext("IP750080")));
//  IF 88-100-END-PROS-Y
          if ( methodIn.isEndProsY88100()  ) { 
//  SET 88-TABLE-ROWS-END TO TRUE
              methodOut.setTableRowsEnd88True(); 
              
          }
//  ELSE
          else { 
//  SET 88-TABLE-ROWS-REMAINING TO TRUE
              methodOut.setTableRowsRemaining88True(); 
              
          }
      
      return methodOut;
      }
      /**
      * openWriteSys001Outfil 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-OPEN-WRITE-SYS001-OUTFIL COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void openWriteSys001Outfil(Ip798030Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens sys001 cutoff file in output and closes    *
// *the sys001 cutoff file.                                         *
// *----------------------------------------------------------------*
//  PERFORM 9510-DISPLAY-NET-TOTAL
          displayNetTotal(programCtx.getDisplayNetTotalInCtx());/*9510-DISPLAY-NET-TOTAL*/
//  PERFORM 4100-OPEN-OUTPUT-SYS001
          openOutputSys001(programCtx.getOpenOutputSys001InCtx());/*4100-OPEN-OUTPUT-SYS001*/
//  PERFORM 4200-WRITE-OUTPUT-SYS001
          writeOutputSys001(programCtx.getWriteOutputSys001InCtx());/*4200-WRITE-OUTPUT-SYS001*/
//  PERFORM 8400-CLOSE-SYS001-CUTOFF
          closeSys001Cutoff(programCtx.getCloseSys001CutoffInCtx());/*8400-CLOSE-SYS001-CUTOFF*/
          ;
      
      }
      /**
      * openOutputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 4100-OPEN-OUTPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para4100300                    COBOL Name: 300-PARA-4100
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para4100300                    COBOL Name: 300-PARA-4100
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenOutputSys001OutCtx openOutputSys001(OpenOutputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens sys001 cutoff file in output mode & check  *
// *file status.                                                    *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
OpenOutputSys001OutCtx methodOut = methodIn.getOpenOutputSys001OutCtx();
//  OPEN OUTPUT SYS001-CUTOFF-FILE
          sys001CutoffFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys001CutoffFile.getFileName(),sys001CutoffFile.getSys001CutoffFileCharSet(),sys001CutoffFile.getSys001CutoffFileCrlfFlag());
          methodOut.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(methodOut.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              methodOut.setSys00188800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              methodOut.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-PARA-4100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara4100300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * writeOutputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 4200-WRITE-OUTPUT-SYS001 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - tipackpMsgTxt680               COBOL Name: 680-TIPACKP-MSG-TXT
      * - sys001CutoffRecord             COBOL Name: SYS001-CUTOFF-RECORD
      * - para4200300                    COBOL Name: 300-PARA-4200
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - cutoffCkpData800               COBOL Name: 800-CUTOFF-CKP-DATA
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - cutoffPimCkp800                COBOL Name: 800-CUTOFF-PIM-CKP
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para4200300                    COBOL Name: 300-PARA-4200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public WriteOutputSys001OutCtx writeOutputSys001(WriteOutputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph determines whether ckp has most recent timestamp *
// *and updates it to sys001 cut off file.                          *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
WriteOutputSys001OutCtx methodOut = methodIn.getWriteOutputSys001OutCtx();
//  MOVE SPACES TO 800-CUTOFF-CKP-DATA
          methodOut.getCutoffCkpData800().setString(CONSTANTS.SPACE_182);
//  PERFORM 8500-SELECT-CKP
          selectCkp(programCtx.getSelectCkpInCtx());/*8500-SELECT-CKP*/
//  IF 800-CUTOFF-CKP-DATA GREATER SPACES
          if (             ( isGreaterThanSpaces(methodOut.getCutoffCkpData800()) )) { 
              // MOVE 800-CUTOFF-CKP-DATA TO 800-CUTOFF-TS-DATA
              methodOut.getCutoffTsData800().setString(methodOut.getCutoffCkpData800().getCharArray());
          }
//  DISPLAY 680-TIPACKP-MSG-TXT 800-CUTOFF-PIM-CKP
          logger.info("{}{}", new String(methodIn.getTipackpMsgTxt680()), new String(methodOut.getCutoffPimCkp800())); 
//  WRITE SYS001-CUTOFF-RECORD FROM 800-CUTOFF-TS-DATA END-WRITE
          sys001CutoffFile.write(methodOut.getCutoffTsData800().toCharArray()); 
          methodOut.getSys001CutoffRecord().setString(CONSTANTS.LOW_VALUE_215747182);
          methodOut.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(methodOut.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              methodOut.setSys00188800True(); 
              
//  SET 88-600-FILE-WRITE-ERR TO TRUE
              methodOut.setFileWriteErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-PARA-4200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara4200300());
//  MOVE 300-WRITE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getWriteAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * closeSys210File 
      *   This method is derived from 
  *   COBOL Paragraph - 4500-CLOSE-SYS210-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - para4500300                    COBOL Name: 300-PARA-4500
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para4500300                    COBOL Name: 300-PARA-4500
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CloseSys210FileOutCtx closeSys210File(CloseSys210FileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is used to close sys210 file
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
CloseSys210FileOutCtx methodOut = methodIn.getCloseSys210FileOutCtx();
//  CLOSE SYS210-MQ-DATA-FILE
          sys210MqDataFile.close(); 
          methodOut.setSys210FileStatus200(sys210MqDataFile.getStatusString() );
//  IF 88-200-SYS210-IO-GOOD
//  ELSE
          if (!(methodIn.isSys210IoGood88200()) ) { 
//  SET 88-800-SYS210 TO TRUE
              methodOut.setSys21088800True(); 
              
//  SET 88-600-FILE-CLOSE-ERR TO TRUE
              methodOut.setFileCloseErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS210-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys210FileStatus200());
//  MOVE 300-PARA-4500 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara4500300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * processViaMq 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-PROCESS-VIA-MQ COBOL Cyclomatic complexity - 8
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip70301PimmapMqSrvActive       COBOL Name: IP70301-PIMMAP-MQ-SRV-ACTIVE
      * - ip7051pmrMqBypassSw            COBOL Name: IP7051PMR-MQ-BYPASS-SW
      * - startQ800                      COBOL Name: 800-START-Q
      * - ip7052pmrHconn                 COBOL Name: IP7052PMR-HCONN
      * - ip7052pmrHobj                  COBOL Name: IP7052PMR-HOBJ
      * - ip7052pmrTargetQName           COBOL Name: IP7052PMR-TARGET-Q-NAME
      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - ip70521CompCd                  COBOL Name: IP70521-COMP-CD
      * - mqFailCode300                  COBOL Name: 300-MQ-FAIL-CODE
      * - para5000300                    COBOL Name: 300-PARA-5000
      * - mqGetErrorMsgTxt614            COBOL Name: 614-MQ-GET-ERROR-MSG-TXT
      * - mqErrAbendCode300              COBOL Name: 300-MQ-ERR-ABEND-CODE
      * - value1300                      COBOL Name: 300-VALUE-1
      *
      * Output :  

      * - mqRespStatusSw100              COBOL Name: 100-MQ-RESP-STATUS-SW
      * - getBrowseCalls100              COBOL Name: 100-GET-BROWSE-CALLS
      * - ip70521MqBypassSw              COBOL Name: IP70521-MQ-BYPASS-SW
      * - ip7051pmrMqBypassSw            COBOL Name: IP7051PMR-MQ-BYPASS-SW
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - ip70521Hconn                   COBOL Name: IP70521-HCONN
      * - ip7052pmrHconn                 COBOL Name: IP7052PMR-HCONN
      * - ip70521Hobj                    COBOL Name: IP70521-HOBJ
      * - ip7052pmrHobj                  COBOL Name: IP7052PMR-HOBJ
      * - ip70521TargetQName             COBOL Name: IP70521-TARGET-Q-NAME
      * - ip7052pmrTargetQName           COBOL Name: IP7052PMR-TARGET-Q-NAME
      * - ip70521MqReturnSw              COBOL Name: IP70521-MQ-RETURN-SW
      * - checkGetQueue100               COBOL Name: 100-CHECK-GET-QUEUE
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para5000300                    COBOL Name: 300-PARA-5000
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - mqGetErrorMsgTxt614            COBOL Name: 614-MQ-GET-ERROR-MSG-TXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - mqErrAbendCode300              COBOL Name: 300-MQ-ERR-ABEND-CODE
      * - ip7052pmrMsgBufferLen          COBOL Name: IP7052PMR-MSG-BUFFER-LEN
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - startQ800                      COBOL Name: 800-START-Q
      * - value1300                      COBOL Name: 300-VALUE-1
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      *
      * @throws CFException
      */
      @Override
      public ProcessViaMqOutCtx processViaMq(ProcessViaMqInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int IP_70521_MSG_BUFFER_LENGTH = 4000000;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph will execute only when the code is runnin in the
// *linux os to get the message from the queue.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessViaMqOutCtx methodOut = methodIn.getProcessViaMqOutCtx();
//  IF 88-100-PROCESSING-REMOTELY AND 88-IP70301-PIMMAP-MQ-ACTVE-Y
          if ( methodIn.isProcessingRemotely88100()   &&  methodIn.isIp70301PimmapMqActveY88()  ) { 
//  SET 88-100-MQ-RESP-Y TO TRUE
              methodOut.setMqRespY88100True(); 
              
//  SET 88-100-START-BROWSE TO TRUE
              methodOut.setStartBrowse88100True(); 
              
//  PERFORM UNTIL 88-100-MQ-RESP-N
              while ((!(methodOut.isMqRespN88100()) )) {
//  MOVE IP7051PMR-MQ-BYPASS-SW TO IP70521-MQ-BYPASS-SW
                  methodOut.setIp70521MqBypassSw(methodOut.getIp7051pmrMqBypassSw());
//  MOVE LENGTH OF IP70521-MSG-BUFFER TO IP70521-MSG-BUFFER-LEN
                  methodOut.setIp70521MsgBufferLen(IP_70521_MSG_BUFFER_LENGTH);
//  IF 800-START-Q GREATER THAN ZERO
                  if (	( methodOut.getStartQ800() > 0 ) ) { 
//  MOVE SPACES TO IP70521-MSG-BUFFER (1 : 800-START-Q )
                      methodOut.setIp70521MsgBuffer(replace(methodOut.getIp70521MsgBuffer(),CONSTANTS.SPACE,0,(int) methodOut.getStartQ800()));
                  }
//  MOVE IP7052PMR-HCONN TO IP70521-HCONN
                  methodOut.setIp70521Hconn(methodOut.getIp7052pmrHconn());
//  MOVE IP7052PMR-HOBJ TO IP70521-HOBJ
                  methodOut.setIp70521Hobj(methodOut.getIp7052pmrHobj());
//  MOVE IP7052PMR-TARGET-Q-NAME TO IP70521-TARGET-Q-NAME
                  methodOut.setIp70521TargetQName(methodOut.getIp7052pmrTargetQName());
//  SET 88-IP70521-MQ-RETURN-Y TO TRUE
                  methodOut.setIp70521MqReturnY88True(); 
                  
//  SET 88-100-GET-PIM TO TRUE
                  methodOut.setGetPim88100True(); 
                  
//  SET 88-IP70521-GET TO TRUE
                  methodOut.setIp70521Get88True(); 
                  
//  CALL 800-PTR-IP708020
                  // CALL 800-PTR-IP708020
                  	programCtx.setRc( ip708020.process(programCtx.getGlobalCtx().getContext("IP708020")));
//  IF 88-IP70521-NO-MSG-AVAILABLE OR 88-IP70521-MQ-RETURN-N
                  if ( methodIn.isIp70521NoMsgAvailable88()   ||  methodOut.isIp70521MqReturnN88()  ) { 
//  SET 88-100-MQ-RESP-N TO TRUE
                      methodOut.setMqRespN88100True(); 
                      
                  }
//  ELSE
                  else { 
//  IF IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE
                      if (	( methodIn.getIp70521CompCd() == methodIn.getMqFailCode300() )) { 
//  MOVE 300-PARA-5000 TO 900-ABEND-PARA
                          methodOut.setAbendPara900(methodOut.getPara5000300());
//  MOVE 614-MQ-GET-ERROR-MSG-TXT TO 900-ABEND-TEXT
                          methodOut.setAbendText900(pad(66,methodOut.getMqGetErrorMsgTxt614(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-MQ-ERR-ABEND-CODE TO 900-ABEND-CODE
                          methodOut.setAbendCode900(methodOut.getMqErrAbendCode300());
//  PERFORM 9500-ABEND-THE-PROGRAM
                          abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
                      }
//  ELSE
                      else { 
//  MOVE IP70521-MSG-BUFFER-LEN TO IP7052PMR-MSG-BUFFER-LEN
                          methodOut.setIp7052pmrMsgBufferLen(methodOut.getIp70521MsgBufferLen());
//  MOVE IP70521-MSG-BUFFER TO IP7052PMR-MSG-BUFFER (1 : IP70521-MSG-BUFFER-LEN )
                          methodOut.getIp7052pmrMqApiLayout().replace(methodOut.getIp70521MqApiLayout()/*parent*/,252/*fromOffset - (ip7052pmrMsgBuffer) */,4000000/*fromLen*/,252/*toOffset - (ip70521MsgBuffer) */,methodOut.getIp70521MsgBufferLen()/*toLen*/);
//  SET 88-100-MQ-START TO TRUE
                          methodOut.setMqStart88100True(); 
                          
//  MOVE 300-VALUE-1 TO 800-START-Q
                          methodOut.setStartQ800( methodOut.getValue1300());
//  MOVE ZEROES TO 400-NO-OF-VALID-TRANS
                          methodOut.setNoOfValidTrans400(0);
//  PERFORM 5100-PROCESS-MESSAGE
                          processMessage(programCtx.getProcessMessageInCtx());/*5100-PROCESS-MESSAGE*/
//  PERFORM 5200-PROCESS-NEXT-MESSAGE
                          processNextMessage(programCtx.getProcessNextMessageInCtx());/*5200-PROCESS-NEXT-MESSAGE*/
                      }
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * processMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 5100-PROCESS-MESSAGE COBOL Cyclomatic complexity - 9
      * Input  :  

      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - svcStkCount800                 COBOL Name: 800-SVC-STK-COUNT
      * - startQ800                      COBOL Name: 800-START-Q
      * - ip7052pmrMsgBufferLen          COBOL Name: IP7052PMR-MSG-BUFFER-LEN
      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - value4300                      COBOL Name: 300-VALUE-4
      * - isDebugSwOn100                 COBOL Name: 100-IS-DEBUG-SW-ON
      * - pimLen800                      COBOL Name: 800-PIM-LEN
      *
      * Output :  

      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - startQ800                      COBOL Name: 800-START-Q
      * - value4300                      COBOL Name: 300-VALUE-4
      * - sys210MqDataRec                COBOL Name: SYS210-MQ-DATA-REC
      *
      * @throws CFException
      */
      @Override
      public ProcessMessageOutCtx processMessage(ProcessMessageInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is used to perform routine to parse the mq message
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessMessageOutCtx methodOut = methodIn.getProcessMessageOutCtx();
//  PERFORM UNTIL 88-100-MQ-STOP OR 400-NO-OF-VALID-TRANS >= 800-SVC-STK-COUNT
          while ((!(methodOut.isMqStop88100())  && 	( methodIn.getNoOfValidTrans400() < methodIn.getSvcStkCount800() ))) {
//  IF 800-START-Q >= IP7052PMR-MSG-BUFFER-LEN
              if (	( methodOut.getStartQ800() >= methodIn.getIp7052pmrMsgBufferLen() ) ) { 
//  SET 88-100-MQ-STOP TO TRUE
                  methodOut.setMqStop88100True(); 
                  
              }
//  ELSE
              else { 
//  IF 800-START-Q EQUAL 300-VALUE-1
                  if (	( methodOut.getStartQ800() == methodIn.getValue1300() ) ) { 
//  MOVE SPACES TO 800-TABLE-ID
                      methodOut.setTableId800(CONSTANTS.SPACE_11);
//  MOVE IP7052PMR-MSG-BUFFER (1 : 3) TO 800-TABLE-ID
                      methodOut.setTableId800(pad(11,substring(methodOut.getIp7052pmrMsgBuffer(),0,3),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-VALUE-4 TO 800-START-Q
                      methodOut.setStartQ800( methodOut.getValue4300());
                  }
//  IF 88-100-DEBUG-SW-Y
                  if ( methodIn.isDebugSwY88100()  ) { 
//  MOVE SPACES TO SYS210-MQ-DATA-REC
                      methodOut.getSys210MqDataRec().setString(CONSTANTS.SPACE_500);
//  MOVE IP7052PMR-MSG-BUFFER ( 800-START-Q : 800-PIM-LEN ) TO SYS210-MQ-DATA-REC (1 : 800-PIM-LEN )
                      methodOut.getSys210MqDataRec().replace(methodIn.getIp7052pmrMqApiLayout()/*parent*/,252+(int) methodOut.getStartQ800() - 1/*fromOffset - (sys210MqDataRec) */,methodIn.getPimLen800()/*fromLen*/,0/*toOffset - (ip7052pmrMsgBuffer) */,methodIn.getPimLen800()/*toLen*/);
//  PERFORM 8900-WRITE-MQ-FILE
                      writeMqFile(programCtx.getWriteMqFileInCtx());/*8900-WRITE-MQ-FILE*/
                  }
//  IF IP7052PMR-MSG-BUFFER ( 800-START-Q : 800-PIM-LEN ) EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES
                  if (Field.allSpaces(methodOut.getIp7052pmrMsgBuffer(),( ((int) methodOut.getStartQ800() - 1) /*start*/ ), methodIn.getPimLen800() /*len*/) || Field.compareAll(methodOut.getIp7052pmrMsgBuffer(),CONSTANTS.LOW_VALUE_STRING,( ((int) methodOut.getStartQ800() - 1) /*start*/ ), methodIn.getPimLen800() /*len*/) || Field.allHighValues(methodOut.getIp7052pmrMsgBuffer(),( ((int) methodOut.getStartQ800() - 1) /*start*/ ), methodIn.getPimLen800() /*len*/)) { 
//  SET 88-100-MQ-STOP TO TRUE
                      methodOut.setMqStop88100True(); 
                      
                  }
//  ELSE
                  else { 
//  PERFORM 5110-VALIDTE-MESSAGE
                      validteMessage(programCtx.getValidteMessageInCtx());/*5110-VALIDTE-MESSAGE*/
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * validteMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 5110-VALIDTE-MESSAGE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - value1300                      COBOL Name: 300-VALUE-1
      * - startQ800                      COBOL Name: 800-START-Q
      * - pimLen800                      COBOL Name: 800-PIM-LEN
      * - mqInvRec400                    COBOL Name: 400-MQ-INV-REC
      *
      * Output :  

      * - ip34631Tipapim                 COBOL Name: IP34631-TIPAPIM
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - startQ800                      COBOL Name: 800-START-Q
      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - mqInvRec400                    COBOL Name: 400-MQ-INV-REC
      *
      * @throws CFException
      */
      @Override
      public ValidteMessageOutCtx validteMessage(ValidteMessageInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is used to validate the table id and perform
// *routine to insert.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ValidteMessageOutCtx methodOut = methodIn.getValidteMessageOutCtx();
//  EVALUATE TRUE
          if  ( methodIn.isItIsPim88800()  ) { 
//  MOVE IP7052PMR-MSG-BUFFER ( 800-START-Q : 800-PIM-LEN ) TO IP34631-TIPAPIM
              methodOut.getIp34631Tipapim().replace(methodIn.getIp7052pmrMqApiLayout()/*parent*/,252+(int) methodOut.getStartQ800() - 1/*fromOffset - (ip34631Tipapim) */,methodIn.getPimLen800()/*fromLen*/,0/*toOffset - (ip7052pmrMsgBuffer) */,94/*toLen*/);
//  ADD 300-VALUE-1 TO 400-NO-OF-VALID-TRANS 400-MQ-PIM-REC
              methodOut.setNoOfValidTrans400(methodOut.getNoOfValidTrans400()+methodIn.getValue1300());
              methodOut.setMqPimRec400(methodOut.getMqPimRec400()+methodIn.getValue1300());
//  ADD 800-PIM-LEN TO 800-START-Q
              methodOut.setStartQ800(methodOut.getStartQ800()+(int) methodIn.getPimLen800());
//  PERFORM 8700-INSERT-TIPAPIM
              insertTipapim(programCtx.getInsertTipapimInCtx());/*8700-INSERT-TIPAPIM*/
//  PERFORM 8800-COMMIT-SQL
              commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
          }
          else   { 
//  SET 88-100-MQ-STOP TO TRUE
              methodOut.setMqStop88100True(); 
              
//  ADD 300-VALUE-1 TO 400-MQ-INV-REC
              methodOut.setMqInvRec400(methodOut.getMqInvRec400()+methodIn.getValue1300());
          }
      
      return methodOut;
      }
      /**
      * processNextMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 5200-PROCESS-NEXT-MESSAGE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - checkGetQueue100               COBOL Name: 100-CHECK-GET-QUEUE
      * - getBrowseCalls100              COBOL Name: 100-GET-BROWSE-CALLS
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ProcessNextMessageOutCtx processNextMessage(ProcessNextMessageInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int IP_70521_MSG_BUFFER_LENGTH = 4000000;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *Delete the current read and process next message from queue.    *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
ProcessNextMessageOutCtx methodOut = methodIn.getProcessNextMessageOutCtx();
//  SET 88-100-GET-PIM TO TRUE
          methodOut.setGetPim88100True(); 
          
//  SET 88-100-CURRENT-DELETE TO TRUE
          methodOut.setCurrentDelete88100True(); 
          
//  SET 88-IP70521-GET TO TRUE
          methodOut.setIp70521Get88True(); 
          
//  MOVE LENGTH OF IP70521-MSG-BUFFER TO IP70521-MSG-BUFFER-LEN
          methodOut.setIp70521MsgBufferLen(IP_70521_MSG_BUFFER_LENGTH);
//  CALL 800-PTR-IP708020
          // CALL 800-PTR-IP708020
          	programCtx.setRc( ip708020.process(programCtx.getGlobalCtx().getContext("IP708020")));
//  SET 88-100-NEXT-BROWSE TO TRUE
          methodOut.setNextBrowse88100True(); 
          
      
      return methodOut;
      }
      /**
      * endProcess6000 
      *   This method is derived from 
  *   COBOL Paragraph - 6000-END-PROCESS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - mqPimInsert400                 COBOL Name: 400-MQ-PIM-INSERT
      * - mqInvRec400                    COBOL Name: 400-MQ-INV-REC
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void endProcess6000(EndProcess6000InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *End of process when code execting in linux os.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
//  DISPLAY '# OF PIM RECORDS RETRIEVED FROM MQ :' 400-MQ-PIM-REC
          logger.info("# OF PIM RECORDS RETRIEVED FROM MQ :{}", String.valueOf(methodIn.getMqPimRec400())); 
//  DISPLAY '# OF PIM RECORDS INSERTED          :' 400-MQ-PIM-INSERT
          logger.info("# OF PIM RECORDS INSERTED          :{}", String.valueOf(methodIn.getMqPimInsert400())); 
//  DISPLAY '# OF INVALID RECORDS FROM MQ       :' 400-MQ-INV-REC
          logger.info("# OF INVALID RECORDS FROM MQ       :{}", String.valueOf(methodIn.getMqInvRec400())); 
//  DISPLAY '# OF AUTH PMA ROWS FETCHED         :' 400-TAMAPMA-ROWS-FETCHED
          logger.info("# OF AUTH PMA ROWS FETCHED         :{}", String.valueOf(methodIn.getTamapmaRowsFetched400())); 
//  DISPLAY '# OF PMA ROWS DELETED              :' 400-TAMAPMA-ROWS-DELETED
          logger.info("# OF PMA ROWS DELETED              :{}", String.valueOf(methodIn.getTamapmaRowsDeleted400())); 
//  DISPLAY '# OF GCMS PIM ROWS INSERTED        :' 400-TIPAPIM-ROWS-INSERTED
          logger.info("# OF GCMS PIM ROWS INSERTED        :{}", String.valueOf(methodIn.getTipapimRowsInserted400())); 
      
      }
      /**
      * closeDisconnectQ 
      *   This method is derived from 
  *   COBOL Paragraph - 7000-CLOSE-DISCONNECT-Q COBOL Cyclomatic complexity - 1
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
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
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
      * findAccEligibility 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-FIND-ACC-ELIGIBILITY COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      *
      * Output :  

      * - ip02044RngStrtNum              COBOL Name: IP02044-RNG-STRT-NUM
      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      * - tab204KeyFound100              COBOL Name: 100-TAB204-KEY-FOUND
      * - rc                             COBOL Name: RETURN-CODE
      * - isRecordEligible100            COBOL Name: 100-IS-RECORD-ELIGIBLE
      *
      * @throws CFException
      */
      @Override
      public FindAccEligibilityOutCtx findAccEligibility(FindAccEligibilityInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph determines if entry present in table 204 for     *
// *remote processing.                                              *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
FindAccEligibilityOutCtx methodOut = methodIn.getFindAccEligibilityOutCtx();
//  MOVE ZEROES TO IP02044-RNG-STRT-NUM
          methodOut.setIp02044RngStrtNum(CONSTANTS.ZERO_19);
//  MOVE IP08151-PASSED-ACCT-NBR TO IP02044-RNG-STRT-NUM (1 : IP08151-RETURN-ACCT-NBR-L )
          methodOut.getIp02044ArPa().replace(methodIn.getIp08151PassedParms()/*parent*/,0/*fromOffset - (ip02044RngStrtNum) */,19/*fromLen*/,0/*toOffset - (ip08151PassedAcctNbr) */,methodIn.getIp08151ReturnAcctNbrL()/*toLen*/);
//  SET 88-100-204-ENTRY-FOUND-N TO TRUE
          methodOut.setEntryFoundN88100204True(); 
          
//  CALL 800-PTR-IP282240
          // CALL 800-PTR-IP282240
          	programCtx.setRc( ip282240.process(programCtx.getGlobalCtx().getContext("IP282240")));
//  IF 88-100-204-ENTRY-FOUND-N
          if ( methodOut.isEntryFoundN88100204()  ) { 
//  SET 88-100-RECORD-NOT-ELIGIBLE TO TRUE
              methodOut.setRecordNotEligible88100True(); 
              
          }
      
      return methodOut;
      }
      /**
      * callLrmIp648010 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-CALL-LRM-IP648010 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - lrmStatError630                COBOL Name: 630-LRM-STAT-ERROR
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - invalidRcIp648010300           COBOL Name: 300-INVALID-RC-IP648010
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - lrmStatError630                COBOL Name: 630-LRM-STAT-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - invalidRcIp648010300           COBOL Name: 300-INVALID-RC-IP648010
      *
      * @throws CFException
      */
      @Override
      public CallLrmIp648010OutCtx callLrmIp648010(CallLrmIp648010InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Call lrm module and check the status
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
CallLrmIp648010OutCtx methodOut = methodIn.getCallLrmIp648010OutCtx();
//  CALL 800-PTR-IP648010
          // CALL 800-PTR-IP648010
          	programCtx.setRc( ip648010.process(programCtx.getGlobalCtx().getContext("IP648010")));
//  IF IP64801-88-LRM-STAT-BAD
          if ( methodIn.isIp6480188LrmStatBad()  ) { 
//  MOVE 630-LRM-STAT-ERROR ( IP64801-LRM-BAD-RSN ) TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getLrmStatError630(methodIn.getIp64801LrmBadRsn() - 1));
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8200300());
//  MOVE 300-INVALID-RC-IP648010 TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getInvalidRcIp648010300());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * populatePimVariables 
      *   This method is derived from 
  *   COBOL Paragraph - 8220-POPULATE-PIM-VARIABLES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip58041PrimAccountNbr          COBOL Name: IP58041-PRIM-ACCOUNT-NBR
      * - ip58041CreateUpdateTs          COBOL Name: IP58041-CREATE-UPDATE-TS
      * - ip58041ActionCode              COBOL Name: IP58041-ACTION-CODE
      * - ip58041EntRsnCd                COBOL Name: IP58041-ENT-RSN-CD
      * - ip58041StatCd                  COBOL Name: IP58041-STAT-CD
      *
      * Output :  

      * - ip34631PrimAccountNbr          COBOL Name: IP34631-PRIM-ACCOUNT-NBR
      * - ip58041PrimAccountNbr          COBOL Name: IP58041-PRIM-ACCOUNT-NBR
      * - ip34631CreateUpdateTs          COBOL Name: IP34631-CREATE-UPDATE-TS
      * - ip58041CreateUpdateTs          COBOL Name: IP58041-CREATE-UPDATE-TS
      * - ip34631ActionCode              COBOL Name: IP34631-ACTION-CODE
      * - ip58041ActionCode              COBOL Name: IP58041-ACTION-CODE
      * - ip34631EntRsnCd                COBOL Name: IP34631-ENT-RSN-CD
      * - ip58041EntRsnCd                COBOL Name: IP58041-ENT-RSN-CD
      * - ip34631StatCd                  COBOL Name: IP34631-STAT-CD
      * - ip58041StatCd                  COBOL Name: IP58041-STAT-CD
      *
      * @throws CFException
      */
      @Override
      public PopulatePimVariablesOutCtx populatePimVariables(PopulatePimVariablesInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *Populate external copybook.
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
PopulatePimVariablesOutCtx methodOut = methodIn.getPopulatePimVariablesOutCtx();
//  MOVE IP58041-PRIM-ACCOUNT-NBR TO IP34631-PRIM-ACCOUNT-NBR
          methodOut.setIp34631PrimAccountNbr(methodOut.getIp58041PrimAccountNbr());
          // MOVE IP58041-CREATE-UPDATE-TS TO IP34631-CREATE-UPDATE-TS
          methodOut.getIp34631CreateUpdateTs().setString(methodOut.getIp58041CreateUpdateTs().getCharArray());
//  MOVE IP58041-ACTION-CODE TO IP34631-ACTION-CODE
          methodOut.setIp34631ActionCode(methodOut.getIp58041ActionCode());
//  MOVE IP58041-ENT-RSN-CD TO IP34631-ENT-RSN-CD
          methodOut.setIp34631EntRsnCd(methodOut.getIp58041EntRsnCd());
//  MOVE IP58041-STAT-CD TO IP34631-STAT-CD
          methodOut.setIp34631StatCd(methodOut.getIp58041StatCd());
      
      return methodOut;
      }
      /**
      * callMcdynamRoutine 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CALL-MCDYNAM-ROUTINE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      * - jobGroup800                    COBOL Name: 800-JOB-GROUP
      * - jobNumber800                   COBOL Name: 800-JOB-NUMBER
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - para8300300                    COBOL Name: 300-PARA-8300
      *
      * Output :  

      * - ip38201Function                COBOL Name: IP38201-FUNCTION
      * - ip38201DispBeginParm           COBOL Name: IP38201-DISP-BEGIN-PARM
      * - ip38201DispNormalParm          COBOL Name: IP38201-DISP-NORMAL-PARM
      * - ip38201DispAbnormalParm        COBOL Name: IP38201-DISP-ABNORMAL-PARM
      * - ip38201InputOutputFileInd      COBOL Name: IP38201-INPUT-OUTPUT-FILE-IND
      * - ip38201TrackCylinderInd        COBOL Name: IP38201-TRACK-CYLINDER-IND
      * - ip38201StorageMedia            COBOL Name: IP38201-STORAGE-MEDIA
      * - ip38201ReleaseIndicator        COBOL Name: IP38201-RELEASE-INDICATOR
      * - ip38201Recfm                   COBOL Name: IP38201-RECFM
      * - ip38201RecordCount             COBOL Name: IP38201-RECORD-COUNT
      * - ip38201Blksize                 COBOL Name: IP38201-BLKSIZE
      * - ip38201EnvironmentIndicator    COBOL Name: IP38201-ENVIRONMENT-INDICATOR
      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - jobGroup800                    COBOL Name: 800-JOB-GROUP
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - jobNumber800                   COBOL Name: 800-JOB-NUMBER
      * - ip38201ClearingIdentifier      COBOL Name: IP38201-CLEARING-IDENTIFIER
      * - rc                             COBOL Name: RETURN-CODE
      * - outputDsn800                   COBOL Name: 800-OUTPUT-DSN
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8300300                    COBOL Name: 300-PARA-8300
      * - mcdynamRequest640              COBOL Name: 640-MCDYNAM-REQUEST
      *
      * @throws CFException
      */
      @Override
      public CallMcdynamRoutineOutCtx callMcdynamRoutine(CallMcdynamRoutineInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Calls mcdynam routine to allocate datasets dynamically
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
CallMcdynamRoutineOutCtx methodOut = methodIn.getCallMcdynamRoutineOutCtx();
//  SET 88-IP38201-ALLOCATE TO TRUE
          methodOut.setIp38201Allocate88True(); 
          
//  SET 88-DISP-BEGIN-NEW TO TRUE
          methodOut.setDispBeginNew88True(); 
          
//  SET 88-DISP-NORMAL-CATLG TO TRUE
          methodOut.setDispNormalCatlg88True(); 
          
//  SET 88-DISP-ABNORMAL-DELETE TO TRUE
          methodOut.setDispAbnormalDelete88True(); 
          
//  SET 88-IP38201-OUTPUT-FILE TO TRUE
          methodOut.setIp38201OutputFile88True(); 
          
//  SET 88-IP38201-SPACE-IN-CYLINDERS TO TRUE
          methodOut.setIp38201SpaceInCylinders88True(); 
          
//  SET 88-IP38201-DISK TO TRUE
          methodOut.setIp38201Disk88True(); 
          
//  SET 88-IP38201-RELEASE TO TRUE
          methodOut.setIp38201Release88True(); 
          
//  SET 88-IP38201-RECFM-FIXED-BLOCKED TO TRUE
          methodOut.setIp38201RecfmFixedBlocked88True(); 
          
//  SET 88-IP38201-RECFM-FIXED-LENGTH TO TRUE
          methodOut.setIp38201RecfmFixedLength88True(); 
          
          // MOVE 500 TO IP38201-RECORD-COUNT
          methodOut.setIp38201RecordCount((long)500);
          // MOVE ZERO TO IP38201-BLKSIZE
          methodOut.setIp38201Blksize(0);
//  IF 88-800-IT-IS-TEST-ENV
          if ( methodIn.isItIsTestEnv88800()  ) { 
//  SET 88-IP38201-ENVRNMNT-IND-TEST TO TRUE
              methodOut.setIp38201EnvrnmntIndTest88True(); 
              
          }
//  ELSE
          else { 
//  MOVE 800-ENVIRONMENT-IND TO IP38201-ENVIRONMENT-INDICATOR
              methodOut.setIp38201EnvironmentIndicator(methodOut.getEnvironmentInd800());
          }
//  MOVE 800-JOB-GROUP TO IP64801-LRM-JOBGRP-NAME
          methodOut.setIp64801LrmJobgrpName(methodOut.getJobGroup800());
//  MOVE 800-JOB-NUMBER TO IP64801-LRM-JOBGRP-NUM
          methodOut.setIp64801LrmJobgrpNum(methodOut.getJobNumber800());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP38201-CLEARING-IDENTIFIER (4 : 2)
          methodOut.setIp38201ClearingIdentifier(replace(methodOut.getIp38201ClearingIdentifier(),String.valueOf(methodOut.getIp64801LrmJobgrpNumString()).toCharArray(),3,5));
//  CALL 800-PTR-IP760010
          // CALL 800-PTR-IP760010
          	programCtx.setRc( ip760010.process(programCtx.getGlobalCtx().getContext("IP760010")));
//  IF IP38201-RETURN-CODE EQUAL ZERO
          if (( allZeros(methodIn.getIp38201ReturnCode()) ) /*  ==  zeros*/) { 
//  MOVE IP38201-DSN TO 800-OUTPUT-DSN
              methodOut.setOutputDsn800(methodOut.getIp38201Dsn());
          }
//  ELSE
          else { 
//  MOVE 300-PARA-8300 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8300300());
//  SET 88-640-MCDYNAM-ALLOCATION TO TRUE
              methodOut.setMcdynamAllocation88640True(); 
              
//  PERFORM 8310-ABEND-ON-MCDYNAM-ERROR
              abendOnMcdynamError(programCtx.getAbendOnMcdynamErrorInCtx());/*8310-ABEND-ON-MCDYNAM-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * abendOnMcdynamError 
      *   This method is derived from 
  *   COBOL Paragraph - 8310-ABEND-ON-MCDYNAM-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - mcdynamAbendCode300            COBOL Name: 300-MCDYNAM-ABEND-CODE
      * - mcdynamErrorMsgTxt640          COBOL Name: 640-MCDYNAM-ERROR-MSG-TXT
      *
      * Output :  

      * - dsn640                         COBOL Name: 640-DSN
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - mcdynamRc640                   COBOL Name: 640-MCDYNAM-RC
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - mcdynamAbendCode300            COBOL Name: 300-MCDYNAM-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - mcdynamErrorMsgTxt640          COBOL Name: 640-MCDYNAM-ERROR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public AbendOnMcdynamErrorOutCtx abendOnMcdynamError(AbendOnMcdynamErrorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph invokes abend if the program ip760010-mcdynam    *
// *returns invalid return-code.                                    *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
AbendOnMcdynamErrorOutCtx methodOut = methodIn.getAbendOnMcdynamErrorOutCtx();
//  MOVE IP38201-DSN TO 640-DSN
          methodOut.setDsn640(methodOut.getIp38201Dsn());
//  MOVE IP38201-RETURN-CODE TO 640-MCDYNAM-RC
          methodOut.setMcdynamRc640(methodOut.getIp38201ReturnCode());
//  MOVE 300-MCDYNAM-ABEND-CODE TO 900-ABEND-CODE
          methodOut.setAbendCode900(methodOut.getMcdynamAbendCode300());
          // MOVE 640-MCDYNAM-ERROR-MSG-TXT TO 900-ABEND-TEXT
          methodOut.setAbendText900(methodOut.getMcdynamErrorMsgTxt640().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
          abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          ;
      
      return methodOut;
      }
      /**
      * closeSys001Cutoff 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-CLOSE-SYS001-CUTOFF COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - para8400300                    COBOL Name: 300-PARA-8400
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8400300                    COBOL Name: 300-PARA-8400
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CloseSys001CutoffOutCtx closeSys001Cutoff(CloseSys001CutoffInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph close sys001 and check file status.              *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
CloseSys001CutoffOutCtx methodOut = methodIn.getCloseSys001CutoffOutCtx();
//  CLOSE SYS001-CUTOFF-FILE
          sys001CutoffFile.close(); 
          methodOut.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(methodIn.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              methodOut.setSys00188800True(); 
              
//  SET 88-600-FILE-CLOSE-ERR TO TRUE
              methodOut.setFileCloseErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-PARA-8400 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8400300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * closeSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 8420-CLOSE-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - para8420300                    COBOL Name: 300-PARA-8420
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - isSys202OpenSw100              COBOL Name: 100-IS-SYS202-OPEN-SW
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8420300                    COBOL Name: 300-PARA-8420
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CloseSys202PmafileOutCtx closeSys202Pmafile(CloseSys202PmafileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph closes the settlement code control card. if any  *
// *i-o error occurs while closing it performs abend procedure.     *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
CloseSys202PmafileOutCtx methodOut = methodIn.getCloseSys202PmafileOutCtx();
//  CLOSE SYS202-PMA-FILE
          sys202PmaFile.close(); 
          methodOut.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
          if ( methodIn.isSys202IoGood88200()  ) { 
//  SET 88-100-SYS202-OPEN-N TO TRUE
              methodOut.setSys202OpenN88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-800-SYS202 TO TRUE
              methodOut.setSys20288800True(); 
              
//  SET 88-600-FILE-CLOSE-ERR TO TRUE
              methodOut.setFileCloseErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys202FileStatus200());
//  MOVE 300-PARA-8420 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8420300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * openIpSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 8430-OPEN-IP-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para8430300                    COBOL Name: 300-PARA-8430
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8430300                    COBOL Name: 300-PARA-8430
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenIpSys202PmafileOutCtx openIpSys202Pmafile(OpenIpSys202PmafileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens the pma file for input                     *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
OpenIpSys202PmafileOutCtx methodOut = methodIn.getOpenIpSys202PmafileOutCtx();
//  OPEN INPUT SYS202-PMA-FILE
          sys202PmaFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys202PmaFile.getFileName(),sys202PmaFile.getSys202PmaFileCharSet(),sys202PmaFile.getSys202PmaFileCrlfFlag());
          methodOut.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
//  ELSE
          if (!(methodOut.isSys202IoGood88200()) ) { 
//  SET 88-800-SYS202 TO TRUE
              methodOut.setSys20288800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              methodOut.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys202FileStatus200());
//  MOVE 300-PARA-8430 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8430300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * selectCkp 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-SELECT-CKP COBOL Cyclomatic complexity - 4
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      * - para8500300                    COBOL Name: 300-PARA-8500
      *
      * Output :  

      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip32101ChkJobGrpName           COBOL Name: IP32101-CHK-JOB-GRP-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip32101ChkJobGrpNum            COBOL Name: IP32101-CHK-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkLrmFiller            COBOL Name: IP32101-CHK-LRM-FILLER
      * - rc                             COBOL Name: RETURN-CODE
      * - cutoffCkpData800               COBOL Name: 800-CUTOFF-CKP-DATA
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffPimCkp800                COBOL Name: 800-CUTOFF-PIM-CKP
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8500300                    COBOL Name: 300-PARA-8500
      *
      * @throws CFException
      */
      @Override
      public SelectCkpOutCtx selectCkp(SelectCkpInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph retrieves the ckp row                            *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
SelectCkpOutCtx methodOut = methodIn.getSelectCkpOutCtx();
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue1300());
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP32101-CHK-JOB-GRP-NAME
          methodOut.setIp32101ChkJobGrpName(methodOut.getIp64801LrmJobgrpName());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP32101-CHK-JOB-GRP-NUM
          methodOut.setIp32101ChkJobGrpNum(String.valueOf(methodOut.getIp64801LrmJobgrpNumString()).toCharArray());
//  MOVE SPACES TO IP32101-CHK-LRM-FILLER
          methodOut.setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
//  CALL 800-PTR-IP599050
          // CALL 800-PTR-IP599050
          	programCtx.setRc( ip599050.process(programCtx.getGlobalCtx().getContext("IP599050")));
//  IF 88-100-ROWS-FOUND
          if ( methodOut.isRowsFound88100()  ) { 
//  IF IP32101-CHK-POINT-DATA-TXT-TXT GREATER SPACES
              if (             ( isGreaterThanSpaces(methodOut.getIp32101ChkPointDataTxtTxt()) )) { 
//  MOVE IP32101-CHK-POINT-DATA-TXT-TXT (1 : IP32101-CHK-POINT-DATA-TXT-LEN ) TO 800-CUTOFF-CKP-DATA
                  methodOut.getCutoffCkpData800().replace(methodIn.getIp32101TipackpTable()/*parent*/,19/*fromOffset - (cutoffCkpData800) */,methodIn.getIp32101ChkPointDataTxtLen()/*fromLen*/,0/*toOffset - (ip32101ChkPointDataTxtTxt) */,182/*toLen*/);
//  IF ( 800-CUTOFF-PIM-CKP >= 800-CUTOFF-PIM-BEGIN )
                  if ((		compareChars(methodOut.getCutoffPimCkp800(),methodIn.getCutoffPimBegin800()) >= 0 )) { 
                      // MOVE 800-CUTOFF-CKP-DATA TO 800-CUTOFF-TS-DATA
                      methodOut.getCutoffTsData800().setString(methodOut.getCutoffCkpData800().getCharArray());
                  }
//  ELSE
                  else { 
//  MOVE 300-PARA-8500 TO 900-ABEND-PARA
                      methodOut.setAbendPara900(methodOut.getPara8500300());
//  PERFORM 8520-UPDATE-CKP-ROW
                      updateCkpRow(programCtx.getUpdateCkpRowInCtx());/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                      commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
                  }
              }
          }
//  ELSE
          else { 
//  MOVE 300-PARA-8500 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8500300());
//  PERFORM 8510-INSERT-CKP-ROW
              insertCkpRow(programCtx.getInsertCkpRowInCtx());/*8510-INSERT-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
              commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
          }
      
      return methodOut;
      }
      /**
      * insertCkpRow 
      *   This method is derived from 
  *   COBOL Paragraph - 8510-INSERT-CKP-ROW COBOL Cyclomatic complexity - 1
      * Input  :  

      * - value3300                      COBOL Name: 300-VALUE-3
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      *
      * Output :  

      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - queryNo                        COBOL Name: QUERY-NO
      * - value3300                      COBOL Name: 300-VALUE-3
      * - ip32101ChkJobGrpName           COBOL Name: IP32101-CHK-JOB-GRP-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip32101ChkJobGrpNum            COBOL Name: IP32101-CHK-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkLrmFiller            COBOL Name: IP32101-CHK-LRM-FILLER
      * - ip32101ChkPointDataTxtLen      COBOL Name: IP32101-CHK-POINT-DATA-TXT-LEN
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public InsertCkpRowOutCtx insertCkpRow(InsertCkpRowInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph inserts ckp row.                                 *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
InsertCkpRowOutCtx methodOut = methodIn.getInsertCkpRowOutCtx();
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  SET 88-100-INSERT-RTN TO TRUE
          methodOut.setInsertRtn88100True(); 
          
//  SET 88-100-ROWS-NOT-FND TO TRUE
          methodOut.setRowsNotFnd88100True(); 
          
//  MOVE 300-VALUE-3 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue3300());
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP32101-CHK-JOB-GRP-NAME
          methodOut.setIp32101ChkJobGrpName(methodOut.getIp64801LrmJobgrpName());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP32101-CHK-JOB-GRP-NUM
          methodOut.setIp32101ChkJobGrpNum(String.valueOf(methodOut.getIp64801LrmJobgrpNumString()).toCharArray());
//  MOVE SPACES TO IP32101-CHK-LRM-FILLER
          methodOut.setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
//  MOVE 182 TO IP32101-CHK-POINT-DATA-TXT-LEN
          methodOut.setIp32101ChkPointDataTxtLen((short)182);
          // MOVE 800-CUTOFF-TS-DATA TO IP32101-CHK-POINT-DATA-TXT-TXT
          methodOut.setIp32101ChkPointDataTxtTxt(methodOut.getCutoffTsData800().toCharArray());
//  CALL 800-PTR-IP599050
          // CALL 800-PTR-IP599050
          	programCtx.setRc( ip599050.process(programCtx.getGlobalCtx().getContext("IP599050")));
      
      return methodOut;
      }
      /**
      * updateCkpRow 
      *   This method is derived from 
  *   COBOL Paragraph - 8520-UPDATE-CKP-ROW COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - value2300                      COBOL Name: 300-VALUE-2
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      *
      * Output :  

      * - ip32101ChkJobGrpName           COBOL Name: IP32101-CHK-JOB-GRP-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip32101ChkJobGrpNum            COBOL Name: IP32101-CHK-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkLrmFiller            COBOL Name: IP32101-CHK-LRM-FILLER
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value2300                      COBOL Name: 300-VALUE-2
      * - ip32101ChkPointDataTxtLen      COBOL Name: IP32101-CHK-POINT-DATA-TXT-LEN
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public UpdateCkpRowOutCtx updateCkpRow(UpdateCkpRowInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph updates ckp row.                                 *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
UpdateCkpRowOutCtx methodOut = methodIn.getUpdateCkpRowOutCtx();
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP32101-CHK-JOB-GRP-NAME
          methodOut.setIp32101ChkJobGrpName(methodOut.getIp64801LrmJobgrpName());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP32101-CHK-JOB-GRP-NUM
          methodOut.setIp32101ChkJobGrpNum(String.valueOf(methodOut.getIp64801LrmJobgrpNumString()).toCharArray());
//  MOVE SPACES TO IP32101-CHK-LRM-FILLER
          methodOut.setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          
//  SET 88-100-UPDATE-RTN TO TRUE
          methodOut.setUpdateRtn88100True(); 
          
//  MOVE 300-VALUE-2 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue2300());
//  MOVE 182 TO IP32101-CHK-POINT-DATA-TXT-LEN
          methodOut.setIp32101ChkPointDataTxtLen((short)182);
//  MOVE 800-CUTOFF-TS-DATA TO IP32101-CHK-POINT-DATA-TXT-TXT (1 : IP32101-CHK-POINT-DATA-TXT-LEN )
          methodOut.setIp32101ChkPointDataTxtTxt(replace(methodOut.getIp32101ChkPointDataTxtTxt(),methodOut.getCutoffTsData800().toCharArray(),0,methodOut.getIp32101ChkPointDataTxtLen()));
//  CALL 800-PTR-IP599050
          // CALL 800-PTR-IP599050
          	programCtx.setRc( ip599050.process(programCtx.getGlobalCtx().getContext("IP599050")));
      
      return methodOut;
      }
      /**
      * getCurrentTimestamp 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-GET-CURRENT-TIMESTAMP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public GetCurrentTimestampOutCtx getCurrentTimestamp(GetCurrentTimestampInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph  calls routine to get the current timestamp.    *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
GetCurrentTimestampOutCtx methodOut = methodIn.getGetCurrentTimestampOutCtx();
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue1300());
//  CALL 800-PTR-IP500920
          // CALL 800-PTR-IP500920
          	programCtx.setRc( ip500920.process(programCtx.getGlobalCtx().getContext("IP500920")));
      
      return methodOut;
      }
      /**
      * insertTipapim 
      *   This method is derived from 
  *   COBOL Paragraph - 8700-INSERT-TIPAPIM COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - value4300                      COBOL Name: 300-VALUE-4
      * - ip34631CreateUpdateTs          COBOL Name: IP34631-CREATE-UPDATE-TS
      * - ip34631ActionCode              COBOL Name: IP34631-ACTION-CODE
      * - valueR300                      COBOL Name: 300-VALUE-R
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - mqPimInsert400                 COBOL Name: 400-MQ-PIM-INSERT
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      *
      * Output :  

      * - createUpdateTs800              COBOL Name: 800-CREATE-UPDATE-TS
      * - obsAccessTs800                 COBOL Name: 800-OBS-ACCESS-TS
      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value4300                      COBOL Name: 300-VALUE-4
      * - cutoffPimTmpTs800              COBOL Name: 800-CUTOFF-PIM-TMP-TS
      * - ip34631CreateUpdateTs          COBOL Name: IP34631-CREATE-UPDATE-TS
      * - ip34631ObsAccessTs             COBOL Name: IP34631-OBS-ACCESS-TS
      * - ip34631ObsAccessTsN            COBOL Name: IP34631-OBS-ACCESS-TS-N
      * - rc                             COBOL Name: RETURN-CODE
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - mqPimInsert400                 COBOL Name: 400-MQ-PIM-INSERT
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      *
      * @throws CFException
      */
      @Override
      public InsertTipapimOutCtx insertTipapim(InsertTipapimInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Insert into gcms table.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
InsertTipapimOutCtx methodOut = methodIn.getInsertTipapimOutCtx();
//  PERFORM 8600-GET-CURRENT-TIMESTAMP
          getCurrentTimestamp(programCtx.getGetCurrentTimestampInCtx());/*8600-GET-CURRENT-TIMESTAMP*/
          // MOVE IP50921-CURRENT-TS TO 800-CREATE-UPDATE-TS 800-OBS-ACCESS-TS
          methodOut.setCreateUpdateTs800(methodOut.getIp50921CurrentTs());
          methodOut.setObsAccessTs800(methodOut.getIp50921CurrentTs());
//  SET 88-100-INSERT-RTN TO TRUE
          methodOut.setInsertRtn88100True(); 
          
//  SET 88-100-ROWS-NOT-FND TO TRUE
          methodOut.setRowsNotFnd88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-4 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue4300());
//  IF IP34631-CREATE-UPDATE-TS EQUAL SPACES
          if (        ( allSpaces(methodOut.getIp34631CreateUpdateTs())   )) { 
//  MOVE 800-CREATE-UPDATE-TS TO 800-CUTOFF-PIM-TMP-TS IP34631-CREATE-UPDATE-TS
              methodOut.setCutoffPimTmpTs800(methodOut.getCreateUpdateTs800());
              methodOut.getIp34631CreateUpdateTs().setString(methodOut.getCreateUpdateTs800());
          }
//  ELSE
          else { 
//  IF IP34631-ACTION-CODE = 300-VALUE-R
              if (		compareChars(methodIn.getIp34631ActionCode(),methodIn.getValueR300()) == 0 ) { 
                  // MOVE IP34631-CREATE-UPDATE-TS TO 800-CUTOFF-PIM-TMP-TS
                  methodOut.setCutoffPimTmpTs800(methodOut.getIp34631CreateUpdateTs().toCharArray());
//  MOVE 800-CREATE-UPDATE-TS TO IP34631-CREATE-UPDATE-TS
                  methodOut.getIp34631CreateUpdateTs().setString(methodOut.getCreateUpdateTs800());
              }
//  ELSE
              else { 
                  // MOVE IP34631-CREATE-UPDATE-TS TO 800-CUTOFF-PIM-TMP-TS
                  methodOut.setCutoffPimTmpTs800(methodOut.getIp34631CreateUpdateTs().toCharArray());
              }
          }
//  MOVE 800-OBS-ACCESS-TS TO IP34631-OBS-ACCESS-TS
          methodOut.setIp34631ObsAccessTs(methodOut.getObsAccessTs800());
//  MOVE ZEROS TO IP34631-OBS-ACCESS-TS-N
          methodOut.setIp34631ObsAccessTsN(CONSTANTS.ZERO_1);
//  CALL 800-PTR-IP532010
          // CALL 800-PTR-IP532010
          	programCtx.setRc( ip532010.process(programCtx.getGlobalCtx().getContext("IP532010")));
//  IF 88-100-ROWS-FOUND OR 88-100-DUPLICATE-CODE
          if ( methodOut.isRowsFound88100()   ||  methodOut.isDuplicateCode88100()  ) { 
//  ADD 1 TO 400-TIPAPIM-ROWS-INSERTED 400-PIM-COMMIT-CNT 400-MQ-PIM-INSERT
              methodOut.setTipapimRowsInserted400(methodOut.getTipapimRowsInserted400()+1);
              methodOut.setPimCommitCnt400(methodOut.getPimCommitCnt400()+1);
              methodOut.setMqPimInsert400(methodOut.getMqPimInsert400()+1);
//  MOVE 800-CUTOFF-PIM-TMP-TS TO 800-CUTOFF-PIM-BEGIN
              methodOut.setCutoffPimBegin800(methodOut.getCutoffPimTmpTs800());
//  IF 400-PIM-COMMIT-CNT >= 800-COMMIT-CNT
              if (	( methodOut.getPimCommitCnt400() >= methodIn.getCommitCnt800() )) { 
//  MOVE ZEROES TO 400-PIM-COMMIT-CNT
                  methodOut.setPimCommitCnt400(0);
//  PERFORM 8520-UPDATE-CKP-ROW
                  updateCkpRow(programCtx.getUpdateCkpRowInCtx());/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                  commitSql(programCtx.getCommitSqlInCtx());/*8800-COMMIT-SQL*/
              }
          }
      
      return methodOut;
      }
      /**
      * commitSql 
      *   This method is derived from 
  *   COBOL Paragraph - 8800-COMMIT-SQL COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public CommitSqlOutCtx commitSql(CommitSqlInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *Commit the logical unit of work.                                *
// *----------------------------------------------------------------*
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
CommitSqlOutCtx methodOut = methodIn.getCommitSqlOutCtx();
//  CALL 800-PTR-IP599810
          // CALL 800-PTR-IP599810
          	programCtx.setRc( ip599810.process(programCtx.getGlobalCtx().getContext("IP599810")));
      
      return methodOut;
      }
      /**
      * writeMqFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8900-WRITE-MQ-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys210MqDataRec                COBOL Name: SYS210-MQ-DATA-REC
      * - para8900300                    COBOL Name: 300-PARA-8900
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8900300                    COBOL Name: 300-PARA-8900
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public WriteMqFileOutCtx writeMqFile(WriteMqFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is used to write mq data in file.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
WriteMqFileOutCtx methodOut = methodIn.getWriteMqFileOutCtx();
//  WRITE SYS210-MQ-DATA-REC END-WRITE
          sys210MqDataFile.write(methodOut.getSys210MqDataRec().toCharArray()); 
          methodOut.getSys210MqDataRec().setString(CONSTANTS.LOW_VALUE_215635768);
          methodOut.setSys210FileStatus200(sys210MqDataFile.getStatusString() );
//  IF 88-200-SYS210-IO-GOOD
//  ELSE
          if (!(methodOut.isSys210IoGood88200()) ) { 
//  SET 88-800-SYS210 TO TRUE
              methodOut.setSys21088800True(); 
              
//  SET 88-600-FILE-WRITE-ERR TO TRUE
              methodOut.setFileWriteErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              methodOut.setFileName600(methodOut.getFileName800());
//  MOVE 200-SYS210-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys210FileStatus200());
//  MOVE 300-PARA-8900 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8900300());
//  MOVE 300-WRITE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getWriteAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getFileIoErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * abendTheProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9500-ABEND-THE-PROGRAM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - astriskLine900                 COBOL Name: 900-ASTRISK-LINE
      * - abendAbend900                  COBOL Name: 900-ABEND-ABEND
      * - abendAbendPgm900               COBOL Name: 900-ABEND-ABEND-PGM
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public AbendTheProgramOutCtx abendTheProgram(AbendTheProgramInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is to perform whenever abend occurs.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
AbendTheProgramOutCtx methodOut = methodIn.getAbendTheProgramOutCtx();
//  PERFORM 9510-DISPLAY-NET-TOTAL
          displayNetTotal(programCtx.getDisplayNetTotalInCtx());/*9510-DISPLAY-NET-TOTAL*/
//  MOVE 300-PGM-IP798030 TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getPgmIp798030300());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendText900());
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
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
      return methodOut;
      }
      /**
      * displayNetTotal 
      *   This method is derived from 
  *   COBOL Paragraph - 9510-DISPLAY-NET-TOTAL COBOL Cyclomatic complexity - 2
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - tipapimRowsReplaced400         COBOL Name: 400-TIPAPIM-ROWS-REPLACED
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void displayNetTotal(DisplayNetTotalInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph displays the total number of records inserted
// *so far in pma/pmi.
// *-----------------------------------------------------------------
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
//  IF 88-100-PROCESSING-REMOTELY
          if ( methodIn.isProcessingRemotely88100()  ) { 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
//  DISPLAY 'IP798030-TOTAL GCMS PIM ROWS INSERTED => ' 400-TIPAPIM-ROWS-INSERTED
              logger.info("IP798030-TOTAL GCMS PIM ROWS INSERTED => {}", String.valueOf(methodIn.getTipapimRowsInserted400())); 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
          }
//  ELSE
          else { 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
//  DISPLAY 'IP798030-TOTAL AUTH PMA ROWS DELETED  => ' 400-TAMAPMA-ROWS-DELETED
              logger.info("IP798030-TOTAL AUTH PMA ROWS DELETED  => {}", String.valueOf(methodIn.getTamapmaRowsDeleted400())); 
//  DISPLAY 'IP798030-TOTAL GCMS PIM ROWS INSERTED => ' 400-TIPAPIM-ROWS-INSERTED
              logger.info("IP798030-TOTAL GCMS PIM ROWS INSERTED => {}", String.valueOf(methodIn.getTipapimRowsInserted400())); 
//  DISPLAY 'IP798030-TOTAL GCMS PIM ROWS REPLACED => ' 400-TIPAPIM-ROWS-REPLACED
              logger.info("IP798030-TOTAL GCMS PIM ROWS REPLACED => {}", String.valueOf(methodIn.getTipapimRowsReplaced400())); 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
          }
      
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
      
// * Element ip601011 as of 10/31/02 04:53:52                    [vc]
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
Ip798030Ctx programCtx = methodIn.getIp798030Ctx();
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
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Ip798030Ctx programCtx = (Ip798030Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParms().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Ip798030Ctx programCtx = (Ip798030Ctx) ctx;
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
      
      
      public void setFromIp282210(Ip798030Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getIp28221PaTableRestart().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getIp28221PaTableRestart().setString((char[])params[0] );
      }
  
  
  
  
  
  }
  /* 
* element ip798030 as of 10/23/19 10:00:40                    [vc]
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
*date-written.  jun, 2018.                                       *
*date-compiled. jun, 2018.                                       *
*security.      property of mastercard international, inc.       *
*----------------------------------------------------------------*
*program functionality: lrm updater driver for tipapim.          *
*----------------------------------------------------------------*
*this program,                                                   *
* 1. connects to gcms db2 server using db2 caf                   *
*                                                                *
* 2. reads the cutoff file sys001 to retrieve the pim begin      *
* timestamps.                                                    *
*                                                                *
* 3. determine whether tipackp has any record for 'pimu 01'. if  *
* present,compare the timestamp with sys001 and if it is greater,*
* update it to tipackp.                                          *
*                                                                *
* 4. calls driver ip595010 which in turn calls db2 api ip595110  *
* to retrieve the current clearing cycle                         *
*                                                                *
* 5. calls lrm common driver module ip648010 to update the # of  *
* running column on the lrm table to 1                           *
*                                                                *
* 6. calls ip699910 to connect to the auth db2 server            *
*                                                                *
* 7. calls driver ip534110 which in turn calls db2 api ip534120  *
* to retrieve data from the auth pma table.                      *
*                                                                *
* 8. calls ip699910 to reset connection to gcms db2 server       *
*                                                                *
* 9. calls db2 api ip532210 to insert rows into the gcms pim table
*                                                                *
* 10. calls ip699910 to connect to auth db2 server               *
*                                                                *
* 11. api ip534130 to delete the row from the auth pma table     *
* since this row would now be available in the gcms pim table.   *
*                                                                *
* 12. calls ip699910 to reset connection to gcms db2 server      *
*                                                                *
* 13. if any data was retrieved for the auth pma, the tipackp    *
* table is updated with maximum timestamps of the pma row        *
* respectively.                                                  *
*                                                                *
* 14. calls ip648010 to issue a done request and request to sleep*
*----------------------------------------------------------------*
* additional information : -                                     *
*                                                                *
* 1) for an insert or an update , data is committed after        *
* commit count is achieved.                                      *
*                                                                *
* 2) for a delete data is committed each records processed in    *
* tamapma table.                                                 *
*                                                                *
* 3) no special restart logic required for this process          *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 - i5256                 *
*                    :incontrol rcn replacement                  *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :initial version                            *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 - i8682                 *
*                     indonesia on soil                          *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :this program modified to perform different *
*                     process when it executing in zos and in the*
*                     linux.                                     *
*                     added mq logic to put messages in queue    *
*                     when executing in zos.                     *
*                     added mq logic to get messages from queue  *
*                     when executing in linux.                   *
*----------------------------------------------------------------*
*    project         :gcms asi - out of release                  *
*                     pbi000000002141                            *
*    date            :2019/03/15                                 *
*    programmer      :wipro                                      *
*    modification    :this program is modified to avoid the      *
*                     recursive send of mq data.                 *
*----------------------------------------------------------------*
*    project        :gcms release 19.q4 - i13263                 *
*                    mdes stop gap solution                      *
*    date           :2019/10/18                                  *
*    programmer     :shankar subramanian                         *
*    modification   :modified the program to use copybook        *
*                    ip798021 in the linkage parameter section.  *
*----------------------------------------------------------------*
*/
