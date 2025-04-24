package com.cloudframe.app.process;

import com.cloudframe.app.search3.Search3Ctx.Search0300InCtx;
import com.cloudframe.app.search3.Search3Ctx.SearchOutCtx;
import com.cloudframe.app.search3.Search3Ctx.MainLineOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.search3.Search3Ctx;
import com.cloudframe.app.search3.Search3Ctx.MainLineInCtx;
import com.cloudframe.app.search3.Search3Ctx.Search0500OutCtx;
import com.cloudframe.app.search3.Search3Ctx.Search0400OutCtx;
import com.cloudframe.app.search3.Search3Ctx.Search0300OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.search3.Search3Ctx.Search0400InCtx;
import com.cloudframe.app.search3.Search3Ctx.Search0500InCtx;
import com.cloudframe.app.search3.Search3Ctx.SearchInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Search3 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Search3Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAIN-LINE
     *
     * @return 
     */
    public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROGRAM-DONE
     *
     */
    public void programDone(Search3Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-SEARCH
     *
     * @return 
     */
    public SearchOutCtx search(SearchInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-SEARCH
     *
     * @return 
     */
    public Search0300OutCtx search0300(Search0300InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0400-SEARCH
     *
     * @return 
     */
    public Search0400OutCtx search0400(Search0400InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0500-SEARCH
     *
     * @return 
     */
    public Search0500OutCtx search0500(Search0500InCtx methodIn) throws Exception;


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
