package com.cloudframe.app.process;

import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable6IfNeededOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.DisplayCountOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MoveToTable6aOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable6aOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MoveToTable7InCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable7InCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable7OutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MoveToTable7OutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MoveToTable6OutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.GetFromOneDayFileInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MainlineInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.GetTableKeyDtTmInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.ResolveAccBrandPtrsOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.ResolveFirstSubfldPtrsOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable6InCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.InitializationInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.GetTableKeyDtTmOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable6OutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.CheckForCompleteRowsOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable6aInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.DisplayCountInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable7IfNeededOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.ResolveAccBrandPtrsInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MainlineOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.InitializationOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.GetFromOneDayFileOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MoveToTable6aInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable7IfNeededInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.CheckTableLimitOutCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTablesIfNeededInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.ResolveFirstSubfldPtrsInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.CheckForCompleteRowsInCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.LoadTable6IfNeededInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip739010.Ip739010Ctx;
import com.cloudframe.app.ip739010.Ip739010Ctx.MoveToTable6InCtx;
import com.cloudframe.app.ip739010.Ip739010Ctx.CheckTableLimitInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip739010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip739010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZATION
     *
     * @return 
     */
    public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-LOAD-TABLES-IF-NEEDED
     *
     */
    public void loadTablesIfNeeded(LoadTablesIfNeededInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-LOAD-TABLE-6-IF-NEEDED
     *
     * @return 
     */
    public LoadTable6IfNeededOutCtx loadTable6IfNeeded(LoadTable6IfNeededInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-LOAD-TABLE-6
     *
     * @return 
     */
    public LoadTable6OutCtx loadTable6(LoadTable6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2111-MOVE-TO-TABLE-6
     *
     * @return 
     */
    public MoveToTable6OutCtx moveToTable6(MoveToTable6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-LOAD-TABLE-6A
     *
     * @return 
     */
    public LoadTable6aOutCtx loadTable6a(LoadTable6aInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2211-MOVE-TO-TABLE-6A
     *
     * @return 
     */
    public MoveToTable6aOutCtx moveToTable6a(MoveToTable6aInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-LOAD-TABLE-7-IF-NEEDED
     *
     * @return 
     */
    public LoadTable7IfNeededOutCtx loadTable7IfNeeded(LoadTable7IfNeededInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2310-LOAD-TABLE-7
     *
     * @return 
     */
    public LoadTable7OutCtx loadTable7(LoadTable7InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2311-MOVE-TO-TABLE-7
     *
     * @return 
     */
    public MoveToTable7OutCtx moveToTable7(MoveToTable7InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2400-RESOLVE-FIRST-SUBFLD-PTRS
     *
     * @return 
     */
    public ResolveFirstSubfldPtrsOutCtx resolveFirstSubfldPtrs(ResolveFirstSubfldPtrsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2500-RESOLVE-ACC-BRAND-PTRS
     *
     * @return 
     */
    public ResolveAccBrandPtrsOutCtx resolveAccBrandPtrs(ResolveAccBrandPtrsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-GET-TABLE-KEY-DT-TM
     *
     * @return 
     */
    public GetTableKeyDtTmOutCtx getTableKeyDtTm(GetTableKeyDtTmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-GET-FROM-ONE-DAY-FILE
     *
     * @return 
     */
    public GetFromOneDayFileOutCtx getFromOneDayFile(GetFromOneDayFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-CHECK-TABLE-LIMIT
     *
     * @return 
     */
    public CheckTableLimitOutCtx checkTableLimit(CheckTableLimitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-CHECK-FOR-COMPLETE-ROWS
     *
     * @return 
     */
    public CheckForCompleteRowsOutCtx checkForCompleteRows(CheckForCompleteRowsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-DISPLAY-COUNT
     *
     * @return 
     */
    public DisplayCountOutCtx displayCount(DisplayCountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     */
    public void terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;


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
