package com.cloudframe.app.dto.c5427hpc;

/**
 * The class Work is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class Work extends WorkSerialized {

  private int respCode;

  private int resp2Code;

  private char[] swFirstTime = new char[1];

  private char[] swUseCache = new char[1];

  private char[] priorHipaaCd = new char[2];

  private char[] priorGrnrcRqstCd = new char[1];

  private char[] dphpctsq01 = new char[8];

  private short bcntrFetchOccurrance;

  private char[] tsQueueName = new char[16];

  private short tsqItem1;

  private int binsrchLow;

  private int binsrchMid;

  private int binsrchHigh;

  private char[] binsrchFound = Field.fillLowValue(1);

  /** Constructor for Work */
  public Work() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    setRespCode(0);
    setResp2Code(0);
    setSwFirstTime(("Y").toCharArray());
    setSwUseCache(("Y").toCharArray());
    setPriorHipaaCd(fillLowValue(2));
    setPriorGrnrcRqstCd(fillLowValue(1));
    setDphpctsq01(("DPHPCTSQ").toCharArray());
    setBcntrFetchOccurrance((short) 0);
    setTsQueueName(
        getString(
                new byte[] {
                  (byte) 0xC3,
                  (byte) 0xC1,
                  (byte) 0xC3,
                  (byte) 0xC8,
                  (byte) 0xC5,
                  (byte) 0x60,
                  (byte) 0xE3,
                  (byte) 0xD6,
                  (byte) 0xD7,
                  (byte) 0x60,
                  (byte) 0xC8,
                  (byte) 0xC9,
                  (byte) 0xD7,
                  (byte) 0xC1,
                  (byte) 0xD7,
                  (byte) 0xC3
                })
            .toCharArray());
    setTsqItem1((short) 1);
  }

  /**
   * Returns the value of respCode
   *
   * @return respCode
   */
  public int getRespCode() throws CFException {
    return respCode;
  }

  /**
   * Update RespCode with the passed value Corresponding COBOL Variable is WS-RESP-CODE
   *
   * @param number
   */
  public void setRespCode(int number) {
    // Truncate if the number is beyond +/- Max range
    respCode = checkRespCodeMaxLimit(number);
  }

  public void setRespCode(long number) {
    number = checkRespCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRespCode((int) number);
  }

  /**
   * Returns the value of resp2Code
   *
   * @return resp2Code
   */
  public int getResp2Code() throws CFException {
    return resp2Code;
  }

  /**
   * Update Resp2Code with the passed value Corresponding COBOL Variable is WS-RESP2-CODE
   *
   * @param number
   */
  public void setResp2Code(int number) {
    // Truncate if the number is beyond +/- Max range
    resp2Code = checkResp2CodeMaxLimit(number);
  }

  public void setResp2Code(long number) {
    number = checkResp2CodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setResp2Code((int) number);
  }

  /**
   * Returns the value of swFirstTime
   *
   * @return swFirstTime
   */
  public char[] getSwFirstTime() throws CFException {
    return swFirstTime;
  }

  /**
   * set variable swFirstTime Corresponding COBOL Variable is SW-FIRST-TIME
   *
   * @param value
   */
  public void setSwFirstTime(char[] value) {
    value = checkSwFirstTimeConstraints(value);
    arraycopy(value, 0, swFirstTime, 0, value.length);
  }

  public void setSwFirstTime(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, swFirstTime, 0, beginIndex + endIndex);
  }

  char[] swFirstTimeIsN88Value = "N".toCharArray();
  /**
   * Test condition "N" for isSwFirstTimeIsN()
   *
   * @return Returns true if isSwFirstTimeIsN() is "N"
   */
  public boolean isSwFirstTimeIsN() throws CFException {
    return (compareChars(getSwFirstTime(), swFirstTimeIsN88Value) == 0);
  }

  /** set values "N" */
  public void setSwFirstTimeIsNTrue() {
    setSwFirstTime(swFirstTimeIsN88Value);
  }

  char[] swFirstTimeIsY88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isSwFirstTimeIsY()
   *
   * @return Returns true if isSwFirstTimeIsY() is "Y"
   */
  public boolean isSwFirstTimeIsY() throws CFException {
    return (compareChars(getSwFirstTime(), swFirstTimeIsY88Value) == 0);
  }

  /** set values "Y" */
  public void setSwFirstTimeIsYTrue() {
    setSwFirstTime(swFirstTimeIsY88Value);
  }

  char[] swRetryIsY88Value = "R".toCharArray();
  /**
   * Test condition "R" for isSwRetryIsY()
   *
   * @return Returns true if isSwRetryIsY() is "R"
   */
  public boolean isSwRetryIsY() throws CFException {
    return (compareChars(getSwFirstTime(), swRetryIsY88Value) == 0);
  }

  /** set values "R" */
  public void setSwRetryIsYTrue() {
    setSwFirstTime(swRetryIsY88Value);
  }
  /**
   * Returns the value of swUseCache
   *
   * @return swUseCache
   */
  public char[] getSwUseCache() throws CFException {
    return swUseCache;
  }

  /**
   * set variable swUseCache Corresponding COBOL Variable is SW-USE-CACHE
   *
   * @param value
   */
  public void setSwUseCache(char[] value) {
    value = checkSwUseCacheConstraints(value);
    arraycopy(value, 0, swUseCache, 0, value.length);
  }

  public void setSwUseCache(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, swUseCache, 0, beginIndex + endIndex);
  }

  char[] swUseCacheIsN88Value = "N".toCharArray();
  /**
   * Test condition "N" for isSwUseCacheIsN()
   *
   * @return Returns true if isSwUseCacheIsN() is "N"
   */
  public boolean isSwUseCacheIsN() throws CFException {
    return (compareChars(getSwUseCache(), swUseCacheIsN88Value) == 0);
  }

  /** set values "N" */
  public void setSwUseCacheIsNTrue() {
    setSwUseCache(swUseCacheIsN88Value);
  }

  char[] swUseCacheIsY88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isSwUseCacheIsY()
   *
   * @return Returns true if isSwUseCacheIsY() is "Y"
   */
  public boolean isSwUseCacheIsY() throws CFException {
    return (compareChars(getSwUseCache(), swUseCacheIsY88Value) == 0);
  }

  /** set values "Y" */
  public void setSwUseCacheIsYTrue() {
    setSwUseCache(swUseCacheIsY88Value);
  }
  /**
   * Returns the value of priorHipaaCd
   *
   * @return priorHipaaCd
   */
  public char[] getPriorHipaaCd() throws CFException {
    return priorHipaaCd;
  }

  /**
   * set variable priorHipaaCd Corresponding COBOL Variable is PRIOR-HIPAA-CD
   *
   * @param value
   */
  public void setPriorHipaaCd(char[] value) {
    value = checkPriorHipaaCdConstraints(value);
    arraycopy(value, 0, priorHipaaCd, 0, value.length);
  }

  public void setPriorHipaaCd(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, priorHipaaCd, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of priorGrnrcRqstCd
   *
   * @return priorGrnrcRqstCd
   */
  public char[] getPriorGrnrcRqstCd() throws CFException {
    return priorGrnrcRqstCd;
  }

  /**
   * set variable priorGrnrcRqstCd Corresponding COBOL Variable is PRIOR-GRNRC-RQST-CD
   *
   * @param value
   */
  public void setPriorGrnrcRqstCd(char[] value) {
    value = checkPriorGrnrcRqstCdConstraints(value);
    arraycopy(value, 0, priorGrnrcRqstCd, 0, value.length);
  }

  public void setPriorGrnrcRqstCd(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, priorGrnrcRqstCd, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of dphpctsq01
   *
   * @return dphpctsq01
   */
  public char[] getDphpctsq01() throws CFException {
    return dphpctsq01;
  }

  /**
   * set variable dphpctsq01 Corresponding COBOL Variable is WS-DPHPCTSQ
   *
   * @param value
   */
  public void setDphpctsq01(char[] value) {
    value = checkDphpctsq01Constraints(value);
    arraycopy(value, 0, dphpctsq01, 0, value.length);
  }

  public void setDphpctsq01(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, dphpctsq01, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of bcntrFetchOccurrance
   *
   * @return bcntrFetchOccurrance
   */
  public short getBcntrFetchOccurrance() throws CFException {
    return bcntrFetchOccurrance;
  }

  /**
   * Update BcntrFetchOccurrance with the passed value Corresponding COBOL Variable is
   * BCNTR-FETCH-OCCURRANCE
   *
   * @param number
   */
  public void setBcntrFetchOccurrance(short number) {
    // Truncate if the number is beyond +/- Max range
    bcntrFetchOccurrance = checkBcntrFetchOccurranceMaxLimit(number);
  }

  public void setBcntrFetchOccurrance(int number) {
    number =
        checkBcntrFetchOccurranceMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setBcntrFetchOccurrance((short) number);
  }

  public void setBcntrFetchOccurrance(long number) {
    number =
        checkBcntrFetchOccurranceMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setBcntrFetchOccurrance((short) number);
  }

  /**
   * Returns the value of tsQueueName
   *
   * @return tsQueueName
   */
  public char[] getTsQueueName() throws CFException {
    return tsQueueName;
  }

  /**
   * set variable tsQueueName Corresponding COBOL Variable is WS-TS-QUEUE-NAME
   *
   * @param value
   */
  public void setTsQueueName(char[] value) {
    value = checkTsQueueNameConstraints(value);
    arraycopy(value, 0, tsQueueName, 0, value.length);
  }

  public void setTsQueueName(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, tsQueueName, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of tsqItem1
   *
   * @return tsqItem1
   */
  public short getTsqItem1() throws CFException {
    return tsqItem1;
  }

  /**
   * Update TsqItem1 with the passed value Corresponding COBOL Variable is WS-TSQ-ITEM1
   *
   * @param number
   */
  public void setTsqItem1(short number) {
    // Truncate if the number is beyond +/- Max range
    tsqItem1 = checkTsqItem1MaxLimit(number);
  }

  public void setTsqItem1(int number) {
    number = checkTsqItem1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setTsqItem1((short) number);
  }

  public void setTsqItem1(long number) {
    number = checkTsqItem1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setTsqItem1((short) number);
  }

  /**
   * Returns the value of binsrchLow
   *
   * @return binsrchLow
   */
  public int getBinsrchLow() throws CFException {
    return binsrchLow;
  }

  /**
   * Update BinsrchLow with the passed value Corresponding COBOL Variable is BINSRCH-LOW
   *
   * @param number
   */
  public void setBinsrchLow(int number) {
    // Truncate if the number is beyond +/- Max range
    binsrchLow = checkBinsrchLowMaxLimit(number);
  }

  public void setBinsrchLow(long number) {
    number = checkBinsrchLowMaxLimit(number); // Truncate if value is beyond +/- Max range
    setBinsrchLow((int) number);
  }

  /**
   * Returns the value of binsrchMid
   *
   * @return binsrchMid
   */
  public int getBinsrchMid() throws CFException {
    return binsrchMid;
  }

  /**
   * Update BinsrchMid with the passed value Corresponding COBOL Variable is BINSRCH-MID
   *
   * @param number
   */
  public void setBinsrchMid(int number) {
    // Truncate if the number is beyond +/- Max range
    binsrchMid = checkBinsrchMidMaxLimit(number);
  }

  public void setBinsrchMid(long number) {
    number = checkBinsrchMidMaxLimit(number); // Truncate if value is beyond +/- Max range
    setBinsrchMid((int) number);
  }

  /**
   * Returns the value of binsrchHigh
   *
   * @return binsrchHigh
   */
  public int getBinsrchHigh() throws CFException {
    return binsrchHigh;
  }

  /**
   * Update BinsrchHigh with the passed value Corresponding COBOL Variable is BINSRCH-HIGH
   *
   * @param number
   */
  public void setBinsrchHigh(int number) {
    // Truncate if the number is beyond +/- Max range
    binsrchHigh = checkBinsrchHighMaxLimit(number);
  }

  public void setBinsrchHigh(long number) {
    number = checkBinsrchHighMaxLimit(number); // Truncate if value is beyond +/- Max range
    setBinsrchHigh((int) number);
  }

  /**
   * Returns the value of binsrchFound
   *
   * @return binsrchFound
   */
  public char[] getBinsrchFound() throws CFException {
    return binsrchFound;
  }

  /**
   * set variable binsrchFound Corresponding COBOL Variable is BINSRCH-FOUND
   *
   * @param value
   */
  public void setBinsrchFound(char[] value) {
    value = checkBinsrchFoundConstraints(value);
    arraycopy(value, 0, binsrchFound, 0, value.length);
  }

  public void setBinsrchFound(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, binsrchFound, 0, beginIndex + endIndex);
  }

  char[] binsrchFoundIsN88Value = "N".toCharArray();
  /**
   * Test condition "N" for isBinsrchFoundIsN()
   *
   * @return Returns true if isBinsrchFoundIsN() is "N"
   */
  public boolean isBinsrchFoundIsN() throws CFException {
    return (compareChars(getBinsrchFound(), binsrchFoundIsN88Value) == 0);
  }

  /** set values "N" */
  public void setBinsrchFoundIsNTrue() {
    setBinsrchFound(binsrchFoundIsN88Value);
  }

  char[] binsrchFoundIsY88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isBinsrchFoundIsY()
   *
   * @return Returns true if isBinsrchFoundIsY() is "Y"
   */
  public boolean isBinsrchFoundIsY() throws CFException {
    return (compareChars(getBinsrchFound(), binsrchFoundIsY88Value) == 0);
  }

  /** set values "Y" */
  public void setBinsrchFoundIsYTrue() {
    setBinsrchFound(binsrchFoundIsY88Value);
  }

  public static int getWorkFieldLength() {
    return WORK_LENGTH;
  }
}
