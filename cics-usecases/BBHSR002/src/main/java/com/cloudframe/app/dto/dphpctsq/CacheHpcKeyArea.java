package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CacheHpcKeyArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import java.util.*;

public class CacheHpcKeyArea extends CacheHpcKeyAreaSerialized {

  private CacheKeyFixedArea cacheKeyFixedArea = new CacheKeyFixedArea();
  private List<CacheKeyArray> cacheKeyArray = new ArrayList<>();

  /** Constructor for CacheHpcKeyArea */
  public CacheHpcKeyArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    cacheKeyFixedArea.setParent(this, getStartOffset() + 0);
    for (int arrayIndex = 0; arrayIndex < CACHE_KEY_ARRAY_SIZE; arrayIndex++) {
      cacheKeyArray.add(
          new CacheKeyArray(
              this, beginCacheKeyArray + arrayIndex * CacheKeyArray.getCacheKeyArrayFieldLength()));
    }
    /*  end of offset */
  }

  /**
   * Returns the value of cacheKeyFixedArea
   *
   * @return cacheKeyFixedArea
   */
  public CacheKeyFixedArea getCacheKeyFixedArea() {
    return cacheKeyFixedArea;
  }
  /**
   * Update CacheKeyFixedArea with the passed value Corresponding COBOL Variable is
   * CACHE-KEY-FIXED-AREA
   *
   * @param value
   */
  public void setCacheKeyFixedArea(char[] value) {
    cacheKeyFixedArea.setString(value);
  }

  /**
   * Update CacheKeyFixedArea with a String from an offset and length
   *
   * @param value
   */
  public void setCacheKeyFixedArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyFixedArea.begin, cacheKeyFixedArea.length());
  }

  /**
   * Update CacheKeyFixedArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyFixedArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyFixedArea.begin + targetIndex, targetLen);
  }

  /**
   * Update CacheKeyFixedArea with another Field
   *
   * @param value
   */
  public void setCacheKeyFixedArea(Field source) {
    replace(source, 0, source.length(), cacheKeyFixedArea.begin, cacheKeyFixedArea.length());
  }

  /**
   * Update CacheKeyFixedArea with another Field from an offset and length
   *
   * @param value
   */
  public void setCacheKeyFixedArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyFixedArea.begin, cacheKeyFixedArea.length());
  }

  /**
   * Update CacheKeyFixedArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCacheKeyFixedArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, cacheKeyFixedArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of cacheKeyArray Corresponding COBOL Variable is CACHE-KEY-ARRAY
   *
   * @return cacheKeyArray
   */
  public List<CacheKeyArray> getCacheKeyArray() {
    return cacheKeyArray;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return cacheKeyArray
   */
  public CacheKeyArray getCacheKeyArray(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getCacheKeyArray(), resetting it to 0", index);
      index = 0;
    } else if (index >= CACHE_KEY_ARRAY_SIZE) {
      index = CACHE_KEY_ARRAY_SIZE - 1; // can't exceed max array size
      logger.trace(
          "cacheKeyArray - Array index exceeded max Size {}, resetting it to max allowed",
          CACHE_KEY_ARRAY_SIZE);
    }
    if (index >= cacheKeyArray.size()) {
      for (int fillIndex = cacheKeyArray.size() - 1; fillIndex < index; fillIndex++) {
        cacheKeyArray.add(null);
      }
      cacheKeyArray.set(
          index,
          new CacheKeyArray(
              this, beginCacheKeyArray + index * CacheKeyArray.getCacheKeyArrayFieldLength()));
    }
    CacheKeyArray value = cacheKeyArray.get(index);
    if (value == null) {
      cacheKeyArray.set(
          index,
          new CacheKeyArray(
              this, beginCacheKeyArray + index * CacheKeyArray.getCacheKeyArrayFieldLength()));
      value = cacheKeyArray.get(index);
    }
    return value;
  }

  /**
   * Update CacheKeyArray at index with the passed value Corresponding COBOL Variable is
   * CACHE-KEY-ARRAY
   *
   * @param index
   * @param value
   */
  public void setCacheKeyArray(int index, char[] value) {
    getCacheKeyArray(index).setString(value);
  }

  public static int getCacheHpcKeyAreaFieldLength() {
    return CACHE_HPC_KEY_AREA_LENGTH;
  }
}
