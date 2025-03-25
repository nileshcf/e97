package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.AbendCicsInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.AbendDb2InCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.AbendInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.AbendOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.BuildCacheInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.BuildCacheOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.CheckCacheDataAreaInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.CheckCacheDataAreaOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.DisplayCacheInfoInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.DisplayCacheInfoOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ExitInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ExitOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.FetchC1InCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.FetchC1OutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.Format9910InCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.Format9910OutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.FormatInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.FormatOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.FreeCacheInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.FreeCacheOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.GetStorageForCacheInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.GetStorageForCacheOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.LoadCacheAreasInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.LoadCacheAreasOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.LoadDataCacheInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.LoadDataCacheOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.MainlineInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.MainlineOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.RetrieveIntervalInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.RetrieveIntervalOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.WriteCacheTsqInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.WriteCacheTsqOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzaGetDiagInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzaGetDiagOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzbGetConnInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzbGetConnOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzcGetStmtInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzcGetStmtOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzdGetCondInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzdGetCondOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzeOrdTokenInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzeOrdTokenOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzfDisplayInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzfDisplayOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzgFormatSqlcaInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzgFormatSqlcaOutCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzhPrintSqlcaInCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.ZzzhPrintSqlcaOutCtx;
import com.cloudframe.app.rest.dphpctsq.DfhcommareaGroup;

public interface Dphpctsq {
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
  public int process(DphpctsqCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-EXIT
   *
   * @return
   */
  public ExitOutCtx exit(ExitInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1500-FREE-CACHE
   *
   * @return
   */
  public FreeCacheOutCtx freeCache(FreeCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-BUILD-CACHE
   *
   * @return
   */
  public BuildCacheOutCtx buildCache(BuildCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4000-FETCH-C1
   *
   * @return
   */
  public FetchC1OutCtx fetchC1(FetchC1InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-GET-STORAGE-FOR-CACHE
   *
   * @return
   */
  public GetStorageForCacheOutCtx getStorageForCache(GetStorageForCacheInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5000-LOAD-CACHE-AREAS
   *
   * @return
   */
  public LoadCacheAreasOutCtx loadCacheAreas(LoadCacheAreasInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5100-CHECK-CACHE-DATA-AREA
   *
   * @return
   */
  public CheckCacheDataAreaOutCtx checkCacheDataArea(CheckCacheDataAreaInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5200-LOAD-DATA-CACHE
   *
   * @return
   */
  public LoadDataCacheOutCtx loadDataCache(LoadDataCacheInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 6000-WRITE-CACHE-TSQ
   *
   * @return
   */
  public WriteCacheTsqOutCtx writeCacheTsq(WriteCacheTsqInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7000-DISPLAY-CACHE-INFO
   *
   * @return
   */
  public DisplayCacheInfoOutCtx displayCacheInfo(DisplayCacheInfoInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8000-RETRIEVE-INTERVAL
   *
   * @return
   */
  public RetrieveIntervalOutCtx retrieveInterval(RetrieveIntervalInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 9800-ABEND-CICS */
  public void abendCics(AbendCicsInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9810-FORMAT
   *
   * @return
   */
  public FormatOutCtx format(FormatInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 9900-ABEND-DB2 */
  public void abendDb2(AbendDb2InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9910-FORMAT
   *
   * @return
   */
  public Format9910OutCtx format9910(Format9910InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9999-ABEND
   *
   * @return
   */
  public AbendOutCtx abend(AbendInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZA-GET-DIAG
   *
   * @return
   */
  public ZzzaGetDiagOutCtx zzzaGetDiag(ZzzaGetDiagInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZB-GET-CONN
   *
   * @return
   */
  public ZzzbGetConnOutCtx zzzbGetConn(ZzzbGetConnInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZC-GET-STMT
   *
   * @return
   */
  public ZzzcGetStmtOutCtx zzzcGetStmt(ZzzcGetStmtInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZD-GET-COND
   *
   * @return
   */
  public ZzzdGetCondOutCtx zzzdGetCond(ZzzdGetCondInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZE-ORD-TOKEN
   *
   * @return
   */
  public ZzzeOrdTokenOutCtx zzzeOrdToken(ZzzeOrdTokenInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZG-FORMAT-SQLCA
   *
   * @return
   */
  public ZzzgFormatSqlcaOutCtx zzzgFormatSqlca(ZzzgFormatSqlcaInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZH-PRINT-SQLCA
   *
   * @return
   */
  public ZzzhPrintSqlcaOutCtx zzzhPrintSqlca(ZzzhPrintSqlcaInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - ZZZF-DISPLAY
   *
   * @return
   */
  public ZzzfDisplayOutCtx zzzfDisplay(ZzzfDisplayInCtx methodIn) throws Exception;

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
