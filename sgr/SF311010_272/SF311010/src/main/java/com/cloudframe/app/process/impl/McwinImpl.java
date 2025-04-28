  package com.cloudframe.app.process.impl;
  /* 
*$set amode(31)
*--------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --           *
*    this item contains information and procedures which are   *
*    proprietary to mastercard international, incorporated,    *
*    and which are confidential.  it is provided with the      *
*    express understanding that it is to be used only for the  *
*    benefit of interbank card association, and is not to be   *
*    used, copied, or disclosed for any other purpose.  any    *
*    authorized reproduction (in whole or in part) of this     *
*    material must be marked with this legend.                 *
*----------------------------------------------------------------*
*author.        wipro                                            *
*date-written.  august 2017.                                     *
*date-compiled. august 2017.                                     *
*security.      property of mastercard international, inc.       *
*----------------------------------------------------------------*
* program functionality :                                        *
*----------------------------------------------------------------*
* this program is used to generate a 4-digit year( ccyy) from an *
* input 2-digit year (yy).                                       *
*----------------------------------------------------------------*
*revision history
*-----------------------------------------------------------------
*    project         :release 18.3 # i6959                       *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/07/13                                 *
*    version         :001.00                                     *
*    programmer      :wipro                                      *
*    modification    :initial version                            *
*-----------------------------------------------------------------
*/
  
  import com.cloudframe.app.mcwin.McwinCtx.*;
  import com.cloudframe.app.mcwin.McwinCtx;
  import com.cloudframe.app.process.Mcwin;
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
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.mcwin.dto.*;
  import com.cloudframe.app.mcwin.dto.MciwinReturnedYear800;
  import com.cloudframe.app.mcwin.dto.WorkArea800;
  import com.cloudframe.app.mcwin.dto.MciwinNewWindowYearGroup800;
  import com.cloudframe.app.mcwin.dto.MciwinYearToWindow800;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.mcwin.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("mcwin")
  
  public class McwinImpl extends CommonProcess implements Mcwin {
  
  Logger logger = LoggerFactory.getLogger(McwinImpl.class);
  
  
  
  
  
  
  
  
  
  
      @Override
      public int setParameter(McwinCtx programCtx, String mciwinYearToWindow800,String mciwinReturnedYear800,String mciwinNewWindowYearGroup800) throws Exception {
      		if(mciwinYearToWindow800 != null)
      		    programCtx.getMciwinYearToWindow800().setString(com.cloudframe.app.data.Field.getParm(mciwinYearToWindow800),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(mciwinReturnedYear800 != null)
      		    programCtx.getMciwinReturnedYear800().setString(com.cloudframe.app.data.Field.getParm(mciwinReturnedYear800),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(mciwinNewWindowYearGroup800 != null)
      		    programCtx.getMciwinNewWindowYearGroup800().setString(com.cloudframe.app.data.Field.getParm(mciwinNewWindowYearGroup800),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(McwinCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
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
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(McwinCtx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// * The main paragraph performs routines to display execution      *
// * messages and validate the parm received.                       *
// *----------------------------------------------------------------*
//  PERFORM 1000-PROCESS-INITIALIZATION
          processInitialization(programCtx.getProcessInitializationInCtx());/*1000-PROCESS-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-MCWIN-MAIN
          mcwinMain(programCtx);/*2000-MCWIN-MAIN*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * processInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-PROCESS-INITIALIZATION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - pgmMcwin300                    COBOL Name: 300-PGM-MCWIN
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmMcwin300                    COBOL Name: 300-PGM-MCWIN
      * - rc                             COBOL Name: RETURN-CODE
      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public ProcessInitializationOutCtx processInitialization(ProcessInitializationInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph,                                                *
// *      1. display execution messages.                            *
// *      2. set procedure pointers.                                *
// *----------------------------------------------------------------*
McwinCtx programCtx = methodIn.getMcwinCtx();
ProcessInitializationOutCtx methodOut = methodIn.getProcessInitializationOutCtx();
//  MOVE 300-PGM-MCWIN TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(pad(8,methodOut.getPgmMcwin300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE ZEROES TO RETURN-CODE
          programCtx.setRc(0);
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
              methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
              
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
          }
//  MOVE ZEROES TO RETURN-CODE
          programCtx.setRc(0);
      
      return methodOut;
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - pgmMcwin300                    COBOL Name: 300-PGM-MCWIN
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmMcwin300                    COBOL Name: 300-PGM-MCWIN
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      *
      * @throws CFException
      */
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph displays program execution messages.             *
// *----------------------------------------------------------------*
McwinCtx programCtx = methodIn.getMcwinCtx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  MOVE 300-PGM-MCWIN TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(pad(8,methodOut.getPgmMcwin300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_704084476));
      
      return methodOut;
      }
      /**
      * mcwinMain 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-MCWIN-MAIN COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public McwinMainOutCtx mcwinMain(McwinCtx programCtx) throws Exception {
      
// ****  Call 800-ptr-ip996010

// *----------------------------------------------------------------*
// *     This paragraph validate the parm received.                 *
// *----------------------------------------------------------------*
McwinMainOutCtx methodOut = programCtx.getMcwinMainOutCtx();
//  MOVE ZEROES TO RETURN-CODE
          programCtx.setRc(0);
//  PERFORM 2100-MCWIN-ERROR-MSG-ONE
          mcwinErrorMsgOne(programCtx.getMcwinErrorMsgOneInCtx());/*2100-MCWIN-ERROR-MSG-ONE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2200-MCWIN-ERROR-MSG-TWO
          mcwinErrorMsgTwo(programCtx.getMcwinErrorMsgTwoInCtx());/*2200-MCWIN-ERROR-MSG-TWO*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2300-MCWIN-ERROR-MSG-THREE
          mcwinErrorMsgThree(programCtx.getMcwinErrorMsgThreeInCtx());/*2300-MCWIN-ERROR-MSG-THREE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2400-MCWIN-PROCESS-CENTURY
          mcwinProcessCentury(programCtx.getMcwinProcessCenturyInCtx());/*2400-MCWIN-PROCESS-CENTURY*/
          ;
      
      return methodOut;
      }
      /**
      * mcwinErrorMsgOne 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-MCWIN-ERROR-MSG-ONE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - mciwinYearToWindow800          COBOL Name: 800-MCIWIN-YEAR-TO-WINDOW
      * - num00300                       COBOL Name: 300-NUM-00
      * - mciwinNewWindowYear800         COBOL Name: 800-MCIWIN-NEW-WINDOW-YEAR
      * - errMsg016600                   COBOL Name: 600-ERR-MSG-016
      * - num16300                       COBOL Name: 300-NUM-16
      *
      * Output :  

      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errMsg016600                   COBOL Name: 600-ERR-MSG-016
      * - rc                             COBOL Name: RETURN-CODE
      * - num16300                       COBOL Name: 300-NUM-16
      *
      * @throws CFException
      */
      @Override
      public McwinErrorMsgOneOutCtx mcwinErrorMsgOne(McwinErrorMsgOneInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *     If no parameters supplied then abend16 to be executed      *
// *----------------------------------------------------------------*
McwinCtx programCtx = methodIn.getMcwinCtx();
McwinErrorMsgOneOutCtx methodOut = methodIn.getMcwinErrorMsgOneOutCtx();
//  IF 800-MCIWIN-YEAR-TO-WINDOW < 300-NUM-00 OR 800-MCIWIN-NEW-WINDOW-YEAR < 300-NUM-00
          if (compareChars(methodIn.getMciwinYearToWindow800(),String.valueOf(methodIn.getNum00300String()).toCharArray()) < 0 || 	( methodIn.getMciwinNewWindowYear800() < methodIn.getNum00300() )) { 
              // MOVE 600-ERR-MSG-016 TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrMsg016600());
//  MOVE 300-NUM-16 TO RETURN-CODE
              programCtx.setRc(methodOut.getNum16300());
//  PERFORM 9000-TERMINATE-PROGRAM
              terminateProgram(programCtx.getTerminateProgramInCtx());/*9000-TERMINATE-PROGRAM*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * mcwinErrorMsgTwo 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-MCWIN-ERROR-MSG-TWO COBOL Cyclomatic complexity - 3
      * Input  :  

      * - mciwinNewWindowYear800         COBOL Name: 800-MCIWIN-NEW-WINDOW-YEAR
      * - num00300                       COBOL Name: 300-NUM-00
      * - num99300                       COBOL Name: 300-NUM-99
      * - errMsg008600                   COBOL Name: 600-ERR-MSG-008
      * - num08300                       COBOL Name: 300-NUM-08
      *
      * Output :  

      * - mciwinReturnedYear             COBOL Name: MCIWIN-RETURNED-YEAR
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errMsg008600                   COBOL Name: 600-ERR-MSG-008
      * - rc                             COBOL Name: RETURN-CODE
      * - num08300                       COBOL Name: 300-NUM-08
      * - yearValue800                   COBOL Name: 800-YEAR-VALUE
      * - mciwinNewWindowYear800         COBOL Name: 800-MCIWIN-NEW-WINDOW-YEAR
      *
      * @throws CFException
      */
      @Override
      public McwinErrorMsgTwoOutCtx mcwinErrorMsgTwo(McwinErrorMsgTwoInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *  If window year passed through parm is falling in the range    *
// *  0>>parm3>>99 then abend08 to execute else clear the           *
// *  mciwin-returned-year with spaces                              *
// *----------------------------------------------------------------*
McwinCtx programCtx = methodIn.getMcwinCtx();
McwinErrorMsgTwoOutCtx methodOut = methodIn.getMcwinErrorMsgTwoOutCtx();
//  IF 800-MCIWIN-NEW-WINDOW-YEAR < 300-NUM-00 OR 800-MCIWIN-NEW-WINDOW-YEAR > 300-NUM-99
          if (	( methodOut.getMciwinNewWindowYear800() < methodIn.getNum00300() ) || 	( methodOut.getMciwinNewWindowYear800() > methodIn.getNum99300() )) { 
              // MOVE SPACES TO MCIWIN-RETURNED-YEAR
              methodOut.setMciwinReturnedYear(CONSTANTS.SPACE_4);
              // MOVE 600-ERR-MSG-008 TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrMsg008600());
//  MOVE 300-NUM-08 TO RETURN-CODE
              programCtx.setRc(methodOut.getNum08300());
//  PERFORM 9000-TERMINATE-PROGRAM
              terminateProgram(programCtx.getTerminateProgramInCtx());/*9000-TERMINATE-PROGRAM*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  ELSE
          else { 
//  MOVE 800-MCIWIN-NEW-WINDOW-YEAR TO 800-YEAR-VALUE
              methodOut.setYearValue800(methodOut.getMciwinNewWindowYear800());
          }
      
      return methodOut;
      }
      /**
      * mcwinErrorMsgThree 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-MCWIN-ERROR-MSG-THREE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - mciwinYearToWindow800          COBOL Name: 800-MCIWIN-YEAR-TO-WINDOW
      * - num00300                       COBOL Name: 300-NUM-00
      * - num99300                       COBOL Name: 300-NUM-99
      * - errMsg004600                   COBOL Name: 600-ERR-MSG-004
      * - num04300                       COBOL Name: 300-NUM-04
      *
      * Output :  

      * - currYear1800                   COBOL Name: 800-CURR-YEAR1
      * - mciwinYearToWindow800          COBOL Name: 800-MCIWIN-YEAR-TO-WINDOW
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errMsg004600                   COBOL Name: 600-ERR-MSG-004
      * - rc                             COBOL Name: RETURN-CODE
      * - num04300                       COBOL Name: 300-NUM-04
      *
      * @throws CFException
      */
      @Override
      public McwinErrorMsgThreeOutCtx mcwinErrorMsgThree(McwinErrorMsgThreeInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *   If an invalid packed value then abend04 to be executed       *
// *----------------------------------------------------------------*
McwinCtx programCtx = methodIn.getMcwinCtx();
McwinErrorMsgThreeOutCtx methodOut = methodIn.getMcwinErrorMsgThreeOutCtx();
          // MOVE 800-MCIWIN-YEAR-TO-WINDOW TO 800-CURR-YEAR1
          methodOut.getWorkArea800().replace(padSpaces(6,methodOut.getMciwinYearToWindow800().toCharArray()), /* beginIndex */2, /* length */6);
//  IF 800-CURR-YEAR1 (1 : 2) < 300-NUM-00 OR 800-CURR-YEAR1 (1 : 2) > 300-NUM-99
          if (compareChars(substring(methodOut.getCurrYear1800String(),0,2),String.valueOf(methodIn.getNum00300String()).toCharArray()) < 0 || compareChars(substring(methodOut.getCurrYear1800String(),0,2),String.valueOf(methodIn.getNum99300String()).toCharArray()) > 0) { 
              // MOVE 600-ERR-MSG-004 TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrMsg004600());
//  MOVE 300-NUM-04 TO RETURN-CODE
              programCtx.setRc(methodOut.getNum04300());
//  PERFORM 9000-TERMINATE-PROGRAM
              terminateProgram(programCtx.getTerminateProgramInCtx());/*9000-TERMINATE-PROGRAM*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * mcwinProcessCentury 
      *   This method is derived from 
  *   COBOL Paragraph - 2400-MCWIN-PROCESS-CENTURY COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mciwinYearToWindow800          COBOL Name: 800-MCIWIN-YEAR-TO-WINDOW
      * - yearValue800                   COBOL Name: 800-YEAR-VALUE
      * - num20300                       COBOL Name: 300-NUM-20
      * - num19300                       COBOL Name: 300-NUM-19
      *
      * Output :  

      * - mciwinRetYearL2800             COBOL Name: 800-MCIWIN-RET-YEAR-L2
      * - mciwinYearToWindow800          COBOL Name: 800-MCIWIN-YEAR-TO-WINDOW
      * - mciwinRetCentury800            COBOL Name: 800-MCIWIN-RET-CENTURY
      * - num20300                       COBOL Name: 300-NUM-20
      * - num19300                       COBOL Name: 300-NUM-19
      *
      * @throws CFException
      */
      @Override
      public McwinProcessCenturyOutCtx mcwinProcessCentury(McwinProcessCenturyInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *                  Century conversion
// *-----------------------------------------------------------------
McwinCtx programCtx = methodIn.getMcwinCtx();
McwinProcessCenturyOutCtx methodOut = methodIn.getMcwinProcessCenturyOutCtx();
//  MOVE 800-MCIWIN-YEAR-TO-WINDOW (1 : 2) TO 800-MCIWIN-RET-YEAR-L2
          methodOut.setMciwinRetYearL2800(CFUtil.getInt(substring(methodOut.getMciwinYearToWindow800().getCharArray(),0,2)));
//  IF 800-MCIWIN-YEAR-TO-WINDOW < 800-YEAR-VALUE
          if (compareChars(methodOut.getMciwinYearToWindow800(),String.valueOf(methodIn.getYearValue800String()).toCharArray()) < 0) { 
//  MOVE 300-NUM-20 TO 800-MCIWIN-RET-CENTURY
              methodOut.setMciwinRetCentury800(methodOut.getNum20300());
          }
//  ELSE
          else { 
//  MOVE 300-NUM-19 TO 800-MCIWIN-RET-CENTURY
              methodOut.setMciwinRetCentury800(methodOut.getNum19300());
          }
      
      return methodOut;
      }
      /**
      * terminateProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void terminateProgram(TerminateProgramInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *                  Exit para                                     *
// *-----------------------------------------------------------------
McwinCtx programCtx = methodIn.getMcwinCtx();
//  DISPLAY 900-ABEND-TEXT
          logger.info(new String(methodIn.getAbendText900())); 
//  EXIT PROGRAM
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
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
      
// * Element ip601011 as of 10/31/02 04:53:52                    jvc�
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
McwinCtx programCtx = methodIn.getMcwinCtx();
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
      McwinCtx programCtx = (McwinCtx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getMciwinYearToWindow800().set((Field)params[0]);
         if (len > 1 && params[1] != null )
            programCtx.getMciwinReturnedYear800().set((Field)params[1]);
         if (len > 2 && params[2] != null )
            programCtx.getMciwinNewWindowYearGroup800().set((Field)params[2]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      McwinCtx programCtx = (McwinCtx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof MciwinYearToWindow800) {
                       	programCtx.setMciwinYearToWindow800((MciwinYearToWindow800) parameters[index]);
                  	} else {
                       	programCtx.getMciwinYearToWindow800().set(parameters[index]);
                  	}
                  }
                
                  break;
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof MciwinReturnedYear800) {
                       	programCtx.setMciwinReturnedYear800((MciwinReturnedYear800) parameters[index]);
                  	} else {
                       	programCtx.getMciwinReturnedYear800().set(parameters[index]);
                  	}
                  }
                
                  break;
              case 2:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof MciwinNewWindowYearGroup800) {
                       	programCtx.setMciwinNewWindowYearGroup800((MciwinNewWindowYearGroup800) parameters[index]);
                  	} else {
                       	programCtx.getMciwinNewWindowYearGroup800().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
