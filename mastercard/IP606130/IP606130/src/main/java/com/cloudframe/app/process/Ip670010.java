package com.cloudframe.app.process;

import com.cloudframe.app.ip670010.Ip670010Ctx.ConvertToJulianInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.FindCenturyInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.InitializationOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckFor29daysInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateMonthInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CalculateUtcInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetPreviousYearDateOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetDateBeforeSpanOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetGregFromAbsDtOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckFor28daysOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetAbsoluteDateGregInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateUtcOffsetOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckForLeapyearInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ControlFunctionalityInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetUtcDtTmInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateJulDateInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateDateInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetGregFromAbsDtInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetUtcDtTmOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GregToJulConversionInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GregToJulConversionOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetAddonGregJulDowInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckForLeapyearOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckFor29daysOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ConvertFromJulianInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.InitializationInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckDaysOfMonthInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetAddonGregJulDowOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetCalendarDowInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateMonthOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CompareJulianDatesOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetPreviousYearDateInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CalculateUtcOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.FindCenturyOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetJulFromAbsDtOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckFor28daysInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CompareJulianDatesInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetJulFromAbsDtInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetAbsoluteDateJulInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateDateOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.CheckDaysOfMonthOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateJulDateOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetDateBeforeSpanInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ValidateUtcOffsetInCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetCalendarDowOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetAbsoluteDateGregOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ConvertFromJulianOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.ConvertToJulianOutCtx;
import com.cloudframe.app.ip670010.Ip670010Ctx.GetAbsoluteDateJulOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip670010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip670010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip670010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZATION
     *
     * @return 
     */
    public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-CONTROL-FUNCTIONALITY
     *
     */
    public void controlFunctionality(ControlFunctionalityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-COMPARE-JULIAN-DATES
     *
     * @return 
     */
    public CompareJulianDatesOutCtx compareJulianDates(CompareJulianDatesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-CONVERT-FROM-JULIAN
     *
     * @return 
     */
    public ConvertFromJulianOutCtx convertFromJulian(ConvertFromJulianInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-CONVERT-TO-JULIAN
     *
     * @return 
     */
    public ConvertToJulianOutCtx convertToJulian(ConvertToJulianInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2310-GREG-TO-JUL-CONVERSION
     *
     * @return 
     */
    public GregToJulConversionOutCtx gregToJulConversion(GregToJulConversionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2400-GET-CALENDAR-DOW
     *
     * @return 
     */
    public GetCalendarDowOutCtx getCalendarDow(GetCalendarDowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2500-GET-DATE-BEFORE-SPAN
     *
     * @return 
     */
    public GetDateBeforeSpanOutCtx getDateBeforeSpan(GetDateBeforeSpanInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2510-GET-PREVIOUS-YEAR-DATE
     *
     * @return 
     */
    public GetPreviousYearDateOutCtx getPreviousYearDate(GetPreviousYearDateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2600-GET-ABSOLUTE-DATE-GREG
     *
     * @return 
     */
    public GetAbsoluteDateGregOutCtx getAbsoluteDateGreg(GetAbsoluteDateGregInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2700-GET-ABSOLUTE-DATE-JUL
     *
     * @return 
     */
    public GetAbsoluteDateJulOutCtx getAbsoluteDateJul(GetAbsoluteDateJulInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2800-GET-GREG-FROM-ABS-DT
     *
     * @return 
     */
    public GetGregFromAbsDtOutCtx getGregFromAbsDt(GetGregFromAbsDtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2900-GET-JUL-FROM-ABS-DT
     *
     * @return 
     */
    public GetJulFromAbsDtOutCtx getJulFromAbsDt(GetJulFromAbsDtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-GET-UTC-DT-TM
     *
     * @return 
     */
    public GetUtcDtTmOutCtx getUtcDtTm(GetUtcDtTmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-CALCULATE-UTC
     *
     * @return 
     */
    public CalculateUtcOutCtx calculateUtc(CalculateUtcInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3200-GET-ADDON-GREG-JUL-DOW
     *
     * @return 
     */
    public GetAddonGregJulDowOutCtx getAddonGregJulDow(GetAddonGregJulDowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-VALIDATE-DATE
     *
     * @return 
     */
    public ValidateDateOutCtx validateDate(ValidateDateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8110-VALIDATE-UTC-OFFSET
     *
     * @return 
     */
    public ValidateUtcOffsetOutCtx validateUtcOffset(ValidateUtcOffsetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-VALIDATE-MONTH
     *
     * @return 
     */
    public ValidateMonthOutCtx validateMonth(ValidateMonthInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8210-CHECK-DAYS-OF-MONTH
     *
     * @return 
     */
    public CheckDaysOfMonthOutCtx checkDaysOfMonth(CheckDaysOfMonthInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-CHECK-FOR-LEAPYEAR
     *
     * @return 
     */
    public CheckForLeapyearOutCtx checkForLeapyear(CheckForLeapyearInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8310-CHECK-FOR-29DAYS
     *
     * @return 
     */
    public CheckFor29daysOutCtx checkFor29days(CheckFor29daysInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8320-CHECK-FOR-28DAYS
     *
     * @return 
     */
    public CheckFor28daysOutCtx checkFor28days(CheckFor28daysInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-VALIDATE-JUL-DATE
     *
     * @return 
     */
    public ValidateJulDateOutCtx validateJulDate(ValidateJulDateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8500-FIND-CENTURY
     *
     * @return 
     */
    public FindCenturyOutCtx findCentury(FindCenturyInCtx methodIn) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
