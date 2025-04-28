package com.cloudframe.app.process;

import com.cloudframe.app.uhdynsql.UhdynsqlCtx.BuildSqlOutCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.MainInCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.PrepareAndOpenOutCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.FetchWidgetsOutCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.BuildSqlInCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.CloseWidgetsInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.InitializeOutCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.PrepareAndOpenInCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.FetchAndPrintWidgetsInCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.FetchWidgetsInCtx;
import com.cloudframe.app.uhdynsql.UhdynsqlCtx.CloseWidgetsOutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Uhdynsql {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(UhdynsqlCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     */
    public void main(MainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(UhdynsqlCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-BUILD-SQL
     *
     * @return 
     */
    public BuildSqlOutCtx buildSql(BuildSqlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PREPARE-AND-OPEN
     *
     * @return 
     */
    public PrepareAndOpenOutCtx prepareAndOpen(PrepareAndOpenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2001-FETCH-AND-PRINT-WIDGETS
     *
     */
    public void fetchAndPrintWidgets(FetchAndPrintWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-FETCH-WIDGETS
     *
     * @return 
     */
    public FetchWidgetsOutCtx fetchWidgets(FetchWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-CLOSE-WIDGETS
     *
     * @return 
     */
    public CloseWidgetsOutCtx closeWidgets(CloseWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-EXIT-PROGRAM
     *
     */
    public void exitProgram(UhdynsqlCtx programCtx) throws Exception;


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
