package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken9Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken9Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken9Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_9_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken9L;
  protected int beginGdOrdToken9T;

  /** Constructor for GdOrdToken9Serialized */
  public GdOrdToken9Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken9Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken9Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken9Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 8176); // serialize this field at offset 8176 by default
  }

  /**
   * sets parent for this GdOrdToken9Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 8176 by default
  }
  /** initializes the field in GdOrdToken9Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_9_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken9L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken9T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken9LCounter = -1;

  public boolean isGdOrdToken9LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken9LCounter != sharedCounter;
    localGdOrdToken9LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_9_L_LEN = 2;
  /** serializeGdOrdToken9L */
  protected void serializeGdOrdToken9L(short gdOrdToken9L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken9L, GD_ORD_TOKEN_9_L_LEN),
        beginGdOrdToken9L,
        GD_ORD_TOKEN_9_L_LEN);
    localGdOrdToken9LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken9LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken9L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken9L() {
    return (getShort(beginGdOrdToken9L));
  }

  int localGdOrdToken9TCounter = -1;

  public boolean isGdOrdToken9TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken9TCounter != sharedCounter;
    localGdOrdToken9TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_9_T_LEN = 515;
  /** serialize this GdOrdToken9T */
  protected void serializeGdOrdToken9T(char[] gdOrdToken9T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken9T, 0, getStringValue(), beginGdOrdToken9T, GD_ORD_TOKEN_9_T_LEN);
    localGdOrdToken9TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken9TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken9T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken9T() {
    return (substring(
        getStringValue(), beginGdOrdToken9T, beginGdOrdToken9T + GD_ORD_TOKEN_9_T_LEN));
  }
}
