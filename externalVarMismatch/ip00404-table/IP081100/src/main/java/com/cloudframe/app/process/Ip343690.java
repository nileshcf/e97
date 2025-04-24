package com.cloudframe.app.process;

import com.cloudframe.app.ip343690.Ip343690Ctx.AbendTheProgramInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.DoEndProcessInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ReadInputSys001InCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.DoCommitInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.DeadLockOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ProcessTable40LookupInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CheckDb2ConnectionInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ExecuteDb2errRotuineInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.OpenPmaCursorOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.UpdateTipapmaInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CloseInputSys001OutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.UpdatePmaCursorInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.BeginProcessOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.UpdateTipapmaOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.AbendTheProgramOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ExecuteDb2errRotuineOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.BeginProcessInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ProcessRuncntlFileInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.DoCommitOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ProcessInputSys001InCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ProcessRuncntlFileOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ClosePmaCursorOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.FetchUpdatePmaCursorInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ConnectToDb2OutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CallMcwaitForSleepOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CallMcwaitForSleepInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CheckDb2ConnectionOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CloseInputSys001InCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.OpenInputSys001InCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ProcessTable40LookupOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.OpenInputSys001OutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ConnectToDb2InCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.UpdatePmaCursorOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CheckStatusMapInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ReadInputSys001OutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.DoEndProcessOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.OpenPmaCursorInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.CheckStatusMapOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.FetchUpdatePmaCursorOutCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx;
import com.cloudframe.app.ip343690.Ip343690Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip343690.Ip343690Ctx.DeadLockInCtx;
import com.cloudframe.app.ip343690.Ip343690Ctx.ClosePmaCursorInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip343690 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Ip343690Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip343690Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip343690Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-BEGIN-PROCESS
     *
     * @return 
     */
    public BeginProcessOutCtx beginProcess(BeginProcessInCtx methodIn) throws Exception;

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
     * This method is derived from Cobol Paragraph - 1300-PROCESS-RUNCNTL-FILE
     *
     * @return 
     */
    public ProcessRuncntlFileOutCtx processRuncntlFile(ProcessRuncntlFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-OPEN-INPUT-SYS001
     *
     * @return 
     */
    public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-CONNECT-TO-DB2
     *
     * @return 
     */
    public ConnectToDb2OutCtx connectToDb2(ConnectToDb2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-PROCESS-INPUT-SYS001
     *
     */
    public void processInputSys001(ProcessInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-PROCESS-TABLE40-LOOKUP
     *
     * @return 
     */
    public ProcessTable40LookupOutCtx processTable40Lookup(ProcessTable40LookupInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3200-UPDATE-TIPAPMA
     *
     * @return 
     */
    public UpdateTipapmaOutCtx updateTipapma(UpdateTipapmaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3210-OPEN-PMA-CURSOR
     *
     * @return 
     */
    public OpenPmaCursorOutCtx openPmaCursor(OpenPmaCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3220-FETCH-UPDATE-PMA-CURSOR
     *
     * @return 
     */
    public FetchUpdatePmaCursorOutCtx fetchUpdatePmaCursor(FetchUpdatePmaCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3230-CLOSE-PMA-CURSOR
     *
     * @return 
     */
    public ClosePmaCursorOutCtx closePmaCursor(ClosePmaCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3300-DO-END-PROCESS
     *
     * @return 
     */
    public DoEndProcessOutCtx doEndProcess(DoEndProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-CHECK-DB2-CONNECTION
     *
     * @return 
     */
    public CheckDb2ConnectionOutCtx checkDb2Connection(CheckDb2ConnectionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-CHECK-STATUS-MAP
     *
     * @return 
     */
    public CheckStatusMapOutCtx checkStatusMap(CheckStatusMapInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-READ-INPUT-SYS001
     *
     * @return 
     */
    public ReadInputSys001OutCtx readInputSys001(ReadInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8210-CLOSE-INPUT-SYS001
     *
     * @return 
     */
    public CloseInputSys001OutCtx closeInputSys001(CloseInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-UPDATE-PMA-CURSOR
     *
     * @return 
     */
    public UpdatePmaCursorOutCtx updatePmaCursor(UpdatePmaCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-DO-COMMIT
     *
     * @return 
     */
    public DoCommitOutCtx doCommit(DoCommitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9100-DEAD-LOCK
     *
     * @return 
     */
    public DeadLockOutCtx deadLock(DeadLockInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9200-CALL-MCWAIT-FOR-SLEEP
     *
     * @return 
     */
    public CallMcwaitForSleepOutCtx callMcwaitForSleep(CallMcwaitForSleepInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9500-ABEND-THE-PROGRAM
     *
     * @return 
     */
    public AbendTheProgramOutCtx abendTheProgram(AbendTheProgramInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9510-EXECUTE-DB2ERR-ROTUINE
     *
     * @return 
     */
    public ExecuteDb2errRotuineOutCtx executeDb2errRotuine(ExecuteDb2errRotuineInCtx methodIn) throws Exception;

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
