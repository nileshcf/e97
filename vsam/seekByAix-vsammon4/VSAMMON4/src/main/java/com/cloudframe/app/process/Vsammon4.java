package com.cloudframe.app.process;

import com.cloudframe.app.vsammon4.Vsammon4Ctx.CloseiOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.ReadnxtInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenoOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.InsertInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.ReadnxtOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenioInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.CloseiInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.ReadallOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.RewriteOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.ReadallInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.MainlineOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.DeleteInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.CloseoInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenoInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.StartOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.InsallInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenFilesInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.InsallOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.DlstrdOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.DelallOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpeniInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.InsertOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenextendInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.RewriteInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.KeyreadInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.StartInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpeniOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenFilesOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenioOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.CloseioOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.KeyreadOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.CloseioInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.DlstrdInCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.OpenextendOutCtx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.DeleteOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.vsammon4.Vsammon4Ctx.CloseoOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Vsammon4 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Vsammon4Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(Vsammon4Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-OPEN-FILES
     *
     * @return 
     */
    public OpenFilesOutCtx openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0020-CLOSE-FILES
     *
     */
    public void closeFiles(Vsammon4Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-OPENO
     *
     * @return 
     */
    public OpenoOutCtx openo(OpenoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-CLOSEO
     *
     * @return 
     */
    public CloseoOutCtx closeo(CloseoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-OPENIO
     *
     * @return 
     */
    public OpenioOutCtx openio(OpenioInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3001-OPENEXTEND
     *
     * @return 
     */
    public OpenextendOutCtx openextend(OpenextendInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-CLOSEIO
     *
     * @return 
     */
    public CloseioOutCtx closeio(CloseioInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-OPENI
     *
     * @return 
     */
    public OpeniOutCtx openi(OpeniInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-CLOSEI
     *
     * @return 
     */
    public CloseiOutCtx closei(CloseiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7000-INSALL
     *
     * @return 
     */
    public InsallOutCtx insall(InsallInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-INSERT
     *
     * @return 
     */
    public InsertOutCtx insert(InsertInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-DELETE
     *
     * @return 
     */
    public DeleteOutCtx delete(DeleteInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - A000-DLSTRD
     *
     * @return 
     */
    public DlstrdOutCtx dlstrd(DlstrdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - B000-REWRITE
     *
     * @return 
     */
    public RewriteOutCtx rewrite(RewriteInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - C000-KEYREAD
     *
     * @return 
     */
    public KeyreadOutCtx keyread(KeyreadInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - D000-READALL
     *
     * @return 
     */
    public ReadallOutCtx readall(ReadallInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - E000-READNXT
     *
     * @return 
     */
    public ReadnxtOutCtx readnxt(ReadnxtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - F000-DELALL
     *
     * @return 
     */
    public DelallOutCtx delall(Vsammon4Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - G000-START
     *
     * @return 
     */
    public StartOutCtx start(StartInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-EXIT-PROGRAM
     *
     */
    public void exitProgram(Vsammon4Ctx programCtx) throws Exception;


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
