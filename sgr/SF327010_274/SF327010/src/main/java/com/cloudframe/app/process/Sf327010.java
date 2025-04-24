package com.cloudframe.app.process;

import com.cloudframe.app.sf327010.Sf327010Ctx.InitializeValuesOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.GenerateReportInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.ProcessInputInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.OpenFilesInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.MoveReportDataOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.GenerateEmptyDtlInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.CheckLineCountInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.TerminateProgramOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BuildServiceIdDescInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BuildMonthInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.ReadSys001InCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.CalculateRepDataOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.MoveReportDataInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.MainlineInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.CompareBackupDataOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.WriteHdrInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.GenerateEmptyDtlOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BuildServiceIdDescOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BuildBegMsgOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.TerminateProgramInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.InitializeProgramInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.CheckLineCountOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.GenerateReportOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.InitializeValuesInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.WriteHdrOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BuildBegMsgInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.DisplayServiceDateInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.CalculateRepDataInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BackupRecordDataOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.GenerateHdrInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.ReadSys001OutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BackupRecordDataInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.sf327010.Sf327010Ctx.AccumulateDataOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx;
import com.cloudframe.app.sf327010.Sf327010Ctx.CompareBackupDataInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.AccumulateDataInCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.BuildMonthOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.GenerateHdrOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sf327010.Sf327010Ctx.InitializeProgramOutCtx;
import com.cloudframe.app.sf327010.Sf327010Ctx.DisplayServiceDateOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sf327010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sf327010Ctx programCtx) throws Exception;

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
     * This method is derived from Cobol Paragraph - 1100-BUILD-BEG-MSG
     *
     * @return 
     */
    public BuildBegMsgOutCtx buildBegMsg(BuildBegMsgInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-FILES
     *
     */
    public void openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-GENERATE-EMPTY-DTL
     *
     * @return 
     */
    public GenerateEmptyDtlOutCtx generateEmptyDtl(GenerateEmptyDtlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-INPUT
     *
     */
    public void processInput(ProcessInputInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-COMPARE-BACKUP-DATA
     *
     * @return 
     */
    public CompareBackupDataOutCtx compareBackupData(CompareBackupDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-GENERATE-HDR
     *
     * @return 
     */
    public GenerateHdrOutCtx generateHdr(GenerateHdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-ACCUMULATE-DATA
     *
     * @return 
     */
    public AccumulateDataOutCtx accumulateData(AccumulateDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-DISPLAY-SERVICE-DATE
     *
     * @return 
     */
    public DisplayServiceDateOutCtx displayServiceDate(DisplayServiceDateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-READ-SYS001
     *
     * @return 
     */
    public ReadSys001OutCtx readSys001(ReadSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-BACKUP-RECORD-DATA
     *
     * @return 
     */
    public BackupRecordDataOutCtx backupRecordData(BackupRecordDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-INITIALIZE-VALUES
     *
     * @return 
     */
    public InitializeValuesOutCtx initializeValues(InitializeValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-GENERATE-DTL
     *
     */
    public void generateDtl(Sf327010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8310-CALCULATE-REP-DATA
     *
     * @return 
     */
    public CalculateRepDataOutCtx calculateRepData(CalculateRepDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8320-CHECK-LINE-COUNT
     *
     * @return 
     */
    public CheckLineCountOutCtx checkLineCount(CheckLineCountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8330-MOVE-REPORT-DATA
     *
     * @return 
     */
    public MoveReportDataOutCtx moveReportData(MoveReportDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8340-GENERATE-REPORT
     *
     * @return 
     */
    public GenerateReportOutCtx generateReport(GenerateReportInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8350-BUILD-SERVICE-ID-DESC
     *
     * @return 
     */
    public BuildServiceIdDescOutCtx buildServiceIdDesc(BuildServiceIdDescInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-WRITE-HDR
     *
     * @return 
     */
    public WriteHdrOutCtx writeHdr(WriteHdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8500-BUILD-MONTH
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
