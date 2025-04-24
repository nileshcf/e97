package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.db2hst1.Db2hst1Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.db2hst1.Db2hst1Ctx.SelectParaOutCtx;
import com.cloudframe.app.db2hst1.Db2hst1Ctx.SelectParaInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Db2hst1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Db2hst1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - START-OF-PROGRAM
     *
     */
    public void startOfProgram(Db2hst1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SELECT-PARA
     *
     * @return 
     */
    public SelectParaOutCtx selectPara(SelectParaInCtx methodIn) throws Exception;


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
