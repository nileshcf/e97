package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken62Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken62Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken62Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_62_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken62L;
  protected int beginGdOrdToken62T;

  /** Constructor for GdOrdToken62Serialized */
  public GdOrdToken62Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken62Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken62Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken62Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 35577); // serialize this field at offset 35577 by default
  }

  /**
   * sets parent for this GdOrdToken62Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 35577 by default
  }
  /** initializes the field in GdOrdToken62Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_62_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken62L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken62T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken62LCounter = -1;

  public boolean isGdOrdToken62LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken62LCounter != sharedCounter;
    localGdOrdToken62LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_62_L_LEN = 2;
  /** serializeGdOrdToken62L */
  protected void serializeGdOrdToken62L(short gdOrdToken62L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken62L, GD_ORD_TOKEN_62_L_LEN),
        beginGdOrdToken62L,
        GD_ORD_TOKEN_62_L_LEN);
    localGdOrdToken62LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken62LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken62L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken62L() {
    return (getShort(beginGdOrdToken62L));
  }

  int localGdOrdToken62TCounter = -1;

  public boolean isGdOrdToken62TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken62TCounter != sharedCounter;
    localGdOrdToken62TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_62_T_LEN = 515;
  /** serialize this GdOrdToken62T */
  protected void serializeGdOrdToken62T(char[] gdOrdToken62T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken62T, 0, getStringValue(), beginGdOrdToken62T, GD_ORD_TOKEN_62_T_LEN);
    localGdOrdToken62TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken62TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken62T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken62T() {
    return (substring(
        getStringValue(), beginGdOrdToken62T, beginGdOrdToken62T + GD_ORD_TOKEN_62_T_LEN));
  }
}
