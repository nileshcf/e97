package com.cloudframe.app.dto.bbhsr002;

/**
 * The class FmaIpEntry is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FmaIpEntry extends FmaIpEntrySerialized {

  private short fmaIpErrCode1;

  private char[] fmaIpType1 = Field.fillLowValue(1);

  private int fmaIpTypeNumeric1;

  private BigDecimal fmaIpTypeDollars1 = BigDecimal.ZERO;

  private char[] fmaIpTypeAlpha1 = Field.fillLowValue(4);

  private short fmaIpErrCode2;

  private char[] fmaIpType2 = Field.fillLowValue(1);

  private int fmaIpTypeNumeric2;

  private BigDecimal fmaIpTypeDollars2 = BigDecimal.ZERO;

  private char[] fmaIpTypeAlpha2 = Field.fillLowValue(4);

  /** Constructor for FmaIpEntry */
  public FmaIpEntry() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaIpEntry. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaIpEntry(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of fmaIpErrCode1
   *
   * @return fmaIpErrCode1
   */
  public short getFmaIpErrCode1() throws CFException {
    if (isFmaIpErrCode1Modified()) {
      fmaIpErrCode1 = refreshFmaIpErrCode1();
    }
    return fmaIpErrCode1;
  }

  /**
   * Returns the String value of fmaIpErrCode1
   *
   * @return fmaIpErrCode1
   */
  public char[] getFmaIpErrCode1ActualString() {
    String value = String.valueOf(fmaIpErrCode1).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaIpErrCode1 with the passed value Corresponding COBOL Variable is FMA-IP-ERR-CODE-1
   *
   * @param number
   */
  public void setFmaIpErrCode1(short number) {
    // Truncate if the number is beyond +/- Max range
    fmaIpErrCode1 = checkFmaIpErrCode1MaxLimit(number);
    serializeFmaIpErrCode1(fmaIpErrCode1);
  }

  public void setFmaIpErrCode1(int number) {
    number =
        checkFmaIpErrCode1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaIpErrCode1((short) number);
  }

  public void setFmaIpErrCode1(long number) {
    number =
        checkFmaIpErrCode1MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaIpErrCode1((short) number);
  }

  /**
   * Update FmaIpErrCode1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpErrCode1(char[] value) throws CFException {
    fmaIpErrCode1 = serializeFmaIpErrCode1(value);
  }
  /**
   * Update FmaIpErrCode1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpErrCode1String(char[] value) throws CFException {
    setFmaIpErrCode1(value);
  }
  /**
   * Returns the value of fmaIpType1
   *
   * @return fmaIpType1
   */
  public char[] getFmaIpType1() throws CFException {
    if (isFmaIpType1Modified()) {
      fmaIpType1 = refreshFmaIpType1();
    }
    return fmaIpType1;
  }

  /**
   * set variable fmaIpType1 Corresponding COBOL Variable is FMA-IP-TYPE-1
   *
   * @param value
   */
  public void setFmaIpType1(char[] value) {
    fmaIpType1 = checkFmaIpType1Constraints(value);
    serializeFmaIpType1(fmaIpType1);
  }

  /**
   * Update FmaIpType1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaIpType1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaIpType1, fmaIpType1.length);
  }

  public void setFmaIpType1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType1, fmaIpType1.length);
  }

  /**
   * Update FmaIpType1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpType1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType1 + targetIndex, targetLen);
  }

  /**
   * Update FmaIpType1 with another Field
   *
   * @param value
   */
  public void setFmaIpType1(Field source) {
    replace(source, 0, source.length(), beginFmaIpType1, FMA_IP_TYPE_1_LEN);
  }

  /**
   * Update FmaIpType1 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaIpType1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType1, FMA_IP_TYPE_1_LEN);
  }

  /**
   * Update FmaIpType1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpType1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType1 + targetIndex, targetLen);
  }

  char[] fmaTypeIsAlpha188Value = "A".toCharArray();
  /**
   * Test condition "A" for isFmaTypeIsAlpha1()
   *
   * @return Returns true if isFmaTypeIsAlpha1() is "A"
   */
  public boolean isFmaTypeIsAlpha1() throws CFException {
    return (compareChars(getFmaIpType1(), fmaTypeIsAlpha188Value) == 0);
  }

  /** set values "A" */
  public void setFmaTypeIsAlpha1True() {
    setFmaIpType1(fmaTypeIsAlpha188Value);
  }

  char[] fmaTypeIsNumeric188Value = "N".toCharArray();
  /**
   * Test condition "N" for isFmaTypeIsNumeric1()
   *
   * @return Returns true if isFmaTypeIsNumeric1() is "N"
   */
  public boolean isFmaTypeIsNumeric1() throws CFException {
    return (compareChars(getFmaIpType1(), fmaTypeIsNumeric188Value) == 0);
  }

  /** set values "N" */
  public void setFmaTypeIsNumeric1True() {
    setFmaIpType1(fmaTypeIsNumeric188Value);
  }

  char[] fmaTypeIsDollars188Value = "D".toCharArray();
  /**
   * Test condition "D" for isFmaTypeIsDollars1()
   *
   * @return Returns true if isFmaTypeIsDollars1() is "D"
   */
  public boolean isFmaTypeIsDollars1() throws CFException {
    return (compareChars(getFmaIpType1(), fmaTypeIsDollars188Value) == 0);
  }

  /** set values "D" */
  public void setFmaTypeIsDollars1True() {
    setFmaIpType1(fmaTypeIsDollars188Value);
  }

  char[] fmaTypeNotUsed188Value = " ".toCharArray();
  /**
   * Test condition " " for isFmaTypeNotUsed1()
   *
   * @return Returns true if isFmaTypeNotUsed1() is " "
   */
  public boolean isFmaTypeNotUsed1() throws CFException {
    return (compareChars(getFmaIpType1(), fmaTypeNotUsed188Value) == 0);
  }

  /** set values " " */
  public void setFmaTypeNotUsed1True() {
    setFmaIpType1(fmaTypeNotUsed188Value);
  }
  /**
   * Returns the value of fmaIpTypeNumeric1
   *
   * @return fmaIpTypeNumeric1
   */
  public int getFmaIpTypeNumeric1() throws CFException {
    if (isFmaIpTypeNumeric1Modified()) {
      fmaIpTypeNumeric1 = refreshFmaIpTypeNumeric1();
    }
    return fmaIpTypeNumeric1;
  }

  /**
   * Returns the String value of fmaIpTypeNumeric1
   *
   * @return fmaIpTypeNumeric1
   */
  public char[] getFmaIpTypeNumeric1ActualString() {
    String value = String.valueOf(fmaIpTypeNumeric1).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaIpTypeNumeric1 with the passed value Corresponding COBOL Variable is
   * FMA-IP-TYPE-NUMERIC-1
   *
   * @param number
   */
  public void setFmaIpTypeNumeric1(int number) {
    // Truncate if the number is beyond +/- Max range
    fmaIpTypeNumeric1 = checkFmaIpTypeNumeric1MaxLimit(number);
    serializeFmaIpTypeNumeric1(fmaIpTypeNumeric1);
  }

  public void setFmaIpTypeNumeric1(long number) {
    number = checkFmaIpTypeNumeric1MaxLimit(number); // Truncate if value is beyond +/- Max range
    setFmaIpTypeNumeric1((int) number);
  }

  /**
   * Update FmaIpTypeNumeric1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpTypeNumeric1(char[] value) throws CFException {
    fmaIpTypeNumeric1 = serializeFmaIpTypeNumeric1(value);
  }
  /**
   * Update FmaIpTypeNumeric1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpTypeNumeric1String(char[] value) throws CFException {
    setFmaIpTypeNumeric1(value);
  }
  /**
   * Returns the value of fmaIpTypeDollars1
   *
   * @return fmaIpTypeDollars1
   */
  public BigDecimal getFmaIpTypeDollars1() throws CFException {
    if (isFmaIpTypeDollars1Modified()) {
      fmaIpTypeDollars1 = refreshFmaIpTypeDollars1();
    }
    return fmaIpTypeDollars1;
  }

  /**
   * Returns the String value of fmaIpTypeDollars1
   *
   * @return fmaIpTypeDollars1
   */
  public char[] getFmaIpTypeDollars1ActualString() {
    String value = String.valueOf(fmaIpTypeDollars1).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaIpTypeDollars1 with the passed number Corresponding COBOL Variable is
   * FMA-IP-TYPE-DOLLARS-1
   *
   * @param number
   */
  public void setFmaIpTypeDollars1(BigDecimal number) {
    fmaIpTypeDollars1 = checkFmaIpTypeDollars1MaxLimit(number);
    serializeFmaIpTypeDollars1(fmaIpTypeDollars1);
  }
  /**
   * Update FmaIpTypeDollars1 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpTypeDollars1(char[] value) throws CFException {
    fmaIpTypeDollars1 = serializeFmaIpTypeDollars1(value);
  }
  /**
   * Returns the value of fmaIpTypeAlpha1
   *
   * @return fmaIpTypeAlpha1
   */
  public char[] getFmaIpTypeAlpha1() throws CFException {
    if (isFmaIpTypeAlpha1Modified()) {
      fmaIpTypeAlpha1 = refreshFmaIpTypeAlpha1();
    }
    return fmaIpTypeAlpha1;
  }

  /**
   * set variable fmaIpTypeAlpha1 Corresponding COBOL Variable is FMA-IP-TYPE-ALPHA-1
   *
   * @param value
   */
  public void setFmaIpTypeAlpha1(char[] value) {
    fmaIpTypeAlpha1 = checkFmaIpTypeAlpha1Constraints(value);
    serializeFmaIpTypeAlpha1(fmaIpTypeAlpha1);
  }

  /**
   * Update FmaIpTypeAlpha1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaIpTypeAlpha1, fmaIpTypeAlpha1.length);
  }

  public void setFmaIpTypeAlpha1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha1, fmaIpTypeAlpha1.length);
  }

  /**
   * Update FmaIpTypeAlpha1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha1 + targetIndex, targetLen);
  }

  /**
   * Update FmaIpTypeAlpha1 with another Field
   *
   * @param value
   */
  public void setFmaIpTypeAlpha1(Field source) {
    replace(source, 0, source.length(), beginFmaIpTypeAlpha1, FMA_IP_TYPE_ALPHA_1_LEN);
  }

  /**
   * Update FmaIpTypeAlpha1 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha1, FMA_IP_TYPE_ALPHA_1_LEN);
  }

  /**
   * Update FmaIpTypeAlpha1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha1 + targetIndex, targetLen);
  }
  /**
   * Returns the value of fmaIpErrCode2
   *
   * @return fmaIpErrCode2
   */
  public short getFmaIpErrCode2() throws CFException {
    if (isFmaIpErrCode2Modified()) {
      fmaIpErrCode2 = refreshFmaIpErrCode2();
    }
    return fmaIpErrCode2;
  }

  /**
   * Returns the String value of fmaIpErrCode2
   *
   * @return fmaIpErrCode2
   */
  public char[] getFmaIpErrCode2ActualString() {
    String value = String.valueOf(fmaIpErrCode2).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaIpErrCode2 with the passed value Corresponding COBOL Variable is FMA-IP-ERR-CODE-2
   *
   * @param number
   */
  public void setFmaIpErrCode2(short number) {
    // Truncate if the number is beyond +/- Max range
    fmaIpErrCode2 = checkFmaIpErrCode2MaxLimit(number);
    serializeFmaIpErrCode2(fmaIpErrCode2);
  }

  public void setFmaIpErrCode2(int number) {
    number =
        checkFmaIpErrCode2MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaIpErrCode2((short) number);
  }

  public void setFmaIpErrCode2(long number) {
    number =
        checkFmaIpErrCode2MaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaIpErrCode2((short) number);
  }

  /**
   * Update FmaIpErrCode2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpErrCode2(char[] value) throws CFException {
    fmaIpErrCode2 = serializeFmaIpErrCode2(value);
  }
  /**
   * Update FmaIpErrCode2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpErrCode2String(char[] value) throws CFException {
    setFmaIpErrCode2(value);
  }
  /**
   * Returns the value of fmaIpType2
   *
   * @return fmaIpType2
   */
  public char[] getFmaIpType2() throws CFException {
    if (isFmaIpType2Modified()) {
      fmaIpType2 = refreshFmaIpType2();
    }
    return fmaIpType2;
  }

  /**
   * set variable fmaIpType2 Corresponding COBOL Variable is FMA-IP-TYPE-2
   *
   * @param value
   */
  public void setFmaIpType2(char[] value) {
    fmaIpType2 = checkFmaIpType2Constraints(value);
    serializeFmaIpType2(fmaIpType2);
  }

  /**
   * Update FmaIpType2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaIpType2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaIpType2, fmaIpType2.length);
  }

  public void setFmaIpType2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType2, fmaIpType2.length);
  }

  /**
   * Update FmaIpType2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpType2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType2 + targetIndex, targetLen);
  }

  /**
   * Update FmaIpType2 with another Field
   *
   * @param value
   */
  public void setFmaIpType2(Field source) {
    replace(source, 0, source.length(), beginFmaIpType2, FMA_IP_TYPE_2_LEN);
  }

  /**
   * Update FmaIpType2 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaIpType2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType2, FMA_IP_TYPE_2_LEN);
  }

  /**
   * Update FmaIpType2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpType2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpType2 + targetIndex, targetLen);
  }

  char[] fmaTypeIsAlpha288Value = "A".toCharArray();
  /**
   * Test condition "A" for isFmaTypeIsAlpha2()
   *
   * @return Returns true if isFmaTypeIsAlpha2() is "A"
   */
  public boolean isFmaTypeIsAlpha2() throws CFException {
    return (compareChars(getFmaIpType2(), fmaTypeIsAlpha288Value) == 0);
  }

  /** set values "A" */
  public void setFmaTypeIsAlpha2True() {
    setFmaIpType2(fmaTypeIsAlpha288Value);
  }

  char[] fmaTypeIsNumeric288Value = "N".toCharArray();
  /**
   * Test condition "N" for isFmaTypeIsNumeric2()
   *
   * @return Returns true if isFmaTypeIsNumeric2() is "N"
   */
  public boolean isFmaTypeIsNumeric2() throws CFException {
    return (compareChars(getFmaIpType2(), fmaTypeIsNumeric288Value) == 0);
  }

  /** set values "N" */
  public void setFmaTypeIsNumeric2True() {
    setFmaIpType2(fmaTypeIsNumeric288Value);
  }

  char[] fmaTypeIsDollars288Value = "D".toCharArray();
  /**
   * Test condition "D" for isFmaTypeIsDollars2()
   *
   * @return Returns true if isFmaTypeIsDollars2() is "D"
   */
  public boolean isFmaTypeIsDollars2() throws CFException {
    return (compareChars(getFmaIpType2(), fmaTypeIsDollars288Value) == 0);
  }

  /** set values "D" */
  public void setFmaTypeIsDollars2True() {
    setFmaIpType2(fmaTypeIsDollars288Value);
  }

  char[] fmaTypeNotUsed288Value = " ".toCharArray();
  /**
   * Test condition " " for isFmaTypeNotUsed2()
   *
   * @return Returns true if isFmaTypeNotUsed2() is " "
   */
  public boolean isFmaTypeNotUsed2() throws CFException {
    return (compareChars(getFmaIpType2(), fmaTypeNotUsed288Value) == 0);
  }

  /** set values " " */
  public void setFmaTypeNotUsed2True() {
    setFmaIpType2(fmaTypeNotUsed288Value);
  }
  /**
   * Returns the value of fmaIpTypeNumeric2
   *
   * @return fmaIpTypeNumeric2
   */
  public int getFmaIpTypeNumeric2() throws CFException {
    if (isFmaIpTypeNumeric2Modified()) {
      fmaIpTypeNumeric2 = refreshFmaIpTypeNumeric2();
    }
    return fmaIpTypeNumeric2;
  }

  /**
   * Returns the String value of fmaIpTypeNumeric2
   *
   * @return fmaIpTypeNumeric2
   */
  public char[] getFmaIpTypeNumeric2ActualString() {
    String value = String.valueOf(fmaIpTypeNumeric2).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaIpTypeNumeric2 with the passed value Corresponding COBOL Variable is
   * FMA-IP-TYPE-NUMERIC-2
   *
   * @param number
   */
  public void setFmaIpTypeNumeric2(int number) {
    // Truncate if the number is beyond +/- Max range
    fmaIpTypeNumeric2 = checkFmaIpTypeNumeric2MaxLimit(number);
    serializeFmaIpTypeNumeric2(fmaIpTypeNumeric2);
  }

  public void setFmaIpTypeNumeric2(long number) {
    number = checkFmaIpTypeNumeric2MaxLimit(number); // Truncate if value is beyond +/- Max range
    setFmaIpTypeNumeric2((int) number);
  }

  /**
   * Update FmaIpTypeNumeric2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpTypeNumeric2(char[] value) throws CFException {
    fmaIpTypeNumeric2 = serializeFmaIpTypeNumeric2(value);
  }
  /**
   * Update FmaIpTypeNumeric2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpTypeNumeric2String(char[] value) throws CFException {
    setFmaIpTypeNumeric2(value);
  }
  /**
   * Returns the value of fmaIpTypeDollars2
   *
   * @return fmaIpTypeDollars2
   */
  public BigDecimal getFmaIpTypeDollars2() throws CFException {
    if (isFmaIpTypeDollars2Modified()) {
      fmaIpTypeDollars2 = refreshFmaIpTypeDollars2();
    }
    return fmaIpTypeDollars2;
  }

  /**
   * Returns the String value of fmaIpTypeDollars2
   *
   * @return fmaIpTypeDollars2
   */
  public char[] getFmaIpTypeDollars2ActualString() {
    String value = String.valueOf(fmaIpTypeDollars2).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaIpTypeDollars2 with the passed number Corresponding COBOL Variable is
   * FMA-IP-TYPE-DOLLARS-2
   *
   * @param number
   */
  public void setFmaIpTypeDollars2(BigDecimal number) {
    fmaIpTypeDollars2 = checkFmaIpTypeDollars2MaxLimit(number);
    serializeFmaIpTypeDollars2(fmaIpTypeDollars2);
  }
  /**
   * Update FmaIpTypeDollars2 with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaIpTypeDollars2(char[] value) throws CFException {
    fmaIpTypeDollars2 = serializeFmaIpTypeDollars2(value);
  }
  /**
   * Returns the value of fmaIpTypeAlpha2
   *
   * @return fmaIpTypeAlpha2
   */
  public char[] getFmaIpTypeAlpha2() throws CFException {
    if (isFmaIpTypeAlpha2Modified()) {
      fmaIpTypeAlpha2 = refreshFmaIpTypeAlpha2();
    }
    return fmaIpTypeAlpha2;
  }

  /**
   * set variable fmaIpTypeAlpha2 Corresponding COBOL Variable is FMA-IP-TYPE-ALPHA-2
   *
   * @param value
   */
  public void setFmaIpTypeAlpha2(char[] value) {
    fmaIpTypeAlpha2 = checkFmaIpTypeAlpha2Constraints(value);
    serializeFmaIpTypeAlpha2(fmaIpTypeAlpha2);
  }

  /**
   * Update FmaIpTypeAlpha2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaIpTypeAlpha2, fmaIpTypeAlpha2.length);
  }

  public void setFmaIpTypeAlpha2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha2, fmaIpTypeAlpha2.length);
  }

  /**
   * Update FmaIpTypeAlpha2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha2 + targetIndex, targetLen);
  }

  /**
   * Update FmaIpTypeAlpha2 with another Field
   *
   * @param value
   */
  public void setFmaIpTypeAlpha2(Field source) {
    replace(source, 0, source.length(), beginFmaIpTypeAlpha2, FMA_IP_TYPE_ALPHA_2_LEN);
  }

  /**
   * Update FmaIpTypeAlpha2 with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha2, FMA_IP_TYPE_ALPHA_2_LEN);
  }

  /**
   * Update FmaIpTypeAlpha2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpTypeAlpha2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaIpTypeAlpha2 + targetIndex, targetLen);
  }

  /**
   * initializes FmaIpEntry String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setFmaIpErrCode1((short) 0);
    setFmaIpType1(CONSTANTS.SPACE);
    setFmaIpTypeNumeric1(0);
    setFmaIpTypeDollars1(BigDecimal.ZERO);
    setFmaIpTypeAlpha1(CONSTANTS.SPACE_4);
    setFmaIpErrCode2((short) 0);
    setFmaIpType2(CONSTANTS.SPACE);
    setFmaIpTypeNumeric2(0);
    setFmaIpTypeDollars2(BigDecimal.ZERO);
    setFmaIpTypeAlpha2(CONSTANTS.SPACE_4);
  }

  public static int getFmaIpEntryFieldLength() {
    return FMA_IP_ENTRY_LENGTH;
  }
}
