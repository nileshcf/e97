package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfsort05.Cfsort05Ctx;
import com.cloudframe.app.cfsort05.Cfsort05Ctx.ReturnRecordsOutCtx;
import com.cloudframe.app.cfsort05.Cfsort05Ctx.ReturnRecordsInCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfsort05 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cfsort05Ctx programCtx) throws Exception;

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
