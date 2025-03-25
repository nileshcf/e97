package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class CacheDataFixedAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheDataFixedAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheDataFixedAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_DATA_FIXED_AREA_LENGTH = 9;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheDataArrayMax;
  protected int beginCacheDataCnt;
  protected int beginCacheDataOverflowInd01;

  /** Constructor for CacheDataFixedAreaSerialized */
  public CacheDataFixedAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheDataFixedAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheDataFixedAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CacheDataFixedAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this CacheDataFixedAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in CacheDataFixedAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_DATA_FIXED_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCacheDataArrayMax = getStartOffset() + 0; // set offset for serialization

    beginCacheDataCnt = getStartOffset() + 4; // set offset for serialization

    beginCacheDataOverflowInd01 = getStartOffset() + 8; // set offset for serialization

    /*  end of offset */
  }

  int localCacheDataArrayMaxCounter = -1;

  public boolean isCacheDataArrayMaxModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataArrayMaxCounter != sharedCounter;
    localCacheDataArrayMaxCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_ARRAY_MAX_LEN = 4;
  /** serializeCacheDataArrayMax */
  protected void serializeCacheDataArrayMax(int cacheDataArrayMax) {
    replaceValue( //  save the value as string
        getBinaryString(cacheDataArrayMax, CACHE_DATA_ARRAY_MAX_LEN),
        beginCacheDataArrayMax,
        CACHE_DATA_ARRAY_MAX_LEN);
    localCacheDataArrayMaxCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheDataArrayMaxMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheDataArrayMax is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheDataArrayMax() {
    return (getInt(beginCacheDataArrayMax));
  }

  int localCacheDataCntCounter = -1;

  public boolean isCacheDataCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataCntCounter != sharedCounter;
    localCacheDataCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_CNT_LEN = 4;
  /** serializeCacheDataCnt */
  protected void serializeCacheDataCnt(int cacheDataCnt) {
    replaceValue( //  save the value as string
        getBinaryString(cacheDataCnt, CACHE_DATA_CNT_LEN), beginCacheDataCnt, CACHE_DATA_CNT_LEN);
    localCacheDataCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheDataCntMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheDataCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheDataCnt() {
    return (getInt(beginCacheDataCnt));
  }

  int localCacheDataOverflowInd01Counter = -1;

  public boolean isCacheDataOverflowInd01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataOverflowInd01Counter != sharedCounter;
    localCacheDataOverflowInd01Counter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_OVERFLOW_IND_01_LEN = 1;
  /** serialize this CacheDataOverflowInd01 */
  protected void serializeCacheDataOverflowInd01(char[] cacheDataOverflowInd01) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheDataOverflowInd01,
        0,
        getStringValue(),
        beginCacheDataOverflowInd01,
        CACHE_DATA_OVERFLOW_IND_01_LEN);
    localCacheDataOverflowInd01Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheDataOverflowInd01Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheDataOverflowInd01 is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheDataOverflowInd01() {
    return (substring(
        getStringValue(),
        beginCacheDataOverflowInd01,
        beginCacheDataOverflowInd01 + CACHE_DATA_OVERFLOW_IND_01_LEN));
  }
}
