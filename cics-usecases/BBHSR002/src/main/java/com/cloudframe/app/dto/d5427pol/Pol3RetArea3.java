package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol3RetArea3 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class Pol3RetArea3 extends Pol3RetArea3Serialized {

  private char[] pol3StdPolNbr = Field.fillLowValue(6);

  private int pol3StdPlnNbr;

  private char[] pol3RetNewOldSrvcInd = Field.fillLowValue(1);

  private char[] pol3RetSviTblPriNbr = Field.fillLowValue(6);

  private char[] pol3RetSlotTblId = Field.fillLowValue(6);

  private char[] pol3RetObligId = Field.fillLowValue(2);

  private char[] pol3RetShrArngCd = Field.fillLowValue(2);

  private char[] pol3RetFundTypCd = Field.fillLowValue(1);

  private char[] pol3RetPrdctKeyCd = Field.fillLowValue(3);

  private char[] pol3RetMbrPrdctTypCd = Field.fillLowValue(3);

  private char[] pol3RetSviTblTerNbr = Field.fillLowValue(6);

  private char[] pol3NtfyCrdcEpInd = Field.fillLowValue(1);

  private char[] pol3OncPolPrtcpCd = Field.fillLowValue(1);

  private char[] pol3EvdBasDialgInd = Field.fillLowValue(1);

  private char[] pol3CoreMedPrrAuthCd = Field.fillLowValue(1);

  private char[] pol3RelSrvcInd = Field.fillLowValue(1);

  private char[] pol3GenPolPrtcpCd = Field.fillLowValue(1);

  private char[] pol3SecOpinVendCd = Field.fillLowValue(1);

  private char[] pol3RetBhvHlthVendCd = Field.fillLowValue(1);

  private char[] pol3RetSlot001 = Field.fillLowValue(6);

  private char[] pol3RetEff001 = Field.fillLowValue(10);

  private char[] pol3RetCanc001 = Field.fillLowValue(10);

  private char[] pol3RetSlot002 = Field.fillLowValue(6);

  private char[] pol3RetEff002 = Field.fillLowValue(10);

  private char[] pol3RetCanc002 = Field.fillLowValue(10);

  private char[] pol3RetSlot003 = Field.fillLowValue(6);

  private char[] pol3RetEff003 = Field.fillLowValue(10);

  private char[] pol3RetCanc003 = Field.fillLowValue(10);

  private char[] pol3RetSlot004 = Field.fillLowValue(6);

  private char[] pol3RetEff004 = Field.fillLowValue(10);

  private char[] pol3RetCanc004 = Field.fillLowValue(10);

  private char[] pol3RetSlot005 = Field.fillLowValue(6);

  private char[] pol3RetEff005 = Field.fillLowValue(10);

  private char[] pol3RetCanc005 = Field.fillLowValue(10);

  private char[] pol3RetSlot006 = Field.fillLowValue(6);

  private char[] pol3RetEff006 = Field.fillLowValue(10);

  private char[] pol3RetCanc006 = Field.fillLowValue(10);

  private char[] pol3RetSlot007 = Field.fillLowValue(6);

  private char[] pol3RetEff007 = Field.fillLowValue(10);

  private char[] pol3RetCanc007 = Field.fillLowValue(10);

  private char[] pol3RetSlot008 = Field.fillLowValue(6);

  private char[] pol3RetEff008 = Field.fillLowValue(10);

  private char[] pol3RetCanc008 = Field.fillLowValue(10);

  private char[] pol3RetSlot009 = Field.fillLowValue(6);

  private char[] pol3RetEff009 = Field.fillLowValue(10);

  private char[] pol3RetCanc009 = Field.fillLowValue(10);

  private char[] pol3RetSlot010 = Field.fillLowValue(6);

  private char[] pol3RetEff010 = Field.fillLowValue(10);

  private char[] pol3RetCanc010 = Field.fillLowValue(10);

  private char[] pol3RetSlot011 = Field.fillLowValue(6);

  private char[] pol3RetEff011 = Field.fillLowValue(10);

  private char[] pol3RetCanc011 = Field.fillLowValue(10);

  private char[] pol3RetSlot012 = Field.fillLowValue(6);

  private char[] pol3RetEff012 = Field.fillLowValue(10);

  private char[] pol3RetCanc012 = Field.fillLowValue(10);

  private char[] pol3RetSlot013 = Field.fillLowValue(6);

  private char[] pol3RetEff013 = Field.fillLowValue(10);

  private char[] pol3RetCanc013 = Field.fillLowValue(10);

  private char[] pol3RetSlot014 = Field.fillLowValue(6);

  private char[] pol3RetEff014 = Field.fillLowValue(10);

  private char[] pol3RetCanc014 = Field.fillLowValue(10);

  private char[] pol3RetSlot018 = Field.fillLowValue(6);

  private char[] pol3RetSlot019 = Field.fillLowValue(6);

  private char[] pol3RetSlot020 = Field.fillLowValue(6);

  /** Constructor for Pol3RetArea3 */
  public Pol3RetArea3() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol3RetArea3. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol3RetArea3(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol3StdPolNbr
   *
   * @return pol3StdPolNbr
   */
  public char[] getPol3StdPolNbr() throws CFException {
    if (isPol3StdPolNbrModified()) {
      pol3StdPolNbr = refreshPol3StdPolNbr();
    }
    return pol3StdPolNbr;
  }

  /**
   * set variable pol3StdPolNbr Corresponding COBOL Variable is POL3-STD-POL-NBR
   *
   * @param value
   */
  public void setPol3StdPolNbr(char[] value) {
    pol3StdPolNbr = checkPol3StdPolNbrConstraints(value);
    serializePol3StdPolNbr(pol3StdPolNbr);
  }

  /**
   * Update Pol3StdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3StdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3StdPolNbr, pol3StdPolNbr.length);
  }

  public void setPol3StdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3StdPolNbr, pol3StdPolNbr.length);
  }

  /**
   * Update Pol3StdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3StdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3StdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol3StdPolNbr with another Field
   *
   * @param value
   */
  public void setPol3StdPolNbr(Field source) {
    replace(source, 0, source.length(), beginPol3StdPolNbr, POL_3_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol3StdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3StdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3StdPolNbr, POL_3_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol3StdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3StdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3StdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3StdPlnNbr
   *
   * @return pol3StdPlnNbr
   */
  public int getPol3StdPlnNbr() throws CFException {
    if (isPol3StdPlnNbrModified()) {
      pol3StdPlnNbr = refreshPol3StdPlnNbr();
    }
    return pol3StdPlnNbr;
  }

  /**
   * Update Pol3StdPlnNbr with the passed value Corresponding COBOL Variable is POL3-STD-PLN-NBR
   *
   * @param number
   */
  public void setPol3StdPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol3StdPlnNbr = checkPol3StdPlnNbrMaxLimit(number);
    serializePol3StdPlnNbr(pol3StdPlnNbr);
  }

  public void setPol3StdPlnNbr(long number) {
    number = checkPol3StdPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol3StdPlnNbr((int) number);
  }

  /**
   * Update Pol3StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol3StdPlnNbr(char[] value) throws CFException {
    pol3StdPlnNbr = serializePol3StdPlnNbr(value);
  }
  /**
   * Update Pol3StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol3StdPlnNbrString(char[] value) throws CFException {
    setPol3StdPlnNbr(value);
  }
  /**
   * Returns the value of pol3RetNewOldSrvcInd
   *
   * @return pol3RetNewOldSrvcInd
   */
  public char[] getPol3RetNewOldSrvcInd() throws CFException {
    if (isPol3RetNewOldSrvcIndModified()) {
      pol3RetNewOldSrvcInd = refreshPol3RetNewOldSrvcInd();
    }
    return pol3RetNewOldSrvcInd;
  }

  /**
   * set variable pol3RetNewOldSrvcInd Corresponding COBOL Variable is POL3-RET-NEW-OLD-SRVC-IND
   *
   * @param value
   */
  public void setPol3RetNewOldSrvcInd(char[] value) {
    pol3RetNewOldSrvcInd = checkPol3RetNewOldSrvcIndConstraints(value);
    serializePol3RetNewOldSrvcInd(pol3RetNewOldSrvcInd);
  }

  /**
   * Update Pol3RetNewOldSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetNewOldSrvcInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol3RetNewOldSrvcInd, pol3RetNewOldSrvcInd.length);
  }

  public void setPol3RetNewOldSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetNewOldSrvcInd, pol3RetNewOldSrvcInd.length);
  }

  /**
   * Update Pol3RetNewOldSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetNewOldSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetNewOldSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetNewOldSrvcInd with another Field
   *
   * @param value
   */
  public void setPol3RetNewOldSrvcInd(Field source) {
    replace(source, 0, source.length(), beginPol3RetNewOldSrvcInd, POL_3_RET_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update Pol3RetNewOldSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetNewOldSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol3RetNewOldSrvcInd, POL_3_RET_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update Pol3RetNewOldSrvcInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol3RetNewOldSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetNewOldSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSviTblPriNbr
   *
   * @return pol3RetSviTblPriNbr
   */
  public char[] getPol3RetSviTblPriNbr() throws CFException {
    if (isPol3RetSviTblPriNbrModified()) {
      pol3RetSviTblPriNbr = refreshPol3RetSviTblPriNbr();
    }
    return pol3RetSviTblPriNbr;
  }

  /**
   * set variable pol3RetSviTblPriNbr Corresponding COBOL Variable is POL3-RET-SVI-TBL-PRI-NBR
   *
   * @param value
   */
  public void setPol3RetSviTblPriNbr(char[] value) {
    pol3RetSviTblPriNbr = checkPol3RetSviTblPriNbrConstraints(value);
    serializePol3RetSviTblPriNbr(pol3RetSviTblPriNbr);
  }

  /**
   * Update Pol3RetSviTblPriNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblPriNbr(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol3RetSviTblPriNbr, pol3RetSviTblPriNbr.length);
  }

  public void setPol3RetSviTblPriNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSviTblPriNbr, pol3RetSviTblPriNbr.length);
  }

  /**
   * Update Pol3RetSviTblPriNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblPriNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSviTblPriNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSviTblPriNbr with another Field
   *
   * @param value
   */
  public void setPol3RetSviTblPriNbr(Field source) {
    replace(source, 0, source.length(), beginPol3RetSviTblPriNbr, POL_3_RET_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update Pol3RetSviTblPriNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblPriNbr(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol3RetSviTblPriNbr, POL_3_RET_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update Pol3RetSviTblPriNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblPriNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSviTblPriNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlotTblId
   *
   * @return pol3RetSlotTblId
   */
  public char[] getPol3RetSlotTblId() throws CFException {
    if (isPol3RetSlotTblIdModified()) {
      pol3RetSlotTblId = refreshPol3RetSlotTblId();
    }
    return pol3RetSlotTblId;
  }

  /**
   * set variable pol3RetSlotTblId Corresponding COBOL Variable is POL3-RET-SLOT-TBL-ID
   *
   * @param value
   */
  public void setPol3RetSlotTblId(char[] value) {
    pol3RetSlotTblId = checkPol3RetSlotTblIdConstraints(value);
    serializePol3RetSlotTblId(pol3RetSlotTblId);
  }

  /**
   * Update Pol3RetSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlotTblId, pol3RetSlotTblId.length);
  }

  public void setPol3RetSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlotTblId, pol3RetSlotTblId.length);
  }

  /**
   * Update Pol3RetSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlotTblId with another Field
   *
   * @param value
   */
  public void setPol3RetSlotTblId(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlotTblId, POL_3_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update Pol3RetSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlotTblId, POL_3_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update Pol3RetSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetObligId
   *
   * @return pol3RetObligId
   */
  public char[] getPol3RetObligId() throws CFException {
    if (isPol3RetObligIdModified()) {
      pol3RetObligId = refreshPol3RetObligId();
    }
    return pol3RetObligId;
  }

  /**
   * set variable pol3RetObligId Corresponding COBOL Variable is POL3-RET-OBLIG-ID
   *
   * @param value
   */
  public void setPol3RetObligId(char[] value) {
    pol3RetObligId = checkPol3RetObligIdConstraints(value);
    serializePol3RetObligId(pol3RetObligId);
  }

  /**
   * Update Pol3RetObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetObligId, pol3RetObligId.length);
  }

  public void setPol3RetObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetObligId, pol3RetObligId.length);
  }

  /**
   * Update Pol3RetObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetObligId + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetObligId with another Field
   *
   * @param value
   */
  public void setPol3RetObligId(Field source) {
    replace(source, 0, source.length(), beginPol3RetObligId, POL_3_RET_OBLIG_ID_LEN);
  }

  /**
   * Update Pol3RetObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetObligId, POL_3_RET_OBLIG_ID_LEN);
  }

  /**
   * Update Pol3RetObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetShrArngCd
   *
   * @return pol3RetShrArngCd
   */
  public char[] getPol3RetShrArngCd() throws CFException {
    if (isPol3RetShrArngCdModified()) {
      pol3RetShrArngCd = refreshPol3RetShrArngCd();
    }
    return pol3RetShrArngCd;
  }

  /**
   * set variable pol3RetShrArngCd Corresponding COBOL Variable is POL3-RET-SHR-ARNG-CD
   *
   * @param value
   */
  public void setPol3RetShrArngCd(char[] value) {
    pol3RetShrArngCd = checkPol3RetShrArngCdConstraints(value);
    serializePol3RetShrArngCd(pol3RetShrArngCd);
  }

  /**
   * Update Pol3RetShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetShrArngCd, pol3RetShrArngCd.length);
  }

  public void setPol3RetShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetShrArngCd, pol3RetShrArngCd.length);
  }

  /**
   * Update Pol3RetShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetShrArngCd with another Field
   *
   * @param value
   */
  public void setPol3RetShrArngCd(Field source) {
    replace(source, 0, source.length(), beginPol3RetShrArngCd, POL_3_RET_SHR_ARNG_CD_LEN);
  }

  /**
   * Update Pol3RetShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetShrArngCd, POL_3_RET_SHR_ARNG_CD_LEN);
  }

  /**
   * Update Pol3RetShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetFundTypCd
   *
   * @return pol3RetFundTypCd
   */
  public char[] getPol3RetFundTypCd() throws CFException {
    if (isPol3RetFundTypCdModified()) {
      pol3RetFundTypCd = refreshPol3RetFundTypCd();
    }
    return pol3RetFundTypCd;
  }

  /**
   * set variable pol3RetFundTypCd Corresponding COBOL Variable is POL3-RET-FUND-TYP-CD
   *
   * @param value
   */
  public void setPol3RetFundTypCd(char[] value) {
    pol3RetFundTypCd = checkPol3RetFundTypCdConstraints(value);
    serializePol3RetFundTypCd(pol3RetFundTypCd);
  }

  /**
   * Update Pol3RetFundTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetFundTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetFundTypCd, pol3RetFundTypCd.length);
  }

  public void setPol3RetFundTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetFundTypCd, pol3RetFundTypCd.length);
  }

  /**
   * Update Pol3RetFundTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetFundTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetFundTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetFundTypCd with another Field
   *
   * @param value
   */
  public void setPol3RetFundTypCd(Field source) {
    replace(source, 0, source.length(), beginPol3RetFundTypCd, POL_3_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol3RetFundTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetFundTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetFundTypCd, POL_3_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol3RetFundTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetFundTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetFundTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetPrdctKeyCd
   *
   * @return pol3RetPrdctKeyCd
   */
  public char[] getPol3RetPrdctKeyCd() throws CFException {
    if (isPol3RetPrdctKeyCdModified()) {
      pol3RetPrdctKeyCd = refreshPol3RetPrdctKeyCd();
    }
    return pol3RetPrdctKeyCd;
  }

  /**
   * set variable pol3RetPrdctKeyCd Corresponding COBOL Variable is POL3-RET-PRDCT-KEY-CD
   *
   * @param value
   */
  public void setPol3RetPrdctKeyCd(char[] value) {
    pol3RetPrdctKeyCd = checkPol3RetPrdctKeyCdConstraints(value);
    serializePol3RetPrdctKeyCd(pol3RetPrdctKeyCd);
  }

  /**
   * Update Pol3RetPrdctKeyCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetPrdctKeyCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetPrdctKeyCd, pol3RetPrdctKeyCd.length);
  }

  public void setPol3RetPrdctKeyCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetPrdctKeyCd, pol3RetPrdctKeyCd.length);
  }

  /**
   * Update Pol3RetPrdctKeyCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetPrdctKeyCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetPrdctKeyCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetPrdctKeyCd with another Field
   *
   * @param value
   */
  public void setPol3RetPrdctKeyCd(Field source) {
    replace(source, 0, source.length(), beginPol3RetPrdctKeyCd, POL_3_RET_PRDCT_KEY_CD_LEN);
  }

  /**
   * Update Pol3RetPrdctKeyCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetPrdctKeyCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetPrdctKeyCd, POL_3_RET_PRDCT_KEY_CD_LEN);
  }

  /**
   * Update Pol3RetPrdctKeyCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetPrdctKeyCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetPrdctKeyCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetMbrPrdctTypCd
   *
   * @return pol3RetMbrPrdctTypCd
   */
  public char[] getPol3RetMbrPrdctTypCd() throws CFException {
    if (isPol3RetMbrPrdctTypCdModified()) {
      pol3RetMbrPrdctTypCd = refreshPol3RetMbrPrdctTypCd();
    }
    return pol3RetMbrPrdctTypCd;
  }

  /**
   * set variable pol3RetMbrPrdctTypCd Corresponding COBOL Variable is POL3-RET-MBR-PRDCT-TYP-CD
   *
   * @param value
   */
  public void setPol3RetMbrPrdctTypCd(char[] value) {
    pol3RetMbrPrdctTypCd = checkPol3RetMbrPrdctTypCdConstraints(value);
    serializePol3RetMbrPrdctTypCd(pol3RetMbrPrdctTypCd);
  }

  /**
   * Update Pol3RetMbrPrdctTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetMbrPrdctTypCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol3RetMbrPrdctTypCd, pol3RetMbrPrdctTypCd.length);
  }

  public void setPol3RetMbrPrdctTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetMbrPrdctTypCd, pol3RetMbrPrdctTypCd.length);
  }

  /**
   * Update Pol3RetMbrPrdctTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetMbrPrdctTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetMbrPrdctTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetMbrPrdctTypCd with another Field
   *
   * @param value
   */
  public void setPol3RetMbrPrdctTypCd(Field source) {
    replace(source, 0, source.length(), beginPol3RetMbrPrdctTypCd, POL_3_RET_MBR_PRDCT_TYP_CD_LEN);
  }

  /**
   * Update Pol3RetMbrPrdctTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetMbrPrdctTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol3RetMbrPrdctTypCd, POL_3_RET_MBR_PRDCT_TYP_CD_LEN);
  }

  /**
   * Update Pol3RetMbrPrdctTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol3RetMbrPrdctTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetMbrPrdctTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSviTblTerNbr
   *
   * @return pol3RetSviTblTerNbr
   */
  public char[] getPol3RetSviTblTerNbr() throws CFException {
    if (isPol3RetSviTblTerNbrModified()) {
      pol3RetSviTblTerNbr = refreshPol3RetSviTblTerNbr();
    }
    return pol3RetSviTblTerNbr;
  }

  /**
   * set variable pol3RetSviTblTerNbr Corresponding COBOL Variable is POL3-RET-SVI-TBL-TER-NBR
   *
   * @param value
   */
  public void setPol3RetSviTblTerNbr(char[] value) {
    pol3RetSviTblTerNbr = checkPol3RetSviTblTerNbrConstraints(value);
    serializePol3RetSviTblTerNbr(pol3RetSviTblTerNbr);
  }

  /**
   * Update Pol3RetSviTblTerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblTerNbr(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol3RetSviTblTerNbr, pol3RetSviTblTerNbr.length);
  }

  public void setPol3RetSviTblTerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSviTblTerNbr, pol3RetSviTblTerNbr.length);
  }

  /**
   * Update Pol3RetSviTblTerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblTerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSviTblTerNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSviTblTerNbr with another Field
   *
   * @param value
   */
  public void setPol3RetSviTblTerNbr(Field source) {
    replace(source, 0, source.length(), beginPol3RetSviTblTerNbr, POL_3_RET_SVI_TBL_TER_NBR_LEN);
  }

  /**
   * Update Pol3RetSviTblTerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblTerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol3RetSviTblTerNbr, POL_3_RET_SVI_TBL_TER_NBR_LEN);
  }

  /**
   * Update Pol3RetSviTblTerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSviTblTerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSviTblTerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3NtfyCrdcEpInd
   *
   * @return pol3NtfyCrdcEpInd
   */
  public char[] getPol3NtfyCrdcEpInd() throws CFException {
    if (isPol3NtfyCrdcEpIndModified()) {
      pol3NtfyCrdcEpInd = refreshPol3NtfyCrdcEpInd();
    }
    return pol3NtfyCrdcEpInd;
  }

  /**
   * set variable pol3NtfyCrdcEpInd Corresponding COBOL Variable is POL3-NTFY-CRDC-EP-IND
   *
   * @param value
   */
  public void setPol3NtfyCrdcEpInd(char[] value) {
    pol3NtfyCrdcEpInd = checkPol3NtfyCrdcEpIndConstraints(value);
    serializePol3NtfyCrdcEpInd(pol3NtfyCrdcEpInd);
  }

  /**
   * Update Pol3NtfyCrdcEpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3NtfyCrdcEpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3NtfyCrdcEpInd, pol3NtfyCrdcEpInd.length);
  }

  public void setPol3NtfyCrdcEpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3NtfyCrdcEpInd, pol3NtfyCrdcEpInd.length);
  }

  /**
   * Update Pol3NtfyCrdcEpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3NtfyCrdcEpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3NtfyCrdcEpInd + targetIndex, targetLen);
  }

  /**
   * Update Pol3NtfyCrdcEpInd with another Field
   *
   * @param value
   */
  public void setPol3NtfyCrdcEpInd(Field source) {
    replace(source, 0, source.length(), beginPol3NtfyCrdcEpInd, POL_3_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update Pol3NtfyCrdcEpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3NtfyCrdcEpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3NtfyCrdcEpInd, POL_3_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update Pol3NtfyCrdcEpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3NtfyCrdcEpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3NtfyCrdcEpInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3OncPolPrtcpCd
   *
   * @return pol3OncPolPrtcpCd
   */
  public char[] getPol3OncPolPrtcpCd() throws CFException {
    if (isPol3OncPolPrtcpCdModified()) {
      pol3OncPolPrtcpCd = refreshPol3OncPolPrtcpCd();
    }
    return pol3OncPolPrtcpCd;
  }

  /**
   * set variable pol3OncPolPrtcpCd Corresponding COBOL Variable is POL3-ONC-POL-PRTCP-CD
   *
   * @param value
   */
  public void setPol3OncPolPrtcpCd(char[] value) {
    pol3OncPolPrtcpCd = checkPol3OncPolPrtcpCdConstraints(value);
    serializePol3OncPolPrtcpCd(pol3OncPolPrtcpCd);
  }

  /**
   * Update Pol3OncPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3OncPolPrtcpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3OncPolPrtcpCd, pol3OncPolPrtcpCd.length);
  }

  public void setPol3OncPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3OncPolPrtcpCd, pol3OncPolPrtcpCd.length);
  }

  /**
   * Update Pol3OncPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3OncPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3OncPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3OncPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setPol3OncPolPrtcpCd(Field source) {
    replace(source, 0, source.length(), beginPol3OncPolPrtcpCd, POL_3_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol3OncPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3OncPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3OncPolPrtcpCd, POL_3_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol3OncPolPrtcpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3OncPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3OncPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3EvdBasDialgInd
   *
   * @return pol3EvdBasDialgInd
   */
  public char[] getPol3EvdBasDialgInd() throws CFException {
    if (isPol3EvdBasDialgIndModified()) {
      pol3EvdBasDialgInd = refreshPol3EvdBasDialgInd();
    }
    return pol3EvdBasDialgInd;
  }

  /**
   * set variable pol3EvdBasDialgInd Corresponding COBOL Variable is POL3-EVD-BAS-DIALG-IND
   *
   * @param value
   */
  public void setPol3EvdBasDialgInd(char[] value) {
    pol3EvdBasDialgInd = checkPol3EvdBasDialgIndConstraints(value);
    serializePol3EvdBasDialgInd(pol3EvdBasDialgInd);
  }

  /**
   * Update Pol3EvdBasDialgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3EvdBasDialgInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3EvdBasDialgInd, pol3EvdBasDialgInd.length);
  }

  public void setPol3EvdBasDialgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3EvdBasDialgInd, pol3EvdBasDialgInd.length);
  }

  /**
   * Update Pol3EvdBasDialgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3EvdBasDialgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3EvdBasDialgInd + targetIndex, targetLen);
  }

  /**
   * Update Pol3EvdBasDialgInd with another Field
   *
   * @param value
   */
  public void setPol3EvdBasDialgInd(Field source) {
    replace(source, 0, source.length(), beginPol3EvdBasDialgInd, POL_3_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update Pol3EvdBasDialgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3EvdBasDialgInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3EvdBasDialgInd, POL_3_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update Pol3EvdBasDialgInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3EvdBasDialgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3EvdBasDialgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3CoreMedPrrAuthCd
   *
   * @return pol3CoreMedPrrAuthCd
   */
  public char[] getPol3CoreMedPrrAuthCd() throws CFException {
    if (isPol3CoreMedPrrAuthCdModified()) {
      pol3CoreMedPrrAuthCd = refreshPol3CoreMedPrrAuthCd();
    }
    return pol3CoreMedPrrAuthCd;
  }

  /**
   * set variable pol3CoreMedPrrAuthCd Corresponding COBOL Variable is POL3-CORE-MED-PRR-AUTH-CD
   *
   * @param value
   */
  public void setPol3CoreMedPrrAuthCd(char[] value) {
    pol3CoreMedPrrAuthCd = checkPol3CoreMedPrrAuthCdConstraints(value);
    serializePol3CoreMedPrrAuthCd(pol3CoreMedPrrAuthCd);
  }

  /**
   * Update Pol3CoreMedPrrAuthCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3CoreMedPrrAuthCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol3CoreMedPrrAuthCd, pol3CoreMedPrrAuthCd.length);
  }

  public void setPol3CoreMedPrrAuthCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3CoreMedPrrAuthCd, pol3CoreMedPrrAuthCd.length);
  }

  /**
   * Update Pol3CoreMedPrrAuthCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3CoreMedPrrAuthCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3CoreMedPrrAuthCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3CoreMedPrrAuthCd with another Field
   *
   * @param value
   */
  public void setPol3CoreMedPrrAuthCd(Field source) {
    replace(source, 0, source.length(), beginPol3CoreMedPrrAuthCd, POL_3_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update Pol3CoreMedPrrAuthCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3CoreMedPrrAuthCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol3CoreMedPrrAuthCd, POL_3_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update Pol3CoreMedPrrAuthCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol3CoreMedPrrAuthCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3CoreMedPrrAuthCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RelSrvcInd
   *
   * @return pol3RelSrvcInd
   */
  public char[] getPol3RelSrvcInd() throws CFException {
    if (isPol3RelSrvcIndModified()) {
      pol3RelSrvcInd = refreshPol3RelSrvcInd();
    }
    return pol3RelSrvcInd;
  }

  /**
   * set variable pol3RelSrvcInd Corresponding COBOL Variable is POL3-REL-SRVC-IND
   *
   * @param value
   */
  public void setPol3RelSrvcInd(char[] value) {
    pol3RelSrvcInd = checkPol3RelSrvcIndConstraints(value);
    serializePol3RelSrvcInd(pol3RelSrvcInd);
  }

  /**
   * Update Pol3RelSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RelSrvcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RelSrvcInd, pol3RelSrvcInd.length);
  }

  public void setPol3RelSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RelSrvcInd, pol3RelSrvcInd.length);
  }

  /**
   * Update Pol3RelSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RelSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RelSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update Pol3RelSrvcInd with another Field
   *
   * @param value
   */
  public void setPol3RelSrvcInd(Field source) {
    replace(source, 0, source.length(), beginPol3RelSrvcInd, POL_3_REL_SRVC_IND_LEN);
  }

  /**
   * Update Pol3RelSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RelSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RelSrvcInd, POL_3_REL_SRVC_IND_LEN);
  }

  /**
   * Update Pol3RelSrvcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RelSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RelSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3GenPolPrtcpCd
   *
   * @return pol3GenPolPrtcpCd
   */
  public char[] getPol3GenPolPrtcpCd() throws CFException {
    if (isPol3GenPolPrtcpCdModified()) {
      pol3GenPolPrtcpCd = refreshPol3GenPolPrtcpCd();
    }
    return pol3GenPolPrtcpCd;
  }

  /**
   * set variable pol3GenPolPrtcpCd Corresponding COBOL Variable is POL3-GEN-POL-PRTCP-CD
   *
   * @param value
   */
  public void setPol3GenPolPrtcpCd(char[] value) {
    pol3GenPolPrtcpCd = checkPol3GenPolPrtcpCdConstraints(value);
    serializePol3GenPolPrtcpCd(pol3GenPolPrtcpCd);
  }

  /**
   * Update Pol3GenPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3GenPolPrtcpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3GenPolPrtcpCd, pol3GenPolPrtcpCd.length);
  }

  public void setPol3GenPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3GenPolPrtcpCd, pol3GenPolPrtcpCd.length);
  }

  /**
   * Update Pol3GenPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3GenPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3GenPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3GenPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setPol3GenPolPrtcpCd(Field source) {
    replace(source, 0, source.length(), beginPol3GenPolPrtcpCd, POL_3_GEN_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol3GenPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3GenPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3GenPolPrtcpCd, POL_3_GEN_POL_PRTCP_CD_LEN);
  }

  /**
   * Update Pol3GenPolPrtcpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3GenPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3GenPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3SecOpinVendCd
   *
   * @return pol3SecOpinVendCd
   */
  public char[] getPol3SecOpinVendCd() throws CFException {
    if (isPol3SecOpinVendCdModified()) {
      pol3SecOpinVendCd = refreshPol3SecOpinVendCd();
    }
    return pol3SecOpinVendCd;
  }

  /**
   * set variable pol3SecOpinVendCd Corresponding COBOL Variable is POL3-SEC-OPIN-VEND-CD
   *
   * @param value
   */
  public void setPol3SecOpinVendCd(char[] value) {
    pol3SecOpinVendCd = checkPol3SecOpinVendCdConstraints(value);
    serializePol3SecOpinVendCd(pol3SecOpinVendCd);
  }

  /**
   * Update Pol3SecOpinVendCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3SecOpinVendCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3SecOpinVendCd, pol3SecOpinVendCd.length);
  }

  public void setPol3SecOpinVendCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3SecOpinVendCd, pol3SecOpinVendCd.length);
  }

  /**
   * Update Pol3SecOpinVendCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3SecOpinVendCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3SecOpinVendCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3SecOpinVendCd with another Field
   *
   * @param value
   */
  public void setPol3SecOpinVendCd(Field source) {
    replace(source, 0, source.length(), beginPol3SecOpinVendCd, POL_3_SEC_OPIN_VEND_CD_LEN);
  }

  /**
   * Update Pol3SecOpinVendCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3SecOpinVendCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3SecOpinVendCd, POL_3_SEC_OPIN_VEND_CD_LEN);
  }

  /**
   * Update Pol3SecOpinVendCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3SecOpinVendCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3SecOpinVendCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetBhvHlthVendCd
   *
   * @return pol3RetBhvHlthVendCd
   */
  public char[] getPol3RetBhvHlthVendCd() throws CFException {
    if (isPol3RetBhvHlthVendCdModified()) {
      pol3RetBhvHlthVendCd = refreshPol3RetBhvHlthVendCd();
    }
    return pol3RetBhvHlthVendCd;
  }

  /**
   * set variable pol3RetBhvHlthVendCd Corresponding COBOL Variable is POL3-RET-BHV-HLTH-VEND-CD
   *
   * @param value
   */
  public void setPol3RetBhvHlthVendCd(char[] value) {
    pol3RetBhvHlthVendCd = checkPol3RetBhvHlthVendCdConstraints(value);
    serializePol3RetBhvHlthVendCd(pol3RetBhvHlthVendCd);
  }

  /**
   * Update Pol3RetBhvHlthVendCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetBhvHlthVendCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol3RetBhvHlthVendCd, pol3RetBhvHlthVendCd.length);
  }

  public void setPol3RetBhvHlthVendCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetBhvHlthVendCd, pol3RetBhvHlthVendCd.length);
  }

  /**
   * Update Pol3RetBhvHlthVendCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetBhvHlthVendCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetBhvHlthVendCd + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetBhvHlthVendCd with another Field
   *
   * @param value
   */
  public void setPol3RetBhvHlthVendCd(Field source) {
    replace(source, 0, source.length(), beginPol3RetBhvHlthVendCd, POL_3_RET_BHV_HLTH_VEND_CD_LEN);
  }

  /**
   * Update Pol3RetBhvHlthVendCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetBhvHlthVendCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol3RetBhvHlthVendCd, POL_3_RET_BHV_HLTH_VEND_CD_LEN);
  }

  /**
   * Update Pol3RetBhvHlthVendCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol3RetBhvHlthVendCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetBhvHlthVendCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot001
   *
   * @return pol3RetSlot001
   */
  public char[] getPol3RetSlot001() throws CFException {
    if (isPol3RetSlot001Modified()) {
      pol3RetSlot001 = refreshPol3RetSlot001();
    }
    return pol3RetSlot001;
  }

  /**
   * set variable pol3RetSlot001 Corresponding COBOL Variable is POL3-RET-SLOT-001
   *
   * @param value
   */
  public void setPol3RetSlot001(char[] value) {
    pol3RetSlot001 = checkPol3RetSlot001Constraints(value);
    serializePol3RetSlot001(pol3RetSlot001);
  }

  /**
   * Update Pol3RetSlot001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot001, pol3RetSlot001.length);
  }

  public void setPol3RetSlot001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot001, pol3RetSlot001.length);
  }

  /**
   * Update Pol3RetSlot001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot001 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot001 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot001(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot001, POL_3_RET_SLOT_001_LEN);
  }

  /**
   * Update Pol3RetSlot001 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot001, POL_3_RET_SLOT_001_LEN);
  }

  /**
   * Update Pol3RetSlot001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff001
   *
   * @return pol3RetEff001
   */
  public char[] getPol3RetEff001() throws CFException {
    if (isPol3RetEff001Modified()) {
      pol3RetEff001 = refreshPol3RetEff001();
    }
    return pol3RetEff001;
  }

  /**
   * set variable pol3RetEff001 Corresponding COBOL Variable is POL3-RET-EFF-001
   *
   * @param value
   */
  public void setPol3RetEff001(char[] value) {
    pol3RetEff001 = checkPol3RetEff001Constraints(value);
    serializePol3RetEff001(pol3RetEff001);
  }

  /**
   * Update Pol3RetEff001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff001, pol3RetEff001.length);
  }

  public void setPol3RetEff001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff001, pol3RetEff001.length);
  }

  /**
   * Update Pol3RetEff001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff001 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff001 with another Field
   *
   * @param value
   */
  public void setPol3RetEff001(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff001, POL_3_RET_EFF_001_LEN);
  }

  /**
   * Update Pol3RetEff001 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff001, POL_3_RET_EFF_001_LEN);
  }

  /**
   * Update Pol3RetEff001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc001
   *
   * @return pol3RetCanc001
   */
  public char[] getPol3RetCanc001() throws CFException {
    if (isPol3RetCanc001Modified()) {
      pol3RetCanc001 = refreshPol3RetCanc001();
    }
    return pol3RetCanc001;
  }

  /**
   * set variable pol3RetCanc001 Corresponding COBOL Variable is POL3-RET-CANC-001
   *
   * @param value
   */
  public void setPol3RetCanc001(char[] value) {
    pol3RetCanc001 = checkPol3RetCanc001Constraints(value);
    serializePol3RetCanc001(pol3RetCanc001);
  }

  /**
   * Update Pol3RetCanc001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc001, pol3RetCanc001.length);
  }

  public void setPol3RetCanc001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc001, pol3RetCanc001.length);
  }

  /**
   * Update Pol3RetCanc001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc001 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc001 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc001(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc001, POL_3_RET_CANC_001_LEN);
  }

  /**
   * Update Pol3RetCanc001 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc001, POL_3_RET_CANC_001_LEN);
  }

  /**
   * Update Pol3RetCanc001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot002
   *
   * @return pol3RetSlot002
   */
  public char[] getPol3RetSlot002() throws CFException {
    if (isPol3RetSlot002Modified()) {
      pol3RetSlot002 = refreshPol3RetSlot002();
    }
    return pol3RetSlot002;
  }

  /**
   * set variable pol3RetSlot002 Corresponding COBOL Variable is POL3-RET-SLOT-002
   *
   * @param value
   */
  public void setPol3RetSlot002(char[] value) {
    pol3RetSlot002 = checkPol3RetSlot002Constraints(value);
    serializePol3RetSlot002(pol3RetSlot002);
  }

  /**
   * Update Pol3RetSlot002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot002, pol3RetSlot002.length);
  }

  public void setPol3RetSlot002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot002, pol3RetSlot002.length);
  }

  /**
   * Update Pol3RetSlot002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot002 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot002 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot002(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot002, POL_3_RET_SLOT_002_LEN);
  }

  /**
   * Update Pol3RetSlot002 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot002, POL_3_RET_SLOT_002_LEN);
  }

  /**
   * Update Pol3RetSlot002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff002
   *
   * @return pol3RetEff002
   */
  public char[] getPol3RetEff002() throws CFException {
    if (isPol3RetEff002Modified()) {
      pol3RetEff002 = refreshPol3RetEff002();
    }
    return pol3RetEff002;
  }

  /**
   * set variable pol3RetEff002 Corresponding COBOL Variable is POL3-RET-EFF-002
   *
   * @param value
   */
  public void setPol3RetEff002(char[] value) {
    pol3RetEff002 = checkPol3RetEff002Constraints(value);
    serializePol3RetEff002(pol3RetEff002);
  }

  /**
   * Update Pol3RetEff002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff002, pol3RetEff002.length);
  }

  public void setPol3RetEff002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff002, pol3RetEff002.length);
  }

  /**
   * Update Pol3RetEff002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff002 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff002 with another Field
   *
   * @param value
   */
  public void setPol3RetEff002(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff002, POL_3_RET_EFF_002_LEN);
  }

  /**
   * Update Pol3RetEff002 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff002, POL_3_RET_EFF_002_LEN);
  }

  /**
   * Update Pol3RetEff002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc002
   *
   * @return pol3RetCanc002
   */
  public char[] getPol3RetCanc002() throws CFException {
    if (isPol3RetCanc002Modified()) {
      pol3RetCanc002 = refreshPol3RetCanc002();
    }
    return pol3RetCanc002;
  }

  /**
   * set variable pol3RetCanc002 Corresponding COBOL Variable is POL3-RET-CANC-002
   *
   * @param value
   */
  public void setPol3RetCanc002(char[] value) {
    pol3RetCanc002 = checkPol3RetCanc002Constraints(value);
    serializePol3RetCanc002(pol3RetCanc002);
  }

  /**
   * Update Pol3RetCanc002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc002, pol3RetCanc002.length);
  }

  public void setPol3RetCanc002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc002, pol3RetCanc002.length);
  }

  /**
   * Update Pol3RetCanc002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc002 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc002 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc002(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc002, POL_3_RET_CANC_002_LEN);
  }

  /**
   * Update Pol3RetCanc002 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc002, POL_3_RET_CANC_002_LEN);
  }

  /**
   * Update Pol3RetCanc002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot003
   *
   * @return pol3RetSlot003
   */
  public char[] getPol3RetSlot003() throws CFException {
    if (isPol3RetSlot003Modified()) {
      pol3RetSlot003 = refreshPol3RetSlot003();
    }
    return pol3RetSlot003;
  }

  /**
   * set variable pol3RetSlot003 Corresponding COBOL Variable is POL3-RET-SLOT-003
   *
   * @param value
   */
  public void setPol3RetSlot003(char[] value) {
    pol3RetSlot003 = checkPol3RetSlot003Constraints(value);
    serializePol3RetSlot003(pol3RetSlot003);
  }

  /**
   * Update Pol3RetSlot003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot003, pol3RetSlot003.length);
  }

  public void setPol3RetSlot003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot003, pol3RetSlot003.length);
  }

  /**
   * Update Pol3RetSlot003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot003 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot003 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot003(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot003, POL_3_RET_SLOT_003_LEN);
  }

  /**
   * Update Pol3RetSlot003 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot003, POL_3_RET_SLOT_003_LEN);
  }

  /**
   * Update Pol3RetSlot003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff003
   *
   * @return pol3RetEff003
   */
  public char[] getPol3RetEff003() throws CFException {
    if (isPol3RetEff003Modified()) {
      pol3RetEff003 = refreshPol3RetEff003();
    }
    return pol3RetEff003;
  }

  /**
   * set variable pol3RetEff003 Corresponding COBOL Variable is POL3-RET-EFF-003
   *
   * @param value
   */
  public void setPol3RetEff003(char[] value) {
    pol3RetEff003 = checkPol3RetEff003Constraints(value);
    serializePol3RetEff003(pol3RetEff003);
  }

  /**
   * Update Pol3RetEff003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff003, pol3RetEff003.length);
  }

  public void setPol3RetEff003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff003, pol3RetEff003.length);
  }

  /**
   * Update Pol3RetEff003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff003 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff003 with another Field
   *
   * @param value
   */
  public void setPol3RetEff003(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff003, POL_3_RET_EFF_003_LEN);
  }

  /**
   * Update Pol3RetEff003 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff003, POL_3_RET_EFF_003_LEN);
  }

  /**
   * Update Pol3RetEff003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc003
   *
   * @return pol3RetCanc003
   */
  public char[] getPol3RetCanc003() throws CFException {
    if (isPol3RetCanc003Modified()) {
      pol3RetCanc003 = refreshPol3RetCanc003();
    }
    return pol3RetCanc003;
  }

  /**
   * set variable pol3RetCanc003 Corresponding COBOL Variable is POL3-RET-CANC-003
   *
   * @param value
   */
  public void setPol3RetCanc003(char[] value) {
    pol3RetCanc003 = checkPol3RetCanc003Constraints(value);
    serializePol3RetCanc003(pol3RetCanc003);
  }

  /**
   * Update Pol3RetCanc003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc003, pol3RetCanc003.length);
  }

  public void setPol3RetCanc003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc003, pol3RetCanc003.length);
  }

  /**
   * Update Pol3RetCanc003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc003 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc003 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc003(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc003, POL_3_RET_CANC_003_LEN);
  }

  /**
   * Update Pol3RetCanc003 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc003, POL_3_RET_CANC_003_LEN);
  }

  /**
   * Update Pol3RetCanc003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot004
   *
   * @return pol3RetSlot004
   */
  public char[] getPol3RetSlot004() throws CFException {
    if (isPol3RetSlot004Modified()) {
      pol3RetSlot004 = refreshPol3RetSlot004();
    }
    return pol3RetSlot004;
  }

  /**
   * set variable pol3RetSlot004 Corresponding COBOL Variable is POL3-RET-SLOT-004
   *
   * @param value
   */
  public void setPol3RetSlot004(char[] value) {
    pol3RetSlot004 = checkPol3RetSlot004Constraints(value);
    serializePol3RetSlot004(pol3RetSlot004);
  }

  /**
   * Update Pol3RetSlot004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot004, pol3RetSlot004.length);
  }

  public void setPol3RetSlot004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot004, pol3RetSlot004.length);
  }

  /**
   * Update Pol3RetSlot004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot004 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot004 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot004(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot004, POL_3_RET_SLOT_004_LEN);
  }

  /**
   * Update Pol3RetSlot004 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot004, POL_3_RET_SLOT_004_LEN);
  }

  /**
   * Update Pol3RetSlot004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff004
   *
   * @return pol3RetEff004
   */
  public char[] getPol3RetEff004() throws CFException {
    if (isPol3RetEff004Modified()) {
      pol3RetEff004 = refreshPol3RetEff004();
    }
    return pol3RetEff004;
  }

  /**
   * set variable pol3RetEff004 Corresponding COBOL Variable is POL3-RET-EFF-004
   *
   * @param value
   */
  public void setPol3RetEff004(char[] value) {
    pol3RetEff004 = checkPol3RetEff004Constraints(value);
    serializePol3RetEff004(pol3RetEff004);
  }

  /**
   * Update Pol3RetEff004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff004, pol3RetEff004.length);
  }

  public void setPol3RetEff004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff004, pol3RetEff004.length);
  }

  /**
   * Update Pol3RetEff004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff004 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff004 with another Field
   *
   * @param value
   */
  public void setPol3RetEff004(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff004, POL_3_RET_EFF_004_LEN);
  }

  /**
   * Update Pol3RetEff004 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff004, POL_3_RET_EFF_004_LEN);
  }

  /**
   * Update Pol3RetEff004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc004
   *
   * @return pol3RetCanc004
   */
  public char[] getPol3RetCanc004() throws CFException {
    if (isPol3RetCanc004Modified()) {
      pol3RetCanc004 = refreshPol3RetCanc004();
    }
    return pol3RetCanc004;
  }

  /**
   * set variable pol3RetCanc004 Corresponding COBOL Variable is POL3-RET-CANC-004
   *
   * @param value
   */
  public void setPol3RetCanc004(char[] value) {
    pol3RetCanc004 = checkPol3RetCanc004Constraints(value);
    serializePol3RetCanc004(pol3RetCanc004);
  }

  /**
   * Update Pol3RetCanc004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc004, pol3RetCanc004.length);
  }

  public void setPol3RetCanc004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc004, pol3RetCanc004.length);
  }

  /**
   * Update Pol3RetCanc004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc004 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc004 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc004(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc004, POL_3_RET_CANC_004_LEN);
  }

  /**
   * Update Pol3RetCanc004 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc004, POL_3_RET_CANC_004_LEN);
  }

  /**
   * Update Pol3RetCanc004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot005
   *
   * @return pol3RetSlot005
   */
  public char[] getPol3RetSlot005() throws CFException {
    if (isPol3RetSlot005Modified()) {
      pol3RetSlot005 = refreshPol3RetSlot005();
    }
    return pol3RetSlot005;
  }

  /**
   * set variable pol3RetSlot005 Corresponding COBOL Variable is POL3-RET-SLOT-005
   *
   * @param value
   */
  public void setPol3RetSlot005(char[] value) {
    pol3RetSlot005 = checkPol3RetSlot005Constraints(value);
    serializePol3RetSlot005(pol3RetSlot005);
  }

  /**
   * Update Pol3RetSlot005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot005, pol3RetSlot005.length);
  }

  public void setPol3RetSlot005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot005, pol3RetSlot005.length);
  }

  /**
   * Update Pol3RetSlot005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot005 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot005 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot005(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot005, POL_3_RET_SLOT_005_LEN);
  }

  /**
   * Update Pol3RetSlot005 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot005, POL_3_RET_SLOT_005_LEN);
  }

  /**
   * Update Pol3RetSlot005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff005
   *
   * @return pol3RetEff005
   */
  public char[] getPol3RetEff005() throws CFException {
    if (isPol3RetEff005Modified()) {
      pol3RetEff005 = refreshPol3RetEff005();
    }
    return pol3RetEff005;
  }

  /**
   * set variable pol3RetEff005 Corresponding COBOL Variable is POL3-RET-EFF-005
   *
   * @param value
   */
  public void setPol3RetEff005(char[] value) {
    pol3RetEff005 = checkPol3RetEff005Constraints(value);
    serializePol3RetEff005(pol3RetEff005);
  }

  /**
   * Update Pol3RetEff005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff005, pol3RetEff005.length);
  }

  public void setPol3RetEff005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff005, pol3RetEff005.length);
  }

  /**
   * Update Pol3RetEff005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff005 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff005 with another Field
   *
   * @param value
   */
  public void setPol3RetEff005(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff005, POL_3_RET_EFF_005_LEN);
  }

  /**
   * Update Pol3RetEff005 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff005, POL_3_RET_EFF_005_LEN);
  }

  /**
   * Update Pol3RetEff005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc005
   *
   * @return pol3RetCanc005
   */
  public char[] getPol3RetCanc005() throws CFException {
    if (isPol3RetCanc005Modified()) {
      pol3RetCanc005 = refreshPol3RetCanc005();
    }
    return pol3RetCanc005;
  }

  /**
   * set variable pol3RetCanc005 Corresponding COBOL Variable is POL3-RET-CANC-005
   *
   * @param value
   */
  public void setPol3RetCanc005(char[] value) {
    pol3RetCanc005 = checkPol3RetCanc005Constraints(value);
    serializePol3RetCanc005(pol3RetCanc005);
  }

  /**
   * Update Pol3RetCanc005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc005, pol3RetCanc005.length);
  }

  public void setPol3RetCanc005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc005, pol3RetCanc005.length);
  }

  /**
   * Update Pol3RetCanc005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc005 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc005 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc005(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc005, POL_3_RET_CANC_005_LEN);
  }

  /**
   * Update Pol3RetCanc005 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc005, POL_3_RET_CANC_005_LEN);
  }

  /**
   * Update Pol3RetCanc005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot006
   *
   * @return pol3RetSlot006
   */
  public char[] getPol3RetSlot006() throws CFException {
    if (isPol3RetSlot006Modified()) {
      pol3RetSlot006 = refreshPol3RetSlot006();
    }
    return pol3RetSlot006;
  }

  /**
   * set variable pol3RetSlot006 Corresponding COBOL Variable is POL3-RET-SLOT-006
   *
   * @param value
   */
  public void setPol3RetSlot006(char[] value) {
    pol3RetSlot006 = checkPol3RetSlot006Constraints(value);
    serializePol3RetSlot006(pol3RetSlot006);
  }

  /**
   * Update Pol3RetSlot006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot006, pol3RetSlot006.length);
  }

  public void setPol3RetSlot006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot006, pol3RetSlot006.length);
  }

  /**
   * Update Pol3RetSlot006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot006 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot006 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot006(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot006, POL_3_RET_SLOT_006_LEN);
  }

  /**
   * Update Pol3RetSlot006 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot006, POL_3_RET_SLOT_006_LEN);
  }

  /**
   * Update Pol3RetSlot006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff006
   *
   * @return pol3RetEff006
   */
  public char[] getPol3RetEff006() throws CFException {
    if (isPol3RetEff006Modified()) {
      pol3RetEff006 = refreshPol3RetEff006();
    }
    return pol3RetEff006;
  }

  /**
   * set variable pol3RetEff006 Corresponding COBOL Variable is POL3-RET-EFF-006
   *
   * @param value
   */
  public void setPol3RetEff006(char[] value) {
    pol3RetEff006 = checkPol3RetEff006Constraints(value);
    serializePol3RetEff006(pol3RetEff006);
  }

  /**
   * Update Pol3RetEff006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff006, pol3RetEff006.length);
  }

  public void setPol3RetEff006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff006, pol3RetEff006.length);
  }

  /**
   * Update Pol3RetEff006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff006 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff006 with another Field
   *
   * @param value
   */
  public void setPol3RetEff006(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff006, POL_3_RET_EFF_006_LEN);
  }

  /**
   * Update Pol3RetEff006 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff006, POL_3_RET_EFF_006_LEN);
  }

  /**
   * Update Pol3RetEff006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc006
   *
   * @return pol3RetCanc006
   */
  public char[] getPol3RetCanc006() throws CFException {
    if (isPol3RetCanc006Modified()) {
      pol3RetCanc006 = refreshPol3RetCanc006();
    }
    return pol3RetCanc006;
  }

  /**
   * set variable pol3RetCanc006 Corresponding COBOL Variable is POL3-RET-CANC-006
   *
   * @param value
   */
  public void setPol3RetCanc006(char[] value) {
    pol3RetCanc006 = checkPol3RetCanc006Constraints(value);
    serializePol3RetCanc006(pol3RetCanc006);
  }

  /**
   * Update Pol3RetCanc006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc006, pol3RetCanc006.length);
  }

  public void setPol3RetCanc006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc006, pol3RetCanc006.length);
  }

  /**
   * Update Pol3RetCanc006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc006 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc006 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc006(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc006, POL_3_RET_CANC_006_LEN);
  }

  /**
   * Update Pol3RetCanc006 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc006, POL_3_RET_CANC_006_LEN);
  }

  /**
   * Update Pol3RetCanc006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot007
   *
   * @return pol3RetSlot007
   */
  public char[] getPol3RetSlot007() throws CFException {
    if (isPol3RetSlot007Modified()) {
      pol3RetSlot007 = refreshPol3RetSlot007();
    }
    return pol3RetSlot007;
  }

  /**
   * set variable pol3RetSlot007 Corresponding COBOL Variable is POL3-RET-SLOT-007
   *
   * @param value
   */
  public void setPol3RetSlot007(char[] value) {
    pol3RetSlot007 = checkPol3RetSlot007Constraints(value);
    serializePol3RetSlot007(pol3RetSlot007);
  }

  /**
   * Update Pol3RetSlot007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot007, pol3RetSlot007.length);
  }

  public void setPol3RetSlot007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot007, pol3RetSlot007.length);
  }

  /**
   * Update Pol3RetSlot007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot007 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot007 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot007(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot007, POL_3_RET_SLOT_007_LEN);
  }

  /**
   * Update Pol3RetSlot007 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot007, POL_3_RET_SLOT_007_LEN);
  }

  /**
   * Update Pol3RetSlot007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff007
   *
   * @return pol3RetEff007
   */
  public char[] getPol3RetEff007() throws CFException {
    if (isPol3RetEff007Modified()) {
      pol3RetEff007 = refreshPol3RetEff007();
    }
    return pol3RetEff007;
  }

  /**
   * set variable pol3RetEff007 Corresponding COBOL Variable is POL3-RET-EFF-007
   *
   * @param value
   */
  public void setPol3RetEff007(char[] value) {
    pol3RetEff007 = checkPol3RetEff007Constraints(value);
    serializePol3RetEff007(pol3RetEff007);
  }

  /**
   * Update Pol3RetEff007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff007, pol3RetEff007.length);
  }

  public void setPol3RetEff007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff007, pol3RetEff007.length);
  }

  /**
   * Update Pol3RetEff007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff007 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff007 with another Field
   *
   * @param value
   */
  public void setPol3RetEff007(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff007, POL_3_RET_EFF_007_LEN);
  }

  /**
   * Update Pol3RetEff007 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff007, POL_3_RET_EFF_007_LEN);
  }

  /**
   * Update Pol3RetEff007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc007
   *
   * @return pol3RetCanc007
   */
  public char[] getPol3RetCanc007() throws CFException {
    if (isPol3RetCanc007Modified()) {
      pol3RetCanc007 = refreshPol3RetCanc007();
    }
    return pol3RetCanc007;
  }

  /**
   * set variable pol3RetCanc007 Corresponding COBOL Variable is POL3-RET-CANC-007
   *
   * @param value
   */
  public void setPol3RetCanc007(char[] value) {
    pol3RetCanc007 = checkPol3RetCanc007Constraints(value);
    serializePol3RetCanc007(pol3RetCanc007);
  }

  /**
   * Update Pol3RetCanc007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc007, pol3RetCanc007.length);
  }

  public void setPol3RetCanc007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc007, pol3RetCanc007.length);
  }

  /**
   * Update Pol3RetCanc007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc007 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc007 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc007(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc007, POL_3_RET_CANC_007_LEN);
  }

  /**
   * Update Pol3RetCanc007 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc007, POL_3_RET_CANC_007_LEN);
  }

  /**
   * Update Pol3RetCanc007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot008
   *
   * @return pol3RetSlot008
   */
  public char[] getPol3RetSlot008() throws CFException {
    if (isPol3RetSlot008Modified()) {
      pol3RetSlot008 = refreshPol3RetSlot008();
    }
    return pol3RetSlot008;
  }

  /**
   * set variable pol3RetSlot008 Corresponding COBOL Variable is POL3-RET-SLOT-008
   *
   * @param value
   */
  public void setPol3RetSlot008(char[] value) {
    pol3RetSlot008 = checkPol3RetSlot008Constraints(value);
    serializePol3RetSlot008(pol3RetSlot008);
  }

  /**
   * Update Pol3RetSlot008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot008, pol3RetSlot008.length);
  }

  public void setPol3RetSlot008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot008, pol3RetSlot008.length);
  }

  /**
   * Update Pol3RetSlot008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot008 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot008 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot008(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot008, POL_3_RET_SLOT_008_LEN);
  }

  /**
   * Update Pol3RetSlot008 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot008, POL_3_RET_SLOT_008_LEN);
  }

  /**
   * Update Pol3RetSlot008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff008
   *
   * @return pol3RetEff008
   */
  public char[] getPol3RetEff008() throws CFException {
    if (isPol3RetEff008Modified()) {
      pol3RetEff008 = refreshPol3RetEff008();
    }
    return pol3RetEff008;
  }

  /**
   * set variable pol3RetEff008 Corresponding COBOL Variable is POL3-RET-EFF-008
   *
   * @param value
   */
  public void setPol3RetEff008(char[] value) {
    pol3RetEff008 = checkPol3RetEff008Constraints(value);
    serializePol3RetEff008(pol3RetEff008);
  }

  /**
   * Update Pol3RetEff008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff008, pol3RetEff008.length);
  }

  public void setPol3RetEff008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff008, pol3RetEff008.length);
  }

  /**
   * Update Pol3RetEff008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff008 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff008 with another Field
   *
   * @param value
   */
  public void setPol3RetEff008(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff008, POL_3_RET_EFF_008_LEN);
  }

  /**
   * Update Pol3RetEff008 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff008, POL_3_RET_EFF_008_LEN);
  }

  /**
   * Update Pol3RetEff008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc008
   *
   * @return pol3RetCanc008
   */
  public char[] getPol3RetCanc008() throws CFException {
    if (isPol3RetCanc008Modified()) {
      pol3RetCanc008 = refreshPol3RetCanc008();
    }
    return pol3RetCanc008;
  }

  /**
   * set variable pol3RetCanc008 Corresponding COBOL Variable is POL3-RET-CANC-008
   *
   * @param value
   */
  public void setPol3RetCanc008(char[] value) {
    pol3RetCanc008 = checkPol3RetCanc008Constraints(value);
    serializePol3RetCanc008(pol3RetCanc008);
  }

  /**
   * Update Pol3RetCanc008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc008, pol3RetCanc008.length);
  }

  public void setPol3RetCanc008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc008, pol3RetCanc008.length);
  }

  /**
   * Update Pol3RetCanc008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc008 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc008 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc008(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc008, POL_3_RET_CANC_008_LEN);
  }

  /**
   * Update Pol3RetCanc008 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc008, POL_3_RET_CANC_008_LEN);
  }

  /**
   * Update Pol3RetCanc008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot009
   *
   * @return pol3RetSlot009
   */
  public char[] getPol3RetSlot009() throws CFException {
    if (isPol3RetSlot009Modified()) {
      pol3RetSlot009 = refreshPol3RetSlot009();
    }
    return pol3RetSlot009;
  }

  /**
   * set variable pol3RetSlot009 Corresponding COBOL Variable is POL3-RET-SLOT-009
   *
   * @param value
   */
  public void setPol3RetSlot009(char[] value) {
    pol3RetSlot009 = checkPol3RetSlot009Constraints(value);
    serializePol3RetSlot009(pol3RetSlot009);
  }

  /**
   * Update Pol3RetSlot009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot009, pol3RetSlot009.length);
  }

  public void setPol3RetSlot009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot009, pol3RetSlot009.length);
  }

  /**
   * Update Pol3RetSlot009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot009 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot009 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot009(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot009, POL_3_RET_SLOT_009_LEN);
  }

  /**
   * Update Pol3RetSlot009 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot009, POL_3_RET_SLOT_009_LEN);
  }

  /**
   * Update Pol3RetSlot009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff009
   *
   * @return pol3RetEff009
   */
  public char[] getPol3RetEff009() throws CFException {
    if (isPol3RetEff009Modified()) {
      pol3RetEff009 = refreshPol3RetEff009();
    }
    return pol3RetEff009;
  }

  /**
   * set variable pol3RetEff009 Corresponding COBOL Variable is POL3-RET-EFF-009
   *
   * @param value
   */
  public void setPol3RetEff009(char[] value) {
    pol3RetEff009 = checkPol3RetEff009Constraints(value);
    serializePol3RetEff009(pol3RetEff009);
  }

  /**
   * Update Pol3RetEff009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff009, pol3RetEff009.length);
  }

  public void setPol3RetEff009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff009, pol3RetEff009.length);
  }

  /**
   * Update Pol3RetEff009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff009 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff009 with another Field
   *
   * @param value
   */
  public void setPol3RetEff009(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff009, POL_3_RET_EFF_009_LEN);
  }

  /**
   * Update Pol3RetEff009 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff009, POL_3_RET_EFF_009_LEN);
  }

  /**
   * Update Pol3RetEff009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc009
   *
   * @return pol3RetCanc009
   */
  public char[] getPol3RetCanc009() throws CFException {
    if (isPol3RetCanc009Modified()) {
      pol3RetCanc009 = refreshPol3RetCanc009();
    }
    return pol3RetCanc009;
  }

  /**
   * set variable pol3RetCanc009 Corresponding COBOL Variable is POL3-RET-CANC-009
   *
   * @param value
   */
  public void setPol3RetCanc009(char[] value) {
    pol3RetCanc009 = checkPol3RetCanc009Constraints(value);
    serializePol3RetCanc009(pol3RetCanc009);
  }

  /**
   * Update Pol3RetCanc009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc009, pol3RetCanc009.length);
  }

  public void setPol3RetCanc009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc009, pol3RetCanc009.length);
  }

  /**
   * Update Pol3RetCanc009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc009 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc009 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc009(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc009, POL_3_RET_CANC_009_LEN);
  }

  /**
   * Update Pol3RetCanc009 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc009, POL_3_RET_CANC_009_LEN);
  }

  /**
   * Update Pol3RetCanc009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot010
   *
   * @return pol3RetSlot010
   */
  public char[] getPol3RetSlot010() throws CFException {
    if (isPol3RetSlot010Modified()) {
      pol3RetSlot010 = refreshPol3RetSlot010();
    }
    return pol3RetSlot010;
  }

  /**
   * set variable pol3RetSlot010 Corresponding COBOL Variable is POL3-RET-SLOT-010
   *
   * @param value
   */
  public void setPol3RetSlot010(char[] value) {
    pol3RetSlot010 = checkPol3RetSlot010Constraints(value);
    serializePol3RetSlot010(pol3RetSlot010);
  }

  /**
   * Update Pol3RetSlot010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot010, pol3RetSlot010.length);
  }

  public void setPol3RetSlot010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot010, pol3RetSlot010.length);
  }

  /**
   * Update Pol3RetSlot010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot010 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot010 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot010(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot010, POL_3_RET_SLOT_010_LEN);
  }

  /**
   * Update Pol3RetSlot010 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot010, POL_3_RET_SLOT_010_LEN);
  }

  /**
   * Update Pol3RetSlot010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff010
   *
   * @return pol3RetEff010
   */
  public char[] getPol3RetEff010() throws CFException {
    if (isPol3RetEff010Modified()) {
      pol3RetEff010 = refreshPol3RetEff010();
    }
    return pol3RetEff010;
  }

  /**
   * set variable pol3RetEff010 Corresponding COBOL Variable is POL3-RET-EFF-010
   *
   * @param value
   */
  public void setPol3RetEff010(char[] value) {
    pol3RetEff010 = checkPol3RetEff010Constraints(value);
    serializePol3RetEff010(pol3RetEff010);
  }

  /**
   * Update Pol3RetEff010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff010, pol3RetEff010.length);
  }

  public void setPol3RetEff010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff010, pol3RetEff010.length);
  }

  /**
   * Update Pol3RetEff010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff010 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff010 with another Field
   *
   * @param value
   */
  public void setPol3RetEff010(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff010, POL_3_RET_EFF_010_LEN);
  }

  /**
   * Update Pol3RetEff010 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff010, POL_3_RET_EFF_010_LEN);
  }

  /**
   * Update Pol3RetEff010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc010
   *
   * @return pol3RetCanc010
   */
  public char[] getPol3RetCanc010() throws CFException {
    if (isPol3RetCanc010Modified()) {
      pol3RetCanc010 = refreshPol3RetCanc010();
    }
    return pol3RetCanc010;
  }

  /**
   * set variable pol3RetCanc010 Corresponding COBOL Variable is POL3-RET-CANC-010
   *
   * @param value
   */
  public void setPol3RetCanc010(char[] value) {
    pol3RetCanc010 = checkPol3RetCanc010Constraints(value);
    serializePol3RetCanc010(pol3RetCanc010);
  }

  /**
   * Update Pol3RetCanc010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc010, pol3RetCanc010.length);
  }

  public void setPol3RetCanc010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc010, pol3RetCanc010.length);
  }

  /**
   * Update Pol3RetCanc010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc010 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc010 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc010(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc010, POL_3_RET_CANC_010_LEN);
  }

  /**
   * Update Pol3RetCanc010 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc010, POL_3_RET_CANC_010_LEN);
  }

  /**
   * Update Pol3RetCanc010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot011
   *
   * @return pol3RetSlot011
   */
  public char[] getPol3RetSlot011() throws CFException {
    if (isPol3RetSlot011Modified()) {
      pol3RetSlot011 = refreshPol3RetSlot011();
    }
    return pol3RetSlot011;
  }

  /**
   * set variable pol3RetSlot011 Corresponding COBOL Variable is POL3-RET-SLOT-011
   *
   * @param value
   */
  public void setPol3RetSlot011(char[] value) {
    pol3RetSlot011 = checkPol3RetSlot011Constraints(value);
    serializePol3RetSlot011(pol3RetSlot011);
  }

  /**
   * Update Pol3RetSlot011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot011, pol3RetSlot011.length);
  }

  public void setPol3RetSlot011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot011, pol3RetSlot011.length);
  }

  /**
   * Update Pol3RetSlot011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot011 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot011 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot011(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot011, POL_3_RET_SLOT_011_LEN);
  }

  /**
   * Update Pol3RetSlot011 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot011, POL_3_RET_SLOT_011_LEN);
  }

  /**
   * Update Pol3RetSlot011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff011
   *
   * @return pol3RetEff011
   */
  public char[] getPol3RetEff011() throws CFException {
    if (isPol3RetEff011Modified()) {
      pol3RetEff011 = refreshPol3RetEff011();
    }
    return pol3RetEff011;
  }

  /**
   * set variable pol3RetEff011 Corresponding COBOL Variable is POL3-RET-EFF-011
   *
   * @param value
   */
  public void setPol3RetEff011(char[] value) {
    pol3RetEff011 = checkPol3RetEff011Constraints(value);
    serializePol3RetEff011(pol3RetEff011);
  }

  /**
   * Update Pol3RetEff011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff011, pol3RetEff011.length);
  }

  public void setPol3RetEff011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff011, pol3RetEff011.length);
  }

  /**
   * Update Pol3RetEff011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff011 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff011 with another Field
   *
   * @param value
   */
  public void setPol3RetEff011(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff011, POL_3_RET_EFF_011_LEN);
  }

  /**
   * Update Pol3RetEff011 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff011, POL_3_RET_EFF_011_LEN);
  }

  /**
   * Update Pol3RetEff011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc011
   *
   * @return pol3RetCanc011
   */
  public char[] getPol3RetCanc011() throws CFException {
    if (isPol3RetCanc011Modified()) {
      pol3RetCanc011 = refreshPol3RetCanc011();
    }
    return pol3RetCanc011;
  }

  /**
   * set variable pol3RetCanc011 Corresponding COBOL Variable is POL3-RET-CANC-011
   *
   * @param value
   */
  public void setPol3RetCanc011(char[] value) {
    pol3RetCanc011 = checkPol3RetCanc011Constraints(value);
    serializePol3RetCanc011(pol3RetCanc011);
  }

  /**
   * Update Pol3RetCanc011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc011, pol3RetCanc011.length);
  }

  public void setPol3RetCanc011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc011, pol3RetCanc011.length);
  }

  /**
   * Update Pol3RetCanc011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc011 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc011 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc011(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc011, POL_3_RET_CANC_011_LEN);
  }

  /**
   * Update Pol3RetCanc011 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc011, POL_3_RET_CANC_011_LEN);
  }

  /**
   * Update Pol3RetCanc011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot012
   *
   * @return pol3RetSlot012
   */
  public char[] getPol3RetSlot012() throws CFException {
    if (isPol3RetSlot012Modified()) {
      pol3RetSlot012 = refreshPol3RetSlot012();
    }
    return pol3RetSlot012;
  }

  /**
   * set variable pol3RetSlot012 Corresponding COBOL Variable is POL3-RET-SLOT-012
   *
   * @param value
   */
  public void setPol3RetSlot012(char[] value) {
    pol3RetSlot012 = checkPol3RetSlot012Constraints(value);
    serializePol3RetSlot012(pol3RetSlot012);
  }

  /**
   * Update Pol3RetSlot012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot012, pol3RetSlot012.length);
  }

  public void setPol3RetSlot012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot012, pol3RetSlot012.length);
  }

  /**
   * Update Pol3RetSlot012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot012 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot012 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot012(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot012, POL_3_RET_SLOT_012_LEN);
  }

  /**
   * Update Pol3RetSlot012 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot012, POL_3_RET_SLOT_012_LEN);
  }

  /**
   * Update Pol3RetSlot012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff012
   *
   * @return pol3RetEff012
   */
  public char[] getPol3RetEff012() throws CFException {
    if (isPol3RetEff012Modified()) {
      pol3RetEff012 = refreshPol3RetEff012();
    }
    return pol3RetEff012;
  }

  /**
   * set variable pol3RetEff012 Corresponding COBOL Variable is POL3-RET-EFF-012
   *
   * @param value
   */
  public void setPol3RetEff012(char[] value) {
    pol3RetEff012 = checkPol3RetEff012Constraints(value);
    serializePol3RetEff012(pol3RetEff012);
  }

  /**
   * Update Pol3RetEff012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff012, pol3RetEff012.length);
  }

  public void setPol3RetEff012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff012, pol3RetEff012.length);
  }

  /**
   * Update Pol3RetEff012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff012 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff012 with another Field
   *
   * @param value
   */
  public void setPol3RetEff012(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff012, POL_3_RET_EFF_012_LEN);
  }

  /**
   * Update Pol3RetEff012 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff012, POL_3_RET_EFF_012_LEN);
  }

  /**
   * Update Pol3RetEff012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc012
   *
   * @return pol3RetCanc012
   */
  public char[] getPol3RetCanc012() throws CFException {
    if (isPol3RetCanc012Modified()) {
      pol3RetCanc012 = refreshPol3RetCanc012();
    }
    return pol3RetCanc012;
  }

  /**
   * set variable pol3RetCanc012 Corresponding COBOL Variable is POL3-RET-CANC-012
   *
   * @param value
   */
  public void setPol3RetCanc012(char[] value) {
    pol3RetCanc012 = checkPol3RetCanc012Constraints(value);
    serializePol3RetCanc012(pol3RetCanc012);
  }

  /**
   * Update Pol3RetCanc012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc012, pol3RetCanc012.length);
  }

  public void setPol3RetCanc012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc012, pol3RetCanc012.length);
  }

  /**
   * Update Pol3RetCanc012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc012 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc012 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc012(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc012, POL_3_RET_CANC_012_LEN);
  }

  /**
   * Update Pol3RetCanc012 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc012, POL_3_RET_CANC_012_LEN);
  }

  /**
   * Update Pol3RetCanc012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot013
   *
   * @return pol3RetSlot013
   */
  public char[] getPol3RetSlot013() throws CFException {
    if (isPol3RetSlot013Modified()) {
      pol3RetSlot013 = refreshPol3RetSlot013();
    }
    return pol3RetSlot013;
  }

  /**
   * set variable pol3RetSlot013 Corresponding COBOL Variable is POL3-RET-SLOT-013
   *
   * @param value
   */
  public void setPol3RetSlot013(char[] value) {
    pol3RetSlot013 = checkPol3RetSlot013Constraints(value);
    serializePol3RetSlot013(pol3RetSlot013);
  }

  /**
   * Update Pol3RetSlot013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot013, pol3RetSlot013.length);
  }

  public void setPol3RetSlot013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot013, pol3RetSlot013.length);
  }

  /**
   * Update Pol3RetSlot013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot013 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot013 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot013(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot013, POL_3_RET_SLOT_013_LEN);
  }

  /**
   * Update Pol3RetSlot013 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot013, POL_3_RET_SLOT_013_LEN);
  }

  /**
   * Update Pol3RetSlot013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff013
   *
   * @return pol3RetEff013
   */
  public char[] getPol3RetEff013() throws CFException {
    if (isPol3RetEff013Modified()) {
      pol3RetEff013 = refreshPol3RetEff013();
    }
    return pol3RetEff013;
  }

  /**
   * set variable pol3RetEff013 Corresponding COBOL Variable is POL3-RET-EFF-013
   *
   * @param value
   */
  public void setPol3RetEff013(char[] value) {
    pol3RetEff013 = checkPol3RetEff013Constraints(value);
    serializePol3RetEff013(pol3RetEff013);
  }

  /**
   * Update Pol3RetEff013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff013, pol3RetEff013.length);
  }

  public void setPol3RetEff013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff013, pol3RetEff013.length);
  }

  /**
   * Update Pol3RetEff013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff013 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff013 with another Field
   *
   * @param value
   */
  public void setPol3RetEff013(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff013, POL_3_RET_EFF_013_LEN);
  }

  /**
   * Update Pol3RetEff013 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff013, POL_3_RET_EFF_013_LEN);
  }

  /**
   * Update Pol3RetEff013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc013
   *
   * @return pol3RetCanc013
   */
  public char[] getPol3RetCanc013() throws CFException {
    if (isPol3RetCanc013Modified()) {
      pol3RetCanc013 = refreshPol3RetCanc013();
    }
    return pol3RetCanc013;
  }

  /**
   * set variable pol3RetCanc013 Corresponding COBOL Variable is POL3-RET-CANC-013
   *
   * @param value
   */
  public void setPol3RetCanc013(char[] value) {
    pol3RetCanc013 = checkPol3RetCanc013Constraints(value);
    serializePol3RetCanc013(pol3RetCanc013);
  }

  /**
   * Update Pol3RetCanc013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc013, pol3RetCanc013.length);
  }

  public void setPol3RetCanc013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc013, pol3RetCanc013.length);
  }

  /**
   * Update Pol3RetCanc013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc013 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc013 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc013(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc013, POL_3_RET_CANC_013_LEN);
  }

  /**
   * Update Pol3RetCanc013 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc013, POL_3_RET_CANC_013_LEN);
  }

  /**
   * Update Pol3RetCanc013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot014
   *
   * @return pol3RetSlot014
   */
  public char[] getPol3RetSlot014() throws CFException {
    if (isPol3RetSlot014Modified()) {
      pol3RetSlot014 = refreshPol3RetSlot014();
    }
    return pol3RetSlot014;
  }

  /**
   * set variable pol3RetSlot014 Corresponding COBOL Variable is POL3-RET-SLOT-014
   *
   * @param value
   */
  public void setPol3RetSlot014(char[] value) {
    pol3RetSlot014 = checkPol3RetSlot014Constraints(value);
    serializePol3RetSlot014(pol3RetSlot014);
  }

  /**
   * Update Pol3RetSlot014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot014, pol3RetSlot014.length);
  }

  public void setPol3RetSlot014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot014, pol3RetSlot014.length);
  }

  /**
   * Update Pol3RetSlot014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot014 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot014 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot014(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot014, POL_3_RET_SLOT_014_LEN);
  }

  /**
   * Update Pol3RetSlot014 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot014, POL_3_RET_SLOT_014_LEN);
  }

  /**
   * Update Pol3RetSlot014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetEff014
   *
   * @return pol3RetEff014
   */
  public char[] getPol3RetEff014() throws CFException {
    if (isPol3RetEff014Modified()) {
      pol3RetEff014 = refreshPol3RetEff014();
    }
    return pol3RetEff014;
  }

  /**
   * set variable pol3RetEff014 Corresponding COBOL Variable is POL3-RET-EFF-014
   *
   * @param value
   */
  public void setPol3RetEff014(char[] value) {
    pol3RetEff014 = checkPol3RetEff014Constraints(value);
    serializePol3RetEff014(pol3RetEff014);
  }

  /**
   * Update Pol3RetEff014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetEff014, pol3RetEff014.length);
  }

  public void setPol3RetEff014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff014, pol3RetEff014.length);
  }

  /**
   * Update Pol3RetEff014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff014 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetEff014 with another Field
   *
   * @param value
   */
  public void setPol3RetEff014(Field source) {
    replace(source, 0, source.length(), beginPol3RetEff014, POL_3_RET_EFF_014_LEN);
  }

  /**
   * Update Pol3RetEff014 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetEff014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff014, POL_3_RET_EFF_014_LEN);
  }

  /**
   * Update Pol3RetEff014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetEff014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetEff014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetCanc014
   *
   * @return pol3RetCanc014
   */
  public char[] getPol3RetCanc014() throws CFException {
    if (isPol3RetCanc014Modified()) {
      pol3RetCanc014 = refreshPol3RetCanc014();
    }
    return pol3RetCanc014;
  }

  /**
   * set variable pol3RetCanc014 Corresponding COBOL Variable is POL3-RET-CANC-014
   *
   * @param value
   */
  public void setPol3RetCanc014(char[] value) {
    pol3RetCanc014 = checkPol3RetCanc014Constraints(value);
    serializePol3RetCanc014(pol3RetCanc014);
  }

  /**
   * Update Pol3RetCanc014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetCanc014, pol3RetCanc014.length);
  }

  public void setPol3RetCanc014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc014, pol3RetCanc014.length);
  }

  /**
   * Update Pol3RetCanc014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc014 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetCanc014 with another Field
   *
   * @param value
   */
  public void setPol3RetCanc014(Field source) {
    replace(source, 0, source.length(), beginPol3RetCanc014, POL_3_RET_CANC_014_LEN);
  }

  /**
   * Update Pol3RetCanc014 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc014, POL_3_RET_CANC_014_LEN);
  }

  /**
   * Update Pol3RetCanc014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetCanc014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetCanc014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot018
   *
   * @return pol3RetSlot018
   */
  public char[] getPol3RetSlot018() throws CFException {
    if (isPol3RetSlot018Modified()) {
      pol3RetSlot018 = refreshPol3RetSlot018();
    }
    return pol3RetSlot018;
  }

  /**
   * set variable pol3RetSlot018 Corresponding COBOL Variable is POL3-RET-SLOT-018
   *
   * @param value
   */
  public void setPol3RetSlot018(char[] value) {
    pol3RetSlot018 = checkPol3RetSlot018Constraints(value);
    serializePol3RetSlot018(pol3RetSlot018);
  }

  /**
   * Update Pol3RetSlot018 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot018(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot018, pol3RetSlot018.length);
  }

  public void setPol3RetSlot018(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot018, pol3RetSlot018.length);
  }

  /**
   * Update Pol3RetSlot018 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot018(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot018 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot018 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot018(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot018, POL_3_RET_SLOT_018_LEN);
  }

  /**
   * Update Pol3RetSlot018 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot018(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot018, POL_3_RET_SLOT_018_LEN);
  }

  /**
   * Update Pol3RetSlot018 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot018(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot018 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot019
   *
   * @return pol3RetSlot019
   */
  public char[] getPol3RetSlot019() throws CFException {
    if (isPol3RetSlot019Modified()) {
      pol3RetSlot019 = refreshPol3RetSlot019();
    }
    return pol3RetSlot019;
  }

  /**
   * set variable pol3RetSlot019 Corresponding COBOL Variable is POL3-RET-SLOT-019
   *
   * @param value
   */
  public void setPol3RetSlot019(char[] value) {
    pol3RetSlot019 = checkPol3RetSlot019Constraints(value);
    serializePol3RetSlot019(pol3RetSlot019);
  }

  /**
   * Update Pol3RetSlot019 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot019(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot019, pol3RetSlot019.length);
  }

  public void setPol3RetSlot019(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot019, pol3RetSlot019.length);
  }

  /**
   * Update Pol3RetSlot019 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot019(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot019 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot019 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot019(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot019, POL_3_RET_SLOT_019_LEN);
  }

  /**
   * Update Pol3RetSlot019 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot019(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot019, POL_3_RET_SLOT_019_LEN);
  }

  /**
   * Update Pol3RetSlot019 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot019(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot019 + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol3RetSlot020
   *
   * @return pol3RetSlot020
   */
  public char[] getPol3RetSlot020() throws CFException {
    if (isPol3RetSlot020Modified()) {
      pol3RetSlot020 = refreshPol3RetSlot020();
    }
    return pol3RetSlot020;
  }

  /**
   * set variable pol3RetSlot020 Corresponding COBOL Variable is POL3-RET-SLOT-020
   *
   * @param value
   */
  public void setPol3RetSlot020(char[] value) {
    pol3RetSlot020 = checkPol3RetSlot020Constraints(value);
    serializePol3RetSlot020(pol3RetSlot020);
  }

  /**
   * Update Pol3RetSlot020 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot020(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol3RetSlot020, pol3RetSlot020.length);
  }

  public void setPol3RetSlot020(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot020, pol3RetSlot020.length);
  }

  /**
   * Update Pol3RetSlot020 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot020(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot020 + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetSlot020 with another Field
   *
   * @param value
   */
  public void setPol3RetSlot020(Field source) {
    replace(source, 0, source.length(), beginPol3RetSlot020, POL_3_RET_SLOT_020_LEN);
  }

  /**
   * Update Pol3RetSlot020 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot020(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot020, POL_3_RET_SLOT_020_LEN);
  }

  /**
   * Update Pol3RetSlot020 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetSlot020(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol3RetSlot020 + targetIndex, targetLen);
  }

  /**
   * initializes Pol3RetArea3 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol3StdPolNbr(CONSTANTS.SPACE_6);
    setPol3StdPlnNbr(0);
    setPol3RetNewOldSrvcInd(CONSTANTS.SPACE);
    setPol3RetSviTblPriNbr(CONSTANTS.SPACE_6);
    setPol3RetSlotTblId(CONSTANTS.SPACE_6);
    setPol3RetObligId(CONSTANTS.SPACE_2);
    setPol3RetShrArngCd(CONSTANTS.SPACE_2);
    setPol3RetFundTypCd(CONSTANTS.SPACE);
    setPol3RetPrdctKeyCd(CONSTANTS.SPACE_3);
    setPol3RetMbrPrdctTypCd(CONSTANTS.SPACE_3);
    setPol3RetSviTblTerNbr(CONSTANTS.SPACE_6);
    setPol3NtfyCrdcEpInd(CONSTANTS.SPACE);
    setPol3OncPolPrtcpCd(CONSTANTS.SPACE);
    setPol3EvdBasDialgInd(CONSTANTS.SPACE);
    setPol3CoreMedPrrAuthCd(CONSTANTS.SPACE);
    setPol3RelSrvcInd(CONSTANTS.SPACE);
    setPol3GenPolPrtcpCd(CONSTANTS.SPACE);
    setPol3SecOpinVendCd(CONSTANTS.SPACE);
    setPol3RetBhvHlthVendCd(CONSTANTS.SPACE);
    setPol3RetSlot001(CONSTANTS.SPACE_6);
    setPol3RetEff001(CONSTANTS.SPACE_10);
    setPol3RetCanc001(CONSTANTS.SPACE_10);
    setPol3RetSlot002(CONSTANTS.SPACE_6);
    setPol3RetEff002(CONSTANTS.SPACE_10);
    setPol3RetCanc002(CONSTANTS.SPACE_10);
    setPol3RetSlot003(CONSTANTS.SPACE_6);
    setPol3RetEff003(CONSTANTS.SPACE_10);
    setPol3RetCanc003(CONSTANTS.SPACE_10);
    setPol3RetSlot004(CONSTANTS.SPACE_6);
    setPol3RetEff004(CONSTANTS.SPACE_10);
    setPol3RetCanc004(CONSTANTS.SPACE_10);
    setPol3RetSlot005(CONSTANTS.SPACE_6);
    setPol3RetEff005(CONSTANTS.SPACE_10);
    setPol3RetCanc005(CONSTANTS.SPACE_10);
    setPol3RetSlot006(CONSTANTS.SPACE_6);
    setPol3RetEff006(CONSTANTS.SPACE_10);
    setPol3RetCanc006(CONSTANTS.SPACE_10);
    setPol3RetSlot007(CONSTANTS.SPACE_6);
    setPol3RetEff007(CONSTANTS.SPACE_10);
    setPol3RetCanc007(CONSTANTS.SPACE_10);
    setPol3RetSlot008(CONSTANTS.SPACE_6);
    setPol3RetEff008(CONSTANTS.SPACE_10);
    setPol3RetCanc008(CONSTANTS.SPACE_10);
    setPol3RetSlot009(CONSTANTS.SPACE_6);
    setPol3RetEff009(CONSTANTS.SPACE_10);
    setPol3RetCanc009(CONSTANTS.SPACE_10);
    setPol3RetSlot010(CONSTANTS.SPACE_6);
    setPol3RetEff010(CONSTANTS.SPACE_10);
    setPol3RetCanc010(CONSTANTS.SPACE_10);
    setPol3RetSlot011(CONSTANTS.SPACE_6);
    setPol3RetEff011(CONSTANTS.SPACE_10);
    setPol3RetCanc011(CONSTANTS.SPACE_10);
    setPol3RetSlot012(CONSTANTS.SPACE_6);
    setPol3RetEff012(CONSTANTS.SPACE_10);
    setPol3RetCanc012(CONSTANTS.SPACE_10);
    setPol3RetSlot013(CONSTANTS.SPACE_6);
    setPol3RetEff013(CONSTANTS.SPACE_10);
    setPol3RetCanc013(CONSTANTS.SPACE_10);
    setPol3RetSlot014(CONSTANTS.SPACE_6);
    setPol3RetEff014(CONSTANTS.SPACE_10);
    setPol3RetCanc014(CONSTANTS.SPACE_10);
    setPol3RetSlot018(CONSTANTS.SPACE_6);
    setPol3RetSlot019(CONSTANTS.SPACE_6);
    setPol3RetSlot020(CONSTANTS.SPACE_6);
  }

  public static int getPol3RetArea3FieldLength() {
    return POL_3_RET_AREA_3_LENGTH;
  }
}
