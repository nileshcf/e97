package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdMessageTextSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdMessageTextSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdMessageTextSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_MESSAGE_TEXT_LENGTH = 32674;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdMessageTextL;
  protected int beginGdMessageTextT;

  /** Constructor for GdMessageTextSerialized */
  public GdMessageTextSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdMessageTextSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdMessageTextSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdMessageTextSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 55793); // serialize this field at offset 55793 by default
  }

  /**
   * sets parent for this GdMessageTextSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 55793 by default
  }
  /** initializes the field in GdMessageTextSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_MESSAGE_TEXT_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdMessageTextL = getStartOffset() + 0; // set offset for serialization

    beginGdMessageTextT = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdMessageTextLCounter = -1;

  public boolean isGdMessageTextLModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdMessageTextLCounter != sharedCounter;
    localGdMessageTextLCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_MESSAGE_TEXT_L_LEN = 2;
  /** serializeGdMessageTextL */
  protected void serializeGdMessageTextL(short gdMessageTextL) {
    replaceValue( //  save the value as string
        getBinaryString(gdMessageTextL, GD_MESSAGE_TEXT_L_LEN),
        beginGdMessageTextL,
        GD_MESSAGE_TEXT_L_LEN);
    localGdMessageTextLCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdMessageTextLMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdMessageTextL is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdMessageTextL() {
    return (getShort(beginGdMessageTextL));
  }

  int localGdMessageTextTCounter = -1;

  public boolean isGdMessageTextTModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdMessageTextTCounter != sharedCounter;
    localGdMessageTextTCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_MESSAGE_TEXT_T_LEN = 32672;
  /** serialize this GdMessageTextT */
  protected void serializeGdMessageTextT(char[] gdMessageTextT) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdMessageTextT, 0, getStringValue(), beginGdMessageTextT, GD_MESSAGE_TEXT_T_LEN);
    localGdMessageTextTCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdMessageTextTConstraints(char[] value) {
    return super.checkConstraints(value, 32672, false, false);
  }
  /**
   * refreshGdMessageTextT is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdMessageTextT() {
    return (substring(
        getStringValue(), beginGdMessageTextT, beginGdMessageTextT + GD_MESSAGE_TEXT_T_LEN));
  }
}
