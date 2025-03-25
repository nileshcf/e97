package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx.MainlineInCtx;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx.MainlineOutCtx;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx.ProcessCacheInCtx;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx.ProcessCacheOutCtx;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx.SearchCacheInCtx;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx.SearchCacheOutCtx;
import com.cloudframe.app.rest.c5427bhi.Dfhcommarea;

public interface C5427bhi {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return Commarea from program
   */
  public Dfhcommarea setCommarea(Dfhcommarea inputCommarea) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(C5427bhiCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(C5427bhiCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1500-PROCESS-CACHE
   *
   * @return
   */
  public ProcessCacheOutCtx processCache(ProcessCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5000-SEARCH-CACHE
   *
   * @return
   */
  public SearchCacheOutCtx searchCache(SearchCacheInCtx methodIn) throws Exception;

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
