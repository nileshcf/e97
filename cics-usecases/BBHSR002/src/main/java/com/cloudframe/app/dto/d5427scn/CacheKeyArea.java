package com.cloudframe.app.dto.d5427scn;

/**
 * The class CacheKeyArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyArea extends CacheKeyAreaSerialized {

  private char[] cacheSrvcCd = Field.fillLowValue(6);

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

  /**
   * Returns the value of cacheSrvcCd
   *
   * @return cacheSrvcCd
   */
  public char[] getCacheSrvcCd() throws CFException {
    if (isCacheSrvcCdModified()) {
      cacheSrvcCd = refreshCacheSrvcCd();
    }
    return cacheSrvcCd;
  }

  /**
   * set variable cacheSrvcCd Corresponding COBOL Variable is CACHE-SRVC-CD
   *
   * @param value
   */
  public void setCacheSrvcCd(char[] value) {
    cacheSrvcCd = checkCacheSrvcCdConstraints(value);
    serializeCacheSrvcCd(cacheSrvcCd);
  }

  /**
   * Update CacheSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheSrvcCd, cacheSrvcCd.length);
  }

  public void setCacheSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCd, cacheSrvcCd.length);
  }

  /**
   * Update CacheSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update CacheSrvcCd with another Field
   *
   * @param value
   */
  public void setCacheSrvcCd(Field source) {
    replace(source, 0, source.length(), beginCacheSrvcCd, CACHE_SRVC_CD_LEN);
  }

  /**
   * Update CacheSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCd, CACHE_SRVC_CD_LEN);
  }

  /**
   * Update CacheSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSrvcCd + targetIndex, targetLen);
  }

  public static int getCacheKeyAreaFieldLength() {
    return CACHE_KEY_AREA_LENGTH;
  }
}
