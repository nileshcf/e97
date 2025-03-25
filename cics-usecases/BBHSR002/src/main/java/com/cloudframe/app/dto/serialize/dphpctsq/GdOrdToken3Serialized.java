package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken3Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken3Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken3Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_3_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken3L;
  protected int beginGdOrdToken3T;

  /** Constructor for GdOrdToken3Serialized */
  public GdOrdToken3Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken3Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken3Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken3Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 5074); // serialize this field at offset 5074 by default
  }

  /**
   * sets parent for this GdOrdToken3Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 5074 by default
  }
  /** initializes the field in GdOrdToken3Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_3_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken3L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken3T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken3LCounter = -1;

  public boolean isGdOrdToken3LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken3LCounter != sharedCounter;
    localGdOrdToken3LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_3_L_LEN = 2;
  /** serializeGdOrdToken3L */
  protected void serializeGdOrdToken3L(short gdOrdToken3L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken3L, GD_ORD_TOKEN_3_L_LEN),
        beginGdOrdToken3L,
        GD_ORD_TOKEN_3_L_LEN);
    localGdOrdToken3LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken3LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken3L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken3L() {
    return (getShort(beginGdOrdToken3L));
  }

  int localGdOrdToken3TCounter = -1;

  public boolean isGdOrdToken3TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken3TCounter != sharedCounter;
    localGdOrdToken3TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_3_T_LEN = 515;
  /** serialize this GdOrdToken3T */
  protected void serializeGdOrdToken3T(char[] gdOrdToken3T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken3T, 0, getStringValue(), beginGdOrdToken3T, GD_ORD_TOKEN_3_T_LEN);
    localGdOrdToken3TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken3TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken3T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken3T() {
    return (substring(
        getStringValue(), beginGdOrdToken3T, beginGdOrdToken3T + GD_ORD_TOKEN_3_T_LEN));
  }
}
