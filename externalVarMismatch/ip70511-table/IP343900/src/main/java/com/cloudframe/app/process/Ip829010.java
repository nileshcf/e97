  package com.cloudframe.app.process;
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
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip70711TipamrsKey;
  import com.cloudframe.app.process.Ip996020;
  import com.cloudframe.app.global.sharedvar.Ip70511TableKey;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.process.Ip890110;
  import com.cloudframe.app.process.Ip081110;
  import com.cloudframe.app.global.sharedvar.Ip08101RptInds;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.process.Ip282210;
  import com.cloudframe.app.global.sharedvar.Ip57901TipaqprEntries;
  import com.cloudframe.app.process.Ip703020;
  import com.cloudframe.app.ip829010.file.*;
  import com.cloudframe.app.process.Ip599810;
  import com.cloudframe.app.global.sharedvar.FnsPldRd;
  import com.cloudframe.app.process.Ip708020;
  import com.cloudframe.app.global.sharedvar.Ip70711ResponseData;
  import com.cloudframe.app.process.Ip595210;
  import com.cloudframe.app.process.Ip586010;
  import com.cloudframe.app.global.sharedvar.FnsPldRdFacDataKey;
  import com.cloudframe.app.global.sharedvar.FnsPldRdFacData;
  import com.cloudframe.app.global.sharedvar.Ip50201FaaData;
  import com.cloudframe.app.process.Ip521010;
  import com.cloudframe.app.ip829010.dto.FnsPayloadFacDataKey;
  import com.cloudframe.app.ip829010.dto.FnsPayloadFacData;
  import com.cloudframe.app.global.sharedvar.Ip7052f4ProcDelay;
  import com.cloudframe.app.global.sharedvar.Ip70521ProcDelay;
  import com.cloudframe.app.process.Ip708010;
  import com.cloudframe.app.process.Ip648010;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip829010.dto.*;
  import com.cloudframe.app.ip829010.dto.Parms1000;
  import com.cloudframe.app.ip829010.dto.Ip28221PaTableRestart;
  import com.cloudframe.app.ip829010.dto.AbendMessage900;
  import com.cloudframe.app.ip829010.dto.TipamrsSkipCnt611;
  import com.cloudframe.app.ip829010.dto.MqputFailCnt613;
  import com.cloudframe.app.ip829010.dto.QueueErrorMsg611;
  import com.cloudframe.app.ip829010.dto.QueueVars800;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.ip829010.dto.FaaFacNotFndCnt614;
  import com.cloudframe.app.ip829010.dto.Ip82921ErrMsgOut;
  import com.cloudframe.app.global.sharedvar.Ip70711TipamrsEntries;
  import com.cloudframe.app.ip829010.dto.ErrorMsg6003010;
  import com.cloudframe.app.ip829010.dto.ErrorMsg6003011;
  import com.cloudframe.app.ip829010.dto.FnsPayload;
  import com.cloudframe.app.ip829010.file.records.Sys201ErrMsgOut;
  import com.cloudframe.app.ip829010.dto.MqgetFailCnt612;
  import com.cloudframe.app.ip829010.dto.AbendPara900;
  import com.cloudframe.app.ip829010.dto.ErrorMsg6003012;
  import com.cloudframe.app.ip829010.dto.MqputSkipCnt610;
  import com.cloudframe.app.ip829010.dto.FraudMqDebugDisp600;
  import com.cloudframe.app.ip829010.dto.MrsRowCnt608;
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
  
  public class Ip829010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip829010.class);
  
  private Parms1000 parms1000 = new Parms1000() ;
  private Ip28221PaTableRestart ip28221PaTableRestart = new Ip28221PaTableRestart() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private TipamrsSkipCnt611 tipamrsSkipCnt611 = new TipamrsSkipCnt611() ;
  private MqputFailCnt613 mqputFailCnt613 = new MqputFailCnt613() ;
  private QueueErrorMsg611 queueErrorMsg611 = new QueueErrorMsg611() ;
  private QueueVars800 queueVars800 = new QueueVars800() ;
  private FaaFacNotFndCnt614 faaFacNotFndCnt614 = new FaaFacNotFndCnt614() ;
  private Ip82921ErrMsgOut ip82921ErrMsgOut = new Ip82921ErrMsgOut() ;
  private ErrorMsg6003010 errorMsg6003010 = new ErrorMsg6003010() ;
  private ErrorMsg6003011 errorMsg6003011 = new ErrorMsg6003011() ;
  private FnsPayload fnsPayload = new FnsPayload() ;
  private Sys201ErrMsgOut sys201ErrMsgOut = new Sys201ErrMsgOut() ;
  private MqgetFailCnt612 mqgetFailCnt612 = new MqgetFailCnt612() ;
  private AbendPara900 abendPara900 = new AbendPara900() ;
  private ErrorMsg6003012 errorMsg6003012 = new ErrorMsg6003012() ;
  private MqputSkipCnt610 mqputSkipCnt610 = new MqputSkipCnt610() ;
  private FraudMqDebugDisp600 fraudMqDebugDisp600 = new FraudMqDebugDisp600() ;
  private MrsRowCnt608 mrsRowCnt608 = new MrsRowCnt608() ;
  private Work work = new Work() ;
  
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
  @Autowired 
  @Qualifier("global_fnsPldRd")
  FnsPldRd fnsPldRd;
  @Autowired 
  @Qualifier("global_ip70711TipamrsEntries")
  Ip70711TipamrsEntries ip70711TipamrsEntries;
  @Autowired 
  @Qualifier("global_ip30781TipaccdTable")
  Ip30781TipaccdTable ip30781TipaccdTable;
  @Autowired 
  @Qualifier("global_ip50211Tipafac")
  Ip50211Tipafac ip50211Tipafac;
  @Autowired 
  @Qualifier("global_ip50201Tipafaa")
  Ip50201Tipafaa ip50201Tipafaa;
  @Autowired 
  @Qualifier("global_ip70301AlmPreMqSrvActiveGroup")
  Ip70301AlmPreMqSrvActiveGroup ip70301AlmPreMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301AlmChaMqSrvActiveGroup")
  Ip70301AlmChaMqSrvActiveGroup ip70301AlmChaMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301AlmRspMqSrvActiveGroup")
  Ip70301AlmRspMqSrvActiveGroup ip70301AlmRspMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmtIdnMqSrvActiveGroup")
  Ip70301PmtIdnMqSrvActiveGroup ip70301PmtIdnMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmtRusMqSrvActiveGroup")
  Ip70301PmtRusMqSrvActiveGroup ip70301PmtRusMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmtIndMqSrvActiveGroup")
  Ip70301PmtIndMqSrvActiveGroup ip70301PmtIndMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmaAmsMqSrvActiveGroup")
  Ip70301PmaAmsMqSrvActiveGroup ip70301PmaAmsMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmiAmsMqSrvActiveGroup")
  Ip70301PmiAmsMqSrvActiveGroup ip70301PmiAmsMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PimAmsMqSrvActiveGroup")
  Ip70301PimAmsMqSrvActiveGroup ip70301PimAmsMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmaIndMqSrvActiveGroup")
  Ip70301PmaIndMqSrvActiveGroup ip70301PmaIndMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmiIdnMqSrvActiveGroup")
  Ip70301PmiIdnMqSrvActiveGroup ip70301PmiIdnMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmiRusMqSrvActiveGroup")
  Ip70301PmiRusMqSrvActiveGroup ip70301PmiRusMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PmiIndMqSrvActiveGroup")
  Ip70301PmiIndMqSrvActiveGroup ip70301PmiIndMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PimIdnMqSrvActiveGroup")
  Ip70301PimIdnMqSrvActiveGroup ip70301PimIdnMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PimRusMqSrvActiveGroup")
  Ip70301PimRusMqSrvActiveGroup ip70301PimRusMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PimIndMqSrvActiveGroup")
  Ip70301PimIndMqSrvActiveGroup ip70301PimIndMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip7051f4Table")
  Ip7051f4Table ip7051f4Table;
  @Autowired 
  @Qualifier("global_ip7051f4EntryFoundGroup")
  Ip7051f4EntryFoundGroup ip7051f4EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip7052f4MqApiLayout")
  Ip7052f4MqApiLayout ip7052f4MqApiLayout;
  @Autowired 
  @Qualifier("global_ip70701TipamrqEntries")
  Ip70701TipamrqEntries ip70701TipamrqEntries;
  @Autowired 
  @Qualifier("global_ip89011EnvironmentIndArea")
  Ip89011EnvironmentIndArea ip89011EnvironmentIndArea;
  @Autowired 
  @Qualifier("global_linkVariable800")
  LinkVariable800 linkVariable800;
  
  
  
  
  
  
      public int setParameter(String parms1000) throws Exception {
      		if(parms1000 != null)
      		    this.parms1000.setString(com.cloudframe.app.data.Field.getParm(parms1000),new String(CONSTANTS.EBCDIC_ENCODING));
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
      		if(sys201FnsMqErrFile.hasOpened() && !sys201FnsMqErrFile.isReadOnly()) { 
      			sys201FnsMqErrFile.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph performs an initialization routine, which does
// * the necessary initialization. it performs another routine to
// * perform actual check, at the end, it returns back to the calling
// * program.
// *-----------------------------------------------------------------
//  PERFORM 1000-PERFORM-INITIALIZATION
          performInitialization();/*1000-PERFORM-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-GET-QUEUE-MESSAGES UNTIL IP64801-88-LRM-STAT-END
          while (!(ip64801LrmCommBlock.isIp6480188LrmStatEnd()) ) {
             getQueueMessages();/*2000-GET-QUEUE-MESSAGES*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  IF IP64801-88-LRM-STAT-END
          if ( ip64801LrmCommBlock.isIp6480188LrmStatEnd()  ) { 
//  PERFORM 3000-CLOSE-QUEUE
              closeQueue();/*3000-CLOSE-QUEUE*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  PERFORM 3100-CLOSE-ERR-FILE-SYS201
              closeErrFileSys201();/*3100-CLOSE-ERR-FILE-SYS201*/
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
      private void performInitialization() throws Exception {
      
// *-----------------------------------------------------------------
// * The initialization activities are done in this paragraph,
// * if it is the first time then it performs a routine to display
// * log details and set not-the-first-time indicator to true.
// *-----------------------------------------------------------------
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers();/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-INITIALIZE-VARIABLES
              initializeVariables();/*1300-INITIALIZE-VARIABLES*/
//  PERFORM 9950-UPDATE-EVENT-LOG
              updateEventLog();/*9950-UPDATE-EVENT-LOG*/
//  PERFORM 1400-GET-MQ-RESP-JOB-NAME
              getMqRespJobName();/*1400-GET-MQ-RESP-JOB-NAME*/
//  PERFORM 1500-PROCESS-SYS09E-CTRL-CARD
              processSys09eCtrlCard();/*1500-PROCESS-SYS09E-CTRL-CARD*/
//  PERFORM 1600-PROCESS-RUNCNTL-FILE
              processRuncntlFile();/*1600-PROCESS-RUNCNTL-FILE*/
//  PERFORM 1650-GET-TBL201-INFO
              getTbl201Info();/*1650-GET-TBL201-INFO*/
//  PERFORM 1700-START-LRM
              startLrm();/*1700-START-LRM*/
//  PERFORM 1800-CONNECT-MQ
              connectMq();/*1800-CONNECT-MQ*/
//  PERFORM 1900-OPEN-ERR-FILE-SYS201
              openErrFileSys201();/*1900-OPEN-ERR-FILE-SYS201*/
          }
      
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
      private void displayExecMsgs() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph displays program execution messages.             *
// *----------------------------------------------------------------*
//  MOVE 300-PGM-IP829010 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getPgmIp829010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1388126366));
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
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
      private void setProcedurePointers() throws Exception {
      
// *------------------------------------------------------------
// *This para sets the procedure pointers.
// *------------------------------------------------------------
//  SET 800-ABEND-PTR TO ENTRY 300-ABEND-PGM
          work.setAbendPtr800(work.getAbendPgm300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          work.setPtrIp081110800(work.getPgmIp081110300()); 
          
//  SET 800-PTR-IP282210 TO ENTRY 300-PGM-IP282210
          work.setPtrIp282210800(work.getPgmIp282210300()); 
          
//  SET 800-PTR-IP586010 TO ENTRY 300-PGM-IP586010
          work.setPtrIp586010800(work.getPgmIp586010300()); 
          
//  SET 800-PTR-IP599810 TO ENTRY 300-PGM-IP599810
          work.setPtrIp599810800(work.getPgmIp599810300()); 
          
//  SET 800-PTR-IP595210 TO ENTRY 300-PGM-IP595210
          work.setPtrIp595210800(work.getPgmIp595210300()); 
          
//  SET 800-PTR-IP648010 TO ENTRY 300-PGM-IP648010
          work.setPtrIp648010800(work.getPgmIp648010300()); 
          
//  SET 800-PTR-IP708020 TO ENTRY 300-PGM-IP708020
          work.setPtrIp708020800(work.getPgmIp708020300()); 
          
//  SET 800-PTR-IP703020 TO ENTRY 300-PGM-IP703020
          work.setPtrIp703020800(work.getPgmIp703020300()); 
          
//  SET 800-PTR-IP890110 TO ENTRY 300-PGM-IP890110
          work.setPtrIp890110800(work.getPgmIp890110300()); 
          
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  SET 800-PTR-IP996020 TO ENTRY 300-PGM-IP996020
          work.setPtrIp996020800(work.getPgmIp996020300()); 
          
//  SET 800-PTR-IP521010 TO ENTRY 300-PGM-IP521010
          work.setPtrIp521010800(work.getPgmIp521010300()); 
          
//  SET 800-PTR-IP708010 TO ENTRY 300-PGM-IP708010
          work.setPtrIp708010800(work.getPgmIp708010300()); 
          
      
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
      private void initializeVariables() throws Exception {
			// Declare local variables used in the method
			Ip70711TipamrsKey ip70711TipamrsKey = ip70711TipamrsEntries.getIp70711TipamrsKey();
			Ip70511TableKey ip70511TableKey = ip70511Table.getIp70511TableKey();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para initializes the required variables.
// *-----------------------------------------------------------------
//  SET 88-IP70301-FRAUD-MQ-ACTIVE-N TO TRUE
          ip70301IsFraudMqSrvActiveGroup.setIp70301FraudMqActiveN88True(); 
          
//  MOVE ZEROES TO 800-MQPUT-SKIP-COUNT
          work.setMqputSkipCount800(0);
//  MOVE ZEROES TO 800-TIPAMRS-SKIP-COUNT
          work.setTipamrsSkipCount800(0);
//  MOVE ZEROES TO 800-FAA-FAC-NOT-FND-CNT
          work.setFaaFacNotFndCnt800(0);
//  MOVE ZEROES TO 800-MQGET-FAIL-COUNT
          work.setMqgetFailCount800(0);
//  MOVE ZEROES TO 800-MQPUT-FAIL-COUNT
          work.setMqputFailCount800(0);
//  MOVE SPACES TO IP70711-GFT-DASET-NAM
          ip70711TipamrsKey.setIp70711GftDasetNam(CONSTANTS.SPACE_44);
  
//  CALL 800-PTR-IP996020
          // CALL 800-PTR-IP996020
          	this.setRc( ip996020.process());
          // MOVE IP996021-JOB-NAME TO 800-JOBNAME
          work.setJobname800(ip996021JobInformation.getIp996021JobName());
//  MOVE IP996021-LPAR-NAME TO IP70511-CPU
          ip70511TableKey.setIp70511Cpu(ip996021JobInformation.getIp996021LparName());
  
      
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
      private void getMqRespJobName() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] lnFacreqJobgrpName1000 = null;
			char[] valueFacreq300 = null;
			Map<String,Object> updated = null;
			int lnFacreqJobgrpNum1000 = 0;
			int lnParm911Retry1000 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para retrieves queue response job name. if job name is
// *not provided in jcl, it displays appropriate abend message,
// *populates event error log and calls abend routine.
// *-----------------------------------------------------------------
//  MOVE 1000-LN-MQ-DEBUG-SW TO 800-LN-RESP-DEBUG-IND
          work.setLnRespDebugInd800(parms1000.getLnMqDebugSw1000());
//  STRING 1000-LN-FACREQ-JOBGRP-NAME DELIMITED BY SPACE 1000-LN-FACREQ-JOBGRP-NUM DELIMITED BY SPACE INTO 800-FACREQ-JOBGRP-NAME
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( parms1000.getLnFacreqJobgrpName1000() , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( String.valueOf(parms1000.getLnFacreqJobgrpNum1000String()).toCharArray() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getFacreqJobgrpName800() ,joinCharArray);
          work.setFacreqJobgrpName800(  (char[])updated.get("string"));
//  IF 1000-LN-FACREQ-JOBGRP-NAME = 300-VALUE-FACREQ
          lnFacreqJobgrpName1000 = parms1000.getLnFacreqJobgrpName1000();
          valueFacreq300 = work.getValueFacreq300();
//  ELSE
          if (		compareChars(lnFacreqJobgrpName1000,valueFacreq300) != 0 ) { 
//  MOVE 600-JOB-NAME-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(100,work.getJobNameError600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-1400 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName1400300());
//  MOVE 300-JOBNAME-ERROR-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getJobnameErrorAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
//  IF 1000-LN-FACREQ-JOBGRP-NUM IS NUMERIC AND 1000-LN-FACREQ-JOBGRP-NUM > ZEROS
          lnFacreqJobgrpNum1000 = parms1000.getLnFacreqJobgrpNum1000();
//  ELSE
          if (         !(parms1000.lnFacreqJobgrpNum1000IsNumeric() )  || 	( lnFacreqJobgrpNum1000 <= 0 )) { 
//  MOVE 601-JOB-NUM-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(100,work.getJobNumError601(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-1400 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName1400300());
//  MOVE 300-JOBNUM-ERROR-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getJobnumErrorAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
          lnParm911Retry1000 = parms1000.getLnParm911Retry1000();
//  IF 1000-LN-PARM-911-RETRY IS NUMERIC AND 1000-LN-PARM-911-RETRY > ZEROS
          if (        parms1000.lnParm911Retry1000IsNumeric()  && 	( lnParm911Retry1000 > 0 )) { 
//  MOVE 1000-LN-PARM-911-RETRY TO IP30881-911-RETRY-VALUE
              ip30881Db2McwaitInputValue.setIp30881911RetryValue(parms1000.getLnParm911Retry1000());
          }
  
//  ELSE
          else { 
//  MOVE 602-RETRY-COUNT-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(100,work.getRetryCountError602(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-1400 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName1400300());
//  MOVE 300-RETRY-ERROR-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getRetryErrorAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void processSys09eCtrlCard() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph calls ip890110 module to get environment ind    *
// * 1. to open the sys09e control card.                            *
// * 2. to read the sys09e control card.                            *
// * 3. to close the sys09e control card.                           *
// * passed to mq programs while calling                            *
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP890110
          // CALL 800-PTR-IP890110
          	this.setRc( ip890110.process());
      
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
      private void processRuncntlFile() throws Exception {
			// Declare local variables used in the method
			Ip08101RptInds ip08101RptInds = ip08101RunControlRecord.getIp08101RptInds();
			char[] ip08101RptProcessTime = null;
			long ip08101ProcessDate = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph calls ip081110 module to get run indicator      *
// * 1. to open the run control file.                               *
// * 2. to read the run control file.                               *
// * 3. to close the run control file.                              *
// *----------------------------------------------------------------*
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	this.setRc( ip081110.process());
//  IF RETURN-CODE EQUAL ZEROES
          if (	( getRc() == 0 )) { 
//  MOVE IP08101-RUN-INDICATOR TO IP60001-EVENT-LOG-CONTROL
              ip60001EventLogWorkArea.setIp60001EventLogControl(ip08101RptInds.getIp08101RunIndicator());
  
              ip08101ProcessDate = ip08101RunControlRecord.getIp08101ProcessDate();
//  IF IP08101-PROCESS-DATE NUMERIC
              if (        ip08101RunControlRecord.ip08101ProcessDateIsNumeric() ) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT
                  ip50005ClearingDtTm.setIp50005ClearingDt(String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray());
                  ip08101RptProcessTime = ip08101RunControlRecord.getIp08101RptProcessTime();
//  IF IP08101-RPT-PROCESS-TIME (1 : 2) NUMERIC
                  if (    isNumeric(substring(ip08101RptProcessTime,0,2))) { 
//  MOVE IP08101-RPT-PROCESS-TIME (1 : 2) TO IP50005-CLEARING-TM
                      ip50005ClearingDtTm.replace(ip08101RunControlRecord/*parent*/,44/*fromOffset - (ip50005ClearingTm) */,2/*fromLen*/,8/*toOffset - (ip08101RptProcessTime) */,2/*toLen*/);
                  }
  
//  ELSE
                  else { 
                      // MOVE 14 TO IP50005-CLEARING-TM
                      //  LITERAL_14 = 14
                      ip50005ClearingDtTm.setIp50005ClearingTm(CONSTANTS.LITERAL_14);
                  }
              }
  
//  ELSE
              else { 
//  MOVE FUNCTION CURRENT-DATE (1 : 10) TO IP50005-CLEARING-DT-TM
                  ip50005ClearingDtTm.setString( substring(CFUtil.getCurrentDate(timeZoneId),0,10));
              }
          }
      
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
      private void getTbl201Info() throws Exception {
			// Declare local variables used in the method
			Ip70511TableKey ip70511TableKey = ip70511Table.getIp70511TableKey();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para gets the table 201 information
// *-----------------------------------------------------------------
//  SET 88-IP28221-IP282210-NO-RESTRT TO TRUE
          ip28221PaTableRestart.setIp28221Ip282210NoRestrt88True(); 
          
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               this.setRc( ip282210.call(ip28221PaTableRestart));
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP70511-HOST-PRCSS-AGRMT-ID
          ip70511TableKey.setIp70511HostPrcssAgrmtId(ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId());
  
      
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
      private void startLrm() throws Exception {
      
// *-----------------------------------------------------------------
// *This para starts the lrm module.
// *-----------------------------------------------------------------
//  SET IP64801-88-LRM-STRT-REQ TO TRUE
          ip64801LrmCommBlock.setIp6480188LrmStrtReqTrue(); 
          
//  MOVE 1000-LN-PARM-911-RETRY TO IP30881-911-RETRY-VALUE
          ip30881Db2McwaitInputValue.setIp30881911RetryValue(parms1000.getLnParm911Retry1000());
//  MOVE 1000-LN-FACREQ-JOBGRP-NAME TO IP64801-LRM-JOBGRP-NAME
          ip64801LrmCommBlock.setIp64801LrmJobgrpName(parms1000.getLnFacreqJobgrpName1000());
//  MOVE 1000-LN-FACREQ-JOBGRP-NUM TO IP64801-LRM-JOBGRP-NUM
          ip64801LrmCommBlock.setIp64801LrmJobgrpNum(parms1000.getLnFacreqJobgrpNum1000());
//  PERFORM 8500-CALL-LRM-IP648010
          callLrmIp648010();/*8500-CALL-LRM-IP648010*/
          ;
      
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
      private void connectMq() throws Exception {
			// Declare local variables used in the method
			Ip57901TipaqprEntries ip57901TipaqprEntries = ip57901Tipaqpr.getIp57901TipaqprEntries();
			Ip70511TableKey ip70511TableKey = ip70511Table.getIp70511TableKey();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This para calls ip703020 to connect/open queues                 *
// *----------------------------------------------------------------*
//  INITIALIZE 800-QUEUE-VARS
          queueVars800.initialize();
//  MOVE 1000-LN-FACREQ-JOBGRP-NAME TO 800-LN-FACREQ-JOBGRP-NAME IP57901-JOB-GROUP
          linkVariable800.setLnFacreqJobgrpName800(parms1000.getLnFacreqJobgrpName1000());
          ip57901TipaqprEntries.setIp57901JobGroup(parms1000.getLnFacreqJobgrpName1000());
  
//  MOVE 1000-LN-FACREQ-JOBGRP-NUM TO 800-LN-FACREQ-JOBGRP-NUM IP57901-JOB-GRP-NUM
          linkVariable800.setLnFacreqJobgrpNum800(String.valueOf(parms1000.getLnFacreqJobgrpNum1000String()).toCharArray());
          ip57901TipaqprEntries.setIp57901JobGrpNum( parms1000.getLnFacreqJobgrpNum1000());
  
//  MOVE 1000-LN-CLONE-OWNER-ID TO 800-LN-CLONE-OWNER-ID IP70511-CLONE-OWNER-ID
          linkVariable800.setLnCloneOwnerId800(parms1000.getLnCloneOwnerId1000());
          ip70511TableKey.setIp70511CloneOwnerId(parms1000.getLnCloneOwnerId1000());
  
//  MOVE IP89011-ENVIRONMENT TO IP70511-ENV-CD
          ip70511TableKey.setIp70511EnvCd(ip89011EnvironmentIndArea.getIp89011Environment());
  

// * Populating common parameters for mq connect and open
//  SET 88-IP34051-REQUEST-START TO TRUE
          ip34051MqProcessParameters.setIp34051RequestStart88True(); 
          
//  SET 88-IP34051-IP545110-N TO TRUE
          ip34051MqProcessParameters.setIp34051Ip545110N88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-Y TO TRUE
          ip34051MqProcessParameters.setIp34051TipacliActiveY88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-Y TO TRUE
          ip34051MqProcessParameters.setIp34051TipasvcActiveY88True(); 
          

// * For fraudulent request queue:
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
          ip34051MqProcessParameters.setIp34051ServCdFra88True(); 
          
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
          ip34051MqProcessParameters.setIp34051FuncCdCha88True(); 
          
//  IF 88-IP02015-HOST-PA-GLOBAL
          if ( ip02015PrcssAgrmtTable.isIp02015HostPaGlobal88()  ) { 
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RespnseQ88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	this.setRc( ip703020.process());
//  MOVE IP7052F4-TARGET-QMGR-NAME TO 800-RES-QMGR-NAME
              queueVars800.setResQmgrName800(ip7052f4MqApiLayout.getIp7052f4TargetQmgrName());
//  MOVE IP7052F4-TARGET-Q-NAME TO 800-RES-Q-NAME
              queueVars800.setResQName800(ip7052f4MqApiLayout.getIp7052f4TargetQName());
//  MOVE IP7052F4-HCONN TO 800-RES-HCONN
              queueVars800.setResHconn800(ip7052f4MqApiLayout.getIp7052f4Hconn());
//  MOVE IP7052F4-HOBJ TO 800-RES-HOBJ
              queueVars800.setResHobj800(ip7052f4MqApiLayout.getIp7052f4Hobj());
          }
//  ELSE
          else { 
//  SET 88-IP34051-REQUEST-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RequestQ88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	this.setRc( ip703020.process());
//  MOVE IP7052F4-QMGR-NAME TO 800-REQ-QMGR-NAME
              queueVars800.setReqQmgrName800(ip7052f4MqApiLayout.getIp7052f4QmgrName());
//  MOVE IP7052F4-Q-NAME TO 800-REQ-Q-NAME
              queueVars800.setReqQName800(ip7052f4MqApiLayout.getIp7052f4QName());
//  MOVE IP7052F4-HCONN TO 800-REQ-HCONN
              queueVars800.setReqHconn800(ip7052f4MqApiLayout.getIp7052f4Hconn());
//  MOVE IP7052F4-HOBJ TO 800-REQ-HOBJ
              queueVars800.setReqHobj800(ip7052f4MqApiLayout.getIp7052f4Hobj());
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RespnseQ88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	this.setRc( ip703020.process());
//  MOVE IP7052F4-TARGET-QMGR-NAME TO 800-RES-QMGR-NAME
              queueVars800.setResQmgrName800(ip7052f4MqApiLayout.getIp7052f4TargetQmgrName());
//  MOVE IP7052F4-TARGET-Q-NAME TO 800-RES-Q-NAME
              queueVars800.setResQName800(ip7052f4MqApiLayout.getIp7052f4TargetQName());
//  MOVE IP7052F4-HCONN TO 800-RES-HCONN
              queueVars800.setResHconn800(ip7052f4MqApiLayout.getIp7052f4Hconn());
//  MOVE IP7052F4-HOBJ TO 800-RES-HOBJ
              queueVars800.setResHobj800(ip7052f4MqApiLayout.getIp7052f4Hobj());
          }
      
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
      private void openErrFileSys201() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens the output mq error sys201 file
// *-----------------------------------------------------------------
//  OPEN OUTPUT SYS201-FNS-MQ-ERR-FILE
          sys201FnsMqErrFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201FnsMqErrFile.getFileName(),sys201FnsMqErrFile.getSys201FnsMqErrFileCharSet(),sys201FnsMqErrFile.getSys201FnsMqErrFileCrlfFlag());
          work.setSys201Status800(sys201FnsMqErrFile.getStatusString() );
//  IF NOT 800-88-SYS201-IO-GOOD
          if (!(work.isSys201IoGood80088()) ) { 
//  MOVE 300-SYS201 TO 600-3010-FILE-DD
              errorMsg6003010.setFileDd6003010(pad(8,work.getSys201300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-SYS201-STATUS TO 600-3010-FILE-STAT
              errorMsg6003010.setFileStat6003010(work.getSys201Status800());
//  MOVE 300-3010-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getAbendCode3003010());
              // MOVE 600-3010-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003010.toCharArray());
//  MOVE 300-PARA-NAME-1900 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName1900300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void getQueueMessages() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph calls the routine to
// *1.get mq response code from tipaccd table
// *3.call lrm module
// *-----------------------------------------------------------------
//  PERFORM 8500-CALL-LRM-IP648010
          callLrmIp648010();/*8500-CALL-LRM-IP648010*/
//  IF IP64801-88-LRM-STAT-AOK
          if ( ip64801LrmCommBlock.isIp6480188LrmStatAok()  ) { 
//  IF 88-IP70301-FRAUD-MQ-ACTIVE-Y
              if ( ip70301IsFraudMqSrvActiveGroup.isIp70301FraudMqActiveY88()  ) { 
//  MOVE IP7051F4-MQ-BYPASS-SW TO IP70511-MQ-BYPASS-SW
                  ip70511Table.setIp70511MqBypassSw(ip7051f4Table.getIp7051f4MqBypassSw());
//  IF IP70511-MQ-BYPASS-N
                  if ( ip70511Table.isIp70511MqBypassN()  ) { 
//  PERFORM 2200-PROCESS-FNS-TXNS
                      processFnsTxns();/*2200-PROCESS-FNS-TXNS*/
                  }
              }
          }
      
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
      private void processFnsTxns() throws Exception {
			// Declare local variables used in the method
			int ip70521CompCd = 0;
			int mqFailCodeOne300 = 0;
			// End of variable declaration

      
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
//  SET 88-100-MQ-RESP-Y TO TRUE
          work.setMqRespY88100True(); 
          
//  SET 88-100-GET-FAA-FAC TO TRUE
          checkGetQueueGroup100.setGetFaaFac88100True(); 
          
//  SET 88-100-START-BROWSE TO TRUE
          getBrowseCallsGroup100.setStartBrowse88100True(); 
          
//  SET 88-IP70521-GET TO TRUE
          ip70521MqApiLayout.setIp70521Get88True(); 
          
//  MOVE LENGTH OF FNS-PAYLOAD TO 800-END
          work.setEnd800(FnsPayload.getFnsPayloadFieldLength());
//  PERFORM UNTIL 88-100-MQ-RESP-N
          while ((!(work.isMqRespN88100()) )) {
//  PERFORM 2400-SETUP-Q-PARMS-FRAUD
              setupQParmsFraud();/*2400-SETUP-Q-PARMS-FRAUD*/
//  PERFORM 2410-CALL-MQGETAPI-FOR-READ
              callMqgetapiForRead();/*2410-CALL-MQGETAPI-FOR-READ*/
//  IF 88-IP70521-NO-MSG-AVAILABLE OR ( IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE-ONE AND 88-IP70521-MQ-RETURN-N )
//  IF 88-IP02015-HOST-PA-GLOBAL
              if ( ip02015PrcssAgrmtTable.isIp02015HostPaGlobal88()  ) { 
//  PERFORM 2500-VALIDATE-QUEUE-DATA
                  validateQueueData();/*2500-VALIDATE-QUEUE-DATA*/
//  IF 88-800-SKIP-FLAG-N
                  if ( work.isSkipFlagN88800()  ) { 
//  PERFORM 2425-PREP-TIPAMRS-INSERT
                      prepTipamrsInsert();/*2425-PREP-TIPAMRS-INSERT*/
//  PERFORM 2430-TIPAMRS-INSERT
                      tipamrsInsert();/*2430-TIPAMRS-INSERT*/
                  }
//  ELSE
                  else { 
//  ADD +1 TO 800-TIPAMRS-SKIP-COUNT
                      work.setTipamrsSkipCount800(work.getTipamrsSkipCount800()+1);
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
                      writeErrFileSys201();/*2800-WRITE-ERR-FILE-SYS201*/
                  }
              }
//  ELSE
              else { 
//  PERFORM 2500-VALIDATE-QUEUE-DATA
                  validateQueueData();/*2500-VALIDATE-QUEUE-DATA*/
//  IF 88-800-SKIP-FLAG-N
                  if ( work.isSkipFlagN88800()  ) { 
//  PERFORM 2550-INDIA-FRAUD-TABLE-LOOKUP
                      indiaFraudTableLookup();/*2550-INDIA-FRAUD-TABLE-LOOKUP*/
//  PERFORM 2600-POPULATE-MQPUT-FIELDS
                      populateMqputFields();/*2600-POPULATE-MQPUT-FIELDS*/
//  PERFORM 2610-MQPUT-FRAUD-TRANS
                      mqputFraudTrans();/*2610-MQPUT-FRAUD-TRANS*/
//  PERFORM 2700-SET-MQ-GET
                      setMqGet();/*2700-SET-MQ-GET*/
                  }
//  ELSE
                  else { 
//  ADD +1 TO 800-MQPUT-SKIP-COUNT
                      work.setMqputSkipCount800(work.getMqputSkipCount800()+1);
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
                      writeErrFileSys201();/*2800-WRITE-ERR-FILE-SYS201*/
                  }
              }
          }
//  IF 88-IP02015-HOST-PA-GLOBAL
          if ( ip02015PrcssAgrmtTable.isIp02015HostPaGlobal88()  ) { 
//  CALL 800-PTR-IP599810
              // CALL 800-PTR-IP599810
              	this.setRc( ip599810.process());
          }
      
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
      private void setupQParmsFraud() throws Exception {
      
// *----------------------------------------------------------------*
// * This para sets up ip70521 parameters before calling get api
// *----------------------------------------------------------------*
//  MOVE IP70511-MQ-BYPASS-SW TO IP70521-MQ-BYPASS-SW
          ip70521MqApiLayout.setIp70521MqBypassSw(ip70511Table.getIp70511MqBypassSw());
//  MOVE LENGTH OF FNS-PLD-RD TO IP70521-MSG-BUFFER-LEN
          ip70521MqApiLayout.setIp70521MsgBufferLen(FnsPldRd.getFnsPldRdFieldLength());
//  MOVE 800-RES-HCONN TO IP70521-HCONN
          ip70521MqApiLayout.setIp70521Hconn(queueVars800.getResHconn800());
//  MOVE 800-RES-HOBJ TO IP70521-HOBJ
          ip70521MqApiLayout.setIp70521Hobj(queueVars800.getResHobj800());
//  MOVE 800-RES-QMGR-NAME TO IP70521-TARGET-QMGR-NAME
          ip70521MqApiLayout.setIp70521TargetQmgrName(queueVars800.getResQmgrName800());
//  MOVE 800-RES-Q-NAME TO IP70521-TARGET-Q-NAME
          ip70521MqApiLayout.setIp70521TargetQName(queueVars800.getResQName800());
//  MOVE SPACES TO IP70521-MSG-BUFFER
          ip70521MqApiLayout.setIp70521MsgBuffer(CONSTANTS.SPACE_4000000);
      
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
      private void callMqgetapiForRead() throws Exception {
			// Declare local variables used in the method
			Ip08101RptInds ip08101RptInds = ip08101RunControlRecord.getIp08101RptInds();
			char[] ip08101RunIndicator = null;
			char[] valueTest300 = null;
			int ip70521CompCd = 0;
			int mqFailCode300 = 0;
			// End of variable declaration

      
// *--------------------------------------------------------------
// *This paragraph calls the mq get api to read mq responses from
// *queue.
// *--------------------------------------------------------------
//  SET 88-IP70521-MQ-RETURN-Y TO TRUE
          ip70521MqApiLayout.setIp70521MqReturnY88True(); 
          
//  SET 88-100-GET-FAA-FAC TO TRUE
          checkGetQueueGroup100.setGetFaaFac88100True(); 
          
//  SET 88-IP70521-GET TO TRUE
          ip70521MqApiLayout.setIp70521Get88True(); 
          
//  INITIALIZE FNS-PLD-RD
          fnsPldRd.initialize();
//  CALL 800-PTR-IP708020
          // CALL 800-PTR-IP708020
          	this.setRc( ip708020.process());
//  IF 88-IP70521-NO-MSG-AVAILABLE
          if ( ip70521MqApiLayout.isIp70521NoMsgAvailable88()  ) { 
//  SET 88-100-MQ-RESP-N TO TRUE
              work.setMqRespN88100True(); 
              
          }
//  ELSE
          else { 
//  IF 88-IP70521-MQ-RETURN-Y
              if ( ip70521MqApiLayout.isIp70521MqReturnY88()  ) { 

// *    Extract the mq info into payload layout
//  MOVE IP70521-MSG-BUFFER ( 300-VALUE-1 : 800-END ) TO FNS-PLD-RD
                  fnsPldRd.replace(ip70521MqApiLayout/*parent*/,252+work.getValue1300() - 1/*fromOffset - (fnsPldRd) */,work.getEnd800()/*fromLen*/,0/*toOffset - (ip70521MsgBuffer) */,222/*toLen*/);
                  valueTest300 = work.getValueTest300();
                  ip08101RunIndicator = ip08101RptInds.getIp08101RunIndicator();
//  IF 88-800-RESP-DEBUG-IND-Y AND IP08101-RUN-INDICATOR EQUAL 300-VALUE-TEST
                  if ( work.isRespDebugIndY88800()   && 		compareChars(ip08101RunIndicator,valueTest300) == 0 ) { 
//  PERFORM 8100-DISPLAY-MQ-INFO
                      displayMqInfo();/*8100-DISPLAY-MQ-INFO*/
                  }
  
              }
//  ELSE
              else { 
//  ADD +1 TO 800-MQGET-FAIL-COUNT
                  work.setMqgetFailCount800(work.getMqgetFailCount800()+1);
//  MOVE 300-MQGET-FAIL-MSG TO IP82921-ERR-MSG
                  ip82921ErrMsgOut.setIp82921ErrMsg(work.getMqgetFailMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
                  writeErrFileSys201();/*2800-WRITE-ERR-FILE-SYS201*/
                  mqFailCode300 = work.getMqFailCode300();
                  ip70521CompCd = ip70521MqApiLayout.getIp70521CompCd();
//  IF IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE
                  if (	( ip70521CompCd == mqFailCode300 )) { 
//  MOVE IP70521-RESN-CD TO 611-BAD-REASON-CODE
                      queueErrorMsg611.setBadReasonCode611( ip70521MqApiLayout.getIp70521ResnCd());
//  SET 88-611-ERR-GET TO TRUE
                      queueErrorMsg611.setErrGet88611True(); 
                      
//  MOVE 300-PARA-NAME-2410 TO 900-ABEND-PARA-NAME
                      abendPara900.setAbendParaName900(work.getParaName2410300());
//  MOVE 300-GET-Q-ABEND-CODE TO 900-ABEND-CODE
                      abendMessage900.setAbendCode900(work.getGetQAbendCode300());
                      // MOVE 611-QUEUE-ERROR-MSG TO 900-ABEND-TEXT
                      abendMessage900.setAbendText900(queueErrorMsg611.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                      terminateOnError();/*9000-TERMINATE-ON-ERROR*/
                  }
  
              }
          }
      
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
      private void prepTipamrsInsert() throws Exception {
			// Declare local variables used in the method
			Ip70711TipamrsKey ip70711TipamrsKey = ip70711TipamrsEntries.getIp70711TipamrsKey();
			Ip70711ResponseData ip70711ResponseData = ip70711TipamrsEntries.getIp70711ResponseData();
			// End of variable declaration

      
// *--------------------------------------------------------------
// *This paragraph populates variables for tipamrs insert
// *--------------------------------------------------------------
//  INITIALIZE IP70711-TIPAMRS-ENTRIES
          ip70711TipamrsEntries.initialize();
//  MOVE FNS-PLD-RD-GFT-DSN TO IP70711-GFT-DASET-NAM
          ip70711TipamrsKey.setIp70711GftDasetNam(fnsPldRd.getFnsPldRdGftDsn());
  
//  MOVE FNS-PLD-RD-LOGICAL-SEQ TO IP70711-FILE-SEQ-NUM
          ip70711TipamrsKey.setIp70711FileSeqNum(fnsPldRd.getFnsPldRdLogicalSeq());
  
//  MOVE FNS-PLD-RD-TXN-NUM TO IP70711-TXN-NUM
          ip70711TipamrsKey.setIp70711TxnNum(fnsPldRd.getFnsPldRdTxnNum());
  
//  MOVE IP34051-SERV-CD TO IP70711-SERV-CD
          ip70711TipamrsKey.setIp70711ServCd(ip34051MqProcessParameters.getIp34051ServCd());
  
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP70711-STRT-JOB-NUM
          ip70711ResponseData.setIp70711StrtJobNum(String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray());
  
//  MOVE IP70521-MQ-TIMESTAMP TO IP70711-STRT-TS
          ip70711ResponseData.setIp70711StrtTs(ip70521MqApiLayout.getIp70521MqTimestamp());
  
//  MOVE 300-VALUE-C TO IP70711-STAT-CD
          ip70711ResponseData.setIp70711StatCd(work.getValueC300());
  
//  PERFORM 2426-GET-MQ-RESP-CD
          getMqRespCd();/*2426-GET-MQ-RESP-CD*/
//  MOVE 800-MQ-RESP-CD TO IP70711-MQ-RESP-CD
          ip70711ResponseData.setIp70711MqRespCd(work.getMqRespCd800());
  
//  MOVE SPACES TO IP70711-RESP-DATA-TXT
          ip70711ResponseData.setIp70711RespDataTxt(CONSTANTS.SPACE_2000);
  
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP70711-JOB-GRP-ID
          ip70711ResponseData.setIp70711JobGrpId(ip64801LrmCommBlock.getIp64801LrmJobgrpName());
  
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP70711-JOB-GRP-NUM
          ip70711ResponseData.setIp70711JobGrpNum(ip64801LrmCommBlock.getIp64801LrmJobgrpNum());
  
//  MOVE IP70521-MSG-BUFFER-LEN TO IP70711-RESP-DATA-TXT-LEN
          ip70711ResponseData.setIp70711RespDataTxtLen((short) ip70521MqApiLayout.getIp70521MsgBufferLen());
  
//  MOVE IP70521-MSG-BUFFER ( 300-VALUE-1 : 800-END ) TO IP70711-RESP-DATA-TXT
          ip70711TipamrsEntries.replace(ip70521MqApiLayout/*parent*/,252+work.getValue1300() - 1/*fromOffset - (ip70711RespDataTxt) */,work.getEnd800()/*fromLen*/,103/*toOffset - (ip70521MsgBuffer) */,2000/*toLen*/);
  
      
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
      private void getMqRespCd() throws Exception {
			// Declare local variables used in the method
			int clrCyclId800 = 0;
			int prevClrCyclId800 = 0;
			int value99300 = 0;
			short ip30781ClrCyclId = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph moves query number to the corresponding field in *
// *the external copybook ip304101 and sets the select switch.      *
// *it calls db2 api ip595210, to get the mq response code from     *
// *tipaccd table                                                   *
// *----------------------------------------------------------------*

// *Ip703020 extracts the clr-cycl-id from tipacli
//  MOVE IP30771-CLR-CYCL-ID TO 800-CLR-CYCL-ID
          work.setClrCyclId800(ip30771TipacliTable.getIp30771ClrCyclId());
          prevClrCyclId800 = work.getPrevClrCyclId800();
          clrCyclId800 = work.getClrCyclId800();
//  IF 800-CLR-CYCL-ID NOT EQUAL TO 800-PREV-CLR-CYCL-ID
          if (	( clrCyclId800 != prevClrCyclId800 )) { 
//  MOVE 800-CLR-CYCL-ID TO 800-PREV-CLR-CYCL-ID
              work.setPrevClrCyclId800(work.getClrCyclId800());
          }
  
//  SET 88-100-OPEN-FIRST-TIME TO TRUE
          apiLayout.setOpenFirstTime88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  MOVE 300-QUERY-NO-SEVEN TO QUERY-NO
          apiLayout.setQueryNo(work.getQueryNoSeven300());
//  MOVE 800-CLR-CYCL-ID TO IP30781-CLR-CYCL-ID
          ip30781TipaccdTable.setIp30781ClrCyclId( work.getClrCyclId800());
          value99300 = work.getValue99300();
//  IF IP30781-CLR-CYCL-ID = 300-VALUE-99
          if (	( ip30781TipaccdTable.getIp30781ClrCyclId() == value99300 ) ) { 
//  MOVE 300-VALUE-7 TO IP30781-CLR-CYCL-ID
              ip30781TipaccdTable.setIp30781ClrCyclId( work.getValue7300());
          }
  
//  CALL 800-PTR-IP595210
          // CALL 800-PTR-IP595210
          	this.setRc( ip595210.process());
//  IF 88-100-ROWS-FOUND
          if ( apiLayout.isRowsFound88100()  ) { 
              // MOVE IP30781-MQ-RESP-CD TO 800-MQ-RESP-CD
              work.setMqRespCd800(ip30781TipaccdTable.getIp30781MqRespCd());
          }
//  ELSE
          else { 
//  MOVE 300-PARA-NAME-2426 TO 900-ABEND-PARA
              abendPara900.setString(pad(42,work.getParaName2426300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-GET-MQ-RSP-CD-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getGetMqRspCdAbendCode300());
//  MOVE 604-ROWS-NOT-FOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(100,work.getRowsNotFoundErrMsgTxt604(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void tipamrsInsert() throws Exception {
      
// *----------------------------------------------------------------*
// * This para populates action code and query number for db2 api,  *
// * ip586010 for queue response table (tipamrs) to insert response *
// * record. if record to be inserted is duplicate, continue.       *
// *----------------------------------------------------------------*
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  SET 88-100-INSERT-RTN TO TRUE
          apiLayout.setInsertRtn88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue1300());
//  CALL 800-PTR-IP586010
          // CALL 800-PTR-IP586010
          	this.setRc( ip586010.process());
//  EVALUATE TRUE
          if  ( apiLayout.isDuplicateCode88100()  ) { 
//  ADD +1 TO 800-TIPAMRS-SKIP-COUNT
              work.setTipamrsSkipCount800(work.getTipamrsSkipCount800()+1);
//  MOVE 300-TIPMRS-DUPL-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getTipmrsDuplMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201();/*2800-WRITE-ERR-FILE-SYS201*/
          }
          else if  ( apiLayout.isRowsFound88100()  ) { 
//  ADD 300-VALUE-1 TO 800-MRS-ISRT-COUNT
              work.setMrsIsrtCount800(work.getMrsIsrtCount800()+work.getValue1300());
          }
          else   { 
//  ADD +1 TO 800-TIPAMRS-SKIP-COUNT
              work.setTipamrsSkipCount800(work.getTipamrsSkipCount800()+1);
//  MOVE 300-INSERT-MRS-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getInsertMrsAbendCode300());
//  MOVE 605-TIPAMRS-INSERT-FAILURE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(100,work.getTipamrsInsertFailure605(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-2430-1 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName24301300());
//  MOVE 300-TIPMRS-FAIL-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getTipmrsFailMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201();/*2800-WRITE-ERR-FILE-SYS201*/
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void validateQueueData() throws Exception {
			// Declare local variables used in the method
			FnsPldRdFacDataKey fnsPldRdFacDataKey = fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey();
			char[] fnsPldRdPrimaryAcctNbr = null;
			FnsPldRdFacData fnsPldRdFacData = fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This para reads the fraudulent transactions from the queue and  *
// *prepares the key for faa fac table lookup. skip records which   *
// *are having junk values/high/low-values.                         *
// *----------------------------------------------------------------*
//  INITIALIZE IP82921-ERR-MSG-OUT
          ip82921ErrMsgOut.initialize();
//  SET 88-800-SKIP-FLAG-N TO TRUE
          work.setSkipFlagN88800True(); 
          
          fnsPldRdPrimaryAcctNbr = fnsPldRdFacDataKey.getFnsPldRdPrimaryAcctNbr();
//  IF ( FNS-PLD-RD-PRIMARY-ACCT-NBR EQUAL LOW-VALUES OR SPACES OR HIGH-VALUES )
          if ((			( checkLowValue(fnsPldRdPrimaryAcctNbr) )  ||         ( allSpaces(fnsPldRdPrimaryAcctNbr)   ) || ( isHighValue(fnsPldRdPrimaryAcctNbr) ) )) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              work.setSkipFlagY88800True(); 
              
//  MOVE 300-PAN-INVALID-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getPanInvalidMsg300());
          }
  
//  IF ( ( FNS-PLD-RD-EXPIRATION-DATE EQUAL LOW-VALUES OR HIGH-VALUES ) AND ( 88-800-SKIP-FLAG-N ))
          if ((((			( checkLowValue(fnsPldRdFacDataKey.getFnsPldRdExpirationDate()) )  || ( isHighValue(fnsPldRdFacDataKey.getFnsPldRdExpirationDate()) ) )) && (( work.isSkipFlagN88800()  )))) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              work.setSkipFlagY88800True(); 
              
//  MOVE 300-EXP-INVALID-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getExpInvalidMsg300());
          }
  
//  IF ( ( FNS-PLD-RD-VRTL-ACCT-NUM EQUAL LOW-VALUES OR HIGH-VALUES ) AND ( 88-800-SKIP-FLAG-N ))
          if ((((			( checkLowValue(fnsPldRdFacData.getFnsPldRdVrtlAcctNum()) )  || ( isHighValue(fnsPldRdFacData.getFnsPldRdVrtlAcctNum()) ) )) && (( work.isSkipFlagN88800()  )))) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              work.setSkipFlagY88800True(); 
              
//  MOVE 300-VAN-INVALID-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getVanInvalidMsg300());
          }
  
//  IF ( ( FNS-PLD-RD-GFT-DSN EQUAL LOW-VALUES OR HIGH-VALUES OR SPACES) AND ( 88-800-SKIP-FLAG-N ))
          if ((((			( checkLowValue(fnsPldRd.getFnsPldRdGftDsn()) )  || ( isHighValue(fnsPldRd.getFnsPldRdGftDsn()) )  ||         ( allSpaces(fnsPldRd.getFnsPldRdGftDsn())   ))) && (( work.isSkipFlagN88800()  )))) { 
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              work.setSkipFlagY88800True(); 
              
//  MOVE 300-GFT-INVALID-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getGftInvalidMsg300());
          }
//  IF ( ( FNS-PLD-RD-TXN-NUM IS NOT NUMERIC) AND ( 88-800-SKIP-FLAG-N ))
          if ((((         !(fnsPldRd.fnsPldRdTxnNumIsNumeric() ) )) && (( work.isSkipFlagN88800()  )))) { 
//  MOVE 300-TXN-INVALID-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getTxnInvalidMsg300());
//  SET 88-800-SKIP-FLAG-Y TO TRUE
              work.setSkipFlagY88800True(); 
              
          }
      
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
      private void indiaFraudTableLookup() throws Exception {
			// Declare local variables used in the method
			FnsPldRdFacDataKey fnsPldRdFacDataKey = fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey();
			Ip50201FaaData ip50201FaaData = ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData();
			FnsPldRdFacData fnsPldRdFacData = fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData();
			char[] ip50201AccntStatus = null;
			char[] valueClosed300 = null;
			FnsPayloadFacDataKey fnsPayloadFacDataKey = fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey();
			FnsPayloadFacData fnsPayloadFacData = fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This para reads the fraudulent transactions from the queue and  *
// *get the fac count,faa close dt,pan status cd and put it in the  *
// *----------------------------------------------------------------*
//  INITIALIZE FNS-PAYLOAD
          fnsPayload.initialize();
//  MOVE FNS-PLD-RD-QUERY-NO TO QUERY-NO
          apiLayout.setQueryNo(fnsPldRd.getFnsPldRdQueryNo());
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          

// *    Populate the key variables to call tipafac db2 api
//  MOVE FNS-PLD-RD-PRIMARY-ACCT-NBR TO IP50201-PRIMARY-ACCT-NBR
          ip50201FaaData.setIp50201PrimaryAcctNbr(fnsPldRdFacDataKey.getFnsPldRdPrimaryAcctNbr());
  
          // MOVE FNS-PLD-RD-EXPIRATION-DATE TO IP50201-EXPIRATION-DATE
          ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201ExpirationDate().setString(fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate().getCharArray());
  
//  MOVE FNS-PLD-RD-VRTL-ACCT-NUM TO IP50201-VRTL-ACCT-NUM
          ip50201FaaData.setIp50201VrtlAcctNum(fnsPldRdFacData.getFnsPldRdVrtlAcctNum());
  
//  CALL 800-PTR-IP521010
          // CALL 800-PTR-IP521010
          	this.setRc( ip521010.process());

// *    Populate fac count, faa stat cd, faa close dt
//  IF 88-100-ROWS-FOUND
          if ( apiLayout.isRowsFound88100()  ) { 
//  MOVE NO-OF-ROWS TO FNS-PAYLOAD-FAC-COUNT
              fnsPayload.setFnsPayloadFacCount((short) apiLayout.getNoOfRows());
//  MOVE IP50201-ACCNT-STATUS TO FNS-PAYLOAD-FAA-PAN-STAT-CD
              fnsPayload.setFnsPayloadFaaPanStatCd(ip50201FaaData.getIp50201AccntStatus());
  
              ip50201AccntStatus = ip50201FaaData.getIp50201AccntStatus();
              valueClosed300 = work.getValueClosed300();
//  IF IP50201-ACCNT-STATUS EQUAL TO 300-VALUE-CLOSED
              if (		compareChars(ip50201AccntStatus,valueClosed300) == 0 ) { 
                  // MOVE IP50201-CLOSED-DATE TO FNS-PAYLOAD-FAA-CLOSE-DT
                  fnsPayload.setFnsPayloadFaaCloseDt(ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201ClosedDate().toCharArray());
  
              }
  
//  ELSE
              else { 
//  MOVE SPACES TO FNS-PAYLOAD-FAA-CLOSE-DT
                  fnsPayload.setFnsPayloadFaaCloseDt(CONSTANTS.SPACE_10);
              }
          }
//  ELSE
          else { 
//  ADD +1 TO 800-FAA-FAC-NOT-FND-CNT
              work.setFaaFacNotFndCnt800(work.getFaaFacNotFndCnt800()+1);
//  MOVE ZEROES TO FNS-PAYLOAD-FAC-COUNT
              fnsPayload.setFnsPayloadFacCount((short) 0);
//  MOVE 300-FAC-NOT-FOUND-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getFacNotFoundMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201();/*2800-WRITE-ERR-FILE-SYS201*/
          }

// *    Populate the key variables for mqput
//  MOVE FNS-PLD-RD-PRIMARY-ACCT-NBR TO FNS-PAYLOAD-PRIMARY-ACCT-NBR
          fnsPayloadFacDataKey.setFnsPayloadPrimaryAcctNbr(fnsPldRdFacDataKey.getFnsPldRdPrimaryAcctNbr());
  
          // MOVE FNS-PLD-RD-EXPIRATION-DATE TO FNS-PAYLOAD-EXPIRATION-DATE
          fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().getFnsPayloadExpirationDate().setString(fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate().getCharArray());
  
//  MOVE FNS-PLD-RD-VRTL-ACCT-NUM TO FNS-PAYLOAD-VRTL-ACCT-NUM
          fnsPayloadFacData.setFnsPayloadVrtlAcctNum(fnsPldRdFacData.getFnsPldRdVrtlAcctNum());
  
//  MOVE FNS-PLD-RD-QUERY-NO TO FNS-PAYLOAD-QUERY-NO
          fnsPayload.setFnsPayloadQueryNo(fnsPldRd.getFnsPldRdQueryNo());
//  MOVE FNS-PLD-RD-GFT-DSN TO FNS-PAYLOAD-GFT-DSN
          fnsPayload.setFnsPayloadGftDsn(fnsPldRd.getFnsPldRdGftDsn());
//  MOVE FNS-PLD-RD-LOGICAL-SEQ TO FNS-PAYLOAD-LOGICAL-SEQ
          fnsPayload.setFnsPayloadLogicalSeq(fnsPldRd.getFnsPldRdLogicalSeq());
//  MOVE FNS-PLD-RD-TXN-NUM TO FNS-PAYLOAD-TXN-NUM
          fnsPayload.setFnsPayloadTxnNum(fnsPldRd.getFnsPldRdTxnNum());
      
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
      private void populateMqputFields() throws Exception {
			// Declare local variables used in the method
			Ip7052f4ProcDelay ip7052f4ProcDelay = ip7052f4MqApiLayout.getIp7052f4ProcDelay();
			Ip70521ProcDelay ip70521ProcDelay = ip70521MqApiLayout.getIp70521ProcDelay();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This para populate fields for mq put operation                  *
// *----------------------------------------------------------------*
//  MOVE LENGTH OF FNS-PAYLOAD TO 800-END IP70521-MSG-BUFFER-LEN
          work.setEnd800(FnsPayload.getFnsPayloadFieldLength());
          ip70521MqApiLayout.setIp70521MsgBufferLen(FnsPayload.getFnsPayloadFieldLength());
//  MOVE FNS-PAYLOAD ( 800-START : 800-END ) TO IP70521-MSG-BUFFER
          ip70521MqApiLayout.setIp70521MsgBuffer(pad(4000000,substring(fnsPayload.getCharArray(),(work.getStart800()-1), (work.getEnd800() + (work.getStart800() - 1)) ),SPACE_CHAR,RIGHT_PAD));
          // MOVE IP7052F4-NO-OF-TRANS TO IP70521-NO-OF-TRANS
          ip70521MqApiLayout.getIp70521ProcDelay().setIp70521NoOfTrans(ip7052f4MqApiLayout.getIp7052f4ProcDelay().getIp7052f4NoOfTrans());
  
//  MOVE IP7051F4-MQ-BYPASS-SW TO IP70521-MQ-BYPASS-SW
          ip70521MqApiLayout.setIp70521MqBypassSw(ip7051f4Table.getIp7051f4MqBypassSw());
//  MOVE 800-REQ-HCONN TO IP70521-HCONN
          ip70521MqApiLayout.setIp70521Hconn(queueVars800.getReqHconn800());
//  MOVE 800-REQ-HOBJ TO IP70521-HOBJ
          ip70521MqApiLayout.setIp70521Hobj(queueVars800.getReqHobj800());
//  MOVE 800-REQ-QMGR-NAME TO IP70521-QMGR-NAME
          ip70521MqApiLayout.setIp70521QmgrName(queueVars800.getReqQmgrName800());
//  MOVE 800-REQ-Q-NAME TO IP70521-Q-NAME
          ip70521MqApiLayout.setIp70521QName(queueVars800.getReqQName800());
//  MOVE IP7052F4-TIME-DELAY TO IP70521-TIME-DELAY
          ip70521ProcDelay.setIp70521TimeDelay(ip7052f4ProcDelay.getIp7052f4TimeDelay());
  
      
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
      private void mqputFraudTrans() throws Exception {
			// Declare local variables used in the method
			char[] ip70521MqBypassSw = null;
			char[] valueN300 = null;
			int ip70521CompCd = 0;
			int mqFailCode300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This para puts the fac payload information to response mq       *
// *----------------------------------------------------------------*
//  SET 88-100-PUT-FAA-FAC4 TO TRUE
          checkPutQueueGroup100.setPutFaaFac488100True(); 
          
//  SET 88-IP70521-PUT TO TRUE
          ip70521MqApiLayout.setIp70521Put88True(); 
          
          ip70521MqBypassSw = ip70521MqApiLayout.getIp70521MqBypassSw();
          valueN300 = work.getValueN300();
//  IF IP70521-MQ-BYPASS-SW EQUAL 300-VALUE-N AND 88-IP70301-FRAUD-MQ-ACTIVE-Y
          if (		compareChars(ip70521MqBypassSw,valueN300) == 0  &&  ip70301IsFraudMqSrvActiveGroup.isIp70301FraudMqActiveY88()  ) { 
//  CALL 800-PTR-IP708010
              // CALL 800-PTR-IP708010
              	this.setRc( ip708010.process());
          }
  
//  IF 88-IP70521-MQ-RETURN-Y
//  ELSE
          if (!(ip70521MqApiLayout.isIp70521MqReturnY88()) ) { 
//  ADD +1 TO 800-MQPUT-FAIL-COUNT
              work.setMqputFailCount800(work.getMqputFailCount800()+1);
//  MOVE 300-MQPUT-FAIL-MSG TO IP82921-ERR-MSG
              ip82921ErrMsgOut.setIp82921ErrMsg(work.getMqputFailMsg300());
//  PERFORM 2800-WRITE-ERR-FILE-SYS201
              writeErrFileSys201();/*2800-WRITE-ERR-FILE-SYS201*/
              mqFailCode300 = work.getMqFailCode300();
              ip70521CompCd = ip70521MqApiLayout.getIp70521CompCd();
//  IF IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE
              if (	( ip70521CompCd == mqFailCode300 )) { 
//  MOVE IP70521-RESN-CD TO 611-BAD-REASON-CODE
                  queueErrorMsg611.setBadReasonCode611( ip70521MqApiLayout.getIp70521ResnCd());
//  SET 88-611-ERR-PUT TO TRUE
                  queueErrorMsg611.setErrPut88611True(); 
                  
//  MOVE 300-PARA-NAME-2610 TO 900-ABEND-PARA-NAME
                  abendPara900.setAbendParaName900(work.getParaName2610300());
//  MOVE 300-PUT-Q-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(work.getPutQAbendCode300());
                  // MOVE 611-QUEUE-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(queueErrorMsg611.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
                  terminateOnError();/*9000-TERMINATE-ON-ERROR*/
              }
  
          }
      
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
      private void setMqGet() throws Exception {
      
// *----------------------------------------------------------------*
// *This para reset the mqput to mqget and call ip708020 api.       *
// *----------------------------------------------------------------*
//  SET 88-100-NEXT-BROWSE TO TRUE
          getBrowseCallsGroup100.setNextBrowse88100True(); 
          
      
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
      private void writeErrFileSys201() throws Exception {
      
// *-----------------------------------------------------------------
// * This para writes error message from queue along with the error
// * reason and output file can be read using copybook xyz.
// *-----------------------------------------------------------------
//  MOVE IP70521-MSG-BUFFER ( 300-VALUE-1 : 800-END ) TO IP82921-ERR-PAYLOAD-MSG
          ip82921ErrMsgOut.replace(ip70521MqApiLayout/*parent*/,252+work.getValue1300() - 1/*fromOffset - (ip82921ErrPayloadMsg) */,work.getEnd800()/*fromLen*/,0/*toOffset - (ip70521MsgBuffer) */,222/*toLen*/);
//  MOVE IP70521-REQUEST-CD TO IP82921-ERR-REQUEST-CD
          ip82921ErrMsgOut.setIp82921ErrRequestCd(ip70521MqApiLayout.getIp70521RequestCd());
//  MOVE IP70521-TARGET-QMGR-NAME TO IP82921-ERR-TARGET-QMGR-NAME
          ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(ip70521MqApiLayout.getIp70521TargetQmgrName());
//  MOVE IP70521-TARGET-Q-NAME TO IP82921-ERR-TARGET-Q-NAME
          ip82921ErrMsgOut.setIp82921ErrTargetQName(ip70521MqApiLayout.getIp70521TargetQName());
          // MOVE IP70521-COMP-CD TO IP82921-ERR-COMP-CD
          ip82921ErrMsgOut.setIp82921ErrCompCd(ip70521MqApiLayout.getIp70521CompCd());
//  MOVE IP70521-RESN-CD TO IP82921-ERR-RESN-CD
          ip82921ErrMsgOut.setIp82921ErrResnCd( ip70521MqApiLayout.getIp70521ResnCd());
          // MOVE IP82921-ERR-MSG-OUT TO SYS201-ERR-MSG-OUT
          sys201ErrMsgOut.setString(ip82921ErrMsgOut.getCharArray());
//  WRITE SYS201-ERR-MSG-OUT
          sys201FnsMqErrFile.write(sys201ErrMsgOut.toCharArray()); 
          sys201ErrMsgOut.setString(CONSTANTS.LOW_VALUE_215717453);
          work.setSys201Status800(sys201FnsMqErrFile.getStatusString() );
//  IF 800-88-SYS201-IO-GOOD
//  ELSE
          if (!(work.isSys201IoGood80088()) ) { 
//  MOVE 300-SYS201 TO 600-3011-FILE-DD
              errorMsg6003011.setFileDd6003011(pad(8,work.getSys201300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-SYS201-STATUS TO 600-3011-FILE-STAT
              errorMsg6003011.setFileStat6003011(work.getSys201Status800());
//  MOVE 300-3011-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getAbendCode3003011());
              // MOVE 600-3011-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003011.toCharArray());
//  MOVE 300-PARA-NAME-2800 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName2800300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void closeQueue() throws Exception {
      
// *----------------------------------------------------------------*
// *This para closes and disconnects from the fraud mq              *
// *----------------------------------------------------------------*
//  IF 88-IP02015-HOST-PA-GLOBAL
          if ( ip02015PrcssAgrmtTable.isIp02015HostPaGlobal88()  ) { 
              // MOVE 800-MQGET-FAIL-COUNT TO 612-GET-FAIL-CNT
              mqgetFailCnt612.setGetFailCnt612(work.getMqgetFailCount800());
//  DISPLAY 612-MQGET-FAIL-CNT
              logger.info(mqgetFailCnt612.toString()); 
              // MOVE 800-TIPAMRS-SKIP-COUNT TO 611-MRS-SKIP-CNT
              tipamrsSkipCnt611.setMrsSkipCnt611(work.getTipamrsSkipCount800());
//  DISPLAY 611-TIPAMRS-SKIP-CNT
              logger.info(tipamrsSkipCnt611.toString()); 
              // MOVE 800-MRS-ISRT-COUNT TO 608-MRS-ISRT-CNT
              mrsRowCnt608.setMrsIsrtCnt608(work.getMrsIsrtCount800());
//  DISPLAY 608-MRS-ROW-CNT
              logger.info(mrsRowCnt608.toString()); 

// * Populating common paramters for mq close
//  SET 88-IP34051-REQUEST-END TO TRUE
              ip34051MqProcessParameters.setIp34051RequestEnd88True(); 
              
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RespnseQ88True(); 
              
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
              ip34051MqProcessParameters.setIp34051TipacliActiveN88True(); 
              
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
              ip34051MqProcessParameters.setIp34051TipasvcActiveN88True(); 
              

// * For fraudulent data queue:
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
              ip34051MqProcessParameters.setIp34051ServCdFra88True(); 
              
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
              ip34051MqProcessParameters.setIp34051FuncCdCha88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	this.setRc( ip703020.process());
          }
//  ELSE
          else { 
              // MOVE 800-MQGET-FAIL-COUNT TO 612-GET-FAIL-CNT
              mqgetFailCnt612.setGetFailCnt612(work.getMqgetFailCount800());
//  DISPLAY 612-MQGET-FAIL-CNT
              logger.info(mqgetFailCnt612.toString()); 
              // MOVE 800-FAA-FAC-NOT-FND-CNT TO 614-FAC-NOT-FND-CNT
              faaFacNotFndCnt614.setFacNotFndCnt614(work.getFaaFacNotFndCnt800());
//  DISPLAY 614-FAA-FAC-NOT-FND-CNT
              logger.info(faaFacNotFndCnt614.toString()); 
              // MOVE 800-MQPUT-SKIP-COUNT TO 610-PUT-SKIP-CNT
              mqputSkipCnt610.setPutSkipCnt610(work.getMqputSkipCount800());
//  DISPLAY 610-MQPUT-SKIP-CNT
              logger.info(mqputSkipCnt610.toString()); 
              // MOVE 800-MQPUT-FAIL-COUNT TO 613-PUT-FAIL-CNT
              mqputFailCnt613.setPutFailCnt613(work.getMqputFailCount800());
//  DISPLAY 613-MQPUT-FAIL-CNT
              logger.info(mqputFailCnt613.toString()); 

// * Populating common paramters for mq open/connect
//  SET 88-IP34051-REQUEST-END TO TRUE
              ip34051MqProcessParameters.setIp34051RequestEnd88True(); 
              
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RespnseQ88True(); 
              
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
              ip34051MqProcessParameters.setIp34051TipacliActiveN88True(); 
              
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
              ip34051MqProcessParameters.setIp34051TipasvcActiveN88True(); 
              
//  MOVE 800-RES-HCONN TO IP7052F4-HCONN
              ip7052f4MqApiLayout.setIp7052f4Hconn(queueVars800.getResHconn800());
//  MOVE 800-RES-HOBJ TO IP7052F4-HOBJ
              ip7052f4MqApiLayout.setIp7052f4Hobj(queueVars800.getResHobj800());

// * For fraudulent data queue:
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
              ip34051MqProcessParameters.setIp34051ServCdFra88True(); 
              
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
              ip34051MqProcessParameters.setIp34051FuncCdCha88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	this.setRc( ip703020.process());
//  SET 88-IP34051-REQUEST-END TO TRUE
              ip34051MqProcessParameters.setIp34051RequestEnd88True(); 
              
//  SET 88-IP34051-REQUEST-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RequestQ88True(); 
              
//  SET 88-IP34051-SERV-CD-FRA TO TRUE
              ip34051MqProcessParameters.setIp34051ServCdFra88True(); 
              
//  SET 88-IP34051-FUNC-CD-CHA TO TRUE
              ip34051MqProcessParameters.setIp34051FuncCdCha88True(); 
              
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
              ip34051MqProcessParameters.setIp34051TipacliActiveN88True(); 
              
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
              ip34051MqProcessParameters.setIp34051TipasvcActiveN88True(); 
              
//  MOVE 800-REQ-HCONN TO IP7052F4-HCONN
              ip7052f4MqApiLayout.setIp7052f4Hconn(queueVars800.getReqHconn800());
//  MOVE 800-REQ-HOBJ TO IP7052F4-HOBJ
              ip7052f4MqApiLayout.setIp7052f4Hobj(queueVars800.getReqHobj800());
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	this.setRc( ip703020.process());

// * For disconnect data queue:
//  SET 88-IP34051-REQUEST-DISCNCT TO TRUE
              ip34051MqProcessParameters.setIp34051RequestDiscnct88True(); 
              
//  CALL 800-PTR-IP703020
              // CALL 800-PTR-IP703020
              	this.setRc( ip703020.process());
          }
      
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
      private void closeErrFileSys201() throws Exception {
			// Declare local variables used in the method
			char[] sys201Status800 = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * This paragraph closes the output mq error sys201 file
// *-----------------------------------------------------------------
//  CLOSE SYS201-FNS-MQ-ERR-FILE
          sys201FnsMqErrFile.close(); 
          work.setSys201Status800(sys201FnsMqErrFile.getStatusString() );
          sys201Status800 = work.getSys201Status800();
//  IF 800-SYS201-STATUS NOT EQUAL ZERO
          if (!( allZeros(sys201Status800) ) /*  !=  zeros*/) { 
//  MOVE 300-SYS201 TO 600-3012-FILE-DD
              errorMsg6003012.setFileDd6003012(pad(8,work.getSys201300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-SYS201-STATUS TO 600-3012-FILE-STAT
              errorMsg6003012.setFileStat6003012(work.getSys201Status800());
//  MOVE 300-3012-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getAbendCode3003012());
              // MOVE 600-3012-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003012.toCharArray());
//  MOVE 300-PARA-NAME-3100 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName3100300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
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
      private void displayMqInfo() throws Exception {
			// Declare local variables used in the method
			FnsPldRdFacDataKey fnsPldRdFacDataKey = fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey();
			FnsPldRdFacData fnsPldRdFacData = fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para displays the mq payload information                  *
// *----------------------------------------------------------------*
//  INITIALIZE 600-FRAUD-MQ-DEBUG-DISP 600-FRAUD-MQ-DEBUG-DISP-STR
          fraudMqDebugDisp600.initialize();
          work.setFraudMqDebugDispStr600(CONSTANTS.SPACE_400 /* Fill 400 Spaces*/);
//  MOVE FNS-PLD-RD-PRIMARY-ACCT-NBR TO 600-PRIMARY-ACCT-NO
          fraudMqDebugDisp600.setPrimaryAcctNo600(fnsPldRdFacDataKey.getFnsPldRdPrimaryAcctNbr());
  
          // MOVE FNS-PLD-RD-EXPIRATION-DATE TO 600-EXPIR-DATE
          fraudMqDebugDisp600.setExpirDate600(fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate().toCharArray());
  
//  MOVE FNS-PLD-RD-VRTL-ACCT-NUM TO 600-VIRTUAL-ACCT-NO
          fraudMqDebugDisp600.setVirtualAcctNo600(fnsPldRdFacData.getFnsPldRdVrtlAcctNum());
  
//  MOVE FNS-PLD-RD-QUERY-NO TO 600-QUERY-NUM
          fraudMqDebugDisp600.setQueryNum600(fnsPldRd.getFnsPldRdQueryNo());
//  MOVE FNS-PLD-RD-GFT-DSN TO 600-GFT-DSN
          fraudMqDebugDisp600.setGftDsn600(fnsPldRd.getFnsPldRdGftDsn());
          // MOVE FNS-PLD-RD-LOGICAL-SEQ TO 600-LOGICAL-SEQ
          fraudMqDebugDisp600.setLogicalSeq600(fnsPldRd.getFnsPldRdLogicalSeq());
//  MOVE FNS-PLD-RD-TXN-NUM TO 600-TXN-NO
          fraudMqDebugDisp600.setTxnNo600( fnsPldRd.getFnsPldRdTxnNum());
//  MOVE FNS-PAYLOAD-FAA-PAN-STAT-CD TO 600-FAA-PAN-STAT-CD
          fraudMqDebugDisp600.setFaaPanStatCd600(fnsPayload.getFnsPayloadFaaPanStatCd());
//  MOVE FNS-PAYLOAD-FAA-CLOSE-DT TO 600-FAA-CLS-DT
          fraudMqDebugDisp600.setFaaClsDt600(fnsPayload.getFnsPayloadFaaCloseDt());
//  STRING 600-PRIMARY-ACCT-NO DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-EXPIR-DATE DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-VIRTUAL-ACCT-NO DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-QUERY-NUM DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-GFT-DSN DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-LOGICAL-SEQ DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-TXN-NO DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-FAC-COUNT DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-FAA-PAN-STAT-CD DELIMITED BY SIZE 300-VALUE-PIPE DELIMITED BY SIZE 600-FAA-CLS-DT DELIMITED BY SIZE INTO 600-FRAUD-MQ-DEBUG-DISP-STR
          charArray = new ArrayList<char[]>();
             charArray.add(fraudMqDebugDisp600.getPrimaryAcctNo600());
             charArray.add(work.getValuePipe300());
             charArray.add(fraudMqDebugDisp600.getExpirDate600());
             charArray.add(work.getValuePipe300());
             charArray.add(fraudMqDebugDisp600.getVirtualAcctNo600());
             charArray.add(work.getValuePipe300());
             charArray.add(String.valueOf(fraudMqDebugDisp600.getQueryNum600String()).toCharArray());
             charArray.add(work.getValuePipe300());
             charArray.add(fraudMqDebugDisp600.getGftDsn600());
             charArray.add(work.getValuePipe300());
             charArray.add(String.valueOf(fraudMqDebugDisp600.getLogicalSeq600String()).toCharArray());
             charArray.add(work.getValuePipe300());
             charArray.add(String.valueOf(fraudMqDebugDisp600.getTxnNo600String()).toCharArray());
             charArray.add(work.getValuePipe300());
             charArray.add(String.valueOf(fraudMqDebugDisp600.getFacCount600String()).toCharArray());
             charArray.add(work.getValuePipe300());
             charArray.add(fraudMqDebugDisp600.getFaaPanStatCd600());
             charArray.add(work.getValuePipe300());
             charArray.add(fraudMqDebugDisp600.getFaaClsDt600());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8),charArray.get(9),charArray.get(10),charArray.get(11),charArray.get(12),charArray.get(13),charArray.get(14),charArray.get(15),charArray.get(16),charArray.get(17),charArray.get(18));
          updated = updateString(work.getFraudMqDebugDispStr600() ,joinCharArray);
          work.setFraudMqDebugDispStr600(  (char[])updated.get("string"));
//  DISPLAY 600-FRAUD-MQ-DEBUG-DISP-STR
          logger.info(new String(work.getFraudMqDebugDispStr600())); 
      
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
      private void callLrmIp648010() throws Exception {
      
// *------------------------------------------------------------*
// *This paragraph calls ip648010-long running task services    *
// *module and checks the lrm staus code.                       *
// *------------------------------------------------------------*
//  CALL 800-PTR-IP648010
          // CALL 800-PTR-IP648010
          	this.setRc( ip648010.process());
//  IF IP64801-88-LRM-STAT-BAD
          if ( ip64801LrmCommBlock.isIp6480188LrmStatBad()  ) { 
//  MOVE 609-LRM-IO-ABEND-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(100,work.getLrmIoAbendMsg609(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-NAME-8500 TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getParaName8500300());
//  MOVE 300-INVALID-RC-LRM TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getInvalidRcLrm300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void terminateOnError() throws Exception {
      
// *----------------------------------------------------------
// * This para displays abend message and calls abend routine.
// *----------------------------------------------------------
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.getAbendText900());
//  DISPLAY 300-ASTERISKS
          logger.info(new String(work.getAsterisks300())); 
//  DISPLAY 300-ABEND-TXT
          logger.info(new String(work.getAbendTxt300())); 
//  DISPLAY 300-ABEND-PGM-TXT
          logger.info(new String(work.getAbendPgmTxt300())); 
//  DISPLAY 300-ASTERISKS
          logger.info(new String(work.getAsterisks300())); 
//  DISPLAY 900-ABEND-PARA
          logger.info(abendPara900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	this.setRc( ip610010.process());
      
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
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            parms1000.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parms1000) {
                       	this.parms1000 = ((Parms1000) parameters[index]);
                  	} else {
                       	this.parms1000.set(parameters[index]);
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
