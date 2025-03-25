package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken55Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken55Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken55Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_55_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken55L;
  protected int beginGdOrdToken55T;

  /** Constructor for GdOrdToken55Serialized */
  public GdOrdToken55Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken55Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken55Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken55Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 31958); // serialize this field at offset 31958 by default
  }

  /**
   * sets parent for this GdOrdToken55Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 31958 by default
  }
  /** initializes the field in GdOrdToken55Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_55_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken55L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken55T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken55LCounter = -1;

  public boolean isGdOrdToken55LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken55LCounter != sharedCounter;
    localGdOrdToken55LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_55_L_LEN = 2;
  /** serializeGdOrdToken55L */
  protected void serializeGdOrdToken55L(short gdOrdToken55L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken55L, GD_ORD_TOKEN_55_L_LEN),
        beginGdOrdToken55L,
        GD_ORD_TOKEN_55_L_LEN);
    localGdOrdToken55LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken55LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken55L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken55L() {
    return (getShort(beginGdOrdToken55L));
  }

  int localGdOrdToken55TCounter = -1;

  public boolean isGdOrdToken55TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken55TCounter != sharedCounter;
    localGdOrdToken55TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_55_T_LEN = 515;
  /** serialize this GdOrdToken55T */
  protected void serializeGdOrdToken55T(char[] gdOrdToken55T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken55T, 0, getStringValue(), beginGdOrdToken55T, GD_ORD_TOKEN_55_T_LEN);
    localGdOrdToken55TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken55TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken55T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken55T() {
    return (substring(
        getStringValue(), beginGdOrdToken55T, beginGdOrdToken55T + GD_ORD_TOKEN_55_T_LEN));
  }
}
