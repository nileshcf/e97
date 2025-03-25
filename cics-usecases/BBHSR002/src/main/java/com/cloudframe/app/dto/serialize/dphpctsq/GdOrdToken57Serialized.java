package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken57Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken57Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken57Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_57_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken57L;
  protected int beginGdOrdToken57T;

  /** Constructor for GdOrdToken57Serialized */
  public GdOrdToken57Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken57Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken57Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken57Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 32992); // serialize this field at offset 32992 by default
  }

  /**
   * sets parent for this GdOrdToken57Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 32992 by default
  }
  /** initializes the field in GdOrdToken57Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_57_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken57L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken57T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken57LCounter = -1;

  public boolean isGdOrdToken57LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken57LCounter != sharedCounter;
    localGdOrdToken57LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_57_L_LEN = 2;
  /** serializeGdOrdToken57L */
  protected void serializeGdOrdToken57L(short gdOrdToken57L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken57L, GD_ORD_TOKEN_57_L_LEN),
        beginGdOrdToken57L,
        GD_ORD_TOKEN_57_L_LEN);
    localGdOrdToken57LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken57LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken57L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken57L() {
    return (getShort(beginGdOrdToken57L));
  }

  int localGdOrdToken57TCounter = -1;

  public boolean isGdOrdToken57TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken57TCounter != sharedCounter;
    localGdOrdToken57TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_57_T_LEN = 515;
  /** serialize this GdOrdToken57T */
  protected void serializeGdOrdToken57T(char[] gdOrdToken57T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken57T, 0, getStringValue(), beginGdOrdToken57T, GD_ORD_TOKEN_57_T_LEN);
    localGdOrdToken57TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken57TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken57T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken57T() {
    return (substring(
        getStringValue(), beginGdOrdToken57T, beginGdOrdToken57T + GD_ORD_TOKEN_57_T_LEN));
  }
}
