package com.cloudframe.app.dto.serialize.c5427bhi;

/**
 * The class CacheBhiKeyAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheBhiKeyAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheBhiKeyAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_BHI_KEY_AREA_LENGTH = 450013;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheKeyArray;
  protected static final int CACHE_KEY_ARRAY_SIZE = 25000;

  /** Constructor for CacheBhiKeyAreaSerialized */
  public CacheBhiKeyAreaSerialized() {
    init(0);
  }

  /** initializes the field in CacheBhiKeyAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_BHI_KEY_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCacheKeyArray = getStartOffset() + 13; // set offset for serialization

    /*  end of offset */
  }

  public int cacheKeyArraySize() {
    return CACHE_KEY_ARRAY_SIZE;
  }

  private int dependValue = 0;

  public void setDependingValue(int dependValue) {
    this.dependValue = dependValue;
  }

  public int getVariableLength() {
    return 13 + (dependValue * 18);
  }

  public int getVariableLength(int idx) {
    return 13 + (idx * 18);
  }
}
