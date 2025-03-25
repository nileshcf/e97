package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol2RetReciprocityOccursSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol2RetReciprocityOccursSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol2RetReciprocityOccursSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_2_RET_RECIPROCITY_OCCURS_LENGTH = 27;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol2RetProductCode;
  protected int beginPol2RetMarketType;
  protected int beginPol2RetMarketNumber;
  protected int beginPol2RetCrosswalkCorr;
  protected int beginPol2RetIpaInd;
  protected int beginPol2RetGroupTableNum;
  protected int beginPol2RetContractArrangeCd;
  protected int beginPol2RetPolPlnPrefNtwkCd;
  protected int beginPol2RetInclExclMarketInd;
  protected int beginPol2RetMentalHealthInd;
  protected int beginPol2RetTravelBenefitInd;

  /** Constructor for Pol2RetReciprocityOccursSerialized */
  public Pol2RetReciprocityOccursSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol2RetReciprocityOccursSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol2RetReciprocityOccursSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol2RetReciprocityOccursSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 95); // serialize this field at offset 95 by default
  }

  /**
   * sets parent for this Pol2RetReciprocityOccursSerialized to the parent and set the serialize
   * offset to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 95 by default
  }
  /** initializes the field in Pol2RetReciprocityOccursSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_2_RET_RECIPROCITY_OCCURS_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol2RetProductCode = getStartOffset() + 0; // set offset for serialization

    beginPol2RetMarketType = getStartOffset() + 3; // set offset for serialization

    beginPol2RetMarketNumber = getStartOffset() + 5; // set offset for serialization

    beginPol2RetCrosswalkCorr = getStartOffset() + 12; // set offset for serialization

    beginPol2RetIpaInd = getStartOffset() + 13; // set offset for serialization

    beginPol2RetGroupTableNum = getStartOffset() + 18; // set offset for serialization

    beginPol2RetContractArrangeCd = getStartOffset() + 22; // set offset for serialization

    beginPol2RetPolPlnPrefNtwkCd = getStartOffset() + 23; // set offset for serialization

    beginPol2RetInclExclMarketInd = getStartOffset() + 24; // set offset for serialization

    beginPol2RetMentalHealthInd = getStartOffset() + 25; // set offset for serialization

    beginPol2RetTravelBenefitInd = getStartOffset() + 26; // set offset for serialization

    /*  end of offset */
  }

  int localPol2RetProductCodeCounter = -1;

  public boolean isPol2RetProductCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetProductCodeCounter != sharedCounter;
    localPol2RetProductCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_PRODUCT_CODE_LEN = 3;
  /** serialize this Pol2RetProductCode */
  protected void serializePol2RetProductCode(char[] pol2RetProductCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetProductCode,
        0,
        getStringValue(),
        beginPol2RetProductCode,
        POL_2_RET_PRODUCT_CODE_LEN);
    localPol2RetProductCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetProductCodeConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol2RetProductCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetProductCode() {
    return (substring(
        getStringValue(),
        beginPol2RetProductCode,
        beginPol2RetProductCode + POL_2_RET_PRODUCT_CODE_LEN));
  }

  int localPol2RetMarketTypeCounter = -1;

  public boolean isPol2RetMarketTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMarketTypeCounter != sharedCounter;
    localPol2RetMarketTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_MARKET_TYPE_LEN = 2;
  /** serialize this Pol2RetMarketType */
  protected void serializePol2RetMarketType(char[] pol2RetMarketType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetMarketType, 0, getStringValue(), beginPol2RetMarketType, POL_2_RET_MARKET_TYPE_LEN);
    localPol2RetMarketTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetMarketTypeConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol2RetMarketType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetMarketType() {
    return (substring(
        getStringValue(),
        beginPol2RetMarketType,
        beginPol2RetMarketType + POL_2_RET_MARKET_TYPE_LEN));
  }

  int localPol2RetMarketNumberCounter = -1;

  public boolean isPol2RetMarketNumberModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMarketNumberCounter != sharedCounter;
    localPol2RetMarketNumberCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_MARKET_NUMBER_LEN = 7;
  /** serialize this Pol2RetMarketNumber */
  protected void serializePol2RetMarketNumber(char[] pol2RetMarketNumber) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetMarketNumber,
        0,
        getStringValue(),
        beginPol2RetMarketNumber,
        POL_2_RET_MARKET_NUMBER_LEN);
    localPol2RetMarketNumberCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetMarketNumberConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshPol2RetMarketNumber is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetMarketNumber() {
    return (substring(
        getStringValue(),
        beginPol2RetMarketNumber,
        beginPol2RetMarketNumber + POL_2_RET_MARKET_NUMBER_LEN));
  }

  int localPol2RetCrosswalkCorrCounter = -1;

  public boolean isPol2RetCrosswalkCorrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetCrosswalkCorrCounter != sharedCounter;
    localPol2RetCrosswalkCorrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_CROSSWALK_CORR_LEN = 1;
  /** serialize this Pol2RetCrosswalkCorr */
  protected void serializePol2RetCrosswalkCorr(char[] pol2RetCrosswalkCorr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetCrosswalkCorr,
        0,
        getStringValue(),
        beginPol2RetCrosswalkCorr,
        POL_2_RET_CROSSWALK_CORR_LEN);
    localPol2RetCrosswalkCorrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetCrosswalkCorrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetCrosswalkCorr is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetCrosswalkCorr() {
    return (substring(
        getStringValue(),
        beginPol2RetCrosswalkCorr,
        beginPol2RetCrosswalkCorr + POL_2_RET_CROSSWALK_CORR_LEN));
  }

  int localPol2RetIpaIndCounter = -1;

  public boolean isPol2RetIpaIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetIpaIndCounter != sharedCounter;
    localPol2RetIpaIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_IPA_IND_LEN = 5;
  /** serialize this Pol2RetIpaInd */
  protected void serializePol2RetIpaInd(char[] pol2RetIpaInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol2RetIpaInd, 0, getStringValue(), beginPol2RetIpaInd, POL_2_RET_IPA_IND_LEN);
    localPol2RetIpaIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetIpaIndConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshPol2RetIpaInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetIpaInd() {
    return (substring(
        getStringValue(), beginPol2RetIpaInd, beginPol2RetIpaInd + POL_2_RET_IPA_IND_LEN));
  }

  int localPol2RetGroupTableNumCounter = -1;

  public boolean isPol2RetGroupTableNumModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetGroupTableNumCounter != sharedCounter;
    localPol2RetGroupTableNumCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_GROUP_TABLE_NUM_LEN = 4;
  /** serialize this Pol2RetGroupTableNum */
  protected void serializePol2RetGroupTableNum(char[] pol2RetGroupTableNum) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetGroupTableNum,
        0,
        getStringValue(),
        beginPol2RetGroupTableNum,
        POL_2_RET_GROUP_TABLE_NUM_LEN);
    localPol2RetGroupTableNumCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetGroupTableNumConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshPol2RetGroupTableNum is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetGroupTableNum() {
    return (substring(
        getStringValue(),
        beginPol2RetGroupTableNum,
        beginPol2RetGroupTableNum + POL_2_RET_GROUP_TABLE_NUM_LEN));
  }

  int localPol2RetContractArrangeCdCounter = -1;

  public boolean isPol2RetContractArrangeCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetContractArrangeCdCounter != sharedCounter;
    localPol2RetContractArrangeCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_CONTRACT_ARRANGE_CD_LEN = 1;
  /** serialize this Pol2RetContractArrangeCd */
  protected void serializePol2RetContractArrangeCd(char[] pol2RetContractArrangeCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetContractArrangeCd,
        0,
        getStringValue(),
        beginPol2RetContractArrangeCd,
        POL_2_RET_CONTRACT_ARRANGE_CD_LEN);
    localPol2RetContractArrangeCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetContractArrangeCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetContractArrangeCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetContractArrangeCd() {
    return (substring(
        getStringValue(),
        beginPol2RetContractArrangeCd,
        beginPol2RetContractArrangeCd + POL_2_RET_CONTRACT_ARRANGE_CD_LEN));
  }

  int localPol2RetPolPlnPrefNtwkCdCounter = -1;

  public boolean isPol2RetPolPlnPrefNtwkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetPolPlnPrefNtwkCdCounter != sharedCounter;
    localPol2RetPolPlnPrefNtwkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_POL_PLN_PREF_NTWK_CD_LEN = 1;
  /** serialize this Pol2RetPolPlnPrefNtwkCd */
  protected void serializePol2RetPolPlnPrefNtwkCd(char[] pol2RetPolPlnPrefNtwkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetPolPlnPrefNtwkCd,
        0,
        getStringValue(),
        beginPol2RetPolPlnPrefNtwkCd,
        POL_2_RET_POL_PLN_PREF_NTWK_CD_LEN);
    localPol2RetPolPlnPrefNtwkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetPolPlnPrefNtwkCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetPolPlnPrefNtwkCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetPolPlnPrefNtwkCd() {
    return (substring(
        getStringValue(),
        beginPol2RetPolPlnPrefNtwkCd,
        beginPol2RetPolPlnPrefNtwkCd + POL_2_RET_POL_PLN_PREF_NTWK_CD_LEN));
  }

  int localPol2RetInclExclMarketIndCounter = -1;

  public boolean isPol2RetInclExclMarketIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetInclExclMarketIndCounter != sharedCounter;
    localPol2RetInclExclMarketIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_INCL_EXCL_MARKET_IND_LEN = 1;
  /** serialize this Pol2RetInclExclMarketInd */
  protected void serializePol2RetInclExclMarketInd(char[] pol2RetInclExclMarketInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetInclExclMarketInd,
        0,
        getStringValue(),
        beginPol2RetInclExclMarketInd,
        POL_2_RET_INCL_EXCL_MARKET_IND_LEN);
    localPol2RetInclExclMarketIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetInclExclMarketIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetInclExclMarketInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetInclExclMarketInd() {
    return (substring(
        getStringValue(),
        beginPol2RetInclExclMarketInd,
        beginPol2RetInclExclMarketInd + POL_2_RET_INCL_EXCL_MARKET_IND_LEN));
  }

  int localPol2RetMentalHealthIndCounter = -1;

  public boolean isPol2RetMentalHealthIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetMentalHealthIndCounter != sharedCounter;
    localPol2RetMentalHealthIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_MENTAL_HEALTH_IND_LEN = 1;
  /** serialize this Pol2RetMentalHealthInd */
  protected void serializePol2RetMentalHealthInd(char[] pol2RetMentalHealthInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetMentalHealthInd,
        0,
        getStringValue(),
        beginPol2RetMentalHealthInd,
        POL_2_RET_MENTAL_HEALTH_IND_LEN);
    localPol2RetMentalHealthIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetMentalHealthIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetMentalHealthInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetMentalHealthInd() {
    return (substring(
        getStringValue(),
        beginPol2RetMentalHealthInd,
        beginPol2RetMentalHealthInd + POL_2_RET_MENTAL_HEALTH_IND_LEN));
  }

  int localPol2RetTravelBenefitIndCounter = -1;

  public boolean isPol2RetTravelBenefitIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol2RetTravelBenefitIndCounter != sharedCounter;
    localPol2RetTravelBenefitIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_2_RET_TRAVEL_BENEFIT_IND_LEN = 1;
  /** serialize this Pol2RetTravelBenefitInd */
  protected void serializePol2RetTravelBenefitInd(char[] pol2RetTravelBenefitInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol2RetTravelBenefitInd,
        0,
        getStringValue(),
        beginPol2RetTravelBenefitInd,
        POL_2_RET_TRAVEL_BENEFIT_IND_LEN);
    localPol2RetTravelBenefitIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol2RetTravelBenefitIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol2RetTravelBenefitInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol2RetTravelBenefitInd() {
    return (substring(
        getStringValue(),
        beginPol2RetTravelBenefitInd,
        beginPol2RetTravelBenefitInd + POL_2_RET_TRAVEL_BENEFIT_IND_LEN));
  }
}
