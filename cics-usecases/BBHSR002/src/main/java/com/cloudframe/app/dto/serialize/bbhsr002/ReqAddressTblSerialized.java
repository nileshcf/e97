package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqAddressTblSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqAddressTblSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqAddressTblSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_ADDRESS_TBL_LENGTH = 6;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqTblLength;

  /** Constructor for ReqAddressTblSerialized */
  public ReqAddressTblSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqAddressTblSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqAddressTblSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ReqAddressTblSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 23); // serialize this field at offset 23 by default
  }

  /**
   * sets parent for this ReqAddressTblSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 23 by default
  }
  /** initializes the field in ReqAddressTblSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_ADDRESS_TBL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqTblLength = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localReqTblLengthCounter = -1;

  public boolean isReqTblLengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqTblLengthCounter != sharedCounter;
    localReqTblLengthCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of reqTblLength
   *
   * @return reqTblLength
   */
  public char[] getReqTblLengthString() {
    return getCharArray(beginReqTblLength, REQ_TBL_LENGTH_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean reqTblLengthIsNumeric() {
    return isNumeric(
        beginReqTblLength,
        beginReqTblLength + REQ_TBL_LENGTH_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int REQ_TBL_LENGTH_LEN = 6;
  /** serializeReqTblLength */
  protected void serializeReqTblLength(long reqTblLength) {
    putNumber(
        beginReqTblLength,
        reqTblLength,
        REQ_TBL_LENGTH_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localReqTblLengthCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeReqTblLength */
  protected long serializeReqTblLength(char[] value) {
    long reqTblLength;
    if (value.length > 0 && value.length != 6) value = new String(value).trim().toCharArray();
    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
    else if (value.length > 6) value = substring(value, 0, 6);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    reqTblLength =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(6, value, false /*isSigned?*/), beginReqTblLength, 6);
    localReqTblLengthCounter = shareString.getSerializedField().getModifiedCounter();
    return reqTblLength;
  }

  protected long checkReqTblLengthMaxLimit(long number) {

    return checkMaxLimit(number, MAX_1M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshReqTblLength is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshReqTblLength() throws CFException {
    try {
      return (getLongNumber(
          beginReqTblLength,
          REQ_TBL_LENGTH_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("reqTblLength", beginReqTblLength, REQ_TBL_LENGTH_LEN);
    }
  }
}
