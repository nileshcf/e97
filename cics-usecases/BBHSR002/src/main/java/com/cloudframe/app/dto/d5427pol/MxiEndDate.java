package com.cloudframe.app.dto.d5427pol;

/**
 * The class MxiEndDate is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class MxiEndDate extends MxiEndDateSerialized {

  private int mxiEndDateCc;

  private int mxiEndDateYy;

  private int mxiEndDateMm;

  private int mxiEndDateDd;

  /** Constructor for MxiEndDate */
  public MxiEndDate() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of mxiEndDateCc
   *
   * @return mxiEndDateCc
   */
  public int getMxiEndDateCc() throws CFException {
    if (isMxiEndDateCcModified()) {
      mxiEndDateCc = refreshMxiEndDateCc();
    }
    return mxiEndDateCc;
  }

  /**
   * Update MxiEndDateCc with the passed value Corresponding COBOL Variable is WS-MXI-END-DATE-CC
   *
   * @param number
   */
  public void setMxiEndDateCc(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEndDateCc = checkMxiEndDateCcMaxLimit(number);
    serializeMxiEndDateCc(mxiEndDateCc);
  }

  public void setMxiEndDateCc(long number) {
    number = checkMxiEndDateCcMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEndDateCc((int) number);
  }

  /**
   * Update MxiEndDateCc with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateCc(char[] value) throws CFException {
    mxiEndDateCc = serializeMxiEndDateCc(value);
  }
  /**
   * Update MxiEndDateCc with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateCcString(char[] value) throws CFException {
    setMxiEndDateCc(value);
  }
  /**
   * Returns the value of mxiEndDateYy
   *
   * @return mxiEndDateYy
   */
  public int getMxiEndDateYy() throws CFException {
    if (isMxiEndDateYyModified()) {
      mxiEndDateYy = refreshMxiEndDateYy();
    }
    return mxiEndDateYy;
  }

  /**
   * Update MxiEndDateYy with the passed value Corresponding COBOL Variable is WS-MXI-END-DATE-YY
   *
   * @param number
   */
  public void setMxiEndDateYy(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEndDateYy = checkMxiEndDateYyMaxLimit(number);
    serializeMxiEndDateYy(mxiEndDateYy);
  }

  public void setMxiEndDateYy(long number) {
    number = checkMxiEndDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEndDateYy((int) number);
  }

  /**
   * Update MxiEndDateYy with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateYy(char[] value) throws CFException {
    mxiEndDateYy = serializeMxiEndDateYy(value);
  }
  /**
   * Update MxiEndDateYy with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateYyString(char[] value) throws CFException {
    setMxiEndDateYy(value);
  }
  /**
   * Returns the value of mxiEndDateMm
   *
   * @return mxiEndDateMm
   */
  public int getMxiEndDateMm() throws CFException {
    if (isMxiEndDateMmModified()) {
      mxiEndDateMm = refreshMxiEndDateMm();
    }
    return mxiEndDateMm;
  }

  /**
   * Update MxiEndDateMm with the passed value Corresponding COBOL Variable is WS-MXI-END-DATE-MM
   *
   * @param number
   */
  public void setMxiEndDateMm(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEndDateMm = checkMxiEndDateMmMaxLimit(number);
    serializeMxiEndDateMm(mxiEndDateMm);
  }

  public void setMxiEndDateMm(long number) {
    number = checkMxiEndDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEndDateMm((int) number);
  }

  /**
   * Update MxiEndDateMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateMm(char[] value) throws CFException {
    mxiEndDateMm = serializeMxiEndDateMm(value);
  }
  /**
   * Update MxiEndDateMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateMmString(char[] value) throws CFException {
    setMxiEndDateMm(value);
  }
  /**
   * Returns the value of mxiEndDateDd
   *
   * @return mxiEndDateDd
   */
  public int getMxiEndDateDd() throws CFException {
    if (isMxiEndDateDdModified()) {
      mxiEndDateDd = refreshMxiEndDateDd();
    }
    return mxiEndDateDd;
  }

  /**
   * Update MxiEndDateDd with the passed value Corresponding COBOL Variable is WS-MXI-END-DATE-DD
   *
   * @param number
   */
  public void setMxiEndDateDd(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEndDateDd = checkMxiEndDateDdMaxLimit(number);
    serializeMxiEndDateDd(mxiEndDateDd);
  }

  public void setMxiEndDateDd(long number) {
    number = checkMxiEndDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEndDateDd((int) number);
  }

  /**
   * Update MxiEndDateDd with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateDd(char[] value) throws CFException {
    mxiEndDateDd = serializeMxiEndDateDd(value);
  }
  /**
   * Update MxiEndDateDd with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEndDateDdString(char[] value) throws CFException {
    setMxiEndDateDd(value);
  }

  public static int getMxiEndDateFieldLength() {
    return MXI_END_DATE_LENGTH;
  }
}
