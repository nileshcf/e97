package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HpcRetHipaa is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HpcRetHipaa extends HpcRetHipaaSerialized {

  private char[] hpcRetHipaaCd = Field.fillLowValue(2);

  private char[] hpcRetGrnrcRqstCd = Field.fillLowValue(1);

  /** Constructor for HpcRetHipaa */
  public HpcRetHipaa() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HpcRetHipaa. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HpcRetHipaa(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hpcRetHipaaCd
   *
   * @return hpcRetHipaaCd
   */
  public char[] getHpcRetHipaaCd() throws CFException {
    if (isHpcRetHipaaCdModified()) {
      hpcRetHipaaCd = refreshHpcRetHipaaCd();
    }
    return hpcRetHipaaCd;
  }

  /**
   * set variable hpcRetHipaaCd Corresponding COBOL Variable is HPC-RET-HIPAA-CD
   *
   * @param value
   */
  public void setHpcRetHipaaCd(char[] value) {
    hpcRetHipaaCd = checkHpcRetHipaaCdConstraints(value);
    serializeHpcRetHipaaCd(hpcRetHipaaCd);
  }

  /**
   * Update HpcRetHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHpcRetHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHpcRetHipaaCd, hpcRetHipaaCd.length);
  }

  public void setHpcRetHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetHipaaCd, hpcRetHipaaCd.length);
  }

  /**
   * Update HpcRetHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update HpcRetHipaaCd with another Field
   *
   * @param value
   */
  public void setHpcRetHipaaCd(Field source) {
    replace(source, 0, source.length(), beginHpcRetHipaaCd, HPC_RET_HIPAA_CD_LEN);
  }

  /**
   * Update HpcRetHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcRetHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetHipaaCd, HPC_RET_HIPAA_CD_LEN);
  }

  /**
   * Update HpcRetHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hpcRetGrnrcRqstCd
   *
   * @return hpcRetGrnrcRqstCd
   */
  public char[] getHpcRetGrnrcRqstCd() throws CFException {
    if (isHpcRetGrnrcRqstCdModified()) {
      hpcRetGrnrcRqstCd = refreshHpcRetGrnrcRqstCd();
    }
    return hpcRetGrnrcRqstCd;
  }

  /**
   * set variable hpcRetGrnrcRqstCd Corresponding COBOL Variable is HPC-RET-GRNRC-RQST-CD
   *
   * @param value
   */
  public void setHpcRetGrnrcRqstCd(char[] value) {
    hpcRetGrnrcRqstCd = checkHpcRetGrnrcRqstCdConstraints(value);
    serializeHpcRetGrnrcRqstCd(hpcRetGrnrcRqstCd);
  }

  /**
   * Update HpcRetGrnrcRqstCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHpcRetGrnrcRqstCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHpcRetGrnrcRqstCd, hpcRetGrnrcRqstCd.length);
  }

  public void setHpcRetGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetGrnrcRqstCd, hpcRetGrnrcRqstCd.length);
  }

  /**
   * Update HpcRetGrnrcRqstCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetGrnrcRqstCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetGrnrcRqstCd + targetIndex, targetLen);
  }

  /**
   * Update HpcRetGrnrcRqstCd with another Field
   *
   * @param value
   */
  public void setHpcRetGrnrcRqstCd(Field source) {
    replace(source, 0, source.length(), beginHpcRetGrnrcRqstCd, HPC_RET_GRNRC_RQST_CD_LEN);
  }

  /**
   * Update HpcRetGrnrcRqstCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcRetGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetGrnrcRqstCd, HPC_RET_GRNRC_RQST_CD_LEN);
  }

  /**
   * Update HpcRetGrnrcRqstCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetGrnrcRqstCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcRetGrnrcRqstCd + targetIndex, targetLen);
  }

  /**
   * initializes HpcRetHipaa String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHpcRetHipaaCd(CONSTANTS.SPACE_2);
    setHpcRetGrnrcRqstCd(CONSTANTS.SPACE);
  }

  public static int getHpcRetHipaaFieldLength() {
    return HPC_RET_HIPAA_LENGTH;
  }
}
