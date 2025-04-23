  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip67002Ccyy2Redefined;
  import com.cloudframe.app.global.sharedvar.Ip67002Jddd2;
  import com.cloudframe.app.global.sharedvar.Ip67002Jddd;
  import com.cloudframe.app.global.sharedvar.Ip67002Date2Redefined;
  import com.cloudframe.app.global.sharedvar.Ip67002DateRedefined;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.global.sharedvar.Ip67002DateRedefined02;
  import com.cloudframe.app.global.sharedvar.Ip67002Mmdd;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.global.sharedvar.Ip67002Yyddd;
  import com.cloudframe.app.global.sharedvar.Ip67002DateRedefined01;
  import com.cloudframe.app.global.sharedvar.Ip67002Hhmm;
  import com.cloudframe.app.global.sharedvar.Ip67002UtcOffsetHhmm;
  import com.cloudframe.app.global.sharedvar.Ip67002Date2Redefined01;
  import com.cloudframe.app.ip670010.dto.CtcMmdd802;
  import com.cloudframe.app.ip670010.dto.CtcJddd802;
  import com.cloudframe.app.global.sharedvar.Ip67002CcyyRedefined;
  import com.cloudframe.app.ip670010.dto.*;
  import com.cloudframe.app.ip670010.dto.FormatedJulDate800;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
  import com.cloudframe.app.ip670010.dto.CtcDate802;
  import com.cloudframe.app.ip670010.dto.DaysOfMonthsGroup300;
  import com.cloudframe.app.ip670010.dto.CtcCcyy2Group802;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip670010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip670010")
  
  public class Ip670010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip670010.class);
  
  private FormatedJulDate800 formatedJulDate800 = new FormatedJulDate800() ;
  private CtcDate802 ctcDate802 = new CtcDate802() ;
  private DaysOfMonthsGroup300 daysOfMonthsGroup300 = new DaysOfMonthsGroup300() ;
  private CtcCcyy2Group802 ctcCcyy2Group802 = new CtcCcyy2Group802() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  
  
  
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
      
// *----------------------------------------------------------------
// *This paragraph calls a routine which checks if the edit is being
// *called for the first time or not. it calls another routine to
// *perform requested date related functions.
// *----------------------------------------------------------------
//  PERFORM 1000-INITIALIZATION
          initialization();/*1000-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-CONTROL-FUNCTIONALITY
          controlFunctionality();/*2000-CONTROL-FUNCTIONALITY*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZATION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isItFirstTime100               COBOL Name: 100-IS-IT-FIRST-TIME
      *
      * Output :  

      * - isItFirstTime100               COBOL Name: 100-IS-IT-FIRST-TIME
      * - isItLeapYear100                COBOL Name: 100-IS-IT-LEAP-YEAR
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void initialization() throws Exception {
      
// *----------------------------------------------------------------
// *All the initialization activities are done in this paragraph,
// *if it is the first time, then it will display log details.
// *----------------------------------------------------------------
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-100-LEAP-YEAR-IS-UNKNOWN TO TRUE
              work.setLeapYearIsUnknown88100True(); 
              
          }
//  MOVE ZERO TO RETURN-CODE
          this.setRc(0);
      
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip670010300                    COBOL Name: 300-IP670010
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - ip670010300                    COBOL Name: 300-IP670010
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      *
      * @throws CFException
      */
      private void displayExecMsgs() throws Exception {

// *----------------------------------------------------------------
// *     This paragraph displays program start and compiled message
// *----------------------------------------------------------------
//  MOVE 300-IP670010 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getIp670010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
//  MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CONSTANTS.LITERAL_218873021);
//  DISPLAY 'IN IP670010 - COMMENTED IP996010 CALL'
          logger.info("IN IP670010 - COMMENTED IP996010 CALL"); 
      
      }
      /**
      * controlFunctionality 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-CONTROL-FUNCTIONALITY COBOL Cyclomatic complexity - 14
      * Input  :  

      * - ip67002Cntl                    COBOL Name: IP67002-CNTL
      * - invalidCallMessage600          COBOL Name: 600-INVALID-CALL-MESSAGE
      *
      * Output : None 

      * @throws CFException
      */
      private void controlFunctionality() throws Exception {
      
// *----------------------------------------------------------------
// *The following paragraph checks the requested functionality and
// *performs the routines accordingly.
// *----------------------------------------------------------------
//  EVALUATE TRUE
          if  ( ip67002DateParm.isIp67002JulianDatesSpan88()  ) { 
//  PERFORM 2100-COMPARE-JULIAN-DATES
              compareJulianDates();/*2100-COMPARE-JULIAN-DATES*/
          }
          else if  ( ip67002DateParm.isIp67002ConvertFromJulian88()  ) { 
//  PERFORM 2200-CONVERT-FROM-JULIAN
              convertFromJulian();/*2200-CONVERT-FROM-JULIAN*/
          }
          else if  ( ip67002DateParm.isIp67002ConvertToJulian88()  ) { 
//  PERFORM 2300-CONVERT-TO-JULIAN
              convertToJulian();/*2300-CONVERT-TO-JULIAN*/
          }
          else if  ( ip67002DateParm.isIp67002GetCalendarDow88()  ) { 
//  PERFORM 2400-GET-CALENDAR-DOW
              getCalendarDow();/*2400-GET-CALENDAR-DOW*/
          }
          else if  ( ip67002DateParm.isIp67002ValidateDate88()  ) { 
//  PERFORM 8100-VALIDATE-DATE
              validateDate();/*8100-VALIDATE-DATE*/
          }
          else if  ( ip67002DateParm.isIp67002GetDtBeforeSpan88()  ) { 
//  PERFORM 2500-GET-DATE-BEFORE-SPAN
              getDateBeforeSpan();/*2500-GET-DATE-BEFORE-SPAN*/
          }
          else if  ( ip67002DateParm.isIp67002GetAbsOfGregDt88()  ) { 
//  PERFORM 2600-GET-ABSOLUTE-DATE-GREG
              getAbsoluteDateGreg();/*2600-GET-ABSOLUTE-DATE-GREG*/
          }
          else if  ( ip67002DateParm.isIp67002GetAbsOfJulDt88()  ) { 
//  PERFORM 2700-GET-ABSOLUTE-DATE-JUL
              getAbsoluteDateJul();/*2700-GET-ABSOLUTE-DATE-JUL*/
          }
          else if  ( ip67002DateParm.isIp67002GetGregOfAbsDt88()  ) { 
//  PERFORM 2800-GET-GREG-FROM-ABS-DT
              getGregFromAbsDt();/*2800-GET-GREG-FROM-ABS-DT*/
          }
          else if  ( ip67002DateParm.isIp67002GetJulOfAbsDt88()  ) { 
//  PERFORM 2900-GET-JUL-FROM-ABS-DT
              getJulFromAbsDt();/*2900-GET-JUL-FROM-ABS-DT*/
          }
          else if  ( ip67002DateParm.isIp67002GetUtcDtTm88()  ) { 
//  PERFORM 3000-GET-UTC-DT-TM
              getUtcDtTm();/*3000-GET-UTC-DT-TM*/
          }
          else if  ( ip67002DateParm.isIp67002AddonGregJulDow88()  ) { 
//  PERFORM 3200-GET-ADDON-GREG-JUL-DOW
              getAddonGregJulDow();/*3200-GET-ADDON-GREG-JUL-DOW*/
          }
          else   { 
//  DISPLAY 600-INVALID-CALL-MESSAGE
              logger.info(new String(work.getInvalidCallMessage600())); 
          }
      
      }
      /**
      * compareJulianDates 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-COMPARE-JULIAN-DATES COBOL Cyclomatic complexity - 7
      * Input  :  

      * - ip67002Cc2                     COBOL Name: IP67002-CC-2
      * - ctcCc2802                      COBOL Name: 802-CTC-CC-2
      * - ip67002Yy2                     COBOL Name: IP67002-YY-2
      * - value49300                     COBOL Name: 300-VALUE-49
      * - value19300                     COBOL Name: 300-VALUE-19
      * - value20300                     COBOL Name: 300-VALUE-20
      * - ip67002JDdd01                  COBOL Name: IP67002-J-DDD
      * - ip67002JDdd201                 COBOL Name: IP67002-J-DDD-2
      * - ip67002Ccyy2                   COBOL Name: IP67002-CCYY-2
      * - value1300                      COBOL Name: 300-VALUE-1
      * - value365300                    COBOL Name: 300-VALUE-365
      * - value366300                    COBOL Name: 300-VALUE-366
      * - ip67002Ccyy                    COBOL Name: IP67002-CCYY
      *
      * Output :  

      * - ctcCcx2802                     COBOL Name: 802-CTC-CCX-2
      * - ip67002Cc2                     COBOL Name: IP67002-CC-2
      * - value19300                     COBOL Name: 300-VALUE-19
      * - value20300                     COBOL Name: 300-VALUE-20
      * - workYear2801                   COBOL Name: 801-WORK-YEAR-2
      * - ip67002Yy2                     COBOL Name: IP67002-YY-2
      * - workRemainder2801              COBOL Name: 801-WORK-REMAINDER-2
      * - ip67002Ccyy2                   COBOL Name: IP67002-CCYY-2
      * - ip67002JDdd201                 COBOL Name: IP67002-J-DDD-2
      * - ip67002Ccyy                    COBOL Name: IP67002-CCYY
      * - ip67002JDdd01                  COBOL Name: IP67002-J-DDD
      *
      * @throws CFException
      */
      private void compareJulianDates() throws Exception {
			// Declare local variables used in the method
			Ip67002Ccyy2Redefined ip67002Ccyy2Redefined = ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined();
			char[] ctcCcx2802 = null;
			int ctcCc2802 = 0;
			int ip67002Yy2 = 0;
			int value49300 = 0;
			int ip67002JDdd01 = 0;
			int ip67002JDdd201 = 0;
			int workRemainder2801 = 0;
			Ip67002Jddd2 ip67002Jddd2 = ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2();
			Ip67002Jddd ip67002Jddd = ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd();
			Ip67002Date2Redefined ip67002Date2Redefined = ip67002DateParm.getIp67002Date2Redefined();
			Ip67002DateRedefined ip67002DateRedefined = ip67002DateParm.getIp67002DateRedefined();
			// End of variable declaration

      
// *----------------------------------------------------------------
// *The following routine gives the span between two julian dates.
// *----------------------------------------------------------------
//  MOVE IP67002-CC-2 TO 802-CTC-CCX-2
          ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(String.valueOf(ip67002Ccyy2Redefined.getIp67002Cc2String()).toCharArray());
  
//  IF 802-CTC-CCX-2 NUMERIC OR 802-CTC-CC-2 GREATER THAN ZEROES
          ctcCc2802 = ctcCcyy2Group802.getCtcCcyy2802Redefined().getCtcCc2802();
          ctcCcx2802 = ctcCcyy2Group802.getCtcCcyy2802Redefined().getCtcCcx2802();
//  ELSE
          if (    !( isNumeric(ctcCcx2802) ) && 	( ctcCc2802 <= 0 )) { 
              value49300 = work.getValue49300();
              ip67002Yy2 = ip67002Ccyy2Redefined.getIp67002Yy2();
//  IF IP67002-YY-2 GREATER THAN 300-VALUE-49
              if (	( ip67002Yy2 > value49300 )) { 
//  MOVE 300-VALUE-19 TO IP67002-CC-2
                  ip67002Ccyy2Redefined.setIp67002Cc2(work.getValue19300());
  
              }
  
//  ELSE
              else { 
//  MOVE 300-VALUE-20 TO IP67002-CC-2
                  ip67002Ccyy2Redefined.setIp67002Cc2(work.getValue20300());
  
              }
          }
  
//  MOVE IP67002-YY-2 TO 801-WORK-YEAR-2
          work.setWorkYear2801(ip67002Ccyy2Redefined.getIp67002Yy2());
  
//  DIVIDE 801-WORK-YEAR-2 BY 300-VALUE-4 GIVING 801-WORK-YEAR-2 REMAINDER 801-WORK-REMAINDER-2
          work.setWorkRemainder2801( (int) work.getWorkYear2801()%work.getValue4300());
          work.setWorkYear2801( (int) work.getWorkYear2801()/work.getValue4300());
//  IF IP67002-J-DDD LESS THAN IP67002-J-DDD-2 OR IP67002-J-DDD EQUAL IP67002-J-DDD-2
          ip67002JDdd01 = ip67002Jddd.getIp67002JDdd01();
          ip67002JDdd201 = ip67002Jddd2.getIp67002JDdd201();
//  ELSE
          if (	( ip67002JDdd01 >= ip67002JDdd201 ) && 	( ip67002JDdd01 != ip67002JDdd201 )) { 
//  SUBTRACT 300-VALUE-1 FROM IP67002-CCYY-2
              ip67002Date2Redefined.setIp67002Ccyy2(Math.abs(ip67002Date2Redefined.getIp67002Ccyy2()-work.getValue1300()));
  
              workRemainder2801 = work.getWorkRemainder2801();
//  IF 801-WORK-REMAINDER-2 EQUAL ZEROS
              if (	( workRemainder2801 == 0 )) { 
//  ADD 300-VALUE-365 TO IP67002-J-DDD-2
                  ip67002Jddd2.setIp67002JDdd201(ip67002Jddd2.getIp67002JDdd201()+work.getValue365300());
  
              }
  
//  ELSE
              else { 
//  ADD 300-VALUE-366 TO IP67002-J-DDD-2
                  ip67002Jddd2.setIp67002JDdd201(ip67002Jddd2.getIp67002JDdd201()+work.getValue366300());
  
              }
          }
  
//  SUBTRACT IP67002-CCYY-2 FROM IP67002-CCYY GIVING IP67002-CCYY
          ip67002DateRedefined.setIp67002Ccyy(Math.abs(ip67002DateRedefined.getIp67002Ccyy()-ip67002Date2Redefined.getIp67002Ccyy2()));
  
//  SUBTRACT IP67002-J-DDD-2 FROM IP67002-J-DDD GIVING IP67002-J-DDD
          ip67002Jddd.setIp67002JDdd01(Math.abs(ip67002Jddd.getIp67002JDdd01()-ip67002Jddd2.getIp67002JDdd201()));
  
      
      }
      /**
      * convertFromJulian 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-CONVERT-FROM-JULIAN COBOL Cyclomatic complexity - 2
      * Input  :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      *
      * Output :  

      * - formatedJulDate800             COBOL Name: 800-FORMATED-JUL-DATE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - integerDate800                 COBOL Name: 800-INTEGER-DATE
      * - gregorianDateCal800            COBOL Name: 800-GREGORIAN-DATE-CAL
      *
      * @throws CFException
      */
      private void convertFromJulian() throws Exception {
      
// *-----------------------------------------------------------------
// *The following routine converts julian date to calendar date after
// *necessary validations.
// *-----------------------------------------------------------------
//  PERFORM 8400-VALIDATE-JUL-DATE
          validateJulDate();/*8400-VALIDATE-JUL-DATE*/
//  IF RETURN-CODE EQUAL ZERO
          if (	( getRc() == 0 )) { 
//  MOVE IP67002-DATE TO 800-FORMATED-JUL-DATE
              formatedJulDate800.setString(String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray());
              work.setIntegerDate800((long)Math.abs(CFUtil.integerOfDay((int) formatedJulDate800.getJulianDate800())));
              work.setGregorianDateCal800((long)Math.abs(CFUtil.dateOfInteger((int) work.getIntegerDate800())));
//  MOVE 800-GREGORIAN-DATE-CAL TO IP67002-DATE
              ip67002DateParm.setIp67002Date(work.getGregorianDateCal800());
          }
      
      }
      /**
      * convertToJulian 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-CONVERT-TO-JULIAN COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip67002Yymmdd                  COBOL Name: IP67002-YYMMDD
      * - value99300                     COBOL Name: 300-VALUE-99
      * - ip67002Dd                      COBOL Name: IP67002-DD
      * - value5300                      COBOL Name: 300-VALUE-5
      * - isItLeapYear100                COBOL Name: 100-IS-IT-LEAP-YEAR
      * - value12300                     COBOL Name: 300-VALUE-12
      * - value11300                     COBOL Name: 300-VALUE-11
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - value99300                     COBOL Name: 300-VALUE-99
      * - value5300                      COBOL Name: 300-VALUE-5
      * - value12300                     COBOL Name: 300-VALUE-12
      * - value11300                     COBOL Name: 300-VALUE-11
      *
      * @throws CFException
      */
      private void convertToJulian() throws Exception {
			// Declare local variables used in the method
			Ip67002DateRedefined02 ip67002DateRedefined02 = ip67002DateParm.getIp67002DateRedefined02();
			char[] ip67002Yymmdd = null;
			Ip67002Mmdd ip67002Mmdd = ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd();
			int ip67002Dd = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *The following routine validates the calendar date and converts it
// *to julian date.
// *-----------------------------------------------------------------
          ip67002Yymmdd = ip67002DateRedefined02.getIp67002Yymmdd();
//  IF IP67002-YYMMDD IS NOT NUMERIC OR IP67002-YYMMDD IS EQUAL TO ZERO
          if (    !( isNumeric(ip67002Yymmdd) ) || ( allZeros(ip67002Yymmdd) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              this.setRc(work.getValue99300());
          }
  
//  ELSE
          else { 
              ip67002Dd = ip67002Mmdd.getIp67002Dd();
//  IF IP67002-DD EQUAL ZEROS
              if (	( ip67002Dd == 0 )) { 
//  MOVE 300-VALUE-5 TO RETURN-CODE
                  this.setRc(work.getValue5300());
              }
  
//  ELSE
              else { 
//  PERFORM 8100-VALIDATE-DATE
                  validateDate();/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL ZEROS
                  if (	( getRc() == 0 )) { 
//  PERFORM 2310-GREG-TO-JUL-CONVERSION
                      gregToJulConversion();/*2310-GREG-TO-JUL-CONVERSION*/
                  }
//  ELSE
                  else { 
//  IF 88-100-IT-IS-LEAP-YEAR
                      if ( work.isItIsLeapYear88100()  ) { 
//  MOVE 300-VALUE-12 TO RETURN-CODE
                          this.setRc(work.getValue12300());
                      }
//  ELSE
                      else { 
//  MOVE 300-VALUE-11 TO RETURN-CODE
                          this.setRc(work.getValue11300());
                      }
                  }
              }
          }
      
      }
      /**
      * gregToJulConversion 
      *   This method is derived from 
  *   COBOL Paragraph - 2310-GREG-TO-JUL-CONVERSION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - formatedJulDate800             COBOL Name: 800-FORMATED-JUL-DATE
      *
      * Output :  

      * - gregorianDateCal800            COBOL Name: 800-GREGORIAN-DATE-CAL
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - integerDate800                 COBOL Name: 800-INTEGER-DATE
      * - julianDateCal800               COBOL Name: 800-JULIAN-DATE-CAL
      * - julianDate800                  COBOL Name: 800-JULIAN-DATE
      * - formatedJulDate800             COBOL Name: 800-FORMATED-JUL-DATE
      *
      * @throws CFException
      */
      private void gregToJulConversion() throws Exception {
      
// *-----------------------------------------------------------------
// *This routine converts calendar date to julian date.
// *-----------------------------------------------------------------
//  MOVE IP67002-DATE TO 800-GREGORIAN-DATE-CAL
          work.setGregorianDateCal800(ip67002DateParm.getIp67002Date());
          work.setIntegerDate800((long)Math.abs(CFUtil.integerOfDate((int) work.getGregorianDateCal800())));
          work.setJulianDateCal800((long)Math.abs(CFUtil.dayOfInteger((int) work.getIntegerDate800())));
          // MOVE 800-JULIAN-DATE-CAL TO 800-JULIAN-DATE
          formatedJulDate800.setJulianDate800(work.getJulianDateCal800());
//  MOVE 800-FORMATED-JUL-DATE TO IP67002-DATE
          ip67002DateParm.setIp67002Date(formatedJulDate800.toCharArray());
      
      }
      /**
      * getCalendarDow 
      *   This method is derived from 
  *   COBOL Paragraph - 2400-GET-CALENDAR-DOW COBOL Cyclomatic complexity - 3
      * Input  :  

      * - rc                             COBOL Name: RETURN-CODE
      * - value7300                      COBOL Name: 300-VALUE-7
      *
      * Output :  

      * - ip67002DayOfWeek               COBOL Name: IP67002-DAY-OF-WEEK
      * - value7300                      COBOL Name: 300-VALUE-7
      *
      * @throws CFException
      */
      private void getCalendarDow() throws Exception {
			// Declare local variables used in the method
			int ip67002DayOfWeek = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para first performs a para to validate the date. if the date
// *is valid it performs further processing.
// *this para gets the day of week for a particular gregorian date by
// *using the functions 'rem' and 'integer-of-date'. the result is
// *obtained in form of digits from 0-6 indicating the week days from
// *sunday to saturday. in the format to be sent back from the
// *function, digit 7 implies sunday and hence when the day of the
// *week returns value 0 then 7 is moved to the variable.
// *-----------------------------------------------------------------
//  PERFORM 8100-VALIDATE-DATE
          validateDate();/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL ZEROS
          if (	( getRc() == 0 )) { 
//  MOVE ZEROS TO IP67002-DAY-OF-WEEK
              ip67002DateParm.setIp67002DayOfWeek(0);
              ip67002DateParm.setIp67002DayOfWeek((int)Math.abs((int) CFUtil.integerOfDate((int) ip67002DateParm.getIp67002Date()) % work.getValue7300()));
              ip67002DayOfWeek = ip67002DateParm.getIp67002DayOfWeek();
//  IF IP67002-DAY-OF-WEEK EQUAL TO ZERO
              if (	( ip67002DayOfWeek == 0 )) { 
//  MOVE 300-VALUE-7 TO IP67002-DAY-OF-WEEK
                  ip67002DateParm.setIp67002DayOfWeek(work.getValue7300());
              }
  
          }
      
      }
      /**
      * getDateBeforeSpan 
      *   This method is derived from 
  *   COBOL Paragraph - 2500-GET-DATE-BEFORE-SPAN COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip67002Ddd                     COBOL Name: IP67002-DDD
      * - ip67002JulianDaysSpan          COBOL Name: IP67002-JULIAN-DAYS-SPAN
      *
      * Output :  

      * - ip67002Ddd                     COBOL Name: IP67002-DDD
      *
      * @throws CFException
      */
      private void getDateBeforeSpan() throws Exception {
			// Declare local variables used in the method
			Ip67002Yyddd ip67002Yyddd = ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd();
			int ip67002Ddd = 0;
			short ip67002JulianDaysSpan = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph determines the julian date, which is behind the
// *julian date given in the field ip67002-ccyyddd, by the number of
// *days specified in the field ip67002-julian-days-span.
// *-----------------------------------------------------------------
          ip67002Ddd = ip67002Yyddd.getIp67002Ddd();
          ip67002JulianDaysSpan = ip67002DateParm.getIp67002JulianDaysSpan();
//  IF IP67002-DDD <= IP67002-JULIAN-DAYS-SPAN
          if (	( ip67002Ddd <= ip67002JulianDaysSpan ) ) { 
//  PERFORM 2510-GET-PREVIOUS-YEAR-DATE UNTIL IP67002-DDD GREATER THAN IP67002-JULIAN-DAYS-SPAN
              while (	( ip67002Yyddd.getIp67002Ddd() <= ip67002DateParm.getIp67002JulianDaysSpan() ) ) {
                 getPreviousYearDate();/*2510-GET-PREVIOUS-YEAR-DATE*/
              }
  
          }
  
//  SUBTRACT IP67002-JULIAN-DAYS-SPAN FROM IP67002-DDD
          ip67002Yyddd.setIp67002Ddd(Math.abs(ip67002Yyddd.getIp67002Ddd()-ip67002DateParm.getIp67002JulianDaysSpan()));
  
      
      }
      /**
      * getPreviousYearDate 
      *   This method is derived from 
  *   COBOL Paragraph - 2510-GET-PREVIOUS-YEAR-DATE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip67002Ccyy                    COBOL Name: IP67002-CCYY
      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip67002YyJul                   COBOL Name: IP67002-YY-JUL
      * - ip67002Ddd                     COBOL Name: IP67002-DDD
      * - value366300                    COBOL Name: 300-VALUE-366
      * - value365300                    COBOL Name: 300-VALUE-365
      *
      * Output :  

      * - ip67002Ccyy                    COBOL Name: IP67002-CCYY
      * - workYear801                    COBOL Name: 801-WORK-YEAR
      * - ip67002YyJul                   COBOL Name: IP67002-YY-JUL
      * - workRemainder801               COBOL Name: 801-WORK-REMAINDER
      * - ip67002Ddd                     COBOL Name: IP67002-DDD
      *
      * @throws CFException
      */
      private void getPreviousYearDate() throws Exception {
			// Declare local variables used in the method
			Ip67002DateRedefined ip67002DateRedefined = ip67002DateParm.getIp67002DateRedefined();
			Ip67002Yyddd ip67002Yyddd = ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd();
			int workRemainder801 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph determines the julian date, which is behind the
// *given julian date by the specified number of days, if it falls on
// *the previous year of the given date.
// *-----------------------------------------------------------------
//  SUBTRACT 300-VALUE-1 FROM IP67002-CCYY
          ip67002DateRedefined.setIp67002Ccyy(Math.abs(ip67002DateRedefined.getIp67002Ccyy()-work.getValue1300()));
  
//  MOVE IP67002-YY-JUL TO 801-WORK-YEAR
          work.setWorkYear801(ip67002Yyddd.getIp67002YyJul());
  
//  DIVIDE 801-WORK-YEAR BY 300-VALUE-4 GIVING 801-WORK-YEAR REMAINDER 801-WORK-REMAINDER
          work.setWorkRemainder801( (int) work.getWorkYear801()%work.getValue4300());
          work.setWorkYear801( (int) work.getWorkYear801()/work.getValue4300());
          workRemainder801 = work.getWorkRemainder801();
//  IF 801-WORK-REMAINDER EQUAL ZEROS
          if (	( workRemainder801 == 0 )) { 
//  ADD 300-VALUE-366 TO IP67002-DDD
              ip67002Yyddd.setIp67002Ddd(ip67002Yyddd.getIp67002Ddd()+work.getValue366300());
  
          }
  
//  ELSE
          else { 
//  ADD 300-VALUE-365 TO IP67002-DDD
              ip67002Yyddd.setIp67002Ddd(ip67002Yyddd.getIp67002Ddd()+work.getValue365300());
  
          }
      
      }
      /**
      * getAbsoluteDateGreg 
      *   This method is derived from 
  *   COBOL Paragraph - 2600-GET-ABSOLUTE-DATE-GREG COBOL Cyclomatic complexity - 2
      * Input  :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      *
      * Output :  

      * - gregorianDateCal800            COBOL Name: 800-GREGORIAN-DATE-CAL
      * - ip67002Date                    COBOL Name: IP67002-DATE
      *
      * @throws CFException
      */
      private void getAbsoluteDateGreg() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph determines the absolute date for gerg date.
// *-----------------------------------------------------------------
//  PERFORM 8100-VALIDATE-DATE
          validateDate();/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL TO ZEROES
          if (	( getRc() == 0 )) { 
//  MOVE IP67002-DATE TO 800-GREGORIAN-DATE-CAL
              work.setGregorianDateCal800(ip67002DateParm.getIp67002Date());
              ip67002DateParm.setIp67002Date((long)Math.abs(CFUtil.integerOfDate((int) work.getGregorianDateCal800())));
          }
      
      }
      /**
      * getAbsoluteDateJul 
      *   This method is derived from 
  *   COBOL Paragraph - 2700-GET-ABSOLUTE-DATE-JUL COBOL Cyclomatic complexity - 2
      * Input  :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip67002Ccyyddd                 COBOL Name: IP67002-CCYYDDD
      *
      * Output :  

      * - julianDate800                  COBOL Name: 800-JULIAN-DATE
      * - ip67002Ccyyddd                 COBOL Name: IP67002-CCYYDDD
      * - ip67002Date                    COBOL Name: IP67002-DATE
      *
      * @throws CFException
      */
      private void getAbsoluteDateJul() throws Exception {
			// Declare local variables used in the method
			Ip67002DateRedefined01 ip67002DateRedefined01 = ip67002DateParm.getIp67002DateRedefined01();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph determines the absolute date for julian date.
// *-----------------------------------------------------------------
//  PERFORM 8400-VALIDATE-JUL-DATE
          validateJulDate();/*8400-VALIDATE-JUL-DATE*/
//  IF RETURN-CODE EQUAL ZEROS
          if (	( getRc() == 0 )) { 
              // MOVE IP67002-CCYYDDD TO 800-JULIAN-DATE
              formatedJulDate800.replace(padSpaces(7,ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().toCharArray()), /* beginIndex */0, /* length */7);
  
              ip67002DateParm.setIp67002Date((long)Math.abs(CFUtil.integerOfDay((int) formatedJulDate800.getJulianDate800())));
          }
      
      }
      /**
      * getGregFromAbsDt 
      *   This method is derived from 
  *   COBOL Paragraph - 2800-GET-GREG-FROM-ABS-DT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - value98300                     COBOL Name: 300-VALUE-98
      *
      * Output :  

      * - integerDate800                 COBOL Name: 800-INTEGER-DATE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - rc                             COBOL Name: RETURN-CODE
      * - value98300                     COBOL Name: 300-VALUE-98
      *
      * @throws CFException
      */
      private void getGregFromAbsDt() throws Exception {
			// Declare local variables used in the method
			long ip67002Date = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph determines the gregorian date from absolute date.
// *-----------------------------------------------------------------
          ip67002Date = ip67002DateParm.getIp67002Date();
//  IF IP67002-DATE NUMERIC
          if (        ip67002DateParm.ip67002DateIsNumeric() ) { 
//  MOVE IP67002-DATE TO 800-INTEGER-DATE
              work.setIntegerDate800(ip67002DateParm.getIp67002Date());
              ip67002DateParm.setIp67002Date((long)Math.abs(CFUtil.dateOfInteger((int) work.getIntegerDate800())));
          }
  
//  ELSE
          else { 
//  MOVE 300-VALUE-98 TO RETURN-CODE
              this.setRc(work.getValue98300());
          }
      
      }
      /**
      * getJulFromAbsDt 
      *   This method is derived from 
  *   COBOL Paragraph - 2900-GET-JUL-FROM-ABS-DT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - formatedJulDate800             COBOL Name: 800-FORMATED-JUL-DATE
      * - value98300                     COBOL Name: 300-VALUE-98
      *
      * Output :  

      * - integerDate800                 COBOL Name: 800-INTEGER-DATE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - julianDate800                  COBOL Name: 800-JULIAN-DATE
      * - formatedJulDate800             COBOL Name: 800-FORMATED-JUL-DATE
      * - rc                             COBOL Name: RETURN-CODE
      * - value98300                     COBOL Name: 300-VALUE-98
      *
      * @throws CFException
      */
      private void getJulFromAbsDt() throws Exception {
			// Declare local variables used in the method
			long ip67002Date = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph determines the julian date from absolute date.
// *-----------------------------------------------------------------
          ip67002Date = ip67002DateParm.getIp67002Date();
//  IF IP67002-DATE NUMERIC
          if (        ip67002DateParm.ip67002DateIsNumeric() ) { 
//  MOVE IP67002-DATE TO 800-INTEGER-DATE
              work.setIntegerDate800(ip67002DateParm.getIp67002Date());
              formatedJulDate800.setJulianDate800((long)Math.abs(CFUtil.dayOfInteger((int) work.getIntegerDate800())));
//  MOVE 800-FORMATED-JUL-DATE TO IP67002-DATE
              ip67002DateParm.setIp67002Date(formatedJulDate800.toCharArray());
          }
  
//  ELSE
          else { 
//  MOVE 300-VALUE-98 TO RETURN-CODE
              this.setRc(work.getValue98300());
          }
      
      }
      /**
      * getUtcDtTm 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-GET-UTC-DT-TM COBOL Cyclomatic complexity - 6
      * Input  :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip67002Hh                      COBOL Name: IP67002-HH
      * - ip67002Mth                     COBOL Name: IP67002-MTH
      * - ip67002UtcOffsetHh             COBOL Name: IP67002-UTC-OFFSET-HH
      * - ip67002UtcOffsetMm             COBOL Name: IP67002-UTC-OFFSET-MM
      * - ip67002UtcOffsetSign           COBOL Name: IP67002-UTC-OFFSET-SIGN
      *
      * Output :  

      * - workHr800                      COBOL Name: 800-WORK-HR
      * - ip67002Hh                      COBOL Name: IP67002-HH
      * - workMin800                     COBOL Name: 800-WORK-MIN
      * - ip67002Mth                     COBOL Name: IP67002-MTH
      * - workOffsetHr800                COBOL Name: 800-WORK-OFFSET-HR
      * - workOffsetMin800               COBOL Name: 800-WORK-OFFSET-MIN
      * - ip67002UtcOffsetHh             COBOL Name: IP67002-UTC-OFFSET-HH
      * - ip67002UtcOffsetMm             COBOL Name: IP67002-UTC-OFFSET-MM
      *
      * @throws CFException
      */
      private void getUtcDtTm() throws Exception {
			// Declare local variables used in the method
			Ip67002Hhmm ip67002Hhmm = ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm();
			Ip67002UtcOffsetHhmm ip67002UtcOffsetHhmm = ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm();
			char[] ip67002UtcOffsetSign = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph returns the utc data and time.
// *-----------------------------------------------------------------
//  PERFORM 8100-VALIDATE-DATE
          validateDate();/*8100-VALIDATE-DATE*/
//  PERFORM 8110-VALIDATE-UTC-OFFSET
          validateUtcOffset();/*8110-VALIDATE-UTC-OFFSET*/
//  IF RETURN-CODE EQUAL ZERO
          if (	( getRc() == 0 )) { 
//  MOVE IP67002-HH TO 800-WORK-HR
              work.setWorkHr800(ip67002Hhmm.getIp67002Hh());
  
//  MOVE IP67002-MTH TO 800-WORK-MIN
              work.setWorkMin800(ip67002Hhmm.getIp67002Mth());
  
              ip67002UtcOffsetSign = ip67002DateParm.getIp67002UtcOffsetSign();
//  EVALUATE TRUE
              if  (	( ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetHh() == 0 ) && 	( ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetMm() == 0 )) { 
                  ;
              }
              else if  (ip67002UtcOffsetSign[0] == '+') { 
//  SUBTRACT IP67002-UTC-OFFSET-HH FROM ZERO GIVING 800-WORK-OFFSET-HR
                  work.setWorkOffsetHr800(0-ip67002UtcOffsetHhmm.getIp67002UtcOffsetHh());
  
//  SUBTRACT IP67002-UTC-OFFSET-MM FROM ZERO GIVING 800-WORK-OFFSET-MIN
                  work.setWorkOffsetMin800(0-ip67002UtcOffsetHhmm.getIp67002UtcOffsetMm());
  
//  PERFORM 3100-CALCULATE-UTC
                  calculateUtc();/*3100-CALCULATE-UTC*/
              }
              else if  (ip67002UtcOffsetSign[0] == '-') { 
//  MOVE IP67002-UTC-OFFSET-HH TO 800-WORK-OFFSET-HR
                  work.setWorkOffsetHr800(ip67002UtcOffsetHhmm.getIp67002UtcOffsetHh());
  
//  MOVE IP67002-UTC-OFFSET-MM TO 800-WORK-OFFSET-MIN
                  work.setWorkOffsetMin800(ip67002UtcOffsetHhmm.getIp67002UtcOffsetMm());
  
//  PERFORM 3100-CALCULATE-UTC
                  calculateUtc();/*3100-CALCULATE-UTC*/
              }
  
          }
      
      }
      /**
      * calculateUtc 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-CALCULATE-UTC COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ip67002Hh                      COBOL Name: IP67002-HH
      * - ip67002Mth                     COBOL Name: IP67002-MTH
      * - workOffsetHr800                COBOL Name: 800-WORK-OFFSET-HR
      * - workOffsetMin800               COBOL Name: 800-WORK-OFFSET-MIN
      *
      * Output :  

      * - integerDate800                 COBOL Name: 800-INTEGER-DATE
      * - workMin800                     COBOL Name: 800-WORK-MIN
      * - ip67002Hh                      COBOL Name: IP67002-HH
      * - ip67002Mth                     COBOL Name: IP67002-MTH
      * - ip67002Date                    COBOL Name: IP67002-DATE
      *
      * @throws CFException
      */
      private void calculateUtc() throws Exception {
			// Declare local variables used in the method
			Ip67002Hhmm ip67002Hhmm = ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm();
			int workMin800 = 0;
			// End of variable declaration

          work.setIntegerDate800((long)Math.abs(CFUtil.integerOfDate((int) ip67002DateParm.getIp67002Date())));
          work.setWorkMin800((int) (ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Hh() * 60 + ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Mth() +  ( work.getWorkOffsetHr800() * 60 )  + work.getWorkOffsetMin800()));
          workMin800 = work.getWorkMin800();
//  EVALUATE TRUE
          if  (	( workMin800 < 0 )) { 
//  SUBTRACT 1 FROM 800-INTEGER-DATE
              work.setIntegerDate800(Math.abs(work.getIntegerDate800()-(long)1));
//  ADD 1440 TO 800-WORK-MIN
              work.setWorkMin800(work.getWorkMin800()+1440);
//  DIVIDE 800-WORK-MIN BY 60 GIVING IP67002-HH REMAINDER IP67002-MTH
              ip67002Hhmm.setIp67002Hh( (int) work.getWorkMin800()/60);
              ip67002Hhmm.setIp67002Mth( (int) work.getWorkMin800()%60);
  
          }
          else if  (	( workMin800 == 0 )) { 
//  MOVE ZERO TO IP67002-HH IP67002-MTH
              ip67002Hhmm.setIp67002Hh(0);
              ip67002Hhmm.setIp67002Mth(0);
  
          }
          else if  (	( workMin800 > 1440 )) { 
//  ADD 1 TO 800-INTEGER-DATE
              work.setIntegerDate800(work.getIntegerDate800()+(long)1);
//  SUBTRACT 1440 FROM 800-WORK-MIN
              work.setWorkMin800(work.getWorkMin800()-1440);
//  DIVIDE 800-WORK-MIN BY 60 GIVING IP67002-HH REMAINDER IP67002-MTH
              ip67002Hhmm.setIp67002Hh( (int) work.getWorkMin800()/60);
              ip67002Hhmm.setIp67002Mth( (int) work.getWorkMin800()%60);
  
          }
          else   { 
//  DIVIDE 800-WORK-MIN BY 60 GIVING IP67002-HH REMAINDER IP67002-MTH
              ip67002Hhmm.setIp67002Hh( (int) work.getWorkMin800()/60);
              ip67002Hhmm.setIp67002Mth( (int) work.getWorkMin800()%60);
  
          }
  
          ip67002DateParm.setIp67002Date((long)Math.abs(CFUtil.dateOfInteger((int) work.getIntegerDate800())));
      
      }
      /**
      * getAddonGregJulDow 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-GET-ADDON-GREG-JUL-DOW COBOL Cyclomatic complexity - 3
      * Input  :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip67002JulianDaysSpan          COBOL Name: IP67002-JULIAN-DAYS-SPAN
      * - value7300                      COBOL Name: 300-VALUE-7
      *
      * Output :  

      * - integerDate800                 COBOL Name: 800-INTEGER-DATE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - julianDate800                  COBOL Name: 800-JULIAN-DATE
      * - ip67002Ccyyddd                 COBOL Name: IP67002-CCYYDDD
      * - ip67002Date2                   COBOL Name: IP67002-DATE-2
      * - ip67002DayOfWeek               COBOL Name: IP67002-DAY-OF-WEEK
      * - value7300                      COBOL Name: 300-VALUE-7
      *
      * @throws CFException
      */
      private void getAddonGregJulDow() throws Exception {
			// Declare local variables used in the method
			Ip67002DateRedefined01 ip67002DateRedefined01 = ip67002DateParm.getIp67002DateRedefined01();
			int ip67002DayOfWeek = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph                                                 *
// * 1. validates the gregorian date passed by the calling program. *
// * 2. determines the date behind (when ip67002-julian-days-span is*
// *    negative) or the date ahead (when ip67002-julian-days-span  *
// *    is positive) of the base date.                              *
// * input:                                                         *
// *    ip67002-date             - base date in gregorian format    *
// *    ip67002-julian-days-span - no. of days to be added or       *
// *                               subtracted                       *
// * output:                                                        *
// *    ip67002-date-2           - derived date in gregorian format *
// *    ip67002-ccyyddd          - derived date in julian format    *
// *    ip67002-day-of-week      - day of week of derived date      *
// *----------------------------------------------------------------*
//  PERFORM 8100-VALIDATE-DATE
          validateDate();/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL ZEROES
          if (	( getRc() == 0 )) { 
              work.setIntegerDate800((long)Math.abs(CFUtil.integerOfDate((int) ip67002DateParm.getIp67002Date())));
//  ADD IP67002-JULIAN-DAYS-SPAN TO 800-INTEGER-DATE
              work.setIntegerDate800(work.getIntegerDate800()+(short) ip67002DateParm.getIp67002JulianDaysSpan());
//  MOVE ZEROES TO IP67002-DATE
              ip67002DateParm.setIp67002Date(0);
              formatedJulDate800.setJulianDate800((long)Math.abs(CFUtil.dayOfInteger((int) work.getIntegerDate800())));
//  MOVE 800-JULIAN-DATE TO IP67002-CCYYDDD
              ip67002DateRedefined01.getIp67002Ccyyddd().setString(String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray());
  
              ip67002DateParm.setIp67002Date2((long)Math.abs(CFUtil.dateOfInteger((int) work.getIntegerDate800())));
              ip67002DateParm.setIp67002DayOfWeek((int)Math.abs(work.getIntegerDate800() % work.getValue7300()));
              ip67002DayOfWeek = ip67002DateParm.getIp67002DayOfWeek();
//  IF IP67002-DAY-OF-WEEK EQUAL ZEROES
              if (	( ip67002DayOfWeek == 0 )) { 
//  MOVE 300-VALUE-7 TO IP67002-DAY-OF-WEEK
                  ip67002DateParm.setIp67002DayOfWeek(work.getValue7300());
              }
  
          }
      
      }
      /**
      * validateDate 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-VALIDATE-DATE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip67002Yymmdd                  COBOL Name: IP67002-YYMMDD
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * @throws CFException
      */
      private void validateDate() throws Exception {
			// Declare local variables used in the method
			Ip67002DateRedefined02 ip67002DateRedefined02 = ip67002DateParm.getIp67002DateRedefined02();
			char[] ip67002Yymmdd = null;
			// End of variable declaration

      
// *----------------------------------------------------------------
// *This para checks if the date is numeric and not equal to zero.
// *if it is then it performs a para to validate the month else it
// *sets return-code to ninety nine.
// *-----------------------------------------------------------------
          ip67002Yymmdd = ip67002DateRedefined02.getIp67002Yymmdd();
//  IF IP67002-YYMMDD IS NUMERIC AND IP67002-YYMMDD IS NOT EQUAL ZERO
          if (    isNumeric(ip67002Yymmdd) && !( allZeros(ip67002Yymmdd) ) /*  !=  zeros*/) { 
//  PERFORM 8500-FIND-CENTURY
              findCentury();/*8500-FIND-CENTURY*/
//  PERFORM 8200-VALIDATE-MONTH
              validateMonth();/*8200-VALIDATE-MONTH*/
          }
  
//  ELSE
          else { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              this.setRc(work.getValue99300());
          }
      
      }
      /**
      * validateUtcOffset 
      *   This method is derived from 
  *   COBOL Paragraph - 8110-VALIDATE-UTC-OFFSET COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ip67002UtcOffsetSign           COBOL Name: IP67002-UTC-OFFSET-SIGN
      * - ip67002UtcOffsetHhmm           COBOL Name: IP67002-UTC-OFFSET-HHMM
      * - ip67002UtcOffsetHh             COBOL Name: IP67002-UTC-OFFSET-HH
      * - ip67002UtcOffsetMm             COBOL Name: IP67002-UTC-OFFSET-MM
      * - value97300                     COBOL Name: 300-VALUE-97
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - value97300                     COBOL Name: 300-VALUE-97
      *
      * @throws CFException
      */
      private void validateUtcOffset() throws Exception {
			// Declare local variables used in the method
			Ip67002Date2Redefined01 ip67002Date2Redefined01 = ip67002DateParm.getIp67002Date2Redefined01();
			Ip67002UtcOffsetHhmm ip67002UtcOffsetHhmm = ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm();
			char[] ip67002UtcOffsetSign = null;
			int ip67002UtcOffsetHh = 0;
			int ip67002UtcOffsetMm = 0;
			// End of variable declaration

//  IF ( IP67002-UTC-OFFSET-SIGN = '+' OR IP67002-UTC-OFFSET-SIGN = '-' ) AND IP67002-UTC-OFFSET-HHMM IS NUMERIC AND IP67002-UTC-OFFSET-HH >= 00 AND IP67002-UTC-OFFSET-HH < 24 AND IP67002-UTC-OFFSET-MM >= 00 AND IP67002-UTC-OFFSET-MM < 60
          ip67002UtcOffsetSign = ip67002DateParm.getIp67002UtcOffsetSign();
          ip67002UtcOffsetHh = ip67002UtcOffsetHhmm.getIp67002UtcOffsetHh();
          ip67002UtcOffsetHhmm = ip67002Date2Redefined01.getIp67002UtcOffsetHhmm();
          ip67002UtcOffsetMm = ip67002UtcOffsetHhmm.getIp67002UtcOffsetMm();
//  ELSE
          if ((ip67002UtcOffsetSign[0] != '+' && ip67002UtcOffsetSign[0] != '-') ||     !( isNumeric(ip67002UtcOffsetHhmm) ) || 	( ip67002UtcOffsetHh < 0 ) || 	( ip67002UtcOffsetHh >= 24 ) || 	( ip67002UtcOffsetMm < 0 ) || 	( ip67002UtcOffsetMm >= 60 )) { 
//  MOVE 300-VALUE-97 TO RETURN-CODE
              this.setRc(work.getValue97300());
          }
  
      
      }
      /**
      * validateMonth 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-VALIDATE-MONTH COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ctcMm802                       COBOL Name: 802-CTC-MM
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * Output :  

      * - validateMonth800               COBOL Name: 800-VALIDATE-MONTH
      * - ctcMm802                       COBOL Name: 802-CTC-MM
      * - rc                             COBOL Name: RETURN-CODE
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * @throws CFException
      */
      private void validateMonth() throws Exception {
			// Declare local variables used in the method
			CtcMmdd802 ctcMmdd802 = ctcDate802.getCtcMmdd802();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para checks if the month is between 1 to 12. if it is then
// *it performs a para to check if the days for that month are valid
// *else it sets return-code to ninety nine.
// *-----------------------------------------------------------------
//  MOVE 802-CTC-MM TO 800-VALIDATE-MONTH
          work.setValidateMonth800(ctcMmdd802.getCtcMm802());
  
//  IF 88-800-VALID-MONTH
          if ( work.isValidMonth88800()  ) { 
//  PERFORM 8210-CHECK-DAYS-OF-MONTH
              checkDaysOfMonth();/*8210-CHECK-DAYS-OF-MONTH*/
          }
//  ELSE
          else { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              this.setRc(work.getValue99300());
//  PERFORM 8300-CHECK-FOR-LEAPYEAR
              checkForLeapyear();/*8300-CHECK-FOR-LEAPYEAR*/
          }
      
      }
      /**
      * checkDaysOfMonth 
      *   This method is derived from 
  *   COBOL Paragraph - 8210-CHECK-DAYS-OF-MONTH COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ctcMm802                       COBOL Name: 802-CTC-MM
      * - value2300                      COBOL Name: 300-VALUE-2
      * - ctcDd802                       COBOL Name: 802-CTC-DD
      * - daysOfAMonth300                COBOL Name: 300-DAYS-OF-A-MONTH
      * - validateMonth800               COBOL Name: 800-VALIDATE-MONTH
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * @throws CFException
      */
      private void checkDaysOfMonth() throws Exception {
			// Declare local variables used in the method
			CtcMmdd802 ctcMmdd802 = ctcDate802.getCtcMmdd802();
			int ctcMm802 = 0;
			int value2300 = 0;
			int ctcDd802 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para checks if the month is february. if it is ,then, a para
// *to check for the leap-year is performed, else for other months, a
// *check is made that the number of days is not greater than maximum
// *number of days for that particular month. if it is then it sets
// *the return-code to ninety nine.
// *-----------------------------------------------------------------
          value2300 = work.getValue2300();
          ctcMm802 = ctcMmdd802.getCtcMm802();
//  IF 802-CTC-MM IS EQUAL TO 300-VALUE-2
          if (	( ctcMm802 == value2300 )) { 
//  PERFORM 8300-CHECK-FOR-LEAPYEAR
              checkForLeapyear();/*8300-CHECK-FOR-LEAPYEAR*/
          }
  
//  ELSE
          else { 
              ctcDd802 = ctcMmdd802.getCtcDd802();
//  IF 802-CTC-DD IS GREATER THAN 300-DAYS-OF-A-MONTH ( 800-VALIDATE-MONTH ) OR EQUAL TO ZEROS
              if (compareChars(ctcMmdd802.getCtcDd802String(),daysOfMonthsGroup300.getMaxDaysOfMonth300().getDaysOfAMonth300(work.getValidateMonth800() - 1)) > 0 || 	( ctcDd802 == 0 )) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
                  this.setRc(work.getValue99300());
//  PERFORM 8300-CHECK-FOR-LEAPYEAR
                  checkForLeapyear();/*8300-CHECK-FOR-LEAPYEAR*/
              }
  
          }
      
      }
      /**
      * checkForLeapyear 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CHECK-FOR-LEAPYEAR COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ctcCcyy802                     COBOL Name: 802-CTC-CCYY
      *
      * Output :  

      * - workYear3801                   COBOL Name: 801-WORK-YEAR-3
      * - workRemainder801               COBOL Name: 801-WORK-REMAINDER
      * - isItLeapYear100                COBOL Name: 100-IS-IT-LEAP-YEAR
      *
      * @throws CFException
      */
      private void checkForLeapyear() throws Exception {
			// Declare local variables used in the method
			int workRemainder801 = 0;
			// End of variable declaration

      
// *Have twenty-nine days, if it is a leap year. if it is not a leap
// *year the month of february will have twenty eight days. this para
// *after checking whether the year is a leap year or not, performs
// *subequent paras to check for the number of days.
// *-----------------------------------------------------------------
//  DIVIDE 802-CTC-CCYY BY 300-VALUE-4 GIVING 801-WORK-YEAR-3 REMAINDER 801-WORK-REMAINDER
          work.setWorkYear3801( (int) ctcDate802.getCtcCcyy802()/work.getValue4300());
          work.setWorkRemainder801( (int) ctcDate802.getCtcCcyy802()%work.getValue4300());
          workRemainder801 = work.getWorkRemainder801();
//  IF 801-WORK-REMAINDER EQUAL TO ZERO
          if (	( workRemainder801 == 0 )) { 
//  DIVIDE 802-CTC-CCYY BY 300-VALUE-100 GIVING 801-WORK-YEAR-3 REMAINDER 801-WORK-REMAINDER
              work.setWorkYear3801( (int) ctcDate802.getCtcCcyy802()/work.getValue100300());
              work.setWorkRemainder801( (int) ctcDate802.getCtcCcyy802()%work.getValue100300());
              workRemainder801 = work.getWorkRemainder801();
//  IF 801-WORK-REMAINDER EQUAL TO ZERO
              if (	( workRemainder801 == 0 )) { 
//  DIVIDE 802-CTC-CCYY BY 300-VALUE-400 GIVING 801-WORK-YEAR-3 REMAINDER 801-WORK-REMAINDER
                  work.setWorkYear3801( (int) ctcDate802.getCtcCcyy802()/work.getValue400300());
                  work.setWorkRemainder801( (int) ctcDate802.getCtcCcyy802()%work.getValue400300());
                  workRemainder801 = work.getWorkRemainder801();
//  IF 801-WORK-REMAINDER EQUAL TO ZERO
                  if (	( workRemainder801 == 0 )) { 
//  SET 88-100-IT-IS-LEAP-YEAR TO TRUE
                      work.setItIsLeapYear88100True(); 
                      
//  PERFORM 8310-CHECK-FOR-29DAYS
                      checkFor29days();/*8310-CHECK-FOR-29DAYS*/
                  }
  
//  ELSE
                  else { 
//  SET 88-100-IT-IS-NOT-LEAP-YEAR TO TRUE
                      work.setItIsNotLeapYear88100True(); 
                      
//  PERFORM 8320-CHECK-FOR-28DAYS
                      checkFor28days();/*8320-CHECK-FOR-28DAYS*/
                  }
              }
  
//  ELSE
              else { 
//  SET 88-100-IT-IS-LEAP-YEAR TO TRUE
                  work.setItIsLeapYear88100True(); 
                  
//  PERFORM 8310-CHECK-FOR-29DAYS
                  checkFor29days();/*8310-CHECK-FOR-29DAYS*/
              }
          }
  
//  ELSE
          else { 
//  SET 88-100-IT-IS-NOT-LEAP-YEAR TO TRUE
              work.setItIsNotLeapYear88100True(); 
              
//  PERFORM 8320-CHECK-FOR-28DAYS
              checkFor28days();/*8320-CHECK-FOR-28DAYS*/
          }
      
      }
      /**
      * checkFor29days 
      *   This method is derived from 
  *   COBOL Paragraph - 8310-CHECK-FOR-29DAYS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ctcDd802                       COBOL Name: 802-CTC-DD
      * - value29300                     COBOL Name: 300-VALUE-29
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * @throws CFException
      */
      private void checkFor29days() throws Exception {
			// Declare local variables used in the method
			CtcMmdd802 ctcMmdd802 = ctcDate802.getCtcMmdd802();
			int ctcDd802 = 0;
			int value29300 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para checks if the number of days in february in a leap year
// *are equal to or less than twenty nine. if not it sets the return
// *code to ninety nine.
// *-----------------------------------------------------------------
          value29300 = work.getValue29300();
          ctcDd802 = ctcMmdd802.getCtcDd802();
//  IF 802-CTC-DD IS GREATER 300-VALUE-29 OR EQUAL TO ZEROS
          if (	( ctcDd802 > value29300 ) || 	( ctcDd802 == 0 )) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              this.setRc(work.getValue99300());
          }
  
//  ELSE
      
      }
      /**
      * checkFor28days 
      *   This method is derived from 
  *   COBOL Paragraph - 8320-CHECK-FOR-28DAYS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ctcDd802                       COBOL Name: 802-CTC-DD
      * - value28300                     COBOL Name: 300-VALUE-28
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - value99300                     COBOL Name: 300-VALUE-99
      *
      * @throws CFException
      */
      private void checkFor28days() throws Exception {
			// Declare local variables used in the method
			CtcMmdd802 ctcMmdd802 = ctcDate802.getCtcMmdd802();
			int ctcDd802 = 0;
			int value28300 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para checks if the number of days in february for a year
// *which is not a leap year are equal to or less than twenty eight.
// *if not it sets the return-code to ninety nine.
// *-----------------------------------------------------------------
          value28300 = work.getValue28300();
          ctcDd802 = ctcMmdd802.getCtcDd802();
//  IF 802-CTC-DD IS GREATER 300-VALUE-28 OR EQUAL TO ZEROS
          if (	( ctcDd802 > value28300 ) || 	( ctcDd802 == 0 )) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              this.setRc(work.getValue99300());
          }
  
//  ELSE
      
      }
      /**
      * validateJulDate 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-VALIDATE-JUL-DATE COBOL Cyclomatic complexity - 7
      * Input  :  

      * - workYear801                    COBOL Name: 801-WORK-YEAR
      * - ip67002JDdd01                  COBOL Name: IP67002-J-DDD
      * - value365300                    COBOL Name: 300-VALUE-365
      * - value1300                      COBOL Name: 300-VALUE-1
      * - value366300                    COBOL Name: 300-VALUE-366
      * - value2300                      COBOL Name: 300-VALUE-2
      *
      * Output :  

      * - workYear801                    COBOL Name: 801-WORK-YEAR
      * - workRemainder801               COBOL Name: 801-WORK-REMAINDER
      * - ctcJDdd80201                   COBOL Name: 802-CTC-J-DDD
      * - rc                             COBOL Name: RETURN-CODE
      * - value1300                      COBOL Name: 300-VALUE-1
      * - value2300                      COBOL Name: 300-VALUE-2
      * - ip67002DateParm                COBOL Name: IP67002-DATE-PARM
      *
      * @throws CFException
      */
      private void validateJulDate() throws Exception {
			// Declare local variables used in the method
			CtcJddd802 ctcJddd802 = ctcDate802.getCtcJddd802();
			Ip67002Jddd ip67002Jddd = ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd();
			int ip67002JDdd01 = 0;
			int value365300 = 0;
			int workRemainder801 = 0;
			int value366300 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *The following routine validates julian date.
// *-----------------------------------------------------------------
//  PERFORM 8500-FIND-CENTURY
          findCentury();/*8500-FIND-CENTURY*/
//  DIVIDE 801-WORK-YEAR BY 300-VALUE-4 GIVING 801-WORK-YEAR REMAINDER 801-WORK-REMAINDER
          work.setWorkRemainder801( (int) work.getWorkYear801()%work.getValue4300());
          work.setWorkYear801( (int) work.getWorkYear801()/work.getValue4300());
          workRemainder801 = work.getWorkRemainder801();
//  IF 801-WORK-REMAINDER GREATER THAN ZERO
          if (	( workRemainder801 > 0 )) { 
              value365300 = work.getValue365300();
              ip67002JDdd01 = ip67002Jddd.getIp67002JDdd01();
//  IF IP67002-J-DDD EQUAL ZEROS OR IP67002-J-DDD GREATER THAN 300-VALUE-365
              if (	( ip67002JDdd01 == 0 ) || 	( ip67002JDdd01 > value365300 )) { 
//  MOVE ZEROES TO 802-CTC-J-DDD
                  ctcJddd802.setCtcJDdd80201(0);
  
//  MOVE 300-VALUE-1 TO RETURN-CODE
                  this.setRc(work.getValue1300());
              }
  
          }
  
//  ELSE
          else { 
              ip67002JDdd01 = ip67002Jddd.getIp67002JDdd01();
              value366300 = work.getValue366300();
//  IF IP67002-J-DDD EQUAL ZEROS OR IP67002-J-DDD GREATER THAN 300-VALUE-366
              if (	( ip67002JDdd01 == 0 ) || 	( ip67002JDdd01 > value366300 )) { 
//  MOVE ZEROES TO 802-CTC-J-DDD
                  ctcJddd802.setCtcJDdd80201(0);
  
//  MOVE 300-VALUE-2 TO RETURN-CODE
                  this.setRc(work.getValue2300());
                  ip67002JDdd01 = ip67002Jddd.getIp67002JDdd01();
                  value366300 = work.getValue366300();
//  IF IP67002-J-DDD GREATER THAN 300-VALUE-366
                  if (	( ip67002JDdd01 > value366300 )) { 
//  MOVE ZEROES TO IP67002-DATE-PARM
                      ip67002DateParm.setString(CONSTANTS.ZERO_20);
                  }
  
              }
  
          }
      
      }
      /**
      * findCentury 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-FIND-CENTURY COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip67002Yy                      COBOL Name: IP67002-YY
      * - value49300                     COBOL Name: 300-VALUE-49
      * - value19300                     COBOL Name: 300-VALUE-19
      * - value20300                     COBOL Name: 300-VALUE-20
      * - ip67002Date                    COBOL Name: IP67002-DATE
      *
      * Output :  

      * - ip67002Cc                      COBOL Name: IP67002-CC
      * - value19300                     COBOL Name: 300-VALUE-19
      * - value20300                     COBOL Name: 300-VALUE-20
      * - workYear801                    COBOL Name: 801-WORK-YEAR
      * - ip67002Yy                      COBOL Name: IP67002-YY
      * - ctcDate802                     COBOL Name: 802-CTC-DATE
      * - ip67002Date                    COBOL Name: IP67002-DATE
      *
      * @throws CFException
      */
      private void findCentury() throws Exception {
			// Declare local variables used in the method
			Ip67002CcyyRedefined ip67002CcyyRedefined = ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined();
			int ip67002Yy = 0;
			int value49300 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *The following routine checks the century.
// *-----------------------------------------------------------------
          value49300 = work.getValue49300();
          ip67002Yy = ip67002CcyyRedefined.getIp67002Yy();
//  IF IP67002-YY GREATER THAN 300-VALUE-49
          if (	( ip67002Yy > value49300 )) { 
//  MOVE 300-VALUE-19 TO IP67002-CC
              ip67002CcyyRedefined.setIp67002Cc(work.getValue19300());
  
          }
  
//  ELSE
          else { 
//  MOVE 300-VALUE-20 TO IP67002-CC
              ip67002CcyyRedefined.setIp67002Cc(work.getValue20300());
  
          }
//  MOVE IP67002-YY TO 801-WORK-YEAR
          work.setWorkYear801(ip67002CcyyRedefined.getIp67002Yy());
  
//  MOVE IP67002-DATE TO 802-CTC-DATE
          ctcDate802.setString(String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray());
      
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
  
  
  
  
  
  
  }
  /* 
* element ip670010 as of 11/12/19 10:21:28                    [vc]
*$set noamode
*$set intdate(ansi)
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
*author.         roger cantrel/gopinath joshi
*date-written.   october, 1999.
*security.       property of mastercard international, inc.
*-----------------------------------------------------------------
*program functionality:
*-----------------------------------------------------------------
* this is a commonly called program that will perform any of
* ten functions:
* 1) j:  convert julian date to gregorian
* 2) g:  convert gregorian date to julian
* 3) c:  compute span between 2 julian dates
* 4) w:  get day of week using gregorian date
* 5) v:  check for invalid date
* 6) b:  get dt before span
* 7) a:  get abs of greg dt
* 8) z:  get abs of jul dt
* 9) d:  get greg of abs dt
*10) e:  get jul of abs dt
*
* the date is passed in by populating the external work
* field ip67002-date-parm with either bccyymmdd(gregorian) or
* jccyyddd (julian).  if the conversion is successful then the
* date is reformatted and passed back by re-populating
* ip67002-date-parm.  if the date was invalid then
* ip67002-date-parm will be x'00000000' and the return-code will
* contain;
*
* 0001 -> julian to gregorian - non-leap year
* 0002 -> julian to gregorian - leap year
* 0005 -> gregorian to julian - zero day
* 0011 -> gregorian to julian - non-leap year
* 0012 -> gregorian to julian - leap year
* 0097 -> invalid utc offset
* 0098 -> non-numeric absolute date
* 0099 -> invalid date
*-----------------------------------------------------------------
*revision history:
*-----------------------------------------------------------------
* project       :ses ipm pre-edit
* date          :1999/10/27
* version       :001.00
* programmer    :gopinath joshi - isc
* modification  :initial version
*--------------------------------------------------------------
* project       :ses clearing
* date          :2000/10/05
* version       :002.00
* programmer    :gopinath joshi - isc
* modification  :added function to get absolute date.
*--------------------------------------------------------------
* project       :ses clearing
* date          :2001/06/14
* version       :002.00
* programmer    :gopinath joshi - isc
* modification  :added function to get utc date&time.
*--------------------------------------------------------------
* date          :2002/05/01
* version       :001.02
* programmer    :steve callahan
* modification  :corrected handling of leap year in utc.
*               :added call to ip996010 for startup message.
*-----------------------------------------------------------------
* project      :gcms release 3.1
* date         :2003/04/04
* modification :recompile for ip996010 and corrected utc offset
*              :logic
*-----------------------------------------------------------------
* project      :gcms release 4.1
* date         :2004/04/02
* programmer   :roger cantrell
* modification :correct leap year logic
*-----------------------------------------------------------------
* project      :gcms release 4.2
* date         :2004/10/01
* programmer   :mpact
* modification :included option 88-ip67002-addon-greg-jul-dow to
*              :add on or subtract specified number of days to the
*              :gregorian date passed by the calling program. it
*              :returns the derived date in gregorian and julian
*              :format and the day of week of the derived date.
*-----------------------------------------------------------------
*----------------------------------------------------------------*
*    project         :gcms release 18.q4                         *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/06/06                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to include the compiler   *
*                     directives to support in linux             *
*----------------------------------------------------------------*
*    project         :release 19.q1 # srq7931562                 *
*                     srq for linux compatibility                *
*    date            :2019/02/08                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to set intdate(ansi)      *
*----------------------------------------------------------------*
*/
