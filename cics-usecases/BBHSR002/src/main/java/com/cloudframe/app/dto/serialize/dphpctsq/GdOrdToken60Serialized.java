package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken60Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken60Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken60Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_60_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken60L;
  protected int beginGdOrdToken60T;

  /** Constructor for GdOrdToken60Serialized */
  public GdOrdToken60Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken60Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken60Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken60Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 34543); // serialize this field at offset 34543 by default
  }

  /**
   * sets parent for this GdOrdToken60Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 34543 by default
  }
  /** initializes the field in GdOrdToken60Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_60_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken60L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken60T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken60LCounter = -1;

  public boolean isGdOrdToken60LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken60LCounter != sharedCounter;
    localGdOrdToken60LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_60_L_LEN = 2;
  /** serializeGdOrdToken60L */
  protected void serializeGdOrdToken60L(short gdOrdToken60L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken60L, GD_ORD_TOKEN_60_L_LEN),
        beginGdOrdToken60L,
        GD_ORD_TOKEN_60_L_LEN);
    localGdOrdToken60LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken60LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken60L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken60L() {
    return (getShort(beginGdOrdToken60L));
  }

  int localGdOrdToken60TCounter = -1;

  public boolean isGdOrdToken60TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken60TCounter != sharedCounter;
    localGdOrdToken60TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_60_T_LEN = 515;
  /** serialize this GdOrdToken60T */
  protected void serializeGdOrdToken60T(char[] gdOrdToken60T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken60T, 0, getStringValue(), beginGdOrdToken60T, GD_ORD_TOKEN_60_T_LEN);
    localGdOrdToken60TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken60TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken60T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken60T() {
    return (substring(
        getStringValue(), beginGdOrdToken60T, beginGdOrdToken60T + GD_ORD_TOKEN_60_T_LEN));
  }
}
