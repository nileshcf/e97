package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdGetDiagAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdGetDiagAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdGetDiagAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_GET_DIAG_AREA_LENGTH = 88938;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdSub;
  protected int beginGdCond;
  protected int beginGdPos;
  protected int beginGdIntegerDisp;
  protected int beginGdBigDecimalDisp;
  protected int beginGdCicsLitLength;
  protected int beginGdTdqueue;
  protected int beginGdDsntiar;
  protected int beginGdSqlcaWorkArea;
  protected int beginGdStmtLit01;
  protected int beginGdStmtLit02;
  protected int beginGdStmtLit03;
  protected int beginGdStmtLit04;
  protected int beginGdStmtLit05;
  protected int beginGdStmtLit06;
  protected int beginGdStmtLit07;
  protected int beginGdStmtLit08;
  protected int beginGdStmtLit09;
  protected int beginGdStmtLit10;
  protected int beginGdStmtLit11;
  protected int beginGdStmtLit12;
  protected int beginGdStmtLit13;
  protected int beginGdCondLit01;
  protected int beginGdCondLit02;
  protected int beginGdCondLit03;
  protected int beginGdCondLit04;
  protected int beginGdCondLit05;
  protected int beginGdCondLit06;
  protected int beginGdCondLit07;
  protected int beginGdCondLit08;
  protected int beginGdCondLit09;
  protected int beginGdCondLit10;
  protected int beginGdCondLit11;
  protected int beginGdCondLit12;
  protected int beginGdCondLit13;
  protected int beginGdCondLit14;
  protected int beginGdCondLit15;
  protected int beginGdCondLit16;
  protected int beginGdCondLit17;
  protected int beginGdCondLit18;
  protected int beginGdCondLit19;
  protected int beginGdCondLit20;
  protected int beginGdCondLit21;
  protected int beginGdCondLit22;
  protected int beginGdCondLit23;
  protected int beginGdCondLit24;
  protected int beginGdCondLit25;
  protected int beginGdCondLit26;
  protected int beginGdConnLit01;
  protected int beginGdConnLit02;
  protected int beginGdConnLit03;
  protected int beginGdConnLit04;
  protected int beginGdConnLit05;
  protected int beginGdConnLit06;
  protected int beginGdConnLit07;
  protected int beginGdConditionNumber;
  protected int beginGdErrorCode1;
  protected int beginGdErrorCode2;
  protected int beginGdErrorCode3;
  protected int beginGdErrorCode4;
  protected int beginGdInternalErrPtr;
  protected int beginGdLineNumber;
  protected int beginGdMessageId;
  protected int beginGdModDetectingErr;
  protected int beginGdReasonCode;
  protected int beginGdReturnedSqlcode;
  protected int beginGdRowNumber;
  protected int beginGdSqlerrdSet;
  protected int beginGdSqlerrd1;
  protected int beginGdSqlerrd2;
  protected int beginGdSqlerrd3;
  protected int beginGdSqlerrd4;
  protected int beginGdSqlerrd5;
  protected int beginGdSqlerrd6;
  protected int beginGdTokenCount;
  protected int beginGdReturnedSqlstate;
  protected int beginGdAuthType;
  protected int beginGdConnState;
  protected int beginGdConnStatus;
  protected int beginGdEncryptType;
  protected int beginGdServerClass;
  protected int beginGdLastRow;
  protected int beginGdNumberMarkers;
  protected int beginGdNumberSets;
  protected int beginGdNumberRows;
  protected int beginGdReturnStatus;
  protected int beginGdCursorHold;
  protected int beginGdCursorRowset;
  protected int beginGdCursorScrollable;
  protected int beginGdCursorSensitivity;
  protected int beginGdCursorType;
  protected int beginGdMore;
  protected int beginGdNumber;
  protected int beginGdRowCount;

  /** Constructor for GdGetDiagAreaSerialized */
  public GdGetDiagAreaSerialized() {
    init(0);
  }

  /** initializes the field in GdGetDiagAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_GET_DIAG_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdSub = getStartOffset() + 0; // set offset for serialization

    beginGdCond = getStartOffset() + 3; // set offset for serialization

    beginGdPos = getStartOffset() + 7; // set offset for serialization

    beginGdIntegerDisp = getStartOffset() + 11; // set offset for serialization

    beginGdBigDecimalDisp = getStartOffset() + 21; // set offset for serialization

    beginGdCicsLitLength = getStartOffset() + 165; // set offset for serialization

    beginGdTdqueue = getStartOffset() + 167; // set offset for serialization

    beginGdDsntiar = getStartOffset() + 171; // set offset for serialization

    beginGdSqlcaWorkArea = getStartOffset() + 2585; // set offset for serialization

    beginGdStmtLit01 = getStartOffset() + 2825; // set offset for serialization

    beginGdStmtLit02 = getStartOffset() + 2840; // set offset for serialization

    beginGdStmtLit03 = getStartOffset() + 2871; // set offset for serialization

    beginGdStmtLit04 = getStartOffset() + 2896; // set offset for serialization

    beginGdStmtLit05 = getStartOffset() + 2914; // set offset for serialization

    beginGdStmtLit06 = getStartOffset() + 2934; // set offset for serialization

    beginGdStmtLit07 = getStartOffset() + 2961; // set offset for serialization

    beginGdStmtLit08 = getStartOffset() + 2990; // set offset for serialization

    beginGdStmtLit09 = getStartOffset() + 3023; // set offset for serialization

    beginGdStmtLit10 = getStartOffset() + 3057; // set offset for serialization

    beginGdStmtLit11 = getStartOffset() + 3084; // set offset for serialization

    beginGdStmtLit12 = getStartOffset() + 3091; // set offset for serialization

    beginGdStmtLit13 = getStartOffset() + 3100; // set offset for serialization

    beginGdCondLit01 = getStartOffset() + 3112; // set offset for serialization

    beginGdCondLit02 = getStartOffset() + 3127; // set offset for serialization

    beginGdCondLit03 = getStartOffset() + 3146; // set offset for serialization

    beginGdCondLit04 = getStartOffset() + 3160; // set offset for serialization

    beginGdCondLit05 = getStartOffset() + 3178; // set offset for serialization

    beginGdCondLit06 = getStartOffset() + 3196; // set offset for serialization

    beginGdCondLit07 = getStartOffset() + 3214; // set offset for serialization

    beginGdCondLit08 = getStartOffset() + 3232; // set offset for serialization

    beginGdCondLit09 = getStartOffset() + 3261; // set offset for serialization

    beginGdCondLit10 = getStartOffset() + 3279; // set offset for serialization

    beginGdCondLit11 = getStartOffset() + 3296; // set offset for serialization

    beginGdCondLit12 = getStartOffset() + 3325; // set offset for serialization

    beginGdCondLit13 = getStartOffset() + 3342; // set offset for serialization

    beginGdCondLit14 = getStartOffset() + 3360; // set offset for serialization

    beginGdCondLit15 = getStartOffset() + 3383; // set offset for serialization

    beginGdCondLit16 = getStartOffset() + 3400; // set offset for serialization

    beginGdCondLit17 = getStartOffset() + 3418; // set offset for serialization

    beginGdCondLit18 = getStartOffset() + 3433; // set offset for serialization

    beginGdCondLit19 = getStartOffset() + 3448; // set offset for serialization

    beginGdCondLit20 = getStartOffset() + 3463; // set offset for serialization

    beginGdCondLit21 = getStartOffset() + 3478; // set offset for serialization

    beginGdCondLit22 = getStartOffset() + 3493; // set offset for serialization

    beginGdCondLit23 = getStartOffset() + 3508; // set offset for serialization

    beginGdCondLit24 = getStartOffset() + 3526; // set offset for serialization

    beginGdCondLit25 = getStartOffset() + 3541; // set offset for serialization

    beginGdCondLit26 = getStartOffset() + 3561; // set offset for serialization

    beginGdConnLit01 = getStartOffset() + 3575; // set offset for serialization

    beginGdConnLit02 = getStartOffset() + 3601; // set offset for serialization

    beginGdConnLit03 = getStartOffset() + 3624; // set offset for serialization

    beginGdConnLit04 = getStartOffset() + 3647; // set offset for serialization

    beginGdConnLit05 = getStartOffset() + 3671; // set offset for serialization

    beginGdConnLit06 = getStartOffset() + 3693; // set offset for serialization

    beginGdConnLit07 = getStartOffset() + 3710; // set offset for serialization

    beginGdConditionNumber = getStartOffset() + 3864; // set offset for serialization

    beginGdErrorCode1 = getStartOffset() + 3998; // set offset for serialization

    beginGdErrorCode2 = getStartOffset() + 4002; // set offset for serialization

    beginGdErrorCode3 = getStartOffset() + 4006; // set offset for serialization

    beginGdErrorCode4 = getStartOffset() + 4010; // set offset for serialization

    beginGdInternalErrPtr = getStartOffset() + 4014; // set offset for serialization

    beginGdLineNumber = getStartOffset() + 4018; // set offset for serialization

    beginGdMessageId = getStartOffset() + 4022; // set offset for serialization

    beginGdModDetectingErr = getStartOffset() + 4032; // set offset for serialization

    beginGdReasonCode = getStartOffset() + 55740; // set offset for serialization

    beginGdReturnedSqlcode = getStartOffset() + 55744; // set offset for serialization

    beginGdRowNumber = getStartOffset() + 55748; // set offset for serialization

    beginGdSqlerrdSet = getStartOffset() + 55764; // set offset for serialization

    beginGdSqlerrd1 = getStartOffset() + 55765; // set offset for serialization

    beginGdSqlerrd2 = getStartOffset() + 55769; // set offset for serialization

    beginGdSqlerrd3 = getStartOffset() + 55773; // set offset for serialization

    beginGdSqlerrd4 = getStartOffset() + 55777; // set offset for serialization

    beginGdSqlerrd5 = getStartOffset() + 55781; // set offset for serialization

    beginGdSqlerrd6 = getStartOffset() + 55785; // set offset for serialization

    beginGdTokenCount = getStartOffset() + 55789; // set offset for serialization

    beginGdReturnedSqlstate = getStartOffset() + 88467; // set offset for serialization

    beginGdAuthType = getStartOffset() + 88602; // set offset for serialization

    beginGdConnState = getStartOffset() + 88733; // set offset for serialization

    beginGdConnStatus = getStartOffset() + 88737; // set offset for serialization

    beginGdEncryptType = getStartOffset() + 88741; // set offset for serialization

    beginGdServerClass = getStartOffset() + 88752; // set offset for serialization

    beginGdLastRow = getStartOffset() + 88880; // set offset for serialization

    beginGdNumberMarkers = getStartOffset() + 88884; // set offset for serialization

    beginGdNumberSets = getStartOffset() + 88888; // set offset for serialization

    beginGdNumberRows = getStartOffset() + 88892; // set offset for serialization

    beginGdReturnStatus = getStartOffset() + 88908; // set offset for serialization

    beginGdCursorHold = getStartOffset() + 88912; // set offset for serialization

    beginGdCursorRowset = getStartOffset() + 88913; // set offset for serialization

    beginGdCursorScrollable = getStartOffset() + 88914; // set offset for serialization

    beginGdCursorSensitivity = getStartOffset() + 88915; // set offset for serialization

    beginGdCursorType = getStartOffset() + 88916; // set offset for serialization

    beginGdMore = getStartOffset() + 88917; // set offset for serialization

    beginGdNumber = getStartOffset() + 88918; // set offset for serialization

    beginGdRowCount = getStartOffset() + 88922; // set offset for serialization

    /*  end of offset */
  }

  int localGdSubCounter = -1;

  public boolean isGdSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSubCounter != sharedCounter;
    localGdSubCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of gdSub
   *
   * @return gdSub
   */
  public char[] getGdSubString() {
    return getCharArray(beginGdSub, GD_SUB_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean gdSubIsNumeric() {
    return isNumeric(
        beginGdSub,
        beginGdSub + GD_SUB_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int GD_SUB_LEN = 3;
  /** serializeGdSub */
  protected void serializeGdSub(int gdSub) {
    putNumber(
        beginGdSub,
        gdSub,
        GD_SUB_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localGdSubCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeGdSub */
  protected int serializeGdSub(char[] value) {
    int gdSub;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    gdSub =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginGdSub, 3);
    localGdSubCounter = shareString.getSerializedField().getModifiedCounter();
    return gdSub;
  }

  protected int checkGdSubMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshGdSub is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdSub() throws CFException {
    try {
      return (getIntNumber(
          beginGdSub,
          GD_SUB_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("gdSub", beginGdSub, GD_SUB_LEN);
    }
  }

  int localGdCondCounter = -1;

  public boolean isGdCondModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondCounter != sharedCounter;
    localGdCondCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LEN = 4;
  /** serializeGdCond */
  protected void serializeGdCond(int gdCond) {
    replaceValue( //  save the value as string
        getBinaryString(gdCond, GD_COND_LEN), beginGdCond, GD_COND_LEN);
    localGdCondCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdCondMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdCond is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdCond() {
    return (getInt(beginGdCond));
  }

  int localGdPosCounter = -1;

  public boolean isGdPosModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdPosCounter != sharedCounter;
    localGdPosCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_POS_LEN = 4;
  /** serializeGdPos */
  protected void serializeGdPos(int gdPos) {
    replaceValue( //  save the value as string
        getBinaryString(gdPos, GD_POS_LEN), beginGdPos, GD_POS_LEN);
    localGdPosCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdPosMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdPos is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdPos() {
    return (getInt(beginGdPos));
  }

  int localGdIntegerDispCounter = -1;

  public boolean isGdIntegerDispModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdIntegerDispCounter != sharedCounter;
    localGdIntegerDispCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_INTEGER_DISP_LEN = 10;
  /** serialize this GdIntegerDisp */
  protected void serializeGdIntegerDisp(char[] gdIntegerDisp) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdIntegerDisp, 0, getStringValue(), beginGdIntegerDisp, GD_INTEGER_DISP_LEN);
    localGdIntegerDispCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdIntegerDispConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshGdIntegerDisp is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdIntegerDisp() {
    return (substring(
        getStringValue(), beginGdIntegerDisp, beginGdIntegerDisp + GD_INTEGER_DISP_LEN));
  }

  int localGdBigDecimalDispCounter = -1;

  public boolean isGdBigDecimalDispModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdBigDecimalDispCounter != sharedCounter;
    localGdBigDecimalDispCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_BIG_DECIMAL_DISP_LEN = 32;
  /** serialize this GdBigDecimalDisp */
  protected void serializeGdBigDecimalDisp(char[] gdBigDecimalDisp) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        gdBigDecimalDisp, 0, getStringValue(), beginGdBigDecimalDisp, GD_BIG_DECIMAL_DISP_LEN);
    localGdBigDecimalDispCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdBigDecimalDispConstraints(char[] value) {
    return super.checkConstraints(value, 32, false, false);
  }
  /**
   * refreshGdBigDecimalDisp is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdBigDecimalDisp() {
    return (substring(
        getStringValue(), beginGdBigDecimalDisp, beginGdBigDecimalDisp + GD_BIG_DECIMAL_DISP_LEN));
  }

  int localGdCicsLitLengthCounter = -1;

  public boolean isGdCicsLitLengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCicsLitLengthCounter != sharedCounter;
    localGdCicsLitLengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CICS_LIT_LENGTH_LEN = 2;
  /** serializeGdCicsLitLength */
  protected void serializeGdCicsLitLength(short gdCicsLitLength) {
    replaceValue( //  save the value as string
        getBinaryString(gdCicsLitLength, GD_CICS_LIT_LENGTH_LEN),
        beginGdCicsLitLength,
        GD_CICS_LIT_LENGTH_LEN);
    localGdCicsLitLengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdCicsLitLengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdCicsLitLength is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdCicsLitLength() {
    return (getShort(beginGdCicsLitLength));
  }

  int localGdTdqueueCounter = -1;

  public boolean isGdTdqueueModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdTdqueueCounter != sharedCounter;
    localGdTdqueueCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_TDQUEUE_LEN = 4;
  /** serialize this GdTdqueue */
  protected void serializeGdTdqueue(char[] gdTdqueue) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdTdqueue, 0, getStringValue(), beginGdTdqueue, GD_TDQUEUE_LEN);
    localGdTdqueueCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdTdqueueConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshGdTdqueue is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdTdqueue() {
    return (substring(getStringValue(), beginGdTdqueue, beginGdTdqueue + GD_TDQUEUE_LEN));
  }

  int localGdDsntiarCounter = -1;

  public boolean isGdDsntiarModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdDsntiarCounter != sharedCounter;
    localGdDsntiarCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_DSNTIAR_LEN = 8;
  /** serialize this GdDsntiar */
  protected void serializeGdDsntiar(char[] gdDsntiar) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdDsntiar, 0, getStringValue(), beginGdDsntiar, GD_DSNTIAR_LEN);
    localGdDsntiarCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdDsntiarConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshGdDsntiar is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdDsntiar() {
    return (substring(getStringValue(), beginGdDsntiar, beginGdDsntiar + GD_DSNTIAR_LEN));
  }

  int localGdSqlcaWorkAreaCounter = -1;

  public boolean isGdSqlcaWorkAreaModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlcaWorkAreaCounter != sharedCounter;
    localGdSqlcaWorkAreaCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLCA_WORK_AREA_LEN = 240;
  /** serialize this GdSqlcaWorkArea */
  protected void serializeGdSqlcaWorkArea(char[] gdSqlcaWorkArea) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdSqlcaWorkArea, 0, getStringValue(), beginGdSqlcaWorkArea, GD_SQLCA_WORK_AREA_LEN);
    localGdSqlcaWorkAreaCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdSqlcaWorkAreaConstraints(char[] value) {
    return super.checkConstraints(value, 240, false, false);
  }
  /**
   * refreshGdSqlcaWorkArea is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdSqlcaWorkArea() {
    return (substring(
        getStringValue(), beginGdSqlcaWorkArea, beginGdSqlcaWorkArea + GD_SQLCA_WORK_AREA_LEN));
  }

  int localGdStmtLit01Counter = -1;

  public boolean isGdStmtLit01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit01Counter != sharedCounter;
    localGdStmtLit01Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_01_LEN = 15;
  /** serialize this GdStmtLit01 */
  protected void serializeGdStmtLit01(char[] gdStmtLit01) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit01, 0, getStringValue(), beginGdStmtLit01, GD_STMT_LIT_01_LEN);
    localGdStmtLit01Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit01Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdStmtLit01 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit01() {
    return (substring(getStringValue(), beginGdStmtLit01, beginGdStmtLit01 + GD_STMT_LIT_01_LEN));
  }

  int localGdStmtLit02Counter = -1;

  public boolean isGdStmtLit02Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit02Counter != sharedCounter;
    localGdStmtLit02Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_02_LEN = 31;
  /** serialize this GdStmtLit02 */
  protected void serializeGdStmtLit02(char[] gdStmtLit02) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit02, 0, getStringValue(), beginGdStmtLit02, GD_STMT_LIT_02_LEN);
    localGdStmtLit02Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit02Constraints(char[] value) {
    return super.checkConstraints(value, 31, false, false);
  }
  /**
   * refreshGdStmtLit02 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit02() {
    return (substring(getStringValue(), beginGdStmtLit02, beginGdStmtLit02 + GD_STMT_LIT_02_LEN));
  }

  int localGdStmtLit03Counter = -1;

  public boolean isGdStmtLit03Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit03Counter != sharedCounter;
    localGdStmtLit03Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_03_LEN = 25;
  /** serialize this GdStmtLit03 */
  protected void serializeGdStmtLit03(char[] gdStmtLit03) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit03, 0, getStringValue(), beginGdStmtLit03, GD_STMT_LIT_03_LEN);
    localGdStmtLit03Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit03Constraints(char[] value) {
    return super.checkConstraints(value, 25, false, false);
  }
  /**
   * refreshGdStmtLit03 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit03() {
    return (substring(getStringValue(), beginGdStmtLit03, beginGdStmtLit03 + GD_STMT_LIT_03_LEN));
  }

  int localGdStmtLit04Counter = -1;

  public boolean isGdStmtLit04Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit04Counter != sharedCounter;
    localGdStmtLit04Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_04_LEN = 18;
  /** serialize this GdStmtLit04 */
  protected void serializeGdStmtLit04(char[] gdStmtLit04) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit04, 0, getStringValue(), beginGdStmtLit04, GD_STMT_LIT_04_LEN);
    localGdStmtLit04Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit04Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdStmtLit04 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit04() {
    return (substring(getStringValue(), beginGdStmtLit04, beginGdStmtLit04 + GD_STMT_LIT_04_LEN));
  }

  int localGdStmtLit05Counter = -1;

  public boolean isGdStmtLit05Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit05Counter != sharedCounter;
    localGdStmtLit05Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_05_LEN = 20;
  /** serialize this GdStmtLit05 */
  protected void serializeGdStmtLit05(char[] gdStmtLit05) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit05, 0, getStringValue(), beginGdStmtLit05, GD_STMT_LIT_05_LEN);
    localGdStmtLit05Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit05Constraints(char[] value) {
    return super.checkConstraints(value, 20, false, false);
  }
  /**
   * refreshGdStmtLit05 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit05() {
    return (substring(getStringValue(), beginGdStmtLit05, beginGdStmtLit05 + GD_STMT_LIT_05_LEN));
  }

  int localGdStmtLit06Counter = -1;

  public boolean isGdStmtLit06Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit06Counter != sharedCounter;
    localGdStmtLit06Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_06_LEN = 27;
  /** serialize this GdStmtLit06 */
  protected void serializeGdStmtLit06(char[] gdStmtLit06) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit06, 0, getStringValue(), beginGdStmtLit06, GD_STMT_LIT_06_LEN);
    localGdStmtLit06Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit06Constraints(char[] value) {
    return super.checkConstraints(value, 27, false, false);
  }
  /**
   * refreshGdStmtLit06 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit06() {
    return (substring(getStringValue(), beginGdStmtLit06, beginGdStmtLit06 + GD_STMT_LIT_06_LEN));
  }

  int localGdStmtLit07Counter = -1;

  public boolean isGdStmtLit07Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit07Counter != sharedCounter;
    localGdStmtLit07Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_07_LEN = 29;
  /** serialize this GdStmtLit07 */
  protected void serializeGdStmtLit07(char[] gdStmtLit07) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit07, 0, getStringValue(), beginGdStmtLit07, GD_STMT_LIT_07_LEN);
    localGdStmtLit07Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit07Constraints(char[] value) {
    return super.checkConstraints(value, 29, false, false);
  }
  /**
   * refreshGdStmtLit07 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit07() {
    return (substring(getStringValue(), beginGdStmtLit07, beginGdStmtLit07 + GD_STMT_LIT_07_LEN));
  }

  int localGdStmtLit08Counter = -1;

  public boolean isGdStmtLit08Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit08Counter != sharedCounter;
    localGdStmtLit08Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_08_LEN = 33;
  /** serialize this GdStmtLit08 */
  protected void serializeGdStmtLit08(char[] gdStmtLit08) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit08, 0, getStringValue(), beginGdStmtLit08, GD_STMT_LIT_08_LEN);
    localGdStmtLit08Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit08Constraints(char[] value) {
    return super.checkConstraints(value, 33, false, false);
  }
  /**
   * refreshGdStmtLit08 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit08() {
    return (substring(getStringValue(), beginGdStmtLit08, beginGdStmtLit08 + GD_STMT_LIT_08_LEN));
  }

  int localGdStmtLit09Counter = -1;

  public boolean isGdStmtLit09Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit09Counter != sharedCounter;
    localGdStmtLit09Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_09_LEN = 34;
  /** serialize this GdStmtLit09 */
  protected void serializeGdStmtLit09(char[] gdStmtLit09) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit09, 0, getStringValue(), beginGdStmtLit09, GD_STMT_LIT_09_LEN);
    localGdStmtLit09Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit09Constraints(char[] value) {
    return super.checkConstraints(value, 34, false, false);
  }
  /**
   * refreshGdStmtLit09 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit09() {
    return (substring(getStringValue(), beginGdStmtLit09, beginGdStmtLit09 + GD_STMT_LIT_09_LEN));
  }

  int localGdStmtLit10Counter = -1;

  public boolean isGdStmtLit10Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit10Counter != sharedCounter;
    localGdStmtLit10Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_10_LEN = 27;
  /** serialize this GdStmtLit10 */
  protected void serializeGdStmtLit10(char[] gdStmtLit10) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit10, 0, getStringValue(), beginGdStmtLit10, GD_STMT_LIT_10_LEN);
    localGdStmtLit10Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit10Constraints(char[] value) {
    return super.checkConstraints(value, 27, false, false);
  }
  /**
   * refreshGdStmtLit10 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit10() {
    return (substring(getStringValue(), beginGdStmtLit10, beginGdStmtLit10 + GD_STMT_LIT_10_LEN));
  }

  int localGdStmtLit11Counter = -1;

  public boolean isGdStmtLit11Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit11Counter != sharedCounter;
    localGdStmtLit11Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_11_LEN = 7;
  /** serialize this GdStmtLit11 */
  protected void serializeGdStmtLit11(char[] gdStmtLit11) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit11, 0, getStringValue(), beginGdStmtLit11, GD_STMT_LIT_11_LEN);
    localGdStmtLit11Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit11Constraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshGdStmtLit11 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit11() {
    return (substring(getStringValue(), beginGdStmtLit11, beginGdStmtLit11 + GD_STMT_LIT_11_LEN));
  }

  int localGdStmtLit12Counter = -1;

  public boolean isGdStmtLit12Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit12Counter != sharedCounter;
    localGdStmtLit12Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_12_LEN = 9;
  /** serialize this GdStmtLit12 */
  protected void serializeGdStmtLit12(char[] gdStmtLit12) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit12, 0, getStringValue(), beginGdStmtLit12, GD_STMT_LIT_12_LEN);
    localGdStmtLit12Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit12Constraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshGdStmtLit12 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit12() {
    return (substring(getStringValue(), beginGdStmtLit12, beginGdStmtLit12 + GD_STMT_LIT_12_LEN));
  }

  int localGdStmtLit13Counter = -1;

  public boolean isGdStmtLit13Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdStmtLit13Counter != sharedCounter;
    localGdStmtLit13Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_STMT_LIT_13_LEN = 12;
  /** serialize this GdStmtLit13 */
  protected void serializeGdStmtLit13(char[] gdStmtLit13) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdStmtLit13, 0, getStringValue(), beginGdStmtLit13, GD_STMT_LIT_13_LEN);
    localGdStmtLit13Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdStmtLit13Constraints(char[] value) {
    return super.checkConstraints(value, 12, false, false);
  }
  /**
   * refreshGdStmtLit13 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdStmtLit13() {
    return (substring(getStringValue(), beginGdStmtLit13, beginGdStmtLit13 + GD_STMT_LIT_13_LEN));
  }

  int localGdCondLit01Counter = -1;

  public boolean isGdCondLit01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit01Counter != sharedCounter;
    localGdCondLit01Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_01_LEN = 15;
  /** serialize this GdCondLit01 */
  protected void serializeGdCondLit01(char[] gdCondLit01) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit01, 0, getStringValue(), beginGdCondLit01, GD_COND_LIT_01_LEN);
    localGdCondLit01Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit01Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit01 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit01() {
    return (substring(getStringValue(), beginGdCondLit01, beginGdCondLit01 + GD_COND_LIT_01_LEN));
  }

  int localGdCondLit02Counter = -1;

  public boolean isGdCondLit02Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit02Counter != sharedCounter;
    localGdCondLit02Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_02_LEN = 19;
  /** serialize this GdCondLit02 */
  protected void serializeGdCondLit02(char[] gdCondLit02) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit02, 0, getStringValue(), beginGdCondLit02, GD_COND_LIT_02_LEN);
    localGdCondLit02Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit02Constraints(char[] value) {
    return super.checkConstraints(value, 19, false, false);
  }
  /**
   * refreshGdCondLit02 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit02() {
    return (substring(getStringValue(), beginGdCondLit02, beginGdCondLit02 + GD_COND_LIT_02_LEN));
  }

  int localGdCondLit03Counter = -1;

  public boolean isGdCondLit03Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit03Counter != sharedCounter;
    localGdCondLit03Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_03_LEN = 14;
  /** serialize this GdCondLit03 */
  protected void serializeGdCondLit03(char[] gdCondLit03) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit03, 0, getStringValue(), beginGdCondLit03, GD_COND_LIT_03_LEN);
    localGdCondLit03Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit03Constraints(char[] value) {
    return super.checkConstraints(value, 14, false, false);
  }
  /**
   * refreshGdCondLit03 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit03() {
    return (substring(getStringValue(), beginGdCondLit03, beginGdCondLit03 + GD_COND_LIT_03_LEN));
  }

  int localGdCondLit04Counter = -1;

  public boolean isGdCondLit04Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit04Counter != sharedCounter;
    localGdCondLit04Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_04_LEN = 18;
  /** serialize this GdCondLit04 */
  protected void serializeGdCondLit04(char[] gdCondLit04) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit04, 0, getStringValue(), beginGdCondLit04, GD_COND_LIT_04_LEN);
    localGdCondLit04Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit04Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit04 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit04() {
    return (substring(getStringValue(), beginGdCondLit04, beginGdCondLit04 + GD_COND_LIT_04_LEN));
  }

  int localGdCondLit05Counter = -1;

  public boolean isGdCondLit05Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit05Counter != sharedCounter;
    localGdCondLit05Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_05_LEN = 18;
  /** serialize this GdCondLit05 */
  protected void serializeGdCondLit05(char[] gdCondLit05) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit05, 0, getStringValue(), beginGdCondLit05, GD_COND_LIT_05_LEN);
    localGdCondLit05Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit05Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit05 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit05() {
    return (substring(getStringValue(), beginGdCondLit05, beginGdCondLit05 + GD_COND_LIT_05_LEN));
  }

  int localGdCondLit06Counter = -1;

  public boolean isGdCondLit06Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit06Counter != sharedCounter;
    localGdCondLit06Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_06_LEN = 18;
  /** serialize this GdCondLit06 */
  protected void serializeGdCondLit06(char[] gdCondLit06) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit06, 0, getStringValue(), beginGdCondLit06, GD_COND_LIT_06_LEN);
    localGdCondLit06Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit06Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit06 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit06() {
    return (substring(getStringValue(), beginGdCondLit06, beginGdCondLit06 + GD_COND_LIT_06_LEN));
  }

  int localGdCondLit07Counter = -1;

  public boolean isGdCondLit07Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit07Counter != sharedCounter;
    localGdCondLit07Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_07_LEN = 18;
  /** serialize this GdCondLit07 */
  protected void serializeGdCondLit07(char[] gdCondLit07) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit07, 0, getStringValue(), beginGdCondLit07, GD_COND_LIT_07_LEN);
    localGdCondLit07Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit07Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit07 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit07() {
    return (substring(getStringValue(), beginGdCondLit07, beginGdCondLit07 + GD_COND_LIT_07_LEN));
  }

  int localGdCondLit08Counter = -1;

  public boolean isGdCondLit08Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit08Counter != sharedCounter;
    localGdCondLit08Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_08_LEN = 29;
  /** serialize this GdCondLit08 */
  protected void serializeGdCondLit08(char[] gdCondLit08) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit08, 0, getStringValue(), beginGdCondLit08, GD_COND_LIT_08_LEN);
    localGdCondLit08Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit08Constraints(char[] value) {
    return super.checkConstraints(value, 29, false, false);
  }
  /**
   * refreshGdCondLit08 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit08() {
    return (substring(getStringValue(), beginGdCondLit08, beginGdCondLit08 + GD_COND_LIT_08_LEN));
  }

  int localGdCondLit09Counter = -1;

  public boolean isGdCondLit09Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit09Counter != sharedCounter;
    localGdCondLit09Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_09_LEN = 18;
  /** serialize this GdCondLit09 */
  protected void serializeGdCondLit09(char[] gdCondLit09) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit09, 0, getStringValue(), beginGdCondLit09, GD_COND_LIT_09_LEN);
    localGdCondLit09Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit09Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit09 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit09() {
    return (substring(getStringValue(), beginGdCondLit09, beginGdCondLit09 + GD_COND_LIT_09_LEN));
  }

  int localGdCondLit10Counter = -1;

  public boolean isGdCondLit10Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit10Counter != sharedCounter;
    localGdCondLit10Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_10_LEN = 17;
  /** serialize this GdCondLit10 */
  protected void serializeGdCondLit10(char[] gdCondLit10) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit10, 0, getStringValue(), beginGdCondLit10, GD_COND_LIT_10_LEN);
    localGdCondLit10Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit10Constraints(char[] value) {
    return super.checkConstraints(value, 17, false, false);
  }
  /**
   * refreshGdCondLit10 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit10() {
    return (substring(getStringValue(), beginGdCondLit10, beginGdCondLit10 + GD_COND_LIT_10_LEN));
  }

  int localGdCondLit11Counter = -1;

  public boolean isGdCondLit11Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit11Counter != sharedCounter;
    localGdCondLit11Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_11_LEN = 29;
  /** serialize this GdCondLit11 */
  protected void serializeGdCondLit11(char[] gdCondLit11) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit11, 0, getStringValue(), beginGdCondLit11, GD_COND_LIT_11_LEN);
    localGdCondLit11Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit11Constraints(char[] value) {
    return super.checkConstraints(value, 29, false, false);
  }
  /**
   * refreshGdCondLit11 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit11() {
    return (substring(getStringValue(), beginGdCondLit11, beginGdCondLit11 + GD_COND_LIT_11_LEN));
  }

  int localGdCondLit12Counter = -1;

  public boolean isGdCondLit12Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit12Counter != sharedCounter;
    localGdCondLit12Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_12_LEN = 17;
  /** serialize this GdCondLit12 */
  protected void serializeGdCondLit12(char[] gdCondLit12) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit12, 0, getStringValue(), beginGdCondLit12, GD_COND_LIT_12_LEN);
    localGdCondLit12Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit12Constraints(char[] value) {
    return super.checkConstraints(value, 17, false, false);
  }
  /**
   * refreshGdCondLit12 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit12() {
    return (substring(getStringValue(), beginGdCondLit12, beginGdCondLit12 + GD_COND_LIT_12_LEN));
  }

  int localGdCondLit13Counter = -1;

  public boolean isGdCondLit13Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit13Counter != sharedCounter;
    localGdCondLit13Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_13_LEN = 18;
  /** serialize this GdCondLit13 */
  protected void serializeGdCondLit13(char[] gdCondLit13) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit13, 0, getStringValue(), beginGdCondLit13, GD_COND_LIT_13_LEN);
    localGdCondLit13Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit13Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit13 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit13() {
    return (substring(getStringValue(), beginGdCondLit13, beginGdCondLit13 + GD_COND_LIT_13_LEN));
  }

  int localGdCondLit14Counter = -1;

  public boolean isGdCondLit14Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit14Counter != sharedCounter;
    localGdCondLit14Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_14_LEN = 23;
  /** serialize this GdCondLit14 */
  protected void serializeGdCondLit14(char[] gdCondLit14) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit14, 0, getStringValue(), beginGdCondLit14, GD_COND_LIT_14_LEN);
    localGdCondLit14Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit14Constraints(char[] value) {
    return super.checkConstraints(value, 23, false, false);
  }
  /**
   * refreshGdCondLit14 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit14() {
    return (substring(getStringValue(), beginGdCondLit14, beginGdCondLit14 + GD_COND_LIT_14_LEN));
  }

  int localGdCondLit15Counter = -1;

  public boolean isGdCondLit15Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit15Counter != sharedCounter;
    localGdCondLit15Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_15_LEN = 17;
  /** serialize this GdCondLit15 */
  protected void serializeGdCondLit15(char[] gdCondLit15) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit15, 0, getStringValue(), beginGdCondLit15, GD_COND_LIT_15_LEN);
    localGdCondLit15Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit15Constraints(char[] value) {
    return super.checkConstraints(value, 17, false, false);
  }
  /**
   * refreshGdCondLit15 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit15() {
    return (substring(getStringValue(), beginGdCondLit15, beginGdCondLit15 + GD_COND_LIT_15_LEN));
  }

  int localGdCondLit16Counter = -1;

  public boolean isGdCondLit16Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit16Counter != sharedCounter;
    localGdCondLit16Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_16_LEN = 18;
  /** serialize this GdCondLit16 */
  protected void serializeGdCondLit16(char[] gdCondLit16) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit16, 0, getStringValue(), beginGdCondLit16, GD_COND_LIT_16_LEN);
    localGdCondLit16Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit16Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit16 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit16() {
    return (substring(getStringValue(), beginGdCondLit16, beginGdCondLit16 + GD_COND_LIT_16_LEN));
  }

  int localGdCondLit17Counter = -1;

  public boolean isGdCondLit17Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit17Counter != sharedCounter;
    localGdCondLit17Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_17_LEN = 15;
  /** serialize this GdCondLit17 */
  protected void serializeGdCondLit17(char[] gdCondLit17) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit17, 0, getStringValue(), beginGdCondLit17, GD_COND_LIT_17_LEN);
    localGdCondLit17Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit17Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit17 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit17() {
    return (substring(getStringValue(), beginGdCondLit17, beginGdCondLit17 + GD_COND_LIT_17_LEN));
  }

  int localGdCondLit18Counter = -1;

  public boolean isGdCondLit18Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit18Counter != sharedCounter;
    localGdCondLit18Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_18_LEN = 15;
  /** serialize this GdCondLit18 */
  protected void serializeGdCondLit18(char[] gdCondLit18) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit18, 0, getStringValue(), beginGdCondLit18, GD_COND_LIT_18_LEN);
    localGdCondLit18Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit18Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit18 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit18() {
    return (substring(getStringValue(), beginGdCondLit18, beginGdCondLit18 + GD_COND_LIT_18_LEN));
  }

  int localGdCondLit19Counter = -1;

  public boolean isGdCondLit19Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit19Counter != sharedCounter;
    localGdCondLit19Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_19_LEN = 15;
  /** serialize this GdCondLit19 */
  protected void serializeGdCondLit19(char[] gdCondLit19) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit19, 0, getStringValue(), beginGdCondLit19, GD_COND_LIT_19_LEN);
    localGdCondLit19Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit19Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit19 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit19() {
    return (substring(getStringValue(), beginGdCondLit19, beginGdCondLit19 + GD_COND_LIT_19_LEN));
  }

  int localGdCondLit20Counter = -1;

  public boolean isGdCondLit20Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit20Counter != sharedCounter;
    localGdCondLit20Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_20_LEN = 15;
  /** serialize this GdCondLit20 */
  protected void serializeGdCondLit20(char[] gdCondLit20) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit20, 0, getStringValue(), beginGdCondLit20, GD_COND_LIT_20_LEN);
    localGdCondLit20Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit20Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit20 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit20() {
    return (substring(getStringValue(), beginGdCondLit20, beginGdCondLit20 + GD_COND_LIT_20_LEN));
  }

  int localGdCondLit21Counter = -1;

  public boolean isGdCondLit21Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit21Counter != sharedCounter;
    localGdCondLit21Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_21_LEN = 15;
  /** serialize this GdCondLit21 */
  protected void serializeGdCondLit21(char[] gdCondLit21) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit21, 0, getStringValue(), beginGdCondLit21, GD_COND_LIT_21_LEN);
    localGdCondLit21Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit21Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit21 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit21() {
    return (substring(getStringValue(), beginGdCondLit21, beginGdCondLit21 + GD_COND_LIT_21_LEN));
  }

  int localGdCondLit22Counter = -1;

  public boolean isGdCondLit22Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit22Counter != sharedCounter;
    localGdCondLit22Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_22_LEN = 15;
  /** serialize this GdCondLit22 */
  protected void serializeGdCondLit22(char[] gdCondLit22) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit22, 0, getStringValue(), beginGdCondLit22, GD_COND_LIT_22_LEN);
    localGdCondLit22Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit22Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit22 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit22() {
    return (substring(getStringValue(), beginGdCondLit22, beginGdCondLit22 + GD_COND_LIT_22_LEN));
  }

  int localGdCondLit23Counter = -1;

  public boolean isGdCondLit23Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit23Counter != sharedCounter;
    localGdCondLit23Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_23_LEN = 18;
  /** serialize this GdCondLit23 */
  protected void serializeGdCondLit23(char[] gdCondLit23) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit23, 0, getStringValue(), beginGdCondLit23, GD_COND_LIT_23_LEN);
    localGdCondLit23Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit23Constraints(char[] value) {
    return super.checkConstraints(value, 18, false, false);
  }
  /**
   * refreshGdCondLit23 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit23() {
    return (substring(getStringValue(), beginGdCondLit23, beginGdCondLit23 + GD_COND_LIT_23_LEN));
  }

  int localGdCondLit24Counter = -1;

  public boolean isGdCondLit24Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit24Counter != sharedCounter;
    localGdCondLit24Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_24_LEN = 15;
  /** serialize this GdCondLit24 */
  protected void serializeGdCondLit24(char[] gdCondLit24) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit24, 0, getStringValue(), beginGdCondLit24, GD_COND_LIT_24_LEN);
    localGdCondLit24Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit24Constraints(char[] value) {
    return super.checkConstraints(value, 15, false, false);
  }
  /**
   * refreshGdCondLit24 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit24() {
    return (substring(getStringValue(), beginGdCondLit24, beginGdCondLit24 + GD_COND_LIT_24_LEN));
  }

  int localGdCondLit25Counter = -1;

  public boolean isGdCondLit25Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit25Counter != sharedCounter;
    localGdCondLit25Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_25_LEN = 20;
  /** serialize this GdCondLit25 */
  protected void serializeGdCondLit25(char[] gdCondLit25) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit25, 0, getStringValue(), beginGdCondLit25, GD_COND_LIT_25_LEN);
    localGdCondLit25Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit25Constraints(char[] value) {
    return super.checkConstraints(value, 20, false, false);
  }
  /**
   * refreshGdCondLit25 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit25() {
    return (substring(getStringValue(), beginGdCondLit25, beginGdCondLit25 + GD_COND_LIT_25_LEN));
  }

  int localGdCondLit26Counter = -1;

  public boolean isGdCondLit26Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCondLit26Counter != sharedCounter;
    localGdCondLit26Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_COND_LIT_26_LEN = 14;
  /** serialize this GdCondLit26 */
  protected void serializeGdCondLit26(char[] gdCondLit26) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCondLit26, 0, getStringValue(), beginGdCondLit26, GD_COND_LIT_26_LEN);
    localGdCondLit26Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCondLit26Constraints(char[] value) {
    return super.checkConstraints(value, 14, false, false);
  }
  /**
   * refreshGdCondLit26 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdCondLit26() {
    return (substring(getStringValue(), beginGdCondLit26, beginGdCondLit26 + GD_COND_LIT_26_LEN));
  }

  int localGdConnLit01Counter = -1;

  public boolean isGdConnLit01Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnLit01Counter != sharedCounter;
    localGdConnLit01Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_LIT_01_LEN = 26;
  /** serialize this GdConnLit01 */
  protected void serializeGdConnLit01(char[] gdConnLit01) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdConnLit01, 0, getStringValue(), beginGdConnLit01, GD_CONN_LIT_01_LEN);
    localGdConnLit01Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdConnLit01Constraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshGdConnLit01 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdConnLit01() {
    return (substring(getStringValue(), beginGdConnLit01, beginGdConnLit01 + GD_CONN_LIT_01_LEN));
  }

  int localGdConnLit02Counter = -1;

  public boolean isGdConnLit02Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnLit02Counter != sharedCounter;
    localGdConnLit02Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_LIT_02_LEN = 23;
  /** serialize this GdConnLit02 */
  protected void serializeGdConnLit02(char[] gdConnLit02) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdConnLit02, 0, getStringValue(), beginGdConnLit02, GD_CONN_LIT_02_LEN);
    localGdConnLit02Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdConnLit02Constraints(char[] value) {
    return super.checkConstraints(value, 23, false, false);
  }
  /**
   * refreshGdConnLit02 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdConnLit02() {
    return (substring(getStringValue(), beginGdConnLit02, beginGdConnLit02 + GD_CONN_LIT_02_LEN));
  }

  int localGdConnLit03Counter = -1;

  public boolean isGdConnLit03Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnLit03Counter != sharedCounter;
    localGdConnLit03Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_LIT_03_LEN = 23;
  /** serialize this GdConnLit03 */
  protected void serializeGdConnLit03(char[] gdConnLit03) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdConnLit03, 0, getStringValue(), beginGdConnLit03, GD_CONN_LIT_03_LEN);
    localGdConnLit03Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdConnLit03Constraints(char[] value) {
    return super.checkConstraints(value, 23, false, false);
  }
  /**
   * refreshGdConnLit03 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdConnLit03() {
    return (substring(getStringValue(), beginGdConnLit03, beginGdConnLit03 + GD_CONN_LIT_03_LEN));
  }

  int localGdConnLit04Counter = -1;

  public boolean isGdConnLit04Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnLit04Counter != sharedCounter;
    localGdConnLit04Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_LIT_04_LEN = 24;
  /** serialize this GdConnLit04 */
  protected void serializeGdConnLit04(char[] gdConnLit04) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdConnLit04, 0, getStringValue(), beginGdConnLit04, GD_CONN_LIT_04_LEN);
    localGdConnLit04Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdConnLit04Constraints(char[] value) {
    return super.checkConstraints(value, 24, false, false);
  }
  /**
   * refreshGdConnLit04 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdConnLit04() {
    return (substring(getStringValue(), beginGdConnLit04, beginGdConnLit04 + GD_CONN_LIT_04_LEN));
  }

  int localGdConnLit05Counter = -1;

  public boolean isGdConnLit05Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnLit05Counter != sharedCounter;
    localGdConnLit05Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_LIT_05_LEN = 22;
  /** serialize this GdConnLit05 */
  protected void serializeGdConnLit05(char[] gdConnLit05) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdConnLit05, 0, getStringValue(), beginGdConnLit05, GD_CONN_LIT_05_LEN);
    localGdConnLit05Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdConnLit05Constraints(char[] value) {
    return super.checkConstraints(value, 22, false, false);
  }
  /**
   * refreshGdConnLit05 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdConnLit05() {
    return (substring(getStringValue(), beginGdConnLit05, beginGdConnLit05 + GD_CONN_LIT_05_LEN));
  }

  int localGdConnLit06Counter = -1;

  public boolean isGdConnLit06Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnLit06Counter != sharedCounter;
    localGdConnLit06Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_LIT_06_LEN = 17;
  /** serialize this GdConnLit06 */
  protected void serializeGdConnLit06(char[] gdConnLit06) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdConnLit06, 0, getStringValue(), beginGdConnLit06, GD_CONN_LIT_06_LEN);
    localGdConnLit06Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdConnLit06Constraints(char[] value) {
    return super.checkConstraints(value, 17, false, false);
  }
  /**
   * refreshGdConnLit06 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdConnLit06() {
    return (substring(getStringValue(), beginGdConnLit06, beginGdConnLit06 + GD_CONN_LIT_06_LEN));
  }

  int localGdConnLit07Counter = -1;

  public boolean isGdConnLit07Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnLit07Counter != sharedCounter;
    localGdConnLit07Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_LIT_07_LEN = 24;
  /** serialize this GdConnLit07 */
  protected void serializeGdConnLit07(char[] gdConnLit07) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdConnLit07, 0, getStringValue(), beginGdConnLit07, GD_CONN_LIT_07_LEN);
    localGdConnLit07Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdConnLit07Constraints(char[] value) {
    return super.checkConstraints(value, 24, false, false);
  }
  /**
   * refreshGdConnLit07 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdConnLit07() {
    return (substring(getStringValue(), beginGdConnLit07, beginGdConnLit07 + GD_CONN_LIT_07_LEN));
  }

  int localGdConditionNumberCounter = -1;

  public boolean isGdConditionNumberModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConditionNumberCounter != sharedCounter;
    localGdConditionNumberCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONDITION_NUMBER_LEN = 4;
  /** serializeGdConditionNumber */
  protected void serializeGdConditionNumber(int gdConditionNumber) {
    replaceValue( //  save the value as string
        getBinaryString(gdConditionNumber, GD_CONDITION_NUMBER_LEN),
        beginGdConditionNumber,
        GD_CONDITION_NUMBER_LEN);
    localGdConditionNumberCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdConditionNumberMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdConditionNumber is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdConditionNumber() {
    return (getInt(beginGdConditionNumber));
  }

  int localGdErrorCode1Counter = -1;

  public boolean isGdErrorCode1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdErrorCode1Counter != sharedCounter;
    localGdErrorCode1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ERROR_CODE_1_LEN = 4;
  /** serializeGdErrorCode1 */
  protected void serializeGdErrorCode1(int gdErrorCode1) {
    replaceValue( //  save the value as string
        getBinaryString(gdErrorCode1, GD_ERROR_CODE_1_LEN), beginGdErrorCode1, GD_ERROR_CODE_1_LEN);
    localGdErrorCode1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdErrorCode1MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdErrorCode1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdErrorCode1() {
    return (getInt(beginGdErrorCode1));
  }

  int localGdErrorCode2Counter = -1;

  public boolean isGdErrorCode2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdErrorCode2Counter != sharedCounter;
    localGdErrorCode2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ERROR_CODE_2_LEN = 4;
  /** serializeGdErrorCode2 */
  protected void serializeGdErrorCode2(int gdErrorCode2) {
    replaceValue( //  save the value as string
        getBinaryString(gdErrorCode2, GD_ERROR_CODE_2_LEN), beginGdErrorCode2, GD_ERROR_CODE_2_LEN);
    localGdErrorCode2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdErrorCode2MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdErrorCode2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdErrorCode2() {
    return (getInt(beginGdErrorCode2));
  }

  int localGdErrorCode3Counter = -1;

  public boolean isGdErrorCode3Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdErrorCode3Counter != sharedCounter;
    localGdErrorCode3Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ERROR_CODE_3_LEN = 4;
  /** serializeGdErrorCode3 */
  protected void serializeGdErrorCode3(int gdErrorCode3) {
    replaceValue( //  save the value as string
        getBinaryString(gdErrorCode3, GD_ERROR_CODE_3_LEN), beginGdErrorCode3, GD_ERROR_CODE_3_LEN);
    localGdErrorCode3Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdErrorCode3MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdErrorCode3 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdErrorCode3() {
    return (getInt(beginGdErrorCode3));
  }

  int localGdErrorCode4Counter = -1;

  public boolean isGdErrorCode4Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdErrorCode4Counter != sharedCounter;
    localGdErrorCode4Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ERROR_CODE_4_LEN = 4;
  /** serializeGdErrorCode4 */
  protected void serializeGdErrorCode4(int gdErrorCode4) {
    replaceValue( //  save the value as string
        getBinaryString(gdErrorCode4, GD_ERROR_CODE_4_LEN), beginGdErrorCode4, GD_ERROR_CODE_4_LEN);
    localGdErrorCode4Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdErrorCode4MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdErrorCode4 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdErrorCode4() {
    return (getInt(beginGdErrorCode4));
  }

  int localGdInternalErrPtrCounter = -1;

  public boolean isGdInternalErrPtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdInternalErrPtrCounter != sharedCounter;
    localGdInternalErrPtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_INTERNAL_ERR_PTR_LEN = 4;
  /** serializeGdInternalErrPtr */
  protected void serializeGdInternalErrPtr(int gdInternalErrPtr) {
    replaceValue( //  save the value as string
        getBinaryString(gdInternalErrPtr, GD_INTERNAL_ERR_PTR_LEN),
        beginGdInternalErrPtr,
        GD_INTERNAL_ERR_PTR_LEN);
    localGdInternalErrPtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdInternalErrPtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdInternalErrPtr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdInternalErrPtr() {
    return (getInt(beginGdInternalErrPtr));
  }

  int localGdLineNumberCounter = -1;

  public boolean isGdLineNumberModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdLineNumberCounter != sharedCounter;
    localGdLineNumberCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_LINE_NUMBER_LEN = 4;
  /** serializeGdLineNumber */
  protected void serializeGdLineNumber(int gdLineNumber) {
    replaceValue( //  save the value as string
        getBinaryString(gdLineNumber, GD_LINE_NUMBER_LEN), beginGdLineNumber, GD_LINE_NUMBER_LEN);
    localGdLineNumberCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdLineNumberMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdLineNumber is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdLineNumber() {
    return (getInt(beginGdLineNumber));
  }

  int localGdMessageIdCounter = -1;

  public boolean isGdMessageIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdMessageIdCounter != sharedCounter;
    localGdMessageIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_MESSAGE_ID_LEN = 10;
  /** serialize this GdMessageId */
  protected void serializeGdMessageId(char[] gdMessageId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdMessageId, 0, getStringValue(), beginGdMessageId, GD_MESSAGE_ID_LEN);
    localGdMessageIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdMessageIdConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshGdMessageId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdMessageId() {
    return (substring(getStringValue(), beginGdMessageId, beginGdMessageId + GD_MESSAGE_ID_LEN));
  }

  int localGdModDetectingErrCounter = -1;

  public boolean isGdModDetectingErrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdModDetectingErrCounter != sharedCounter;
    localGdModDetectingErrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_MOD_DETECTING_ERR_LEN = 8;
  /** serialize this GdModDetectingErr */
  protected void serializeGdModDetectingErr(char[] gdModDetectingErr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        gdModDetectingErr, 0, getStringValue(), beginGdModDetectingErr, GD_MOD_DETECTING_ERR_LEN);
    localGdModDetectingErrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdModDetectingErrConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshGdModDetectingErr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdModDetectingErr() {
    return (substring(
        getStringValue(),
        beginGdModDetectingErr,
        beginGdModDetectingErr + GD_MOD_DETECTING_ERR_LEN));
  }

  int localGdReasonCodeCounter = -1;

  public boolean isGdReasonCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdReasonCodeCounter != sharedCounter;
    localGdReasonCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_REASON_CODE_LEN = 4;
  /** serializeGdReasonCode */
  protected void serializeGdReasonCode(int gdReasonCode) {
    replaceValue( //  save the value as string
        getBinaryString(gdReasonCode, GD_REASON_CODE_LEN), beginGdReasonCode, GD_REASON_CODE_LEN);
    localGdReasonCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdReasonCodeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdReasonCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdReasonCode() {
    return (getInt(beginGdReasonCode));
  }

  int localGdReturnedSqlcodeCounter = -1;

  public boolean isGdReturnedSqlcodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdReturnedSqlcodeCounter != sharedCounter;
    localGdReturnedSqlcodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_RETURNED_SQLCODE_LEN = 4;
  /** serializeGdReturnedSqlcode */
  protected void serializeGdReturnedSqlcode(int gdReturnedSqlcode) {
    replaceValue( //  save the value as string
        getBinaryString(gdReturnedSqlcode, GD_RETURNED_SQLCODE_LEN),
        beginGdReturnedSqlcode,
        GD_RETURNED_SQLCODE_LEN);
    localGdReturnedSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdReturnedSqlcodeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdReturnedSqlcode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdReturnedSqlcode() {
    return (getInt(beginGdReturnedSqlcode));
  }

  int localGdRowNumberCounter = -1;

  public boolean isGdRowNumberModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdRowNumberCounter != sharedCounter;
    localGdRowNumberCounter = sharedCounter;
    return hasModified;
  }

  public boolean gdRowNumberIsNumeric() {
    return decimalIsNumeric(
        beginGdRowNumber,
        GD_ROW_NUMBER_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int GD_ROW_NUMBER_LEN = 16;
  /** serializeGdRowNumber */
  protected void serializeGdRowNumber(long gdRowNumber) {
    putDecimal(beginGdRowNumber, gdRowNumber, GD_ROW_NUMBER_LEN, true);
  }

  protected long checkGdRowNumberMaxLimit(long number) {
    return checkMaxLimit(number, Long.MAX_VALUE /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshGdRowNumber is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public long refreshGdRowNumber() throws CFException {
    try {
      return (getLongDecimal(beginGdRowNumber, GD_ROW_NUMBER_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("gdRowNumber", beginGdRowNumber, GD_ROW_NUMBER_LEN);
    }
  }

  int localGdSqlerrdSetCounter = -1;

  public boolean isGdSqlerrdSetModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlerrdSetCounter != sharedCounter;
    localGdSqlerrdSetCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLERRD_SET_LEN = 1;
  /** serialize this GdSqlerrdSet */
  protected void serializeGdSqlerrdSet(char[] gdSqlerrdSet) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdSqlerrdSet, 0, getStringValue(), beginGdSqlerrdSet, GD_SQLERRD_SET_LEN);
    localGdSqlerrdSetCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdSqlerrdSetConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdSqlerrdSet is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdSqlerrdSet() {
    return (substring(getStringValue(), beginGdSqlerrdSet, beginGdSqlerrdSet + GD_SQLERRD_SET_LEN));
  }

  int localGdSqlerrd1Counter = -1;

  public boolean isGdSqlerrd1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlerrd1Counter != sharedCounter;
    localGdSqlerrd1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLERRD_1_LEN = 4;
  /** serializeGdSqlerrd1 */
  protected void serializeGdSqlerrd1(int gdSqlerrd1) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlerrd1, GD_SQLERRD_1_LEN), beginGdSqlerrd1, GD_SQLERRD_1_LEN);
    localGdSqlerrd1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdSqlerrd1MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdSqlerrd1 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdSqlerrd1() {
    return (getInt(beginGdSqlerrd1));
  }

  int localGdSqlerrd2Counter = -1;

  public boolean isGdSqlerrd2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlerrd2Counter != sharedCounter;
    localGdSqlerrd2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLERRD_2_LEN = 4;
  /** serializeGdSqlerrd2 */
  protected void serializeGdSqlerrd2(int gdSqlerrd2) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlerrd2, GD_SQLERRD_2_LEN), beginGdSqlerrd2, GD_SQLERRD_2_LEN);
    localGdSqlerrd2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdSqlerrd2MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdSqlerrd2 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdSqlerrd2() {
    return (getInt(beginGdSqlerrd2));
  }

  int localGdSqlerrd3Counter = -1;

  public boolean isGdSqlerrd3Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlerrd3Counter != sharedCounter;
    localGdSqlerrd3Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLERRD_3_LEN = 4;
  /** serializeGdSqlerrd3 */
  protected void serializeGdSqlerrd3(int gdSqlerrd3) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlerrd3, GD_SQLERRD_3_LEN), beginGdSqlerrd3, GD_SQLERRD_3_LEN);
    localGdSqlerrd3Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdSqlerrd3MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdSqlerrd3 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdSqlerrd3() {
    return (getInt(beginGdSqlerrd3));
  }

  int localGdSqlerrd4Counter = -1;

  public boolean isGdSqlerrd4Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlerrd4Counter != sharedCounter;
    localGdSqlerrd4Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLERRD_4_LEN = 4;
  /** serializeGdSqlerrd4 */
  protected void serializeGdSqlerrd4(int gdSqlerrd4) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlerrd4, GD_SQLERRD_4_LEN), beginGdSqlerrd4, GD_SQLERRD_4_LEN);
    localGdSqlerrd4Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdSqlerrd4MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdSqlerrd4 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdSqlerrd4() {
    return (getInt(beginGdSqlerrd4));
  }

  int localGdSqlerrd5Counter = -1;

  public boolean isGdSqlerrd5Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlerrd5Counter != sharedCounter;
    localGdSqlerrd5Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLERRD_5_LEN = 4;
  /** serializeGdSqlerrd5 */
  protected void serializeGdSqlerrd5(int gdSqlerrd5) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlerrd5, GD_SQLERRD_5_LEN), beginGdSqlerrd5, GD_SQLERRD_5_LEN);
    localGdSqlerrd5Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdSqlerrd5MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdSqlerrd5 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdSqlerrd5() {
    return (getInt(beginGdSqlerrd5));
  }

  int localGdSqlerrd6Counter = -1;

  public boolean isGdSqlerrd6Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdSqlerrd6Counter != sharedCounter;
    localGdSqlerrd6Counter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SQLERRD_6_LEN = 4;
  /** serializeGdSqlerrd6 */
  protected void serializeGdSqlerrd6(int gdSqlerrd6) {
    replaceValue( //  save the value as string
        getBinaryString(gdSqlerrd6, GD_SQLERRD_6_LEN), beginGdSqlerrd6, GD_SQLERRD_6_LEN);
    localGdSqlerrd6Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdSqlerrd6MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdSqlerrd6 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdSqlerrd6() {
    return (getInt(beginGdSqlerrd6));
  }

  int localGdTokenCountCounter = -1;

  public boolean isGdTokenCountModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdTokenCountCounter != sharedCounter;
    localGdTokenCountCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_TOKEN_COUNT_LEN = 4;
  /** serializeGdTokenCount */
  protected void serializeGdTokenCount(int gdTokenCount) {
    replaceValue( //  save the value as string
        getBinaryString(gdTokenCount, GD_TOKEN_COUNT_LEN), beginGdTokenCount, GD_TOKEN_COUNT_LEN);
    localGdTokenCountCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdTokenCountMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdTokenCount is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdTokenCount() {
    return (getInt(beginGdTokenCount));
  }

  int localGdReturnedSqlstateCounter = -1;

  public boolean isGdReturnedSqlstateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdReturnedSqlstateCounter != sharedCounter;
    localGdReturnedSqlstateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_RETURNED_SQLSTATE_LEN = 5;
  /** serialize this GdReturnedSqlstate */
  protected void serializeGdReturnedSqlstate(char[] gdReturnedSqlstate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        gdReturnedSqlstate, 0, getStringValue(), beginGdReturnedSqlstate, GD_RETURNED_SQLSTATE_LEN);
    localGdReturnedSqlstateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdReturnedSqlstateConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshGdReturnedSqlstate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdReturnedSqlstate() {
    return (substring(
        getStringValue(),
        beginGdReturnedSqlstate,
        beginGdReturnedSqlstate + GD_RETURNED_SQLSTATE_LEN));
  }

  int localGdAuthTypeCounter = -1;

  public boolean isGdAuthTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdAuthTypeCounter != sharedCounter;
    localGdAuthTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_AUTH_TYPE_LEN = 1;
  /** serialize this GdAuthType */
  protected void serializeGdAuthType(char[] gdAuthType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdAuthType, 0, getStringValue(), beginGdAuthType, GD_AUTH_TYPE_LEN);
    localGdAuthTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdAuthTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdAuthType is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdAuthType() {
    return (substring(getStringValue(), beginGdAuthType, beginGdAuthType + GD_AUTH_TYPE_LEN));
  }

  int localGdConnStateCounter = -1;

  public boolean isGdConnStateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnStateCounter != sharedCounter;
    localGdConnStateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_STATE_LEN = 4;
  /** serializeGdConnState */
  protected void serializeGdConnState(int gdConnState) {
    replaceValue( //  save the value as string
        getBinaryString(gdConnState, GD_CONN_STATE_LEN), beginGdConnState, GD_CONN_STATE_LEN);
    localGdConnStateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdConnStateMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdConnState is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdConnState() {
    return (getInt(beginGdConnState));
  }

  int localGdConnStatusCounter = -1;

  public boolean isGdConnStatusModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdConnStatusCounter != sharedCounter;
    localGdConnStatusCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CONN_STATUS_LEN = 4;
  /** serializeGdConnStatus */
  protected void serializeGdConnStatus(int gdConnStatus) {
    replaceValue( //  save the value as string
        getBinaryString(gdConnStatus, GD_CONN_STATUS_LEN), beginGdConnStatus, GD_CONN_STATUS_LEN);
    localGdConnStatusCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdConnStatusMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdConnStatus is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdConnStatus() {
    return (getInt(beginGdConnStatus));
  }

  int localGdEncryptTypeCounter = -1;

  public boolean isGdEncryptTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdEncryptTypeCounter != sharedCounter;
    localGdEncryptTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ENCRYPT_TYPE_LEN = 1;
  /** serialize this GdEncryptType */
  protected void serializeGdEncryptType(char[] gdEncryptType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdEncryptType, 0, getStringValue(), beginGdEncryptType, GD_ENCRYPT_TYPE_LEN);
    localGdEncryptTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdEncryptTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdEncryptType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdEncryptType() {
    return (substring(
        getStringValue(), beginGdEncryptType, beginGdEncryptType + GD_ENCRYPT_TYPE_LEN));
  }

  int localGdServerClassCounter = -1;

  public boolean isGdServerClassModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdServerClassCounter != sharedCounter;
    localGdServerClassCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SERVER_CLASS_LEN = 128;
  /** serialize this GdServerClass */
  protected void serializeGdServerClass(char[] gdServerClass) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdServerClass, 0, getStringValue(), beginGdServerClass, GD_SERVER_CLASS_LEN);
    localGdServerClassCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdServerClassConstraints(char[] value) {
    return super.checkConstraints(value, 128, false, false);
  }
  /**
   * refreshGdServerClass is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdServerClass() {
    return (substring(
        getStringValue(), beginGdServerClass, beginGdServerClass + GD_SERVER_CLASS_LEN));
  }

  int localGdLastRowCounter = -1;

  public boolean isGdLastRowModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdLastRowCounter != sharedCounter;
    localGdLastRowCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_LAST_ROW_LEN = 4;
  /** serializeGdLastRow */
  protected void serializeGdLastRow(int gdLastRow) {
    replaceValue( //  save the value as string
        getBinaryString(gdLastRow, GD_LAST_ROW_LEN), beginGdLastRow, GD_LAST_ROW_LEN);
    localGdLastRowCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdLastRowMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdLastRow is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdLastRow() {
    return (getInt(beginGdLastRow));
  }

  int localGdNumberMarkersCounter = -1;

  public boolean isGdNumberMarkersModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdNumberMarkersCounter != sharedCounter;
    localGdNumberMarkersCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_NUMBER_MARKERS_LEN = 4;
  /** serializeGdNumberMarkers */
  protected void serializeGdNumberMarkers(int gdNumberMarkers) {
    replaceValue( //  save the value as string
        getBinaryString(gdNumberMarkers, GD_NUMBER_MARKERS_LEN),
        beginGdNumberMarkers,
        GD_NUMBER_MARKERS_LEN);
    localGdNumberMarkersCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdNumberMarkersMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdNumberMarkers is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdNumberMarkers() {
    return (getInt(beginGdNumberMarkers));
  }

  int localGdNumberSetsCounter = -1;

  public boolean isGdNumberSetsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdNumberSetsCounter != sharedCounter;
    localGdNumberSetsCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_NUMBER_SETS_LEN = 4;
  /** serializeGdNumberSets */
  protected void serializeGdNumberSets(int gdNumberSets) {
    replaceValue( //  save the value as string
        getBinaryString(gdNumberSets, GD_NUMBER_SETS_LEN), beginGdNumberSets, GD_NUMBER_SETS_LEN);
    localGdNumberSetsCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdNumberSetsMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdNumberSets is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdNumberSets() {
    return (getInt(beginGdNumberSets));
  }

  int localGdNumberRowsCounter = -1;

  public boolean isGdNumberRowsModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdNumberRowsCounter != sharedCounter;
    localGdNumberRowsCounter = sharedCounter;
    return hasModified;
  }

  public boolean gdNumberRowsIsNumeric() {
    return decimalIsNumeric(
        beginGdNumberRows,
        GD_NUMBER_ROWS_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int GD_NUMBER_ROWS_LEN = 16;
  /** serializeGdNumberRows */
  protected void serializeGdNumberRows(long gdNumberRows) {
    putDecimal(beginGdNumberRows, gdNumberRows, GD_NUMBER_ROWS_LEN, true);
  }

  protected long checkGdNumberRowsMaxLimit(long number) {
    return checkMaxLimit(number, Long.MAX_VALUE /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshGdNumberRows is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshGdNumberRows() throws CFException {
    try {
      return (getLongDecimal(beginGdNumberRows, GD_NUMBER_ROWS_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("gdNumberRows", beginGdNumberRows, GD_NUMBER_ROWS_LEN);
    }
  }

  int localGdReturnStatusCounter = -1;

  public boolean isGdReturnStatusModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdReturnStatusCounter != sharedCounter;
    localGdReturnStatusCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_RETURN_STATUS_LEN = 4;
  /** serializeGdReturnStatus */
  protected void serializeGdReturnStatus(int gdReturnStatus) {
    replaceValue( //  save the value as string
        getBinaryString(gdReturnStatus, GD_RETURN_STATUS_LEN),
        beginGdReturnStatus,
        GD_RETURN_STATUS_LEN);
    localGdReturnStatusCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdReturnStatusMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdReturnStatus is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshGdReturnStatus() {
    return (getInt(beginGdReturnStatus));
  }

  int localGdCursorHoldCounter = -1;

  public boolean isGdCursorHoldModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCursorHoldCounter != sharedCounter;
    localGdCursorHoldCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CURSOR_HOLD_LEN = 1;
  /** serialize this GdCursorHold */
  protected void serializeGdCursorHold(char[] gdCursorHold) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCursorHold, 0, getStringValue(), beginGdCursorHold, GD_CURSOR_HOLD_LEN);
    localGdCursorHoldCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCursorHoldConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdCursorHold is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdCursorHold() {
    return (substring(getStringValue(), beginGdCursorHold, beginGdCursorHold + GD_CURSOR_HOLD_LEN));
  }

  int localGdCursorRowsetCounter = -1;

  public boolean isGdCursorRowsetModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCursorRowsetCounter != sharedCounter;
    localGdCursorRowsetCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CURSOR_ROWSET_LEN = 1;
  /** serialize this GdCursorRowset */
  protected void serializeGdCursorRowset(char[] gdCursorRowset) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCursorRowset, 0, getStringValue(), beginGdCursorRowset, GD_CURSOR_ROWSET_LEN);
    localGdCursorRowsetCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCursorRowsetConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdCursorRowset is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdCursorRowset() {
    return (substring(
        getStringValue(), beginGdCursorRowset, beginGdCursorRowset + GD_CURSOR_ROWSET_LEN));
  }

  int localGdCursorScrollableCounter = -1;

  public boolean isGdCursorScrollableModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCursorScrollableCounter != sharedCounter;
    localGdCursorScrollableCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CURSOR_SCROLLABLE_LEN = 1;
  /** serialize this GdCursorScrollable */
  protected void serializeGdCursorScrollable(char[] gdCursorScrollable) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        gdCursorScrollable, 0, getStringValue(), beginGdCursorScrollable, GD_CURSOR_SCROLLABLE_LEN);
    localGdCursorScrollableCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCursorScrollableConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdCursorScrollable is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdCursorScrollable() {
    return (substring(
        getStringValue(),
        beginGdCursorScrollable,
        beginGdCursorScrollable + GD_CURSOR_SCROLLABLE_LEN));
  }

  int localGdCursorSensitivityCounter = -1;

  public boolean isGdCursorSensitivityModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCursorSensitivityCounter != sharedCounter;
    localGdCursorSensitivityCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CURSOR_SENSITIVITY_LEN = 1;
  /** serialize this GdCursorSensitivity */
  protected void serializeGdCursorSensitivity(char[] gdCursorSensitivity) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        gdCursorSensitivity,
        0,
        getStringValue(),
        beginGdCursorSensitivity,
        GD_CURSOR_SENSITIVITY_LEN);
    localGdCursorSensitivityCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCursorSensitivityConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdCursorSensitivity is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshGdCursorSensitivity() {
    return (substring(
        getStringValue(),
        beginGdCursorSensitivity,
        beginGdCursorSensitivity + GD_CURSOR_SENSITIVITY_LEN));
  }

  int localGdCursorTypeCounter = -1;

  public boolean isGdCursorTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCursorTypeCounter != sharedCounter;
    localGdCursorTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CURSOR_TYPE_LEN = 1;
  /** serialize this GdCursorType */
  protected void serializeGdCursorType(char[] gdCursorType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCursorType, 0, getStringValue(), beginGdCursorType, GD_CURSOR_TYPE_LEN);
    localGdCursorTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCursorTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdCursorType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdCursorType() {
    return (substring(getStringValue(), beginGdCursorType, beginGdCursorType + GD_CURSOR_TYPE_LEN));
  }

  int localGdMoreCounter = -1;

  public boolean isGdMoreModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdMoreCounter != sharedCounter;
    localGdMoreCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_MORE_LEN = 1;
  /** serialize this GdMore */
  protected void serializeGdMore(char[] gdMore) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdMore, 0, getStringValue(), beginGdMore, GD_MORE_LEN);
    localGdMoreCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdMoreConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGdMore is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdMore() {
    return (substring(getStringValue(), beginGdMore, beginGdMore + GD_MORE_LEN));
  }

  int localGdNumberCounter = -1;

  public boolean isGdNumberModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdNumberCounter != sharedCounter;
    localGdNumberCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_NUMBER_LEN = 4;
  /** serializeGdNumber */
  protected void serializeGdNumber(int gdNumber) {
    replaceValue( //  save the value as string
        getBinaryString(gdNumber, GD_NUMBER_LEN), beginGdNumber, GD_NUMBER_LEN);
    localGdNumberCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkGdNumberMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshGdNumber is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshGdNumber() {
    return (getInt(beginGdNumber));
  }

  int localGdRowCountCounter = -1;

  public boolean isGdRowCountModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdRowCountCounter != sharedCounter;
    localGdRowCountCounter = sharedCounter;
    return hasModified;
  }

  public boolean gdRowCountIsNumeric() {
    return decimalIsNumeric(
        beginGdRowCount,
        GD_ROW_COUNT_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int GD_ROW_COUNT_LEN = 16;
  /** serializeGdRowCount */
  protected void serializeGdRowCount(long gdRowCount) {
    putDecimal(beginGdRowCount, gdRowCount, GD_ROW_COUNT_LEN, true);
  }

  protected long checkGdRowCountMaxLimit(long number) {
    return checkMaxLimit(number, Long.MAX_VALUE /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshGdRowCount is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public long refreshGdRowCount() throws CFException {
    try {
      return (getLongDecimal(beginGdRowCount, GD_ROW_COUNT_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("gdRowCount", beginGdRowCount, GD_ROW_COUNT_LEN);
    }
  }
}
