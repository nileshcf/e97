package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken71Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken71Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken71Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_71_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken71L;
  protected int beginGdOrdToken71T;

  /** Constructor for GdOrdToken71Serialized */
  public GdOrdToken71Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken71Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken71Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken71Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 40230); // serialize this field at offset 40230 by default
  }

  /**
   * sets parent for this GdOrdToken71Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 40230 by default
  }
  /** initializes the field in GdOrdToken71Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_71_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken71L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken71T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken71LCounter = -1;

  public boolean isGdOrdToken71LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken71LCounter != sharedCounter;
    localGdOrdToken71LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_71_L_LEN = 2;
  /** serializeGdOrdToken71L */
  protected void serializeGdOrdToken71L(short gdOrdToken71L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken71L, GD_ORD_TOKEN_71_L_LEN),
        beginGdOrdToken71L,
        GD_ORD_TOKEN_71_L_LEN);
    localGdOrdToken71LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken71LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken71L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken71L() {
    return (getShort(beginGdOrdToken71L));
  }

  int localGdOrdToken71TCounter = -1;

  public boolean isGdOrdToken71TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken71TCounter != sharedCounter;
    localGdOrdToken71TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_71_T_LEN = 515;
  /** serialize this GdOrdToken71T */
  protected void serializeGdOrdToken71T(char[] gdOrdToken71T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken71T, 0, getStringValue(), beginGdOrdToken71T, GD_ORD_TOKEN_71_T_LEN);
    localGdOrdToken71TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken71TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken71T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken71T() {
    return (substring(
        getStringValue(), beginGdOrdToken71T, beginGdOrdToken71T + GD_ORD_TOKEN_71_T_LEN));
  }
}
