package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken43Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken43Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken43Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_43_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken43L;
  protected int beginGdOrdToken43T;

  /** Constructor for GdOrdToken43Serialized */
  public GdOrdToken43Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken43Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken43Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken43Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 25754); // serialize this field at offset 25754 by default
  }

  /**
   * sets parent for this GdOrdToken43Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 25754 by default
  }
  /** initializes the field in GdOrdToken43Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_43_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken43L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken43T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken43LCounter = -1;

  public boolean isGdOrdToken43LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken43LCounter != sharedCounter;
    localGdOrdToken43LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_43_L_LEN = 2;
  /** serializeGdOrdToken43L */
  protected void serializeGdOrdToken43L(short gdOrdToken43L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken43L, GD_ORD_TOKEN_43_L_LEN),
        beginGdOrdToken43L,
        GD_ORD_TOKEN_43_L_LEN);
    localGdOrdToken43LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken43LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken43L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken43L() {
    return (getShort(beginGdOrdToken43L));
  }

  int localGdOrdToken43TCounter = -1;

  public boolean isGdOrdToken43TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken43TCounter != sharedCounter;
    localGdOrdToken43TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_43_T_LEN = 515;
  /** serialize this GdOrdToken43T */
  protected void serializeGdOrdToken43T(char[] gdOrdToken43T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken43T, 0, getStringValue(), beginGdOrdToken43T, GD_ORD_TOKEN_43_T_LEN);
    localGdOrdToken43TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken43TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken43T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken43T() {
    return (substring(
        getStringValue(), beginGdOrdToken43T, beginGdOrdToken43T + GD_ORD_TOKEN_43_T_LEN));
  }
}
