package com.cloudframe.app.dto.d5427tli;

/**
 * The class TliReqArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427tli.*;
import com.cloudframe.app.exception.CFException;

public class TliReqArea extends TliReqAreaSerialized {

  private char[] tliReqClngProg = Field.fillLowValue(8);

  private char[] tliReqPolNbr = Field.fillLowValue(6);

  private char[] tliReqPlnNbr = Field.fillLowValue(4);

  private char[] tliReqObligId = Field.fillLowValue(2);

  private char[] tliReqShrArngCd = Field.fillLowValue(2);

  private char[] tliReqStartDt = Field.fillLowValue(10);

  /** Constructor for TliReqArea */
  public TliReqArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for TliReqArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public TliReqArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of tliReqClngProg
   *
   * @return tliReqClngProg
   */
  public char[] getTliReqClngProg() throws CFException {
    if (isTliReqClngProgModified()) {
      tliReqClngProg = refreshTliReqClngProg();
    }
    return tliReqClngProg;
  }

  /**
   * set variable tliReqClngProg Corresponding COBOL Variable is TLI-REQ-CLNG-PROG
   *
   * @param value
   */
  public void setTliReqClngProg(char[] value) {
    tliReqClngProg = checkTliReqClngProgConstraints(value);
    serializeTliReqClngProg(tliReqClngProg);
  }

  /**
   * Update TliReqClngProg with a char[] from an offset and length
   *
   * @param value
   */
  public void setTliReqClngProg(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTliReqClngProg, tliReqClngProg.length);
  }

  public void setTliReqClngProg(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqClngProg, tliReqClngProg.length);
  }

  /**
   * Update TliReqClngProg with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqClngProg(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqClngProg + targetIndex, targetLen);
  }

  /**
   * Update TliReqClngProg with another Field
   *
   * @param value
   */
  public void setTliReqClngProg(Field source) {
    replace(source, 0, source.length(), beginTliReqClngProg, TLI_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update TliReqClngProg with another Field from an offset and length
   *
   * @param value
   */
  public void setTliReqClngProg(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqClngProg, TLI_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update TliReqClngProg with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqClngProg(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqClngProg + targetIndex, targetLen);
  }
  /**
   * Returns the value of tliReqPolNbr
   *
   * @return tliReqPolNbr
   */
  public char[] getTliReqPolNbr() throws CFException {
    if (isTliReqPolNbrModified()) {
      tliReqPolNbr = refreshTliReqPolNbr();
    }
    return tliReqPolNbr;
  }

  /**
   * set variable tliReqPolNbr Corresponding COBOL Variable is TLI-REQ-POL-NBR
   *
   * @param value
   */
  public void setTliReqPolNbr(char[] value) {
    tliReqPolNbr = checkTliReqPolNbrConstraints(value);
    serializeTliReqPolNbr(tliReqPolNbr);
  }

  /**
   * Update TliReqPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setTliReqPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTliReqPolNbr, tliReqPolNbr.length);
  }

  public void setTliReqPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPolNbr, tliReqPolNbr.length);
  }

  /**
   * Update TliReqPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPolNbr + targetIndex, targetLen);
  }

  /**
   * Update TliReqPolNbr with another Field
   *
   * @param value
   */
  public void setTliReqPolNbr(Field source) {
    replace(source, 0, source.length(), beginTliReqPolNbr, TLI_REQ_POL_NBR_LEN);
  }

  /**
   * Update TliReqPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setTliReqPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPolNbr, TLI_REQ_POL_NBR_LEN);
  }

  /**
   * Update TliReqPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of tliReqPlnNbr
   *
   * @return tliReqPlnNbr
   */
  public char[] getTliReqPlnNbr() throws CFException {
    if (isTliReqPlnNbrModified()) {
      tliReqPlnNbr = refreshTliReqPlnNbr();
    }
    return tliReqPlnNbr;
  }

  /**
   * set variable tliReqPlnNbr Corresponding COBOL Variable is TLI-REQ-PLN-NBR
   *
   * @param value
   */
  public void setTliReqPlnNbr(char[] value) {
    tliReqPlnNbr = checkTliReqPlnNbrConstraints(value);
    serializeTliReqPlnNbr(tliReqPlnNbr);
  }

  /**
   * Update TliReqPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setTliReqPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTliReqPlnNbr, tliReqPlnNbr.length);
  }

  public void setTliReqPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPlnNbr, tliReqPlnNbr.length);
  }

  /**
   * Update TliReqPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update TliReqPlnNbr with another Field
   *
   * @param value
   */
  public void setTliReqPlnNbr(Field source) {
    replace(source, 0, source.length(), beginTliReqPlnNbr, TLI_REQ_PLN_NBR_LEN);
  }

  /**
   * Update TliReqPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setTliReqPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPlnNbr, TLI_REQ_PLN_NBR_LEN);
  }

  /**
   * Update TliReqPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of tliReqObligId
   *
   * @return tliReqObligId
   */
  public char[] getTliReqObligId() throws CFException {
    if (isTliReqObligIdModified()) {
      tliReqObligId = refreshTliReqObligId();
    }
    return tliReqObligId;
  }

  /**
   * set variable tliReqObligId Corresponding COBOL Variable is TLI-REQ-OBLIG-ID
   *
   * @param value
   */
  public void setTliReqObligId(char[] value) {
    tliReqObligId = checkTliReqObligIdConstraints(value);
    serializeTliReqObligId(tliReqObligId);
  }

  /**
   * Update TliReqObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setTliReqObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTliReqObligId, tliReqObligId.length);
  }

  public void setTliReqObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqObligId, tliReqObligId.length);
  }

  /**
   * Update TliReqObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqObligId + targetIndex, targetLen);
  }

  /**
   * Update TliReqObligId with another Field
   *
   * @param value
   */
  public void setTliReqObligId(Field source) {
    replace(source, 0, source.length(), beginTliReqObligId, TLI_REQ_OBLIG_ID_LEN);
  }

  /**
   * Update TliReqObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setTliReqObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqObligId, TLI_REQ_OBLIG_ID_LEN);
  }

  /**
   * Update TliReqObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of tliReqShrArngCd
   *
   * @return tliReqShrArngCd
   */
  public char[] getTliReqShrArngCd() throws CFException {
    if (isTliReqShrArngCdModified()) {
      tliReqShrArngCd = refreshTliReqShrArngCd();
    }
    return tliReqShrArngCd;
  }

  /**
   * set variable tliReqShrArngCd Corresponding COBOL Variable is TLI-REQ-SHR-ARNG-CD
   *
   * @param value
   */
  public void setTliReqShrArngCd(char[] value) {
    tliReqShrArngCd = checkTliReqShrArngCdConstraints(value);
    serializeTliReqShrArngCd(tliReqShrArngCd);
  }

  /**
   * Update TliReqShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setTliReqShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTliReqShrArngCd, tliReqShrArngCd.length);
  }

  public void setTliReqShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqShrArngCd, tliReqShrArngCd.length);
  }

  /**
   * Update TliReqShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update TliReqShrArngCd with another Field
   *
   * @param value
   */
  public void setTliReqShrArngCd(Field source) {
    replace(source, 0, source.length(), beginTliReqShrArngCd, TLI_REQ_SHR_ARNG_CD_LEN);
  }

  /**
   * Update TliReqShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setTliReqShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqShrArngCd, TLI_REQ_SHR_ARNG_CD_LEN);
  }

  /**
   * Update TliReqShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of tliReqStartDt
   *
   * @return tliReqStartDt
   */
  public char[] getTliReqStartDt() throws CFException {
    if (isTliReqStartDtModified()) {
      tliReqStartDt = refreshTliReqStartDt();
    }
    return tliReqStartDt;
  }

  /**
   * set variable tliReqStartDt Corresponding COBOL Variable is TLI-REQ-START-DT
   *
   * @param value
   */
  public void setTliReqStartDt(char[] value) {
    tliReqStartDt = checkTliReqStartDtConstraints(value);
    serializeTliReqStartDt(tliReqStartDt);
  }

  /**
   * Update TliReqStartDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setTliReqStartDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTliReqStartDt, tliReqStartDt.length);
  }

  public void setTliReqStartDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqStartDt, tliReqStartDt.length);
  }

  /**
   * Update TliReqStartDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqStartDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqStartDt + targetIndex, targetLen);
  }

  /**
   * Update TliReqStartDt with another Field
   *
   * @param value
   */
  public void setTliReqStartDt(Field source) {
    replace(source, 0, source.length(), beginTliReqStartDt, TLI_REQ_START_DT_LEN);
  }

  /**
   * Update TliReqStartDt with another Field from an offset and length
   *
   * @param value
   */
  public void setTliReqStartDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqStartDt, TLI_REQ_START_DT_LEN);
  }

  /**
   * Update TliReqStartDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqStartDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliReqStartDt + targetIndex, targetLen);
  }

  public static int getTliReqAreaFieldLength() {
    return TLI_REQ_AREA_LENGTH;
  }
}
