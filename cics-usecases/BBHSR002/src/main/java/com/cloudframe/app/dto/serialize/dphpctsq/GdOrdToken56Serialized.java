package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken56Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken56Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken56Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_56_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken56L;
  protected int beginGdOrdToken56T;

  /** Constructor for GdOrdToken56Serialized */
  public GdOrdToken56Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken56Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken56Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken56Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 32475); // serialize this field at offset 32475 by default
  }

  /**
   * sets parent for this GdOrdToken56Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 32475 by default
  }
  /** initializes the field in GdOrdToken56Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_56_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken56L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken56T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken56LCounter = -1;

  public boolean isGdOrdToken56LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken56LCounter != sharedCounter;
    localGdOrdToken56LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_56_L_LEN = 2;
  /** serializeGdOrdToken56L */
  protected void serializeGdOrdToken56L(short gdOrdToken56L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken56L, GD_ORD_TOKEN_56_L_LEN),
        beginGdOrdToken56L,
        GD_ORD_TOKEN_56_L_LEN);
    localGdOrdToken56LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken56LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken56L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken56L() {
    return (getShort(beginGdOrdToken56L));
  }

  int localGdOrdToken56TCounter = -1;

  public boolean isGdOrdToken56TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken56TCounter != sharedCounter;
    localGdOrdToken56TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_56_T_LEN = 515;
  /** serialize this GdOrdToken56T */
  protected void serializeGdOrdToken56T(char[] gdOrdToken56T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken56T, 0, getStringValue(), beginGdOrdToken56T, GD_ORD_TOKEN_56_T_LEN);
    localGdOrdToken56TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken56TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken56T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken56T() {
    return (substring(
        getStringValue(), beginGdOrdToken56T, beginGdOrdToken56T + GD_ORD_TOKEN_56_T_LEN));
  }
}
