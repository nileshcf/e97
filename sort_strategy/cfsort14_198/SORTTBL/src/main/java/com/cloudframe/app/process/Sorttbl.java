package com.cloudframe.app.process;

import com.cloudframe.app.sorttbl.SorttblCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sorttbl.SorttblCtx.MainlineSplit1InCtx;
import com.cloudframe.app.sorttbl.SorttblCtx.MainlineSplit1OutCtx;
import com.cloudframe.app.sorttbl.SorttblCtx.MainlineSplit2InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sorttbl.SorttblCtx.MainlineSplit2OutCtx;
import com.cloudframe.app.sorttbl.SorttblCtx.MainlineSplit0OutCtx;
import com.cloudframe.app.sorttbl.SorttblCtx.MainlineSplit0InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sorttbl {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(SorttblCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE
     *
     */
    public void mainline(SorttblCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT0
     *
     * @return 
     */
    public MainlineSplit0OutCtx mainlineSplit0(MainlineSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT1
     *
     * @return 
     */
    public MainlineSplit1OutCtx mainlineSplit1(MainlineSplit1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT2
     *
     * @return 
     */
    public MainlineSplit2OutCtx mainlineSplit2(MainlineSplit2InCtx methodIn) throws Exception;


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
