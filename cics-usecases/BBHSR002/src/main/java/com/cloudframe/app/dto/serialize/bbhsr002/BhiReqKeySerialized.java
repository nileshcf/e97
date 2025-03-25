package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class BhiReqKeySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReqKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReqKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQ_KEY_LENGTH = 56;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiReqSlotTblId;
  protected int beginBhiReqHipaaVerNbr;
  protected int beginBhiReqHipaaCd;
  protected int beginBhiReqNetId;
  protected int beginBhiReqEffDate;
  protected int beginBhiReqCancDate;
  protected int beginBhiReqLstupdDttm;

  /** Constructor for BhiReqKeySerialized */
  public BhiReqKeySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqKeySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqKeySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReqKeySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 19); // serialize this field at offset 19 by default
  }

  /**
   * sets parent for this BhiReqKeySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 19 by default
  }
  /** initializes the field in BhiReqKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQ_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiReqSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginBhiReqHipaaVerNbr = getStartOffset() + 6; // set offset for serialization

    beginBhiReqHipaaCd = getStartOffset() + 7; // set offset for serialization

    beginBhiReqNetId = getStartOffset() + 9; // set offset for serialization

    beginBhiReqEffDate = getStartOffset() + 10; // set offset for serialization

    beginBhiReqCancDate = getStartOffset() + 20; // set offset for serialization

    beginBhiReqLstupdDttm = getStartOffset() + 30; // set offset for serialization

    /*  end of offset */
  }

  int localBhiReqSlotTblIdCounter = -1;

  public boolean isBhiReqSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqSlotTblIdCounter != sharedCounter;
    localBhiReqSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_SLOT_TBL_ID_LEN = 6;
  /** serialize this BhiReqSlotTblId */
  protected void serializeBhiReqSlotTblId(char[] bhiReqSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqSlotTblId, 0, getStringValue(), beginBhiReqSlotTblId, BHI_REQ_SLOT_TBL_ID_LEN);
    localBhiReqSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiReqSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqSlotTblId() {
    return (substring(
        getStringValue(), beginBhiReqSlotTblId, beginBhiReqSlotTblId + BHI_REQ_SLOT_TBL_ID_LEN));
  }

  int localBhiReqHipaaVerNbrCounter = -1;

  public boolean isBhiReqHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqHipaaVerNbrCounter != sharedCounter;
    localBhiReqHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_HIPAA_VER_NBR_LEN = 1;
  /** serialize this BhiReqHipaaVerNbr */
  protected void serializeBhiReqHipaaVerNbr(char[] bhiReqHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqHipaaVerNbr, 0, getStringValue(), beginBhiReqHipaaVerNbr, BHI_REQ_HIPAA_VER_NBR_LEN);
    localBhiReqHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqHipaaVerNbr() {
    return (substring(
        getStringValue(),
        beginBhiReqHipaaVerNbr,
        beginBhiReqHipaaVerNbr + BHI_REQ_HIPAA_VER_NBR_LEN));
  }

  int localBhiReqHipaaCdCounter = -1;

  public boolean isBhiReqHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqHipaaCdCounter != sharedCounter;
    localBhiReqHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_HIPAA_CD_LEN = 2;
  /** serialize this BhiReqHipaaCd */
  protected void serializeBhiReqHipaaCd(char[] bhiReqHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqHipaaCd, 0, getStringValue(), beginBhiReqHipaaCd, BHI_REQ_HIPAA_CD_LEN);
    localBhiReqHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiReqHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqHipaaCd() {
    return (substring(
        getStringValue(), beginBhiReqHipaaCd, beginBhiReqHipaaCd + BHI_REQ_HIPAA_CD_LEN));
  }

  int localBhiReqNetIdCounter = -1;

  public boolean isBhiReqNetIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqNetIdCounter != sharedCounter;
    localBhiReqNetIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_NET_ID_LEN = 1;
  /** serialize this BhiReqNetId */
  protected void serializeBhiReqNetId(char[] bhiReqNetId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqNetId, 0, getStringValue(), beginBhiReqNetId, BHI_REQ_NET_ID_LEN);
    localBhiReqNetIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqNetIdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqNetId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiReqNetId() {
    return (substring(getStringValue(), beginBhiReqNetId, beginBhiReqNetId + BHI_REQ_NET_ID_LEN));
  }

  int localBhiReqEffDateCounter = -1;

  public boolean isBhiReqEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqEffDateCounter != sharedCounter;
    localBhiReqEffDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_EFF_DATE_LEN = 10;
  /** serialize this BhiReqEffDate */
  protected void serializeBhiReqEffDate(char[] bhiReqEffDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqEffDate, 0, getStringValue(), beginBhiReqEffDate, BHI_REQ_EFF_DATE_LEN);
    localBhiReqEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqEffDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiReqEffDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqEffDate() {
    return (substring(
        getStringValue(), beginBhiReqEffDate, beginBhiReqEffDate + BHI_REQ_EFF_DATE_LEN));
  }

  int localBhiReqCancDateCounter = -1;

  public boolean isBhiReqCancDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqCancDateCounter != sharedCounter;
    localBhiReqCancDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_CANC_DATE_LEN = 10;
  /** serialize this BhiReqCancDate */
  protected void serializeBhiReqCancDate(char[] bhiReqCancDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqCancDate, 0, getStringValue(), beginBhiReqCancDate, BHI_REQ_CANC_DATE_LEN);
    localBhiReqCancDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqCancDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiReqCancDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqCancDate() {
    return (substring(
        getStringValue(), beginBhiReqCancDate, beginBhiReqCancDate + BHI_REQ_CANC_DATE_LEN));
  }

  int localBhiReqLstupdDttmCounter = -1;

  public boolean isBhiReqLstupdDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqLstupdDttmCounter != sharedCounter;
    localBhiReqLstupdDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_LSTUPD_DTTM_LEN = 26;
  /** serialize this BhiReqLstupdDttm */
  protected void serializeBhiReqLstupdDttm(char[] bhiReqLstupdDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqLstupdDttm, 0, getStringValue(), beginBhiReqLstupdDttm, BHI_REQ_LSTUPD_DTTM_LEN);
    localBhiReqLstupdDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqLstupdDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshBhiReqLstupdDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqLstupdDttm() {
    return (substring(
        getStringValue(), beginBhiReqLstupdDttm, beginBhiReqLstupdDttm + BHI_REQ_LSTUPD_DTTM_LEN));
  }
}
