package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken53Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken53Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken53Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_53_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken53L;
  protected int beginGdOrdToken53T;

  /** Constructor for GdOrdToken53Serialized */
  public GdOrdToken53Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken53Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken53Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken53Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 30924); // serialize this field at offset 30924 by default
  }

  /**
   * sets parent for this GdOrdToken53Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 30924 by default
  }
  /** initializes the field in GdOrdToken53Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_53_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken53L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken53T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken53LCounter = -1;

  public boolean isGdOrdToken53LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken53LCounter != sharedCounter;
    localGdOrdToken53LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_53_L_LEN = 2;
  /** serializeGdOrdToken53L */
  protected void serializeGdOrdToken53L(short gdOrdToken53L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken53L, GD_ORD_TOKEN_53_L_LEN),
        beginGdOrdToken53L,
        GD_ORD_TOKEN_53_L_LEN);
    localGdOrdToken53LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken53LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken53L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken53L() {
    return (getShort(beginGdOrdToken53L));
  }

  int localGdOrdToken53TCounter = -1;

  public boolean isGdOrdToken53TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken53TCounter != sharedCounter;
    localGdOrdToken53TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_53_T_LEN = 515;
  /** serialize this GdOrdToken53T */
  protected void serializeGdOrdToken53T(char[] gdOrdToken53T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken53T, 0, getStringValue(), beginGdOrdToken53T, GD_ORD_TOKEN_53_T_LEN);
    localGdOrdToken53TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken53TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken53T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken53T() {
    return (substring(
        getStringValue(), beginGdOrdToken53T, beginGdOrdToken53T + GD_ORD_TOKEN_53_T_LEN));
  }
}
