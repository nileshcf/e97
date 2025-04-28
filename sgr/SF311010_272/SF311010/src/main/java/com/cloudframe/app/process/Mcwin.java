package com.cloudframe.app.process;

import com.cloudframe.app.mcwin.McwinCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinErrorMsgThreeOutCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinErrorMsgOneInCtx;
import com.cloudframe.app.mcwin.McwinCtx.TerminateProgramInCtx;
import com.cloudframe.app.mcwin.McwinCtx.ProcessInitializationOutCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinErrorMsgOneOutCtx;
import com.cloudframe.app.mcwin.McwinCtx.DisplayExecMsgsInCtx;
import com.cloudframe.app.mcwin.McwinCtx.ProcessInitializationInCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinMainOutCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinProcessCenturyOutCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinErrorMsgTwoOutCtx;
import com.cloudframe.app.mcwin.McwinCtx.UpdateEventLogInCtx;
import com.cloudframe.app.mcwin.McwinCtx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinProcessCenturyInCtx;
import com.cloudframe.app.mcwin.McwinCtx.UpdateEventLogOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mcwin.McwinCtx.McwinErrorMsgThreeInCtx;
import com.cloudframe.app.mcwin.McwinCtx.McwinErrorMsgTwoInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcwin {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(McwinCtx programCtx, String parm, String parm2, String parm3) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(McwinCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(McwinCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PROCESS-INITIALIZATION
     *
     * @return 
     */
    public ProcessInitializationOutCtx processInitialization(ProcessInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-MCWIN-MAIN
     *
     * @return 
     */
    public McwinMainOutCtx mcwinMain(McwinCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-MCWIN-ERROR-MSG-ONE
     *
     * @return 
     */
    public McwinErrorMsgOneOutCtx mcwinErrorMsgOne(McwinErrorMsgOneInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-MCWIN-ERROR-MSG-TWO
     *
     * @return 
     */
    public McwinErrorMsgTwoOutCtx mcwinErrorMsgTwo(McwinErrorMsgTwoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-MCWIN-ERROR-MSG-THREE
     *
     * @return 
     */
    public McwinErrorMsgThreeOutCtx mcwinErrorMsgThree(McwinErrorMsgThreeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2400-MCWIN-PROCESS-CENTURY
     *
     * @return 
     */
    public McwinProcessCenturyOutCtx mcwinProcessCentury(McwinProcessCenturyInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-PROGRAM
     *
     */
    public void terminateProgram(TerminateProgramInCtx methodIn) throws Exception;

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
