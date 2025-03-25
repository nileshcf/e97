package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.ClosePolPlanCsrInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.ClosePolPlanCsrOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.CloseSaOiCsrInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.CloseSaOiCsrOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.FetchPolPlanCsrInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.FetchPolPlanCsrOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.FetchSaOiCsrInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.FetchSaOiCsrOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.InitializeOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.MainlineInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.MainlineOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.MoveReqToDclgenInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.MoveReqToDclgenOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.MovesForErrorLogInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.MovesForErrorLogOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.OpenPolPlanCsrInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.OpenPolPlanCsrOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.OpenSaOiCsrInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.OpenSaOiCsrOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.ProcessPolPlanTliInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.ProcessPolPlanTliOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.ProcessSaOiTliInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.ProcessSaOiTliOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.RequestFieldValidationInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.RequestFieldValidationOutCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.SqlErrorProcessInCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.SqlErrorProcessOutCtx;

public interface D5427tli {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return return code of program
   */
  public int setParameter(D5427tliCtx programCtx, String parm, String parm2) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(D5427tliCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(D5427tliCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE SECTION
   *
   * @return
   */
  public InitializeOutCtx initialize(D5427tliCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1500-REQUEST-FIELD-VALIDATION SECTION
   *
   * @return
   */
  public RequestFieldValidationOutCtx requestFieldValidation(RequestFieldValidationInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1600-MOVE-REQ-TO-DCLGEN SECTION
   *
   * @return
   */
  public MoveReqToDclgenOutCtx moveReqToDclgen(MoveReqToDclgenInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-PROCESS-POL-PLAN-TLI SECTION
   *
   * @return
   */
  public ProcessPolPlanTliOutCtx processPolPlanTli(ProcessPolPlanTliInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2100-OPEN-POL-PLAN-CSR SECTION
   *
   * @return
   */
  public OpenPolPlanCsrOutCtx openPolPlanCsr(OpenPolPlanCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2200-FETCH-POL-PLAN-CSR SECTION
   *
   * @return
   */
  public FetchPolPlanCsrOutCtx fetchPolPlanCsr(FetchPolPlanCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2300-CLOSE-POL-PLAN-CSR SECTION
   *
   * @return
   */
  public ClosePolPlanCsrOutCtx closePolPlanCsr(ClosePolPlanCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-PROCESS-SA-OI-TLI SECTION
   *
   * @return
   */
  public ProcessSaOiTliOutCtx processSaOiTli(ProcessSaOiTliInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3100-OPEN-SA-OI-CSR SECTION
   *
   * @return
   */
  public OpenSaOiCsrOutCtx openSaOiCsr(OpenSaOiCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3200-FETCH-SA-OI-CSR SECTION
   *
   * @return
   */
  public FetchSaOiCsrOutCtx fetchSaOiCsr(FetchSaOiCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3300-CLOSE-SA-OI-CSR SECTION
   *
   * @return
   */
  public CloseSaOiCsrOutCtx closeSaOiCsr(CloseSaOiCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7777-MOVES-FOR-ERROR-LOG SECTION
   *
   * @return
   */
  public MovesForErrorLogOutCtx movesForErrorLog(MovesForErrorLogInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9999-SQL-ERROR-PROCESS SECTION
   *
   * @return
   */
  public SqlErrorProcessOutCtx sqlErrorProcess(SqlErrorProcessInCtx methodIn) throws Exception;

  /**
   * This will invoke the program given parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

  /**
   * This will invoke the program given Field parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
