package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class WorkSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int WORK_LENGTH = 14;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginSub1;
  protected int beginHipaaCodeUsedSub;
  protected int beginPosCnt;
  protected int beginHipaaCount;
  protected int beginEhbHpaSub;
  protected int beginEhbBhiSub;
  protected int beginEhbBhiSub2;

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

    beginSub1 = getStartOffset() + 0; // set offset for serialization

    beginHipaaCodeUsedSub = getStartOffset() + 2; // set offset for serialization

    beginPosCnt = getStartOffset() + 4; // set offset for serialization

    beginHipaaCount = getStartOffset() + 6; // set offset for serialization

    beginEhbHpaSub = getStartOffset() + 8; // set offset for serialization

    beginEhbBhiSub = getStartOffset() + 10; // set offset for serialization

    beginEhbBhiSub2 = getStartOffset() + 12; // set offset for serialization

    /*  end of offset */
  }

  int localPanValetCounter = -1;

  public boolean isPanValetModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPanValetCounter != sharedCounter;
    localPanValetCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkPanValetConstraints(char[] value) {
    return super.checkConstraints(value, 24, false, false);
  }

  int localD5427hpc01Counter = -1;

  public boolean isD5427hpc01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localD5427hpc01Counter != sharedCounter;
    localD5427hpc01Counter = sharedCounter;
    return hasModified;
  }

  protected char[] checkD5427hpc01Constraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localD5427pol01Counter = -1;

  public boolean isD5427pol01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localD5427pol01Counter != sharedCounter;
    localD5427pol01Counter = sharedCounter;
    return hasModified;
  }

  protected char[] checkD5427pol01Constraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localD5427tli01Counter = -1;

  public boolean isD5427tli01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localD5427tli01Counter != sharedCounter;
    localD5427tli01Counter = sharedCounter;
    return hasModified;
  }

  protected char[] checkD5427tli01Constraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localD5427bhi01Counter = -1;

  public boolean isD5427bhi01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localD5427bhi01Counter != sharedCounter;
    localD5427bhi01Counter = sharedCounter;
    return hasModified;
  }

  protected char[] checkD5427bhi01Constraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localD5427scn01Counter = -1;

  public boolean isD5427scn01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localD5427scn01Counter != sharedCounter;
    localD5427scn01Counter = sharedCounter;
    return hasModified;
  }

  protected char[] checkD5427scn01Constraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }

  int localVersionNoCounter = -1;

  public boolean isVersionNoModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localVersionNoCounter != sharedCounter;
    localVersionNoCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkVersionNoConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localSub1Counter = -1;

  public boolean isSub1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSub1Counter != sharedCounter;
    localSub1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of sub1
   *
   * @return sub1
   */
  public char[] getSub1String() {
    return getCharArray(beginSub1, SUB_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean sub1IsNumeric() {
    return isNumeric(
        beginSub1,
        beginSub1 + SUB_1_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int SUB_1_LEN = 2;
  /** serializeSub1 */
  protected void serializeSub1(int sub1) {
    putNumber(
        beginSub1,
        sub1,
        SUB_1_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localSub1Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeSub1 */
  protected int serializeSub1(char[] value) {
    int sub1;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    sub1 =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginSub1, 2);
    localSub1Counter = shareString.getSerializedField().getModifiedCounter();
    return sub1;
  }

  protected int checkSub1MaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshSub1 is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshSub1() throws CFException {
    try {
      return (getIntNumber(
          beginSub1,
          SUB_1_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("sub1", beginSub1, SUB_1_LEN);
    }
  }

  int localSub2Counter = -1;

  public boolean isSub2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSub2Counter != sharedCounter;
    localSub2Counter = sharedCounter;
    return hasModified;
  }

  protected int checkSub2MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localBhiSubCounter = -1;

  public boolean isBhiSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiSubCounter != sharedCounter;
    localBhiSubCounter = sharedCounter;
    return hasModified;
  }

  protected int checkBhiSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localHpaSubCounter = -1;

  public boolean isHpaSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpaSubCounter != sharedCounter;
    localHpaSubCounter = sharedCounter;
    return hasModified;
  }

  protected int checkHpaSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localBhiSub01Counter = -1;

  public boolean isBhiSub01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiSub01Counter != sharedCounter;
    localBhiSub01Counter = sharedCounter;
    return hasModified;
  }

  protected int checkBhiSub01MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localHipaaCodeUsedSubCounter = -1;

  public boolean isHipaaCodeUsedSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCodeUsedSubCounter != sharedCounter;
    localHipaaCodeUsedSubCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hipaaCodeUsedSub
   *
   * @return hipaaCodeUsedSub
   */
  public char[] getHipaaCodeUsedSubString() {
    return getCharArray(beginHipaaCodeUsedSub, HIPAA_CODE_USED_SUB_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hipaaCodeUsedSubIsNumeric() {
    return isNumeric(
        beginHipaaCodeUsedSub,
        beginHipaaCodeUsedSub + HIPAA_CODE_USED_SUB_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HIPAA_CODE_USED_SUB_LEN = 2;
  /** serializeHipaaCodeUsedSub */
  protected void serializeHipaaCodeUsedSub(int hipaaCodeUsedSub) {
    putNumber(
        beginHipaaCodeUsedSub,
        hipaaCodeUsedSub,
        HIPAA_CODE_USED_SUB_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHipaaCodeUsedSubCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHipaaCodeUsedSub */
  protected int serializeHipaaCodeUsedSub(char[] value) {
    int hipaaCodeUsedSub;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hipaaCodeUsedSub =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginHipaaCodeUsedSub, 2);
    localHipaaCodeUsedSubCounter = shareString.getSerializedField().getModifiedCounter();
    return hipaaCodeUsedSub;
  }

  protected int checkHipaaCodeUsedSubMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHipaaCodeUsedSub is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshHipaaCodeUsedSub() throws CFException {
    try {
      return (getIntNumber(
          beginHipaaCodeUsedSub,
          HIPAA_CODE_USED_SUB_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hipaaCodeUsedSub", beginHipaaCodeUsedSub, HIPAA_CODE_USED_SUB_LEN);
    }
  }

  int localPosHipaaSubCounter = -1;

  public boolean isPosHipaaSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosHipaaSubCounter != sharedCounter;
    localPosHipaaSubCounter = sharedCounter;
    return hasModified;
  }

  protected int checkPosHipaaSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localPosSubCounter = -1;

  public boolean isPosSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosSubCounter != sharedCounter;
    localPosSubCounter = sharedCounter;
    return hasModified;
  }

  protected int checkPosSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localPosSub1Counter = -1;

  public boolean isPosSub1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosSub1Counter != sharedCounter;
    localPosSub1Counter = sharedCounter;
    return hasModified;
  }

  protected int checkPosSub1MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localTliTableSwCounter = -1;

  public boolean isTliTableSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliTableSwCounter != sharedCounter;
    localTliTableSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkTliTableSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localBhiRowFndSwCounter = -1;

  public boolean isBhiRowFndSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowFndSwCounter != sharedCounter;
    localBhiRowFndSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkBhiRowFndSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localMethodSwCounter = -1;

  public boolean isMethodSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localMethodSwCounter != sharedCounter;
    localMethodSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkMethodSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localDFlagCounter = -1;

  public boolean isDFlagModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDFlagCounter != sharedCounter;
    localDFlagCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkDFlagConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localIFlagCounter = -1;

  public boolean isIFlagModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localIFlagCounter != sharedCounter;
    localIFlagCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkIFlagConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localBFlagCounter = -1;

  public boolean isBFlagModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBFlagCounter != sharedCounter;
    localBFlagCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkBFlagConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localOFlagCounter = -1;

  public boolean isOFlagModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localOFlagCounter != sharedCounter;
    localOFlagCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkOFlagConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localHipaaCd47SwCounter = -1;

  public boolean isHipaaCd47SwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCd47SwCounter != sharedCounter;
    localHipaaCd47SwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkHipaaCd47SwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localHipaaCd47PresentSwCounter = -1;

  public boolean isHipaaCd47PresentSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCd47PresentSwCounter != sharedCounter;
    localHipaaCd47PresentSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkHipaaCd47PresentSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localHipaaCd30PresentSwCounter = -1;

  public boolean isHipaaCd30PresentSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCd30PresentSwCounter != sharedCounter;
    localHipaaCd30PresentSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkHipaaCd30PresentSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localAllRowCreatedSwCounter = -1;

  public boolean isAllRowCreatedSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localAllRowCreatedSwCounter != sharedCounter;
    localAllRowCreatedSwCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkAllRowCreatedSwConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
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

  int localEmpTablesCounter = -1;

  public boolean isEmpTablesModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEmpTablesCounter != sharedCounter;
    localEmpTablesCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkEmpTablesConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }

  int localHcaPolicySetsCounter = -1;

  public boolean isHcaPolicySetsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHcaPolicySetsCounter != sharedCounter;
    localHcaPolicySetsCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkHcaPolicySetsConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }

  int localEmpPolicySetsCounter = -1;

  public boolean isEmpPolicySetsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEmpPolicySetsCounter != sharedCounter;
    localEmpPolicySetsCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkEmpPolicySetsConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }

  int localPosCntCounter = -1;

  public boolean isPosCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosCntCounter != sharedCounter;
    localPosCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of posCnt
   *
   * @return posCnt
   */
  public char[] getPosCntString() {
    return getCharArray(beginPosCnt, POS_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean posCntIsNumeric() {
    return isNumeric(
        beginPosCnt,
        beginPosCnt + POS_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POS_CNT_LEN = 2;
  /** serializePosCnt */
  protected void serializePosCnt(int posCnt) {
    putNumber(
        beginPosCnt,
        posCnt,
        POS_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPosCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePosCnt */
  protected int serializePosCnt(char[] value) {
    int posCnt;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    posCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginPosCnt, 2);
    localPosCntCounter = shareString.getSerializedField().getModifiedCounter();
    return posCnt;
  }

  protected int checkPosCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPosCnt is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshPosCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPosCnt,
          POS_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("posCnt", beginPosCnt, POS_CNT_LEN);
    }
  }

  int localHipaaCountCounter = -1;

  public boolean isHipaaCountModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCountCounter != sharedCounter;
    localHipaaCountCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hipaaCount
   *
   * @return hipaaCount
   */
  public char[] getHipaaCountString() {
    return getCharArray(beginHipaaCount, HIPAA_COUNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hipaaCountIsNumeric() {
    return isNumeric(
        beginHipaaCount,
        beginHipaaCount + HIPAA_COUNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HIPAA_COUNT_LEN = 2;
  /** serializeHipaaCount */
  protected void serializeHipaaCount(int hipaaCount) {
    putNumber(
        beginHipaaCount,
        hipaaCount,
        HIPAA_COUNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHipaaCountCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHipaaCount */
  protected int serializeHipaaCount(char[] value) {
    int hipaaCount;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hipaaCount =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginHipaaCount, 2);
    localHipaaCountCounter = shareString.getSerializedField().getModifiedCounter();
    return hipaaCount;
  }

  protected int checkHipaaCountMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHipaaCount is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshHipaaCount() throws CFException {
    try {
      return (getIntNumber(
          beginHipaaCount,
          HIPAA_COUNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hipaaCount", beginHipaaCount, HIPAA_COUNT_LEN);
    }
  }

  int localCicsDfhrespCodeCounter = -1;

  public boolean isCicsDfhrespCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCicsDfhrespCodeCounter != sharedCounter;
    localCicsDfhrespCodeCounter = sharedCounter;
    return hasModified;
  }

  protected int checkCicsDfhrespCodeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localWvAdaFlengthCounter = -1;

  public boolean isWvAdaFlengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWvAdaFlengthCounter != sharedCounter;
    localWvAdaFlengthCounter = sharedCounter;
    return hasModified;
  }

  protected int checkWvAdaFlengthMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }

  int localEhbHpaSubCounter = -1;

  public boolean isEhbHpaSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEhbHpaSubCounter != sharedCounter;
    localEhbHpaSubCounter = sharedCounter;
    return hasModified;
  }

  public boolean ehbHpaSubIsNumeric() {
    return decimalIsNumeric(
        beginEhbHpaSub,
        EHB_HPA_SUB_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int EHB_HPA_SUB_LEN = 2;
  /** serializeEhbHpaSub */
  protected void serializeEhbHpaSub(short ehbHpaSub) {
    putDecimal(beginEhbHpaSub, ehbHpaSub, EHB_HPA_SUB_LEN, true);
  }

  protected short checkEhbHpaSubMaxLimit(long number) {
    return (short) checkMaxLimit(number, MAX_1000 /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshEhbHpaSub is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshEhbHpaSub() throws CFException {
    try {
      return (getShortDecimal(beginEhbHpaSub, EHB_HPA_SUB_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("ehbHpaSub", beginEhbHpaSub, EHB_HPA_SUB_LEN);
    }
  }

  int localEhbBhiSubCounter = -1;

  public boolean isEhbBhiSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEhbBhiSubCounter != sharedCounter;
    localEhbBhiSubCounter = sharedCounter;
    return hasModified;
  }

  public boolean ehbBhiSubIsNumeric() {
    return decimalIsNumeric(
        beginEhbBhiSub,
        EHB_BHI_SUB_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int EHB_BHI_SUB_LEN = 2;
  /** serializeEhbBhiSub */
  protected void serializeEhbBhiSub(short ehbBhiSub) {
    putDecimal(beginEhbBhiSub, ehbBhiSub, EHB_BHI_SUB_LEN, true);
  }

  protected short checkEhbBhiSubMaxLimit(long number) {
    return (short) checkMaxLimit(number, MAX_1000 /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshEhbBhiSub is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshEhbBhiSub() throws CFException {
    try {
      return (getShortDecimal(beginEhbBhiSub, EHB_BHI_SUB_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("ehbBhiSub", beginEhbBhiSub, EHB_BHI_SUB_LEN);
    }
  }

  int localEhbBhiSub2Counter = -1;

  public boolean isEhbBhiSub2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEhbBhiSub2Counter != sharedCounter;
    localEhbBhiSub2Counter = sharedCounter;
    return hasModified;
  }

  public boolean ehbBhiSub2IsNumeric() {
    return decimalIsNumeric(
        beginEhbBhiSub2,
        EHB_BHI_SUB_2_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int EHB_BHI_SUB_2_LEN = 2;
  /** serializeEhbBhiSub2 */
  protected void serializeEhbBhiSub2(short ehbBhiSub2) {
    putDecimal(beginEhbBhiSub2, ehbBhiSub2, EHB_BHI_SUB_2_LEN, true);
  }

  protected short checkEhbBhiSub2MaxLimit(long number) {
    return (short) checkMaxLimit(number, MAX_1000 /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshEhbBhiSub2 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshEhbBhiSub2() throws CFException {
    try {
      return (getShortDecimal(beginEhbBhiSub2, EHB_BHI_SUB_2_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("ehbBhiSub2", beginEhbBhiSub2, EHB_BHI_SUB_2_LEN);
    }
  }

  int localEhbBhiAf91000IndCounter = -1;

  public boolean isEhbBhiAf91000IndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEhbBhiAf91000IndCounter != sharedCounter;
    localEhbBhiAf91000IndCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkEhbBhiAf91000IndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localEhbBhiAf92507IndCounter = -1;

  public boolean isEhbBhiAf92507IndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEhbBhiAf92507IndCounter != sharedCounter;
    localEhbBhiAf92507IndCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkEhbBhiAf92507IndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }

  int localEhbBhiAfBothIndCounter = -1;

  public boolean isEhbBhiAfBothIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEhbBhiAfBothIndCounter != sharedCounter;
    localEhbBhiAfBothIndCounter = sharedCounter;
    return hasModified;
  }

  protected char[] checkEhbBhiAfBothIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
}
