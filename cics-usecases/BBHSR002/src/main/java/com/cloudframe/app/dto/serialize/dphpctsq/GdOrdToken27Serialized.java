package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken27Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken27Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken27Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_27_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken27L;
  protected int beginGdOrdToken27T;

  /** Constructor for GdOrdToken27Serialized */
  public GdOrdToken27Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken27Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken27Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken27Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 17482); // serialize this field at offset 17482 by default
  }

  /**
   * sets parent for this GdOrdToken27Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 17482 by default
  }
  /** initializes the field in GdOrdToken27Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_27_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken27L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken27T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken27LCounter = -1;

  public boolean isGdOrdToken27LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken27LCounter != sharedCounter;
    localGdOrdToken27LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_27_L_LEN = 2;
  /** serializeGdOrdToken27L */
  protected void serializeGdOrdToken27L(short gdOrdToken27L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken27L, GD_ORD_TOKEN_27_L_LEN),
        beginGdOrdToken27L,
        GD_ORD_TOKEN_27_L_LEN);
    localGdOrdToken27LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken27LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken27L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken27L() {
    return (getShort(beginGdOrdToken27L));
  }

  int localGdOrdToken27TCounter = -1;

  public boolean isGdOrdToken27TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken27TCounter != sharedCounter;
    localGdOrdToken27TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_27_T_LEN = 515;
  /** serialize this GdOrdToken27T */
  protected void serializeGdOrdToken27T(char[] gdOrdToken27T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken27T, 0, getStringValue(), beginGdOrdToken27T, GD_ORD_TOKEN_27_T_LEN);
    localGdOrdToken27TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken27TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken27T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken27T() {
    return (substring(
        getStringValue(), beginGdOrdToken27T, beginGdOrdToken27T + GD_ORD_TOKEN_27_T_LEN));
  }
}
