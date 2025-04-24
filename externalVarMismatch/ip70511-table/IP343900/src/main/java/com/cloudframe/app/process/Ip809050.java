package com.cloudframe.app.process;

import com.cloudframe.app.ip809050.Ip809050Ctx.ReadRunControlFileOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.GetCurExpOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile3OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CheckActivityInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseFilesInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile2InCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.ProcessOutputOtbndFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.GetRegionNameInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.ExtractFieldsInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.ProcessInputFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx;
import com.cloudframe.app.ip809050.Ip809050Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.OpenRunControlFileOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile2OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.TerminateProcessOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.OpenScrbOtbndFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile7InCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseOutputIpmOutboundOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile1InCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.OpenUscrbIpmOtbndFileOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseSys201OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseRunControlFileOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile4InCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseOutputIpmOutboundInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.GetRegionNameOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.ExtractFieldsOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.GetTranAmtOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.OpenRunControlFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CurConvLogicOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.DoCurrencyConversionOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile6OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseSys001OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.GetTranAmtInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile1OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseSys012OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.OpenUscrbIpmOtbndFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.DoInitializationInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.ReadInputOutboundFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.TerminateProcessInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.GetCurExpInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile5InCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CurConvLogicInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile5OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.DoInitializationOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CheckActivityOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CallReadParserInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile7OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseInputIpmOutboundInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseRunControlFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile4OutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.ReadRunControlFileInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.OpenScrbOtbndFileOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip809050.Ip809050Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.ReadInputOutboundFileOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CheckEventLogSwInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile6InCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseInputIpmOutboundOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.DoCurrencyConversionInCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.WriteOutboundFile3InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip809050.Ip809050Ctx.CheckEventLogSwOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CloseFilesOutCtx;
import com.cloudframe.app.ip809050.Ip809050Ctx.CallReadParserOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip809050 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DO-INITIALIZATION
     *
     * @return 
     */
    public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-SET-PROCEDURE-POINTERS
     *
     * @return 
     */
    public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-PROCESS-RUN-CONTROL-FILE
     *
     */
    public void processRunControlFile(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1310-OPEN-RUN-CONTROL-FILE
     *
     * @return 
     */
    public OpenRunControlFileOutCtx openRunControlFile(OpenRunControlFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1320-READ-RUN-CONTROL-FILE
     *
     * @return 
     */
    public ReadRunControlFileOutCtx readRunControlFile(ReadRunControlFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1321-CHECK-EVENT-LOG-SW
     *
     * @return 
     */
    public CheckEventLogSwOutCtx checkEventLogSw(CheckEventLogSwInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1330-CLOSE-RUN-CONTROL-FILE
     *
     * @return 
     */
    public CloseRunControlFileOutCtx closeRunControlFile(CloseRunControlFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-OPEN-FILES
     *
     */
    public void openFiles(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1410-OPEN-USCRB-IPM-OTBND-FILE
     *
     * @return 
     */
    public OpenUscrbIpmOtbndFileOutCtx openUscrbIpmOtbndFile(OpenUscrbIpmOtbndFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1420-OPEN-SCRB-OTBND-FILE
     *
     * @return 
     */
    public OpenScrbOtbndFileOutCtx openScrbOtbndFile(OpenScrbOtbndFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-INPUT-FILE
     *
     */
    public void processInputFile(ProcessInputFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-PROCESS-UNSCRUB-OUTBOUND
     *
     */
    public void processUnscrubOutbound(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-CALL-READ-PARSER
     *
     * @return 
     */
    public CallReadParserOutCtx callReadParser(CallReadParserInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2120-PROCESS-OUTPUT-OTBND-FILE
     *
     */
    public void processOutputOtbndFile(ProcessOutputOtbndFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2121-CHECK-ACTIVITY
     *
     * @return 
     */
    public CheckActivityOutCtx checkActivity(CheckActivityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2190-GET-TRAN-AMT
     *
     * @return 
     */
    public GetTranAmtOutCtx getTranAmt(GetTranAmtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-GET-CUR-EXP
     *
     * @return 
     */
    public GetCurExpOutCtx getCurExp(GetCurExpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2210-CUR-CONV-LOGIC
     *
     * @return 
     */
    public CurConvLogicOutCtx curConvLogic(CurConvLogicInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-DO-CURRENCY-CONVERSION
     *
     * @return 
     */
    public DoCurrencyConversionOutCtx doCurrencyConversion(DoCurrencyConversionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-OUTBOUND-FILE1
     *
     * @return 
     */
    public WriteOutboundFile1OutCtx writeOutboundFile1(WriteOutboundFile1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-OUTBOUND-FILE2
     *
     * @return 
     */
    public WriteOutboundFile2OutCtx writeOutboundFile2(WriteOutboundFile2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-OUTBOUND-FILE3
     *
     * @return 
     */
    public WriteOutboundFile3OutCtx writeOutboundFile3(WriteOutboundFile3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-OUTBOUND-FILE4
     *
     * @return 
     */
    public WriteOutboundFile4OutCtx writeOutboundFile4(WriteOutboundFile4InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-OUTBOUND-FILE5
     *
     * @return 
     */
    public WriteOutboundFile5OutCtx writeOutboundFile5(WriteOutboundFile5InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-OUTBOUND-FILE6
     *
     * @return 
     */
    public WriteOutboundFile6OutCtx writeOutboundFile6(WriteOutboundFile6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-OUTBOUND-FILE7
     *
     * @return 
     */
    public WriteOutboundFile7OutCtx writeOutboundFile7(WriteOutboundFile7InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2500-EXTRACT-FIELDS
     *
     * @return 
     */
    public ExtractFieldsOutCtx extractFields(ExtractFieldsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-CLOSE-FILES
     *
     * @return 
     */
    public CloseFilesOutCtx closeFiles(CloseFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-CLOSE-INPUT-IPM-OUTBOUND
     *
     * @return 
     */
    public CloseInputIpmOutboundOutCtx closeInputIpmOutbound(CloseInputIpmOutboundInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3200-CLOSE-OUTPUT-IPM-OUTBOUND
     *
     * @return 
     */
    public CloseOutputIpmOutboundOutCtx closeOutputIpmOutbound(CloseOutputIpmOutboundInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-GET-REGION-NAME
     *
     * @return 
     */
    public GetRegionNameOutCtx getRegionName(GetRegionNameInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-READ-INPUT-OUTBOUND-FILE
     *
     * @return 
     */
    public ReadInputOutboundFileOutCtx readInputOutboundFile(ReadInputOutboundFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-CLOSE-SYS001
     *
     * @return 
     */
    public CloseSys001OutCtx closeSys001(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-CLOSE-SYS201
     *
     * @return 
     */
    public CloseSys201OutCtx closeSys201(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-CLOSE-SYS012
     *
     * @return 
     */
    public CloseSys012OutCtx closeSys012(Ip809050Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-PROCESS
     *
     * @return 
     */
    public TerminateProcessOutCtx terminateProcess(TerminateProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9950-UPDATE-EVENT-LOG
     *
     * @return 
     */
    public UpdateEventLogOutCtx updateEventLog(UpdateEventLogInCtx methodIn) throws Exception;


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
