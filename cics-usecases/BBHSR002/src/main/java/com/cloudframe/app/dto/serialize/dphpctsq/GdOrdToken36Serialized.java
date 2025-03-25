package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken36Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken36Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken36Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_36_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken36L;
  protected int beginGdOrdToken36T;

  /** Constructor for GdOrdToken36Serialized */
  public GdOrdToken36Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken36Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken36Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken36Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 22135); // serialize this field at offset 22135 by default
  }

  /**
   * sets parent for this GdOrdToken36Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 22135 by default
  }
  /** initializes the field in GdOrdToken36Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_36_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken36L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken36T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken36LCounter = -1;

  public boolean isGdOrdToken36LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken36LCounter != sharedCounter;
    localGdOrdToken36LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_36_L_LEN = 2;
  /** serializeGdOrdToken36L */
  protected void serializeGdOrdToken36L(short gdOrdToken36L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken36L, GD_ORD_TOKEN_36_L_LEN),
        beginGdOrdToken36L,
        GD_ORD_TOKEN_36_L_LEN);
    localGdOrdToken36LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken36LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken36L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken36L() {
    return (getShort(beginGdOrdToken36L));
  }

  int localGdOrdToken36TCounter = -1;

  public boolean isGdOrdToken36TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken36TCounter != sharedCounter;
    localGdOrdToken36TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_36_T_LEN = 515;
  /** serialize this GdOrdToken36T */
  protected void serializeGdOrdToken36T(char[] gdOrdToken36T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken36T, 0, getStringValue(), beginGdOrdToken36T, GD_ORD_TOKEN_36_T_LEN);
    localGdOrdToken36TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken36TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken36T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken36T() {
    return (substring(
        getStringValue(), beginGdOrdToken36T, beginGdOrdToken36T + GD_ORD_TOKEN_36_T_LEN));
  }
}
