package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken98Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken98Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken98Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_98_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken98L;
  protected int beginGdOrdToken98T;

  /** Constructor for GdOrdToken98Serialized */
  public GdOrdToken98Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken98Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken98Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken98Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 54189); // serialize this field at offset 54189 by default
  }

  /**
   * sets parent for this GdOrdToken98Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 54189 by default
  }
  /** initializes the field in GdOrdToken98Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_98_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken98L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken98T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken98LCounter = -1;

  public boolean isGdOrdToken98LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken98LCounter != sharedCounter;
    localGdOrdToken98LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_98_L_LEN = 2;
  /** serializeGdOrdToken98L */
  protected void serializeGdOrdToken98L(short gdOrdToken98L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken98L, GD_ORD_TOKEN_98_L_LEN),
        beginGdOrdToken98L,
        GD_ORD_TOKEN_98_L_LEN);
    localGdOrdToken98LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken98LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken98L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken98L() {
    return (getShort(beginGdOrdToken98L));
  }

  int localGdOrdToken98TCounter = -1;

  public boolean isGdOrdToken98TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken98TCounter != sharedCounter;
    localGdOrdToken98TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_98_T_LEN = 515;
  /** serialize this GdOrdToken98T */
  protected void serializeGdOrdToken98T(char[] gdOrdToken98T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken98T, 0, getStringValue(), beginGdOrdToken98T, GD_ORD_TOKEN_98_T_LEN);
    localGdOrdToken98TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken98TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken98T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken98T() {
    return (substring(
        getStringValue(), beginGdOrdToken98T, beginGdOrdToken98T + GD_ORD_TOKEN_98_T_LEN));
  }
}
