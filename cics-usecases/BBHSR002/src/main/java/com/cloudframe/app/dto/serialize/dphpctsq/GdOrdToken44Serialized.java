package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken44Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken44Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken44Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_44_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken44L;
  protected int beginGdOrdToken44T;

  /** Constructor for GdOrdToken44Serialized */
  public GdOrdToken44Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken44Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken44Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken44Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 26271); // serialize this field at offset 26271 by default
  }

  /**
   * sets parent for this GdOrdToken44Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 26271 by default
  }
  /** initializes the field in GdOrdToken44Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_44_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken44L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken44T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken44LCounter = -1;

  public boolean isGdOrdToken44LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken44LCounter != sharedCounter;
    localGdOrdToken44LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_44_L_LEN = 2;
  /** serializeGdOrdToken44L */
  protected void serializeGdOrdToken44L(short gdOrdToken44L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken44L, GD_ORD_TOKEN_44_L_LEN),
        beginGdOrdToken44L,
        GD_ORD_TOKEN_44_L_LEN);
    localGdOrdToken44LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken44LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken44L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken44L() {
    return (getShort(beginGdOrdToken44L));
  }

  int localGdOrdToken44TCounter = -1;

  public boolean isGdOrdToken44TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken44TCounter != sharedCounter;
    localGdOrdToken44TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_44_T_LEN = 515;
  /** serialize this GdOrdToken44T */
  protected void serializeGdOrdToken44T(char[] gdOrdToken44T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken44T, 0, getStringValue(), beginGdOrdToken44T, GD_ORD_TOKEN_44_T_LEN);
    localGdOrdToken44TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken44TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken44T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken44T() {
    return (substring(
        getStringValue(), beginGdOrdToken44T, beginGdOrdToken44T + GD_ORD_TOKEN_44_T_LEN));
  }
}
