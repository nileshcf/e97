package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken58Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken58Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken58Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_58_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken58L;
  protected int beginGdOrdToken58T;

  /** Constructor for GdOrdToken58Serialized */
  public GdOrdToken58Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken58Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken58Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken58Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 33509); // serialize this field at offset 33509 by default
  }

  /**
   * sets parent for this GdOrdToken58Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 33509 by default
  }
  /** initializes the field in GdOrdToken58Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_58_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken58L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken58T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken58LCounter = -1;

  public boolean isGdOrdToken58LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken58LCounter != sharedCounter;
    localGdOrdToken58LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_58_L_LEN = 2;
  /** serializeGdOrdToken58L */
  protected void serializeGdOrdToken58L(short gdOrdToken58L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken58L, GD_ORD_TOKEN_58_L_LEN),
        beginGdOrdToken58L,
        GD_ORD_TOKEN_58_L_LEN);
    localGdOrdToken58LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken58LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken58L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken58L() {
    return (getShort(beginGdOrdToken58L));
  }

  int localGdOrdToken58TCounter = -1;

  public boolean isGdOrdToken58TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken58TCounter != sharedCounter;
    localGdOrdToken58TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_58_T_LEN = 515;
  /** serialize this GdOrdToken58T */
  protected void serializeGdOrdToken58T(char[] gdOrdToken58T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken58T, 0, getStringValue(), beginGdOrdToken58T, GD_ORD_TOKEN_58_T_LEN);
    localGdOrdToken58TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken58TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken58T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken58T() {
    return (substring(
        getStringValue(), beginGdOrdToken58T, beginGdOrdToken58T + GD_ORD_TOKEN_58_T_LEN));
  }
}
