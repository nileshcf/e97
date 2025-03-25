package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken63Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken63Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken63Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_63_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken63L;
  protected int beginGdOrdToken63T;

  /** Constructor for GdOrdToken63Serialized */
  public GdOrdToken63Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken63Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken63Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken63Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 36094); // serialize this field at offset 36094 by default
  }

  /**
   * sets parent for this GdOrdToken63Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 36094 by default
  }
  /** initializes the field in GdOrdToken63Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_63_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken63L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken63T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken63LCounter = -1;

  public boolean isGdOrdToken63LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken63LCounter != sharedCounter;
    localGdOrdToken63LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_63_L_LEN = 2;
  /** serializeGdOrdToken63L */
  protected void serializeGdOrdToken63L(short gdOrdToken63L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken63L, GD_ORD_TOKEN_63_L_LEN),
        beginGdOrdToken63L,
        GD_ORD_TOKEN_63_L_LEN);
    localGdOrdToken63LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken63LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken63L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken63L() {
    return (getShort(beginGdOrdToken63L));
  }

  int localGdOrdToken63TCounter = -1;

  public boolean isGdOrdToken63TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken63TCounter != sharedCounter;
    localGdOrdToken63TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_63_T_LEN = 515;
  /** serialize this GdOrdToken63T */
  protected void serializeGdOrdToken63T(char[] gdOrdToken63T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken63T, 0, getStringValue(), beginGdOrdToken63T, GD_ORD_TOKEN_63_T_LEN);
    localGdOrdToken63TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken63TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken63T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken63T() {
    return (substring(
        getStringValue(), beginGdOrdToken63T, beginGdOrdToken63T + GD_ORD_TOKEN_63_T_LEN));
  }
}
