package com.cloudframe.app.dto.d5427scn;

/**
 * The class CsrchSearchKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class CsrchSearchKey extends CsrchSearchKeySerialized {

  private char[] csrchSrvcCd = Field.fillLowValue(6);

  /** Constructor for CsrchSearchKey */
  public CsrchSearchKey() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of csrchSrvcCd
   *
   * @return csrchSrvcCd
   */
  public char[] getCsrchSrvcCd() throws CFException {
    if (isCsrchSrvcCdModified()) {
      csrchSrvcCd = refreshCsrchSrvcCd();
    }
    return csrchSrvcCd;
  }

  /**
   * set variable csrchSrvcCd Corresponding COBOL Variable is CSRCH-SRVC-CD
   *
   * @param value
   */
  public void setCsrchSrvcCd(char[] value) {
    csrchSrvcCd = checkCsrchSrvcCdConstraints(value);
    serializeCsrchSrvcCd(csrchSrvcCd);
  }

  /**
   * Update CsrchSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCsrchSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCsrchSrvcCd, csrchSrvcCd.length);
  }

  public void setCsrchSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCsrchSrvcCd, csrchSrvcCd.length);
  }

  /**
   * Update CsrchSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCsrchSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCsrchSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update CsrchSrvcCd with another Field
   *
   * @param value
   */
  public void setCsrchSrvcCd(Field source) {
    replace(source, 0, source.length(), beginCsrchSrvcCd, CSRCH_SRVC_CD_LEN);
  }

  /**
   * Update CsrchSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCsrchSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCsrchSrvcCd, CSRCH_SRVC_CD_LEN);
  }

  /**
   * Update CsrchSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCsrchSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCsrchSrvcCd + targetIndex, targetLen);
  }

  public static int getCsrchSearchKeyFieldLength() {
    return CSRCH_SEARCH_KEY_LENGTH;
  }
}
