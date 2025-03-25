package com.cloudframe.app.dto.serialize.c5427hpc;

/**
 * The class CacheDataArraySerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheDataArraySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheDataArraySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_DATA_ARRAY_LENGTH = 9;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheHipaaCd;
  protected int beginCacheGrnrcRqstCd;
  protected int beginCacheHipaaGrpCd;
  protected int beginCacheDataTyp;

  /** Constructor for CacheDataArraySerialized */
  public CacheDataArraySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CacheDataArraySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CacheDataArraySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CacheDataArraySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 9); // serialize this field at offset 9 by default
  }

  /**
   * sets parent for this CacheDataArraySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 9 by default
  }
  /** initializes the field in CacheDataArraySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_DATA_ARRAY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCacheHipaaCd = getStartOffset() + 0; // set offset for serialization

    beginCacheGrnrcRqstCd = getStartOffset() + 2; // set offset for serialization

    beginCacheHipaaGrpCd = getStartOffset() + 3; // set offset for serialization

    beginCacheDataTyp = getStartOffset() + 5; // set offset for serialization

    /*  end of offset */
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

  int localCacheGrnrcRqstCdCounter = -1;

  public boolean isCacheGrnrcRqstCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheGrnrcRqstCdCounter != sharedCounter;
    localCacheGrnrcRqstCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_GRNRC_RQST_CD_LEN = 1;
  /** serialize this CacheGrnrcRqstCd */
  protected void serializeCacheGrnrcRqstCd(char[] cacheGrnrcRqstCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheGrnrcRqstCd, 0, getStringValue(), beginCacheGrnrcRqstCd, CACHE_GRNRC_RQST_CD_LEN);
    localCacheGrnrcRqstCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheGrnrcRqstCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheGrnrcRqstCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheGrnrcRqstCd() {
    return (substring(
        getStringValue(), beginCacheGrnrcRqstCd, beginCacheGrnrcRqstCd + CACHE_GRNRC_RQST_CD_LEN));
  }

  int localCacheHipaaGrpCdCounter = -1;

  public boolean isCacheHipaaGrpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheHipaaGrpCdCounter != sharedCounter;
    localCacheHipaaGrpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_HIPAA_GRP_CD_LEN = 2;
  /** serialize this CacheHipaaGrpCd */
  protected void serializeCacheHipaaGrpCd(char[] cacheHipaaGrpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheHipaaGrpCd, 0, getStringValue(), beginCacheHipaaGrpCd, CACHE_HIPAA_GRP_CD_LEN);
    localCacheHipaaGrpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheHipaaGrpCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCacheHipaaGrpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheHipaaGrpCd() {
    return (substring(
        getStringValue(), beginCacheHipaaGrpCd, beginCacheHipaaGrpCd + CACHE_HIPAA_GRP_CD_LEN));
  }

  int localCacheDataTypCounter = -1;

  public boolean isCacheDataTypModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheDataTypCounter != sharedCounter;
    localCacheDataTypCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_DATA_TYP_LEN = 4;
  /** serializeCacheDataTyp */
  protected void serializeCacheDataTyp(int cacheDataTyp) {
    replaceValue( //  save the value as string
        getBinaryString(cacheDataTyp, CACHE_DATA_TYP_LEN), beginCacheDataTyp, CACHE_DATA_TYP_LEN);
    localCacheDataTypCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCacheDataTypMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCacheDataTyp is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCacheDataTyp() {
    return (getInt(beginCacheDataTyp));
  }
}
