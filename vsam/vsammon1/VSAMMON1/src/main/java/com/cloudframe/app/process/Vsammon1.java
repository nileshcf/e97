package com.cloudframe.app.process;

import com.cloudframe.app.vsammon1.Vsammon1Ctx.MainlineOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.KeyreadnBasedReportOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.DeleteBasedReportOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.ProgramBasedReport2001OutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.KeyreadnBasedReportInCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.OpenFilesInCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.ProgramBasedReport2001InCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.InsertBasedReportOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.OpenFilesOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.ProgramBasedReportOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.IpaddrBasedReportOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.MethodBasedReportInCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.DeleteBasedReportInCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.IpaddrBasedReportInCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.MethodBasedReportOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.KeyreadBasedReportInCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.InsertBasedReportInCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.CloseFilesOutCtx;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.KeyreadBasedReportOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.vsammon1.Vsammon1Ctx.ProgramBasedReportInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Vsammon1 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Vsammon1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(Vsammon1Ctx programCtx) throws Exception;

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
    public CloseFilesOutCtx closeFiles(Vsammon1Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-METHOD-BASED-REPORT
     *
     * @return 
     */
    public MethodBasedReportOutCtx methodBasedReport(MethodBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROGRAM-BASED-REPORT
     *
     * @return 
     */
    public ProgramBasedReportOutCtx programBasedReport(ProgramBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2001-PROGRAM-BASED-REPORT
     *
     * @return 
     */
    public ProgramBasedReport2001OutCtx programBasedReport2001(ProgramBasedReport2001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-IPADDR-BASED-REPORT
     *
     * @return 
     */
    public IpaddrBasedReportOutCtx ipaddrBasedReport(IpaddrBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-KEYREAD-BASED-REPORT
     *
     * @return 
     */
    public KeyreadBasedReportOutCtx keyreadBasedReport(KeyreadBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4001-KEYREADN-BASED-REPORT
     *
     * @return 
     */
    public KeyreadnBasedReportOutCtx keyreadnBasedReport(KeyreadnBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-INSERT-BASED-REPORT
     *
     * @return 
     */
    public InsertBasedReportOutCtx insertBasedReport(InsertBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-DELETE-BASED-REPORT
     *
     * @return 
     */
    public DeleteBasedReportOutCtx deleteBasedReport(DeleteBasedReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-EXIT-PROGRAM
     *
     */
    public void exitProgram(Vsammon1Ctx programCtx) throws Exception;


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
