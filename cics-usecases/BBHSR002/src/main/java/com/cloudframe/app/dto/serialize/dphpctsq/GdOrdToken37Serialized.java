package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken37Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken37Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken37Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_37_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken37L;
  protected int beginGdOrdToken37T;

  /** Constructor for GdOrdToken37Serialized */
  public GdOrdToken37Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken37Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken37Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken37Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 22652); // serialize this field at offset 22652 by default
  }

  /**
   * sets parent for this GdOrdToken37Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 22652 by default
  }
  /** initializes the field in GdOrdToken37Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_37_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken37L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken37T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken37LCounter = -1;

  public boolean isGdOrdToken37LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken37LCounter != sharedCounter;
    localGdOrdToken37LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_37_L_LEN = 2;
  /** serializeGdOrdToken37L */
  protected void serializeGdOrdToken37L(short gdOrdToken37L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken37L, GD_ORD_TOKEN_37_L_LEN),
        beginGdOrdToken37L,
        GD_ORD_TOKEN_37_L_LEN);
    localGdOrdToken37LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken37LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken37L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken37L() {
    return (getShort(beginGdOrdToken37L));
  }

  int localGdOrdToken37TCounter = -1;

  public boolean isGdOrdToken37TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken37TCounter != sharedCounter;
    localGdOrdToken37TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_37_T_LEN = 515;
  /** serialize this GdOrdToken37T */
  protected void serializeGdOrdToken37T(char[] gdOrdToken37T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken37T, 0, getStringValue(), beginGdOrdToken37T, GD_ORD_TOKEN_37_T_LEN);
    localGdOrdToken37TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken37TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken37T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken37T() {
    return (substring(
        getStringValue(), beginGdOrdToken37T, beginGdOrdToken37T + GD_ORD_TOKEN_37_T_LEN));
  }
}
