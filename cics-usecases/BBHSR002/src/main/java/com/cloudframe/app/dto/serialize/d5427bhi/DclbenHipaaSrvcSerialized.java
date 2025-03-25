package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class DclbenHipaaSrvcSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclbenHipaaSrvcSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclbenHipaaSrvcSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLBEN_HIPAA_SRVC_LENGTH = 122;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDbhsSlotTblId;
  protected int beginDbhsHipaaCd;
  protected int beginDbhsHipaaVerNbr;
  protected int beginDbhsNtwkTypCd;
  protected int beginDbhsEffDt;
  protected int beginDbhsCancDt;
  protected int beginDbhsCreatDttm;
  protected int beginDbhsStsCd;
  protected int beginDbhsSrvcCd;
  protected int beginDbhsPlOfSrvcCd;
  protected int beginDbhsCausCd;
  protected int beginDbhsBenLvlCd;
  protected int beginDbhsInNtwkClssCd;
  protected int beginDbhsTier1NtwkClssCd;
  protected int beginDbhsProcCdRngBegnVal;
  protected int beginDbhsProcCdRngEndVal;
  protected int beginDbhsProcCdRngTypVal;
  protected int beginDbhsLstUpdtDttm;
  protected int beginDbhsLstUpdtUserId;
  protected int beginDbhsProvOrgTypCd;

  /** Constructor for DclbenHipaaSrvcSerialized */
  public DclbenHipaaSrvcSerialized() {
    init(0);
  }

  /** initializes the field in DclbenHipaaSrvcSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLBEN_HIPAA_SRVC_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDbhsSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginDbhsHipaaCd = getStartOffset() + 6; // set offset for serialization

    beginDbhsHipaaVerNbr = getStartOffset() + 8; // set offset for serialization

    beginDbhsNtwkTypCd = getStartOffset() + 9; // set offset for serialization

    beginDbhsEffDt = getStartOffset() + 10; // set offset for serialization

    beginDbhsCancDt = getStartOffset() + 20; // set offset for serialization

    beginDbhsCreatDttm = getStartOffset() + 30; // set offset for serialization

    beginDbhsStsCd = getStartOffset() + 56; // set offset for serialization

    beginDbhsSrvcCd = getStartOffset() + 57; // set offset for serialization

    beginDbhsPlOfSrvcCd = getStartOffset() + 63; // set offset for serialization

    beginDbhsCausCd = getStartOffset() + 65; // set offset for serialization

    beginDbhsBenLvlCd = getStartOffset() + 66; // set offset for serialization

    beginDbhsInNtwkClssCd = getStartOffset() + 67; // set offset for serialization

    beginDbhsTier1NtwkClssCd = getStartOffset() + 68; // set offset for serialization

    beginDbhsProcCdRngBegnVal = getStartOffset() + 69; // set offset for serialization

    beginDbhsProcCdRngEndVal = getStartOffset() + 76; // set offset for serialization

    beginDbhsProcCdRngTypVal = getStartOffset() + 83; // set offset for serialization

    beginDbhsLstUpdtDttm = getStartOffset() + 84; // set offset for serialization

    beginDbhsLstUpdtUserId = getStartOffset() + 110; // set offset for serialization

    beginDbhsProvOrgTypCd = getStartOffset() + 119; // set offset for serialization

    /*  end of offset */
  }

  int localDbhsSlotTblIdCounter = -1;

  public boolean isDbhsSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsSlotTblIdCounter != sharedCounter;
    localDbhsSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_SLOT_TBL_ID_LEN = 6;
  /** serialize this DbhsSlotTblId */
  protected void serializeDbhsSlotTblId(char[] dbhsSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsSlotTblId, 0, getStringValue(), beginDbhsSlotTblId, DBHS_SLOT_TBL_ID_LEN);
    localDbhsSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDbhsSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsSlotTblId() {
    return (substring(
        getStringValue(), beginDbhsSlotTblId, beginDbhsSlotTblId + DBHS_SLOT_TBL_ID_LEN));
  }

  int localDbhsHipaaCdCounter = -1;

  public boolean isDbhsHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsHipaaCdCounter != sharedCounter;
    localDbhsHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_HIPAA_CD_LEN = 2;
  /** serialize this DbhsHipaaCd */
  protected void serializeDbhsHipaaCd(char[] dbhsHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsHipaaCd, 0, getStringValue(), beginDbhsHipaaCd, DBHS_HIPAA_CD_LEN);
    localDbhsHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDbhsHipaaCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsHipaaCd() {
    return (substring(getStringValue(), beginDbhsHipaaCd, beginDbhsHipaaCd + DBHS_HIPAA_CD_LEN));
  }

  int localDbhsHipaaVerNbrCounter = -1;

  public boolean isDbhsHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsHipaaVerNbrCounter != sharedCounter;
    localDbhsHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_HIPAA_VER_NBR_LEN = 1;
  /** serialize this DbhsHipaaVerNbr */
  protected void serializeDbhsHipaaVerNbr(char[] dbhsHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsHipaaVerNbr, 0, getStringValue(), beginDbhsHipaaVerNbr, DBHS_HIPAA_VER_NBR_LEN);
    localDbhsHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsHipaaVerNbr() {
    return (substring(
        getStringValue(), beginDbhsHipaaVerNbr, beginDbhsHipaaVerNbr + DBHS_HIPAA_VER_NBR_LEN));
  }

  int localDbhsNtwkTypCdCounter = -1;

  public boolean isDbhsNtwkTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsNtwkTypCdCounter != sharedCounter;
    localDbhsNtwkTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_NTWK_TYP_CD_LEN = 1;
  /** serialize this DbhsNtwkTypCd */
  protected void serializeDbhsNtwkTypCd(char[] dbhsNtwkTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsNtwkTypCd, 0, getStringValue(), beginDbhsNtwkTypCd, DBHS_NTWK_TYP_CD_LEN);
    localDbhsNtwkTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsNtwkTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsNtwkTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsNtwkTypCd() {
    return (substring(
        getStringValue(), beginDbhsNtwkTypCd, beginDbhsNtwkTypCd + DBHS_NTWK_TYP_CD_LEN));
  }

  int localDbhsEffDtCounter = -1;

  public boolean isDbhsEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsEffDtCounter != sharedCounter;
    localDbhsEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_EFF_DT_LEN = 10;
  /** serialize this DbhsEffDt */
  protected void serializeDbhsEffDt(char[] dbhsEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsEffDt, 0, getStringValue(), beginDbhsEffDt, DBHS_EFF_DT_LEN);
    localDbhsEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDbhsEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsEffDt() {
    return (substring(getStringValue(), beginDbhsEffDt, beginDbhsEffDt + DBHS_EFF_DT_LEN));
  }

  int localDbhsCancDtCounter = -1;

  public boolean isDbhsCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsCancDtCounter != sharedCounter;
    localDbhsCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_CANC_DT_LEN = 10;
  /** serialize this DbhsCancDt */
  protected void serializeDbhsCancDt(char[] dbhsCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsCancDt, 0, getStringValue(), beginDbhsCancDt, DBHS_CANC_DT_LEN);
    localDbhsCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDbhsCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsCancDt() {
    return (substring(getStringValue(), beginDbhsCancDt, beginDbhsCancDt + DBHS_CANC_DT_LEN));
  }

  int localDbhsCreatDttmCounter = -1;

  public boolean isDbhsCreatDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsCreatDttmCounter != sharedCounter;
    localDbhsCreatDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_CREAT_DTTM_LEN = 26;
  /** serialize this DbhsCreatDttm */
  protected void serializeDbhsCreatDttm(char[] dbhsCreatDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsCreatDttm, 0, getStringValue(), beginDbhsCreatDttm, DBHS_CREAT_DTTM_LEN);
    localDbhsCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsCreatDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDbhsCreatDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsCreatDttm() {
    return (substring(
        getStringValue(), beginDbhsCreatDttm, beginDbhsCreatDttm + DBHS_CREAT_DTTM_LEN));
  }

  int localDbhsStsCdCounter = -1;

  public boolean isDbhsStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsStsCdCounter != sharedCounter;
    localDbhsStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_STS_CD_LEN = 1;
  /** serialize this DbhsStsCd */
  protected void serializeDbhsStsCd(char[] dbhsStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsStsCd, 0, getStringValue(), beginDbhsStsCd, DBHS_STS_CD_LEN);
    localDbhsStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsStsCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsStsCd() {
    return (substring(getStringValue(), beginDbhsStsCd, beginDbhsStsCd + DBHS_STS_CD_LEN));
  }

  int localDbhsSrvcCdCounter = -1;

  public boolean isDbhsSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsSrvcCdCounter != sharedCounter;
    localDbhsSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_SRVC_CD_LEN = 6;
  /** serialize this DbhsSrvcCd */
  protected void serializeDbhsSrvcCd(char[] dbhsSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsSrvcCd, 0, getStringValue(), beginDbhsSrvcCd, DBHS_SRVC_CD_LEN);
    localDbhsSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDbhsSrvcCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsSrvcCd() {
    return (substring(getStringValue(), beginDbhsSrvcCd, beginDbhsSrvcCd + DBHS_SRVC_CD_LEN));
  }

  int localDbhsPlOfSrvcCdCounter = -1;

  public boolean isDbhsPlOfSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsPlOfSrvcCdCounter != sharedCounter;
    localDbhsPlOfSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_PL_OF_SRVC_CD_LEN = 2;
  /** serialize this DbhsPlOfSrvcCd */
  protected void serializeDbhsPlOfSrvcCd(char[] dbhsPlOfSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsPlOfSrvcCd, 0, getStringValue(), beginDbhsPlOfSrvcCd, DBHS_PL_OF_SRVC_CD_LEN);
    localDbhsPlOfSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsPlOfSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDbhsPlOfSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsPlOfSrvcCd() {
    return (substring(
        getStringValue(), beginDbhsPlOfSrvcCd, beginDbhsPlOfSrvcCd + DBHS_PL_OF_SRVC_CD_LEN));
  }

  int localDbhsCausCdCounter = -1;

  public boolean isDbhsCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsCausCdCounter != sharedCounter;
    localDbhsCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_CAUS_CD_LEN = 1;
  /** serialize this DbhsCausCd */
  protected void serializeDbhsCausCd(char[] dbhsCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsCausCd, 0, getStringValue(), beginDbhsCausCd, DBHS_CAUS_CD_LEN);
    localDbhsCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsCausCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsCausCd() {
    return (substring(getStringValue(), beginDbhsCausCd, beginDbhsCausCd + DBHS_CAUS_CD_LEN));
  }

  int localDbhsBenLvlCdCounter = -1;

  public boolean isDbhsBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsBenLvlCdCounter != sharedCounter;
    localDbhsBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_BEN_LVL_CD_LEN = 1;
  /** serialize this DbhsBenLvlCd */
  protected void serializeDbhsBenLvlCd(char[] dbhsBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsBenLvlCd, 0, getStringValue(), beginDbhsBenLvlCd, DBHS_BEN_LVL_CD_LEN);
    localDbhsBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsBenLvlCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsBenLvlCd() {
    return (substring(
        getStringValue(), beginDbhsBenLvlCd, beginDbhsBenLvlCd + DBHS_BEN_LVL_CD_LEN));
  }

  int localDbhsInNtwkClssCdCounter = -1;

  public boolean isDbhsInNtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsInNtwkClssCdCounter != sharedCounter;
    localDbhsInNtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_IN_NTWK_CLSS_CD_LEN = 1;
  /** serialize this DbhsInNtwkClssCd */
  protected void serializeDbhsInNtwkClssCd(char[] dbhsInNtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsInNtwkClssCd, 0, getStringValue(), beginDbhsInNtwkClssCd, DBHS_IN_NTWK_CLSS_CD_LEN);
    localDbhsInNtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsInNtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsInNtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsInNtwkClssCd() {
    return (substring(
        getStringValue(), beginDbhsInNtwkClssCd, beginDbhsInNtwkClssCd + DBHS_IN_NTWK_CLSS_CD_LEN));
  }

  int localDbhsTier1NtwkClssCdCounter = -1;

  public boolean isDbhsTier1NtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsTier1NtwkClssCdCounter != sharedCounter;
    localDbhsTier1NtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_TIER_1_NTWK_CLSS_CD_LEN = 1;
  /** serialize this DbhsTier1NtwkClssCd */
  protected void serializeDbhsTier1NtwkClssCd(char[] dbhsTier1NtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsTier1NtwkClssCd,
        0,
        getStringValue(),
        beginDbhsTier1NtwkClssCd,
        DBHS_TIER_1_NTWK_CLSS_CD_LEN);
    localDbhsTier1NtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsTier1NtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsTier1NtwkClssCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDbhsTier1NtwkClssCd() {
    return (substring(
        getStringValue(),
        beginDbhsTier1NtwkClssCd,
        beginDbhsTier1NtwkClssCd + DBHS_TIER_1_NTWK_CLSS_CD_LEN));
  }

  int localDbhsProcCdRngBegnValCounter = -1;

  public boolean isDbhsProcCdRngBegnValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsProcCdRngBegnValCounter != sharedCounter;
    localDbhsProcCdRngBegnValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_PROC_CD_RNG_BEGN_VAL_LEN = 7;
  /** serialize this DbhsProcCdRngBegnVal */
  protected void serializeDbhsProcCdRngBegnVal(char[] dbhsProcCdRngBegnVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsProcCdRngBegnVal,
        0,
        getStringValue(),
        beginDbhsProcCdRngBegnVal,
        DBHS_PROC_CD_RNG_BEGN_VAL_LEN);
    localDbhsProcCdRngBegnValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsProcCdRngBegnValConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshDbhsProcCdRngBegnVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDbhsProcCdRngBegnVal() {
    return (substring(
        getStringValue(),
        beginDbhsProcCdRngBegnVal,
        beginDbhsProcCdRngBegnVal + DBHS_PROC_CD_RNG_BEGN_VAL_LEN));
  }

  int localDbhsProcCdRngEndValCounter = -1;

  public boolean isDbhsProcCdRngEndValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsProcCdRngEndValCounter != sharedCounter;
    localDbhsProcCdRngEndValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_PROC_CD_RNG_END_VAL_LEN = 7;
  /** serialize this DbhsProcCdRngEndVal */
  protected void serializeDbhsProcCdRngEndVal(char[] dbhsProcCdRngEndVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsProcCdRngEndVal,
        0,
        getStringValue(),
        beginDbhsProcCdRngEndVal,
        DBHS_PROC_CD_RNG_END_VAL_LEN);
    localDbhsProcCdRngEndValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsProcCdRngEndValConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshDbhsProcCdRngEndVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDbhsProcCdRngEndVal() {
    return (substring(
        getStringValue(),
        beginDbhsProcCdRngEndVal,
        beginDbhsProcCdRngEndVal + DBHS_PROC_CD_RNG_END_VAL_LEN));
  }

  int localDbhsProcCdRngTypValCounter = -1;

  public boolean isDbhsProcCdRngTypValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsProcCdRngTypValCounter != sharedCounter;
    localDbhsProcCdRngTypValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_PROC_CD_RNG_TYP_VAL_LEN = 1;
  /** serialize this DbhsProcCdRngTypVal */
  protected void serializeDbhsProcCdRngTypVal(char[] dbhsProcCdRngTypVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsProcCdRngTypVal,
        0,
        getStringValue(),
        beginDbhsProcCdRngTypVal,
        DBHS_PROC_CD_RNG_TYP_VAL_LEN);
    localDbhsProcCdRngTypValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsProcCdRngTypValConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsProcCdRngTypVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDbhsProcCdRngTypVal() {
    return (substring(
        getStringValue(),
        beginDbhsProcCdRngTypVal,
        beginDbhsProcCdRngTypVal + DBHS_PROC_CD_RNG_TYP_VAL_LEN));
  }

  int localDbhsLstUpdtDttmCounter = -1;

  public boolean isDbhsLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsLstUpdtDttmCounter != sharedCounter;
    localDbhsLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_LST_UPDT_DTTM_LEN = 26;
  /** serialize this DbhsLstUpdtDttm */
  protected void serializeDbhsLstUpdtDttm(char[] dbhsLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsLstUpdtDttm, 0, getStringValue(), beginDbhsLstUpdtDttm, DBHS_LST_UPDT_DTTM_LEN);
    localDbhsLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDbhsLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsLstUpdtDttm() {
    return (substring(
        getStringValue(), beginDbhsLstUpdtDttm, beginDbhsLstUpdtDttm + DBHS_LST_UPDT_DTTM_LEN));
  }

  int localDbhsLstUpdtUserIdCounter = -1;

  public boolean isDbhsLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsLstUpdtUserIdCounter != sharedCounter;
    localDbhsLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this DbhsLstUpdtUserId */
  protected void serializeDbhsLstUpdtUserId(char[] dbhsLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsLstUpdtUserId, 0, getStringValue(), beginDbhsLstUpdtUserId, DBHS_LST_UPDT_USER_ID_LEN);
    localDbhsLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshDbhsLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsLstUpdtUserId() {
    return (substring(
        getStringValue(),
        beginDbhsLstUpdtUserId,
        beginDbhsLstUpdtUserId + DBHS_LST_UPDT_USER_ID_LEN));
  }

  int localDbhsProvOrgTypCdCounter = -1;

  public boolean isDbhsProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsProvOrgTypCdCounter != sharedCounter;
    localDbhsProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHS_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this DbhsProvOrgTypCd */
  protected void serializeDbhsProvOrgTypCd(char[] dbhsProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsProvOrgTypCd, 0, getStringValue(), beginDbhsProvOrgTypCd, DBHS_PROV_ORG_TYP_CD_LEN);
    localDbhsProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshDbhsProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsProvOrgTypCd() {
    return (substring(
        getStringValue(), beginDbhsProvOrgTypCd, beginDbhsProvOrgTypCd + DBHS_PROV_ORG_TYP_CD_LEN));
  }
}
