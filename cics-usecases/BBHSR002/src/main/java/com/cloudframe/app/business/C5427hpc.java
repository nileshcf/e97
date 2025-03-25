package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.MainlineInCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.MainlineOutCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCache1500InCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCache1500OutCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCache2000InCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCache2000OutCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCache3000InCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCache3000OutCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCacheInCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.ProcessCacheOutCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.SearchCache5100InCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.SearchCache5100OutCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.SearchCacheInCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.SearchCacheOutCtx;
import com.cloudframe.app.rest.c5427hpc.Dfhcommarea;

public interface C5427hpc {
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
  public int process(C5427hpcCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(C5427hpcCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-PROCESS-CACHE
   *
   * @return
   */
  public ProcessCacheOutCtx processCache(ProcessCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1500-PROCESS-CACHE
   *
   * @return
   */
  public ProcessCache1500OutCtx processCache1500(ProcessCache1500InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-PROCESS-CACHE
   *
   * @return
   */
  public ProcessCache2000OutCtx processCache2000(ProcessCache2000InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-PROCESS-CACHE
   *
   * @return
   */
  public ProcessCache3000OutCtx processCache3000(ProcessCache3000InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5000-SEARCH-CACHE
   *
   * @return
   */
  public SearchCacheOutCtx searchCache(SearchCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5100-SEARCH-CACHE
   *
   * @return
   */
  public SearchCache5100OutCtx searchCache5100(SearchCache5100InCtx methodIn) throws Exception;

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
