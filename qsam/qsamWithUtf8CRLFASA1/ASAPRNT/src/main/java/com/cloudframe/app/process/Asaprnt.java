package com.cloudframe.app.process;

import com.cloudframe.app.asaprnt.AsaprntCtx.Process2Split5InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.asaprnt.AsaprntCtx.Process3OutCtx;
import com.cloudframe.app.asaprnt.AsaprntCtx;
import com.cloudframe.app.asaprnt.AsaprntCtx.Process3InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.asaprnt.AsaprntCtx.Process1Split3OutCtx;
import com.cloudframe.app.asaprnt.AsaprntCtx.Process1Split3InCtx;
import com.cloudframe.app.asaprnt.AsaprntCtx.Process2Split5OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Asaprnt {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(AsaprntCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1
     *
     */
    public void process1(AsaprntCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1-SPLIT3
     *
     * @return 
     */
    public Process1Split3OutCtx process1Split3(Process1Split3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1-SPLIT4
     *
     */
    public void process1Split4(AsaprntCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2
     *
     */
    public void process2(AsaprntCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2-SPLIT5
     *
     * @return 
     */
    public Process2Split5OutCtx process2Split5(Process2Split5InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2-SPLIT6
     *
     */
    public void process2Split6(AsaprntCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-3
     *
     * @return 
     */
    public Process3OutCtx process3(Process3InCtx methodIn) throws Exception;


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
