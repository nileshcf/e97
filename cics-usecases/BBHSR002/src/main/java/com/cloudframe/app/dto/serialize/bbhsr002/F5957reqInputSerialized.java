package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class F5957reqInputSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class F5957reqInputSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(F5957reqInputSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int F_5957REQ_INPUT_LENGTH = 233;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqAction;
  protected int beginReqCoverageType;
  protected int beginReqCallingProgram;
  protected int beginReqReturnCode;
  protected int beginReqExplanationCode;
  protected int beginReqRequestParms;

  /** Constructor for F5957reqInputSerialized */
  public F5957reqInputSerialized() {
    init(0);
  }

  /** initializes the field in F5957reqInputSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(F_5957REQ_INPUT_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqAction = getStartOffset() + 0; // set offset for serialization

    beginReqCoverageType = getStartOffset() + 9; // set offset for serialization

    beginReqCallingProgram = getStartOffset() + 10; // set offset for serialization

    beginReqReturnCode = getStartOffset() + 18; // set offset for serialization

    beginReqExplanationCode = getStartOffset() + 20; // set offset for serialization

    beginReqRequestParms = getStartOffset() + 83; // set offset for serialization

    /*  end of offset */
  }

  int localReqActionCounter = -1;

  public boolean isReqActionModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqActionCounter != sharedCounter;
    localReqActionCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ACTION_LEN = 1;
  /** serialize this ReqAction */
  protected void serializeReqAction(char[] reqAction) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(reqAction, 0, getStringValue(), beginReqAction, REQ_ACTION_LEN);
    localReqActionCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqActionConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshReqAction is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshReqAction() {
    return (substring(getStringValue(), beginReqAction, beginReqAction + REQ_ACTION_LEN));
  }

  int localReqCoverageTypeCounter = -1;

  public boolean isReqCoverageTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqCoverageTypeCounter != sharedCounter;
    localReqCoverageTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_COVERAGE_TYPE_LEN = 1;
  /** serialize this ReqCoverageType */
  protected void serializeReqCoverageType(char[] reqCoverageType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(reqCoverageType, 0, getStringValue(), beginReqCoverageType, REQ_COVERAGE_TYPE_LEN);
    localReqCoverageTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqCoverageTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshReqCoverageType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqCoverageType() {
    return (substring(
        getStringValue(), beginReqCoverageType, beginReqCoverageType + REQ_COVERAGE_TYPE_LEN));
  }

  int localReqCallingProgramCounter = -1;

  public boolean isReqCallingProgramModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqCallingProgramCounter != sharedCounter;
    localReqCallingProgramCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_CALLING_PROGRAM_LEN = 8;
  /** serialize this ReqCallingProgram */
  protected void serializeReqCallingProgram(char[] reqCallingProgram) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        reqCallingProgram, 0, getStringValue(), beginReqCallingProgram, REQ_CALLING_PROGRAM_LEN);
    localReqCallingProgramCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqCallingProgramConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshReqCallingProgram is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqCallingProgram() {
    return (substring(
        getStringValue(),
        beginReqCallingProgram,
        beginReqCallingProgram + REQ_CALLING_PROGRAM_LEN));
  }

  int localReqReturnCodeCounter = -1;

  public boolean isReqReturnCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqReturnCodeCounter != sharedCounter;
    localReqReturnCodeCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of reqReturnCode
   *
   * @return reqReturnCode
   */
  public char[] getReqReturnCodeString() {
    return getCharArray(beginReqReturnCode, REQ_RETURN_CODE_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean reqReturnCodeIsNumeric() {
    return isNumeric(
        beginReqReturnCode,
        beginReqReturnCode + REQ_RETURN_CODE_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int REQ_RETURN_CODE_LEN = 2;
  /** serializeReqReturnCode */
  protected void serializeReqReturnCode(int reqReturnCode) {
    putNumber(
        beginReqReturnCode,
        reqReturnCode,
        REQ_RETURN_CODE_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localReqReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeReqReturnCode */
  protected int serializeReqReturnCode(char[] value) {
    int reqReturnCode;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    reqReturnCode =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginReqReturnCode, 2);
    localReqReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
    return reqReturnCode;
  }

  protected int checkReqReturnCodeMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshReqReturnCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqReturnCode() throws CFException {
    try {
      return (getIntNumber(
          beginReqReturnCode,
          REQ_RETURN_CODE_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("reqReturnCode", beginReqReturnCode, REQ_RETURN_CODE_LEN);
    }
  }

  int localReqExplanationCodeCounter = -1;

  public boolean isReqExplanationCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqExplanationCodeCounter != sharedCounter;
    localReqExplanationCodeCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of reqExplanationCode
   *
   * @return reqExplanationCode
   */
  public char[] getReqExplanationCodeString() {
    return getCharArray(beginReqExplanationCode, REQ_EXPLANATION_CODE_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean reqExplanationCodeIsNumeric() {
    return isNumeric(
        beginReqExplanationCode,
        beginReqExplanationCode + REQ_EXPLANATION_CODE_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int REQ_EXPLANATION_CODE_LEN = 3;
  /** serializeReqExplanationCode */
  protected void serializeReqExplanationCode(int reqExplanationCode) {
    putNumber(
        beginReqExplanationCode,
        reqExplanationCode,
        REQ_EXPLANATION_CODE_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localReqExplanationCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeReqExplanationCode */
  protected int serializeReqExplanationCode(char[] value) {
    int reqExplanationCode;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    reqExplanationCode =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginReqExplanationCode, 3);
    localReqExplanationCodeCounter = shareString.getSerializedField().getModifiedCounter();
    return reqExplanationCode;
  }

  protected int checkReqExplanationCodeMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshReqExplanationCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqExplanationCode() throws CFException {
    try {
      return (getIntNumber(
          beginReqExplanationCode,
          REQ_EXPLANATION_CODE_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("reqExplanationCode", beginReqExplanationCode, REQ_EXPLANATION_CODE_LEN);
    }
  }

  int localReqRequestParmsCounter = -1;

  public boolean isReqRequestParmsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqRequestParmsCounter != sharedCounter;
    localReqRequestParmsCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_REQUEST_PARMS_LEN = 150;
  /** serialize this ReqRequestParms */
  protected void serializeReqRequestParms(char[] reqRequestParms) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(reqRequestParms, 0, getStringValue(), beginReqRequestParms, REQ_REQUEST_PARMS_LEN);
    localReqRequestParmsCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqRequestParmsConstraints(char[] value) {
    return super.checkConstraints(value, 150, false, false);
  }
  /**
   * refreshReqRequestParms is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqRequestParms() {
    return (substring(
        getStringValue(), beginReqRequestParms, beginReqRequestParms + REQ_REQUEST_PARMS_LEN));
  }
}
