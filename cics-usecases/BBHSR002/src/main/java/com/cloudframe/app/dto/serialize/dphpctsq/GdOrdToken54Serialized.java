package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken54Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken54Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken54Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_54_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken54L;
  protected int beginGdOrdToken54T;

  /** Constructor for GdOrdToken54Serialized */
  public GdOrdToken54Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken54Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken54Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken54Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 31441); // serialize this field at offset 31441 by default
  }

  /**
   * sets parent for this GdOrdToken54Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 31441 by default
  }
  /** initializes the field in GdOrdToken54Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_54_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken54L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken54T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken54LCounter = -1;

  public boolean isGdOrdToken54LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken54LCounter != sharedCounter;
    localGdOrdToken54LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_54_L_LEN = 2;
  /** serializeGdOrdToken54L */
  protected void serializeGdOrdToken54L(short gdOrdToken54L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken54L, GD_ORD_TOKEN_54_L_LEN),
        beginGdOrdToken54L,
        GD_ORD_TOKEN_54_L_LEN);
    localGdOrdToken54LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken54LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken54L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken54L() {
    return (getShort(beginGdOrdToken54L));
  }

  int localGdOrdToken54TCounter = -1;

  public boolean isGdOrdToken54TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken54TCounter != sharedCounter;
    localGdOrdToken54TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_54_T_LEN = 515;
  /** serialize this GdOrdToken54T */
  protected void serializeGdOrdToken54T(char[] gdOrdToken54T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken54T, 0, getStringValue(), beginGdOrdToken54T, GD_ORD_TOKEN_54_T_LEN);
    localGdOrdToken54TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken54TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken54T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken54T() {
    return (substring(
        getStringValue(), beginGdOrdToken54T, beginGdOrdToken54T + GD_ORD_TOKEN_54_T_LEN));
  }
}
