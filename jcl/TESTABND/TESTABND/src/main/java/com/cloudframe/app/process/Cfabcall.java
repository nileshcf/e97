package com.cloudframe.app.process;

import com.cloudframe.app.cfabcall.CfabcallCtx.AbendInCtx;
import com.cloudframe.app.cfabcall.CfabcallCtx.AbendOutCtx;
import com.cloudframe.app.cfabcall.CfabcallCtx;
import com.cloudframe.app.cfabcall.CfabcallCtx.InitializeOutCtx;
import com.cloudframe.app.cfabcall.CfabcallCtx.InitializeInCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfabcall {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(CfabcallCtx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(CfabcallCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-ROUTINE
     *
     */
    public void mainRoutine(CfabcallCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-ABEND
     *
     * @return 
     */
    public AbendOutCtx abend(AbendInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-GOBACK
     *
     */
    public void goback(CfabcallCtx programCtx) throws Exception;


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
