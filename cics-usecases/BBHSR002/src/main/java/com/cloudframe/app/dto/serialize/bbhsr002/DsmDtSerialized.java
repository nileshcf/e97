package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class DsmDtSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DsmDtSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DsmDtSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DSM_DT_LENGTH = 10;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDsmDtCc;
  protected int beginDsmDtYy;
  protected int beginDsmDtMm;
  protected int beginDsmDtDd;

  /** Constructor for DsmDtSerialized */
  public DsmDtSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for DsmDtSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public DsmDtSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this DsmDtSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 8); // serialize this field at offset 8 by default
  }

  /**
   * sets parent for this DsmDtSerialized to the parent and set the serialize offset to parameter
   * begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 8 by default
  }
  /** initializes the field in DsmDtSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DSM_DT_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDsmDtCc = getStartOffset() + 0; // set offset for serialization

    beginDsmDtYy = getStartOffset() + 2; // set offset for serialization

    beginDsmDtMm = getStartOffset() + 5; // set offset for serialization

    beginDsmDtDd = getStartOffset() + 8; // set offset for serialization

    /*  end of offset */
  }

  int localDsmDtCcCounter = -1;

  public boolean isDsmDtCcModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsmDtCcCounter != sharedCounter;
    localDsmDtCcCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of dsmDtCc
   *
   * @return dsmDtCc
   */
  public char[] getDsmDtCcString() {
    return getCharArray(beginDsmDtCc, DSM_DT_CC_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean dsmDtCcIsNumeric() {
    return isNumeric(
        beginDsmDtCc,
        beginDsmDtCc + DSM_DT_CC_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int DSM_DT_CC_LEN = 2;
  /** serializeDsmDtCc */
  protected void serializeDsmDtCc(int dsmDtCc) {
    putNumber(
        beginDsmDtCc,
        dsmDtCc,
        DSM_DT_CC_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localDsmDtCcCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeDsmDtCc */
  protected int serializeDsmDtCc(char[] value) {
    int dsmDtCc;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    dsmDtCc =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginDsmDtCc, 2);
    localDsmDtCcCounter = shareString.getSerializedField().getModifiedCounter();
    return dsmDtCc;
  }

  protected int checkDsmDtCcMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshDsmDtCc is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshDsmDtCc() throws CFException {
    try {
      return (getIntNumber(
          beginDsmDtCc,
          DSM_DT_CC_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("dsmDtCc", beginDsmDtCc, DSM_DT_CC_LEN);
    }
  }

  int localDsmDtYyCounter = -1;

  public boolean isDsmDtYyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsmDtYyCounter != sharedCounter;
    localDsmDtYyCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of dsmDtYy
   *
   * @return dsmDtYy
   */
  public char[] getDsmDtYyString() {
    return getCharArray(beginDsmDtYy, DSM_DT_YY_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean dsmDtYyIsNumeric() {
    return isNumeric(
        beginDsmDtYy,
        beginDsmDtYy + DSM_DT_YY_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int DSM_DT_YY_LEN = 2;
  /** serializeDsmDtYy */
  protected void serializeDsmDtYy(int dsmDtYy) {
    putNumber(
        beginDsmDtYy,
        dsmDtYy,
        DSM_DT_YY_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localDsmDtYyCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeDsmDtYy */
  protected int serializeDsmDtYy(char[] value) {
    int dsmDtYy;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    dsmDtYy =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginDsmDtYy, 2);
    localDsmDtYyCounter = shareString.getSerializedField().getModifiedCounter();
    return dsmDtYy;
  }

  protected int checkDsmDtYyMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshDsmDtYy is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshDsmDtYy() throws CFException {
    try {
      return (getIntNumber(
          beginDsmDtYy,
          DSM_DT_YY_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("dsmDtYy", beginDsmDtYy, DSM_DT_YY_LEN);
    }
  }

  int localDsmDtMmCounter = -1;

  public boolean isDsmDtMmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsmDtMmCounter != sharedCounter;
    localDsmDtMmCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of dsmDtMm
   *
   * @return dsmDtMm
   */
  public char[] getDsmDtMmString() {
    return getCharArray(beginDsmDtMm, DSM_DT_MM_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean dsmDtMmIsNumeric() {
    return isNumeric(
        beginDsmDtMm,
        beginDsmDtMm + DSM_DT_MM_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int DSM_DT_MM_LEN = 2;
  /** serializeDsmDtMm */
  protected void serializeDsmDtMm(int dsmDtMm) {
    putNumber(
        beginDsmDtMm,
        dsmDtMm,
        DSM_DT_MM_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localDsmDtMmCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeDsmDtMm */
  protected int serializeDsmDtMm(char[] value) {
    int dsmDtMm;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    dsmDtMm =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginDsmDtMm, 2);
    localDsmDtMmCounter = shareString.getSerializedField().getModifiedCounter();
    return dsmDtMm;
  }

  protected int checkDsmDtMmMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshDsmDtMm is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshDsmDtMm() throws CFException {
    try {
      return (getIntNumber(
          beginDsmDtMm,
          DSM_DT_MM_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("dsmDtMm", beginDsmDtMm, DSM_DT_MM_LEN);
    }
  }

  int localDsmDtDdCounter = -1;

  public boolean isDsmDtDdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsmDtDdCounter != sharedCounter;
    localDsmDtDdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of dsmDtDd
   *
   * @return dsmDtDd
   */
  public char[] getDsmDtDdString() {
    return getCharArray(beginDsmDtDd, DSM_DT_DD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean dsmDtDdIsNumeric() {
    return isNumeric(
        beginDsmDtDd,
        beginDsmDtDd + DSM_DT_DD_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int DSM_DT_DD_LEN = 2;
  /** serializeDsmDtDd */
  protected void serializeDsmDtDd(int dsmDtDd) {
    putNumber(
        beginDsmDtDd,
        dsmDtDd,
        DSM_DT_DD_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localDsmDtDdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeDsmDtDd */
  protected int serializeDsmDtDd(char[] value) {
    int dsmDtDd;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    dsmDtDd =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginDsmDtDd, 2);
    localDsmDtDdCounter = shareString.getSerializedField().getModifiedCounter();
    return dsmDtDd;
  }

  protected int checkDsmDtDdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshDsmDtDd is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshDsmDtDd() throws CFException {
    try {
      return (getIntNumber(
          beginDsmDtDd,
          DSM_DT_DD_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("dsmDtDd", beginDsmDtDd, DSM_DT_DD_LEN);
    }
  }
}
