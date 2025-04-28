package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.init1.Init1Ctx.Process1OutCtx;
import com.cloudframe.app.init1.Init1Ctx;
import com.cloudframe.app.init1.Init1Ctx.Process1InCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Init1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Init1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1
     *
     * @return 
     */
    public Process1OutCtx process1(Process1InCtx methodIn) throws Exception;


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
