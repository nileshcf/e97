  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import com.cloudframe.app.ip670010.Ip670010Ctx.*;
  import com.cloudframe.app.ip670010.Ip670010Ctx;
  import com.cloudframe.app.process.Ip670010;
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
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.ip670010.dto.*;
  import com.cloudframe.app.ip670010.dto.CtcDate802;
  import com.cloudframe.app.ip670010.dto.FormatedJulDate800;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
  import com.cloudframe.app.ip670010.dto.DaysOfMonthsGroup300;
  import com.cloudframe.app.ip670010.dto.CtcCcyy2Group802;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip670010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip670010")
  
  public class Ip670010Impl extends CommonProcess implements Ip670010 {
  
  Logger logger = LoggerFactory.getLogger(Ip670010Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip670010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
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
      public void mainline(Ip670010Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------
// *This paragraph calls a routine which checks if the edit is being
// *called for the first time or not. it calls another routine to
// *perform requested date related functions.
// *----------------------------------------------------------------
//  PERFORM 1000-INITIALIZATION
          initialization(programCtx.getInitializationInCtx());/*1000-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-CONTROL-FUNCTIONALITY
          controlFunctionality(programCtx.getControlFunctionalityInCtx());/*2000-CONTROL-FUNCTIONALITY*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
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
      @Override
      public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------
// *All the initialization activities are done in this paragraph,
// *if it is the first time, then it will display log details.
// *----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
InitializationOutCtx methodOut = methodIn.getInitializationOutCtx();
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-100-LEAP-YEAR-IS-UNKNOWN TO TRUE
              methodOut.setLeapYearIsUnknown88100True(); 
              
          }
//  MOVE ZERO TO RETURN-CODE
          programCtx.setRc(0);
      
      return methodOut;
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
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();

// *----------------------------------------------------------------
// *     This paragraph displays program start and compiled message
// *----------------------------------------------------------------
//  MOVE 300-IP670010 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getIp670010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
//  MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          methodOut.setIp996011WhenCompiled(CONSTANTS.LITERAL_218873021);
//  DISPLAY 'IN IP670010 - COMMENTED IP996010 CALL'
          logger.info("IN IP670010 - COMMENTED IP996010 CALL"); 
      
      return methodOut;
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
      @Override
      public void controlFunctionality(ControlFunctionalityInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------
// *The following paragraph checks the requested functionality and
// *performs the routines accordingly.
// *----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
//  EVALUATE TRUE
          if  ( methodIn.isIp67002JulianDatesSpan88()  ) { 
//  PERFORM 2100-COMPARE-JULIAN-DATES
              compareJulianDates(programCtx.getCompareJulianDatesInCtx());/*2100-COMPARE-JULIAN-DATES*/
          }
          else if  ( methodIn.isIp67002ConvertFromJulian88()  ) { 
//  PERFORM 2200-CONVERT-FROM-JULIAN
              convertFromJulian(programCtx.getConvertFromJulianInCtx());/*2200-CONVERT-FROM-JULIAN*/
          }
          else if  ( methodIn.isIp67002ConvertToJulian88()  ) { 
//  PERFORM 2300-CONVERT-TO-JULIAN
              convertToJulian(programCtx.getConvertToJulianInCtx());/*2300-CONVERT-TO-JULIAN*/
          }
          else if  ( methodIn.isIp67002GetCalendarDow88()  ) { 
//  PERFORM 2400-GET-CALENDAR-DOW
              getCalendarDow(programCtx.getGetCalendarDowInCtx());/*2400-GET-CALENDAR-DOW*/
          }
          else if  ( methodIn.isIp67002ValidateDate88()  ) { 
//  PERFORM 8100-VALIDATE-DATE
              validateDate(programCtx.getValidateDateInCtx());/*8100-VALIDATE-DATE*/
          }
          else if  ( methodIn.isIp67002GetDtBeforeSpan88()  ) { 
//  PERFORM 2500-GET-DATE-BEFORE-SPAN
              getDateBeforeSpan(programCtx.getGetDateBeforeSpanInCtx());/*2500-GET-DATE-BEFORE-SPAN*/
          }
          else if  ( methodIn.isIp67002GetAbsOfGregDt88()  ) { 
//  PERFORM 2600-GET-ABSOLUTE-DATE-GREG
              getAbsoluteDateGreg(programCtx.getGetAbsoluteDateGregInCtx());/*2600-GET-ABSOLUTE-DATE-GREG*/
          }
          else if  ( methodIn.isIp67002GetAbsOfJulDt88()  ) { 
//  PERFORM 2700-GET-ABSOLUTE-DATE-JUL
              getAbsoluteDateJul(programCtx.getGetAbsoluteDateJulInCtx());/*2700-GET-ABSOLUTE-DATE-JUL*/
          }
          else if  ( methodIn.isIp67002GetGregOfAbsDt88()  ) { 
//  PERFORM 2800-GET-GREG-FROM-ABS-DT
              getGregFromAbsDt(programCtx.getGetGregFromAbsDtInCtx());/*2800-GET-GREG-FROM-ABS-DT*/
          }
          else if  ( methodIn.isIp67002GetJulOfAbsDt88()  ) { 
//  PERFORM 2900-GET-JUL-FROM-ABS-DT
              getJulFromAbsDt(programCtx.getGetJulFromAbsDtInCtx());/*2900-GET-JUL-FROM-ABS-DT*/
          }
          else if  ( methodIn.isIp67002GetUtcDtTm88()  ) { 
//  PERFORM 3000-GET-UTC-DT-TM
              getUtcDtTm(programCtx.getGetUtcDtTmInCtx());/*3000-GET-UTC-DT-TM*/
          }
          else if  ( methodIn.isIp67002AddonGregJulDow88()  ) { 
//  PERFORM 3200-GET-ADDON-GREG-JUL-DOW
              getAddonGregJulDow(programCtx.getGetAddonGregJulDowInCtx());/*3200-GET-ADDON-GREG-JUL-DOW*/
          }
          else   { 
//  DISPLAY 600-INVALID-CALL-MESSAGE
              logger.info(new String(methodIn.getInvalidCallMessage600())); 
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
      @Override
      public CompareJulianDatesOutCtx compareJulianDates(CompareJulianDatesInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------
// *The following routine gives the span between two julian dates.
// *----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
CompareJulianDatesOutCtx methodOut = methodIn.getCompareJulianDatesOutCtx();
//  MOVE IP67002-CC-2 TO 802-CTC-CCX-2
          methodOut.setCtcCcx2802(String.valueOf(methodOut.getIp67002Cc2String()).toCharArray());
//  IF 802-CTC-CCX-2 NUMERIC OR 802-CTC-CC-2 GREATER THAN ZEROES
//  ELSE
          if (    !( isNumeric(methodOut.getCtcCcx2802()) ) && 	( methodIn.getCtcCc2802() <= 0 )) { 
//  IF IP67002-YY-2 GREATER THAN 300-VALUE-49
              if (	( methodOut.getIp67002Yy2() > methodIn.getValue49300() )) { 
//  MOVE 300-VALUE-19 TO IP67002-CC-2
                  methodOut.setIp67002Cc2(methodOut.getValue19300());
              }
//  ELSE
              else { 
//  MOVE 300-VALUE-20 TO IP67002-CC-2
                  methodOut.setIp67002Cc2(methodOut.getValue20300());
              }
          }
//  MOVE IP67002-YY-2 TO 801-WORK-YEAR-2
          methodOut.setWorkYear2801(methodOut.getIp67002Yy2());
//  DIVIDE 801-WORK-YEAR-2 BY 300-VALUE-4 GIVING 801-WORK-YEAR-2 REMAINDER 801-WORK-REMAINDER-2
          methodOut.setWorkRemainder2801( (int) methodOut.getWorkYear2801()%methodIn.getValue4300());
          methodOut.setWorkYear2801( (int) methodOut.getWorkYear2801()/methodIn.getValue4300());
//  IF IP67002-J-DDD LESS THAN IP67002-J-DDD-2 OR IP67002-J-DDD EQUAL IP67002-J-DDD-2
//  ELSE
          if (	( methodOut.getIp67002JDdd01() >= methodOut.getIp67002JDdd201() ) && 	( methodOut.getIp67002JDdd01() != methodOut.getIp67002JDdd201() )) { 
//  SUBTRACT 300-VALUE-1 FROM IP67002-CCYY-2
              methodOut.setIp67002Ccyy2(Math.abs(methodOut.getIp67002Ccyy2()-methodIn.getValue1300()));
//  IF 801-WORK-REMAINDER-2 EQUAL ZEROS
              if (	( methodOut.getWorkRemainder2801() == 0 )) { 
//  ADD 300-VALUE-365 TO IP67002-J-DDD-2
                  methodOut.setIp67002JDdd201(methodOut.getIp67002JDdd201()+methodIn.getValue365300());
              }
//  ELSE
              else { 
//  ADD 300-VALUE-366 TO IP67002-J-DDD-2
                  methodOut.setIp67002JDdd201(methodOut.getIp67002JDdd201()+methodIn.getValue366300());
              }
          }
//  SUBTRACT IP67002-CCYY-2 FROM IP67002-CCYY GIVING IP67002-CCYY
          methodOut.setIp67002Ccyy(Math.abs(methodOut.getIp67002Ccyy()-methodOut.getIp67002Ccyy2()));
//  SUBTRACT IP67002-J-DDD-2 FROM IP67002-J-DDD GIVING IP67002-J-DDD
          methodOut.setIp67002JDdd01(Math.abs(methodOut.getIp67002JDdd01()-methodOut.getIp67002JDdd201()));
      
      return methodOut;
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
      @Override
      public ConvertFromJulianOutCtx convertFromJulian(ConvertFromJulianInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The following routine converts julian date to calendar date after
// *necessary validations.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
ConvertFromJulianOutCtx methodOut = methodIn.getConvertFromJulianOutCtx();
//  PERFORM 8400-VALIDATE-JUL-DATE
          validateJulDate(programCtx.getValidateJulDateInCtx());/*8400-VALIDATE-JUL-DATE*/
//  IF RETURN-CODE EQUAL ZERO
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE IP67002-DATE TO 800-FORMATED-JUL-DATE
              methodOut.getFormatedJulDate800().setString(String.valueOf(methodOut.getIp67002DateString()).toCharArray());
              methodOut.setIntegerDate800((long)Math.abs(CFUtil.integerOfDay((int) methodIn.getJulianDate800())));
              methodOut.setGregorianDateCal800((long)Math.abs(CFUtil.dateOfInteger((int) methodOut.getIntegerDate800())));
//  MOVE 800-GREGORIAN-DATE-CAL TO IP67002-DATE
              methodOut.setIp67002Date(methodOut.getGregorianDateCal800());
          }
      
      return methodOut;
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
      @Override
      public ConvertToJulianOutCtx convertToJulian(ConvertToJulianInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The following routine validates the calendar date and converts it
// *to julian date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
ConvertToJulianOutCtx methodOut = methodIn.getConvertToJulianOutCtx();
//  IF IP67002-YYMMDD IS NOT NUMERIC OR IP67002-YYMMDD IS EQUAL TO ZERO
          if (    !( isNumeric(methodIn.getIp67002Yymmdd()) ) || ( allZeros(methodIn.getIp67002Yymmdd()) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue99300());
          }
//  ELSE
          else { 
//  IF IP67002-DD EQUAL ZEROS
              if (	( methodIn.getIp67002Dd() == 0 )) { 
//  MOVE 300-VALUE-5 TO RETURN-CODE
                  programCtx.setRc(methodOut.getValue5300());
              }
//  ELSE
              else { 
//  PERFORM 8100-VALIDATE-DATE
                  validateDate(programCtx.getValidateDateInCtx());/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL ZEROS
                  if (	( programCtx.getRc() == 0 )) { 
//  PERFORM 2310-GREG-TO-JUL-CONVERSION
                      gregToJulConversion(programCtx.getGregToJulConversionInCtx());/*2310-GREG-TO-JUL-CONVERSION*/
                  }
//  ELSE
                  else { 
//  IF 88-100-IT-IS-LEAP-YEAR
                      if ( methodIn.isItIsLeapYear88100()  ) { 
//  MOVE 300-VALUE-12 TO RETURN-CODE
                          programCtx.setRc(methodOut.getValue12300());
                      }
//  ELSE
                      else { 
//  MOVE 300-VALUE-11 TO RETURN-CODE
                          programCtx.setRc(methodOut.getValue11300());
                      }
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public GregToJulConversionOutCtx gregToJulConversion(GregToJulConversionInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This routine converts calendar date to julian date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GregToJulConversionOutCtx methodOut = methodIn.getGregToJulConversionOutCtx();
//  MOVE IP67002-DATE TO 800-GREGORIAN-DATE-CAL
          methodOut.setGregorianDateCal800(methodOut.getIp67002Date());
          methodOut.setIntegerDate800((long)Math.abs(CFUtil.integerOfDate((int) methodOut.getGregorianDateCal800())));
          methodOut.setJulianDateCal800((long)Math.abs(CFUtil.dayOfInteger((int) methodOut.getIntegerDate800())));
          // MOVE 800-JULIAN-DATE-CAL TO 800-JULIAN-DATE
          methodOut.setJulianDate800(methodOut.getJulianDateCal800());
//  MOVE 800-FORMATED-JUL-DATE TO IP67002-DATE
          methodOut.setIp67002Date(methodOut.getFormatedJulDate800().toCharArray());
      
      return methodOut;
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
      @Override
      public GetCalendarDowOutCtx getCalendarDow(GetCalendarDowInCtx methodIn) throws Exception {
      
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
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetCalendarDowOutCtx methodOut = methodIn.getGetCalendarDowOutCtx();
//  PERFORM 8100-VALIDATE-DATE
          validateDate(programCtx.getValidateDateInCtx());/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL ZEROS
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE ZEROS TO IP67002-DAY-OF-WEEK
              methodOut.setIp67002DayOfWeek(0);
              methodOut.setIp67002DayOfWeek((int)Math.abs((int) CFUtil.integerOfDate((int) methodIn.getIp67002Date()) % methodOut.getValue7300()));
//  IF IP67002-DAY-OF-WEEK EQUAL TO ZERO
              if (	( methodOut.getIp67002DayOfWeek() == 0 )) { 
//  MOVE 300-VALUE-7 TO IP67002-DAY-OF-WEEK
                  methodOut.setIp67002DayOfWeek(methodOut.getValue7300());
              }
          }
      
      return methodOut;
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
      @Override
      public GetDateBeforeSpanOutCtx getDateBeforeSpan(GetDateBeforeSpanInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph determines the julian date, which is behind the
// *julian date given in the field ip67002-ccyyddd, by the number of
// *days specified in the field ip67002-julian-days-span.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetDateBeforeSpanOutCtx methodOut = methodIn.getGetDateBeforeSpanOutCtx();
//  IF IP67002-DDD <= IP67002-JULIAN-DAYS-SPAN
          if (	( methodOut.getIp67002Ddd() <= methodIn.getIp67002JulianDaysSpan() ) ) { 
//  PERFORM 2510-GET-PREVIOUS-YEAR-DATE UNTIL IP67002-DDD GREATER THAN IP67002-JULIAN-DAYS-SPAN
              while (	( methodOut.getIp67002Ddd() <= methodIn.getIp67002JulianDaysSpan() ) ) {
                 getPreviousYearDate(programCtx.getGetPreviousYearDateInCtx());/*2510-GET-PREVIOUS-YEAR-DATE*/
              }
          }
//  SUBTRACT IP67002-JULIAN-DAYS-SPAN FROM IP67002-DDD
          methodOut.setIp67002Ddd(Math.abs(methodOut.getIp67002Ddd()-methodIn.getIp67002JulianDaysSpan()));
      
      return methodOut;
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
      @Override
      public GetPreviousYearDateOutCtx getPreviousYearDate(GetPreviousYearDateInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph determines the julian date, which is behind the
// *given julian date by the specified number of days, if it falls on
// *the previous year of the given date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetPreviousYearDateOutCtx methodOut = methodIn.getGetPreviousYearDateOutCtx();
//  SUBTRACT 300-VALUE-1 FROM IP67002-CCYY
          methodOut.setIp67002Ccyy(Math.abs(methodOut.getIp67002Ccyy()-methodIn.getValue1300()));
//  MOVE IP67002-YY-JUL TO 801-WORK-YEAR
          methodOut.setWorkYear801(methodOut.getIp67002YyJul());
//  DIVIDE 801-WORK-YEAR BY 300-VALUE-4 GIVING 801-WORK-YEAR REMAINDER 801-WORK-REMAINDER
          methodOut.setWorkRemainder801( (int) methodOut.getWorkYear801()%methodIn.getValue4300());
          methodOut.setWorkYear801( (int) methodOut.getWorkYear801()/methodIn.getValue4300());
//  IF 801-WORK-REMAINDER EQUAL ZEROS
          if (	( methodOut.getWorkRemainder801() == 0 )) { 
//  ADD 300-VALUE-366 TO IP67002-DDD
              methodOut.setIp67002Ddd(methodOut.getIp67002Ddd()+methodIn.getValue366300());
          }
//  ELSE
          else { 
//  ADD 300-VALUE-365 TO IP67002-DDD
              methodOut.setIp67002Ddd(methodOut.getIp67002Ddd()+methodIn.getValue365300());
          }
      
      return methodOut;
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
      @Override
      public GetAbsoluteDateGregOutCtx getAbsoluteDateGreg(GetAbsoluteDateGregInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph determines the absolute date for gerg date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetAbsoluteDateGregOutCtx methodOut = methodIn.getGetAbsoluteDateGregOutCtx();
//  PERFORM 8100-VALIDATE-DATE
          validateDate(programCtx.getValidateDateInCtx());/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL TO ZEROES
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE IP67002-DATE TO 800-GREGORIAN-DATE-CAL
              methodOut.setGregorianDateCal800(methodOut.getIp67002Date());
              methodOut.setIp67002Date((long)Math.abs(CFUtil.integerOfDate((int) methodOut.getGregorianDateCal800())));
          }
      
      return methodOut;
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
      @Override
      public GetAbsoluteDateJulOutCtx getAbsoluteDateJul(GetAbsoluteDateJulInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph determines the absolute date for julian date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetAbsoluteDateJulOutCtx methodOut = methodIn.getGetAbsoluteDateJulOutCtx();
//  PERFORM 8400-VALIDATE-JUL-DATE
          validateJulDate(programCtx.getValidateJulDateInCtx());/*8400-VALIDATE-JUL-DATE*/
//  IF RETURN-CODE EQUAL ZEROS
          if (	( programCtx.getRc() == 0 )) { 
              // MOVE IP67002-CCYYDDD TO 800-JULIAN-DATE
              methodOut.getFormatedJulDate800().replace(padSpaces(7,methodOut.getIp67002Ccyyddd().toCharArray()), /* beginIndex */0, /* length */7);
              methodOut.setIp67002Date((long)Math.abs(CFUtil.integerOfDay((int) methodOut.getJulianDate800())));
          }
      
      return methodOut;
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
      @Override
      public GetGregFromAbsDtOutCtx getGregFromAbsDt(GetGregFromAbsDtInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph determines the gregorian date from absolute date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetGregFromAbsDtOutCtx methodOut = methodIn.getGetGregFromAbsDtOutCtx();
//  IF IP67002-DATE NUMERIC
          if (        methodIn.getIp67002DateParm().ip67002DateIsNumeric() ) { 
//  MOVE IP67002-DATE TO 800-INTEGER-DATE
              methodOut.setIntegerDate800(methodOut.getIp67002Date());
              methodOut.setIp67002Date((long)Math.abs(CFUtil.dateOfInteger((int) methodOut.getIntegerDate800())));
          }
//  ELSE
          else { 
//  MOVE 300-VALUE-98 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue98300());
          }
      
      return methodOut;
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
      @Override
      public GetJulFromAbsDtOutCtx getJulFromAbsDt(GetJulFromAbsDtInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph determines the julian date from absolute date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetJulFromAbsDtOutCtx methodOut = methodIn.getGetJulFromAbsDtOutCtx();
//  IF IP67002-DATE NUMERIC
          if (        methodIn.getIp67002DateParm().ip67002DateIsNumeric() ) { 
//  MOVE IP67002-DATE TO 800-INTEGER-DATE
              methodOut.setIntegerDate800(methodOut.getIp67002Date());
              methodOut.setJulianDate800((long)Math.abs(CFUtil.dayOfInteger((int) methodOut.getIntegerDate800())));
//  MOVE 800-FORMATED-JUL-DATE TO IP67002-DATE
              methodOut.setIp67002Date(methodOut.getFormatedJulDate800().toCharArray());
          }
//  ELSE
          else { 
//  MOVE 300-VALUE-98 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue98300());
          }
      
      return methodOut;
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
      @Override
      public GetUtcDtTmOutCtx getUtcDtTm(GetUtcDtTmInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph returns the utc data and time.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetUtcDtTmOutCtx methodOut = methodIn.getGetUtcDtTmOutCtx();
//  PERFORM 8100-VALIDATE-DATE
          validateDate(programCtx.getValidateDateInCtx());/*8100-VALIDATE-DATE*/
//  PERFORM 8110-VALIDATE-UTC-OFFSET
          validateUtcOffset(programCtx.getValidateUtcOffsetInCtx());/*8110-VALIDATE-UTC-OFFSET*/
//  IF RETURN-CODE EQUAL ZERO
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE IP67002-HH TO 800-WORK-HR
              methodOut.setWorkHr800(methodOut.getIp67002Hh());
//  MOVE IP67002-MTH TO 800-WORK-MIN
              methodOut.setWorkMin800(methodOut.getIp67002Mth());
//  EVALUATE TRUE
              if  (	( methodOut.getIp67002UtcOffsetHh() == 0 ) && 	( methodOut.getIp67002UtcOffsetMm() == 0 )) { 
                  ;
              }
              else if  (methodIn.getIp67002UtcOffsetSign()[0] == '+') { 
//  SUBTRACT IP67002-UTC-OFFSET-HH FROM ZERO GIVING 800-WORK-OFFSET-HR
                  methodOut.setWorkOffsetHr800(0-methodOut.getIp67002UtcOffsetHh());
//  SUBTRACT IP67002-UTC-OFFSET-MM FROM ZERO GIVING 800-WORK-OFFSET-MIN
                  methodOut.setWorkOffsetMin800(0-methodOut.getIp67002UtcOffsetMm());
//  PERFORM 3100-CALCULATE-UTC
                  calculateUtc(programCtx.getCalculateUtcInCtx());/*3100-CALCULATE-UTC*/
              }
              else if  (methodIn.getIp67002UtcOffsetSign()[0] == '-') { 
//  MOVE IP67002-UTC-OFFSET-HH TO 800-WORK-OFFSET-HR
                  methodOut.setWorkOffsetHr800(methodOut.getIp67002UtcOffsetHh());
//  MOVE IP67002-UTC-OFFSET-MM TO 800-WORK-OFFSET-MIN
                  methodOut.setWorkOffsetMin800(methodOut.getIp67002UtcOffsetMm());
//  PERFORM 3100-CALCULATE-UTC
                  calculateUtc(programCtx.getCalculateUtcInCtx());/*3100-CALCULATE-UTC*/
              }
          }
      
      return methodOut;
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
      @Override
      public CalculateUtcOutCtx calculateUtc(CalculateUtcInCtx methodIn) throws Exception {
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
CalculateUtcOutCtx methodOut = methodIn.getCalculateUtcOutCtx();
          methodOut.setIntegerDate800((long)Math.abs(CFUtil.integerOfDate((int) methodOut.getIp67002Date())));
          methodOut.setWorkMin800((int) (methodOut.getIp67002Hh() * 60 + methodOut.getIp67002Mth() +  ( methodIn.getWorkOffsetHr800() * 60 )  + methodIn.getWorkOffsetMin800()));
//  EVALUATE TRUE
          if  (	( methodOut.getWorkMin800() < 0 )) { 
//  SUBTRACT 1 FROM 800-INTEGER-DATE
              methodOut.setIntegerDate800(Math.abs(methodOut.getIntegerDate800()-(long)1));
//  ADD 1440 TO 800-WORK-MIN
              methodOut.setWorkMin800(methodOut.getWorkMin800()+1440);
//  DIVIDE 800-WORK-MIN BY 60 GIVING IP67002-HH REMAINDER IP67002-MTH
              methodOut.setIp67002Hh( (int) methodOut.getWorkMin800()/60);
              methodOut.setIp67002Mth( (int) methodOut.getWorkMin800()%60);
          }
          else if  (	( methodOut.getWorkMin800() == 0 )) { 
//  MOVE ZERO TO IP67002-HH IP67002-MTH
              methodOut.setIp67002Hh(0);
              methodOut.setIp67002Mth(0);
          }
          else if  (	( methodOut.getWorkMin800() > 1440 )) { 
//  ADD 1 TO 800-INTEGER-DATE
              methodOut.setIntegerDate800(methodOut.getIntegerDate800()+(long)1);
//  SUBTRACT 1440 FROM 800-WORK-MIN
              methodOut.setWorkMin800(methodOut.getWorkMin800()-1440);
//  DIVIDE 800-WORK-MIN BY 60 GIVING IP67002-HH REMAINDER IP67002-MTH
              methodOut.setIp67002Hh( (int) methodOut.getWorkMin800()/60);
              methodOut.setIp67002Mth( (int) methodOut.getWorkMin800()%60);
          }
          else   { 
//  DIVIDE 800-WORK-MIN BY 60 GIVING IP67002-HH REMAINDER IP67002-MTH
              methodOut.setIp67002Hh( (int) methodOut.getWorkMin800()/60);
              methodOut.setIp67002Mth( (int) methodOut.getWorkMin800()%60);
          }
          methodOut.setIp67002Date((long)Math.abs(CFUtil.dateOfInteger((int) methodOut.getIntegerDate800())));
      
      return methodOut;
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
      @Override
      public GetAddonGregJulDowOutCtx getAddonGregJulDow(GetAddonGregJulDowInCtx methodIn) throws Exception {
      
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
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
GetAddonGregJulDowOutCtx methodOut = methodIn.getGetAddonGregJulDowOutCtx();
//  PERFORM 8100-VALIDATE-DATE
          validateDate(programCtx.getValidateDateInCtx());/*8100-VALIDATE-DATE*/
//  IF RETURN-CODE EQUAL ZEROES
          if (	( programCtx.getRc() == 0 )) { 
              methodOut.setIntegerDate800((long)Math.abs(CFUtil.integerOfDate((int) methodOut.getIp67002Date())));
//  ADD IP67002-JULIAN-DAYS-SPAN TO 800-INTEGER-DATE
              methodOut.setIntegerDate800(methodOut.getIntegerDate800()+(short) methodIn.getIp67002JulianDaysSpan());
//  MOVE ZEROES TO IP67002-DATE
              methodOut.setIp67002Date(0);
              methodOut.setJulianDate800((long)Math.abs(CFUtil.dayOfInteger((int) methodOut.getIntegerDate800())));
//  MOVE 800-JULIAN-DATE TO IP67002-CCYYDDD
              methodOut.getIp67002Ccyyddd().setString(String.valueOf(methodOut.getJulianDate800String()).toCharArray());
              methodOut.setIp67002Date2((long)Math.abs(CFUtil.dateOfInteger((int) methodOut.getIntegerDate800())));
              methodOut.setIp67002DayOfWeek((int)Math.abs(methodOut.getIntegerDate800() % methodOut.getValue7300()));
//  IF IP67002-DAY-OF-WEEK EQUAL ZEROES
              if (	( methodOut.getIp67002DayOfWeek() == 0 )) { 
//  MOVE 300-VALUE-7 TO IP67002-DAY-OF-WEEK
                  methodOut.setIp67002DayOfWeek(methodOut.getValue7300());
              }
          }
      
      return methodOut;
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
      @Override
      public ValidateDateOutCtx validateDate(ValidateDateInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------
// *This para checks if the date is numeric and not equal to zero.
// *if it is then it performs a para to validate the month else it
// *sets return-code to ninety nine.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
ValidateDateOutCtx methodOut = methodIn.getValidateDateOutCtx();
//  IF IP67002-YYMMDD IS NUMERIC AND IP67002-YYMMDD IS NOT EQUAL ZERO
          if (    isNumeric(methodIn.getIp67002Yymmdd()) && !( allZeros(methodIn.getIp67002Yymmdd()) ) /*  !=  zeros*/) { 
//  PERFORM 8500-FIND-CENTURY
              findCentury(programCtx.getFindCenturyInCtx());/*8500-FIND-CENTURY*/
//  PERFORM 8200-VALIDATE-MONTH
              validateMonth(programCtx.getValidateMonthInCtx());/*8200-VALIDATE-MONTH*/
          }
//  ELSE
          else { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue99300());
          }
      
      return methodOut;
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
      @Override
      public ValidateUtcOffsetOutCtx validateUtcOffset(ValidateUtcOffsetInCtx methodIn) throws Exception {
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
ValidateUtcOffsetOutCtx methodOut = methodIn.getValidateUtcOffsetOutCtx();
//  IF ( IP67002-UTC-OFFSET-SIGN = '+' OR IP67002-UTC-OFFSET-SIGN = '-' ) AND IP67002-UTC-OFFSET-HHMM IS NUMERIC AND IP67002-UTC-OFFSET-HH >= 00 AND IP67002-UTC-OFFSET-HH < 24 AND IP67002-UTC-OFFSET-MM >= 00 AND IP67002-UTC-OFFSET-MM < 60
//  ELSE
          if ((methodIn.getIp67002UtcOffsetSign()[0] != '+' && methodIn.getIp67002UtcOffsetSign()[0] != '-') ||     !( isNumeric(methodIn.getIp67002UtcOffsetHhmm()) ) || 	( methodIn.getIp67002UtcOffsetHh() < 0 ) || 	( methodIn.getIp67002UtcOffsetHh() >= 24 ) || 	( methodIn.getIp67002UtcOffsetMm() < 0 ) || 	( methodIn.getIp67002UtcOffsetMm() >= 60 )) { 
//  MOVE 300-VALUE-97 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue97300());
          }
      
      return methodOut;
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
      @Override
      public ValidateMonthOutCtx validateMonth(ValidateMonthInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para checks if the month is between 1 to 12. if it is then
// *it performs a para to check if the days for that month are valid
// *else it sets return-code to ninety nine.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
ValidateMonthOutCtx methodOut = methodIn.getValidateMonthOutCtx();
//  MOVE 802-CTC-MM TO 800-VALIDATE-MONTH
          methodOut.setValidateMonth800(methodOut.getCtcMm802());
//  IF 88-800-VALID-MONTH
          if ( methodOut.isValidMonth88800()  ) { 
//  PERFORM 8210-CHECK-DAYS-OF-MONTH
              checkDaysOfMonth(programCtx.getCheckDaysOfMonthInCtx());/*8210-CHECK-DAYS-OF-MONTH*/
          }
//  ELSE
          else { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue99300());
//  PERFORM 8300-CHECK-FOR-LEAPYEAR
              checkForLeapyear(programCtx.getCheckForLeapyearInCtx());/*8300-CHECK-FOR-LEAPYEAR*/
          }
      
      return methodOut;
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
      @Override
      public CheckDaysOfMonthOutCtx checkDaysOfMonth(CheckDaysOfMonthInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para checks if the month is february. if it is ,then, a para
// *to check for the leap-year is performed, else for other months, a
// *check is made that the number of days is not greater than maximum
// *number of days for that particular month. if it is then it sets
// *the return-code to ninety nine.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
CheckDaysOfMonthOutCtx methodOut = methodIn.getCheckDaysOfMonthOutCtx();
//  IF 802-CTC-MM IS EQUAL TO 300-VALUE-2
          if (	( methodIn.getCtcMm802() == methodIn.getValue2300() )) { 
//  PERFORM 8300-CHECK-FOR-LEAPYEAR
              checkForLeapyear(programCtx.getCheckForLeapyearInCtx());/*8300-CHECK-FOR-LEAPYEAR*/
          }
//  ELSE
          else { 
//  IF 802-CTC-DD IS GREATER THAN 300-DAYS-OF-A-MONTH ( 800-VALIDATE-MONTH ) OR EQUAL TO ZEROS
              if (compareChars(methodIn.getCtcMmdd802().getCtcDd802String(),methodIn.getDaysOfAMonth300(methodIn.getValidateMonth800() - 1)) > 0 || 	( methodIn.getCtcDd802() == 0 )) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
                  programCtx.setRc(methodOut.getValue99300());
//  PERFORM 8300-CHECK-FOR-LEAPYEAR
                  checkForLeapyear(programCtx.getCheckForLeapyearInCtx());/*8300-CHECK-FOR-LEAPYEAR*/
              }
          }
      
      return methodOut;
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
      @Override
      public CheckForLeapyearOutCtx checkForLeapyear(CheckForLeapyearInCtx methodIn) throws Exception {
      
// *Have twenty-nine days, if it is a leap year. if it is not a leap
// *year the month of february will have twenty eight days. this para
// *after checking whether the year is a leap year or not, performs
// *subequent paras to check for the number of days.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
CheckForLeapyearOutCtx methodOut = methodIn.getCheckForLeapyearOutCtx();
//  DIVIDE 802-CTC-CCYY BY 300-VALUE-4 GIVING 801-WORK-YEAR-3 REMAINDER 801-WORK-REMAINDER
          methodOut.setWorkYear3801( (int) methodIn.getCtcCcyy802()/methodIn.getValue4300());
          methodOut.setWorkRemainder801( (int) methodIn.getCtcCcyy802()%methodIn.getValue4300());
//  IF 801-WORK-REMAINDER EQUAL TO ZERO
          if (	( methodOut.getWorkRemainder801() == 0 )) { 
//  DIVIDE 802-CTC-CCYY BY 300-VALUE-100 GIVING 801-WORK-YEAR-3 REMAINDER 801-WORK-REMAINDER
              methodOut.setWorkYear3801( (int) methodIn.getCtcCcyy802()/methodIn.getValue100300());
              methodOut.setWorkRemainder801( (int) methodIn.getCtcCcyy802()%methodIn.getValue100300());
//  IF 801-WORK-REMAINDER EQUAL TO ZERO
              if (	( methodOut.getWorkRemainder801() == 0 )) { 
//  DIVIDE 802-CTC-CCYY BY 300-VALUE-400 GIVING 801-WORK-YEAR-3 REMAINDER 801-WORK-REMAINDER
                  methodOut.setWorkYear3801( (int) methodIn.getCtcCcyy802()/methodIn.getValue400300());
                  methodOut.setWorkRemainder801( (int) methodIn.getCtcCcyy802()%methodIn.getValue400300());
//  IF 801-WORK-REMAINDER EQUAL TO ZERO
                  if (	( methodOut.getWorkRemainder801() == 0 )) { 
//  SET 88-100-IT-IS-LEAP-YEAR TO TRUE
                      methodOut.setItIsLeapYear88100True(); 
                      
//  PERFORM 8310-CHECK-FOR-29DAYS
                      checkFor29days(programCtx.getCheckFor29daysInCtx());/*8310-CHECK-FOR-29DAYS*/
                  }
//  ELSE
                  else { 
//  SET 88-100-IT-IS-NOT-LEAP-YEAR TO TRUE
                      methodOut.setItIsNotLeapYear88100True(); 
                      
//  PERFORM 8320-CHECK-FOR-28DAYS
                      checkFor28days(programCtx.getCheckFor28daysInCtx());/*8320-CHECK-FOR-28DAYS*/
                  }
              }
//  ELSE
              else { 
//  SET 88-100-IT-IS-LEAP-YEAR TO TRUE
                  methodOut.setItIsLeapYear88100True(); 
                  
//  PERFORM 8310-CHECK-FOR-29DAYS
                  checkFor29days(programCtx.getCheckFor29daysInCtx());/*8310-CHECK-FOR-29DAYS*/
              }
          }
//  ELSE
          else { 
//  SET 88-100-IT-IS-NOT-LEAP-YEAR TO TRUE
              methodOut.setItIsNotLeapYear88100True(); 
              
//  PERFORM 8320-CHECK-FOR-28DAYS
              checkFor28days(programCtx.getCheckFor28daysInCtx());/*8320-CHECK-FOR-28DAYS*/
          }
      
      return methodOut;
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
      @Override
      public CheckFor29daysOutCtx checkFor29days(CheckFor29daysInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para checks if the number of days in february in a leap year
// *are equal to or less than twenty nine. if not it sets the return
// *code to ninety nine.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
CheckFor29daysOutCtx methodOut = methodIn.getCheckFor29daysOutCtx();
//  IF 802-CTC-DD IS GREATER 300-VALUE-29 OR EQUAL TO ZEROS
          if (	( methodIn.getCtcDd802() > methodIn.getValue29300() ) || 	( methodIn.getCtcDd802() == 0 )) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue99300());
          }
//  ELSE
      
      return methodOut;
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
      @Override
      public CheckFor28daysOutCtx checkFor28days(CheckFor28daysInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para checks if the number of days in february for a year
// *which is not a leap year are equal to or less than twenty eight.
// *if not it sets the return-code to ninety nine.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
CheckFor28daysOutCtx methodOut = methodIn.getCheckFor28daysOutCtx();
//  IF 802-CTC-DD IS GREATER 300-VALUE-28 OR EQUAL TO ZEROS
          if (	( methodIn.getCtcDd802() > methodIn.getValue28300() ) || 	( methodIn.getCtcDd802() == 0 )) { 
//  MOVE 300-VALUE-99 TO RETURN-CODE
              programCtx.setRc(methodOut.getValue99300());
          }
//  ELSE
      
      return methodOut;
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
      @Override
      public ValidateJulDateOutCtx validateJulDate(ValidateJulDateInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The following routine validates julian date.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
ValidateJulDateOutCtx methodOut = methodIn.getValidateJulDateOutCtx();
//  PERFORM 8500-FIND-CENTURY
          findCentury(programCtx.getFindCenturyInCtx());/*8500-FIND-CENTURY*/
//  DIVIDE 801-WORK-YEAR BY 300-VALUE-4 GIVING 801-WORK-YEAR REMAINDER 801-WORK-REMAINDER
          methodOut.setWorkRemainder801( (int) methodOut.getWorkYear801()%methodIn.getValue4300());
          methodOut.setWorkYear801( (int) methodOut.getWorkYear801()/methodIn.getValue4300());
//  IF 801-WORK-REMAINDER GREATER THAN ZERO
          if (	( methodOut.getWorkRemainder801() > 0 )) { 
//  IF IP67002-J-DDD EQUAL ZEROS OR IP67002-J-DDD GREATER THAN 300-VALUE-365
              if (	( methodIn.getIp67002JDdd01() == 0 ) || 	( methodIn.getIp67002JDdd01() > methodIn.getValue365300() )) { 
//  MOVE ZEROES TO 802-CTC-J-DDD
                  methodOut.setCtcJDdd80201(0);
//  MOVE 300-VALUE-1 TO RETURN-CODE
                  programCtx.setRc(methodOut.getValue1300());
              }
          }
//  ELSE
          else { 
//  IF IP67002-J-DDD EQUAL ZEROS OR IP67002-J-DDD GREATER THAN 300-VALUE-366
              if (	( methodIn.getIp67002JDdd01() == 0 ) || 	( methodIn.getIp67002JDdd01() > methodIn.getValue366300() )) { 
//  MOVE ZEROES TO 802-CTC-J-DDD
                  methodOut.setCtcJDdd80201(0);
//  MOVE 300-VALUE-2 TO RETURN-CODE
                  programCtx.setRc(methodOut.getValue2300());
//  IF IP67002-J-DDD GREATER THAN 300-VALUE-366
                  if (	( methodIn.getIp67002JDdd01() > methodIn.getValue366300() )) { 
//  MOVE ZEROES TO IP67002-DATE-PARM
                      methodOut.getIp67002DateParm().setString(CONSTANTS.ZERO_20);
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public FindCenturyOutCtx findCentury(FindCenturyInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The following routine checks the century.
// *-----------------------------------------------------------------
Ip670010Ctx programCtx = methodIn.getIp670010Ctx();
FindCenturyOutCtx methodOut = methodIn.getFindCenturyOutCtx();
//  IF IP67002-YY GREATER THAN 300-VALUE-49
          if (	( methodOut.getIp67002Yy() > methodIn.getValue49300() )) { 
//  MOVE 300-VALUE-19 TO IP67002-CC
              methodOut.setIp67002Cc(methodOut.getValue19300());
          }
//  ELSE
          else { 
//  MOVE 300-VALUE-20 TO IP67002-CC
              methodOut.setIp67002Cc(methodOut.getValue20300());
          }
//  MOVE IP67002-YY TO 801-WORK-YEAR
          methodOut.setWorkYear801(methodOut.getIp67002Yy());
//  MOVE IP67002-DATE TO 802-CTC-DATE
          methodOut.getCtcDate802().setString(String.valueOf(methodOut.getIp67002DateString()).toCharArray());
      
      return methodOut;
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
