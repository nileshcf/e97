package com.cloudframe.app.dto.c5427hpc;

/**
 * The class CacheTsqRecord is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class CacheTsqRecord extends CacheTsqRecordSerialized {

  private int tsqCacheAddress;

  private int tsqCachePtr;

  /** Constructor for CacheTsqRecord */
  public CacheTsqRecord() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of tsqCacheAddress
   *
   * @return tsqCacheAddress
   */
  public int getTsqCacheAddress() throws CFException {
    if (isTsqCacheAddressModified()) {
      tsqCacheAddress = refreshTsqCacheAddress();
    }
    return tsqCacheAddress;
  }

  /**
   * Update TsqCacheAddress with the passed value Corresponding COBOL Variable is TSQ-CACHE-ADDRESS
   *
   * @param number
   */
  public void setTsqCacheAddress(int number) {
    // Truncate if the number is beyond +/- Max range
    tsqCacheAddress = checkTsqCacheAddressMaxLimit(number);
    serializeTsqCacheAddress(tsqCacheAddress);
  }

  public void setTsqCacheAddress(long number) {
    number = checkTsqCacheAddressMaxLimit(number); // Truncate if value is beyond +/- Max range
    setTsqCacheAddress((int) number);
  }

  /**
   * Returns the value of tsqCachePtr
   *
   * @return tsqCachePtr
   */
  public int getTsqCachePtr() throws CFException {
    if (isTsqCachePtrModified()) {
      tsqCachePtr = refreshTsqCachePtr();
    }
    return tsqCachePtr;
  }

  /**
   * Update TsqCachePtr with the passed value Corresponding COBOL Variable is TSQ-CACHE-PTR
   *
   * @param number
   */
  public void setTsqCachePtr(int number) {
    // Truncate if the number is beyond +/- Max range
    tsqCachePtr = checkTsqCachePtrMaxLimit(number);
    serializeTsqCachePtr(tsqCachePtr);
  }

  public void setTsqCachePtr(long number) {
    number = checkTsqCachePtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setTsqCachePtr((int) number);
  }

  public static int getCacheTsqRecordFieldLength() {
    return CACHE_TSQ_RECORD_LENGTH;
  }
}
