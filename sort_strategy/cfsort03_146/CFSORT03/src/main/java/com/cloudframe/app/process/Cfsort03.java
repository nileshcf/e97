package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfsort03.Cfsort03Ctx.WriteClientsOutCtx;
import com.cloudframe.app.cfsort03.Cfsort03Ctx.WriteClientsInCtx;
import com.cloudframe.app.cfsort03.Cfsort03Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfsort03.Cfsort03Ctx.SortClientsOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfsort03 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cfsort03Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-SORT-CLIENTS
     *
     * @return 
     */
    public SortClientsOutCtx sortClients(Cfsort03Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-WRITE-CLIENTS
     *
     * @return 
     */
    public WriteClientsOutCtx writeClients(WriteClientsInCtx methodIn) throws Exception;


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
