package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken75Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken75Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken75Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_75_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken75L;
  protected int beginGdOrdToken75T;

  /** Constructor for GdOrdToken75Serialized */
  public GdOrdToken75Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken75Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken75Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken75Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 42298); // serialize this field at offset 42298 by default
  }

  /**
   * sets parent for this GdOrdToken75Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 42298 by default
  }
  /** initializes the field in GdOrdToken75Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_75_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken75L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken75T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken75LCounter = -1;

  public boolean isGdOrdToken75LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken75LCounter != sharedCounter;
    localGdOrdToken75LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_75_L_LEN = 2;
  /** serializeGdOrdToken75L */
  protected void serializeGdOrdToken75L(short gdOrdToken75L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken75L, GD_ORD_TOKEN_75_L_LEN),
        beginGdOrdToken75L,
        GD_ORD_TOKEN_75_L_LEN);
    localGdOrdToken75LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken75LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken75L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken75L() {
    return (getShort(beginGdOrdToken75L));
  }

  int localGdOrdToken75TCounter = -1;

  public boolean isGdOrdToken75TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken75TCounter != sharedCounter;
    localGdOrdToken75TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_75_T_LEN = 515;
  /** serialize this GdOrdToken75T */
  protected void serializeGdOrdToken75T(char[] gdOrdToken75T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken75T, 0, getStringValue(), beginGdOrdToken75T, GD_ORD_TOKEN_75_T_LEN);
    localGdOrdToken75TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken75TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken75T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken75T() {
    return (substring(
        getStringValue(), beginGdOrdToken75T, beginGdOrdToken75T + GD_ORD_TOKEN_75_T_LEN));
  }
}
