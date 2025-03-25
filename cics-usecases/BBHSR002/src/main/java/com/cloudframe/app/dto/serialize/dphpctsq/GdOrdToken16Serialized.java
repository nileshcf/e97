package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken16Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken16Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken16Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_16_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken16L;
  protected int beginGdOrdToken16T;

  /** Constructor for GdOrdToken16Serialized */
  public GdOrdToken16Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken16Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken16Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken16Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 11795); // serialize this field at offset 11795 by default
  }

  /**
   * sets parent for this GdOrdToken16Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 11795 by default
  }
  /** initializes the field in GdOrdToken16Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_16_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken16L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken16T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken16LCounter = -1;

  public boolean isGdOrdToken16LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken16LCounter != sharedCounter;
    localGdOrdToken16LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_16_L_LEN = 2;
  /** serializeGdOrdToken16L */
  protected void serializeGdOrdToken16L(short gdOrdToken16L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken16L, GD_ORD_TOKEN_16_L_LEN),
        beginGdOrdToken16L,
        GD_ORD_TOKEN_16_L_LEN);
    localGdOrdToken16LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken16LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken16L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken16L() {
    return (getShort(beginGdOrdToken16L));
  }

  int localGdOrdToken16TCounter = -1;

  public boolean isGdOrdToken16TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken16TCounter != sharedCounter;
    localGdOrdToken16TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_16_T_LEN = 515;
  /** serialize this GdOrdToken16T */
  protected void serializeGdOrdToken16T(char[] gdOrdToken16T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken16T, 0, getStringValue(), beginGdOrdToken16T, GD_ORD_TOKEN_16_T_LEN);
    localGdOrdToken16TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken16TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken16T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken16T() {
    return (substring(
        getStringValue(), beginGdOrdToken16T, beginGdOrdToken16T + GD_ORD_TOKEN_16_T_LEN));
  }
}
