package com.cloudframe.app.process;

import com.cloudframe.app.ip200090.Ip200090Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.CallEditModuleOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.CheckPresenceOfFldOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx;
import com.cloudframe.app.ip200090.Ip200090Ctx.SetEditProgramPointerOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.ChooseEditProgramInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.CallPgmIp381120OutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.PerformInitializationInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.CheckSubfldPresenceOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.ChooseEditProgramOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip200090.Ip200090Ctx.CallEditModuleInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.CheckSubfldPresenceInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.InitializeVariablesOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.PerformInitializationOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.TerminateOnErrorOutCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.CheckPresenceOfFldInCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.CallPgmIp381120InCtx;
import com.cloudframe.app.ip200090.Ip200090Ctx.SetEditProgramPointerInCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip200090 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip200090Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip200090Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PERFORM-INITIALIZATION
     *
     * @return 
     */
    public PerformInitializationOutCtx performInitialization(PerformInitializationInCtx methodIn) throws Exception;

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
     * This method is derived from Cobol Paragraph - 1300-INITIALIZE-VARIABLES
     *
     * @return 
     */
    public InitializeVariablesOutCtx initializeVariables(Ip200090Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-CHOOSE-EDIT-PROGRAM
     *
     * @return 
     */
    public ChooseEditProgramOutCtx chooseEditProgram(ChooseEditProgramInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-CHECK-PRESENCE-OF-FLD
     *
     * @return 
     */
    public CheckPresenceOfFldOutCtx checkPresenceOfFld(CheckPresenceOfFldInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-SET-EDIT-PROGRAM-POINTER
     *
     * @return 
     */
    public SetEditProgramPointerOutCtx setEditProgramPointer(SetEditProgramPointerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-CALL-PGM-IP381120
     *
     * @return 
     */
    public CallPgmIp381120OutCtx callPgmIp381120(CallPgmIp381120InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-CALL-EDIT-MODULE
     *
     * @return 
     */
    public CallEditModuleOutCtx callEditModule(CallEditModuleInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-CHECK-SUBFLD-PRESENCE
     *
     * @return 
     */
    public CheckSubfldPresenceOutCtx checkSubfldPresence(CheckSubfldPresenceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     * @return 
     */
    public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;


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
