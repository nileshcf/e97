package com.cloudframe.app.dto.bbhsr002;

/**
 * The class DsmDt is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class DsmDt extends DsmDtSerialized {

  private int dsmDtCc;

  private int dsmDtYy;

  private int dsmDtMm;

  private int dsmDtDd;

  /** Constructor for DsmDt */
  public DsmDt() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for DsmDt. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public DsmDt(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    replaceValue( // serialize and save the value
        ("-").toCharArray(), getStartOffset() + 4, 1);
    replaceValue( // serialize and save the value
        ("-").toCharArray(), getStartOffset() + 7, 1);
  }

  /**
   * Returns the value of dsmDtCc
   *
   * @return dsmDtCc
   */
  public int getDsmDtCc() throws CFException {
    if (isDsmDtCcModified()) {
      dsmDtCc = refreshDsmDtCc();
    }
    return dsmDtCc;
  }

  /**
   * Update DsmDtCc with the passed value Corresponding COBOL Variable is WS-DSM-DT-CC
   *
   * @param number
   */
  public void setDsmDtCc(int number) {
    // Truncate if the number is beyond +/- Max range
    dsmDtCc = checkDsmDtCcMaxLimit(number);
    serializeDsmDtCc(dsmDtCc);
  }

  public void setDsmDtCc(long number) {
    number = checkDsmDtCcMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDsmDtCc((int) number);
  }

  /**
   * Update DsmDtCc with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtCc(char[] value) throws CFException {
    dsmDtCc = serializeDsmDtCc(value);
  }
  /**
   * Update DsmDtCc with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtCcString(char[] value) throws CFException {
    setDsmDtCc(value);
  }
  /**
   * Returns the value of dsmDtYy
   *
   * @return dsmDtYy
   */
  public int getDsmDtYy() throws CFException {
    if (isDsmDtYyModified()) {
      dsmDtYy = refreshDsmDtYy();
    }
    return dsmDtYy;
  }

  /**
   * Update DsmDtYy with the passed value Corresponding COBOL Variable is WS-DSM-DT-YY
   *
   * @param number
   */
  public void setDsmDtYy(int number) {
    // Truncate if the number is beyond +/- Max range
    dsmDtYy = checkDsmDtYyMaxLimit(number);
    serializeDsmDtYy(dsmDtYy);
  }

  public void setDsmDtYy(long number) {
    number = checkDsmDtYyMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDsmDtYy((int) number);
  }

  /**
   * Update DsmDtYy with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtYy(char[] value) throws CFException {
    dsmDtYy = serializeDsmDtYy(value);
  }
  /**
   * Update DsmDtYy with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtYyString(char[] value) throws CFException {
    setDsmDtYy(value);
  }
  /**
   * Returns the value of dsmDtMm
   *
   * @return dsmDtMm
   */
  public int getDsmDtMm() throws CFException {
    if (isDsmDtMmModified()) {
      dsmDtMm = refreshDsmDtMm();
    }
    return dsmDtMm;
  }

  /**
   * Update DsmDtMm with the passed value Corresponding COBOL Variable is WS-DSM-DT-MM
   *
   * @param number
   */
  public void setDsmDtMm(int number) {
    // Truncate if the number is beyond +/- Max range
    dsmDtMm = checkDsmDtMmMaxLimit(number);
    serializeDsmDtMm(dsmDtMm);
  }

  public void setDsmDtMm(long number) {
    number = checkDsmDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDsmDtMm((int) number);
  }

  /**
   * Update DsmDtMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtMm(char[] value) throws CFException {
    dsmDtMm = serializeDsmDtMm(value);
  }
  /**
   * Update DsmDtMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtMmString(char[] value) throws CFException {
    setDsmDtMm(value);
  }
  /**
   * Returns the value of dsmDtDd
   *
   * @return dsmDtDd
   */
  public int getDsmDtDd() throws CFException {
    if (isDsmDtDdModified()) {
      dsmDtDd = refreshDsmDtDd();
    }
    return dsmDtDd;
  }

  /**
   * Update DsmDtDd with the passed value Corresponding COBOL Variable is WS-DSM-DT-DD
   *
   * @param number
   */
  public void setDsmDtDd(int number) {
    // Truncate if the number is beyond +/- Max range
    dsmDtDd = checkDsmDtDdMaxLimit(number);
    serializeDsmDtDd(dsmDtDd);
  }

  public void setDsmDtDd(long number) {
    number = checkDsmDtDdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDsmDtDd((int) number);
  }

  /**
   * Update DsmDtDd with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtDd(char[] value) throws CFException {
    dsmDtDd = serializeDsmDtDd(value);
  }
  /**
   * Update DsmDtDd with the passed value
   *
   * @param value (String or char[])
   */
  public void setDsmDtDdString(char[] value) throws CFException {
    setDsmDtDd(value);
  }

  /**
   * initializes DsmDt String fields defaults to Spaces short/int/long defaults to zero BigDecimal
   * defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDsmDtCc(0);
    setDsmDtYy(0);
    setDsmDtMm(0);
    setDsmDtDd(0);
  }

  public static int getDsmDtFieldLength() {
    return DSM_DT_LENGTH;
  }
}
