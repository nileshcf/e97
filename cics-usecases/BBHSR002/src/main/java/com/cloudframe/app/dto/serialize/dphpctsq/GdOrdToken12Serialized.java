package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken12Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken12Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken12Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_12_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken12L;
  protected int beginGdOrdToken12T;

  /** Constructor for GdOrdToken12Serialized */
  public GdOrdToken12Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken12Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken12Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken12Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 9727); // serialize this field at offset 9727 by default
  }

  /**
   * sets parent for this GdOrdToken12Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 9727 by default
  }
  /** initializes the field in GdOrdToken12Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_12_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken12L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken12T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken12LCounter = -1;

  public boolean isGdOrdToken12LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken12LCounter != sharedCounter;
    localGdOrdToken12LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_12_L_LEN = 2;
  /** serializeGdOrdToken12L */
  protected void serializeGdOrdToken12L(short gdOrdToken12L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken12L, GD_ORD_TOKEN_12_L_LEN),
        beginGdOrdToken12L,
        GD_ORD_TOKEN_12_L_LEN);
    localGdOrdToken12LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken12LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken12L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken12L() {
    return (getShort(beginGdOrdToken12L));
  }

  int localGdOrdToken12TCounter = -1;

  public boolean isGdOrdToken12TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken12TCounter != sharedCounter;
    localGdOrdToken12TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_12_T_LEN = 515;
  /** serialize this GdOrdToken12T */
  protected void serializeGdOrdToken12T(char[] gdOrdToken12T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken12T, 0, getStringValue(), beginGdOrdToken12T, GD_ORD_TOKEN_12_T_LEN);
    localGdOrdToken12TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken12TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken12T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken12T() {
    return (substring(
        getStringValue(), beginGdOrdToken12T, beginGdOrdToken12T + GD_ORD_TOKEN_12_T_LEN));
  }
}
