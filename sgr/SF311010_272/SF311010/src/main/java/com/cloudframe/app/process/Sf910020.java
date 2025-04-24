package com.cloudframe.app.process;

import com.cloudframe.app.sf910020.Sf910020Ctx;
import com.cloudframe.app.sf910020.Sf910020Ctx.ConvertBitsToBytesInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sf910020.Sf910020Ctx.ConvertBitsToBytesOutCtx;
import com.cloudframe.app.sf910020.Sf910020Ctx.InitializeProgramOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sf910020 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Sf910020Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sf910020Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Sf910020Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-PROGRAM
     *
     * @return 
     */
    public InitializeProgramOutCtx initializeProgram(Sf910020Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-CONVERT-BITS-TO-BYTES
     *
     * @return 
     */
    public ConvertBitsToBytesOutCtx convertBitsToBytes(ConvertBitsToBytesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-RETURN-TO-CALLING-PGM
     *
     */
    public void returnToCallingPgm(Sf910020Ctx programCtx) throws Exception;


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
