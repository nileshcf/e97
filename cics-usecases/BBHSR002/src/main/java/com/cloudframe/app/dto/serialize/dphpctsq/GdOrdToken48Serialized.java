package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken48Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken48Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken48Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_48_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken48L;
  protected int beginGdOrdToken48T;

  /** Constructor for GdOrdToken48Serialized */
  public GdOrdToken48Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken48Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken48Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken48Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 28339); // serialize this field at offset 28339 by default
  }

  /**
   * sets parent for this GdOrdToken48Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 28339 by default
  }
  /** initializes the field in GdOrdToken48Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_48_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken48L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken48T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken48LCounter = -1;

  public boolean isGdOrdToken48LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken48LCounter != sharedCounter;
    localGdOrdToken48LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_48_L_LEN = 2;
  /** serializeGdOrdToken48L */
  protected void serializeGdOrdToken48L(short gdOrdToken48L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken48L, GD_ORD_TOKEN_48_L_LEN),
        beginGdOrdToken48L,
        GD_ORD_TOKEN_48_L_LEN);
    localGdOrdToken48LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken48LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken48L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken48L() {
    return (getShort(beginGdOrdToken48L));
  }

  int localGdOrdToken48TCounter = -1;

  public boolean isGdOrdToken48TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken48TCounter != sharedCounter;
    localGdOrdToken48TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_48_T_LEN = 515;
  /** serialize this GdOrdToken48T */
  protected void serializeGdOrdToken48T(char[] gdOrdToken48T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken48T, 0, getStringValue(), beginGdOrdToken48T, GD_ORD_TOKEN_48_T_LEN);
    localGdOrdToken48TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken48TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken48T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken48T() {
    return (substring(
        getStringValue(), beginGdOrdToken48T, beginGdOrdToken48T + GD_ORD_TOKEN_48_T_LEN));
  }
}
