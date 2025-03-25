package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class WorkSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int WORK_LENGTH = 137;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheRefreshIntervalHh;
  protected int beginCacheRefreshIntervalMm;
  protected int beginCacheRefreshIntervalSs;
  protected int beginDisplay1;
  protected int beginDisplay2;
  protected int beginDisplay3;
  protected int beginDisplay4;
  protected int beginIntegerDisplay;
  protected int beginCacheKeyThreshold;
  protected int beginCacheDataThreshold;
  protected int beginPercentCalc;
  protected int beginCacheKeyThresholdPercent;
  protected int beginCacheDataThresholdPercent;
  protected int beginThresholdPercent;
  protected int beginThresholdPercentDis;
  protected int beginRunningKeyLen;
  protected int beginRunningDataLen;
  protected int beginRunningKeyCnt;
  protected int beginRunningDataCnt;
  protected int beginLenOf1KeyOccurrence;
  protected int beginLenOf1DataOccurrence;

  /** Constructor for WorkSerialized */
  public WorkSerialized() {
    init(0);
  }

  /** initializes the field in WorkSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(WORK_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCacheRefreshIntervalHh = getStartOffset() + 0; // set offset for serialization

    beginCacheRefreshIntervalMm = getStartOffset() + 2; // set offset for serialization

    beginCacheRefreshIntervalSs = getStartOffset() + 4; // set offset for serialization

    beginDisplay1 = getStartOffset() + 6; // set offset for serialization

    beginDisplay2 = getStartOffset() + 16; // set offset for serialization

    beginDisplay3 = getStartOffset() + 26; // set offset for serialization

    beginDisplay4 = getStartOffset() + 36; // set offset for serialization

    beginIntegerDisplay = getStartOffset() + 46; // set offset for serialization

    beginCacheKeyThreshold = getStartOffset() + 57; // set offset for serialization

    beginCacheDataThreshold = getStartOffset() + 62; // set offset for serialization

    beginPercentCalc = getStartOffset() + 67; // set offset for serialization

    beginCacheKeyThresholdPercent = getStartOffset() + 71; // set offset for serialization

    beginCacheDataThresholdPercent = getStartOffset() + 74; // set offset for serialization

    beginThresholdPercent = getStartOffset() + 77; // set offset for serialization

    beginThresholdPercentDis = getStartOffset() + 80; // set offset for serialization

    beginRunningKeyLen = getStartOffset() + 83; // set offset for serialization

    beginRunningDataLen = getStartOffset() + 92; // set offset for serialization

    beginRunningKeyCnt = getStartOffset() + 101; // set offset for serialization

    beginRunningDataCnt = getStartOffset() + 110; // set offset for serialization

    beginLenOf1KeyOccurrence = getStartOffset() + 119; // set offset for serialization

    beginLenOf1DataOccurrence = getStartOffset() + 128; // set offset for serialization

    /*  end of offset */
  }

  int localThisProgramCounter = -1;

  public boolean isThisProgramModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localThisProgramCounter != sharedCounter;
    localThisProgramCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkThisProgramConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localMessageCounter = -1;

  public boolean isMessageModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMessageCounter != sharedCounter;
    localMessageCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkMessageConstraints(char[] value) {
    return super.checkConstraints(value, 80, false, false);
  }

  int localCacheRefreshIntervalHhCounter = -1;

  public boolean isCacheRefreshIntervalHhModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheRefreshIntervalHhCounter != sharedCounter;
    localCacheRefreshIntervalHhCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of cacheRefreshIntervalHh
   *
   * @return cacheRefreshIntervalHh
   */
  public char[] getCacheRefreshIntervalHhString() {
    return getCharArray(beginCacheRefreshIntervalHh, CACHE_REFRESH_INTERVAL_HH_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean cacheRefreshIntervalHhIsNumeric() {
    return isNumeric(
        beginCacheRefreshIntervalHh,
        beginCacheRefreshIntervalHh + CACHE_REFRESH_INTERVAL_HH_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int CACHE_REFRESH_INTERVAL_HH_LEN = 2;
  /** serializeCacheRefreshIntervalHh */
  protected void serializeCacheRefreshIntervalHh(int cacheRefreshIntervalHh) {
    putNumber(
        beginCacheRefreshIntervalHh,
        cacheRefreshIntervalHh,
        CACHE_REFRESH_INTERVAL_HH_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localCacheRefreshIntervalHhCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeCacheRefreshIntervalHh */
  protected int serializeCacheRefreshIntervalHh(char[] value) {
    int cacheRefreshIntervalHh;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    cacheRefreshIntervalHh =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginCacheRefreshIntervalHh, 2);
    localCacheRefreshIntervalHhCounter = shareString.getSerializedField().getModifiedCounter();
    return cacheRefreshIntervalHh;
  }

  protected int checkCacheRefreshIntervalHhMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshCacheRefreshIntervalHh is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshCacheRefreshIntervalHh() throws CFException {
    try {
      return (getIntNumber(
          beginCacheRefreshIntervalHh,
          CACHE_REFRESH_INTERVAL_HH_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "cacheRefreshIntervalHh", beginCacheRefreshIntervalHh, CACHE_REFRESH_INTERVAL_HH_LEN);
    }
  }

  int localCacheRefreshIntervalMmCounter = -1;

  public boolean isCacheRefreshIntervalMmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheRefreshIntervalMmCounter != sharedCounter;
    localCacheRefreshIntervalMmCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of cacheRefreshIntervalMm
   *
   * @return cacheRefreshIntervalMm
   */
  public char[] getCacheRefreshIntervalMmString() {
    return getCharArray(beginCacheRefreshIntervalMm, CACHE_REFRESH_INTERVAL_MM_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean cacheRefreshIntervalMmIsNumeric() {
    return isNumeric(
        beginCacheRefreshIntervalMm,
        beginCacheRefreshIntervalMm + CACHE_REFRESH_INTERVAL_MM_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int CACHE_REFRESH_INTERVAL_MM_LEN = 2;
  /** serializeCacheRefreshIntervalMm */
  protected void serializeCacheRefreshIntervalMm(int cacheRefreshIntervalMm) {
    putNumber(
        beginCacheRefreshIntervalMm,
        cacheRefreshIntervalMm,
        CACHE_REFRESH_INTERVAL_MM_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localCacheRefreshIntervalMmCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeCacheRefreshIntervalMm */
  protected int serializeCacheRefreshIntervalMm(char[] value) {
    int cacheRefreshIntervalMm;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    cacheRefreshIntervalMm =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginCacheRefreshIntervalMm, 2);
    localCacheRefreshIntervalMmCounter = shareString.getSerializedField().getModifiedCounter();
    return cacheRefreshIntervalMm;
  }

  protected int checkCacheRefreshIntervalMmMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshCacheRefreshIntervalMm is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshCacheRefreshIntervalMm() throws CFException {
    try {
      return (getIntNumber(
          beginCacheRefreshIntervalMm,
          CACHE_REFRESH_INTERVAL_MM_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "cacheRefreshIntervalMm", beginCacheRefreshIntervalMm, CACHE_REFRESH_INTERVAL_MM_LEN);
    }
  }

  int localCacheRefreshIntervalSsCounter = -1;

  public boolean isCacheRefreshIntervalSsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheRefreshIntervalSsCounter != sharedCounter;
    localCacheRefreshIntervalSsCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of cacheRefreshIntervalSs
   *
   * @return cacheRefreshIntervalSs
   */
  public char[] getCacheRefreshIntervalSsString() {
    return getCharArray(beginCacheRefreshIntervalSs, CACHE_REFRESH_INTERVAL_SS_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean cacheRefreshIntervalSsIsNumeric() {
    return isNumeric(
        beginCacheRefreshIntervalSs,
        beginCacheRefreshIntervalSs + CACHE_REFRESH_INTERVAL_SS_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int CACHE_REFRESH_INTERVAL_SS_LEN = 2;
  /** serializeCacheRefreshIntervalSs */
  protected void serializeCacheRefreshIntervalSs(int cacheRefreshIntervalSs) {
    putNumber(
        beginCacheRefreshIntervalSs,
        cacheRefreshIntervalSs,
        CACHE_REFRESH_INTERVAL_SS_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localCacheRefreshIntervalSsCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeCacheRefreshIntervalSs */
  protected int serializeCacheRefreshIntervalSs(char[] value) {
    int cacheRefreshIntervalSs;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    cacheRefreshIntervalSs =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginCacheRefreshIntervalSs, 2);
    localCacheRefreshIntervalSsCounter = shareString.getSerializedField().getModifiedCounter();
    return cacheRefreshIntervalSs;
  }

  protected int checkCacheRefreshIntervalSsMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshCacheRefreshIntervalSs is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshCacheRefreshIntervalSs() throws CFException {
    try {
      return (getIntNumber(
          beginCacheRefreshIntervalSs,
          CACHE_REFRESH_INTERVAL_SS_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "cacheRefreshIntervalSs", beginCacheRefreshIntervalSs, CACHE_REFRESH_INTERVAL_SS_LEN);
    }
  }

  int localEofSwCounter = -1;

  public boolean isEofSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEofSwCounter != sharedCounter;
    localEofSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkEofSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localDataErrorSwCounter = -1;

  public boolean isDataErrorSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDataErrorSwCounter != sharedCounter;
    localDataErrorSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkDataErrorSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localCacheStorageSwCounter = -1;

  public boolean isCacheStorageSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheStorageSwCounter != sharedCounter;
    localCacheStorageSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkCacheStorageSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localGetmainSwCounter = -1;

  public boolean isGetmainSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGetmainSwCounter != sharedCounter;
    localGetmainSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkGetmainSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localTsqWriteSwCounter = -1;

  public boolean isTsqWriteSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTsqWriteSwCounter != sharedCounter;
    localTsqWriteSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkTsqWriteSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localPriorKeyCounter = -1;

  public boolean isPriorKeyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPriorKeyCounter != sharedCounter;
    localPriorKeyCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkPriorKeyConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }

  int localTsQueueNameCounter = -1;

  public boolean isTsQueueNameModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTsQueueNameCounter != sharedCounter;
    localTsQueueNameCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkTsQueueNameConstraints(char[] value) {
    return super.checkConstraints(value, 16, false, false);
  }

  int localTsqItem1Counter = -1;

  public boolean isTsqItem1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTsqItem1Counter != sharedCounter;
    localTsqItem1Counter = sharedCounter;
    return hasModified;
  }

  protected short checkTsqItem1MaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }

  int localDisplay1Counter = -1;

  public boolean isDisplay1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDisplay1Counter != sharedCounter;
    localDisplay1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int DISPLAY_1_LEN = 10;
  /** serialize this Display1 */
  protected void serializeDisplay1(char[] display1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(display1, 0, getStringValue(), beginDisplay1, DISPLAY_1_LEN);
    localDisplay1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDisplay1Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDisplay1 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDisplay1() {
    return (substring(getStringValue(), beginDisplay1, beginDisplay1 + DISPLAY_1_LEN));
  }

  int localDisplay2Counter = -1;

  public boolean isDisplay2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDisplay2Counter != sharedCounter;
    localDisplay2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int DISPLAY_2_LEN = 10;
  /** serialize this Display2 */
  protected void serializeDisplay2(char[] display2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(display2, 0, getStringValue(), beginDisplay2, DISPLAY_2_LEN);
    localDisplay2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDisplay2Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDisplay2 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDisplay2() {
    return (substring(getStringValue(), beginDisplay2, beginDisplay2 + DISPLAY_2_LEN));
  }

  int localDisplay3Counter = -1;

  public boolean isDisplay3Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDisplay3Counter != sharedCounter;
    localDisplay3Counter = sharedCounter;
    return hasModified;
  }

  protected static final int DISPLAY_3_LEN = 10;
  /** serialize this Display3 */
  protected void serializeDisplay3(char[] display3) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(display3, 0, getStringValue(), beginDisplay3, DISPLAY_3_LEN);
    localDisplay3Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDisplay3Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDisplay3 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDisplay3() {
    return (substring(getStringValue(), beginDisplay3, beginDisplay3 + DISPLAY_3_LEN));
  }

  int localDisplay4Counter = -1;

  public boolean isDisplay4Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDisplay4Counter != sharedCounter;
    localDisplay4Counter = sharedCounter;
    return hasModified;
  }

  protected static final int DISPLAY_4_LEN = 10;
  /** serialize this Display4 */
  protected void serializeDisplay4(char[] display4) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(display4, 0, getStringValue(), beginDisplay4, DISPLAY_4_LEN);
    localDisplay4Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDisplay4Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDisplay4 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDisplay4() {
    return (substring(getStringValue(), beginDisplay4, beginDisplay4 + DISPLAY_4_LEN));
  }

  int localIntegerDisplayCounter = -1;

  public boolean isIntegerDisplayModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localIntegerDisplayCounter != sharedCounter;
    localIntegerDisplayCounter = sharedCounter;
    return hasModified;
  }

  protected static final int INTEGER_DISPLAY_LEN = 11;
  /** serialize this IntegerDisplay */
  protected void serializeIntegerDisplay(char[] integerDisplay) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(integerDisplay, 0, getStringValue(), beginIntegerDisplay, INTEGER_DISPLAY_LEN);
    localIntegerDisplayCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkIntegerDisplayConstraints(char[] value) {
    return super.checkConstraints(value, 11, false, false);
  }
  /**
   * refreshIntegerDisplay is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshIntegerDisplay() {
    return (substring(
        getStringValue(), beginIntegerDisplay, beginIntegerDisplay + INTEGER_DISPLAY_LEN));
  }

  int localRespCounter = -1;

  public boolean isRespModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRespCounter != sharedCounter;
    localRespCounter = sharedCounter;
    return hasModified;
  }

  protected int checkRespMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localResp2Counter = -1;

  public boolean isResp2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localResp2Counter != sharedCounter;
    localResp2Counter = sharedCounter;
    return hasModified;
  }

  protected int checkResp2MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localKeyArrayMaxCounter = -1;

  public boolean isKeyArrayMaxModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localKeyArrayMaxCounter != sharedCounter;
    localKeyArrayMaxCounter = sharedCounter;
    return hasModified;
  }

  protected int checkKeyArrayMaxMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localDataArrayMaxCounter = -1;

  public boolean isDataArrayMaxModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDataArrayMaxCounter != sharedCounter;
    localDataArrayMaxCounter = sharedCounter;
    return hasModified;
  }

  protected int checkDataArrayMaxMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localCacheKeyOverflowIndCounter = -1;

  public boolean isCacheKeyOverflowIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheKeyOverflowIndCounter != sharedCounter;
    localCacheKeyOverflowIndCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkCacheKeyOverflowIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localCacheDataOverflowIndCounter = -1;

  public boolean isCacheDataOverflowIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataOverflowIndCounter != sharedCounter;
    localCacheDataOverflowIndCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkCacheDataOverflowIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localTallyCounter = -1;

  public boolean isTallyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTallyCounter != sharedCounter;
    localTallyCounter = sharedCounter;
    return hasModified;
  }

  protected short checkTallyMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }

  int localCacheKeyThresholdCounter = -1;

  public boolean isCacheKeyThresholdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheKeyThresholdCounter != sharedCounter;
    localCacheKeyThresholdCounter = sharedCounter;
    return hasModified;
  }

  public boolean cacheKeyThresholdIsNumeric() {
    return decimalIsNumeric(
        beginCacheKeyThreshold,
        CACHE_KEY_THRESHOLD_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int CACHE_KEY_THRESHOLD_LEN = 5;
  /** serializeCacheKeyThreshold */
  protected void serializeCacheKeyThreshold(int cacheKeyThreshold) {
    putDecimal(beginCacheKeyThreshold, cacheKeyThreshold, CACHE_KEY_THRESHOLD_LEN, true);
  }

  protected int checkCacheKeyThresholdMaxLimit(long number) {
    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshCacheKeyThreshold is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheKeyThreshold() throws CFException {
    try {
      return (getIntDecimal(beginCacheKeyThreshold, CACHE_KEY_THRESHOLD_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("cacheKeyThreshold", beginCacheKeyThreshold, CACHE_KEY_THRESHOLD_LEN);
    }
  }

  int localCacheDataThresholdCounter = -1;

  public boolean isCacheDataThresholdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataThresholdCounter != sharedCounter;
    localCacheDataThresholdCounter = sharedCounter;
    return hasModified;
  }

  public boolean cacheDataThresholdIsNumeric() {
    return decimalIsNumeric(
        beginCacheDataThreshold,
        CACHE_DATA_THRESHOLD_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int CACHE_DATA_THRESHOLD_LEN = 5;
  /** serializeCacheDataThreshold */
  protected void serializeCacheDataThreshold(int cacheDataThreshold) {
    putDecimal(beginCacheDataThreshold, cacheDataThreshold, CACHE_DATA_THRESHOLD_LEN, true);
  }

  protected int checkCacheDataThresholdMaxLimit(long number) {
    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshCacheDataThreshold is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheDataThreshold() throws CFException {
    try {
      return (getIntDecimal(beginCacheDataThreshold, CACHE_DATA_THRESHOLD_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("cacheDataThreshold", beginCacheDataThreshold, CACHE_DATA_THRESHOLD_LEN);
    }
  }

  int localPercentCalcCounter = -1;

  public boolean isPercentCalcModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPercentCalcCounter != sharedCounter;
    localPercentCalcCounter = sharedCounter;
    return hasModified;
  }

  public boolean percentCalcIsNumeric() {
    return decimalIsNumeric(
        beginPercentCalc,
        PERCENT_CALC_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] percentCalcString() {
    return getPackedString(beginPercentCalc, PERCENT_CALC_LEN);
  }

  protected static final int PERCENT_CALC_LEN = 4;
  protected static final int PERCENT_CALC_SCALE = 4;
  /** serializePercentCalc */
  protected void serializePercentCalc(BigDecimal percentCalc) {
    putDecimal(beginPercentCalc, percentCalc, PERCENT_CALC_LEN, PERCENT_CALC_SCALE, true);
    localPercentCalcCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkPercentCalcMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 4 /*scale*/, 7 /*precision*/);
  }
  /**
   * refreshPercentCalc is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public BigDecimal refreshPercentCalc() throws CFException {
    try {
      return (getDecimal(beginPercentCalc, PERCENT_CALC_LEN, PERCENT_CALC_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("percentCalc", beginPercentCalc, PERCENT_CALC_LEN);
    }
  }

  int localCacheKeyThresholdPercentCounter = -1;

  public boolean isCacheKeyThresholdPercentModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheKeyThresholdPercentCounter != sharedCounter;
    localCacheKeyThresholdPercentCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_KEY_THRESHOLD_PERCENT_LEN = 3;
  /** serialize this CacheKeyThresholdPercent */
  protected void serializeCacheKeyThresholdPercent(char[] cacheKeyThresholdPercent) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheKeyThresholdPercent,
        0,
        getStringValue(),
        beginCacheKeyThresholdPercent,
        CACHE_KEY_THRESHOLD_PERCENT_LEN);
    localCacheKeyThresholdPercentCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheKeyThresholdPercentConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshCacheKeyThresholdPercent is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheKeyThresholdPercent() {
    return (substring(
        getStringValue(),
        beginCacheKeyThresholdPercent,
        beginCacheKeyThresholdPercent + CACHE_KEY_THRESHOLD_PERCENT_LEN));
  }

  int localCacheDataThresholdPercentCounter = -1;

  public boolean isCacheDataThresholdPercentModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataThresholdPercentCounter != sharedCounter;
    localCacheDataThresholdPercentCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_THRESHOLD_PERCENT_LEN = 3;
  /** serialize this CacheDataThresholdPercent */
  protected void serializeCacheDataThresholdPercent(char[] cacheDataThresholdPercent) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheDataThresholdPercent,
        0,
        getStringValue(),
        beginCacheDataThresholdPercent,
        CACHE_DATA_THRESHOLD_PERCENT_LEN);
    localCacheDataThresholdPercentCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheDataThresholdPercentConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshCacheDataThresholdPercent is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheDataThresholdPercent() {
    return (substring(
        getStringValue(),
        beginCacheDataThresholdPercent,
        beginCacheDataThresholdPercent + CACHE_DATA_THRESHOLD_PERCENT_LEN));
  }

  int localThresholdPercentCounter = -1;

  public boolean isThresholdPercentModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localThresholdPercentCounter != sharedCounter;
    localThresholdPercentCounter = sharedCounter;
    return hasModified;
  }

  public boolean thresholdPercentIsNumeric() {
    return decimalIsNumeric(
        beginThresholdPercent,
        THRESHOLD_PERCENT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] thresholdPercentString() {
    return getPackedString(beginThresholdPercent, THRESHOLD_PERCENT_LEN);
  }

  protected static final int THRESHOLD_PERCENT_LEN = 3;
  protected static final int THRESHOLD_PERCENT_SCALE = 2;
  /** serializeThresholdPercent */
  protected void serializeThresholdPercent(BigDecimal thresholdPercent) {
    putDecimal(
        beginThresholdPercent,
        thresholdPercent,
        THRESHOLD_PERCENT_LEN,
        THRESHOLD_PERCENT_SCALE,
        true);
    localThresholdPercentCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkThresholdPercentMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshThresholdPercent is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshThresholdPercent() throws CFException {
    try {
      return (getDecimal(beginThresholdPercent, THRESHOLD_PERCENT_LEN, THRESHOLD_PERCENT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("thresholdPercent", beginThresholdPercent, THRESHOLD_PERCENT_LEN);
    }
  }

  int localThresholdPercentDisCounter = -1;

  public boolean isThresholdPercentDisModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localThresholdPercentDisCounter != sharedCounter;
    localThresholdPercentDisCounter = sharedCounter;
    return hasModified;
  }

  protected static final int THRESHOLD_PERCENT_DIS_LEN = 3;
  /** serialize this ThresholdPercentDis */
  protected void serializeThresholdPercentDis(char[] thresholdPercentDis) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        thresholdPercentDis,
        0,
        getStringValue(),
        beginThresholdPercentDis,
        THRESHOLD_PERCENT_DIS_LEN);
    localThresholdPercentDisCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkThresholdPercentDisConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshThresholdPercentDis is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshThresholdPercentDis() {
    return (substring(
        getStringValue(),
        beginThresholdPercentDis,
        beginThresholdPercentDis + THRESHOLD_PERCENT_DIS_LEN));
  }

  int localLenCacheKeyAreaCounter = -1;

  public boolean isLenCacheKeyAreaModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLenCacheKeyAreaCounter != sharedCounter;
    localLenCacheKeyAreaCounter = sharedCounter;
    return hasModified;
  }

  protected int checkLenCacheKeyAreaMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localLenCacheDataAreaCounter = -1;

  public boolean isLenCacheDataAreaModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLenCacheDataAreaCounter != sharedCounter;
    localLenCacheDataAreaCounter = sharedCounter;
    return hasModified;
  }

  protected int checkLenCacheDataAreaMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localRunningKeyLenCounter = -1;

  public boolean isRunningKeyLenModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRunningKeyLenCounter != sharedCounter;
    localRunningKeyLenCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of runningKeyLen
   *
   * @return runningKeyLen
   */
  public char[] getRunningKeyLenString() {
    return getCharArray(beginRunningKeyLen, RUNNING_KEY_LEN_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean runningKeyLenIsNumeric() {
    return isNumeric(
        beginRunningKeyLen,
        beginRunningKeyLen + RUNNING_KEY_LEN_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int RUNNING_KEY_LEN_LEN = 9;
  /** serializeRunningKeyLen */
  protected void serializeRunningKeyLen(int runningKeyLen) {
    putNumber(
        beginRunningKeyLen,
        runningKeyLen,
        RUNNING_KEY_LEN_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localRunningKeyLenCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeRunningKeyLen */
  protected int serializeRunningKeyLen(char[] value) {
    int runningKeyLen;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    runningKeyLen =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginRunningKeyLen, 9);
    localRunningKeyLenCounter = shareString.getSerializedField().getModifiedCounter();
    return runningKeyLen;
  }

  protected int checkRunningKeyLenMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshRunningKeyLen is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshRunningKeyLen() throws CFException {
    try {
      return (getIntNumber(
          beginRunningKeyLen,
          RUNNING_KEY_LEN_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("runningKeyLen", beginRunningKeyLen, RUNNING_KEY_LEN_LEN);
    }
  }

  int localRunningDataLenCounter = -1;

  public boolean isRunningDataLenModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRunningDataLenCounter != sharedCounter;
    localRunningDataLenCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of runningDataLen
   *
   * @return runningDataLen
   */
  public char[] getRunningDataLenString() {
    return getCharArray(beginRunningDataLen, RUNNING_DATA_LEN_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean runningDataLenIsNumeric() {
    return isNumeric(
        beginRunningDataLen,
        beginRunningDataLen + RUNNING_DATA_LEN_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int RUNNING_DATA_LEN_LEN = 9;
  /** serializeRunningDataLen */
  protected void serializeRunningDataLen(int runningDataLen) {
    putNumber(
        beginRunningDataLen,
        runningDataLen,
        RUNNING_DATA_LEN_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localRunningDataLenCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeRunningDataLen */
  protected int serializeRunningDataLen(char[] value) {
    int runningDataLen;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    runningDataLen =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginRunningDataLen, 9);
    localRunningDataLenCounter = shareString.getSerializedField().getModifiedCounter();
    return runningDataLen;
  }

  protected int checkRunningDataLenMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshRunningDataLen is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshRunningDataLen() throws CFException {
    try {
      return (getIntNumber(
          beginRunningDataLen,
          RUNNING_DATA_LEN_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("runningDataLen", beginRunningDataLen, RUNNING_DATA_LEN_LEN);
    }
  }

  int localRunningKeyCntCounter = -1;

  public boolean isRunningKeyCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRunningKeyCntCounter != sharedCounter;
    localRunningKeyCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of runningKeyCnt
   *
   * @return runningKeyCnt
   */
  public char[] getRunningKeyCntString() {
    return getCharArray(beginRunningKeyCnt, RUNNING_KEY_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean runningKeyCntIsNumeric() {
    return isNumeric(
        beginRunningKeyCnt,
        beginRunningKeyCnt + RUNNING_KEY_CNT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int RUNNING_KEY_CNT_LEN = 9;
  /** serializeRunningKeyCnt */
  protected void serializeRunningKeyCnt(int runningKeyCnt) {
    putNumber(
        beginRunningKeyCnt,
        runningKeyCnt,
        RUNNING_KEY_CNT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localRunningKeyCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeRunningKeyCnt */
  protected int serializeRunningKeyCnt(char[] value) {
    int runningKeyCnt;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    runningKeyCnt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginRunningKeyCnt, 9);
    localRunningKeyCntCounter = shareString.getSerializedField().getModifiedCounter();
    return runningKeyCnt;
  }

  protected int checkRunningKeyCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshRunningKeyCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshRunningKeyCnt() throws CFException {
    try {
      return (getIntNumber(
          beginRunningKeyCnt,
          RUNNING_KEY_CNT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("runningKeyCnt", beginRunningKeyCnt, RUNNING_KEY_CNT_LEN);
    }
  }

  int localRunningDataCntCounter = -1;

  public boolean isRunningDataCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRunningDataCntCounter != sharedCounter;
    localRunningDataCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of runningDataCnt
   *
   * @return runningDataCnt
   */
  public char[] getRunningDataCntString() {
    return getCharArray(beginRunningDataCnt, RUNNING_DATA_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean runningDataCntIsNumeric() {
    return isNumeric(
        beginRunningDataCnt,
        beginRunningDataCnt + RUNNING_DATA_CNT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int RUNNING_DATA_CNT_LEN = 9;
  /** serializeRunningDataCnt */
  protected void serializeRunningDataCnt(int runningDataCnt) {
    putNumber(
        beginRunningDataCnt,
        runningDataCnt,
        RUNNING_DATA_CNT_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localRunningDataCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeRunningDataCnt */
  protected int serializeRunningDataCnt(char[] value) {
    int runningDataCnt;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    runningDataCnt =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginRunningDataCnt, 9);
    localRunningDataCntCounter = shareString.getSerializedField().getModifiedCounter();
    return runningDataCnt;
  }

  protected int checkRunningDataCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshRunningDataCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshRunningDataCnt() throws CFException {
    try {
      return (getIntNumber(
          beginRunningDataCnt,
          RUNNING_DATA_CNT_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("runningDataCnt", beginRunningDataCnt, RUNNING_DATA_CNT_LEN);
    }
  }

  int localLenOf1KeyOccurrenceCounter = -1;

  public boolean isLenOf1KeyOccurrenceModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLenOf1KeyOccurrenceCounter != sharedCounter;
    localLenOf1KeyOccurrenceCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of lenOf1KeyOccurrence
   *
   * @return lenOf1KeyOccurrence
   */
  public char[] getLenOf1KeyOccurrenceString() {
    return getCharArray(beginLenOf1KeyOccurrence, LEN_OF_1_KEY_OCCURRENCE_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean lenOf1KeyOccurrenceIsNumeric() {
    return isNumeric(
        beginLenOf1KeyOccurrence,
        beginLenOf1KeyOccurrence + LEN_OF_1_KEY_OCCURRENCE_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int LEN_OF_1_KEY_OCCURRENCE_LEN = 9;
  /** serializeLenOf1KeyOccurrence */
  protected void serializeLenOf1KeyOccurrence(int lenOf1KeyOccurrence) {
    putNumber(
        beginLenOf1KeyOccurrence,
        lenOf1KeyOccurrence,
        LEN_OF_1_KEY_OCCURRENCE_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localLenOf1KeyOccurrenceCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeLenOf1KeyOccurrence */
  protected int serializeLenOf1KeyOccurrence(char[] value) {
    int lenOf1KeyOccurrence;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    lenOf1KeyOccurrence =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginLenOf1KeyOccurrence, 9);
    localLenOf1KeyOccurrenceCounter = shareString.getSerializedField().getModifiedCounter();
    return lenOf1KeyOccurrence;
  }

  protected int checkLenOf1KeyOccurrenceMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshLenOf1KeyOccurrence is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshLenOf1KeyOccurrence() throws CFException {
    try {
      return (getIntNumber(
          beginLenOf1KeyOccurrence,
          LEN_OF_1_KEY_OCCURRENCE_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "lenOf1KeyOccurrence", beginLenOf1KeyOccurrence, LEN_OF_1_KEY_OCCURRENCE_LEN);
    }
  }

  int localLenOf1DataOccurrenceCounter = -1;

  public boolean isLenOf1DataOccurrenceModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLenOf1DataOccurrenceCounter != sharedCounter;
    localLenOf1DataOccurrenceCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of lenOf1DataOccurrence
   *
   * @return lenOf1DataOccurrence
   */
  public char[] getLenOf1DataOccurrenceString() {
    return getCharArray(beginLenOf1DataOccurrence, LEN_OF_1_DATA_OCCURRENCE_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean lenOf1DataOccurrenceIsNumeric() {
    return isNumeric(
        beginLenOf1DataOccurrence,
        beginLenOf1DataOccurrence + LEN_OF_1_DATA_OCCURRENCE_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int LEN_OF_1_DATA_OCCURRENCE_LEN = 9;
  /** serializeLenOf1DataOccurrence */
  protected void serializeLenOf1DataOccurrence(int lenOf1DataOccurrence) {
    putNumber(
        beginLenOf1DataOccurrence,
        lenOf1DataOccurrence,
        LEN_OF_1_DATA_OCCURRENCE_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localLenOf1DataOccurrenceCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeLenOf1DataOccurrence */
  protected int serializeLenOf1DataOccurrence(char[] value) {
    int lenOf1DataOccurrence;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    lenOf1DataOccurrence =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginLenOf1DataOccurrence, 9);
    localLenOf1DataOccurrenceCounter = shareString.getSerializedField().getModifiedCounter();
    return lenOf1DataOccurrence;
  }

  protected int checkLenOf1DataOccurrenceMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshLenOf1DataOccurrence is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshLenOf1DataOccurrence() throws CFException {
    try {
      return (getIntNumber(
          beginLenOf1DataOccurrence,
          LEN_OF_1_DATA_OCCURRENCE_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "lenOf1DataOccurrence", beginLenOf1DataOccurrence, LEN_OF_1_DATA_OCCURRENCE_LEN);
    }
  }

  int localCicsHoursCounter = -1;

  public boolean isCicsHoursModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCicsHoursCounter != sharedCounter;
    localCicsHoursCounter = sharedCounter;
    return hasModified;
  }

  protected int checkCicsHoursMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localCicsMinutesCounter = -1;

  public boolean isCicsMinutesModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCicsMinutesCounter != sharedCounter;
    localCicsMinutesCounter = sharedCounter;
    return hasModified;
  }

  protected int checkCicsMinutesMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localCicsSecondsCounter = -1;

  public boolean isCicsSecondsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCicsSecondsCounter != sharedCounter;
    localCicsSecondsCounter = sharedCounter;
    return hasModified;
  }

  protected int checkCicsSecondsMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localCicsAbendCodeCounter = -1;

  public boolean isCicsAbendCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCicsAbendCodeCounter != sharedCounter;
    localCicsAbendCodeCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkCicsAbendCodeConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }

  int localDsnnrowsCounter = -1;

  public boolean isDsnnrowsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsnnrowsCounter != sharedCounter;
    localDsnnrowsCounter = sharedCounter;
    return hasModified;
  }

  protected int checkDsnnrowsMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
}
