package com.cloudframe.app.dto.d5427pol;

/**
 * The class MxiEffDate is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class MxiEffDate extends MxiEffDateSerialized {

  private int mxiEffDateCc;

  private int mxiEffDateYy;

  private int mxiEffDateMm;

  private int mxiEffDateDd;

  /** Constructor for MxiEffDate */
  public MxiEffDate() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of mxiEffDateCc
   *
   * @return mxiEffDateCc
   */
  public int getMxiEffDateCc() throws CFException {
    if (isMxiEffDateCcModified()) {
      mxiEffDateCc = refreshMxiEffDateCc();
    }
    return mxiEffDateCc;
  }

  /**
   * Update MxiEffDateCc with the passed value Corresponding COBOL Variable is WS-MXI-EFF-DATE-CC
   *
   * @param number
   */
  public void setMxiEffDateCc(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEffDateCc = checkMxiEffDateCcMaxLimit(number);
    serializeMxiEffDateCc(mxiEffDateCc);
  }

  public void setMxiEffDateCc(long number) {
    number = checkMxiEffDateCcMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEffDateCc((int) number);
  }

  /**
   * Update MxiEffDateCc with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateCc(char[] value) throws CFException {
    mxiEffDateCc = serializeMxiEffDateCc(value);
  }
  /**
   * Update MxiEffDateCc with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateCcString(char[] value) throws CFException {
    setMxiEffDateCc(value);
  }
  /**
   * Returns the value of mxiEffDateYy
   *
   * @return mxiEffDateYy
   */
  public int getMxiEffDateYy() throws CFException {
    if (isMxiEffDateYyModified()) {
      mxiEffDateYy = refreshMxiEffDateYy();
    }
    return mxiEffDateYy;
  }

  /**
   * Update MxiEffDateYy with the passed value Corresponding COBOL Variable is WS-MXI-EFF-DATE-YY
   *
   * @param number
   */
  public void setMxiEffDateYy(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEffDateYy = checkMxiEffDateYyMaxLimit(number);
    serializeMxiEffDateYy(mxiEffDateYy);
  }

  public void setMxiEffDateYy(long number) {
    number = checkMxiEffDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEffDateYy((int) number);
  }

  /**
   * Update MxiEffDateYy with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateYy(char[] value) throws CFException {
    mxiEffDateYy = serializeMxiEffDateYy(value);
  }
  /**
   * Update MxiEffDateYy with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateYyString(char[] value) throws CFException {
    setMxiEffDateYy(value);
  }
  /**
   * Returns the value of mxiEffDateMm
   *
   * @return mxiEffDateMm
   */
  public int getMxiEffDateMm() throws CFException {
    if (isMxiEffDateMmModified()) {
      mxiEffDateMm = refreshMxiEffDateMm();
    }
    return mxiEffDateMm;
  }

  /**
   * Update MxiEffDateMm with the passed value Corresponding COBOL Variable is WS-MXI-EFF-DATE-MM
   *
   * @param number
   */
  public void setMxiEffDateMm(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEffDateMm = checkMxiEffDateMmMaxLimit(number);
    serializeMxiEffDateMm(mxiEffDateMm);
  }

  public void setMxiEffDateMm(long number) {
    number = checkMxiEffDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEffDateMm((int) number);
  }

  /**
   * Update MxiEffDateMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateMm(char[] value) throws CFException {
    mxiEffDateMm = serializeMxiEffDateMm(value);
  }
  /**
   * Update MxiEffDateMm with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateMmString(char[] value) throws CFException {
    setMxiEffDateMm(value);
  }
  /**
   * Returns the value of mxiEffDateDd
   *
   * @return mxiEffDateDd
   */
  public int getMxiEffDateDd() throws CFException {
    if (isMxiEffDateDdModified()) {
      mxiEffDateDd = refreshMxiEffDateDd();
    }
    return mxiEffDateDd;
  }

  /**
   * Update MxiEffDateDd with the passed value Corresponding COBOL Variable is WS-MXI-EFF-DATE-DD
   *
   * @param number
   */
  public void setMxiEffDateDd(int number) {
    // Truncate if the number is beyond +/- Max range
    mxiEffDateDd = checkMxiEffDateDdMaxLimit(number);
    serializeMxiEffDateDd(mxiEffDateDd);
  }

  public void setMxiEffDateDd(long number) {
    number = checkMxiEffDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setMxiEffDateDd((int) number);
  }

  /**
   * Update MxiEffDateDd with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateDd(char[] value) throws CFException {
    mxiEffDateDd = serializeMxiEffDateDd(value);
  }
  /**
   * Update MxiEffDateDd with the passed value
   *
   * @param value (String or char[])
   */
  public void setMxiEffDateDdString(char[] value) throws CFException {
    setMxiEffDateDd(value);
  }

  public static int getMxiEffDateFieldLength() {
    return MXI_EFF_DATE_LENGTH;
  }
}
