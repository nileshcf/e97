package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CacheKeyArray is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyArray extends CacheKeyArraySerialized {

  private CacheKeyArea cacheKeyArea = new CacheKeyArea();

  private int cacheDataOffset;

  private int cacheDataNbrOfEntries;

  /** Constructor for CacheKeyArray */
  public CacheKeyArray() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyArray. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyArray(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    cacheKeyArea.setParent(this, getStartOffset() + 0);
  }

  /**
   * Returns the value of cacheKeyArea
   *
   * @return cacheKeyArea
   */
  public CacheKeyArea getCacheKeyArea() {
    return cacheKeyArea;
  }
  /**
   * Update CacheKeyArea with the passed value Corresponding COBOL Variable is CACHE-KEY-AREA
   *
   * @param value
   */
  public void setCacheKeyArea(char[] value) {
    cacheKeyArea.setString(value);
  }

  /**
   * Update CacheKeyArea with a String from an offset and length
   *
   * @param value
   */
  public void setCacheKeyArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyArea.begin, cacheKeyArea.length());
  }

  /**
   * Update CacheKeyArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyArea.begin + targetIndex, targetLen);
  }

  /**
   * Update CacheKeyArea with another Field
   *
   * @param value
   */
  public void setCacheKeyArea(Field source) {
    replace(source, 0, source.length(), cacheKeyArea.begin, cacheKeyArea.length());
  }

  /**
   * Update CacheKeyArea with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheKeyArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyArea.begin, cacheKeyArea.length());
  }

  /**
   * Update CacheKeyArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheDataOffset
   *
   * @return cacheDataOffset
   */
  public int getCacheDataOffset() throws CFException {
    if (isCacheDataOffsetModified()) {
      cacheDataOffset = refreshCacheDataOffset();
    }
    return cacheDataOffset;
  }

  /**
   * Update CacheDataOffset with the passed value Corresponding COBOL Variable is CACHE-DATA-OFFSET
   *
   * @param number
   */
  public void setCacheDataOffset(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheDataOffset = checkCacheDataOffsetMaxLimit(number);
    serializeCacheDataOffset(cacheDataOffset);
  }

  public void setCacheDataOffset(long number) {
    number = checkCacheDataOffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataOffset((int) number);
  }

  /**
   * Returns the value of cacheDataNbrOfEntries
   *
   * @return cacheDataNbrOfEntries
   */
  public int getCacheDataNbrOfEntries() throws CFException {
    if (isCacheDataNbrOfEntriesModified()) {
      cacheDataNbrOfEntries = refreshCacheDataNbrOfEntries();
    }
    return cacheDataNbrOfEntries;
  }

  /**
   * Update CacheDataNbrOfEntries with the passed value Corresponding COBOL Variable is
   * CACHE-DATA-NBR-OF-ENTRIES
   *
   * @param number
   */
  public void setCacheDataNbrOfEntries(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheDataNbrOfEntries = checkCacheDataNbrOfEntriesMaxLimit(number);
    serializeCacheDataNbrOfEntries(cacheDataNbrOfEntries);
  }

  public void setCacheDataNbrOfEntries(long number) {
    number =
        checkCacheDataNbrOfEntriesMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataNbrOfEntries((int) number);
  }

  public static int getCacheKeyArrayFieldLength() {
    return CACHE_KEY_ARRAY_LENGTH;
  }
}
