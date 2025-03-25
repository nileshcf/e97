package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken14Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken14Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken14Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_14_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken14L;
  protected int beginGdOrdToken14T;

  /** Constructor for GdOrdToken14Serialized */
  public GdOrdToken14Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken14Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken14Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken14Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 10761); // serialize this field at offset 10761 by default
  }

  /**
   * sets parent for this GdOrdToken14Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 10761 by default
  }
  /** initializes the field in GdOrdToken14Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_14_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken14L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken14T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken14LCounter = -1;

  public boolean isGdOrdToken14LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken14LCounter != sharedCounter;
    localGdOrdToken14LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_14_L_LEN = 2;
  /** serializeGdOrdToken14L */
  protected void serializeGdOrdToken14L(short gdOrdToken14L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken14L, GD_ORD_TOKEN_14_L_LEN),
        beginGdOrdToken14L,
        GD_ORD_TOKEN_14_L_LEN);
    localGdOrdToken14LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken14LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken14L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken14L() {
    return (getShort(beginGdOrdToken14L));
  }

  int localGdOrdToken14TCounter = -1;

  public boolean isGdOrdToken14TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken14TCounter != sharedCounter;
    localGdOrdToken14TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_14_T_LEN = 515;
  /** serialize this GdOrdToken14T */
  protected void serializeGdOrdToken14T(char[] gdOrdToken14T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken14T, 0, getStringValue(), beginGdOrdToken14T, GD_ORD_TOKEN_14_T_LEN);
    localGdOrdToken14TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken14TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken14T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken14T() {
    return (substring(
        getStringValue(), beginGdOrdToken14T, beginGdOrdToken14T + GD_ORD_TOKEN_14_T_LEN));
  }
}
