package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcsort01.Mcsort01Ctx.FormatSortRecInCtx;
import com.cloudframe.app.mcsort01.Mcsort01Ctx;
import com.cloudframe.app.mcsort01.Mcsort01Ctx.FormatSortRecOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mcsort01.Mcsort01Ctx.FormatOpRecInCtx;
import com.cloudframe.app.mcsort01.Mcsort01Ctx.FormatOpRecOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcsort01 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mcsort01Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6100-FORMAT-SORT-REC
     *
     * @return 
     */
    public FormatSortRecOutCtx formatSortRec(FormatSortRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6500-FORMAT-OP-REC
     *
     * @return 
     */
    public FormatOpRecOutCtx formatOpRec(FormatOpRecInCtx methodIn) throws Exception;


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
