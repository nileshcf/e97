package org.optum.uhg.service;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import org.optum.uhg.dto.cics0012.Cics0012Ctx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.CountryRequestInCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.CountryRequestOutCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.CurrencyRequestInCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.CurrencyRequestOutCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.IndustryRequestInCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.IndustryRequestOutCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.IsinRequestInCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.IsinRequestOutCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.MainlineInCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.MainlineOutCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.SectorRequestInCtx;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.SectorRequestOutCtx;

public interface Cics0012 {

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(Cics0012Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0001-ISIN-REQUEST
   *
   * @return
   */
  public IsinRequestOutCtx isinRequest(IsinRequestInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0002-COUNTRY-REQUEST
   *
   * @return
   */
  public CountryRequestOutCtx countryRequest(CountryRequestInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0003-CURRENCY-REQUEST
   *
   * @return
   */
  public CurrencyRequestOutCtx currencyRequest(CurrencyRequestInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0004-INDUSTRY-REQUEST
   *
   * @return
   */
  public IndustryRequestOutCtx industryRequest(IndustryRequestInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0005-SECTOR-REQUEST
   *
   * @return
   */
  public SectorRequestOutCtx sectorRequest(SectorRequestInCtx methodIn) throws Exception;

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
