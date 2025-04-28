package com.cloudframe.app.process;

import com.cloudframe.app.evaluat1.Evaluat1Ctx.MainRoutineOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.evaluat1.Evaluat1Ctx.MainRoutineInCtx;
import com.cloudframe.app.evaluat1.Evaluat1Ctx;


import com.cloudframe.app.dto.ProgramContext;

public interface Evaluat1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Evaluat1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-ROUTINE
     *
     * @return 
     */
    public MainRoutineOutCtx mainRoutine(MainRoutineInCtx methodIn) throws Exception;


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
