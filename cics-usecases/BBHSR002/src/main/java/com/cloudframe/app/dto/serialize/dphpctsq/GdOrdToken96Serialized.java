package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken96Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken96Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken96Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_96_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken96L;
  protected int beginGdOrdToken96T;

  /** Constructor for GdOrdToken96Serialized */
  public GdOrdToken96Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken96Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken96Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken96Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 53155); // serialize this field at offset 53155 by default
  }

  /**
   * sets parent for this GdOrdToken96Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 53155 by default
  }
  /** initializes the field in GdOrdToken96Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_96_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken96L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken96T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken96LCounter = -1;

  public boolean isGdOrdToken96LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken96LCounter != sharedCounter;
    localGdOrdToken96LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_96_L_LEN = 2;
  /** serializeGdOrdToken96L */
  protected void serializeGdOrdToken96L(short gdOrdToken96L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken96L, GD_ORD_TOKEN_96_L_LEN),
        beginGdOrdToken96L,
        GD_ORD_TOKEN_96_L_LEN);
    localGdOrdToken96LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken96LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken96L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken96L() {
    return (getShort(beginGdOrdToken96L));
  }

  int localGdOrdToken96TCounter = -1;

  public boolean isGdOrdToken96TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken96TCounter != sharedCounter;
    localGdOrdToken96TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_96_T_LEN = 515;
  /** serialize this GdOrdToken96T */
  protected void serializeGdOrdToken96T(char[] gdOrdToken96T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken96T, 0, getStringValue(), beginGdOrdToken96T, GD_ORD_TOKEN_96_T_LEN);
    localGdOrdToken96TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken96TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken96T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken96T() {
    return (substring(
        getStringValue(), beginGdOrdToken96T, beginGdOrdToken96T + GD_ORD_TOKEN_96_T_LEN));
  }
}
