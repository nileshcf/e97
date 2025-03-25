package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken82Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken82Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken82Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_82_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken82L;
  protected int beginGdOrdToken82T;

  /** Constructor for GdOrdToken82Serialized */
  public GdOrdToken82Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken82Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken82Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken82Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 45917); // serialize this field at offset 45917 by default
  }

  /**
   * sets parent for this GdOrdToken82Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 45917 by default
  }
  /** initializes the field in GdOrdToken82Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_82_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken82L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken82T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken82LCounter = -1;

  public boolean isGdOrdToken82LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken82LCounter != sharedCounter;
    localGdOrdToken82LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_82_L_LEN = 2;
  /** serializeGdOrdToken82L */
  protected void serializeGdOrdToken82L(short gdOrdToken82L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken82L, GD_ORD_TOKEN_82_L_LEN),
        beginGdOrdToken82L,
        GD_ORD_TOKEN_82_L_LEN);
    localGdOrdToken82LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken82LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken82L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken82L() {
    return (getShort(beginGdOrdToken82L));
  }

  int localGdOrdToken82TCounter = -1;

  public boolean isGdOrdToken82TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken82TCounter != sharedCounter;
    localGdOrdToken82TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_82_T_LEN = 515;
  /** serialize this GdOrdToken82T */
  protected void serializeGdOrdToken82T(char[] gdOrdToken82T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken82T, 0, getStringValue(), beginGdOrdToken82T, GD_ORD_TOKEN_82_T_LEN);
    localGdOrdToken82TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken82TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken82T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken82T() {
    return (substring(
        getStringValue(), beginGdOrdToken82T, beginGdOrdToken82T + GD_ORD_TOKEN_82_T_LEN));
  }
}
