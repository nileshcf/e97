package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CacheDataArray is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class CacheDataArray extends CacheDataArraySerialized {

  private char[] cacheHipaaCd = Field.fillLowValue(2);

  private char[] cacheGrnrcRqstCd = Field.fillLowValue(1);

  private char[] cacheHipaaGrpCd = Field.fillLowValue(2);

  private int cacheDataTyp;

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
   * Returns the value of cacheGrnrcRqstCd
   *
   * @return cacheGrnrcRqstCd
   */
  public char[] getCacheGrnrcRqstCd() throws CFException {
    if (isCacheGrnrcRqstCdModified()) {
      cacheGrnrcRqstCd = refreshCacheGrnrcRqstCd();
    }
    return cacheGrnrcRqstCd;
  }

  /**
   * set variable cacheGrnrcRqstCd Corresponding COBOL Variable is CACHE-GRNRC-RQST-CD
   *
   * @param value
   */
  public void setCacheGrnrcRqstCd(char[] value) {
    cacheGrnrcRqstCd = checkCacheGrnrcRqstCdConstraints(value);
    serializeCacheGrnrcRqstCd(cacheGrnrcRqstCd);
  }

  /**
   * Update CacheGrnrcRqstCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheGrnrcRqstCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheGrnrcRqstCd, cacheGrnrcRqstCd.length);
  }

  public void setCacheGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheGrnrcRqstCd, cacheGrnrcRqstCd.length);
  }

  /**
   * Update CacheGrnrcRqstCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheGrnrcRqstCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheGrnrcRqstCd + targetIndex, targetLen);
  }

  /**
   * Update CacheGrnrcRqstCd with another Field
   *
   * @param value
   */
  public void setCacheGrnrcRqstCd(Field source) {
    replace(source, 0, source.length(), beginCacheGrnrcRqstCd, CACHE_GRNRC_RQST_CD_LEN);
  }

  /**
   * Update CacheGrnrcRqstCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheGrnrcRqstCd, CACHE_GRNRC_RQST_CD_LEN);
  }

  /**
   * Update CacheGrnrcRqstCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheGrnrcRqstCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheGrnrcRqstCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheHipaaGrpCd
   *
   * @return cacheHipaaGrpCd
   */
  public char[] getCacheHipaaGrpCd() throws CFException {
    if (isCacheHipaaGrpCdModified()) {
      cacheHipaaGrpCd = refreshCacheHipaaGrpCd();
    }
    return cacheHipaaGrpCd;
  }

  /**
   * set variable cacheHipaaGrpCd Corresponding COBOL Variable is CACHE-HIPAA-GRP-CD
   *
   * @param value
   */
  public void setCacheHipaaGrpCd(char[] value) {
    cacheHipaaGrpCd = checkCacheHipaaGrpCdConstraints(value);
    serializeCacheHipaaGrpCd(cacheHipaaGrpCd);
  }

  /**
   * Update CacheHipaaGrpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaGrpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCacheHipaaGrpCd, cacheHipaaGrpCd.length);
  }

  public void setCacheHipaaGrpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaGrpCd, cacheHipaaGrpCd.length);
  }

  /**
   * Update CacheHipaaGrpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaGrpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaGrpCd + targetIndex, targetLen);
  }

  /**
   * Update CacheHipaaGrpCd with another Field
   *
   * @param value
   */
  public void setCacheHipaaGrpCd(Field source) {
    replace(source, 0, source.length(), beginCacheHipaaGrpCd, CACHE_HIPAA_GRP_CD_LEN);
  }

  /**
   * Update CacheHipaaGrpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheHipaaGrpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaGrpCd, CACHE_HIPAA_GRP_CD_LEN);
  }

  /**
   * Update CacheHipaaGrpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheHipaaGrpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCacheHipaaGrpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheDataTyp
   *
   * @return cacheDataTyp
   */
  public int getCacheDataTyp() throws CFException {
    if (isCacheDataTypModified()) {
      cacheDataTyp = refreshCacheDataTyp();
    }
    return cacheDataTyp;
  }

  /**
   * Update CacheDataTyp with the passed value Corresponding COBOL Variable is CACHE-DATA-TYP
   *
   * @param number
   */
  public void setCacheDataTyp(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheDataTyp = checkCacheDataTypMaxLimit(number);
    serializeCacheDataTyp(cacheDataTyp);
  }

  public void setCacheDataTyp(long number) {
    number = checkCacheDataTypMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheDataTyp((int) number);
  }

  public static int getCacheDataArrayFieldLength() {
    return CACHE_DATA_ARRAY_LENGTH;
  }
}
