package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CacheHpcDataArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;

public class CacheHpcDataArea extends CacheHpcDataAreaSerialized {

  private CacheDataFixedArea cacheDataFixedArea = new CacheDataFixedArea();
  private CacheDataArrayArea cacheDataArrayArea = new CacheDataArrayArea();

  /** Constructor for CacheHpcDataArea */
  public CacheHpcDataArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    cacheDataFixedArea.setParent(this, getStartOffset() + 0);
    cacheDataArrayArea.setParent(this, getStartOffset() + 9);
    /*  end of offset */
  }

  /**
   * Returns the value of cacheDataFixedArea
   *
   * @return cacheDataFixedArea
   */
  public CacheDataFixedArea getCacheDataFixedArea() {
    return cacheDataFixedArea;
  }
  /**
   * Update CacheDataFixedArea with the passed value Corresponding COBOL Variable is
   * CACHE-DATA-FIXED-AREA
   *
   * @param value
   */
  public void setCacheDataFixedArea(char[] value) {
    cacheDataFixedArea.setString(value);
  }

  /**
   * Update CacheDataFixedArea with a String from an offset and length
   *
   * @param value
   */
  public void setCacheDataFixedArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheDataFixedArea.begin, cacheDataFixedArea.length());
  }

  /**
   * Update CacheDataFixedArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheDataFixedArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheDataFixedArea.begin + targetIndex, targetLen);
  }

  /**
   * Update CacheDataFixedArea with another Field
   *
   * @param value
   */
  public void setCacheDataFixedArea(Field source) {
    replace(source, 0, source.length(), cacheDataFixedArea.begin, cacheDataFixedArea.length());
  }

  /**
   * Update CacheDataFixedArea with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheDataFixedArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheDataFixedArea.begin, cacheDataFixedArea.length());
  }

  /**
   * Update CacheDataFixedArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheDataFixedArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheDataFixedArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheDataArrayArea
   *
   * @return cacheDataArrayArea
   */
  public CacheDataArrayArea getCacheDataArrayArea() {
    return cacheDataArrayArea;
  }
  /**
   * Update CacheDataArrayArea with the passed value Corresponding COBOL Variable is
   * CACHE-DATA-ARRAY-AREA
   *
   * @param value
   */
  public void setCacheDataArrayArea(char[] value) {
    cacheDataArrayArea.setString(value);
  }

  /**
   * Update CacheDataArrayArea with a String from an offset and length
   *
   * @param value
   */
  public void setCacheDataArrayArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheDataArrayArea.begin, cacheDataArrayArea.length());
  }

  /**
   * Update CacheDataArrayArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheDataArrayArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheDataArrayArea.begin + targetIndex, targetLen);
  }

  /**
   * Update CacheDataArrayArea with another Field
   *
   * @param value
   */
  public void setCacheDataArrayArea(Field source) {
    replace(source, 0, source.length(), cacheDataArrayArea.begin, cacheDataArrayArea.length());
  }

  /**
   * Update CacheDataArrayArea with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheDataArrayArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheDataArrayArea.begin, cacheDataArrayArea.length());
  }

  /**
   * Update CacheDataArrayArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheDataArrayArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheDataArrayArea.begin + targetIndex, targetLen);
  }

  public static int getCacheHpcDataAreaFieldLength() {
    return CACHE_HPC_DATA_AREA_LENGTH;
  }
}
