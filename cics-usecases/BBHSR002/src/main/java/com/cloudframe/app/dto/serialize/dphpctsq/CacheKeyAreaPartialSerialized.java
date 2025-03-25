package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class CacheKeyAreaPartialSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheKeyAreaPartialSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheKeyAreaPartialSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_KEY_AREA_PARTIAL_LENGTH = 5;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheQueryTyp;
  protected int beginCacheHipaaVerNbr;

  /** Constructor for CacheKeyAreaPartialSerialized */
  public CacheKeyAreaPartialSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheKeyAreaPartialSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheKeyAreaPartialSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CacheKeyAreaPartialSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 13); // serialize this field at offset 13 by default
  }

  /**
   * sets parent for this CacheKeyAreaPartialSerialized to the parent and set the serialize offset
   * to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 13 by default
  }
  /** initializes the field in CacheKeyAreaPartialSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_KEY_AREA_PARTIAL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCacheQueryTyp = getStartOffset() + 0; // set offset for serialization

    beginCacheHipaaVerNbr = getStartOffset() + 4; // set offset for serialization

    /*  end of offset */
  }

  int localCacheQueryTypCounter = -1;

  public boolean isCacheQueryTypModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheQueryTypCounter != sharedCounter;
    localCacheQueryTypCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_QUERY_TYP_LEN = 4;
  /** serializeCacheQueryTyp */
  protected void serializeCacheQueryTyp(int cacheQueryTyp) {
    replaceValue( //  save the value as string
        getBinaryString(cacheQueryTyp, CACHE_QUERY_TYP_LEN),
        beginCacheQueryTyp,
        CACHE_QUERY_TYP_LEN);
    localCacheQueryTypCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheQueryTypMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheQueryTyp is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheQueryTyp() {
    return (getInt(beginCacheQueryTyp));
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
}
