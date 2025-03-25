package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken81Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken81Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken81Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_81_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken81L;
  protected int beginGdOrdToken81T;

  /** Constructor for GdOrdToken81Serialized */
  public GdOrdToken81Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken81Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken81Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken81Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 45400); // serialize this field at offset 45400 by default
  }

  /**
   * sets parent for this GdOrdToken81Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 45400 by default
  }
  /** initializes the field in GdOrdToken81Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_81_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken81L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken81T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken81LCounter = -1;

  public boolean isGdOrdToken81LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken81LCounter != sharedCounter;
    localGdOrdToken81LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_81_L_LEN = 2;
  /** serializeGdOrdToken81L */
  protected void serializeGdOrdToken81L(short gdOrdToken81L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken81L, GD_ORD_TOKEN_81_L_LEN),
        beginGdOrdToken81L,
        GD_ORD_TOKEN_81_L_LEN);
    localGdOrdToken81LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken81LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken81L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken81L() {
    return (getShort(beginGdOrdToken81L));
  }

  int localGdOrdToken81TCounter = -1;

  public boolean isGdOrdToken81TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken81TCounter != sharedCounter;
    localGdOrdToken81TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_81_T_LEN = 515;
  /** serialize this GdOrdToken81T */
  protected void serializeGdOrdToken81T(char[] gdOrdToken81T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken81T, 0, getStringValue(), beginGdOrdToken81T, GD_ORD_TOKEN_81_T_LEN);
    localGdOrdToken81TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken81TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken81T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken81T() {
    return (substring(
        getStringValue(), beginGdOrdToken81T, beginGdOrdToken81T + GD_ORD_TOKEN_81_T_LEN));
  }
}
