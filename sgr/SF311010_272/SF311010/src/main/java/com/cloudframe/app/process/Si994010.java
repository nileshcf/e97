package com.cloudframe.app.process;

import com.cloudframe.app.si994010.Si994010Ctx.SetupFixed5010OutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupVarInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.InitializeWorkAreasOutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupFixedInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupUnusedErrorOutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.ParseSecondMessageInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupVar5020OutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.ExpandTheBitMapOutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.GetFirstMessageInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupFixed5010InCtx;
import com.cloudframe.app.si994010.Si994010Ctx.GetSecondMessageInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupVar5020InCtx;
import com.cloudframe.app.si994010.Si994010Ctx.ParseSecondMessageOutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.ParseFirstMessageOutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.InitializeWorkAreasInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupFixedOutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.MainlineInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupUnusedError5030InCtx;
import com.cloudframe.app.si994010.Si994010Ctx.ParseFirstMessageInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupUnusedErrorInCtx;
import com.cloudframe.app.si994010.Si994010Ctx;
import com.cloudframe.app.si994010.Si994010Ctx.SetupUnusedError5030OutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.GetSecondMessageOutCtx;
import com.cloudframe.app.si994010.Si994010Ctx.ExpandTheBitMapInCtx;
import com.cloudframe.app.si994010.Si994010Ctx.GetFirstMessageOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.si994010.Si994010Ctx.SetupVarOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Si994010 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Si994010Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Si994010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-WORK-AREAS
     *
     * @return 
     */
    public InitializeWorkAreasOutCtx initializeWorkAreas(InitializeWorkAreasInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-GET-FIRST-MESSAGE
     *
     * @return 
     */
    public GetFirstMessageOutCtx getFirstMessage(GetFirstMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-PARSE-FIRST-MESSAGE
     *
     * @return 
     */
    public ParseFirstMessageOutCtx parseFirstMessage(ParseFirstMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3010-SETUP-FIXED
     *
     * @return 
     */
    public SetupFixedOutCtx setupFixed(SetupFixedInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3020-SETUP-VAR
     *
     * @return 
     */
    public SetupVarOutCtx setupVar(SetupVarInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3030-SETUP-UNUSED-ERROR
     *
     * @return 
     */
    public SetupUnusedErrorOutCtx setupUnusedError(SetupUnusedErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-GET-SECOND-MESSAGE
     *
     * @return 
     */
    public GetSecondMessageOutCtx getSecondMessage(GetSecondMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-PARSE-SECOND-MESSAGE
     *
     * @return 
     */
    public ParseSecondMessageOutCtx parseSecondMessage(ParseSecondMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5010-SETUP-FIXED
     *
     * @return 
     */
    public SetupFixed5010OutCtx setupFixed5010(SetupFixed5010InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5020-SETUP-VAR
     *
     * @return 
     */
    public SetupVar5020OutCtx setupVar5020(SetupVar5020InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5030-SETUP-UNUSED-ERROR
     *
     * @return 
     */
    public SetupUnusedError5030OutCtx setupUnusedError5030(SetupUnusedError5030InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-EXPAND-THE-BIT-MAP
     *
     * @return 
     */
    public ExpandTheBitMapOutCtx expandTheBitMap(ExpandTheBitMapInCtx methodIn) throws Exception;


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
