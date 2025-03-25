package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken65Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken65Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken65Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_65_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken65L;
  protected int beginGdOrdToken65T;

  /** Constructor for GdOrdToken65Serialized */
  public GdOrdToken65Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken65Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken65Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken65Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 37128); // serialize this field at offset 37128 by default
  }

  /**
   * sets parent for this GdOrdToken65Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 37128 by default
  }
  /** initializes the field in GdOrdToken65Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_65_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken65L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken65T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken65LCounter = -1;

  public boolean isGdOrdToken65LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken65LCounter != sharedCounter;
    localGdOrdToken65LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_65_L_LEN = 2;
  /** serializeGdOrdToken65L */
  protected void serializeGdOrdToken65L(short gdOrdToken65L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken65L, GD_ORD_TOKEN_65_L_LEN),
        beginGdOrdToken65L,
        GD_ORD_TOKEN_65_L_LEN);
    localGdOrdToken65LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken65LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken65L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken65L() {
    return (getShort(beginGdOrdToken65L));
  }

  int localGdOrdToken65TCounter = -1;

  public boolean isGdOrdToken65TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken65TCounter != sharedCounter;
    localGdOrdToken65TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_65_T_LEN = 515;
  /** serialize this GdOrdToken65T */
  protected void serializeGdOrdToken65T(char[] gdOrdToken65T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken65T, 0, getStringValue(), beginGdOrdToken65T, GD_ORD_TOKEN_65_T_LEN);
    localGdOrdToken65TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken65TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken65T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken65T() {
    return (substring(
        getStringValue(), beginGdOrdToken65T, beginGdOrdToken65T + GD_ORD_TOKEN_65_T_LEN));
  }
}
