package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sqlcount.SqlcountCtx.SelectInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sqlcount.SqlcountCtx.SelectOutCtx;
import com.cloudframe.app.sqlcount.SqlcountCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sqlcount {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(SqlcountCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(SqlcountCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-SELECT
     *
     * @return 
     */
    public SelectOutCtx select(SelectInCtx methodIn) throws Exception;


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
