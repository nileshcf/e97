package com.cloudframe.app.process;

import com.cloudframe.app.cfif01.Cfif01Ctx.TestConditionsInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfif01.Cfif01Ctx.Process1InCtx;
import com.cloudframe.app.cfif01.Cfif01Ctx;
import com.cloudframe.app.cfif01.Cfif01Ctx.TestIfParaInCtx;
import com.cloudframe.app.cfif01.Cfif01Ctx.TestConditionsOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfif01.Cfif01Ctx.Process1OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfif01 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cfif01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TEST-CONDITIONS
     *
     * @return 
     */
    public TestConditionsOutCtx testConditions(TestConditionsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - TEST-IF-PARA
     *
     */
    public void testIfPara(TestIfParaInCtx methodIn) throws Exception;

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
