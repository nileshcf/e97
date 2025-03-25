package com.cloudframe.app.dto.serialize.c5427bhi;

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

  int localRespCodeCounter = -1;

  public boolean isRespCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localRespCodeCounter != sharedCounter;
    localRespCodeCounter = sharedCounter;
    return hasModified;
  }

  protected int checkRespCodeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localResp2CodeCounter = -1;

  public boolean isResp2CodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localResp2CodeCounter != sharedCounter;
    localResp2CodeCounter = sharedCounter;
    return hasModified;
  }

  protected int checkResp2CodeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localSwFirstTimeCounter = -1;

  public boolean isSwFirstTimeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSwFirstTimeCounter != sharedCounter;
    localSwFirstTimeCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkSwFirstTimeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localSwUseCacheCounter = -1;

  public boolean isSwUseCacheModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSwUseCacheCounter != sharedCounter;
    localSwUseCacheCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkSwUseCacheConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localBcntrFetchOccurranceCounter = -1;

  public boolean isBcntrFetchOccurranceModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBcntrFetchOccurranceCounter != sharedCounter;
    localBcntrFetchOccurranceCounter = sharedCounter;
    return hasModified;
  }

  protected short checkBcntrFetchOccurranceMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }

  int localTsQueueNameCounter = -1;

  public boolean isTsQueueNameModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTsQueueNameCounter != sharedCounter;
    localTsQueueNameCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkTsQueueNameConstraints(char[] value) {
    return super.checkConstraints(value, 16, false, false);
  }

  int localTsqItem1Counter = -1;

  public boolean isTsqItem1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTsqItem1Counter != sharedCounter;
    localTsqItem1Counter = sharedCounter;
    return hasModified;
  }

  protected short checkTsqItem1MaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }

  int localBinsrchLowCounter = -1;

  public boolean isBinsrchLowModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBinsrchLowCounter != sharedCounter;
    localBinsrchLowCounter = sharedCounter;
    return hasModified;
  }

  protected int checkBinsrchLowMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localBinsrchMidCounter = -1;

  public boolean isBinsrchMidModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBinsrchMidCounter != sharedCounter;
    localBinsrchMidCounter = sharedCounter;
    return hasModified;
  }

  protected int checkBinsrchMidMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localBinsrchHighCounter = -1;

  public boolean isBinsrchHighModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBinsrchHighCounter != sharedCounter;
    localBinsrchHighCounter = sharedCounter;
    return hasModified;
  }

  protected int checkBinsrchHighMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localBinsrchFoundCounter = -1;

  public boolean isBinsrchFoundModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBinsrchFoundCounter != sharedCounter;
    localBinsrchFoundCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkBinsrchFoundConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
}
