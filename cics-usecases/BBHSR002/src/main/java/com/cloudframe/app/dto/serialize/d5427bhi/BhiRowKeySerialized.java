package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiRowKeySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiRowKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiRowKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_ROW_KEY_LENGTH = 56;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiRowSlotTblId;
  protected int beginBhiRowHipaaVerNbr;
  protected int beginBhiRowHipaaCd;
  protected int beginBhiRowNetId;
  protected int beginBhiRowEffDate;
  protected int beginBhiRowCancDt;
  protected int beginBhiRowCreateDttm;

  /** Constructor for BhiRowKeySerialized */
  public BhiRowKeySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRowKeySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRowKeySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiRowKeySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 1580); // serialize this field at offset 1580 by default
  }

  /**
   * sets parent for this BhiRowKeySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 1580 by default
  }
  /** initializes the field in BhiRowKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_ROW_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiRowSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginBhiRowHipaaVerNbr = getStartOffset() + 6; // set offset for serialization

    beginBhiRowHipaaCd = getStartOffset() + 7; // set offset for serialization

    beginBhiRowNetId = getStartOffset() + 9; // set offset for serialization

    beginBhiRowEffDate = getStartOffset() + 10; // set offset for serialization

    beginBhiRowCancDt = getStartOffset() + 20; // set offset for serialization

    beginBhiRowCreateDttm = getStartOffset() + 30; // set offset for serialization

    /*  end of offset */
  }

  int localBhiRowSlotTblIdCounter = -1;

  public boolean isBhiRowSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowSlotTblIdCounter != sharedCounter;
    localBhiRowSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_SLOT_TBL_ID_LEN = 6;
  /** serialize this BhiRowSlotTblId */
  protected void serializeBhiRowSlotTblId(char[] bhiRowSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowSlotTblId, 0, getStringValue(), beginBhiRowSlotTblId, BHI_ROW_SLOT_TBL_ID_LEN);
    localBhiRowSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiRowSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowSlotTblId() {
    return (substring(
        getStringValue(), beginBhiRowSlotTblId, beginBhiRowSlotTblId + BHI_ROW_SLOT_TBL_ID_LEN));
  }

  int localBhiRowHipaaVerNbrCounter = -1;

  public boolean isBhiRowHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowHipaaVerNbrCounter != sharedCounter;
    localBhiRowHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_HIPAA_VER_NBR_LEN = 1;
  /** serialize this BhiRowHipaaVerNbr */
  protected void serializeBhiRowHipaaVerNbr(char[] bhiRowHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRowHipaaVerNbr, 0, getStringValue(), beginBhiRowHipaaVerNbr, BHI_ROW_HIPAA_VER_NBR_LEN);
    localBhiRowHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowHipaaVerNbr() {
    return (substring(
        getStringValue(),
        beginBhiRowHipaaVerNbr,
        beginBhiRowHipaaVerNbr + BHI_ROW_HIPAA_VER_NBR_LEN));
  }

  int localBhiRowHipaaCdCounter = -1;

  public boolean isBhiRowHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowHipaaCdCounter != sharedCounter;
    localBhiRowHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_HIPAA_CD_LEN = 2;
  /** serialize this BhiRowHipaaCd */
  protected void serializeBhiRowHipaaCd(char[] bhiRowHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowHipaaCd, 0, getStringValue(), beginBhiRowHipaaCd, BHI_ROW_HIPAA_CD_LEN);
    localBhiRowHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiRowHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowHipaaCd() {
    return (substring(
        getStringValue(), beginBhiRowHipaaCd, beginBhiRowHipaaCd + BHI_ROW_HIPAA_CD_LEN));
  }

  int localBhiRowNetIdCounter = -1;

  public boolean isBhiRowNetIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowNetIdCounter != sharedCounter;
    localBhiRowNetIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_NET_ID_LEN = 1;
  /** serialize this BhiRowNetId */
  protected void serializeBhiRowNetId(char[] bhiRowNetId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowNetId, 0, getStringValue(), beginBhiRowNetId, BHI_ROW_NET_ID_LEN);
    localBhiRowNetIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowNetIdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowNetId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiRowNetId() {
    return (substring(getStringValue(), beginBhiRowNetId, beginBhiRowNetId + BHI_ROW_NET_ID_LEN));
  }

  int localBhiRowEffDateCounter = -1;

  public boolean isBhiRowEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowEffDateCounter != sharedCounter;
    localBhiRowEffDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_EFF_DATE_LEN = 10;
  /** serialize this BhiRowEffDate */
  protected void serializeBhiRowEffDate(char[] bhiRowEffDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowEffDate, 0, getStringValue(), beginBhiRowEffDate, BHI_ROW_EFF_DATE_LEN);
    localBhiRowEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowEffDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiRowEffDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowEffDate() {
    return (substring(
        getStringValue(), beginBhiRowEffDate, beginBhiRowEffDate + BHI_ROW_EFF_DATE_LEN));
  }

  int localBhiRowCancDtCounter = -1;

  public boolean isBhiRowCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowCancDtCounter != sharedCounter;
    localBhiRowCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_CANC_DT_LEN = 10;
  /** serialize this BhiRowCancDt */
  protected void serializeBhiRowCancDt(char[] bhiRowCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowCancDt, 0, getStringValue(), beginBhiRowCancDt, BHI_ROW_CANC_DT_LEN);
    localBhiRowCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiRowCancDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowCancDt() {
    return (substring(
        getStringValue(), beginBhiRowCancDt, beginBhiRowCancDt + BHI_ROW_CANC_DT_LEN));
  }

  int localBhiRowCreateDttmCounter = -1;

  public boolean isBhiRowCreateDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowCreateDttmCounter != sharedCounter;
    localBhiRowCreateDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_CREATE_DTTM_LEN = 26;
  /** serialize this BhiRowCreateDttm */
  protected void serializeBhiRowCreateDttm(char[] bhiRowCreateDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRowCreateDttm, 0, getStringValue(), beginBhiRowCreateDttm, BHI_ROW_CREATE_DTTM_LEN);
    localBhiRowCreateDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowCreateDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshBhiRowCreateDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowCreateDttm() {
    return (substring(
        getStringValue(), beginBhiRowCreateDttm, beginBhiRowCreateDttm + BHI_ROW_CREATE_DTTM_LEN));
  }
}
