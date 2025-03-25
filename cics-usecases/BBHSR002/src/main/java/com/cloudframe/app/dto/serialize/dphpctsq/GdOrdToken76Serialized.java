package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken76Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken76Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken76Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_76_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken76L;
  protected int beginGdOrdToken76T;

  /** Constructor for GdOrdToken76Serialized */
  public GdOrdToken76Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken76Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken76Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken76Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 42815); // serialize this field at offset 42815 by default
  }

  /**
   * sets parent for this GdOrdToken76Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 42815 by default
  }
  /** initializes the field in GdOrdToken76Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_76_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken76L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken76T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken76LCounter = -1;

  public boolean isGdOrdToken76LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken76LCounter != sharedCounter;
    localGdOrdToken76LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_76_L_LEN = 2;
  /** serializeGdOrdToken76L */
  protected void serializeGdOrdToken76L(short gdOrdToken76L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken76L, GD_ORD_TOKEN_76_L_LEN),
        beginGdOrdToken76L,
        GD_ORD_TOKEN_76_L_LEN);
    localGdOrdToken76LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken76LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken76L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken76L() {
    return (getShort(beginGdOrdToken76L));
  }

  int localGdOrdToken76TCounter = -1;

  public boolean isGdOrdToken76TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken76TCounter != sharedCounter;
    localGdOrdToken76TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_76_T_LEN = 515;
  /** serialize this GdOrdToken76T */
  protected void serializeGdOrdToken76T(char[] gdOrdToken76T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken76T, 0, getStringValue(), beginGdOrdToken76T, GD_ORD_TOKEN_76_T_LEN);
    localGdOrdToken76TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken76TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken76T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken76T() {
    return (substring(
        getStringValue(), beginGdOrdToken76T, beginGdOrdToken76T + GD_ORD_TOKEN_76_T_LEN));
  }
}
