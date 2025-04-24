package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip313010.Ip313010Ctx.DoInitializationInCtx;
import com.cloudframe.app.ip313010.Ip313010Ctx.MoveTableEntryOutCtx;
import com.cloudframe.app.ip313010.Ip313010Ctx.DoInitializationOutCtx;
import com.cloudframe.app.ip313010.Ip313010Ctx;
import com.cloudframe.app.ip313010.Ip313010Ctx.ProcessTbl0021OutCtx;
import com.cloudframe.app.ip313010.Ip313010Ctx.MoveTableEntryInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip313010.Ip313010Ctx.ProcessTbl0021InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip313010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip313010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip313010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DO-INITIALIZATION
     *
     * @return 
     */
    public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-TBL0021
     *
     * @return 
     */
    public ProcessTbl0021OutCtx processTbl0021(ProcessTbl0021InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-MOVE-TABLE-ENTRY
     *
     * @return 
     */
    public MoveTableEntryOutCtx moveTableEntry(MoveTableEntryInCtx methodIn) throws Exception;


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
