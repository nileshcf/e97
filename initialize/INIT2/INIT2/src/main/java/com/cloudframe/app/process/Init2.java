package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.init2.Init2Ctx.InitializeOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.init2.Init2Ctx;


import com.cloudframe.app.dto.ProgramContext;

public interface Init2 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Init2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(Init2Ctx programCtx) throws Exception;


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
