package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class DclbenHipaaSrvcDtlsSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclbenHipaaSrvcDtlsSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclbenHipaaSrvcDtlsSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLBEN_HIPAA_SRVC_DTLS_LENGTH = 394;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDbhsdSlotTblId;
  protected int beginDbhsdHipaaCd;
  protected int beginDbhsdHipaaVerNbr;
  protected int beginDbhsdNtwkTypCd;
  protected int beginDbhsdEffDt;
  protected int beginDbhsdCancDt;
  protected int beginDbhsdCreatDttm;
  protected int beginDbhsdLstUpdtDttm;
  protected int beginDbhsdStsCd;
  protected int beginDbhsdLstUpdtUserId;

  /** Constructor for DclbenHipaaSrvcDtlsSerialized */
  public DclbenHipaaSrvcDtlsSerialized() {
    init(0);
  }

  /** initializes the field in DclbenHipaaSrvcDtlsSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLBEN_HIPAA_SRVC_DTLS_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDbhsdSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginDbhsdHipaaCd = getStartOffset() + 6; // set offset for serialization

    beginDbhsdHipaaVerNbr = getStartOffset() + 8; // set offset for serialization

    beginDbhsdNtwkTypCd = getStartOffset() + 9; // set offset for serialization

    beginDbhsdEffDt = getStartOffset() + 10; // set offset for serialization

    beginDbhsdCancDt = getStartOffset() + 20; // set offset for serialization

    beginDbhsdCreatDttm = getStartOffset() + 30; // set offset for serialization

    beginDbhsdLstUpdtDttm = getStartOffset() + 56; // set offset for serialization

    beginDbhsdStsCd = getStartOffset() + 82; // set offset for serialization

    beginDbhsdLstUpdtUserId = getStartOffset() + 83; // set offset for serialization

    /*  end of offset */
  }

  int localDbhsdSlotTblIdCounter = -1;

  public boolean isDbhsdSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdSlotTblIdCounter != sharedCounter;
    localDbhsdSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_SLOT_TBL_ID_LEN = 6;
  /** serialize this DbhsdSlotTblId */
  protected void serializeDbhsdSlotTblId(char[] dbhsdSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsdSlotTblId, 0, getStringValue(), beginDbhsdSlotTblId, DBHSD_SLOT_TBL_ID_LEN);
    localDbhsdSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDbhsdSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdSlotTblId() {
    return (substring(
        getStringValue(), beginDbhsdSlotTblId, beginDbhsdSlotTblId + DBHSD_SLOT_TBL_ID_LEN));
  }

  int localDbhsdHipaaCdCounter = -1;

  public boolean isDbhsdHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdHipaaCdCounter != sharedCounter;
    localDbhsdHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_HIPAA_CD_LEN = 2;
  /** serialize this DbhsdHipaaCd */
  protected void serializeDbhsdHipaaCd(char[] dbhsdHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsdHipaaCd, 0, getStringValue(), beginDbhsdHipaaCd, DBHSD_HIPAA_CD_LEN);
    localDbhsdHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDbhsdHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdHipaaCd() {
    return (substring(getStringValue(), beginDbhsdHipaaCd, beginDbhsdHipaaCd + DBHSD_HIPAA_CD_LEN));
  }

  int localDbhsdHipaaVerNbrCounter = -1;

  public boolean isDbhsdHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdHipaaVerNbrCounter != sharedCounter;
    localDbhsdHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_HIPAA_VER_NBR_LEN = 1;
  /** serialize this DbhsdHipaaVerNbr */
  protected void serializeDbhsdHipaaVerNbr(char[] dbhsdHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsdHipaaVerNbr, 0, getStringValue(), beginDbhsdHipaaVerNbr, DBHSD_HIPAA_VER_NBR_LEN);
    localDbhsdHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsdHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdHipaaVerNbr() {
    return (substring(
        getStringValue(), beginDbhsdHipaaVerNbr, beginDbhsdHipaaVerNbr + DBHSD_HIPAA_VER_NBR_LEN));
  }

  int localDbhsdNtwkTypCdCounter = -1;

  public boolean isDbhsdNtwkTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdNtwkTypCdCounter != sharedCounter;
    localDbhsdNtwkTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_NTWK_TYP_CD_LEN = 1;
  /** serialize this DbhsdNtwkTypCd */
  protected void serializeDbhsdNtwkTypCd(char[] dbhsdNtwkTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsdNtwkTypCd, 0, getStringValue(), beginDbhsdNtwkTypCd, DBHSD_NTWK_TYP_CD_LEN);
    localDbhsdNtwkTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdNtwkTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsdNtwkTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdNtwkTypCd() {
    return (substring(
        getStringValue(), beginDbhsdNtwkTypCd, beginDbhsdNtwkTypCd + DBHSD_NTWK_TYP_CD_LEN));
  }

  int localDbhsdEffDtCounter = -1;

  public boolean isDbhsdEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdEffDtCounter != sharedCounter;
    localDbhsdEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_EFF_DT_LEN = 10;
  /** serialize this DbhsdEffDt */
  protected void serializeDbhsdEffDt(char[] dbhsdEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsdEffDt, 0, getStringValue(), beginDbhsdEffDt, DBHSD_EFF_DT_LEN);
    localDbhsdEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDbhsdEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsdEffDt() {
    return (substring(getStringValue(), beginDbhsdEffDt, beginDbhsdEffDt + DBHSD_EFF_DT_LEN));
  }

  int localDbhsdCancDtCounter = -1;

  public boolean isDbhsdCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdCancDtCounter != sharedCounter;
    localDbhsdCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_CANC_DT_LEN = 10;
  /** serialize this DbhsdCancDt */
  protected void serializeDbhsdCancDt(char[] dbhsdCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsdCancDt, 0, getStringValue(), beginDbhsdCancDt, DBHSD_CANC_DT_LEN);
    localDbhsdCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDbhsdCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsdCancDt() {
    return (substring(getStringValue(), beginDbhsdCancDt, beginDbhsdCancDt + DBHSD_CANC_DT_LEN));
  }

  int localDbhsdCreatDttmCounter = -1;

  public boolean isDbhsdCreatDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdCreatDttmCounter != sharedCounter;
    localDbhsdCreatDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_CREAT_DTTM_LEN = 26;
  /** serialize this DbhsdCreatDttm */
  protected void serializeDbhsdCreatDttm(char[] dbhsdCreatDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsdCreatDttm, 0, getStringValue(), beginDbhsdCreatDttm, DBHSD_CREAT_DTTM_LEN);
    localDbhsdCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdCreatDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDbhsdCreatDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdCreatDttm() {
    return (substring(
        getStringValue(), beginDbhsdCreatDttm, beginDbhsdCreatDttm + DBHSD_CREAT_DTTM_LEN));
  }

  int localDbhsdLstUpdtDttmCounter = -1;

  public boolean isDbhsdLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdLstUpdtDttmCounter != sharedCounter;
    localDbhsdLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_LST_UPDT_DTTM_LEN = 26;
  /** serialize this DbhsdLstUpdtDttm */
  protected void serializeDbhsdLstUpdtDttm(char[] dbhsdLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsdLstUpdtDttm, 0, getStringValue(), beginDbhsdLstUpdtDttm, DBHSD_LST_UPDT_DTTM_LEN);
    localDbhsdLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDbhsdLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdLstUpdtDttm() {
    return (substring(
        getStringValue(), beginDbhsdLstUpdtDttm, beginDbhsdLstUpdtDttm + DBHSD_LST_UPDT_DTTM_LEN));
  }

  int localDbhsdStsCdCounter = -1;

  public boolean isDbhsdStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdStsCdCounter != sharedCounter;
    localDbhsdStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_STS_CD_LEN = 1;
  /** serialize this DbhsdStsCd */
  protected void serializeDbhsdStsCd(char[] dbhsdStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dbhsdStsCd, 0, getStringValue(), beginDbhsdStsCd, DBHSD_STS_CD_LEN);
    localDbhsdStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDbhsdStsCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDbhsdStsCd() {
    return (substring(getStringValue(), beginDbhsdStsCd, beginDbhsdStsCd + DBHSD_STS_CD_LEN));
  }

  int localDbhsdLstUpdtUserIdCounter = -1;

  public boolean isDbhsdLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdLstUpdtUserIdCounter != sharedCounter;
    localDbhsdLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this DbhsdLstUpdtUserId */
  protected void serializeDbhsdLstUpdtUserId(char[] dbhsdLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsdLstUpdtUserId,
        0,
        getStringValue(),
        beginDbhsdLstUpdtUserId,
        DBHSD_LST_UPDT_USER_ID_LEN);
    localDbhsdLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshDbhsdLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdLstUpdtUserId() {
    return (substring(
        getStringValue(),
        beginDbhsdLstUpdtUserId,
        beginDbhsdLstUpdtUserId + DBHSD_LST_UPDT_USER_ID_LEN));
  }
}
