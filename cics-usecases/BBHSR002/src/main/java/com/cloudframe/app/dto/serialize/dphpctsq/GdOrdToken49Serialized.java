package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken49Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken49Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken49Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_49_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken49L;
  protected int beginGdOrdToken49T;

  /** Constructor for GdOrdToken49Serialized */
  public GdOrdToken49Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken49Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken49Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken49Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 28856); // serialize this field at offset 28856 by default
  }

  /**
   * sets parent for this GdOrdToken49Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 28856 by default
  }
  /** initializes the field in GdOrdToken49Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_49_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken49L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken49T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken49LCounter = -1;

  public boolean isGdOrdToken49LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken49LCounter != sharedCounter;
    localGdOrdToken49LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_49_L_LEN = 2;
  /** serializeGdOrdToken49L */
  protected void serializeGdOrdToken49L(short gdOrdToken49L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken49L, GD_ORD_TOKEN_49_L_LEN),
        beginGdOrdToken49L,
        GD_ORD_TOKEN_49_L_LEN);
    localGdOrdToken49LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken49LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken49L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken49L() {
    return (getShort(beginGdOrdToken49L));
  }

  int localGdOrdToken49TCounter = -1;

  public boolean isGdOrdToken49TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken49TCounter != sharedCounter;
    localGdOrdToken49TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_49_T_LEN = 515;
  /** serialize this GdOrdToken49T */
  protected void serializeGdOrdToken49T(char[] gdOrdToken49T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken49T, 0, getStringValue(), beginGdOrdToken49T, GD_ORD_TOKEN_49_T_LEN);
    localGdOrdToken49TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken49TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken49T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken49T() {
    return (substring(
        getStringValue(), beginGdOrdToken49T, beginGdOrdToken49T + GD_ORD_TOKEN_49_T_LEN));
  }
}
