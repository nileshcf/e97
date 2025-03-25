package com.cloudframe.app.dto.d5427scn;

/**
 * The class ScnReqArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class ScnReqArea extends ScnReqAreaSerialized {

  private char[] scnReqSrvcCd = Field.fillLowValue(6);

  private char[] scnReqEffDt = Field.fillLowValue(10);

  private char[] scnReqCancDt = Field.fillLowValue(10);

  private char[] scnReqClngProg = Field.fillLowValue(8);

  /** Constructor for ScnReqArea */
  public ScnReqArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ScnReqArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ScnReqArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of scnReqSrvcCd
   *
   * @return scnReqSrvcCd
   */
  public char[] getScnReqSrvcCd() throws CFException {
    if (isScnReqSrvcCdModified()) {
      scnReqSrvcCd = refreshScnReqSrvcCd();
    }
    return scnReqSrvcCd;
  }

  /**
   * set variable scnReqSrvcCd Corresponding COBOL Variable is SCN-REQ-SRVC-CD
   *
   * @param value
   */
  public void setScnReqSrvcCd(char[] value) {
    scnReqSrvcCd = checkScnReqSrvcCdConstraints(value);
    serializeScnReqSrvcCd(scnReqSrvcCd);
  }

  /**
   * Update ScnReqSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setScnReqSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginScnReqSrvcCd, scnReqSrvcCd.length);
  }

  public void setScnReqSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqSrvcCd, scnReqSrvcCd.length);
  }

  /**
   * Update ScnReqSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update ScnReqSrvcCd with another Field
   *
   * @param value
   */
  public void setScnReqSrvcCd(Field source) {
    replace(source, 0, source.length(), beginScnReqSrvcCd, SCN_REQ_SRVC_CD_LEN);
  }

  /**
   * Update ScnReqSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setScnReqSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqSrvcCd, SCN_REQ_SRVC_CD_LEN);
  }

  /**
   * Update ScnReqSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of scnReqEffDt
   *
   * @return scnReqEffDt
   */
  public char[] getScnReqEffDt() throws CFException {
    if (isScnReqEffDtModified()) {
      scnReqEffDt = refreshScnReqEffDt();
    }
    return scnReqEffDt;
  }

  /**
   * set variable scnReqEffDt Corresponding COBOL Variable is SCN-REQ-EFF-DT
   *
   * @param value
   */
  public void setScnReqEffDt(char[] value) {
    scnReqEffDt = checkScnReqEffDtConstraints(value);
    serializeScnReqEffDt(scnReqEffDt);
  }

  /**
   * Update ScnReqEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setScnReqEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginScnReqEffDt, scnReqEffDt.length);
  }

  public void setScnReqEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqEffDt, scnReqEffDt.length);
  }

  /**
   * Update ScnReqEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqEffDt + targetIndex, targetLen);
  }

  /**
   * Update ScnReqEffDt with another Field
   *
   * @param value
   */
  public void setScnReqEffDt(Field source) {
    replace(source, 0, source.length(), beginScnReqEffDt, SCN_REQ_EFF_DT_LEN);
  }

  /**
   * Update ScnReqEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setScnReqEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqEffDt, SCN_REQ_EFF_DT_LEN);
  }

  /**
   * Update ScnReqEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of scnReqCancDt
   *
   * @return scnReqCancDt
   */
  public char[] getScnReqCancDt() throws CFException {
    if (isScnReqCancDtModified()) {
      scnReqCancDt = refreshScnReqCancDt();
    }
    return scnReqCancDt;
  }

  /**
   * set variable scnReqCancDt Corresponding COBOL Variable is SCN-REQ-CANC-DT
   *
   * @param value
   */
  public void setScnReqCancDt(char[] value) {
    scnReqCancDt = checkScnReqCancDtConstraints(value);
    serializeScnReqCancDt(scnReqCancDt);
  }

  /**
   * Update ScnReqCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setScnReqCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginScnReqCancDt, scnReqCancDt.length);
  }

  public void setScnReqCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqCancDt, scnReqCancDt.length);
  }

  /**
   * Update ScnReqCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqCancDt + targetIndex, targetLen);
  }

  /**
   * Update ScnReqCancDt with another Field
   *
   * @param value
   */
  public void setScnReqCancDt(Field source) {
    replace(source, 0, source.length(), beginScnReqCancDt, SCN_REQ_CANC_DT_LEN);
  }

  /**
   * Update ScnReqCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setScnReqCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqCancDt, SCN_REQ_CANC_DT_LEN);
  }

  /**
   * Update ScnReqCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of scnReqClngProg
   *
   * @return scnReqClngProg
   */
  public char[] getScnReqClngProg() throws CFException {
    if (isScnReqClngProgModified()) {
      scnReqClngProg = refreshScnReqClngProg();
    }
    return scnReqClngProg;
  }

  /**
   * set variable scnReqClngProg Corresponding COBOL Variable is SCN-REQ-CLNG-PROG
   *
   * @param value
   */
  public void setScnReqClngProg(char[] value) {
    scnReqClngProg = checkScnReqClngProgConstraints(value);
    serializeScnReqClngProg(scnReqClngProg);
  }

  /**
   * Update ScnReqClngProg with a char[] from an offset and length
   *
   * @param value
   */
  public void setScnReqClngProg(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginScnReqClngProg, scnReqClngProg.length);
  }

  public void setScnReqClngProg(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqClngProg, scnReqClngProg.length);
  }

  /**
   * Update ScnReqClngProg with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqClngProg(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqClngProg + targetIndex, targetLen);
  }

  /**
   * Update ScnReqClngProg with another Field
   *
   * @param value
   */
  public void setScnReqClngProg(Field source) {
    replace(source, 0, source.length(), beginScnReqClngProg, SCN_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update ScnReqClngProg with another Field from an offset and length
   *
   * @param value
   */
  public void setScnReqClngProg(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqClngProg, SCN_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update ScnReqClngProg with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqClngProg(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnReqClngProg + targetIndex, targetLen);
  }

  public static int getScnReqAreaFieldLength() {
    return SCN_REQ_AREA_LENGTH;
  }
}
