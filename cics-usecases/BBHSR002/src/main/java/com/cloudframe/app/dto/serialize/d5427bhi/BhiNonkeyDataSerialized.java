package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiNonkeyDataSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiNonkeyDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiNonkeyDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_NONKEY_DATA_LENGTH = 40;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiStsCd;
  protected int beginBhiSrvcCd;
  protected int beginBhiPlofsrvcCd;
  protected int beginBhiCausCd;
  protected int beginBhiBenLvlCd;
  protected int beginBhiProcFrom;
  protected int beginBhiProcTo;
  protected int beginBhiProcType;
  protected int beginBhiInn;
  protected int beginBhiTier;
  protected int beginBhiLstupdUsrid;
  protected int beginBhiProvOrgTypCd;

  /** Constructor for BhiNonkeyDataSerialized */
  public BhiNonkeyDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiNonkeyDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiNonkeyDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiNonkeyDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 56); // serialize this field at offset 56 by default
  }

  /**
   * sets parent for this BhiNonkeyDataSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 56 by default
  }
  /** initializes the field in BhiNonkeyDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_NONKEY_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiStsCd = getStartOffset() + 0; // set offset for serialization

    beginBhiSrvcCd = getStartOffset() + 1; // set offset for serialization

    beginBhiPlofsrvcCd = getStartOffset() + 7; // set offset for serialization

    beginBhiCausCd = getStartOffset() + 9; // set offset for serialization

    beginBhiBenLvlCd = getStartOffset() + 10; // set offset for serialization

    beginBhiProcFrom = getStartOffset() + 11; // set offset for serialization

    beginBhiProcTo = getStartOffset() + 18; // set offset for serialization

    beginBhiProcType = getStartOffset() + 25; // set offset for serialization

    beginBhiInn = getStartOffset() + 26; // set offset for serialization

    beginBhiTier = getStartOffset() + 27; // set offset for serialization

    beginBhiLstupdUsrid = getStartOffset() + 28; // set offset for serialization

    beginBhiProvOrgTypCd = getStartOffset() + 37; // set offset for serialization

    /*  end of offset */
  }

  int localBhiStsCdCounter = -1;

  public boolean isBhiStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiStsCdCounter != sharedCounter;
    localBhiStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_STS_CD_LEN = 1;
  /** serialize this BhiStsCd */
  protected void serializeBhiStsCd(char[] bhiStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiStsCd, 0, getStringValue(), beginBhiStsCd, BHI_STS_CD_LEN);
    localBhiStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiStsCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiStsCd() {
    return (substring(getStringValue(), beginBhiStsCd, beginBhiStsCd + BHI_STS_CD_LEN));
  }

  int localBhiSrvcCdCounter = -1;

  public boolean isBhiSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiSrvcCdCounter != sharedCounter;
    localBhiSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_SRVC_CD_LEN = 6;
  /** serialize this BhiSrvcCd */
  protected void serializeBhiSrvcCd(char[] bhiSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiSrvcCd, 0, getStringValue(), beginBhiSrvcCd, BHI_SRVC_CD_LEN);
    localBhiSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiSrvcCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiSrvcCd() {
    return (substring(getStringValue(), beginBhiSrvcCd, beginBhiSrvcCd + BHI_SRVC_CD_LEN));
  }

  int localBhiPlofsrvcCdCounter = -1;

  public boolean isBhiPlofsrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiPlofsrvcCdCounter != sharedCounter;
    localBhiPlofsrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_PLOFSRVC_CD_LEN = 2;
  /** serialize this BhiPlofsrvcCd */
  protected void serializeBhiPlofsrvcCd(char[] bhiPlofsrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiPlofsrvcCd, 0, getStringValue(), beginBhiPlofsrvcCd, BHI_PLOFSRVC_CD_LEN);
    localBhiPlofsrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiPlofsrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiPlofsrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiPlofsrvcCd() {
    return (substring(
        getStringValue(), beginBhiPlofsrvcCd, beginBhiPlofsrvcCd + BHI_PLOFSRVC_CD_LEN));
  }

  int localBhiCausCdCounter = -1;

  public boolean isBhiCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiCausCdCounter != sharedCounter;
    localBhiCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_CAUS_CD_LEN = 1;
  /** serialize this BhiCausCd */
  protected void serializeBhiCausCd(char[] bhiCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiCausCd, 0, getStringValue(), beginBhiCausCd, BHI_CAUS_CD_LEN);
    localBhiCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiCausCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiCausCd() {
    return (substring(getStringValue(), beginBhiCausCd, beginBhiCausCd + BHI_CAUS_CD_LEN));
  }

  int localBhiBenLvlCdCounter = -1;

  public boolean isBhiBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiBenLvlCdCounter != sharedCounter;
    localBhiBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_BEN_LVL_CD_LEN = 1;
  /** serialize this BhiBenLvlCd */
  protected void serializeBhiBenLvlCd(char[] bhiBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiBenLvlCd, 0, getStringValue(), beginBhiBenLvlCd, BHI_BEN_LVL_CD_LEN);
    localBhiBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiBenLvlCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiBenLvlCd() {
    return (substring(getStringValue(), beginBhiBenLvlCd, beginBhiBenLvlCd + BHI_BEN_LVL_CD_LEN));
  }

  int localBhiProcFromCounter = -1;

  public boolean isBhiProcFromModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiProcFromCounter != sharedCounter;
    localBhiProcFromCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_PROC_FROM_LEN = 7;
  /** serialize this BhiProcFrom */
  protected void serializeBhiProcFrom(char[] bhiProcFrom) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiProcFrom, 0, getStringValue(), beginBhiProcFrom, BHI_PROC_FROM_LEN);
    localBhiProcFromCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiProcFromConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshBhiProcFrom is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiProcFrom() {
    return (substring(getStringValue(), beginBhiProcFrom, beginBhiProcFrom + BHI_PROC_FROM_LEN));
  }

  int localBhiProcToCounter = -1;

  public boolean isBhiProcToModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiProcToCounter != sharedCounter;
    localBhiProcToCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_PROC_TO_LEN = 7;
  /** serialize this BhiProcTo */
  protected void serializeBhiProcTo(char[] bhiProcTo) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiProcTo, 0, getStringValue(), beginBhiProcTo, BHI_PROC_TO_LEN);
    localBhiProcToCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiProcToConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshBhiProcTo is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiProcTo() {
    return (substring(getStringValue(), beginBhiProcTo, beginBhiProcTo + BHI_PROC_TO_LEN));
  }

  int localBhiProcTypeCounter = -1;

  public boolean isBhiProcTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiProcTypeCounter != sharedCounter;
    localBhiProcTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_PROC_TYPE_LEN = 1;
  /** serialize this BhiProcType */
  protected void serializeBhiProcType(char[] bhiProcType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiProcType, 0, getStringValue(), beginBhiProcType, BHI_PROC_TYPE_LEN);
    localBhiProcTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiProcTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiProcType is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiProcType() {
    return (substring(getStringValue(), beginBhiProcType, beginBhiProcType + BHI_PROC_TYPE_LEN));
  }

  int localBhiInnCounter = -1;

  public boolean isBhiInnModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiInnCounter != sharedCounter;
    localBhiInnCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_INN_LEN = 1;
  /** serialize this BhiInn */
  protected void serializeBhiInn(char[] bhiInn) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiInn, 0, getStringValue(), beginBhiInn, BHI_INN_LEN);
    localBhiInnCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiInnConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiInn is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiInn() {
    return (substring(getStringValue(), beginBhiInn, beginBhiInn + BHI_INN_LEN));
  }

  int localBhiTierCounter = -1;

  public boolean isBhiTierModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiTierCounter != sharedCounter;
    localBhiTierCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_TIER_LEN = 1;
  /** serialize this BhiTier */
  protected void serializeBhiTier(char[] bhiTier) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiTier, 0, getStringValue(), beginBhiTier, BHI_TIER_LEN);
    localBhiTierCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiTierConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiTier is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiTier() {
    return (substring(getStringValue(), beginBhiTier, beginBhiTier + BHI_TIER_LEN));
  }

  int localBhiLstupdUsridCounter = -1;

  public boolean isBhiLstupdUsridModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiLstupdUsridCounter != sharedCounter;
    localBhiLstupdUsridCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_LSTUPD_USRID_LEN = 9;
  /** serialize this BhiLstupdUsrid */
  protected void serializeBhiLstupdUsrid(char[] bhiLstupdUsrid) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiLstupdUsrid, 0, getStringValue(), beginBhiLstupdUsrid, BHI_LSTUPD_USRID_LEN);
    localBhiLstupdUsridCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiLstupdUsridConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshBhiLstupdUsrid is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiLstupdUsrid() {
    return (substring(
        getStringValue(), beginBhiLstupdUsrid, beginBhiLstupdUsrid + BHI_LSTUPD_USRID_LEN));
  }

  int localBhiProvOrgTypCdCounter = -1;

  public boolean isBhiProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiProvOrgTypCdCounter != sharedCounter;
    localBhiProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this BhiProvOrgTypCd */
  protected void serializeBhiProvOrgTypCd(char[] bhiProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiProvOrgTypCd, 0, getStringValue(), beginBhiProvOrgTypCd, BHI_PROV_ORG_TYP_CD_LEN);
    localBhiProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshBhiProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiProvOrgTypCd() {
    return (substring(
        getStringValue(), beginBhiProvOrgTypCd, beginBhiProvOrgTypCd + BHI_PROV_ORG_TYP_CD_LEN));
  }
}
