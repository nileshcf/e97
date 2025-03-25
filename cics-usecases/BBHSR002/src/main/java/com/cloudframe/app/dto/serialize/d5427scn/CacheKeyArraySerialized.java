package com.cloudframe.app.dto.serialize.d5427scn;

/**
 * The class CacheKeyArraySerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheKeyArraySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheKeyArraySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_KEY_ARRAY_LENGTH = 29;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheEffDt;
  protected int beginCacheCancDt;
  protected int beginCacheSrvcCdNbr;

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
    setParent(parent, 8); // serialize this field at offset 8 by default
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
    init(begin); // serialize this field at offset 8 by default
  }
  /** initializes the field in CacheKeyArraySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_KEY_ARRAY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCacheEffDt = getStartOffset() + 6; // set offset for serialization

    beginCacheCancDt = getStartOffset() + 16; // set offset for serialization

    beginCacheSrvcCdNbr = getStartOffset() + 26; // set offset for serialization

    /*  end of offset */
  }

  int localCacheEffDtCounter = -1;

  public boolean isCacheEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheEffDtCounter != sharedCounter;
    localCacheEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_EFF_DT_LEN = 10;
  /** serialize this CacheEffDt */
  protected void serializeCacheEffDt(char[] cacheEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheEffDt, 0, getStringValue(), beginCacheEffDt, CACHE_EFF_DT_LEN);
    localCacheEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCacheEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCacheEffDt() {
    return (substring(getStringValue(), beginCacheEffDt, beginCacheEffDt + CACHE_EFF_DT_LEN));
  }

  int localCacheCancDtCounter = -1;

  public boolean isCacheCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheCancDtCounter != sharedCounter;
    localCacheCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_CANC_DT_LEN = 10;
  /** serialize this CacheCancDt */
  protected void serializeCacheCancDt(char[] cacheCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheCancDt, 0, getStringValue(), beginCacheCancDt, CACHE_CANC_DT_LEN);
    localCacheCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCacheCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCacheCancDt() {
    return (substring(getStringValue(), beginCacheCancDt, beginCacheCancDt + CACHE_CANC_DT_LEN));
  }

  int localCacheSrvcCdNbrCounter = -1;

  public boolean isCacheSrvcCdNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheSrvcCdNbrCounter != sharedCounter;
    localCacheSrvcCdNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_SRVC_CD_NBR_LEN = 3;
  /** serialize this CacheSrvcCdNbr */
  protected void serializeCacheSrvcCdNbr(char[] cacheSrvcCdNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheSrvcCdNbr, 0, getStringValue(), beginCacheSrvcCdNbr, CACHE_SRVC_CD_NBR_LEN);
    localCacheSrvcCdNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheSrvcCdNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshCacheSrvcCdNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheSrvcCdNbr() {
    return (substring(
        getStringValue(), beginCacheSrvcCdNbr, beginCacheSrvcCdNbr + CACHE_SRVC_CD_NBR_LEN));
  }
}
