package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dxc001.Dxc001Ctx.MainlineInCtx;
import com.cloudframe.app.dxc001.Dxc001Ctx.MainlineOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dxc001.Dxc001Ctx;


import com.cloudframe.app.dto.ProgramContext;

public interface Dxc001 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Dxc001Ctx programCtx) throws Exception;

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
