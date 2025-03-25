package com.cloudframe.app.dto.serialize.c5427bhi;

/**
 * The class CacheKeyFixedAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheKeyFixedAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheKeyFixedAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_KEY_FIXED_AREA_LENGTH = 13;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheKeyArrayMax;
  protected int beginCacheKeyCnt;
  protected int beginCacheDataAddress;
  protected int beginCacheDataPtr;
  protected int beginCacheKeyOverflowInd;

  /** Constructor for CacheKeyFixedAreaSerialized */
  public CacheKeyFixedAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyFixedAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyFixedAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CacheKeyFixedAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this CacheKeyFixedAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in CacheKeyFixedAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_KEY_FIXED_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCacheKeyArrayMax = getStartOffset() + 0; // set offset for serialization

    beginCacheKeyCnt = getStartOffset() + 4; // set offset for serialization

    beginCacheDataAddress = getStartOffset() + 8; // set offset for serialization

    beginCacheDataPtr = getStartOffset() + 8; // set offset for serialization

    beginCacheKeyOverflowInd = getStartOffset() + 12; // set offset for serialization

    /*  end of offset */
  }

  int localCacheKeyArrayMaxCounter = -1;

  public boolean isCacheKeyArrayMaxModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheKeyArrayMaxCounter != sharedCounter;
    localCacheKeyArrayMaxCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_KEY_ARRAY_MAX_LEN = 4;
  /** serializeCacheKeyArrayMax */
  protected void serializeCacheKeyArrayMax(int cacheKeyArrayMax) {
    replaceValue( //  save the value as string
        getBinaryString(cacheKeyArrayMax, CACHE_KEY_ARRAY_MAX_LEN),
        beginCacheKeyArrayMax,
        CACHE_KEY_ARRAY_MAX_LEN);
    localCacheKeyArrayMaxCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheKeyArrayMaxMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheKeyArrayMax is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheKeyArrayMax() {
    return (getInt(beginCacheKeyArrayMax));
  }

  int localCacheKeyCntCounter = -1;

  public boolean isCacheKeyCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheKeyCntCounter != sharedCounter;
    localCacheKeyCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_KEY_CNT_LEN = 4;
  /** serializeCacheKeyCnt */
  protected void serializeCacheKeyCnt(int cacheKeyCnt) {
    replaceValue( //  save the value as string
        getBinaryString(cacheKeyCnt, CACHE_KEY_CNT_LEN), beginCacheKeyCnt, CACHE_KEY_CNT_LEN);
    localCacheKeyCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheKeyCntMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheKeyCnt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshCacheKeyCnt() {
    return (getInt(beginCacheKeyCnt));
  }

  int localCacheDataAddressCounter = -1;

  public boolean isCacheDataAddressModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataAddressCounter != sharedCounter;
    localCacheDataAddressCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_ADDRESS_LEN = 4;
  /** serializeCacheDataAddress */
  protected void serializeCacheDataAddress(int cacheDataAddress) {
    replaceValue( //  save the value as string
        getBinaryString(cacheDataAddress, CACHE_DATA_ADDRESS_LEN),
        beginCacheDataAddress,
        CACHE_DATA_ADDRESS_LEN);
    localCacheDataAddressCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheDataAddressMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheDataAddress is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheDataAddress() {
    return (getInt(beginCacheDataAddress));
  }

  int localCacheDataPtrCounter = -1;

  public boolean isCacheDataPtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataPtrCounter != sharedCounter;
    localCacheDataPtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_PTR_LEN = 4;
  /** serializeCacheDataPtr */
  protected void serializeCacheDataPtr(int cacheDataPtr) {
    replaceValue( //  save the value as string
        getBinaryString(cacheDataPtr, CACHE_DATA_PTR_LEN), beginCacheDataPtr, CACHE_DATA_PTR_LEN);
    localCacheDataPtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheDataPtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheDataPtr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheDataPtr() {
    return (getInt(beginCacheDataPtr));
  }

  int localCacheKeyOverflowIndCounter = -1;

  public boolean isCacheKeyOverflowIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheKeyOverflowIndCounter != sharedCounter;
    localCacheKeyOverflowIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_KEY_OVERFLOW_IND_LEN = 1;
  /** serialize this CacheKeyOverflowInd */
  protected void serializeCacheKeyOverflowInd(char[] cacheKeyOverflowInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheKeyOverflowInd,
        0,
        getStringValue(),
        beginCacheKeyOverflowInd,
        CACHE_KEY_OVERFLOW_IND_LEN);
    localCacheKeyOverflowIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheKeyOverflowIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheKeyOverflowInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheKeyOverflowInd() {
    return (substring(
        getStringValue(),
        beginCacheKeyOverflowInd,
        beginCacheKeyOverflowInd + CACHE_KEY_OVERFLOW_IND_LEN));
  }
}
