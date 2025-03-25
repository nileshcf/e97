package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken47Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken47Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken47Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_47_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken47L;
  protected int beginGdOrdToken47T;

  /** Constructor for GdOrdToken47Serialized */
  public GdOrdToken47Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken47Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken47Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken47Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 27822); // serialize this field at offset 27822 by default
  }

  /**
   * sets parent for this GdOrdToken47Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 27822 by default
  }
  /** initializes the field in GdOrdToken47Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_47_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken47L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken47T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken47LCounter = -1;

  public boolean isGdOrdToken47LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken47LCounter != sharedCounter;
    localGdOrdToken47LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_47_L_LEN = 2;
  /** serializeGdOrdToken47L */
  protected void serializeGdOrdToken47L(short gdOrdToken47L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken47L, GD_ORD_TOKEN_47_L_LEN),
        beginGdOrdToken47L,
        GD_ORD_TOKEN_47_L_LEN);
    localGdOrdToken47LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken47LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken47L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken47L() {
    return (getShort(beginGdOrdToken47L));
  }

  int localGdOrdToken47TCounter = -1;

  public boolean isGdOrdToken47TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken47TCounter != sharedCounter;
    localGdOrdToken47TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_47_T_LEN = 515;
  /** serialize this GdOrdToken47T */
  protected void serializeGdOrdToken47T(char[] gdOrdToken47T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken47T, 0, getStringValue(), beginGdOrdToken47T, GD_ORD_TOKEN_47_T_LEN);
    localGdOrdToken47TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken47TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken47T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken47T() {
    return (substring(
        getStringValue(), beginGdOrdToken47T, beginGdOrdToken47T + GD_ORD_TOKEN_47_T_LEN));
  }
}
