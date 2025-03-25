package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken40Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken40Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken40Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_40_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken40L;
  protected int beginGdOrdToken40T;

  /** Constructor for GdOrdToken40Serialized */
  public GdOrdToken40Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken40Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken40Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken40Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 24203); // serialize this field at offset 24203 by default
  }

  /**
   * sets parent for this GdOrdToken40Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 24203 by default
  }
  /** initializes the field in GdOrdToken40Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_40_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken40L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken40T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken40LCounter = -1;

  public boolean isGdOrdToken40LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken40LCounter != sharedCounter;
    localGdOrdToken40LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_40_L_LEN = 2;
  /** serializeGdOrdToken40L */
  protected void serializeGdOrdToken40L(short gdOrdToken40L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken40L, GD_ORD_TOKEN_40_L_LEN),
        beginGdOrdToken40L,
        GD_ORD_TOKEN_40_L_LEN);
    localGdOrdToken40LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken40LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken40L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken40L() {
    return (getShort(beginGdOrdToken40L));
  }

  int localGdOrdToken40TCounter = -1;

  public boolean isGdOrdToken40TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken40TCounter != sharedCounter;
    localGdOrdToken40TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_40_T_LEN = 515;
  /** serialize this GdOrdToken40T */
  protected void serializeGdOrdToken40T(char[] gdOrdToken40T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken40T, 0, getStringValue(), beginGdOrdToken40T, GD_ORD_TOKEN_40_T_LEN);
    localGdOrdToken40TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken40TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken40T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken40T() {
    return (substring(
        getStringValue(), beginGdOrdToken40T, beginGdOrdToken40T + GD_ORD_TOKEN_40_T_LEN));
  }
}
