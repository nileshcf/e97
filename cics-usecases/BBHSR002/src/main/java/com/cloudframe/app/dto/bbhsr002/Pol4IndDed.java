package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol4IndDed is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class Pol4IndDed extends Pol4IndDedSerialized {

  private int pol4DideSeqNbr;

  private long pol4DideDedAmt;

  private int pol4DideDedCd;

  private char[] pol4DideDedFreqCd = Field.fillLowValue(1);

  private char[] pol4DideDedNtwkTypCd = Field.fillLowValue(1);

  private char[] pol4DideDedSrvcDesc = Field.fillLowValue(6);

  /** Constructor for Pol4IndDed */
  public Pol4IndDed() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4IndDed. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4IndDed(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol4DideSeqNbr
   *
   * @return pol4DideSeqNbr
   */
  public int getPol4DideSeqNbr() throws CFException {
    if (isPol4DideSeqNbrModified()) {
      pol4DideSeqNbr = refreshPol4DideSeqNbr();
    }
    return pol4DideSeqNbr;
  }

  /**
   * Update Pol4DideSeqNbr with the passed value Corresponding COBOL Variable is POL4-DIDE-SEQ-NBR
   *
   * @param number
   */
  public void setPol4DideSeqNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4DideSeqNbr = checkPol4DideSeqNbrMaxLimit(number);
    serializePol4DideSeqNbr(pol4DideSeqNbr);
  }

  public void setPol4DideSeqNbr(long number) {
    number = checkPol4DideSeqNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4DideSeqNbr((int) number);
  }

  /**
   * Update Pol4DideSeqNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DideSeqNbr(char[] value) throws CFException {
    pol4DideSeqNbr = serializePol4DideSeqNbr(value);
  }
  /**
   * Update Pol4DideSeqNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DideSeqNbrString(char[] value) throws CFException {
    setPol4DideSeqNbr(value);
  }
  /**
   * Returns the value of pol4DideDedAmt
   *
   * @return pol4DideDedAmt
   */
  public long getPol4DideDedAmt() throws CFException {
    if (isPol4DideDedAmtModified()) {
      pol4DideDedAmt = refreshPol4DideDedAmt();
    }
    return pol4DideDedAmt;
  }

  /**
   * Update Pol4DideDedAmt with the passed value Corresponding COBOL Variable is POL4-DIDE-DED-AMT
   *
   * @param number
   */
  public void setPol4DideDedAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol4DideDedAmt = checkPol4DideDedAmtMaxLimit(number);
    serializePol4DideDedAmt(pol4DideDedAmt);
  }

  /**
   * Update Pol4DideDedAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DideDedAmt(char[] value) throws CFException {
    pol4DideDedAmt = serializePol4DideDedAmt(value);
  }
  /**
   * Update Pol4DideDedAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DideDedAmtString(char[] value) throws CFException {
    setPol4DideDedAmt(value);
  }
  /**
   * Returns the value of pol4DideDedCd
   *
   * @return pol4DideDedCd
   */
  public int getPol4DideDedCd() throws CFException {
    if (isPol4DideDedCdModified()) {
      pol4DideDedCd = refreshPol4DideDedCd();
    }
    return pol4DideDedCd;
  }

  /**
   * Update Pol4DideDedCd with the passed value Corresponding COBOL Variable is POL4-DIDE-DED-CD
   *
   * @param number
   */
  public void setPol4DideDedCd(int number) {
    // Truncate if the number is beyond +/- Max range
    pol4DideDedCd = checkPol4DideDedCdMaxLimit(number);
    serializePol4DideDedCd(pol4DideDedCd);
  }

  public void setPol4DideDedCd(long number) {
    number = checkPol4DideDedCdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol4DideDedCd((int) number);
  }

  /**
   * Update Pol4DideDedCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DideDedCd(char[] value) throws CFException {
    pol4DideDedCd = serializePol4DideDedCd(value);
  }
  /**
   * Update Pol4DideDedCd with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DideDedCdString(char[] value) throws CFException {
    setPol4DideDedCd(value);
  }
  /**
   * Returns the value of pol4DideDedFreqCd
   *
   * @return pol4DideDedFreqCd
   */
  public char[] getPol4DideDedFreqCd() throws CFException {
    if (isPol4DideDedFreqCdModified()) {
      pol4DideDedFreqCd = refreshPol4DideDedFreqCd();
    }
    return pol4DideDedFreqCd;
  }

  /**
   * set variable pol4DideDedFreqCd Corresponding COBOL Variable is POL4-DIDE-DED-FREQ-CD
   *
   * @param value
   */
  public void setPol4DideDedFreqCd(char[] value) {
    pol4DideDedFreqCd = checkPol4DideDedFreqCdConstraints(value);
    serializePol4DideDedFreqCd(pol4DideDedFreqCd);
  }

  /**
   * Update Pol4DideDedFreqCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DideDedFreqCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4DideDedFreqCd, pol4DideDedFreqCd.length);
  }

  public void setPol4DideDedFreqCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedFreqCd, pol4DideDedFreqCd.length);
  }

  /**
   * Update Pol4DideDedFreqCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DideDedFreqCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedFreqCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DideDedFreqCd with another Field
   *
   * @param value
   */
  public void setPol4DideDedFreqCd(Field source) {
    replace(source, 0, source.length(), beginPol4DideDedFreqCd, POL_4_DIDE_DED_FREQ_CD_LEN);
  }

  /**
   * Update Pol4DideDedFreqCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DideDedFreqCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedFreqCd, POL_4_DIDE_DED_FREQ_CD_LEN);
  }

  /**
   * Update Pol4DideDedFreqCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DideDedFreqCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedFreqCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DideDedNtwkTypCd
   *
   * @return pol4DideDedNtwkTypCd
   */
  public char[] getPol4DideDedNtwkTypCd() throws CFException {
    if (isPol4DideDedNtwkTypCdModified()) {
      pol4DideDedNtwkTypCd = refreshPol4DideDedNtwkTypCd();
    }
    return pol4DideDedNtwkTypCd;
  }

  /**
   * set variable pol4DideDedNtwkTypCd Corresponding COBOL Variable is POL4-DIDE-DED-NTWK-TYP-CD
   *
   * @param value
   */
  public void setPol4DideDedNtwkTypCd(char[] value) {
    pol4DideDedNtwkTypCd = checkPol4DideDedNtwkTypCdConstraints(value);
    serializePol4DideDedNtwkTypCd(pol4DideDedNtwkTypCd);
  }

  /**
   * Update Pol4DideDedNtwkTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DideDedNtwkTypCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4DideDedNtwkTypCd, pol4DideDedNtwkTypCd.length);
  }

  public void setPol4DideDedNtwkTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedNtwkTypCd, pol4DideDedNtwkTypCd.length);
  }

  /**
   * Update Pol4DideDedNtwkTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DideDedNtwkTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedNtwkTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DideDedNtwkTypCd with another Field
   *
   * @param value
   */
  public void setPol4DideDedNtwkTypCd(Field source) {
    replace(source, 0, source.length(), beginPol4DideDedNtwkTypCd, POL_4_DIDE_DED_NTWK_TYP_CD_LEN);
  }

  /**
   * Update Pol4DideDedNtwkTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DideDedNtwkTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4DideDedNtwkTypCd, POL_4_DIDE_DED_NTWK_TYP_CD_LEN);
  }

  /**
   * Update Pol4DideDedNtwkTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4DideDedNtwkTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedNtwkTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DideDedSrvcDesc
   *
   * @return pol4DideDedSrvcDesc
   */
  public char[] getPol4DideDedSrvcDesc() throws CFException {
    if (isPol4DideDedSrvcDescModified()) {
      pol4DideDedSrvcDesc = refreshPol4DideDedSrvcDesc();
    }
    return pol4DideDedSrvcDesc;
  }

  /**
   * set variable pol4DideDedSrvcDesc Corresponding COBOL Variable is POL4-DIDE-DED-SRVC-DESC
   *
   * @param value
   */
  public void setPol4DideDedSrvcDesc(char[] value) {
    pol4DideDedSrvcDesc = checkPol4DideDedSrvcDescConstraints(value);
    serializePol4DideDedSrvcDesc(pol4DideDedSrvcDesc);
  }

  /**
   * Update Pol4DideDedSrvcDesc with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DideDedSrvcDesc(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4DideDedSrvcDesc, pol4DideDedSrvcDesc.length);
  }

  public void setPol4DideDedSrvcDesc(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedSrvcDesc, pol4DideDedSrvcDesc.length);
  }

  /**
   * Update Pol4DideDedSrvcDesc with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DideDedSrvcDesc(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedSrvcDesc + targetIndex, targetLen);
  }

  /**
   * Update Pol4DideDedSrvcDesc with another Field
   *
   * @param value
   */
  public void setPol4DideDedSrvcDesc(Field source) {
    replace(source, 0, source.length(), beginPol4DideDedSrvcDesc, POL_4_DIDE_DED_SRVC_DESC_LEN);
  }

  /**
   * Update Pol4DideDedSrvcDesc with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DideDedSrvcDesc(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedSrvcDesc, POL_4_DIDE_DED_SRVC_DESC_LEN);
  }

  /**
   * Update Pol4DideDedSrvcDesc with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DideDedSrvcDesc(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DideDedSrvcDesc + targetIndex, targetLen);
  }

  /**
   * initializes Pol4IndDed String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol4DideSeqNbr(0);
    setPol4DideDedAmt(0);
    setPol4DideDedCd(0);
    setPol4DideDedFreqCd(CONSTANTS.SPACE);
    setPol4DideDedNtwkTypCd(CONSTANTS.SPACE);
    setPol4DideDedSrvcDesc(CONSTANTS.SPACE_6);
  }

  public static int getPol4IndDedFieldLength() {
    return POL_4_IND_DED_LENGTH;
  }
}
