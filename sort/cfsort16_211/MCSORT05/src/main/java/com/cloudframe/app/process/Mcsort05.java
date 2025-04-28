package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcsort05.Mcsort05Ctx.ProcessTerminationInCtx;
import com.cloudframe.app.mcsort05.Mcsort05Ctx.InitializeOutCtx;
import com.cloudframe.app.mcsort05.Mcsort05Ctx.SortFileInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mcsort05.Mcsort05Ctx;
import com.cloudframe.app.mcsort05.Mcsort05Ctx.InitializeInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcsort05 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mcsort05Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-PROCESS
     *
     */
    public void mainProcess(Mcsort05Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SORT-FILE
     *
     */
    public void sortFile(SortFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9500-PROCESS-TERMINATION
     *
     */
    public void processTermination(ProcessTerminationInCtx methodIn) throws Exception;


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
