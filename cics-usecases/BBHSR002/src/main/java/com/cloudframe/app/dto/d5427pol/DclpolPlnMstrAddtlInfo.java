package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstrAddtlInfo is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclpolPlnMstrAddtlInfo extends DclpolPlnMstrAddtlInfoSerialized {

  private char[] mmaGenTstPolPrtcpCd = Field.fillLowValue(1);

  private char[] mmaNhpNtwkFlexInd = Field.fillLowValue(1);

  private char[] mmaNptRulePkgId = Field.fillLowValue(6);

  private char[] mmaRiskClsCd = Field.fillLowValue(1);

  private char[] mmaSiteCareProcCd = Field.fillLowValue(1);

  private char[] mmaPrefLabNtwkInd = Field.fillLowValue(1);

  private char[] mmaSecOpinVendCd = Field.fillLowValue(1);

  private char[] mmaRhabCombPtLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombOtLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombStLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombSmLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombCiLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombCtLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombCrLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombPrLmtCd = Field.fillLowValue(1);

  private char[] mmaRhabCombMtLmtCd = Field.fillLowValue(1);

  private char[] mmaHabCombPtLmtCd = Field.fillLowValue(1);

  private char[] mmaHabCombOtLmtCd = Field.fillLowValue(1);

  private char[] mmaHabCombStLmtCd = Field.fillLowValue(1);

  private char[] mmaHabCombSmLmtCd = Field.fillLowValue(1);

  private char[] mmaHabCombCiLmtCd = Field.fillLowValue(1);

  private char[] mmaHabCombCtLmtCd = Field.fillLowValue(1);

  private char[] mmaHabCombMtLmtCd = Field.fillLowValue(1);

  private char[] mmaPhrmCpnInd = Field.fillLowValue(1);

  private char[] mmaSpclRxInd = Field.fillLowValue(1);

  private char[] mmaDesgDiagProvCd = Field.fillLowValue(1);

  private char[] mmaUgiInd = Field.fillLowValue(1);

  private char[] mmaLgiInd = Field.fillLowValue(1);

  private char[] mmaExdInd = Field.fillLowValue(1);

  private char[] mmaMedCpnCd = Field.fillLowValue(1);

  /** Constructor for DclpolPlnMstrAddtlInfo */
  public DclpolPlnMstrAddtlInfo() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of mmaGenTstPolPrtcpCd
   *
   * @return mmaGenTstPolPrtcpCd
   */
  public char[] getMmaGenTstPolPrtcpCd() throws CFException {
    if (isMmaGenTstPolPrtcpCdModified()) {
      mmaGenTstPolPrtcpCd = refreshMmaGenTstPolPrtcpCd();
    }
    return mmaGenTstPolPrtcpCd;
  }

  /**
   * set variable mmaGenTstPolPrtcpCd Corresponding COBOL Variable is MMA-GEN-TST-POL-PRTCP-CD
   *
   * @param value
   */
  public void setMmaGenTstPolPrtcpCd(char[] value) {
    mmaGenTstPolPrtcpCd = checkMmaGenTstPolPrtcpCdConstraints(value);
    serializeMmaGenTstPolPrtcpCd(mmaGenTstPolPrtcpCd);
  }

  /**
   * Update MmaGenTstPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaGenTstPolPrtcpCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginMmaGenTstPolPrtcpCd, mmaGenTstPolPrtcpCd.length);
  }

  public void setMmaGenTstPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaGenTstPolPrtcpCd, mmaGenTstPolPrtcpCd.length);
  }

  /**
   * Update MmaGenTstPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaGenTstPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaGenTstPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update MmaGenTstPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setMmaGenTstPolPrtcpCd(Field source) {
    replace(source, 0, source.length(), beginMmaGenTstPolPrtcpCd, MMA_GEN_TST_POL_PRTCP_CD_LEN);
  }

  /**
   * Update MmaGenTstPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaGenTstPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaGenTstPolPrtcpCd, MMA_GEN_TST_POL_PRTCP_CD_LEN);
  }

  /**
   * Update MmaGenTstPolPrtcpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaGenTstPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaGenTstPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaNhpNtwkFlexInd
   *
   * @return mmaNhpNtwkFlexInd
   */
  public char[] getMmaNhpNtwkFlexInd() throws CFException {
    if (isMmaNhpNtwkFlexIndModified()) {
      mmaNhpNtwkFlexInd = refreshMmaNhpNtwkFlexInd();
    }
    return mmaNhpNtwkFlexInd;
  }

  /**
   * set variable mmaNhpNtwkFlexInd Corresponding COBOL Variable is MMA-NHP-NTWK-FLEX-IND
   *
   * @param value
   */
  public void setMmaNhpNtwkFlexInd(char[] value) {
    mmaNhpNtwkFlexInd = checkMmaNhpNtwkFlexIndConstraints(value);
    serializeMmaNhpNtwkFlexInd(mmaNhpNtwkFlexInd);
  }

  /**
   * Update MmaNhpNtwkFlexInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaNhpNtwkFlexInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaNhpNtwkFlexInd, mmaNhpNtwkFlexInd.length);
  }

  public void setMmaNhpNtwkFlexInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNhpNtwkFlexInd, mmaNhpNtwkFlexInd.length);
  }

  /**
   * Update MmaNhpNtwkFlexInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaNhpNtwkFlexInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNhpNtwkFlexInd + targetIndex, targetLen);
  }

  /**
   * Update MmaNhpNtwkFlexInd with another Field
   *
   * @param value
   */
  public void setMmaNhpNtwkFlexInd(Field source) {
    replace(source, 0, source.length(), beginMmaNhpNtwkFlexInd, MMA_NHP_NTWK_FLEX_IND_LEN);
  }

  /**
   * Update MmaNhpNtwkFlexInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaNhpNtwkFlexInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNhpNtwkFlexInd, MMA_NHP_NTWK_FLEX_IND_LEN);
  }

  /**
   * Update MmaNhpNtwkFlexInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaNhpNtwkFlexInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNhpNtwkFlexInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaNptRulePkgId
   *
   * @return mmaNptRulePkgId
   */
  public char[] getMmaNptRulePkgId() throws CFException {
    if (isMmaNptRulePkgIdModified()) {
      mmaNptRulePkgId = refreshMmaNptRulePkgId();
    }
    return mmaNptRulePkgId;
  }

  /**
   * set variable mmaNptRulePkgId Corresponding COBOL Variable is MMA-NPT-RULE-PKG-ID
   *
   * @param value
   */
  public void setMmaNptRulePkgId(char[] value) {
    mmaNptRulePkgId = checkMmaNptRulePkgIdConstraints(value);
    serializeMmaNptRulePkgId(mmaNptRulePkgId);
  }

  /**
   * Update MmaNptRulePkgId with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaNptRulePkgId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaNptRulePkgId, mmaNptRulePkgId.length);
  }

  public void setMmaNptRulePkgId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNptRulePkgId, mmaNptRulePkgId.length);
  }

  /**
   * Update MmaNptRulePkgId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaNptRulePkgId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNptRulePkgId + targetIndex, targetLen);
  }

  /**
   * Update MmaNptRulePkgId with another Field
   *
   * @param value
   */
  public void setMmaNptRulePkgId(Field source) {
    replace(source, 0, source.length(), beginMmaNptRulePkgId, MMA_NPT_RULE_PKG_ID_LEN);
  }

  /**
   * Update MmaNptRulePkgId with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaNptRulePkgId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNptRulePkgId, MMA_NPT_RULE_PKG_ID_LEN);
  }

  /**
   * Update MmaNptRulePkgId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaNptRulePkgId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaNptRulePkgId + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRiskClsCd
   *
   * @return mmaRiskClsCd
   */
  public char[] getMmaRiskClsCd() throws CFException {
    if (isMmaRiskClsCdModified()) {
      mmaRiskClsCd = refreshMmaRiskClsCd();
    }
    return mmaRiskClsCd;
  }

  /**
   * set variable mmaRiskClsCd Corresponding COBOL Variable is MMA-RISK-CLS-CD
   *
   * @param value
   */
  public void setMmaRiskClsCd(char[] value) {
    mmaRiskClsCd = checkMmaRiskClsCdConstraints(value);
    serializeMmaRiskClsCd(mmaRiskClsCd);
  }

  /**
   * Update MmaRiskClsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRiskClsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRiskClsCd, mmaRiskClsCd.length);
  }

  public void setMmaRiskClsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRiskClsCd, mmaRiskClsCd.length);
  }

  /**
   * Update MmaRiskClsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRiskClsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRiskClsCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRiskClsCd with another Field
   *
   * @param value
   */
  public void setMmaRiskClsCd(Field source) {
    replace(source, 0, source.length(), beginMmaRiskClsCd, MMA_RISK_CLS_CD_LEN);
  }

  /**
   * Update MmaRiskClsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRiskClsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRiskClsCd, MMA_RISK_CLS_CD_LEN);
  }

  /**
   * Update MmaRiskClsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRiskClsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRiskClsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaSiteCareProcCd
   *
   * @return mmaSiteCareProcCd
   */
  public char[] getMmaSiteCareProcCd() throws CFException {
    if (isMmaSiteCareProcCdModified()) {
      mmaSiteCareProcCd = refreshMmaSiteCareProcCd();
    }
    return mmaSiteCareProcCd;
  }

  /**
   * set variable mmaSiteCareProcCd Corresponding COBOL Variable is MMA-SITE-CARE-PROC-CD
   *
   * @param value
   */
  public void setMmaSiteCareProcCd(char[] value) {
    mmaSiteCareProcCd = checkMmaSiteCareProcCdConstraints(value);
    serializeMmaSiteCareProcCd(mmaSiteCareProcCd);
  }

  /**
   * Update MmaSiteCareProcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaSiteCareProcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaSiteCareProcCd, mmaSiteCareProcCd.length);
  }

  public void setMmaSiteCareProcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSiteCareProcCd, mmaSiteCareProcCd.length);
  }

  /**
   * Update MmaSiteCareProcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaSiteCareProcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSiteCareProcCd + targetIndex, targetLen);
  }

  /**
   * Update MmaSiteCareProcCd with another Field
   *
   * @param value
   */
  public void setMmaSiteCareProcCd(Field source) {
    replace(source, 0, source.length(), beginMmaSiteCareProcCd, MMA_SITE_CARE_PROC_CD_LEN);
  }

  /**
   * Update MmaSiteCareProcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaSiteCareProcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSiteCareProcCd, MMA_SITE_CARE_PROC_CD_LEN);
  }

  /**
   * Update MmaSiteCareProcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaSiteCareProcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSiteCareProcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaPrefLabNtwkInd
   *
   * @return mmaPrefLabNtwkInd
   */
  public char[] getMmaPrefLabNtwkInd() throws CFException {
    if (isMmaPrefLabNtwkIndModified()) {
      mmaPrefLabNtwkInd = refreshMmaPrefLabNtwkInd();
    }
    return mmaPrefLabNtwkInd;
  }

  /**
   * set variable mmaPrefLabNtwkInd Corresponding COBOL Variable is MMA-PREF-LAB-NTWK-IND
   *
   * @param value
   */
  public void setMmaPrefLabNtwkInd(char[] value) {
    mmaPrefLabNtwkInd = checkMmaPrefLabNtwkIndConstraints(value);
    serializeMmaPrefLabNtwkInd(mmaPrefLabNtwkInd);
  }

  /**
   * Update MmaPrefLabNtwkInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaPrefLabNtwkInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaPrefLabNtwkInd, mmaPrefLabNtwkInd.length);
  }

  public void setMmaPrefLabNtwkInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPrefLabNtwkInd, mmaPrefLabNtwkInd.length);
  }

  /**
   * Update MmaPrefLabNtwkInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaPrefLabNtwkInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPrefLabNtwkInd + targetIndex, targetLen);
  }

  /**
   * Update MmaPrefLabNtwkInd with another Field
   *
   * @param value
   */
  public void setMmaPrefLabNtwkInd(Field source) {
    replace(source, 0, source.length(), beginMmaPrefLabNtwkInd, MMA_PREF_LAB_NTWK_IND_LEN);
  }

  /**
   * Update MmaPrefLabNtwkInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaPrefLabNtwkInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPrefLabNtwkInd, MMA_PREF_LAB_NTWK_IND_LEN);
  }

  /**
   * Update MmaPrefLabNtwkInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaPrefLabNtwkInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPrefLabNtwkInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaSecOpinVendCd
   *
   * @return mmaSecOpinVendCd
   */
  public char[] getMmaSecOpinVendCd() throws CFException {
    if (isMmaSecOpinVendCdModified()) {
      mmaSecOpinVendCd = refreshMmaSecOpinVendCd();
    }
    return mmaSecOpinVendCd;
  }

  /**
   * set variable mmaSecOpinVendCd Corresponding COBOL Variable is MMA-SEC-OPIN-VEND-CD
   *
   * @param value
   */
  public void setMmaSecOpinVendCd(char[] value) {
    mmaSecOpinVendCd = checkMmaSecOpinVendCdConstraints(value);
    serializeMmaSecOpinVendCd(mmaSecOpinVendCd);
  }

  /**
   * Update MmaSecOpinVendCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaSecOpinVendCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaSecOpinVendCd, mmaSecOpinVendCd.length);
  }

  public void setMmaSecOpinVendCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSecOpinVendCd, mmaSecOpinVendCd.length);
  }

  /**
   * Update MmaSecOpinVendCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaSecOpinVendCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSecOpinVendCd + targetIndex, targetLen);
  }

  /**
   * Update MmaSecOpinVendCd with another Field
   *
   * @param value
   */
  public void setMmaSecOpinVendCd(Field source) {
    replace(source, 0, source.length(), beginMmaSecOpinVendCd, MMA_SEC_OPIN_VEND_CD_LEN);
  }

  /**
   * Update MmaSecOpinVendCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaSecOpinVendCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSecOpinVendCd, MMA_SEC_OPIN_VEND_CD_LEN);
  }

  /**
   * Update MmaSecOpinVendCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaSecOpinVendCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSecOpinVendCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombPtLmtCd
   *
   * @return mmaRhabCombPtLmtCd
   */
  public char[] getMmaRhabCombPtLmtCd() throws CFException {
    if (isMmaRhabCombPtLmtCdModified()) {
      mmaRhabCombPtLmtCd = refreshMmaRhabCombPtLmtCd();
    }
    return mmaRhabCombPtLmtCd;
  }

  /**
   * set variable mmaRhabCombPtLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-PT-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombPtLmtCd(char[] value) {
    mmaRhabCombPtLmtCd = checkMmaRhabCombPtLmtCdConstraints(value);
    serializeMmaRhabCombPtLmtCd(mmaRhabCombPtLmtCd);
  }

  /**
   * Update MmaRhabCombPtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombPtLmtCd, mmaRhabCombPtLmtCd.length);
  }

  public void setMmaRhabCombPtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPtLmtCd, mmaRhabCombPtLmtCd.length);
  }

  /**
   * Update MmaRhabCombPtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombPtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombPtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombPtLmtCd, MMA_RHAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombPtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPtLmtCd, MMA_RHAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombPtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombOtLmtCd
   *
   * @return mmaRhabCombOtLmtCd
   */
  public char[] getMmaRhabCombOtLmtCd() throws CFException {
    if (isMmaRhabCombOtLmtCdModified()) {
      mmaRhabCombOtLmtCd = refreshMmaRhabCombOtLmtCd();
    }
    return mmaRhabCombOtLmtCd;
  }

  /**
   * set variable mmaRhabCombOtLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-OT-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombOtLmtCd(char[] value) {
    mmaRhabCombOtLmtCd = checkMmaRhabCombOtLmtCdConstraints(value);
    serializeMmaRhabCombOtLmtCd(mmaRhabCombOtLmtCd);
  }

  /**
   * Update MmaRhabCombOtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombOtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombOtLmtCd, mmaRhabCombOtLmtCd.length);
  }

  public void setMmaRhabCombOtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombOtLmtCd, mmaRhabCombOtLmtCd.length);
  }

  /**
   * Update MmaRhabCombOtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombOtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombOtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombOtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombOtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombOtLmtCd, MMA_RHAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombOtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombOtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombOtLmtCd, MMA_RHAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombOtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombOtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombOtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombStLmtCd
   *
   * @return mmaRhabCombStLmtCd
   */
  public char[] getMmaRhabCombStLmtCd() throws CFException {
    if (isMmaRhabCombStLmtCdModified()) {
      mmaRhabCombStLmtCd = refreshMmaRhabCombStLmtCd();
    }
    return mmaRhabCombStLmtCd;
  }

  /**
   * set variable mmaRhabCombStLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-ST-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombStLmtCd(char[] value) {
    mmaRhabCombStLmtCd = checkMmaRhabCombStLmtCdConstraints(value);
    serializeMmaRhabCombStLmtCd(mmaRhabCombStLmtCd);
  }

  /**
   * Update MmaRhabCombStLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombStLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombStLmtCd, mmaRhabCombStLmtCd.length);
  }

  public void setMmaRhabCombStLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombStLmtCd, mmaRhabCombStLmtCd.length);
  }

  /**
   * Update MmaRhabCombStLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombStLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombStLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombStLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombStLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombStLmtCd, MMA_RHAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombStLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombStLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombStLmtCd, MMA_RHAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombStLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombStLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombStLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombSmLmtCd
   *
   * @return mmaRhabCombSmLmtCd
   */
  public char[] getMmaRhabCombSmLmtCd() throws CFException {
    if (isMmaRhabCombSmLmtCdModified()) {
      mmaRhabCombSmLmtCd = refreshMmaRhabCombSmLmtCd();
    }
    return mmaRhabCombSmLmtCd;
  }

  /**
   * set variable mmaRhabCombSmLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-SM-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombSmLmtCd(char[] value) {
    mmaRhabCombSmLmtCd = checkMmaRhabCombSmLmtCdConstraints(value);
    serializeMmaRhabCombSmLmtCd(mmaRhabCombSmLmtCd);
  }

  /**
   * Update MmaRhabCombSmLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombSmLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombSmLmtCd, mmaRhabCombSmLmtCd.length);
  }

  public void setMmaRhabCombSmLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombSmLmtCd, mmaRhabCombSmLmtCd.length);
  }

  /**
   * Update MmaRhabCombSmLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombSmLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombSmLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombSmLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombSmLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombSmLmtCd, MMA_RHAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombSmLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombSmLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombSmLmtCd, MMA_RHAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombSmLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombSmLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombSmLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombCiLmtCd
   *
   * @return mmaRhabCombCiLmtCd
   */
  public char[] getMmaRhabCombCiLmtCd() throws CFException {
    if (isMmaRhabCombCiLmtCdModified()) {
      mmaRhabCombCiLmtCd = refreshMmaRhabCombCiLmtCd();
    }
    return mmaRhabCombCiLmtCd;
  }

  /**
   * set variable mmaRhabCombCiLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-CI-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombCiLmtCd(char[] value) {
    mmaRhabCombCiLmtCd = checkMmaRhabCombCiLmtCdConstraints(value);
    serializeMmaRhabCombCiLmtCd(mmaRhabCombCiLmtCd);
  }

  /**
   * Update MmaRhabCombCiLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCiLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombCiLmtCd, mmaRhabCombCiLmtCd.length);
  }

  public void setMmaRhabCombCiLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCiLmtCd, mmaRhabCombCiLmtCd.length);
  }

  /**
   * Update MmaRhabCombCiLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCiLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCiLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombCiLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombCiLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombCiLmtCd, MMA_RHAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombCiLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCiLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCiLmtCd, MMA_RHAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombCiLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCiLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCiLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombCtLmtCd
   *
   * @return mmaRhabCombCtLmtCd
   */
  public char[] getMmaRhabCombCtLmtCd() throws CFException {
    if (isMmaRhabCombCtLmtCdModified()) {
      mmaRhabCombCtLmtCd = refreshMmaRhabCombCtLmtCd();
    }
    return mmaRhabCombCtLmtCd;
  }

  /**
   * set variable mmaRhabCombCtLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-CT-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombCtLmtCd(char[] value) {
    mmaRhabCombCtLmtCd = checkMmaRhabCombCtLmtCdConstraints(value);
    serializeMmaRhabCombCtLmtCd(mmaRhabCombCtLmtCd);
  }

  /**
   * Update MmaRhabCombCtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombCtLmtCd, mmaRhabCombCtLmtCd.length);
  }

  public void setMmaRhabCombCtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCtLmtCd, mmaRhabCombCtLmtCd.length);
  }

  /**
   * Update MmaRhabCombCtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombCtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombCtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombCtLmtCd, MMA_RHAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombCtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCtLmtCd, MMA_RHAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombCtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombCrLmtCd
   *
   * @return mmaRhabCombCrLmtCd
   */
  public char[] getMmaRhabCombCrLmtCd() throws CFException {
    if (isMmaRhabCombCrLmtCdModified()) {
      mmaRhabCombCrLmtCd = refreshMmaRhabCombCrLmtCd();
    }
    return mmaRhabCombCrLmtCd;
  }

  /**
   * set variable mmaRhabCombCrLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-CR-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombCrLmtCd(char[] value) {
    mmaRhabCombCrLmtCd = checkMmaRhabCombCrLmtCdConstraints(value);
    serializeMmaRhabCombCrLmtCd(mmaRhabCombCrLmtCd);
  }

  /**
   * Update MmaRhabCombCrLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCrLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombCrLmtCd, mmaRhabCombCrLmtCd.length);
  }

  public void setMmaRhabCombCrLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCrLmtCd, mmaRhabCombCrLmtCd.length);
  }

  /**
   * Update MmaRhabCombCrLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCrLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCrLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombCrLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombCrLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombCrLmtCd, MMA_RHAB_COMB_CR_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombCrLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCrLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCrLmtCd, MMA_RHAB_COMB_CR_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombCrLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombCrLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombCrLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombPrLmtCd
   *
   * @return mmaRhabCombPrLmtCd
   */
  public char[] getMmaRhabCombPrLmtCd() throws CFException {
    if (isMmaRhabCombPrLmtCdModified()) {
      mmaRhabCombPrLmtCd = refreshMmaRhabCombPrLmtCd();
    }
    return mmaRhabCombPrLmtCd;
  }

  /**
   * set variable mmaRhabCombPrLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-PR-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombPrLmtCd(char[] value) {
    mmaRhabCombPrLmtCd = checkMmaRhabCombPrLmtCdConstraints(value);
    serializeMmaRhabCombPrLmtCd(mmaRhabCombPrLmtCd);
  }

  /**
   * Update MmaRhabCombPrLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPrLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombPrLmtCd, mmaRhabCombPrLmtCd.length);
  }

  public void setMmaRhabCombPrLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPrLmtCd, mmaRhabCombPrLmtCd.length);
  }

  /**
   * Update MmaRhabCombPrLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPrLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPrLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombPrLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombPrLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombPrLmtCd, MMA_RHAB_COMB_PR_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombPrLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPrLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPrLmtCd, MMA_RHAB_COMB_PR_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombPrLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombPrLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombPrLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaRhabCombMtLmtCd
   *
   * @return mmaRhabCombMtLmtCd
   */
  public char[] getMmaRhabCombMtLmtCd() throws CFException {
    if (isMmaRhabCombMtLmtCdModified()) {
      mmaRhabCombMtLmtCd = refreshMmaRhabCombMtLmtCd();
    }
    return mmaRhabCombMtLmtCd;
  }

  /**
   * set variable mmaRhabCombMtLmtCd Corresponding COBOL Variable is MMA-RHAB-COMB-MT-LMT-CD
   *
   * @param value
   */
  public void setMmaRhabCombMtLmtCd(char[] value) {
    mmaRhabCombMtLmtCd = checkMmaRhabCombMtLmtCdConstraints(value);
    serializeMmaRhabCombMtLmtCd(mmaRhabCombMtLmtCd);
  }

  /**
   * Update MmaRhabCombMtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombMtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaRhabCombMtLmtCd, mmaRhabCombMtLmtCd.length);
  }

  public void setMmaRhabCombMtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombMtLmtCd, mmaRhabCombMtLmtCd.length);
  }

  /**
   * Update MmaRhabCombMtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombMtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombMtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaRhabCombMtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaRhabCombMtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaRhabCombMtLmtCd, MMA_RHAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombMtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombMtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombMtLmtCd, MMA_RHAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update MmaRhabCombMtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaRhabCombMtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaRhabCombMtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaHabCombPtLmtCd
   *
   * @return mmaHabCombPtLmtCd
   */
  public char[] getMmaHabCombPtLmtCd() throws CFException {
    if (isMmaHabCombPtLmtCdModified()) {
      mmaHabCombPtLmtCd = refreshMmaHabCombPtLmtCd();
    }
    return mmaHabCombPtLmtCd;
  }

  /**
   * set variable mmaHabCombPtLmtCd Corresponding COBOL Variable is MMA-HAB-COMB-PT-LMT-CD
   *
   * @param value
   */
  public void setMmaHabCombPtLmtCd(char[] value) {
    mmaHabCombPtLmtCd = checkMmaHabCombPtLmtCdConstraints(value);
    serializeMmaHabCombPtLmtCd(mmaHabCombPtLmtCd);
  }

  /**
   * Update MmaHabCombPtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombPtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaHabCombPtLmtCd, mmaHabCombPtLmtCd.length);
  }

  public void setMmaHabCombPtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombPtLmtCd, mmaHabCombPtLmtCd.length);
  }

  /**
   * Update MmaHabCombPtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombPtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombPtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaHabCombPtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaHabCombPtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaHabCombPtLmtCd, MMA_HAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombPtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombPtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombPtLmtCd, MMA_HAB_COMB_PT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombPtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombPtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombPtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaHabCombOtLmtCd
   *
   * @return mmaHabCombOtLmtCd
   */
  public char[] getMmaHabCombOtLmtCd() throws CFException {
    if (isMmaHabCombOtLmtCdModified()) {
      mmaHabCombOtLmtCd = refreshMmaHabCombOtLmtCd();
    }
    return mmaHabCombOtLmtCd;
  }

  /**
   * set variable mmaHabCombOtLmtCd Corresponding COBOL Variable is MMA-HAB-COMB-OT-LMT-CD
   *
   * @param value
   */
  public void setMmaHabCombOtLmtCd(char[] value) {
    mmaHabCombOtLmtCd = checkMmaHabCombOtLmtCdConstraints(value);
    serializeMmaHabCombOtLmtCd(mmaHabCombOtLmtCd);
  }

  /**
   * Update MmaHabCombOtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombOtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaHabCombOtLmtCd, mmaHabCombOtLmtCd.length);
  }

  public void setMmaHabCombOtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombOtLmtCd, mmaHabCombOtLmtCd.length);
  }

  /**
   * Update MmaHabCombOtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombOtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombOtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaHabCombOtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaHabCombOtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaHabCombOtLmtCd, MMA_HAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombOtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombOtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombOtLmtCd, MMA_HAB_COMB_OT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombOtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombOtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombOtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaHabCombStLmtCd
   *
   * @return mmaHabCombStLmtCd
   */
  public char[] getMmaHabCombStLmtCd() throws CFException {
    if (isMmaHabCombStLmtCdModified()) {
      mmaHabCombStLmtCd = refreshMmaHabCombStLmtCd();
    }
    return mmaHabCombStLmtCd;
  }

  /**
   * set variable mmaHabCombStLmtCd Corresponding COBOL Variable is MMA-HAB-COMB-ST-LMT-CD
   *
   * @param value
   */
  public void setMmaHabCombStLmtCd(char[] value) {
    mmaHabCombStLmtCd = checkMmaHabCombStLmtCdConstraints(value);
    serializeMmaHabCombStLmtCd(mmaHabCombStLmtCd);
  }

  /**
   * Update MmaHabCombStLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombStLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaHabCombStLmtCd, mmaHabCombStLmtCd.length);
  }

  public void setMmaHabCombStLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombStLmtCd, mmaHabCombStLmtCd.length);
  }

  /**
   * Update MmaHabCombStLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombStLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombStLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaHabCombStLmtCd with another Field
   *
   * @param value
   */
  public void setMmaHabCombStLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaHabCombStLmtCd, MMA_HAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombStLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombStLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombStLmtCd, MMA_HAB_COMB_ST_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombStLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombStLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombStLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaHabCombSmLmtCd
   *
   * @return mmaHabCombSmLmtCd
   */
  public char[] getMmaHabCombSmLmtCd() throws CFException {
    if (isMmaHabCombSmLmtCdModified()) {
      mmaHabCombSmLmtCd = refreshMmaHabCombSmLmtCd();
    }
    return mmaHabCombSmLmtCd;
  }

  /**
   * set variable mmaHabCombSmLmtCd Corresponding COBOL Variable is MMA-HAB-COMB-SM-LMT-CD
   *
   * @param value
   */
  public void setMmaHabCombSmLmtCd(char[] value) {
    mmaHabCombSmLmtCd = checkMmaHabCombSmLmtCdConstraints(value);
    serializeMmaHabCombSmLmtCd(mmaHabCombSmLmtCd);
  }

  /**
   * Update MmaHabCombSmLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombSmLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaHabCombSmLmtCd, mmaHabCombSmLmtCd.length);
  }

  public void setMmaHabCombSmLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombSmLmtCd, mmaHabCombSmLmtCd.length);
  }

  /**
   * Update MmaHabCombSmLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombSmLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombSmLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaHabCombSmLmtCd with another Field
   *
   * @param value
   */
  public void setMmaHabCombSmLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaHabCombSmLmtCd, MMA_HAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombSmLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombSmLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombSmLmtCd, MMA_HAB_COMB_SM_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombSmLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombSmLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombSmLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaHabCombCiLmtCd
   *
   * @return mmaHabCombCiLmtCd
   */
  public char[] getMmaHabCombCiLmtCd() throws CFException {
    if (isMmaHabCombCiLmtCdModified()) {
      mmaHabCombCiLmtCd = refreshMmaHabCombCiLmtCd();
    }
    return mmaHabCombCiLmtCd;
  }

  /**
   * set variable mmaHabCombCiLmtCd Corresponding COBOL Variable is MMA-HAB-COMB-CI-LMT-CD
   *
   * @param value
   */
  public void setMmaHabCombCiLmtCd(char[] value) {
    mmaHabCombCiLmtCd = checkMmaHabCombCiLmtCdConstraints(value);
    serializeMmaHabCombCiLmtCd(mmaHabCombCiLmtCd);
  }

  /**
   * Update MmaHabCombCiLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCiLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaHabCombCiLmtCd, mmaHabCombCiLmtCd.length);
  }

  public void setMmaHabCombCiLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCiLmtCd, mmaHabCombCiLmtCd.length);
  }

  /**
   * Update MmaHabCombCiLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCiLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCiLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaHabCombCiLmtCd with another Field
   *
   * @param value
   */
  public void setMmaHabCombCiLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaHabCombCiLmtCd, MMA_HAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombCiLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCiLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCiLmtCd, MMA_HAB_COMB_CI_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombCiLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCiLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCiLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaHabCombCtLmtCd
   *
   * @return mmaHabCombCtLmtCd
   */
  public char[] getMmaHabCombCtLmtCd() throws CFException {
    if (isMmaHabCombCtLmtCdModified()) {
      mmaHabCombCtLmtCd = refreshMmaHabCombCtLmtCd();
    }
    return mmaHabCombCtLmtCd;
  }

  /**
   * set variable mmaHabCombCtLmtCd Corresponding COBOL Variable is MMA-HAB-COMB-CT-LMT-CD
   *
   * @param value
   */
  public void setMmaHabCombCtLmtCd(char[] value) {
    mmaHabCombCtLmtCd = checkMmaHabCombCtLmtCdConstraints(value);
    serializeMmaHabCombCtLmtCd(mmaHabCombCtLmtCd);
  }

  /**
   * Update MmaHabCombCtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaHabCombCtLmtCd, mmaHabCombCtLmtCd.length);
  }

  public void setMmaHabCombCtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCtLmtCd, mmaHabCombCtLmtCd.length);
  }

  /**
   * Update MmaHabCombCtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaHabCombCtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaHabCombCtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaHabCombCtLmtCd, MMA_HAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombCtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCtLmtCd, MMA_HAB_COMB_CT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombCtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombCtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombCtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaHabCombMtLmtCd
   *
   * @return mmaHabCombMtLmtCd
   */
  public char[] getMmaHabCombMtLmtCd() throws CFException {
    if (isMmaHabCombMtLmtCdModified()) {
      mmaHabCombMtLmtCd = refreshMmaHabCombMtLmtCd();
    }
    return mmaHabCombMtLmtCd;
  }

  /**
   * set variable mmaHabCombMtLmtCd Corresponding COBOL Variable is MMA-HAB-COMB-MT-LMT-CD
   *
   * @param value
   */
  public void setMmaHabCombMtLmtCd(char[] value) {
    mmaHabCombMtLmtCd = checkMmaHabCombMtLmtCdConstraints(value);
    serializeMmaHabCombMtLmtCd(mmaHabCombMtLmtCd);
  }

  /**
   * Update MmaHabCombMtLmtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombMtLmtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaHabCombMtLmtCd, mmaHabCombMtLmtCd.length);
  }

  public void setMmaHabCombMtLmtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombMtLmtCd, mmaHabCombMtLmtCd.length);
  }

  /**
   * Update MmaHabCombMtLmtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombMtLmtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombMtLmtCd + targetIndex, targetLen);
  }

  /**
   * Update MmaHabCombMtLmtCd with another Field
   *
   * @param value
   */
  public void setMmaHabCombMtLmtCd(Field source) {
    replace(source, 0, source.length(), beginMmaHabCombMtLmtCd, MMA_HAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombMtLmtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaHabCombMtLmtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombMtLmtCd, MMA_HAB_COMB_MT_LMT_CD_LEN);
  }

  /**
   * Update MmaHabCombMtLmtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaHabCombMtLmtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaHabCombMtLmtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaPhrmCpnInd
   *
   * @return mmaPhrmCpnInd
   */
  public char[] getMmaPhrmCpnInd() throws CFException {
    if (isMmaPhrmCpnIndModified()) {
      mmaPhrmCpnInd = refreshMmaPhrmCpnInd();
    }
    return mmaPhrmCpnInd;
  }

  /**
   * set variable mmaPhrmCpnInd Corresponding COBOL Variable is MMA-PHRM-CPN-IND
   *
   * @param value
   */
  public void setMmaPhrmCpnInd(char[] value) {
    mmaPhrmCpnInd = checkMmaPhrmCpnIndConstraints(value);
    serializeMmaPhrmCpnInd(mmaPhrmCpnInd);
  }

  /**
   * Update MmaPhrmCpnInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaPhrmCpnInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaPhrmCpnInd, mmaPhrmCpnInd.length);
  }

  public void setMmaPhrmCpnInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPhrmCpnInd, mmaPhrmCpnInd.length);
  }

  /**
   * Update MmaPhrmCpnInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaPhrmCpnInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPhrmCpnInd + targetIndex, targetLen);
  }

  /**
   * Update MmaPhrmCpnInd with another Field
   *
   * @param value
   */
  public void setMmaPhrmCpnInd(Field source) {
    replace(source, 0, source.length(), beginMmaPhrmCpnInd, MMA_PHRM_CPN_IND_LEN);
  }

  /**
   * Update MmaPhrmCpnInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaPhrmCpnInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPhrmCpnInd, MMA_PHRM_CPN_IND_LEN);
  }

  /**
   * Update MmaPhrmCpnInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaPhrmCpnInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaPhrmCpnInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaSpclRxInd
   *
   * @return mmaSpclRxInd
   */
  public char[] getMmaSpclRxInd() throws CFException {
    if (isMmaSpclRxIndModified()) {
      mmaSpclRxInd = refreshMmaSpclRxInd();
    }
    return mmaSpclRxInd;
  }

  /**
   * set variable mmaSpclRxInd Corresponding COBOL Variable is MMA-SPCL-RX-IND
   *
   * @param value
   */
  public void setMmaSpclRxInd(char[] value) {
    mmaSpclRxInd = checkMmaSpclRxIndConstraints(value);
    serializeMmaSpclRxInd(mmaSpclRxInd);
  }

  /**
   * Update MmaSpclRxInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaSpclRxInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaSpclRxInd, mmaSpclRxInd.length);
  }

  public void setMmaSpclRxInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSpclRxInd, mmaSpclRxInd.length);
  }

  /**
   * Update MmaSpclRxInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaSpclRxInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSpclRxInd + targetIndex, targetLen);
  }

  /**
   * Update MmaSpclRxInd with another Field
   *
   * @param value
   */
  public void setMmaSpclRxInd(Field source) {
    replace(source, 0, source.length(), beginMmaSpclRxInd, MMA_SPCL_RX_IND_LEN);
  }

  /**
   * Update MmaSpclRxInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaSpclRxInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSpclRxInd, MMA_SPCL_RX_IND_LEN);
  }

  /**
   * Update MmaSpclRxInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaSpclRxInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaSpclRxInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaDesgDiagProvCd
   *
   * @return mmaDesgDiagProvCd
   */
  public char[] getMmaDesgDiagProvCd() throws CFException {
    if (isMmaDesgDiagProvCdModified()) {
      mmaDesgDiagProvCd = refreshMmaDesgDiagProvCd();
    }
    return mmaDesgDiagProvCd;
  }

  /**
   * set variable mmaDesgDiagProvCd Corresponding COBOL Variable is MMA-DESG-DIAG-PROV-CD
   *
   * @param value
   */
  public void setMmaDesgDiagProvCd(char[] value) {
    mmaDesgDiagProvCd = checkMmaDesgDiagProvCdConstraints(value);
    serializeMmaDesgDiagProvCd(mmaDesgDiagProvCd);
  }

  /**
   * Update MmaDesgDiagProvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaDesgDiagProvCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaDesgDiagProvCd, mmaDesgDiagProvCd.length);
  }

  public void setMmaDesgDiagProvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaDesgDiagProvCd, mmaDesgDiagProvCd.length);
  }

  /**
   * Update MmaDesgDiagProvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaDesgDiagProvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaDesgDiagProvCd + targetIndex, targetLen);
  }

  /**
   * Update MmaDesgDiagProvCd with another Field
   *
   * @param value
   */
  public void setMmaDesgDiagProvCd(Field source) {
    replace(source, 0, source.length(), beginMmaDesgDiagProvCd, MMA_DESG_DIAG_PROV_CD_LEN);
  }

  /**
   * Update MmaDesgDiagProvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaDesgDiagProvCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaDesgDiagProvCd, MMA_DESG_DIAG_PROV_CD_LEN);
  }

  /**
   * Update MmaDesgDiagProvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaDesgDiagProvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaDesgDiagProvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaUgiInd
   *
   * @return mmaUgiInd
   */
  public char[] getMmaUgiInd() throws CFException {
    if (isMmaUgiIndModified()) {
      mmaUgiInd = refreshMmaUgiInd();
    }
    return mmaUgiInd;
  }

  /**
   * set variable mmaUgiInd Corresponding COBOL Variable is MMA-UGI-IND
   *
   * @param value
   */
  public void setMmaUgiInd(char[] value) {
    mmaUgiInd = checkMmaUgiIndConstraints(value);
    serializeMmaUgiInd(mmaUgiInd);
  }

  /**
   * Update MmaUgiInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaUgiInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaUgiInd, mmaUgiInd.length);
  }

  public void setMmaUgiInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaUgiInd, mmaUgiInd.length);
  }

  /**
   * Update MmaUgiInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaUgiInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaUgiInd + targetIndex, targetLen);
  }

  /**
   * Update MmaUgiInd with another Field
   *
   * @param value
   */
  public void setMmaUgiInd(Field source) {
    replace(source, 0, source.length(), beginMmaUgiInd, MMA_UGI_IND_LEN);
  }

  /**
   * Update MmaUgiInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaUgiInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaUgiInd, MMA_UGI_IND_LEN);
  }

  /**
   * Update MmaUgiInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaUgiInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaUgiInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaLgiInd
   *
   * @return mmaLgiInd
   */
  public char[] getMmaLgiInd() throws CFException {
    if (isMmaLgiIndModified()) {
      mmaLgiInd = refreshMmaLgiInd();
    }
    return mmaLgiInd;
  }

  /**
   * set variable mmaLgiInd Corresponding COBOL Variable is MMA-LGI-IND
   *
   * @param value
   */
  public void setMmaLgiInd(char[] value) {
    mmaLgiInd = checkMmaLgiIndConstraints(value);
    serializeMmaLgiInd(mmaLgiInd);
  }

  /**
   * Update MmaLgiInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaLgiInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaLgiInd, mmaLgiInd.length);
  }

  public void setMmaLgiInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaLgiInd, mmaLgiInd.length);
  }

  /**
   * Update MmaLgiInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaLgiInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaLgiInd + targetIndex, targetLen);
  }

  /**
   * Update MmaLgiInd with another Field
   *
   * @param value
   */
  public void setMmaLgiInd(Field source) {
    replace(source, 0, source.length(), beginMmaLgiInd, MMA_LGI_IND_LEN);
  }

  /**
   * Update MmaLgiInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaLgiInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaLgiInd, MMA_LGI_IND_LEN);
  }

  /**
   * Update MmaLgiInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaLgiInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaLgiInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaExdInd
   *
   * @return mmaExdInd
   */
  public char[] getMmaExdInd() throws CFException {
    if (isMmaExdIndModified()) {
      mmaExdInd = refreshMmaExdInd();
    }
    return mmaExdInd;
  }

  /**
   * set variable mmaExdInd Corresponding COBOL Variable is MMA-EXD-IND
   *
   * @param value
   */
  public void setMmaExdInd(char[] value) {
    mmaExdInd = checkMmaExdIndConstraints(value);
    serializeMmaExdInd(mmaExdInd);
  }

  /**
   * Update MmaExdInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaExdInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaExdInd, mmaExdInd.length);
  }

  public void setMmaExdInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaExdInd, mmaExdInd.length);
  }

  /**
   * Update MmaExdInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaExdInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaExdInd + targetIndex, targetLen);
  }

  /**
   * Update MmaExdInd with another Field
   *
   * @param value
   */
  public void setMmaExdInd(Field source) {
    replace(source, 0, source.length(), beginMmaExdInd, MMA_EXD_IND_LEN);
  }

  /**
   * Update MmaExdInd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaExdInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaExdInd, MMA_EXD_IND_LEN);
  }

  /**
   * Update MmaExdInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaExdInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaExdInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of mmaMedCpnCd
   *
   * @return mmaMedCpnCd
   */
  public char[] getMmaMedCpnCd() throws CFException {
    if (isMmaMedCpnCdModified()) {
      mmaMedCpnCd = refreshMmaMedCpnCd();
    }
    return mmaMedCpnCd;
  }

  /**
   * set variable mmaMedCpnCd Corresponding COBOL Variable is MMA-MED-CPN-CD
   *
   * @param value
   */
  public void setMmaMedCpnCd(char[] value) {
    mmaMedCpnCd = checkMmaMedCpnCdConstraints(value);
    serializeMmaMedCpnCd(mmaMedCpnCd);
  }

  /**
   * Update MmaMedCpnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setMmaMedCpnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginMmaMedCpnCd, mmaMedCpnCd.length);
  }

  public void setMmaMedCpnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaMedCpnCd, mmaMedCpnCd.length);
  }

  /**
   * Update MmaMedCpnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaMedCpnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaMedCpnCd + targetIndex, targetLen);
  }

  /**
   * Update MmaMedCpnCd with another Field
   *
   * @param value
   */
  public void setMmaMedCpnCd(Field source) {
    replace(source, 0, source.length(), beginMmaMedCpnCd, MMA_MED_CPN_CD_LEN);
  }

  /**
   * Update MmaMedCpnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setMmaMedCpnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginMmaMedCpnCd, MMA_MED_CPN_CD_LEN);
  }

  /**
   * Update MmaMedCpnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setMmaMedCpnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginMmaMedCpnCd + targetIndex, targetLen);
  }

  public static int getDclpolPlnMstrAddtlInfoFieldLength() {
    return DCLPOL_PLN_MSTR_ADDTL_INFO_LENGTH;
  }
}
