package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfsort02.Cfsort02Ctx.ReleaseRecordsInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfsort02.Cfsort02Ctx.ReleaseRecordsOutCtx;
import com.cloudframe.app.cfsort02.Cfsort02Ctx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfsort02 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cfsort02Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-RELEASE-RECORDS
     *
     * @return 
     */
    public ReleaseRecordsOutCtx releaseRecords(ReleaseRecordsInCtx methodIn) throws Exception;


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
