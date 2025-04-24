package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.abprog8.Abprog8Ctx.CallAbprog9OutCtx;
import com.cloudframe.app.abprog8.Abprog8Ctx;
import com.cloudframe.app.abprog8.Abprog8Ctx.CallAbprog9InCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Abprog8 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Abprog8Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     */
    public void main(Abprog8Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0001-CALL-ABPROG9
     *
     * @return 
     */
    public CallAbprog9OutCtx callAbprog9(CallAbprog9InCtx methodIn) throws Exception;


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
