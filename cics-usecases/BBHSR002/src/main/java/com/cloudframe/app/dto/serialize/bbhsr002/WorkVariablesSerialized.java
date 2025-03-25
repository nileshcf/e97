package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class WorkVariablesSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkVariablesSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(WorkVariablesSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int WORK_VARIABLES_LENGTH = 1212621;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiCnt;
  protected int beginSrvcCd;
  protected int beginPosBhiCnt;
  protected int beginPosBhiInfo;
  protected static final int POS_BHI_INFO_SIZE = 300;

  /** Constructor for WorkVariablesSerialized */
  public WorkVariablesSerialized() {
    init(0);
  }

  /** initializes the field in WorkVariablesSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(WORK_VARIABLES_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiCnt = getStartOffset() + 0; // set offset for serialization

    beginSrvcCd = getStartOffset() + 2; // set offset for serialization

    beginPosBhiCnt = getStartOffset() + 18; // set offset for serialization

    beginPosBhiInfo = getStartOffset() + 21; // set offset for serialization

    /*  end of offset */
  }

  int localBhiCntCounter = -1;

  public boolean isBhiCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiCntCounter != sharedCounter;
    localBhiCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of bhiCnt
   *
   * @return bhiCnt
   */
  public char[] getBhiCntString() {
    return getCharArray(beginBhiCnt, BHI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean bhiCntIsNumeric() {
    return isNumeric(
        beginBhiCnt,
        beginBhiCnt + BHI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int BHI_CNT_LEN = 2;
  /** serializeBhiCnt */
  protected void serializeBhiCnt(int bhiCnt) {
    putNumber(
        beginBhiCnt,
        bhiCnt,
        BHI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localBhiCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeBhiCnt */
  protected int serializeBhiCnt(char[] value) {
    int bhiCnt;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    bhiCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginBhiCnt, 2);
    localBhiCntCounter = shareString.getSerializedField().getModifiedCounter();
    return bhiCnt;
  }

  protected int checkBhiCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshBhiCnt is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshBhiCnt() throws CFException {
    try {
      return (getIntNumber(
          beginBhiCnt,
          BHI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("bhiCnt", beginBhiCnt, BHI_CNT_LEN);
    }
  }

  int localSrvcCdCounter = -1;

  public boolean isSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSrvcCdCounter != sharedCounter;
    localSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SRVC_CD_LEN = 6;
  /** serialize this SrvcCd */
  protected void serializeSrvcCd(char[] srvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(srvcCd, 0, getStringValue(), beginSrvcCd, SRVC_CD_LEN);
    localSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshSrvcCd is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshSrvcCd() {
    return (substring(getStringValue(), beginSrvcCd, beginSrvcCd + SRVC_CD_LEN));
  }

  int localPosBhiCntCounter = -1;

  public boolean isPosBhiCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosBhiCntCounter != sharedCounter;
    localPosBhiCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of posBhiCnt
   *
   * @return posBhiCnt
   */
  public char[] getPosBhiCntString() {
    return getCharArray(beginPosBhiCnt, POS_BHI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean posBhiCntIsNumeric() {
    return isNumeric(
        beginPosBhiCnt,
        beginPosBhiCnt + POS_BHI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POS_BHI_CNT_LEN = 3;
  /** serializePosBhiCnt */
  protected void serializePosBhiCnt(int posBhiCnt) {
    putNumber(
        beginPosBhiCnt,
        posBhiCnt,
        POS_BHI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPosBhiCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePosBhiCnt */
  protected int serializePosBhiCnt(char[] value) {
    int posBhiCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    posBhiCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPosBhiCnt, 3);
    localPosBhiCntCounter = shareString.getSerializedField().getModifiedCounter();
    return posBhiCnt;
  }

  protected int checkPosBhiCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPosBhiCnt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshPosBhiCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPosBhiCnt,
          POS_BHI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("posBhiCnt", beginPosBhiCnt, POS_BHI_CNT_LEN);
    }
  }

  public int posBhiInfoSize() {
    return POS_BHI_INFO_SIZE;
  }
}
