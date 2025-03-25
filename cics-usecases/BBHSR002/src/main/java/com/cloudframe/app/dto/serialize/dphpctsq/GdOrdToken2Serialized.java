package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken2Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken2Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken2Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_2_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken2L;
  protected int beginGdOrdToken2T;

  /** Constructor for GdOrdToken2Serialized */
  public GdOrdToken2Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken2Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken2Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken2Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 4557); // serialize this field at offset 4557 by default
  }

  /**
   * sets parent for this GdOrdToken2Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 4557 by default
  }
  /** initializes the field in GdOrdToken2Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_2_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken2L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken2T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken2LCounter = -1;

  public boolean isGdOrdToken2LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken2LCounter != sharedCounter;
    localGdOrdToken2LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_2_L_LEN = 2;
  /** serializeGdOrdToken2L */
  protected void serializeGdOrdToken2L(short gdOrdToken2L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken2L, GD_ORD_TOKEN_2_L_LEN),
        beginGdOrdToken2L,
        GD_ORD_TOKEN_2_L_LEN);
    localGdOrdToken2LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken2LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken2L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken2L() {
    return (getShort(beginGdOrdToken2L));
  }

  int localGdOrdToken2TCounter = -1;

  public boolean isGdOrdToken2TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken2TCounter != sharedCounter;
    localGdOrdToken2TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_2_T_LEN = 515;
  /** serialize this GdOrdToken2T */
  protected void serializeGdOrdToken2T(char[] gdOrdToken2T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken2T, 0, getStringValue(), beginGdOrdToken2T, GD_ORD_TOKEN_2_T_LEN);
    localGdOrdToken2TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken2TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken2T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken2T() {
    return (substring(
        getStringValue(), beginGdOrdToken2T, beginGdOrdToken2T + GD_ORD_TOKEN_2_T_LEN));
  }
}
