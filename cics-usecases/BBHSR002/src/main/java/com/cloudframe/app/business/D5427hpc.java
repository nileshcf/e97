package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseGenericCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseGenericCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseGroupCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseGroupCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseHipaaAllCsrInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseHipaaAllCsrOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseListCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.CloseListCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ExplicitDataInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ExplicitDataOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchGenericCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchGenericCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchGroupCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchGroupCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchHipaaAllCsrInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchHipaaAllCsrOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchListCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.FetchListCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.InitializeOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.MainLineInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.MainLineOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.MovesForErrorLogInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.MovesForErrorLogOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenGenericCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenGenericCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenGroupCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenGroupCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenHipaaAllCsrInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenHipaaAllCsrOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenListCursorInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.OpenListCursorOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessAllHipaaInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessAllHipaaOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessExplicitInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessExplicitListInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessExplicitListOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessExplicitOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessGenericInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.ProcessGenericOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.RequestFieldValidationInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.RequestFieldValidationOutCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.SqlErrorProcessInCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.SqlErrorProcessOutCtx;

public interface D5427hpc {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return return code of program
   */
  public int setParameter(D5427hpcCtx programCtx, String parm, String parm2) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(D5427hpcCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAIN-LINE SECTION
   *
   * @return
   */
  public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(D5427hpcCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE SECTION
   *
   * @return
   */
  public InitializeOutCtx initialize(D5427hpcCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1500-REQUEST-FIELD-VALIDATION SECTION
   *
   * @return
   */
  public RequestFieldValidationOutCtx requestFieldValidation(RequestFieldValidationInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-PROCESS-GENERIC SECTION
   *
   * @return
   */
  public ProcessGenericOutCtx processGeneric(ProcessGenericInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2100-OPEN-GENERIC-CURSOR SECTION
   *
   * @return
   */
  public OpenGenericCursorOutCtx openGenericCursor(OpenGenericCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2200-FETCH-GENERIC-CURSOR SECTION
   *
   * @return
   */
  public FetchGenericCursorOutCtx fetchGenericCursor(FetchGenericCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2300-CLOSE-GENERIC-CURSOR SECTION
   *
   * @return
   */
  public CloseGenericCursorOutCtx closeGenericCursor(CloseGenericCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-PROCESS-EXPLICIT SECTION
   *
   * @return
   */
  public ProcessExplicitOutCtx processExplicit(ProcessExplicitInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3100-OPEN-GROUP-CURSOR SECTION
   *
   * @return
   */
  public OpenGroupCursorOutCtx openGroupCursor(OpenGroupCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3200-FETCH-GROUP-CURSOR SECTION
   *
   * @return
   */
  public FetchGroupCursorOutCtx fetchGroupCursor(FetchGroupCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3300-CLOSE-GROUP-CURSOR SECTION
   *
   * @return
   */
  public CloseGroupCursorOutCtx closeGroupCursor(CloseGroupCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4000-EXPLICIT-DATA SECTION
   *
   * @return
   */
  public ExplicitDataOutCtx explicitData(ExplicitDataInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3001-PROCESS-EXPLICIT-LIST SECTION
   *
   * @return
   */
  public ProcessExplicitListOutCtx processExplicitList(ProcessExplicitListInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3101-OPEN-LIST-CURSOR SECTION
   *
   * @return
   */
  public OpenListCursorOutCtx openListCursor(OpenListCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3201-FETCH-LIST-CURSOR SECTION
   *
   * @return
   */
  public FetchListCursorOutCtx fetchListCursor(FetchListCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3301-CLOSE-LIST-CURSOR SECTION
   *
   * @return
   */
  public CloseListCursorOutCtx closeListCursor(CloseListCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5000-PROCESS-ALL-HIPAA SECTION
   *
   * @return
   */
  public ProcessAllHipaaOutCtx processAllHipaa(ProcessAllHipaaInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5100-OPEN-HIPAA-ALL-CSR SECTION
   *
   * @return
   */
  public OpenHipaaAllCsrOutCtx openHipaaAllCsr(OpenHipaaAllCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5200-FETCH-HIPAA-ALL-CSR SECTION
   *
   * @return
   */
  public FetchHipaaAllCsrOutCtx fetchHipaaAllCsr(FetchHipaaAllCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5300-CLOSE-HIPAA-ALL-CSR SECTION
   *
   * @return
   */
  public CloseHipaaAllCsrOutCtx closeHipaaAllCsr(CloseHipaaAllCsrInCtx methodIn) throws Exception;

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
