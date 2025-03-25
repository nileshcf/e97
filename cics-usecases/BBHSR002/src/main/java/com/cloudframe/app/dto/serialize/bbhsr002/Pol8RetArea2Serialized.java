package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol8RetArea2Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol8RetArea2Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol8RetArea2Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_8_RET_AREA_2_LENGTH = 153;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol8RetProrationInd;
  protected int beginPol8RetProrationEvent;
  protected int beginPol8RetProductInd;
  protected int beginPol8RetPrefNtwkCd;
  protected int beginPol8RetReverseTieredInd;
  protected int beginPol8RetUhPremDesgCd;
  protected int beginPol8RetMnnrpInd;
  protected int beginPol8RetMnnrpPct;
  protected int beginPol8RetNonEmb;
  protected int beginPol8RetLftmMaxAmt;
  protected int beginPol8RetTier1LftmMaxAmt;
  protected int beginPol8RetDualOopNbrInd;
  protected int beginPol8RetPsyLftmCnfmMaxAmt;
  protected int beginPol8PsyLftmNonCnfmMaxAmt;
  protected int beginPol8PsyLftmCombPrscMxAmt;
  protected int beginPol8RetPsyCyrCnfmMaxAmt;
  protected int beginPol8PsyCyrCombPrscMaxAmt;
  protected int beginPol8PsyCyrNonCnfmMaxAmt;
  protected int beginPol8RetMbrNtwkKeyMtchCd;
  protected int beginPol8RetDsesStTblNbr;
  protected int beginPol8RetPlnAttr;
  protected int beginPol8RetOopMaxCovCd;
  protected int beginPol8RetMxiEffDate;
  protected int beginPol8RetMxiEndDate;
  protected int beginPol8RetTciTableNumber;
  protected int beginPol8RetPlnFturInd;
  protected int beginPol8RetPolicyKey;
  protected int beginPol8RetPlanKey;
  protected int beginPol8RetClassKey;
  protected int beginPol8RetCovTypKey;
  protected int beginPol8RetOonLftmMaxAmt;
  protected int beginPol8RetContrBaseTierCd;
  protected int beginPol8RetReferralInd;
  protected int beginPol8NhpNtwkFlexInd;
  protected int beginPol8RetProductCd;
  protected int beginPol8RetMktTypCd;
  protected int beginPol8NptRulePkgId;
  protected int beginPol8PrefLabNtwkInd;
  protected int beginPol8RetContractState;
  protected int beginPol8RetFundTypCd;
  protected int beginPol8RetFaclShrSvCd;
  protected int beginPol8RetPhysnShrSvCd;
  protected int beginPol8RetPhrmCpnInd;
  protected int beginPol8DesgDiagProvCd;
  protected int beginPol8RetMedCpnCd;

  /** Constructor for Pol8RetArea2Serialized */
  public Pol8RetArea2Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol8RetArea2Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol8RetArea2Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol8RetArea2Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol8RetArea2Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol8RetArea2Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_8_RET_AREA_2_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol8RetProrationInd = getStartOffset() + 0; // set offset for serialization

    beginPol8RetProrationEvent = getStartOffset() + 1; // set offset for serialization

    beginPol8RetProductInd = getStartOffset() + 2; // set offset for serialization

    beginPol8RetPrefNtwkCd = getStartOffset() + 5; // set offset for serialization

    beginPol8RetReverseTieredInd = getStartOffset() + 6; // set offset for serialization

    beginPol8RetUhPremDesgCd = getStartOffset() + 7; // set offset for serialization

    beginPol8RetMnnrpInd = getStartOffset() + 8; // set offset for serialization

    beginPol8RetMnnrpPct = getStartOffset() + 9; // set offset for serialization

    beginPol8RetNonEmb = getStartOffset() + 12; // set offset for serialization

    beginPol8RetLftmMaxAmt = getStartOffset() + 13; // set offset for serialization

    beginPol8RetTier1LftmMaxAmt = getStartOffset() + 20; // set offset for serialization

    beginPol8RetDualOopNbrInd = getStartOffset() + 27; // set offset for serialization

    beginPol8RetPsyLftmCnfmMaxAmt = getStartOffset() + 28; // set offset for serialization

    beginPol8PsyLftmNonCnfmMaxAmt = getStartOffset() + 35; // set offset for serialization

    beginPol8PsyLftmCombPrscMxAmt = getStartOffset() + 42; // set offset for serialization

    beginPol8RetPsyCyrCnfmMaxAmt = getStartOffset() + 49; // set offset for serialization

    beginPol8PsyCyrCombPrscMaxAmt = getStartOffset() + 56; // set offset for serialization

    beginPol8PsyCyrNonCnfmMaxAmt = getStartOffset() + 63; // set offset for serialization

    beginPol8RetMbrNtwkKeyMtchCd = getStartOffset() + 70; // set offset for serialization

    beginPol8RetDsesStTblNbr = getStartOffset() + 71; // set offset for serialization

    beginPol8RetPlnAttr = getStartOffset() + 77; // set offset for serialization

    beginPol8RetOopMaxCovCd = getStartOffset() + 79; // set offset for serialization

    beginPol8RetMxiEffDate = getStartOffset() + 80; // set offset for serialization

    beginPol8RetMxiEndDate = getStartOffset() + 88; // set offset for serialization

    beginPol8RetTciTableNumber = getStartOffset() + 96; // set offset for serialization

    beginPol8RetPlnFturInd = getStartOffset() + 102; // set offset for serialization

    beginPol8RetPolicyKey = getStartOffset() + 103; // set offset for serialization

    beginPol8RetPlanKey = getStartOffset() + 109; // set offset for serialization

    beginPol8RetClassKey = getStartOffset() + 113; // set offset for serialization

    beginPol8RetCovTypKey = getStartOffset() + 117; // set offset for serialization

    beginPol8RetOonLftmMaxAmt = getStartOffset() + 118; // set offset for serialization

    beginPol8RetContrBaseTierCd = getStartOffset() + 125; // set offset for serialization

    beginPol8RetReferralInd = getStartOffset() + 126; // set offset for serialization

    beginPol8NhpNtwkFlexInd = getStartOffset() + 127; // set offset for serialization

    beginPol8RetProductCd = getStartOffset() + 128; // set offset for serialization

    beginPol8RetMktTypCd = getStartOffset() + 131; // set offset for serialization

    beginPol8NptRulePkgId = getStartOffset() + 133; // set offset for serialization

    beginPol8PrefLabNtwkInd = getStartOffset() + 139; // set offset for serialization

    beginPol8RetContractState = getStartOffset() + 145; // set offset for serialization

    beginPol8RetFundTypCd = getStartOffset() + 147; // set offset for serialization

    beginPol8RetFaclShrSvCd = getStartOffset() + 148; // set offset for serialization

    beginPol8RetPhysnShrSvCd = getStartOffset() + 149; // set offset for serialization

    beginPol8RetPhrmCpnInd = getStartOffset() + 150; // set offset for serialization

    beginPol8DesgDiagProvCd = getStartOffset() + 151; // set offset for serialization

    beginPol8RetMedCpnCd = getStartOffset() + 152; // set offset for serialization

    /*  end of offset */
  }

  int localPol8RetProrationIndCounter = -1;

  public boolean isPol8RetProrationIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetProrationIndCounter != sharedCounter;
    localPol8RetProrationIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PRORATION_IND_LEN = 1;
  /** serialize this Pol8RetProrationInd */
  protected void serializePol8RetProrationInd(char[] pol8RetProrationInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetProrationInd,
        0,
        getStringValue(),
        beginPol8RetProrationInd,
        POL_8_RET_PRORATION_IND_LEN);
    localPol8RetProrationIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetProrationIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetProrationInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetProrationInd() {
    return (substring(
        getStringValue(),
        beginPol8RetProrationInd,
        beginPol8RetProrationInd + POL_8_RET_PRORATION_IND_LEN));
  }

  int localPol8RetProrationEventCounter = -1;

  public boolean isPol8RetProrationEventModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetProrationEventCounter != sharedCounter;
    localPol8RetProrationEventCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PRORATION_EVENT_LEN = 1;
  /** serialize this Pol8RetProrationEvent */
  protected void serializePol8RetProrationEvent(char[] pol8RetProrationEvent) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetProrationEvent,
        0,
        getStringValue(),
        beginPol8RetProrationEvent,
        POL_8_RET_PRORATION_EVENT_LEN);
    localPol8RetProrationEventCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetProrationEventConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetProrationEvent is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetProrationEvent() {
    return (substring(
        getStringValue(),
        beginPol8RetProrationEvent,
        beginPol8RetProrationEvent + POL_8_RET_PRORATION_EVENT_LEN));
  }

  int localPol8RetProductIndCounter = -1;

  public boolean isPol8RetProductIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetProductIndCounter != sharedCounter;
    localPol8RetProductIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PRODUCT_IND_LEN = 3;
  /** serialize this Pol8RetProductInd */
  protected void serializePol8RetProductInd(char[] pol8RetProductInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetProductInd, 0, getStringValue(), beginPol8RetProductInd, POL_8_RET_PRODUCT_IND_LEN);
    localPol8RetProductIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetProductIndConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol8RetProductInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetProductInd() {
    return (substring(
        getStringValue(),
        beginPol8RetProductInd,
        beginPol8RetProductInd + POL_8_RET_PRODUCT_IND_LEN));
  }

  int localPol8RetPrefNtwkCdCounter = -1;

  public boolean isPol8RetPrefNtwkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPrefNtwkCdCounter != sharedCounter;
    localPol8RetPrefNtwkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PREF_NTWK_CD_LEN = 1;
  /** serialize this Pol8RetPrefNtwkCd */
  protected void serializePol8RetPrefNtwkCd(char[] pol8RetPrefNtwkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetPrefNtwkCd, 0, getStringValue(), beginPol8RetPrefNtwkCd, POL_8_RET_PREF_NTWK_CD_LEN);
    localPol8RetPrefNtwkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetPrefNtwkCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetPrefNtwkCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetPrefNtwkCd() {
    return (substring(
        getStringValue(),
        beginPol8RetPrefNtwkCd,
        beginPol8RetPrefNtwkCd + POL_8_RET_PREF_NTWK_CD_LEN));
  }

  int localPol8RetReverseTieredIndCounter = -1;

  public boolean isPol8RetReverseTieredIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetReverseTieredIndCounter != sharedCounter;
    localPol8RetReverseTieredIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_REVERSE_TIERED_IND_LEN = 1;
  /** serialize this Pol8RetReverseTieredInd */
  protected void serializePol8RetReverseTieredInd(char[] pol8RetReverseTieredInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetReverseTieredInd,
        0,
        getStringValue(),
        beginPol8RetReverseTieredInd,
        POL_8_RET_REVERSE_TIERED_IND_LEN);
    localPol8RetReverseTieredIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetReverseTieredIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetReverseTieredInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetReverseTieredInd() {
    return (substring(
        getStringValue(),
        beginPol8RetReverseTieredInd,
        beginPol8RetReverseTieredInd + POL_8_RET_REVERSE_TIERED_IND_LEN));
  }

  int localPol8RetUhPremDesgCdCounter = -1;

  public boolean isPol8RetUhPremDesgCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetUhPremDesgCdCounter != sharedCounter;
    localPol8RetUhPremDesgCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_UH_PREM_DESG_CD_LEN = 1;
  /** serialize this Pol8RetUhPremDesgCd */
  protected void serializePol8RetUhPremDesgCd(char[] pol8RetUhPremDesgCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetUhPremDesgCd,
        0,
        getStringValue(),
        beginPol8RetUhPremDesgCd,
        POL_8_RET_UH_PREM_DESG_CD_LEN);
    localPol8RetUhPremDesgCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetUhPremDesgCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetUhPremDesgCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetUhPremDesgCd() {
    return (substring(
        getStringValue(),
        beginPol8RetUhPremDesgCd,
        beginPol8RetUhPremDesgCd + POL_8_RET_UH_PREM_DESG_CD_LEN));
  }

  int localPol8RetMnnrpIndCounter = -1;

  public boolean isPol8RetMnnrpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetMnnrpIndCounter != sharedCounter;
    localPol8RetMnnrpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_MNNRP_IND_LEN = 1;
  /** serialize this Pol8RetMnnrpInd */
  protected void serializePol8RetMnnrpInd(char[] pol8RetMnnrpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol8RetMnnrpInd, 0, getStringValue(), beginPol8RetMnnrpInd, POL_8_RET_MNNRP_IND_LEN);
    localPol8RetMnnrpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetMnnrpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetMnnrpInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetMnnrpInd() {
    return (substring(
        getStringValue(), beginPol8RetMnnrpInd, beginPol8RetMnnrpInd + POL_8_RET_MNNRP_IND_LEN));
  }

  int localPol8RetMnnrpPctCounter = -1;

  public boolean isPol8RetMnnrpPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetMnnrpPctCounter != sharedCounter;
    localPol8RetMnnrpPctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8RetMnnrpPct
   *
   * @return pol8RetMnnrpPct
   */
  public char[] getPol8RetMnnrpPctString() {
    return getCharArray(beginPol8RetMnnrpPct, POL_8_RET_MNNRP_PCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8RetMnnrpPctIsNumeric() {
    return isNumeric(
        beginPol8RetMnnrpPct,
        beginPol8RetMnnrpPct + POL_8_RET_MNNRP_PCT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_RET_MNNRP_PCT_LEN = 3;
  /** serializePol8RetMnnrpPct */
  protected void serializePol8RetMnnrpPct(int pol8RetMnnrpPct) {
    putNumber(
        beginPol8RetMnnrpPct,
        pol8RetMnnrpPct,
        POL_8_RET_MNNRP_PCT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8RetMnnrpPctCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8RetMnnrpPct */
  protected int serializePol8RetMnnrpPct(char[] value) {
    int pol8RetMnnrpPct;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8RetMnnrpPct =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol8RetMnnrpPct, 3);
    localPol8RetMnnrpPctCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8RetMnnrpPct;
  }

  protected int checkPol8RetMnnrpPctMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8RetMnnrpPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol8RetMnnrpPct() throws CFException {
    try {
      return (getIntNumber(
          beginPol8RetMnnrpPct,
          POL_8_RET_MNNRP_PCT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol8RetMnnrpPct", beginPol8RetMnnrpPct, POL_8_RET_MNNRP_PCT_LEN);
    }
  }

  int localPol8RetNonEmbCounter = -1;

  public boolean isPol8RetNonEmbModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetNonEmbCounter != sharedCounter;
    localPol8RetNonEmbCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_NON_EMB_LEN = 1;
  /** serialize this Pol8RetNonEmb */
  protected void serializePol8RetNonEmb(char[] pol8RetNonEmb) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol8RetNonEmb, 0, getStringValue(), beginPol8RetNonEmb, POL_8_RET_NON_EMB_LEN);
    localPol8RetNonEmbCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetNonEmbConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetNonEmb is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetNonEmb() {
    return (substring(
        getStringValue(), beginPol8RetNonEmb, beginPol8RetNonEmb + POL_8_RET_NON_EMB_LEN));
  }

  int localPol8RetLftmMaxAmtCounter = -1;

  public boolean isPol8RetLftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetLftmMaxAmtCounter != sharedCounter;
    localPol8RetLftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8RetLftmMaxAmt
   *
   * @return pol8RetLftmMaxAmt
   */
  public char[] getPol8RetLftmMaxAmtString() {
    return getCharArray(beginPol8RetLftmMaxAmt, POL_8_RET_LFTM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8RetLftmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8RetLftmMaxAmt,
        beginPol8RetLftmMaxAmt + POL_8_RET_LFTM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_RET_LFTM_MAX_AMT_LEN = 7;
  /** serializePol8RetLftmMaxAmt */
  protected void serializePol8RetLftmMaxAmt(long pol8RetLftmMaxAmt) {
    putNumber(
        beginPol8RetLftmMaxAmt,
        pol8RetLftmMaxAmt,
        POL_8_RET_LFTM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8RetLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8RetLftmMaxAmt */
  protected long serializePol8RetLftmMaxAmt(char[] value) {
    long pol8RetLftmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8RetLftmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8RetLftmMaxAmt, 7);
    localPol8RetLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8RetLftmMaxAmt;
  }

  protected long checkPol8RetLftmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8RetLftmMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol8RetLftmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8RetLftmMaxAmt,
          POL_8_RET_LFTM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol8RetLftmMaxAmt", beginPol8RetLftmMaxAmt, POL_8_RET_LFTM_MAX_AMT_LEN);
    }
  }

  int localPol8RetTier1LftmMaxAmtCounter = -1;

  public boolean isPol8RetTier1LftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetTier1LftmMaxAmtCounter != sharedCounter;
    localPol8RetTier1LftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8RetTier1LftmMaxAmt
   *
   * @return pol8RetTier1LftmMaxAmt
   */
  public char[] getPol8RetTier1LftmMaxAmtString() {
    return getCharArray(beginPol8RetTier1LftmMaxAmt, POL_8_RET_TIER_1_LFTM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8RetTier1LftmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8RetTier1LftmMaxAmt,
        beginPol8RetTier1LftmMaxAmt + POL_8_RET_TIER_1_LFTM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_RET_TIER_1_LFTM_MAX_AMT_LEN = 7;
  /** serializePol8RetTier1LftmMaxAmt */
  protected void serializePol8RetTier1LftmMaxAmt(long pol8RetTier1LftmMaxAmt) {
    putNumber(
        beginPol8RetTier1LftmMaxAmt,
        pol8RetTier1LftmMaxAmt,
        POL_8_RET_TIER_1_LFTM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8RetTier1LftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8RetTier1LftmMaxAmt */
  protected long serializePol8RetTier1LftmMaxAmt(char[] value) {
    long pol8RetTier1LftmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8RetTier1LftmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8RetTier1LftmMaxAmt, 7);
    localPol8RetTier1LftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8RetTier1LftmMaxAmt;
  }

  protected long checkPol8RetTier1LftmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8RetTier1LftmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8RetTier1LftmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8RetTier1LftmMaxAmt,
          POL_8_RET_TIER_1_LFTM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8RetTier1LftmMaxAmt", beginPol8RetTier1LftmMaxAmt, POL_8_RET_TIER_1_LFTM_MAX_AMT_LEN);
    }
  }

  int localPol8RetDualOopNbrIndCounter = -1;

  public boolean isPol8RetDualOopNbrIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetDualOopNbrIndCounter != sharedCounter;
    localPol8RetDualOopNbrIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_DUAL_OOP_NBR_IND_LEN = 1;
  /** serialize this Pol8RetDualOopNbrInd */
  protected void serializePol8RetDualOopNbrInd(char[] pol8RetDualOopNbrInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetDualOopNbrInd,
        0,
        getStringValue(),
        beginPol8RetDualOopNbrInd,
        POL_8_RET_DUAL_OOP_NBR_IND_LEN);
    localPol8RetDualOopNbrIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetDualOopNbrIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetDualOopNbrInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetDualOopNbrInd() {
    return (substring(
        getStringValue(),
        beginPol8RetDualOopNbrInd,
        beginPol8RetDualOopNbrInd + POL_8_RET_DUAL_OOP_NBR_IND_LEN));
  }

  int localPol8RetPsyLftmCnfmMaxAmtCounter = -1;

  public boolean isPol8RetPsyLftmCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPsyLftmCnfmMaxAmtCounter != sharedCounter;
    localPol8RetPsyLftmCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8RetPsyLftmCnfmMaxAmt
   *
   * @return pol8RetPsyLftmCnfmMaxAmt
   */
  public char[] getPol8RetPsyLftmCnfmMaxAmtString() {
    return getCharArray(beginPol8RetPsyLftmCnfmMaxAmt, POL_8_RET_PSY_LFTM_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8RetPsyLftmCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8RetPsyLftmCnfmMaxAmt,
        beginPol8RetPsyLftmCnfmMaxAmt + POL_8_RET_PSY_LFTM_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_RET_PSY_LFTM_CNFM_MAX_AMT_LEN = 7;
  /** serializePol8RetPsyLftmCnfmMaxAmt */
  protected void serializePol8RetPsyLftmCnfmMaxAmt(long pol8RetPsyLftmCnfmMaxAmt) {
    putNumber(
        beginPol8RetPsyLftmCnfmMaxAmt,
        pol8RetPsyLftmCnfmMaxAmt,
        POL_8_RET_PSY_LFTM_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8RetPsyLftmCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8RetPsyLftmCnfmMaxAmt */
  protected long serializePol8RetPsyLftmCnfmMaxAmt(char[] value) {
    long pol8RetPsyLftmCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8RetPsyLftmCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8RetPsyLftmCnfmMaxAmt, 7);
    localPol8RetPsyLftmCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8RetPsyLftmCnfmMaxAmt;
  }

  protected long checkPol8RetPsyLftmCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8RetPsyLftmCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8RetPsyLftmCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8RetPsyLftmCnfmMaxAmt,
          POL_8_RET_PSY_LFTM_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8RetPsyLftmCnfmMaxAmt",
          beginPol8RetPsyLftmCnfmMaxAmt,
          POL_8_RET_PSY_LFTM_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol8PsyLftmNonCnfmMaxAmtCounter = -1;

  public boolean isPol8PsyLftmNonCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8PsyLftmNonCnfmMaxAmtCounter != sharedCounter;
    localPol8PsyLftmNonCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8PsyLftmNonCnfmMaxAmt
   *
   * @return pol8PsyLftmNonCnfmMaxAmt
   */
  public char[] getPol8PsyLftmNonCnfmMaxAmtString() {
    return getCharArray(beginPol8PsyLftmNonCnfmMaxAmt, POL_8_PSY_LFTM_NON_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8PsyLftmNonCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8PsyLftmNonCnfmMaxAmt,
        beginPol8PsyLftmNonCnfmMaxAmt + POL_8_PSY_LFTM_NON_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_PSY_LFTM_NON_CNFM_MAX_AMT_LEN = 7;
  /** serializePol8PsyLftmNonCnfmMaxAmt */
  protected void serializePol8PsyLftmNonCnfmMaxAmt(long pol8PsyLftmNonCnfmMaxAmt) {
    putNumber(
        beginPol8PsyLftmNonCnfmMaxAmt,
        pol8PsyLftmNonCnfmMaxAmt,
        POL_8_PSY_LFTM_NON_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8PsyLftmNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8PsyLftmNonCnfmMaxAmt */
  protected long serializePol8PsyLftmNonCnfmMaxAmt(char[] value) {
    long pol8PsyLftmNonCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8PsyLftmNonCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8PsyLftmNonCnfmMaxAmt, 7);
    localPol8PsyLftmNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8PsyLftmNonCnfmMaxAmt;
  }

  protected long checkPol8PsyLftmNonCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8PsyLftmNonCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8PsyLftmNonCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8PsyLftmNonCnfmMaxAmt,
          POL_8_PSY_LFTM_NON_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8PsyLftmNonCnfmMaxAmt",
          beginPol8PsyLftmNonCnfmMaxAmt,
          POL_8_PSY_LFTM_NON_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol8PsyLftmCombPrscMxAmtCounter = -1;

  public boolean isPol8PsyLftmCombPrscMxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8PsyLftmCombPrscMxAmtCounter != sharedCounter;
    localPol8PsyLftmCombPrscMxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8PsyLftmCombPrscMxAmt
   *
   * @return pol8PsyLftmCombPrscMxAmt
   */
  public char[] getPol8PsyLftmCombPrscMxAmtString() {
    return getCharArray(beginPol8PsyLftmCombPrscMxAmt, POL_8_PSY_LFTM_COMB_PRSC_MX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8PsyLftmCombPrscMxAmtIsNumeric() {
    return isNumeric(
        beginPol8PsyLftmCombPrscMxAmt,
        beginPol8PsyLftmCombPrscMxAmt + POL_8_PSY_LFTM_COMB_PRSC_MX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_PSY_LFTM_COMB_PRSC_MX_AMT_LEN = 7;
  /** serializePol8PsyLftmCombPrscMxAmt */
  protected void serializePol8PsyLftmCombPrscMxAmt(long pol8PsyLftmCombPrscMxAmt) {
    putNumber(
        beginPol8PsyLftmCombPrscMxAmt,
        pol8PsyLftmCombPrscMxAmt,
        POL_8_PSY_LFTM_COMB_PRSC_MX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8PsyLftmCombPrscMxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8PsyLftmCombPrscMxAmt */
  protected long serializePol8PsyLftmCombPrscMxAmt(char[] value) {
    long pol8PsyLftmCombPrscMxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8PsyLftmCombPrscMxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8PsyLftmCombPrscMxAmt, 7);
    localPol8PsyLftmCombPrscMxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8PsyLftmCombPrscMxAmt;
  }

  protected long checkPol8PsyLftmCombPrscMxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8PsyLftmCombPrscMxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8PsyLftmCombPrscMxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8PsyLftmCombPrscMxAmt,
          POL_8_PSY_LFTM_COMB_PRSC_MX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8PsyLftmCombPrscMxAmt",
          beginPol8PsyLftmCombPrscMxAmt,
          POL_8_PSY_LFTM_COMB_PRSC_MX_AMT_LEN);
    }
  }

  int localPol8RetPsyCyrCnfmMaxAmtCounter = -1;

  public boolean isPol8RetPsyCyrCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPsyCyrCnfmMaxAmtCounter != sharedCounter;
    localPol8RetPsyCyrCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8RetPsyCyrCnfmMaxAmt
   *
   * @return pol8RetPsyCyrCnfmMaxAmt
   */
  public char[] getPol8RetPsyCyrCnfmMaxAmtString() {
    return getCharArray(beginPol8RetPsyCyrCnfmMaxAmt, POL_8_RET_PSY_CYR_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8RetPsyCyrCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8RetPsyCyrCnfmMaxAmt,
        beginPol8RetPsyCyrCnfmMaxAmt + POL_8_RET_PSY_CYR_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_RET_PSY_CYR_CNFM_MAX_AMT_LEN = 7;
  /** serializePol8RetPsyCyrCnfmMaxAmt */
  protected void serializePol8RetPsyCyrCnfmMaxAmt(long pol8RetPsyCyrCnfmMaxAmt) {
    putNumber(
        beginPol8RetPsyCyrCnfmMaxAmt,
        pol8RetPsyCyrCnfmMaxAmt,
        POL_8_RET_PSY_CYR_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8RetPsyCyrCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8RetPsyCyrCnfmMaxAmt */
  protected long serializePol8RetPsyCyrCnfmMaxAmt(char[] value) {
    long pol8RetPsyCyrCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8RetPsyCyrCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8RetPsyCyrCnfmMaxAmt, 7);
    localPol8RetPsyCyrCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8RetPsyCyrCnfmMaxAmt;
  }

  protected long checkPol8RetPsyCyrCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8RetPsyCyrCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8RetPsyCyrCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8RetPsyCyrCnfmMaxAmt,
          POL_8_RET_PSY_CYR_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8RetPsyCyrCnfmMaxAmt",
          beginPol8RetPsyCyrCnfmMaxAmt,
          POL_8_RET_PSY_CYR_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol8PsyCyrCombPrscMaxAmtCounter = -1;

  public boolean isPol8PsyCyrCombPrscMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8PsyCyrCombPrscMaxAmtCounter != sharedCounter;
    localPol8PsyCyrCombPrscMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8PsyCyrCombPrscMaxAmt
   *
   * @return pol8PsyCyrCombPrscMaxAmt
   */
  public char[] getPol8PsyCyrCombPrscMaxAmtString() {
    return getCharArray(beginPol8PsyCyrCombPrscMaxAmt, POL_8_PSY_CYR_COMB_PRSC_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8PsyCyrCombPrscMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8PsyCyrCombPrscMaxAmt,
        beginPol8PsyCyrCombPrscMaxAmt + POL_8_PSY_CYR_COMB_PRSC_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_PSY_CYR_COMB_PRSC_MAX_AMT_LEN = 7;
  /** serializePol8PsyCyrCombPrscMaxAmt */
  protected void serializePol8PsyCyrCombPrscMaxAmt(long pol8PsyCyrCombPrscMaxAmt) {
    putNumber(
        beginPol8PsyCyrCombPrscMaxAmt,
        pol8PsyCyrCombPrscMaxAmt,
        POL_8_PSY_CYR_COMB_PRSC_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8PsyCyrCombPrscMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8PsyCyrCombPrscMaxAmt */
  protected long serializePol8PsyCyrCombPrscMaxAmt(char[] value) {
    long pol8PsyCyrCombPrscMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8PsyCyrCombPrscMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8PsyCyrCombPrscMaxAmt, 7);
    localPol8PsyCyrCombPrscMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8PsyCyrCombPrscMaxAmt;
  }

  protected long checkPol8PsyCyrCombPrscMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8PsyCyrCombPrscMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8PsyCyrCombPrscMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8PsyCyrCombPrscMaxAmt,
          POL_8_PSY_CYR_COMB_PRSC_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8PsyCyrCombPrscMaxAmt",
          beginPol8PsyCyrCombPrscMaxAmt,
          POL_8_PSY_CYR_COMB_PRSC_MAX_AMT_LEN);
    }
  }

  int localPol8PsyCyrNonCnfmMaxAmtCounter = -1;

  public boolean isPol8PsyCyrNonCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8PsyCyrNonCnfmMaxAmtCounter != sharedCounter;
    localPol8PsyCyrNonCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8PsyCyrNonCnfmMaxAmt
   *
   * @return pol8PsyCyrNonCnfmMaxAmt
   */
  public char[] getPol8PsyCyrNonCnfmMaxAmtString() {
    return getCharArray(beginPol8PsyCyrNonCnfmMaxAmt, POL_8_PSY_CYR_NON_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8PsyCyrNonCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8PsyCyrNonCnfmMaxAmt,
        beginPol8PsyCyrNonCnfmMaxAmt + POL_8_PSY_CYR_NON_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_PSY_CYR_NON_CNFM_MAX_AMT_LEN = 7;
  /** serializePol8PsyCyrNonCnfmMaxAmt */
  protected void serializePol8PsyCyrNonCnfmMaxAmt(long pol8PsyCyrNonCnfmMaxAmt) {
    putNumber(
        beginPol8PsyCyrNonCnfmMaxAmt,
        pol8PsyCyrNonCnfmMaxAmt,
        POL_8_PSY_CYR_NON_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8PsyCyrNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8PsyCyrNonCnfmMaxAmt */
  protected long serializePol8PsyCyrNonCnfmMaxAmt(char[] value) {
    long pol8PsyCyrNonCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8PsyCyrNonCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8PsyCyrNonCnfmMaxAmt, 7);
    localPol8PsyCyrNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8PsyCyrNonCnfmMaxAmt;
  }

  protected long checkPol8PsyCyrNonCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8PsyCyrNonCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8PsyCyrNonCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8PsyCyrNonCnfmMaxAmt,
          POL_8_PSY_CYR_NON_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8PsyCyrNonCnfmMaxAmt",
          beginPol8PsyCyrNonCnfmMaxAmt,
          POL_8_PSY_CYR_NON_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol8RetMbrNtwkKeyMtchCdCounter = -1;

  public boolean isPol8RetMbrNtwkKeyMtchCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetMbrNtwkKeyMtchCdCounter != sharedCounter;
    localPol8RetMbrNtwkKeyMtchCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_MBR_NTWK_KEY_MTCH_CD_LEN = 1;
  /** serialize this Pol8RetMbrNtwkKeyMtchCd */
  protected void serializePol8RetMbrNtwkKeyMtchCd(char[] pol8RetMbrNtwkKeyMtchCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetMbrNtwkKeyMtchCd,
        0,
        getStringValue(),
        beginPol8RetMbrNtwkKeyMtchCd,
        POL_8_RET_MBR_NTWK_KEY_MTCH_CD_LEN);
    localPol8RetMbrNtwkKeyMtchCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetMbrNtwkKeyMtchCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetMbrNtwkKeyMtchCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetMbrNtwkKeyMtchCd() {
    return (substring(
        getStringValue(),
        beginPol8RetMbrNtwkKeyMtchCd,
        beginPol8RetMbrNtwkKeyMtchCd + POL_8_RET_MBR_NTWK_KEY_MTCH_CD_LEN));
  }

  int localPol8RetDsesStTblNbrCounter = -1;

  public boolean isPol8RetDsesStTblNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetDsesStTblNbrCounter != sharedCounter;
    localPol8RetDsesStTblNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_DSES_ST_TBL_NBR_LEN = 6;
  /** serialize this Pol8RetDsesStTblNbr */
  protected void serializePol8RetDsesStTblNbr(char[] pol8RetDsesStTblNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetDsesStTblNbr,
        0,
        getStringValue(),
        beginPol8RetDsesStTblNbr,
        POL_8_RET_DSES_ST_TBL_NBR_LEN);
    localPol8RetDsesStTblNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetDsesStTblNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol8RetDsesStTblNbr is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetDsesStTblNbr() {
    return (substring(
        getStringValue(),
        beginPol8RetDsesStTblNbr,
        beginPol8RetDsesStTblNbr + POL_8_RET_DSES_ST_TBL_NBR_LEN));
  }

  int localPol8RetPlnAttrCounter = -1;

  public boolean isPol8RetPlnAttrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPlnAttrCounter != sharedCounter;
    localPol8RetPlnAttrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PLN_ATTR_LEN = 2;
  /** serialize this Pol8RetPlnAttr */
  protected void serializePol8RetPlnAttr(char[] pol8RetPlnAttr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol8RetPlnAttr, 0, getStringValue(), beginPol8RetPlnAttr, POL_8_RET_PLN_ATTR_LEN);
    localPol8RetPlnAttrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetPlnAttrConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol8RetPlnAttr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetPlnAttr() {
    return (substring(
        getStringValue(), beginPol8RetPlnAttr, beginPol8RetPlnAttr + POL_8_RET_PLN_ATTR_LEN));
  }

  int localPol8RetOopMaxCovCdCounter = -1;

  public boolean isPol8RetOopMaxCovCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetOopMaxCovCdCounter != sharedCounter;
    localPol8RetOopMaxCovCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_OOP_MAX_COV_CD_LEN = 1;
  /** serialize this Pol8RetOopMaxCovCd */
  protected void serializePol8RetOopMaxCovCd(char[] pol8RetOopMaxCovCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetOopMaxCovCd,
        0,
        getStringValue(),
        beginPol8RetOopMaxCovCd,
        POL_8_RET_OOP_MAX_COV_CD_LEN);
    localPol8RetOopMaxCovCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetOopMaxCovCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetOopMaxCovCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetOopMaxCovCd() {
    return (substring(
        getStringValue(),
        beginPol8RetOopMaxCovCd,
        beginPol8RetOopMaxCovCd + POL_8_RET_OOP_MAX_COV_CD_LEN));
  }

  int localPol8RetMxiEffDateCounter = -1;

  public boolean isPol8RetMxiEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetMxiEffDateCounter != sharedCounter;
    localPol8RetMxiEffDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_MXI_EFF_DATE_LEN = 8;
  /** serialize this Pol8RetMxiEffDate */
  protected void serializePol8RetMxiEffDate(char[] pol8RetMxiEffDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetMxiEffDate, 0, getStringValue(), beginPol8RetMxiEffDate, POL_8_RET_MXI_EFF_DATE_LEN);
    localPol8RetMxiEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetMxiEffDateConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshPol8RetMxiEffDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetMxiEffDate() {
    return (substring(
        getStringValue(),
        beginPol8RetMxiEffDate,
        beginPol8RetMxiEffDate + POL_8_RET_MXI_EFF_DATE_LEN));
  }

  int localPol8RetMxiEndDateCounter = -1;

  public boolean isPol8RetMxiEndDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetMxiEndDateCounter != sharedCounter;
    localPol8RetMxiEndDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_MXI_END_DATE_LEN = 8;
  /** serialize this Pol8RetMxiEndDate */
  protected void serializePol8RetMxiEndDate(char[] pol8RetMxiEndDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetMxiEndDate, 0, getStringValue(), beginPol8RetMxiEndDate, POL_8_RET_MXI_END_DATE_LEN);
    localPol8RetMxiEndDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetMxiEndDateConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshPol8RetMxiEndDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetMxiEndDate() {
    return (substring(
        getStringValue(),
        beginPol8RetMxiEndDate,
        beginPol8RetMxiEndDate + POL_8_RET_MXI_END_DATE_LEN));
  }

  int localPol8RetTciTableNumberCounter = -1;

  public boolean isPol8RetTciTableNumberModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetTciTableNumberCounter != sharedCounter;
    localPol8RetTciTableNumberCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_TCI_TABLE_NUMBER_LEN = 6;
  /** serialize this Pol8RetTciTableNumber */
  protected void serializePol8RetTciTableNumber(char[] pol8RetTciTableNumber) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetTciTableNumber,
        0,
        getStringValue(),
        beginPol8RetTciTableNumber,
        POL_8_RET_TCI_TABLE_NUMBER_LEN);
    localPol8RetTciTableNumberCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetTciTableNumberConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol8RetTciTableNumber is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetTciTableNumber() {
    return (substring(
        getStringValue(),
        beginPol8RetTciTableNumber,
        beginPol8RetTciTableNumber + POL_8_RET_TCI_TABLE_NUMBER_LEN));
  }

  int localPol8RetPlnFturIndCounter = -1;

  public boolean isPol8RetPlnFturIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPlnFturIndCounter != sharedCounter;
    localPol8RetPlnFturIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PLN_FTUR_IND_LEN = 1;
  /** serialize this Pol8RetPlnFturInd */
  protected void serializePol8RetPlnFturInd(char[] pol8RetPlnFturInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetPlnFturInd, 0, getStringValue(), beginPol8RetPlnFturInd, POL_8_RET_PLN_FTUR_IND_LEN);
    localPol8RetPlnFturIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetPlnFturIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetPlnFturInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetPlnFturInd() {
    return (substring(
        getStringValue(),
        beginPol8RetPlnFturInd,
        beginPol8RetPlnFturInd + POL_8_RET_PLN_FTUR_IND_LEN));
  }

  int localPol8RetPolicyKeyCounter = -1;

  public boolean isPol8RetPolicyKeyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPolicyKeyCounter != sharedCounter;
    localPol8RetPolicyKeyCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_POLICY_KEY_LEN = 6;
  /** serialize this Pol8RetPolicyKey */
  protected void serializePol8RetPolicyKey(char[] pol8RetPolicyKey) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetPolicyKey, 0, getStringValue(), beginPol8RetPolicyKey, POL_8_RET_POLICY_KEY_LEN);
    localPol8RetPolicyKeyCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetPolicyKeyConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol8RetPolicyKey is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetPolicyKey() {
    return (substring(
        getStringValue(), beginPol8RetPolicyKey, beginPol8RetPolicyKey + POL_8_RET_POLICY_KEY_LEN));
  }

  int localPol8RetPlanKeyCounter = -1;

  public boolean isPol8RetPlanKeyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPlanKeyCounter != sharedCounter;
    localPol8RetPlanKeyCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PLAN_KEY_LEN = 4;
  /** serialize this Pol8RetPlanKey */
  protected void serializePol8RetPlanKey(char[] pol8RetPlanKey) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol8RetPlanKey, 0, getStringValue(), beginPol8RetPlanKey, POL_8_RET_PLAN_KEY_LEN);
    localPol8RetPlanKeyCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetPlanKeyConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshPol8RetPlanKey is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetPlanKey() {
    return (substring(
        getStringValue(), beginPol8RetPlanKey, beginPol8RetPlanKey + POL_8_RET_PLAN_KEY_LEN));
  }

  int localPol8RetClassKeyCounter = -1;

  public boolean isPol8RetClassKeyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetClassKeyCounter != sharedCounter;
    localPol8RetClassKeyCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_CLASS_KEY_LEN = 4;
  /** serialize this Pol8RetClassKey */
  protected void serializePol8RetClassKey(char[] pol8RetClassKey) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol8RetClassKey, 0, getStringValue(), beginPol8RetClassKey, POL_8_RET_CLASS_KEY_LEN);
    localPol8RetClassKeyCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetClassKeyConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshPol8RetClassKey is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetClassKey() {
    return (substring(
        getStringValue(), beginPol8RetClassKey, beginPol8RetClassKey + POL_8_RET_CLASS_KEY_LEN));
  }

  int localPol8RetCovTypKeyCounter = -1;

  public boolean isPol8RetCovTypKeyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetCovTypKeyCounter != sharedCounter;
    localPol8RetCovTypKeyCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_COV_TYP_KEY_LEN = 1;
  /** serialize this Pol8RetCovTypKey */
  protected void serializePol8RetCovTypKey(char[] pol8RetCovTypKey) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetCovTypKey, 0, getStringValue(), beginPol8RetCovTypKey, POL_8_RET_COV_TYP_KEY_LEN);
    localPol8RetCovTypKeyCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetCovTypKeyConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetCovTypKey is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetCovTypKey() {
    return (substring(
        getStringValue(),
        beginPol8RetCovTypKey,
        beginPol8RetCovTypKey + POL_8_RET_COV_TYP_KEY_LEN));
  }

  int localPol8RetOonLftmMaxAmtCounter = -1;

  public boolean isPol8RetOonLftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetOonLftmMaxAmtCounter != sharedCounter;
    localPol8RetOonLftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol8RetOonLftmMaxAmt
   *
   * @return pol8RetOonLftmMaxAmt
   */
  public char[] getPol8RetOonLftmMaxAmtString() {
    return getCharArray(beginPol8RetOonLftmMaxAmt, POL_8_RET_OON_LFTM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol8RetOonLftmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol8RetOonLftmMaxAmt,
        beginPol8RetOonLftmMaxAmt + POL_8_RET_OON_LFTM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_8_RET_OON_LFTM_MAX_AMT_LEN = 7;
  /** serializePol8RetOonLftmMaxAmt */
  protected void serializePol8RetOonLftmMaxAmt(long pol8RetOonLftmMaxAmt) {
    putNumber(
        beginPol8RetOonLftmMaxAmt,
        pol8RetOonLftmMaxAmt,
        POL_8_RET_OON_LFTM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol8RetOonLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol8RetOonLftmMaxAmt */
  protected long serializePol8RetOonLftmMaxAmt(char[] value) {
    long pol8RetOonLftmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol8RetOonLftmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol8RetOonLftmMaxAmt, 7);
    localPol8RetOonLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol8RetOonLftmMaxAmt;
  }

  protected long checkPol8RetOonLftmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol8RetOonLftmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol8RetOonLftmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol8RetOonLftmMaxAmt,
          POL_8_RET_OON_LFTM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol8RetOonLftmMaxAmt", beginPol8RetOonLftmMaxAmt, POL_8_RET_OON_LFTM_MAX_AMT_LEN);
    }
  }

  int localPol8RetContrBaseTierCdCounter = -1;

  public boolean isPol8RetContrBaseTierCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetContrBaseTierCdCounter != sharedCounter;
    localPol8RetContrBaseTierCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_CONTR_BASE_TIER_CD_LEN = 1;
  /** serialize this Pol8RetContrBaseTierCd */
  protected void serializePol8RetContrBaseTierCd(char[] pol8RetContrBaseTierCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetContrBaseTierCd,
        0,
        getStringValue(),
        beginPol8RetContrBaseTierCd,
        POL_8_RET_CONTR_BASE_TIER_CD_LEN);
    localPol8RetContrBaseTierCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetContrBaseTierCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetContrBaseTierCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetContrBaseTierCd() {
    return (substring(
        getStringValue(),
        beginPol8RetContrBaseTierCd,
        beginPol8RetContrBaseTierCd + POL_8_RET_CONTR_BASE_TIER_CD_LEN));
  }

  int localPol8RetReferralIndCounter = -1;

  public boolean isPol8RetReferralIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetReferralIndCounter != sharedCounter;
    localPol8RetReferralIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_REFERRAL_IND_LEN = 1;
  /** serialize this Pol8RetReferralInd */
  protected void serializePol8RetReferralInd(char[] pol8RetReferralInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetReferralInd,
        0,
        getStringValue(),
        beginPol8RetReferralInd,
        POL_8_RET_REFERRAL_IND_LEN);
    localPol8RetReferralIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetReferralIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetReferralInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetReferralInd() {
    return (substring(
        getStringValue(),
        beginPol8RetReferralInd,
        beginPol8RetReferralInd + POL_8_RET_REFERRAL_IND_LEN));
  }

  int localPol8NhpNtwkFlexIndCounter = -1;

  public boolean isPol8NhpNtwkFlexIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8NhpNtwkFlexIndCounter != sharedCounter;
    localPol8NhpNtwkFlexIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_NHP_NTWK_FLEX_IND_LEN = 1;
  /** serialize this Pol8NhpNtwkFlexInd */
  protected void serializePol8NhpNtwkFlexInd(char[] pol8NhpNtwkFlexInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8NhpNtwkFlexInd,
        0,
        getStringValue(),
        beginPol8NhpNtwkFlexInd,
        POL_8_NHP_NTWK_FLEX_IND_LEN);
    localPol8NhpNtwkFlexIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8NhpNtwkFlexIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8NhpNtwkFlexInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8NhpNtwkFlexInd() {
    return (substring(
        getStringValue(),
        beginPol8NhpNtwkFlexInd,
        beginPol8NhpNtwkFlexInd + POL_8_NHP_NTWK_FLEX_IND_LEN));
  }

  int localPol8RetProductCdCounter = -1;

  public boolean isPol8RetProductCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetProductCdCounter != sharedCounter;
    localPol8RetProductCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PRODUCT_CD_LEN = 3;
  /** serialize this Pol8RetProductCd */
  protected void serializePol8RetProductCd(char[] pol8RetProductCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetProductCd, 0, getStringValue(), beginPol8RetProductCd, POL_8_RET_PRODUCT_CD_LEN);
    localPol8RetProductCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetProductCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol8RetProductCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetProductCd() {
    return (substring(
        getStringValue(), beginPol8RetProductCd, beginPol8RetProductCd + POL_8_RET_PRODUCT_CD_LEN));
  }

  int localPol8RetMktTypCdCounter = -1;

  public boolean isPol8RetMktTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetMktTypCdCounter != sharedCounter;
    localPol8RetMktTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_MKT_TYP_CD_LEN = 2;
  /** serialize this Pol8RetMktTypCd */
  protected void serializePol8RetMktTypCd(char[] pol8RetMktTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol8RetMktTypCd, 0, getStringValue(), beginPol8RetMktTypCd, POL_8_RET_MKT_TYP_CD_LEN);
    localPol8RetMktTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetMktTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol8RetMktTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetMktTypCd() {
    return (substring(
        getStringValue(), beginPol8RetMktTypCd, beginPol8RetMktTypCd + POL_8_RET_MKT_TYP_CD_LEN));
  }

  int localPol8NptRulePkgIdCounter = -1;

  public boolean isPol8NptRulePkgIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8NptRulePkgIdCounter != sharedCounter;
    localPol8NptRulePkgIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_NPT_RULE_PKG_ID_LEN = 6;
  /** serialize this Pol8NptRulePkgId */
  protected void serializePol8NptRulePkgId(char[] pol8NptRulePkgId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8NptRulePkgId, 0, getStringValue(), beginPol8NptRulePkgId, POL_8_NPT_RULE_PKG_ID_LEN);
    localPol8NptRulePkgIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8NptRulePkgIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol8NptRulePkgId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8NptRulePkgId() {
    return (substring(
        getStringValue(),
        beginPol8NptRulePkgId,
        beginPol8NptRulePkgId + POL_8_NPT_RULE_PKG_ID_LEN));
  }

  int localPol8PrefLabNtwkIndCounter = -1;

  public boolean isPol8PrefLabNtwkIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8PrefLabNtwkIndCounter != sharedCounter;
    localPol8PrefLabNtwkIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_PREF_LAB_NTWK_IND_LEN = 6;
  /** serialize this Pol8PrefLabNtwkInd */
  protected void serializePol8PrefLabNtwkInd(char[] pol8PrefLabNtwkInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8PrefLabNtwkInd,
        0,
        getStringValue(),
        beginPol8PrefLabNtwkInd,
        POL_8_PREF_LAB_NTWK_IND_LEN);
    localPol8PrefLabNtwkIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8PrefLabNtwkIndConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol8PrefLabNtwkInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8PrefLabNtwkInd() {
    return (substring(
        getStringValue(),
        beginPol8PrefLabNtwkInd,
        beginPol8PrefLabNtwkInd + POL_8_PREF_LAB_NTWK_IND_LEN));
  }

  int localPol8RetContractStateCounter = -1;

  public boolean isPol8RetContractStateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetContractStateCounter != sharedCounter;
    localPol8RetContractStateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_CONTRACT_STATE_LEN = 2;
  /** serialize this Pol8RetContractState */
  protected void serializePol8RetContractState(char[] pol8RetContractState) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetContractState,
        0,
        getStringValue(),
        beginPol8RetContractState,
        POL_8_RET_CONTRACT_STATE_LEN);
    localPol8RetContractStateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetContractStateConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol8RetContractState is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetContractState() {
    return (substring(
        getStringValue(),
        beginPol8RetContractState,
        beginPol8RetContractState + POL_8_RET_CONTRACT_STATE_LEN));
  }

  int localPol8RetFundTypCdCounter = -1;

  public boolean isPol8RetFundTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetFundTypCdCounter != sharedCounter;
    localPol8RetFundTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_FUND_TYP_CD_LEN = 1;
  /** serialize this Pol8RetFundTypCd */
  protected void serializePol8RetFundTypCd(char[] pol8RetFundTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetFundTypCd, 0, getStringValue(), beginPol8RetFundTypCd, POL_8_RET_FUND_TYP_CD_LEN);
    localPol8RetFundTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetFundTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetFundTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetFundTypCd() {
    return (substring(
        getStringValue(),
        beginPol8RetFundTypCd,
        beginPol8RetFundTypCd + POL_8_RET_FUND_TYP_CD_LEN));
  }

  int localPol8RetFaclShrSvCdCounter = -1;

  public boolean isPol8RetFaclShrSvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetFaclShrSvCdCounter != sharedCounter;
    localPol8RetFaclShrSvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_FACL_SHR_SV_CD_LEN = 1;
  /** serialize this Pol8RetFaclShrSvCd */
  protected void serializePol8RetFaclShrSvCd(char[] pol8RetFaclShrSvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetFaclShrSvCd,
        0,
        getStringValue(),
        beginPol8RetFaclShrSvCd,
        POL_8_RET_FACL_SHR_SV_CD_LEN);
    localPol8RetFaclShrSvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetFaclShrSvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetFaclShrSvCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetFaclShrSvCd() {
    return (substring(
        getStringValue(),
        beginPol8RetFaclShrSvCd,
        beginPol8RetFaclShrSvCd + POL_8_RET_FACL_SHR_SV_CD_LEN));
  }

  int localPol8RetPhysnShrSvCdCounter = -1;

  public boolean isPol8RetPhysnShrSvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPhysnShrSvCdCounter != sharedCounter;
    localPol8RetPhysnShrSvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PHYSN_SHR_SV_CD_LEN = 1;
  /** serialize this Pol8RetPhysnShrSvCd */
  protected void serializePol8RetPhysnShrSvCd(char[] pol8RetPhysnShrSvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetPhysnShrSvCd,
        0,
        getStringValue(),
        beginPol8RetPhysnShrSvCd,
        POL_8_RET_PHYSN_SHR_SV_CD_LEN);
    localPol8RetPhysnShrSvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetPhysnShrSvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetPhysnShrSvCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetPhysnShrSvCd() {
    return (substring(
        getStringValue(),
        beginPol8RetPhysnShrSvCd,
        beginPol8RetPhysnShrSvCd + POL_8_RET_PHYSN_SHR_SV_CD_LEN));
  }

  int localPol8RetPhrmCpnIndCounter = -1;

  public boolean isPol8RetPhrmCpnIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetPhrmCpnIndCounter != sharedCounter;
    localPol8RetPhrmCpnIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_PHRM_CPN_IND_LEN = 1;
  /** serialize this Pol8RetPhrmCpnInd */
  protected void serializePol8RetPhrmCpnInd(char[] pol8RetPhrmCpnInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8RetPhrmCpnInd, 0, getStringValue(), beginPol8RetPhrmCpnInd, POL_8_RET_PHRM_CPN_IND_LEN);
    localPol8RetPhrmCpnIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetPhrmCpnIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetPhrmCpnInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetPhrmCpnInd() {
    return (substring(
        getStringValue(),
        beginPol8RetPhrmCpnInd,
        beginPol8RetPhrmCpnInd + POL_8_RET_PHRM_CPN_IND_LEN));
  }

  int localPol8DesgDiagProvCdCounter = -1;

  public boolean isPol8DesgDiagProvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8DesgDiagProvCdCounter != sharedCounter;
    localPol8DesgDiagProvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_DESG_DIAG_PROV_CD_LEN = 1;
  /** serialize this Pol8DesgDiagProvCd */
  protected void serializePol8DesgDiagProvCd(char[] pol8DesgDiagProvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol8DesgDiagProvCd,
        0,
        getStringValue(),
        beginPol8DesgDiagProvCd,
        POL_8_DESG_DIAG_PROV_CD_LEN);
    localPol8DesgDiagProvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8DesgDiagProvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8DesgDiagProvCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8DesgDiagProvCd() {
    return (substring(
        getStringValue(),
        beginPol8DesgDiagProvCd,
        beginPol8DesgDiagProvCd + POL_8_DESG_DIAG_PROV_CD_LEN));
  }

  int localPol8RetMedCpnCdCounter = -1;

  public boolean isPol8RetMedCpnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol8RetMedCpnCdCounter != sharedCounter;
    localPol8RetMedCpnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_8_RET_MED_CPN_CD_LEN = 1;
  /** serialize this Pol8RetMedCpnCd */
  protected void serializePol8RetMedCpnCd(char[] pol8RetMedCpnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol8RetMedCpnCd, 0, getStringValue(), beginPol8RetMedCpnCd, POL_8_RET_MED_CPN_CD_LEN);
    localPol8RetMedCpnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol8RetMedCpnCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol8RetMedCpnCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol8RetMedCpnCd() {
    return (substring(
        getStringValue(), beginPol8RetMedCpnCd, beginPol8RetMedCpnCd + POL_8_RET_MED_CPN_CD_LEN));
  }
}
