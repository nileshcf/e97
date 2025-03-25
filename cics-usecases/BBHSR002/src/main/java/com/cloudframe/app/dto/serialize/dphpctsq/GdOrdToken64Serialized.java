package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken64Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken64Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken64Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_64_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken64L;
  protected int beginGdOrdToken64T;

  /** Constructor for GdOrdToken64Serialized */
  public GdOrdToken64Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken64Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken64Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken64Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 36611); // serialize this field at offset 36611 by default
  }

  /**
   * sets parent for this GdOrdToken64Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 36611 by default
  }
  /** initializes the field in GdOrdToken64Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_64_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken64L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken64T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken64LCounter = -1;

  public boolean isGdOrdToken64LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken64LCounter != sharedCounter;
    localGdOrdToken64LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_64_L_LEN = 2;
  /** serializeGdOrdToken64L */
  protected void serializeGdOrdToken64L(short gdOrdToken64L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken64L, GD_ORD_TOKEN_64_L_LEN),
        beginGdOrdToken64L,
        GD_ORD_TOKEN_64_L_LEN);
    localGdOrdToken64LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken64LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken64L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken64L() {
    return (getShort(beginGdOrdToken64L));
  }

  int localGdOrdToken64TCounter = -1;

  public boolean isGdOrdToken64TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken64TCounter != sharedCounter;
    localGdOrdToken64TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_64_T_LEN = 515;
  /** serialize this GdOrdToken64T */
  protected void serializeGdOrdToken64T(char[] gdOrdToken64T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken64T, 0, getStringValue(), beginGdOrdToken64T, GD_ORD_TOKEN_64_T_LEN);
    localGdOrdToken64TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken64TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken64T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken64T() {
    return (substring(
        getStringValue(), beginGdOrdToken64T, beginGdOrdToken64T + GD_ORD_TOKEN_64_T_LEN));
  }
}
