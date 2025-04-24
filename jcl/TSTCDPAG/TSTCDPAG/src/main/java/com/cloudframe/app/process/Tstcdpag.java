package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.tstcdpag.TstcdpagCtx.MainlineOutCtx;
import com.cloudframe.app.tstcdpag.TstcdpagCtx.MainlineInCtx;
import com.cloudframe.app.tstcdpag.TstcdpagCtx.ProcessOutputInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.tstcdpag.TstcdpagCtx;
import com.cloudframe.app.tstcdpag.TstcdpagCtx.ProcessOutputOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Tstcdpag {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(TstcdpagCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PROCESS-OUTPUT
     *
     * @return 
     */
    public ProcessOutputOutCtx processOutput(ProcessOutputInCtx methodIn) throws Exception;


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
