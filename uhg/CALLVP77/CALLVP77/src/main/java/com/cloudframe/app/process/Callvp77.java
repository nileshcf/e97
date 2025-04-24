package com.cloudframe.app.process;

import com.cloudframe.app.callvp77.Callvp77Ctx.PopulateInSrtArrayOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.callvp77.Callvp77Ctx.MainlineInCtx;
import com.cloudframe.app.callvp77.Callvp77Ctx.PopulateInSrtArrayInCtx;
import com.cloudframe.app.callvp77.Callvp77Ctx.WriteOutputOutCtx;
import com.cloudframe.app.callvp77.Callvp77Ctx.SortArrayOutCtx;
import com.cloudframe.app.callvp77.Callvp77Ctx.SortArrayInCtx;
import com.cloudframe.app.callvp77.Callvp77Ctx.WriteOutputInCtx;
import com.cloudframe.app.callvp77.Callvp77Ctx;
import com.cloudframe.app.callvp77.Callvp77Ctx.MainlineOutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Callvp77 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Callvp77Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-POPULATE-IN-SRT-ARRAY
     *
     * @return 
     */
    public PopulateInSrtArrayOutCtx populateInSrtArray(PopulateInSrtArrayInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0020-SORT-ARRAY
     *
     * @return 
     */
    public SortArrayOutCtx sortArray(SortArrayInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-WRITE-OUTPUT
     *
     * @return 
     */
    public WriteOutputOutCtx writeOutput(WriteOutputInCtx methodIn) throws Exception;


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
