package com.cloudframe.app.dto.d5427pol;

/**
 * The class StdFields is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class StdFields extends StdFieldsSerialized {

  private char[] stdPolNbr = Field.fillLowValue(6);

  private char[] stdPlnNbr = Field.fillLowValue(4);

  private char[] stdClssNbr = Field.fillLowValue(4);

  private char[] covEndDt = Field.fillLowValue(10);

  /** Constructor for StdFields */
  public StdFields() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for StdFields. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public StdFields(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of stdPolNbr
   *
   * @return stdPolNbr
   */
  public char[] getStdPolNbr() throws CFException {
    if (isStdPolNbrModified()) {
      stdPolNbr = refreshStdPolNbr();
    }
    return stdPolNbr;
  }

  /**
   * set variable stdPolNbr Corresponding COBOL Variable is WS-STD-POL-NBR
   *
   * @param value
   */
  public void setStdPolNbr(char[] value) {
    stdPolNbr = checkStdPolNbrConstraints(value);
    serializeStdPolNbr(stdPolNbr);
  }

  /**
   * Update StdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setStdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginStdPolNbr, stdPolNbr.length);
  }

  public void setStdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStdPolNbr, stdPolNbr.length);
  }

  /**
   * Update StdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update StdPolNbr with another Field
   *
   * @param value
   */
  public void setStdPolNbr(Field source) {
    replace(source, 0, source.length(), beginStdPolNbr, STD_POL_NBR_LEN);
  }

  /**
   * Update StdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setStdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStdPolNbr, STD_POL_NBR_LEN);
  }

  /**
   * Update StdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of stdPlnNbr
   *
   * @return stdPlnNbr
   */
  public char[] getStdPlnNbr() throws CFException {
    if (isStdPlnNbrModified()) {
      stdPlnNbr = refreshStdPlnNbr();
    }
    return stdPlnNbr;
  }

  /**
   * set variable stdPlnNbr Corresponding COBOL Variable is WS-STD-PLN-NBR
   *
   * @param value
   */
  public void setStdPlnNbr(char[] value) {
    stdPlnNbr = checkStdPlnNbrConstraints(value);
    serializeStdPlnNbr(stdPlnNbr);
  }

  /**
   * Update StdPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setStdPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginStdPlnNbr, stdPlnNbr.length);
  }

  public void setStdPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStdPlnNbr, stdPlnNbr.length);
  }

  /**
   * Update StdPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStdPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStdPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update StdPlnNbr with another Field
   *
   * @param value
   */
  public void setStdPlnNbr(Field source) {
    replace(source, 0, source.length(), beginStdPlnNbr, STD_PLN_NBR_LEN);
  }

  /**
   * Update StdPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setStdPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStdPlnNbr, STD_PLN_NBR_LEN);
  }

  /**
   * Update StdPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStdPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStdPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of stdClssNbr
   *
   * @return stdClssNbr
   */
  public char[] getStdClssNbr() throws CFException {
    if (isStdClssNbrModified()) {
      stdClssNbr = refreshStdClssNbr();
    }
    return stdClssNbr;
  }

  /**
   * set variable stdClssNbr Corresponding COBOL Variable is WS-STD-CLSS-NBR
   *
   * @param value
   */
  public void setStdClssNbr(char[] value) {
    stdClssNbr = checkStdClssNbrConstraints(value);
    serializeStdClssNbr(stdClssNbr);
  }

  /**
   * Update StdClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setStdClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginStdClssNbr, stdClssNbr.length);
  }

  public void setStdClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStdClssNbr, stdClssNbr.length);
  }

  /**
   * Update StdClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStdClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStdClssNbr + targetIndex, targetLen);
  }

  /**
   * Update StdClssNbr with another Field
   *
   * @param value
   */
  public void setStdClssNbr(Field source) {
    replace(source, 0, source.length(), beginStdClssNbr, STD_CLSS_NBR_LEN);
  }

  /**
   * Update StdClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setStdClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginStdClssNbr, STD_CLSS_NBR_LEN);
  }

  /**
   * Update StdClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setStdClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginStdClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of covEndDt
   *
   * @return covEndDt
   */
  public char[] getCovEndDt() throws CFException {
    if (isCovEndDtModified()) {
      covEndDt = refreshCovEndDt();
    }
    return covEndDt;
  }

  /**
   * set variable covEndDt Corresponding COBOL Variable is WS-COV-END-DT
   *
   * @param value
   */
  public void setCovEndDt(char[] value) {
    covEndDt = checkCovEndDtConstraints(value);
    serializeCovEndDt(covEndDt);
  }

  /**
   * Update CovEndDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCovEndDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCovEndDt, covEndDt.length);
  }

  public void setCovEndDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCovEndDt, covEndDt.length);
  }

  /**
   * Update CovEndDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCovEndDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCovEndDt + targetIndex, targetLen);
  }

  /**
   * Update CovEndDt with another Field
   *
   * @param value
   */
  public void setCovEndDt(Field source) {
    replace(source, 0, source.length(), beginCovEndDt, COV_END_DT_LEN);
  }

  /**
   * Update CovEndDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCovEndDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCovEndDt, COV_END_DT_LEN);
  }

  /**
   * Update CovEndDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCovEndDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCovEndDt + targetIndex, targetLen);
  }

  public static int getStdFieldsFieldLength() {
    return STD_FIELDS_LENGTH;
  }
}
