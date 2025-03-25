package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol12RetArea12 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class Pol12RetArea12 extends Pol12RetArea12Serialized {

  private char[] pol12StdPolNbr = Field.fillLowValue(6);

  private int pol12StdPlnNbr;

  private char[] pol12RetEvdBasDialgInd = Field.fillLowValue(1);

  private char[] pol12RetNtfyCrdcEpInd = Field.fillLowValue(1);

  private char[] pol12RetOncPolPrtcpCd = Field.fillLowValue(1);

  private char[] pol12RetSiteSrvcPrtcpCd = Field.fillLowValue(1);

  private char[] pol12RetContrStCd = Field.fillLowValue(2);

  private char[] pol12RetFundTypCd = Field.fillLowValue(1);

  private char[] pol12RetSiteCareProcCd = Field.fillLowValue(1);

  private char[] pol12RetGenTstPolPrtcpCd = Field.fillLowValue(1);

  private char[] pol12RetSpclRxInd = Field.fillLowValue(1);

  private char[] pol12RetErisaInd = Field.fillLowValue(1);

  private char[] pol12RetFiller = Field.fillLowValue(19);

  /** Constructor for Pol12RetArea12 */
  public Pol12RetArea12() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol12RetArea12. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol12RetArea12(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol12StdPolNbr
   *
   * @return pol12StdPolNbr
   */
  public char[] getPol12StdPolNbr() throws CFException {
    if (isPol12StdPolNbrModified()) {
      pol12StdPolNbr = refreshPol12StdPolNbr();
    }
    return pol12StdPolNbr;
  }

  /**
   * set variable pol12StdPolNbr Corresponding COBOL Variable is POL12-STD-POL-NBR
   *
   * @param value
   */
  public void setPol12StdPolNbr(char[] value) {
    pol12StdPolNbr = checkPol12StdPolNbrConstraints(value);
    serializePol12StdPolNbr(pol12StdPolNbr);
  }

  /**
   * Update Pol12StdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12StdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol12StdPolNbr, pol12StdPolNbr.length);
  }

  public void setPol12StdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12StdPolNbr, pol12StdPolNbr.length);
  }

  /**
   * Update Pol12StdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12StdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12StdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol12StdPolNbr with another Field
   *
   * @param value
   */
  public void setPol12StdPolNbr(Field source) {
    replace(source, 0, source.length(), beginPol12StdPolNbr, POL_12_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol12StdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12StdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12StdPolNbr, POL_12_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol12StdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12StdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12StdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12StdPlnNbr
   *
   * @return pol12StdPlnNbr
   */
  public int getPol12StdPlnNbr() throws CFException {
    if (isPol12StdPlnNbrModified()) {
      pol12StdPlnNbr = refreshPol12StdPlnNbr();
    }
    return pol12StdPlnNbr;
  }

  /**
   * Update Pol12StdPlnNbr with the passed value Corresponding COBOL Variable is POL12-STD-PLN-NBR
   *
   * @param number
   */
  public void setPol12StdPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol12StdPlnNbr = checkPol12StdPlnNbrMaxLimit(number);
    serializePol12StdPlnNbr(pol12StdPlnNbr);
  }

  public void setPol12StdPlnNbr(long number) {
    number = checkPol12StdPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol12StdPlnNbr((int) number);
  }

  /**
   * Update Pol12StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol12StdPlnNbr(char[] value) throws CFException {
    pol12StdPlnNbr = serializePol12StdPlnNbr(value);
  }
  /**
   * Update Pol12StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol12StdPlnNbrString(char[] value) throws CFException {
    setPol12StdPlnNbr(value);
  }
  /**
   * Returns the value of pol12RetEvdBasDialgInd
   *
   * @return pol12RetEvdBasDialgInd
   */
  public char[] getPol12RetEvdBasDialgInd() throws CFException {
    if (isPol12RetEvdBasDialgIndModified()) {
      pol12RetEvdBasDialgInd = refreshPol12RetEvdBasDialgInd();
    }
    return pol12RetEvdBasDialgInd;
  }

  /**
   * set variable pol12RetEvdBasDialgInd Corresponding COBOL Variable is POL12-RET-EVD-BAS-DIALG-IND
   *
   * @param value
   */
  public void setPol12RetEvdBasDialgInd(char[] value) {
    pol12RetEvdBasDialgInd = checkPol12RetEvdBasDialgIndConstraints(value);
    serializePol12RetEvdBasDialgInd(pol12RetEvdBasDialgInd);
  }

  /**
   * Update Pol12RetEvdBasDialgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetEvdBasDialgInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol12RetEvdBasDialgInd,
        pol12RetEvdBasDialgInd.length);
  }

  public void setPol12RetEvdBasDialgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol12RetEvdBasDialgInd, pol12RetEvdBasDialgInd.length);
  }

  /**
   * Update Pol12RetEvdBasDialgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetEvdBasDialgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetEvdBasDialgInd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetEvdBasDialgInd with another Field
   *
   * @param value
   */
  public void setPol12RetEvdBasDialgInd(Field source) {
    replace(
        source, 0, source.length(), beginPol12RetEvdBasDialgInd, POL_12_RET_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update Pol12RetEvdBasDialgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetEvdBasDialgInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetEvdBasDialgInd,
        POL_12_RET_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update Pol12RetEvdBasDialgInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol12RetEvdBasDialgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetEvdBasDialgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetNtfyCrdcEpInd
   *
   * @return pol12RetNtfyCrdcEpInd
   */
  public char[] getPol12RetNtfyCrdcEpInd() throws CFException {
    if (isPol12RetNtfyCrdcEpIndModified()) {
      pol12RetNtfyCrdcEpInd = refreshPol12RetNtfyCrdcEpInd();
    }
    return pol12RetNtfyCrdcEpInd;
  }

  /**
   * set variable pol12RetNtfyCrdcEpInd Corresponding COBOL Variable is POL12-RET-NTFY-CRDC-EP-IND
   *
   * @param value
   */
  public void setPol12RetNtfyCrdcEpInd(char[] value) {
    pol12RetNtfyCrdcEpInd = checkPol12RetNtfyCrdcEpIndConstraints(value);
    serializePol12RetNtfyCrdcEpInd(pol12RetNtfyCrdcEpInd);
  }

  /**
   * Update Pol12RetNtfyCrdcEpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetNtfyCrdcEpInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol12RetNtfyCrdcEpInd,
        pol12RetNtfyCrdcEpInd.length);
  }

  public void setPol12RetNtfyCrdcEpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol12RetNtfyCrdcEpInd, pol12RetNtfyCrdcEpInd.length);
  }

  /**
   * Update Pol12RetNtfyCrdcEpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetNtfyCrdcEpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetNtfyCrdcEpInd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetNtfyCrdcEpInd with another Field
   *
   * @param value
   */
  public void setPol12RetNtfyCrdcEpInd(Field source) {
    replace(
        source, 0, source.length(), beginPol12RetNtfyCrdcEpInd, POL_12_RET_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update Pol12RetNtfyCrdcEpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetNtfyCrdcEpInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetNtfyCrdcEpInd,
        POL_12_RET_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update Pol12RetNtfyCrdcEpInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol12RetNtfyCrdcEpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetNtfyCrdcEpInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetOncPolPrtcpCd
   *
   * @return pol12RetOncPolPrtcpCd
   */
  public char[] getPol12RetOncPolPrtcpCd() throws CFException {
    if (isPol12RetOncPolPrtcpCdModified()) {
      pol12RetOncPolPrtcpCd = refreshPol12RetOncPolPrtcpCd();
    }
    return pol12RetOncPolPrtcpCd;
  }

  /**
   * set variable pol12RetOncPolPrtcpCd Corresponding COBOL Variable is POL12-RET-ONC-POL-PRTCP-CD
   *
   * @param value
   */
  public void setPol12RetOncPolPrtcpCd(char[] value) {
    pol12RetOncPolPrtcpCd = checkPol12RetOncPolPrtcpCdConstraints(value);
    serializePol12RetOncPolPrtcpCd(pol12RetOncPolPrtcpCd);
  }

  /**
   * Update Pol12RetOncPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetOncPolPrtcpCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol12RetOncPolPrtcpCd,
        pol12RetOncPolPrtcpCd.length);
  }

  public void setPol12RetOncPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol12RetOncPolPrtcpCd, pol12RetOncPolPrtcpCd.length);
  }

  /**
   * Update Pol12RetOncPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetOncPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetOncPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetOncPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setPol12RetOncPolPrtcpCd(Field source) {
    replace(
        source, 0, source.length(), beginPol12RetOncPolPrtcpCd, POL_12_RET_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol12RetOncPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetOncPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetOncPolPrtcpCd,
        POL_12_RET_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol12RetOncPolPrtcpCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol12RetOncPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetOncPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetSiteSrvcPrtcpCd
   *
   * @return pol12RetSiteSrvcPrtcpCd
   */
  public char[] getPol12RetSiteSrvcPrtcpCd() throws CFException {
    if (isPol12RetSiteSrvcPrtcpCdModified()) {
      pol12RetSiteSrvcPrtcpCd = refreshPol12RetSiteSrvcPrtcpCd();
    }
    return pol12RetSiteSrvcPrtcpCd;
  }

  /**
   * set variable pol12RetSiteSrvcPrtcpCd Corresponding COBOL Variable is
   * POL12-RET-SITE-SRVC-PRTCP-CD
   *
   * @param value
   */
  public void setPol12RetSiteSrvcPrtcpCd(char[] value) {
    pol12RetSiteSrvcPrtcpCd = checkPol12RetSiteSrvcPrtcpCdConstraints(value);
    serializePol12RetSiteSrvcPrtcpCd(pol12RetSiteSrvcPrtcpCd);
  }

  /**
   * Update Pol12RetSiteSrvcPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetSiteSrvcPrtcpCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol12RetSiteSrvcPrtcpCd,
        pol12RetSiteSrvcPrtcpCd.length);
  }

  public void setPol12RetSiteSrvcPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetSiteSrvcPrtcpCd,
        pol12RetSiteSrvcPrtcpCd.length);
  }

  /**
   * Update Pol12RetSiteSrvcPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetSiteSrvcPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSiteSrvcPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetSiteSrvcPrtcpCd with another Field
   *
   * @param value
   */
  public void setPol12RetSiteSrvcPrtcpCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol12RetSiteSrvcPrtcpCd,
        POL_12_RET_SITE_SRVC_PRTCP_CD_LEN);
  }

  /**
   * Update Pol12RetSiteSrvcPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetSiteSrvcPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetSiteSrvcPrtcpCd,
        POL_12_RET_SITE_SRVC_PRTCP_CD_LEN);
  }

  /**
   * Update Pol12RetSiteSrvcPrtcpCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol12RetSiteSrvcPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSiteSrvcPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetContrStCd
   *
   * @return pol12RetContrStCd
   */
  public char[] getPol12RetContrStCd() throws CFException {
    if (isPol12RetContrStCdModified()) {
      pol12RetContrStCd = refreshPol12RetContrStCd();
    }
    return pol12RetContrStCd;
  }

  /**
   * set variable pol12RetContrStCd Corresponding COBOL Variable is POL12-RET-CONTR-ST-CD
   *
   * @param value
   */
  public void setPol12RetContrStCd(char[] value) {
    pol12RetContrStCd = checkPol12RetContrStCdConstraints(value);
    serializePol12RetContrStCd(pol12RetContrStCd);
  }

  /**
   * Update Pol12RetContrStCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetContrStCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol12RetContrStCd, pol12RetContrStCd.length);
  }

  public void setPol12RetContrStCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetContrStCd, pol12RetContrStCd.length);
  }

  /**
   * Update Pol12RetContrStCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetContrStCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetContrStCd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetContrStCd with another Field
   *
   * @param value
   */
  public void setPol12RetContrStCd(Field source) {
    replace(source, 0, source.length(), beginPol12RetContrStCd, POL_12_RET_CONTR_ST_CD_LEN);
  }

  /**
   * Update Pol12RetContrStCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetContrStCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetContrStCd, POL_12_RET_CONTR_ST_CD_LEN);
  }

  /**
   * Update Pol12RetContrStCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetContrStCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetContrStCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetFundTypCd
   *
   * @return pol12RetFundTypCd
   */
  public char[] getPol12RetFundTypCd() throws CFException {
    if (isPol12RetFundTypCdModified()) {
      pol12RetFundTypCd = refreshPol12RetFundTypCd();
    }
    return pol12RetFundTypCd;
  }

  /**
   * set variable pol12RetFundTypCd Corresponding COBOL Variable is POL12-RET-FUND-TYP-CD
   *
   * @param value
   */
  public void setPol12RetFundTypCd(char[] value) {
    pol12RetFundTypCd = checkPol12RetFundTypCdConstraints(value);
    serializePol12RetFundTypCd(pol12RetFundTypCd);
  }

  /**
   * Update Pol12RetFundTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetFundTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol12RetFundTypCd, pol12RetFundTypCd.length);
  }

  public void setPol12RetFundTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFundTypCd, pol12RetFundTypCd.length);
  }

  /**
   * Update Pol12RetFundTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetFundTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFundTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetFundTypCd with another Field
   *
   * @param value
   */
  public void setPol12RetFundTypCd(Field source) {
    replace(source, 0, source.length(), beginPol12RetFundTypCd, POL_12_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol12RetFundTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetFundTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFundTypCd, POL_12_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol12RetFundTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetFundTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFundTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetSiteCareProcCd
   *
   * @return pol12RetSiteCareProcCd
   */
  public char[] getPol12RetSiteCareProcCd() throws CFException {
    if (isPol12RetSiteCareProcCdModified()) {
      pol12RetSiteCareProcCd = refreshPol12RetSiteCareProcCd();
    }
    return pol12RetSiteCareProcCd;
  }

  /**
   * set variable pol12RetSiteCareProcCd Corresponding COBOL Variable is POL12-RET-SITE-CARE-PROC-CD
   *
   * @param value
   */
  public void setPol12RetSiteCareProcCd(char[] value) {
    pol12RetSiteCareProcCd = checkPol12RetSiteCareProcCdConstraints(value);
    serializePol12RetSiteCareProcCd(pol12RetSiteCareProcCd);
  }

  /**
   * Update Pol12RetSiteCareProcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetSiteCareProcCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol12RetSiteCareProcCd,
        pol12RetSiteCareProcCd.length);
  }

  public void setPol12RetSiteCareProcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol12RetSiteCareProcCd, pol12RetSiteCareProcCd.length);
  }

  /**
   * Update Pol12RetSiteCareProcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetSiteCareProcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSiteCareProcCd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetSiteCareProcCd with another Field
   *
   * @param value
   */
  public void setPol12RetSiteCareProcCd(Field source) {
    replace(
        source, 0, source.length(), beginPol12RetSiteCareProcCd, POL_12_RET_SITE_CARE_PROC_CD_LEN);
  }

  /**
   * Update Pol12RetSiteCareProcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetSiteCareProcCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetSiteCareProcCd,
        POL_12_RET_SITE_CARE_PROC_CD_LEN);
  }

  /**
   * Update Pol12RetSiteCareProcCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol12RetSiteCareProcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSiteCareProcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetGenTstPolPrtcpCd
   *
   * @return pol12RetGenTstPolPrtcpCd
   */
  public char[] getPol12RetGenTstPolPrtcpCd() throws CFException {
    if (isPol12RetGenTstPolPrtcpCdModified()) {
      pol12RetGenTstPolPrtcpCd = refreshPol12RetGenTstPolPrtcpCd();
    }
    return pol12RetGenTstPolPrtcpCd;
  }

  /**
   * set variable pol12RetGenTstPolPrtcpCd Corresponding COBOL Variable is
   * POL12-RET-GEN-TST-POL-PRTCP-CD
   *
   * @param value
   */
  public void setPol12RetGenTstPolPrtcpCd(char[] value) {
    pol12RetGenTstPolPrtcpCd = checkPol12RetGenTstPolPrtcpCdConstraints(value);
    serializePol12RetGenTstPolPrtcpCd(pol12RetGenTstPolPrtcpCd);
  }

  /**
   * Update Pol12RetGenTstPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetGenTstPolPrtcpCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol12RetGenTstPolPrtcpCd,
        pol12RetGenTstPolPrtcpCd.length);
  }

  public void setPol12RetGenTstPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetGenTstPolPrtcpCd,
        pol12RetGenTstPolPrtcpCd.length);
  }

  /**
   * Update Pol12RetGenTstPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetGenTstPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetGenTstPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetGenTstPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setPol12RetGenTstPolPrtcpCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol12RetGenTstPolPrtcpCd,
        POL_12_RET_GEN_TST_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol12RetGenTstPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetGenTstPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol12RetGenTstPolPrtcpCd,
        POL_12_RET_GEN_TST_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol12RetGenTstPolPrtcpCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol12RetGenTstPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetGenTstPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetSpclRxInd
   *
   * @return pol12RetSpclRxInd
   */
  public char[] getPol12RetSpclRxInd() throws CFException {
    if (isPol12RetSpclRxIndModified()) {
      pol12RetSpclRxInd = refreshPol12RetSpclRxInd();
    }
    return pol12RetSpclRxInd;
  }

  /**
   * set variable pol12RetSpclRxInd Corresponding COBOL Variable is POL12-RET-SPCL-RX-IND
   *
   * @param value
   */
  public void setPol12RetSpclRxInd(char[] value) {
    pol12RetSpclRxInd = checkPol12RetSpclRxIndConstraints(value);
    serializePol12RetSpclRxInd(pol12RetSpclRxInd);
  }

  /**
   * Update Pol12RetSpclRxInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetSpclRxInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol12RetSpclRxInd, pol12RetSpclRxInd.length);
  }

  public void setPol12RetSpclRxInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSpclRxInd, pol12RetSpclRxInd.length);
  }

  /**
   * Update Pol12RetSpclRxInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetSpclRxInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSpclRxInd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetSpclRxInd with another Field
   *
   * @param value
   */
  public void setPol12RetSpclRxInd(Field source) {
    replace(source, 0, source.length(), beginPol12RetSpclRxInd, POL_12_RET_SPCL_RX_IND_LEN);
  }

  /**
   * Update Pol12RetSpclRxInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetSpclRxInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSpclRxInd, POL_12_RET_SPCL_RX_IND_LEN);
  }

  /**
   * Update Pol12RetSpclRxInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetSpclRxInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetSpclRxInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetErisaInd
   *
   * @return pol12RetErisaInd
   */
  public char[] getPol12RetErisaInd() throws CFException {
    if (isPol12RetErisaIndModified()) {
      pol12RetErisaInd = refreshPol12RetErisaInd();
    }
    return pol12RetErisaInd;
  }

  /**
   * set variable pol12RetErisaInd Corresponding COBOL Variable is POL12-RET-ERISA-IND
   *
   * @param value
   */
  public void setPol12RetErisaInd(char[] value) {
    pol12RetErisaInd = checkPol12RetErisaIndConstraints(value);
    serializePol12RetErisaInd(pol12RetErisaInd);
  }

  /**
   * Update Pol12RetErisaInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetErisaInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol12RetErisaInd, pol12RetErisaInd.length);
  }

  public void setPol12RetErisaInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetErisaInd, pol12RetErisaInd.length);
  }

  /**
   * Update Pol12RetErisaInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetErisaInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetErisaInd + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetErisaInd with another Field
   *
   * @param value
   */
  public void setPol12RetErisaInd(Field source) {
    replace(source, 0, source.length(), beginPol12RetErisaInd, POL_12_RET_ERISA_IND_LEN);
  }

  /**
   * Update Pol12RetErisaInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetErisaInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetErisaInd, POL_12_RET_ERISA_IND_LEN);
  }

  /**
   * Update Pol12RetErisaInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetErisaInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetErisaInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol12RetFiller
   *
   * @return pol12RetFiller
   */
  public char[] getPol12RetFiller() throws CFException {
    if (isPol12RetFillerModified()) {
      pol12RetFiller = refreshPol12RetFiller();
    }
    return pol12RetFiller;
  }

  /**
   * set variable pol12RetFiller Corresponding COBOL Variable is POL12-RET-FILLER
   *
   * @param value
   */
  public void setPol12RetFiller(char[] value) {
    pol12RetFiller = checkPol12RetFillerConstraints(value);
    serializePol12RetFiller(pol12RetFiller);
  }

  /**
   * Update Pol12RetFiller with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol12RetFiller(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol12RetFiller, pol12RetFiller.length);
  }

  public void setPol12RetFiller(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFiller, pol12RetFiller.length);
  }

  /**
   * Update Pol12RetFiller with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetFiller(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFiller + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetFiller with another Field
   *
   * @param value
   */
  public void setPol12RetFiller(Field source) {
    replace(source, 0, source.length(), beginPol12RetFiller, POL_12_RET_FILLER_LEN);
  }

  /**
   * Update Pol12RetFiller with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetFiller(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFiller, POL_12_RET_FILLER_LEN);
  }

  /**
   * Update Pol12RetFiller with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetFiller(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol12RetFiller + targetIndex, targetLen);
  }

  /**
   * initializes Pol12RetArea12 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol12StdPolNbr(CONSTANTS.SPACE_6);
    setPol12StdPlnNbr(0);
    setPol12RetEvdBasDialgInd(CONSTANTS.SPACE);
    setPol12RetNtfyCrdcEpInd(CONSTANTS.SPACE);
    setPol12RetOncPolPrtcpCd(CONSTANTS.SPACE);
    setPol12RetSiteSrvcPrtcpCd(CONSTANTS.SPACE);
    setPol12RetContrStCd(CONSTANTS.SPACE_2);
    setPol12RetFundTypCd(CONSTANTS.SPACE);
    setPol12RetSiteCareProcCd(CONSTANTS.SPACE);
    setPol12RetGenTstPolPrtcpCd(CONSTANTS.SPACE);
    setPol12RetSpclRxInd(CONSTANTS.SPACE);
    setPol12RetErisaInd(CONSTANTS.SPACE);
    setPol12RetFiller(CONSTANTS.SPACE_19);
  }

  public static int getPol12RetArea12FieldLength() {
    return POL_12_RET_AREA_12_LENGTH;
  }
}
