package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstrFamDed is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclpolPlnMstrFamDed extends DclpolPlnMstrFamDedSerialized {

  private char[] dfdeCovTypCd = Field.fillLowValue(1);

  private char[] dfdePolNbr = Field.fillLowValue(6);

  private char[] dfdePlnNbr = Field.fillLowValue(4);

  private char[] dfdeClssNbr = Field.fillLowValue(4);

  private short dfdeSeqNbr;

  private int dfdeDedAmt;

  private char[] dfdeDedCaroCd = Field.fillLowValue(1);

  private char[] dfdeDedCd = Field.fillLowValue(1);

  private char[] dfdeDedCstCntnCd = Field.fillLowValue(1);

  private int dfdeDedEeChrgAmt;

  private int dfdeDedEePls1Amt;

  private int dfdeDedEeSpoAmt;

  private char[] dfdeDedFreqPrdCd = Field.fillLowValue(1);

  private char[] dfdeDedMbrCnt = Field.fillLowValue(1);

  private char[] dfdeDedMbrDesc = Field.fillLowValue(6);

  private short dfdeDedMultFct;

  private BigDecimal dfdeDedMultSalryPct = BigDecimal.ZERO;

  private char[] dfdeLstUpdtDttm = Field.fillLowValue(26);

  private char[] dfdeLstUpdtUserId = Field.fillLowValue(9);

  private BigDecimal dfdeOopMultFct = BigDecimal.ZERO;

  /** Constructor for DclpolPlnMstrFamDed */
  public DclpolPlnMstrFamDed() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dfdeCovTypCd
   *
   * @return dfdeCovTypCd
   */
  public char[] getDfdeCovTypCd() throws CFException {
    if (isDfdeCovTypCdModified()) {
      dfdeCovTypCd = refreshDfdeCovTypCd();
    }
    return dfdeCovTypCd;
  }

  /**
   * set variable dfdeCovTypCd Corresponding COBOL Variable is DFDE-COV-TYP-CD
   *
   * @param value
   */
  public void setDfdeCovTypCd(char[] value) {
    dfdeCovTypCd = checkDfdeCovTypCdConstraints(value);
    serializeDfdeCovTypCd(dfdeCovTypCd);
  }

  /**
   * Update DfdeCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeCovTypCd, dfdeCovTypCd.length);
  }

  public void setDfdeCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeCovTypCd, dfdeCovTypCd.length);
  }

  /**
   * Update DfdeCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update DfdeCovTypCd with another Field
   *
   * @param value
   */
  public void setDfdeCovTypCd(Field source) {
    replace(source, 0, source.length(), beginDfdeCovTypCd, DFDE_COV_TYP_CD_LEN);
  }

  /**
   * Update DfdeCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeCovTypCd, DFDE_COV_TYP_CD_LEN);
  }

  /**
   * Update DfdeCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdePolNbr
   *
   * @return dfdePolNbr
   */
  public char[] getDfdePolNbr() throws CFException {
    if (isDfdePolNbrModified()) {
      dfdePolNbr = refreshDfdePolNbr();
    }
    return dfdePolNbr;
  }

  /**
   * set variable dfdePolNbr Corresponding COBOL Variable is DFDE-POL-NBR
   *
   * @param value
   */
  public void setDfdePolNbr(char[] value) {
    dfdePolNbr = checkDfdePolNbrConstraints(value);
    serializeDfdePolNbr(dfdePolNbr);
  }

  /**
   * Update DfdePolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdePolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdePolNbr, dfdePolNbr.length);
  }

  public void setDfdePolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePolNbr, dfdePolNbr.length);
  }

  /**
   * Update DfdePolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdePolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePolNbr + targetIndex, targetLen);
  }

  /**
   * Update DfdePolNbr with another Field
   *
   * @param value
   */
  public void setDfdePolNbr(Field source) {
    replace(source, 0, source.length(), beginDfdePolNbr, DFDE_POL_NBR_LEN);
  }

  /**
   * Update DfdePolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdePolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePolNbr, DFDE_POL_NBR_LEN);
  }

  /**
   * Update DfdePolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdePolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdePlnNbr
   *
   * @return dfdePlnNbr
   */
  public char[] getDfdePlnNbr() throws CFException {
    if (isDfdePlnNbrModified()) {
      dfdePlnNbr = refreshDfdePlnNbr();
    }
    return dfdePlnNbr;
  }

  /**
   * set variable dfdePlnNbr Corresponding COBOL Variable is DFDE-PLN-NBR
   *
   * @param value
   */
  public void setDfdePlnNbr(char[] value) {
    dfdePlnNbr = checkDfdePlnNbrConstraints(value);
    serializeDfdePlnNbr(dfdePlnNbr);
  }

  /**
   * Update DfdePlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdePlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdePlnNbr, dfdePlnNbr.length);
  }

  public void setDfdePlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePlnNbr, dfdePlnNbr.length);
  }

  /**
   * Update DfdePlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdePlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DfdePlnNbr with another Field
   *
   * @param value
   */
  public void setDfdePlnNbr(Field source) {
    replace(source, 0, source.length(), beginDfdePlnNbr, DFDE_PLN_NBR_LEN);
  }

  /**
   * Update DfdePlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdePlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePlnNbr, DFDE_PLN_NBR_LEN);
  }

  /**
   * Update DfdePlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdePlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdePlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeClssNbr
   *
   * @return dfdeClssNbr
   */
  public char[] getDfdeClssNbr() throws CFException {
    if (isDfdeClssNbrModified()) {
      dfdeClssNbr = refreshDfdeClssNbr();
    }
    return dfdeClssNbr;
  }

  /**
   * set variable dfdeClssNbr Corresponding COBOL Variable is DFDE-CLSS-NBR
   *
   * @param value
   */
  public void setDfdeClssNbr(char[] value) {
    dfdeClssNbr = checkDfdeClssNbrConstraints(value);
    serializeDfdeClssNbr(dfdeClssNbr);
  }

  /**
   * Update DfdeClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeClssNbr, dfdeClssNbr.length);
  }

  public void setDfdeClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeClssNbr, dfdeClssNbr.length);
  }

  /**
   * Update DfdeClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DfdeClssNbr with another Field
   *
   * @param value
   */
  public void setDfdeClssNbr(Field source) {
    replace(source, 0, source.length(), beginDfdeClssNbr, DFDE_CLSS_NBR_LEN);
  }

  /**
   * Update DfdeClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeClssNbr, DFDE_CLSS_NBR_LEN);
  }

  /**
   * Update DfdeClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeSeqNbr
   *
   * @return dfdeSeqNbr
   */
  public short getDfdeSeqNbr() throws CFException {
    if (isDfdeSeqNbrModified()) {
      dfdeSeqNbr = refreshDfdeSeqNbr();
    }
    return dfdeSeqNbr;
  }

  /**
   * Update DfdeSeqNbr with the passed value Corresponding COBOL Variable is DFDE-SEQ-NBR
   *
   * @param number
   */
  public void setDfdeSeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    dfdeSeqNbr = checkDfdeSeqNbrMaxLimit(number);
    serializeDfdeSeqNbr(dfdeSeqNbr);
  }

  public void setDfdeSeqNbr(int number) {
    number = checkDfdeSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDfdeSeqNbr((short) number);
  }

  public void setDfdeSeqNbr(long number) {
    number = checkDfdeSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDfdeSeqNbr((short) number);
  }

  /**
   * Returns the value of dfdeDedAmt
   *
   * @return dfdeDedAmt
   */
  public int getDfdeDedAmt() throws CFException {
    if (isDfdeDedAmtModified()) {
      dfdeDedAmt = refreshDfdeDedAmt();
    }
    return dfdeDedAmt;
  }

  /**
   * Update DfdeDedAmt with the passed value Corresponding COBOL Variable is DFDE-DED-AMT
   *
   * @param number
   */
  public void setDfdeDedAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    dfdeDedAmt = checkDfdeDedAmtMaxLimit(number);
    serializeDfdeDedAmt(dfdeDedAmt);
  }

  public void setDfdeDedAmt(long number) {
    number = checkDfdeDedAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDfdeDedAmt((int) number);
  }

  /**
   * Returns the value of dfdeDedCaroCd
   *
   * @return dfdeDedCaroCd
   */
  public char[] getDfdeDedCaroCd() throws CFException {
    if (isDfdeDedCaroCdModified()) {
      dfdeDedCaroCd = refreshDfdeDedCaroCd();
    }
    return dfdeDedCaroCd;
  }

  /**
   * set variable dfdeDedCaroCd Corresponding COBOL Variable is DFDE-DED-CARO-CD
   *
   * @param value
   */
  public void setDfdeDedCaroCd(char[] value) {
    dfdeDedCaroCd = checkDfdeDedCaroCdConstraints(value);
    serializeDfdeDedCaroCd(dfdeDedCaroCd);
  }

  /**
   * Update DfdeDedCaroCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeDedCaroCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeDedCaroCd, dfdeDedCaroCd.length);
  }

  public void setDfdeDedCaroCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCaroCd, dfdeDedCaroCd.length);
  }

  /**
   * Update DfdeDedCaroCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedCaroCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCaroCd + targetIndex, targetLen);
  }

  /**
   * Update DfdeDedCaroCd with another Field
   *
   * @param value
   */
  public void setDfdeDedCaroCd(Field source) {
    replace(source, 0, source.length(), beginDfdeDedCaroCd, DFDE_DED_CARO_CD_LEN);
  }

  /**
   * Update DfdeDedCaroCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeDedCaroCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCaroCd, DFDE_DED_CARO_CD_LEN);
  }

  /**
   * Update DfdeDedCaroCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedCaroCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCaroCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeDedCd
   *
   * @return dfdeDedCd
   */
  public char[] getDfdeDedCd() throws CFException {
    if (isDfdeDedCdModified()) {
      dfdeDedCd = refreshDfdeDedCd();
    }
    return dfdeDedCd;
  }

  /**
   * set variable dfdeDedCd Corresponding COBOL Variable is DFDE-DED-CD
   *
   * @param value
   */
  public void setDfdeDedCd(char[] value) {
    dfdeDedCd = checkDfdeDedCdConstraints(value);
    serializeDfdeDedCd(dfdeDedCd);
  }

  /**
   * Update DfdeDedCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeDedCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeDedCd, dfdeDedCd.length);
  }

  public void setDfdeDedCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCd, dfdeDedCd.length);
  }

  /**
   * Update DfdeDedCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCd + targetIndex, targetLen);
  }

  /**
   * Update DfdeDedCd with another Field
   *
   * @param value
   */
  public void setDfdeDedCd(Field source) {
    replace(source, 0, source.length(), beginDfdeDedCd, DFDE_DED_CD_LEN);
  }

  /**
   * Update DfdeDedCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeDedCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCd, DFDE_DED_CD_LEN);
  }

  /**
   * Update DfdeDedCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeDedCstCntnCd
   *
   * @return dfdeDedCstCntnCd
   */
  public char[] getDfdeDedCstCntnCd() throws CFException {
    if (isDfdeDedCstCntnCdModified()) {
      dfdeDedCstCntnCd = refreshDfdeDedCstCntnCd();
    }
    return dfdeDedCstCntnCd;
  }

  /**
   * set variable dfdeDedCstCntnCd Corresponding COBOL Variable is DFDE-DED-CST-CNTN-CD
   *
   * @param value
   */
  public void setDfdeDedCstCntnCd(char[] value) {
    dfdeDedCstCntnCd = checkDfdeDedCstCntnCdConstraints(value);
    serializeDfdeDedCstCntnCd(dfdeDedCstCntnCd);
  }

  /**
   * Update DfdeDedCstCntnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeDedCstCntnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeDedCstCntnCd, dfdeDedCstCntnCd.length);
  }

  public void setDfdeDedCstCntnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCstCntnCd, dfdeDedCstCntnCd.length);
  }

  /**
   * Update DfdeDedCstCntnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedCstCntnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCstCntnCd + targetIndex, targetLen);
  }

  /**
   * Update DfdeDedCstCntnCd with another Field
   *
   * @param value
   */
  public void setDfdeDedCstCntnCd(Field source) {
    replace(source, 0, source.length(), beginDfdeDedCstCntnCd, DFDE_DED_CST_CNTN_CD_LEN);
  }

  /**
   * Update DfdeDedCstCntnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeDedCstCntnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCstCntnCd, DFDE_DED_CST_CNTN_CD_LEN);
  }

  /**
   * Update DfdeDedCstCntnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedCstCntnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedCstCntnCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeDedEeChrgAmt
   *
   * @return dfdeDedEeChrgAmt
   */
  public int getDfdeDedEeChrgAmt() throws CFException {
    if (isDfdeDedEeChrgAmtModified()) {
      dfdeDedEeChrgAmt = refreshDfdeDedEeChrgAmt();
    }
    return dfdeDedEeChrgAmt;
  }

  /**
   * Update DfdeDedEeChrgAmt with the passed value Corresponding COBOL Variable is
   * DFDE-DED-EE-CHRG-AMT
   *
   * @param number
   */
  public void setDfdeDedEeChrgAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    dfdeDedEeChrgAmt = checkDfdeDedEeChrgAmtMaxLimit(number);
    serializeDfdeDedEeChrgAmt(dfdeDedEeChrgAmt);
  }

  public void setDfdeDedEeChrgAmt(long number) {
    number = checkDfdeDedEeChrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDfdeDedEeChrgAmt((int) number);
  }

  /**
   * Returns the value of dfdeDedEePls1Amt
   *
   * @return dfdeDedEePls1Amt
   */
  public int getDfdeDedEePls1Amt() throws CFException {
    if (isDfdeDedEePls1AmtModified()) {
      dfdeDedEePls1Amt = refreshDfdeDedEePls1Amt();
    }
    return dfdeDedEePls1Amt;
  }

  /**
   * Update DfdeDedEePls1Amt with the passed value Corresponding COBOL Variable is
   * DFDE-DED-EE-PLS-1-AMT
   *
   * @param number
   */
  public void setDfdeDedEePls1Amt(int number) {
    // Truncate if the number is beyond +/- Max range
    dfdeDedEePls1Amt = checkDfdeDedEePls1AmtMaxLimit(number);
    serializeDfdeDedEePls1Amt(dfdeDedEePls1Amt);
  }

  public void setDfdeDedEePls1Amt(long number) {
    number = checkDfdeDedEePls1AmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDfdeDedEePls1Amt((int) number);
  }

  /**
   * Returns the value of dfdeDedEeSpoAmt
   *
   * @return dfdeDedEeSpoAmt
   */
  public int getDfdeDedEeSpoAmt() throws CFException {
    if (isDfdeDedEeSpoAmtModified()) {
      dfdeDedEeSpoAmt = refreshDfdeDedEeSpoAmt();
    }
    return dfdeDedEeSpoAmt;
  }

  /**
   * Update DfdeDedEeSpoAmt with the passed value Corresponding COBOL Variable is
   * DFDE-DED-EE-SPO-AMT
   *
   * @param number
   */
  public void setDfdeDedEeSpoAmt(int number) {
    // Truncate if the number is beyond +/- Max range
    dfdeDedEeSpoAmt = checkDfdeDedEeSpoAmtMaxLimit(number);
    serializeDfdeDedEeSpoAmt(dfdeDedEeSpoAmt);
  }

  public void setDfdeDedEeSpoAmt(long number) {
    number = checkDfdeDedEeSpoAmtMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDfdeDedEeSpoAmt((int) number);
  }

  /**
   * Returns the value of dfdeDedFreqPrdCd
   *
   * @return dfdeDedFreqPrdCd
   */
  public char[] getDfdeDedFreqPrdCd() throws CFException {
    if (isDfdeDedFreqPrdCdModified()) {
      dfdeDedFreqPrdCd = refreshDfdeDedFreqPrdCd();
    }
    return dfdeDedFreqPrdCd;
  }

  /**
   * set variable dfdeDedFreqPrdCd Corresponding COBOL Variable is DFDE-DED-FREQ-PRD-CD
   *
   * @param value
   */
  public void setDfdeDedFreqPrdCd(char[] value) {
    dfdeDedFreqPrdCd = checkDfdeDedFreqPrdCdConstraints(value);
    serializeDfdeDedFreqPrdCd(dfdeDedFreqPrdCd);
  }

  /**
   * Update DfdeDedFreqPrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeDedFreqPrdCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeDedFreqPrdCd, dfdeDedFreqPrdCd.length);
  }

  public void setDfdeDedFreqPrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedFreqPrdCd, dfdeDedFreqPrdCd.length);
  }

  /**
   * Update DfdeDedFreqPrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedFreqPrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedFreqPrdCd + targetIndex, targetLen);
  }

  /**
   * Update DfdeDedFreqPrdCd with another Field
   *
   * @param value
   */
  public void setDfdeDedFreqPrdCd(Field source) {
    replace(source, 0, source.length(), beginDfdeDedFreqPrdCd, DFDE_DED_FREQ_PRD_CD_LEN);
  }

  /**
   * Update DfdeDedFreqPrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeDedFreqPrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedFreqPrdCd, DFDE_DED_FREQ_PRD_CD_LEN);
  }

  /**
   * Update DfdeDedFreqPrdCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedFreqPrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedFreqPrdCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeDedMbrCnt
   *
   * @return dfdeDedMbrCnt
   */
  public char[] getDfdeDedMbrCnt() throws CFException {
    if (isDfdeDedMbrCntModified()) {
      dfdeDedMbrCnt = refreshDfdeDedMbrCnt();
    }
    return dfdeDedMbrCnt;
  }

  /**
   * set variable dfdeDedMbrCnt Corresponding COBOL Variable is DFDE-DED-MBR-CNT
   *
   * @param value
   */
  public void setDfdeDedMbrCnt(char[] value) {
    dfdeDedMbrCnt = checkDfdeDedMbrCntConstraints(value);
    serializeDfdeDedMbrCnt(dfdeDedMbrCnt);
  }

  /**
   * Update DfdeDedMbrCnt with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrCnt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeDedMbrCnt, dfdeDedMbrCnt.length);
  }

  public void setDfdeDedMbrCnt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrCnt, dfdeDedMbrCnt.length);
  }

  /**
   * Update DfdeDedMbrCnt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrCnt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrCnt + targetIndex, targetLen);
  }

  /**
   * Update DfdeDedMbrCnt with another Field
   *
   * @param value
   */
  public void setDfdeDedMbrCnt(Field source) {
    replace(source, 0, source.length(), beginDfdeDedMbrCnt, DFDE_DED_MBR_CNT_LEN);
  }

  /**
   * Update DfdeDedMbrCnt with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrCnt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrCnt, DFDE_DED_MBR_CNT_LEN);
  }

  /**
   * Update DfdeDedMbrCnt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrCnt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrCnt + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeDedMbrDesc
   *
   * @return dfdeDedMbrDesc
   */
  public char[] getDfdeDedMbrDesc() throws CFException {
    if (isDfdeDedMbrDescModified()) {
      dfdeDedMbrDesc = refreshDfdeDedMbrDesc();
    }
    return dfdeDedMbrDesc;
  }

  /**
   * set variable dfdeDedMbrDesc Corresponding COBOL Variable is DFDE-DED-MBR-DESC
   *
   * @param value
   */
  public void setDfdeDedMbrDesc(char[] value) {
    dfdeDedMbrDesc = checkDfdeDedMbrDescConstraints(value);
    serializeDfdeDedMbrDesc(dfdeDedMbrDesc);
  }

  /**
   * Update DfdeDedMbrDesc with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrDesc(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeDedMbrDesc, dfdeDedMbrDesc.length);
  }

  public void setDfdeDedMbrDesc(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrDesc, dfdeDedMbrDesc.length);
  }

  /**
   * Update DfdeDedMbrDesc with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrDesc(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrDesc + targetIndex, targetLen);
  }

  /**
   * Update DfdeDedMbrDesc with another Field
   *
   * @param value
   */
  public void setDfdeDedMbrDesc(Field source) {
    replace(source, 0, source.length(), beginDfdeDedMbrDesc, DFDE_DED_MBR_DESC_LEN);
  }

  /**
   * Update DfdeDedMbrDesc with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrDesc(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrDesc, DFDE_DED_MBR_DESC_LEN);
  }

  /**
   * Update DfdeDedMbrDesc with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeDedMbrDesc(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeDedMbrDesc + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeDedMultFct
   *
   * @return dfdeDedMultFct
   */
  public short getDfdeDedMultFct() throws CFException {
    if (isDfdeDedMultFctModified()) {
      dfdeDedMultFct = refreshDfdeDedMultFct();
    }
    return dfdeDedMultFct;
  }

  /**
   * Update DfdeDedMultFct with the passed value Corresponding COBOL Variable is DFDE-DED-MULT-FCT
   *
   * @param number
   */
  public void setDfdeDedMultFct(short number) {
    // Truncate if the number is beyond +/- Max range
    dfdeDedMultFct = checkDfdeDedMultFctMaxLimit(number);
    serializeDfdeDedMultFct(dfdeDedMultFct);
  }

  public void setDfdeDedMultFct(int number) {
    number =
        checkDfdeDedMultFctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDfdeDedMultFct((short) number);
  }

  public void setDfdeDedMultFct(long number) {
    number =
        checkDfdeDedMultFctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDfdeDedMultFct((short) number);
  }

  public BigDecimal getDfdeDedMultSalryPct() throws CFException {
    if (isDfdeDedMultSalryPctModified()) {
      dfdeDedMultSalryPct = refreshDfdeDedMultSalryPct();
    }
    return dfdeDedMultSalryPct;
  }

  public char[] getDfdeDedMultSalryPctString() {
    return dfdeDedMultSalryPctString();
  }

  /**
   * Update DfdeDedMultSalryPct with the passed number Corresponding COBOL Variable is
   * DFDE-DED-MULT-SALRY-PCT
   *
   * @param number
   */
  public void setDfdeDedMultSalryPct(BigDecimal number) {
    dfdeDedMultSalryPct = checkDfdeDedMultSalryPctMaxLimit(number);
    serializeDfdeDedMultSalryPct(dfdeDedMultSalryPct);
  }
  /**
   * Returns the value of dfdeLstUpdtDttm
   *
   * @return dfdeLstUpdtDttm
   */
  public char[] getDfdeLstUpdtDttm() throws CFException {
    if (isDfdeLstUpdtDttmModified()) {
      dfdeLstUpdtDttm = refreshDfdeLstUpdtDttm();
    }
    return dfdeLstUpdtDttm;
  }

  /**
   * set variable dfdeLstUpdtDttm Corresponding COBOL Variable is DFDE-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setDfdeLstUpdtDttm(char[] value) {
    dfdeLstUpdtDttm = checkDfdeLstUpdtDttmConstraints(value);
    serializeDfdeLstUpdtDttm(dfdeLstUpdtDttm);
  }

  /**
   * Update DfdeLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeLstUpdtDttm, dfdeLstUpdtDttm.length);
  }

  public void setDfdeLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtDttm, dfdeLstUpdtDttm.length);
  }

  /**
   * Update DfdeLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update DfdeLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setDfdeLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginDfdeLstUpdtDttm, DFDE_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DfdeLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtDttm, DFDE_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DfdeLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dfdeLstUpdtUserId
   *
   * @return dfdeLstUpdtUserId
   */
  public char[] getDfdeLstUpdtUserId() throws CFException {
    if (isDfdeLstUpdtUserIdModified()) {
      dfdeLstUpdtUserId = refreshDfdeLstUpdtUserId();
    }
    return dfdeLstUpdtUserId;
  }

  /**
   * set variable dfdeLstUpdtUserId Corresponding COBOL Variable is DFDE-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setDfdeLstUpdtUserId(char[] value) {
    dfdeLstUpdtUserId = checkDfdeLstUpdtUserIdConstraints(value);
    serializeDfdeLstUpdtUserId(dfdeLstUpdtUserId);
  }

  /**
   * Update DfdeLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDfdeLstUpdtUserId, dfdeLstUpdtUserId.length);
  }

  public void setDfdeLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtUserId, dfdeLstUpdtUserId.length);
  }

  /**
   * Update DfdeLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update DfdeLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setDfdeLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginDfdeLstUpdtUserId, DFDE_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DfdeLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtUserId, DFDE_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DfdeLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDfdeLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDfdeLstUpdtUserId + targetIndex, targetLen);
  }

  public BigDecimal getDfdeOopMultFct() throws CFException {
    if (isDfdeOopMultFctModified()) {
      dfdeOopMultFct = refreshDfdeOopMultFct();
    }
    return dfdeOopMultFct;
  }

  public char[] getDfdeOopMultFctString() {
    return dfdeOopMultFctString();
  }

  /**
   * Update DfdeOopMultFct with the passed number Corresponding COBOL Variable is DFDE-OOP-MULT-FCT
   *
   * @param number
   */
  public void setDfdeOopMultFct(BigDecimal number) {
    dfdeOopMultFct = checkDfdeOopMultFctMaxLimit(number);
    serializeDfdeOopMultFct(dfdeOopMultFct);
  }

  /**
   * initializes DclpolPlnMstrFamDed String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDfdeCovTypCd(CONSTANTS.SPACE);
    setDfdePolNbr(CONSTANTS.SPACE_6);
    setDfdePlnNbr(CONSTANTS.SPACE_4);
    setDfdeClssNbr(CONSTANTS.SPACE_4);
    setDfdeSeqNbr((short) 0);
    setDfdeDedAmt(0);
    setDfdeDedCaroCd(CONSTANTS.SPACE);
    setDfdeDedCd(CONSTANTS.SPACE);
    setDfdeDedCstCntnCd(CONSTANTS.SPACE);
    setDfdeDedEeChrgAmt(0);
    setDfdeDedEePls1Amt(0);
    setDfdeDedEeSpoAmt(0);
    setDfdeDedFreqPrdCd(CONSTANTS.SPACE);
    setDfdeDedMbrCnt(CONSTANTS.SPACE);
    setDfdeDedMbrDesc(CONSTANTS.SPACE_6);
    setDfdeDedMultFct((short) 0);
    setDfdeDedMultSalryPct(BigDecimal.ZERO);
    setDfdeLstUpdtDttm(CONSTANTS.SPACE_26);
    setDfdeLstUpdtUserId(CONSTANTS.SPACE_9);
    setDfdeOopMultFct(BigDecimal.ZERO);
  }

  public static int getDclpolPlnMstrFamDedFieldLength() {
    return DCLPOL_PLN_MSTR_FAM_DED_LENGTH;
  }
}
