package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol10RetArea10 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class Pol10RetArea10 extends Pol10RetArea10Serialized {

  private char[] pol10StdPolNbr = Field.fillLowValue(6);

  private int pol10StdPlnNbr;

  private char[] pol10RetLglEntyCd = Field.fillLowValue(5);

  private char[] pol10RetFundTypCd = Field.fillLowValue(1);

  private char[] pol10RetRiskClsCd = Field.fillLowValue(1);

  /** Constructor for Pol10RetArea10 */
  public Pol10RetArea10() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol10RetArea10. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol10RetArea10(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol10StdPolNbr
   *
   * @return pol10StdPolNbr
   */
  public char[] getPol10StdPolNbr() throws CFException {
    if (isPol10StdPolNbrModified()) {
      pol10StdPolNbr = refreshPol10StdPolNbr();
    }
    return pol10StdPolNbr;
  }

  /**
   * set variable pol10StdPolNbr Corresponding COBOL Variable is POL10-STD-POL-NBR
   *
   * @param value
   */
  public void setPol10StdPolNbr(char[] value) {
    pol10StdPolNbr = checkPol10StdPolNbrConstraints(value);
    serializePol10StdPolNbr(pol10StdPolNbr);
  }

  /**
   * Update Pol10StdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol10StdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol10StdPolNbr, pol10StdPolNbr.length);
  }

  public void setPol10StdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10StdPolNbr, pol10StdPolNbr.length);
  }

  /**
   * Update Pol10StdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10StdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10StdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol10StdPolNbr with another Field
   *
   * @param value
   */
  public void setPol10StdPolNbr(Field source) {
    replace(source, 0, source.length(), beginPol10StdPolNbr, POL_10_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol10StdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol10StdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10StdPolNbr, POL_10_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol10StdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10StdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10StdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol10StdPlnNbr
   *
   * @return pol10StdPlnNbr
   */
  public int getPol10StdPlnNbr() throws CFException {
    if (isPol10StdPlnNbrModified()) {
      pol10StdPlnNbr = refreshPol10StdPlnNbr();
    }
    return pol10StdPlnNbr;
  }

  /**
   * Update Pol10StdPlnNbr with the passed value Corresponding COBOL Variable is POL10-STD-PLN-NBR
   *
   * @param number
   */
  public void setPol10StdPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol10StdPlnNbr = checkPol10StdPlnNbrMaxLimit(number);
    serializePol10StdPlnNbr(pol10StdPlnNbr);
  }

  public void setPol10StdPlnNbr(long number) {
    number = checkPol10StdPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol10StdPlnNbr((int) number);
  }

  /**
   * Update Pol10StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol10StdPlnNbr(char[] value) throws CFException {
    pol10StdPlnNbr = serializePol10StdPlnNbr(value);
  }
  /**
   * Update Pol10StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol10StdPlnNbrString(char[] value) throws CFException {
    setPol10StdPlnNbr(value);
  }
  /**
   * Returns the value of pol10RetLglEntyCd
   *
   * @return pol10RetLglEntyCd
   */
  public char[] getPol10RetLglEntyCd() throws CFException {
    if (isPol10RetLglEntyCdModified()) {
      pol10RetLglEntyCd = refreshPol10RetLglEntyCd();
    }
    return pol10RetLglEntyCd;
  }

  /**
   * set variable pol10RetLglEntyCd Corresponding COBOL Variable is POL10-RET-LGL-ENTY-CD
   *
   * @param value
   */
  public void setPol10RetLglEntyCd(char[] value) {
    pol10RetLglEntyCd = checkPol10RetLglEntyCdConstraints(value);
    serializePol10RetLglEntyCd(pol10RetLglEntyCd);
  }

  /**
   * Update Pol10RetLglEntyCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol10RetLglEntyCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol10RetLglEntyCd, pol10RetLglEntyCd.length);
  }

  public void setPol10RetLglEntyCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetLglEntyCd, pol10RetLglEntyCd.length);
  }

  /**
   * Update Pol10RetLglEntyCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetLglEntyCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetLglEntyCd + targetIndex, targetLen);
  }

  /**
   * Update Pol10RetLglEntyCd with another Field
   *
   * @param value
   */
  public void setPol10RetLglEntyCd(Field source) {
    replace(source, 0, source.length(), beginPol10RetLglEntyCd, POL_10_RET_LGL_ENTY_CD_LEN);
  }

  /**
   * Update Pol10RetLglEntyCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol10RetLglEntyCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetLglEntyCd, POL_10_RET_LGL_ENTY_CD_LEN);
  }

  /**
   * Update Pol10RetLglEntyCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetLglEntyCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetLglEntyCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol10RetFundTypCd
   *
   * @return pol10RetFundTypCd
   */
  public char[] getPol10RetFundTypCd() throws CFException {
    if (isPol10RetFundTypCdModified()) {
      pol10RetFundTypCd = refreshPol10RetFundTypCd();
    }
    return pol10RetFundTypCd;
  }

  /**
   * set variable pol10RetFundTypCd Corresponding COBOL Variable is POL10-RET-FUND-TYP-CD
   *
   * @param value
   */
  public void setPol10RetFundTypCd(char[] value) {
    pol10RetFundTypCd = checkPol10RetFundTypCdConstraints(value);
    serializePol10RetFundTypCd(pol10RetFundTypCd);
  }

  /**
   * Update Pol10RetFundTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol10RetFundTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol10RetFundTypCd, pol10RetFundTypCd.length);
  }

  public void setPol10RetFundTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetFundTypCd, pol10RetFundTypCd.length);
  }

  /**
   * Update Pol10RetFundTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetFundTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetFundTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol10RetFundTypCd with another Field
   *
   * @param value
   */
  public void setPol10RetFundTypCd(Field source) {
    replace(source, 0, source.length(), beginPol10RetFundTypCd, POL_10_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol10RetFundTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol10RetFundTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetFundTypCd, POL_10_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol10RetFundTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetFundTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetFundTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol10RetRiskClsCd
   *
   * @return pol10RetRiskClsCd
   */
  public char[] getPol10RetRiskClsCd() throws CFException {
    if (isPol10RetRiskClsCdModified()) {
      pol10RetRiskClsCd = refreshPol10RetRiskClsCd();
    }
    return pol10RetRiskClsCd;
  }

  /**
   * set variable pol10RetRiskClsCd Corresponding COBOL Variable is POL10-RET-RISK-CLS-CD
   *
   * @param value
   */
  public void setPol10RetRiskClsCd(char[] value) {
    pol10RetRiskClsCd = checkPol10RetRiskClsCdConstraints(value);
    serializePol10RetRiskClsCd(pol10RetRiskClsCd);
  }

  /**
   * Update Pol10RetRiskClsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol10RetRiskClsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol10RetRiskClsCd, pol10RetRiskClsCd.length);
  }

  public void setPol10RetRiskClsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetRiskClsCd, pol10RetRiskClsCd.length);
  }

  /**
   * Update Pol10RetRiskClsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetRiskClsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetRiskClsCd + targetIndex, targetLen);
  }

  /**
   * Update Pol10RetRiskClsCd with another Field
   *
   * @param value
   */
  public void setPol10RetRiskClsCd(Field source) {
    replace(source, 0, source.length(), beginPol10RetRiskClsCd, POL_10_RET_RISK_CLS_CD_LEN);
  }

  /**
   * Update Pol10RetRiskClsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol10RetRiskClsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetRiskClsCd, POL_10_RET_RISK_CLS_CD_LEN);
  }

  /**
   * Update Pol10RetRiskClsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetRiskClsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol10RetRiskClsCd + targetIndex, targetLen);
  }

  /**
   * initializes Pol10RetArea10 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol10StdPolNbr(CONSTANTS.SPACE_6);
    setPol10StdPlnNbr(0);
    setPol10RetLglEntyCd(CONSTANTS.SPACE_5);
    setPol10RetFundTypCd(CONSTANTS.SPACE);
    setPol10RetRiskClsCd(CONSTANTS.SPACE);
  }

  public static int getPol10RetArea10FieldLength() {
    return POL_10_RET_AREA_10_LENGTH;
  }
}
