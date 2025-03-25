package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken67Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken67Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken67Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_67_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken67L;
  protected int beginGdOrdToken67T;

  /** Constructor for GdOrdToken67Serialized */
  public GdOrdToken67Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken67Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken67Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken67Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 38162); // serialize this field at offset 38162 by default
  }

  /**
   * sets parent for this GdOrdToken67Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 38162 by default
  }
  /** initializes the field in GdOrdToken67Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_67_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken67L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken67T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken67LCounter = -1;

  public boolean isGdOrdToken67LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken67LCounter != sharedCounter;
    localGdOrdToken67LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_67_L_LEN = 2;
  /** serializeGdOrdToken67L */
  protected void serializeGdOrdToken67L(short gdOrdToken67L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken67L, GD_ORD_TOKEN_67_L_LEN),
        beginGdOrdToken67L,
        GD_ORD_TOKEN_67_L_LEN);
    localGdOrdToken67LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken67LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken67L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken67L() {
    return (getShort(beginGdOrdToken67L));
  }

  int localGdOrdToken67TCounter = -1;

  public boolean isGdOrdToken67TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken67TCounter != sharedCounter;
    localGdOrdToken67TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_67_T_LEN = 515;
  /** serialize this GdOrdToken67T */
  protected void serializeGdOrdToken67T(char[] gdOrdToken67T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken67T, 0, getStringValue(), beginGdOrdToken67T, GD_ORD_TOKEN_67_T_LEN);
    localGdOrdToken67TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken67TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken67T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken67T() {
    return (substring(
        getStringValue(), beginGdOrdToken67T, beginGdOrdToken67T + GD_ORD_TOKEN_67_T_LEN));
  }
}
