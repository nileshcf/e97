package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class CachePointerGroupSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CachePointerGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CachePointerGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_POINTER_GROUP_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCachePointer;
  protected int beginCacheBin;

  /** Constructor for CachePointerGroupSerialized */
  public CachePointerGroupSerialized() {
    init(0);
  }

  /** initializes the field in CachePointerGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_POINTER_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCachePointer = getStartOffset() + 0; // set offset for serialization

    beginCacheBin = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localCachePointerCounter = -1;

  public boolean isCachePointerModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCachePointerCounter != sharedCounter;
    localCachePointerCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_POINTER_LEN = 4;
  /** serializeCachePointer */
  protected void serializeCachePointer(int cachePointer) {
    replaceValue( //  save the value as string
        getBinaryString(cachePointer, CACHE_POINTER_LEN), beginCachePointer, CACHE_POINTER_LEN);
    localCachePointerCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCachePointerMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCachePointer is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCachePointer() {
    return (getInt(beginCachePointer));
  }

  int localCacheBinCounter = -1;

  public boolean isCacheBinModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheBinCounter != sharedCounter;
    localCacheBinCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_BIN_LEN = 4;
  /** serializeCacheBin */
  protected void serializeCacheBin(int cacheBin) {
    replaceValue( //  save the value as string
        getBinaryString(cacheBin, CACHE_BIN_LEN), beginCacheBin, CACHE_BIN_LEN);
    localCacheBinCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheBinMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheBin is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshCacheBin() {
    return (getInt(beginCacheBin));
  }
}
