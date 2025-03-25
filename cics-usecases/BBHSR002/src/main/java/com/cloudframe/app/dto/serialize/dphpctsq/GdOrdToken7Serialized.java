package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken7Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken7Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken7Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_7_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken7L;
  protected int beginGdOrdToken7T;

  /** Constructor for GdOrdToken7Serialized */
  public GdOrdToken7Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken7Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken7Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken7Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 7142); // serialize this field at offset 7142 by default
  }

  /**
   * sets parent for this GdOrdToken7Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 7142 by default
  }
  /** initializes the field in GdOrdToken7Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_7_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken7L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken7T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken7LCounter = -1;

  public boolean isGdOrdToken7LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken7LCounter != sharedCounter;
    localGdOrdToken7LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_7_L_LEN = 2;
  /** serializeGdOrdToken7L */
  protected void serializeGdOrdToken7L(short gdOrdToken7L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken7L, GD_ORD_TOKEN_7_L_LEN),
        beginGdOrdToken7L,
        GD_ORD_TOKEN_7_L_LEN);
    localGdOrdToken7LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken7LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken7L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken7L() {
    return (getShort(beginGdOrdToken7L));
  }

  int localGdOrdToken7TCounter = -1;

  public boolean isGdOrdToken7TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken7TCounter != sharedCounter;
    localGdOrdToken7TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_7_T_LEN = 515;
  /** serialize this GdOrdToken7T */
  protected void serializeGdOrdToken7T(char[] gdOrdToken7T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken7T, 0, getStringValue(), beginGdOrdToken7T, GD_ORD_TOKEN_7_T_LEN);
    localGdOrdToken7TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken7TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken7T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken7T() {
    return (substring(
        getStringValue(), beginGdOrdToken7T, beginGdOrdToken7T + GD_ORD_TOKEN_7_T_LEN));
  }
}
