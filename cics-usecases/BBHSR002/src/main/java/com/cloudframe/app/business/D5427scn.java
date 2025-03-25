package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.ErrorProcessInCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.ErrorProcessOutCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.GetSvcCdNbrInCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.GetSvcCdNbrOutCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.InitializeInCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.InitializeOutCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.MainLineInCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.MainLineOutCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.ProcessCacheInCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.ProcessCacheOutCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.SearchCacheInCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.SearchCacheOutCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.SqlErrorProcessInCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.SqlErrorProcessOutCtx;
import com.cloudframe.app.rest.d5427scn.DfhcommareaGroup;

public interface D5427scn {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return Commarea from program
   */
  public DfhcommareaGroup setCommarea(DfhcommareaGroup inputCommarea) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(D5427scnCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAIN-LINE SECTION
   *
   * @return
   */
  public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(D5427scnCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE SECTION
   *
   * @return
   */
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-GET-SVC-CD-NBR SECTION
   *
   * @return
   */
  public GetSvcCdNbrOutCtx getSvcCdNbr(GetSvcCdNbrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3100-PROCESS-CACHE SECTION
   *
   * @return
   */
  public ProcessCacheOutCtx processCache(ProcessCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3200-SEARCH-CACHE SECTION
   *
   * @return
   */
  public SearchCacheOutCtx searchCache(SearchCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7777-ERROR-PROCESS SECTION
   *
   * @return
   */
  public ErrorProcessOutCtx errorProcess(ErrorProcessInCtx methodIn) throws Exception;

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
