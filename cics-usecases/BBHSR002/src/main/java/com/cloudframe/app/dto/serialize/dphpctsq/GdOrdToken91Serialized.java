package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken91Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken91Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken91Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_91_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken91L;
  protected int beginGdOrdToken91T;

  /** Constructor for GdOrdToken91Serialized */
  public GdOrdToken91Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken91Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken91Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken91Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 50570); // serialize this field at offset 50570 by default
  }

  /**
   * sets parent for this GdOrdToken91Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 50570 by default
  }
  /** initializes the field in GdOrdToken91Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_91_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken91L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken91T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken91LCounter = -1;

  public boolean isGdOrdToken91LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken91LCounter != sharedCounter;
    localGdOrdToken91LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_91_L_LEN = 2;
  /** serializeGdOrdToken91L */
  protected void serializeGdOrdToken91L(short gdOrdToken91L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken91L, GD_ORD_TOKEN_91_L_LEN),
        beginGdOrdToken91L,
        GD_ORD_TOKEN_91_L_LEN);
    localGdOrdToken91LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken91LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken91L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken91L() {
    return (getShort(beginGdOrdToken91L));
  }

  int localGdOrdToken91TCounter = -1;

  public boolean isGdOrdToken91TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken91TCounter != sharedCounter;
    localGdOrdToken91TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_91_T_LEN = 515;
  /** serialize this GdOrdToken91T */
  protected void serializeGdOrdToken91T(char[] gdOrdToken91T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken91T, 0, getStringValue(), beginGdOrdToken91T, GD_ORD_TOKEN_91_T_LEN);
    localGdOrdToken91TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken91TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken91T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken91T() {
    return (substring(
        getStringValue(), beginGdOrdToken91T, beginGdOrdToken91T + GD_ORD_TOKEN_91_T_LEN));
  }
}
