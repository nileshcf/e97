package com.cloudframe.app.process;

import com.cloudframe.app.search0.Search0Ctx.Search0200InCtx;
import com.cloudframe.app.search0.Search0Ctx.SearchInCtx;
import com.cloudframe.app.search0.Search0Ctx.Search0200OutCtx;
import com.cloudframe.app.search0.Search0Ctx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.search0.Search0Ctx.Search0110InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Search0 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Search0Ctx programCtx, String parm, String parm2, String parm3) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Search0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROGRAM-DONE
     *
     */
    public void programDone(Search0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-SEARCH
     *
     */
    public void search(SearchInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0110-SEARCH
     *
     */
    public void search0110(Search0110InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-SEARCH
     *
     * @return 
     */
    public Search0200OutCtx search0200(Search0200InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1
     *
     */
    public void process1(Search0Ctx programCtx) throws Exception;


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
