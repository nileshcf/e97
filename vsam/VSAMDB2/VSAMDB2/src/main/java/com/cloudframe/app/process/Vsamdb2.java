package com.cloudframe.app.process;

import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.DoInitializationOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.AbendProgramInCtx;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.DoInitializationInCtx;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.SelectRedWidgetsOutCtx;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.ProcessIrdExtrOutCtx;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.OpenInputSys001OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.AbendProgramOutCtx;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.OpenInputSys001InCtx;
import com.cloudframe.app.vsamdb2.Vsamdb2Ctx.SelectRedWidgetsInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Vsamdb2 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Vsamdb2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Vsamdb2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DO-INITIALIZATION
     *
     * @return 
     */
    public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-INPUT-SYS001
     *
     * @return 
     */
    public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-IRD-EXTR
     *
     * @return 
     */
    public ProcessIrdExtrOutCtx processIrdExtr(Vsamdb2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-SELECT-RED-WIDGETS
     *
     * @return 
     */
    public SelectRedWidgetsOutCtx selectRedWidgets(SelectRedWidgetsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9500-ABEND-PROGRAM
     *
     * @return 
     */
    public AbendProgramOutCtx abendProgram(AbendProgramInCtx methodIn) throws Exception;


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
