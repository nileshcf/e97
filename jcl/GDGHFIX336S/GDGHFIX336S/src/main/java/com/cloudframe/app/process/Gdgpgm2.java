package com.cloudframe.app.process;

import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.WritePara2001InCtx;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.CopyFile1InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.CopyFile2InCtx;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.WritePara2001OutCtx;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.WriteParaOutCtx;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.CopyFile1OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.CopyFile2OutCtx;
import com.cloudframe.app.gdgpgm2.Gdgpgm2Ctx.WriteParaInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Gdgpgm2 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Gdgpgm2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-COPY-FILE1
     *
     * @return 
     */
    public CopyFile1OutCtx copyFile1(CopyFile1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1001-WRITE-PARA
     *
     * @return 
     */
    public WriteParaOutCtx writePara(WriteParaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-COPY-FILE2
     *
     * @return 
     */
    public CopyFile2OutCtx copyFile2(CopyFile2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2001-WRITE-PARA
     *
     * @return 
     */
    public WritePara2001OutCtx writePara2001(WritePara2001InCtx methodIn) throws Exception;


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
