package com.cloudframe.app.process;

import com.cloudframe.app.ip650010.Ip650010Ctx.CloseFileCheckStatusInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.DisplayCountInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.CloseFileCheckStatusOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.OpenOptParmFileInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.InitializeOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.DisplayCountOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.CloseOneDayFileOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.ReadBuildReturnDataOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.PositionOptParmFileInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.ReturnSegToCallerInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip650010.Ip650010Ctx.InitializeInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.ReadOptParmFileOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx;
import com.cloudframe.app.ip650010.Ip650010Ctx.ReadBuildReturnDataInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.OpenOptParmFileOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.ReturnSegToCallerOutCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.MainlineInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip650010.Ip650010Ctx.ReadOptParmFileInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.CloseOneDayFileInCtx;
import com.cloudframe.app.ip650010.Ip650010Ctx.PositionOptParmFileOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip650010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip650010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-OPT-PARM-FILE
     *
     * @return 
     */
    public OpenOptParmFileOutCtx openOptParmFile(OpenOptParmFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-READ-BUILD-RETURN-DATA
     *
     * @return 
     */
    public ReadBuildReturnDataOutCtx readBuildReturnData(ReadBuildReturnDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-POSITION-OPT-PARM-FILE
     *
     * @return 
     */
    public PositionOptParmFileOutCtx positionOptParmFile(PositionOptParmFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-READ-OPT-PARM-FILE
     *
     * @return 
     */
    public ReadOptParmFileOutCtx readOptParmFile(ReadOptParmFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-RETURN-SEG-TO-CALLER
     *
     * @return 
     */
    public ReturnSegToCallerOutCtx returnSegToCaller(ReturnSegToCallerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-CLOSE-FILE-CHECK-STATUS
     *
     * @return 
     */
    public CloseFileCheckStatusOutCtx closeFileCheckStatus(CloseFileCheckStatusInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-CLOSE-ONE-DAY-FILE
     *
     * @return 
     */
    public CloseOneDayFileOutCtx closeOneDayFile(CloseOneDayFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-DISPLAY-COUNT
     *
     * @return 
     */
    public DisplayCountOutCtx displayCount(DisplayCountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     */
    public void terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;


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
