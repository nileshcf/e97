package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqViewSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqViewSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqViewSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_VIEW_LENGTH = 3;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqView2Bytes;
  protected int beginReqView1Byte;

  /** Constructor for ReqViewSerialized */
  public ReqViewSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqViewSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqViewSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ReqViewSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 6); // serialize this field at offset 6 by default
  }

  /**
   * sets parent for this ReqViewSerialized to the parent and set the serialize offset to parameter
   * begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 6 by default
  }
  /** initializes the field in ReqViewSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_VIEW_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqView2Bytes = getStartOffset() + 0; // set offset for serialization

    beginReqView1Byte = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localReqView2BytesCounter = -1;

  public boolean isReqView2BytesModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqView2BytesCounter != sharedCounter;
    localReqView2BytesCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_VIEW_2_BYTES_LEN = 2;
  /** serialize this ReqView2Bytes */
  protected void serializeReqView2Bytes(char[] reqView2Bytes) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(reqView2Bytes, 0, getStringValue(), beginReqView2Bytes, REQ_VIEW_2_BYTES_LEN);
    localReqView2BytesCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqView2BytesConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshReqView2Bytes is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqView2Bytes() {
    return (substring(
        getStringValue(), beginReqView2Bytes, beginReqView2Bytes + REQ_VIEW_2_BYTES_LEN));
  }

  int localReqView1ByteCounter = -1;

  public boolean isReqView1ByteModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqView1ByteCounter != sharedCounter;
    localReqView1ByteCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_VIEW_1_BYTE_LEN = 1;
  /** serialize this ReqView1Byte */
  protected void serializeReqView1Byte(char[] reqView1Byte) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(reqView1Byte, 0, getStringValue(), beginReqView1Byte, REQ_VIEW_1_BYTE_LEN);
    localReqView1ByteCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqView1ByteConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshReqView1Byte is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqView1Byte() {
    return (substring(
        getStringValue(), beginReqView1Byte, beginReqView1Byte + REQ_VIEW_1_BYTE_LEN));
  }
}
