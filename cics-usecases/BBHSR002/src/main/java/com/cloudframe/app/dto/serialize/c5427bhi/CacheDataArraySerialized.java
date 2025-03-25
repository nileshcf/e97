package com.cloudframe.app.dto.serialize.c5427bhi;

/**
 * The class CacheDataArraySerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheDataArraySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheDataArraySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_DATA_ARRAY_LENGTH = 351;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCacheNtwkTypCd;
  protected int beginCacheEffDt;
  protected int beginCacheCancDt;
  protected int beginCacheSrvcCd;
  protected int beginCachePlOfSrvcCd;
  protected int beginCacheCausCd;
  protected int beginCacheBenLvlCd;
  protected int beginCacheInNtwkClssCd;
  protected int beginCacheTier1NtwkClssCd;
  protected int beginCacheProcCdRngBegnVal;
  protected int beginCacheProcCdRngEndVal;
  protected int beginCacheProcCdRngTypVal;
  protected int beginCacheProvOrgTypCd;
  protected int beginCacheHipaaCommtTxt;

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
    beginCacheNtwkTypCd = getStartOffset() + 0; // set offset for serialization

    beginCacheEffDt = getStartOffset() + 1; // set offset for serialization

    beginCacheCancDt = getStartOffset() + 11; // set offset for serialization

    beginCacheSrvcCd = getStartOffset() + 21; // set offset for serialization

    beginCachePlOfSrvcCd = getStartOffset() + 27; // set offset for serialization

    beginCacheCausCd = getStartOffset() + 29; // set offset for serialization

    beginCacheBenLvlCd = getStartOffset() + 30; // set offset for serialization

    beginCacheInNtwkClssCd = getStartOffset() + 31; // set offset for serialization

    beginCacheTier1NtwkClssCd = getStartOffset() + 32; // set offset for serialization

    beginCacheProcCdRngBegnVal = getStartOffset() + 33; // set offset for serialization

    beginCacheProcCdRngEndVal = getStartOffset() + 40; // set offset for serialization

    beginCacheProcCdRngTypVal = getStartOffset() + 47; // set offset for serialization

    beginCacheProvOrgTypCd = getStartOffset() + 48; // set offset for serialization

    beginCacheHipaaCommtTxt = getStartOffset() + 51; // set offset for serialization

    /*  end of offset */
  }

  int localCacheNtwkTypCdCounter = -1;

  public boolean isCacheNtwkTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheNtwkTypCdCounter != sharedCounter;
    localCacheNtwkTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_NTWK_TYP_CD_LEN = 1;
  /** serialize this CacheNtwkTypCd */
  protected void serializeCacheNtwkTypCd(char[] cacheNtwkTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheNtwkTypCd, 0, getStringValue(), beginCacheNtwkTypCd, CACHE_NTWK_TYP_CD_LEN);
    localCacheNtwkTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheNtwkTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheNtwkTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheNtwkTypCd() {
    return (substring(
        getStringValue(), beginCacheNtwkTypCd, beginCacheNtwkTypCd + CACHE_NTWK_TYP_CD_LEN));
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

  int localCachePlOfSrvcCdCounter = -1;

  public boolean isCachePlOfSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCachePlOfSrvcCdCounter != sharedCounter;
    localCachePlOfSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_PL_OF_SRVC_CD_LEN = 2;
  /** serialize this CachePlOfSrvcCd */
  protected void serializeCachePlOfSrvcCd(char[] cachePlOfSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cachePlOfSrvcCd, 0, getStringValue(), beginCachePlOfSrvcCd, CACHE_PL_OF_SRVC_CD_LEN);
    localCachePlOfSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCachePlOfSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCachePlOfSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCachePlOfSrvcCd() {
    return (substring(
        getStringValue(), beginCachePlOfSrvcCd, beginCachePlOfSrvcCd + CACHE_PL_OF_SRVC_CD_LEN));
  }

  int localCacheCausCdCounter = -1;

  public boolean isCacheCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheCausCdCounter != sharedCounter;
    localCacheCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_CAUS_CD_LEN = 1;
  /** serialize this CacheCausCd */
  protected void serializeCacheCausCd(char[] cacheCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheCausCd, 0, getStringValue(), beginCacheCausCd, CACHE_CAUS_CD_LEN);
    localCacheCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheCausCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCacheCausCd() {
    return (substring(getStringValue(), beginCacheCausCd, beginCacheCausCd + CACHE_CAUS_CD_LEN));
  }

  int localCacheBenLvlCdCounter = -1;

  public boolean isCacheBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheBenLvlCdCounter != sharedCounter;
    localCacheBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_BEN_LVL_CD_LEN = 1;
  /** serialize this CacheBenLvlCd */
  protected void serializeCacheBenLvlCd(char[] cacheBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cacheBenLvlCd, 0, getStringValue(), beginCacheBenLvlCd, CACHE_BEN_LVL_CD_LEN);
    localCacheBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheBenLvlCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheBenLvlCd() {
    return (substring(
        getStringValue(), beginCacheBenLvlCd, beginCacheBenLvlCd + CACHE_BEN_LVL_CD_LEN));
  }

  int localCacheInNtwkClssCdCounter = -1;

  public boolean isCacheInNtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheInNtwkClssCdCounter != sharedCounter;
    localCacheInNtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_IN_NTWK_CLSS_CD_LEN = 1;
  /** serialize this CacheInNtwkClssCd */
  protected void serializeCacheInNtwkClssCd(char[] cacheInNtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheInNtwkClssCd, 0, getStringValue(), beginCacheInNtwkClssCd, CACHE_IN_NTWK_CLSS_CD_LEN);
    localCacheInNtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheInNtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheInNtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheInNtwkClssCd() {
    return (substring(
        getStringValue(),
        beginCacheInNtwkClssCd,
        beginCacheInNtwkClssCd + CACHE_IN_NTWK_CLSS_CD_LEN));
  }

  int localCacheTier1NtwkClssCdCounter = -1;

  public boolean isCacheTier1NtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheTier1NtwkClssCdCounter != sharedCounter;
    localCacheTier1NtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_TIER_1_NTWK_CLSS_CD_LEN = 1;
  /** serialize this CacheTier1NtwkClssCd */
  protected void serializeCacheTier1NtwkClssCd(char[] cacheTier1NtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheTier1NtwkClssCd,
        0,
        getStringValue(),
        beginCacheTier1NtwkClssCd,
        CACHE_TIER_1_NTWK_CLSS_CD_LEN);
    localCacheTier1NtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheTier1NtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheTier1NtwkClssCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheTier1NtwkClssCd() {
    return (substring(
        getStringValue(),
        beginCacheTier1NtwkClssCd,
        beginCacheTier1NtwkClssCd + CACHE_TIER_1_NTWK_CLSS_CD_LEN));
  }

  int localCacheProcCdRngBegnValCounter = -1;

  public boolean isCacheProcCdRngBegnValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheProcCdRngBegnValCounter != sharedCounter;
    localCacheProcCdRngBegnValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_PROC_CD_RNG_BEGN_VAL_LEN = 7;
  /** serialize this CacheProcCdRngBegnVal */
  protected void serializeCacheProcCdRngBegnVal(char[] cacheProcCdRngBegnVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheProcCdRngBegnVal,
        0,
        getStringValue(),
        beginCacheProcCdRngBegnVal,
        CACHE_PROC_CD_RNG_BEGN_VAL_LEN);
    localCacheProcCdRngBegnValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheProcCdRngBegnValConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshCacheProcCdRngBegnVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheProcCdRngBegnVal() {
    return (substring(
        getStringValue(),
        beginCacheProcCdRngBegnVal,
        beginCacheProcCdRngBegnVal + CACHE_PROC_CD_RNG_BEGN_VAL_LEN));
  }

  int localCacheProcCdRngEndValCounter = -1;

  public boolean isCacheProcCdRngEndValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheProcCdRngEndValCounter != sharedCounter;
    localCacheProcCdRngEndValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_PROC_CD_RNG_END_VAL_LEN = 7;
  /** serialize this CacheProcCdRngEndVal */
  protected void serializeCacheProcCdRngEndVal(char[] cacheProcCdRngEndVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheProcCdRngEndVal,
        0,
        getStringValue(),
        beginCacheProcCdRngEndVal,
        CACHE_PROC_CD_RNG_END_VAL_LEN);
    localCacheProcCdRngEndValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheProcCdRngEndValConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshCacheProcCdRngEndVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheProcCdRngEndVal() {
    return (substring(
        getStringValue(),
        beginCacheProcCdRngEndVal,
        beginCacheProcCdRngEndVal + CACHE_PROC_CD_RNG_END_VAL_LEN));
  }

  int localCacheProcCdRngTypValCounter = -1;

  public boolean isCacheProcCdRngTypValModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheProcCdRngTypValCounter != sharedCounter;
    localCacheProcCdRngTypValCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_PROC_CD_RNG_TYP_VAL_LEN = 1;
  /** serialize this CacheProcCdRngTypVal */
  protected void serializeCacheProcCdRngTypVal(char[] cacheProcCdRngTypVal) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheProcCdRngTypVal,
        0,
        getStringValue(),
        beginCacheProcCdRngTypVal,
        CACHE_PROC_CD_RNG_TYP_VAL_LEN);
    localCacheProcCdRngTypValCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheProcCdRngTypValConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCacheProcCdRngTypVal is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshCacheProcCdRngTypVal() {
    return (substring(
        getStringValue(),
        beginCacheProcCdRngTypVal,
        beginCacheProcCdRngTypVal + CACHE_PROC_CD_RNG_TYP_VAL_LEN));
  }

  int localCacheProvOrgTypCdCounter = -1;

  public boolean isCacheProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheProvOrgTypCdCounter != sharedCounter;
    localCacheProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this CacheProvOrgTypCd */
  protected void serializeCacheProvOrgTypCd(char[] cacheProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheProvOrgTypCd, 0, getStringValue(), beginCacheProvOrgTypCd, CACHE_PROV_ORG_TYP_CD_LEN);
    localCacheProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshCacheProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheProvOrgTypCd() {
    return (substring(
        getStringValue(),
        beginCacheProvOrgTypCd,
        beginCacheProvOrgTypCd + CACHE_PROV_ORG_TYP_CD_LEN));
  }

  int localCacheHipaaCommtTxtCounter = -1;

  public boolean isCacheHipaaCommtTxtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCacheHipaaCommtTxtCounter != sharedCounter;
    localCacheHipaaCommtTxtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CACHE_HIPAA_COMMT_TXT_LEN = 300;
  /** serialize this CacheHipaaCommtTxt */
  protected void serializeCacheHipaaCommtTxt(char[] cacheHipaaCommtTxt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        cacheHipaaCommtTxt,
        0,
        getStringValue(),
        beginCacheHipaaCommtTxt,
        CACHE_HIPAA_COMMT_TXT_LEN);
    localCacheHipaaCommtTxtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCacheHipaaCommtTxtConstraints(char[] value) {
    return super.checkConstraints(value, 300, false, false);
  }
  /**
   * refreshCacheHipaaCommtTxt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCacheHipaaCommtTxt() {
    return (substring(
        getStringValue(),
        beginCacheHipaaCommtTxt,
        beginCacheHipaaCommtTxt + CACHE_HIPAA_COMMT_TXT_LEN));
  }
}
