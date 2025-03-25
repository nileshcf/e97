package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrReqFunctionCallSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrReqFunctionCallSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrReqFunctionCallSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_REQ_FUNCTION_CALL_LENGTH = 23;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrReqRequestType;
  protected int beginHsrReqVersion;
  protected int beginHsrReqCreator;

  /** Constructor for HsrReqFunctionCallSerialized */
  public HsrReqFunctionCallSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqFunctionCallSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqFunctionCallSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrReqFunctionCallSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this HsrReqFunctionCallSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in HsrReqFunctionCallSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_REQ_FUNCTION_CALL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrReqRequestType = getStartOffset() + 0; // set offset for serialization

    beginHsrReqVersion = getStartOffset() + 12; // set offset for serialization

    beginHsrReqCreator = getStartOffset() + 15; // set offset for serialization

    /*  end of offset */
  }

  int localHsrReqRequestTypeCounter = -1;

  public boolean isHsrReqRequestTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqRequestTypeCounter != sharedCounter;
    localHsrReqRequestTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_REQUEST_TYPE_LEN = 12;
  /** serialize this HsrReqRequestType */
  protected void serializeHsrReqRequestType(char[] hsrReqRequestType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrReqRequestType, 0, getStringValue(), beginHsrReqRequestType, HSR_REQ_REQUEST_TYPE_LEN);
    localHsrReqRequestTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqRequestTypeConstraints(char[] value) {
    return super.checkConstraints(value, 12, false, false);
  }
  /**
   * refreshHsrReqRequestType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqRequestType() {
    return (substring(
        getStringValue(),
        beginHsrReqRequestType,
        beginHsrReqRequestType + HSR_REQ_REQUEST_TYPE_LEN));
  }

  int localHsrReqVersionCounter = -1;

  public boolean isHsrReqVersionModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqVersionCounter != sharedCounter;
    localHsrReqVersionCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_VERSION_LEN = 3;
  /** serialize this HsrReqVersion */
  protected void serializeHsrReqVersion(char[] hsrReqVersion) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrReqVersion, 0, getStringValue(), beginHsrReqVersion, HSR_REQ_VERSION_LEN);
    localHsrReqVersionCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqVersionConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshHsrReqVersion is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqVersion() {
    return (substring(
        getStringValue(), beginHsrReqVersion, beginHsrReqVersion + HSR_REQ_VERSION_LEN));
  }

  int localHsrReqCreatorCounter = -1;

  public boolean isHsrReqCreatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqCreatorCounter != sharedCounter;
    localHsrReqCreatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_CREATOR_LEN = 8;
  /** serialize this HsrReqCreator */
  protected void serializeHsrReqCreator(char[] hsrReqCreator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrReqCreator, 0, getStringValue(), beginHsrReqCreator, HSR_REQ_CREATOR_LEN);
    localHsrReqCreatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqCreatorConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshHsrReqCreator is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqCreator() {
    return (substring(
        getStringValue(), beginHsrReqCreator, beginHsrReqCreator + HSR_REQ_CREATOR_LEN));
  }
}
