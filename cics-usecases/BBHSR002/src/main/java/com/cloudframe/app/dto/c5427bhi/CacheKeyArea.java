package com.cloudframe.app.dto.c5427bhi;

/**
 * The class CacheKeyArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyArea extends CacheKeyAreaSerialized {

  private char[] cacheSlotTblId = Field.fillLowValue(6);

  private char[] cacheHipaaCd = Field.fillLowValue(2);

  private char[] cacheHipaaVerNbr = Field.fillLowValue(1);

  private char[] cacheStsCd = Field.fillLowValue(1);

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
   * Returns the value of cacheSlotTblId
   *
   * @return cacheSlotTblId
   */
  public char[] getCacheSlotTblId() throws CFException {
    if (isCacheSlotTblIdModified()) {
      cacheSlotTblId = refreshCacheSlotTblId();
    }
    return cacheSlotTblId;
  }

  /**
   * set variable cacheSlotTblId Corresponding COBOL Variable is CACHE-SLOT-TBL-ID
   *
   * @param value
   */
  public void setCacheSlotTblId(char[] value) {
    cacheSlotTblId = checkCacheSlotTblIdConstraints(value);
    serializeCacheSlotTblId(cacheSlotTblId);
  }

  /**
   * Update CacheSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheSlotTblId, cacheSlotTblId.length);
  }

  public void setCacheSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSlotTblId, cacheSlotTblId.length);
  }

  /**
   * Update CacheSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update CacheSlotTblId with another Field
   *
   * @param value
   */
  public void setCacheSlotTblId(Field source) {
    replace(source, 0, source.length(), beginCacheSlotTblId, CACHE_SLOT_TBL_ID_LEN);
  }

  /**
   * Update CacheSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSlotTblId, CACHE_SLOT_TBL_ID_LEN);
  }

  /**
   * Update CacheSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheHipaaCd
   *
   * @return cacheHipaaCd
   */
  public char[] getCacheHipaaCd() throws CFException {
    if (isCacheHipaaCdModified()) {
      cacheHipaaCd = refreshCacheHipaaCd();
    }
    return cacheHipaaCd;
  }

  /**
   * set variable cacheHipaaCd Corresponding COBOL Variable is CACHE-HIPAA-CD
   *
   * @param value
   */
  public void setCacheHipaaCd(char[] value) {
    cacheHipaaCd = checkCacheHipaaCdConstraints(value);
    serializeCacheHipaaCd(cacheHipaaCd);
  }

  /**
   * Update CacheHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheHipaaCd, cacheHipaaCd.length);
  }

  public void setCacheHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCd, cacheHipaaCd.length);
  }

  /**
   * Update CacheHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update CacheHipaaCd with another Field
   *
   * @param value
   */
  public void setCacheHipaaCd(Field source) {
    replace(source, 0, source.length(), beginCacheHipaaCd, CACHE_HIPAA_CD_LEN);
  }

  /**
   * Update CacheHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCd, CACHE_HIPAA_CD_LEN);
  }

  /**
   * Update CacheHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheHipaaVerNbr
   *
   * @return cacheHipaaVerNbr
   */
  public char[] getCacheHipaaVerNbr() throws CFException {
    if (isCacheHipaaVerNbrModified()) {
      cacheHipaaVerNbr = refreshCacheHipaaVerNbr();
    }
    return cacheHipaaVerNbr;
  }

  /**
   * set variable cacheHipaaVerNbr Corresponding COBOL Variable is CACHE-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setCacheHipaaVerNbr(char[] value) {
    cacheHipaaVerNbr = checkCacheHipaaVerNbrConstraints(value);
    serializeCacheHipaaVerNbr(cacheHipaaVerNbr);
  }

  /**
   * Update CacheHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheHipaaVerNbr, cacheHipaaVerNbr.length);
  }

  public void setCacheHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaVerNbr, cacheHipaaVerNbr.length);
  }

  /**
   * Update CacheHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update CacheHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setCacheHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginCacheHipaaVerNbr, CACHE_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CacheHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaVerNbr, CACHE_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CacheHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheStsCd
   *
   * @return cacheStsCd
   */
  public char[] getCacheStsCd() throws CFException {
    if (isCacheStsCdModified()) {
      cacheStsCd = refreshCacheStsCd();
    }
    return cacheStsCd;
  }

  /**
   * set variable cacheStsCd Corresponding COBOL Variable is CACHE-STS-CD
   *
   * @param value
   */
  public void setCacheStsCd(char[] value) {
    cacheStsCd = checkCacheStsCdConstraints(value);
    serializeCacheStsCd(cacheStsCd);
  }

  /**
   * Update CacheStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheStsCd, cacheStsCd.length);
  }

  public void setCacheStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheStsCd, cacheStsCd.length);
  }

  /**
   * Update CacheStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheStsCd + targetIndex, targetLen);
  }

  /**
   * Update CacheStsCd with another Field
   *
   * @param value
   */
  public void setCacheStsCd(Field source) {
    replace(source, 0, source.length(), beginCacheStsCd, CACHE_STS_CD_LEN);
  }

  /**
   * Update CacheStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheStsCd, CACHE_STS_CD_LEN);
  }

  /**
   * Update CacheStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheStsCd + targetIndex, targetLen);
  }

  public static int getCacheKeyAreaFieldLength() {
    return CACHE_KEY_AREA_LENGTH;
  }
}
