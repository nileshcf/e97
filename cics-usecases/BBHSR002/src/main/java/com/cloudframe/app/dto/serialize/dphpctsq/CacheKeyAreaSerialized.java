package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class CacheKeyAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheKeyAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheKeyAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_KEY_AREA_LENGTH = 7;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheSortCol1;

  /** Constructor for CacheKeyAreaSerialized */
  public CacheKeyAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CacheKeyAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 13); // serialize this field at offset 13 by default
  }

  /**
   * sets parent for this CacheKeyAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 13 by default
  }
  /** initializes the field in CacheKeyAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_KEY_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCacheSortCol1 = getStartOffset() + 5; // set offset for serialization

    /*  end of offset */
  }

  int localCacheSortCol1Counter = -1;

  public boolean isCacheSortCol1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheSortCol1Counter != sharedCounter;
    localCacheSortCol1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_SORT_COL_1_LEN = 2;
  /** serialize this CacheSortCol1 */
  protected void serializeCacheSortCol1(char[] cacheSortCol1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheSortCol1, 0, getStringValue(), beginCacheSortCol1, CACHE_SORT_COL_1_LEN);
    localCacheSortCol1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheSortCol1Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCacheSortCol1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheSortCol1() {
    return (substring(
        getStringValue(), beginCacheSortCol1, beginCacheSortCol1 + CACHE_SORT_COL_1_LEN));
  }
}
