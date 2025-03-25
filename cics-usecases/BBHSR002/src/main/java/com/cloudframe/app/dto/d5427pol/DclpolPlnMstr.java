package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstr is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclpolPlnMstr extends DclpolPlnMstrSerialized {

  private char[] mmiCovTypCd = Field.fillLowValue(1);

  private char[] mmiPolNbr = Field.fillLowValue(6);

  private char[] mmiPlnNbr = Field.fillLowValue(4);

  private char[] mmiClssNbr = Field.fillLowValue(4);

  private char[] mmiObsolete = Field.fillLowValue(6);

  private char[] mmiSlotTblId = Field.fillLowValue(6);

  private char[] mmiObligId = Field.fillLowValue(2);

  private char[] mmiShrArngCd = Field.fillLowValue(2);

  private char[] mmiRcprctyTblId = Field.fillLowValue(6);

  private char[] mmiNewOldSrvcInd = Field.fillLowValue(1);

  private int mmiCopayVarId;

  private char[] mmiLstUpdtDttm = Field.fillLowValue(26);

  private char[] mmiLstUpdtId = Field.fillLowValue(9);

  private char[] mmiAllncCd = Field.fillLowValue(1);

  private char[] mmiBenMaxCombPriCd = Field.fillLowValue(1);

  private short mmiBenMaxCombPriCnt;

  private char[] mmiBenMaxCombSecCd = Field.fillLowValue(1);

  private short mmiBenMaxCombSecCnt;

  private char[] mmiBenMaxCrdcRehabPriCd = Field.fillLowValue(1);

  private short mmiBenMaxCrdcRehabPriCnt;

  private char[] mmiBenMaxCrdcRehabSecCd = Field.fillLowValue(1);

  private short mmiBenMaxCrdcRehabSecCnt;

  private char[] mmiBenMaxOcpTrpyPriCd = Field.fillLowValue(1);

  private short mmiBenMaxOcpTrpyPriCnt;

  private char[] mmiBenMaxOcpTrpySecCd = Field.fillLowValue(1);

  private short mmiBenMaxOcpTrpySecCnt;

  private char[] mmiBenMaxPhOcSpchPriCd = Field.fillLowValue(1);

  private short mmiBenMaxPhOcSpchPriCnt;

  private char[] mmiBenMaxPhOcSpchSecCd = Field.fillLowValue(1);

  private short mmiBenMaxPhOcSpchSecCnt;

  private char[] mmiBenMaxPhOcTrpyPriCd = Field.fillLowValue(1);

  private short mmiBenMaxPhOcTrpyPriCnt;

  private char[] mmiBenMaxPhOcTrpySecCd = Field.fillLowValue(1);

  private short mmiBenMaxPhOcTrpySecCnt;

  private char[] mmiBenMaxPhysTrpyPriCd = Field.fillLowValue(1);

  private short mmiBenMaxPhysTrpyPriCnt;

  private char[] mmiBenMaxPhysTrpySecCd = Field.fillLowValue(1);

  private short mmiBenMaxPhysTrpySecCnt;

  private short mmiBenMaxPlmryRehbPriCnt;

  private char[] mmiBenMaxSpchTrpyPriCd = Field.fillLowValue(1);

  private short mmiBenMaxSpchTrpyPriCnt;

  private char[] mmiBenMaxSpchTrpySecCd = Field.fillLowValue(1);

  private short mmiBenMaxSpchTrpySecCnt;

  private char[] mmiBenMaxSpneMnipPriCd = Field.fillLowValue(1);

  private short mmiBenMaxSpneMnipPriCnt;

  private char[] mmiBenMaxSpneMnipSecCd = Field.fillLowValue(1);

  private short mmiBenMaxSpneMnipSecCnt;

  private char[] mmiCancDt = Field.fillLowValue(10);

  private char[] mmiCareMgtInd = Field.fillLowValue(1);

  private char[] mmiChrpNtwkInd = Field.fillLowValue(1);

  private char[] mmiClmAutoDenyInd = Field.fillLowValue(1);

  private char[] mmiCoinsCopayCd = Field.fillLowValue(2);

  private char[] mmiCombPrscDedPriCd = Field.fillLowValue(1);

  private char[] mmiCombPrscDedQualCd = Field.fillLowValue(1);

  private char[] mmiCombPrscDedSecCd = Field.fillLowValue(1);

  private char[] mmiCombPrscDedTirCd = Field.fillLowValue(1);

  private char[] mmiContrStCd = Field.fillLowValue(2);

  private BigDecimal mmiCopayAmt = BigDecimal.ZERO;

  private BigDecimal mmiCopayMaxAnnlAmt = BigDecimal.ZERO;

  private char[] mmiCopayWaivTblId = Field.fillLowValue(6);

  private char[] mmiDiagVsSurgInd = Field.fillLowValue(1);

  private char[] mmiDolTlrInd = Field.fillLowValue(1);

  private char[] mmiDsesStTblNbr = Field.fillLowValue(6);

  private char[] mmiEffDt = Field.fillLowValue(10);

  private char[] mmiEmrgParsNtfyInd = Field.fillLowValue(1);

  private char[] mmiEmrgParsNtfyPrdCd = Field.fillLowValue(1);

  private char[] mmiEvdBasDialgInd = Field.fillLowValue(1);

  private char[] mmiEciTblId = Field.fillLowValue(6);

  private char[] mmiEviTblId = Field.fillLowValue(6);

  private short mmiFamMbrCnt;

  private int mmiFamNewCoinsAmt;

  private char[] mmiFamTxtSwapCd = Field.fillLowValue(1);

  private char[] mmiFertCtrcptvCd = Field.fillLowValue(1);

  private char[] mmiObsolete2 = Field.fillLowValue(2);

  private char[] mmiHiDedPlnCd = Field.fillLowValue(2);

  private char[] mmiIplanTypCd = Field.fillLowValue(1);

  private int mmiLftmMaxAmt;

  private char[] mmiMbrNtwkKeyMtchCd = Field.fillLowValue(1);

  private char[] mmiMbrPrdctCd = Field.fillLowValue(6);

  private char[] mmiMbrPrdctTypCd = Field.fillLowValue(3);

  private char[] mmiMnrpCd = Field.fillLowValue(1);

  private short mmiMnrpPct;

  private char[] mmiMntlUbhCd = Field.fillLowValue(2);

  private int mmiNewCoinsAmt;

  private char[] mmiNewCoinsCombPrscCd = Field.fillLowValue(1);

  private char[] mmiNewCoinsPrdCd = Field.fillLowValue(1);

  private BigDecimal mmiNewCoinsSalFamMultFct = BigDecimal.ZERO;

  private char[] mmiNewCoinsSalFamTypCd = Field.fillLowValue(1);

  private char[] mmiNewCoinsSalIndvTypCd = Field.fillLowValue(1);

  private char[] mmiNoblxLabInd = Field.fillLowValue(1);

  private char[] mmiNonEmbdDedCd = Field.fillLowValue(1);

  private char[] mmiNonEmrgInd = Field.fillLowValue(1);

  private char[] mmiNtfyCrdcEpInd = Field.fillLowValue(1);

  private BigDecimal mmiNtwkPcpCopayAmt = BigDecimal.ZERO;

  private char[] mmiObgynPcpCopayInd = Field.fillLowValue(1);

  private char[] mmiOfcVstMaxRmrkCd = Field.fillLowValue(3);

  private int mmiOopCombEeChrgAmt;

  private int mmiOopCombEePls1Amt;

  private int mmiOopCombEeSpoAmt;

  private int mmiOopCombFamAmt;

  private int mmiOopCombIndvAmt;

  private char[] mmiOopCombNbrCd = Field.fillLowValue(1);

  private char[] mmiOopCombPrscCd = Field.fillLowValue(1);

  private int mmiOopInNtwkEeChrgAmt;

  private int mmiOopInNtwkEePls1Amt;

  private int mmiOopInNtwkEeSpoAmt;

  private char[] mmiOopUrgntCareCd = Field.fillLowValue(1);

  private char[] mmiOthrRmrkCd = Field.fillLowValue(3);

  private char[] mmiParsMnlProcInd = Field.fillLowValue(1);

  private BigDecimal mmiParsOopLmtAmt = BigDecimal.ZERO;

  private short mmiParsSurgSchedNbr;

  private char[] mmiPayLocCd = Field.fillLowValue(3);

  private char[] mmiPcpCopayCd = Field.fillLowValue(1);

  private char[] mmiPcpSpecCoinsInd = Field.fillLowValue(1);

  private char[] mmiPhysMedcnPrdCd = Field.fillLowValue(1);

  private char[] mmiPolTypCd = Field.fillLowValue(2);

  private char[] mmiPpoInd = Field.fillLowValue(1);

  private char[] mmiPpoMinEmrgInd = Field.fillLowValue(1);

  private char[] mmiPpoPmntCd = Field.fillLowValue(2);

  private char[] mmiPrdctKeyCd = Field.fillLowValue(3);

  private char[] mmiPrortEvntTypCd = Field.fillLowValue(1);

  private char[] mmiPrortIntrvlFreqCd = Field.fillLowValue(1);

  private int mmiPsyCyrCnfmMaxAmt;

  private int mmiPsyCyrCombPrscMaxAmt;

  private int mmiPsyCyrNonCnfmMaxAmt;

  private int mmiPsyLftmCnfmMaxAmt;

  private int mmiPsyLftmCombPrscMaxAmt;

  private int mmiPsyLftmNonCnfmMaxAmt;

  private char[] mmiRapl3TierInd = Field.fillLowValue(1);

  private char[] mmiRhapsodyCopayCd = Field.fillLowValue(1);

  private short mmiRhapsodyCopayDayCnt;

  private char[] mmiRmrkCd = Field.fillLowValue(3);

  private char[] mmiRmrkSpineManipCd = Field.fillLowValue(3);

  private char[] mmiSpclProc1Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc2Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc3Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc4Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc5Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc6Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc7Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc8Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc9Cd = Field.fillLowValue(1);

  private char[] mmiSpclProc10Cd = Field.fillLowValue(1);

  private char[] mmiSrvcCatgyTblId = Field.fillLowValue(3);

  private char[] mmiSrvcCdNSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdPSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdTSetInd = Field.fillLowValue(1);

  private char[] mmiSviTblPriNbr = Field.fillLowValue(6);

  private char[] mmiTierLblInd = Field.fillLowValue(1);

  private BigDecimal mmiTier1CopayAmt = BigDecimal.ZERO;

  private int mmiTier1FamNewCoinsAmt;

  private int mmiTier1LftmMaxAmt;

  private int mmiTier1NewCoinsAmt;

  private BigDecimal mmiTier1UrgntCareAmt = BigDecimal.ZERO;

  private char[] mmiTier1UrgntCareOopCd = Field.fillLowValue(1);

  private int mmiTravBenMktNbr;

  private int mmiTravBenTblNbr;

  private char[] mmiUhpCd = Field.fillLowValue(1);

  private BigDecimal mmiUrgntCareAmt = BigDecimal.ZERO;

  private short mmiVarPrdFct;

  private char[] mmiXtraTerrStMandInd = Field.fillLowValue(1);

  private char[] mmiRsnCustyPrdCd = Field.fillLowValue(1);

  private BigDecimal mmiDfltChrgPct = BigDecimal.ZERO;

  private char[] mmiFaclShrSvCd = Field.fillLowValue(1);

  private char[] mmiPhysnShrSvCd = Field.fillLowValue(1);

  private char[] mmiCptnXclsInd = Field.fillLowValue(1);

  private char[] mmiObsolete1 = Field.fillLowValue(4);

  private char[] mmiNewCoinsAccumCd = Field.fillLowValue(1);

  private char[] mmiErisaInd = Field.fillLowValue(1);

  private char[] mmiBhvHlthVendCd = Field.fillLowValue(1);

  private char[] mmiEapVendCd = Field.fillLowValue(1);

  private char[] mmiVisnCd = Field.fillLowValue(1);

  private char[] mmiFaclClmEdtInd = Field.fillLowValue(1);

  private char[] mmiPlnFturCd = Field.fillLowValue(2);

  private char[] mmiFundTypCd = Field.fillLowValue(1);

  private char[] mmiRxSbscrIdTypCd = Field.fillLowValue(1);

  private char[] mmiPrdctCdId = Field.fillLowValue(4);

  private char[] mmiEnrpEmrgFaclInd = Field.fillLowValue(1);

  private char[] mmiEmergentWrpInd = Field.fillLowValue(1);

  private char[] mmiOopMaxCovCd = Field.fillLowValue(1);

  private char[] mmiOncPolPrtcpCd = Field.fillLowValue(1);

  private char[] mmiPlnFturInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdASetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdBSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdCSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdDSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdESetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdFSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdGSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdHSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdISetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdJSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdKSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdLSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdMSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdOSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdQSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdRSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdSSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdUSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdVSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdWSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdXSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdYSetInd = Field.fillLowValue(1);

  private char[] mmiSrvcCdZSetInd = Field.fillLowValue(1);

  private char[] mmiNonEmbdCopayCd = Field.fillLowValue(1);

  private char[] mmiNonEmbdCoreOopCd = Field.fillLowValue(1);

  private char[] mmiNewCoinsDedTypCd = Field.fillLowValue(1);

  private BigDecimal mmiNewCoinsIndvMinPct = BigDecimal.ZERO;

  private BigDecimal mmiNewCoinsIndvMaxPct = BigDecimal.ZERO;

  private char[] mmiNonEmbdNewCoinsCd = Field.fillLowValue(1);

  private char[] mmiNonEmbdCoreDedCd = Field.fillLowValue(1);

  private char[] mmiIndvOopCd = Field.fillLowValue(1);

  private char[] mmiIndvPrdCd = Field.fillLowValue(1);

  private char[] mmiIndvSalryTypCd = Field.fillLowValue(1);

  private char[] mmiFamSalryTypCd = Field.fillLowValue(1);

  private BigDecimal mmiFamMultPct = BigDecimal.ZERO;

  private char[] mmiFamVal = Field.fillLowValue(1);

  private char[] mmiXapplyOopCd = Field.fillLowValue(1);

  private char[] mmiIndvCopayCaroCd = Field.fillLowValue(1);

  private char[] mmiXapplyCopayCd = Field.fillLowValue(1);

  private char[] mmiCoreOopNcapInd = Field.fillLowValue(1);

  private BigDecimal mmiMnnrpLabPct = BigDecimal.ZERO;

  private BigDecimal mmiMnnrpDmePct = BigDecimal.ZERO;

  private int mmiOonLftmMaxAmt;

  private char[] mmiBusSegPltfm = Field.fillLowValue(3);

  private char[] mmiSviTblTerNbr = Field.fillLowValue(6);

  private char[] mmiRelSrvcInd = Field.fillLowValue(1);

  private char[] mmiCoreMedPrrAuthCd = Field.fillLowValue(1);

  private char[] mmiPcpBenLvlRule = Field.fillLowValue(1);

  private char[] mmiMcrCd = Field.fillLowValue(1);

  private char[] mmiLmtSrvcCd = Field.fillLowValue(1);

  private char[] mmiEligXrefCd = Field.fillLowValue(1);

  private char[] mmiBenMaxAuralCiPriCd = Field.fillLowValue(1);

  private short mmiBenMaxAuralCiPriCnt;

  private char[] mmiBenMaxAuralCiSecCd = Field.fillLowValue(1);

  private short mmiBenMaxAuralCiSecCnt;

  private char[] mmiBenMaxCogTrpyPriCd = Field.fillLowValue(1);

  private short mmiBenMaxCogTrpyPriCnt;

  private char[] mmiBenMaxCogTrpySecCd = Field.fillLowValue(1);

  private short mmiBenMaxCogTrpySecCnt;

  private char[] mmiBenMaxCogTrpyExclCd = Field.fillLowValue(1);

  private short mmiBenMaxEhbSpneRhabCnt;

  private short mmiBenMaxEhbSpneHabCnt;

  private short mmiBenMaxEhbPtRhabCnt;

  private short mmiBenMaxEhbPtHabCnt;

  private short mmiBenMaxEhbSpchRhabCnt;

  private short mmiBenMaxEhbSpchHabCnt;

  private short mmiBenMaxEhbCrdcRhabCnt;

  private short mmiBenMaxEhbOtRhabCnt;

  private short mmiBenMaxEhbOtHabCnt;

  private short mmiBenMaxEhbPlmryRhabCnt;

  private short mmiBenMaxEhbAuralRhabCnt;

  private short mmiBenMaxEhbAuralHabCnt;

  private short mmiBenMaxEhbCogRhabCnt;

  private short mmiBenMaxEhbCogHabCnt;

  private short mmiBenMaxEhbPostRhabCnt;

  private short mmiBenMaxEhbPostHabCnt;

  private short mmiBenMaxEhbPtotRhabCnt;

  private short mmiBenMaxEhbPtotHabCnt;

  private char[] mmiBenMaxEhbRhabRmrkCd = Field.fillLowValue(3);

  private short mmiBenMaxEhbPosmRhabCnt;

  private short mmiBenMaxEhbPosmHabCnt;

  private char[] mmiBenMaxEhbHabRmrkCd = Field.fillLowValue(3);

  private char[] mmiBenPhysMedcnPrdCd = Field.fillLowValue(1);

  private short mmiBenAutsmAgeYrFrVal;

  private short mmiBenAutsmAgeYrToVal;

  private char[] mmiBenAutsmPostCd = Field.fillLowValue(1);

  private char[] mmiBenAutsmAllCd = Field.fillLowValue(1);

  private char[] mmiBenMaxPlmryRehbPriCd = Field.fillLowValue(1);

  private char[] mmiBenMaxPlmryRehbSecCd = Field.fillLowValue(1);

  private short mmiBenMaxPlmryRehbSecCnt;

  private char[] mmiSiteSrvcPrtcpCd = Field.fillLowValue(1);

  private short mmiBenAutsm2AgeYrFrVal;

  private short mmiBenAutsm2AgeYrToVal;

  private char[] mmiBenAutsm2PostCd = Field.fillLowValue(1);

  private char[] mmiBenAutsm2AllCd = Field.fillLowValue(1);

  /** Constructor for DclpolPlnMstr */
  public DclpolPlnMstr() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of mmiCovTypCd
   *
   * @return mmiCovTypCd
   */
  public char[] getMmiCovTypCd() throws CFException {
    if (isMmiCovTypCdModified()) {
      mmiCovTypCd = refreshMmiCovTypCd();
    }
    return mmiCovTypCd;
  }

  /**
   * set variable mmiCovTypCd Corresponding COBOL Variable is MMI-COV-TYP-CD
   *
   * @param value
   */
  public void setMmiCovTypCd(char[] value) {
    mmiCovTypCd = checkMmiCovTypCdConstraints(value);
    serializeMmiCovTypCd(mmiCovTypCd);
  }

  /**
   * Update MmiCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiCovTypCd, mmiCovTypCd.length);
  }

  public void setMmiCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCovTypCd, mmiCovTypCd.length);
  }

  /**
   * Update MmiCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiCovTypCd with another Field
   *
   * @param value
   */
  public void setMmiCovTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiCovTypCd, MMI_COV_TYP_CD_LEN);
  }

  /**
   * Update MmiCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCovTypCd, MMI_COV_TYP_CD_LEN);
  }

  /**
   * Update MmiCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPolNbr
   *
   * @return mmiPolNbr
   */
  public char[] getMmiPolNbr() throws CFException {
    if (isMmiPolNbrModified()) {
      mmiPolNbr = refreshMmiPolNbr();
    }
    return mmiPolNbr;
  }

  /**
   * set variable mmiPolNbr Corresponding COBOL Variable is MMI-POL-NBR
   *
   * @param value
   */
  public void setMmiPolNbr(char[] value) {
    mmiPolNbr = checkMmiPolNbrConstraints(value);
    serializeMmiPolNbr(mmiPolNbr);
  }

  /**
   * Update MmiPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPolNbr, mmiPolNbr.length);
  }

  public void setMmiPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolNbr, mmiPolNbr.length);
  }

  /**
   * Update MmiPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolNbr + targetIndex, targetLen);
  }

  /**
   * Update MmiPolNbr with another Field
   *
   * @param value
   */
  public void setMmiPolNbr(Field source) {
    replace(source, 0, source.length(), beginMmiPolNbr, MMI_POL_NBR_LEN);
  }

  /**
   * Update MmiPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolNbr, MMI_POL_NBR_LEN);
  }

  /**
   * Update MmiPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPlnNbr
   *
   * @return mmiPlnNbr
   */
  public char[] getMmiPlnNbr() throws CFException {
    if (isMmiPlnNbrModified()) {
      mmiPlnNbr = refreshMmiPlnNbr();
    }
    return mmiPlnNbr;
  }

  /**
   * set variable mmiPlnNbr Corresponding COBOL Variable is MMI-PLN-NBR
   *
   * @param value
   */
  public void setMmiPlnNbr(char[] value) {
    mmiPlnNbr = checkMmiPlnNbrConstraints(value);
    serializeMmiPlnNbr(mmiPlnNbr);
  }

  /**
   * Update MmiPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPlnNbr, mmiPlnNbr.length);
  }

  public void setMmiPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnNbr, mmiPlnNbr.length);
  }

  /**
   * Update MmiPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update MmiPlnNbr with another Field
   *
   * @param value
   */
  public void setMmiPlnNbr(Field source) {
    replace(source, 0, source.length(), beginMmiPlnNbr, MMI_PLN_NBR_LEN);
  }

  /**
   * Update MmiPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnNbr, MMI_PLN_NBR_LEN);
  }

  /**
   * Update MmiPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiClssNbr
   *
   * @return mmiClssNbr
   */
  public char[] getMmiClssNbr() throws CFException {
    if (isMmiClssNbrModified()) {
      mmiClssNbr = refreshMmiClssNbr();
    }
    return mmiClssNbr;
  }

  /**
   * set variable mmiClssNbr Corresponding COBOL Variable is MMI-CLSS-NBR
   *
   * @param value
   */
  public void setMmiClssNbr(char[] value) {
    mmiClssNbr = checkMmiClssNbrConstraints(value);
    serializeMmiClssNbr(mmiClssNbr);
  }

  /**
   * Update MmiClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiClssNbr, mmiClssNbr.length);
  }

  public void setMmiClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClssNbr, mmiClssNbr.length);
  }

  /**
   * Update MmiClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClssNbr + targetIndex, targetLen);
  }

  /**
   * Update MmiClssNbr with another Field
   *
   * @param value
   */
  public void setMmiClssNbr(Field source) {
    replace(source, 0, source.length(), beginMmiClssNbr, MMI_CLSS_NBR_LEN);
  }

  /**
   * Update MmiClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClssNbr, MMI_CLSS_NBR_LEN);
  }

  /**
   * Update MmiClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiObsolete
   *
   * @return mmiObsolete
   */
  public char[] getMmiObsolete() throws CFException {
    if (isMmiObsoleteModified()) {
      mmiObsolete = refreshMmiObsolete();
    }
    return mmiObsolete;
  }

  /**
   * set variable mmiObsolete Corresponding COBOL Variable is MMI-OBSOLETE
   *
   * @param value
   */
  public void setMmiObsolete(char[] value) {
    mmiObsolete = checkMmiObsoleteConstraints(value);
    serializeMmiObsolete(mmiObsolete);
  }

  /**
   * Update MmiObsolete with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiObsolete(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiObsolete, mmiObsolete.length);
  }

  public void setMmiObsolete(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete, mmiObsolete.length);
  }

  /**
   * Update MmiObsolete with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObsolete(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete + targetIndex, targetLen);
  }

  /**
   * Update MmiObsolete with another Field
   *
   * @param value
   */
  public void setMmiObsolete(Field source) {
    replace(source, 0, source.length(), beginMmiObsolete, MMI_OBSOLETE_LEN);
  }

  /**
   * Update MmiObsolete with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiObsolete(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete, MMI_OBSOLETE_LEN);
  }

  /**
   * Update MmiObsolete with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObsolete(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSlotTblId
   *
   * @return mmiSlotTblId
   */
  public char[] getMmiSlotTblId() throws CFException {
    if (isMmiSlotTblIdModified()) {
      mmiSlotTblId = refreshMmiSlotTblId();
    }
    return mmiSlotTblId;
  }

  /**
   * set variable mmiSlotTblId Corresponding COBOL Variable is MMI-SLOT-TBL-ID
   *
   * @param value
   */
  public void setMmiSlotTblId(char[] value) {
    mmiSlotTblId = checkMmiSlotTblIdConstraints(value);
    serializeMmiSlotTblId(mmiSlotTblId);
  }

  /**
   * Update MmiSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSlotTblId, mmiSlotTblId.length);
  }

  public void setMmiSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSlotTblId, mmiSlotTblId.length);
  }

  /**
   * Update MmiSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update MmiSlotTblId with another Field
   *
   * @param value
   */
  public void setMmiSlotTblId(Field source) {
    replace(source, 0, source.length(), beginMmiSlotTblId, MMI_SLOT_TBL_ID_LEN);
  }

  /**
   * Update MmiSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSlotTblId, MMI_SLOT_TBL_ID_LEN);
  }

  /**
   * Update MmiSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiObligId
   *
   * @return mmiObligId
   */
  public char[] getMmiObligId() throws CFException {
    if (isMmiObligIdModified()) {
      mmiObligId = refreshMmiObligId();
    }
    return mmiObligId;
  }

  /**
   * set variable mmiObligId Corresponding COBOL Variable is MMI-OBLIG-ID
   *
   * @param value
   */
  public void setMmiObligId(char[] value) {
    mmiObligId = checkMmiObligIdConstraints(value);
    serializeMmiObligId(mmiObligId);
  }

  /**
   * Update MmiObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiObligId, mmiObligId.length);
  }

  public void setMmiObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObligId, mmiObligId.length);
  }

  /**
   * Update MmiObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObligId + targetIndex, targetLen);
  }

  /**
   * Update MmiObligId with another Field
   *
   * @param value
   */
  public void setMmiObligId(Field source) {
    replace(source, 0, source.length(), beginMmiObligId, MMI_OBLIG_ID_LEN);
  }

  /**
   * Update MmiObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObligId, MMI_OBLIG_ID_LEN);
  }

  /**
   * Update MmiObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiShrArngCd
   *
   * @return mmiShrArngCd
   */
  public char[] getMmiShrArngCd() throws CFException {
    if (isMmiShrArngCdModified()) {
      mmiShrArngCd = refreshMmiShrArngCd();
    }
    return mmiShrArngCd;
  }

  /**
   * set variable mmiShrArngCd Corresponding COBOL Variable is MMI-SHR-ARNG-CD
   *
   * @param value
   */
  public void setMmiShrArngCd(char[] value) {
    mmiShrArngCd = checkMmiShrArngCdConstraints(value);
    serializeMmiShrArngCd(mmiShrArngCd);
  }

  /**
   * Update MmiShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiShrArngCd, mmiShrArngCd.length);
  }

  public void setMmiShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiShrArngCd, mmiShrArngCd.length);
  }

  /**
   * Update MmiShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update MmiShrArngCd with another Field
   *
   * @param value
   */
  public void setMmiShrArngCd(Field source) {
    replace(source, 0, source.length(), beginMmiShrArngCd, MMI_SHR_ARNG_CD_LEN);
  }

  /**
   * Update MmiShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiShrArngCd, MMI_SHR_ARNG_CD_LEN);
  }

  /**
   * Update MmiShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiRcprctyTblId
   *
   * @return mmiRcprctyTblId
   */
  public char[] getMmiRcprctyTblId() throws CFException {
    if (isMmiRcprctyTblIdModified()) {
      mmiRcprctyTblId = refreshMmiRcprctyTblId();
    }
    return mmiRcprctyTblId;
  }

  /**
   * set variable mmiRcprctyTblId Corresponding COBOL Variable is MMI-RCPRCTY-TBL-ID
   *
   * @param value
   */
  public void setMmiRcprctyTblId(char[] value) {
    mmiRcprctyTblId = checkMmiRcprctyTblIdConstraints(value);
    serializeMmiRcprctyTblId(mmiRcprctyTblId);
  }

  /**
   * Update MmiRcprctyTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRcprctyTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiRcprctyTblId, mmiRcprctyTblId.length);
  }

  public void setMmiRcprctyTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRcprctyTblId, mmiRcprctyTblId.length);
  }

  /**
   * Update MmiRcprctyTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRcprctyTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRcprctyTblId + targetIndex, targetLen);
  }

  /**
   * Update MmiRcprctyTblId with another Field
   *
   * @param value
   */
  public void setMmiRcprctyTblId(Field source) {
    replace(source, 0, source.length(), beginMmiRcprctyTblId, MMI_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update MmiRcprctyTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRcprctyTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRcprctyTblId, MMI_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update MmiRcprctyTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRcprctyTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRcprctyTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNewOldSrvcInd
   *
   * @return mmiNewOldSrvcInd
   */
  public char[] getMmiNewOldSrvcInd() throws CFException {
    if (isMmiNewOldSrvcIndModified()) {
      mmiNewOldSrvcInd = refreshMmiNewOldSrvcInd();
    }
    return mmiNewOldSrvcInd;
  }

  /**
   * set variable mmiNewOldSrvcInd Corresponding COBOL Variable is MMI-NEW-OLD-SRVC-IND
   *
   * @param value
   */
  public void setMmiNewOldSrvcInd(char[] value) {
    mmiNewOldSrvcInd = checkMmiNewOldSrvcIndConstraints(value);
    serializeMmiNewOldSrvcInd(mmiNewOldSrvcInd);
  }

  /**
   * Update MmiNewOldSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNewOldSrvcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNewOldSrvcInd, mmiNewOldSrvcInd.length);
  }

  public void setMmiNewOldSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewOldSrvcInd, mmiNewOldSrvcInd.length);
  }

  /**
   * Update MmiNewOldSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewOldSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewOldSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update MmiNewOldSrvcInd with another Field
   *
   * @param value
   */
  public void setMmiNewOldSrvcInd(Field source) {
    replace(source, 0, source.length(), beginMmiNewOldSrvcInd, MMI_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update MmiNewOldSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNewOldSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewOldSrvcInd, MMI_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update MmiNewOldSrvcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewOldSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewOldSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCopayVarId
   *
   * @return mmiCopayVarId
   */
  public int getMmiCopayVarId() throws CFException {
    if (isMmiCopayVarIdModified()) {
      mmiCopayVarId = refreshMmiCopayVarId();
    }
    return mmiCopayVarId;
  }

  /**
   * Update MmiCopayVarId with the passed value Corresponding COBOL Variable is MMI-COPAY-VAR-ID
   *
   * @param number
   */
  public void setMmiCopayVarId(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiCopayVarId = checkMmiCopayVarIdMaxLimit(number);
    serializeMmiCopayVarId(mmiCopayVarId);
  }

  public void setMmiCopayVarId(long number) {
    number = checkMmiCopayVarIdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiCopayVarId((int) number);
  }

  /**
   * Returns the value of mmiLstUpdtDttm
   *
   * @return mmiLstUpdtDttm
   */
  public char[] getMmiLstUpdtDttm() throws CFException {
    if (isMmiLstUpdtDttmModified()) {
      mmiLstUpdtDttm = refreshMmiLstUpdtDttm();
    }
    return mmiLstUpdtDttm;
  }

  /**
   * set variable mmiLstUpdtDttm Corresponding COBOL Variable is MMI-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setMmiLstUpdtDttm(char[] value) {
    mmiLstUpdtDttm = checkMmiLstUpdtDttmConstraints(value);
    serializeMmiLstUpdtDttm(mmiLstUpdtDttm);
  }

  /**
   * Update MmiLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiLstUpdtDttm, mmiLstUpdtDttm.length);
  }

  public void setMmiLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtDttm, mmiLstUpdtDttm.length);
  }

  /**
   * Update MmiLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update MmiLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setMmiLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginMmiLstUpdtDttm, MMI_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update MmiLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtDttm, MMI_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update MmiLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiLstUpdtId
   *
   * @return mmiLstUpdtId
   */
  public char[] getMmiLstUpdtId() throws CFException {
    if (isMmiLstUpdtIdModified()) {
      mmiLstUpdtId = refreshMmiLstUpdtId();
    }
    return mmiLstUpdtId;
  }

  /**
   * set variable mmiLstUpdtId Corresponding COBOL Variable is MMI-LST-UPDT-ID
   *
   * @param value
   */
  public void setMmiLstUpdtId(char[] value) {
    mmiLstUpdtId = checkMmiLstUpdtIdConstraints(value);
    serializeMmiLstUpdtId(mmiLstUpdtId);
  }

  /**
   * Update MmiLstUpdtId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiLstUpdtId, mmiLstUpdtId.length);
  }

  public void setMmiLstUpdtId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtId, mmiLstUpdtId.length);
  }

  /**
   * Update MmiLstUpdtId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtId + targetIndex, targetLen);
  }

  /**
   * Update MmiLstUpdtId with another Field
   *
   * @param value
   */
  public void setMmiLstUpdtId(Field source) {
    replace(source, 0, source.length(), beginMmiLstUpdtId, MMI_LST_UPDT_ID_LEN);
  }

  /**
   * Update MmiLstUpdtId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtId, MMI_LST_UPDT_ID_LEN);
  }

  /**
   * Update MmiLstUpdtId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiLstUpdtId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLstUpdtId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiAllncCd
   *
   * @return mmiAllncCd
   */
  public char[] getMmiAllncCd() throws CFException {
    if (isMmiAllncCdModified()) {
      mmiAllncCd = refreshMmiAllncCd();
    }
    return mmiAllncCd;
  }

  /**
   * set variable mmiAllncCd Corresponding COBOL Variable is MMI-ALLNC-CD
   *
   * @param value
   */
  public void setMmiAllncCd(char[] value) {
    mmiAllncCd = checkMmiAllncCdConstraints(value);
    serializeMmiAllncCd(mmiAllncCd);
  }

  /**
   * Update MmiAllncCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiAllncCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiAllncCd, mmiAllncCd.length);
  }

  public void setMmiAllncCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiAllncCd, mmiAllncCd.length);
  }

  /**
   * Update MmiAllncCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiAllncCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiAllncCd + targetIndex, targetLen);
  }

  /**
   * Update MmiAllncCd with another Field
   *
   * @param value
   */
  public void setMmiAllncCd(Field source) {
    replace(source, 0, source.length(), beginMmiAllncCd, MMI_ALLNC_CD_LEN);
  }

  /**
   * Update MmiAllncCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiAllncCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiAllncCd, MMI_ALLNC_CD_LEN);
  }

  /**
   * Update MmiAllncCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiAllncCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiAllncCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxCombPriCd
   *
   * @return mmiBenMaxCombPriCd
   */
  public char[] getMmiBenMaxCombPriCd() throws CFException {
    if (isMmiBenMaxCombPriCdModified()) {
      mmiBenMaxCombPriCd = refreshMmiBenMaxCombPriCd();
    }
    return mmiBenMaxCombPriCd;
  }

  /**
   * set variable mmiBenMaxCombPriCd Corresponding COBOL Variable is MMI-BEN-MAX-COMB-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxCombPriCd(char[] value) {
    mmiBenMaxCombPriCd = checkMmiBenMaxCombPriCdConstraints(value);
    serializeMmiBenMaxCombPriCd(mmiBenMaxCombPriCd);
  }

  /**
   * Update MmiBenMaxCombPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombPriCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBenMaxCombPriCd, mmiBenMaxCombPriCd.length);
  }

  public void setMmiBenMaxCombPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombPriCd, mmiBenMaxCombPriCd.length);
  }

  /**
   * Update MmiBenMaxCombPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxCombPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxCombPriCd(Field source) {
    replace(source, 0, source.length(), beginMmiBenMaxCombPriCd, MMI_BEN_MAX_COMB_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxCombPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombPriCd, MMI_BEN_MAX_COMB_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxCombPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxCombPriCnt
   *
   * @return mmiBenMaxCombPriCnt
   */
  public short getMmiBenMaxCombPriCnt() throws CFException {
    if (isMmiBenMaxCombPriCntModified()) {
      mmiBenMaxCombPriCnt = refreshMmiBenMaxCombPriCnt();
    }
    return mmiBenMaxCombPriCnt;
  }

  /**
   * Update MmiBenMaxCombPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-COMB-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxCombPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxCombPriCnt = checkMmiBenMaxCombPriCntMaxLimit(number);
    serializeMmiBenMaxCombPriCnt(mmiBenMaxCombPriCnt);
  }

  public void setMmiBenMaxCombPriCnt(int number) {
    number =
        checkMmiBenMaxCombPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCombPriCnt((short) number);
  }

  public void setMmiBenMaxCombPriCnt(long number) {
    number =
        checkMmiBenMaxCombPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCombPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxCombSecCd
   *
   * @return mmiBenMaxCombSecCd
   */
  public char[] getMmiBenMaxCombSecCd() throws CFException {
    if (isMmiBenMaxCombSecCdModified()) {
      mmiBenMaxCombSecCd = refreshMmiBenMaxCombSecCd();
    }
    return mmiBenMaxCombSecCd;
  }

  /**
   * set variable mmiBenMaxCombSecCd Corresponding COBOL Variable is MMI-BEN-MAX-COMB-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxCombSecCd(char[] value) {
    mmiBenMaxCombSecCd = checkMmiBenMaxCombSecCdConstraints(value);
    serializeMmiBenMaxCombSecCd(mmiBenMaxCombSecCd);
  }

  /**
   * Update MmiBenMaxCombSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombSecCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBenMaxCombSecCd, mmiBenMaxCombSecCd.length);
  }

  public void setMmiBenMaxCombSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombSecCd, mmiBenMaxCombSecCd.length);
  }

  /**
   * Update MmiBenMaxCombSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombSecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxCombSecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxCombSecCd(Field source) {
    replace(source, 0, source.length(), beginMmiBenMaxCombSecCd, MMI_BEN_MAX_COMB_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxCombSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombSecCd, MMI_BEN_MAX_COMB_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxCombSecCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCombSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCombSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxCombSecCnt
   *
   * @return mmiBenMaxCombSecCnt
   */
  public short getMmiBenMaxCombSecCnt() throws CFException {
    if (isMmiBenMaxCombSecCntModified()) {
      mmiBenMaxCombSecCnt = refreshMmiBenMaxCombSecCnt();
    }
    return mmiBenMaxCombSecCnt;
  }

  /**
   * Update MmiBenMaxCombSecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-COMB-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxCombSecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxCombSecCnt = checkMmiBenMaxCombSecCntMaxLimit(number);
    serializeMmiBenMaxCombSecCnt(mmiBenMaxCombSecCnt);
  }

  public void setMmiBenMaxCombSecCnt(int number) {
    number =
        checkMmiBenMaxCombSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCombSecCnt((short) number);
  }

  public void setMmiBenMaxCombSecCnt(long number) {
    number =
        checkMmiBenMaxCombSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCombSecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxCrdcRehabPriCd
   *
   * @return mmiBenMaxCrdcRehabPriCd
   */
  public char[] getMmiBenMaxCrdcRehabPriCd() throws CFException {
    if (isMmiBenMaxCrdcRehabPriCdModified()) {
      mmiBenMaxCrdcRehabPriCd = refreshMmiBenMaxCrdcRehabPriCd();
    }
    return mmiBenMaxCrdcRehabPriCd;
  }

  /**
   * set variable mmiBenMaxCrdcRehabPriCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-CRDC-REHAB-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabPriCd(char[] value) {
    mmiBenMaxCrdcRehabPriCd = checkMmiBenMaxCrdcRehabPriCdConstraints(value);
    serializeMmiBenMaxCrdcRehabPriCd(mmiBenMaxCrdcRehabPriCd);
  }

  /**
   * Update MmiBenMaxCrdcRehabPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxCrdcRehabPriCd,
        mmiBenMaxCrdcRehabPriCd.length);
  }

  public void setMmiBenMaxCrdcRehabPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxCrdcRehabPriCd,
        mmiBenMaxCrdcRehabPriCd.length);
  }

  /**
   * Update MmiBenMaxCrdcRehabPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCrdcRehabPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxCrdcRehabPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabPriCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginMmiBenMaxCrdcRehabPriCd,
        MMI_BEN_MAX_CRDC_REHAB_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxCrdcRehabPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxCrdcRehabPriCd,
        MMI_BEN_MAX_CRDC_REHAB_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxCrdcRehabPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCrdcRehabPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxCrdcRehabPriCnt
   *
   * @return mmiBenMaxCrdcRehabPriCnt
   */
  public short getMmiBenMaxCrdcRehabPriCnt() throws CFException {
    if (isMmiBenMaxCrdcRehabPriCntModified()) {
      mmiBenMaxCrdcRehabPriCnt = refreshMmiBenMaxCrdcRehabPriCnt();
    }
    return mmiBenMaxCrdcRehabPriCnt;
  }

  /**
   * Update MmiBenMaxCrdcRehabPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-CRDC-REHAB-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxCrdcRehabPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxCrdcRehabPriCnt = checkMmiBenMaxCrdcRehabPriCntMaxLimit(number);
    serializeMmiBenMaxCrdcRehabPriCnt(mmiBenMaxCrdcRehabPriCnt);
  }

  public void setMmiBenMaxCrdcRehabPriCnt(int number) {
    number =
        checkMmiBenMaxCrdcRehabPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCrdcRehabPriCnt((short) number);
  }

  public void setMmiBenMaxCrdcRehabPriCnt(long number) {
    number =
        checkMmiBenMaxCrdcRehabPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCrdcRehabPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxCrdcRehabSecCd
   *
   * @return mmiBenMaxCrdcRehabSecCd
   */
  public char[] getMmiBenMaxCrdcRehabSecCd() throws CFException {
    if (isMmiBenMaxCrdcRehabSecCdModified()) {
      mmiBenMaxCrdcRehabSecCd = refreshMmiBenMaxCrdcRehabSecCd();
    }
    return mmiBenMaxCrdcRehabSecCd;
  }

  /**
   * set variable mmiBenMaxCrdcRehabSecCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-CRDC-REHAB-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabSecCd(char[] value) {
    mmiBenMaxCrdcRehabSecCd = checkMmiBenMaxCrdcRehabSecCdConstraints(value);
    serializeMmiBenMaxCrdcRehabSecCd(mmiBenMaxCrdcRehabSecCd);
  }

  /**
   * Update MmiBenMaxCrdcRehabSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabSecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxCrdcRehabSecCd,
        mmiBenMaxCrdcRehabSecCd.length);
  }

  public void setMmiBenMaxCrdcRehabSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxCrdcRehabSecCd,
        mmiBenMaxCrdcRehabSecCd.length);
  }

  /**
   * Update MmiBenMaxCrdcRehabSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCrdcRehabSecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxCrdcRehabSecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabSecCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginMmiBenMaxCrdcRehabSecCd,
        MMI_BEN_MAX_CRDC_REHAB_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxCrdcRehabSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxCrdcRehabSecCd,
        MMI_BEN_MAX_CRDC_REHAB_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxCrdcRehabSecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxCrdcRehabSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCrdcRehabSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxCrdcRehabSecCnt
   *
   * @return mmiBenMaxCrdcRehabSecCnt
   */
  public short getMmiBenMaxCrdcRehabSecCnt() throws CFException {
    if (isMmiBenMaxCrdcRehabSecCntModified()) {
      mmiBenMaxCrdcRehabSecCnt = refreshMmiBenMaxCrdcRehabSecCnt();
    }
    return mmiBenMaxCrdcRehabSecCnt;
  }

  /**
   * Update MmiBenMaxCrdcRehabSecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-CRDC-REHAB-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxCrdcRehabSecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxCrdcRehabSecCnt = checkMmiBenMaxCrdcRehabSecCntMaxLimit(number);
    serializeMmiBenMaxCrdcRehabSecCnt(mmiBenMaxCrdcRehabSecCnt);
  }

  public void setMmiBenMaxCrdcRehabSecCnt(int number) {
    number =
        checkMmiBenMaxCrdcRehabSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCrdcRehabSecCnt((short) number);
  }

  public void setMmiBenMaxCrdcRehabSecCnt(long number) {
    number =
        checkMmiBenMaxCrdcRehabSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCrdcRehabSecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxOcpTrpyPriCd
   *
   * @return mmiBenMaxOcpTrpyPriCd
   */
  public char[] getMmiBenMaxOcpTrpyPriCd() throws CFException {
    if (isMmiBenMaxOcpTrpyPriCdModified()) {
      mmiBenMaxOcpTrpyPriCd = refreshMmiBenMaxOcpTrpyPriCd();
    }
    return mmiBenMaxOcpTrpyPriCd;
  }

  /**
   * set variable mmiBenMaxOcpTrpyPriCd Corresponding COBOL Variable is MMI-BEN-MAX-OCP-TRPY-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpyPriCd(char[] value) {
    mmiBenMaxOcpTrpyPriCd = checkMmiBenMaxOcpTrpyPriCdConstraints(value);
    serializeMmiBenMaxOcpTrpyPriCd(mmiBenMaxOcpTrpyPriCd);
  }

  /**
   * Update MmiBenMaxOcpTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpyPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxOcpTrpyPriCd,
        mmiBenMaxOcpTrpyPriCd.length);
  }

  public void setMmiBenMaxOcpTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxOcpTrpyPriCd, mmiBenMaxOcpTrpyPriCd.length);
  }

  /**
   * Update MmiBenMaxOcpTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxOcpTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxOcpTrpyPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpyPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxOcpTrpyPriCd, MMI_BEN_MAX_OCP_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxOcpTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxOcpTrpyPriCd,
        MMI_BEN_MAX_OCP_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxOcpTrpyPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxOcpTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxOcpTrpyPriCnt
   *
   * @return mmiBenMaxOcpTrpyPriCnt
   */
  public short getMmiBenMaxOcpTrpyPriCnt() throws CFException {
    if (isMmiBenMaxOcpTrpyPriCntModified()) {
      mmiBenMaxOcpTrpyPriCnt = refreshMmiBenMaxOcpTrpyPriCnt();
    }
    return mmiBenMaxOcpTrpyPriCnt;
  }

  /**
   * Update MmiBenMaxOcpTrpyPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-OCP-TRPY-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxOcpTrpyPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxOcpTrpyPriCnt = checkMmiBenMaxOcpTrpyPriCntMaxLimit(number);
    serializeMmiBenMaxOcpTrpyPriCnt(mmiBenMaxOcpTrpyPriCnt);
  }

  public void setMmiBenMaxOcpTrpyPriCnt(int number) {
    number =
        checkMmiBenMaxOcpTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxOcpTrpyPriCnt((short) number);
  }

  public void setMmiBenMaxOcpTrpyPriCnt(long number) {
    number =
        checkMmiBenMaxOcpTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxOcpTrpyPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxOcpTrpySecCd
   *
   * @return mmiBenMaxOcpTrpySecCd
   */
  public char[] getMmiBenMaxOcpTrpySecCd() throws CFException {
    if (isMmiBenMaxOcpTrpySecCdModified()) {
      mmiBenMaxOcpTrpySecCd = refreshMmiBenMaxOcpTrpySecCd();
    }
    return mmiBenMaxOcpTrpySecCd;
  }

  /**
   * set variable mmiBenMaxOcpTrpySecCd Corresponding COBOL Variable is MMI-BEN-MAX-OCP-TRPY-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpySecCd(char[] value) {
    mmiBenMaxOcpTrpySecCd = checkMmiBenMaxOcpTrpySecCdConstraints(value);
    serializeMmiBenMaxOcpTrpySecCd(mmiBenMaxOcpTrpySecCd);
  }

  /**
   * Update MmiBenMaxOcpTrpySecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpySecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxOcpTrpySecCd,
        mmiBenMaxOcpTrpySecCd.length);
  }

  public void setMmiBenMaxOcpTrpySecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxOcpTrpySecCd, mmiBenMaxOcpTrpySecCd.length);
  }

  /**
   * Update MmiBenMaxOcpTrpySecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpySecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxOcpTrpySecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxOcpTrpySecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpySecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxOcpTrpySecCd, MMI_BEN_MAX_OCP_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxOcpTrpySecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpySecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxOcpTrpySecCd,
        MMI_BEN_MAX_OCP_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxOcpTrpySecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxOcpTrpySecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxOcpTrpySecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxOcpTrpySecCnt
   *
   * @return mmiBenMaxOcpTrpySecCnt
   */
  public short getMmiBenMaxOcpTrpySecCnt() throws CFException {
    if (isMmiBenMaxOcpTrpySecCntModified()) {
      mmiBenMaxOcpTrpySecCnt = refreshMmiBenMaxOcpTrpySecCnt();
    }
    return mmiBenMaxOcpTrpySecCnt;
  }

  /**
   * Update MmiBenMaxOcpTrpySecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-OCP-TRPY-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxOcpTrpySecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxOcpTrpySecCnt = checkMmiBenMaxOcpTrpySecCntMaxLimit(number);
    serializeMmiBenMaxOcpTrpySecCnt(mmiBenMaxOcpTrpySecCnt);
  }

  public void setMmiBenMaxOcpTrpySecCnt(int number) {
    number =
        checkMmiBenMaxOcpTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxOcpTrpySecCnt((short) number);
  }

  public void setMmiBenMaxOcpTrpySecCnt(long number) {
    number =
        checkMmiBenMaxOcpTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxOcpTrpySecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxPhOcSpchPriCd
   *
   * @return mmiBenMaxPhOcSpchPriCd
   */
  public char[] getMmiBenMaxPhOcSpchPriCd() throws CFException {
    if (isMmiBenMaxPhOcSpchPriCdModified()) {
      mmiBenMaxPhOcSpchPriCd = refreshMmiBenMaxPhOcSpchPriCd();
    }
    return mmiBenMaxPhOcSpchPriCd;
  }

  /**
   * set variable mmiBenMaxPhOcSpchPriCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-SPCH-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchPriCd(char[] value) {
    mmiBenMaxPhOcSpchPriCd = checkMmiBenMaxPhOcSpchPriCdConstraints(value);
    serializeMmiBenMaxPhOcSpchPriCd(mmiBenMaxPhOcSpchPriCd);
  }

  /**
   * Update MmiBenMaxPhOcSpchPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPhOcSpchPriCd,
        mmiBenMaxPhOcSpchPriCd.length);
  }

  public void setMmiBenMaxPhOcSpchPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxPhOcSpchPriCd, mmiBenMaxPhOcSpchPriCd.length);
  }

  /**
   * Update MmiBenMaxPhOcSpchPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcSpchPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPhOcSpchPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxPhOcSpchPriCd, MMI_BEN_MAX_PH_OC_SPCH_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcSpchPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPhOcSpchPriCd,
        MMI_BEN_MAX_PH_OC_SPCH_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcSpchPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcSpchPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPhOcSpchPriCnt
   *
   * @return mmiBenMaxPhOcSpchPriCnt
   */
  public short getMmiBenMaxPhOcSpchPriCnt() throws CFException {
    if (isMmiBenMaxPhOcSpchPriCntModified()) {
      mmiBenMaxPhOcSpchPriCnt = refreshMmiBenMaxPhOcSpchPriCnt();
    }
    return mmiBenMaxPhOcSpchPriCnt;
  }

  /**
   * Update MmiBenMaxPhOcSpchPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-SPCH-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPhOcSpchPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPhOcSpchPriCnt = checkMmiBenMaxPhOcSpchPriCntMaxLimit(number);
    serializeMmiBenMaxPhOcSpchPriCnt(mmiBenMaxPhOcSpchPriCnt);
  }

  public void setMmiBenMaxPhOcSpchPriCnt(int number) {
    number =
        checkMmiBenMaxPhOcSpchPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcSpchPriCnt((short) number);
  }

  public void setMmiBenMaxPhOcSpchPriCnt(long number) {
    number =
        checkMmiBenMaxPhOcSpchPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcSpchPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxPhOcSpchSecCd
   *
   * @return mmiBenMaxPhOcSpchSecCd
   */
  public char[] getMmiBenMaxPhOcSpchSecCd() throws CFException {
    if (isMmiBenMaxPhOcSpchSecCdModified()) {
      mmiBenMaxPhOcSpchSecCd = refreshMmiBenMaxPhOcSpchSecCd();
    }
    return mmiBenMaxPhOcSpchSecCd;
  }

  /**
   * set variable mmiBenMaxPhOcSpchSecCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-SPCH-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchSecCd(char[] value) {
    mmiBenMaxPhOcSpchSecCd = checkMmiBenMaxPhOcSpchSecCdConstraints(value);
    serializeMmiBenMaxPhOcSpchSecCd(mmiBenMaxPhOcSpchSecCd);
  }

  /**
   * Update MmiBenMaxPhOcSpchSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchSecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPhOcSpchSecCd,
        mmiBenMaxPhOcSpchSecCd.length);
  }

  public void setMmiBenMaxPhOcSpchSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxPhOcSpchSecCd, mmiBenMaxPhOcSpchSecCd.length);
  }

  /**
   * Update MmiBenMaxPhOcSpchSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcSpchSecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPhOcSpchSecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchSecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxPhOcSpchSecCd, MMI_BEN_MAX_PH_OC_SPCH_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcSpchSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPhOcSpchSecCd,
        MMI_BEN_MAX_PH_OC_SPCH_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcSpchSecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcSpchSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcSpchSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPhOcSpchSecCnt
   *
   * @return mmiBenMaxPhOcSpchSecCnt
   */
  public short getMmiBenMaxPhOcSpchSecCnt() throws CFException {
    if (isMmiBenMaxPhOcSpchSecCntModified()) {
      mmiBenMaxPhOcSpchSecCnt = refreshMmiBenMaxPhOcSpchSecCnt();
    }
    return mmiBenMaxPhOcSpchSecCnt;
  }

  /**
   * Update MmiBenMaxPhOcSpchSecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-SPCH-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPhOcSpchSecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPhOcSpchSecCnt = checkMmiBenMaxPhOcSpchSecCntMaxLimit(number);
    serializeMmiBenMaxPhOcSpchSecCnt(mmiBenMaxPhOcSpchSecCnt);
  }

  public void setMmiBenMaxPhOcSpchSecCnt(int number) {
    number =
        checkMmiBenMaxPhOcSpchSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcSpchSecCnt((short) number);
  }

  public void setMmiBenMaxPhOcSpchSecCnt(long number) {
    number =
        checkMmiBenMaxPhOcSpchSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcSpchSecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxPhOcTrpyPriCd
   *
   * @return mmiBenMaxPhOcTrpyPriCd
   */
  public char[] getMmiBenMaxPhOcTrpyPriCd() throws CFException {
    if (isMmiBenMaxPhOcTrpyPriCdModified()) {
      mmiBenMaxPhOcTrpyPriCd = refreshMmiBenMaxPhOcTrpyPriCd();
    }
    return mmiBenMaxPhOcTrpyPriCd;
  }

  /**
   * set variable mmiBenMaxPhOcTrpyPriCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-TRPY-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpyPriCd(char[] value) {
    mmiBenMaxPhOcTrpyPriCd = checkMmiBenMaxPhOcTrpyPriCdConstraints(value);
    serializeMmiBenMaxPhOcTrpyPriCd(mmiBenMaxPhOcTrpyPriCd);
  }

  /**
   * Update MmiBenMaxPhOcTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpyPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPhOcTrpyPriCd,
        mmiBenMaxPhOcTrpyPriCd.length);
  }

  public void setMmiBenMaxPhOcTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxPhOcTrpyPriCd, mmiBenMaxPhOcTrpyPriCd.length);
  }

  /**
   * Update MmiBenMaxPhOcTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPhOcTrpyPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpyPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxPhOcTrpyPriCd, MMI_BEN_MAX_PH_OC_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPhOcTrpyPriCd,
        MMI_BEN_MAX_PH_OC_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcTrpyPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPhOcTrpyPriCnt
   *
   * @return mmiBenMaxPhOcTrpyPriCnt
   */
  public short getMmiBenMaxPhOcTrpyPriCnt() throws CFException {
    if (isMmiBenMaxPhOcTrpyPriCntModified()) {
      mmiBenMaxPhOcTrpyPriCnt = refreshMmiBenMaxPhOcTrpyPriCnt();
    }
    return mmiBenMaxPhOcTrpyPriCnt;
  }

  /**
   * Update MmiBenMaxPhOcTrpyPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-TRPY-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPhOcTrpyPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPhOcTrpyPriCnt = checkMmiBenMaxPhOcTrpyPriCntMaxLimit(number);
    serializeMmiBenMaxPhOcTrpyPriCnt(mmiBenMaxPhOcTrpyPriCnt);
  }

  public void setMmiBenMaxPhOcTrpyPriCnt(int number) {
    number =
        checkMmiBenMaxPhOcTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcTrpyPriCnt((short) number);
  }

  public void setMmiBenMaxPhOcTrpyPriCnt(long number) {
    number =
        checkMmiBenMaxPhOcTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcTrpyPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxPhOcTrpySecCd
   *
   * @return mmiBenMaxPhOcTrpySecCd
   */
  public char[] getMmiBenMaxPhOcTrpySecCd() throws CFException {
    if (isMmiBenMaxPhOcTrpySecCdModified()) {
      mmiBenMaxPhOcTrpySecCd = refreshMmiBenMaxPhOcTrpySecCd();
    }
    return mmiBenMaxPhOcTrpySecCd;
  }

  /**
   * set variable mmiBenMaxPhOcTrpySecCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-TRPY-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpySecCd(char[] value) {
    mmiBenMaxPhOcTrpySecCd = checkMmiBenMaxPhOcTrpySecCdConstraints(value);
    serializeMmiBenMaxPhOcTrpySecCd(mmiBenMaxPhOcTrpySecCd);
  }

  /**
   * Update MmiBenMaxPhOcTrpySecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpySecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPhOcTrpySecCd,
        mmiBenMaxPhOcTrpySecCd.length);
  }

  public void setMmiBenMaxPhOcTrpySecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxPhOcTrpySecCd, mmiBenMaxPhOcTrpySecCd.length);
  }

  /**
   * Update MmiBenMaxPhOcTrpySecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpySecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcTrpySecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPhOcTrpySecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpySecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxPhOcTrpySecCd, MMI_BEN_MAX_PH_OC_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcTrpySecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpySecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPhOcTrpySecCd,
        MMI_BEN_MAX_PH_OC_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhOcTrpySecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPhOcTrpySecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhOcTrpySecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPhOcTrpySecCnt
   *
   * @return mmiBenMaxPhOcTrpySecCnt
   */
  public short getMmiBenMaxPhOcTrpySecCnt() throws CFException {
    if (isMmiBenMaxPhOcTrpySecCntModified()) {
      mmiBenMaxPhOcTrpySecCnt = refreshMmiBenMaxPhOcTrpySecCnt();
    }
    return mmiBenMaxPhOcTrpySecCnt;
  }

  /**
   * Update MmiBenMaxPhOcTrpySecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PH-OC-TRPY-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPhOcTrpySecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPhOcTrpySecCnt = checkMmiBenMaxPhOcTrpySecCntMaxLimit(number);
    serializeMmiBenMaxPhOcTrpySecCnt(mmiBenMaxPhOcTrpySecCnt);
  }

  public void setMmiBenMaxPhOcTrpySecCnt(int number) {
    number =
        checkMmiBenMaxPhOcTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcTrpySecCnt((short) number);
  }

  public void setMmiBenMaxPhOcTrpySecCnt(long number) {
    number =
        checkMmiBenMaxPhOcTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhOcTrpySecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxPhysTrpyPriCd
   *
   * @return mmiBenMaxPhysTrpyPriCd
   */
  public char[] getMmiBenMaxPhysTrpyPriCd() throws CFException {
    if (isMmiBenMaxPhysTrpyPriCdModified()) {
      mmiBenMaxPhysTrpyPriCd = refreshMmiBenMaxPhysTrpyPriCd();
    }
    return mmiBenMaxPhysTrpyPriCd;
  }

  /**
   * set variable mmiBenMaxPhysTrpyPriCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PHYS-TRPY-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpyPriCd(char[] value) {
    mmiBenMaxPhysTrpyPriCd = checkMmiBenMaxPhysTrpyPriCdConstraints(value);
    serializeMmiBenMaxPhysTrpyPriCd(mmiBenMaxPhysTrpyPriCd);
  }

  /**
   * Update MmiBenMaxPhysTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpyPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPhysTrpyPriCd,
        mmiBenMaxPhysTrpyPriCd.length);
  }

  public void setMmiBenMaxPhysTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxPhysTrpyPriCd, mmiBenMaxPhysTrpyPriCd.length);
  }

  /**
   * Update MmiBenMaxPhysTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhysTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPhysTrpyPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpyPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxPhysTrpyPriCd, MMI_BEN_MAX_PHYS_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhysTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPhysTrpyPriCd,
        MMI_BEN_MAX_PHYS_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhysTrpyPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhysTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPhysTrpyPriCnt
   *
   * @return mmiBenMaxPhysTrpyPriCnt
   */
  public short getMmiBenMaxPhysTrpyPriCnt() throws CFException {
    if (isMmiBenMaxPhysTrpyPriCntModified()) {
      mmiBenMaxPhysTrpyPriCnt = refreshMmiBenMaxPhysTrpyPriCnt();
    }
    return mmiBenMaxPhysTrpyPriCnt;
  }

  /**
   * Update MmiBenMaxPhysTrpyPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PHYS-TRPY-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPhysTrpyPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPhysTrpyPriCnt = checkMmiBenMaxPhysTrpyPriCntMaxLimit(number);
    serializeMmiBenMaxPhysTrpyPriCnt(mmiBenMaxPhysTrpyPriCnt);
  }

  public void setMmiBenMaxPhysTrpyPriCnt(int number) {
    number =
        checkMmiBenMaxPhysTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhysTrpyPriCnt((short) number);
  }

  public void setMmiBenMaxPhysTrpyPriCnt(long number) {
    number =
        checkMmiBenMaxPhysTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhysTrpyPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxPhysTrpySecCd
   *
   * @return mmiBenMaxPhysTrpySecCd
   */
  public char[] getMmiBenMaxPhysTrpySecCd() throws CFException {
    if (isMmiBenMaxPhysTrpySecCdModified()) {
      mmiBenMaxPhysTrpySecCd = refreshMmiBenMaxPhysTrpySecCd();
    }
    return mmiBenMaxPhysTrpySecCd;
  }

  /**
   * set variable mmiBenMaxPhysTrpySecCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PHYS-TRPY-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpySecCd(char[] value) {
    mmiBenMaxPhysTrpySecCd = checkMmiBenMaxPhysTrpySecCdConstraints(value);
    serializeMmiBenMaxPhysTrpySecCd(mmiBenMaxPhysTrpySecCd);
  }

  /**
   * Update MmiBenMaxPhysTrpySecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpySecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPhysTrpySecCd,
        mmiBenMaxPhysTrpySecCd.length);
  }

  public void setMmiBenMaxPhysTrpySecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxPhysTrpySecCd, mmiBenMaxPhysTrpySecCd.length);
  }

  /**
   * Update MmiBenMaxPhysTrpySecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpySecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhysTrpySecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPhysTrpySecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpySecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxPhysTrpySecCd, MMI_BEN_MAX_PHYS_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhysTrpySecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpySecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPhysTrpySecCd,
        MMI_BEN_MAX_PHYS_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPhysTrpySecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPhysTrpySecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPhysTrpySecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPhysTrpySecCnt
   *
   * @return mmiBenMaxPhysTrpySecCnt
   */
  public short getMmiBenMaxPhysTrpySecCnt() throws CFException {
    if (isMmiBenMaxPhysTrpySecCntModified()) {
      mmiBenMaxPhysTrpySecCnt = refreshMmiBenMaxPhysTrpySecCnt();
    }
    return mmiBenMaxPhysTrpySecCnt;
  }

  /**
   * Update MmiBenMaxPhysTrpySecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PHYS-TRPY-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPhysTrpySecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPhysTrpySecCnt = checkMmiBenMaxPhysTrpySecCntMaxLimit(number);
    serializeMmiBenMaxPhysTrpySecCnt(mmiBenMaxPhysTrpySecCnt);
  }

  public void setMmiBenMaxPhysTrpySecCnt(int number) {
    number =
        checkMmiBenMaxPhysTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhysTrpySecCnt((short) number);
  }

  public void setMmiBenMaxPhysTrpySecCnt(long number) {
    number =
        checkMmiBenMaxPhysTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPhysTrpySecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxPlmryRehbPriCnt
   *
   * @return mmiBenMaxPlmryRehbPriCnt
   */
  public short getMmiBenMaxPlmryRehbPriCnt() throws CFException {
    if (isMmiBenMaxPlmryRehbPriCntModified()) {
      mmiBenMaxPlmryRehbPriCnt = refreshMmiBenMaxPlmryRehbPriCnt();
    }
    return mmiBenMaxPlmryRehbPriCnt;
  }

  /**
   * Update MmiBenMaxPlmryRehbPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PLMRY-REHB-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPlmryRehbPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPlmryRehbPriCnt = checkMmiBenMaxPlmryRehbPriCntMaxLimit(number);
    serializeMmiBenMaxPlmryRehbPriCnt(mmiBenMaxPlmryRehbPriCnt);
  }

  public void setMmiBenMaxPlmryRehbPriCnt(int number) {
    number =
        checkMmiBenMaxPlmryRehbPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPlmryRehbPriCnt((short) number);
  }

  public void setMmiBenMaxPlmryRehbPriCnt(long number) {
    number =
        checkMmiBenMaxPlmryRehbPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPlmryRehbPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxSpchTrpyPriCd
   *
   * @return mmiBenMaxSpchTrpyPriCd
   */
  public char[] getMmiBenMaxSpchTrpyPriCd() throws CFException {
    if (isMmiBenMaxSpchTrpyPriCdModified()) {
      mmiBenMaxSpchTrpyPriCd = refreshMmiBenMaxSpchTrpyPriCd();
    }
    return mmiBenMaxSpchTrpyPriCd;
  }

  /**
   * set variable mmiBenMaxSpchTrpyPriCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPCH-TRPY-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpyPriCd(char[] value) {
    mmiBenMaxSpchTrpyPriCd = checkMmiBenMaxSpchTrpyPriCdConstraints(value);
    serializeMmiBenMaxSpchTrpyPriCd(mmiBenMaxSpchTrpyPriCd);
  }

  /**
   * Update MmiBenMaxSpchTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpyPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxSpchTrpyPriCd,
        mmiBenMaxSpchTrpyPriCd.length);
  }

  public void setMmiBenMaxSpchTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxSpchTrpyPriCd, mmiBenMaxSpchTrpyPriCd.length);
  }

  /**
   * Update MmiBenMaxSpchTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpchTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxSpchTrpyPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpyPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxSpchTrpyPriCd, MMI_BEN_MAX_SPCH_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpchTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxSpchTrpyPriCd,
        MMI_BEN_MAX_SPCH_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpchTrpyPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpchTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxSpchTrpyPriCnt
   *
   * @return mmiBenMaxSpchTrpyPriCnt
   */
  public short getMmiBenMaxSpchTrpyPriCnt() throws CFException {
    if (isMmiBenMaxSpchTrpyPriCntModified()) {
      mmiBenMaxSpchTrpyPriCnt = refreshMmiBenMaxSpchTrpyPriCnt();
    }
    return mmiBenMaxSpchTrpyPriCnt;
  }

  /**
   * Update MmiBenMaxSpchTrpyPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPCH-TRPY-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxSpchTrpyPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxSpchTrpyPriCnt = checkMmiBenMaxSpchTrpyPriCntMaxLimit(number);
    serializeMmiBenMaxSpchTrpyPriCnt(mmiBenMaxSpchTrpyPriCnt);
  }

  public void setMmiBenMaxSpchTrpyPriCnt(int number) {
    number =
        checkMmiBenMaxSpchTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpchTrpyPriCnt((short) number);
  }

  public void setMmiBenMaxSpchTrpyPriCnt(long number) {
    number =
        checkMmiBenMaxSpchTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpchTrpyPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxSpchTrpySecCd
   *
   * @return mmiBenMaxSpchTrpySecCd
   */
  public char[] getMmiBenMaxSpchTrpySecCd() throws CFException {
    if (isMmiBenMaxSpchTrpySecCdModified()) {
      mmiBenMaxSpchTrpySecCd = refreshMmiBenMaxSpchTrpySecCd();
    }
    return mmiBenMaxSpchTrpySecCd;
  }

  /**
   * set variable mmiBenMaxSpchTrpySecCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPCH-TRPY-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpySecCd(char[] value) {
    mmiBenMaxSpchTrpySecCd = checkMmiBenMaxSpchTrpySecCdConstraints(value);
    serializeMmiBenMaxSpchTrpySecCd(mmiBenMaxSpchTrpySecCd);
  }

  /**
   * Update MmiBenMaxSpchTrpySecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpySecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxSpchTrpySecCd,
        mmiBenMaxSpchTrpySecCd.length);
  }

  public void setMmiBenMaxSpchTrpySecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxSpchTrpySecCd, mmiBenMaxSpchTrpySecCd.length);
  }

  /**
   * Update MmiBenMaxSpchTrpySecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpySecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpchTrpySecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxSpchTrpySecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpySecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxSpchTrpySecCd, MMI_BEN_MAX_SPCH_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpchTrpySecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpySecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxSpchTrpySecCd,
        MMI_BEN_MAX_SPCH_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpchTrpySecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxSpchTrpySecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpchTrpySecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxSpchTrpySecCnt
   *
   * @return mmiBenMaxSpchTrpySecCnt
   */
  public short getMmiBenMaxSpchTrpySecCnt() throws CFException {
    if (isMmiBenMaxSpchTrpySecCntModified()) {
      mmiBenMaxSpchTrpySecCnt = refreshMmiBenMaxSpchTrpySecCnt();
    }
    return mmiBenMaxSpchTrpySecCnt;
  }

  /**
   * Update MmiBenMaxSpchTrpySecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPCH-TRPY-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxSpchTrpySecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxSpchTrpySecCnt = checkMmiBenMaxSpchTrpySecCntMaxLimit(number);
    serializeMmiBenMaxSpchTrpySecCnt(mmiBenMaxSpchTrpySecCnt);
  }

  public void setMmiBenMaxSpchTrpySecCnt(int number) {
    number =
        checkMmiBenMaxSpchTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpchTrpySecCnt((short) number);
  }

  public void setMmiBenMaxSpchTrpySecCnt(long number) {
    number =
        checkMmiBenMaxSpchTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpchTrpySecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxSpneMnipPriCd
   *
   * @return mmiBenMaxSpneMnipPriCd
   */
  public char[] getMmiBenMaxSpneMnipPriCd() throws CFException {
    if (isMmiBenMaxSpneMnipPriCdModified()) {
      mmiBenMaxSpneMnipPriCd = refreshMmiBenMaxSpneMnipPriCd();
    }
    return mmiBenMaxSpneMnipPriCd;
  }

  /**
   * set variable mmiBenMaxSpneMnipPriCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPNE-MNIP-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipPriCd(char[] value) {
    mmiBenMaxSpneMnipPriCd = checkMmiBenMaxSpneMnipPriCdConstraints(value);
    serializeMmiBenMaxSpneMnipPriCd(mmiBenMaxSpneMnipPriCd);
  }

  /**
   * Update MmiBenMaxSpneMnipPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxSpneMnipPriCd,
        mmiBenMaxSpneMnipPriCd.length);
  }

  public void setMmiBenMaxSpneMnipPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxSpneMnipPriCd, mmiBenMaxSpneMnipPriCd.length);
  }

  /**
   * Update MmiBenMaxSpneMnipPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpneMnipPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxSpneMnipPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxSpneMnipPriCd, MMI_BEN_MAX_SPNE_MNIP_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpneMnipPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxSpneMnipPriCd,
        MMI_BEN_MAX_SPNE_MNIP_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpneMnipPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpneMnipPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxSpneMnipPriCnt
   *
   * @return mmiBenMaxSpneMnipPriCnt
   */
  public short getMmiBenMaxSpneMnipPriCnt() throws CFException {
    if (isMmiBenMaxSpneMnipPriCntModified()) {
      mmiBenMaxSpneMnipPriCnt = refreshMmiBenMaxSpneMnipPriCnt();
    }
    return mmiBenMaxSpneMnipPriCnt;
  }

  /**
   * Update MmiBenMaxSpneMnipPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPNE-MNIP-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxSpneMnipPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxSpneMnipPriCnt = checkMmiBenMaxSpneMnipPriCntMaxLimit(number);
    serializeMmiBenMaxSpneMnipPriCnt(mmiBenMaxSpneMnipPriCnt);
  }

  public void setMmiBenMaxSpneMnipPriCnt(int number) {
    number =
        checkMmiBenMaxSpneMnipPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpneMnipPriCnt((short) number);
  }

  public void setMmiBenMaxSpneMnipPriCnt(long number) {
    number =
        checkMmiBenMaxSpneMnipPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpneMnipPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxSpneMnipSecCd
   *
   * @return mmiBenMaxSpneMnipSecCd
   */
  public char[] getMmiBenMaxSpneMnipSecCd() throws CFException {
    if (isMmiBenMaxSpneMnipSecCdModified()) {
      mmiBenMaxSpneMnipSecCd = refreshMmiBenMaxSpneMnipSecCd();
    }
    return mmiBenMaxSpneMnipSecCd;
  }

  /**
   * set variable mmiBenMaxSpneMnipSecCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPNE-MNIP-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipSecCd(char[] value) {
    mmiBenMaxSpneMnipSecCd = checkMmiBenMaxSpneMnipSecCdConstraints(value);
    serializeMmiBenMaxSpneMnipSecCd(mmiBenMaxSpneMnipSecCd);
  }

  /**
   * Update MmiBenMaxSpneMnipSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipSecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxSpneMnipSecCd,
        mmiBenMaxSpneMnipSecCd.length);
  }

  public void setMmiBenMaxSpneMnipSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxSpneMnipSecCd, mmiBenMaxSpneMnipSecCd.length);
  }

  /**
   * Update MmiBenMaxSpneMnipSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpneMnipSecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxSpneMnipSecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipSecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxSpneMnipSecCd, MMI_BEN_MAX_SPNE_MNIP_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpneMnipSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxSpneMnipSecCd,
        MMI_BEN_MAX_SPNE_MNIP_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxSpneMnipSecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxSpneMnipSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxSpneMnipSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxSpneMnipSecCnt
   *
   * @return mmiBenMaxSpneMnipSecCnt
   */
  public short getMmiBenMaxSpneMnipSecCnt() throws CFException {
    if (isMmiBenMaxSpneMnipSecCntModified()) {
      mmiBenMaxSpneMnipSecCnt = refreshMmiBenMaxSpneMnipSecCnt();
    }
    return mmiBenMaxSpneMnipSecCnt;
  }

  /**
   * Update MmiBenMaxSpneMnipSecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-SPNE-MNIP-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxSpneMnipSecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxSpneMnipSecCnt = checkMmiBenMaxSpneMnipSecCntMaxLimit(number);
    serializeMmiBenMaxSpneMnipSecCnt(mmiBenMaxSpneMnipSecCnt);
  }

  public void setMmiBenMaxSpneMnipSecCnt(int number) {
    number =
        checkMmiBenMaxSpneMnipSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpneMnipSecCnt((short) number);
  }

  public void setMmiBenMaxSpneMnipSecCnt(long number) {
    number =
        checkMmiBenMaxSpneMnipSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxSpneMnipSecCnt((short) number);
  }

  /**
   * Returns the value of mmiCancDt
   *
   * @return mmiCancDt
   */
  public char[] getMmiCancDt() throws CFException {
    if (isMmiCancDtModified()) {
      mmiCancDt = refreshMmiCancDt();
    }
    return mmiCancDt;
  }

  /**
   * set variable mmiCancDt Corresponding COBOL Variable is MMI-CANC-DT
   *
   * @param value
   */
  public void setMmiCancDt(char[] value) {
    mmiCancDt = checkMmiCancDtConstraints(value);
    serializeMmiCancDt(mmiCancDt);
  }

  /**
   * Update MmiCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiCancDt, mmiCancDt.length);
  }

  public void setMmiCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCancDt, mmiCancDt.length);
  }

  /**
   * Update MmiCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCancDt + targetIndex, targetLen);
  }

  /**
   * Update MmiCancDt with another Field
   *
   * @param value
   */
  public void setMmiCancDt(Field source) {
    replace(source, 0, source.length(), beginMmiCancDt, MMI_CANC_DT_LEN);
  }

  /**
   * Update MmiCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCancDt, MMI_CANC_DT_LEN);
  }

  /**
   * Update MmiCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCareMgtInd
   *
   * @return mmiCareMgtInd
   */
  public char[] getMmiCareMgtInd() throws CFException {
    if (isMmiCareMgtIndModified()) {
      mmiCareMgtInd = refreshMmiCareMgtInd();
    }
    return mmiCareMgtInd;
  }

  /**
   * set variable mmiCareMgtInd Corresponding COBOL Variable is MMI-CARE-MGT-IND
   *
   * @param value
   */
  public void setMmiCareMgtInd(char[] value) {
    mmiCareMgtInd = checkMmiCareMgtIndConstraints(value);
    serializeMmiCareMgtInd(mmiCareMgtInd);
  }

  /**
   * Update MmiCareMgtInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCareMgtInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiCareMgtInd, mmiCareMgtInd.length);
  }

  public void setMmiCareMgtInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCareMgtInd, mmiCareMgtInd.length);
  }

  /**
   * Update MmiCareMgtInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCareMgtInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCareMgtInd + targetIndex, targetLen);
  }

  /**
   * Update MmiCareMgtInd with another Field
   *
   * @param value
   */
  public void setMmiCareMgtInd(Field source) {
    replace(source, 0, source.length(), beginMmiCareMgtInd, MMI_CARE_MGT_IND_LEN);
  }

  /**
   * Update MmiCareMgtInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCareMgtInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCareMgtInd, MMI_CARE_MGT_IND_LEN);
  }

  /**
   * Update MmiCareMgtInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCareMgtInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCareMgtInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiChrpNtwkInd
   *
   * @return mmiChrpNtwkInd
   */
  public char[] getMmiChrpNtwkInd() throws CFException {
    if (isMmiChrpNtwkIndModified()) {
      mmiChrpNtwkInd = refreshMmiChrpNtwkInd();
    }
    return mmiChrpNtwkInd;
  }

  /**
   * set variable mmiChrpNtwkInd Corresponding COBOL Variable is MMI-CHRP-NTWK-IND
   *
   * @param value
   */
  public void setMmiChrpNtwkInd(char[] value) {
    mmiChrpNtwkInd = checkMmiChrpNtwkIndConstraints(value);
    serializeMmiChrpNtwkInd(mmiChrpNtwkInd);
  }

  /**
   * Update MmiChrpNtwkInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiChrpNtwkInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiChrpNtwkInd, mmiChrpNtwkInd.length);
  }

  public void setMmiChrpNtwkInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiChrpNtwkInd, mmiChrpNtwkInd.length);
  }

  /**
   * Update MmiChrpNtwkInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiChrpNtwkInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiChrpNtwkInd + targetIndex, targetLen);
  }

  /**
   * Update MmiChrpNtwkInd with another Field
   *
   * @param value
   */
  public void setMmiChrpNtwkInd(Field source) {
    replace(source, 0, source.length(), beginMmiChrpNtwkInd, MMI_CHRP_NTWK_IND_LEN);
  }

  /**
   * Update MmiChrpNtwkInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiChrpNtwkInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiChrpNtwkInd, MMI_CHRP_NTWK_IND_LEN);
  }

  /**
   * Update MmiChrpNtwkInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiChrpNtwkInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiChrpNtwkInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiClmAutoDenyInd
   *
   * @return mmiClmAutoDenyInd
   */
  public char[] getMmiClmAutoDenyInd() throws CFException {
    if (isMmiClmAutoDenyIndModified()) {
      mmiClmAutoDenyInd = refreshMmiClmAutoDenyInd();
    }
    return mmiClmAutoDenyInd;
  }

  /**
   * set variable mmiClmAutoDenyInd Corresponding COBOL Variable is MMI-CLM-AUTO-DENY-IND
   *
   * @param value
   */
  public void setMmiClmAutoDenyInd(char[] value) {
    mmiClmAutoDenyInd = checkMmiClmAutoDenyIndConstraints(value);
    serializeMmiClmAutoDenyInd(mmiClmAutoDenyInd);
  }

  /**
   * Update MmiClmAutoDenyInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiClmAutoDenyInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiClmAutoDenyInd, mmiClmAutoDenyInd.length);
  }

  public void setMmiClmAutoDenyInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClmAutoDenyInd, mmiClmAutoDenyInd.length);
  }

  /**
   * Update MmiClmAutoDenyInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiClmAutoDenyInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClmAutoDenyInd + targetIndex, targetLen);
  }

  /**
   * Update MmiClmAutoDenyInd with another Field
   *
   * @param value
   */
  public void setMmiClmAutoDenyInd(Field source) {
    replace(source, 0, source.length(), beginMmiClmAutoDenyInd, MMI_CLM_AUTO_DENY_IND_LEN);
  }

  /**
   * Update MmiClmAutoDenyInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiClmAutoDenyInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClmAutoDenyInd, MMI_CLM_AUTO_DENY_IND_LEN);
  }

  /**
   * Update MmiClmAutoDenyInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiClmAutoDenyInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiClmAutoDenyInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCoinsCopayCd
   *
   * @return mmiCoinsCopayCd
   */
  public char[] getMmiCoinsCopayCd() throws CFException {
    if (isMmiCoinsCopayCdModified()) {
      mmiCoinsCopayCd = refreshMmiCoinsCopayCd();
    }
    return mmiCoinsCopayCd;
  }

  /**
   * set variable mmiCoinsCopayCd Corresponding COBOL Variable is MMI-COINS-COPAY-CD
   *
   * @param value
   */
  public void setMmiCoinsCopayCd(char[] value) {
    mmiCoinsCopayCd = checkMmiCoinsCopayCdConstraints(value);
    serializeMmiCoinsCopayCd(mmiCoinsCopayCd);
  }

  /**
   * Update MmiCoinsCopayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCoinsCopayCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiCoinsCopayCd, mmiCoinsCopayCd.length);
  }

  public void setMmiCoinsCopayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoinsCopayCd, mmiCoinsCopayCd.length);
  }

  /**
   * Update MmiCoinsCopayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCoinsCopayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoinsCopayCd + targetIndex, targetLen);
  }

  /**
   * Update MmiCoinsCopayCd with another Field
   *
   * @param value
   */
  public void setMmiCoinsCopayCd(Field source) {
    replace(source, 0, source.length(), beginMmiCoinsCopayCd, MMI_COINS_COPAY_CD_LEN);
  }

  /**
   * Update MmiCoinsCopayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCoinsCopayCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoinsCopayCd, MMI_COINS_COPAY_CD_LEN);
  }

  /**
   * Update MmiCoinsCopayCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCoinsCopayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoinsCopayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCombPrscDedPriCd
   *
   * @return mmiCombPrscDedPriCd
   */
  public char[] getMmiCombPrscDedPriCd() throws CFException {
    if (isMmiCombPrscDedPriCdModified()) {
      mmiCombPrscDedPriCd = refreshMmiCombPrscDedPriCd();
    }
    return mmiCombPrscDedPriCd;
  }

  /**
   * set variable mmiCombPrscDedPriCd Corresponding COBOL Variable is MMI-COMB-PRSC-DED-PRI-CD
   *
   * @param value
   */
  public void setMmiCombPrscDedPriCd(char[] value) {
    mmiCombPrscDedPriCd = checkMmiCombPrscDedPriCdConstraints(value);
    serializeMmiCombPrscDedPriCd(mmiCombPrscDedPriCd);
  }

  /**
   * Update MmiCombPrscDedPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedPriCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiCombPrscDedPriCd, mmiCombPrscDedPriCd.length);
  }

  public void setMmiCombPrscDedPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedPriCd, mmiCombPrscDedPriCd.length);
  }

  /**
   * Update MmiCombPrscDedPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiCombPrscDedPriCd with another Field
   *
   * @param value
   */
  public void setMmiCombPrscDedPriCd(Field source) {
    replace(source, 0, source.length(), beginMmiCombPrscDedPriCd, MMI_COMB_PRSC_DED_PRI_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedPriCd, MMI_COMB_PRSC_DED_PRI_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedPriCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCombPrscDedQualCd
   *
   * @return mmiCombPrscDedQualCd
   */
  public char[] getMmiCombPrscDedQualCd() throws CFException {
    if (isMmiCombPrscDedQualCdModified()) {
      mmiCombPrscDedQualCd = refreshMmiCombPrscDedQualCd();
    }
    return mmiCombPrscDedQualCd;
  }

  /**
   * set variable mmiCombPrscDedQualCd Corresponding COBOL Variable is MMI-COMB-PRSC-DED-QUAL-CD
   *
   * @param value
   */
  public void setMmiCombPrscDedQualCd(char[] value) {
    mmiCombPrscDedQualCd = checkMmiCombPrscDedQualCdConstraints(value);
    serializeMmiCombPrscDedQualCd(mmiCombPrscDedQualCd);
  }

  /**
   * Update MmiCombPrscDedQualCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedQualCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiCombPrscDedQualCd, mmiCombPrscDedQualCd.length);
  }

  public void setMmiCombPrscDedQualCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedQualCd, mmiCombPrscDedQualCd.length);
  }

  /**
   * Update MmiCombPrscDedQualCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedQualCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedQualCd + targetIndex, targetLen);
  }

  /**
   * Update MmiCombPrscDedQualCd with another Field
   *
   * @param value
   */
  public void setMmiCombPrscDedQualCd(Field source) {
    replace(source, 0, source.length(), beginMmiCombPrscDedQualCd, MMI_COMB_PRSC_DED_QUAL_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedQualCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedQualCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiCombPrscDedQualCd, MMI_COMB_PRSC_DED_QUAL_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedQualCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiCombPrscDedQualCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedQualCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCombPrscDedSecCd
   *
   * @return mmiCombPrscDedSecCd
   */
  public char[] getMmiCombPrscDedSecCd() throws CFException {
    if (isMmiCombPrscDedSecCdModified()) {
      mmiCombPrscDedSecCd = refreshMmiCombPrscDedSecCd();
    }
    return mmiCombPrscDedSecCd;
  }

  /**
   * set variable mmiCombPrscDedSecCd Corresponding COBOL Variable is MMI-COMB-PRSC-DED-SEC-CD
   *
   * @param value
   */
  public void setMmiCombPrscDedSecCd(char[] value) {
    mmiCombPrscDedSecCd = checkMmiCombPrscDedSecCdConstraints(value);
    serializeMmiCombPrscDedSecCd(mmiCombPrscDedSecCd);
  }

  /**
   * Update MmiCombPrscDedSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedSecCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiCombPrscDedSecCd, mmiCombPrscDedSecCd.length);
  }

  public void setMmiCombPrscDedSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedSecCd, mmiCombPrscDedSecCd.length);
  }

  /**
   * Update MmiCombPrscDedSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedSecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiCombPrscDedSecCd with another Field
   *
   * @param value
   */
  public void setMmiCombPrscDedSecCd(Field source) {
    replace(source, 0, source.length(), beginMmiCombPrscDedSecCd, MMI_COMB_PRSC_DED_SEC_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedSecCd, MMI_COMB_PRSC_DED_SEC_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedSecCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCombPrscDedTirCd
   *
   * @return mmiCombPrscDedTirCd
   */
  public char[] getMmiCombPrscDedTirCd() throws CFException {
    if (isMmiCombPrscDedTirCdModified()) {
      mmiCombPrscDedTirCd = refreshMmiCombPrscDedTirCd();
    }
    return mmiCombPrscDedTirCd;
  }

  /**
   * set variable mmiCombPrscDedTirCd Corresponding COBOL Variable is MMI-COMB-PRSC-DED-TIR-CD
   *
   * @param value
   */
  public void setMmiCombPrscDedTirCd(char[] value) {
    mmiCombPrscDedTirCd = checkMmiCombPrscDedTirCdConstraints(value);
    serializeMmiCombPrscDedTirCd(mmiCombPrscDedTirCd);
  }

  /**
   * Update MmiCombPrscDedTirCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedTirCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiCombPrscDedTirCd, mmiCombPrscDedTirCd.length);
  }

  public void setMmiCombPrscDedTirCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedTirCd, mmiCombPrscDedTirCd.length);
  }

  /**
   * Update MmiCombPrscDedTirCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedTirCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedTirCd + targetIndex, targetLen);
  }

  /**
   * Update MmiCombPrscDedTirCd with another Field
   *
   * @param value
   */
  public void setMmiCombPrscDedTirCd(Field source) {
    replace(source, 0, source.length(), beginMmiCombPrscDedTirCd, MMI_COMB_PRSC_DED_TIR_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedTirCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedTirCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedTirCd, MMI_COMB_PRSC_DED_TIR_CD_LEN);
  }

  /**
   * Update MmiCombPrscDedTirCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCombPrscDedTirCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCombPrscDedTirCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiContrStCd
   *
   * @return mmiContrStCd
   */
  public char[] getMmiContrStCd() throws CFException {
    if (isMmiContrStCdModified()) {
      mmiContrStCd = refreshMmiContrStCd();
    }
    return mmiContrStCd;
  }

  /**
   * set variable mmiContrStCd Corresponding COBOL Variable is MMI-CONTR-ST-CD
   *
   * @param value
   */
  public void setMmiContrStCd(char[] value) {
    mmiContrStCd = checkMmiContrStCdConstraints(value);
    serializeMmiContrStCd(mmiContrStCd);
  }

  /**
   * Update MmiContrStCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiContrStCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiContrStCd, mmiContrStCd.length);
  }

  public void setMmiContrStCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiContrStCd, mmiContrStCd.length);
  }

  /**
   * Update MmiContrStCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiContrStCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiContrStCd + targetIndex, targetLen);
  }

  /**
   * Update MmiContrStCd with another Field
   *
   * @param value
   */
  public void setMmiContrStCd(Field source) {
    replace(source, 0, source.length(), beginMmiContrStCd, MMI_CONTR_ST_CD_LEN);
  }

  /**
   * Update MmiContrStCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiContrStCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiContrStCd, MMI_CONTR_ST_CD_LEN);
  }

  /**
   * Update MmiContrStCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiContrStCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiContrStCd + targetIndex, targetLen);
  }

  public BigDecimal getMmiCopayAmt() throws CFException {
    if (isMmiCopayAmtModified()) {
      mmiCopayAmt = refreshMmiCopayAmt();
    }
    return mmiCopayAmt;
  }

  public char[] getMmiCopayAmtString() {
    return mmiCopayAmtString();
  }

  /**
   * Update MmiCopayAmt with the passed number Corresponding COBOL Variable is MMI-COPAY-AMT
   *
   * @param number
   */
  public void setMmiCopayAmt(BigDecimal number) {
    mmiCopayAmt = checkMmiCopayAmtMaxLimit(number);
    serializeMmiCopayAmt(mmiCopayAmt);
  }

  public BigDecimal getMmiCopayMaxAnnlAmt() throws CFException {
    if (isMmiCopayMaxAnnlAmtModified()) {
      mmiCopayMaxAnnlAmt = refreshMmiCopayMaxAnnlAmt();
    }
    return mmiCopayMaxAnnlAmt;
  }

  public char[] getMmiCopayMaxAnnlAmtString() {
    return mmiCopayMaxAnnlAmtString();
  }

  /**
   * Update MmiCopayMaxAnnlAmt with the passed number Corresponding COBOL Variable is
   * MMI-COPAY-MAX-ANNL-AMT
   *
   * @param number
   */
  public void setMmiCopayMaxAnnlAmt(BigDecimal number) {
    mmiCopayMaxAnnlAmt = checkMmiCopayMaxAnnlAmtMaxLimit(number);
    serializeMmiCopayMaxAnnlAmt(mmiCopayMaxAnnlAmt);
  }
  /**
   * Returns the value of mmiCopayWaivTblId
   *
   * @return mmiCopayWaivTblId
   */
  public char[] getMmiCopayWaivTblId() throws CFException {
    if (isMmiCopayWaivTblIdModified()) {
      mmiCopayWaivTblId = refreshMmiCopayWaivTblId();
    }
    return mmiCopayWaivTblId;
  }

  /**
   * set variable mmiCopayWaivTblId Corresponding COBOL Variable is MMI-COPAY-WAIV-TBL-ID
   *
   * @param value
   */
  public void setMmiCopayWaivTblId(char[] value) {
    mmiCopayWaivTblId = checkMmiCopayWaivTblIdConstraints(value);
    serializeMmiCopayWaivTblId(mmiCopayWaivTblId);
  }

  /**
   * Update MmiCopayWaivTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCopayWaivTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiCopayWaivTblId, mmiCopayWaivTblId.length);
  }

  public void setMmiCopayWaivTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCopayWaivTblId, mmiCopayWaivTblId.length);
  }

  /**
   * Update MmiCopayWaivTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCopayWaivTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCopayWaivTblId + targetIndex, targetLen);
  }

  /**
   * Update MmiCopayWaivTblId with another Field
   *
   * @param value
   */
  public void setMmiCopayWaivTblId(Field source) {
    replace(source, 0, source.length(), beginMmiCopayWaivTblId, MMI_COPAY_WAIV_TBL_ID_LEN);
  }

  /**
   * Update MmiCopayWaivTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCopayWaivTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCopayWaivTblId, MMI_COPAY_WAIV_TBL_ID_LEN);
  }

  /**
   * Update MmiCopayWaivTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCopayWaivTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCopayWaivTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiDiagVsSurgInd
   *
   * @return mmiDiagVsSurgInd
   */
  public char[] getMmiDiagVsSurgInd() throws CFException {
    if (isMmiDiagVsSurgIndModified()) {
      mmiDiagVsSurgInd = refreshMmiDiagVsSurgInd();
    }
    return mmiDiagVsSurgInd;
  }

  /**
   * set variable mmiDiagVsSurgInd Corresponding COBOL Variable is MMI-DIAG-VS-SURG-IND
   *
   * @param value
   */
  public void setMmiDiagVsSurgInd(char[] value) {
    mmiDiagVsSurgInd = checkMmiDiagVsSurgIndConstraints(value);
    serializeMmiDiagVsSurgInd(mmiDiagVsSurgInd);
  }

  /**
   * Update MmiDiagVsSurgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiDiagVsSurgInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiDiagVsSurgInd, mmiDiagVsSurgInd.length);
  }

  public void setMmiDiagVsSurgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDiagVsSurgInd, mmiDiagVsSurgInd.length);
  }

  /**
   * Update MmiDiagVsSurgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiDiagVsSurgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDiagVsSurgInd + targetIndex, targetLen);
  }

  /**
   * Update MmiDiagVsSurgInd with another Field
   *
   * @param value
   */
  public void setMmiDiagVsSurgInd(Field source) {
    replace(source, 0, source.length(), beginMmiDiagVsSurgInd, MMI_DIAG_VS_SURG_IND_LEN);
  }

  /**
   * Update MmiDiagVsSurgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiDiagVsSurgInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDiagVsSurgInd, MMI_DIAG_VS_SURG_IND_LEN);
  }

  /**
   * Update MmiDiagVsSurgInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiDiagVsSurgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDiagVsSurgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiDolTlrInd
   *
   * @return mmiDolTlrInd
   */
  public char[] getMmiDolTlrInd() throws CFException {
    if (isMmiDolTlrIndModified()) {
      mmiDolTlrInd = refreshMmiDolTlrInd();
    }
    return mmiDolTlrInd;
  }

  /**
   * set variable mmiDolTlrInd Corresponding COBOL Variable is MMI-DOL-TLR-IND
   *
   * @param value
   */
  public void setMmiDolTlrInd(char[] value) {
    mmiDolTlrInd = checkMmiDolTlrIndConstraints(value);
    serializeMmiDolTlrInd(mmiDolTlrInd);
  }

  /**
   * Update MmiDolTlrInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiDolTlrInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiDolTlrInd, mmiDolTlrInd.length);
  }

  public void setMmiDolTlrInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDolTlrInd, mmiDolTlrInd.length);
  }

  /**
   * Update MmiDolTlrInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiDolTlrInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDolTlrInd + targetIndex, targetLen);
  }

  /**
   * Update MmiDolTlrInd with another Field
   *
   * @param value
   */
  public void setMmiDolTlrInd(Field source) {
    replace(source, 0, source.length(), beginMmiDolTlrInd, MMI_DOL_TLR_IND_LEN);
  }

  /**
   * Update MmiDolTlrInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiDolTlrInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDolTlrInd, MMI_DOL_TLR_IND_LEN);
  }

  /**
   * Update MmiDolTlrInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiDolTlrInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDolTlrInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiDsesStTblNbr
   *
   * @return mmiDsesStTblNbr
   */
  public char[] getMmiDsesStTblNbr() throws CFException {
    if (isMmiDsesStTblNbrModified()) {
      mmiDsesStTblNbr = refreshMmiDsesStTblNbr();
    }
    return mmiDsesStTblNbr;
  }

  /**
   * set variable mmiDsesStTblNbr Corresponding COBOL Variable is MMI-DSES-ST-TBL-NBR
   *
   * @param value
   */
  public void setMmiDsesStTblNbr(char[] value) {
    mmiDsesStTblNbr = checkMmiDsesStTblNbrConstraints(value);
    serializeMmiDsesStTblNbr(mmiDsesStTblNbr);
  }

  /**
   * Update MmiDsesStTblNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiDsesStTblNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiDsesStTblNbr, mmiDsesStTblNbr.length);
  }

  public void setMmiDsesStTblNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDsesStTblNbr, mmiDsesStTblNbr.length);
  }

  /**
   * Update MmiDsesStTblNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiDsesStTblNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDsesStTblNbr + targetIndex, targetLen);
  }

  /**
   * Update MmiDsesStTblNbr with another Field
   *
   * @param value
   */
  public void setMmiDsesStTblNbr(Field source) {
    replace(source, 0, source.length(), beginMmiDsesStTblNbr, MMI_DSES_ST_TBL_NBR_LEN);
  }

  /**
   * Update MmiDsesStTblNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiDsesStTblNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDsesStTblNbr, MMI_DSES_ST_TBL_NBR_LEN);
  }

  /**
   * Update MmiDsesStTblNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiDsesStTblNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiDsesStTblNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEffDt
   *
   * @return mmiEffDt
   */
  public char[] getMmiEffDt() throws CFException {
    if (isMmiEffDtModified()) {
      mmiEffDt = refreshMmiEffDt();
    }
    return mmiEffDt;
  }

  /**
   * set variable mmiEffDt Corresponding COBOL Variable is MMI-EFF-DT
   *
   * @param value
   */
  public void setMmiEffDt(char[] value) {
    mmiEffDt = checkMmiEffDtConstraints(value);
    serializeMmiEffDt(mmiEffDt);
  }

  /**
   * Update MmiEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEffDt, mmiEffDt.length);
  }

  public void setMmiEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEffDt, mmiEffDt.length);
  }

  /**
   * Update MmiEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEffDt + targetIndex, targetLen);
  }

  /**
   * Update MmiEffDt with another Field
   *
   * @param value
   */
  public void setMmiEffDt(Field source) {
    replace(source, 0, source.length(), beginMmiEffDt, MMI_EFF_DT_LEN);
  }

  /**
   * Update MmiEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEffDt, MMI_EFF_DT_LEN);
  }

  /**
   * Update MmiEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEmrgParsNtfyInd
   *
   * @return mmiEmrgParsNtfyInd
   */
  public char[] getMmiEmrgParsNtfyInd() throws CFException {
    if (isMmiEmrgParsNtfyIndModified()) {
      mmiEmrgParsNtfyInd = refreshMmiEmrgParsNtfyInd();
    }
    return mmiEmrgParsNtfyInd;
  }

  /**
   * set variable mmiEmrgParsNtfyInd Corresponding COBOL Variable is MMI-EMRG-PARS-NTFY-IND
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyInd(char[] value) {
    mmiEmrgParsNtfyInd = checkMmiEmrgParsNtfyIndConstraints(value);
    serializeMmiEmrgParsNtfyInd(mmiEmrgParsNtfyInd);
  }

  /**
   * Update MmiEmrgParsNtfyInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEmrgParsNtfyInd, mmiEmrgParsNtfyInd.length);
  }

  public void setMmiEmrgParsNtfyInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyInd, mmiEmrgParsNtfyInd.length);
  }

  /**
   * Update MmiEmrgParsNtfyInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyInd + targetIndex, targetLen);
  }

  /**
   * Update MmiEmrgParsNtfyInd with another Field
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyInd(Field source) {
    replace(source, 0, source.length(), beginMmiEmrgParsNtfyInd, MMI_EMRG_PARS_NTFY_IND_LEN);
  }

  /**
   * Update MmiEmrgParsNtfyInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyInd, MMI_EMRG_PARS_NTFY_IND_LEN);
  }

  /**
   * Update MmiEmrgParsNtfyInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEmrgParsNtfyPrdCd
   *
   * @return mmiEmrgParsNtfyPrdCd
   */
  public char[] getMmiEmrgParsNtfyPrdCd() throws CFException {
    if (isMmiEmrgParsNtfyPrdCdModified()) {
      mmiEmrgParsNtfyPrdCd = refreshMmiEmrgParsNtfyPrdCd();
    }
    return mmiEmrgParsNtfyPrdCd;
  }

  /**
   * set variable mmiEmrgParsNtfyPrdCd Corresponding COBOL Variable is MMI-EMRG-PARS-NTFY-PRD-CD
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyPrdCd(char[] value) {
    mmiEmrgParsNtfyPrdCd = checkMmiEmrgParsNtfyPrdCdConstraints(value);
    serializeMmiEmrgParsNtfyPrdCd(mmiEmrgParsNtfyPrdCd);
  }

  /**
   * Update MmiEmrgParsNtfyPrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyPrdCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiEmrgParsNtfyPrdCd, mmiEmrgParsNtfyPrdCd.length);
  }

  public void setMmiEmrgParsNtfyPrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyPrdCd, mmiEmrgParsNtfyPrdCd.length);
  }

  /**
   * Update MmiEmrgParsNtfyPrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyPrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyPrdCd + targetIndex, targetLen);
  }

  /**
   * Update MmiEmrgParsNtfyPrdCd with another Field
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyPrdCd(Field source) {
    replace(source, 0, source.length(), beginMmiEmrgParsNtfyPrdCd, MMI_EMRG_PARS_NTFY_PRD_CD_LEN);
  }

  /**
   * Update MmiEmrgParsNtfyPrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyPrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyPrdCd, MMI_EMRG_PARS_NTFY_PRD_CD_LEN);
  }

  /**
   * Update MmiEmrgParsNtfyPrdCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiEmrgParsNtfyPrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmrgParsNtfyPrdCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEvdBasDialgInd
   *
   * @return mmiEvdBasDialgInd
   */
  public char[] getMmiEvdBasDialgInd() throws CFException {
    if (isMmiEvdBasDialgIndModified()) {
      mmiEvdBasDialgInd = refreshMmiEvdBasDialgInd();
    }
    return mmiEvdBasDialgInd;
  }

  /**
   * set variable mmiEvdBasDialgInd Corresponding COBOL Variable is MMI-EVD-BAS-DIALG-IND
   *
   * @param value
   */
  public void setMmiEvdBasDialgInd(char[] value) {
    mmiEvdBasDialgInd = checkMmiEvdBasDialgIndConstraints(value);
    serializeMmiEvdBasDialgInd(mmiEvdBasDialgInd);
  }

  /**
   * Update MmiEvdBasDialgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEvdBasDialgInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEvdBasDialgInd, mmiEvdBasDialgInd.length);
  }

  public void setMmiEvdBasDialgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEvdBasDialgInd, mmiEvdBasDialgInd.length);
  }

  /**
   * Update MmiEvdBasDialgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEvdBasDialgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEvdBasDialgInd + targetIndex, targetLen);
  }

  /**
   * Update MmiEvdBasDialgInd with another Field
   *
   * @param value
   */
  public void setMmiEvdBasDialgInd(Field source) {
    replace(source, 0, source.length(), beginMmiEvdBasDialgInd, MMI_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update MmiEvdBasDialgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEvdBasDialgInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEvdBasDialgInd, MMI_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update MmiEvdBasDialgInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEvdBasDialgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEvdBasDialgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEciTblId
   *
   * @return mmiEciTblId
   */
  public char[] getMmiEciTblId() throws CFException {
    if (isMmiEciTblIdModified()) {
      mmiEciTblId = refreshMmiEciTblId();
    }
    return mmiEciTblId;
  }

  /**
   * set variable mmiEciTblId Corresponding COBOL Variable is MMI-ECI-TBL-ID
   *
   * @param value
   */
  public void setMmiEciTblId(char[] value) {
    mmiEciTblId = checkMmiEciTblIdConstraints(value);
    serializeMmiEciTblId(mmiEciTblId);
  }

  /**
   * Update MmiEciTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEciTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEciTblId, mmiEciTblId.length);
  }

  public void setMmiEciTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEciTblId, mmiEciTblId.length);
  }

  /**
   * Update MmiEciTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEciTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEciTblId + targetIndex, targetLen);
  }

  /**
   * Update MmiEciTblId with another Field
   *
   * @param value
   */
  public void setMmiEciTblId(Field source) {
    replace(source, 0, source.length(), beginMmiEciTblId, MMI_ECI_TBL_ID_LEN);
  }

  /**
   * Update MmiEciTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEciTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEciTblId, MMI_ECI_TBL_ID_LEN);
  }

  /**
   * Update MmiEciTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEciTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEciTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEviTblId
   *
   * @return mmiEviTblId
   */
  public char[] getMmiEviTblId() throws CFException {
    if (isMmiEviTblIdModified()) {
      mmiEviTblId = refreshMmiEviTblId();
    }
    return mmiEviTblId;
  }

  /**
   * set variable mmiEviTblId Corresponding COBOL Variable is MMI-EVI-TBL-ID
   *
   * @param value
   */
  public void setMmiEviTblId(char[] value) {
    mmiEviTblId = checkMmiEviTblIdConstraints(value);
    serializeMmiEviTblId(mmiEviTblId);
  }

  /**
   * Update MmiEviTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEviTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEviTblId, mmiEviTblId.length);
  }

  public void setMmiEviTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEviTblId, mmiEviTblId.length);
  }

  /**
   * Update MmiEviTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEviTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEviTblId + targetIndex, targetLen);
  }

  /**
   * Update MmiEviTblId with another Field
   *
   * @param value
   */
  public void setMmiEviTblId(Field source) {
    replace(source, 0, source.length(), beginMmiEviTblId, MMI_EVI_TBL_ID_LEN);
  }

  /**
   * Update MmiEviTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEviTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEviTblId, MMI_EVI_TBL_ID_LEN);
  }

  /**
   * Update MmiEviTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEviTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEviTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiFamMbrCnt
   *
   * @return mmiFamMbrCnt
   */
  public short getMmiFamMbrCnt() throws CFException {
    if (isMmiFamMbrCntModified()) {
      mmiFamMbrCnt = refreshMmiFamMbrCnt();
    }
    return mmiFamMbrCnt;
  }

  /**
   * Update MmiFamMbrCnt with the passed value Corresponding COBOL Variable is MMI-FAM-MBR-CNT
   *
   * @param number
   */
  public void setMmiFamMbrCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiFamMbrCnt = checkMmiFamMbrCntMaxLimit(number);
    serializeMmiFamMbrCnt(mmiFamMbrCnt);
  }

  public void setMmiFamMbrCnt(int number) {
    number = checkMmiFamMbrCntMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setMmiFamMbrCnt((short) number);
  }

  public void setMmiFamMbrCnt(long number) {
    number = checkMmiFamMbrCntMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setMmiFamMbrCnt((short) number);
  }

  /**
   * Returns the value of mmiFamNewCoinsAmt
   *
   * @return mmiFamNewCoinsAmt
   */
  public int getMmiFamNewCoinsAmt() throws CFException {
    if (isMmiFamNewCoinsAmtModified()) {
      mmiFamNewCoinsAmt = refreshMmiFamNewCoinsAmt();
    }
    return mmiFamNewCoinsAmt;
  }

  /**
   * Update MmiFamNewCoinsAmt with the passed value Corresponding COBOL Variable is
   * MMI-FAM-NEW-COINS-AMT
   *
   * @param number
   */
  public void setMmiFamNewCoinsAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiFamNewCoinsAmt = checkMmiFamNewCoinsAmtMaxLimit(number);
    serializeMmiFamNewCoinsAmt(mmiFamNewCoinsAmt);
  }

  public void setMmiFamNewCoinsAmt(long number) {
    number = checkMmiFamNewCoinsAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiFamNewCoinsAmt((int) number);
  }

  /**
   * Returns the value of mmiFamTxtSwapCd
   *
   * @return mmiFamTxtSwapCd
   */
  public char[] getMmiFamTxtSwapCd() throws CFException {
    if (isMmiFamTxtSwapCdModified()) {
      mmiFamTxtSwapCd = refreshMmiFamTxtSwapCd();
    }
    return mmiFamTxtSwapCd;
  }

  /**
   * set variable mmiFamTxtSwapCd Corresponding COBOL Variable is MMI-FAM-TXT-SWAP-CD
   *
   * @param value
   */
  public void setMmiFamTxtSwapCd(char[] value) {
    mmiFamTxtSwapCd = checkMmiFamTxtSwapCdConstraints(value);
    serializeMmiFamTxtSwapCd(mmiFamTxtSwapCd);
  }

  /**
   * Update MmiFamTxtSwapCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiFamTxtSwapCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiFamTxtSwapCd, mmiFamTxtSwapCd.length);
  }

  public void setMmiFamTxtSwapCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamTxtSwapCd, mmiFamTxtSwapCd.length);
  }

  /**
   * Update MmiFamTxtSwapCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFamTxtSwapCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamTxtSwapCd + targetIndex, targetLen);
  }

  /**
   * Update MmiFamTxtSwapCd with another Field
   *
   * @param value
   */
  public void setMmiFamTxtSwapCd(Field source) {
    replace(source, 0, source.length(), beginMmiFamTxtSwapCd, MMI_FAM_TXT_SWAP_CD_LEN);
  }

  /**
   * Update MmiFamTxtSwapCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiFamTxtSwapCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamTxtSwapCd, MMI_FAM_TXT_SWAP_CD_LEN);
  }

  /**
   * Update MmiFamTxtSwapCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFamTxtSwapCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamTxtSwapCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiFertCtrcptvCd
   *
   * @return mmiFertCtrcptvCd
   */
  public char[] getMmiFertCtrcptvCd() throws CFException {
    if (isMmiFertCtrcptvCdModified()) {
      mmiFertCtrcptvCd = refreshMmiFertCtrcptvCd();
    }
    return mmiFertCtrcptvCd;
  }

  /**
   * set variable mmiFertCtrcptvCd Corresponding COBOL Variable is MMI-FERT-CTRCPTV-CD
   *
   * @param value
   */
  public void setMmiFertCtrcptvCd(char[] value) {
    mmiFertCtrcptvCd = checkMmiFertCtrcptvCdConstraints(value);
    serializeMmiFertCtrcptvCd(mmiFertCtrcptvCd);
  }

  /**
   * Update MmiFertCtrcptvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiFertCtrcptvCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiFertCtrcptvCd, mmiFertCtrcptvCd.length);
  }

  public void setMmiFertCtrcptvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFertCtrcptvCd, mmiFertCtrcptvCd.length);
  }

  /**
   * Update MmiFertCtrcptvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFertCtrcptvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFertCtrcptvCd + targetIndex, targetLen);
  }

  /**
   * Update MmiFertCtrcptvCd with another Field
   *
   * @param value
   */
  public void setMmiFertCtrcptvCd(Field source) {
    replace(source, 0, source.length(), beginMmiFertCtrcptvCd, MMI_FERT_CTRCPTV_CD_LEN);
  }

  /**
   * Update MmiFertCtrcptvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiFertCtrcptvCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFertCtrcptvCd, MMI_FERT_CTRCPTV_CD_LEN);
  }

  /**
   * Update MmiFertCtrcptvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFertCtrcptvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFertCtrcptvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiObsolete2
   *
   * @return mmiObsolete2
   */
  public char[] getMmiObsolete2() throws CFException {
    if (isMmiObsolete2Modified()) {
      mmiObsolete2 = refreshMmiObsolete2();
    }
    return mmiObsolete2;
  }

  /**
   * set variable mmiObsolete2 Corresponding COBOL Variable is MMI-OBSOLETE2
   *
   * @param value
   */
  public void setMmiObsolete2(char[] value) {
    mmiObsolete2 = checkMmiObsolete2Constraints(value);
    serializeMmiObsolete2(mmiObsolete2);
  }

  /**
   * Update MmiObsolete2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiObsolete2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiObsolete2, mmiObsolete2.length);
  }

  public void setMmiObsolete2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete2, mmiObsolete2.length);
  }

  /**
   * Update MmiObsolete2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObsolete2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete2 + targetIndex, targetLen);
  }

  /**
   * Update MmiObsolete2 with another Field
   *
   * @param value
   */
  public void setMmiObsolete2(Field source) {
    replace(source, 0, source.length(), beginMmiObsolete2, MMI_OBSOLETE_2_LEN);
  }

  /**
   * Update MmiObsolete2 with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiObsolete2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete2, MMI_OBSOLETE_2_LEN);
  }

  /**
   * Update MmiObsolete2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObsolete2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete2 + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiHiDedPlnCd
   *
   * @return mmiHiDedPlnCd
   */
  public char[] getMmiHiDedPlnCd() throws CFException {
    if (isMmiHiDedPlnCdModified()) {
      mmiHiDedPlnCd = refreshMmiHiDedPlnCd();
    }
    return mmiHiDedPlnCd;
  }

  /**
   * set variable mmiHiDedPlnCd Corresponding COBOL Variable is MMI-HI-DED-PLN-CD
   *
   * @param value
   */
  public void setMmiHiDedPlnCd(char[] value) {
    mmiHiDedPlnCd = checkMmiHiDedPlnCdConstraints(value);
    serializeMmiHiDedPlnCd(mmiHiDedPlnCd);
  }

  /**
   * Update MmiHiDedPlnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiHiDedPlnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiHiDedPlnCd, mmiHiDedPlnCd.length);
  }

  public void setMmiHiDedPlnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiHiDedPlnCd, mmiHiDedPlnCd.length);
  }

  /**
   * Update MmiHiDedPlnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiHiDedPlnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiHiDedPlnCd + targetIndex, targetLen);
  }

  /**
   * Update MmiHiDedPlnCd with another Field
   *
   * @param value
   */
  public void setMmiHiDedPlnCd(Field source) {
    replace(source, 0, source.length(), beginMmiHiDedPlnCd, MMI_HI_DED_PLN_CD_LEN);
  }

  /**
   * Update MmiHiDedPlnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiHiDedPlnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiHiDedPlnCd, MMI_HI_DED_PLN_CD_LEN);
  }

  /**
   * Update MmiHiDedPlnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiHiDedPlnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiHiDedPlnCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiIplanTypCd
   *
   * @return mmiIplanTypCd
   */
  public char[] getMmiIplanTypCd() throws CFException {
    if (isMmiIplanTypCdModified()) {
      mmiIplanTypCd = refreshMmiIplanTypCd();
    }
    return mmiIplanTypCd;
  }

  /**
   * set variable mmiIplanTypCd Corresponding COBOL Variable is MMI-IPLAN-TYP-CD
   *
   * @param value
   */
  public void setMmiIplanTypCd(char[] value) {
    mmiIplanTypCd = checkMmiIplanTypCdConstraints(value);
    serializeMmiIplanTypCd(mmiIplanTypCd);
  }

  /**
   * Update MmiIplanTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiIplanTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiIplanTypCd, mmiIplanTypCd.length);
  }

  public void setMmiIplanTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIplanTypCd, mmiIplanTypCd.length);
  }

  /**
   * Update MmiIplanTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIplanTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIplanTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiIplanTypCd with another Field
   *
   * @param value
   */
  public void setMmiIplanTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiIplanTypCd, MMI_IPLAN_TYP_CD_LEN);
  }

  /**
   * Update MmiIplanTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiIplanTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIplanTypCd, MMI_IPLAN_TYP_CD_LEN);
  }

  /**
   * Update MmiIplanTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIplanTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIplanTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiLftmMaxAmt
   *
   * @return mmiLftmMaxAmt
   */
  public int getMmiLftmMaxAmt() throws CFException {
    if (isMmiLftmMaxAmtModified()) {
      mmiLftmMaxAmt = refreshMmiLftmMaxAmt();
    }
    return mmiLftmMaxAmt;
  }

  /**
   * Update MmiLftmMaxAmt with the passed value Corresponding COBOL Variable is MMI-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setMmiLftmMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiLftmMaxAmt = checkMmiLftmMaxAmtMaxLimit(number);
    serializeMmiLftmMaxAmt(mmiLftmMaxAmt);
  }

  public void setMmiLftmMaxAmt(long number) {
    number = checkMmiLftmMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiLftmMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiMbrNtwkKeyMtchCd
   *
   * @return mmiMbrNtwkKeyMtchCd
   */
  public char[] getMmiMbrNtwkKeyMtchCd() throws CFException {
    if (isMmiMbrNtwkKeyMtchCdModified()) {
      mmiMbrNtwkKeyMtchCd = refreshMmiMbrNtwkKeyMtchCd();
    }
    return mmiMbrNtwkKeyMtchCd;
  }

  /**
   * set variable mmiMbrNtwkKeyMtchCd Corresponding COBOL Variable is MMI-MBR-NTWK-KEY-MTCH-CD
   *
   * @param value
   */
  public void setMmiMbrNtwkKeyMtchCd(char[] value) {
    mmiMbrNtwkKeyMtchCd = checkMmiMbrNtwkKeyMtchCdConstraints(value);
    serializeMmiMbrNtwkKeyMtchCd(mmiMbrNtwkKeyMtchCd);
  }

  /**
   * Update MmiMbrNtwkKeyMtchCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiMbrNtwkKeyMtchCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiMbrNtwkKeyMtchCd, mmiMbrNtwkKeyMtchCd.length);
  }

  public void setMmiMbrNtwkKeyMtchCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrNtwkKeyMtchCd, mmiMbrNtwkKeyMtchCd.length);
  }

  /**
   * Update MmiMbrNtwkKeyMtchCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMbrNtwkKeyMtchCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrNtwkKeyMtchCd + targetIndex, targetLen);
  }

  /**
   * Update MmiMbrNtwkKeyMtchCd with another Field
   *
   * @param value
   */
  public void setMmiMbrNtwkKeyMtchCd(Field source) {
    replace(source, 0, source.length(), beginMmiMbrNtwkKeyMtchCd, MMI_MBR_NTWK_KEY_MTCH_CD_LEN);
  }

  /**
   * Update MmiMbrNtwkKeyMtchCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiMbrNtwkKeyMtchCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrNtwkKeyMtchCd, MMI_MBR_NTWK_KEY_MTCH_CD_LEN);
  }

  /**
   * Update MmiMbrNtwkKeyMtchCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMbrNtwkKeyMtchCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrNtwkKeyMtchCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiMbrPrdctCd
   *
   * @return mmiMbrPrdctCd
   */
  public char[] getMmiMbrPrdctCd() throws CFException {
    if (isMmiMbrPrdctCdModified()) {
      mmiMbrPrdctCd = refreshMmiMbrPrdctCd();
    }
    return mmiMbrPrdctCd;
  }

  /**
   * set variable mmiMbrPrdctCd Corresponding COBOL Variable is MMI-MBR-PRDCT-CD
   *
   * @param value
   */
  public void setMmiMbrPrdctCd(char[] value) {
    mmiMbrPrdctCd = checkMmiMbrPrdctCdConstraints(value);
    serializeMmiMbrPrdctCd(mmiMbrPrdctCd);
  }

  /**
   * Update MmiMbrPrdctCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiMbrPrdctCd, mmiMbrPrdctCd.length);
  }

  public void setMmiMbrPrdctCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctCd, mmiMbrPrdctCd.length);
  }

  /**
   * Update MmiMbrPrdctCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctCd + targetIndex, targetLen);
  }

  /**
   * Update MmiMbrPrdctCd with another Field
   *
   * @param value
   */
  public void setMmiMbrPrdctCd(Field source) {
    replace(source, 0, source.length(), beginMmiMbrPrdctCd, MMI_MBR_PRDCT_CD_LEN);
  }

  /**
   * Update MmiMbrPrdctCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctCd, MMI_MBR_PRDCT_CD_LEN);
  }

  /**
   * Update MmiMbrPrdctCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiMbrPrdctTypCd
   *
   * @return mmiMbrPrdctTypCd
   */
  public char[] getMmiMbrPrdctTypCd() throws CFException {
    if (isMmiMbrPrdctTypCdModified()) {
      mmiMbrPrdctTypCd = refreshMmiMbrPrdctTypCd();
    }
    return mmiMbrPrdctTypCd;
  }

  /**
   * set variable mmiMbrPrdctTypCd Corresponding COBOL Variable is MMI-MBR-PRDCT-TYP-CD
   *
   * @param value
   */
  public void setMmiMbrPrdctTypCd(char[] value) {
    mmiMbrPrdctTypCd = checkMmiMbrPrdctTypCdConstraints(value);
    serializeMmiMbrPrdctTypCd(mmiMbrPrdctTypCd);
  }

  /**
   * Update MmiMbrPrdctTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiMbrPrdctTypCd, mmiMbrPrdctTypCd.length);
  }

  public void setMmiMbrPrdctTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctTypCd, mmiMbrPrdctTypCd.length);
  }

  /**
   * Update MmiMbrPrdctTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiMbrPrdctTypCd with another Field
   *
   * @param value
   */
  public void setMmiMbrPrdctTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiMbrPrdctTypCd, MMI_MBR_PRDCT_TYP_CD_LEN);
  }

  /**
   * Update MmiMbrPrdctTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctTypCd, MMI_MBR_PRDCT_TYP_CD_LEN);
  }

  /**
   * Update MmiMbrPrdctTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMbrPrdctTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMbrPrdctTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiMnrpCd
   *
   * @return mmiMnrpCd
   */
  public char[] getMmiMnrpCd() throws CFException {
    if (isMmiMnrpCdModified()) {
      mmiMnrpCd = refreshMmiMnrpCd();
    }
    return mmiMnrpCd;
  }

  /**
   * set variable mmiMnrpCd Corresponding COBOL Variable is MMI-MNRP-CD
   *
   * @param value
   */
  public void setMmiMnrpCd(char[] value) {
    mmiMnrpCd = checkMmiMnrpCdConstraints(value);
    serializeMmiMnrpCd(mmiMnrpCd);
  }

  /**
   * Update MmiMnrpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiMnrpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiMnrpCd, mmiMnrpCd.length);
  }

  public void setMmiMnrpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMnrpCd, mmiMnrpCd.length);
  }

  /**
   * Update MmiMnrpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMnrpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMnrpCd + targetIndex, targetLen);
  }

  /**
   * Update MmiMnrpCd with another Field
   *
   * @param value
   */
  public void setMmiMnrpCd(Field source) {
    replace(source, 0, source.length(), beginMmiMnrpCd, MMI_MNRP_CD_LEN);
  }

  /**
   * Update MmiMnrpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiMnrpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMnrpCd, MMI_MNRP_CD_LEN);
  }

  /**
   * Update MmiMnrpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMnrpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMnrpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiMnrpPct
   *
   * @return mmiMnrpPct
   */
  public short getMmiMnrpPct() throws CFException {
    if (isMmiMnrpPctModified()) {
      mmiMnrpPct = refreshMmiMnrpPct();
    }
    return mmiMnrpPct;
  }

  /**
   * Update MmiMnrpPct with the passed value Corresponding COBOL Variable is MMI-MNRP-PCT
   *
   * @param number
   */
  public void setMmiMnrpPct(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiMnrpPct = checkMmiMnrpPctMaxLimit(number);
    serializeMmiMnrpPct(mmiMnrpPct);
  }

  public void setMmiMnrpPct(int number) {
    number = checkMmiMnrpPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setMmiMnrpPct((short) number);
  }

  public void setMmiMnrpPct(long number) {
    number = checkMmiMnrpPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setMmiMnrpPct((short) number);
  }

  /**
   * Returns the value of mmiMntlUbhCd
   *
   * @return mmiMntlUbhCd
   */
  public char[] getMmiMntlUbhCd() throws CFException {
    if (isMmiMntlUbhCdModified()) {
      mmiMntlUbhCd = refreshMmiMntlUbhCd();
    }
    return mmiMntlUbhCd;
  }

  /**
   * set variable mmiMntlUbhCd Corresponding COBOL Variable is MMI-MNTL-UBH-CD
   *
   * @param value
   */
  public void setMmiMntlUbhCd(char[] value) {
    mmiMntlUbhCd = checkMmiMntlUbhCdConstraints(value);
    serializeMmiMntlUbhCd(mmiMntlUbhCd);
  }

  /**
   * Update MmiMntlUbhCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiMntlUbhCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiMntlUbhCd, mmiMntlUbhCd.length);
  }

  public void setMmiMntlUbhCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMntlUbhCd, mmiMntlUbhCd.length);
  }

  /**
   * Update MmiMntlUbhCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMntlUbhCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMntlUbhCd + targetIndex, targetLen);
  }

  /**
   * Update MmiMntlUbhCd with another Field
   *
   * @param value
   */
  public void setMmiMntlUbhCd(Field source) {
    replace(source, 0, source.length(), beginMmiMntlUbhCd, MMI_MNTL_UBH_CD_LEN);
  }

  /**
   * Update MmiMntlUbhCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiMntlUbhCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMntlUbhCd, MMI_MNTL_UBH_CD_LEN);
  }

  /**
   * Update MmiMntlUbhCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMntlUbhCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMntlUbhCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNewCoinsAmt
   *
   * @return mmiNewCoinsAmt
   */
  public int getMmiNewCoinsAmt() throws CFException {
    if (isMmiNewCoinsAmtModified()) {
      mmiNewCoinsAmt = refreshMmiNewCoinsAmt();
    }
    return mmiNewCoinsAmt;
  }

  /**
   * Update MmiNewCoinsAmt with the passed value Corresponding COBOL Variable is MMI-NEW-COINS-AMT
   *
   * @param number
   */
  public void setMmiNewCoinsAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiNewCoinsAmt = checkMmiNewCoinsAmtMaxLimit(number);
    serializeMmiNewCoinsAmt(mmiNewCoinsAmt);
  }

  public void setMmiNewCoinsAmt(long number) {
    number = checkMmiNewCoinsAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiNewCoinsAmt((int) number);
  }

  /**
   * Returns the value of mmiNewCoinsCombPrscCd
   *
   * @return mmiNewCoinsCombPrscCd
   */
  public char[] getMmiNewCoinsCombPrscCd() throws CFException {
    if (isMmiNewCoinsCombPrscCdModified()) {
      mmiNewCoinsCombPrscCd = refreshMmiNewCoinsCombPrscCd();
    }
    return mmiNewCoinsCombPrscCd;
  }

  /**
   * set variable mmiNewCoinsCombPrscCd Corresponding COBOL Variable is MMI-NEW-COINS-COMB-PRSC-CD
   *
   * @param value
   */
  public void setMmiNewCoinsCombPrscCd(char[] value) {
    mmiNewCoinsCombPrscCd = checkMmiNewCoinsCombPrscCdConstraints(value);
    serializeMmiNewCoinsCombPrscCd(mmiNewCoinsCombPrscCd);
  }

  /**
   * Update MmiNewCoinsCombPrscCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsCombPrscCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiNewCoinsCombPrscCd,
        mmiNewCoinsCombPrscCd.length);
  }

  public void setMmiNewCoinsCombPrscCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiNewCoinsCombPrscCd, mmiNewCoinsCombPrscCd.length);
  }

  /**
   * Update MmiNewCoinsCombPrscCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsCombPrscCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsCombPrscCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNewCoinsCombPrscCd with another Field
   *
   * @param value
   */
  public void setMmiNewCoinsCombPrscCd(Field source) {
    replace(source, 0, source.length(), beginMmiNewCoinsCombPrscCd, MMI_NEW_COINS_COMB_PRSC_CD_LEN);
  }

  /**
   * Update MmiNewCoinsCombPrscCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsCombPrscCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiNewCoinsCombPrscCd, MMI_NEW_COINS_COMB_PRSC_CD_LEN);
  }

  /**
   * Update MmiNewCoinsCombPrscCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiNewCoinsCombPrscCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsCombPrscCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNewCoinsPrdCd
   *
   * @return mmiNewCoinsPrdCd
   */
  public char[] getMmiNewCoinsPrdCd() throws CFException {
    if (isMmiNewCoinsPrdCdModified()) {
      mmiNewCoinsPrdCd = refreshMmiNewCoinsPrdCd();
    }
    return mmiNewCoinsPrdCd;
  }

  /**
   * set variable mmiNewCoinsPrdCd Corresponding COBOL Variable is MMI-NEW-COINS-PRD-CD
   *
   * @param value
   */
  public void setMmiNewCoinsPrdCd(char[] value) {
    mmiNewCoinsPrdCd = checkMmiNewCoinsPrdCdConstraints(value);
    serializeMmiNewCoinsPrdCd(mmiNewCoinsPrdCd);
  }

  /**
   * Update MmiNewCoinsPrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsPrdCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNewCoinsPrdCd, mmiNewCoinsPrdCd.length);
  }

  public void setMmiNewCoinsPrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsPrdCd, mmiNewCoinsPrdCd.length);
  }

  /**
   * Update MmiNewCoinsPrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsPrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsPrdCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNewCoinsPrdCd with another Field
   *
   * @param value
   */
  public void setMmiNewCoinsPrdCd(Field source) {
    replace(source, 0, source.length(), beginMmiNewCoinsPrdCd, MMI_NEW_COINS_PRD_CD_LEN);
  }

  /**
   * Update MmiNewCoinsPrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsPrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsPrdCd, MMI_NEW_COINS_PRD_CD_LEN);
  }

  /**
   * Update MmiNewCoinsPrdCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsPrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsPrdCd + targetIndex, targetLen);
  }

  public BigDecimal getMmiNewCoinsSalFamMultFct() throws CFException {
    if (isMmiNewCoinsSalFamMultFctModified()) {
      mmiNewCoinsSalFamMultFct = refreshMmiNewCoinsSalFamMultFct();
    }
    return mmiNewCoinsSalFamMultFct;
  }

  public char[] getMmiNewCoinsSalFamMultFctString() {
    return mmiNewCoinsSalFamMultFctString();
  }

  /**
   * Update MmiNewCoinsSalFamMultFct with the passed number Corresponding COBOL Variable is
   * MMI-NEW-COINS-SAL-FAM-MULT-FCT
   *
   * @param number
   */
  public void setMmiNewCoinsSalFamMultFct(BigDecimal number) {
    mmiNewCoinsSalFamMultFct = checkMmiNewCoinsSalFamMultFctMaxLimit(number);
    serializeMmiNewCoinsSalFamMultFct(mmiNewCoinsSalFamMultFct);
  }
  /**
   * Returns the value of mmiNewCoinsSalFamTypCd
   *
   * @return mmiNewCoinsSalFamTypCd
   */
  public char[] getMmiNewCoinsSalFamTypCd() throws CFException {
    if (isMmiNewCoinsSalFamTypCdModified()) {
      mmiNewCoinsSalFamTypCd = refreshMmiNewCoinsSalFamTypCd();
    }
    return mmiNewCoinsSalFamTypCd;
  }

  /**
   * set variable mmiNewCoinsSalFamTypCd Corresponding COBOL Variable is
   * MMI-NEW-COINS-SAL-FAM-TYP-CD
   *
   * @param value
   */
  public void setMmiNewCoinsSalFamTypCd(char[] value) {
    mmiNewCoinsSalFamTypCd = checkMmiNewCoinsSalFamTypCdConstraints(value);
    serializeMmiNewCoinsSalFamTypCd(mmiNewCoinsSalFamTypCd);
  }

  /**
   * Update MmiNewCoinsSalFamTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsSalFamTypCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiNewCoinsSalFamTypCd,
        mmiNewCoinsSalFamTypCd.length);
  }

  public void setMmiNewCoinsSalFamTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiNewCoinsSalFamTypCd, mmiNewCoinsSalFamTypCd.length);
  }

  /**
   * Update MmiNewCoinsSalFamTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsSalFamTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsSalFamTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNewCoinsSalFamTypCd with another Field
   *
   * @param value
   */
  public void setMmiNewCoinsSalFamTypCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiNewCoinsSalFamTypCd, MMI_NEW_COINS_SAL_FAM_TYP_CD_LEN);
  }

  /**
   * Update MmiNewCoinsSalFamTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsSalFamTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiNewCoinsSalFamTypCd,
        MMI_NEW_COINS_SAL_FAM_TYP_CD_LEN);
  }

  /**
   * Update MmiNewCoinsSalFamTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiNewCoinsSalFamTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsSalFamTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNewCoinsSalIndvTypCd
   *
   * @return mmiNewCoinsSalIndvTypCd
   */
  public char[] getMmiNewCoinsSalIndvTypCd() throws CFException {
    if (isMmiNewCoinsSalIndvTypCdModified()) {
      mmiNewCoinsSalIndvTypCd = refreshMmiNewCoinsSalIndvTypCd();
    }
    return mmiNewCoinsSalIndvTypCd;
  }

  /**
   * set variable mmiNewCoinsSalIndvTypCd Corresponding COBOL Variable is
   * MMI-NEW-COINS-SAL-INDV-TYP-CD
   *
   * @param value
   */
  public void setMmiNewCoinsSalIndvTypCd(char[] value) {
    mmiNewCoinsSalIndvTypCd = checkMmiNewCoinsSalIndvTypCdConstraints(value);
    serializeMmiNewCoinsSalIndvTypCd(mmiNewCoinsSalIndvTypCd);
  }

  /**
   * Update MmiNewCoinsSalIndvTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsSalIndvTypCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiNewCoinsSalIndvTypCd,
        mmiNewCoinsSalIndvTypCd.length);
  }

  public void setMmiNewCoinsSalIndvTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiNewCoinsSalIndvTypCd,
        mmiNewCoinsSalIndvTypCd.length);
  }

  /**
   * Update MmiNewCoinsSalIndvTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsSalIndvTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsSalIndvTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNewCoinsSalIndvTypCd with another Field
   *
   * @param value
   */
  public void setMmiNewCoinsSalIndvTypCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginMmiNewCoinsSalIndvTypCd,
        MMI_NEW_COINS_SAL_INDV_TYP_CD_LEN);
  }

  /**
   * Update MmiNewCoinsSalIndvTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsSalIndvTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiNewCoinsSalIndvTypCd,
        MMI_NEW_COINS_SAL_INDV_TYP_CD_LEN);
  }

  /**
   * Update MmiNewCoinsSalIndvTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiNewCoinsSalIndvTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsSalIndvTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNoblxLabInd
   *
   * @return mmiNoblxLabInd
   */
  public char[] getMmiNoblxLabInd() throws CFException {
    if (isMmiNoblxLabIndModified()) {
      mmiNoblxLabInd = refreshMmiNoblxLabInd();
    }
    return mmiNoblxLabInd;
  }

  /**
   * set variable mmiNoblxLabInd Corresponding COBOL Variable is MMI-NOBLX-LAB-IND
   *
   * @param value
   */
  public void setMmiNoblxLabInd(char[] value) {
    mmiNoblxLabInd = checkMmiNoblxLabIndConstraints(value);
    serializeMmiNoblxLabInd(mmiNoblxLabInd);
  }

  /**
   * Update MmiNoblxLabInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNoblxLabInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNoblxLabInd, mmiNoblxLabInd.length);
  }

  public void setMmiNoblxLabInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNoblxLabInd, mmiNoblxLabInd.length);
  }

  /**
   * Update MmiNoblxLabInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNoblxLabInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNoblxLabInd + targetIndex, targetLen);
  }

  /**
   * Update MmiNoblxLabInd with another Field
   *
   * @param value
   */
  public void setMmiNoblxLabInd(Field source) {
    replace(source, 0, source.length(), beginMmiNoblxLabInd, MMI_NOBLX_LAB_IND_LEN);
  }

  /**
   * Update MmiNoblxLabInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNoblxLabInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNoblxLabInd, MMI_NOBLX_LAB_IND_LEN);
  }

  /**
   * Update MmiNoblxLabInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNoblxLabInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNoblxLabInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNonEmbdDedCd
   *
   * @return mmiNonEmbdDedCd
   */
  public char[] getMmiNonEmbdDedCd() throws CFException {
    if (isMmiNonEmbdDedCdModified()) {
      mmiNonEmbdDedCd = refreshMmiNonEmbdDedCd();
    }
    return mmiNonEmbdDedCd;
  }

  /**
   * set variable mmiNonEmbdDedCd Corresponding COBOL Variable is MMI-NON-EMBD-DED-CD
   *
   * @param value
   */
  public void setMmiNonEmbdDedCd(char[] value) {
    mmiNonEmbdDedCd = checkMmiNonEmbdDedCdConstraints(value);
    serializeMmiNonEmbdDedCd(mmiNonEmbdDedCd);
  }

  /**
   * Update MmiNonEmbdDedCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdDedCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNonEmbdDedCd, mmiNonEmbdDedCd.length);
  }

  public void setMmiNonEmbdDedCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdDedCd, mmiNonEmbdDedCd.length);
  }

  /**
   * Update MmiNonEmbdDedCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdDedCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdDedCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNonEmbdDedCd with another Field
   *
   * @param value
   */
  public void setMmiNonEmbdDedCd(Field source) {
    replace(source, 0, source.length(), beginMmiNonEmbdDedCd, MMI_NON_EMBD_DED_CD_LEN);
  }

  /**
   * Update MmiNonEmbdDedCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdDedCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdDedCd, MMI_NON_EMBD_DED_CD_LEN);
  }

  /**
   * Update MmiNonEmbdDedCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdDedCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdDedCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNonEmrgInd
   *
   * @return mmiNonEmrgInd
   */
  public char[] getMmiNonEmrgInd() throws CFException {
    if (isMmiNonEmrgIndModified()) {
      mmiNonEmrgInd = refreshMmiNonEmrgInd();
    }
    return mmiNonEmrgInd;
  }

  /**
   * set variable mmiNonEmrgInd Corresponding COBOL Variable is MMI-NON-EMRG-IND
   *
   * @param value
   */
  public void setMmiNonEmrgInd(char[] value) {
    mmiNonEmrgInd = checkMmiNonEmrgIndConstraints(value);
    serializeMmiNonEmrgInd(mmiNonEmrgInd);
  }

  /**
   * Update MmiNonEmrgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmrgInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNonEmrgInd, mmiNonEmrgInd.length);
  }

  public void setMmiNonEmrgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmrgInd, mmiNonEmrgInd.length);
  }

  /**
   * Update MmiNonEmrgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmrgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmrgInd + targetIndex, targetLen);
  }

  /**
   * Update MmiNonEmrgInd with another Field
   *
   * @param value
   */
  public void setMmiNonEmrgInd(Field source) {
    replace(source, 0, source.length(), beginMmiNonEmrgInd, MMI_NON_EMRG_IND_LEN);
  }

  /**
   * Update MmiNonEmrgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmrgInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmrgInd, MMI_NON_EMRG_IND_LEN);
  }

  /**
   * Update MmiNonEmrgInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmrgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmrgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNtfyCrdcEpInd
   *
   * @return mmiNtfyCrdcEpInd
   */
  public char[] getMmiNtfyCrdcEpInd() throws CFException {
    if (isMmiNtfyCrdcEpIndModified()) {
      mmiNtfyCrdcEpInd = refreshMmiNtfyCrdcEpInd();
    }
    return mmiNtfyCrdcEpInd;
  }

  /**
   * set variable mmiNtfyCrdcEpInd Corresponding COBOL Variable is MMI-NTFY-CRDC-EP-IND
   *
   * @param value
   */
  public void setMmiNtfyCrdcEpInd(char[] value) {
    mmiNtfyCrdcEpInd = checkMmiNtfyCrdcEpIndConstraints(value);
    serializeMmiNtfyCrdcEpInd(mmiNtfyCrdcEpInd);
  }

  /**
   * Update MmiNtfyCrdcEpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNtfyCrdcEpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNtfyCrdcEpInd, mmiNtfyCrdcEpInd.length);
  }

  public void setMmiNtfyCrdcEpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNtfyCrdcEpInd, mmiNtfyCrdcEpInd.length);
  }

  /**
   * Update MmiNtfyCrdcEpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNtfyCrdcEpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNtfyCrdcEpInd + targetIndex, targetLen);
  }

  /**
   * Update MmiNtfyCrdcEpInd with another Field
   *
   * @param value
   */
  public void setMmiNtfyCrdcEpInd(Field source) {
    replace(source, 0, source.length(), beginMmiNtfyCrdcEpInd, MMI_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update MmiNtfyCrdcEpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNtfyCrdcEpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNtfyCrdcEpInd, MMI_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update MmiNtfyCrdcEpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNtfyCrdcEpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNtfyCrdcEpInd + targetIndex, targetLen);
  }

  public BigDecimal getMmiNtwkPcpCopayAmt() throws CFException {
    if (isMmiNtwkPcpCopayAmtModified()) {
      mmiNtwkPcpCopayAmt = refreshMmiNtwkPcpCopayAmt();
    }
    return mmiNtwkPcpCopayAmt;
  }

  public char[] getMmiNtwkPcpCopayAmtString() {
    return mmiNtwkPcpCopayAmtString();
  }

  /**
   * Update MmiNtwkPcpCopayAmt with the passed number Corresponding COBOL Variable is
   * MMI-NTWK-PCP-COPAY-AMT
   *
   * @param number
   */
  public void setMmiNtwkPcpCopayAmt(BigDecimal number) {
    mmiNtwkPcpCopayAmt = checkMmiNtwkPcpCopayAmtMaxLimit(number);
    serializeMmiNtwkPcpCopayAmt(mmiNtwkPcpCopayAmt);
  }
  /**
   * Returns the value of mmiObgynPcpCopayInd
   *
   * @return mmiObgynPcpCopayInd
   */
  public char[] getMmiObgynPcpCopayInd() throws CFException {
    if (isMmiObgynPcpCopayIndModified()) {
      mmiObgynPcpCopayInd = refreshMmiObgynPcpCopayInd();
    }
    return mmiObgynPcpCopayInd;
  }

  /**
   * set variable mmiObgynPcpCopayInd Corresponding COBOL Variable is MMI-OBGYN-PCP-COPAY-IND
   *
   * @param value
   */
  public void setMmiObgynPcpCopayInd(char[] value) {
    mmiObgynPcpCopayInd = checkMmiObgynPcpCopayIndConstraints(value);
    serializeMmiObgynPcpCopayInd(mmiObgynPcpCopayInd);
  }

  /**
   * Update MmiObgynPcpCopayInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiObgynPcpCopayInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiObgynPcpCopayInd, mmiObgynPcpCopayInd.length);
  }

  public void setMmiObgynPcpCopayInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObgynPcpCopayInd, mmiObgynPcpCopayInd.length);
  }

  /**
   * Update MmiObgynPcpCopayInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObgynPcpCopayInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObgynPcpCopayInd + targetIndex, targetLen);
  }

  /**
   * Update MmiObgynPcpCopayInd with another Field
   *
   * @param value
   */
  public void setMmiObgynPcpCopayInd(Field source) {
    replace(source, 0, source.length(), beginMmiObgynPcpCopayInd, MMI_OBGYN_PCP_COPAY_IND_LEN);
  }

  /**
   * Update MmiObgynPcpCopayInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiObgynPcpCopayInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObgynPcpCopayInd, MMI_OBGYN_PCP_COPAY_IND_LEN);
  }

  /**
   * Update MmiObgynPcpCopayInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObgynPcpCopayInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObgynPcpCopayInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiOfcVstMaxRmrkCd
   *
   * @return mmiOfcVstMaxRmrkCd
   */
  public char[] getMmiOfcVstMaxRmrkCd() throws CFException {
    if (isMmiOfcVstMaxRmrkCdModified()) {
      mmiOfcVstMaxRmrkCd = refreshMmiOfcVstMaxRmrkCd();
    }
    return mmiOfcVstMaxRmrkCd;
  }

  /**
   * set variable mmiOfcVstMaxRmrkCd Corresponding COBOL Variable is MMI-OFC-VST-MAX-RMRK-CD
   *
   * @param value
   */
  public void setMmiOfcVstMaxRmrkCd(char[] value) {
    mmiOfcVstMaxRmrkCd = checkMmiOfcVstMaxRmrkCdConstraints(value);
    serializeMmiOfcVstMaxRmrkCd(mmiOfcVstMaxRmrkCd);
  }

  /**
   * Update MmiOfcVstMaxRmrkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiOfcVstMaxRmrkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiOfcVstMaxRmrkCd, mmiOfcVstMaxRmrkCd.length);
  }

  public void setMmiOfcVstMaxRmrkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOfcVstMaxRmrkCd, mmiOfcVstMaxRmrkCd.length);
  }

  /**
   * Update MmiOfcVstMaxRmrkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOfcVstMaxRmrkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOfcVstMaxRmrkCd + targetIndex, targetLen);
  }

  /**
   * Update MmiOfcVstMaxRmrkCd with another Field
   *
   * @param value
   */
  public void setMmiOfcVstMaxRmrkCd(Field source) {
    replace(source, 0, source.length(), beginMmiOfcVstMaxRmrkCd, MMI_OFC_VST_MAX_RMRK_CD_LEN);
  }

  /**
   * Update MmiOfcVstMaxRmrkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiOfcVstMaxRmrkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOfcVstMaxRmrkCd, MMI_OFC_VST_MAX_RMRK_CD_LEN);
  }

  /**
   * Update MmiOfcVstMaxRmrkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOfcVstMaxRmrkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOfcVstMaxRmrkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiOopCombEeChrgAmt
   *
   * @return mmiOopCombEeChrgAmt
   */
  public int getMmiOopCombEeChrgAmt() throws CFException {
    if (isMmiOopCombEeChrgAmtModified()) {
      mmiOopCombEeChrgAmt = refreshMmiOopCombEeChrgAmt();
    }
    return mmiOopCombEeChrgAmt;
  }

  /**
   * Update MmiOopCombEeChrgAmt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-COMB-EE-CHRG-AMT
   *
   * @param number
   */
  public void setMmiOopCombEeChrgAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopCombEeChrgAmt = checkMmiOopCombEeChrgAmtMaxLimit(number);
    serializeMmiOopCombEeChrgAmt(mmiOopCombEeChrgAmt);
  }

  public void setMmiOopCombEeChrgAmt(long number) {
    number = checkMmiOopCombEeChrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopCombEeChrgAmt((int) number);
  }

  /**
   * Returns the value of mmiOopCombEePls1Amt
   *
   * @return mmiOopCombEePls1Amt
   */
  public int getMmiOopCombEePls1Amt() throws CFException {
    if (isMmiOopCombEePls1AmtModified()) {
      mmiOopCombEePls1Amt = refreshMmiOopCombEePls1Amt();
    }
    return mmiOopCombEePls1Amt;
  }

  /**
   * Update MmiOopCombEePls1Amt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-COMB-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setMmiOopCombEePls1Amt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopCombEePls1Amt = checkMmiOopCombEePls1AmtMaxLimit(number);
    serializeMmiOopCombEePls1Amt(mmiOopCombEePls1Amt);
  }

  public void setMmiOopCombEePls1Amt(long number) {
    number = checkMmiOopCombEePls1AmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopCombEePls1Amt((int) number);
  }

  /**
   * Returns the value of mmiOopCombEeSpoAmt
   *
   * @return mmiOopCombEeSpoAmt
   */
  public int getMmiOopCombEeSpoAmt() throws CFException {
    if (isMmiOopCombEeSpoAmtModified()) {
      mmiOopCombEeSpoAmt = refreshMmiOopCombEeSpoAmt();
    }
    return mmiOopCombEeSpoAmt;
  }

  /**
   * Update MmiOopCombEeSpoAmt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-COMB-EE-SPO-AMT
   *
   * @param number
   */
  public void setMmiOopCombEeSpoAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopCombEeSpoAmt = checkMmiOopCombEeSpoAmtMaxLimit(number);
    serializeMmiOopCombEeSpoAmt(mmiOopCombEeSpoAmt);
  }

  public void setMmiOopCombEeSpoAmt(long number) {
    number = checkMmiOopCombEeSpoAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopCombEeSpoAmt((int) number);
  }

  /**
   * Returns the value of mmiOopCombFamAmt
   *
   * @return mmiOopCombFamAmt
   */
  public int getMmiOopCombFamAmt() throws CFException {
    if (isMmiOopCombFamAmtModified()) {
      mmiOopCombFamAmt = refreshMmiOopCombFamAmt();
    }
    return mmiOopCombFamAmt;
  }

  /**
   * Update MmiOopCombFamAmt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-COMB-FAM-AMT
   *
   * @param number
   */
  public void setMmiOopCombFamAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopCombFamAmt = checkMmiOopCombFamAmtMaxLimit(number);
    serializeMmiOopCombFamAmt(mmiOopCombFamAmt);
  }

  public void setMmiOopCombFamAmt(long number) {
    number = checkMmiOopCombFamAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopCombFamAmt((int) number);
  }

  /**
   * Returns the value of mmiOopCombIndvAmt
   *
   * @return mmiOopCombIndvAmt
   */
  public int getMmiOopCombIndvAmt() throws CFException {
    if (isMmiOopCombIndvAmtModified()) {
      mmiOopCombIndvAmt = refreshMmiOopCombIndvAmt();
    }
    return mmiOopCombIndvAmt;
  }

  /**
   * Update MmiOopCombIndvAmt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-COMB-INDV-AMT
   *
   * @param number
   */
  public void setMmiOopCombIndvAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopCombIndvAmt = checkMmiOopCombIndvAmtMaxLimit(number);
    serializeMmiOopCombIndvAmt(mmiOopCombIndvAmt);
  }

  public void setMmiOopCombIndvAmt(long number) {
    number = checkMmiOopCombIndvAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopCombIndvAmt((int) number);
  }

  /**
   * Returns the value of mmiOopCombNbrCd
   *
   * @return mmiOopCombNbrCd
   */
  public char[] getMmiOopCombNbrCd() throws CFException {
    if (isMmiOopCombNbrCdModified()) {
      mmiOopCombNbrCd = refreshMmiOopCombNbrCd();
    }
    return mmiOopCombNbrCd;
  }

  /**
   * set variable mmiOopCombNbrCd Corresponding COBOL Variable is MMI-OOP-COMB-NBR-CD
   *
   * @param value
   */
  public void setMmiOopCombNbrCd(char[] value) {
    mmiOopCombNbrCd = checkMmiOopCombNbrCdConstraints(value);
    serializeMmiOopCombNbrCd(mmiOopCombNbrCd);
  }

  /**
   * Update MmiOopCombNbrCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiOopCombNbrCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiOopCombNbrCd, mmiOopCombNbrCd.length);
  }

  public void setMmiOopCombNbrCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombNbrCd, mmiOopCombNbrCd.length);
  }

  /**
   * Update MmiOopCombNbrCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopCombNbrCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombNbrCd + targetIndex, targetLen);
  }

  /**
   * Update MmiOopCombNbrCd with another Field
   *
   * @param value
   */
  public void setMmiOopCombNbrCd(Field source) {
    replace(source, 0, source.length(), beginMmiOopCombNbrCd, MMI_OOP_COMB_NBR_CD_LEN);
  }

  /**
   * Update MmiOopCombNbrCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiOopCombNbrCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombNbrCd, MMI_OOP_COMB_NBR_CD_LEN);
  }

  /**
   * Update MmiOopCombNbrCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopCombNbrCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombNbrCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiOopCombPrscCd
   *
   * @return mmiOopCombPrscCd
   */
  public char[] getMmiOopCombPrscCd() throws CFException {
    if (isMmiOopCombPrscCdModified()) {
      mmiOopCombPrscCd = refreshMmiOopCombPrscCd();
    }
    return mmiOopCombPrscCd;
  }

  /**
   * set variable mmiOopCombPrscCd Corresponding COBOL Variable is MMI-OOP-COMB-PRSC-CD
   *
   * @param value
   */
  public void setMmiOopCombPrscCd(char[] value) {
    mmiOopCombPrscCd = checkMmiOopCombPrscCdConstraints(value);
    serializeMmiOopCombPrscCd(mmiOopCombPrscCd);
  }

  /**
   * Update MmiOopCombPrscCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiOopCombPrscCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiOopCombPrscCd, mmiOopCombPrscCd.length);
  }

  public void setMmiOopCombPrscCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombPrscCd, mmiOopCombPrscCd.length);
  }

  /**
   * Update MmiOopCombPrscCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopCombPrscCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombPrscCd + targetIndex, targetLen);
  }

  /**
   * Update MmiOopCombPrscCd with another Field
   *
   * @param value
   */
  public void setMmiOopCombPrscCd(Field source) {
    replace(source, 0, source.length(), beginMmiOopCombPrscCd, MMI_OOP_COMB_PRSC_CD_LEN);
  }

  /**
   * Update MmiOopCombPrscCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiOopCombPrscCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombPrscCd, MMI_OOP_COMB_PRSC_CD_LEN);
  }

  /**
   * Update MmiOopCombPrscCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopCombPrscCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopCombPrscCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiOopInNtwkEeChrgAmt
   *
   * @return mmiOopInNtwkEeChrgAmt
   */
  public int getMmiOopInNtwkEeChrgAmt() throws CFException {
    if (isMmiOopInNtwkEeChrgAmtModified()) {
      mmiOopInNtwkEeChrgAmt = refreshMmiOopInNtwkEeChrgAmt();
    }
    return mmiOopInNtwkEeChrgAmt;
  }

  /**
   * Update MmiOopInNtwkEeChrgAmt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-IN-NTWK-EE-CHRG-AMT
   *
   * @param number
   */
  public void setMmiOopInNtwkEeChrgAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopInNtwkEeChrgAmt = checkMmiOopInNtwkEeChrgAmtMaxLimit(number);
    serializeMmiOopInNtwkEeChrgAmt(mmiOopInNtwkEeChrgAmt);
  }

  public void setMmiOopInNtwkEeChrgAmt(long number) {
    number =
        checkMmiOopInNtwkEeChrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopInNtwkEeChrgAmt((int) number);
  }

  /**
   * Returns the value of mmiOopInNtwkEePls1Amt
   *
   * @return mmiOopInNtwkEePls1Amt
   */
  public int getMmiOopInNtwkEePls1Amt() throws CFException {
    if (isMmiOopInNtwkEePls1AmtModified()) {
      mmiOopInNtwkEePls1Amt = refreshMmiOopInNtwkEePls1Amt();
    }
    return mmiOopInNtwkEePls1Amt;
  }

  /**
   * Update MmiOopInNtwkEePls1Amt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-IN-NTWK-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setMmiOopInNtwkEePls1Amt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopInNtwkEePls1Amt = checkMmiOopInNtwkEePls1AmtMaxLimit(number);
    serializeMmiOopInNtwkEePls1Amt(mmiOopInNtwkEePls1Amt);
  }

  public void setMmiOopInNtwkEePls1Amt(long number) {
    number =
        checkMmiOopInNtwkEePls1AmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopInNtwkEePls1Amt((int) number);
  }

  /**
   * Returns the value of mmiOopInNtwkEeSpoAmt
   *
   * @return mmiOopInNtwkEeSpoAmt
   */
  public int getMmiOopInNtwkEeSpoAmt() throws CFException {
    if (isMmiOopInNtwkEeSpoAmtModified()) {
      mmiOopInNtwkEeSpoAmt = refreshMmiOopInNtwkEeSpoAmt();
    }
    return mmiOopInNtwkEeSpoAmt;
  }

  /**
   * Update MmiOopInNtwkEeSpoAmt with the passed value Corresponding COBOL Variable is
   * MMI-OOP-IN-NTWK-EE-SPO-AMT
   *
   * @param number
   */
  public void setMmiOopInNtwkEeSpoAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOopInNtwkEeSpoAmt = checkMmiOopInNtwkEeSpoAmtMaxLimit(number);
    serializeMmiOopInNtwkEeSpoAmt(mmiOopInNtwkEeSpoAmt);
  }

  public void setMmiOopInNtwkEeSpoAmt(long number) {
    number = checkMmiOopInNtwkEeSpoAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOopInNtwkEeSpoAmt((int) number);
  }

  /**
   * Returns the value of mmiOopUrgntCareCd
   *
   * @return mmiOopUrgntCareCd
   */
  public char[] getMmiOopUrgntCareCd() throws CFException {
    if (isMmiOopUrgntCareCdModified()) {
      mmiOopUrgntCareCd = refreshMmiOopUrgntCareCd();
    }
    return mmiOopUrgntCareCd;
  }

  /**
   * set variable mmiOopUrgntCareCd Corresponding COBOL Variable is MMI-OOP-URGNT-CARE-CD
   *
   * @param value
   */
  public void setMmiOopUrgntCareCd(char[] value) {
    mmiOopUrgntCareCd = checkMmiOopUrgntCareCdConstraints(value);
    serializeMmiOopUrgntCareCd(mmiOopUrgntCareCd);
  }

  /**
   * Update MmiOopUrgntCareCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiOopUrgntCareCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiOopUrgntCareCd, mmiOopUrgntCareCd.length);
  }

  public void setMmiOopUrgntCareCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopUrgntCareCd, mmiOopUrgntCareCd.length);
  }

  /**
   * Update MmiOopUrgntCareCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopUrgntCareCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopUrgntCareCd + targetIndex, targetLen);
  }

  /**
   * Update MmiOopUrgntCareCd with another Field
   *
   * @param value
   */
  public void setMmiOopUrgntCareCd(Field source) {
    replace(source, 0, source.length(), beginMmiOopUrgntCareCd, MMI_OOP_URGNT_CARE_CD_LEN);
  }

  /**
   * Update MmiOopUrgntCareCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiOopUrgntCareCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopUrgntCareCd, MMI_OOP_URGNT_CARE_CD_LEN);
  }

  /**
   * Update MmiOopUrgntCareCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopUrgntCareCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopUrgntCareCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiOthrRmrkCd
   *
   * @return mmiOthrRmrkCd
   */
  public char[] getMmiOthrRmrkCd() throws CFException {
    if (isMmiOthrRmrkCdModified()) {
      mmiOthrRmrkCd = refreshMmiOthrRmrkCd();
    }
    return mmiOthrRmrkCd;
  }

  /**
   * set variable mmiOthrRmrkCd Corresponding COBOL Variable is MMI-OTHR-RMRK-CD
   *
   * @param value
   */
  public void setMmiOthrRmrkCd(char[] value) {
    mmiOthrRmrkCd = checkMmiOthrRmrkCdConstraints(value);
    serializeMmiOthrRmrkCd(mmiOthrRmrkCd);
  }

  /**
   * Update MmiOthrRmrkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiOthrRmrkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiOthrRmrkCd, mmiOthrRmrkCd.length);
  }

  public void setMmiOthrRmrkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOthrRmrkCd, mmiOthrRmrkCd.length);
  }

  /**
   * Update MmiOthrRmrkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOthrRmrkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOthrRmrkCd + targetIndex, targetLen);
  }

  /**
   * Update MmiOthrRmrkCd with another Field
   *
   * @param value
   */
  public void setMmiOthrRmrkCd(Field source) {
    replace(source, 0, source.length(), beginMmiOthrRmrkCd, MMI_OTHR_RMRK_CD_LEN);
  }

  /**
   * Update MmiOthrRmrkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiOthrRmrkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOthrRmrkCd, MMI_OTHR_RMRK_CD_LEN);
  }

  /**
   * Update MmiOthrRmrkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOthrRmrkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOthrRmrkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiParsMnlProcInd
   *
   * @return mmiParsMnlProcInd
   */
  public char[] getMmiParsMnlProcInd() throws CFException {
    if (isMmiParsMnlProcIndModified()) {
      mmiParsMnlProcInd = refreshMmiParsMnlProcInd();
    }
    return mmiParsMnlProcInd;
  }

  /**
   * set variable mmiParsMnlProcInd Corresponding COBOL Variable is MMI-PARS-MNL-PROC-IND
   *
   * @param value
   */
  public void setMmiParsMnlProcInd(char[] value) {
    mmiParsMnlProcInd = checkMmiParsMnlProcIndConstraints(value);
    serializeMmiParsMnlProcInd(mmiParsMnlProcInd);
  }

  /**
   * Update MmiParsMnlProcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiParsMnlProcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiParsMnlProcInd, mmiParsMnlProcInd.length);
  }

  public void setMmiParsMnlProcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiParsMnlProcInd, mmiParsMnlProcInd.length);
  }

  /**
   * Update MmiParsMnlProcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiParsMnlProcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiParsMnlProcInd + targetIndex, targetLen);
  }

  /**
   * Update MmiParsMnlProcInd with another Field
   *
   * @param value
   */
  public void setMmiParsMnlProcInd(Field source) {
    replace(source, 0, source.length(), beginMmiParsMnlProcInd, MMI_PARS_MNL_PROC_IND_LEN);
  }

  /**
   * Update MmiParsMnlProcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiParsMnlProcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiParsMnlProcInd, MMI_PARS_MNL_PROC_IND_LEN);
  }

  /**
   * Update MmiParsMnlProcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiParsMnlProcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiParsMnlProcInd + targetIndex, targetLen);
  }

  public BigDecimal getMmiParsOopLmtAmt() throws CFException {
    if (isMmiParsOopLmtAmtModified()) {
      mmiParsOopLmtAmt = refreshMmiParsOopLmtAmt();
    }
    return mmiParsOopLmtAmt;
  }

  public char[] getMmiParsOopLmtAmtString() {
    return mmiParsOopLmtAmtString();
  }

  /**
   * Update MmiParsOopLmtAmt with the passed number Corresponding COBOL Variable is
   * MMI-PARS-OOP-LMT-AMT
   *
   * @param number
   */
  public void setMmiParsOopLmtAmt(BigDecimal number) {
    mmiParsOopLmtAmt = checkMmiParsOopLmtAmtMaxLimit(number);
    serializeMmiParsOopLmtAmt(mmiParsOopLmtAmt);
  }
  /**
   * Returns the value of mmiParsSurgSchedNbr
   *
   * @return mmiParsSurgSchedNbr
   */
  public short getMmiParsSurgSchedNbr() throws CFException {
    if (isMmiParsSurgSchedNbrModified()) {
      mmiParsSurgSchedNbr = refreshMmiParsSurgSchedNbr();
    }
    return mmiParsSurgSchedNbr;
  }

  /**
   * Update MmiParsSurgSchedNbr with the passed value Corresponding COBOL Variable is
   * MMI-PARS-SURG-SCHED-NBR
   *
   * @param number
   */
  public void setMmiParsSurgSchedNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiParsSurgSchedNbr = checkMmiParsSurgSchedNbrMaxLimit(number);
    serializeMmiParsSurgSchedNbr(mmiParsSurgSchedNbr);
  }

  public void setMmiParsSurgSchedNbr(int number) {
    number =
        checkMmiParsSurgSchedNbrMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiParsSurgSchedNbr((short) number);
  }

  public void setMmiParsSurgSchedNbr(long number) {
    number =
        checkMmiParsSurgSchedNbrMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiParsSurgSchedNbr((short) number);
  }

  /**
   * Returns the value of mmiPayLocCd
   *
   * @return mmiPayLocCd
   */
  public char[] getMmiPayLocCd() throws CFException {
    if (isMmiPayLocCdModified()) {
      mmiPayLocCd = refreshMmiPayLocCd();
    }
    return mmiPayLocCd;
  }

  /**
   * set variable mmiPayLocCd Corresponding COBOL Variable is MMI-PAY-LOC-CD
   *
   * @param value
   */
  public void setMmiPayLocCd(char[] value) {
    mmiPayLocCd = checkMmiPayLocCdConstraints(value);
    serializeMmiPayLocCd(mmiPayLocCd);
  }

  /**
   * Update MmiPayLocCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPayLocCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPayLocCd, mmiPayLocCd.length);
  }

  public void setMmiPayLocCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPayLocCd, mmiPayLocCd.length);
  }

  /**
   * Update MmiPayLocCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPayLocCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPayLocCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPayLocCd with another Field
   *
   * @param value
   */
  public void setMmiPayLocCd(Field source) {
    replace(source, 0, source.length(), beginMmiPayLocCd, MMI_PAY_LOC_CD_LEN);
  }

  /**
   * Update MmiPayLocCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPayLocCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPayLocCd, MMI_PAY_LOC_CD_LEN);
  }

  /**
   * Update MmiPayLocCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPayLocCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPayLocCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPcpCopayCd
   *
   * @return mmiPcpCopayCd
   */
  public char[] getMmiPcpCopayCd() throws CFException {
    if (isMmiPcpCopayCdModified()) {
      mmiPcpCopayCd = refreshMmiPcpCopayCd();
    }
    return mmiPcpCopayCd;
  }

  /**
   * set variable mmiPcpCopayCd Corresponding COBOL Variable is MMI-PCP-COPAY-CD
   *
   * @param value
   */
  public void setMmiPcpCopayCd(char[] value) {
    mmiPcpCopayCd = checkMmiPcpCopayCdConstraints(value);
    serializeMmiPcpCopayCd(mmiPcpCopayCd);
  }

  /**
   * Update MmiPcpCopayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPcpCopayCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPcpCopayCd, mmiPcpCopayCd.length);
  }

  public void setMmiPcpCopayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpCopayCd, mmiPcpCopayCd.length);
  }

  /**
   * Update MmiPcpCopayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPcpCopayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpCopayCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPcpCopayCd with another Field
   *
   * @param value
   */
  public void setMmiPcpCopayCd(Field source) {
    replace(source, 0, source.length(), beginMmiPcpCopayCd, MMI_PCP_COPAY_CD_LEN);
  }

  /**
   * Update MmiPcpCopayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPcpCopayCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpCopayCd, MMI_PCP_COPAY_CD_LEN);
  }

  /**
   * Update MmiPcpCopayCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPcpCopayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpCopayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPcpSpecCoinsInd
   *
   * @return mmiPcpSpecCoinsInd
   */
  public char[] getMmiPcpSpecCoinsInd() throws CFException {
    if (isMmiPcpSpecCoinsIndModified()) {
      mmiPcpSpecCoinsInd = refreshMmiPcpSpecCoinsInd();
    }
    return mmiPcpSpecCoinsInd;
  }

  /**
   * set variable mmiPcpSpecCoinsInd Corresponding COBOL Variable is MMI-PCP-SPEC-COINS-IND
   *
   * @param value
   */
  public void setMmiPcpSpecCoinsInd(char[] value) {
    mmiPcpSpecCoinsInd = checkMmiPcpSpecCoinsIndConstraints(value);
    serializeMmiPcpSpecCoinsInd(mmiPcpSpecCoinsInd);
  }

  /**
   * Update MmiPcpSpecCoinsInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPcpSpecCoinsInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPcpSpecCoinsInd, mmiPcpSpecCoinsInd.length);
  }

  public void setMmiPcpSpecCoinsInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpSpecCoinsInd, mmiPcpSpecCoinsInd.length);
  }

  /**
   * Update MmiPcpSpecCoinsInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPcpSpecCoinsInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpSpecCoinsInd + targetIndex, targetLen);
  }

  /**
   * Update MmiPcpSpecCoinsInd with another Field
   *
   * @param value
   */
  public void setMmiPcpSpecCoinsInd(Field source) {
    replace(source, 0, source.length(), beginMmiPcpSpecCoinsInd, MMI_PCP_SPEC_COINS_IND_LEN);
  }

  /**
   * Update MmiPcpSpecCoinsInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPcpSpecCoinsInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpSpecCoinsInd, MMI_PCP_SPEC_COINS_IND_LEN);
  }

  /**
   * Update MmiPcpSpecCoinsInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPcpSpecCoinsInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpSpecCoinsInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPhysMedcnPrdCd
   *
   * @return mmiPhysMedcnPrdCd
   */
  public char[] getMmiPhysMedcnPrdCd() throws CFException {
    if (isMmiPhysMedcnPrdCdModified()) {
      mmiPhysMedcnPrdCd = refreshMmiPhysMedcnPrdCd();
    }
    return mmiPhysMedcnPrdCd;
  }

  /**
   * set variable mmiPhysMedcnPrdCd Corresponding COBOL Variable is MMI-PHYS-MEDCN-PRD-CD
   *
   * @param value
   */
  public void setMmiPhysMedcnPrdCd(char[] value) {
    mmiPhysMedcnPrdCd = checkMmiPhysMedcnPrdCdConstraints(value);
    serializeMmiPhysMedcnPrdCd(mmiPhysMedcnPrdCd);
  }

  /**
   * Update MmiPhysMedcnPrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPhysMedcnPrdCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPhysMedcnPrdCd, mmiPhysMedcnPrdCd.length);
  }

  public void setMmiPhysMedcnPrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysMedcnPrdCd, mmiPhysMedcnPrdCd.length);
  }

  /**
   * Update MmiPhysMedcnPrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPhysMedcnPrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysMedcnPrdCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPhysMedcnPrdCd with another Field
   *
   * @param value
   */
  public void setMmiPhysMedcnPrdCd(Field source) {
    replace(source, 0, source.length(), beginMmiPhysMedcnPrdCd, MMI_PHYS_MEDCN_PRD_CD_LEN);
  }

  /**
   * Update MmiPhysMedcnPrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPhysMedcnPrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysMedcnPrdCd, MMI_PHYS_MEDCN_PRD_CD_LEN);
  }

  /**
   * Update MmiPhysMedcnPrdCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPhysMedcnPrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysMedcnPrdCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPolTypCd
   *
   * @return mmiPolTypCd
   */
  public char[] getMmiPolTypCd() throws CFException {
    if (isMmiPolTypCdModified()) {
      mmiPolTypCd = refreshMmiPolTypCd();
    }
    return mmiPolTypCd;
  }

  /**
   * set variable mmiPolTypCd Corresponding COBOL Variable is MMI-POL-TYP-CD
   *
   * @param value
   */
  public void setMmiPolTypCd(char[] value) {
    mmiPolTypCd = checkMmiPolTypCdConstraints(value);
    serializeMmiPolTypCd(mmiPolTypCd);
  }

  /**
   * Update MmiPolTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPolTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPolTypCd, mmiPolTypCd.length);
  }

  public void setMmiPolTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolTypCd, mmiPolTypCd.length);
  }

  /**
   * Update MmiPolTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPolTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPolTypCd with another Field
   *
   * @param value
   */
  public void setMmiPolTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiPolTypCd, MMI_POL_TYP_CD_LEN);
  }

  /**
   * Update MmiPolTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPolTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolTypCd, MMI_POL_TYP_CD_LEN);
  }

  /**
   * Update MmiPolTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPolTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPolTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPpoInd
   *
   * @return mmiPpoInd
   */
  public char[] getMmiPpoInd() throws CFException {
    if (isMmiPpoIndModified()) {
      mmiPpoInd = refreshMmiPpoInd();
    }
    return mmiPpoInd;
  }

  /**
   * set variable mmiPpoInd Corresponding COBOL Variable is MMI-PPO-IND
   *
   * @param value
   */
  public void setMmiPpoInd(char[] value) {
    mmiPpoInd = checkMmiPpoIndConstraints(value);
    serializeMmiPpoInd(mmiPpoInd);
  }

  /**
   * Update MmiPpoInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPpoInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPpoInd, mmiPpoInd.length);
  }

  public void setMmiPpoInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoInd, mmiPpoInd.length);
  }

  /**
   * Update MmiPpoInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPpoInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoInd + targetIndex, targetLen);
  }

  /**
   * Update MmiPpoInd with another Field
   *
   * @param value
   */
  public void setMmiPpoInd(Field source) {
    replace(source, 0, source.length(), beginMmiPpoInd, MMI_PPO_IND_LEN);
  }

  /**
   * Update MmiPpoInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPpoInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoInd, MMI_PPO_IND_LEN);
  }

  /**
   * Update MmiPpoInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPpoInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPpoMinEmrgInd
   *
   * @return mmiPpoMinEmrgInd
   */
  public char[] getMmiPpoMinEmrgInd() throws CFException {
    if (isMmiPpoMinEmrgIndModified()) {
      mmiPpoMinEmrgInd = refreshMmiPpoMinEmrgInd();
    }
    return mmiPpoMinEmrgInd;
  }

  /**
   * set variable mmiPpoMinEmrgInd Corresponding COBOL Variable is MMI-PPO-MIN-EMRG-IND
   *
   * @param value
   */
  public void setMmiPpoMinEmrgInd(char[] value) {
    mmiPpoMinEmrgInd = checkMmiPpoMinEmrgIndConstraints(value);
    serializeMmiPpoMinEmrgInd(mmiPpoMinEmrgInd);
  }

  /**
   * Update MmiPpoMinEmrgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPpoMinEmrgInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPpoMinEmrgInd, mmiPpoMinEmrgInd.length);
  }

  public void setMmiPpoMinEmrgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoMinEmrgInd, mmiPpoMinEmrgInd.length);
  }

  /**
   * Update MmiPpoMinEmrgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPpoMinEmrgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoMinEmrgInd + targetIndex, targetLen);
  }

  /**
   * Update MmiPpoMinEmrgInd with another Field
   *
   * @param value
   */
  public void setMmiPpoMinEmrgInd(Field source) {
    replace(source, 0, source.length(), beginMmiPpoMinEmrgInd, MMI_PPO_MIN_EMRG_IND_LEN);
  }

  /**
   * Update MmiPpoMinEmrgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPpoMinEmrgInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoMinEmrgInd, MMI_PPO_MIN_EMRG_IND_LEN);
  }

  /**
   * Update MmiPpoMinEmrgInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPpoMinEmrgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoMinEmrgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPpoPmntCd
   *
   * @return mmiPpoPmntCd
   */
  public char[] getMmiPpoPmntCd() throws CFException {
    if (isMmiPpoPmntCdModified()) {
      mmiPpoPmntCd = refreshMmiPpoPmntCd();
    }
    return mmiPpoPmntCd;
  }

  /**
   * set variable mmiPpoPmntCd Corresponding COBOL Variable is MMI-PPO-PMNT-CD
   *
   * @param value
   */
  public void setMmiPpoPmntCd(char[] value) {
    mmiPpoPmntCd = checkMmiPpoPmntCdConstraints(value);
    serializeMmiPpoPmntCd(mmiPpoPmntCd);
  }

  /**
   * Update MmiPpoPmntCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPpoPmntCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPpoPmntCd, mmiPpoPmntCd.length);
  }

  public void setMmiPpoPmntCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoPmntCd, mmiPpoPmntCd.length);
  }

  /**
   * Update MmiPpoPmntCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPpoPmntCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoPmntCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPpoPmntCd with another Field
   *
   * @param value
   */
  public void setMmiPpoPmntCd(Field source) {
    replace(source, 0, source.length(), beginMmiPpoPmntCd, MMI_PPO_PMNT_CD_LEN);
  }

  /**
   * Update MmiPpoPmntCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPpoPmntCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoPmntCd, MMI_PPO_PMNT_CD_LEN);
  }

  /**
   * Update MmiPpoPmntCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPpoPmntCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPpoPmntCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPrdctKeyCd
   *
   * @return mmiPrdctKeyCd
   */
  public char[] getMmiPrdctKeyCd() throws CFException {
    if (isMmiPrdctKeyCdModified()) {
      mmiPrdctKeyCd = refreshMmiPrdctKeyCd();
    }
    return mmiPrdctKeyCd;
  }

  /**
   * set variable mmiPrdctKeyCd Corresponding COBOL Variable is MMI-PRDCT-KEY-CD
   *
   * @param value
   */
  public void setMmiPrdctKeyCd(char[] value) {
    mmiPrdctKeyCd = checkMmiPrdctKeyCdConstraints(value);
    serializeMmiPrdctKeyCd(mmiPrdctKeyCd);
  }

  /**
   * Update MmiPrdctKeyCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPrdctKeyCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPrdctKeyCd, mmiPrdctKeyCd.length);
  }

  public void setMmiPrdctKeyCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctKeyCd, mmiPrdctKeyCd.length);
  }

  /**
   * Update MmiPrdctKeyCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPrdctKeyCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctKeyCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPrdctKeyCd with another Field
   *
   * @param value
   */
  public void setMmiPrdctKeyCd(Field source) {
    replace(source, 0, source.length(), beginMmiPrdctKeyCd, MMI_PRDCT_KEY_CD_LEN);
  }

  /**
   * Update MmiPrdctKeyCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPrdctKeyCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctKeyCd, MMI_PRDCT_KEY_CD_LEN);
  }

  /**
   * Update MmiPrdctKeyCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPrdctKeyCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctKeyCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPrortEvntTypCd
   *
   * @return mmiPrortEvntTypCd
   */
  public char[] getMmiPrortEvntTypCd() throws CFException {
    if (isMmiPrortEvntTypCdModified()) {
      mmiPrortEvntTypCd = refreshMmiPrortEvntTypCd();
    }
    return mmiPrortEvntTypCd;
  }

  /**
   * set variable mmiPrortEvntTypCd Corresponding COBOL Variable is MMI-PRORT-EVNT-TYP-CD
   *
   * @param value
   */
  public void setMmiPrortEvntTypCd(char[] value) {
    mmiPrortEvntTypCd = checkMmiPrortEvntTypCdConstraints(value);
    serializeMmiPrortEvntTypCd(mmiPrortEvntTypCd);
  }

  /**
   * Update MmiPrortEvntTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPrortEvntTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPrortEvntTypCd, mmiPrortEvntTypCd.length);
  }

  public void setMmiPrortEvntTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrortEvntTypCd, mmiPrortEvntTypCd.length);
  }

  /**
   * Update MmiPrortEvntTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPrortEvntTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrortEvntTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPrortEvntTypCd with another Field
   *
   * @param value
   */
  public void setMmiPrortEvntTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiPrortEvntTypCd, MMI_PRORT_EVNT_TYP_CD_LEN);
  }

  /**
   * Update MmiPrortEvntTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPrortEvntTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrortEvntTypCd, MMI_PRORT_EVNT_TYP_CD_LEN);
  }

  /**
   * Update MmiPrortEvntTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPrortEvntTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrortEvntTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPrortIntrvlFreqCd
   *
   * @return mmiPrortIntrvlFreqCd
   */
  public char[] getMmiPrortIntrvlFreqCd() throws CFException {
    if (isMmiPrortIntrvlFreqCdModified()) {
      mmiPrortIntrvlFreqCd = refreshMmiPrortIntrvlFreqCd();
    }
    return mmiPrortIntrvlFreqCd;
  }

  /**
   * set variable mmiPrortIntrvlFreqCd Corresponding COBOL Variable is MMI-PRORT-INTRVL-FREQ-CD
   *
   * @param value
   */
  public void setMmiPrortIntrvlFreqCd(char[] value) {
    mmiPrortIntrvlFreqCd = checkMmiPrortIntrvlFreqCdConstraints(value);
    serializeMmiPrortIntrvlFreqCd(mmiPrortIntrvlFreqCd);
  }

  /**
   * Update MmiPrortIntrvlFreqCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPrortIntrvlFreqCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiPrortIntrvlFreqCd, mmiPrortIntrvlFreqCd.length);
  }

  public void setMmiPrortIntrvlFreqCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrortIntrvlFreqCd, mmiPrortIntrvlFreqCd.length);
  }

  /**
   * Update MmiPrortIntrvlFreqCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPrortIntrvlFreqCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrortIntrvlFreqCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPrortIntrvlFreqCd with another Field
   *
   * @param value
   */
  public void setMmiPrortIntrvlFreqCd(Field source) {
    replace(source, 0, source.length(), beginMmiPrortIntrvlFreqCd, MMI_PRORT_INTRVL_FREQ_CD_LEN);
  }

  /**
   * Update MmiPrortIntrvlFreqCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPrortIntrvlFreqCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiPrortIntrvlFreqCd, MMI_PRORT_INTRVL_FREQ_CD_LEN);
  }

  /**
   * Update MmiPrortIntrvlFreqCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiPrortIntrvlFreqCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrortIntrvlFreqCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPsyCyrCnfmMaxAmt
   *
   * @return mmiPsyCyrCnfmMaxAmt
   */
  public int getMmiPsyCyrCnfmMaxAmt() throws CFException {
    if (isMmiPsyCyrCnfmMaxAmtModified()) {
      mmiPsyCyrCnfmMaxAmt = refreshMmiPsyCyrCnfmMaxAmt();
    }
    return mmiPsyCyrCnfmMaxAmt;
  }

  /**
   * Update MmiPsyCyrCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-PSY-CYR-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setMmiPsyCyrCnfmMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiPsyCyrCnfmMaxAmt = checkMmiPsyCyrCnfmMaxAmtMaxLimit(number);
    serializeMmiPsyCyrCnfmMaxAmt(mmiPsyCyrCnfmMaxAmt);
  }

  public void setMmiPsyCyrCnfmMaxAmt(long number) {
    number = checkMmiPsyCyrCnfmMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiPsyCyrCnfmMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiPsyCyrCombPrscMaxAmt
   *
   * @return mmiPsyCyrCombPrscMaxAmt
   */
  public int getMmiPsyCyrCombPrscMaxAmt() throws CFException {
    if (isMmiPsyCyrCombPrscMaxAmtModified()) {
      mmiPsyCyrCombPrscMaxAmt = refreshMmiPsyCyrCombPrscMaxAmt();
    }
    return mmiPsyCyrCombPrscMaxAmt;
  }

  /**
   * Update MmiPsyCyrCombPrscMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-PSY-CYR-COMB-PRSC-MAX-AMT
   *
   * @param number
   */
  public void setMmiPsyCyrCombPrscMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiPsyCyrCombPrscMaxAmt = checkMmiPsyCyrCombPrscMaxAmtMaxLimit(number);
    serializeMmiPsyCyrCombPrscMaxAmt(mmiPsyCyrCombPrscMaxAmt);
  }

  public void setMmiPsyCyrCombPrscMaxAmt(long number) {
    number =
        checkMmiPsyCyrCombPrscMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiPsyCyrCombPrscMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiPsyCyrNonCnfmMaxAmt
   *
   * @return mmiPsyCyrNonCnfmMaxAmt
   */
  public int getMmiPsyCyrNonCnfmMaxAmt() throws CFException {
    if (isMmiPsyCyrNonCnfmMaxAmtModified()) {
      mmiPsyCyrNonCnfmMaxAmt = refreshMmiPsyCyrNonCnfmMaxAmt();
    }
    return mmiPsyCyrNonCnfmMaxAmt;
  }

  /**
   * Update MmiPsyCyrNonCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-PSY-CYR-NON-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setMmiPsyCyrNonCnfmMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiPsyCyrNonCnfmMaxAmt = checkMmiPsyCyrNonCnfmMaxAmtMaxLimit(number);
    serializeMmiPsyCyrNonCnfmMaxAmt(mmiPsyCyrNonCnfmMaxAmt);
  }

  public void setMmiPsyCyrNonCnfmMaxAmt(long number) {
    number =
        checkMmiPsyCyrNonCnfmMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiPsyCyrNonCnfmMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiPsyLftmCnfmMaxAmt
   *
   * @return mmiPsyLftmCnfmMaxAmt
   */
  public int getMmiPsyLftmCnfmMaxAmt() throws CFException {
    if (isMmiPsyLftmCnfmMaxAmtModified()) {
      mmiPsyLftmCnfmMaxAmt = refreshMmiPsyLftmCnfmMaxAmt();
    }
    return mmiPsyLftmCnfmMaxAmt;
  }

  /**
   * Update MmiPsyLftmCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-PSY-LFTM-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setMmiPsyLftmCnfmMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiPsyLftmCnfmMaxAmt = checkMmiPsyLftmCnfmMaxAmtMaxLimit(number);
    serializeMmiPsyLftmCnfmMaxAmt(mmiPsyLftmCnfmMaxAmt);
  }

  public void setMmiPsyLftmCnfmMaxAmt(long number) {
    number = checkMmiPsyLftmCnfmMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiPsyLftmCnfmMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiPsyLftmCombPrscMaxAmt
   *
   * @return mmiPsyLftmCombPrscMaxAmt
   */
  public int getMmiPsyLftmCombPrscMaxAmt() throws CFException {
    if (isMmiPsyLftmCombPrscMaxAmtModified()) {
      mmiPsyLftmCombPrscMaxAmt = refreshMmiPsyLftmCombPrscMaxAmt();
    }
    return mmiPsyLftmCombPrscMaxAmt;
  }

  /**
   * Update MmiPsyLftmCombPrscMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-PSY-LFTM-COMB-PRSC-MAX-AMT
   *
   * @param number
   */
  public void setMmiPsyLftmCombPrscMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiPsyLftmCombPrscMaxAmt = checkMmiPsyLftmCombPrscMaxAmtMaxLimit(number);
    serializeMmiPsyLftmCombPrscMaxAmt(mmiPsyLftmCombPrscMaxAmt);
  }

  public void setMmiPsyLftmCombPrscMaxAmt(long number) {
    number =
        checkMmiPsyLftmCombPrscMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiPsyLftmCombPrscMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiPsyLftmNonCnfmMaxAmt
   *
   * @return mmiPsyLftmNonCnfmMaxAmt
   */
  public int getMmiPsyLftmNonCnfmMaxAmt() throws CFException {
    if (isMmiPsyLftmNonCnfmMaxAmtModified()) {
      mmiPsyLftmNonCnfmMaxAmt = refreshMmiPsyLftmNonCnfmMaxAmt();
    }
    return mmiPsyLftmNonCnfmMaxAmt;
  }

  /**
   * Update MmiPsyLftmNonCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-PSY-LFTM-NON-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setMmiPsyLftmNonCnfmMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiPsyLftmNonCnfmMaxAmt = checkMmiPsyLftmNonCnfmMaxAmtMaxLimit(number);
    serializeMmiPsyLftmNonCnfmMaxAmt(mmiPsyLftmNonCnfmMaxAmt);
  }

  public void setMmiPsyLftmNonCnfmMaxAmt(long number) {
    number =
        checkMmiPsyLftmNonCnfmMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiPsyLftmNonCnfmMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiRapl3TierInd
   *
   * @return mmiRapl3TierInd
   */
  public char[] getMmiRapl3TierInd() throws CFException {
    if (isMmiRapl3TierIndModified()) {
      mmiRapl3TierInd = refreshMmiRapl3TierInd();
    }
    return mmiRapl3TierInd;
  }

  /**
   * set variable mmiRapl3TierInd Corresponding COBOL Variable is MMI-RAPL-3-TIER-IND
   *
   * @param value
   */
  public void setMmiRapl3TierInd(char[] value) {
    mmiRapl3TierInd = checkMmiRapl3TierIndConstraints(value);
    serializeMmiRapl3TierInd(mmiRapl3TierInd);
  }

  /**
   * Update MmiRapl3TierInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRapl3TierInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiRapl3TierInd, mmiRapl3TierInd.length);
  }

  public void setMmiRapl3TierInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRapl3TierInd, mmiRapl3TierInd.length);
  }

  /**
   * Update MmiRapl3TierInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRapl3TierInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRapl3TierInd + targetIndex, targetLen);
  }

  /**
   * Update MmiRapl3TierInd with another Field
   *
   * @param value
   */
  public void setMmiRapl3TierInd(Field source) {
    replace(source, 0, source.length(), beginMmiRapl3TierInd, MMI_RAPL_3_TIER_IND_LEN);
  }

  /**
   * Update MmiRapl3TierInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRapl3TierInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRapl3TierInd, MMI_RAPL_3_TIER_IND_LEN);
  }

  /**
   * Update MmiRapl3TierInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRapl3TierInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRapl3TierInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiRhapsodyCopayCd
   *
   * @return mmiRhapsodyCopayCd
   */
  public char[] getMmiRhapsodyCopayCd() throws CFException {
    if (isMmiRhapsodyCopayCdModified()) {
      mmiRhapsodyCopayCd = refreshMmiRhapsodyCopayCd();
    }
    return mmiRhapsodyCopayCd;
  }

  /**
   * set variable mmiRhapsodyCopayCd Corresponding COBOL Variable is MMI-RHAPSODY-COPAY-CD
   *
   * @param value
   */
  public void setMmiRhapsodyCopayCd(char[] value) {
    mmiRhapsodyCopayCd = checkMmiRhapsodyCopayCdConstraints(value);
    serializeMmiRhapsodyCopayCd(mmiRhapsodyCopayCd);
  }

  /**
   * Update MmiRhapsodyCopayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRhapsodyCopayCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiRhapsodyCopayCd, mmiRhapsodyCopayCd.length);
  }

  public void setMmiRhapsodyCopayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRhapsodyCopayCd, mmiRhapsodyCopayCd.length);
  }

  /**
   * Update MmiRhapsodyCopayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRhapsodyCopayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRhapsodyCopayCd + targetIndex, targetLen);
  }

  /**
   * Update MmiRhapsodyCopayCd with another Field
   *
   * @param value
   */
  public void setMmiRhapsodyCopayCd(Field source) {
    replace(source, 0, source.length(), beginMmiRhapsodyCopayCd, MMI_RHAPSODY_COPAY_CD_LEN);
  }

  /**
   * Update MmiRhapsodyCopayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRhapsodyCopayCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRhapsodyCopayCd, MMI_RHAPSODY_COPAY_CD_LEN);
  }

  /**
   * Update MmiRhapsodyCopayCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRhapsodyCopayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRhapsodyCopayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiRhapsodyCopayDayCnt
   *
   * @return mmiRhapsodyCopayDayCnt
   */
  public short getMmiRhapsodyCopayDayCnt() throws CFException {
    if (isMmiRhapsodyCopayDayCntModified()) {
      mmiRhapsodyCopayDayCnt = refreshMmiRhapsodyCopayDayCnt();
    }
    return mmiRhapsodyCopayDayCnt;
  }

  /**
   * Update MmiRhapsodyCopayDayCnt with the passed value Corresponding COBOL Variable is
   * MMI-RHAPSODY-COPAY-DAY-CNT
   *
   * @param number
   */
  public void setMmiRhapsodyCopayDayCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiRhapsodyCopayDayCnt = checkMmiRhapsodyCopayDayCntMaxLimit(number);
    serializeMmiRhapsodyCopayDayCnt(mmiRhapsodyCopayDayCnt);
  }

  public void setMmiRhapsodyCopayDayCnt(int number) {
    number =
        checkMmiRhapsodyCopayDayCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiRhapsodyCopayDayCnt((short) number);
  }

  public void setMmiRhapsodyCopayDayCnt(long number) {
    number =
        checkMmiRhapsodyCopayDayCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiRhapsodyCopayDayCnt((short) number);
  }

  /**
   * Returns the value of mmiRmrkCd
   *
   * @return mmiRmrkCd
   */
  public char[] getMmiRmrkCd() throws CFException {
    if (isMmiRmrkCdModified()) {
      mmiRmrkCd = refreshMmiRmrkCd();
    }
    return mmiRmrkCd;
  }

  /**
   * set variable mmiRmrkCd Corresponding COBOL Variable is MMI-RMRK-CD
   *
   * @param value
   */
  public void setMmiRmrkCd(char[] value) {
    mmiRmrkCd = checkMmiRmrkCdConstraints(value);
    serializeMmiRmrkCd(mmiRmrkCd);
  }

  /**
   * Update MmiRmrkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRmrkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiRmrkCd, mmiRmrkCd.length);
  }

  public void setMmiRmrkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkCd, mmiRmrkCd.length);
  }

  /**
   * Update MmiRmrkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRmrkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkCd + targetIndex, targetLen);
  }

  /**
   * Update MmiRmrkCd with another Field
   *
   * @param value
   */
  public void setMmiRmrkCd(Field source) {
    replace(source, 0, source.length(), beginMmiRmrkCd, MMI_RMRK_CD_LEN);
  }

  /**
   * Update MmiRmrkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRmrkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkCd, MMI_RMRK_CD_LEN);
  }

  /**
   * Update MmiRmrkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRmrkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiRmrkSpineManipCd
   *
   * @return mmiRmrkSpineManipCd
   */
  public char[] getMmiRmrkSpineManipCd() throws CFException {
    if (isMmiRmrkSpineManipCdModified()) {
      mmiRmrkSpineManipCd = refreshMmiRmrkSpineManipCd();
    }
    return mmiRmrkSpineManipCd;
  }

  /**
   * set variable mmiRmrkSpineManipCd Corresponding COBOL Variable is MMI-RMRK-SPINE-MANIP-CD
   *
   * @param value
   */
  public void setMmiRmrkSpineManipCd(char[] value) {
    mmiRmrkSpineManipCd = checkMmiRmrkSpineManipCdConstraints(value);
    serializeMmiRmrkSpineManipCd(mmiRmrkSpineManipCd);
  }

  /**
   * Update MmiRmrkSpineManipCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRmrkSpineManipCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiRmrkSpineManipCd, mmiRmrkSpineManipCd.length);
  }

  public void setMmiRmrkSpineManipCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkSpineManipCd, mmiRmrkSpineManipCd.length);
  }

  /**
   * Update MmiRmrkSpineManipCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRmrkSpineManipCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkSpineManipCd + targetIndex, targetLen);
  }

  /**
   * Update MmiRmrkSpineManipCd with another Field
   *
   * @param value
   */
  public void setMmiRmrkSpineManipCd(Field source) {
    replace(source, 0, source.length(), beginMmiRmrkSpineManipCd, MMI_RMRK_SPINE_MANIP_CD_LEN);
  }

  /**
   * Update MmiRmrkSpineManipCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRmrkSpineManipCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkSpineManipCd, MMI_RMRK_SPINE_MANIP_CD_LEN);
  }

  /**
   * Update MmiRmrkSpineManipCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRmrkSpineManipCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRmrkSpineManipCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc1Cd
   *
   * @return mmiSpclProc1Cd
   */
  public char[] getMmiSpclProc1Cd() throws CFException {
    if (isMmiSpclProc1CdModified()) {
      mmiSpclProc1Cd = refreshMmiSpclProc1Cd();
    }
    return mmiSpclProc1Cd;
  }

  /**
   * set variable mmiSpclProc1Cd Corresponding COBOL Variable is MMI-SPCL-PROC-1-CD
   *
   * @param value
   */
  public void setMmiSpclProc1Cd(char[] value) {
    mmiSpclProc1Cd = checkMmiSpclProc1CdConstraints(value);
    serializeMmiSpclProc1Cd(mmiSpclProc1Cd);
  }

  /**
   * Update MmiSpclProc1Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc1Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc1Cd, mmiSpclProc1Cd.length);
  }

  public void setMmiSpclProc1Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc1Cd, mmiSpclProc1Cd.length);
  }

  /**
   * Update MmiSpclProc1Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc1Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc1Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc1Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc1Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc1Cd, MMI_SPCL_PROC_1_CD_LEN);
  }

  /**
   * Update MmiSpclProc1Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc1Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc1Cd, MMI_SPCL_PROC_1_CD_LEN);
  }

  /**
   * Update MmiSpclProc1Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc1Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc1Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc2Cd
   *
   * @return mmiSpclProc2Cd
   */
  public char[] getMmiSpclProc2Cd() throws CFException {
    if (isMmiSpclProc2CdModified()) {
      mmiSpclProc2Cd = refreshMmiSpclProc2Cd();
    }
    return mmiSpclProc2Cd;
  }

  /**
   * set variable mmiSpclProc2Cd Corresponding COBOL Variable is MMI-SPCL-PROC-2-CD
   *
   * @param value
   */
  public void setMmiSpclProc2Cd(char[] value) {
    mmiSpclProc2Cd = checkMmiSpclProc2CdConstraints(value);
    serializeMmiSpclProc2Cd(mmiSpclProc2Cd);
  }

  /**
   * Update MmiSpclProc2Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc2Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc2Cd, mmiSpclProc2Cd.length);
  }

  public void setMmiSpclProc2Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc2Cd, mmiSpclProc2Cd.length);
  }

  /**
   * Update MmiSpclProc2Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc2Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc2Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc2Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc2Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc2Cd, MMI_SPCL_PROC_2_CD_LEN);
  }

  /**
   * Update MmiSpclProc2Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc2Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc2Cd, MMI_SPCL_PROC_2_CD_LEN);
  }

  /**
   * Update MmiSpclProc2Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc2Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc2Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc3Cd
   *
   * @return mmiSpclProc3Cd
   */
  public char[] getMmiSpclProc3Cd() throws CFException {
    if (isMmiSpclProc3CdModified()) {
      mmiSpclProc3Cd = refreshMmiSpclProc3Cd();
    }
    return mmiSpclProc3Cd;
  }

  /**
   * set variable mmiSpclProc3Cd Corresponding COBOL Variable is MMI-SPCL-PROC-3-CD
   *
   * @param value
   */
  public void setMmiSpclProc3Cd(char[] value) {
    mmiSpclProc3Cd = checkMmiSpclProc3CdConstraints(value);
    serializeMmiSpclProc3Cd(mmiSpclProc3Cd);
  }

  /**
   * Update MmiSpclProc3Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc3Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc3Cd, mmiSpclProc3Cd.length);
  }

  public void setMmiSpclProc3Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc3Cd, mmiSpclProc3Cd.length);
  }

  /**
   * Update MmiSpclProc3Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc3Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc3Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc3Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc3Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc3Cd, MMI_SPCL_PROC_3_CD_LEN);
  }

  /**
   * Update MmiSpclProc3Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc3Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc3Cd, MMI_SPCL_PROC_3_CD_LEN);
  }

  /**
   * Update MmiSpclProc3Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc3Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc3Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc4Cd
   *
   * @return mmiSpclProc4Cd
   */
  public char[] getMmiSpclProc4Cd() throws CFException {
    if (isMmiSpclProc4CdModified()) {
      mmiSpclProc4Cd = refreshMmiSpclProc4Cd();
    }
    return mmiSpclProc4Cd;
  }

  /**
   * set variable mmiSpclProc4Cd Corresponding COBOL Variable is MMI-SPCL-PROC-4-CD
   *
   * @param value
   */
  public void setMmiSpclProc4Cd(char[] value) {
    mmiSpclProc4Cd = checkMmiSpclProc4CdConstraints(value);
    serializeMmiSpclProc4Cd(mmiSpclProc4Cd);
  }

  /**
   * Update MmiSpclProc4Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc4Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc4Cd, mmiSpclProc4Cd.length);
  }

  public void setMmiSpclProc4Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc4Cd, mmiSpclProc4Cd.length);
  }

  /**
   * Update MmiSpclProc4Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc4Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc4Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc4Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc4Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc4Cd, MMI_SPCL_PROC_4_CD_LEN);
  }

  /**
   * Update MmiSpclProc4Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc4Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc4Cd, MMI_SPCL_PROC_4_CD_LEN);
  }

  /**
   * Update MmiSpclProc4Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc4Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc4Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc5Cd
   *
   * @return mmiSpclProc5Cd
   */
  public char[] getMmiSpclProc5Cd() throws CFException {
    if (isMmiSpclProc5CdModified()) {
      mmiSpclProc5Cd = refreshMmiSpclProc5Cd();
    }
    return mmiSpclProc5Cd;
  }

  /**
   * set variable mmiSpclProc5Cd Corresponding COBOL Variable is MMI-SPCL-PROC-5-CD
   *
   * @param value
   */
  public void setMmiSpclProc5Cd(char[] value) {
    mmiSpclProc5Cd = checkMmiSpclProc5CdConstraints(value);
    serializeMmiSpclProc5Cd(mmiSpclProc5Cd);
  }

  /**
   * Update MmiSpclProc5Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc5Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc5Cd, mmiSpclProc5Cd.length);
  }

  public void setMmiSpclProc5Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc5Cd, mmiSpclProc5Cd.length);
  }

  /**
   * Update MmiSpclProc5Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc5Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc5Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc5Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc5Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc5Cd, MMI_SPCL_PROC_5_CD_LEN);
  }

  /**
   * Update MmiSpclProc5Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc5Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc5Cd, MMI_SPCL_PROC_5_CD_LEN);
  }

  /**
   * Update MmiSpclProc5Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc5Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc5Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc6Cd
   *
   * @return mmiSpclProc6Cd
   */
  public char[] getMmiSpclProc6Cd() throws CFException {
    if (isMmiSpclProc6CdModified()) {
      mmiSpclProc6Cd = refreshMmiSpclProc6Cd();
    }
    return mmiSpclProc6Cd;
  }

  /**
   * set variable mmiSpclProc6Cd Corresponding COBOL Variable is MMI-SPCL-PROC-6-CD
   *
   * @param value
   */
  public void setMmiSpclProc6Cd(char[] value) {
    mmiSpclProc6Cd = checkMmiSpclProc6CdConstraints(value);
    serializeMmiSpclProc6Cd(mmiSpclProc6Cd);
  }

  /**
   * Update MmiSpclProc6Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc6Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc6Cd, mmiSpclProc6Cd.length);
  }

  public void setMmiSpclProc6Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc6Cd, mmiSpclProc6Cd.length);
  }

  /**
   * Update MmiSpclProc6Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc6Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc6Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc6Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc6Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc6Cd, MMI_SPCL_PROC_6_CD_LEN);
  }

  /**
   * Update MmiSpclProc6Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc6Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc6Cd, MMI_SPCL_PROC_6_CD_LEN);
  }

  /**
   * Update MmiSpclProc6Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc6Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc6Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc7Cd
   *
   * @return mmiSpclProc7Cd
   */
  public char[] getMmiSpclProc7Cd() throws CFException {
    if (isMmiSpclProc7CdModified()) {
      mmiSpclProc7Cd = refreshMmiSpclProc7Cd();
    }
    return mmiSpclProc7Cd;
  }

  /**
   * set variable mmiSpclProc7Cd Corresponding COBOL Variable is MMI-SPCL-PROC-7-CD
   *
   * @param value
   */
  public void setMmiSpclProc7Cd(char[] value) {
    mmiSpclProc7Cd = checkMmiSpclProc7CdConstraints(value);
    serializeMmiSpclProc7Cd(mmiSpclProc7Cd);
  }

  /**
   * Update MmiSpclProc7Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc7Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc7Cd, mmiSpclProc7Cd.length);
  }

  public void setMmiSpclProc7Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc7Cd, mmiSpclProc7Cd.length);
  }

  /**
   * Update MmiSpclProc7Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc7Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc7Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc7Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc7Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc7Cd, MMI_SPCL_PROC_7_CD_LEN);
  }

  /**
   * Update MmiSpclProc7Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc7Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc7Cd, MMI_SPCL_PROC_7_CD_LEN);
  }

  /**
   * Update MmiSpclProc7Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc7Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc7Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc8Cd
   *
   * @return mmiSpclProc8Cd
   */
  public char[] getMmiSpclProc8Cd() throws CFException {
    if (isMmiSpclProc8CdModified()) {
      mmiSpclProc8Cd = refreshMmiSpclProc8Cd();
    }
    return mmiSpclProc8Cd;
  }

  /**
   * set variable mmiSpclProc8Cd Corresponding COBOL Variable is MMI-SPCL-PROC-8-CD
   *
   * @param value
   */
  public void setMmiSpclProc8Cd(char[] value) {
    mmiSpclProc8Cd = checkMmiSpclProc8CdConstraints(value);
    serializeMmiSpclProc8Cd(mmiSpclProc8Cd);
  }

  /**
   * Update MmiSpclProc8Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc8Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc8Cd, mmiSpclProc8Cd.length);
  }

  public void setMmiSpclProc8Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc8Cd, mmiSpclProc8Cd.length);
  }

  /**
   * Update MmiSpclProc8Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc8Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc8Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc8Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc8Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc8Cd, MMI_SPCL_PROC_8_CD_LEN);
  }

  /**
   * Update MmiSpclProc8Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc8Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc8Cd, MMI_SPCL_PROC_8_CD_LEN);
  }

  /**
   * Update MmiSpclProc8Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc8Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc8Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc9Cd
   *
   * @return mmiSpclProc9Cd
   */
  public char[] getMmiSpclProc9Cd() throws CFException {
    if (isMmiSpclProc9CdModified()) {
      mmiSpclProc9Cd = refreshMmiSpclProc9Cd();
    }
    return mmiSpclProc9Cd;
  }

  /**
   * set variable mmiSpclProc9Cd Corresponding COBOL Variable is MMI-SPCL-PROC-9-CD
   *
   * @param value
   */
  public void setMmiSpclProc9Cd(char[] value) {
    mmiSpclProc9Cd = checkMmiSpclProc9CdConstraints(value);
    serializeMmiSpclProc9Cd(mmiSpclProc9Cd);
  }

  /**
   * Update MmiSpclProc9Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc9Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc9Cd, mmiSpclProc9Cd.length);
  }

  public void setMmiSpclProc9Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc9Cd, mmiSpclProc9Cd.length);
  }

  /**
   * Update MmiSpclProc9Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc9Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc9Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc9Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc9Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc9Cd, MMI_SPCL_PROC_9_CD_LEN);
  }

  /**
   * Update MmiSpclProc9Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc9Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc9Cd, MMI_SPCL_PROC_9_CD_LEN);
  }

  /**
   * Update MmiSpclProc9Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc9Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc9Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSpclProc10Cd
   *
   * @return mmiSpclProc10Cd
   */
  public char[] getMmiSpclProc10Cd() throws CFException {
    if (isMmiSpclProc10CdModified()) {
      mmiSpclProc10Cd = refreshMmiSpclProc10Cd();
    }
    return mmiSpclProc10Cd;
  }

  /**
   * set variable mmiSpclProc10Cd Corresponding COBOL Variable is MMI-SPCL-PROC-10-CD
   *
   * @param value
   */
  public void setMmiSpclProc10Cd(char[] value) {
    mmiSpclProc10Cd = checkMmiSpclProc10CdConstraints(value);
    serializeMmiSpclProc10Cd(mmiSpclProc10Cd);
  }

  /**
   * Update MmiSpclProc10Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc10Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSpclProc10Cd, mmiSpclProc10Cd.length);
  }

  public void setMmiSpclProc10Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc10Cd, mmiSpclProc10Cd.length);
  }

  /**
   * Update MmiSpclProc10Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc10Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc10Cd + targetIndex, targetLen);
  }

  /**
   * Update MmiSpclProc10Cd with another Field
   *
   * @param value
   */
  public void setMmiSpclProc10Cd(Field source) {
    replace(source, 0, source.length(), beginMmiSpclProc10Cd, MMI_SPCL_PROC_10_CD_LEN);
  }

  /**
   * Update MmiSpclProc10Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc10Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc10Cd, MMI_SPCL_PROC_10_CD_LEN);
  }

  /**
   * Update MmiSpclProc10Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSpclProc10Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSpclProc10Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCatgyTblId
   *
   * @return mmiSrvcCatgyTblId
   */
  public char[] getMmiSrvcCatgyTblId() throws CFException {
    if (isMmiSrvcCatgyTblIdModified()) {
      mmiSrvcCatgyTblId = refreshMmiSrvcCatgyTblId();
    }
    return mmiSrvcCatgyTblId;
  }

  /**
   * set variable mmiSrvcCatgyTblId Corresponding COBOL Variable is MMI-SRVC-CATGY-TBL-ID
   *
   * @param value
   */
  public void setMmiSrvcCatgyTblId(char[] value) {
    mmiSrvcCatgyTblId = checkMmiSrvcCatgyTblIdConstraints(value);
    serializeMmiSrvcCatgyTblId(mmiSrvcCatgyTblId);
  }

  /**
   * Update MmiSrvcCatgyTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCatgyTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCatgyTblId, mmiSrvcCatgyTblId.length);
  }

  public void setMmiSrvcCatgyTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCatgyTblId, mmiSrvcCatgyTblId.length);
  }

  /**
   * Update MmiSrvcCatgyTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCatgyTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCatgyTblId + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCatgyTblId with another Field
   *
   * @param value
   */
  public void setMmiSrvcCatgyTblId(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCatgyTblId, MMI_SRVC_CATGY_TBL_ID_LEN);
  }

  /**
   * Update MmiSrvcCatgyTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCatgyTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCatgyTblId, MMI_SRVC_CATGY_TBL_ID_LEN);
  }

  /**
   * Update MmiSrvcCatgyTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCatgyTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCatgyTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdNSetInd
   *
   * @return mmiSrvcCdNSetInd
   */
  public char[] getMmiSrvcCdNSetInd() throws CFException {
    if (isMmiSrvcCdNSetIndModified()) {
      mmiSrvcCdNSetInd = refreshMmiSrvcCdNSetInd();
    }
    return mmiSrvcCdNSetInd;
  }

  /**
   * set variable mmiSrvcCdNSetInd Corresponding COBOL Variable is MMI-SRVC-CD-N-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdNSetInd(char[] value) {
    mmiSrvcCdNSetInd = checkMmiSrvcCdNSetIndConstraints(value);
    serializeMmiSrvcCdNSetInd(mmiSrvcCdNSetInd);
  }

  /**
   * Update MmiSrvcCdNSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdNSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdNSetInd, mmiSrvcCdNSetInd.length);
  }

  public void setMmiSrvcCdNSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdNSetInd, mmiSrvcCdNSetInd.length);
  }

  /**
   * Update MmiSrvcCdNSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdNSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdNSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdNSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdNSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdNSetInd, MMI_SRVC_CD_NSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdNSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdNSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdNSetInd, MMI_SRVC_CD_NSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdNSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdNSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdNSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdPSetInd
   *
   * @return mmiSrvcCdPSetInd
   */
  public char[] getMmiSrvcCdPSetInd() throws CFException {
    if (isMmiSrvcCdPSetIndModified()) {
      mmiSrvcCdPSetInd = refreshMmiSrvcCdPSetInd();
    }
    return mmiSrvcCdPSetInd;
  }

  /**
   * set variable mmiSrvcCdPSetInd Corresponding COBOL Variable is MMI-SRVC-CD-P-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdPSetInd(char[] value) {
    mmiSrvcCdPSetInd = checkMmiSrvcCdPSetIndConstraints(value);
    serializeMmiSrvcCdPSetInd(mmiSrvcCdPSetInd);
  }

  /**
   * Update MmiSrvcCdPSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdPSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdPSetInd, mmiSrvcCdPSetInd.length);
  }

  public void setMmiSrvcCdPSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdPSetInd, mmiSrvcCdPSetInd.length);
  }

  /**
   * Update MmiSrvcCdPSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdPSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdPSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdPSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdPSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdPSetInd, MMI_SRVC_CD_PSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdPSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdPSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdPSetInd, MMI_SRVC_CD_PSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdPSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdPSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdPSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdTSetInd
   *
   * @return mmiSrvcCdTSetInd
   */
  public char[] getMmiSrvcCdTSetInd() throws CFException {
    if (isMmiSrvcCdTSetIndModified()) {
      mmiSrvcCdTSetInd = refreshMmiSrvcCdTSetInd();
    }
    return mmiSrvcCdTSetInd;
  }

  /**
   * set variable mmiSrvcCdTSetInd Corresponding COBOL Variable is MMI-SRVC-CD-T-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdTSetInd(char[] value) {
    mmiSrvcCdTSetInd = checkMmiSrvcCdTSetIndConstraints(value);
    serializeMmiSrvcCdTSetInd(mmiSrvcCdTSetInd);
  }

  /**
   * Update MmiSrvcCdTSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdTSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdTSetInd, mmiSrvcCdTSetInd.length);
  }

  public void setMmiSrvcCdTSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdTSetInd, mmiSrvcCdTSetInd.length);
  }

  /**
   * Update MmiSrvcCdTSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdTSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdTSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdTSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdTSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdTSetInd, MMI_SRVC_CD_TSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdTSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdTSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdTSetInd, MMI_SRVC_CD_TSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdTSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdTSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdTSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSviTblPriNbr
   *
   * @return mmiSviTblPriNbr
   */
  public char[] getMmiSviTblPriNbr() throws CFException {
    if (isMmiSviTblPriNbrModified()) {
      mmiSviTblPriNbr = refreshMmiSviTblPriNbr();
    }
    return mmiSviTblPriNbr;
  }

  /**
   * set variable mmiSviTblPriNbr Corresponding COBOL Variable is MMI-SVI-TBL-PRI-NBR
   *
   * @param value
   */
  public void setMmiSviTblPriNbr(char[] value) {
    mmiSviTblPriNbr = checkMmiSviTblPriNbrConstraints(value);
    serializeMmiSviTblPriNbr(mmiSviTblPriNbr);
  }

  /**
   * Update MmiSviTblPriNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSviTblPriNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSviTblPriNbr, mmiSviTblPriNbr.length);
  }

  public void setMmiSviTblPriNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblPriNbr, mmiSviTblPriNbr.length);
  }

  /**
   * Update MmiSviTblPriNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSviTblPriNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblPriNbr + targetIndex, targetLen);
  }

  /**
   * Update MmiSviTblPriNbr with another Field
   *
   * @param value
   */
  public void setMmiSviTblPriNbr(Field source) {
    replace(source, 0, source.length(), beginMmiSviTblPriNbr, MMI_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update MmiSviTblPriNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSviTblPriNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblPriNbr, MMI_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update MmiSviTblPriNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSviTblPriNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblPriNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiTierLblInd
   *
   * @return mmiTierLblInd
   */
  public char[] getMmiTierLblInd() throws CFException {
    if (isMmiTierLblIndModified()) {
      mmiTierLblInd = refreshMmiTierLblInd();
    }
    return mmiTierLblInd;
  }

  /**
   * set variable mmiTierLblInd Corresponding COBOL Variable is MMI-TIER-LBL-IND
   *
   * @param value
   */
  public void setMmiTierLblInd(char[] value) {
    mmiTierLblInd = checkMmiTierLblIndConstraints(value);
    serializeMmiTierLblInd(mmiTierLblInd);
  }

  /**
   * Update MmiTierLblInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiTierLblInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiTierLblInd, mmiTierLblInd.length);
  }

  public void setMmiTierLblInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiTierLblInd, mmiTierLblInd.length);
  }

  /**
   * Update MmiTierLblInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiTierLblInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiTierLblInd + targetIndex, targetLen);
  }

  /**
   * Update MmiTierLblInd with another Field
   *
   * @param value
   */
  public void setMmiTierLblInd(Field source) {
    replace(source, 0, source.length(), beginMmiTierLblInd, MMI_TIER_LBL_IND_LEN);
  }

  /**
   * Update MmiTierLblInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiTierLblInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiTierLblInd, MMI_TIER_LBL_IND_LEN);
  }

  /**
   * Update MmiTierLblInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiTierLblInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiTierLblInd + targetIndex, targetLen);
  }

  public BigDecimal getMmiTier1CopayAmt() throws CFException {
    if (isMmiTier1CopayAmtModified()) {
      mmiTier1CopayAmt = refreshMmiTier1CopayAmt();
    }
    return mmiTier1CopayAmt;
  }

  public char[] getMmiTier1CopayAmtString() {
    return mmiTier1CopayAmtString();
  }

  /**
   * Update MmiTier1CopayAmt with the passed number Corresponding COBOL Variable is
   * MMI-TIER-1-COPAY-AMT
   *
   * @param number
   */
  public void setMmiTier1CopayAmt(BigDecimal number) {
    mmiTier1CopayAmt = checkMmiTier1CopayAmtMaxLimit(number);
    serializeMmiTier1CopayAmt(mmiTier1CopayAmt);
  }
  /**
   * Returns the value of mmiTier1FamNewCoinsAmt
   *
   * @return mmiTier1FamNewCoinsAmt
   */
  public int getMmiTier1FamNewCoinsAmt() throws CFException {
    if (isMmiTier1FamNewCoinsAmtModified()) {
      mmiTier1FamNewCoinsAmt = refreshMmiTier1FamNewCoinsAmt();
    }
    return mmiTier1FamNewCoinsAmt;
  }

  /**
   * Update MmiTier1FamNewCoinsAmt with the passed value Corresponding COBOL Variable is
   * MMI-TIER-1-FAM-NEW-COINS-AMT
   *
   * @param number
   */
  public void setMmiTier1FamNewCoinsAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiTier1FamNewCoinsAmt = checkMmiTier1FamNewCoinsAmtMaxLimit(number);
    serializeMmiTier1FamNewCoinsAmt(mmiTier1FamNewCoinsAmt);
  }

  public void setMmiTier1FamNewCoinsAmt(long number) {
    number =
        checkMmiTier1FamNewCoinsAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiTier1FamNewCoinsAmt((int) number);
  }

  /**
   * Returns the value of mmiTier1LftmMaxAmt
   *
   * @return mmiTier1LftmMaxAmt
   */
  public int getMmiTier1LftmMaxAmt() throws CFException {
    if (isMmiTier1LftmMaxAmtModified()) {
      mmiTier1LftmMaxAmt = refreshMmiTier1LftmMaxAmt();
    }
    return mmiTier1LftmMaxAmt;
  }

  /**
   * Update MmiTier1LftmMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-TIER-1-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setMmiTier1LftmMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiTier1LftmMaxAmt = checkMmiTier1LftmMaxAmtMaxLimit(number);
    serializeMmiTier1LftmMaxAmt(mmiTier1LftmMaxAmt);
  }

  public void setMmiTier1LftmMaxAmt(long number) {
    number = checkMmiTier1LftmMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiTier1LftmMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiTier1NewCoinsAmt
   *
   * @return mmiTier1NewCoinsAmt
   */
  public int getMmiTier1NewCoinsAmt() throws CFException {
    if (isMmiTier1NewCoinsAmtModified()) {
      mmiTier1NewCoinsAmt = refreshMmiTier1NewCoinsAmt();
    }
    return mmiTier1NewCoinsAmt;
  }

  /**
   * Update MmiTier1NewCoinsAmt with the passed value Corresponding COBOL Variable is
   * MMI-TIER-1-NEW-COINS-AMT
   *
   * @param number
   */
  public void setMmiTier1NewCoinsAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiTier1NewCoinsAmt = checkMmiTier1NewCoinsAmtMaxLimit(number);
    serializeMmiTier1NewCoinsAmt(mmiTier1NewCoinsAmt);
  }

  public void setMmiTier1NewCoinsAmt(long number) {
    number = checkMmiTier1NewCoinsAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiTier1NewCoinsAmt((int) number);
  }

  public BigDecimal getMmiTier1UrgntCareAmt() throws CFException {
    if (isMmiTier1UrgntCareAmtModified()) {
      mmiTier1UrgntCareAmt = refreshMmiTier1UrgntCareAmt();
    }
    return mmiTier1UrgntCareAmt;
  }

  public char[] getMmiTier1UrgntCareAmtString() {
    return mmiTier1UrgntCareAmtString();
  }

  /**
   * Update MmiTier1UrgntCareAmt with the passed number Corresponding COBOL Variable is
   * MMI-TIER-1-URGNT-CARE-AMT
   *
   * @param number
   */
  public void setMmiTier1UrgntCareAmt(BigDecimal number) {
    mmiTier1UrgntCareAmt = checkMmiTier1UrgntCareAmtMaxLimit(number);
    serializeMmiTier1UrgntCareAmt(mmiTier1UrgntCareAmt);
  }
  /**
   * Returns the value of mmiTier1UrgntCareOopCd
   *
   * @return mmiTier1UrgntCareOopCd
   */
  public char[] getMmiTier1UrgntCareOopCd() throws CFException {
    if (isMmiTier1UrgntCareOopCdModified()) {
      mmiTier1UrgntCareOopCd = refreshMmiTier1UrgntCareOopCd();
    }
    return mmiTier1UrgntCareOopCd;
  }

  /**
   * set variable mmiTier1UrgntCareOopCd Corresponding COBOL Variable is
   * MMI-TIER-1-URGNT-CARE-OOP-CD
   *
   * @param value
   */
  public void setMmiTier1UrgntCareOopCd(char[] value) {
    mmiTier1UrgntCareOopCd = checkMmiTier1UrgntCareOopCdConstraints(value);
    serializeMmiTier1UrgntCareOopCd(mmiTier1UrgntCareOopCd);
  }

  /**
   * Update MmiTier1UrgntCareOopCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiTier1UrgntCareOopCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiTier1UrgntCareOopCd,
        mmiTier1UrgntCareOopCd.length);
  }

  public void setMmiTier1UrgntCareOopCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiTier1UrgntCareOopCd, mmiTier1UrgntCareOopCd.length);
  }

  /**
   * Update MmiTier1UrgntCareOopCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiTier1UrgntCareOopCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiTier1UrgntCareOopCd + targetIndex, targetLen);
  }

  /**
   * Update MmiTier1UrgntCareOopCd with another Field
   *
   * @param value
   */
  public void setMmiTier1UrgntCareOopCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiTier1UrgntCareOopCd, MMI_TIER_1_URGNT_CARE_OOP_CD_LEN);
  }

  /**
   * Update MmiTier1UrgntCareOopCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiTier1UrgntCareOopCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiTier1UrgntCareOopCd,
        MMI_TIER_1_URGNT_CARE_OOP_CD_LEN);
  }

  /**
   * Update MmiTier1UrgntCareOopCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiTier1UrgntCareOopCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiTier1UrgntCareOopCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiTravBenMktNbr
   *
   * @return mmiTravBenMktNbr
   */
  public int getMmiTravBenMktNbr() throws CFException {
    if (isMmiTravBenMktNbrModified()) {
      mmiTravBenMktNbr = refreshMmiTravBenMktNbr();
    }
    return mmiTravBenMktNbr;
  }

  /**
   * Update MmiTravBenMktNbr with the passed value Corresponding COBOL Variable is
   * MMI-TRAV-BEN-MKT-NBR
   *
   * @param number
   */
  public void setMmiTravBenMktNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiTravBenMktNbr = checkMmiTravBenMktNbrMaxLimit(number);
    serializeMmiTravBenMktNbr(mmiTravBenMktNbr);
  }

  public void setMmiTravBenMktNbr(long number) {
    number = checkMmiTravBenMktNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiTravBenMktNbr((int) number);
  }

  /**
   * Returns the value of mmiTravBenTblNbr
   *
   * @return mmiTravBenTblNbr
   */
  public int getMmiTravBenTblNbr() throws CFException {
    if (isMmiTravBenTblNbrModified()) {
      mmiTravBenTblNbr = refreshMmiTravBenTblNbr();
    }
    return mmiTravBenTblNbr;
  }

  /**
   * Update MmiTravBenTblNbr with the passed value Corresponding COBOL Variable is
   * MMI-TRAV-BEN-TBL-NBR
   *
   * @param number
   */
  public void setMmiTravBenTblNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiTravBenTblNbr = checkMmiTravBenTblNbrMaxLimit(number);
    serializeMmiTravBenTblNbr(mmiTravBenTblNbr);
  }

  public void setMmiTravBenTblNbr(long number) {
    number = checkMmiTravBenTblNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiTravBenTblNbr((int) number);
  }

  /**
   * Returns the value of mmiUhpCd
   *
   * @return mmiUhpCd
   */
  public char[] getMmiUhpCd() throws CFException {
    if (isMmiUhpCdModified()) {
      mmiUhpCd = refreshMmiUhpCd();
    }
    return mmiUhpCd;
  }

  /**
   * set variable mmiUhpCd Corresponding COBOL Variable is MMI-UHP-CD
   *
   * @param value
   */
  public void setMmiUhpCd(char[] value) {
    mmiUhpCd = checkMmiUhpCdConstraints(value);
    serializeMmiUhpCd(mmiUhpCd);
  }

  /**
   * Update MmiUhpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiUhpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiUhpCd, mmiUhpCd.length);
  }

  public void setMmiUhpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiUhpCd, mmiUhpCd.length);
  }

  /**
   * Update MmiUhpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiUhpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiUhpCd + targetIndex, targetLen);
  }

  /**
   * Update MmiUhpCd with another Field
   *
   * @param value
   */
  public void setMmiUhpCd(Field source) {
    replace(source, 0, source.length(), beginMmiUhpCd, MMI_UHP_CD_LEN);
  }

  /**
   * Update MmiUhpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiUhpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiUhpCd, MMI_UHP_CD_LEN);
  }

  /**
   * Update MmiUhpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiUhpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiUhpCd + targetIndex, targetLen);
  }

  public BigDecimal getMmiUrgntCareAmt() throws CFException {
    if (isMmiUrgntCareAmtModified()) {
      mmiUrgntCareAmt = refreshMmiUrgntCareAmt();
    }
    return mmiUrgntCareAmt;
  }

  public char[] getMmiUrgntCareAmtString() {
    return mmiUrgntCareAmtString();
  }

  /**
   * Update MmiUrgntCareAmt with the passed number Corresponding COBOL Variable is
   * MMI-URGNT-CARE-AMT
   *
   * @param number
   */
  public void setMmiUrgntCareAmt(BigDecimal number) {
    mmiUrgntCareAmt = checkMmiUrgntCareAmtMaxLimit(number);
    serializeMmiUrgntCareAmt(mmiUrgntCareAmt);
  }
  /**
   * Returns the value of mmiVarPrdFct
   *
   * @return mmiVarPrdFct
   */
  public short getMmiVarPrdFct() throws CFException {
    if (isMmiVarPrdFctModified()) {
      mmiVarPrdFct = refreshMmiVarPrdFct();
    }
    return mmiVarPrdFct;
  }

  /**
   * Update MmiVarPrdFct with the passed value Corresponding COBOL Variable is MMI-VAR-PRD-FCT
   *
   * @param number
   */
  public void setMmiVarPrdFct(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiVarPrdFct = checkMmiVarPrdFctMaxLimit(number);
    serializeMmiVarPrdFct(mmiVarPrdFct);
  }

  public void setMmiVarPrdFct(int number) {
    number = checkMmiVarPrdFctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setMmiVarPrdFct((short) number);
  }

  public void setMmiVarPrdFct(long number) {
    number = checkMmiVarPrdFctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setMmiVarPrdFct((short) number);
  }

  /**
   * Returns the value of mmiXtraTerrStMandInd
   *
   * @return mmiXtraTerrStMandInd
   */
  public char[] getMmiXtraTerrStMandInd() throws CFException {
    if (isMmiXtraTerrStMandIndModified()) {
      mmiXtraTerrStMandInd = refreshMmiXtraTerrStMandInd();
    }
    return mmiXtraTerrStMandInd;
  }

  /**
   * set variable mmiXtraTerrStMandInd Corresponding COBOL Variable is MMI-XTRA-TERR-ST-MAND-IND
   *
   * @param value
   */
  public void setMmiXtraTerrStMandInd(char[] value) {
    mmiXtraTerrStMandInd = checkMmiXtraTerrStMandIndConstraints(value);
    serializeMmiXtraTerrStMandInd(mmiXtraTerrStMandInd);
  }

  /**
   * Update MmiXtraTerrStMandInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiXtraTerrStMandInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiXtraTerrStMandInd, mmiXtraTerrStMandInd.length);
  }

  public void setMmiXtraTerrStMandInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXtraTerrStMandInd, mmiXtraTerrStMandInd.length);
  }

  /**
   * Update MmiXtraTerrStMandInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiXtraTerrStMandInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXtraTerrStMandInd + targetIndex, targetLen);
  }

  /**
   * Update MmiXtraTerrStMandInd with another Field
   *
   * @param value
   */
  public void setMmiXtraTerrStMandInd(Field source) {
    replace(source, 0, source.length(), beginMmiXtraTerrStMandInd, MMI_XTRA_TERR_ST_MAND_IND_LEN);
  }

  /**
   * Update MmiXtraTerrStMandInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiXtraTerrStMandInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiXtraTerrStMandInd, MMI_XTRA_TERR_ST_MAND_IND_LEN);
  }

  /**
   * Update MmiXtraTerrStMandInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiXtraTerrStMandInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXtraTerrStMandInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiRsnCustyPrdCd
   *
   * @return mmiRsnCustyPrdCd
   */
  public char[] getMmiRsnCustyPrdCd() throws CFException {
    if (isMmiRsnCustyPrdCdModified()) {
      mmiRsnCustyPrdCd = refreshMmiRsnCustyPrdCd();
    }
    return mmiRsnCustyPrdCd;
  }

  /**
   * set variable mmiRsnCustyPrdCd Corresponding COBOL Variable is MMI-RSN-CUSTY-PRD-CD
   *
   * @param value
   */
  public void setMmiRsnCustyPrdCd(char[] value) {
    mmiRsnCustyPrdCd = checkMmiRsnCustyPrdCdConstraints(value);
    serializeMmiRsnCustyPrdCd(mmiRsnCustyPrdCd);
  }

  /**
   * Update MmiRsnCustyPrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRsnCustyPrdCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiRsnCustyPrdCd, mmiRsnCustyPrdCd.length);
  }

  public void setMmiRsnCustyPrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRsnCustyPrdCd, mmiRsnCustyPrdCd.length);
  }

  /**
   * Update MmiRsnCustyPrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRsnCustyPrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRsnCustyPrdCd + targetIndex, targetLen);
  }

  /**
   * Update MmiRsnCustyPrdCd with another Field
   *
   * @param value
   */
  public void setMmiRsnCustyPrdCd(Field source) {
    replace(source, 0, source.length(), beginMmiRsnCustyPrdCd, MMI_RSN_CUSTY_PRD_CD_LEN);
  }

  /**
   * Update MmiRsnCustyPrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRsnCustyPrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRsnCustyPrdCd, MMI_RSN_CUSTY_PRD_CD_LEN);
  }

  /**
   * Update MmiRsnCustyPrdCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRsnCustyPrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRsnCustyPrdCd + targetIndex, targetLen);
  }

  public BigDecimal getMmiDfltChrgPct() throws CFException {
    if (isMmiDfltChrgPctModified()) {
      mmiDfltChrgPct = refreshMmiDfltChrgPct();
    }
    return mmiDfltChrgPct;
  }

  public char[] getMmiDfltChrgPctString() {
    return mmiDfltChrgPctString();
  }

  /**
   * Update MmiDfltChrgPct with the passed number Corresponding COBOL Variable is MMI-DFLT-CHRG-PCT
   *
   * @param number
   */
  public void setMmiDfltChrgPct(BigDecimal number) {
    mmiDfltChrgPct = checkMmiDfltChrgPctMaxLimit(number);
    serializeMmiDfltChrgPct(mmiDfltChrgPct);
  }
  /**
   * Returns the value of mmiFaclShrSvCd
   *
   * @return mmiFaclShrSvCd
   */
  public char[] getMmiFaclShrSvCd() throws CFException {
    if (isMmiFaclShrSvCdModified()) {
      mmiFaclShrSvCd = refreshMmiFaclShrSvCd();
    }
    return mmiFaclShrSvCd;
  }

  /**
   * set variable mmiFaclShrSvCd Corresponding COBOL Variable is MMI-FACL-SHR-SV-CD
   *
   * @param value
   */
  public void setMmiFaclShrSvCd(char[] value) {
    mmiFaclShrSvCd = checkMmiFaclShrSvCdConstraints(value);
    serializeMmiFaclShrSvCd(mmiFaclShrSvCd);
  }

  /**
   * Update MmiFaclShrSvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiFaclShrSvCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiFaclShrSvCd, mmiFaclShrSvCd.length);
  }

  public void setMmiFaclShrSvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclShrSvCd, mmiFaclShrSvCd.length);
  }

  /**
   * Update MmiFaclShrSvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFaclShrSvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclShrSvCd + targetIndex, targetLen);
  }

  /**
   * Update MmiFaclShrSvCd with another Field
   *
   * @param value
   */
  public void setMmiFaclShrSvCd(Field source) {
    replace(source, 0, source.length(), beginMmiFaclShrSvCd, MMI_FACL_SHR_SV_CD_LEN);
  }

  /**
   * Update MmiFaclShrSvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiFaclShrSvCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclShrSvCd, MMI_FACL_SHR_SV_CD_LEN);
  }

  /**
   * Update MmiFaclShrSvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFaclShrSvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclShrSvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPhysnShrSvCd
   *
   * @return mmiPhysnShrSvCd
   */
  public char[] getMmiPhysnShrSvCd() throws CFException {
    if (isMmiPhysnShrSvCdModified()) {
      mmiPhysnShrSvCd = refreshMmiPhysnShrSvCd();
    }
    return mmiPhysnShrSvCd;
  }

  /**
   * set variable mmiPhysnShrSvCd Corresponding COBOL Variable is MMI-PHYSN-SHR-SV-CD
   *
   * @param value
   */
  public void setMmiPhysnShrSvCd(char[] value) {
    mmiPhysnShrSvCd = checkMmiPhysnShrSvCdConstraints(value);
    serializeMmiPhysnShrSvCd(mmiPhysnShrSvCd);
  }

  /**
   * Update MmiPhysnShrSvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPhysnShrSvCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPhysnShrSvCd, mmiPhysnShrSvCd.length);
  }

  public void setMmiPhysnShrSvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysnShrSvCd, mmiPhysnShrSvCd.length);
  }

  /**
   * Update MmiPhysnShrSvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPhysnShrSvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysnShrSvCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPhysnShrSvCd with another Field
   *
   * @param value
   */
  public void setMmiPhysnShrSvCd(Field source) {
    replace(source, 0, source.length(), beginMmiPhysnShrSvCd, MMI_PHYSN_SHR_SV_CD_LEN);
  }

  /**
   * Update MmiPhysnShrSvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPhysnShrSvCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysnShrSvCd, MMI_PHYSN_SHR_SV_CD_LEN);
  }

  /**
   * Update MmiPhysnShrSvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPhysnShrSvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPhysnShrSvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCptnXclsInd
   *
   * @return mmiCptnXclsInd
   */
  public char[] getMmiCptnXclsInd() throws CFException {
    if (isMmiCptnXclsIndModified()) {
      mmiCptnXclsInd = refreshMmiCptnXclsInd();
    }
    return mmiCptnXclsInd;
  }

  /**
   * set variable mmiCptnXclsInd Corresponding COBOL Variable is MMI-CPTN-XCLS-IND
   *
   * @param value
   */
  public void setMmiCptnXclsInd(char[] value) {
    mmiCptnXclsInd = checkMmiCptnXclsIndConstraints(value);
    serializeMmiCptnXclsInd(mmiCptnXclsInd);
  }

  /**
   * Update MmiCptnXclsInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCptnXclsInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiCptnXclsInd, mmiCptnXclsInd.length);
  }

  public void setMmiCptnXclsInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCptnXclsInd, mmiCptnXclsInd.length);
  }

  /**
   * Update MmiCptnXclsInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCptnXclsInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCptnXclsInd + targetIndex, targetLen);
  }

  /**
   * Update MmiCptnXclsInd with another Field
   *
   * @param value
   */
  public void setMmiCptnXclsInd(Field source) {
    replace(source, 0, source.length(), beginMmiCptnXclsInd, MMI_CPTN_XCLS_IND_LEN);
  }

  /**
   * Update MmiCptnXclsInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCptnXclsInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCptnXclsInd, MMI_CPTN_XCLS_IND_LEN);
  }

  /**
   * Update MmiCptnXclsInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCptnXclsInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCptnXclsInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiObsolete1
   *
   * @return mmiObsolete1
   */
  public char[] getMmiObsolete1() throws CFException {
    if (isMmiObsolete1Modified()) {
      mmiObsolete1 = refreshMmiObsolete1();
    }
    return mmiObsolete1;
  }

  /**
   * set variable mmiObsolete1 Corresponding COBOL Variable is MMI-OBSOLETE1
   *
   * @param value
   */
  public void setMmiObsolete1(char[] value) {
    mmiObsolete1 = checkMmiObsolete1Constraints(value);
    serializeMmiObsolete1(mmiObsolete1);
  }

  /**
   * Update MmiObsolete1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiObsolete1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiObsolete1, mmiObsolete1.length);
  }

  public void setMmiObsolete1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete1, mmiObsolete1.length);
  }

  /**
   * Update MmiObsolete1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObsolete1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete1 + targetIndex, targetLen);
  }

  /**
   * Update MmiObsolete1 with another Field
   *
   * @param value
   */
  public void setMmiObsolete1(Field source) {
    replace(source, 0, source.length(), beginMmiObsolete1, MMI_OBSOLETE_1_LEN);
  }

  /**
   * Update MmiObsolete1 with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiObsolete1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete1, MMI_OBSOLETE_1_LEN);
  }

  /**
   * Update MmiObsolete1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiObsolete1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiObsolete1 + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNewCoinsAccumCd
   *
   * @return mmiNewCoinsAccumCd
   */
  public char[] getMmiNewCoinsAccumCd() throws CFException {
    if (isMmiNewCoinsAccumCdModified()) {
      mmiNewCoinsAccumCd = refreshMmiNewCoinsAccumCd();
    }
    return mmiNewCoinsAccumCd;
  }

  /**
   * set variable mmiNewCoinsAccumCd Corresponding COBOL Variable is MMI-NEW-COINS-ACCUM-CD
   *
   * @param value
   */
  public void setMmiNewCoinsAccumCd(char[] value) {
    mmiNewCoinsAccumCd = checkMmiNewCoinsAccumCdConstraints(value);
    serializeMmiNewCoinsAccumCd(mmiNewCoinsAccumCd);
  }

  /**
   * Update MmiNewCoinsAccumCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsAccumCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNewCoinsAccumCd, mmiNewCoinsAccumCd.length);
  }

  public void setMmiNewCoinsAccumCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsAccumCd, mmiNewCoinsAccumCd.length);
  }

  /**
   * Update MmiNewCoinsAccumCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsAccumCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsAccumCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNewCoinsAccumCd with another Field
   *
   * @param value
   */
  public void setMmiNewCoinsAccumCd(Field source) {
    replace(source, 0, source.length(), beginMmiNewCoinsAccumCd, MMI_NEW_COINS_ACCUM_CD_LEN);
  }

  /**
   * Update MmiNewCoinsAccumCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsAccumCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsAccumCd, MMI_NEW_COINS_ACCUM_CD_LEN);
  }

  /**
   * Update MmiNewCoinsAccumCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsAccumCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsAccumCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiErisaInd
   *
   * @return mmiErisaInd
   */
  public char[] getMmiErisaInd() throws CFException {
    if (isMmiErisaIndModified()) {
      mmiErisaInd = refreshMmiErisaInd();
    }
    return mmiErisaInd;
  }

  /**
   * set variable mmiErisaInd Corresponding COBOL Variable is MMI-ERISA-IND
   *
   * @param value
   */
  public void setMmiErisaInd(char[] value) {
    mmiErisaInd = checkMmiErisaIndConstraints(value);
    serializeMmiErisaInd(mmiErisaInd);
  }

  /**
   * Update MmiErisaInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiErisaInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiErisaInd, mmiErisaInd.length);
  }

  public void setMmiErisaInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiErisaInd, mmiErisaInd.length);
  }

  /**
   * Update MmiErisaInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiErisaInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiErisaInd + targetIndex, targetLen);
  }

  /**
   * Update MmiErisaInd with another Field
   *
   * @param value
   */
  public void setMmiErisaInd(Field source) {
    replace(source, 0, source.length(), beginMmiErisaInd, MMI_ERISA_IND_LEN);
  }

  /**
   * Update MmiErisaInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiErisaInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiErisaInd, MMI_ERISA_IND_LEN);
  }

  /**
   * Update MmiErisaInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiErisaInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiErisaInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBhvHlthVendCd
   *
   * @return mmiBhvHlthVendCd
   */
  public char[] getMmiBhvHlthVendCd() throws CFException {
    if (isMmiBhvHlthVendCdModified()) {
      mmiBhvHlthVendCd = refreshMmiBhvHlthVendCd();
    }
    return mmiBhvHlthVendCd;
  }

  /**
   * set variable mmiBhvHlthVendCd Corresponding COBOL Variable is MMI-BHV-HLTH-VEND-CD
   *
   * @param value
   */
  public void setMmiBhvHlthVendCd(char[] value) {
    mmiBhvHlthVendCd = checkMmiBhvHlthVendCdConstraints(value);
    serializeMmiBhvHlthVendCd(mmiBhvHlthVendCd);
  }

  /**
   * Update MmiBhvHlthVendCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBhvHlthVendCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBhvHlthVendCd, mmiBhvHlthVendCd.length);
  }

  public void setMmiBhvHlthVendCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBhvHlthVendCd, mmiBhvHlthVendCd.length);
  }

  /**
   * Update MmiBhvHlthVendCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBhvHlthVendCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBhvHlthVendCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBhvHlthVendCd with another Field
   *
   * @param value
   */
  public void setMmiBhvHlthVendCd(Field source) {
    replace(source, 0, source.length(), beginMmiBhvHlthVendCd, MMI_BHV_HLTH_VEND_CD_LEN);
  }

  /**
   * Update MmiBhvHlthVendCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBhvHlthVendCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBhvHlthVendCd, MMI_BHV_HLTH_VEND_CD_LEN);
  }

  /**
   * Update MmiBhvHlthVendCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBhvHlthVendCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBhvHlthVendCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEapVendCd
   *
   * @return mmiEapVendCd
   */
  public char[] getMmiEapVendCd() throws CFException {
    if (isMmiEapVendCdModified()) {
      mmiEapVendCd = refreshMmiEapVendCd();
    }
    return mmiEapVendCd;
  }

  /**
   * set variable mmiEapVendCd Corresponding COBOL Variable is MMI-EAP-VEND-CD
   *
   * @param value
   */
  public void setMmiEapVendCd(char[] value) {
    mmiEapVendCd = checkMmiEapVendCdConstraints(value);
    serializeMmiEapVendCd(mmiEapVendCd);
  }

  /**
   * Update MmiEapVendCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEapVendCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEapVendCd, mmiEapVendCd.length);
  }

  public void setMmiEapVendCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEapVendCd, mmiEapVendCd.length);
  }

  /**
   * Update MmiEapVendCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEapVendCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEapVendCd + targetIndex, targetLen);
  }

  /**
   * Update MmiEapVendCd with another Field
   *
   * @param value
   */
  public void setMmiEapVendCd(Field source) {
    replace(source, 0, source.length(), beginMmiEapVendCd, MMI_EAP_VEND_CD_LEN);
  }

  /**
   * Update MmiEapVendCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEapVendCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEapVendCd, MMI_EAP_VEND_CD_LEN);
  }

  /**
   * Update MmiEapVendCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEapVendCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEapVendCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiVisnCd
   *
   * @return mmiVisnCd
   */
  public char[] getMmiVisnCd() throws CFException {
    if (isMmiVisnCdModified()) {
      mmiVisnCd = refreshMmiVisnCd();
    }
    return mmiVisnCd;
  }

  /**
   * set variable mmiVisnCd Corresponding COBOL Variable is MMI-VISN-CD
   *
   * @param value
   */
  public void setMmiVisnCd(char[] value) {
    mmiVisnCd = checkMmiVisnCdConstraints(value);
    serializeMmiVisnCd(mmiVisnCd);
  }

  /**
   * Update MmiVisnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiVisnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiVisnCd, mmiVisnCd.length);
  }

  public void setMmiVisnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiVisnCd, mmiVisnCd.length);
  }

  /**
   * Update MmiVisnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiVisnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiVisnCd + targetIndex, targetLen);
  }

  /**
   * Update MmiVisnCd with another Field
   *
   * @param value
   */
  public void setMmiVisnCd(Field source) {
    replace(source, 0, source.length(), beginMmiVisnCd, MMI_VISN_CD_LEN);
  }

  /**
   * Update MmiVisnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiVisnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiVisnCd, MMI_VISN_CD_LEN);
  }

  /**
   * Update MmiVisnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiVisnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiVisnCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiFaclClmEdtInd
   *
   * @return mmiFaclClmEdtInd
   */
  public char[] getMmiFaclClmEdtInd() throws CFException {
    if (isMmiFaclClmEdtIndModified()) {
      mmiFaclClmEdtInd = refreshMmiFaclClmEdtInd();
    }
    return mmiFaclClmEdtInd;
  }

  /**
   * set variable mmiFaclClmEdtInd Corresponding COBOL Variable is MMI-FACL-CLM-EDT-IND
   *
   * @param value
   */
  public void setMmiFaclClmEdtInd(char[] value) {
    mmiFaclClmEdtInd = checkMmiFaclClmEdtIndConstraints(value);
    serializeMmiFaclClmEdtInd(mmiFaclClmEdtInd);
  }

  /**
   * Update MmiFaclClmEdtInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiFaclClmEdtInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiFaclClmEdtInd, mmiFaclClmEdtInd.length);
  }

  public void setMmiFaclClmEdtInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclClmEdtInd, mmiFaclClmEdtInd.length);
  }

  /**
   * Update MmiFaclClmEdtInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFaclClmEdtInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclClmEdtInd + targetIndex, targetLen);
  }

  /**
   * Update MmiFaclClmEdtInd with another Field
   *
   * @param value
   */
  public void setMmiFaclClmEdtInd(Field source) {
    replace(source, 0, source.length(), beginMmiFaclClmEdtInd, MMI_FACL_CLM_EDT_IND_LEN);
  }

  /**
   * Update MmiFaclClmEdtInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiFaclClmEdtInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclClmEdtInd, MMI_FACL_CLM_EDT_IND_LEN);
  }

  /**
   * Update MmiFaclClmEdtInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFaclClmEdtInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFaclClmEdtInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPlnFturCd
   *
   * @return mmiPlnFturCd
   */
  public char[] getMmiPlnFturCd() throws CFException {
    if (isMmiPlnFturCdModified()) {
      mmiPlnFturCd = refreshMmiPlnFturCd();
    }
    return mmiPlnFturCd;
  }

  /**
   * set variable mmiPlnFturCd Corresponding COBOL Variable is MMI-PLN-FTUR-CD
   *
   * @param value
   */
  public void setMmiPlnFturCd(char[] value) {
    mmiPlnFturCd = checkMmiPlnFturCdConstraints(value);
    serializeMmiPlnFturCd(mmiPlnFturCd);
  }

  /**
   * Update MmiPlnFturCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPlnFturCd, mmiPlnFturCd.length);
  }

  public void setMmiPlnFturCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturCd, mmiPlnFturCd.length);
  }

  /**
   * Update MmiPlnFturCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturCd + targetIndex, targetLen);
  }

  /**
   * Update MmiPlnFturCd with another Field
   *
   * @param value
   */
  public void setMmiPlnFturCd(Field source) {
    replace(source, 0, source.length(), beginMmiPlnFturCd, MMI_PLN_FTUR_CD_LEN);
  }

  /**
   * Update MmiPlnFturCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturCd, MMI_PLN_FTUR_CD_LEN);
  }

  /**
   * Update MmiPlnFturCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiFundTypCd
   *
   * @return mmiFundTypCd
   */
  public char[] getMmiFundTypCd() throws CFException {
    if (isMmiFundTypCdModified()) {
      mmiFundTypCd = refreshMmiFundTypCd();
    }
    return mmiFundTypCd;
  }

  /**
   * set variable mmiFundTypCd Corresponding COBOL Variable is MMI-FUND-TYP-CD
   *
   * @param value
   */
  public void setMmiFundTypCd(char[] value) {
    mmiFundTypCd = checkMmiFundTypCdConstraints(value);
    serializeMmiFundTypCd(mmiFundTypCd);
  }

  /**
   * Update MmiFundTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiFundTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiFundTypCd, mmiFundTypCd.length);
  }

  public void setMmiFundTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFundTypCd, mmiFundTypCd.length);
  }

  /**
   * Update MmiFundTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFundTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFundTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiFundTypCd with another Field
   *
   * @param value
   */
  public void setMmiFundTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiFundTypCd, MMI_FUND_TYP_CD_LEN);
  }

  /**
   * Update MmiFundTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiFundTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFundTypCd, MMI_FUND_TYP_CD_LEN);
  }

  /**
   * Update MmiFundTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFundTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFundTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiRxSbscrIdTypCd
   *
   * @return mmiRxSbscrIdTypCd
   */
  public char[] getMmiRxSbscrIdTypCd() throws CFException {
    if (isMmiRxSbscrIdTypCdModified()) {
      mmiRxSbscrIdTypCd = refreshMmiRxSbscrIdTypCd();
    }
    return mmiRxSbscrIdTypCd;
  }

  /**
   * set variable mmiRxSbscrIdTypCd Corresponding COBOL Variable is MMI-RX-SBSCR-ID-TYP-CD
   *
   * @param value
   */
  public void setMmiRxSbscrIdTypCd(char[] value) {
    mmiRxSbscrIdTypCd = checkMmiRxSbscrIdTypCdConstraints(value);
    serializeMmiRxSbscrIdTypCd(mmiRxSbscrIdTypCd);
  }

  /**
   * Update MmiRxSbscrIdTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRxSbscrIdTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiRxSbscrIdTypCd, mmiRxSbscrIdTypCd.length);
  }

  public void setMmiRxSbscrIdTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRxSbscrIdTypCd, mmiRxSbscrIdTypCd.length);
  }

  /**
   * Update MmiRxSbscrIdTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRxSbscrIdTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRxSbscrIdTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiRxSbscrIdTypCd with another Field
   *
   * @param value
   */
  public void setMmiRxSbscrIdTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiRxSbscrIdTypCd, MMI_RX_SBSCR_ID_TYP_CD_LEN);
  }

  /**
   * Update MmiRxSbscrIdTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRxSbscrIdTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRxSbscrIdTypCd, MMI_RX_SBSCR_ID_TYP_CD_LEN);
  }

  /**
   * Update MmiRxSbscrIdTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRxSbscrIdTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRxSbscrIdTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPrdctCdId
   *
   * @return mmiPrdctCdId
   */
  public char[] getMmiPrdctCdId() throws CFException {
    if (isMmiPrdctCdIdModified()) {
      mmiPrdctCdId = refreshMmiPrdctCdId();
    }
    return mmiPrdctCdId;
  }

  /**
   * set variable mmiPrdctCdId Corresponding COBOL Variable is MMI-PRDCT-CD-ID
   *
   * @param value
   */
  public void setMmiPrdctCdId(char[] value) {
    mmiPrdctCdId = checkMmiPrdctCdIdConstraints(value);
    serializeMmiPrdctCdId(mmiPrdctCdId);
  }

  /**
   * Update MmiPrdctCdId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPrdctCdId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPrdctCdId, mmiPrdctCdId.length);
  }

  public void setMmiPrdctCdId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctCdId, mmiPrdctCdId.length);
  }

  /**
   * Update MmiPrdctCdId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPrdctCdId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctCdId + targetIndex, targetLen);
  }

  /**
   * Update MmiPrdctCdId with another Field
   *
   * @param value
   */
  public void setMmiPrdctCdId(Field source) {
    replace(source, 0, source.length(), beginMmiPrdctCdId, MMI_PRDCT_CD_ID_LEN);
  }

  /**
   * Update MmiPrdctCdId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPrdctCdId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctCdId, MMI_PRDCT_CD_ID_LEN);
  }

  /**
   * Update MmiPrdctCdId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPrdctCdId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPrdctCdId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEnrpEmrgFaclInd
   *
   * @return mmiEnrpEmrgFaclInd
   */
  public char[] getMmiEnrpEmrgFaclInd() throws CFException {
    if (isMmiEnrpEmrgFaclIndModified()) {
      mmiEnrpEmrgFaclInd = refreshMmiEnrpEmrgFaclInd();
    }
    return mmiEnrpEmrgFaclInd;
  }

  /**
   * set variable mmiEnrpEmrgFaclInd Corresponding COBOL Variable is MMI-ENRP-EMRG-FACL-IND
   *
   * @param value
   */
  public void setMmiEnrpEmrgFaclInd(char[] value) {
    mmiEnrpEmrgFaclInd = checkMmiEnrpEmrgFaclIndConstraints(value);
    serializeMmiEnrpEmrgFaclInd(mmiEnrpEmrgFaclInd);
  }

  /**
   * Update MmiEnrpEmrgFaclInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEnrpEmrgFaclInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEnrpEmrgFaclInd, mmiEnrpEmrgFaclInd.length);
  }

  public void setMmiEnrpEmrgFaclInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEnrpEmrgFaclInd, mmiEnrpEmrgFaclInd.length);
  }

  /**
   * Update MmiEnrpEmrgFaclInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEnrpEmrgFaclInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEnrpEmrgFaclInd + targetIndex, targetLen);
  }

  /**
   * Update MmiEnrpEmrgFaclInd with another Field
   *
   * @param value
   */
  public void setMmiEnrpEmrgFaclInd(Field source) {
    replace(source, 0, source.length(), beginMmiEnrpEmrgFaclInd, MMI_ENRP_EMRG_FACL_IND_LEN);
  }

  /**
   * Update MmiEnrpEmrgFaclInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEnrpEmrgFaclInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEnrpEmrgFaclInd, MMI_ENRP_EMRG_FACL_IND_LEN);
  }

  /**
   * Update MmiEnrpEmrgFaclInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEnrpEmrgFaclInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEnrpEmrgFaclInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEmergentWrpInd
   *
   * @return mmiEmergentWrpInd
   */
  public char[] getMmiEmergentWrpInd() throws CFException {
    if (isMmiEmergentWrpIndModified()) {
      mmiEmergentWrpInd = refreshMmiEmergentWrpInd();
    }
    return mmiEmergentWrpInd;
  }

  /**
   * set variable mmiEmergentWrpInd Corresponding COBOL Variable is MMI-EMERGENT-WRP-IND
   *
   * @param value
   */
  public void setMmiEmergentWrpInd(char[] value) {
    mmiEmergentWrpInd = checkMmiEmergentWrpIndConstraints(value);
    serializeMmiEmergentWrpInd(mmiEmergentWrpInd);
  }

  /**
   * Update MmiEmergentWrpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEmergentWrpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEmergentWrpInd, mmiEmergentWrpInd.length);
  }

  public void setMmiEmergentWrpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmergentWrpInd, mmiEmergentWrpInd.length);
  }

  /**
   * Update MmiEmergentWrpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEmergentWrpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmergentWrpInd + targetIndex, targetLen);
  }

  /**
   * Update MmiEmergentWrpInd with another Field
   *
   * @param value
   */
  public void setMmiEmergentWrpInd(Field source) {
    replace(source, 0, source.length(), beginMmiEmergentWrpInd, MMI_EMERGENT_WRP_IND_LEN);
  }

  /**
   * Update MmiEmergentWrpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEmergentWrpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmergentWrpInd, MMI_EMERGENT_WRP_IND_LEN);
  }

  /**
   * Update MmiEmergentWrpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEmergentWrpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEmergentWrpInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiOopMaxCovCd
   *
   * @return mmiOopMaxCovCd
   */
  public char[] getMmiOopMaxCovCd() throws CFException {
    if (isMmiOopMaxCovCdModified()) {
      mmiOopMaxCovCd = refreshMmiOopMaxCovCd();
    }
    return mmiOopMaxCovCd;
  }

  /**
   * set variable mmiOopMaxCovCd Corresponding COBOL Variable is MMI-OOP-MAX-COV-CD
   *
   * @param value
   */
  public void setMmiOopMaxCovCd(char[] value) {
    mmiOopMaxCovCd = checkMmiOopMaxCovCdConstraints(value);
    serializeMmiOopMaxCovCd(mmiOopMaxCovCd);
  }

  /**
   * Update MmiOopMaxCovCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiOopMaxCovCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiOopMaxCovCd, mmiOopMaxCovCd.length);
  }

  public void setMmiOopMaxCovCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopMaxCovCd, mmiOopMaxCovCd.length);
  }

  /**
   * Update MmiOopMaxCovCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopMaxCovCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopMaxCovCd + targetIndex, targetLen);
  }

  /**
   * Update MmiOopMaxCovCd with another Field
   *
   * @param value
   */
  public void setMmiOopMaxCovCd(Field source) {
    replace(source, 0, source.length(), beginMmiOopMaxCovCd, MMI_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update MmiOopMaxCovCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiOopMaxCovCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopMaxCovCd, MMI_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update MmiOopMaxCovCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOopMaxCovCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOopMaxCovCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiOncPolPrtcpCd
   *
   * @return mmiOncPolPrtcpCd
   */
  public char[] getMmiOncPolPrtcpCd() throws CFException {
    if (isMmiOncPolPrtcpCdModified()) {
      mmiOncPolPrtcpCd = refreshMmiOncPolPrtcpCd();
    }
    return mmiOncPolPrtcpCd;
  }

  /**
   * set variable mmiOncPolPrtcpCd Corresponding COBOL Variable is MMI-ONC-POL-PRTCP-CD
   *
   * @param value
   */
  public void setMmiOncPolPrtcpCd(char[] value) {
    mmiOncPolPrtcpCd = checkMmiOncPolPrtcpCdConstraints(value);
    serializeMmiOncPolPrtcpCd(mmiOncPolPrtcpCd);
  }

  /**
   * Update MmiOncPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiOncPolPrtcpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiOncPolPrtcpCd, mmiOncPolPrtcpCd.length);
  }

  public void setMmiOncPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOncPolPrtcpCd, mmiOncPolPrtcpCd.length);
  }

  /**
   * Update MmiOncPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOncPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOncPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update MmiOncPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setMmiOncPolPrtcpCd(Field source) {
    replace(source, 0, source.length(), beginMmiOncPolPrtcpCd, MMI_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update MmiOncPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiOncPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOncPolPrtcpCd, MMI_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update MmiOncPolPrtcpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiOncPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiOncPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPlnFturInd
   *
   * @return mmiPlnFturInd
   */
  public char[] getMmiPlnFturInd() throws CFException {
    if (isMmiPlnFturIndModified()) {
      mmiPlnFturInd = refreshMmiPlnFturInd();
    }
    return mmiPlnFturInd;
  }

  /**
   * set variable mmiPlnFturInd Corresponding COBOL Variable is MMI-PLN-FTUR-IND
   *
   * @param value
   */
  public void setMmiPlnFturInd(char[] value) {
    mmiPlnFturInd = checkMmiPlnFturIndConstraints(value);
    serializeMmiPlnFturInd(mmiPlnFturInd);
  }

  /**
   * Update MmiPlnFturInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPlnFturInd, mmiPlnFturInd.length);
  }

  public void setMmiPlnFturInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturInd, mmiPlnFturInd.length);
  }

  /**
   * Update MmiPlnFturInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturInd + targetIndex, targetLen);
  }

  /**
   * Update MmiPlnFturInd with another Field
   *
   * @param value
   */
  public void setMmiPlnFturInd(Field source) {
    replace(source, 0, source.length(), beginMmiPlnFturInd, MMI_PLN_FTUR_IND_LEN);
  }

  /**
   * Update MmiPlnFturInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturInd, MMI_PLN_FTUR_IND_LEN);
  }

  /**
   * Update MmiPlnFturInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPlnFturInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPlnFturInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdASetInd
   *
   * @return mmiSrvcCdASetInd
   */
  public char[] getMmiSrvcCdASetInd() throws CFException {
    if (isMmiSrvcCdASetIndModified()) {
      mmiSrvcCdASetInd = refreshMmiSrvcCdASetInd();
    }
    return mmiSrvcCdASetInd;
  }

  /**
   * set variable mmiSrvcCdASetInd Corresponding COBOL Variable is MMI-SRVC-CD-A-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdASetInd(char[] value) {
    mmiSrvcCdASetInd = checkMmiSrvcCdASetIndConstraints(value);
    serializeMmiSrvcCdASetInd(mmiSrvcCdASetInd);
  }

  /**
   * Update MmiSrvcCdASetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdASetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdASetInd, mmiSrvcCdASetInd.length);
  }

  public void setMmiSrvcCdASetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdASetInd, mmiSrvcCdASetInd.length);
  }

  /**
   * Update MmiSrvcCdASetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdASetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdASetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdASetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdASetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdASetInd, MMI_SRVC_CD_ASET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdASetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdASetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdASetInd, MMI_SRVC_CD_ASET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdASetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdASetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdASetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdBSetInd
   *
   * @return mmiSrvcCdBSetInd
   */
  public char[] getMmiSrvcCdBSetInd() throws CFException {
    if (isMmiSrvcCdBSetIndModified()) {
      mmiSrvcCdBSetInd = refreshMmiSrvcCdBSetInd();
    }
    return mmiSrvcCdBSetInd;
  }

  /**
   * set variable mmiSrvcCdBSetInd Corresponding COBOL Variable is MMI-SRVC-CD-B-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdBSetInd(char[] value) {
    mmiSrvcCdBSetInd = checkMmiSrvcCdBSetIndConstraints(value);
    serializeMmiSrvcCdBSetInd(mmiSrvcCdBSetInd);
  }

  /**
   * Update MmiSrvcCdBSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdBSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdBSetInd, mmiSrvcCdBSetInd.length);
  }

  public void setMmiSrvcCdBSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdBSetInd, mmiSrvcCdBSetInd.length);
  }

  /**
   * Update MmiSrvcCdBSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdBSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdBSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdBSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdBSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdBSetInd, MMI_SRVC_CD_BSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdBSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdBSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdBSetInd, MMI_SRVC_CD_BSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdBSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdBSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdBSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdCSetInd
   *
   * @return mmiSrvcCdCSetInd
   */
  public char[] getMmiSrvcCdCSetInd() throws CFException {
    if (isMmiSrvcCdCSetIndModified()) {
      mmiSrvcCdCSetInd = refreshMmiSrvcCdCSetInd();
    }
    return mmiSrvcCdCSetInd;
  }

  /**
   * set variable mmiSrvcCdCSetInd Corresponding COBOL Variable is MMI-SRVC-CD-C-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdCSetInd(char[] value) {
    mmiSrvcCdCSetInd = checkMmiSrvcCdCSetIndConstraints(value);
    serializeMmiSrvcCdCSetInd(mmiSrvcCdCSetInd);
  }

  /**
   * Update MmiSrvcCdCSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdCSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdCSetInd, mmiSrvcCdCSetInd.length);
  }

  public void setMmiSrvcCdCSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdCSetInd, mmiSrvcCdCSetInd.length);
  }

  /**
   * Update MmiSrvcCdCSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdCSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdCSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdCSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdCSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdCSetInd, MMI_SRVC_CD_CSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdCSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdCSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdCSetInd, MMI_SRVC_CD_CSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdCSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdCSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdCSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdDSetInd
   *
   * @return mmiSrvcCdDSetInd
   */
  public char[] getMmiSrvcCdDSetInd() throws CFException {
    if (isMmiSrvcCdDSetIndModified()) {
      mmiSrvcCdDSetInd = refreshMmiSrvcCdDSetInd();
    }
    return mmiSrvcCdDSetInd;
  }

  /**
   * set variable mmiSrvcCdDSetInd Corresponding COBOL Variable is MMI-SRVC-CD-D-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdDSetInd(char[] value) {
    mmiSrvcCdDSetInd = checkMmiSrvcCdDSetIndConstraints(value);
    serializeMmiSrvcCdDSetInd(mmiSrvcCdDSetInd);
  }

  /**
   * Update MmiSrvcCdDSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdDSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdDSetInd, mmiSrvcCdDSetInd.length);
  }

  public void setMmiSrvcCdDSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdDSetInd, mmiSrvcCdDSetInd.length);
  }

  /**
   * Update MmiSrvcCdDSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdDSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdDSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdDSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdDSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdDSetInd, MMI_SRVC_CD_DSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdDSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdDSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdDSetInd, MMI_SRVC_CD_DSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdDSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdDSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdDSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdESetInd
   *
   * @return mmiSrvcCdESetInd
   */
  public char[] getMmiSrvcCdESetInd() throws CFException {
    if (isMmiSrvcCdESetIndModified()) {
      mmiSrvcCdESetInd = refreshMmiSrvcCdESetInd();
    }
    return mmiSrvcCdESetInd;
  }

  /**
   * set variable mmiSrvcCdESetInd Corresponding COBOL Variable is MMI-SRVC-CD-E-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdESetInd(char[] value) {
    mmiSrvcCdESetInd = checkMmiSrvcCdESetIndConstraints(value);
    serializeMmiSrvcCdESetInd(mmiSrvcCdESetInd);
  }

  /**
   * Update MmiSrvcCdESetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdESetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdESetInd, mmiSrvcCdESetInd.length);
  }

  public void setMmiSrvcCdESetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdESetInd, mmiSrvcCdESetInd.length);
  }

  /**
   * Update MmiSrvcCdESetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdESetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdESetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdESetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdESetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdESetInd, MMI_SRVC_CD_ESET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdESetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdESetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdESetInd, MMI_SRVC_CD_ESET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdESetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdESetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdESetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdFSetInd
   *
   * @return mmiSrvcCdFSetInd
   */
  public char[] getMmiSrvcCdFSetInd() throws CFException {
    if (isMmiSrvcCdFSetIndModified()) {
      mmiSrvcCdFSetInd = refreshMmiSrvcCdFSetInd();
    }
    return mmiSrvcCdFSetInd;
  }

  /**
   * set variable mmiSrvcCdFSetInd Corresponding COBOL Variable is MMI-SRVC-CD-F-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdFSetInd(char[] value) {
    mmiSrvcCdFSetInd = checkMmiSrvcCdFSetIndConstraints(value);
    serializeMmiSrvcCdFSetInd(mmiSrvcCdFSetInd);
  }

  /**
   * Update MmiSrvcCdFSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdFSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdFSetInd, mmiSrvcCdFSetInd.length);
  }

  public void setMmiSrvcCdFSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdFSetInd, mmiSrvcCdFSetInd.length);
  }

  /**
   * Update MmiSrvcCdFSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdFSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdFSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdFSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdFSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdFSetInd, MMI_SRVC_CD_FSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdFSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdFSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdFSetInd, MMI_SRVC_CD_FSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdFSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdFSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdFSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdGSetInd
   *
   * @return mmiSrvcCdGSetInd
   */
  public char[] getMmiSrvcCdGSetInd() throws CFException {
    if (isMmiSrvcCdGSetIndModified()) {
      mmiSrvcCdGSetInd = refreshMmiSrvcCdGSetInd();
    }
    return mmiSrvcCdGSetInd;
  }

  /**
   * set variable mmiSrvcCdGSetInd Corresponding COBOL Variable is MMI-SRVC-CD-G-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdGSetInd(char[] value) {
    mmiSrvcCdGSetInd = checkMmiSrvcCdGSetIndConstraints(value);
    serializeMmiSrvcCdGSetInd(mmiSrvcCdGSetInd);
  }

  /**
   * Update MmiSrvcCdGSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdGSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdGSetInd, mmiSrvcCdGSetInd.length);
  }

  public void setMmiSrvcCdGSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdGSetInd, mmiSrvcCdGSetInd.length);
  }

  /**
   * Update MmiSrvcCdGSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdGSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdGSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdGSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdGSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdGSetInd, MMI_SRVC_CD_GSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdGSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdGSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdGSetInd, MMI_SRVC_CD_GSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdGSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdGSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdGSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdHSetInd
   *
   * @return mmiSrvcCdHSetInd
   */
  public char[] getMmiSrvcCdHSetInd() throws CFException {
    if (isMmiSrvcCdHSetIndModified()) {
      mmiSrvcCdHSetInd = refreshMmiSrvcCdHSetInd();
    }
    return mmiSrvcCdHSetInd;
  }

  /**
   * set variable mmiSrvcCdHSetInd Corresponding COBOL Variable is MMI-SRVC-CD-H-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdHSetInd(char[] value) {
    mmiSrvcCdHSetInd = checkMmiSrvcCdHSetIndConstraints(value);
    serializeMmiSrvcCdHSetInd(mmiSrvcCdHSetInd);
  }

  /**
   * Update MmiSrvcCdHSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdHSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdHSetInd, mmiSrvcCdHSetInd.length);
  }

  public void setMmiSrvcCdHSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdHSetInd, mmiSrvcCdHSetInd.length);
  }

  /**
   * Update MmiSrvcCdHSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdHSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdHSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdHSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdHSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdHSetInd, MMI_SRVC_CD_HSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdHSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdHSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdHSetInd, MMI_SRVC_CD_HSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdHSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdHSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdHSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdISetInd
   *
   * @return mmiSrvcCdISetInd
   */
  public char[] getMmiSrvcCdISetInd() throws CFException {
    if (isMmiSrvcCdISetIndModified()) {
      mmiSrvcCdISetInd = refreshMmiSrvcCdISetInd();
    }
    return mmiSrvcCdISetInd;
  }

  /**
   * set variable mmiSrvcCdISetInd Corresponding COBOL Variable is MMI-SRVC-CD-I-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdISetInd(char[] value) {
    mmiSrvcCdISetInd = checkMmiSrvcCdISetIndConstraints(value);
    serializeMmiSrvcCdISetInd(mmiSrvcCdISetInd);
  }

  /**
   * Update MmiSrvcCdISetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdISetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdISetInd, mmiSrvcCdISetInd.length);
  }

  public void setMmiSrvcCdISetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdISetInd, mmiSrvcCdISetInd.length);
  }

  /**
   * Update MmiSrvcCdISetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdISetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdISetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdISetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdISetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdISetInd, MMI_SRVC_CD_ISET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdISetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdISetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdISetInd, MMI_SRVC_CD_ISET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdISetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdISetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdISetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdJSetInd
   *
   * @return mmiSrvcCdJSetInd
   */
  public char[] getMmiSrvcCdJSetInd() throws CFException {
    if (isMmiSrvcCdJSetIndModified()) {
      mmiSrvcCdJSetInd = refreshMmiSrvcCdJSetInd();
    }
    return mmiSrvcCdJSetInd;
  }

  /**
   * set variable mmiSrvcCdJSetInd Corresponding COBOL Variable is MMI-SRVC-CD-J-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdJSetInd(char[] value) {
    mmiSrvcCdJSetInd = checkMmiSrvcCdJSetIndConstraints(value);
    serializeMmiSrvcCdJSetInd(mmiSrvcCdJSetInd);
  }

  /**
   * Update MmiSrvcCdJSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdJSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdJSetInd, mmiSrvcCdJSetInd.length);
  }

  public void setMmiSrvcCdJSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdJSetInd, mmiSrvcCdJSetInd.length);
  }

  /**
   * Update MmiSrvcCdJSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdJSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdJSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdJSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdJSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdJSetInd, MMI_SRVC_CD_JSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdJSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdJSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdJSetInd, MMI_SRVC_CD_JSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdJSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdJSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdJSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdKSetInd
   *
   * @return mmiSrvcCdKSetInd
   */
  public char[] getMmiSrvcCdKSetInd() throws CFException {
    if (isMmiSrvcCdKSetIndModified()) {
      mmiSrvcCdKSetInd = refreshMmiSrvcCdKSetInd();
    }
    return mmiSrvcCdKSetInd;
  }

  /**
   * set variable mmiSrvcCdKSetInd Corresponding COBOL Variable is MMI-SRVC-CD-K-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdKSetInd(char[] value) {
    mmiSrvcCdKSetInd = checkMmiSrvcCdKSetIndConstraints(value);
    serializeMmiSrvcCdKSetInd(mmiSrvcCdKSetInd);
  }

  /**
   * Update MmiSrvcCdKSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdKSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdKSetInd, mmiSrvcCdKSetInd.length);
  }

  public void setMmiSrvcCdKSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdKSetInd, mmiSrvcCdKSetInd.length);
  }

  /**
   * Update MmiSrvcCdKSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdKSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdKSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdKSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdKSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdKSetInd, MMI_SRVC_CD_KSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdKSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdKSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdKSetInd, MMI_SRVC_CD_KSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdKSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdKSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdKSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdLSetInd
   *
   * @return mmiSrvcCdLSetInd
   */
  public char[] getMmiSrvcCdLSetInd() throws CFException {
    if (isMmiSrvcCdLSetIndModified()) {
      mmiSrvcCdLSetInd = refreshMmiSrvcCdLSetInd();
    }
    return mmiSrvcCdLSetInd;
  }

  /**
   * set variable mmiSrvcCdLSetInd Corresponding COBOL Variable is MMI-SRVC-CD-L-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdLSetInd(char[] value) {
    mmiSrvcCdLSetInd = checkMmiSrvcCdLSetIndConstraints(value);
    serializeMmiSrvcCdLSetInd(mmiSrvcCdLSetInd);
  }

  /**
   * Update MmiSrvcCdLSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdLSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdLSetInd, mmiSrvcCdLSetInd.length);
  }

  public void setMmiSrvcCdLSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdLSetInd, mmiSrvcCdLSetInd.length);
  }

  /**
   * Update MmiSrvcCdLSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdLSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdLSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdLSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdLSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdLSetInd, MMI_SRVC_CD_LSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdLSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdLSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdLSetInd, MMI_SRVC_CD_LSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdLSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdLSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdLSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdMSetInd
   *
   * @return mmiSrvcCdMSetInd
   */
  public char[] getMmiSrvcCdMSetInd() throws CFException {
    if (isMmiSrvcCdMSetIndModified()) {
      mmiSrvcCdMSetInd = refreshMmiSrvcCdMSetInd();
    }
    return mmiSrvcCdMSetInd;
  }

  /**
   * set variable mmiSrvcCdMSetInd Corresponding COBOL Variable is MMI-SRVC-CD-M-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdMSetInd(char[] value) {
    mmiSrvcCdMSetInd = checkMmiSrvcCdMSetIndConstraints(value);
    serializeMmiSrvcCdMSetInd(mmiSrvcCdMSetInd);
  }

  /**
   * Update MmiSrvcCdMSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdMSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdMSetInd, mmiSrvcCdMSetInd.length);
  }

  public void setMmiSrvcCdMSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdMSetInd, mmiSrvcCdMSetInd.length);
  }

  /**
   * Update MmiSrvcCdMSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdMSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdMSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdMSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdMSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdMSetInd, MMI_SRVC_CD_MSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdMSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdMSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdMSetInd, MMI_SRVC_CD_MSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdMSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdMSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdMSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdOSetInd
   *
   * @return mmiSrvcCdOSetInd
   */
  public char[] getMmiSrvcCdOSetInd() throws CFException {
    if (isMmiSrvcCdOSetIndModified()) {
      mmiSrvcCdOSetInd = refreshMmiSrvcCdOSetInd();
    }
    return mmiSrvcCdOSetInd;
  }

  /**
   * set variable mmiSrvcCdOSetInd Corresponding COBOL Variable is MMI-SRVC-CD-O-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdOSetInd(char[] value) {
    mmiSrvcCdOSetInd = checkMmiSrvcCdOSetIndConstraints(value);
    serializeMmiSrvcCdOSetInd(mmiSrvcCdOSetInd);
  }

  /**
   * Update MmiSrvcCdOSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdOSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdOSetInd, mmiSrvcCdOSetInd.length);
  }

  public void setMmiSrvcCdOSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdOSetInd, mmiSrvcCdOSetInd.length);
  }

  /**
   * Update MmiSrvcCdOSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdOSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdOSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdOSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdOSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdOSetInd, MMI_SRVC_CD_OSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdOSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdOSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdOSetInd, MMI_SRVC_CD_OSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdOSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdOSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdOSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdQSetInd
   *
   * @return mmiSrvcCdQSetInd
   */
  public char[] getMmiSrvcCdQSetInd() throws CFException {
    if (isMmiSrvcCdQSetIndModified()) {
      mmiSrvcCdQSetInd = refreshMmiSrvcCdQSetInd();
    }
    return mmiSrvcCdQSetInd;
  }

  /**
   * set variable mmiSrvcCdQSetInd Corresponding COBOL Variable is MMI-SRVC-CD-Q-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdQSetInd(char[] value) {
    mmiSrvcCdQSetInd = checkMmiSrvcCdQSetIndConstraints(value);
    serializeMmiSrvcCdQSetInd(mmiSrvcCdQSetInd);
  }

  /**
   * Update MmiSrvcCdQSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdQSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdQSetInd, mmiSrvcCdQSetInd.length);
  }

  public void setMmiSrvcCdQSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdQSetInd, mmiSrvcCdQSetInd.length);
  }

  /**
   * Update MmiSrvcCdQSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdQSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdQSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdQSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdQSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdQSetInd, MMI_SRVC_CD_QSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdQSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdQSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdQSetInd, MMI_SRVC_CD_QSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdQSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdQSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdQSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdRSetInd
   *
   * @return mmiSrvcCdRSetInd
   */
  public char[] getMmiSrvcCdRSetInd() throws CFException {
    if (isMmiSrvcCdRSetIndModified()) {
      mmiSrvcCdRSetInd = refreshMmiSrvcCdRSetInd();
    }
    return mmiSrvcCdRSetInd;
  }

  /**
   * set variable mmiSrvcCdRSetInd Corresponding COBOL Variable is MMI-SRVC-CD-R-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdRSetInd(char[] value) {
    mmiSrvcCdRSetInd = checkMmiSrvcCdRSetIndConstraints(value);
    serializeMmiSrvcCdRSetInd(mmiSrvcCdRSetInd);
  }

  /**
   * Update MmiSrvcCdRSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdRSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdRSetInd, mmiSrvcCdRSetInd.length);
  }

  public void setMmiSrvcCdRSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdRSetInd, mmiSrvcCdRSetInd.length);
  }

  /**
   * Update MmiSrvcCdRSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdRSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdRSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdRSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdRSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdRSetInd, MMI_SRVC_CD_RSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdRSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdRSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdRSetInd, MMI_SRVC_CD_RSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdRSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdRSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdRSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdSSetInd
   *
   * @return mmiSrvcCdSSetInd
   */
  public char[] getMmiSrvcCdSSetInd() throws CFException {
    if (isMmiSrvcCdSSetIndModified()) {
      mmiSrvcCdSSetInd = refreshMmiSrvcCdSSetInd();
    }
    return mmiSrvcCdSSetInd;
  }

  /**
   * set variable mmiSrvcCdSSetInd Corresponding COBOL Variable is MMI-SRVC-CD-S-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdSSetInd(char[] value) {
    mmiSrvcCdSSetInd = checkMmiSrvcCdSSetIndConstraints(value);
    serializeMmiSrvcCdSSetInd(mmiSrvcCdSSetInd);
  }

  /**
   * Update MmiSrvcCdSSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdSSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdSSetInd, mmiSrvcCdSSetInd.length);
  }

  public void setMmiSrvcCdSSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdSSetInd, mmiSrvcCdSSetInd.length);
  }

  /**
   * Update MmiSrvcCdSSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdSSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdSSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdSSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdSSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdSSetInd, MMI_SRVC_CD_SSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdSSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdSSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdSSetInd, MMI_SRVC_CD_SSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdSSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdSSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdSSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdUSetInd
   *
   * @return mmiSrvcCdUSetInd
   */
  public char[] getMmiSrvcCdUSetInd() throws CFException {
    if (isMmiSrvcCdUSetIndModified()) {
      mmiSrvcCdUSetInd = refreshMmiSrvcCdUSetInd();
    }
    return mmiSrvcCdUSetInd;
  }

  /**
   * set variable mmiSrvcCdUSetInd Corresponding COBOL Variable is MMI-SRVC-CD-U-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdUSetInd(char[] value) {
    mmiSrvcCdUSetInd = checkMmiSrvcCdUSetIndConstraints(value);
    serializeMmiSrvcCdUSetInd(mmiSrvcCdUSetInd);
  }

  /**
   * Update MmiSrvcCdUSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdUSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdUSetInd, mmiSrvcCdUSetInd.length);
  }

  public void setMmiSrvcCdUSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdUSetInd, mmiSrvcCdUSetInd.length);
  }

  /**
   * Update MmiSrvcCdUSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdUSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdUSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdUSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdUSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdUSetInd, MMI_SRVC_CD_USET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdUSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdUSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdUSetInd, MMI_SRVC_CD_USET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdUSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdUSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdUSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdVSetInd
   *
   * @return mmiSrvcCdVSetInd
   */
  public char[] getMmiSrvcCdVSetInd() throws CFException {
    if (isMmiSrvcCdVSetIndModified()) {
      mmiSrvcCdVSetInd = refreshMmiSrvcCdVSetInd();
    }
    return mmiSrvcCdVSetInd;
  }

  /**
   * set variable mmiSrvcCdVSetInd Corresponding COBOL Variable is MMI-SRVC-CD-V-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdVSetInd(char[] value) {
    mmiSrvcCdVSetInd = checkMmiSrvcCdVSetIndConstraints(value);
    serializeMmiSrvcCdVSetInd(mmiSrvcCdVSetInd);
  }

  /**
   * Update MmiSrvcCdVSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdVSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdVSetInd, mmiSrvcCdVSetInd.length);
  }

  public void setMmiSrvcCdVSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdVSetInd, mmiSrvcCdVSetInd.length);
  }

  /**
   * Update MmiSrvcCdVSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdVSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdVSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdVSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdVSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdVSetInd, MMI_SRVC_CD_VSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdVSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdVSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdVSetInd, MMI_SRVC_CD_VSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdVSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdVSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdVSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdWSetInd
   *
   * @return mmiSrvcCdWSetInd
   */
  public char[] getMmiSrvcCdWSetInd() throws CFException {
    if (isMmiSrvcCdWSetIndModified()) {
      mmiSrvcCdWSetInd = refreshMmiSrvcCdWSetInd();
    }
    return mmiSrvcCdWSetInd;
  }

  /**
   * set variable mmiSrvcCdWSetInd Corresponding COBOL Variable is MMI-SRVC-CD-W-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdWSetInd(char[] value) {
    mmiSrvcCdWSetInd = checkMmiSrvcCdWSetIndConstraints(value);
    serializeMmiSrvcCdWSetInd(mmiSrvcCdWSetInd);
  }

  /**
   * Update MmiSrvcCdWSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdWSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdWSetInd, mmiSrvcCdWSetInd.length);
  }

  public void setMmiSrvcCdWSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdWSetInd, mmiSrvcCdWSetInd.length);
  }

  /**
   * Update MmiSrvcCdWSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdWSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdWSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdWSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdWSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdWSetInd, MMI_SRVC_CD_WSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdWSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdWSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdWSetInd, MMI_SRVC_CD_WSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdWSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdWSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdWSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdXSetInd
   *
   * @return mmiSrvcCdXSetInd
   */
  public char[] getMmiSrvcCdXSetInd() throws CFException {
    if (isMmiSrvcCdXSetIndModified()) {
      mmiSrvcCdXSetInd = refreshMmiSrvcCdXSetInd();
    }
    return mmiSrvcCdXSetInd;
  }

  /**
   * set variable mmiSrvcCdXSetInd Corresponding COBOL Variable is MMI-SRVC-CD-X-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdXSetInd(char[] value) {
    mmiSrvcCdXSetInd = checkMmiSrvcCdXSetIndConstraints(value);
    serializeMmiSrvcCdXSetInd(mmiSrvcCdXSetInd);
  }

  /**
   * Update MmiSrvcCdXSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdXSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdXSetInd, mmiSrvcCdXSetInd.length);
  }

  public void setMmiSrvcCdXSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdXSetInd, mmiSrvcCdXSetInd.length);
  }

  /**
   * Update MmiSrvcCdXSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdXSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdXSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdXSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdXSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdXSetInd, MMI_SRVC_CD_XSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdXSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdXSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdXSetInd, MMI_SRVC_CD_XSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdXSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdXSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdXSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdYSetInd
   *
   * @return mmiSrvcCdYSetInd
   */
  public char[] getMmiSrvcCdYSetInd() throws CFException {
    if (isMmiSrvcCdYSetIndModified()) {
      mmiSrvcCdYSetInd = refreshMmiSrvcCdYSetInd();
    }
    return mmiSrvcCdYSetInd;
  }

  /**
   * set variable mmiSrvcCdYSetInd Corresponding COBOL Variable is MMI-SRVC-CD-Y-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdYSetInd(char[] value) {
    mmiSrvcCdYSetInd = checkMmiSrvcCdYSetIndConstraints(value);
    serializeMmiSrvcCdYSetInd(mmiSrvcCdYSetInd);
  }

  /**
   * Update MmiSrvcCdYSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdYSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdYSetInd, mmiSrvcCdYSetInd.length);
  }

  public void setMmiSrvcCdYSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdYSetInd, mmiSrvcCdYSetInd.length);
  }

  /**
   * Update MmiSrvcCdYSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdYSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdYSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdYSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdYSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdYSetInd, MMI_SRVC_CD_YSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdYSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdYSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdYSetInd, MMI_SRVC_CD_YSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdYSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdYSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdYSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSrvcCdZSetInd
   *
   * @return mmiSrvcCdZSetInd
   */
  public char[] getMmiSrvcCdZSetInd() throws CFException {
    if (isMmiSrvcCdZSetIndModified()) {
      mmiSrvcCdZSetInd = refreshMmiSrvcCdZSetInd();
    }
    return mmiSrvcCdZSetInd;
  }

  /**
   * set variable mmiSrvcCdZSetInd Corresponding COBOL Variable is MMI-SRVC-CD-Z-SET-IND
   *
   * @param value
   */
  public void setMmiSrvcCdZSetInd(char[] value) {
    mmiSrvcCdZSetInd = checkMmiSrvcCdZSetIndConstraints(value);
    serializeMmiSrvcCdZSetInd(mmiSrvcCdZSetInd);
  }

  /**
   * Update MmiSrvcCdZSetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdZSetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSrvcCdZSetInd, mmiSrvcCdZSetInd.length);
  }

  public void setMmiSrvcCdZSetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdZSetInd, mmiSrvcCdZSetInd.length);
  }

  /**
   * Update MmiSrvcCdZSetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdZSetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdZSetInd + targetIndex, targetLen);
  }

  /**
   * Update MmiSrvcCdZSetInd with another Field
   *
   * @param value
   */
  public void setMmiSrvcCdZSetInd(Field source) {
    replace(source, 0, source.length(), beginMmiSrvcCdZSetInd, MMI_SRVC_CD_ZSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdZSetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdZSetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdZSetInd, MMI_SRVC_CD_ZSET_IND_LEN);
  }

  /**
   * Update MmiSrvcCdZSetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSrvcCdZSetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSrvcCdZSetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNonEmbdCopayCd
   *
   * @return mmiNonEmbdCopayCd
   */
  public char[] getMmiNonEmbdCopayCd() throws CFException {
    if (isMmiNonEmbdCopayCdModified()) {
      mmiNonEmbdCopayCd = refreshMmiNonEmbdCopayCd();
    }
    return mmiNonEmbdCopayCd;
  }

  /**
   * set variable mmiNonEmbdCopayCd Corresponding COBOL Variable is MMI-NON-EMBD-COPAY-CD
   *
   * @param value
   */
  public void setMmiNonEmbdCopayCd(char[] value) {
    mmiNonEmbdCopayCd = checkMmiNonEmbdCopayCdConstraints(value);
    serializeMmiNonEmbdCopayCd(mmiNonEmbdCopayCd);
  }

  /**
   * Update MmiNonEmbdCopayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCopayCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiNonEmbdCopayCd, mmiNonEmbdCopayCd.length);
  }

  public void setMmiNonEmbdCopayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCopayCd, mmiNonEmbdCopayCd.length);
  }

  /**
   * Update MmiNonEmbdCopayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCopayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCopayCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNonEmbdCopayCd with another Field
   *
   * @param value
   */
  public void setMmiNonEmbdCopayCd(Field source) {
    replace(source, 0, source.length(), beginMmiNonEmbdCopayCd, MMI_NON_EMBD_COPAY_CD_LEN);
  }

  /**
   * Update MmiNonEmbdCopayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCopayCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCopayCd, MMI_NON_EMBD_COPAY_CD_LEN);
  }

  /**
   * Update MmiNonEmbdCopayCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCopayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCopayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNonEmbdCoreOopCd
   *
   * @return mmiNonEmbdCoreOopCd
   */
  public char[] getMmiNonEmbdCoreOopCd() throws CFException {
    if (isMmiNonEmbdCoreOopCdModified()) {
      mmiNonEmbdCoreOopCd = refreshMmiNonEmbdCoreOopCd();
    }
    return mmiNonEmbdCoreOopCd;
  }

  /**
   * set variable mmiNonEmbdCoreOopCd Corresponding COBOL Variable is MMI-NON-EMBD-CORE-OOP-CD
   *
   * @param value
   */
  public void setMmiNonEmbdCoreOopCd(char[] value) {
    mmiNonEmbdCoreOopCd = checkMmiNonEmbdCoreOopCdConstraints(value);
    serializeMmiNonEmbdCoreOopCd(mmiNonEmbdCoreOopCd);
  }

  /**
   * Update MmiNonEmbdCoreOopCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreOopCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiNonEmbdCoreOopCd, mmiNonEmbdCoreOopCd.length);
  }

  public void setMmiNonEmbdCoreOopCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreOopCd, mmiNonEmbdCoreOopCd.length);
  }

  /**
   * Update MmiNonEmbdCoreOopCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreOopCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreOopCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNonEmbdCoreOopCd with another Field
   *
   * @param value
   */
  public void setMmiNonEmbdCoreOopCd(Field source) {
    replace(source, 0, source.length(), beginMmiNonEmbdCoreOopCd, MMI_NON_EMBD_CORE_OOP_CD_LEN);
  }

  /**
   * Update MmiNonEmbdCoreOopCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreOopCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreOopCd, MMI_NON_EMBD_CORE_OOP_CD_LEN);
  }

  /**
   * Update MmiNonEmbdCoreOopCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreOopCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreOopCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNewCoinsDedTypCd
   *
   * @return mmiNewCoinsDedTypCd
   */
  public char[] getMmiNewCoinsDedTypCd() throws CFException {
    if (isMmiNewCoinsDedTypCdModified()) {
      mmiNewCoinsDedTypCd = refreshMmiNewCoinsDedTypCd();
    }
    return mmiNewCoinsDedTypCd;
  }

  /**
   * set variable mmiNewCoinsDedTypCd Corresponding COBOL Variable is MMI-NEW-COINS-DED-TYP-CD
   *
   * @param value
   */
  public void setMmiNewCoinsDedTypCd(char[] value) {
    mmiNewCoinsDedTypCd = checkMmiNewCoinsDedTypCdConstraints(value);
    serializeMmiNewCoinsDedTypCd(mmiNewCoinsDedTypCd);
  }

  /**
   * Update MmiNewCoinsDedTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsDedTypCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiNewCoinsDedTypCd, mmiNewCoinsDedTypCd.length);
  }

  public void setMmiNewCoinsDedTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsDedTypCd, mmiNewCoinsDedTypCd.length);
  }

  /**
   * Update MmiNewCoinsDedTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsDedTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsDedTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNewCoinsDedTypCd with another Field
   *
   * @param value
   */
  public void setMmiNewCoinsDedTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiNewCoinsDedTypCd, MMI_NEW_COINS_DED_TYP_CD_LEN);
  }

  /**
   * Update MmiNewCoinsDedTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsDedTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsDedTypCd, MMI_NEW_COINS_DED_TYP_CD_LEN);
  }

  /**
   * Update MmiNewCoinsDedTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNewCoinsDedTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNewCoinsDedTypCd + targetIndex, targetLen);
  }

  public BigDecimal getMmiNewCoinsIndvMinPct() throws CFException {
    if (isMmiNewCoinsIndvMinPctModified()) {
      mmiNewCoinsIndvMinPct = refreshMmiNewCoinsIndvMinPct();
    }
    return mmiNewCoinsIndvMinPct;
  }

  public char[] getMmiNewCoinsIndvMinPctString() {
    return mmiNewCoinsIndvMinPctString();
  }

  /**
   * Update MmiNewCoinsIndvMinPct with the passed number Corresponding COBOL Variable is
   * MMI-NEW-COINS-INDV-MIN-PCT
   *
   * @param number
   */
  public void setMmiNewCoinsIndvMinPct(BigDecimal number) {
    mmiNewCoinsIndvMinPct = checkMmiNewCoinsIndvMinPctMaxLimit(number);
    serializeMmiNewCoinsIndvMinPct(mmiNewCoinsIndvMinPct);
  }

  public BigDecimal getMmiNewCoinsIndvMaxPct() throws CFException {
    if (isMmiNewCoinsIndvMaxPctModified()) {
      mmiNewCoinsIndvMaxPct = refreshMmiNewCoinsIndvMaxPct();
    }
    return mmiNewCoinsIndvMaxPct;
  }

  public char[] getMmiNewCoinsIndvMaxPctString() {
    return mmiNewCoinsIndvMaxPctString();
  }

  /**
   * Update MmiNewCoinsIndvMaxPct with the passed number Corresponding COBOL Variable is
   * MMI-NEW-COINS-INDV-MAX-PCT
   *
   * @param number
   */
  public void setMmiNewCoinsIndvMaxPct(BigDecimal number) {
    mmiNewCoinsIndvMaxPct = checkMmiNewCoinsIndvMaxPctMaxLimit(number);
    serializeMmiNewCoinsIndvMaxPct(mmiNewCoinsIndvMaxPct);
  }
  /**
   * Returns the value of mmiNonEmbdNewCoinsCd
   *
   * @return mmiNonEmbdNewCoinsCd
   */
  public char[] getMmiNonEmbdNewCoinsCd() throws CFException {
    if (isMmiNonEmbdNewCoinsCdModified()) {
      mmiNonEmbdNewCoinsCd = refreshMmiNonEmbdNewCoinsCd();
    }
    return mmiNonEmbdNewCoinsCd;
  }

  /**
   * set variable mmiNonEmbdNewCoinsCd Corresponding COBOL Variable is MMI-NON-EMBD-NEW-COINS-CD
   *
   * @param value
   */
  public void setMmiNonEmbdNewCoinsCd(char[] value) {
    mmiNonEmbdNewCoinsCd = checkMmiNonEmbdNewCoinsCdConstraints(value);
    serializeMmiNonEmbdNewCoinsCd(mmiNonEmbdNewCoinsCd);
  }

  /**
   * Update MmiNonEmbdNewCoinsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdNewCoinsCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiNonEmbdNewCoinsCd, mmiNonEmbdNewCoinsCd.length);
  }

  public void setMmiNonEmbdNewCoinsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdNewCoinsCd, mmiNonEmbdNewCoinsCd.length);
  }

  /**
   * Update MmiNonEmbdNewCoinsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdNewCoinsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdNewCoinsCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNonEmbdNewCoinsCd with another Field
   *
   * @param value
   */
  public void setMmiNonEmbdNewCoinsCd(Field source) {
    replace(source, 0, source.length(), beginMmiNonEmbdNewCoinsCd, MMI_NON_EMBD_NEW_COINS_CD_LEN);
  }

  /**
   * Update MmiNonEmbdNewCoinsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdNewCoinsCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiNonEmbdNewCoinsCd, MMI_NON_EMBD_NEW_COINS_CD_LEN);
  }

  /**
   * Update MmiNonEmbdNewCoinsCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiNonEmbdNewCoinsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdNewCoinsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiNonEmbdCoreDedCd
   *
   * @return mmiNonEmbdCoreDedCd
   */
  public char[] getMmiNonEmbdCoreDedCd() throws CFException {
    if (isMmiNonEmbdCoreDedCdModified()) {
      mmiNonEmbdCoreDedCd = refreshMmiNonEmbdCoreDedCd();
    }
    return mmiNonEmbdCoreDedCd;
  }

  /**
   * set variable mmiNonEmbdCoreDedCd Corresponding COBOL Variable is MMI-NON-EMBD-CORE-DED-CD
   *
   * @param value
   */
  public void setMmiNonEmbdCoreDedCd(char[] value) {
    mmiNonEmbdCoreDedCd = checkMmiNonEmbdCoreDedCdConstraints(value);
    serializeMmiNonEmbdCoreDedCd(mmiNonEmbdCoreDedCd);
  }

  /**
   * Update MmiNonEmbdCoreDedCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreDedCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiNonEmbdCoreDedCd, mmiNonEmbdCoreDedCd.length);
  }

  public void setMmiNonEmbdCoreDedCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreDedCd, mmiNonEmbdCoreDedCd.length);
  }

  /**
   * Update MmiNonEmbdCoreDedCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreDedCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreDedCd + targetIndex, targetLen);
  }

  /**
   * Update MmiNonEmbdCoreDedCd with another Field
   *
   * @param value
   */
  public void setMmiNonEmbdCoreDedCd(Field source) {
    replace(source, 0, source.length(), beginMmiNonEmbdCoreDedCd, MMI_NON_EMBD_CORE_DED_CD_LEN);
  }

  /**
   * Update MmiNonEmbdCoreDedCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreDedCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreDedCd, MMI_NON_EMBD_CORE_DED_CD_LEN);
  }

  /**
   * Update MmiNonEmbdCoreDedCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiNonEmbdCoreDedCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiNonEmbdCoreDedCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiIndvOopCd
   *
   * @return mmiIndvOopCd
   */
  public char[] getMmiIndvOopCd() throws CFException {
    if (isMmiIndvOopCdModified()) {
      mmiIndvOopCd = refreshMmiIndvOopCd();
    }
    return mmiIndvOopCd;
  }

  /**
   * set variable mmiIndvOopCd Corresponding COBOL Variable is MMI-INDV-OOP-CD
   *
   * @param value
   */
  public void setMmiIndvOopCd(char[] value) {
    mmiIndvOopCd = checkMmiIndvOopCdConstraints(value);
    serializeMmiIndvOopCd(mmiIndvOopCd);
  }

  /**
   * Update MmiIndvOopCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiIndvOopCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiIndvOopCd, mmiIndvOopCd.length);
  }

  public void setMmiIndvOopCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvOopCd, mmiIndvOopCd.length);
  }

  /**
   * Update MmiIndvOopCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvOopCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvOopCd + targetIndex, targetLen);
  }

  /**
   * Update MmiIndvOopCd with another Field
   *
   * @param value
   */
  public void setMmiIndvOopCd(Field source) {
    replace(source, 0, source.length(), beginMmiIndvOopCd, MMI_INDV_OOP_CD_LEN);
  }

  /**
   * Update MmiIndvOopCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiIndvOopCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvOopCd, MMI_INDV_OOP_CD_LEN);
  }

  /**
   * Update MmiIndvOopCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvOopCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvOopCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiIndvPrdCd
   *
   * @return mmiIndvPrdCd
   */
  public char[] getMmiIndvPrdCd() throws CFException {
    if (isMmiIndvPrdCdModified()) {
      mmiIndvPrdCd = refreshMmiIndvPrdCd();
    }
    return mmiIndvPrdCd;
  }

  /**
   * set variable mmiIndvPrdCd Corresponding COBOL Variable is MMI-INDV-PRD-CD
   *
   * @param value
   */
  public void setMmiIndvPrdCd(char[] value) {
    mmiIndvPrdCd = checkMmiIndvPrdCdConstraints(value);
    serializeMmiIndvPrdCd(mmiIndvPrdCd);
  }

  /**
   * Update MmiIndvPrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiIndvPrdCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiIndvPrdCd, mmiIndvPrdCd.length);
  }

  public void setMmiIndvPrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvPrdCd, mmiIndvPrdCd.length);
  }

  /**
   * Update MmiIndvPrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvPrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvPrdCd + targetIndex, targetLen);
  }

  /**
   * Update MmiIndvPrdCd with another Field
   *
   * @param value
   */
  public void setMmiIndvPrdCd(Field source) {
    replace(source, 0, source.length(), beginMmiIndvPrdCd, MMI_INDV_PRD_CD_LEN);
  }

  /**
   * Update MmiIndvPrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiIndvPrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvPrdCd, MMI_INDV_PRD_CD_LEN);
  }

  /**
   * Update MmiIndvPrdCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvPrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvPrdCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiIndvSalryTypCd
   *
   * @return mmiIndvSalryTypCd
   */
  public char[] getMmiIndvSalryTypCd() throws CFException {
    if (isMmiIndvSalryTypCdModified()) {
      mmiIndvSalryTypCd = refreshMmiIndvSalryTypCd();
    }
    return mmiIndvSalryTypCd;
  }

  /**
   * set variable mmiIndvSalryTypCd Corresponding COBOL Variable is MMI-INDV-SALRY-TYP-CD
   *
   * @param value
   */
  public void setMmiIndvSalryTypCd(char[] value) {
    mmiIndvSalryTypCd = checkMmiIndvSalryTypCdConstraints(value);
    serializeMmiIndvSalryTypCd(mmiIndvSalryTypCd);
  }

  /**
   * Update MmiIndvSalryTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiIndvSalryTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiIndvSalryTypCd, mmiIndvSalryTypCd.length);
  }

  public void setMmiIndvSalryTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvSalryTypCd, mmiIndvSalryTypCd.length);
  }

  /**
   * Update MmiIndvSalryTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvSalryTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvSalryTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiIndvSalryTypCd with another Field
   *
   * @param value
   */
  public void setMmiIndvSalryTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiIndvSalryTypCd, MMI_INDV_SALRY_TYP_CD_LEN);
  }

  /**
   * Update MmiIndvSalryTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiIndvSalryTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvSalryTypCd, MMI_INDV_SALRY_TYP_CD_LEN);
  }

  /**
   * Update MmiIndvSalryTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvSalryTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvSalryTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiFamSalryTypCd
   *
   * @return mmiFamSalryTypCd
   */
  public char[] getMmiFamSalryTypCd() throws CFException {
    if (isMmiFamSalryTypCdModified()) {
      mmiFamSalryTypCd = refreshMmiFamSalryTypCd();
    }
    return mmiFamSalryTypCd;
  }

  /**
   * set variable mmiFamSalryTypCd Corresponding COBOL Variable is MMI-FAM-SALRY-TYP-CD
   *
   * @param value
   */
  public void setMmiFamSalryTypCd(char[] value) {
    mmiFamSalryTypCd = checkMmiFamSalryTypCdConstraints(value);
    serializeMmiFamSalryTypCd(mmiFamSalryTypCd);
  }

  /**
   * Update MmiFamSalryTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiFamSalryTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiFamSalryTypCd, mmiFamSalryTypCd.length);
  }

  public void setMmiFamSalryTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamSalryTypCd, mmiFamSalryTypCd.length);
  }

  /**
   * Update MmiFamSalryTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFamSalryTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamSalryTypCd + targetIndex, targetLen);
  }

  /**
   * Update MmiFamSalryTypCd with another Field
   *
   * @param value
   */
  public void setMmiFamSalryTypCd(Field source) {
    replace(source, 0, source.length(), beginMmiFamSalryTypCd, MMI_FAM_SALRY_TYP_CD_LEN);
  }

  /**
   * Update MmiFamSalryTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiFamSalryTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamSalryTypCd, MMI_FAM_SALRY_TYP_CD_LEN);
  }

  /**
   * Update MmiFamSalryTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFamSalryTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamSalryTypCd + targetIndex, targetLen);
  }

  public BigDecimal getMmiFamMultPct() throws CFException {
    if (isMmiFamMultPctModified()) {
      mmiFamMultPct = refreshMmiFamMultPct();
    }
    return mmiFamMultPct;
  }

  public char[] getMmiFamMultPctString() {
    return mmiFamMultPctString();
  }

  /**
   * Update MmiFamMultPct with the passed number Corresponding COBOL Variable is MMI-FAM-MULT-PCT
   *
   * @param number
   */
  public void setMmiFamMultPct(BigDecimal number) {
    mmiFamMultPct = checkMmiFamMultPctMaxLimit(number);
    serializeMmiFamMultPct(mmiFamMultPct);
  }
  /**
   * Returns the value of mmiFamVal
   *
   * @return mmiFamVal
   */
  public char[] getMmiFamVal() throws CFException {
    if (isMmiFamValModified()) {
      mmiFamVal = refreshMmiFamVal();
    }
    return mmiFamVal;
  }

  /**
   * set variable mmiFamVal Corresponding COBOL Variable is MMI-FAM-VAL
   *
   * @param value
   */
  public void setMmiFamVal(char[] value) {
    mmiFamVal = checkMmiFamValConstraints(value);
    serializeMmiFamVal(mmiFamVal);
  }

  /**
   * Update MmiFamVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiFamVal(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiFamVal, mmiFamVal.length);
  }

  public void setMmiFamVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamVal, mmiFamVal.length);
  }

  /**
   * Update MmiFamVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFamVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamVal + targetIndex, targetLen);
  }

  /**
   * Update MmiFamVal with another Field
   *
   * @param value
   */
  public void setMmiFamVal(Field source) {
    replace(source, 0, source.length(), beginMmiFamVal, MMI_FAM_VAL_LEN);
  }

  /**
   * Update MmiFamVal with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiFamVal(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamVal, MMI_FAM_VAL_LEN);
  }

  /**
   * Update MmiFamVal with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiFamVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiFamVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiXapplyOopCd
   *
   * @return mmiXapplyOopCd
   */
  public char[] getMmiXapplyOopCd() throws CFException {
    if (isMmiXapplyOopCdModified()) {
      mmiXapplyOopCd = refreshMmiXapplyOopCd();
    }
    return mmiXapplyOopCd;
  }

  /**
   * set variable mmiXapplyOopCd Corresponding COBOL Variable is MMI-XAPPLY-OOP-CD
   *
   * @param value
   */
  public void setMmiXapplyOopCd(char[] value) {
    mmiXapplyOopCd = checkMmiXapplyOopCdConstraints(value);
    serializeMmiXapplyOopCd(mmiXapplyOopCd);
  }

  /**
   * Update MmiXapplyOopCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiXapplyOopCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiXapplyOopCd, mmiXapplyOopCd.length);
  }

  public void setMmiXapplyOopCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyOopCd, mmiXapplyOopCd.length);
  }

  /**
   * Update MmiXapplyOopCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiXapplyOopCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyOopCd + targetIndex, targetLen);
  }

  /**
   * Update MmiXapplyOopCd with another Field
   *
   * @param value
   */
  public void setMmiXapplyOopCd(Field source) {
    replace(source, 0, source.length(), beginMmiXapplyOopCd, MMI_XAPPLY_OOP_CD_LEN);
  }

  /**
   * Update MmiXapplyOopCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiXapplyOopCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyOopCd, MMI_XAPPLY_OOP_CD_LEN);
  }

  /**
   * Update MmiXapplyOopCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiXapplyOopCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyOopCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiIndvCopayCaroCd
   *
   * @return mmiIndvCopayCaroCd
   */
  public char[] getMmiIndvCopayCaroCd() throws CFException {
    if (isMmiIndvCopayCaroCdModified()) {
      mmiIndvCopayCaroCd = refreshMmiIndvCopayCaroCd();
    }
    return mmiIndvCopayCaroCd;
  }

  /**
   * set variable mmiIndvCopayCaroCd Corresponding COBOL Variable is MMI-INDV-COPAY-CARO-CD
   *
   * @param value
   */
  public void setMmiIndvCopayCaroCd(char[] value) {
    mmiIndvCopayCaroCd = checkMmiIndvCopayCaroCdConstraints(value);
    serializeMmiIndvCopayCaroCd(mmiIndvCopayCaroCd);
  }

  /**
   * Update MmiIndvCopayCaroCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiIndvCopayCaroCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiIndvCopayCaroCd, mmiIndvCopayCaroCd.length);
  }

  public void setMmiIndvCopayCaroCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvCopayCaroCd, mmiIndvCopayCaroCd.length);
  }

  /**
   * Update MmiIndvCopayCaroCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvCopayCaroCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvCopayCaroCd + targetIndex, targetLen);
  }

  /**
   * Update MmiIndvCopayCaroCd with another Field
   *
   * @param value
   */
  public void setMmiIndvCopayCaroCd(Field source) {
    replace(source, 0, source.length(), beginMmiIndvCopayCaroCd, MMI_INDV_COPAY_CARO_CD_LEN);
  }

  /**
   * Update MmiIndvCopayCaroCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiIndvCopayCaroCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvCopayCaroCd, MMI_INDV_COPAY_CARO_CD_LEN);
  }

  /**
   * Update MmiIndvCopayCaroCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiIndvCopayCaroCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiIndvCopayCaroCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiXapplyCopayCd
   *
   * @return mmiXapplyCopayCd
   */
  public char[] getMmiXapplyCopayCd() throws CFException {
    if (isMmiXapplyCopayCdModified()) {
      mmiXapplyCopayCd = refreshMmiXapplyCopayCd();
    }
    return mmiXapplyCopayCd;
  }

  /**
   * set variable mmiXapplyCopayCd Corresponding COBOL Variable is MMI-XAPPLY-COPAY-CD
   *
   * @param value
   */
  public void setMmiXapplyCopayCd(char[] value) {
    mmiXapplyCopayCd = checkMmiXapplyCopayCdConstraints(value);
    serializeMmiXapplyCopayCd(mmiXapplyCopayCd);
  }

  /**
   * Update MmiXapplyCopayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiXapplyCopayCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiXapplyCopayCd, mmiXapplyCopayCd.length);
  }

  public void setMmiXapplyCopayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyCopayCd, mmiXapplyCopayCd.length);
  }

  /**
   * Update MmiXapplyCopayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiXapplyCopayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyCopayCd + targetIndex, targetLen);
  }

  /**
   * Update MmiXapplyCopayCd with another Field
   *
   * @param value
   */
  public void setMmiXapplyCopayCd(Field source) {
    replace(source, 0, source.length(), beginMmiXapplyCopayCd, MMI_XAPPLY_COPAY_CD_LEN);
  }

  /**
   * Update MmiXapplyCopayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiXapplyCopayCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyCopayCd, MMI_XAPPLY_COPAY_CD_LEN);
  }

  /**
   * Update MmiXapplyCopayCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiXapplyCopayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiXapplyCopayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCoreOopNcapInd
   *
   * @return mmiCoreOopNcapInd
   */
  public char[] getMmiCoreOopNcapInd() throws CFException {
    if (isMmiCoreOopNcapIndModified()) {
      mmiCoreOopNcapInd = refreshMmiCoreOopNcapInd();
    }
    return mmiCoreOopNcapInd;
  }

  /**
   * set variable mmiCoreOopNcapInd Corresponding COBOL Variable is MMI-CORE-OOP-NCAP-IND
   *
   * @param value
   */
  public void setMmiCoreOopNcapInd(char[] value) {
    mmiCoreOopNcapInd = checkMmiCoreOopNcapIndConstraints(value);
    serializeMmiCoreOopNcapInd(mmiCoreOopNcapInd);
  }

  /**
   * Update MmiCoreOopNcapInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCoreOopNcapInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiCoreOopNcapInd, mmiCoreOopNcapInd.length);
  }

  public void setMmiCoreOopNcapInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreOopNcapInd, mmiCoreOopNcapInd.length);
  }

  /**
   * Update MmiCoreOopNcapInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCoreOopNcapInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreOopNcapInd + targetIndex, targetLen);
  }

  /**
   * Update MmiCoreOopNcapInd with another Field
   *
   * @param value
   */
  public void setMmiCoreOopNcapInd(Field source) {
    replace(source, 0, source.length(), beginMmiCoreOopNcapInd, MMI_CORE_OOP_NCAP_IND_LEN);
  }

  /**
   * Update MmiCoreOopNcapInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCoreOopNcapInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreOopNcapInd, MMI_CORE_OOP_NCAP_IND_LEN);
  }

  /**
   * Update MmiCoreOopNcapInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCoreOopNcapInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreOopNcapInd + targetIndex, targetLen);
  }

  public BigDecimal getMmiMnnrpLabPct() throws CFException {
    if (isMmiMnnrpLabPctModified()) {
      mmiMnnrpLabPct = refreshMmiMnnrpLabPct();
    }
    return mmiMnnrpLabPct;
  }

  public char[] getMmiMnnrpLabPctString() {
    return mmiMnnrpLabPctString();
  }

  /**
   * Update MmiMnnrpLabPct with the passed number Corresponding COBOL Variable is MMI-MNNRP-LAB-PCT
   *
   * @param number
   */
  public void setMmiMnnrpLabPct(BigDecimal number) {
    mmiMnnrpLabPct = checkMmiMnnrpLabPctMaxLimit(number);
    serializeMmiMnnrpLabPct(mmiMnnrpLabPct);
  }

  public BigDecimal getMmiMnnrpDmePct() throws CFException {
    if (isMmiMnnrpDmePctModified()) {
      mmiMnnrpDmePct = refreshMmiMnnrpDmePct();
    }
    return mmiMnnrpDmePct;
  }

  public char[] getMmiMnnrpDmePctString() {
    return mmiMnnrpDmePctString();
  }

  /**
   * Update MmiMnnrpDmePct with the passed number Corresponding COBOL Variable is MMI-MNNRP-DME-PCT
   *
   * @param number
   */
  public void setMmiMnnrpDmePct(BigDecimal number) {
    mmiMnnrpDmePct = checkMmiMnnrpDmePctMaxLimit(number);
    serializeMmiMnnrpDmePct(mmiMnnrpDmePct);
  }
  /**
   * Returns the value of mmiOonLftmMaxAmt
   *
   * @return mmiOonLftmMaxAmt
   */
  public int getMmiOonLftmMaxAmt() throws CFException {
    if (isMmiOonLftmMaxAmtModified()) {
      mmiOonLftmMaxAmt = refreshMmiOonLftmMaxAmt();
    }
    return mmiOonLftmMaxAmt;
  }

  /**
   * Update MmiOonLftmMaxAmt with the passed value Corresponding COBOL Variable is
   * MMI-OON-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setMmiOonLftmMaxAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    mmiOonLftmMaxAmt = checkMmiOonLftmMaxAmtMaxLimit(number);
    serializeMmiOonLftmMaxAmt(mmiOonLftmMaxAmt);
  }

  public void setMmiOonLftmMaxAmt(long number) {
    number = checkMmiOonLftmMaxAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMmiOonLftmMaxAmt((int) number);
  }

  /**
   * Returns the value of mmiBusSegPltfm
   *
   * @return mmiBusSegPltfm
   */
  public char[] getMmiBusSegPltfm() throws CFException {
    if (isMmiBusSegPltfmModified()) {
      mmiBusSegPltfm = refreshMmiBusSegPltfm();
    }
    return mmiBusSegPltfm;
  }

  /**
   * set variable mmiBusSegPltfm Corresponding COBOL Variable is MMI-BUS-SEG-PLTFM
   *
   * @param value
   */
  public void setMmiBusSegPltfm(char[] value) {
    mmiBusSegPltfm = checkMmiBusSegPltfmConstraints(value);
    serializeMmiBusSegPltfm(mmiBusSegPltfm);
  }

  /**
   * Update MmiBusSegPltfm with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBusSegPltfm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBusSegPltfm, mmiBusSegPltfm.length);
  }

  public void setMmiBusSegPltfm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBusSegPltfm, mmiBusSegPltfm.length);
  }

  /**
   * Update MmiBusSegPltfm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBusSegPltfm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBusSegPltfm + targetIndex, targetLen);
  }

  /**
   * Update MmiBusSegPltfm with another Field
   *
   * @param value
   */
  public void setMmiBusSegPltfm(Field source) {
    replace(source, 0, source.length(), beginMmiBusSegPltfm, MMI_BUS_SEG_PLTFM_LEN);
  }

  /**
   * Update MmiBusSegPltfm with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBusSegPltfm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBusSegPltfm, MMI_BUS_SEG_PLTFM_LEN);
  }

  /**
   * Update MmiBusSegPltfm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBusSegPltfm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBusSegPltfm + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiSviTblTerNbr
   *
   * @return mmiSviTblTerNbr
   */
  public char[] getMmiSviTblTerNbr() throws CFException {
    if (isMmiSviTblTerNbrModified()) {
      mmiSviTblTerNbr = refreshMmiSviTblTerNbr();
    }
    return mmiSviTblTerNbr;
  }

  /**
   * set variable mmiSviTblTerNbr Corresponding COBOL Variable is MMI-SVI-TBL-TER-NBR
   *
   * @param value
   */
  public void setMmiSviTblTerNbr(char[] value) {
    mmiSviTblTerNbr = checkMmiSviTblTerNbrConstraints(value);
    serializeMmiSviTblTerNbr(mmiSviTblTerNbr);
  }

  /**
   * Update MmiSviTblTerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSviTblTerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSviTblTerNbr, mmiSviTblTerNbr.length);
  }

  public void setMmiSviTblTerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblTerNbr, mmiSviTblTerNbr.length);
  }

  /**
   * Update MmiSviTblTerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSviTblTerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblTerNbr + targetIndex, targetLen);
  }

  /**
   * Update MmiSviTblTerNbr with another Field
   *
   * @param value
   */
  public void setMmiSviTblTerNbr(Field source) {
    replace(source, 0, source.length(), beginMmiSviTblTerNbr, MMI_SVI_TBL_TER_NBR_LEN);
  }

  /**
   * Update MmiSviTblTerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSviTblTerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblTerNbr, MMI_SVI_TBL_TER_NBR_LEN);
  }

  /**
   * Update MmiSviTblTerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSviTblTerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSviTblTerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiRelSrvcInd
   *
   * @return mmiRelSrvcInd
   */
  public char[] getMmiRelSrvcInd() throws CFException {
    if (isMmiRelSrvcIndModified()) {
      mmiRelSrvcInd = refreshMmiRelSrvcInd();
    }
    return mmiRelSrvcInd;
  }

  /**
   * set variable mmiRelSrvcInd Corresponding COBOL Variable is MMI-REL-SRVC-IND
   *
   * @param value
   */
  public void setMmiRelSrvcInd(char[] value) {
    mmiRelSrvcInd = checkMmiRelSrvcIndConstraints(value);
    serializeMmiRelSrvcInd(mmiRelSrvcInd);
  }

  /**
   * Update MmiRelSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiRelSrvcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiRelSrvcInd, mmiRelSrvcInd.length);
  }

  public void setMmiRelSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRelSrvcInd, mmiRelSrvcInd.length);
  }

  /**
   * Update MmiRelSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRelSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRelSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update MmiRelSrvcInd with another Field
   *
   * @param value
   */
  public void setMmiRelSrvcInd(Field source) {
    replace(source, 0, source.length(), beginMmiRelSrvcInd, MMI_REL_SRVC_IND_LEN);
  }

  /**
   * Update MmiRelSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiRelSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRelSrvcInd, MMI_REL_SRVC_IND_LEN);
  }

  /**
   * Update MmiRelSrvcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiRelSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiRelSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiCoreMedPrrAuthCd
   *
   * @return mmiCoreMedPrrAuthCd
   */
  public char[] getMmiCoreMedPrrAuthCd() throws CFException {
    if (isMmiCoreMedPrrAuthCdModified()) {
      mmiCoreMedPrrAuthCd = refreshMmiCoreMedPrrAuthCd();
    }
    return mmiCoreMedPrrAuthCd;
  }

  /**
   * set variable mmiCoreMedPrrAuthCd Corresponding COBOL Variable is MMI-CORE-MED-PRR-AUTH-CD
   *
   * @param value
   */
  public void setMmiCoreMedPrrAuthCd(char[] value) {
    mmiCoreMedPrrAuthCd = checkMmiCoreMedPrrAuthCdConstraints(value);
    serializeMmiCoreMedPrrAuthCd(mmiCoreMedPrrAuthCd);
  }

  /**
   * Update MmiCoreMedPrrAuthCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiCoreMedPrrAuthCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiCoreMedPrrAuthCd, mmiCoreMedPrrAuthCd.length);
  }

  public void setMmiCoreMedPrrAuthCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreMedPrrAuthCd, mmiCoreMedPrrAuthCd.length);
  }

  /**
   * Update MmiCoreMedPrrAuthCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCoreMedPrrAuthCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreMedPrrAuthCd + targetIndex, targetLen);
  }

  /**
   * Update MmiCoreMedPrrAuthCd with another Field
   *
   * @param value
   */
  public void setMmiCoreMedPrrAuthCd(Field source) {
    replace(source, 0, source.length(), beginMmiCoreMedPrrAuthCd, MMI_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update MmiCoreMedPrrAuthCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiCoreMedPrrAuthCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreMedPrrAuthCd, MMI_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update MmiCoreMedPrrAuthCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiCoreMedPrrAuthCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiCoreMedPrrAuthCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiPcpBenLvlRule
   *
   * @return mmiPcpBenLvlRule
   */
  public char[] getMmiPcpBenLvlRule() throws CFException {
    if (isMmiPcpBenLvlRuleModified()) {
      mmiPcpBenLvlRule = refreshMmiPcpBenLvlRule();
    }
    return mmiPcpBenLvlRule;
  }

  /**
   * set variable mmiPcpBenLvlRule Corresponding COBOL Variable is MMI-PCP-BEN-LVL-RULE
   *
   * @param value
   */
  public void setMmiPcpBenLvlRule(char[] value) {
    mmiPcpBenLvlRule = checkMmiPcpBenLvlRuleConstraints(value);
    serializeMmiPcpBenLvlRule(mmiPcpBenLvlRule);
  }

  /**
   * Update MmiPcpBenLvlRule with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiPcpBenLvlRule(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiPcpBenLvlRule, mmiPcpBenLvlRule.length);
  }

  public void setMmiPcpBenLvlRule(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpBenLvlRule, mmiPcpBenLvlRule.length);
  }

  /**
   * Update MmiPcpBenLvlRule with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPcpBenLvlRule(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpBenLvlRule + targetIndex, targetLen);
  }

  /**
   * Update MmiPcpBenLvlRule with another Field
   *
   * @param value
   */
  public void setMmiPcpBenLvlRule(Field source) {
    replace(source, 0, source.length(), beginMmiPcpBenLvlRule, MMI_PCP_BEN_LVL_RULE_LEN);
  }

  /**
   * Update MmiPcpBenLvlRule with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiPcpBenLvlRule(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpBenLvlRule, MMI_PCP_BEN_LVL_RULE_LEN);
  }

  /**
   * Update MmiPcpBenLvlRule with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiPcpBenLvlRule(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiPcpBenLvlRule + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiMcrCd
   *
   * @return mmiMcrCd
   */
  public char[] getMmiMcrCd() throws CFException {
    if (isMmiMcrCdModified()) {
      mmiMcrCd = refreshMmiMcrCd();
    }
    return mmiMcrCd;
  }

  /**
   * set variable mmiMcrCd Corresponding COBOL Variable is MMI-MCR-CD
   *
   * @param value
   */
  public void setMmiMcrCd(char[] value) {
    mmiMcrCd = checkMmiMcrCdConstraints(value);
    serializeMmiMcrCd(mmiMcrCd);
  }

  /**
   * Update MmiMcrCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiMcrCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiMcrCd, mmiMcrCd.length);
  }

  public void setMmiMcrCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMcrCd, mmiMcrCd.length);
  }

  /**
   * Update MmiMcrCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMcrCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMcrCd + targetIndex, targetLen);
  }

  /**
   * Update MmiMcrCd with another Field
   *
   * @param value
   */
  public void setMmiMcrCd(Field source) {
    replace(source, 0, source.length(), beginMmiMcrCd, MMI_MCR_CD_LEN);
  }

  /**
   * Update MmiMcrCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiMcrCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMcrCd, MMI_MCR_CD_LEN);
  }

  /**
   * Update MmiMcrCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiMcrCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiMcrCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiLmtSrvcCd
   *
   * @return mmiLmtSrvcCd
   */
  public char[] getMmiLmtSrvcCd() throws CFException {
    if (isMmiLmtSrvcCdModified()) {
      mmiLmtSrvcCd = refreshMmiLmtSrvcCd();
    }
    return mmiLmtSrvcCd;
  }

  /**
   * set variable mmiLmtSrvcCd Corresponding COBOL Variable is MMI-LMT-SRVC-CD
   *
   * @param value
   */
  public void setMmiLmtSrvcCd(char[] value) {
    mmiLmtSrvcCd = checkMmiLmtSrvcCdConstraints(value);
    serializeMmiLmtSrvcCd(mmiLmtSrvcCd);
  }

  /**
   * Update MmiLmtSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiLmtSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiLmtSrvcCd, mmiLmtSrvcCd.length);
  }

  public void setMmiLmtSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLmtSrvcCd, mmiLmtSrvcCd.length);
  }

  /**
   * Update MmiLmtSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiLmtSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLmtSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update MmiLmtSrvcCd with another Field
   *
   * @param value
   */
  public void setMmiLmtSrvcCd(Field source) {
    replace(source, 0, source.length(), beginMmiLmtSrvcCd, MMI_LMT_SRVC_CD_LEN);
  }

  /**
   * Update MmiLmtSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiLmtSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLmtSrvcCd, MMI_LMT_SRVC_CD_LEN);
  }

  /**
   * Update MmiLmtSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiLmtSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiLmtSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiEligXrefCd
   *
   * @return mmiEligXrefCd
   */
  public char[] getMmiEligXrefCd() throws CFException {
    if (isMmiEligXrefCdModified()) {
      mmiEligXrefCd = refreshMmiEligXrefCd();
    }
    return mmiEligXrefCd;
  }

  /**
   * set variable mmiEligXrefCd Corresponding COBOL Variable is MMI-ELIG-XREF-CD
   *
   * @param value
   */
  public void setMmiEligXrefCd(char[] value) {
    mmiEligXrefCd = checkMmiEligXrefCdConstraints(value);
    serializeMmiEligXrefCd(mmiEligXrefCd);
  }

  /**
   * Update MmiEligXrefCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiEligXrefCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiEligXrefCd, mmiEligXrefCd.length);
  }

  public void setMmiEligXrefCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEligXrefCd, mmiEligXrefCd.length);
  }

  /**
   * Update MmiEligXrefCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEligXrefCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEligXrefCd + targetIndex, targetLen);
  }

  /**
   * Update MmiEligXrefCd with another Field
   *
   * @param value
   */
  public void setMmiEligXrefCd(Field source) {
    replace(source, 0, source.length(), beginMmiEligXrefCd, MMI_ELIG_XREF_CD_LEN);
  }

  /**
   * Update MmiEligXrefCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiEligXrefCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEligXrefCd, MMI_ELIG_XREF_CD_LEN);
  }

  /**
   * Update MmiEligXrefCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiEligXrefCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiEligXrefCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxAuralCiPriCd
   *
   * @return mmiBenMaxAuralCiPriCd
   */
  public char[] getMmiBenMaxAuralCiPriCd() throws CFException {
    if (isMmiBenMaxAuralCiPriCdModified()) {
      mmiBenMaxAuralCiPriCd = refreshMmiBenMaxAuralCiPriCd();
    }
    return mmiBenMaxAuralCiPriCd;
  }

  /**
   * set variable mmiBenMaxAuralCiPriCd Corresponding COBOL Variable is MMI-BEN-MAX-AURAL-CI-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiPriCd(char[] value) {
    mmiBenMaxAuralCiPriCd = checkMmiBenMaxAuralCiPriCdConstraints(value);
    serializeMmiBenMaxAuralCiPriCd(mmiBenMaxAuralCiPriCd);
  }

  /**
   * Update MmiBenMaxAuralCiPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxAuralCiPriCd,
        mmiBenMaxAuralCiPriCd.length);
  }

  public void setMmiBenMaxAuralCiPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxAuralCiPriCd, mmiBenMaxAuralCiPriCd.length);
  }

  /**
   * Update MmiBenMaxAuralCiPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxAuralCiPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxAuralCiPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxAuralCiPriCd, MMI_BEN_MAX_AURAL_CI_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxAuralCiPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxAuralCiPriCd,
        MMI_BEN_MAX_AURAL_CI_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxAuralCiPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxAuralCiPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxAuralCiPriCnt
   *
   * @return mmiBenMaxAuralCiPriCnt
   */
  public short getMmiBenMaxAuralCiPriCnt() throws CFException {
    if (isMmiBenMaxAuralCiPriCntModified()) {
      mmiBenMaxAuralCiPriCnt = refreshMmiBenMaxAuralCiPriCnt();
    }
    return mmiBenMaxAuralCiPriCnt;
  }

  /**
   * Update MmiBenMaxAuralCiPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-AURAL-CI-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxAuralCiPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxAuralCiPriCnt = checkMmiBenMaxAuralCiPriCntMaxLimit(number);
    serializeMmiBenMaxAuralCiPriCnt(mmiBenMaxAuralCiPriCnt);
  }

  public void setMmiBenMaxAuralCiPriCnt(int number) {
    number =
        checkMmiBenMaxAuralCiPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxAuralCiPriCnt((short) number);
  }

  public void setMmiBenMaxAuralCiPriCnt(long number) {
    number =
        checkMmiBenMaxAuralCiPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxAuralCiPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxAuralCiSecCd
   *
   * @return mmiBenMaxAuralCiSecCd
   */
  public char[] getMmiBenMaxAuralCiSecCd() throws CFException {
    if (isMmiBenMaxAuralCiSecCdModified()) {
      mmiBenMaxAuralCiSecCd = refreshMmiBenMaxAuralCiSecCd();
    }
    return mmiBenMaxAuralCiSecCd;
  }

  /**
   * set variable mmiBenMaxAuralCiSecCd Corresponding COBOL Variable is MMI-BEN-MAX-AURAL-CI-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiSecCd(char[] value) {
    mmiBenMaxAuralCiSecCd = checkMmiBenMaxAuralCiSecCdConstraints(value);
    serializeMmiBenMaxAuralCiSecCd(mmiBenMaxAuralCiSecCd);
  }

  /**
   * Update MmiBenMaxAuralCiSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiSecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxAuralCiSecCd,
        mmiBenMaxAuralCiSecCd.length);
  }

  public void setMmiBenMaxAuralCiSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxAuralCiSecCd, mmiBenMaxAuralCiSecCd.length);
  }

  /**
   * Update MmiBenMaxAuralCiSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxAuralCiSecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxAuralCiSecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiSecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxAuralCiSecCd, MMI_BEN_MAX_AURAL_CI_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxAuralCiSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxAuralCiSecCd,
        MMI_BEN_MAX_AURAL_CI_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxAuralCiSecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxAuralCiSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxAuralCiSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxAuralCiSecCnt
   *
   * @return mmiBenMaxAuralCiSecCnt
   */
  public short getMmiBenMaxAuralCiSecCnt() throws CFException {
    if (isMmiBenMaxAuralCiSecCntModified()) {
      mmiBenMaxAuralCiSecCnt = refreshMmiBenMaxAuralCiSecCnt();
    }
    return mmiBenMaxAuralCiSecCnt;
  }

  /**
   * Update MmiBenMaxAuralCiSecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-AURAL-CI-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxAuralCiSecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxAuralCiSecCnt = checkMmiBenMaxAuralCiSecCntMaxLimit(number);
    serializeMmiBenMaxAuralCiSecCnt(mmiBenMaxAuralCiSecCnt);
  }

  public void setMmiBenMaxAuralCiSecCnt(int number) {
    number =
        checkMmiBenMaxAuralCiSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxAuralCiSecCnt((short) number);
  }

  public void setMmiBenMaxAuralCiSecCnt(long number) {
    number =
        checkMmiBenMaxAuralCiSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxAuralCiSecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxCogTrpyPriCd
   *
   * @return mmiBenMaxCogTrpyPriCd
   */
  public char[] getMmiBenMaxCogTrpyPriCd() throws CFException {
    if (isMmiBenMaxCogTrpyPriCdModified()) {
      mmiBenMaxCogTrpyPriCd = refreshMmiBenMaxCogTrpyPriCd();
    }
    return mmiBenMaxCogTrpyPriCd;
  }

  /**
   * set variable mmiBenMaxCogTrpyPriCd Corresponding COBOL Variable is MMI-BEN-MAX-COG-TRPY-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyPriCd(char[] value) {
    mmiBenMaxCogTrpyPriCd = checkMmiBenMaxCogTrpyPriCdConstraints(value);
    serializeMmiBenMaxCogTrpyPriCd(mmiBenMaxCogTrpyPriCd);
  }

  /**
   * Update MmiBenMaxCogTrpyPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxCogTrpyPriCd,
        mmiBenMaxCogTrpyPriCd.length);
  }

  public void setMmiBenMaxCogTrpyPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpyPriCd, mmiBenMaxCogTrpyPriCd.length);
  }

  /**
   * Update MmiBenMaxCogTrpyPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpyPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxCogTrpyPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyPriCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxCogTrpyPriCd, MMI_BEN_MAX_COG_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxCogTrpyPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxCogTrpyPriCd,
        MMI_BEN_MAX_COG_TRPY_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxCogTrpyPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpyPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxCogTrpyPriCnt
   *
   * @return mmiBenMaxCogTrpyPriCnt
   */
  public short getMmiBenMaxCogTrpyPriCnt() throws CFException {
    if (isMmiBenMaxCogTrpyPriCntModified()) {
      mmiBenMaxCogTrpyPriCnt = refreshMmiBenMaxCogTrpyPriCnt();
    }
    return mmiBenMaxCogTrpyPriCnt;
  }

  /**
   * Update MmiBenMaxCogTrpyPriCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-COG-TRPY-PRI-CNT
   *
   * @param number
   */
  public void setMmiBenMaxCogTrpyPriCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxCogTrpyPriCnt = checkMmiBenMaxCogTrpyPriCntMaxLimit(number);
    serializeMmiBenMaxCogTrpyPriCnt(mmiBenMaxCogTrpyPriCnt);
  }

  public void setMmiBenMaxCogTrpyPriCnt(int number) {
    number =
        checkMmiBenMaxCogTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCogTrpyPriCnt((short) number);
  }

  public void setMmiBenMaxCogTrpyPriCnt(long number) {
    number =
        checkMmiBenMaxCogTrpyPriCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCogTrpyPriCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxCogTrpySecCd
   *
   * @return mmiBenMaxCogTrpySecCd
   */
  public char[] getMmiBenMaxCogTrpySecCd() throws CFException {
    if (isMmiBenMaxCogTrpySecCdModified()) {
      mmiBenMaxCogTrpySecCd = refreshMmiBenMaxCogTrpySecCd();
    }
    return mmiBenMaxCogTrpySecCd;
  }

  /**
   * set variable mmiBenMaxCogTrpySecCd Corresponding COBOL Variable is MMI-BEN-MAX-COG-TRPY-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpySecCd(char[] value) {
    mmiBenMaxCogTrpySecCd = checkMmiBenMaxCogTrpySecCdConstraints(value);
    serializeMmiBenMaxCogTrpySecCd(mmiBenMaxCogTrpySecCd);
  }

  /**
   * Update MmiBenMaxCogTrpySecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpySecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxCogTrpySecCd,
        mmiBenMaxCogTrpySecCd.length);
  }

  public void setMmiBenMaxCogTrpySecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpySecCd, mmiBenMaxCogTrpySecCd.length);
  }

  /**
   * Update MmiBenMaxCogTrpySecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpySecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpySecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxCogTrpySecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpySecCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxCogTrpySecCd, MMI_BEN_MAX_COG_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxCogTrpySecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpySecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxCogTrpySecCd,
        MMI_BEN_MAX_COG_TRPY_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxCogTrpySecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpySecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpySecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxCogTrpySecCnt
   *
   * @return mmiBenMaxCogTrpySecCnt
   */
  public short getMmiBenMaxCogTrpySecCnt() throws CFException {
    if (isMmiBenMaxCogTrpySecCntModified()) {
      mmiBenMaxCogTrpySecCnt = refreshMmiBenMaxCogTrpySecCnt();
    }
    return mmiBenMaxCogTrpySecCnt;
  }

  /**
   * Update MmiBenMaxCogTrpySecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-COG-TRPY-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxCogTrpySecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxCogTrpySecCnt = checkMmiBenMaxCogTrpySecCntMaxLimit(number);
    serializeMmiBenMaxCogTrpySecCnt(mmiBenMaxCogTrpySecCnt);
  }

  public void setMmiBenMaxCogTrpySecCnt(int number) {
    number =
        checkMmiBenMaxCogTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCogTrpySecCnt((short) number);
  }

  public void setMmiBenMaxCogTrpySecCnt(long number) {
    number =
        checkMmiBenMaxCogTrpySecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxCogTrpySecCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxCogTrpyExclCd
   *
   * @return mmiBenMaxCogTrpyExclCd
   */
  public char[] getMmiBenMaxCogTrpyExclCd() throws CFException {
    if (isMmiBenMaxCogTrpyExclCdModified()) {
      mmiBenMaxCogTrpyExclCd = refreshMmiBenMaxCogTrpyExclCd();
    }
    return mmiBenMaxCogTrpyExclCd;
  }

  /**
   * set variable mmiBenMaxCogTrpyExclCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-COG-TRPY-EXCL-CD
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyExclCd(char[] value) {
    mmiBenMaxCogTrpyExclCd = checkMmiBenMaxCogTrpyExclCdConstraints(value);
    serializeMmiBenMaxCogTrpyExclCd(mmiBenMaxCogTrpyExclCd);
  }

  /**
   * Update MmiBenMaxCogTrpyExclCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyExclCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxCogTrpyExclCd,
        mmiBenMaxCogTrpyExclCd.length);
  }

  public void setMmiBenMaxCogTrpyExclCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpyExclCd, mmiBenMaxCogTrpyExclCd.length);
  }

  /**
   * Update MmiBenMaxCogTrpyExclCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyExclCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpyExclCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxCogTrpyExclCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyExclCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxCogTrpyExclCd, MMI_BEN_MAX_COG_TRPY_EXCL_CD_LEN);
  }

  /**
   * Update MmiBenMaxCogTrpyExclCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyExclCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxCogTrpyExclCd,
        MMI_BEN_MAX_COG_TRPY_EXCL_CD_LEN);
  }

  /**
   * Update MmiBenMaxCogTrpyExclCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxCogTrpyExclCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxCogTrpyExclCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxEhbSpneRhabCnt
   *
   * @return mmiBenMaxEhbSpneRhabCnt
   */
  public short getMmiBenMaxEhbSpneRhabCnt() throws CFException {
    if (isMmiBenMaxEhbSpneRhabCntModified()) {
      mmiBenMaxEhbSpneRhabCnt = refreshMmiBenMaxEhbSpneRhabCnt();
    }
    return mmiBenMaxEhbSpneRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbSpneRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-SPNE-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbSpneRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbSpneRhabCnt = checkMmiBenMaxEhbSpneRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbSpneRhabCnt(mmiBenMaxEhbSpneRhabCnt);
  }

  public void setMmiBenMaxEhbSpneRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbSpneRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpneRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbSpneRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbSpneRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpneRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbSpneHabCnt
   *
   * @return mmiBenMaxEhbSpneHabCnt
   */
  public short getMmiBenMaxEhbSpneHabCnt() throws CFException {
    if (isMmiBenMaxEhbSpneHabCntModified()) {
      mmiBenMaxEhbSpneHabCnt = refreshMmiBenMaxEhbSpneHabCnt();
    }
    return mmiBenMaxEhbSpneHabCnt;
  }

  /**
   * Update MmiBenMaxEhbSpneHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-SPNE-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbSpneHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbSpneHabCnt = checkMmiBenMaxEhbSpneHabCntMaxLimit(number);
    serializeMmiBenMaxEhbSpneHabCnt(mmiBenMaxEhbSpneHabCnt);
  }

  public void setMmiBenMaxEhbSpneHabCnt(int number) {
    number =
        checkMmiBenMaxEhbSpneHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpneHabCnt((short) number);
  }

  public void setMmiBenMaxEhbSpneHabCnt(long number) {
    number =
        checkMmiBenMaxEhbSpneHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpneHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPtRhabCnt
   *
   * @return mmiBenMaxEhbPtRhabCnt
   */
  public short getMmiBenMaxEhbPtRhabCnt() throws CFException {
    if (isMmiBenMaxEhbPtRhabCntModified()) {
      mmiBenMaxEhbPtRhabCnt = refreshMmiBenMaxEhbPtRhabCnt();
    }
    return mmiBenMaxEhbPtRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbPtRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-PT-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPtRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPtRhabCnt = checkMmiBenMaxEhbPtRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbPtRhabCnt(mmiBenMaxEhbPtRhabCnt);
  }

  public void setMmiBenMaxEhbPtRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbPtRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbPtRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbPtRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPtHabCnt
   *
   * @return mmiBenMaxEhbPtHabCnt
   */
  public short getMmiBenMaxEhbPtHabCnt() throws CFException {
    if (isMmiBenMaxEhbPtHabCntModified()) {
      mmiBenMaxEhbPtHabCnt = refreshMmiBenMaxEhbPtHabCnt();
    }
    return mmiBenMaxEhbPtHabCnt;
  }

  /**
   * Update MmiBenMaxEhbPtHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-PT-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPtHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPtHabCnt = checkMmiBenMaxEhbPtHabCntMaxLimit(number);
    serializeMmiBenMaxEhbPtHabCnt(mmiBenMaxEhbPtHabCnt);
  }

  public void setMmiBenMaxEhbPtHabCnt(int number) {
    number =
        checkMmiBenMaxEhbPtHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtHabCnt((short) number);
  }

  public void setMmiBenMaxEhbPtHabCnt(long number) {
    number =
        checkMmiBenMaxEhbPtHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbSpchRhabCnt
   *
   * @return mmiBenMaxEhbSpchRhabCnt
   */
  public short getMmiBenMaxEhbSpchRhabCnt() throws CFException {
    if (isMmiBenMaxEhbSpchRhabCntModified()) {
      mmiBenMaxEhbSpchRhabCnt = refreshMmiBenMaxEhbSpchRhabCnt();
    }
    return mmiBenMaxEhbSpchRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbSpchRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-SPCH-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbSpchRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbSpchRhabCnt = checkMmiBenMaxEhbSpchRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbSpchRhabCnt(mmiBenMaxEhbSpchRhabCnt);
  }

  public void setMmiBenMaxEhbSpchRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbSpchRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpchRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbSpchRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbSpchRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpchRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbSpchHabCnt
   *
   * @return mmiBenMaxEhbSpchHabCnt
   */
  public short getMmiBenMaxEhbSpchHabCnt() throws CFException {
    if (isMmiBenMaxEhbSpchHabCntModified()) {
      mmiBenMaxEhbSpchHabCnt = refreshMmiBenMaxEhbSpchHabCnt();
    }
    return mmiBenMaxEhbSpchHabCnt;
  }

  /**
   * Update MmiBenMaxEhbSpchHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-SPCH-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbSpchHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbSpchHabCnt = checkMmiBenMaxEhbSpchHabCntMaxLimit(number);
    serializeMmiBenMaxEhbSpchHabCnt(mmiBenMaxEhbSpchHabCnt);
  }

  public void setMmiBenMaxEhbSpchHabCnt(int number) {
    number =
        checkMmiBenMaxEhbSpchHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpchHabCnt((short) number);
  }

  public void setMmiBenMaxEhbSpchHabCnt(long number) {
    number =
        checkMmiBenMaxEhbSpchHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbSpchHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbCrdcRhabCnt
   *
   * @return mmiBenMaxEhbCrdcRhabCnt
   */
  public short getMmiBenMaxEhbCrdcRhabCnt() throws CFException {
    if (isMmiBenMaxEhbCrdcRhabCntModified()) {
      mmiBenMaxEhbCrdcRhabCnt = refreshMmiBenMaxEhbCrdcRhabCnt();
    }
    return mmiBenMaxEhbCrdcRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbCrdcRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-CRDC-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbCrdcRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbCrdcRhabCnt = checkMmiBenMaxEhbCrdcRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbCrdcRhabCnt(mmiBenMaxEhbCrdcRhabCnt);
  }

  public void setMmiBenMaxEhbCrdcRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbCrdcRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbCrdcRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbCrdcRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbCrdcRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbCrdcRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbOtRhabCnt
   *
   * @return mmiBenMaxEhbOtRhabCnt
   */
  public short getMmiBenMaxEhbOtRhabCnt() throws CFException {
    if (isMmiBenMaxEhbOtRhabCntModified()) {
      mmiBenMaxEhbOtRhabCnt = refreshMmiBenMaxEhbOtRhabCnt();
    }
    return mmiBenMaxEhbOtRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbOtRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-OT-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbOtRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbOtRhabCnt = checkMmiBenMaxEhbOtRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbOtRhabCnt(mmiBenMaxEhbOtRhabCnt);
  }

  public void setMmiBenMaxEhbOtRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbOtRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbOtRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbOtRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbOtRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbOtRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbOtHabCnt
   *
   * @return mmiBenMaxEhbOtHabCnt
   */
  public short getMmiBenMaxEhbOtHabCnt() throws CFException {
    if (isMmiBenMaxEhbOtHabCntModified()) {
      mmiBenMaxEhbOtHabCnt = refreshMmiBenMaxEhbOtHabCnt();
    }
    return mmiBenMaxEhbOtHabCnt;
  }

  /**
   * Update MmiBenMaxEhbOtHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-OT-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbOtHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbOtHabCnt = checkMmiBenMaxEhbOtHabCntMaxLimit(number);
    serializeMmiBenMaxEhbOtHabCnt(mmiBenMaxEhbOtHabCnt);
  }

  public void setMmiBenMaxEhbOtHabCnt(int number) {
    number =
        checkMmiBenMaxEhbOtHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbOtHabCnt((short) number);
  }

  public void setMmiBenMaxEhbOtHabCnt(long number) {
    number =
        checkMmiBenMaxEhbOtHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbOtHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPlmryRhabCnt
   *
   * @return mmiBenMaxEhbPlmryRhabCnt
   */
  public short getMmiBenMaxEhbPlmryRhabCnt() throws CFException {
    if (isMmiBenMaxEhbPlmryRhabCntModified()) {
      mmiBenMaxEhbPlmryRhabCnt = refreshMmiBenMaxEhbPlmryRhabCnt();
    }
    return mmiBenMaxEhbPlmryRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbPlmryRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-PLMRY-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPlmryRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPlmryRhabCnt = checkMmiBenMaxEhbPlmryRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbPlmryRhabCnt(mmiBenMaxEhbPlmryRhabCnt);
  }

  public void setMmiBenMaxEhbPlmryRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbPlmryRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPlmryRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbPlmryRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbPlmryRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPlmryRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbAuralRhabCnt
   *
   * @return mmiBenMaxEhbAuralRhabCnt
   */
  public short getMmiBenMaxEhbAuralRhabCnt() throws CFException {
    if (isMmiBenMaxEhbAuralRhabCntModified()) {
      mmiBenMaxEhbAuralRhabCnt = refreshMmiBenMaxEhbAuralRhabCnt();
    }
    return mmiBenMaxEhbAuralRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbAuralRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-AURAL-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbAuralRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbAuralRhabCnt = checkMmiBenMaxEhbAuralRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbAuralRhabCnt(mmiBenMaxEhbAuralRhabCnt);
  }

  public void setMmiBenMaxEhbAuralRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbAuralRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbAuralRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbAuralRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbAuralRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbAuralRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbAuralHabCnt
   *
   * @return mmiBenMaxEhbAuralHabCnt
   */
  public short getMmiBenMaxEhbAuralHabCnt() throws CFException {
    if (isMmiBenMaxEhbAuralHabCntModified()) {
      mmiBenMaxEhbAuralHabCnt = refreshMmiBenMaxEhbAuralHabCnt();
    }
    return mmiBenMaxEhbAuralHabCnt;
  }

  /**
   * Update MmiBenMaxEhbAuralHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-AURAL-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbAuralHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbAuralHabCnt = checkMmiBenMaxEhbAuralHabCntMaxLimit(number);
    serializeMmiBenMaxEhbAuralHabCnt(mmiBenMaxEhbAuralHabCnt);
  }

  public void setMmiBenMaxEhbAuralHabCnt(int number) {
    number =
        checkMmiBenMaxEhbAuralHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbAuralHabCnt((short) number);
  }

  public void setMmiBenMaxEhbAuralHabCnt(long number) {
    number =
        checkMmiBenMaxEhbAuralHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbAuralHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbCogRhabCnt
   *
   * @return mmiBenMaxEhbCogRhabCnt
   */
  public short getMmiBenMaxEhbCogRhabCnt() throws CFException {
    if (isMmiBenMaxEhbCogRhabCntModified()) {
      mmiBenMaxEhbCogRhabCnt = refreshMmiBenMaxEhbCogRhabCnt();
    }
    return mmiBenMaxEhbCogRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbCogRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-COG-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbCogRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbCogRhabCnt = checkMmiBenMaxEhbCogRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbCogRhabCnt(mmiBenMaxEhbCogRhabCnt);
  }

  public void setMmiBenMaxEhbCogRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbCogRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbCogRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbCogRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbCogRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbCogRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbCogHabCnt
   *
   * @return mmiBenMaxEhbCogHabCnt
   */
  public short getMmiBenMaxEhbCogHabCnt() throws CFException {
    if (isMmiBenMaxEhbCogHabCntModified()) {
      mmiBenMaxEhbCogHabCnt = refreshMmiBenMaxEhbCogHabCnt();
    }
    return mmiBenMaxEhbCogHabCnt;
  }

  /**
   * Update MmiBenMaxEhbCogHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-COG-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbCogHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbCogHabCnt = checkMmiBenMaxEhbCogHabCntMaxLimit(number);
    serializeMmiBenMaxEhbCogHabCnt(mmiBenMaxEhbCogHabCnt);
  }

  public void setMmiBenMaxEhbCogHabCnt(int number) {
    number =
        checkMmiBenMaxEhbCogHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbCogHabCnt((short) number);
  }

  public void setMmiBenMaxEhbCogHabCnt(long number) {
    number =
        checkMmiBenMaxEhbCogHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbCogHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPostRhabCnt
   *
   * @return mmiBenMaxEhbPostRhabCnt
   */
  public short getMmiBenMaxEhbPostRhabCnt() throws CFException {
    if (isMmiBenMaxEhbPostRhabCntModified()) {
      mmiBenMaxEhbPostRhabCnt = refreshMmiBenMaxEhbPostRhabCnt();
    }
    return mmiBenMaxEhbPostRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbPostRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-POST-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPostRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPostRhabCnt = checkMmiBenMaxEhbPostRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbPostRhabCnt(mmiBenMaxEhbPostRhabCnt);
  }

  public void setMmiBenMaxEhbPostRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbPostRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPostRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbPostRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbPostRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPostRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPostHabCnt
   *
   * @return mmiBenMaxEhbPostHabCnt
   */
  public short getMmiBenMaxEhbPostHabCnt() throws CFException {
    if (isMmiBenMaxEhbPostHabCntModified()) {
      mmiBenMaxEhbPostHabCnt = refreshMmiBenMaxEhbPostHabCnt();
    }
    return mmiBenMaxEhbPostHabCnt;
  }

  /**
   * Update MmiBenMaxEhbPostHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-POST-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPostHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPostHabCnt = checkMmiBenMaxEhbPostHabCntMaxLimit(number);
    serializeMmiBenMaxEhbPostHabCnt(mmiBenMaxEhbPostHabCnt);
  }

  public void setMmiBenMaxEhbPostHabCnt(int number) {
    number =
        checkMmiBenMaxEhbPostHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPostHabCnt((short) number);
  }

  public void setMmiBenMaxEhbPostHabCnt(long number) {
    number =
        checkMmiBenMaxEhbPostHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPostHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPtotRhabCnt
   *
   * @return mmiBenMaxEhbPtotRhabCnt
   */
  public short getMmiBenMaxEhbPtotRhabCnt() throws CFException {
    if (isMmiBenMaxEhbPtotRhabCntModified()) {
      mmiBenMaxEhbPtotRhabCnt = refreshMmiBenMaxEhbPtotRhabCnt();
    }
    return mmiBenMaxEhbPtotRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbPtotRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-PTOT-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPtotRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPtotRhabCnt = checkMmiBenMaxEhbPtotRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbPtotRhabCnt(mmiBenMaxEhbPtotRhabCnt);
  }

  public void setMmiBenMaxEhbPtotRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbPtotRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtotRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbPtotRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbPtotRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtotRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPtotHabCnt
   *
   * @return mmiBenMaxEhbPtotHabCnt
   */
  public short getMmiBenMaxEhbPtotHabCnt() throws CFException {
    if (isMmiBenMaxEhbPtotHabCntModified()) {
      mmiBenMaxEhbPtotHabCnt = refreshMmiBenMaxEhbPtotHabCnt();
    }
    return mmiBenMaxEhbPtotHabCnt;
  }

  /**
   * Update MmiBenMaxEhbPtotHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-PTOT-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPtotHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPtotHabCnt = checkMmiBenMaxEhbPtotHabCntMaxLimit(number);
    serializeMmiBenMaxEhbPtotHabCnt(mmiBenMaxEhbPtotHabCnt);
  }

  public void setMmiBenMaxEhbPtotHabCnt(int number) {
    number =
        checkMmiBenMaxEhbPtotHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtotHabCnt((short) number);
  }

  public void setMmiBenMaxEhbPtotHabCnt(long number) {
    number =
        checkMmiBenMaxEhbPtotHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPtotHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbRhabRmrkCd
   *
   * @return mmiBenMaxEhbRhabRmrkCd
   */
  public char[] getMmiBenMaxEhbRhabRmrkCd() throws CFException {
    if (isMmiBenMaxEhbRhabRmrkCdModified()) {
      mmiBenMaxEhbRhabRmrkCd = refreshMmiBenMaxEhbRhabRmrkCd();
    }
    return mmiBenMaxEhbRhabRmrkCd;
  }

  /**
   * set variable mmiBenMaxEhbRhabRmrkCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-RHAB-RMRK-CD
   *
   * @param value
   */
  public void setMmiBenMaxEhbRhabRmrkCd(char[] value) {
    mmiBenMaxEhbRhabRmrkCd = checkMmiBenMaxEhbRhabRmrkCdConstraints(value);
    serializeMmiBenMaxEhbRhabRmrkCd(mmiBenMaxEhbRhabRmrkCd);
  }

  /**
   * Update MmiBenMaxEhbRhabRmrkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxEhbRhabRmrkCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxEhbRhabRmrkCd,
        mmiBenMaxEhbRhabRmrkCd.length);
  }

  public void setMmiBenMaxEhbRhabRmrkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxEhbRhabRmrkCd, mmiBenMaxEhbRhabRmrkCd.length);
  }

  /**
   * Update MmiBenMaxEhbRhabRmrkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxEhbRhabRmrkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxEhbRhabRmrkCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxEhbRhabRmrkCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxEhbRhabRmrkCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxEhbRhabRmrkCd, MMI_BEN_MAX_EHB_RHAB_RMRK_CD_LEN);
  }

  /**
   * Update MmiBenMaxEhbRhabRmrkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxEhbRhabRmrkCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxEhbRhabRmrkCd,
        MMI_BEN_MAX_EHB_RHAB_RMRK_CD_LEN);
  }

  /**
   * Update MmiBenMaxEhbRhabRmrkCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxEhbRhabRmrkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxEhbRhabRmrkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxEhbPosmRhabCnt
   *
   * @return mmiBenMaxEhbPosmRhabCnt
   */
  public short getMmiBenMaxEhbPosmRhabCnt() throws CFException {
    if (isMmiBenMaxEhbPosmRhabCntModified()) {
      mmiBenMaxEhbPosmRhabCnt = refreshMmiBenMaxEhbPosmRhabCnt();
    }
    return mmiBenMaxEhbPosmRhabCnt;
  }

  /**
   * Update MmiBenMaxEhbPosmRhabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-POSM-RHAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPosmRhabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPosmRhabCnt = checkMmiBenMaxEhbPosmRhabCntMaxLimit(number);
    serializeMmiBenMaxEhbPosmRhabCnt(mmiBenMaxEhbPosmRhabCnt);
  }

  public void setMmiBenMaxEhbPosmRhabCnt(int number) {
    number =
        checkMmiBenMaxEhbPosmRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPosmRhabCnt((short) number);
  }

  public void setMmiBenMaxEhbPosmRhabCnt(long number) {
    number =
        checkMmiBenMaxEhbPosmRhabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPosmRhabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbPosmHabCnt
   *
   * @return mmiBenMaxEhbPosmHabCnt
   */
  public short getMmiBenMaxEhbPosmHabCnt() throws CFException {
    if (isMmiBenMaxEhbPosmHabCntModified()) {
      mmiBenMaxEhbPosmHabCnt = refreshMmiBenMaxEhbPosmHabCnt();
    }
    return mmiBenMaxEhbPosmHabCnt;
  }

  /**
   * Update MmiBenMaxEhbPosmHabCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-EHB-POSM-HAB-CNT
   *
   * @param number
   */
  public void setMmiBenMaxEhbPosmHabCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxEhbPosmHabCnt = checkMmiBenMaxEhbPosmHabCntMaxLimit(number);
    serializeMmiBenMaxEhbPosmHabCnt(mmiBenMaxEhbPosmHabCnt);
  }

  public void setMmiBenMaxEhbPosmHabCnt(int number) {
    number =
        checkMmiBenMaxEhbPosmHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPosmHabCnt((short) number);
  }

  public void setMmiBenMaxEhbPosmHabCnt(long number) {
    number =
        checkMmiBenMaxEhbPosmHabCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxEhbPosmHabCnt((short) number);
  }

  /**
   * Returns the value of mmiBenMaxEhbHabRmrkCd
   *
   * @return mmiBenMaxEhbHabRmrkCd
   */
  public char[] getMmiBenMaxEhbHabRmrkCd() throws CFException {
    if (isMmiBenMaxEhbHabRmrkCdModified()) {
      mmiBenMaxEhbHabRmrkCd = refreshMmiBenMaxEhbHabRmrkCd();
    }
    return mmiBenMaxEhbHabRmrkCd;
  }

  /**
   * set variable mmiBenMaxEhbHabRmrkCd Corresponding COBOL Variable is MMI-BEN-MAX-EHB-HAB-RMRK-CD
   *
   * @param value
   */
  public void setMmiBenMaxEhbHabRmrkCd(char[] value) {
    mmiBenMaxEhbHabRmrkCd = checkMmiBenMaxEhbHabRmrkCdConstraints(value);
    serializeMmiBenMaxEhbHabRmrkCd(mmiBenMaxEhbHabRmrkCd);
  }

  /**
   * Update MmiBenMaxEhbHabRmrkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxEhbHabRmrkCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxEhbHabRmrkCd,
        mmiBenMaxEhbHabRmrkCd.length);
  }

  public void setMmiBenMaxEhbHabRmrkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenMaxEhbHabRmrkCd, mmiBenMaxEhbHabRmrkCd.length);
  }

  /**
   * Update MmiBenMaxEhbHabRmrkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxEhbHabRmrkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxEhbHabRmrkCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxEhbHabRmrkCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxEhbHabRmrkCd(Field source) {
    replace(
        source, 0, source.length(), beginMmiBenMaxEhbHabRmrkCd, MMI_BEN_MAX_EHB_HAB_RMRK_CD_LEN);
  }

  /**
   * Update MmiBenMaxEhbHabRmrkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxEhbHabRmrkCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxEhbHabRmrkCd,
        MMI_BEN_MAX_EHB_HAB_RMRK_CD_LEN);
  }

  /**
   * Update MmiBenMaxEhbHabRmrkCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxEhbHabRmrkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxEhbHabRmrkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenPhysMedcnPrdCd
   *
   * @return mmiBenPhysMedcnPrdCd
   */
  public char[] getMmiBenPhysMedcnPrdCd() throws CFException {
    if (isMmiBenPhysMedcnPrdCdModified()) {
      mmiBenPhysMedcnPrdCd = refreshMmiBenPhysMedcnPrdCd();
    }
    return mmiBenPhysMedcnPrdCd;
  }

  /**
   * set variable mmiBenPhysMedcnPrdCd Corresponding COBOL Variable is MMI-BEN-PHYS-MEDCN-PRD-CD
   *
   * @param value
   */
  public void setMmiBenPhysMedcnPrdCd(char[] value) {
    mmiBenPhysMedcnPrdCd = checkMmiBenPhysMedcnPrdCdConstraints(value);
    serializeMmiBenPhysMedcnPrdCd(mmiBenPhysMedcnPrdCd);
  }

  /**
   * Update MmiBenPhysMedcnPrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenPhysMedcnPrdCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmiBenPhysMedcnPrdCd, mmiBenPhysMedcnPrdCd.length);
  }

  public void setMmiBenPhysMedcnPrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenPhysMedcnPrdCd, mmiBenPhysMedcnPrdCd.length);
  }

  /**
   * Update MmiBenPhysMedcnPrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenPhysMedcnPrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenPhysMedcnPrdCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenPhysMedcnPrdCd with another Field
   *
   * @param value
   */
  public void setMmiBenPhysMedcnPrdCd(Field source) {
    replace(source, 0, source.length(), beginMmiBenPhysMedcnPrdCd, MMI_BEN_PHYS_MEDCN_PRD_CD_LEN);
  }

  /**
   * Update MmiBenPhysMedcnPrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenPhysMedcnPrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginMmiBenPhysMedcnPrdCd, MMI_BEN_PHYS_MEDCN_PRD_CD_LEN);
  }

  /**
   * Update MmiBenPhysMedcnPrdCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenPhysMedcnPrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenPhysMedcnPrdCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenAutsmAgeYrFrVal
   *
   * @return mmiBenAutsmAgeYrFrVal
   */
  public short getMmiBenAutsmAgeYrFrVal() throws CFException {
    if (isMmiBenAutsmAgeYrFrValModified()) {
      mmiBenAutsmAgeYrFrVal = refreshMmiBenAutsmAgeYrFrVal();
    }
    return mmiBenAutsmAgeYrFrVal;
  }

  /**
   * Update MmiBenAutsmAgeYrFrVal with the passed value Corresponding COBOL Variable is
   * MMI-BEN-AUTSM-AGE-YR-FR-VAL
   *
   * @param number
   */
  public void setMmiBenAutsmAgeYrFrVal(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenAutsmAgeYrFrVal = checkMmiBenAutsmAgeYrFrValMaxLimit(number);
    serializeMmiBenAutsmAgeYrFrVal(mmiBenAutsmAgeYrFrVal);
  }

  public void setMmiBenAutsmAgeYrFrVal(int number) {
    number =
        checkMmiBenAutsmAgeYrFrValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsmAgeYrFrVal((short) number);
  }

  public void setMmiBenAutsmAgeYrFrVal(long number) {
    number =
        checkMmiBenAutsmAgeYrFrValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsmAgeYrFrVal((short) number);
  }

  /**
   * Returns the value of mmiBenAutsmAgeYrToVal
   *
   * @return mmiBenAutsmAgeYrToVal
   */
  public short getMmiBenAutsmAgeYrToVal() throws CFException {
    if (isMmiBenAutsmAgeYrToValModified()) {
      mmiBenAutsmAgeYrToVal = refreshMmiBenAutsmAgeYrToVal();
    }
    return mmiBenAutsmAgeYrToVal;
  }

  /**
   * Update MmiBenAutsmAgeYrToVal with the passed value Corresponding COBOL Variable is
   * MMI-BEN-AUTSM-AGE-YR-TO-VAL
   *
   * @param number
   */
  public void setMmiBenAutsmAgeYrToVal(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenAutsmAgeYrToVal = checkMmiBenAutsmAgeYrToValMaxLimit(number);
    serializeMmiBenAutsmAgeYrToVal(mmiBenAutsmAgeYrToVal);
  }

  public void setMmiBenAutsmAgeYrToVal(int number) {
    number =
        checkMmiBenAutsmAgeYrToValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsmAgeYrToVal((short) number);
  }

  public void setMmiBenAutsmAgeYrToVal(long number) {
    number =
        checkMmiBenAutsmAgeYrToValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsmAgeYrToVal((short) number);
  }

  /**
   * Returns the value of mmiBenAutsmPostCd
   *
   * @return mmiBenAutsmPostCd
   */
  public char[] getMmiBenAutsmPostCd() throws CFException {
    if (isMmiBenAutsmPostCdModified()) {
      mmiBenAutsmPostCd = refreshMmiBenAutsmPostCd();
    }
    return mmiBenAutsmPostCd;
  }

  /**
   * set variable mmiBenAutsmPostCd Corresponding COBOL Variable is MMI-BEN-AUTSM-POST-CD
   *
   * @param value
   */
  public void setMmiBenAutsmPostCd(char[] value) {
    mmiBenAutsmPostCd = checkMmiBenAutsmPostCdConstraints(value);
    serializeMmiBenAutsmPostCd(mmiBenAutsmPostCd);
  }

  /**
   * Update MmiBenAutsmPostCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmPostCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBenAutsmPostCd, mmiBenAutsmPostCd.length);
  }

  public void setMmiBenAutsmPostCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmPostCd, mmiBenAutsmPostCd.length);
  }

  /**
   * Update MmiBenAutsmPostCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmPostCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmPostCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenAutsmPostCd with another Field
   *
   * @param value
   */
  public void setMmiBenAutsmPostCd(Field source) {
    replace(source, 0, source.length(), beginMmiBenAutsmPostCd, MMI_BEN_AUTSM_POST_CD_LEN);
  }

  /**
   * Update MmiBenAutsmPostCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmPostCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmPostCd, MMI_BEN_AUTSM_POST_CD_LEN);
  }

  /**
   * Update MmiBenAutsmPostCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmPostCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmPostCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenAutsmAllCd
   *
   * @return mmiBenAutsmAllCd
   */
  public char[] getMmiBenAutsmAllCd() throws CFException {
    if (isMmiBenAutsmAllCdModified()) {
      mmiBenAutsmAllCd = refreshMmiBenAutsmAllCd();
    }
    return mmiBenAutsmAllCd;
  }

  /**
   * set variable mmiBenAutsmAllCd Corresponding COBOL Variable is MMI-BEN-AUTSM-ALL-CD
   *
   * @param value
   */
  public void setMmiBenAutsmAllCd(char[] value) {
    mmiBenAutsmAllCd = checkMmiBenAutsmAllCdConstraints(value);
    serializeMmiBenAutsmAllCd(mmiBenAutsmAllCd);
  }

  /**
   * Update MmiBenAutsmAllCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmAllCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBenAutsmAllCd, mmiBenAutsmAllCd.length);
  }

  public void setMmiBenAutsmAllCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmAllCd, mmiBenAutsmAllCd.length);
  }

  /**
   * Update MmiBenAutsmAllCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmAllCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmAllCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenAutsmAllCd with another Field
   *
   * @param value
   */
  public void setMmiBenAutsmAllCd(Field source) {
    replace(source, 0, source.length(), beginMmiBenAutsmAllCd, MMI_BEN_AUTSM_ALL_CD_LEN);
  }

  /**
   * Update MmiBenAutsmAllCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmAllCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmAllCd, MMI_BEN_AUTSM_ALL_CD_LEN);
  }

  /**
   * Update MmiBenAutsmAllCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsmAllCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsmAllCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPlmryRehbPriCd
   *
   * @return mmiBenMaxPlmryRehbPriCd
   */
  public char[] getMmiBenMaxPlmryRehbPriCd() throws CFException {
    if (isMmiBenMaxPlmryRehbPriCdModified()) {
      mmiBenMaxPlmryRehbPriCd = refreshMmiBenMaxPlmryRehbPriCd();
    }
    return mmiBenMaxPlmryRehbPriCd;
  }

  /**
   * set variable mmiBenMaxPlmryRehbPriCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PLMRY-REHB-PRI-CD
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbPriCd(char[] value) {
    mmiBenMaxPlmryRehbPriCd = checkMmiBenMaxPlmryRehbPriCdConstraints(value);
    serializeMmiBenMaxPlmryRehbPriCd(mmiBenMaxPlmryRehbPriCd);
  }

  /**
   * Update MmiBenMaxPlmryRehbPriCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbPriCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPlmryRehbPriCd,
        mmiBenMaxPlmryRehbPriCd.length);
  }

  public void setMmiBenMaxPlmryRehbPriCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPlmryRehbPriCd,
        mmiBenMaxPlmryRehbPriCd.length);
  }

  /**
   * Update MmiBenMaxPlmryRehbPriCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbPriCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPlmryRehbPriCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPlmryRehbPriCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbPriCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginMmiBenMaxPlmryRehbPriCd,
        MMI_BEN_MAX_PLMRY_REHB_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPlmryRehbPriCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbPriCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPlmryRehbPriCd,
        MMI_BEN_MAX_PLMRY_REHB_PRI_CD_LEN);
  }

  /**
   * Update MmiBenMaxPlmryRehbPriCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbPriCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPlmryRehbPriCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPlmryRehbSecCd
   *
   * @return mmiBenMaxPlmryRehbSecCd
   */
  public char[] getMmiBenMaxPlmryRehbSecCd() throws CFException {
    if (isMmiBenMaxPlmryRehbSecCdModified()) {
      mmiBenMaxPlmryRehbSecCd = refreshMmiBenMaxPlmryRehbSecCd();
    }
    return mmiBenMaxPlmryRehbSecCd;
  }

  /**
   * set variable mmiBenMaxPlmryRehbSecCd Corresponding COBOL Variable is
   * MMI-BEN-MAX-PLMRY-REHB-SEC-CD
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbSecCd(char[] value) {
    mmiBenMaxPlmryRehbSecCd = checkMmiBenMaxPlmryRehbSecCdConstraints(value);
    serializeMmiBenMaxPlmryRehbSecCd(mmiBenMaxPlmryRehbSecCd);
  }

  /**
   * Update MmiBenMaxPlmryRehbSecCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbSecCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginMmiBenMaxPlmryRehbSecCd,
        mmiBenMaxPlmryRehbSecCd.length);
  }

  public void setMmiBenMaxPlmryRehbSecCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPlmryRehbSecCd,
        mmiBenMaxPlmryRehbSecCd.length);
  }

  /**
   * Update MmiBenMaxPlmryRehbSecCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbSecCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPlmryRehbSecCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenMaxPlmryRehbSecCd with another Field
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbSecCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginMmiBenMaxPlmryRehbSecCd,
        MMI_BEN_MAX_PLMRY_REHB_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPlmryRehbSecCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbSecCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginMmiBenMaxPlmryRehbSecCd,
        MMI_BEN_MAX_PLMRY_REHB_SEC_CD_LEN);
  }

  /**
   * Update MmiBenMaxPlmryRehbSecCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMmiBenMaxPlmryRehbSecCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenMaxPlmryRehbSecCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenMaxPlmryRehbSecCnt
   *
   * @return mmiBenMaxPlmryRehbSecCnt
   */
  public short getMmiBenMaxPlmryRehbSecCnt() throws CFException {
    if (isMmiBenMaxPlmryRehbSecCntModified()) {
      mmiBenMaxPlmryRehbSecCnt = refreshMmiBenMaxPlmryRehbSecCnt();
    }
    return mmiBenMaxPlmryRehbSecCnt;
  }

  /**
   * Update MmiBenMaxPlmryRehbSecCnt with the passed value Corresponding COBOL Variable is
   * MMI-BEN-MAX-PLMRY-REHB-SEC-CNT
   *
   * @param number
   */
  public void setMmiBenMaxPlmryRehbSecCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenMaxPlmryRehbSecCnt = checkMmiBenMaxPlmryRehbSecCntMaxLimit(number);
    serializeMmiBenMaxPlmryRehbSecCnt(mmiBenMaxPlmryRehbSecCnt);
  }

  public void setMmiBenMaxPlmryRehbSecCnt(int number) {
    number =
        checkMmiBenMaxPlmryRehbSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPlmryRehbSecCnt((short) number);
  }

  public void setMmiBenMaxPlmryRehbSecCnt(long number) {
    number =
        checkMmiBenMaxPlmryRehbSecCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenMaxPlmryRehbSecCnt((short) number);
  }

  /**
   * Returns the value of mmiSiteSrvcPrtcpCd
   *
   * @return mmiSiteSrvcPrtcpCd
   */
  public char[] getMmiSiteSrvcPrtcpCd() throws CFException {
    if (isMmiSiteSrvcPrtcpCdModified()) {
      mmiSiteSrvcPrtcpCd = refreshMmiSiteSrvcPrtcpCd();
    }
    return mmiSiteSrvcPrtcpCd;
  }

  /**
   * set variable mmiSiteSrvcPrtcpCd Corresponding COBOL Variable is MMI-SITE-SRVC-PRTCP-CD
   *
   * @param value
   */
  public void setMmiSiteSrvcPrtcpCd(char[] value) {
    mmiSiteSrvcPrtcpCd = checkMmiSiteSrvcPrtcpCdConstraints(value);
    serializeMmiSiteSrvcPrtcpCd(mmiSiteSrvcPrtcpCd);
  }

  /**
   * Update MmiSiteSrvcPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiSiteSrvcPrtcpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiSiteSrvcPrtcpCd, mmiSiteSrvcPrtcpCd.length);
  }

  public void setMmiSiteSrvcPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSiteSrvcPrtcpCd, mmiSiteSrvcPrtcpCd.length);
  }

  /**
   * Update MmiSiteSrvcPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSiteSrvcPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSiteSrvcPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update MmiSiteSrvcPrtcpCd with another Field
   *
   * @param value
   */
  public void setMmiSiteSrvcPrtcpCd(Field source) {
    replace(source, 0, source.length(), beginMmiSiteSrvcPrtcpCd, MMI_SITE_SRVC_PRTCP_CD_LEN);
  }

  /**
   * Update MmiSiteSrvcPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiSiteSrvcPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSiteSrvcPrtcpCd, MMI_SITE_SRVC_PRTCP_CD_LEN);
  }

  /**
   * Update MmiSiteSrvcPrtcpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiSiteSrvcPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiSiteSrvcPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenAutsm2AgeYrFrVal
   *
   * @return mmiBenAutsm2AgeYrFrVal
   */
  public short getMmiBenAutsm2AgeYrFrVal() throws CFException {
    if (isMmiBenAutsm2AgeYrFrValModified()) {
      mmiBenAutsm2AgeYrFrVal = refreshMmiBenAutsm2AgeYrFrVal();
    }
    return mmiBenAutsm2AgeYrFrVal;
  }

  /**
   * Update MmiBenAutsm2AgeYrFrVal with the passed value Corresponding COBOL Variable is
   * MMI-BEN-AUTSM2-AGE-YR-FR-VAL
   *
   * @param number
   */
  public void setMmiBenAutsm2AgeYrFrVal(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenAutsm2AgeYrFrVal = checkMmiBenAutsm2AgeYrFrValMaxLimit(number);
    serializeMmiBenAutsm2AgeYrFrVal(mmiBenAutsm2AgeYrFrVal);
  }

  public void setMmiBenAutsm2AgeYrFrVal(int number) {
    number =
        checkMmiBenAutsm2AgeYrFrValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsm2AgeYrFrVal((short) number);
  }

  public void setMmiBenAutsm2AgeYrFrVal(long number) {
    number =
        checkMmiBenAutsm2AgeYrFrValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsm2AgeYrFrVal((short) number);
  }

  /**
   * Returns the value of mmiBenAutsm2AgeYrToVal
   *
   * @return mmiBenAutsm2AgeYrToVal
   */
  public short getMmiBenAutsm2AgeYrToVal() throws CFException {
    if (isMmiBenAutsm2AgeYrToValModified()) {
      mmiBenAutsm2AgeYrToVal = refreshMmiBenAutsm2AgeYrToVal();
    }
    return mmiBenAutsm2AgeYrToVal;
  }

  /**
   * Update MmiBenAutsm2AgeYrToVal with the passed value Corresponding COBOL Variable is
   * MMI-BEN-AUTSM2-AGE-YR-TO-VAL
   *
   * @param number
   */
  public void setMmiBenAutsm2AgeYrToVal(short number) {
    // Truncate if the number is beyond +/- Max range
    mmiBenAutsm2AgeYrToVal = checkMmiBenAutsm2AgeYrToValMaxLimit(number);
    serializeMmiBenAutsm2AgeYrToVal(mmiBenAutsm2AgeYrToVal);
  }

  public void setMmiBenAutsm2AgeYrToVal(int number) {
    number =
        checkMmiBenAutsm2AgeYrToValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsm2AgeYrToVal((short) number);
  }

  public void setMmiBenAutsm2AgeYrToVal(long number) {
    number =
        checkMmiBenAutsm2AgeYrToValMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setMmiBenAutsm2AgeYrToVal((short) number);
  }

  /**
   * Returns the value of mmiBenAutsm2PostCd
   *
   * @return mmiBenAutsm2PostCd
   */
  public char[] getMmiBenAutsm2PostCd() throws CFException {
    if (isMmiBenAutsm2PostCdModified()) {
      mmiBenAutsm2PostCd = refreshMmiBenAutsm2PostCd();
    }
    return mmiBenAutsm2PostCd;
  }

  /**
   * set variable mmiBenAutsm2PostCd Corresponding COBOL Variable is MMI-BEN-AUTSM2-POST-CD
   *
   * @param value
   */
  public void setMmiBenAutsm2PostCd(char[] value) {
    mmiBenAutsm2PostCd = checkMmiBenAutsm2PostCdConstraints(value);
    serializeMmiBenAutsm2PostCd(mmiBenAutsm2PostCd);
  }

  /**
   * Update MmiBenAutsm2PostCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2PostCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBenAutsm2PostCd, mmiBenAutsm2PostCd.length);
  }

  public void setMmiBenAutsm2PostCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2PostCd, mmiBenAutsm2PostCd.length);
  }

  /**
   * Update MmiBenAutsm2PostCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2PostCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2PostCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenAutsm2PostCd with another Field
   *
   * @param value
   */
  public void setMmiBenAutsm2PostCd(Field source) {
    replace(source, 0, source.length(), beginMmiBenAutsm2PostCd, MMI_BEN_AUTSM_2_POST_CD_LEN);
  }

  /**
   * Update MmiBenAutsm2PostCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2PostCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2PostCd, MMI_BEN_AUTSM_2_POST_CD_LEN);
  }

  /**
   * Update MmiBenAutsm2PostCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2PostCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2PostCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmiBenAutsm2AllCd
   *
   * @return mmiBenAutsm2AllCd
   */
  public char[] getMmiBenAutsm2AllCd() throws CFException {
    if (isMmiBenAutsm2AllCdModified()) {
      mmiBenAutsm2AllCd = refreshMmiBenAutsm2AllCd();
    }
    return mmiBenAutsm2AllCd;
  }

  /**
   * set variable mmiBenAutsm2AllCd Corresponding COBOL Variable is MMI-BEN-AUTSM2-ALL-CD
   *
   * @param value
   */
  public void setMmiBenAutsm2AllCd(char[] value) {
    mmiBenAutsm2AllCd = checkMmiBenAutsm2AllCdConstraints(value);
    serializeMmiBenAutsm2AllCd(mmiBenAutsm2AllCd);
  }

  /**
   * Update MmiBenAutsm2AllCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2AllCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmiBenAutsm2AllCd, mmiBenAutsm2AllCd.length);
  }

  public void setMmiBenAutsm2AllCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2AllCd, mmiBenAutsm2AllCd.length);
  }

  /**
   * Update MmiBenAutsm2AllCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2AllCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2AllCd + targetIndex, targetLen);
  }

  /**
   * Update MmiBenAutsm2AllCd with another Field
   *
   * @param value
   */
  public void setMmiBenAutsm2AllCd(Field source) {
    replace(source, 0, source.length(), beginMmiBenAutsm2AllCd, MMI_BEN_AUTSM_2_ALL_CD_LEN);
  }

  /**
   * Update MmiBenAutsm2AllCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2AllCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2AllCd, MMI_BEN_AUTSM_2_ALL_CD_LEN);
  }

  /**
   * Update MmiBenAutsm2AllCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmiBenAutsm2AllCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmiBenAutsm2AllCd + targetIndex, targetLen);
  }

  /**
   * initializes DclpolPlnMstr String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setMmiCovTypCd(CONSTANTS.SPACE);
    setMmiPolNbr(CONSTANTS.SPACE_6);
    setMmiPlnNbr(CONSTANTS.SPACE_4);
    setMmiClssNbr(CONSTANTS.SPACE_4);
    setMmiObsolete(CONSTANTS.SPACE_6);
    setMmiSlotTblId(CONSTANTS.SPACE_6);
    setMmiObligId(CONSTANTS.SPACE_2);
    setMmiShrArngCd(CONSTANTS.SPACE_2);
    setMmiRcprctyTblId(CONSTANTS.SPACE_6);
    setMmiNewOldSrvcInd(CONSTANTS.SPACE);
    setMmiCopayVarId(0);
    setMmiLstUpdtDttm(CONSTANTS.SPACE_26);
    setMmiLstUpdtId(CONSTANTS.SPACE_9);
    setMmiAllncCd(CONSTANTS.SPACE);
    setMmiBenMaxCombPriCd(CONSTANTS.SPACE);
    setMmiBenMaxCombPriCnt((short) 0);
    setMmiBenMaxCombSecCd(CONSTANTS.SPACE);
    setMmiBenMaxCombSecCnt((short) 0);
    setMmiBenMaxCrdcRehabPriCd(CONSTANTS.SPACE);
    setMmiBenMaxCrdcRehabPriCnt((short) 0);
    setMmiBenMaxCrdcRehabSecCd(CONSTANTS.SPACE);
    setMmiBenMaxCrdcRehabSecCnt((short) 0);
    setMmiBenMaxOcpTrpyPriCd(CONSTANTS.SPACE);
    setMmiBenMaxOcpTrpyPriCnt((short) 0);
    setMmiBenMaxOcpTrpySecCd(CONSTANTS.SPACE);
    setMmiBenMaxOcpTrpySecCnt((short) 0);
    setMmiBenMaxPhOcSpchPriCd(CONSTANTS.SPACE);
    setMmiBenMaxPhOcSpchPriCnt((short) 0);
    setMmiBenMaxPhOcSpchSecCd(CONSTANTS.SPACE);
    setMmiBenMaxPhOcSpchSecCnt((short) 0);
    setMmiBenMaxPhOcTrpyPriCd(CONSTANTS.SPACE);
    setMmiBenMaxPhOcTrpyPriCnt((short) 0);
    setMmiBenMaxPhOcTrpySecCd(CONSTANTS.SPACE);
    setMmiBenMaxPhOcTrpySecCnt((short) 0);
    setMmiBenMaxPhysTrpyPriCd(CONSTANTS.SPACE);
    setMmiBenMaxPhysTrpyPriCnt((short) 0);
    setMmiBenMaxPhysTrpySecCd(CONSTANTS.SPACE);
    setMmiBenMaxPhysTrpySecCnt((short) 0);
    setMmiBenMaxPlmryRehbPriCnt((short) 0);
    setMmiBenMaxSpchTrpyPriCd(CONSTANTS.SPACE);
    setMmiBenMaxSpchTrpyPriCnt((short) 0);
    setMmiBenMaxSpchTrpySecCd(CONSTANTS.SPACE);
    setMmiBenMaxSpchTrpySecCnt((short) 0);
    setMmiBenMaxSpneMnipPriCd(CONSTANTS.SPACE);
    setMmiBenMaxSpneMnipPriCnt((short) 0);
    setMmiBenMaxSpneMnipSecCd(CONSTANTS.SPACE);
    setMmiBenMaxSpneMnipSecCnt((short) 0);
    setMmiCancDt(CONSTANTS.SPACE_10);
    setMmiCareMgtInd(CONSTANTS.SPACE);
    setMmiChrpNtwkInd(CONSTANTS.SPACE);
    setMmiClmAutoDenyInd(CONSTANTS.SPACE);
    setMmiCoinsCopayCd(CONSTANTS.SPACE_2);
    setMmiCombPrscDedPriCd(CONSTANTS.SPACE);
    setMmiCombPrscDedQualCd(CONSTANTS.SPACE);
    setMmiCombPrscDedSecCd(CONSTANTS.SPACE);
    setMmiCombPrscDedTirCd(CONSTANTS.SPACE);
    setMmiContrStCd(CONSTANTS.SPACE_2);
    setMmiCopayAmt(BigDecimal.ZERO);
    setMmiCopayMaxAnnlAmt(BigDecimal.ZERO);
    setMmiCopayWaivTblId(CONSTANTS.SPACE_6);
    setMmiDiagVsSurgInd(CONSTANTS.SPACE);
    setMmiDolTlrInd(CONSTANTS.SPACE);
    setMmiDsesStTblNbr(CONSTANTS.SPACE_6);
    setMmiEffDt(CONSTANTS.SPACE_10);
    setMmiEmrgParsNtfyInd(CONSTANTS.SPACE);
    setMmiEmrgParsNtfyPrdCd(CONSTANTS.SPACE);
    setMmiEvdBasDialgInd(CONSTANTS.SPACE);
    setMmiEciTblId(CONSTANTS.SPACE_6);
    setMmiEviTblId(CONSTANTS.SPACE_6);
    setMmiFamMbrCnt((short) 0);
    setMmiFamNewCoinsAmt(0);
    setMmiFamTxtSwapCd(CONSTANTS.SPACE);
    setMmiFertCtrcptvCd(CONSTANTS.SPACE);
    setMmiObsolete2(CONSTANTS.SPACE_2);
    setMmiHiDedPlnCd(CONSTANTS.SPACE_2);
    setMmiIplanTypCd(CONSTANTS.SPACE);
    setMmiLftmMaxAmt(0);
    setMmiMbrNtwkKeyMtchCd(CONSTANTS.SPACE);
    setMmiMbrPrdctCd(CONSTANTS.SPACE_6);
    setMmiMbrPrdctTypCd(CONSTANTS.SPACE_3);
    setMmiMnrpCd(CONSTANTS.SPACE);
    setMmiMnrpPct((short) 0);
    setMmiMntlUbhCd(CONSTANTS.SPACE_2);
    setMmiNewCoinsAmt(0);
    setMmiNewCoinsCombPrscCd(CONSTANTS.SPACE);
    setMmiNewCoinsPrdCd(CONSTANTS.SPACE);
    setMmiNewCoinsSalFamMultFct(BigDecimal.ZERO);
    setMmiNewCoinsSalFamTypCd(CONSTANTS.SPACE);
    setMmiNewCoinsSalIndvTypCd(CONSTANTS.SPACE);
    setMmiNoblxLabInd(CONSTANTS.SPACE);
    setMmiNonEmbdDedCd(CONSTANTS.SPACE);
    setMmiNonEmrgInd(CONSTANTS.SPACE);
    setMmiNtfyCrdcEpInd(CONSTANTS.SPACE);
    setMmiNtwkPcpCopayAmt(BigDecimal.ZERO);
    setMmiObgynPcpCopayInd(CONSTANTS.SPACE);
    setMmiOfcVstMaxRmrkCd(CONSTANTS.SPACE_3);
    setMmiOopCombEeChrgAmt(0);
    setMmiOopCombEePls1Amt(0);
    setMmiOopCombEeSpoAmt(0);
    setMmiOopCombFamAmt(0);
    setMmiOopCombIndvAmt(0);
    setMmiOopCombNbrCd(CONSTANTS.SPACE);
    setMmiOopCombPrscCd(CONSTANTS.SPACE);
    setMmiOopInNtwkEeChrgAmt(0);
    setMmiOopInNtwkEePls1Amt(0);
    setMmiOopInNtwkEeSpoAmt(0);
    setMmiOopUrgntCareCd(CONSTANTS.SPACE);
    setMmiOthrRmrkCd(CONSTANTS.SPACE_3);
    setMmiParsMnlProcInd(CONSTANTS.SPACE);
    setMmiParsOopLmtAmt(BigDecimal.ZERO);
    setMmiParsSurgSchedNbr((short) 0);
    setMmiPayLocCd(CONSTANTS.SPACE_3);
    setMmiPcpCopayCd(CONSTANTS.SPACE);
    setMmiPcpSpecCoinsInd(CONSTANTS.SPACE);
    setMmiPhysMedcnPrdCd(CONSTANTS.SPACE);
    setMmiPolTypCd(CONSTANTS.SPACE_2);
    setMmiPpoInd(CONSTANTS.SPACE);
    setMmiPpoMinEmrgInd(CONSTANTS.SPACE);
    setMmiPpoPmntCd(CONSTANTS.SPACE_2);
    setMmiPrdctKeyCd(CONSTANTS.SPACE_3);
    setMmiPrortEvntTypCd(CONSTANTS.SPACE);
    setMmiPrortIntrvlFreqCd(CONSTANTS.SPACE);
    setMmiPsyCyrCnfmMaxAmt(0);
    setMmiPsyCyrCombPrscMaxAmt(0);
    setMmiPsyCyrNonCnfmMaxAmt(0);
    setMmiPsyLftmCnfmMaxAmt(0);
    setMmiPsyLftmCombPrscMaxAmt(0);
    setMmiPsyLftmNonCnfmMaxAmt(0);
    setMmiRapl3TierInd(CONSTANTS.SPACE);
    setMmiRhapsodyCopayCd(CONSTANTS.SPACE);
    setMmiRhapsodyCopayDayCnt((short) 0);
    setMmiRmrkCd(CONSTANTS.SPACE_3);
    setMmiRmrkSpineManipCd(CONSTANTS.SPACE_3);
    setMmiSpclProc1Cd(CONSTANTS.SPACE);
    setMmiSpclProc2Cd(CONSTANTS.SPACE);
    setMmiSpclProc3Cd(CONSTANTS.SPACE);
    setMmiSpclProc4Cd(CONSTANTS.SPACE);
    setMmiSpclProc5Cd(CONSTANTS.SPACE);
    setMmiSpclProc6Cd(CONSTANTS.SPACE);
    setMmiSpclProc7Cd(CONSTANTS.SPACE);
    setMmiSpclProc8Cd(CONSTANTS.SPACE);
    setMmiSpclProc9Cd(CONSTANTS.SPACE);
    setMmiSpclProc10Cd(CONSTANTS.SPACE);
    setMmiSrvcCatgyTblId(CONSTANTS.SPACE_3);
    setMmiSrvcCdNSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdPSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdTSetInd(CONSTANTS.SPACE);
    setMmiSviTblPriNbr(CONSTANTS.SPACE_6);
    setMmiTierLblInd(CONSTANTS.SPACE);
    setMmiTier1CopayAmt(BigDecimal.ZERO);
    setMmiTier1FamNewCoinsAmt(0);
    setMmiTier1LftmMaxAmt(0);
    setMmiTier1NewCoinsAmt(0);
    setMmiTier1UrgntCareAmt(BigDecimal.ZERO);
    setMmiTier1UrgntCareOopCd(CONSTANTS.SPACE);
    setMmiTravBenMktNbr(0);
    setMmiTravBenTblNbr(0);
    setMmiUhpCd(CONSTANTS.SPACE);
    setMmiUrgntCareAmt(BigDecimal.ZERO);
    setMmiVarPrdFct((short) 0);
    setMmiXtraTerrStMandInd(CONSTANTS.SPACE);
    setMmiRsnCustyPrdCd(CONSTANTS.SPACE);
    setMmiDfltChrgPct(BigDecimal.ZERO);
    setMmiFaclShrSvCd(CONSTANTS.SPACE);
    setMmiPhysnShrSvCd(CONSTANTS.SPACE);
    setMmiCptnXclsInd(CONSTANTS.SPACE);
    setMmiObsolete1(CONSTANTS.SPACE_4);
    setMmiNewCoinsAccumCd(CONSTANTS.SPACE);
    setMmiErisaInd(CONSTANTS.SPACE);
    setMmiBhvHlthVendCd(CONSTANTS.SPACE);
    setMmiEapVendCd(CONSTANTS.SPACE);
    setMmiVisnCd(CONSTANTS.SPACE);
    setMmiFaclClmEdtInd(CONSTANTS.SPACE);
    setMmiPlnFturCd(CONSTANTS.SPACE_2);
    setMmiFundTypCd(CONSTANTS.SPACE);
    setMmiRxSbscrIdTypCd(CONSTANTS.SPACE);
    setMmiPrdctCdId(CONSTANTS.SPACE_4);
    setMmiEnrpEmrgFaclInd(CONSTANTS.SPACE);
    setMmiEmergentWrpInd(CONSTANTS.SPACE);
    setMmiOopMaxCovCd(CONSTANTS.SPACE);
    setMmiOncPolPrtcpCd(CONSTANTS.SPACE);
    setMmiPlnFturInd(CONSTANTS.SPACE);
    setMmiSrvcCdASetInd(CONSTANTS.SPACE);
    setMmiSrvcCdBSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdCSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdDSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdESetInd(CONSTANTS.SPACE);
    setMmiSrvcCdFSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdGSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdHSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdISetInd(CONSTANTS.SPACE);
    setMmiSrvcCdJSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdKSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdLSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdMSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdOSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdQSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdRSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdSSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdUSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdVSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdWSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdXSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdYSetInd(CONSTANTS.SPACE);
    setMmiSrvcCdZSetInd(CONSTANTS.SPACE);
    setMmiNonEmbdCopayCd(CONSTANTS.SPACE);
    setMmiNonEmbdCoreOopCd(CONSTANTS.SPACE);
    setMmiNewCoinsDedTypCd(CONSTANTS.SPACE);
    setMmiNewCoinsIndvMinPct(BigDecimal.ZERO);
    setMmiNewCoinsIndvMaxPct(BigDecimal.ZERO);
    setMmiNonEmbdNewCoinsCd(CONSTANTS.SPACE);
    setMmiNonEmbdCoreDedCd(CONSTANTS.SPACE);
    setMmiIndvOopCd(CONSTANTS.SPACE);
    setMmiIndvPrdCd(CONSTANTS.SPACE);
    setMmiIndvSalryTypCd(CONSTANTS.SPACE);
    setMmiFamSalryTypCd(CONSTANTS.SPACE);
    setMmiFamMultPct(BigDecimal.ZERO);
    setMmiFamVal(CONSTANTS.SPACE);
    setMmiXapplyOopCd(CONSTANTS.SPACE);
    setMmiIndvCopayCaroCd(CONSTANTS.SPACE);
    setMmiXapplyCopayCd(CONSTANTS.SPACE);
    setMmiCoreOopNcapInd(CONSTANTS.SPACE);
    setMmiMnnrpLabPct(BigDecimal.ZERO);
    setMmiMnnrpDmePct(BigDecimal.ZERO);
    setMmiOonLftmMaxAmt(0);
    setMmiBusSegPltfm(CONSTANTS.SPACE_3);
    setMmiSviTblTerNbr(CONSTANTS.SPACE_6);
    setMmiRelSrvcInd(CONSTANTS.SPACE);
    setMmiCoreMedPrrAuthCd(CONSTANTS.SPACE);
    setMmiPcpBenLvlRule(CONSTANTS.SPACE);
    setMmiMcrCd(CONSTANTS.SPACE);
    setMmiLmtSrvcCd(CONSTANTS.SPACE);
    setMmiEligXrefCd(CONSTANTS.SPACE);
    setMmiBenMaxAuralCiPriCd(CONSTANTS.SPACE);
    setMmiBenMaxAuralCiPriCnt((short) 0);
    setMmiBenMaxAuralCiSecCd(CONSTANTS.SPACE);
    setMmiBenMaxAuralCiSecCnt((short) 0);
    setMmiBenMaxCogTrpyPriCd(CONSTANTS.SPACE);
    setMmiBenMaxCogTrpyPriCnt((short) 0);
    setMmiBenMaxCogTrpySecCd(CONSTANTS.SPACE);
    setMmiBenMaxCogTrpySecCnt((short) 0);
    setMmiBenMaxCogTrpyExclCd(CONSTANTS.SPACE);
    setMmiBenMaxEhbSpneRhabCnt((short) 0);
    setMmiBenMaxEhbSpneHabCnt((short) 0);
    setMmiBenMaxEhbPtRhabCnt((short) 0);
    setMmiBenMaxEhbPtHabCnt((short) 0);
    setMmiBenMaxEhbSpchRhabCnt((short) 0);
    setMmiBenMaxEhbSpchHabCnt((short) 0);
    setMmiBenMaxEhbCrdcRhabCnt((short) 0);
    setMmiBenMaxEhbOtRhabCnt((short) 0);
    setMmiBenMaxEhbOtHabCnt((short) 0);
    setMmiBenMaxEhbPlmryRhabCnt((short) 0);
    setMmiBenMaxEhbAuralRhabCnt((short) 0);
    setMmiBenMaxEhbAuralHabCnt((short) 0);
    setMmiBenMaxEhbCogRhabCnt((short) 0);
    setMmiBenMaxEhbCogHabCnt((short) 0);
    setMmiBenMaxEhbPostRhabCnt((short) 0);
    setMmiBenMaxEhbPostHabCnt((short) 0);
    setMmiBenMaxEhbPtotRhabCnt((short) 0);
    setMmiBenMaxEhbPtotHabCnt((short) 0);
    setMmiBenMaxEhbRhabRmrkCd(CONSTANTS.SPACE_3);
    setMmiBenMaxEhbPosmRhabCnt((short) 0);
    setMmiBenMaxEhbPosmHabCnt((short) 0);
    setMmiBenMaxEhbHabRmrkCd(CONSTANTS.SPACE_3);
    setMmiBenPhysMedcnPrdCd(CONSTANTS.SPACE);
    setMmiBenAutsmAgeYrFrVal((short) 0);
    setMmiBenAutsmAgeYrToVal((short) 0);
    setMmiBenAutsmPostCd(CONSTANTS.SPACE);
    setMmiBenAutsmAllCd(CONSTANTS.SPACE);
    setMmiBenMaxPlmryRehbPriCd(CONSTANTS.SPACE);
    setMmiBenMaxPlmryRehbSecCd(CONSTANTS.SPACE);
    setMmiBenMaxPlmryRehbSecCnt((short) 0);
    setMmiSiteSrvcPrtcpCd(CONSTANTS.SPACE);
    setMmiBenAutsm2AgeYrFrVal((short) 0);
    setMmiBenAutsm2AgeYrToVal((short) 0);
    setMmiBenAutsm2PostCd(CONSTANTS.SPACE);
    setMmiBenAutsm2AllCd(CONSTANTS.SPACE);
  }

  public static int getDclpolPlnMstrFieldLength() {
    return DCLPOL_PLN_MSTR_LENGTH;
  }
}
