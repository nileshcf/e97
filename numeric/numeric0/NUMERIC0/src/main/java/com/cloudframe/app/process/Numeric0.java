package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.numeric0.Numeric0Ctx.SignLeadingOutCtx;
import com.cloudframe.app.numeric0.Numeric0Ctx.SignLeadingInCtx;
import com.cloudframe.app.numeric0.Numeric0Ctx.InitNumbersOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.numeric0.Numeric0Ctx;
import com.cloudframe.app.numeric0.Numeric0Ctx.CompareEqualsOutCtx;
import com.cloudframe.app.numeric0.Numeric0Ctx.CompareEqualsInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Numeric0 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Numeric0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - SIGN-LEADING
     *
     * @return 
     */
    public SignLeadingOutCtx signLeading(SignLeadingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - INIT-NUMBERS
     *
     * @return 
     */
    public InitNumbersOutCtx initNumbers(Numeric0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - COMPARE-EQUALS
     *
     * @return 
     */
    public CompareEqualsOutCtx compareEquals(CompareEqualsInCtx methodIn) throws Exception;


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
