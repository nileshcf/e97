package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken74Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken74Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken74Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_74_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken74L;
  protected int beginGdOrdToken74T;

  /** Constructor for GdOrdToken74Serialized */
  public GdOrdToken74Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken74Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken74Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken74Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 41781); // serialize this field at offset 41781 by default
  }

  /**
   * sets parent for this GdOrdToken74Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 41781 by default
  }
  /** initializes the field in GdOrdToken74Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_74_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken74L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken74T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken74LCounter = -1;

  public boolean isGdOrdToken74LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken74LCounter != sharedCounter;
    localGdOrdToken74LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_74_L_LEN = 2;
  /** serializeGdOrdToken74L */
  protected void serializeGdOrdToken74L(short gdOrdToken74L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken74L, GD_ORD_TOKEN_74_L_LEN),
        beginGdOrdToken74L,
        GD_ORD_TOKEN_74_L_LEN);
    localGdOrdToken74LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken74LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken74L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken74L() {
    return (getShort(beginGdOrdToken74L));
  }

  int localGdOrdToken74TCounter = -1;

  public boolean isGdOrdToken74TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken74TCounter != sharedCounter;
    localGdOrdToken74TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_74_T_LEN = 515;
  /** serialize this GdOrdToken74T */
  protected void serializeGdOrdToken74T(char[] gdOrdToken74T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken74T, 0, getStringValue(), beginGdOrdToken74T, GD_ORD_TOKEN_74_T_LEN);
    localGdOrdToken74TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken74TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken74T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken74T() {
    return (substring(
        getStringValue(), beginGdOrdToken74T, beginGdOrdToken74T + GD_ORD_TOKEN_74_T_LEN));
  }
}
