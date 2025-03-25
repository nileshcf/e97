package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken84Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken84Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken84Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_84_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken84L;
  protected int beginGdOrdToken84T;

  /** Constructor for GdOrdToken84Serialized */
  public GdOrdToken84Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken84Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken84Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken84Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 46951); // serialize this field at offset 46951 by default
  }

  /**
   * sets parent for this GdOrdToken84Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 46951 by default
  }
  /** initializes the field in GdOrdToken84Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_84_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken84L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken84T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken84LCounter = -1;

  public boolean isGdOrdToken84LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken84LCounter != sharedCounter;
    localGdOrdToken84LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_84_L_LEN = 2;
  /** serializeGdOrdToken84L */
  protected void serializeGdOrdToken84L(short gdOrdToken84L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken84L, GD_ORD_TOKEN_84_L_LEN),
        beginGdOrdToken84L,
        GD_ORD_TOKEN_84_L_LEN);
    localGdOrdToken84LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken84LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken84L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken84L() {
    return (getShort(beginGdOrdToken84L));
  }

  int localGdOrdToken84TCounter = -1;

  public boolean isGdOrdToken84TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken84TCounter != sharedCounter;
    localGdOrdToken84TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_84_T_LEN = 515;
  /** serialize this GdOrdToken84T */
  protected void serializeGdOrdToken84T(char[] gdOrdToken84T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken84T, 0, getStringValue(), beginGdOrdToken84T, GD_ORD_TOKEN_84_T_LEN);
    localGdOrdToken84TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken84TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken84T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken84T() {
    return (substring(
        getStringValue(), beginGdOrdToken84T, beginGdOrdToken84T + GD_ORD_TOKEN_84_T_LEN));
  }
}
