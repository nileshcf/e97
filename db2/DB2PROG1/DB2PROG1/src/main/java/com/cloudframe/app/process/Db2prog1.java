package com.cloudframe.app.process;

import com.cloudframe.app.db2prog1.Db2prog1Ctx.InsertWidgetsInCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.Process1000OutCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.PrintWidgetsOutCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.CheckSqlcodeInCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.MainOutCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.UpdateWidgetsOutCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.SelectWidgetInCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.SelectWidgetOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.UpdateWidgetsInCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.MainInCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.DeleteWidgetsOutCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.DeleteWidgetsInCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.Process1000InCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.CheckSqlcodeOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.InsertWidgetsOutCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx.PrintWidgetsInCtx;
import com.cloudframe.app.db2prog1.Db2prog1Ctx;


import com.cloudframe.app.dto.ProgramContext;

public interface Db2prog1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Db2prog1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     * @return 
     */
    public MainOutCtx main(MainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PROCESS
     *
     * @return 
     */
    public Process1000OutCtx process1000(Process1000InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1001-INSERT-WIDGETS
     *
     * @return 
     */
    public InsertWidgetsOutCtx insertWidgets(InsertWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1002-UPDATE-WIDGETS
     *
     * @return 
     */
    public UpdateWidgetsOutCtx updateWidgets(UpdateWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1003-PRINT-WIDGETS
     *
     * @return 
     */
    public PrintWidgetsOutCtx printWidgets(PrintWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1004-DELETE-WIDGETS
     *
     * @return 
     */
    public DeleteWidgetsOutCtx deleteWidgets(DeleteWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1005-SELECT-WIDGET
     *
     * @return 
     */
    public SelectWidgetOutCtx selectWidget(SelectWidgetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-CHECK-SQLCODE
     *
     * @return 
     */
    public CheckSqlcodeOutCtx checkSqlcode(CheckSqlcodeInCtx methodIn) throws Exception;


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
