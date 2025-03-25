package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken31Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken31Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken31Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_31_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken31L;
  protected int beginGdOrdToken31T;

  /** Constructor for GdOrdToken31Serialized */
  public GdOrdToken31Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken31Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken31Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken31Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 19550); // serialize this field at offset 19550 by default
  }

  /**
   * sets parent for this GdOrdToken31Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 19550 by default
  }
  /** initializes the field in GdOrdToken31Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_31_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken31L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken31T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken31LCounter = -1;

  public boolean isGdOrdToken31LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken31LCounter != sharedCounter;
    localGdOrdToken31LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_31_L_LEN = 2;
  /** serializeGdOrdToken31L */
  protected void serializeGdOrdToken31L(short gdOrdToken31L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken31L, GD_ORD_TOKEN_31_L_LEN),
        beginGdOrdToken31L,
        GD_ORD_TOKEN_31_L_LEN);
    localGdOrdToken31LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken31LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken31L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken31L() {
    return (getShort(beginGdOrdToken31L));
  }

  int localGdOrdToken31TCounter = -1;

  public boolean isGdOrdToken31TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken31TCounter != sharedCounter;
    localGdOrdToken31TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_31_T_LEN = 515;
  /** serialize this GdOrdToken31T */
  protected void serializeGdOrdToken31T(char[] gdOrdToken31T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken31T, 0, getStringValue(), beginGdOrdToken31T, GD_ORD_TOKEN_31_T_LEN);
    localGdOrdToken31TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken31TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken31T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken31T() {
    return (substring(
        getStringValue(), beginGdOrdToken31T, beginGdOrdToken31T + GD_ORD_TOKEN_31_T_LEN));
  }
}
