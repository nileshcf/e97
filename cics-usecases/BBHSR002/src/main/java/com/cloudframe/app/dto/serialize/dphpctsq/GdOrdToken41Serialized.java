package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken41Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken41Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken41Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_41_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken41L;
  protected int beginGdOrdToken41T;

  /** Constructor for GdOrdToken41Serialized */
  public GdOrdToken41Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken41Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken41Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken41Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 24720); // serialize this field at offset 24720 by default
  }

  /**
   * sets parent for this GdOrdToken41Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 24720 by default
  }
  /** initializes the field in GdOrdToken41Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_41_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken41L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken41T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken41LCounter = -1;

  public boolean isGdOrdToken41LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken41LCounter != sharedCounter;
    localGdOrdToken41LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_41_L_LEN = 2;
  /** serializeGdOrdToken41L */
  protected void serializeGdOrdToken41L(short gdOrdToken41L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken41L, GD_ORD_TOKEN_41_L_LEN),
        beginGdOrdToken41L,
        GD_ORD_TOKEN_41_L_LEN);
    localGdOrdToken41LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken41LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken41L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken41L() {
    return (getShort(beginGdOrdToken41L));
  }

  int localGdOrdToken41TCounter = -1;

  public boolean isGdOrdToken41TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken41TCounter != sharedCounter;
    localGdOrdToken41TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_41_T_LEN = 515;
  /** serialize this GdOrdToken41T */
  protected void serializeGdOrdToken41T(char[] gdOrdToken41T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken41T, 0, getStringValue(), beginGdOrdToken41T, GD_ORD_TOKEN_41_T_LEN);
    localGdOrdToken41TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken41TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken41T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken41T() {
    return (substring(
        getStringValue(), beginGdOrdToken41T, beginGdOrdToken41T + GD_ORD_TOKEN_41_T_LEN));
  }
}
