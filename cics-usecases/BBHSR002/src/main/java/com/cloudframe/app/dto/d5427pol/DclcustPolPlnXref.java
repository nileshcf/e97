package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclcustPolPlnXref is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclcustPolPlnXref extends DclcustPolPlnXrefSerialized {

  private char[] xrfCovTypCd = Field.fillLowValue(1);

  private char[] xrfPolNbr = Field.fillLowValue(6);

  private char[] xrfPlnNbr = Field.fillLowValue(4);

  private char[] xrfClssNbr = Field.fillLowValue(4);

  private short xrfPlnSeqNbr;

  private char[] xrfStdPlnPolNbr = Field.fillLowValue(6);

  private char[] xrfStdPlnPlnNbr = Field.fillLowValue(4);

  private char[] xrfStdPlnClssNbr = Field.fillLowValue(4);

  private char[] xrfCancRsnCd = Field.fillLowValue(1);

  private char[] xrfTefraApplInd = Field.fillLowValue(1);

  private char[] xrfEffDt = Field.fillLowValue(10);

  private char[] xrfCancDt = Field.fillLowValue(10);

  private char[] xrfEbdsSet2Id = Field.fillLowValue(1);

  private char[] xrfAcnInd = Field.fillLowValue(1);

  private char[] xrfUhPremDesgCd = Field.fillLowValue(1);

  private char[] xrfGtdHmoCd = Field.fillLowValue(1);

  private char[] xrfPolNmAdrInd = Field.fillLowValue(1);

  private char[] xrfQcareRptSelCd = Field.fillLowValue(1);

  private char[] xrfAutoAdjdInd = Field.fillLowValue(1);

  private char[] xrfRptCdInd = Field.fillLowValue(1);

  private char[] xrfMailCd = Field.fillLowValue(4);

  private char[] xrfPolPrtypNbr = Field.fillLowValue(6);

  private char[] xrfPlnPrtypNbr = Field.fillLowValue(4);

  private char[] xrfClssPrtypNbr = Field.fillLowValue(4);

  private char[] xrfSfxPrtypCd = Field.fillLowValue(2);

  private char[] xrfFranchCd = Field.fillLowValue(7);

  private char[] xrfBaseCovSetNbr = Field.fillLowValue(3);

  private char[] xrfMmlCovSetNbr = Field.fillLowValue(3);

  private char[] xrfMedcrCovSetNbr = Field.fillLowValue(3);

  private char[] xrfEbdsSetId = Field.fillLowValue(1);

  private char[] xrfAlldAnclInd = Field.fillLowValue(1);

  private char[] xrfPrefPhrmPrdctCd = Field.fillLowValue(6);

  private char[] xrfPrefPhrmIdcrdCd = Field.fillLowValue(1);

  private char[] xrfPcsInd = Field.fillLowValue(1);

  private char[] xrfCchInd = Field.fillLowValue(1);

  private char[] xrfCapXclsInd = Field.fillLowValue(1);

  private short xrfApportPct;

  private char[] xrfPayLoc1Nbr = Field.fillLowValue(3);

  private char[] xrfPayLoc2Nbr = Field.fillLowValue(3);

  private char[] xrfMnnrpCd = Field.fillLowValue(1);

  private short xrfMnnrpPct;

  private char[] xrfIplnTypCd = Field.fillLowValue(1);

  private char[] xrfObligId = Field.fillLowValue(2);

  private char[] xrfShrArngCd = Field.fillLowValue(2);

  private char[] xrfMedcrEstInd = Field.fillLowValue(1);

  private char[] xrfPayEnrleeCd = Field.fillLowValue(1);

  private char[] xrfPrdctPlnClssCd = Field.fillLowValue(3);

  private char[] xrfFreelookInd = Field.fillLowValue(1);

  private char[] xrfEvdBasDialgInd = Field.fillLowValue(1);

  private char[] xrfLmtSrvcCd = Field.fillLowValue(1);

  private char[] xrfOptoutUbhtierInd = Field.fillLowValue(1);

  private BigDecimal xrfHraIndAcssptAmt = BigDecimal.ZERO;

  private BigDecimal xrfHraFamAcssptAmt = BigDecimal.ZERO;

  private short xrfDfltSrvcRcChrg;

  private short xrfJqCdReimPct;

  private char[] xrfAppealLangInd = Field.fillLowValue(1);

  private char[] xrfReimPolEdtInd = Field.fillLowValue(1);

  private char[] xrfPlnDedPrortInd = Field.fillLowValue(1);

  private char[] xrfNbSprsInd = Field.fillLowValue(1);

  private char[] xrfPrortEvnt = Field.fillLowValue(1);

  private char[] xrfCoreMedPrrAuthCd = Field.fillLowValue(1);

  private char[] xrfEnrpErInd = Field.fillLowValue(1);

  private char[] xrfEnrpNonErInd = Field.fillLowValue(1);

  private BigDecimal xrfEnrpNonErPct = BigDecimal.ZERO;

  private char[] xrfHcrEhbInd = Field.fillLowValue(1);

  private char[] xrfEnrpEmrgFaclInd = Field.fillLowValue(1);

  private char[] xrfEmergentWrpInd = Field.fillLowValue(1);

  private BigDecimal xrfMnnrpLabPct = BigDecimal.ZERO;

  private BigDecimal xrfMnnrpDmePct = BigDecimal.ZERO;

  private char[] xrfBusSegPltfm = Field.fillLowValue(3);

  private char[] xrfLglEntyCd = Field.fillLowValue(5);

  private BigDecimal xrfEnrpDfltPct = BigDecimal.ZERO;

  private BigDecimal xrfMnrpDfltPct = BigDecimal.ZERO;

  private BigDecimal xrfMnrpPtPct = BigDecimal.ZERO;

  private char[] xrfSurprsMedBilCd = Field.fillLowValue(1);

  /** Constructor for DclcustPolPlnXref */
  public DclcustPolPlnXref() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of xrfCovTypCd
   *
   * @return xrfCovTypCd
   */
  public char[] getXrfCovTypCd() throws CFException {
    if (isXrfCovTypCdModified()) {
      xrfCovTypCd = refreshXrfCovTypCd();
    }
    return xrfCovTypCd;
  }

  /**
   * set variable xrfCovTypCd Corresponding COBOL Variable is XRF-COV-TYP-CD
   *
   * @param value
   */
  public void setXrfCovTypCd(char[] value) {
    xrfCovTypCd = checkXrfCovTypCdConstraints(value);
    serializeXrfCovTypCd(xrfCovTypCd);
  }

  /**
   * Update XrfCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfCovTypCd, xrfCovTypCd.length);
  }

  public void setXrfCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCovTypCd, xrfCovTypCd.length);
  }

  /**
   * Update XrfCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update XrfCovTypCd with another Field
   *
   * @param value
   */
  public void setXrfCovTypCd(Field source) {
    replace(source, 0, source.length(), beginXrfCovTypCd, XRF_COV_TYP_CD_LEN);
  }

  /**
   * Update XrfCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCovTypCd, XRF_COV_TYP_CD_LEN);
  }

  /**
   * Update XrfCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPolNbr
   *
   * @return xrfPolNbr
   */
  public char[] getXrfPolNbr() throws CFException {
    if (isXrfPolNbrModified()) {
      xrfPolNbr = refreshXrfPolNbr();
    }
    return xrfPolNbr;
  }

  /**
   * set variable xrfPolNbr Corresponding COBOL Variable is XRF-POL-NBR
   *
   * @param value
   */
  public void setXrfPolNbr(char[] value) {
    xrfPolNbr = checkXrfPolNbrConstraints(value);
    serializeXrfPolNbr(xrfPolNbr);
  }

  /**
   * Update XrfPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPolNbr, xrfPolNbr.length);
  }

  public void setXrfPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNbr, xrfPolNbr.length);
  }

  /**
   * Update XrfPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfPolNbr with another Field
   *
   * @param value
   */
  public void setXrfPolNbr(Field source) {
    replace(source, 0, source.length(), beginXrfPolNbr, XRF_POL_NBR_LEN);
  }

  /**
   * Update XrfPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNbr, XRF_POL_NBR_LEN);
  }

  /**
   * Update XrfPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPlnNbr
   *
   * @return xrfPlnNbr
   */
  public char[] getXrfPlnNbr() throws CFException {
    if (isXrfPlnNbrModified()) {
      xrfPlnNbr = refreshXrfPlnNbr();
    }
    return xrfPlnNbr;
  }

  /**
   * set variable xrfPlnNbr Corresponding COBOL Variable is XRF-PLN-NBR
   *
   * @param value
   */
  public void setXrfPlnNbr(char[] value) {
    xrfPlnNbr = checkXrfPlnNbrConstraints(value);
    serializeXrfPlnNbr(xrfPlnNbr);
  }

  /**
   * Update XrfPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPlnNbr, xrfPlnNbr.length);
  }

  public void setXrfPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnNbr, xrfPlnNbr.length);
  }

  /**
   * Update XrfPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfPlnNbr with another Field
   *
   * @param value
   */
  public void setXrfPlnNbr(Field source) {
    replace(source, 0, source.length(), beginXrfPlnNbr, XRF_PLN_NBR_LEN);
  }

  /**
   * Update XrfPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnNbr, XRF_PLN_NBR_LEN);
  }

  /**
   * Update XrfPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfClssNbr
   *
   * @return xrfClssNbr
   */
  public char[] getXrfClssNbr() throws CFException {
    if (isXrfClssNbrModified()) {
      xrfClssNbr = refreshXrfClssNbr();
    }
    return xrfClssNbr;
  }

  /**
   * set variable xrfClssNbr Corresponding COBOL Variable is XRF-CLSS-NBR
   *
   * @param value
   */
  public void setXrfClssNbr(char[] value) {
    xrfClssNbr = checkXrfClssNbrConstraints(value);
    serializeXrfClssNbr(xrfClssNbr);
  }

  /**
   * Update XrfClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfClssNbr, xrfClssNbr.length);
  }

  public void setXrfClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssNbr, xrfClssNbr.length);
  }

  /**
   * Update XrfClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfClssNbr with another Field
   *
   * @param value
   */
  public void setXrfClssNbr(Field source) {
    replace(source, 0, source.length(), beginXrfClssNbr, XRF_CLSS_NBR_LEN);
  }

  /**
   * Update XrfClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssNbr, XRF_CLSS_NBR_LEN);
  }

  /**
   * Update XrfClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPlnSeqNbr
   *
   * @return xrfPlnSeqNbr
   */
  public short getXrfPlnSeqNbr() throws CFException {
    if (isXrfPlnSeqNbrModified()) {
      xrfPlnSeqNbr = refreshXrfPlnSeqNbr();
    }
    return xrfPlnSeqNbr;
  }

  /**
   * Update XrfPlnSeqNbr with the passed value Corresponding COBOL Variable is XRF-PLN-SEQ-NBR
   *
   * @param number
   */
  public void setXrfPlnSeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    xrfPlnSeqNbr = checkXrfPlnSeqNbrMaxLimit(number);
    serializeXrfPlnSeqNbr(xrfPlnSeqNbr);
  }

  public void setXrfPlnSeqNbr(int number) {
    number = checkXrfPlnSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfPlnSeqNbr((short) number);
  }

  public void setXrfPlnSeqNbr(long number) {
    number = checkXrfPlnSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfPlnSeqNbr((short) number);
  }

  /**
   * Returns the value of xrfStdPlnPolNbr
   *
   * @return xrfStdPlnPolNbr
   */
  public char[] getXrfStdPlnPolNbr() throws CFException {
    if (isXrfStdPlnPolNbrModified()) {
      xrfStdPlnPolNbr = refreshXrfStdPlnPolNbr();
    }
    return xrfStdPlnPolNbr;
  }

  /**
   * set variable xrfStdPlnPolNbr Corresponding COBOL Variable is XRF-STD-PLN-POL-NBR
   *
   * @param value
   */
  public void setXrfStdPlnPolNbr(char[] value) {
    xrfStdPlnPolNbr = checkXrfStdPlnPolNbrConstraints(value);
    serializeXrfStdPlnPolNbr(xrfStdPlnPolNbr);
  }

  /**
   * Update XrfStdPlnPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfStdPlnPolNbr, xrfStdPlnPolNbr.length);
  }

  public void setXrfStdPlnPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPolNbr, xrfStdPlnPolNbr.length);
  }

  /**
   * Update XrfStdPlnPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPolNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfStdPlnPolNbr with another Field
   *
   * @param value
   */
  public void setXrfStdPlnPolNbr(Field source) {
    replace(source, 0, source.length(), beginXrfStdPlnPolNbr, XRF_STD_PLN_POL_NBR_LEN);
  }

  /**
   * Update XrfStdPlnPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPolNbr, XRF_STD_PLN_POL_NBR_LEN);
  }

  /**
   * Update XrfStdPlnPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfStdPlnPlnNbr
   *
   * @return xrfStdPlnPlnNbr
   */
  public char[] getXrfStdPlnPlnNbr() throws CFException {
    if (isXrfStdPlnPlnNbrModified()) {
      xrfStdPlnPlnNbr = refreshXrfStdPlnPlnNbr();
    }
    return xrfStdPlnPlnNbr;
  }

  /**
   * set variable xrfStdPlnPlnNbr Corresponding COBOL Variable is XRF-STD-PLN-PLN-NBR
   *
   * @param value
   */
  public void setXrfStdPlnPlnNbr(char[] value) {
    xrfStdPlnPlnNbr = checkXrfStdPlnPlnNbrConstraints(value);
    serializeXrfStdPlnPlnNbr(xrfStdPlnPlnNbr);
  }

  /**
   * Update XrfStdPlnPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfStdPlnPlnNbr, xrfStdPlnPlnNbr.length);
  }

  public void setXrfStdPlnPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPlnNbr, xrfStdPlnPlnNbr.length);
  }

  /**
   * Update XrfStdPlnPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfStdPlnPlnNbr with another Field
   *
   * @param value
   */
  public void setXrfStdPlnPlnNbr(Field source) {
    replace(source, 0, source.length(), beginXrfStdPlnPlnNbr, XRF_STD_PLN_PLN_NBR_LEN);
  }

  /**
   * Update XrfStdPlnPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPlnNbr, XRF_STD_PLN_PLN_NBR_LEN);
  }

  /**
   * Update XrfStdPlnPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfStdPlnClssNbr
   *
   * @return xrfStdPlnClssNbr
   */
  public char[] getXrfStdPlnClssNbr() throws CFException {
    if (isXrfStdPlnClssNbrModified()) {
      xrfStdPlnClssNbr = refreshXrfStdPlnClssNbr();
    }
    return xrfStdPlnClssNbr;
  }

  /**
   * set variable xrfStdPlnClssNbr Corresponding COBOL Variable is XRF-STD-PLN-CLSS-NBR
   *
   * @param value
   */
  public void setXrfStdPlnClssNbr(char[] value) {
    xrfStdPlnClssNbr = checkXrfStdPlnClssNbrConstraints(value);
    serializeXrfStdPlnClssNbr(xrfStdPlnClssNbr);
  }

  /**
   * Update XrfStdPlnClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfStdPlnClssNbr, xrfStdPlnClssNbr.length);
  }

  public void setXrfStdPlnClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnClssNbr, xrfStdPlnClssNbr.length);
  }

  /**
   * Update XrfStdPlnClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnClssNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfStdPlnClssNbr with another Field
   *
   * @param value
   */
  public void setXrfStdPlnClssNbr(Field source) {
    replace(source, 0, source.length(), beginXrfStdPlnClssNbr, XRF_STD_PLN_CLSS_NBR_LEN);
  }

  /**
   * Update XrfStdPlnClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnClssNbr, XRF_STD_PLN_CLSS_NBR_LEN);
  }

  /**
   * Update XrfStdPlnClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfStdPlnClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfStdPlnClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfCancRsnCd
   *
   * @return xrfCancRsnCd
   */
  public char[] getXrfCancRsnCd() throws CFException {
    if (isXrfCancRsnCdModified()) {
      xrfCancRsnCd = refreshXrfCancRsnCd();
    }
    return xrfCancRsnCd;
  }

  /**
   * set variable xrfCancRsnCd Corresponding COBOL Variable is XRF-CANC-RSN-CD
   *
   * @param value
   */
  public void setXrfCancRsnCd(char[] value) {
    xrfCancRsnCd = checkXrfCancRsnCdConstraints(value);
    serializeXrfCancRsnCd(xrfCancRsnCd);
  }

  /**
   * Update XrfCancRsnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfCancRsnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfCancRsnCd, xrfCancRsnCd.length);
  }

  public void setXrfCancRsnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancRsnCd, xrfCancRsnCd.length);
  }

  /**
   * Update XrfCancRsnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCancRsnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancRsnCd + targetIndex, targetLen);
  }

  /**
   * Update XrfCancRsnCd with another Field
   *
   * @param value
   */
  public void setXrfCancRsnCd(Field source) {
    replace(source, 0, source.length(), beginXrfCancRsnCd, XRF_CANC_RSN_CD_LEN);
  }

  /**
   * Update XrfCancRsnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfCancRsnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancRsnCd, XRF_CANC_RSN_CD_LEN);
  }

  /**
   * Update XrfCancRsnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCancRsnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancRsnCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfTefraApplInd
   *
   * @return xrfTefraApplInd
   */
  public char[] getXrfTefraApplInd() throws CFException {
    if (isXrfTefraApplIndModified()) {
      xrfTefraApplInd = refreshXrfTefraApplInd();
    }
    return xrfTefraApplInd;
  }

  /**
   * set variable xrfTefraApplInd Corresponding COBOL Variable is XRF-TEFRA-APPL-IND
   *
   * @param value
   */
  public void setXrfTefraApplInd(char[] value) {
    xrfTefraApplInd = checkXrfTefraApplIndConstraints(value);
    serializeXrfTefraApplInd(xrfTefraApplInd);
  }

  /**
   * Update XrfTefraApplInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfTefraApplInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfTefraApplInd, xrfTefraApplInd.length);
  }

  public void setXrfTefraApplInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfTefraApplInd, xrfTefraApplInd.length);
  }

  /**
   * Update XrfTefraApplInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfTefraApplInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfTefraApplInd + targetIndex, targetLen);
  }

  /**
   * Update XrfTefraApplInd with another Field
   *
   * @param value
   */
  public void setXrfTefraApplInd(Field source) {
    replace(source, 0, source.length(), beginXrfTefraApplInd, XRF_TEFRA_APPL_IND_LEN);
  }

  /**
   * Update XrfTefraApplInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfTefraApplInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfTefraApplInd, XRF_TEFRA_APPL_IND_LEN);
  }

  /**
   * Update XrfTefraApplInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfTefraApplInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfTefraApplInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEffDt
   *
   * @return xrfEffDt
   */
  public char[] getXrfEffDt() throws CFException {
    if (isXrfEffDtModified()) {
      xrfEffDt = refreshXrfEffDt();
    }
    return xrfEffDt;
  }

  /**
   * set variable xrfEffDt Corresponding COBOL Variable is XRF-EFF-DT
   *
   * @param value
   */
  public void setXrfEffDt(char[] value) {
    xrfEffDt = checkXrfEffDtConstraints(value);
    serializeXrfEffDt(xrfEffDt);
  }

  /**
   * Update XrfEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEffDt, xrfEffDt.length);
  }

  public void setXrfEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEffDt, xrfEffDt.length);
  }

  /**
   * Update XrfEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEffDt + targetIndex, targetLen);
  }

  /**
   * Update XrfEffDt with another Field
   *
   * @param value
   */
  public void setXrfEffDt(Field source) {
    replace(source, 0, source.length(), beginXrfEffDt, XRF_EFF_DT_LEN);
  }

  /**
   * Update XrfEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEffDt, XRF_EFF_DT_LEN);
  }

  /**
   * Update XrfEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfCancDt
   *
   * @return xrfCancDt
   */
  public char[] getXrfCancDt() throws CFException {
    if (isXrfCancDtModified()) {
      xrfCancDt = refreshXrfCancDt();
    }
    return xrfCancDt;
  }

  /**
   * set variable xrfCancDt Corresponding COBOL Variable is XRF-CANC-DT
   *
   * @param value
   */
  public void setXrfCancDt(char[] value) {
    xrfCancDt = checkXrfCancDtConstraints(value);
    serializeXrfCancDt(xrfCancDt);
  }

  /**
   * Update XrfCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfCancDt, xrfCancDt.length);
  }

  public void setXrfCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancDt, xrfCancDt.length);
  }

  /**
   * Update XrfCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancDt + targetIndex, targetLen);
  }

  /**
   * Update XrfCancDt with another Field
   *
   * @param value
   */
  public void setXrfCancDt(Field source) {
    replace(source, 0, source.length(), beginXrfCancDt, XRF_CANC_DT_LEN);
  }

  /**
   * Update XrfCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancDt, XRF_CANC_DT_LEN);
  }

  /**
   * Update XrfCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEbdsSet2Id
   *
   * @return xrfEbdsSet2Id
   */
  public char[] getXrfEbdsSet2Id() throws CFException {
    if (isXrfEbdsSet2IdModified()) {
      xrfEbdsSet2Id = refreshXrfEbdsSet2Id();
    }
    return xrfEbdsSet2Id;
  }

  /**
   * set variable xrfEbdsSet2Id Corresponding COBOL Variable is XRF-EBDS-SET-2-ID
   *
   * @param value
   */
  public void setXrfEbdsSet2Id(char[] value) {
    xrfEbdsSet2Id = checkXrfEbdsSet2IdConstraints(value);
    serializeXrfEbdsSet2Id(xrfEbdsSet2Id);
  }

  /**
   * Update XrfEbdsSet2Id with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSet2Id(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEbdsSet2Id, xrfEbdsSet2Id.length);
  }

  public void setXrfEbdsSet2Id(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSet2Id, xrfEbdsSet2Id.length);
  }

  /**
   * Update XrfEbdsSet2Id with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSet2Id(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSet2Id + targetIndex, targetLen);
  }

  /**
   * Update XrfEbdsSet2Id with another Field
   *
   * @param value
   */
  public void setXrfEbdsSet2Id(Field source) {
    replace(source, 0, source.length(), beginXrfEbdsSet2Id, XRF_EBDS_SET_2_ID_LEN);
  }

  /**
   * Update XrfEbdsSet2Id with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSet2Id(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSet2Id, XRF_EBDS_SET_2_ID_LEN);
  }

  /**
   * Update XrfEbdsSet2Id with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSet2Id(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSet2Id + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfAcnInd
   *
   * @return xrfAcnInd
   */
  public char[] getXrfAcnInd() throws CFException {
    if (isXrfAcnIndModified()) {
      xrfAcnInd = refreshXrfAcnInd();
    }
    return xrfAcnInd;
  }

  /**
   * set variable xrfAcnInd Corresponding COBOL Variable is XRF-ACN-IND
   *
   * @param value
   */
  public void setXrfAcnInd(char[] value) {
    xrfAcnInd = checkXrfAcnIndConstraints(value);
    serializeXrfAcnInd(xrfAcnInd);
  }

  /**
   * Update XrfAcnInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfAcnInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfAcnInd, xrfAcnInd.length);
  }

  public void setXrfAcnInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAcnInd, xrfAcnInd.length);
  }

  /**
   * Update XrfAcnInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAcnInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAcnInd + targetIndex, targetLen);
  }

  /**
   * Update XrfAcnInd with another Field
   *
   * @param value
   */
  public void setXrfAcnInd(Field source) {
    replace(source, 0, source.length(), beginXrfAcnInd, XRF_ACN_IND_LEN);
  }

  /**
   * Update XrfAcnInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfAcnInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAcnInd, XRF_ACN_IND_LEN);
  }

  /**
   * Update XrfAcnInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAcnInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAcnInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfUhPremDesgCd
   *
   * @return xrfUhPremDesgCd
   */
  public char[] getXrfUhPremDesgCd() throws CFException {
    if (isXrfUhPremDesgCdModified()) {
      xrfUhPremDesgCd = refreshXrfUhPremDesgCd();
    }
    return xrfUhPremDesgCd;
  }

  /**
   * set variable xrfUhPremDesgCd Corresponding COBOL Variable is XRF-UH-PREM-DESG-CD
   *
   * @param value
   */
  public void setXrfUhPremDesgCd(char[] value) {
    xrfUhPremDesgCd = checkXrfUhPremDesgCdConstraints(value);
    serializeXrfUhPremDesgCd(xrfUhPremDesgCd);
  }

  /**
   * Update XrfUhPremDesgCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfUhPremDesgCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfUhPremDesgCd, xrfUhPremDesgCd.length);
  }

  public void setXrfUhPremDesgCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfUhPremDesgCd, xrfUhPremDesgCd.length);
  }

  /**
   * Update XrfUhPremDesgCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfUhPremDesgCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfUhPremDesgCd + targetIndex, targetLen);
  }

  /**
   * Update XrfUhPremDesgCd with another Field
   *
   * @param value
   */
  public void setXrfUhPremDesgCd(Field source) {
    replace(source, 0, source.length(), beginXrfUhPremDesgCd, XRF_UH_PREM_DESG_CD_LEN);
  }

  /**
   * Update XrfUhPremDesgCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfUhPremDesgCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfUhPremDesgCd, XRF_UH_PREM_DESG_CD_LEN);
  }

  /**
   * Update XrfUhPremDesgCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfUhPremDesgCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfUhPremDesgCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfGtdHmoCd
   *
   * @return xrfGtdHmoCd
   */
  public char[] getXrfGtdHmoCd() throws CFException {
    if (isXrfGtdHmoCdModified()) {
      xrfGtdHmoCd = refreshXrfGtdHmoCd();
    }
    return xrfGtdHmoCd;
  }

  /**
   * set variable xrfGtdHmoCd Corresponding COBOL Variable is XRF-GTD-HMO-CD
   *
   * @param value
   */
  public void setXrfGtdHmoCd(char[] value) {
    xrfGtdHmoCd = checkXrfGtdHmoCdConstraints(value);
    serializeXrfGtdHmoCd(xrfGtdHmoCd);
  }

  /**
   * Update XrfGtdHmoCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfGtdHmoCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfGtdHmoCd, xrfGtdHmoCd.length);
  }

  public void setXrfGtdHmoCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfGtdHmoCd, xrfGtdHmoCd.length);
  }

  /**
   * Update XrfGtdHmoCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfGtdHmoCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfGtdHmoCd + targetIndex, targetLen);
  }

  /**
   * Update XrfGtdHmoCd with another Field
   *
   * @param value
   */
  public void setXrfGtdHmoCd(Field source) {
    replace(source, 0, source.length(), beginXrfGtdHmoCd, XRF_GTD_HMO_CD_LEN);
  }

  /**
   * Update XrfGtdHmoCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfGtdHmoCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfGtdHmoCd, XRF_GTD_HMO_CD_LEN);
  }

  /**
   * Update XrfGtdHmoCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfGtdHmoCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfGtdHmoCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPolNmAdrInd
   *
   * @return xrfPolNmAdrInd
   */
  public char[] getXrfPolNmAdrInd() throws CFException {
    if (isXrfPolNmAdrIndModified()) {
      xrfPolNmAdrInd = refreshXrfPolNmAdrInd();
    }
    return xrfPolNmAdrInd;
  }

  /**
   * set variable xrfPolNmAdrInd Corresponding COBOL Variable is XRF-POL-NM-ADR-IND
   *
   * @param value
   */
  public void setXrfPolNmAdrInd(char[] value) {
    xrfPolNmAdrInd = checkXrfPolNmAdrIndConstraints(value);
    serializeXrfPolNmAdrInd(xrfPolNmAdrInd);
  }

  /**
   * Update XrfPolNmAdrInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPolNmAdrInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPolNmAdrInd, xrfPolNmAdrInd.length);
  }

  public void setXrfPolNmAdrInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNmAdrInd, xrfPolNmAdrInd.length);
  }

  /**
   * Update XrfPolNmAdrInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPolNmAdrInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNmAdrInd + targetIndex, targetLen);
  }

  /**
   * Update XrfPolNmAdrInd with another Field
   *
   * @param value
   */
  public void setXrfPolNmAdrInd(Field source) {
    replace(source, 0, source.length(), beginXrfPolNmAdrInd, XRF_POL_NM_ADR_IND_LEN);
  }

  /**
   * Update XrfPolNmAdrInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPolNmAdrInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNmAdrInd, XRF_POL_NM_ADR_IND_LEN);
  }

  /**
   * Update XrfPolNmAdrInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPolNmAdrInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolNmAdrInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfQcareRptSelCd
   *
   * @return xrfQcareRptSelCd
   */
  public char[] getXrfQcareRptSelCd() throws CFException {
    if (isXrfQcareRptSelCdModified()) {
      xrfQcareRptSelCd = refreshXrfQcareRptSelCd();
    }
    return xrfQcareRptSelCd;
  }

  /**
   * set variable xrfQcareRptSelCd Corresponding COBOL Variable is XRF-QCARE-RPT-SEL-CD
   *
   * @param value
   */
  public void setXrfQcareRptSelCd(char[] value) {
    xrfQcareRptSelCd = checkXrfQcareRptSelCdConstraints(value);
    serializeXrfQcareRptSelCd(xrfQcareRptSelCd);
  }

  /**
   * Update XrfQcareRptSelCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfQcareRptSelCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfQcareRptSelCd, xrfQcareRptSelCd.length);
  }

  public void setXrfQcareRptSelCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfQcareRptSelCd, xrfQcareRptSelCd.length);
  }

  /**
   * Update XrfQcareRptSelCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfQcareRptSelCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfQcareRptSelCd + targetIndex, targetLen);
  }

  /**
   * Update XrfQcareRptSelCd with another Field
   *
   * @param value
   */
  public void setXrfQcareRptSelCd(Field source) {
    replace(source, 0, source.length(), beginXrfQcareRptSelCd, XRF_QCARE_RPT_SEL_CD_LEN);
  }

  /**
   * Update XrfQcareRptSelCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfQcareRptSelCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfQcareRptSelCd, XRF_QCARE_RPT_SEL_CD_LEN);
  }

  /**
   * Update XrfQcareRptSelCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfQcareRptSelCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfQcareRptSelCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfAutoAdjdInd
   *
   * @return xrfAutoAdjdInd
   */
  public char[] getXrfAutoAdjdInd() throws CFException {
    if (isXrfAutoAdjdIndModified()) {
      xrfAutoAdjdInd = refreshXrfAutoAdjdInd();
    }
    return xrfAutoAdjdInd;
  }

  /**
   * set variable xrfAutoAdjdInd Corresponding COBOL Variable is XRF-AUTO-ADJD-IND
   *
   * @param value
   */
  public void setXrfAutoAdjdInd(char[] value) {
    xrfAutoAdjdInd = checkXrfAutoAdjdIndConstraints(value);
    serializeXrfAutoAdjdInd(xrfAutoAdjdInd);
  }

  /**
   * Update XrfAutoAdjdInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfAutoAdjdInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfAutoAdjdInd, xrfAutoAdjdInd.length);
  }

  public void setXrfAutoAdjdInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAutoAdjdInd, xrfAutoAdjdInd.length);
  }

  /**
   * Update XrfAutoAdjdInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAutoAdjdInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAutoAdjdInd + targetIndex, targetLen);
  }

  /**
   * Update XrfAutoAdjdInd with another Field
   *
   * @param value
   */
  public void setXrfAutoAdjdInd(Field source) {
    replace(source, 0, source.length(), beginXrfAutoAdjdInd, XRF_AUTO_ADJD_IND_LEN);
  }

  /**
   * Update XrfAutoAdjdInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfAutoAdjdInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAutoAdjdInd, XRF_AUTO_ADJD_IND_LEN);
  }

  /**
   * Update XrfAutoAdjdInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAutoAdjdInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAutoAdjdInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfRptCdInd
   *
   * @return xrfRptCdInd
   */
  public char[] getXrfRptCdInd() throws CFException {
    if (isXrfRptCdIndModified()) {
      xrfRptCdInd = refreshXrfRptCdInd();
    }
    return xrfRptCdInd;
  }

  /**
   * set variable xrfRptCdInd Corresponding COBOL Variable is XRF-RPT-CD-IND
   *
   * @param value
   */
  public void setXrfRptCdInd(char[] value) {
    xrfRptCdInd = checkXrfRptCdIndConstraints(value);
    serializeXrfRptCdInd(xrfRptCdInd);
  }

  /**
   * Update XrfRptCdInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfRptCdInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfRptCdInd, xrfRptCdInd.length);
  }

  public void setXrfRptCdInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfRptCdInd, xrfRptCdInd.length);
  }

  /**
   * Update XrfRptCdInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfRptCdInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfRptCdInd + targetIndex, targetLen);
  }

  /**
   * Update XrfRptCdInd with another Field
   *
   * @param value
   */
  public void setXrfRptCdInd(Field source) {
    replace(source, 0, source.length(), beginXrfRptCdInd, XRF_RPT_CD_IND_LEN);
  }

  /**
   * Update XrfRptCdInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfRptCdInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfRptCdInd, XRF_RPT_CD_IND_LEN);
  }

  /**
   * Update XrfRptCdInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfRptCdInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfRptCdInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfMailCd
   *
   * @return xrfMailCd
   */
  public char[] getXrfMailCd() throws CFException {
    if (isXrfMailCdModified()) {
      xrfMailCd = refreshXrfMailCd();
    }
    return xrfMailCd;
  }

  /**
   * set variable xrfMailCd Corresponding COBOL Variable is XRF-MAIL-CD
   *
   * @param value
   */
  public void setXrfMailCd(char[] value) {
    xrfMailCd = checkXrfMailCdConstraints(value);
    serializeXrfMailCd(xrfMailCd);
  }

  /**
   * Update XrfMailCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfMailCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfMailCd, xrfMailCd.length);
  }

  public void setXrfMailCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMailCd, xrfMailCd.length);
  }

  /**
   * Update XrfMailCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMailCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMailCd + targetIndex, targetLen);
  }

  /**
   * Update XrfMailCd with another Field
   *
   * @param value
   */
  public void setXrfMailCd(Field source) {
    replace(source, 0, source.length(), beginXrfMailCd, XRF_MAIL_CD_LEN);
  }

  /**
   * Update XrfMailCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfMailCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMailCd, XRF_MAIL_CD_LEN);
  }

  /**
   * Update XrfMailCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMailCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMailCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPolPrtypNbr
   *
   * @return xrfPolPrtypNbr
   */
  public char[] getXrfPolPrtypNbr() throws CFException {
    if (isXrfPolPrtypNbrModified()) {
      xrfPolPrtypNbr = refreshXrfPolPrtypNbr();
    }
    return xrfPolPrtypNbr;
  }

  /**
   * set variable xrfPolPrtypNbr Corresponding COBOL Variable is XRF-POL-PRTYP-NBR
   *
   * @param value
   */
  public void setXrfPolPrtypNbr(char[] value) {
    xrfPolPrtypNbr = checkXrfPolPrtypNbrConstraints(value);
    serializeXrfPolPrtypNbr(xrfPolPrtypNbr);
  }

  /**
   * Update XrfPolPrtypNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPolPrtypNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPolPrtypNbr, xrfPolPrtypNbr.length);
  }

  public void setXrfPolPrtypNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolPrtypNbr, xrfPolPrtypNbr.length);
  }

  /**
   * Update XrfPolPrtypNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPolPrtypNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolPrtypNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfPolPrtypNbr with another Field
   *
   * @param value
   */
  public void setXrfPolPrtypNbr(Field source) {
    replace(source, 0, source.length(), beginXrfPolPrtypNbr, XRF_POL_PRTYP_NBR_LEN);
  }

  /**
   * Update XrfPolPrtypNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPolPrtypNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolPrtypNbr, XRF_POL_PRTYP_NBR_LEN);
  }

  /**
   * Update XrfPolPrtypNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPolPrtypNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPolPrtypNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPlnPrtypNbr
   *
   * @return xrfPlnPrtypNbr
   */
  public char[] getXrfPlnPrtypNbr() throws CFException {
    if (isXrfPlnPrtypNbrModified()) {
      xrfPlnPrtypNbr = refreshXrfPlnPrtypNbr();
    }
    return xrfPlnPrtypNbr;
  }

  /**
   * set variable xrfPlnPrtypNbr Corresponding COBOL Variable is XRF-PLN-PRTYP-NBR
   *
   * @param value
   */
  public void setXrfPlnPrtypNbr(char[] value) {
    xrfPlnPrtypNbr = checkXrfPlnPrtypNbrConstraints(value);
    serializeXrfPlnPrtypNbr(xrfPlnPrtypNbr);
  }

  /**
   * Update XrfPlnPrtypNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPlnPrtypNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPlnPrtypNbr, xrfPlnPrtypNbr.length);
  }

  public void setXrfPlnPrtypNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnPrtypNbr, xrfPlnPrtypNbr.length);
  }

  /**
   * Update XrfPlnPrtypNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPlnPrtypNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnPrtypNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfPlnPrtypNbr with another Field
   *
   * @param value
   */
  public void setXrfPlnPrtypNbr(Field source) {
    replace(source, 0, source.length(), beginXrfPlnPrtypNbr, XRF_PLN_PRTYP_NBR_LEN);
  }

  /**
   * Update XrfPlnPrtypNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPlnPrtypNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnPrtypNbr, XRF_PLN_PRTYP_NBR_LEN);
  }

  /**
   * Update XrfPlnPrtypNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPlnPrtypNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnPrtypNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfClssPrtypNbr
   *
   * @return xrfClssPrtypNbr
   */
  public char[] getXrfClssPrtypNbr() throws CFException {
    if (isXrfClssPrtypNbrModified()) {
      xrfClssPrtypNbr = refreshXrfClssPrtypNbr();
    }
    return xrfClssPrtypNbr;
  }

  /**
   * set variable xrfClssPrtypNbr Corresponding COBOL Variable is XRF-CLSS-PRTYP-NBR
   *
   * @param value
   */
  public void setXrfClssPrtypNbr(char[] value) {
    xrfClssPrtypNbr = checkXrfClssPrtypNbrConstraints(value);
    serializeXrfClssPrtypNbr(xrfClssPrtypNbr);
  }

  /**
   * Update XrfClssPrtypNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfClssPrtypNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfClssPrtypNbr, xrfClssPrtypNbr.length);
  }

  public void setXrfClssPrtypNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssPrtypNbr, xrfClssPrtypNbr.length);
  }

  /**
   * Update XrfClssPrtypNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfClssPrtypNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssPrtypNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfClssPrtypNbr with another Field
   *
   * @param value
   */
  public void setXrfClssPrtypNbr(Field source) {
    replace(source, 0, source.length(), beginXrfClssPrtypNbr, XRF_CLSS_PRTYP_NBR_LEN);
  }

  /**
   * Update XrfClssPrtypNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfClssPrtypNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssPrtypNbr, XRF_CLSS_PRTYP_NBR_LEN);
  }

  /**
   * Update XrfClssPrtypNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfClssPrtypNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfClssPrtypNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfSfxPrtypCd
   *
   * @return xrfSfxPrtypCd
   */
  public char[] getXrfSfxPrtypCd() throws CFException {
    if (isXrfSfxPrtypCdModified()) {
      xrfSfxPrtypCd = refreshXrfSfxPrtypCd();
    }
    return xrfSfxPrtypCd;
  }

  /**
   * set variable xrfSfxPrtypCd Corresponding COBOL Variable is XRF-SFX-PRTYP-CD
   *
   * @param value
   */
  public void setXrfSfxPrtypCd(char[] value) {
    xrfSfxPrtypCd = checkXrfSfxPrtypCdConstraints(value);
    serializeXrfSfxPrtypCd(xrfSfxPrtypCd);
  }

  /**
   * Update XrfSfxPrtypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfSfxPrtypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfSfxPrtypCd, xrfSfxPrtypCd.length);
  }

  public void setXrfSfxPrtypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSfxPrtypCd, xrfSfxPrtypCd.length);
  }

  /**
   * Update XrfSfxPrtypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfSfxPrtypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSfxPrtypCd + targetIndex, targetLen);
  }

  /**
   * Update XrfSfxPrtypCd with another Field
   *
   * @param value
   */
  public void setXrfSfxPrtypCd(Field source) {
    replace(source, 0, source.length(), beginXrfSfxPrtypCd, XRF_SFX_PRTYP_CD_LEN);
  }

  /**
   * Update XrfSfxPrtypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfSfxPrtypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSfxPrtypCd, XRF_SFX_PRTYP_CD_LEN);
  }

  /**
   * Update XrfSfxPrtypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfSfxPrtypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSfxPrtypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfFranchCd
   *
   * @return xrfFranchCd
   */
  public char[] getXrfFranchCd() throws CFException {
    if (isXrfFranchCdModified()) {
      xrfFranchCd = refreshXrfFranchCd();
    }
    return xrfFranchCd;
  }

  /**
   * set variable xrfFranchCd Corresponding COBOL Variable is XRF-FRANCH-CD
   *
   * @param value
   */
  public void setXrfFranchCd(char[] value) {
    xrfFranchCd = checkXrfFranchCdConstraints(value);
    serializeXrfFranchCd(xrfFranchCd);
  }

  /**
   * Update XrfFranchCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfFranchCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfFranchCd, xrfFranchCd.length);
  }

  public void setXrfFranchCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFranchCd, xrfFranchCd.length);
  }

  /**
   * Update XrfFranchCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfFranchCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFranchCd + targetIndex, targetLen);
  }

  /**
   * Update XrfFranchCd with another Field
   *
   * @param value
   */
  public void setXrfFranchCd(Field source) {
    replace(source, 0, source.length(), beginXrfFranchCd, XRF_FRANCH_CD_LEN);
  }

  /**
   * Update XrfFranchCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfFranchCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFranchCd, XRF_FRANCH_CD_LEN);
  }

  /**
   * Update XrfFranchCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfFranchCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFranchCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfBaseCovSetNbr
   *
   * @return xrfBaseCovSetNbr
   */
  public char[] getXrfBaseCovSetNbr() throws CFException {
    if (isXrfBaseCovSetNbrModified()) {
      xrfBaseCovSetNbr = refreshXrfBaseCovSetNbr();
    }
    return xrfBaseCovSetNbr;
  }

  /**
   * set variable xrfBaseCovSetNbr Corresponding COBOL Variable is XRF-BASE-COV-SET-NBR
   *
   * @param value
   */
  public void setXrfBaseCovSetNbr(char[] value) {
    xrfBaseCovSetNbr = checkXrfBaseCovSetNbrConstraints(value);
    serializeXrfBaseCovSetNbr(xrfBaseCovSetNbr);
  }

  /**
   * Update XrfBaseCovSetNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfBaseCovSetNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfBaseCovSetNbr, xrfBaseCovSetNbr.length);
  }

  public void setXrfBaseCovSetNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBaseCovSetNbr, xrfBaseCovSetNbr.length);
  }

  /**
   * Update XrfBaseCovSetNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfBaseCovSetNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBaseCovSetNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfBaseCovSetNbr with another Field
   *
   * @param value
   */
  public void setXrfBaseCovSetNbr(Field source) {
    replace(source, 0, source.length(), beginXrfBaseCovSetNbr, XRF_BASE_COV_SET_NBR_LEN);
  }

  /**
   * Update XrfBaseCovSetNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfBaseCovSetNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBaseCovSetNbr, XRF_BASE_COV_SET_NBR_LEN);
  }

  /**
   * Update XrfBaseCovSetNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfBaseCovSetNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBaseCovSetNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfMmlCovSetNbr
   *
   * @return xrfMmlCovSetNbr
   */
  public char[] getXrfMmlCovSetNbr() throws CFException {
    if (isXrfMmlCovSetNbrModified()) {
      xrfMmlCovSetNbr = refreshXrfMmlCovSetNbr();
    }
    return xrfMmlCovSetNbr;
  }

  /**
   * set variable xrfMmlCovSetNbr Corresponding COBOL Variable is XRF-MML-COV-SET-NBR
   *
   * @param value
   */
  public void setXrfMmlCovSetNbr(char[] value) {
    xrfMmlCovSetNbr = checkXrfMmlCovSetNbrConstraints(value);
    serializeXrfMmlCovSetNbr(xrfMmlCovSetNbr);
  }

  /**
   * Update XrfMmlCovSetNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfMmlCovSetNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfMmlCovSetNbr, xrfMmlCovSetNbr.length);
  }

  public void setXrfMmlCovSetNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMmlCovSetNbr, xrfMmlCovSetNbr.length);
  }

  /**
   * Update XrfMmlCovSetNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMmlCovSetNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMmlCovSetNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfMmlCovSetNbr with another Field
   *
   * @param value
   */
  public void setXrfMmlCovSetNbr(Field source) {
    replace(source, 0, source.length(), beginXrfMmlCovSetNbr, XRF_MML_COV_SET_NBR_LEN);
  }

  /**
   * Update XrfMmlCovSetNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfMmlCovSetNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMmlCovSetNbr, XRF_MML_COV_SET_NBR_LEN);
  }

  /**
   * Update XrfMmlCovSetNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMmlCovSetNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMmlCovSetNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfMedcrCovSetNbr
   *
   * @return xrfMedcrCovSetNbr
   */
  public char[] getXrfMedcrCovSetNbr() throws CFException {
    if (isXrfMedcrCovSetNbrModified()) {
      xrfMedcrCovSetNbr = refreshXrfMedcrCovSetNbr();
    }
    return xrfMedcrCovSetNbr;
  }

  /**
   * set variable xrfMedcrCovSetNbr Corresponding COBOL Variable is XRF-MEDCR-COV-SET-NBR
   *
   * @param value
   */
  public void setXrfMedcrCovSetNbr(char[] value) {
    xrfMedcrCovSetNbr = checkXrfMedcrCovSetNbrConstraints(value);
    serializeXrfMedcrCovSetNbr(xrfMedcrCovSetNbr);
  }

  /**
   * Update XrfMedcrCovSetNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfMedcrCovSetNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfMedcrCovSetNbr, xrfMedcrCovSetNbr.length);
  }

  public void setXrfMedcrCovSetNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrCovSetNbr, xrfMedcrCovSetNbr.length);
  }

  /**
   * Update XrfMedcrCovSetNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMedcrCovSetNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrCovSetNbr + targetIndex, targetLen);
  }

  /**
   * Update XrfMedcrCovSetNbr with another Field
   *
   * @param value
   */
  public void setXrfMedcrCovSetNbr(Field source) {
    replace(source, 0, source.length(), beginXrfMedcrCovSetNbr, XRF_MEDCR_COV_SET_NBR_LEN);
  }

  /**
   * Update XrfMedcrCovSetNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfMedcrCovSetNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrCovSetNbr, XRF_MEDCR_COV_SET_NBR_LEN);
  }

  /**
   * Update XrfMedcrCovSetNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMedcrCovSetNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrCovSetNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEbdsSetId
   *
   * @return xrfEbdsSetId
   */
  public char[] getXrfEbdsSetId() throws CFException {
    if (isXrfEbdsSetIdModified()) {
      xrfEbdsSetId = refreshXrfEbdsSetId();
    }
    return xrfEbdsSetId;
  }

  /**
   * set variable xrfEbdsSetId Corresponding COBOL Variable is XRF-EBDS-SET-ID
   *
   * @param value
   */
  public void setXrfEbdsSetId(char[] value) {
    xrfEbdsSetId = checkXrfEbdsSetIdConstraints(value);
    serializeXrfEbdsSetId(xrfEbdsSetId);
  }

  /**
   * Update XrfEbdsSetId with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSetId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEbdsSetId, xrfEbdsSetId.length);
  }

  public void setXrfEbdsSetId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSetId, xrfEbdsSetId.length);
  }

  /**
   * Update XrfEbdsSetId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSetId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSetId + targetIndex, targetLen);
  }

  /**
   * Update XrfEbdsSetId with another Field
   *
   * @param value
   */
  public void setXrfEbdsSetId(Field source) {
    replace(source, 0, source.length(), beginXrfEbdsSetId, XRF_EBDS_SET_ID_LEN);
  }

  /**
   * Update XrfEbdsSetId with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSetId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSetId, XRF_EBDS_SET_ID_LEN);
  }

  /**
   * Update XrfEbdsSetId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEbdsSetId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEbdsSetId + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfAlldAnclInd
   *
   * @return xrfAlldAnclInd
   */
  public char[] getXrfAlldAnclInd() throws CFException {
    if (isXrfAlldAnclIndModified()) {
      xrfAlldAnclInd = refreshXrfAlldAnclInd();
    }
    return xrfAlldAnclInd;
  }

  /**
   * set variable xrfAlldAnclInd Corresponding COBOL Variable is XRF-ALLD-ANCL-IND
   *
   * @param value
   */
  public void setXrfAlldAnclInd(char[] value) {
    xrfAlldAnclInd = checkXrfAlldAnclIndConstraints(value);
    serializeXrfAlldAnclInd(xrfAlldAnclInd);
  }

  /**
   * Update XrfAlldAnclInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfAlldAnclInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfAlldAnclInd, xrfAlldAnclInd.length);
  }

  public void setXrfAlldAnclInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAlldAnclInd, xrfAlldAnclInd.length);
  }

  /**
   * Update XrfAlldAnclInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAlldAnclInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAlldAnclInd + targetIndex, targetLen);
  }

  /**
   * Update XrfAlldAnclInd with another Field
   *
   * @param value
   */
  public void setXrfAlldAnclInd(Field source) {
    replace(source, 0, source.length(), beginXrfAlldAnclInd, XRF_ALLD_ANCL_IND_LEN);
  }

  /**
   * Update XrfAlldAnclInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfAlldAnclInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAlldAnclInd, XRF_ALLD_ANCL_IND_LEN);
  }

  /**
   * Update XrfAlldAnclInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAlldAnclInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAlldAnclInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPrefPhrmPrdctCd
   *
   * @return xrfPrefPhrmPrdctCd
   */
  public char[] getXrfPrefPhrmPrdctCd() throws CFException {
    if (isXrfPrefPhrmPrdctCdModified()) {
      xrfPrefPhrmPrdctCd = refreshXrfPrefPhrmPrdctCd();
    }
    return xrfPrefPhrmPrdctCd;
  }

  /**
   * set variable xrfPrefPhrmPrdctCd Corresponding COBOL Variable is XRF-PREF-PHRM-PRDCT-CD
   *
   * @param value
   */
  public void setXrfPrefPhrmPrdctCd(char[] value) {
    xrfPrefPhrmPrdctCd = checkXrfPrefPhrmPrdctCdConstraints(value);
    serializeXrfPrefPhrmPrdctCd(xrfPrefPhrmPrdctCd);
  }

  /**
   * Update XrfPrefPhrmPrdctCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmPrdctCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPrefPhrmPrdctCd, xrfPrefPhrmPrdctCd.length);
  }

  public void setXrfPrefPhrmPrdctCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmPrdctCd, xrfPrefPhrmPrdctCd.length);
  }

  /**
   * Update XrfPrefPhrmPrdctCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmPrdctCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmPrdctCd + targetIndex, targetLen);
  }

  /**
   * Update XrfPrefPhrmPrdctCd with another Field
   *
   * @param value
   */
  public void setXrfPrefPhrmPrdctCd(Field source) {
    replace(source, 0, source.length(), beginXrfPrefPhrmPrdctCd, XRF_PREF_PHRM_PRDCT_CD_LEN);
  }

  /**
   * Update XrfPrefPhrmPrdctCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmPrdctCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmPrdctCd, XRF_PREF_PHRM_PRDCT_CD_LEN);
  }

  /**
   * Update XrfPrefPhrmPrdctCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmPrdctCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmPrdctCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPrefPhrmIdcrdCd
   *
   * @return xrfPrefPhrmIdcrdCd
   */
  public char[] getXrfPrefPhrmIdcrdCd() throws CFException {
    if (isXrfPrefPhrmIdcrdCdModified()) {
      xrfPrefPhrmIdcrdCd = refreshXrfPrefPhrmIdcrdCd();
    }
    return xrfPrefPhrmIdcrdCd;
  }

  /**
   * set variable xrfPrefPhrmIdcrdCd Corresponding COBOL Variable is XRF-PREF-PHRM-IDCRD-CD
   *
   * @param value
   */
  public void setXrfPrefPhrmIdcrdCd(char[] value) {
    xrfPrefPhrmIdcrdCd = checkXrfPrefPhrmIdcrdCdConstraints(value);
    serializeXrfPrefPhrmIdcrdCd(xrfPrefPhrmIdcrdCd);
  }

  /**
   * Update XrfPrefPhrmIdcrdCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmIdcrdCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPrefPhrmIdcrdCd, xrfPrefPhrmIdcrdCd.length);
  }

  public void setXrfPrefPhrmIdcrdCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmIdcrdCd, xrfPrefPhrmIdcrdCd.length);
  }

  /**
   * Update XrfPrefPhrmIdcrdCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmIdcrdCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmIdcrdCd + targetIndex, targetLen);
  }

  /**
   * Update XrfPrefPhrmIdcrdCd with another Field
   *
   * @param value
   */
  public void setXrfPrefPhrmIdcrdCd(Field source) {
    replace(source, 0, source.length(), beginXrfPrefPhrmIdcrdCd, XRF_PREF_PHRM_IDCRD_CD_LEN);
  }

  /**
   * Update XrfPrefPhrmIdcrdCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmIdcrdCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmIdcrdCd, XRF_PREF_PHRM_IDCRD_CD_LEN);
  }

  /**
   * Update XrfPrefPhrmIdcrdCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrefPhrmIdcrdCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrefPhrmIdcrdCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPcsInd
   *
   * @return xrfPcsInd
   */
  public char[] getXrfPcsInd() throws CFException {
    if (isXrfPcsIndModified()) {
      xrfPcsInd = refreshXrfPcsInd();
    }
    return xrfPcsInd;
  }

  /**
   * set variable xrfPcsInd Corresponding COBOL Variable is XRF-PCS-IND
   *
   * @param value
   */
  public void setXrfPcsInd(char[] value) {
    xrfPcsInd = checkXrfPcsIndConstraints(value);
    serializeXrfPcsInd(xrfPcsInd);
  }

  /**
   * Update XrfPcsInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPcsInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPcsInd, xrfPcsInd.length);
  }

  public void setXrfPcsInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPcsInd, xrfPcsInd.length);
  }

  /**
   * Update XrfPcsInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPcsInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPcsInd + targetIndex, targetLen);
  }

  /**
   * Update XrfPcsInd with another Field
   *
   * @param value
   */
  public void setXrfPcsInd(Field source) {
    replace(source, 0, source.length(), beginXrfPcsInd, XRF_PCS_IND_LEN);
  }

  /**
   * Update XrfPcsInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPcsInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPcsInd, XRF_PCS_IND_LEN);
  }

  /**
   * Update XrfPcsInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPcsInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPcsInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfCchInd
   *
   * @return xrfCchInd
   */
  public char[] getXrfCchInd() throws CFException {
    if (isXrfCchIndModified()) {
      xrfCchInd = refreshXrfCchInd();
    }
    return xrfCchInd;
  }

  /**
   * set variable xrfCchInd Corresponding COBOL Variable is XRF-CCH-IND
   *
   * @param value
   */
  public void setXrfCchInd(char[] value) {
    xrfCchInd = checkXrfCchIndConstraints(value);
    serializeXrfCchInd(xrfCchInd);
  }

  /**
   * Update XrfCchInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfCchInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfCchInd, xrfCchInd.length);
  }

  public void setXrfCchInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCchInd, xrfCchInd.length);
  }

  /**
   * Update XrfCchInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCchInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCchInd + targetIndex, targetLen);
  }

  /**
   * Update XrfCchInd with another Field
   *
   * @param value
   */
  public void setXrfCchInd(Field source) {
    replace(source, 0, source.length(), beginXrfCchInd, XRF_CCH_IND_LEN);
  }

  /**
   * Update XrfCchInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfCchInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCchInd, XRF_CCH_IND_LEN);
  }

  /**
   * Update XrfCchInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCchInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCchInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfCapXclsInd
   *
   * @return xrfCapXclsInd
   */
  public char[] getXrfCapXclsInd() throws CFException {
    if (isXrfCapXclsIndModified()) {
      xrfCapXclsInd = refreshXrfCapXclsInd();
    }
    return xrfCapXclsInd;
  }

  /**
   * set variable xrfCapXclsInd Corresponding COBOL Variable is XRF-CAP-XCLS-IND
   *
   * @param value
   */
  public void setXrfCapXclsInd(char[] value) {
    xrfCapXclsInd = checkXrfCapXclsIndConstraints(value);
    serializeXrfCapXclsInd(xrfCapXclsInd);
  }

  /**
   * Update XrfCapXclsInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfCapXclsInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfCapXclsInd, xrfCapXclsInd.length);
  }

  public void setXrfCapXclsInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCapXclsInd, xrfCapXclsInd.length);
  }

  /**
   * Update XrfCapXclsInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCapXclsInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCapXclsInd + targetIndex, targetLen);
  }

  /**
   * Update XrfCapXclsInd with another Field
   *
   * @param value
   */
  public void setXrfCapXclsInd(Field source) {
    replace(source, 0, source.length(), beginXrfCapXclsInd, XRF_CAP_XCLS_IND_LEN);
  }

  /**
   * Update XrfCapXclsInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfCapXclsInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCapXclsInd, XRF_CAP_XCLS_IND_LEN);
  }

  /**
   * Update XrfCapXclsInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCapXclsInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCapXclsInd + targetIndex, targetLen);
  }

  public short getXrfApportPct() throws CFException {
    if (isXrfApportPctModified()) {
      xrfApportPct = refreshXrfApportPct();
    }
    return xrfApportPct;
  }

  /**
   * Update XrfApportPct with the passed value Corresponding COBOL Variable is XRF-APPORT-PCT
   *
   * @param number
   */
  public void setXrfApportPct(short number) {
    xrfApportPct = checkXrfApportPctMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeXrfApportPct(xrfApportPct);
  }

  public void setXrfApportPct(int number) {
    number = checkXrfApportPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfApportPct((short) number);
  }

  public void setXrfApportPct(long number) {
    number = checkXrfApportPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfApportPct((short) number);
  }

  /**
   * Returns the value of xrfPayLoc1Nbr
   *
   * @return xrfPayLoc1Nbr
   */
  public char[] getXrfPayLoc1Nbr() throws CFException {
    if (isXrfPayLoc1NbrModified()) {
      xrfPayLoc1Nbr = refreshXrfPayLoc1Nbr();
    }
    return xrfPayLoc1Nbr;
  }

  /**
   * set variable xrfPayLoc1Nbr Corresponding COBOL Variable is XRF-PAY-LOC-1-NBR
   *
   * @param value
   */
  public void setXrfPayLoc1Nbr(char[] value) {
    xrfPayLoc1Nbr = checkXrfPayLoc1NbrConstraints(value);
    serializeXrfPayLoc1Nbr(xrfPayLoc1Nbr);
  }

  /**
   * Update XrfPayLoc1Nbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc1Nbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPayLoc1Nbr, xrfPayLoc1Nbr.length);
  }

  public void setXrfPayLoc1Nbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc1Nbr, xrfPayLoc1Nbr.length);
  }

  /**
   * Update XrfPayLoc1Nbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc1Nbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc1Nbr + targetIndex, targetLen);
  }

  /**
   * Update XrfPayLoc1Nbr with another Field
   *
   * @param value
   */
  public void setXrfPayLoc1Nbr(Field source) {
    replace(source, 0, source.length(), beginXrfPayLoc1Nbr, XRF_PAY_LOC_1_NBR_LEN);
  }

  /**
   * Update XrfPayLoc1Nbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc1Nbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc1Nbr, XRF_PAY_LOC_1_NBR_LEN);
  }

  /**
   * Update XrfPayLoc1Nbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc1Nbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc1Nbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPayLoc2Nbr
   *
   * @return xrfPayLoc2Nbr
   */
  public char[] getXrfPayLoc2Nbr() throws CFException {
    if (isXrfPayLoc2NbrModified()) {
      xrfPayLoc2Nbr = refreshXrfPayLoc2Nbr();
    }
    return xrfPayLoc2Nbr;
  }

  /**
   * set variable xrfPayLoc2Nbr Corresponding COBOL Variable is XRF-PAY-LOC-2-NBR
   *
   * @param value
   */
  public void setXrfPayLoc2Nbr(char[] value) {
    xrfPayLoc2Nbr = checkXrfPayLoc2NbrConstraints(value);
    serializeXrfPayLoc2Nbr(xrfPayLoc2Nbr);
  }

  /**
   * Update XrfPayLoc2Nbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc2Nbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPayLoc2Nbr, xrfPayLoc2Nbr.length);
  }

  public void setXrfPayLoc2Nbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc2Nbr, xrfPayLoc2Nbr.length);
  }

  /**
   * Update XrfPayLoc2Nbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc2Nbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc2Nbr + targetIndex, targetLen);
  }

  /**
   * Update XrfPayLoc2Nbr with another Field
   *
   * @param value
   */
  public void setXrfPayLoc2Nbr(Field source) {
    replace(source, 0, source.length(), beginXrfPayLoc2Nbr, XRF_PAY_LOC_2_NBR_LEN);
  }

  /**
   * Update XrfPayLoc2Nbr with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc2Nbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc2Nbr, XRF_PAY_LOC_2_NBR_LEN);
  }

  /**
   * Update XrfPayLoc2Nbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPayLoc2Nbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayLoc2Nbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfMnnrpCd
   *
   * @return xrfMnnrpCd
   */
  public char[] getXrfMnnrpCd() throws CFException {
    if (isXrfMnnrpCdModified()) {
      xrfMnnrpCd = refreshXrfMnnrpCd();
    }
    return xrfMnnrpCd;
  }

  /**
   * set variable xrfMnnrpCd Corresponding COBOL Variable is XRF-MNNRP-CD
   *
   * @param value
   */
  public void setXrfMnnrpCd(char[] value) {
    xrfMnnrpCd = checkXrfMnnrpCdConstraints(value);
    serializeXrfMnnrpCd(xrfMnnrpCd);
  }

  /**
   * Update XrfMnnrpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfMnnrpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfMnnrpCd, xrfMnnrpCd.length);
  }

  public void setXrfMnnrpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMnnrpCd, xrfMnnrpCd.length);
  }

  /**
   * Update XrfMnnrpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMnnrpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMnnrpCd + targetIndex, targetLen);
  }

  /**
   * Update XrfMnnrpCd with another Field
   *
   * @param value
   */
  public void setXrfMnnrpCd(Field source) {
    replace(source, 0, source.length(), beginXrfMnnrpCd, XRF_MNNRP_CD_LEN);
  }

  /**
   * Update XrfMnnrpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfMnnrpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMnnrpCd, XRF_MNNRP_CD_LEN);
  }

  /**
   * Update XrfMnnrpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMnnrpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMnnrpCd + targetIndex, targetLen);
  }

  public short getXrfMnnrpPct() throws CFException {
    if (isXrfMnnrpPctModified()) {
      xrfMnnrpPct = refreshXrfMnnrpPct();
    }
    return xrfMnnrpPct;
  }

  /**
   * Update XrfMnnrpPct with the passed value Corresponding COBOL Variable is XRF-MNNRP-PCT
   *
   * @param number
   */
  public void setXrfMnnrpPct(short number) {
    xrfMnnrpPct = checkXrfMnnrpPctMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeXrfMnnrpPct(xrfMnnrpPct);
  }

  public void setXrfMnnrpPct(int number) {
    number = checkXrfMnnrpPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfMnnrpPct((short) number);
  }

  public void setXrfMnnrpPct(long number) {
    number = checkXrfMnnrpPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfMnnrpPct((short) number);
  }

  /**
   * Returns the value of xrfIplnTypCd
   *
   * @return xrfIplnTypCd
   */
  public char[] getXrfIplnTypCd() throws CFException {
    if (isXrfIplnTypCdModified()) {
      xrfIplnTypCd = refreshXrfIplnTypCd();
    }
    return xrfIplnTypCd;
  }

  /**
   * set variable xrfIplnTypCd Corresponding COBOL Variable is XRF-IPLN-TYP-CD
   *
   * @param value
   */
  public void setXrfIplnTypCd(char[] value) {
    xrfIplnTypCd = checkXrfIplnTypCdConstraints(value);
    serializeXrfIplnTypCd(xrfIplnTypCd);
  }

  /**
   * Update XrfIplnTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfIplnTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfIplnTypCd, xrfIplnTypCd.length);
  }

  public void setXrfIplnTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfIplnTypCd, xrfIplnTypCd.length);
  }

  /**
   * Update XrfIplnTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfIplnTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfIplnTypCd + targetIndex, targetLen);
  }

  /**
   * Update XrfIplnTypCd with another Field
   *
   * @param value
   */
  public void setXrfIplnTypCd(Field source) {
    replace(source, 0, source.length(), beginXrfIplnTypCd, XRF_IPLN_TYP_CD_LEN);
  }

  /**
   * Update XrfIplnTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfIplnTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfIplnTypCd, XRF_IPLN_TYP_CD_LEN);
  }

  /**
   * Update XrfIplnTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfIplnTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfIplnTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfObligId
   *
   * @return xrfObligId
   */
  public char[] getXrfObligId() throws CFException {
    if (isXrfObligIdModified()) {
      xrfObligId = refreshXrfObligId();
    }
    return xrfObligId;
  }

  /**
   * set variable xrfObligId Corresponding COBOL Variable is XRF-OBLIG-ID
   *
   * @param value
   */
  public void setXrfObligId(char[] value) {
    xrfObligId = checkXrfObligIdConstraints(value);
    serializeXrfObligId(xrfObligId);
  }

  /**
   * Update XrfObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfObligId, xrfObligId.length);
  }

  public void setXrfObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfObligId, xrfObligId.length);
  }

  /**
   * Update XrfObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfObligId + targetIndex, targetLen);
  }

  /**
   * Update XrfObligId with another Field
   *
   * @param value
   */
  public void setXrfObligId(Field source) {
    replace(source, 0, source.length(), beginXrfObligId, XRF_OBLIG_ID_LEN);
  }

  /**
   * Update XrfObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfObligId, XRF_OBLIG_ID_LEN);
  }

  /**
   * Update XrfObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfShrArngCd
   *
   * @return xrfShrArngCd
   */
  public char[] getXrfShrArngCd() throws CFException {
    if (isXrfShrArngCdModified()) {
      xrfShrArngCd = refreshXrfShrArngCd();
    }
    return xrfShrArngCd;
  }

  /**
   * set variable xrfShrArngCd Corresponding COBOL Variable is XRF-SHR-ARNG-CD
   *
   * @param value
   */
  public void setXrfShrArngCd(char[] value) {
    xrfShrArngCd = checkXrfShrArngCdConstraints(value);
    serializeXrfShrArngCd(xrfShrArngCd);
  }

  /**
   * Update XrfShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfShrArngCd, xrfShrArngCd.length);
  }

  public void setXrfShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfShrArngCd, xrfShrArngCd.length);
  }

  /**
   * Update XrfShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update XrfShrArngCd with another Field
   *
   * @param value
   */
  public void setXrfShrArngCd(Field source) {
    replace(source, 0, source.length(), beginXrfShrArngCd, XRF_SHR_ARNG_CD_LEN);
  }

  /**
   * Update XrfShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfShrArngCd, XRF_SHR_ARNG_CD_LEN);
  }

  /**
   * Update XrfShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfMedcrEstInd
   *
   * @return xrfMedcrEstInd
   */
  public char[] getXrfMedcrEstInd() throws CFException {
    if (isXrfMedcrEstIndModified()) {
      xrfMedcrEstInd = refreshXrfMedcrEstInd();
    }
    return xrfMedcrEstInd;
  }

  /**
   * set variable xrfMedcrEstInd Corresponding COBOL Variable is XRF-MEDCR-EST-IND
   *
   * @param value
   */
  public void setXrfMedcrEstInd(char[] value) {
    xrfMedcrEstInd = checkXrfMedcrEstIndConstraints(value);
    serializeXrfMedcrEstInd(xrfMedcrEstInd);
  }

  /**
   * Update XrfMedcrEstInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfMedcrEstInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfMedcrEstInd, xrfMedcrEstInd.length);
  }

  public void setXrfMedcrEstInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrEstInd, xrfMedcrEstInd.length);
  }

  /**
   * Update XrfMedcrEstInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMedcrEstInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrEstInd + targetIndex, targetLen);
  }

  /**
   * Update XrfMedcrEstInd with another Field
   *
   * @param value
   */
  public void setXrfMedcrEstInd(Field source) {
    replace(source, 0, source.length(), beginXrfMedcrEstInd, XRF_MEDCR_EST_IND_LEN);
  }

  /**
   * Update XrfMedcrEstInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfMedcrEstInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrEstInd, XRF_MEDCR_EST_IND_LEN);
  }

  /**
   * Update XrfMedcrEstInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfMedcrEstInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfMedcrEstInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPayEnrleeCd
   *
   * @return xrfPayEnrleeCd
   */
  public char[] getXrfPayEnrleeCd() throws CFException {
    if (isXrfPayEnrleeCdModified()) {
      xrfPayEnrleeCd = refreshXrfPayEnrleeCd();
    }
    return xrfPayEnrleeCd;
  }

  /**
   * set variable xrfPayEnrleeCd Corresponding COBOL Variable is XRF-PAY-ENRLEE-CD
   *
   * @param value
   */
  public void setXrfPayEnrleeCd(char[] value) {
    xrfPayEnrleeCd = checkXrfPayEnrleeCdConstraints(value);
    serializeXrfPayEnrleeCd(xrfPayEnrleeCd);
  }

  /**
   * Update XrfPayEnrleeCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPayEnrleeCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPayEnrleeCd, xrfPayEnrleeCd.length);
  }

  public void setXrfPayEnrleeCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayEnrleeCd, xrfPayEnrleeCd.length);
  }

  /**
   * Update XrfPayEnrleeCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPayEnrleeCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayEnrleeCd + targetIndex, targetLen);
  }

  /**
   * Update XrfPayEnrleeCd with another Field
   *
   * @param value
   */
  public void setXrfPayEnrleeCd(Field source) {
    replace(source, 0, source.length(), beginXrfPayEnrleeCd, XRF_PAY_ENRLEE_CD_LEN);
  }

  /**
   * Update XrfPayEnrleeCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPayEnrleeCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayEnrleeCd, XRF_PAY_ENRLEE_CD_LEN);
  }

  /**
   * Update XrfPayEnrleeCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPayEnrleeCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPayEnrleeCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPrdctPlnClssCd
   *
   * @return xrfPrdctPlnClssCd
   */
  public char[] getXrfPrdctPlnClssCd() throws CFException {
    if (isXrfPrdctPlnClssCdModified()) {
      xrfPrdctPlnClssCd = refreshXrfPrdctPlnClssCd();
    }
    return xrfPrdctPlnClssCd;
  }

  /**
   * set variable xrfPrdctPlnClssCd Corresponding COBOL Variable is XRF-PRDCT-PLN-CLSS-CD
   *
   * @param value
   */
  public void setXrfPrdctPlnClssCd(char[] value) {
    xrfPrdctPlnClssCd = checkXrfPrdctPlnClssCdConstraints(value);
    serializeXrfPrdctPlnClssCd(xrfPrdctPlnClssCd);
  }

  /**
   * Update XrfPrdctPlnClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPrdctPlnClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPrdctPlnClssCd, xrfPrdctPlnClssCd.length);
  }

  public void setXrfPrdctPlnClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrdctPlnClssCd, xrfPrdctPlnClssCd.length);
  }

  /**
   * Update XrfPrdctPlnClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrdctPlnClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrdctPlnClssCd + targetIndex, targetLen);
  }

  /**
   * Update XrfPrdctPlnClssCd with another Field
   *
   * @param value
   */
  public void setXrfPrdctPlnClssCd(Field source) {
    replace(source, 0, source.length(), beginXrfPrdctPlnClssCd, XRF_PRDCT_PLN_CLSS_CD_LEN);
  }

  /**
   * Update XrfPrdctPlnClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPrdctPlnClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrdctPlnClssCd, XRF_PRDCT_PLN_CLSS_CD_LEN);
  }

  /**
   * Update XrfPrdctPlnClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrdctPlnClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrdctPlnClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfFreelookInd
   *
   * @return xrfFreelookInd
   */
  public char[] getXrfFreelookInd() throws CFException {
    if (isXrfFreelookIndModified()) {
      xrfFreelookInd = refreshXrfFreelookInd();
    }
    return xrfFreelookInd;
  }

  /**
   * set variable xrfFreelookInd Corresponding COBOL Variable is XRF-FREELOOK-IND
   *
   * @param value
   */
  public void setXrfFreelookInd(char[] value) {
    xrfFreelookInd = checkXrfFreelookIndConstraints(value);
    serializeXrfFreelookInd(xrfFreelookInd);
  }

  /**
   * Update XrfFreelookInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfFreelookInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfFreelookInd, xrfFreelookInd.length);
  }

  public void setXrfFreelookInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFreelookInd, xrfFreelookInd.length);
  }

  /**
   * Update XrfFreelookInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfFreelookInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFreelookInd + targetIndex, targetLen);
  }

  /**
   * Update XrfFreelookInd with another Field
   *
   * @param value
   */
  public void setXrfFreelookInd(Field source) {
    replace(source, 0, source.length(), beginXrfFreelookInd, XRF_FREELOOK_IND_LEN);
  }

  /**
   * Update XrfFreelookInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfFreelookInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFreelookInd, XRF_FREELOOK_IND_LEN);
  }

  /**
   * Update XrfFreelookInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfFreelookInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfFreelookInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEvdBasDialgInd
   *
   * @return xrfEvdBasDialgInd
   */
  public char[] getXrfEvdBasDialgInd() throws CFException {
    if (isXrfEvdBasDialgIndModified()) {
      xrfEvdBasDialgInd = refreshXrfEvdBasDialgInd();
    }
    return xrfEvdBasDialgInd;
  }

  /**
   * set variable xrfEvdBasDialgInd Corresponding COBOL Variable is XRF-EVD-BAS-DIALG-IND
   *
   * @param value
   */
  public void setXrfEvdBasDialgInd(char[] value) {
    xrfEvdBasDialgInd = checkXrfEvdBasDialgIndConstraints(value);
    serializeXrfEvdBasDialgInd(xrfEvdBasDialgInd);
  }

  /**
   * Update XrfEvdBasDialgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEvdBasDialgInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEvdBasDialgInd, xrfEvdBasDialgInd.length);
  }

  public void setXrfEvdBasDialgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEvdBasDialgInd, xrfEvdBasDialgInd.length);
  }

  /**
   * Update XrfEvdBasDialgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEvdBasDialgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEvdBasDialgInd + targetIndex, targetLen);
  }

  /**
   * Update XrfEvdBasDialgInd with another Field
   *
   * @param value
   */
  public void setXrfEvdBasDialgInd(Field source) {
    replace(source, 0, source.length(), beginXrfEvdBasDialgInd, XRF_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update XrfEvdBasDialgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEvdBasDialgInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEvdBasDialgInd, XRF_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update XrfEvdBasDialgInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEvdBasDialgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEvdBasDialgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfLmtSrvcCd
   *
   * @return xrfLmtSrvcCd
   */
  public char[] getXrfLmtSrvcCd() throws CFException {
    if (isXrfLmtSrvcCdModified()) {
      xrfLmtSrvcCd = refreshXrfLmtSrvcCd();
    }
    return xrfLmtSrvcCd;
  }

  /**
   * set variable xrfLmtSrvcCd Corresponding COBOL Variable is XRF-LMT-SRVC-CD
   *
   * @param value
   */
  public void setXrfLmtSrvcCd(char[] value) {
    xrfLmtSrvcCd = checkXrfLmtSrvcCdConstraints(value);
    serializeXrfLmtSrvcCd(xrfLmtSrvcCd);
  }

  /**
   * Update XrfLmtSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfLmtSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfLmtSrvcCd, xrfLmtSrvcCd.length);
  }

  public void setXrfLmtSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLmtSrvcCd, xrfLmtSrvcCd.length);
  }

  /**
   * Update XrfLmtSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfLmtSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLmtSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update XrfLmtSrvcCd with another Field
   *
   * @param value
   */
  public void setXrfLmtSrvcCd(Field source) {
    replace(source, 0, source.length(), beginXrfLmtSrvcCd, XRF_LMT_SRVC_CD_LEN);
  }

  /**
   * Update XrfLmtSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfLmtSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLmtSrvcCd, XRF_LMT_SRVC_CD_LEN);
  }

  /**
   * Update XrfLmtSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfLmtSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLmtSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfOptoutUbhtierInd
   *
   * @return xrfOptoutUbhtierInd
   */
  public char[] getXrfOptoutUbhtierInd() throws CFException {
    if (isXrfOptoutUbhtierIndModified()) {
      xrfOptoutUbhtierInd = refreshXrfOptoutUbhtierInd();
    }
    return xrfOptoutUbhtierInd;
  }

  /**
   * set variable xrfOptoutUbhtierInd Corresponding COBOL Variable is XRF-OPTOUT-UBHTIER-IND
   *
   * @param value
   */
  public void setXrfOptoutUbhtierInd(char[] value) {
    xrfOptoutUbhtierInd = checkXrfOptoutUbhtierIndConstraints(value);
    serializeXrfOptoutUbhtierInd(xrfOptoutUbhtierInd);
  }

  /**
   * Update XrfOptoutUbhtierInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfOptoutUbhtierInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginXrfOptoutUbhtierInd, xrfOptoutUbhtierInd.length);
  }

  public void setXrfOptoutUbhtierInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfOptoutUbhtierInd, xrfOptoutUbhtierInd.length);
  }

  /**
   * Update XrfOptoutUbhtierInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfOptoutUbhtierInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfOptoutUbhtierInd + targetIndex, targetLen);
  }

  /**
   * Update XrfOptoutUbhtierInd with another Field
   *
   * @param value
   */
  public void setXrfOptoutUbhtierInd(Field source) {
    replace(source, 0, source.length(), beginXrfOptoutUbhtierInd, XRF_OPTOUT_UBHTIER_IND_LEN);
  }

  /**
   * Update XrfOptoutUbhtierInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfOptoutUbhtierInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfOptoutUbhtierInd, XRF_OPTOUT_UBHTIER_IND_LEN);
  }

  /**
   * Update XrfOptoutUbhtierInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfOptoutUbhtierInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfOptoutUbhtierInd + targetIndex, targetLen);
  }

  public BigDecimal getXrfHraIndAcssptAmt() throws CFException {
    if (isXrfHraIndAcssptAmtModified()) {
      xrfHraIndAcssptAmt = refreshXrfHraIndAcssptAmt();
    }
    return xrfHraIndAcssptAmt;
  }

  public char[] getXrfHraIndAcssptAmtString() {
    return xrfHraIndAcssptAmtString();
  }

  /**
   * Update XrfHraIndAcssptAmt with the passed number Corresponding COBOL Variable is
   * XRF-HRA-IND-ACSSPT-AMT
   *
   * @param number
   */
  public void setXrfHraIndAcssptAmt(BigDecimal number) {
    xrfHraIndAcssptAmt = checkXrfHraIndAcssptAmtMaxLimit(number);
    serializeXrfHraIndAcssptAmt(xrfHraIndAcssptAmt);
  }

  public BigDecimal getXrfHraFamAcssptAmt() throws CFException {
    if (isXrfHraFamAcssptAmtModified()) {
      xrfHraFamAcssptAmt = refreshXrfHraFamAcssptAmt();
    }
    return xrfHraFamAcssptAmt;
  }

  public char[] getXrfHraFamAcssptAmtString() {
    return xrfHraFamAcssptAmtString();
  }

  /**
   * Update XrfHraFamAcssptAmt with the passed number Corresponding COBOL Variable is
   * XRF-HRA-FAM-ACSSPT-AMT
   *
   * @param number
   */
  public void setXrfHraFamAcssptAmt(BigDecimal number) {
    xrfHraFamAcssptAmt = checkXrfHraFamAcssptAmtMaxLimit(number);
    serializeXrfHraFamAcssptAmt(xrfHraFamAcssptAmt);
  }

  public short getXrfDfltSrvcRcChrg() throws CFException {
    if (isXrfDfltSrvcRcChrgModified()) {
      xrfDfltSrvcRcChrg = refreshXrfDfltSrvcRcChrg();
    }
    return xrfDfltSrvcRcChrg;
  }

  /**
   * Update XrfDfltSrvcRcChrg with the passed value Corresponding COBOL Variable is
   * XRF-DFLT-SRVC-RC-CHRG
   *
   * @param number
   */
  public void setXrfDfltSrvcRcChrg(short number) {
    xrfDfltSrvcRcChrg =
        checkXrfDfltSrvcRcChrgMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeXrfDfltSrvcRcChrg(xrfDfltSrvcRcChrg);
  }

  public void setXrfDfltSrvcRcChrg(int number) {
    number =
        checkXrfDfltSrvcRcChrgMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfDfltSrvcRcChrg((short) number);
  }

  public void setXrfDfltSrvcRcChrg(long number) {
    number =
        checkXrfDfltSrvcRcChrgMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfDfltSrvcRcChrg((short) number);
  }

  public short getXrfJqCdReimPct() throws CFException {
    if (isXrfJqCdReimPctModified()) {
      xrfJqCdReimPct = refreshXrfJqCdReimPct();
    }
    return xrfJqCdReimPct;
  }

  /**
   * Update XrfJqCdReimPct with the passed value Corresponding COBOL Variable is XRF-JQ-CD-REIM-PCT
   *
   * @param number
   */
  public void setXrfJqCdReimPct(short number) {
    xrfJqCdReimPct =
        checkXrfJqCdReimPctMaxLimit(number); // Truncate if value is beyond +/- Max range
    serializeXrfJqCdReimPct(xrfJqCdReimPct);
  }

  public void setXrfJqCdReimPct(int number) {
    number =
        checkXrfJqCdReimPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfJqCdReimPct((short) number);
  }

  public void setXrfJqCdReimPct(long number) {
    number =
        checkXrfJqCdReimPctMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setXrfJqCdReimPct((short) number);
  }

  /**
   * Returns the value of xrfAppealLangInd
   *
   * @return xrfAppealLangInd
   */
  public char[] getXrfAppealLangInd() throws CFException {
    if (isXrfAppealLangIndModified()) {
      xrfAppealLangInd = refreshXrfAppealLangInd();
    }
    return xrfAppealLangInd;
  }

  /**
   * set variable xrfAppealLangInd Corresponding COBOL Variable is XRF-APPEAL-LANG-IND
   *
   * @param value
   */
  public void setXrfAppealLangInd(char[] value) {
    xrfAppealLangInd = checkXrfAppealLangIndConstraints(value);
    serializeXrfAppealLangInd(xrfAppealLangInd);
  }

  /**
   * Update XrfAppealLangInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfAppealLangInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfAppealLangInd, xrfAppealLangInd.length);
  }

  public void setXrfAppealLangInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAppealLangInd, xrfAppealLangInd.length);
  }

  /**
   * Update XrfAppealLangInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAppealLangInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAppealLangInd + targetIndex, targetLen);
  }

  /**
   * Update XrfAppealLangInd with another Field
   *
   * @param value
   */
  public void setXrfAppealLangInd(Field source) {
    replace(source, 0, source.length(), beginXrfAppealLangInd, XRF_APPEAL_LANG_IND_LEN);
  }

  /**
   * Update XrfAppealLangInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfAppealLangInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAppealLangInd, XRF_APPEAL_LANG_IND_LEN);
  }

  /**
   * Update XrfAppealLangInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfAppealLangInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfAppealLangInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfReimPolEdtInd
   *
   * @return xrfReimPolEdtInd
   */
  public char[] getXrfReimPolEdtInd() throws CFException {
    if (isXrfReimPolEdtIndModified()) {
      xrfReimPolEdtInd = refreshXrfReimPolEdtInd();
    }
    return xrfReimPolEdtInd;
  }

  /**
   * set variable xrfReimPolEdtInd Corresponding COBOL Variable is XRF-REIM-POL-EDT-IND
   *
   * @param value
   */
  public void setXrfReimPolEdtInd(char[] value) {
    xrfReimPolEdtInd = checkXrfReimPolEdtIndConstraints(value);
    serializeXrfReimPolEdtInd(xrfReimPolEdtInd);
  }

  /**
   * Update XrfReimPolEdtInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfReimPolEdtInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfReimPolEdtInd, xrfReimPolEdtInd.length);
  }

  public void setXrfReimPolEdtInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfReimPolEdtInd, xrfReimPolEdtInd.length);
  }

  /**
   * Update XrfReimPolEdtInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfReimPolEdtInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfReimPolEdtInd + targetIndex, targetLen);
  }

  /**
   * Update XrfReimPolEdtInd with another Field
   *
   * @param value
   */
  public void setXrfReimPolEdtInd(Field source) {
    replace(source, 0, source.length(), beginXrfReimPolEdtInd, XRF_REIM_POL_EDT_IND_LEN);
  }

  /**
   * Update XrfReimPolEdtInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfReimPolEdtInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfReimPolEdtInd, XRF_REIM_POL_EDT_IND_LEN);
  }

  /**
   * Update XrfReimPolEdtInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfReimPolEdtInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfReimPolEdtInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPlnDedPrortInd
   *
   * @return xrfPlnDedPrortInd
   */
  public char[] getXrfPlnDedPrortInd() throws CFException {
    if (isXrfPlnDedPrortIndModified()) {
      xrfPlnDedPrortInd = refreshXrfPlnDedPrortInd();
    }
    return xrfPlnDedPrortInd;
  }

  /**
   * set variable xrfPlnDedPrortInd Corresponding COBOL Variable is XRF-PLN-DED-PRORT-IND
   *
   * @param value
   */
  public void setXrfPlnDedPrortInd(char[] value) {
    xrfPlnDedPrortInd = checkXrfPlnDedPrortIndConstraints(value);
    serializeXrfPlnDedPrortInd(xrfPlnDedPrortInd);
  }

  /**
   * Update XrfPlnDedPrortInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPlnDedPrortInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPlnDedPrortInd, xrfPlnDedPrortInd.length);
  }

  public void setXrfPlnDedPrortInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnDedPrortInd, xrfPlnDedPrortInd.length);
  }

  /**
   * Update XrfPlnDedPrortInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPlnDedPrortInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnDedPrortInd + targetIndex, targetLen);
  }

  /**
   * Update XrfPlnDedPrortInd with another Field
   *
   * @param value
   */
  public void setXrfPlnDedPrortInd(Field source) {
    replace(source, 0, source.length(), beginXrfPlnDedPrortInd, XRF_PLN_DED_PRORT_IND_LEN);
  }

  /**
   * Update XrfPlnDedPrortInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPlnDedPrortInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnDedPrortInd, XRF_PLN_DED_PRORT_IND_LEN);
  }

  /**
   * Update XrfPlnDedPrortInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPlnDedPrortInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPlnDedPrortInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfNbSprsInd
   *
   * @return xrfNbSprsInd
   */
  public char[] getXrfNbSprsInd() throws CFException {
    if (isXrfNbSprsIndModified()) {
      xrfNbSprsInd = refreshXrfNbSprsInd();
    }
    return xrfNbSprsInd;
  }

  /**
   * set variable xrfNbSprsInd Corresponding COBOL Variable is XRF-NB-SPRS-IND
   *
   * @param value
   */
  public void setXrfNbSprsInd(char[] value) {
    xrfNbSprsInd = checkXrfNbSprsIndConstraints(value);
    serializeXrfNbSprsInd(xrfNbSprsInd);
  }

  /**
   * Update XrfNbSprsInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfNbSprsInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfNbSprsInd, xrfNbSprsInd.length);
  }

  public void setXrfNbSprsInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfNbSprsInd, xrfNbSprsInd.length);
  }

  /**
   * Update XrfNbSprsInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfNbSprsInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfNbSprsInd + targetIndex, targetLen);
  }

  /**
   * Update XrfNbSprsInd with another Field
   *
   * @param value
   */
  public void setXrfNbSprsInd(Field source) {
    replace(source, 0, source.length(), beginXrfNbSprsInd, XRF_NB_SPRS_IND_LEN);
  }

  /**
   * Update XrfNbSprsInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfNbSprsInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfNbSprsInd, XRF_NB_SPRS_IND_LEN);
  }

  /**
   * Update XrfNbSprsInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfNbSprsInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfNbSprsInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfPrortEvnt
   *
   * @return xrfPrortEvnt
   */
  public char[] getXrfPrortEvnt() throws CFException {
    if (isXrfPrortEvntModified()) {
      xrfPrortEvnt = refreshXrfPrortEvnt();
    }
    return xrfPrortEvnt;
  }

  /**
   * set variable xrfPrortEvnt Corresponding COBOL Variable is XRF-PRORT-EVNT
   *
   * @param value
   */
  public void setXrfPrortEvnt(char[] value) {
    xrfPrortEvnt = checkXrfPrortEvntConstraints(value);
    serializeXrfPrortEvnt(xrfPrortEvnt);
  }

  /**
   * Update XrfPrortEvnt with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfPrortEvnt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfPrortEvnt, xrfPrortEvnt.length);
  }

  public void setXrfPrortEvnt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrortEvnt, xrfPrortEvnt.length);
  }

  /**
   * Update XrfPrortEvnt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrortEvnt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrortEvnt + targetIndex, targetLen);
  }

  /**
   * Update XrfPrortEvnt with another Field
   *
   * @param value
   */
  public void setXrfPrortEvnt(Field source) {
    replace(source, 0, source.length(), beginXrfPrortEvnt, XRF_PRORT_EVNT_LEN);
  }

  /**
   * Update XrfPrortEvnt with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfPrortEvnt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrortEvnt, XRF_PRORT_EVNT_LEN);
  }

  /**
   * Update XrfPrortEvnt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfPrortEvnt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfPrortEvnt + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfCoreMedPrrAuthCd
   *
   * @return xrfCoreMedPrrAuthCd
   */
  public char[] getXrfCoreMedPrrAuthCd() throws CFException {
    if (isXrfCoreMedPrrAuthCdModified()) {
      xrfCoreMedPrrAuthCd = refreshXrfCoreMedPrrAuthCd();
    }
    return xrfCoreMedPrrAuthCd;
  }

  /**
   * set variable xrfCoreMedPrrAuthCd Corresponding COBOL Variable is XRF-CORE-MED-PRR-AUTH-CD
   *
   * @param value
   */
  public void setXrfCoreMedPrrAuthCd(char[] value) {
    xrfCoreMedPrrAuthCd = checkXrfCoreMedPrrAuthCdConstraints(value);
    serializeXrfCoreMedPrrAuthCd(xrfCoreMedPrrAuthCd);
  }

  /**
   * Update XrfCoreMedPrrAuthCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfCoreMedPrrAuthCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginXrfCoreMedPrrAuthCd, xrfCoreMedPrrAuthCd.length);
  }

  public void setXrfCoreMedPrrAuthCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCoreMedPrrAuthCd, xrfCoreMedPrrAuthCd.length);
  }

  /**
   * Update XrfCoreMedPrrAuthCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCoreMedPrrAuthCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCoreMedPrrAuthCd + targetIndex, targetLen);
  }

  /**
   * Update XrfCoreMedPrrAuthCd with another Field
   *
   * @param value
   */
  public void setXrfCoreMedPrrAuthCd(Field source) {
    replace(source, 0, source.length(), beginXrfCoreMedPrrAuthCd, XRF_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update XrfCoreMedPrrAuthCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfCoreMedPrrAuthCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCoreMedPrrAuthCd, XRF_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update XrfCoreMedPrrAuthCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfCoreMedPrrAuthCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfCoreMedPrrAuthCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEnrpErInd
   *
   * @return xrfEnrpErInd
   */
  public char[] getXrfEnrpErInd() throws CFException {
    if (isXrfEnrpErIndModified()) {
      xrfEnrpErInd = refreshXrfEnrpErInd();
    }
    return xrfEnrpErInd;
  }

  /**
   * set variable xrfEnrpErInd Corresponding COBOL Variable is XRF-ENRP-ER-IND
   *
   * @param value
   */
  public void setXrfEnrpErInd(char[] value) {
    xrfEnrpErInd = checkXrfEnrpErIndConstraints(value);
    serializeXrfEnrpErInd(xrfEnrpErInd);
  }

  /**
   * Update XrfEnrpErInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEnrpErInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEnrpErInd, xrfEnrpErInd.length);
  }

  public void setXrfEnrpErInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpErInd, xrfEnrpErInd.length);
  }

  /**
   * Update XrfEnrpErInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEnrpErInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpErInd + targetIndex, targetLen);
  }

  /**
   * Update XrfEnrpErInd with another Field
   *
   * @param value
   */
  public void setXrfEnrpErInd(Field source) {
    replace(source, 0, source.length(), beginXrfEnrpErInd, XRF_ENRP_ER_IND_LEN);
  }

  /**
   * Update XrfEnrpErInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEnrpErInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpErInd, XRF_ENRP_ER_IND_LEN);
  }

  /**
   * Update XrfEnrpErInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEnrpErInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpErInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEnrpNonErInd
   *
   * @return xrfEnrpNonErInd
   */
  public char[] getXrfEnrpNonErInd() throws CFException {
    if (isXrfEnrpNonErIndModified()) {
      xrfEnrpNonErInd = refreshXrfEnrpNonErInd();
    }
    return xrfEnrpNonErInd;
  }

  /**
   * set variable xrfEnrpNonErInd Corresponding COBOL Variable is XRF-ENRP-NON-ER-IND
   *
   * @param value
   */
  public void setXrfEnrpNonErInd(char[] value) {
    xrfEnrpNonErInd = checkXrfEnrpNonErIndConstraints(value);
    serializeXrfEnrpNonErInd(xrfEnrpNonErInd);
  }

  /**
   * Update XrfEnrpNonErInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEnrpNonErInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEnrpNonErInd, xrfEnrpNonErInd.length);
  }

  public void setXrfEnrpNonErInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpNonErInd, xrfEnrpNonErInd.length);
  }

  /**
   * Update XrfEnrpNonErInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEnrpNonErInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpNonErInd + targetIndex, targetLen);
  }

  /**
   * Update XrfEnrpNonErInd with another Field
   *
   * @param value
   */
  public void setXrfEnrpNonErInd(Field source) {
    replace(source, 0, source.length(), beginXrfEnrpNonErInd, XRF_ENRP_NON_ER_IND_LEN);
  }

  /**
   * Update XrfEnrpNonErInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEnrpNonErInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpNonErInd, XRF_ENRP_NON_ER_IND_LEN);
  }

  /**
   * Update XrfEnrpNonErInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEnrpNonErInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpNonErInd + targetIndex, targetLen);
  }

  public BigDecimal getXrfEnrpNonErPct() throws CFException {
    if (isXrfEnrpNonErPctModified()) {
      xrfEnrpNonErPct = refreshXrfEnrpNonErPct();
    }
    return xrfEnrpNonErPct;
  }

  public char[] getXrfEnrpNonErPctString() {
    return xrfEnrpNonErPctString();
  }

  /**
   * Update XrfEnrpNonErPct with the passed number Corresponding COBOL Variable is
   * XRF-ENRP-NON-ER-PCT
   *
   * @param number
   */
  public void setXrfEnrpNonErPct(BigDecimal number) {
    xrfEnrpNonErPct = checkXrfEnrpNonErPctMaxLimit(number);
    serializeXrfEnrpNonErPct(xrfEnrpNonErPct);
  }
  /**
   * Returns the value of xrfHcrEhbInd
   *
   * @return xrfHcrEhbInd
   */
  public char[] getXrfHcrEhbInd() throws CFException {
    if (isXrfHcrEhbIndModified()) {
      xrfHcrEhbInd = refreshXrfHcrEhbInd();
    }
    return xrfHcrEhbInd;
  }

  /**
   * set variable xrfHcrEhbInd Corresponding COBOL Variable is XRF-HCR-EHB-IND
   *
   * @param value
   */
  public void setXrfHcrEhbInd(char[] value) {
    xrfHcrEhbInd = checkXrfHcrEhbIndConstraints(value);
    serializeXrfHcrEhbInd(xrfHcrEhbInd);
  }

  /**
   * Update XrfHcrEhbInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfHcrEhbInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfHcrEhbInd, xrfHcrEhbInd.length);
  }

  public void setXrfHcrEhbInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfHcrEhbInd, xrfHcrEhbInd.length);
  }

  /**
   * Update XrfHcrEhbInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfHcrEhbInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfHcrEhbInd + targetIndex, targetLen);
  }

  /**
   * Update XrfHcrEhbInd with another Field
   *
   * @param value
   */
  public void setXrfHcrEhbInd(Field source) {
    replace(source, 0, source.length(), beginXrfHcrEhbInd, XRF_HCR_EHB_IND_LEN);
  }

  /**
   * Update XrfHcrEhbInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfHcrEhbInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfHcrEhbInd, XRF_HCR_EHB_IND_LEN);
  }

  /**
   * Update XrfHcrEhbInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfHcrEhbInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfHcrEhbInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEnrpEmrgFaclInd
   *
   * @return xrfEnrpEmrgFaclInd
   */
  public char[] getXrfEnrpEmrgFaclInd() throws CFException {
    if (isXrfEnrpEmrgFaclIndModified()) {
      xrfEnrpEmrgFaclInd = refreshXrfEnrpEmrgFaclInd();
    }
    return xrfEnrpEmrgFaclInd;
  }

  /**
   * set variable xrfEnrpEmrgFaclInd Corresponding COBOL Variable is XRF-ENRP-EMRG-FACL-IND
   *
   * @param value
   */
  public void setXrfEnrpEmrgFaclInd(char[] value) {
    xrfEnrpEmrgFaclInd = checkXrfEnrpEmrgFaclIndConstraints(value);
    serializeXrfEnrpEmrgFaclInd(xrfEnrpEmrgFaclInd);
  }

  /**
   * Update XrfEnrpEmrgFaclInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEnrpEmrgFaclInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEnrpEmrgFaclInd, xrfEnrpEmrgFaclInd.length);
  }

  public void setXrfEnrpEmrgFaclInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpEmrgFaclInd, xrfEnrpEmrgFaclInd.length);
  }

  /**
   * Update XrfEnrpEmrgFaclInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEnrpEmrgFaclInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpEmrgFaclInd + targetIndex, targetLen);
  }

  /**
   * Update XrfEnrpEmrgFaclInd with another Field
   *
   * @param value
   */
  public void setXrfEnrpEmrgFaclInd(Field source) {
    replace(source, 0, source.length(), beginXrfEnrpEmrgFaclInd, XRF_ENRP_EMRG_FACL_IND_LEN);
  }

  /**
   * Update XrfEnrpEmrgFaclInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEnrpEmrgFaclInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpEmrgFaclInd, XRF_ENRP_EMRG_FACL_IND_LEN);
  }

  /**
   * Update XrfEnrpEmrgFaclInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEnrpEmrgFaclInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEnrpEmrgFaclInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfEmergentWrpInd
   *
   * @return xrfEmergentWrpInd
   */
  public char[] getXrfEmergentWrpInd() throws CFException {
    if (isXrfEmergentWrpIndModified()) {
      xrfEmergentWrpInd = refreshXrfEmergentWrpInd();
    }
    return xrfEmergentWrpInd;
  }

  /**
   * set variable xrfEmergentWrpInd Corresponding COBOL Variable is XRF-EMERGENT-WRP-IND
   *
   * @param value
   */
  public void setXrfEmergentWrpInd(char[] value) {
    xrfEmergentWrpInd = checkXrfEmergentWrpIndConstraints(value);
    serializeXrfEmergentWrpInd(xrfEmergentWrpInd);
  }

  /**
   * Update XrfEmergentWrpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfEmergentWrpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfEmergentWrpInd, xrfEmergentWrpInd.length);
  }

  public void setXrfEmergentWrpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEmergentWrpInd, xrfEmergentWrpInd.length);
  }

  /**
   * Update XrfEmergentWrpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEmergentWrpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEmergentWrpInd + targetIndex, targetLen);
  }

  /**
   * Update XrfEmergentWrpInd with another Field
   *
   * @param value
   */
  public void setXrfEmergentWrpInd(Field source) {
    replace(source, 0, source.length(), beginXrfEmergentWrpInd, XRF_EMERGENT_WRP_IND_LEN);
  }

  /**
   * Update XrfEmergentWrpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfEmergentWrpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEmergentWrpInd, XRF_EMERGENT_WRP_IND_LEN);
  }

  /**
   * Update XrfEmergentWrpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfEmergentWrpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfEmergentWrpInd + targetIndex, targetLen);
  }

  public BigDecimal getXrfMnnrpLabPct() throws CFException {
    if (isXrfMnnrpLabPctModified()) {
      xrfMnnrpLabPct = refreshXrfMnnrpLabPct();
    }
    return xrfMnnrpLabPct;
  }

  public char[] getXrfMnnrpLabPctString() {
    return xrfMnnrpLabPctString();
  }

  /**
   * Update XrfMnnrpLabPct with the passed number Corresponding COBOL Variable is XRF-MNNRP-LAB-PCT
   *
   * @param number
   */
  public void setXrfMnnrpLabPct(BigDecimal number) {
    xrfMnnrpLabPct = checkXrfMnnrpLabPctMaxLimit(number);
    serializeXrfMnnrpLabPct(xrfMnnrpLabPct);
  }

  public BigDecimal getXrfMnnrpDmePct() throws CFException {
    if (isXrfMnnrpDmePctModified()) {
      xrfMnnrpDmePct = refreshXrfMnnrpDmePct();
    }
    return xrfMnnrpDmePct;
  }

  public char[] getXrfMnnrpDmePctString() {
    return xrfMnnrpDmePctString();
  }

  /**
   * Update XrfMnnrpDmePct with the passed number Corresponding COBOL Variable is XRF-MNNRP-DME-PCT
   *
   * @param number
   */
  public void setXrfMnnrpDmePct(BigDecimal number) {
    xrfMnnrpDmePct = checkXrfMnnrpDmePctMaxLimit(number);
    serializeXrfMnnrpDmePct(xrfMnnrpDmePct);
  }
  /**
   * Returns the value of xrfBusSegPltfm
   *
   * @return xrfBusSegPltfm
   */
  public char[] getXrfBusSegPltfm() throws CFException {
    if (isXrfBusSegPltfmModified()) {
      xrfBusSegPltfm = refreshXrfBusSegPltfm();
    }
    return xrfBusSegPltfm;
  }

  /**
   * set variable xrfBusSegPltfm Corresponding COBOL Variable is XRF-BUS-SEG-PLTFM
   *
   * @param value
   */
  public void setXrfBusSegPltfm(char[] value) {
    xrfBusSegPltfm = checkXrfBusSegPltfmConstraints(value);
    serializeXrfBusSegPltfm(xrfBusSegPltfm);
  }

  /**
   * Update XrfBusSegPltfm with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfBusSegPltfm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfBusSegPltfm, xrfBusSegPltfm.length);
  }

  public void setXrfBusSegPltfm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBusSegPltfm, xrfBusSegPltfm.length);
  }

  /**
   * Update XrfBusSegPltfm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfBusSegPltfm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBusSegPltfm + targetIndex, targetLen);
  }

  /**
   * Update XrfBusSegPltfm with another Field
   *
   * @param value
   */
  public void setXrfBusSegPltfm(Field source) {
    replace(source, 0, source.length(), beginXrfBusSegPltfm, XRF_BUS_SEG_PLTFM_LEN);
  }

  /**
   * Update XrfBusSegPltfm with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfBusSegPltfm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBusSegPltfm, XRF_BUS_SEG_PLTFM_LEN);
  }

  /**
   * Update XrfBusSegPltfm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfBusSegPltfm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfBusSegPltfm + targetIndex, targetLen);
  }
  /**
   * Returns the value of xrfLglEntyCd
   *
   * @return xrfLglEntyCd
   */
  public char[] getXrfLglEntyCd() throws CFException {
    if (isXrfLglEntyCdModified()) {
      xrfLglEntyCd = refreshXrfLglEntyCd();
    }
    return xrfLglEntyCd;
  }

  /**
   * set variable xrfLglEntyCd Corresponding COBOL Variable is XRF-LGL-ENTY-CD
   *
   * @param value
   */
  public void setXrfLglEntyCd(char[] value) {
    xrfLglEntyCd = checkXrfLglEntyCdConstraints(value);
    serializeXrfLglEntyCd(xrfLglEntyCd);
  }

  /**
   * Update XrfLglEntyCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfLglEntyCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfLglEntyCd, xrfLglEntyCd.length);
  }

  public void setXrfLglEntyCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLglEntyCd, xrfLglEntyCd.length);
  }

  /**
   * Update XrfLglEntyCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfLglEntyCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLglEntyCd + targetIndex, targetLen);
  }

  /**
   * Update XrfLglEntyCd with another Field
   *
   * @param value
   */
  public void setXrfLglEntyCd(Field source) {
    replace(source, 0, source.length(), beginXrfLglEntyCd, XRF_LGL_ENTY_CD_LEN);
  }

  /**
   * Update XrfLglEntyCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfLglEntyCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLglEntyCd, XRF_LGL_ENTY_CD_LEN);
  }

  /**
   * Update XrfLglEntyCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfLglEntyCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfLglEntyCd + targetIndex, targetLen);
  }

  public BigDecimal getXrfEnrpDfltPct() throws CFException {
    if (isXrfEnrpDfltPctModified()) {
      xrfEnrpDfltPct = refreshXrfEnrpDfltPct();
    }
    return xrfEnrpDfltPct;
  }

  public char[] getXrfEnrpDfltPctString() {
    return xrfEnrpDfltPctString();
  }

  /**
   * Update XrfEnrpDfltPct with the passed number Corresponding COBOL Variable is XRF-ENRP-DFLT-PCT
   *
   * @param number
   */
  public void setXrfEnrpDfltPct(BigDecimal number) {
    xrfEnrpDfltPct = checkXrfEnrpDfltPctMaxLimit(number);
    serializeXrfEnrpDfltPct(xrfEnrpDfltPct);
  }

  public BigDecimal getXrfMnrpDfltPct() throws CFException {
    if (isXrfMnrpDfltPctModified()) {
      xrfMnrpDfltPct = refreshXrfMnrpDfltPct();
    }
    return xrfMnrpDfltPct;
  }

  public char[] getXrfMnrpDfltPctString() {
    return xrfMnrpDfltPctString();
  }

  /**
   * Update XrfMnrpDfltPct with the passed number Corresponding COBOL Variable is XRF-MNRP-DFLT-PCT
   *
   * @param number
   */
  public void setXrfMnrpDfltPct(BigDecimal number) {
    xrfMnrpDfltPct = checkXrfMnrpDfltPctMaxLimit(number);
    serializeXrfMnrpDfltPct(xrfMnrpDfltPct);
  }

  public BigDecimal getXrfMnrpPtPct() throws CFException {
    if (isXrfMnrpPtPctModified()) {
      xrfMnrpPtPct = refreshXrfMnrpPtPct();
    }
    return xrfMnrpPtPct;
  }

  public char[] getXrfMnrpPtPctString() {
    return xrfMnrpPtPctString();
  }

  /**
   * Update XrfMnrpPtPct with the passed number Corresponding COBOL Variable is XRF-MNRP-PT-PCT
   *
   * @param number
   */
  public void setXrfMnrpPtPct(BigDecimal number) {
    xrfMnrpPtPct = checkXrfMnrpPtPctMaxLimit(number);
    serializeXrfMnrpPtPct(xrfMnrpPtPct);
  }
  /**
   * Returns the value of xrfSurprsMedBilCd
   *
   * @return xrfSurprsMedBilCd
   */
  public char[] getXrfSurprsMedBilCd() throws CFException {
    if (isXrfSurprsMedBilCdModified()) {
      xrfSurprsMedBilCd = refreshXrfSurprsMedBilCd();
    }
    return xrfSurprsMedBilCd;
  }

  /**
   * set variable xrfSurprsMedBilCd Corresponding COBOL Variable is XRF-SURPRS-MED-BIL-CD
   *
   * @param value
   */
  public void setXrfSurprsMedBilCd(char[] value) {
    xrfSurprsMedBilCd = checkXrfSurprsMedBilCdConstraints(value);
    serializeXrfSurprsMedBilCd(xrfSurprsMedBilCd);
  }

  /**
   * Update XrfSurprsMedBilCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setXrfSurprsMedBilCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginXrfSurprsMedBilCd, xrfSurprsMedBilCd.length);
  }

  public void setXrfSurprsMedBilCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSurprsMedBilCd, xrfSurprsMedBilCd.length);
  }

  /**
   * Update XrfSurprsMedBilCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfSurprsMedBilCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSurprsMedBilCd + targetIndex, targetLen);
  }

  /**
   * Update XrfSurprsMedBilCd with another Field
   *
   * @param value
   */
  public void setXrfSurprsMedBilCd(Field source) {
    replace(source, 0, source.length(), beginXrfSurprsMedBilCd, XRF_SURPRS_MED_BIL_CD_LEN);
  }

  /**
   * Update XrfSurprsMedBilCd with another Field from an offset and length
   *
   * @param value
   */
  public void setXrfSurprsMedBilCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSurprsMedBilCd, XRF_SURPRS_MED_BIL_CD_LEN);
  }

  /**
   * Update XrfSurprsMedBilCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setXrfSurprsMedBilCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginXrfSurprsMedBilCd + targetIndex, targetLen);
  }

  /**
   * initializes DclcustPolPlnXref String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setXrfCovTypCd(CONSTANTS.SPACE);
    setXrfPolNbr(CONSTANTS.SPACE_6);
    setXrfPlnNbr(CONSTANTS.SPACE_4);
    setXrfClssNbr(CONSTANTS.SPACE_4);
    setXrfPlnSeqNbr((short) 0);
    setXrfStdPlnPolNbr(CONSTANTS.SPACE_6);
    setXrfStdPlnPlnNbr(CONSTANTS.SPACE_4);
    setXrfStdPlnClssNbr(CONSTANTS.SPACE_4);
    setXrfCancRsnCd(CONSTANTS.SPACE);
    setXrfTefraApplInd(CONSTANTS.SPACE);
    setXrfEffDt(CONSTANTS.SPACE_10);
    setXrfCancDt(CONSTANTS.SPACE_10);
    setXrfEbdsSet2Id(CONSTANTS.SPACE);
    setXrfAcnInd(CONSTANTS.SPACE);
    setXrfUhPremDesgCd(CONSTANTS.SPACE);
    setXrfGtdHmoCd(CONSTANTS.SPACE);
    setXrfPolNmAdrInd(CONSTANTS.SPACE);
    setXrfQcareRptSelCd(CONSTANTS.SPACE);
    setXrfAutoAdjdInd(CONSTANTS.SPACE);
    setXrfRptCdInd(CONSTANTS.SPACE);
    setXrfMailCd(CONSTANTS.SPACE_4);
    setXrfPolPrtypNbr(CONSTANTS.SPACE_6);
    setXrfPlnPrtypNbr(CONSTANTS.SPACE_4);
    setXrfClssPrtypNbr(CONSTANTS.SPACE_4);
    setXrfSfxPrtypCd(CONSTANTS.SPACE_2);
    setXrfFranchCd(CONSTANTS.SPACE_7);
    setXrfBaseCovSetNbr(CONSTANTS.SPACE_3);
    setXrfMmlCovSetNbr(CONSTANTS.SPACE_3);
    setXrfMedcrCovSetNbr(CONSTANTS.SPACE_3);
    setXrfEbdsSetId(CONSTANTS.SPACE);
    setXrfAlldAnclInd(CONSTANTS.SPACE);
    setXrfPrefPhrmPrdctCd(CONSTANTS.SPACE_6);
    setXrfPrefPhrmIdcrdCd(CONSTANTS.SPACE);
    setXrfPcsInd(CONSTANTS.SPACE);
    setXrfCchInd(CONSTANTS.SPACE);
    setXrfCapXclsInd(CONSTANTS.SPACE);
    setXrfApportPct((short) 0);
    setXrfPayLoc1Nbr(CONSTANTS.SPACE_3);
    setXrfPayLoc2Nbr(CONSTANTS.SPACE_3);
    setXrfMnnrpCd(CONSTANTS.SPACE);
    setXrfMnnrpPct((short) 0);
    setXrfIplnTypCd(CONSTANTS.SPACE);
    setXrfObligId(CONSTANTS.SPACE_2);
    setXrfShrArngCd(CONSTANTS.SPACE_2);
    setXrfMedcrEstInd(CONSTANTS.SPACE);
    setXrfPayEnrleeCd(CONSTANTS.SPACE);
    setXrfPrdctPlnClssCd(CONSTANTS.SPACE_3);
    setXrfFreelookInd(CONSTANTS.SPACE);
    setXrfEvdBasDialgInd(CONSTANTS.SPACE);
    setXrfLmtSrvcCd(CONSTANTS.SPACE);
    setXrfOptoutUbhtierInd(CONSTANTS.SPACE);
    setXrfHraIndAcssptAmt(BigDecimal.ZERO);
    setXrfHraFamAcssptAmt(BigDecimal.ZERO);
    setXrfDfltSrvcRcChrg((short) 0);
    setXrfJqCdReimPct((short) 0);
    setXrfAppealLangInd(CONSTANTS.SPACE);
    setXrfReimPolEdtInd(CONSTANTS.SPACE);
    setXrfPlnDedPrortInd(CONSTANTS.SPACE);
    setXrfNbSprsInd(CONSTANTS.SPACE);
    setXrfPrortEvnt(CONSTANTS.SPACE);
    setXrfCoreMedPrrAuthCd(CONSTANTS.SPACE);
    setXrfEnrpErInd(CONSTANTS.SPACE);
    setXrfEnrpNonErInd(CONSTANTS.SPACE);
    setXrfEnrpNonErPct(BigDecimal.ZERO);
    setXrfHcrEhbInd(CONSTANTS.SPACE);
    setXrfEnrpEmrgFaclInd(CONSTANTS.SPACE);
    setXrfEmergentWrpInd(CONSTANTS.SPACE);
    setXrfMnnrpLabPct(BigDecimal.ZERO);
    setXrfMnnrpDmePct(BigDecimal.ZERO);
    setXrfBusSegPltfm(CONSTANTS.SPACE_3);
    setXrfLglEntyCd(CONSTANTS.SPACE_5);
    setXrfEnrpDfltPct(BigDecimal.ZERO);
    setXrfMnrpDfltPct(BigDecimal.ZERO);
    setXrfMnrpPtPct(BigDecimal.ZERO);
    setXrfSurprsMedBilCd(CONSTANTS.SPACE);
  }

  public static int getDclcustPolPlnXrefFieldLength() {
    return DCLCUST_POL_PLN_XREF_LENGTH;
  }
}
