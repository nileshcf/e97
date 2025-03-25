package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken93Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken93Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken93Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_93_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken93L;
  protected int beginGdOrdToken93T;

  /** Constructor for GdOrdToken93Serialized */
  public GdOrdToken93Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken93Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken93Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken93Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 51604); // serialize this field at offset 51604 by default
  }

  /**
   * sets parent for this GdOrdToken93Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 51604 by default
  }
  /** initializes the field in GdOrdToken93Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_93_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken93L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken93T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken93LCounter = -1;

  public boolean isGdOrdToken93LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken93LCounter != sharedCounter;
    localGdOrdToken93LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_93_L_LEN = 2;
  /** serializeGdOrdToken93L */
  protected void serializeGdOrdToken93L(short gdOrdToken93L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken93L, GD_ORD_TOKEN_93_L_LEN),
        beginGdOrdToken93L,
        GD_ORD_TOKEN_93_L_LEN);
    localGdOrdToken93LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken93LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken93L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken93L() {
    return (getShort(beginGdOrdToken93L));
  }

  int localGdOrdToken93TCounter = -1;

  public boolean isGdOrdToken93TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken93TCounter != sharedCounter;
    localGdOrdToken93TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_93_T_LEN = 515;
  /** serialize this GdOrdToken93T */
  protected void serializeGdOrdToken93T(char[] gdOrdToken93T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken93T, 0, getStringValue(), beginGdOrdToken93T, GD_ORD_TOKEN_93_T_LEN);
    localGdOrdToken93TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken93TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken93T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken93T() {
    return (substring(
        getStringValue(), beginGdOrdToken93T, beginGdOrdToken93T + GD_ORD_TOKEN_93_T_LEN));
  }
}
