package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sh025.Sh025Ctx;
import com.cloudframe.app.sh025.Sh025Ctx.MainSplit0OutCtx;
import com.cloudframe.app.sh025.Sh025Ctx.MainSplit1InCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Sh025 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sh025Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     */
    public void main(Sh025Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT0
     *
     * @return 
     */
    public MainSplit0OutCtx mainSplit0(Sh025Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-SPLIT1
     *
     */
    public void mainSplit1(MainSplit1InCtx methodIn) throws Exception;


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
