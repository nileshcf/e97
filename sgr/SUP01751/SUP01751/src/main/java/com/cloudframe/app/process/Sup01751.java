package com.cloudframe.app.process;

import com.cloudframe.app.sup01751.Sup01751Ctx.MainlineOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sup01751.Sup01751Ctx.SqlcodeCheckInCtx;
import com.cloudframe.app.sup01751.Sup01751Ctx.MainlineInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sup01751.Sup01751Ctx;
import com.cloudframe.app.sup01751.Sup01751Ctx.SqlcodeCheckOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sup01751 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sup01751Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-SQLCODE-CHECK
     *
     * @return 
     */
    public SqlcodeCheckOutCtx sqlcodeCheck(SqlcodeCheckInCtx methodIn) throws Exception;


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
