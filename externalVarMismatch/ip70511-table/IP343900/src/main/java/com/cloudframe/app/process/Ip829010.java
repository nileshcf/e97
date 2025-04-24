package com.cloudframe.app.process;

import com.cloudframe.app.ip829010.Ip829010Ctx.ValidateQueueDataOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CloseQueueOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetQueueMessagesInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.PopulateMqputFieldsInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.StartLrmInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.SetProcedurePointersInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.OpenErrFileSys201InCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.WriteErrFileSys201InCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetMqRespJobNameOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.DisplayMqInfoInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.TipamrsInsertInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetTbl201InfoOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.WriteErrFileSys201OutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CloseErrFileSys201OutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.OpenErrFileSys201OutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetMqRespCdOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.SetProcedurePointersOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.InitializeVariablesInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetTbl201InfoInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.PopulateMqputFieldsOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ProcessRuncntlFileOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ProcessRuncntlFileInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.StartLrmOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ProcessFnsTxnsOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.InitializeVariablesOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.UpdateEventLogOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.UpdateEventLogInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.PrepTipamrsInsertOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetMqRespJobNameInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetMqRespCdInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ValidateQueueDataInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.DisplayMqInfoOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.MqputFraudTransInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.IndiaFraudTableLookupOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CloseQueueInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ConnectMqInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CloseErrFileSys201InCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.SetupQParmsFraudOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CallMqgetapiForReadOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.TipamrsInsertOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ProcessSys09eCtrlCardInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CallLrmIp648010InCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CallLrmIp648010OutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.GetQueueMessagesOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.TerminateOnErrorOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.SetMqGetOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.MainlineInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.CallMqgetapiForReadInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ProcessFnsTxnsInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ProcessSys09eCtrlCardOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.ConnectMqOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.PrepTipamrsInsertInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip829010.Ip829010Ctx.SetupQParmsFraudInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.IndiaFraudTableLookupInCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.MqputFraudTransOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.PerformInitializationOutCtx;
import com.cloudframe.app.ip829010.Ip829010Ctx.PerformInitializationInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip829010 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Ip829010Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip829010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PERFORM-INITIALIZATION
     *
     * @return 
     */
    public PerformInitializationOutCtx performInitialization(PerformInitializationInCtx methodIn) throws Exception;

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
     * This method is derived from Cobol Paragraph - 1300-INITIALIZE-VARIABLES
     *
     * @return 
     */
    public InitializeVariablesOutCtx initializeVariables(InitializeVariablesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-GET-MQ-RESP-JOB-NAME
     *
     * @return 
     */
    public GetMqRespJobNameOutCtx getMqRespJobName(GetMqRespJobNameInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-PROCESS-SYS09E-CTRL-CARD
     *
     * @return 
     */
    public ProcessSys09eCtrlCardOutCtx processSys09eCtrlCard(ProcessSys09eCtrlCardInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1600-PROCESS-RUNCNTL-FILE
     *
     * @return 
     */
    public ProcessRuncntlFileOutCtx processRuncntlFile(ProcessRuncntlFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1650-GET-TBL201-INFO
     *
     * @return 
     */
    public GetTbl201InfoOutCtx getTbl201Info(GetTbl201InfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1700-START-LRM
     *
     * @return 
     */
    public StartLrmOutCtx startLrm(StartLrmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1800-CONNECT-MQ
     *
     * @return 
     */
    public ConnectMqOutCtx connectMq(ConnectMqInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1900-OPEN-ERR-FILE-SYS201
     *
     * @return 
     */
    public OpenErrFileSys201OutCtx openErrFileSys201(OpenErrFileSys201InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-GET-QUEUE-MESSAGES
     *
     * @return 
     */
    public GetQueueMessagesOutCtx getQueueMessages(GetQueueMessagesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-PROCESS-FNS-TXNS
     *
     * @return 
     */
    public ProcessFnsTxnsOutCtx processFnsTxns(ProcessFnsTxnsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2400-SETUP-Q-PARMS-FRAUD
     *
     * @return 
     */
    public SetupQParmsFraudOutCtx setupQParmsFraud(SetupQParmsFraudInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2410-CALL-MQGETAPI-FOR-READ
     *
     * @return 
     */
    public CallMqgetapiForReadOutCtx callMqgetapiForRead(CallMqgetapiForReadInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2425-PREP-TIPAMRS-INSERT
     *
     * @return 
     */
    public PrepTipamrsInsertOutCtx prepTipamrsInsert(PrepTipamrsInsertInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2426-GET-MQ-RESP-CD
     *
     * @return 
     */
    public GetMqRespCdOutCtx getMqRespCd(GetMqRespCdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2430-TIPAMRS-INSERT
     *
     * @return 
     */
    public TipamrsInsertOutCtx tipamrsInsert(TipamrsInsertInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2500-VALIDATE-QUEUE-DATA
     *
     * @return 
     */
    public ValidateQueueDataOutCtx validateQueueData(ValidateQueueDataInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2550-INDIA-FRAUD-TABLE-LOOKUP
     *
     * @return 
     */
    public IndiaFraudTableLookupOutCtx indiaFraudTableLookup(IndiaFraudTableLookupInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2600-POPULATE-MQPUT-FIELDS
     *
     * @return 
     */
    public PopulateMqputFieldsOutCtx populateMqputFields(PopulateMqputFieldsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2610-MQPUT-FRAUD-TRANS
     *
     * @return 
     */
    public MqputFraudTransOutCtx mqputFraudTrans(MqputFraudTransInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2700-SET-MQ-GET
     *
     * @return 
     */
    public SetMqGetOutCtx setMqGet(Ip829010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2800-WRITE-ERR-FILE-SYS201
     *
     * @return 
     */
    public WriteErrFileSys201OutCtx writeErrFileSys201(WriteErrFileSys201InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-CLOSE-QUEUE
     *
     * @return 
     */
    public CloseQueueOutCtx closeQueue(CloseQueueInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-CLOSE-ERR-FILE-SYS201
     *
     * @return 
     */
    public CloseErrFileSys201OutCtx closeErrFileSys201(CloseErrFileSys201InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-DISPLAY-MQ-INFO
     *
     * @return 
     */
    public DisplayMqInfoOutCtx displayMqInfo(DisplayMqInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8500-CALL-LRM-IP648010
     *
     * @return 
     */
    public CallLrmIp648010OutCtx callLrmIp648010(CallLrmIp648010InCtx methodIn) throws Exception;

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
