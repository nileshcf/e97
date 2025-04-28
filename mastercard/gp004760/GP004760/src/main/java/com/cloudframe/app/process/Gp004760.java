package com.cloudframe.app.process;

import com.cloudframe.app.gp004760.Gp004760Ctx.CabextOutfileProcessOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.InitializationOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.ProcessCabtccextInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.OpenSys201FileOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CabextOutfileProcessInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.OpenSys201FileInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CloseSys201FileInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CloseSys201FileOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CabtccextCsrOpenInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CabtccextCsrFetchOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CabtccextCsrCloseInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.WriteSys201FileOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CloseSys202FileOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.Db2ErrorHandlingInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.OpenSys202FileInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.OpenSys202FileOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.WriteSys202FileInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.TerminationInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.WriteSys202FileOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CabtccextCsrCloseOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx;
import com.cloudframe.app.gp004760.Gp004760Ctx.WriteSys201FileInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.gp004760.Gp004760Ctx.CabtccextCsrOpenOutCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.AbendParaInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.Db2ErrorHandlingOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.gp004760.Gp004760Ctx.CabtccextCsrFetchInCtx;
import com.cloudframe.app.gp004760.Gp004760Ctx.CloseSys202FileInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Gp004760 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Gp004760Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE-PROCESS
     *
     */
    public void mainlineProcess(Gp004760Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZATION
     *
     * @return 
     */
    public InitializationOutCtx initialization(Gp004760Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-OPEN-SYS201-FILE
     *
     * @return 
     */
    public OpenSys201FileOutCtx openSys201File(OpenSys201FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1101-OPEN-SYS202-FILE
     *
     * @return 
     */
    public OpenSys202FileOutCtx openSys202File(OpenSys202FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-CABTCCEXT
     *
     */
    public void processCabtccext(ProcessCabtccextInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-CABTCCEXT-CSR-OPEN
     *
     * @return 
     */
    public CabtccextCsrOpenOutCtx cabtccextCsrOpen(CabtccextCsrOpenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-CABTCCEXT-CSR-FETCH
     *
     * @return 
     */
    public CabtccextCsrFetchOutCtx cabtccextCsrFetch(CabtccextCsrFetchInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2500-CABEXT-OUTFILE-PROCESS
     *
     * @return 
     */
    public CabextOutfileProcessOutCtx cabextOutfileProcess(CabextOutfileProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2900-WRITE-SYS201-FILE
     *
     * @return 
     */
    public WriteSys201FileOutCtx writeSys201File(WriteSys201FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2901-WRITE-SYS202-FILE
     *
     * @return 
     */
    public WriteSys202FileOutCtx writeSys202File(WriteSys202FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-CABTCCEXT-CSR-CLOSE
     *
     * @return 
     */
    public CabtccextCsrCloseOutCtx cabtccextCsrClose(CabtccextCsrCloseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-FINALIZE
     *
     */
    public void finalize3000(Gp004760Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2950-CLOSE-SYS201-FILE
     *
     * @return 
     */
    public CloseSys201FileOutCtx closeSys201File(CloseSys201FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2951-CLOSE-SYS202-FILE
     *
     * @return 
     */
    public CloseSys202FileOutCtx closeSys202File(CloseSys202FileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9300-DB2-ERROR-HANDLING
     *
     * @return 
     */
    public Db2ErrorHandlingOutCtx db2ErrorHandling(Db2ErrorHandlingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-ABEND-PARA
     *
     */
    public void abendPara(AbendParaInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9900-TERMINATION
     *
     */
    public void termination(TerminationInCtx methodIn) throws Exception;


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
