package com.cloudframe.app.process;

import com.cloudframe.app.mcfile1.Mcfile1Ctx.TerminateInCtx;
import com.cloudframe.app.mcfile1.Mcfile1Ctx.InitializeInCtx;
import com.cloudframe.app.mcfile1.Mcfile1Ctx.WriteRecordOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcfile1.Mcfile1Ctx.TerminateOutCtx;
import com.cloudframe.app.mcfile1.Mcfile1Ctx.InitializeOutCtx;
import com.cloudframe.app.mcfile1.Mcfile1Ctx.WriteRecordInCtx;
import com.cloudframe.app.mcfile1.Mcfile1Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mcfile1.Mcfile1Ctx.AbendOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcfile1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mcfile1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Mcfile1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-WRITE-RECORD
     *
     * @return 
     */
    public WriteRecordOutCtx writeRecord(WriteRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-TERMINATE
     *
     * @return 
     */
    public TerminateOutCtx terminate(TerminateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9100-ABEND
     *
     * @return 
     */
    public AbendOutCtx abend(Mcfile1Ctx programCtx) throws Exception;


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
