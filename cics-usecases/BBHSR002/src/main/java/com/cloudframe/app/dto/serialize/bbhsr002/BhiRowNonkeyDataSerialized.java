package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class BhiRowNonkeyDataSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiRowNonkeyDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiRowNonkeyDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_ROW_NONKEY_DATA_LENGTH = 63;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiRowSrvcCd;
  protected int beginBhiRowPlofsrvcCd;
  protected int beginBhiRowCausCd;
  protected int beginBhiRowBenLvlCd;
  protected int beginBhiRowProcFrom;
  protected int beginBhiRowProcTo;
  protected int beginBhiRowProcType;
  protected int beginBhiRowInn;
  protected int beginBhiRowTier;
  protected int beginBhiRowLstupdDttm;
  protected int beginBhiRowLstupdUsrid;
  protected int beginBhiRowStsCd;
  protected int beginBhiRowProvOrgTypCd;

  /** Constructor for BhiRowNonkeyDataSerialized */
  public BhiRowNonkeyDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRowNonkeyDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRowNonkeyDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiRowNonkeyDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 1636); // serialize this field at offset 1636 by default
  }

  /**
   * sets parent for this BhiRowNonkeyDataSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 1636 by default
  }
  /** initializes the field in BhiRowNonkeyDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_ROW_NONKEY_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiRowSrvcCd = getStartOffset() + 0; // set offset for serialization

    beginBhiRowPlofsrvcCd = getStartOffset() + 6; // set offset for serialization

    beginBhiRowCausCd = getStartOffset() + 8; // set offset for serialization

    beginBhiRowBenLvlCd = getStartOffset() + 9; // set offset for serialization

    beginBhiRowProcFrom = getStartOffset() + 10; // set offset for serialization

    beginBhiRowProcTo = getStartOffset() + 17; // set offset for serialization

    beginBhiRowProcType = getStartOffset() + 24; // set offset for serialization

    beginBhiRowInn = getStartOffset() + 25; // set offset for serialization

    beginBhiRowTier = getStartOffset() + 26; // set offset for serialization

    beginBhiRowLstupdDttm = getStartOffset() + 27; // set offset for serialization

    beginBhiRowLstupdUsrid = getStartOffset() + 53; // set offset for serialization

    beginBhiRowStsCd = getStartOffset() + 59; // set offset for serialization

    beginBhiRowProvOrgTypCd = getStartOffset() + 60; // set offset for serialization

    /*  end of offset */
  }

  int localBhiRowSrvcCdCounter = -1;

  public boolean isBhiRowSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowSrvcCdCounter != sharedCounter;
    localBhiRowSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_SRVC_CD_LEN = 6;
  /** serialize this BhiRowSrvcCd */
  protected void serializeBhiRowSrvcCd(char[] bhiRowSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowSrvcCd, 0, getStringValue(), beginBhiRowSrvcCd, BHI_ROW_SRVC_CD_LEN);
    localBhiRowSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiRowSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowSrvcCd() {
    return (substring(
        getStringValue(), beginBhiRowSrvcCd, beginBhiRowSrvcCd + BHI_ROW_SRVC_CD_LEN));
  }

  int localBhiRowPlofsrvcCdCounter = -1;

  public boolean isBhiRowPlofsrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowPlofsrvcCdCounter != sharedCounter;
    localBhiRowPlofsrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_PLOFSRVC_CD_LEN = 2;
  /** serialize this BhiRowPlofsrvcCd */
  protected void serializeBhiRowPlofsrvcCd(char[] bhiRowPlofsrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRowPlofsrvcCd, 0, getStringValue(), beginBhiRowPlofsrvcCd, BHI_ROW_PLOFSRVC_CD_LEN);
    localBhiRowPlofsrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowPlofsrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiRowPlofsrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowPlofsrvcCd() {
    return (substring(
        getStringValue(), beginBhiRowPlofsrvcCd, beginBhiRowPlofsrvcCd + BHI_ROW_PLOFSRVC_CD_LEN));
  }

  int localBhiRowCausCdCounter = -1;

  public boolean isBhiRowCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowCausCdCounter != sharedCounter;
    localBhiRowCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_CAUS_CD_LEN = 1;
  /** serialize this BhiRowCausCd */
  protected void serializeBhiRowCausCd(char[] bhiRowCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowCausCd, 0, getStringValue(), beginBhiRowCausCd, BHI_ROW_CAUS_CD_LEN);
    localBhiRowCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowCausCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowCausCd() {
    return (substring(
        getStringValue(), beginBhiRowCausCd, beginBhiRowCausCd + BHI_ROW_CAUS_CD_LEN));
  }

  int localBhiRowBenLvlCdCounter = -1;

  public boolean isBhiRowBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowBenLvlCdCounter != sharedCounter;
    localBhiRowBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_BEN_LVL_CD_LEN = 1;
  /** serialize this BhiRowBenLvlCd */
  protected void serializeBhiRowBenLvlCd(char[] bhiRowBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowBenLvlCd, 0, getStringValue(), beginBhiRowBenLvlCd, BHI_ROW_BEN_LVL_CD_LEN);
    localBhiRowBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowBenLvlCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowBenLvlCd() {
    return (substring(
        getStringValue(), beginBhiRowBenLvlCd, beginBhiRowBenLvlCd + BHI_ROW_BEN_LVL_CD_LEN));
  }

  int localBhiRowProcFromCounter = -1;

  public boolean isBhiRowProcFromModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowProcFromCounter != sharedCounter;
    localBhiRowProcFromCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_PROC_FROM_LEN = 7;
  /** serialize this BhiRowProcFrom */
  protected void serializeBhiRowProcFrom(char[] bhiRowProcFrom) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowProcFrom, 0, getStringValue(), beginBhiRowProcFrom, BHI_ROW_PROC_FROM_LEN);
    localBhiRowProcFromCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowProcFromConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshBhiRowProcFrom is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowProcFrom() {
    return (substring(
        getStringValue(), beginBhiRowProcFrom, beginBhiRowProcFrom + BHI_ROW_PROC_FROM_LEN));
  }

  int localBhiRowProcToCounter = -1;

  public boolean isBhiRowProcToModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowProcToCounter != sharedCounter;
    localBhiRowProcToCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_PROC_TO_LEN = 7;
  /** serialize this BhiRowProcTo */
  protected void serializeBhiRowProcTo(char[] bhiRowProcTo) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowProcTo, 0, getStringValue(), beginBhiRowProcTo, BHI_ROW_PROC_TO_LEN);
    localBhiRowProcToCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowProcToConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshBhiRowProcTo is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowProcTo() {
    return (substring(
        getStringValue(), beginBhiRowProcTo, beginBhiRowProcTo + BHI_ROW_PROC_TO_LEN));
  }

  int localBhiRowProcTypeCounter = -1;

  public boolean isBhiRowProcTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowProcTypeCounter != sharedCounter;
    localBhiRowProcTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_PROC_TYPE_LEN = 1;
  /** serialize this BhiRowProcType */
  protected void serializeBhiRowProcType(char[] bhiRowProcType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowProcType, 0, getStringValue(), beginBhiRowProcType, BHI_ROW_PROC_TYPE_LEN);
    localBhiRowProcTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowProcTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowProcType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowProcType() {
    return (substring(
        getStringValue(), beginBhiRowProcType, beginBhiRowProcType + BHI_ROW_PROC_TYPE_LEN));
  }

  int localBhiRowInnCounter = -1;

  public boolean isBhiRowInnModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowInnCounter != sharedCounter;
    localBhiRowInnCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_INN_LEN = 1;
  /** serialize this BhiRowInn */
  protected void serializeBhiRowInn(char[] bhiRowInn) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowInn, 0, getStringValue(), beginBhiRowInn, BHI_ROW_INN_LEN);
    localBhiRowInnCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowInnConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowInn is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiRowInn() {
    return (substring(getStringValue(), beginBhiRowInn, beginBhiRowInn + BHI_ROW_INN_LEN));
  }

  int localBhiRowTierCounter = -1;

  public boolean isBhiRowTierModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowTierCounter != sharedCounter;
    localBhiRowTierCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_TIER_LEN = 1;
  /** serialize this BhiRowTier */
  protected void serializeBhiRowTier(char[] bhiRowTier) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowTier, 0, getStringValue(), beginBhiRowTier, BHI_ROW_TIER_LEN);
    localBhiRowTierCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowTierConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowTier is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiRowTier() {
    return (substring(getStringValue(), beginBhiRowTier, beginBhiRowTier + BHI_ROW_TIER_LEN));
  }

  int localBhiRowLstupdDttmCounter = -1;

  public boolean isBhiRowLstupdDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowLstupdDttmCounter != sharedCounter;
    localBhiRowLstupdDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_LSTUPD_DTTM_LEN = 26;
  /** serialize this BhiRowLstupdDttm */
  protected void serializeBhiRowLstupdDttm(char[] bhiRowLstupdDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRowLstupdDttm, 0, getStringValue(), beginBhiRowLstupdDttm, BHI_ROW_LSTUPD_DTTM_LEN);
    localBhiRowLstupdDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowLstupdDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshBhiRowLstupdDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowLstupdDttm() {
    return (substring(
        getStringValue(), beginBhiRowLstupdDttm, beginBhiRowLstupdDttm + BHI_ROW_LSTUPD_DTTM_LEN));
  }

  int localBhiRowLstupdUsridCounter = -1;

  public boolean isBhiRowLstupdUsridModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowLstupdUsridCounter != sharedCounter;
    localBhiRowLstupdUsridCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_LSTUPD_USRID_LEN = 6;
  /** serialize this BhiRowLstupdUsrid */
  protected void serializeBhiRowLstupdUsrid(char[] bhiRowLstupdUsrid) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRowLstupdUsrid, 0, getStringValue(), beginBhiRowLstupdUsrid, BHI_ROW_LSTUPD_USRID_LEN);
    localBhiRowLstupdUsridCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowLstupdUsridConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiRowLstupdUsrid is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowLstupdUsrid() {
    return (substring(
        getStringValue(),
        beginBhiRowLstupdUsrid,
        beginBhiRowLstupdUsrid + BHI_ROW_LSTUPD_USRID_LEN));
  }

  int localBhiRowStsCdCounter = -1;

  public boolean isBhiRowStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowStsCdCounter != sharedCounter;
    localBhiRowStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_STS_CD_LEN = 1;
  /** serialize this BhiRowStsCd */
  protected void serializeBhiRowStsCd(char[] bhiRowStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowStsCd, 0, getStringValue(), beginBhiRowStsCd, BHI_ROW_STS_CD_LEN);
    localBhiRowStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowStsCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiRowStsCd() {
    return (substring(getStringValue(), beginBhiRowStsCd, beginBhiRowStsCd + BHI_ROW_STS_CD_LEN));
  }

  int localBhiRowProvOrgTypCdCounter = -1;

  public boolean isBhiRowProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowProvOrgTypCdCounter != sharedCounter;
    localBhiRowProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this BhiRowProvOrgTypCd */
  protected void serializeBhiRowProvOrgTypCd(char[] bhiRowProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRowProvOrgTypCd,
        0,
        getStringValue(),
        beginBhiRowProvOrgTypCd,
        BHI_ROW_PROV_ORG_TYP_CD_LEN);
    localBhiRowProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshBhiRowProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowProvOrgTypCd() {
    return (substring(
        getStringValue(),
        beginBhiRowProvOrgTypCd,
        beginBhiRowProvOrgTypCd + BHI_ROW_PROV_ORG_TYP_CD_LEN));
  }
}
