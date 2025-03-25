package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrRetArea extends HsrRetAreaSerialized {

  private int hsrRetHipaaCnt;
  private HsrRetReturn hsrRetReturn = new HsrRetReturn();

  /** Constructor for HsrRetArea */
  public HsrRetArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    hsrRetReturn.setParent(this, getStartOffset() + 3);
  }

  /**
   * Returns the value of hsrRetHipaaCnt
   *
   * @return hsrRetHipaaCnt
   */
  public int getHsrRetHipaaCnt() throws CFException {
    if (isHsrRetHipaaCntModified()) {
      hsrRetHipaaCnt = refreshHsrRetHipaaCnt();
    }
    return hsrRetHipaaCnt;
  }

  /**
   * Update HsrRetHipaaCnt with the passed value Corresponding COBOL Variable is HSR-RET-HIPAA-CNT
   *
   * @param number
   */
  public void setHsrRetHipaaCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    hsrRetHipaaCnt = checkHsrRetHipaaCntMaxLimit(number);
    serializeHsrRetHipaaCnt(hsrRetHipaaCnt);
  }

  public void setHsrRetHipaaCnt(long number) {
    number = checkHsrRetHipaaCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHsrRetHipaaCnt((int) number);
  }

  /**
   * Update HsrRetHipaaCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrRetHipaaCnt(char[] value) throws CFException {
    hsrRetHipaaCnt = serializeHsrRetHipaaCnt(value);
  }
  /**
   * Update HsrRetHipaaCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrRetHipaaCntString(char[] value) throws CFException {
    setHsrRetHipaaCnt(value);
  }
  /**
   * Returns the value of hsrRetReturn
   *
   * @return hsrRetReturn
   */
  public HsrRetReturn getHsrRetReturn() {
    return hsrRetReturn;
  }
  /**
   * Update HsrRetReturn with the passed value Corresponding COBOL Variable is HSR-RET-RETURN
   *
   * @param value
   */
  public void setHsrRetReturn(char[] value) {
    hsrRetReturn.setString(value);
  }

  /**
   * Update HsrRetReturn with a String from an offset and length
   *
   * @param value
   */
  public void setHsrRetReturn(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrRetReturn.begin, hsrRetReturn.length());
  }

  /**
   * Update HsrRetReturn with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetReturn(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetReturn.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrRetReturn with another Field
   *
   * @param value
   */
  public void setHsrRetReturn(Field source) {
    replace(source, 0, source.length(), hsrRetReturn.begin, hsrRetReturn.length());
  }

  /**
   * Update HsrRetReturn with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetReturn(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrRetReturn.begin, hsrRetReturn.length());
  }

  /**
   * Update HsrRetReturn with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetReturn(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetReturn.begin + targetIndex, targetLen);
  }

  /**
   * initializes HsrRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHsrRetHipaaCnt(0);
    hsrRetReturn.initialize();
  }

  public static int getHsrRetAreaFieldLength() {
    return HSR_RET_AREA_LENGTH;
  }
}
