package com.cloudframe.app.process;

import com.cloudframe.app.u918test.U918testCtx.Process6OutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.u918test.U918testCtx.Process4Split12OutCtx;
import com.cloudframe.app.u918test.U918testCtx.Process1Split6OutCtx;
import com.cloudframe.app.u918test.U918testCtx.Process3Split10OutCtx;
import com.cloudframe.app.u918test.U918testCtx;
import com.cloudframe.app.u918test.U918testCtx.Process2Split8OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.u918test.U918testCtx.Process5Split14OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface U918test {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1
     *
     */
    public void process1(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1-SPLIT6
     *
     * @return 
     */
    public Process1Split6OutCtx process1Split6(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1-SPLIT7
     *
     */
    public void process1Split7(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2
     *
     */
    public void process2(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2-SPLIT8
     *
     * @return 
     */
    public Process2Split8OutCtx process2Split8(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2-SPLIT9
     *
     */
    public void process2Split9(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-3
     *
     */
    public void process3(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-3-SPLIT10
     *
     * @return 
     */
    public Process3Split10OutCtx process3Split10(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-3-SPLIT11
     *
     */
    public void process3Split11(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-4
     *
     */
    public void process4(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-4-SPLIT12
     *
     * @return 
     */
    public Process4Split12OutCtx process4Split12(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-4-SPLIT13
     *
     */
    public void process4Split13(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-5
     *
     */
    public void process5(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-5-SPLIT14
     *
     * @return 
     */
    public Process5Split14OutCtx process5Split14(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-5-SPLIT15
     *
     */
    public void process5Split15(U918testCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-6
     *
     * @return 
     */
    public Process6OutCtx process6(U918testCtx programCtx) throws Exception;


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
