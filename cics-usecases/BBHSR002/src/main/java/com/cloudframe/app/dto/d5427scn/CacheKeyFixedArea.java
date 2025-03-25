package com.cloudframe.app.dto.d5427scn;

/**
 * The class CacheKeyFixedArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyFixedArea extends CacheKeyFixedAreaSerialized {

  private int cacheKeyArrayMax;

  private int cacheKeyCnt;

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

  public static int getCacheKeyFixedAreaFieldLength() {
    return CACHE_KEY_FIXED_AREA_LENGTH;
  }
}
