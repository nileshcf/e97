package com.cloudframe.app.dto.d5427scn;

/**
 * The class Work is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class Work extends WorkSerialized {

  private char[] dsmPgmName = new char[8];

  private int respCode;

  private int resp2Code;

  private char[] tsQueueName = new char[16];

  private short tsqItem1;

  private char[] csrchFoundSw = Field.fillLowValue(1);

  private int binsrchLow;

  private int binsrchMid;

  private int binsrchHigh;

  private char[] binsrchFound = Field.fillLowValue(1);

  private int sqlcode_Ws;

  /** Constructor for Work */
  public Work() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    setDsmPgmName(("D5427SCN").toCharArray());
    setRespCode(0);
    setResp2Code(0);
    setTsQueueName(("CACHE-TOP-SRVCDT").toCharArray());
    setTsqItem1((short) 1);
  }

  /**
   * Returns the value of dsmPgmName
   *
   * @return dsmPgmName
   */
  public char[] getDsmPgmName() throws CFException {
    return dsmPgmName;
  }

  /**
   * set variable dsmPgmName Corresponding COBOL Variable is WS-DSM-PGM-NAME
   *
   * @param value
   */
  public void setDsmPgmName(char[] value) {
    value = checkDsmPgmNameConstraints(value);
    arraycopy(value, 0, dsmPgmName, 0, value.length);
  }

  public void setDsmPgmName(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, dsmPgmName, 0, beginIndex + endIndex);
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
   * Returns the value of csrchFoundSw
   *
   * @return csrchFoundSw
   */
  public char[] getCsrchFoundSw() throws CFException {
    return csrchFoundSw;
  }

  /**
   * set variable csrchFoundSw Corresponding COBOL Variable is CSRCH-FOUND-SW
   *
   * @param value
   */
  public void setCsrchFoundSw(char[] value) {
    value = checkCsrchFoundSwConstraints(value);
    arraycopy(value, 0, csrchFoundSw, 0, value.length);
  }

  public void setCsrchFoundSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, csrchFoundSw, 0, beginIndex + endIndex);
  }

  char[] csrchFoundSwIsYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCsrchFoundSwIsYes()
   *
   * @return Returns true if isCsrchFoundSwIsYes() is "Y"
   */
  public boolean isCsrchFoundSwIsYes() throws CFException {
    return (compareChars(getCsrchFoundSw(), csrchFoundSwIsYes88Value) == 0);
  }

  /** set values "Y" */
  public void setCsrchFoundSwIsYesTrue() {
    setCsrchFoundSw(csrchFoundSwIsYes88Value);
  }

  char[] csrchFoundSwIsNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCsrchFoundSwIsNo()
   *
   * @return Returns true if isCsrchFoundSwIsNo() is "N"
   */
  public boolean isCsrchFoundSwIsNo() throws CFException {
    return (compareChars(getCsrchFoundSw(), csrchFoundSwIsNo88Value) == 0);
  }

  /** set values "N" */
  public void setCsrchFoundSwIsNoTrue() {
    setCsrchFoundSw(csrchFoundSwIsNo88Value);
  }

  char[] csrchFoundSwIsOverflow88Value = "?".toCharArray();
  /**
   * Test condition "?" for isCsrchFoundSwIsOverflow()
   *
   * @return Returns true if isCsrchFoundSwIsOverflow() is "?"
   */
  public boolean isCsrchFoundSwIsOverflow() throws CFException {
    return (compareChars(getCsrchFoundSw(), csrchFoundSwIsOverflow88Value) == 0);
  }

  /** set values "?" */
  public void setCsrchFoundSwIsOverflowTrue() {
    setCsrchFoundSw(csrchFoundSwIsOverflow88Value);
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
  /**
   * Returns the value of sqlcode_Ws
   *
   * @return sqlcode_Ws
   */
  public int getSqlcode_Ws() throws CFException {
    return sqlcode_Ws;
  }

  /**
   * Update Sqlcode_Ws with the passed value Corresponding COBOL Variable is WS-SQLCODE
   *
   * @param number
   */
  public void setSqlcode_Ws(int number) {
    // Truncate if the number is beyond +/- Max range
    sqlcode_Ws = checkSqlcode_WsMaxLimit(number);
  }

  public void setSqlcode_Ws(long number) {
    number = checkSqlcode_WsMaxLimit(number); // Truncate if value is beyond +/- Max range
    setSqlcode_Ws((int) number);
  }

  /**
   * Test condition 0 for isSqlcodeOk()
   *
   * @return Returns true if isSqlcodeOk() is 0
   */
  public boolean isSqlcodeOk() throws CFException {
    return (getSqlcode_Ws() == 0);
  }

  /** set values 0 */
  public void setSqlcodeOkTrue() {
    setSqlcode_Ws(0);
  }

  /**
   * Test condition 100 -305 for isSqlcodeNotFound()
   *
   * @return Returns true if isSqlcodeNotFound() is 100 -305
   */
  public boolean isSqlcodeNotFound() throws CFException {
    return (getSqlcode_Ws() == 100 || getSqlcode_Ws() == -305);
  }

  /** set values 100 -305 */
  public void setSqlcodeNotFoundTrue() {
    setSqlcode_Ws(100);
  }

  /**
   * Test condition 100 for isSqlcodeFetchEnd()
   *
   * @return Returns true if isSqlcodeFetchEnd() is 100
   */
  public boolean isSqlcodeFetchEnd() throws CFException {
    return (getSqlcode_Ws() == 100);
  }

  /** set values 100 */
  public void setSqlcodeFetchEndTrue() {
    setSqlcode_Ws(100);
  }

  /**
   * Test condition 0 THRU 999 for isSqlcodePositive()
   *
   * @return Returns true if isSqlcodePositive() is 0 THRU 999
   */
  public boolean isSqlcodePositive() throws CFException {
    return ((getSqlcode_Ws() >= 0) && (getSqlcode_Ws() <= 999));
  }

  /** set values 0 THRU 999 */
  public void setSqlcodePositiveTrue() {
    setSqlcode_Ws(0);
  }

  /**
   * Test condition -999 THRU -1 for isSqlcodeNegative()
   *
   * @return Returns true if isSqlcodeNegative() is -999 THRU -1
   */
  public boolean isSqlcodeNegative() throws CFException {
    return ((getSqlcode_Ws() >= -999) && (getSqlcode_Ws() <= -1));
  }

  /** set values -999 THRU -1 */
  public void setSqlcodeNegativeTrue() {
    setSqlcode_Ws(-999);
  }

  /**
   * Test condition -180 -181 for isSqlcodeInvalidDate()
   *
   * @return Returns true if isSqlcodeInvalidDate() is -180 -181
   */
  public boolean isSqlcodeInvalidDate() throws CFException {
    return (getSqlcode_Ws() == -180 || getSqlcode_Ws() == -181);
  }

  /** set values -180 -181 */
  public void setSqlcodeInvalidDateTrue() {
    setSqlcode_Ws(-180);
  }

  /**
   * Test condition -305 for isSqlcodeNullValueReturned()
   *
   * @return Returns true if isSqlcodeNullValueReturned() is -305
   */
  public boolean isSqlcodeNullValueReturned() throws CFException {
    return (getSqlcode_Ws() == -305);
  }

  /** set values -305 */
  public void setSqlcodeNullValueReturnedTrue() {
    setSqlcode_Ws(-305);
  }

  /**
   * Test condition -413 for isSqlcodeOverflow()
   *
   * @return Returns true if isSqlcodeOverflow() is -413
   */
  public boolean isSqlcodeOverflow() throws CFException {
    return (getSqlcode_Ws() == -413);
  }

  /** set values -413 */
  public void setSqlcodeOverflowTrue() {
    setSqlcode_Ws(-413);
  }

  /**
   * Test condition -509 THRU -501 for isSqlcodeCursorErr()
   *
   * @return Returns true if isSqlcodeCursorErr() is -509 THRU -501
   */
  public boolean isSqlcodeCursorErr() throws CFException {
    return ((getSqlcode_Ws() >= -509) && (getSqlcode_Ws() <= -501));
  }

  /** set values -509 THRU -501 */
  public void setSqlcodeCursorErrTrue() {
    setSqlcode_Ws(-509);
  }

  /**
   * Test condition -803 for isSqlcodeDupViolation()
   *
   * @return Returns true if isSqlcodeDupViolation() is -803
   */
  public boolean isSqlcodeDupViolation() throws CFException {
    return (getSqlcode_Ws() == -803);
  }

  /** set values -803 */
  public void setSqlcodeDupViolationTrue() {
    setSqlcode_Ws(-803);
  }

  /**
   * Test condition -805 -818 for isSqlcodeBindErr()
   *
   * @return Returns true if isSqlcodeBindErr() is -805 -818
   */
  public boolean isSqlcodeBindErr() throws CFException {
    return (getSqlcode_Ws() == -805 || getSqlcode_Ws() == -818);
  }

  /** set values -805 -818 */
  public void setSqlcodeBindErrTrue() {
    setSqlcode_Ws(-805);
  }

  /**
   * Test condition -811 for isSqlcodeMultRows()
   *
   * @return Returns true if isSqlcodeMultRows() is -811
   */
  public boolean isSqlcodeMultRows() throws CFException {
    return (getSqlcode_Ws() == -811);
  }

  /** set values -811 */
  public void setSqlcodeMultRowsTrue() {
    setSqlcode_Ws(-811);
  }

  /**
   * Test condition -900 for isSqlcodeNoServer()
   *
   * @return Returns true if isSqlcodeNoServer() is -900
   */
  public boolean isSqlcodeNoServer() throws CFException {
    return (getSqlcode_Ws() == -900);
  }

  /** set values -900 */
  public void setSqlcodeNoServerTrue() {
    setSqlcode_Ws(-900);
  }

  /**
   * Test condition -901 for isSqlcodeDb2SysErr()
   *
   * @return Returns true if isSqlcodeDb2SysErr() is -901
   */
  public boolean isSqlcodeDb2SysErr() throws CFException {
    return (getSqlcode_Ws() == -901);
  }

  /** set values -901 */
  public void setSqlcodeDb2SysErrTrue() {
    setSqlcode_Ws(-901);
  }

  /**
   * Test condition -904 for isSqlcodeResourceErr()
   *
   * @return Returns true if isSqlcodeResourceErr() is -904
   */
  public boolean isSqlcodeResourceErr() throws CFException {
    return (getSqlcode_Ws() == -904);
  }

  /** set values -904 */
  public void setSqlcodeResourceErrTrue() {
    setSqlcode_Ws(-904);
  }

  /**
   * Test condition -905 for isSqlcodeTimeOut()
   *
   * @return Returns true if isSqlcodeTimeOut() is -905
   */
  public boolean isSqlcodeTimeOut() throws CFException {
    return (getSqlcode_Ws() == -905);
  }

  /** set values -905 */
  public void setSqlcodeTimeOutTrue() {
    setSqlcode_Ws(-905);
  }

  /**
   * Test condition -911 for isSqlcodeDeadlockNorb()
   *
   * @return Returns true if isSqlcodeDeadlockNorb() is -911
   */
  public boolean isSqlcodeDeadlockNorb() throws CFException {
    return (getSqlcode_Ws() == -911);
  }

  /** set values -911 */
  public void setSqlcodeDeadlockNorbTrue() {
    setSqlcode_Ws(-911);
  }

  /**
   * Test condition -913 for isSqlcodeDeadlockRb()
   *
   * @return Returns true if isSqlcodeDeadlockRb() is -913
   */
  public boolean isSqlcodeDeadlockRb() throws CFException {
    return (getSqlcode_Ws() == -913);
  }

  /** set values -913 */
  public void setSqlcodeDeadlockRbTrue() {
    setSqlcode_Ws(-913);
  }

  /**
   * Test condition -922 for isSqlcodePlanSecurityErr()
   *
   * @return Returns true if isSqlcodePlanSecurityErr() is -922
   */
  public boolean isSqlcodePlanSecurityErr() throws CFException {
    return (getSqlcode_Ws() == -922);
  }

  /** set values -922 */
  public void setSqlcodePlanSecurityErrTrue() {
    setSqlcode_Ws(-922);
  }

  public static int getWorkFieldLength() {
    return WORK_LENGTH;
  }
}
