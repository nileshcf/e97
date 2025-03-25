package com.cloudframe.app.dto.serialize.c5427hpc;

/**
 * The class CacheTsqRecordSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheTsqRecordSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheTsqRecordSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_TSQ_RECORD_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginTsqCacheAddress;
  protected int beginTsqCachePtr;

  /** Constructor for CacheTsqRecordSerialized */
  public CacheTsqRecordSerialized() {
    init(0);
  }

  /** initializes the field in CacheTsqRecordSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_TSQ_RECORD_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginTsqCacheAddress = getStartOffset() + 0; // set offset for serialization

    beginTsqCachePtr = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localTsqCacheAddressCounter = -1;

  public boolean isTsqCacheAddressModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTsqCacheAddressCounter != sharedCounter;
    localTsqCacheAddressCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TSQ_CACHE_ADDRESS_LEN = 4;
  /** serializeTsqCacheAddress */
  protected void serializeTsqCacheAddress(int tsqCacheAddress) {
    replaceValue( //  save the value as string
        getBinaryString(tsqCacheAddress, TSQ_CACHE_ADDRESS_LEN),
        beginTsqCacheAddress,
        TSQ_CACHE_ADDRESS_LEN);
    localTsqCacheAddressCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkTsqCacheAddressMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshTsqCacheAddress is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshTsqCacheAddress() {
    return (getInt(beginTsqCacheAddress));
  }

  int localTsqCachePtrCounter = -1;

  public boolean isTsqCachePtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTsqCachePtrCounter != sharedCounter;
    localTsqCachePtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TSQ_CACHE_PTR_LEN = 4;
  /** serializeTsqCachePtr */
  protected void serializeTsqCachePtr(int tsqCachePtr) {
    replaceValue( //  save the value as string
        getBinaryString(tsqCachePtr, TSQ_CACHE_PTR_LEN), beginTsqCachePtr, TSQ_CACHE_PTR_LEN);
    localTsqCachePtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkTsqCachePtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshTsqCachePtr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshTsqCachePtr() {
    return (getInt(beginTsqCachePtr));
  }
}
