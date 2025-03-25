package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken95Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken95Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken95Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_95_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken95L;
  protected int beginGdOrdToken95T;

  /** Constructor for GdOrdToken95Serialized */
  public GdOrdToken95Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken95Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken95Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken95Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 52638); // serialize this field at offset 52638 by default
  }

  /**
   * sets parent for this GdOrdToken95Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 52638 by default
  }
  /** initializes the field in GdOrdToken95Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_95_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken95L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken95T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken95LCounter = -1;

  public boolean isGdOrdToken95LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken95LCounter != sharedCounter;
    localGdOrdToken95LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_95_L_LEN = 2;
  /** serializeGdOrdToken95L */
  protected void serializeGdOrdToken95L(short gdOrdToken95L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken95L, GD_ORD_TOKEN_95_L_LEN),
        beginGdOrdToken95L,
        GD_ORD_TOKEN_95_L_LEN);
    localGdOrdToken95LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken95LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken95L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken95L() {
    return (getShort(beginGdOrdToken95L));
  }

  int localGdOrdToken95TCounter = -1;

  public boolean isGdOrdToken95TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken95TCounter != sharedCounter;
    localGdOrdToken95TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_95_T_LEN = 515;
  /** serialize this GdOrdToken95T */
  protected void serializeGdOrdToken95T(char[] gdOrdToken95T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken95T, 0, getStringValue(), beginGdOrdToken95T, GD_ORD_TOKEN_95_T_LEN);
    localGdOrdToken95TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken95TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken95T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken95T() {
    return (substring(
        getStringValue(), beginGdOrdToken95T, beginGdOrdToken95T + GD_ORD_TOKEN_95_T_LEN));
  }
}
