package com.cloudframe.app.dto.c5427hpc;

/**
 * The class CacheDataFixedArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class CacheDataFixedArea extends CacheDataFixedAreaSerialized {

  private int cacheDataArrayMax;

  private int cacheDataCnt;

  private char[] cacheDataOverflowInd = Field.fillLowValue(1);

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
   * Returns the value of cacheDataOverflowInd
   *
   * @return cacheDataOverflowInd
   */
  public char[] getCacheDataOverflowInd() throws CFException {
    if (isCacheDataOverflowIndModified()) {
      cacheDataOverflowInd = refreshCacheDataOverflowInd();
    }
    return cacheDataOverflowInd;
  }

  /**
   * set variable cacheDataOverflowInd Corresponding COBOL Variable is CACHE-DATA-OVERFLOW-IND
   *
   * @param value
   */
  public void setCacheDataOverflowInd(char[] value) {
    cacheDataOverflowInd = checkCacheDataOverflowIndConstraints(value);
    serializeCacheDataOverflowInd(cacheDataOverflowInd);
  }

  /**
   * Update CacheDataOverflowInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheDataOverflowInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCacheDataOverflowInd, cacheDataOverflowInd.length);
  }

  public void setCacheDataOverflowInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheDataOverflowInd, cacheDataOverflowInd.length);
  }

  /**
   * Update CacheDataOverflowInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheDataOverflowInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheDataOverflowInd + targetIndex, targetLen);
  }

  /**
   * Update CacheDataOverflowInd with another Field
   *
   * @param value
   */
  public void setCacheDataOverflowInd(Field source) {
    replace(source, 0, source.length(), beginCacheDataOverflowInd, CACHE_DATA_OVERFLOW_IND_LEN);
  }

  /**
   * Update CacheDataOverflowInd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheDataOverflowInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheDataOverflowInd, CACHE_DATA_OVERFLOW_IND_LEN);
  }

  /**
   * Update CacheDataOverflowInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheDataOverflowInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheDataOverflowInd + targetIndex, targetLen);
  }

  char[] cacheDataOverflowYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCacheDataOverflowYes()
   *
   * @return Returns true if isCacheDataOverflowYes() is "Y"
   */
  public boolean isCacheDataOverflowYes() throws CFException {
    return (compareChars(getCacheDataOverflowInd(), cacheDataOverflowYes88Value) == 0);
  }

  /** set values "Y" */
  public void setCacheDataOverflowYesTrue() {
    setCacheDataOverflowInd(cacheDataOverflowYes88Value);
  }

  char[] cacheDataOverflowNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCacheDataOverflowNo()
   *
   * @return Returns true if isCacheDataOverflowNo() is "N"
   */
  public boolean isCacheDataOverflowNo() throws CFException {
    return (compareChars(getCacheDataOverflowInd(), cacheDataOverflowNo88Value) == 0);
  }

  /** set values "N" */
  public void setCacheDataOverflowNoTrue() {
    setCacheDataOverflowInd(cacheDataOverflowNo88Value);
  }

  public static int getCacheDataFixedAreaFieldLength() {
    return CACHE_DATA_FIXED_AREA_LENGTH;
  }
}
