package com.cloudframe.app.process;

import com.cloudframe.app.ip202330.Ip202330Ctx.CallPgmIp200110InCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotLowHighValueInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotAllSpacesInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckAlphabetNumericInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForAlphabetSpaceOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.TerminateOnErrorOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.BuildAbendDataOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckAlphabetNumericOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForDePdsMtiOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForAlphabetSpaceInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpcZerAlphaOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpacesOrZerosOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotAllSpacesOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckAlphanumDashOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckAdditionalSyntaxInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.PerformPrimaryEditOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForNumericOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx;
import com.cloudframe.app.ip202330.Ip202330Ctx.PerformEditInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.LeftJustifyNotSpaceOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.PerformPrimaryEditInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpaceZeroNineOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CallPgmIp200110OutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.BuildAbendDataInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.LeftJustifyNoSpcZerOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.LeftJustifyNotSpaceInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.PerformInitializationOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpaceZeroInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckAlphanumDashInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNumericNotZeroInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpaceZeroOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForAlphabeticInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForNumericSpaceOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForAlphabeticOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckAlphanumSpaceInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForDePdsMtiInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.PerformInitializationInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForNumericSpaceInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNumericNotZeroOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpacesOrZerosInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpaceZeroNineInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotLowHighValueOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckAlphanumSpaceOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.LeftJustifyNoSpcZerInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.LeadSpaceLjAllZerosInCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckForNumericInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip202330.Ip202330Ctx.LeadSpaceLjAllZerosOutCtx;
import com.cloudframe.app.ip202330.Ip202330Ctx.CheckNotSpcZerAlphaInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip202330 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip202330Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip202330Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PERFORM-INITIALIZATION
     *
     * @return 
     */
    public PerformInitializationOutCtx performInitialization(PerformInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PERFORM-EDIT
     *
     */
    public void performEdit(PerformEditInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-CHECK-FOR-DE-PDS-MTI
     *
     * @return 
     */
    public CheckForDePdsMtiOutCtx checkForDePdsMti(CheckForDePdsMtiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-PERFORM-PRIMARY-EDIT
     *
     * @return 
     */
    public PerformPrimaryEditOutCtx performPrimaryEdit(PerformPrimaryEditInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2210-CHECK-FOR-NUMERIC
     *
     * @return 
     */
    public CheckForNumericOutCtx checkForNumeric(CheckForNumericInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2220-CHECK-FOR-ALPHABETIC
     *
     * @return 
     */
    public CheckForAlphabeticOutCtx checkForAlphabetic(CheckForAlphabeticInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2230-CHECK-FOR-ALPHABET-SPACE
     *
     * @return 
     */
    public CheckForAlphabetSpaceOutCtx checkForAlphabetSpace(CheckForAlphabetSpaceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2240-CHECK-FOR-NUMERIC-SPACE
     *
     * @return 
     */
    public CheckForNumericSpaceOutCtx checkForNumericSpace(CheckForNumericSpaceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2250-CHECK-ALPHABET-NUMERIC
     *
     * @return 
     */
    public CheckAlphabetNumericOutCtx checkAlphabetNumeric(CheckAlphabetNumericInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2260-BUILD-ABEND-DATA
     *
     * @return 
     */
    public BuildAbendDataOutCtx buildAbendData(BuildAbendDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2270-CHECK-ALPHANUM-SPACE
     *
     * @return 
     */
    public CheckAlphanumSpaceOutCtx checkAlphanumSpace(CheckAlphanumSpaceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2280-CHECK-ALPHANUM-DASH
     *
     * @return 
     */
    public CheckAlphanumDashOutCtx checkAlphanumDash(CheckAlphanumDashInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2290-CHECK-NOT-SPACE-ZERO
     *
     * @return 
     */
    public CheckNotSpaceZeroOutCtx checkNotSpaceZero(CheckNotSpaceZeroInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-CHECK-ADDITIONAL-SYNTAX
     *
     */
    public void checkAdditionalSyntax(CheckAdditionalSyntaxInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2310-CHECK-NUMERIC-NOT-ZERO
     *
     * @return 
     */
    public CheckNumericNotZeroOutCtx checkNumericNotZero(CheckNumericNotZeroInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2320-CHECK-NOT-ALL-SPACES
     *
     * @return 
     */
    public CheckNotAllSpacesOutCtx checkNotAllSpaces(CheckNotAllSpacesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2330-CHECK-NOT-SPACES-OR-ZEROS
     *
     * @return 
     */
    public CheckNotSpacesOrZerosOutCtx checkNotSpacesOrZeros(CheckNotSpacesOrZerosInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2360-CHECK-NOT-SPACE-ZERO-NINE
     *
     * @return 
     */
    public CheckNotSpaceZeroNineOutCtx checkNotSpaceZeroNine(CheckNotSpaceZeroNineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2340-LEFT-JUSTIFY-NOT-SPACE
     *
     * @return 
     */
    public LeftJustifyNotSpaceOutCtx leftJustifyNotSpace(LeftJustifyNotSpaceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2350-LEFT-JUSTIFY-NO-SPC-ZER
     *
     * @return 
     */
    public LeftJustifyNoSpcZerOutCtx leftJustifyNoSpcZer(LeftJustifyNoSpcZerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2370-CHECK-NOT-SPC-ZER-ALPHA
     *
     * @return 
     */
    public CheckNotSpcZerAlphaOutCtx checkNotSpcZerAlpha(CheckNotSpcZerAlphaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2380-LEAD-SPACE-LJ-ALL-ZEROS
     *
     * @return 
     */
    public LeadSpaceLjAllZerosOutCtx leadSpaceLjAllZeros(LeadSpaceLjAllZerosInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-CALL-PGM-IP200110
     *
     * @return 
     */
    public CallPgmIp200110OutCtx callPgmIp200110(CallPgmIp200110InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-CHECK-NOT-LOW-HIGH-VALUE
     *
     * @return 
     */
    public CheckNotLowHighValueOutCtx checkNotLowHighValue(CheckNotLowHighValueInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     * @return 
     */
    public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9950-UPDATE-EVENT-LOG
     *
     * @return 
     */
    public UpdateEventLogOutCtx updateEventLog(UpdateEventLogInCtx methodIn) throws Exception;


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
