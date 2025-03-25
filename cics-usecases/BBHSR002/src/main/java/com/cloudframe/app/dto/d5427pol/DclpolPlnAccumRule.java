package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnAccumRule is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclpolPlnAccumRule extends DclpolPlnAccumRuleSerialized {

  private char[] dacmPolNbr = Field.fillLowValue(6);

  private char[] dacmPlnNbr = Field.fillLowValue(4);

  private char[] dacmClssNbr = Field.fillLowValue(4);

  private char[] dacmCovTypCd = Field.fillLowValue(1);

  private char[] dacmAccumRuleTypCd = Field.fillLowValue(4);

  private char[] dacmAccumBenTypCd = Field.fillLowValue(1);

  private BigDecimal dacmIndvOopAmt = BigDecimal.ZERO;

  private BigDecimal dacmFamOopAmt = BigDecimal.ZERO;

  private BigDecimal dacmEePls1Amt = BigDecimal.ZERO;

  private BigDecimal dacmEePlsSpAmt = BigDecimal.ZERO;

  private BigDecimal dacmEePlsChAmt = BigDecimal.ZERO;

  private BigDecimal dacmIndvMaxAmt = BigDecimal.ZERO;

  private BigDecimal dacmFamMaxAmt = BigDecimal.ZERO;

  /** Constructor for DclpolPlnAccumRule */
  public DclpolPlnAccumRule() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dacmPolNbr
   *
   * @return dacmPolNbr
   */
  public char[] getDacmPolNbr() throws CFException {
    if (isDacmPolNbrModified()) {
      dacmPolNbr = refreshDacmPolNbr();
    }
    return dacmPolNbr;
  }

  /**
   * set variable dacmPolNbr Corresponding COBOL Variable is DACM-POL-NBR
   *
   * @param value
   */
  public void setDacmPolNbr(char[] value) {
    dacmPolNbr = checkDacmPolNbrConstraints(value);
    serializeDacmPolNbr(dacmPolNbr);
  }

  /**
   * Update DacmPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDacmPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDacmPolNbr, dacmPolNbr.length);
  }

  public void setDacmPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPolNbr, dacmPolNbr.length);
  }

  /**
   * Update DacmPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPolNbr + targetIndex, targetLen);
  }

  /**
   * Update DacmPolNbr with another Field
   *
   * @param value
   */
  public void setDacmPolNbr(Field source) {
    replace(source, 0, source.length(), beginDacmPolNbr, DACM_POL_NBR_LEN);
  }

  /**
   * Update DacmPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDacmPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPolNbr, DACM_POL_NBR_LEN);
  }

  /**
   * Update DacmPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dacmPlnNbr
   *
   * @return dacmPlnNbr
   */
  public char[] getDacmPlnNbr() throws CFException {
    if (isDacmPlnNbrModified()) {
      dacmPlnNbr = refreshDacmPlnNbr();
    }
    return dacmPlnNbr;
  }

  /**
   * set variable dacmPlnNbr Corresponding COBOL Variable is DACM-PLN-NBR
   *
   * @param value
   */
  public void setDacmPlnNbr(char[] value) {
    dacmPlnNbr = checkDacmPlnNbrConstraints(value);
    serializeDacmPlnNbr(dacmPlnNbr);
  }

  /**
   * Update DacmPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDacmPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDacmPlnNbr, dacmPlnNbr.length);
  }

  public void setDacmPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPlnNbr, dacmPlnNbr.length);
  }

  /**
   * Update DacmPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DacmPlnNbr with another Field
   *
   * @param value
   */
  public void setDacmPlnNbr(Field source) {
    replace(source, 0, source.length(), beginDacmPlnNbr, DACM_PLN_NBR_LEN);
  }

  /**
   * Update DacmPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDacmPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPlnNbr, DACM_PLN_NBR_LEN);
  }

  /**
   * Update DacmPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dacmClssNbr
   *
   * @return dacmClssNbr
   */
  public char[] getDacmClssNbr() throws CFException {
    if (isDacmClssNbrModified()) {
      dacmClssNbr = refreshDacmClssNbr();
    }
    return dacmClssNbr;
  }

  /**
   * set variable dacmClssNbr Corresponding COBOL Variable is DACM-CLSS-NBR
   *
   * @param value
   */
  public void setDacmClssNbr(char[] value) {
    dacmClssNbr = checkDacmClssNbrConstraints(value);
    serializeDacmClssNbr(dacmClssNbr);
  }

  /**
   * Update DacmClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDacmClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDacmClssNbr, dacmClssNbr.length);
  }

  public void setDacmClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmClssNbr, dacmClssNbr.length);
  }

  /**
   * Update DacmClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DacmClssNbr with another Field
   *
   * @param value
   */
  public void setDacmClssNbr(Field source) {
    replace(source, 0, source.length(), beginDacmClssNbr, DACM_CLSS_NBR_LEN);
  }

  /**
   * Update DacmClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDacmClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmClssNbr, DACM_CLSS_NBR_LEN);
  }

  /**
   * Update DacmClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dacmCovTypCd
   *
   * @return dacmCovTypCd
   */
  public char[] getDacmCovTypCd() throws CFException {
    if (isDacmCovTypCdModified()) {
      dacmCovTypCd = refreshDacmCovTypCd();
    }
    return dacmCovTypCd;
  }

  /**
   * set variable dacmCovTypCd Corresponding COBOL Variable is DACM-COV-TYP-CD
   *
   * @param value
   */
  public void setDacmCovTypCd(char[] value) {
    dacmCovTypCd = checkDacmCovTypCdConstraints(value);
    serializeDacmCovTypCd(dacmCovTypCd);
  }

  /**
   * Update DacmCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDacmCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDacmCovTypCd, dacmCovTypCd.length);
  }

  public void setDacmCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmCovTypCd, dacmCovTypCd.length);
  }

  /**
   * Update DacmCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update DacmCovTypCd with another Field
   *
   * @param value
   */
  public void setDacmCovTypCd(Field source) {
    replace(source, 0, source.length(), beginDacmCovTypCd, DACM_COV_TYP_CD_LEN);
  }

  /**
   * Update DacmCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDacmCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmCovTypCd, DACM_COV_TYP_CD_LEN);
  }

  /**
   * Update DacmCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dacmAccumRuleTypCd
   *
   * @return dacmAccumRuleTypCd
   */
  public char[] getDacmAccumRuleTypCd() throws CFException {
    if (isDacmAccumRuleTypCdModified()) {
      dacmAccumRuleTypCd = refreshDacmAccumRuleTypCd();
    }
    return dacmAccumRuleTypCd;
  }

  /**
   * set variable dacmAccumRuleTypCd Corresponding COBOL Variable is DACM-ACCUM-RULE-TYP-CD
   *
   * @param value
   */
  public void setDacmAccumRuleTypCd(char[] value) {
    dacmAccumRuleTypCd = checkDacmAccumRuleTypCdConstraints(value);
    serializeDacmAccumRuleTypCd(dacmAccumRuleTypCd);
  }

  /**
   * Update DacmAccumRuleTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDacmAccumRuleTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDacmAccumRuleTypCd, dacmAccumRuleTypCd.length);
  }

  public void setDacmAccumRuleTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumRuleTypCd, dacmAccumRuleTypCd.length);
  }

  /**
   * Update DacmAccumRuleTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmAccumRuleTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumRuleTypCd + targetIndex, targetLen);
  }

  /**
   * Update DacmAccumRuleTypCd with another Field
   *
   * @param value
   */
  public void setDacmAccumRuleTypCd(Field source) {
    replace(source, 0, source.length(), beginDacmAccumRuleTypCd, DACM_ACCUM_RULE_TYP_CD_LEN);
  }

  /**
   * Update DacmAccumRuleTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDacmAccumRuleTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumRuleTypCd, DACM_ACCUM_RULE_TYP_CD_LEN);
  }

  /**
   * Update DacmAccumRuleTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmAccumRuleTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumRuleTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dacmAccumBenTypCd
   *
   * @return dacmAccumBenTypCd
   */
  public char[] getDacmAccumBenTypCd() throws CFException {
    if (isDacmAccumBenTypCdModified()) {
      dacmAccumBenTypCd = refreshDacmAccumBenTypCd();
    }
    return dacmAccumBenTypCd;
  }

  /**
   * set variable dacmAccumBenTypCd Corresponding COBOL Variable is DACM-ACCUM-BEN-TYP-CD
   *
   * @param value
   */
  public void setDacmAccumBenTypCd(char[] value) {
    dacmAccumBenTypCd = checkDacmAccumBenTypCdConstraints(value);
    serializeDacmAccumBenTypCd(dacmAccumBenTypCd);
  }

  /**
   * Update DacmAccumBenTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDacmAccumBenTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDacmAccumBenTypCd, dacmAccumBenTypCd.length);
  }

  public void setDacmAccumBenTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumBenTypCd, dacmAccumBenTypCd.length);
  }

  /**
   * Update DacmAccumBenTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmAccumBenTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumBenTypCd + targetIndex, targetLen);
  }

  /**
   * Update DacmAccumBenTypCd with another Field
   *
   * @param value
   */
  public void setDacmAccumBenTypCd(Field source) {
    replace(source, 0, source.length(), beginDacmAccumBenTypCd, DACM_ACCUM_BEN_TYP_CD_LEN);
  }

  /**
   * Update DacmAccumBenTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDacmAccumBenTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumBenTypCd, DACM_ACCUM_BEN_TYP_CD_LEN);
  }

  /**
   * Update DacmAccumBenTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDacmAccumBenTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDacmAccumBenTypCd + targetIndex, targetLen);
  }

  public BigDecimal getDacmIndvOopAmt() throws CFException {
    if (isDacmIndvOopAmtModified()) {
      dacmIndvOopAmt = refreshDacmIndvOopAmt();
    }
    return dacmIndvOopAmt;
  }

  public char[] getDacmIndvOopAmtString() {
    return dacmIndvOopAmtString();
  }

  /**
   * Update DacmIndvOopAmt with the passed number Corresponding COBOL Variable is DACM-INDV-OOP-AMT
   *
   * @param number
   */
  public void setDacmIndvOopAmt(BigDecimal number) {
    dacmIndvOopAmt = checkDacmIndvOopAmtMaxLimit(number);
    serializeDacmIndvOopAmt(dacmIndvOopAmt);
  }

  public BigDecimal getDacmFamOopAmt() throws CFException {
    if (isDacmFamOopAmtModified()) {
      dacmFamOopAmt = refreshDacmFamOopAmt();
    }
    return dacmFamOopAmt;
  }

  public char[] getDacmFamOopAmtString() {
    return dacmFamOopAmtString();
  }

  /**
   * Update DacmFamOopAmt with the passed number Corresponding COBOL Variable is DACM-FAM-OOP-AMT
   *
   * @param number
   */
  public void setDacmFamOopAmt(BigDecimal number) {
    dacmFamOopAmt = checkDacmFamOopAmtMaxLimit(number);
    serializeDacmFamOopAmt(dacmFamOopAmt);
  }

  public BigDecimal getDacmEePls1Amt() throws CFException {
    if (isDacmEePls1AmtModified()) {
      dacmEePls1Amt = refreshDacmEePls1Amt();
    }
    return dacmEePls1Amt;
  }

  public char[] getDacmEePls1AmtString() {
    return dacmEePls1AmtString();
  }

  /**
   * Update DacmEePls1Amt with the passed number Corresponding COBOL Variable is DACM-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setDacmEePls1Amt(BigDecimal number) {
    dacmEePls1Amt = checkDacmEePls1AmtMaxLimit(number);
    serializeDacmEePls1Amt(dacmEePls1Amt);
  }

  public BigDecimal getDacmEePlsSpAmt() throws CFException {
    if (isDacmEePlsSpAmtModified()) {
      dacmEePlsSpAmt = refreshDacmEePlsSpAmt();
    }
    return dacmEePlsSpAmt;
  }

  public char[] getDacmEePlsSpAmtString() {
    return dacmEePlsSpAmtString();
  }

  /**
   * Update DacmEePlsSpAmt with the passed number Corresponding COBOL Variable is DACM-EE-PLS-SP-AMT
   *
   * @param number
   */
  public void setDacmEePlsSpAmt(BigDecimal number) {
    dacmEePlsSpAmt = checkDacmEePlsSpAmtMaxLimit(number);
    serializeDacmEePlsSpAmt(dacmEePlsSpAmt);
  }

  public BigDecimal getDacmEePlsChAmt() throws CFException {
    if (isDacmEePlsChAmtModified()) {
      dacmEePlsChAmt = refreshDacmEePlsChAmt();
    }
    return dacmEePlsChAmt;
  }

  public char[] getDacmEePlsChAmtString() {
    return dacmEePlsChAmtString();
  }

  /**
   * Update DacmEePlsChAmt with the passed number Corresponding COBOL Variable is DACM-EE-PLS-CH-AMT
   *
   * @param number
   */
  public void setDacmEePlsChAmt(BigDecimal number) {
    dacmEePlsChAmt = checkDacmEePlsChAmtMaxLimit(number);
    serializeDacmEePlsChAmt(dacmEePlsChAmt);
  }

  public BigDecimal getDacmIndvMaxAmt() throws CFException {
    if (isDacmIndvMaxAmtModified()) {
      dacmIndvMaxAmt = refreshDacmIndvMaxAmt();
    }
    return dacmIndvMaxAmt;
  }

  public char[] getDacmIndvMaxAmtString() {
    return dacmIndvMaxAmtString();
  }

  /**
   * Update DacmIndvMaxAmt with the passed number Corresponding COBOL Variable is DACM-INDV-MAX-AMT
   *
   * @param number
   */
  public void setDacmIndvMaxAmt(BigDecimal number) {
    dacmIndvMaxAmt = checkDacmIndvMaxAmtMaxLimit(number);
    serializeDacmIndvMaxAmt(dacmIndvMaxAmt);
  }

  public BigDecimal getDacmFamMaxAmt() throws CFException {
    if (isDacmFamMaxAmtModified()) {
      dacmFamMaxAmt = refreshDacmFamMaxAmt();
    }
    return dacmFamMaxAmt;
  }

  public char[] getDacmFamMaxAmtString() {
    return dacmFamMaxAmtString();
  }

  /**
   * Update DacmFamMaxAmt with the passed number Corresponding COBOL Variable is DACM-FAM-MAX-AMT
   *
   * @param number
   */
  public void setDacmFamMaxAmt(BigDecimal number) {
    dacmFamMaxAmt = checkDacmFamMaxAmtMaxLimit(number);
    serializeDacmFamMaxAmt(dacmFamMaxAmt);
  }

  public static int getDclpolPlnAccumRuleFieldLength() {
    return DCLPOL_PLN_ACCUM_RULE_LENGTH;
  }
}
