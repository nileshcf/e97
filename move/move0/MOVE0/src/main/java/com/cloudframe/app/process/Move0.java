package com.cloudframe.app.process;

import com.cloudframe.app.move0.Move0Ctx.Process1Split11OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Split7InCtx;
import com.cloudframe.app.move0.Move0Ctx.Process4Split17InCtx;
import com.cloudframe.app.move0.Move0Ctx.Split8OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Process3Split15InCtx;
import com.cloudframe.app.move0.Move0Ctx;
import com.cloudframe.app.move0.Move0Ctx.InitNumbers3OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Split8InCtx;
import com.cloudframe.app.move0.Move0Ctx.Split6OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Split10InCtx;
import com.cloudframe.app.move0.Move0Ctx.Process2Split13InCtx;
import com.cloudframe.app.move0.Move0Ctx.Split10OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Split9OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Process4Split17OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Split7OutCtx;
import com.cloudframe.app.move0.Move0Ctx.UsbIssueInCtx;
import com.cloudframe.app.move0.Move0Ctx.Process5Split19OutCtx;
import com.cloudframe.app.move0.Move0Ctx.InitNumbers1OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Process6InCtx;
import com.cloudframe.app.move0.Move0Ctx.Split9InCtx;
import com.cloudframe.app.move0.Move0Ctx.Process2Split13OutCtx;
import com.cloudframe.app.move0.Move0Ctx.Split6InCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.move0.Move0Ctx.Process1Split11InCtx;
import com.cloudframe.app.move0.Move0Ctx.Process5Split19InCtx;
import com.cloudframe.app.move0.Move0Ctx.Process3Split15OutCtx;
import com.cloudframe.app.move0.Move0Ctx.UsbIssueOutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Move0 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - INIT-NUMBERS-1
     *
     * @return 
     */
    public InitNumbers1OutCtx initNumbers1(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - INIT-NUMBERS-3
     *
     * @return 
     */
    public InitNumbers3OutCtx initNumbers3(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MOVE1TO2
     *
     */
    public void move1to2(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MOVE1TO2-SPLIT6
     *
     * @return 
     */
    public Split6OutCtx split6(Split6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MOVE1TO2-SPLIT7
     *
     * @return 
     */
    public Split7OutCtx split7(Split7InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MOVE3TO4
     *
     */
    public void move3to4(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MOVE3TO4-SPLIT8
     *
     * @return 
     */
    public Split8OutCtx split8(Split8InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MOVE3TO4-SPLIT9
     *
     * @return 
     */
    public Split9OutCtx split9(Split9InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MOVE3TO4-SPLIT10
     *
     * @return 
     */
    public Split10OutCtx split10(Split10InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - USB-ISSUE
     *
     * @return 
     */
    public UsbIssueOutCtx usbIssue(UsbIssueInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1
     *
     */
    public void process1(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1-SPLIT11
     *
     * @return 
     */
    public Process1Split11OutCtx process1Split11(Process1Split11InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-1-SPLIT12
     *
     */
    public void process1Split12(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2
     *
     */
    public void process2(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2-SPLIT13
     *
     * @return 
     */
    public Process2Split13OutCtx process2Split13(Process2Split13InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-2-SPLIT14
     *
     */
    public void process2Split14(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-3
     *
     */
    public void process3(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-3-SPLIT15
     *
     * @return 
     */
    public Process3Split15OutCtx process3Split15(Process3Split15InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-3-SPLIT16
     *
     */
    public void process3Split16(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-4
     *
     */
    public void process4(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-4-SPLIT17
     *
     * @return 
     */
    public Process4Split17OutCtx process4Split17(Process4Split17InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-4-SPLIT18
     *
     */
    public void process4Split18(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-5
     *
     */
    public void process5(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-5-SPLIT19
     *
     * @return 
     */
    public Process5Split19OutCtx process5Split19(Process5Split19InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-5-SPLIT20
     *
     */
    public void process5Split20(Move0Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS-6
     *
     */
    public void process6(Process6InCtx methodIn) throws Exception;


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
