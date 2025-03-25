package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken72Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken72Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken72Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_72_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken72L;
  protected int beginGdOrdToken72T;

  /** Constructor for GdOrdToken72Serialized */
  public GdOrdToken72Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken72Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken72Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken72Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 40747); // serialize this field at offset 40747 by default
  }

  /**
   * sets parent for this GdOrdToken72Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 40747 by default
  }
  /** initializes the field in GdOrdToken72Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_72_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken72L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken72T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken72LCounter = -1;

  public boolean isGdOrdToken72LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken72LCounter != sharedCounter;
    localGdOrdToken72LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_72_L_LEN = 2;
  /** serializeGdOrdToken72L */
  protected void serializeGdOrdToken72L(short gdOrdToken72L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken72L, GD_ORD_TOKEN_72_L_LEN),
        beginGdOrdToken72L,
        GD_ORD_TOKEN_72_L_LEN);
    localGdOrdToken72LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken72LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken72L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken72L() {
    return (getShort(beginGdOrdToken72L));
  }

  int localGdOrdToken72TCounter = -1;

  public boolean isGdOrdToken72TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken72TCounter != sharedCounter;
    localGdOrdToken72TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_72_T_LEN = 515;
  /** serialize this GdOrdToken72T */
  protected void serializeGdOrdToken72T(char[] gdOrdToken72T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken72T, 0, getStringValue(), beginGdOrdToken72T, GD_ORD_TOKEN_72_T_LEN);
    localGdOrdToken72TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken72TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken72T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken72T() {
    return (substring(
        getStringValue(), beginGdOrdToken72T, beginGdOrdToken72T + GD_ORD_TOKEN_72_T_LEN));
  }
}
