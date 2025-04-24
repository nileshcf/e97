package com.cloudframe.app.process;

import com.cloudframe.app.divide0.Divide0Ctx.MainlineSplit0InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.divide0.Divide0Ctx.MainlineSplit0OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.divide0.Divide0Ctx;
import com.cloudframe.app.divide0.Divide0Ctx.MainlineSplit1OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Divide0 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Divide0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE
     *
     */
    public void mainline(Divide0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT0
     *
     * @return 
     */
    public MainlineSplit0OutCtx mainlineSplit0(MainlineSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT1
     *
     * @return 
     */
    public MainlineSplit1OutCtx mainlineSplit1(Divide0Ctx programCtx) throws Exception;


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
