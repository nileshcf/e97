package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HipaaCode is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HipaaCode extends HipaaCodeSerialized {

  private char[] hipaaCd = Field.fillLowValue(2);

  /** Constructor for HipaaCode */
  public HipaaCode() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HipaaCode. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HipaaCode(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hipaaCd
   *
   * @return hipaaCd
   */
  public char[] getHipaaCd() throws CFException {
    if (isHipaaCdModified()) {
      hipaaCd = refreshHipaaCd();
    }
    return hipaaCd;
  }

  /**
   * set variable hipaaCd Corresponding COBOL Variable is WS-HIPAA-CD
   *
   * @param value
   */
  public void setHipaaCd(char[] value) {
    hipaaCd = checkHipaaCdConstraints(value);
    serializeHipaaCd(hipaaCd);
  }

  /**
   * Update HipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHipaaCd, hipaaCd.length);
  }

  public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd, hipaaCd.length);
  }

  /**
   * Update HipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update HipaaCd with another Field
   *
   * @param value
   */
  public void setHipaaCd(Field source) {
    replace(source, 0, source.length(), beginHipaaCd, HIPAA_CD_LEN);
  }

  /**
   * Update HipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd, HIPAA_CD_LEN);
  }

  /**
   * Update HipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd + targetIndex, targetLen);
  }

  public static int getHipaaCodeFieldLength() {
    return HIPAA_CODE_LENGTH;
  }
}
