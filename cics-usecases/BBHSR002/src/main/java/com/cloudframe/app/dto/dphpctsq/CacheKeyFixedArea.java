package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CacheKeyFixedArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyFixedArea extends CacheKeyFixedAreaSerialized {

  private int cacheKeyArrayMax;

  private int cacheKeyCnt;

  private int cacheDataAddress;

  private int cacheDataPtr;

  private char[] cacheKeyOverflowInd01 = Field.fillLowValue(1);

  /** Constructor for CacheKeyFixedArea */
  public CacheKeyFixedArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyFixedArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyFixedArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    setCacheKeyArrayMax(500);
    setCacheKeyCnt(0);
  }

  /**
   * Returns the value of cacheKeyArrayMax
   *
   * @return cacheKeyArrayMax
   */
  public int getCacheKeyArrayMax() throws CFException {
    if (isCacheKeyArrayMaxModified()) {
      cacheKeyArrayMax = refreshCacheKeyArrayMax();
    }
    return cacheKeyArrayMax;
  }

  /**
   * Update CacheKeyArrayMax with the passed value Corresponding COBOL Variable is
   * CACHE-KEY-ARRAY-MAX
   *
   * @param number
   */
  public void setCacheKeyArrayMax(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheKeyArrayMax = checkCacheKeyArrayMaxMaxLimit(number);
    serializeCacheKeyArrayMax(cacheKeyArrayMax);
  }

  public void setCacheKeyArrayMax(long number) {
    number = checkCacheKeyArrayMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheKeyArrayMax((int) number);
  }

  /**
   * Returns the value of cacheKeyCnt
   *
   * @return cacheKeyCnt
   */
  public int getCacheKeyCnt() throws CFException {
    if (isCacheKeyCntModified()) {
      cacheKeyCnt = refreshCacheKeyCnt();
    }
    return cacheKeyCnt;
  }

  /**
   * Update CacheKeyCnt with the passed value Corresponding COBOL Variable is CACHE-KEY-CNT
   *
   * @param number
   */
  public void setCacheKeyCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheKeyCnt = checkCacheKeyCntMaxLimit(number);
    serializeCacheKeyCnt(cacheKeyCnt);
  }

  public void setCacheKeyCnt(long number) {
    number = checkCacheKeyCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheKeyCnt((int) number);
  }

  /**
   * Returns the value of cacheDataAddress
   *
   * @return cacheDataAddress
   */
  public int getCacheDataAddress() throws CFException {
    if (isCacheDataAddressModified()) {
      cacheDataAddress = refreshCacheDataAddress();
    }
    return cacheDataAddress;
  }

  /**
   * Update CacheDataAddress with the passed value Corresponding COBOL Variable is
   * CACHE-DATA-ADDRESS
   *
   * @param number
   */
  public void setCacheDataAddress(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheDataAddress = checkCacheDataAddressMaxLimit(number);
    serializeCacheDataAddress(cacheDataAddress);
  }

  public void setCacheDataAddress(long number) {
    number = checkCacheDataAddressMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataAddress((int) number);
  }

  /**
   * Returns the value of cacheDataPtr
   *
   * @return cacheDataPtr
   */
  public int getCacheDataPtr() throws CFException {
    if (isCacheDataPtrModified()) {
      cacheDataPtr = refreshCacheDataPtr();
    }
    return cacheDataPtr;
  }

  /**
   * Update CacheDataPtr with the passed value Corresponding COBOL Variable is CACHE-DATA-PTR
   *
   * @param number
   */
  public void setCacheDataPtr(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheDataPtr = checkCacheDataPtrMaxLimit(number);
    serializeCacheDataPtr(cacheDataPtr);
  }

  public void setCacheDataPtr(long number) {
    number = checkCacheDataPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataPtr((int) number);
  }

  /**
   * Returns the value of cacheKeyOverflowInd01
   *
   * @return cacheKeyOverflowInd01
   */
  public char[] getCacheKeyOverflowInd01() throws CFException {
    if (isCacheKeyOverflowInd01Modified()) {
      cacheKeyOverflowInd01 = refreshCacheKeyOverflowInd01();
    }
    return cacheKeyOverflowInd01;
  }

  /**
   * set variable cacheKeyOverflowInd01 Corresponding COBOL Variable is CACHE-KEY-OVERFLOW-IND
   *
   * @param value
   */
  public void setCacheKeyOverflowInd01(char[] value) {
    cacheKeyOverflowInd01 = checkCacheKeyOverflowInd01Constraints(value);
    serializeCacheKeyOverflowInd01(cacheKeyOverflowInd01);
  }

  /**
   * Update CacheKeyOverflowInd01 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheKeyOverflowInd01(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginCacheKeyOverflowInd01,
        cacheKeyOverflowInd01.length);
  }

  public void setCacheKeyOverflowInd01(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheKeyOverflowInd01, cacheKeyOverflowInd01.length);
  }

  /**
   * Update CacheKeyOverflowInd01 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyOverflowInd01(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheKeyOverflowInd01 + targetIndex, targetLen);
  }

  /**
   * Update CacheKeyOverflowInd01 with another Field
   *
   * @param value
   */
  public void setCacheKeyOverflowInd01(Field source) {
    replace(source, 0, source.length(), beginCacheKeyOverflowInd01, CACHE_KEY_OVERFLOW_IND_01_LEN);
  }

  /**
   * Update CacheKeyOverflowInd01 with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheKeyOverflowInd01(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheKeyOverflowInd01, CACHE_KEY_OVERFLOW_IND_01_LEN);
  }

  /**
   * Update CacheKeyOverflowInd01 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheKeyOverflowInd01(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheKeyOverflowInd01 + targetIndex, targetLen);
  }

  char[] cacheKeyOverflowYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCacheKeyOverflowYes()
   *
   * @return Returns true if isCacheKeyOverflowYes() is "Y"
   */
  public boolean isCacheKeyOverflowYes() throws CFException {
    return (compareChars(getCacheKeyOverflowInd01(), cacheKeyOverflowYes88Value) == 0);
  }

  /** set values "Y" */
  public void setCacheKeyOverflowYesTrue() {
    setCacheKeyOverflowInd01(cacheKeyOverflowYes88Value);
  }

  char[] cacheKeyOverflowNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCacheKeyOverflowNo()
   *
   * @return Returns true if isCacheKeyOverflowNo() is "N"
   */
  public boolean isCacheKeyOverflowNo() throws CFException {
    return (compareChars(getCacheKeyOverflowInd01(), cacheKeyOverflowNo88Value) == 0);
  }

  /** set values "N" */
  public void setCacheKeyOverflowNoTrue() {
    setCacheKeyOverflowInd01(cacheKeyOverflowNo88Value);
  }

  public static int getCacheKeyFixedAreaFieldLength() {
    return CACHE_KEY_FIXED_AREA_LENGTH;
  }
}
