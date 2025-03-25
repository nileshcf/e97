package com.cloudframe.app.dto.serialize.d5427scn;

/**
 * The class CacheScnKeyAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheScnKeyAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheScnKeyAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_SCN_KEY_AREA_LENGTH = 14508;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheKeyArray;
  protected static final int CACHE_KEY_ARRAY_SIZE = 500;

  /** Constructor for CacheScnKeyAreaSerialized */
  public CacheScnKeyAreaSerialized() {
    init(0);
  }

  /** initializes the field in CacheScnKeyAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_SCN_KEY_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCacheKeyArray = getStartOffset() + 8; // set offset for serialization

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
    return 8 + (dependValue * 29);
  }

  public int getVariableLength(int idx) {
    return 8 + (idx * 29);
  }
}
