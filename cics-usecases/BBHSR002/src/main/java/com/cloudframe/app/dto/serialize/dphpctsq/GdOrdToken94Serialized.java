package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken94Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken94Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken94Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_94_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken94L;
  protected int beginGdOrdToken94T;

  /** Constructor for GdOrdToken94Serialized */
  public GdOrdToken94Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken94Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken94Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken94Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 52121); // serialize this field at offset 52121 by default
  }

  /**
   * sets parent for this GdOrdToken94Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 52121 by default
  }
  /** initializes the field in GdOrdToken94Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_94_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken94L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken94T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken94LCounter = -1;

  public boolean isGdOrdToken94LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken94LCounter != sharedCounter;
    localGdOrdToken94LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_94_L_LEN = 2;
  /** serializeGdOrdToken94L */
  protected void serializeGdOrdToken94L(short gdOrdToken94L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken94L, GD_ORD_TOKEN_94_L_LEN),
        beginGdOrdToken94L,
        GD_ORD_TOKEN_94_L_LEN);
    localGdOrdToken94LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken94LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken94L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken94L() {
    return (getShort(beginGdOrdToken94L));
  }

  int localGdOrdToken94TCounter = -1;

  public boolean isGdOrdToken94TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken94TCounter != sharedCounter;
    localGdOrdToken94TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_94_T_LEN = 515;
  /** serialize this GdOrdToken94T */
  protected void serializeGdOrdToken94T(char[] gdOrdToken94T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken94T, 0, getStringValue(), beginGdOrdToken94T, GD_ORD_TOKEN_94_T_LEN);
    localGdOrdToken94TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken94TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken94T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken94T() {
    return (substring(
        getStringValue(), beginGdOrdToken94T, beginGdOrdToken94T + GD_ORD_TOKEN_94_T_LEN));
  }
}
