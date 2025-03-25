package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class PolRetArea3Serialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolRetArea3Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(PolRetArea3Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_RET_AREA_3_LENGTH = 430;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPolStdPolNbr;
  protected int beginPolStdPlnNbr;
  protected int beginPolRetNewOldSrvcInd;
  protected int beginPolRetSviTblPriNbr;
  protected int beginPolRetSlotTblId;
  protected int beginPolRetObligId;
  protected int beginPolRetShrArngCd;
  protected int beginPolRetFundTypCd;
  protected int beginPolRetPrdctKeyCd;
  protected int beginPolRetMbrPrdctTypCd;
  protected int beginPolRetSviTblTerNbr;
  protected int beginPolNtfyCrdcEpInd;
  protected int beginPolOncPolPrtcpCd;
  protected int beginPolEvdBasDialgInd;
  protected int beginPolCoreMedPrrAuthCd;
  protected int beginPolRelSrvcInd;
  protected int beginPolGenPolPrtcpCd;
  protected int beginPolSecOpinVendCd;
  protected int beginPolRetBhvHlthVendCd;
  protected int beginPolRetSlot001;
  protected int beginPolRetEff001;
  protected int beginPolRetCanc001;
  protected int beginPolRetSlot002;
  protected int beginPolRetEff002;
  protected int beginPolRetCanc002;
  protected int beginPolRetSlot003;
  protected int beginPolRetEff003;
  protected int beginPolRetCanc003;
  protected int beginPolRetSlot004;
  protected int beginPolRetEff004;
  protected int beginPolRetCanc004;
  protected int beginPolRetSlot005;
  protected int beginPolRetEff005;
  protected int beginPolRetCanc005;
  protected int beginPolRetSlot006;
  protected int beginPolRetEff006;
  protected int beginPolRetCanc006;
  protected int beginPolRetSlot007;
  protected int beginPolRetEff007;
  protected int beginPolRetCanc007;
  protected int beginPolRetSlot008;
  protected int beginPolRetEff008;
  protected int beginPolRetCanc008;
  protected int beginPolRetSlot009;
  protected int beginPolRetEff009;
  protected int beginPolRetCanc009;
  protected int beginPolRetSlot010;
  protected int beginPolRetEff010;
  protected int beginPolRetCanc010;
  protected int beginPolRetSlot011;
  protected int beginPolRetEff011;
  protected int beginPolRetCanc011;
  protected int beginPolRetSlot012;
  protected int beginPolRetEff012;
  protected int beginPolRetCanc012;
  protected int beginPolRetSlot013;
  protected int beginPolRetEff013;
  protected int beginPolRetCanc013;
  protected int beginPolRetSlot014;
  protected int beginPolRetEff014;
  protected int beginPolRetCanc014;
  protected int beginPolRetSlot018;
  protected int beginPolRetSlot019;
  protected int beginPolRetSlot020;

  /** Constructor for PolRetArea3Serialized */
  public PolRetArea3Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PolRetArea3Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PolRetArea3Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this PolRetArea3Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this PolRetArea3Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in PolRetArea3Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_RET_AREA_3_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPolStdPolNbr = getStartOffset() + 0; // set offset for serialization

    beginPolStdPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginPolRetNewOldSrvcInd = getStartOffset() + 10; // set offset for serialization

    beginPolRetSviTblPriNbr = getStartOffset() + 11; // set offset for serialization

    beginPolRetSlotTblId = getStartOffset() + 17; // set offset for serialization

    beginPolRetObligId = getStartOffset() + 23; // set offset for serialization

    beginPolRetShrArngCd = getStartOffset() + 25; // set offset for serialization

    beginPolRetFundTypCd = getStartOffset() + 27; // set offset for serialization

    beginPolRetPrdctKeyCd = getStartOffset() + 28; // set offset for serialization

    beginPolRetMbrPrdctTypCd = getStartOffset() + 31; // set offset for serialization

    beginPolRetSviTblTerNbr = getStartOffset() + 34; // set offset for serialization

    beginPolNtfyCrdcEpInd = getStartOffset() + 40; // set offset for serialization

    beginPolOncPolPrtcpCd = getStartOffset() + 41; // set offset for serialization

    beginPolEvdBasDialgInd = getStartOffset() + 42; // set offset for serialization

    beginPolCoreMedPrrAuthCd = getStartOffset() + 43; // set offset for serialization

    beginPolRelSrvcInd = getStartOffset() + 44; // set offset for serialization

    beginPolGenPolPrtcpCd = getStartOffset() + 45; // set offset for serialization

    beginPolSecOpinVendCd = getStartOffset() + 46; // set offset for serialization

    beginPolRetBhvHlthVendCd = getStartOffset() + 47; // set offset for serialization

    beginPolRetSlot001 = getStartOffset() + 48; // set offset for serialization

    beginPolRetEff001 = getStartOffset() + 54; // set offset for serialization

    beginPolRetCanc001 = getStartOffset() + 64; // set offset for serialization

    beginPolRetSlot002 = getStartOffset() + 74; // set offset for serialization

    beginPolRetEff002 = getStartOffset() + 80; // set offset for serialization

    beginPolRetCanc002 = getStartOffset() + 90; // set offset for serialization

    beginPolRetSlot003 = getStartOffset() + 100; // set offset for serialization

    beginPolRetEff003 = getStartOffset() + 106; // set offset for serialization

    beginPolRetCanc003 = getStartOffset() + 116; // set offset for serialization

    beginPolRetSlot004 = getStartOffset() + 126; // set offset for serialization

    beginPolRetEff004 = getStartOffset() + 132; // set offset for serialization

    beginPolRetCanc004 = getStartOffset() + 142; // set offset for serialization

    beginPolRetSlot005 = getStartOffset() + 152; // set offset for serialization

    beginPolRetEff005 = getStartOffset() + 158; // set offset for serialization

    beginPolRetCanc005 = getStartOffset() + 168; // set offset for serialization

    beginPolRetSlot006 = getStartOffset() + 178; // set offset for serialization

    beginPolRetEff006 = getStartOffset() + 184; // set offset for serialization

    beginPolRetCanc006 = getStartOffset() + 194; // set offset for serialization

    beginPolRetSlot007 = getStartOffset() + 204; // set offset for serialization

    beginPolRetEff007 = getStartOffset() + 210; // set offset for serialization

    beginPolRetCanc007 = getStartOffset() + 220; // set offset for serialization

    beginPolRetSlot008 = getStartOffset() + 230; // set offset for serialization

    beginPolRetEff008 = getStartOffset() + 236; // set offset for serialization

    beginPolRetCanc008 = getStartOffset() + 246; // set offset for serialization

    beginPolRetSlot009 = getStartOffset() + 256; // set offset for serialization

    beginPolRetEff009 = getStartOffset() + 262; // set offset for serialization

    beginPolRetCanc009 = getStartOffset() + 272; // set offset for serialization

    beginPolRetSlot010 = getStartOffset() + 282; // set offset for serialization

    beginPolRetEff010 = getStartOffset() + 288; // set offset for serialization

    beginPolRetCanc010 = getStartOffset() + 298; // set offset for serialization

    beginPolRetSlot011 = getStartOffset() + 308; // set offset for serialization

    beginPolRetEff011 = getStartOffset() + 314; // set offset for serialization

    beginPolRetCanc011 = getStartOffset() + 324; // set offset for serialization

    beginPolRetSlot012 = getStartOffset() + 334; // set offset for serialization

    beginPolRetEff012 = getStartOffset() + 340; // set offset for serialization

    beginPolRetCanc012 = getStartOffset() + 350; // set offset for serialization

    beginPolRetSlot013 = getStartOffset() + 360; // set offset for serialization

    beginPolRetEff013 = getStartOffset() + 366; // set offset for serialization

    beginPolRetCanc013 = getStartOffset() + 376; // set offset for serialization

    beginPolRetSlot014 = getStartOffset() + 386; // set offset for serialization

    beginPolRetEff014 = getStartOffset() + 392; // set offset for serialization

    beginPolRetCanc014 = getStartOffset() + 402; // set offset for serialization

    beginPolRetSlot018 = getStartOffset() + 412; // set offset for serialization

    beginPolRetSlot019 = getStartOffset() + 418; // set offset for serialization

    beginPolRetSlot020 = getStartOffset() + 424; // set offset for serialization

    /*  end of offset */
  }

  int localPolStdPolNbrCounter = -1;

  public boolean isPolStdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolStdPolNbrCounter != sharedCounter;
    localPolStdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_STD_POL_NBR_LEN = 6;
  /** serialize this PolStdPolNbr */
  protected void serializePolStdPolNbr(char[] polStdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polStdPolNbr, 0, getStringValue(), beginPolStdPolNbr, POL_STD_POL_NBR_LEN);
    localPolStdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolStdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolStdPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolStdPolNbr() {
    return (substring(
        getStringValue(), beginPolStdPolNbr, beginPolStdPolNbr + POL_STD_POL_NBR_LEN));
  }

  int localPolStdPlnNbrCounter = -1;

  public boolean isPolStdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolStdPlnNbrCounter != sharedCounter;
    localPolStdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of polStdPlnNbr
   *
   * @return polStdPlnNbr
   */
  public char[] getPolStdPlnNbrString() {
    return getCharArray(beginPolStdPlnNbr, POL_STD_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean polStdPlnNbrIsNumeric() {
    return isNumeric(
        beginPolStdPlnNbr,
        beginPolStdPlnNbr + POL_STD_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_STD_PLN_NBR_LEN = 4;
  /** serializePolStdPlnNbr */
  protected void serializePolStdPlnNbr(int polStdPlnNbr) {
    putNumber(
        beginPolStdPlnNbr,
        polStdPlnNbr,
        POL_STD_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPolStdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePolStdPlnNbr */
  protected int serializePolStdPlnNbr(char[] value) {
    int polStdPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    polStdPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPolStdPlnNbr, 4);
    localPolStdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return polStdPlnNbr;
  }

  protected int checkPolStdPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPolStdPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPolStdPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPolStdPlnNbr,
          POL_STD_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("polStdPlnNbr", beginPolStdPlnNbr, POL_STD_PLN_NBR_LEN);
    }
  }

  int localPolRetNewOldSrvcIndCounter = -1;

  public boolean isPolRetNewOldSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetNewOldSrvcIndCounter != sharedCounter;
    localPolRetNewOldSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_NEW_OLD_SRVC_IND_LEN = 1;
  /** serialize this PolRetNewOldSrvcInd */
  protected void serializePolRetNewOldSrvcInd(char[] polRetNewOldSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polRetNewOldSrvcInd,
        0,
        getStringValue(),
        beginPolRetNewOldSrvcInd,
        POL_RET_NEW_OLD_SRVC_IND_LEN);
    localPolRetNewOldSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetNewOldSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolRetNewOldSrvcInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPolRetNewOldSrvcInd() {
    return (substring(
        getStringValue(),
        beginPolRetNewOldSrvcInd,
        beginPolRetNewOldSrvcInd + POL_RET_NEW_OLD_SRVC_IND_LEN));
  }

  int localPolRetSviTblPriNbrCounter = -1;

  public boolean isPolRetSviTblPriNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSviTblPriNbrCounter != sharedCounter;
    localPolRetSviTblPriNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SVI_TBL_PRI_NBR_LEN = 6;
  /** serialize this PolRetSviTblPriNbr */
  protected void serializePolRetSviTblPriNbr(char[] polRetSviTblPriNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polRetSviTblPriNbr,
        0,
        getStringValue(),
        beginPolRetSviTblPriNbr,
        POL_RET_SVI_TBL_PRI_NBR_LEN);
    localPolRetSviTblPriNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSviTblPriNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSviTblPriNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSviTblPriNbr() {
    return (substring(
        getStringValue(),
        beginPolRetSviTblPriNbr,
        beginPolRetSviTblPriNbr + POL_RET_SVI_TBL_PRI_NBR_LEN));
  }

  int localPolRetSlotTblIdCounter = -1;

  public boolean isPolRetSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlotTblIdCounter != sharedCounter;
    localPolRetSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_TBL_ID_LEN = 6;
  /** serialize this PolRetSlotTblId */
  protected void serializePolRetSlotTblId(char[] polRetSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlotTblId, 0, getStringValue(), beginPolRetSlotTblId, POL_RET_SLOT_TBL_ID_LEN);
    localPolRetSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlotTblId() {
    return (substring(
        getStringValue(), beginPolRetSlotTblId, beginPolRetSlotTblId + POL_RET_SLOT_TBL_ID_LEN));
  }

  int localPolRetObligIdCounter = -1;

  public boolean isPolRetObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetObligIdCounter != sharedCounter;
    localPolRetObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_OBLIG_ID_LEN = 2;
  /** serialize this PolRetObligId */
  protected void serializePolRetObligId(char[] polRetObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetObligId, 0, getStringValue(), beginPolRetObligId, POL_RET_OBLIG_ID_LEN);
    localPolRetObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPolRetObligId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetObligId() {
    return (substring(
        getStringValue(), beginPolRetObligId, beginPolRetObligId + POL_RET_OBLIG_ID_LEN));
  }

  int localPolRetShrArngCdCounter = -1;

  public boolean isPolRetShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetShrArngCdCounter != sharedCounter;
    localPolRetShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SHR_ARNG_CD_LEN = 2;
  /** serialize this PolRetShrArngCd */
  protected void serializePolRetShrArngCd(char[] polRetShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetShrArngCd, 0, getStringValue(), beginPolRetShrArngCd, POL_RET_SHR_ARNG_CD_LEN);
    localPolRetShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPolRetShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetShrArngCd() {
    return (substring(
        getStringValue(), beginPolRetShrArngCd, beginPolRetShrArngCd + POL_RET_SHR_ARNG_CD_LEN));
  }

  int localPolRetFundTypCdCounter = -1;

  public boolean isPolRetFundTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetFundTypCdCounter != sharedCounter;
    localPolRetFundTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_FUND_TYP_CD_LEN = 1;
  /** serialize this PolRetFundTypCd */
  protected void serializePolRetFundTypCd(char[] polRetFundTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetFundTypCd, 0, getStringValue(), beginPolRetFundTypCd, POL_RET_FUND_TYP_CD_LEN);
    localPolRetFundTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetFundTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolRetFundTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetFundTypCd() {
    return (substring(
        getStringValue(), beginPolRetFundTypCd, beginPolRetFundTypCd + POL_RET_FUND_TYP_CD_LEN));
  }

  int localPolRetPrdctKeyCdCounter = -1;

  public boolean isPolRetPrdctKeyCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetPrdctKeyCdCounter != sharedCounter;
    localPolRetPrdctKeyCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_PRDCT_KEY_CD_LEN = 3;
  /** serialize this PolRetPrdctKeyCd */
  protected void serializePolRetPrdctKeyCd(char[] polRetPrdctKeyCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polRetPrdctKeyCd, 0, getStringValue(), beginPolRetPrdctKeyCd, POL_RET_PRDCT_KEY_CD_LEN);
    localPolRetPrdctKeyCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetPrdctKeyCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPolRetPrdctKeyCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetPrdctKeyCd() {
    return (substring(
        getStringValue(), beginPolRetPrdctKeyCd, beginPolRetPrdctKeyCd + POL_RET_PRDCT_KEY_CD_LEN));
  }

  int localPolRetMbrPrdctTypCdCounter = -1;

  public boolean isPolRetMbrPrdctTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetMbrPrdctTypCdCounter != sharedCounter;
    localPolRetMbrPrdctTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_MBR_PRDCT_TYP_CD_LEN = 3;
  /** serialize this PolRetMbrPrdctTypCd */
  protected void serializePolRetMbrPrdctTypCd(char[] polRetMbrPrdctTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polRetMbrPrdctTypCd,
        0,
        getStringValue(),
        beginPolRetMbrPrdctTypCd,
        POL_RET_MBR_PRDCT_TYP_CD_LEN);
    localPolRetMbrPrdctTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetMbrPrdctTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPolRetMbrPrdctTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPolRetMbrPrdctTypCd() {
    return (substring(
        getStringValue(),
        beginPolRetMbrPrdctTypCd,
        beginPolRetMbrPrdctTypCd + POL_RET_MBR_PRDCT_TYP_CD_LEN));
  }

  int localPolRetSviTblTerNbrCounter = -1;

  public boolean isPolRetSviTblTerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSviTblTerNbrCounter != sharedCounter;
    localPolRetSviTblTerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SVI_TBL_TER_NBR_LEN = 6;
  /** serialize this PolRetSviTblTerNbr */
  protected void serializePolRetSviTblTerNbr(char[] polRetSviTblTerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polRetSviTblTerNbr,
        0,
        getStringValue(),
        beginPolRetSviTblTerNbr,
        POL_RET_SVI_TBL_TER_NBR_LEN);
    localPolRetSviTblTerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSviTblTerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSviTblTerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSviTblTerNbr() {
    return (substring(
        getStringValue(),
        beginPolRetSviTblTerNbr,
        beginPolRetSviTblTerNbr + POL_RET_SVI_TBL_TER_NBR_LEN));
  }

  int localPolNtfyCrdcEpIndCounter = -1;

  public boolean isPolNtfyCrdcEpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolNtfyCrdcEpIndCounter != sharedCounter;
    localPolNtfyCrdcEpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_NTFY_CRDC_EP_IND_LEN = 1;
  /** serialize this PolNtfyCrdcEpInd */
  protected void serializePolNtfyCrdcEpInd(char[] polNtfyCrdcEpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polNtfyCrdcEpInd, 0, getStringValue(), beginPolNtfyCrdcEpInd, POL_NTFY_CRDC_EP_IND_LEN);
    localPolNtfyCrdcEpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolNtfyCrdcEpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolNtfyCrdcEpInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolNtfyCrdcEpInd() {
    return (substring(
        getStringValue(), beginPolNtfyCrdcEpInd, beginPolNtfyCrdcEpInd + POL_NTFY_CRDC_EP_IND_LEN));
  }

  int localPolOncPolPrtcpCdCounter = -1;

  public boolean isPolOncPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolOncPolPrtcpCdCounter != sharedCounter;
    localPolOncPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_ONC_POL_PRTCP_CD_LEN = 1;
  /** serialize this PolOncPolPrtcpCd */
  protected void serializePolOncPolPrtcpCd(char[] polOncPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polOncPolPrtcpCd, 0, getStringValue(), beginPolOncPolPrtcpCd, POL_ONC_POL_PRTCP_CD_LEN);
    localPolOncPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolOncPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolOncPolPrtcpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolOncPolPrtcpCd() {
    return (substring(
        getStringValue(), beginPolOncPolPrtcpCd, beginPolOncPolPrtcpCd + POL_ONC_POL_PRTCP_CD_LEN));
  }

  int localPolEvdBasDialgIndCounter = -1;

  public boolean isPolEvdBasDialgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolEvdBasDialgIndCounter != sharedCounter;
    localPolEvdBasDialgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_EVD_BAS_DIALG_IND_LEN = 1;
  /** serialize this PolEvdBasDialgInd */
  protected void serializePolEvdBasDialgInd(char[] polEvdBasDialgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polEvdBasDialgInd, 0, getStringValue(), beginPolEvdBasDialgInd, POL_EVD_BAS_DIALG_IND_LEN);
    localPolEvdBasDialgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolEvdBasDialgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolEvdBasDialgInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolEvdBasDialgInd() {
    return (substring(
        getStringValue(),
        beginPolEvdBasDialgInd,
        beginPolEvdBasDialgInd + POL_EVD_BAS_DIALG_IND_LEN));
  }

  int localPolCoreMedPrrAuthCdCounter = -1;

  public boolean isPolCoreMedPrrAuthCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolCoreMedPrrAuthCdCounter != sharedCounter;
    localPolCoreMedPrrAuthCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_CORE_MED_PRR_AUTH_CD_LEN = 1;
  /** serialize this PolCoreMedPrrAuthCd */
  protected void serializePolCoreMedPrrAuthCd(char[] polCoreMedPrrAuthCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polCoreMedPrrAuthCd,
        0,
        getStringValue(),
        beginPolCoreMedPrrAuthCd,
        POL_CORE_MED_PRR_AUTH_CD_LEN);
    localPolCoreMedPrrAuthCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolCoreMedPrrAuthCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolCoreMedPrrAuthCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPolCoreMedPrrAuthCd() {
    return (substring(
        getStringValue(),
        beginPolCoreMedPrrAuthCd,
        beginPolCoreMedPrrAuthCd + POL_CORE_MED_PRR_AUTH_CD_LEN));
  }

  int localPolRelSrvcIndCounter = -1;

  public boolean isPolRelSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRelSrvcIndCounter != sharedCounter;
    localPolRelSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_REL_SRVC_IND_LEN = 1;
  /** serialize this PolRelSrvcInd */
  protected void serializePolRelSrvcInd(char[] polRelSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRelSrvcInd, 0, getStringValue(), beginPolRelSrvcInd, POL_REL_SRVC_IND_LEN);
    localPolRelSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRelSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolRelSrvcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRelSrvcInd() {
    return (substring(
        getStringValue(), beginPolRelSrvcInd, beginPolRelSrvcInd + POL_REL_SRVC_IND_LEN));
  }

  int localPolGenPolPrtcpCdCounter = -1;

  public boolean isPolGenPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolGenPolPrtcpCdCounter != sharedCounter;
    localPolGenPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_GEN_POL_PRTCP_CD_LEN = 1;
  /** serialize this PolGenPolPrtcpCd */
  protected void serializePolGenPolPrtcpCd(char[] polGenPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polGenPolPrtcpCd, 0, getStringValue(), beginPolGenPolPrtcpCd, POL_GEN_POL_PRTCP_CD_LEN);
    localPolGenPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolGenPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolGenPolPrtcpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolGenPolPrtcpCd() {
    return (substring(
        getStringValue(), beginPolGenPolPrtcpCd, beginPolGenPolPrtcpCd + POL_GEN_POL_PRTCP_CD_LEN));
  }

  int localPolSecOpinVendCdCounter = -1;

  public boolean isPolSecOpinVendCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolSecOpinVendCdCounter != sharedCounter;
    localPolSecOpinVendCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_SEC_OPIN_VEND_CD_LEN = 1;
  /** serialize this PolSecOpinVendCd */
  protected void serializePolSecOpinVendCd(char[] polSecOpinVendCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polSecOpinVendCd, 0, getStringValue(), beginPolSecOpinVendCd, POL_SEC_OPIN_VEND_CD_LEN);
    localPolSecOpinVendCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolSecOpinVendCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolSecOpinVendCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolSecOpinVendCd() {
    return (substring(
        getStringValue(), beginPolSecOpinVendCd, beginPolSecOpinVendCd + POL_SEC_OPIN_VEND_CD_LEN));
  }

  int localPolRetBhvHlthVendCdCounter = -1;

  public boolean isPolRetBhvHlthVendCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetBhvHlthVendCdCounter != sharedCounter;
    localPolRetBhvHlthVendCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_BHV_HLTH_VEND_CD_LEN = 1;
  /** serialize this PolRetBhvHlthVendCd */
  protected void serializePolRetBhvHlthVendCd(char[] polRetBhvHlthVendCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polRetBhvHlthVendCd,
        0,
        getStringValue(),
        beginPolRetBhvHlthVendCd,
        POL_RET_BHV_HLTH_VEND_CD_LEN);
    localPolRetBhvHlthVendCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetBhvHlthVendCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolRetBhvHlthVendCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPolRetBhvHlthVendCd() {
    return (substring(
        getStringValue(),
        beginPolRetBhvHlthVendCd,
        beginPolRetBhvHlthVendCd + POL_RET_BHV_HLTH_VEND_CD_LEN));
  }

  int localPolRetSlot001Counter = -1;

  public boolean isPolRetSlot001Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot001Counter != sharedCounter;
    localPolRetSlot001Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_001_LEN = 6;
  /** serialize this PolRetSlot001 */
  protected void serializePolRetSlot001(char[] polRetSlot001) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot001, 0, getStringValue(), beginPolRetSlot001, POL_RET_SLOT_001_LEN);
    localPolRetSlot001Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot001Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot001 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot001() {
    return (substring(
        getStringValue(), beginPolRetSlot001, beginPolRetSlot001 + POL_RET_SLOT_001_LEN));
  }

  int localPolRetEff001Counter = -1;

  public boolean isPolRetEff001Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff001Counter != sharedCounter;
    localPolRetEff001Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_001_LEN = 10;
  /** serialize this PolRetEff001 */
  protected void serializePolRetEff001(char[] polRetEff001) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff001, 0, getStringValue(), beginPolRetEff001, POL_RET_EFF_001_LEN);
    localPolRetEff001Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff001Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff001 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff001() {
    return (substring(
        getStringValue(), beginPolRetEff001, beginPolRetEff001 + POL_RET_EFF_001_LEN));
  }

  int localPolRetCanc001Counter = -1;

  public boolean isPolRetCanc001Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc001Counter != sharedCounter;
    localPolRetCanc001Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_001_LEN = 10;
  /** serialize this PolRetCanc001 */
  protected void serializePolRetCanc001(char[] polRetCanc001) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc001, 0, getStringValue(), beginPolRetCanc001, POL_RET_CANC_001_LEN);
    localPolRetCanc001Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc001Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc001 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc001() {
    return (substring(
        getStringValue(), beginPolRetCanc001, beginPolRetCanc001 + POL_RET_CANC_001_LEN));
  }

  int localPolRetSlot002Counter = -1;

  public boolean isPolRetSlot002Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot002Counter != sharedCounter;
    localPolRetSlot002Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_002_LEN = 6;
  /** serialize this PolRetSlot002 */
  protected void serializePolRetSlot002(char[] polRetSlot002) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot002, 0, getStringValue(), beginPolRetSlot002, POL_RET_SLOT_002_LEN);
    localPolRetSlot002Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot002Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot002 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot002() {
    return (substring(
        getStringValue(), beginPolRetSlot002, beginPolRetSlot002 + POL_RET_SLOT_002_LEN));
  }

  int localPolRetEff002Counter = -1;

  public boolean isPolRetEff002Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff002Counter != sharedCounter;
    localPolRetEff002Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_002_LEN = 10;
  /** serialize this PolRetEff002 */
  protected void serializePolRetEff002(char[] polRetEff002) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff002, 0, getStringValue(), beginPolRetEff002, POL_RET_EFF_002_LEN);
    localPolRetEff002Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff002Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff002 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff002() {
    return (substring(
        getStringValue(), beginPolRetEff002, beginPolRetEff002 + POL_RET_EFF_002_LEN));
  }

  int localPolRetCanc002Counter = -1;

  public boolean isPolRetCanc002Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc002Counter != sharedCounter;
    localPolRetCanc002Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_002_LEN = 10;
  /** serialize this PolRetCanc002 */
  protected void serializePolRetCanc002(char[] polRetCanc002) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc002, 0, getStringValue(), beginPolRetCanc002, POL_RET_CANC_002_LEN);
    localPolRetCanc002Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc002Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc002 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc002() {
    return (substring(
        getStringValue(), beginPolRetCanc002, beginPolRetCanc002 + POL_RET_CANC_002_LEN));
  }

  int localPolRetSlot003Counter = -1;

  public boolean isPolRetSlot003Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot003Counter != sharedCounter;
    localPolRetSlot003Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_003_LEN = 6;
  /** serialize this PolRetSlot003 */
  protected void serializePolRetSlot003(char[] polRetSlot003) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot003, 0, getStringValue(), beginPolRetSlot003, POL_RET_SLOT_003_LEN);
    localPolRetSlot003Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot003Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot003 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot003() {
    return (substring(
        getStringValue(), beginPolRetSlot003, beginPolRetSlot003 + POL_RET_SLOT_003_LEN));
  }

  int localPolRetEff003Counter = -1;

  public boolean isPolRetEff003Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff003Counter != sharedCounter;
    localPolRetEff003Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_003_LEN = 10;
  /** serialize this PolRetEff003 */
  protected void serializePolRetEff003(char[] polRetEff003) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff003, 0, getStringValue(), beginPolRetEff003, POL_RET_EFF_003_LEN);
    localPolRetEff003Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff003Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff003 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff003() {
    return (substring(
        getStringValue(), beginPolRetEff003, beginPolRetEff003 + POL_RET_EFF_003_LEN));
  }

  int localPolRetCanc003Counter = -1;

  public boolean isPolRetCanc003Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc003Counter != sharedCounter;
    localPolRetCanc003Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_003_LEN = 10;
  /** serialize this PolRetCanc003 */
  protected void serializePolRetCanc003(char[] polRetCanc003) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc003, 0, getStringValue(), beginPolRetCanc003, POL_RET_CANC_003_LEN);
    localPolRetCanc003Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc003Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc003 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc003() {
    return (substring(
        getStringValue(), beginPolRetCanc003, beginPolRetCanc003 + POL_RET_CANC_003_LEN));
  }

  int localPolRetSlot004Counter = -1;

  public boolean isPolRetSlot004Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot004Counter != sharedCounter;
    localPolRetSlot004Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_004_LEN = 6;
  /** serialize this PolRetSlot004 */
  protected void serializePolRetSlot004(char[] polRetSlot004) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot004, 0, getStringValue(), beginPolRetSlot004, POL_RET_SLOT_004_LEN);
    localPolRetSlot004Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot004Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot004 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot004() {
    return (substring(
        getStringValue(), beginPolRetSlot004, beginPolRetSlot004 + POL_RET_SLOT_004_LEN));
  }

  int localPolRetEff004Counter = -1;

  public boolean isPolRetEff004Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff004Counter != sharedCounter;
    localPolRetEff004Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_004_LEN = 10;
  /** serialize this PolRetEff004 */
  protected void serializePolRetEff004(char[] polRetEff004) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff004, 0, getStringValue(), beginPolRetEff004, POL_RET_EFF_004_LEN);
    localPolRetEff004Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff004Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff004 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff004() {
    return (substring(
        getStringValue(), beginPolRetEff004, beginPolRetEff004 + POL_RET_EFF_004_LEN));
  }

  int localPolRetCanc004Counter = -1;

  public boolean isPolRetCanc004Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc004Counter != sharedCounter;
    localPolRetCanc004Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_004_LEN = 10;
  /** serialize this PolRetCanc004 */
  protected void serializePolRetCanc004(char[] polRetCanc004) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc004, 0, getStringValue(), beginPolRetCanc004, POL_RET_CANC_004_LEN);
    localPolRetCanc004Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc004Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc004 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc004() {
    return (substring(
        getStringValue(), beginPolRetCanc004, beginPolRetCanc004 + POL_RET_CANC_004_LEN));
  }

  int localPolRetSlot005Counter = -1;

  public boolean isPolRetSlot005Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot005Counter != sharedCounter;
    localPolRetSlot005Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_005_LEN = 6;
  /** serialize this PolRetSlot005 */
  protected void serializePolRetSlot005(char[] polRetSlot005) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot005, 0, getStringValue(), beginPolRetSlot005, POL_RET_SLOT_005_LEN);
    localPolRetSlot005Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot005Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot005 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot005() {
    return (substring(
        getStringValue(), beginPolRetSlot005, beginPolRetSlot005 + POL_RET_SLOT_005_LEN));
  }

  int localPolRetEff005Counter = -1;

  public boolean isPolRetEff005Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff005Counter != sharedCounter;
    localPolRetEff005Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_005_LEN = 10;
  /** serialize this PolRetEff005 */
  protected void serializePolRetEff005(char[] polRetEff005) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff005, 0, getStringValue(), beginPolRetEff005, POL_RET_EFF_005_LEN);
    localPolRetEff005Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff005Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff005 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff005() {
    return (substring(
        getStringValue(), beginPolRetEff005, beginPolRetEff005 + POL_RET_EFF_005_LEN));
  }

  int localPolRetCanc005Counter = -1;

  public boolean isPolRetCanc005Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc005Counter != sharedCounter;
    localPolRetCanc005Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_005_LEN = 10;
  /** serialize this PolRetCanc005 */
  protected void serializePolRetCanc005(char[] polRetCanc005) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc005, 0, getStringValue(), beginPolRetCanc005, POL_RET_CANC_005_LEN);
    localPolRetCanc005Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc005Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc005 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc005() {
    return (substring(
        getStringValue(), beginPolRetCanc005, beginPolRetCanc005 + POL_RET_CANC_005_LEN));
  }

  int localPolRetSlot006Counter = -1;

  public boolean isPolRetSlot006Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot006Counter != sharedCounter;
    localPolRetSlot006Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_006_LEN = 6;
  /** serialize this PolRetSlot006 */
  protected void serializePolRetSlot006(char[] polRetSlot006) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot006, 0, getStringValue(), beginPolRetSlot006, POL_RET_SLOT_006_LEN);
    localPolRetSlot006Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot006Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot006 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot006() {
    return (substring(
        getStringValue(), beginPolRetSlot006, beginPolRetSlot006 + POL_RET_SLOT_006_LEN));
  }

  int localPolRetEff006Counter = -1;

  public boolean isPolRetEff006Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff006Counter != sharedCounter;
    localPolRetEff006Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_006_LEN = 10;
  /** serialize this PolRetEff006 */
  protected void serializePolRetEff006(char[] polRetEff006) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff006, 0, getStringValue(), beginPolRetEff006, POL_RET_EFF_006_LEN);
    localPolRetEff006Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff006Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff006 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff006() {
    return (substring(
        getStringValue(), beginPolRetEff006, beginPolRetEff006 + POL_RET_EFF_006_LEN));
  }

  int localPolRetCanc006Counter = -1;

  public boolean isPolRetCanc006Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc006Counter != sharedCounter;
    localPolRetCanc006Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_006_LEN = 10;
  /** serialize this PolRetCanc006 */
  protected void serializePolRetCanc006(char[] polRetCanc006) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc006, 0, getStringValue(), beginPolRetCanc006, POL_RET_CANC_006_LEN);
    localPolRetCanc006Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc006Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc006 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc006() {
    return (substring(
        getStringValue(), beginPolRetCanc006, beginPolRetCanc006 + POL_RET_CANC_006_LEN));
  }

  int localPolRetSlot007Counter = -1;

  public boolean isPolRetSlot007Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot007Counter != sharedCounter;
    localPolRetSlot007Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_007_LEN = 6;
  /** serialize this PolRetSlot007 */
  protected void serializePolRetSlot007(char[] polRetSlot007) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot007, 0, getStringValue(), beginPolRetSlot007, POL_RET_SLOT_007_LEN);
    localPolRetSlot007Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot007Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot007 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot007() {
    return (substring(
        getStringValue(), beginPolRetSlot007, beginPolRetSlot007 + POL_RET_SLOT_007_LEN));
  }

  int localPolRetEff007Counter = -1;

  public boolean isPolRetEff007Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff007Counter != sharedCounter;
    localPolRetEff007Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_007_LEN = 10;
  /** serialize this PolRetEff007 */
  protected void serializePolRetEff007(char[] polRetEff007) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff007, 0, getStringValue(), beginPolRetEff007, POL_RET_EFF_007_LEN);
    localPolRetEff007Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff007Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff007 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff007() {
    return (substring(
        getStringValue(), beginPolRetEff007, beginPolRetEff007 + POL_RET_EFF_007_LEN));
  }

  int localPolRetCanc007Counter = -1;

  public boolean isPolRetCanc007Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc007Counter != sharedCounter;
    localPolRetCanc007Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_007_LEN = 10;
  /** serialize this PolRetCanc007 */
  protected void serializePolRetCanc007(char[] polRetCanc007) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc007, 0, getStringValue(), beginPolRetCanc007, POL_RET_CANC_007_LEN);
    localPolRetCanc007Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc007Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc007 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc007() {
    return (substring(
        getStringValue(), beginPolRetCanc007, beginPolRetCanc007 + POL_RET_CANC_007_LEN));
  }

  int localPolRetSlot008Counter = -1;

  public boolean isPolRetSlot008Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot008Counter != sharedCounter;
    localPolRetSlot008Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_008_LEN = 6;
  /** serialize this PolRetSlot008 */
  protected void serializePolRetSlot008(char[] polRetSlot008) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot008, 0, getStringValue(), beginPolRetSlot008, POL_RET_SLOT_008_LEN);
    localPolRetSlot008Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot008Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot008 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot008() {
    return (substring(
        getStringValue(), beginPolRetSlot008, beginPolRetSlot008 + POL_RET_SLOT_008_LEN));
  }

  int localPolRetEff008Counter = -1;

  public boolean isPolRetEff008Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff008Counter != sharedCounter;
    localPolRetEff008Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_008_LEN = 10;
  /** serialize this PolRetEff008 */
  protected void serializePolRetEff008(char[] polRetEff008) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff008, 0, getStringValue(), beginPolRetEff008, POL_RET_EFF_008_LEN);
    localPolRetEff008Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff008Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff008 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff008() {
    return (substring(
        getStringValue(), beginPolRetEff008, beginPolRetEff008 + POL_RET_EFF_008_LEN));
  }

  int localPolRetCanc008Counter = -1;

  public boolean isPolRetCanc008Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc008Counter != sharedCounter;
    localPolRetCanc008Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_008_LEN = 10;
  /** serialize this PolRetCanc008 */
  protected void serializePolRetCanc008(char[] polRetCanc008) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc008, 0, getStringValue(), beginPolRetCanc008, POL_RET_CANC_008_LEN);
    localPolRetCanc008Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc008Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc008 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc008() {
    return (substring(
        getStringValue(), beginPolRetCanc008, beginPolRetCanc008 + POL_RET_CANC_008_LEN));
  }

  int localPolRetSlot009Counter = -1;

  public boolean isPolRetSlot009Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot009Counter != sharedCounter;
    localPolRetSlot009Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_009_LEN = 6;
  /** serialize this PolRetSlot009 */
  protected void serializePolRetSlot009(char[] polRetSlot009) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot009, 0, getStringValue(), beginPolRetSlot009, POL_RET_SLOT_009_LEN);
    localPolRetSlot009Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot009Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot009 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot009() {
    return (substring(
        getStringValue(), beginPolRetSlot009, beginPolRetSlot009 + POL_RET_SLOT_009_LEN));
  }

  int localPolRetEff009Counter = -1;

  public boolean isPolRetEff009Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff009Counter != sharedCounter;
    localPolRetEff009Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_009_LEN = 10;
  /** serialize this PolRetEff009 */
  protected void serializePolRetEff009(char[] polRetEff009) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff009, 0, getStringValue(), beginPolRetEff009, POL_RET_EFF_009_LEN);
    localPolRetEff009Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff009Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff009 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff009() {
    return (substring(
        getStringValue(), beginPolRetEff009, beginPolRetEff009 + POL_RET_EFF_009_LEN));
  }

  int localPolRetCanc009Counter = -1;

  public boolean isPolRetCanc009Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc009Counter != sharedCounter;
    localPolRetCanc009Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_009_LEN = 10;
  /** serialize this PolRetCanc009 */
  protected void serializePolRetCanc009(char[] polRetCanc009) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc009, 0, getStringValue(), beginPolRetCanc009, POL_RET_CANC_009_LEN);
    localPolRetCanc009Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc009Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc009 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc009() {
    return (substring(
        getStringValue(), beginPolRetCanc009, beginPolRetCanc009 + POL_RET_CANC_009_LEN));
  }

  int localPolRetSlot010Counter = -1;

  public boolean isPolRetSlot010Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot010Counter != sharedCounter;
    localPolRetSlot010Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_010_LEN = 6;
  /** serialize this PolRetSlot010 */
  protected void serializePolRetSlot010(char[] polRetSlot010) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot010, 0, getStringValue(), beginPolRetSlot010, POL_RET_SLOT_010_LEN);
    localPolRetSlot010Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot010Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot010 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot010() {
    return (substring(
        getStringValue(), beginPolRetSlot010, beginPolRetSlot010 + POL_RET_SLOT_010_LEN));
  }

  int localPolRetEff010Counter = -1;

  public boolean isPolRetEff010Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff010Counter != sharedCounter;
    localPolRetEff010Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_010_LEN = 10;
  /** serialize this PolRetEff010 */
  protected void serializePolRetEff010(char[] polRetEff010) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff010, 0, getStringValue(), beginPolRetEff010, POL_RET_EFF_010_LEN);
    localPolRetEff010Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff010Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff010 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff010() {
    return (substring(
        getStringValue(), beginPolRetEff010, beginPolRetEff010 + POL_RET_EFF_010_LEN));
  }

  int localPolRetCanc010Counter = -1;

  public boolean isPolRetCanc010Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc010Counter != sharedCounter;
    localPolRetCanc010Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_010_LEN = 10;
  /** serialize this PolRetCanc010 */
  protected void serializePolRetCanc010(char[] polRetCanc010) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc010, 0, getStringValue(), beginPolRetCanc010, POL_RET_CANC_010_LEN);
    localPolRetCanc010Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc010Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc010 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc010() {
    return (substring(
        getStringValue(), beginPolRetCanc010, beginPolRetCanc010 + POL_RET_CANC_010_LEN));
  }

  int localPolRetSlot011Counter = -1;

  public boolean isPolRetSlot011Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot011Counter != sharedCounter;
    localPolRetSlot011Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_011_LEN = 6;
  /** serialize this PolRetSlot011 */
  protected void serializePolRetSlot011(char[] polRetSlot011) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot011, 0, getStringValue(), beginPolRetSlot011, POL_RET_SLOT_011_LEN);
    localPolRetSlot011Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot011Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot011 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot011() {
    return (substring(
        getStringValue(), beginPolRetSlot011, beginPolRetSlot011 + POL_RET_SLOT_011_LEN));
  }

  int localPolRetEff011Counter = -1;

  public boolean isPolRetEff011Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff011Counter != sharedCounter;
    localPolRetEff011Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_011_LEN = 10;
  /** serialize this PolRetEff011 */
  protected void serializePolRetEff011(char[] polRetEff011) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff011, 0, getStringValue(), beginPolRetEff011, POL_RET_EFF_011_LEN);
    localPolRetEff011Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff011Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff011 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff011() {
    return (substring(
        getStringValue(), beginPolRetEff011, beginPolRetEff011 + POL_RET_EFF_011_LEN));
  }

  int localPolRetCanc011Counter = -1;

  public boolean isPolRetCanc011Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc011Counter != sharedCounter;
    localPolRetCanc011Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_011_LEN = 10;
  /** serialize this PolRetCanc011 */
  protected void serializePolRetCanc011(char[] polRetCanc011) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc011, 0, getStringValue(), beginPolRetCanc011, POL_RET_CANC_011_LEN);
    localPolRetCanc011Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc011Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc011 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc011() {
    return (substring(
        getStringValue(), beginPolRetCanc011, beginPolRetCanc011 + POL_RET_CANC_011_LEN));
  }

  int localPolRetSlot012Counter = -1;

  public boolean isPolRetSlot012Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot012Counter != sharedCounter;
    localPolRetSlot012Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_012_LEN = 6;
  /** serialize this PolRetSlot012 */
  protected void serializePolRetSlot012(char[] polRetSlot012) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot012, 0, getStringValue(), beginPolRetSlot012, POL_RET_SLOT_012_LEN);
    localPolRetSlot012Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot012Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot012 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot012() {
    return (substring(
        getStringValue(), beginPolRetSlot012, beginPolRetSlot012 + POL_RET_SLOT_012_LEN));
  }

  int localPolRetEff012Counter = -1;

  public boolean isPolRetEff012Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff012Counter != sharedCounter;
    localPolRetEff012Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_012_LEN = 10;
  /** serialize this PolRetEff012 */
  protected void serializePolRetEff012(char[] polRetEff012) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff012, 0, getStringValue(), beginPolRetEff012, POL_RET_EFF_012_LEN);
    localPolRetEff012Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff012Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff012 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff012() {
    return (substring(
        getStringValue(), beginPolRetEff012, beginPolRetEff012 + POL_RET_EFF_012_LEN));
  }

  int localPolRetCanc012Counter = -1;

  public boolean isPolRetCanc012Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc012Counter != sharedCounter;
    localPolRetCanc012Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_012_LEN = 10;
  /** serialize this PolRetCanc012 */
  protected void serializePolRetCanc012(char[] polRetCanc012) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc012, 0, getStringValue(), beginPolRetCanc012, POL_RET_CANC_012_LEN);
    localPolRetCanc012Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc012Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc012 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc012() {
    return (substring(
        getStringValue(), beginPolRetCanc012, beginPolRetCanc012 + POL_RET_CANC_012_LEN));
  }

  int localPolRetSlot013Counter = -1;

  public boolean isPolRetSlot013Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot013Counter != sharedCounter;
    localPolRetSlot013Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_013_LEN = 6;
  /** serialize this PolRetSlot013 */
  protected void serializePolRetSlot013(char[] polRetSlot013) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot013, 0, getStringValue(), beginPolRetSlot013, POL_RET_SLOT_013_LEN);
    localPolRetSlot013Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot013Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot013 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot013() {
    return (substring(
        getStringValue(), beginPolRetSlot013, beginPolRetSlot013 + POL_RET_SLOT_013_LEN));
  }

  int localPolRetEff013Counter = -1;

  public boolean isPolRetEff013Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff013Counter != sharedCounter;
    localPolRetEff013Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_013_LEN = 10;
  /** serialize this PolRetEff013 */
  protected void serializePolRetEff013(char[] polRetEff013) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff013, 0, getStringValue(), beginPolRetEff013, POL_RET_EFF_013_LEN);
    localPolRetEff013Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff013Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff013 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff013() {
    return (substring(
        getStringValue(), beginPolRetEff013, beginPolRetEff013 + POL_RET_EFF_013_LEN));
  }

  int localPolRetCanc013Counter = -1;

  public boolean isPolRetCanc013Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc013Counter != sharedCounter;
    localPolRetCanc013Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_013_LEN = 10;
  /** serialize this PolRetCanc013 */
  protected void serializePolRetCanc013(char[] polRetCanc013) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc013, 0, getStringValue(), beginPolRetCanc013, POL_RET_CANC_013_LEN);
    localPolRetCanc013Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc013Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc013 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc013() {
    return (substring(
        getStringValue(), beginPolRetCanc013, beginPolRetCanc013 + POL_RET_CANC_013_LEN));
  }

  int localPolRetSlot014Counter = -1;

  public boolean isPolRetSlot014Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot014Counter != sharedCounter;
    localPolRetSlot014Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_014_LEN = 6;
  /** serialize this PolRetSlot014 */
  protected void serializePolRetSlot014(char[] polRetSlot014) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot014, 0, getStringValue(), beginPolRetSlot014, POL_RET_SLOT_014_LEN);
    localPolRetSlot014Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot014Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot014 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot014() {
    return (substring(
        getStringValue(), beginPolRetSlot014, beginPolRetSlot014 + POL_RET_SLOT_014_LEN));
  }

  int localPolRetEff014Counter = -1;

  public boolean isPolRetEff014Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetEff014Counter != sharedCounter;
    localPolRetEff014Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_EFF_014_LEN = 10;
  /** serialize this PolRetEff014 */
  protected void serializePolRetEff014(char[] polRetEff014) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetEff014, 0, getStringValue(), beginPolRetEff014, POL_RET_EFF_014_LEN);
    localPolRetEff014Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetEff014Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetEff014 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetEff014() {
    return (substring(
        getStringValue(), beginPolRetEff014, beginPolRetEff014 + POL_RET_EFF_014_LEN));
  }

  int localPolRetCanc014Counter = -1;

  public boolean isPolRetCanc014Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetCanc014Counter != sharedCounter;
    localPolRetCanc014Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_CANC_014_LEN = 10;
  /** serialize this PolRetCanc014 */
  protected void serializePolRetCanc014(char[] polRetCanc014) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetCanc014, 0, getStringValue(), beginPolRetCanc014, POL_RET_CANC_014_LEN);
    localPolRetCanc014Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetCanc014Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolRetCanc014 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetCanc014() {
    return (substring(
        getStringValue(), beginPolRetCanc014, beginPolRetCanc014 + POL_RET_CANC_014_LEN));
  }

  int localPolRetSlot018Counter = -1;

  public boolean isPolRetSlot018Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot018Counter != sharedCounter;
    localPolRetSlot018Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_018_LEN = 6;
  /** serialize this PolRetSlot018 */
  protected void serializePolRetSlot018(char[] polRetSlot018) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot018, 0, getStringValue(), beginPolRetSlot018, POL_RET_SLOT_018_LEN);
    localPolRetSlot018Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot018Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot018 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot018() {
    return (substring(
        getStringValue(), beginPolRetSlot018, beginPolRetSlot018 + POL_RET_SLOT_018_LEN));
  }

  int localPolRetSlot019Counter = -1;

  public boolean isPolRetSlot019Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot019Counter != sharedCounter;
    localPolRetSlot019Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_019_LEN = 6;
  /** serialize this PolRetSlot019 */
  protected void serializePolRetSlot019(char[] polRetSlot019) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot019, 0, getStringValue(), beginPolRetSlot019, POL_RET_SLOT_019_LEN);
    localPolRetSlot019Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot019Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot019 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot019() {
    return (substring(
        getStringValue(), beginPolRetSlot019, beginPolRetSlot019 + POL_RET_SLOT_019_LEN));
  }

  int localPolRetSlot020Counter = -1;

  public boolean isPolRetSlot020Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolRetSlot020Counter != sharedCounter;
    localPolRetSlot020Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_RET_SLOT_020_LEN = 6;
  /** serialize this PolRetSlot020 */
  protected void serializePolRetSlot020(char[] polRetSlot020) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polRetSlot020, 0, getStringValue(), beginPolRetSlot020, POL_RET_SLOT_020_LEN);
    localPolRetSlot020Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolRetSlot020Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolRetSlot020 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolRetSlot020() {
    return (substring(
        getStringValue(), beginPolRetSlot020, beginPolRetSlot020 + POL_RET_SLOT_020_LEN));
  }
}
