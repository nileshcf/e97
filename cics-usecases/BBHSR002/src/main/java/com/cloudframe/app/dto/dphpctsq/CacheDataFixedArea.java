package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CacheDataFixedArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class CacheDataFixedArea extends CacheDataFixedAreaSerialized {

  private int cacheDataArrayMax;

  private int cacheDataCnt;

  private char[] cacheDataOverflowInd01 = Field.fillLowValue(1);

  /** Constructor for CacheDataFixedArea */
  public CacheDataFixedArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheDataFixedArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheDataFixedArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    setCacheDataArrayMax(2000);
    setCacheDataCnt(0);
  }

  /**
   * Returns the value of cacheDataArrayMax
   *
   * @return cacheDataArrayMax
   */
  public int getCacheDataArrayMax() throws CFException {
    if (isCacheDataArrayMaxModified()) {
      cacheDataArrayMax = refreshCacheDataArrayMax();
    }
    return cacheDataArrayMax;
  }

  /**
   * Update CacheDataArrayMax with the passed value Corresponding COBOL Variable is
   * CACHE-DATA-ARRAY-MAX
   *
   * @param number
   */
  public void setCacheDataArrayMax(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheDataArrayMax = checkCacheDataArrayMaxMaxLimit(number);
    serializeCacheDataArrayMax(cacheDataArrayMax);
  }

  public void setCacheDataArrayMax(long number) {
    number = checkCacheDataArrayMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataArrayMax((int) number);
  }

  /**
   * Returns the value of cacheDataCnt
   *
   * @return cacheDataCnt
   */
  public int getCacheDataCnt() throws CFException {
    if (isCacheDataCntModified()) {
      cacheDataCnt = refreshCacheDataCnt();
    }
    return cacheDataCnt;
  }

  /**
   * Update CacheDataCnt with the passed value Corresponding COBOL Variable is CACHE-DATA-CNT
   *
   * @param number
   */
  public void setCacheDataCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheDataCnt = checkCacheDataCntMaxLimit(number);
    serializeCacheDataCnt(cacheDataCnt);
  }

  public void setCacheDataCnt(long number) {
    number = checkCacheDataCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataCnt((int) number);
  }

  /**
   * Returns the value of cacheDataOverflowInd01
   *
   * @return cacheDataOverflowInd01
   */
  public char[] getCacheDataOverflowInd01() throws CFException {
    if (isCacheDataOverflowInd01Modified()) {
      cacheDataOverflowInd01 = refreshCacheDataOverflowInd01();
    }
    return cacheDataOverflowInd01;
  }

  /**
   * set variable cacheDataOverflowInd01 Corresponding COBOL Variable is CACHE-DATA-OVERFLOW-IND
   *
   * @param value
   */
  public void setCacheDataOverflowInd01(char[] value) {
    cacheDataOverflowInd01 = checkCacheDataOverflowInd01Constraints(value);
    serializeCacheDataOverflowInd01(cacheDataOverflowInd01);
  }

  /**
   * Update CacheDataOverflowInd01 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheDataOverflowInd01(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginCacheDataOverflowInd01,
        cacheDataOverflowInd01.length);
  }

  public void setCacheDataOverflowInd01(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheDataOverflowInd01, cacheDataOverflowInd01.length);
  }

  /**
   * Update CacheDataOverflowInd01 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheDataOverflowInd01(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheDataOverflowInd01 + targetIndex, targetLen);
  }

  /**
   * Update CacheDataOverflowInd01 with another Field
   *
   * @param value
   */
  public void setCacheDataOverflowInd01(Field source) {
    replace(
        source, 0, source.length(), beginCacheDataOverflowInd01, CACHE_DATA_OVERFLOW_IND_01_LEN);
  }

  /**
   * Update CacheDataOverflowInd01 with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheDataOverflowInd01(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginCacheDataOverflowInd01,
        CACHE_DATA_OVERFLOW_IND_01_LEN);
  }

  /**
   * Update CacheDataOverflowInd01 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheDataOverflowInd01(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheDataOverflowInd01 + targetIndex, targetLen);
  }

  char[] cacheDataOverflowYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCacheDataOverflowYes()
   *
   * @return Returns true if isCacheDataOverflowYes() is "Y"
   */
  public boolean isCacheDataOverflowYes() throws CFException {
    return (compareChars(getCacheDataOverflowInd01(), cacheDataOverflowYes88Value) == 0);
  }

  /** set values "Y" */
  public void setCacheDataOverflowYesTrue() {
    setCacheDataOverflowInd01(cacheDataOverflowYes88Value);
  }

  char[] cacheDataOverflowNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCacheDataOverflowNo()
   *
   * @return Returns true if isCacheDataOverflowNo() is "N"
   */
  public boolean isCacheDataOverflowNo() throws CFException {
    return (compareChars(getCacheDataOverflowInd01(), cacheDataOverflowNo88Value) == 0);
  }

  /** set values "N" */
  public void setCacheDataOverflowNoTrue() {
    setCacheDataOverflowInd01(cacheDataOverflowNo88Value);
  }

  public static int getCacheDataFixedAreaFieldLength() {
    return CACHE_DATA_FIXED_AREA_LENGTH;
  }
}
