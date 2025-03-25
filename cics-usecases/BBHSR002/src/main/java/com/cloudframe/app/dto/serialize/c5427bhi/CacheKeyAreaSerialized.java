package com.cloudframe.app.dto.serialize.c5427bhi;

/**
 * The class CacheKeyAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheKeyAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheKeyAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_KEY_AREA_LENGTH = 10;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheSlotTblId;
  protected int beginCacheHipaaCd;
  protected int beginCacheHipaaVerNbr;
  protected int beginCacheStsCd;

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
    beginCacheSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginCacheHipaaCd = getStartOffset() + 6; // set offset for serialization

    beginCacheHipaaVerNbr = getStartOffset() + 8; // set offset for serialization

    beginCacheStsCd = getStartOffset() + 9; // set offset for serialization

    /*  end of offset */
  }

  int localCacheSlotTblIdCounter = -1;

  public boolean isCacheSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheSlotTblIdCounter != sharedCounter;
    localCacheSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_SLOT_TBL_ID_LEN = 6;
  /** serialize this CacheSlotTblId */
  protected void serializeCacheSlotTblId(char[] cacheSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheSlotTblId, 0, getStringValue(), beginCacheSlotTblId, CACHE_SLOT_TBL_ID_LEN);
    localCacheSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshCacheSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheSlotTblId() {
    return (substring(
        getStringValue(), beginCacheSlotTblId, beginCacheSlotTblId + CACHE_SLOT_TBL_ID_LEN));
  }

  int localCacheHipaaCdCounter = -1;

  public boolean isCacheHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheHipaaCdCounter != sharedCounter;
    localCacheHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_HIPAA_CD_LEN = 2;
  /** serialize this CacheHipaaCd */
  protected void serializeCacheHipaaCd(char[] cacheHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheHipaaCd, 0, getStringValue(), beginCacheHipaaCd, CACHE_HIPAA_CD_LEN);
    localCacheHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCacheHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheHipaaCd() {
    return (substring(getStringValue(), beginCacheHipaaCd, beginCacheHipaaCd + CACHE_HIPAA_CD_LEN));
  }

  int localCacheHipaaVerNbrCounter = -1;

  public boolean isCacheHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheHipaaVerNbrCounter != sharedCounter;
    localCacheHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_HIPAA_VER_NBR_LEN = 1;
  /** serialize this CacheHipaaVerNbr */
  protected void serializeCacheHipaaVerNbr(char[] cacheHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheHipaaVerNbr, 0, getStringValue(), beginCacheHipaaVerNbr, CACHE_HIPAA_VER_NBR_LEN);
    localCacheHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheHipaaVerNbr() {
    return (substring(
        getStringValue(), beginCacheHipaaVerNbr, beginCacheHipaaVerNbr + CACHE_HIPAA_VER_NBR_LEN));
  }

  int localCacheStsCdCounter = -1;

  public boolean isCacheStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheStsCdCounter != sharedCounter;
    localCacheStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_STS_CD_LEN = 1;
  /** serialize this CacheStsCd */
  protected void serializeCacheStsCd(char[] cacheStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheStsCd, 0, getStringValue(), beginCacheStsCd, CACHE_STS_CD_LEN);
    localCacheStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheStsCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCacheStsCd() {
    return (substring(getStringValue(), beginCacheStsCd, beginCacheStsCd + CACHE_STS_CD_LEN));
  }
}
