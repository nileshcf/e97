package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.mcrecur.McrecurCtx;
import com.cloudframe.app.mcrecur.McrecurCtx.MainlineSplit1InCtx;
import com.cloudframe.app.mcrecur.McrecurCtx.MainlineSplit1OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mcrecur.McrecurCtx.MainlineSplit0OutCtx;
import com.cloudframe.app.mcrecur.McrecurCtx.MainlineSplit0InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Mcrecur {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(McrecurCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(McrecurCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE-SPLIT0
     *
     * @return 
     */
    public MainlineSplit0OutCtx mainlineSplit0(MainlineSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE-SPLIT1
     *
     * @return 
     */
    public MainlineSplit1OutCtx mainlineSplit1(MainlineSplit1InCtx methodIn) throws Exception;


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
