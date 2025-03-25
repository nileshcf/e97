package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol2RetReciprocityOccurs is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class Pol2RetReciprocityOccurs extends Pol2RetReciprocityOccursSerialized {

  private char[] pol2RetProductCode = Field.fillLowValue(3);

  private char[] pol2RetMarketType = Field.fillLowValue(2);

  private char[] pol2RetMarketNumber = Field.fillLowValue(7);

  private char[] pol2RetCrosswalkCorr = Field.fillLowValue(1);

  private char[] pol2RetIpaInd = Field.fillLowValue(5);

  private char[] pol2RetGroupTableNum = Field.fillLowValue(4);

  private char[] pol2RetContractArrangeCd = Field.fillLowValue(1);

  private char[] pol2RetPolPlnPrefNtwkCd = Field.fillLowValue(1);

  private char[] pol2RetInclExclMarketInd = Field.fillLowValue(1);

  private char[] pol2RetMentalHealthInd = Field.fillLowValue(1);

  private char[] pol2RetTravelBenefitInd = Field.fillLowValue(1);

  /** Constructor for Pol2RetReciprocityOccurs */
  public Pol2RetReciprocityOccurs() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol2RetReciprocityOccurs. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol2RetReciprocityOccurs(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol2RetProductCode
   *
   * @return pol2RetProductCode
   */
  public char[] getPol2RetProductCode() throws CFException {
    if (isPol2RetProductCodeModified()) {
      pol2RetProductCode = refreshPol2RetProductCode();
    }
    return pol2RetProductCode;
  }

  /**
   * set variable pol2RetProductCode Corresponding COBOL Variable is POL2-RET-PRODUCT-CODE
   *
   * @param value
   */
  public void setPol2RetProductCode(char[] value) {
    pol2RetProductCode = checkPol2RetProductCodeConstraints(value);
    serializePol2RetProductCode(pol2RetProductCode);
  }

  /**
   * Update Pol2RetProductCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetProductCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetProductCode, pol2RetProductCode.length);
  }

  public void setPol2RetProductCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductCode, pol2RetProductCode.length);
  }

  /**
   * Update Pol2RetProductCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetProductCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductCode + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetProductCode with another Field
   *
   * @param value
   */
  public void setPol2RetProductCode(Field source) {
    replace(source, 0, source.length(), beginPol2RetProductCode, POL_2_RET_PRODUCT_CODE_LEN);
  }

  /**
   * Update Pol2RetProductCode with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetProductCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductCode, POL_2_RET_PRODUCT_CODE_LEN);
  }

  /**
   * Update Pol2RetProductCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetProductCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductCode + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetMarketType
   *
   * @return pol2RetMarketType
   */
  public char[] getPol2RetMarketType() throws CFException {
    if (isPol2RetMarketTypeModified()) {
      pol2RetMarketType = refreshPol2RetMarketType();
    }
    return pol2RetMarketType;
  }

  /**
   * set variable pol2RetMarketType Corresponding COBOL Variable is POL2-RET-MARKET-TYPE
   *
   * @param value
   */
  public void setPol2RetMarketType(char[] value) {
    pol2RetMarketType = checkPol2RetMarketTypeConstraints(value);
    serializePol2RetMarketType(pol2RetMarketType);
  }

  /**
   * Update Pol2RetMarketType with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetMarketType, pol2RetMarketType.length);
  }

  public void setPol2RetMarketType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketType, pol2RetMarketType.length);
  }

  /**
   * Update Pol2RetMarketType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketType + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetMarketType with another Field
   *
   * @param value
   */
  public void setPol2RetMarketType(Field source) {
    replace(source, 0, source.length(), beginPol2RetMarketType, POL_2_RET_MARKET_TYPE_LEN);
  }

  /**
   * Update Pol2RetMarketType with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketType, POL_2_RET_MARKET_TYPE_LEN);
  }

  /**
   * Update Pol2RetMarketType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketType + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetMarketNumber
   *
   * @return pol2RetMarketNumber
   */
  public char[] getPol2RetMarketNumber() throws CFException {
    if (isPol2RetMarketNumberModified()) {
      pol2RetMarketNumber = refreshPol2RetMarketNumber();
    }
    return pol2RetMarketNumber;
  }

  /**
   * set variable pol2RetMarketNumber Corresponding COBOL Variable is POL2-RET-MARKET-NUMBER
   *
   * @param value
   */
  public void setPol2RetMarketNumber(char[] value) {
    pol2RetMarketNumber = checkPol2RetMarketNumberConstraints(value);
    serializePol2RetMarketNumber(pol2RetMarketNumber);
  }

  /**
   * Update Pol2RetMarketNumber with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketNumber(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol2RetMarketNumber, pol2RetMarketNumber.length);
  }

  public void setPol2RetMarketNumber(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketNumber, pol2RetMarketNumber.length);
  }

  /**
   * Update Pol2RetMarketNumber with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketNumber(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketNumber + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetMarketNumber with another Field
   *
   * @param value
   */
  public void setPol2RetMarketNumber(Field source) {
    replace(source, 0, source.length(), beginPol2RetMarketNumber, POL_2_RET_MARKET_NUMBER_LEN);
  }

  /**
   * Update Pol2RetMarketNumber with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketNumber(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketNumber, POL_2_RET_MARKET_NUMBER_LEN);
  }

  /**
   * Update Pol2RetMarketNumber with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMarketNumber(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMarketNumber + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetCrosswalkCorr
   *
   * @return pol2RetCrosswalkCorr
   */
  public char[] getPol2RetCrosswalkCorr() throws CFException {
    if (isPol2RetCrosswalkCorrModified()) {
      pol2RetCrosswalkCorr = refreshPol2RetCrosswalkCorr();
    }
    return pol2RetCrosswalkCorr;
  }

  /**
   * set variable pol2RetCrosswalkCorr Corresponding COBOL Variable is POL2-RET-CROSSWALK-CORR
   *
   * @param value
   */
  public void setPol2RetCrosswalkCorr(char[] value) {
    pol2RetCrosswalkCorr = checkPol2RetCrosswalkCorrConstraints(value);
    serializePol2RetCrosswalkCorr(pol2RetCrosswalkCorr);
  }

  /**
   * Update Pol2RetCrosswalkCorr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetCrosswalkCorr(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol2RetCrosswalkCorr, pol2RetCrosswalkCorr.length);
  }

  public void setPol2RetCrosswalkCorr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetCrosswalkCorr, pol2RetCrosswalkCorr.length);
  }

  /**
   * Update Pol2RetCrosswalkCorr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetCrosswalkCorr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetCrosswalkCorr + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetCrosswalkCorr with another Field
   *
   * @param value
   */
  public void setPol2RetCrosswalkCorr(Field source) {
    replace(source, 0, source.length(), beginPol2RetCrosswalkCorr, POL_2_RET_CROSSWALK_CORR_LEN);
  }

  /**
   * Update Pol2RetCrosswalkCorr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetCrosswalkCorr(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetCrosswalkCorr, POL_2_RET_CROSSWALK_CORR_LEN);
  }

  /**
   * Update Pol2RetCrosswalkCorr with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetCrosswalkCorr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetCrosswalkCorr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetIpaInd
   *
   * @return pol2RetIpaInd
   */
  public char[] getPol2RetIpaInd() throws CFException {
    if (isPol2RetIpaIndModified()) {
      pol2RetIpaInd = refreshPol2RetIpaInd();
    }
    return pol2RetIpaInd;
  }

  /**
   * set variable pol2RetIpaInd Corresponding COBOL Variable is POL2-RET-IPA-IND
   *
   * @param value
   */
  public void setPol2RetIpaInd(char[] value) {
    pol2RetIpaInd = checkPol2RetIpaIndConstraints(value);
    serializePol2RetIpaInd(pol2RetIpaInd);
  }

  /**
   * Update Pol2RetIpaInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetIpaInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetIpaInd, pol2RetIpaInd.length);
  }

  public void setPol2RetIpaInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetIpaInd, pol2RetIpaInd.length);
  }

  /**
   * Update Pol2RetIpaInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetIpaInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetIpaInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetIpaInd with another Field
   *
   * @param value
   */
  public void setPol2RetIpaInd(Field source) {
    replace(source, 0, source.length(), beginPol2RetIpaInd, POL_2_RET_IPA_IND_LEN);
  }

  /**
   * Update Pol2RetIpaInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetIpaInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetIpaInd, POL_2_RET_IPA_IND_LEN);
  }

  /**
   * Update Pol2RetIpaInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetIpaInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetIpaInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetGroupTableNum
   *
   * @return pol2RetGroupTableNum
   */
  public char[] getPol2RetGroupTableNum() throws CFException {
    if (isPol2RetGroupTableNumModified()) {
      pol2RetGroupTableNum = refreshPol2RetGroupTableNum();
    }
    return pol2RetGroupTableNum;
  }

  /**
   * set variable pol2RetGroupTableNum Corresponding COBOL Variable is POL2-RET-GROUP-TABLE-NUM
   *
   * @param value
   */
  public void setPol2RetGroupTableNum(char[] value) {
    pol2RetGroupTableNum = checkPol2RetGroupTableNumConstraints(value);
    serializePol2RetGroupTableNum(pol2RetGroupTableNum);
  }

  /**
   * Update Pol2RetGroupTableNum with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetGroupTableNum(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol2RetGroupTableNum, pol2RetGroupTableNum.length);
  }

  public void setPol2RetGroupTableNum(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetGroupTableNum, pol2RetGroupTableNum.length);
  }

  /**
   * Update Pol2RetGroupTableNum with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetGroupTableNum(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetGroupTableNum + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetGroupTableNum with another Field
   *
   * @param value
   */
  public void setPol2RetGroupTableNum(Field source) {
    replace(source, 0, source.length(), beginPol2RetGroupTableNum, POL_2_RET_GROUP_TABLE_NUM_LEN);
  }

  /**
   * Update Pol2RetGroupTableNum with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetGroupTableNum(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetGroupTableNum, POL_2_RET_GROUP_TABLE_NUM_LEN);
  }

  /**
   * Update Pol2RetGroupTableNum with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetGroupTableNum(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetGroupTableNum + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetContractArrangeCd
   *
   * @return pol2RetContractArrangeCd
   */
  public char[] getPol2RetContractArrangeCd() throws CFException {
    if (isPol2RetContractArrangeCdModified()) {
      pol2RetContractArrangeCd = refreshPol2RetContractArrangeCd();
    }
    return pol2RetContractArrangeCd;
  }

  /**
   * set variable pol2RetContractArrangeCd Corresponding COBOL Variable is
   * POL2-RET-CONTRACT-ARRANGE-CD
   *
   * @param value
   */
  public void setPol2RetContractArrangeCd(char[] value) {
    pol2RetContractArrangeCd = checkPol2RetContractArrangeCdConstraints(value);
    serializePol2RetContractArrangeCd(pol2RetContractArrangeCd);
  }

  /**
   * Update Pol2RetContractArrangeCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetContractArrangeCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol2RetContractArrangeCd,
        pol2RetContractArrangeCd.length);
  }

  public void setPol2RetContractArrangeCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetContractArrangeCd,
        pol2RetContractArrangeCd.length);
  }

  /**
   * Update Pol2RetContractArrangeCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetContractArrangeCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetContractArrangeCd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetContractArrangeCd with another Field
   *
   * @param value
   */
  public void setPol2RetContractArrangeCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol2RetContractArrangeCd,
        POL_2_RET_CONTRACT_ARRANGE_CD_LEN);
  }

  /**
   * Update Pol2RetContractArrangeCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetContractArrangeCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetContractArrangeCd,
        POL_2_RET_CONTRACT_ARRANGE_CD_LEN);
  }

  /**
   * Update Pol2RetContractArrangeCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetContractArrangeCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetContractArrangeCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetPolPlnPrefNtwkCd
   *
   * @return pol2RetPolPlnPrefNtwkCd
   */
  public char[] getPol2RetPolPlnPrefNtwkCd() throws CFException {
    if (isPol2RetPolPlnPrefNtwkCdModified()) {
      pol2RetPolPlnPrefNtwkCd = refreshPol2RetPolPlnPrefNtwkCd();
    }
    return pol2RetPolPlnPrefNtwkCd;
  }

  /**
   * set variable pol2RetPolPlnPrefNtwkCd Corresponding COBOL Variable is
   * POL2-RET-POL-PLN-PREF-NTWK-CD
   *
   * @param value
   */
  public void setPol2RetPolPlnPrefNtwkCd(char[] value) {
    pol2RetPolPlnPrefNtwkCd = checkPol2RetPolPlnPrefNtwkCdConstraints(value);
    serializePol2RetPolPlnPrefNtwkCd(pol2RetPolPlnPrefNtwkCd);
  }

  /**
   * Update Pol2RetPolPlnPrefNtwkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetPolPlnPrefNtwkCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol2RetPolPlnPrefNtwkCd,
        pol2RetPolPlnPrefNtwkCd.length);
  }

  public void setPol2RetPolPlnPrefNtwkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetPolPlnPrefNtwkCd,
        pol2RetPolPlnPrefNtwkCd.length);
  }

  /**
   * Update Pol2RetPolPlnPrefNtwkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetPolPlnPrefNtwkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPolPlnPrefNtwkCd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetPolPlnPrefNtwkCd with another Field
   *
   * @param value
   */
  public void setPol2RetPolPlnPrefNtwkCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol2RetPolPlnPrefNtwkCd,
        POL_2_RET_POL_PLN_PREF_NTWK_CD_LEN);
  }

  /**
   * Update Pol2RetPolPlnPrefNtwkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetPolPlnPrefNtwkCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetPolPlnPrefNtwkCd,
        POL_2_RET_POL_PLN_PREF_NTWK_CD_LEN);
  }

  /**
   * Update Pol2RetPolPlnPrefNtwkCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetPolPlnPrefNtwkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPolPlnPrefNtwkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetInclExclMarketInd
   *
   * @return pol2RetInclExclMarketInd
   */
  public char[] getPol2RetInclExclMarketInd() throws CFException {
    if (isPol2RetInclExclMarketIndModified()) {
      pol2RetInclExclMarketInd = refreshPol2RetInclExclMarketInd();
    }
    return pol2RetInclExclMarketInd;
  }

  /**
   * set variable pol2RetInclExclMarketInd Corresponding COBOL Variable is
   * POL2-RET-INCL-EXCL-MARKET-IND
   *
   * @param value
   */
  public void setPol2RetInclExclMarketInd(char[] value) {
    pol2RetInclExclMarketInd = checkPol2RetInclExclMarketIndConstraints(value);
    serializePol2RetInclExclMarketInd(pol2RetInclExclMarketInd);
  }

  /**
   * Update Pol2RetInclExclMarketInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetInclExclMarketInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol2RetInclExclMarketInd,
        pol2RetInclExclMarketInd.length);
  }

  public void setPol2RetInclExclMarketInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetInclExclMarketInd,
        pol2RetInclExclMarketInd.length);
  }

  /**
   * Update Pol2RetInclExclMarketInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetInclExclMarketInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetInclExclMarketInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetInclExclMarketInd with another Field
   *
   * @param value
   */
  public void setPol2RetInclExclMarketInd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol2RetInclExclMarketInd,
        POL_2_RET_INCL_EXCL_MARKET_IND_LEN);
  }

  /**
   * Update Pol2RetInclExclMarketInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetInclExclMarketInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetInclExclMarketInd,
        POL_2_RET_INCL_EXCL_MARKET_IND_LEN);
  }

  /**
   * Update Pol2RetInclExclMarketInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetInclExclMarketInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetInclExclMarketInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetMentalHealthInd
   *
   * @return pol2RetMentalHealthInd
   */
  public char[] getPol2RetMentalHealthInd() throws CFException {
    if (isPol2RetMentalHealthIndModified()) {
      pol2RetMentalHealthInd = refreshPol2RetMentalHealthInd();
    }
    return pol2RetMentalHealthInd;
  }

  /**
   * set variable pol2RetMentalHealthInd Corresponding COBOL Variable is POL2-RET-MENTAL-HEALTH-IND
   *
   * @param value
   */
  public void setPol2RetMentalHealthInd(char[] value) {
    pol2RetMentalHealthInd = checkPol2RetMentalHealthIndConstraints(value);
    serializePol2RetMentalHealthInd(pol2RetMentalHealthInd);
  }

  /**
   * Update Pol2RetMentalHealthInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetMentalHealthInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol2RetMentalHealthInd,
        pol2RetMentalHealthInd.length);
  }

  public void setPol2RetMentalHealthInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetMentalHealthInd, pol2RetMentalHealthInd.length);
  }

  /**
   * Update Pol2RetMentalHealthInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMentalHealthInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMentalHealthInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetMentalHealthInd with another Field
   *
   * @param value
   */
  public void setPol2RetMentalHealthInd(Field source) {
    replace(
        source, 0, source.length(), beginPol2RetMentalHealthInd, POL_2_RET_MENTAL_HEALTH_IND_LEN);
  }

  /**
   * Update Pol2RetMentalHealthInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetMentalHealthInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetMentalHealthInd,
        POL_2_RET_MENTAL_HEALTH_IND_LEN);
  }

  /**
   * Update Pol2RetMentalHealthInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetMentalHealthInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMentalHealthInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetTravelBenefitInd
   *
   * @return pol2RetTravelBenefitInd
   */
  public char[] getPol2RetTravelBenefitInd() throws CFException {
    if (isPol2RetTravelBenefitIndModified()) {
      pol2RetTravelBenefitInd = refreshPol2RetTravelBenefitInd();
    }
    return pol2RetTravelBenefitInd;
  }

  /**
   * set variable pol2RetTravelBenefitInd Corresponding COBOL Variable is
   * POL2-RET-TRAVEL-BENEFIT-IND
   *
   * @param value
   */
  public void setPol2RetTravelBenefitInd(char[] value) {
    pol2RetTravelBenefitInd = checkPol2RetTravelBenefitIndConstraints(value);
    serializePol2RetTravelBenefitInd(pol2RetTravelBenefitInd);
  }

  /**
   * Update Pol2RetTravelBenefitInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetTravelBenefitInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol2RetTravelBenefitInd,
        pol2RetTravelBenefitInd.length);
  }

  public void setPol2RetTravelBenefitInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetTravelBenefitInd,
        pol2RetTravelBenefitInd.length);
  }

  /**
   * Update Pol2RetTravelBenefitInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetTravelBenefitInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetTravelBenefitInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetTravelBenefitInd with another Field
   *
   * @param value
   */
  public void setPol2RetTravelBenefitInd(Field source) {
    replace(
        source, 0, source.length(), beginPol2RetTravelBenefitInd, POL_2_RET_TRAVEL_BENEFIT_IND_LEN);
  }

  /**
   * Update Pol2RetTravelBenefitInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetTravelBenefitInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetTravelBenefitInd,
        POL_2_RET_TRAVEL_BENEFIT_IND_LEN);
  }

  /**
   * Update Pol2RetTravelBenefitInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetTravelBenefitInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetTravelBenefitInd + targetIndex, targetLen);
  }

  /**
   * initializes Pol2RetReciprocityOccurs String fields defaults to Spaces short/int/long defaults
   * to zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol2RetProductCode(CONSTANTS.SPACE_3);
    setPol2RetMarketType(CONSTANTS.SPACE_2);
    setPol2RetMarketNumber(CONSTANTS.SPACE_7);
    setPol2RetCrosswalkCorr(CONSTANTS.SPACE);
    setPol2RetIpaInd(CONSTANTS.SPACE_5);
    setPol2RetGroupTableNum(CONSTANTS.SPACE_4);
    setPol2RetContractArrangeCd(CONSTANTS.SPACE);
    setPol2RetPolPlnPrefNtwkCd(CONSTANTS.SPACE);
    setPol2RetInclExclMarketInd(CONSTANTS.SPACE);
    setPol2RetMentalHealthInd(CONSTANTS.SPACE);
    setPol2RetTravelBenefitInd(CONSTANTS.SPACE);
  }

  public static int getPol2RetReciprocityOccursFieldLength() {
    return POL_2_RET_RECIPROCITY_OCCURS_LENGTH;
  }
}
