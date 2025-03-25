package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken26Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken26Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken26Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_26_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken26L;
  protected int beginGdOrdToken26T;

  /** Constructor for GdOrdToken26Serialized */
  public GdOrdToken26Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken26Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken26Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken26Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 16965); // serialize this field at offset 16965 by default
  }

  /**
   * sets parent for this GdOrdToken26Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 16965 by default
  }
  /** initializes the field in GdOrdToken26Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_26_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken26L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken26T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken26LCounter = -1;

  public boolean isGdOrdToken26LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken26LCounter != sharedCounter;
    localGdOrdToken26LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_26_L_LEN = 2;
  /** serializeGdOrdToken26L */
  protected void serializeGdOrdToken26L(short gdOrdToken26L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken26L, GD_ORD_TOKEN_26_L_LEN),
        beginGdOrdToken26L,
        GD_ORD_TOKEN_26_L_LEN);
    localGdOrdToken26LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken26LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken26L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken26L() {
    return (getShort(beginGdOrdToken26L));
  }

  int localGdOrdToken26TCounter = -1;

  public boolean isGdOrdToken26TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken26TCounter != sharedCounter;
    localGdOrdToken26TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_26_T_LEN = 515;
  /** serialize this GdOrdToken26T */
  protected void serializeGdOrdToken26T(char[] gdOrdToken26T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken26T, 0, getStringValue(), beginGdOrdToken26T, GD_ORD_TOKEN_26_T_LEN);
    localGdOrdToken26TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken26TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken26T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken26T() {
    return (substring(
        getStringValue(), beginGdOrdToken26T, beginGdOrdToken26T + GD_ORD_TOKEN_26_T_LEN));
  }
}
