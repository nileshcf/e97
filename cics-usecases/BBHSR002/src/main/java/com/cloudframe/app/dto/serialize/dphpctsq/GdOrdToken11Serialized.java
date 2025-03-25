package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken11Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken11Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken11Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_11_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken11L;
  protected int beginGdOrdToken11T;

  /** Constructor for GdOrdToken11Serialized */
  public GdOrdToken11Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken11Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken11Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken11Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 9210); // serialize this field at offset 9210 by default
  }

  /**
   * sets parent for this GdOrdToken11Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 9210 by default
  }
  /** initializes the field in GdOrdToken11Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_11_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken11L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken11T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken11LCounter = -1;

  public boolean isGdOrdToken11LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken11LCounter != sharedCounter;
    localGdOrdToken11LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_11_L_LEN = 2;
  /** serializeGdOrdToken11L */
  protected void serializeGdOrdToken11L(short gdOrdToken11L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken11L, GD_ORD_TOKEN_11_L_LEN),
        beginGdOrdToken11L,
        GD_ORD_TOKEN_11_L_LEN);
    localGdOrdToken11LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken11LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken11L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken11L() {
    return (getShort(beginGdOrdToken11L));
  }

  int localGdOrdToken11TCounter = -1;

  public boolean isGdOrdToken11TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken11TCounter != sharedCounter;
    localGdOrdToken11TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_11_T_LEN = 515;
  /** serialize this GdOrdToken11T */
  protected void serializeGdOrdToken11T(char[] gdOrdToken11T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken11T, 0, getStringValue(), beginGdOrdToken11T, GD_ORD_TOKEN_11_T_LEN);
    localGdOrdToken11TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken11TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken11T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken11T() {
    return (substring(
        getStringValue(), beginGdOrdToken11T, beginGdOrdToken11T + GD_ORD_TOKEN_11_T_LEN));
  }
}
