package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol2RetArea2Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol2RetArea2Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol2RetArea2Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_2_RET_AREA_2_LENGTH = 176;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol2RetProrationInd;
  protected int beginPol2RetProrationEvent;
  protected int beginPol2RetProductInd;
  protected int beginPol2RetPrefNtwkCd;
  protected int beginPol2RetUhPremDesgCd;
  protected int beginPol2RetMnnrpInd;
  protected int beginPol2RetMnnrpPct;
  protected int beginPol2RetNonEmb;
  protected int beginPol2RetLftmMaxAmt;
  protected int beginPol2RetTier1LftmMaxAmt;
  protected int beginPol2RetDualOopNbrInd;
  protected int beginPol2RetPsyLftmCnfmMaxAmt;
  protected int beginPol2PsyLftmNonCnfmMaxAmt;
  protected int beginPol2PsyLftmCombPrscMxAmt;
  protected int beginPol2RetPsyCyrCnfmMaxAmt;
  protected int beginPol2PsyCyrCombPrscMaxAmt;
  protected int beginPol2PsyCyrNonCnfmMaxAmt;
  protected int beginPol2RetMbrNtwkKeyMtchCd;
  protected int beginPol2RetDsesStTblNbr;
  protected int beginPol2RetPlnAttr;
  protected int beginPol2RetOopMaxCovCd;
  protected int beginPol2RetMxiEffDate;
  protected int beginPol2RetMxiEndDate;

  /** Constructor for Pol2RetArea2Serialized */
  public Pol2RetArea2Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol2RetArea2Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol2RetArea2Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol2RetArea2Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol2RetArea2Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol2RetArea2Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_2_RET_AREA_2_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol2RetProrationInd = getStartOffset() + 0; // set offset for serialization

    beginPol2RetProrationEvent = getStartOffset() + 1; // set offset for serialization

    beginPol2RetProductInd = getStartOffset() + 2; // set offset for serialization

    beginPol2RetPrefNtwkCd = getStartOffset() + 5; // set offset for serialization

    beginPol2RetUhPremDesgCd = getStartOffset() + 6; // set offset for serialization

    beginPol2RetMnnrpInd = getStartOffset() + 7; // set offset for serialization

    beginPol2RetMnnrpPct = getStartOffset() + 8; // set offset for serialization

    beginPol2RetNonEmb = getStartOffset() + 11; // set offset for serialization

    beginPol2RetLftmMaxAmt = getStartOffset() + 12; // set offset for serialization

    beginPol2RetTier1LftmMaxAmt = getStartOffset() + 19; // set offset for serialization

    beginPol2RetDualOopNbrInd = getStartOffset() + 26; // set offset for serialization

    beginPol2RetPsyLftmCnfmMaxAmt = getStartOffset() + 27; // set offset for serialization

    beginPol2PsyLftmNonCnfmMaxAmt = getStartOffset() + 34; // set offset for serialization

    beginPol2PsyLftmCombPrscMxAmt = getStartOffset() + 41; // set offset for serialization

    beginPol2RetPsyCyrCnfmMaxAmt = getStartOffset() + 48; // set offset for serialization

    beginPol2PsyCyrCombPrscMaxAmt = getStartOffset() + 55; // set offset for serialization

    beginPol2PsyCyrNonCnfmMaxAmt = getStartOffset() + 62; // set offset for serialization

    beginPol2RetMbrNtwkKeyMtchCd = getStartOffset() + 69; // set offset for serialization

    beginPol2RetDsesStTblNbr = getStartOffset() + 70; // set offset for serialization

    beginPol2RetPlnAttr = getStartOffset() + 76; // set offset for serialization

    beginPol2RetOopMaxCovCd = getStartOffset() + 78; // set offset for serialization

    beginPol2RetMxiEffDate = getStartOffset() + 79; // set offset for serialization

    beginPol2RetMxiEndDate = getStartOffset() + 87; // set offset for serialization

    /*  end of offset */
  }

  int localPol2RetProrationIndCounter = -1;

  public boolean isPol2RetProrationIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetProrationIndCounter != sharedCounter;
    localPol2RetProrationIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_PRORATION_IND_LEN = 1;
  /** serialize this Pol2RetProrationInd */
  protected void serializePol2RetProrationInd(char[] pol2RetProrationInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetProrationInd,
        0,
        getStringValue(),
        beginPol2RetProrationInd,
        POL_2_RET_PRORATION_IND_LEN);
    localPol2RetProrationIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetProrationIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetProrationInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetProrationInd() {
    return (substring(
        getStringValue(),
        beginPol2RetProrationInd,
        beginPol2RetProrationInd + POL_2_RET_PRORATION_IND_LEN));
  }

  int localPol2RetProrationEventCounter = -1;

  public boolean isPol2RetProrationEventModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetProrationEventCounter != sharedCounter;
    localPol2RetProrationEventCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_PRORATION_EVENT_LEN = 1;
  /** serialize this Pol2RetProrationEvent */
  protected void serializePol2RetProrationEvent(char[] pol2RetProrationEvent) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetProrationEvent,
        0,
        getStringValue(),
        beginPol2RetProrationEvent,
        POL_2_RET_PRORATION_EVENT_LEN);
    localPol2RetProrationEventCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetProrationEventConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetProrationEvent is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetProrationEvent() {
    return (substring(
        getStringValue(),
        beginPol2RetProrationEvent,
        beginPol2RetProrationEvent + POL_2_RET_PRORATION_EVENT_LEN));
  }

  int localPol2RetProductIndCounter = -1;

  public boolean isPol2RetProductIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetProductIndCounter != sharedCounter;
    localPol2RetProductIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_PRODUCT_IND_LEN = 3;
  /** serialize this Pol2RetProductInd */
  protected void serializePol2RetProductInd(char[] pol2RetProductInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetProductInd, 0, getStringValue(), beginPol2RetProductInd, POL_2_RET_PRODUCT_IND_LEN);
    localPol2RetProductIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetProductIndConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol2RetProductInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetProductInd() {
    return (substring(
        getStringValue(),
        beginPol2RetProductInd,
        beginPol2RetProductInd + POL_2_RET_PRODUCT_IND_LEN));
  }

  int localPol2RetPrefNtwkCdCounter = -1;

  public boolean isPol2RetPrefNtwkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetPrefNtwkCdCounter != sharedCounter;
    localPol2RetPrefNtwkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_PREF_NTWK_CD_LEN = 1;
  /** serialize this Pol2RetPrefNtwkCd */
  protected void serializePol2RetPrefNtwkCd(char[] pol2RetPrefNtwkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetPrefNtwkCd, 0, getStringValue(), beginPol2RetPrefNtwkCd, POL_2_RET_PREF_NTWK_CD_LEN);
    localPol2RetPrefNtwkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetPrefNtwkCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetPrefNtwkCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetPrefNtwkCd() {
    return (substring(
        getStringValue(),
        beginPol2RetPrefNtwkCd,
        beginPol2RetPrefNtwkCd + POL_2_RET_PREF_NTWK_CD_LEN));
  }

  int localPol2RetUhPremDesgCdCounter = -1;

  public boolean isPol2RetUhPremDesgCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetUhPremDesgCdCounter != sharedCounter;
    localPol2RetUhPremDesgCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_UH_PREM_DESG_CD_LEN = 1;
  /** serialize this Pol2RetUhPremDesgCd */
  protected void serializePol2RetUhPremDesgCd(char[] pol2RetUhPremDesgCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetUhPremDesgCd,
        0,
        getStringValue(),
        beginPol2RetUhPremDesgCd,
        POL_2_RET_UH_PREM_DESG_CD_LEN);
    localPol2RetUhPremDesgCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetUhPremDesgCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetUhPremDesgCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetUhPremDesgCd() {
    return (substring(
        getStringValue(),
        beginPol2RetUhPremDesgCd,
        beginPol2RetUhPremDesgCd + POL_2_RET_UH_PREM_DESG_CD_LEN));
  }

  int localPol2RetMnnrpIndCounter = -1;

  public boolean isPol2RetMnnrpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMnnrpIndCounter != sharedCounter;
    localPol2RetMnnrpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_MNNRP_IND_LEN = 1;
  /** serialize this Pol2RetMnnrpInd */
  protected void serializePol2RetMnnrpInd(char[] pol2RetMnnrpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol2RetMnnrpInd, 0, getStringValue(), beginPol2RetMnnrpInd, POL_2_RET_MNNRP_IND_LEN);
    localPol2RetMnnrpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetMnnrpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetMnnrpInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetMnnrpInd() {
    return (substring(
        getStringValue(), beginPol2RetMnnrpInd, beginPol2RetMnnrpInd + POL_2_RET_MNNRP_IND_LEN));
  }

  int localPol2RetMnnrpPctCounter = -1;

  public boolean isPol2RetMnnrpPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMnnrpPctCounter != sharedCounter;
    localPol2RetMnnrpPctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2RetMnnrpPct
   *
   * @return pol2RetMnnrpPct
   */
  public char[] getPol2RetMnnrpPctString() {
    return getCharArray(beginPol2RetMnnrpPct, POL_2_RET_MNNRP_PCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2RetMnnrpPctIsNumeric() {
    return isNumeric(
        beginPol2RetMnnrpPct,
        beginPol2RetMnnrpPct + POL_2_RET_MNNRP_PCT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_RET_MNNRP_PCT_LEN = 3;
  /** serializePol2RetMnnrpPct */
  protected void serializePol2RetMnnrpPct(int pol2RetMnnrpPct) {
    putNumber(
        beginPol2RetMnnrpPct,
        pol2RetMnnrpPct,
        POL_2_RET_MNNRP_PCT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2RetMnnrpPctCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2RetMnnrpPct */
  protected int serializePol2RetMnnrpPct(char[] value) {
    int pol2RetMnnrpPct;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2RetMnnrpPct =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol2RetMnnrpPct, 3);
    localPol2RetMnnrpPctCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2RetMnnrpPct;
  }

  protected int checkPol2RetMnnrpPctMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2RetMnnrpPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol2RetMnnrpPct() throws CFException {
    try {
      return (getIntNumber(
          beginPol2RetMnnrpPct,
          POL_2_RET_MNNRP_PCT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol2RetMnnrpPct", beginPol2RetMnnrpPct, POL_2_RET_MNNRP_PCT_LEN);
    }
  }

  int localPol2RetNonEmbCounter = -1;

  public boolean isPol2RetNonEmbModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetNonEmbCounter != sharedCounter;
    localPol2RetNonEmbCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_NON_EMB_LEN = 1;
  /** serialize this Pol2RetNonEmb */
  protected void serializePol2RetNonEmb(char[] pol2RetNonEmb) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol2RetNonEmb, 0, getStringValue(), beginPol2RetNonEmb, POL_2_RET_NON_EMB_LEN);
    localPol2RetNonEmbCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetNonEmbConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetNonEmb is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetNonEmb() {
    return (substring(
        getStringValue(), beginPol2RetNonEmb, beginPol2RetNonEmb + POL_2_RET_NON_EMB_LEN));
  }

  int localPol2RetLftmMaxAmtCounter = -1;

  public boolean isPol2RetLftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetLftmMaxAmtCounter != sharedCounter;
    localPol2RetLftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2RetLftmMaxAmt
   *
   * @return pol2RetLftmMaxAmt
   */
  public char[] getPol2RetLftmMaxAmtString() {
    return getCharArray(beginPol2RetLftmMaxAmt, POL_2_RET_LFTM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2RetLftmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol2RetLftmMaxAmt,
        beginPol2RetLftmMaxAmt + POL_2_RET_LFTM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_RET_LFTM_MAX_AMT_LEN = 7;
  /** serializePol2RetLftmMaxAmt */
  protected void serializePol2RetLftmMaxAmt(long pol2RetLftmMaxAmt) {
    putNumber(
        beginPol2RetLftmMaxAmt,
        pol2RetLftmMaxAmt,
        POL_2_RET_LFTM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2RetLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2RetLftmMaxAmt */
  protected long serializePol2RetLftmMaxAmt(char[] value) {
    long pol2RetLftmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2RetLftmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2RetLftmMaxAmt, 7);
    localPol2RetLftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2RetLftmMaxAmt;
  }

  protected long checkPol2RetLftmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2RetLftmMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol2RetLftmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2RetLftmMaxAmt,
          POL_2_RET_LFTM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol2RetLftmMaxAmt", beginPol2RetLftmMaxAmt, POL_2_RET_LFTM_MAX_AMT_LEN);
    }
  }

  int localPol2RetTier1LftmMaxAmtCounter = -1;

  public boolean isPol2RetTier1LftmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetTier1LftmMaxAmtCounter != sharedCounter;
    localPol2RetTier1LftmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2RetTier1LftmMaxAmt
   *
   * @return pol2RetTier1LftmMaxAmt
   */
  public char[] getPol2RetTier1LftmMaxAmtString() {
    return getCharArray(beginPol2RetTier1LftmMaxAmt, POL_2_RET_TIER_1_LFTM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2RetTier1LftmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol2RetTier1LftmMaxAmt,
        beginPol2RetTier1LftmMaxAmt + POL_2_RET_TIER_1_LFTM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_RET_TIER_1_LFTM_MAX_AMT_LEN = 7;
  /** serializePol2RetTier1LftmMaxAmt */
  protected void serializePol2RetTier1LftmMaxAmt(long pol2RetTier1LftmMaxAmt) {
    putNumber(
        beginPol2RetTier1LftmMaxAmt,
        pol2RetTier1LftmMaxAmt,
        POL_2_RET_TIER_1_LFTM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2RetTier1LftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2RetTier1LftmMaxAmt */
  protected long serializePol2RetTier1LftmMaxAmt(char[] value) {
    long pol2RetTier1LftmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2RetTier1LftmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2RetTier1LftmMaxAmt, 7);
    localPol2RetTier1LftmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2RetTier1LftmMaxAmt;
  }

  protected long checkPol2RetTier1LftmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2RetTier1LftmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol2RetTier1LftmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2RetTier1LftmMaxAmt,
          POL_2_RET_TIER_1_LFTM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol2RetTier1LftmMaxAmt", beginPol2RetTier1LftmMaxAmt, POL_2_RET_TIER_1_LFTM_MAX_AMT_LEN);
    }
  }

  int localPol2RetDualOopNbrIndCounter = -1;

  public boolean isPol2RetDualOopNbrIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetDualOopNbrIndCounter != sharedCounter;
    localPol2RetDualOopNbrIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_DUAL_OOP_NBR_IND_LEN = 1;
  /** serialize this Pol2RetDualOopNbrInd */
  protected void serializePol2RetDualOopNbrInd(char[] pol2RetDualOopNbrInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetDualOopNbrInd,
        0,
        getStringValue(),
        beginPol2RetDualOopNbrInd,
        POL_2_RET_DUAL_OOP_NBR_IND_LEN);
    localPol2RetDualOopNbrIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetDualOopNbrIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetDualOopNbrInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetDualOopNbrInd() {
    return (substring(
        getStringValue(),
        beginPol2RetDualOopNbrInd,
        beginPol2RetDualOopNbrInd + POL_2_RET_DUAL_OOP_NBR_IND_LEN));
  }

  int localPol2RetPsyLftmCnfmMaxAmtCounter = -1;

  public boolean isPol2RetPsyLftmCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetPsyLftmCnfmMaxAmtCounter != sharedCounter;
    localPol2RetPsyLftmCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2RetPsyLftmCnfmMaxAmt
   *
   * @return pol2RetPsyLftmCnfmMaxAmt
   */
  public char[] getPol2RetPsyLftmCnfmMaxAmtString() {
    return getCharArray(beginPol2RetPsyLftmCnfmMaxAmt, POL_2_RET_PSY_LFTM_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2RetPsyLftmCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol2RetPsyLftmCnfmMaxAmt,
        beginPol2RetPsyLftmCnfmMaxAmt + POL_2_RET_PSY_LFTM_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_RET_PSY_LFTM_CNFM_MAX_AMT_LEN = 7;
  /** serializePol2RetPsyLftmCnfmMaxAmt */
  protected void serializePol2RetPsyLftmCnfmMaxAmt(long pol2RetPsyLftmCnfmMaxAmt) {
    putNumber(
        beginPol2RetPsyLftmCnfmMaxAmt,
        pol2RetPsyLftmCnfmMaxAmt,
        POL_2_RET_PSY_LFTM_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2RetPsyLftmCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2RetPsyLftmCnfmMaxAmt */
  protected long serializePol2RetPsyLftmCnfmMaxAmt(char[] value) {
    long pol2RetPsyLftmCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2RetPsyLftmCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2RetPsyLftmCnfmMaxAmt, 7);
    localPol2RetPsyLftmCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2RetPsyLftmCnfmMaxAmt;
  }

  protected long checkPol2RetPsyLftmCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2RetPsyLftmCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol2RetPsyLftmCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2RetPsyLftmCnfmMaxAmt,
          POL_2_RET_PSY_LFTM_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol2RetPsyLftmCnfmMaxAmt",
          beginPol2RetPsyLftmCnfmMaxAmt,
          POL_2_RET_PSY_LFTM_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol2PsyLftmNonCnfmMaxAmtCounter = -1;

  public boolean isPol2PsyLftmNonCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2PsyLftmNonCnfmMaxAmtCounter != sharedCounter;
    localPol2PsyLftmNonCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2PsyLftmNonCnfmMaxAmt
   *
   * @return pol2PsyLftmNonCnfmMaxAmt
   */
  public char[] getPol2PsyLftmNonCnfmMaxAmtString() {
    return getCharArray(beginPol2PsyLftmNonCnfmMaxAmt, POL_2_PSY_LFTM_NON_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2PsyLftmNonCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol2PsyLftmNonCnfmMaxAmt,
        beginPol2PsyLftmNonCnfmMaxAmt + POL_2_PSY_LFTM_NON_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_PSY_LFTM_NON_CNFM_MAX_AMT_LEN = 7;
  /** serializePol2PsyLftmNonCnfmMaxAmt */
  protected void serializePol2PsyLftmNonCnfmMaxAmt(long pol2PsyLftmNonCnfmMaxAmt) {
    putNumber(
        beginPol2PsyLftmNonCnfmMaxAmt,
        pol2PsyLftmNonCnfmMaxAmt,
        POL_2_PSY_LFTM_NON_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2PsyLftmNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2PsyLftmNonCnfmMaxAmt */
  protected long serializePol2PsyLftmNonCnfmMaxAmt(char[] value) {
    long pol2PsyLftmNonCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2PsyLftmNonCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2PsyLftmNonCnfmMaxAmt, 7);
    localPol2PsyLftmNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2PsyLftmNonCnfmMaxAmt;
  }

  protected long checkPol2PsyLftmNonCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2PsyLftmNonCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol2PsyLftmNonCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2PsyLftmNonCnfmMaxAmt,
          POL_2_PSY_LFTM_NON_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol2PsyLftmNonCnfmMaxAmt",
          beginPol2PsyLftmNonCnfmMaxAmt,
          POL_2_PSY_LFTM_NON_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol2PsyLftmCombPrscMxAmtCounter = -1;

  public boolean isPol2PsyLftmCombPrscMxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2PsyLftmCombPrscMxAmtCounter != sharedCounter;
    localPol2PsyLftmCombPrscMxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2PsyLftmCombPrscMxAmt
   *
   * @return pol2PsyLftmCombPrscMxAmt
   */
  public char[] getPol2PsyLftmCombPrscMxAmtString() {
    return getCharArray(beginPol2PsyLftmCombPrscMxAmt, POL_2_PSY_LFTM_COMB_PRSC_MX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2PsyLftmCombPrscMxAmtIsNumeric() {
    return isNumeric(
        beginPol2PsyLftmCombPrscMxAmt,
        beginPol2PsyLftmCombPrscMxAmt + POL_2_PSY_LFTM_COMB_PRSC_MX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_PSY_LFTM_COMB_PRSC_MX_AMT_LEN = 7;
  /** serializePol2PsyLftmCombPrscMxAmt */
  protected void serializePol2PsyLftmCombPrscMxAmt(long pol2PsyLftmCombPrscMxAmt) {
    putNumber(
        beginPol2PsyLftmCombPrscMxAmt,
        pol2PsyLftmCombPrscMxAmt,
        POL_2_PSY_LFTM_COMB_PRSC_MX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2PsyLftmCombPrscMxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2PsyLftmCombPrscMxAmt */
  protected long serializePol2PsyLftmCombPrscMxAmt(char[] value) {
    long pol2PsyLftmCombPrscMxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2PsyLftmCombPrscMxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2PsyLftmCombPrscMxAmt, 7);
    localPol2PsyLftmCombPrscMxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2PsyLftmCombPrscMxAmt;
  }

  protected long checkPol2PsyLftmCombPrscMxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2PsyLftmCombPrscMxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol2PsyLftmCombPrscMxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2PsyLftmCombPrscMxAmt,
          POL_2_PSY_LFTM_COMB_PRSC_MX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol2PsyLftmCombPrscMxAmt",
          beginPol2PsyLftmCombPrscMxAmt,
          POL_2_PSY_LFTM_COMB_PRSC_MX_AMT_LEN);
    }
  }

  int localPol2RetPsyCyrCnfmMaxAmtCounter = -1;

  public boolean isPol2RetPsyCyrCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetPsyCyrCnfmMaxAmtCounter != sharedCounter;
    localPol2RetPsyCyrCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2RetPsyCyrCnfmMaxAmt
   *
   * @return pol2RetPsyCyrCnfmMaxAmt
   */
  public char[] getPol2RetPsyCyrCnfmMaxAmtString() {
    return getCharArray(beginPol2RetPsyCyrCnfmMaxAmt, POL_2_RET_PSY_CYR_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2RetPsyCyrCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol2RetPsyCyrCnfmMaxAmt,
        beginPol2RetPsyCyrCnfmMaxAmt + POL_2_RET_PSY_CYR_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_RET_PSY_CYR_CNFM_MAX_AMT_LEN = 7;
  /** serializePol2RetPsyCyrCnfmMaxAmt */
  protected void serializePol2RetPsyCyrCnfmMaxAmt(long pol2RetPsyCyrCnfmMaxAmt) {
    putNumber(
        beginPol2RetPsyCyrCnfmMaxAmt,
        pol2RetPsyCyrCnfmMaxAmt,
        POL_2_RET_PSY_CYR_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2RetPsyCyrCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2RetPsyCyrCnfmMaxAmt */
  protected long serializePol2RetPsyCyrCnfmMaxAmt(char[] value) {
    long pol2RetPsyCyrCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2RetPsyCyrCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2RetPsyCyrCnfmMaxAmt, 7);
    localPol2RetPsyCyrCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2RetPsyCyrCnfmMaxAmt;
  }

  protected long checkPol2RetPsyCyrCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2RetPsyCyrCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol2RetPsyCyrCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2RetPsyCyrCnfmMaxAmt,
          POL_2_RET_PSY_CYR_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol2RetPsyCyrCnfmMaxAmt",
          beginPol2RetPsyCyrCnfmMaxAmt,
          POL_2_RET_PSY_CYR_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol2PsyCyrCombPrscMaxAmtCounter = -1;

  public boolean isPol2PsyCyrCombPrscMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2PsyCyrCombPrscMaxAmtCounter != sharedCounter;
    localPol2PsyCyrCombPrscMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2PsyCyrCombPrscMaxAmt
   *
   * @return pol2PsyCyrCombPrscMaxAmt
   */
  public char[] getPol2PsyCyrCombPrscMaxAmtString() {
    return getCharArray(beginPol2PsyCyrCombPrscMaxAmt, POL_2_PSY_CYR_COMB_PRSC_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2PsyCyrCombPrscMaxAmtIsNumeric() {
    return isNumeric(
        beginPol2PsyCyrCombPrscMaxAmt,
        beginPol2PsyCyrCombPrscMaxAmt + POL_2_PSY_CYR_COMB_PRSC_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_PSY_CYR_COMB_PRSC_MAX_AMT_LEN = 7;
  /** serializePol2PsyCyrCombPrscMaxAmt */
  protected void serializePol2PsyCyrCombPrscMaxAmt(long pol2PsyCyrCombPrscMaxAmt) {
    putNumber(
        beginPol2PsyCyrCombPrscMaxAmt,
        pol2PsyCyrCombPrscMaxAmt,
        POL_2_PSY_CYR_COMB_PRSC_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2PsyCyrCombPrscMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2PsyCyrCombPrscMaxAmt */
  protected long serializePol2PsyCyrCombPrscMaxAmt(char[] value) {
    long pol2PsyCyrCombPrscMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2PsyCyrCombPrscMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2PsyCyrCombPrscMaxAmt, 7);
    localPol2PsyCyrCombPrscMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2PsyCyrCombPrscMaxAmt;
  }

  protected long checkPol2PsyCyrCombPrscMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2PsyCyrCombPrscMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol2PsyCyrCombPrscMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2PsyCyrCombPrscMaxAmt,
          POL_2_PSY_CYR_COMB_PRSC_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol2PsyCyrCombPrscMaxAmt",
          beginPol2PsyCyrCombPrscMaxAmt,
          POL_2_PSY_CYR_COMB_PRSC_MAX_AMT_LEN);
    }
  }

  int localPol2PsyCyrNonCnfmMaxAmtCounter = -1;

  public boolean isPol2PsyCyrNonCnfmMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2PsyCyrNonCnfmMaxAmtCounter != sharedCounter;
    localPol2PsyCyrNonCnfmMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol2PsyCyrNonCnfmMaxAmt
   *
   * @return pol2PsyCyrNonCnfmMaxAmt
   */
  public char[] getPol2PsyCyrNonCnfmMaxAmtString() {
    return getCharArray(beginPol2PsyCyrNonCnfmMaxAmt, POL_2_PSY_CYR_NON_CNFM_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol2PsyCyrNonCnfmMaxAmtIsNumeric() {
    return isNumeric(
        beginPol2PsyCyrNonCnfmMaxAmt,
        beginPol2PsyCyrNonCnfmMaxAmt + POL_2_PSY_CYR_NON_CNFM_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_2_PSY_CYR_NON_CNFM_MAX_AMT_LEN = 7;
  /** serializePol2PsyCyrNonCnfmMaxAmt */
  protected void serializePol2PsyCyrNonCnfmMaxAmt(long pol2PsyCyrNonCnfmMaxAmt) {
    putNumber(
        beginPol2PsyCyrNonCnfmMaxAmt,
        pol2PsyCyrNonCnfmMaxAmt,
        POL_2_PSY_CYR_NON_CNFM_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol2PsyCyrNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol2PsyCyrNonCnfmMaxAmt */
  protected long serializePol2PsyCyrNonCnfmMaxAmt(char[] value) {
    long pol2PsyCyrNonCnfmMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol2PsyCyrNonCnfmMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol2PsyCyrNonCnfmMaxAmt, 7);
    localPol2PsyCyrNonCnfmMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol2PsyCyrNonCnfmMaxAmt;
  }

  protected long checkPol2PsyCyrNonCnfmMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol2PsyCyrNonCnfmMaxAmt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public long refreshPol2PsyCyrNonCnfmMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol2PsyCyrNonCnfmMaxAmt,
          POL_2_PSY_CYR_NON_CNFM_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol2PsyCyrNonCnfmMaxAmt",
          beginPol2PsyCyrNonCnfmMaxAmt,
          POL_2_PSY_CYR_NON_CNFM_MAX_AMT_LEN);
    }
  }

  int localPol2RetMbrNtwkKeyMtchCdCounter = -1;

  public boolean isPol2RetMbrNtwkKeyMtchCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMbrNtwkKeyMtchCdCounter != sharedCounter;
    localPol2RetMbrNtwkKeyMtchCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_MBR_NTWK_KEY_MTCH_CD_LEN = 1;
  /** serialize this Pol2RetMbrNtwkKeyMtchCd */
  protected void serializePol2RetMbrNtwkKeyMtchCd(char[] pol2RetMbrNtwkKeyMtchCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetMbrNtwkKeyMtchCd,
        0,
        getStringValue(),
        beginPol2RetMbrNtwkKeyMtchCd,
        POL_2_RET_MBR_NTWK_KEY_MTCH_CD_LEN);
    localPol2RetMbrNtwkKeyMtchCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetMbrNtwkKeyMtchCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetMbrNtwkKeyMtchCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetMbrNtwkKeyMtchCd() {
    return (substring(
        getStringValue(),
        beginPol2RetMbrNtwkKeyMtchCd,
        beginPol2RetMbrNtwkKeyMtchCd + POL_2_RET_MBR_NTWK_KEY_MTCH_CD_LEN));
  }

  int localPol2RetDsesStTblNbrCounter = -1;

  public boolean isPol2RetDsesStTblNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetDsesStTblNbrCounter != sharedCounter;
    localPol2RetDsesStTblNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_DSES_ST_TBL_NBR_LEN = 6;
  /** serialize this Pol2RetDsesStTblNbr */
  protected void serializePol2RetDsesStTblNbr(char[] pol2RetDsesStTblNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetDsesStTblNbr,
        0,
        getStringValue(),
        beginPol2RetDsesStTblNbr,
        POL_2_RET_DSES_ST_TBL_NBR_LEN);
    localPol2RetDsesStTblNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetDsesStTblNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol2RetDsesStTblNbr is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetDsesStTblNbr() {
    return (substring(
        getStringValue(),
        beginPol2RetDsesStTblNbr,
        beginPol2RetDsesStTblNbr + POL_2_RET_DSES_ST_TBL_NBR_LEN));
  }

  int localPol2RetPlnAttrCounter = -1;

  public boolean isPol2RetPlnAttrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetPlnAttrCounter != sharedCounter;
    localPol2RetPlnAttrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_PLN_ATTR_LEN = 2;
  /** serialize this Pol2RetPlnAttr */
  protected void serializePol2RetPlnAttr(char[] pol2RetPlnAttr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol2RetPlnAttr, 0, getStringValue(), beginPol2RetPlnAttr, POL_2_RET_PLN_ATTR_LEN);
    localPol2RetPlnAttrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetPlnAttrConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol2RetPlnAttr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetPlnAttr() {
    return (substring(
        getStringValue(), beginPol2RetPlnAttr, beginPol2RetPlnAttr + POL_2_RET_PLN_ATTR_LEN));
  }

  int localPol2RetOopMaxCovCdCounter = -1;

  public boolean isPol2RetOopMaxCovCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetOopMaxCovCdCounter != sharedCounter;
    localPol2RetOopMaxCovCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_OOP_MAX_COV_CD_LEN = 1;
  /** serialize this Pol2RetOopMaxCovCd */
  protected void serializePol2RetOopMaxCovCd(char[] pol2RetOopMaxCovCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetOopMaxCovCd,
        0,
        getStringValue(),
        beginPol2RetOopMaxCovCd,
        POL_2_RET_OOP_MAX_COV_CD_LEN);
    localPol2RetOopMaxCovCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetOopMaxCovCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetOopMaxCovCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetOopMaxCovCd() {
    return (substring(
        getStringValue(),
        beginPol2RetOopMaxCovCd,
        beginPol2RetOopMaxCovCd + POL_2_RET_OOP_MAX_COV_CD_LEN));
  }

  int localPol2RetMxiEffDateCounter = -1;

  public boolean isPol2RetMxiEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMxiEffDateCounter != sharedCounter;
    localPol2RetMxiEffDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_MXI_EFF_DATE_LEN = 8;
  /** serialize this Pol2RetMxiEffDate */
  protected void serializePol2RetMxiEffDate(char[] pol2RetMxiEffDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetMxiEffDate, 0, getStringValue(), beginPol2RetMxiEffDate, POL_2_RET_MXI_EFF_DATE_LEN);
    localPol2RetMxiEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetMxiEffDateConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshPol2RetMxiEffDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetMxiEffDate() {
    return (substring(
        getStringValue(),
        beginPol2RetMxiEffDate,
        beginPol2RetMxiEffDate + POL_2_RET_MXI_EFF_DATE_LEN));
  }

  int localPol2RetMxiEndDateCounter = -1;

  public boolean isPol2RetMxiEndDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMxiEndDateCounter != sharedCounter;
    localPol2RetMxiEndDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_MXI_END_DATE_LEN = 8;
  /** serialize this Pol2RetMxiEndDate */
  protected void serializePol2RetMxiEndDate(char[] pol2RetMxiEndDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetMxiEndDate, 0, getStringValue(), beginPol2RetMxiEndDate, POL_2_RET_MXI_END_DATE_LEN);
    localPol2RetMxiEndDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetMxiEndDateConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshPol2RetMxiEndDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetMxiEndDate() {
    return (substring(
        getStringValue(),
        beginPol2RetMxiEndDate,
        beginPol2RetMxiEndDate + POL_2_RET_MXI_END_DATE_LEN));
  }
}
