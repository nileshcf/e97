package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken8Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken8Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken8Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_8_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken8L;
  protected int beginGdOrdToken8T;

  /** Constructor for GdOrdToken8Serialized */
  public GdOrdToken8Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken8Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken8Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken8Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 7659); // serialize this field at offset 7659 by default
  }

  /**
   * sets parent for this GdOrdToken8Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 7659 by default
  }
  /** initializes the field in GdOrdToken8Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_8_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken8L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken8T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken8LCounter = -1;

  public boolean isGdOrdToken8LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken8LCounter != sharedCounter;
    localGdOrdToken8LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_8_L_LEN = 2;
  /** serializeGdOrdToken8L */
  protected void serializeGdOrdToken8L(short gdOrdToken8L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken8L, GD_ORD_TOKEN_8_L_LEN),
        beginGdOrdToken8L,
        GD_ORD_TOKEN_8_L_LEN);
    localGdOrdToken8LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken8LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken8L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken8L() {
    return (getShort(beginGdOrdToken8L));
  }

  int localGdOrdToken8TCounter = -1;

  public boolean isGdOrdToken8TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken8TCounter != sharedCounter;
    localGdOrdToken8TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_8_T_LEN = 515;
  /** serialize this GdOrdToken8T */
  protected void serializeGdOrdToken8T(char[] gdOrdToken8T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken8T, 0, getStringValue(), beginGdOrdToken8T, GD_ORD_TOKEN_8_T_LEN);
    localGdOrdToken8TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken8TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken8T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken8T() {
    return (substring(
        getStringValue(), beginGdOrdToken8T, beginGdOrdToken8T + GD_ORD_TOKEN_8_T_LEN));
  }
}
