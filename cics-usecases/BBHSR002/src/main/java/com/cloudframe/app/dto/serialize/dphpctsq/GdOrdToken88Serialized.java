package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken88Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken88Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken88Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_88_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken88L;
  protected int beginGdOrdToken88T;

  /** Constructor for GdOrdToken88Serialized */
  public GdOrdToken88Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken88Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken88Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken88Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 49019); // serialize this field at offset 49019 by default
  }

  /**
   * sets parent for this GdOrdToken88Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 49019 by default
  }
  /** initializes the field in GdOrdToken88Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_88_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken88L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken88T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken88LCounter = -1;

  public boolean isGdOrdToken88LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken88LCounter != sharedCounter;
    localGdOrdToken88LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_88_L_LEN = 2;
  /** serializeGdOrdToken88L */
  protected void serializeGdOrdToken88L(short gdOrdToken88L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken88L, GD_ORD_TOKEN_88_L_LEN),
        beginGdOrdToken88L,
        GD_ORD_TOKEN_88_L_LEN);
    localGdOrdToken88LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken88LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken88L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken88L() {
    return (getShort(beginGdOrdToken88L));
  }

  int localGdOrdToken88TCounter = -1;

  public boolean isGdOrdToken88TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken88TCounter != sharedCounter;
    localGdOrdToken88TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_88_T_LEN = 515;
  /** serialize this GdOrdToken88T */
  protected void serializeGdOrdToken88T(char[] gdOrdToken88T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken88T, 0, getStringValue(), beginGdOrdToken88T, GD_ORD_TOKEN_88_T_LEN);
    localGdOrdToken88TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken88TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken88T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken88T() {
    return (substring(
        getStringValue(), beginGdOrdToken88T, beginGdOrdToken88T + GD_ORD_TOKEN_88_T_LEN));
  }
}
