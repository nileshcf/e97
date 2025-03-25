package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken28Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken28Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken28Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_28_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken28L;
  protected int beginGdOrdToken28T;

  /** Constructor for GdOrdToken28Serialized */
  public GdOrdToken28Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken28Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken28Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken28Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 17999); // serialize this field at offset 17999 by default
  }

  /**
   * sets parent for this GdOrdToken28Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 17999 by default
  }
  /** initializes the field in GdOrdToken28Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_28_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken28L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken28T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken28LCounter = -1;

  public boolean isGdOrdToken28LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken28LCounter != sharedCounter;
    localGdOrdToken28LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_28_L_LEN = 2;
  /** serializeGdOrdToken28L */
  protected void serializeGdOrdToken28L(short gdOrdToken28L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken28L, GD_ORD_TOKEN_28_L_LEN),
        beginGdOrdToken28L,
        GD_ORD_TOKEN_28_L_LEN);
    localGdOrdToken28LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken28LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken28L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken28L() {
    return (getShort(beginGdOrdToken28L));
  }

  int localGdOrdToken28TCounter = -1;

  public boolean isGdOrdToken28TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken28TCounter != sharedCounter;
    localGdOrdToken28TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_28_T_LEN = 515;
  /** serialize this GdOrdToken28T */
  protected void serializeGdOrdToken28T(char[] gdOrdToken28T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken28T, 0, getStringValue(), beginGdOrdToken28T, GD_ORD_TOKEN_28_T_LEN);
    localGdOrdToken28TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken28TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken28T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken28T() {
    return (substring(
        getStringValue(), beginGdOrdToken28T, beginGdOrdToken28T + GD_ORD_TOKEN_28_T_LEN));
  }
}
