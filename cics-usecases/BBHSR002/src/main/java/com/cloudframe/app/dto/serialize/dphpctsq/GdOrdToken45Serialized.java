package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken45Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken45Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken45Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_45_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken45L;
  protected int beginGdOrdToken45T;

  /** Constructor for GdOrdToken45Serialized */
  public GdOrdToken45Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken45Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken45Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken45Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 26788); // serialize this field at offset 26788 by default
  }

  /**
   * sets parent for this GdOrdToken45Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 26788 by default
  }
  /** initializes the field in GdOrdToken45Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_45_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken45L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken45T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken45LCounter = -1;

  public boolean isGdOrdToken45LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken45LCounter != sharedCounter;
    localGdOrdToken45LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_45_L_LEN = 2;
  /** serializeGdOrdToken45L */
  protected void serializeGdOrdToken45L(short gdOrdToken45L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken45L, GD_ORD_TOKEN_45_L_LEN),
        beginGdOrdToken45L,
        GD_ORD_TOKEN_45_L_LEN);
    localGdOrdToken45LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken45LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken45L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken45L() {
    return (getShort(beginGdOrdToken45L));
  }

  int localGdOrdToken45TCounter = -1;

  public boolean isGdOrdToken45TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken45TCounter != sharedCounter;
    localGdOrdToken45TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_45_T_LEN = 515;
  /** serialize this GdOrdToken45T */
  protected void serializeGdOrdToken45T(char[] gdOrdToken45T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken45T, 0, getStringValue(), beginGdOrdToken45T, GD_ORD_TOKEN_45_T_LEN);
    localGdOrdToken45TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken45TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken45T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken45T() {
    return (substring(
        getStringValue(), beginGdOrdToken45T, beginGdOrdToken45T + GD_ORD_TOKEN_45_T_LEN));
  }
}
