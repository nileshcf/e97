package com.cloudframe.app.process;

import com.cloudframe.app.mc155.Mc155Ctx.CloseSys109InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mc155.Mc155Ctx.OpenSys109OutCtx;
import com.cloudframe.app.mc155.Mc155Ctx;
import com.cloudframe.app.mc155.Mc155Ctx.LoadAlternateTableOutCtx;
import com.cloudframe.app.mc155.Mc155Ctx.LoadAlternateTableInCtx;
import com.cloudframe.app.mc155.Mc155Ctx.OpenSys109InCtx;
import com.cloudframe.app.mc155.Mc155Ctx.CloseSys109OutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Mc155 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mc155Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-PARA
     *
     */
    public void mainlinePara(Mc155Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-SYS109
     *
     * @return 
     */
    public OpenSys109OutCtx openSys109(OpenSys109InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-LOAD-ALTERNATE-TABLE
     *
     * @return 
     */
    public LoadAlternateTableOutCtx loadAlternateTable(LoadAlternateTableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-CLOSE-SYS109
     *
     * @return 
     */
    public CloseSys109OutCtx closeSys109(CloseSys109InCtx methodIn) throws Exception;


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
