package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstrBenLvl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclpolPlnMstrBenLvl extends DclpolPlnMstrBenLvlSerialized {

  private char[] dblvCovTypCd = Field.fillLowValue(1);

  private char[] dblvPolNbr = Field.fillLowValue(6);

  private char[] dblvPlnNbr = Field.fillLowValue(4);

  private char[] dblvClssNbr = Field.fillLowValue(4);

  private char[] dblvBenLvlTypCd = Field.fillLowValue(5);

  private char[] dblvBasPctOvrlayCd = Field.fillLowValue(1);

  private char[] dblvDedDescCd = Field.fillLowValue(1);

  private char[] dblvIncntPntlyBasCd = Field.fillLowValue(1);

  private BigDecimal dblvIncntPntlyBasPct = BigDecimal.ZERO;

  private char[] dblvIncntPntlyMedCd = Field.fillLowValue(1);

  private BigDecimal dblvIncntPntlyMedPct = BigDecimal.ZERO;

  private char[] dblvLstUpdtDttm = Field.fillLowValue(26);

  private char[] dblvLstUpdtUserId = Field.fillLowValue(9);

  private char[] dblvNewCoinsCd = Field.fillLowValue(1);

  private char[] dblvOverlayPctCd = Field.fillLowValue(1);

  /** Constructor for DclpolPlnMstrBenLvl */
  public DclpolPlnMstrBenLvl() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dblvCovTypCd
   *
   * @return dblvCovTypCd
   */
  public char[] getDblvCovTypCd() throws CFException {
    if (isDblvCovTypCdModified()) {
      dblvCovTypCd = refreshDblvCovTypCd();
    }
    return dblvCovTypCd;
  }

  /**
   * set variable dblvCovTypCd Corresponding COBOL Variable is DBLV-COV-TYP-CD
   *
   * @param value
   */
  public void setDblvCovTypCd(char[] value) {
    dblvCovTypCd = checkDblvCovTypCdConstraints(value);
    serializeDblvCovTypCd(dblvCovTypCd);
  }

  /**
   * Update DblvCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvCovTypCd, dblvCovTypCd.length);
  }

  public void setDblvCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvCovTypCd, dblvCovTypCd.length);
  }

  /**
   * Update DblvCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update DblvCovTypCd with another Field
   *
   * @param value
   */
  public void setDblvCovTypCd(Field source) {
    replace(source, 0, source.length(), beginDblvCovTypCd, DBLV_COV_TYP_CD_LEN);
  }

  /**
   * Update DblvCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvCovTypCd, DBLV_COV_TYP_CD_LEN);
  }

  /**
   * Update DblvCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvPolNbr
   *
   * @return dblvPolNbr
   */
  public char[] getDblvPolNbr() throws CFException {
    if (isDblvPolNbrModified()) {
      dblvPolNbr = refreshDblvPolNbr();
    }
    return dblvPolNbr;
  }

  /**
   * set variable dblvPolNbr Corresponding COBOL Variable is DBLV-POL-NBR
   *
   * @param value
   */
  public void setDblvPolNbr(char[] value) {
    dblvPolNbr = checkDblvPolNbrConstraints(value);
    serializeDblvPolNbr(dblvPolNbr);
  }

  /**
   * Update DblvPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvPolNbr, dblvPolNbr.length);
  }

  public void setDblvPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPolNbr, dblvPolNbr.length);
  }

  /**
   * Update DblvPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPolNbr + targetIndex, targetLen);
  }

  /**
   * Update DblvPolNbr with another Field
   *
   * @param value
   */
  public void setDblvPolNbr(Field source) {
    replace(source, 0, source.length(), beginDblvPolNbr, DBLV_POL_NBR_LEN);
  }

  /**
   * Update DblvPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPolNbr, DBLV_POL_NBR_LEN);
  }

  /**
   * Update DblvPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvPlnNbr
   *
   * @return dblvPlnNbr
   */
  public char[] getDblvPlnNbr() throws CFException {
    if (isDblvPlnNbrModified()) {
      dblvPlnNbr = refreshDblvPlnNbr();
    }
    return dblvPlnNbr;
  }

  /**
   * set variable dblvPlnNbr Corresponding COBOL Variable is DBLV-PLN-NBR
   *
   * @param value
   */
  public void setDblvPlnNbr(char[] value) {
    dblvPlnNbr = checkDblvPlnNbrConstraints(value);
    serializeDblvPlnNbr(dblvPlnNbr);
  }

  /**
   * Update DblvPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvPlnNbr, dblvPlnNbr.length);
  }

  public void setDblvPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPlnNbr, dblvPlnNbr.length);
  }

  /**
   * Update DblvPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DblvPlnNbr with another Field
   *
   * @param value
   */
  public void setDblvPlnNbr(Field source) {
    replace(source, 0, source.length(), beginDblvPlnNbr, DBLV_PLN_NBR_LEN);
  }

  /**
   * Update DblvPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPlnNbr, DBLV_PLN_NBR_LEN);
  }

  /**
   * Update DblvPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvClssNbr
   *
   * @return dblvClssNbr
   */
  public char[] getDblvClssNbr() throws CFException {
    if (isDblvClssNbrModified()) {
      dblvClssNbr = refreshDblvClssNbr();
    }
    return dblvClssNbr;
  }

  /**
   * set variable dblvClssNbr Corresponding COBOL Variable is DBLV-CLSS-NBR
   *
   * @param value
   */
  public void setDblvClssNbr(char[] value) {
    dblvClssNbr = checkDblvClssNbrConstraints(value);
    serializeDblvClssNbr(dblvClssNbr);
  }

  /**
   * Update DblvClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvClssNbr, dblvClssNbr.length);
  }

  public void setDblvClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvClssNbr, dblvClssNbr.length);
  }

  /**
   * Update DblvClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DblvClssNbr with another Field
   *
   * @param value
   */
  public void setDblvClssNbr(Field source) {
    replace(source, 0, source.length(), beginDblvClssNbr, DBLV_CLSS_NBR_LEN);
  }

  /**
   * Update DblvClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvClssNbr, DBLV_CLSS_NBR_LEN);
  }

  /**
   * Update DblvClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvBenLvlTypCd
   *
   * @return dblvBenLvlTypCd
   */
  public char[] getDblvBenLvlTypCd() throws CFException {
    if (isDblvBenLvlTypCdModified()) {
      dblvBenLvlTypCd = refreshDblvBenLvlTypCd();
    }
    return dblvBenLvlTypCd;
  }

  /**
   * set variable dblvBenLvlTypCd Corresponding COBOL Variable is DBLV-BEN-LVL-TYP-CD
   *
   * @param value
   */
  public void setDblvBenLvlTypCd(char[] value) {
    dblvBenLvlTypCd = checkDblvBenLvlTypCdConstraints(value);
    serializeDblvBenLvlTypCd(dblvBenLvlTypCd);
  }

  /**
   * Update DblvBenLvlTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvBenLvlTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvBenLvlTypCd, dblvBenLvlTypCd.length);
  }

  public void setDblvBenLvlTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBenLvlTypCd, dblvBenLvlTypCd.length);
  }

  /**
   * Update DblvBenLvlTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvBenLvlTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBenLvlTypCd + targetIndex, targetLen);
  }

  /**
   * Update DblvBenLvlTypCd with another Field
   *
   * @param value
   */
  public void setDblvBenLvlTypCd(Field source) {
    replace(source, 0, source.length(), beginDblvBenLvlTypCd, DBLV_BEN_LVL_TYP_CD_LEN);
  }

  /**
   * Update DblvBenLvlTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvBenLvlTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBenLvlTypCd, DBLV_BEN_LVL_TYP_CD_LEN);
  }

  /**
   * Update DblvBenLvlTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvBenLvlTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBenLvlTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvBasPctOvrlayCd
   *
   * @return dblvBasPctOvrlayCd
   */
  public char[] getDblvBasPctOvrlayCd() throws CFException {
    if (isDblvBasPctOvrlayCdModified()) {
      dblvBasPctOvrlayCd = refreshDblvBasPctOvrlayCd();
    }
    return dblvBasPctOvrlayCd;
  }

  /**
   * set variable dblvBasPctOvrlayCd Corresponding COBOL Variable is DBLV-BAS-PCT-OVRLAY-CD
   *
   * @param value
   */
  public void setDblvBasPctOvrlayCd(char[] value) {
    dblvBasPctOvrlayCd = checkDblvBasPctOvrlayCdConstraints(value);
    serializeDblvBasPctOvrlayCd(dblvBasPctOvrlayCd);
  }

  /**
   * Update DblvBasPctOvrlayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvBasPctOvrlayCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvBasPctOvrlayCd, dblvBasPctOvrlayCd.length);
  }

  public void setDblvBasPctOvrlayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBasPctOvrlayCd, dblvBasPctOvrlayCd.length);
  }

  /**
   * Update DblvBasPctOvrlayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvBasPctOvrlayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBasPctOvrlayCd + targetIndex, targetLen);
  }

  /**
   * Update DblvBasPctOvrlayCd with another Field
   *
   * @param value
   */
  public void setDblvBasPctOvrlayCd(Field source) {
    replace(source, 0, source.length(), beginDblvBasPctOvrlayCd, DBLV_BAS_PCT_OVRLAY_CD_LEN);
  }

  /**
   * Update DblvBasPctOvrlayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvBasPctOvrlayCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBasPctOvrlayCd, DBLV_BAS_PCT_OVRLAY_CD_LEN);
  }

  /**
   * Update DblvBasPctOvrlayCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvBasPctOvrlayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvBasPctOvrlayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvDedDescCd
   *
   * @return dblvDedDescCd
   */
  public char[] getDblvDedDescCd() throws CFException {
    if (isDblvDedDescCdModified()) {
      dblvDedDescCd = refreshDblvDedDescCd();
    }
    return dblvDedDescCd;
  }

  /**
   * set variable dblvDedDescCd Corresponding COBOL Variable is DBLV-DED-DESC-CD
   *
   * @param value
   */
  public void setDblvDedDescCd(char[] value) {
    dblvDedDescCd = checkDblvDedDescCdConstraints(value);
    serializeDblvDedDescCd(dblvDedDescCd);
  }

  /**
   * Update DblvDedDescCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvDedDescCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvDedDescCd, dblvDedDescCd.length);
  }

  public void setDblvDedDescCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvDedDescCd, dblvDedDescCd.length);
  }

  /**
   * Update DblvDedDescCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvDedDescCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvDedDescCd + targetIndex, targetLen);
  }

  /**
   * Update DblvDedDescCd with another Field
   *
   * @param value
   */
  public void setDblvDedDescCd(Field source) {
    replace(source, 0, source.length(), beginDblvDedDescCd, DBLV_DED_DESC_CD_LEN);
  }

  /**
   * Update DblvDedDescCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvDedDescCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvDedDescCd, DBLV_DED_DESC_CD_LEN);
  }

  /**
   * Update DblvDedDescCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvDedDescCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvDedDescCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvIncntPntlyBasCd
   *
   * @return dblvIncntPntlyBasCd
   */
  public char[] getDblvIncntPntlyBasCd() throws CFException {
    if (isDblvIncntPntlyBasCdModified()) {
      dblvIncntPntlyBasCd = refreshDblvIncntPntlyBasCd();
    }
    return dblvIncntPntlyBasCd;
  }

  /**
   * set variable dblvIncntPntlyBasCd Corresponding COBOL Variable is DBLV-INCNT-PNTLY-BAS-CD
   *
   * @param value
   */
  public void setDblvIncntPntlyBasCd(char[] value) {
    dblvIncntPntlyBasCd = checkDblvIncntPntlyBasCdConstraints(value);
    serializeDblvIncntPntlyBasCd(dblvIncntPntlyBasCd);
  }

  /**
   * Update DblvIncntPntlyBasCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyBasCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginDblvIncntPntlyBasCd, dblvIncntPntlyBasCd.length);
  }

  public void setDblvIncntPntlyBasCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyBasCd, dblvIncntPntlyBasCd.length);
  }

  /**
   * Update DblvIncntPntlyBasCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyBasCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyBasCd + targetIndex, targetLen);
  }

  /**
   * Update DblvIncntPntlyBasCd with another Field
   *
   * @param value
   */
  public void setDblvIncntPntlyBasCd(Field source) {
    replace(source, 0, source.length(), beginDblvIncntPntlyBasCd, DBLV_INCNT_PNTLY_BAS_CD_LEN);
  }

  /**
   * Update DblvIncntPntlyBasCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyBasCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyBasCd, DBLV_INCNT_PNTLY_BAS_CD_LEN);
  }

  /**
   * Update DblvIncntPntlyBasCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyBasCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyBasCd + targetIndex, targetLen);
  }

  public BigDecimal getDblvIncntPntlyBasPct() throws CFException {
    if (isDblvIncntPntlyBasPctModified()) {
      dblvIncntPntlyBasPct = refreshDblvIncntPntlyBasPct();
    }
    return dblvIncntPntlyBasPct;
  }

  public char[] getDblvIncntPntlyBasPctString() {
    return dblvIncntPntlyBasPctString();
  }

  /**
   * Update DblvIncntPntlyBasPct with the passed number Corresponding COBOL Variable is
   * DBLV-INCNT-PNTLY-BAS-PCT
   *
   * @param number
   */
  public void setDblvIncntPntlyBasPct(BigDecimal number) {
    dblvIncntPntlyBasPct = checkDblvIncntPntlyBasPctMaxLimit(number);
    serializeDblvIncntPntlyBasPct(dblvIncntPntlyBasPct);
  }
  /**
   * Returns the value of dblvIncntPntlyMedCd
   *
   * @return dblvIncntPntlyMedCd
   */
  public char[] getDblvIncntPntlyMedCd() throws CFException {
    if (isDblvIncntPntlyMedCdModified()) {
      dblvIncntPntlyMedCd = refreshDblvIncntPntlyMedCd();
    }
    return dblvIncntPntlyMedCd;
  }

  /**
   * set variable dblvIncntPntlyMedCd Corresponding COBOL Variable is DBLV-INCNT-PNTLY-MED-CD
   *
   * @param value
   */
  public void setDblvIncntPntlyMedCd(char[] value) {
    dblvIncntPntlyMedCd = checkDblvIncntPntlyMedCdConstraints(value);
    serializeDblvIncntPntlyMedCd(dblvIncntPntlyMedCd);
  }

  /**
   * Update DblvIncntPntlyMedCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyMedCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginDblvIncntPntlyMedCd, dblvIncntPntlyMedCd.length);
  }

  public void setDblvIncntPntlyMedCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyMedCd, dblvIncntPntlyMedCd.length);
  }

  /**
   * Update DblvIncntPntlyMedCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyMedCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyMedCd + targetIndex, targetLen);
  }

  /**
   * Update DblvIncntPntlyMedCd with another Field
   *
   * @param value
   */
  public void setDblvIncntPntlyMedCd(Field source) {
    replace(source, 0, source.length(), beginDblvIncntPntlyMedCd, DBLV_INCNT_PNTLY_MED_CD_LEN);
  }

  /**
   * Update DblvIncntPntlyMedCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyMedCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyMedCd, DBLV_INCNT_PNTLY_MED_CD_LEN);
  }

  /**
   * Update DblvIncntPntlyMedCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvIncntPntlyMedCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvIncntPntlyMedCd + targetIndex, targetLen);
  }

  public BigDecimal getDblvIncntPntlyMedPct() throws CFException {
    if (isDblvIncntPntlyMedPctModified()) {
      dblvIncntPntlyMedPct = refreshDblvIncntPntlyMedPct();
    }
    return dblvIncntPntlyMedPct;
  }

  public char[] getDblvIncntPntlyMedPctString() {
    return dblvIncntPntlyMedPctString();
  }

  /**
   * Update DblvIncntPntlyMedPct with the passed number Corresponding COBOL Variable is
   * DBLV-INCNT-PNTLY-MED-PCT
   *
   * @param number
   */
  public void setDblvIncntPntlyMedPct(BigDecimal number) {
    dblvIncntPntlyMedPct = checkDblvIncntPntlyMedPctMaxLimit(number);
    serializeDblvIncntPntlyMedPct(dblvIncntPntlyMedPct);
  }
  /**
   * Returns the value of dblvLstUpdtDttm
   *
   * @return dblvLstUpdtDttm
   */
  public char[] getDblvLstUpdtDttm() throws CFException {
    if (isDblvLstUpdtDttmModified()) {
      dblvLstUpdtDttm = refreshDblvLstUpdtDttm();
    }
    return dblvLstUpdtDttm;
  }

  /**
   * set variable dblvLstUpdtDttm Corresponding COBOL Variable is DBLV-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setDblvLstUpdtDttm(char[] value) {
    dblvLstUpdtDttm = checkDblvLstUpdtDttmConstraints(value);
    serializeDblvLstUpdtDttm(dblvLstUpdtDttm);
  }

  /**
   * Update DblvLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvLstUpdtDttm, dblvLstUpdtDttm.length);
  }

  public void setDblvLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtDttm, dblvLstUpdtDttm.length);
  }

  /**
   * Update DblvLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update DblvLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setDblvLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginDblvLstUpdtDttm, DBLV_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DblvLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtDttm, DBLV_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DblvLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvLstUpdtUserId
   *
   * @return dblvLstUpdtUserId
   */
  public char[] getDblvLstUpdtUserId() throws CFException {
    if (isDblvLstUpdtUserIdModified()) {
      dblvLstUpdtUserId = refreshDblvLstUpdtUserId();
    }
    return dblvLstUpdtUserId;
  }

  /**
   * set variable dblvLstUpdtUserId Corresponding COBOL Variable is DBLV-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setDblvLstUpdtUserId(char[] value) {
    dblvLstUpdtUserId = checkDblvLstUpdtUserIdConstraints(value);
    serializeDblvLstUpdtUserId(dblvLstUpdtUserId);
  }

  /**
   * Update DblvLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvLstUpdtUserId, dblvLstUpdtUserId.length);
  }

  public void setDblvLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtUserId, dblvLstUpdtUserId.length);
  }

  /**
   * Update DblvLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update DblvLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setDblvLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginDblvLstUpdtUserId, DBLV_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DblvLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtUserId, DBLV_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DblvLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvLstUpdtUserId + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvNewCoinsCd
   *
   * @return dblvNewCoinsCd
   */
  public char[] getDblvNewCoinsCd() throws CFException {
    if (isDblvNewCoinsCdModified()) {
      dblvNewCoinsCd = refreshDblvNewCoinsCd();
    }
    return dblvNewCoinsCd;
  }

  /**
   * set variable dblvNewCoinsCd Corresponding COBOL Variable is DBLV-NEW-COINS-CD
   *
   * @param value
   */
  public void setDblvNewCoinsCd(char[] value) {
    dblvNewCoinsCd = checkDblvNewCoinsCdConstraints(value);
    serializeDblvNewCoinsCd(dblvNewCoinsCd);
  }

  /**
   * Update DblvNewCoinsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvNewCoinsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvNewCoinsCd, dblvNewCoinsCd.length);
  }

  public void setDblvNewCoinsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvNewCoinsCd, dblvNewCoinsCd.length);
  }

  /**
   * Update DblvNewCoinsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvNewCoinsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvNewCoinsCd + targetIndex, targetLen);
  }

  /**
   * Update DblvNewCoinsCd with another Field
   *
   * @param value
   */
  public void setDblvNewCoinsCd(Field source) {
    replace(source, 0, source.length(), beginDblvNewCoinsCd, DBLV_NEW_COINS_CD_LEN);
  }

  /**
   * Update DblvNewCoinsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvNewCoinsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvNewCoinsCd, DBLV_NEW_COINS_CD_LEN);
  }

  /**
   * Update DblvNewCoinsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvNewCoinsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvNewCoinsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dblvOverlayPctCd
   *
   * @return dblvOverlayPctCd
   */
  public char[] getDblvOverlayPctCd() throws CFException {
    if (isDblvOverlayPctCdModified()) {
      dblvOverlayPctCd = refreshDblvOverlayPctCd();
    }
    return dblvOverlayPctCd;
  }

  /**
   * set variable dblvOverlayPctCd Corresponding COBOL Variable is DBLV-OVERLAY-PCT-CD
   *
   * @param value
   */
  public void setDblvOverlayPctCd(char[] value) {
    dblvOverlayPctCd = checkDblvOverlayPctCdConstraints(value);
    serializeDblvOverlayPctCd(dblvOverlayPctCd);
  }

  /**
   * Update DblvOverlayPctCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDblvOverlayPctCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDblvOverlayPctCd, dblvOverlayPctCd.length);
  }

  public void setDblvOverlayPctCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvOverlayPctCd, dblvOverlayPctCd.length);
  }

  /**
   * Update DblvOverlayPctCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvOverlayPctCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvOverlayPctCd + targetIndex, targetLen);
  }

  /**
   * Update DblvOverlayPctCd with another Field
   *
   * @param value
   */
  public void setDblvOverlayPctCd(Field source) {
    replace(source, 0, source.length(), beginDblvOverlayPctCd, DBLV_OVERLAY_PCT_CD_LEN);
  }

  /**
   * Update DblvOverlayPctCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDblvOverlayPctCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDblvOverlayPctCd, DBLV_OVERLAY_PCT_CD_LEN);
  }

  /**
   * Update DblvOverlayPctCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDblvOverlayPctCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDblvOverlayPctCd + targetIndex, targetLen);
  }

  /**
   * initializes DclpolPlnMstrBenLvl String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDblvCovTypCd(CONSTANTS.SPACE);
    setDblvPolNbr(CONSTANTS.SPACE_6);
    setDblvPlnNbr(CONSTANTS.SPACE_4);
    setDblvClssNbr(CONSTANTS.SPACE_4);
    setDblvBenLvlTypCd(CONSTANTS.SPACE_5);
    setDblvBasPctOvrlayCd(CONSTANTS.SPACE);
    setDblvDedDescCd(CONSTANTS.SPACE);
    setDblvIncntPntlyBasCd(CONSTANTS.SPACE);
    setDblvIncntPntlyBasPct(BigDecimal.ZERO);
    setDblvIncntPntlyMedCd(CONSTANTS.SPACE);
    setDblvIncntPntlyMedPct(BigDecimal.ZERO);
    setDblvLstUpdtDttm(CONSTANTS.SPACE_26);
    setDblvLstUpdtUserId(CONSTANTS.SPACE_9);
    setDblvNewCoinsCd(CONSTANTS.SPACE);
    setDblvOverlayPctCd(CONSTANTS.SPACE);
  }

  public static int getDclpolPlnMstrBenLvlFieldLength() {
    return DCLPOL_PLN_MSTR_BEN_LVL_LENGTH;
  }
}
