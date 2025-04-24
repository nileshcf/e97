package com.cloudframe.app.process;

import com.cloudframe.app.sf320010.Sf320010Ctx.WriteInfoSecRecordOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatEmailOpLogHdrOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatPosTransLogRptOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.WriteReportRecordOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatTypeIiActivityInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatMipProfileReportOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.CheckOperMsgAreaOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatMipProfileReportInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatPosTransLogRptInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit4OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortInProcedureInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatBulkDataReportInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsRptOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatPosReportHdrOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit5InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatTypeIiActivityOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit5OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatOperatorLogRptInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatOperatorLogHdrInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsRptHdrInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortInProcedure0100OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SetDateTimeInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.ProduceControlReportInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsTotalsSplit6InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit3OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit4InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortOutProcedureInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.ProduceControlReportOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatBulkDataHeaderInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortInProcedureOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortOutProcedureOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsTotalsSplit7InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.WriteEmailRecordOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatBulkDataReportOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit3InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.WriteEmailRecordInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortOutProcedure0100InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsTotalsSplit7OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatReportsOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatBulkDataHeaderOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit2OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsRptHdrOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatTypeIiLogRptSplit0OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatX92ActivityRptSplit2InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatTypeIiLogRptSplit1InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SetDateTimeOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatTypeIiLogRptSplit1OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatReportsInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatMipProfileHdrInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.WriteInfoSecRecordInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatOperatorLogHdrOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatEmailOpLogHdrInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatMipProfileHdrOutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatTypeIiLogRptSplit0InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.WriteReportRecordInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortInProcedure0100InCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatPosReportHdrInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatOperatorLogRptOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsTotalsSplit6OutCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.FormatRemConsRptInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.CheckOperMsgAreaInCtx;
import com.cloudframe.app.sf320010.Sf320010Ctx.SortOutProcedure0100OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sf320010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sf320010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-SORT-IN-PROCEDURE SECTION
     *
     * @return 
     */
    public SortInProcedureOutCtx sortInProcedure(SortInProcedureInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-SORT-OUT-PROCEDURE SECTION
     *
     * @return 
     */
    public SortOutProcedureOutCtx sortOutProcedure(SortOutProcedureInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-SORT-IN-PROCEDURE SECTION
     *
     * @return 
     */
    public SortInProcedure0100OutCtx sortInProcedure0100(SortInProcedure0100InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-SORT-OUT-PROCEDURE SECTION
     *
     * @return 
     */
    public SortOutProcedure0100OutCtx sortOutProcedure0100(SortOutProcedure0100InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-FORMAT-REPORTS
     *
     * @return 
     */
    public FormatReportsOutCtx formatReports(FormatReportsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-FORMAT-BULK-DATA-REPORT
     *
     * @return 
     */
    public FormatBulkDataReportOutCtx formatBulkDataReport(FormatBulkDataReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1110-FORMAT-BULK-DATA-HEADER
     *
     * @return 
     */
    public FormatBulkDataHeaderOutCtx formatBulkDataHeader(FormatBulkDataHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-FORMAT-OPERATOR-LOG-RPT
     *
     * @return 
     */
    public FormatOperatorLogRptOutCtx formatOperatorLogRpt(FormatOperatorLogRptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1210-FORMAT-OPERATOR-LOG-HDR
     *
     * @return 
     */
    public FormatOperatorLogHdrOutCtx formatOperatorLogHdr(FormatOperatorLogHdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1220-FORMAT-EMAIL-OP-LOG-HDR
     *
     * @return 
     */
    public FormatEmailOpLogHdrOutCtx formatEmailOpLogHdr(FormatEmailOpLogHdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-FORMAT-MIP-PROFILE-REPORT
     *
     * @return 
     */
    public FormatMipProfileReportOutCtx formatMipProfileReport(FormatMipProfileReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1410-FORMAT-MIP-PROFILE-HDR
     *
     * @return 
     */
    public FormatMipProfileHdrOutCtx formatMipProfileHdr(FormatMipProfileHdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-FORMAT-POS-TRANS-LOG-RPT
     *
     * @return 
     */
    public FormatPosTransLogRptOutCtx formatPosTransLogRpt(FormatPosTransLogRptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1510-FORMAT-POS-REPORT-HDR
     *
     * @return 
     */
    public FormatPosReportHdrOutCtx formatPosReportHdr(FormatPosReportHdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1600-FORMAT-TYPE-II-ACTIVITY
     *
     * @return 
     */
    public FormatTypeIiActivityOutCtx formatTypeIiActivity(FormatTypeIiActivityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1610-FORMAT-TYPE-II-LOG-RPT
     *
     */
    public void formatTypeIiLogRpt(Sf320010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT0
     *
     * @return 
     */
    public FormatTypeIiLogRptSplit0OutCtx formatTypeIiLogRptSplit0(FormatTypeIiLogRptSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT1
     *
     * @return 
     */
    public FormatTypeIiLogRptSplit1OutCtx formatTypeIiLogRptSplit1(FormatTypeIiLogRptSplit1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1700-FORMAT-X92-ACTIVITY
     *
     * @return 
     */
    public FormatX92ActivityOutCtx formatX92Activity(FormatX92ActivityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT
     *
     */
    public void formatX92ActivityRpt(Sf320010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT2
     *
     * @return 
     */
    public FormatX92ActivityRptSplit2OutCtx formatX92ActivityRptSplit2(FormatX92ActivityRptSplit2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT3
     *
     * @return 
     */
    public FormatX92ActivityRptSplit3OutCtx formatX92ActivityRptSplit3(FormatX92ActivityRptSplit3InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT4
     *
     * @return 
     */
    public FormatX92ActivityRptSplit4OutCtx formatX92ActivityRptSplit4(FormatX92ActivityRptSplit4InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT5
     *
     * @return 
     */
    public FormatX92ActivityRptSplit5OutCtx formatX92ActivityRptSplit5(FormatX92ActivityRptSplit5InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-FORMAT-REM-CONS-RPT
     *
     * @return 
     */
    public FormatRemConsRptOutCtx formatRemConsRpt(FormatRemConsRptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2010-FORMAT-REM-CONS-RPT-HDR
     *
     * @return 
     */
    public FormatRemConsRptHdrOutCtx formatRemConsRptHdr(FormatRemConsRptHdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-FORMAT-REM-CONS-TOTALS
     *
     */
    public void formatRemConsTotals(Sf320010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-FORMAT-REM-CONS-TOTALS-SPLIT6
     *
     * @return 
     */
    public FormatRemConsTotalsSplit6OutCtx formatRemConsTotalsSplit6(FormatRemConsTotalsSplit6InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-FORMAT-REM-CONS-TOTALS-SPLIT7
     *
     * @return 
     */
    public FormatRemConsTotalsSplit7OutCtx formatRemConsTotalsSplit7(FormatRemConsTotalsSplit7InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2020-CHECK-OPER-MSG-AREA
     *
     * @return 
     */
    public CheckOperMsgAreaOutCtx checkOperMsgArea(CheckOperMsgAreaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-WRITE-INFO-SEC-RECORD
     *
     * @return 
     */
    public WriteInfoSecRecordOutCtx writeInfoSecRecord(WriteInfoSecRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-PRODUCE-CONTROL-REPORT
     *
     * @return 
     */
    public ProduceControlReportOutCtx produceControlReport(ProduceControlReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-SET-DATE-TIME
     *
     * @return 
     */
    public SetDateTimeOutCtx setDateTime(SetDateTimeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-WRITE-REPORT-RECORD
     *
     * @return 
     */
    public WriteReportRecordOutCtx writeReportRecord(WriteReportRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-WRITE-EMAIL-RECORD
     *
     * @return 
     */
    public WriteEmailRecordOutCtx writeEmailRecord(WriteEmailRecordInCtx methodIn) throws Exception;


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
