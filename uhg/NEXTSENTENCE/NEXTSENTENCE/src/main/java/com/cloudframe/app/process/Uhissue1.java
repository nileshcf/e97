package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.uhissue1.Uhissue1Ctx.Path1OutCtx;
import com.cloudframe.app.uhissue1.Uhissue1Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.uhissue1.Uhissue1Ctx.CheckConditionInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Uhissue1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Uhissue1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     */
    public void main(Uhissue1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-EXIT
     *
     */
    public void exit(Uhissue1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PATH1
     *
     * @return 
     */
    public Path1OutCtx path1(Uhissue1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-CHECK-CONDITION SECTION
     *
     */
    public void checkCondition(CheckConditionInCtx methodIn) throws Exception;


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
