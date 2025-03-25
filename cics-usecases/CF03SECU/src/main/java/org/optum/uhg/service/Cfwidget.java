package org.optum.uhg.service;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.FetchCursorOutCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.HousekeepingOutCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.InitializeInCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.InitializeOutCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.MainInCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.MainOutCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.SqlErrChkInCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.SqlErrChkOutCtx;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.SqlmainInCtx;

public interface Cfwidget {
  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(CfwidgetCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAIN
   *
   * @return
   */
  public MainOutCtx main(MainInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE
   *
   * @return
   */
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1200-FETCH-CURSOR
   *
   * @return
   */
  public FetchCursorOutCtx fetchCursor(CfwidgetCtx programCtx) throws Exception;

  /** This method is derived from Cobol Paragraph - 2000-SQLMAIN */
  public void sqlmain(SqlmainInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-HOUSEKEEPING
   *
   * @return
   */
  public HousekeepingOutCtx housekeeping(CfwidgetCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9999-SQL-ERR-CHK
   *
   * @return
   */
  public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception;

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
