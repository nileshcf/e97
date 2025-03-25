package com.cloudframe.app.dto.dphpctsq;

/**
 * The class CurrKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class CurrKey extends CurrKeySerialized {

  private int wKeyQueryTyp;

  private char[] wKeyHipaaVerNbr = new char[1];

  private char[] wKeySortCol1 = new char[2];

  /** Constructor for CurrKey */
  public CurrKey() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    setWKeyQueryTyp(0);
    setWKeyHipaaVerNbr(fillSpace(1));
    setWKeySortCol1(fillSpace(2));
  }

  /**
   * Returns the value of wKeyQueryTyp
   *
   * @return wKeyQueryTyp
   */
  public int getWKeyQueryTyp() throws CFException {
    if (isWKeyQueryTypModified()) {
      wKeyQueryTyp = refreshWKeyQueryTyp();
    }
    return wKeyQueryTyp;
  }

  /**
   * Update WKeyQueryTyp with the passed value Corresponding COBOL Variable is W-KEY-QUERY-TYP
   *
   * @param number
   */
  public void setWKeyQueryTyp(int number) {
    // Truncate if the number is beyond +/- Max range
    wKeyQueryTyp = checkWKeyQueryTypMaxLimit(number);
    serializeWKeyQueryTyp(wKeyQueryTyp);
  }

  public void setWKeyQueryTyp(long number) {
    number = checkWKeyQueryTypMaxLimit(number); // Truncate if value is beyond +/- Max range
    setWKeyQueryTyp((int) number);
  }

  /**
   * Returns the value of wKeyHipaaVerNbr
   *
   * @return wKeyHipaaVerNbr
   */
  public char[] getWKeyHipaaVerNbr() throws CFException {
    if (isWKeyHipaaVerNbrModified()) {
      wKeyHipaaVerNbr = refreshWKeyHipaaVerNbr();
    }
    return wKeyHipaaVerNbr;
  }

  /**
   * set variable wKeyHipaaVerNbr Corresponding COBOL Variable is W-KEY-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setWKeyHipaaVerNbr(char[] value) {
    wKeyHipaaVerNbr = checkWKeyHipaaVerNbrConstraints(value);
    serializeWKeyHipaaVerNbr(wKeyHipaaVerNbr);
  }

  /**
   * Update WKeyHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setWKeyHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginWKeyHipaaVerNbr, wKeyHipaaVerNbr.length);
  }

  public void setWKeyHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWKeyHipaaVerNbr, wKeyHipaaVerNbr.length);
  }

  /**
   * Update WKeyHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWKeyHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWKeyHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update WKeyHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setWKeyHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginWKeyHipaaVerNbr, W_KEY_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update WKeyHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setWKeyHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWKeyHipaaVerNbr, W_KEY_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update WKeyHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWKeyHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWKeyHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of wKeySortCol1
   *
   * @return wKeySortCol1
   */
  public char[] getWKeySortCol1() throws CFException {
    if (isWKeySortCol1Modified()) {
      wKeySortCol1 = refreshWKeySortCol1();
    }
    return wKeySortCol1;
  }

  /**
   * set variable wKeySortCol1 Corresponding COBOL Variable is W-KEY-SORT-COL1
   *
   * @param value
   */
  public void setWKeySortCol1(char[] value) {
    wKeySortCol1 = checkWKeySortCol1Constraints(value);
    serializeWKeySortCol1(wKeySortCol1);
  }

  /**
   * Update WKeySortCol1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setWKeySortCol1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginWKeySortCol1, wKeySortCol1.length);
  }

  public void setWKeySortCol1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWKeySortCol1, wKeySortCol1.length);
  }

  /**
   * Update WKeySortCol1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWKeySortCol1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWKeySortCol1 + targetIndex, targetLen);
  }

  /**
   * Update WKeySortCol1 with another Field
   *
   * @param value
   */
  public void setWKeySortCol1(Field source) {
    replace(source, 0, source.length(), beginWKeySortCol1, W_KEY_SORT_COL_1_LEN);
  }

  /**
   * Update WKeySortCol1 with another Field from an offset and length
   *
   * @param value
   */
  public void setWKeySortCol1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWKeySortCol1, W_KEY_SORT_COL_1_LEN);
  }

  /**
   * Update WKeySortCol1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWKeySortCol1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWKeySortCol1 + targetIndex, targetLen);
  }

  public static int getCurrKeyFieldLength() {
    return CURR_KEY_LENGTH;
  }
}
