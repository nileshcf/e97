package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken73Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken73Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken73Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_73_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken73L;
  protected int beginGdOrdToken73T;

  /** Constructor for GdOrdToken73Serialized */
  public GdOrdToken73Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken73Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken73Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken73Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 41264); // serialize this field at offset 41264 by default
  }

  /**
   * sets parent for this GdOrdToken73Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 41264 by default
  }
  /** initializes the field in GdOrdToken73Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_73_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken73L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken73T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken73LCounter = -1;

  public boolean isGdOrdToken73LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken73LCounter != sharedCounter;
    localGdOrdToken73LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_73_L_LEN = 2;
  /** serializeGdOrdToken73L */
  protected void serializeGdOrdToken73L(short gdOrdToken73L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken73L, GD_ORD_TOKEN_73_L_LEN),
        beginGdOrdToken73L,
        GD_ORD_TOKEN_73_L_LEN);
    localGdOrdToken73LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken73LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken73L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken73L() {
    return (getShort(beginGdOrdToken73L));
  }

  int localGdOrdToken73TCounter = -1;

  public boolean isGdOrdToken73TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken73TCounter != sharedCounter;
    localGdOrdToken73TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_73_T_LEN = 515;
  /** serialize this GdOrdToken73T */
  protected void serializeGdOrdToken73T(char[] gdOrdToken73T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken73T, 0, getStringValue(), beginGdOrdToken73T, GD_ORD_TOKEN_73_T_LEN);
    localGdOrdToken73TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken73TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken73T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken73T() {
    return (substring(
        getStringValue(), beginGdOrdToken73T, beginGdOrdToken73T + GD_ORD_TOKEN_73_T_LEN));
  }
}
