package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken1Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken1Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken1Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_1_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken1L;
  protected int beginGdOrdToken1T;

  /** Constructor for GdOrdToken1Serialized */
  public GdOrdToken1Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken1Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken1Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken1Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 4040); // serialize this field at offset 4040 by default
  }

  /**
   * sets parent for this GdOrdToken1Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 4040 by default
  }
  /** initializes the field in GdOrdToken1Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_1_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken1L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken1T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken1LCounter = -1;

  public boolean isGdOrdToken1LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken1LCounter != sharedCounter;
    localGdOrdToken1LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_1_L_LEN = 2;
  /** serializeGdOrdToken1L */
  protected void serializeGdOrdToken1L(short gdOrdToken1L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken1L, GD_ORD_TOKEN_1_L_LEN),
        beginGdOrdToken1L,
        GD_ORD_TOKEN_1_L_LEN);
    localGdOrdToken1LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken1LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken1L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken1L() {
    return (getShort(beginGdOrdToken1L));
  }

  int localGdOrdToken1TCounter = -1;

  public boolean isGdOrdToken1TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken1TCounter != sharedCounter;
    localGdOrdToken1TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_1_T_LEN = 515;
  /** serialize this GdOrdToken1T */
  protected void serializeGdOrdToken1T(char[] gdOrdToken1T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken1T, 0, getStringValue(), beginGdOrdToken1T, GD_ORD_TOKEN_1_T_LEN);
    localGdOrdToken1TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken1TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken1T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken1T() {
    return (substring(
        getStringValue(), beginGdOrdToken1T, beginGdOrdToken1T + GD_ORD_TOKEN_1_T_LEN));
  }
}
