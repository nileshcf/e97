package com.cloudframe.app.dto.dphpctsq;

/**
 * The class TmpLenGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class TmpLenGroup extends TmpLenGroupSerialized {

  private int tmpLen;
  private TmpLenRedefined tmpLenRedefined = new TmpLenRedefined();

  /** Constructor for TmpLenGroup */
  public TmpLenGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    tmpLenRedefined.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of tmpLen
   *
   * @return tmpLen
   */
  public int getTmpLen() throws CFException {
    if (isTmpLenModified()) {
      tmpLen = refreshTmpLen();
    }
    return tmpLen;
  }

  /**
   * Update TmpLen with the passed value Corresponding COBOL Variable is TMP-LEN
   *
   * @param number
   */
  public void setTmpLen(int number) {
    // Truncate if the number is beyond +/- Max range
    tmpLen = checkTmpLenMaxLimit(number);
    serializeTmpLen(tmpLen);
  }

  public void setTmpLen(long number) {
    number = checkTmpLenMaxLimit(number); // Truncate if value is beyond +/- Max range
    setTmpLen((int) number);
  }

  /**
   * Returns the value of tmpLenRedefined
   *
   * @return tmpLenRedefined
   */
  public TmpLenRedefined getTmpLenRedefined() {
    return tmpLenRedefined;
  }
  /**
   * Update TmpLenRedefined with the passed value Corresponding COBOL Variable is TMP-LEN-REDEFINED
   *
   * @param value
   */
  public void setTmpLenRedefined(char[] value) {
    tmpLenRedefined.setString(value);
  }

  /**
   * Update TmpLenRedefined with a String from an offset and length
   *
   * @param value
   */
  public void setTmpLenRedefined(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tmpLenRedefined.begin, tmpLenRedefined.length());
  }

  /**
   * Update TmpLenRedefined with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTmpLenRedefined(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tmpLenRedefined.begin + targetIndex, targetLen);
  }

  /**
   * Update TmpLenRedefined with another Field
   *
   * @param value
   */
  public void setTmpLenRedefined(Field source) {
    replace(source, 0, source.length(), tmpLenRedefined.begin, tmpLenRedefined.length());
  }

  /**
   * Update TmpLenRedefined with another Field from an offset and length
   *
   * @param value
   */
  public void setTmpLenRedefined(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tmpLenRedefined.begin, tmpLenRedefined.length());
  }

  /**
   * Update TmpLenRedefined with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTmpLenRedefined(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tmpLenRedefined.begin + targetIndex, targetLen);
  }

  public static int getTmpLenGroupFieldLength() {
    return TMP_LEN_GROUP_LENGTH;
  }
}
