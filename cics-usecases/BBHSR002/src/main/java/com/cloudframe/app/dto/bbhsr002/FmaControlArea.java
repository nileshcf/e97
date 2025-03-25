package com.cloudframe.app.dto.bbhsr002;

/**
 * The class FmaControlArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class FmaControlArea extends FmaControlAreaSerialized {

  private short fmaSubscript;

  private short fmaEntryTableOccurs;

  private char[] fmaDoneSw = Field.fillLowValue(1);

  /** Constructor for FmaControlArea */
  public FmaControlArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaControlArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaControlArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of fmaSubscript
   *
   * @return fmaSubscript
   */
  public short getFmaSubscript() throws CFException {
    if (isFmaSubscriptModified()) {
      fmaSubscript = refreshFmaSubscript();
    }
    return fmaSubscript;
  }

  /**
   * Returns the String value of fmaSubscript
   *
   * @return fmaSubscript
   */
  public char[] getFmaSubscriptActualString() {
    String value = String.valueOf(fmaSubscript).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaSubscript with the passed value Corresponding COBOL Variable is FMA-SUBSCRIPT
   *
   * @param number
   */
  public void setFmaSubscript(short number) {
    // Truncate if the number is beyond +/- Max range
    fmaSubscript = checkFmaSubscriptMaxLimit(number);
    serializeFmaSubscript(fmaSubscript);
  }

  public void setFmaSubscript(int number) {
    number = checkFmaSubscriptMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaSubscript((short) number);
  }

  public void setFmaSubscript(long number) {
    number = checkFmaSubscriptMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setFmaSubscript((short) number);
  }

  /**
   * Update FmaSubscript with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaSubscript(char[] value) throws CFException {
    fmaSubscript = serializeFmaSubscript(value);
  }
  /**
   * Update FmaSubscript with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaSubscriptString(char[] value) throws CFException {
    setFmaSubscript(value);
  }
  /**
   * Returns the value of fmaEntryTableOccurs
   *
   * @return fmaEntryTableOccurs
   */
  public short getFmaEntryTableOccurs() throws CFException {
    if (isFmaEntryTableOccursModified()) {
      fmaEntryTableOccurs = refreshFmaEntryTableOccurs();
    }
    return fmaEntryTableOccurs;
  }

  /**
   * Returns the String value of fmaEntryTableOccurs
   *
   * @return fmaEntryTableOccurs
   */
  public char[] getFmaEntryTableOccursActualString() {
    String value = String.valueOf(fmaEntryTableOccurs).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update FmaEntryTableOccurs with the passed value Corresponding COBOL Variable is
   * FMA-ENTRY-TABLE-OCCURS
   *
   * @param number
   */
  public void setFmaEntryTableOccurs(short number) {
    // Truncate if the number is beyond +/- Max range
    fmaEntryTableOccurs = checkFmaEntryTableOccursMaxLimit(number);
    serializeFmaEntryTableOccurs(fmaEntryTableOccurs);
  }

  public void setFmaEntryTableOccurs(int number) {
    number =
        checkFmaEntryTableOccursMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setFmaEntryTableOccurs((short) number);
  }

  public void setFmaEntryTableOccurs(long number) {
    number =
        checkFmaEntryTableOccursMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setFmaEntryTableOccurs((short) number);
  }

  /**
   * Update FmaEntryTableOccurs with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaEntryTableOccurs(char[] value) throws CFException {
    fmaEntryTableOccurs = serializeFmaEntryTableOccurs(value);
  }
  /**
   * Update FmaEntryTableOccurs with the passed value
   *
   * @param value (String or char[])
   */
  public void setFmaEntryTableOccursString(char[] value) throws CFException {
    setFmaEntryTableOccurs(value);
  }
  /**
   * Returns the value of fmaDoneSw
   *
   * @return fmaDoneSw
   */
  public char[] getFmaDoneSw() throws CFException {
    if (isFmaDoneSwModified()) {
      fmaDoneSw = refreshFmaDoneSw();
    }
    return fmaDoneSw;
  }

  /**
   * set variable fmaDoneSw Corresponding COBOL Variable is FMA-DONE-SW
   *
   * @param value
   */
  public void setFmaDoneSw(char[] value) {
    fmaDoneSw = checkFmaDoneSwConstraints(value);
    serializeFmaDoneSw(fmaDoneSw);
  }

  /**
   * Update FmaDoneSw with a char[] from an offset and length
   *
   * @param value
   */
  public void setFmaDoneSw(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFmaDoneSw, fmaDoneSw.length);
  }

  public void setFmaDoneSw(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaDoneSw, fmaDoneSw.length);
  }

  /**
   * Update FmaDoneSw with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaDoneSw(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaDoneSw + targetIndex, targetLen);
  }

  /**
   * Update FmaDoneSw with another Field
   *
   * @param value
   */
  public void setFmaDoneSw(Field source) {
    replace(source, 0, source.length(), beginFmaDoneSw, FMA_DONE_SW_LEN);
  }

  /**
   * Update FmaDoneSw with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaDoneSw(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFmaDoneSw, FMA_DONE_SW_LEN);
  }

  /**
   * Update FmaDoneSw with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaDoneSw(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFmaDoneSw + targetIndex, targetLen);
  }

  char[] fmaDone88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isFmaDone()
   *
   * @return Returns true if isFmaDone() is "Y"
   */
  public boolean isFmaDone() throws CFException {
    return (compareChars(getFmaDoneSw(), fmaDone88Value) == 0);
  }

  /** set values "Y" */
  public void setFmaDoneTrue() {
    setFmaDoneSw(fmaDone88Value);
  }

  char[] fmaNotDone88Value = "N".toCharArray();
  /**
   * Test condition "N" for isFmaNotDone()
   *
   * @return Returns true if isFmaNotDone() is "N"
   */
  public boolean isFmaNotDone() throws CFException {
    return (compareChars(getFmaDoneSw(), fmaNotDone88Value) == 0);
  }

  /** set values "N" */
  public void setFmaNotDoneTrue() {
    setFmaDoneSw(fmaNotDone88Value);
  }

  /**
   * initializes FmaControlArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setFmaSubscript((short) 0);
    setFmaEntryTableOccurs((short) 0);
    setFmaDoneSw(CONSTANTS.SPACE);
  }

  public static int getFmaControlAreaFieldLength() {
    return FMA_CONTROL_AREA_LENGTH;
  }
}
