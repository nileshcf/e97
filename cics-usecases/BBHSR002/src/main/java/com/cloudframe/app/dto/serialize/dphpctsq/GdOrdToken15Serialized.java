package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken15Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken15Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken15Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_15_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken15L;
  protected int beginGdOrdToken15T;

  /** Constructor for GdOrdToken15Serialized */
  public GdOrdToken15Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken15Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken15Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken15Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 11278); // serialize this field at offset 11278 by default
  }

  /**
   * sets parent for this GdOrdToken15Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 11278 by default
  }
  /** initializes the field in GdOrdToken15Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_15_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken15L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken15T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken15LCounter = -1;

  public boolean isGdOrdToken15LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken15LCounter != sharedCounter;
    localGdOrdToken15LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_15_L_LEN = 2;
  /** serializeGdOrdToken15L */
  protected void serializeGdOrdToken15L(short gdOrdToken15L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken15L, GD_ORD_TOKEN_15_L_LEN),
        beginGdOrdToken15L,
        GD_ORD_TOKEN_15_L_LEN);
    localGdOrdToken15LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken15LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken15L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken15L() {
    return (getShort(beginGdOrdToken15L));
  }

  int localGdOrdToken15TCounter = -1;

  public boolean isGdOrdToken15TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken15TCounter != sharedCounter;
    localGdOrdToken15TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_15_T_LEN = 515;
  /** serialize this GdOrdToken15T */
  protected void serializeGdOrdToken15T(char[] gdOrdToken15T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken15T, 0, getStringValue(), beginGdOrdToken15T, GD_ORD_TOKEN_15_T_LEN);
    localGdOrdToken15TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken15TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken15T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken15T() {
    return (substring(
        getStringValue(), beginGdOrdToken15T, beginGdOrdToken15T + GD_ORD_TOKEN_15_T_LEN));
  }
}
