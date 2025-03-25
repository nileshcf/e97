package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiRequestAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiRequestAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiRequestAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQUEST_AREA_LENGTH = 1485;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiCallingProgram;
  protected int beginBhiReqType;
  protected int beginBhiBrowseTypeSw;
  protected int beginBhiReqNum;
  protected int beginBhiReqRow;
  protected static final int BHI_REQ_ROW_SIZE = 15;

  /** Constructor for BhiRequestAreaSerialized */
  public BhiRequestAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRequestAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRequestAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiRequestAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this BhiRequestAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in BhiRequestAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQUEST_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiCallingProgram = getStartOffset() + 0; // set offset for serialization

    beginBhiReqType = getStartOffset() + 8; // set offset for serialization

    beginBhiBrowseTypeSw = getStartOffset() + 9; // set offset for serialization

    beginBhiReqNum = getStartOffset() + 10; // set offset for serialization

    beginBhiReqRow = getStartOffset() + 75; // set offset for serialization

    /*  end of offset */
  }

  int localBhiCallingProgramCounter = -1;

  public boolean isBhiCallingProgramModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiCallingProgramCounter != sharedCounter;
    localBhiCallingProgramCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_CALLING_PROGRAM_LEN = 8;
  /** serialize this BhiCallingProgram */
  protected void serializeBhiCallingProgram(char[] bhiCallingProgram) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiCallingProgram, 0, getStringValue(), beginBhiCallingProgram, BHI_CALLING_PROGRAM_LEN);
    localBhiCallingProgramCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiCallingProgramConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshBhiCallingProgram is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiCallingProgram() {
    return (substring(
        getStringValue(),
        beginBhiCallingProgram,
        beginBhiCallingProgram + BHI_CALLING_PROGRAM_LEN));
  }

  int localBhiReqTypeCounter = -1;

  public boolean isBhiReqTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqTypeCounter != sharedCounter;
    localBhiReqTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_TYPE_LEN = 1;
  /** serialize this BhiReqType */
  protected void serializeBhiReqType(char[] bhiReqType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqType, 0, getStringValue(), beginBhiReqType, BHI_REQ_TYPE_LEN);
    localBhiReqTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqType is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshBhiReqType() {
    return (substring(getStringValue(), beginBhiReqType, beginBhiReqType + BHI_REQ_TYPE_LEN));
  }

  int localBhiBrowseTypeSwCounter = -1;

  public boolean isBhiBrowseTypeSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiBrowseTypeSwCounter != sharedCounter;
    localBhiBrowseTypeSwCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_BROWSE_TYPE_SW_LEN = 1;
  /** serialize this BhiBrowseTypeSw */
  protected void serializeBhiBrowseTypeSw(char[] bhiBrowseTypeSw) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiBrowseTypeSw, 0, getStringValue(), beginBhiBrowseTypeSw, BHI_BROWSE_TYPE_SW_LEN);
    localBhiBrowseTypeSwCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiBrowseTypeSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiBrowseTypeSw is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiBrowseTypeSw() {
    return (substring(
        getStringValue(), beginBhiBrowseTypeSw, beginBhiBrowseTypeSw + BHI_BROWSE_TYPE_SW_LEN));
  }

  int localBhiReqNumCounter = -1;

  public boolean isBhiReqNumModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqNumCounter != sharedCounter;
    localBhiReqNumCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_NUM_LEN = 2;
  /** serializeBhiReqNum */
  protected void serializeBhiReqNum(short bhiReqNum) {
    replaceValue( //  save the value as string
        getBinaryString(bhiReqNum, BHI_REQ_NUM_LEN), beginBhiReqNum, BHI_REQ_NUM_LEN);
    localBhiReqNumCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkBhiReqNumMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshBhiReqNum is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshBhiReqNum() {
    return (getShort(beginBhiReqNum));
  }

  public int bhiReqRowSize() {
    return BHI_REQ_ROW_SIZE;
  }
}
