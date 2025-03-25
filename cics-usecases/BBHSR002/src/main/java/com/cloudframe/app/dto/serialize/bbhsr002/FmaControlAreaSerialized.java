package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class FmaControlAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FmaControlAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(FmaControlAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int FMA_CONTROL_AREA_LENGTH = 9;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginFmaSubscript;
  protected int beginFmaEntryTableOccurs;
  protected int beginFmaDoneSw;

  /** Constructor for FmaControlAreaSerialized */
  public FmaControlAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaControlAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaControlAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this FmaControlAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this FmaControlAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in FmaControlAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(FMA_CONTROL_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginFmaSubscript = getStartOffset() + 0; // set offset for serialization

    beginFmaEntryTableOccurs = getStartOffset() + 4; // set offset for serialization

    beginFmaDoneSw = getStartOffset() + 8; // set offset for serialization

    /*  end of offset */
  }

  int localFmaSubscriptCounter = -1;

  public boolean isFmaSubscriptModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaSubscriptCounter != sharedCounter;
    localFmaSubscriptCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaSubscript
   *
   * @return fmaSubscript
   */
  public char[] getFmaSubscriptString() {
    return getCharArray(beginFmaSubscript, FMA_SUBSCRIPT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaSubscriptIsNumeric() {
    return isNumeric(
        beginFmaSubscript,
        beginFmaSubscript + FMA_SUBSCRIPT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_SUBSCRIPT_LEN = 4;
  /** serializeFmaSubscript */
  protected void serializeFmaSubscript(short fmaSubscript) {
    putNumber(
        beginFmaSubscript,
        fmaSubscript,
        FMA_SUBSCRIPT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaSubscriptCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaSubscript */
  protected short serializeFmaSubscript(char[] value) {
    short fmaSubscript;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaSubscript =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, true /*isSigned?*/), beginFmaSubscript, 4);
    localFmaSubscriptCounter = shareString.getSerializedField().getModifiedCounter();
    return fmaSubscript;
  }

  protected short checkFmaSubscriptMaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_10K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaSubscript is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshFmaSubscript() throws CFException {
    try {
      return (getShortNumber(
          beginFmaSubscript,
          FMA_SUBSCRIPT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaSubscript", beginFmaSubscript, FMA_SUBSCRIPT_LEN);
    }
  }

  int localFmaEntryTableOccursCounter = -1;

  public boolean isFmaEntryTableOccursModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaEntryTableOccursCounter != sharedCounter;
    localFmaEntryTableOccursCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaEntryTableOccurs
   *
   * @return fmaEntryTableOccurs
   */
  public char[] getFmaEntryTableOccursString() {
    return getCharArray(beginFmaEntryTableOccurs, FMA_ENTRY_TABLE_OCCURS_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaEntryTableOccursIsNumeric() {
    return isNumeric(
        beginFmaEntryTableOccurs,
        beginFmaEntryTableOccurs + FMA_ENTRY_TABLE_OCCURS_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_ENTRY_TABLE_OCCURS_LEN = 4;
  /** serializeFmaEntryTableOccurs */
  protected void serializeFmaEntryTableOccurs(short fmaEntryTableOccurs) {
    putNumber(
        beginFmaEntryTableOccurs,
        fmaEntryTableOccurs,
        FMA_ENTRY_TABLE_OCCURS_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaEntryTableOccursCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaEntryTableOccurs */
  protected short serializeFmaEntryTableOccurs(char[] value) {
    short fmaEntryTableOccurs;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaEntryTableOccurs =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, true /*isSigned?*/), beginFmaEntryTableOccurs, 4);
    localFmaEntryTableOccursCounter = shareString.getSerializedField().getModifiedCounter();
    return fmaEntryTableOccurs;
  }

  protected short checkFmaEntryTableOccursMaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_10K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaEntryTableOccurs is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshFmaEntryTableOccurs() throws CFException {
    try {
      return (getShortNumber(
          beginFmaEntryTableOccurs,
          FMA_ENTRY_TABLE_OCCURS_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "fmaEntryTableOccurs", beginFmaEntryTableOccurs, FMA_ENTRY_TABLE_OCCURS_LEN);
    }
  }

  int localFmaDoneSwCounter = -1;

  public boolean isFmaDoneSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaDoneSwCounter != sharedCounter;
    localFmaDoneSwCounter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_DONE_SW_LEN = 1;
  /** serialize this FmaDoneSw */
  protected void serializeFmaDoneSw(char[] fmaDoneSw) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaDoneSw, 0, getStringValue(), beginFmaDoneSw, FMA_DONE_SW_LEN);
    localFmaDoneSwCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaDoneSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshFmaDoneSw is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshFmaDoneSw() {
    return (substring(getStringValue(), beginFmaDoneSw, beginFmaDoneSw + FMA_DONE_SW_LEN));
  }
}
