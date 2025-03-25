package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken51Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken51Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken51Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_51_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken51L;
  protected int beginGdOrdToken51T;

  /** Constructor for GdOrdToken51Serialized */
  public GdOrdToken51Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken51Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken51Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken51Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 29890); // serialize this field at offset 29890 by default
  }

  /**
   * sets parent for this GdOrdToken51Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 29890 by default
  }
  /** initializes the field in GdOrdToken51Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_51_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken51L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken51T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken51LCounter = -1;

  public boolean isGdOrdToken51LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken51LCounter != sharedCounter;
    localGdOrdToken51LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_51_L_LEN = 2;
  /** serializeGdOrdToken51L */
  protected void serializeGdOrdToken51L(short gdOrdToken51L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken51L, GD_ORD_TOKEN_51_L_LEN),
        beginGdOrdToken51L,
        GD_ORD_TOKEN_51_L_LEN);
    localGdOrdToken51LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken51LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken51L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken51L() {
    return (getShort(beginGdOrdToken51L));
  }

  int localGdOrdToken51TCounter = -1;

  public boolean isGdOrdToken51TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken51TCounter != sharedCounter;
    localGdOrdToken51TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_51_T_LEN = 515;
  /** serialize this GdOrdToken51T */
  protected void serializeGdOrdToken51T(char[] gdOrdToken51T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken51T, 0, getStringValue(), beginGdOrdToken51T, GD_ORD_TOKEN_51_T_LEN);
    localGdOrdToken51TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken51TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken51T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken51T() {
    return (substring(
        getStringValue(), beginGdOrdToken51T, beginGdOrdToken51T + GD_ORD_TOKEN_51_T_LEN));
  }
}
