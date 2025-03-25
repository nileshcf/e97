package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class MxiEndDateSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MxiEndDateSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(MxiEndDateSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int MXI_END_DATE_LENGTH = 8;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginMxiEndDateCc;
  protected int beginMxiEndDateYy;
  protected int beginMxiEndDateMm;
  protected int beginMxiEndDateDd;

  /** Constructor for MxiEndDateSerialized */
  public MxiEndDateSerialized() {
    init(0);
  }

  /** initializes the field in MxiEndDateSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(MXI_END_DATE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginMxiEndDateCc = getStartOffset() + 0; // set offset for serialization

    beginMxiEndDateYy = getStartOffset() + 2; // set offset for serialization

    beginMxiEndDateMm = getStartOffset() + 4; // set offset for serialization

    beginMxiEndDateDd = getStartOffset() + 6; // set offset for serialization

    /*  end of offset */
  }

  int localMxiEndDateCcCounter = -1;

  public boolean isMxiEndDateCcModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEndDateCcCounter != sharedCounter;
    localMxiEndDateCcCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEndDateCc
   *
   * @return mxiEndDateCc
   */
  public char[] getMxiEndDateCcString() {
    return getCharArray(beginMxiEndDateCc, MXI_END_DATE_CC_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEndDateCcIsNumeric() {
    return isNumeric(
        beginMxiEndDateCc,
        beginMxiEndDateCc + MXI_END_DATE_CC_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_END_DATE_CC_LEN = 2;
  /** serializeMxiEndDateCc */
  protected void serializeMxiEndDateCc(int mxiEndDateCc) {
    putNumber(
        beginMxiEndDateCc,
        mxiEndDateCc,
        MXI_END_DATE_CC_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEndDateCcCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEndDateCc */
  protected int serializeMxiEndDateCc(char[] value) {
    int mxiEndDateCc;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEndDateCc =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEndDateCc, 2);
    localMxiEndDateCcCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEndDateCc;
  }

  protected int checkMxiEndDateCcMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEndDateCc is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEndDateCc() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEndDateCc,
          MXI_END_DATE_CC_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEndDateCc", beginMxiEndDateCc, MXI_END_DATE_CC_LEN);
    }
  }

  int localMxiEndDateYyCounter = -1;

  public boolean isMxiEndDateYyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEndDateYyCounter != sharedCounter;
    localMxiEndDateYyCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEndDateYy
   *
   * @return mxiEndDateYy
   */
  public char[] getMxiEndDateYyString() {
    return getCharArray(beginMxiEndDateYy, MXI_END_DATE_YY_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEndDateYyIsNumeric() {
    return isNumeric(
        beginMxiEndDateYy,
        beginMxiEndDateYy + MXI_END_DATE_YY_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_END_DATE_YY_LEN = 2;
  /** serializeMxiEndDateYy */
  protected void serializeMxiEndDateYy(int mxiEndDateYy) {
    putNumber(
        beginMxiEndDateYy,
        mxiEndDateYy,
        MXI_END_DATE_YY_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEndDateYyCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEndDateYy */
  protected int serializeMxiEndDateYy(char[] value) {
    int mxiEndDateYy;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEndDateYy =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEndDateYy, 2);
    localMxiEndDateYyCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEndDateYy;
  }

  protected int checkMxiEndDateYyMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEndDateYy is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEndDateYy() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEndDateYy,
          MXI_END_DATE_YY_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEndDateYy", beginMxiEndDateYy, MXI_END_DATE_YY_LEN);
    }
  }

  int localMxiEndDateMmCounter = -1;

  public boolean isMxiEndDateMmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEndDateMmCounter != sharedCounter;
    localMxiEndDateMmCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEndDateMm
   *
   * @return mxiEndDateMm
   */
  public char[] getMxiEndDateMmString() {
    return getCharArray(beginMxiEndDateMm, MXI_END_DATE_MM_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEndDateMmIsNumeric() {
    return isNumeric(
        beginMxiEndDateMm,
        beginMxiEndDateMm + MXI_END_DATE_MM_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_END_DATE_MM_LEN = 2;
  /** serializeMxiEndDateMm */
  protected void serializeMxiEndDateMm(int mxiEndDateMm) {
    putNumber(
        beginMxiEndDateMm,
        mxiEndDateMm,
        MXI_END_DATE_MM_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEndDateMmCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEndDateMm */
  protected int serializeMxiEndDateMm(char[] value) {
    int mxiEndDateMm;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEndDateMm =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEndDateMm, 2);
    localMxiEndDateMmCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEndDateMm;
  }

  protected int checkMxiEndDateMmMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEndDateMm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEndDateMm() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEndDateMm,
          MXI_END_DATE_MM_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEndDateMm", beginMxiEndDateMm, MXI_END_DATE_MM_LEN);
    }
  }

  int localMxiEndDateDdCounter = -1;

  public boolean isMxiEndDateDdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEndDateDdCounter != sharedCounter;
    localMxiEndDateDdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEndDateDd
   *
   * @return mxiEndDateDd
   */
  public char[] getMxiEndDateDdString() {
    return getCharArray(beginMxiEndDateDd, MXI_END_DATE_DD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEndDateDdIsNumeric() {
    return isNumeric(
        beginMxiEndDateDd,
        beginMxiEndDateDd + MXI_END_DATE_DD_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_END_DATE_DD_LEN = 2;
  /** serializeMxiEndDateDd */
  protected void serializeMxiEndDateDd(int mxiEndDateDd) {
    putNumber(
        beginMxiEndDateDd,
        mxiEndDateDd,
        MXI_END_DATE_DD_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEndDateDdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEndDateDd */
  protected int serializeMxiEndDateDd(char[] value) {
    int mxiEndDateDd;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEndDateDd =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEndDateDd, 2);
    localMxiEndDateDdCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEndDateDd;
  }

  protected int checkMxiEndDateDdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEndDateDd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEndDateDd() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEndDateDd,
          MXI_END_DATE_DD_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEndDateDd", beginMxiEndDateDd, MXI_END_DATE_DD_LEN);
    }
  }
}
