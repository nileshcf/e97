package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken97Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken97Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken97Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_97_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken97L;
  protected int beginGdOrdToken97T;

  /** Constructor for GdOrdToken97Serialized */
  public GdOrdToken97Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken97Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken97Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken97Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 53672); // serialize this field at offset 53672 by default
  }

  /**
   * sets parent for this GdOrdToken97Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 53672 by default
  }
  /** initializes the field in GdOrdToken97Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_97_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken97L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken97T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken97LCounter = -1;

  public boolean isGdOrdToken97LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken97LCounter != sharedCounter;
    localGdOrdToken97LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_97_L_LEN = 2;
  /** serializeGdOrdToken97L */
  protected void serializeGdOrdToken97L(short gdOrdToken97L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken97L, GD_ORD_TOKEN_97_L_LEN),
        beginGdOrdToken97L,
        GD_ORD_TOKEN_97_L_LEN);
    localGdOrdToken97LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken97LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken97L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken97L() {
    return (getShort(beginGdOrdToken97L));
  }

  int localGdOrdToken97TCounter = -1;

  public boolean isGdOrdToken97TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken97TCounter != sharedCounter;
    localGdOrdToken97TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_97_T_LEN = 515;
  /** serialize this GdOrdToken97T */
  protected void serializeGdOrdToken97T(char[] gdOrdToken97T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken97T, 0, getStringValue(), beginGdOrdToken97T, GD_ORD_TOKEN_97_T_LEN);
    localGdOrdToken97TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken97TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken97T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken97T() {
    return (substring(
        getStringValue(), beginGdOrdToken97T, beginGdOrdToken97T + GD_ORD_TOKEN_97_T_LEN));
  }
}
