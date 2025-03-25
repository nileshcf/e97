package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclntwkRcprctyDtl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclntwkRcprctyDtl extends DclntwkRcprctyDtlSerialized {

  private char[] dtlRcprctyTblId = Field.fillLowValue(6);

  private short dtlRcprctySeqNbr;

  private char[] dtlPrdctCd = Field.fillLowValue(3);

  private char[] dtlMktTypCd = Field.fillLowValue(2);

  private char[] dtlMktNbr = Field.fillLowValue(7);

  private char[] dtlIpaNbr = Field.fillLowValue(5);

  private char[] dtlGrpTblNbr = Field.fillLowValue(4);

  private char[] dtlPsvCd = Field.fillLowValue(1);

  private char[] dtlPrefCd = Field.fillLowValue(1);

  private char[] dtlContrArngNbr = Field.fillLowValue(1);

  private char[] dtlInclXcldCd = Field.fillLowValue(1);

  private char[] dtlMntlHlthNtwkCd = Field.fillLowValue(1);

  private char[] dtlTravBenCd = Field.fillLowValue(1);

  private char[] dtlRvrsTierInd = Field.fillLowValue(1);

  private char[] dtlXwlkCrltCd = Field.fillLowValue(1);

  private char[] dtlDemotedPremDesigInd = Field.fillLowValue(1);

  /** Constructor for DclntwkRcprctyDtl */
  public DclntwkRcprctyDtl() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dtlRcprctyTblId
   *
   * @return dtlRcprctyTblId
   */
  public char[] getDtlRcprctyTblId() throws CFException {
    if (isDtlRcprctyTblIdModified()) {
      dtlRcprctyTblId = refreshDtlRcprctyTblId();
    }
    return dtlRcprctyTblId;
  }

  /**
   * set variable dtlRcprctyTblId Corresponding COBOL Variable is DTL-RCPRCTY-TBL-ID
   *
   * @param value
   */
  public void setDtlRcprctyTblId(char[] value) {
    dtlRcprctyTblId = checkDtlRcprctyTblIdConstraints(value);
    serializeDtlRcprctyTblId(dtlRcprctyTblId);
  }

  /**
   * Update DtlRcprctyTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlRcprctyTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlRcprctyTblId, dtlRcprctyTblId.length);
  }

  public void setDtlRcprctyTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRcprctyTblId, dtlRcprctyTblId.length);
  }

  /**
   * Update DtlRcprctyTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlRcprctyTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRcprctyTblId + targetIndex, targetLen);
  }

  /**
   * Update DtlRcprctyTblId with another Field
   *
   * @param value
   */
  public void setDtlRcprctyTblId(Field source) {
    replace(source, 0, source.length(), beginDtlRcprctyTblId, DTL_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update DtlRcprctyTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlRcprctyTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRcprctyTblId, DTL_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update DtlRcprctyTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlRcprctyTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRcprctyTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlRcprctySeqNbr
   *
   * @return dtlRcprctySeqNbr
   */
  public short getDtlRcprctySeqNbr() throws CFException {
    if (isDtlRcprctySeqNbrModified()) {
      dtlRcprctySeqNbr = refreshDtlRcprctySeqNbr();
    }
    return dtlRcprctySeqNbr;
  }

  /**
   * Update DtlRcprctySeqNbr with the passed value Corresponding COBOL Variable is
   * DTL-RCPRCTY-SEQ-NBR
   *
   * @param number
   */
  public void setDtlRcprctySeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    dtlRcprctySeqNbr = checkDtlRcprctySeqNbrMaxLimit(number);
    serializeDtlRcprctySeqNbr(dtlRcprctySeqNbr);
  }

  public void setDtlRcprctySeqNbr(int number) {
    number =
        checkDtlRcprctySeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDtlRcprctySeqNbr((short) number);
  }

  public void setDtlRcprctySeqNbr(long number) {
    number =
        checkDtlRcprctySeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDtlRcprctySeqNbr((short) number);
  }

  /**
   * Returns the value of dtlPrdctCd
   *
   * @return dtlPrdctCd
   */
  public char[] getDtlPrdctCd() throws CFException {
    if (isDtlPrdctCdModified()) {
      dtlPrdctCd = refreshDtlPrdctCd();
    }
    return dtlPrdctCd;
  }

  /**
   * set variable dtlPrdctCd Corresponding COBOL Variable is DTL-PRDCT-CD
   *
   * @param value
   */
  public void setDtlPrdctCd(char[] value) {
    dtlPrdctCd = checkDtlPrdctCdConstraints(value);
    serializeDtlPrdctCd(dtlPrdctCd);
  }

  /**
   * Update DtlPrdctCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlPrdctCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlPrdctCd, dtlPrdctCd.length);
  }

  public void setDtlPrdctCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrdctCd, dtlPrdctCd.length);
  }

  /**
   * Update DtlPrdctCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlPrdctCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrdctCd + targetIndex, targetLen);
  }

  /**
   * Update DtlPrdctCd with another Field
   *
   * @param value
   */
  public void setDtlPrdctCd(Field source) {
    replace(source, 0, source.length(), beginDtlPrdctCd, DTL_PRDCT_CD_LEN);
  }

  /**
   * Update DtlPrdctCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlPrdctCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrdctCd, DTL_PRDCT_CD_LEN);
  }

  /**
   * Update DtlPrdctCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlPrdctCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrdctCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlMktTypCd
   *
   * @return dtlMktTypCd
   */
  public char[] getDtlMktTypCd() throws CFException {
    if (isDtlMktTypCdModified()) {
      dtlMktTypCd = refreshDtlMktTypCd();
    }
    return dtlMktTypCd;
  }

  /**
   * set variable dtlMktTypCd Corresponding COBOL Variable is DTL-MKT-TYP-CD
   *
   * @param value
   */
  public void setDtlMktTypCd(char[] value) {
    dtlMktTypCd = checkDtlMktTypCdConstraints(value);
    serializeDtlMktTypCd(dtlMktTypCd);
  }

  /**
   * Update DtlMktTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlMktTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlMktTypCd, dtlMktTypCd.length);
  }

  public void setDtlMktTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktTypCd, dtlMktTypCd.length);
  }

  /**
   * Update DtlMktTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlMktTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktTypCd + targetIndex, targetLen);
  }

  /**
   * Update DtlMktTypCd with another Field
   *
   * @param value
   */
  public void setDtlMktTypCd(Field source) {
    replace(source, 0, source.length(), beginDtlMktTypCd, DTL_MKT_TYP_CD_LEN);
  }

  /**
   * Update DtlMktTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlMktTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktTypCd, DTL_MKT_TYP_CD_LEN);
  }

  /**
   * Update DtlMktTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlMktTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlMktNbr
   *
   * @return dtlMktNbr
   */
  public char[] getDtlMktNbr() throws CFException {
    if (isDtlMktNbrModified()) {
      dtlMktNbr = refreshDtlMktNbr();
    }
    return dtlMktNbr;
  }

  /**
   * set variable dtlMktNbr Corresponding COBOL Variable is DTL-MKT-NBR
   *
   * @param value
   */
  public void setDtlMktNbr(char[] value) {
    dtlMktNbr = checkDtlMktNbrConstraints(value);
    serializeDtlMktNbr(dtlMktNbr);
  }

  /**
   * Update DtlMktNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlMktNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlMktNbr, dtlMktNbr.length);
  }

  public void setDtlMktNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktNbr, dtlMktNbr.length);
  }

  /**
   * Update DtlMktNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlMktNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktNbr + targetIndex, targetLen);
  }

  /**
   * Update DtlMktNbr with another Field
   *
   * @param value
   */
  public void setDtlMktNbr(Field source) {
    replace(source, 0, source.length(), beginDtlMktNbr, DTL_MKT_NBR_LEN);
  }

  /**
   * Update DtlMktNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlMktNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktNbr, DTL_MKT_NBR_LEN);
  }

  /**
   * Update DtlMktNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlMktNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMktNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlIpaNbr
   *
   * @return dtlIpaNbr
   */
  public char[] getDtlIpaNbr() throws CFException {
    if (isDtlIpaNbrModified()) {
      dtlIpaNbr = refreshDtlIpaNbr();
    }
    return dtlIpaNbr;
  }

  /**
   * set variable dtlIpaNbr Corresponding COBOL Variable is DTL-IPA-NBR
   *
   * @param value
   */
  public void setDtlIpaNbr(char[] value) {
    dtlIpaNbr = checkDtlIpaNbrConstraints(value);
    serializeDtlIpaNbr(dtlIpaNbr);
  }

  /**
   * Update DtlIpaNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlIpaNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlIpaNbr, dtlIpaNbr.length);
  }

  public void setDtlIpaNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlIpaNbr, dtlIpaNbr.length);
  }

  /**
   * Update DtlIpaNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlIpaNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlIpaNbr + targetIndex, targetLen);
  }

  /**
   * Update DtlIpaNbr with another Field
   *
   * @param value
   */
  public void setDtlIpaNbr(Field source) {
    replace(source, 0, source.length(), beginDtlIpaNbr, DTL_IPA_NBR_LEN);
  }

  /**
   * Update DtlIpaNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlIpaNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlIpaNbr, DTL_IPA_NBR_LEN);
  }

  /**
   * Update DtlIpaNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlIpaNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlIpaNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlGrpTblNbr
   *
   * @return dtlGrpTblNbr
   */
  public char[] getDtlGrpTblNbr() throws CFException {
    if (isDtlGrpTblNbrModified()) {
      dtlGrpTblNbr = refreshDtlGrpTblNbr();
    }
    return dtlGrpTblNbr;
  }

  /**
   * set variable dtlGrpTblNbr Corresponding COBOL Variable is DTL-GRP-TBL-NBR
   *
   * @param value
   */
  public void setDtlGrpTblNbr(char[] value) {
    dtlGrpTblNbr = checkDtlGrpTblNbrConstraints(value);
    serializeDtlGrpTblNbr(dtlGrpTblNbr);
  }

  /**
   * Update DtlGrpTblNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlGrpTblNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlGrpTblNbr, dtlGrpTblNbr.length);
  }

  public void setDtlGrpTblNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlGrpTblNbr, dtlGrpTblNbr.length);
  }

  /**
   * Update DtlGrpTblNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlGrpTblNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlGrpTblNbr + targetIndex, targetLen);
  }

  /**
   * Update DtlGrpTblNbr with another Field
   *
   * @param value
   */
  public void setDtlGrpTblNbr(Field source) {
    replace(source, 0, source.length(), beginDtlGrpTblNbr, DTL_GRP_TBL_NBR_LEN);
  }

  /**
   * Update DtlGrpTblNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlGrpTblNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlGrpTblNbr, DTL_GRP_TBL_NBR_LEN);
  }

  /**
   * Update DtlGrpTblNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlGrpTblNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlGrpTblNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlPsvCd
   *
   * @return dtlPsvCd
   */
  public char[] getDtlPsvCd() throws CFException {
    if (isDtlPsvCdModified()) {
      dtlPsvCd = refreshDtlPsvCd();
    }
    return dtlPsvCd;
  }

  /**
   * set variable dtlPsvCd Corresponding COBOL Variable is DTL-PSV-CD
   *
   * @param value
   */
  public void setDtlPsvCd(char[] value) {
    dtlPsvCd = checkDtlPsvCdConstraints(value);
    serializeDtlPsvCd(dtlPsvCd);
  }

  /**
   * Update DtlPsvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlPsvCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlPsvCd, dtlPsvCd.length);
  }

  public void setDtlPsvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPsvCd, dtlPsvCd.length);
  }

  /**
   * Update DtlPsvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlPsvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPsvCd + targetIndex, targetLen);
  }

  /**
   * Update DtlPsvCd with another Field
   *
   * @param value
   */
  public void setDtlPsvCd(Field source) {
    replace(source, 0, source.length(), beginDtlPsvCd, DTL_PSV_CD_LEN);
  }

  /**
   * Update DtlPsvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlPsvCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPsvCd, DTL_PSV_CD_LEN);
  }

  /**
   * Update DtlPsvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlPsvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPsvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlPrefCd
   *
   * @return dtlPrefCd
   */
  public char[] getDtlPrefCd() throws CFException {
    if (isDtlPrefCdModified()) {
      dtlPrefCd = refreshDtlPrefCd();
    }
    return dtlPrefCd;
  }

  /**
   * set variable dtlPrefCd Corresponding COBOL Variable is DTL-PREF-CD
   *
   * @param value
   */
  public void setDtlPrefCd(char[] value) {
    dtlPrefCd = checkDtlPrefCdConstraints(value);
    serializeDtlPrefCd(dtlPrefCd);
  }

  /**
   * Update DtlPrefCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlPrefCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlPrefCd, dtlPrefCd.length);
  }

  public void setDtlPrefCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrefCd, dtlPrefCd.length);
  }

  /**
   * Update DtlPrefCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlPrefCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrefCd + targetIndex, targetLen);
  }

  /**
   * Update DtlPrefCd with another Field
   *
   * @param value
   */
  public void setDtlPrefCd(Field source) {
    replace(source, 0, source.length(), beginDtlPrefCd, DTL_PREF_CD_LEN);
  }

  /**
   * Update DtlPrefCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlPrefCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrefCd, DTL_PREF_CD_LEN);
  }

  /**
   * Update DtlPrefCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlPrefCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlPrefCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlContrArngNbr
   *
   * @return dtlContrArngNbr
   */
  public char[] getDtlContrArngNbr() throws CFException {
    if (isDtlContrArngNbrModified()) {
      dtlContrArngNbr = refreshDtlContrArngNbr();
    }
    return dtlContrArngNbr;
  }

  /**
   * set variable dtlContrArngNbr Corresponding COBOL Variable is DTL-CONTR-ARNG-NBR
   *
   * @param value
   */
  public void setDtlContrArngNbr(char[] value) {
    dtlContrArngNbr = checkDtlContrArngNbrConstraints(value);
    serializeDtlContrArngNbr(dtlContrArngNbr);
  }

  /**
   * Update DtlContrArngNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlContrArngNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlContrArngNbr, dtlContrArngNbr.length);
  }

  public void setDtlContrArngNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlContrArngNbr, dtlContrArngNbr.length);
  }

  /**
   * Update DtlContrArngNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlContrArngNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlContrArngNbr + targetIndex, targetLen);
  }

  /**
   * Update DtlContrArngNbr with another Field
   *
   * @param value
   */
  public void setDtlContrArngNbr(Field source) {
    replace(source, 0, source.length(), beginDtlContrArngNbr, DTL_CONTR_ARNG_NBR_LEN);
  }

  /**
   * Update DtlContrArngNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlContrArngNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlContrArngNbr, DTL_CONTR_ARNG_NBR_LEN);
  }

  /**
   * Update DtlContrArngNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlContrArngNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlContrArngNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlInclXcldCd
   *
   * @return dtlInclXcldCd
   */
  public char[] getDtlInclXcldCd() throws CFException {
    if (isDtlInclXcldCdModified()) {
      dtlInclXcldCd = refreshDtlInclXcldCd();
    }
    return dtlInclXcldCd;
  }

  /**
   * set variable dtlInclXcldCd Corresponding COBOL Variable is DTL-INCL-XCLD-CD
   *
   * @param value
   */
  public void setDtlInclXcldCd(char[] value) {
    dtlInclXcldCd = checkDtlInclXcldCdConstraints(value);
    serializeDtlInclXcldCd(dtlInclXcldCd);
  }

  /**
   * Update DtlInclXcldCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlInclXcldCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlInclXcldCd, dtlInclXcldCd.length);
  }

  public void setDtlInclXcldCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlInclXcldCd, dtlInclXcldCd.length);
  }

  /**
   * Update DtlInclXcldCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlInclXcldCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlInclXcldCd + targetIndex, targetLen);
  }

  /**
   * Update DtlInclXcldCd with another Field
   *
   * @param value
   */
  public void setDtlInclXcldCd(Field source) {
    replace(source, 0, source.length(), beginDtlInclXcldCd, DTL_INCL_XCLD_CD_LEN);
  }

  /**
   * Update DtlInclXcldCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlInclXcldCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlInclXcldCd, DTL_INCL_XCLD_CD_LEN);
  }

  /**
   * Update DtlInclXcldCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlInclXcldCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlInclXcldCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlMntlHlthNtwkCd
   *
   * @return dtlMntlHlthNtwkCd
   */
  public char[] getDtlMntlHlthNtwkCd() throws CFException {
    if (isDtlMntlHlthNtwkCdModified()) {
      dtlMntlHlthNtwkCd = refreshDtlMntlHlthNtwkCd();
    }
    return dtlMntlHlthNtwkCd;
  }

  /**
   * set variable dtlMntlHlthNtwkCd Corresponding COBOL Variable is DTL-MNTL-HLTH-NTWK-CD
   *
   * @param value
   */
  public void setDtlMntlHlthNtwkCd(char[] value) {
    dtlMntlHlthNtwkCd = checkDtlMntlHlthNtwkCdConstraints(value);
    serializeDtlMntlHlthNtwkCd(dtlMntlHlthNtwkCd);
  }

  /**
   * Update DtlMntlHlthNtwkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlMntlHlthNtwkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlMntlHlthNtwkCd, dtlMntlHlthNtwkCd.length);
  }

  public void setDtlMntlHlthNtwkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMntlHlthNtwkCd, dtlMntlHlthNtwkCd.length);
  }

  /**
   * Update DtlMntlHlthNtwkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlMntlHlthNtwkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMntlHlthNtwkCd + targetIndex, targetLen);
  }

  /**
   * Update DtlMntlHlthNtwkCd with another Field
   *
   * @param value
   */
  public void setDtlMntlHlthNtwkCd(Field source) {
    replace(source, 0, source.length(), beginDtlMntlHlthNtwkCd, DTL_MNTL_HLTH_NTWK_CD_LEN);
  }

  /**
   * Update DtlMntlHlthNtwkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlMntlHlthNtwkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMntlHlthNtwkCd, DTL_MNTL_HLTH_NTWK_CD_LEN);
  }

  /**
   * Update DtlMntlHlthNtwkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlMntlHlthNtwkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlMntlHlthNtwkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlTravBenCd
   *
   * @return dtlTravBenCd
   */
  public char[] getDtlTravBenCd() throws CFException {
    if (isDtlTravBenCdModified()) {
      dtlTravBenCd = refreshDtlTravBenCd();
    }
    return dtlTravBenCd;
  }

  /**
   * set variable dtlTravBenCd Corresponding COBOL Variable is DTL-TRAV-BEN-CD
   *
   * @param value
   */
  public void setDtlTravBenCd(char[] value) {
    dtlTravBenCd = checkDtlTravBenCdConstraints(value);
    serializeDtlTravBenCd(dtlTravBenCd);
  }

  /**
   * Update DtlTravBenCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlTravBenCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlTravBenCd, dtlTravBenCd.length);
  }

  public void setDtlTravBenCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlTravBenCd, dtlTravBenCd.length);
  }

  /**
   * Update DtlTravBenCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlTravBenCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlTravBenCd + targetIndex, targetLen);
  }

  /**
   * Update DtlTravBenCd with another Field
   *
   * @param value
   */
  public void setDtlTravBenCd(Field source) {
    replace(source, 0, source.length(), beginDtlTravBenCd, DTL_TRAV_BEN_CD_LEN);
  }

  /**
   * Update DtlTravBenCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlTravBenCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlTravBenCd, DTL_TRAV_BEN_CD_LEN);
  }

  /**
   * Update DtlTravBenCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlTravBenCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlTravBenCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlRvrsTierInd
   *
   * @return dtlRvrsTierInd
   */
  public char[] getDtlRvrsTierInd() throws CFException {
    if (isDtlRvrsTierIndModified()) {
      dtlRvrsTierInd = refreshDtlRvrsTierInd();
    }
    return dtlRvrsTierInd;
  }

  /**
   * set variable dtlRvrsTierInd Corresponding COBOL Variable is DTL-RVRS-TIER-IND
   *
   * @param value
   */
  public void setDtlRvrsTierInd(char[] value) {
    dtlRvrsTierInd = checkDtlRvrsTierIndConstraints(value);
    serializeDtlRvrsTierInd(dtlRvrsTierInd);
  }

  /**
   * Update DtlRvrsTierInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlRvrsTierInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlRvrsTierInd, dtlRvrsTierInd.length);
  }

  public void setDtlRvrsTierInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRvrsTierInd, dtlRvrsTierInd.length);
  }

  /**
   * Update DtlRvrsTierInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlRvrsTierInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRvrsTierInd + targetIndex, targetLen);
  }

  /**
   * Update DtlRvrsTierInd with another Field
   *
   * @param value
   */
  public void setDtlRvrsTierInd(Field source) {
    replace(source, 0, source.length(), beginDtlRvrsTierInd, DTL_RVRS_TIER_IND_LEN);
  }

  /**
   * Update DtlRvrsTierInd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlRvrsTierInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRvrsTierInd, DTL_RVRS_TIER_IND_LEN);
  }

  /**
   * Update DtlRvrsTierInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlRvrsTierInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlRvrsTierInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlXwlkCrltCd
   *
   * @return dtlXwlkCrltCd
   */
  public char[] getDtlXwlkCrltCd() throws CFException {
    if (isDtlXwlkCrltCdModified()) {
      dtlXwlkCrltCd = refreshDtlXwlkCrltCd();
    }
    return dtlXwlkCrltCd;
  }

  /**
   * set variable dtlXwlkCrltCd Corresponding COBOL Variable is DTL-XWLK-CRLT-CD
   *
   * @param value
   */
  public void setDtlXwlkCrltCd(char[] value) {
    dtlXwlkCrltCd = checkDtlXwlkCrltCdConstraints(value);
    serializeDtlXwlkCrltCd(dtlXwlkCrltCd);
  }

  /**
   * Update DtlXwlkCrltCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlXwlkCrltCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDtlXwlkCrltCd, dtlXwlkCrltCd.length);
  }

  public void setDtlXwlkCrltCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlXwlkCrltCd, dtlXwlkCrltCd.length);
  }

  /**
   * Update DtlXwlkCrltCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlXwlkCrltCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlXwlkCrltCd + targetIndex, targetLen);
  }

  /**
   * Update DtlXwlkCrltCd with another Field
   *
   * @param value
   */
  public void setDtlXwlkCrltCd(Field source) {
    replace(source, 0, source.length(), beginDtlXwlkCrltCd, DTL_XWLK_CRLT_CD_LEN);
  }

  /**
   * Update DtlXwlkCrltCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlXwlkCrltCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDtlXwlkCrltCd, DTL_XWLK_CRLT_CD_LEN);
  }

  /**
   * Update DtlXwlkCrltCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlXwlkCrltCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlXwlkCrltCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dtlDemotedPremDesigInd
   *
   * @return dtlDemotedPremDesigInd
   */
  public char[] getDtlDemotedPremDesigInd() throws CFException {
    if (isDtlDemotedPremDesigIndModified()) {
      dtlDemotedPremDesigInd = refreshDtlDemotedPremDesigInd();
    }
    return dtlDemotedPremDesigInd;
  }

  /**
   * set variable dtlDemotedPremDesigInd Corresponding COBOL Variable is DTL-DEMOTED-PREM-DESIG-IND
   *
   * @param value
   */
  public void setDtlDemotedPremDesigInd(char[] value) {
    dtlDemotedPremDesigInd = checkDtlDemotedPremDesigIndConstraints(value);
    serializeDtlDemotedPremDesigInd(dtlDemotedPremDesigInd);
  }

  /**
   * Update DtlDemotedPremDesigInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDtlDemotedPremDesigInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginDtlDemotedPremDesigInd,
        dtlDemotedPremDesigInd.length);
  }

  public void setDtlDemotedPremDesigInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginDtlDemotedPremDesigInd, dtlDemotedPremDesigInd.length);
  }

  /**
   * Update DtlDemotedPremDesigInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDtlDemotedPremDesigInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlDemotedPremDesigInd + targetIndex, targetLen);
  }

  /**
   * Update DtlDemotedPremDesigInd with another Field
   *
   * @param value
   */
  public void setDtlDemotedPremDesigInd(Field source) {
    replace(
        source, 0, source.length(), beginDtlDemotedPremDesigInd, DTL_DEMOTED_PREM_DESIG_IND_LEN);
  }

  /**
   * Update DtlDemotedPremDesigInd with another Field from an offset and length
   *
   * @param value
   */
  public void setDtlDemotedPremDesigInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginDtlDemotedPremDesigInd,
        DTL_DEMOTED_PREM_DESIG_IND_LEN);
  }

  /**
   * Update DtlDemotedPremDesigInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setDtlDemotedPremDesigInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDtlDemotedPremDesigInd + targetIndex, targetLen);
  }

  /**
   * initializes DclntwkRcprctyDtl String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDtlRcprctyTblId(CONSTANTS.SPACE_6);
    setDtlRcprctySeqNbr((short) 0);
    setDtlPrdctCd(CONSTANTS.SPACE_3);
    setDtlMktTypCd(CONSTANTS.SPACE_2);
    setDtlMktNbr(CONSTANTS.SPACE_7);
    setDtlIpaNbr(CONSTANTS.SPACE_5);
    setDtlGrpTblNbr(CONSTANTS.SPACE_4);
    setDtlPsvCd(CONSTANTS.SPACE);
    setDtlPrefCd(CONSTANTS.SPACE);
    setDtlContrArngNbr(CONSTANTS.SPACE);
    setDtlInclXcldCd(CONSTANTS.SPACE);
    setDtlMntlHlthNtwkCd(CONSTANTS.SPACE);
    setDtlTravBenCd(CONSTANTS.SPACE);
    setDtlRvrsTierInd(CONSTANTS.SPACE);
    setDtlXwlkCrltCd(CONSTANTS.SPACE);
    setDtlDemotedPremDesigInd(CONSTANTS.SPACE);
  }

  public static int getDclntwkRcprctyDtlFieldLength() {
    return DCLNTWK_RCPRCTY_DTL_LENGTH;
  }
}
