package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken4Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken4Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken4Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_4_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken4L;
  protected int beginGdOrdToken4T;

  /** Constructor for GdOrdToken4Serialized */
  public GdOrdToken4Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken4Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken4Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken4Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 5591); // serialize this field at offset 5591 by default
  }

  /**
   * sets parent for this GdOrdToken4Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 5591 by default
  }
  /** initializes the field in GdOrdToken4Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_4_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken4L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken4T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken4LCounter = -1;

  public boolean isGdOrdToken4LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken4LCounter != sharedCounter;
    localGdOrdToken4LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_4_L_LEN = 2;
  /** serializeGdOrdToken4L */
  protected void serializeGdOrdToken4L(short gdOrdToken4L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken4L, GD_ORD_TOKEN_4_L_LEN),
        beginGdOrdToken4L,
        GD_ORD_TOKEN_4_L_LEN);
    localGdOrdToken4LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken4LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken4L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken4L() {
    return (getShort(beginGdOrdToken4L));
  }

  int localGdOrdToken4TCounter = -1;

  public boolean isGdOrdToken4TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken4TCounter != sharedCounter;
    localGdOrdToken4TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_4_T_LEN = 515;
  /** serialize this GdOrdToken4T */
  protected void serializeGdOrdToken4T(char[] gdOrdToken4T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken4T, 0, getStringValue(), beginGdOrdToken4T, GD_ORD_TOKEN_4_T_LEN);
    localGdOrdToken4TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken4TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken4T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken4T() {
    return (substring(
        getStringValue(), beginGdOrdToken4T, beginGdOrdToken4T + GD_ORD_TOKEN_4_T_LEN));
  }
}
