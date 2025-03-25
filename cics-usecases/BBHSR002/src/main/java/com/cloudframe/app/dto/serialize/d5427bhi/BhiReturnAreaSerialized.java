package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiReturnAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReturnAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReturnAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_RETURN_AREA_LENGTH = 2062;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiDb2Table;
  protected int beginBhiDb2ParaNm;
  protected int beginBhiDb2Action;
  protected int beginBhiDb2RetCode;
  protected int beginBhiRetReasonCode;
  protected int beginBhiNumOccurs;
  protected int beginBhiReturnRow;
  protected static final int BHI_RETURN_ROW_SIZE = 15;

  /** Constructor for BhiReturnAreaSerialized */
  public BhiReturnAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReturnAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReturnAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReturnAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 1485); // serialize this field at offset 1485 by default
  }

  /**
   * sets parent for this BhiReturnAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 1485 by default
  }
  /** initializes the field in BhiReturnAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_RETURN_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiDb2Table = getStartOffset() + 0; // set offset for serialization

    beginBhiDb2ParaNm = getStartOffset() + 30; // set offset for serialization

    beginBhiDb2Action = getStartOffset() + 60; // set offset for serialization

    beginBhiDb2RetCode = getStartOffset() + 68; // set offset for serialization

    beginBhiRetReasonCode = getStartOffset() + 78; // set offset for serialization

    beginBhiNumOccurs = getStartOffset() + 80; // set offset for serialization

    beginBhiReturnRow = getStartOffset() + 82; // set offset for serialization

    /*  end of offset */
  }

  int localBhiDb2TableCounter = -1;

  public boolean isBhiDb2TableModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiDb2TableCounter != sharedCounter;
    localBhiDb2TableCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_DB_2_TABLE_LEN = 30;
  /** serialize this BhiDb2Table */
  protected void serializeBhiDb2Table(char[] bhiDb2Table) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiDb2Table, 0, getStringValue(), beginBhiDb2Table, BHI_DB_2_TABLE_LEN);
    localBhiDb2TableCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiDb2TableConstraints(char[] value) {
    return super.checkConstraints(value, 30, false, false);
  }
  /**
   * refreshBhiDb2Table is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiDb2Table() {
    return (substring(getStringValue(), beginBhiDb2Table, beginBhiDb2Table + BHI_DB_2_TABLE_LEN));
  }

  int localBhiDb2ParaNmCounter = -1;

  public boolean isBhiDb2ParaNmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiDb2ParaNmCounter != sharedCounter;
    localBhiDb2ParaNmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_DB_2_PARA_NM_LEN = 30;
  /** serialize this BhiDb2ParaNm */
  protected void serializeBhiDb2ParaNm(char[] bhiDb2ParaNm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiDb2ParaNm, 0, getStringValue(), beginBhiDb2ParaNm, BHI_DB_2_PARA_NM_LEN);
    localBhiDb2ParaNmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiDb2ParaNmConstraints(char[] value) {
    return super.checkConstraints(value, 30, false, false);
  }
  /**
   * refreshBhiDb2ParaNm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiDb2ParaNm() {
    return (substring(
        getStringValue(), beginBhiDb2ParaNm, beginBhiDb2ParaNm + BHI_DB_2_PARA_NM_LEN));
  }

  int localBhiDb2ActionCounter = -1;

  public boolean isBhiDb2ActionModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiDb2ActionCounter != sharedCounter;
    localBhiDb2ActionCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_DB_2_ACTION_LEN = 8;
  /** serialize this BhiDb2Action */
  protected void serializeBhiDb2Action(char[] bhiDb2Action) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiDb2Action, 0, getStringValue(), beginBhiDb2Action, BHI_DB_2_ACTION_LEN);
    localBhiDb2ActionCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiDb2ActionConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshBhiDb2Action is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiDb2Action() {
    return (substring(
        getStringValue(), beginBhiDb2Action, beginBhiDb2Action + BHI_DB_2_ACTION_LEN));
  }

  int localBhiDb2RetCodeCounter = -1;

  public boolean isBhiDb2RetCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiDb2RetCodeCounter != sharedCounter;
    localBhiDb2RetCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_DB_2_RET_CODE_LEN = 10;
  /** serialize this BhiDb2RetCode */
  protected void serializeBhiDb2RetCode(char[] bhiDb2RetCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiDb2RetCode, 0, getStringValue(), beginBhiDb2RetCode, BHI_DB_2_RET_CODE_LEN);
    localBhiDb2RetCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiDb2RetCodeConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiDb2RetCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiDb2RetCode() {
    return (substring(
        getStringValue(), beginBhiDb2RetCode, beginBhiDb2RetCode + BHI_DB_2_RET_CODE_LEN));
  }

  int localBhiRetReasonCodeCounter = -1;

  public boolean isBhiRetReasonCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetReasonCodeCounter != sharedCounter;
    localBhiRetReasonCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_REASON_CODE_LEN = 2;
  /** serialize this BhiRetReasonCode */
  protected void serializeBhiRetReasonCode(char[] bhiRetReasonCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetReasonCode, 0, getStringValue(), beginBhiRetReasonCode, BHI_RET_REASON_CODE_LEN);
    localBhiRetReasonCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetReasonCodeConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiRetReasonCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetReasonCode() {
    return (substring(
        getStringValue(), beginBhiRetReasonCode, beginBhiRetReasonCode + BHI_RET_REASON_CODE_LEN));
  }

  int localBhiNumOccursCounter = -1;

  public boolean isBhiNumOccursModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiNumOccursCounter != sharedCounter;
    localBhiNumOccursCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of bhiNumOccurs
   *
   * @return bhiNumOccurs
   */
  public char[] getBhiNumOccursString() {
    return getCharArray(beginBhiNumOccurs, BHI_NUM_OCCURS_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean bhiNumOccursIsNumeric() {
    return isNumeric(
        beginBhiNumOccurs,
        beginBhiNumOccurs + BHI_NUM_OCCURS_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int BHI_NUM_OCCURS_LEN = 2;
  /** serializeBhiNumOccurs */
  protected void serializeBhiNumOccurs(short bhiNumOccurs) {
    putNumber(
        beginBhiNumOccurs,
        bhiNumOccurs,
        BHI_NUM_OCCURS_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localBhiNumOccursCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeBhiNumOccurs */
  protected short serializeBhiNumOccurs(char[] value) {
    short bhiNumOccurs;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    bhiNumOccurs =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, true /*isSigned?*/), beginBhiNumOccurs, 2);
    localBhiNumOccursCounter = shareString.getSerializedField().getModifiedCounter();
    return bhiNumOccurs;
  }

  protected short checkBhiNumOccursMaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_100 /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshBhiNumOccurs is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshBhiNumOccurs() throws CFException {
    try {
      return (getShortNumber(
          beginBhiNumOccurs,
          BHI_NUM_OCCURS_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("bhiNumOccurs", beginBhiNumOccurs, BHI_NUM_OCCURS_LEN);
    }
  }

  public int bhiReturnRowSize() {
    return BHI_RETURN_ROW_SIZE;
  }
}
