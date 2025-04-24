package com.cloudframe.app.process;

import com.cloudframe.app.dispif.DispifCtx.LongCompareInCtx;
import com.cloudframe.app.dispif.DispifCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dispif.DispifCtx.LongCompareOutCtx;
import com.cloudframe.app.dispif.DispifCtx.ShortCompareOutCtx;
import com.cloudframe.app.dispif.DispifCtx.IntCompareOutCtx;
import com.cloudframe.app.dispif.DispifCtx.IntCompareInCtx;
import com.cloudframe.app.dispif.DispifCtx.ShortCompareInCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Dispif {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(DispifCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - SHORT-COMPARE
     *
     * @return 
     */
    public ShortCompareOutCtx shortCompare(ShortCompareInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - INT-COMPARE
     *
     * @return 
     */
    public IntCompareOutCtx intCompare(IntCompareInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - LONG-COMPARE
     *
     * @return 
     */
    public LongCompareOutCtx longCompare(LongCompareInCtx methodIn) throws Exception;


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
