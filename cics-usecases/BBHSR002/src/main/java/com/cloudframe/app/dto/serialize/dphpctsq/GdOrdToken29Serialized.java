package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken29Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken29Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken29Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_29_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken29L;
  protected int beginGdOrdToken29T;

  /** Constructor for GdOrdToken29Serialized */
  public GdOrdToken29Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken29Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken29Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken29Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 18516); // serialize this field at offset 18516 by default
  }

  /**
   * sets parent for this GdOrdToken29Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 18516 by default
  }
  /** initializes the field in GdOrdToken29Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_29_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken29L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken29T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken29LCounter = -1;

  public boolean isGdOrdToken29LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken29LCounter != sharedCounter;
    localGdOrdToken29LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_29_L_LEN = 2;
  /** serializeGdOrdToken29L */
  protected void serializeGdOrdToken29L(short gdOrdToken29L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken29L, GD_ORD_TOKEN_29_L_LEN),
        beginGdOrdToken29L,
        GD_ORD_TOKEN_29_L_LEN);
    localGdOrdToken29LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken29LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken29L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken29L() {
    return (getShort(beginGdOrdToken29L));
  }

  int localGdOrdToken29TCounter = -1;

  public boolean isGdOrdToken29TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken29TCounter != sharedCounter;
    localGdOrdToken29TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_29_T_LEN = 515;
  /** serialize this GdOrdToken29T */
  protected void serializeGdOrdToken29T(char[] gdOrdToken29T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken29T, 0, getStringValue(), beginGdOrdToken29T, GD_ORD_TOKEN_29_T_LEN);
    localGdOrdToken29TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken29TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken29T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken29T() {
    return (substring(
        getStringValue(), beginGdOrdToken29T, beginGdOrdToken29T + GD_ORD_TOKEN_29_T_LEN));
  }
}
