package com.cloudframe.app.process;

import com.cloudframe.app.cfsort09.Cfsort09Ctx.ReturnRecordsInCtx;
import com.cloudframe.app.cfsort09.Cfsort09Ctx.MainlineInCtx;
import com.cloudframe.app.cfsort09.Cfsort09Ctx;
import com.cloudframe.app.cfsort09.Cfsort09Ctx.InitOutCtx;
import com.cloudframe.app.cfsort09.Cfsort09Ctx.InitInCtx;
import com.cloudframe.app.cfsort09.Cfsort09Ctx.MainlineOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfsort09.Cfsort09Ctx.ReturnRecordsOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfsort09 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Cfsort09Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cfsort09Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-INIT
     *
     * @return 
     */
    public InitOutCtx init(InitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-RETURN-RECORDS
     *
     * @return 
     */
    public ReturnRecordsOutCtx returnRecords(ReturnRecordsInCtx methodIn) throws Exception;


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
