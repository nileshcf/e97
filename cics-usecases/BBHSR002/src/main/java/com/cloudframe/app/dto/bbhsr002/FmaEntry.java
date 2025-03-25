package com.cloudframe.app.dto.bbhsr002;

/**
 * The class FmaEntry is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FmaEntry extends FmaEntrySerialized {

  private short fmaErrCode1;

  private char[] fmaType1 = Field.fillLowValue(1);

  private int fmaTypeNumeric1;

  private BigDecimal fmaTypeDollars1 = BigDecimal.ZERO;

  private char[] fmaTypeAlpha1 = Field.fillLowValue(4);

  private short fmaErrCode2;

  private char[] fmaType2 = Field.fillLowValue(1);

  private int fmaTypeNumeric2;

  private BigDecimal fmaTypeDollars2 = BigDecimal.ZERO;

  private char[] fmaTypeAlpha2 = Field.fillLowValue(4);

  /** Constructor for FmaEntry */
  public FmaEntry() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaEntry. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaEntry(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of fmaErrCode1
   *
   * @return fmaErrCode1
   */
  public short getFmaErrCode1() throws CFException {
    if (isFmaErrCode1Modified()) {
      fmaErrCode1 = refreshFmaErrCode1();
    }
    return fmaErrCode1;
  }

  /**
   * Returns the String value of fmaErrCode1
   *
   * @return fmaErrCode1
   */
  public char[] getFmaErrCode1ActualString() {
    String value = String.valueOf(fmaErrCode1).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaErrCode1 with the passed value Corresponding COBOL Variable is FMA-ERR-CODE-1
   *
   * @param number
   */
  public void setFmaErrCode1(short number) {
    // Truncate if the number is beyond +/- Max range
    fmaErrCode1 = checkFmaErrCode1MaxLimit(number);
    serializeFmaErrCode1(fmaErrCode1);
  }

  public void setFmaErrCode1(int number) {
    number = checkFmaErrCode1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaErrCode1((short) number);
  }

  public void setFmaErrCode1(long number) {
    number = checkFmaErrCode1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaErrCode1((short) number);
  }

  /**
   * Update FmaErrCode1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaErrCode1(char[] value) throws CFException {
    fmaErrCode1 = serializeFmaErrCode1(value);
  }
  /**
   * Update FmaErrCode1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaErrCode1String(char[] value) throws CFException {
    setFmaErrCode1(value);
  }
  /**
   * Returns the value of fmaType1
   *
   * @return fmaType1
   */
  public char[] getFmaType1() throws CFException {
    if (isFmaType1Modified()) {
      fmaType1 = refreshFmaType1();
    }
    return fmaType1;
  }

  /**
   * set variable fmaType1 Corresponding COBOL Variable is FMA-TYPE-1
   *
   * @param value
   */
  public void setFmaType1(char[] value) {
    fmaType1 = checkFmaType1Constraints(value);
    serializeFmaType1(fmaType1);
  }

  /**
   * Update FmaType1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaType1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaType1, fmaType1.length);
  }

  public void setFmaType1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType1, fmaType1.length);
  }

  /**
   * Update FmaType1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaType1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType1 + targetIndex, targetLen);
  }

  /**
   * Update FmaType1 with another Field
   *
   * @param value
   */
  public void setFmaType1(Field source) {
    replace(source, 0, source.length(), beginFmaType1, FMA_TYPE_1_LEN);
  }

  /**
   * Update FmaType1 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaType1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType1, FMA_TYPE_1_LEN);
  }

  /**
   * Update FmaType1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaType1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType1 + targetIndex, targetLen);
  }
  /**
   * Returns the value of fmaTypeNumeric1
   *
   * @return fmaTypeNumeric1
   */
  public int getFmaTypeNumeric1() throws CFException {
    if (isFmaTypeNumeric1Modified()) {
      fmaTypeNumeric1 = refreshFmaTypeNumeric1();
    }
    return fmaTypeNumeric1;
  }

  /**
   * Returns the String value of fmaTypeNumeric1
   *
   * @return fmaTypeNumeric1
   */
  public char[] getFmaTypeNumeric1ActualString() {
    String value = String.valueOf(fmaTypeNumeric1).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaTypeNumeric1 with the passed value Corresponding COBOL Variable is FMA-TYPE-NUMERIC-1
   *
   * @param number
   */
  public void setFmaTypeNumeric1(int number) {
    // Truncate if the number is beyond +/- Max range
    fmaTypeNumeric1 = checkFmaTypeNumeric1MaxLimit(number);
    serializeFmaTypeNumeric1(fmaTypeNumeric1);
  }

  public void setFmaTypeNumeric1(long number) {
    number = checkFmaTypeNumeric1MaxLimit(number); // Truncate if value is beyond +/- Max range
    setFmaTypeNumeric1((int) number);
  }

  /**
   * Update FmaTypeNumeric1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaTypeNumeric1(char[] value) throws CFException {
    fmaTypeNumeric1 = serializeFmaTypeNumeric1(value);
  }
  /**
   * Update FmaTypeNumeric1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaTypeNumeric1String(char[] value) throws CFException {
    setFmaTypeNumeric1(value);
  }
  /**
   * Returns the value of fmaTypeDollars1
   *
   * @return fmaTypeDollars1
   */
  public BigDecimal getFmaTypeDollars1() throws CFException {
    if (isFmaTypeDollars1Modified()) {
      fmaTypeDollars1 = refreshFmaTypeDollars1();
    }
    return fmaTypeDollars1;
  }

  /**
   * Returns the String value of fmaTypeDollars1
   *
   * @return fmaTypeDollars1
   */
  public char[] getFmaTypeDollars1ActualString() {
    String value = String.valueOf(fmaTypeDollars1).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaTypeDollars1 with the passed number Corresponding COBOL Variable is
   * FMA-TYPE-DOLLARS-1
   *
   * @param number
   */
  public void setFmaTypeDollars1(BigDecimal number) {
    fmaTypeDollars1 = checkFmaTypeDollars1MaxLimit(number);
    serializeFmaTypeDollars1(fmaTypeDollars1);
  }
  /**
   * Update FmaTypeDollars1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaTypeDollars1(char[] value) throws CFException {
    fmaTypeDollars1 = serializeFmaTypeDollars1(value);
  }
  /**
   * Returns the value of fmaTypeAlpha1
   *
   * @return fmaTypeAlpha1
   */
  public char[] getFmaTypeAlpha1() throws CFException {
    if (isFmaTypeAlpha1Modified()) {
      fmaTypeAlpha1 = refreshFmaTypeAlpha1();
    }
    return fmaTypeAlpha1;
  }

  /**
   * set variable fmaTypeAlpha1 Corresponding COBOL Variable is FMA-TYPE-ALPHA-1
   *
   * @param value
   */
  public void setFmaTypeAlpha1(char[] value) {
    fmaTypeAlpha1 = checkFmaTypeAlpha1Constraints(value);
    serializeFmaTypeAlpha1(fmaTypeAlpha1);
  }

  /**
   * Update FmaTypeAlpha1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaTypeAlpha1, fmaTypeAlpha1.length);
  }

  public void setFmaTypeAlpha1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha1, fmaTypeAlpha1.length);
  }

  /**
   * Update FmaTypeAlpha1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha1 + targetIndex, targetLen);
  }

  /**
   * Update FmaTypeAlpha1 with another Field
   *
   * @param value
   */
  public void setFmaTypeAlpha1(Field source) {
    replace(source, 0, source.length(), beginFmaTypeAlpha1, FMA_TYPE_ALPHA_1_LEN);
  }

  /**
   * Update FmaTypeAlpha1 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha1, FMA_TYPE_ALPHA_1_LEN);
  }

  /**
   * Update FmaTypeAlpha1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha1 + targetIndex, targetLen);
  }
  /**
   * Returns the value of fmaErrCode2
   *
   * @return fmaErrCode2
   */
  public short getFmaErrCode2() throws CFException {
    if (isFmaErrCode2Modified()) {
      fmaErrCode2 = refreshFmaErrCode2();
    }
    return fmaErrCode2;
  }

  /**
   * Returns the String value of fmaErrCode2
   *
   * @return fmaErrCode2
   */
  public char[] getFmaErrCode2ActualString() {
    String value = String.valueOf(fmaErrCode2).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaErrCode2 with the passed value Corresponding COBOL Variable is FMA-ERR-CODE-2
   *
   * @param number
   */
  public void setFmaErrCode2(short number) {
    // Truncate if the number is beyond +/- Max range
    fmaErrCode2 = checkFmaErrCode2MaxLimit(number);
    serializeFmaErrCode2(fmaErrCode2);
  }

  public void setFmaErrCode2(int number) {
    number = checkFmaErrCode2MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaErrCode2((short) number);
  }

  public void setFmaErrCode2(long number) {
    number = checkFmaErrCode2MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaErrCode2((short) number);
  }

  /**
   * Update FmaErrCode2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaErrCode2(char[] value) throws CFException {
    fmaErrCode2 = serializeFmaErrCode2(value);
  }
  /**
   * Update FmaErrCode2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaErrCode2String(char[] value) throws CFException {
    setFmaErrCode2(value);
  }
  /**
   * Returns the value of fmaType2
   *
   * @return fmaType2
   */
  public char[] getFmaType2() throws CFException {
    if (isFmaType2Modified()) {
      fmaType2 = refreshFmaType2();
    }
    return fmaType2;
  }

  /**
   * set variable fmaType2 Corresponding COBOL Variable is FMA-TYPE-2
   *
   * @param value
   */
  public void setFmaType2(char[] value) {
    fmaType2 = checkFmaType2Constraints(value);
    serializeFmaType2(fmaType2);
  }

  /**
   * Update FmaType2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaType2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaType2, fmaType2.length);
  }

  public void setFmaType2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType2, fmaType2.length);
  }

  /**
   * Update FmaType2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaType2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType2 + targetIndex, targetLen);
  }

  /**
   * Update FmaType2 with another Field
   *
   * @param value
   */
  public void setFmaType2(Field source) {
    replace(source, 0, source.length(), beginFmaType2, FMA_TYPE_2_LEN);
  }

  /**
   * Update FmaType2 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaType2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType2, FMA_TYPE_2_LEN);
  }

  /**
   * Update FmaType2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaType2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaType2 + targetIndex, targetLen);
  }
  /**
   * Returns the value of fmaTypeNumeric2
   *
   * @return fmaTypeNumeric2
   */
  public int getFmaTypeNumeric2() throws CFException {
    if (isFmaTypeNumeric2Modified()) {
      fmaTypeNumeric2 = refreshFmaTypeNumeric2();
    }
    return fmaTypeNumeric2;
  }

  /**
   * Returns the String value of fmaTypeNumeric2
   *
   * @return fmaTypeNumeric2
   */
  public char[] getFmaTypeNumeric2ActualString() {
    String value = String.valueOf(fmaTypeNumeric2).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaTypeNumeric2 with the passed value Corresponding COBOL Variable is FMA-TYPE-NUMERIC-2
   *
   * @param number
   */
  public void setFmaTypeNumeric2(int number) {
    // Truncate if the number is beyond +/- Max range
    fmaTypeNumeric2 = checkFmaTypeNumeric2MaxLimit(number);
    serializeFmaTypeNumeric2(fmaTypeNumeric2);
  }

  public void setFmaTypeNumeric2(long number) {
    number = checkFmaTypeNumeric2MaxLimit(number); // Truncate if value is beyond +/- Max range
    setFmaTypeNumeric2((int) number);
  }

  /**
   * Update FmaTypeNumeric2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaTypeNumeric2(char[] value) throws CFException {
    fmaTypeNumeric2 = serializeFmaTypeNumeric2(value);
  }
  /**
   * Update FmaTypeNumeric2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaTypeNumeric2String(char[] value) throws CFException {
    setFmaTypeNumeric2(value);
  }
  /**
   * Returns the value of fmaTypeDollars2
   *
   * @return fmaTypeDollars2
   */
  public BigDecimal getFmaTypeDollars2() throws CFException {
    if (isFmaTypeDollars2Modified()) {
      fmaTypeDollars2 = refreshFmaTypeDollars2();
    }
    return fmaTypeDollars2;
  }

  /**
   * Returns the String value of fmaTypeDollars2
   *
   * @return fmaTypeDollars2
   */
  public char[] getFmaTypeDollars2ActualString() {
    String value = String.valueOf(fmaTypeDollars2).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaTypeDollars2 with the passed number Corresponding COBOL Variable is
   * FMA-TYPE-DOLLARS-2
   *
   * @param number
   */
  public void setFmaTypeDollars2(BigDecimal number) {
    fmaTypeDollars2 = checkFmaTypeDollars2MaxLimit(number);
    serializeFmaTypeDollars2(fmaTypeDollars2);
  }
  /**
   * Update FmaTypeDollars2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaTypeDollars2(char[] value) throws CFException {
    fmaTypeDollars2 = serializeFmaTypeDollars2(value);
  }
  /**
   * Returns the value of fmaTypeAlpha2
   *
   * @return fmaTypeAlpha2
   */
  public char[] getFmaTypeAlpha2() throws CFException {
    if (isFmaTypeAlpha2Modified()) {
      fmaTypeAlpha2 = refreshFmaTypeAlpha2();
    }
    return fmaTypeAlpha2;
  }

  /**
   * set variable fmaTypeAlpha2 Corresponding COBOL Variable is FMA-TYPE-ALPHA-2
   *
   * @param value
   */
  public void setFmaTypeAlpha2(char[] value) {
    fmaTypeAlpha2 = checkFmaTypeAlpha2Constraints(value);
    serializeFmaTypeAlpha2(fmaTypeAlpha2);
  }

  /**
   * Update FmaTypeAlpha2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaTypeAlpha2, fmaTypeAlpha2.length);
  }

  public void setFmaTypeAlpha2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha2, fmaTypeAlpha2.length);
  }

  /**
   * Update FmaTypeAlpha2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha2 + targetIndex, targetLen);
  }

  /**
   * Update FmaTypeAlpha2 with another Field
   *
   * @param value
   */
  public void setFmaTypeAlpha2(Field source) {
    replace(source, 0, source.length(), beginFmaTypeAlpha2, FMA_TYPE_ALPHA_2_LEN);
  }

  /**
   * Update FmaTypeAlpha2 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha2, FMA_TYPE_ALPHA_2_LEN);
  }

  /**
   * Update FmaTypeAlpha2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaTypeAlpha2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaTypeAlpha2 + targetIndex, targetLen);
  }

  /**
   * initializes FmaEntry String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setFmaErrCode1((short) 0);
    setFmaType1(CONSTANTS.SPACE);
    setFmaTypeNumeric1(0);
    setFmaTypeDollars1(BigDecimal.ZERO);
    setFmaTypeAlpha1(CONSTANTS.SPACE_4);
    setFmaErrCode2((short) 0);
    setFmaType2(CONSTANTS.SPACE);
    setFmaTypeNumeric2(0);
    setFmaTypeDollars2(BigDecimal.ZERO);
    setFmaTypeAlpha2(CONSTANTS.SPACE_4);
  }

  public static int getFmaEntryFieldLength() {
    return FMA_ENTRY_LENGTH;
  }
}
