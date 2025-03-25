package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken20Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken20Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken20Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_20_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken20L;
  protected int beginGdOrdToken20T;

  /** Constructor for GdOrdToken20Serialized */
  public GdOrdToken20Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken20Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken20Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken20Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 13863); // serialize this field at offset 13863 by default
  }

  /**
   * sets parent for this GdOrdToken20Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 13863 by default
  }
  /** initializes the field in GdOrdToken20Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_20_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken20L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken20T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken20LCounter = -1;

  public boolean isGdOrdToken20LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken20LCounter != sharedCounter;
    localGdOrdToken20LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_20_L_LEN = 2;
  /** serializeGdOrdToken20L */
  protected void serializeGdOrdToken20L(short gdOrdToken20L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken20L, GD_ORD_TOKEN_20_L_LEN),
        beginGdOrdToken20L,
        GD_ORD_TOKEN_20_L_LEN);
    localGdOrdToken20LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken20LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken20L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken20L() {
    return (getShort(beginGdOrdToken20L));
  }

  int localGdOrdToken20TCounter = -1;

  public boolean isGdOrdToken20TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken20TCounter != sharedCounter;
    localGdOrdToken20TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_20_T_LEN = 515;
  /** serialize this GdOrdToken20T */
  protected void serializeGdOrdToken20T(char[] gdOrdToken20T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken20T, 0, getStringValue(), beginGdOrdToken20T, GD_ORD_TOKEN_20_T_LEN);
    localGdOrdToken20TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken20TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken20T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken20T() {
    return (substring(
        getStringValue(), beginGdOrdToken20T, beginGdOrdToken20T + GD_ORD_TOKEN_20_T_LEN));
  }
}
