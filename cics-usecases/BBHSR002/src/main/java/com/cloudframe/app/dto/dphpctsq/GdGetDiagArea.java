package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdGetDiagArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdGetDiagArea extends GdGetDiagAreaSerialized {

  private int gdSub;

  private int gdCond;

  private int gdPos;

  private char[] gdIntegerDisp = Field.fillLowValue(10);

  private char[] gdBigDecimalDisp = Field.fillLowValue(32);
  private GdCicsLit gdCicsLit = new GdCicsLit();

  private short gdCicsLitLength;

  private char[] gdTdqueue = new char[4];

  private char[] gdDsntiar = new char[8];
  private GdSqlcaMsg gdSqlcaMsg = new GdSqlcaMsg();
  private GdSqlcaLineSizeGroup gdSqlcaLineSizeGroup = new GdSqlcaLineSizeGroup();

  private char[] gdSqlcaWorkArea = Field.fillLowValue(240);

  private char[] gdStmtLit01 = new char[15];

  private char[] gdStmtLit02 = new char[31];

  private char[] gdStmtLit03 = new char[25];

  private char[] gdStmtLit04 = new char[18];

  private char[] gdStmtLit05 = new char[20];

  private char[] gdStmtLit06 = new char[27];

  private char[] gdStmtLit07 = new char[29];

  private char[] gdStmtLit08 = new char[33];

  private char[] gdStmtLit09 = new char[34];

  private char[] gdStmtLit10 = new char[27];

  private char[] gdStmtLit11 = new char[7];

  private char[] gdStmtLit12 = new char[9];

  private char[] gdStmtLit13 = new char[12];

  private char[] gdCondLit01 = new char[15];

  private char[] gdCondLit02 = new char[19];

  private char[] gdCondLit03 = new char[14];

  private char[] gdCondLit04 = new char[18];

  private char[] gdCondLit05 = new char[18];

  private char[] gdCondLit06 = new char[18];

  private char[] gdCondLit07 = new char[18];

  private char[] gdCondLit08 = new char[29];

  private char[] gdCondLit09 = new char[18];

  private char[] gdCondLit10 = new char[17];

  private char[] gdCondLit11 = new char[29];

  private char[] gdCondLit12 = new char[17];

  private char[] gdCondLit13 = new char[18];

  private char[] gdCondLit14 = new char[23];

  private char[] gdCondLit15 = new char[17];

  private char[] gdCondLit16 = new char[18];

  private char[] gdCondLit17 = new char[15];

  private char[] gdCondLit18 = new char[15];

  private char[] gdCondLit19 = new char[15];

  private char[] gdCondLit20 = new char[15];

  private char[] gdCondLit21 = new char[15];

  private char[] gdCondLit22 = new char[15];

  private char[] gdCondLit23 = new char[18];

  private char[] gdCondLit24 = new char[15];

  private char[] gdCondLit25 = new char[20];

  private char[] gdCondLit26 = new char[14];

  private char[] gdConnLit01 = new char[26];

  private char[] gdConnLit02 = new char[23];

  private char[] gdConnLit03 = new char[23];

  private char[] gdConnLit04 = new char[24];

  private char[] gdConnLit05 = new char[22];

  private char[] gdConnLit06 = new char[17];

  private char[] gdConnLit07 = new char[24];
  private GdCatalogName gdCatalogName = new GdCatalogName();

  private int gdConditionNumber;
  private GdCursorName gdCursorName = new GdCursorName();

  private int gdErrorCode1;

  private int gdErrorCode2;

  private int gdErrorCode3;

  private int gdErrorCode4;

  private int gdInternalErrPtr;

  private int gdLineNumber;

  private char[] gdMessageId = Field.fillLowValue(10);

  private char[] gdModDetectingErr = Field.fillLowValue(8);
  private GdOrdTokenTable gdOrdTokenTable = new GdOrdTokenTable();
  private GdOrdTokenTableRedefined gdOrdTokenTableRedefined = new GdOrdTokenTableRedefined();

  private int gdReasonCode;

  private int gdReturnedSqlcode;

  private long gdRowNumber;

  private char[] gdSqlerrdSet = Field.fillLowValue(1);

  private int gdSqlerrd1;

  private int gdSqlerrd2;

  private int gdSqlerrd3;

  private int gdSqlerrd4;

  private int gdSqlerrd5;

  private int gdSqlerrd6;

  private int gdTokenCount;
  private GdMessageText gdMessageText = new GdMessageText();

  private char[] gdReturnedSqlstate = Field.fillLowValue(5);
  private GdServerName gdServerName = new GdServerName();

  private char[] gdAuthType = Field.fillLowValue(1);
  private GdAuthId gdAuthId = new GdAuthId();

  private int gdConnState;

  private int gdConnStatus;

  private char[] gdEncryptType = Field.fillLowValue(1);
  private GdProdId gdProdId = new GdProdId();

  private char[] gdServerClass = Field.fillLowValue(128);

  private int gdLastRow;

  private int gdNumberMarkers;

  private int gdNumberSets;

  private long gdNumberRows;

  private int gdReturnStatus;

  private char[] gdCursorHold = Field.fillLowValue(1);

  private char[] gdCursorRowset = Field.fillLowValue(1);

  private char[] gdCursorScrollable = Field.fillLowValue(1);

  private char[] gdCursorSensitivity = Field.fillLowValue(1);

  private char[] gdCursorType = Field.fillLowValue(1);

  private char[] gdMore = Field.fillLowValue(1);

  private int gdNumber;

  private long gdRowCount;

  /** Constructor for GdGetDiagArea */
  public GdGetDiagArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    gdCicsLit.setParent(this, getStartOffset() + 53);
    gdSqlcaMsg.setParent(this, getStartOffset() + 179);
    gdSqlcaLineSizeGroup.setParent(this, getStartOffset() + 2581);
    gdCatalogName.setParent(this, getStartOffset() + 3734);
    gdCursorName.setParent(this, getStartOffset() + 3868);
    gdOrdTokenTable.setParent(this, getStartOffset() + 4040);
    gdOrdTokenTableRedefined.setParent(this, getStartOffset() + 4040);
    gdMessageText.setParent(this, getStartOffset() + 55793);
    gdServerName.setParent(this, getStartOffset() + 88472);
    gdAuthId.setParent(this, getStartOffset() + 88603);
    gdProdId.setParent(this, getStartOffset() + 88742);
    /*  end of offset */
    setGdCicsLitLength((short) 112);
    setGdTdqueue(("CSSL").toCharArray());
    setGdDsntiar(("DSNTIAR ").toCharArray());
    setGdStmtLit01(("DB2_LAST_ROW = ").toCharArray());
    setGdStmtLit02(("DB2_NUMBER_PARAMETER_MARKERS = ").toCharArray());
    setGdStmtLit03(("DB2_NUMBER_RESULT_SETS = ").toCharArray());
    setGdStmtLit04(("DB2_NUMBER_ROWS = ").toCharArray());
    setGdStmtLit05(("DB2_RETURN_STATUS = ").toCharArray());
    setGdStmtLit06(("DB2_SQL_ATTR_CURSOR_HOLD = ").toCharArray());
    setGdStmtLit07(("DB2_SQL_ATTR_CURSOR_ROWSET = ").toCharArray());
    setGdStmtLit08(("DB2_SQL_ATTR_CURSOR_SCROLLABLE = ").toCharArray());
    setGdStmtLit09(("DB2_SQL_ATTR_CURSOR_SENSITIVITY = ").toCharArray());
    setGdStmtLit10(("DB2_SQL_ATTR_CURSOR_TYPE = ").toCharArray());
    setGdStmtLit11(("MORE = ").toCharArray());
    setGdStmtLit12(("NUMBER = ").toCharArray());
    setGdStmtLit13(("ROW_COUNT = ").toCharArray());
    setGdCondLit01(("CATALOG_NAME = ").toCharArray());
    setGdCondLit02(("CONDITION_NUMBER = ").toCharArray());
    setGdCondLit03(("CURSOR_NAME = ").toCharArray());
    setGdCondLit04(("DB2_ERROR_CODE1 = ").toCharArray());
    setGdCondLit05(("DB2_ERROR_CODE2 = ").toCharArray());
    setGdCondLit06(("DB2_ERROR_CODE3 = ").toCharArray());
    setGdCondLit07(("DB2_ERROR_CODE4 = ").toCharArray());
    setGdCondLit08(("DB2_INTERNAL_ERROR_POINTER = ").toCharArray());
    setGdCondLit09(("DB2_LINE_NUMBER = ").toCharArray());
    setGdCondLit10(("DB2_MESSAGE_ID = ").toCharArray());
    setGdCondLit11(("DB2_MODULE_DETECTING_ERROR = ").toCharArray());
    setGdCondLit12(("DB2_ORDINAL_TOKEN").toCharArray());
    setGdCondLit13(("DB2_REASON_CODE = ").toCharArray());
    setGdCondLit14(("DB2_RETURNED_SQLCODE = ").toCharArray());
    setGdCondLit15(("DB2_ROW_NUMBER = ").toCharArray());
    setGdCondLit16(("DB2_SQLERRD_SET = ").toCharArray());
    setGdCondLit17(("DB2_SQLERRD1 = ").toCharArray());
    setGdCondLit18(("DB2_SQLERRD2 = ").toCharArray());
    setGdCondLit19(("DB2_SQLERRD3 = ").toCharArray());
    setGdCondLit20(("DB2_SQLERRD4 = ").toCharArray());
    setGdCondLit21(("DB2_SQLERRD5 = ").toCharArray());
    setGdCondLit22(("DB2_SQLERRD6 = ").toCharArray());
    setGdCondLit23(("DB2_TOKEN_COUNT = ").toCharArray());
    setGdCondLit24(("MESSAGE_TEXT = ").toCharArray());
    setGdCondLit25(("RETURNED_SQLSTATE = ").toCharArray());
    setGdCondLit26(("SERVER_NAME = ").toCharArray());
    setGdConnLit01(("DB2_AUTHENTICATION_TYPE = ").toCharArray());
    setGdConnLit02(("DB2_AUTHORIZATION_ID = ").toCharArray());
    setGdConnLit03(("DB2_CONNECTION_STATE = ").toCharArray());
    setGdConnLit04(("DB2_CONNECTION_STATUS = ").toCharArray());
    setGdConnLit05(("DB2_ENCRYPTION_TYPE = ").toCharArray());
    setGdConnLit06(("DB2_PRODUCT_ID = ").toCharArray());
    setGdConnLit07(("DB2_SERVER_CLASS_NAME = ").toCharArray());
  }

  /**
   * Returns the value of gdSub
   *
   * @return gdSub
   */
  public int getGdSub() throws CFException {
    if (isGdSubModified()) {
      gdSub = refreshGdSub();
    }
    return gdSub;
  }

  /**
   * Update GdSub with the passed value Corresponding COBOL Variable is GD-SUB
   *
   * @param number
   */
  public void setGdSub(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSub = checkGdSubMaxLimit(number);
    serializeGdSub(gdSub);
  }

  public void setGdSub(long number) {
    number = checkGdSubMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSub((int) number);
  }

  /**
   * Update GdSub with the passed value
   *
   * @param value (String or char[])
   */
  public void setGdSub(char[] value) throws CFException {
    gdSub = serializeGdSub(value);
  }
  /**
   * Update GdSub with the passed value
   *
   * @param value (String or char[])
   */
  public void setGdSubString(char[] value) throws CFException {
    setGdSub(value);
  }
  /**
   * Returns the value of gdCond
   *
   * @return gdCond
   */
  public int getGdCond() throws CFException {
    if (isGdCondModified()) {
      gdCond = refreshGdCond();
    }
    return gdCond;
  }

  /**
   * Update GdCond with the passed value Corresponding COBOL Variable is GD-COND
   *
   * @param number
   */
  public void setGdCond(int number) {
    // Truncate if the number is beyond +/- Max range
    gdCond = checkGdCondMaxLimit(number);
    serializeGdCond(gdCond);
  }

  public void setGdCond(long number) {
    number = checkGdCondMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdCond((int) number);
  }

  /**
   * Returns the value of gdPos
   *
   * @return gdPos
   */
  public int getGdPos() throws CFException {
    if (isGdPosModified()) {
      gdPos = refreshGdPos();
    }
    return gdPos;
  }

  /**
   * Update GdPos with the passed value Corresponding COBOL Variable is GD-POS
   *
   * @param number
   */
  public void setGdPos(int number) {
    // Truncate if the number is beyond +/- Max range
    gdPos = checkGdPosMaxLimit(number);
    serializeGdPos(gdPos);
  }

  public void setGdPos(long number) {
    number = checkGdPosMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdPos((int) number);
  }

  /**
   * Returns the value of gdIntegerDisp
   *
   * @return gdIntegerDisp
   */
  public char[] getGdIntegerDisp() throws CFException {
    if (isGdIntegerDispModified()) {
      gdIntegerDisp = refreshGdIntegerDisp();
    }
    return gdIntegerDisp;
  }

  /**
   * set variable gdIntegerDisp Corresponding COBOL Variable is GD-INTEGER-DISP
   *
   * @param value
   */
  public void setGdIntegerDisp(char[] value) {
    gdIntegerDisp = checkGdIntegerDispConstraints(value);
    serializeGdIntegerDisp(gdIntegerDisp);
  }

  /**
   * Update GdIntegerDisp with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdIntegerDisp(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdIntegerDisp, gdIntegerDisp.length);
  }

  public void setGdIntegerDisp(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdIntegerDisp, gdIntegerDisp.length);
  }

  /**
   * Update GdIntegerDisp with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdIntegerDisp(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdIntegerDisp + targetIndex, targetLen);
  }

  /**
   * Update GdIntegerDisp with another Field
   *
   * @param value
   */
  public void setGdIntegerDisp(Field source) {
    replace(source, 0, source.length(), beginGdIntegerDisp, GD_INTEGER_DISP_LEN);
  }

  /**
   * Update GdIntegerDisp with another Field from an offset and length
   *
   * @param value
   */
  public void setGdIntegerDisp(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdIntegerDisp, GD_INTEGER_DISP_LEN);
  }

  /**
   * Update GdIntegerDisp with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdIntegerDisp(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdIntegerDisp + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdBigDecimalDisp
   *
   * @return gdBigDecimalDisp
   */
  public char[] getGdBigDecimalDisp() throws CFException {
    if (isGdBigDecimalDispModified()) {
      gdBigDecimalDisp = refreshGdBigDecimalDisp();
    }
    return gdBigDecimalDisp;
  }

  /**
   * set variable gdBigDecimalDisp Corresponding COBOL Variable is GD-BIG-DECIMAL-DISP
   *
   * @param value
   */
  public void setGdBigDecimalDisp(char[] value) {
    gdBigDecimalDisp = checkGdBigDecimalDispConstraints(value);
    serializeGdBigDecimalDisp(gdBigDecimalDisp);
  }

  /**
   * Update GdBigDecimalDisp with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdBigDecimalDisp(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdBigDecimalDisp, gdBigDecimalDisp.length);
  }

  public void setGdBigDecimalDisp(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdBigDecimalDisp, gdBigDecimalDisp.length);
  }

  /**
   * Update GdBigDecimalDisp with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdBigDecimalDisp(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdBigDecimalDisp + targetIndex, targetLen);
  }

  /**
   * Update GdBigDecimalDisp with another Field
   *
   * @param value
   */
  public void setGdBigDecimalDisp(Field source) {
    replace(source, 0, source.length(), beginGdBigDecimalDisp, GD_BIG_DECIMAL_DISP_LEN);
  }

  /**
   * Update GdBigDecimalDisp with another Field from an offset and length
   *
   * @param value
   */
  public void setGdBigDecimalDisp(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdBigDecimalDisp, GD_BIG_DECIMAL_DISP_LEN);
  }

  /**
   * Update GdBigDecimalDisp with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdBigDecimalDisp(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdBigDecimalDisp + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCicsLit
   *
   * @return gdCicsLit
   */
  public GdCicsLit getGdCicsLit() {
    return gdCicsLit;
  }
  /**
   * Update GdCicsLit with the passed value Corresponding COBOL Variable is GD-CICS-LIT
   *
   * @param value
   */
  public void setGdCicsLit(char[] value) {
    gdCicsLit.setString(value);
  }

  /**
   * Update GdCicsLit with a String from an offset and length
   *
   * @param value
   */
  public void setGdCicsLit(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdCicsLit.begin, gdCicsLit.length());
  }

  /**
   * Update GdCicsLit with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCicsLit(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdCicsLit.begin + targetIndex, targetLen);
  }

  /**
   * Update GdCicsLit with another Field
   *
   * @param value
   */
  public void setGdCicsLit(Field source) {
    replace(source, 0, source.length(), gdCicsLit.begin, gdCicsLit.length());
  }

  /**
   * Update GdCicsLit with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCicsLit(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdCicsLit.begin, gdCicsLit.length());
  }

  /**
   * Update GdCicsLit with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCicsLit(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdCicsLit.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCicsLitLength
   *
   * @return gdCicsLitLength
   */
  public short getGdCicsLitLength() throws CFException {
    if (isGdCicsLitLengthModified()) {
      gdCicsLitLength = refreshGdCicsLitLength();
    }
    return gdCicsLitLength;
  }

  /**
   * Update GdCicsLitLength with the passed value Corresponding COBOL Variable is GD-CICS-LIT-LENGTH
   *
   * @param number
   */
  public void setGdCicsLitLength(short number) {
    // Truncate if the number is beyond +/- Max range
    gdCicsLitLength = checkGdCicsLitLengthMaxLimit(number);
    serializeGdCicsLitLength(gdCicsLitLength);
  }

  public void setGdCicsLitLength(int number) {
    number =
        checkGdCicsLitLengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdCicsLitLength((short) number);
  }

  public void setGdCicsLitLength(long number) {
    number =
        checkGdCicsLitLengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdCicsLitLength((short) number);
  }

  /**
   * Returns the value of gdTdqueue
   *
   * @return gdTdqueue
   */
  public char[] getGdTdqueue() throws CFException {
    if (isGdTdqueueModified()) {
      gdTdqueue = refreshGdTdqueue();
    }
    return gdTdqueue;
  }

  /**
   * set variable gdTdqueue Corresponding COBOL Variable is GD-TDQUEUE
   *
   * @param value
   */
  public void setGdTdqueue(char[] value) {
    gdTdqueue = checkGdTdqueueConstraints(value);
    serializeGdTdqueue(gdTdqueue);
  }

  /**
   * Update GdTdqueue with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdTdqueue(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdTdqueue, gdTdqueue.length);
  }

  public void setGdTdqueue(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdTdqueue, gdTdqueue.length);
  }

  /**
   * Update GdTdqueue with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdTdqueue(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdTdqueue + targetIndex, targetLen);
  }

  /**
   * Update GdTdqueue with another Field
   *
   * @param value
   */
  public void setGdTdqueue(Field source) {
    replace(source, 0, source.length(), beginGdTdqueue, GD_TDQUEUE_LEN);
  }

  /**
   * Update GdTdqueue with another Field from an offset and length
   *
   * @param value
   */
  public void setGdTdqueue(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdTdqueue, GD_TDQUEUE_LEN);
  }

  /**
   * Update GdTdqueue with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdTdqueue(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdTdqueue + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdDsntiar
   *
   * @return gdDsntiar
   */
  public char[] getGdDsntiar() throws CFException {
    if (isGdDsntiarModified()) {
      gdDsntiar = refreshGdDsntiar();
    }
    return gdDsntiar;
  }

  /**
   * set variable gdDsntiar Corresponding COBOL Variable is GD-DSNTIAR
   *
   * @param value
   */
  public void setGdDsntiar(char[] value) {
    gdDsntiar = checkGdDsntiarConstraints(value);
    serializeGdDsntiar(gdDsntiar);
  }

  /**
   * Update GdDsntiar with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdDsntiar(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdDsntiar, gdDsntiar.length);
  }

  public void setGdDsntiar(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdDsntiar, gdDsntiar.length);
  }

  /**
   * Update GdDsntiar with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdDsntiar(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdDsntiar + targetIndex, targetLen);
  }

  /**
   * Update GdDsntiar with another Field
   *
   * @param value
   */
  public void setGdDsntiar(Field source) {
    replace(source, 0, source.length(), beginGdDsntiar, GD_DSNTIAR_LEN);
  }

  /**
   * Update GdDsntiar with another Field from an offset and length
   *
   * @param value
   */
  public void setGdDsntiar(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdDsntiar, GD_DSNTIAR_LEN);
  }

  /**
   * Update GdDsntiar with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdDsntiar(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdDsntiar + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdSqlcaMsg
   *
   * @return gdSqlcaMsg
   */
  public GdSqlcaMsg getGdSqlcaMsg() {
    return gdSqlcaMsg;
  }
  /**
   * Update GdSqlcaMsg with the passed value Corresponding COBOL Variable is GD-SQLCA-MSG
   *
   * @param value
   */
  public void setGdSqlcaMsg(char[] value) {
    gdSqlcaMsg.setString(value);
  }

  /**
   * Update GdSqlcaMsg with a String from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsg(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdSqlcaMsg.begin, gdSqlcaMsg.length());
  }

  /**
   * Update GdSqlcaMsg with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsg(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdSqlcaMsg.begin + targetIndex, targetLen);
  }

  /**
   * Update GdSqlcaMsg with another Field
   *
   * @param value
   */
  public void setGdSqlcaMsg(Field source) {
    replace(source, 0, source.length(), gdSqlcaMsg.begin, gdSqlcaMsg.length());
  }

  /**
   * Update GdSqlcaMsg with another Field from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsg(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdSqlcaMsg.begin, gdSqlcaMsg.length());
  }

  /**
   * Update GdSqlcaMsg with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsg(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdSqlcaMsg.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdSqlcaLineSizeGroup
   *
   * @return gdSqlcaLineSizeGroup
   */
  public GdSqlcaLineSizeGroup getGdSqlcaLineSizeGroup() {
    return gdSqlcaLineSizeGroup;
  }
  /**
   * Update GdSqlcaLineSizeGroup with the passed value Corresponding COBOL Variable is
   * GD-SQLCA-LINE-SIZE-GROUP
   *
   * @param value
   */
  public void setGdSqlcaLineSizeGroup(char[] value) {
    gdSqlcaLineSizeGroup.setString(value);
  }

  /**
   * Update GdSqlcaLineSizeGroup with a String from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaLineSizeGroup(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, gdSqlcaLineSizeGroup.begin, gdSqlcaLineSizeGroup.length());
  }

  /**
   * Update GdSqlcaLineSizeGroup with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlcaLineSizeGroup(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdSqlcaLineSizeGroup.begin + targetIndex, targetLen);
  }

  /**
   * Update GdSqlcaLineSizeGroup with another Field
   *
   * @param value
   */
  public void setGdSqlcaLineSizeGroup(Field source) {
    replace(source, 0, source.length(), gdSqlcaLineSizeGroup.begin, gdSqlcaLineSizeGroup.length());
  }

  /**
   * Update GdSqlcaLineSizeGroup with another Field from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaLineSizeGroup(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, gdSqlcaLineSizeGroup.begin, gdSqlcaLineSizeGroup.length());
  }

  /**
   * Update GdSqlcaLineSizeGroup with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setGdSqlcaLineSizeGroup(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdSqlcaLineSizeGroup.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdSqlcaWorkArea
   *
   * @return gdSqlcaWorkArea
   */
  public char[] getGdSqlcaWorkArea() throws CFException {
    if (isGdSqlcaWorkAreaModified()) {
      gdSqlcaWorkArea = refreshGdSqlcaWorkArea();
    }
    return gdSqlcaWorkArea;
  }

  /**
   * set variable gdSqlcaWorkArea Corresponding COBOL Variable is GD-SQLCA-WORK-AREA
   *
   * @param value
   */
  public void setGdSqlcaWorkArea(char[] value) {
    gdSqlcaWorkArea = checkGdSqlcaWorkAreaConstraints(value);
    serializeGdSqlcaWorkArea(gdSqlcaWorkArea);
  }

  /**
   * Update GdSqlcaWorkArea with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaWorkArea(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdSqlcaWorkArea, gdSqlcaWorkArea.length);
  }

  public void setGdSqlcaWorkArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaWorkArea, gdSqlcaWorkArea.length);
  }

  /**
   * Update GdSqlcaWorkArea with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlcaWorkArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaWorkArea + targetIndex, targetLen);
  }

  /**
   * Update GdSqlcaWorkArea with another Field
   *
   * @param value
   */
  public void setGdSqlcaWorkArea(Field source) {
    replace(source, 0, source.length(), beginGdSqlcaWorkArea, GD_SQLCA_WORK_AREA_LEN);
  }

  /**
   * Update GdSqlcaWorkArea with another Field from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaWorkArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaWorkArea, GD_SQLCA_WORK_AREA_LEN);
  }

  /**
   * Update GdSqlcaWorkArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlcaWorkArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaWorkArea + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit01
   *
   * @return gdStmtLit01
   */
  public char[] getGdStmtLit01() throws CFException {
    if (isGdStmtLit01Modified()) {
      gdStmtLit01 = refreshGdStmtLit01();
    }
    return gdStmtLit01;
  }

  /**
   * set variable gdStmtLit01 Corresponding COBOL Variable is GD-STMT-LIT-01
   *
   * @param value
   */
  public void setGdStmtLit01(char[] value) {
    gdStmtLit01 = checkGdStmtLit01Constraints(value);
    serializeGdStmtLit01(gdStmtLit01);
  }

  /**
   * Update GdStmtLit01 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit01(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit01, gdStmtLit01.length);
  }

  public void setGdStmtLit01(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit01, gdStmtLit01.length);
  }

  /**
   * Update GdStmtLit01 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit01(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit01 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit01 with another Field
   *
   * @param value
   */
  public void setGdStmtLit01(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit01, GD_STMT_LIT_01_LEN);
  }

  /**
   * Update GdStmtLit01 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit01(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit01, GD_STMT_LIT_01_LEN);
  }

  /**
   * Update GdStmtLit01 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit01(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit01 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit02
   *
   * @return gdStmtLit02
   */
  public char[] getGdStmtLit02() throws CFException {
    if (isGdStmtLit02Modified()) {
      gdStmtLit02 = refreshGdStmtLit02();
    }
    return gdStmtLit02;
  }

  /**
   * set variable gdStmtLit02 Corresponding COBOL Variable is GD-STMT-LIT-02
   *
   * @param value
   */
  public void setGdStmtLit02(char[] value) {
    gdStmtLit02 = checkGdStmtLit02Constraints(value);
    serializeGdStmtLit02(gdStmtLit02);
  }

  /**
   * Update GdStmtLit02 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit02(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit02, gdStmtLit02.length);
  }

  public void setGdStmtLit02(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit02, gdStmtLit02.length);
  }

  /**
   * Update GdStmtLit02 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit02(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit02 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit02 with another Field
   *
   * @param value
   */
  public void setGdStmtLit02(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit02, GD_STMT_LIT_02_LEN);
  }

  /**
   * Update GdStmtLit02 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit02(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit02, GD_STMT_LIT_02_LEN);
  }

  /**
   * Update GdStmtLit02 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit02(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit02 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit03
   *
   * @return gdStmtLit03
   */
  public char[] getGdStmtLit03() throws CFException {
    if (isGdStmtLit03Modified()) {
      gdStmtLit03 = refreshGdStmtLit03();
    }
    return gdStmtLit03;
  }

  /**
   * set variable gdStmtLit03 Corresponding COBOL Variable is GD-STMT-LIT-03
   *
   * @param value
   */
  public void setGdStmtLit03(char[] value) {
    gdStmtLit03 = checkGdStmtLit03Constraints(value);
    serializeGdStmtLit03(gdStmtLit03);
  }

  /**
   * Update GdStmtLit03 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit03(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit03, gdStmtLit03.length);
  }

  public void setGdStmtLit03(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit03, gdStmtLit03.length);
  }

  /**
   * Update GdStmtLit03 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit03(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit03 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit03 with another Field
   *
   * @param value
   */
  public void setGdStmtLit03(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit03, GD_STMT_LIT_03_LEN);
  }

  /**
   * Update GdStmtLit03 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit03(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit03, GD_STMT_LIT_03_LEN);
  }

  /**
   * Update GdStmtLit03 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit03(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit03 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit04
   *
   * @return gdStmtLit04
   */
  public char[] getGdStmtLit04() throws CFException {
    if (isGdStmtLit04Modified()) {
      gdStmtLit04 = refreshGdStmtLit04();
    }
    return gdStmtLit04;
  }

  /**
   * set variable gdStmtLit04 Corresponding COBOL Variable is GD-STMT-LIT-04
   *
   * @param value
   */
  public void setGdStmtLit04(char[] value) {
    gdStmtLit04 = checkGdStmtLit04Constraints(value);
    serializeGdStmtLit04(gdStmtLit04);
  }

  /**
   * Update GdStmtLit04 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit04(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit04, gdStmtLit04.length);
  }

  public void setGdStmtLit04(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit04, gdStmtLit04.length);
  }

  /**
   * Update GdStmtLit04 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit04(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit04 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit04 with another Field
   *
   * @param value
   */
  public void setGdStmtLit04(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit04, GD_STMT_LIT_04_LEN);
  }

  /**
   * Update GdStmtLit04 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit04(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit04, GD_STMT_LIT_04_LEN);
  }

  /**
   * Update GdStmtLit04 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit04(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit04 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit05
   *
   * @return gdStmtLit05
   */
  public char[] getGdStmtLit05() throws CFException {
    if (isGdStmtLit05Modified()) {
      gdStmtLit05 = refreshGdStmtLit05();
    }
    return gdStmtLit05;
  }

  /**
   * set variable gdStmtLit05 Corresponding COBOL Variable is GD-STMT-LIT-05
   *
   * @param value
   */
  public void setGdStmtLit05(char[] value) {
    gdStmtLit05 = checkGdStmtLit05Constraints(value);
    serializeGdStmtLit05(gdStmtLit05);
  }

  /**
   * Update GdStmtLit05 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit05(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit05, gdStmtLit05.length);
  }

  public void setGdStmtLit05(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit05, gdStmtLit05.length);
  }

  /**
   * Update GdStmtLit05 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit05(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit05 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit05 with another Field
   *
   * @param value
   */
  public void setGdStmtLit05(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit05, GD_STMT_LIT_05_LEN);
  }

  /**
   * Update GdStmtLit05 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit05(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit05, GD_STMT_LIT_05_LEN);
  }

  /**
   * Update GdStmtLit05 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit05(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit05 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit06
   *
   * @return gdStmtLit06
   */
  public char[] getGdStmtLit06() throws CFException {
    if (isGdStmtLit06Modified()) {
      gdStmtLit06 = refreshGdStmtLit06();
    }
    return gdStmtLit06;
  }

  /**
   * set variable gdStmtLit06 Corresponding COBOL Variable is GD-STMT-LIT-06
   *
   * @param value
   */
  public void setGdStmtLit06(char[] value) {
    gdStmtLit06 = checkGdStmtLit06Constraints(value);
    serializeGdStmtLit06(gdStmtLit06);
  }

  /**
   * Update GdStmtLit06 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit06(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit06, gdStmtLit06.length);
  }

  public void setGdStmtLit06(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit06, gdStmtLit06.length);
  }

  /**
   * Update GdStmtLit06 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit06(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit06 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit06 with another Field
   *
   * @param value
   */
  public void setGdStmtLit06(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit06, GD_STMT_LIT_06_LEN);
  }

  /**
   * Update GdStmtLit06 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit06(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit06, GD_STMT_LIT_06_LEN);
  }

  /**
   * Update GdStmtLit06 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit06(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit06 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit07
   *
   * @return gdStmtLit07
   */
  public char[] getGdStmtLit07() throws CFException {
    if (isGdStmtLit07Modified()) {
      gdStmtLit07 = refreshGdStmtLit07();
    }
    return gdStmtLit07;
  }

  /**
   * set variable gdStmtLit07 Corresponding COBOL Variable is GD-STMT-LIT-07
   *
   * @param value
   */
  public void setGdStmtLit07(char[] value) {
    gdStmtLit07 = checkGdStmtLit07Constraints(value);
    serializeGdStmtLit07(gdStmtLit07);
  }

  /**
   * Update GdStmtLit07 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit07(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit07, gdStmtLit07.length);
  }

  public void setGdStmtLit07(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit07, gdStmtLit07.length);
  }

  /**
   * Update GdStmtLit07 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit07(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit07 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit07 with another Field
   *
   * @param value
   */
  public void setGdStmtLit07(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit07, GD_STMT_LIT_07_LEN);
  }

  /**
   * Update GdStmtLit07 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit07(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit07, GD_STMT_LIT_07_LEN);
  }

  /**
   * Update GdStmtLit07 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit07(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit07 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit08
   *
   * @return gdStmtLit08
   */
  public char[] getGdStmtLit08() throws CFException {
    if (isGdStmtLit08Modified()) {
      gdStmtLit08 = refreshGdStmtLit08();
    }
    return gdStmtLit08;
  }

  /**
   * set variable gdStmtLit08 Corresponding COBOL Variable is GD-STMT-LIT-08
   *
   * @param value
   */
  public void setGdStmtLit08(char[] value) {
    gdStmtLit08 = checkGdStmtLit08Constraints(value);
    serializeGdStmtLit08(gdStmtLit08);
  }

  /**
   * Update GdStmtLit08 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit08(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit08, gdStmtLit08.length);
  }

  public void setGdStmtLit08(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit08, gdStmtLit08.length);
  }

  /**
   * Update GdStmtLit08 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit08(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit08 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit08 with another Field
   *
   * @param value
   */
  public void setGdStmtLit08(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit08, GD_STMT_LIT_08_LEN);
  }

  /**
   * Update GdStmtLit08 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit08(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit08, GD_STMT_LIT_08_LEN);
  }

  /**
   * Update GdStmtLit08 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit08(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit08 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit09
   *
   * @return gdStmtLit09
   */
  public char[] getGdStmtLit09() throws CFException {
    if (isGdStmtLit09Modified()) {
      gdStmtLit09 = refreshGdStmtLit09();
    }
    return gdStmtLit09;
  }

  /**
   * set variable gdStmtLit09 Corresponding COBOL Variable is GD-STMT-LIT-09
   *
   * @param value
   */
  public void setGdStmtLit09(char[] value) {
    gdStmtLit09 = checkGdStmtLit09Constraints(value);
    serializeGdStmtLit09(gdStmtLit09);
  }

  /**
   * Update GdStmtLit09 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit09(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit09, gdStmtLit09.length);
  }

  public void setGdStmtLit09(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit09, gdStmtLit09.length);
  }

  /**
   * Update GdStmtLit09 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit09(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit09 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit09 with another Field
   *
   * @param value
   */
  public void setGdStmtLit09(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit09, GD_STMT_LIT_09_LEN);
  }

  /**
   * Update GdStmtLit09 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit09(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit09, GD_STMT_LIT_09_LEN);
  }

  /**
   * Update GdStmtLit09 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit09(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit09 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit10
   *
   * @return gdStmtLit10
   */
  public char[] getGdStmtLit10() throws CFException {
    if (isGdStmtLit10Modified()) {
      gdStmtLit10 = refreshGdStmtLit10();
    }
    return gdStmtLit10;
  }

  /**
   * set variable gdStmtLit10 Corresponding COBOL Variable is GD-STMT-LIT-10
   *
   * @param value
   */
  public void setGdStmtLit10(char[] value) {
    gdStmtLit10 = checkGdStmtLit10Constraints(value);
    serializeGdStmtLit10(gdStmtLit10);
  }

  /**
   * Update GdStmtLit10 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit10(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit10, gdStmtLit10.length);
  }

  public void setGdStmtLit10(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit10, gdStmtLit10.length);
  }

  /**
   * Update GdStmtLit10 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit10(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit10 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit10 with another Field
   *
   * @param value
   */
  public void setGdStmtLit10(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit10, GD_STMT_LIT_10_LEN);
  }

  /**
   * Update GdStmtLit10 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit10(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit10, GD_STMT_LIT_10_LEN);
  }

  /**
   * Update GdStmtLit10 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit10(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit10 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit11
   *
   * @return gdStmtLit11
   */
  public char[] getGdStmtLit11() throws CFException {
    if (isGdStmtLit11Modified()) {
      gdStmtLit11 = refreshGdStmtLit11();
    }
    return gdStmtLit11;
  }

  /**
   * set variable gdStmtLit11 Corresponding COBOL Variable is GD-STMT-LIT-11
   *
   * @param value
   */
  public void setGdStmtLit11(char[] value) {
    gdStmtLit11 = checkGdStmtLit11Constraints(value);
    serializeGdStmtLit11(gdStmtLit11);
  }

  /**
   * Update GdStmtLit11 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit11(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit11, gdStmtLit11.length);
  }

  public void setGdStmtLit11(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit11, gdStmtLit11.length);
  }

  /**
   * Update GdStmtLit11 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit11(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit11 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit11 with another Field
   *
   * @param value
   */
  public void setGdStmtLit11(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit11, GD_STMT_LIT_11_LEN);
  }

  /**
   * Update GdStmtLit11 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit11(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit11, GD_STMT_LIT_11_LEN);
  }

  /**
   * Update GdStmtLit11 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit11(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit11 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit12
   *
   * @return gdStmtLit12
   */
  public char[] getGdStmtLit12() throws CFException {
    if (isGdStmtLit12Modified()) {
      gdStmtLit12 = refreshGdStmtLit12();
    }
    return gdStmtLit12;
  }

  /**
   * set variable gdStmtLit12 Corresponding COBOL Variable is GD-STMT-LIT-12
   *
   * @param value
   */
  public void setGdStmtLit12(char[] value) {
    gdStmtLit12 = checkGdStmtLit12Constraints(value);
    serializeGdStmtLit12(gdStmtLit12);
  }

  /**
   * Update GdStmtLit12 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit12(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit12, gdStmtLit12.length);
  }

  public void setGdStmtLit12(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit12, gdStmtLit12.length);
  }

  /**
   * Update GdStmtLit12 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit12(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit12 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit12 with another Field
   *
   * @param value
   */
  public void setGdStmtLit12(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit12, GD_STMT_LIT_12_LEN);
  }

  /**
   * Update GdStmtLit12 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit12(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit12, GD_STMT_LIT_12_LEN);
  }

  /**
   * Update GdStmtLit12 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit12(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit12 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdStmtLit13
   *
   * @return gdStmtLit13
   */
  public char[] getGdStmtLit13() throws CFException {
    if (isGdStmtLit13Modified()) {
      gdStmtLit13 = refreshGdStmtLit13();
    }
    return gdStmtLit13;
  }

  /**
   * set variable gdStmtLit13 Corresponding COBOL Variable is GD-STMT-LIT-13
   *
   * @param value
   */
  public void setGdStmtLit13(char[] value) {
    gdStmtLit13 = checkGdStmtLit13Constraints(value);
    serializeGdStmtLit13(gdStmtLit13);
  }

  /**
   * Update GdStmtLit13 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit13(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdStmtLit13, gdStmtLit13.length);
  }

  public void setGdStmtLit13(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit13, gdStmtLit13.length);
  }

  /**
   * Update GdStmtLit13 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit13(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit13 + targetIndex, targetLen);
  }

  /**
   * Update GdStmtLit13 with another Field
   *
   * @param value
   */
  public void setGdStmtLit13(Field source) {
    replace(source, 0, source.length(), beginGdStmtLit13, GD_STMT_LIT_13_LEN);
  }

  /**
   * Update GdStmtLit13 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdStmtLit13(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit13, GD_STMT_LIT_13_LEN);
  }

  /**
   * Update GdStmtLit13 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdStmtLit13(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdStmtLit13 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit01
   *
   * @return gdCondLit01
   */
  public char[] getGdCondLit01() throws CFException {
    if (isGdCondLit01Modified()) {
      gdCondLit01 = refreshGdCondLit01();
    }
    return gdCondLit01;
  }

  /**
   * set variable gdCondLit01 Corresponding COBOL Variable is GD-COND-LIT-01
   *
   * @param value
   */
  public void setGdCondLit01(char[] value) {
    gdCondLit01 = checkGdCondLit01Constraints(value);
    serializeGdCondLit01(gdCondLit01);
  }

  /**
   * Update GdCondLit01 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit01(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit01, gdCondLit01.length);
  }

  public void setGdCondLit01(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit01, gdCondLit01.length);
  }

  /**
   * Update GdCondLit01 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit01(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit01 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit01 with another Field
   *
   * @param value
   */
  public void setGdCondLit01(Field source) {
    replace(source, 0, source.length(), beginGdCondLit01, GD_COND_LIT_01_LEN);
  }

  /**
   * Update GdCondLit01 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit01(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit01, GD_COND_LIT_01_LEN);
  }

  /**
   * Update GdCondLit01 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit01(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit01 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit02
   *
   * @return gdCondLit02
   */
  public char[] getGdCondLit02() throws CFException {
    if (isGdCondLit02Modified()) {
      gdCondLit02 = refreshGdCondLit02();
    }
    return gdCondLit02;
  }

  /**
   * set variable gdCondLit02 Corresponding COBOL Variable is GD-COND-LIT-02
   *
   * @param value
   */
  public void setGdCondLit02(char[] value) {
    gdCondLit02 = checkGdCondLit02Constraints(value);
    serializeGdCondLit02(gdCondLit02);
  }

  /**
   * Update GdCondLit02 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit02(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit02, gdCondLit02.length);
  }

  public void setGdCondLit02(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit02, gdCondLit02.length);
  }

  /**
   * Update GdCondLit02 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit02(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit02 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit02 with another Field
   *
   * @param value
   */
  public void setGdCondLit02(Field source) {
    replace(source, 0, source.length(), beginGdCondLit02, GD_COND_LIT_02_LEN);
  }

  /**
   * Update GdCondLit02 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit02(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit02, GD_COND_LIT_02_LEN);
  }

  /**
   * Update GdCondLit02 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit02(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit02 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit03
   *
   * @return gdCondLit03
   */
  public char[] getGdCondLit03() throws CFException {
    if (isGdCondLit03Modified()) {
      gdCondLit03 = refreshGdCondLit03();
    }
    return gdCondLit03;
  }

  /**
   * set variable gdCondLit03 Corresponding COBOL Variable is GD-COND-LIT-03
   *
   * @param value
   */
  public void setGdCondLit03(char[] value) {
    gdCondLit03 = checkGdCondLit03Constraints(value);
    serializeGdCondLit03(gdCondLit03);
  }

  /**
   * Update GdCondLit03 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit03(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit03, gdCondLit03.length);
  }

  public void setGdCondLit03(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit03, gdCondLit03.length);
  }

  /**
   * Update GdCondLit03 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit03(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit03 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit03 with another Field
   *
   * @param value
   */
  public void setGdCondLit03(Field source) {
    replace(source, 0, source.length(), beginGdCondLit03, GD_COND_LIT_03_LEN);
  }

  /**
   * Update GdCondLit03 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit03(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit03, GD_COND_LIT_03_LEN);
  }

  /**
   * Update GdCondLit03 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit03(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit03 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit04
   *
   * @return gdCondLit04
   */
  public char[] getGdCondLit04() throws CFException {
    if (isGdCondLit04Modified()) {
      gdCondLit04 = refreshGdCondLit04();
    }
    return gdCondLit04;
  }

  /**
   * set variable gdCondLit04 Corresponding COBOL Variable is GD-COND-LIT-04
   *
   * @param value
   */
  public void setGdCondLit04(char[] value) {
    gdCondLit04 = checkGdCondLit04Constraints(value);
    serializeGdCondLit04(gdCondLit04);
  }

  /**
   * Update GdCondLit04 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit04(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit04, gdCondLit04.length);
  }

  public void setGdCondLit04(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit04, gdCondLit04.length);
  }

  /**
   * Update GdCondLit04 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit04(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit04 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit04 with another Field
   *
   * @param value
   */
  public void setGdCondLit04(Field source) {
    replace(source, 0, source.length(), beginGdCondLit04, GD_COND_LIT_04_LEN);
  }

  /**
   * Update GdCondLit04 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit04(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit04, GD_COND_LIT_04_LEN);
  }

  /**
   * Update GdCondLit04 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit04(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit04 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit05
   *
   * @return gdCondLit05
   */
  public char[] getGdCondLit05() throws CFException {
    if (isGdCondLit05Modified()) {
      gdCondLit05 = refreshGdCondLit05();
    }
    return gdCondLit05;
  }

  /**
   * set variable gdCondLit05 Corresponding COBOL Variable is GD-COND-LIT-05
   *
   * @param value
   */
  public void setGdCondLit05(char[] value) {
    gdCondLit05 = checkGdCondLit05Constraints(value);
    serializeGdCondLit05(gdCondLit05);
  }

  /**
   * Update GdCondLit05 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit05(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit05, gdCondLit05.length);
  }

  public void setGdCondLit05(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit05, gdCondLit05.length);
  }

  /**
   * Update GdCondLit05 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit05(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit05 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit05 with another Field
   *
   * @param value
   */
  public void setGdCondLit05(Field source) {
    replace(source, 0, source.length(), beginGdCondLit05, GD_COND_LIT_05_LEN);
  }

  /**
   * Update GdCondLit05 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit05(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit05, GD_COND_LIT_05_LEN);
  }

  /**
   * Update GdCondLit05 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit05(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit05 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit06
   *
   * @return gdCondLit06
   */
  public char[] getGdCondLit06() throws CFException {
    if (isGdCondLit06Modified()) {
      gdCondLit06 = refreshGdCondLit06();
    }
    return gdCondLit06;
  }

  /**
   * set variable gdCondLit06 Corresponding COBOL Variable is GD-COND-LIT-06
   *
   * @param value
   */
  public void setGdCondLit06(char[] value) {
    gdCondLit06 = checkGdCondLit06Constraints(value);
    serializeGdCondLit06(gdCondLit06);
  }

  /**
   * Update GdCondLit06 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit06(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit06, gdCondLit06.length);
  }

  public void setGdCondLit06(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit06, gdCondLit06.length);
  }

  /**
   * Update GdCondLit06 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit06(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit06 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit06 with another Field
   *
   * @param value
   */
  public void setGdCondLit06(Field source) {
    replace(source, 0, source.length(), beginGdCondLit06, GD_COND_LIT_06_LEN);
  }

  /**
   * Update GdCondLit06 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit06(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit06, GD_COND_LIT_06_LEN);
  }

  /**
   * Update GdCondLit06 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit06(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit06 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit07
   *
   * @return gdCondLit07
   */
  public char[] getGdCondLit07() throws CFException {
    if (isGdCondLit07Modified()) {
      gdCondLit07 = refreshGdCondLit07();
    }
    return gdCondLit07;
  }

  /**
   * set variable gdCondLit07 Corresponding COBOL Variable is GD-COND-LIT-07
   *
   * @param value
   */
  public void setGdCondLit07(char[] value) {
    gdCondLit07 = checkGdCondLit07Constraints(value);
    serializeGdCondLit07(gdCondLit07);
  }

  /**
   * Update GdCondLit07 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit07(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit07, gdCondLit07.length);
  }

  public void setGdCondLit07(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit07, gdCondLit07.length);
  }

  /**
   * Update GdCondLit07 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit07(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit07 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit07 with another Field
   *
   * @param value
   */
  public void setGdCondLit07(Field source) {
    replace(source, 0, source.length(), beginGdCondLit07, GD_COND_LIT_07_LEN);
  }

  /**
   * Update GdCondLit07 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit07(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit07, GD_COND_LIT_07_LEN);
  }

  /**
   * Update GdCondLit07 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit07(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit07 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit08
   *
   * @return gdCondLit08
   */
  public char[] getGdCondLit08() throws CFException {
    if (isGdCondLit08Modified()) {
      gdCondLit08 = refreshGdCondLit08();
    }
    return gdCondLit08;
  }

  /**
   * set variable gdCondLit08 Corresponding COBOL Variable is GD-COND-LIT-08
   *
   * @param value
   */
  public void setGdCondLit08(char[] value) {
    gdCondLit08 = checkGdCondLit08Constraints(value);
    serializeGdCondLit08(gdCondLit08);
  }

  /**
   * Update GdCondLit08 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit08(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit08, gdCondLit08.length);
  }

  public void setGdCondLit08(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit08, gdCondLit08.length);
  }

  /**
   * Update GdCondLit08 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit08(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit08 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit08 with another Field
   *
   * @param value
   */
  public void setGdCondLit08(Field source) {
    replace(source, 0, source.length(), beginGdCondLit08, GD_COND_LIT_08_LEN);
  }

  /**
   * Update GdCondLit08 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit08(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit08, GD_COND_LIT_08_LEN);
  }

  /**
   * Update GdCondLit08 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit08(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit08 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit09
   *
   * @return gdCondLit09
   */
  public char[] getGdCondLit09() throws CFException {
    if (isGdCondLit09Modified()) {
      gdCondLit09 = refreshGdCondLit09();
    }
    return gdCondLit09;
  }

  /**
   * set variable gdCondLit09 Corresponding COBOL Variable is GD-COND-LIT-09
   *
   * @param value
   */
  public void setGdCondLit09(char[] value) {
    gdCondLit09 = checkGdCondLit09Constraints(value);
    serializeGdCondLit09(gdCondLit09);
  }

  /**
   * Update GdCondLit09 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit09(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit09, gdCondLit09.length);
  }

  public void setGdCondLit09(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit09, gdCondLit09.length);
  }

  /**
   * Update GdCondLit09 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit09(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit09 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit09 with another Field
   *
   * @param value
   */
  public void setGdCondLit09(Field source) {
    replace(source, 0, source.length(), beginGdCondLit09, GD_COND_LIT_09_LEN);
  }

  /**
   * Update GdCondLit09 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit09(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit09, GD_COND_LIT_09_LEN);
  }

  /**
   * Update GdCondLit09 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit09(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit09 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit10
   *
   * @return gdCondLit10
   */
  public char[] getGdCondLit10() throws CFException {
    if (isGdCondLit10Modified()) {
      gdCondLit10 = refreshGdCondLit10();
    }
    return gdCondLit10;
  }

  /**
   * set variable gdCondLit10 Corresponding COBOL Variable is GD-COND-LIT-10
   *
   * @param value
   */
  public void setGdCondLit10(char[] value) {
    gdCondLit10 = checkGdCondLit10Constraints(value);
    serializeGdCondLit10(gdCondLit10);
  }

  /**
   * Update GdCondLit10 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit10(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit10, gdCondLit10.length);
  }

  public void setGdCondLit10(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit10, gdCondLit10.length);
  }

  /**
   * Update GdCondLit10 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit10(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit10 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit10 with another Field
   *
   * @param value
   */
  public void setGdCondLit10(Field source) {
    replace(source, 0, source.length(), beginGdCondLit10, GD_COND_LIT_10_LEN);
  }

  /**
   * Update GdCondLit10 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit10(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit10, GD_COND_LIT_10_LEN);
  }

  /**
   * Update GdCondLit10 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit10(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit10 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit11
   *
   * @return gdCondLit11
   */
  public char[] getGdCondLit11() throws CFException {
    if (isGdCondLit11Modified()) {
      gdCondLit11 = refreshGdCondLit11();
    }
    return gdCondLit11;
  }

  /**
   * set variable gdCondLit11 Corresponding COBOL Variable is GD-COND-LIT-11
   *
   * @param value
   */
  public void setGdCondLit11(char[] value) {
    gdCondLit11 = checkGdCondLit11Constraints(value);
    serializeGdCondLit11(gdCondLit11);
  }

  /**
   * Update GdCondLit11 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit11(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit11, gdCondLit11.length);
  }

  public void setGdCondLit11(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit11, gdCondLit11.length);
  }

  /**
   * Update GdCondLit11 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit11(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit11 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit11 with another Field
   *
   * @param value
   */
  public void setGdCondLit11(Field source) {
    replace(source, 0, source.length(), beginGdCondLit11, GD_COND_LIT_11_LEN);
  }

  /**
   * Update GdCondLit11 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit11(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit11, GD_COND_LIT_11_LEN);
  }

  /**
   * Update GdCondLit11 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit11(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit11 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit12
   *
   * @return gdCondLit12
   */
  public char[] getGdCondLit12() throws CFException {
    if (isGdCondLit12Modified()) {
      gdCondLit12 = refreshGdCondLit12();
    }
    return gdCondLit12;
  }

  /**
   * set variable gdCondLit12 Corresponding COBOL Variable is GD-COND-LIT-12
   *
   * @param value
   */
  public void setGdCondLit12(char[] value) {
    gdCondLit12 = checkGdCondLit12Constraints(value);
    serializeGdCondLit12(gdCondLit12);
  }

  /**
   * Update GdCondLit12 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit12(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit12, gdCondLit12.length);
  }

  public void setGdCondLit12(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit12, gdCondLit12.length);
  }

  /**
   * Update GdCondLit12 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit12(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit12 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit12 with another Field
   *
   * @param value
   */
  public void setGdCondLit12(Field source) {
    replace(source, 0, source.length(), beginGdCondLit12, GD_COND_LIT_12_LEN);
  }

  /**
   * Update GdCondLit12 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit12(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit12, GD_COND_LIT_12_LEN);
  }

  /**
   * Update GdCondLit12 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit12(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit12 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit13
   *
   * @return gdCondLit13
   */
  public char[] getGdCondLit13() throws CFException {
    if (isGdCondLit13Modified()) {
      gdCondLit13 = refreshGdCondLit13();
    }
    return gdCondLit13;
  }

  /**
   * set variable gdCondLit13 Corresponding COBOL Variable is GD-COND-LIT-13
   *
   * @param value
   */
  public void setGdCondLit13(char[] value) {
    gdCondLit13 = checkGdCondLit13Constraints(value);
    serializeGdCondLit13(gdCondLit13);
  }

  /**
   * Update GdCondLit13 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit13(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit13, gdCondLit13.length);
  }

  public void setGdCondLit13(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit13, gdCondLit13.length);
  }

  /**
   * Update GdCondLit13 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit13(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit13 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit13 with another Field
   *
   * @param value
   */
  public void setGdCondLit13(Field source) {
    replace(source, 0, source.length(), beginGdCondLit13, GD_COND_LIT_13_LEN);
  }

  /**
   * Update GdCondLit13 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit13(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit13, GD_COND_LIT_13_LEN);
  }

  /**
   * Update GdCondLit13 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit13(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit13 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit14
   *
   * @return gdCondLit14
   */
  public char[] getGdCondLit14() throws CFException {
    if (isGdCondLit14Modified()) {
      gdCondLit14 = refreshGdCondLit14();
    }
    return gdCondLit14;
  }

  /**
   * set variable gdCondLit14 Corresponding COBOL Variable is GD-COND-LIT-14
   *
   * @param value
   */
  public void setGdCondLit14(char[] value) {
    gdCondLit14 = checkGdCondLit14Constraints(value);
    serializeGdCondLit14(gdCondLit14);
  }

  /**
   * Update GdCondLit14 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit14(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit14, gdCondLit14.length);
  }

  public void setGdCondLit14(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit14, gdCondLit14.length);
  }

  /**
   * Update GdCondLit14 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit14(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit14 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit14 with another Field
   *
   * @param value
   */
  public void setGdCondLit14(Field source) {
    replace(source, 0, source.length(), beginGdCondLit14, GD_COND_LIT_14_LEN);
  }

  /**
   * Update GdCondLit14 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit14(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit14, GD_COND_LIT_14_LEN);
  }

  /**
   * Update GdCondLit14 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit14(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit14 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit15
   *
   * @return gdCondLit15
   */
  public char[] getGdCondLit15() throws CFException {
    if (isGdCondLit15Modified()) {
      gdCondLit15 = refreshGdCondLit15();
    }
    return gdCondLit15;
  }

  /**
   * set variable gdCondLit15 Corresponding COBOL Variable is GD-COND-LIT-15
   *
   * @param value
   */
  public void setGdCondLit15(char[] value) {
    gdCondLit15 = checkGdCondLit15Constraints(value);
    serializeGdCondLit15(gdCondLit15);
  }

  /**
   * Update GdCondLit15 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit15(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit15, gdCondLit15.length);
  }

  public void setGdCondLit15(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit15, gdCondLit15.length);
  }

  /**
   * Update GdCondLit15 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit15(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit15 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit15 with another Field
   *
   * @param value
   */
  public void setGdCondLit15(Field source) {
    replace(source, 0, source.length(), beginGdCondLit15, GD_COND_LIT_15_LEN);
  }

  /**
   * Update GdCondLit15 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit15(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit15, GD_COND_LIT_15_LEN);
  }

  /**
   * Update GdCondLit15 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit15(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit15 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit16
   *
   * @return gdCondLit16
   */
  public char[] getGdCondLit16() throws CFException {
    if (isGdCondLit16Modified()) {
      gdCondLit16 = refreshGdCondLit16();
    }
    return gdCondLit16;
  }

  /**
   * set variable gdCondLit16 Corresponding COBOL Variable is GD-COND-LIT-16
   *
   * @param value
   */
  public void setGdCondLit16(char[] value) {
    gdCondLit16 = checkGdCondLit16Constraints(value);
    serializeGdCondLit16(gdCondLit16);
  }

  /**
   * Update GdCondLit16 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit16(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit16, gdCondLit16.length);
  }

  public void setGdCondLit16(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit16, gdCondLit16.length);
  }

  /**
   * Update GdCondLit16 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit16(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit16 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit16 with another Field
   *
   * @param value
   */
  public void setGdCondLit16(Field source) {
    replace(source, 0, source.length(), beginGdCondLit16, GD_COND_LIT_16_LEN);
  }

  /**
   * Update GdCondLit16 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit16(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit16, GD_COND_LIT_16_LEN);
  }

  /**
   * Update GdCondLit16 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit16(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit16 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit17
   *
   * @return gdCondLit17
   */
  public char[] getGdCondLit17() throws CFException {
    if (isGdCondLit17Modified()) {
      gdCondLit17 = refreshGdCondLit17();
    }
    return gdCondLit17;
  }

  /**
   * set variable gdCondLit17 Corresponding COBOL Variable is GD-COND-LIT-17
   *
   * @param value
   */
  public void setGdCondLit17(char[] value) {
    gdCondLit17 = checkGdCondLit17Constraints(value);
    serializeGdCondLit17(gdCondLit17);
  }

  /**
   * Update GdCondLit17 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit17(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit17, gdCondLit17.length);
  }

  public void setGdCondLit17(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit17, gdCondLit17.length);
  }

  /**
   * Update GdCondLit17 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit17(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit17 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit17 with another Field
   *
   * @param value
   */
  public void setGdCondLit17(Field source) {
    replace(source, 0, source.length(), beginGdCondLit17, GD_COND_LIT_17_LEN);
  }

  /**
   * Update GdCondLit17 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit17(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit17, GD_COND_LIT_17_LEN);
  }

  /**
   * Update GdCondLit17 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit17(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit17 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit18
   *
   * @return gdCondLit18
   */
  public char[] getGdCondLit18() throws CFException {
    if (isGdCondLit18Modified()) {
      gdCondLit18 = refreshGdCondLit18();
    }
    return gdCondLit18;
  }

  /**
   * set variable gdCondLit18 Corresponding COBOL Variable is GD-COND-LIT-18
   *
   * @param value
   */
  public void setGdCondLit18(char[] value) {
    gdCondLit18 = checkGdCondLit18Constraints(value);
    serializeGdCondLit18(gdCondLit18);
  }

  /**
   * Update GdCondLit18 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit18(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit18, gdCondLit18.length);
  }

  public void setGdCondLit18(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit18, gdCondLit18.length);
  }

  /**
   * Update GdCondLit18 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit18(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit18 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit18 with another Field
   *
   * @param value
   */
  public void setGdCondLit18(Field source) {
    replace(source, 0, source.length(), beginGdCondLit18, GD_COND_LIT_18_LEN);
  }

  /**
   * Update GdCondLit18 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit18(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit18, GD_COND_LIT_18_LEN);
  }

  /**
   * Update GdCondLit18 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit18(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit18 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit19
   *
   * @return gdCondLit19
   */
  public char[] getGdCondLit19() throws CFException {
    if (isGdCondLit19Modified()) {
      gdCondLit19 = refreshGdCondLit19();
    }
    return gdCondLit19;
  }

  /**
   * set variable gdCondLit19 Corresponding COBOL Variable is GD-COND-LIT-19
   *
   * @param value
   */
  public void setGdCondLit19(char[] value) {
    gdCondLit19 = checkGdCondLit19Constraints(value);
    serializeGdCondLit19(gdCondLit19);
  }

  /**
   * Update GdCondLit19 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit19(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit19, gdCondLit19.length);
  }

  public void setGdCondLit19(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit19, gdCondLit19.length);
  }

  /**
   * Update GdCondLit19 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit19(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit19 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit19 with another Field
   *
   * @param value
   */
  public void setGdCondLit19(Field source) {
    replace(source, 0, source.length(), beginGdCondLit19, GD_COND_LIT_19_LEN);
  }

  /**
   * Update GdCondLit19 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit19(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit19, GD_COND_LIT_19_LEN);
  }

  /**
   * Update GdCondLit19 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit19(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit19 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit20
   *
   * @return gdCondLit20
   */
  public char[] getGdCondLit20() throws CFException {
    if (isGdCondLit20Modified()) {
      gdCondLit20 = refreshGdCondLit20();
    }
    return gdCondLit20;
  }

  /**
   * set variable gdCondLit20 Corresponding COBOL Variable is GD-COND-LIT-20
   *
   * @param value
   */
  public void setGdCondLit20(char[] value) {
    gdCondLit20 = checkGdCondLit20Constraints(value);
    serializeGdCondLit20(gdCondLit20);
  }

  /**
   * Update GdCondLit20 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit20(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit20, gdCondLit20.length);
  }

  public void setGdCondLit20(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit20, gdCondLit20.length);
  }

  /**
   * Update GdCondLit20 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit20(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit20 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit20 with another Field
   *
   * @param value
   */
  public void setGdCondLit20(Field source) {
    replace(source, 0, source.length(), beginGdCondLit20, GD_COND_LIT_20_LEN);
  }

  /**
   * Update GdCondLit20 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit20(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit20, GD_COND_LIT_20_LEN);
  }

  /**
   * Update GdCondLit20 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit20(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit20 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit21
   *
   * @return gdCondLit21
   */
  public char[] getGdCondLit21() throws CFException {
    if (isGdCondLit21Modified()) {
      gdCondLit21 = refreshGdCondLit21();
    }
    return gdCondLit21;
  }

  /**
   * set variable gdCondLit21 Corresponding COBOL Variable is GD-COND-LIT-21
   *
   * @param value
   */
  public void setGdCondLit21(char[] value) {
    gdCondLit21 = checkGdCondLit21Constraints(value);
    serializeGdCondLit21(gdCondLit21);
  }

  /**
   * Update GdCondLit21 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit21(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit21, gdCondLit21.length);
  }

  public void setGdCondLit21(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit21, gdCondLit21.length);
  }

  /**
   * Update GdCondLit21 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit21(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit21 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit21 with another Field
   *
   * @param value
   */
  public void setGdCondLit21(Field source) {
    replace(source, 0, source.length(), beginGdCondLit21, GD_COND_LIT_21_LEN);
  }

  /**
   * Update GdCondLit21 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit21(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit21, GD_COND_LIT_21_LEN);
  }

  /**
   * Update GdCondLit21 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit21(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit21 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit22
   *
   * @return gdCondLit22
   */
  public char[] getGdCondLit22() throws CFException {
    if (isGdCondLit22Modified()) {
      gdCondLit22 = refreshGdCondLit22();
    }
    return gdCondLit22;
  }

  /**
   * set variable gdCondLit22 Corresponding COBOL Variable is GD-COND-LIT-22
   *
   * @param value
   */
  public void setGdCondLit22(char[] value) {
    gdCondLit22 = checkGdCondLit22Constraints(value);
    serializeGdCondLit22(gdCondLit22);
  }

  /**
   * Update GdCondLit22 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit22(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit22, gdCondLit22.length);
  }

  public void setGdCondLit22(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit22, gdCondLit22.length);
  }

  /**
   * Update GdCondLit22 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit22(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit22 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit22 with another Field
   *
   * @param value
   */
  public void setGdCondLit22(Field source) {
    replace(source, 0, source.length(), beginGdCondLit22, GD_COND_LIT_22_LEN);
  }

  /**
   * Update GdCondLit22 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit22(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit22, GD_COND_LIT_22_LEN);
  }

  /**
   * Update GdCondLit22 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit22(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit22 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit23
   *
   * @return gdCondLit23
   */
  public char[] getGdCondLit23() throws CFException {
    if (isGdCondLit23Modified()) {
      gdCondLit23 = refreshGdCondLit23();
    }
    return gdCondLit23;
  }

  /**
   * set variable gdCondLit23 Corresponding COBOL Variable is GD-COND-LIT-23
   *
   * @param value
   */
  public void setGdCondLit23(char[] value) {
    gdCondLit23 = checkGdCondLit23Constraints(value);
    serializeGdCondLit23(gdCondLit23);
  }

  /**
   * Update GdCondLit23 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit23(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit23, gdCondLit23.length);
  }

  public void setGdCondLit23(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit23, gdCondLit23.length);
  }

  /**
   * Update GdCondLit23 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit23(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit23 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit23 with another Field
   *
   * @param value
   */
  public void setGdCondLit23(Field source) {
    replace(source, 0, source.length(), beginGdCondLit23, GD_COND_LIT_23_LEN);
  }

  /**
   * Update GdCondLit23 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit23(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit23, GD_COND_LIT_23_LEN);
  }

  /**
   * Update GdCondLit23 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit23(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit23 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit24
   *
   * @return gdCondLit24
   */
  public char[] getGdCondLit24() throws CFException {
    if (isGdCondLit24Modified()) {
      gdCondLit24 = refreshGdCondLit24();
    }
    return gdCondLit24;
  }

  /**
   * set variable gdCondLit24 Corresponding COBOL Variable is GD-COND-LIT-24
   *
   * @param value
   */
  public void setGdCondLit24(char[] value) {
    gdCondLit24 = checkGdCondLit24Constraints(value);
    serializeGdCondLit24(gdCondLit24);
  }

  /**
   * Update GdCondLit24 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit24(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit24, gdCondLit24.length);
  }

  public void setGdCondLit24(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit24, gdCondLit24.length);
  }

  /**
   * Update GdCondLit24 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit24(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit24 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit24 with another Field
   *
   * @param value
   */
  public void setGdCondLit24(Field source) {
    replace(source, 0, source.length(), beginGdCondLit24, GD_COND_LIT_24_LEN);
  }

  /**
   * Update GdCondLit24 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit24(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit24, GD_COND_LIT_24_LEN);
  }

  /**
   * Update GdCondLit24 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit24(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit24 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit25
   *
   * @return gdCondLit25
   */
  public char[] getGdCondLit25() throws CFException {
    if (isGdCondLit25Modified()) {
      gdCondLit25 = refreshGdCondLit25();
    }
    return gdCondLit25;
  }

  /**
   * set variable gdCondLit25 Corresponding COBOL Variable is GD-COND-LIT-25
   *
   * @param value
   */
  public void setGdCondLit25(char[] value) {
    gdCondLit25 = checkGdCondLit25Constraints(value);
    serializeGdCondLit25(gdCondLit25);
  }

  /**
   * Update GdCondLit25 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit25(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit25, gdCondLit25.length);
  }

  public void setGdCondLit25(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit25, gdCondLit25.length);
  }

  /**
   * Update GdCondLit25 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit25(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit25 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit25 with another Field
   *
   * @param value
   */
  public void setGdCondLit25(Field source) {
    replace(source, 0, source.length(), beginGdCondLit25, GD_COND_LIT_25_LEN);
  }

  /**
   * Update GdCondLit25 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit25(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit25, GD_COND_LIT_25_LEN);
  }

  /**
   * Update GdCondLit25 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit25(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit25 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCondLit26
   *
   * @return gdCondLit26
   */
  public char[] getGdCondLit26() throws CFException {
    if (isGdCondLit26Modified()) {
      gdCondLit26 = refreshGdCondLit26();
    }
    return gdCondLit26;
  }

  /**
   * set variable gdCondLit26 Corresponding COBOL Variable is GD-COND-LIT-26
   *
   * @param value
   */
  public void setGdCondLit26(char[] value) {
    gdCondLit26 = checkGdCondLit26Constraints(value);
    serializeGdCondLit26(gdCondLit26);
  }

  /**
   * Update GdCondLit26 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCondLit26(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCondLit26, gdCondLit26.length);
  }

  public void setGdCondLit26(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit26, gdCondLit26.length);
  }

  /**
   * Update GdCondLit26 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit26(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit26 + targetIndex, targetLen);
  }

  /**
   * Update GdCondLit26 with another Field
   *
   * @param value
   */
  public void setGdCondLit26(Field source) {
    replace(source, 0, source.length(), beginGdCondLit26, GD_COND_LIT_26_LEN);
  }

  /**
   * Update GdCondLit26 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCondLit26(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit26, GD_COND_LIT_26_LEN);
  }

  /**
   * Update GdCondLit26 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCondLit26(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCondLit26 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnLit01
   *
   * @return gdConnLit01
   */
  public char[] getGdConnLit01() throws CFException {
    if (isGdConnLit01Modified()) {
      gdConnLit01 = refreshGdConnLit01();
    }
    return gdConnLit01;
  }

  /**
   * set variable gdConnLit01 Corresponding COBOL Variable is GD-CONN-LIT-01
   *
   * @param value
   */
  public void setGdConnLit01(char[] value) {
    gdConnLit01 = checkGdConnLit01Constraints(value);
    serializeGdConnLit01(gdConnLit01);
  }

  /**
   * Update GdConnLit01 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdConnLit01(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdConnLit01, gdConnLit01.length);
  }

  public void setGdConnLit01(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit01, gdConnLit01.length);
  }

  /**
   * Update GdConnLit01 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit01(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit01 + targetIndex, targetLen);
  }

  /**
   * Update GdConnLit01 with another Field
   *
   * @param value
   */
  public void setGdConnLit01(Field source) {
    replace(source, 0, source.length(), beginGdConnLit01, GD_CONN_LIT_01_LEN);
  }

  /**
   * Update GdConnLit01 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdConnLit01(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit01, GD_CONN_LIT_01_LEN);
  }

  /**
   * Update GdConnLit01 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit01(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit01 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnLit02
   *
   * @return gdConnLit02
   */
  public char[] getGdConnLit02() throws CFException {
    if (isGdConnLit02Modified()) {
      gdConnLit02 = refreshGdConnLit02();
    }
    return gdConnLit02;
  }

  /**
   * set variable gdConnLit02 Corresponding COBOL Variable is GD-CONN-LIT-02
   *
   * @param value
   */
  public void setGdConnLit02(char[] value) {
    gdConnLit02 = checkGdConnLit02Constraints(value);
    serializeGdConnLit02(gdConnLit02);
  }

  /**
   * Update GdConnLit02 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdConnLit02(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdConnLit02, gdConnLit02.length);
  }

  public void setGdConnLit02(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit02, gdConnLit02.length);
  }

  /**
   * Update GdConnLit02 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit02(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit02 + targetIndex, targetLen);
  }

  /**
   * Update GdConnLit02 with another Field
   *
   * @param value
   */
  public void setGdConnLit02(Field source) {
    replace(source, 0, source.length(), beginGdConnLit02, GD_CONN_LIT_02_LEN);
  }

  /**
   * Update GdConnLit02 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdConnLit02(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit02, GD_CONN_LIT_02_LEN);
  }

  /**
   * Update GdConnLit02 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit02(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit02 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnLit03
   *
   * @return gdConnLit03
   */
  public char[] getGdConnLit03() throws CFException {
    if (isGdConnLit03Modified()) {
      gdConnLit03 = refreshGdConnLit03();
    }
    return gdConnLit03;
  }

  /**
   * set variable gdConnLit03 Corresponding COBOL Variable is GD-CONN-LIT-03
   *
   * @param value
   */
  public void setGdConnLit03(char[] value) {
    gdConnLit03 = checkGdConnLit03Constraints(value);
    serializeGdConnLit03(gdConnLit03);
  }

  /**
   * Update GdConnLit03 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdConnLit03(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdConnLit03, gdConnLit03.length);
  }

  public void setGdConnLit03(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit03, gdConnLit03.length);
  }

  /**
   * Update GdConnLit03 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit03(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit03 + targetIndex, targetLen);
  }

  /**
   * Update GdConnLit03 with another Field
   *
   * @param value
   */
  public void setGdConnLit03(Field source) {
    replace(source, 0, source.length(), beginGdConnLit03, GD_CONN_LIT_03_LEN);
  }

  /**
   * Update GdConnLit03 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdConnLit03(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit03, GD_CONN_LIT_03_LEN);
  }

  /**
   * Update GdConnLit03 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit03(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit03 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnLit04
   *
   * @return gdConnLit04
   */
  public char[] getGdConnLit04() throws CFException {
    if (isGdConnLit04Modified()) {
      gdConnLit04 = refreshGdConnLit04();
    }
    return gdConnLit04;
  }

  /**
   * set variable gdConnLit04 Corresponding COBOL Variable is GD-CONN-LIT-04
   *
   * @param value
   */
  public void setGdConnLit04(char[] value) {
    gdConnLit04 = checkGdConnLit04Constraints(value);
    serializeGdConnLit04(gdConnLit04);
  }

  /**
   * Update GdConnLit04 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdConnLit04(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdConnLit04, gdConnLit04.length);
  }

  public void setGdConnLit04(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit04, gdConnLit04.length);
  }

  /**
   * Update GdConnLit04 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit04(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit04 + targetIndex, targetLen);
  }

  /**
   * Update GdConnLit04 with another Field
   *
   * @param value
   */
  public void setGdConnLit04(Field source) {
    replace(source, 0, source.length(), beginGdConnLit04, GD_CONN_LIT_04_LEN);
  }

  /**
   * Update GdConnLit04 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdConnLit04(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit04, GD_CONN_LIT_04_LEN);
  }

  /**
   * Update GdConnLit04 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit04(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit04 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnLit05
   *
   * @return gdConnLit05
   */
  public char[] getGdConnLit05() throws CFException {
    if (isGdConnLit05Modified()) {
      gdConnLit05 = refreshGdConnLit05();
    }
    return gdConnLit05;
  }

  /**
   * set variable gdConnLit05 Corresponding COBOL Variable is GD-CONN-LIT-05
   *
   * @param value
   */
  public void setGdConnLit05(char[] value) {
    gdConnLit05 = checkGdConnLit05Constraints(value);
    serializeGdConnLit05(gdConnLit05);
  }

  /**
   * Update GdConnLit05 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdConnLit05(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdConnLit05, gdConnLit05.length);
  }

  public void setGdConnLit05(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit05, gdConnLit05.length);
  }

  /**
   * Update GdConnLit05 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit05(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit05 + targetIndex, targetLen);
  }

  /**
   * Update GdConnLit05 with another Field
   *
   * @param value
   */
  public void setGdConnLit05(Field source) {
    replace(source, 0, source.length(), beginGdConnLit05, GD_CONN_LIT_05_LEN);
  }

  /**
   * Update GdConnLit05 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdConnLit05(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit05, GD_CONN_LIT_05_LEN);
  }

  /**
   * Update GdConnLit05 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit05(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit05 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnLit06
   *
   * @return gdConnLit06
   */
  public char[] getGdConnLit06() throws CFException {
    if (isGdConnLit06Modified()) {
      gdConnLit06 = refreshGdConnLit06();
    }
    return gdConnLit06;
  }

  /**
   * set variable gdConnLit06 Corresponding COBOL Variable is GD-CONN-LIT-06
   *
   * @param value
   */
  public void setGdConnLit06(char[] value) {
    gdConnLit06 = checkGdConnLit06Constraints(value);
    serializeGdConnLit06(gdConnLit06);
  }

  /**
   * Update GdConnLit06 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdConnLit06(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdConnLit06, gdConnLit06.length);
  }

  public void setGdConnLit06(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit06, gdConnLit06.length);
  }

  /**
   * Update GdConnLit06 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit06(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit06 + targetIndex, targetLen);
  }

  /**
   * Update GdConnLit06 with another Field
   *
   * @param value
   */
  public void setGdConnLit06(Field source) {
    replace(source, 0, source.length(), beginGdConnLit06, GD_CONN_LIT_06_LEN);
  }

  /**
   * Update GdConnLit06 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdConnLit06(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit06, GD_CONN_LIT_06_LEN);
  }

  /**
   * Update GdConnLit06 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit06(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit06 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnLit07
   *
   * @return gdConnLit07
   */
  public char[] getGdConnLit07() throws CFException {
    if (isGdConnLit07Modified()) {
      gdConnLit07 = refreshGdConnLit07();
    }
    return gdConnLit07;
  }

  /**
   * set variable gdConnLit07 Corresponding COBOL Variable is GD-CONN-LIT-07
   *
   * @param value
   */
  public void setGdConnLit07(char[] value) {
    gdConnLit07 = checkGdConnLit07Constraints(value);
    serializeGdConnLit07(gdConnLit07);
  }

  /**
   * Update GdConnLit07 with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdConnLit07(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdConnLit07, gdConnLit07.length);
  }

  public void setGdConnLit07(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit07, gdConnLit07.length);
  }

  /**
   * Update GdConnLit07 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit07(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit07 + targetIndex, targetLen);
  }

  /**
   * Update GdConnLit07 with another Field
   *
   * @param value
   */
  public void setGdConnLit07(Field source) {
    replace(source, 0, source.length(), beginGdConnLit07, GD_CONN_LIT_07_LEN);
  }

  /**
   * Update GdConnLit07 with another Field from an offset and length
   *
   * @param value
   */
  public void setGdConnLit07(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit07, GD_CONN_LIT_07_LEN);
  }

  /**
   * Update GdConnLit07 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdConnLit07(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdConnLit07 + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCatalogName
   *
   * @return gdCatalogName
   */
  public GdCatalogName getGdCatalogName() {
    return gdCatalogName;
  }
  /**
   * Update GdCatalogName with the passed value Corresponding COBOL Variable is GD-CATALOG-NAME
   *
   * @param value
   */
  public void setGdCatalogName(char[] value) {
    gdCatalogName.setString(value);
  }

  /**
   * Update GdCatalogName with a String from an offset and length
   *
   * @param value
   */
  public void setGdCatalogName(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdCatalogName.begin, gdCatalogName.length());
  }

  /**
   * Update GdCatalogName with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCatalogName(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdCatalogName.begin + targetIndex, targetLen);
  }

  /**
   * Update GdCatalogName with another Field
   *
   * @param value
   */
  public void setGdCatalogName(Field source) {
    replace(source, 0, source.length(), gdCatalogName.begin, gdCatalogName.length());
  }

  /**
   * Update GdCatalogName with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCatalogName(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdCatalogName.begin, gdCatalogName.length());
  }

  /**
   * Update GdCatalogName with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCatalogName(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdCatalogName.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConditionNumber
   *
   * @return gdConditionNumber
   */
  public int getGdConditionNumber() throws CFException {
    if (isGdConditionNumberModified()) {
      gdConditionNumber = refreshGdConditionNumber();
    }
    return gdConditionNumber;
  }

  /**
   * Update GdConditionNumber with the passed value Corresponding COBOL Variable is
   * GD-CONDITION-NUMBER
   *
   * @param number
   */
  public void setGdConditionNumber(int number) {
    // Truncate if the number is beyond +/- Max range
    gdConditionNumber = checkGdConditionNumberMaxLimit(number);
    serializeGdConditionNumber(gdConditionNumber);
  }

  public void setGdConditionNumber(long number) {
    number = checkGdConditionNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdConditionNumber((int) number);
  }

  /**
   * Returns the value of gdCursorName
   *
   * @return gdCursorName
   */
  public GdCursorName getGdCursorName() {
    return gdCursorName;
  }
  /**
   * Update GdCursorName with the passed value Corresponding COBOL Variable is GD-CURSOR-NAME
   *
   * @param value
   */
  public void setGdCursorName(char[] value) {
    gdCursorName.setString(value);
  }

  /**
   * Update GdCursorName with a String from an offset and length
   *
   * @param value
   */
  public void setGdCursorName(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdCursorName.begin, gdCursorName.length());
  }

  /**
   * Update GdCursorName with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorName(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdCursorName.begin + targetIndex, targetLen);
  }

  /**
   * Update GdCursorName with another Field
   *
   * @param value
   */
  public void setGdCursorName(Field source) {
    replace(source, 0, source.length(), gdCursorName.begin, gdCursorName.length());
  }

  /**
   * Update GdCursorName with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCursorName(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdCursorName.begin, gdCursorName.length());
  }

  /**
   * Update GdCursorName with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorName(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdCursorName.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdErrorCode1
   *
   * @return gdErrorCode1
   */
  public int getGdErrorCode1() throws CFException {
    if (isGdErrorCode1Modified()) {
      gdErrorCode1 = refreshGdErrorCode1();
    }
    return gdErrorCode1;
  }

  /**
   * Update GdErrorCode1 with the passed value Corresponding COBOL Variable is GD-ERROR-CODE1
   *
   * @param number
   */
  public void setGdErrorCode1(int number) {
    // Truncate if the number is beyond +/- Max range
    gdErrorCode1 = checkGdErrorCode1MaxLimit(number);
    serializeGdErrorCode1(gdErrorCode1);
  }

  public void setGdErrorCode1(long number) {
    number = checkGdErrorCode1MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdErrorCode1((int) number);
  }

  /**
   * Returns the value of gdErrorCode2
   *
   * @return gdErrorCode2
   */
  public int getGdErrorCode2() throws CFException {
    if (isGdErrorCode2Modified()) {
      gdErrorCode2 = refreshGdErrorCode2();
    }
    return gdErrorCode2;
  }

  /**
   * Update GdErrorCode2 with the passed value Corresponding COBOL Variable is GD-ERROR-CODE2
   *
   * @param number
   */
  public void setGdErrorCode2(int number) {
    // Truncate if the number is beyond +/- Max range
    gdErrorCode2 = checkGdErrorCode2MaxLimit(number);
    serializeGdErrorCode2(gdErrorCode2);
  }

  public void setGdErrorCode2(long number) {
    number = checkGdErrorCode2MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdErrorCode2((int) number);
  }

  /**
   * Returns the value of gdErrorCode3
   *
   * @return gdErrorCode3
   */
  public int getGdErrorCode3() throws CFException {
    if (isGdErrorCode3Modified()) {
      gdErrorCode3 = refreshGdErrorCode3();
    }
    return gdErrorCode3;
  }

  /**
   * Update GdErrorCode3 with the passed value Corresponding COBOL Variable is GD-ERROR-CODE3
   *
   * @param number
   */
  public void setGdErrorCode3(int number) {
    // Truncate if the number is beyond +/- Max range
    gdErrorCode3 = checkGdErrorCode3MaxLimit(number);
    serializeGdErrorCode3(gdErrorCode3);
  }

  public void setGdErrorCode3(long number) {
    number = checkGdErrorCode3MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdErrorCode3((int) number);
  }

  /**
   * Returns the value of gdErrorCode4
   *
   * @return gdErrorCode4
   */
  public int getGdErrorCode4() throws CFException {
    if (isGdErrorCode4Modified()) {
      gdErrorCode4 = refreshGdErrorCode4();
    }
    return gdErrorCode4;
  }

  /**
   * Update GdErrorCode4 with the passed value Corresponding COBOL Variable is GD-ERROR-CODE4
   *
   * @param number
   */
  public void setGdErrorCode4(int number) {
    // Truncate if the number is beyond +/- Max range
    gdErrorCode4 = checkGdErrorCode4MaxLimit(number);
    serializeGdErrorCode4(gdErrorCode4);
  }

  public void setGdErrorCode4(long number) {
    number = checkGdErrorCode4MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdErrorCode4((int) number);
  }

  /**
   * Returns the value of gdInternalErrPtr
   *
   * @return gdInternalErrPtr
   */
  public int getGdInternalErrPtr() throws CFException {
    if (isGdInternalErrPtrModified()) {
      gdInternalErrPtr = refreshGdInternalErrPtr();
    }
    return gdInternalErrPtr;
  }

  /**
   * Update GdInternalErrPtr with the passed value Corresponding COBOL Variable is
   * GD-INTERNAL-ERR-PTR
   *
   * @param number
   */
  public void setGdInternalErrPtr(int number) {
    // Truncate if the number is beyond +/- Max range
    gdInternalErrPtr = checkGdInternalErrPtrMaxLimit(number);
    serializeGdInternalErrPtr(gdInternalErrPtr);
  }

  public void setGdInternalErrPtr(long number) {
    number = checkGdInternalErrPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdInternalErrPtr((int) number);
  }

  /**
   * Returns the value of gdLineNumber
   *
   * @return gdLineNumber
   */
  public int getGdLineNumber() throws CFException {
    if (isGdLineNumberModified()) {
      gdLineNumber = refreshGdLineNumber();
    }
    return gdLineNumber;
  }

  /**
   * Update GdLineNumber with the passed value Corresponding COBOL Variable is GD-LINE-NUMBER
   *
   * @param number
   */
  public void setGdLineNumber(int number) {
    // Truncate if the number is beyond +/- Max range
    gdLineNumber = checkGdLineNumberMaxLimit(number);
    serializeGdLineNumber(gdLineNumber);
  }

  public void setGdLineNumber(long number) {
    number = checkGdLineNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdLineNumber((int) number);
  }

  /**
   * Returns the value of gdMessageId
   *
   * @return gdMessageId
   */
  public char[] getGdMessageId() throws CFException {
    if (isGdMessageIdModified()) {
      gdMessageId = refreshGdMessageId();
    }
    return gdMessageId;
  }

  /**
   * set variable gdMessageId Corresponding COBOL Variable is GD-MESSAGE-ID
   *
   * @param value
   */
  public void setGdMessageId(char[] value) {
    gdMessageId = checkGdMessageIdConstraints(value);
    serializeGdMessageId(gdMessageId);
  }

  /**
   * Update GdMessageId with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdMessageId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdMessageId, gdMessageId.length);
  }

  public void setGdMessageId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageId, gdMessageId.length);
  }

  /**
   * Update GdMessageId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMessageId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageId + targetIndex, targetLen);
  }

  /**
   * Update GdMessageId with another Field
   *
   * @param value
   */
  public void setGdMessageId(Field source) {
    replace(source, 0, source.length(), beginGdMessageId, GD_MESSAGE_ID_LEN);
  }

  /**
   * Update GdMessageId with another Field from an offset and length
   *
   * @param value
   */
  public void setGdMessageId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageId, GD_MESSAGE_ID_LEN);
  }

  /**
   * Update GdMessageId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMessageId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageId + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdModDetectingErr
   *
   * @return gdModDetectingErr
   */
  public char[] getGdModDetectingErr() throws CFException {
    if (isGdModDetectingErrModified()) {
      gdModDetectingErr = refreshGdModDetectingErr();
    }
    return gdModDetectingErr;
  }

  /**
   * set variable gdModDetectingErr Corresponding COBOL Variable is GD-MOD-DETECTING-ERR
   *
   * @param value
   */
  public void setGdModDetectingErr(char[] value) {
    gdModDetectingErr = checkGdModDetectingErrConstraints(value);
    serializeGdModDetectingErr(gdModDetectingErr);
  }

  /**
   * Update GdModDetectingErr with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdModDetectingErr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdModDetectingErr, gdModDetectingErr.length);
  }

  public void setGdModDetectingErr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdModDetectingErr, gdModDetectingErr.length);
  }

  /**
   * Update GdModDetectingErr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdModDetectingErr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdModDetectingErr + targetIndex, targetLen);
  }

  /**
   * Update GdModDetectingErr with another Field
   *
   * @param value
   */
  public void setGdModDetectingErr(Field source) {
    replace(source, 0, source.length(), beginGdModDetectingErr, GD_MOD_DETECTING_ERR_LEN);
  }

  /**
   * Update GdModDetectingErr with another Field from an offset and length
   *
   * @param value
   */
  public void setGdModDetectingErr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdModDetectingErr, GD_MOD_DETECTING_ERR_LEN);
  }

  /**
   * Update GdModDetectingErr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdModDetectingErr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdModDetectingErr + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdOrdTokenTable
   *
   * @return gdOrdTokenTable
   */
  public GdOrdTokenTable getGdOrdTokenTable() {
    return gdOrdTokenTable;
  }
  /**
   * Update GdOrdTokenTable with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-TABLE
   *
   * @param value
   */
  public void setGdOrdTokenTable(char[] value) {
    gdOrdTokenTable.setString(value);
  }

  /**
   * Update GdOrdTokenTable with a String from an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenTable(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdOrdTokenTable.begin, gdOrdTokenTable.length());
  }

  /**
   * Update GdOrdTokenTable with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenTable(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdOrdTokenTable.begin + targetIndex, targetLen);
  }

  /**
   * Update GdOrdTokenTable with another Field
   *
   * @param value
   */
  public void setGdOrdTokenTable(Field source) {
    replace(source, 0, source.length(), gdOrdTokenTable.begin, gdOrdTokenTable.length());
  }

  /**
   * Update GdOrdTokenTable with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenTable(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdOrdTokenTable.begin, gdOrdTokenTable.length());
  }

  /**
   * Update GdOrdTokenTable with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenTable(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdOrdTokenTable.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdOrdTokenTableRedefined
   *
   * @return gdOrdTokenTableRedefined
   */
  public GdOrdTokenTableRedefined getGdOrdTokenTableRedefined() {
    return gdOrdTokenTableRedefined;
  }
  /**
   * Update GdOrdTokenTableRedefined with the passed value Corresponding COBOL Variable is
   * GD-ORD-TOKEN-TABLE-REDEFINED
   *
   * @param value
   */
  public void setGdOrdTokenTableRedefined(char[] value) {
    gdOrdTokenTableRedefined.setString(value);
  }

  /**
   * Update GdOrdTokenTableRedefined with a String from an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenTableRedefined(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        gdOrdTokenTableRedefined.begin,
        gdOrdTokenTableRedefined.length());
  }

  /**
   * Update GdOrdTokenTableRedefined with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenTableRedefined(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(
        source, sourceIndex, sourceLen, gdOrdTokenTableRedefined.begin + targetIndex, targetLen);
  }

  /**
   * Update GdOrdTokenTableRedefined with another Field
   *
   * @param value
   */
  public void setGdOrdTokenTableRedefined(Field source) {
    replace(
        source,
        0,
        source.length(),
        gdOrdTokenTableRedefined.begin,
        gdOrdTokenTableRedefined.length());
  }

  /**
   * Update GdOrdTokenTableRedefined with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenTableRedefined(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        gdOrdTokenTableRedefined.begin,
        gdOrdTokenTableRedefined.length());
  }

  /**
   * Update GdOrdTokenTableRedefined with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setGdOrdTokenTableRedefined(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(
        source, sourceIndex, sourceLen, gdOrdTokenTableRedefined.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdReasonCode
   *
   * @return gdReasonCode
   */
  public int getGdReasonCode() throws CFException {
    if (isGdReasonCodeModified()) {
      gdReasonCode = refreshGdReasonCode();
    }
    return gdReasonCode;
  }

  /**
   * Update GdReasonCode with the passed value Corresponding COBOL Variable is GD-REASON-CODE
   *
   * @param number
   */
  public void setGdReasonCode(int number) {
    // Truncate if the number is beyond +/- Max range
    gdReasonCode = checkGdReasonCodeMaxLimit(number);
    serializeGdReasonCode(gdReasonCode);
  }

  public void setGdReasonCode(long number) {
    number = checkGdReasonCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdReasonCode((int) number);
  }

  /**
   * Returns the value of gdReturnedSqlcode
   *
   * @return gdReturnedSqlcode
   */
  public int getGdReturnedSqlcode() throws CFException {
    if (isGdReturnedSqlcodeModified()) {
      gdReturnedSqlcode = refreshGdReturnedSqlcode();
    }
    return gdReturnedSqlcode;
  }

  /**
   * Update GdReturnedSqlcode with the passed value Corresponding COBOL Variable is
   * GD-RETURNED-SQLCODE
   *
   * @param number
   */
  public void setGdReturnedSqlcode(int number) {
    // Truncate if the number is beyond +/- Max range
    gdReturnedSqlcode = checkGdReturnedSqlcodeMaxLimit(number);
    serializeGdReturnedSqlcode(gdReturnedSqlcode);
  }

  public void setGdReturnedSqlcode(long number) {
    number = checkGdReturnedSqlcodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdReturnedSqlcode((int) number);
  }

  public long getGdRowNumber() throws CFException {
    if (isGdRowNumberModified()) {
      gdRowNumber = refreshGdRowNumber();
    }
    return gdRowNumber;
  }

  /**
   * Update GdRowNumber with the passed value Corresponding COBOL Variable is GD-ROW-NUMBER
   *
   * @param number
   */
  public void setGdRowNumber(long number) {
    gdRowNumber = checkGdRowNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeGdRowNumber(gdRowNumber);
  }

  /**
   * Returns the value of gdSqlerrdSet
   *
   * @return gdSqlerrdSet
   */
  public char[] getGdSqlerrdSet() throws CFException {
    if (isGdSqlerrdSetModified()) {
      gdSqlerrdSet = refreshGdSqlerrdSet();
    }
    return gdSqlerrdSet;
  }

  /**
   * set variable gdSqlerrdSet Corresponding COBOL Variable is GD-SQLERRD-SET
   *
   * @param value
   */
  public void setGdSqlerrdSet(char[] value) {
    gdSqlerrdSet = checkGdSqlerrdSetConstraints(value);
    serializeGdSqlerrdSet(gdSqlerrdSet);
  }

  /**
   * Update GdSqlerrdSet with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdSqlerrdSet(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdSqlerrdSet, gdSqlerrdSet.length);
  }

  public void setGdSqlerrdSet(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlerrdSet, gdSqlerrdSet.length);
  }

  /**
   * Update GdSqlerrdSet with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlerrdSet(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlerrdSet + targetIndex, targetLen);
  }

  /**
   * Update GdSqlerrdSet with another Field
   *
   * @param value
   */
  public void setGdSqlerrdSet(Field source) {
    replace(source, 0, source.length(), beginGdSqlerrdSet, GD_SQLERRD_SET_LEN);
  }

  /**
   * Update GdSqlerrdSet with another Field from an offset and length
   *
   * @param value
   */
  public void setGdSqlerrdSet(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlerrdSet, GD_SQLERRD_SET_LEN);
  }

  /**
   * Update GdSqlerrdSet with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlerrdSet(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlerrdSet + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdSqlerrd1
   *
   * @return gdSqlerrd1
   */
  public int getGdSqlerrd1() throws CFException {
    if (isGdSqlerrd1Modified()) {
      gdSqlerrd1 = refreshGdSqlerrd1();
    }
    return gdSqlerrd1;
  }

  /**
   * Update GdSqlerrd1 with the passed value Corresponding COBOL Variable is GD-SQLERRD1
   *
   * @param number
   */
  public void setGdSqlerrd1(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlerrd1 = checkGdSqlerrd1MaxLimit(number);
    serializeGdSqlerrd1(gdSqlerrd1);
  }

  public void setGdSqlerrd1(long number) {
    number = checkGdSqlerrd1MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSqlerrd1((int) number);
  }

  /**
   * Returns the value of gdSqlerrd2
   *
   * @return gdSqlerrd2
   */
  public int getGdSqlerrd2() throws CFException {
    if (isGdSqlerrd2Modified()) {
      gdSqlerrd2 = refreshGdSqlerrd2();
    }
    return gdSqlerrd2;
  }

  /**
   * Update GdSqlerrd2 with the passed value Corresponding COBOL Variable is GD-SQLERRD2
   *
   * @param number
   */
  public void setGdSqlerrd2(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlerrd2 = checkGdSqlerrd2MaxLimit(number);
    serializeGdSqlerrd2(gdSqlerrd2);
  }

  public void setGdSqlerrd2(long number) {
    number = checkGdSqlerrd2MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSqlerrd2((int) number);
  }

  /**
   * Returns the value of gdSqlerrd3
   *
   * @return gdSqlerrd3
   */
  public int getGdSqlerrd3() throws CFException {
    if (isGdSqlerrd3Modified()) {
      gdSqlerrd3 = refreshGdSqlerrd3();
    }
    return gdSqlerrd3;
  }

  /**
   * Update GdSqlerrd3 with the passed value Corresponding COBOL Variable is GD-SQLERRD3
   *
   * @param number
   */
  public void setGdSqlerrd3(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlerrd3 = checkGdSqlerrd3MaxLimit(number);
    serializeGdSqlerrd3(gdSqlerrd3);
  }

  public void setGdSqlerrd3(long number) {
    number = checkGdSqlerrd3MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSqlerrd3((int) number);
  }

  /**
   * Returns the value of gdSqlerrd4
   *
   * @return gdSqlerrd4
   */
  public int getGdSqlerrd4() throws CFException {
    if (isGdSqlerrd4Modified()) {
      gdSqlerrd4 = refreshGdSqlerrd4();
    }
    return gdSqlerrd4;
  }

  /**
   * Update GdSqlerrd4 with the passed value Corresponding COBOL Variable is GD-SQLERRD4
   *
   * @param number
   */
  public void setGdSqlerrd4(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlerrd4 = checkGdSqlerrd4MaxLimit(number);
    serializeGdSqlerrd4(gdSqlerrd4);
  }

  public void setGdSqlerrd4(long number) {
    number = checkGdSqlerrd4MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSqlerrd4((int) number);
  }

  /**
   * Returns the value of gdSqlerrd5
   *
   * @return gdSqlerrd5
   */
  public int getGdSqlerrd5() throws CFException {
    if (isGdSqlerrd5Modified()) {
      gdSqlerrd5 = refreshGdSqlerrd5();
    }
    return gdSqlerrd5;
  }

  /**
   * Update GdSqlerrd5 with the passed value Corresponding COBOL Variable is GD-SQLERRD5
   *
   * @param number
   */
  public void setGdSqlerrd5(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlerrd5 = checkGdSqlerrd5MaxLimit(number);
    serializeGdSqlerrd5(gdSqlerrd5);
  }

  public void setGdSqlerrd5(long number) {
    number = checkGdSqlerrd5MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSqlerrd5((int) number);
  }

  /**
   * Returns the value of gdSqlerrd6
   *
   * @return gdSqlerrd6
   */
  public int getGdSqlerrd6() throws CFException {
    if (isGdSqlerrd6Modified()) {
      gdSqlerrd6 = refreshGdSqlerrd6();
    }
    return gdSqlerrd6;
  }

  /**
   * Update GdSqlerrd6 with the passed value Corresponding COBOL Variable is GD-SQLERRD6
   *
   * @param number
   */
  public void setGdSqlerrd6(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlerrd6 = checkGdSqlerrd6MaxLimit(number);
    serializeGdSqlerrd6(gdSqlerrd6);
  }

  public void setGdSqlerrd6(long number) {
    number = checkGdSqlerrd6MaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSqlerrd6((int) number);
  }

  /**
   * Returns the value of gdTokenCount
   *
   * @return gdTokenCount
   */
  public int getGdTokenCount() throws CFException {
    if (isGdTokenCountModified()) {
      gdTokenCount = refreshGdTokenCount();
    }
    return gdTokenCount;
  }

  /**
   * Update GdTokenCount with the passed value Corresponding COBOL Variable is GD-TOKEN-COUNT
   *
   * @param number
   */
  public void setGdTokenCount(int number) {
    // Truncate if the number is beyond +/- Max range
    gdTokenCount = checkGdTokenCountMaxLimit(number);
    serializeGdTokenCount(gdTokenCount);
  }

  public void setGdTokenCount(long number) {
    number = checkGdTokenCountMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdTokenCount((int) number);
  }

  /**
   * Returns the value of gdMessageText
   *
   * @return gdMessageText
   */
  public GdMessageText getGdMessageText() {
    return gdMessageText;
  }
  /**
   * Update GdMessageText with the passed value Corresponding COBOL Variable is GD-MESSAGE-TEXT
   *
   * @param value
   */
  public void setGdMessageText(char[] value) {
    gdMessageText.setString(value);
  }

  /**
   * Update GdMessageText with a String from an offset and length
   *
   * @param value
   */
  public void setGdMessageText(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdMessageText.begin, gdMessageText.length());
  }

  /**
   * Update GdMessageText with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMessageText(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdMessageText.begin + targetIndex, targetLen);
  }

  /**
   * Update GdMessageText with another Field
   *
   * @param value
   */
  public void setGdMessageText(Field source) {
    replace(source, 0, source.length(), gdMessageText.begin, gdMessageText.length());
  }

  /**
   * Update GdMessageText with another Field from an offset and length
   *
   * @param value
   */
  public void setGdMessageText(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdMessageText.begin, gdMessageText.length());
  }

  /**
   * Update GdMessageText with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMessageText(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdMessageText.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdReturnedSqlstate
   *
   * @return gdReturnedSqlstate
   */
  public char[] getGdReturnedSqlstate() throws CFException {
    if (isGdReturnedSqlstateModified()) {
      gdReturnedSqlstate = refreshGdReturnedSqlstate();
    }
    return gdReturnedSqlstate;
  }

  /**
   * set variable gdReturnedSqlstate Corresponding COBOL Variable is GD-RETURNED-SQLSTATE
   *
   * @param value
   */
  public void setGdReturnedSqlstate(char[] value) {
    gdReturnedSqlstate = checkGdReturnedSqlstateConstraints(value);
    serializeGdReturnedSqlstate(gdReturnedSqlstate);
  }

  /**
   * Update GdReturnedSqlstate with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdReturnedSqlstate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdReturnedSqlstate, gdReturnedSqlstate.length);
  }

  public void setGdReturnedSqlstate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdReturnedSqlstate, gdReturnedSqlstate.length);
  }

  /**
   * Update GdReturnedSqlstate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdReturnedSqlstate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdReturnedSqlstate + targetIndex, targetLen);
  }

  /**
   * Update GdReturnedSqlstate with another Field
   *
   * @param value
   */
  public void setGdReturnedSqlstate(Field source) {
    replace(source, 0, source.length(), beginGdReturnedSqlstate, GD_RETURNED_SQLSTATE_LEN);
  }

  /**
   * Update GdReturnedSqlstate with another Field from an offset and length
   *
   * @param value
   */
  public void setGdReturnedSqlstate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdReturnedSqlstate, GD_RETURNED_SQLSTATE_LEN);
  }

  /**
   * Update GdReturnedSqlstate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdReturnedSqlstate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdReturnedSqlstate + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdServerName
   *
   * @return gdServerName
   */
  public GdServerName getGdServerName() {
    return gdServerName;
  }
  /**
   * Update GdServerName with the passed value Corresponding COBOL Variable is GD-SERVER-NAME
   *
   * @param value
   */
  public void setGdServerName(char[] value) {
    gdServerName.setString(value);
  }

  /**
   * Update GdServerName with a String from an offset and length
   *
   * @param value
   */
  public void setGdServerName(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdServerName.begin, gdServerName.length());
  }

  /**
   * Update GdServerName with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdServerName(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdServerName.begin + targetIndex, targetLen);
  }

  /**
   * Update GdServerName with another Field
   *
   * @param value
   */
  public void setGdServerName(Field source) {
    replace(source, 0, source.length(), gdServerName.begin, gdServerName.length());
  }

  /**
   * Update GdServerName with another Field from an offset and length
   *
   * @param value
   */
  public void setGdServerName(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdServerName.begin, gdServerName.length());
  }

  /**
   * Update GdServerName with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdServerName(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdServerName.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdAuthType
   *
   * @return gdAuthType
   */
  public char[] getGdAuthType() throws CFException {
    if (isGdAuthTypeModified()) {
      gdAuthType = refreshGdAuthType();
    }
    return gdAuthType;
  }

  /**
   * set variable gdAuthType Corresponding COBOL Variable is GD-AUTH-TYPE
   *
   * @param value
   */
  public void setGdAuthType(char[] value) {
    gdAuthType = checkGdAuthTypeConstraints(value);
    serializeGdAuthType(gdAuthType);
  }

  /**
   * Update GdAuthType with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdAuthType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdAuthType, gdAuthType.length);
  }

  public void setGdAuthType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthType, gdAuthType.length);
  }

  /**
   * Update GdAuthType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdAuthType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthType + targetIndex, targetLen);
  }

  /**
   * Update GdAuthType with another Field
   *
   * @param value
   */
  public void setGdAuthType(Field source) {
    replace(source, 0, source.length(), beginGdAuthType, GD_AUTH_TYPE_LEN);
  }

  /**
   * Update GdAuthType with another Field from an offset and length
   *
   * @param value
   */
  public void setGdAuthType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthType, GD_AUTH_TYPE_LEN);
  }

  /**
   * Update GdAuthType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdAuthType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthType + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdAuthId
   *
   * @return gdAuthId
   */
  public GdAuthId getGdAuthId() {
    return gdAuthId;
  }
  /**
   * Update GdAuthId with the passed value Corresponding COBOL Variable is GD-AUTH-ID
   *
   * @param value
   */
  public void setGdAuthId(char[] value) {
    gdAuthId.setString(value);
  }

  /**
   * Update GdAuthId with a String from an offset and length
   *
   * @param value
   */
  public void setGdAuthId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdAuthId.begin, gdAuthId.length());
  }

  /**
   * Update GdAuthId with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdAuthId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdAuthId.begin + targetIndex, targetLen);
  }

  /**
   * Update GdAuthId with another Field
   *
   * @param value
   */
  public void setGdAuthId(Field source) {
    replace(source, 0, source.length(), gdAuthId.begin, gdAuthId.length());
  }

  /**
   * Update GdAuthId with another Field from an offset and length
   *
   * @param value
   */
  public void setGdAuthId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdAuthId.begin, gdAuthId.length());
  }

  /**
   * Update GdAuthId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdAuthId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdAuthId.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdConnState
   *
   * @return gdConnState
   */
  public int getGdConnState() throws CFException {
    if (isGdConnStateModified()) {
      gdConnState = refreshGdConnState();
    }
    return gdConnState;
  }

  /**
   * Update GdConnState with the passed value Corresponding COBOL Variable is GD-CONN-STATE
   *
   * @param number
   */
  public void setGdConnState(int number) {
    // Truncate if the number is beyond +/- Max range
    gdConnState = checkGdConnStateMaxLimit(number);
    serializeGdConnState(gdConnState);
  }

  public void setGdConnState(long number) {
    number = checkGdConnStateMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdConnState((int) number);
  }

  /**
   * Returns the value of gdConnStatus
   *
   * @return gdConnStatus
   */
  public int getGdConnStatus() throws CFException {
    if (isGdConnStatusModified()) {
      gdConnStatus = refreshGdConnStatus();
    }
    return gdConnStatus;
  }

  /**
   * Update GdConnStatus with the passed value Corresponding COBOL Variable is GD-CONN-STATUS
   *
   * @param number
   */
  public void setGdConnStatus(int number) {
    // Truncate if the number is beyond +/- Max range
    gdConnStatus = checkGdConnStatusMaxLimit(number);
    serializeGdConnStatus(gdConnStatus);
  }

  public void setGdConnStatus(long number) {
    number = checkGdConnStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdConnStatus((int) number);
  }

  /**
   * Returns the value of gdEncryptType
   *
   * @return gdEncryptType
   */
  public char[] getGdEncryptType() throws CFException {
    if (isGdEncryptTypeModified()) {
      gdEncryptType = refreshGdEncryptType();
    }
    return gdEncryptType;
  }

  /**
   * set variable gdEncryptType Corresponding COBOL Variable is GD-ENCRYPT-TYPE
   *
   * @param value
   */
  public void setGdEncryptType(char[] value) {
    gdEncryptType = checkGdEncryptTypeConstraints(value);
    serializeGdEncryptType(gdEncryptType);
  }

  /**
   * Update GdEncryptType with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdEncryptType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdEncryptType, gdEncryptType.length);
  }

  public void setGdEncryptType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEncryptType, gdEncryptType.length);
  }

  /**
   * Update GdEncryptType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEncryptType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEncryptType + targetIndex, targetLen);
  }

  /**
   * Update GdEncryptType with another Field
   *
   * @param value
   */
  public void setGdEncryptType(Field source) {
    replace(source, 0, source.length(), beginGdEncryptType, GD_ENCRYPT_TYPE_LEN);
  }

  /**
   * Update GdEncryptType with another Field from an offset and length
   *
   * @param value
   */
  public void setGdEncryptType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEncryptType, GD_ENCRYPT_TYPE_LEN);
  }

  /**
   * Update GdEncryptType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEncryptType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEncryptType + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdProdId
   *
   * @return gdProdId
   */
  public GdProdId getGdProdId() {
    return gdProdId;
  }
  /**
   * Update GdProdId with the passed value Corresponding COBOL Variable is GD-PROD-ID
   *
   * @param value
   */
  public void setGdProdId(char[] value) {
    gdProdId.setString(value);
  }

  /**
   * Update GdProdId with a String from an offset and length
   *
   * @param value
   */
  public void setGdProdId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdProdId.begin, gdProdId.length());
  }

  /**
   * Update GdProdId with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdProdId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdProdId.begin + targetIndex, targetLen);
  }

  /**
   * Update GdProdId with another Field
   *
   * @param value
   */
  public void setGdProdId(Field source) {
    replace(source, 0, source.length(), gdProdId.begin, gdProdId.length());
  }

  /**
   * Update GdProdId with another Field from an offset and length
   *
   * @param value
   */
  public void setGdProdId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, gdProdId.begin, gdProdId.length());
  }

  /**
   * Update GdProdId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdProdId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, gdProdId.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdServerClass
   *
   * @return gdServerClass
   */
  public char[] getGdServerClass() throws CFException {
    if (isGdServerClassModified()) {
      gdServerClass = refreshGdServerClass();
    }
    return gdServerClass;
  }

  /**
   * set variable gdServerClass Corresponding COBOL Variable is GD-SERVER-CLASS
   *
   * @param value
   */
  public void setGdServerClass(char[] value) {
    gdServerClass = checkGdServerClassConstraints(value);
    serializeGdServerClass(gdServerClass);
  }

  /**
   * Update GdServerClass with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdServerClass(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdServerClass, gdServerClass.length);
  }

  public void setGdServerClass(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerClass, gdServerClass.length);
  }

  /**
   * Update GdServerClass with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdServerClass(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerClass + targetIndex, targetLen);
  }

  /**
   * Update GdServerClass with another Field
   *
   * @param value
   */
  public void setGdServerClass(Field source) {
    replace(source, 0, source.length(), beginGdServerClass, GD_SERVER_CLASS_LEN);
  }

  /**
   * Update GdServerClass with another Field from an offset and length
   *
   * @param value
   */
  public void setGdServerClass(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerClass, GD_SERVER_CLASS_LEN);
  }

  /**
   * Update GdServerClass with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdServerClass(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerClass + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdLastRow
   *
   * @return gdLastRow
   */
  public int getGdLastRow() throws CFException {
    if (isGdLastRowModified()) {
      gdLastRow = refreshGdLastRow();
    }
    return gdLastRow;
  }

  /**
   * Update GdLastRow with the passed value Corresponding COBOL Variable is GD-LAST-ROW
   *
   * @param number
   */
  public void setGdLastRow(int number) {
    // Truncate if the number is beyond +/- Max range
    gdLastRow = checkGdLastRowMaxLimit(number);
    serializeGdLastRow(gdLastRow);
  }

  public void setGdLastRow(long number) {
    number = checkGdLastRowMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdLastRow((int) number);
  }

  /**
   * Returns the value of gdNumberMarkers
   *
   * @return gdNumberMarkers
   */
  public int getGdNumberMarkers() throws CFException {
    if (isGdNumberMarkersModified()) {
      gdNumberMarkers = refreshGdNumberMarkers();
    }
    return gdNumberMarkers;
  }

  /**
   * Update GdNumberMarkers with the passed value Corresponding COBOL Variable is GD-NUMBER-MARKERS
   *
   * @param number
   */
  public void setGdNumberMarkers(int number) {
    // Truncate if the number is beyond +/- Max range
    gdNumberMarkers = checkGdNumberMarkersMaxLimit(number);
    serializeGdNumberMarkers(gdNumberMarkers);
  }

  public void setGdNumberMarkers(long number) {
    number = checkGdNumberMarkersMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdNumberMarkers((int) number);
  }

  /**
   * Returns the value of gdNumberSets
   *
   * @return gdNumberSets
   */
  public int getGdNumberSets() throws CFException {
    if (isGdNumberSetsModified()) {
      gdNumberSets = refreshGdNumberSets();
    }
    return gdNumberSets;
  }

  /**
   * Update GdNumberSets with the passed value Corresponding COBOL Variable is GD-NUMBER-SETS
   *
   * @param number
   */
  public void setGdNumberSets(int number) {
    // Truncate if the number is beyond +/- Max range
    gdNumberSets = checkGdNumberSetsMaxLimit(number);
    serializeGdNumberSets(gdNumberSets);
  }

  public void setGdNumberSets(long number) {
    number = checkGdNumberSetsMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdNumberSets((int) number);
  }

  public long getGdNumberRows() throws CFException {
    if (isGdNumberRowsModified()) {
      gdNumberRows = refreshGdNumberRows();
    }
    return gdNumberRows;
  }

  /**
   * Update GdNumberRows with the passed value Corresponding COBOL Variable is GD-NUMBER-ROWS
   *
   * @param number
   */
  public void setGdNumberRows(long number) {
    gdNumberRows = checkGdNumberRowsMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeGdNumberRows(gdNumberRows);
  }

  /**
   * Returns the value of gdReturnStatus
   *
   * @return gdReturnStatus
   */
  public int getGdReturnStatus() throws CFException {
    if (isGdReturnStatusModified()) {
      gdReturnStatus = refreshGdReturnStatus();
    }
    return gdReturnStatus;
  }

  /**
   * Update GdReturnStatus with the passed value Corresponding COBOL Variable is GD-RETURN-STATUS
   *
   * @param number
   */
  public void setGdReturnStatus(int number) {
    // Truncate if the number is beyond +/- Max range
    gdReturnStatus = checkGdReturnStatusMaxLimit(number);
    serializeGdReturnStatus(gdReturnStatus);
  }

  public void setGdReturnStatus(long number) {
    number = checkGdReturnStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdReturnStatus((int) number);
  }

  /**
   * Returns the value of gdCursorHold
   *
   * @return gdCursorHold
   */
  public char[] getGdCursorHold() throws CFException {
    if (isGdCursorHoldModified()) {
      gdCursorHold = refreshGdCursorHold();
    }
    return gdCursorHold;
  }

  /**
   * set variable gdCursorHold Corresponding COBOL Variable is GD-CURSOR-HOLD
   *
   * @param value
   */
  public void setGdCursorHold(char[] value) {
    gdCursorHold = checkGdCursorHoldConstraints(value);
    serializeGdCursorHold(gdCursorHold);
  }

  /**
   * Update GdCursorHold with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCursorHold(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCursorHold, gdCursorHold.length);
  }

  public void setGdCursorHold(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorHold, gdCursorHold.length);
  }

  /**
   * Update GdCursorHold with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorHold(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorHold + targetIndex, targetLen);
  }

  /**
   * Update GdCursorHold with another Field
   *
   * @param value
   */
  public void setGdCursorHold(Field source) {
    replace(source, 0, source.length(), beginGdCursorHold, GD_CURSOR_HOLD_LEN);
  }

  /**
   * Update GdCursorHold with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCursorHold(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorHold, GD_CURSOR_HOLD_LEN);
  }

  /**
   * Update GdCursorHold with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorHold(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorHold + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCursorRowset
   *
   * @return gdCursorRowset
   */
  public char[] getGdCursorRowset() throws CFException {
    if (isGdCursorRowsetModified()) {
      gdCursorRowset = refreshGdCursorRowset();
    }
    return gdCursorRowset;
  }

  /**
   * set variable gdCursorRowset Corresponding COBOL Variable is GD-CURSOR-ROWSET
   *
   * @param value
   */
  public void setGdCursorRowset(char[] value) {
    gdCursorRowset = checkGdCursorRowsetConstraints(value);
    serializeGdCursorRowset(gdCursorRowset);
  }

  /**
   * Update GdCursorRowset with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCursorRowset(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCursorRowset, gdCursorRowset.length);
  }

  public void setGdCursorRowset(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorRowset, gdCursorRowset.length);
  }

  /**
   * Update GdCursorRowset with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorRowset(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorRowset + targetIndex, targetLen);
  }

  /**
   * Update GdCursorRowset with another Field
   *
   * @param value
   */
  public void setGdCursorRowset(Field source) {
    replace(source, 0, source.length(), beginGdCursorRowset, GD_CURSOR_ROWSET_LEN);
  }

  /**
   * Update GdCursorRowset with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCursorRowset(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorRowset, GD_CURSOR_ROWSET_LEN);
  }

  /**
   * Update GdCursorRowset with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorRowset(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorRowset + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCursorScrollable
   *
   * @return gdCursorScrollable
   */
  public char[] getGdCursorScrollable() throws CFException {
    if (isGdCursorScrollableModified()) {
      gdCursorScrollable = refreshGdCursorScrollable();
    }
    return gdCursorScrollable;
  }

  /**
   * set variable gdCursorScrollable Corresponding COBOL Variable is GD-CURSOR-SCROLLABLE
   *
   * @param value
   */
  public void setGdCursorScrollable(char[] value) {
    gdCursorScrollable = checkGdCursorScrollableConstraints(value);
    serializeGdCursorScrollable(gdCursorScrollable);
  }

  /**
   * Update GdCursorScrollable with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCursorScrollable(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCursorScrollable, gdCursorScrollable.length);
  }

  public void setGdCursorScrollable(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorScrollable, gdCursorScrollable.length);
  }

  /**
   * Update GdCursorScrollable with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorScrollable(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorScrollable + targetIndex, targetLen);
  }

  /**
   * Update GdCursorScrollable with another Field
   *
   * @param value
   */
  public void setGdCursorScrollable(Field source) {
    replace(source, 0, source.length(), beginGdCursorScrollable, GD_CURSOR_SCROLLABLE_LEN);
  }

  /**
   * Update GdCursorScrollable with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCursorScrollable(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorScrollable, GD_CURSOR_SCROLLABLE_LEN);
  }

  /**
   * Update GdCursorScrollable with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorScrollable(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorScrollable + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCursorSensitivity
   *
   * @return gdCursorSensitivity
   */
  public char[] getGdCursorSensitivity() throws CFException {
    if (isGdCursorSensitivityModified()) {
      gdCursorSensitivity = refreshGdCursorSensitivity();
    }
    return gdCursorSensitivity;
  }

  /**
   * set variable gdCursorSensitivity Corresponding COBOL Variable is GD-CURSOR-SENSITIVITY
   *
   * @param value
   */
  public void setGdCursorSensitivity(char[] value) {
    gdCursorSensitivity = checkGdCursorSensitivityConstraints(value);
    serializeGdCursorSensitivity(gdCursorSensitivity);
  }

  /**
   * Update GdCursorSensitivity with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCursorSensitivity(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginGdCursorSensitivity, gdCursorSensitivity.length);
  }

  public void setGdCursorSensitivity(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorSensitivity, gdCursorSensitivity.length);
  }

  /**
   * Update GdCursorSensitivity with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorSensitivity(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorSensitivity + targetIndex, targetLen);
  }

  /**
   * Update GdCursorSensitivity with another Field
   *
   * @param value
   */
  public void setGdCursorSensitivity(Field source) {
    replace(source, 0, source.length(), beginGdCursorSensitivity, GD_CURSOR_SENSITIVITY_LEN);
  }

  /**
   * Update GdCursorSensitivity with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCursorSensitivity(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorSensitivity, GD_CURSOR_SENSITIVITY_LEN);
  }

  /**
   * Update GdCursorSensitivity with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorSensitivity(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorSensitivity + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdCursorType
   *
   * @return gdCursorType
   */
  public char[] getGdCursorType() throws CFException {
    if (isGdCursorTypeModified()) {
      gdCursorType = refreshGdCursorType();
    }
    return gdCursorType;
  }

  /**
   * set variable gdCursorType Corresponding COBOL Variable is GD-CURSOR-TYPE
   *
   * @param value
   */
  public void setGdCursorType(char[] value) {
    gdCursorType = checkGdCursorTypeConstraints(value);
    serializeGdCursorType(gdCursorType);
  }

  /**
   * Update GdCursorType with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCursorType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCursorType, gdCursorType.length);
  }

  public void setGdCursorType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorType, gdCursorType.length);
  }

  /**
   * Update GdCursorType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorType + targetIndex, targetLen);
  }

  /**
   * Update GdCursorType with another Field
   *
   * @param value
   */
  public void setGdCursorType(Field source) {
    replace(source, 0, source.length(), beginGdCursorType, GD_CURSOR_TYPE_LEN);
  }

  /**
   * Update GdCursorType with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCursorType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorType, GD_CURSOR_TYPE_LEN);
  }

  /**
   * Update GdCursorType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorType + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdMore
   *
   * @return gdMore
   */
  public char[] getGdMore() throws CFException {
    if (isGdMoreModified()) {
      gdMore = refreshGdMore();
    }
    return gdMore;
  }

  /**
   * set variable gdMore Corresponding COBOL Variable is GD-MORE
   *
   * @param value
   */
  public void setGdMore(char[] value) {
    gdMore = checkGdMoreConstraints(value);
    serializeGdMore(gdMore);
  }

  /**
   * Update GdMore with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdMore(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdMore, gdMore.length);
  }

  public void setGdMore(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdMore, gdMore.length);
  }

  /**
   * Update GdMore with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMore(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdMore + targetIndex, targetLen);
  }

  /**
   * Update GdMore with another Field
   *
   * @param value
   */
  public void setGdMore(Field source) {
    replace(source, 0, source.length(), beginGdMore, GD_MORE_LEN);
  }

  /**
   * Update GdMore with another Field from an offset and length
   *
   * @param value
   */
  public void setGdMore(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdMore, GD_MORE_LEN);
  }

  /**
   * Update GdMore with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMore(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdMore + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdNumber
   *
   * @return gdNumber
   */
  public int getGdNumber() throws CFException {
    if (isGdNumberModified()) {
      gdNumber = refreshGdNumber();
    }
    return gdNumber;
  }

  /**
   * Update GdNumber with the passed value Corresponding COBOL Variable is GD-NUMBER
   *
   * @param number
   */
  public void setGdNumber(int number) {
    // Truncate if the number is beyond +/- Max range
    gdNumber = checkGdNumberMaxLimit(number);
    serializeGdNumber(gdNumber);
  }

  public void setGdNumber(long number) {
    number = checkGdNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdNumber((int) number);
  }

  public long getGdRowCount() throws CFException {
    if (isGdRowCountModified()) {
      gdRowCount = refreshGdRowCount();
    }
    return gdRowCount;
  }

  /**
   * Update GdRowCount with the passed value Corresponding COBOL Variable is GD-ROW-COUNT
   *
   * @param number
   */
  public void setGdRowCount(long number) {
    gdRowCount = checkGdRowCountMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeGdRowCount(gdRowCount);
  }

  public static int getGdGetDiagAreaFieldLength() {
    return GD_GET_DIAG_AREA_LENGTH;
  }
}
