package com.cloudframe.app.dto.dphpctsq;

/**
 * The class Work is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Work extends WorkSerialized {

  private char[] thisProgram = new char[8];

  private char[] message = Field.fillLowValue(80);

  private int cacheRefreshIntervalHh;

  private int cacheRefreshIntervalMm;

  private int cacheRefreshIntervalSs;

  private char[] eofSw = new char[1];

  private char[] dataErrorSw = new char[1];

  private char[] cacheStorageSw = new char[1];

  private char[] getmainSw = new char[1];

  private char[] tsqWriteSw = new char[1];

  private char[] priorKey = new char[7];

  private char[] tsQueueName = new char[16];

  private short tsqItem1;

  private char[] display1 = Field.fillLowValue(10);

  private char[] display2 = Field.fillLowValue(10);

  private char[] display3 = Field.fillLowValue(10);

  private char[] display4 = Field.fillLowValue(10);

  private char[] integerDisplay = Field.fillLowValue(11);

  private int resp;

  private int resp2;

  private int keyArrayMax;

  private int dataArrayMax;

  private char[] cacheKeyOverflowInd = Field.fillLowValue(1);

  private char[] cacheDataOverflowInd = Field.fillLowValue(1);

  private short tally;

  private int cacheKeyThreshold;

  private int cacheDataThreshold;

  private BigDecimal percentCalc = BigDecimal.ZERO;

  private char[] cacheKeyThresholdPercent = Field.fillLowValue(3);

  private char[] cacheDataThresholdPercent = Field.fillLowValue(3);

  private BigDecimal thresholdPercent = BigDecimal.ZERO;

  private char[] thresholdPercentDis = Field.fillLowValue(3);

  private int lenCacheKeyArea;

  private int lenCacheDataArea;

  private int runningKeyLen;

  private int runningDataLen;

  private int runningKeyCnt;

  private int runningDataCnt;

  private int lenOf1KeyOccurrence;

  private int lenOf1DataOccurrence;

  private int cicsHours;

  private int cicsMinutes;

  private int cicsSeconds;

  private char[] cicsAbendCode = new char[4];

  private int dsnnrows;

  /** Constructor for Work */
  public Work() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    setThisProgram(("DPHPCTSQ").toCharArray());
    setEofSw(("N").toCharArray());
    setDataErrorSw(("N").toCharArray());
    setCacheStorageSw(("N").toCharArray());
    setGetmainSw(("N").toCharArray());
    setTsqWriteSw(("N").toCharArray());
    setPriorKey(fillLowValue(7));
    setTsQueueName(
        getString(
                new byte[] {
                  (byte) 0xC3,
                  (byte) 0xC1,
                  (byte) 0xC3,
                  (byte) 0xC8,
                  (byte) 0xC5,
                  (byte) 0x60,
                  (byte) 0xE3,
                  (byte) 0xD6,
                  (byte) 0xD7,
                  (byte) 0x60,
                  (byte) 0xC8,
                  (byte) 0xC9,
                  (byte) 0xD7,
                  (byte) 0xC1,
                  (byte) 0xD7,
                  (byte) 0xC3
                })
            .toCharArray());
    setTsqItem1((short) 1);
    setResp(0);
    setResp2(0);
    setKeyArrayMax(500);
    setDataArrayMax(2000);
    setTally((short) 0);
    setCacheKeyThreshold(0);
    setCacheDataThreshold(0);
    setPercentCalc(BigDecimal.ZERO);
    setThresholdPercent(BigDecimal.valueOf(000.10).setScale(2));
    setLenCacheKeyArea(0);
    setLenCacheDataArea(0);
    setRunningKeyLen(0);
    setRunningDataLen(0);
    setRunningKeyCnt(0);
    setRunningDataCnt(0);
    setLenOf1KeyOccurrence(0);
    setLenOf1DataOccurrence(0);
    setCicsAbendCode(("UNKN").toCharArray());
  }

  /**
   * Returns the value of thisProgram
   *
   * @return thisProgram
   */
  public char[] getThisProgram() throws CFException {
    return thisProgram;
  }

  /**
   * set variable thisProgram Corresponding COBOL Variable is WS-THIS-PROGRAM
   *
   * @param value
   */
  public void setThisProgram(char[] value) {
    value = checkThisProgramConstraints(value);
    arraycopy(value, 0, thisProgram, 0, value.length);
  }

  public void setThisProgram(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, thisProgram, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of message
   *
   * @return message
   */
  public char[] getMessage() throws CFException {
    return message;
  }

  /**
   * set variable message Corresponding COBOL Variable is WS-MESSAGE
   *
   * @param value
   */
  public void setMessage(char[] value) {
    value = checkMessageConstraints(value);
    arraycopy(value, 0, message, 0, value.length);
  }

  public void setMessage(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, message, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of cacheRefreshIntervalHh
   *
   * @return cacheRefreshIntervalHh
   */
  public int getCacheRefreshIntervalHh() throws CFException {
    if (isCacheRefreshIntervalHhModified()) {
      cacheRefreshIntervalHh = refreshCacheRefreshIntervalHh();
    }
    return cacheRefreshIntervalHh;
  }

  /**
   * Update CacheRefreshIntervalHh with the passed value Corresponding COBOL Variable is
   * CACHE-REFRESH-INTERVAL-HH
   *
   * @param number
   */
  public void setCacheRefreshIntervalHh(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheRefreshIntervalHh = checkCacheRefreshIntervalHhMaxLimit(number);
    serializeCacheRefreshIntervalHh(cacheRefreshIntervalHh);
  }

  public void setCacheRefreshIntervalHh(long number) {
    number =
        checkCacheRefreshIntervalHhMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheRefreshIntervalHh((int) number);
  }

  /**
   * Update CacheRefreshIntervalHh with the passed value
   *
   * @param value (String or char[])
   */
  public void setCacheRefreshIntervalHh(char[] value) throws CFException {
    cacheRefreshIntervalHh = serializeCacheRefreshIntervalHh(value);
  }
  /**
   * Update CacheRefreshIntervalHh with the passed value
   *
   * @param value (String or char[])
   */
  public void setCacheRefreshIntervalHhString(char[] value) throws CFException {
    setCacheRefreshIntervalHh(value);
  }
  /**
   * Returns the value of cacheRefreshIntervalMm
   *
   * @return cacheRefreshIntervalMm
   */
  public int getCacheRefreshIntervalMm() throws CFException {
    if (isCacheRefreshIntervalMmModified()) {
      cacheRefreshIntervalMm = refreshCacheRefreshIntervalMm();
    }
    return cacheRefreshIntervalMm;
  }

  /**
   * Update CacheRefreshIntervalMm with the passed value Corresponding COBOL Variable is
   * CACHE-REFRESH-INTERVAL-MM
   *
   * @param number
   */
  public void setCacheRefreshIntervalMm(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheRefreshIntervalMm = checkCacheRefreshIntervalMmMaxLimit(number);
    serializeCacheRefreshIntervalMm(cacheRefreshIntervalMm);
  }

  public void setCacheRefreshIntervalMm(long number) {
    number =
        checkCacheRefreshIntervalMmMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheRefreshIntervalMm((int) number);
  }

  /**
   * Update CacheRefreshIntervalMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setCacheRefreshIntervalMm(char[] value) throws CFException {
    cacheRefreshIntervalMm = serializeCacheRefreshIntervalMm(value);
  }
  /**
   * Update CacheRefreshIntervalMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setCacheRefreshIntervalMmString(char[] value) throws CFException {
    setCacheRefreshIntervalMm(value);
  }
  /**
   * Returns the value of cacheRefreshIntervalSs
   *
   * @return cacheRefreshIntervalSs
   */
  public int getCacheRefreshIntervalSs() throws CFException {
    if (isCacheRefreshIntervalSsModified()) {
      cacheRefreshIntervalSs = refreshCacheRefreshIntervalSs();
    }
    return cacheRefreshIntervalSs;
  }

  /**
   * Update CacheRefreshIntervalSs with the passed value Corresponding COBOL Variable is
   * CACHE-REFRESH-INTERVAL-SS
   *
   * @param number
   */
  public void setCacheRefreshIntervalSs(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheRefreshIntervalSs = checkCacheRefreshIntervalSsMaxLimit(number);
    serializeCacheRefreshIntervalSs(cacheRefreshIntervalSs);
  }

  public void setCacheRefreshIntervalSs(long number) {
    number =
        checkCacheRefreshIntervalSsMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheRefreshIntervalSs((int) number);
  }

  /**
   * Update CacheRefreshIntervalSs with the passed value
   *
   * @param value (String or char[])
   */
  public void setCacheRefreshIntervalSs(char[] value) throws CFException {
    cacheRefreshIntervalSs = serializeCacheRefreshIntervalSs(value);
  }
  /**
   * Update CacheRefreshIntervalSs with the passed value
   *
   * @param value (String or char[])
   */
  public void setCacheRefreshIntervalSsString(char[] value) throws CFException {
    setCacheRefreshIntervalSs(value);
  }
  /**
   * Returns the value of eofSw
   *
   * @return eofSw
   */
  public char[] getEofSw() throws CFException {
    return eofSw;
  }

  /**
   * set variable eofSw Corresponding COBOL Variable is EOF-SW
   *
   * @param value
   */
  public void setEofSw(char[] value) {
    value = checkEofSwConstraints(value);
    arraycopy(value, 0, eofSw, 0, value.length);
  }

  public void setEofSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, eofSw, 0, beginIndex + endIndex);
  }

  char[] notEof88Value = "N".toCharArray();
  /**
   * Test condition "N" for isNotEof()
   *
   * @return Returns true if isNotEof() is "N"
   */
  public boolean isNotEof() throws CFException {
    return (compareChars(getEofSw(), notEof88Value) == 0);
  }

  /** set values "N" */
  public void setNotEofTrue() {
    setEofSw(notEof88Value);
  }

  char[] eof88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isEof()
   *
   * @return Returns true if isEof() is "Y"
   */
  public boolean isEof() throws CFException {
    return (compareChars(getEofSw(), eof88Value) == 0);
  }

  /** set values "Y" */
  public void setEofTrue() {
    setEofSw(eof88Value);
  }
  /**
   * Returns the value of dataErrorSw
   *
   * @return dataErrorSw
   */
  public char[] getDataErrorSw() throws CFException {
    return dataErrorSw;
  }

  /**
   * set variable dataErrorSw Corresponding COBOL Variable is DATA-ERROR-SW
   *
   * @param value
   */
  public void setDataErrorSw(char[] value) {
    value = checkDataErrorSwConstraints(value);
    arraycopy(value, 0, dataErrorSw, 0, value.length);
  }

  public void setDataErrorSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, dataErrorSw, 0, beginIndex + endIndex);
  }

  char[] noDataError88Value = "N".toCharArray();
  /**
   * Test condition "N" for isNoDataError()
   *
   * @return Returns true if isNoDataError() is "N"
   */
  public boolean isNoDataError() throws CFException {
    return (compareChars(getDataErrorSw(), noDataError88Value) == 0);
  }

  /** set values "N" */
  public void setNoDataErrorTrue() {
    setDataErrorSw(noDataError88Value);
  }

  char[] dataError88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isDataError()
   *
   * @return Returns true if isDataError() is "Y"
   */
  public boolean isDataError() throws CFException {
    return (compareChars(getDataErrorSw(), dataError88Value) == 0);
  }

  /** set values "Y" */
  public void setDataErrorTrue() {
    setDataErrorSw(dataError88Value);
  }
  /**
   * Returns the value of cacheStorageSw
   *
   * @return cacheStorageSw
   */
  public char[] getCacheStorageSw() throws CFException {
    return cacheStorageSw;
  }

  /**
   * set variable cacheStorageSw Corresponding COBOL Variable is CACHE-STORAGE-SW
   *
   * @param value
   */
  public void setCacheStorageSw(char[] value) {
    value = checkCacheStorageSwConstraints(value);
    arraycopy(value, 0, cacheStorageSw, 0, value.length);
  }

  public void setCacheStorageSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, cacheStorageSw, 0, beginIndex + endIndex);
  }

  char[] storageForCacheNotObtained88Value = "N".toCharArray();
  /**
   * Test condition "N" for isStorageForCacheNotObtained()
   *
   * @return Returns true if isStorageForCacheNotObtained() is "N"
   */
  public boolean isStorageForCacheNotObtained() throws CFException {
    return (compareChars(getCacheStorageSw(), storageForCacheNotObtained88Value) == 0);
  }

  /** set values "N" */
  public void setStorageForCacheNotObtainedTrue() {
    setCacheStorageSw(storageForCacheNotObtained88Value);
  }

  char[] storageForCacheObtained88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isStorageForCacheObtained()
   *
   * @return Returns true if isStorageForCacheObtained() is "Y"
   */
  public boolean isStorageForCacheObtained() throws CFException {
    return (compareChars(getCacheStorageSw(), storageForCacheObtained88Value) == 0);
  }

  /** set values "Y" */
  public void setStorageForCacheObtainedTrue() {
    setCacheStorageSw(storageForCacheObtained88Value);
  }
  /**
   * Returns the value of getmainSw
   *
   * @return getmainSw
   */
  public char[] getGetmainSw() throws CFException {
    return getmainSw;
  }

  /**
   * set variable getmainSw Corresponding COBOL Variable is GETMAIN-SW
   *
   * @param value
   */
  public void setGetmainSw(char[] value) {
    value = checkGetmainSwConstraints(value);
    arraycopy(value, 0, getmainSw, 0, value.length);
  }

  public void setGetmainSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, getmainSw, 0, beginIndex + endIndex);
  }

  char[] getmainFailed88Value = "N".toCharArray();
  /**
   * Test condition "N" for isGetmainFailed()
   *
   * @return Returns true if isGetmainFailed() is "N"
   */
  public boolean isGetmainFailed() throws CFException {
    return (compareChars(getGetmainSw(), getmainFailed88Value) == 0);
  }

  /** set values "N" */
  public void setGetmainFailedTrue() {
    setGetmainSw(getmainFailed88Value);
  }

  char[] getmainSuccessful88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isGetmainSuccessful()
   *
   * @return Returns true if isGetmainSuccessful() is "Y"
   */
  public boolean isGetmainSuccessful() throws CFException {
    return (compareChars(getGetmainSw(), getmainSuccessful88Value) == 0);
  }

  /** set values "Y" */
  public void setGetmainSuccessfulTrue() {
    setGetmainSw(getmainSuccessful88Value);
  }
  /**
   * Returns the value of tsqWriteSw
   *
   * @return tsqWriteSw
   */
  public char[] getTsqWriteSw() throws CFException {
    return tsqWriteSw;
  }

  /**
   * set variable tsqWriteSw Corresponding COBOL Variable is TSQ-WRITE-SW
   *
   * @param value
   */
  public void setTsqWriteSw(char[] value) {
    value = checkTsqWriteSwConstraints(value);
    arraycopy(value, 0, tsqWriteSw, 0, value.length);
  }

  public void setTsqWriteSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, tsqWriteSw, 0, beginIndex + endIndex);
  }

  char[] tsqWriteFailed88Value = "N".toCharArray();
  /**
   * Test condition "N" for isTsqWriteFailed()
   *
   * @return Returns true if isTsqWriteFailed() is "N"
   */
  public boolean isTsqWriteFailed() throws CFException {
    return (compareChars(getTsqWriteSw(), tsqWriteFailed88Value) == 0);
  }

  /** set values "N" */
  public void setTsqWriteFailedTrue() {
    setTsqWriteSw(tsqWriteFailed88Value);
  }

  char[] tsqWriteSuccessful88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isTsqWriteSuccessful()
   *
   * @return Returns true if isTsqWriteSuccessful() is "Y"
   */
  public boolean isTsqWriteSuccessful() throws CFException {
    return (compareChars(getTsqWriteSw(), tsqWriteSuccessful88Value) == 0);
  }

  /** set values "Y" */
  public void setTsqWriteSuccessfulTrue() {
    setTsqWriteSw(tsqWriteSuccessful88Value);
  }
  /**
   * Returns the value of priorKey
   *
   * @return priorKey
   */
  public char[] getPriorKey() throws CFException {
    return priorKey;
  }

  /**
   * set variable priorKey Corresponding COBOL Variable is WS-PRIOR-KEY
   *
   * @param value
   */
  public void setPriorKey(char[] value) {
    value = checkPriorKeyConstraints(value);
    arraycopy(value, 0, priorKey, 0, value.length);
  }

  public void setPriorKey(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, priorKey, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of tsQueueName
   *
   * @return tsQueueName
   */
  public char[] getTsQueueName() throws CFException {
    return tsQueueName;
  }

  /**
   * set variable tsQueueName Corresponding COBOL Variable is WS-TS-QUEUE-NAME
   *
   * @param value
   */
  public void setTsQueueName(char[] value) {
    value = checkTsQueueNameConstraints(value);
    arraycopy(value, 0, tsQueueName, 0, value.length);
  }

  public void setTsQueueName(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, tsQueueName, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of tsqItem1
   *
   * @return tsqItem1
   */
  public short getTsqItem1() throws CFException {
    return tsqItem1;
  }

  /**
   * Update TsqItem1 with the passed value Corresponding COBOL Variable is WS-TSQ-ITEM1
   *
   * @param number
   */
  public void setTsqItem1(short number) {
    // Truncate if the number is beyond +/- Max range
    tsqItem1 = checkTsqItem1MaxLimit(number);
  }

  public void setTsqItem1(int number) {
    number = checkTsqItem1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setTsqItem1((short) number);
  }

  public void setTsqItem1(long number) {
    number = checkTsqItem1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setTsqItem1((short) number);
  }

  /**
   * Returns the value of display1
   *
   * @return display1
   */
  public char[] getDisplay1() throws CFException {
    if (isDisplay1Modified()) {
      display1 = refreshDisplay1();
    }
    return display1;
  }

  /**
   * set variable display1 Corresponding COBOL Variable is WS-DISPLAY1
   *
   * @param value
   */
  public void setDisplay1(char[] value) {
    display1 = checkDisplay1Constraints(value);
    serializeDisplay1(display1);
  }

  /**
   * Update Display1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setDisplay1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDisplay1, display1.length);
  }

  public void setDisplay1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay1, display1.length);
  }

  /**
   * Update Display1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay1 + targetIndex, targetLen);
  }

  /**
   * Update Display1 with another Field
   *
   * @param value
   */
  public void setDisplay1(Field source) {
    replace(source, 0, source.length(), beginDisplay1, DISPLAY_1_LEN);
  }

  /**
   * Update Display1 with another Field from an offset and length
   *
   * @param value
   */
  public void setDisplay1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay1, DISPLAY_1_LEN);
  }

  /**
   * Update Display1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay1 + targetIndex, targetLen);
  }
  /**
   * Returns the value of display2
   *
   * @return display2
   */
  public char[] getDisplay2() throws CFException {
    if (isDisplay2Modified()) {
      display2 = refreshDisplay2();
    }
    return display2;
  }

  /**
   * set variable display2 Corresponding COBOL Variable is WS-DISPLAY2
   *
   * @param value
   */
  public void setDisplay2(char[] value) {
    display2 = checkDisplay2Constraints(value);
    serializeDisplay2(display2);
  }

  /**
   * Update Display2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setDisplay2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDisplay2, display2.length);
  }

  public void setDisplay2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay2, display2.length);
  }

  /**
   * Update Display2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay2 + targetIndex, targetLen);
  }

  /**
   * Update Display2 with another Field
   *
   * @param value
   */
  public void setDisplay2(Field source) {
    replace(source, 0, source.length(), beginDisplay2, DISPLAY_2_LEN);
  }

  /**
   * Update Display2 with another Field from an offset and length
   *
   * @param value
   */
  public void setDisplay2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay2, DISPLAY_2_LEN);
  }

  /**
   * Update Display2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay2 + targetIndex, targetLen);
  }
  /**
   * Returns the value of display3
   *
   * @return display3
   */
  public char[] getDisplay3() throws CFException {
    if (isDisplay3Modified()) {
      display3 = refreshDisplay3();
    }
    return display3;
  }

  /**
   * set variable display3 Corresponding COBOL Variable is WS-DISPLAY3
   *
   * @param value
   */
  public void setDisplay3(char[] value) {
    display3 = checkDisplay3Constraints(value);
    serializeDisplay3(display3);
  }

  /**
   * Update Display3 with a char[] from an offset and length
   *
   * @param value
   */
  public void setDisplay3(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDisplay3, display3.length);
  }

  public void setDisplay3(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay3, display3.length);
  }

  /**
   * Update Display3 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay3(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay3 + targetIndex, targetLen);
  }

  /**
   * Update Display3 with another Field
   *
   * @param value
   */
  public void setDisplay3(Field source) {
    replace(source, 0, source.length(), beginDisplay3, DISPLAY_3_LEN);
  }

  /**
   * Update Display3 with another Field from an offset and length
   *
   * @param value
   */
  public void setDisplay3(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay3, DISPLAY_3_LEN);
  }

  /**
   * Update Display3 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay3(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay3 + targetIndex, targetLen);
  }
  /**
   * Returns the value of display4
   *
   * @return display4
   */
  public char[] getDisplay4() throws CFException {
    if (isDisplay4Modified()) {
      display4 = refreshDisplay4();
    }
    return display4;
  }

  /**
   * set variable display4 Corresponding COBOL Variable is WS-DISPLAY4
   *
   * @param value
   */
  public void setDisplay4(char[] value) {
    display4 = checkDisplay4Constraints(value);
    serializeDisplay4(display4);
  }

  /**
   * Update Display4 with a char[] from an offset and length
   *
   * @param value
   */
  public void setDisplay4(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDisplay4, display4.length);
  }

  public void setDisplay4(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay4, display4.length);
  }

  /**
   * Update Display4 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay4(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay4 + targetIndex, targetLen);
  }

  /**
   * Update Display4 with another Field
   *
   * @param value
   */
  public void setDisplay4(Field source) {
    replace(source, 0, source.length(), beginDisplay4, DISPLAY_4_LEN);
  }

  /**
   * Update Display4 with another Field from an offset and length
   *
   * @param value
   */
  public void setDisplay4(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay4, DISPLAY_4_LEN);
  }

  /**
   * Update Display4 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDisplay4(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDisplay4 + targetIndex, targetLen);
  }
  /**
   * Returns the value of integerDisplay
   *
   * @return integerDisplay
   */
  public char[] getIntegerDisplay() throws CFException {
    if (isIntegerDisplayModified()) {
      integerDisplay = refreshIntegerDisplay();
    }
    return integerDisplay;
  }

  /**
   * set variable integerDisplay Corresponding COBOL Variable is WS-INTEGER-DISPLAY
   *
   * @param value
   */
  public void setIntegerDisplay(char[] value) {
    integerDisplay = checkIntegerDisplayConstraints(value);
    serializeIntegerDisplay(integerDisplay);
  }

  /**
   * Update IntegerDisplay with a char[] from an offset and length
   *
   * @param value
   */
  public void setIntegerDisplay(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginIntegerDisplay, integerDisplay.length);
  }

  public void setIntegerDisplay(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginIntegerDisplay, integerDisplay.length);
  }

  /**
   * Update IntegerDisplay with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setIntegerDisplay(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginIntegerDisplay + targetIndex, targetLen);
  }

  /**
   * Update IntegerDisplay with another Field
   *
   * @param value
   */
  public void setIntegerDisplay(Field source) {
    replace(source, 0, source.length(), beginIntegerDisplay, INTEGER_DISPLAY_LEN);
  }

  /**
   * Update IntegerDisplay with another Field from an offset and length
   *
   * @param value
   */
  public void setIntegerDisplay(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginIntegerDisplay, INTEGER_DISPLAY_LEN);
  }

  /**
   * Update IntegerDisplay with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setIntegerDisplay(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginIntegerDisplay + targetIndex, targetLen);
  }
  /**
   * Returns the value of resp
   *
   * @return resp
   */
  public int getResp() throws CFException {
    return resp;
  }

  /**
   * Update Resp with the passed value Corresponding COBOL Variable is WS-RESP
   *
   * @param number
   */
  public void setResp(int number) {
    // Truncate if the number is beyond +/- Max range
    resp = checkRespMaxLimit(number);
  }

  public void setResp(long number) {
    number = checkRespMaxLimit(number); // Truncate if value is beyond +/- Max range
    setResp((int) number);
  }

  /**
   * Returns the value of resp2
   *
   * @return resp2
   */
  public int getResp2() throws CFException {
    return resp2;
  }

  /**
   * Update Resp2 with the passed value Corresponding COBOL Variable is WS-RESP2
   *
   * @param number
   */
  public void setResp2(int number) {
    // Truncate if the number is beyond +/- Max range
    resp2 = checkResp2MaxLimit(number);
  }

  public void setResp2(long number) {
    number = checkResp2MaxLimit(number); // Truncate if value is beyond +/- Max range
    setResp2((int) number);
  }

  /**
   * Returns the value of keyArrayMax
   *
   * @return keyArrayMax
   */
  public int getKeyArrayMax() throws CFException {
    return keyArrayMax;
  }

  /**
   * Update KeyArrayMax with the passed value Corresponding COBOL Variable is WS-KEY-ARRAY-MAX
   *
   * @param number
   */
  public void setKeyArrayMax(int number) {
    // Truncate if the number is beyond +/- Max range
    keyArrayMax = checkKeyArrayMaxMaxLimit(number);
  }

  public void setKeyArrayMax(long number) {
    number = checkKeyArrayMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
    setKeyArrayMax((int) number);
  }

  /**
   * Returns the value of dataArrayMax
   *
   * @return dataArrayMax
   */
  public int getDataArrayMax() throws CFException {
    return dataArrayMax;
  }

  /**
   * Update DataArrayMax with the passed value Corresponding COBOL Variable is WS-DATA-ARRAY-MAX
   *
   * @param number
   */
  public void setDataArrayMax(int number) {
    // Truncate if the number is beyond +/- Max range
    dataArrayMax = checkDataArrayMaxMaxLimit(number);
  }

  public void setDataArrayMax(long number) {
    number = checkDataArrayMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDataArrayMax((int) number);
  }

  /**
   * Returns the value of cacheKeyOverflowInd
   *
   * @return cacheKeyOverflowInd
   */
  public char[] getCacheKeyOverflowInd() throws CFException {
    return cacheKeyOverflowInd;
  }

  /**
   * set variable cacheKeyOverflowInd Corresponding COBOL Variable is WS-CACHE-KEY-OVERFLOW-IND
   *
   * @param value
   */
  public void setCacheKeyOverflowInd(char[] value) {
    value = checkCacheKeyOverflowIndConstraints(value);
    arraycopy(value, 0, cacheKeyOverflowInd, 0, value.length);
  }

  public void setCacheKeyOverflowInd(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, cacheKeyOverflowInd, 0, beginIndex + endIndex);
  }

  char[] cacheKeyOverflowYesWs88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCacheKeyOverflowYesWs()
   *
   * @return Returns true if isCacheKeyOverflowYesWs() is "Y"
   */
  public boolean isCacheKeyOverflowYesWs() throws CFException {
    return (compareChars(getCacheKeyOverflowInd(), cacheKeyOverflowYesWs88Value) == 0);
  }

  /** set values "Y" */
  public void setCacheKeyOverflowYesWsTrue() {
    setCacheKeyOverflowInd(cacheKeyOverflowYesWs88Value);
  }

  char[] cacheKeyOverflowNoWs88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCacheKeyOverflowNoWs()
   *
   * @return Returns true if isCacheKeyOverflowNoWs() is "N"
   */
  public boolean isCacheKeyOverflowNoWs() throws CFException {
    return (compareChars(getCacheKeyOverflowInd(), cacheKeyOverflowNoWs88Value) == 0);
  }

  /** set values "N" */
  public void setCacheKeyOverflowNoWsTrue() {
    setCacheKeyOverflowInd(cacheKeyOverflowNoWs88Value);
  }
  /**
   * Returns the value of cacheDataOverflowInd
   *
   * @return cacheDataOverflowInd
   */
  public char[] getCacheDataOverflowInd() throws CFException {
    return cacheDataOverflowInd;
  }

  /**
   * set variable cacheDataOverflowInd Corresponding COBOL Variable is WS-CACHE-DATA-OVERFLOW-IND
   *
   * @param value
   */
  public void setCacheDataOverflowInd(char[] value) {
    value = checkCacheDataOverflowIndConstraints(value);
    arraycopy(value, 0, cacheDataOverflowInd, 0, value.length);
  }

  public void setCacheDataOverflowInd(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, cacheDataOverflowInd, 0, beginIndex + endIndex);
  }

  char[] cacheDataOverflowYesWs88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCacheDataOverflowYesWs()
   *
   * @return Returns true if isCacheDataOverflowYesWs() is "Y"
   */
  public boolean isCacheDataOverflowYesWs() throws CFException {
    return (compareChars(getCacheDataOverflowInd(), cacheDataOverflowYesWs88Value) == 0);
  }

  /** set values "Y" */
  public void setCacheDataOverflowYesWsTrue() {
    setCacheDataOverflowInd(cacheDataOverflowYesWs88Value);
  }

  char[] cacheDataOverflowNoWs88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCacheDataOverflowNoWs()
   *
   * @return Returns true if isCacheDataOverflowNoWs() is "N"
   */
  public boolean isCacheDataOverflowNoWs() throws CFException {
    return (compareChars(getCacheDataOverflowInd(), cacheDataOverflowNoWs88Value) == 0);
  }

  /** set values "N" */
  public void setCacheDataOverflowNoWsTrue() {
    setCacheDataOverflowInd(cacheDataOverflowNoWs88Value);
  }
  /**
   * Returns the value of tally
   *
   * @return tally
   */
  public short getTally() throws CFException {
    return tally;
  }

  /**
   * Update Tally with the passed value Corresponding COBOL Variable is WS-TALLY
   *
   * @param number
   */
  public void setTally(short number) {
    // Truncate if the number is beyond +/- Max range
    tally = checkTallyMaxLimit(number);
  }

  public void setTally(int number) {
    number = checkTallyMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setTally((short) number);
  }

  public void setTally(long number) {
    number = checkTallyMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setTally((short) number);
  }

  public int getCacheKeyThreshold() throws CFException {
    if (isCacheKeyThresholdModified()) {
      cacheKeyThreshold = refreshCacheKeyThreshold();
    }
    return cacheKeyThreshold;
  }

  /**
   * Update CacheKeyThreshold with the passed value Corresponding COBOL Variable is
   * CACHE-KEY-THRESHOLD
   *
   * @param number
   */
  public void setCacheKeyThreshold(int number) {
    cacheKeyThreshold =
        checkCacheKeyThresholdMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeCacheKeyThreshold(cacheKeyThreshold);
  }

  public void setCacheKeyThreshold(long number) {
    number = checkCacheKeyThresholdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheKeyThreshold((int) number);
  }

  public int getCacheDataThreshold() throws CFException {
    if (isCacheDataThresholdModified()) {
      cacheDataThreshold = refreshCacheDataThreshold();
    }
    return cacheDataThreshold;
  }

  /**
   * Update CacheDataThreshold with the passed value Corresponding COBOL Variable is
   * CACHE-DATA-THRESHOLD
   *
   * @param number
   */
  public void setCacheDataThreshold(int number) {
    cacheDataThreshold =
        checkCacheDataThresholdMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeCacheDataThreshold(cacheDataThreshold);
  }

  public void setCacheDataThreshold(long number) {
    number = checkCacheDataThresholdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataThreshold((int) number);
  }

  public BigDecimal getPercentCalc() throws CFException {
    if (isPercentCalcModified()) {
      percentCalc = refreshPercentCalc();
    }
    return percentCalc;
  }

  public char[] getPercentCalcString() {
    return percentCalcString();
  }

  /**
   * Update PercentCalc with the passed number Corresponding COBOL Variable is WS-PERCENT-CALC
   *
   * @param number
   */
  public void setPercentCalc(BigDecimal number) {
    percentCalc = checkPercentCalcMaxLimit(number);
    serializePercentCalc(percentCalc);
  }
  /**
   * Returns the value of cacheKeyThresholdPercent
   *
   * @return cacheKeyThresholdPercent
   */
  public char[] getCacheKeyThresholdPercent() throws CFException {
    if (isCacheKeyThresholdPercentModified()) {
      cacheKeyThresholdPercent = refreshCacheKeyThresholdPercent();
    }
    return cacheKeyThresholdPercent;
  }

  /**
   * set variable cacheKeyThresholdPercent Corresponding COBOL Variable is
   * CACHE-KEY-THRESHOLD-PERCENT
   *
   * @param value
   */
  public void setCacheKeyThresholdPercent(char[] value) {
    cacheKeyThresholdPercent = checkCacheKeyThresholdPercentConstraints(value);
    serializeCacheKeyThresholdPercent(cacheKeyThresholdPercent);
  }

  /**
   * Update CacheKeyThresholdPercent with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheKeyThresholdPercent(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginCacheKeyThresholdPercent,
        cacheKeyThresholdPercent.length);
  }

  public void setCacheKeyThresholdPercent(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginCacheKeyThresholdPercent,
        cacheKeyThresholdPercent.length);
  }

  /**
   * Update CacheKeyThresholdPercent with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyThresholdPercent(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheKeyThresholdPercent + targetIndex, targetLen);
  }

  /**
   * Update CacheKeyThresholdPercent with another Field
   *
   * @param value
   */
  public void setCacheKeyThresholdPercent(Field source) {
    replace(
        source, 0, source.length(), beginCacheKeyThresholdPercent, CACHE_KEY_THRESHOLD_PERCENT_LEN);
  }

  /**
   * Update CacheKeyThresholdPercent with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheKeyThresholdPercent(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginCacheKeyThresholdPercent,
        CACHE_KEY_THRESHOLD_PERCENT_LEN);
  }

  /**
   * Update CacheKeyThresholdPercent with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheKeyThresholdPercent(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheKeyThresholdPercent + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheDataThresholdPercent
   *
   * @return cacheDataThresholdPercent
   */
  public char[] getCacheDataThresholdPercent() throws CFException {
    if (isCacheDataThresholdPercentModified()) {
      cacheDataThresholdPercent = refreshCacheDataThresholdPercent();
    }
    return cacheDataThresholdPercent;
  }

  /**
   * set variable cacheDataThresholdPercent Corresponding COBOL Variable is
   * CACHE-DATA-THRESHOLD-PERCENT
   *
   * @param value
   */
  public void setCacheDataThresholdPercent(char[] value) {
    cacheDataThresholdPercent = checkCacheDataThresholdPercentConstraints(value);
    serializeCacheDataThresholdPercent(cacheDataThresholdPercent);
  }

  /**
   * Update CacheDataThresholdPercent with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheDataThresholdPercent(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginCacheDataThresholdPercent,
        cacheDataThresholdPercent.length);
  }

  public void setCacheDataThresholdPercent(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginCacheDataThresholdPercent,
        cacheDataThresholdPercent.length);
  }

  /**
   * Update CacheDataThresholdPercent with a char[] from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheDataThresholdPercent(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheDataThresholdPercent + targetIndex, targetLen);
  }

  /**
   * Update CacheDataThresholdPercent with another Field
   *
   * @param value
   */
  public void setCacheDataThresholdPercent(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginCacheDataThresholdPercent,
        CACHE_DATA_THRESHOLD_PERCENT_LEN);
  }

  /**
   * Update CacheDataThresholdPercent with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheDataThresholdPercent(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginCacheDataThresholdPercent,
        CACHE_DATA_THRESHOLD_PERCENT_LEN);
  }

  /**
   * Update CacheDataThresholdPercent with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheDataThresholdPercent(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheDataThresholdPercent + targetIndex, targetLen);
  }

  public BigDecimal getThresholdPercent() throws CFException {
    if (isThresholdPercentModified()) {
      thresholdPercent = refreshThresholdPercent();
    }
    return thresholdPercent;
  }

  public char[] getThresholdPercentString() {
    return thresholdPercentString();
  }

  /**
   * Update ThresholdPercent with the passed number Corresponding COBOL Variable is
   * WS-THRESHOLD-PERCENT
   *
   * @param number
   */
  public void setThresholdPercent(BigDecimal number) {
    thresholdPercent = checkThresholdPercentMaxLimit(number);
    serializeThresholdPercent(thresholdPercent);
  }
  /**
   * Returns the value of thresholdPercentDis
   *
   * @return thresholdPercentDis
   */
  public char[] getThresholdPercentDis() throws CFException {
    if (isThresholdPercentDisModified()) {
      thresholdPercentDis = refreshThresholdPercentDis();
    }
    return thresholdPercentDis;
  }

  /**
   * set variable thresholdPercentDis Corresponding COBOL Variable is WS-THRESHOLD-PERCENT-DIS
   *
   * @param value
   */
  public void setThresholdPercentDis(char[] value) {
    thresholdPercentDis = checkThresholdPercentDisConstraints(value);
    serializeThresholdPercentDis(thresholdPercentDis);
  }

  /**
   * Update ThresholdPercentDis with a char[] from an offset and length
   *
   * @param value
   */
  public void setThresholdPercentDis(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginThresholdPercentDis, thresholdPercentDis.length);
  }

  public void setThresholdPercentDis(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginThresholdPercentDis, thresholdPercentDis.length);
  }

  /**
   * Update ThresholdPercentDis with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setThresholdPercentDis(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginThresholdPercentDis + targetIndex, targetLen);
  }

  /**
   * Update ThresholdPercentDis with another Field
   *
   * @param value
   */
  public void setThresholdPercentDis(Field source) {
    replace(source, 0, source.length(), beginThresholdPercentDis, THRESHOLD_PERCENT_DIS_LEN);
  }

  /**
   * Update ThresholdPercentDis with another Field from an offset and length
   *
   * @param value
   */
  public void setThresholdPercentDis(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginThresholdPercentDis, THRESHOLD_PERCENT_DIS_LEN);
  }

  /**
   * Update ThresholdPercentDis with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setThresholdPercentDis(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginThresholdPercentDis + targetIndex, targetLen);
  }
  /**
   * Returns the value of lenCacheKeyArea
   *
   * @return lenCacheKeyArea
   */
  public int getLenCacheKeyArea() throws CFException {
    return lenCacheKeyArea;
  }

  /**
   * Update LenCacheKeyArea with the passed value Corresponding COBOL Variable is LEN-CACHE-KEY-AREA
   *
   * @param number
   */
  public void setLenCacheKeyArea(int number) {
    // Truncate if the number is beyond +/- Max range
    lenCacheKeyArea = checkLenCacheKeyAreaMaxLimit(number);
  }

  public void setLenCacheKeyArea(long number) {
    number = checkLenCacheKeyAreaMaxLimit(number); // Truncate if value is beyond +/- Max range
    setLenCacheKeyArea((int) number);
  }

  /**
   * Returns the value of lenCacheDataArea
   *
   * @return lenCacheDataArea
   */
  public int getLenCacheDataArea() throws CFException {
    return lenCacheDataArea;
  }

  /**
   * Update LenCacheDataArea with the passed value Corresponding COBOL Variable is
   * LEN-CACHE-DATA-AREA
   *
   * @param number
   */
  public void setLenCacheDataArea(int number) {
    // Truncate if the number is beyond +/- Max range
    lenCacheDataArea = checkLenCacheDataAreaMaxLimit(number);
  }

  public void setLenCacheDataArea(long number) {
    number = checkLenCacheDataAreaMaxLimit(number); // Truncate if value is beyond +/- Max range
    setLenCacheDataArea((int) number);
  }

  /**
   * Returns the value of runningKeyLen
   *
   * @return runningKeyLen
   */
  public int getRunningKeyLen() throws CFException {
    if (isRunningKeyLenModified()) {
      runningKeyLen = refreshRunningKeyLen();
    }
    return runningKeyLen;
  }

  /**
   * Returns the String value of runningKeyLen
   *
   * @return runningKeyLen
   */
  public char[] getRunningKeyLenActualString() {
    String value = String.valueOf(runningKeyLen).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update RunningKeyLen with the passed value Corresponding COBOL Variable is WS-RUNNING-KEY-LEN
   *
   * @param number
   */
  public void setRunningKeyLen(int number) {
    // Truncate if the number is beyond +/- Max range
    runningKeyLen = checkRunningKeyLenMaxLimit(number);
    serializeRunningKeyLen(runningKeyLen);
  }

  public void setRunningKeyLen(long number) {
    number = checkRunningKeyLenMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRunningKeyLen((int) number);
  }

  /**
   * Update RunningKeyLen with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningKeyLen(char[] value) throws CFException {
    runningKeyLen = serializeRunningKeyLen(value);
  }
  /**
   * Update RunningKeyLen with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningKeyLenString(char[] value) throws CFException {
    setRunningKeyLen(value);
  }
  /**
   * Returns the value of runningDataLen
   *
   * @return runningDataLen
   */
  public int getRunningDataLen() throws CFException {
    if (isRunningDataLenModified()) {
      runningDataLen = refreshRunningDataLen();
    }
    return runningDataLen;
  }

  /**
   * Returns the String value of runningDataLen
   *
   * @return runningDataLen
   */
  public char[] getRunningDataLenActualString() {
    String value = String.valueOf(runningDataLen).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update RunningDataLen with the passed value Corresponding COBOL Variable is WS-RUNNING-DATA-LEN
   *
   * @param number
   */
  public void setRunningDataLen(int number) {
    // Truncate if the number is beyond +/- Max range
    runningDataLen = checkRunningDataLenMaxLimit(number);
    serializeRunningDataLen(runningDataLen);
  }

  public void setRunningDataLen(long number) {
    number = checkRunningDataLenMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRunningDataLen((int) number);
  }

  /**
   * Update RunningDataLen with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningDataLen(char[] value) throws CFException {
    runningDataLen = serializeRunningDataLen(value);
  }
  /**
   * Update RunningDataLen with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningDataLenString(char[] value) throws CFException {
    setRunningDataLen(value);
  }
  /**
   * Returns the value of runningKeyCnt
   *
   * @return runningKeyCnt
   */
  public int getRunningKeyCnt() throws CFException {
    if (isRunningKeyCntModified()) {
      runningKeyCnt = refreshRunningKeyCnt();
    }
    return runningKeyCnt;
  }

  /**
   * Returns the String value of runningKeyCnt
   *
   * @return runningKeyCnt
   */
  public char[] getRunningKeyCntActualString() {
    String value = String.valueOf(runningKeyCnt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update RunningKeyCnt with the passed value Corresponding COBOL Variable is WS-RUNNING-KEY-CNT
   *
   * @param number
   */
  public void setRunningKeyCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    runningKeyCnt = checkRunningKeyCntMaxLimit(number);
    serializeRunningKeyCnt(runningKeyCnt);
  }

  public void setRunningKeyCnt(long number) {
    number = checkRunningKeyCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRunningKeyCnt((int) number);
  }

  /**
   * Update RunningKeyCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningKeyCnt(char[] value) throws CFException {
    runningKeyCnt = serializeRunningKeyCnt(value);
  }
  /**
   * Update RunningKeyCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningKeyCntString(char[] value) throws CFException {
    setRunningKeyCnt(value);
  }
  /**
   * Returns the value of runningDataCnt
   *
   * @return runningDataCnt
   */
  public int getRunningDataCnt() throws CFException {
    if (isRunningDataCntModified()) {
      runningDataCnt = refreshRunningDataCnt();
    }
    return runningDataCnt;
  }

  /**
   * Returns the String value of runningDataCnt
   *
   * @return runningDataCnt
   */
  public char[] getRunningDataCntActualString() {
    String value = String.valueOf(runningDataCnt).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update RunningDataCnt with the passed value Corresponding COBOL Variable is WS-RUNNING-DATA-CNT
   *
   * @param number
   */
  public void setRunningDataCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    runningDataCnt = checkRunningDataCntMaxLimit(number);
    serializeRunningDataCnt(runningDataCnt);
  }

  public void setRunningDataCnt(long number) {
    number = checkRunningDataCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRunningDataCnt((int) number);
  }

  /**
   * Update RunningDataCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningDataCnt(char[] value) throws CFException {
    runningDataCnt = serializeRunningDataCnt(value);
  }
  /**
   * Update RunningDataCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setRunningDataCntString(char[] value) throws CFException {
    setRunningDataCnt(value);
  }
  /**
   * Returns the value of lenOf1KeyOccurrence
   *
   * @return lenOf1KeyOccurrence
   */
  public int getLenOf1KeyOccurrence() throws CFException {
    if (isLenOf1KeyOccurrenceModified()) {
      lenOf1KeyOccurrence = refreshLenOf1KeyOccurrence();
    }
    return lenOf1KeyOccurrence;
  }

  /**
   * Returns the String value of lenOf1KeyOccurrence
   *
   * @return lenOf1KeyOccurrence
   */
  public char[] getLenOf1KeyOccurrenceActualString() {
    String value = String.valueOf(lenOf1KeyOccurrence).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update LenOf1KeyOccurrence with the passed value Corresponding COBOL Variable is
   * WS-LEN-OF-1-KEY-OCCURRENCE
   *
   * @param number
   */
  public void setLenOf1KeyOccurrence(int number) {
    // Truncate if the number is beyond +/- Max range
    lenOf1KeyOccurrence = checkLenOf1KeyOccurrenceMaxLimit(number);
    serializeLenOf1KeyOccurrence(lenOf1KeyOccurrence);
  }

  public void setLenOf1KeyOccurrence(long number) {
    number = checkLenOf1KeyOccurrenceMaxLimit(number); // Truncate if value is beyond +/- Max range
    setLenOf1KeyOccurrence((int) number);
  }

  /**
   * Update LenOf1KeyOccurrence with the passed value
   *
   * @param value (String or char[])
   */
  public void setLenOf1KeyOccurrence(char[] value) throws CFException {
    lenOf1KeyOccurrence = serializeLenOf1KeyOccurrence(value);
  }
  /**
   * Update LenOf1KeyOccurrence with the passed value
   *
   * @param value (String or char[])
   */
  public void setLenOf1KeyOccurrenceString(char[] value) throws CFException {
    setLenOf1KeyOccurrence(value);
  }
  /**
   * Returns the value of lenOf1DataOccurrence
   *
   * @return lenOf1DataOccurrence
   */
  public int getLenOf1DataOccurrence() throws CFException {
    if (isLenOf1DataOccurrenceModified()) {
      lenOf1DataOccurrence = refreshLenOf1DataOccurrence();
    }
    return lenOf1DataOccurrence;
  }

  /**
   * Returns the String value of lenOf1DataOccurrence
   *
   * @return lenOf1DataOccurrence
   */
  public char[] getLenOf1DataOccurrenceActualString() {
    String value = String.valueOf(lenOf1DataOccurrence).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update LenOf1DataOccurrence with the passed value Corresponding COBOL Variable is
   * WS-LEN-OF-1-DATA-OCCURRENCE
   *
   * @param number
   */
  public void setLenOf1DataOccurrence(int number) {
    // Truncate if the number is beyond +/- Max range
    lenOf1DataOccurrence = checkLenOf1DataOccurrenceMaxLimit(number);
    serializeLenOf1DataOccurrence(lenOf1DataOccurrence);
  }

  public void setLenOf1DataOccurrence(long number) {
    number = checkLenOf1DataOccurrenceMaxLimit(number); // Truncate if value is beyond +/- Max range
    setLenOf1DataOccurrence((int) number);
  }

  /**
   * Update LenOf1DataOccurrence with the passed value
   *
   * @param value (String or char[])
   */
  public void setLenOf1DataOccurrence(char[] value) throws CFException {
    lenOf1DataOccurrence = serializeLenOf1DataOccurrence(value);
  }
  /**
   * Update LenOf1DataOccurrence with the passed value
   *
   * @param value (String or char[])
   */
  public void setLenOf1DataOccurrenceString(char[] value) throws CFException {
    setLenOf1DataOccurrence(value);
  }
  /**
   * Returns the value of cicsHours
   *
   * @return cicsHours
   */
  public int getCicsHours() throws CFException {
    return cicsHours;
  }

  /**
   * Update CicsHours with the passed value Corresponding COBOL Variable is CICS-HOURS
   *
   * @param number
   */
  public void setCicsHours(int number) {
    // Truncate if the number is beyond +/- Max range
    cicsHours = checkCicsHoursMaxLimit(number);
  }

  public void setCicsHours(long number) {
    number = checkCicsHoursMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCicsHours((int) number);
  }

  /**
   * Returns the value of cicsMinutes
   *
   * @return cicsMinutes
   */
  public int getCicsMinutes() throws CFException {
    return cicsMinutes;
  }

  /**
   * Update CicsMinutes with the passed value Corresponding COBOL Variable is CICS-MINUTES
   *
   * @param number
   */
  public void setCicsMinutes(int number) {
    // Truncate if the number is beyond +/- Max range
    cicsMinutes = checkCicsMinutesMaxLimit(number);
  }

  public void setCicsMinutes(long number) {
    number = checkCicsMinutesMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCicsMinutes((int) number);
  }

  /**
   * Returns the value of cicsSeconds
   *
   * @return cicsSeconds
   */
  public int getCicsSeconds() throws CFException {
    return cicsSeconds;
  }

  /**
   * Update CicsSeconds with the passed value Corresponding COBOL Variable is CICS-SECONDS
   *
   * @param number
   */
  public void setCicsSeconds(int number) {
    // Truncate if the number is beyond +/- Max range
    cicsSeconds = checkCicsSecondsMaxLimit(number);
  }

  public void setCicsSeconds(long number) {
    number = checkCicsSecondsMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCicsSeconds((int) number);
  }

  /**
   * Returns the value of cicsAbendCode
   *
   * @return cicsAbendCode
   */
  public char[] getCicsAbendCode() throws CFException {
    return cicsAbendCode;
  }

  /**
   * set variable cicsAbendCode Corresponding COBOL Variable is CICS-ABEND-CODE
   *
   * @param value
   */
  public void setCicsAbendCode(char[] value) {
    value = checkCicsAbendCodeConstraints(value);
    arraycopy(value, 0, cicsAbendCode, 0, value.length);
  }

  public void setCicsAbendCode(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, cicsAbendCode, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of dsnnrows
   *
   * @return dsnnrows
   */
  public int getDsnnrows() throws CFException {
    return dsnnrows;
  }

  /**
   * Update Dsnnrows with the passed value Corresponding COBOL Variable is DSNNROWS
   *
   * @param number
   */
  public void setDsnnrows(int number) {
    // Truncate if the number is beyond +/- Max range
    dsnnrows = checkDsnnrowsMaxLimit(number);
  }

  public void setDsnnrows(long number) {
    number = checkDsnnrowsMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDsnnrows((int) number);
  }

  public static int getWorkFieldLength() {
    return WORK_LENGTH;
  }
}
