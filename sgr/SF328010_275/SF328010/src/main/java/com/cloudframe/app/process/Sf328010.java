package com.cloudframe.app.process;

import com.cloudframe.app.sf328010.Sf328010Ctx.ProcessZLogFileInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.AccumulateDataInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.TerminateProgramOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.WriteReportHeaderInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildServiceIdDescOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.AccumulateDataOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildMonthInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.DisplayServiceDateOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.InitializeProgramInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.DisplayServiceDateInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.GenerateReportInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildServiceIdDescInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildEmptyRptInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.CalculatePercentInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.ReadZLogFileOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.ReadZLogFileInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.InitializeProgramOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.CalculatePercentOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.WriteReportHeaderOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.WriteDetailInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.FormatDataOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildBegJobMsgsOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.ProcessZLogFileOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.SetupWorkAreaInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.CalculateServiceDtTmInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.TerminateProgramInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.MoveDataHoldOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.SetupWorkAreaOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.FormatDataInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildMonthOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildEmptyRptOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.MoveDataHoldInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.OpenFilesInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sf328010.Sf328010Ctx.WriteDetailOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.GenerateReportOutCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.MainlineInCtx;
import com.cloudframe.app.sf328010.Sf328010Ctx.BuildBegJobMsgsInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sf328010.Sf328010Ctx.CalculateServiceDtTmOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sf328010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sf328010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-PROGRAM
     *
     * @return 
     */
    public InitializeProgramOutCtx initializeProgram(InitializeProgramInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-BUILD-BEG-JOB-MSGS
     *
     * @return 
     */
    public BuildBegJobMsgsOutCtx buildBegJobMsgs(BuildBegJobMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-FILES
     *
     */
    public void openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-SETUP-WORK-AREA
     *
     * @return 
     */
    public SetupWorkAreaOutCtx setupWorkArea(SetupWorkAreaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-BUILD-EMPTY-RPT
     *
     * @return 
     */
    public BuildEmptyRptOutCtx buildEmptyRpt(BuildEmptyRptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-Z-LOG-FILE
     *
     * @return 
     */
    public ProcessZLogFileOutCtx processZLogFile(ProcessZLogFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-ACCUMULATE-DATA
     *
     * @return 
     */
    public AccumulateDataOutCtx accumulateData(AccumulateDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-CALCULATE-PERCENT
     *
     * @return 
     */
    public CalculatePercentOutCtx calculatePercent(CalculatePercentInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2120-CALCULATE-SERVICE-DT-TM
     *
     * @return 
     */
    public CalculateServiceDtTmOutCtx calculateServiceDtTm(CalculateServiceDtTmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-DISPLAY-SERVICE-DATE
     *
     * @return 
     */
    public DisplayServiceDateOutCtx displayServiceDate(DisplayServiceDateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-READ-Z-LOG-FILE
     *
     * @return 
     */
    public ReadZLogFileOutCtx readZLogFile(ReadZLogFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-GENERATE-REPORT
     *
     * @return 
     */
    public GenerateReportOutCtx generateReport(GenerateReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8110-WRITE-REPORT-HEADER
     *
     * @return 
     */
    public WriteReportHeaderOutCtx writeReportHeader(WriteReportHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8120-WRITE-DETAIL
     *
     * @return 
     */
    public WriteDetailOutCtx writeDetail(WriteDetailInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8121-FORMAT-DATA
     *
     * @return 
     */
    public FormatDataOutCtx formatData(FormatDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8122-BUILD-SERVICE-ID-DESC
     *
     * @return 
     */
    public BuildServiceIdDescOutCtx buildServiceIdDesc(BuildServiceIdDescInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-MOVE-DATA-HOLD
     *
     * @return 
     */
    public MoveDataHoldOutCtx moveDataHold(MoveDataHoldInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-BUILD-MONTH
     *
     * @return 
     */
    public BuildMonthOutCtx buildMonth(BuildMonthInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-PROGRAM
     *
     * @return 
     */
    public TerminateProgramOutCtx terminateProgram(TerminateProgramInCtx methodIn) throws Exception;


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
