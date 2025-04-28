package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.MainlineRoutineOutCtx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.MarParaOutCtx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.SortClientsMainOutCtx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.AndParaInCtx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.WriteClientsMainInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.MainlineRoutineInCtx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.WriteClientsMainOutCtx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.MarParaInCtx;
import com.cloudframe.app.cfsort10.Cfsort10Ctx.AndParaOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfsort10 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cfsort10Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - AA000-MAINLINE-ROUTINE
     *
     * @return 
     */
    public MainlineRoutineOutCtx mainlineRoutine(MainlineRoutineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-SORT-CLIENTS-MAIN
     *
     * @return 
     */
    public SortClientsMainOutCtx sortClientsMain(Cfsort10Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-WRITE-CLIENTS-MAIN
     *
     * @return 
     */
    public WriteClientsMainOutCtx writeClientsMain(WriteClientsMainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0001-AND-PARA
     *
     * @return 
     */
    public AndParaOutCtx andPara(AndParaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0002-MAR-PARA
     *
     * @return 
     */
    public MarParaOutCtx marPara(MarParaInCtx methodIn) throws Exception;


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
