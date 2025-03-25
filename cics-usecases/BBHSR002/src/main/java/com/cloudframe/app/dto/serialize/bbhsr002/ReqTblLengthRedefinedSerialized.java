package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqTblLengthRedefinedSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqTblLengthRedefinedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqTblLengthRedefinedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_TBL_LENGTH_REDEFINED_LENGTH = 6;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqTblAddressLength;
  protected int beginReqTblAddress;
  protected int beginReqTblAddressPtr;

  /** Constructor for ReqTblLengthRedefinedSerialized */
  public ReqTblLengthRedefinedSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqTblLengthRedefinedSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqTblLengthRedefinedSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ReqTblLengthRedefinedSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 23); // serialize this field at offset 23 by default
  }

  /**
   * sets parent for this ReqTblLengthRedefinedSerialized to the parent and set the serialize offset
   * to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 23 by default
  }
  /** initializes the field in ReqTblLengthRedefinedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_TBL_LENGTH_REDEFINED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqTblAddressLength = getStartOffset() + 0; // set offset for serialization

    beginReqTblAddress = getStartOffset() + 2; // set offset for serialization

    beginReqTblAddressPtr = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localReqTblAddressLengthCounter = -1;

  public boolean isReqTblAddressLengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqTblAddressLengthCounter != sharedCounter;
    localReqTblAddressLengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_TBL_ADDRESS_LENGTH_LEN = 2;
  /** serializeReqTblAddressLength */
  protected void serializeReqTblAddressLength(short reqTblAddressLength) {
    replaceValue( //  save the value as string
        getBinaryString(reqTblAddressLength, REQ_TBL_ADDRESS_LENGTH_LEN),
        beginReqTblAddressLength,
        REQ_TBL_ADDRESS_LENGTH_LEN);
    localReqTblAddressLengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqTblAddressLengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqTblAddressLength is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshReqTblAddressLength() {
    return (getShort(beginReqTblAddressLength));
  }

  int localReqTblAddressCounter = -1;

  public boolean isReqTblAddressModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqTblAddressCounter != sharedCounter;
    localReqTblAddressCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_TBL_ADDRESS_LEN = 4;
  /** serializeReqTblAddress */
  protected void serializeReqTblAddress(int reqTblAddress) {
    replaceValue( //  save the value as string
        getBinaryString(reqTblAddress, REQ_TBL_ADDRESS_LEN),
        beginReqTblAddress,
        REQ_TBL_ADDRESS_LEN);
    localReqTblAddressCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqTblAddressMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqTblAddress is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqTblAddress() {
    return (getInt(beginReqTblAddress));
  }

  int localReqTblAddressPtrCounter = -1;

  public boolean isReqTblAddressPtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqTblAddressPtrCounter != sharedCounter;
    localReqTblAddressPtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_TBL_ADDRESS_PTR_LEN = 4;
  /** serializeReqTblAddressPtr */
  protected void serializeReqTblAddressPtr(int reqTblAddressPtr) {
    replaceValue( //  save the value as string
        getBinaryString(reqTblAddressPtr, REQ_TBL_ADDRESS_PTR_LEN),
        beginReqTblAddressPtr,
        REQ_TBL_ADDRESS_PTR_LEN);
    localReqTblAddressPtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqTblAddressPtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqTblAddressPtr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqTblAddressPtr() {
    return (getInt(beginReqTblAddressPtr));
  }
}
