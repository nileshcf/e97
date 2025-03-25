package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken87Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken87Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken87Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_87_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken87L;
  protected int beginGdOrdToken87T;

  /** Constructor for GdOrdToken87Serialized */
  public GdOrdToken87Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken87Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken87Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken87Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 48502); // serialize this field at offset 48502 by default
  }

  /**
   * sets parent for this GdOrdToken87Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 48502 by default
  }
  /** initializes the field in GdOrdToken87Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_87_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken87L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken87T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken87LCounter = -1;

  public boolean isGdOrdToken87LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken87LCounter != sharedCounter;
    localGdOrdToken87LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_87_L_LEN = 2;
  /** serializeGdOrdToken87L */
  protected void serializeGdOrdToken87L(short gdOrdToken87L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken87L, GD_ORD_TOKEN_87_L_LEN),
        beginGdOrdToken87L,
        GD_ORD_TOKEN_87_L_LEN);
    localGdOrdToken87LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken87LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken87L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken87L() {
    return (getShort(beginGdOrdToken87L));
  }

  int localGdOrdToken87TCounter = -1;

  public boolean isGdOrdToken87TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken87TCounter != sharedCounter;
    localGdOrdToken87TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_87_T_LEN = 515;
  /** serialize this GdOrdToken87T */
  protected void serializeGdOrdToken87T(char[] gdOrdToken87T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken87T, 0, getStringValue(), beginGdOrdToken87T, GD_ORD_TOKEN_87_T_LEN);
    localGdOrdToken87TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken87TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken87T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken87T() {
    return (substring(
        getStringValue(), beginGdOrdToken87T, beginGdOrdToken87T + GD_ORD_TOKEN_87_T_LEN));
  }
}
