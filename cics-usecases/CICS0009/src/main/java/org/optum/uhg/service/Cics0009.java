package org.optum.uhg.service;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import org.optum.uhg.dto.cics0009.Cics0009Ctx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.MainlineInCtx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.MainlineOutCtx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.PutRequest0002InCtx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.PutRequest0002OutCtx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.PutRequest0003InCtx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.PutRequest0003OutCtx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.PutRequestInCtx;
import org.optum.uhg.dto.cics0009.Cics0009Ctx.PutRequestOutCtx;

public interface Cics0009 {
  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(Cics0009Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0001-PUT-REQUEST
   *
   * @return
   */
  public PutRequestOutCtx putRequest(PutRequestInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0002-PUT-REQUEST
   *
   * @return
   */
  public PutRequest0002OutCtx putRequest0002(PutRequest0002InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0003-PUT-REQUEST
   *
   * @return
   */
  public PutRequest0003OutCtx putRequest0003(PutRequest0003InCtx methodIn) throws Exception;

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
