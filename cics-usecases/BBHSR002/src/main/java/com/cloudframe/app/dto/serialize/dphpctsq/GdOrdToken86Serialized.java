package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken86Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken86Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken86Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_86_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken86L;
  protected int beginGdOrdToken86T;

  /** Constructor for GdOrdToken86Serialized */
  public GdOrdToken86Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken86Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken86Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken86Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 47985); // serialize this field at offset 47985 by default
  }

  /**
   * sets parent for this GdOrdToken86Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 47985 by default
  }
  /** initializes the field in GdOrdToken86Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_86_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken86L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken86T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken86LCounter = -1;

  public boolean isGdOrdToken86LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken86LCounter != sharedCounter;
    localGdOrdToken86LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_86_L_LEN = 2;
  /** serializeGdOrdToken86L */
  protected void serializeGdOrdToken86L(short gdOrdToken86L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken86L, GD_ORD_TOKEN_86_L_LEN),
        beginGdOrdToken86L,
        GD_ORD_TOKEN_86_L_LEN);
    localGdOrdToken86LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken86LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken86L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken86L() {
    return (getShort(beginGdOrdToken86L));
  }

  int localGdOrdToken86TCounter = -1;

  public boolean isGdOrdToken86TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken86TCounter != sharedCounter;
    localGdOrdToken86TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_86_T_LEN = 515;
  /** serialize this GdOrdToken86T */
  protected void serializeGdOrdToken86T(char[] gdOrdToken86T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken86T, 0, getStringValue(), beginGdOrdToken86T, GD_ORD_TOKEN_86_T_LEN);
    localGdOrdToken86TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken86TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken86T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken86T() {
    return (substring(
        getStringValue(), beginGdOrdToken86T, beginGdOrdToken86T + GD_ORD_TOKEN_86_T_LEN));
  }
}
