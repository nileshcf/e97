package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken68Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken68Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken68Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_68_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken68L;
  protected int beginGdOrdToken68T;

  /** Constructor for GdOrdToken68Serialized */
  public GdOrdToken68Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken68Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken68Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken68Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 38679); // serialize this field at offset 38679 by default
  }

  /**
   * sets parent for this GdOrdToken68Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 38679 by default
  }
  /** initializes the field in GdOrdToken68Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_68_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken68L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken68T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken68LCounter = -1;

  public boolean isGdOrdToken68LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken68LCounter != sharedCounter;
    localGdOrdToken68LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_68_L_LEN = 2;
  /** serializeGdOrdToken68L */
  protected void serializeGdOrdToken68L(short gdOrdToken68L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken68L, GD_ORD_TOKEN_68_L_LEN),
        beginGdOrdToken68L,
        GD_ORD_TOKEN_68_L_LEN);
    localGdOrdToken68LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken68LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken68L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken68L() {
    return (getShort(beginGdOrdToken68L));
  }

  int localGdOrdToken68TCounter = -1;

  public boolean isGdOrdToken68TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken68TCounter != sharedCounter;
    localGdOrdToken68TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_68_T_LEN = 515;
  /** serialize this GdOrdToken68T */
  protected void serializeGdOrdToken68T(char[] gdOrdToken68T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken68T, 0, getStringValue(), beginGdOrdToken68T, GD_ORD_TOKEN_68_T_LEN);
    localGdOrdToken68TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken68TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken68T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken68T() {
    return (substring(
        getStringValue(), beginGdOrdToken68T, beginGdOrdToken68T + GD_ORD_TOKEN_68_T_LEN));
  }
}
