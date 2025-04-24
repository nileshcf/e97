package com.cloudframe.app.process;

import com.cloudframe.app.proga1.Proga1Ctx.ExecuteOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.proga1.Proga1Ctx.ExecuteInCtx;
import com.cloudframe.app.proga1.Proga1Ctx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Proga1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Proga1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-MAINLINE
     *
     */
    public void mainline(Proga1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-EXECUTE
     *
     * @return 
     */
    public ExecuteOutCtx execute(ExecuteInCtx methodIn) throws Exception;


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
