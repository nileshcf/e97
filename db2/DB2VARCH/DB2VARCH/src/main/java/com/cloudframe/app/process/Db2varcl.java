package com.cloudframe.app.process;

import com.cloudframe.app.db2varcl.Db2varclCtx.SqlErrChkOutCtx;
import com.cloudframe.app.db2varcl.Db2varclCtx;
import com.cloudframe.app.db2varcl.Db2varclCtx.MainOutCtx;
import com.cloudframe.app.db2varcl.Db2varclCtx.MainInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.db2varcl.Db2varclCtx.SqlErrChkInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Db2varcl {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Db2varclCtx programCtx, String parm, String parm2, String parm3) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Db2varclCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     * @return 
     */
    public MainOutCtx main(MainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-SQL-ERR-CHK
     *
     * @return 
     */
    public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception;


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
