package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.init4.Init4Ctx.MainlineOutCtx;
import com.cloudframe.app.init4.Init4Ctx.PrintOutCtx;
import com.cloudframe.app.init4.Init4Ctx.MainlineInCtx;
import com.cloudframe.app.init4.Init4Ctx.PrintInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.init4.Init4Ctx;


import com.cloudframe.app.dto.ProgramContext;

public interface Init4 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Init4Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PRINT
     *
     * @return 
     */
    public PrintOutCtx print(PrintInCtx methodIn) throws Exception;


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
