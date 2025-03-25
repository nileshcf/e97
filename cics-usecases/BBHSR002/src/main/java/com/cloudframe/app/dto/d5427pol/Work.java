package com.cloudframe.app.dto.d5427pol;

/**
 * The class Work is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class Work extends WorkSerialized {

  private char[] mxiFirstTime = Field.fillLowValue(1);

  private char[] topsPrdctCdSw = Field.fillLowValue(1);

  private int sqlcode_Ws;

  /** Constructor for Work */
  public Work() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of mxiFirstTime
   *
   * @return mxiFirstTime
   */
  public char[] getMxiFirstTime() throws CFException {
    return mxiFirstTime;
  }

  /**
   * set variable mxiFirstTime Corresponding COBOL Variable is WS-MXI-FIRST-TIME
   *
   * @param value
   */
  public void setMxiFirstTime(char[] value) {
    value = checkMxiFirstTimeConstraints(value);
    arraycopy(value, 0, mxiFirstTime, 0, value.length);
  }

  public void setMxiFirstTime(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, mxiFirstTime, 0, beginIndex + endIndex);
  }

  char[] mxiFirstTimeYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isMxiFirstTimeYes()
   *
   * @return Returns true if isMxiFirstTimeYes() is "Y"
   */
  public boolean isMxiFirstTimeYes() throws CFException {
    return (compareChars(getMxiFirstTime(), mxiFirstTimeYes88Value) == 0);
  }

  /** set values "Y" */
  public void setMxiFirstTimeYesTrue() {
    setMxiFirstTime(mxiFirstTimeYes88Value);
  }

  char[] mxiFirstTimeNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isMxiFirstTimeNo()
   *
   * @return Returns true if isMxiFirstTimeNo() is "N"
   */
  public boolean isMxiFirstTimeNo() throws CFException {
    return (compareChars(getMxiFirstTime(), mxiFirstTimeNo88Value) == 0);
  }

  /** set values "N" */
  public void setMxiFirstTimeNoTrue() {
    setMxiFirstTime(mxiFirstTimeNo88Value);
  }
  /**
   * Returns the value of topsPrdctCdSw
   *
   * @return topsPrdctCdSw
   */
  public char[] getTopsPrdctCdSw() throws CFException {
    return topsPrdctCdSw;
  }

  /**
   * set variable topsPrdctCdSw Corresponding COBOL Variable is WS-TOPS-PRDCT-CD-SW
   *
   * @param value
   */
  public void setTopsPrdctCdSw(char[] value) {
    value = checkTopsPrdctCdSwConstraints(value);
    arraycopy(value, 0, topsPrdctCdSw, 0, value.length);
  }

  public void setTopsPrdctCdSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, topsPrdctCdSw, 0, beginIndex + endIndex);
  }

  char[] topsPrdctCdPresent88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isTopsPrdctCdPresent()
   *
   * @return Returns true if isTopsPrdctCdPresent() is "Y"
   */
  public boolean isTopsPrdctCdPresent() throws CFException {
    return (compareChars(getTopsPrdctCdSw(), topsPrdctCdPresent88Value) == 0);
  }

  /** set values "Y" */
  public void setTopsPrdctCdPresentTrue() {
    setTopsPrdctCdSw(topsPrdctCdPresent88Value);
  }

  char[] topsPrdctCdAbsent88Value = "N".toCharArray();
  /**
   * Test condition "N" for isTopsPrdctCdAbsent()
   *
   * @return Returns true if isTopsPrdctCdAbsent() is "N"
   */
  public boolean isTopsPrdctCdAbsent() throws CFException {
    return (compareChars(getTopsPrdctCdSw(), topsPrdctCdAbsent88Value) == 0);
  }

  /** set values "N" */
  public void setTopsPrdctCdAbsentTrue() {
    setTopsPrdctCdSw(topsPrdctCdAbsent88Value);
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
