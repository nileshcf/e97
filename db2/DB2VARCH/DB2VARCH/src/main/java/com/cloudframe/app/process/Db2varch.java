package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.db2varch.Db2varchCtx;
import com.cloudframe.app.db2varch.Db2varchCtx.MainOutCtx;
import com.cloudframe.app.db2varch.Db2varchCtx.SelectBookOutCtx;
import com.cloudframe.app.db2varch.Db2varchCtx.SqlErrChkOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.db2varch.Db2varchCtx.MainInCtx;
import com.cloudframe.app.db2varch.Db2varchCtx.SqlErrChkInCtx;
import com.cloudframe.app.db2varch.Db2varchCtx.SelectBookInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Db2varch {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Db2varchCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     * @return 
     */
    public MainOutCtx main(MainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-SELECT-BOOK
     *
     * @return 
     */
    public SelectBookOutCtx selectBook(SelectBookInCtx methodIn) throws Exception;

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
