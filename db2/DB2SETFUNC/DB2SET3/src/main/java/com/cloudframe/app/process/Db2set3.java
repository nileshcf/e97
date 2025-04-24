package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.db2set3.Db2set3Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.db2set3.Db2set3Ctx.InitializeOutCtx;
import com.cloudframe.app.db2set3.Db2set3Ctx.InitializeInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Db2set3 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Db2set3Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     */
    public void main(Db2set3Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;


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
