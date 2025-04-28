package com.cloudframe.app.process;

import com.cloudframe.app.ip606130.Ip606130Ctx.CalculateNewRdwOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.StoreTable36InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.SpecialProcessingOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.FileOpenProcessOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.OpenTemp90FileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx._10OpenTempFilesOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.FormatOpRecOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.FileOpenProcessInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.FormatOpRecInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessInputFileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadTemp91FileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.LoadTable0RecordsOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable91OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ExpandMpeInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessOtherTblsOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CheckTrailerCountsInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable91InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.LoadTable0RecordsInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.DateConversionOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable91DfltsOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.PrintCountsInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadReleaseTbl90OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable90DfltsInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.WriteExpandedRecordOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.SortTheTempFileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CloseSys001InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.FormatSortRecInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessIp9000t1OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.MainlineInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.TerminateOnErrorOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx._10OpenTempFilesInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CloseTemp91FileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.TableIdConversionOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.Write91DfltToTempOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.EndOfJobInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.OpenInputSys001InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.WriteExpandedRecordInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.DisplayExecMessagesOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ExpandMpeOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadTemp91FileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessHeaderTrailerOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessTable90TrailerInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CalculateNewRdwInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.ip606130.Ip606130Ctx.StoreTable36OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessTable91TrailerInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadReleaseTbl90InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.OpenTemp90FileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CheckForHeadersOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessTable91TrailerOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadTemp90FileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.PrintCountsOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.TableIdConversionInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessFinalTrailerOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.DisplayExecMessagesInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.DisplayMissingMsgOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.Write90DfltToTempOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable90DfltsOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CloseTemp90FileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CloseTemp90FileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CheckForHeadersInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessFinalTrailerInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadReleaseTbl91InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable90OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx._10MoveTo90LayoutInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CloseTemp91FileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.OpenTemp91FileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessInputFileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.Write90DfltToTempInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CheckTrailerCountsOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.CloseSys001OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessOtherTblsInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.Write91DfltToTempInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadReleaseTbl91OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx._10MoveTo91LayoutInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadInputFileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.OpenTemp91FileInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.DateConversionInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessIp9000t1InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable91DfltsInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.BuildTable90InCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx._10MoveTo90LayoutOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.SpecialProcessingInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.EndOfJobOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx._10MoveTo91LayoutOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.DisplayMissingMsgInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessHeaderTrailerInCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadInputFileOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx;
import com.cloudframe.app.ip606130.Ip606130Ctx.OpenInputSys001OutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ProcessTable90TrailerOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.ReadTemp90FileInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip606130.Ip606130Ctx.InitializeProcessOutCtx;
import com.cloudframe.app.ip606130.Ip606130Ctx.InitializeProcessInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip606130 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip606130Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-PROCESS
     *
     * @return 
     */
    public InitializeProcessOutCtx initializeProcess(InitializeProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MESSAGES
     *
     * @return 
     */
    public DisplayExecMessagesOutCtx displayExecMessages(DisplayExecMessagesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-FILE-OPEN-PROCESS
     *
     * @return 
     */
    public FileOpenProcessOutCtx fileOpenProcess(FileOpenProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-CHECK-FOR-HEADERS
     *
     * @return 
     */
    public CheckForHeadersOutCtx checkForHeaders(CheckForHeadersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-INPUT-FILE
     *
     * @return 
     */
    public ProcessInputFileOutCtx processInputFile(ProcessInputFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-PROCESS-HEADER-TRAILER
     *
     * @return 
     */
    public ProcessHeaderTrailerOutCtx processHeaderTrailer(ProcessHeaderTrailerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-PROCESS-TABLE90-TRAILER
     *
     * @return 
     */
    public ProcessTable90TrailerOutCtx processTable90Trailer(ProcessTable90TrailerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2120-PROCESS-TABLE91-TRAILER
     *
     * @return 
     */
    public ProcessTable91TrailerOutCtx processTable91Trailer(ProcessTable91TrailerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2130-PROCESS-FINAL-TRAILER
     *
     * @return 
     */
    public ProcessFinalTrailerOutCtx processFinalTrailer(ProcessFinalTrailerInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2140-CHECK-TRAILER-COUNTS
     *
     * @return 
     */
    public CheckTrailerCountsOutCtx checkTrailerCounts(CheckTrailerCountsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2150-PROCESS-IP9000T1
     *
     * @return 
     */
    public ProcessIp9000t1OutCtx processIp9000t1(ProcessIp9000t1InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2160-PROCESS-OTHER-TBLS
     *
     * @return 
     */
    public ProcessOtherTblsOutCtx processOtherTbls(ProcessOtherTblsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-EXPAND-MPE
     *
     * @return 
     */
    public ExpandMpeOutCtx expandMpe(ExpandMpeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2210-LOAD-TABLE0-RECORDS
     *
     * @return 
     */
    public LoadTable0RecordsOutCtx loadTable0Records(LoadTable0RecordsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2220-DATE-CONVERSION
     *
     * @return 
     */
    public DateConversionOutCtx dateConversion(DateConversionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2230-TABLE-ID-CONVERSION
     *
     * @return 
     */
    public TableIdConversionOutCtx tableIdConversion(TableIdConversionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2231-DISPLAY-MISSING-MSG
     *
     * @return 
     */
    public DisplayMissingMsgOutCtx displayMissingMsg(DisplayMissingMsgInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2232-CALCULATE-NEW-RDW
     *
     * @return 
     */
    public CalculateNewRdwOutCtx calculateNewRdw(CalculateNewRdwInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2240-SPECIAL-PROCESSING
     *
     * @return 
     */
    public SpecialProcessingOutCtx specialProcessing(SpecialProcessingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2241-STORE-TABLE36
     *
     * @return 
     */
    public StoreTable36OutCtx storeTable36(StoreTable36InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2241-10-OPEN-TEMP-FILES
     *
     * @return 
     */
    public _10OpenTempFilesOutCtx _10OpenTempFiles(_10OpenTempFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2242-BUILD-TABLE90-DFLTS
     *
     * @return 
     */
    public BuildTable90DfltsOutCtx buildTable90Dflts(BuildTable90DfltsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2242-10-MOVE-TO-90-LAYOUT
     *
     * @return 
     */
    public _10MoveTo90LayoutOutCtx _10MoveTo90Layout(_10MoveTo90LayoutInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2243-BUILD-TABLE91-DFLTS
     *
     * @return 
     */
    public BuildTable91DfltsOutCtx buildTable91Dflts(BuildTable91DfltsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2243-10-MOVE-TO-91-LAYOUT
     *
     * @return 
     */
    public _10MoveTo91LayoutOutCtx _10MoveTo91Layout(_10MoveTo91LayoutInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2244-BUILD-TABLE90
     *
     * @return 
     */
    public BuildTable90OutCtx buildTable90(BuildTable90InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2245-BUILD-TABLE91
     *
     * @return 
     */
    public BuildTable91OutCtx buildTable91(BuildTable91InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-END-OF-JOB
     *
     * @return 
     */
    public EndOfJobOutCtx endOfJob(EndOfJobInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-PRINT-COUNTS
     *
     * @return 
     */
    public PrintCountsOutCtx printCounts(PrintCountsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7000-SORT-THE-TEMP-FILE
     *
     */
    public void sortTheTempFile(SortTheTempFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7100-FORMAT-SORT-REC
     *
     */
    public void formatSortRec(FormatSortRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7200-READ-RELEASE-TBL90
     *
     * @return 
     */
    public ReadReleaseTbl90OutCtx readReleaseTbl90(ReadReleaseTbl90InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7300-READ-RELEASE-TBL91
     *
     * @return 
     */
    public ReadReleaseTbl91OutCtx readReleaseTbl91(ReadReleaseTbl91InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7400-FORMAT-OP-REC
     *
     * @return 
     */
    public FormatOpRecOutCtx formatOpRec(FormatOpRecInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7500-READ-TEMP90-FILE
     *
     * @return 
     */
    public ReadTemp90FileOutCtx readTemp90File(ReadTemp90FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7600-READ-TEMP91-FILE
     *
     * @return 
     */
    public ReadTemp91FileOutCtx readTemp91File(ReadTemp91FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-READ-INPUT-FILE
     *
     * @return 
     */
    public ReadInputFileOutCtx readInputFile(ReadInputFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-WRITE-90-DFLT-TO-TEMP
     *
     * @return 
     */
    public Write90DfltToTempOutCtx write90DfltToTemp(Write90DfltToTempInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-WRITE-EXPANDED-RECORD
     *
     * @return 
     */
    public WriteExpandedRecordOutCtx writeExpandedRecord(WriteExpandedRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8250-WRITE-91-DFLT-TO-TEMP
     *
     * @return 
     */
    public Write91DfltToTempOutCtx write91DfltToTemp(Write91DfltToTempInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-CLOSE-SYS001
     *
     * @return 
     */
    public CloseSys001OutCtx closeSys001(CloseSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8350-OPEN-INPUT-SYS001
     *
     * @return 
     */
    public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-CLOSE-TEMP90-FILE
     *
     * @return 
     */
    public CloseTemp90FileOutCtx closeTemp90File(CloseTemp90FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8500-CLOSE-TEMP91-FILE
     *
     * @return 
     */
    public CloseTemp91FileOutCtx closeTemp91File(CloseTemp91FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8600-OPEN-TEMP90-FILE
     *
     * @return 
     */
    public OpenTemp90FileOutCtx openTemp90File(OpenTemp90FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8700-OPEN-TEMP91-FILE
     *
     * @return 
     */
    public OpenTemp91FileOutCtx openTemp91File(OpenTemp91FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     * @return 
     */
    public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;

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
