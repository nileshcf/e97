package com.cloudframe.app.dto.serialize.c5427bhi;

/**
 * The class CrtnSrchReturnAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchReturnAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CrtnSrchReturnAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CRTN_SRCH_RETURN_AREA_LENGTH = 356;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnSqlcode;
  protected int beginCrtnSrchFoundSw;
  protected int beginCrtnNtwkTypCd;
  protected int beginCrtnEffDt;
  protected int beginCrtnCancDt;
  protected int beginCrtnSrvcCd;
  protected int beginCrtnPlOfSrvcCd;
  protected int beginCrtnCausCd;
  protected int beginCrtnBenLvlCd;
  protected int beginCrtnInNtwkClssCd;
  protected int beginCrtnTier1NtwkClssCd;
  protected int beginCrtnProcCdRngBegnVal;
  protected int beginCrtnProcCdRngEndVal;
  protected int beginCrtnProcCdRngTypVal;
  protected int beginCrtnProvOrgTypCd;
  protected int beginCrtnHipaaCommtTxt;

  /** Constructor for CrtnSrchReturnAreaSerialized */
  public CrtnSrchReturnAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchReturnAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchReturnAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CrtnSrchReturnAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 33); // serialize this field at offset 33 by default
  }

  /**
   * sets parent for this CrtnSrchReturnAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 33 by default
  }
  /** initializes the field in CrtnSrchReturnAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CRTN_SRCH_RETURN_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCrtnSqlcode = getStartOffset() + 0; // set offset for serialization

    beginCrtnSrchFoundSw = getStartOffset() + 4; // set offset for serialization

    beginCrtnNtwkTypCd = getStartOffset() + 5; // set offset for serialization

    beginCrtnEffDt = getStartOffset() + 6; // set offset for serialization

    beginCrtnCancDt = getStartOffset() + 16; // set offset for serialization

    beginCrtnSrvcCd = getStartOffset() + 26; // set offset for serialization

    beginCrtnPlOfSrvcCd = getStartOffset() + 32; // set offset for serialization

    beginCrtnCausCd = getStartOffset() + 34; // set offset for serialization

    beginCrtnBenLvlCd = getStartOffset() + 35; // set offset for serialization

    beginCrtnInNtwkClssCd = getStartOffset() + 36; // set offset for serialization

    beginCrtnTier1NtwkClssCd = getStartOffset() + 37; // set offset for serialization

    beginCrtnProcCdRngBegnVal = getStartOffset() + 38; // set offset for serialization

    beginCrtnProcCdRngEndVal = getStartOffset() + 45; // set offset for serialization

    beginCrtnProcCdRngTypVal = getStartOffset() + 52; // set offset for serialization

    beginCrtnProvOrgTypCd = getStartOffset() + 53; // set offset for serialization

    beginCrtnHipaaCommtTxt = getStartOffset() + 56; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnSqlcodeCounter = -1;

  public boolean isCrtnSqlcodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnSqlcodeCounter != sharedCounter;
    localCrtnSqlcodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_SQLCODE_LEN = 4;
  /** serializeCrtnSqlcode */
  protected void serializeCrtnSqlcode(int crtnSqlcode) {
    replaceValue( //  save the value as string
        getBinaryString(crtnSqlcode, CRTN_SQLCODE_LEN), beginCrtnSqlcode, CRTN_SQLCODE_LEN);
    localCrtnSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCrtnSqlcodeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCrtnSqlcode is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshCrtnSqlcode() {
    return (getInt(beginCrtnSqlcode));
  }

  int localCrtnSrchFoundSwCounter = -1;

  public boolean isCrtnSrchFoundSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnSrchFoundSwCounter != sharedCounter;
    localCrtnSrchFoundSwCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_SRCH_FOUND_SW_LEN = 1;
  /** serialize this CrtnSrchFoundSw */
  protected void serializeCrtnSrchFoundSw(char[] crtnSrchFoundSw) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnSrchFoundSw, 0, getStringValue(), beginCrtnSrchFoundSw, CRTN_SRCH_FOUND_SW_LEN);
    localCrtnSrchFoundSwCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnSrchFoundSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnSrchFoundSw is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnSrchFoundSw() {
    return (substring(
        getStringValue(), beginCrtnSrchFoundSw, beginCrtnSrchFoundSw + CRTN_SRCH_FOUND_SW_LEN));
  }

  int localCrtnNtwkTypCdCounter = -1;

  public boolean isCrtnNtwkTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnNtwkTypCdCounter != sharedCounter;
    localCrtnNtwkTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_NTWK_TYP_CD_LEN = 1;
  /** serialize this CrtnNtwkTypCd */
  protected void serializeCrtnNtwkTypCd(char[] crtnNtwkTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnNtwkTypCd, 0, getStringValue(), beginCrtnNtwkTypCd, CRTN_NTWK_TYP_CD_LEN);
    localCrtnNtwkTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnNtwkTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnNtwkTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnNtwkTypCd() {
    return (substring(
        getStringValue(), beginCrtnNtwkTypCd, beginCrtnNtwkTypCd + CRTN_NTWK_TYP_CD_LEN));
  }

  int localCrtnEffDtCounter = -1;

  public boolean isCrtnEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnEffDtCounter != sharedCounter;
    localCrtnEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_EFF_DT_LEN = 10;
  /** serialize this CrtnEffDt */
  protected void serializeCrtnEffDt(char[] crtnEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnEffDt, 0, getStringValue(), beginCrtnEffDt, CRTN_EFF_DT_LEN);
    localCrtnEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCrtnEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnEffDt() {
    return (substring(getStringValue(), beginCrtnEffDt, beginCrtnEffDt + CRTN_EFF_DT_LEN));
  }

  int localCrtnCancDtCounter = -1;

  public boolean isCrtnCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnCancDtCounter != sharedCounter;
    localCrtnCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_CANC_DT_LEN = 10;
  /** serialize this CrtnCancDt */
  protected void serializeCrtnCancDt(char[] crtnCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnCancDt, 0, getStringValue(), beginCrtnCancDt, CRTN_CANC_DT_LEN);
    localCrtnCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCrtnCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnCancDt() {
    return (substring(getStringValue(), beginCrtnCancDt, beginCrtnCancDt + CRTN_CANC_DT_LEN));
  }

  int localCrtnSrvcCdCounter = -1;

  public boolean isCrtnSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnSrvcCdCounter != sharedCounter;
    localCrtnSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_SRVC_CD_LEN = 6;
  /** serialize this CrtnSrvcCd */
  protected void serializeCrtnSrvcCd(char[] crtnSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnSrvcCd, 0, getStringValue(), beginCrtnSrvcCd, CRTN_SRVC_CD_LEN);
    localCrtnSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshCrtnSrvcCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnSrvcCd() {
    return (substring(getStringValue(), beginCrtnSrvcCd, beginCrtnSrvcCd + CRTN_SRVC_CD_LEN));
  }

  int localCrtnPlOfSrvcCdCounter = -1;

  public boolean isCrtnPlOfSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnPlOfSrvcCdCounter != sharedCounter;
    localCrtnPlOfSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_PL_OF_SRVC_CD_LEN = 2;
  /** serialize this CrtnPlOfSrvcCd */
  protected void serializeCrtnPlOfSrvcCd(char[] crtnPlOfSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnPlOfSrvcCd, 0, getStringValue(), beginCrtnPlOfSrvcCd, CRTN_PL_OF_SRVC_CD_LEN);
    localCrtnPlOfSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnPlOfSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCrtnPlOfSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnPlOfSrvcCd() {
    return (substring(
        getStringValue(), beginCrtnPlOfSrvcCd, beginCrtnPlOfSrvcCd + CRTN_PL_OF_SRVC_CD_LEN));
  }

  int localCrtnCausCdCounter = -1;

  public boolean isCrtnCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnCausCdCounter != sharedCounter;
    localCrtnCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_CAUS_CD_LEN = 1;
  /** serialize this CrtnCausCd */
  protected void serializeCrtnCausCd(char[] crtnCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnCausCd, 0, getStringValue(), beginCrtnCausCd, CRTN_CAUS_CD_LEN);
    localCrtnCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnCausCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnCausCd() {
    return (substring(getStringValue(), beginCrtnCausCd, beginCrtnCausCd + CRTN_CAUS_CD_LEN));
  }

  int localCrtnBenLvlCdCounter = -1;

  public boolean isCrtnBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnBenLvlCdCounter != sharedCounter;
    localCrtnBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_BEN_LVL_CD_LEN = 1;
  /** serialize this CrtnBenLvlCd */
  protected void serializeCrtnBenLvlCd(char[] crtnBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnBenLvlCd, 0, getStringValue(), beginCrtnBenLvlCd, CRTN_BEN_LVL_CD_LEN);
    localCrtnBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnBenLvlCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnBenLvlCd() {
    return (substring(
        getStringValue(), beginCrtnBenLvlCd, beginCrtnBenLvlCd + CRTN_BEN_LVL_CD_LEN));
  }

  int localCrtnInNtwkClssCdCounter = -1;

  public boolean isCrtnInNtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnInNtwkClssCdCounter != sharedCounter;
    localCrtnInNtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_IN_NTWK_CLSS_CD_LEN = 1;
  /** serialize this CrtnInNtwkClssCd */
  protected void serializeCrtnInNtwkClssCd(char[] crtnInNtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnInNtwkClssCd, 0, getStringValue(), beginCrtnInNtwkClssCd, CRTN_IN_NTWK_CLSS_CD_LEN);
    localCrtnInNtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnInNtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnInNtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnInNtwkClssCd() {
    return (substring(
        getStringValue(), beginCrtnInNtwkClssCd, beginCrtnInNtwkClssCd + CRTN_IN_NTWK_CLSS_CD_LEN));
  }

  int localCrtnTier1NtwkClssCdCounter = -1;

  public boolean isCrtnTier1NtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnTier1NtwkClssCdCounter != sharedCounter;
    localCrtnTier1NtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_TIER_1_NTWK_CLSS_CD_LEN = 1;
  /** serialize this CrtnTier1NtwkClssCd */
  protected void serializeCrtnTier1NtwkClssCd(char[] crtnTier1NtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnTier1NtwkClssCd,
        0,
        getStringValue(),
        beginCrtnTier1NtwkClssCd,
        CRTN_TIER_1_NTWK_CLSS_CD_LEN);
    localCrtnTier1NtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnTier1NtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnTier1NtwkClssCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCrtnTier1NtwkClssCd() {
    return (substring(
        getStringValue(),
        beginCrtnTier1NtwkClssCd,
        beginCrtnTier1NtwkClssCd + CRTN_TIER_1_NTWK_CLSS_CD_LEN));
  }

  int localCrtnProcCdRngBegnValCounter = -1;

  public boolean isCrtnProcCdRngBegnValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnProcCdRngBegnValCounter != sharedCounter;
    localCrtnProcCdRngBegnValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_PROC_CD_RNG_BEGN_VAL_LEN = 7;
  /** serialize this CrtnProcCdRngBegnVal */
  protected void serializeCrtnProcCdRngBegnVal(char[] crtnProcCdRngBegnVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnProcCdRngBegnVal,
        0,
        getStringValue(),
        beginCrtnProcCdRngBegnVal,
        CRTN_PROC_CD_RNG_BEGN_VAL_LEN);
    localCrtnProcCdRngBegnValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnProcCdRngBegnValConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshCrtnProcCdRngBegnVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCrtnProcCdRngBegnVal() {
    return (substring(
        getStringValue(),
        beginCrtnProcCdRngBegnVal,
        beginCrtnProcCdRngBegnVal + CRTN_PROC_CD_RNG_BEGN_VAL_LEN));
  }

  int localCrtnProcCdRngEndValCounter = -1;

  public boolean isCrtnProcCdRngEndValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnProcCdRngEndValCounter != sharedCounter;
    localCrtnProcCdRngEndValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_PROC_CD_RNG_END_VAL_LEN = 7;
  /** serialize this CrtnProcCdRngEndVal */
  protected void serializeCrtnProcCdRngEndVal(char[] crtnProcCdRngEndVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnProcCdRngEndVal,
        0,
        getStringValue(),
        beginCrtnProcCdRngEndVal,
        CRTN_PROC_CD_RNG_END_VAL_LEN);
    localCrtnProcCdRngEndValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnProcCdRngEndValConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshCrtnProcCdRngEndVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCrtnProcCdRngEndVal() {
    return (substring(
        getStringValue(),
        beginCrtnProcCdRngEndVal,
        beginCrtnProcCdRngEndVal + CRTN_PROC_CD_RNG_END_VAL_LEN));
  }

  int localCrtnProcCdRngTypValCounter = -1;

  public boolean isCrtnProcCdRngTypValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnProcCdRngTypValCounter != sharedCounter;
    localCrtnProcCdRngTypValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_PROC_CD_RNG_TYP_VAL_LEN = 1;
  /** serialize this CrtnProcCdRngTypVal */
  protected void serializeCrtnProcCdRngTypVal(char[] crtnProcCdRngTypVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnProcCdRngTypVal,
        0,
        getStringValue(),
        beginCrtnProcCdRngTypVal,
        CRTN_PROC_CD_RNG_TYP_VAL_LEN);
    localCrtnProcCdRngTypValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnProcCdRngTypValConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnProcCdRngTypVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCrtnProcCdRngTypVal() {
    return (substring(
        getStringValue(),
        beginCrtnProcCdRngTypVal,
        beginCrtnProcCdRngTypVal + CRTN_PROC_CD_RNG_TYP_VAL_LEN));
  }

  int localCrtnProvOrgTypCdCounter = -1;

  public boolean isCrtnProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnProvOrgTypCdCounter != sharedCounter;
    localCrtnProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this CrtnProvOrgTypCd */
  protected void serializeCrtnProvOrgTypCd(char[] crtnProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnProvOrgTypCd, 0, getStringValue(), beginCrtnProvOrgTypCd, CRTN_PROV_ORG_TYP_CD_LEN);
    localCrtnProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshCrtnProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnProvOrgTypCd() {
    return (substring(
        getStringValue(), beginCrtnProvOrgTypCd, beginCrtnProvOrgTypCd + CRTN_PROV_ORG_TYP_CD_LEN));
  }

  int localCrtnHipaaCommtTxtCounter = -1;

  public boolean isCrtnHipaaCommtTxtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnHipaaCommtTxtCounter != sharedCounter;
    localCrtnHipaaCommtTxtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_HIPAA_COMMT_TXT_LEN = 300;
  /** serialize this CrtnHipaaCommtTxt */
  protected void serializeCrtnHipaaCommtTxt(char[] crtnHipaaCommtTxt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnHipaaCommtTxt, 0, getStringValue(), beginCrtnHipaaCommtTxt, CRTN_HIPAA_COMMT_TXT_LEN);
    localCrtnHipaaCommtTxtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnHipaaCommtTxtConstraints(char[] value) {
    return super.checkConstraints(value, 300, false, false);
  }
  /**
   * refreshCrtnHipaaCommtTxt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnHipaaCommtTxt() {
    return (substring(
        getStringValue(),
        beginCrtnHipaaCommtTxt,
        beginCrtnHipaaCommtTxt + CRTN_HIPAA_COMMT_TXT_LEN));
  }
}
