package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiKeySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_KEY_LENGTH = 56;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiSlotTblId;
  protected int beginBhiHipaaVerNbr;
  protected int beginBhiHipaaCd;
  protected int beginBhiNetId;
  protected int beginBhiEffDate;
  protected int beginBhiCancDate;
  protected int beginBhiLstupdDttm;

  /** Constructor for BhiKeySerialized */
  public BhiKeySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiKeySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiKeySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiKeySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this BhiKeySerialized to the parent and set the serialize offset to parameter
   * begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in BhiKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginBhiHipaaVerNbr = getStartOffset() + 6; // set offset for serialization

    beginBhiHipaaCd = getStartOffset() + 7; // set offset for serialization

    beginBhiNetId = getStartOffset() + 9; // set offset for serialization

    beginBhiEffDate = getStartOffset() + 10; // set offset for serialization

    beginBhiCancDate = getStartOffset() + 20; // set offset for serialization

    beginBhiLstupdDttm = getStartOffset() + 30; // set offset for serialization

    /*  end of offset */
  }

  int localBhiSlotTblIdCounter = -1;

  public boolean isBhiSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiSlotTblIdCounter != sharedCounter;
    localBhiSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_SLOT_TBL_ID_LEN = 6;
  /** serialize this BhiSlotTblId */
  protected void serializeBhiSlotTblId(char[] bhiSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiSlotTblId, 0, getStringValue(), beginBhiSlotTblId, BHI_SLOT_TBL_ID_LEN);
    localBhiSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiSlotTblId() {
    return (substring(
        getStringValue(), beginBhiSlotTblId, beginBhiSlotTblId + BHI_SLOT_TBL_ID_LEN));
  }

  int localBhiHipaaVerNbrCounter = -1;

  public boolean isBhiHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiHipaaVerNbrCounter != sharedCounter;
    localBhiHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_HIPAA_VER_NBR_LEN = 1;
  /** serialize this BhiHipaaVerNbr */
  protected void serializeBhiHipaaVerNbr(char[] bhiHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiHipaaVerNbr, 0, getStringValue(), beginBhiHipaaVerNbr, BHI_HIPAA_VER_NBR_LEN);
    localBhiHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiHipaaVerNbr() {
    return (substring(
        getStringValue(), beginBhiHipaaVerNbr, beginBhiHipaaVerNbr + BHI_HIPAA_VER_NBR_LEN));
  }

  int localBhiHipaaCdCounter = -1;

  public boolean isBhiHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiHipaaCdCounter != sharedCounter;
    localBhiHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_HIPAA_CD_LEN = 2;
  /** serialize this BhiHipaaCd */
  protected void serializeBhiHipaaCd(char[] bhiHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiHipaaCd, 0, getStringValue(), beginBhiHipaaCd, BHI_HIPAA_CD_LEN);
    localBhiHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiHipaaCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiHipaaCd() {
    return (substring(getStringValue(), beginBhiHipaaCd, beginBhiHipaaCd + BHI_HIPAA_CD_LEN));
  }

  int localBhiNetIdCounter = -1;

  public boolean isBhiNetIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiNetIdCounter != sharedCounter;
    localBhiNetIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_NET_ID_LEN = 1;
  /** serialize this BhiNetId */
  protected void serializeBhiNetId(char[] bhiNetId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiNetId, 0, getStringValue(), beginBhiNetId, BHI_NET_ID_LEN);
    localBhiNetIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiNetIdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiNetId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiNetId() {
    return (substring(getStringValue(), beginBhiNetId, beginBhiNetId + BHI_NET_ID_LEN));
  }

  int localBhiEffDateCounter = -1;

  public boolean isBhiEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiEffDateCounter != sharedCounter;
    localBhiEffDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_EFF_DATE_LEN = 10;
  /** serialize this BhiEffDate */
  protected void serializeBhiEffDate(char[] bhiEffDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiEffDate, 0, getStringValue(), beginBhiEffDate, BHI_EFF_DATE_LEN);
    localBhiEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiEffDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiEffDate is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiEffDate() {
    return (substring(getStringValue(), beginBhiEffDate, beginBhiEffDate + BHI_EFF_DATE_LEN));
  }

  int localBhiCancDateCounter = -1;

  public boolean isBhiCancDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiCancDateCounter != sharedCounter;
    localBhiCancDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_CANC_DATE_LEN = 10;
  /** serialize this BhiCancDate */
  protected void serializeBhiCancDate(char[] bhiCancDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiCancDate, 0, getStringValue(), beginBhiCancDate, BHI_CANC_DATE_LEN);
    localBhiCancDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiCancDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiCancDate is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiCancDate() {
    return (substring(getStringValue(), beginBhiCancDate, beginBhiCancDate + BHI_CANC_DATE_LEN));
  }

  int localBhiLstupdDttmCounter = -1;

  public boolean isBhiLstupdDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiLstupdDttmCounter != sharedCounter;
    localBhiLstupdDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_LSTUPD_DTTM_LEN = 26;
  /** serialize this BhiLstupdDttm */
  protected void serializeBhiLstupdDttm(char[] bhiLstupdDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiLstupdDttm, 0, getStringValue(), beginBhiLstupdDttm, BHI_LSTUPD_DTTM_LEN);
    localBhiLstupdDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiLstupdDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshBhiLstupdDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiLstupdDttm() {
    return (substring(
        getStringValue(), beginBhiLstupdDttm, beginBhiLstupdDttm + BHI_LSTUPD_DTTM_LEN));
  }
}
