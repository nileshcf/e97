package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class SvindxHexXSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SvindxHexXSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(SvindxHexXSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int SVINDX_HEX_X_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginSvindxHexLowByte;

  /** Constructor for SvindxHexXSerialized */
  public SvindxHexXSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for SvindxHexXSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public SvindxHexXSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this SvindxHexXSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this SvindxHexXSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in SvindxHexXSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(SVINDX_HEX_X_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginSvindxHexLowByte = getStartOffset() + 3; // set offset for serialization

    /*  end of offset */
  }

  int localSvindxHexLowByteCounter = -1;

  public boolean isSvindxHexLowByteModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvindxHexLowByteCounter != sharedCounter;
    localSvindxHexLowByteCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVINDX_HEX_LOW_BYTE_LEN = 1;
  /** serialize this SvindxHexLowByte */
  protected void serializeSvindxHexLowByte(char[] svindxHexLowByte) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        svindxHexLowByte, 0, getStringValue(), beginSvindxHexLowByte, SVINDX_HEX_LOW_BYTE_LEN);
    localSvindxHexLowByteCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvindxHexLowByteConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshSvindxHexLowByte is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshSvindxHexLowByte() {
    return (substring(
        getStringValue(), beginSvindxHexLowByte, beginSvindxHexLowByte + SVINDX_HEX_LOW_BYTE_LEN));
  }
}
