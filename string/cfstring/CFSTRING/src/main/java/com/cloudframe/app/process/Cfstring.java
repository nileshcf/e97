package com.cloudframe.app.process;

import com.cloudframe.app.cfstring.CfstringCtx.DisplayParmsOutCtx;
import com.cloudframe.app.cfstring.CfstringCtx.String1InCtx;
import com.cloudframe.app.cfstring.CfstringCtx.Unstring2InCtx;
import com.cloudframe.app.cfstring.CfstringCtx.InspectOutCtx;
import com.cloudframe.app.cfstring.CfstringCtx.DisplayParmsInCtx;
import com.cloudframe.app.cfstring.CfstringCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfstring.CfstringCtx.Unstring1OutCtx;
import com.cloudframe.app.cfstring.CfstringCtx.String1OutCtx;
import com.cloudframe.app.cfstring.CfstringCtx.Unstring2OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfstring.CfstringCtx.InspectInCtx;
import com.cloudframe.app.cfstring.CfstringCtx.Unstring1InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfstring {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(CfstringCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(CfstringCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-INSPECT
     *
     * @return 
     */
    public InspectOutCtx inspect(InspectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0020-UNSTRING-1
     *
     * @return 
     */
    public Unstring1OutCtx unstring1(Unstring1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0030-UNSTRING-2
     *
     * @return 
     */
    public Unstring2OutCtx unstring2(Unstring2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0040-STRING-1
     *
     * @return 
     */
    public String1OutCtx string1(String1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DISPLAY-PARMS
     *
     * @return 
     */
    public DisplayParmsOutCtx displayParms(DisplayParmsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-NO-OVERFLOW
     *
     */
    public void noOverflow(CfstringCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-OVERFLOW
     *
     */
    public void overflow(CfstringCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-GOBACK
     *
     */
    public void goback(CfstringCtx programCtx) throws Exception;


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
