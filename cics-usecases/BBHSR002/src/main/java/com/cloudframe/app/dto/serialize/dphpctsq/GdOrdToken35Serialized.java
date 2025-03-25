package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken35Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken35Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken35Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_35_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken35L;
  protected int beginGdOrdToken35T;

  /** Constructor for GdOrdToken35Serialized */
  public GdOrdToken35Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken35Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken35Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken35Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 21618); // serialize this field at offset 21618 by default
  }

  /**
   * sets parent for this GdOrdToken35Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 21618 by default
  }
  /** initializes the field in GdOrdToken35Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_35_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken35L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken35T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken35LCounter = -1;

  public boolean isGdOrdToken35LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken35LCounter != sharedCounter;
    localGdOrdToken35LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_35_L_LEN = 2;
  /** serializeGdOrdToken35L */
  protected void serializeGdOrdToken35L(short gdOrdToken35L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken35L, GD_ORD_TOKEN_35_L_LEN),
        beginGdOrdToken35L,
        GD_ORD_TOKEN_35_L_LEN);
    localGdOrdToken35LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken35LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken35L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken35L() {
    return (getShort(beginGdOrdToken35L));
  }

  int localGdOrdToken35TCounter = -1;

  public boolean isGdOrdToken35TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken35TCounter != sharedCounter;
    localGdOrdToken35TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_35_T_LEN = 515;
  /** serialize this GdOrdToken35T */
  protected void serializeGdOrdToken35T(char[] gdOrdToken35T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken35T, 0, getStringValue(), beginGdOrdToken35T, GD_ORD_TOKEN_35_T_LEN);
    localGdOrdToken35TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken35TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken35T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken35T() {
    return (substring(
        getStringValue(), beginGdOrdToken35T, beginGdOrdToken35T + GD_ORD_TOKEN_35_T_LEN));
  }
}
