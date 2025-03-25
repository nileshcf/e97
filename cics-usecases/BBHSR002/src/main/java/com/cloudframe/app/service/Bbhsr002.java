package com.cloudframe.app.service;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.AcquireDataArea9961InCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.CheckHippaCdAfInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.CheckHippaCdAfOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.CreateAfHipaaSectInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.CreateAfHipaaSectOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.CreatePosSectInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.CreatePosSectOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.DetermineNOSvcIndInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.DetermineNOSvcIndOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.FreeDataArea9962InCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetHipaaBenefitsInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetHipaaBenefitsOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetPolicyInfoInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetPolicyInfoOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetStorageInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetStorageOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetSvcCdNbrInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.GetSvcCdNbrOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.HsrProcessingInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.InitializationInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.InitializationOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.LoadHipaaCodesInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.LoadHipaaCodesOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.MainlineInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.MainlineOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.MoveBhiFieldsInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.MoveBhiFieldsOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ProcessCombSvcMethodInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ProcessCombSvcMethodOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ProcessNewSvcMethodInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ProcessNewSvcMethodOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ProcessOldSvcMethodInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ProcessOldSvcMethodOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ReadNewSviTablesInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ReadNewSviTablesOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.SetCovIndInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.SetCovIndOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.SetFlagsInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.SetFlagsOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.SetFmaErrTbl9000InCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.SetFmaErrTbl9000OutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.TerminationInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.TerminationOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.TliProcessInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.TliProcessOutCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ValidateInputAreaInCtx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.ValidateInputAreaOutCtx;

public interface Bbhsr002 {
  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(Bbhsr002Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(Bbhsr002Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZATION SECTION
   *
   * @return
   */
  public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-VALIDATE-INPUT-AREA SECTION
   *
   * @return
   */
  public ValidateInputAreaOutCtx validateInputArea(ValidateInputAreaInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2100-GET-STORAGE SECTION
   *
   * @return
   */
  public GetStorageOutCtx getStorage(GetStorageInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 3000-HSR-PROCESSING SECTION */
  public void hsrProcessing(HsrProcessingInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3100-LOAD-HIPAA-CODES SECTION
   *
   * @return
   */
  public LoadHipaaCodesOutCtx loadHipaaCodes(LoadHipaaCodesInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3200-GET-POLICY-INFO SECTION
   *
   * @return
   */
  public GetPolicyInfoOutCtx getPolicyInfo(GetPolicyInfoInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3300-DETERMINE-N-O-SVC-IND SECTION
   *
   * @return
   */
  public DetermineNOSvcIndOutCtx determineNOSvcInd(DetermineNOSvcIndInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3400-PROCESS-NEW-SVC-METHOD SECTION
   *
   * @return
   */
  public ProcessNewSvcMethodOutCtx processNewSvcMethod(ProcessNewSvcMethodInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3500-PROCESS-COMB-SVC-METHOD SECTION
   *
   * @return
   */
  public ProcessCombSvcMethodOutCtx processCombSvcMethod(ProcessCombSvcMethodInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3600-PROCESS-OLD-SVC-METHOD SECTION
   *
   * @return
   */
  public ProcessOldSvcMethodOutCtx processOldSvcMethod(ProcessOldSvcMethodInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3700-SET-FLAGS SECTION
   *
   * @return
   */
  public SetFlagsOutCtx setFlags(SetFlagsInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3800-SET-COV-IND SECTION
   *
   * @return
   */
  public SetCovIndOutCtx setCovInd(SetCovIndInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3900-READ-NEW-SVI-TABLES SECTION
   *
   * @return
   */
  public ReadNewSviTablesOutCtx readNewSviTables(ReadNewSviTablesInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4000-GET-HIPAA-BENEFITS SECTION
   *
   * @return
   */
  public GetHipaaBenefitsOutCtx getHipaaBenefits(GetHipaaBenefitsInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4001-CHECK-HIPPA-CD-AF SECTION
   *
   * @return
   */
  public CheckHippaCdAfOutCtx checkHippaCdAf(CheckHippaCdAfInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4100-MOVE-BHI-FIELDS SECTION
   *
   * @return
   */
  public MoveBhiFieldsOutCtx moveBhiFields(MoveBhiFieldsInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5000-GET-SVC-CD-NBR SECTION
   *
   * @return
   */
  public GetSvcCdNbrOutCtx getSvcCdNbr(GetSvcCdNbrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 6000-TLI-PROCESS SECTION
   *
   * @return
   */
  public TliProcessOutCtx tliProcess(TliProcessInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7000-CREATE-AF-HIPAA-SECT SECTION
   *
   * @return
   */
  public CreateAfHipaaSectOutCtx createAfHipaaSect(CreateAfHipaaSectInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8000-CREATE-POS-SECT SECTION
   *
   * @return
   */
  public CreatePosSectOutCtx createPosSect(CreatePosSectInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9999-TERMINATION SECTION
   *
   * @return
   */
  public TerminationOutCtx termination(TerminationInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - SET-FMA-ERR-TBL-9000 SECTION
   *
   * @return
   */
  public SetFmaErrTbl9000OutCtx setFmaErrTbl9000(SetFmaErrTbl9000InCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - ACQUIRE-DATA-AREA-9961 SECTION */
  public void acquireDataArea9961(AcquireDataArea9961InCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - FREE-DATA-AREA-9962 SECTION */
  public void freeDataArea9962(FreeDataArea9962InCtx methodIn) throws Exception;

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
