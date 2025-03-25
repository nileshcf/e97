package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CacheDataArrayArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import java.util.*;

public class CacheDataArrayArea extends CacheDataArrayAreaSerialized {

  private List<CacheDataArray> cacheDataArray = new ArrayList<>();

  /** Constructor for CacheDataArrayArea */
  public CacheDataArrayArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheDataArrayArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheDataArrayArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of cacheDataArray Corresponding COBOL Variable is CACHE-DATA-ARRAY
   *
   * @return cacheDataArray
   */
  public List<CacheDataArray> getCacheDataArray() {
    return cacheDataArray;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return cacheDataArray
   */
  public CacheDataArray getCacheDataArray(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getCacheDataArray(), resetting it to 0", index);
      index = 0;
    } else if (index >= CACHE_DATA_ARRAY_SIZE) {
      index = CACHE_DATA_ARRAY_SIZE - 1; // can't exceed max array size
      logger.trace(
          "cacheDataArray - Array index exceeded max Size {}, resetting it to max allowed",
          CACHE_DATA_ARRAY_SIZE);
    }
    if (index >= cacheDataArray.size()) {
      for (int fillIndex = cacheDataArray.size() - 1; fillIndex < index; fillIndex++) {
        cacheDataArray.add(null);
      }
      cacheDataArray.set(
          index,
          new CacheDataArray(
              this, beginCacheDataArray + index * CacheDataArray.getCacheDataArrayFieldLength()));
    }
    CacheDataArray value = cacheDataArray.get(index);
    if (value == null) {
      cacheDataArray.set(
          index,
          new CacheDataArray(
              this, beginCacheDataArray + index * CacheDataArray.getCacheDataArrayFieldLength()));
      value = cacheDataArray.get(index);
    }
    return value;
  }

  /**
   * Update CacheDataArray at index with the passed value Corresponding COBOL Variable is
   * CACHE-DATA-ARRAY
   *
   * @param index
   * @param value
   */
  public void setCacheDataArray(int index, char[] value) {
    getCacheDataArray(index).setString(value);
  }

  public static int getCacheDataArrayAreaFieldLength() {
    return CACHE_DATA_ARRAY_AREA_LENGTH;
  }
}
