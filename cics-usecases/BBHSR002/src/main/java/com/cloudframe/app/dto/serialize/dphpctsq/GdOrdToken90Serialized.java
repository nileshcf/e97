package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken90Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken90Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken90Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_90_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken90L;
  protected int beginGdOrdToken90T;

  /** Constructor for GdOrdToken90Serialized */
  public GdOrdToken90Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken90Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken90Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken90Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 50053); // serialize this field at offset 50053 by default
  }

  /**
   * sets parent for this GdOrdToken90Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 50053 by default
  }
  /** initializes the field in GdOrdToken90Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_90_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken90L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken90T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken90LCounter = -1;

  public boolean isGdOrdToken90LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken90LCounter != sharedCounter;
    localGdOrdToken90LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_90_L_LEN = 2;
  /** serializeGdOrdToken90L */
  protected void serializeGdOrdToken90L(short gdOrdToken90L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken90L, GD_ORD_TOKEN_90_L_LEN),
        beginGdOrdToken90L,
        GD_ORD_TOKEN_90_L_LEN);
    localGdOrdToken90LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken90LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken90L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken90L() {
    return (getShort(beginGdOrdToken90L));
  }

  int localGdOrdToken90TCounter = -1;

  public boolean isGdOrdToken90TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken90TCounter != sharedCounter;
    localGdOrdToken90TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_90_T_LEN = 515;
  /** serialize this GdOrdToken90T */
  protected void serializeGdOrdToken90T(char[] gdOrdToken90T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken90T, 0, getStringValue(), beginGdOrdToken90T, GD_ORD_TOKEN_90_T_LEN);
    localGdOrdToken90TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken90TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken90T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken90T() {
    return (substring(
        getStringValue(), beginGdOrdToken90T, beginGdOrdToken90T + GD_ORD_TOKEN_90_T_LEN));
  }
}
