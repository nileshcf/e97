package com.cloudframe.app.process;

import com.cloudframe.app.comput5.Comput5Ctx.MainSplit0InCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit1OutCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit6InCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit2OutCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit6OutCtx;
import com.cloudframe.app.comput5.Comput5Ctx.NumericCheckerOutCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit0OutCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit2InCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit4InCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit5OutCtx;
import com.cloudframe.app.comput5.Comput5Ctx.NumericCheckerInCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit4OutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit1InCtx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit5InCtx;
import com.cloudframe.app.comput5.Comput5Ctx;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit3OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.comput5.Comput5Ctx.MainSplit3InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Comput5 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Comput5Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     */
    public void main(Comput5Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT0
     *
     * @return 
     */
    public MainSplit0OutCtx mainSplit0(MainSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT1
     *
     * @return 
     */
    public MainSplit1OutCtx mainSplit1(MainSplit1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT2
     *
     * @return 
     */
    public MainSplit2OutCtx mainSplit2(MainSplit2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT3
     *
     * @return 
     */
    public MainSplit3OutCtx mainSplit3(MainSplit3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT4
     *
     * @return 
     */
    public MainSplit4OutCtx mainSplit4(MainSplit4InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT5
     *
     * @return 
     */
    public MainSplit5OutCtx mainSplit5(MainSplit5InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT6
     *
     * @return 
     */
    public MainSplit6OutCtx mainSplit6(MainSplit6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - ZZ100-NUMERIC-CHECKER SECTION
     *
     * @return 
     */
    public NumericCheckerOutCtx numericChecker(NumericCheckerInCtx methodIn) throws Exception;


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
