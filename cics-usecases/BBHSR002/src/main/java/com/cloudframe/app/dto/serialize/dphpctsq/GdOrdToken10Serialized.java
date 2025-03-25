package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken10Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken10Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken10Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_10_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken10L;
  protected int beginGdOrdToken10T;

  /** Constructor for GdOrdToken10Serialized */
  public GdOrdToken10Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken10Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken10Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken10Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 8693); // serialize this field at offset 8693 by default
  }

  /**
   * sets parent for this GdOrdToken10Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 8693 by default
  }
  /** initializes the field in GdOrdToken10Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_10_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken10L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken10T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken10LCounter = -1;

  public boolean isGdOrdToken10LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken10LCounter != sharedCounter;
    localGdOrdToken10LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_10_L_LEN = 2;
  /** serializeGdOrdToken10L */
  protected void serializeGdOrdToken10L(short gdOrdToken10L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken10L, GD_ORD_TOKEN_10_L_LEN),
        beginGdOrdToken10L,
        GD_ORD_TOKEN_10_L_LEN);
    localGdOrdToken10LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken10LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken10L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken10L() {
    return (getShort(beginGdOrdToken10L));
  }

  int localGdOrdToken10TCounter = -1;

  public boolean isGdOrdToken10TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken10TCounter != sharedCounter;
    localGdOrdToken10TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_10_T_LEN = 515;
  /** serialize this GdOrdToken10T */
  protected void serializeGdOrdToken10T(char[] gdOrdToken10T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken10T, 0, getStringValue(), beginGdOrdToken10T, GD_ORD_TOKEN_10_T_LEN);
    localGdOrdToken10TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken10TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken10T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken10T() {
    return (substring(
        getStringValue(), beginGdOrdToken10T, beginGdOrdToken10T + GD_ORD_TOKEN_10_T_LEN));
  }
}
