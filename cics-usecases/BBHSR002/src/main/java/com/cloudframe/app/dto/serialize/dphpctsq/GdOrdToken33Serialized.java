package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken33Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken33Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken33Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_33_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken33L;
  protected int beginGdOrdToken33T;

  /** Constructor for GdOrdToken33Serialized */
  public GdOrdToken33Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken33Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken33Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken33Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 20584); // serialize this field at offset 20584 by default
  }

  /**
   * sets parent for this GdOrdToken33Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 20584 by default
  }
  /** initializes the field in GdOrdToken33Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_33_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken33L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken33T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken33LCounter = -1;

  public boolean isGdOrdToken33LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken33LCounter != sharedCounter;
    localGdOrdToken33LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_33_L_LEN = 2;
  /** serializeGdOrdToken33L */
  protected void serializeGdOrdToken33L(short gdOrdToken33L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken33L, GD_ORD_TOKEN_33_L_LEN),
        beginGdOrdToken33L,
        GD_ORD_TOKEN_33_L_LEN);
    localGdOrdToken33LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken33LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken33L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken33L() {
    return (getShort(beginGdOrdToken33L));
  }

  int localGdOrdToken33TCounter = -1;

  public boolean isGdOrdToken33TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken33TCounter != sharedCounter;
    localGdOrdToken33TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_33_T_LEN = 515;
  /** serialize this GdOrdToken33T */
  protected void serializeGdOrdToken33T(char[] gdOrdToken33T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken33T, 0, getStringValue(), beginGdOrdToken33T, GD_ORD_TOKEN_33_T_LEN);
    localGdOrdToken33TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken33TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken33T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken33T() {
    return (substring(
        getStringValue(), beginGdOrdToken33T, beginGdOrdToken33T + GD_ORD_TOKEN_33_T_LEN));
  }
}
