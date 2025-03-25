package com.cloudframe.app.dto.bbhsr002;

/**
 * The class PolRetArea3 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class PolRetArea3 extends PolRetArea3Serialized {

  private char[] polStdPolNbr = Field.fillLowValue(6);

  private int polStdPlnNbr;

  private char[] polRetNewOldSrvcInd = Field.fillLowValue(1);

  private char[] polRetSviTblPriNbr = Field.fillLowValue(6);

  private char[] polRetSlotTblId = Field.fillLowValue(6);

  private char[] polRetObligId = Field.fillLowValue(2);

  private char[] polRetShrArngCd = Field.fillLowValue(2);

  private char[] polRetFundTypCd = Field.fillLowValue(1);

  private char[] polRetPrdctKeyCd = Field.fillLowValue(3);

  private char[] polRetMbrPrdctTypCd = Field.fillLowValue(3);

  private char[] polRetSviTblTerNbr = Field.fillLowValue(6);

  private char[] polNtfyCrdcEpInd = Field.fillLowValue(1);

  private char[] polOncPolPrtcpCd = Field.fillLowValue(1);

  private char[] polEvdBasDialgInd = Field.fillLowValue(1);

  private char[] polCoreMedPrrAuthCd = Field.fillLowValue(1);

  private char[] polRelSrvcInd = Field.fillLowValue(1);

  private char[] polGenPolPrtcpCd = Field.fillLowValue(1);

  private char[] polSecOpinVendCd = Field.fillLowValue(1);

  private char[] polRetBhvHlthVendCd = Field.fillLowValue(1);

  private char[] polRetSlot001 = Field.fillLowValue(6);

  private char[] polRetEff001 = Field.fillLowValue(10);

  private char[] polRetCanc001 = Field.fillLowValue(10);

  private char[] polRetSlot002 = Field.fillLowValue(6);

  private char[] polRetEff002 = Field.fillLowValue(10);

  private char[] polRetCanc002 = Field.fillLowValue(10);

  private char[] polRetSlot003 = Field.fillLowValue(6);

  private char[] polRetEff003 = Field.fillLowValue(10);

  private char[] polRetCanc003 = Field.fillLowValue(10);

  private char[] polRetSlot004 = Field.fillLowValue(6);

  private char[] polRetEff004 = Field.fillLowValue(10);

  private char[] polRetCanc004 = Field.fillLowValue(10);

  private char[] polRetSlot005 = Field.fillLowValue(6);

  private char[] polRetEff005 = Field.fillLowValue(10);

  private char[] polRetCanc005 = Field.fillLowValue(10);

  private char[] polRetSlot006 = Field.fillLowValue(6);

  private char[] polRetEff006 = Field.fillLowValue(10);

  private char[] polRetCanc006 = Field.fillLowValue(10);

  private char[] polRetSlot007 = Field.fillLowValue(6);

  private char[] polRetEff007 = Field.fillLowValue(10);

  private char[] polRetCanc007 = Field.fillLowValue(10);

  private char[] polRetSlot008 = Field.fillLowValue(6);

  private char[] polRetEff008 = Field.fillLowValue(10);

  private char[] polRetCanc008 = Field.fillLowValue(10);

  private char[] polRetSlot009 = Field.fillLowValue(6);

  private char[] polRetEff009 = Field.fillLowValue(10);

  private char[] polRetCanc009 = Field.fillLowValue(10);

  private char[] polRetSlot010 = Field.fillLowValue(6);

  private char[] polRetEff010 = Field.fillLowValue(10);

  private char[] polRetCanc010 = Field.fillLowValue(10);

  private char[] polRetSlot011 = Field.fillLowValue(6);

  private char[] polRetEff011 = Field.fillLowValue(10);

  private char[] polRetCanc011 = Field.fillLowValue(10);

  private char[] polRetSlot012 = Field.fillLowValue(6);

  private char[] polRetEff012 = Field.fillLowValue(10);

  private char[] polRetCanc012 = Field.fillLowValue(10);

  private char[] polRetSlot013 = Field.fillLowValue(6);

  private char[] polRetEff013 = Field.fillLowValue(10);

  private char[] polRetCanc013 = Field.fillLowValue(10);

  private char[] polRetSlot014 = Field.fillLowValue(6);

  private char[] polRetEff014 = Field.fillLowValue(10);

  private char[] polRetCanc014 = Field.fillLowValue(10);

  private char[] polRetSlot018 = Field.fillLowValue(6);

  private char[] polRetSlot019 = Field.fillLowValue(6);

  private char[] polRetSlot020 = Field.fillLowValue(6);

  /** Constructor for PolRetArea3 */
  public PolRetArea3() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PolRetArea3. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PolRetArea3(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of polStdPolNbr
   *
   * @return polStdPolNbr
   */
  public char[] getPolStdPolNbr() throws CFException {
    if (isPolStdPolNbrModified()) {
      polStdPolNbr = refreshPolStdPolNbr();
    }
    return polStdPolNbr;
  }

  /**
   * set variable polStdPolNbr Corresponding COBOL Variable is POL-STD-POL-NBR
   *
   * @param value
   */
  public void setPolStdPolNbr(char[] value) {
    polStdPolNbr = checkPolStdPolNbrConstraints(value);
    serializePolStdPolNbr(polStdPolNbr);
  }

  /**
   * Update PolStdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolStdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolStdPolNbr, polStdPolNbr.length);
  }

  public void setPolStdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolStdPolNbr, polStdPolNbr.length);
  }

  /**
   * Update PolStdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolStdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolStdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update PolStdPolNbr with another Field
   *
   * @param value
   */
  public void setPolStdPolNbr(Field source) {
    replace(source, 0, source.length(), beginPolStdPolNbr, POL_STD_POL_NBR_LEN);
  }

  /**
   * Update PolStdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPolStdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolStdPolNbr, POL_STD_POL_NBR_LEN);
  }

  /**
   * Update PolStdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolStdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolStdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of polStdPlnNbr
   *
   * @return polStdPlnNbr
   */
  public int getPolStdPlnNbr() throws CFException {
    if (isPolStdPlnNbrModified()) {
      polStdPlnNbr = refreshPolStdPlnNbr();
    }
    return polStdPlnNbr;
  }

  /**
   * Update PolStdPlnNbr with the passed value Corresponding COBOL Variable is POL-STD-PLN-NBR
   *
   * @param number
   */
  public void setPolStdPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    polStdPlnNbr = checkPolStdPlnNbrMaxLimit(number);
    serializePolStdPlnNbr(polStdPlnNbr);
  }

  public void setPolStdPlnNbr(long number) {
    number = checkPolStdPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPolStdPlnNbr((int) number);
  }

  /**
   * Update PolStdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPolStdPlnNbr(char[] value) throws CFException {
    polStdPlnNbr = serializePolStdPlnNbr(value);
  }
  /**
   * Update PolStdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPolStdPlnNbrString(char[] value) throws CFException {
    setPolStdPlnNbr(value);
  }
  /**
   * Returns the value of polRetNewOldSrvcInd
   *
   * @return polRetNewOldSrvcInd
   */
  public char[] getPolRetNewOldSrvcInd() throws CFException {
    if (isPolRetNewOldSrvcIndModified()) {
      polRetNewOldSrvcInd = refreshPolRetNewOldSrvcInd();
    }
    return polRetNewOldSrvcInd;
  }

  /**
   * set variable polRetNewOldSrvcInd Corresponding COBOL Variable is POL-RET-NEW-OLD-SRVC-IND
   *
   * @param value
   */
  public void setPolRetNewOldSrvcInd(char[] value) {
    polRetNewOldSrvcInd = checkPolRetNewOldSrvcIndConstraints(value);
    serializePolRetNewOldSrvcInd(polRetNewOldSrvcInd);
  }

  /**
   * Update PolRetNewOldSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetNewOldSrvcInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPolRetNewOldSrvcInd, polRetNewOldSrvcInd.length);
  }

  public void setPolRetNewOldSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetNewOldSrvcInd, polRetNewOldSrvcInd.length);
  }

  /**
   * Update PolRetNewOldSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetNewOldSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetNewOldSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update PolRetNewOldSrvcInd with another Field
   *
   * @param value
   */
  public void setPolRetNewOldSrvcInd(Field source) {
    replace(source, 0, source.length(), beginPolRetNewOldSrvcInd, POL_RET_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update PolRetNewOldSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetNewOldSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetNewOldSrvcInd, POL_RET_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update PolRetNewOldSrvcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetNewOldSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetNewOldSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSviTblPriNbr
   *
   * @return polRetSviTblPriNbr
   */
  public char[] getPolRetSviTblPriNbr() throws CFException {
    if (isPolRetSviTblPriNbrModified()) {
      polRetSviTblPriNbr = refreshPolRetSviTblPriNbr();
    }
    return polRetSviTblPriNbr;
  }

  /**
   * set variable polRetSviTblPriNbr Corresponding COBOL Variable is POL-RET-SVI-TBL-PRI-NBR
   *
   * @param value
   */
  public void setPolRetSviTblPriNbr(char[] value) {
    polRetSviTblPriNbr = checkPolRetSviTblPriNbrConstraints(value);
    serializePolRetSviTblPriNbr(polRetSviTblPriNbr);
  }

  /**
   * Update PolRetSviTblPriNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblPriNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSviTblPriNbr, polRetSviTblPriNbr.length);
  }

  public void setPolRetSviTblPriNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblPriNbr, polRetSviTblPriNbr.length);
  }

  /**
   * Update PolRetSviTblPriNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblPriNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblPriNbr + targetIndex, targetLen);
  }

  /**
   * Update PolRetSviTblPriNbr with another Field
   *
   * @param value
   */
  public void setPolRetSviTblPriNbr(Field source) {
    replace(source, 0, source.length(), beginPolRetSviTblPriNbr, POL_RET_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update PolRetSviTblPriNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblPriNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblPriNbr, POL_RET_SVI_TBL_PRI_NBR_LEN);
  }

  /**
   * Update PolRetSviTblPriNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblPriNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblPriNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlotTblId
   *
   * @return polRetSlotTblId
   */
  public char[] getPolRetSlotTblId() throws CFException {
    if (isPolRetSlotTblIdModified()) {
      polRetSlotTblId = refreshPolRetSlotTblId();
    }
    return polRetSlotTblId;
  }

  /**
   * set variable polRetSlotTblId Corresponding COBOL Variable is POL-RET-SLOT-TBL-ID
   *
   * @param value
   */
  public void setPolRetSlotTblId(char[] value) {
    polRetSlotTblId = checkPolRetSlotTblIdConstraints(value);
    serializePolRetSlotTblId(polRetSlotTblId);
  }

  /**
   * Update PolRetSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlotTblId, polRetSlotTblId.length);
  }

  public void setPolRetSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlotTblId, polRetSlotTblId.length);
  }

  /**
   * Update PolRetSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlotTblId with another Field
   *
   * @param value
   */
  public void setPolRetSlotTblId(Field source) {
    replace(source, 0, source.length(), beginPolRetSlotTblId, POL_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update PolRetSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlotTblId, POL_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update PolRetSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetObligId
   *
   * @return polRetObligId
   */
  public char[] getPolRetObligId() throws CFException {
    if (isPolRetObligIdModified()) {
      polRetObligId = refreshPolRetObligId();
    }
    return polRetObligId;
  }

  /**
   * set variable polRetObligId Corresponding COBOL Variable is POL-RET-OBLIG-ID
   *
   * @param value
   */
  public void setPolRetObligId(char[] value) {
    polRetObligId = checkPolRetObligIdConstraints(value);
    serializePolRetObligId(polRetObligId);
  }

  /**
   * Update PolRetObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetObligId, polRetObligId.length);
  }

  public void setPolRetObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetObligId, polRetObligId.length);
  }

  /**
   * Update PolRetObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetObligId + targetIndex, targetLen);
  }

  /**
   * Update PolRetObligId with another Field
   *
   * @param value
   */
  public void setPolRetObligId(Field source) {
    replace(source, 0, source.length(), beginPolRetObligId, POL_RET_OBLIG_ID_LEN);
  }

  /**
   * Update PolRetObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetObligId, POL_RET_OBLIG_ID_LEN);
  }

  /**
   * Update PolRetObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetShrArngCd
   *
   * @return polRetShrArngCd
   */
  public char[] getPolRetShrArngCd() throws CFException {
    if (isPolRetShrArngCdModified()) {
      polRetShrArngCd = refreshPolRetShrArngCd();
    }
    return polRetShrArngCd;
  }

  /**
   * set variable polRetShrArngCd Corresponding COBOL Variable is POL-RET-SHR-ARNG-CD
   *
   * @param value
   */
  public void setPolRetShrArngCd(char[] value) {
    polRetShrArngCd = checkPolRetShrArngCdConstraints(value);
    serializePolRetShrArngCd(polRetShrArngCd);
  }

  /**
   * Update PolRetShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetShrArngCd, polRetShrArngCd.length);
  }

  public void setPolRetShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetShrArngCd, polRetShrArngCd.length);
  }

  /**
   * Update PolRetShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update PolRetShrArngCd with another Field
   *
   * @param value
   */
  public void setPolRetShrArngCd(Field source) {
    replace(source, 0, source.length(), beginPolRetShrArngCd, POL_RET_SHR_ARNG_CD_LEN);
  }

  /**
   * Update PolRetShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetShrArngCd, POL_RET_SHR_ARNG_CD_LEN);
  }

  /**
   * Update PolRetShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetFundTypCd
   *
   * @return polRetFundTypCd
   */
  public char[] getPolRetFundTypCd() throws CFException {
    if (isPolRetFundTypCdModified()) {
      polRetFundTypCd = refreshPolRetFundTypCd();
    }
    return polRetFundTypCd;
  }

  /**
   * set variable polRetFundTypCd Corresponding COBOL Variable is POL-RET-FUND-TYP-CD
   *
   * @param value
   */
  public void setPolRetFundTypCd(char[] value) {
    polRetFundTypCd = checkPolRetFundTypCdConstraints(value);
    serializePolRetFundTypCd(polRetFundTypCd);
  }

  /**
   * Update PolRetFundTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetFundTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetFundTypCd, polRetFundTypCd.length);
  }

  public void setPolRetFundTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetFundTypCd, polRetFundTypCd.length);
  }

  /**
   * Update PolRetFundTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetFundTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetFundTypCd + targetIndex, targetLen);
  }

  /**
   * Update PolRetFundTypCd with another Field
   *
   * @param value
   */
  public void setPolRetFundTypCd(Field source) {
    replace(source, 0, source.length(), beginPolRetFundTypCd, POL_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update PolRetFundTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetFundTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetFundTypCd, POL_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update PolRetFundTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetFundTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetFundTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetPrdctKeyCd
   *
   * @return polRetPrdctKeyCd
   */
  public char[] getPolRetPrdctKeyCd() throws CFException {
    if (isPolRetPrdctKeyCdModified()) {
      polRetPrdctKeyCd = refreshPolRetPrdctKeyCd();
    }
    return polRetPrdctKeyCd;
  }

  /**
   * set variable polRetPrdctKeyCd Corresponding COBOL Variable is POL-RET-PRDCT-KEY-CD
   *
   * @param value
   */
  public void setPolRetPrdctKeyCd(char[] value) {
    polRetPrdctKeyCd = checkPolRetPrdctKeyCdConstraints(value);
    serializePolRetPrdctKeyCd(polRetPrdctKeyCd);
  }

  /**
   * Update PolRetPrdctKeyCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetPrdctKeyCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetPrdctKeyCd, polRetPrdctKeyCd.length);
  }

  public void setPolRetPrdctKeyCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetPrdctKeyCd, polRetPrdctKeyCd.length);
  }

  /**
   * Update PolRetPrdctKeyCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetPrdctKeyCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetPrdctKeyCd + targetIndex, targetLen);
  }

  /**
   * Update PolRetPrdctKeyCd with another Field
   *
   * @param value
   */
  public void setPolRetPrdctKeyCd(Field source) {
    replace(source, 0, source.length(), beginPolRetPrdctKeyCd, POL_RET_PRDCT_KEY_CD_LEN);
  }

  /**
   * Update PolRetPrdctKeyCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetPrdctKeyCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetPrdctKeyCd, POL_RET_PRDCT_KEY_CD_LEN);
  }

  /**
   * Update PolRetPrdctKeyCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetPrdctKeyCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetPrdctKeyCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetMbrPrdctTypCd
   *
   * @return polRetMbrPrdctTypCd
   */
  public char[] getPolRetMbrPrdctTypCd() throws CFException {
    if (isPolRetMbrPrdctTypCdModified()) {
      polRetMbrPrdctTypCd = refreshPolRetMbrPrdctTypCd();
    }
    return polRetMbrPrdctTypCd;
  }

  /**
   * set variable polRetMbrPrdctTypCd Corresponding COBOL Variable is POL-RET-MBR-PRDCT-TYP-CD
   *
   * @param value
   */
  public void setPolRetMbrPrdctTypCd(char[] value) {
    polRetMbrPrdctTypCd = checkPolRetMbrPrdctTypCdConstraints(value);
    serializePolRetMbrPrdctTypCd(polRetMbrPrdctTypCd);
  }

  /**
   * Update PolRetMbrPrdctTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetMbrPrdctTypCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPolRetMbrPrdctTypCd, polRetMbrPrdctTypCd.length);
  }

  public void setPolRetMbrPrdctTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetMbrPrdctTypCd, polRetMbrPrdctTypCd.length);
  }

  /**
   * Update PolRetMbrPrdctTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetMbrPrdctTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetMbrPrdctTypCd + targetIndex, targetLen);
  }

  /**
   * Update PolRetMbrPrdctTypCd with another Field
   *
   * @param value
   */
  public void setPolRetMbrPrdctTypCd(Field source) {
    replace(source, 0, source.length(), beginPolRetMbrPrdctTypCd, POL_RET_MBR_PRDCT_TYP_CD_LEN);
  }

  /**
   * Update PolRetMbrPrdctTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetMbrPrdctTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetMbrPrdctTypCd, POL_RET_MBR_PRDCT_TYP_CD_LEN);
  }

  /**
   * Update PolRetMbrPrdctTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetMbrPrdctTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetMbrPrdctTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSviTblTerNbr
   *
   * @return polRetSviTblTerNbr
   */
  public char[] getPolRetSviTblTerNbr() throws CFException {
    if (isPolRetSviTblTerNbrModified()) {
      polRetSviTblTerNbr = refreshPolRetSviTblTerNbr();
    }
    return polRetSviTblTerNbr;
  }

  /**
   * set variable polRetSviTblTerNbr Corresponding COBOL Variable is POL-RET-SVI-TBL-TER-NBR
   *
   * @param value
   */
  public void setPolRetSviTblTerNbr(char[] value) {
    polRetSviTblTerNbr = checkPolRetSviTblTerNbrConstraints(value);
    serializePolRetSviTblTerNbr(polRetSviTblTerNbr);
  }

  /**
   * Update PolRetSviTblTerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblTerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSviTblTerNbr, polRetSviTblTerNbr.length);
  }

  public void setPolRetSviTblTerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblTerNbr, polRetSviTblTerNbr.length);
  }

  /**
   * Update PolRetSviTblTerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblTerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblTerNbr + targetIndex, targetLen);
  }

  /**
   * Update PolRetSviTblTerNbr with another Field
   *
   * @param value
   */
  public void setPolRetSviTblTerNbr(Field source) {
    replace(source, 0, source.length(), beginPolRetSviTblTerNbr, POL_RET_SVI_TBL_TER_NBR_LEN);
  }

  /**
   * Update PolRetSviTblTerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblTerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblTerNbr, POL_RET_SVI_TBL_TER_NBR_LEN);
  }

  /**
   * Update PolRetSviTblTerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSviTblTerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSviTblTerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of polNtfyCrdcEpInd
   *
   * @return polNtfyCrdcEpInd
   */
  public char[] getPolNtfyCrdcEpInd() throws CFException {
    if (isPolNtfyCrdcEpIndModified()) {
      polNtfyCrdcEpInd = refreshPolNtfyCrdcEpInd();
    }
    return polNtfyCrdcEpInd;
  }

  /**
   * set variable polNtfyCrdcEpInd Corresponding COBOL Variable is POL-NTFY-CRDC-EP-IND
   *
   * @param value
   */
  public void setPolNtfyCrdcEpInd(char[] value) {
    polNtfyCrdcEpInd = checkPolNtfyCrdcEpIndConstraints(value);
    serializePolNtfyCrdcEpInd(polNtfyCrdcEpInd);
  }

  /**
   * Update PolNtfyCrdcEpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolNtfyCrdcEpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolNtfyCrdcEpInd, polNtfyCrdcEpInd.length);
  }

  public void setPolNtfyCrdcEpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolNtfyCrdcEpInd, polNtfyCrdcEpInd.length);
  }

  /**
   * Update PolNtfyCrdcEpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolNtfyCrdcEpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolNtfyCrdcEpInd + targetIndex, targetLen);
  }

  /**
   * Update PolNtfyCrdcEpInd with another Field
   *
   * @param value
   */
  public void setPolNtfyCrdcEpInd(Field source) {
    replace(source, 0, source.length(), beginPolNtfyCrdcEpInd, POL_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update PolNtfyCrdcEpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolNtfyCrdcEpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolNtfyCrdcEpInd, POL_NTFY_CRDC_EP_IND_LEN);
  }

  /**
   * Update PolNtfyCrdcEpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolNtfyCrdcEpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolNtfyCrdcEpInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polOncPolPrtcpCd
   *
   * @return polOncPolPrtcpCd
   */
  public char[] getPolOncPolPrtcpCd() throws CFException {
    if (isPolOncPolPrtcpCdModified()) {
      polOncPolPrtcpCd = refreshPolOncPolPrtcpCd();
    }
    return polOncPolPrtcpCd;
  }

  /**
   * set variable polOncPolPrtcpCd Corresponding COBOL Variable is POL-ONC-POL-PRTCP-CD
   *
   * @param value
   */
  public void setPolOncPolPrtcpCd(char[] value) {
    polOncPolPrtcpCd = checkPolOncPolPrtcpCdConstraints(value);
    serializePolOncPolPrtcpCd(polOncPolPrtcpCd);
  }

  /**
   * Update PolOncPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolOncPolPrtcpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolOncPolPrtcpCd, polOncPolPrtcpCd.length);
  }

  public void setPolOncPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolOncPolPrtcpCd, polOncPolPrtcpCd.length);
  }

  /**
   * Update PolOncPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolOncPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolOncPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update PolOncPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setPolOncPolPrtcpCd(Field source) {
    replace(source, 0, source.length(), beginPolOncPolPrtcpCd, POL_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update PolOncPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolOncPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolOncPolPrtcpCd, POL_ONC_POL_PRTCP_CD_LEN);
  }

  /**
   * Update PolOncPolPrtcpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolOncPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolOncPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polEvdBasDialgInd
   *
   * @return polEvdBasDialgInd
   */
  public char[] getPolEvdBasDialgInd() throws CFException {
    if (isPolEvdBasDialgIndModified()) {
      polEvdBasDialgInd = refreshPolEvdBasDialgInd();
    }
    return polEvdBasDialgInd;
  }

  /**
   * set variable polEvdBasDialgInd Corresponding COBOL Variable is POL-EVD-BAS-DIALG-IND
   *
   * @param value
   */
  public void setPolEvdBasDialgInd(char[] value) {
    polEvdBasDialgInd = checkPolEvdBasDialgIndConstraints(value);
    serializePolEvdBasDialgInd(polEvdBasDialgInd);
  }

  /**
   * Update PolEvdBasDialgInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolEvdBasDialgInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolEvdBasDialgInd, polEvdBasDialgInd.length);
  }

  public void setPolEvdBasDialgInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolEvdBasDialgInd, polEvdBasDialgInd.length);
  }

  /**
   * Update PolEvdBasDialgInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolEvdBasDialgInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolEvdBasDialgInd + targetIndex, targetLen);
  }

  /**
   * Update PolEvdBasDialgInd with another Field
   *
   * @param value
   */
  public void setPolEvdBasDialgInd(Field source) {
    replace(source, 0, source.length(), beginPolEvdBasDialgInd, POL_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update PolEvdBasDialgInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolEvdBasDialgInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolEvdBasDialgInd, POL_EVD_BAS_DIALG_IND_LEN);
  }

  /**
   * Update PolEvdBasDialgInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolEvdBasDialgInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolEvdBasDialgInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polCoreMedPrrAuthCd
   *
   * @return polCoreMedPrrAuthCd
   */
  public char[] getPolCoreMedPrrAuthCd() throws CFException {
    if (isPolCoreMedPrrAuthCdModified()) {
      polCoreMedPrrAuthCd = refreshPolCoreMedPrrAuthCd();
    }
    return polCoreMedPrrAuthCd;
  }

  /**
   * set variable polCoreMedPrrAuthCd Corresponding COBOL Variable is POL-CORE-MED-PRR-AUTH-CD
   *
   * @param value
   */
  public void setPolCoreMedPrrAuthCd(char[] value) {
    polCoreMedPrrAuthCd = checkPolCoreMedPrrAuthCdConstraints(value);
    serializePolCoreMedPrrAuthCd(polCoreMedPrrAuthCd);
  }

  /**
   * Update PolCoreMedPrrAuthCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolCoreMedPrrAuthCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPolCoreMedPrrAuthCd, polCoreMedPrrAuthCd.length);
  }

  public void setPolCoreMedPrrAuthCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolCoreMedPrrAuthCd, polCoreMedPrrAuthCd.length);
  }

  /**
   * Update PolCoreMedPrrAuthCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolCoreMedPrrAuthCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolCoreMedPrrAuthCd + targetIndex, targetLen);
  }

  /**
   * Update PolCoreMedPrrAuthCd with another Field
   *
   * @param value
   */
  public void setPolCoreMedPrrAuthCd(Field source) {
    replace(source, 0, source.length(), beginPolCoreMedPrrAuthCd, POL_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update PolCoreMedPrrAuthCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolCoreMedPrrAuthCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolCoreMedPrrAuthCd, POL_CORE_MED_PRR_AUTH_CD_LEN);
  }

  /**
   * Update PolCoreMedPrrAuthCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolCoreMedPrrAuthCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolCoreMedPrrAuthCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRelSrvcInd
   *
   * @return polRelSrvcInd
   */
  public char[] getPolRelSrvcInd() throws CFException {
    if (isPolRelSrvcIndModified()) {
      polRelSrvcInd = refreshPolRelSrvcInd();
    }
    return polRelSrvcInd;
  }

  /**
   * set variable polRelSrvcInd Corresponding COBOL Variable is POL-REL-SRVC-IND
   *
   * @param value
   */
  public void setPolRelSrvcInd(char[] value) {
    polRelSrvcInd = checkPolRelSrvcIndConstraints(value);
    serializePolRelSrvcInd(polRelSrvcInd);
  }

  /**
   * Update PolRelSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRelSrvcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRelSrvcInd, polRelSrvcInd.length);
  }

  public void setPolRelSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRelSrvcInd, polRelSrvcInd.length);
  }

  /**
   * Update PolRelSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRelSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRelSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update PolRelSrvcInd with another Field
   *
   * @param value
   */
  public void setPolRelSrvcInd(Field source) {
    replace(source, 0, source.length(), beginPolRelSrvcInd, POL_REL_SRVC_IND_LEN);
  }

  /**
   * Update PolRelSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRelSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRelSrvcInd, POL_REL_SRVC_IND_LEN);
  }

  /**
   * Update PolRelSrvcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRelSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRelSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polGenPolPrtcpCd
   *
   * @return polGenPolPrtcpCd
   */
  public char[] getPolGenPolPrtcpCd() throws CFException {
    if (isPolGenPolPrtcpCdModified()) {
      polGenPolPrtcpCd = refreshPolGenPolPrtcpCd();
    }
    return polGenPolPrtcpCd;
  }

  /**
   * set variable polGenPolPrtcpCd Corresponding COBOL Variable is POL-GEN-POL-PRTCP-CD
   *
   * @param value
   */
  public void setPolGenPolPrtcpCd(char[] value) {
    polGenPolPrtcpCd = checkPolGenPolPrtcpCdConstraints(value);
    serializePolGenPolPrtcpCd(polGenPolPrtcpCd);
  }

  /**
   * Update PolGenPolPrtcpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolGenPolPrtcpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolGenPolPrtcpCd, polGenPolPrtcpCd.length);
  }

  public void setPolGenPolPrtcpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolGenPolPrtcpCd, polGenPolPrtcpCd.length);
  }

  /**
   * Update PolGenPolPrtcpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolGenPolPrtcpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolGenPolPrtcpCd + targetIndex, targetLen);
  }

  /**
   * Update PolGenPolPrtcpCd with another Field
   *
   * @param value
   */
  public void setPolGenPolPrtcpCd(Field source) {
    replace(source, 0, source.length(), beginPolGenPolPrtcpCd, POL_GEN_POL_PRTCP_CD_LEN);
  }

  /**
   * Update PolGenPolPrtcpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolGenPolPrtcpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolGenPolPrtcpCd, POL_GEN_POL_PRTCP_CD_LEN);
  }

  /**
   * Update PolGenPolPrtcpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolGenPolPrtcpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolGenPolPrtcpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polSecOpinVendCd
   *
   * @return polSecOpinVendCd
   */
  public char[] getPolSecOpinVendCd() throws CFException {
    if (isPolSecOpinVendCdModified()) {
      polSecOpinVendCd = refreshPolSecOpinVendCd();
    }
    return polSecOpinVendCd;
  }

  /**
   * set variable polSecOpinVendCd Corresponding COBOL Variable is POL-SEC-OPIN-VEND-CD
   *
   * @param value
   */
  public void setPolSecOpinVendCd(char[] value) {
    polSecOpinVendCd = checkPolSecOpinVendCdConstraints(value);
    serializePolSecOpinVendCd(polSecOpinVendCd);
  }

  /**
   * Update PolSecOpinVendCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolSecOpinVendCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolSecOpinVendCd, polSecOpinVendCd.length);
  }

  public void setPolSecOpinVendCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolSecOpinVendCd, polSecOpinVendCd.length);
  }

  /**
   * Update PolSecOpinVendCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolSecOpinVendCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolSecOpinVendCd + targetIndex, targetLen);
  }

  /**
   * Update PolSecOpinVendCd with another Field
   *
   * @param value
   */
  public void setPolSecOpinVendCd(Field source) {
    replace(source, 0, source.length(), beginPolSecOpinVendCd, POL_SEC_OPIN_VEND_CD_LEN);
  }

  /**
   * Update PolSecOpinVendCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolSecOpinVendCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolSecOpinVendCd, POL_SEC_OPIN_VEND_CD_LEN);
  }

  /**
   * Update PolSecOpinVendCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolSecOpinVendCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolSecOpinVendCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetBhvHlthVendCd
   *
   * @return polRetBhvHlthVendCd
   */
  public char[] getPolRetBhvHlthVendCd() throws CFException {
    if (isPolRetBhvHlthVendCdModified()) {
      polRetBhvHlthVendCd = refreshPolRetBhvHlthVendCd();
    }
    return polRetBhvHlthVendCd;
  }

  /**
   * set variable polRetBhvHlthVendCd Corresponding COBOL Variable is POL-RET-BHV-HLTH-VEND-CD
   *
   * @param value
   */
  public void setPolRetBhvHlthVendCd(char[] value) {
    polRetBhvHlthVendCd = checkPolRetBhvHlthVendCdConstraints(value);
    serializePolRetBhvHlthVendCd(polRetBhvHlthVendCd);
  }

  /**
   * Update PolRetBhvHlthVendCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetBhvHlthVendCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPolRetBhvHlthVendCd, polRetBhvHlthVendCd.length);
  }

  public void setPolRetBhvHlthVendCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetBhvHlthVendCd, polRetBhvHlthVendCd.length);
  }

  /**
   * Update PolRetBhvHlthVendCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetBhvHlthVendCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetBhvHlthVendCd + targetIndex, targetLen);
  }

  /**
   * Update PolRetBhvHlthVendCd with another Field
   *
   * @param value
   */
  public void setPolRetBhvHlthVendCd(Field source) {
    replace(source, 0, source.length(), beginPolRetBhvHlthVendCd, POL_RET_BHV_HLTH_VEND_CD_LEN);
  }

  /**
   * Update PolRetBhvHlthVendCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetBhvHlthVendCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetBhvHlthVendCd, POL_RET_BHV_HLTH_VEND_CD_LEN);
  }

  /**
   * Update PolRetBhvHlthVendCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetBhvHlthVendCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetBhvHlthVendCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot001
   *
   * @return polRetSlot001
   */
  public char[] getPolRetSlot001() throws CFException {
    if (isPolRetSlot001Modified()) {
      polRetSlot001 = refreshPolRetSlot001();
    }
    return polRetSlot001;
  }

  /**
   * set variable polRetSlot001 Corresponding COBOL Variable is POL-RET-SLOT-001
   *
   * @param value
   */
  public void setPolRetSlot001(char[] value) {
    polRetSlot001 = checkPolRetSlot001Constraints(value);
    serializePolRetSlot001(polRetSlot001);
  }

  /**
   * Update PolRetSlot001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot001, polRetSlot001.length);
  }

  public void setPolRetSlot001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot001, polRetSlot001.length);
  }

  /**
   * Update PolRetSlot001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot001 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot001 with another Field
   *
   * @param value
   */
  public void setPolRetSlot001(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot001, POL_RET_SLOT_001_LEN);
  }

  /**
   * Update PolRetSlot001 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot001, POL_RET_SLOT_001_LEN);
  }

  /**
   * Update PolRetSlot001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff001
   *
   * @return polRetEff001
   */
  public char[] getPolRetEff001() throws CFException {
    if (isPolRetEff001Modified()) {
      polRetEff001 = refreshPolRetEff001();
    }
    return polRetEff001;
  }

  /**
   * set variable polRetEff001 Corresponding COBOL Variable is POL-RET-EFF-001
   *
   * @param value
   */
  public void setPolRetEff001(char[] value) {
    polRetEff001 = checkPolRetEff001Constraints(value);
    serializePolRetEff001(polRetEff001);
  }

  /**
   * Update PolRetEff001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff001, polRetEff001.length);
  }

  public void setPolRetEff001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff001, polRetEff001.length);
  }

  /**
   * Update PolRetEff001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff001 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff001 with another Field
   *
   * @param value
   */
  public void setPolRetEff001(Field source) {
    replace(source, 0, source.length(), beginPolRetEff001, POL_RET_EFF_001_LEN);
  }

  /**
   * Update PolRetEff001 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff001, POL_RET_EFF_001_LEN);
  }

  /**
   * Update PolRetEff001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc001
   *
   * @return polRetCanc001
   */
  public char[] getPolRetCanc001() throws CFException {
    if (isPolRetCanc001Modified()) {
      polRetCanc001 = refreshPolRetCanc001();
    }
    return polRetCanc001;
  }

  /**
   * set variable polRetCanc001 Corresponding COBOL Variable is POL-RET-CANC-001
   *
   * @param value
   */
  public void setPolRetCanc001(char[] value) {
    polRetCanc001 = checkPolRetCanc001Constraints(value);
    serializePolRetCanc001(polRetCanc001);
  }

  /**
   * Update PolRetCanc001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc001, polRetCanc001.length);
  }

  public void setPolRetCanc001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc001, polRetCanc001.length);
  }

  /**
   * Update PolRetCanc001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc001 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc001 with another Field
   *
   * @param value
   */
  public void setPolRetCanc001(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc001, POL_RET_CANC_001_LEN);
  }

  /**
   * Update PolRetCanc001 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc001, POL_RET_CANC_001_LEN);
  }

  /**
   * Update PolRetCanc001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot002
   *
   * @return polRetSlot002
   */
  public char[] getPolRetSlot002() throws CFException {
    if (isPolRetSlot002Modified()) {
      polRetSlot002 = refreshPolRetSlot002();
    }
    return polRetSlot002;
  }

  /**
   * set variable polRetSlot002 Corresponding COBOL Variable is POL-RET-SLOT-002
   *
   * @param value
   */
  public void setPolRetSlot002(char[] value) {
    polRetSlot002 = checkPolRetSlot002Constraints(value);
    serializePolRetSlot002(polRetSlot002);
  }

  /**
   * Update PolRetSlot002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot002, polRetSlot002.length);
  }

  public void setPolRetSlot002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot002, polRetSlot002.length);
  }

  /**
   * Update PolRetSlot002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot002 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot002 with another Field
   *
   * @param value
   */
  public void setPolRetSlot002(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot002, POL_RET_SLOT_002_LEN);
  }

  /**
   * Update PolRetSlot002 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot002, POL_RET_SLOT_002_LEN);
  }

  /**
   * Update PolRetSlot002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff002
   *
   * @return polRetEff002
   */
  public char[] getPolRetEff002() throws CFException {
    if (isPolRetEff002Modified()) {
      polRetEff002 = refreshPolRetEff002();
    }
    return polRetEff002;
  }

  /**
   * set variable polRetEff002 Corresponding COBOL Variable is POL-RET-EFF-002
   *
   * @param value
   */
  public void setPolRetEff002(char[] value) {
    polRetEff002 = checkPolRetEff002Constraints(value);
    serializePolRetEff002(polRetEff002);
  }

  /**
   * Update PolRetEff002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff002, polRetEff002.length);
  }

  public void setPolRetEff002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff002, polRetEff002.length);
  }

  /**
   * Update PolRetEff002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff002 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff002 with another Field
   *
   * @param value
   */
  public void setPolRetEff002(Field source) {
    replace(source, 0, source.length(), beginPolRetEff002, POL_RET_EFF_002_LEN);
  }

  /**
   * Update PolRetEff002 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff002, POL_RET_EFF_002_LEN);
  }

  /**
   * Update PolRetEff002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc002
   *
   * @return polRetCanc002
   */
  public char[] getPolRetCanc002() throws CFException {
    if (isPolRetCanc002Modified()) {
      polRetCanc002 = refreshPolRetCanc002();
    }
    return polRetCanc002;
  }

  /**
   * set variable polRetCanc002 Corresponding COBOL Variable is POL-RET-CANC-002
   *
   * @param value
   */
  public void setPolRetCanc002(char[] value) {
    polRetCanc002 = checkPolRetCanc002Constraints(value);
    serializePolRetCanc002(polRetCanc002);
  }

  /**
   * Update PolRetCanc002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc002, polRetCanc002.length);
  }

  public void setPolRetCanc002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc002, polRetCanc002.length);
  }

  /**
   * Update PolRetCanc002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc002 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc002 with another Field
   *
   * @param value
   */
  public void setPolRetCanc002(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc002, POL_RET_CANC_002_LEN);
  }

  /**
   * Update PolRetCanc002 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc002, POL_RET_CANC_002_LEN);
  }

  /**
   * Update PolRetCanc002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot003
   *
   * @return polRetSlot003
   */
  public char[] getPolRetSlot003() throws CFException {
    if (isPolRetSlot003Modified()) {
      polRetSlot003 = refreshPolRetSlot003();
    }
    return polRetSlot003;
  }

  /**
   * set variable polRetSlot003 Corresponding COBOL Variable is POL-RET-SLOT-003
   *
   * @param value
   */
  public void setPolRetSlot003(char[] value) {
    polRetSlot003 = checkPolRetSlot003Constraints(value);
    serializePolRetSlot003(polRetSlot003);
  }

  /**
   * Update PolRetSlot003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot003, polRetSlot003.length);
  }

  public void setPolRetSlot003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot003, polRetSlot003.length);
  }

  /**
   * Update PolRetSlot003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot003 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot003 with another Field
   *
   * @param value
   */
  public void setPolRetSlot003(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot003, POL_RET_SLOT_003_LEN);
  }

  /**
   * Update PolRetSlot003 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot003, POL_RET_SLOT_003_LEN);
  }

  /**
   * Update PolRetSlot003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff003
   *
   * @return polRetEff003
   */
  public char[] getPolRetEff003() throws CFException {
    if (isPolRetEff003Modified()) {
      polRetEff003 = refreshPolRetEff003();
    }
    return polRetEff003;
  }

  /**
   * set variable polRetEff003 Corresponding COBOL Variable is POL-RET-EFF-003
   *
   * @param value
   */
  public void setPolRetEff003(char[] value) {
    polRetEff003 = checkPolRetEff003Constraints(value);
    serializePolRetEff003(polRetEff003);
  }

  /**
   * Update PolRetEff003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff003, polRetEff003.length);
  }

  public void setPolRetEff003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff003, polRetEff003.length);
  }

  /**
   * Update PolRetEff003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff003 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff003 with another Field
   *
   * @param value
   */
  public void setPolRetEff003(Field source) {
    replace(source, 0, source.length(), beginPolRetEff003, POL_RET_EFF_003_LEN);
  }

  /**
   * Update PolRetEff003 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff003, POL_RET_EFF_003_LEN);
  }

  /**
   * Update PolRetEff003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc003
   *
   * @return polRetCanc003
   */
  public char[] getPolRetCanc003() throws CFException {
    if (isPolRetCanc003Modified()) {
      polRetCanc003 = refreshPolRetCanc003();
    }
    return polRetCanc003;
  }

  /**
   * set variable polRetCanc003 Corresponding COBOL Variable is POL-RET-CANC-003
   *
   * @param value
   */
  public void setPolRetCanc003(char[] value) {
    polRetCanc003 = checkPolRetCanc003Constraints(value);
    serializePolRetCanc003(polRetCanc003);
  }

  /**
   * Update PolRetCanc003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc003, polRetCanc003.length);
  }

  public void setPolRetCanc003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc003, polRetCanc003.length);
  }

  /**
   * Update PolRetCanc003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc003 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc003 with another Field
   *
   * @param value
   */
  public void setPolRetCanc003(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc003, POL_RET_CANC_003_LEN);
  }

  /**
   * Update PolRetCanc003 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc003, POL_RET_CANC_003_LEN);
  }

  /**
   * Update PolRetCanc003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot004
   *
   * @return polRetSlot004
   */
  public char[] getPolRetSlot004() throws CFException {
    if (isPolRetSlot004Modified()) {
      polRetSlot004 = refreshPolRetSlot004();
    }
    return polRetSlot004;
  }

  /**
   * set variable polRetSlot004 Corresponding COBOL Variable is POL-RET-SLOT-004
   *
   * @param value
   */
  public void setPolRetSlot004(char[] value) {
    polRetSlot004 = checkPolRetSlot004Constraints(value);
    serializePolRetSlot004(polRetSlot004);
  }

  /**
   * Update PolRetSlot004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot004, polRetSlot004.length);
  }

  public void setPolRetSlot004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot004, polRetSlot004.length);
  }

  /**
   * Update PolRetSlot004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot004 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot004 with another Field
   *
   * @param value
   */
  public void setPolRetSlot004(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot004, POL_RET_SLOT_004_LEN);
  }

  /**
   * Update PolRetSlot004 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot004, POL_RET_SLOT_004_LEN);
  }

  /**
   * Update PolRetSlot004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff004
   *
   * @return polRetEff004
   */
  public char[] getPolRetEff004() throws CFException {
    if (isPolRetEff004Modified()) {
      polRetEff004 = refreshPolRetEff004();
    }
    return polRetEff004;
  }

  /**
   * set variable polRetEff004 Corresponding COBOL Variable is POL-RET-EFF-004
   *
   * @param value
   */
  public void setPolRetEff004(char[] value) {
    polRetEff004 = checkPolRetEff004Constraints(value);
    serializePolRetEff004(polRetEff004);
  }

  /**
   * Update PolRetEff004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff004, polRetEff004.length);
  }

  public void setPolRetEff004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff004, polRetEff004.length);
  }

  /**
   * Update PolRetEff004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff004 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff004 with another Field
   *
   * @param value
   */
  public void setPolRetEff004(Field source) {
    replace(source, 0, source.length(), beginPolRetEff004, POL_RET_EFF_004_LEN);
  }

  /**
   * Update PolRetEff004 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff004, POL_RET_EFF_004_LEN);
  }

  /**
   * Update PolRetEff004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc004
   *
   * @return polRetCanc004
   */
  public char[] getPolRetCanc004() throws CFException {
    if (isPolRetCanc004Modified()) {
      polRetCanc004 = refreshPolRetCanc004();
    }
    return polRetCanc004;
  }

  /**
   * set variable polRetCanc004 Corresponding COBOL Variable is POL-RET-CANC-004
   *
   * @param value
   */
  public void setPolRetCanc004(char[] value) {
    polRetCanc004 = checkPolRetCanc004Constraints(value);
    serializePolRetCanc004(polRetCanc004);
  }

  /**
   * Update PolRetCanc004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc004, polRetCanc004.length);
  }

  public void setPolRetCanc004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc004, polRetCanc004.length);
  }

  /**
   * Update PolRetCanc004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc004 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc004 with another Field
   *
   * @param value
   */
  public void setPolRetCanc004(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc004, POL_RET_CANC_004_LEN);
  }

  /**
   * Update PolRetCanc004 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc004, POL_RET_CANC_004_LEN);
  }

  /**
   * Update PolRetCanc004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot005
   *
   * @return polRetSlot005
   */
  public char[] getPolRetSlot005() throws CFException {
    if (isPolRetSlot005Modified()) {
      polRetSlot005 = refreshPolRetSlot005();
    }
    return polRetSlot005;
  }

  /**
   * set variable polRetSlot005 Corresponding COBOL Variable is POL-RET-SLOT-005
   *
   * @param value
   */
  public void setPolRetSlot005(char[] value) {
    polRetSlot005 = checkPolRetSlot005Constraints(value);
    serializePolRetSlot005(polRetSlot005);
  }

  /**
   * Update PolRetSlot005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot005, polRetSlot005.length);
  }

  public void setPolRetSlot005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot005, polRetSlot005.length);
  }

  /**
   * Update PolRetSlot005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot005 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot005 with another Field
   *
   * @param value
   */
  public void setPolRetSlot005(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot005, POL_RET_SLOT_005_LEN);
  }

  /**
   * Update PolRetSlot005 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot005, POL_RET_SLOT_005_LEN);
  }

  /**
   * Update PolRetSlot005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff005
   *
   * @return polRetEff005
   */
  public char[] getPolRetEff005() throws CFException {
    if (isPolRetEff005Modified()) {
      polRetEff005 = refreshPolRetEff005();
    }
    return polRetEff005;
  }

  /**
   * set variable polRetEff005 Corresponding COBOL Variable is POL-RET-EFF-005
   *
   * @param value
   */
  public void setPolRetEff005(char[] value) {
    polRetEff005 = checkPolRetEff005Constraints(value);
    serializePolRetEff005(polRetEff005);
  }

  /**
   * Update PolRetEff005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff005, polRetEff005.length);
  }

  public void setPolRetEff005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff005, polRetEff005.length);
  }

  /**
   * Update PolRetEff005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff005 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff005 with another Field
   *
   * @param value
   */
  public void setPolRetEff005(Field source) {
    replace(source, 0, source.length(), beginPolRetEff005, POL_RET_EFF_005_LEN);
  }

  /**
   * Update PolRetEff005 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff005, POL_RET_EFF_005_LEN);
  }

  /**
   * Update PolRetEff005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc005
   *
   * @return polRetCanc005
   */
  public char[] getPolRetCanc005() throws CFException {
    if (isPolRetCanc005Modified()) {
      polRetCanc005 = refreshPolRetCanc005();
    }
    return polRetCanc005;
  }

  /**
   * set variable polRetCanc005 Corresponding COBOL Variable is POL-RET-CANC-005
   *
   * @param value
   */
  public void setPolRetCanc005(char[] value) {
    polRetCanc005 = checkPolRetCanc005Constraints(value);
    serializePolRetCanc005(polRetCanc005);
  }

  /**
   * Update PolRetCanc005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc005, polRetCanc005.length);
  }

  public void setPolRetCanc005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc005, polRetCanc005.length);
  }

  /**
   * Update PolRetCanc005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc005 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc005 with another Field
   *
   * @param value
   */
  public void setPolRetCanc005(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc005, POL_RET_CANC_005_LEN);
  }

  /**
   * Update PolRetCanc005 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc005, POL_RET_CANC_005_LEN);
  }

  /**
   * Update PolRetCanc005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot006
   *
   * @return polRetSlot006
   */
  public char[] getPolRetSlot006() throws CFException {
    if (isPolRetSlot006Modified()) {
      polRetSlot006 = refreshPolRetSlot006();
    }
    return polRetSlot006;
  }

  /**
   * set variable polRetSlot006 Corresponding COBOL Variable is POL-RET-SLOT-006
   *
   * @param value
   */
  public void setPolRetSlot006(char[] value) {
    polRetSlot006 = checkPolRetSlot006Constraints(value);
    serializePolRetSlot006(polRetSlot006);
  }

  /**
   * Update PolRetSlot006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot006, polRetSlot006.length);
  }

  public void setPolRetSlot006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot006, polRetSlot006.length);
  }

  /**
   * Update PolRetSlot006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot006 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot006 with another Field
   *
   * @param value
   */
  public void setPolRetSlot006(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot006, POL_RET_SLOT_006_LEN);
  }

  /**
   * Update PolRetSlot006 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot006, POL_RET_SLOT_006_LEN);
  }

  /**
   * Update PolRetSlot006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff006
   *
   * @return polRetEff006
   */
  public char[] getPolRetEff006() throws CFException {
    if (isPolRetEff006Modified()) {
      polRetEff006 = refreshPolRetEff006();
    }
    return polRetEff006;
  }

  /**
   * set variable polRetEff006 Corresponding COBOL Variable is POL-RET-EFF-006
   *
   * @param value
   */
  public void setPolRetEff006(char[] value) {
    polRetEff006 = checkPolRetEff006Constraints(value);
    serializePolRetEff006(polRetEff006);
  }

  /**
   * Update PolRetEff006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff006, polRetEff006.length);
  }

  public void setPolRetEff006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff006, polRetEff006.length);
  }

  /**
   * Update PolRetEff006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff006 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff006 with another Field
   *
   * @param value
   */
  public void setPolRetEff006(Field source) {
    replace(source, 0, source.length(), beginPolRetEff006, POL_RET_EFF_006_LEN);
  }

  /**
   * Update PolRetEff006 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff006, POL_RET_EFF_006_LEN);
  }

  /**
   * Update PolRetEff006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc006
   *
   * @return polRetCanc006
   */
  public char[] getPolRetCanc006() throws CFException {
    if (isPolRetCanc006Modified()) {
      polRetCanc006 = refreshPolRetCanc006();
    }
    return polRetCanc006;
  }

  /**
   * set variable polRetCanc006 Corresponding COBOL Variable is POL-RET-CANC-006
   *
   * @param value
   */
  public void setPolRetCanc006(char[] value) {
    polRetCanc006 = checkPolRetCanc006Constraints(value);
    serializePolRetCanc006(polRetCanc006);
  }

  /**
   * Update PolRetCanc006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc006, polRetCanc006.length);
  }

  public void setPolRetCanc006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc006, polRetCanc006.length);
  }

  /**
   * Update PolRetCanc006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc006 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc006 with another Field
   *
   * @param value
   */
  public void setPolRetCanc006(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc006, POL_RET_CANC_006_LEN);
  }

  /**
   * Update PolRetCanc006 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc006, POL_RET_CANC_006_LEN);
  }

  /**
   * Update PolRetCanc006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot007
   *
   * @return polRetSlot007
   */
  public char[] getPolRetSlot007() throws CFException {
    if (isPolRetSlot007Modified()) {
      polRetSlot007 = refreshPolRetSlot007();
    }
    return polRetSlot007;
  }

  /**
   * set variable polRetSlot007 Corresponding COBOL Variable is POL-RET-SLOT-007
   *
   * @param value
   */
  public void setPolRetSlot007(char[] value) {
    polRetSlot007 = checkPolRetSlot007Constraints(value);
    serializePolRetSlot007(polRetSlot007);
  }

  /**
   * Update PolRetSlot007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot007, polRetSlot007.length);
  }

  public void setPolRetSlot007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot007, polRetSlot007.length);
  }

  /**
   * Update PolRetSlot007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot007 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot007 with another Field
   *
   * @param value
   */
  public void setPolRetSlot007(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot007, POL_RET_SLOT_007_LEN);
  }

  /**
   * Update PolRetSlot007 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot007, POL_RET_SLOT_007_LEN);
  }

  /**
   * Update PolRetSlot007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff007
   *
   * @return polRetEff007
   */
  public char[] getPolRetEff007() throws CFException {
    if (isPolRetEff007Modified()) {
      polRetEff007 = refreshPolRetEff007();
    }
    return polRetEff007;
  }

  /**
   * set variable polRetEff007 Corresponding COBOL Variable is POL-RET-EFF-007
   *
   * @param value
   */
  public void setPolRetEff007(char[] value) {
    polRetEff007 = checkPolRetEff007Constraints(value);
    serializePolRetEff007(polRetEff007);
  }

  /**
   * Update PolRetEff007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff007, polRetEff007.length);
  }

  public void setPolRetEff007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff007, polRetEff007.length);
  }

  /**
   * Update PolRetEff007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff007 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff007 with another Field
   *
   * @param value
   */
  public void setPolRetEff007(Field source) {
    replace(source, 0, source.length(), beginPolRetEff007, POL_RET_EFF_007_LEN);
  }

  /**
   * Update PolRetEff007 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff007, POL_RET_EFF_007_LEN);
  }

  /**
   * Update PolRetEff007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc007
   *
   * @return polRetCanc007
   */
  public char[] getPolRetCanc007() throws CFException {
    if (isPolRetCanc007Modified()) {
      polRetCanc007 = refreshPolRetCanc007();
    }
    return polRetCanc007;
  }

  /**
   * set variable polRetCanc007 Corresponding COBOL Variable is POL-RET-CANC-007
   *
   * @param value
   */
  public void setPolRetCanc007(char[] value) {
    polRetCanc007 = checkPolRetCanc007Constraints(value);
    serializePolRetCanc007(polRetCanc007);
  }

  /**
   * Update PolRetCanc007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc007, polRetCanc007.length);
  }

  public void setPolRetCanc007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc007, polRetCanc007.length);
  }

  /**
   * Update PolRetCanc007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc007 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc007 with another Field
   *
   * @param value
   */
  public void setPolRetCanc007(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc007, POL_RET_CANC_007_LEN);
  }

  /**
   * Update PolRetCanc007 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc007, POL_RET_CANC_007_LEN);
  }

  /**
   * Update PolRetCanc007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot008
   *
   * @return polRetSlot008
   */
  public char[] getPolRetSlot008() throws CFException {
    if (isPolRetSlot008Modified()) {
      polRetSlot008 = refreshPolRetSlot008();
    }
    return polRetSlot008;
  }

  /**
   * set variable polRetSlot008 Corresponding COBOL Variable is POL-RET-SLOT-008
   *
   * @param value
   */
  public void setPolRetSlot008(char[] value) {
    polRetSlot008 = checkPolRetSlot008Constraints(value);
    serializePolRetSlot008(polRetSlot008);
  }

  /**
   * Update PolRetSlot008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot008, polRetSlot008.length);
  }

  public void setPolRetSlot008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot008, polRetSlot008.length);
  }

  /**
   * Update PolRetSlot008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot008 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot008 with another Field
   *
   * @param value
   */
  public void setPolRetSlot008(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot008, POL_RET_SLOT_008_LEN);
  }

  /**
   * Update PolRetSlot008 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot008, POL_RET_SLOT_008_LEN);
  }

  /**
   * Update PolRetSlot008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff008
   *
   * @return polRetEff008
   */
  public char[] getPolRetEff008() throws CFException {
    if (isPolRetEff008Modified()) {
      polRetEff008 = refreshPolRetEff008();
    }
    return polRetEff008;
  }

  /**
   * set variable polRetEff008 Corresponding COBOL Variable is POL-RET-EFF-008
   *
   * @param value
   */
  public void setPolRetEff008(char[] value) {
    polRetEff008 = checkPolRetEff008Constraints(value);
    serializePolRetEff008(polRetEff008);
  }

  /**
   * Update PolRetEff008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff008, polRetEff008.length);
  }

  public void setPolRetEff008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff008, polRetEff008.length);
  }

  /**
   * Update PolRetEff008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff008 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff008 with another Field
   *
   * @param value
   */
  public void setPolRetEff008(Field source) {
    replace(source, 0, source.length(), beginPolRetEff008, POL_RET_EFF_008_LEN);
  }

  /**
   * Update PolRetEff008 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff008, POL_RET_EFF_008_LEN);
  }

  /**
   * Update PolRetEff008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc008
   *
   * @return polRetCanc008
   */
  public char[] getPolRetCanc008() throws CFException {
    if (isPolRetCanc008Modified()) {
      polRetCanc008 = refreshPolRetCanc008();
    }
    return polRetCanc008;
  }

  /**
   * set variable polRetCanc008 Corresponding COBOL Variable is POL-RET-CANC-008
   *
   * @param value
   */
  public void setPolRetCanc008(char[] value) {
    polRetCanc008 = checkPolRetCanc008Constraints(value);
    serializePolRetCanc008(polRetCanc008);
  }

  /**
   * Update PolRetCanc008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc008, polRetCanc008.length);
  }

  public void setPolRetCanc008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc008, polRetCanc008.length);
  }

  /**
   * Update PolRetCanc008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc008 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc008 with another Field
   *
   * @param value
   */
  public void setPolRetCanc008(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc008, POL_RET_CANC_008_LEN);
  }

  /**
   * Update PolRetCanc008 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc008, POL_RET_CANC_008_LEN);
  }

  /**
   * Update PolRetCanc008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot009
   *
   * @return polRetSlot009
   */
  public char[] getPolRetSlot009() throws CFException {
    if (isPolRetSlot009Modified()) {
      polRetSlot009 = refreshPolRetSlot009();
    }
    return polRetSlot009;
  }

  /**
   * set variable polRetSlot009 Corresponding COBOL Variable is POL-RET-SLOT-009
   *
   * @param value
   */
  public void setPolRetSlot009(char[] value) {
    polRetSlot009 = checkPolRetSlot009Constraints(value);
    serializePolRetSlot009(polRetSlot009);
  }

  /**
   * Update PolRetSlot009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot009, polRetSlot009.length);
  }

  public void setPolRetSlot009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot009, polRetSlot009.length);
  }

  /**
   * Update PolRetSlot009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot009 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot009 with another Field
   *
   * @param value
   */
  public void setPolRetSlot009(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot009, POL_RET_SLOT_009_LEN);
  }

  /**
   * Update PolRetSlot009 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot009, POL_RET_SLOT_009_LEN);
  }

  /**
   * Update PolRetSlot009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff009
   *
   * @return polRetEff009
   */
  public char[] getPolRetEff009() throws CFException {
    if (isPolRetEff009Modified()) {
      polRetEff009 = refreshPolRetEff009();
    }
    return polRetEff009;
  }

  /**
   * set variable polRetEff009 Corresponding COBOL Variable is POL-RET-EFF-009
   *
   * @param value
   */
  public void setPolRetEff009(char[] value) {
    polRetEff009 = checkPolRetEff009Constraints(value);
    serializePolRetEff009(polRetEff009);
  }

  /**
   * Update PolRetEff009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff009, polRetEff009.length);
  }

  public void setPolRetEff009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff009, polRetEff009.length);
  }

  /**
   * Update PolRetEff009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff009 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff009 with another Field
   *
   * @param value
   */
  public void setPolRetEff009(Field source) {
    replace(source, 0, source.length(), beginPolRetEff009, POL_RET_EFF_009_LEN);
  }

  /**
   * Update PolRetEff009 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff009, POL_RET_EFF_009_LEN);
  }

  /**
   * Update PolRetEff009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc009
   *
   * @return polRetCanc009
   */
  public char[] getPolRetCanc009() throws CFException {
    if (isPolRetCanc009Modified()) {
      polRetCanc009 = refreshPolRetCanc009();
    }
    return polRetCanc009;
  }

  /**
   * set variable polRetCanc009 Corresponding COBOL Variable is POL-RET-CANC-009
   *
   * @param value
   */
  public void setPolRetCanc009(char[] value) {
    polRetCanc009 = checkPolRetCanc009Constraints(value);
    serializePolRetCanc009(polRetCanc009);
  }

  /**
   * Update PolRetCanc009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc009, polRetCanc009.length);
  }

  public void setPolRetCanc009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc009, polRetCanc009.length);
  }

  /**
   * Update PolRetCanc009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc009 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc009 with another Field
   *
   * @param value
   */
  public void setPolRetCanc009(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc009, POL_RET_CANC_009_LEN);
  }

  /**
   * Update PolRetCanc009 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc009, POL_RET_CANC_009_LEN);
  }

  /**
   * Update PolRetCanc009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot010
   *
   * @return polRetSlot010
   */
  public char[] getPolRetSlot010() throws CFException {
    if (isPolRetSlot010Modified()) {
      polRetSlot010 = refreshPolRetSlot010();
    }
    return polRetSlot010;
  }

  /**
   * set variable polRetSlot010 Corresponding COBOL Variable is POL-RET-SLOT-010
   *
   * @param value
   */
  public void setPolRetSlot010(char[] value) {
    polRetSlot010 = checkPolRetSlot010Constraints(value);
    serializePolRetSlot010(polRetSlot010);
  }

  /**
   * Update PolRetSlot010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot010, polRetSlot010.length);
  }

  public void setPolRetSlot010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot010, polRetSlot010.length);
  }

  /**
   * Update PolRetSlot010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot010 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot010 with another Field
   *
   * @param value
   */
  public void setPolRetSlot010(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot010, POL_RET_SLOT_010_LEN);
  }

  /**
   * Update PolRetSlot010 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot010, POL_RET_SLOT_010_LEN);
  }

  /**
   * Update PolRetSlot010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff010
   *
   * @return polRetEff010
   */
  public char[] getPolRetEff010() throws CFException {
    if (isPolRetEff010Modified()) {
      polRetEff010 = refreshPolRetEff010();
    }
    return polRetEff010;
  }

  /**
   * set variable polRetEff010 Corresponding COBOL Variable is POL-RET-EFF-010
   *
   * @param value
   */
  public void setPolRetEff010(char[] value) {
    polRetEff010 = checkPolRetEff010Constraints(value);
    serializePolRetEff010(polRetEff010);
  }

  /**
   * Update PolRetEff010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff010, polRetEff010.length);
  }

  public void setPolRetEff010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff010, polRetEff010.length);
  }

  /**
   * Update PolRetEff010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff010 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff010 with another Field
   *
   * @param value
   */
  public void setPolRetEff010(Field source) {
    replace(source, 0, source.length(), beginPolRetEff010, POL_RET_EFF_010_LEN);
  }

  /**
   * Update PolRetEff010 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff010, POL_RET_EFF_010_LEN);
  }

  /**
   * Update PolRetEff010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc010
   *
   * @return polRetCanc010
   */
  public char[] getPolRetCanc010() throws CFException {
    if (isPolRetCanc010Modified()) {
      polRetCanc010 = refreshPolRetCanc010();
    }
    return polRetCanc010;
  }

  /**
   * set variable polRetCanc010 Corresponding COBOL Variable is POL-RET-CANC-010
   *
   * @param value
   */
  public void setPolRetCanc010(char[] value) {
    polRetCanc010 = checkPolRetCanc010Constraints(value);
    serializePolRetCanc010(polRetCanc010);
  }

  /**
   * Update PolRetCanc010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc010, polRetCanc010.length);
  }

  public void setPolRetCanc010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc010, polRetCanc010.length);
  }

  /**
   * Update PolRetCanc010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc010 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc010 with another Field
   *
   * @param value
   */
  public void setPolRetCanc010(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc010, POL_RET_CANC_010_LEN);
  }

  /**
   * Update PolRetCanc010 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc010, POL_RET_CANC_010_LEN);
  }

  /**
   * Update PolRetCanc010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot011
   *
   * @return polRetSlot011
   */
  public char[] getPolRetSlot011() throws CFException {
    if (isPolRetSlot011Modified()) {
      polRetSlot011 = refreshPolRetSlot011();
    }
    return polRetSlot011;
  }

  /**
   * set variable polRetSlot011 Corresponding COBOL Variable is POL-RET-SLOT-011
   *
   * @param value
   */
  public void setPolRetSlot011(char[] value) {
    polRetSlot011 = checkPolRetSlot011Constraints(value);
    serializePolRetSlot011(polRetSlot011);
  }

  /**
   * Update PolRetSlot011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot011, polRetSlot011.length);
  }

  public void setPolRetSlot011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot011, polRetSlot011.length);
  }

  /**
   * Update PolRetSlot011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot011 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot011 with another Field
   *
   * @param value
   */
  public void setPolRetSlot011(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot011, POL_RET_SLOT_011_LEN);
  }

  /**
   * Update PolRetSlot011 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot011, POL_RET_SLOT_011_LEN);
  }

  /**
   * Update PolRetSlot011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff011
   *
   * @return polRetEff011
   */
  public char[] getPolRetEff011() throws CFException {
    if (isPolRetEff011Modified()) {
      polRetEff011 = refreshPolRetEff011();
    }
    return polRetEff011;
  }

  /**
   * set variable polRetEff011 Corresponding COBOL Variable is POL-RET-EFF-011
   *
   * @param value
   */
  public void setPolRetEff011(char[] value) {
    polRetEff011 = checkPolRetEff011Constraints(value);
    serializePolRetEff011(polRetEff011);
  }

  /**
   * Update PolRetEff011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff011, polRetEff011.length);
  }

  public void setPolRetEff011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff011, polRetEff011.length);
  }

  /**
   * Update PolRetEff011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff011 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff011 with another Field
   *
   * @param value
   */
  public void setPolRetEff011(Field source) {
    replace(source, 0, source.length(), beginPolRetEff011, POL_RET_EFF_011_LEN);
  }

  /**
   * Update PolRetEff011 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff011, POL_RET_EFF_011_LEN);
  }

  /**
   * Update PolRetEff011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc011
   *
   * @return polRetCanc011
   */
  public char[] getPolRetCanc011() throws CFException {
    if (isPolRetCanc011Modified()) {
      polRetCanc011 = refreshPolRetCanc011();
    }
    return polRetCanc011;
  }

  /**
   * set variable polRetCanc011 Corresponding COBOL Variable is POL-RET-CANC-011
   *
   * @param value
   */
  public void setPolRetCanc011(char[] value) {
    polRetCanc011 = checkPolRetCanc011Constraints(value);
    serializePolRetCanc011(polRetCanc011);
  }

  /**
   * Update PolRetCanc011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc011, polRetCanc011.length);
  }

  public void setPolRetCanc011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc011, polRetCanc011.length);
  }

  /**
   * Update PolRetCanc011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc011 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc011 with another Field
   *
   * @param value
   */
  public void setPolRetCanc011(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc011, POL_RET_CANC_011_LEN);
  }

  /**
   * Update PolRetCanc011 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc011, POL_RET_CANC_011_LEN);
  }

  /**
   * Update PolRetCanc011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot012
   *
   * @return polRetSlot012
   */
  public char[] getPolRetSlot012() throws CFException {
    if (isPolRetSlot012Modified()) {
      polRetSlot012 = refreshPolRetSlot012();
    }
    return polRetSlot012;
  }

  /**
   * set variable polRetSlot012 Corresponding COBOL Variable is POL-RET-SLOT-012
   *
   * @param value
   */
  public void setPolRetSlot012(char[] value) {
    polRetSlot012 = checkPolRetSlot012Constraints(value);
    serializePolRetSlot012(polRetSlot012);
  }

  /**
   * Update PolRetSlot012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot012, polRetSlot012.length);
  }

  public void setPolRetSlot012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot012, polRetSlot012.length);
  }

  /**
   * Update PolRetSlot012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot012 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot012 with another Field
   *
   * @param value
   */
  public void setPolRetSlot012(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot012, POL_RET_SLOT_012_LEN);
  }

  /**
   * Update PolRetSlot012 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot012, POL_RET_SLOT_012_LEN);
  }

  /**
   * Update PolRetSlot012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff012
   *
   * @return polRetEff012
   */
  public char[] getPolRetEff012() throws CFException {
    if (isPolRetEff012Modified()) {
      polRetEff012 = refreshPolRetEff012();
    }
    return polRetEff012;
  }

  /**
   * set variable polRetEff012 Corresponding COBOL Variable is POL-RET-EFF-012
   *
   * @param value
   */
  public void setPolRetEff012(char[] value) {
    polRetEff012 = checkPolRetEff012Constraints(value);
    serializePolRetEff012(polRetEff012);
  }

  /**
   * Update PolRetEff012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff012, polRetEff012.length);
  }

  public void setPolRetEff012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff012, polRetEff012.length);
  }

  /**
   * Update PolRetEff012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff012 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff012 with another Field
   *
   * @param value
   */
  public void setPolRetEff012(Field source) {
    replace(source, 0, source.length(), beginPolRetEff012, POL_RET_EFF_012_LEN);
  }

  /**
   * Update PolRetEff012 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff012, POL_RET_EFF_012_LEN);
  }

  /**
   * Update PolRetEff012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc012
   *
   * @return polRetCanc012
   */
  public char[] getPolRetCanc012() throws CFException {
    if (isPolRetCanc012Modified()) {
      polRetCanc012 = refreshPolRetCanc012();
    }
    return polRetCanc012;
  }

  /**
   * set variable polRetCanc012 Corresponding COBOL Variable is POL-RET-CANC-012
   *
   * @param value
   */
  public void setPolRetCanc012(char[] value) {
    polRetCanc012 = checkPolRetCanc012Constraints(value);
    serializePolRetCanc012(polRetCanc012);
  }

  /**
   * Update PolRetCanc012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc012, polRetCanc012.length);
  }

  public void setPolRetCanc012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc012, polRetCanc012.length);
  }

  /**
   * Update PolRetCanc012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc012 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc012 with another Field
   *
   * @param value
   */
  public void setPolRetCanc012(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc012, POL_RET_CANC_012_LEN);
  }

  /**
   * Update PolRetCanc012 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc012, POL_RET_CANC_012_LEN);
  }

  /**
   * Update PolRetCanc012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot013
   *
   * @return polRetSlot013
   */
  public char[] getPolRetSlot013() throws CFException {
    if (isPolRetSlot013Modified()) {
      polRetSlot013 = refreshPolRetSlot013();
    }
    return polRetSlot013;
  }

  /**
   * set variable polRetSlot013 Corresponding COBOL Variable is POL-RET-SLOT-013
   *
   * @param value
   */
  public void setPolRetSlot013(char[] value) {
    polRetSlot013 = checkPolRetSlot013Constraints(value);
    serializePolRetSlot013(polRetSlot013);
  }

  /**
   * Update PolRetSlot013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot013, polRetSlot013.length);
  }

  public void setPolRetSlot013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot013, polRetSlot013.length);
  }

  /**
   * Update PolRetSlot013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot013 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot013 with another Field
   *
   * @param value
   */
  public void setPolRetSlot013(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot013, POL_RET_SLOT_013_LEN);
  }

  /**
   * Update PolRetSlot013 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot013, POL_RET_SLOT_013_LEN);
  }

  /**
   * Update PolRetSlot013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff013
   *
   * @return polRetEff013
   */
  public char[] getPolRetEff013() throws CFException {
    if (isPolRetEff013Modified()) {
      polRetEff013 = refreshPolRetEff013();
    }
    return polRetEff013;
  }

  /**
   * set variable polRetEff013 Corresponding COBOL Variable is POL-RET-EFF-013
   *
   * @param value
   */
  public void setPolRetEff013(char[] value) {
    polRetEff013 = checkPolRetEff013Constraints(value);
    serializePolRetEff013(polRetEff013);
  }

  /**
   * Update PolRetEff013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff013, polRetEff013.length);
  }

  public void setPolRetEff013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff013, polRetEff013.length);
  }

  /**
   * Update PolRetEff013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff013 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff013 with another Field
   *
   * @param value
   */
  public void setPolRetEff013(Field source) {
    replace(source, 0, source.length(), beginPolRetEff013, POL_RET_EFF_013_LEN);
  }

  /**
   * Update PolRetEff013 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff013, POL_RET_EFF_013_LEN);
  }

  /**
   * Update PolRetEff013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc013
   *
   * @return polRetCanc013
   */
  public char[] getPolRetCanc013() throws CFException {
    if (isPolRetCanc013Modified()) {
      polRetCanc013 = refreshPolRetCanc013();
    }
    return polRetCanc013;
  }

  /**
   * set variable polRetCanc013 Corresponding COBOL Variable is POL-RET-CANC-013
   *
   * @param value
   */
  public void setPolRetCanc013(char[] value) {
    polRetCanc013 = checkPolRetCanc013Constraints(value);
    serializePolRetCanc013(polRetCanc013);
  }

  /**
   * Update PolRetCanc013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc013, polRetCanc013.length);
  }

  public void setPolRetCanc013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc013, polRetCanc013.length);
  }

  /**
   * Update PolRetCanc013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc013 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc013 with another Field
   *
   * @param value
   */
  public void setPolRetCanc013(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc013, POL_RET_CANC_013_LEN);
  }

  /**
   * Update PolRetCanc013 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc013, POL_RET_CANC_013_LEN);
  }

  /**
   * Update PolRetCanc013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot014
   *
   * @return polRetSlot014
   */
  public char[] getPolRetSlot014() throws CFException {
    if (isPolRetSlot014Modified()) {
      polRetSlot014 = refreshPolRetSlot014();
    }
    return polRetSlot014;
  }

  /**
   * set variable polRetSlot014 Corresponding COBOL Variable is POL-RET-SLOT-014
   *
   * @param value
   */
  public void setPolRetSlot014(char[] value) {
    polRetSlot014 = checkPolRetSlot014Constraints(value);
    serializePolRetSlot014(polRetSlot014);
  }

  /**
   * Update PolRetSlot014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot014, polRetSlot014.length);
  }

  public void setPolRetSlot014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot014, polRetSlot014.length);
  }

  /**
   * Update PolRetSlot014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot014 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot014 with another Field
   *
   * @param value
   */
  public void setPolRetSlot014(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot014, POL_RET_SLOT_014_LEN);
  }

  /**
   * Update PolRetSlot014 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot014, POL_RET_SLOT_014_LEN);
  }

  /**
   * Update PolRetSlot014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetEff014
   *
   * @return polRetEff014
   */
  public char[] getPolRetEff014() throws CFException {
    if (isPolRetEff014Modified()) {
      polRetEff014 = refreshPolRetEff014();
    }
    return polRetEff014;
  }

  /**
   * set variable polRetEff014 Corresponding COBOL Variable is POL-RET-EFF-014
   *
   * @param value
   */
  public void setPolRetEff014(char[] value) {
    polRetEff014 = checkPolRetEff014Constraints(value);
    serializePolRetEff014(polRetEff014);
  }

  /**
   * Update PolRetEff014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetEff014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetEff014, polRetEff014.length);
  }

  public void setPolRetEff014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff014, polRetEff014.length);
  }

  /**
   * Update PolRetEff014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff014 + targetIndex, targetLen);
  }

  /**
   * Update PolRetEff014 with another Field
   *
   * @param value
   */
  public void setPolRetEff014(Field source) {
    replace(source, 0, source.length(), beginPolRetEff014, POL_RET_EFF_014_LEN);
  }

  /**
   * Update PolRetEff014 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetEff014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff014, POL_RET_EFF_014_LEN);
  }

  /**
   * Update PolRetEff014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetEff014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetEff014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetCanc014
   *
   * @return polRetCanc014
   */
  public char[] getPolRetCanc014() throws CFException {
    if (isPolRetCanc014Modified()) {
      polRetCanc014 = refreshPolRetCanc014();
    }
    return polRetCanc014;
  }

  /**
   * set variable polRetCanc014 Corresponding COBOL Variable is POL-RET-CANC-014
   *
   * @param value
   */
  public void setPolRetCanc014(char[] value) {
    polRetCanc014 = checkPolRetCanc014Constraints(value);
    serializePolRetCanc014(polRetCanc014);
  }

  /**
   * Update PolRetCanc014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetCanc014, polRetCanc014.length);
  }

  public void setPolRetCanc014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc014, polRetCanc014.length);
  }

  /**
   * Update PolRetCanc014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc014 + targetIndex, targetLen);
  }

  /**
   * Update PolRetCanc014 with another Field
   *
   * @param value
   */
  public void setPolRetCanc014(Field source) {
    replace(source, 0, source.length(), beginPolRetCanc014, POL_RET_CANC_014_LEN);
  }

  /**
   * Update PolRetCanc014 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetCanc014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc014, POL_RET_CANC_014_LEN);
  }

  /**
   * Update PolRetCanc014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetCanc014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetCanc014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot018
   *
   * @return polRetSlot018
   */
  public char[] getPolRetSlot018() throws CFException {
    if (isPolRetSlot018Modified()) {
      polRetSlot018 = refreshPolRetSlot018();
    }
    return polRetSlot018;
  }

  /**
   * set variable polRetSlot018 Corresponding COBOL Variable is POL-RET-SLOT-018
   *
   * @param value
   */
  public void setPolRetSlot018(char[] value) {
    polRetSlot018 = checkPolRetSlot018Constraints(value);
    serializePolRetSlot018(polRetSlot018);
  }

  /**
   * Update PolRetSlot018 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot018(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot018, polRetSlot018.length);
  }

  public void setPolRetSlot018(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot018, polRetSlot018.length);
  }

  /**
   * Update PolRetSlot018 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot018(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot018 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot018 with another Field
   *
   * @param value
   */
  public void setPolRetSlot018(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot018, POL_RET_SLOT_018_LEN);
  }

  /**
   * Update PolRetSlot018 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot018(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot018, POL_RET_SLOT_018_LEN);
  }

  /**
   * Update PolRetSlot018 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot018(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot018 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot019
   *
   * @return polRetSlot019
   */
  public char[] getPolRetSlot019() throws CFException {
    if (isPolRetSlot019Modified()) {
      polRetSlot019 = refreshPolRetSlot019();
    }
    return polRetSlot019;
  }

  /**
   * set variable polRetSlot019 Corresponding COBOL Variable is POL-RET-SLOT-019
   *
   * @param value
   */
  public void setPolRetSlot019(char[] value) {
    polRetSlot019 = checkPolRetSlot019Constraints(value);
    serializePolRetSlot019(polRetSlot019);
  }

  /**
   * Update PolRetSlot019 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot019(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot019, polRetSlot019.length);
  }

  public void setPolRetSlot019(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot019, polRetSlot019.length);
  }

  /**
   * Update PolRetSlot019 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot019(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot019 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot019 with another Field
   *
   * @param value
   */
  public void setPolRetSlot019(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot019, POL_RET_SLOT_019_LEN);
  }

  /**
   * Update PolRetSlot019 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot019(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot019, POL_RET_SLOT_019_LEN);
  }

  /**
   * Update PolRetSlot019 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot019(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot019 + targetIndex, targetLen);
  }
  /**
   * Returns the value of polRetSlot020
   *
   * @return polRetSlot020
   */
  public char[] getPolRetSlot020() throws CFException {
    if (isPolRetSlot020Modified()) {
      polRetSlot020 = refreshPolRetSlot020();
    }
    return polRetSlot020;
  }

  /**
   * set variable polRetSlot020 Corresponding COBOL Variable is POL-RET-SLOT-020
   *
   * @param value
   */
  public void setPolRetSlot020(char[] value) {
    polRetSlot020 = checkPolRetSlot020Constraints(value);
    serializePolRetSlot020(polRetSlot020);
  }

  /**
   * Update PolRetSlot020 with a char[] from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot020(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPolRetSlot020, polRetSlot020.length);
  }

  public void setPolRetSlot020(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot020, polRetSlot020.length);
  }

  /**
   * Update PolRetSlot020 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot020(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot020 + targetIndex, targetLen);
  }

  /**
   * Update PolRetSlot020 with another Field
   *
   * @param value
   */
  public void setPolRetSlot020(Field source) {
    replace(source, 0, source.length(), beginPolRetSlot020, POL_RET_SLOT_020_LEN);
  }

  /**
   * Update PolRetSlot020 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetSlot020(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot020, POL_RET_SLOT_020_LEN);
  }

  /**
   * Update PolRetSlot020 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetSlot020(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPolRetSlot020 + targetIndex, targetLen);
  }

  /**
   * initializes PolRetArea3 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPolStdPolNbr(CONSTANTS.SPACE_6);
    setPolStdPlnNbr(0);
    setPolRetNewOldSrvcInd(CONSTANTS.SPACE);
    setPolRetSviTblPriNbr(CONSTANTS.SPACE_6);
    setPolRetSlotTblId(CONSTANTS.SPACE_6);
    setPolRetObligId(CONSTANTS.SPACE_2);
    setPolRetShrArngCd(CONSTANTS.SPACE_2);
    setPolRetFundTypCd(CONSTANTS.SPACE);
    setPolRetPrdctKeyCd(CONSTANTS.SPACE_3);
    setPolRetMbrPrdctTypCd(CONSTANTS.SPACE_3);
    setPolRetSviTblTerNbr(CONSTANTS.SPACE_6);
    setPolNtfyCrdcEpInd(CONSTANTS.SPACE);
    setPolOncPolPrtcpCd(CONSTANTS.SPACE);
    setPolEvdBasDialgInd(CONSTANTS.SPACE);
    setPolCoreMedPrrAuthCd(CONSTANTS.SPACE);
    setPolRelSrvcInd(CONSTANTS.SPACE);
    setPolGenPolPrtcpCd(CONSTANTS.SPACE);
    setPolSecOpinVendCd(CONSTANTS.SPACE);
    setPolRetBhvHlthVendCd(CONSTANTS.SPACE);
    setPolRetSlot001(CONSTANTS.SPACE_6);
    setPolRetEff001(CONSTANTS.SPACE_10);
    setPolRetCanc001(CONSTANTS.SPACE_10);
    setPolRetSlot002(CONSTANTS.SPACE_6);
    setPolRetEff002(CONSTANTS.SPACE_10);
    setPolRetCanc002(CONSTANTS.SPACE_10);
    setPolRetSlot003(CONSTANTS.SPACE_6);
    setPolRetEff003(CONSTANTS.SPACE_10);
    setPolRetCanc003(CONSTANTS.SPACE_10);
    setPolRetSlot004(CONSTANTS.SPACE_6);
    setPolRetEff004(CONSTANTS.SPACE_10);
    setPolRetCanc004(CONSTANTS.SPACE_10);
    setPolRetSlot005(CONSTANTS.SPACE_6);
    setPolRetEff005(CONSTANTS.SPACE_10);
    setPolRetCanc005(CONSTANTS.SPACE_10);
    setPolRetSlot006(CONSTANTS.SPACE_6);
    setPolRetEff006(CONSTANTS.SPACE_10);
    setPolRetCanc006(CONSTANTS.SPACE_10);
    setPolRetSlot007(CONSTANTS.SPACE_6);
    setPolRetEff007(CONSTANTS.SPACE_10);
    setPolRetCanc007(CONSTANTS.SPACE_10);
    setPolRetSlot008(CONSTANTS.SPACE_6);
    setPolRetEff008(CONSTANTS.SPACE_10);
    setPolRetCanc008(CONSTANTS.SPACE_10);
    setPolRetSlot009(CONSTANTS.SPACE_6);
    setPolRetEff009(CONSTANTS.SPACE_10);
    setPolRetCanc009(CONSTANTS.SPACE_10);
    setPolRetSlot010(CONSTANTS.SPACE_6);
    setPolRetEff010(CONSTANTS.SPACE_10);
    setPolRetCanc010(CONSTANTS.SPACE_10);
    setPolRetSlot011(CONSTANTS.SPACE_6);
    setPolRetEff011(CONSTANTS.SPACE_10);
    setPolRetCanc011(CONSTANTS.SPACE_10);
    setPolRetSlot012(CONSTANTS.SPACE_6);
    setPolRetEff012(CONSTANTS.SPACE_10);
    setPolRetCanc012(CONSTANTS.SPACE_10);
    setPolRetSlot013(CONSTANTS.SPACE_6);
    setPolRetEff013(CONSTANTS.SPACE_10);
    setPolRetCanc013(CONSTANTS.SPACE_10);
    setPolRetSlot014(CONSTANTS.SPACE_6);
    setPolRetEff014(CONSTANTS.SPACE_10);
    setPolRetCanc014(CONSTANTS.SPACE_10);
    setPolRetSlot018(CONSTANTS.SPACE_6);
    setPolRetSlot019(CONSTANTS.SPACE_6);
    setPolRetSlot020(CONSTANTS.SPACE_6);
  }

  public static int getPolRetArea3FieldLength() {
    return POL_RET_AREA_3_LENGTH;
  }
}
