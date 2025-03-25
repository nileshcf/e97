package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken83Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken83Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken83Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_83_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken83L;
  protected int beginGdOrdToken83T;

  /** Constructor for GdOrdToken83Serialized */
  public GdOrdToken83Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken83Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken83Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken83Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 46434); // serialize this field at offset 46434 by default
  }

  /**
   * sets parent for this GdOrdToken83Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 46434 by default
  }
  /** initializes the field in GdOrdToken83Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_83_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken83L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken83T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken83LCounter = -1;

  public boolean isGdOrdToken83LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken83LCounter != sharedCounter;
    localGdOrdToken83LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_83_L_LEN = 2;
  /** serializeGdOrdToken83L */
  protected void serializeGdOrdToken83L(short gdOrdToken83L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken83L, GD_ORD_TOKEN_83_L_LEN),
        beginGdOrdToken83L,
        GD_ORD_TOKEN_83_L_LEN);
    localGdOrdToken83LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken83LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken83L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken83L() {
    return (getShort(beginGdOrdToken83L));
  }

  int localGdOrdToken83TCounter = -1;

  public boolean isGdOrdToken83TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken83TCounter != sharedCounter;
    localGdOrdToken83TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_83_T_LEN = 515;
  /** serialize this GdOrdToken83T */
  protected void serializeGdOrdToken83T(char[] gdOrdToken83T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken83T, 0, getStringValue(), beginGdOrdToken83T, GD_ORD_TOKEN_83_T_LEN);
    localGdOrdToken83TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken83TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken83T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken83T() {
    return (substring(
        getStringValue(), beginGdOrdToken83T, beginGdOrdToken83T + GD_ORD_TOKEN_83_T_LEN));
  }
}
