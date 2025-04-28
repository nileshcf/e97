package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcvsam1.Mcvsam1Ctx;
import com.cloudframe.app.mcvsam1.Mcvsam1Ctx.ProcessIrdExtrSplit1InCtx;
import com.cloudframe.app.mcvsam1.Mcvsam1Ctx.ProcessIrdExtrSplit0InCtx;
import com.cloudframe.app.mcvsam1.Mcvsam1Ctx.ProcessIrdExtrSplit1OutCtx;
import com.cloudframe.app.mcvsam1.Mcvsam1Ctx.ProcessIrdExtrSplit0OutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcvsam1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mcvsam1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Mcvsam1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DO-INITIALIZATION
     *
     */
    public void doInitialization(Mcvsam1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-IRD-EXTR
     *
     */
    public void processIrdExtr(Mcvsam1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-IRD-EXTR-SPLIT0
     *
     * @return 
     */
    public ProcessIrdExtrSplit0OutCtx processIrdExtrSplit0(ProcessIrdExtrSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-IRD-EXTR-SPLIT1
     *
     * @return 
     */
    public ProcessIrdExtrSplit1OutCtx processIrdExtrSplit1(ProcessIrdExtrSplit1InCtx methodIn) throws Exception;


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
