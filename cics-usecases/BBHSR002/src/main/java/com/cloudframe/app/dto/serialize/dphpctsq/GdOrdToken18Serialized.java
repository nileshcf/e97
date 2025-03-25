package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken18Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken18Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken18Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_18_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken18L;
  protected int beginGdOrdToken18T;

  /** Constructor for GdOrdToken18Serialized */
  public GdOrdToken18Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken18Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken18Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken18Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 12829); // serialize this field at offset 12829 by default
  }

  /**
   * sets parent for this GdOrdToken18Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 12829 by default
  }
  /** initializes the field in GdOrdToken18Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_18_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken18L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken18T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken18LCounter = -1;

  public boolean isGdOrdToken18LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken18LCounter != sharedCounter;
    localGdOrdToken18LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_18_L_LEN = 2;
  /** serializeGdOrdToken18L */
  protected void serializeGdOrdToken18L(short gdOrdToken18L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken18L, GD_ORD_TOKEN_18_L_LEN),
        beginGdOrdToken18L,
        GD_ORD_TOKEN_18_L_LEN);
    localGdOrdToken18LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken18LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken18L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken18L() {
    return (getShort(beginGdOrdToken18L));
  }

  int localGdOrdToken18TCounter = -1;

  public boolean isGdOrdToken18TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken18TCounter != sharedCounter;
    localGdOrdToken18TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_18_T_LEN = 515;
  /** serialize this GdOrdToken18T */
  protected void serializeGdOrdToken18T(char[] gdOrdToken18T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken18T, 0, getStringValue(), beginGdOrdToken18T, GD_ORD_TOKEN_18_T_LEN);
    localGdOrdToken18TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken18TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken18T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken18T() {
    return (substring(
        getStringValue(), beginGdOrdToken18T, beginGdOrdToken18T + GD_ORD_TOKEN_18_T_LEN));
  }
}
