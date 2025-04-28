package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx.WriteFileIdHistInCtx;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx.ExecuteInitializationInCtx;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx.ProcessMessageOutCtx;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx.DisplayExecuteMsgOutCtx;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx.ProcessMessageInCtx;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx.ExecuteInitializationOutCtx;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx.WriteFileIdHistOutCtx;
import com.cloudframe.app.qsamrw01.Qsamrw01Ctx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Qsamrw01 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Qsamrw01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Qsamrw01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-EXECUTE-INITIALIZATION
     *
     * @return 
     */
    public ExecuteInitializationOutCtx executeInitialization(ExecuteInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXECUTE-MSG
     *
     * @return 
     */
    public DisplayExecuteMsgOutCtx displayExecuteMsg(Qsamrw01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-MESSAGE
     *
     * @return 
     */
    public ProcessMessageOutCtx processMessage(ProcessMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9520-TERMINATE-ROUTINE-FOR-PGM
     *
     */
    public void terminateRoutineForPgm(Qsamrw01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9521-WRITE-FILE-ID-HIST
     *
     * @return 
     */
    public WriteFileIdHistOutCtx writeFileIdHist(WriteFileIdHistInCtx methodIn) throws Exception;


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
