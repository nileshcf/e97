package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken100Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken100Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken100Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_100_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken100L;
  protected int beginGdOrdToken100T;

  /** Constructor for GdOrdToken100Serialized */
  public GdOrdToken100Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken100Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken100Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken100Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 55223); // serialize this field at offset 55223 by default
  }

  /**
   * sets parent for this GdOrdToken100Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 55223 by default
  }
  /** initializes the field in GdOrdToken100Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_100_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken100L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken100T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken100LCounter = -1;

  public boolean isGdOrdToken100LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken100LCounter != sharedCounter;
    localGdOrdToken100LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_100_L_LEN = 2;
  /** serializeGdOrdToken100L */
  protected void serializeGdOrdToken100L(short gdOrdToken100L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken100L, GD_ORD_TOKEN_100_L_LEN),
        beginGdOrdToken100L,
        GD_ORD_TOKEN_100_L_LEN);
    localGdOrdToken100LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken100LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken100L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken100L() {
    return (getShort(beginGdOrdToken100L));
  }

  int localGdOrdToken100TCounter = -1;

  public boolean isGdOrdToken100TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken100TCounter != sharedCounter;
    localGdOrdToken100TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_100_T_LEN = 515;
  /** serialize this GdOrdToken100T */
  protected void serializeGdOrdToken100T(char[] gdOrdToken100T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken100T, 0, getStringValue(), beginGdOrdToken100T, GD_ORD_TOKEN_100_T_LEN);
    localGdOrdToken100TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken100TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken100T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken100T() {
    return (substring(
        getStringValue(), beginGdOrdToken100T, beginGdOrdToken100T + GD_ORD_TOKEN_100_T_LEN));
  }
}
