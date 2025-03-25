package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken99Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken99Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken99Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_99_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken99L;
  protected int beginGdOrdToken99T;

  /** Constructor for GdOrdToken99Serialized */
  public GdOrdToken99Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken99Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken99Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken99Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 54706); // serialize this field at offset 54706 by default
  }

  /**
   * sets parent for this GdOrdToken99Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 54706 by default
  }
  /** initializes the field in GdOrdToken99Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_99_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken99L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken99T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken99LCounter = -1;

  public boolean isGdOrdToken99LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken99LCounter != sharedCounter;
    localGdOrdToken99LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_99_L_LEN = 2;
  /** serializeGdOrdToken99L */
  protected void serializeGdOrdToken99L(short gdOrdToken99L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken99L, GD_ORD_TOKEN_99_L_LEN),
        beginGdOrdToken99L,
        GD_ORD_TOKEN_99_L_LEN);
    localGdOrdToken99LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken99LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken99L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken99L() {
    return (getShort(beginGdOrdToken99L));
  }

  int localGdOrdToken99TCounter = -1;

  public boolean isGdOrdToken99TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken99TCounter != sharedCounter;
    localGdOrdToken99TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_99_T_LEN = 515;
  /** serialize this GdOrdToken99T */
  protected void serializeGdOrdToken99T(char[] gdOrdToken99T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken99T, 0, getStringValue(), beginGdOrdToken99T, GD_ORD_TOKEN_99_T_LEN);
    localGdOrdToken99TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken99TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken99T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken99T() {
    return (substring(
        getStringValue(), beginGdOrdToken99T, beginGdOrdToken99T + GD_ORD_TOKEN_99_T_LEN));
  }
}
