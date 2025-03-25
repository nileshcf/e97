package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken24Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken24Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken24Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_24_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken24L;
  protected int beginGdOrdToken24T;

  /** Constructor for GdOrdToken24Serialized */
  public GdOrdToken24Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken24Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken24Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken24Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 15931); // serialize this field at offset 15931 by default
  }

  /**
   * sets parent for this GdOrdToken24Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 15931 by default
  }
  /** initializes the field in GdOrdToken24Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_24_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken24L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken24T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken24LCounter = -1;

  public boolean isGdOrdToken24LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken24LCounter != sharedCounter;
    localGdOrdToken24LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_24_L_LEN = 2;
  /** serializeGdOrdToken24L */
  protected void serializeGdOrdToken24L(short gdOrdToken24L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken24L, GD_ORD_TOKEN_24_L_LEN),
        beginGdOrdToken24L,
        GD_ORD_TOKEN_24_L_LEN);
    localGdOrdToken24LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken24LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken24L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken24L() {
    return (getShort(beginGdOrdToken24L));
  }

  int localGdOrdToken24TCounter = -1;

  public boolean isGdOrdToken24TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken24TCounter != sharedCounter;
    localGdOrdToken24TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_24_T_LEN = 515;
  /** serialize this GdOrdToken24T */
  protected void serializeGdOrdToken24T(char[] gdOrdToken24T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken24T, 0, getStringValue(), beginGdOrdToken24T, GD_ORD_TOKEN_24_T_LEN);
    localGdOrdToken24TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken24TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken24T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken24T() {
    return (substring(
        getStringValue(), beginGdOrdToken24T, beginGdOrdToken24T + GD_ORD_TOKEN_24_T_LEN));
  }
}
