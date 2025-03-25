package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class BhiReqRowKeySerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReqRowKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReqRowKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQ_ROW_KEY_LENGTH = 30;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiReqRowSlotTblId;
  protected int beginBhiReqRowHipaaVerNbr;
  protected int beginBhiReqRowHipaaCd;
  protected int beginBhiReqRowNetId;
  protected int beginBhiReqRowEffDate;
  protected int beginBhiReqRowCancDt;

  /** Constructor for BhiReqRowKeySerialized */
  public BhiReqRowKeySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqRowKeySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqRowKeySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReqRowKeySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 76); // serialize this field at offset 76 by default
  }

  /**
   * sets parent for this BhiReqRowKeySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 76 by default
  }
  /** initializes the field in BhiReqRowKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQ_ROW_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiReqRowSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginBhiReqRowHipaaVerNbr = getStartOffset() + 6; // set offset for serialization

    beginBhiReqRowHipaaCd = getStartOffset() + 7; // set offset for serialization

    beginBhiReqRowNetId = getStartOffset() + 9; // set offset for serialization

    beginBhiReqRowEffDate = getStartOffset() + 10; // set offset for serialization

    beginBhiReqRowCancDt = getStartOffset() + 20; // set offset for serialization

    /*  end of offset */
  }

  int localBhiReqRowSlotTblIdCounter = -1;

  public boolean isBhiReqRowSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowSlotTblIdCounter != sharedCounter;
    localBhiReqRowSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_SLOT_TBL_ID_LEN = 6;
  /** serialize this BhiReqRowSlotTblId */
  protected void serializeBhiReqRowSlotTblId(char[] bhiReqRowSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowSlotTblId,
        0,
        getStringValue(),
        beginBhiReqRowSlotTblId,
        BHI_REQ_ROW_SLOT_TBL_ID_LEN);
    localBhiReqRowSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiReqRowSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowSlotTblId() {
    return (substring(
        getStringValue(),
        beginBhiReqRowSlotTblId,
        beginBhiReqRowSlotTblId + BHI_REQ_ROW_SLOT_TBL_ID_LEN));
  }

  int localBhiReqRowHipaaVerNbrCounter = -1;

  public boolean isBhiReqRowHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowHipaaVerNbrCounter != sharedCounter;
    localBhiReqRowHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_HIPAA_VER_NBR_LEN = 1;
  /** serialize this BhiReqRowHipaaVerNbr */
  protected void serializeBhiReqRowHipaaVerNbr(char[] bhiReqRowHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowHipaaVerNbr,
        0,
        getStringValue(),
        beginBhiReqRowHipaaVerNbr,
        BHI_REQ_ROW_HIPAA_VER_NBR_LEN);
    localBhiReqRowHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowHipaaVerNbr is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowHipaaVerNbr() {
    return (substring(
        getStringValue(),
        beginBhiReqRowHipaaVerNbr,
        beginBhiReqRowHipaaVerNbr + BHI_REQ_ROW_HIPAA_VER_NBR_LEN));
  }

  int localBhiReqRowHipaaCdCounter = -1;

  public boolean isBhiReqRowHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowHipaaCdCounter != sharedCounter;
    localBhiReqRowHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_HIPAA_CD_LEN = 2;
  /** serialize this BhiReqRowHipaaCd */
  protected void serializeBhiReqRowHipaaCd(char[] bhiReqRowHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowHipaaCd, 0, getStringValue(), beginBhiReqRowHipaaCd, BHI_REQ_ROW_HIPAA_CD_LEN);
    localBhiReqRowHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiReqRowHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowHipaaCd() {
    return (substring(
        getStringValue(), beginBhiReqRowHipaaCd, beginBhiReqRowHipaaCd + BHI_REQ_ROW_HIPAA_CD_LEN));
  }

  int localBhiReqRowNetIdCounter = -1;

  public boolean isBhiReqRowNetIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowNetIdCounter != sharedCounter;
    localBhiReqRowNetIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_NET_ID_LEN = 1;
  /** serialize this BhiReqRowNetId */
  protected void serializeBhiReqRowNetId(char[] bhiReqRowNetId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowNetId, 0, getStringValue(), beginBhiReqRowNetId, BHI_REQ_ROW_NET_ID_LEN);
    localBhiReqRowNetIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowNetIdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowNetId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowNetId() {
    return (substring(
        getStringValue(), beginBhiReqRowNetId, beginBhiReqRowNetId + BHI_REQ_ROW_NET_ID_LEN));
  }

  int localBhiReqRowEffDateCounter = -1;

  public boolean isBhiReqRowEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowEffDateCounter != sharedCounter;
    localBhiReqRowEffDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_EFF_DATE_LEN = 10;
  /** serialize this BhiReqRowEffDate */
  protected void serializeBhiReqRowEffDate(char[] bhiReqRowEffDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqRowEffDate, 0, getStringValue(), beginBhiReqRowEffDate, BHI_REQ_ROW_EFF_DATE_LEN);
    localBhiReqRowEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowEffDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiReqRowEffDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowEffDate() {
    return (substring(
        getStringValue(), beginBhiReqRowEffDate, beginBhiReqRowEffDate + BHI_REQ_ROW_EFF_DATE_LEN));
  }

  int localBhiReqRowCancDtCounter = -1;

  public boolean isBhiReqRowCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowCancDtCounter != sharedCounter;
    localBhiReqRowCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_CANC_DT_LEN = 10;
  /** serialize this BhiReqRowCancDt */
  protected void serializeBhiReqRowCancDt(char[] bhiReqRowCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowCancDt, 0, getStringValue(), beginBhiReqRowCancDt, BHI_REQ_ROW_CANC_DT_LEN);
    localBhiReqRowCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiReqRowCancDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowCancDt() {
    return (substring(
        getStringValue(), beginBhiReqRowCancDt, beginBhiReqRowCancDt + BHI_REQ_ROW_CANC_DT_LEN));
  }
}
