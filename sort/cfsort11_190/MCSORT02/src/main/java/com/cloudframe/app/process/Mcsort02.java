package com.cloudframe.app.process;

import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatOpRec3002InCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatSortRec2001InCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.SortSys002OutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatSortRecOutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatSortRec3001InCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.MainlineOutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.SortSys002InCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatSortRecInCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatSortRec3001OutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatOpRecOutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatOpRec2002InCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.SortSys004InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatOpRecInCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.SortSys005OutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatOpRec2002OutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.SortSys004OutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.SortSys005InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatOpRec3002OutCtx;
import com.cloudframe.app.mcsort02.Mcsort02Ctx.FormatSortRec2001OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcsort02 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mcsort02Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(Mcsort02Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-SORT-SYS002
     *
     * @return 
     */
    public SortSys002OutCtx sortSys002(SortSys002InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1001-FORMAT-SORT-REC
     *
     * @return 
     */
    public FormatSortRecOutCtx formatSortRec(FormatSortRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1002-FORMAT-OP-REC
     *
     * @return 
     */
    public FormatOpRecOutCtx formatOpRec(FormatOpRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SORT-SYS004
     *
     * @return 
     */
    public SortSys004OutCtx sortSys004(SortSys004InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2001-FORMAT-SORT-REC
     *
     * @return 
     */
    public FormatSortRec2001OutCtx formatSortRec2001(FormatSortRec2001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2002-FORMAT-OP-REC
     *
     * @return 
     */
    public FormatOpRec2002OutCtx formatOpRec2002(FormatOpRec2002InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-SORT-SYS005
     *
     * @return 
     */
    public SortSys005OutCtx sortSys005(SortSys005InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3001-FORMAT-SORT-REC
     *
     * @return 
     */
    public FormatSortRec3001OutCtx formatSortRec3001(FormatSortRec3001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3002-FORMAT-OP-REC
     *
     * @return 
     */
    public FormatOpRec3002OutCtx formatOpRec3002(FormatOpRec3002InCtx methodIn) throws Exception;


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
