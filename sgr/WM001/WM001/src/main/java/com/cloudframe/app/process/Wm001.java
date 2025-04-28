package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.wm001.Wm001Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.wm001.Wm001Ctx.StartPgmInCtx;
import com.cloudframe.app.wm001.Wm001Ctx.StartPgmOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Wm001 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Wm001Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 000-START-PGM
     *
     * @return 
     */
    public StartPgmOutCtx startPgm(StartPgmInCtx methodIn) throws Exception;


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
