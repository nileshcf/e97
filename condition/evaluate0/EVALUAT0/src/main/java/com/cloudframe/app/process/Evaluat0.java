package com.cloudframe.app.process;

import com.cloudframe.app.evaluat0.Evaluat0Ctx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.evaluat0.Evaluat0Ctx.CheckNumsInCtx;
import com.cloudframe.app.evaluat0.Evaluat0Ctx.MainRoutineOutCtx;
import com.cloudframe.app.evaluat0.Evaluat0Ctx.EvaluateInCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Evaluat0 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Evaluat0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-ROUTINE
     *
     * @return 
     */
    public MainRoutineOutCtx mainRoutine(Evaluat0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-CHECK-NUMS
     *
     */
    public void checkNums(CheckNumsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0110-EVALUATE
     *
     */
    public void evaluate(EvaluateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-GOBACK
     *
     */
    public void goback(Evaluat0Ctx programCtx) throws Exception;


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
