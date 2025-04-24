package com.cloudframe.app.process;

import com.cloudframe.app.dbissues.DbissuesCtx.Process1000InCtx;
import com.cloudframe.app.dbissues.DbissuesCtx.WriteFiz018oOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dbissues.DbissuesCtx.ReadFiz018iOutCtx;
import com.cloudframe.app.dbissues.DbissuesCtx.CompareOutCtx;
import com.cloudframe.app.dbissues.DbissuesCtx;
import com.cloudframe.app.dbissues.DbissuesCtx.ReadFiz018iInCtx;
import com.cloudframe.app.dbissues.DbissuesCtx.HandleIfInCtx;
import com.cloudframe.app.dbissues.DbissuesCtx.WriteFiz018oInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dbissues.DbissuesCtx.Process1000OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Dbissues {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(DbissuesCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PROCESS
     *
     * @return 
     */
    public Process1000OutCtx process1000(Process1000InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-READ-FIZ018I
     *
     * @return 
     */
    public ReadFiz018iOutCtx readFiz018i(ReadFiz018iInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-WRITE-FIZ018O
     *
     * @return 
     */
    public WriteFiz018oOutCtx writeFiz018o(WriteFiz018oInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-COMPARE
     *
     * @return 
     */
    public CompareOutCtx compare(DbissuesCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4001-HANDLE-IF
     *
     */
    public void handleIf(HandleIfInCtx methodIn) throws Exception;


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
