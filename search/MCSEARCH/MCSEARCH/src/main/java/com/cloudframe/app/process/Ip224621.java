package com.cloudframe.app.process;

import com.cloudframe.app.ip224621.Ip224621Ctx.AbendOnTblOverflowInCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx.AbendOnTblOverflowOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip224621.Ip224621Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx.PerformEditOutCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx.SearchCombinationInCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx.EnterNewCombinationOutCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx.SearchCombinationOutCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx.EnterNewCombinationInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip224621.Ip224621Ctx.PerformInitializationInCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx.PerformEditInCtx;
import com.cloudframe.app.ip224621.Ip224621Ctx;
import com.cloudframe.app.ip224621.Ip224621Ctx.PerformInitializationOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip224621 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip224621Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip224621Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PERFORM-INITIALIZATION
     *
     * @return 
     */
    public PerformInitializationOutCtx performInitialization(PerformInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PERFORM-EDIT
     *
     * @return 
     */
    public PerformEditOutCtx performEdit(PerformEditInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-SEARCH-COMBINATION
     *
     * @return 
     */
    public SearchCombinationOutCtx searchCombination(SearchCombinationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-ENTER-NEW-COMBINATION
     *
     * @return 
     */
    public EnterNewCombinationOutCtx enterNewCombination(EnterNewCombinationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2111-ABEND-ON-TBL-OVERFLOW
     *
     * @return 
     */
    public AbendOnTblOverflowOutCtx abendOnTblOverflow(AbendOnTblOverflowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     */
    public void terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;


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
