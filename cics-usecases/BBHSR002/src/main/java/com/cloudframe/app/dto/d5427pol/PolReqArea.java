package com.cloudframe.app.dto.d5427pol;

/**
 * The class PolReqArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class PolReqArea extends PolReqAreaSerialized {

  private char[] polReqClngProg = Field.fillLowValue(8);

  private char[] polReqCovTypCd = Field.fillLowValue(1);

  private char[] polReqMxiPolNbr = Field.fillLowValue(6);

  private int polReqMxiPlnNbr;

  private int polReqMxiClssNbr;

  private char[] polReqEffDt = Field.fillLowValue(10);

  private char[] polReqCancDt = Field.fillLowValue(10);

  private char[] polReqGetmainCreator = Field.fillLowValue(8);

  /** Constructor for PolReqArea */
  public PolReqArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PolReqArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PolReqArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of polReqClngProg
   *
   * @return polReqClngProg
   */
  public char[] getPolReqClngProg() throws CFException {
    if (isPolReqClngProgModified()) {
      polReqClngProg = refreshPolReqClngProg();
    }
    return polReqClngProg;
  }

  /**
   * set variable polReqClngProg Corresponding COBOL Variable is POL-REQ-CLNG-PROG
   *
   * @param value
   */
  public void setPolReqClngProg(char[] value) {
    polReqClngProg = checkPolReqClngProgConstraints(value);
    serializePolReqClngProg(polReqClngProg);
  }

  /**
   * Update PolReqClngProg with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolReqClngProg(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolReqClngProg, polReqClngProg.length);
  }

  public void setPolReqClngProg(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqClngProg, polReqClngProg.length);
  }

  /**
   * Update PolReqClngProg with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqClngProg(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqClngProg + targetIndex, targetLen);
  }

  /**
   * Update PolReqClngProg with another Field
   *
   * @param value
   */
  public void setPolReqClngProg(Field source) {
    replace(source, 0, source.length(), beginPolReqClngProg, POL_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update PolReqClngProg with another Field from an offset and length
   *
   * @param value
   */
  public void setPolReqClngProg(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqClngProg, POL_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update PolReqClngProg with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqClngProg(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqClngProg + targetIndex, targetLen);
  }
  /**
   * Returns the value of polReqCovTypCd
   *
   * @return polReqCovTypCd
   */
  public char[] getPolReqCovTypCd() throws CFException {
    if (isPolReqCovTypCdModified()) {
      polReqCovTypCd = refreshPolReqCovTypCd();
    }
    return polReqCovTypCd;
  }

  /**
   * set variable polReqCovTypCd Corresponding COBOL Variable is POL-REQ-COV-TYP-CD
   *
   * @param value
   */
  public void setPolReqCovTypCd(char[] value) {
    polReqCovTypCd = checkPolReqCovTypCdConstraints(value);
    serializePolReqCovTypCd(polReqCovTypCd);
  }

  /**
   * Update PolReqCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolReqCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolReqCovTypCd, polReqCovTypCd.length);
  }

  public void setPolReqCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCovTypCd, polReqCovTypCd.length);
  }

  /**
   * Update PolReqCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update PolReqCovTypCd with another Field
   *
   * @param value
   */
  public void setPolReqCovTypCd(Field source) {
    replace(source, 0, source.length(), beginPolReqCovTypCd, POL_REQ_COV_TYP_CD_LEN);
  }

  /**
   * Update PolReqCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolReqCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCovTypCd, POL_REQ_COV_TYP_CD_LEN);
  }

  /**
   * Update PolReqCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polReqMxiPolNbr
   *
   * @return polReqMxiPolNbr
   */
  public char[] getPolReqMxiPolNbr() throws CFException {
    if (isPolReqMxiPolNbrModified()) {
      polReqMxiPolNbr = refreshPolReqMxiPolNbr();
    }
    return polReqMxiPolNbr;
  }

  /**
   * set variable polReqMxiPolNbr Corresponding COBOL Variable is POL-REQ-MXI-POL-NBR
   *
   * @param value
   */
  public void setPolReqMxiPolNbr(char[] value) {
    polReqMxiPolNbr = checkPolReqMxiPolNbrConstraints(value);
    serializePolReqMxiPolNbr(polReqMxiPolNbr);
  }

  /**
   * Update PolReqMxiPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolReqMxiPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolReqMxiPolNbr, polReqMxiPolNbr.length);
  }

  public void setPolReqMxiPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqMxiPolNbr, polReqMxiPolNbr.length);
  }

  /**
   * Update PolReqMxiPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqMxiPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqMxiPolNbr + targetIndex, targetLen);
  }

  /**
   * Update PolReqMxiPolNbr with another Field
   *
   * @param value
   */
  public void setPolReqMxiPolNbr(Field source) {
    replace(source, 0, source.length(), beginPolReqMxiPolNbr, POL_REQ_MXI_POL_NBR_LEN);
  }

  /**
   * Update PolReqMxiPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPolReqMxiPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqMxiPolNbr, POL_REQ_MXI_POL_NBR_LEN);
  }

  /**
   * Update PolReqMxiPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqMxiPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqMxiPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of polReqMxiPlnNbr
   *
   * @return polReqMxiPlnNbr
   */
  public int getPolReqMxiPlnNbr() throws CFException {
    if (isPolReqMxiPlnNbrModified()) {
      polReqMxiPlnNbr = refreshPolReqMxiPlnNbr();
    }
    return polReqMxiPlnNbr;
  }

  /**
   * Update PolReqMxiPlnNbr with the passed value Corresponding COBOL Variable is
   * POL-REQ-MXI-PLN-NBR
   *
   * @param number
   */
  public void setPolReqMxiPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    polReqMxiPlnNbr = checkPolReqMxiPlnNbrMaxLimit(number);
    serializePolReqMxiPlnNbr(polReqMxiPlnNbr);
  }

  public void setPolReqMxiPlnNbr(long number) {
    number = checkPolReqMxiPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPolReqMxiPlnNbr((int) number);
  }

  /**
   * Update PolReqMxiPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPolReqMxiPlnNbr(char[] value) throws CFException {
    polReqMxiPlnNbr = serializePolReqMxiPlnNbr(value);
  }
  /**
   * Update PolReqMxiPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPolReqMxiPlnNbrString(char[] value) throws CFException {
    setPolReqMxiPlnNbr(value);
  }
  /**
   * Returns the value of polReqMxiClssNbr
   *
   * @return polReqMxiClssNbr
   */
  public int getPolReqMxiClssNbr() throws CFException {
    if (isPolReqMxiClssNbrModified()) {
      polReqMxiClssNbr = refreshPolReqMxiClssNbr();
    }
    return polReqMxiClssNbr;
  }

  /**
   * Update PolReqMxiClssNbr with the passed value Corresponding COBOL Variable is
   * POL-REQ-MXI-CLSS-NBR
   *
   * @param number
   */
  public void setPolReqMxiClssNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    polReqMxiClssNbr = checkPolReqMxiClssNbrMaxLimit(number);
    serializePolReqMxiClssNbr(polReqMxiClssNbr);
  }

  public void setPolReqMxiClssNbr(long number) {
    number = checkPolReqMxiClssNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPolReqMxiClssNbr((int) number);
  }

  /**
   * Update PolReqMxiClssNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPolReqMxiClssNbr(char[] value) throws CFException {
    polReqMxiClssNbr = serializePolReqMxiClssNbr(value);
  }
  /**
   * Update PolReqMxiClssNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPolReqMxiClssNbrString(char[] value) throws CFException {
    setPolReqMxiClssNbr(value);
  }
  /**
   * Returns the value of polReqEffDt
   *
   * @return polReqEffDt
   */
  public char[] getPolReqEffDt() throws CFException {
    if (isPolReqEffDtModified()) {
      polReqEffDt = refreshPolReqEffDt();
    }
    return polReqEffDt;
  }

  /**
   * set variable polReqEffDt Corresponding COBOL Variable is POL-REQ-EFF-DT
   *
   * @param value
   */
  public void setPolReqEffDt(char[] value) {
    polReqEffDt = checkPolReqEffDtConstraints(value);
    serializePolReqEffDt(polReqEffDt);
  }

  /**
   * Update PolReqEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolReqEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolReqEffDt, polReqEffDt.length);
  }

  public void setPolReqEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqEffDt, polReqEffDt.length);
  }

  /**
   * Update PolReqEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqEffDt + targetIndex, targetLen);
  }

  /**
   * Update PolReqEffDt with another Field
   *
   * @param value
   */
  public void setPolReqEffDt(Field source) {
    replace(source, 0, source.length(), beginPolReqEffDt, POL_REQ_EFF_DT_LEN);
  }

  /**
   * Update PolReqEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setPolReqEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqEffDt, POL_REQ_EFF_DT_LEN);
  }

  /**
   * Update PolReqEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of polReqCancDt
   *
   * @return polReqCancDt
   */
  public char[] getPolReqCancDt() throws CFException {
    if (isPolReqCancDtModified()) {
      polReqCancDt = refreshPolReqCancDt();
    }
    return polReqCancDt;
  }

  /**
   * set variable polReqCancDt Corresponding COBOL Variable is POL-REQ-CANC-DT
   *
   * @param value
   */
  public void setPolReqCancDt(char[] value) {
    polReqCancDt = checkPolReqCancDtConstraints(value);
    serializePolReqCancDt(polReqCancDt);
  }

  /**
   * Update PolReqCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolReqCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolReqCancDt, polReqCancDt.length);
  }

  public void setPolReqCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCancDt, polReqCancDt.length);
  }

  /**
   * Update PolReqCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCancDt + targetIndex, targetLen);
  }

  /**
   * Update PolReqCancDt with another Field
   *
   * @param value
   */
  public void setPolReqCancDt(Field source) {
    replace(source, 0, source.length(), beginPolReqCancDt, POL_REQ_CANC_DT_LEN);
  }

  /**
   * Update PolReqCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setPolReqCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCancDt, POL_REQ_CANC_DT_LEN);
  }

  /**
   * Update PolReqCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of polReqGetmainCreator
   *
   * @return polReqGetmainCreator
   */
  public char[] getPolReqGetmainCreator() throws CFException {
    if (isPolReqGetmainCreatorModified()) {
      polReqGetmainCreator = refreshPolReqGetmainCreator();
    }
    return polReqGetmainCreator;
  }

  /**
   * set variable polReqGetmainCreator Corresponding COBOL Variable is POL-REQ-GETMAIN-CREATOR
   *
   * @param value
   */
  public void setPolReqGetmainCreator(char[] value) {
    polReqGetmainCreator = checkPolReqGetmainCreatorConstraints(value);
    serializePolReqGetmainCreator(polReqGetmainCreator);
  }

  /**
   * Update PolReqGetmainCreator with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolReqGetmainCreator(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPolReqGetmainCreator, polReqGetmainCreator.length);
  }

  public void setPolReqGetmainCreator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqGetmainCreator, polReqGetmainCreator.length);
  }

  /**
   * Update PolReqGetmainCreator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqGetmainCreator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqGetmainCreator + targetIndex, targetLen);
  }

  /**
   * Update PolReqGetmainCreator with another Field
   *
   * @param value
   */
  public void setPolReqGetmainCreator(Field source) {
    replace(source, 0, source.length(), beginPolReqGetmainCreator, POL_REQ_GETMAIN_CREATOR_LEN);
  }

  /**
   * Update PolReqGetmainCreator with another Field from an offset and length
   *
   * @param value
   */
  public void setPolReqGetmainCreator(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqGetmainCreator, POL_REQ_GETMAIN_CREATOR_LEN);
  }

  /**
   * Update PolReqGetmainCreator with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPolReqGetmainCreator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolReqGetmainCreator + targetIndex, targetLen);
  }

  public static int getPolReqAreaFieldLength() {
    return POL_REQ_AREA_LENGTH;
  }
}
