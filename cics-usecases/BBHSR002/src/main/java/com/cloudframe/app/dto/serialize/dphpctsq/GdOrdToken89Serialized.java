package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken89Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken89Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken89Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_89_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken89L;
  protected int beginGdOrdToken89T;

  /** Constructor for GdOrdToken89Serialized */
  public GdOrdToken89Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken89Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken89Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken89Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 49536); // serialize this field at offset 49536 by default
  }

  /**
   * sets parent for this GdOrdToken89Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 49536 by default
  }
  /** initializes the field in GdOrdToken89Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_89_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken89L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken89T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken89LCounter = -1;

  public boolean isGdOrdToken89LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken89LCounter != sharedCounter;
    localGdOrdToken89LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_89_L_LEN = 2;
  /** serializeGdOrdToken89L */
  protected void serializeGdOrdToken89L(short gdOrdToken89L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken89L, GD_ORD_TOKEN_89_L_LEN),
        beginGdOrdToken89L,
        GD_ORD_TOKEN_89_L_LEN);
    localGdOrdToken89LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken89LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken89L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken89L() {
    return (getShort(beginGdOrdToken89L));
  }

  int localGdOrdToken89TCounter = -1;

  public boolean isGdOrdToken89TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken89TCounter != sharedCounter;
    localGdOrdToken89TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_89_T_LEN = 515;
  /** serialize this GdOrdToken89T */
  protected void serializeGdOrdToken89T(char[] gdOrdToken89T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken89T, 0, getStringValue(), beginGdOrdToken89T, GD_ORD_TOKEN_89_T_LEN);
    localGdOrdToken89TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken89TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken89T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken89T() {
    return (substring(
        getStringValue(), beginGdOrdToken89T, beginGdOrdToken89T + GD_ORD_TOKEN_89_T_LEN));
  }
}
