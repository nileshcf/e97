package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken70Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken70Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken70Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_70_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken70L;
  protected int beginGdOrdToken70T;

  /** Constructor for GdOrdToken70Serialized */
  public GdOrdToken70Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken70Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken70Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken70Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 39713); // serialize this field at offset 39713 by default
  }

  /**
   * sets parent for this GdOrdToken70Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 39713 by default
  }
  /** initializes the field in GdOrdToken70Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_70_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken70L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken70T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken70LCounter = -1;

  public boolean isGdOrdToken70LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken70LCounter != sharedCounter;
    localGdOrdToken70LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_70_L_LEN = 2;
  /** serializeGdOrdToken70L */
  protected void serializeGdOrdToken70L(short gdOrdToken70L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken70L, GD_ORD_TOKEN_70_L_LEN),
        beginGdOrdToken70L,
        GD_ORD_TOKEN_70_L_LEN);
    localGdOrdToken70LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken70LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken70L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken70L() {
    return (getShort(beginGdOrdToken70L));
  }

  int localGdOrdToken70TCounter = -1;

  public boolean isGdOrdToken70TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken70TCounter != sharedCounter;
    localGdOrdToken70TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_70_T_LEN = 515;
  /** serialize this GdOrdToken70T */
  protected void serializeGdOrdToken70T(char[] gdOrdToken70T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken70T, 0, getStringValue(), beginGdOrdToken70T, GD_ORD_TOKEN_70_T_LEN);
    localGdOrdToken70TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken70TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken70T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken70T() {
    return (substring(
        getStringValue(), beginGdOrdToken70T, beginGdOrdToken70T + GD_ORD_TOKEN_70_T_LEN));
  }
}
