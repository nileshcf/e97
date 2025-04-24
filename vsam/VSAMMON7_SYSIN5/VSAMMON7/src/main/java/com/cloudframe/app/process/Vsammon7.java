package com.cloudframe.app.process;

import com.cloudframe.app.vsammon7.Vsammon7Ctx.MainlineInCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.ReadnxtOutCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.OpenFilesOutCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.CloseFilesOutCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.Rn9999InCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.KeyreadBasedReportOutCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.ProgramOutCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.MainlineOutCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.KeyreadBasedReportInCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.StartpOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.StartaInCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.OpenFilesInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.Rn9999OutCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.ProgramInCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.StartpInCtx;
import com.cloudframe.app.vsammon7.Vsammon7Ctx.StartaOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Vsammon7 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Vsammon7Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-OPEN-FILES
     *
     * @return 
     */
    public OpenFilesOutCtx openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0020-CLOSE-FILES
     *
     * @return 
     */
    public CloseFilesOutCtx closeFiles(Vsammon7Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-KEYREAD-BASED-REPORT
     *
     * @return 
     */
    public KeyreadBasedReportOutCtx keyreadBasedReport(KeyreadBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-READNXT
     *
     * @return 
     */
    public ReadnxtOutCtx readnxt(Vsammon7Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-RN9999
     *
     * @return 
     */
    public Rn9999OutCtx rn9999(Rn9999InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7000-PROGRAM
     *
     * @return 
     */
    public ProgramOutCtx program(ProgramInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-STARTP
     *
     * @return 
     */
    public StartpOutCtx startp(StartpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-STARTA
     *
     * @return 
     */
    public StartaOutCtx starta(StartaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-EXIT-PROGRAM
     *
     */
    public void exitProgram(Vsammon7Ctx programCtx) throws Exception;


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
