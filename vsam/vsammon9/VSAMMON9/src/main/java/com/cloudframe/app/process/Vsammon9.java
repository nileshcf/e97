package com.cloudframe.app.process;

import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamDeleteApiOutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.OpenFilesOutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamStartApiOutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamRewriteApiSplit3InCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamReadApiInCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.CloseFilesOutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.OpenFilesInCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamDeleteApiInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamReadApiOutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamWriteApiSplit0InCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamRewriteApiSplit2OutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamRewriteApiSplit3OutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamWriteApiSplit0OutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamRewriteApiSplit2InCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamWriteApiSplit1InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamWriteApiSplit1OutCtx;
import com.cloudframe.app.vsammon9.Vsammon9Ctx.VsamStartApiInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Vsammon9 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Vsammon9Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Vsammon9Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-OPEN-FILES
     *
     * @return 
     */
    public OpenFilesOutCtx openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-VSAM-OPERATIONS
     *
     */
    public void vsamOperations(Vsammon9Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2001-VSAM-START-API
     *
     * @return 
     */
    public VsamStartApiOutCtx vsamStartApi(VsamStartApiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2002-VSAM-READ-API
     *
     * @return 
     */
    public VsamReadApiOutCtx vsamReadApi(VsamReadApiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2003-VSAM-WRITE-API
     *
     */
    public void vsamWriteApi(Vsammon9Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2003-VSAM-WRITE-API-SPLIT0
     *
     * @return 
     */
    public VsamWriteApiSplit0OutCtx vsamWriteApiSplit0(VsamWriteApiSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2003-VSAM-WRITE-API-SPLIT1
     *
     * @return 
     */
    public VsamWriteApiSplit1OutCtx vsamWriteApiSplit1(VsamWriteApiSplit1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2004-VSAM-REWRITE-API
     *
     */
    public void vsamRewriteApi(Vsammon9Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2004-VSAM-REWRITE-API-SPLIT2
     *
     * @return 
     */
    public VsamRewriteApiSplit2OutCtx vsamRewriteApiSplit2(VsamRewriteApiSplit2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2004-VSAM-REWRITE-API-SPLIT3
     *
     * @return 
     */
    public VsamRewriteApiSplit3OutCtx vsamRewriteApiSplit3(VsamRewriteApiSplit3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2005-VSAM-DELETE-API
     *
     * @return 
     */
    public VsamDeleteApiOutCtx vsamDeleteApi(VsamDeleteApiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-CLOSE-FILES
     *
     * @return 
     */
    public CloseFilesOutCtx closeFiles(Vsammon9Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-EXIT-PROGRAM
     *
     */
    public void exitProgram(Vsammon9Ctx programCtx) throws Exception;


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
