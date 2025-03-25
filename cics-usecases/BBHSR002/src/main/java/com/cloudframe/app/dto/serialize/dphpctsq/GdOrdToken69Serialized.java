package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken69Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken69Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken69Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_69_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken69L;
  protected int beginGdOrdToken69T;

  /** Constructor for GdOrdToken69Serialized */
  public GdOrdToken69Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken69Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken69Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken69Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 39196); // serialize this field at offset 39196 by default
  }

  /**
   * sets parent for this GdOrdToken69Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 39196 by default
  }
  /** initializes the field in GdOrdToken69Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_69_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken69L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken69T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken69LCounter = -1;

  public boolean isGdOrdToken69LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken69LCounter != sharedCounter;
    localGdOrdToken69LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_69_L_LEN = 2;
  /** serializeGdOrdToken69L */
  protected void serializeGdOrdToken69L(short gdOrdToken69L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken69L, GD_ORD_TOKEN_69_L_LEN),
        beginGdOrdToken69L,
        GD_ORD_TOKEN_69_L_LEN);
    localGdOrdToken69LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken69LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken69L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken69L() {
    return (getShort(beginGdOrdToken69L));
  }

  int localGdOrdToken69TCounter = -1;

  public boolean isGdOrdToken69TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken69TCounter != sharedCounter;
    localGdOrdToken69TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_69_T_LEN = 515;
  /** serialize this GdOrdToken69T */
  protected void serializeGdOrdToken69T(char[] gdOrdToken69T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken69T, 0, getStringValue(), beginGdOrdToken69T, GD_ORD_TOKEN_69_T_LEN);
    localGdOrdToken69TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken69TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken69T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken69T() {
    return (substring(
        getStringValue(), beginGdOrdToken69T, beginGdOrdToken69T + GD_ORD_TOKEN_69_T_LEN));
  }
}
