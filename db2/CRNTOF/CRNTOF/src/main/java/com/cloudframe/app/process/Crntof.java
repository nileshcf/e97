package com.cloudframe.app.process;

import com.cloudframe.app.crntof.CrntofCtx.ExecuteQueryInCtx;
import com.cloudframe.app.crntof.CrntofCtx.FetchCursorInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.crntof.CrntofCtx.ExecuteQueryOutCtx;
import com.cloudframe.app.crntof.CrntofCtx.FetchCursorOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.crntof.CrntofCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Crntof {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(CrntofCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(CrntofCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-EXECUTE-QUERY
     *
     * @return 
     */
    public ExecuteQueryOutCtx executeQuery(ExecuteQueryInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-FETCH-CURSOR
     *
     * @return 
     */
    public FetchCursorOutCtx fetchCursor(FetchCursorInCtx methodIn) throws Exception;


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
