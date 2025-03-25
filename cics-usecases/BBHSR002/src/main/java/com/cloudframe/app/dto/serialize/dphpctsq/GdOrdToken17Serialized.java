package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken17Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken17Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken17Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_17_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken17L;
  protected int beginGdOrdToken17T;

  /** Constructor for GdOrdToken17Serialized */
  public GdOrdToken17Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken17Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken17Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken17Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 12312); // serialize this field at offset 12312 by default
  }

  /**
   * sets parent for this GdOrdToken17Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 12312 by default
  }
  /** initializes the field in GdOrdToken17Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_17_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken17L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken17T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken17LCounter = -1;

  public boolean isGdOrdToken17LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken17LCounter != sharedCounter;
    localGdOrdToken17LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_17_L_LEN = 2;
  /** serializeGdOrdToken17L */
  protected void serializeGdOrdToken17L(short gdOrdToken17L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken17L, GD_ORD_TOKEN_17_L_LEN),
        beginGdOrdToken17L,
        GD_ORD_TOKEN_17_L_LEN);
    localGdOrdToken17LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken17LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken17L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken17L() {
    return (getShort(beginGdOrdToken17L));
  }

  int localGdOrdToken17TCounter = -1;

  public boolean isGdOrdToken17TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken17TCounter != sharedCounter;
    localGdOrdToken17TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_17_T_LEN = 515;
  /** serialize this GdOrdToken17T */
  protected void serializeGdOrdToken17T(char[] gdOrdToken17T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken17T, 0, getStringValue(), beginGdOrdToken17T, GD_ORD_TOKEN_17_T_LEN);
    localGdOrdToken17TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken17TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken17T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken17T() {
    return (substring(
        getStringValue(), beginGdOrdToken17T, beginGdOrdToken17T + GD_ORD_TOKEN_17_T_LEN));
  }
}
