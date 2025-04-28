package com.cloudframe.app.process;

import com.cloudframe.app.ip699930.Ip699930Ctx.EditIncomingValuesOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.InitializeFieldsOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetDesiredSystemApplOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetWherePaIsProcessedInCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetPasFromOneDayFileOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.EditIncomingValuesInCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.DisplayExecutionMessageInCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetDesiredSystemApplInCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.DisplayExecutionMessageOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetWherePaIsProcessedOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetPasFromOneDayFileInCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetDesiredPrcssngAgrmtOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip699930.Ip699930Ctx.GetDesiredPrcssngAgrmtInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip699930 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip699930Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-DO-MAINLINE
     *
     */
    public void doMainline(Ip699930Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PROCESS-INITIALIZATION
     *
     */
    public void processInitialization(Ip699930Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-SET-PROCEDURE-POINTERS
     *
     * @return 
     */
    public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-DISPLAY-EXECUTION-MESSAGE
     *
     * @return 
     */
    public DisplayExecutionMessageOutCtx displayExecutionMessage(DisplayExecutionMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-INITIALIZE-FIELDS
     *
     * @return 
     */
    public InitializeFieldsOutCtx initializeFields(Ip699930Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-EDIT-INCOMING-VALUES
     *
     * @return 
     */
    public EditIncomingValuesOutCtx editIncomingValues(EditIncomingValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-GET-PAS-FROM-ONE-DAY-FILE
     *
     * @return 
     */
    public GetPasFromOneDayFileOutCtx getPasFromOneDayFile(GetPasFromOneDayFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-GET-WHERE-PA-IS-PROCESSED
     *
     * @return 
     */
    public GetWherePaIsProcessedOutCtx getWherePaIsProcessed(GetWherePaIsProcessedInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-GET-DESIRED-PRCSSNG-AGRMT
     *
     * @return 
     */
    public GetDesiredPrcssngAgrmtOutCtx getDesiredPrcssngAgrmt(GetDesiredPrcssngAgrmtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-GET-DESIRED-SYSTEM-APPL
     *
     * @return 
     */
    public GetDesiredSystemApplOutCtx getDesiredSystemAppl(GetDesiredSystemApplInCtx methodIn) throws Exception;


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
