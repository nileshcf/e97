package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstrPpoArng is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclpolPlnMstrPpoArng extends DclpolPlnMstrPpoArngSerialized {

  private char[] dparCovTypCd = Field.fillLowValue(1);

  private char[] dparPolNbr = Field.fillLowValue(6);

  private char[] dparPlnNbr = Field.fillLowValue(4);

  private char[] dparClssNbr = Field.fillLowValue(4);

  private short dparSeqNbr;

  private char[] dparContrArngCd = Field.fillLowValue(1);

  private char[] dparIncExcInd = Field.fillLowValue(1);

  private char[] dparIpaNbr = Field.fillLowValue(5);

  private char[] dparLstUpdtDttm = Field.fillLowValue(26);

  private char[] dparLstUpdtUserId = Field.fillLowValue(9);

  private char[] dparMktNbr = Field.fillLowValue(7);

  private char[] dparMktTypCd = Field.fillLowValue(2);

  private char[] dparMntlHlthInd = Field.fillLowValue(1);

  private char[] dparPrdctCd = Field.fillLowValue(3);

  private char[] dparPrefNtwkCd = Field.fillLowValue(1);

  private char[] dparPsv1Cd = Field.fillLowValue(1);

  private char[] dparPsv2Cd = Field.fillLowValue(1);

  private char[] dparPsv3Cd = Field.fillLowValue(1);

  private char[] dparPsv4Cd = Field.fillLowValue(1);

  private char[] dparPsv5Cd = Field.fillLowValue(1);

  private char[] dparPsv6Cd = Field.fillLowValue(1);

  private char[] dparPsv7Cd = Field.fillLowValue(1);

  private char[] dparPsv8Cd = Field.fillLowValue(1);

  private char[] dparPsv9Cd = Field.fillLowValue(1);

  private char[] dparPsv10Cd = Field.fillLowValue(1);

  private char[] dparTravBenCd = Field.fillLowValue(1);

  /** Constructor for DclpolPlnMstrPpoArng */
  public DclpolPlnMstrPpoArng() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dparCovTypCd
   *
   * @return dparCovTypCd
   */
  public char[] getDparCovTypCd() throws CFException {
    if (isDparCovTypCdModified()) {
      dparCovTypCd = refreshDparCovTypCd();
    }
    return dparCovTypCd;
  }

  /**
   * set variable dparCovTypCd Corresponding COBOL Variable is DPAR-COV-TYP-CD
   *
   * @param value
   */
  public void setDparCovTypCd(char[] value) {
    dparCovTypCd = checkDparCovTypCdConstraints(value);
    serializeDparCovTypCd(dparCovTypCd);
  }

  /**
   * Update DparCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparCovTypCd, dparCovTypCd.length);
  }

  public void setDparCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparCovTypCd, dparCovTypCd.length);
  }

  /**
   * Update DparCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update DparCovTypCd with another Field
   *
   * @param value
   */
  public void setDparCovTypCd(Field source) {
    replace(source, 0, source.length(), beginDparCovTypCd, DPAR_COV_TYP_CD_LEN);
  }

  /**
   * Update DparCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparCovTypCd, DPAR_COV_TYP_CD_LEN);
  }

  /**
   * Update DparCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPolNbr
   *
   * @return dparPolNbr
   */
  public char[] getDparPolNbr() throws CFException {
    if (isDparPolNbrModified()) {
      dparPolNbr = refreshDparPolNbr();
    }
    return dparPolNbr;
  }

  /**
   * set variable dparPolNbr Corresponding COBOL Variable is DPAR-POL-NBR
   *
   * @param value
   */
  public void setDparPolNbr(char[] value) {
    dparPolNbr = checkDparPolNbrConstraints(value);
    serializeDparPolNbr(dparPolNbr);
  }

  /**
   * Update DparPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPolNbr, dparPolNbr.length);
  }

  public void setDparPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPolNbr, dparPolNbr.length);
  }

  /**
   * Update DparPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPolNbr + targetIndex, targetLen);
  }

  /**
   * Update DparPolNbr with another Field
   *
   * @param value
   */
  public void setDparPolNbr(Field source) {
    replace(source, 0, source.length(), beginDparPolNbr, DPAR_POL_NBR_LEN);
  }

  /**
   * Update DparPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPolNbr, DPAR_POL_NBR_LEN);
  }

  /**
   * Update DparPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPlnNbr
   *
   * @return dparPlnNbr
   */
  public char[] getDparPlnNbr() throws CFException {
    if (isDparPlnNbrModified()) {
      dparPlnNbr = refreshDparPlnNbr();
    }
    return dparPlnNbr;
  }

  /**
   * set variable dparPlnNbr Corresponding COBOL Variable is DPAR-PLN-NBR
   *
   * @param value
   */
  public void setDparPlnNbr(char[] value) {
    dparPlnNbr = checkDparPlnNbrConstraints(value);
    serializeDparPlnNbr(dparPlnNbr);
  }

  /**
   * Update DparPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPlnNbr, dparPlnNbr.length);
  }

  public void setDparPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPlnNbr, dparPlnNbr.length);
  }

  /**
   * Update DparPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DparPlnNbr with another Field
   *
   * @param value
   */
  public void setDparPlnNbr(Field source) {
    replace(source, 0, source.length(), beginDparPlnNbr, DPAR_PLN_NBR_LEN);
  }

  /**
   * Update DparPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPlnNbr, DPAR_PLN_NBR_LEN);
  }

  /**
   * Update DparPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparClssNbr
   *
   * @return dparClssNbr
   */
  public char[] getDparClssNbr() throws CFException {
    if (isDparClssNbrModified()) {
      dparClssNbr = refreshDparClssNbr();
    }
    return dparClssNbr;
  }

  /**
   * set variable dparClssNbr Corresponding COBOL Variable is DPAR-CLSS-NBR
   *
   * @param value
   */
  public void setDparClssNbr(char[] value) {
    dparClssNbr = checkDparClssNbrConstraints(value);
    serializeDparClssNbr(dparClssNbr);
  }

  /**
   * Update DparClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparClssNbr, dparClssNbr.length);
  }

  public void setDparClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparClssNbr, dparClssNbr.length);
  }

  /**
   * Update DparClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DparClssNbr with another Field
   *
   * @param value
   */
  public void setDparClssNbr(Field source) {
    replace(source, 0, source.length(), beginDparClssNbr, DPAR_CLSS_NBR_LEN);
  }

  /**
   * Update DparClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDparClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparClssNbr, DPAR_CLSS_NBR_LEN);
  }

  /**
   * Update DparClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparSeqNbr
   *
   * @return dparSeqNbr
   */
  public short getDparSeqNbr() throws CFException {
    if (isDparSeqNbrModified()) {
      dparSeqNbr = refreshDparSeqNbr();
    }
    return dparSeqNbr;
  }

  /**
   * Update DparSeqNbr with the passed value Corresponding COBOL Variable is DPAR-SEQ-NBR
   *
   * @param number
   */
  public void setDparSeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    dparSeqNbr = checkDparSeqNbrMaxLimit(number);
    serializeDparSeqNbr(dparSeqNbr);
  }

  public void setDparSeqNbr(int number) {
    number = checkDparSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDparSeqNbr((short) number);
  }

  public void setDparSeqNbr(long number) {
    number = checkDparSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDparSeqNbr((short) number);
  }

  /**
   * Returns the value of dparContrArngCd
   *
   * @return dparContrArngCd
   */
  public char[] getDparContrArngCd() throws CFException {
    if (isDparContrArngCdModified()) {
      dparContrArngCd = refreshDparContrArngCd();
    }
    return dparContrArngCd;
  }

  /**
   * set variable dparContrArngCd Corresponding COBOL Variable is DPAR-CONTR-ARNG-CD
   *
   * @param value
   */
  public void setDparContrArngCd(char[] value) {
    dparContrArngCd = checkDparContrArngCdConstraints(value);
    serializeDparContrArngCd(dparContrArngCd);
  }

  /**
   * Update DparContrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparContrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparContrArngCd, dparContrArngCd.length);
  }

  public void setDparContrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparContrArngCd, dparContrArngCd.length);
  }

  /**
   * Update DparContrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparContrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparContrArngCd + targetIndex, targetLen);
  }

  /**
   * Update DparContrArngCd with another Field
   *
   * @param value
   */
  public void setDparContrArngCd(Field source) {
    replace(source, 0, source.length(), beginDparContrArngCd, DPAR_CONTR_ARNG_CD_LEN);
  }

  /**
   * Update DparContrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparContrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparContrArngCd, DPAR_CONTR_ARNG_CD_LEN);
  }

  /**
   * Update DparContrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparContrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparContrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparIncExcInd
   *
   * @return dparIncExcInd
   */
  public char[] getDparIncExcInd() throws CFException {
    if (isDparIncExcIndModified()) {
      dparIncExcInd = refreshDparIncExcInd();
    }
    return dparIncExcInd;
  }

  /**
   * set variable dparIncExcInd Corresponding COBOL Variable is DPAR-INC-EXC-IND
   *
   * @param value
   */
  public void setDparIncExcInd(char[] value) {
    dparIncExcInd = checkDparIncExcIndConstraints(value);
    serializeDparIncExcInd(dparIncExcInd);
  }

  /**
   * Update DparIncExcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparIncExcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparIncExcInd, dparIncExcInd.length);
  }

  public void setDparIncExcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparIncExcInd, dparIncExcInd.length);
  }

  /**
   * Update DparIncExcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparIncExcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparIncExcInd + targetIndex, targetLen);
  }

  /**
   * Update DparIncExcInd with another Field
   *
   * @param value
   */
  public void setDparIncExcInd(Field source) {
    replace(source, 0, source.length(), beginDparIncExcInd, DPAR_INC_EXC_IND_LEN);
  }

  /**
   * Update DparIncExcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparIncExcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparIncExcInd, DPAR_INC_EXC_IND_LEN);
  }

  /**
   * Update DparIncExcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparIncExcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparIncExcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparIpaNbr
   *
   * @return dparIpaNbr
   */
  public char[] getDparIpaNbr() throws CFException {
    if (isDparIpaNbrModified()) {
      dparIpaNbr = refreshDparIpaNbr();
    }
    return dparIpaNbr;
  }

  /**
   * set variable dparIpaNbr Corresponding COBOL Variable is DPAR-IPA-NBR
   *
   * @param value
   */
  public void setDparIpaNbr(char[] value) {
    dparIpaNbr = checkDparIpaNbrConstraints(value);
    serializeDparIpaNbr(dparIpaNbr);
  }

  /**
   * Update DparIpaNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparIpaNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparIpaNbr, dparIpaNbr.length);
  }

  public void setDparIpaNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparIpaNbr, dparIpaNbr.length);
  }

  /**
   * Update DparIpaNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparIpaNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparIpaNbr + targetIndex, targetLen);
  }

  /**
   * Update DparIpaNbr with another Field
   *
   * @param value
   */
  public void setDparIpaNbr(Field source) {
    replace(source, 0, source.length(), beginDparIpaNbr, DPAR_IPA_NBR_LEN);
  }

  /**
   * Update DparIpaNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDparIpaNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparIpaNbr, DPAR_IPA_NBR_LEN);
  }

  /**
   * Update DparIpaNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparIpaNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparIpaNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparLstUpdtDttm
   *
   * @return dparLstUpdtDttm
   */
  public char[] getDparLstUpdtDttm() throws CFException {
    if (isDparLstUpdtDttmModified()) {
      dparLstUpdtDttm = refreshDparLstUpdtDttm();
    }
    return dparLstUpdtDttm;
  }

  /**
   * set variable dparLstUpdtDttm Corresponding COBOL Variable is DPAR-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setDparLstUpdtDttm(char[] value) {
    dparLstUpdtDttm = checkDparLstUpdtDttmConstraints(value);
    serializeDparLstUpdtDttm(dparLstUpdtDttm);
  }

  /**
   * Update DparLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparLstUpdtDttm, dparLstUpdtDttm.length);
  }

  public void setDparLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtDttm, dparLstUpdtDttm.length);
  }

  /**
   * Update DparLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update DparLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setDparLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginDparLstUpdtDttm, DPAR_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DparLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtDttm, DPAR_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DparLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparLstUpdtUserId
   *
   * @return dparLstUpdtUserId
   */
  public char[] getDparLstUpdtUserId() throws CFException {
    if (isDparLstUpdtUserIdModified()) {
      dparLstUpdtUserId = refreshDparLstUpdtUserId();
    }
    return dparLstUpdtUserId;
  }

  /**
   * set variable dparLstUpdtUserId Corresponding COBOL Variable is DPAR-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setDparLstUpdtUserId(char[] value) {
    dparLstUpdtUserId = checkDparLstUpdtUserIdConstraints(value);
    serializeDparLstUpdtUserId(dparLstUpdtUserId);
  }

  /**
   * Update DparLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparLstUpdtUserId, dparLstUpdtUserId.length);
  }

  public void setDparLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtUserId, dparLstUpdtUserId.length);
  }

  /**
   * Update DparLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update DparLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setDparLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginDparLstUpdtUserId, DPAR_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DparLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtUserId, DPAR_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DparLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparLstUpdtUserId + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparMktNbr
   *
   * @return dparMktNbr
   */
  public char[] getDparMktNbr() throws CFException {
    if (isDparMktNbrModified()) {
      dparMktNbr = refreshDparMktNbr();
    }
    return dparMktNbr;
  }

  /**
   * set variable dparMktNbr Corresponding COBOL Variable is DPAR-MKT-NBR
   *
   * @param value
   */
  public void setDparMktNbr(char[] value) {
    dparMktNbr = checkDparMktNbrConstraints(value);
    serializeDparMktNbr(dparMktNbr);
  }

  /**
   * Update DparMktNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparMktNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparMktNbr, dparMktNbr.length);
  }

  public void setDparMktNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktNbr, dparMktNbr.length);
  }

  /**
   * Update DparMktNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparMktNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktNbr + targetIndex, targetLen);
  }

  /**
   * Update DparMktNbr with another Field
   *
   * @param value
   */
  public void setDparMktNbr(Field source) {
    replace(source, 0, source.length(), beginDparMktNbr, DPAR_MKT_NBR_LEN);
  }

  /**
   * Update DparMktNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDparMktNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktNbr, DPAR_MKT_NBR_LEN);
  }

  /**
   * Update DparMktNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparMktNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparMktTypCd
   *
   * @return dparMktTypCd
   */
  public char[] getDparMktTypCd() throws CFException {
    if (isDparMktTypCdModified()) {
      dparMktTypCd = refreshDparMktTypCd();
    }
    return dparMktTypCd;
  }

  /**
   * set variable dparMktTypCd Corresponding COBOL Variable is DPAR-MKT-TYP-CD
   *
   * @param value
   */
  public void setDparMktTypCd(char[] value) {
    dparMktTypCd = checkDparMktTypCdConstraints(value);
    serializeDparMktTypCd(dparMktTypCd);
  }

  /**
   * Update DparMktTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparMktTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparMktTypCd, dparMktTypCd.length);
  }

  public void setDparMktTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktTypCd, dparMktTypCd.length);
  }

  /**
   * Update DparMktTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparMktTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktTypCd + targetIndex, targetLen);
  }

  /**
   * Update DparMktTypCd with another Field
   *
   * @param value
   */
  public void setDparMktTypCd(Field source) {
    replace(source, 0, source.length(), beginDparMktTypCd, DPAR_MKT_TYP_CD_LEN);
  }

  /**
   * Update DparMktTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparMktTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktTypCd, DPAR_MKT_TYP_CD_LEN);
  }

  /**
   * Update DparMktTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparMktTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparMktTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparMntlHlthInd
   *
   * @return dparMntlHlthInd
   */
  public char[] getDparMntlHlthInd() throws CFException {
    if (isDparMntlHlthIndModified()) {
      dparMntlHlthInd = refreshDparMntlHlthInd();
    }
    return dparMntlHlthInd;
  }

  /**
   * set variable dparMntlHlthInd Corresponding COBOL Variable is DPAR-MNTL-HLTH-IND
   *
   * @param value
   */
  public void setDparMntlHlthInd(char[] value) {
    dparMntlHlthInd = checkDparMntlHlthIndConstraints(value);
    serializeDparMntlHlthInd(dparMntlHlthInd);
  }

  /**
   * Update DparMntlHlthInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparMntlHlthInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparMntlHlthInd, dparMntlHlthInd.length);
  }

  public void setDparMntlHlthInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparMntlHlthInd, dparMntlHlthInd.length);
  }

  /**
   * Update DparMntlHlthInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparMntlHlthInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparMntlHlthInd + targetIndex, targetLen);
  }

  /**
   * Update DparMntlHlthInd with another Field
   *
   * @param value
   */
  public void setDparMntlHlthInd(Field source) {
    replace(source, 0, source.length(), beginDparMntlHlthInd, DPAR_MNTL_HLTH_IND_LEN);
  }

  /**
   * Update DparMntlHlthInd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparMntlHlthInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparMntlHlthInd, DPAR_MNTL_HLTH_IND_LEN);
  }

  /**
   * Update DparMntlHlthInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparMntlHlthInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparMntlHlthInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPrdctCd
   *
   * @return dparPrdctCd
   */
  public char[] getDparPrdctCd() throws CFException {
    if (isDparPrdctCdModified()) {
      dparPrdctCd = refreshDparPrdctCd();
    }
    return dparPrdctCd;
  }

  /**
   * set variable dparPrdctCd Corresponding COBOL Variable is DPAR-PRDCT-CD
   *
   * @param value
   */
  public void setDparPrdctCd(char[] value) {
    dparPrdctCd = checkDparPrdctCdConstraints(value);
    serializeDparPrdctCd(dparPrdctCd);
  }

  /**
   * Update DparPrdctCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPrdctCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPrdctCd, dparPrdctCd.length);
  }

  public void setDparPrdctCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrdctCd, dparPrdctCd.length);
  }

  /**
   * Update DparPrdctCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPrdctCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrdctCd + targetIndex, targetLen);
  }

  /**
   * Update DparPrdctCd with another Field
   *
   * @param value
   */
  public void setDparPrdctCd(Field source) {
    replace(source, 0, source.length(), beginDparPrdctCd, DPAR_PRDCT_CD_LEN);
  }

  /**
   * Update DparPrdctCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPrdctCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrdctCd, DPAR_PRDCT_CD_LEN);
  }

  /**
   * Update DparPrdctCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPrdctCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrdctCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPrefNtwkCd
   *
   * @return dparPrefNtwkCd
   */
  public char[] getDparPrefNtwkCd() throws CFException {
    if (isDparPrefNtwkCdModified()) {
      dparPrefNtwkCd = refreshDparPrefNtwkCd();
    }
    return dparPrefNtwkCd;
  }

  /**
   * set variable dparPrefNtwkCd Corresponding COBOL Variable is DPAR-PREF-NTWK-CD
   *
   * @param value
   */
  public void setDparPrefNtwkCd(char[] value) {
    dparPrefNtwkCd = checkDparPrefNtwkCdConstraints(value);
    serializeDparPrefNtwkCd(dparPrefNtwkCd);
  }

  /**
   * Update DparPrefNtwkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPrefNtwkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPrefNtwkCd, dparPrefNtwkCd.length);
  }

  public void setDparPrefNtwkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrefNtwkCd, dparPrefNtwkCd.length);
  }

  /**
   * Update DparPrefNtwkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPrefNtwkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrefNtwkCd + targetIndex, targetLen);
  }

  /**
   * Update DparPrefNtwkCd with another Field
   *
   * @param value
   */
  public void setDparPrefNtwkCd(Field source) {
    replace(source, 0, source.length(), beginDparPrefNtwkCd, DPAR_PREF_NTWK_CD_LEN);
  }

  /**
   * Update DparPrefNtwkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPrefNtwkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrefNtwkCd, DPAR_PREF_NTWK_CD_LEN);
  }

  /**
   * Update DparPrefNtwkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPrefNtwkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPrefNtwkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv1Cd
   *
   * @return dparPsv1Cd
   */
  public char[] getDparPsv1Cd() throws CFException {
    if (isDparPsv1CdModified()) {
      dparPsv1Cd = refreshDparPsv1Cd();
    }
    return dparPsv1Cd;
  }

  /**
   * set variable dparPsv1Cd Corresponding COBOL Variable is DPAR-PSV-1-CD
   *
   * @param value
   */
  public void setDparPsv1Cd(char[] value) {
    dparPsv1Cd = checkDparPsv1CdConstraints(value);
    serializeDparPsv1Cd(dparPsv1Cd);
  }

  /**
   * Update DparPsv1Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv1Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv1Cd, dparPsv1Cd.length);
  }

  public void setDparPsv1Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv1Cd, dparPsv1Cd.length);
  }

  /**
   * Update DparPsv1Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv1Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv1Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv1Cd with another Field
   *
   * @param value
   */
  public void setDparPsv1Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv1Cd, DPAR_PSV_1_CD_LEN);
  }

  /**
   * Update DparPsv1Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv1Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv1Cd, DPAR_PSV_1_CD_LEN);
  }

  /**
   * Update DparPsv1Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv1Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv1Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv2Cd
   *
   * @return dparPsv2Cd
   */
  public char[] getDparPsv2Cd() throws CFException {
    if (isDparPsv2CdModified()) {
      dparPsv2Cd = refreshDparPsv2Cd();
    }
    return dparPsv2Cd;
  }

  /**
   * set variable dparPsv2Cd Corresponding COBOL Variable is DPAR-PSV-2-CD
   *
   * @param value
   */
  public void setDparPsv2Cd(char[] value) {
    dparPsv2Cd = checkDparPsv2CdConstraints(value);
    serializeDparPsv2Cd(dparPsv2Cd);
  }

  /**
   * Update DparPsv2Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv2Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv2Cd, dparPsv2Cd.length);
  }

  public void setDparPsv2Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv2Cd, dparPsv2Cd.length);
  }

  /**
   * Update DparPsv2Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv2Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv2Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv2Cd with another Field
   *
   * @param value
   */
  public void setDparPsv2Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv2Cd, DPAR_PSV_2_CD_LEN);
  }

  /**
   * Update DparPsv2Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv2Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv2Cd, DPAR_PSV_2_CD_LEN);
  }

  /**
   * Update DparPsv2Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv2Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv2Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv3Cd
   *
   * @return dparPsv3Cd
   */
  public char[] getDparPsv3Cd() throws CFException {
    if (isDparPsv3CdModified()) {
      dparPsv3Cd = refreshDparPsv3Cd();
    }
    return dparPsv3Cd;
  }

  /**
   * set variable dparPsv3Cd Corresponding COBOL Variable is DPAR-PSV-3-CD
   *
   * @param value
   */
  public void setDparPsv3Cd(char[] value) {
    dparPsv3Cd = checkDparPsv3CdConstraints(value);
    serializeDparPsv3Cd(dparPsv3Cd);
  }

  /**
   * Update DparPsv3Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv3Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv3Cd, dparPsv3Cd.length);
  }

  public void setDparPsv3Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv3Cd, dparPsv3Cd.length);
  }

  /**
   * Update DparPsv3Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv3Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv3Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv3Cd with another Field
   *
   * @param value
   */
  public void setDparPsv3Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv3Cd, DPAR_PSV_3_CD_LEN);
  }

  /**
   * Update DparPsv3Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv3Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv3Cd, DPAR_PSV_3_CD_LEN);
  }

  /**
   * Update DparPsv3Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv3Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv3Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv4Cd
   *
   * @return dparPsv4Cd
   */
  public char[] getDparPsv4Cd() throws CFException {
    if (isDparPsv4CdModified()) {
      dparPsv4Cd = refreshDparPsv4Cd();
    }
    return dparPsv4Cd;
  }

  /**
   * set variable dparPsv4Cd Corresponding COBOL Variable is DPAR-PSV-4-CD
   *
   * @param value
   */
  public void setDparPsv4Cd(char[] value) {
    dparPsv4Cd = checkDparPsv4CdConstraints(value);
    serializeDparPsv4Cd(dparPsv4Cd);
  }

  /**
   * Update DparPsv4Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv4Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv4Cd, dparPsv4Cd.length);
  }

  public void setDparPsv4Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv4Cd, dparPsv4Cd.length);
  }

  /**
   * Update DparPsv4Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv4Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv4Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv4Cd with another Field
   *
   * @param value
   */
  public void setDparPsv4Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv4Cd, DPAR_PSV_4_CD_LEN);
  }

  /**
   * Update DparPsv4Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv4Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv4Cd, DPAR_PSV_4_CD_LEN);
  }

  /**
   * Update DparPsv4Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv4Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv4Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv5Cd
   *
   * @return dparPsv5Cd
   */
  public char[] getDparPsv5Cd() throws CFException {
    if (isDparPsv5CdModified()) {
      dparPsv5Cd = refreshDparPsv5Cd();
    }
    return dparPsv5Cd;
  }

  /**
   * set variable dparPsv5Cd Corresponding COBOL Variable is DPAR-PSV-5-CD
   *
   * @param value
   */
  public void setDparPsv5Cd(char[] value) {
    dparPsv5Cd = checkDparPsv5CdConstraints(value);
    serializeDparPsv5Cd(dparPsv5Cd);
  }

  /**
   * Update DparPsv5Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv5Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv5Cd, dparPsv5Cd.length);
  }

  public void setDparPsv5Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv5Cd, dparPsv5Cd.length);
  }

  /**
   * Update DparPsv5Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv5Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv5Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv5Cd with another Field
   *
   * @param value
   */
  public void setDparPsv5Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv5Cd, DPAR_PSV_5_CD_LEN);
  }

  /**
   * Update DparPsv5Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv5Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv5Cd, DPAR_PSV_5_CD_LEN);
  }

  /**
   * Update DparPsv5Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv5Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv5Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv6Cd
   *
   * @return dparPsv6Cd
   */
  public char[] getDparPsv6Cd() throws CFException {
    if (isDparPsv6CdModified()) {
      dparPsv6Cd = refreshDparPsv6Cd();
    }
    return dparPsv6Cd;
  }

  /**
   * set variable dparPsv6Cd Corresponding COBOL Variable is DPAR-PSV-6-CD
   *
   * @param value
   */
  public void setDparPsv6Cd(char[] value) {
    dparPsv6Cd = checkDparPsv6CdConstraints(value);
    serializeDparPsv6Cd(dparPsv6Cd);
  }

  /**
   * Update DparPsv6Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv6Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv6Cd, dparPsv6Cd.length);
  }

  public void setDparPsv6Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv6Cd, dparPsv6Cd.length);
  }

  /**
   * Update DparPsv6Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv6Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv6Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv6Cd with another Field
   *
   * @param value
   */
  public void setDparPsv6Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv6Cd, DPAR_PSV_6_CD_LEN);
  }

  /**
   * Update DparPsv6Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv6Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv6Cd, DPAR_PSV_6_CD_LEN);
  }

  /**
   * Update DparPsv6Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv6Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv6Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv7Cd
   *
   * @return dparPsv7Cd
   */
  public char[] getDparPsv7Cd() throws CFException {
    if (isDparPsv7CdModified()) {
      dparPsv7Cd = refreshDparPsv7Cd();
    }
    return dparPsv7Cd;
  }

  /**
   * set variable dparPsv7Cd Corresponding COBOL Variable is DPAR-PSV-7-CD
   *
   * @param value
   */
  public void setDparPsv7Cd(char[] value) {
    dparPsv7Cd = checkDparPsv7CdConstraints(value);
    serializeDparPsv7Cd(dparPsv7Cd);
  }

  /**
   * Update DparPsv7Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv7Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv7Cd, dparPsv7Cd.length);
  }

  public void setDparPsv7Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv7Cd, dparPsv7Cd.length);
  }

  /**
   * Update DparPsv7Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv7Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv7Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv7Cd with another Field
   *
   * @param value
   */
  public void setDparPsv7Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv7Cd, DPAR_PSV_7_CD_LEN);
  }

  /**
   * Update DparPsv7Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv7Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv7Cd, DPAR_PSV_7_CD_LEN);
  }

  /**
   * Update DparPsv7Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv7Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv7Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv8Cd
   *
   * @return dparPsv8Cd
   */
  public char[] getDparPsv8Cd() throws CFException {
    if (isDparPsv8CdModified()) {
      dparPsv8Cd = refreshDparPsv8Cd();
    }
    return dparPsv8Cd;
  }

  /**
   * set variable dparPsv8Cd Corresponding COBOL Variable is DPAR-PSV-8-CD
   *
   * @param value
   */
  public void setDparPsv8Cd(char[] value) {
    dparPsv8Cd = checkDparPsv8CdConstraints(value);
    serializeDparPsv8Cd(dparPsv8Cd);
  }

  /**
   * Update DparPsv8Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv8Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv8Cd, dparPsv8Cd.length);
  }

  public void setDparPsv8Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv8Cd, dparPsv8Cd.length);
  }

  /**
   * Update DparPsv8Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv8Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv8Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv8Cd with another Field
   *
   * @param value
   */
  public void setDparPsv8Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv8Cd, DPAR_PSV_8_CD_LEN);
  }

  /**
   * Update DparPsv8Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv8Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv8Cd, DPAR_PSV_8_CD_LEN);
  }

  /**
   * Update DparPsv8Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv8Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv8Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv9Cd
   *
   * @return dparPsv9Cd
   */
  public char[] getDparPsv9Cd() throws CFException {
    if (isDparPsv9CdModified()) {
      dparPsv9Cd = refreshDparPsv9Cd();
    }
    return dparPsv9Cd;
  }

  /**
   * set variable dparPsv9Cd Corresponding COBOL Variable is DPAR-PSV-9-CD
   *
   * @param value
   */
  public void setDparPsv9Cd(char[] value) {
    dparPsv9Cd = checkDparPsv9CdConstraints(value);
    serializeDparPsv9Cd(dparPsv9Cd);
  }

  /**
   * Update DparPsv9Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv9Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv9Cd, dparPsv9Cd.length);
  }

  public void setDparPsv9Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv9Cd, dparPsv9Cd.length);
  }

  /**
   * Update DparPsv9Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv9Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv9Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv9Cd with another Field
   *
   * @param value
   */
  public void setDparPsv9Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv9Cd, DPAR_PSV_9_CD_LEN);
  }

  /**
   * Update DparPsv9Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv9Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv9Cd, DPAR_PSV_9_CD_LEN);
  }

  /**
   * Update DparPsv9Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv9Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv9Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparPsv10Cd
   *
   * @return dparPsv10Cd
   */
  public char[] getDparPsv10Cd() throws CFException {
    if (isDparPsv10CdModified()) {
      dparPsv10Cd = refreshDparPsv10Cd();
    }
    return dparPsv10Cd;
  }

  /**
   * set variable dparPsv10Cd Corresponding COBOL Variable is DPAR-PSV-10-CD
   *
   * @param value
   */
  public void setDparPsv10Cd(char[] value) {
    dparPsv10Cd = checkDparPsv10CdConstraints(value);
    serializeDparPsv10Cd(dparPsv10Cd);
  }

  /**
   * Update DparPsv10Cd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparPsv10Cd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparPsv10Cd, dparPsv10Cd.length);
  }

  public void setDparPsv10Cd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv10Cd, dparPsv10Cd.length);
  }

  /**
   * Update DparPsv10Cd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv10Cd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv10Cd + targetIndex, targetLen);
  }

  /**
   * Update DparPsv10Cd with another Field
   *
   * @param value
   */
  public void setDparPsv10Cd(Field source) {
    replace(source, 0, source.length(), beginDparPsv10Cd, DPAR_PSV_10_CD_LEN);
  }

  /**
   * Update DparPsv10Cd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparPsv10Cd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv10Cd, DPAR_PSV_10_CD_LEN);
  }

  /**
   * Update DparPsv10Cd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparPsv10Cd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparPsv10Cd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dparTravBenCd
   *
   * @return dparTravBenCd
   */
  public char[] getDparTravBenCd() throws CFException {
    if (isDparTravBenCdModified()) {
      dparTravBenCd = refreshDparTravBenCd();
    }
    return dparTravBenCd;
  }

  /**
   * set variable dparTravBenCd Corresponding COBOL Variable is DPAR-TRAV-BEN-CD
   *
   * @param value
   */
  public void setDparTravBenCd(char[] value) {
    dparTravBenCd = checkDparTravBenCdConstraints(value);
    serializeDparTravBenCd(dparTravBenCd);
  }

  /**
   * Update DparTravBenCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDparTravBenCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDparTravBenCd, dparTravBenCd.length);
  }

  public void setDparTravBenCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparTravBenCd, dparTravBenCd.length);
  }

  /**
   * Update DparTravBenCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparTravBenCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparTravBenCd + targetIndex, targetLen);
  }

  /**
   * Update DparTravBenCd with another Field
   *
   * @param value
   */
  public void setDparTravBenCd(Field source) {
    replace(source, 0, source.length(), beginDparTravBenCd, DPAR_TRAV_BEN_CD_LEN);
  }

  /**
   * Update DparTravBenCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDparTravBenCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDparTravBenCd, DPAR_TRAV_BEN_CD_LEN);
  }

  /**
   * Update DparTravBenCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDparTravBenCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDparTravBenCd + targetIndex, targetLen);
  }

  /**
   * initializes DclpolPlnMstrPpoArng String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDparCovTypCd(CONSTANTS.SPACE);
    setDparPolNbr(CONSTANTS.SPACE_6);
    setDparPlnNbr(CONSTANTS.SPACE_4);
    setDparClssNbr(CONSTANTS.SPACE_4);
    setDparSeqNbr((short) 0);
    setDparContrArngCd(CONSTANTS.SPACE);
    setDparIncExcInd(CONSTANTS.SPACE);
    setDparIpaNbr(CONSTANTS.SPACE_5);
    setDparLstUpdtDttm(CONSTANTS.SPACE_26);
    setDparLstUpdtUserId(CONSTANTS.SPACE_9);
    setDparMktNbr(CONSTANTS.SPACE_7);
    setDparMktTypCd(CONSTANTS.SPACE_2);
    setDparMntlHlthInd(CONSTANTS.SPACE);
    setDparPrdctCd(CONSTANTS.SPACE_3);
    setDparPrefNtwkCd(CONSTANTS.SPACE);
    setDparPsv1Cd(CONSTANTS.SPACE);
    setDparPsv2Cd(CONSTANTS.SPACE);
    setDparPsv3Cd(CONSTANTS.SPACE);
    setDparPsv4Cd(CONSTANTS.SPACE);
    setDparPsv5Cd(CONSTANTS.SPACE);
    setDparPsv6Cd(CONSTANTS.SPACE);
    setDparPsv7Cd(CONSTANTS.SPACE);
    setDparPsv8Cd(CONSTANTS.SPACE);
    setDparPsv9Cd(CONSTANTS.SPACE);
    setDparPsv10Cd(CONSTANTS.SPACE);
    setDparTravBenCd(CONSTANTS.SPACE);
  }

  public static int getDclpolPlnMstrPpoArngFieldLength() {
    return DCLPOL_PLN_MSTR_PPO_ARNG_LENGTH;
  }
}
