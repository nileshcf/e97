package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol5RetArea5Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol5RetArea5Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol5RetArea5Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_5_RET_AREA_5_LENGTH = 185;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol5BenMaxCombPriCd;
  protected int beginPol5BenMaxCombPriCnt;
  protected int beginPol5BenMaxCombSecCd;
  protected int beginPol5BenMaxCombSecCnt;
  protected int beginPol5CrdcRehabPriCd;
  protected int beginPol5CrdcRehabPriCnt;
  protected int beginPol5CrdcRehabSecCd;
  protected int beginPol5CrdcRehabSecCnt;
  protected int beginPol5OcpTrpyPriCd;
  protected int beginPol5OcpTrpyPriCnt;
  protected int beginPol5OcpTrpySecCd;
  protected int beginPol5OcpTrpySecCnt;
  protected int beginPol5PhyOcpSpchPriCd;
  protected int beginPol5PhyOcpSpchPriCnt;
  protected int beginPol5PhyOcpSpchSecCd;
  protected int beginPol5PhyOcpSpchSecCnt;
  protected int beginPol5PhyOcpTrpyPriCd;
  protected int beginPol5PhyOcpTrpyPriCnt;
  protected int beginPol5PhyOcpTrpySecCd;
  protected int beginPol5PhyOcpTrpySecCnt;
  protected int beginPol5PhysTrpyPriCd;
  protected int beginPol5PhysTrpyPriCnt;
  protected int beginPol5PhysTrpySecCd;
  protected int beginPol5PhysTrpySecCnt;
  protected int beginPol5SpchTrpyPriCd;
  protected int beginPol5SpchTrpyPriCnt;
  protected int beginPol5SpchTrpySecCd;
  protected int beginPol5SpchTrpySecCnt;
  protected int beginPol5SpineManipPriCd;
  protected int beginPol5SpineManipPriCnt;
  protected int beginPol5SpineManipSecCd;
  protected int beginPol5SpineManipSecCnt;
  protected int beginPol5PhysMedcnPrdCd;
  protected int beginPol5SrvcCdNSetInd;
  protected int beginPol5SrvcCdPSetInd;
  protected int beginPol5SrvcCdTSetInd;
  protected int beginPol5McrInd;
  protected int beginPol5BenMaxAuralCiPriCd;
  protected int beginPol5BenMaxAuralCiPriCnt;
  protected int beginPol5BenMaxAuralCiSecCd;
  protected int beginPol5BenMaxAuralCiSecCnt;
  protected int beginPol5BenMaxCogTrpyPriCd;
  protected int beginPol5BenMaxCogTrpyPriCnt;
  protected int beginPol5BenMaxCogTrpySecCd;
  protected int beginPol5BenMaxCogTrpySecCnt;
  protected int beginPol5BenMaxCogTrpyExclCd;
  protected int beginPol5BenMaxEhbSpneRhabCnt;
  protected int beginPol5BenMaxEhbSpneHabCnt;
  protected int beginPol5BenMaxEhbPtRhabCnt;
  protected int beginPol5BenMaxEhbPtHabCnt;
  protected int beginPol5BenMaxEhbSpchRhabCnt;
  protected int beginPol5BenMaxEhbSpchHabCnt;
  protected int beginPol5BenMaxEhbCrdcRhabCnt;
  protected int beginPol5BenMaxEhbOtRhabCnt;
  protected int beginPol5BenMaxEhbOtHabCnt;
  protected int beginPol5BenMaxEhbPlmryRhabCn;
  protected int beginPol5BenMaxEhbAuralRhabCn;
  protected int beginPol5BenMaxEhbAuralHabCnt;
  protected int beginPol5BenMaxEhbCogRhabCnt;
  protected int beginPol5BenMaxEhbCogHabCnt;
  protected int beginPol5BenMaxEhbPostRhabCnt;
  protected int beginPol5BenMaxEhbPostHabCnt;
  protected int beginPol5BenMaxEhbPtotRhabCnt;
  protected int beginPol5BenMaxEhbPtotHabCnt;
  protected int beginPol5BenMaxEhbRhabRmrkCd;
  protected int beginPol5BenMaxEhbPosmRhabCnt;
  protected int beginPol5BenMaxEhbPosmHabCnt;
  protected int beginPol5BenMaxEhbHabRmrkCd;
  protected int beginPol5BenPhysMedcnPrdCd;
  protected int beginPol5RetRhabCombPtLmtCd;
  protected int beginPol5RetRhabCombOtLmtCd;
  protected int beginPol5RetRhabCombStLmtCd;
  protected int beginPol5RetRhabCombSmLmtCd;
  protected int beginPol5RetRhabCombCiLmtCd;
  protected int beginPol5RetRhabCombCtLmtCd;
  protected int beginPol5RetRhabCombCrLmtCd;
  protected int beginPol5RetRhabCombPrLmtCd;
  protected int beginPol5RetRhabCombMtLmtCd;
  protected int beginPol5RetHabCombPtLmtCd;
  protected int beginPol5RetHabCombOtLmtCd;
  protected int beginPol5RetHabCombStLmtCd;
  protected int beginPol5RetHabCombSmLmtCd;
  protected int beginPol5RetHabCombCiLmtCd;
  protected int beginPol5RetHabCombCtLmtCd;
  protected int beginPol5RetHabCombMtLmtCd;

  /** Constructor for Pol5RetArea5Serialized */
  public Pol5RetArea5Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol5RetArea5Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol5RetArea5Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol5RetArea5Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol5RetArea5Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol5RetArea5Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_5_RET_AREA_5_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol5BenMaxCombPriCd = getStartOffset() + 0; // set offset for serialization

    beginPol5BenMaxCombPriCnt = getStartOffset() + 1; // set offset for serialization

    beginPol5BenMaxCombSecCd = getStartOffset() + 4; // set offset for serialization

    beginPol5BenMaxCombSecCnt = getStartOffset() + 5; // set offset for serialization

    beginPol5CrdcRehabPriCd = getStartOffset() + 8; // set offset for serialization

    beginPol5CrdcRehabPriCnt = getStartOffset() + 9; // set offset for serialization

    beginPol5CrdcRehabSecCd = getStartOffset() + 12; // set offset for serialization

    beginPol5CrdcRehabSecCnt = getStartOffset() + 13; // set offset for serialization

    beginPol5OcpTrpyPriCd = getStartOffset() + 16; // set offset for serialization

    beginPol5OcpTrpyPriCnt = getStartOffset() + 17; // set offset for serialization

    beginPol5OcpTrpySecCd = getStartOffset() + 20; // set offset for serialization

    beginPol5OcpTrpySecCnt = getStartOffset() + 21; // set offset for serialization

    beginPol5PhyOcpSpchPriCd = getStartOffset() + 24; // set offset for serialization

    beginPol5PhyOcpSpchPriCnt = getStartOffset() + 25; // set offset for serialization

    beginPol5PhyOcpSpchSecCd = getStartOffset() + 28; // set offset for serialization

    beginPol5PhyOcpSpchSecCnt = getStartOffset() + 29; // set offset for serialization

    beginPol5PhyOcpTrpyPriCd = getStartOffset() + 32; // set offset for serialization

    beginPol5PhyOcpTrpyPriCnt = getStartOffset() + 33; // set offset for serialization

    beginPol5PhyOcpTrpySecCd = getStartOffset() + 36; // set offset for serialization

    beginPol5PhyOcpTrpySecCnt = getStartOffset() + 37; // set offset for serialization

    beginPol5PhysTrpyPriCd = getStartOffset() + 40; // set offset for serialization

    beginPol5PhysTrpyPriCnt = getStartOffset() + 41; // set offset for serialization

    beginPol5PhysTrpySecCd = getStartOffset() + 44; // set offset for serialization

    beginPol5PhysTrpySecCnt = getStartOffset() + 45; // set offset for serialization

    beginPol5SpchTrpyPriCd = getStartOffset() + 48; // set offset for serialization

    beginPol5SpchTrpyPriCnt = getStartOffset() + 49; // set offset for serialization

    beginPol5SpchTrpySecCd = getStartOffset() + 52; // set offset for serialization

    beginPol5SpchTrpySecCnt = getStartOffset() + 53; // set offset for serialization

    beginPol5SpineManipPriCd = getStartOffset() + 56; // set offset for serialization

    beginPol5SpineManipPriCnt = getStartOffset() + 57; // set offset for serialization

    beginPol5SpineManipSecCd = getStartOffset() + 60; // set offset for serialization

    beginPol5SpineManipSecCnt = getStartOffset() + 61; // set offset for serialization

    beginPol5PhysMedcnPrdCd = getStartOffset() + 64; // set offset for serialization

    beginPol5SrvcCdNSetInd = getStartOffset() + 65; // set offset for serialization

    beginPol5SrvcCdPSetInd = getStartOffset() + 66; // set offset for serialization

    beginPol5SrvcCdTSetInd = getStartOffset() + 67; // set offset for serialization

    beginPol5McrInd = getStartOffset() + 68; // set offset for serialization

    beginPol5BenMaxAuralCiPriCd = getStartOffset() + 69; // set offset for serialization

    beginPol5BenMaxAuralCiPriCnt = getStartOffset() + 70; // set offset for serialization

    beginPol5BenMaxAuralCiSecCd = getStartOffset() + 73; // set offset for serialization

    beginPol5BenMaxAuralCiSecCnt = getStartOffset() + 74; // set offset for serialization

    beginPol5BenMaxCogTrpyPriCd = getStartOffset() + 77; // set offset for serialization

    beginPol5BenMaxCogTrpyPriCnt = getStartOffset() + 78; // set offset for serialization

    beginPol5BenMaxCogTrpySecCd = getStartOffset() + 81; // set offset for serialization

    beginPol5BenMaxCogTrpySecCnt = getStartOffset() + 82; // set offset for serialization

    beginPol5BenMaxCogTrpyExclCd = getStartOffset() + 85; // set offset for serialization

    beginPol5BenMaxEhbSpneRhabCnt = getStartOffset() + 86; // set offset for serialization

    beginPol5BenMaxEhbSpneHabCnt = getStartOffset() + 89; // set offset for serialization

    beginPol5BenMaxEhbPtRhabCnt = getStartOffset() + 92; // set offset for serialization

    beginPol5BenMaxEhbPtHabCnt = getStartOffset() + 95; // set offset for serialization

    beginPol5BenMaxEhbSpchRhabCnt = getStartOffset() + 98; // set offset for serialization

    beginPol5BenMaxEhbSpchHabCnt = getStartOffset() + 101; // set offset for serialization

    beginPol5BenMaxEhbCrdcRhabCnt = getStartOffset() + 104; // set offset for serialization

    beginPol5BenMaxEhbOtRhabCnt = getStartOffset() + 107; // set offset for serialization

    beginPol5BenMaxEhbOtHabCnt = getStartOffset() + 110; // set offset for serialization

    beginPol5BenMaxEhbPlmryRhabCn = getStartOffset() + 113; // set offset for serialization

    beginPol5BenMaxEhbAuralRhabCn = getStartOffset() + 116; // set offset for serialization

    beginPol5BenMaxEhbAuralHabCnt = getStartOffset() + 119; // set offset for serialization

    beginPol5BenMaxEhbCogRhabCnt = getStartOffset() + 122; // set offset for serialization

    beginPol5BenMaxEhbCogHabCnt = getStartOffset() + 125; // set offset for serialization

    beginPol5BenMaxEhbPostRhabCnt = getStartOffset() + 128; // set offset for serialization

    beginPol5BenMaxEhbPostHabCnt = getStartOffset() + 131; // set offset for serialization

    beginPol5BenMaxEhbPtotRhabCnt = getStartOffset() + 134; // set offset for serialization

    beginPol5BenMaxEhbPtotHabCnt = getStartOffset() + 137; // set offset for serialization

    beginPol5BenMaxEhbRhabRmrkCd = getStartOffset() + 140; // set offset for serialization

    beginPol5BenMaxEhbPosmRhabCnt = getStartOffset() + 143; // set offset for serialization

    beginPol5BenMaxEhbPosmHabCnt = getStartOffset() + 146; // set offset for serialization

    beginPol5BenMaxEhbHabRmrkCd = getStartOffset() + 149; // set offset for serialization

    beginPol5BenPhysMedcnPrdCd = getStartOffset() + 152; // set offset for serialization

    beginPol5RetRhabCombPtLmtCd = getStartOffset() + 153; // set offset for serialization

    beginPol5RetRhabCombOtLmtCd = getStartOffset() + 155; // set offset for serialization

    beginPol5RetRhabCombStLmtCd = getStartOffset() + 157; // set offset for serialization

    beginPol5RetRhabCombSmLmtCd = getStartOffset() + 159; // set offset for serialization

    beginPol5RetRhabCombCiLmtCd = getStartOffset() + 161; // set offset for serialization

    beginPol5RetRhabCombCtLmtCd = getStartOffset() + 163; // set offset for serialization

    beginPol5RetRhabCombCrLmtCd = getStartOffset() + 165; // set offset for serialization

    beginPol5RetRhabCombPrLmtCd = getStartOffset() + 167; // set offset for serialization

    beginPol5RetRhabCombMtLmtCd = getStartOffset() + 169; // set offset for serialization

    beginPol5RetHabCombPtLmtCd = getStartOffset() + 171; // set offset for serialization

    beginPol5RetHabCombOtLmtCd = getStartOffset() + 173; // set offset for serialization

    beginPol5RetHabCombStLmtCd = getStartOffset() + 175; // set offset for serialization

    beginPol5RetHabCombSmLmtCd = getStartOffset() + 177; // set offset for serialization

    beginPol5RetHabCombCiLmtCd = getStartOffset() + 179; // set offset for serialization

    beginPol5RetHabCombCtLmtCd = getStartOffset() + 181; // set offset for serialization

    beginPol5RetHabCombMtLmtCd = getStartOffset() + 183; // set offset for serialization

    /*  end of offset */
  }

  int localPol5BenMaxCombPriCdCounter = -1;

  public boolean isPol5BenMaxCombPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCombPriCdCounter != sharedCounter;
    localPol5BenMaxCombPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_COMB_PRI_CD_LEN = 1;
  /** serialize this Pol5BenMaxCombPriCd */
  protected void serializePol5BenMaxCombPriCd(char[] pol5BenMaxCombPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxCombPriCd,
        0,
        getStringValue(),
        beginPol5BenMaxCombPriCd,
        POL_5_BEN_MAX_COMB_PRI_CD_LEN);
    localPol5BenMaxCombPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxCombPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenMaxCombPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxCombPriCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxCombPriCd,
        beginPol5BenMaxCombPriCd + POL_5_BEN_MAX_COMB_PRI_CD_LEN));
  }

  int localPol5BenMaxCombPriCntCounter = -1;

  public boolean isPol5BenMaxCombPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCombPriCntCounter != sharedCounter;
    localPol5BenMaxCombPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxCombPriCnt
   *
   * @return pol5BenMaxCombPriCnt
   */
  public char[] getPol5BenMaxCombPriCntString() {
    return getCharArray(beginPol5BenMaxCombPriCnt, POL_5_BEN_MAX_COMB_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxCombPriCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxCombPriCnt,
        beginPol5BenMaxCombPriCnt + POL_5_BEN_MAX_COMB_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_COMB_PRI_CNT_LEN = 3;
  /** serializePol5BenMaxCombPriCnt */
  protected void serializePol5BenMaxCombPriCnt(int pol5BenMaxCombPriCnt) {
    putNumber(
        beginPol5BenMaxCombPriCnt,
        pol5BenMaxCombPriCnt,
        POL_5_BEN_MAX_COMB_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxCombPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxCombPriCnt */
  protected int serializePol5BenMaxCombPriCnt(char[] value) {
    int pol5BenMaxCombPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxCombPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxCombPriCnt, 3);
    localPol5BenMaxCombPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxCombPriCnt;
  }

  protected int checkPol5BenMaxCombPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxCombPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxCombPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxCombPriCnt,
          POL_5_BEN_MAX_COMB_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxCombPriCnt", beginPol5BenMaxCombPriCnt, POL_5_BEN_MAX_COMB_PRI_CNT_LEN);
    }
  }

  int localPol5BenMaxCombSecCdCounter = -1;

  public boolean isPol5BenMaxCombSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCombSecCdCounter != sharedCounter;
    localPol5BenMaxCombSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_COMB_SEC_CD_LEN = 1;
  /** serialize this Pol5BenMaxCombSecCd */
  protected void serializePol5BenMaxCombSecCd(char[] pol5BenMaxCombSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxCombSecCd,
        0,
        getStringValue(),
        beginPol5BenMaxCombSecCd,
        POL_5_BEN_MAX_COMB_SEC_CD_LEN);
    localPol5BenMaxCombSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxCombSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenMaxCombSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxCombSecCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxCombSecCd,
        beginPol5BenMaxCombSecCd + POL_5_BEN_MAX_COMB_SEC_CD_LEN));
  }

  int localPol5BenMaxCombSecCntCounter = -1;

  public boolean isPol5BenMaxCombSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCombSecCntCounter != sharedCounter;
    localPol5BenMaxCombSecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxCombSecCnt
   *
   * @return pol5BenMaxCombSecCnt
   */
  public char[] getPol5BenMaxCombSecCntString() {
    return getCharArray(beginPol5BenMaxCombSecCnt, POL_5_BEN_MAX_COMB_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxCombSecCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxCombSecCnt,
        beginPol5BenMaxCombSecCnt + POL_5_BEN_MAX_COMB_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_COMB_SEC_CNT_LEN = 3;
  /** serializePol5BenMaxCombSecCnt */
  protected void serializePol5BenMaxCombSecCnt(int pol5BenMaxCombSecCnt) {
    putNumber(
        beginPol5BenMaxCombSecCnt,
        pol5BenMaxCombSecCnt,
        POL_5_BEN_MAX_COMB_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxCombSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxCombSecCnt */
  protected int serializePol5BenMaxCombSecCnt(char[] value) {
    int pol5BenMaxCombSecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxCombSecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxCombSecCnt, 3);
    localPol5BenMaxCombSecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxCombSecCnt;
  }

  protected int checkPol5BenMaxCombSecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxCombSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxCombSecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxCombSecCnt,
          POL_5_BEN_MAX_COMB_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxCombSecCnt", beginPol5BenMaxCombSecCnt, POL_5_BEN_MAX_COMB_SEC_CNT_LEN);
    }
  }

  int localPol5CrdcRehabPriCdCounter = -1;

  public boolean isPol5CrdcRehabPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5CrdcRehabPriCdCounter != sharedCounter;
    localPol5CrdcRehabPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_CRDC_REHAB_PRI_CD_LEN = 1;
  /** serialize this Pol5CrdcRehabPriCd */
  protected void serializePol5CrdcRehabPriCd(char[] pol5CrdcRehabPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5CrdcRehabPriCd,
        0,
        getStringValue(),
        beginPol5CrdcRehabPriCd,
        POL_5_CRDC_REHAB_PRI_CD_LEN);
    localPol5CrdcRehabPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5CrdcRehabPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5CrdcRehabPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5CrdcRehabPriCd() {
    return (substring(
        getStringValue(),
        beginPol5CrdcRehabPriCd,
        beginPol5CrdcRehabPriCd + POL_5_CRDC_REHAB_PRI_CD_LEN));
  }

  int localPol5CrdcRehabPriCntCounter = -1;

  public boolean isPol5CrdcRehabPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5CrdcRehabPriCntCounter != sharedCounter;
    localPol5CrdcRehabPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5CrdcRehabPriCnt
   *
   * @return pol5CrdcRehabPriCnt
   */
  public char[] getPol5CrdcRehabPriCntString() {
    return getCharArray(beginPol5CrdcRehabPriCnt, POL_5_CRDC_REHAB_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5CrdcRehabPriCntIsNumeric() {
    return isNumeric(
        beginPol5CrdcRehabPriCnt,
        beginPol5CrdcRehabPriCnt + POL_5_CRDC_REHAB_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_CRDC_REHAB_PRI_CNT_LEN = 3;
  /** serializePol5CrdcRehabPriCnt */
  protected void serializePol5CrdcRehabPriCnt(int pol5CrdcRehabPriCnt) {
    putNumber(
        beginPol5CrdcRehabPriCnt,
        pol5CrdcRehabPriCnt,
        POL_5_CRDC_REHAB_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5CrdcRehabPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5CrdcRehabPriCnt */
  protected int serializePol5CrdcRehabPriCnt(char[] value) {
    int pol5CrdcRehabPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5CrdcRehabPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5CrdcRehabPriCnt, 3);
    localPol5CrdcRehabPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5CrdcRehabPriCnt;
  }

  protected int checkPol5CrdcRehabPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5CrdcRehabPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5CrdcRehabPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5CrdcRehabPriCnt,
          POL_5_CRDC_REHAB_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5CrdcRehabPriCnt", beginPol5CrdcRehabPriCnt, POL_5_CRDC_REHAB_PRI_CNT_LEN);
    }
  }

  int localPol5CrdcRehabSecCdCounter = -1;

  public boolean isPol5CrdcRehabSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5CrdcRehabSecCdCounter != sharedCounter;
    localPol5CrdcRehabSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_CRDC_REHAB_SEC_CD_LEN = 1;
  /** serialize this Pol5CrdcRehabSecCd */
  protected void serializePol5CrdcRehabSecCd(char[] pol5CrdcRehabSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5CrdcRehabSecCd,
        0,
        getStringValue(),
        beginPol5CrdcRehabSecCd,
        POL_5_CRDC_REHAB_SEC_CD_LEN);
    localPol5CrdcRehabSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5CrdcRehabSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5CrdcRehabSecCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5CrdcRehabSecCd() {
    return (substring(
        getStringValue(),
        beginPol5CrdcRehabSecCd,
        beginPol5CrdcRehabSecCd + POL_5_CRDC_REHAB_SEC_CD_LEN));
  }

  int localPol5CrdcRehabSecCntCounter = -1;

  public boolean isPol5CrdcRehabSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5CrdcRehabSecCntCounter != sharedCounter;
    localPol5CrdcRehabSecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5CrdcRehabSecCnt
   *
   * @return pol5CrdcRehabSecCnt
   */
  public char[] getPol5CrdcRehabSecCntString() {
    return getCharArray(beginPol5CrdcRehabSecCnt, POL_5_CRDC_REHAB_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5CrdcRehabSecCntIsNumeric() {
    return isNumeric(
        beginPol5CrdcRehabSecCnt,
        beginPol5CrdcRehabSecCnt + POL_5_CRDC_REHAB_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_CRDC_REHAB_SEC_CNT_LEN = 3;
  /** serializePol5CrdcRehabSecCnt */
  protected void serializePol5CrdcRehabSecCnt(int pol5CrdcRehabSecCnt) {
    putNumber(
        beginPol5CrdcRehabSecCnt,
        pol5CrdcRehabSecCnt,
        POL_5_CRDC_REHAB_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5CrdcRehabSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5CrdcRehabSecCnt */
  protected int serializePol5CrdcRehabSecCnt(char[] value) {
    int pol5CrdcRehabSecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5CrdcRehabSecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5CrdcRehabSecCnt, 3);
    localPol5CrdcRehabSecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5CrdcRehabSecCnt;
  }

  protected int checkPol5CrdcRehabSecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5CrdcRehabSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5CrdcRehabSecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5CrdcRehabSecCnt,
          POL_5_CRDC_REHAB_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5CrdcRehabSecCnt", beginPol5CrdcRehabSecCnt, POL_5_CRDC_REHAB_SEC_CNT_LEN);
    }
  }

  int localPol5OcpTrpyPriCdCounter = -1;

  public boolean isPol5OcpTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5OcpTrpyPriCdCounter != sharedCounter;
    localPol5OcpTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_OCP_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol5OcpTrpyPriCd */
  protected void serializePol5OcpTrpyPriCd(char[] pol5OcpTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5OcpTrpyPriCd, 0, getStringValue(), beginPol5OcpTrpyPriCd, POL_5_OCP_TRPY_PRI_CD_LEN);
    localPol5OcpTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5OcpTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5OcpTrpyPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5OcpTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol5OcpTrpyPriCd,
        beginPol5OcpTrpyPriCd + POL_5_OCP_TRPY_PRI_CD_LEN));
  }

  int localPol5OcpTrpyPriCntCounter = -1;

  public boolean isPol5OcpTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5OcpTrpyPriCntCounter != sharedCounter;
    localPol5OcpTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5OcpTrpyPriCnt
   *
   * @return pol5OcpTrpyPriCnt
   */
  public char[] getPol5OcpTrpyPriCntString() {
    return getCharArray(beginPol5OcpTrpyPriCnt, POL_5_OCP_TRPY_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5OcpTrpyPriCntIsNumeric() {
    return isNumeric(
        beginPol5OcpTrpyPriCnt,
        beginPol5OcpTrpyPriCnt + POL_5_OCP_TRPY_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_OCP_TRPY_PRI_CNT_LEN = 3;
  /** serializePol5OcpTrpyPriCnt */
  protected void serializePol5OcpTrpyPriCnt(int pol5OcpTrpyPriCnt) {
    putNumber(
        beginPol5OcpTrpyPriCnt,
        pol5OcpTrpyPriCnt,
        POL_5_OCP_TRPY_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5OcpTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5OcpTrpyPriCnt */
  protected int serializePol5OcpTrpyPriCnt(char[] value) {
    int pol5OcpTrpyPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5OcpTrpyPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5OcpTrpyPriCnt, 3);
    localPol5OcpTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5OcpTrpyPriCnt;
  }

  protected int checkPol5OcpTrpyPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5OcpTrpyPriCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol5OcpTrpyPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5OcpTrpyPriCnt,
          POL_5_OCP_TRPY_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol5OcpTrpyPriCnt", beginPol5OcpTrpyPriCnt, POL_5_OCP_TRPY_PRI_CNT_LEN);
    }
  }

  int localPol5OcpTrpySecCdCounter = -1;

  public boolean isPol5OcpTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5OcpTrpySecCdCounter != sharedCounter;
    localPol5OcpTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_OCP_TRPY_SEC_CD_LEN = 1;
  /** serialize this Pol5OcpTrpySecCd */
  protected void serializePol5OcpTrpySecCd(char[] pol5OcpTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5OcpTrpySecCd, 0, getStringValue(), beginPol5OcpTrpySecCd, POL_5_OCP_TRPY_SEC_CD_LEN);
    localPol5OcpTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5OcpTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5OcpTrpySecCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5OcpTrpySecCd() {
    return (substring(
        getStringValue(),
        beginPol5OcpTrpySecCd,
        beginPol5OcpTrpySecCd + POL_5_OCP_TRPY_SEC_CD_LEN));
  }

  int localPol5OcpTrpySecCntCounter = -1;

  public boolean isPol5OcpTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5OcpTrpySecCntCounter != sharedCounter;
    localPol5OcpTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5OcpTrpySecCnt
   *
   * @return pol5OcpTrpySecCnt
   */
  public char[] getPol5OcpTrpySecCntString() {
    return getCharArray(beginPol5OcpTrpySecCnt, POL_5_OCP_TRPY_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5OcpTrpySecCntIsNumeric() {
    return isNumeric(
        beginPol5OcpTrpySecCnt,
        beginPol5OcpTrpySecCnt + POL_5_OCP_TRPY_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_OCP_TRPY_SEC_CNT_LEN = 3;
  /** serializePol5OcpTrpySecCnt */
  protected void serializePol5OcpTrpySecCnt(int pol5OcpTrpySecCnt) {
    putNumber(
        beginPol5OcpTrpySecCnt,
        pol5OcpTrpySecCnt,
        POL_5_OCP_TRPY_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5OcpTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5OcpTrpySecCnt */
  protected int serializePol5OcpTrpySecCnt(char[] value) {
    int pol5OcpTrpySecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5OcpTrpySecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5OcpTrpySecCnt, 3);
    localPol5OcpTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5OcpTrpySecCnt;
  }

  protected int checkPol5OcpTrpySecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5OcpTrpySecCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol5OcpTrpySecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5OcpTrpySecCnt,
          POL_5_OCP_TRPY_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol5OcpTrpySecCnt", beginPol5OcpTrpySecCnt, POL_5_OCP_TRPY_SEC_CNT_LEN);
    }
  }

  int localPol5PhyOcpSpchPriCdCounter = -1;

  public boolean isPol5PhyOcpSpchPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpSpchPriCdCounter != sharedCounter;
    localPol5PhyOcpSpchPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_PHY_OCP_SPCH_PRI_CD_LEN = 1;
  /** serialize this Pol5PhyOcpSpchPriCd */
  protected void serializePol5PhyOcpSpchPriCd(char[] pol5PhyOcpSpchPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5PhyOcpSpchPriCd,
        0,
        getStringValue(),
        beginPol5PhyOcpSpchPriCd,
        POL_5_PHY_OCP_SPCH_PRI_CD_LEN);
    localPol5PhyOcpSpchPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5PhyOcpSpchPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5PhyOcpSpchPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5PhyOcpSpchPriCd() {
    return (substring(
        getStringValue(),
        beginPol5PhyOcpSpchPriCd,
        beginPol5PhyOcpSpchPriCd + POL_5_PHY_OCP_SPCH_PRI_CD_LEN));
  }

  int localPol5PhyOcpSpchPriCntCounter = -1;

  public boolean isPol5PhyOcpSpchPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpSpchPriCntCounter != sharedCounter;
    localPol5PhyOcpSpchPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5PhyOcpSpchPriCnt
   *
   * @return pol5PhyOcpSpchPriCnt
   */
  public char[] getPol5PhyOcpSpchPriCntString() {
    return getCharArray(beginPol5PhyOcpSpchPriCnt, POL_5_PHY_OCP_SPCH_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5PhyOcpSpchPriCntIsNumeric() {
    return isNumeric(
        beginPol5PhyOcpSpchPriCnt,
        beginPol5PhyOcpSpchPriCnt + POL_5_PHY_OCP_SPCH_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_PHY_OCP_SPCH_PRI_CNT_LEN = 3;
  /** serializePol5PhyOcpSpchPriCnt */
  protected void serializePol5PhyOcpSpchPriCnt(int pol5PhyOcpSpchPriCnt) {
    putNumber(
        beginPol5PhyOcpSpchPriCnt,
        pol5PhyOcpSpchPriCnt,
        POL_5_PHY_OCP_SPCH_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5PhyOcpSpchPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5PhyOcpSpchPriCnt */
  protected int serializePol5PhyOcpSpchPriCnt(char[] value) {
    int pol5PhyOcpSpchPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5PhyOcpSpchPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5PhyOcpSpchPriCnt, 3);
    localPol5PhyOcpSpchPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5PhyOcpSpchPriCnt;
  }

  protected int checkPol5PhyOcpSpchPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5PhyOcpSpchPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5PhyOcpSpchPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5PhyOcpSpchPriCnt,
          POL_5_PHY_OCP_SPCH_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5PhyOcpSpchPriCnt", beginPol5PhyOcpSpchPriCnt, POL_5_PHY_OCP_SPCH_PRI_CNT_LEN);
    }
  }

  int localPol5PhyOcpSpchSecCdCounter = -1;

  public boolean isPol5PhyOcpSpchSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpSpchSecCdCounter != sharedCounter;
    localPol5PhyOcpSpchSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_PHY_OCP_SPCH_SEC_CD_LEN = 1;
  /** serialize this Pol5PhyOcpSpchSecCd */
  protected void serializePol5PhyOcpSpchSecCd(char[] pol5PhyOcpSpchSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5PhyOcpSpchSecCd,
        0,
        getStringValue(),
        beginPol5PhyOcpSpchSecCd,
        POL_5_PHY_OCP_SPCH_SEC_CD_LEN);
    localPol5PhyOcpSpchSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5PhyOcpSpchSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5PhyOcpSpchSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5PhyOcpSpchSecCd() {
    return (substring(
        getStringValue(),
        beginPol5PhyOcpSpchSecCd,
        beginPol5PhyOcpSpchSecCd + POL_5_PHY_OCP_SPCH_SEC_CD_LEN));
  }

  int localPol5PhyOcpSpchSecCntCounter = -1;

  public boolean isPol5PhyOcpSpchSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpSpchSecCntCounter != sharedCounter;
    localPol5PhyOcpSpchSecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5PhyOcpSpchSecCnt
   *
   * @return pol5PhyOcpSpchSecCnt
   */
  public char[] getPol5PhyOcpSpchSecCntString() {
    return getCharArray(beginPol5PhyOcpSpchSecCnt, POL_5_PHY_OCP_SPCH_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5PhyOcpSpchSecCntIsNumeric() {
    return isNumeric(
        beginPol5PhyOcpSpchSecCnt,
        beginPol5PhyOcpSpchSecCnt + POL_5_PHY_OCP_SPCH_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_PHY_OCP_SPCH_SEC_CNT_LEN = 3;
  /** serializePol5PhyOcpSpchSecCnt */
  protected void serializePol5PhyOcpSpchSecCnt(int pol5PhyOcpSpchSecCnt) {
    putNumber(
        beginPol5PhyOcpSpchSecCnt,
        pol5PhyOcpSpchSecCnt,
        POL_5_PHY_OCP_SPCH_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5PhyOcpSpchSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5PhyOcpSpchSecCnt */
  protected int serializePol5PhyOcpSpchSecCnt(char[] value) {
    int pol5PhyOcpSpchSecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5PhyOcpSpchSecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5PhyOcpSpchSecCnt, 3);
    localPol5PhyOcpSpchSecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5PhyOcpSpchSecCnt;
  }

  protected int checkPol5PhyOcpSpchSecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5PhyOcpSpchSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5PhyOcpSpchSecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5PhyOcpSpchSecCnt,
          POL_5_PHY_OCP_SPCH_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5PhyOcpSpchSecCnt", beginPol5PhyOcpSpchSecCnt, POL_5_PHY_OCP_SPCH_SEC_CNT_LEN);
    }
  }

  int localPol5PhyOcpTrpyPriCdCounter = -1;

  public boolean isPol5PhyOcpTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpTrpyPriCdCounter != sharedCounter;
    localPol5PhyOcpTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_PHY_OCP_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol5PhyOcpTrpyPriCd */
  protected void serializePol5PhyOcpTrpyPriCd(char[] pol5PhyOcpTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5PhyOcpTrpyPriCd,
        0,
        getStringValue(),
        beginPol5PhyOcpTrpyPriCd,
        POL_5_PHY_OCP_TRPY_PRI_CD_LEN);
    localPol5PhyOcpTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5PhyOcpTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5PhyOcpTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5PhyOcpTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol5PhyOcpTrpyPriCd,
        beginPol5PhyOcpTrpyPriCd + POL_5_PHY_OCP_TRPY_PRI_CD_LEN));
  }

  int localPol5PhyOcpTrpyPriCntCounter = -1;

  public boolean isPol5PhyOcpTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpTrpyPriCntCounter != sharedCounter;
    localPol5PhyOcpTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5PhyOcpTrpyPriCnt
   *
   * @return pol5PhyOcpTrpyPriCnt
   */
  public char[] getPol5PhyOcpTrpyPriCntString() {
    return getCharArray(beginPol5PhyOcpTrpyPriCnt, POL_5_PHY_OCP_TRPY_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5PhyOcpTrpyPriCntIsNumeric() {
    return isNumeric(
        beginPol5PhyOcpTrpyPriCnt,
        beginPol5PhyOcpTrpyPriCnt + POL_5_PHY_OCP_TRPY_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_PHY_OCP_TRPY_PRI_CNT_LEN = 3;
  /** serializePol5PhyOcpTrpyPriCnt */
  protected void serializePol5PhyOcpTrpyPriCnt(int pol5PhyOcpTrpyPriCnt) {
    putNumber(
        beginPol5PhyOcpTrpyPriCnt,
        pol5PhyOcpTrpyPriCnt,
        POL_5_PHY_OCP_TRPY_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5PhyOcpTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5PhyOcpTrpyPriCnt */
  protected int serializePol5PhyOcpTrpyPriCnt(char[] value) {
    int pol5PhyOcpTrpyPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5PhyOcpTrpyPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5PhyOcpTrpyPriCnt, 3);
    localPol5PhyOcpTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5PhyOcpTrpyPriCnt;
  }

  protected int checkPol5PhyOcpTrpyPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5PhyOcpTrpyPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5PhyOcpTrpyPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5PhyOcpTrpyPriCnt,
          POL_5_PHY_OCP_TRPY_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5PhyOcpTrpyPriCnt", beginPol5PhyOcpTrpyPriCnt, POL_5_PHY_OCP_TRPY_PRI_CNT_LEN);
    }
  }

  int localPol5PhyOcpTrpySecCdCounter = -1;

  public boolean isPol5PhyOcpTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpTrpySecCdCounter != sharedCounter;
    localPol5PhyOcpTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_PHY_OCP_TRPY_SEC_CD_LEN = 1;
  /** serialize this Pol5PhyOcpTrpySecCd */
  protected void serializePol5PhyOcpTrpySecCd(char[] pol5PhyOcpTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5PhyOcpTrpySecCd,
        0,
        getStringValue(),
        beginPol5PhyOcpTrpySecCd,
        POL_5_PHY_OCP_TRPY_SEC_CD_LEN);
    localPol5PhyOcpTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5PhyOcpTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5PhyOcpTrpySecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5PhyOcpTrpySecCd() {
    return (substring(
        getStringValue(),
        beginPol5PhyOcpTrpySecCd,
        beginPol5PhyOcpTrpySecCd + POL_5_PHY_OCP_TRPY_SEC_CD_LEN));
  }

  int localPol5PhyOcpTrpySecCntCounter = -1;

  public boolean isPol5PhyOcpTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhyOcpTrpySecCntCounter != sharedCounter;
    localPol5PhyOcpTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5PhyOcpTrpySecCnt
   *
   * @return pol5PhyOcpTrpySecCnt
   */
  public char[] getPol5PhyOcpTrpySecCntString() {
    return getCharArray(beginPol5PhyOcpTrpySecCnt, POL_5_PHY_OCP_TRPY_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5PhyOcpTrpySecCntIsNumeric() {
    return isNumeric(
        beginPol5PhyOcpTrpySecCnt,
        beginPol5PhyOcpTrpySecCnt + POL_5_PHY_OCP_TRPY_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_PHY_OCP_TRPY_SEC_CNT_LEN = 3;
  /** serializePol5PhyOcpTrpySecCnt */
  protected void serializePol5PhyOcpTrpySecCnt(int pol5PhyOcpTrpySecCnt) {
    putNumber(
        beginPol5PhyOcpTrpySecCnt,
        pol5PhyOcpTrpySecCnt,
        POL_5_PHY_OCP_TRPY_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5PhyOcpTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5PhyOcpTrpySecCnt */
  protected int serializePol5PhyOcpTrpySecCnt(char[] value) {
    int pol5PhyOcpTrpySecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5PhyOcpTrpySecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5PhyOcpTrpySecCnt, 3);
    localPol5PhyOcpTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5PhyOcpTrpySecCnt;
  }

  protected int checkPol5PhyOcpTrpySecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5PhyOcpTrpySecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5PhyOcpTrpySecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5PhyOcpTrpySecCnt,
          POL_5_PHY_OCP_TRPY_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5PhyOcpTrpySecCnt", beginPol5PhyOcpTrpySecCnt, POL_5_PHY_OCP_TRPY_SEC_CNT_LEN);
    }
  }

  int localPol5PhysTrpyPriCdCounter = -1;

  public boolean isPol5PhysTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhysTrpyPriCdCounter != sharedCounter;
    localPol5PhysTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_PHYS_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol5PhysTrpyPriCd */
  protected void serializePol5PhysTrpyPriCd(char[] pol5PhysTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5PhysTrpyPriCd, 0, getStringValue(), beginPol5PhysTrpyPriCd, POL_5_PHYS_TRPY_PRI_CD_LEN);
    localPol5PhysTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5PhysTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5PhysTrpyPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5PhysTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol5PhysTrpyPriCd,
        beginPol5PhysTrpyPriCd + POL_5_PHYS_TRPY_PRI_CD_LEN));
  }

  int localPol5PhysTrpyPriCntCounter = -1;

  public boolean isPol5PhysTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhysTrpyPriCntCounter != sharedCounter;
    localPol5PhysTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5PhysTrpyPriCnt
   *
   * @return pol5PhysTrpyPriCnt
   */
  public char[] getPol5PhysTrpyPriCntString() {
    return getCharArray(beginPol5PhysTrpyPriCnt, POL_5_PHYS_TRPY_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5PhysTrpyPriCntIsNumeric() {
    return isNumeric(
        beginPol5PhysTrpyPriCnt,
        beginPol5PhysTrpyPriCnt + POL_5_PHYS_TRPY_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_PHYS_TRPY_PRI_CNT_LEN = 3;
  /** serializePol5PhysTrpyPriCnt */
  protected void serializePol5PhysTrpyPriCnt(int pol5PhysTrpyPriCnt) {
    putNumber(
        beginPol5PhysTrpyPriCnt,
        pol5PhysTrpyPriCnt,
        POL_5_PHYS_TRPY_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5PhysTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5PhysTrpyPriCnt */
  protected int serializePol5PhysTrpyPriCnt(char[] value) {
    int pol5PhysTrpyPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5PhysTrpyPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5PhysTrpyPriCnt, 3);
    localPol5PhysTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5PhysTrpyPriCnt;
  }

  protected int checkPol5PhysTrpyPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5PhysTrpyPriCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol5PhysTrpyPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5PhysTrpyPriCnt,
          POL_5_PHYS_TRPY_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5PhysTrpyPriCnt", beginPol5PhysTrpyPriCnt, POL_5_PHYS_TRPY_PRI_CNT_LEN);
    }
  }

  int localPol5PhysTrpySecCdCounter = -1;

  public boolean isPol5PhysTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhysTrpySecCdCounter != sharedCounter;
    localPol5PhysTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_PHYS_TRPY_SEC_CD_LEN = 1;
  /** serialize this Pol5PhysTrpySecCd */
  protected void serializePol5PhysTrpySecCd(char[] pol5PhysTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5PhysTrpySecCd, 0, getStringValue(), beginPol5PhysTrpySecCd, POL_5_PHYS_TRPY_SEC_CD_LEN);
    localPol5PhysTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5PhysTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5PhysTrpySecCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5PhysTrpySecCd() {
    return (substring(
        getStringValue(),
        beginPol5PhysTrpySecCd,
        beginPol5PhysTrpySecCd + POL_5_PHYS_TRPY_SEC_CD_LEN));
  }

  int localPol5PhysTrpySecCntCounter = -1;

  public boolean isPol5PhysTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhysTrpySecCntCounter != sharedCounter;
    localPol5PhysTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5PhysTrpySecCnt
   *
   * @return pol5PhysTrpySecCnt
   */
  public char[] getPol5PhysTrpySecCntString() {
    return getCharArray(beginPol5PhysTrpySecCnt, POL_5_PHYS_TRPY_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5PhysTrpySecCntIsNumeric() {
    return isNumeric(
        beginPol5PhysTrpySecCnt,
        beginPol5PhysTrpySecCnt + POL_5_PHYS_TRPY_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_PHYS_TRPY_SEC_CNT_LEN = 3;
  /** serializePol5PhysTrpySecCnt */
  protected void serializePol5PhysTrpySecCnt(int pol5PhysTrpySecCnt) {
    putNumber(
        beginPol5PhysTrpySecCnt,
        pol5PhysTrpySecCnt,
        POL_5_PHYS_TRPY_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5PhysTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5PhysTrpySecCnt */
  protected int serializePol5PhysTrpySecCnt(char[] value) {
    int pol5PhysTrpySecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5PhysTrpySecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5PhysTrpySecCnt, 3);
    localPol5PhysTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5PhysTrpySecCnt;
  }

  protected int checkPol5PhysTrpySecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5PhysTrpySecCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol5PhysTrpySecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5PhysTrpySecCnt,
          POL_5_PHYS_TRPY_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5PhysTrpySecCnt", beginPol5PhysTrpySecCnt, POL_5_PHYS_TRPY_SEC_CNT_LEN);
    }
  }

  int localPol5SpchTrpyPriCdCounter = -1;

  public boolean isPol5SpchTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpchTrpyPriCdCounter != sharedCounter;
    localPol5SpchTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_SPCH_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol5SpchTrpyPriCd */
  protected void serializePol5SpchTrpyPriCd(char[] pol5SpchTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5SpchTrpyPriCd, 0, getStringValue(), beginPol5SpchTrpyPriCd, POL_5_SPCH_TRPY_PRI_CD_LEN);
    localPol5SpchTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5SpchTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5SpchTrpyPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5SpchTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol5SpchTrpyPriCd,
        beginPol5SpchTrpyPriCd + POL_5_SPCH_TRPY_PRI_CD_LEN));
  }

  int localPol5SpchTrpyPriCntCounter = -1;

  public boolean isPol5SpchTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpchTrpyPriCntCounter != sharedCounter;
    localPol5SpchTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5SpchTrpyPriCnt
   *
   * @return pol5SpchTrpyPriCnt
   */
  public char[] getPol5SpchTrpyPriCntString() {
    return getCharArray(beginPol5SpchTrpyPriCnt, POL_5_SPCH_TRPY_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5SpchTrpyPriCntIsNumeric() {
    return isNumeric(
        beginPol5SpchTrpyPriCnt,
        beginPol5SpchTrpyPriCnt + POL_5_SPCH_TRPY_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_SPCH_TRPY_PRI_CNT_LEN = 3;
  /** serializePol5SpchTrpyPriCnt */
  protected void serializePol5SpchTrpyPriCnt(int pol5SpchTrpyPriCnt) {
    putNumber(
        beginPol5SpchTrpyPriCnt,
        pol5SpchTrpyPriCnt,
        POL_5_SPCH_TRPY_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5SpchTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5SpchTrpyPriCnt */
  protected int serializePol5SpchTrpyPriCnt(char[] value) {
    int pol5SpchTrpyPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5SpchTrpyPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5SpchTrpyPriCnt, 3);
    localPol5SpchTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5SpchTrpyPriCnt;
  }

  protected int checkPol5SpchTrpyPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5SpchTrpyPriCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol5SpchTrpyPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5SpchTrpyPriCnt,
          POL_5_SPCH_TRPY_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5SpchTrpyPriCnt", beginPol5SpchTrpyPriCnt, POL_5_SPCH_TRPY_PRI_CNT_LEN);
    }
  }

  int localPol5SpchTrpySecCdCounter = -1;

  public boolean isPol5SpchTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpchTrpySecCdCounter != sharedCounter;
    localPol5SpchTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_SPCH_TRPY_SEC_CD_LEN = 1;
  /** serialize this Pol5SpchTrpySecCd */
  protected void serializePol5SpchTrpySecCd(char[] pol5SpchTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5SpchTrpySecCd, 0, getStringValue(), beginPol5SpchTrpySecCd, POL_5_SPCH_TRPY_SEC_CD_LEN);
    localPol5SpchTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5SpchTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5SpchTrpySecCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5SpchTrpySecCd() {
    return (substring(
        getStringValue(),
        beginPol5SpchTrpySecCd,
        beginPol5SpchTrpySecCd + POL_5_SPCH_TRPY_SEC_CD_LEN));
  }

  int localPol5SpchTrpySecCntCounter = -1;

  public boolean isPol5SpchTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpchTrpySecCntCounter != sharedCounter;
    localPol5SpchTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5SpchTrpySecCnt
   *
   * @return pol5SpchTrpySecCnt
   */
  public char[] getPol5SpchTrpySecCntString() {
    return getCharArray(beginPol5SpchTrpySecCnt, POL_5_SPCH_TRPY_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5SpchTrpySecCntIsNumeric() {
    return isNumeric(
        beginPol5SpchTrpySecCnt,
        beginPol5SpchTrpySecCnt + POL_5_SPCH_TRPY_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_SPCH_TRPY_SEC_CNT_LEN = 3;
  /** serializePol5SpchTrpySecCnt */
  protected void serializePol5SpchTrpySecCnt(int pol5SpchTrpySecCnt) {
    putNumber(
        beginPol5SpchTrpySecCnt,
        pol5SpchTrpySecCnt,
        POL_5_SPCH_TRPY_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5SpchTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5SpchTrpySecCnt */
  protected int serializePol5SpchTrpySecCnt(char[] value) {
    int pol5SpchTrpySecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5SpchTrpySecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5SpchTrpySecCnt, 3);
    localPol5SpchTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5SpchTrpySecCnt;
  }

  protected int checkPol5SpchTrpySecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5SpchTrpySecCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol5SpchTrpySecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5SpchTrpySecCnt,
          POL_5_SPCH_TRPY_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5SpchTrpySecCnt", beginPol5SpchTrpySecCnt, POL_5_SPCH_TRPY_SEC_CNT_LEN);
    }
  }

  int localPol5SpineManipPriCdCounter = -1;

  public boolean isPol5SpineManipPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpineManipPriCdCounter != sharedCounter;
    localPol5SpineManipPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_SPINE_MANIP_PRI_CD_LEN = 1;
  /** serialize this Pol5SpineManipPriCd */
  protected void serializePol5SpineManipPriCd(char[] pol5SpineManipPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5SpineManipPriCd,
        0,
        getStringValue(),
        beginPol5SpineManipPriCd,
        POL_5_SPINE_MANIP_PRI_CD_LEN);
    localPol5SpineManipPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5SpineManipPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5SpineManipPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5SpineManipPriCd() {
    return (substring(
        getStringValue(),
        beginPol5SpineManipPriCd,
        beginPol5SpineManipPriCd + POL_5_SPINE_MANIP_PRI_CD_LEN));
  }

  int localPol5SpineManipPriCntCounter = -1;

  public boolean isPol5SpineManipPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpineManipPriCntCounter != sharedCounter;
    localPol5SpineManipPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5SpineManipPriCnt
   *
   * @return pol5SpineManipPriCnt
   */
  public char[] getPol5SpineManipPriCntString() {
    return getCharArray(beginPol5SpineManipPriCnt, POL_5_SPINE_MANIP_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5SpineManipPriCntIsNumeric() {
    return isNumeric(
        beginPol5SpineManipPriCnt,
        beginPol5SpineManipPriCnt + POL_5_SPINE_MANIP_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_SPINE_MANIP_PRI_CNT_LEN = 3;
  /** serializePol5SpineManipPriCnt */
  protected void serializePol5SpineManipPriCnt(int pol5SpineManipPriCnt) {
    putNumber(
        beginPol5SpineManipPriCnt,
        pol5SpineManipPriCnt,
        POL_5_SPINE_MANIP_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5SpineManipPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5SpineManipPriCnt */
  protected int serializePol5SpineManipPriCnt(char[] value) {
    int pol5SpineManipPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5SpineManipPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5SpineManipPriCnt, 3);
    localPol5SpineManipPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5SpineManipPriCnt;
  }

  protected int checkPol5SpineManipPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5SpineManipPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5SpineManipPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5SpineManipPriCnt,
          POL_5_SPINE_MANIP_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5SpineManipPriCnt", beginPol5SpineManipPriCnt, POL_5_SPINE_MANIP_PRI_CNT_LEN);
    }
  }

  int localPol5SpineManipSecCdCounter = -1;

  public boolean isPol5SpineManipSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpineManipSecCdCounter != sharedCounter;
    localPol5SpineManipSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_SPINE_MANIP_SEC_CD_LEN = 1;
  /** serialize this Pol5SpineManipSecCd */
  protected void serializePol5SpineManipSecCd(char[] pol5SpineManipSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5SpineManipSecCd,
        0,
        getStringValue(),
        beginPol5SpineManipSecCd,
        POL_5_SPINE_MANIP_SEC_CD_LEN);
    localPol5SpineManipSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5SpineManipSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5SpineManipSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5SpineManipSecCd() {
    return (substring(
        getStringValue(),
        beginPol5SpineManipSecCd,
        beginPol5SpineManipSecCd + POL_5_SPINE_MANIP_SEC_CD_LEN));
  }

  int localPol5SpineManipSecCntCounter = -1;

  public boolean isPol5SpineManipSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SpineManipSecCntCounter != sharedCounter;
    localPol5SpineManipSecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5SpineManipSecCnt
   *
   * @return pol5SpineManipSecCnt
   */
  public char[] getPol5SpineManipSecCntString() {
    return getCharArray(beginPol5SpineManipSecCnt, POL_5_SPINE_MANIP_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5SpineManipSecCntIsNumeric() {
    return isNumeric(
        beginPol5SpineManipSecCnt,
        beginPol5SpineManipSecCnt + POL_5_SPINE_MANIP_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_SPINE_MANIP_SEC_CNT_LEN = 3;
  /** serializePol5SpineManipSecCnt */
  protected void serializePol5SpineManipSecCnt(int pol5SpineManipSecCnt) {
    putNumber(
        beginPol5SpineManipSecCnt,
        pol5SpineManipSecCnt,
        POL_5_SPINE_MANIP_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5SpineManipSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5SpineManipSecCnt */
  protected int serializePol5SpineManipSecCnt(char[] value) {
    int pol5SpineManipSecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5SpineManipSecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5SpineManipSecCnt, 3);
    localPol5SpineManipSecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5SpineManipSecCnt;
  }

  protected int checkPol5SpineManipSecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5SpineManipSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5SpineManipSecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5SpineManipSecCnt,
          POL_5_SPINE_MANIP_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5SpineManipSecCnt", beginPol5SpineManipSecCnt, POL_5_SPINE_MANIP_SEC_CNT_LEN);
    }
  }

  int localPol5PhysMedcnPrdCdCounter = -1;

  public boolean isPol5PhysMedcnPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5PhysMedcnPrdCdCounter != sharedCounter;
    localPol5PhysMedcnPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_PHYS_MEDCN_PRD_CD_LEN = 1;
  /** serialize this Pol5PhysMedcnPrdCd */
  protected void serializePol5PhysMedcnPrdCd(char[] pol5PhysMedcnPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5PhysMedcnPrdCd,
        0,
        getStringValue(),
        beginPol5PhysMedcnPrdCd,
        POL_5_PHYS_MEDCN_PRD_CD_LEN);
    localPol5PhysMedcnPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5PhysMedcnPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5PhysMedcnPrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5PhysMedcnPrdCd() {
    return (substring(
        getStringValue(),
        beginPol5PhysMedcnPrdCd,
        beginPol5PhysMedcnPrdCd + POL_5_PHYS_MEDCN_PRD_CD_LEN));
  }

  int localPol5SrvcCdNSetIndCounter = -1;

  public boolean isPol5SrvcCdNSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SrvcCdNSetIndCounter != sharedCounter;
    localPol5SrvcCdNSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_SRVC_CD_NSET_IND_LEN = 1;
  /** serialize this Pol5SrvcCdNSetInd */
  protected void serializePol5SrvcCdNSetInd(char[] pol5SrvcCdNSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5SrvcCdNSetInd, 0, getStringValue(), beginPol5SrvcCdNSetInd, POL_5_SRVC_CD_NSET_IND_LEN);
    localPol5SrvcCdNSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5SrvcCdNSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5SrvcCdNSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5SrvcCdNSetInd() {
    return (substring(
        getStringValue(),
        beginPol5SrvcCdNSetInd,
        beginPol5SrvcCdNSetInd + POL_5_SRVC_CD_NSET_IND_LEN));
  }

  int localPol5SrvcCdPSetIndCounter = -1;

  public boolean isPol5SrvcCdPSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SrvcCdPSetIndCounter != sharedCounter;
    localPol5SrvcCdPSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_SRVC_CD_PSET_IND_LEN = 1;
  /** serialize this Pol5SrvcCdPSetInd */
  protected void serializePol5SrvcCdPSetInd(char[] pol5SrvcCdPSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5SrvcCdPSetInd, 0, getStringValue(), beginPol5SrvcCdPSetInd, POL_5_SRVC_CD_PSET_IND_LEN);
    localPol5SrvcCdPSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5SrvcCdPSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5SrvcCdPSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5SrvcCdPSetInd() {
    return (substring(
        getStringValue(),
        beginPol5SrvcCdPSetInd,
        beginPol5SrvcCdPSetInd + POL_5_SRVC_CD_PSET_IND_LEN));
  }

  int localPol5SrvcCdTSetIndCounter = -1;

  public boolean isPol5SrvcCdTSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5SrvcCdTSetIndCounter != sharedCounter;
    localPol5SrvcCdTSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_SRVC_CD_TSET_IND_LEN = 1;
  /** serialize this Pol5SrvcCdTSetInd */
  protected void serializePol5SrvcCdTSetInd(char[] pol5SrvcCdTSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5SrvcCdTSetInd, 0, getStringValue(), beginPol5SrvcCdTSetInd, POL_5_SRVC_CD_TSET_IND_LEN);
    localPol5SrvcCdTSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5SrvcCdTSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5SrvcCdTSetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol5SrvcCdTSetInd() {
    return (substring(
        getStringValue(),
        beginPol5SrvcCdTSetInd,
        beginPol5SrvcCdTSetInd + POL_5_SRVC_CD_TSET_IND_LEN));
  }

  int localPol5McrIndCounter = -1;

  public boolean isPol5McrIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5McrIndCounter != sharedCounter;
    localPol5McrIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_MCR_IND_LEN = 1;
  /** serialize this Pol5McrInd */
  protected void serializePol5McrInd(char[] pol5McrInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol5McrInd, 0, getStringValue(), beginPol5McrInd, POL_5_MCR_IND_LEN);
    localPol5McrIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5McrIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5McrInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPol5McrInd() {
    return (substring(getStringValue(), beginPol5McrInd, beginPol5McrInd + POL_5_MCR_IND_LEN));
  }

  int localPol5BenMaxAuralCiPriCdCounter = -1;

  public boolean isPol5BenMaxAuralCiPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxAuralCiPriCdCounter != sharedCounter;
    localPol5BenMaxAuralCiPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_AURAL_CI_PRI_CD_LEN = 1;
  /** serialize this Pol5BenMaxAuralCiPriCd */
  protected void serializePol5BenMaxAuralCiPriCd(char[] pol5BenMaxAuralCiPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxAuralCiPriCd,
        0,
        getStringValue(),
        beginPol5BenMaxAuralCiPriCd,
        POL_5_BEN_MAX_AURAL_CI_PRI_CD_LEN);
    localPol5BenMaxAuralCiPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxAuralCiPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenMaxAuralCiPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxAuralCiPriCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxAuralCiPriCd,
        beginPol5BenMaxAuralCiPriCd + POL_5_BEN_MAX_AURAL_CI_PRI_CD_LEN));
  }

  int localPol5BenMaxAuralCiPriCntCounter = -1;

  public boolean isPol5BenMaxAuralCiPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxAuralCiPriCntCounter != sharedCounter;
    localPol5BenMaxAuralCiPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxAuralCiPriCnt
   *
   * @return pol5BenMaxAuralCiPriCnt
   */
  public char[] getPol5BenMaxAuralCiPriCntString() {
    return getCharArray(beginPol5BenMaxAuralCiPriCnt, POL_5_BEN_MAX_AURAL_CI_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxAuralCiPriCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxAuralCiPriCnt,
        beginPol5BenMaxAuralCiPriCnt + POL_5_BEN_MAX_AURAL_CI_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_AURAL_CI_PRI_CNT_LEN = 3;
  /** serializePol5BenMaxAuralCiPriCnt */
  protected void serializePol5BenMaxAuralCiPriCnt(int pol5BenMaxAuralCiPriCnt) {
    putNumber(
        beginPol5BenMaxAuralCiPriCnt,
        pol5BenMaxAuralCiPriCnt,
        POL_5_BEN_MAX_AURAL_CI_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxAuralCiPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxAuralCiPriCnt */
  protected int serializePol5BenMaxAuralCiPriCnt(char[] value) {
    int pol5BenMaxAuralCiPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxAuralCiPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxAuralCiPriCnt, 3);
    localPol5BenMaxAuralCiPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxAuralCiPriCnt;
  }

  protected int checkPol5BenMaxAuralCiPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxAuralCiPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxAuralCiPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxAuralCiPriCnt,
          POL_5_BEN_MAX_AURAL_CI_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxAuralCiPriCnt",
          beginPol5BenMaxAuralCiPriCnt,
          POL_5_BEN_MAX_AURAL_CI_PRI_CNT_LEN);
    }
  }

  int localPol5BenMaxAuralCiSecCdCounter = -1;

  public boolean isPol5BenMaxAuralCiSecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxAuralCiSecCdCounter != sharedCounter;
    localPol5BenMaxAuralCiSecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_AURAL_CI_SEC_CD_LEN = 1;
  /** serialize this Pol5BenMaxAuralCiSecCd */
  protected void serializePol5BenMaxAuralCiSecCd(char[] pol5BenMaxAuralCiSecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxAuralCiSecCd,
        0,
        getStringValue(),
        beginPol5BenMaxAuralCiSecCd,
        POL_5_BEN_MAX_AURAL_CI_SEC_CD_LEN);
    localPol5BenMaxAuralCiSecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxAuralCiSecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenMaxAuralCiSecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxAuralCiSecCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxAuralCiSecCd,
        beginPol5BenMaxAuralCiSecCd + POL_5_BEN_MAX_AURAL_CI_SEC_CD_LEN));
  }

  int localPol5BenMaxAuralCiSecCntCounter = -1;

  public boolean isPol5BenMaxAuralCiSecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxAuralCiSecCntCounter != sharedCounter;
    localPol5BenMaxAuralCiSecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxAuralCiSecCnt
   *
   * @return pol5BenMaxAuralCiSecCnt
   */
  public char[] getPol5BenMaxAuralCiSecCntString() {
    return getCharArray(beginPol5BenMaxAuralCiSecCnt, POL_5_BEN_MAX_AURAL_CI_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxAuralCiSecCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxAuralCiSecCnt,
        beginPol5BenMaxAuralCiSecCnt + POL_5_BEN_MAX_AURAL_CI_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_AURAL_CI_SEC_CNT_LEN = 3;
  /** serializePol5BenMaxAuralCiSecCnt */
  protected void serializePol5BenMaxAuralCiSecCnt(int pol5BenMaxAuralCiSecCnt) {
    putNumber(
        beginPol5BenMaxAuralCiSecCnt,
        pol5BenMaxAuralCiSecCnt,
        POL_5_BEN_MAX_AURAL_CI_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxAuralCiSecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxAuralCiSecCnt */
  protected int serializePol5BenMaxAuralCiSecCnt(char[] value) {
    int pol5BenMaxAuralCiSecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxAuralCiSecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxAuralCiSecCnt, 3);
    localPol5BenMaxAuralCiSecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxAuralCiSecCnt;
  }

  protected int checkPol5BenMaxAuralCiSecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxAuralCiSecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxAuralCiSecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxAuralCiSecCnt,
          POL_5_BEN_MAX_AURAL_CI_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxAuralCiSecCnt",
          beginPol5BenMaxAuralCiSecCnt,
          POL_5_BEN_MAX_AURAL_CI_SEC_CNT_LEN);
    }
  }

  int localPol5BenMaxCogTrpyPriCdCounter = -1;

  public boolean isPol5BenMaxCogTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCogTrpyPriCdCounter != sharedCounter;
    localPol5BenMaxCogTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_COG_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol5BenMaxCogTrpyPriCd */
  protected void serializePol5BenMaxCogTrpyPriCd(char[] pol5BenMaxCogTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxCogTrpyPriCd,
        0,
        getStringValue(),
        beginPol5BenMaxCogTrpyPriCd,
        POL_5_BEN_MAX_COG_TRPY_PRI_CD_LEN);
    localPol5BenMaxCogTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxCogTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenMaxCogTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxCogTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxCogTrpyPriCd,
        beginPol5BenMaxCogTrpyPriCd + POL_5_BEN_MAX_COG_TRPY_PRI_CD_LEN));
  }

  int localPol5BenMaxCogTrpyPriCntCounter = -1;

  public boolean isPol5BenMaxCogTrpyPriCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCogTrpyPriCntCounter != sharedCounter;
    localPol5BenMaxCogTrpyPriCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxCogTrpyPriCnt
   *
   * @return pol5BenMaxCogTrpyPriCnt
   */
  public char[] getPol5BenMaxCogTrpyPriCntString() {
    return getCharArray(beginPol5BenMaxCogTrpyPriCnt, POL_5_BEN_MAX_COG_TRPY_PRI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxCogTrpyPriCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxCogTrpyPriCnt,
        beginPol5BenMaxCogTrpyPriCnt + POL_5_BEN_MAX_COG_TRPY_PRI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_COG_TRPY_PRI_CNT_LEN = 3;
  /** serializePol5BenMaxCogTrpyPriCnt */
  protected void serializePol5BenMaxCogTrpyPriCnt(int pol5BenMaxCogTrpyPriCnt) {
    putNumber(
        beginPol5BenMaxCogTrpyPriCnt,
        pol5BenMaxCogTrpyPriCnt,
        POL_5_BEN_MAX_COG_TRPY_PRI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxCogTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxCogTrpyPriCnt */
  protected int serializePol5BenMaxCogTrpyPriCnt(char[] value) {
    int pol5BenMaxCogTrpyPriCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxCogTrpyPriCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxCogTrpyPriCnt, 3);
    localPol5BenMaxCogTrpyPriCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxCogTrpyPriCnt;
  }

  protected int checkPol5BenMaxCogTrpyPriCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxCogTrpyPriCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxCogTrpyPriCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxCogTrpyPriCnt,
          POL_5_BEN_MAX_COG_TRPY_PRI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxCogTrpyPriCnt",
          beginPol5BenMaxCogTrpyPriCnt,
          POL_5_BEN_MAX_COG_TRPY_PRI_CNT_LEN);
    }
  }

  int localPol5BenMaxCogTrpySecCdCounter = -1;

  public boolean isPol5BenMaxCogTrpySecCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCogTrpySecCdCounter != sharedCounter;
    localPol5BenMaxCogTrpySecCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_COG_TRPY_SEC_CD_LEN = 1;
  /** serialize this Pol5BenMaxCogTrpySecCd */
  protected void serializePol5BenMaxCogTrpySecCd(char[] pol5BenMaxCogTrpySecCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxCogTrpySecCd,
        0,
        getStringValue(),
        beginPol5BenMaxCogTrpySecCd,
        POL_5_BEN_MAX_COG_TRPY_SEC_CD_LEN);
    localPol5BenMaxCogTrpySecCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxCogTrpySecCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenMaxCogTrpySecCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxCogTrpySecCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxCogTrpySecCd,
        beginPol5BenMaxCogTrpySecCd + POL_5_BEN_MAX_COG_TRPY_SEC_CD_LEN));
  }

  int localPol5BenMaxCogTrpySecCntCounter = -1;

  public boolean isPol5BenMaxCogTrpySecCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCogTrpySecCntCounter != sharedCounter;
    localPol5BenMaxCogTrpySecCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxCogTrpySecCnt
   *
   * @return pol5BenMaxCogTrpySecCnt
   */
  public char[] getPol5BenMaxCogTrpySecCntString() {
    return getCharArray(beginPol5BenMaxCogTrpySecCnt, POL_5_BEN_MAX_COG_TRPY_SEC_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxCogTrpySecCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxCogTrpySecCnt,
        beginPol5BenMaxCogTrpySecCnt + POL_5_BEN_MAX_COG_TRPY_SEC_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_COG_TRPY_SEC_CNT_LEN = 3;
  /** serializePol5BenMaxCogTrpySecCnt */
  protected void serializePol5BenMaxCogTrpySecCnt(int pol5BenMaxCogTrpySecCnt) {
    putNumber(
        beginPol5BenMaxCogTrpySecCnt,
        pol5BenMaxCogTrpySecCnt,
        POL_5_BEN_MAX_COG_TRPY_SEC_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxCogTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxCogTrpySecCnt */
  protected int serializePol5BenMaxCogTrpySecCnt(char[] value) {
    int pol5BenMaxCogTrpySecCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxCogTrpySecCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxCogTrpySecCnt, 3);
    localPol5BenMaxCogTrpySecCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxCogTrpySecCnt;
  }

  protected int checkPol5BenMaxCogTrpySecCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxCogTrpySecCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxCogTrpySecCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxCogTrpySecCnt,
          POL_5_BEN_MAX_COG_TRPY_SEC_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxCogTrpySecCnt",
          beginPol5BenMaxCogTrpySecCnt,
          POL_5_BEN_MAX_COG_TRPY_SEC_CNT_LEN);
    }
  }

  int localPol5BenMaxCogTrpyExclCdCounter = -1;

  public boolean isPol5BenMaxCogTrpyExclCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxCogTrpyExclCdCounter != sharedCounter;
    localPol5BenMaxCogTrpyExclCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_COG_TRPY_EXCL_CD_LEN = 1;
  /** serialize this Pol5BenMaxCogTrpyExclCd */
  protected void serializePol5BenMaxCogTrpyExclCd(char[] pol5BenMaxCogTrpyExclCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxCogTrpyExclCd,
        0,
        getStringValue(),
        beginPol5BenMaxCogTrpyExclCd,
        POL_5_BEN_MAX_COG_TRPY_EXCL_CD_LEN);
    localPol5BenMaxCogTrpyExclCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxCogTrpyExclCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenMaxCogTrpyExclCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxCogTrpyExclCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxCogTrpyExclCd,
        beginPol5BenMaxCogTrpyExclCd + POL_5_BEN_MAX_COG_TRPY_EXCL_CD_LEN));
  }

  int localPol5BenMaxEhbSpneRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbSpneRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbSpneRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbSpneRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbSpneRhabCnt
   *
   * @return pol5BenMaxEhbSpneRhabCnt
   */
  public char[] getPol5BenMaxEhbSpneRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbSpneRhabCnt, POL_5_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbSpneRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbSpneRhabCnt,
        beginPol5BenMaxEhbSpneRhabCnt + POL_5_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbSpneRhabCnt */
  protected void serializePol5BenMaxEhbSpneRhabCnt(int pol5BenMaxEhbSpneRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbSpneRhabCnt,
        pol5BenMaxEhbSpneRhabCnt,
        POL_5_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbSpneRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbSpneRhabCnt */
  protected int serializePol5BenMaxEhbSpneRhabCnt(char[] value) {
    int pol5BenMaxEhbSpneRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbSpneRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbSpneRhabCnt, 3);
    localPol5BenMaxEhbSpneRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbSpneRhabCnt;
  }

  protected int checkPol5BenMaxEhbSpneRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbSpneRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbSpneRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbSpneRhabCnt,
          POL_5_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbSpneRhabCnt",
          beginPol5BenMaxEhbSpneRhabCnt,
          POL_5_BEN_MAX_EHB_SPNE_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbSpneHabCntCounter = -1;

  public boolean isPol5BenMaxEhbSpneHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbSpneHabCntCounter != sharedCounter;
    localPol5BenMaxEhbSpneHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbSpneHabCnt
   *
   * @return pol5BenMaxEhbSpneHabCnt
   */
  public char[] getPol5BenMaxEhbSpneHabCntString() {
    return getCharArray(beginPol5BenMaxEhbSpneHabCnt, POL_5_BEN_MAX_EHB_SPNE_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbSpneHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbSpneHabCnt,
        beginPol5BenMaxEhbSpneHabCnt + POL_5_BEN_MAX_EHB_SPNE_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_SPNE_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbSpneHabCnt */
  protected void serializePol5BenMaxEhbSpneHabCnt(int pol5BenMaxEhbSpneHabCnt) {
    putNumber(
        beginPol5BenMaxEhbSpneHabCnt,
        pol5BenMaxEhbSpneHabCnt,
        POL_5_BEN_MAX_EHB_SPNE_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbSpneHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbSpneHabCnt */
  protected int serializePol5BenMaxEhbSpneHabCnt(char[] value) {
    int pol5BenMaxEhbSpneHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbSpneHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbSpneHabCnt, 3);
    localPol5BenMaxEhbSpneHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbSpneHabCnt;
  }

  protected int checkPol5BenMaxEhbSpneHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbSpneHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbSpneHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbSpneHabCnt,
          POL_5_BEN_MAX_EHB_SPNE_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbSpneHabCnt",
          beginPol5BenMaxEhbSpneHabCnt,
          POL_5_BEN_MAX_EHB_SPNE_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPtRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbPtRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPtRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbPtRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPtRhabCnt
   *
   * @return pol5BenMaxEhbPtRhabCnt
   */
  public char[] getPol5BenMaxEhbPtRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbPtRhabCnt, POL_5_BEN_MAX_EHB_PT_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPtRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPtRhabCnt,
        beginPol5BenMaxEhbPtRhabCnt + POL_5_BEN_MAX_EHB_PT_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_PT_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPtRhabCnt */
  protected void serializePol5BenMaxEhbPtRhabCnt(int pol5BenMaxEhbPtRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbPtRhabCnt,
        pol5BenMaxEhbPtRhabCnt,
        POL_5_BEN_MAX_EHB_PT_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPtRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPtRhabCnt */
  protected int serializePol5BenMaxEhbPtRhabCnt(char[] value) {
    int pol5BenMaxEhbPtRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPtRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPtRhabCnt, 3);
    localPol5BenMaxEhbPtRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPtRhabCnt;
  }

  protected int checkPol5BenMaxEhbPtRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPtRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPtRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPtRhabCnt,
          POL_5_BEN_MAX_EHB_PT_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPtRhabCnt", beginPol5BenMaxEhbPtRhabCnt, POL_5_BEN_MAX_EHB_PT_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPtHabCntCounter = -1;

  public boolean isPol5BenMaxEhbPtHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPtHabCntCounter != sharedCounter;
    localPol5BenMaxEhbPtHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPtHabCnt
   *
   * @return pol5BenMaxEhbPtHabCnt
   */
  public char[] getPol5BenMaxEhbPtHabCntString() {
    return getCharArray(beginPol5BenMaxEhbPtHabCnt, POL_5_BEN_MAX_EHB_PT_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPtHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPtHabCnt,
        beginPol5BenMaxEhbPtHabCnt + POL_5_BEN_MAX_EHB_PT_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_PT_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPtHabCnt */
  protected void serializePol5BenMaxEhbPtHabCnt(int pol5BenMaxEhbPtHabCnt) {
    putNumber(
        beginPol5BenMaxEhbPtHabCnt,
        pol5BenMaxEhbPtHabCnt,
        POL_5_BEN_MAX_EHB_PT_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPtHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPtHabCnt */
  protected int serializePol5BenMaxEhbPtHabCnt(char[] value) {
    int pol5BenMaxEhbPtHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPtHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPtHabCnt, 3);
    localPol5BenMaxEhbPtHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPtHabCnt;
  }

  protected int checkPol5BenMaxEhbPtHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPtHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPtHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPtHabCnt,
          POL_5_BEN_MAX_EHB_PT_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPtHabCnt", beginPol5BenMaxEhbPtHabCnt, POL_5_BEN_MAX_EHB_PT_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbSpchRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbSpchRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbSpchRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbSpchRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbSpchRhabCnt
   *
   * @return pol5BenMaxEhbSpchRhabCnt
   */
  public char[] getPol5BenMaxEhbSpchRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbSpchRhabCnt, POL_5_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbSpchRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbSpchRhabCnt,
        beginPol5BenMaxEhbSpchRhabCnt + POL_5_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbSpchRhabCnt */
  protected void serializePol5BenMaxEhbSpchRhabCnt(int pol5BenMaxEhbSpchRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbSpchRhabCnt,
        pol5BenMaxEhbSpchRhabCnt,
        POL_5_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbSpchRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbSpchRhabCnt */
  protected int serializePol5BenMaxEhbSpchRhabCnt(char[] value) {
    int pol5BenMaxEhbSpchRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbSpchRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbSpchRhabCnt, 3);
    localPol5BenMaxEhbSpchRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbSpchRhabCnt;
  }

  protected int checkPol5BenMaxEhbSpchRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbSpchRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbSpchRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbSpchRhabCnt,
          POL_5_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbSpchRhabCnt",
          beginPol5BenMaxEhbSpchRhabCnt,
          POL_5_BEN_MAX_EHB_SPCH_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbSpchHabCntCounter = -1;

  public boolean isPol5BenMaxEhbSpchHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbSpchHabCntCounter != sharedCounter;
    localPol5BenMaxEhbSpchHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbSpchHabCnt
   *
   * @return pol5BenMaxEhbSpchHabCnt
   */
  public char[] getPol5BenMaxEhbSpchHabCntString() {
    return getCharArray(beginPol5BenMaxEhbSpchHabCnt, POL_5_BEN_MAX_EHB_SPCH_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbSpchHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbSpchHabCnt,
        beginPol5BenMaxEhbSpchHabCnt + POL_5_BEN_MAX_EHB_SPCH_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_SPCH_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbSpchHabCnt */
  protected void serializePol5BenMaxEhbSpchHabCnt(int pol5BenMaxEhbSpchHabCnt) {
    putNumber(
        beginPol5BenMaxEhbSpchHabCnt,
        pol5BenMaxEhbSpchHabCnt,
        POL_5_BEN_MAX_EHB_SPCH_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbSpchHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbSpchHabCnt */
  protected int serializePol5BenMaxEhbSpchHabCnt(char[] value) {
    int pol5BenMaxEhbSpchHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbSpchHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbSpchHabCnt, 3);
    localPol5BenMaxEhbSpchHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbSpchHabCnt;
  }

  protected int checkPol5BenMaxEhbSpchHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbSpchHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbSpchHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbSpchHabCnt,
          POL_5_BEN_MAX_EHB_SPCH_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbSpchHabCnt",
          beginPol5BenMaxEhbSpchHabCnt,
          POL_5_BEN_MAX_EHB_SPCH_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbCrdcRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbCrdcRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbCrdcRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbCrdcRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbCrdcRhabCnt
   *
   * @return pol5BenMaxEhbCrdcRhabCnt
   */
  public char[] getPol5BenMaxEhbCrdcRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbCrdcRhabCnt, POL_5_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbCrdcRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbCrdcRhabCnt,
        beginPol5BenMaxEhbCrdcRhabCnt + POL_5_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbCrdcRhabCnt */
  protected void serializePol5BenMaxEhbCrdcRhabCnt(int pol5BenMaxEhbCrdcRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbCrdcRhabCnt,
        pol5BenMaxEhbCrdcRhabCnt,
        POL_5_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbCrdcRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbCrdcRhabCnt */
  protected int serializePol5BenMaxEhbCrdcRhabCnt(char[] value) {
    int pol5BenMaxEhbCrdcRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbCrdcRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbCrdcRhabCnt, 3);
    localPol5BenMaxEhbCrdcRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbCrdcRhabCnt;
  }

  protected int checkPol5BenMaxEhbCrdcRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbCrdcRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbCrdcRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbCrdcRhabCnt,
          POL_5_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbCrdcRhabCnt",
          beginPol5BenMaxEhbCrdcRhabCnt,
          POL_5_BEN_MAX_EHB_CRDC_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbOtRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbOtRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbOtRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbOtRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbOtRhabCnt
   *
   * @return pol5BenMaxEhbOtRhabCnt
   */
  public char[] getPol5BenMaxEhbOtRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbOtRhabCnt, POL_5_BEN_MAX_EHB_OT_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbOtRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbOtRhabCnt,
        beginPol5BenMaxEhbOtRhabCnt + POL_5_BEN_MAX_EHB_OT_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_OT_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbOtRhabCnt */
  protected void serializePol5BenMaxEhbOtRhabCnt(int pol5BenMaxEhbOtRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbOtRhabCnt,
        pol5BenMaxEhbOtRhabCnt,
        POL_5_BEN_MAX_EHB_OT_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbOtRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbOtRhabCnt */
  protected int serializePol5BenMaxEhbOtRhabCnt(char[] value) {
    int pol5BenMaxEhbOtRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbOtRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbOtRhabCnt, 3);
    localPol5BenMaxEhbOtRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbOtRhabCnt;
  }

  protected int checkPol5BenMaxEhbOtRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbOtRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbOtRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbOtRhabCnt,
          POL_5_BEN_MAX_EHB_OT_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbOtRhabCnt", beginPol5BenMaxEhbOtRhabCnt, POL_5_BEN_MAX_EHB_OT_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbOtHabCntCounter = -1;

  public boolean isPol5BenMaxEhbOtHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbOtHabCntCounter != sharedCounter;
    localPol5BenMaxEhbOtHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbOtHabCnt
   *
   * @return pol5BenMaxEhbOtHabCnt
   */
  public char[] getPol5BenMaxEhbOtHabCntString() {
    return getCharArray(beginPol5BenMaxEhbOtHabCnt, POL_5_BEN_MAX_EHB_OT_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbOtHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbOtHabCnt,
        beginPol5BenMaxEhbOtHabCnt + POL_5_BEN_MAX_EHB_OT_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_OT_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbOtHabCnt */
  protected void serializePol5BenMaxEhbOtHabCnt(int pol5BenMaxEhbOtHabCnt) {
    putNumber(
        beginPol5BenMaxEhbOtHabCnt,
        pol5BenMaxEhbOtHabCnt,
        POL_5_BEN_MAX_EHB_OT_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbOtHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbOtHabCnt */
  protected int serializePol5BenMaxEhbOtHabCnt(char[] value) {
    int pol5BenMaxEhbOtHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbOtHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbOtHabCnt, 3);
    localPol5BenMaxEhbOtHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbOtHabCnt;
  }

  protected int checkPol5BenMaxEhbOtHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbOtHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbOtHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbOtHabCnt,
          POL_5_BEN_MAX_EHB_OT_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbOtHabCnt", beginPol5BenMaxEhbOtHabCnt, POL_5_BEN_MAX_EHB_OT_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPlmryRhabCnCounter = -1;

  public boolean isPol5BenMaxEhbPlmryRhabCnModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPlmryRhabCnCounter != sharedCounter;
    localPol5BenMaxEhbPlmryRhabCnCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPlmryRhabCn
   *
   * @return pol5BenMaxEhbPlmryRhabCn
   */
  public char[] getPol5BenMaxEhbPlmryRhabCnString() {
    return getCharArray(beginPol5BenMaxEhbPlmryRhabCn, POL_5_BEN_MAX_EHB_PLMRY_RHAB_CN_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPlmryRhabCnIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPlmryRhabCn,
        beginPol5BenMaxEhbPlmryRhabCn + POL_5_BEN_MAX_EHB_PLMRY_RHAB_CN_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_PLMRY_RHAB_CN_LEN = 3;
  /** serializePol5BenMaxEhbPlmryRhabCn */
  protected void serializePol5BenMaxEhbPlmryRhabCn(int pol5BenMaxEhbPlmryRhabCn) {
    putNumber(
        beginPol5BenMaxEhbPlmryRhabCn,
        pol5BenMaxEhbPlmryRhabCn,
        POL_5_BEN_MAX_EHB_PLMRY_RHAB_CN_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPlmryRhabCnCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPlmryRhabCn */
  protected int serializePol5BenMaxEhbPlmryRhabCn(char[] value) {
    int pol5BenMaxEhbPlmryRhabCn;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPlmryRhabCn =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPlmryRhabCn, 3);
    localPol5BenMaxEhbPlmryRhabCnCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPlmryRhabCn;
  }

  protected int checkPol5BenMaxEhbPlmryRhabCnMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPlmryRhabCn is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPlmryRhabCn() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPlmryRhabCn,
          POL_5_BEN_MAX_EHB_PLMRY_RHAB_CN_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPlmryRhabCn",
          beginPol5BenMaxEhbPlmryRhabCn,
          POL_5_BEN_MAX_EHB_PLMRY_RHAB_CN_LEN);
    }
  }

  int localPol5BenMaxEhbAuralRhabCnCounter = -1;

  public boolean isPol5BenMaxEhbAuralRhabCnModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbAuralRhabCnCounter != sharedCounter;
    localPol5BenMaxEhbAuralRhabCnCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbAuralRhabCn
   *
   * @return pol5BenMaxEhbAuralRhabCn
   */
  public char[] getPol5BenMaxEhbAuralRhabCnString() {
    return getCharArray(beginPol5BenMaxEhbAuralRhabCn, POL_5_BEN_MAX_EHB_AURAL_RHAB_CN_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbAuralRhabCnIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbAuralRhabCn,
        beginPol5BenMaxEhbAuralRhabCn + POL_5_BEN_MAX_EHB_AURAL_RHAB_CN_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_AURAL_RHAB_CN_LEN = 3;
  /** serializePol5BenMaxEhbAuralRhabCn */
  protected void serializePol5BenMaxEhbAuralRhabCn(int pol5BenMaxEhbAuralRhabCn) {
    putNumber(
        beginPol5BenMaxEhbAuralRhabCn,
        pol5BenMaxEhbAuralRhabCn,
        POL_5_BEN_MAX_EHB_AURAL_RHAB_CN_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbAuralRhabCnCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbAuralRhabCn */
  protected int serializePol5BenMaxEhbAuralRhabCn(char[] value) {
    int pol5BenMaxEhbAuralRhabCn;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbAuralRhabCn =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbAuralRhabCn, 3);
    localPol5BenMaxEhbAuralRhabCnCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbAuralRhabCn;
  }

  protected int checkPol5BenMaxEhbAuralRhabCnMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbAuralRhabCn is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbAuralRhabCn() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbAuralRhabCn,
          POL_5_BEN_MAX_EHB_AURAL_RHAB_CN_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbAuralRhabCn",
          beginPol5BenMaxEhbAuralRhabCn,
          POL_5_BEN_MAX_EHB_AURAL_RHAB_CN_LEN);
    }
  }

  int localPol5BenMaxEhbAuralHabCntCounter = -1;

  public boolean isPol5BenMaxEhbAuralHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbAuralHabCntCounter != sharedCounter;
    localPol5BenMaxEhbAuralHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbAuralHabCnt
   *
   * @return pol5BenMaxEhbAuralHabCnt
   */
  public char[] getPol5BenMaxEhbAuralHabCntString() {
    return getCharArray(beginPol5BenMaxEhbAuralHabCnt, POL_5_BEN_MAX_EHB_AURAL_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbAuralHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbAuralHabCnt,
        beginPol5BenMaxEhbAuralHabCnt + POL_5_BEN_MAX_EHB_AURAL_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_AURAL_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbAuralHabCnt */
  protected void serializePol5BenMaxEhbAuralHabCnt(int pol5BenMaxEhbAuralHabCnt) {
    putNumber(
        beginPol5BenMaxEhbAuralHabCnt,
        pol5BenMaxEhbAuralHabCnt,
        POL_5_BEN_MAX_EHB_AURAL_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbAuralHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbAuralHabCnt */
  protected int serializePol5BenMaxEhbAuralHabCnt(char[] value) {
    int pol5BenMaxEhbAuralHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbAuralHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbAuralHabCnt, 3);
    localPol5BenMaxEhbAuralHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbAuralHabCnt;
  }

  protected int checkPol5BenMaxEhbAuralHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbAuralHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbAuralHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbAuralHabCnt,
          POL_5_BEN_MAX_EHB_AURAL_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbAuralHabCnt",
          beginPol5BenMaxEhbAuralHabCnt,
          POL_5_BEN_MAX_EHB_AURAL_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbCogRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbCogRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbCogRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbCogRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbCogRhabCnt
   *
   * @return pol5BenMaxEhbCogRhabCnt
   */
  public char[] getPol5BenMaxEhbCogRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbCogRhabCnt, POL_5_BEN_MAX_EHB_COG_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbCogRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbCogRhabCnt,
        beginPol5BenMaxEhbCogRhabCnt + POL_5_BEN_MAX_EHB_COG_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_COG_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbCogRhabCnt */
  protected void serializePol5BenMaxEhbCogRhabCnt(int pol5BenMaxEhbCogRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbCogRhabCnt,
        pol5BenMaxEhbCogRhabCnt,
        POL_5_BEN_MAX_EHB_COG_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbCogRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbCogRhabCnt */
  protected int serializePol5BenMaxEhbCogRhabCnt(char[] value) {
    int pol5BenMaxEhbCogRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbCogRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbCogRhabCnt, 3);
    localPol5BenMaxEhbCogRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbCogRhabCnt;
  }

  protected int checkPol5BenMaxEhbCogRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbCogRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbCogRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbCogRhabCnt,
          POL_5_BEN_MAX_EHB_COG_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbCogRhabCnt",
          beginPol5BenMaxEhbCogRhabCnt,
          POL_5_BEN_MAX_EHB_COG_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbCogHabCntCounter = -1;

  public boolean isPol5BenMaxEhbCogHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbCogHabCntCounter != sharedCounter;
    localPol5BenMaxEhbCogHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbCogHabCnt
   *
   * @return pol5BenMaxEhbCogHabCnt
   */
  public char[] getPol5BenMaxEhbCogHabCntString() {
    return getCharArray(beginPol5BenMaxEhbCogHabCnt, POL_5_BEN_MAX_EHB_COG_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbCogHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbCogHabCnt,
        beginPol5BenMaxEhbCogHabCnt + POL_5_BEN_MAX_EHB_COG_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_COG_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbCogHabCnt */
  protected void serializePol5BenMaxEhbCogHabCnt(int pol5BenMaxEhbCogHabCnt) {
    putNumber(
        beginPol5BenMaxEhbCogHabCnt,
        pol5BenMaxEhbCogHabCnt,
        POL_5_BEN_MAX_EHB_COG_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbCogHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbCogHabCnt */
  protected int serializePol5BenMaxEhbCogHabCnt(char[] value) {
    int pol5BenMaxEhbCogHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbCogHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbCogHabCnt, 3);
    localPol5BenMaxEhbCogHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbCogHabCnt;
  }

  protected int checkPol5BenMaxEhbCogHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbCogHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbCogHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbCogHabCnt,
          POL_5_BEN_MAX_EHB_COG_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbCogHabCnt", beginPol5BenMaxEhbCogHabCnt, POL_5_BEN_MAX_EHB_COG_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPostRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbPostRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPostRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbPostRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPostRhabCnt
   *
   * @return pol5BenMaxEhbPostRhabCnt
   */
  public char[] getPol5BenMaxEhbPostRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbPostRhabCnt, POL_5_BEN_MAX_EHB_POST_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPostRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPostRhabCnt,
        beginPol5BenMaxEhbPostRhabCnt + POL_5_BEN_MAX_EHB_POST_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_POST_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPostRhabCnt */
  protected void serializePol5BenMaxEhbPostRhabCnt(int pol5BenMaxEhbPostRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbPostRhabCnt,
        pol5BenMaxEhbPostRhabCnt,
        POL_5_BEN_MAX_EHB_POST_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPostRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPostRhabCnt */
  protected int serializePol5BenMaxEhbPostRhabCnt(char[] value) {
    int pol5BenMaxEhbPostRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPostRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPostRhabCnt, 3);
    localPol5BenMaxEhbPostRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPostRhabCnt;
  }

  protected int checkPol5BenMaxEhbPostRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPostRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPostRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPostRhabCnt,
          POL_5_BEN_MAX_EHB_POST_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPostRhabCnt",
          beginPol5BenMaxEhbPostRhabCnt,
          POL_5_BEN_MAX_EHB_POST_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPostHabCntCounter = -1;

  public boolean isPol5BenMaxEhbPostHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPostHabCntCounter != sharedCounter;
    localPol5BenMaxEhbPostHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPostHabCnt
   *
   * @return pol5BenMaxEhbPostHabCnt
   */
  public char[] getPol5BenMaxEhbPostHabCntString() {
    return getCharArray(beginPol5BenMaxEhbPostHabCnt, POL_5_BEN_MAX_EHB_POST_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPostHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPostHabCnt,
        beginPol5BenMaxEhbPostHabCnt + POL_5_BEN_MAX_EHB_POST_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_POST_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPostHabCnt */
  protected void serializePol5BenMaxEhbPostHabCnt(int pol5BenMaxEhbPostHabCnt) {
    putNumber(
        beginPol5BenMaxEhbPostHabCnt,
        pol5BenMaxEhbPostHabCnt,
        POL_5_BEN_MAX_EHB_POST_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPostHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPostHabCnt */
  protected int serializePol5BenMaxEhbPostHabCnt(char[] value) {
    int pol5BenMaxEhbPostHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPostHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPostHabCnt, 3);
    localPol5BenMaxEhbPostHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPostHabCnt;
  }

  protected int checkPol5BenMaxEhbPostHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPostHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPostHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPostHabCnt,
          POL_5_BEN_MAX_EHB_POST_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPostHabCnt",
          beginPol5BenMaxEhbPostHabCnt,
          POL_5_BEN_MAX_EHB_POST_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPtotRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbPtotRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPtotRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbPtotRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPtotRhabCnt
   *
   * @return pol5BenMaxEhbPtotRhabCnt
   */
  public char[] getPol5BenMaxEhbPtotRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbPtotRhabCnt, POL_5_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPtotRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPtotRhabCnt,
        beginPol5BenMaxEhbPtotRhabCnt + POL_5_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPtotRhabCnt */
  protected void serializePol5BenMaxEhbPtotRhabCnt(int pol5BenMaxEhbPtotRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbPtotRhabCnt,
        pol5BenMaxEhbPtotRhabCnt,
        POL_5_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPtotRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPtotRhabCnt */
  protected int serializePol5BenMaxEhbPtotRhabCnt(char[] value) {
    int pol5BenMaxEhbPtotRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPtotRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPtotRhabCnt, 3);
    localPol5BenMaxEhbPtotRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPtotRhabCnt;
  }

  protected int checkPol5BenMaxEhbPtotRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPtotRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPtotRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPtotRhabCnt,
          POL_5_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPtotRhabCnt",
          beginPol5BenMaxEhbPtotRhabCnt,
          POL_5_BEN_MAX_EHB_PTOT_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPtotHabCntCounter = -1;

  public boolean isPol5BenMaxEhbPtotHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPtotHabCntCounter != sharedCounter;
    localPol5BenMaxEhbPtotHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPtotHabCnt
   *
   * @return pol5BenMaxEhbPtotHabCnt
   */
  public char[] getPol5BenMaxEhbPtotHabCntString() {
    return getCharArray(beginPol5BenMaxEhbPtotHabCnt, POL_5_BEN_MAX_EHB_PTOT_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPtotHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPtotHabCnt,
        beginPol5BenMaxEhbPtotHabCnt + POL_5_BEN_MAX_EHB_PTOT_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_PTOT_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPtotHabCnt */
  protected void serializePol5BenMaxEhbPtotHabCnt(int pol5BenMaxEhbPtotHabCnt) {
    putNumber(
        beginPol5BenMaxEhbPtotHabCnt,
        pol5BenMaxEhbPtotHabCnt,
        POL_5_BEN_MAX_EHB_PTOT_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPtotHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPtotHabCnt */
  protected int serializePol5BenMaxEhbPtotHabCnt(char[] value) {
    int pol5BenMaxEhbPtotHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPtotHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPtotHabCnt, 3);
    localPol5BenMaxEhbPtotHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPtotHabCnt;
  }

  protected int checkPol5BenMaxEhbPtotHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPtotHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPtotHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPtotHabCnt,
          POL_5_BEN_MAX_EHB_PTOT_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPtotHabCnt",
          beginPol5BenMaxEhbPtotHabCnt,
          POL_5_BEN_MAX_EHB_PTOT_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbRhabRmrkCdCounter = -1;

  public boolean isPol5BenMaxEhbRhabRmrkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbRhabRmrkCdCounter != sharedCounter;
    localPol5BenMaxEhbRhabRmrkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_EHB_RHAB_RMRK_CD_LEN = 3;
  /** serialize this Pol5BenMaxEhbRhabRmrkCd */
  protected void serializePol5BenMaxEhbRhabRmrkCd(char[] pol5BenMaxEhbRhabRmrkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxEhbRhabRmrkCd,
        0,
        getStringValue(),
        beginPol5BenMaxEhbRhabRmrkCd,
        POL_5_BEN_MAX_EHB_RHAB_RMRK_CD_LEN);
    localPol5BenMaxEhbRhabRmrkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxEhbRhabRmrkCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol5BenMaxEhbRhabRmrkCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxEhbRhabRmrkCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxEhbRhabRmrkCd,
        beginPol5BenMaxEhbRhabRmrkCd + POL_5_BEN_MAX_EHB_RHAB_RMRK_CD_LEN));
  }

  int localPol5BenMaxEhbPosmRhabCntCounter = -1;

  public boolean isPol5BenMaxEhbPosmRhabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPosmRhabCntCounter != sharedCounter;
    localPol5BenMaxEhbPosmRhabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPosmRhabCnt
   *
   * @return pol5BenMaxEhbPosmRhabCnt
   */
  public char[] getPol5BenMaxEhbPosmRhabCntString() {
    return getCharArray(beginPol5BenMaxEhbPosmRhabCnt, POL_5_BEN_MAX_EHB_POSM_RHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPosmRhabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPosmRhabCnt,
        beginPol5BenMaxEhbPosmRhabCnt + POL_5_BEN_MAX_EHB_POSM_RHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_POSM_RHAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPosmRhabCnt */
  protected void serializePol5BenMaxEhbPosmRhabCnt(int pol5BenMaxEhbPosmRhabCnt) {
    putNumber(
        beginPol5BenMaxEhbPosmRhabCnt,
        pol5BenMaxEhbPosmRhabCnt,
        POL_5_BEN_MAX_EHB_POSM_RHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPosmRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPosmRhabCnt */
  protected int serializePol5BenMaxEhbPosmRhabCnt(char[] value) {
    int pol5BenMaxEhbPosmRhabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPosmRhabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPosmRhabCnt, 3);
    localPol5BenMaxEhbPosmRhabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPosmRhabCnt;
  }

  protected int checkPol5BenMaxEhbPosmRhabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPosmRhabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPosmRhabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPosmRhabCnt,
          POL_5_BEN_MAX_EHB_POSM_RHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPosmRhabCnt",
          beginPol5BenMaxEhbPosmRhabCnt,
          POL_5_BEN_MAX_EHB_POSM_RHAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbPosmHabCntCounter = -1;

  public boolean isPol5BenMaxEhbPosmHabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbPosmHabCntCounter != sharedCounter;
    localPol5BenMaxEhbPosmHabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol5BenMaxEhbPosmHabCnt
   *
   * @return pol5BenMaxEhbPosmHabCnt
   */
  public char[] getPol5BenMaxEhbPosmHabCntString() {
    return getCharArray(beginPol5BenMaxEhbPosmHabCnt, POL_5_BEN_MAX_EHB_POSM_HAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol5BenMaxEhbPosmHabCntIsNumeric() {
    return isNumeric(
        beginPol5BenMaxEhbPosmHabCnt,
        beginPol5BenMaxEhbPosmHabCnt + POL_5_BEN_MAX_EHB_POSM_HAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_5_BEN_MAX_EHB_POSM_HAB_CNT_LEN = 3;
  /** serializePol5BenMaxEhbPosmHabCnt */
  protected void serializePol5BenMaxEhbPosmHabCnt(int pol5BenMaxEhbPosmHabCnt) {
    putNumber(
        beginPol5BenMaxEhbPosmHabCnt,
        pol5BenMaxEhbPosmHabCnt,
        POL_5_BEN_MAX_EHB_POSM_HAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol5BenMaxEhbPosmHabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol5BenMaxEhbPosmHabCnt */
  protected int serializePol5BenMaxEhbPosmHabCnt(char[] value) {
    int pol5BenMaxEhbPosmHabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol5BenMaxEhbPosmHabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol5BenMaxEhbPosmHabCnt, 3);
    localPol5BenMaxEhbPosmHabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol5BenMaxEhbPosmHabCnt;
  }

  protected int checkPol5BenMaxEhbPosmHabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol5BenMaxEhbPosmHabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol5BenMaxEhbPosmHabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol5BenMaxEhbPosmHabCnt,
          POL_5_BEN_MAX_EHB_POSM_HAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol5BenMaxEhbPosmHabCnt",
          beginPol5BenMaxEhbPosmHabCnt,
          POL_5_BEN_MAX_EHB_POSM_HAB_CNT_LEN);
    }
  }

  int localPol5BenMaxEhbHabRmrkCdCounter = -1;

  public boolean isPol5BenMaxEhbHabRmrkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenMaxEhbHabRmrkCdCounter != sharedCounter;
    localPol5BenMaxEhbHabRmrkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_MAX_EHB_HAB_RMRK_CD_LEN = 3;
  /** serialize this Pol5BenMaxEhbHabRmrkCd */
  protected void serializePol5BenMaxEhbHabRmrkCd(char[] pol5BenMaxEhbHabRmrkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenMaxEhbHabRmrkCd,
        0,
        getStringValue(),
        beginPol5BenMaxEhbHabRmrkCd,
        POL_5_BEN_MAX_EHB_HAB_RMRK_CD_LEN);
    localPol5BenMaxEhbHabRmrkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenMaxEhbHabRmrkCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol5BenMaxEhbHabRmrkCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenMaxEhbHabRmrkCd() {
    return (substring(
        getStringValue(),
        beginPol5BenMaxEhbHabRmrkCd,
        beginPol5BenMaxEhbHabRmrkCd + POL_5_BEN_MAX_EHB_HAB_RMRK_CD_LEN));
  }

  int localPol5BenPhysMedcnPrdCdCounter = -1;

  public boolean isPol5BenPhysMedcnPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5BenPhysMedcnPrdCdCounter != sharedCounter;
    localPol5BenPhysMedcnPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_BEN_PHYS_MEDCN_PRD_CD_LEN = 1;
  /** serialize this Pol5BenPhysMedcnPrdCd */
  protected void serializePol5BenPhysMedcnPrdCd(char[] pol5BenPhysMedcnPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5BenPhysMedcnPrdCd,
        0,
        getStringValue(),
        beginPol5BenPhysMedcnPrdCd,
        POL_5_BEN_PHYS_MEDCN_PRD_CD_LEN);
    localPol5BenPhysMedcnPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5BenPhysMedcnPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol5BenPhysMedcnPrdCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5BenPhysMedcnPrdCd() {
    return (substring(
        getStringValue(),
        beginPol5BenPhysMedcnPrdCd,
        beginPol5BenPhysMedcnPrdCd + POL_5_BEN_PHYS_MEDCN_PRD_CD_LEN));
  }

  int localPol5RetRhabCombPtLmtCdCounter = -1;

  public boolean isPol5RetRhabCombPtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombPtLmtCdCounter != sharedCounter;
    localPol5RetRhabCombPtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_PT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombPtLmtCd */
  protected void serializePol5RetRhabCombPtLmtCd(char[] pol5RetRhabCombPtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombPtLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombPtLmtCd,
        POL_5_RET_RHAB_COMB_PT_LMT_CD_LEN);
    localPol5RetRhabCombPtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombPtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombPtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombPtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombPtLmtCd,
        beginPol5RetRhabCombPtLmtCd + POL_5_RET_RHAB_COMB_PT_LMT_CD_LEN));
  }

  int localPol5RetRhabCombOtLmtCdCounter = -1;

  public boolean isPol5RetRhabCombOtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombOtLmtCdCounter != sharedCounter;
    localPol5RetRhabCombOtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_OT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombOtLmtCd */
  protected void serializePol5RetRhabCombOtLmtCd(char[] pol5RetRhabCombOtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombOtLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombOtLmtCd,
        POL_5_RET_RHAB_COMB_OT_LMT_CD_LEN);
    localPol5RetRhabCombOtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombOtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombOtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombOtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombOtLmtCd,
        beginPol5RetRhabCombOtLmtCd + POL_5_RET_RHAB_COMB_OT_LMT_CD_LEN));
  }

  int localPol5RetRhabCombStLmtCdCounter = -1;

  public boolean isPol5RetRhabCombStLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombStLmtCdCounter != sharedCounter;
    localPol5RetRhabCombStLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_ST_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombStLmtCd */
  protected void serializePol5RetRhabCombStLmtCd(char[] pol5RetRhabCombStLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombStLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombStLmtCd,
        POL_5_RET_RHAB_COMB_ST_LMT_CD_LEN);
    localPol5RetRhabCombStLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombStLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombStLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombStLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombStLmtCd,
        beginPol5RetRhabCombStLmtCd + POL_5_RET_RHAB_COMB_ST_LMT_CD_LEN));
  }

  int localPol5RetRhabCombSmLmtCdCounter = -1;

  public boolean isPol5RetRhabCombSmLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombSmLmtCdCounter != sharedCounter;
    localPol5RetRhabCombSmLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_SM_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombSmLmtCd */
  protected void serializePol5RetRhabCombSmLmtCd(char[] pol5RetRhabCombSmLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombSmLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombSmLmtCd,
        POL_5_RET_RHAB_COMB_SM_LMT_CD_LEN);
    localPol5RetRhabCombSmLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombSmLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombSmLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombSmLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombSmLmtCd,
        beginPol5RetRhabCombSmLmtCd + POL_5_RET_RHAB_COMB_SM_LMT_CD_LEN));
  }

  int localPol5RetRhabCombCiLmtCdCounter = -1;

  public boolean isPol5RetRhabCombCiLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombCiLmtCdCounter != sharedCounter;
    localPol5RetRhabCombCiLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_CI_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombCiLmtCd */
  protected void serializePol5RetRhabCombCiLmtCd(char[] pol5RetRhabCombCiLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombCiLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombCiLmtCd,
        POL_5_RET_RHAB_COMB_CI_LMT_CD_LEN);
    localPol5RetRhabCombCiLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombCiLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombCiLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombCiLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombCiLmtCd,
        beginPol5RetRhabCombCiLmtCd + POL_5_RET_RHAB_COMB_CI_LMT_CD_LEN));
  }

  int localPol5RetRhabCombCtLmtCdCounter = -1;

  public boolean isPol5RetRhabCombCtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombCtLmtCdCounter != sharedCounter;
    localPol5RetRhabCombCtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_CT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombCtLmtCd */
  protected void serializePol5RetRhabCombCtLmtCd(char[] pol5RetRhabCombCtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombCtLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombCtLmtCd,
        POL_5_RET_RHAB_COMB_CT_LMT_CD_LEN);
    localPol5RetRhabCombCtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombCtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombCtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombCtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombCtLmtCd,
        beginPol5RetRhabCombCtLmtCd + POL_5_RET_RHAB_COMB_CT_LMT_CD_LEN));
  }

  int localPol5RetRhabCombCrLmtCdCounter = -1;

  public boolean isPol5RetRhabCombCrLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombCrLmtCdCounter != sharedCounter;
    localPol5RetRhabCombCrLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_CR_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombCrLmtCd */
  protected void serializePol5RetRhabCombCrLmtCd(char[] pol5RetRhabCombCrLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombCrLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombCrLmtCd,
        POL_5_RET_RHAB_COMB_CR_LMT_CD_LEN);
    localPol5RetRhabCombCrLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombCrLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombCrLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombCrLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombCrLmtCd,
        beginPol5RetRhabCombCrLmtCd + POL_5_RET_RHAB_COMB_CR_LMT_CD_LEN));
  }

  int localPol5RetRhabCombPrLmtCdCounter = -1;

  public boolean isPol5RetRhabCombPrLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombPrLmtCdCounter != sharedCounter;
    localPol5RetRhabCombPrLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_PR_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombPrLmtCd */
  protected void serializePol5RetRhabCombPrLmtCd(char[] pol5RetRhabCombPrLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombPrLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombPrLmtCd,
        POL_5_RET_RHAB_COMB_PR_LMT_CD_LEN);
    localPol5RetRhabCombPrLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombPrLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombPrLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombPrLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombPrLmtCd,
        beginPol5RetRhabCombPrLmtCd + POL_5_RET_RHAB_COMB_PR_LMT_CD_LEN));
  }

  int localPol5RetRhabCombMtLmtCdCounter = -1;

  public boolean isPol5RetRhabCombMtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetRhabCombMtLmtCdCounter != sharedCounter;
    localPol5RetRhabCombMtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_RHAB_COMB_MT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetRhabCombMtLmtCd */
  protected void serializePol5RetRhabCombMtLmtCd(char[] pol5RetRhabCombMtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetRhabCombMtLmtCd,
        0,
        getStringValue(),
        beginPol5RetRhabCombMtLmtCd,
        POL_5_RET_RHAB_COMB_MT_LMT_CD_LEN);
    localPol5RetRhabCombMtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetRhabCombMtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetRhabCombMtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetRhabCombMtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetRhabCombMtLmtCd,
        beginPol5RetRhabCombMtLmtCd + POL_5_RET_RHAB_COMB_MT_LMT_CD_LEN));
  }

  int localPol5RetHabCombPtLmtCdCounter = -1;

  public boolean isPol5RetHabCombPtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetHabCombPtLmtCdCounter != sharedCounter;
    localPol5RetHabCombPtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_HAB_COMB_PT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetHabCombPtLmtCd */
  protected void serializePol5RetHabCombPtLmtCd(char[] pol5RetHabCombPtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetHabCombPtLmtCd,
        0,
        getStringValue(),
        beginPol5RetHabCombPtLmtCd,
        POL_5_RET_HAB_COMB_PT_LMT_CD_LEN);
    localPol5RetHabCombPtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetHabCombPtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetHabCombPtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetHabCombPtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetHabCombPtLmtCd,
        beginPol5RetHabCombPtLmtCd + POL_5_RET_HAB_COMB_PT_LMT_CD_LEN));
  }

  int localPol5RetHabCombOtLmtCdCounter = -1;

  public boolean isPol5RetHabCombOtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetHabCombOtLmtCdCounter != sharedCounter;
    localPol5RetHabCombOtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_HAB_COMB_OT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetHabCombOtLmtCd */
  protected void serializePol5RetHabCombOtLmtCd(char[] pol5RetHabCombOtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetHabCombOtLmtCd,
        0,
        getStringValue(),
        beginPol5RetHabCombOtLmtCd,
        POL_5_RET_HAB_COMB_OT_LMT_CD_LEN);
    localPol5RetHabCombOtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetHabCombOtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetHabCombOtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetHabCombOtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetHabCombOtLmtCd,
        beginPol5RetHabCombOtLmtCd + POL_5_RET_HAB_COMB_OT_LMT_CD_LEN));
  }

  int localPol5RetHabCombStLmtCdCounter = -1;

  public boolean isPol5RetHabCombStLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetHabCombStLmtCdCounter != sharedCounter;
    localPol5RetHabCombStLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_HAB_COMB_ST_LMT_CD_LEN = 2;
  /** serialize this Pol5RetHabCombStLmtCd */
  protected void serializePol5RetHabCombStLmtCd(char[] pol5RetHabCombStLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetHabCombStLmtCd,
        0,
        getStringValue(),
        beginPol5RetHabCombStLmtCd,
        POL_5_RET_HAB_COMB_ST_LMT_CD_LEN);
    localPol5RetHabCombStLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetHabCombStLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetHabCombStLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetHabCombStLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetHabCombStLmtCd,
        beginPol5RetHabCombStLmtCd + POL_5_RET_HAB_COMB_ST_LMT_CD_LEN));
  }

  int localPol5RetHabCombSmLmtCdCounter = -1;

  public boolean isPol5RetHabCombSmLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetHabCombSmLmtCdCounter != sharedCounter;
    localPol5RetHabCombSmLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_HAB_COMB_SM_LMT_CD_LEN = 2;
  /** serialize this Pol5RetHabCombSmLmtCd */
  protected void serializePol5RetHabCombSmLmtCd(char[] pol5RetHabCombSmLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetHabCombSmLmtCd,
        0,
        getStringValue(),
        beginPol5RetHabCombSmLmtCd,
        POL_5_RET_HAB_COMB_SM_LMT_CD_LEN);
    localPol5RetHabCombSmLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetHabCombSmLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetHabCombSmLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetHabCombSmLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetHabCombSmLmtCd,
        beginPol5RetHabCombSmLmtCd + POL_5_RET_HAB_COMB_SM_LMT_CD_LEN));
  }

  int localPol5RetHabCombCiLmtCdCounter = -1;

  public boolean isPol5RetHabCombCiLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetHabCombCiLmtCdCounter != sharedCounter;
    localPol5RetHabCombCiLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_HAB_COMB_CI_LMT_CD_LEN = 2;
  /** serialize this Pol5RetHabCombCiLmtCd */
  protected void serializePol5RetHabCombCiLmtCd(char[] pol5RetHabCombCiLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetHabCombCiLmtCd,
        0,
        getStringValue(),
        beginPol5RetHabCombCiLmtCd,
        POL_5_RET_HAB_COMB_CI_LMT_CD_LEN);
    localPol5RetHabCombCiLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetHabCombCiLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetHabCombCiLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetHabCombCiLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetHabCombCiLmtCd,
        beginPol5RetHabCombCiLmtCd + POL_5_RET_HAB_COMB_CI_LMT_CD_LEN));
  }

  int localPol5RetHabCombCtLmtCdCounter = -1;

  public boolean isPol5RetHabCombCtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetHabCombCtLmtCdCounter != sharedCounter;
    localPol5RetHabCombCtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_HAB_COMB_CT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetHabCombCtLmtCd */
  protected void serializePol5RetHabCombCtLmtCd(char[] pol5RetHabCombCtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetHabCombCtLmtCd,
        0,
        getStringValue(),
        beginPol5RetHabCombCtLmtCd,
        POL_5_RET_HAB_COMB_CT_LMT_CD_LEN);
    localPol5RetHabCombCtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetHabCombCtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetHabCombCtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetHabCombCtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetHabCombCtLmtCd,
        beginPol5RetHabCombCtLmtCd + POL_5_RET_HAB_COMB_CT_LMT_CD_LEN));
  }

  int localPol5RetHabCombMtLmtCdCounter = -1;

  public boolean isPol5RetHabCombMtLmtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol5RetHabCombMtLmtCdCounter != sharedCounter;
    localPol5RetHabCombMtLmtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_5_RET_HAB_COMB_MT_LMT_CD_LEN = 2;
  /** serialize this Pol5RetHabCombMtLmtCd */
  protected void serializePol5RetHabCombMtLmtCd(char[] pol5RetHabCombMtLmtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol5RetHabCombMtLmtCd,
        0,
        getStringValue(),
        beginPol5RetHabCombMtLmtCd,
        POL_5_RET_HAB_COMB_MT_LMT_CD_LEN);
    localPol5RetHabCombMtLmtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol5RetHabCombMtLmtCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol5RetHabCombMtLmtCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol5RetHabCombMtLmtCd() {
    return (substring(
        getStringValue(),
        beginPol5RetHabCombMtLmtCd,
        beginPol5RetHabCombMtLmtCd + POL_5_RET_HAB_COMB_MT_LMT_CD_LEN));
  }
}
