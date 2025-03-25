package com.cloudframe.app.dto.d5427bhi;

/**
 * The class DbhsdHipaaCommtTxt is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class DbhsdHipaaCommtTxt extends DbhsdHipaaCommtTxtSerialized {

  private short dbhsdHipaaCommtTxtLen;

  private char[] dbhsdHipaaCommtTxtText = Field.fillLowValue(300);

  /** Constructor for DbhsdHipaaCommtTxt */
  public DbhsdHipaaCommtTxt() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for DbhsdHipaaCommtTxt. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public DbhsdHipaaCommtTxt(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of dbhsdHipaaCommtTxtLen
   *
   * @return dbhsdHipaaCommtTxtLen
   */
  public short getDbhsdHipaaCommtTxtLen() throws CFException {
    if (isDbhsdHipaaCommtTxtLenModified()) {
      dbhsdHipaaCommtTxtLen = refreshDbhsdHipaaCommtTxtLen();
    }
    return dbhsdHipaaCommtTxtLen;
  }

  /**
   * Update DbhsdHipaaCommtTxtLen with the passed value Corresponding COBOL Variable is
   * DBHSD-HIPAA-COMMT-TXT-LEN
   *
   * @param number
   */
  public void setDbhsdHipaaCommtTxtLen(short number) {
    // Truncate if the number is beyond +/- Max range
    dbhsdHipaaCommtTxtLen = checkDbhsdHipaaCommtTxtLenMaxLimit(number);
    serializeDbhsdHipaaCommtTxtLen(dbhsdHipaaCommtTxtLen);
  }

  public void setDbhsdHipaaCommtTxtLen(int number) {
    number =
        checkDbhsdHipaaCommtTxtLenMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setDbhsdHipaaCommtTxtLen((short) number);
  }

  public void setDbhsdHipaaCommtTxtLen(long number) {
    number =
        checkDbhsdHipaaCommtTxtLenMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setDbhsdHipaaCommtTxtLen((short) number);
  }

  /**
   * Returns the value of dbhsdHipaaCommtTxtText
   *
   * @return dbhsdHipaaCommtTxtText
   */
  public char[] getDbhsdHipaaCommtTxtText() throws CFException {
    if (isDbhsdHipaaCommtTxtTextModified()) {
      dbhsdHipaaCommtTxtText = refreshDbhsdHipaaCommtTxtText();
    }
    return dbhsdHipaaCommtTxtText;
  }

  /**
   * set variable dbhsdHipaaCommtTxtText Corresponding COBOL Variable is DBHSD-HIPAA-COMMT-TXT-TEXT
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxtText(char[] value) {
    dbhsdHipaaCommtTxtText = checkDbhsdHipaaCommtTxtTextConstraints(value);
    serializeDbhsdHipaaCommtTxtText(dbhsdHipaaCommtTxtText);
  }

  /**
   * Update DbhsdHipaaCommtTxtText with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxtText(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginDbhsdHipaaCommtTxtText,
        dbhsdHipaaCommtTxtText.length);
  }

  public void setDbhsdHipaaCommtTxtText(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginDbhsdHipaaCommtTxtText, dbhsdHipaaCommtTxtText.length);
  }

  /**
   * Update DbhsdHipaaCommtTxtText with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxtText(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaCommtTxtText + targetIndex, targetLen);
  }

  /**
   * Update DbhsdHipaaCommtTxtText with another Field
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxtText(Field source) {
    replace(
        source, 0, source.length(), beginDbhsdHipaaCommtTxtText, DBHSD_HIPAA_COMMT_TXT_TEXT_LEN);
  }

  /**
   * Update DbhsdHipaaCommtTxtText with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxtText(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginDbhsdHipaaCommtTxtText,
        DBHSD_HIPAA_COMMT_TXT_TEXT_LEN);
  }

  /**
   * Update DbhsdHipaaCommtTxtText with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxtText(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaCommtTxtText + targetIndex, targetLen);
  }

  /**
   * initializes DbhsdHipaaCommtTxt String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDbhsdHipaaCommtTxtLen((short) 0);
    setDbhsdHipaaCommtTxtText(CONSTANTS.SPACE_300);
  }

  public static int getDbhsdHipaaCommtTxtFieldLength() {
    return DBHSD_HIPAA_COMMT_TXT_LENGTH;
  }
}
