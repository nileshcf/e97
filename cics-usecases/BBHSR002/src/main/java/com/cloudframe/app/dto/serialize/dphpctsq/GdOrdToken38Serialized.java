package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken38Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken38Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken38Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_38_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken38L;
  protected int beginGdOrdToken38T;

  /** Constructor for GdOrdToken38Serialized */
  public GdOrdToken38Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken38Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken38Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken38Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 23169); // serialize this field at offset 23169 by default
  }

  /**
   * sets parent for this GdOrdToken38Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 23169 by default
  }
  /** initializes the field in GdOrdToken38Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_38_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken38L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken38T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken38LCounter = -1;

  public boolean isGdOrdToken38LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken38LCounter != sharedCounter;
    localGdOrdToken38LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_38_L_LEN = 2;
  /** serializeGdOrdToken38L */
  protected void serializeGdOrdToken38L(short gdOrdToken38L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken38L, GD_ORD_TOKEN_38_L_LEN),
        beginGdOrdToken38L,
        GD_ORD_TOKEN_38_L_LEN);
    localGdOrdToken38LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken38LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken38L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken38L() {
    return (getShort(beginGdOrdToken38L));
  }

  int localGdOrdToken38TCounter = -1;

  public boolean isGdOrdToken38TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken38TCounter != sharedCounter;
    localGdOrdToken38TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_38_T_LEN = 515;
  /** serialize this GdOrdToken38T */
  protected void serializeGdOrdToken38T(char[] gdOrdToken38T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken38T, 0, getStringValue(), beginGdOrdToken38T, GD_ORD_TOKEN_38_T_LEN);
    localGdOrdToken38TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken38TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken38T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken38T() {
    return (substring(
        getStringValue(), beginGdOrdToken38T, beginGdOrdToken38T + GD_ORD_TOKEN_38_T_LEN));
  }
}
