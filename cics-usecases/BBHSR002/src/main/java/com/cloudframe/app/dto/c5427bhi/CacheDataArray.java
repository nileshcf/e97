package com.cloudframe.app.dto.c5427bhi;

/**
 * The class CacheDataArray is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class CacheDataArray extends CacheDataArraySerialized {

  private char[] cacheNtwkTypCd = Field.fillLowValue(1);

  private char[] cacheEffDt = Field.fillLowValue(10);

  private char[] cacheCancDt = Field.fillLowValue(10);

  private char[] cacheSrvcCd = Field.fillLowValue(6);

  private char[] cachePlOfSrvcCd = Field.fillLowValue(2);

  private char[] cacheCausCd = Field.fillLowValue(1);

  private char[] cacheBenLvlCd = Field.fillLowValue(1);

  private char[] cacheInNtwkClssCd = Field.fillLowValue(1);

  private char[] cacheTier1NtwkClssCd = Field.fillLowValue(1);

  private char[] cacheProcCdRngBegnVal = Field.fillLowValue(7);

  private char[] cacheProcCdRngEndVal = Field.fillLowValue(7);

  private char[] cacheProcCdRngTypVal = Field.fillLowValue(1);

  private char[] cacheProvOrgTypCd = Field.fillLowValue(3);

  private char[] cacheHipaaCommtTxt = Field.fillLowValue(300);

  /** Constructor for CacheDataArray */
  public CacheDataArray() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheDataArray. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheDataArray(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of cacheNtwkTypCd
   *
   * @return cacheNtwkTypCd
   */
  public char[] getCacheNtwkTypCd() throws CFException {
    if (isCacheNtwkTypCdModified()) {
      cacheNtwkTypCd = refreshCacheNtwkTypCd();
    }
    return cacheNtwkTypCd;
  }

  /**
   * set variable cacheNtwkTypCd Corresponding COBOL Variable is CACHE-NTWK-TYP-CD
   *
   * @param value
   */
  public void setCacheNtwkTypCd(char[] value) {
    cacheNtwkTypCd = checkCacheNtwkTypCdConstraints(value);
    serializeCacheNtwkTypCd(cacheNtwkTypCd);
  }

  /**
   * Update CacheNtwkTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheNtwkTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheNtwkTypCd, cacheNtwkTypCd.length);
  }

  public void setCacheNtwkTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheNtwkTypCd, cacheNtwkTypCd.length);
  }

  /**
   * Update CacheNtwkTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheNtwkTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheNtwkTypCd + targetIndex, targetLen);
  }

  /**
   * Update CacheNtwkTypCd with another Field
   *
   * @param value
   */
  public void setCacheNtwkTypCd(Field source) {
    replace(source, 0, source.length(), beginCacheNtwkTypCd, CACHE_NTWK_TYP_CD_LEN);
  }

  /**
   * Update CacheNtwkTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheNtwkTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheNtwkTypCd, CACHE_NTWK_TYP_CD_LEN);
  }

  /**
   * Update CacheNtwkTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheNtwkTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheNtwkTypCd + targetIndex, targetLen);
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
  /**
   * Returns the value of cachePlOfSrvcCd
   *
   * @return cachePlOfSrvcCd
   */
  public char[] getCachePlOfSrvcCd() throws CFException {
    if (isCachePlOfSrvcCdModified()) {
      cachePlOfSrvcCd = refreshCachePlOfSrvcCd();
    }
    return cachePlOfSrvcCd;
  }

  /**
   * set variable cachePlOfSrvcCd Corresponding COBOL Variable is CACHE-PL-OF-SRVC-CD
   *
   * @param value
   */
  public void setCachePlOfSrvcCd(char[] value) {
    cachePlOfSrvcCd = checkCachePlOfSrvcCdConstraints(value);
    serializeCachePlOfSrvcCd(cachePlOfSrvcCd);
  }

  /**
   * Update CachePlOfSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCachePlOfSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCachePlOfSrvcCd, cachePlOfSrvcCd.length);
  }

  public void setCachePlOfSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCachePlOfSrvcCd, cachePlOfSrvcCd.length);
  }

  /**
   * Update CachePlOfSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCachePlOfSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCachePlOfSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update CachePlOfSrvcCd with another Field
   *
   * @param value
   */
  public void setCachePlOfSrvcCd(Field source) {
    replace(source, 0, source.length(), beginCachePlOfSrvcCd, CACHE_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update CachePlOfSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCachePlOfSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCachePlOfSrvcCd, CACHE_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update CachePlOfSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCachePlOfSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCachePlOfSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheCausCd
   *
   * @return cacheCausCd
   */
  public char[] getCacheCausCd() throws CFException {
    if (isCacheCausCdModified()) {
      cacheCausCd = refreshCacheCausCd();
    }
    return cacheCausCd;
  }

  /**
   * set variable cacheCausCd Corresponding COBOL Variable is CACHE-CAUS-CD
   *
   * @param value
   */
  public void setCacheCausCd(char[] value) {
    cacheCausCd = checkCacheCausCdConstraints(value);
    serializeCacheCausCd(cacheCausCd);
  }

  /**
   * Update CacheCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheCausCd, cacheCausCd.length);
  }

  public void setCacheCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCausCd, cacheCausCd.length);
  }

  /**
   * Update CacheCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCausCd + targetIndex, targetLen);
  }

  /**
   * Update CacheCausCd with another Field
   *
   * @param value
   */
  public void setCacheCausCd(Field source) {
    replace(source, 0, source.length(), beginCacheCausCd, CACHE_CAUS_CD_LEN);
  }

  /**
   * Update CacheCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCausCd, CACHE_CAUS_CD_LEN);
  }

  /**
   * Update CacheCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheBenLvlCd
   *
   * @return cacheBenLvlCd
   */
  public char[] getCacheBenLvlCd() throws CFException {
    if (isCacheBenLvlCdModified()) {
      cacheBenLvlCd = refreshCacheBenLvlCd();
    }
    return cacheBenLvlCd;
  }

  /**
   * set variable cacheBenLvlCd Corresponding COBOL Variable is CACHE-BEN-LVL-CD
   *
   * @param value
   */
  public void setCacheBenLvlCd(char[] value) {
    cacheBenLvlCd = checkCacheBenLvlCdConstraints(value);
    serializeCacheBenLvlCd(cacheBenLvlCd);
  }

  /**
   * Update CacheBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheBenLvlCd, cacheBenLvlCd.length);
  }

  public void setCacheBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheBenLvlCd, cacheBenLvlCd.length);
  }

  /**
   * Update CacheBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update CacheBenLvlCd with another Field
   *
   * @param value
   */
  public void setCacheBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginCacheBenLvlCd, CACHE_BEN_LVL_CD_LEN);
  }

  /**
   * Update CacheBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheBenLvlCd, CACHE_BEN_LVL_CD_LEN);
  }

  /**
   * Update CacheBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheInNtwkClssCd
   *
   * @return cacheInNtwkClssCd
   */
  public char[] getCacheInNtwkClssCd() throws CFException {
    if (isCacheInNtwkClssCdModified()) {
      cacheInNtwkClssCd = refreshCacheInNtwkClssCd();
    }
    return cacheInNtwkClssCd;
  }

  /**
   * set variable cacheInNtwkClssCd Corresponding COBOL Variable is CACHE-IN-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setCacheInNtwkClssCd(char[] value) {
    cacheInNtwkClssCd = checkCacheInNtwkClssCdConstraints(value);
    serializeCacheInNtwkClssCd(cacheInNtwkClssCd);
  }

  /**
   * Update CacheInNtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheInNtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheInNtwkClssCd, cacheInNtwkClssCd.length);
  }

  public void setCacheInNtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheInNtwkClssCd, cacheInNtwkClssCd.length);
  }

  /**
   * Update CacheInNtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheInNtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheInNtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update CacheInNtwkClssCd with another Field
   *
   * @param value
   */
  public void setCacheInNtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginCacheInNtwkClssCd, CACHE_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CacheInNtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheInNtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheInNtwkClssCd, CACHE_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CacheInNtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheInNtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheInNtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheTier1NtwkClssCd
   *
   * @return cacheTier1NtwkClssCd
   */
  public char[] getCacheTier1NtwkClssCd() throws CFException {
    if (isCacheTier1NtwkClssCdModified()) {
      cacheTier1NtwkClssCd = refreshCacheTier1NtwkClssCd();
    }
    return cacheTier1NtwkClssCd;
  }

  /**
   * set variable cacheTier1NtwkClssCd Corresponding COBOL Variable is CACHE-TIER1-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setCacheTier1NtwkClssCd(char[] value) {
    cacheTier1NtwkClssCd = checkCacheTier1NtwkClssCdConstraints(value);
    serializeCacheTier1NtwkClssCd(cacheTier1NtwkClssCd);
  }

  /**
   * Update CacheTier1NtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheTier1NtwkClssCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCacheTier1NtwkClssCd, cacheTier1NtwkClssCd.length);
  }

  public void setCacheTier1NtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheTier1NtwkClssCd, cacheTier1NtwkClssCd.length);
  }

  /**
   * Update CacheTier1NtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheTier1NtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheTier1NtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update CacheTier1NtwkClssCd with another Field
   *
   * @param value
   */
  public void setCacheTier1NtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginCacheTier1NtwkClssCd, CACHE_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CacheTier1NtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheTier1NtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheTier1NtwkClssCd, CACHE_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CacheTier1NtwkClssCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheTier1NtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheTier1NtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheProcCdRngBegnVal
   *
   * @return cacheProcCdRngBegnVal
   */
  public char[] getCacheProcCdRngBegnVal() throws CFException {
    if (isCacheProcCdRngBegnValModified()) {
      cacheProcCdRngBegnVal = refreshCacheProcCdRngBegnVal();
    }
    return cacheProcCdRngBegnVal;
  }

  /**
   * set variable cacheProcCdRngBegnVal Corresponding COBOL Variable is CACHE-PROC-CD-RNG-BEGN-VAL
   *
   * @param value
   */
  public void setCacheProcCdRngBegnVal(char[] value) {
    cacheProcCdRngBegnVal = checkCacheProcCdRngBegnValConstraints(value);
    serializeCacheProcCdRngBegnVal(cacheProcCdRngBegnVal);
  }

  /**
   * Update CacheProcCdRngBegnVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngBegnVal(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginCacheProcCdRngBegnVal,
        cacheProcCdRngBegnVal.length);
  }

  public void setCacheProcCdRngBegnVal(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheProcCdRngBegnVal, cacheProcCdRngBegnVal.length);
  }

  /**
   * Update CacheProcCdRngBegnVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngBegnVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngBegnVal + targetIndex, targetLen);
  }

  /**
   * Update CacheProcCdRngBegnVal with another Field
   *
   * @param value
   */
  public void setCacheProcCdRngBegnVal(Field source) {
    replace(source, 0, source.length(), beginCacheProcCdRngBegnVal, CACHE_PROC_CD_RNG_BEGN_VAL_LEN);
  }

  /**
   * Update CacheProcCdRngBegnVal with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngBegnVal(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheProcCdRngBegnVal, CACHE_PROC_CD_RNG_BEGN_VAL_LEN);
  }

  /**
   * Update CacheProcCdRngBegnVal with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheProcCdRngBegnVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngBegnVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheProcCdRngEndVal
   *
   * @return cacheProcCdRngEndVal
   */
  public char[] getCacheProcCdRngEndVal() throws CFException {
    if (isCacheProcCdRngEndValModified()) {
      cacheProcCdRngEndVal = refreshCacheProcCdRngEndVal();
    }
    return cacheProcCdRngEndVal;
  }

  /**
   * set variable cacheProcCdRngEndVal Corresponding COBOL Variable is CACHE-PROC-CD-RNG-END-VAL
   *
   * @param value
   */
  public void setCacheProcCdRngEndVal(char[] value) {
    cacheProcCdRngEndVal = checkCacheProcCdRngEndValConstraints(value);
    serializeCacheProcCdRngEndVal(cacheProcCdRngEndVal);
  }

  /**
   * Update CacheProcCdRngEndVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngEndVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCacheProcCdRngEndVal, cacheProcCdRngEndVal.length);
  }

  public void setCacheProcCdRngEndVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngEndVal, cacheProcCdRngEndVal.length);
  }

  /**
   * Update CacheProcCdRngEndVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngEndVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngEndVal + targetIndex, targetLen);
  }

  /**
   * Update CacheProcCdRngEndVal with another Field
   *
   * @param value
   */
  public void setCacheProcCdRngEndVal(Field source) {
    replace(source, 0, source.length(), beginCacheProcCdRngEndVal, CACHE_PROC_CD_RNG_END_VAL_LEN);
  }

  /**
   * Update CacheProcCdRngEndVal with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngEndVal(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheProcCdRngEndVal, CACHE_PROC_CD_RNG_END_VAL_LEN);
  }

  /**
   * Update CacheProcCdRngEndVal with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheProcCdRngEndVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngEndVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheProcCdRngTypVal
   *
   * @return cacheProcCdRngTypVal
   */
  public char[] getCacheProcCdRngTypVal() throws CFException {
    if (isCacheProcCdRngTypValModified()) {
      cacheProcCdRngTypVal = refreshCacheProcCdRngTypVal();
    }
    return cacheProcCdRngTypVal;
  }

  /**
   * set variable cacheProcCdRngTypVal Corresponding COBOL Variable is CACHE-PROC-CD-RNG-TYP-VAL
   *
   * @param value
   */
  public void setCacheProcCdRngTypVal(char[] value) {
    cacheProcCdRngTypVal = checkCacheProcCdRngTypValConstraints(value);
    serializeCacheProcCdRngTypVal(cacheProcCdRngTypVal);
  }

  /**
   * Update CacheProcCdRngTypVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngTypVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCacheProcCdRngTypVal, cacheProcCdRngTypVal.length);
  }

  public void setCacheProcCdRngTypVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngTypVal, cacheProcCdRngTypVal.length);
  }

  /**
   * Update CacheProcCdRngTypVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngTypVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngTypVal + targetIndex, targetLen);
  }

  /**
   * Update CacheProcCdRngTypVal with another Field
   *
   * @param value
   */
  public void setCacheProcCdRngTypVal(Field source) {
    replace(source, 0, source.length(), beginCacheProcCdRngTypVal, CACHE_PROC_CD_RNG_TYP_VAL_LEN);
  }

  /**
   * Update CacheProcCdRngTypVal with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheProcCdRngTypVal(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCacheProcCdRngTypVal, CACHE_PROC_CD_RNG_TYP_VAL_LEN);
  }

  /**
   * Update CacheProcCdRngTypVal with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCacheProcCdRngTypVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProcCdRngTypVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheProvOrgTypCd
   *
   * @return cacheProvOrgTypCd
   */
  public char[] getCacheProvOrgTypCd() throws CFException {
    if (isCacheProvOrgTypCdModified()) {
      cacheProvOrgTypCd = refreshCacheProvOrgTypCd();
    }
    return cacheProvOrgTypCd;
  }

  /**
   * set variable cacheProvOrgTypCd Corresponding COBOL Variable is CACHE-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setCacheProvOrgTypCd(char[] value) {
    cacheProvOrgTypCd = checkCacheProvOrgTypCdConstraints(value);
    serializeCacheProvOrgTypCd(cacheProvOrgTypCd);
  }

  /**
   * Update CacheProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheProvOrgTypCd, cacheProvOrgTypCd.length);
  }

  public void setCacheProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProvOrgTypCd, cacheProvOrgTypCd.length);
  }

  /**
   * Update CacheProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update CacheProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setCacheProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginCacheProvOrgTypCd, CACHE_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update CacheProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProvOrgTypCd, CACHE_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update CacheProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheProvOrgTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheHipaaCommtTxt
   *
   * @return cacheHipaaCommtTxt
   */
  public char[] getCacheHipaaCommtTxt() throws CFException {
    if (isCacheHipaaCommtTxtModified()) {
      cacheHipaaCommtTxt = refreshCacheHipaaCommtTxt();
    }
    return cacheHipaaCommtTxt;
  }

  /**
   * set variable cacheHipaaCommtTxt Corresponding COBOL Variable is CACHE-HIPAA-COMMT-TXT
   *
   * @param value
   */
  public void setCacheHipaaCommtTxt(char[] value) {
    cacheHipaaCommtTxt = checkCacheHipaaCommtTxtConstraints(value);
    serializeCacheHipaaCommtTxt(cacheHipaaCommtTxt);
  }

  /**
   * Update CacheHipaaCommtTxt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCommtTxt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheHipaaCommtTxt, cacheHipaaCommtTxt.length);
  }

  public void setCacheHipaaCommtTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCommtTxt, cacheHipaaCommtTxt.length);
  }

  /**
   * Update CacheHipaaCommtTxt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCommtTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCommtTxt + targetIndex, targetLen);
  }

  /**
   * Update CacheHipaaCommtTxt with another Field
   *
   * @param value
   */
  public void setCacheHipaaCommtTxt(Field source) {
    replace(source, 0, source.length(), beginCacheHipaaCommtTxt, CACHE_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update CacheHipaaCommtTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCommtTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCommtTxt, CACHE_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update CacheHipaaCommtTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaCommtTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaCommtTxt + targetIndex, targetLen);
  }

  public static int getCacheDataArrayFieldLength() {
    return CACHE_DATA_ARRAY_LENGTH;
  }
}
