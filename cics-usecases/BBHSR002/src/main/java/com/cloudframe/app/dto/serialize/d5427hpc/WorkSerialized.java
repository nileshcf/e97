package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class WorkSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
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

  int localDsmPgmNameCounter = -1;

  public boolean isDsmPgmNameModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsmPgmNameCounter != sharedCounter;
    localDsmPgmNameCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkDsmPgmNameConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localLneSubCounter = -1;

  public boolean isLneSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLneSubCounter != sharedCounter;
    localLneSubCounter = sharedCounter;
    return hasModified;
  }

  protected int checkLneSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localHipaaFetchSwCounter = -1;

  public boolean isHipaaFetchSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaFetchSwCounter != sharedCounter;
    localHipaaFetchSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkHipaaFetchSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localExplicitReqSwCounter = -1;

  public boolean isExplicitReqSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localExplicitReqSwCounter != sharedCounter;
    localExplicitReqSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkExplicitReqSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
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

  int localC5427hpc01Counter = -1;

  public boolean isC5427hpc01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localC5427hpc01Counter != sharedCounter;
    localC5427hpc01Counter = sharedCounter;
    return hasModified;
  }

  protected char[] checkC5427hpc01Constraints(char[] value) {
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

  int localDfhcommareaCounter = -1;

  public boolean isDfhcommareaModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfhcommareaCounter != sharedCounter;
    localDfhcommareaCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkDfhcommareaConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
}
