package com.cloudframe.app.dto.serialize.c5427bhi;

/**
 * The class CacheDataArrayAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheDataArrayAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheDataArrayAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_DATA_ARRAY_AREA_LENGTH = 10530000;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheDataArray;
  protected static final int CACHE_DATA_ARRAY_SIZE = 30000;

  /** Constructor for CacheDataArrayAreaSerialized */
  public CacheDataArrayAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheDataArrayAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheDataArrayAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CacheDataArrayAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 9); // serialize this field at offset 9 by default
  }

  /**
   * sets parent for this CacheDataArrayAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 9 by default
  }
  /** initializes the field in CacheDataArrayAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_DATA_ARRAY_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCacheDataArray = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  public int cacheDataArraySize() {
    return CACHE_DATA_ARRAY_SIZE;
  }

  private int dependValue = 0;

  public void setDependingValue(int dependValue) {
    this.dependValue = dependValue;
  }

  public int getVariableLength() {
    return 0 + (dependValue * 351);
  }

  public int getVariableLength(int idx) {
    return 0 + (idx * 351);
  }
}
