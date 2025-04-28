package com.cloudframe.app.process;

import com.cloudframe.app.ip661020.Ip661020Ctx.TerminateWithErrorOutCtx;
import com.cloudframe.app.ip661020.Ip661020Ctx.OpenIpmFileOutCtx;
import com.cloudframe.app.ip661020.Ip661020Ctx.ReadAMessageInCtx;
import com.cloudframe.app.ip661020.Ip661020Ctx;
import com.cloudframe.app.ip661020.Ip661020Ctx.MainlineInCtx;
import com.cloudframe.app.ip661020.Ip661020Ctx.OpenIpmFileInCtx;
import com.cloudframe.app.ip661020.Ip661020Ctx.ReadAMessageOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip661020.Ip661020Ctx.CloseIpmFileInCtx;
import com.cloudframe.app.ip661020.Ip661020Ctx.CloseIpmFileOutCtx;
import com.cloudframe.app.ip661020.Ip661020Ctx.TerminateWithErrorInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip661020.Ip661020Ctx.MainlineOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip661020 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip661020Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-OPEN-IPM-FILE
     *
     * @return 
     */
    public OpenIpmFileOutCtx openIpmFile(OpenIpmFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-READ-A-MESSAGE
     *
     * @return 
     */
    public ReadAMessageOutCtx readAMessage(ReadAMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-CLOSE-IPM-FILE
     *
     * @return 
     */
    public CloseIpmFileOutCtx closeIpmFile(CloseIpmFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9500-TERMINATE-WITH-ERROR
     *
     * @return 
     */
    public TerminateWithErrorOutCtx terminateWithError(TerminateWithErrorInCtx methodIn) throws Exception;


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
