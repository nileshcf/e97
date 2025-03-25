package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken25Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken25Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken25Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_25_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken25L;
  protected int beginGdOrdToken25T;

  /** Constructor for GdOrdToken25Serialized */
  public GdOrdToken25Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken25Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken25Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken25Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 16448); // serialize this field at offset 16448 by default
  }

  /**
   * sets parent for this GdOrdToken25Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 16448 by default
  }
  /** initializes the field in GdOrdToken25Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_25_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken25L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken25T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken25LCounter = -1;

  public boolean isGdOrdToken25LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken25LCounter != sharedCounter;
    localGdOrdToken25LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_25_L_LEN = 2;
  /** serializeGdOrdToken25L */
  protected void serializeGdOrdToken25L(short gdOrdToken25L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken25L, GD_ORD_TOKEN_25_L_LEN),
        beginGdOrdToken25L,
        GD_ORD_TOKEN_25_L_LEN);
    localGdOrdToken25LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken25LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken25L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken25L() {
    return (getShort(beginGdOrdToken25L));
  }

  int localGdOrdToken25TCounter = -1;

  public boolean isGdOrdToken25TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken25TCounter != sharedCounter;
    localGdOrdToken25TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_25_T_LEN = 515;
  /** serialize this GdOrdToken25T */
  protected void serializeGdOrdToken25T(char[] gdOrdToken25T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken25T, 0, getStringValue(), beginGdOrdToken25T, GD_ORD_TOKEN_25_T_LEN);
    localGdOrdToken25TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken25TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken25T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken25T() {
    return (substring(
        getStringValue(), beginGdOrdToken25T, beginGdOrdToken25T + GD_ORD_TOKEN_25_T_LEN));
  }
}
