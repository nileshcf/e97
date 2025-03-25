package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrAddtlInfoSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrAddtlInfoSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrAddtlInfoSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_ADDTL_INFO_LENGTH = 652;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginMmaGenTstPolPrtcpCd;
  protected int beginMmaNhpNtwkFlexInd;
  protected int beginMmaNptRulePkgId;
  protected int beginMmaRiskClsCd;
  protected int beginMmaSiteCareProcCd;
  protected int beginMmaPrefLabNtwkInd;
  protected int beginMmaSecOpinVendCd;
  protected int beginMmaRhabCombPtLmtCd;
  protected int beginMmaRhabCombOtLmtCd;
  protected int beginMmaRhabCombStLmtCd;
  protected int beginMmaRhabCombSmLmtCd;
  protected int beginMmaRhabCombCiLmtCd;
  protected int beginMmaRhabCombCtLmtCd;
  protected int beginMmaRhabCombCrLmtCd;
  protected int beginMmaRhabCombPrLmtCd;
  protected int beginMmaRhabCombMtLmtCd;
  protected int beginMmaHabCombPtLmtCd;
  protected int beginMmaHabCombOtLmtCd;
  protected int beginMmaHabCombStLmtCd;
  protected int beginMmaHabCombSmLmtCd;
  protected int beginMmaHabCombCiLmtCd;
  protected int beginMmaHabCombCtLmtCd;
  protected int beginMmaHabCombMtLmtCd;
  protected int beginMmaPhrmCpnInd;
  protected int beginMmaSpclRxInd;
  protected int beginMmaDesgDiagProvCd;
  protected int beginMmaUgiInd;
  protected int beginMmaLgiInd;
  protected int beginMmaExdInd;
  protected int beginMmaMedCpnCd;

  /** Constructor for DclpolPlnMstrAddtlInfoSerialized */
  public DclpolPlnMstrAddtlInfoSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrAddtlInfoSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_ADDTL_INFO_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginMmaGenTstPolPrtcpCd = getStartOffset() + 121; // set offset for serialization

    beginMmaNhpNtwkFlexInd = getStartOffset() + 122; // set offset for serialization

    beginMmaNptRulePkgId = getStartOffset() + 123; // set offset for serialization

    beginMmaRiskClsCd = getStartOffset() + 129; // set offset for serialization

    beginMmaSiteCareProcCd = getStartOffset() + 130; // set offset for serialization

    beginMmaPrefLabNtwkInd = getStartOffset() + 138; // set offset for serialization

    beginMmaSecOpinVendCd = getStartOffset() + 139; // set offset for serialization

    beginMmaRhabCombPtLmtCd = getStartOffset() + 151; // set offset for serialization

    beginMmaRhabCombOtLmtCd = getStartOffset() + 152; // set offset for serialization

    beginMmaRhabCombStLmtCd = getStartOffset() + 153; // set offset for serialization

    beginMmaRhabCombSmLmtCd = getStartOffset() + 154; // set offset for serialization

    beginMmaRhabCombCiLmtCd = getStartOffset() + 155; // set offset for serialization

    beginMmaRhabCombCtLmtCd = getStartOffset() + 156; // set offset for serialization

    beginMmaRhabCombCrLmtCd = getStartOffset() + 157; // set offset for serialization

    beginMmaRhabCombPrLmtCd = getStartOffset() + 158; // set offset for serialization

    beginMmaRhabCombMtLmtCd = getStartOffset() + 159; // set offset for serialization

    beginMmaHabCombPtLmtCd = getStartOffset() + 160; // set offset for serialization

    beginMmaHabCombOtLmtCd = getStartOffset() + 161; // set offset for serialization

    beginMmaHabCombStLmtCd = getStartOffset() + 162; // set offset for serialization

    beginMmaHabCombSmLmtCd = getStartOffset() + 163; // set offset for serialization

    beginMmaHabCombCiLmtCd = getStartOffset() + 164; // set offset for serialization

    beginMmaHabCombCtLmtCd = getStartOffset() + 165; // set offset for serialization

    beginMmaHabCombMtLmtCd = getStartOffset() + 166; // set offset for serialization

    beginMmaPhrmCpnInd = getStartOffset() + 488; // set offset for serialization

    beginMmaSpclRxInd = getStartOffset() + 539; // set offset for serialization

    beginMmaDesgDiagProvCd = getStartOffset() + 638; // set offset for serialization

    beginMmaUgiInd = getStartOffset() + 644; // set offset for serialization

    beginMmaLgiInd = getStartOffset() + 645; // set offset for serialization

    beginMmaExdInd = getStartOffset() + 646; // set offset for serialization

    beginMmaMedCpnCd = getStartOffset() + 647; // set offset for serialization

    /*  end of offset */
  }

  int localMmaGenTstPolPrtcpCdCounter = -1;

  public boolean isMmaGenTstPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaGenTstPolPrtcpCdCounter != sharedCounter;
    localMmaGenTstPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_GEN_TST_POL_PRTCP_CD_LEN = 1;
  /** serialize this MmaGenTstPolPrtcpCd */
  protected void serializeMmaGenTstPolPrtcpCd(char[] mmaGenTstPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaGenTstPolPrtcpCd,
        0,
        getStringValue(),
        beginMmaGenTstPolPrtcpCd,
        MMA_GEN_TST_POL_PRTCP_CD_LEN);
    localMmaGenTstPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaGenTstPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaGenTstPolPrtcpCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshMmaGenTstPolPrtcpCd() {
    return (substring(
        getStringValue(),
        beginMmaGenTstPolPrtcpCd,
        beginMmaGenTstPolPrtcpCd + MMA_GEN_TST_POL_PRTCP_CD_LEN));
  }

  int localMmaNhpNtwkFlexIndCounter = -1;

  public boolean isMmaNhpNtwkFlexIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaNhpNtwkFlexIndCounter != sharedCounter;
    localMmaNhpNtwkFlexIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_NHP_NTWK_FLEX_IND_LEN = 1;
  /** serialize this MmaNhpNtwkFlexInd */
  protected void serializeMmaNhpNtwkFlexInd(char[] mmaNhpNtwkFlexInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaNhpNtwkFlexInd, 0, getStringValue(), beginMmaNhpNtwkFlexInd, MMA_NHP_NTWK_FLEX_IND_LEN);
    localMmaNhpNtwkFlexIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaNhpNtwkFlexIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaNhpNtwkFlexInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaNhpNtwkFlexInd() {
    return (substring(
        getStringValue(),
        beginMmaNhpNtwkFlexInd,
        beginMmaNhpNtwkFlexInd + MMA_NHP_NTWK_FLEX_IND_LEN));
  }

  int localMmaNptRulePkgIdCounter = -1;

  public boolean isMmaNptRulePkgIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaNptRulePkgIdCounter != sharedCounter;
    localMmaNptRulePkgIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_NPT_RULE_PKG_ID_LEN = 6;
  /** serialize this MmaNptRulePkgId */
  protected void serializeMmaNptRulePkgId(char[] mmaNptRulePkgId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaNptRulePkgId, 0, getStringValue(), beginMmaNptRulePkgId, MMA_NPT_RULE_PKG_ID_LEN);
    localMmaNptRulePkgIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaNptRulePkgIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshMmaNptRulePkgId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaNptRulePkgId() {
    return (substring(
        getStringValue(), beginMmaNptRulePkgId, beginMmaNptRulePkgId + MMA_NPT_RULE_PKG_ID_LEN));
  }

  int localMmaRiskClsCdCounter = -1;

  public boolean isMmaRiskClsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRiskClsCdCounter != sharedCounter;
    localMmaRiskClsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RISK_CLS_CD_LEN = 1;
  /** serialize this MmaRiskClsCd */
  protected void serializeMmaRiskClsCd(char[] mmaRiskClsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaRiskClsCd, 0, getStringValue(), beginMmaRiskClsCd, MMA_RISK_CLS_CD_LEN);
    localMmaRiskClsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRiskClsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRiskClsCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRiskClsCd() {
    return (substring(
        getStringValue(), beginMmaRiskClsCd, beginMmaRiskClsCd + MMA_RISK_CLS_CD_LEN));
  }

  int localMmaSiteCareProcCdCounter = -1;

  public boolean isMmaSiteCareProcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaSiteCareProcCdCounter != sharedCounter;
    localMmaSiteCareProcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_SITE_CARE_PROC_CD_LEN = 1;
  /** serialize this MmaSiteCareProcCd */
  protected void serializeMmaSiteCareProcCd(char[] mmaSiteCareProcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaSiteCareProcCd, 0, getStringValue(), beginMmaSiteCareProcCd, MMA_SITE_CARE_PROC_CD_LEN);
    localMmaSiteCareProcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaSiteCareProcCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaSiteCareProcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaSiteCareProcCd() {
    return (substring(
        getStringValue(),
        beginMmaSiteCareProcCd,
        beginMmaSiteCareProcCd + MMA_SITE_CARE_PROC_CD_LEN));
  }

  int localMmaPrefLabNtwkIndCounter = -1;

  public boolean isMmaPrefLabNtwkIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaPrefLabNtwkIndCounter != sharedCounter;
    localMmaPrefLabNtwkIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_PREF_LAB_NTWK_IND_LEN = 1;
  /** serialize this MmaPrefLabNtwkInd */
  protected void serializeMmaPrefLabNtwkInd(char[] mmaPrefLabNtwkInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaPrefLabNtwkInd, 0, getStringValue(), beginMmaPrefLabNtwkInd, MMA_PREF_LAB_NTWK_IND_LEN);
    localMmaPrefLabNtwkIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaPrefLabNtwkIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaPrefLabNtwkInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaPrefLabNtwkInd() {
    return (substring(
        getStringValue(),
        beginMmaPrefLabNtwkInd,
        beginMmaPrefLabNtwkInd + MMA_PREF_LAB_NTWK_IND_LEN));
  }

  int localMmaSecOpinVendCdCounter = -1;

  public boolean isMmaSecOpinVendCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaSecOpinVendCdCounter != sharedCounter;
    localMmaSecOpinVendCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_SEC_OPIN_VEND_CD_LEN = 1;
  /** serialize this MmaSecOpinVendCd */
  protected void serializeMmaSecOpinVendCd(char[] mmaSecOpinVendCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaSecOpinVendCd, 0, getStringValue(), beginMmaSecOpinVendCd, MMA_SEC_OPIN_VEND_CD_LEN);
    localMmaSecOpinVendCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaSecOpinVendCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaSecOpinVendCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaSecOpinVendCd() {
    return (substring(
        getStringValue(), beginMmaSecOpinVendCd, beginMmaSecOpinVendCd + MMA_SEC_OPIN_VEND_CD_LEN));
  }

  int localMmaRhabCombPtLmtCdCounter = -1;

  public boolean isMmaRhabCombPtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombPtLmtCdCounter != sharedCounter;
    localMmaRhabCombPtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_PT_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombPtLmtCd */
  protected void serializeMmaRhabCombPtLmtCd(char[] mmaRhabCombPtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombPtLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombPtLmtCd,
        MMA_RHAB_COMB_PT_LMT_CD_LEN);
    localMmaRhabCombPtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombPtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombPtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombPtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombPtLmtCd,
        beginMmaRhabCombPtLmtCd + MMA_RHAB_COMB_PT_LMT_CD_LEN));
  }

  int localMmaRhabCombOtLmtCdCounter = -1;

  public boolean isMmaRhabCombOtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombOtLmtCdCounter != sharedCounter;
    localMmaRhabCombOtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_OT_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombOtLmtCd */
  protected void serializeMmaRhabCombOtLmtCd(char[] mmaRhabCombOtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombOtLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombOtLmtCd,
        MMA_RHAB_COMB_OT_LMT_CD_LEN);
    localMmaRhabCombOtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombOtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombOtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombOtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombOtLmtCd,
        beginMmaRhabCombOtLmtCd + MMA_RHAB_COMB_OT_LMT_CD_LEN));
  }

  int localMmaRhabCombStLmtCdCounter = -1;

  public boolean isMmaRhabCombStLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombStLmtCdCounter != sharedCounter;
    localMmaRhabCombStLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_ST_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombStLmtCd */
  protected void serializeMmaRhabCombStLmtCd(char[] mmaRhabCombStLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombStLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombStLmtCd,
        MMA_RHAB_COMB_ST_LMT_CD_LEN);
    localMmaRhabCombStLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombStLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombStLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombStLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombStLmtCd,
        beginMmaRhabCombStLmtCd + MMA_RHAB_COMB_ST_LMT_CD_LEN));
  }

  int localMmaRhabCombSmLmtCdCounter = -1;

  public boolean isMmaRhabCombSmLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombSmLmtCdCounter != sharedCounter;
    localMmaRhabCombSmLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_SM_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombSmLmtCd */
  protected void serializeMmaRhabCombSmLmtCd(char[] mmaRhabCombSmLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombSmLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombSmLmtCd,
        MMA_RHAB_COMB_SM_LMT_CD_LEN);
    localMmaRhabCombSmLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombSmLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombSmLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombSmLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombSmLmtCd,
        beginMmaRhabCombSmLmtCd + MMA_RHAB_COMB_SM_LMT_CD_LEN));
  }

  int localMmaRhabCombCiLmtCdCounter = -1;

  public boolean isMmaRhabCombCiLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombCiLmtCdCounter != sharedCounter;
    localMmaRhabCombCiLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_CI_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombCiLmtCd */
  protected void serializeMmaRhabCombCiLmtCd(char[] mmaRhabCombCiLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombCiLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombCiLmtCd,
        MMA_RHAB_COMB_CI_LMT_CD_LEN);
    localMmaRhabCombCiLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombCiLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombCiLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombCiLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombCiLmtCd,
        beginMmaRhabCombCiLmtCd + MMA_RHAB_COMB_CI_LMT_CD_LEN));
  }

  int localMmaRhabCombCtLmtCdCounter = -1;

  public boolean isMmaRhabCombCtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombCtLmtCdCounter != sharedCounter;
    localMmaRhabCombCtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_CT_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombCtLmtCd */
  protected void serializeMmaRhabCombCtLmtCd(char[] mmaRhabCombCtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombCtLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombCtLmtCd,
        MMA_RHAB_COMB_CT_LMT_CD_LEN);
    localMmaRhabCombCtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombCtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombCtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombCtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombCtLmtCd,
        beginMmaRhabCombCtLmtCd + MMA_RHAB_COMB_CT_LMT_CD_LEN));
  }

  int localMmaRhabCombCrLmtCdCounter = -1;

  public boolean isMmaRhabCombCrLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombCrLmtCdCounter != sharedCounter;
    localMmaRhabCombCrLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_CR_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombCrLmtCd */
  protected void serializeMmaRhabCombCrLmtCd(char[] mmaRhabCombCrLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombCrLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombCrLmtCd,
        MMA_RHAB_COMB_CR_LMT_CD_LEN);
    localMmaRhabCombCrLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombCrLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombCrLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombCrLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombCrLmtCd,
        beginMmaRhabCombCrLmtCd + MMA_RHAB_COMB_CR_LMT_CD_LEN));
  }

  int localMmaRhabCombPrLmtCdCounter = -1;

  public boolean isMmaRhabCombPrLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombPrLmtCdCounter != sharedCounter;
    localMmaRhabCombPrLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_PR_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombPrLmtCd */
  protected void serializeMmaRhabCombPrLmtCd(char[] mmaRhabCombPrLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombPrLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombPrLmtCd,
        MMA_RHAB_COMB_PR_LMT_CD_LEN);
    localMmaRhabCombPrLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombPrLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombPrLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombPrLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombPrLmtCd,
        beginMmaRhabCombPrLmtCd + MMA_RHAB_COMB_PR_LMT_CD_LEN));
  }

  int localMmaRhabCombMtLmtCdCounter = -1;

  public boolean isMmaRhabCombMtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaRhabCombMtLmtCdCounter != sharedCounter;
    localMmaRhabCombMtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_RHAB_COMB_MT_LMT_CD_LEN = 1;
  /** serialize this MmaRhabCombMtLmtCd */
  protected void serializeMmaRhabCombMtLmtCd(char[] mmaRhabCombMtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaRhabCombMtLmtCd,
        0,
        getStringValue(),
        beginMmaRhabCombMtLmtCd,
        MMA_RHAB_COMB_MT_LMT_CD_LEN);
    localMmaRhabCombMtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaRhabCombMtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaRhabCombMtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaRhabCombMtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaRhabCombMtLmtCd,
        beginMmaRhabCombMtLmtCd + MMA_RHAB_COMB_MT_LMT_CD_LEN));
  }

  int localMmaHabCombPtLmtCdCounter = -1;

  public boolean isMmaHabCombPtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaHabCombPtLmtCdCounter != sharedCounter;
    localMmaHabCombPtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_HAB_COMB_PT_LMT_CD_LEN = 1;
  /** serialize this MmaHabCombPtLmtCd */
  protected void serializeMmaHabCombPtLmtCd(char[] mmaHabCombPtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaHabCombPtLmtCd, 0, getStringValue(), beginMmaHabCombPtLmtCd, MMA_HAB_COMB_PT_LMT_CD_LEN);
    localMmaHabCombPtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaHabCombPtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaHabCombPtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaHabCombPtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaHabCombPtLmtCd,
        beginMmaHabCombPtLmtCd + MMA_HAB_COMB_PT_LMT_CD_LEN));
  }

  int localMmaHabCombOtLmtCdCounter = -1;

  public boolean isMmaHabCombOtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaHabCombOtLmtCdCounter != sharedCounter;
    localMmaHabCombOtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_HAB_COMB_OT_LMT_CD_LEN = 1;
  /** serialize this MmaHabCombOtLmtCd */
  protected void serializeMmaHabCombOtLmtCd(char[] mmaHabCombOtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaHabCombOtLmtCd, 0, getStringValue(), beginMmaHabCombOtLmtCd, MMA_HAB_COMB_OT_LMT_CD_LEN);
    localMmaHabCombOtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaHabCombOtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaHabCombOtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaHabCombOtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaHabCombOtLmtCd,
        beginMmaHabCombOtLmtCd + MMA_HAB_COMB_OT_LMT_CD_LEN));
  }

  int localMmaHabCombStLmtCdCounter = -1;

  public boolean isMmaHabCombStLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaHabCombStLmtCdCounter != sharedCounter;
    localMmaHabCombStLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_HAB_COMB_ST_LMT_CD_LEN = 1;
  /** serialize this MmaHabCombStLmtCd */
  protected void serializeMmaHabCombStLmtCd(char[] mmaHabCombStLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaHabCombStLmtCd, 0, getStringValue(), beginMmaHabCombStLmtCd, MMA_HAB_COMB_ST_LMT_CD_LEN);
    localMmaHabCombStLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaHabCombStLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaHabCombStLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaHabCombStLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaHabCombStLmtCd,
        beginMmaHabCombStLmtCd + MMA_HAB_COMB_ST_LMT_CD_LEN));
  }

  int localMmaHabCombSmLmtCdCounter = -1;

  public boolean isMmaHabCombSmLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaHabCombSmLmtCdCounter != sharedCounter;
    localMmaHabCombSmLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_HAB_COMB_SM_LMT_CD_LEN = 1;
  /** serialize this MmaHabCombSmLmtCd */
  protected void serializeMmaHabCombSmLmtCd(char[] mmaHabCombSmLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaHabCombSmLmtCd, 0, getStringValue(), beginMmaHabCombSmLmtCd, MMA_HAB_COMB_SM_LMT_CD_LEN);
    localMmaHabCombSmLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaHabCombSmLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaHabCombSmLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaHabCombSmLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaHabCombSmLmtCd,
        beginMmaHabCombSmLmtCd + MMA_HAB_COMB_SM_LMT_CD_LEN));
  }

  int localMmaHabCombCiLmtCdCounter = -1;

  public boolean isMmaHabCombCiLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaHabCombCiLmtCdCounter != sharedCounter;
    localMmaHabCombCiLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_HAB_COMB_CI_LMT_CD_LEN = 1;
  /** serialize this MmaHabCombCiLmtCd */
  protected void serializeMmaHabCombCiLmtCd(char[] mmaHabCombCiLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaHabCombCiLmtCd, 0, getStringValue(), beginMmaHabCombCiLmtCd, MMA_HAB_COMB_CI_LMT_CD_LEN);
    localMmaHabCombCiLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaHabCombCiLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaHabCombCiLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaHabCombCiLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaHabCombCiLmtCd,
        beginMmaHabCombCiLmtCd + MMA_HAB_COMB_CI_LMT_CD_LEN));
  }

  int localMmaHabCombCtLmtCdCounter = -1;

  public boolean isMmaHabCombCtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaHabCombCtLmtCdCounter != sharedCounter;
    localMmaHabCombCtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_HAB_COMB_CT_LMT_CD_LEN = 1;
  /** serialize this MmaHabCombCtLmtCd */
  protected void serializeMmaHabCombCtLmtCd(char[] mmaHabCombCtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaHabCombCtLmtCd, 0, getStringValue(), beginMmaHabCombCtLmtCd, MMA_HAB_COMB_CT_LMT_CD_LEN);
    localMmaHabCombCtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaHabCombCtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaHabCombCtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaHabCombCtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaHabCombCtLmtCd,
        beginMmaHabCombCtLmtCd + MMA_HAB_COMB_CT_LMT_CD_LEN));
  }

  int localMmaHabCombMtLmtCdCounter = -1;

  public boolean isMmaHabCombMtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaHabCombMtLmtCdCounter != sharedCounter;
    localMmaHabCombMtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_HAB_COMB_MT_LMT_CD_LEN = 1;
  /** serialize this MmaHabCombMtLmtCd */
  protected void serializeMmaHabCombMtLmtCd(char[] mmaHabCombMtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaHabCombMtLmtCd, 0, getStringValue(), beginMmaHabCombMtLmtCd, MMA_HAB_COMB_MT_LMT_CD_LEN);
    localMmaHabCombMtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaHabCombMtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaHabCombMtLmtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaHabCombMtLmtCd() {
    return (substring(
        getStringValue(),
        beginMmaHabCombMtLmtCd,
        beginMmaHabCombMtLmtCd + MMA_HAB_COMB_MT_LMT_CD_LEN));
  }

  int localMmaPhrmCpnIndCounter = -1;

  public boolean isMmaPhrmCpnIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaPhrmCpnIndCounter != sharedCounter;
    localMmaPhrmCpnIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_PHRM_CPN_IND_LEN = 1;
  /** serialize this MmaPhrmCpnInd */
  protected void serializeMmaPhrmCpnInd(char[] mmaPhrmCpnInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaPhrmCpnInd, 0, getStringValue(), beginMmaPhrmCpnInd, MMA_PHRM_CPN_IND_LEN);
    localMmaPhrmCpnIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaPhrmCpnIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaPhrmCpnInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaPhrmCpnInd() {
    return (substring(
        getStringValue(), beginMmaPhrmCpnInd, beginMmaPhrmCpnInd + MMA_PHRM_CPN_IND_LEN));
  }

  int localMmaSpclRxIndCounter = -1;

  public boolean isMmaSpclRxIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaSpclRxIndCounter != sharedCounter;
    localMmaSpclRxIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_SPCL_RX_IND_LEN = 1;
  /** serialize this MmaSpclRxInd */
  protected void serializeMmaSpclRxInd(char[] mmaSpclRxInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaSpclRxInd, 0, getStringValue(), beginMmaSpclRxInd, MMA_SPCL_RX_IND_LEN);
    localMmaSpclRxIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaSpclRxIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaSpclRxInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaSpclRxInd() {
    return (substring(
        getStringValue(), beginMmaSpclRxInd, beginMmaSpclRxInd + MMA_SPCL_RX_IND_LEN));
  }

  int localMmaDesgDiagProvCdCounter = -1;

  public boolean isMmaDesgDiagProvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaDesgDiagProvCdCounter != sharedCounter;
    localMmaDesgDiagProvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_DESG_DIAG_PROV_CD_LEN = 1;
  /** serialize this MmaDesgDiagProvCd */
  protected void serializeMmaDesgDiagProvCd(char[] mmaDesgDiagProvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        mmaDesgDiagProvCd, 0, getStringValue(), beginMmaDesgDiagProvCd, MMA_DESG_DIAG_PROV_CD_LEN);
    localMmaDesgDiagProvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaDesgDiagProvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaDesgDiagProvCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshMmaDesgDiagProvCd() {
    return (substring(
        getStringValue(),
        beginMmaDesgDiagProvCd,
        beginMmaDesgDiagProvCd + MMA_DESG_DIAG_PROV_CD_LEN));
  }

  int localMmaUgiIndCounter = -1;

  public boolean isMmaUgiIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaUgiIndCounter != sharedCounter;
    localMmaUgiIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_UGI_IND_LEN = 1;
  /** serialize this MmaUgiInd */
  protected void serializeMmaUgiInd(char[] mmaUgiInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaUgiInd, 0, getStringValue(), beginMmaUgiInd, MMA_UGI_IND_LEN);
    localMmaUgiIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaUgiIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaUgiInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmaUgiInd() {
    return (substring(getStringValue(), beginMmaUgiInd, beginMmaUgiInd + MMA_UGI_IND_LEN));
  }

  int localMmaLgiIndCounter = -1;

  public boolean isMmaLgiIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaLgiIndCounter != sharedCounter;
    localMmaLgiIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_LGI_IND_LEN = 1;
  /** serialize this MmaLgiInd */
  protected void serializeMmaLgiInd(char[] mmaLgiInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaLgiInd, 0, getStringValue(), beginMmaLgiInd, MMA_LGI_IND_LEN);
    localMmaLgiIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaLgiIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaLgiInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmaLgiInd() {
    return (substring(getStringValue(), beginMmaLgiInd, beginMmaLgiInd + MMA_LGI_IND_LEN));
  }

  int localMmaExdIndCounter = -1;

  public boolean isMmaExdIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaExdIndCounter != sharedCounter;
    localMmaExdIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_EXD_IND_LEN = 1;
  /** serialize this MmaExdInd */
  protected void serializeMmaExdInd(char[] mmaExdInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaExdInd, 0, getStringValue(), beginMmaExdInd, MMA_EXD_IND_LEN);
    localMmaExdIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaExdIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaExdInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmaExdInd() {
    return (substring(getStringValue(), beginMmaExdInd, beginMmaExdInd + MMA_EXD_IND_LEN));
  }

  int localMmaMedCpnCdCounter = -1;

  public boolean isMmaMedCpnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMmaMedCpnCdCounter != sharedCounter;
    localMmaMedCpnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int MMA_MED_CPN_CD_LEN = 1;
  /** serialize this MmaMedCpnCd */
  protected void serializeMmaMedCpnCd(char[] mmaMedCpnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(mmaMedCpnCd, 0, getStringValue(), beginMmaMedCpnCd, MMA_MED_CPN_CD_LEN);
    localMmaMedCpnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkMmaMedCpnCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshMmaMedCpnCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshMmaMedCpnCd() {
    return (substring(getStringValue(), beginMmaMedCpnCd, beginMmaMedCpnCd + MMA_MED_CPN_CD_LEN));
  }
}
