package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken21Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken21Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken21Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_21_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken21L;
  protected int beginGdOrdToken21T;

  /** Constructor for GdOrdToken21Serialized */
  public GdOrdToken21Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken21Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken21Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken21Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 14380); // serialize this field at offset 14380 by default
  }

  /**
   * sets parent for this GdOrdToken21Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 14380 by default
  }
  /** initializes the field in GdOrdToken21Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_21_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken21L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken21T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken21LCounter = -1;

  public boolean isGdOrdToken21LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken21LCounter != sharedCounter;
    localGdOrdToken21LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_21_L_LEN = 2;
  /** serializeGdOrdToken21L */
  protected void serializeGdOrdToken21L(short gdOrdToken21L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken21L, GD_ORD_TOKEN_21_L_LEN),
        beginGdOrdToken21L,
        GD_ORD_TOKEN_21_L_LEN);
    localGdOrdToken21LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken21LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken21L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken21L() {
    return (getShort(beginGdOrdToken21L));
  }

  int localGdOrdToken21TCounter = -1;

  public boolean isGdOrdToken21TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken21TCounter != sharedCounter;
    localGdOrdToken21TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_21_T_LEN = 515;
  /** serialize this GdOrdToken21T */
  protected void serializeGdOrdToken21T(char[] gdOrdToken21T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken21T, 0, getStringValue(), beginGdOrdToken21T, GD_ORD_TOKEN_21_T_LEN);
    localGdOrdToken21TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken21TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken21T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken21T() {
    return (substring(
        getStringValue(), beginGdOrdToken21T, beginGdOrdToken21T + GD_ORD_TOKEN_21_T_LEN));
  }
}
