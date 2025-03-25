package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclcustPlnPpoArng is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclcustPlnPpoArng extends DclcustPlnPpoArngSerialized {

  private char[] ppoCovTypCd = Field.fillLowValue(1);

  private char[] ppoPolNbr = Field.fillLowValue(6);

  private char[] ppoPlnNbr = Field.fillLowValue(4);

  private char[] ppoClssNbr = Field.fillLowValue(4);

  private short ppoPlnSeqNbr;

  private short ppoPpoArngSeqNbr;

  private char[] ppoPrdctCd = Field.fillLowValue(3);

  private char[] ppoMktTypCd = Field.fillLowValue(2);

  private char[] ppoMktNbr = Field.fillLowValue(7);

  private char[] ppoIpaId = Field.fillLowValue(5);

  private char[] ppoPrefNtwkCd = Field.fillLowValue(1);

  private char[] ppoAhpInd = Field.fillLowValue(1);

  /** Constructor for DclcustPlnPpoArng */
  public DclcustPlnPpoArng() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of ppoCovTypCd
   *
   * @return ppoCovTypCd
   */
  public char[] getPpoCovTypCd() throws CFException {
    if (isPpoCovTypCdModified()) {
      ppoCovTypCd = refreshPpoCovTypCd();
    }
    return ppoCovTypCd;
  }

  /**
   * set variable ppoCovTypCd Corresponding COBOL Variable is PPO-COV-TYP-CD
   *
   * @param value
   */
  public void setPpoCovTypCd(char[] value) {
    ppoCovTypCd = checkPpoCovTypCdConstraints(value);
    serializePpoCovTypCd(ppoCovTypCd);
  }

  /**
   * Update PpoCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoCovTypCd, ppoCovTypCd.length);
  }

  public void setPpoCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoCovTypCd, ppoCovTypCd.length);
  }

  /**
   * Update PpoCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update PpoCovTypCd with another Field
   *
   * @param value
   */
  public void setPpoCovTypCd(Field source) {
    replace(source, 0, source.length(), beginPpoCovTypCd, PPO_COV_TYP_CD_LEN);
  }

  /**
   * Update PpoCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoCovTypCd, PPO_COV_TYP_CD_LEN);
  }

  /**
   * Update PpoCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoPolNbr
   *
   * @return ppoPolNbr
   */
  public char[] getPpoPolNbr() throws CFException {
    if (isPpoPolNbrModified()) {
      ppoPolNbr = refreshPpoPolNbr();
    }
    return ppoPolNbr;
  }

  /**
   * set variable ppoPolNbr Corresponding COBOL Variable is PPO-POL-NBR
   *
   * @param value
   */
  public void setPpoPolNbr(char[] value) {
    ppoPolNbr = checkPpoPolNbrConstraints(value);
    serializePpoPolNbr(ppoPolNbr);
  }

  /**
   * Update PpoPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoPolNbr, ppoPolNbr.length);
  }

  public void setPpoPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPolNbr, ppoPolNbr.length);
  }

  /**
   * Update PpoPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPolNbr + targetIndex, targetLen);
  }

  /**
   * Update PpoPolNbr with another Field
   *
   * @param value
   */
  public void setPpoPolNbr(Field source) {
    replace(source, 0, source.length(), beginPpoPolNbr, PPO_POL_NBR_LEN);
  }

  /**
   * Update PpoPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPolNbr, PPO_POL_NBR_LEN);
  }

  /**
   * Update PpoPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoPlnNbr
   *
   * @return ppoPlnNbr
   */
  public char[] getPpoPlnNbr() throws CFException {
    if (isPpoPlnNbrModified()) {
      ppoPlnNbr = refreshPpoPlnNbr();
    }
    return ppoPlnNbr;
  }

  /**
   * set variable ppoPlnNbr Corresponding COBOL Variable is PPO-PLN-NBR
   *
   * @param value
   */
  public void setPpoPlnNbr(char[] value) {
    ppoPlnNbr = checkPpoPlnNbrConstraints(value);
    serializePpoPlnNbr(ppoPlnNbr);
  }

  /**
   * Update PpoPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoPlnNbr, ppoPlnNbr.length);
  }

  public void setPpoPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPlnNbr, ppoPlnNbr.length);
  }

  /**
   * Update PpoPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update PpoPlnNbr with another Field
   *
   * @param value
   */
  public void setPpoPlnNbr(Field source) {
    replace(source, 0, source.length(), beginPpoPlnNbr, PPO_PLN_NBR_LEN);
  }

  /**
   * Update PpoPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPlnNbr, PPO_PLN_NBR_LEN);
  }

  /**
   * Update PpoPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoClssNbr
   *
   * @return ppoClssNbr
   */
  public char[] getPpoClssNbr() throws CFException {
    if (isPpoClssNbrModified()) {
      ppoClssNbr = refreshPpoClssNbr();
    }
    return ppoClssNbr;
  }

  /**
   * set variable ppoClssNbr Corresponding COBOL Variable is PPO-CLSS-NBR
   *
   * @param value
   */
  public void setPpoClssNbr(char[] value) {
    ppoClssNbr = checkPpoClssNbrConstraints(value);
    serializePpoClssNbr(ppoClssNbr);
  }

  /**
   * Update PpoClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoClssNbr, ppoClssNbr.length);
  }

  public void setPpoClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoClssNbr, ppoClssNbr.length);
  }

  /**
   * Update PpoClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoClssNbr + targetIndex, targetLen);
  }

  /**
   * Update PpoClssNbr with another Field
   *
   * @param value
   */
  public void setPpoClssNbr(Field source) {
    replace(source, 0, source.length(), beginPpoClssNbr, PPO_CLSS_NBR_LEN);
  }

  /**
   * Update PpoClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoClssNbr, PPO_CLSS_NBR_LEN);
  }

  /**
   * Update PpoClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoPlnSeqNbr
   *
   * @return ppoPlnSeqNbr
   */
  public short getPpoPlnSeqNbr() throws CFException {
    if (isPpoPlnSeqNbrModified()) {
      ppoPlnSeqNbr = refreshPpoPlnSeqNbr();
    }
    return ppoPlnSeqNbr;
  }

  /**
   * Update PpoPlnSeqNbr with the passed value Corresponding COBOL Variable is PPO-PLN-SEQ-NBR
   *
   * @param number
   */
  public void setPpoPlnSeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    ppoPlnSeqNbr = checkPpoPlnSeqNbrMaxLimit(number);
    serializePpoPlnSeqNbr(ppoPlnSeqNbr);
  }

  public void setPpoPlnSeqNbr(int number) {
    number = checkPpoPlnSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPpoPlnSeqNbr((short) number);
  }

  public void setPpoPlnSeqNbr(long number) {
    number = checkPpoPlnSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPpoPlnSeqNbr((short) number);
  }

  /**
   * Returns the value of ppoPpoArngSeqNbr
   *
   * @return ppoPpoArngSeqNbr
   */
  public short getPpoPpoArngSeqNbr() throws CFException {
    if (isPpoPpoArngSeqNbrModified()) {
      ppoPpoArngSeqNbr = refreshPpoPpoArngSeqNbr();
    }
    return ppoPpoArngSeqNbr;
  }

  /**
   * Update PpoPpoArngSeqNbr with the passed value Corresponding COBOL Variable is
   * PPO-PPO-ARNG-SEQ-NBR
   *
   * @param number
   */
  public void setPpoPpoArngSeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    ppoPpoArngSeqNbr = checkPpoPpoArngSeqNbrMaxLimit(number);
    serializePpoPpoArngSeqNbr(ppoPpoArngSeqNbr);
  }

  public void setPpoPpoArngSeqNbr(int number) {
    number =
        checkPpoPpoArngSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPpoPpoArngSeqNbr((short) number);
  }

  public void setPpoPpoArngSeqNbr(long number) {
    number =
        checkPpoPpoArngSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setPpoPpoArngSeqNbr((short) number);
  }

  /**
   * Returns the value of ppoPrdctCd
   *
   * @return ppoPrdctCd
   */
  public char[] getPpoPrdctCd() throws CFException {
    if (isPpoPrdctCdModified()) {
      ppoPrdctCd = refreshPpoPrdctCd();
    }
    return ppoPrdctCd;
  }

  /**
   * set variable ppoPrdctCd Corresponding COBOL Variable is PPO-PRDCT-CD
   *
   * @param value
   */
  public void setPpoPrdctCd(char[] value) {
    ppoPrdctCd = checkPpoPrdctCdConstraints(value);
    serializePpoPrdctCd(ppoPrdctCd);
  }

  /**
   * Update PpoPrdctCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoPrdctCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoPrdctCd, ppoPrdctCd.length);
  }

  public void setPpoPrdctCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrdctCd, ppoPrdctCd.length);
  }

  /**
   * Update PpoPrdctCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPrdctCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrdctCd + targetIndex, targetLen);
  }

  /**
   * Update PpoPrdctCd with another Field
   *
   * @param value
   */
  public void setPpoPrdctCd(Field source) {
    replace(source, 0, source.length(), beginPpoPrdctCd, PPO_PRDCT_CD_LEN);
  }

  /**
   * Update PpoPrdctCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoPrdctCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrdctCd, PPO_PRDCT_CD_LEN);
  }

  /**
   * Update PpoPrdctCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPrdctCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrdctCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoMktTypCd
   *
   * @return ppoMktTypCd
   */
  public char[] getPpoMktTypCd() throws CFException {
    if (isPpoMktTypCdModified()) {
      ppoMktTypCd = refreshPpoMktTypCd();
    }
    return ppoMktTypCd;
  }

  /**
   * set variable ppoMktTypCd Corresponding COBOL Variable is PPO-MKT-TYP-CD
   *
   * @param value
   */
  public void setPpoMktTypCd(char[] value) {
    ppoMktTypCd = checkPpoMktTypCdConstraints(value);
    serializePpoMktTypCd(ppoMktTypCd);
  }

  /**
   * Update PpoMktTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoMktTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoMktTypCd, ppoMktTypCd.length);
  }

  public void setPpoMktTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktTypCd, ppoMktTypCd.length);
  }

  /**
   * Update PpoMktTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoMktTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktTypCd + targetIndex, targetLen);
  }

  /**
   * Update PpoMktTypCd with another Field
   *
   * @param value
   */
  public void setPpoMktTypCd(Field source) {
    replace(source, 0, source.length(), beginPpoMktTypCd, PPO_MKT_TYP_CD_LEN);
  }

  /**
   * Update PpoMktTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoMktTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktTypCd, PPO_MKT_TYP_CD_LEN);
  }

  /**
   * Update PpoMktTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoMktTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoMktNbr
   *
   * @return ppoMktNbr
   */
  public char[] getPpoMktNbr() throws CFException {
    if (isPpoMktNbrModified()) {
      ppoMktNbr = refreshPpoMktNbr();
    }
    return ppoMktNbr;
  }

  /**
   * set variable ppoMktNbr Corresponding COBOL Variable is PPO-MKT-NBR
   *
   * @param value
   */
  public void setPpoMktNbr(char[] value) {
    ppoMktNbr = checkPpoMktNbrConstraints(value);
    serializePpoMktNbr(ppoMktNbr);
  }

  /**
   * Update PpoMktNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoMktNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoMktNbr, ppoMktNbr.length);
  }

  public void setPpoMktNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktNbr, ppoMktNbr.length);
  }

  /**
   * Update PpoMktNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoMktNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktNbr + targetIndex, targetLen);
  }

  /**
   * Update PpoMktNbr with another Field
   *
   * @param value
   */
  public void setPpoMktNbr(Field source) {
    replace(source, 0, source.length(), beginPpoMktNbr, PPO_MKT_NBR_LEN);
  }

  /**
   * Update PpoMktNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoMktNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktNbr, PPO_MKT_NBR_LEN);
  }

  /**
   * Update PpoMktNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoMktNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoMktNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoIpaId
   *
   * @return ppoIpaId
   */
  public char[] getPpoIpaId() throws CFException {
    if (isPpoIpaIdModified()) {
      ppoIpaId = refreshPpoIpaId();
    }
    return ppoIpaId;
  }

  /**
   * set variable ppoIpaId Corresponding COBOL Variable is PPO-IPA-ID
   *
   * @param value
   */
  public void setPpoIpaId(char[] value) {
    ppoIpaId = checkPpoIpaIdConstraints(value);
    serializePpoIpaId(ppoIpaId);
  }

  /**
   * Update PpoIpaId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoIpaId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoIpaId, ppoIpaId.length);
  }

  public void setPpoIpaId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoIpaId, ppoIpaId.length);
  }

  /**
   * Update PpoIpaId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoIpaId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoIpaId + targetIndex, targetLen);
  }

  /**
   * Update PpoIpaId with another Field
   *
   * @param value
   */
  public void setPpoIpaId(Field source) {
    replace(source, 0, source.length(), beginPpoIpaId, PPO_IPA_ID_LEN);
  }

  /**
   * Update PpoIpaId with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoIpaId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoIpaId, PPO_IPA_ID_LEN);
  }

  /**
   * Update PpoIpaId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoIpaId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoIpaId + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoPrefNtwkCd
   *
   * @return ppoPrefNtwkCd
   */
  public char[] getPpoPrefNtwkCd() throws CFException {
    if (isPpoPrefNtwkCdModified()) {
      ppoPrefNtwkCd = refreshPpoPrefNtwkCd();
    }
    return ppoPrefNtwkCd;
  }

  /**
   * set variable ppoPrefNtwkCd Corresponding COBOL Variable is PPO-PREF-NTWK-CD
   *
   * @param value
   */
  public void setPpoPrefNtwkCd(char[] value) {
    ppoPrefNtwkCd = checkPpoPrefNtwkCdConstraints(value);
    serializePpoPrefNtwkCd(ppoPrefNtwkCd);
  }

  /**
   * Update PpoPrefNtwkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoPrefNtwkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoPrefNtwkCd, ppoPrefNtwkCd.length);
  }

  public void setPpoPrefNtwkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrefNtwkCd, ppoPrefNtwkCd.length);
  }

  /**
   * Update PpoPrefNtwkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPrefNtwkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrefNtwkCd + targetIndex, targetLen);
  }

  /**
   * Update PpoPrefNtwkCd with another Field
   *
   * @param value
   */
  public void setPpoPrefNtwkCd(Field source) {
    replace(source, 0, source.length(), beginPpoPrefNtwkCd, PPO_PREF_NTWK_CD_LEN);
  }

  /**
   * Update PpoPrefNtwkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoPrefNtwkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrefNtwkCd, PPO_PREF_NTWK_CD_LEN);
  }

  /**
   * Update PpoPrefNtwkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoPrefNtwkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoPrefNtwkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of ppoAhpInd
   *
   * @return ppoAhpInd
   */
  public char[] getPpoAhpInd() throws CFException {
    if (isPpoAhpIndModified()) {
      ppoAhpInd = refreshPpoAhpInd();
    }
    return ppoAhpInd;
  }

  /**
   * set variable ppoAhpInd Corresponding COBOL Variable is PPO-AHP-IND
   *
   * @param value
   */
  public void setPpoAhpInd(char[] value) {
    ppoAhpInd = checkPpoAhpIndConstraints(value);
    serializePpoAhpInd(ppoAhpInd);
  }

  /**
   * Update PpoAhpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPpoAhpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPpoAhpInd, ppoAhpInd.length);
  }

  public void setPpoAhpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoAhpInd, ppoAhpInd.length);
  }

  /**
   * Update PpoAhpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoAhpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoAhpInd + targetIndex, targetLen);
  }

  /**
   * Update PpoAhpInd with another Field
   *
   * @param value
   */
  public void setPpoAhpInd(Field source) {
    replace(source, 0, source.length(), beginPpoAhpInd, PPO_AHP_IND_LEN);
  }

  /**
   * Update PpoAhpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPpoAhpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPpoAhpInd, PPO_AHP_IND_LEN);
  }

  /**
   * Update PpoAhpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPpoAhpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPpoAhpInd + targetIndex, targetLen);
  }

  /**
   * initializes DclcustPlnPpoArng String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPpoCovTypCd(CONSTANTS.SPACE);
    setPpoPolNbr(CONSTANTS.SPACE_6);
    setPpoPlnNbr(CONSTANTS.SPACE_4);
    setPpoClssNbr(CONSTANTS.SPACE_4);
    setPpoPlnSeqNbr((short) 0);
    setPpoPpoArngSeqNbr((short) 0);
    setPpoPrdctCd(CONSTANTS.SPACE_3);
    setPpoMktTypCd(CONSTANTS.SPACE_2);
    setPpoMktNbr(CONSTANTS.SPACE_7);
    setPpoIpaId(CONSTANTS.SPACE_5);
    setPpoPrefNtwkCd(CONSTANTS.SPACE);
    setPpoAhpInd(CONSTANTS.SPACE);
  }

  public static int getDclcustPlnPpoArngFieldLength() {
    return DCLCUST_PLN_PPO_ARNG_LENGTH;
  }
}
