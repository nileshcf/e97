  package com.cloudframe.app.process.impl;
  /* 
* element ip081100 as of 12/06/21 06:27:54                    [vc]
*-----------------------------------------------------------------
*          -- -- -- c o n f i d e n t i a l -- -- --
*    this item contains information and procedures which are
*    proprietary to mastercard international, incorporated,
*    and which are confidential.  it is provided with the
*    express understanding that it is to be used only for the
*    benefit of interbank card association, and is not to be
*    used, copied, or disclosed for any other purpose.  any
*    authorized reproduction (in whole or in part) of this
*    material must be marked with this legend.
*-----------------------------------------------------------------
*author.        shankar subramanian.
*date-written.  sep, 2021.
*date-compiled. sep, 2021.
*security.      property of mastercard international, inc.
*-----------------------------------------------------------------
*program functionality: read api to return if the account number
*is india or not.
*-----------------------------------------------------------------
*revision history:
*-----------------------------------------------------------------
*    project         :gcms release 21.q4 - e35992                *
*                     india data remediation                     *
*    date            :2021/11/30                                 *
*    programmer      :shankar subramanian                        *
*    modification    :initial version                            *
*----------------------------------------------------------------*
*/
  
  import com.cloudframe.app.ip081100.Ip081100Ctx.*;
  import com.cloudframe.app.ip081100.Ip081100Ctx;
  import com.cloudframe.app.process.Ip081100;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip081050;
  import com.cloudframe.app.process.Ip280010;
  import com.cloudframe.app.global.sharedvar.Ip08151PassedParms;
  import com.cloudframe.app.global.sharedvar.Ip08151ReturnParms;
  import com.cloudframe.app.global.sharedvar.Ip08151PartnStrtGroup;
  import com.cloudframe.app.global.sharedvar.Ip08151PartnEndGroup;
  import com.cloudframe.app.global.sharedvar.Ip00404Table;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.IsIndiaAcctRngGroup100;
  import com.cloudframe.app.ip081100.dto.*;
  import com.cloudframe.app.ip081100.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip081100")
  
  public class Ip081100Impl extends CommonProcess implements Ip081100 {
  
  Logger logger = LoggerFactory.getLogger(Ip081100Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip081050")
  Ip081050 ip081050;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip081100Ctx programCtx) throws Exception {
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
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp081100300                 COBOL Name: 300-PGM-IP081100
      *
      * Output :  

      * - isIndiaAcctRng100              COBOL Name: 100-IS-INDIA-ACCT-RNG
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmIp081100300                 COBOL Name: 300-PGM-IP081100
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Main paragraph for processing
// *-----------------------------------------------------------------
Ip081100Ctx programCtx = methodIn.getIp081100Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  SET 88-100-ACC-RNG-INDIA-N TO TRUE
          methodOut.setAccRngIndiaN88100True(); 
          
//  MOVE 300-PGM-IP081100 TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getPgmIp081100300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 1000-DO-INITIALIZATION
          doInitialization(programCtx.getDoInitializationInCtx());/*1000-DO-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2000-SCAN-TBL40-OCCURRENCE
          scanTbl40Occurrence(programCtx.getScanTbl40OccurrenceInCtx());/*2000-SCAN-TBL40-OCCURRENCE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * doInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DO-INITIALIZATION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * Output :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para does all the intialization required for this program.
// *-----------------------------------------------------------------
Ip081100Ctx programCtx = methodIn.getIp081100Ctx();
DoInitializationOutCtx methodOut = methodIn.getDoInitializationOutCtx();
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers(programCtx.getSetProcedurePointersInCtx());/*1200-SET-PROCEDURE-POINTERS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
          }
      
      return methodOut;
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - pgmIp081100300                 COBOL Name: 300-PGM-IP081100
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmIp081100300                 COBOL Name: 300-PGM-IP081100
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph displays the program execution messages.
// *-----------------------------------------------------------------
Ip081100Ctx programCtx = methodIn.getIp081100Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  MOVE 300-PGM-IP081100 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmIp081100300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1821800792));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - pgmIp081050300                 COBOL Name: 300-PGM-IP081050
      * - pgmIp280010300                 COBOL Name: 300-PGM-IP280010
      *
      * Output :  

      * - ptrIp081050800                 COBOL Name: 800-PTR-IP081050
      * - ptrIp280010800                 COBOL Name: 800-PTR-IP280010
      *
      * @throws CFException
      */
      @Override
      public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph sets procedure pointers.
// *-----------------------------------------------------------------
Ip081100Ctx programCtx = methodIn.getIp081100Ctx();
SetProcedurePointersOutCtx methodOut = methodIn.getSetProcedurePointersOutCtx();
//  SET 800-PTR-IP081050 TO ENTRY 300-PGM-IP081050
          methodOut.setPtrIp081050800(methodIn.getPgmIp081050300()); 
          
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
          methodOut.setPtrIp280010800(methodIn.getPgmIp280010300()); 
          
      
      return methodOut;
      }
      /**
      * scanTbl40Occurrence 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-SCAN-TBL40-OCCURRENCE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      * - ip00404Country                 COBOL Name: IP00404-COUNTRY
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip00404Tbl40ArH                COBOL Name: IP00404-TBL-40-AR-H
      * - ip00404EntriesFoundCount       COBOL Name: IP00404-ENTRIES-FOUND-COUNT
      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      * - isIndiaAcctRng100              COBOL Name: 100-IS-INDIA-ACCT-RNG
      *
      * @throws CFException
      */
      @Override
      public ScanTbl40OccurrenceOutCtx scanTbl40Occurrence(ScanTbl40OccurrenceInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para search tbl40 to confirm whether the entry is india or
// *not.
// *-----------------------------------------------------------------
Ip081100Ctx programCtx = methodIn.getIp081100Ctx();
ScanTbl40OccurrenceOutCtx methodOut = methodIn.getScanTbl40OccurrenceOutCtx();
//  CALL 800-PTR-IP081050
          // CALL 800-PTR-IP081050
          	programCtx.setRc( ip081050.process(programCtx.getGlobalCtx().getContext("IP081050")));
//  MOVE ZEROES TO IP00404-TBL-40-AR-H IP00404-ENTRIES-FOUND-COUNT
          methodOut.setIp00404Tbl40ArH(CONSTANTS.ZERO_19);
          methodOut.setIp00404EntriesFoundCount(0);
//  MOVE IP08151-PASSED-ACCT-NBR TO IP00404-TBL-40-AR-H (1 : IP08151-RETURN-ACCT-NBR-L )
          methodOut.getIp00404Table().replace(methodIn.getIp08151PassedParms()/*parent*/,0/*fromOffset - (ip00404Tbl40ArH) */,19/*fromLen*/,4/*toOffset - (ip08151PassedAcctNbr) */,methodIn.getIp08151ReturnAcctNbrL()/*toLen*/);
//  CALL 800-PTR-IP280010
          // CALL 800-PTR-IP280010
          	programCtx.setRc( ip280010.process(programCtx.getGlobalCtx().getContext("IP280010")));
//  IF IP00404-ENTRIES-FOUND-COUNT GREATER THAN ZERO
          if (	( methodOut.getIp00404EntriesFoundCount() > 0 )) { 
//  IF IP00404-COUNTRY (1) EQUAL 'IND'
//  LITERAL_IND = 'IND'
              if (		compareChars(methodIn.getIp00404Country(0),CONSTANTS.LITERAL_IND) == 0 ) { 
//  SET 88-100-ACC-RNG-INDIA-Y TO TRUE
                  methodOut.setAccRngIndiaY88100True(); 
                  
              }
          }
      
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
Ip081100Ctx programCtx = methodIn.getIp081100Ctx();
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
  
  
  
  
  
  
  
  
  }
