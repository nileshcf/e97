package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken42Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken42Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken42Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_42_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken42L;
  protected int beginGdOrdToken42T;

  /** Constructor for GdOrdToken42Serialized */
  public GdOrdToken42Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken42Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken42Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken42Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 25237); // serialize this field at offset 25237 by default
  }

  /**
   * sets parent for this GdOrdToken42Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 25237 by default
  }
  /** initializes the field in GdOrdToken42Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_42_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken42L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken42T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken42LCounter = -1;

  public boolean isGdOrdToken42LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken42LCounter != sharedCounter;
    localGdOrdToken42LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_42_L_LEN = 2;
  /** serializeGdOrdToken42L */
  protected void serializeGdOrdToken42L(short gdOrdToken42L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken42L, GD_ORD_TOKEN_42_L_LEN),
        beginGdOrdToken42L,
        GD_ORD_TOKEN_42_L_LEN);
    localGdOrdToken42LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken42LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken42L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken42L() {
    return (getShort(beginGdOrdToken42L));
  }

  int localGdOrdToken42TCounter = -1;

  public boolean isGdOrdToken42TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken42TCounter != sharedCounter;
    localGdOrdToken42TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_42_T_LEN = 515;
  /** serialize this GdOrdToken42T */
  protected void serializeGdOrdToken42T(char[] gdOrdToken42T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken42T, 0, getStringValue(), beginGdOrdToken42T, GD_ORD_TOKEN_42_T_LEN);
    localGdOrdToken42TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken42TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken42T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken42T() {
    return (substring(
        getStringValue(), beginGdOrdToken42T, beginGdOrdToken42T + GD_ORD_TOKEN_42_T_LEN));
  }
}
