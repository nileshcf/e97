package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiReqRowNonkeyDataSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReqRowNonkeyDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReqRowNonkeyDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQ_ROW_NONKEY_DATA_LENGTH = 63;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiReqRowSrvcCd;
  protected int beginBhiReqRowPlofsrvcCd;
  protected int beginBhiReqRowCausCd;
  protected int beginBhiReqRowBenLvlCd;
  protected int beginBhiReqRowProcFrom;
  protected int beginBhiReqRowProcTo;
  protected int beginBhiReqRowProcType;
  protected int beginBhiReqRowInn;
  protected int beginBhiReqRowTier;
  protected int beginBhiReqRowLstupdUsrid;
  protected int beginBhiReqRowLstupdDttm;
  protected int beginBhiReqRowStsCd;
  protected int beginBhiReqRowProvOrgTypCd;

  /** Constructor for BhiReqRowNonkeyDataSerialized */
  public BhiReqRowNonkeyDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqRowNonkeyDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqRowNonkeyDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReqRowNonkeyDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 106); // serialize this field at offset 106 by default
  }

  /**
   * sets parent for this BhiReqRowNonkeyDataSerialized to the parent and set the serialize offset
   * to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 106 by default
  }
  /** initializes the field in BhiReqRowNonkeyDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQ_ROW_NONKEY_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiReqRowSrvcCd = getStartOffset() + 0; // set offset for serialization

    beginBhiReqRowPlofsrvcCd = getStartOffset() + 6; // set offset for serialization

    beginBhiReqRowCausCd = getStartOffset() + 8; // set offset for serialization

    beginBhiReqRowBenLvlCd = getStartOffset() + 9; // set offset for serialization

    beginBhiReqRowProcFrom = getStartOffset() + 10; // set offset for serialization

    beginBhiReqRowProcTo = getStartOffset() + 17; // set offset for serialization

    beginBhiReqRowProcType = getStartOffset() + 24; // set offset for serialization

    beginBhiReqRowInn = getStartOffset() + 25; // set offset for serialization

    beginBhiReqRowTier = getStartOffset() + 26; // set offset for serialization

    beginBhiReqRowLstupdUsrid = getStartOffset() + 27; // set offset for serialization

    beginBhiReqRowLstupdDttm = getStartOffset() + 33; // set offset for serialization

    beginBhiReqRowStsCd = getStartOffset() + 59; // set offset for serialization

    beginBhiReqRowProvOrgTypCd = getStartOffset() + 60; // set offset for serialization

    /*  end of offset */
  }

  int localBhiReqRowSrvcCdCounter = -1;

  public boolean isBhiReqRowSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowSrvcCdCounter != sharedCounter;
    localBhiReqRowSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_SRVC_CD_LEN = 6;
  /** serialize this BhiReqRowSrvcCd */
  protected void serializeBhiReqRowSrvcCd(char[] bhiReqRowSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowSrvcCd, 0, getStringValue(), beginBhiReqRowSrvcCd, BHI_REQ_ROW_SRVC_CD_LEN);
    localBhiReqRowSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiReqRowSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowSrvcCd() {
    return (substring(
        getStringValue(), beginBhiReqRowSrvcCd, beginBhiReqRowSrvcCd + BHI_REQ_ROW_SRVC_CD_LEN));
  }

  int localBhiReqRowPlofsrvcCdCounter = -1;

  public boolean isBhiReqRowPlofsrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowPlofsrvcCdCounter != sharedCounter;
    localBhiReqRowPlofsrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_PLOFSRVC_CD_LEN = 2;
  /** serialize this BhiReqRowPlofsrvcCd */
  protected void serializeBhiReqRowPlofsrvcCd(char[] bhiReqRowPlofsrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowPlofsrvcCd,
        0,
        getStringValue(),
        beginBhiReqRowPlofsrvcCd,
        BHI_REQ_ROW_PLOFSRVC_CD_LEN);
    localBhiReqRowPlofsrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowPlofsrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiReqRowPlofsrvcCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowPlofsrvcCd() {
    return (substring(
        getStringValue(),
        beginBhiReqRowPlofsrvcCd,
        beginBhiReqRowPlofsrvcCd + BHI_REQ_ROW_PLOFSRVC_CD_LEN));
  }

  int localBhiReqRowCausCdCounter = -1;

  public boolean isBhiReqRowCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowCausCdCounter != sharedCounter;
    localBhiReqRowCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_CAUS_CD_LEN = 1;
  /** serialize this BhiReqRowCausCd */
  protected void serializeBhiReqRowCausCd(char[] bhiReqRowCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowCausCd, 0, getStringValue(), beginBhiReqRowCausCd, BHI_REQ_ROW_CAUS_CD_LEN);
    localBhiReqRowCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowCausCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowCausCd() {
    return (substring(
        getStringValue(), beginBhiReqRowCausCd, beginBhiReqRowCausCd + BHI_REQ_ROW_CAUS_CD_LEN));
  }

  int localBhiReqRowBenLvlCdCounter = -1;

  public boolean isBhiReqRowBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowBenLvlCdCounter != sharedCounter;
    localBhiReqRowBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_BEN_LVL_CD_LEN = 1;
  /** serialize this BhiReqRowBenLvlCd */
  protected void serializeBhiReqRowBenLvlCd(char[] bhiReqRowBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowBenLvlCd, 0, getStringValue(), beginBhiReqRowBenLvlCd, BHI_REQ_ROW_BEN_LVL_CD_LEN);
    localBhiReqRowBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowBenLvlCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowBenLvlCd() {
    return (substring(
        getStringValue(),
        beginBhiReqRowBenLvlCd,
        beginBhiReqRowBenLvlCd + BHI_REQ_ROW_BEN_LVL_CD_LEN));
  }

  int localBhiReqRowProcFromCounter = -1;

  public boolean isBhiReqRowProcFromModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowProcFromCounter != sharedCounter;
    localBhiReqRowProcFromCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_PROC_FROM_LEN = 7;
  /** serialize this BhiReqRowProcFrom */
  protected void serializeBhiReqRowProcFrom(char[] bhiReqRowProcFrom) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowProcFrom, 0, getStringValue(), beginBhiReqRowProcFrom, BHI_REQ_ROW_PROC_FROM_LEN);
    localBhiReqRowProcFromCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowProcFromConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshBhiReqRowProcFrom is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowProcFrom() {
    return (substring(
        getStringValue(),
        beginBhiReqRowProcFrom,
        beginBhiReqRowProcFrom + BHI_REQ_ROW_PROC_FROM_LEN));
  }

  int localBhiReqRowProcToCounter = -1;

  public boolean isBhiReqRowProcToModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowProcToCounter != sharedCounter;
    localBhiReqRowProcToCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_PROC_TO_LEN = 7;
  /** serialize this BhiReqRowProcTo */
  protected void serializeBhiReqRowProcTo(char[] bhiReqRowProcTo) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowProcTo, 0, getStringValue(), beginBhiReqRowProcTo, BHI_REQ_ROW_PROC_TO_LEN);
    localBhiReqRowProcToCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowProcToConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshBhiReqRowProcTo is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowProcTo() {
    return (substring(
        getStringValue(), beginBhiReqRowProcTo, beginBhiReqRowProcTo + BHI_REQ_ROW_PROC_TO_LEN));
  }

  int localBhiReqRowProcTypeCounter = -1;

  public boolean isBhiReqRowProcTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowProcTypeCounter != sharedCounter;
    localBhiReqRowProcTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_PROC_TYPE_LEN = 1;
  /** serialize this BhiReqRowProcType */
  protected void serializeBhiReqRowProcType(char[] bhiReqRowProcType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowProcType, 0, getStringValue(), beginBhiReqRowProcType, BHI_REQ_ROW_PROC_TYPE_LEN);
    localBhiReqRowProcTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowProcTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowProcType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowProcType() {
    return (substring(
        getStringValue(),
        beginBhiReqRowProcType,
        beginBhiReqRowProcType + BHI_REQ_ROW_PROC_TYPE_LEN));
  }

  int localBhiReqRowInnCounter = -1;

  public boolean isBhiReqRowInnModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowInnCounter != sharedCounter;
    localBhiReqRowInnCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_INN_LEN = 1;
  /** serialize this BhiReqRowInn */
  protected void serializeBhiReqRowInn(char[] bhiReqRowInn) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowInn, 0, getStringValue(), beginBhiReqRowInn, BHI_REQ_ROW_INN_LEN);
    localBhiReqRowInnCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowInnConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowInn is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowInn() {
    return (substring(
        getStringValue(), beginBhiReqRowInn, beginBhiReqRowInn + BHI_REQ_ROW_INN_LEN));
  }

  int localBhiReqRowTierCounter = -1;

  public boolean isBhiReqRowTierModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowTierCounter != sharedCounter;
    localBhiReqRowTierCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_TIER_LEN = 1;
  /** serialize this BhiReqRowTier */
  protected void serializeBhiReqRowTier(char[] bhiReqRowTier) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowTier, 0, getStringValue(), beginBhiReqRowTier, BHI_REQ_ROW_TIER_LEN);
    localBhiReqRowTierCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowTierConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowTier is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowTier() {
    return (substring(
        getStringValue(), beginBhiReqRowTier, beginBhiReqRowTier + BHI_REQ_ROW_TIER_LEN));
  }

  int localBhiReqRowLstupdUsridCounter = -1;

  public boolean isBhiReqRowLstupdUsridModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowLstupdUsridCounter != sharedCounter;
    localBhiReqRowLstupdUsridCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_LSTUPD_USRID_LEN = 6;
  /** serialize this BhiReqRowLstupdUsrid */
  protected void serializeBhiReqRowLstupdUsrid(char[] bhiReqRowLstupdUsrid) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowLstupdUsrid,
        0,
        getStringValue(),
        beginBhiReqRowLstupdUsrid,
        BHI_REQ_ROW_LSTUPD_USRID_LEN);
    localBhiReqRowLstupdUsridCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowLstupdUsridConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiReqRowLstupdUsrid is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowLstupdUsrid() {
    return (substring(
        getStringValue(),
        beginBhiReqRowLstupdUsrid,
        beginBhiReqRowLstupdUsrid + BHI_REQ_ROW_LSTUPD_USRID_LEN));
  }

  int localBhiReqRowLstupdDttmCounter = -1;

  public boolean isBhiReqRowLstupdDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowLstupdDttmCounter != sharedCounter;
    localBhiReqRowLstupdDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_LSTUPD_DTTM_LEN = 26;
  /** serialize this BhiReqRowLstupdDttm */
  protected void serializeBhiReqRowLstupdDttm(char[] bhiReqRowLstupdDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowLstupdDttm,
        0,
        getStringValue(),
        beginBhiReqRowLstupdDttm,
        BHI_REQ_ROW_LSTUPD_DTTM_LEN);
    localBhiReqRowLstupdDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowLstupdDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshBhiReqRowLstupdDttm is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowLstupdDttm() {
    return (substring(
        getStringValue(),
        beginBhiReqRowLstupdDttm,
        beginBhiReqRowLstupdDttm + BHI_REQ_ROW_LSTUPD_DTTM_LEN));
  }

  int localBhiReqRowStsCdCounter = -1;

  public boolean isBhiReqRowStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowStsCdCounter != sharedCounter;
    localBhiReqRowStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_STS_CD_LEN = 1;
  /** serialize this BhiReqRowStsCd */
  protected void serializeBhiReqRowStsCd(char[] bhiReqRowStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowStsCd, 0, getStringValue(), beginBhiReqRowStsCd, BHI_REQ_ROW_STS_CD_LEN);
    localBhiReqRowStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowStsCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowStsCd() {
    return (substring(
        getStringValue(), beginBhiReqRowStsCd, beginBhiReqRowStsCd + BHI_REQ_ROW_STS_CD_LEN));
  }

  int localBhiReqRowProvOrgTypCdCounter = -1;

  public boolean isBhiReqRowProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowProvOrgTypCdCounter != sharedCounter;
    localBhiReqRowProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this BhiReqRowProvOrgTypCd */
  protected void serializeBhiReqRowProvOrgTypCd(char[] bhiReqRowProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowProvOrgTypCd,
        0,
        getStringValue(),
        beginBhiReqRowProvOrgTypCd,
        BHI_REQ_ROW_PROV_ORG_TYP_CD_LEN);
    localBhiReqRowProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshBhiReqRowProvOrgTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowProvOrgTypCd() {
    return (substring(
        getStringValue(),
        beginBhiReqRowProvOrgTypCd,
        beginBhiReqRowProvOrgTypCd + BHI_REQ_ROW_PROV_ORG_TYP_CD_LEN));
  }
}
