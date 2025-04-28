package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dbrowset.DbrowsetCtx.FetchRowsOutCtx;
import com.cloudframe.app.dbrowset.DbrowsetCtx;
import com.cloudframe.app.dbrowset.DbrowsetCtx.InitializeOutCtx;
import com.cloudframe.app.dbrowset.DbrowsetCtx.FetchRowsInCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Dbrowset {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(DbrowsetCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - START-OF-PROGRAM
     *
     */
    public void startOfProgram(DbrowsetCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(DbrowsetCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-FETCH-ROWS
     *
     * @return 
     */
    public FetchRowsOutCtx fetchRows(FetchRowsInCtx methodIn) throws Exception;


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
