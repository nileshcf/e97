package com.cloudframe.app.process;

import com.cloudframe.app.multi0.Multi0Ctx.MainOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.multi0.Multi0Ctx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Multi0 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Multi0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     * @return 
     */
    public MainOutCtx main(Multi0Ctx programCtx) throws Exception;


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
