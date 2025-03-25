package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class WorkSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int WORK_LENGTH = 0;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for WorkSerialized */
  public WorkSerialized() {
    init(0);
  }

  /** initializes the field in WorkSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(WORK_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }

  int localSubCounter = -1;

  public boolean isSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSubCounter != sharedCounter;
    localSubCounter = sharedCounter;
    return hasModified;
  }

  protected int checkSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localRowSubCounter = -1;

  public boolean isRowSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRowSubCounter != sharedCounter;
    localRowSubCounter = sharedCounter;
    return hasModified;
  }

  protected int checkRowSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localRetryCntCounter = -1;

  public boolean isRetryCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRetryCntCounter != sharedCounter;
    localRetryCntCounter = sharedCounter;
    return hasModified;
  }

  protected int checkRetryCntMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localRowCountCounter = -1;

  public boolean isRowCountModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRowCountCounter != sharedCounter;
    localRowCountCounter = sharedCounter;
    return hasModified;
  }

  protected int checkRowCountMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localStartingRowNbrCounter = -1;

  public boolean isStartingRowNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localStartingRowNbrCounter != sharedCounter;
    localStartingRowNbrCounter = sharedCounter;
    return hasModified;
  }

  protected int checkStartingRowNbrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localDbhiFirstTimeCounter = -1;

  public boolean isDbhiFirstTimeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhiFirstTimeCounter != sharedCounter;
    localDbhiFirstTimeCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkDbhiFirstTimeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localActIndSwitchCounter = -1;

  public boolean isActIndSwitchModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localActIndSwitchCounter != sharedCounter;
    localActIndSwitchCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkActIndSwitchConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localEndOfCsrSwCounter = -1;

  public boolean isEndOfCsrSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEndOfCsrSwCounter != sharedCounter;
    localEndOfCsrSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkEndOfCsrSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localRetAreaLimitCounter = -1;

  public boolean isRetAreaLimitModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRetAreaLimitCounter != sharedCounter;
    localRetAreaLimitCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkRetAreaLimitConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localHcaTablesCounter = -1;

  public boolean isHcaTablesModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHcaTablesCounter != sharedCounter;
    localHcaTablesCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkHcaTablesConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }

  int localNullIndCounter = -1;

  public boolean isNullIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localNullIndCounter != sharedCounter;
    localNullIndCounter = sharedCounter;
    return hasModified;
  }

  protected short checkNullIndMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }

  int localReturnCodeCounter = -1;

  public boolean isReturnCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReturnCodeCounter != sharedCounter;
    localReturnCodeCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkReturnCodeConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }

  int localC5427bhi01Counter = -1;

  public boolean isC5427bhi01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localC5427bhi01Counter != sharedCounter;
    localC5427bhi01Counter = sharedCounter;
    return hasModified;
  }

  protected char[] checkC5427bhi01Constraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localSqlcode_WsCounter = -1;

  public boolean isSqlcode_WsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSqlcode_WsCounter != sharedCounter;
    localSqlcode_WsCounter = sharedCounter;
    return hasModified;
  }

  protected int checkSqlcode_WsMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
}
