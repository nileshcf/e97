package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.oldnew.OldnewCtx.WriteParaInCtx;
import com.cloudframe.app.oldnew.OldnewCtx;
import com.cloudframe.app.oldnew.OldnewCtx.WriteParaOutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Oldnew {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(OldnewCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-WRITE-PARA
     *
     * @return 
     */
    public WriteParaOutCtx writePara(WriteParaInCtx methodIn) throws Exception;


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
