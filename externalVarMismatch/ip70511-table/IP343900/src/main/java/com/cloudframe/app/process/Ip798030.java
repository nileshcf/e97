package com.cloudframe.app.process;

import com.cloudframe.app.ip798030.Ip798030Ctx.UpdateCkpRowOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.SetBeginningTsInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenOutputSys001OutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseDisconnectQInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.EstablishMqConnectionOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteSys202PmafileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetEnvCntrlInfoOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteSys202PmafileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.WritePmaRecordInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.UpdateCkpRowInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthPmaInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadInsertPimOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetPaInfoOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteTamapmaOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthTablesInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenInputSys001OutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.AllocateSys202OutfileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.AbendTheProgramOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenOutputSys001InCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenIpSys202PmafileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenInputSys001InCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadInputSys001InCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadInsertPimInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseSys210FileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.EndProcessOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.PopulateParmToXtrnalInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteAuthPmaDataOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessMessageOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteTamapmaInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenSys210FileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseSys001CutoffInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.SelectCkpInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.FetchVcnOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.FindAccEligibilityOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.SelectCkpOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetCurrentTimestampOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.InsertCkpRowOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.PopulateParmToXtrnalOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.InitializeProcessInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthPimOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessMessageInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthTablesOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessViaMqInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CallLrmIp648010OutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.AbendOnMcdynamErrorOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenIpSys202PmafileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx;
import com.cloudframe.app.ip798030.Ip798030Ctx.MainlineInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessPmaEntriesInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CheckClrCyclIdInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DisplayNetTotalInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.EndProcess6000InCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.RetrvAuthDb2DataInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetCutoffTimestampInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.InsertTipapimInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ValidteMessageInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetCutoffTimestampOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetRunCntrlFileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ValidteMessageOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessPmaEntriesOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.EstablishMqConnectionInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteAuthDb2DataOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.InsertTipapimOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.WriteMqFileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenOpSys202PmafileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteAuthPmaDataInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.WriteOutputSys001InCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessNextMessageOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadPmaInsertPimInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.AbendOnMcdynamErrorInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenSys210FileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.WritePmaRecordOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthDb2DataInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessViaMqOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.WriteOutputSys001OutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.PopulatePimVariablesOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.InitializeProcessOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthPimInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.RetrvAuthDb2DataOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.SetBeginningTsOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CheckClrCyclIdOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthPmaOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetRunCntrlFileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessAuthDb2DataOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CallLrmIp648010InCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.PopulatePimVariablesInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseDisconnectQOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetCurrentTimestampInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseSys202PmafileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.FetchVcnInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CommitSqlOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.MainlineOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseSys210FileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetEnvCntrlInfoInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.OpenOpSys202PmafileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadPmaInsertPimOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.AbendTheProgramInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.GetPaInfoInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseSys001CutoffOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.AllocateSys202OutfileOutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CloseSys202PmafileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadInputSys001OutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.FindAccEligibilityInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.WriteMqFileInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadPmaInsertPim2212OutCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.InsertCkpRowInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.DeleteAuthDb2DataInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ProcessNextMessageInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.ReadPmaInsertPim2212InCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CommitSqlInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip798030.Ip798030Ctx.EndProcessInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CallMcdynamRoutineInCtx;
import com.cloudframe.app.ip798030.Ip798030Ctx.CallMcdynamRoutineOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip798030 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Ip798030Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip798030Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-PROCESS
     *
     * @return 
     */
    public InitializeProcessOutCtx initializeProcess(InitializeProcessInCtx methodIn) throws Exception;

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
     * This method is derived from Cobol Paragraph - 1300-POPULATE-PARM-TO-XTRNAL
     *
     * @return 
     */
    public PopulateParmToXtrnalOutCtx populateParmToXtrnal(PopulateParmToXtrnalInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-OPEN-READ-SYS001-INFILE
     *
     */
    public void openReadSys001Infile(Ip798030Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1510-OPEN-INPUT-SYS001
     *
     * @return 
     */
    public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1520-READ-INPUT-SYS001
     *
     * @return 
     */
    public ReadInputSys001OutCtx readInputSys001(ReadInputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1600-GET-ENV-CNTRL-INFO
     *
     * @return 
     */
    public GetEnvCntrlInfoOutCtx getEnvCntrlInfo(GetEnvCntrlInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1700-GET-RUN-CNTRL-FILE
     *
     * @return 
     */
    public GetRunCntrlFileOutCtx getRunCntrlFile(GetRunCntrlFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1800-GET-PA-INFO
     *
     * @return 
     */
    public GetPaInfoOutCtx getPaInfo(GetPaInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1900-ESTABLISH-MQ-CONNECTION
     *
     * @return 
     */
    public EstablishMqConnectionOutCtx establishMqConnection(EstablishMqConnectionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1950-OPEN-SYS210-FILE
     *
     * @return 
     */
    public OpenSys210FileOutCtx openSys210File(OpenSys210FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-AUTH-TABLES
     *
     * @return 
     */
    public ProcessAuthTablesOutCtx processAuthTables(ProcessAuthTablesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-RETRV-AUTH-DB2-DATA
     *
     * @return 
     */
    public RetrvAuthDb2DataOutCtx retrvAuthDb2Data(RetrvAuthDb2DataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-PROCESS-AUTH-PMA
     *
     * @return 
     */
    public ProcessAuthPmaOutCtx processAuthPma(ProcessAuthPmaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2111-ALLOCATE-SYS202-OUTFILE
     *
     * @return 
     */
    public AllocateSys202OutfileOutCtx allocateSys202Outfile(AllocateSys202OutfileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2112-OPEN-OP-SYS202-PMAFILE
     *
     * @return 
     */
    public OpenOpSys202PmafileOutCtx openOpSys202Pmafile(OpenOpSys202PmafileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2113-WRITE-PMA-RECORD
     *
     * @return 
     */
    public WritePmaRecordOutCtx writePmaRecord(WritePmaRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2114-FETCH-VCN
     *
     * @return 
     */
    public FetchVcnOutCtx fetchVcn(FetchVcnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2120-PROCESS-AUTH-PIM
     *
     * @return 
     */
    public ProcessAuthPimOutCtx processAuthPim(ProcessAuthPimInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-PROCESS-AUTH-DB2-DATA
     *
     * @return 
     */
    public ProcessAuthDb2DataOutCtx processAuthDb2Data(ProcessAuthDb2DataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2210-PROCESS-PMA-ENTRIES
     *
     * @return 
     */
    public ProcessPmaEntriesOutCtx processPmaEntries(ProcessPmaEntriesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2211-READ-PMA-INSERT-PIM
     *
     * @return 
     */
    public ReadPmaInsertPimOutCtx readPmaInsertPim(ReadPmaInsertPimInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2212-READ-PMA-INSERT-PIM
     *
     * @return 
     */
    public ReadPmaInsertPim2212OutCtx readPmaInsertPim2212(ReadPmaInsertPim2212InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2213-DELETE-SYS202-PMAFILE
     *
     * @return 
     */
    public DeleteSys202PmafileOutCtx deleteSys202Pmafile(DeleteSys202PmafileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2221-READ-INSERT-PIM
     *
     * @return 
     */
    public ReadInsertPimOutCtx readInsertPim(ReadInsertPimInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-DELETE-AUTH-DB2-DATA
     *
     * @return 
     */
    public DeleteAuthDb2DataOutCtx deleteAuthDb2Data(DeleteAuthDb2DataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2310-DELETE-TAMAPMA
     *
     * @return 
     */
    public DeleteTamapmaOutCtx deleteTamapma(DeleteTamapmaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2311-DELETE-AUTH-PMA-DATA
     *
     * @return 
     */
    public DeleteAuthPmaDataOutCtx deleteAuthPmaData(DeleteAuthPmaDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2700-CHECK-CLR-CYCL-ID
     *
     * @return 
     */
    public CheckClrCyclIdOutCtx checkClrCyclId(CheckClrCyclIdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2800-SET-BEGINNING-TS
     *
     * @return 
     */
    public SetBeginningTsOutCtx setBeginningTs(SetBeginningTsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2810-GET-CUTOFF-TIMESTAMP
     *
     * @return 
     */
    public GetCutoffTimestampOutCtx getCutoffTimestamp(GetCutoffTimestampInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-END-PROCESS
     *
     * @return 
     */
    public EndProcessOutCtx endProcess(EndProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-OPEN-WRITE-SYS001-OUTFIL
     *
     */
    public void openWriteSys001Outfil(Ip798030Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4100-OPEN-OUTPUT-SYS001
     *
     * @return 
     */
    public OpenOutputSys001OutCtx openOutputSys001(OpenOutputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4200-WRITE-OUTPUT-SYS001
     *
     * @return 
     */
    public WriteOutputSys001OutCtx writeOutputSys001(WriteOutputSys001InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4500-CLOSE-SYS210-FILE
     *
     * @return 
     */
    public CloseSys210FileOutCtx closeSys210File(CloseSys210FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-PROCESS-VIA-MQ
     *
     * @return 
     */
    public ProcessViaMqOutCtx processViaMq(ProcessViaMqInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5100-PROCESS-MESSAGE
     *
     * @return 
     */
    public ProcessMessageOutCtx processMessage(ProcessMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5110-VALIDTE-MESSAGE
     *
     * @return 
     */
    public ValidteMessageOutCtx validteMessage(ValidteMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5200-PROCESS-NEXT-MESSAGE
     *
     * @return 
     */
    public ProcessNextMessageOutCtx processNextMessage(ProcessNextMessageInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-END-PROCESS
     *
     */
    public void endProcess6000(EndProcess6000InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7000-CLOSE-DISCONNECT-Q
     *
     * @return 
     */
    public CloseDisconnectQOutCtx closeDisconnectQ(CloseDisconnectQInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-FIND-ACC-ELIGIBILITY
     *
     * @return 
     */
    public FindAccEligibilityOutCtx findAccEligibility(FindAccEligibilityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8200-CALL-LRM-IP648010
     *
     * @return 
     */
    public CallLrmIp648010OutCtx callLrmIp648010(CallLrmIp648010InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8220-POPULATE-PIM-VARIABLES
     *
     * @return 
     */
    public PopulatePimVariablesOutCtx populatePimVariables(PopulatePimVariablesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-CALL-MCDYNAM-ROUTINE
     *
     * @return 
     */
    public CallMcdynamRoutineOutCtx callMcdynamRoutine(CallMcdynamRoutineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8310-ABEND-ON-MCDYNAM-ERROR
     *
     * @return 
     */
    public AbendOnMcdynamErrorOutCtx abendOnMcdynamError(AbendOnMcdynamErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-CLOSE-SYS001-CUTOFF
     *
     * @return 
     */
    public CloseSys001CutoffOutCtx closeSys001Cutoff(CloseSys001CutoffInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8420-CLOSE-SYS202-PMAFILE
     *
     * @return 
     */
    public CloseSys202PmafileOutCtx closeSys202Pmafile(CloseSys202PmafileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8430-OPEN-IP-SYS202-PMAFILE
     *
     * @return 
     */
    public OpenIpSys202PmafileOutCtx openIpSys202Pmafile(OpenIpSys202PmafileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8500-SELECT-CKP
     *
     * @return 
     */
    public SelectCkpOutCtx selectCkp(SelectCkpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8510-INSERT-CKP-ROW
     *
     * @return 
     */
    public InsertCkpRowOutCtx insertCkpRow(InsertCkpRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8520-UPDATE-CKP-ROW
     *
     * @return 
     */
    public UpdateCkpRowOutCtx updateCkpRow(UpdateCkpRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8600-GET-CURRENT-TIMESTAMP
     *
     * @return 
     */
    public GetCurrentTimestampOutCtx getCurrentTimestamp(GetCurrentTimestampInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8700-INSERT-TIPAPIM
     *
     * @return 
     */
    public InsertTipapimOutCtx insertTipapim(InsertTipapimInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8800-COMMIT-SQL
     *
     * @return 
     */
    public CommitSqlOutCtx commitSql(CommitSqlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8900-WRITE-MQ-FILE
     *
     * @return 
     */
    public WriteMqFileOutCtx writeMqFile(WriteMqFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9500-ABEND-THE-PROGRAM
     *
     * @return 
     */
    public AbendTheProgramOutCtx abendTheProgram(AbendTheProgramInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9510-DISPLAY-NET-TOTAL
     *
     */
    public void displayNetTotal(DisplayNetTotalInCtx methodIn) throws Exception;

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
