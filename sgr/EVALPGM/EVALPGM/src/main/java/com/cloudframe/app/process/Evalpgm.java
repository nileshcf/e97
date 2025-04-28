package com.cloudframe.app.process;

import com.cloudframe.app.evalpgm.EvalpgmCtx.TestValuesOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.evalpgm.EvalpgmCtx.TestValuesInCtx;
import com.cloudframe.app.evalpgm.EvalpgmCtx.TestEvaluateOutCtx;
import com.cloudframe.app.evalpgm.EvalpgmCtx;
import com.cloudframe.app.evalpgm.EvalpgmCtx.TestOutInCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Evalpgm {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(EvalpgmCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-PROCESS
     *
     */
    public void mainProcess(EvalpgmCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0001-TEST-VALUES
     *
     * @return 
     */
    public TestValuesOutCtx testValues(TestValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0002-TEST-EVALUATE
     *
     * @return 
     */
    public TestEvaluateOutCtx testEvaluate(EvalpgmCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0003-TEST-OUT
     *
     */
    public void testOut(TestOutInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0004-DISPLAY-PARA
     *
     */
    public void displayPara(EvalpgmCtx programCtx) throws Exception;


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
