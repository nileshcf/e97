package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CachePointerGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class CachePointerGroup extends CachePointerGroupSerialized {

  private int cachePointer;

  private int cacheBin;

  /** Constructor for CachePointerGroup */
  public CachePointerGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of cachePointer
   *
   * @return cachePointer
   */
  public int getCachePointer() throws CFException {
    if (isCachePointerModified()) {
      cachePointer = refreshCachePointer();
    }
    return cachePointer;
  }

  /**
   * Update CachePointer with the passed value Corresponding COBOL Variable is WS-CACHE-POINTER
   *
   * @param number
   */
  public void setCachePointer(int number) {
    // Truncate if the number is beyond +/- Max range
    cachePointer = checkCachePointerMaxLimit(number);
    serializeCachePointer(cachePointer);
  }

  public void setCachePointer(long number) {
    number = checkCachePointerMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCachePointer((int) number);
  }

  /**
   * Returns the value of cacheBin
   *
   * @return cacheBin
   */
  public int getCacheBin() throws CFException {
    if (isCacheBinModified()) {
      cacheBin = refreshCacheBin();
    }
    return cacheBin;
  }

  /**
   * Update CacheBin with the passed value Corresponding COBOL Variable is WS-CACHE-BIN
   *
   * @param number
   */
  public void setCacheBin(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheBin = checkCacheBinMaxLimit(number);
    serializeCacheBin(cacheBin);
  }

  public void setCacheBin(long number) {
    number = checkCacheBinMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheBin((int) number);
  }

  public static int getCachePointerGroupFieldLength() {
    return CACHE_POINTER_GROUP_LENGTH;
  }
}
