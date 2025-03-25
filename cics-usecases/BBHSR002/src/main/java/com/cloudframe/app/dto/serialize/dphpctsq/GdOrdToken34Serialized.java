package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken34Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken34Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken34Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_34_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken34L;
  protected int beginGdOrdToken34T;

  /** Constructor for GdOrdToken34Serialized */
  public GdOrdToken34Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken34Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken34Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken34Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 21101); // serialize this field at offset 21101 by default
  }

  /**
   * sets parent for this GdOrdToken34Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 21101 by default
  }
  /** initializes the field in GdOrdToken34Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_34_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken34L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken34T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken34LCounter = -1;

  public boolean isGdOrdToken34LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken34LCounter != sharedCounter;
    localGdOrdToken34LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_34_L_LEN = 2;
  /** serializeGdOrdToken34L */
  protected void serializeGdOrdToken34L(short gdOrdToken34L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken34L, GD_ORD_TOKEN_34_L_LEN),
        beginGdOrdToken34L,
        GD_ORD_TOKEN_34_L_LEN);
    localGdOrdToken34LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken34LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken34L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken34L() {
    return (getShort(beginGdOrdToken34L));
  }

  int localGdOrdToken34TCounter = -1;

  public boolean isGdOrdToken34TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken34TCounter != sharedCounter;
    localGdOrdToken34TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_34_T_LEN = 515;
  /** serialize this GdOrdToken34T */
  protected void serializeGdOrdToken34T(char[] gdOrdToken34T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken34T, 0, getStringValue(), beginGdOrdToken34T, GD_ORD_TOKEN_34_T_LEN);
    localGdOrdToken34TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken34TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken34T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken34T() {
    return (substring(
        getStringValue(), beginGdOrdToken34T, beginGdOrdToken34T + GD_ORD_TOKEN_34_T_LEN));
  }
}
