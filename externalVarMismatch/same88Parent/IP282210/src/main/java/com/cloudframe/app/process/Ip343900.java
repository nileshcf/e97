package com.cloudframe.app.process;

import com.cloudframe.app.ip343900.Ip343900Ctx.EstablishMqConnectionInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.DoProcessInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.DisplayExecMsgsInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.GetPaInfoInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.CloseDisconnectQOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.DoProcessOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.OpenPmmFixUnloadFileInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.OpenInputSys067InCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ReadInputSys067OutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ReadInputSys067InCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx;
import com.cloudframe.app.ip343900.Ip343900Ctx.DoInitializeOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.OnsoilProcessOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.GetPaInfoOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.EstablishMqConnectionOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.OpenInputSys067OutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ProcessMainlineInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.OnsoilProcessInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ReadPmmFixUnloadFileInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.InsertTipapimTblOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.CloseInputSys067InCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.DisplayExecMsgsOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.TerminateOnErrorOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.TerminateOnErrorInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ProcessMainlineOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.DoInitializeInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.CloseInputSys067OutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.CloseDisconnectQInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.OpenPmmFixUnloadFileOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ClosePmmFixUnloadFileOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ClosePmmFixUnloadFileInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ip343900.Ip343900Ctx.GetRunCntrlFileInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.GetRunCntrlFileOutCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.InsertTipapimTblInCtx;
import com.cloudframe.app.ip343900.Ip343900Ctx.ReadPmmFixUnloadFileOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ip343900 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Ip343900Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ip343900Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-PROCESS-MAINLINE
     *
     * @return 
     */
    public ProcessMainlineOutCtx processMainline(ProcessMainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-DO-INITIALIZE
     *
     * @return 
     */
    public DoInitializeOutCtx doInitialize(DoInitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-DISPLAY-EXEC-MSGS
     *
     * @return 
     */
    public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-OPEN-PMM-FIX-UNLOAD-FILE
     *
     * @return 
     */
    public OpenPmmFixUnloadFileOutCtx openPmmFixUnloadFile(OpenPmmFixUnloadFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-GET-RUN-CNTRL-FILE
     *
     * @return 
     */
    public GetRunCntrlFileOutCtx getRunCntrlFile(GetRunCntrlFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1350-OPEN-READ-SYS067-INFILE
     *
     */
    public void openReadSys067Infile(Ip343900Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1351-OPEN-INPUT-SYS067
     *
     * @return 
     */
    public OpenInputSys067OutCtx openInputSys067(OpenInputSys067InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1352-READ-INPUT-SYS067
     *
     * @return 
     */
    public ReadInputSys067OutCtx readInputSys067(ReadInputSys067InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1353-CLOSE-INPUT-SYS067
     *
     * @return 
     */
    public CloseInputSys067OutCtx closeInputSys067(CloseInputSys067InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-GET-PA-INFO
     *
     * @return 
     */
    public GetPaInfoOutCtx getPaInfo(GetPaInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-ESTABLISH-MQ-CONNECTION
     *
     * @return 
     */
    public EstablishMqConnectionOutCtx establishMqConnection(EstablishMqConnectionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-DO-PROCESS
     *
     * @return 
     */
    public DoProcessOutCtx doProcess(DoProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-INSERT-TIPAPIM-TBL
     *
     * @return 
     */
    public InsertTipapimTblOutCtx insertTipapimTbl(InsertTipapimTblInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-ONSOIL-PROCESS
     *
     * @return 
     */
    public OnsoilProcessOutCtx onsoilProcess(OnsoilProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-CLOSE-PMM-FIX-UNLOAD-FILE
     *
     * @return 
     */
    public ClosePmmFixUnloadFileOutCtx closePmmFixUnloadFile(ClosePmmFixUnloadFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-CLOSE-DISCONNECT-Q
     *
     * @return 
     */
    public CloseDisconnectQOutCtx closeDisconnectQ(CloseDisconnectQInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-READ-PMM-FIX-UNLOAD-FILE
     *
     * @return 
     */
    public ReadPmmFixUnloadFileOutCtx readPmmFixUnloadFile(ReadPmmFixUnloadFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-TERMINATE-ON-ERROR
     *
     * @return 
     */
    public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception;


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
