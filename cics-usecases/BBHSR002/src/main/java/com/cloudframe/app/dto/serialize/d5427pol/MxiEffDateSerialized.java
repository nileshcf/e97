package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class MxiEffDateSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MxiEffDateSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(MxiEffDateSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int MXI_EFF_DATE_LENGTH = 8;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginMxiEffDateCc;
  protected int beginMxiEffDateYy;
  protected int beginMxiEffDateMm;
  protected int beginMxiEffDateDd;

  /** Constructor for MxiEffDateSerialized */
  public MxiEffDateSerialized() {
    init(0);
  }

  /** initializes the field in MxiEffDateSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(MXI_EFF_DATE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginMxiEffDateCc = getStartOffset() + 0; // set offset for serialization

    beginMxiEffDateYy = getStartOffset() + 2; // set offset for serialization

    beginMxiEffDateMm = getStartOffset() + 4; // set offset for serialization

    beginMxiEffDateDd = getStartOffset() + 6; // set offset for serialization

    /*  end of offset */
  }

  int localMxiEffDateCcCounter = -1;

  public boolean isMxiEffDateCcModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEffDateCcCounter != sharedCounter;
    localMxiEffDateCcCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEffDateCc
   *
   * @return mxiEffDateCc
   */
  public char[] getMxiEffDateCcString() {
    return getCharArray(beginMxiEffDateCc, MXI_EFF_DATE_CC_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEffDateCcIsNumeric() {
    return isNumeric(
        beginMxiEffDateCc,
        beginMxiEffDateCc + MXI_EFF_DATE_CC_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_EFF_DATE_CC_LEN = 2;
  /** serializeMxiEffDateCc */
  protected void serializeMxiEffDateCc(int mxiEffDateCc) {
    putNumber(
        beginMxiEffDateCc,
        mxiEffDateCc,
        MXI_EFF_DATE_CC_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEffDateCcCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEffDateCc */
  protected int serializeMxiEffDateCc(char[] value) {
    int mxiEffDateCc;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEffDateCc =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEffDateCc, 2);
    localMxiEffDateCcCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEffDateCc;
  }

  protected int checkMxiEffDateCcMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEffDateCc is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEffDateCc() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEffDateCc,
          MXI_EFF_DATE_CC_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEffDateCc", beginMxiEffDateCc, MXI_EFF_DATE_CC_LEN);
    }
  }

  int localMxiEffDateYyCounter = -1;

  public boolean isMxiEffDateYyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEffDateYyCounter != sharedCounter;
    localMxiEffDateYyCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEffDateYy
   *
   * @return mxiEffDateYy
   */
  public char[] getMxiEffDateYyString() {
    return getCharArray(beginMxiEffDateYy, MXI_EFF_DATE_YY_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEffDateYyIsNumeric() {
    return isNumeric(
        beginMxiEffDateYy,
        beginMxiEffDateYy + MXI_EFF_DATE_YY_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_EFF_DATE_YY_LEN = 2;
  /** serializeMxiEffDateYy */
  protected void serializeMxiEffDateYy(int mxiEffDateYy) {
    putNumber(
        beginMxiEffDateYy,
        mxiEffDateYy,
        MXI_EFF_DATE_YY_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEffDateYyCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEffDateYy */
  protected int serializeMxiEffDateYy(char[] value) {
    int mxiEffDateYy;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEffDateYy =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEffDateYy, 2);
    localMxiEffDateYyCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEffDateYy;
  }

  protected int checkMxiEffDateYyMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEffDateYy is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEffDateYy() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEffDateYy,
          MXI_EFF_DATE_YY_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEffDateYy", beginMxiEffDateYy, MXI_EFF_DATE_YY_LEN);
    }
  }

  int localMxiEffDateMmCounter = -1;

  public boolean isMxiEffDateMmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEffDateMmCounter != sharedCounter;
    localMxiEffDateMmCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEffDateMm
   *
   * @return mxiEffDateMm
   */
  public char[] getMxiEffDateMmString() {
    return getCharArray(beginMxiEffDateMm, MXI_EFF_DATE_MM_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEffDateMmIsNumeric() {
    return isNumeric(
        beginMxiEffDateMm,
        beginMxiEffDateMm + MXI_EFF_DATE_MM_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_EFF_DATE_MM_LEN = 2;
  /** serializeMxiEffDateMm */
  protected void serializeMxiEffDateMm(int mxiEffDateMm) {
    putNumber(
        beginMxiEffDateMm,
        mxiEffDateMm,
        MXI_EFF_DATE_MM_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEffDateMmCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEffDateMm */
  protected int serializeMxiEffDateMm(char[] value) {
    int mxiEffDateMm;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEffDateMm =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEffDateMm, 2);
    localMxiEffDateMmCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEffDateMm;
  }

  protected int checkMxiEffDateMmMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEffDateMm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEffDateMm() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEffDateMm,
          MXI_EFF_DATE_MM_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEffDateMm", beginMxiEffDateMm, MXI_EFF_DATE_MM_LEN);
    }
  }

  int localMxiEffDateDdCounter = -1;

  public boolean isMxiEffDateDdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiEffDateDdCounter != sharedCounter;
    localMxiEffDateDdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of mxiEffDateDd
   *
   * @return mxiEffDateDd
   */
  public char[] getMxiEffDateDdString() {
    return getCharArray(beginMxiEffDateDd, MXI_EFF_DATE_DD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean mxiEffDateDdIsNumeric() {
    return isNumeric(
        beginMxiEffDateDd,
        beginMxiEffDateDd + MXI_EFF_DATE_DD_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int MXI_EFF_DATE_DD_LEN = 2;
  /** serializeMxiEffDateDd */
  protected void serializeMxiEffDateDd(int mxiEffDateDd) {
    putNumber(
        beginMxiEffDateDd,
        mxiEffDateDd,
        MXI_EFF_DATE_DD_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localMxiEffDateDdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeMxiEffDateDd */
  protected int serializeMxiEffDateDd(char[] value) {
    int mxiEffDateDd;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    mxiEffDateDd =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginMxiEffDateDd, 2);
    localMxiEffDateDdCounter = shareString.getSerializedField().getModifiedCounter();
    return mxiEffDateDd;
  }

  protected int checkMxiEffDateDdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshMxiEffDateDd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshMxiEffDateDd() throws CFException {
    try {
      return (getIntNumber(
          beginMxiEffDateDd,
          MXI_EFF_DATE_DD_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("mxiEffDateDd", beginMxiEffDateDd, MXI_EFF_DATE_DD_LEN);
    }
  }
}
