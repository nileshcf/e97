  package com.cloudframe.app.process;
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
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.mcwin.dto.*;
  import com.cloudframe.app.mcwin.dto.WorkArea800;
  import com.cloudframe.app.mcwin.dto.MciwinReturnedYear800;
  import com.cloudframe.app.mcwin.dto.MciwinNewWindowYearGroup800;
  import com.cloudframe.app.mcwin.dto.MciwinYearToWindow800;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.mcwin.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("mcwin")
  
  public class Mcwin extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Mcwin.class);
  
  private WorkArea800 workArea800 = new WorkArea800() ;
  private MciwinReturnedYear800 mciwinReturnedYear800 = new MciwinReturnedYear800() ;
  private MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800() ;
  private MciwinYearToWindow800 mciwinYearToWindow800 = new MciwinYearToWindow800() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("global_ip60001EventLogWorkArea")
  Ip60001EventLogWorkArea ip60001EventLogWorkArea;
  @Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
  Ip996011ProgramStartMessage ip996011ProgramStartMessage;
  
  
  
  
  
  
      public int setParameter(String mciwinYearToWindow800,String mciwinReturnedYear800,String mciwinNewWindowYearGroup800) throws Exception {
      		if(mciwinYearToWindow800 != null)
      		    this.mciwinYearToWindow800.setString(com.cloudframe.app.data.Field.getParm(mciwinYearToWindow800),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(mciwinReturnedYear800 != null)
      		    this.mciwinReturnedYear800.setString(com.cloudframe.app.data.Field.getParm(mciwinReturnedYear800),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(mciwinNewWindowYearGroup800 != null)
      		    this.mciwinNewWindowYearGroup800.setString(com.cloudframe.app.data.Field.getParm(mciwinNewWindowYearGroup800),new String(CONSTANTS.EBCDIC_ENCODING));
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
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
      
// *----------------------------------------------------------------*
// * The main paragraph performs routines to display execution      *
// * messages and validate the parm received.                       *
// *----------------------------------------------------------------*
//  PERFORM 1000-PROCESS-INITIALIZATION
          processInitialization();/*1000-PROCESS-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-MCWIN-MAIN
          mcwinMain();/*2000-MCWIN-MAIN*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void processInitialization() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph,                                                *
// *      1. display execution messages.                            *
// *      2. set procedure pointers.                                *
// *----------------------------------------------------------------*
//  MOVE 300-PGM-MCWIN TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(pad(8,work.getPgmMcwin300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE ZEROES TO RETURN-CODE
          this.setRc(0);
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog();/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
              work.setPtrIp996010800(work.getPgmIp996010300()); 
              
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
          }
//  MOVE ZEROES TO RETURN-CODE
          this.setRc(0);
      
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
      private void displayExecMsgs() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph displays program execution messages.             *
// *----------------------------------------------------------------*
//  MOVE 300-PGM-MCWIN TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(pad(8,work.getPgmMcwin300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_704084476));
      
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
      private void mcwinMain() throws Exception {
      
// ****  Call 800-ptr-ip996010

// *----------------------------------------------------------------*
// *     This paragraph validate the parm received.                 *
// *----------------------------------------------------------------*
//  MOVE ZEROES TO RETURN-CODE
          this.setRc(0);
//  PERFORM 2100-MCWIN-ERROR-MSG-ONE
          mcwinErrorMsgOne();/*2100-MCWIN-ERROR-MSG-ONE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2200-MCWIN-ERROR-MSG-TWO
          mcwinErrorMsgTwo();/*2200-MCWIN-ERROR-MSG-TWO*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2300-MCWIN-ERROR-MSG-THREE
          mcwinErrorMsgThree();/*2300-MCWIN-ERROR-MSG-THREE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2400-MCWIN-PROCESS-CENTURY
          mcwinProcessCentury();/*2400-MCWIN-PROCESS-CENTURY*/
          ;
      
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
      private void mcwinErrorMsgOne() throws Exception {
			// Declare local variables used in the method
			int num00300 = 0;
			int mciwinNewWindowYear800 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *     If no parameters supplied then abend16 to be executed      *
// *----------------------------------------------------------------*
          mciwinNewWindowYear800 = mciwinNewWindowYearGroup800.getMciwinNewWindowYear800();
          num00300 = work.getNum00300();
//  IF 800-MCIWIN-YEAR-TO-WINDOW < 300-NUM-00 OR 800-MCIWIN-NEW-WINDOW-YEAR < 300-NUM-00
          if (compareChars(mciwinYearToWindow800,String.valueOf(work.getNum00300String()).toCharArray()) < 0 || 	( mciwinNewWindowYear800 < num00300 )) { 
              // MOVE 600-ERR-MSG-016 TO 900-ABEND-TEXT
              work.setAbendText900(work.getErrMsg016600());
//  MOVE 300-NUM-16 TO RETURN-CODE
              this.setRc(work.getNum16300());
//  PERFORM 9000-TERMINATE-PROGRAM
              terminateProgram();/*9000-TERMINATE-PROGRAM*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
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
      private void mcwinErrorMsgTwo() throws Exception {
			// Declare local variables used in the method
			int mciwinNewWindowYear800 = 0;
			int num00300 = 0;
			int num99300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *  If window year passed through parm is falling in the range    *
// *  0>>parm3>>99 then abend08 to execute else clear the           *
// *  mciwin-returned-year with spaces                              *
// *----------------------------------------------------------------*
          mciwinNewWindowYear800 = mciwinNewWindowYearGroup800.getMciwinNewWindowYear800();
          num00300 = work.getNum00300();
          num99300 = work.getNum99300();
//  IF 800-MCIWIN-NEW-WINDOW-YEAR < 300-NUM-00 OR 800-MCIWIN-NEW-WINDOW-YEAR > 300-NUM-99
          if (	( mciwinNewWindowYear800 < num00300 ) || 	( mciwinNewWindowYear800 > num99300 )) { 
              // MOVE SPACES TO MCIWIN-RETURNED-YEAR
              work.setMciwinReturnedYear(CONSTANTS.SPACE_4);
              // MOVE 600-ERR-MSG-008 TO 900-ABEND-TEXT
              work.setAbendText900(work.getErrMsg008600());
//  MOVE 300-NUM-08 TO RETURN-CODE
              this.setRc(work.getNum08300());
//  PERFORM 9000-TERMINATE-PROGRAM
              terminateProgram();/*9000-TERMINATE-PROGRAM*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
//  ELSE
          else { 
//  MOVE 800-MCIWIN-NEW-WINDOW-YEAR TO 800-YEAR-VALUE
              workArea800.setYearValue800(mciwinNewWindowYearGroup800.getMciwinNewWindowYear800());
          }
      
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
      private void mcwinErrorMsgThree() throws Exception {
			// Declare local variables used in the method
			long currYear1800 = 0;
			int num00300 = 0;
			int num99300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *   If an invalid packed value then abend04 to be executed       *
// *----------------------------------------------------------------*
          // MOVE 800-MCIWIN-YEAR-TO-WINDOW TO 800-CURR-YEAR1
          workArea800.replace(padSpaces(6,mciwinYearToWindow800.toCharArray()), /* beginIndex */2, /* length */6);
          num00300 = work.getNum00300();
          num99300 = work.getNum99300();
          currYear1800 = workArea800.getCurrYear1800();
//  IF 800-CURR-YEAR1 (1 : 2) < 300-NUM-00 OR 800-CURR-YEAR1 (1 : 2) > 300-NUM-99
          if (compareChars(substring(workArea800.getCurrYear1800String(),0,2),String.valueOf(work.getNum00300String()).toCharArray()) < 0 || compareChars(substring(workArea800.getCurrYear1800String(),0,2),String.valueOf(work.getNum99300String()).toCharArray()) > 0) { 
              // MOVE 600-ERR-MSG-004 TO 900-ABEND-TEXT
              work.setAbendText900(work.getErrMsg004600());
//  MOVE 300-NUM-04 TO RETURN-CODE
              this.setRc(work.getNum04300());
//  PERFORM 9000-TERMINATE-PROGRAM
              terminateProgram();/*9000-TERMINATE-PROGRAM*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
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
      private void mcwinProcessCentury() throws Exception {
			// Declare local variables used in the method
			int yearValue800 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *                  Century conversion
// *-----------------------------------------------------------------
//  MOVE 800-MCIWIN-YEAR-TO-WINDOW (1 : 2) TO 800-MCIWIN-RET-YEAR-L2
          mciwinReturnedYear800.setMciwinRetYearL2800(CFUtil.getInt(substring(mciwinYearToWindow800.getCharArray(),0,2)));
          yearValue800 = workArea800.getYearValue800();
//  IF 800-MCIWIN-YEAR-TO-WINDOW < 800-YEAR-VALUE
          if (compareChars(mciwinYearToWindow800,String.valueOf(workArea800.getYearValue800String()).toCharArray()) < 0) { 
//  MOVE 300-NUM-20 TO 800-MCIWIN-RET-CENTURY
              mciwinReturnedYear800.setMciwinRetCentury800(work.getNum20300());
          }
  
//  ELSE
          else { 
//  MOVE 300-NUM-19 TO 800-MCIWIN-RET-CENTURY
              mciwinReturnedYear800.setMciwinRetCentury800(work.getNum19300());
          }
      
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
      private void terminateProgram() throws Exception {
      
// *----------------------------------------------------------------*
// *                  Exit para                                     *
// *-----------------------------------------------------------------
//  DISPLAY 900-ABEND-TEXT
          logger.info(new String(work.getAbendText900())); 
//  EXIT PROGRAM
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void updateEventLog() throws Exception {
			// Declare local variables used in the method
			long ip60001Subscript = 0;
			// End of variable declaration

      
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
            mciwinYearToWindow800.set((Field)params[0]);
         if (len > 1 && params[1] != null )
            mciwinReturnedYear800.set((Field)params[1]);
         if (len > 2 && params[2] != null )
            mciwinNewWindowYearGroup800.set((Field)params[2]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof MciwinYearToWindow800) {
                       	this.mciwinYearToWindow800 = ((MciwinYearToWindow800) parameters[index]);
                  	} else {
                       	this.mciwinYearToWindow800.set(parameters[index]);
                  	}
                  }
                
                  break;
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof MciwinReturnedYear800) {
                       	this.mciwinReturnedYear800 = ((MciwinReturnedYear800) parameters[index]);
                  	} else {
                       	this.mciwinReturnedYear800.set(parameters[index]);
                  	}
                  }
                
                  break;
              case 2:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof MciwinNewWindowYearGroup800) {
                       	this.mciwinNewWindowYearGroup800 = ((MciwinNewWindowYearGroup800) parameters[index]);
                  	} else {
                       	this.mciwinNewWindowYearGroup800.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
