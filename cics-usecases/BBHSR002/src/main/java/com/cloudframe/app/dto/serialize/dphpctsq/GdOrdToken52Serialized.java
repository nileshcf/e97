package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken52Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken52Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken52Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_52_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken52L;
  protected int beginGdOrdToken52T;

  /** Constructor for GdOrdToken52Serialized */
  public GdOrdToken52Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken52Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken52Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken52Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 30407); // serialize this field at offset 30407 by default
  }

  /**
   * sets parent for this GdOrdToken52Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 30407 by default
  }
  /** initializes the field in GdOrdToken52Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_52_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken52L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken52T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken52LCounter = -1;

  public boolean isGdOrdToken52LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken52LCounter != sharedCounter;
    localGdOrdToken52LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_52_L_LEN = 2;
  /** serializeGdOrdToken52L */
  protected void serializeGdOrdToken52L(short gdOrdToken52L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken52L, GD_ORD_TOKEN_52_L_LEN),
        beginGdOrdToken52L,
        GD_ORD_TOKEN_52_L_LEN);
    localGdOrdToken52LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken52LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken52L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken52L() {
    return (getShort(beginGdOrdToken52L));
  }

  int localGdOrdToken52TCounter = -1;

  public boolean isGdOrdToken52TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken52TCounter != sharedCounter;
    localGdOrdToken52TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_52_T_LEN = 515;
  /** serialize this GdOrdToken52T */
  protected void serializeGdOrdToken52T(char[] gdOrdToken52T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken52T, 0, getStringValue(), beginGdOrdToken52T, GD_ORD_TOKEN_52_T_LEN);
    localGdOrdToken52TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken52TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken52T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken52T() {
    return (substring(
        getStringValue(), beginGdOrdToken52T, beginGdOrdToken52T + GD_ORD_TOKEN_52_T_LEN));
  }
}
