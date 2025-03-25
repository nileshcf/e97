package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken80Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken80Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken80Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_80_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken80L;
  protected int beginGdOrdToken80T;

  /** Constructor for GdOrdToken80Serialized */
  public GdOrdToken80Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken80Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken80Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken80Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 44883); // serialize this field at offset 44883 by default
  }

  /**
   * sets parent for this GdOrdToken80Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 44883 by default
  }
  /** initializes the field in GdOrdToken80Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_80_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken80L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken80T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken80LCounter = -1;

  public boolean isGdOrdToken80LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken80LCounter != sharedCounter;
    localGdOrdToken80LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_80_L_LEN = 2;
  /** serializeGdOrdToken80L */
  protected void serializeGdOrdToken80L(short gdOrdToken80L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken80L, GD_ORD_TOKEN_80_L_LEN),
        beginGdOrdToken80L,
        GD_ORD_TOKEN_80_L_LEN);
    localGdOrdToken80LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken80LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken80L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken80L() {
    return (getShort(beginGdOrdToken80L));
  }

  int localGdOrdToken80TCounter = -1;

  public boolean isGdOrdToken80TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken80TCounter != sharedCounter;
    localGdOrdToken80TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_80_T_LEN = 515;
  /** serialize this GdOrdToken80T */
  protected void serializeGdOrdToken80T(char[] gdOrdToken80T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken80T, 0, getStringValue(), beginGdOrdToken80T, GD_ORD_TOKEN_80_T_LEN);
    localGdOrdToken80TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken80TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken80T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken80T() {
    return (substring(
        getStringValue(), beginGdOrdToken80T, beginGdOrdToken80T + GD_ORD_TOKEN_80_T_LEN));
  }
}
