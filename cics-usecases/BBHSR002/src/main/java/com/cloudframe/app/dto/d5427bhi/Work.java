package com.cloudframe.app.dto.d5427bhi;

/**
 * The class Work is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class Work extends WorkSerialized {

  private int sub;

  private int rowSub;

  private int retryCnt;

  private int rowCount;

  private int startingRowNbr;

  private char[] dbhiFirstTime = new char[1];

  private char[] actIndSwitch = new char[1];

  private char[] endOfCsrSw = new char[1];

  private char[] retAreaLimit = new char[1];

  private char[] hcaTables = new char[6];

  private short nullInd;

  private char[] returnCode = new char[2];

  private char[] c5427bhi01 = new char[8];

  private int sqlcode_Ws;

  /** Constructor for Work */
  public Work() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    setSub(0);
    setRowSub(0);
    setRetryCnt(0);
    setRowCount(0);
    setStartingRowNbr(1);
    setDbhiFirstTime(fillSpace(1));
    setActIndSwitch(fillSpace(1));
    setEndOfCsrSw(("N").toCharArray());
    setRetAreaLimit(("N").toCharArray());
    setHcaTables(fillSpace(6));
    setNullInd((short) 0);
    setReturnCode(fillSpace(2));
    setC5427bhi01(("C5427BHI").toCharArray());
  }

  /**
   * Returns the value of sub
   *
   * @return sub
   */
  public int getSub() throws CFException {
    return sub;
  }

  /**
   * Update Sub with the passed value Corresponding COBOL Variable is WS-SUB
   *
   * @param number
   */
  public void setSub(int number) {
    // Truncate if the number is beyond +/- Max range
    sub = checkSubMaxLimit(number);
  }

  public void setSub(long number) {
    number = checkSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setSub((int) number);
  }

  /**
   * Returns the value of rowSub
   *
   * @return rowSub
   */
  public int getRowSub() throws CFException {
    return rowSub;
  }

  /**
   * Update RowSub with the passed value Corresponding COBOL Variable is WS-ROW-SUB
   *
   * @param number
   */
  public void setRowSub(int number) {
    // Truncate if the number is beyond +/- Max range
    rowSub = checkRowSubMaxLimit(number);
  }

  public void setRowSub(long number) {
    number = checkRowSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRowSub((int) number);
  }

  /**
   * Returns the value of retryCnt
   *
   * @return retryCnt
   */
  public int getRetryCnt() throws CFException {
    return retryCnt;
  }

  /**
   * Update RetryCnt with the passed value Corresponding COBOL Variable is WS-RETRY-CNT
   *
   * @param number
   */
  public void setRetryCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    retryCnt = checkRetryCntMaxLimit(number);
  }

  public void setRetryCnt(long number) {
    number = checkRetryCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRetryCnt((int) number);
  }

  /**
   * Returns the value of rowCount
   *
   * @return rowCount
   */
  public int getRowCount() throws CFException {
    return rowCount;
  }

  /**
   * Update RowCount with the passed value Corresponding COBOL Variable is WS-ROW-COUNT
   *
   * @param number
   */
  public void setRowCount(int number) {
    // Truncate if the number is beyond +/- Max range
    rowCount = checkRowCountMaxLimit(number);
  }

  public void setRowCount(long number) {
    number = checkRowCountMaxLimit(number); // Truncate if value is beyond +/- Max range
    setRowCount((int) number);
  }

  /**
   * Returns the value of startingRowNbr
   *
   * @return startingRowNbr
   */
  public int getStartingRowNbr() throws CFException {
    return startingRowNbr;
  }

  /**
   * Update StartingRowNbr with the passed value Corresponding COBOL Variable is WS-STARTING-ROW-NBR
   *
   * @param number
   */
  public void setStartingRowNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    startingRowNbr = checkStartingRowNbrMaxLimit(number);
  }

  public void setStartingRowNbr(long number) {
    number = checkStartingRowNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setStartingRowNbr((int) number);
  }

  /**
   * Returns the value of dbhiFirstTime
   *
   * @return dbhiFirstTime
   */
  public char[] getDbhiFirstTime() throws CFException {
    return dbhiFirstTime;
  }

  /**
   * set variable dbhiFirstTime Corresponding COBOL Variable is WS-DBHI-FIRST-TIME
   *
   * @param value
   */
  public void setDbhiFirstTime(char[] value) {
    value = checkDbhiFirstTimeConstraints(value);
    arraycopy(value, 0, dbhiFirstTime, 0, value.length);
  }

  public void setDbhiFirstTime(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, dbhiFirstTime, 0, beginIndex + endIndex);
  }

  char[] dbhiFirstTimeYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isDbhiFirstTimeYes()
   *
   * @return Returns true if isDbhiFirstTimeYes() is "Y"
   */
  public boolean isDbhiFirstTimeYes() throws CFException {
    return (compareChars(getDbhiFirstTime(), dbhiFirstTimeYes88Value) == 0);
  }

  /** set values "Y" */
  public void setDbhiFirstTimeYesTrue() {
    setDbhiFirstTime(dbhiFirstTimeYes88Value);
  }

  char[] dbhiFirstTimeNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isDbhiFirstTimeNo()
   *
   * @return Returns true if isDbhiFirstTimeNo() is "N"
   */
  public boolean isDbhiFirstTimeNo() throws CFException {
    return (compareChars(getDbhiFirstTime(), dbhiFirstTimeNo88Value) == 0);
  }

  /** set values "N" */
  public void setDbhiFirstTimeNoTrue() {
    setDbhiFirstTime(dbhiFirstTimeNo88Value);
  }
  /**
   * Returns the value of actIndSwitch
   *
   * @return actIndSwitch
   */
  public char[] getActIndSwitch() throws CFException {
    return actIndSwitch;
  }

  /**
   * set variable actIndSwitch Corresponding COBOL Variable is WS-ACT-IND-SWITCH
   *
   * @param value
   */
  public void setActIndSwitch(char[] value) {
    value = checkActIndSwitchConstraints(value);
    arraycopy(value, 0, actIndSwitch, 0, value.length);
  }

  public void setActIndSwitch(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, actIndSwitch, 0, beginIndex + endIndex);
  }

  char[] actNotFound88Value = "N".toCharArray();
  /**
   * Test condition "N" for isActNotFound()
   *
   * @return Returns true if isActNotFound() is "N"
   */
  public boolean isActNotFound() throws CFException {
    return (compareChars(getActIndSwitch(), actNotFound88Value) == 0);
  }

  /** set values "N" */
  public void setActNotFoundTrue() {
    setActIndSwitch(actNotFound88Value);
  }

  char[] actFound88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isActFound()
   *
   * @return Returns true if isActFound() is "Y"
   */
  public boolean isActFound() throws CFException {
    return (compareChars(getActIndSwitch(), actFound88Value) == 0);
  }

  /** set values "Y" */
  public void setActFoundTrue() {
    setActIndSwitch(actFound88Value);
  }
  /**
   * Returns the value of endOfCsrSw
   *
   * @return endOfCsrSw
   */
  public char[] getEndOfCsrSw() throws CFException {
    return endOfCsrSw;
  }

  /**
   * set variable endOfCsrSw Corresponding COBOL Variable is WS-END-OF-CSR-SW
   *
   * @param value
   */
  public void setEndOfCsrSw(char[] value) {
    value = checkEndOfCsrSwConstraints(value);
    arraycopy(value, 0, endOfCsrSw, 0, value.length);
  }

  public void setEndOfCsrSw(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, endOfCsrSw, 0, beginIndex + endIndex);
  }

  char[] endOfCsr88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isEndOfCsr()
   *
   * @return Returns true if isEndOfCsr() is "Y"
   */
  public boolean isEndOfCsr() throws CFException {
    return (compareChars(getEndOfCsrSw(), endOfCsr88Value) == 0);
  }

  /** set values "Y" */
  public void setEndOfCsrTrue() {
    setEndOfCsrSw(endOfCsr88Value);
  }
  /**
   * Returns the value of retAreaLimit
   *
   * @return retAreaLimit
   */
  public char[] getRetAreaLimit() throws CFException {
    return retAreaLimit;
  }

  /**
   * set variable retAreaLimit Corresponding COBOL Variable is WS-RET-AREA-LIMIT
   *
   * @param value
   */
  public void setRetAreaLimit(char[] value) {
    value = checkRetAreaLimitConstraints(value);
    arraycopy(value, 0, retAreaLimit, 0, value.length);
  }

  public void setRetAreaLimit(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, retAreaLimit, 0, beginIndex + endIndex);
  }

  char[] retAreaFull88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isRetAreaFull()
   *
   * @return Returns true if isRetAreaFull() is "Y"
   */
  public boolean isRetAreaFull() throws CFException {
    return (compareChars(getRetAreaLimit(), retAreaFull88Value) == 0);
  }

  /** set values "Y" */
  public void setRetAreaFullTrue() {
    setRetAreaLimit(retAreaFull88Value);
  }
  /**
   * Returns the value of hcaTables
   *
   * @return hcaTables
   */
  public char[] getHcaTables() throws CFException {
    return hcaTables;
  }

  /**
   * set variable hcaTables Corresponding COBOL Variable is WS-HCA-TABLES
   *
   * @param value
   */
  public void setHcaTables(char[] value) {
    value = checkHcaTablesConstraints(value);
    arraycopy(value, 0, hcaTables, 0, value.length);
  }

  public void setHcaTables(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, hcaTables, 0, beginIndex + endIndex);
  }

  /**
   * Test condition "HCAN01" THRU "HCAN50" for isHcaTables1()
   *
   * @return Returns true if isHcaTables1() is "HCAN01" THRU "HCAN50"
   */
  public boolean isHcaTables1() throws CFException {
    return (isGreaterOrEqual(getHcaTables(), "HCAN01") && isLessOrEqual(getHcaTables(), "HCAN50"));
  }

  /** set values "HCAN01" THRU "HCAN50" */
  public void setHcaTables1True() {
    setHcaTables("HCAN01".toCharArray());
  }
  /**
   * Returns the value of nullInd
   *
   * @return nullInd
   */
  public short getNullInd() throws CFException {
    return nullInd;
  }

  /**
   * Update NullInd with the passed value Corresponding COBOL Variable is WS-NULL-IND
   *
   * @param number
   */
  public void setNullInd(short number) {
    // Truncate if the number is beyond +/- Max range
    nullInd = checkNullIndMaxLimit(number);
  }

  public void setNullInd(int number) {
    number = checkNullIndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setNullInd((short) number);
  }

  public void setNullInd(long number) {
    number = checkNullIndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setNullInd((short) number);
  }

  /**
   * Returns the value of returnCode
   *
   * @return returnCode
   */
  public char[] getReturnCode() throws CFException {
    return returnCode;
  }

  /**
   * set variable returnCode Corresponding COBOL Variable is WS-RETURN-CODE
   *
   * @param value
   */
  public void setReturnCode(char[] value) {
    value = checkReturnCodeConstraints(value);
    arraycopy(value, 0, returnCode, 0, value.length);
  }

  public void setReturnCode(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, returnCode, 0, beginIndex + endIndex);
  }
  /**
   * Returns the value of c5427bhi01
   *
   * @return c5427bhi01
   */
  public char[] getC5427bhi01() throws CFException {
    return c5427bhi01;
  }

  /**
   * set variable c5427bhi01 Corresponding COBOL Variable is C5427BHI
   *
   * @param value
   */
  public void setC5427bhi01(char[] value) {
    value = checkC5427bhi01Constraints(value);
    arraycopy(value, 0, c5427bhi01, 0, value.length);
  }

  public void setC5427bhi01(char[] value, int beginIndex, int endIndex) {
    // value = checkL1CtlData801Constraints(value);
    arraycopy(value, beginIndex, c5427bhi01, 0, beginIndex + endIndex);
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
