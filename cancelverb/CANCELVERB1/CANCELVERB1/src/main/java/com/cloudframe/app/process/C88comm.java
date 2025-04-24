package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.c88comm.C88commCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.c88comm.C88commCtx.MainParaOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface C88comm {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(C88commCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAIN-PARA
     *
     * @return 
     */
    public MainParaOutCtx mainPara(C88commCtx programCtx) throws Exception;


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
