package com.cloudframe.app.process;

import com.cloudframe.app.callfd02.Callfd02Ctx;
import com.cloudframe.app.callfd02.Callfd02Ctx.MainlineOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.callfd02.Callfd02Ctx.MainlineInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Callfd02 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Callfd02Ctx programCtx, String parm, String parm2) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Callfd02Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
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
