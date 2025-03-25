package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken5Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken5Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken5Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_5_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken5L;
  protected int beginGdOrdToken5T;

  /** Constructor for GdOrdToken5Serialized */
  public GdOrdToken5Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken5Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken5Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken5Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 6108); // serialize this field at offset 6108 by default
  }

  /**
   * sets parent for this GdOrdToken5Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 6108 by default
  }
  /** initializes the field in GdOrdToken5Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_5_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken5L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken5T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken5LCounter = -1;

  public boolean isGdOrdToken5LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken5LCounter != sharedCounter;
    localGdOrdToken5LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_5_L_LEN = 2;
  /** serializeGdOrdToken5L */
  protected void serializeGdOrdToken5L(short gdOrdToken5L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken5L, GD_ORD_TOKEN_5_L_LEN),
        beginGdOrdToken5L,
        GD_ORD_TOKEN_5_L_LEN);
    localGdOrdToken5LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken5LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken5L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken5L() {
    return (getShort(beginGdOrdToken5L));
  }

  int localGdOrdToken5TCounter = -1;

  public boolean isGdOrdToken5TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken5TCounter != sharedCounter;
    localGdOrdToken5TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_5_T_LEN = 515;
  /** serialize this GdOrdToken5T */
  protected void serializeGdOrdToken5T(char[] gdOrdToken5T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken5T, 0, getStringValue(), beginGdOrdToken5T, GD_ORD_TOKEN_5_T_LEN);
    localGdOrdToken5TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken5TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken5T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken5T() {
    return (substring(
        getStringValue(), beginGdOrdToken5T, beginGdOrdToken5T + GD_ORD_TOKEN_5_T_LEN));
  }
}
