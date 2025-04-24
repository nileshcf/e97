package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.read0001.Read0001Ctx.OpenReadClose1stTimeInCtx;
import com.cloudframe.app.read0001.Read0001Ctx.OpenReadClose2ndTimeInCtx;
import com.cloudframe.app.read0001.Read0001Ctx.OpenReadClose2ndTimeOutCtx;
import com.cloudframe.app.read0001.Read0001Ctx;
import com.cloudframe.app.read0001.Read0001Ctx.OpenReadClose3rdTimeOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.read0001.Read0001Ctx.MainlineOutCtx;
import com.cloudframe.app.read0001.Read0001Ctx.MainlineInCtx;
import com.cloudframe.app.read0001.Read0001Ctx.OpenReadClose1stTimeOutCtx;
import com.cloudframe.app.read0001.Read0001Ctx.OpenReadClose3rdTimeInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Read0001 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Read0001Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - OPEN-READ-CLOSE-1ST-TIME
     *
     * @return 
     */
    public OpenReadClose1stTimeOutCtx openReadClose1stTime(OpenReadClose1stTimeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - OPEN-READ-CLOSE-2ND-TIME
     *
     * @return 
     */
    public OpenReadClose2ndTimeOutCtx openReadClose2ndTime(OpenReadClose2ndTimeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - OPEN-READ-CLOSE-3RD-TIME
     *
     * @return 
     */
    public OpenReadClose3rdTimeOutCtx openReadClose3rdTime(OpenReadClose3rdTimeInCtx methodIn) throws Exception;


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
