package com.cloudframe.app.dto.c5427hpc;

/**
 * The class CacheKeyAreaPartial is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class CacheKeyAreaPartial extends CacheKeyAreaPartialSerialized {

  private int cacheQueryTyp;

  private char[] cacheHipaaVerNbr = Field.fillLowValue(1);

  /** Constructor for CacheKeyAreaPartial */
  public CacheKeyAreaPartial() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyAreaPartial. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyAreaPartial(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of cacheQueryTyp
   *
   * @return cacheQueryTyp
   */
  public int getCacheQueryTyp() throws CFException {
    if (isCacheQueryTypModified()) {
      cacheQueryTyp = refreshCacheQueryTyp();
    }
    return cacheQueryTyp;
  }

  /**
   * Update CacheQueryTyp with the passed value Corresponding COBOL Variable is CACHE-QUERY-TYP
   *
   * @param number
   */
  public void setCacheQueryTyp(int number) {
    // Truncate if the number is beyond +/- Max range
    cacheQueryTyp = checkCacheQueryTypMaxLimit(number);
    serializeCacheQueryTyp(cacheQueryTyp);
  }

  public void setCacheQueryTyp(long number) {
    number = checkCacheQueryTypMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCacheQueryTyp((int) number);
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

  public static int getCacheKeyAreaPartialFieldLength() {
    return CACHE_KEY_AREA_PARTIAL_LENGTH;
  }
}
