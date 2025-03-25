package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken39Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken39Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken39Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_39_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken39L;
  protected int beginGdOrdToken39T;

  /** Constructor for GdOrdToken39Serialized */
  public GdOrdToken39Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken39Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken39Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken39Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 23686); // serialize this field at offset 23686 by default
  }

  /**
   * sets parent for this GdOrdToken39Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 23686 by default
  }
  /** initializes the field in GdOrdToken39Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_39_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken39L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken39T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken39LCounter = -1;

  public boolean isGdOrdToken39LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken39LCounter != sharedCounter;
    localGdOrdToken39LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_39_L_LEN = 2;
  /** serializeGdOrdToken39L */
  protected void serializeGdOrdToken39L(short gdOrdToken39L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken39L, GD_ORD_TOKEN_39_L_LEN),
        beginGdOrdToken39L,
        GD_ORD_TOKEN_39_L_LEN);
    localGdOrdToken39LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken39LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken39L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken39L() {
    return (getShort(beginGdOrdToken39L));
  }

  int localGdOrdToken39TCounter = -1;

  public boolean isGdOrdToken39TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken39TCounter != sharedCounter;
    localGdOrdToken39TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_39_T_LEN = 515;
  /** serialize this GdOrdToken39T */
  protected void serializeGdOrdToken39T(char[] gdOrdToken39T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken39T, 0, getStringValue(), beginGdOrdToken39T, GD_ORD_TOKEN_39_T_LEN);
    localGdOrdToken39TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken39TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken39T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken39T() {
    return (substring(
        getStringValue(), beginGdOrdToken39T, beginGdOrdToken39T + GD_ORD_TOKEN_39_T_LEN));
  }
}
