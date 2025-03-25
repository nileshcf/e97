package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol8RetArea2 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class Pol8RetArea2 extends Pol8RetArea2Serialized {

  private char[] pol8RetProrationInd = Field.fillLowValue(1);

  private char[] pol8RetProrationEvent = Field.fillLowValue(1);

  private char[] pol8RetProductInd = Field.fillLowValue(3);

  private char[] pol8RetPrefNtwkCd = Field.fillLowValue(1);

  private char[] pol8RetReverseTieredInd = Field.fillLowValue(1);

  private char[] pol8RetUhPremDesgCd = Field.fillLowValue(1);

  private char[] pol8RetMnnrpInd = Field.fillLowValue(1);

  private int pol8RetMnnrpPct;

  private char[] pol8RetNonEmb = Field.fillLowValue(1);

  private long pol8RetLftmMaxAmt;

  private long pol8RetTier1LftmMaxAmt;

  private char[] pol8RetDualOopNbrInd = Field.fillLowValue(1);

  private long pol8RetPsyLftmCnfmMaxAmt;

  private long pol8PsyLftmNonCnfmMaxAmt;

  private long pol8PsyLftmCombPrscMxAmt;

  private long pol8RetPsyCyrCnfmMaxAmt;

  private long pol8PsyCyrCombPrscMaxAmt;

  private long pol8PsyCyrNonCnfmMaxAmt;

  private char[] pol8RetMbrNtwkKeyMtchCd = Field.fillLowValue(1);

  private char[] pol8RetDsesStTblNbr = Field.fillLowValue(6);

  private char[] pol8RetPlnAttr = Field.fillLowValue(2);

  private char[] pol8RetOopMaxCovCd = Field.fillLowValue(1);

  private char[] pol8RetMxiEffDate = Field.fillLowValue(8);

  private char[] pol8RetMxiEndDate = Field.fillLowValue(8);

  private char[] pol8RetTciTableNumber = Field.fillLowValue(6);

  private char[] pol8RetPlnFturInd = Field.fillLowValue(1);

  private char[] pol8RetPolicyKey = Field.fillLowValue(6);

  private char[] pol8RetPlanKey = Field.fillLowValue(4);

  private char[] pol8RetClassKey = Field.fillLowValue(4);

  private char[] pol8RetCovTypKey = Field.fillLowValue(1);

  private long pol8RetOonLftmMaxAmt;

  private char[] pol8RetContrBaseTierCd = Field.fillLowValue(1);

  private char[] pol8RetReferralInd = Field.fillLowValue(1);

  private char[] pol8NhpNtwkFlexInd = Field.fillLowValue(1);

  private char[] pol8RetProductCd = Field.fillLowValue(3);

  private char[] pol8RetMktTypCd = Field.fillLowValue(2);

  private char[] pol8NptRulePkgId = Field.fillLowValue(6);

  private char[] pol8PrefLabNtwkInd = Field.fillLowValue(6);

  private char[] pol8RetContractState = Field.fillLowValue(2);

  private char[] pol8RetFundTypCd = Field.fillLowValue(1);

  private char[] pol8RetFaclShrSvCd = Field.fillLowValue(1);

  private char[] pol8RetPhysnShrSvCd = Field.fillLowValue(1);

  private char[] pol8RetPhrmCpnInd = Field.fillLowValue(1);

  private char[] pol8DesgDiagProvCd = Field.fillLowValue(1);

  private char[] pol8RetMedCpnCd = Field.fillLowValue(1);

  /** Constructor for Pol8RetArea2 */
  public Pol8RetArea2() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol8RetArea2. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol8RetArea2(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol8RetProrationInd
   *
   * @return pol8RetProrationInd
   */
  public char[] getPol8RetProrationInd() throws CFException {
    if (isPol8RetProrationIndModified()) {
      pol8RetProrationInd = refreshPol8RetProrationInd();
    }
    return pol8RetProrationInd;
  }

  /**
   * set variable pol8RetProrationInd Corresponding COBOL Variable is POL8-RET-PRORATION-IND
   *
   * @param value
   */
  public void setPol8RetProrationInd(char[] value) {
    pol8RetProrationInd = checkPol8RetProrationIndConstraints(value);
    serializePol8RetProrationInd(pol8RetProrationInd);
  }

  /**
   * Update Pol8RetProrationInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetProrationInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol8RetProrationInd, pol8RetProrationInd.length);
  }

  public void setPol8RetProrationInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProrationInd, pol8RetProrationInd.length);
  }

  /**
   * Update Pol8RetProrationInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetProrationInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProrationInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetProrationInd with another Field
   *
   * @param value
   */
  public void setPol8RetProrationInd(Field source) {
    replace(source, 0, source.length(), beginPol8RetProrationInd, POL_8_RET_PRORATION_IND_LEN);
  }

  /**
   * Update Pol8RetProrationInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetProrationInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProrationInd, POL_8_RET_PRORATION_IND_LEN);
  }

  /**
   * Update Pol8RetProrationInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetProrationInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProrationInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetProrationEvent
   *
   * @return pol8RetProrationEvent
   */
  public char[] getPol8RetProrationEvent() throws CFException {
    if (isPol8RetProrationEventModified()) {
      pol8RetProrationEvent = refreshPol8RetProrationEvent();
    }
    return pol8RetProrationEvent;
  }

  /**
   * set variable pol8RetProrationEvent Corresponding COBOL Variable is POL8-RET-PRORATION-EVENT
   *
   * @param value
   */
  public void setPol8RetProrationEvent(char[] value) {
    pol8RetProrationEvent = checkPol8RetProrationEventConstraints(value);
    serializePol8RetProrationEvent(pol8RetProrationEvent);
  }

  /**
   * Update Pol8RetProrationEvent with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetProrationEvent(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol8RetProrationEvent,
        pol8RetProrationEvent.length);
  }

  public void setPol8RetProrationEvent(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetProrationEvent, pol8RetProrationEvent.length);
  }

  /**
   * Update Pol8RetProrationEvent with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetProrationEvent(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProrationEvent + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetProrationEvent with another Field
   *
   * @param value
   */
  public void setPol8RetProrationEvent(Field source) {
    replace(source, 0, source.length(), beginPol8RetProrationEvent, POL_8_RET_PRORATION_EVENT_LEN);
  }

  /**
   * Update Pol8RetProrationEvent with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetProrationEvent(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetProrationEvent, POL_8_RET_PRORATION_EVENT_LEN);
  }

  /**
   * Update Pol8RetProrationEvent with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol8RetProrationEvent(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProrationEvent + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetProductInd
   *
   * @return pol8RetProductInd
   */
  public char[] getPol8RetProductInd() throws CFException {
    if (isPol8RetProductIndModified()) {
      pol8RetProductInd = refreshPol8RetProductInd();
    }
    return pol8RetProductInd;
  }

  /**
   * set variable pol8RetProductInd Corresponding COBOL Variable is POL8-RET-PRODUCT-IND
   *
   * @param value
   */
  public void setPol8RetProductInd(char[] value) {
    pol8RetProductInd = checkPol8RetProductIndConstraints(value);
    serializePol8RetProductInd(pol8RetProductInd);
  }

  /**
   * Update Pol8RetProductInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetProductInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetProductInd, pol8RetProductInd.length);
  }

  public void setPol8RetProductInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductInd, pol8RetProductInd.length);
  }

  /**
   * Update Pol8RetProductInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetProductInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetProductInd with another Field
   *
   * @param value
   */
  public void setPol8RetProductInd(Field source) {
    replace(source, 0, source.length(), beginPol8RetProductInd, POL_8_RET_PRODUCT_IND_LEN);
  }

  /**
   * Update Pol8RetProductInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetProductInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductInd, POL_8_RET_PRODUCT_IND_LEN);
  }

  /**
   * Update Pol8RetProductInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetProductInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPrefNtwkCd
   *
   * @return pol8RetPrefNtwkCd
   */
  public char[] getPol8RetPrefNtwkCd() throws CFException {
    if (isPol8RetPrefNtwkCdModified()) {
      pol8RetPrefNtwkCd = refreshPol8RetPrefNtwkCd();
    }
    return pol8RetPrefNtwkCd;
  }

  /**
   * set variable pol8RetPrefNtwkCd Corresponding COBOL Variable is POL8-RET-PREF-NTWK-CD
   *
   * @param value
   */
  public void setPol8RetPrefNtwkCd(char[] value) {
    pol8RetPrefNtwkCd = checkPol8RetPrefNtwkCdConstraints(value);
    serializePol8RetPrefNtwkCd(pol8RetPrefNtwkCd);
  }

  /**
   * Update Pol8RetPrefNtwkCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetPrefNtwkCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetPrefNtwkCd, pol8RetPrefNtwkCd.length);
  }

  public void setPol8RetPrefNtwkCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPrefNtwkCd, pol8RetPrefNtwkCd.length);
  }

  /**
   * Update Pol8RetPrefNtwkCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPrefNtwkCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPrefNtwkCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetPrefNtwkCd with another Field
   *
   * @param value
   */
  public void setPol8RetPrefNtwkCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetPrefNtwkCd, POL_8_RET_PREF_NTWK_CD_LEN);
  }

  /**
   * Update Pol8RetPrefNtwkCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetPrefNtwkCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPrefNtwkCd, POL_8_RET_PREF_NTWK_CD_LEN);
  }

  /**
   * Update Pol8RetPrefNtwkCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPrefNtwkCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPrefNtwkCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetReverseTieredInd
   *
   * @return pol8RetReverseTieredInd
   */
  public char[] getPol8RetReverseTieredInd() throws CFException {
    if (isPol8RetReverseTieredIndModified()) {
      pol8RetReverseTieredInd = refreshPol8RetReverseTieredInd();
    }
    return pol8RetReverseTieredInd;
  }

  /**
   * set variable pol8RetReverseTieredInd Corresponding COBOL Variable is
   * POL8-RET-REVERSE-TIERED-IND
   *
   * @param value
   */
  public void setPol8RetReverseTieredInd(char[] value) {
    pol8RetReverseTieredInd = checkPol8RetReverseTieredIndConstraints(value);
    serializePol8RetReverseTieredInd(pol8RetReverseTieredInd);
  }

  /**
   * Update Pol8RetReverseTieredInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetReverseTieredInd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol8RetReverseTieredInd,
        pol8RetReverseTieredInd.length);
  }

  public void setPol8RetReverseTieredInd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol8RetReverseTieredInd,
        pol8RetReverseTieredInd.length);
  }

  /**
   * Update Pol8RetReverseTieredInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetReverseTieredInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetReverseTieredInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetReverseTieredInd with another Field
   *
   * @param value
   */
  public void setPol8RetReverseTieredInd(Field source) {
    replace(
        source, 0, source.length(), beginPol8RetReverseTieredInd, POL_8_RET_REVERSE_TIERED_IND_LEN);
  }

  /**
   * Update Pol8RetReverseTieredInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetReverseTieredInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol8RetReverseTieredInd,
        POL_8_RET_REVERSE_TIERED_IND_LEN);
  }

  /**
   * Update Pol8RetReverseTieredInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol8RetReverseTieredInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetReverseTieredInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetUhPremDesgCd
   *
   * @return pol8RetUhPremDesgCd
   */
  public char[] getPol8RetUhPremDesgCd() throws CFException {
    if (isPol8RetUhPremDesgCdModified()) {
      pol8RetUhPremDesgCd = refreshPol8RetUhPremDesgCd();
    }
    return pol8RetUhPremDesgCd;
  }

  /**
   * set variable pol8RetUhPremDesgCd Corresponding COBOL Variable is POL8-RET-UH-PREM-DESG-CD
   *
   * @param value
   */
  public void setPol8RetUhPremDesgCd(char[] value) {
    pol8RetUhPremDesgCd = checkPol8RetUhPremDesgCdConstraints(value);
    serializePol8RetUhPremDesgCd(pol8RetUhPremDesgCd);
  }

  /**
   * Update Pol8RetUhPremDesgCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetUhPremDesgCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol8RetUhPremDesgCd, pol8RetUhPremDesgCd.length);
  }

  public void setPol8RetUhPremDesgCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetUhPremDesgCd, pol8RetUhPremDesgCd.length);
  }

  /**
   * Update Pol8RetUhPremDesgCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetUhPremDesgCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetUhPremDesgCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetUhPremDesgCd with another Field
   *
   * @param value
   */
  public void setPol8RetUhPremDesgCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetUhPremDesgCd, POL_8_RET_UH_PREM_DESG_CD_LEN);
  }

  /**
   * Update Pol8RetUhPremDesgCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetUhPremDesgCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetUhPremDesgCd, POL_8_RET_UH_PREM_DESG_CD_LEN);
  }

  /**
   * Update Pol8RetUhPremDesgCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetUhPremDesgCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetUhPremDesgCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetMnnrpInd
   *
   * @return pol8RetMnnrpInd
   */
  public char[] getPol8RetMnnrpInd() throws CFException {
    if (isPol8RetMnnrpIndModified()) {
      pol8RetMnnrpInd = refreshPol8RetMnnrpInd();
    }
    return pol8RetMnnrpInd;
  }

  /**
   * set variable pol8RetMnnrpInd Corresponding COBOL Variable is POL8-RET-MNNRP-IND
   *
   * @param value
   */
  public void setPol8RetMnnrpInd(char[] value) {
    pol8RetMnnrpInd = checkPol8RetMnnrpIndConstraints(value);
    serializePol8RetMnnrpInd(pol8RetMnnrpInd);
  }

  /**
   * Update Pol8RetMnnrpInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetMnnrpInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetMnnrpInd, pol8RetMnnrpInd.length);
  }

  public void setPol8RetMnnrpInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMnnrpInd, pol8RetMnnrpInd.length);
  }

  /**
   * Update Pol8RetMnnrpInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMnnrpInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMnnrpInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetMnnrpInd with another Field
   *
   * @param value
   */
  public void setPol8RetMnnrpInd(Field source) {
    replace(source, 0, source.length(), beginPol8RetMnnrpInd, POL_8_RET_MNNRP_IND_LEN);
  }

  /**
   * Update Pol8RetMnnrpInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetMnnrpInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMnnrpInd, POL_8_RET_MNNRP_IND_LEN);
  }

  /**
   * Update Pol8RetMnnrpInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMnnrpInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMnnrpInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetMnnrpPct
   *
   * @return pol8RetMnnrpPct
   */
  public int getPol8RetMnnrpPct() throws CFException {
    if (isPol8RetMnnrpPctModified()) {
      pol8RetMnnrpPct = refreshPol8RetMnnrpPct();
    }
    return pol8RetMnnrpPct;
  }

  /**
   * Update Pol8RetMnnrpPct with the passed value Corresponding COBOL Variable is POL8-RET-MNNRP-PCT
   *
   * @param number
   */
  public void setPol8RetMnnrpPct(int number) {
    // Truncate if the number is beyond +/- Max range
    pol8RetMnnrpPct = checkPol8RetMnnrpPctMaxLimit(number);
    serializePol8RetMnnrpPct(pol8RetMnnrpPct);
  }

  public void setPol8RetMnnrpPct(long number) {
    number = checkPol8RetMnnrpPctMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol8RetMnnrpPct((int) number);
  }

  /**
   * Update Pol8RetMnnrpPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetMnnrpPct(char[] value) throws CFException {
    pol8RetMnnrpPct = serializePol8RetMnnrpPct(value);
  }
  /**
   * Update Pol8RetMnnrpPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetMnnrpPctString(char[] value) throws CFException {
    setPol8RetMnnrpPct(value);
  }
  /**
   * Returns the value of pol8RetNonEmb
   *
   * @return pol8RetNonEmb
   */
  public char[] getPol8RetNonEmb() throws CFException {
    if (isPol8RetNonEmbModified()) {
      pol8RetNonEmb = refreshPol8RetNonEmb();
    }
    return pol8RetNonEmb;
  }

  /**
   * set variable pol8RetNonEmb Corresponding COBOL Variable is POL8-RET-NON-EMB
   *
   * @param value
   */
  public void setPol8RetNonEmb(char[] value) {
    pol8RetNonEmb = checkPol8RetNonEmbConstraints(value);
    serializePol8RetNonEmb(pol8RetNonEmb);
  }

  /**
   * Update Pol8RetNonEmb with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetNonEmb(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetNonEmb, pol8RetNonEmb.length);
  }

  public void setPol8RetNonEmb(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetNonEmb, pol8RetNonEmb.length);
  }

  /**
   * Update Pol8RetNonEmb with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetNonEmb(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetNonEmb + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetNonEmb with another Field
   *
   * @param value
   */
  public void setPol8RetNonEmb(Field source) {
    replace(source, 0, source.length(), beginPol8RetNonEmb, POL_8_RET_NON_EMB_LEN);
  }

  /**
   * Update Pol8RetNonEmb with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetNonEmb(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetNonEmb, POL_8_RET_NON_EMB_LEN);
  }

  /**
   * Update Pol8RetNonEmb with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetNonEmb(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetNonEmb + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetLftmMaxAmt
   *
   * @return pol8RetLftmMaxAmt
   */
  public long getPol8RetLftmMaxAmt() throws CFException {
    if (isPol8RetLftmMaxAmtModified()) {
      pol8RetLftmMaxAmt = refreshPol8RetLftmMaxAmt();
    }
    return pol8RetLftmMaxAmt;
  }

  /**
   * Update Pol8RetLftmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-RET-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setPol8RetLftmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8RetLftmMaxAmt = checkPol8RetLftmMaxAmtMaxLimit(number);
    serializePol8RetLftmMaxAmt(pol8RetLftmMaxAmt);
  }

  /**
   * Update Pol8RetLftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetLftmMaxAmt(char[] value) throws CFException {
    pol8RetLftmMaxAmt = serializePol8RetLftmMaxAmt(value);
  }
  /**
   * Update Pol8RetLftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetLftmMaxAmtString(char[] value) throws CFException {
    setPol8RetLftmMaxAmt(value);
  }
  /**
   * Returns the value of pol8RetTier1LftmMaxAmt
   *
   * @return pol8RetTier1LftmMaxAmt
   */
  public long getPol8RetTier1LftmMaxAmt() throws CFException {
    if (isPol8RetTier1LftmMaxAmtModified()) {
      pol8RetTier1LftmMaxAmt = refreshPol8RetTier1LftmMaxAmt();
    }
    return pol8RetTier1LftmMaxAmt;
  }

  /**
   * Update Pol8RetTier1LftmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-RET-TIER-1-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setPol8RetTier1LftmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8RetTier1LftmMaxAmt = checkPol8RetTier1LftmMaxAmtMaxLimit(number);
    serializePol8RetTier1LftmMaxAmt(pol8RetTier1LftmMaxAmt);
  }

  /**
   * Update Pol8RetTier1LftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetTier1LftmMaxAmt(char[] value) throws CFException {
    pol8RetTier1LftmMaxAmt = serializePol8RetTier1LftmMaxAmt(value);
  }
  /**
   * Update Pol8RetTier1LftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetTier1LftmMaxAmtString(char[] value) throws CFException {
    setPol8RetTier1LftmMaxAmt(value);
  }
  /**
   * Returns the value of pol8RetDualOopNbrInd
   *
   * @return pol8RetDualOopNbrInd
   */
  public char[] getPol8RetDualOopNbrInd() throws CFException {
    if (isPol8RetDualOopNbrIndModified()) {
      pol8RetDualOopNbrInd = refreshPol8RetDualOopNbrInd();
    }
    return pol8RetDualOopNbrInd;
  }

  /**
   * set variable pol8RetDualOopNbrInd Corresponding COBOL Variable is POL8-RET-DUAL-OOP-NBR-IND
   *
   * @param value
   */
  public void setPol8RetDualOopNbrInd(char[] value) {
    pol8RetDualOopNbrInd = checkPol8RetDualOopNbrIndConstraints(value);
    serializePol8RetDualOopNbrInd(pol8RetDualOopNbrInd);
  }

  /**
   * Update Pol8RetDualOopNbrInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetDualOopNbrInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol8RetDualOopNbrInd, pol8RetDualOopNbrInd.length);
  }

  public void setPol8RetDualOopNbrInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetDualOopNbrInd, pol8RetDualOopNbrInd.length);
  }

  /**
   * Update Pol8RetDualOopNbrInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetDualOopNbrInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetDualOopNbrInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetDualOopNbrInd with another Field
   *
   * @param value
   */
  public void setPol8RetDualOopNbrInd(Field source) {
    replace(source, 0, source.length(), beginPol8RetDualOopNbrInd, POL_8_RET_DUAL_OOP_NBR_IND_LEN);
  }

  /**
   * Update Pol8RetDualOopNbrInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetDualOopNbrInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetDualOopNbrInd, POL_8_RET_DUAL_OOP_NBR_IND_LEN);
  }

  /**
   * Update Pol8RetDualOopNbrInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol8RetDualOopNbrInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetDualOopNbrInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPsyLftmCnfmMaxAmt
   *
   * @return pol8RetPsyLftmCnfmMaxAmt
   */
  public long getPol8RetPsyLftmCnfmMaxAmt() throws CFException {
    if (isPol8RetPsyLftmCnfmMaxAmtModified()) {
      pol8RetPsyLftmCnfmMaxAmt = refreshPol8RetPsyLftmCnfmMaxAmt();
    }
    return pol8RetPsyLftmCnfmMaxAmt;
  }

  /**
   * Update Pol8RetPsyLftmCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-RET-PSY-LFTM-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol8RetPsyLftmCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8RetPsyLftmCnfmMaxAmt = checkPol8RetPsyLftmCnfmMaxAmtMaxLimit(number);
    serializePol8RetPsyLftmCnfmMaxAmt(pol8RetPsyLftmCnfmMaxAmt);
  }

  /**
   * Update Pol8RetPsyLftmCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetPsyLftmCnfmMaxAmt(char[] value) throws CFException {
    pol8RetPsyLftmCnfmMaxAmt = serializePol8RetPsyLftmCnfmMaxAmt(value);
  }
  /**
   * Update Pol8RetPsyLftmCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetPsyLftmCnfmMaxAmtString(char[] value) throws CFException {
    setPol8RetPsyLftmCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol8PsyLftmNonCnfmMaxAmt
   *
   * @return pol8PsyLftmNonCnfmMaxAmt
   */
  public long getPol8PsyLftmNonCnfmMaxAmt() throws CFException {
    if (isPol8PsyLftmNonCnfmMaxAmtModified()) {
      pol8PsyLftmNonCnfmMaxAmt = refreshPol8PsyLftmNonCnfmMaxAmt();
    }
    return pol8PsyLftmNonCnfmMaxAmt;
  }

  /**
   * Update Pol8PsyLftmNonCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-PSY-LFTM-NON-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol8PsyLftmNonCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8PsyLftmNonCnfmMaxAmt = checkPol8PsyLftmNonCnfmMaxAmtMaxLimit(number);
    serializePol8PsyLftmNonCnfmMaxAmt(pol8PsyLftmNonCnfmMaxAmt);
  }

  /**
   * Update Pol8PsyLftmNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyLftmNonCnfmMaxAmt(char[] value) throws CFException {
    pol8PsyLftmNonCnfmMaxAmt = serializePol8PsyLftmNonCnfmMaxAmt(value);
  }
  /**
   * Update Pol8PsyLftmNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyLftmNonCnfmMaxAmtString(char[] value) throws CFException {
    setPol8PsyLftmNonCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol8PsyLftmCombPrscMxAmt
   *
   * @return pol8PsyLftmCombPrscMxAmt
   */
  public long getPol8PsyLftmCombPrscMxAmt() throws CFException {
    if (isPol8PsyLftmCombPrscMxAmtModified()) {
      pol8PsyLftmCombPrscMxAmt = refreshPol8PsyLftmCombPrscMxAmt();
    }
    return pol8PsyLftmCombPrscMxAmt;
  }

  /**
   * Update Pol8PsyLftmCombPrscMxAmt with the passed value Corresponding COBOL Variable is
   * POL8-PSY-LFTM-COMB-PRSC-MX-AMT
   *
   * @param number
   */
  public void setPol8PsyLftmCombPrscMxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8PsyLftmCombPrscMxAmt = checkPol8PsyLftmCombPrscMxAmtMaxLimit(number);
    serializePol8PsyLftmCombPrscMxAmt(pol8PsyLftmCombPrscMxAmt);
  }

  /**
   * Update Pol8PsyLftmCombPrscMxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyLftmCombPrscMxAmt(char[] value) throws CFException {
    pol8PsyLftmCombPrscMxAmt = serializePol8PsyLftmCombPrscMxAmt(value);
  }
  /**
   * Update Pol8PsyLftmCombPrscMxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyLftmCombPrscMxAmtString(char[] value) throws CFException {
    setPol8PsyLftmCombPrscMxAmt(value);
  }
  /**
   * Returns the value of pol8RetPsyCyrCnfmMaxAmt
   *
   * @return pol8RetPsyCyrCnfmMaxAmt
   */
  public long getPol8RetPsyCyrCnfmMaxAmt() throws CFException {
    if (isPol8RetPsyCyrCnfmMaxAmtModified()) {
      pol8RetPsyCyrCnfmMaxAmt = refreshPol8RetPsyCyrCnfmMaxAmt();
    }
    return pol8RetPsyCyrCnfmMaxAmt;
  }

  /**
   * Update Pol8RetPsyCyrCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-RET-PSY-CYR-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol8RetPsyCyrCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8RetPsyCyrCnfmMaxAmt = checkPol8RetPsyCyrCnfmMaxAmtMaxLimit(number);
    serializePol8RetPsyCyrCnfmMaxAmt(pol8RetPsyCyrCnfmMaxAmt);
  }

  /**
   * Update Pol8RetPsyCyrCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetPsyCyrCnfmMaxAmt(char[] value) throws CFException {
    pol8RetPsyCyrCnfmMaxAmt = serializePol8RetPsyCyrCnfmMaxAmt(value);
  }
  /**
   * Update Pol8RetPsyCyrCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetPsyCyrCnfmMaxAmtString(char[] value) throws CFException {
    setPol8RetPsyCyrCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol8PsyCyrCombPrscMaxAmt
   *
   * @return pol8PsyCyrCombPrscMaxAmt
   */
  public long getPol8PsyCyrCombPrscMaxAmt() throws CFException {
    if (isPol8PsyCyrCombPrscMaxAmtModified()) {
      pol8PsyCyrCombPrscMaxAmt = refreshPol8PsyCyrCombPrscMaxAmt();
    }
    return pol8PsyCyrCombPrscMaxAmt;
  }

  /**
   * Update Pol8PsyCyrCombPrscMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-PSY-CYR-COMB-PRSC-MAX-AMT
   *
   * @param number
   */
  public void setPol8PsyCyrCombPrscMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8PsyCyrCombPrscMaxAmt = checkPol8PsyCyrCombPrscMaxAmtMaxLimit(number);
    serializePol8PsyCyrCombPrscMaxAmt(pol8PsyCyrCombPrscMaxAmt);
  }

  /**
   * Update Pol8PsyCyrCombPrscMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyCyrCombPrscMaxAmt(char[] value) throws CFException {
    pol8PsyCyrCombPrscMaxAmt = serializePol8PsyCyrCombPrscMaxAmt(value);
  }
  /**
   * Update Pol8PsyCyrCombPrscMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyCyrCombPrscMaxAmtString(char[] value) throws CFException {
    setPol8PsyCyrCombPrscMaxAmt(value);
  }
  /**
   * Returns the value of pol8PsyCyrNonCnfmMaxAmt
   *
   * @return pol8PsyCyrNonCnfmMaxAmt
   */
  public long getPol8PsyCyrNonCnfmMaxAmt() throws CFException {
    if (isPol8PsyCyrNonCnfmMaxAmtModified()) {
      pol8PsyCyrNonCnfmMaxAmt = refreshPol8PsyCyrNonCnfmMaxAmt();
    }
    return pol8PsyCyrNonCnfmMaxAmt;
  }

  /**
   * Update Pol8PsyCyrNonCnfmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-PSY-CYR-NON-CNFM-MAX-AMT
   *
   * @param number
   */
  public void setPol8PsyCyrNonCnfmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8PsyCyrNonCnfmMaxAmt = checkPol8PsyCyrNonCnfmMaxAmtMaxLimit(number);
    serializePol8PsyCyrNonCnfmMaxAmt(pol8PsyCyrNonCnfmMaxAmt);
  }

  /**
   * Update Pol8PsyCyrNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyCyrNonCnfmMaxAmt(char[] value) throws CFException {
    pol8PsyCyrNonCnfmMaxAmt = serializePol8PsyCyrNonCnfmMaxAmt(value);
  }
  /**
   * Update Pol8PsyCyrNonCnfmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8PsyCyrNonCnfmMaxAmtString(char[] value) throws CFException {
    setPol8PsyCyrNonCnfmMaxAmt(value);
  }
  /**
   * Returns the value of pol8RetMbrNtwkKeyMtchCd
   *
   * @return pol8RetMbrNtwkKeyMtchCd
   */
  public char[] getPol8RetMbrNtwkKeyMtchCd() throws CFException {
    if (isPol8RetMbrNtwkKeyMtchCdModified()) {
      pol8RetMbrNtwkKeyMtchCd = refreshPol8RetMbrNtwkKeyMtchCd();
    }
    return pol8RetMbrNtwkKeyMtchCd;
  }

  /**
   * set variable pol8RetMbrNtwkKeyMtchCd Corresponding COBOL Variable is
   * POL8-RET-MBR-NTWK-KEY-MTCH-CD
   *
   * @param value
   */
  public void setPol8RetMbrNtwkKeyMtchCd(char[] value) {
    pol8RetMbrNtwkKeyMtchCd = checkPol8RetMbrNtwkKeyMtchCdConstraints(value);
    serializePol8RetMbrNtwkKeyMtchCd(pol8RetMbrNtwkKeyMtchCd);
  }

  /**
   * Update Pol8RetMbrNtwkKeyMtchCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetMbrNtwkKeyMtchCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol8RetMbrNtwkKeyMtchCd,
        pol8RetMbrNtwkKeyMtchCd.length);
  }

  public void setPol8RetMbrNtwkKeyMtchCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol8RetMbrNtwkKeyMtchCd,
        pol8RetMbrNtwkKeyMtchCd.length);
  }

  /**
   * Update Pol8RetMbrNtwkKeyMtchCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMbrNtwkKeyMtchCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMbrNtwkKeyMtchCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetMbrNtwkKeyMtchCd with another Field
   *
   * @param value
   */
  public void setPol8RetMbrNtwkKeyMtchCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol8RetMbrNtwkKeyMtchCd,
        POL_8_RET_MBR_NTWK_KEY_MTCH_CD_LEN);
  }

  /**
   * Update Pol8RetMbrNtwkKeyMtchCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetMbrNtwkKeyMtchCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol8RetMbrNtwkKeyMtchCd,
        POL_8_RET_MBR_NTWK_KEY_MTCH_CD_LEN);
  }

  /**
   * Update Pol8RetMbrNtwkKeyMtchCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol8RetMbrNtwkKeyMtchCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMbrNtwkKeyMtchCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetDsesStTblNbr
   *
   * @return pol8RetDsesStTblNbr
   */
  public char[] getPol8RetDsesStTblNbr() throws CFException {
    if (isPol8RetDsesStTblNbrModified()) {
      pol8RetDsesStTblNbr = refreshPol8RetDsesStTblNbr();
    }
    return pol8RetDsesStTblNbr;
  }

  /**
   * set variable pol8RetDsesStTblNbr Corresponding COBOL Variable is POL8-RET-DSES-ST-TBL-NBR
   *
   * @param value
   */
  public void setPol8RetDsesStTblNbr(char[] value) {
    pol8RetDsesStTblNbr = checkPol8RetDsesStTblNbrConstraints(value);
    serializePol8RetDsesStTblNbr(pol8RetDsesStTblNbr);
  }

  /**
   * Update Pol8RetDsesStTblNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetDsesStTblNbr(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol8RetDsesStTblNbr, pol8RetDsesStTblNbr.length);
  }

  public void setPol8RetDsesStTblNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetDsesStTblNbr, pol8RetDsesStTblNbr.length);
  }

  /**
   * Update Pol8RetDsesStTblNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetDsesStTblNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetDsesStTblNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetDsesStTblNbr with another Field
   *
   * @param value
   */
  public void setPol8RetDsesStTblNbr(Field source) {
    replace(source, 0, source.length(), beginPol8RetDsesStTblNbr, POL_8_RET_DSES_ST_TBL_NBR_LEN);
  }

  /**
   * Update Pol8RetDsesStTblNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetDsesStTblNbr(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetDsesStTblNbr, POL_8_RET_DSES_ST_TBL_NBR_LEN);
  }

  /**
   * Update Pol8RetDsesStTblNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetDsesStTblNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetDsesStTblNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPlnAttr
   *
   * @return pol8RetPlnAttr
   */
  public char[] getPol8RetPlnAttr() throws CFException {
    if (isPol8RetPlnAttrModified()) {
      pol8RetPlnAttr = refreshPol8RetPlnAttr();
    }
    return pol8RetPlnAttr;
  }

  /**
   * set variable pol8RetPlnAttr Corresponding COBOL Variable is POL8-RET-PLN-ATTR
   *
   * @param value
   */
  public void setPol8RetPlnAttr(char[] value) {
    pol8RetPlnAttr = checkPol8RetPlnAttrConstraints(value);
    serializePol8RetPlnAttr(pol8RetPlnAttr);
  }

  /**
   * Update Pol8RetPlnAttr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnAttr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetPlnAttr, pol8RetPlnAttr.length);
  }

  public void setPol8RetPlnAttr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnAttr, pol8RetPlnAttr.length);
  }

  /**
   * Update Pol8RetPlnAttr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnAttr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnAttr + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetPlnAttr with another Field
   *
   * @param value
   */
  public void setPol8RetPlnAttr(Field source) {
    replace(source, 0, source.length(), beginPol8RetPlnAttr, POL_8_RET_PLN_ATTR_LEN);
  }

  /**
   * Update Pol8RetPlnAttr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnAttr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnAttr, POL_8_RET_PLN_ATTR_LEN);
  }

  /**
   * Update Pol8RetPlnAttr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnAttr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnAttr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetOopMaxCovCd
   *
   * @return pol8RetOopMaxCovCd
   */
  public char[] getPol8RetOopMaxCovCd() throws CFException {
    if (isPol8RetOopMaxCovCdModified()) {
      pol8RetOopMaxCovCd = refreshPol8RetOopMaxCovCd();
    }
    return pol8RetOopMaxCovCd;
  }

  /**
   * set variable pol8RetOopMaxCovCd Corresponding COBOL Variable is POL8-RET-OOP-MAX-COV-CD
   *
   * @param value
   */
  public void setPol8RetOopMaxCovCd(char[] value) {
    pol8RetOopMaxCovCd = checkPol8RetOopMaxCovCdConstraints(value);
    serializePol8RetOopMaxCovCd(pol8RetOopMaxCovCd);
  }

  /**
   * Update Pol8RetOopMaxCovCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetOopMaxCovCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetOopMaxCovCd, pol8RetOopMaxCovCd.length);
  }

  public void setPol8RetOopMaxCovCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetOopMaxCovCd, pol8RetOopMaxCovCd.length);
  }

  /**
   * Update Pol8RetOopMaxCovCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetOopMaxCovCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetOopMaxCovCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetOopMaxCovCd with another Field
   *
   * @param value
   */
  public void setPol8RetOopMaxCovCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetOopMaxCovCd, POL_8_RET_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update Pol8RetOopMaxCovCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetOopMaxCovCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetOopMaxCovCd, POL_8_RET_OOP_MAX_COV_CD_LEN);
  }

  /**
   * Update Pol8RetOopMaxCovCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetOopMaxCovCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetOopMaxCovCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetMxiEffDate
   *
   * @return pol8RetMxiEffDate
   */
  public char[] getPol8RetMxiEffDate() throws CFException {
    if (isPol8RetMxiEffDateModified()) {
      pol8RetMxiEffDate = refreshPol8RetMxiEffDate();
    }
    return pol8RetMxiEffDate;
  }

  /**
   * set variable pol8RetMxiEffDate Corresponding COBOL Variable is POL8-RET-MXI-EFF-DATE
   *
   * @param value
   */
  public void setPol8RetMxiEffDate(char[] value) {
    pol8RetMxiEffDate = checkPol8RetMxiEffDateConstraints(value);
    serializePol8RetMxiEffDate(pol8RetMxiEffDate);
  }

  /**
   * Update Pol8RetMxiEffDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEffDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetMxiEffDate, pol8RetMxiEffDate.length);
  }

  public void setPol8RetMxiEffDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEffDate, pol8RetMxiEffDate.length);
  }

  /**
   * Update Pol8RetMxiEffDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEffDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEffDate + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetMxiEffDate with another Field
   *
   * @param value
   */
  public void setPol8RetMxiEffDate(Field source) {
    replace(source, 0, source.length(), beginPol8RetMxiEffDate, POL_8_RET_MXI_EFF_DATE_LEN);
  }

  /**
   * Update Pol8RetMxiEffDate with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEffDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEffDate, POL_8_RET_MXI_EFF_DATE_LEN);
  }

  /**
   * Update Pol8RetMxiEffDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEffDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEffDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetMxiEndDate
   *
   * @return pol8RetMxiEndDate
   */
  public char[] getPol8RetMxiEndDate() throws CFException {
    if (isPol8RetMxiEndDateModified()) {
      pol8RetMxiEndDate = refreshPol8RetMxiEndDate();
    }
    return pol8RetMxiEndDate;
  }

  /**
   * set variable pol8RetMxiEndDate Corresponding COBOL Variable is POL8-RET-MXI-END-DATE
   *
   * @param value
   */
  public void setPol8RetMxiEndDate(char[] value) {
    pol8RetMxiEndDate = checkPol8RetMxiEndDateConstraints(value);
    serializePol8RetMxiEndDate(pol8RetMxiEndDate);
  }

  /**
   * Update Pol8RetMxiEndDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEndDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetMxiEndDate, pol8RetMxiEndDate.length);
  }

  public void setPol8RetMxiEndDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEndDate, pol8RetMxiEndDate.length);
  }

  /**
   * Update Pol8RetMxiEndDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEndDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEndDate + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetMxiEndDate with another Field
   *
   * @param value
   */
  public void setPol8RetMxiEndDate(Field source) {
    replace(source, 0, source.length(), beginPol8RetMxiEndDate, POL_8_RET_MXI_END_DATE_LEN);
  }

  /**
   * Update Pol8RetMxiEndDate with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEndDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEndDate, POL_8_RET_MXI_END_DATE_LEN);
  }

  /**
   * Update Pol8RetMxiEndDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMxiEndDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMxiEndDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetTciTableNumber
   *
   * @return pol8RetTciTableNumber
   */
  public char[] getPol8RetTciTableNumber() throws CFException {
    if (isPol8RetTciTableNumberModified()) {
      pol8RetTciTableNumber = refreshPol8RetTciTableNumber();
    }
    return pol8RetTciTableNumber;
  }

  /**
   * set variable pol8RetTciTableNumber Corresponding COBOL Variable is POL8-RET-TCI-TABLE-NUMBER
   *
   * @param value
   */
  public void setPol8RetTciTableNumber(char[] value) {
    pol8RetTciTableNumber = checkPol8RetTciTableNumberConstraints(value);
    serializePol8RetTciTableNumber(pol8RetTciTableNumber);
  }

  /**
   * Update Pol8RetTciTableNumber with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetTciTableNumber(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol8RetTciTableNumber,
        pol8RetTciTableNumber.length);
  }

  public void setPol8RetTciTableNumber(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetTciTableNumber, pol8RetTciTableNumber.length);
  }

  /**
   * Update Pol8RetTciTableNumber with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetTciTableNumber(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetTciTableNumber + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetTciTableNumber with another Field
   *
   * @param value
   */
  public void setPol8RetTciTableNumber(Field source) {
    replace(source, 0, source.length(), beginPol8RetTciTableNumber, POL_8_RET_TCI_TABLE_NUMBER_LEN);
  }

  /**
   * Update Pol8RetTciTableNumber with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetTciTableNumber(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetTciTableNumber, POL_8_RET_TCI_TABLE_NUMBER_LEN);
  }

  /**
   * Update Pol8RetTciTableNumber with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol8RetTciTableNumber(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetTciTableNumber + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPlnFturInd
   *
   * @return pol8RetPlnFturInd
   */
  public char[] getPol8RetPlnFturInd() throws CFException {
    if (isPol8RetPlnFturIndModified()) {
      pol8RetPlnFturInd = refreshPol8RetPlnFturInd();
    }
    return pol8RetPlnFturInd;
  }

  /**
   * set variable pol8RetPlnFturInd Corresponding COBOL Variable is POL8-RET-PLN-FTUR-IND
   *
   * @param value
   */
  public void setPol8RetPlnFturInd(char[] value) {
    pol8RetPlnFturInd = checkPol8RetPlnFturIndConstraints(value);
    serializePol8RetPlnFturInd(pol8RetPlnFturInd);
  }

  /**
   * Update Pol8RetPlnFturInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnFturInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetPlnFturInd, pol8RetPlnFturInd.length);
  }

  public void setPol8RetPlnFturInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnFturInd, pol8RetPlnFturInd.length);
  }

  /**
   * Update Pol8RetPlnFturInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnFturInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnFturInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetPlnFturInd with another Field
   *
   * @param value
   */
  public void setPol8RetPlnFturInd(Field source) {
    replace(source, 0, source.length(), beginPol8RetPlnFturInd, POL_8_RET_PLN_FTUR_IND_LEN);
  }

  /**
   * Update Pol8RetPlnFturInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnFturInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnFturInd, POL_8_RET_PLN_FTUR_IND_LEN);
  }

  /**
   * Update Pol8RetPlnFturInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPlnFturInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlnFturInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPolicyKey
   *
   * @return pol8RetPolicyKey
   */
  public char[] getPol8RetPolicyKey() throws CFException {
    if (isPol8RetPolicyKeyModified()) {
      pol8RetPolicyKey = refreshPol8RetPolicyKey();
    }
    return pol8RetPolicyKey;
  }

  /**
   * set variable pol8RetPolicyKey Corresponding COBOL Variable is POL8-RET-POLICY-KEY
   *
   * @param value
   */
  public void setPol8RetPolicyKey(char[] value) {
    pol8RetPolicyKey = checkPol8RetPolicyKeyConstraints(value);
    serializePol8RetPolicyKey(pol8RetPolicyKey);
  }

  /**
   * Update Pol8RetPolicyKey with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetPolicyKey(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetPolicyKey, pol8RetPolicyKey.length);
  }

  public void setPol8RetPolicyKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPolicyKey, pol8RetPolicyKey.length);
  }

  /**
   * Update Pol8RetPolicyKey with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPolicyKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPolicyKey + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetPolicyKey with another Field
   *
   * @param value
   */
  public void setPol8RetPolicyKey(Field source) {
    replace(source, 0, source.length(), beginPol8RetPolicyKey, POL_8_RET_POLICY_KEY_LEN);
  }

  /**
   * Update Pol8RetPolicyKey with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetPolicyKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPolicyKey, POL_8_RET_POLICY_KEY_LEN);
  }

  /**
   * Update Pol8RetPolicyKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPolicyKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPolicyKey + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPlanKey
   *
   * @return pol8RetPlanKey
   */
  public char[] getPol8RetPlanKey() throws CFException {
    if (isPol8RetPlanKeyModified()) {
      pol8RetPlanKey = refreshPol8RetPlanKey();
    }
    return pol8RetPlanKey;
  }

  /**
   * set variable pol8RetPlanKey Corresponding COBOL Variable is POL8-RET-PLAN-KEY
   *
   * @param value
   */
  public void setPol8RetPlanKey(char[] value) {
    pol8RetPlanKey = checkPol8RetPlanKeyConstraints(value);
    serializePol8RetPlanKey(pol8RetPlanKey);
  }

  /**
   * Update Pol8RetPlanKey with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetPlanKey(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetPlanKey, pol8RetPlanKey.length);
  }

  public void setPol8RetPlanKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlanKey, pol8RetPlanKey.length);
  }

  /**
   * Update Pol8RetPlanKey with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPlanKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlanKey + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetPlanKey with another Field
   *
   * @param value
   */
  public void setPol8RetPlanKey(Field source) {
    replace(source, 0, source.length(), beginPol8RetPlanKey, POL_8_RET_PLAN_KEY_LEN);
  }

  /**
   * Update Pol8RetPlanKey with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetPlanKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlanKey, POL_8_RET_PLAN_KEY_LEN);
  }

  /**
   * Update Pol8RetPlanKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPlanKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPlanKey + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetClassKey
   *
   * @return pol8RetClassKey
   */
  public char[] getPol8RetClassKey() throws CFException {
    if (isPol8RetClassKeyModified()) {
      pol8RetClassKey = refreshPol8RetClassKey();
    }
    return pol8RetClassKey;
  }

  /**
   * set variable pol8RetClassKey Corresponding COBOL Variable is POL8-RET-CLASS-KEY
   *
   * @param value
   */
  public void setPol8RetClassKey(char[] value) {
    pol8RetClassKey = checkPol8RetClassKeyConstraints(value);
    serializePol8RetClassKey(pol8RetClassKey);
  }

  /**
   * Update Pol8RetClassKey with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetClassKey(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetClassKey, pol8RetClassKey.length);
  }

  public void setPol8RetClassKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetClassKey, pol8RetClassKey.length);
  }

  /**
   * Update Pol8RetClassKey with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetClassKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetClassKey + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetClassKey with another Field
   *
   * @param value
   */
  public void setPol8RetClassKey(Field source) {
    replace(source, 0, source.length(), beginPol8RetClassKey, POL_8_RET_CLASS_KEY_LEN);
  }

  /**
   * Update Pol8RetClassKey with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetClassKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetClassKey, POL_8_RET_CLASS_KEY_LEN);
  }

  /**
   * Update Pol8RetClassKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetClassKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetClassKey + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetCovTypKey
   *
   * @return pol8RetCovTypKey
   */
  public char[] getPol8RetCovTypKey() throws CFException {
    if (isPol8RetCovTypKeyModified()) {
      pol8RetCovTypKey = refreshPol8RetCovTypKey();
    }
    return pol8RetCovTypKey;
  }

  /**
   * set variable pol8RetCovTypKey Corresponding COBOL Variable is POL8-RET-COV-TYP-KEY
   *
   * @param value
   */
  public void setPol8RetCovTypKey(char[] value) {
    pol8RetCovTypKey = checkPol8RetCovTypKeyConstraints(value);
    serializePol8RetCovTypKey(pol8RetCovTypKey);
  }

  /**
   * Update Pol8RetCovTypKey with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetCovTypKey(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetCovTypKey, pol8RetCovTypKey.length);
  }

  public void setPol8RetCovTypKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetCovTypKey, pol8RetCovTypKey.length);
  }

  /**
   * Update Pol8RetCovTypKey with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetCovTypKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetCovTypKey + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetCovTypKey with another Field
   *
   * @param value
   */
  public void setPol8RetCovTypKey(Field source) {
    replace(source, 0, source.length(), beginPol8RetCovTypKey, POL_8_RET_COV_TYP_KEY_LEN);
  }

  /**
   * Update Pol8RetCovTypKey with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetCovTypKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetCovTypKey, POL_8_RET_COV_TYP_KEY_LEN);
  }

  /**
   * Update Pol8RetCovTypKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetCovTypKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetCovTypKey + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetOonLftmMaxAmt
   *
   * @return pol8RetOonLftmMaxAmt
   */
  public long getPol8RetOonLftmMaxAmt() throws CFException {
    if (isPol8RetOonLftmMaxAmtModified()) {
      pol8RetOonLftmMaxAmt = refreshPol8RetOonLftmMaxAmt();
    }
    return pol8RetOonLftmMaxAmt;
  }

  /**
   * Update Pol8RetOonLftmMaxAmt with the passed value Corresponding COBOL Variable is
   * POL8-RET-OON-LFTM-MAX-AMT
   *
   * @param number
   */
  public void setPol8RetOonLftmMaxAmt(long number) {
    // Truncate if the number is beyond +/- Max range
    pol8RetOonLftmMaxAmt = checkPol8RetOonLftmMaxAmtMaxLimit(number);
    serializePol8RetOonLftmMaxAmt(pol8RetOonLftmMaxAmt);
  }

  /**
   * Update Pol8RetOonLftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetOonLftmMaxAmt(char[] value) throws CFException {
    pol8RetOonLftmMaxAmt = serializePol8RetOonLftmMaxAmt(value);
  }
  /**
   * Update Pol8RetOonLftmMaxAmt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol8RetOonLftmMaxAmtString(char[] value) throws CFException {
    setPol8RetOonLftmMaxAmt(value);
  }
  /**
   * Returns the value of pol8RetContrBaseTierCd
   *
   * @return pol8RetContrBaseTierCd
   */
  public char[] getPol8RetContrBaseTierCd() throws CFException {
    if (isPol8RetContrBaseTierCdModified()) {
      pol8RetContrBaseTierCd = refreshPol8RetContrBaseTierCd();
    }
    return pol8RetContrBaseTierCd;
  }

  /**
   * set variable pol8RetContrBaseTierCd Corresponding COBOL Variable is POL8-RET-CONTR-BASE-TIER-CD
   *
   * @param value
   */
  public void setPol8RetContrBaseTierCd(char[] value) {
    pol8RetContrBaseTierCd = checkPol8RetContrBaseTierCdConstraints(value);
    serializePol8RetContrBaseTierCd(pol8RetContrBaseTierCd);
  }

  /**
   * Update Pol8RetContrBaseTierCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetContrBaseTierCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol8RetContrBaseTierCd,
        pol8RetContrBaseTierCd.length);
  }

  public void setPol8RetContrBaseTierCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetContrBaseTierCd, pol8RetContrBaseTierCd.length);
  }

  /**
   * Update Pol8RetContrBaseTierCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetContrBaseTierCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetContrBaseTierCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetContrBaseTierCd with another Field
   *
   * @param value
   */
  public void setPol8RetContrBaseTierCd(Field source) {
    replace(
        source, 0, source.length(), beginPol8RetContrBaseTierCd, POL_8_RET_CONTR_BASE_TIER_CD_LEN);
  }

  /**
   * Update Pol8RetContrBaseTierCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetContrBaseTierCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol8RetContrBaseTierCd,
        POL_8_RET_CONTR_BASE_TIER_CD_LEN);
  }

  /**
   * Update Pol8RetContrBaseTierCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol8RetContrBaseTierCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetContrBaseTierCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetReferralInd
   *
   * @return pol8RetReferralInd
   */
  public char[] getPol8RetReferralInd() throws CFException {
    if (isPol8RetReferralIndModified()) {
      pol8RetReferralInd = refreshPol8RetReferralInd();
    }
    return pol8RetReferralInd;
  }

  /**
   * set variable pol8RetReferralInd Corresponding COBOL Variable is POL8-RET-REFERRAL-IND
   *
   * @param value
   */
  public void setPol8RetReferralInd(char[] value) {
    pol8RetReferralInd = checkPol8RetReferralIndConstraints(value);
    serializePol8RetReferralInd(pol8RetReferralInd);
  }

  /**
   * Update Pol8RetReferralInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetReferralInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetReferralInd, pol8RetReferralInd.length);
  }

  public void setPol8RetReferralInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetReferralInd, pol8RetReferralInd.length);
  }

  /**
   * Update Pol8RetReferralInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetReferralInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetReferralInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetReferralInd with another Field
   *
   * @param value
   */
  public void setPol8RetReferralInd(Field source) {
    replace(source, 0, source.length(), beginPol8RetReferralInd, POL_8_RET_REFERRAL_IND_LEN);
  }

  /**
   * Update Pol8RetReferralInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetReferralInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetReferralInd, POL_8_RET_REFERRAL_IND_LEN);
  }

  /**
   * Update Pol8RetReferralInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetReferralInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetReferralInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8NhpNtwkFlexInd
   *
   * @return pol8NhpNtwkFlexInd
   */
  public char[] getPol8NhpNtwkFlexInd() throws CFException {
    if (isPol8NhpNtwkFlexIndModified()) {
      pol8NhpNtwkFlexInd = refreshPol8NhpNtwkFlexInd();
    }
    return pol8NhpNtwkFlexInd;
  }

  /**
   * set variable pol8NhpNtwkFlexInd Corresponding COBOL Variable is POL8-NHP-NTWK-FLEX-IND
   *
   * @param value
   */
  public void setPol8NhpNtwkFlexInd(char[] value) {
    pol8NhpNtwkFlexInd = checkPol8NhpNtwkFlexIndConstraints(value);
    serializePol8NhpNtwkFlexInd(pol8NhpNtwkFlexInd);
  }

  /**
   * Update Pol8NhpNtwkFlexInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8NhpNtwkFlexInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8NhpNtwkFlexInd, pol8NhpNtwkFlexInd.length);
  }

  public void setPol8NhpNtwkFlexInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NhpNtwkFlexInd, pol8NhpNtwkFlexInd.length);
  }

  /**
   * Update Pol8NhpNtwkFlexInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8NhpNtwkFlexInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NhpNtwkFlexInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8NhpNtwkFlexInd with another Field
   *
   * @param value
   */
  public void setPol8NhpNtwkFlexInd(Field source) {
    replace(source, 0, source.length(), beginPol8NhpNtwkFlexInd, POL_8_NHP_NTWK_FLEX_IND_LEN);
  }

  /**
   * Update Pol8NhpNtwkFlexInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8NhpNtwkFlexInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NhpNtwkFlexInd, POL_8_NHP_NTWK_FLEX_IND_LEN);
  }

  /**
   * Update Pol8NhpNtwkFlexInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8NhpNtwkFlexInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NhpNtwkFlexInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetProductCd
   *
   * @return pol8RetProductCd
   */
  public char[] getPol8RetProductCd() throws CFException {
    if (isPol8RetProductCdModified()) {
      pol8RetProductCd = refreshPol8RetProductCd();
    }
    return pol8RetProductCd;
  }

  /**
   * set variable pol8RetProductCd Corresponding COBOL Variable is POL8-RET-PRODUCT-CD
   *
   * @param value
   */
  public void setPol8RetProductCd(char[] value) {
    pol8RetProductCd = checkPol8RetProductCdConstraints(value);
    serializePol8RetProductCd(pol8RetProductCd);
  }

  /**
   * Update Pol8RetProductCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetProductCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetProductCd, pol8RetProductCd.length);
  }

  public void setPol8RetProductCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductCd, pol8RetProductCd.length);
  }

  /**
   * Update Pol8RetProductCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetProductCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetProductCd with another Field
   *
   * @param value
   */
  public void setPol8RetProductCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetProductCd, POL_8_RET_PRODUCT_CD_LEN);
  }

  /**
   * Update Pol8RetProductCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetProductCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductCd, POL_8_RET_PRODUCT_CD_LEN);
  }

  /**
   * Update Pol8RetProductCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetProductCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetProductCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetMktTypCd
   *
   * @return pol8RetMktTypCd
   */
  public char[] getPol8RetMktTypCd() throws CFException {
    if (isPol8RetMktTypCdModified()) {
      pol8RetMktTypCd = refreshPol8RetMktTypCd();
    }
    return pol8RetMktTypCd;
  }

  /**
   * set variable pol8RetMktTypCd Corresponding COBOL Variable is POL8-RET-MKT-TYP-CD
   *
   * @param value
   */
  public void setPol8RetMktTypCd(char[] value) {
    pol8RetMktTypCd = checkPol8RetMktTypCdConstraints(value);
    serializePol8RetMktTypCd(pol8RetMktTypCd);
  }

  /**
   * Update Pol8RetMktTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetMktTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetMktTypCd, pol8RetMktTypCd.length);
  }

  public void setPol8RetMktTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMktTypCd, pol8RetMktTypCd.length);
  }

  /**
   * Update Pol8RetMktTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMktTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMktTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetMktTypCd with another Field
   *
   * @param value
   */
  public void setPol8RetMktTypCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetMktTypCd, POL_8_RET_MKT_TYP_CD_LEN);
  }

  /**
   * Update Pol8RetMktTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetMktTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMktTypCd, POL_8_RET_MKT_TYP_CD_LEN);
  }

  /**
   * Update Pol8RetMktTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMktTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMktTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8NptRulePkgId
   *
   * @return pol8NptRulePkgId
   */
  public char[] getPol8NptRulePkgId() throws CFException {
    if (isPol8NptRulePkgIdModified()) {
      pol8NptRulePkgId = refreshPol8NptRulePkgId();
    }
    return pol8NptRulePkgId;
  }

  /**
   * set variable pol8NptRulePkgId Corresponding COBOL Variable is POL8-NPT-RULE-PKG-ID
   *
   * @param value
   */
  public void setPol8NptRulePkgId(char[] value) {
    pol8NptRulePkgId = checkPol8NptRulePkgIdConstraints(value);
    serializePol8NptRulePkgId(pol8NptRulePkgId);
  }

  /**
   * Update Pol8NptRulePkgId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8NptRulePkgId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8NptRulePkgId, pol8NptRulePkgId.length);
  }

  public void setPol8NptRulePkgId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NptRulePkgId, pol8NptRulePkgId.length);
  }

  /**
   * Update Pol8NptRulePkgId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8NptRulePkgId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NptRulePkgId + targetIndex, targetLen);
  }

  /**
   * Update Pol8NptRulePkgId with another Field
   *
   * @param value
   */
  public void setPol8NptRulePkgId(Field source) {
    replace(source, 0, source.length(), beginPol8NptRulePkgId, POL_8_NPT_RULE_PKG_ID_LEN);
  }

  /**
   * Update Pol8NptRulePkgId with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8NptRulePkgId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NptRulePkgId, POL_8_NPT_RULE_PKG_ID_LEN);
  }

  /**
   * Update Pol8NptRulePkgId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8NptRulePkgId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8NptRulePkgId + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8PrefLabNtwkInd
   *
   * @return pol8PrefLabNtwkInd
   */
  public char[] getPol8PrefLabNtwkInd() throws CFException {
    if (isPol8PrefLabNtwkIndModified()) {
      pol8PrefLabNtwkInd = refreshPol8PrefLabNtwkInd();
    }
    return pol8PrefLabNtwkInd;
  }

  /**
   * set variable pol8PrefLabNtwkInd Corresponding COBOL Variable is POL8-PREF-LAB-NTWK-IND
   *
   * @param value
   */
  public void setPol8PrefLabNtwkInd(char[] value) {
    pol8PrefLabNtwkInd = checkPol8PrefLabNtwkIndConstraints(value);
    serializePol8PrefLabNtwkInd(pol8PrefLabNtwkInd);
  }

  /**
   * Update Pol8PrefLabNtwkInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8PrefLabNtwkInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8PrefLabNtwkInd, pol8PrefLabNtwkInd.length);
  }

  public void setPol8PrefLabNtwkInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8PrefLabNtwkInd, pol8PrefLabNtwkInd.length);
  }

  /**
   * Update Pol8PrefLabNtwkInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8PrefLabNtwkInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8PrefLabNtwkInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8PrefLabNtwkInd with another Field
   *
   * @param value
   */
  public void setPol8PrefLabNtwkInd(Field source) {
    replace(source, 0, source.length(), beginPol8PrefLabNtwkInd, POL_8_PREF_LAB_NTWK_IND_LEN);
  }

  /**
   * Update Pol8PrefLabNtwkInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8PrefLabNtwkInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8PrefLabNtwkInd, POL_8_PREF_LAB_NTWK_IND_LEN);
  }

  /**
   * Update Pol8PrefLabNtwkInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8PrefLabNtwkInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8PrefLabNtwkInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetContractState
   *
   * @return pol8RetContractState
   */
  public char[] getPol8RetContractState() throws CFException {
    if (isPol8RetContractStateModified()) {
      pol8RetContractState = refreshPol8RetContractState();
    }
    return pol8RetContractState;
  }

  /**
   * set variable pol8RetContractState Corresponding COBOL Variable is POL8-RET-CONTRACT-STATE
   *
   * @param value
   */
  public void setPol8RetContractState(char[] value) {
    pol8RetContractState = checkPol8RetContractStateConstraints(value);
    serializePol8RetContractState(pol8RetContractState);
  }

  /**
   * Update Pol8RetContractState with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetContractState(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol8RetContractState, pol8RetContractState.length);
  }

  public void setPol8RetContractState(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetContractState, pol8RetContractState.length);
  }

  /**
   * Update Pol8RetContractState with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetContractState(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetContractState + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetContractState with another Field
   *
   * @param value
   */
  public void setPol8RetContractState(Field source) {
    replace(source, 0, source.length(), beginPol8RetContractState, POL_8_RET_CONTRACT_STATE_LEN);
  }

  /**
   * Update Pol8RetContractState with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetContractState(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetContractState, POL_8_RET_CONTRACT_STATE_LEN);
  }

  /**
   * Update Pol8RetContractState with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol8RetContractState(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetContractState + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetFundTypCd
   *
   * @return pol8RetFundTypCd
   */
  public char[] getPol8RetFundTypCd() throws CFException {
    if (isPol8RetFundTypCdModified()) {
      pol8RetFundTypCd = refreshPol8RetFundTypCd();
    }
    return pol8RetFundTypCd;
  }

  /**
   * set variable pol8RetFundTypCd Corresponding COBOL Variable is POL8-RET-FUND-TYP-CD
   *
   * @param value
   */
  public void setPol8RetFundTypCd(char[] value) {
    pol8RetFundTypCd = checkPol8RetFundTypCdConstraints(value);
    serializePol8RetFundTypCd(pol8RetFundTypCd);
  }

  /**
   * Update Pol8RetFundTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetFundTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetFundTypCd, pol8RetFundTypCd.length);
  }

  public void setPol8RetFundTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFundTypCd, pol8RetFundTypCd.length);
  }

  /**
   * Update Pol8RetFundTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetFundTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFundTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetFundTypCd with another Field
   *
   * @param value
   */
  public void setPol8RetFundTypCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetFundTypCd, POL_8_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol8RetFundTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetFundTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFundTypCd, POL_8_RET_FUND_TYP_CD_LEN);
  }

  /**
   * Update Pol8RetFundTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetFundTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFundTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetFaclShrSvCd
   *
   * @return pol8RetFaclShrSvCd
   */
  public char[] getPol8RetFaclShrSvCd() throws CFException {
    if (isPol8RetFaclShrSvCdModified()) {
      pol8RetFaclShrSvCd = refreshPol8RetFaclShrSvCd();
    }
    return pol8RetFaclShrSvCd;
  }

  /**
   * set variable pol8RetFaclShrSvCd Corresponding COBOL Variable is POL8-RET-FACL-SHR-SV-CD
   *
   * @param value
   */
  public void setPol8RetFaclShrSvCd(char[] value) {
    pol8RetFaclShrSvCd = checkPol8RetFaclShrSvCdConstraints(value);
    serializePol8RetFaclShrSvCd(pol8RetFaclShrSvCd);
  }

  /**
   * Update Pol8RetFaclShrSvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetFaclShrSvCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetFaclShrSvCd, pol8RetFaclShrSvCd.length);
  }

  public void setPol8RetFaclShrSvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFaclShrSvCd, pol8RetFaclShrSvCd.length);
  }

  /**
   * Update Pol8RetFaclShrSvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetFaclShrSvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFaclShrSvCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetFaclShrSvCd with another Field
   *
   * @param value
   */
  public void setPol8RetFaclShrSvCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetFaclShrSvCd, POL_8_RET_FACL_SHR_SV_CD_LEN);
  }

  /**
   * Update Pol8RetFaclShrSvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetFaclShrSvCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFaclShrSvCd, POL_8_RET_FACL_SHR_SV_CD_LEN);
  }

  /**
   * Update Pol8RetFaclShrSvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetFaclShrSvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetFaclShrSvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPhysnShrSvCd
   *
   * @return pol8RetPhysnShrSvCd
   */
  public char[] getPol8RetPhysnShrSvCd() throws CFException {
    if (isPol8RetPhysnShrSvCdModified()) {
      pol8RetPhysnShrSvCd = refreshPol8RetPhysnShrSvCd();
    }
    return pol8RetPhysnShrSvCd;
  }

  /**
   * set variable pol8RetPhysnShrSvCd Corresponding COBOL Variable is POL8-RET-PHYSN-SHR-SV-CD
   *
   * @param value
   */
  public void setPol8RetPhysnShrSvCd(char[] value) {
    pol8RetPhysnShrSvCd = checkPol8RetPhysnShrSvCdConstraints(value);
    serializePol8RetPhysnShrSvCd(pol8RetPhysnShrSvCd);
  }

  /**
   * Update Pol8RetPhysnShrSvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetPhysnShrSvCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol8RetPhysnShrSvCd, pol8RetPhysnShrSvCd.length);
  }

  public void setPol8RetPhysnShrSvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPhysnShrSvCd, pol8RetPhysnShrSvCd.length);
  }

  /**
   * Update Pol8RetPhysnShrSvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPhysnShrSvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPhysnShrSvCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetPhysnShrSvCd with another Field
   *
   * @param value
   */
  public void setPol8RetPhysnShrSvCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetPhysnShrSvCd, POL_8_RET_PHYSN_SHR_SV_CD_LEN);
  }

  /**
   * Update Pol8RetPhysnShrSvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetPhysnShrSvCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol8RetPhysnShrSvCd, POL_8_RET_PHYSN_SHR_SV_CD_LEN);
  }

  /**
   * Update Pol8RetPhysnShrSvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPhysnShrSvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPhysnShrSvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetPhrmCpnInd
   *
   * @return pol8RetPhrmCpnInd
   */
  public char[] getPol8RetPhrmCpnInd() throws CFException {
    if (isPol8RetPhrmCpnIndModified()) {
      pol8RetPhrmCpnInd = refreshPol8RetPhrmCpnInd();
    }
    return pol8RetPhrmCpnInd;
  }

  /**
   * set variable pol8RetPhrmCpnInd Corresponding COBOL Variable is POL8-RET-PHRM-CPN-IND
   *
   * @param value
   */
  public void setPol8RetPhrmCpnInd(char[] value) {
    pol8RetPhrmCpnInd = checkPol8RetPhrmCpnIndConstraints(value);
    serializePol8RetPhrmCpnInd(pol8RetPhrmCpnInd);
  }

  /**
   * Update Pol8RetPhrmCpnInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetPhrmCpnInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetPhrmCpnInd, pol8RetPhrmCpnInd.length);
  }

  public void setPol8RetPhrmCpnInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPhrmCpnInd, pol8RetPhrmCpnInd.length);
  }

  /**
   * Update Pol8RetPhrmCpnInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPhrmCpnInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPhrmCpnInd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetPhrmCpnInd with another Field
   *
   * @param value
   */
  public void setPol8RetPhrmCpnInd(Field source) {
    replace(source, 0, source.length(), beginPol8RetPhrmCpnInd, POL_8_RET_PHRM_CPN_IND_LEN);
  }

  /**
   * Update Pol8RetPhrmCpnInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetPhrmCpnInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPhrmCpnInd, POL_8_RET_PHRM_CPN_IND_LEN);
  }

  /**
   * Update Pol8RetPhrmCpnInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetPhrmCpnInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetPhrmCpnInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8DesgDiagProvCd
   *
   * @return pol8DesgDiagProvCd
   */
  public char[] getPol8DesgDiagProvCd() throws CFException {
    if (isPol8DesgDiagProvCdModified()) {
      pol8DesgDiagProvCd = refreshPol8DesgDiagProvCd();
    }
    return pol8DesgDiagProvCd;
  }

  /**
   * set variable pol8DesgDiagProvCd Corresponding COBOL Variable is POL8-DESG-DIAG-PROV-CD
   *
   * @param value
   */
  public void setPol8DesgDiagProvCd(char[] value) {
    pol8DesgDiagProvCd = checkPol8DesgDiagProvCdConstraints(value);
    serializePol8DesgDiagProvCd(pol8DesgDiagProvCd);
  }

  /**
   * Update Pol8DesgDiagProvCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8DesgDiagProvCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8DesgDiagProvCd, pol8DesgDiagProvCd.length);
  }

  public void setPol8DesgDiagProvCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8DesgDiagProvCd, pol8DesgDiagProvCd.length);
  }

  /**
   * Update Pol8DesgDiagProvCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8DesgDiagProvCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8DesgDiagProvCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8DesgDiagProvCd with another Field
   *
   * @param value
   */
  public void setPol8DesgDiagProvCd(Field source) {
    replace(source, 0, source.length(), beginPol8DesgDiagProvCd, POL_8_DESG_DIAG_PROV_CD_LEN);
  }

  /**
   * Update Pol8DesgDiagProvCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8DesgDiagProvCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8DesgDiagProvCd, POL_8_DESG_DIAG_PROV_CD_LEN);
  }

  /**
   * Update Pol8DesgDiagProvCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8DesgDiagProvCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8DesgDiagProvCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol8RetMedCpnCd
   *
   * @return pol8RetMedCpnCd
   */
  public char[] getPol8RetMedCpnCd() throws CFException {
    if (isPol8RetMedCpnCdModified()) {
      pol8RetMedCpnCd = refreshPol8RetMedCpnCd();
    }
    return pol8RetMedCpnCd;
  }

  /**
   * set variable pol8RetMedCpnCd Corresponding COBOL Variable is POL8-RET-MED-CPN-CD
   *
   * @param value
   */
  public void setPol8RetMedCpnCd(char[] value) {
    pol8RetMedCpnCd = checkPol8RetMedCpnCdConstraints(value);
    serializePol8RetMedCpnCd(pol8RetMedCpnCd);
  }

  /**
   * Update Pol8RetMedCpnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol8RetMedCpnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol8RetMedCpnCd, pol8RetMedCpnCd.length);
  }

  public void setPol8RetMedCpnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMedCpnCd, pol8RetMedCpnCd.length);
  }

  /**
   * Update Pol8RetMedCpnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMedCpnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMedCpnCd + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetMedCpnCd with another Field
   *
   * @param value
   */
  public void setPol8RetMedCpnCd(Field source) {
    replace(source, 0, source.length(), beginPol8RetMedCpnCd, POL_8_RET_MED_CPN_CD_LEN);
  }

  /**
   * Update Pol8RetMedCpnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetMedCpnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMedCpnCd, POL_8_RET_MED_CPN_CD_LEN);
  }

  /**
   * Update Pol8RetMedCpnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetMedCpnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol8RetMedCpnCd + targetIndex, targetLen);
  }

  /**
   * initializes Pol8RetArea2 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol8RetProrationInd(CONSTANTS.SPACE);
    setPol8RetProrationEvent(CONSTANTS.SPACE);
    setPol8RetProductInd(CONSTANTS.SPACE_3);
    setPol8RetPrefNtwkCd(CONSTANTS.SPACE);
    setPol8RetReverseTieredInd(CONSTANTS.SPACE);
    setPol8RetUhPremDesgCd(CONSTANTS.SPACE);
    setPol8RetMnnrpInd(CONSTANTS.SPACE);
    setPol8RetMnnrpPct(0);
    setPol8RetNonEmb(CONSTANTS.SPACE);
    setPol8RetLftmMaxAmt(0);
    setPol8RetTier1LftmMaxAmt(0);
    setPol8RetDualOopNbrInd(CONSTANTS.SPACE);
    setPol8RetPsyLftmCnfmMaxAmt(0);
    setPol8PsyLftmNonCnfmMaxAmt(0);
    setPol8PsyLftmCombPrscMxAmt(0);
    setPol8RetPsyCyrCnfmMaxAmt(0);
    setPol8PsyCyrCombPrscMaxAmt(0);
    setPol8PsyCyrNonCnfmMaxAmt(0);
    setPol8RetMbrNtwkKeyMtchCd(CONSTANTS.SPACE);
    setPol8RetDsesStTblNbr(CONSTANTS.SPACE_6);
    setPol8RetPlnAttr(CONSTANTS.SPACE_2);
    setPol8RetOopMaxCovCd(CONSTANTS.SPACE);
    setPol8RetMxiEffDate(CONSTANTS.SPACE_8);
    setPol8RetMxiEndDate(CONSTANTS.SPACE_8);
    setPol8RetTciTableNumber(CONSTANTS.SPACE_6);
    setPol8RetPlnFturInd(CONSTANTS.SPACE);
    setPol8RetPolicyKey(CONSTANTS.SPACE_6);
    setPol8RetPlanKey(CONSTANTS.SPACE_4);
    setPol8RetClassKey(CONSTANTS.SPACE_4);
    setPol8RetCovTypKey(CONSTANTS.SPACE);
    setPol8RetOonLftmMaxAmt(0);
    setPol8RetContrBaseTierCd(CONSTANTS.SPACE);
    setPol8RetReferralInd(CONSTANTS.SPACE);
    setPol8NhpNtwkFlexInd(CONSTANTS.SPACE);
    setPol8RetProductCd(CONSTANTS.SPACE_3);
    setPol8RetMktTypCd(CONSTANTS.SPACE_2);
    setPol8NptRulePkgId(CONSTANTS.SPACE_6);
    setPol8PrefLabNtwkInd(CONSTANTS.SPACE_6);
    setPol8RetContractState(CONSTANTS.SPACE_2);
    setPol8RetFundTypCd(CONSTANTS.SPACE);
    setPol8RetFaclShrSvCd(CONSTANTS.SPACE);
    setPol8RetPhysnShrSvCd(CONSTANTS.SPACE);
    setPol8RetPhrmCpnInd(CONSTANTS.SPACE);
    setPol8DesgDiagProvCd(CONSTANTS.SPACE);
    setPol8RetMedCpnCd(CONSTANTS.SPACE);
  }

  public static int getPol8RetArea2FieldLength() {
    return POL_8_RET_AREA_2_LENGTH;
  }
}
