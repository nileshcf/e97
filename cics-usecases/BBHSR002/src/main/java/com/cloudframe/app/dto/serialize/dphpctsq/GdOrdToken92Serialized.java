package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken92Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken92Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken92Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_92_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken92L;
  protected int beginGdOrdToken92T;

  /** Constructor for GdOrdToken92Serialized */
  public GdOrdToken92Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken92Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken92Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken92Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 51087); // serialize this field at offset 51087 by default
  }

  /**
   * sets parent for this GdOrdToken92Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 51087 by default
  }
  /** initializes the field in GdOrdToken92Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_92_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken92L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken92T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken92LCounter = -1;

  public boolean isGdOrdToken92LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken92LCounter != sharedCounter;
    localGdOrdToken92LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_92_L_LEN = 2;
  /** serializeGdOrdToken92L */
  protected void serializeGdOrdToken92L(short gdOrdToken92L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken92L, GD_ORD_TOKEN_92_L_LEN),
        beginGdOrdToken92L,
        GD_ORD_TOKEN_92_L_LEN);
    localGdOrdToken92LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken92LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken92L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken92L() {
    return (getShort(beginGdOrdToken92L));
  }

  int localGdOrdToken92TCounter = -1;

  public boolean isGdOrdToken92TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken92TCounter != sharedCounter;
    localGdOrdToken92TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_92_T_LEN = 515;
  /** serialize this GdOrdToken92T */
  protected void serializeGdOrdToken92T(char[] gdOrdToken92T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken92T, 0, getStringValue(), beginGdOrdToken92T, GD_ORD_TOKEN_92_T_LEN);
    localGdOrdToken92TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken92TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken92T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken92T() {
    return (substring(
        getStringValue(), beginGdOrdToken92T, beginGdOrdToken92T + GD_ORD_TOKEN_92_T_LEN));
  }
}
