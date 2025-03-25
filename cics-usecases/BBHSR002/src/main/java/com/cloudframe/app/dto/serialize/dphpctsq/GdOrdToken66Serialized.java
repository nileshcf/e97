package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken66Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken66Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken66Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_66_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken66L;
  protected int beginGdOrdToken66T;

  /** Constructor for GdOrdToken66Serialized */
  public GdOrdToken66Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken66Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken66Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken66Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 37645); // serialize this field at offset 37645 by default
  }

  /**
   * sets parent for this GdOrdToken66Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 37645 by default
  }
  /** initializes the field in GdOrdToken66Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_66_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken66L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken66T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken66LCounter = -1;

  public boolean isGdOrdToken66LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken66LCounter != sharedCounter;
    localGdOrdToken66LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_66_L_LEN = 2;
  /** serializeGdOrdToken66L */
  protected void serializeGdOrdToken66L(short gdOrdToken66L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken66L, GD_ORD_TOKEN_66_L_LEN),
        beginGdOrdToken66L,
        GD_ORD_TOKEN_66_L_LEN);
    localGdOrdToken66LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken66LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken66L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken66L() {
    return (getShort(beginGdOrdToken66L));
  }

  int localGdOrdToken66TCounter = -1;

  public boolean isGdOrdToken66TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken66TCounter != sharedCounter;
    localGdOrdToken66TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_66_T_LEN = 515;
  /** serialize this GdOrdToken66T */
  protected void serializeGdOrdToken66T(char[] gdOrdToken66T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken66T, 0, getStringValue(), beginGdOrdToken66T, GD_ORD_TOKEN_66_T_LEN);
    localGdOrdToken66TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken66TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken66T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken66T() {
    return (substring(
        getStringValue(), beginGdOrdToken66T, beginGdOrdToken66T + GD_ORD_TOKEN_66_T_LEN));
  }
}
