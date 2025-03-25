package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdSqlcaMsgSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdSqlcaMsgSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdSqlcaMsgSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_SQLCA_MSG_LENGTH = 2402;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdSqlcaMsgLen;
  protected int beginGdSqlcaMsgText;

  /** Constructor for GdSqlcaMsgSerialized */
  public GdSqlcaMsgSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdSqlcaMsgSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdSqlcaMsgSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdSqlcaMsgSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 179); // serialize this field at offset 179 by default
  }

  /**
   * sets parent for this GdSqlcaMsgSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 179 by default
  }
  /** initializes the field in GdSqlcaMsgSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_SQLCA_MSG_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdSqlcaMsgLen = getStartOffset() + 0; // set offset for serialization

    beginGdSqlcaMsgText = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdSqlcaMsgLenCounter = -1;

  public boolean isGdSqlcaMsgLenModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlcaMsgLenCounter != sharedCounter;
    localGdSqlcaMsgLenCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLCA_MSG_LEN_LEN = 2;
  /** serializeGdSqlcaMsgLen */
  protected void serializeGdSqlcaMsgLen(short gdSqlcaMsgLen) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlcaMsgLen, GD_SQLCA_MSG_LEN_LEN),
        beginGdSqlcaMsgLen,
        GD_SQLCA_MSG_LEN_LEN);
    localGdSqlcaMsgLenCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdSqlcaMsgLenMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdSqlcaMsgLen is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdSqlcaMsgLen() {
    return (getShort(beginGdSqlcaMsgLen));
  }

  int localGdSqlcaMsgTextCounter = -1;

  public boolean isGdSqlcaMsgTextModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlcaMsgTextCounter != sharedCounter;
    localGdSqlcaMsgTextCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLCA_MSG_TEXT_LEN = 2400;
  /** serialize this GdSqlcaMsgText */
  protected void serializeGdSqlcaMsgText(char[] gdSqlcaMsgText) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdSqlcaMsgText, 0, getStringValue(), beginGdSqlcaMsgText, GD_SQLCA_MSG_TEXT_LEN);
    localGdSqlcaMsgTextCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdSqlcaMsgTextConstraints(char[] value) {
    return super.checkConstraints(value, 2400, false, false);
  }
  /**
   * refreshGdSqlcaMsgText is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdSqlcaMsgText() {
    return (substring(
        getStringValue(), beginGdSqlcaMsgText, beginGdSqlcaMsgText + GD_SQLCA_MSG_TEXT_LEN));
  }
}
