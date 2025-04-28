package com.cloudframe.app.process;

import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit25InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit7OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit14OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit10OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit10InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit20OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit30OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit4OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit16InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit20InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit24InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit23OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit13OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit4InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit18OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit18InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit15InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit1OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit29InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit21OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit12InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit23InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit26InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit5InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit24OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit15OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit5OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit2InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit8OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit27OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit12OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit7InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit28InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit29OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit2OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit19OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit8InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit27InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit31InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit13InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit21InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit1InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit26OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit9OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit16OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit19InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit31OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit3InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit11OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit6InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit28OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit0InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit6OutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit25OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit14InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit3OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit9InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit0OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit17InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit11InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit17OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit22OutCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit30InCtx;
import com.cloudframe.app.refmod2.Refmod2Ctx.MainlineSplit22InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Refmod2 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Refmod2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE
     *
     */
    public void mainline(Refmod2Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT0
     *
     * @return 
     */
    public MainlineSplit0OutCtx mainlineSplit0(MainlineSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT1
     *
     * @return 
     */
    public MainlineSplit1OutCtx mainlineSplit1(MainlineSplit1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT2
     *
     * @return 
     */
    public MainlineSplit2OutCtx mainlineSplit2(MainlineSplit2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT3
     *
     * @return 
     */
    public MainlineSplit3OutCtx mainlineSplit3(MainlineSplit3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT4
     *
     * @return 
     */
    public MainlineSplit4OutCtx mainlineSplit4(MainlineSplit4InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT5
     *
     * @return 
     */
    public MainlineSplit5OutCtx mainlineSplit5(MainlineSplit5InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT6
     *
     * @return 
     */
    public MainlineSplit6OutCtx mainlineSplit6(MainlineSplit6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT7
     *
     * @return 
     */
    public MainlineSplit7OutCtx mainlineSplit7(MainlineSplit7InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT8
     *
     * @return 
     */
    public MainlineSplit8OutCtx mainlineSplit8(MainlineSplit8InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT9
     *
     * @return 
     */
    public MainlineSplit9OutCtx mainlineSplit9(MainlineSplit9InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT10
     *
     * @return 
     */
    public MainlineSplit10OutCtx mainlineSplit10(MainlineSplit10InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT11
     *
     * @return 
     */
    public MainlineSplit11OutCtx mainlineSplit11(MainlineSplit11InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT12
     *
     * @return 
     */
    public MainlineSplit12OutCtx mainlineSplit12(MainlineSplit12InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT13
     *
     * @return 
     */
    public MainlineSplit13OutCtx mainlineSplit13(MainlineSplit13InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT14
     *
     * @return 
     */
    public MainlineSplit14OutCtx mainlineSplit14(MainlineSplit14InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT15
     *
     * @return 
     */
    public MainlineSplit15OutCtx mainlineSplit15(MainlineSplit15InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT16
     *
     * @return 
     */
    public MainlineSplit16OutCtx mainlineSplit16(MainlineSplit16InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT17
     *
     * @return 
     */
    public MainlineSplit17OutCtx mainlineSplit17(MainlineSplit17InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT18
     *
     * @return 
     */
    public MainlineSplit18OutCtx mainlineSplit18(MainlineSplit18InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT19
     *
     * @return 
     */
    public MainlineSplit19OutCtx mainlineSplit19(MainlineSplit19InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT20
     *
     * @return 
     */
    public MainlineSplit20OutCtx mainlineSplit20(MainlineSplit20InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT21
     *
     * @return 
     */
    public MainlineSplit21OutCtx mainlineSplit21(MainlineSplit21InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT22
     *
     * @return 
     */
    public MainlineSplit22OutCtx mainlineSplit22(MainlineSplit22InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT23
     *
     * @return 
     */
    public MainlineSplit23OutCtx mainlineSplit23(MainlineSplit23InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT24
     *
     * @return 
     */
    public MainlineSplit24OutCtx mainlineSplit24(MainlineSplit24InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT25
     *
     * @return 
     */
    public MainlineSplit25OutCtx mainlineSplit25(MainlineSplit25InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT26
     *
     * @return 
     */
    public MainlineSplit26OutCtx mainlineSplit26(MainlineSplit26InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT27
     *
     * @return 
     */
    public MainlineSplit27OutCtx mainlineSplit27(MainlineSplit27InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT28
     *
     * @return 
     */
    public MainlineSplit28OutCtx mainlineSplit28(MainlineSplit28InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT29
     *
     * @return 
     */
    public MainlineSplit29OutCtx mainlineSplit29(MainlineSplit29InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT30
     *
     * @return 
     */
    public MainlineSplit30OutCtx mainlineSplit30(MainlineSplit30InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-SPLIT31
     *
     * @return 
     */
    public MainlineSplit31OutCtx mainlineSplit31(MainlineSplit31InCtx methodIn) throws Exception;


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
