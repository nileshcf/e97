package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken13Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken13Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken13Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_13_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken13L;
  protected int beginGdOrdToken13T;

  /** Constructor for GdOrdToken13Serialized */
  public GdOrdToken13Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken13Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken13Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken13Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 10244); // serialize this field at offset 10244 by default
  }

  /**
   * sets parent for this GdOrdToken13Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 10244 by default
  }
  /** initializes the field in GdOrdToken13Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_13_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken13L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken13T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken13LCounter = -1;

  public boolean isGdOrdToken13LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken13LCounter != sharedCounter;
    localGdOrdToken13LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_13_L_LEN = 2;
  /** serializeGdOrdToken13L */
  protected void serializeGdOrdToken13L(short gdOrdToken13L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken13L, GD_ORD_TOKEN_13_L_LEN),
        beginGdOrdToken13L,
        GD_ORD_TOKEN_13_L_LEN);
    localGdOrdToken13LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken13LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken13L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken13L() {
    return (getShort(beginGdOrdToken13L));
  }

  int localGdOrdToken13TCounter = -1;

  public boolean isGdOrdToken13TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken13TCounter != sharedCounter;
    localGdOrdToken13TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_13_T_LEN = 515;
  /** serialize this GdOrdToken13T */
  protected void serializeGdOrdToken13T(char[] gdOrdToken13T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken13T, 0, getStringValue(), beginGdOrdToken13T, GD_ORD_TOKEN_13_T_LEN);
    localGdOrdToken13TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken13TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken13T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken13T() {
    return (substring(
        getStringValue(), beginGdOrdToken13T, beginGdOrdToken13T + GD_ORD_TOKEN_13_T_LEN));
  }
}
