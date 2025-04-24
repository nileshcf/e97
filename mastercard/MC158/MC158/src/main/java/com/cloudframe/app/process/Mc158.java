package com.cloudframe.app.process;

import com.cloudframe.app.mc158.Mc158Ctx.MainlineInCtx;
import com.cloudframe.app.mc158.Mc158Ctx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mc158.Mc158Ctx.MainlineOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mc158 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mc158Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;


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
