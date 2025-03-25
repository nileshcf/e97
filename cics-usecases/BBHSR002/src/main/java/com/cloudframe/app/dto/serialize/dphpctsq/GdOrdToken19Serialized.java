package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken19Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken19Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken19Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_19_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken19L;
  protected int beginGdOrdToken19T;

  /** Constructor for GdOrdToken19Serialized */
  public GdOrdToken19Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken19Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken19Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken19Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 13346); // serialize this field at offset 13346 by default
  }

  /**
   * sets parent for this GdOrdToken19Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 13346 by default
  }
  /** initializes the field in GdOrdToken19Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_19_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken19L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken19T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken19LCounter = -1;

  public boolean isGdOrdToken19LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken19LCounter != sharedCounter;
    localGdOrdToken19LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_19_L_LEN = 2;
  /** serializeGdOrdToken19L */
  protected void serializeGdOrdToken19L(short gdOrdToken19L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken19L, GD_ORD_TOKEN_19_L_LEN),
        beginGdOrdToken19L,
        GD_ORD_TOKEN_19_L_LEN);
    localGdOrdToken19LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken19LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken19L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken19L() {
    return (getShort(beginGdOrdToken19L));
  }

  int localGdOrdToken19TCounter = -1;

  public boolean isGdOrdToken19TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken19TCounter != sharedCounter;
    localGdOrdToken19TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_19_T_LEN = 515;
  /** serialize this GdOrdToken19T */
  protected void serializeGdOrdToken19T(char[] gdOrdToken19T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken19T, 0, getStringValue(), beginGdOrdToken19T, GD_ORD_TOKEN_19_T_LEN);
    localGdOrdToken19TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken19TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken19T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken19T() {
    return (substring(
        getStringValue(), beginGdOrdToken19T, beginGdOrdToken19T + GD_ORD_TOKEN_19_T_LEN));
  }
}
