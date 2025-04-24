package com.cloudframe.app.process;

import com.cloudframe.app.ip081100.Ip081100Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.MainlineOutCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.DoInitializationInCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.ScanTbl40OccurrenceOutCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.DoInitializationOutCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip081100.Ip081100Ctx.ScanTbl40OccurrenceInCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip081100.Ip081100Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip081100.Ip081100Ctx;
import com.cloudframe.app.ip081100.Ip081100Ctx.MainlineInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip081100 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip081100Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DO-INITIALIZATION
     *
     * @return 
     */
    public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-SET-PROCEDURE-POINTERS
     *
     * @return 
     */
    public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SCAN-TBL40-OCCURRENCE
     *
     * @return 
     */
    public ScanTbl40OccurrenceOutCtx scanTbl40Occurrence(ScanTbl40OccurrenceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9950-UPDATE-EVENT-LOG
     *
     * @return 
     */
    public UpdateEventLogOutCtx updateEventLog(UpdateEventLogInCtx methodIn) throws Exception;


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
