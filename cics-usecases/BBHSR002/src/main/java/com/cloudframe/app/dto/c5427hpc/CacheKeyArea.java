package com.cloudframe.app.dto.c5427hpc;

/**
 * The class CacheKeyArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyArea extends CacheKeyAreaSerialized {

  private CacheKeyAreaPartial cacheKeyAreaPartial = new CacheKeyAreaPartial();

  private char[] cacheSortCol1 = Field.fillLowValue(2);

  /** Constructor for CacheKeyArea */
  public CacheKeyArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    cacheKeyAreaPartial.setParent(this, getStartOffset() + 0);
  }

  /**
   * Returns the value of cacheKeyAreaPartial
   *
   * @return cacheKeyAreaPartial
   */
  public CacheKeyAreaPartial getCacheKeyAreaPartial() {
    return cacheKeyAreaPartial;
  }
  /**
   * Update CacheKeyAreaPartial with the passed value Corresponding COBOL Variable is
   * CACHE-KEY-AREA-PARTIAL
   *
   * @param value
   */
  public void setCacheKeyAreaPartial(char[] value) {
    cacheKeyAreaPartial.setString(value);
  }

  /**
   * Update CacheKeyAreaPartial with a String from an offset and length
   *
   * @param value
   */
  public void setCacheKeyAreaPartial(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, cacheKeyAreaPartial.begin, cacheKeyAreaPartial.length());
  }

  /**
   * Update CacheKeyAreaPartial with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyAreaPartial(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyAreaPartial.begin + targetIndex, targetLen);
  }

  /**
   * Update CacheKeyAreaPartial with another Field
   *
   * @param value
   */
  public void setCacheKeyAreaPartial(Field source) {
    replace(source, 0, source.length(), cacheKeyAreaPartial.begin, cacheKeyAreaPartial.length());
  }

  /**
   * Update CacheKeyAreaPartial with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheKeyAreaPartial(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, cacheKeyAreaPartial.begin, cacheKeyAreaPartial.length());
  }

  /**
   * Update CacheKeyAreaPartial with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyAreaPartial(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyAreaPartial.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheSortCol1
   *
   * @return cacheSortCol1
   */
  public char[] getCacheSortCol1() throws CFException {
    if (isCacheSortCol1Modified()) {
      cacheSortCol1 = refreshCacheSortCol1();
    }
    return cacheSortCol1;
  }

  /**
   * set variable cacheSortCol1 Corresponding COBOL Variable is CACHE-SORT-COL1
   *
   * @param value
   */
  public void setCacheSortCol1(char[] value) {
    cacheSortCol1 = checkCacheSortCol1Constraints(value);
    serializeCacheSortCol1(cacheSortCol1);
  }

  /**
   * Update CacheSortCol1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheSortCol1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheSortCol1, cacheSortCol1.length);
  }

  public void setCacheSortCol1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSortCol1, cacheSortCol1.length);
  }

  /**
   * Update CacheSortCol1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSortCol1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSortCol1 + targetIndex, targetLen);
  }

  /**
   * Update CacheSortCol1 with another Field
   *
   * @param value
   */
  public void setCacheSortCol1(Field source) {
    replace(source, 0, source.length(), beginCacheSortCol1, CACHE_SORT_COL_1_LEN);
  }

  /**
   * Update CacheSortCol1 with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheSortCol1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSortCol1, CACHE_SORT_COL_1_LEN);
  }

  /**
   * Update CacheSortCol1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSortCol1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSortCol1 + targetIndex, targetLen);
  }

  public static int getCacheKeyAreaFieldLength() {
    return CACHE_KEY_AREA_LENGTH;
  }
}
