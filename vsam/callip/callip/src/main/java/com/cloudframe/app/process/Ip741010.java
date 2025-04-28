package com.cloudframe.app.process;

import com.cloudframe.app.ip741010.Ip741010Ctx.GetTableKeyDtTmOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.MoveToTable8OutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.CheckForCompleteRowsOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable8InCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.MoveToTable9InCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable8OutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx;
import com.cloudframe.app.ip741010.Ip741010Ctx.GetFromOneDayFileOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.CheckForCompleteRowsInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.DisplayCountInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.ResolveFirstSubfldPtrsOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.GetFromOneDayFileInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable9IfNeededOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable9InCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.ResolveFirstSubfldPtrsInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.MoveToTable9OutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.CheckTableLimitInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.DisplayCountOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.MoveToTable8InCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTablesIfNeededInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable9IfNeededInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable8IfNeededInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.GetTableKeyDtTmInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.MainlineInCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.InitializationInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable8IfNeededOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.LoadTable9OutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.InitializationOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.MainlineOutCtx;
import com.cloudframe.app.ip741010.Ip741010Ctx.CheckTableLimitOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip741010.Ip741010Ctx.TerminateOnErrorInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip741010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip741010Ctx programCtx) throws Exception;

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
     * This method is derived from Cobol Paragraph - 2100-LOAD-TABLE-8-IF-NEEDED
     *
     * @return 
     */
    public LoadTable8IfNeededOutCtx loadTable8IfNeeded(LoadTable8IfNeededInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-LOAD-TABLE-8
     *
     * @return 
     */
    public LoadTable8OutCtx loadTable8(LoadTable8InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2111-MOVE-TO-TABLE-8
     *
     * @return 
     */
    public MoveToTable8OutCtx moveToTable8(MoveToTable8InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-LOAD-TABLE-9-IF-NEEDED
     *
     * @return 
     */
    public LoadTable9IfNeededOutCtx loadTable9IfNeeded(LoadTable9IfNeededInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2210-LOAD-TABLE-9
     *
     * @return 
     */
    public LoadTable9OutCtx loadTable9(LoadTable9InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2211-MOVE-TO-TABLE-9
     *
     * @return 
     */
    public MoveToTable9OutCtx moveToTable9(MoveToTable9InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-RESOLVE-FIRST-SUBFLD-PTRS
     *
     * @return 
     */
    public ResolveFirstSubfldPtrsOutCtx resolveFirstSubfldPtrs(ResolveFirstSubfldPtrsInCtx methodIn) throws Exception;

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
