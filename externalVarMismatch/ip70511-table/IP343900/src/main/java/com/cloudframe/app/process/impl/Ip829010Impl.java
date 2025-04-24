  package com.cloudframe.app.process.impl;
  /* 
* element ip829010 as of 12/27/21 07:23:40                    [vc]
*****************************************************************
*          -- -- -- c o n f i d e n t i a l -- -- --            *
*    this item contains information and procedures which are    *
*    proprietary to mastercard international, incorporated,     *
*    and which are confidential.  it is provided with the       *
*    express understanding that it is to be used only for the   *
*    benefit of interbank card association, and is not to be    *
*    used, copied, or disclosed for any other purpose.  any     *
*    authorized reproduction (in whole or in part) of this      *
*    material must be marked with this legend.                  *
*****************************************************************
*author.         sagar rout.
*date-written.   november, 2021.
*date compiled.  november, 2021.
*security.       property of mastercard international, inc.
*----------------------------------------------------------------*
*program functionality:                                          *
*----------------------------------------------------------------*
* this new program will run in lcms & global.                    *
* the logic of this program is as follows :-                     *
* 1) mqget chargeback transaction payload from the fraud mq.     *
*    this data is loaded into mq by wlm global.                  *
*    get the fac count data from response queue (only in global) *
* 2) insert information into tipamrs (only in global)            *
* 3) do the below steps in lcms only.                            *
*     i)  for every transaction record, get tipafac count,       *
*         tipafaa close date, pan status code                    *
*     ii) mqput the information to global queue.                 *
* 3) there is a mq out error file created to keep a track of     *
*    below failed txns :-                                        *
*    a) mq get fail error                                        *
*    b) mq put fail error                                        *
*    c) tipamrs insert failure,abend                             *
*    d) tipamrs duplicate txns                                   *
*    e) validate queue data based on invalid pan,exp dt,van,gft. *
*    f) tipafaa/fac entries not found in india lcms site.        *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
*    project        :gcms release 22.q1 - i4508                  *
*                    ios fns sync process                        *
*    date           :2022/03/22                                  *
*    programmer     :sagar rout                                  *
*    modification   :initial version                             *
*----------------------------------------------------------------*
*/
  
  import com.cloudframe.app.ip829010.Ip829010Ctx.*;
  import com.cloudframe.app.ip829010.Ip829010Ctx;
  import com.cloudframe.app.process.Ip829010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip996020;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.process.Ip890110;
  import com.cloudframe.app.process.Ip081110;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.process.Ip282210;
  import com.cloudframe.app.process.Ip703020;
  import com.cloudframe.app.ip829010.file.*;
  import com.cloudframe.app.process.Ip599810;
  import com.cloudframe.app.global.sharedvar.FnsPldRd;
  import com.cloudframe.app.process.Ip708020;
  import com.cloudframe.app.process.Ip595210;
  import com.cloudframe.app.process.Ip586010;
  import com.cloudframe.app.process.Ip521010;
  import com.cloudframe.app.process.Ip708010;
  import com.cloudframe.app.process.Ip648010;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.ip829010.dto.*;
  import com.cloudframe.app.ip829010.dto.Parms1000;
  import com.cloudframe.app.ip829010.dto.MrsRowCnt608;
  import com.cloudframe.app.ip829010.dto.TipamrsSkipCnt611;
  import com.cloudframe.app.ip829010.dto.ErrorMsg6003011;
  import com.cloudframe.app.ip829010.dto.AbendMessage900;
  import com.cloudframe.app.ip829010.dto.QueueVars800;
  import com.cloudframe.app.ip829010.dto.MqputFailCnt613;
  import com.cloudframe.app.ip829010.dto.Ip28221PaTableRestart;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.ip829010.dto.FraudMqDebugDisp600;
  import com.cloudframe.app.ip829010.dto.Ip82921ErrMsgOut;
  import com.cloudframe.app.global.sharedvar.Ip70711TipamrsEntries;
  import com.cloudframe.app.ip829010.dto.ErrorMsg6003010;
  import com.cloudframe.app.ip829010.dto.MqputSkipCnt610;
  import com.cloudframe.app.ip829010.dto.QueueErrorMsg611;
  import com.cloudframe.app.ip829010.dto.AbendPara900;
  import com.cloudframe.app.ip829010.dto.FaaFacNotFndCnt614;
  import com.cloudframe.app.ip829010.dto.FnsPayload;
  import com.cloudframe.app.ip829010.file.records.Sys201ErrMsgOut;
  import com.cloudframe.app.ip829010.dto.MqgetFailCnt612;
  import com.cloudframe.app.ip829010.dto.ErrorMsg6003012;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.global.sharedvar.ApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip996021JobInformation;
  import com.cloudframe.app.global.sharedvar.Ip30771TipacliTable;
  import com.cloudframe.app.global.sharedvar.Ip30781TipaccdTable;
  import com.cloudframe.app.global.sharedvar.Ip30881Db2McwaitInputValue;
  import com.cloudframe.app.global.sharedvar.Ip34051MqProcessParameters;
  import com.cloudframe.app.global.sharedvar.Ip50211Tipafac;
  import com.cloudframe.app.global.sharedvar.Ip50201Tipafaa;
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
  import com.cloudframe.app.global.sharedvar.Ip70301AlmPreMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301AlmChaMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301AlmRspMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301QrRfndMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301MpAchMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmtIdnMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmtRusMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmtIndMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaAmsMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmiAmsMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PimAmsMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaIdnMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaRusMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaIndMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmiIdnMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmiRusMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmiIndMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PimIdnMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PimRusMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PimIndMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.ArePhysicalFilesOverGroup100;
  import com.cloudframe.app.global.sharedvar.CheckCloseQueueGroup100;
  import com.cloudframe.app.global.sharedvar.CheckGetQueueGroup100;
  import com.cloudframe.app.global.sharedvar.CheckPutQueueGroup100;
  import com.cloudframe.app.global.sharedvar.Ip70301LnCloneOwnerIdGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301LnCommitCntGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301OrigMsgLenGroup;
  import com.cloudframe.app.global.sharedvar.Ip57901Tipaqpr;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip64801LrmCommBlock;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip70511Table;
  import com.cloudframe.app.global.sharedvar.Ip70511EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip7051f4Table;
  import com.cloudframe.app.global.sharedvar.Ip7051f4EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip70521MqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip7052f4MqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip70701TipamrqEntries;
  import com.cloudframe.app.global.sharedvar.Ip89011EnvironmentIndArea;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.GetBrowseCallsGroup100;
  import com.cloudframe.app.global.sharedvar.LinkVariable800;
  import com.cloudframe.app.ip829010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip829010")
  
  public class Ip829010Impl extends CommonProcess implements Ip829010 {
  
  Logger logger = LoggerFactory.getLogger(Ip829010Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("ip890110")
  Ip890110 ip890110;
  @Autowired 
  @Qualifier("ip829010_sys201FnsMqErrFile")
  Sys201FnsMqErrFile sys201FnsMqErrFile;
  @Autowired 
  @Qualifier("ip595210")
  Ip595210 ip595210;
  @Autowired 
  @Qualifier("ip586010")
  Ip586010 ip586010;
  @Autowired 
  @Qualifier("ip521010")
  Ip521010 ip521010;
  @Autowired 
  @Qualifier("ip708010")
  Ip708010 ip708010;
  
  
  
  
  
  
      @Override
      public int setParameter(Ip829010Ctx programCtx, String parms1000) throws Exception {
      		if(parms1000 != null)
      		    programCtx.getParms1000().setString(com.cloudframe.app.data.Field.getParm(parms1000),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(Ip829010Ctx programCtx) throws Exception {
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
      		if(sys201FnsMqErrFile.hasOpened() && !sys201FnsMqErrFile.isReadOnly()) { 
      			sys201FnsMqErrFile.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph performs an initialization routine, which does
// * the necessary initialization. it performs another routine to
// * perform actual check, at the end, it returns back to the calling
// * program.
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
//  PERFORM 1000-PERFORM-INITIALIZATION
          performInitialization(programCtx.getPerformInitializationInCtx());/*1000-PERFORM-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-GET-QUEUE-MESSAGES UNTIL IP64801-88-LRM-STAT-END
          while (!(methodIn.isIp6480188LrmStatEnd()) ) {
             getQueueMessages(programCtx.getGetQueueMessagesInCtx());/*2000-GET-QUEUE-MESSAGES*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }
//  IF IP64801-88-LRM-STAT-END
          if ( methodIn.isIp6480188LrmStatEnd()  ) { 
//  PERFORM 3000-CLOSE-QUEUE
              closeQueue(programCtx.getCloseQueueInCtx());/*3000-CLOSE-QUEUE*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
//  PERFORM 3100-CLOSE-ERR-FILE-SYS201
              closeErrFileSys201(programCtx.getCloseErrFileSys201InCtx());/*3100-CLOSE-ERR-FILE-SYS201*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * performInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-PERFORM-INITIALIZATION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * Output :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public PerformInitializationOutCtx performInitialization(PerformInitializationInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * The initialization activities are done in this paragraph,
// * if it is the first time then it performs a routine to display
// * log details and set not-the-first-time indicator to true.
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
PerformInitializationOutCtx methodOut = methodIn.getPerformInitializationOutCtx();
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers(programCtx.getSetProcedurePointersInCtx());/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-INITIALIZE-VARIABLES
              initializeVariables(programCtx.getInitializeVariablesInCtx());/*1300-INITIALIZE-VARIABLES*/
//  PERFORM 9950-UPDATE-EVENT-LOG
              updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
//  PERFORM 1400-GET-MQ-RESP-JOB-NAME
              getMqRespJobName(programCtx.getGetMqRespJobNameInCtx());/*1400-GET-MQ-RESP-JOB-NAME*/
//  PERFORM 1500-PROCESS-SYS09E-CTRL-CARD
              processSys09eCtrlCard(programCtx.getProcessSys09eCtrlCardInCtx());/*1500-PROCESS-SYS09E-CTRL-CARD*/
//  PERFORM 1600-PROCESS-RUNCNTL-FILE
              processRuncntlFile(programCtx.getProcessRuncntlFileInCtx());/*1600-PROCESS-RUNCNTL-FILE*/
//  PERFORM 1650-GET-TBL201-INFO
              getTbl201Info(programCtx.getGetTbl201InfoInCtx());/*1650-GET-TBL201-INFO*/
//  PERFORM 1700-START-LRM
              startLrm(programCtx.getStartLrmInCtx());/*1700-START-LRM*/
//  PERFORM 1800-CONNECT-MQ
              connectMq(programCtx.getConnectMqInCtx());/*1800-CONNECT-MQ*/
//  PERFORM 1900-OPEN-ERR-FILE-SYS201
              openErrFileSys201(programCtx.getOpenErrFileSys201InCtx());/*1900-OPEN-ERR-FILE-SYS201*/
          }
      
      return methodOut;
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp829010300                 COBOL Name: 300-PGM-IP829010
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmIp829010300                 COBOL Name: 300-PGM-IP829010
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph displays program execution messages.             *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  MOVE 300-PGM-IP829010 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmIp829010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1388126366));
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 15
      * Input  :  

      * - abendPgm300                    COBOL Name: 300-ABEND-PGM
      * - pgmIp081110300                 COBOL Name: 300-PGM-IP081110
      * - pgmIp282210300                 COBOL Name: 300-PGM-IP282210
      * - pgmIp586010300                 COBOL Name: 300-PGM-IP586010
      * - pgmIp599810300                 COBOL Name: 300-PGM-IP599810
      * - pgmIp595210300                 COBOL Name: 300-PGM-IP595210
      * - pgmIp648010300                 COBOL Name: 300-PGM-IP648010
      * - pgmIp708020300                 COBOL Name: 300-PGM-IP708020
      * - pgmIp703020300                 COBOL Name: 300-PGM-IP703020
      * - pgmIp890110300                 COBOL Name: 300-PGM-IP890110
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - pgmIp996020300                 COBOL Name: 300-PGM-IP996020
      * - pgmIp521010300                 COBOL Name: 300-PGM-IP521010
      * - pgmIp708010300                 COBOL Name: 300-PGM-IP708010
      *
      * Output :  

      * - abendPtr800                    COBOL Name: 800-ABEND-PTR
      * - ptrIp081110800                 COBOL Name: 800-PTR-IP081110
      * - ptrIp282210800                 COBOL Name: 800-PTR-IP282210
      * - ptrIp586010800                 COBOL Name: 800-PTR-IP586010
      * - ptrIp599810800                 COBOL Name: 800-PTR-IP599810
      * - ptrIp595210800                 COBOL Name: 800-PTR-IP595210
      * - ptrIp648010800                 COBOL Name: 800-PTR-IP648010
      * - ptrIp708020800                 COBOL Name: 800-PTR-IP708020
      * - ptrIp703020800                 COBOL Name: 800-PTR-IP703020
      * - ptrIp890110800                 COBOL Name: 800-PTR-IP890110
      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ptrIp996020800                 COBOL Name: 800-PTR-IP996020
      * - ptrIp521010800                 COBOL Name: 800-PTR-IP521010
      * - ptrIp708010800                 COBOL Name: 800-PTR-IP708010
      *
      * @throws CFException
      */
      @Override
      public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception {
      
// *------------------------------------------------------------
// *This para sets the procedure pointers.
// *------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
SetProcedurePointersOutCtx methodOut = methodIn.getSetProcedurePointersOutCtx();
//  SET 800-ABEND-PTR TO ENTRY 300-ABEND-PGM
          methodOut.setAbendPtr800(methodIn.getAbendPgm300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          methodOut.setPtrIp081110800(methodIn.getPgmIp081110300()); 
          
//  SET 800-PTR-IP282210 TO ENTRY 300-PGM-IP282210
          methodOut.setPtrIp282210800(methodIn.getPgmIp282210300()); 
          
//  SET 800-PTR-IP586010 TO ENTRY 300-PGM-IP586010
          methodOut.setPtrIp586010800(methodIn.getPgmIp586010300()); 
          
//  SET 800-PTR-IP599810 TO ENTRY 300-PGM-IP599810
          methodOut.setPtrIp599810800(methodIn.getPgmIp599810300()); 
          
//  SET 800-PTR-IP595210 TO ENTRY 300-PGM-IP595210
          methodOut.setPtrIp595210800(methodIn.getPgmIp595210300()); 
          
//  SET 800-PTR-IP648010 TO ENTRY 300-PGM-IP648010
          methodOut.setPtrIp648010800(methodIn.getPgmIp648010300()); 
          
//  SET 800-PTR-IP708020 TO ENTRY 300-PGM-IP708020
          methodOut.setPtrIp708020800(methodIn.getPgmIp708020300()); 
          
//  SET 800-PTR-IP703020 TO ENTRY 300-PGM-IP703020
          methodOut.setPtrIp703020800(methodIn.getPgmIp703020300()); 
          
//  SET 800-PTR-IP890110 TO ENTRY 300-PGM-IP890110
          methodOut.setPtrIp890110800(methodIn.getPgmIp890110300()); 
          
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  SET 800-PTR-IP996020 TO ENTRY 300-PGM-IP996020
          methodOut.setPtrIp996020800(methodIn.getPgmIp996020300()); 
          
//  SET 800-PTR-IP521010 TO ENTRY 300-PGM-IP521010
          methodOut.setPtrIp521010800(methodIn.getPgmIp521010300()); 
          
//  SET 800-PTR-IP708010 TO ENTRY 300-PGM-IP708010
          methodOut.setPtrIp708010800(methodIn.getPgmIp708010300()); 
          
      
      return methodOut;
      }
      /**
      * initializeVariables 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-INITIALIZE-VARIABLES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip996021JobName                COBOL Name: IP996021-JOB-NAME
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      *
      * Output :  

      * - ip70301IsFraudMqSrvActive      COBOL Name: IP70301-IS-FRAUD-MQ-SRV-ACTIVE
      * - mqputSkipCount800              COBOL Name: 800-MQPUT-SKIP-COUNT
      * - tipamrsSkipCount800            COBOL Name: 800-TIPAMRS-SKIP-COUNT
      * - faaFacNotFndCnt800             COBOL Name: 800-FAA-FAC-NOT-FND-CNT
      * - mqgetFailCount800              COBOL Name: 800-MQGET-FAIL-COUNT
      * - mqputFailCount800              COBOL Name: 800-MQPUT-FAIL-COUNT
      * - ip70711GftDasetNam             COBOL Name: IP70711-GFT-DASET-NAM
      * - rc                             COBOL Name: RETURN-CODE
      * - jobname800                     COBOL Name: 800-JOBNAME
      * - ip996021JobName                COBOL Name: IP996021-JOB-NAME
      * - ip70511Cpu                     COBOL Name: IP70511-CPU
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      *
      * @throws CFException
      */
      @Override
      public InitializeVariablesOutCtx initializeVariables(InitializeVariablesInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para initializes the required variables.
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
InitializeVariablesOutCtx methodOut = methodIn.getInitializeVariablesOutCtx();
//  SET 88-IP70301-FRAUD-MQ-ACTIVE-N TO TRUE
          methodOut.setIp70301FraudMqActiveN88True(); 
          
//  MOVE ZEROES TO 800-MQPUT-SKIP-COUNT
          methodOut.setMqputSkipCount800(0);
//  MOVE ZEROES TO 800-TIPAMRS-SKIP-COUNT
          methodOut.setTipamrsSkipCount800(0);
//  MOVE ZEROES TO 800-FAA-FAC-NOT-FND-CNT
          methodOut.setFaaFacNotFndCnt800(0);
//  MOVE ZEROES TO 800-MQGET-FAIL-COUNT
          methodOut.setMqgetFailCount800(0);
//  MOVE ZEROES TO 800-MQPUT-FAIL-COUNT
          methodOut.setMqputFailCount800(0);
//  MOVE SPACES TO IP70711-GFT-DASET-NAM
          methodOut.setIp70711GftDasetNam(CONSTANTS.SPACE_44);
//  CALL 800-PTR-IP996020
          // CALL 800-PTR-IP996020
          	programCtx.setRc( ip996020.process(programCtx.getGlobalCtx().getContext("IP996020")));
          // MOVE IP996021-JOB-NAME TO 800-JOBNAME
          methodOut.setJobname800(methodOut.getIp996021JobName());
//  MOVE IP996021-LPAR-NAME TO IP70511-CPU
          methodOut.setIp70511Cpu(methodOut.getIp996021LparName());
      
      return methodOut;
      }
      /**
      * getMqRespJobName 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-GET-MQ-RESP-JOB-NAME COBOL Cyclomatic complexity - 6
      * Input  :  

      * - lnMqDebugSw1000                COBOL Name: 1000-LN-MQ-DEBUG-SW
      * - lnFacreqJobgrpName1000         COBOL Name: 1000-LN-FACREQ-JOBGRP-NAME
      * - lnFacreqJobgrpNum1000          COBOL Name: 1000-LN-FACREQ-JOBGRP-NUM
      * - valueFacreq300                 COBOL Name: 300-VALUE-FACREQ
      * - jobNameError600                COBOL Name: 600-JOB-NAME-ERROR
      * - paraName1400300                COBOL Name: 300-PARA-NAME-1400
      * - jobnameErrorAbendCode300       COBOL Name: 300-JOBNAME-ERROR-ABEND-CODE
      * - jobNumError601                 COBOL Name: 601-JOB-NUM-ERROR
      * - jobnumErrorAbendCode300        COBOL Name: 300-JOBNUM-ERROR-ABEND-CODE
      * - lnParm911Retry1000             COBOL Name: 1000-LN-PARM-911-RETRY
      * - retryCountError602             COBOL Name: 602-RETRY-COUNT-ERROR
      * - retryErrorAbendCode300         COBOL Name: 300-RETRY-ERROR-ABEND-CODE
      *
      * Output :  

      * - lnRespDebugInd800              COBOL Name: 800-LN-RESP-DEBUG-IND
      * - lnMqDebugSw1000                COBOL Name: 1000-LN-MQ-DEBUG-SW
      * - facreqJobgrpName800            COBOL Name: 800-FACREQ-JOBGRP-NAME
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - jobNameError600                COBOL Name: 600-JOB-NAME-ERROR
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName1400300                COBOL Name: 300-PARA-NAME-1400
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - jobnameErrorAbendCode300       COBOL Name: 300-JOBNAME-ERROR-ABEND-CODE
      * - jobNumError601                 COBOL Name: 601-JOB-NUM-ERROR
      * - jobnumErrorAbendCode300        COBOL Name: 300-JOBNUM-ERROR-ABEND-CODE
      * - ip30881911RetryValue           COBOL Name: IP30881-911-RETRY-VALUE
      * - lnParm911Retry1000             COBOL Name: 1000-LN-PARM-911-RETRY
      * - retryCountError602             COBOL Name: 602-RETRY-COUNT-ERROR
      * - retryErrorAbendCode300         COBOL Name: 300-RETRY-ERROR-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public GetMqRespJobNameOutCtx getMqRespJobName(GetMqRespJobNameInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para retrieves queue response job name. if job name is
// *not provided in jcl, it displays appropriate abend message,
// *populates event error log and calls abend routine.
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
GetMqRespJobNameOutCtx methodOut = methodIn.getGetMqRespJobNameOutCtx();
//  MOVE 1000-LN-MQ-DEBUG-SW TO 800-LN-RESP-DEBUG-IND
          methodOut.setLnRespDebugInd800(methodOut.getLnMqDebugSw1000());
//  STRING 1000-LN-FACREQ-JOBGRP-NAME DELIMITED BY SPACE 1000-LN-FACREQ-JOBGRP-NUM DELIMITED BY SPACE INTO 800-FACREQ-JOBGRP-NAME
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( methodIn.getLnFacreqJobgrpName1000() , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( String.valueOf(methodIn.getLnFacreqJobgrpNum1000String()).toCharArray() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getFacreqJobgrpName800() ,joinCharArray);
          methodOut.setFacreqJobgrpName800(  (char[])updated.get("string"));
//  IF 1000-LN-FACREQ-JOBGRP-NAME = 300-VALUE-FACREQ
//  ELSE
          if (		compareChars(methodIn.getLnFacreqJobgrpName1000(),methodIn.getValueFacreq300()) != 0 ) { 
//  MOVE 600-JOB-NAME-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(100,methodOut.getJobNameError600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-1400 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName1400300());
//  MOVE 300-JOBNAME-ERROR-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getJobnameErrorAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
//  IF 1000-LN-FACREQ-JOBGRP-NUM IS NUMERIC AND 1000-LN-FACREQ-JOBGRP-NUM > ZEROS
//  ELSE
          if (         !(methodIn.getParms1000().lnFacreqJobgrpNum1000IsNumeric() )  || 	( methodIn.getLnFacreqJobgrpNum1000() <= 0 )) { 
//  MOVE 601-JOB-NUM-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(100,methodOut.getJobNumError601(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-1400 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName1400300());
//  MOVE 300-JOBNUM-ERROR-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getJobnumErrorAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
//  IF 1000-LN-PARM-911-RETRY IS NUMERIC AND 1000-LN-PARM-911-RETRY > ZEROS
          if (        methodIn.getParms1000().lnParm911Retry1000IsNumeric()  && 	( methodOut.getLnParm911Retry1000() > 0 )) { 
//  MOVE 1000-LN-PARM-911-RETRY TO IP30881-911-RETRY-VALUE
              methodOut.setIp30881911RetryValue(methodOut.getLnParm911Retry1000());
          }
//  ELSE
          else { 
//  MOVE 602-RETRY-COUNT-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(100,methodOut.getRetryCountError602(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-1400 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName1400300());
//  MOVE 300-RETRY-ERROR-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getRetryErrorAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * processSys09eCtrlCard 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-PROCESS-SYS09E-CTRL-CARD COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ProcessSys09eCtrlCardOutCtx processSys09eCtrlCard(ProcessSys09eCtrlCardInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph calls ip890110 module to get environment ind    *
// * 1. to open the sys09e control card.                            *
// * 2. to read the sys09e control card.                            *
// * 3. to close the sys09e control card.                           *
// * passed to mq programs while calling                            *
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
ProcessSys09eCtrlCardOutCtx methodOut = methodIn.getProcessSys09eCtrlCardOutCtx();
//  CALL 800-PTR-IP890110
          // CALL 800-PTR-IP890110
          	programCtx.setRc( ip890110.process(programCtx.getGlobalCtx().getContext("IP890110")));
      
      return methodOut;
      }
      /**
      * processRuncntlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1600-PROCESS-RUNCNTL-FILE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip08101RunIndicator            COBOL Name: IP08101-RUN-INDICATOR
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      * - ip08101RunIndicator            COBOL Name: IP08101-RUN-INDICATOR
      * - ip50005ClearingDt              COBOL Name: IP50005-CLEARING-DT
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip50005ClearingTm              COBOL Name: IP50005-CLEARING-TM
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      * - ip50005ClearingDtTm            COBOL Name: IP50005-CLEARING-DT-TM
      *
      * @throws CFException
      */
      @Override
      public ProcessRuncntlFileOutCtx processRuncntlFile(ProcessRuncntlFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls ip081110 module to get run indicator      *
// * 1. to open the run control file.                               *
// * 2. to read the run control file.                               *
// * 3. to close the run control file.                              *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
ProcessRuncntlFileOutCtx methodOut = methodIn.getProcessRuncntlFileOutCtx();
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	programCtx.setRc( ip081110.process(programCtx.getGlobalCtx().getContext("IP081110")));
//  IF RETURN-CODE EQUAL ZEROES
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE IP08101-RUN-INDICATOR TO IP60001-EVENT-LOG-CONTROL
              methodOut.setIp60001EventLogControl(methodOut.getIp08101RunIndicator());
//  IF IP08101-PROCESS-DATE NUMERIC
              if (        methodIn.getIp08101RunControlRecord().ip08101ProcessDateIsNumeric() ) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT
                  methodOut.setIp50005ClearingDt(String.valueOf(methodOut.getIp08101ProcessDateString()).toCharArray());
//  IF IP08101-RPT-PROCESS-TIME (1 : 2) NUMERIC
                  if (    isNumeric(substring(methodOut.getIp08101RptProcessTime(),0,2))) { 
//  MOVE IP08101-RPT-PROCESS-TIME (1 : 2) TO IP50005-CLEARING-TM
                      methodOut.getIp50005ClearingDtTm().replace(methodIn.getIp08101RunControlRecord()/*parent*/,44/*fromOffset - (ip50005ClearingTm) */,2/*fromLen*/,8/*toOffset - (ip08101RptProcessTime) */,2/*toLen*/);
                  }
//  ELSE
                  else { 
                      // MOVE 14 TO IP50005-CLEARING-TM
                      //  LITERAL_14 = 14
                      methodOut.setIp50005ClearingTm(CONSTANTS.LITERAL_14);
                  }
              }
//  ELSE
              else { 
//  MOVE FUNCTION CURRENT-DATE (1 : 10) TO IP50005-CLEARING-DT-TM
                  methodOut.getIp50005ClearingDtTm().setString( substring(CFUtil.getCurrentDate(timeZoneId),0,10));
              }
          }
      
      return methodOut;
      }
      /**
      * getTbl201Info 
      *   This method is derived from 
  *   COBOL Paragraph - 1650-GET-TBL201-INFO COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      *
      * Output :  

      * - ip28221Restart                 COBOL Name: IP28221-RESTART
      * - rc                             COBOL Name: RETURN-CODE
      * - ip70511HostPrcssAgrmtId        COBOL Name: IP70511-HOST-PRCSS-AGRMT-ID
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      *
      * @throws CFException
      */
      @Override
      public GetTbl201InfoOutCtx getTbl201Info(GetTbl201InfoInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para gets the table 201 information
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
GetTbl201InfoOutCtx methodOut = methodIn.getGetTbl201InfoOutCtx();
//  SET 88-IP28221-IP282210-NO-RESTRT TO TRUE
          methodOut.setIp28221Ip282210NoRestrt88True(); 
          
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               programCtx.setRc( ip282210.call(programCtx.getGlobalCtx().getContext("IP282210"),methodOut.getIp28221PaTableRestart()));
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP70511-HOST-PRCSS-AGRMT-ID
          methodOut.setIp70511HostPrcssAgrmtId(methodOut.getIp02015HostPrcssAgrmtId());
      
      return methodOut;
      }
      /**
      * startLrm 
      *   This method is derived from 
  *   COBOL Paragraph - 1700-START-LRM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - lnParm911Retry1000             COBOL Name: 1000-LN-PARM-911-RETRY
      * - lnFacreqJobgrpName1000         COBOL Name: 1000-LN-FACREQ-JOBGRP-NAME
      * - lnFacreqJobgrpNum1000          COBOL Name: 1000-LN-FACREQ-JOBGRP-NUM
      *
      * Output :  

      * - ip64801LrmRequest              COBOL Name: IP64801-LRM-REQUEST
      * - ip30881911RetryValue           COBOL Name: IP30881-911-RETRY-VALUE
      * - lnParm911Retry1000             COBOL Name: 1000-LN-PARM-911-RETRY
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - lnFacreqJobgrpName1000         COBOL Name: 1000-LN-FACREQ-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - lnFacreqJobgrpNum1000          COBOL Name: 1000-LN-FACREQ-JOBGRP-NUM
      *
      * @throws CFException
      */
      @Override
      public StartLrmOutCtx startLrm(StartLrmInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para starts the lrm module.
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
StartLrmOutCtx methodOut = methodIn.getStartLrmOutCtx();
//  SET IP64801-88-LRM-STRT-REQ TO TRUE
          methodOut.setIp6480188LrmStrtReqTrue(); 
          
//  MOVE 1000-LN-PARM-911-RETRY TO IP30881-911-RETRY-VALUE
          methodOut.setIp30881911RetryValue(methodOut.getLnParm911Retry1000());
//  MOVE 1000-LN-FACREQ-JOBGRP-NAME TO IP64801-LRM-JOBGRP-NAME
          methodOut.setIp64801LrmJobgrpName(methodOut.getLnFacreqJobgrpName1000());
//  MOVE 1000-LN-FACREQ-JOBGRP-NUM TO IP64801-LRM-JOBGRP-NUM
          methodOut.setIp64801LrmJobgrpNum(methodOut.getLnFacreqJobgrpNum1000());
//  PERFORM 8500-CALL-LRM-IP648010
          callLrmIp648010(programCtx.getCallLrmIp648010InCtx());/*8500-CALL-LRM-IP648010*/
          ;
      
      return methodOut;
      }
      /**
      * connectMq 
      *   This method is derived from 
  *   COBOL Paragraph - 1800-CONNECT-MQ COBOL Cyclomatic complexity - 2
      * Input  :  

      * - lnFacreqJobgrpName1000         COBOL Name: 1000-LN-FACREQ-JOBGRP-NAME
      * - lnFacreqJobgrpNum1000          COBOL Name: 1000-LN-FACREQ-JOBGRP-NUM
      * - lnCloneOwnerId1000             COBOL Name: 1000-LN-CLONE-OWNER-ID
      * - ip89011Environment             COBOL Name: IP89011-ENVIRONMENT
      * - ip02015HostGeoScopeCode        COBOL Name: IP02015-HOST-GEO-SCOPE-CODE
      * - ip7052f4TargetQmgrName         COBOL Name: IP7052F4-TARGET-QMGR-NAME
      * - ip7052f4TargetQName            COBOL Name: IP7052F4-TARGET-Q-NAME
      * - ip7052f4Hconn                  COBOL Name: IP7052F4-HCONN
      * - ip7052f4Hobj                   COBOL Name: IP7052F4-HOBJ
      * - ip7052f4QmgrName               COBOL Name: IP7052F4-QMGR-NAME
      * - ip7052f4QName                  COBOL Name: IP7052F4-Q-NAME
      *
      * Output :  

      * - queueVars800                   COBOL Name: 800-QUEUE-VARS
      * - lnFacreqJobgrpName800          COBOL Name: 800-LN-FACREQ-JOBGRP-NAME
      * - ip57901JobGroup                COBOL Name: IP57901-JOB-GROUP
      * - lnFacreqJobgrpName1000         COBOL Name: 1000-LN-FACREQ-JOBGRP-NAME
      * - lnFacreqJobgrpNum800           COBOL Name: 800-LN-FACREQ-JOBGRP-NUM
      * - ip57901JobGrpNum               COBOL Name: IP57901-JOB-GRP-NUM
      * - lnFacreqJobgrpNum1000          COBOL Name: 1000-LN-FACREQ-JOBGRP-NUM
      * - lnCloneOwnerId800              COBOL Name: 800-LN-CLONE-OWNER-ID
      * - ip70511CloneOwnerId            COBOL Name: IP70511-CLONE-OWNER-ID
      * - lnCloneOwnerId1000             COBOL Name: 1000-LN-CLONE-OWNER-ID
      * - ip70511EnvCd                   COBOL Name: IP70511-ENV-CD
      * - ip89011Environment             COBOL Name: IP89011-ENVIRONMENT
      * - ip34051ProcessSwitch           COBOL Name: IP34051-PROCESS-SWITCH
      * - ip34051CallFromIp545110        COBOL Name: IP34051-CALL-FROM-IP545110
      * - ip34051TipacliSwitch           COBOL Name: IP34051-TIPACLI-SWITCH
      * - ip34051TipasvcSwitch           COBOL Name: IP34051-TIPASVC-SWITCH
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip34051FuncCd                  COBOL Name: IP34051-FUNC-CD
      * - ip34051QueueType               COBOL Name: IP34051-QUEUE-TYPE
      * - rc                             COBOL Name: RETURN-CODE
      * - resQmgrName800                 COBOL Name: 800-RES-QMGR-NAME
      * - ip7052f4TargetQmgrName         COBOL Name: IP7052F4-TARGET-QMGR-NAME
      * - resQName800                    COBOL Name: 800-RES-Q-NAME
      * - ip7052f4TargetQName            COBOL Name: IP7052F4-TARGET-Q-NAME
      * - resHconn800                    COBOL Name: 800-RES-HCONN
      * - ip7052f4Hconn                  COBOL Name: IP7052F4-HCONN
      * - resHobj800                     COBOL Name: 800-RES-HOBJ
      * - ip7052f4Hobj                   COBOL Name: IP7052F4-HOBJ
      * - reqQmgrName800                 COBOL Name: 800-REQ-QMGR-NAME
      * - ip7052f4QmgrName               COBOL Name: IP7052F4-QMGR-NAME
      * - reqQName800                    COBOL Name: 800-REQ-Q-NAME
      * - ip7052f4QName                  COBOL Name: IP7052F4-Q-NAME
      * - reqHconn800                    COBOL Name: 800-REQ-HCONN
      * - reqHobj800                     COBOL Name: 800-REQ-HOBJ
      *
      * @throws CFException
      */
      @Override
      public ConnectMqOutCtx connectMq(ConnectMqInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This para calls ip703020 to connect/open queues                 *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
ConnectMqOutCtx methodOut = methodIn.getConnectMqOutCtx();
//  INITIALIZE 800-QUEUE-VARS
          methodOut.getQueueVars800().initialize();
//  MOVE 1000-LN-FACREQ-JOBGRP-NAME TO 800-LN-FACREQ-JOBGRP-NAME IP57901-JOB-GROUP
          methodOut.setLnFacreqJobgrpName800(methodOut.getLnFacreqJobgrpName1000());
          methodOut.setIp57901JobGroup(methodOut.getLnFacreqJobgrpName1000());
//  MOVE 1000-LN-FACREQ-JOBGRP-NUM TO 800-LN-FACREQ-JOBGRP-NUM IP57901-JOB-GRP-NUM
          methodOut.setLnFacreqJobgrpNum800(String.valueOf(methodOut.getLnFacreqJobgrpNum1000String()).toCharArray());
          methodOut.setIp57901JobGrpNum( methodOut.getLnFacreqJobgrpNum1000());
//  MOVE 1000-LN-CLONE-OWNER-ID TO 800-LN-CLONE-OWNER-ID IP70511-CLONE-OWNER-ID
          methodOut.setLnCloneOwnerId800(methodOut.getLnCloneOwnerId1000());
          methodOut.setIp70511CloneOwnerId(methodOut.getLnCloneOwnerId1000());
//  MOVE IP89011-ENVIRONMENT TO IP70511-ENV-CD
          methodOut.setIp70511EnvCd(methodOut.getIp89011Environment());

// * Populating common parameters for mq connect and open
//  SET 88-IP34051-REQUEST-START TO TRUE
          methodOut.setIp34051RequestStart88True(); 
          
//  SET 88-IP34051-IP545110-N TO TRUE
          methodOut.setIp34051Ip545110N88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-Y TO TRUE
          methodOut.setIp34051TipacliActiveY88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-Y TO TRUE
          methodOut.setIp34051TipasvcActiveY88True(); 
          

// * For fraudulent request queue:
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
          methodOut.setIp34051ServCdFra88True(); 
          
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
          methodOut.setIp34051FuncCdCha88True(); 
          
//  IF 88-IP02015-HOST-PA-GLOBAL
          if ( methodIn.isIp02015HostPaGlobal88()  ) { 
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              methodOut.setIp34051RespnseQ88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
//  MOVE IP7052F4-TARGET-QMGR-NAME TO 800-RES-QMGR-NAME
              methodOut.setResQmgrName800(methodOut.getIp7052f4TargetQmgrName());
//  MOVE IP7052F4-TARGET-Q-NAME TO 800-RES-Q-NAME
              methodOut.setResQName800(methodOut.getIp7052f4TargetQName());
//  MOVE IP7052F4-HCONN TO 800-RES-HCONN
              methodOut.setResHconn800(methodOut.getIp7052f4Hconn());
//  MOVE IP7052F4-HOBJ TO 800-RES-HOBJ
              methodOut.setResHobj800(methodOut.getIp7052f4Hobj());
          }
//  ELSE
          else { 
//  SET 88-IP34051-REQUEST-Q TO TRUE
              methodOut.setIp34051RequestQ88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
//  MOVE IP7052F4-QMGR-NAME TO 800-REQ-QMGR-NAME
              methodOut.setReqQmgrName800(methodOut.getIp7052f4QmgrName());
//  MOVE IP7052F4-Q-NAME TO 800-REQ-Q-NAME
              methodOut.setReqQName800(methodOut.getIp7052f4QName());
//  MOVE IP7052F4-HCONN TO 800-REQ-HCONN
              methodOut.setReqHconn800(methodOut.getIp7052f4Hconn());
//  MOVE IP7052F4-HOBJ TO 800-REQ-HOBJ
              methodOut.setReqHobj800(methodOut.getIp7052f4Hobj());
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              methodOut.setIp34051RespnseQ88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
//  MOVE IP7052F4-TARGET-QMGR-NAME TO 800-RES-QMGR-NAME
              methodOut.setResQmgrName800(methodOut.getIp7052f4TargetQmgrName());
//  MOVE IP7052F4-TARGET-Q-NAME TO 800-RES-Q-NAME
              methodOut.setResQName800(methodOut.getIp7052f4TargetQName());
//  MOVE IP7052F4-HCONN TO 800-RES-HCONN
              methodOut.setResHconn800(methodOut.getIp7052f4Hconn());
//  MOVE IP7052F4-HOBJ TO 800-RES-HOBJ
              methodOut.setResHobj800(methodOut.getIp7052f4Hobj());
          }
      
      return methodOut;
      }
      /**
      * openErrFileSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 1900-OPEN-ERR-FILE-SYS201 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys201300                      COBOL Name: 300-SYS201
      * - abendCode3003010               COBOL Name: 300-3010-ABEND-CODE
      * - errorMsg6003010                COBOL Name: 600-3010-ERROR-MSG
      * - paraName1900300                COBOL Name: 300-PARA-NAME-1900
      *
      * Output :  

      * - sys201Status800                COBOL Name: 800-SYS201-STATUS
      * - fileDd6003010                  COBOL Name: 600-3010-FILE-DD
      * - sys201300                      COBOL Name: 300-SYS201
      * - fileStat6003010                COBOL Name: 600-3010-FILE-STAT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003010               COBOL Name: 300-3010-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003010                COBOL Name: 600-3010-ERROR-MSG
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName1900300                COBOL Name: 300-PARA-NAME-1900
      *
      * @throws CFException
      */
      @Override
      public OpenErrFileSys201OutCtx openErrFileSys201(OpenErrFileSys201InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens the output mq error sys201 file
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
OpenErrFileSys201OutCtx methodOut = methodIn.getOpenErrFileSys201OutCtx();
//  OPEN OUTPUT SYS201-FNS-MQ-ERR-FILE
          sys201FnsMqErrFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201FnsMqErrFile.getFileName(),sys201FnsMqErrFile.getSys201FnsMqErrFileCharSet(),sys201FnsMqErrFile.getSys201FnsMqErrFileCrlfFlag());
          methodOut.setSys201Status800(sys201FnsMqErrFile.getStatusString() );
//  IF NOT 800-88-SYS201-IO-GOOD
          if (!(methodOut.isSys201IoGood80088()) ) { 
//  MOVE 300-SYS201 TO 600-3010-FILE-DD
              methodOut.setFileDd6003010(pad(8,methodOut.getSys201300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-SYS201-STATUS TO 600-3010-FILE-STAT
              methodOut.setFileStat6003010(methodOut.getSys201Status800());
//  MOVE 300-3010-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getAbendCode3003010());
              // MOVE 600-3010-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003010().toCharArray());
//  MOVE 300-PARA-NAME-1900 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName1900300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * getQueueMessages 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-GET-QUEUE-MESSAGES COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - ip70301IsFraudMqSrvActive      COBOL Name: IP70301-IS-FRAUD-MQ-SRV-ACTIVE
      * - ip7051f4MqBypassSw             COBOL Name: IP7051F4-MQ-BYPASS-SW
      *
      * Output :  

      * - ip70511MqBypassSw              COBOL Name: IP70511-MQ-BYPASS-SW
      * - ip7051f4MqBypassSw             COBOL Name: IP7051F4-MQ-BYPASS-SW
      *
      * @throws CFException
      */
      @Override
      public GetQueueMessagesOutCtx getQueueMessages(GetQueueMessagesInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph calls the routine to
// *1.get mq response code from tipaccd table
// *3.call lrm module
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
GetQueueMessagesOutCtx methodOut = methodIn.getGetQueueMessagesOutCtx();
//  PERFORM 8500-CALL-LRM-IP648010
          callLrmIp648010(programCtx.getCallLrmIp648010InCtx());/*8500-CALL-LRM-IP648010*/
//  IF IP64801-88-LRM-STAT-AOK
          if ( methodIn.isIp6480188LrmStatAok()  ) { 
//  IF 88-IP70301-FRAUD-MQ-ACTIVE-Y
              if ( methodIn.isIp70301FraudMqActiveY88()  ) { 
//  MOVE IP7051F4-MQ-BYPASS-SW TO IP70511-MQ-BYPASS-SW
                  methodOut.setIp70511MqBypassSw(methodOut.getIp7051f4MqBypassSw());
//  IF IP70511-MQ-BYPASS-N
                  if ( methodOut.isIp70511MqBypassN()  ) { 
//  PERFORM 2200-PROCESS-FNS-TXNS
                      processFnsTxns(programCtx.getProcessFnsTxnsInCtx());/*2200-PROCESS-FNS-TXNS*/
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * processFnsTxns 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-FNS-TXNS COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - ip70521CompCd                  COBOL Name: IP70521-COMP-CD
      * - mqFailCodeOne300               COBOL Name: 300-MQ-FAIL-CODE-ONE
      * - ip70521MqReturnSw              COBOL Name: IP70521-MQ-RETURN-SW
      * - ip02015HostGeoScopeCode        COBOL Name: IP02015-HOST-GEO-SCOPE-CODE
      * - skipFlag800                    COBOL Name: 800-SKIP-FLAG
      * - tipamrsSkipCount800            COBOL Name: 800-TIPAMRS-SKIP-COUNT
      * - mqputSkipCount800              COBOL Name: 800-MQPUT-SKIP-COUNT
      *
      * Output :  

      * - mqRespStatusSw100              COBOL Name: 100-MQ-RESP-STATUS-SW
      * - checkGetQueue100               COBOL Name: 100-CHECK-GET-QUEUE
      * - getBrowseCalls100              COBOL Name: 100-GET-BROWSE-CALLS
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - end800                         COBOL Name: 800-END
      * - tipamrsSkipCount800            COBOL Name: 800-TIPAMRS-SKIP-COUNT
      * - mqputSkipCount800              COBOL Name: 800-MQPUT-SKIP-COUNT
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ProcessFnsTxnsOutCtx processFnsTxns(ProcessFnsTxnsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This para used to get the messages from queue based on process  *
// *priority number from qpr when fraud mq is active.               *
// *                                                                *
// *if service code is equal to 0007 and function code is equal to  *
// *0002(for fraud) then do following operation;                    *
// *                                                                *
// *  1. call ip708020 to get mesages from mq.                      *
// *  2. get fac count                                              *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
ProcessFnsTxnsOutCtx methodOut = methodIn.getProcessFnsTxnsOutCtx();
//  SET 88-100-MQ-RESP-Y TO TRUE
          methodOut.setMqRespY88100True(); 
          
//  SET 88-100-GET-FAA-FAC TO TRUE
          methodOut.setGetFaaFac88100True(); 
          
//  SET 88-100-START-BROWSE TO TRUE
          methodOut.setStartBrowse88100True(); 
          
//  SET 88-IP70521-GET TO TRUE
          methodOut.setIp70521Get88True(); 
          
//  MOVE LENGTH OF FNS-PAYLOAD TO 800-END
          methodOut.setEnd800(FnsPayload.getFnsPayloadFieldLength());
//  PERFORM UNTIL 88-100-MQ-RESP-N
          while ((!(methodOut.isMqRespN88100()) )) {
//  PERFORM 2400-SETUP-Q-PARMS-FRAUD
              setupQParmsFraud(programCtx.getSetupQParmsFraudInCtx());/*2400-SETUP-Q-PARMS-FRAUD*/
//  PERFORM 2410-CALL-MQGETAPI-FOR-READ
              callMqgetapiForRead(programCtx.getCallMqgetapiForReadInCtx());/*2410-CALL-MQGETAPI-FOR-READ*/
//  IF 88-IP70521-NO-MSG-AVAILABLE OR ( IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE-ONE AND 88-IP70521-MQ-RETURN-N )
//  IF 88-IP02015-HOST-PA-GLOBAL
              if ( methodIn.isIp02015HostPaGlobal88()  ) { 
//  PERFORM 2500-VALIDATE-QUEUE-DATA
                  validateQueueData(programCtx.getValidateQueueDataInCtx());/*2500-VALIDATE-QUEUE-DATA*/
//  IF 88-800-SKIP-FLAG-N
                  if ( methodIn.isSkipFlagN88800()  ) { 
//  PERFORM 2425-PREP-TIPAMRS-INSERT
                      prepTipamrsInsert(programCtx.getPrepTipamrsInsertInCtx());/*2425-PREP-TIPAMRS-INSERT*/
//  PERFORM 2430-TIPAMRS-INSERT
                      tipamrsInsert(programCtx.getTipamrsInsertInCtx());/*2430-TIPAMRS-INSERT*/
                  }
//  ELSE
                  else { 
//  ADD +1 TO 800-TIPAMRS-SKIP-COUNT
                      methodOut.setTipamrsSkipCount800(methodOut.getTipamrsSkipCount800()+1);
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
                      writeErrFileSys201(programCtx.getWriteErrFileSys201InCtx());/*2800-WRITE-ERR-FILE-SYS201*/
                  }
              }
//  ELSE
              else { 
//  PERFORM 2500-VALIDATE-QUEUE-DATA
                  validateQueueData(programCtx.getValidateQueueDataInCtx());/*2500-VALIDATE-QUEUE-DATA*/
//  IF 88-800-SKIP-FLAG-N
                  if ( methodIn.isSkipFlagN88800()  ) { 
//  PERFORM 2550-INDIA-FRAUD-TABLE-LOOKUP
                      indiaFraudTableLookup(programCtx.getIndiaFraudTableLookupInCtx());/*2550-INDIA-FRAUD-TABLE-LOOKUP*/
//  PERFORM 2600-POPULATE-MQPUT-FIELDS
                      populateMqputFields(programCtx.getPopulateMqputFieldsInCtx());/*2600-POPULATE-MQPUT-FIELDS*/
//  PERFORM 2610-MQPUT-FRAUD-TRANS
                      mqputFraudTrans(programCtx.getMqputFraudTransInCtx());/*2610-MQPUT-FRAUD-TRANS*/
//  PERFORM 2700-SET-MQ-GET
                      setMqGet(programCtx);/*2700-SET-MQ-GET*/
                  }
//  ELSE
                  else { 
//  ADD +1 TO 800-MQPUT-SKIP-COUNT
                      methodOut.setMqputSkipCount800(methodOut.getMqputSkipCount800()+1);
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
                      writeErrFileSys201(programCtx.getWriteErrFileSys201InCtx());/*2800-WRITE-ERR-FILE-SYS201*/
                  }
              }
          }
//  IF 88-IP02015-HOST-PA-GLOBAL
          if ( methodIn.isIp02015HostPaGlobal88()  ) { 
//  CALL 800-PTR-IP599810
              // CALL 800-PTR-IP599810
              	programCtx.setRc( ip599810.process(programCtx.getGlobalCtx().getContext("IP599810")));
          }
      
      return methodOut;
      }
      /**
      * setupQParmsFraud 
      *   This method is derived from 
  *   COBOL Paragraph - 2400-SETUP-Q-PARMS-FRAUD COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip70511MqBypassSw              COBOL Name: IP70511-MQ-BYPASS-SW
      * - resHconn800                    COBOL Name: 800-RES-HCONN
      * - resHobj800                     COBOL Name: 800-RES-HOBJ
      * - resQmgrName800                 COBOL Name: 800-RES-QMGR-NAME
      * - resQName800                    COBOL Name: 800-RES-Q-NAME
      *
      * Output :  

      * - ip70521MqBypassSw              COBOL Name: IP70521-MQ-BYPASS-SW
      * - ip70511MqBypassSw              COBOL Name: IP70511-MQ-BYPASS-SW
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - ip70521Hconn                   COBOL Name: IP70521-HCONN
      * - resHconn800                    COBOL Name: 800-RES-HCONN
      * - ip70521Hobj                    COBOL Name: IP70521-HOBJ
      * - resHobj800                     COBOL Name: 800-RES-HOBJ
      * - ip70521TargetQmgrName          COBOL Name: IP70521-TARGET-QMGR-NAME
      * - resQmgrName800                 COBOL Name: 800-RES-QMGR-NAME
      * - ip70521TargetQName             COBOL Name: IP70521-TARGET-Q-NAME
      * - resQName800                    COBOL Name: 800-RES-Q-NAME
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      *
      * @throws CFException
      */
      @Override
      public SetupQParmsFraudOutCtx setupQParmsFraud(SetupQParmsFraudInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para sets up ip70521 parameters before calling get api
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
SetupQParmsFraudOutCtx methodOut = methodIn.getSetupQParmsFraudOutCtx();
//  MOVE IP70511-MQ-BYPASS-SW TO IP70521-MQ-BYPASS-SW
          methodOut.setIp70521MqBypassSw(methodOut.getIp70511MqBypassSw());
//  MOVE LENGTH OF FNS-PLD-RD TO IP70521-MSG-BUFFER-LEN
          methodOut.setIp70521MsgBufferLen(FnsPldRd.getFnsPldRdFieldLength());
//  MOVE 800-RES-HCONN TO IP70521-HCONN
          methodOut.setIp70521Hconn(methodOut.getResHconn800());
//  MOVE 800-RES-HOBJ TO IP70521-HOBJ
          methodOut.setIp70521Hobj(methodOut.getResHobj800());
//  MOVE 800-RES-QMGR-NAME TO IP70521-TARGET-QMGR-NAME
          methodOut.setIp70521TargetQmgrName(methodOut.getResQmgrName800());
//  MOVE 800-RES-Q-NAME TO IP70521-TARGET-Q-NAME
          methodOut.setIp70521TargetQName(methodOut.getResQName800());
//  MOVE SPACES TO IP70521-MSG-BUFFER
          methodOut.setIp70521MsgBuffer(CONSTANTS.SPACE_4000000);
      
      return methodOut;
      }
      /**
      * callMqgetapiForRead 
      *   This method is derived from 
  *   COBOL Paragraph - 2410-CALL-MQGETAPI-FOR-READ COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - lnRespDebugInd800              COBOL Name: 800-LN-RESP-DEBUG-IND
      * - ip08101RunIndicator            COBOL Name: IP08101-RUN-INDICATOR
      * - valueTest300                   COBOL Name: 300-VALUE-TEST
      * - mqgetFailCount800              COBOL Name: 800-MQGET-FAIL-COUNT
      * - mqgetFailMsg300                COBOL Name: 300-MQGET-FAIL-MSG
      * - ip70521CompCd                  COBOL Name: IP70521-COMP-CD
      * - mqFailCode300                  COBOL Name: 300-MQ-FAIL-CODE
      * - paraName2410300                COBOL Name: 300-PARA-NAME-2410
      * - getQAbendCode300               COBOL Name: 300-GET-Q-ABEND-CODE
      * - queueErrorMsg611               COBOL Name: 611-QUEUE-ERROR-MSG
      *
      * Output :  

      * - ip70521MqReturnSw              COBOL Name: IP70521-MQ-RETURN-SW
      * - checkGetQueue100               COBOL Name: 100-CHECK-GET-QUEUE
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - fnsPldRd                       COBOL Name: FNS-PLD-RD
      * - rc                             COBOL Name: RETURN-CODE
      * - mqRespStatusSw100              COBOL Name: 100-MQ-RESP-STATUS-SW
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - mqgetFailCount800              COBOL Name: 800-MQGET-FAIL-COUNT
      * - ip82921ErrMsg                  COBOL Name: IP82921-ERR-MSG
      * - mqgetFailMsg300                COBOL Name: 300-MQGET-FAIL-MSG
      * - badReasonCode611               COBOL Name: 611-BAD-REASON-CODE
      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - action611                      COBOL Name: 611-ACTION
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName2410300                COBOL Name: 300-PARA-NAME-2410
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - getQAbendCode300               COBOL Name: 300-GET-Q-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - queueErrorMsg611               COBOL Name: 611-QUEUE-ERROR-MSG
      *
      * @throws CFException
      */
      @Override
      public CallMqgetapiForReadOutCtx callMqgetapiForRead(CallMqgetapiForReadInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------
// *This paragraph calls the mq get api to read mq responses from
// *queue.
// *--------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
CallMqgetapiForReadOutCtx methodOut = methodIn.getCallMqgetapiForReadOutCtx();
//  SET 88-IP70521-MQ-RETURN-Y TO TRUE
          methodOut.setIp70521MqReturnY88True(); 
          
//  SET 88-100-GET-FAA-FAC TO TRUE
          methodOut.setGetFaaFac88100True(); 
          
//  SET 88-IP70521-GET TO TRUE
          methodOut.setIp70521Get88True(); 
          
//  INITIALIZE FNS-PLD-RD
          methodOut.getFnsPldRd().initialize();
//  CALL 800-PTR-IP708020
          // CALL 800-PTR-IP708020
          	programCtx.setRc( ip708020.process(programCtx.getGlobalCtx().getContext("IP708020")));
//  IF 88-IP70521-NO-MSG-AVAILABLE
          if ( methodIn.isIp70521NoMsgAvailable88()  ) { 
//  SET 88-100-MQ-RESP-N TO TRUE
              methodOut.setMqRespN88100True(); 
              
          }
//  ELSE
          else { 
//  IF 88-IP70521-MQ-RETURN-Y
              if ( methodOut.isIp70521MqReturnY88()  ) { 

// *    Extract the mq info into payload layout
//  MOVE IP70521-MSG-BUFFER ( 300-VALUE-1 : 800-END ) TO FNS-PLD-RD
                  methodOut.getFnsPldRd().replace(methodIn.getIp70521MqApiLayout()/*parent*/,252+methodIn.getValue1300() - 1/*fromOffset - (fnsPldRd) */,methodIn.getEnd800()/*fromLen*/,0/*toOffset - (ip70521MsgBuffer) */,222/*toLen*/);
//  IF 88-800-RESP-DEBUG-IND-Y AND IP08101-RUN-INDICATOR EQUAL 300-VALUE-TEST
                  if ( methodIn.isRespDebugIndY88800()   && 		compareChars(methodIn.getIp08101RunIndicator(),methodIn.getValueTest300()) == 0 ) { 
//  PERFORM 8100-DISPLAY-MQ-INFO
                      displayMqInfo(programCtx.getDisplayMqInfoInCtx());/*8100-DISPLAY-MQ-INFO*/
                  }
              }
//  ELSE
              else { 
//  ADD +1 TO 800-MQGET-FAIL-COUNT
                  methodOut.setMqgetFailCount800(methodOut.getMqgetFailCount800()+1);
//  MOVE 300-MQGET-FAIL-MSG TO IP82921-ERR-MSG
                  methodOut.setIp82921ErrMsg(methodOut.getMqgetFailMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
                  writeErrFileSys201(programCtx.getWriteErrFileSys201InCtx());/*2800-WRITE-ERR-FILE-SYS201*/
//  IF IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE
                  if (	( methodIn.getIp70521CompCd() == methodIn.getMqFailCode300() )) { 
//  MOVE IP70521-RESN-CD TO 611-BAD-REASON-CODE
                      methodOut.setBadReasonCode611( methodOut.getIp70521ResnCd());
//  SET 88-611-ERR-GET TO TRUE
                      methodOut.setErrGet88611True(); 
                      
//  MOVE 300-PARA-NAME-2410 TO 900-ABEND-PARA-NAME
                      methodOut.setAbendParaName900(methodOut.getParaName2410300());
//  MOVE 300-GET-Q-ABEND-CODE TO 900-ABEND-CODE
                      methodOut.setAbendCode900(methodOut.getGetQAbendCode300());
                      // MOVE 611-QUEUE-ERROR-MSG TO 900-ABEND-TEXT
                      methodOut.setAbendText900(methodOut.getQueueErrorMsg611().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                      terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * prepTipamrsInsert 
      *   This method is derived from 
  *   COBOL Paragraph - 2425-PREP-TIPAMRS-INSERT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fnsPldRdGftDsn                 COBOL Name: FNS-PLD-RD-GFT-DSN
      * - fnsPldRdLogicalSeq             COBOL Name: FNS-PLD-RD-LOGICAL-SEQ
      * - fnsPldRdTxnNum                 COBOL Name: FNS-PLD-RD-TXN-NUM
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip70521MqTimestamp             COBOL Name: IP70521-MQ-TIMESTAMP
      * - valueC300                      COBOL Name: 300-VALUE-C
      * - mqRespCd800                    COBOL Name: 800-MQ-RESP-CD
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      *
      * Output :  

      * - ip70711TipamrsEntries          COBOL Name: IP70711-TIPAMRS-ENTRIES
      * - ip70711GftDasetNam             COBOL Name: IP70711-GFT-DASET-NAM
      * - fnsPldRdGftDsn                 COBOL Name: FNS-PLD-RD-GFT-DSN
      * - ip70711FileSeqNum              COBOL Name: IP70711-FILE-SEQ-NUM
      * - fnsPldRdLogicalSeq             COBOL Name: FNS-PLD-RD-LOGICAL-SEQ
      * - ip70711TxnNum                  COBOL Name: IP70711-TXN-NUM
      * - fnsPldRdTxnNum                 COBOL Name: FNS-PLD-RD-TXN-NUM
      * - ip70711ServCd                  COBOL Name: IP70711-SERV-CD
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip70711StrtJobNum              COBOL Name: IP70711-STRT-JOB-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip70711StrtTs                  COBOL Name: IP70711-STRT-TS
      * - ip70521MqTimestamp             COBOL Name: IP70521-MQ-TIMESTAMP
      * - ip70711StatCd                  COBOL Name: IP70711-STAT-CD
      * - valueC300                      COBOL Name: 300-VALUE-C
      * - ip70711MqRespCd                COBOL Name: IP70711-MQ-RESP-CD
      * - mqRespCd800                    COBOL Name: 800-MQ-RESP-CD
      * - ip70711RespDataTxt             COBOL Name: IP70711-RESP-DATA-TXT
      * - ip70711JobGrpId                COBOL Name: IP70711-JOB-GRP-ID
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip70711JobGrpNum               COBOL Name: IP70711-JOB-GRP-NUM
      * - ip70711RespDataTxtLen          COBOL Name: IP70711-RESP-DATA-TXT-LEN
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      *
      * @throws CFException
      */
      @Override
      public PrepTipamrsInsertOutCtx prepTipamrsInsert(PrepTipamrsInsertInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------
// *This paragraph populates variables for tipamrs insert
// *--------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
PrepTipamrsInsertOutCtx methodOut = methodIn.getPrepTipamrsInsertOutCtx();
//  INITIALIZE IP70711-TIPAMRS-ENTRIES
          methodOut.getIp70711TipamrsEntries().initialize();
//  MOVE FNS-PLD-RD-GFT-DSN TO IP70711-GFT-DASET-NAM
          methodOut.setIp70711GftDasetNam(methodOut.getFnsPldRdGftDsn());
//  MOVE FNS-PLD-RD-LOGICAL-SEQ TO IP70711-FILE-SEQ-NUM
          methodOut.setIp70711FileSeqNum(methodOut.getFnsPldRdLogicalSeq());
//  MOVE FNS-PLD-RD-TXN-NUM TO IP70711-TXN-NUM
          methodOut.setIp70711TxnNum(methodOut.getFnsPldRdTxnNum());
//  MOVE IP34051-SERV-CD TO IP70711-SERV-CD
          methodOut.setIp70711ServCd(methodOut.getIp34051ServCd());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP70711-STRT-JOB-NUM
          methodOut.setIp70711StrtJobNum(String.valueOf(methodOut.getIp64801LrmJobgrpNumString()).toCharArray());
//  MOVE IP70521-MQ-TIMESTAMP TO IP70711-STRT-TS
          methodOut.setIp70711StrtTs(methodOut.getIp70521MqTimestamp());
//  MOVE 300-VALUE-C TO IP70711-STAT-CD
          methodOut.setIp70711StatCd(methodOut.getValueC300());
//  PERFORM 2426-GET-MQ-RESP-CD
          getMqRespCd(programCtx.getGetMqRespCdInCtx());/*2426-GET-MQ-RESP-CD*/
//  MOVE 800-MQ-RESP-CD TO IP70711-MQ-RESP-CD
          methodOut.setIp70711MqRespCd(methodOut.getMqRespCd800());
//  MOVE SPACES TO IP70711-RESP-DATA-TXT
          methodOut.setIp70711RespDataTxt(CONSTANTS.SPACE_2000);
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP70711-JOB-GRP-ID
          methodOut.setIp70711JobGrpId(methodOut.getIp64801LrmJobgrpName());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP70711-JOB-GRP-NUM
          methodOut.setIp70711JobGrpNum(methodOut.getIp64801LrmJobgrpNum());
//  MOVE IP70521-MSG-BUFFER-LEN TO IP70711-RESP-DATA-TXT-LEN
          methodOut.setIp70711RespDataTxtLen((short) methodOut.getIp70521MsgBufferLen());
//  MOVE IP70521-MSG-BUFFER ( 300-VALUE-1 : 800-END ) TO IP70711-RESP-DATA-TXT
          methodOut.getIp70711TipamrsEntries().replace(methodIn.getIp70521MqApiLayout()/*parent*/,252+methodIn.getValue1300() - 1/*fromOffset - (ip70711RespDataTxt) */,methodIn.getEnd800()/*fromLen*/,103/*toOffset - (ip70521MsgBuffer) */,2000/*toLen*/);
      
      return methodOut;
      }
      /**
      * getMqRespCd 
      *   This method is derived from 
  *   COBOL Paragraph - 2426-GET-MQ-RESP-CD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - prevClrCyclId800               COBOL Name: 800-PREV-CLR-CYCL-ID
      * - queryNoSeven300                COBOL Name: 300-QUERY-NO-SEVEN
      * - value99300                     COBOL Name: 300-VALUE-99
      * - value7300                      COBOL Name: 300-VALUE-7
      * - ip30781MqRespCd                COBOL Name: IP30781-MQ-RESP-CD
      * - paraName2426300                COBOL Name: 300-PARA-NAME-2426
      * - getMqRspCdAbendCode300         COBOL Name: 300-GET-MQ-RSP-CD-ABEND-CODE
      * - rowsNotFoundErrMsgTxt604       COBOL Name: 604-ROWS-NOT-FOUND-ERR-MSG-TXT
      *
      * Output :  

      * - clrCyclId800                   COBOL Name: 800-CLR-CYCL-ID
      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - prevClrCyclId800               COBOL Name: 800-PREV-CLR-CYCL-ID
      * - apiSwitch100                   COBOL Name: 100-API-SWITCH
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - queryNoSeven300                COBOL Name: 300-QUERY-NO-SEVEN
      * - ip30781ClrCyclId               COBOL Name: IP30781-CLR-CYCL-ID
      * - value7300                      COBOL Name: 300-VALUE-7
      * - rc                             COBOL Name: RETURN-CODE
      * - mqRespCd800                    COBOL Name: 800-MQ-RESP-CD
      * - ip30781MqRespCd                COBOL Name: IP30781-MQ-RESP-CD
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - paraName2426300                COBOL Name: 300-PARA-NAME-2426
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - getMqRspCdAbendCode300         COBOL Name: 300-GET-MQ-RSP-CD-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - rowsNotFoundErrMsgTxt604       COBOL Name: 604-ROWS-NOT-FOUND-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public GetMqRespCdOutCtx getMqRespCd(GetMqRespCdInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph moves query number to the corresponding field in *
// *the external copybook ip304101 and sets the select switch.      *
// *it calls db2 api ip595210, to get the mq response code from     *
// *tipaccd table                                                   *
// *----------------------------------------------------------------*

// *Ip703020 extracts the clr-cycl-id from tipacli
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
GetMqRespCdOutCtx methodOut = methodIn.getGetMqRespCdOutCtx();
//  MOVE IP30771-CLR-CYCL-ID TO 800-CLR-CYCL-ID
          methodOut.setClrCyclId800(methodOut.getIp30771ClrCyclId());
//  IF 800-CLR-CYCL-ID NOT EQUAL TO 800-PREV-CLR-CYCL-ID
          if (	( methodOut.getClrCyclId800() != methodOut.getPrevClrCyclId800() )) { 
//  MOVE 800-CLR-CYCL-ID TO 800-PREV-CLR-CYCL-ID
              methodOut.setPrevClrCyclId800(methodOut.getClrCyclId800());
          }
//  SET 88-100-OPEN-FIRST-TIME TO TRUE
          methodOut.setOpenFirstTime88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  MOVE 300-QUERY-NO-SEVEN TO QUERY-NO
          methodOut.setQueryNo(methodOut.getQueryNoSeven300());
//  MOVE 800-CLR-CYCL-ID TO IP30781-CLR-CYCL-ID
          methodOut.setIp30781ClrCyclId( methodOut.getClrCyclId800());
//  IF IP30781-CLR-CYCL-ID = 300-VALUE-99
          if (	( methodOut.getIp30781ClrCyclId() == methodIn.getValue99300() ) ) { 
//  MOVE 300-VALUE-7 TO IP30781-CLR-CYCL-ID
              methodOut.setIp30781ClrCyclId( methodOut.getValue7300());
          }
//  CALL 800-PTR-IP595210
          // CALL 800-PTR-IP595210
          	programCtx.setRc( ip595210.process(programCtx.getGlobalCtx().getContext("IP595210")));
//  IF 88-100-ROWS-FOUND
          if ( methodOut.isRowsFound88100()  ) { 
              // MOVE IP30781-MQ-RESP-CD TO 800-MQ-RESP-CD
              methodOut.setMqRespCd800(methodOut.getIp30781MqRespCd());
          }
//  ELSE
          else { 
//  MOVE 300-PARA-NAME-2426 TO 900-ABEND-PARA
              methodOut.getAbendPara900().setString(pad(42,methodOut.getParaName2426300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-GET-MQ-RSP-CD-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getGetMqRspCdAbendCode300());
//  MOVE 604-ROWS-NOT-FOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(100,methodOut.getRowsNotFoundErrMsgTxt604(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * tipamrsInsert 
      *   This method is derived from 
  *   COBOL Paragraph - 2430-TIPAMRS-INSERT COBOL Cyclomatic complexity - 4
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - tipamrsSkipCount800            COBOL Name: 800-TIPAMRS-SKIP-COUNT
      * - tipmrsDuplMsg300               COBOL Name: 300-TIPMRS-DUPL-MSG
      * - mrsIsrtCount800                COBOL Name: 800-MRS-ISRT-COUNT
      * - insertMrsAbendCode300          COBOL Name: 300-INSERT-MRS-ABEND-CODE
      * - tipamrsInsertFailure605        COBOL Name: 605-TIPAMRS-INSERT-FAILURE
      * - paraName24301300               COBOL Name: 300-PARA-NAME-2430-1
      * - tipmrsFailMsg300               COBOL Name: 300-TIPMRS-FAIL-MSG
      *
      * Output :  

      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - rc                             COBOL Name: RETURN-CODE
      * - tipamrsSkipCount800            COBOL Name: 800-TIPAMRS-SKIP-COUNT
      * - ip82921ErrMsg                  COBOL Name: IP82921-ERR-MSG
      * - tipmrsDuplMsg300               COBOL Name: 300-TIPMRS-DUPL-MSG
      * - mrsIsrtCount800                COBOL Name: 800-MRS-ISRT-COUNT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - insertMrsAbendCode300          COBOL Name: 300-INSERT-MRS-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - tipamrsInsertFailure605        COBOL Name: 605-TIPAMRS-INSERT-FAILURE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName24301300               COBOL Name: 300-PARA-NAME-2430-1
      * - tipmrsFailMsg300               COBOL Name: 300-TIPMRS-FAIL-MSG
      *
      * @throws CFException
      */
      @Override
      public TipamrsInsertOutCtx tipamrsInsert(TipamrsInsertInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para populates action code and query number for db2 api,  *
// * ip586010 for queue response table (tipamrs) to insert response *
// * record. if record to be inserted is duplicate, continue.       *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
TipamrsInsertOutCtx methodOut = methodIn.getTipamrsInsertOutCtx();
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          methodOut.setItIsNotAbend88100True(); 
          
//  SET 88-100-INSERT-RTN TO TRUE
          methodOut.setInsertRtn88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          methodOut.setQueryNo(methodOut.getValue1300());
//  CALL 800-PTR-IP586010
          // CALL 800-PTR-IP586010
          	programCtx.setRc( ip586010.process(programCtx.getGlobalCtx().getContext("IP586010")));
//  EVALUATE TRUE
          if  ( methodIn.isDuplicateCode88100()  ) { 
//  ADD +1 TO 800-TIPAMRS-SKIP-COUNT
              methodOut.setTipamrsSkipCount800(methodOut.getTipamrsSkipCount800()+1);
//  MOVE 300-TIPMRS-DUPL-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getTipmrsDuplMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201(programCtx.getWriteErrFileSys201InCtx());/*2800-WRITE-ERR-FILE-SYS201*/
          }
          else if  ( methodIn.isRowsFound88100()  ) { 
//  ADD 300-VALUE-1 TO 800-MRS-ISRT-COUNT
              methodOut.setMrsIsrtCount800(methodOut.getMrsIsrtCount800()+methodOut.getValue1300());
          }
          else   { 
//  ADD +1 TO 800-TIPAMRS-SKIP-COUNT
              methodOut.setTipamrsSkipCount800(methodOut.getTipamrsSkipCount800()+1);
//  MOVE 300-INSERT-MRS-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getInsertMrsAbendCode300());
//  MOVE 605-TIPAMRS-INSERT-FAILURE TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(100,methodOut.getTipamrsInsertFailure605(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-2430-1 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName24301300());
//  MOVE 300-TIPMRS-FAIL-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getTipmrsFailMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201(programCtx.getWriteErrFileSys201InCtx());/*2800-WRITE-ERR-FILE-SYS201*/
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * validateQueueData 
      *   This method is derived from 
  *   COBOL Paragraph - 2500-VALIDATE-QUEUE-DATA COBOL Cyclomatic complexity - 16
      * Input  :  

      * - fnsPldRdPrimaryAcctNbr         COBOL Name: FNS-PLD-RD-PRIMARY-ACCT-NBR
      * - panInvalidMsg300               COBOL Name: 300-PAN-INVALID-MSG
      * - fnsPldRdExpirationDate         COBOL Name: FNS-PLD-RD-EXPIRATION-DATE
      * - expInvalidMsg300               COBOL Name: 300-EXP-INVALID-MSG
      * - fnsPldRdVrtlAcctNum            COBOL Name: FNS-PLD-RD-VRTL-ACCT-NUM
      * - vanInvalidMsg300               COBOL Name: 300-VAN-INVALID-MSG
      * - fnsPldRdGftDsn                 COBOL Name: FNS-PLD-RD-GFT-DSN
      * - gftInvalidMsg300               COBOL Name: 300-GFT-INVALID-MSG
      * - fnsPldRdTxnNum                 COBOL Name: FNS-PLD-RD-TXN-NUM
      * - txnInvalidMsg300               COBOL Name: 300-TXN-INVALID-MSG
      *
      * Output :  

      * - ip82921ErrMsgOut               COBOL Name: IP82921-ERR-MSG-OUT
      * - skipFlag800                    COBOL Name: 800-SKIP-FLAG
      * - ip82921ErrMsg                  COBOL Name: IP82921-ERR-MSG
      * - panInvalidMsg300               COBOL Name: 300-PAN-INVALID-MSG
      * - expInvalidMsg300               COBOL Name: 300-EXP-INVALID-MSG
      * - vanInvalidMsg300               COBOL Name: 300-VAN-INVALID-MSG
      * - gftInvalidMsg300               COBOL Name: 300-GFT-INVALID-MSG
      * - txnInvalidMsg300               COBOL Name: 300-TXN-INVALID-MSG
      *
      * @throws CFException
      */
      @Override
      public ValidateQueueDataOutCtx validateQueueData(ValidateQueueDataInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This para reads the fraudulent transactions from the queue and  *
// *prepares the key for faa fac table lookup. skip records which   *
// *are having junk values/high/low-values.                         *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
ValidateQueueDataOutCtx methodOut = methodIn.getValidateQueueDataOutCtx();
//  INITIALIZE IP82921-ERR-MSG-OUT
          methodOut.getIp82921ErrMsgOut().initialize();
//  SET 88-800-SKIP-FLAG-N TO TRUE
          methodOut.setSkipFlagN88800True(); 
          
//  IF ( FNS-PLD-RD-PRIMARY-ACCT-NBR EQUAL LOW-VALUES OR SPACES OR HIGH-VALUES )
          if ((			( checkLowValue(methodIn.getFnsPldRdPrimaryAcctNbr()) )  ||         ( allSpaces(methodIn.getFnsPldRdPrimaryAcctNbr())   ) || ( isHighValue(methodIn.getFnsPldRdPrimaryAcctNbr()) ) )) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              methodOut.setSkipFlagY88800True(); 
              
//  MOVE 300-PAN-INVALID-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getPanInvalidMsg300());
          }
//  IF ( ( FNS-PLD-RD-EXPIRATION-DATE EQUAL LOW-VALUES OR HIGH-VALUES ) AND ( 88-800-SKIP-FLAG-N ))
          if ((((			( checkLowValue(methodIn.getFnsPldRdExpirationDate()) )  || ( isHighValue(methodIn.getFnsPldRdExpirationDate()) ) )) && (( methodOut.isSkipFlagN88800()  )))) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              methodOut.setSkipFlagY88800True(); 
              
//  MOVE 300-EXP-INVALID-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getExpInvalidMsg300());
          }
//  IF ( ( FNS-PLD-RD-VRTL-ACCT-NUM EQUAL LOW-VALUES OR HIGH-VALUES ) AND ( 88-800-SKIP-FLAG-N ))
          if ((((			( checkLowValue(methodIn.getFnsPldRdVrtlAcctNum()) )  || ( isHighValue(methodIn.getFnsPldRdVrtlAcctNum()) ) )) && (( methodOut.isSkipFlagN88800()  )))) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              methodOut.setSkipFlagY88800True(); 
              
//  MOVE 300-VAN-INVALID-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getVanInvalidMsg300());
          }
//  IF ( ( FNS-PLD-RD-GFT-DSN EQUAL LOW-VALUES OR HIGH-VALUES OR SPACES) AND ( 88-800-SKIP-FLAG-N ))
          if ((((			( checkLowValue(methodIn.getFnsPldRdGftDsn()) )  || ( isHighValue(methodIn.getFnsPldRdGftDsn()) )  ||         ( allSpaces(methodIn.getFnsPldRdGftDsn())   ))) && (( methodOut.isSkipFlagN88800()  )))) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              methodOut.setSkipFlagY88800True(); 
              
//  MOVE 300-GFT-INVALID-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getGftInvalidMsg300());
          }
//  IF ( ( FNS-PLD-RD-TXN-NUM IS NOT NUMERIC) AND ( 88-800-SKIP-FLAG-N ))
          if ((((         !(methodIn.getFnsPldRd().fnsPldRdTxnNumIsNumeric() ) )) && (( methodOut.isSkipFlagN88800()  )))) { 
//  MOVE 300-TXN-INVALID-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getTxnInvalidMsg300());
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              methodOut.setSkipFlagY88800True(); 
              
          }
      
      return methodOut;
      }
      /**
      * indiaFraudTableLookup 
      *   This method is derived from 
  *   COBOL Paragraph - 2550-INDIA-FRAUD-TABLE-LOOKUP COBOL Cyclomatic complexity - 3
      * Input  :  

      * - fnsPldRdQueryNo                COBOL Name: FNS-PLD-RD-QUERY-NO
      * - fnsPldRdPrimaryAcctNbr         COBOL Name: FNS-PLD-RD-PRIMARY-ACCT-NBR
      * - fnsPldRdExpirationDate         COBOL Name: FNS-PLD-RD-EXPIRATION-DATE
      * - fnsPldRdVrtlAcctNum            COBOL Name: FNS-PLD-RD-VRTL-ACCT-NUM
      * - noOfRows                       COBOL Name: NO-OF-ROWS
      * - ip50201AccntStatus             COBOL Name: IP50201-ACCNT-STATUS
      * - valueClosed300                 COBOL Name: 300-VALUE-CLOSED
      * - ip50201ClosedDate              COBOL Name: IP50201-CLOSED-DATE
      * - faaFacNotFndCnt800             COBOL Name: 800-FAA-FAC-NOT-FND-CNT
      * - facNotFoundMsg300              COBOL Name: 300-FAC-NOT-FOUND-MSG
      * - fnsPldRdGftDsn                 COBOL Name: FNS-PLD-RD-GFT-DSN
      * - fnsPldRdLogicalSeq             COBOL Name: FNS-PLD-RD-LOGICAL-SEQ
      * - fnsPldRdTxnNum                 COBOL Name: FNS-PLD-RD-TXN-NUM
      *
      * Output :  

      * - fnsPayload                     COBOL Name: FNS-PAYLOAD
      * - queryNo                        COBOL Name: QUERY-NO
      * - fnsPldRdQueryNo                COBOL Name: FNS-PLD-RD-QUERY-NO
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - ip50201PrimaryAcctNbr          COBOL Name: IP50201-PRIMARY-ACCT-NBR
      * - fnsPldRdPrimaryAcctNbr         COBOL Name: FNS-PLD-RD-PRIMARY-ACCT-NBR
      * - ip50201ExpirationDate          COBOL Name: IP50201-EXPIRATION-DATE
      * - fnsPldRdExpirationDate         COBOL Name: FNS-PLD-RD-EXPIRATION-DATE
      * - ip50201VrtlAcctNum             COBOL Name: IP50201-VRTL-ACCT-NUM
      * - fnsPldRdVrtlAcctNum            COBOL Name: FNS-PLD-RD-VRTL-ACCT-NUM
      * - rc                             COBOL Name: RETURN-CODE
      * - fnsPayloadFacCount             COBOL Name: FNS-PAYLOAD-FAC-COUNT
      * - noOfRows                       COBOL Name: NO-OF-ROWS
      * - fnsPayloadFaaPanStatCd         COBOL Name: FNS-PAYLOAD-FAA-PAN-STAT-CD
      * - ip50201AccntStatus             COBOL Name: IP50201-ACCNT-STATUS
      * - fnsPayloadFaaCloseDt           COBOL Name: FNS-PAYLOAD-FAA-CLOSE-DT
      * - ip50201ClosedDate              COBOL Name: IP50201-CLOSED-DATE
      * - faaFacNotFndCnt800             COBOL Name: 800-FAA-FAC-NOT-FND-CNT
      * - ip82921ErrMsg                  COBOL Name: IP82921-ERR-MSG
      * - facNotFoundMsg300              COBOL Name: 300-FAC-NOT-FOUND-MSG
      * - fnsPayloadPrimaryAcctNbr       COBOL Name: FNS-PAYLOAD-PRIMARY-ACCT-NBR
      * - fnsPayloadExpirationDate       COBOL Name: FNS-PAYLOAD-EXPIRATION-DATE
      * - fnsPayloadVrtlAcctNum          COBOL Name: FNS-PAYLOAD-VRTL-ACCT-NUM
      * - fnsPayloadQueryNo              COBOL Name: FNS-PAYLOAD-QUERY-NO
      * - fnsPayloadGftDsn               COBOL Name: FNS-PAYLOAD-GFT-DSN
      * - fnsPldRdGftDsn                 COBOL Name: FNS-PLD-RD-GFT-DSN
      * - fnsPayloadLogicalSeq           COBOL Name: FNS-PAYLOAD-LOGICAL-SEQ
      * - fnsPldRdLogicalSeq             COBOL Name: FNS-PLD-RD-LOGICAL-SEQ
      * - fnsPayloadTxnNum               COBOL Name: FNS-PAYLOAD-TXN-NUM
      * - fnsPldRdTxnNum                 COBOL Name: FNS-PLD-RD-TXN-NUM
      *
      * @throws CFException
      */
      @Override
      public IndiaFraudTableLookupOutCtx indiaFraudTableLookup(IndiaFraudTableLookupInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This para reads the fraudulent transactions from the queue and  *
// *get the fac count,faa close dt,pan status cd and put it in the  *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
IndiaFraudTableLookupOutCtx methodOut = methodIn.getIndiaFraudTableLookupOutCtx();
//  INITIALIZE FNS-PAYLOAD
          methodOut.getFnsPayload().initialize();
//  MOVE FNS-PLD-RD-QUERY-NO TO QUERY-NO
          methodOut.setQueryNo(methodOut.getFnsPldRdQueryNo());
//  SET 88-100-SELECT-RTN TO TRUE
          methodOut.setSelectRtn88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          methodOut.setRowsFound88100True(); 
          

// *    Populate the key variables to call tipafac db2 api
//  MOVE FNS-PLD-RD-PRIMARY-ACCT-NBR TO IP50201-PRIMARY-ACCT-NBR
          methodOut.setIp50201PrimaryAcctNbr(methodOut.getFnsPldRdPrimaryAcctNbr());
          // MOVE FNS-PLD-RD-EXPIRATION-DATE TO IP50201-EXPIRATION-DATE
          methodOut.getIp50201ExpirationDate().setString(methodOut.getFnsPldRdExpirationDate().getCharArray());
//  MOVE FNS-PLD-RD-VRTL-ACCT-NUM TO IP50201-VRTL-ACCT-NUM
          methodOut.setIp50201VrtlAcctNum(methodOut.getFnsPldRdVrtlAcctNum());
//  CALL 800-PTR-IP521010
          // CALL 800-PTR-IP521010
          	programCtx.setRc( ip521010.process(programCtx.getGlobalCtx().getContext("IP521010")));

// *    Populate fac count, faa stat cd, faa close dt
//  IF 88-100-ROWS-FOUND
          if ( methodOut.isRowsFound88100()  ) { 
//  MOVE NO-OF-ROWS TO FNS-PAYLOAD-FAC-COUNT
              methodOut.setFnsPayloadFacCount((short) methodOut.getNoOfRows());
//  MOVE IP50201-ACCNT-STATUS TO FNS-PAYLOAD-FAA-PAN-STAT-CD
              methodOut.setFnsPayloadFaaPanStatCd(methodOut.getIp50201AccntStatus());
//  IF IP50201-ACCNT-STATUS EQUAL TO 300-VALUE-CLOSED
              if (		compareChars(methodOut.getIp50201AccntStatus(),methodIn.getValueClosed300()) == 0 ) { 
                  // MOVE IP50201-CLOSED-DATE TO FNS-PAYLOAD-FAA-CLOSE-DT
                  methodOut.setFnsPayloadFaaCloseDt(methodOut.getIp50201ClosedDate().toCharArray());
              }
//  ELSE
              else { 
//  MOVE SPACES TO FNS-PAYLOAD-FAA-CLOSE-DT
                  methodOut.setFnsPayloadFaaCloseDt(CONSTANTS.SPACE_10);
              }
          }
//  ELSE
          else { 
//  ADD +1 TO 800-FAA-FAC-NOT-FND-CNT
              methodOut.setFaaFacNotFndCnt800(methodOut.getFaaFacNotFndCnt800()+1);
//  MOVE ZEROES TO FNS-PAYLOAD-FAC-COUNT
              methodOut.setFnsPayloadFacCount((short) 0);
//  MOVE 300-FAC-NOT-FOUND-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getFacNotFoundMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201(programCtx.getWriteErrFileSys201InCtx());/*2800-WRITE-ERR-FILE-SYS201*/
          }

// *    Populate the key variables for mqput
//  MOVE FNS-PLD-RD-PRIMARY-ACCT-NBR TO FNS-PAYLOAD-PRIMARY-ACCT-NBR
          methodOut.setFnsPayloadPrimaryAcctNbr(methodOut.getFnsPldRdPrimaryAcctNbr());
          // MOVE FNS-PLD-RD-EXPIRATION-DATE TO FNS-PAYLOAD-EXPIRATION-DATE
          methodOut.getFnsPayloadExpirationDate().setString(methodOut.getFnsPldRdExpirationDate().getCharArray());
//  MOVE FNS-PLD-RD-VRTL-ACCT-NUM TO FNS-PAYLOAD-VRTL-ACCT-NUM
          methodOut.setFnsPayloadVrtlAcctNum(methodOut.getFnsPldRdVrtlAcctNum());
//  MOVE FNS-PLD-RD-QUERY-NO TO FNS-PAYLOAD-QUERY-NO
          methodOut.setFnsPayloadQueryNo(methodOut.getFnsPldRdQueryNo());
//  MOVE FNS-PLD-RD-GFT-DSN TO FNS-PAYLOAD-GFT-DSN
          methodOut.setFnsPayloadGftDsn(methodOut.getFnsPldRdGftDsn());
//  MOVE FNS-PLD-RD-LOGICAL-SEQ TO FNS-PAYLOAD-LOGICAL-SEQ
          methodOut.setFnsPayloadLogicalSeq(methodOut.getFnsPldRdLogicalSeq());
//  MOVE FNS-PLD-RD-TXN-NUM TO FNS-PAYLOAD-TXN-NUM
          methodOut.setFnsPayloadTxnNum(methodOut.getFnsPldRdTxnNum());
      
      return methodOut;
      }
      /**
      * populateMqputFields 
      *   This method is derived from 
  *   COBOL Paragraph - 2600-POPULATE-MQPUT-FIELDS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fnsPayload                     COBOL Name: FNS-PAYLOAD
      * - ip7052f4NoOfTrans              COBOL Name: IP7052F4-NO-OF-TRANS
      * - ip7051f4MqBypassSw             COBOL Name: IP7051F4-MQ-BYPASS-SW
      * - reqHconn800                    COBOL Name: 800-REQ-HCONN
      * - reqHobj800                     COBOL Name: 800-REQ-HOBJ
      * - reqQmgrName800                 COBOL Name: 800-REQ-QMGR-NAME
      * - reqQName800                    COBOL Name: 800-REQ-Q-NAME
      * - ip7052f4TimeDelay              COBOL Name: IP7052F4-TIME-DELAY
      *
      * Output :  

      * - end800                         COBOL Name: 800-END
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - fnsPayload                     COBOL Name: FNS-PAYLOAD
      * - ip70521NoOfTrans               COBOL Name: IP70521-NO-OF-TRANS
      * - ip7052f4NoOfTrans              COBOL Name: IP7052F4-NO-OF-TRANS
      * - ip70521MqBypassSw              COBOL Name: IP70521-MQ-BYPASS-SW
      * - ip7051f4MqBypassSw             COBOL Name: IP7051F4-MQ-BYPASS-SW
      * - ip70521Hconn                   COBOL Name: IP70521-HCONN
      * - reqHconn800                    COBOL Name: 800-REQ-HCONN
      * - ip70521Hobj                    COBOL Name: IP70521-HOBJ
      * - reqHobj800                     COBOL Name: 800-REQ-HOBJ
      * - ip70521QmgrName                COBOL Name: IP70521-QMGR-NAME
      * - reqQmgrName800                 COBOL Name: 800-REQ-QMGR-NAME
      * - ip70521QName                   COBOL Name: IP70521-Q-NAME
      * - reqQName800                    COBOL Name: 800-REQ-Q-NAME
      * - ip70521TimeDelay               COBOL Name: IP70521-TIME-DELAY
      * - ip7052f4TimeDelay              COBOL Name: IP7052F4-TIME-DELAY
      *
      * @throws CFException
      */
      @Override
      public PopulateMqputFieldsOutCtx populateMqputFields(PopulateMqputFieldsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This para populate fields for mq put operation                  *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
PopulateMqputFieldsOutCtx methodOut = methodIn.getPopulateMqputFieldsOutCtx();
//  MOVE LENGTH OF FNS-PAYLOAD TO 800-END IP70521-MSG-BUFFER-LEN
          methodOut.setEnd800(FnsPayload.getFnsPayloadFieldLength());
          methodOut.setIp70521MsgBufferLen(FnsPayload.getFnsPayloadFieldLength());
//  MOVE FNS-PAYLOAD ( 800-START : 800-END ) TO IP70521-MSG-BUFFER
          methodOut.setIp70521MsgBuffer(pad(4000000,substring(methodOut.getFnsPayload().getCharArray(),(methodIn.getStart800()-1), (methodOut.getEnd800() + (methodIn.getStart800() - 1)) ),SPACE_CHAR,RIGHT_PAD));
          // MOVE IP7052F4-NO-OF-TRANS TO IP70521-NO-OF-TRANS
          methodOut.setIp70521NoOfTrans(methodOut.getIp7052f4NoOfTrans());
//  MOVE IP7051F4-MQ-BYPASS-SW TO IP70521-MQ-BYPASS-SW
          methodOut.setIp70521MqBypassSw(methodOut.getIp7051f4MqBypassSw());
//  MOVE 800-REQ-HCONN TO IP70521-HCONN
          methodOut.setIp70521Hconn(methodOut.getReqHconn800());
//  MOVE 800-REQ-HOBJ TO IP70521-HOBJ
          methodOut.setIp70521Hobj(methodOut.getReqHobj800());
//  MOVE 800-REQ-QMGR-NAME TO IP70521-QMGR-NAME
          methodOut.setIp70521QmgrName(methodOut.getReqQmgrName800());
//  MOVE 800-REQ-Q-NAME TO IP70521-Q-NAME
          methodOut.setIp70521QName(methodOut.getReqQName800());
//  MOVE IP7052F4-TIME-DELAY TO IP70521-TIME-DELAY
          methodOut.setIp70521TimeDelay(methodOut.getIp7052f4TimeDelay());
      
      return methodOut;
      }
      /**
      * mqputFraudTrans 
      *   This method is derived from 
  *   COBOL Paragraph - 2610-MQPUT-FRAUD-TRANS COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ip70521MqBypassSw              COBOL Name: IP70521-MQ-BYPASS-SW
      * - valueN300                      COBOL Name: 300-VALUE-N
      * - ip70301IsFraudMqSrvActive      COBOL Name: IP70301-IS-FRAUD-MQ-SRV-ACTIVE
      * - ip70521MqReturnSw              COBOL Name: IP70521-MQ-RETURN-SW
      * - mqputFailCount800              COBOL Name: 800-MQPUT-FAIL-COUNT
      * - mqputFailMsg300                COBOL Name: 300-MQPUT-FAIL-MSG
      * - ip70521CompCd                  COBOL Name: IP70521-COMP-CD
      * - mqFailCode300                  COBOL Name: 300-MQ-FAIL-CODE
      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - paraName2610300                COBOL Name: 300-PARA-NAME-2610
      * - putQAbendCode300               COBOL Name: 300-PUT-Q-ABEND-CODE
      * - queueErrorMsg611               COBOL Name: 611-QUEUE-ERROR-MSG
      *
      * Output :  

      * - checkPutQueue100               COBOL Name: 100-CHECK-PUT-QUEUE
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - mqputFailCount800              COBOL Name: 800-MQPUT-FAIL-COUNT
      * - ip82921ErrMsg                  COBOL Name: IP82921-ERR-MSG
      * - mqputFailMsg300                COBOL Name: 300-MQPUT-FAIL-MSG
      * - badReasonCode611               COBOL Name: 611-BAD-REASON-CODE
      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - action611                      COBOL Name: 611-ACTION
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName2610300                COBOL Name: 300-PARA-NAME-2610
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - putQAbendCode300               COBOL Name: 300-PUT-Q-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - queueErrorMsg611               COBOL Name: 611-QUEUE-ERROR-MSG
      *
      * @throws CFException
      */
      @Override
      public MqputFraudTransOutCtx mqputFraudTrans(MqputFraudTransInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This para puts the fac payload information to response mq       *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
MqputFraudTransOutCtx methodOut = methodIn.getMqputFraudTransOutCtx();
//  SET 88-100-PUT-FAA-FAC4 TO TRUE
          methodOut.setPutFaaFac488100True(); 
          
//  SET 88-IP70521-PUT TO TRUE
          methodOut.setIp70521Put88True(); 
          
//  IF IP70521-MQ-BYPASS-SW EQUAL 300-VALUE-N AND 88-IP70301-FRAUD-MQ-ACTIVE-Y
          if (		compareChars(methodIn.getIp70521MqBypassSw(),methodIn.getValueN300()) == 0  &&  methodIn.isIp70301FraudMqActiveY88()  ) { 
//  CALL 800-PTR-IP708010
              // CALL 800-PTR-IP708010
              	programCtx.setRc( ip708010.process(programCtx.getGlobalCtx().getContext("IP708010")));
          }
//  IF 88-IP70521-MQ-RETURN-Y
//  ELSE
          if (!(methodIn.isIp70521MqReturnY88()) ) { 
//  ADD +1 TO 800-MQPUT-FAIL-COUNT
              methodOut.setMqputFailCount800(methodOut.getMqputFailCount800()+1);
//  MOVE 300-MQPUT-FAIL-MSG TO IP82921-ERR-MSG
              methodOut.setIp82921ErrMsg(methodOut.getMqputFailMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201(programCtx.getWriteErrFileSys201InCtx());/*2800-WRITE-ERR-FILE-SYS201*/
//  IF IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE
              if (	( methodIn.getIp70521CompCd() == methodIn.getMqFailCode300() )) { 
//  MOVE IP70521-RESN-CD TO 611-BAD-REASON-CODE
                  methodOut.setBadReasonCode611( methodOut.getIp70521ResnCd());
//  SET 88-611-ERR-PUT TO TRUE
                  methodOut.setErrPut88611True(); 
                  
//  MOVE 300-PARA-NAME-2610 TO 900-ABEND-PARA-NAME
                  methodOut.setAbendParaName900(methodOut.getParaName2610300());
//  MOVE 300-PUT-Q-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(methodOut.getPutQAbendCode300());
                  // MOVE 611-QUEUE-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getQueueErrorMsg611().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
              }
          }
      
      return methodOut;
      }
      /**
      * setMqGet 
      *   This method is derived from 
  *   COBOL Paragraph - 2700-SET-MQ-GET COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - getBrowseCalls100              COBOL Name: 100-GET-BROWSE-CALLS
      *
      * @throws CFException
      */
      @Override
      public SetMqGetOutCtx setMqGet(Ip829010Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// *This para reset the mqput to mqget and call ip708020 api.       *
// *----------------------------------------------------------------*
SetMqGetOutCtx methodOut = programCtx.getSetMqGetOutCtx();
//  SET 88-100-NEXT-BROWSE TO TRUE
          methodOut.setNextBrowse88100True(); 
          
      
      return methodOut;
      }
      /**
      * writeErrFileSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 2800-WRITE-ERR-FILE-SYS201 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - ip70521TargetQmgrName          COBOL Name: IP70521-TARGET-QMGR-NAME
      * - ip70521TargetQName             COBOL Name: IP70521-TARGET-Q-NAME
      * - ip70521CompCd                  COBOL Name: IP70521-COMP-CD
      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - ip82921ErrMsgOut               COBOL Name: IP82921-ERR-MSG-OUT
      * - sys201300                      COBOL Name: 300-SYS201
      * - abendCode3003011               COBOL Name: 300-3011-ABEND-CODE
      * - errorMsg6003011                COBOL Name: 600-3011-ERROR-MSG
      * - paraName2800300                COBOL Name: 300-PARA-NAME-2800
      *
      * Output :  

      * - ip82921ErrPayloadMsg           COBOL Name: IP82921-ERR-PAYLOAD-MSG
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - ip82921ErrRequestCd            COBOL Name: IP82921-ERR-REQUEST-CD
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - ip82921ErrTargetQmgrName       COBOL Name: IP82921-ERR-TARGET-QMGR-NAME
      * - ip70521TargetQmgrName          COBOL Name: IP70521-TARGET-QMGR-NAME
      * - ip82921ErrTargetQName          COBOL Name: IP82921-ERR-TARGET-Q-NAME
      * - ip70521TargetQName             COBOL Name: IP70521-TARGET-Q-NAME
      * - ip82921ErrCompCd               COBOL Name: IP82921-ERR-COMP-CD
      * - ip70521CompCd                  COBOL Name: IP70521-COMP-CD
      * - ip82921ErrResnCd               COBOL Name: IP82921-ERR-RESN-CD
      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - sys201ErrMsgOut                COBOL Name: SYS201-ERR-MSG-OUT
      * - ip82921ErrMsgOut               COBOL Name: IP82921-ERR-MSG-OUT
      * - sys201Status800                COBOL Name: 800-SYS201-STATUS
      * - fileDd6003011                  COBOL Name: 600-3011-FILE-DD
      * - sys201300                      COBOL Name: 300-SYS201
      * - fileStat6003011                COBOL Name: 600-3011-FILE-STAT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003011               COBOL Name: 300-3011-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003011                COBOL Name: 600-3011-ERROR-MSG
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName2800300                COBOL Name: 300-PARA-NAME-2800
      *
      * @throws CFException
      */
      @Override
      public WriteErrFileSys201OutCtx writeErrFileSys201(WriteErrFileSys201InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This para writes error message from queue along with the error
// * reason and output file can be read using copybook xyz.
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
WriteErrFileSys201OutCtx methodOut = methodIn.getWriteErrFileSys201OutCtx();
//  MOVE IP70521-MSG-BUFFER ( 300-VALUE-1 : 800-END ) TO IP82921-ERR-PAYLOAD-MSG
          methodOut.getIp82921ErrMsgOut().replace(methodIn.getIp70521MqApiLayout()/*parent*/,252+methodIn.getValue1300() - 1/*fromOffset - (ip82921ErrPayloadMsg) */,methodIn.getEnd800()/*fromLen*/,0/*toOffset - (ip70521MsgBuffer) */,222/*toLen*/);
//  MOVE IP70521-REQUEST-CD TO IP82921-ERR-REQUEST-CD
          methodOut.setIp82921ErrRequestCd(methodOut.getIp70521RequestCd());
//  MOVE IP70521-TARGET-QMGR-NAME TO IP82921-ERR-TARGET-QMGR-NAME
          methodOut.setIp82921ErrTargetQmgrName(methodOut.getIp70521TargetQmgrName());
//  MOVE IP70521-TARGET-Q-NAME TO IP82921-ERR-TARGET-Q-NAME
          methodOut.setIp82921ErrTargetQName(methodOut.getIp70521TargetQName());
          // MOVE IP70521-COMP-CD TO IP82921-ERR-COMP-CD
          methodOut.setIp82921ErrCompCd(methodOut.getIp70521CompCd());
//  MOVE IP70521-RESN-CD TO IP82921-ERR-RESN-CD
          methodOut.setIp82921ErrResnCd( methodOut.getIp70521ResnCd());
          // MOVE IP82921-ERR-MSG-OUT TO SYS201-ERR-MSG-OUT
          methodOut.getSys201ErrMsgOut().setString(methodOut.getIp82921ErrMsgOut().getCharArray());
//  WRITE SYS201-ERR-MSG-OUT
          sys201FnsMqErrFile.write(methodOut.getSys201ErrMsgOut().toCharArray()); 
          methodOut.getSys201ErrMsgOut().setString(CONSTANTS.LOW_VALUE_215717453);
          methodOut.setSys201Status800(sys201FnsMqErrFile.getStatusString() );
//  IF 800-88-SYS201-IO-GOOD
//  ELSE
          if (!(methodOut.isSys201IoGood80088()) ) { 
//  MOVE 300-SYS201 TO 600-3011-FILE-DD
              methodOut.setFileDd6003011(pad(8,methodOut.getSys201300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-SYS201-STATUS TO 600-3011-FILE-STAT
              methodOut.setFileStat6003011(methodOut.getSys201Status800());
//  MOVE 300-3011-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getAbendCode3003011());
              // MOVE 600-3011-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003011().toCharArray());
//  MOVE 300-PARA-NAME-2800 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName2800300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * closeQueue 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-CLOSE-QUEUE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip02015HostGeoScopeCode        COBOL Name: IP02015-HOST-GEO-SCOPE-CODE
      * - mqgetFailCount800              COBOL Name: 800-MQGET-FAIL-COUNT
      * - mqgetFailCnt612                COBOL Name: 612-MQGET-FAIL-CNT
      * - tipamrsSkipCount800            COBOL Name: 800-TIPAMRS-SKIP-COUNT
      * - tipamrsSkipCnt611              COBOL Name: 611-TIPAMRS-SKIP-CNT
      * - mrsIsrtCount800                COBOL Name: 800-MRS-ISRT-COUNT
      * - mrsRowCnt608                   COBOL Name: 608-MRS-ROW-CNT
      * - faaFacNotFndCnt800             COBOL Name: 800-FAA-FAC-NOT-FND-CNT
      * - faaFacNotFndCnt614             COBOL Name: 614-FAA-FAC-NOT-FND-CNT
      * - mqputSkipCount800              COBOL Name: 800-MQPUT-SKIP-COUNT
      * - mqputSkipCnt610                COBOL Name: 610-MQPUT-SKIP-CNT
      * - mqputFailCount800              COBOL Name: 800-MQPUT-FAIL-COUNT
      * - mqputFailCnt613                COBOL Name: 613-MQPUT-FAIL-CNT
      * - resHconn800                    COBOL Name: 800-RES-HCONN
      * - resHobj800                     COBOL Name: 800-RES-HOBJ
      * - reqHconn800                    COBOL Name: 800-REQ-HCONN
      * - reqHobj800                     COBOL Name: 800-REQ-HOBJ
      *
      * Output :  

      * - getFailCnt612                  COBOL Name: 612-GET-FAIL-CNT
      * - mqgetFailCount800              COBOL Name: 800-MQGET-FAIL-COUNT
      * - mrsSkipCnt611                  COBOL Name: 611-MRS-SKIP-CNT
      * - tipamrsSkipCount800            COBOL Name: 800-TIPAMRS-SKIP-COUNT
      * - mrsIsrtCnt608                  COBOL Name: 608-MRS-ISRT-CNT
      * - mrsIsrtCount800                COBOL Name: 800-MRS-ISRT-COUNT
      * - ip34051ProcessSwitch           COBOL Name: IP34051-PROCESS-SWITCH
      * - ip34051QueueType               COBOL Name: IP34051-QUEUE-TYPE
      * - ip34051TipacliSwitch           COBOL Name: IP34051-TIPACLI-SWITCH
      * - ip34051TipasvcSwitch           COBOL Name: IP34051-TIPASVC-SWITCH
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip34051FuncCd                  COBOL Name: IP34051-FUNC-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - facNotFndCnt614                COBOL Name: 614-FAC-NOT-FND-CNT
      * - faaFacNotFndCnt800             COBOL Name: 800-FAA-FAC-NOT-FND-CNT
      * - putSkipCnt610                  COBOL Name: 610-PUT-SKIP-CNT
      * - mqputSkipCount800              COBOL Name: 800-MQPUT-SKIP-COUNT
      * - putFailCnt613                  COBOL Name: 613-PUT-FAIL-CNT
      * - mqputFailCount800              COBOL Name: 800-MQPUT-FAIL-COUNT
      * - ip7052f4Hconn                  COBOL Name: IP7052F4-HCONN
      * - resHconn800                    COBOL Name: 800-RES-HCONN
      * - ip7052f4Hobj                   COBOL Name: IP7052F4-HOBJ
      * - resHobj800                     COBOL Name: 800-RES-HOBJ
      * - reqHconn800                    COBOL Name: 800-REQ-HCONN
      * - reqHobj800                     COBOL Name: 800-REQ-HOBJ
      *
      * @throws CFException
      */
      @Override
      public CloseQueueOutCtx closeQueue(CloseQueueInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This para closes and disconnects from the fraud mq              *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
CloseQueueOutCtx methodOut = methodIn.getCloseQueueOutCtx();
//  IF 88-IP02015-HOST-PA-GLOBAL
          if ( methodIn.isIp02015HostPaGlobal88()  ) { 
              // MOVE 800-MQGET-FAIL-COUNT TO 612-GET-FAIL-CNT
              methodOut.setGetFailCnt612(methodOut.getMqgetFailCount800());
//  DISPLAY 612-MQGET-FAIL-CNT
              logger.info(methodIn.getMqgetFailCnt612().toString()); 
              // MOVE 800-TIPAMRS-SKIP-COUNT TO 611-MRS-SKIP-CNT
              methodOut.setMrsSkipCnt611(methodOut.getTipamrsSkipCount800());
//  DISPLAY 611-TIPAMRS-SKIP-CNT
              logger.info(methodIn.getTipamrsSkipCnt611().toString()); 
              // MOVE 800-MRS-ISRT-COUNT TO 608-MRS-ISRT-CNT
              methodOut.setMrsIsrtCnt608(methodOut.getMrsIsrtCount800());
//  DISPLAY 608-MRS-ROW-CNT
              logger.info(methodIn.getMrsRowCnt608().toString()); 

// * Populating common paramters for mq close
//  SET 88-IP34051-REQUEST-END TO TRUE
              methodOut.setIp34051RequestEnd88True(); 
              
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              methodOut.setIp34051RespnseQ88True(); 
              
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
              methodOut.setIp34051TipacliActiveN88True(); 
              
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
              methodOut.setIp34051TipasvcActiveN88True(); 
              

// * For fraudulent data queue:
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
              methodOut.setIp34051ServCdFra88True(); 
              
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
              methodOut.setIp34051FuncCdCha88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
          }
//  ELSE
          else { 
              // MOVE 800-MQGET-FAIL-COUNT TO 612-GET-FAIL-CNT
              methodOut.setGetFailCnt612(methodOut.getMqgetFailCount800());
//  DISPLAY 612-MQGET-FAIL-CNT
              logger.info(methodIn.getMqgetFailCnt612().toString()); 
              // MOVE 800-FAA-FAC-NOT-FND-CNT TO 614-FAC-NOT-FND-CNT
              methodOut.setFacNotFndCnt614(methodOut.getFaaFacNotFndCnt800());
//  DISPLAY 614-FAA-FAC-NOT-FND-CNT
              logger.info(methodIn.getFaaFacNotFndCnt614().toString()); 
              // MOVE 800-MQPUT-SKIP-COUNT TO 610-PUT-SKIP-CNT
              methodOut.setPutSkipCnt610(methodOut.getMqputSkipCount800());
//  DISPLAY 610-MQPUT-SKIP-CNT
              logger.info(methodIn.getMqputSkipCnt610().toString()); 
              // MOVE 800-MQPUT-FAIL-COUNT TO 613-PUT-FAIL-CNT
              methodOut.setPutFailCnt613(methodOut.getMqputFailCount800());
//  DISPLAY 613-MQPUT-FAIL-CNT
              logger.info(methodIn.getMqputFailCnt613().toString()); 

// * Populating common paramters for mq open/connect
//  SET 88-IP34051-REQUEST-END TO TRUE
              methodOut.setIp34051RequestEnd88True(); 
              
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              methodOut.setIp34051RespnseQ88True(); 
              
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
              methodOut.setIp34051TipacliActiveN88True(); 
              
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
              methodOut.setIp34051TipasvcActiveN88True(); 
              
//  MOVE 800-RES-HCONN TO IP7052F4-HCONN
              methodOut.setIp7052f4Hconn(methodOut.getResHconn800());
//  MOVE 800-RES-HOBJ TO IP7052F4-HOBJ
              methodOut.setIp7052f4Hobj(methodOut.getResHobj800());

// * For fraudulent data queue:
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
              methodOut.setIp34051ServCdFra88True(); 
              
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
              methodOut.setIp34051FuncCdCha88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
//  SET 88-IP34051-REQUEST-END TO TRUE
              methodOut.setIp34051RequestEnd88True(); 
              
//  SET 88-IP34051-REQUEST-Q TO TRUE
              methodOut.setIp34051RequestQ88True(); 
              
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
              methodOut.setIp34051ServCdFra88True(); 
              
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
              methodOut.setIp34051FuncCdCha88True(); 
              
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
              methodOut.setIp34051TipacliActiveN88True(); 
              
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
              methodOut.setIp34051TipasvcActiveN88True(); 
              
//  MOVE 800-REQ-HCONN TO IP7052F4-HCONN
              methodOut.setIp7052f4Hconn(methodOut.getReqHconn800());
//  MOVE 800-REQ-HOBJ TO IP7052F4-HOBJ
              methodOut.setIp7052f4Hobj(methodOut.getReqHobj800());
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));

// * For disconnect data queue:
//  SET 88-IP34051-REQUEST-DISCNCT TO TRUE
              methodOut.setIp34051RequestDiscnct88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	programCtx.setRc( ip703020.process(programCtx.getGlobalCtx().getContext("IP703020")));
          }
      
      return methodOut;
      }
      /**
      * closeErrFileSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-CLOSE-ERR-FILE-SYS201 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys201Status800                COBOL Name: 800-SYS201-STATUS
      * - sys201300                      COBOL Name: 300-SYS201
      * - abendCode3003012               COBOL Name: 300-3012-ABEND-CODE
      * - errorMsg6003012                COBOL Name: 600-3012-ERROR-MSG
      * - paraName3100300                COBOL Name: 300-PARA-NAME-3100
      *
      * Output :  

      * - fileDd6003012                  COBOL Name: 600-3012-FILE-DD
      * - sys201300                      COBOL Name: 300-SYS201
      * - fileStat6003012                COBOL Name: 600-3012-FILE-STAT
      * - sys201Status800                COBOL Name: 800-SYS201-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003012               COBOL Name: 300-3012-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003012                COBOL Name: 600-3012-ERROR-MSG
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName3100300                COBOL Name: 300-PARA-NAME-3100
      *
      * @throws CFException
      */
      @Override
      public CloseErrFileSys201OutCtx closeErrFileSys201(CloseErrFileSys201InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph closes the output mq error sys201 file
// *-----------------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
CloseErrFileSys201OutCtx methodOut = methodIn.getCloseErrFileSys201OutCtx();
//  CLOSE SYS201-FNS-MQ-ERR-FILE
          sys201FnsMqErrFile.close(); 
          methodOut.setSys201Status800(sys201FnsMqErrFile.getStatusString() );
//  IF 800-SYS201-STATUS NOT EQUAL ZERO
          if (!( allZeros(methodOut.getSys201Status800()) ) /*  !=  zeros*/) { 
//  MOVE 300-SYS201 TO 600-3012-FILE-DD
              methodOut.setFileDd6003012(pad(8,methodOut.getSys201300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-SYS201-STATUS TO 600-3012-FILE-STAT
              methodOut.setFileStat6003012(methodOut.getSys201Status800());
//  MOVE 300-3012-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getAbendCode3003012());
              // MOVE 600-3012-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003012().toCharArray());
//  MOVE 300-PARA-NAME-3100 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName3100300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * displayMqInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-DISPLAY-MQ-INFO COBOL Cyclomatic complexity - 20
      * Input  :  

      * - fnsPldRdPrimaryAcctNbr         COBOL Name: FNS-PLD-RD-PRIMARY-ACCT-NBR
      * - fnsPldRdExpirationDate         COBOL Name: FNS-PLD-RD-EXPIRATION-DATE
      * - fnsPldRdVrtlAcctNum            COBOL Name: FNS-PLD-RD-VRTL-ACCT-NUM
      * - fnsPldRdQueryNo                COBOL Name: FNS-PLD-RD-QUERY-NO
      * - fnsPldRdGftDsn                 COBOL Name: FNS-PLD-RD-GFT-DSN
      * - fnsPldRdLogicalSeq             COBOL Name: FNS-PLD-RD-LOGICAL-SEQ
      * - fnsPldRdTxnNum                 COBOL Name: FNS-PLD-RD-TXN-NUM
      * - fnsPayloadFaaPanStatCd         COBOL Name: FNS-PAYLOAD-FAA-PAN-STAT-CD
      * - fnsPayloadFaaCloseDt           COBOL Name: FNS-PAYLOAD-FAA-CLOSE-DT
      * - valuePipe300                   COBOL Name: 300-VALUE-PIPE
      *
      * Output :  

      * - fraudMqDebugDisp600            COBOL Name: 600-FRAUD-MQ-DEBUG-DISP
      * - fraudMqDebugDispStr600         COBOL Name: 600-FRAUD-MQ-DEBUG-DISP-STR
      * - primaryAcctNo600               COBOL Name: 600-PRIMARY-ACCT-NO
      * - fnsPldRdPrimaryAcctNbr         COBOL Name: FNS-PLD-RD-PRIMARY-ACCT-NBR
      * - expirDate600                   COBOL Name: 600-EXPIR-DATE
      * - fnsPldRdExpirationDate         COBOL Name: FNS-PLD-RD-EXPIRATION-DATE
      * - virtualAcctNo600               COBOL Name: 600-VIRTUAL-ACCT-NO
      * - fnsPldRdVrtlAcctNum            COBOL Name: FNS-PLD-RD-VRTL-ACCT-NUM
      * - queryNum600                    COBOL Name: 600-QUERY-NUM
      * - fnsPldRdQueryNo                COBOL Name: FNS-PLD-RD-QUERY-NO
      * - gftDsn600                      COBOL Name: 600-GFT-DSN
      * - fnsPldRdGftDsn                 COBOL Name: FNS-PLD-RD-GFT-DSN
      * - logicalSeq600                  COBOL Name: 600-LOGICAL-SEQ
      * - fnsPldRdLogicalSeq             COBOL Name: FNS-PLD-RD-LOGICAL-SEQ
      * - txnNo600                       COBOL Name: 600-TXN-NO
      * - fnsPldRdTxnNum                 COBOL Name: FNS-PLD-RD-TXN-NUM
      * - faaPanStatCd600                COBOL Name: 600-FAA-PAN-STAT-CD
      * - fnsPayloadFaaPanStatCd         COBOL Name: FNS-PAYLOAD-FAA-PAN-STAT-CD
      * - faaClsDt600                    COBOL Name: 600-FAA-CLS-DT
      * - fnsPayloadFaaCloseDt           COBOL Name: FNS-PAYLOAD-FAA-CLOSE-DT
      * - facCount600                    COBOL Name: 600-FAC-COUNT
      *
      * @throws CFException
      */
      @Override
      public DisplayMqInfoOutCtx displayMqInfo(DisplayMqInfoInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para displays the mq payload information                  *
// *----------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
DisplayMqInfoOutCtx methodOut = methodIn.getDisplayMqInfoOutCtx();
//  INITIALIZE 600-FRAUD-MQ-DEBUG-DISP 600-FRAUD-MQ-DEBUG-DISP-STR
          methodOut.getFraudMqDebugDisp600().initialize();
          methodOut.setFraudMqDebugDispStr600(CONSTANTS.SPACE_400 /* Fill 400 Spaces*/);
//  MOVE FNS-PLD-RD-PRIMARY-ACCT-NBR TO 600-PRIMARY-ACCT-NO
          methodOut.setPrimaryAcctNo600(methodOut.getFnsPldRdPrimaryAcctNbr());
          // MOVE FNS-PLD-RD-EXPIRATION-DATE TO 600-EXPIR-DATE
          methodOut.setExpirDate600(methodOut.getFnsPldRdExpirationDate().toCharArray());
//  MOVE FNS-PLD-RD-VRTL-ACCT-NUM TO 600-VIRTUAL-ACCT-NO
          methodOut.setVirtualAcctNo600(methodOut.getFnsPldRdVrtlAcctNum());
//  MOVE FNS-PLD-RD-QUERY-NO TO 600-QUERY-NUM
          methodOut.setQueryNum600(methodOut.getFnsPldRdQueryNo());
//  MOVE FNS-PLD-RD-GFT-DSN TO 600-GFT-DSN
          methodOut.setGftDsn600(methodOut.getFnsPldRdGftDsn());
          // MOVE FNS-PLD-RD-LOGICAL-SEQ TO 600-LOGICAL-SEQ
          methodOut.setLogicalSeq600(methodOut.getFnsPldRdLogicalSeq());
//  MOVE FNS-PLD-RD-TXN-NUM TO 600-TXN-NO
          methodOut.setTxnNo600( methodOut.getFnsPldRdTxnNum());
//  MOVE FNS-PAYLOAD-FAA-PAN-STAT-CD TO 600-FAA-PAN-STAT-CD
          methodOut.setFaaPanStatCd600(methodOut.getFnsPayloadFaaPanStatCd());
//  MOVE FNS-PAYLOAD-FAA-CLOSE-DT TO 600-FAA-CLS-DT
          methodOut.setFaaClsDt600(methodOut.getFnsPayloadFaaCloseDt());
//  STRING 600-PRIMARY-ACCT-NO DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-EXPIR-DATE DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-VIRTUAL-ACCT-NO DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-QUERY-NUM DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-GFT-DSN DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-LOGICAL-SEQ DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-TXN-NO DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-FAC-COUNT DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-FAA-PAN-STAT-CD DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-FAA-CLS-DT DELIMITED BY SIZE INTO 600-FRAUD-MQ-DEBUG-DISP-STR
          charArray = new ArrayList<char[]>();
             charArray.add(methodOut.getPrimaryAcctNo600());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(methodOut.getExpirDate600());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(methodOut.getVirtualAcctNo600());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(String.valueOf(methodOut.getQueryNum600String()).toCharArray());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(methodOut.getGftDsn600());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(String.valueOf(methodOut.getLogicalSeq600String()).toCharArray());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(String.valueOf(methodOut.getTxnNo600String()).toCharArray());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(String.valueOf(methodOut.getFacCount600String()).toCharArray());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(methodOut.getFaaPanStatCd600());
             charArray.add(methodIn.getValuePipe300());
             charArray.add(methodOut.getFaaClsDt600());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8),charArray.get(9),charArray.get(10),charArray.get(11),charArray.get(12),charArray.get(13),charArray.get(14),charArray.get(15),charArray.get(16),charArray.get(17),charArray.get(18));
          updated = updateString(methodOut.getFraudMqDebugDispStr600() ,joinCharArray);
          methodOut.setFraudMqDebugDispStr600(  (char[])updated.get("string"));
//  DISPLAY 600-FRAUD-MQ-DEBUG-DISP-STR
          logger.info(new String(methodOut.getFraudMqDebugDispStr600())); 
      
      return methodOut;
      }
      /**
      * callLrmIp648010 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-CALL-LRM-IP648010 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - lrmIoAbendMsg609               COBOL Name: 609-LRM-IO-ABEND-MSG
      * - paraName8500300                COBOL Name: 300-PARA-NAME-8500
      * - invalidRcLrm300                COBOL Name: 300-INVALID-RC-LRM
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - lrmIoAbendMsg609               COBOL Name: 609-LRM-IO-ABEND-MSG
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - paraName8500300                COBOL Name: 300-PARA-NAME-8500
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - invalidRcLrm300                COBOL Name: 300-INVALID-RC-LRM
      *
      * @throws CFException
      */
      @Override
      public CallLrmIp648010OutCtx callLrmIp648010(CallLrmIp648010InCtx methodIn) throws Exception {
      
// *------------------------------------------------------------*
// *This paragraph calls ip648010-long running task services    *
// *module and checks the lrm staus code.                       *
// *------------------------------------------------------------*
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
CallLrmIp648010OutCtx methodOut = methodIn.getCallLrmIp648010OutCtx();
//  CALL 800-PTR-IP648010
          // CALL 800-PTR-IP648010
          	programCtx.setRc( ip648010.process(programCtx.getGlobalCtx().getContext("IP648010")));
//  IF IP64801-88-LRM-STAT-BAD
          if ( methodIn.isIp6480188LrmStatBad()  ) { 
//  MOVE 609-LRM-IO-ABEND-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(100,methodOut.getLrmIoAbendMsg609(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-8500 TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getParaName8500300());
//  MOVE 300-INVALID-RC-LRM TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getInvalidRcLrm300());
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

      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - asterisks300                   COBOL Name: 300-ASTERISKS
      * - abendTxt300                    COBOL Name: 300-ABEND-TXT
      * - abendPgmTxt300                 COBOL Name: 300-ABEND-PGM-TXT
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------
// * This para displays abend message and calls abend routine.
// *----------------------------------------------------------
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
TerminateOnErrorOutCtx methodOut = methodIn.getTerminateOnErrorOutCtx();
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendText900());
//  DISPLAY 300-ASTERISKS
          logger.info(new String(methodIn.getAsterisks300())); 
//  DISPLAY 300-ABEND-TXT
          logger.info(new String(methodIn.getAbendTxt300())); 
//  DISPLAY 300-ABEND-PGM-TXT
          logger.info(new String(methodIn.getAbendPgmTxt300())); 
//  DISPLAY 300-ASTERISKS
          logger.info(new String(methodIn.getAsterisks300())); 
//  DISPLAY 900-ABEND-PARA
          logger.info(methodIn.getAbendPara900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
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
Ip829010Ctx programCtx = methodIn.getIp829010Ctx();
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
      Ip829010Ctx programCtx = (Ip829010Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParms1000().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Ip829010Ctx programCtx = (Ip829010Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parms1000) {
                       	programCtx.setParms1000((Parms1000) parameters[index]);
                  	} else {
                       	programCtx.getParms1000().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromIp282210(Ip829010Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getIp28221PaTableRestart().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getIp28221PaTableRestart().setString((char[])params[0] );
      }
  
  
  
  
  
  }
