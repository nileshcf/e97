package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken78Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken78Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken78Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_78_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken78L;
  protected int beginGdOrdToken78T;

  /** Constructor for GdOrdToken78Serialized */
  public GdOrdToken78Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken78Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken78Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken78Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 43849); // serialize this field at offset 43849 by default
  }

  /**
   * sets parent for this GdOrdToken78Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 43849 by default
  }
  /** initializes the field in GdOrdToken78Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_78_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken78L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken78T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken78LCounter = -1;

  public boolean isGdOrdToken78LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken78LCounter != sharedCounter;
    localGdOrdToken78LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_78_L_LEN = 2;
  /** serializeGdOrdToken78L */
  protected void serializeGdOrdToken78L(short gdOrdToken78L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken78L, GD_ORD_TOKEN_78_L_LEN),
        beginGdOrdToken78L,
        GD_ORD_TOKEN_78_L_LEN);
    localGdOrdToken78LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken78LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken78L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken78L() {
    return (getShort(beginGdOrdToken78L));
  }

  int localGdOrdToken78TCounter = -1;

  public boolean isGdOrdToken78TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken78TCounter != sharedCounter;
    localGdOrdToken78TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_78_T_LEN = 515;
  /** serialize this GdOrdToken78T */
  protected void serializeGdOrdToken78T(char[] gdOrdToken78T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken78T, 0, getStringValue(), beginGdOrdToken78T, GD_ORD_TOKEN_78_T_LEN);
    localGdOrdToken78TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken78TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken78T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken78T() {
    return (substring(
        getStringValue(), beginGdOrdToken78T, beginGdOrdToken78T + GD_ORD_TOKEN_78_T_LEN));
  }
}
