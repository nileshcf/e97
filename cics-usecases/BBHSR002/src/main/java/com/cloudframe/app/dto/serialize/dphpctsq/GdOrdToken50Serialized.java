package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken50Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken50Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken50Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_50_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken50L;
  protected int beginGdOrdToken50T;

  /** Constructor for GdOrdToken50Serialized */
  public GdOrdToken50Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken50Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken50Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken50Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 29373); // serialize this field at offset 29373 by default
  }

  /**
   * sets parent for this GdOrdToken50Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 29373 by default
  }
  /** initializes the field in GdOrdToken50Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_50_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken50L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken50T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken50LCounter = -1;

  public boolean isGdOrdToken50LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken50LCounter != sharedCounter;
    localGdOrdToken50LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_50_L_LEN = 2;
  /** serializeGdOrdToken50L */
  protected void serializeGdOrdToken50L(short gdOrdToken50L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken50L, GD_ORD_TOKEN_50_L_LEN),
        beginGdOrdToken50L,
        GD_ORD_TOKEN_50_L_LEN);
    localGdOrdToken50LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken50LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken50L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken50L() {
    return (getShort(beginGdOrdToken50L));
  }

  int localGdOrdToken50TCounter = -1;

  public boolean isGdOrdToken50TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken50TCounter != sharedCounter;
    localGdOrdToken50TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_50_T_LEN = 515;
  /** serialize this GdOrdToken50T */
  protected void serializeGdOrdToken50T(char[] gdOrdToken50T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken50T, 0, getStringValue(), beginGdOrdToken50T, GD_ORD_TOKEN_50_T_LEN);
    localGdOrdToken50TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken50TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken50T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken50T() {
    return (substring(
        getStringValue(), beginGdOrdToken50T, beginGdOrdToken50T + GD_ORD_TOKEN_50_T_LEN));
  }
}
