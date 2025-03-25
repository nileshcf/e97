package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol2RetArea2 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class Pol2RetArea2 extends Pol2RetArea2Serialized {

  private char[] pol2RetProrationInd = Field.fillLowValue(1);

  private char[] pol2RetProrationEvent = Field.fillLowValue(1);

  private char[] pol2RetProductInd = Field.fillLowValue(3);

  private char[] pol2RetPrefNtwkCd = Field.fillLowValue(1);

  private char[] pol2RetUhPremDesgCd = Field.fillLowValue(1);

  private char[] pol2RetMnnrpInd = Field.fillLowValue(1);

  private int pol2RetMnnrpPct;

  private char[] pol2RetNonEmb = Field.fillLowValue(1);

  private long pol2RetLftmMaxAmt;

  private long pol2RetTier1LftmMaxAmt;

  private char[] pol2RetDualOopNbrInd = Field.fillLowValue(1);

  private long pol2RetPsyLftmCnfmMaxAmt;

  private long pol2PsyLftmNonCnfmMaxAmt;

  private long pol2PsyLftmCombPrscMxAmt;

  private long pol2RetPsyCyrCnfmMaxAmt;

  private long pol2PsyCyrCombPrscMaxAmt;

  private long pol2PsyCyrNonCnfmMaxAmt;

  private char[] pol2RetMbrNtwkKeyMtchCd = Field.fillLowValue(1);

  private char[] pol2RetDsesStTblNbr = Field.fillLowValue(6);

  private char[] pol2RetPlnAttr = Field.fillLowValue(2);

  private char[] pol2RetOopMaxCovCd = Field.fillLowValue(1);

  private char[] pol2RetMxiEffDate = Field.fillLowValue(8);

  private char[] pol2RetMxiEndDate = Field.fillLowValue(8);
  private Pol2RetReciprocityTable pol2RetReciprocityTable = new Pol2RetReciprocityTable();

  /** Constructor for Pol2RetArea2 */
  public Pol2RetArea2() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol2RetArea2. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol2RetArea2(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    pol2RetReciprocityTable.setParent(this, getStartOffset() + 95);
  }

  /**
   * Returns the value of pol2RetProrationInd
   *
   * @return pol2RetProrationInd
   */
  public char[] getPol2RetProrationInd() throws CFException {
    if (isPol2RetProrationIndModified()) {
      pol2RetProrationInd = refreshPol2RetProrationInd();
    }
    return pol2RetProrationInd;
  }

  /**
   * set variable pol2RetProrationInd Corresponding COBOL Variable is POL2-RET-PRORATION-IND
   *
   * @param value
   */
  public void setPol2RetProrationInd(char[] value) {
    pol2RetProrationInd = checkPol2RetProrationIndConstraints(value);
    serializePol2RetProrationInd(pol2RetProrationInd);
  }

  /**
   * Update Pol2RetProrationInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetProrationInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol2RetProrationInd, pol2RetProrationInd.length);
  }

  public void setPol2RetProrationInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProrationInd, pol2RetProrationInd.length);
  }

  /**
   * Update Pol2RetProrationInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetProrationInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProrationInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetProrationInd with another Field
   *
   * @param value
   */
  public void setPol2RetProrationInd(Field source) {
    replace(source, 0, source.length(), beginPol2RetProrationInd, POL_2_RET_PRORATION_IND_LEN);
  }

  /**
   * Update Pol2RetProrationInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetProrationInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProrationInd, POL_2_RET_PRORATION_IND_LEN);
  }

  /**
   * Update Pol2RetProrationInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetProrationInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProrationInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetProrationEvent
   *
   * @return pol2RetProrationEvent
   */
  public char[] getPol2RetProrationEvent() throws CFException {
    if (isPol2RetProrationEventModified()) {
      pol2RetProrationEvent = refreshPol2RetProrationEvent();
    }
    return pol2RetProrationEvent;
  }

  /**
   * set variable pol2RetProrationEvent Corresponding COBOL Variable is POL2-RET-PRORATION-EVENT
   *
   * @param value
   */
  public void setPol2RetProrationEvent(char[] value) {
    pol2RetProrationEvent = checkPol2RetProrationEventConstraints(value);
    serializePol2RetProrationEvent(pol2RetProrationEvent);
  }

  /**
   * Update Pol2RetProrationEvent with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetProrationEvent(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol2RetProrationEvent,
        pol2RetProrationEvent.length);
  }

  public void setPol2RetProrationEvent(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetProrationEvent, pol2RetProrationEvent.length);
  }

  /**
   * Update Pol2RetProrationEvent with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetProrationEvent(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProrationEvent + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetProrationEvent with another Field
   *
   * @param value
   */
  public void setPol2RetProrationEvent(Field source) {
    replace(source, 0, source.length(), beginPol2RetProrationEvent, POL_2_RET_PRORATION_EVENT_LEN);
  }

  /**
   * Update Pol2RetProrationEvent with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetProrationEvent(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetProrationEvent, POL_2_RET_PRORATION_EVENT_LEN);
  }

  /**
   * Update Pol2RetProrationEvent with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetProrationEvent(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProrationEvent + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetProductInd
   *
   * @return pol2RetProductInd
   */
  public char[] getPol2RetProductInd() throws CFException {
    if (isPol2RetProductIndModified()) {
      pol2RetProductInd = refreshPol2RetProductInd();
    }
    return pol2RetProductInd;
  }

  /**
   * set variable pol2RetProductInd Corresponding COBOL Variable is POL2-RET-PRODUCT-IND
   *
   * @param value
   */
  public void setPol2RetProductInd(char[] value) {
    pol2RetProductInd = checkPol2RetProductIndConstraints(value);
    serializePol2RetProductInd(pol2RetProductInd);
  }

  /**
   * Update Pol2RetProductInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetProductInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetProductInd, pol2RetProductInd.length);
  }

  public void setPol2RetProductInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductInd, pol2RetProductInd.length);
  }

  /**
   * Update Pol2RetProductInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetProductInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetProductInd with another Field
   *
   * @param value
   */
  public void setPol2RetProductInd(Field source) {
    replace(source, 0, source.length(), beginPol2RetProductInd, POL_2_RET_PRODUCT_IND_LEN);
  }

  /**
   * Update Pol2RetProductInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetProductInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductInd, POL_2_RET_PRODUCT_IND_LEN);
  }

  /**
   * Update Pol2RetProductInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetProductInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetProductInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetPrefNtwkCd
   *
   * @return pol2RetPrefNtwkCd
   */
  public char[] getPol2RetPrefNtwkCd() throws CFException {
    if (isPol2RetPrefNtwkCdModified()) {
      pol2RetPrefNtwkCd = refreshPol2RetPrefNtwkCd();
    }
    return pol2RetPrefNtwkCd;
  }

  /**
   * set variable pol2RetPrefNtwkCd Corresponding COBOL Variable is POL2-RET-PREF-NTWK-CD
   *
   * @param value
   */
  public void setPol2RetPrefNtwkCd(char[] value) {
    pol2RetPrefNtwkCd = checkPol2RetPrefNtwkCdConstraints(value);
    serializePol2RetPrefNtwkCd(pol2RetPrefNtwkCd);
  }

  /**
   * Update Pol2RetPrefNtwkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetPrefNtwkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetPrefNtwkCd, pol2RetPrefNtwkCd.length);
  }

  public void setPol2RetPrefNtwkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPrefNtwkCd, pol2RetPrefNtwkCd.length);
  }

  /**
   * Update Pol2RetPrefNtwkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetPrefNtwkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPrefNtwkCd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetPrefNtwkCd with another Field
   *
   * @param value
   */
  public void setPol2RetPrefNtwkCd(Field source) {
    replace(source, 0, source.length(), beginPol2RetPrefNtwkCd, POL_2_RET_PREF_NTWK_CD_LEN);
  }

  /**
   * Update Pol2RetPrefNtwkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetPrefNtwkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPrefNtwkCd, POL_2_RET_PREF_NTWK_CD_LEN);
  }

  /**
   * Update Pol2RetPrefNtwkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetPrefNtwkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPrefNtwkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetUhPremDesgCd
   *
   * @return pol2RetUhPremDesgCd
   */
  public char[] getPol2RetUhPremDesgCd() throws CFException {
    if (isPol2RetUhPremDesgCdModified()) {
      pol2RetUhPremDesgCd = refreshPol2RetUhPremDesgCd();
    }
    return pol2RetUhPremDesgCd;
  }

  /**
   * set variable pol2RetUhPremDesgCd Corresponding COBOL Variable is POL2-RET-UH-PREM-DESG-CD
   *
   * @param value
   */
  public void setPol2RetUhPremDesgCd(char[] value) {
    pol2RetUhPremDesgCd = checkPol2RetUhPremDesgCdConstraints(value);
    serializePol2RetUhPremDesgCd(pol2RetUhPremDesgCd);
  }

  /**
   * Update Pol2RetUhPremDesgCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetUhPremDesgCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol2RetUhPremDesgCd, pol2RetUhPremDesgCd.length);
  }

  public void setPol2RetUhPremDesgCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetUhPremDesgCd, pol2RetUhPremDesgCd.length);
  }

  /**
   * Update Pol2RetUhPremDesgCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetUhPremDesgCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetUhPremDesgCd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetUhPremDesgCd with another Field
   *
   * @param value
   */
  public void setPol2RetUhPremDesgCd(Field source) {
    replace(source, 0, source.length(), beginPol2RetUhPremDesgCd, POL_2_RET_UH_PREM_DESG_CD_LEN);
  }

  /**
   * Update Pol2RetUhPremDesgCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetUhPremDesgCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetUhPremDesgCd, POL_2_RET_UH_PREM_DESG_CD_LEN);
  }

  /**
   * Update Pol2RetUhPremDesgCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetUhPremDesgCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetUhPremDesgCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetMnnrpInd
   *
   * @return pol2RetMnnrpInd
   */
  public char[] getPol2RetMnnrpInd() throws CFException {
    if (isPol2RetMnnrpIndModified()) {
      pol2RetMnnrpInd = refreshPol2RetMnnrpInd();
    }
    return pol2RetMnnrpInd;
  }

  /**
   * set variable pol2RetMnnrpInd Corresponding COBOL Variable is POL2-RET-MNNRP-IND
   *
   * @param value
   */
  public void setPol2RetMnnrpInd(char[] value) {
    pol2RetMnnrpInd = checkPol2RetMnnrpIndConstraints(value);
    serializePol2RetMnnrpInd(pol2RetMnnrpInd);
  }

  /**
   * Update Pol2RetMnnrpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetMnnrpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetMnnrpInd, pol2RetMnnrpInd.length);
  }

  public void setPol2RetMnnrpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMnnrpInd, pol2RetMnnrpInd.length);
  }

  /**
   * Update Pol2RetMnnrpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMnnrpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMnnrpInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetMnnrpInd with another Field
   *
   * @param value
   */
  public void setPol2RetMnnrpInd(Field source) {
    replace(source, 0, source.length(), beginPol2RetMnnrpInd, POL_2_RET_MNNRP_IND_LEN);
  }

  /**
   * Update Pol2RetMnnrpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetMnnrpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMnnrpInd, POL_2_RET_MNNRP_IND_LEN);
  }

  /**
   * Update Pol2RetMnnrpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMnnrpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMnnrpInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetMnnrpPct
   *
   * @return pol2RetMnnrpPct
   */
  public int getPol2RetMnnrpPct() throws CFException {
    if (isPol2RetMnnrpPctModified()) {
      pol2RetMnnrpPct = refreshPol2RetMnnrpPct();
    }
    return pol2RetMnnrpPct;
  }

  /**
   * Update Pol2RetMnnrpPct with the passed value Corresponding COBOL Variable is POL2-RET-MNNRP-PCT
   *
   * @param number
   */
  public void setPol2RetMnnrpPct(int number) {
    // Truncate if the number is beyond +/- Max range
    pol2RetMnnrpPct = checkPol2RetMnnrpPctMaxLimit(number);
    serializePol2RetMnnrpPct(pol2RetMnnrpPct);
  }

  public void setPol2RetMnnrpPct(long number) {
    number = checkPol2RetMnnrpPctMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol2RetMnnrpPct((int) number);
  }

  /**
   * Update Pol2RetMnnrpPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetMnnrpPct(char[] value) throws CFException {
    pol2RetMnnrpPct = serializePol2RetMnnrpPct(value);
  }
  /**
   * Update Pol2RetMnnrpPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetMnnrpPctString(char[] value) throws CFException {
    setPol2RetMnnrpPct(value);
  }
  /**
   * Returns the value of pol2RetNonEmb
   *
   * @return pol2RetNonEmb
   */
  public char[] getPol2RetNonEmb() throws CFException {
    if (isPol2RetNonEmbModified()) {
      pol2RetNonEmb = refreshPol2RetNonEmb();
    }
    return pol2RetNonEmb;
  }

  /**
   * set variable pol2RetNonEmb Corresponding COBOL Variable is POL2-RET-NON-EMB
   *
   * @param value
   */
  public void setPol2RetNonEmb(char[] value) {
    pol2RetNonEmb = checkPol2RetNonEmbConstraints(value);
    serializePol2RetNonEmb(pol2RetNonEmb);
  }

  /**
   * Update Pol2RetNonEmb with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetNonEmb(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetNonEmb, pol2RetNonEmb.length);
  }

  public void setPol2RetNonEmb(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetNonEmb, pol2RetNonEmb.length);
  }

  /**
   * Update Pol2RetNonEmb with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetNonEmb(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetNonEmb + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetNonEmb with another Field
   *
   * @param value
   */
  public void setPol2RetNonEmb(Field source) {
    replace(source, 0, source.length(), beginPol2RetNonEmb, POL_2_RET_NON_EMB_LEN);
  }

  /**
   * Update Pol2RetNonEmb with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetNonEmb(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetNonEmb, POL_2_RET_NON_EMB_LEN);
  }

  /**
   * Update Pol2RetNonEmb with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetNonEmb(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetNonEmb + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetLftmMaxAmt
   *
   * @return pol2RetLftmMaxAmt
   */
  public long getPol2RetLftmMaxAmt() throws CFException {
    if (isPol2RetLftmMaxAmtModified()) {
      pol2RetLftmMaxAmt = refreshPol2RetLftmMaxAmt();
    }
    return pol2RetLftmMaxAmt;
  }

  /**
   * Update Pol2RetLftmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL2-RET-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setPol2RetLftmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2RetLftmMaxAmt = checkPol2RetLftmMaxAmtMaxLimit(number);
    serializePol2RetLftmMaxAmt(pol2RetLftmMaxAmt);
  }

  /**
   * Update Pol2RetLftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetLftmMaxAmt(char[] value) throws CFException {
    pol2RetLftmMaxAmt = serializePol2RetLftmMaxAmt(value);
  }
  /**
   * Update Pol2RetLftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetLftmMaxAmtString(char[] value) throws CFException {
    setPol2RetLftmMaxAmt(value);
  }
  /**
   * Returns the value of pol2RetTier1LftmMaxAmt
   *
   * @return pol2RetTier1LftmMaxAmt
   */
  public long getPol2RetTier1LftmMaxAmt() throws CFException {
    if (isPol2RetTier1LftmMaxAmtModified()) {
      pol2RetTier1LftmMaxAmt = refreshPol2RetTier1LftmMaxAmt();
    }
    return pol2RetTier1LftmMaxAmt;
  }

  /**
   * Update Pol2RetTier1LftmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL2-RET-TIER-1-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setPol2RetTier1LftmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2RetTier1LftmMaxAmt = checkPol2RetTier1LftmMaxAmtMaxLimit(number);
    serializePol2RetTier1LftmMaxAmt(pol2RetTier1LftmMaxAmt);
  }

  /**
   * Update Pol2RetTier1LftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetTier1LftmMaxAmt(char[] value) throws CFException {
    pol2RetTier1LftmMaxAmt = serializePol2RetTier1LftmMaxAmt(value);
  }
  /**
   * Update Pol2RetTier1LftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetTier1LftmMaxAmtString(char[] value) throws CFException {
    setPol2RetTier1LftmMaxAmt(value);
  }
  /**
   * Returns the value of pol2RetDualOopNbrInd
   *
   * @return pol2RetDualOopNbrInd
   */
  public char[] getPol2RetDualOopNbrInd() throws CFException {
    if (isPol2RetDualOopNbrIndModified()) {
      pol2RetDualOopNbrInd = refreshPol2RetDualOopNbrInd();
    }
    return pol2RetDualOopNbrInd;
  }

  /**
   * set variable pol2RetDualOopNbrInd Corresponding COBOL Variable is POL2-RET-DUAL-OOP-NBR-IND
   *
   * @param value
   */
  public void setPol2RetDualOopNbrInd(char[] value) {
    pol2RetDualOopNbrInd = checkPol2RetDualOopNbrIndConstraints(value);
    serializePol2RetDualOopNbrInd(pol2RetDualOopNbrInd);
  }

  /**
   * Update Pol2RetDualOopNbrInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetDualOopNbrInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol2RetDualOopNbrInd, pol2RetDualOopNbrInd.length);
  }

  public void setPol2RetDualOopNbrInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetDualOopNbrInd, pol2RetDualOopNbrInd.length);
  }

  /**
   * Update Pol2RetDualOopNbrInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetDualOopNbrInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetDualOopNbrInd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetDualOopNbrInd with another Field
   *
   * @param value
   */
  public void setPol2RetDualOopNbrInd(Field source) {
    replace(source, 0, source.length(), beginPol2RetDualOopNbrInd, POL_2_RET_DUAL_OOP_NBR_IND_LEN);
  }

  /**
   * Update Pol2RetDualOopNbrInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetDualOopNbrInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetDualOopNbrInd, POL_2_RET_DUAL_OOP_NBR_IND_LEN);
  }

  /**
   * Update Pol2RetDualOopNbrInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetDualOopNbrInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetDualOopNbrInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetPsyLftmCnfmMaxAmt
   *
   * @return pol2RetPsyLftmCnfmMaxAmt
   */
  public long getPol2RetPsyLftmCnfmMaxAmt() throws CFException {
    if (isPol2RetPsyLftmCnfmMaxAmtModified()) {
      pol2RetPsyLftmCnfmMaxAmt = refreshPol2RetPsyLftmCnfmMaxAmt();
    }
    return pol2RetPsyLftmCnfmMaxAmt;
  }

  /**
   * Update Pol2RetPsyLftmCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL2-RET-PSY-LFTM-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol2RetPsyLftmCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2RetPsyLftmCnfmMaxAmt = checkPol2RetPsyLftmCnfmMaxAmtMaxLimit(number);
    serializePol2RetPsyLftmCnfmMaxAmt(pol2RetPsyLftmCnfmMaxAmt);
  }

  /**
   * Update Pol2RetPsyLftmCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetPsyLftmCnfmMaxAmt(char[] value) throws CFException {
    pol2RetPsyLftmCnfmMaxAmt = serializePol2RetPsyLftmCnfmMaxAmt(value);
  }
  /**
   * Update Pol2RetPsyLftmCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetPsyLftmCnfmMaxAmtString(char[] value) throws CFException {
    setPol2RetPsyLftmCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol2PsyLftmNonCnfmMaxAmt
   *
   * @return pol2PsyLftmNonCnfmMaxAmt
   */
  public long getPol2PsyLftmNonCnfmMaxAmt() throws CFException {
    if (isPol2PsyLftmNonCnfmMaxAmtModified()) {
      pol2PsyLftmNonCnfmMaxAmt = refreshPol2PsyLftmNonCnfmMaxAmt();
    }
    return pol2PsyLftmNonCnfmMaxAmt;
  }

  /**
   * Update Pol2PsyLftmNonCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL2-PSY-LFTM-NON-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol2PsyLftmNonCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2PsyLftmNonCnfmMaxAmt = checkPol2PsyLftmNonCnfmMaxAmtMaxLimit(number);
    serializePol2PsyLftmNonCnfmMaxAmt(pol2PsyLftmNonCnfmMaxAmt);
  }

  /**
   * Update Pol2PsyLftmNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyLftmNonCnfmMaxAmt(char[] value) throws CFException {
    pol2PsyLftmNonCnfmMaxAmt = serializePol2PsyLftmNonCnfmMaxAmt(value);
  }
  /**
   * Update Pol2PsyLftmNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyLftmNonCnfmMaxAmtString(char[] value) throws CFException {
    setPol2PsyLftmNonCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol2PsyLftmCombPrscMxAmt
   *
   * @return pol2PsyLftmCombPrscMxAmt
   */
  public long getPol2PsyLftmCombPrscMxAmt() throws CFException {
    if (isPol2PsyLftmCombPrscMxAmtModified()) {
      pol2PsyLftmCombPrscMxAmt = refreshPol2PsyLftmCombPrscMxAmt();
    }
    return pol2PsyLftmCombPrscMxAmt;
  }

  /**
   * Update Pol2PsyLftmCombPrscMxAmt with the passed value Corresponding COBOL Variable is
   * POL2-PSY-LFTM-COMB-PRSC-MX-AMT
   *
   * @param number
   */
  public void setPol2PsyLftmCombPrscMxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2PsyLftmCombPrscMxAmt = checkPol2PsyLftmCombPrscMxAmtMaxLimit(number);
    serializePol2PsyLftmCombPrscMxAmt(pol2PsyLftmCombPrscMxAmt);
  }

  /**
   * Update Pol2PsyLftmCombPrscMxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyLftmCombPrscMxAmt(char[] value) throws CFException {
    pol2PsyLftmCombPrscMxAmt = serializePol2PsyLftmCombPrscMxAmt(value);
  }
  /**
   * Update Pol2PsyLftmCombPrscMxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyLftmCombPrscMxAmtString(char[] value) throws CFException {
    setPol2PsyLftmCombPrscMxAmt(value);
  }
  /**
   * Returns the value of pol2RetPsyCyrCnfmMaxAmt
   *
   * @return pol2RetPsyCyrCnfmMaxAmt
   */
  public long getPol2RetPsyCyrCnfmMaxAmt() throws CFException {
    if (isPol2RetPsyCyrCnfmMaxAmtModified()) {
      pol2RetPsyCyrCnfmMaxAmt = refreshPol2RetPsyCyrCnfmMaxAmt();
    }
    return pol2RetPsyCyrCnfmMaxAmt;
  }

  /**
   * Update Pol2RetPsyCyrCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL2-RET-PSY-CYR-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol2RetPsyCyrCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2RetPsyCyrCnfmMaxAmt = checkPol2RetPsyCyrCnfmMaxAmtMaxLimit(number);
    serializePol2RetPsyCyrCnfmMaxAmt(pol2RetPsyCyrCnfmMaxAmt);
  }

  /**
   * Update Pol2RetPsyCyrCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetPsyCyrCnfmMaxAmt(char[] value) throws CFException {
    pol2RetPsyCyrCnfmMaxAmt = serializePol2RetPsyCyrCnfmMaxAmt(value);
  }
  /**
   * Update Pol2RetPsyCyrCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2RetPsyCyrCnfmMaxAmtString(char[] value) throws CFException {
    setPol2RetPsyCyrCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol2PsyCyrCombPrscMaxAmt
   *
   * @return pol2PsyCyrCombPrscMaxAmt
   */
  public long getPol2PsyCyrCombPrscMaxAmt() throws CFException {
    if (isPol2PsyCyrCombPrscMaxAmtModified()) {
      pol2PsyCyrCombPrscMaxAmt = refreshPol2PsyCyrCombPrscMaxAmt();
    }
    return pol2PsyCyrCombPrscMaxAmt;
  }

  /**
   * Update Pol2PsyCyrCombPrscMaxAmt with the passed value Corresponding COBOL Variable is
   * POL2-PSY-CYR-COMB-PRSC-MAX-AMT
   *
   * @param number
   */
  public void setPol2PsyCyrCombPrscMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2PsyCyrCombPrscMaxAmt = checkPol2PsyCyrCombPrscMaxAmtMaxLimit(number);
    serializePol2PsyCyrCombPrscMaxAmt(pol2PsyCyrCombPrscMaxAmt);
  }

  /**
   * Update Pol2PsyCyrCombPrscMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyCyrCombPrscMaxAmt(char[] value) throws CFException {
    pol2PsyCyrCombPrscMaxAmt = serializePol2PsyCyrCombPrscMaxAmt(value);
  }
  /**
   * Update Pol2PsyCyrCombPrscMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyCyrCombPrscMaxAmtString(char[] value) throws CFException {
    setPol2PsyCyrCombPrscMaxAmt(value);
  }
  /**
   * Returns the value of pol2PsyCyrNonCnfmMaxAmt
   *
   * @return pol2PsyCyrNonCnfmMaxAmt
   */
  public long getPol2PsyCyrNonCnfmMaxAmt() throws CFException {
    if (isPol2PsyCyrNonCnfmMaxAmtModified()) {
      pol2PsyCyrNonCnfmMaxAmt = refreshPol2PsyCyrNonCnfmMaxAmt();
    }
    return pol2PsyCyrNonCnfmMaxAmt;
  }

  /**
   * Update Pol2PsyCyrNonCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL2-PSY-CYR-NON-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol2PsyCyrNonCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol2PsyCyrNonCnfmMaxAmt = checkPol2PsyCyrNonCnfmMaxAmtMaxLimit(number);
    serializePol2PsyCyrNonCnfmMaxAmt(pol2PsyCyrNonCnfmMaxAmt);
  }

  /**
   * Update Pol2PsyCyrNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyCyrNonCnfmMaxAmt(char[] value) throws CFException {
    pol2PsyCyrNonCnfmMaxAmt = serializePol2PsyCyrNonCnfmMaxAmt(value);
  }
  /**
   * Update Pol2PsyCyrNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol2PsyCyrNonCnfmMaxAmtString(char[] value) throws CFException {
    setPol2PsyCyrNonCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol2RetMbrNtwkKeyMtchCd
   *
   * @return pol2RetMbrNtwkKeyMtchCd
   */
  public char[] getPol2RetMbrNtwkKeyMtchCd() throws CFException {
    if (isPol2RetMbrNtwkKeyMtchCdModified()) {
      pol2RetMbrNtwkKeyMtchCd = refreshPol2RetMbrNtwkKeyMtchCd();
    }
    return pol2RetMbrNtwkKeyMtchCd;
  }

  /**
   * set variable pol2RetMbrNtwkKeyMtchCd Corresponding COBOL Variable is
   * POL2-RET-MBR-NTWK-KEY-MTCH-CD
   *
   * @param value
   */
  public void setPol2RetMbrNtwkKeyMtchCd(char[] value) {
    pol2RetMbrNtwkKeyMtchCd = checkPol2RetMbrNtwkKeyMtchCdConstraints(value);
    serializePol2RetMbrNtwkKeyMtchCd(pol2RetMbrNtwkKeyMtchCd);
  }

  /**
   * Update Pol2RetMbrNtwkKeyMtchCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetMbrNtwkKeyMtchCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol2RetMbrNtwkKeyMtchCd,
        pol2RetMbrNtwkKeyMtchCd.length);
  }

  public void setPol2RetMbrNtwkKeyMtchCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetMbrNtwkKeyMtchCd,
        pol2RetMbrNtwkKeyMtchCd.length);
  }

  /**
   * Update Pol2RetMbrNtwkKeyMtchCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMbrNtwkKeyMtchCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMbrNtwkKeyMtchCd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetMbrNtwkKeyMtchCd with another Field
   *
   * @param value
   */
  public void setPol2RetMbrNtwkKeyMtchCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol2RetMbrNtwkKeyMtchCd,
        POL_2_RET_MBR_NTWK_KEY_MTCH_CD_LEN);
  }

  /**
   * Update Pol2RetMbrNtwkKeyMtchCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetMbrNtwkKeyMtchCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol2RetMbrNtwkKeyMtchCd,
        POL_2_RET_MBR_NTWK_KEY_MTCH_CD_LEN);
  }

  /**
   * Update Pol2RetMbrNtwkKeyMtchCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetMbrNtwkKeyMtchCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMbrNtwkKeyMtchCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetDsesStTblNbr
   *
   * @return pol2RetDsesStTblNbr
   */
  public char[] getPol2RetDsesStTblNbr() throws CFException {
    if (isPol2RetDsesStTblNbrModified()) {
      pol2RetDsesStTblNbr = refreshPol2RetDsesStTblNbr();
    }
    return pol2RetDsesStTblNbr;
  }

  /**
   * set variable pol2RetDsesStTblNbr Corresponding COBOL Variable is POL2-RET-DSES-ST-TBL-NBR
   *
   * @param value
   */
  public void setPol2RetDsesStTblNbr(char[] value) {
    pol2RetDsesStTblNbr = checkPol2RetDsesStTblNbrConstraints(value);
    serializePol2RetDsesStTblNbr(pol2RetDsesStTblNbr);
  }

  /**
   * Update Pol2RetDsesStTblNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetDsesStTblNbr(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol2RetDsesStTblNbr, pol2RetDsesStTblNbr.length);
  }

  public void setPol2RetDsesStTblNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetDsesStTblNbr, pol2RetDsesStTblNbr.length);
  }

  /**
   * Update Pol2RetDsesStTblNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetDsesStTblNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetDsesStTblNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetDsesStTblNbr with another Field
   *
   * @param value
   */
  public void setPol2RetDsesStTblNbr(Field source) {
    replace(source, 0, source.length(), beginPol2RetDsesStTblNbr, POL_2_RET_DSES_ST_TBL_NBR_LEN);
  }

  /**
   * Update Pol2RetDsesStTblNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetDsesStTblNbr(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol2RetDsesStTblNbr, POL_2_RET_DSES_ST_TBL_NBR_LEN);
  }

  /**
   * Update Pol2RetDsesStTblNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetDsesStTblNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetDsesStTblNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetPlnAttr
   *
   * @return pol2RetPlnAttr
   */
  public char[] getPol2RetPlnAttr() throws CFException {
    if (isPol2RetPlnAttrModified()) {
      pol2RetPlnAttr = refreshPol2RetPlnAttr();
    }
    return pol2RetPlnAttr;
  }

  /**
   * set variable pol2RetPlnAttr Corresponding COBOL Variable is POL2-RET-PLN-ATTR
   *
   * @param value
   */
  public void setPol2RetPlnAttr(char[] value) {
    pol2RetPlnAttr = checkPol2RetPlnAttrConstraints(value);
    serializePol2RetPlnAttr(pol2RetPlnAttr);
  }

  /**
   * Update Pol2RetPlnAttr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetPlnAttr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetPlnAttr, pol2RetPlnAttr.length);
  }

  public void setPol2RetPlnAttr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPlnAttr, pol2RetPlnAttr.length);
  }

  /**
   * Update Pol2RetPlnAttr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetPlnAttr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPlnAttr + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetPlnAttr with another Field
   *
   * @param value
   */
  public void setPol2RetPlnAttr(Field source) {
    replace(source, 0, source.length(), beginPol2RetPlnAttr, POL_2_RET_PLN_ATTR_LEN);
  }

  /**
   * Update Pol2RetPlnAttr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetPlnAttr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPlnAttr, POL_2_RET_PLN_ATTR_LEN);
  }

  /**
   * Update Pol2RetPlnAttr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetPlnAttr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetPlnAttr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetOopMaxCovCd
   *
   * @return pol2RetOopMaxCovCd
   */
  public char[] getPol2RetOopMaxCovCd() throws CFException {
    if (isPol2RetOopMaxCovCdModified()) {
      pol2RetOopMaxCovCd = refreshPol2RetOopMaxCovCd();
    }
    return pol2RetOopMaxCovCd;
  }

  /**
   * set variable pol2RetOopMaxCovCd Corresponding COBOL Variable is POL2-RET-OOP-MAX-COV-CD
   *
   * @param value
   */
  public void setPol2RetOopMaxCovCd(char[] value) {
    pol2RetOopMaxCovCd = checkPol2RetOopMaxCovCdConstraints(value);
    serializePol2RetOopMaxCovCd(pol2RetOopMaxCovCd);
  }

  /**
   * Update Pol2RetOopMaxCovCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetOopMaxCovCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetOopMaxCovCd, pol2RetOopMaxCovCd.length);
  }

  public void setPol2RetOopMaxCovCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetOopMaxCovCd, pol2RetOopMaxCovCd.length);
  }

  /**
   * Update Pol2RetOopMaxCovCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetOopMaxCovCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetOopMaxCovCd + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetOopMaxCovCd with another Field
   *
   * @param value
   */
  public void setPol2RetOopMaxCovCd(Field source) {
    replace(source, 0, source.length(), beginPol2RetOopMaxCovCd, POL_2_RET_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update Pol2RetOopMaxCovCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetOopMaxCovCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetOopMaxCovCd, POL_2_RET_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update Pol2RetOopMaxCovCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetOopMaxCovCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetOopMaxCovCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetMxiEffDate
   *
   * @return pol2RetMxiEffDate
   */
  public char[] getPol2RetMxiEffDate() throws CFException {
    if (isPol2RetMxiEffDateModified()) {
      pol2RetMxiEffDate = refreshPol2RetMxiEffDate();
    }
    return pol2RetMxiEffDate;
  }

  /**
   * set variable pol2RetMxiEffDate Corresponding COBOL Variable is POL2-RET-MXI-EFF-DATE
   *
   * @param value
   */
  public void setPol2RetMxiEffDate(char[] value) {
    pol2RetMxiEffDate = checkPol2RetMxiEffDateConstraints(value);
    serializePol2RetMxiEffDate(pol2RetMxiEffDate);
  }

  /**
   * Update Pol2RetMxiEffDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEffDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetMxiEffDate, pol2RetMxiEffDate.length);
  }

  public void setPol2RetMxiEffDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEffDate, pol2RetMxiEffDate.length);
  }

  /**
   * Update Pol2RetMxiEffDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEffDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEffDate + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetMxiEffDate with another Field
   *
   * @param value
   */
  public void setPol2RetMxiEffDate(Field source) {
    replace(source, 0, source.length(), beginPol2RetMxiEffDate, POL_2_RET_MXI_EFF_DATE_LEN);
  }

  /**
   * Update Pol2RetMxiEffDate with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEffDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEffDate, POL_2_RET_MXI_EFF_DATE_LEN);
  }

  /**
   * Update Pol2RetMxiEffDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEffDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEffDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetMxiEndDate
   *
   * @return pol2RetMxiEndDate
   */
  public char[] getPol2RetMxiEndDate() throws CFException {
    if (isPol2RetMxiEndDateModified()) {
      pol2RetMxiEndDate = refreshPol2RetMxiEndDate();
    }
    return pol2RetMxiEndDate;
  }

  /**
   * set variable pol2RetMxiEndDate Corresponding COBOL Variable is POL2-RET-MXI-END-DATE
   *
   * @param value
   */
  public void setPol2RetMxiEndDate(char[] value) {
    pol2RetMxiEndDate = checkPol2RetMxiEndDateConstraints(value);
    serializePol2RetMxiEndDate(pol2RetMxiEndDate);
  }

  /**
   * Update Pol2RetMxiEndDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEndDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol2RetMxiEndDate, pol2RetMxiEndDate.length);
  }

  public void setPol2RetMxiEndDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEndDate, pol2RetMxiEndDate.length);
  }

  /**
   * Update Pol2RetMxiEndDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEndDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEndDate + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetMxiEndDate with another Field
   *
   * @param value
   */
  public void setPol2RetMxiEndDate(Field source) {
    replace(source, 0, source.length(), beginPol2RetMxiEndDate, POL_2_RET_MXI_END_DATE_LEN);
  }

  /**
   * Update Pol2RetMxiEndDate with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEndDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEndDate, POL_2_RET_MXI_END_DATE_LEN);
  }

  /**
   * Update Pol2RetMxiEndDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetMxiEndDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol2RetMxiEndDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol2RetReciprocityTable
   *
   * @return pol2RetReciprocityTable
   */
  public Pol2RetReciprocityTable getPol2RetReciprocityTable() {
    return pol2RetReciprocityTable;
  }
  /**
   * Update Pol2RetReciprocityTable with the passed value Corresponding COBOL Variable is
   * POL2-RET-RECIPROCITY-TABLE
   *
   * @param value
   */
  public void setPol2RetReciprocityTable(char[] value) {
    pol2RetReciprocityTable.setString(value);
  }

  /**
   * Update Pol2RetReciprocityTable with a String from an offset and length
   *
   * @param value
   */
  public void setPol2RetReciprocityTable(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        pol2RetReciprocityTable.begin,
        pol2RetReciprocityTable.length());
  }

  /**
   * Update Pol2RetReciprocityTable with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetReciprocityTable(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol2RetReciprocityTable.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetReciprocityTable with another Field
   *
   * @param value
   */
  public void setPol2RetReciprocityTable(Field source) {
    replace(
        source,
        0,
        source.length(),
        pol2RetReciprocityTable.begin,
        pol2RetReciprocityTable.length());
  }

  /**
   * Update Pol2RetReciprocityTable with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetReciprocityTable(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        pol2RetReciprocityTable.begin,
        pol2RetReciprocityTable.length());
  }

  /**
   * Update Pol2RetReciprocityTable with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol2RetReciprocityTable(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol2RetReciprocityTable.begin + targetIndex, targetLen);
  }

  /**
   * initializes Pol2RetArea2 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol2RetProrationInd(CONSTANTS.SPACE);
    setPol2RetProrationEvent(CONSTANTS.SPACE);
    setPol2RetProductInd(CONSTANTS.SPACE_3);
    setPol2RetPrefNtwkCd(CONSTANTS.SPACE);
    setPol2RetUhPremDesgCd(CONSTANTS.SPACE);
    setPol2RetMnnrpInd(CONSTANTS.SPACE);
    setPol2RetMnnrpPct(0);
    setPol2RetNonEmb(CONSTANTS.SPACE);
    setPol2RetLftmMaxAmt(0);
    setPol2RetTier1LftmMaxAmt(0);
    setPol2RetDualOopNbrInd(CONSTANTS.SPACE);
    setPol2RetPsyLftmCnfmMaxAmt(0);
    setPol2PsyLftmNonCnfmMaxAmt(0);
    setPol2PsyLftmCombPrscMxAmt(0);
    setPol2RetPsyCyrCnfmMaxAmt(0);
    setPol2PsyCyrCombPrscMaxAmt(0);
    setPol2PsyCyrNonCnfmMaxAmt(0);
    setPol2RetMbrNtwkKeyMtchCd(CONSTANTS.SPACE);
    setPol2RetDsesStTblNbr(CONSTANTS.SPACE_6);
    setPol2RetPlnAttr(CONSTANTS.SPACE_2);
    setPol2RetOopMaxCovCd(CONSTANTS.SPACE);
    setPol2RetMxiEffDate(CONSTANTS.SPACE_8);
    setPol2RetMxiEndDate(CONSTANTS.SPACE_8);
    pol2RetReciprocityTable.initialize();
  }

  public static int getPol2RetArea2FieldLength() {
    return POL_2_RET_AREA_2_LENGTH;
  }
}
