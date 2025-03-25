package com.cloudframe.app.dto.d5427scn;

/**
 * The class CacheKeyArray is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyArray extends CacheKeyArraySerialized {

  private CacheKeyArea cacheKeyArea = new CacheKeyArea();

  private char[] cacheEffDt = Field.fillLowValue(10);

  private char[] cacheCancDt = Field.fillLowValue(10);

  private char[] cacheSrvcCdNbr = Field.fillLowValue(3);

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
   * Returns the value of cacheEffDt
   *
   * @return cacheEffDt
   */
  public char[] getCacheEffDt() throws CFException {
    if (isCacheEffDtModified()) {
      cacheEffDt = refreshCacheEffDt();
    }
    return cacheEffDt;
  }

  /**
   * set variable cacheEffDt Corresponding COBOL Variable is CACHE-EFF-DT
   *
   * @param value
   */
  public void setCacheEffDt(char[] value) {
    cacheEffDt = checkCacheEffDtConstraints(value);
    serializeCacheEffDt(cacheEffDt);
  }

  /**
   * Update CacheEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheEffDt, cacheEffDt.length);
  }

  public void setCacheEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheEffDt, cacheEffDt.length);
  }

  /**
   * Update CacheEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheEffDt + targetIndex, targetLen);
  }

  /**
   * Update CacheEffDt with another Field
   *
   * @param value
   */
  public void setCacheEffDt(Field source) {
    replace(source, 0, source.length(), beginCacheEffDt, CACHE_EFF_DT_LEN);
  }

  /**
   * Update CacheEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheEffDt, CACHE_EFF_DT_LEN);
  }

  /**
   * Update CacheEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheCancDt
   *
   * @return cacheCancDt
   */
  public char[] getCacheCancDt() throws CFException {
    if (isCacheCancDtModified()) {
      cacheCancDt = refreshCacheCancDt();
    }
    return cacheCancDt;
  }

  /**
   * set variable cacheCancDt Corresponding COBOL Variable is CACHE-CANC-DT
   *
   * @param value
   */
  public void setCacheCancDt(char[] value) {
    cacheCancDt = checkCacheCancDtConstraints(value);
    serializeCacheCancDt(cacheCancDt);
  }

  /**
   * Update CacheCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheCancDt, cacheCancDt.length);
  }

  public void setCacheCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCancDt, cacheCancDt.length);
  }

  /**
   * Update CacheCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCancDt + targetIndex, targetLen);
  }

  /**
   * Update CacheCancDt with another Field
   *
   * @param value
   */
  public void setCacheCancDt(Field source) {
    replace(source, 0, source.length(), beginCacheCancDt, CACHE_CANC_DT_LEN);
  }

  /**
   * Update CacheCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCancDt, CACHE_CANC_DT_LEN);
  }

  /**
   * Update CacheCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheSrvcCdNbr
   *
   * @return cacheSrvcCdNbr
   */
  public char[] getCacheSrvcCdNbr() throws CFException {
    if (isCacheSrvcCdNbrModified()) {
      cacheSrvcCdNbr = refreshCacheSrvcCdNbr();
    }
    return cacheSrvcCdNbr;
  }

  /**
   * set variable cacheSrvcCdNbr Corresponding COBOL Variable is CACHE-SRVC-CD-NBR
   *
   * @param value
   */
  public void setCacheSrvcCdNbr(char[] value) {
    cacheSrvcCdNbr = checkCacheSrvcCdNbrConstraints(value);
    serializeCacheSrvcCdNbr(cacheSrvcCdNbr);
  }

  /**
   * Update CacheSrvcCdNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCdNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheSrvcCdNbr, cacheSrvcCdNbr.length);
  }

  public void setCacheSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCdNbr, cacheSrvcCdNbr.length);
  }

  /**
   * Update CacheSrvcCdNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCdNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCdNbr + targetIndex, targetLen);
  }

  /**
   * Update CacheSrvcCdNbr with another Field
   *
   * @param value
   */
  public void setCacheSrvcCdNbr(Field source) {
    replace(source, 0, source.length(), beginCacheSrvcCdNbr, CACHE_SRVC_CD_NBR_LEN);
  }

  /**
   * Update CacheSrvcCdNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCdNbr, CACHE_SRVC_CD_NBR_LEN);
  }

  /**
   * Update CacheSrvcCdNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCdNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCdNbr + targetIndex, targetLen);
  }

  public static int getCacheKeyArrayFieldLength() {
    return CACHE_KEY_ARRAY_LENGTH;
  }
}
