package com.cloudframe.app.process;

import com.cloudframe.app.sf311010.Sf311010Ctx.MainlineInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.MoveDataInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.WriteReportDetailLineInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessDe120InCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.CallParserInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.MoveMti2OutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ObscureDataOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.GenerateControlReportSplit0OutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ReadCentralSiteBdlogsInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessDe48SexxOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.InitializeOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx._20CheckDe125OutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessDe48SexxInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ReadCentralSiteBdlogsOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx._10CommonCcMovesOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.CallParserOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessDe48InCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessDe120OutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.MoveMti1InCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessLogInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessJLogsInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessDe48OutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ObscureDataInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.WriteReportHeadingsInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.MoveDataOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.InitializeInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx._10CommonCcMovesInCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.GenerateControlReportSplit0InCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.GenerateControlReportSplit1OutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessJLogsOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.WriteReportDetailLineOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.WriteReportHeadingsOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx;
import com.cloudframe.app.sf311010.Sf311010Ctx._20CheckDe125InCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.MoveMti2InCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.MoveMti1OutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.GenerateControlReportSplit1InCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.EojRoutineOutCtx;
import com.cloudframe.app.sf311010.Sf311010Ctx.EojRoutineInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.sf311010.Sf311010Ctx.ProcessLogOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Sf311010 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Sf311010Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Sf311010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-READ-CENTRAL-SITE-BDLOGS
     *
     * @return 
     */
    public ReadCentralSiteBdlogsOutCtx readCentralSiteBdlogs(ReadCentralSiteBdlogsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-PROCESS-LOG
     *
     * @return 
     */
    public ProcessLogOutCtx processLog(ProcessLogInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-PROCESS-J-LOGS
     *
     * @return 
     */
    public ProcessJLogsOutCtx processJLogs(ProcessJLogsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3120-MOVE-DATA
     *
     * @return 
     */
    public MoveDataOutCtx moveData(MoveDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3493-10-COMMON-CC-MOVES
     *
     * @return 
     */
    public _10CommonCcMovesOutCtx _10CommonCcMoves(_10CommonCcMovesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3493-20-CHECK-DE125
     *
     * @return 
     */
    public _20CheckDe125OutCtx _20CheckDe125(_20CheckDe125InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-CALL-PARSER
     *
     * @return 
     */
    public CallParserOutCtx callParser(CallParserInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5100-MOVE-MTI-1
     *
     * @return 
     */
    public MoveMti1OutCtx moveMti1(MoveMti1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5200-MOVE-MTI-2
     *
     * @return 
     */
    public MoveMti2OutCtx moveMti2(MoveMti2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5300-OBSCURE-DATA
     *
     * @return 
     */
    public ObscureDataOutCtx obscureData(ObscureDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-GENERATE-CONTROL-REPORT
     *
     */
    public void generateControlReport(Sf311010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-GENERATE-CONTROL-REPORT-SPLIT0
     *
     * @return 
     */
    public GenerateControlReportSplit0OutCtx generateControlReportSplit0(GenerateControlReportSplit0InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-GENERATE-CONTROL-REPORT-SPLIT1
     *
     * @return 
     */
    public GenerateControlReportSplit1OutCtx generateControlReportSplit1(GenerateControlReportSplit1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6100-WRITE-REPORT-DETAIL-LINE
     *
     * @return 
     */
    public WriteReportDetailLineOutCtx writeReportDetailLine(WriteReportDetailLineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6200-WRITE-REPORT-HEADINGS
     *
     * @return 
     */
    public WriteReportHeadingsOutCtx writeReportHeadings(WriteReportHeadingsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-PROCESS-DE48
     *
     * @return 
     */
    public ProcessDe48OutCtx processDe48(ProcessDe48InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8020-PROCESS-DE48-SEXX
     *
     * @return 
     */
    public ProcessDe48SexxOutCtx processDe48Sexx(ProcessDe48SexxInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8030-PROCESS-DE120
     *
     * @return 
     */
    public ProcessDe120OutCtx processDe120(ProcessDe120InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9900-EOJ-ROUTINE
     *
     * @return 
     */
    public EojRoutineOutCtx eojRoutine(EojRoutineInCtx methodIn) throws Exception;


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
