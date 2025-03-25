package com.cloudframe.app.dto.serialize.d5427scn;

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
  protected static final int CACHE_KEY_AREA_LENGTH = 6;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheSrvcCd;

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
    setParent(parent, 8); // serialize this field at offset 8 by default
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
    init(begin); // serialize this field at offset 8 by default
  }
  /** initializes the field in CacheKeyAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_KEY_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCacheSrvcCd = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localCacheSrvcCdCounter = -1;

  public boolean isCacheSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheSrvcCdCounter != sharedCounter;
    localCacheSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_SRVC_CD_LEN = 6;
  /** serialize this CacheSrvcCd */
  protected void serializeCacheSrvcCd(char[] cacheSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheSrvcCd, 0, getStringValue(), beginCacheSrvcCd, CACHE_SRVC_CD_LEN);
    localCacheSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshCacheSrvcCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCacheSrvcCd() {
    return (substring(getStringValue(), beginCacheSrvcCd, beginCacheSrvcCd + CACHE_SRVC_CD_LEN));
  }
}
