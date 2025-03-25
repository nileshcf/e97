package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken22Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken22Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken22Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_22_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken22L;
  protected int beginGdOrdToken22T;

  /** Constructor for GdOrdToken22Serialized */
  public GdOrdToken22Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken22Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken22Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken22Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 14897); // serialize this field at offset 14897 by default
  }

  /**
   * sets parent for this GdOrdToken22Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 14897 by default
  }
  /** initializes the field in GdOrdToken22Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_22_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken22L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken22T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken22LCounter = -1;

  public boolean isGdOrdToken22LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken22LCounter != sharedCounter;
    localGdOrdToken22LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_22_L_LEN = 2;
  /** serializeGdOrdToken22L */
  protected void serializeGdOrdToken22L(short gdOrdToken22L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken22L, GD_ORD_TOKEN_22_L_LEN),
        beginGdOrdToken22L,
        GD_ORD_TOKEN_22_L_LEN);
    localGdOrdToken22LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken22LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken22L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken22L() {
    return (getShort(beginGdOrdToken22L));
  }

  int localGdOrdToken22TCounter = -1;

  public boolean isGdOrdToken22TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken22TCounter != sharedCounter;
    localGdOrdToken22TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_22_T_LEN = 515;
  /** serialize this GdOrdToken22T */
  protected void serializeGdOrdToken22T(char[] gdOrdToken22T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken22T, 0, getStringValue(), beginGdOrdToken22T, GD_ORD_TOKEN_22_T_LEN);
    localGdOrdToken22TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken22TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken22T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken22T() {
    return (substring(
        getStringValue(), beginGdOrdToken22T, beginGdOrdToken22T + GD_ORD_TOKEN_22_T_LEN));
  }
}
