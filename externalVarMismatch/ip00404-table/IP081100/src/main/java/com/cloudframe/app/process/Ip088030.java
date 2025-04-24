package com.cloudframe.app.process;

import com.cloudframe.app.ip088030.Ip088030Ctx.SearchDefaultRateOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallCurrConvApiInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.OpenInputSys001OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.LoadIchgFeeTableOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SearchTxnMccAmtOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.WriteSys201OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AlignAmtToExpInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AlignIchgFeeAmtInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CalculateIchgAmtInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AlignIchgFeeAmtOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DoInitializationOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseSys002InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.OpenOutputSys201OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.WriteOutputSys201InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseSys001OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DetermineFeeIssOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseFilesOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseSys201OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.ReadSys002FileOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AlignAmtToExpOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DetermineFeeAcqOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DetermineTxnTypeInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SearchOthersGrpOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.OpenInputSys002OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AlignTxnAmtDecimalOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CheckMccCodeInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.LoadIchgFeeTableInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SearchTxnMccAmtInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallRuncntlApiInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.WriteOutputSys201OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SearchOthersGrpInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.WriteSys201InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.ReadSys001FileInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseSys001InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SearchDefaultRateInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseSys201InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallCurrConvApiOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AbendProgramOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.ReadSys002FileInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SearchMaidIdInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AlignTxnAmtDecimalInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallTbl16ApiInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DetermineFeeAcqInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallTbl40ApiOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.ProcessInputFileOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CheckMccCodeOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.OpenInputSys001InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.OpenOutputSys201InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseFilesInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallTbl16ApiOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DetermineTxnTypeOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallRuncntlApiOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DetermineFeeIssInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.ProcessInputFileInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SearchMaidIdOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CallTbl40ApiInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.CalculateIchgAmtOutCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip088030.Ip088030Ctx.DetermineInterchangeInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.ReadSys001FileOutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.OpenInputSys002InCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip088030.Ip088030Ctx.CloseSys002OutCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.DoInitializationInCtx;
import com.cloudframe.app.ip088030.Ip088030Ctx.AbendProgramInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip088030 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip088030Ctx programCtx) throws Exception;

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
     * This method is derived from Cobol Paragraph - 1300-OPEN-ALL-FILES
     *
     */
    public void openAllFiles(Ip088030Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1310-OPEN-INPUT-SYS001
     *
     * @return 
     */
    public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1320-OPEN-INPUT-SYS002
     *
     * @return 
     */
    public OpenInputSys002OutCtx openInputSys002(OpenInputSys002InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1330-OPEN-OUTPUT-SYS201
     *
     * @return 
     */
    public OpenOutputSys201OutCtx openOutputSys201(OpenOutputSys201InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-CALL-RUNCNTL-API
     *
     * @return 
     */
    public CallRuncntlApiOutCtx callRuncntlApi(CallRuncntlApiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-LOAD-ICHG-FEE-TABLE
     *
     * @return 
     */
    public LoadIchgFeeTableOutCtx loadIchgFeeTable(LoadIchgFeeTableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-INPUT-FILE
     *
     * @return 
     */
    public ProcessInputFileOutCtx processInputFile(ProcessInputFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-WRITE-SYS201
     *
     * @return 
     */
    public WriteSys201OutCtx writeSys201(WriteSys201InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-POPULATE-NEW-FEE-INFO
     *
     */
    public void populateNewFeeInfo(Ip088030Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2111-DETERMINE-FEE-ACQ
     *
     * @return 
     */
    public DetermineFeeAcqOutCtx determineFeeAcq(DetermineFeeAcqInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2112-DETERMINE-FEE-ISS
     *
     * @return 
     */
    public DetermineFeeIssOutCtx determineFeeIss(DetermineFeeIssInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2120-WRITE-OUTPUT-SYS201
     *
     * @return 
     */
    public WriteOutputSys201OutCtx writeOutputSys201(WriteOutputSys201InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-SEARCH-DEFAULT-RATE
     *
     * @return 
     */
    public SearchDefaultRateOutCtx searchDefaultRate(SearchDefaultRateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-CLOSE-FILES
     *
     * @return 
     */
    public CloseFilesOutCtx closeFiles(CloseFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-CLOSE-SYS001
     *
     * @return 
     */
    public CloseSys001OutCtx closeSys001(CloseSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3200-CLOSE-SYS002
     *
     * @return 
     */
    public CloseSys002OutCtx closeSys002(CloseSys002InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3300-CLOSE-SYS201
     *
     * @return 
     */
    public CloseSys201OutCtx closeSys201(CloseSys201InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-READ-SYS001-FILE
     *
     * @return 
     */
    public ReadSys001FileOutCtx readSys001File(ReadSys001FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-READ-SYS002-FILE
     *
     * @return 
     */
    public ReadSys002FileOutCtx readSys002File(ReadSys002FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-DETERMINE-TXN-TYPE
     *
     * @return 
     */
    public DetermineTxnTypeOutCtx determineTxnType(DetermineTxnTypeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8210-CALL-TBL40-API
     *
     * @return 
     */
    public CallTbl40ApiOutCtx callTbl40Api(CallTbl40ApiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8220-CALL-TBL16-API
     *
     * @return 
     */
    public CallTbl16ApiOutCtx callTbl16Api(CallTbl16ApiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-CALL-CURR-CONV-API
     *
     * @return 
     */
    public CallCurrConvApiOutCtx callCurrConvApi(CallCurrConvApiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-ALIGN-AMT-TO-EXP
     *
     * @return 
     */
    public AlignAmtToExpOutCtx alignAmtToExp(AlignAmtToExpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8500-DETERMINE-INTERCHANGE
     *
     */
    public void determineInterchange(DetermineInterchangeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8510-SEARCH-MAID-ID
     *
     * @return 
     */
    public SearchMaidIdOutCtx searchMaidId(SearchMaidIdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8520-CHECK-MCC-CODE
     *
     * @return 
     */
    public CheckMccCodeOutCtx checkMccCode(CheckMccCodeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8530-SEARCH-TXN-MCC-AMT
     *
     * @return 
     */
    public SearchTxnMccAmtOutCtx searchTxnMccAmt(SearchTxnMccAmtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8540-SEARCH-OTHERS-GRP
     *
     * @return 
     */
    public SearchOthersGrpOutCtx searchOthersGrp(SearchOthersGrpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8600-CALCULATE-ICHG-AMT
     *
     * @return 
     */
    public CalculateIchgAmtOutCtx calculateIchgAmt(CalculateIchgAmtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8610-ALIGN-TXN-AMT-DECIMAL
     *
     * @return 
     */
    public AlignTxnAmtDecimalOutCtx alignTxnAmtDecimal(AlignTxnAmtDecimalInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8620-ALIGN-ICHG-FEE-AMT
     *
     * @return 
     */
    public AlignIchgFeeAmtOutCtx alignIchgFeeAmt(AlignIchgFeeAmtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9500-ABEND-PROGRAM
     *
     * @return 
     */
    public AbendProgramOutCtx abendProgram(AbendProgramInCtx methodIn) throws Exception;


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
