package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken79Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken79Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken79Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_79_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken79L;
  protected int beginGdOrdToken79T;

  /** Constructor for GdOrdToken79Serialized */
  public GdOrdToken79Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken79Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken79Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken79Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 44366); // serialize this field at offset 44366 by default
  }

  /**
   * sets parent for this GdOrdToken79Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 44366 by default
  }
  /** initializes the field in GdOrdToken79Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_79_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken79L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken79T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken79LCounter = -1;

  public boolean isGdOrdToken79LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken79LCounter != sharedCounter;
    localGdOrdToken79LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_79_L_LEN = 2;
  /** serializeGdOrdToken79L */
  protected void serializeGdOrdToken79L(short gdOrdToken79L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken79L, GD_ORD_TOKEN_79_L_LEN),
        beginGdOrdToken79L,
        GD_ORD_TOKEN_79_L_LEN);
    localGdOrdToken79LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken79LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken79L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken79L() {
    return (getShort(beginGdOrdToken79L));
  }

  int localGdOrdToken79TCounter = -1;

  public boolean isGdOrdToken79TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken79TCounter != sharedCounter;
    localGdOrdToken79TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_79_T_LEN = 515;
  /** serialize this GdOrdToken79T */
  protected void serializeGdOrdToken79T(char[] gdOrdToken79T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken79T, 0, getStringValue(), beginGdOrdToken79T, GD_ORD_TOKEN_79_T_LEN);
    localGdOrdToken79TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken79TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken79T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken79T() {
    return (substring(
        getStringValue(), beginGdOrdToken79T, beginGdOrdToken79T + GD_ORD_TOKEN_79_T_LEN));
  }
}
