package com.cloudframe.app.process;

import com.cloudframe.app.cobpgmor.CobpgmorCtx.MainParaOutCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.FinishParaInCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.AddtlDb2QrsInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.FinishParaOutCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.InitParaOutCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.FetchParaOutCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.InitParaInCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.FetchParaInCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.MainParaInCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx.AddtlDb2QrsOutCtx;
import com.cloudframe.app.cobpgmor.CobpgmorCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Cobpgmor {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(CobpgmorCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-PARA
     *
     * @return 
     */
    public MainParaOutCtx mainPara(MainParaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INIT-PARA
     *
     * @return 
     */
    public InitParaOutCtx initPara(InitParaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-PARA
     *
     */
    public void processPara(CobpgmorCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-FINISH-PARA
     *
     * @return 
     */
    public FinishParaOutCtx finishPara(FinishParaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-FETCH-PARA
     *
     * @return 
     */
    public FetchParaOutCtx fetchPara(FetchParaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8880-ADDTL-DB2-QRS
     *
     * @return 
     */
    public AddtlDb2QrsOutCtx addtlDb2Qrs(AddtlDb2QrsInCtx methodIn) throws Exception;


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
