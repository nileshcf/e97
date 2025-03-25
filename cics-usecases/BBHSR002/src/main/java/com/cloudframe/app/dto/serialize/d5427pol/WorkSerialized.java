package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class WorkSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
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

  int localMxiFirstTimeCounter = -1;

  public boolean isMxiFirstTimeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMxiFirstTimeCounter != sharedCounter;
    localMxiFirstTimeCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkMxiFirstTimeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localTopsPrdctCdSwCounter = -1;

  public boolean isTopsPrdctCdSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTopsPrdctCdSwCounter != sharedCounter;
    localTopsPrdctCdSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkTopsPrdctCdSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
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
