package com.cloudframe.app.process;

import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.ReadSys001FileOutCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.DoInitializationInCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.ReadSys001FileInCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.DoInitializationOutCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.OpenInputSys001OutCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.AbendProgramOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.OpenInputSys001InCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.AbendProgramInCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.ProcessIrdExtrInCtx;
import com.cloudframe.app.mcvsam2.Mcvsam2Ctx.ProcessIrdExtrOutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcvsam2 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mcvsam2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Mcvsam2Ctx programCtx) throws Exception;

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
    public ProcessIrdExtrOutCtx processIrdExtr(ProcessIrdExtrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-READ-SYS001-FILE
     *
     * @return 
     */
    public ReadSys001FileOutCtx readSys001File(ReadSys001FileInCtx methodIn) throws Exception;

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
