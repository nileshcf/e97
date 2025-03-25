package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken6Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken6Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken6Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_6_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken6L;
  protected int beginGdOrdToken6T;

  /** Constructor for GdOrdToken6Serialized */
  public GdOrdToken6Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken6Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken6Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken6Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 6625); // serialize this field at offset 6625 by default
  }

  /**
   * sets parent for this GdOrdToken6Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 6625 by default
  }
  /** initializes the field in GdOrdToken6Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_6_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken6L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken6T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken6LCounter = -1;

  public boolean isGdOrdToken6LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken6LCounter != sharedCounter;
    localGdOrdToken6LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_6_L_LEN = 2;
  /** serializeGdOrdToken6L */
  protected void serializeGdOrdToken6L(short gdOrdToken6L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken6L, GD_ORD_TOKEN_6_L_LEN),
        beginGdOrdToken6L,
        GD_ORD_TOKEN_6_L_LEN);
    localGdOrdToken6LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken6LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken6L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken6L() {
    return (getShort(beginGdOrdToken6L));
  }

  int localGdOrdToken6TCounter = -1;

  public boolean isGdOrdToken6TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken6TCounter != sharedCounter;
    localGdOrdToken6TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_6_T_LEN = 515;
  /** serialize this GdOrdToken6T */
  protected void serializeGdOrdToken6T(char[] gdOrdToken6T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken6T, 0, getStringValue(), beginGdOrdToken6T, GD_ORD_TOKEN_6_T_LEN);
    localGdOrdToken6TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken6TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken6T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken6T() {
    return (substring(
        getStringValue(), beginGdOrdToken6T, beginGdOrdToken6T + GD_ORD_TOKEN_6_T_LEN));
  }
}
