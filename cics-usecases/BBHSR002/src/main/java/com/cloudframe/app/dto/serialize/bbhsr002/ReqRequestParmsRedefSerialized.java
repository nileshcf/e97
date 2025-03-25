package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqRequestParmsRedefSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqRequestParmsRedefSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqRequestParmsRedefSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_REQUEST_PARMS_REDEF_LENGTH = 150;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqRequestParms146;
  protected int beginReqRequestParms147149;
  protected int beginReqRequestParms150;

  /** Constructor for ReqRequestParmsRedefSerialized */
  public ReqRequestParmsRedefSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqRequestParmsRedefSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqRequestParmsRedefSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ReqRequestParmsRedefSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 83); // serialize this field at offset 83 by default
  }

  /**
   * sets parent for this ReqRequestParmsRedefSerialized to the parent and set the serialize offset
   * to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 83 by default
  }
  /** initializes the field in ReqRequestParmsRedefSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_REQUEST_PARMS_REDEF_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqRequestParms146 = getStartOffset() + 0; // set offset for serialization

    beginReqRequestParms147149 = getStartOffset() + 146; // set offset for serialization

    beginReqRequestParms150 = getStartOffset() + 149; // set offset for serialization

    /*  end of offset */
  }

  int localReqRequestParms146Counter = -1;

  public boolean isReqRequestParms146Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqRequestParms146Counter != sharedCounter;
    localReqRequestParms146Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_REQUEST_PARMS_146_LEN = 146;
  /** serialize this ReqRequestParms146 */
  protected void serializeReqRequestParms146(char[] reqRequestParms146) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        reqRequestParms146,
        0,
        getStringValue(),
        beginReqRequestParms146,
        REQ_REQUEST_PARMS_146_LEN);
    localReqRequestParms146Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqRequestParms146Constraints(char[] value) {
    return super.checkConstraints(value, 146, false, false);
  }
  /**
   * refreshReqRequestParms146 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqRequestParms146() {
    return (substring(
        getStringValue(),
        beginReqRequestParms146,
        beginReqRequestParms146 + REQ_REQUEST_PARMS_146_LEN));
  }

  int localReqRequestParms147149Counter = -1;

  public boolean isReqRequestParms147149Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqRequestParms147149Counter != sharedCounter;
    localReqRequestParms147149Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_REQUEST_PARMS_147149_LEN = 3;
  /** serialize this ReqRequestParms147149 */
  protected void serializeReqRequestParms147149(char[] reqRequestParms147149) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        reqRequestParms147149,
        0,
        getStringValue(),
        beginReqRequestParms147149,
        REQ_REQUEST_PARMS_147149_LEN);
    localReqRequestParms147149Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqRequestParms147149Constraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshReqRequestParms147149 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshReqRequestParms147149() {
    return (substring(
        getStringValue(),
        beginReqRequestParms147149,
        beginReqRequestParms147149 + REQ_REQUEST_PARMS_147149_LEN));
  }

  int localReqRequestParms150Counter = -1;

  public boolean isReqRequestParms150Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqRequestParms150Counter != sharedCounter;
    localReqRequestParms150Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_REQUEST_PARMS_150_LEN = 1;
  /** serialize this ReqRequestParms150 */
  protected void serializeReqRequestParms150(char[] reqRequestParms150) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        reqRequestParms150,
        0,
        getStringValue(),
        beginReqRequestParms150,
        REQ_REQUEST_PARMS_150_LEN);
    localReqRequestParms150Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqRequestParms150Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshReqRequestParms150 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqRequestParms150() {
    return (substring(
        getStringValue(),
        beginReqRequestParms150,
        beginReqRequestParms150 + REQ_REQUEST_PARMS_150_LEN));
  }
}
