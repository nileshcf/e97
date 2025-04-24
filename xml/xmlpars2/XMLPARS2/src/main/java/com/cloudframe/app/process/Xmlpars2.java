package com.cloudframe.app.process;

import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.xmlpars2.Xmlpars2Ctx.ParseXmlOutCtx;
import com.cloudframe.app.xmlpars2.Xmlpars2Ctx;
import com.cloudframe.app.xmlpars2.Xmlpars2Ctx.ParseXmlInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.xmlpars2.Xmlpars2Ctx.MainlineInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Xmlpars2 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Xmlpars2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-PARSE-XML
     *
     * @return 
     */
    public ParseXmlOutCtx parseXml(ParseXmlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-RETURN
     *
     */
    public void return9999(Xmlpars2Ctx programCtx) throws Exception;


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
