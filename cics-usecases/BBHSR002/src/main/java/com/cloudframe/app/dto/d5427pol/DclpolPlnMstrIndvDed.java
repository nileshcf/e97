package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstrIndvDed is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclpolPlnMstrIndvDed extends DclpolPlnMstrIndvDedSerialized {

  private char[] dideCovTypCd = Field.fillLowValue(1);

  private char[] didePolNbr = Field.fillLowValue(6);

  private char[] didePlnNbr = Field.fillLowValue(4);

  private char[] dideClssNbr = Field.fillLowValue(4);

  private short dideSeqNbr;

  private char[] dideDedAccumCd = Field.fillLowValue(1);

  private short dideDedAccumPdAmt;

  private int dideDedAmt;

  private short dideDedBenPdAmt;

  private char[] dideDedCaroCd = Field.fillLowValue(1);

  private char[] dideDedCd = Field.fillLowValue(1);

  private char[] dideDedCobCd = Field.fillLowValue(1);

  private char[] dideDedCstCntnCd = Field.fillLowValue(1);

  private char[] dideDedEndDt = Field.fillLowValue(10);

  private char[] dideDedFreqCd = Field.fillLowValue(1);

  private int dideDedMntAmt;

  private char[] dideDedMntCd = Field.fillLowValue(1);

  private short dideDedMntPdAmt;

  private char[] dideDedNtwkTypCd = Field.fillLowValue(1);

  private char[] dideDedSemiPvtRtCd = Field.fillLowValue(1);

  private char[] dideDedSrvcDesc = Field.fillLowValue(6);

  private char[] dideLstUpdtDttm = Field.fillLowValue(26);

  private char[] dideLstUpdtUserId = Field.fillLowValue(9);

  /** Constructor for DclpolPlnMstrIndvDed */
  public DclpolPlnMstrIndvDed() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dideCovTypCd
   *
   * @return dideCovTypCd
   */
  public char[] getDideCovTypCd() throws CFException {
    if (isDideCovTypCdModified()) {
      dideCovTypCd = refreshDideCovTypCd();
    }
    return dideCovTypCd;
  }

  /**
   * set variable dideCovTypCd Corresponding COBOL Variable is DIDE-COV-TYP-CD
   *
   * @param value
   */
  public void setDideCovTypCd(char[] value) {
    dideCovTypCd = checkDideCovTypCdConstraints(value);
    serializeDideCovTypCd(dideCovTypCd);
  }

  /**
   * Update DideCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideCovTypCd, dideCovTypCd.length);
  }

  public void setDideCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideCovTypCd, dideCovTypCd.length);
  }

  /**
   * Update DideCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update DideCovTypCd with another Field
   *
   * @param value
   */
  public void setDideCovTypCd(Field source) {
    replace(source, 0, source.length(), beginDideCovTypCd, DIDE_COV_TYP_CD_LEN);
  }

  /**
   * Update DideCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideCovTypCd, DIDE_COV_TYP_CD_LEN);
  }

  /**
   * Update DideCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of didePolNbr
   *
   * @return didePolNbr
   */
  public char[] getDidePolNbr() throws CFException {
    if (isDidePolNbrModified()) {
      didePolNbr = refreshDidePolNbr();
    }
    return didePolNbr;
  }

  /**
   * set variable didePolNbr Corresponding COBOL Variable is DIDE-POL-NBR
   *
   * @param value
   */
  public void setDidePolNbr(char[] value) {
    didePolNbr = checkDidePolNbrConstraints(value);
    serializeDidePolNbr(didePolNbr);
  }

  /**
   * Update DidePolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDidePolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDidePolNbr, didePolNbr.length);
  }

  public void setDidePolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDidePolNbr, didePolNbr.length);
  }

  /**
   * Update DidePolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDidePolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDidePolNbr + targetIndex, targetLen);
  }

  /**
   * Update DidePolNbr with another Field
   *
   * @param value
   */
  public void setDidePolNbr(Field source) {
    replace(source, 0, source.length(), beginDidePolNbr, DIDE_POL_NBR_LEN);
  }

  /**
   * Update DidePolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDidePolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDidePolNbr, DIDE_POL_NBR_LEN);
  }

  /**
   * Update DidePolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDidePolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDidePolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of didePlnNbr
   *
   * @return didePlnNbr
   */
  public char[] getDidePlnNbr() throws CFException {
    if (isDidePlnNbrModified()) {
      didePlnNbr = refreshDidePlnNbr();
    }
    return didePlnNbr;
  }

  /**
   * set variable didePlnNbr Corresponding COBOL Variable is DIDE-PLN-NBR
   *
   * @param value
   */
  public void setDidePlnNbr(char[] value) {
    didePlnNbr = checkDidePlnNbrConstraints(value);
    serializeDidePlnNbr(didePlnNbr);
  }

  /**
   * Update DidePlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDidePlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDidePlnNbr, didePlnNbr.length);
  }

  public void setDidePlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDidePlnNbr, didePlnNbr.length);
  }

  /**
   * Update DidePlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDidePlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDidePlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DidePlnNbr with another Field
   *
   * @param value
   */
  public void setDidePlnNbr(Field source) {
    replace(source, 0, source.length(), beginDidePlnNbr, DIDE_PLN_NBR_LEN);
  }

  /**
   * Update DidePlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDidePlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDidePlnNbr, DIDE_PLN_NBR_LEN);
  }

  /**
   * Update DidePlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDidePlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDidePlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideClssNbr
   *
   * @return dideClssNbr
   */
  public char[] getDideClssNbr() throws CFException {
    if (isDideClssNbrModified()) {
      dideClssNbr = refreshDideClssNbr();
    }
    return dideClssNbr;
  }

  /**
   * set variable dideClssNbr Corresponding COBOL Variable is DIDE-CLSS-NBR
   *
   * @param value
   */
  public void setDideClssNbr(char[] value) {
    dideClssNbr = checkDideClssNbrConstraints(value);
    serializeDideClssNbr(dideClssNbr);
  }

  /**
   * Update DideClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideClssNbr, dideClssNbr.length);
  }

  public void setDideClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideClssNbr, dideClssNbr.length);
  }

  /**
   * Update DideClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DideClssNbr with another Field
   *
   * @param value
   */
  public void setDideClssNbr(Field source) {
    replace(source, 0, source.length(), beginDideClssNbr, DIDE_CLSS_NBR_LEN);
  }

  /**
   * Update DideClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDideClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideClssNbr, DIDE_CLSS_NBR_LEN);
  }

  /**
   * Update DideClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideSeqNbr
   *
   * @return dideSeqNbr
   */
  public short getDideSeqNbr() throws CFException {
    if (isDideSeqNbrModified()) {
      dideSeqNbr = refreshDideSeqNbr();
    }
    return dideSeqNbr;
  }

  /**
   * Update DideSeqNbr with the passed value Corresponding COBOL Variable is DIDE-SEQ-NBR
   *
   * @param number
   */
  public void setDideSeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    dideSeqNbr = checkDideSeqNbrMaxLimit(number);
    serializeDideSeqNbr(dideSeqNbr);
  }

  public void setDideSeqNbr(int number) {
    number = checkDideSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideSeqNbr((short) number);
  }

  public void setDideSeqNbr(long number) {
    number = checkDideSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideSeqNbr((short) number);
  }

  /**
   * Returns the value of dideDedAccumCd
   *
   * @return dideDedAccumCd
   */
  public char[] getDideDedAccumCd() throws CFException {
    if (isDideDedAccumCdModified()) {
      dideDedAccumCd = refreshDideDedAccumCd();
    }
    return dideDedAccumCd;
  }

  /**
   * set variable dideDedAccumCd Corresponding COBOL Variable is DIDE-DED-ACCUM-CD
   *
   * @param value
   */
  public void setDideDedAccumCd(char[] value) {
    dideDedAccumCd = checkDideDedAccumCdConstraints(value);
    serializeDideDedAccumCd(dideDedAccumCd);
  }

  /**
   * Update DideDedAccumCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedAccumCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedAccumCd, dideDedAccumCd.length);
  }

  public void setDideDedAccumCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedAccumCd, dideDedAccumCd.length);
  }

  /**
   * Update DideDedAccumCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedAccumCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedAccumCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedAccumCd with another Field
   *
   * @param value
   */
  public void setDideDedAccumCd(Field source) {
    replace(source, 0, source.length(), beginDideDedAccumCd, DIDE_DED_ACCUM_CD_LEN);
  }

  /**
   * Update DideDedAccumCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedAccumCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedAccumCd, DIDE_DED_ACCUM_CD_LEN);
  }

  /**
   * Update DideDedAccumCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedAccumCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedAccumCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedAccumPdAmt
   *
   * @return dideDedAccumPdAmt
   */
  public short getDideDedAccumPdAmt() throws CFException {
    if (isDideDedAccumPdAmtModified()) {
      dideDedAccumPdAmt = refreshDideDedAccumPdAmt();
    }
    return dideDedAccumPdAmt;
  }

  /**
   * Update DideDedAccumPdAmt with the passed value Corresponding COBOL Variable is
   * DIDE-DED-ACCUM-PD-AMT
   *
   * @param number
   */
  public void setDideDedAccumPdAmt(short number) {
    // Truncate if the number is beyond +/- Max range
    dideDedAccumPdAmt = checkDideDedAccumPdAmtMaxLimit(number);
    serializeDideDedAccumPdAmt(dideDedAccumPdAmt);
  }

  public void setDideDedAccumPdAmt(int number) {
    number =
        checkDideDedAccumPdAmtMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideDedAccumPdAmt((short) number);
  }

  public void setDideDedAccumPdAmt(long number) {
    number =
        checkDideDedAccumPdAmtMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideDedAccumPdAmt((short) number);
  }

  /**
   * Returns the value of dideDedAmt
   *
   * @return dideDedAmt
   */
  public int getDideDedAmt() throws CFException {
    if (isDideDedAmtModified()) {
      dideDedAmt = refreshDideDedAmt();
    }
    return dideDedAmt;
  }

  /**
   * Update DideDedAmt with the passed value Corresponding COBOL Variable is DIDE-DED-AMT
   *
   * @param number
   */
  public void setDideDedAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    dideDedAmt = checkDideDedAmtMaxLimit(number);
    serializeDideDedAmt(dideDedAmt);
  }

  public void setDideDedAmt(long number) {
    number = checkDideDedAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDideDedAmt((int) number);
  }

  /**
   * Returns the value of dideDedBenPdAmt
   *
   * @return dideDedBenPdAmt
   */
  public short getDideDedBenPdAmt() throws CFException {
    if (isDideDedBenPdAmtModified()) {
      dideDedBenPdAmt = refreshDideDedBenPdAmt();
    }
    return dideDedBenPdAmt;
  }

  /**
   * Update DideDedBenPdAmt with the passed value Corresponding COBOL Variable is
   * DIDE-DED-BEN-PD-AMT
   *
   * @param number
   */
  public void setDideDedBenPdAmt(short number) {
    // Truncate if the number is beyond +/- Max range
    dideDedBenPdAmt = checkDideDedBenPdAmtMaxLimit(number);
    serializeDideDedBenPdAmt(dideDedBenPdAmt);
  }

  public void setDideDedBenPdAmt(int number) {
    number =
        checkDideDedBenPdAmtMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideDedBenPdAmt((short) number);
  }

  public void setDideDedBenPdAmt(long number) {
    number =
        checkDideDedBenPdAmtMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideDedBenPdAmt((short) number);
  }

  /**
   * Returns the value of dideDedCaroCd
   *
   * @return dideDedCaroCd
   */
  public char[] getDideDedCaroCd() throws CFException {
    if (isDideDedCaroCdModified()) {
      dideDedCaroCd = refreshDideDedCaroCd();
    }
    return dideDedCaroCd;
  }

  /**
   * set variable dideDedCaroCd Corresponding COBOL Variable is DIDE-DED-CARO-CD
   *
   * @param value
   */
  public void setDideDedCaroCd(char[] value) {
    dideDedCaroCd = checkDideDedCaroCdConstraints(value);
    serializeDideDedCaroCd(dideDedCaroCd);
  }

  /**
   * Update DideDedCaroCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedCaroCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedCaroCd, dideDedCaroCd.length);
  }

  public void setDideDedCaroCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCaroCd, dideDedCaroCd.length);
  }

  /**
   * Update DideDedCaroCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCaroCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCaroCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedCaroCd with another Field
   *
   * @param value
   */
  public void setDideDedCaroCd(Field source) {
    replace(source, 0, source.length(), beginDideDedCaroCd, DIDE_DED_CARO_CD_LEN);
  }

  /**
   * Update DideDedCaroCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedCaroCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCaroCd, DIDE_DED_CARO_CD_LEN);
  }

  /**
   * Update DideDedCaroCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCaroCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCaroCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedCd
   *
   * @return dideDedCd
   */
  public char[] getDideDedCd() throws CFException {
    if (isDideDedCdModified()) {
      dideDedCd = refreshDideDedCd();
    }
    return dideDedCd;
  }

  /**
   * set variable dideDedCd Corresponding COBOL Variable is DIDE-DED-CD
   *
   * @param value
   */
  public void setDideDedCd(char[] value) {
    dideDedCd = checkDideDedCdConstraints(value);
    serializeDideDedCd(dideDedCd);
  }

  /**
   * Update DideDedCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedCd, dideDedCd.length);
  }

  public void setDideDedCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCd, dideDedCd.length);
  }

  /**
   * Update DideDedCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedCd with another Field
   *
   * @param value
   */
  public void setDideDedCd(Field source) {
    replace(source, 0, source.length(), beginDideDedCd, DIDE_DED_CD_LEN);
  }

  /**
   * Update DideDedCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCd, DIDE_DED_CD_LEN);
  }

  /**
   * Update DideDedCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedCobCd
   *
   * @return dideDedCobCd
   */
  public char[] getDideDedCobCd() throws CFException {
    if (isDideDedCobCdModified()) {
      dideDedCobCd = refreshDideDedCobCd();
    }
    return dideDedCobCd;
  }

  /**
   * set variable dideDedCobCd Corresponding COBOL Variable is DIDE-DED-COB-CD
   *
   * @param value
   */
  public void setDideDedCobCd(char[] value) {
    dideDedCobCd = checkDideDedCobCdConstraints(value);
    serializeDideDedCobCd(dideDedCobCd);
  }

  /**
   * Update DideDedCobCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedCobCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedCobCd, dideDedCobCd.length);
  }

  public void setDideDedCobCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCobCd, dideDedCobCd.length);
  }

  /**
   * Update DideDedCobCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCobCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCobCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedCobCd with another Field
   *
   * @param value
   */
  public void setDideDedCobCd(Field source) {
    replace(source, 0, source.length(), beginDideDedCobCd, DIDE_DED_COB_CD_LEN);
  }

  /**
   * Update DideDedCobCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedCobCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCobCd, DIDE_DED_COB_CD_LEN);
  }

  /**
   * Update DideDedCobCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCobCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCobCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedCstCntnCd
   *
   * @return dideDedCstCntnCd
   */
  public char[] getDideDedCstCntnCd() throws CFException {
    if (isDideDedCstCntnCdModified()) {
      dideDedCstCntnCd = refreshDideDedCstCntnCd();
    }
    return dideDedCstCntnCd;
  }

  /**
   * set variable dideDedCstCntnCd Corresponding COBOL Variable is DIDE-DED-CST-CNTN-CD
   *
   * @param value
   */
  public void setDideDedCstCntnCd(char[] value) {
    dideDedCstCntnCd = checkDideDedCstCntnCdConstraints(value);
    serializeDideDedCstCntnCd(dideDedCstCntnCd);
  }

  /**
   * Update DideDedCstCntnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedCstCntnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedCstCntnCd, dideDedCstCntnCd.length);
  }

  public void setDideDedCstCntnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCstCntnCd, dideDedCstCntnCd.length);
  }

  /**
   * Update DideDedCstCntnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCstCntnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCstCntnCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedCstCntnCd with another Field
   *
   * @param value
   */
  public void setDideDedCstCntnCd(Field source) {
    replace(source, 0, source.length(), beginDideDedCstCntnCd, DIDE_DED_CST_CNTN_CD_LEN);
  }

  /**
   * Update DideDedCstCntnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedCstCntnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCstCntnCd, DIDE_DED_CST_CNTN_CD_LEN);
  }

  /**
   * Update DideDedCstCntnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedCstCntnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedCstCntnCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedEndDt
   *
   * @return dideDedEndDt
   */
  public char[] getDideDedEndDt() throws CFException {
    if (isDideDedEndDtModified()) {
      dideDedEndDt = refreshDideDedEndDt();
    }
    return dideDedEndDt;
  }

  /**
   * set variable dideDedEndDt Corresponding COBOL Variable is DIDE-DED-END-DT
   *
   * @param value
   */
  public void setDideDedEndDt(char[] value) {
    dideDedEndDt = checkDideDedEndDtConstraints(value);
    serializeDideDedEndDt(dideDedEndDt);
  }

  /**
   * Update DideDedEndDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedEndDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedEndDt, dideDedEndDt.length);
  }

  public void setDideDedEndDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedEndDt, dideDedEndDt.length);
  }

  /**
   * Update DideDedEndDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedEndDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedEndDt + targetIndex, targetLen);
  }

  /**
   * Update DideDedEndDt with another Field
   *
   * @param value
   */
  public void setDideDedEndDt(Field source) {
    replace(source, 0, source.length(), beginDideDedEndDt, DIDE_DED_END_DT_LEN);
  }

  /**
   * Update DideDedEndDt with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedEndDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedEndDt, DIDE_DED_END_DT_LEN);
  }

  /**
   * Update DideDedEndDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedEndDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedEndDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedFreqCd
   *
   * @return dideDedFreqCd
   */
  public char[] getDideDedFreqCd() throws CFException {
    if (isDideDedFreqCdModified()) {
      dideDedFreqCd = refreshDideDedFreqCd();
    }
    return dideDedFreqCd;
  }

  /**
   * set variable dideDedFreqCd Corresponding COBOL Variable is DIDE-DED-FREQ-CD
   *
   * @param value
   */
  public void setDideDedFreqCd(char[] value) {
    dideDedFreqCd = checkDideDedFreqCdConstraints(value);
    serializeDideDedFreqCd(dideDedFreqCd);
  }

  /**
   * Update DideDedFreqCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedFreqCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedFreqCd, dideDedFreqCd.length);
  }

  public void setDideDedFreqCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedFreqCd, dideDedFreqCd.length);
  }

  /**
   * Update DideDedFreqCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedFreqCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedFreqCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedFreqCd with another Field
   *
   * @param value
   */
  public void setDideDedFreqCd(Field source) {
    replace(source, 0, source.length(), beginDideDedFreqCd, DIDE_DED_FREQ_CD_LEN);
  }

  /**
   * Update DideDedFreqCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedFreqCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedFreqCd, DIDE_DED_FREQ_CD_LEN);
  }

  /**
   * Update DideDedFreqCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedFreqCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedFreqCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedMntAmt
   *
   * @return dideDedMntAmt
   */
  public int getDideDedMntAmt() throws CFException {
    if (isDideDedMntAmtModified()) {
      dideDedMntAmt = refreshDideDedMntAmt();
    }
    return dideDedMntAmt;
  }

  /**
   * Update DideDedMntAmt with the passed value Corresponding COBOL Variable is DIDE-DED-MNT-AMT
   *
   * @param number
   */
  public void setDideDedMntAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    dideDedMntAmt = checkDideDedMntAmtMaxLimit(number);
    serializeDideDedMntAmt(dideDedMntAmt);
  }

  public void setDideDedMntAmt(long number) {
    number = checkDideDedMntAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDideDedMntAmt((int) number);
  }

  /**
   * Returns the value of dideDedMntCd
   *
   * @return dideDedMntCd
   */
  public char[] getDideDedMntCd() throws CFException {
    if (isDideDedMntCdModified()) {
      dideDedMntCd = refreshDideDedMntCd();
    }
    return dideDedMntCd;
  }

  /**
   * set variable dideDedMntCd Corresponding COBOL Variable is DIDE-DED-MNT-CD
   *
   * @param value
   */
  public void setDideDedMntCd(char[] value) {
    dideDedMntCd = checkDideDedMntCdConstraints(value);
    serializeDideDedMntCd(dideDedMntCd);
  }

  /**
   * Update DideDedMntCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedMntCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedMntCd, dideDedMntCd.length);
  }

  public void setDideDedMntCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedMntCd, dideDedMntCd.length);
  }

  /**
   * Update DideDedMntCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedMntCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedMntCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedMntCd with another Field
   *
   * @param value
   */
  public void setDideDedMntCd(Field source) {
    replace(source, 0, source.length(), beginDideDedMntCd, DIDE_DED_MNT_CD_LEN);
  }

  /**
   * Update DideDedMntCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedMntCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedMntCd, DIDE_DED_MNT_CD_LEN);
  }

  /**
   * Update DideDedMntCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedMntCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedMntCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedMntPdAmt
   *
   * @return dideDedMntPdAmt
   */
  public short getDideDedMntPdAmt() throws CFException {
    if (isDideDedMntPdAmtModified()) {
      dideDedMntPdAmt = refreshDideDedMntPdAmt();
    }
    return dideDedMntPdAmt;
  }

  /**
   * Update DideDedMntPdAmt with the passed value Corresponding COBOL Variable is
   * DIDE-DED-MNT-PD-AMT
   *
   * @param number
   */
  public void setDideDedMntPdAmt(short number) {
    // Truncate if the number is beyond +/- Max range
    dideDedMntPdAmt = checkDideDedMntPdAmtMaxLimit(number);
    serializeDideDedMntPdAmt(dideDedMntPdAmt);
  }

  public void setDideDedMntPdAmt(int number) {
    number =
        checkDideDedMntPdAmtMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideDedMntPdAmt((short) number);
  }

  public void setDideDedMntPdAmt(long number) {
    number =
        checkDideDedMntPdAmtMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDideDedMntPdAmt((short) number);
  }

  /**
   * Returns the value of dideDedNtwkTypCd
   *
   * @return dideDedNtwkTypCd
   */
  public char[] getDideDedNtwkTypCd() throws CFException {
    if (isDideDedNtwkTypCdModified()) {
      dideDedNtwkTypCd = refreshDideDedNtwkTypCd();
    }
    return dideDedNtwkTypCd;
  }

  /**
   * set variable dideDedNtwkTypCd Corresponding COBOL Variable is DIDE-DED-NTWK-TYP-CD
   *
   * @param value
   */
  public void setDideDedNtwkTypCd(char[] value) {
    dideDedNtwkTypCd = checkDideDedNtwkTypCdConstraints(value);
    serializeDideDedNtwkTypCd(dideDedNtwkTypCd);
  }

  /**
   * Update DideDedNtwkTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedNtwkTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedNtwkTypCd, dideDedNtwkTypCd.length);
  }

  public void setDideDedNtwkTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedNtwkTypCd, dideDedNtwkTypCd.length);
  }

  /**
   * Update DideDedNtwkTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedNtwkTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedNtwkTypCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedNtwkTypCd with another Field
   *
   * @param value
   */
  public void setDideDedNtwkTypCd(Field source) {
    replace(source, 0, source.length(), beginDideDedNtwkTypCd, DIDE_DED_NTWK_TYP_CD_LEN);
  }

  /**
   * Update DideDedNtwkTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedNtwkTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedNtwkTypCd, DIDE_DED_NTWK_TYP_CD_LEN);
  }

  /**
   * Update DideDedNtwkTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedNtwkTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedNtwkTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedSemiPvtRtCd
   *
   * @return dideDedSemiPvtRtCd
   */
  public char[] getDideDedSemiPvtRtCd() throws CFException {
    if (isDideDedSemiPvtRtCdModified()) {
      dideDedSemiPvtRtCd = refreshDideDedSemiPvtRtCd();
    }
    return dideDedSemiPvtRtCd;
  }

  /**
   * set variable dideDedSemiPvtRtCd Corresponding COBOL Variable is DIDE-DED-SEMI-PVT-RT-CD
   *
   * @param value
   */
  public void setDideDedSemiPvtRtCd(char[] value) {
    dideDedSemiPvtRtCd = checkDideDedSemiPvtRtCdConstraints(value);
    serializeDideDedSemiPvtRtCd(dideDedSemiPvtRtCd);
  }

  /**
   * Update DideDedSemiPvtRtCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedSemiPvtRtCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedSemiPvtRtCd, dideDedSemiPvtRtCd.length);
  }

  public void setDideDedSemiPvtRtCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSemiPvtRtCd, dideDedSemiPvtRtCd.length);
  }

  /**
   * Update DideDedSemiPvtRtCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedSemiPvtRtCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSemiPvtRtCd + targetIndex, targetLen);
  }

  /**
   * Update DideDedSemiPvtRtCd with another Field
   *
   * @param value
   */
  public void setDideDedSemiPvtRtCd(Field source) {
    replace(source, 0, source.length(), beginDideDedSemiPvtRtCd, DIDE_DED_SEMI_PVT_RT_CD_LEN);
  }

  /**
   * Update DideDedSemiPvtRtCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedSemiPvtRtCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSemiPvtRtCd, DIDE_DED_SEMI_PVT_RT_CD_LEN);
  }

  /**
   * Update DideDedSemiPvtRtCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedSemiPvtRtCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSemiPvtRtCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideDedSrvcDesc
   *
   * @return dideDedSrvcDesc
   */
  public char[] getDideDedSrvcDesc() throws CFException {
    if (isDideDedSrvcDescModified()) {
      dideDedSrvcDesc = refreshDideDedSrvcDesc();
    }
    return dideDedSrvcDesc;
  }

  /**
   * set variable dideDedSrvcDesc Corresponding COBOL Variable is DIDE-DED-SRVC-DESC
   *
   * @param value
   */
  public void setDideDedSrvcDesc(char[] value) {
    dideDedSrvcDesc = checkDideDedSrvcDescConstraints(value);
    serializeDideDedSrvcDesc(dideDedSrvcDesc);
  }

  /**
   * Update DideDedSrvcDesc with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideDedSrvcDesc(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideDedSrvcDesc, dideDedSrvcDesc.length);
  }

  public void setDideDedSrvcDesc(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSrvcDesc, dideDedSrvcDesc.length);
  }

  /**
   * Update DideDedSrvcDesc with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedSrvcDesc(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSrvcDesc + targetIndex, targetLen);
  }

  /**
   * Update DideDedSrvcDesc with another Field
   *
   * @param value
   */
  public void setDideDedSrvcDesc(Field source) {
    replace(source, 0, source.length(), beginDideDedSrvcDesc, DIDE_DED_SRVC_DESC_LEN);
  }

  /**
   * Update DideDedSrvcDesc with another Field from an offset and length
   *
   * @param value
   */
  public void setDideDedSrvcDesc(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSrvcDesc, DIDE_DED_SRVC_DESC_LEN);
  }

  /**
   * Update DideDedSrvcDesc with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideDedSrvcDesc(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideDedSrvcDesc + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideLstUpdtDttm
   *
   * @return dideLstUpdtDttm
   */
  public char[] getDideLstUpdtDttm() throws CFException {
    if (isDideLstUpdtDttmModified()) {
      dideLstUpdtDttm = refreshDideLstUpdtDttm();
    }
    return dideLstUpdtDttm;
  }

  /**
   * set variable dideLstUpdtDttm Corresponding COBOL Variable is DIDE-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setDideLstUpdtDttm(char[] value) {
    dideLstUpdtDttm = checkDideLstUpdtDttmConstraints(value);
    serializeDideLstUpdtDttm(dideLstUpdtDttm);
  }

  /**
   * Update DideLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideLstUpdtDttm, dideLstUpdtDttm.length);
  }

  public void setDideLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtDttm, dideLstUpdtDttm.length);
  }

  /**
   * Update DideLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update DideLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setDideLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginDideLstUpdtDttm, DIDE_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DideLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtDttm, DIDE_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DideLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dideLstUpdtUserId
   *
   * @return dideLstUpdtUserId
   */
  public char[] getDideLstUpdtUserId() throws CFException {
    if (isDideLstUpdtUserIdModified()) {
      dideLstUpdtUserId = refreshDideLstUpdtUserId();
    }
    return dideLstUpdtUserId;
  }

  /**
   * set variable dideLstUpdtUserId Corresponding COBOL Variable is DIDE-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setDideLstUpdtUserId(char[] value) {
    dideLstUpdtUserId = checkDideLstUpdtUserIdConstraints(value);
    serializeDideLstUpdtUserId(dideLstUpdtUserId);
  }

  /**
   * Update DideLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDideLstUpdtUserId, dideLstUpdtUserId.length);
  }

  public void setDideLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtUserId, dideLstUpdtUserId.length);
  }

  /**
   * Update DideLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update DideLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setDideLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginDideLstUpdtUserId, DIDE_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DideLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtUserId, DIDE_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DideLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDideLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDideLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * initializes DclpolPlnMstrIndvDed String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDideCovTypCd(CONSTANTS.SPACE);
    setDidePolNbr(CONSTANTS.SPACE_6);
    setDidePlnNbr(CONSTANTS.SPACE_4);
    setDideClssNbr(CONSTANTS.SPACE_4);
    setDideSeqNbr((short) 0);
    setDideDedAccumCd(CONSTANTS.SPACE);
    setDideDedAccumPdAmt((short) 0);
    setDideDedAmt(0);
    setDideDedBenPdAmt((short) 0);
    setDideDedCaroCd(CONSTANTS.SPACE);
    setDideDedCd(CONSTANTS.SPACE);
    setDideDedCobCd(CONSTANTS.SPACE);
    setDideDedCstCntnCd(CONSTANTS.SPACE);
    setDideDedEndDt(CONSTANTS.SPACE_10);
    setDideDedFreqCd(CONSTANTS.SPACE);
    setDideDedMntAmt(0);
    setDideDedMntCd(CONSTANTS.SPACE);
    setDideDedMntPdAmt((short) 0);
    setDideDedNtwkTypCd(CONSTANTS.SPACE);
    setDideDedSemiPvtRtCd(CONSTANTS.SPACE);
    setDideDedSrvcDesc(CONSTANTS.SPACE_6);
    setDideLstUpdtDttm(CONSTANTS.SPACE_26);
    setDideLstUpdtUserId(CONSTANTS.SPACE_9);
  }

  public static int getDclpolPlnMstrIndvDedFieldLength() {
    return DCLPOL_PLN_MSTR_INDV_DED_LENGTH;
  }
}
