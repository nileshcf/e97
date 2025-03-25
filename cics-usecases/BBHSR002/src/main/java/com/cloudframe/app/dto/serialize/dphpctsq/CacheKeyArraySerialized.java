package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class CacheKeyArraySerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheKeyArraySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheKeyArraySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_KEY_ARRAY_LENGTH = 15;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheDataOffset;
  protected int beginCacheDataNbrOfEntries;

  /** Constructor for CacheKeyArraySerialized */
  public CacheKeyArraySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyArraySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyArraySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CacheKeyArraySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 13); // serialize this field at offset 13 by default
  }

  /**
   * sets parent for this CacheKeyArraySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 13 by default
  }
  /** initializes the field in CacheKeyArraySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_KEY_ARRAY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCacheDataOffset = getStartOffset() + 7; // set offset for serialization

    beginCacheDataNbrOfEntries = getStartOffset() + 11; // set offset for serialization

    /*  end of offset */
  }

  int localCacheDataOffsetCounter = -1;

  public boolean isCacheDataOffsetModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataOffsetCounter != sharedCounter;
    localCacheDataOffsetCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_OFFSET_LEN = 4;
  /** serializeCacheDataOffset */
  protected void serializeCacheDataOffset(int cacheDataOffset) {
    replaceValue( //  save the value as string
        getBinaryString(cacheDataOffset, CACHE_DATA_OFFSET_LEN),
        beginCacheDataOffset,
        CACHE_DATA_OFFSET_LEN);
    localCacheDataOffsetCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheDataOffsetMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheDataOffset is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheDataOffset() {
    return (getInt(beginCacheDataOffset));
  }

  int localCacheDataNbrOfEntriesCounter = -1;

  public boolean isCacheDataNbrOfEntriesModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataNbrOfEntriesCounter != sharedCounter;
    localCacheDataNbrOfEntriesCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_NBR_OF_ENTRIES_LEN = 4;
  /** serializeCacheDataNbrOfEntries */
  protected void serializeCacheDataNbrOfEntries(int cacheDataNbrOfEntries) {
    replaceValue( //  save the value as string
        getBinaryString(cacheDataNbrOfEntries, CACHE_DATA_NBR_OF_ENTRIES_LEN),
        beginCacheDataNbrOfEntries,
        CACHE_DATA_NBR_OF_ENTRIES_LEN);
    localCacheDataNbrOfEntriesCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheDataNbrOfEntriesMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheDataNbrOfEntries is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshCacheDataNbrOfEntries() {
    return (getInt(beginCacheDataNbrOfEntries));
  }
}
