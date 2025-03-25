package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol3RetArea3Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol3RetArea3Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol3RetArea3Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_3_RET_AREA_3_LENGTH = 430;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol3StdPolNbr;
  protected int beginPol3StdPlnNbr;
  protected int beginPol3RetNewOldSrvcInd;
  protected int beginPol3RetSviTblPriNbr;
  protected int beginPol3RetSlotTblId;
  protected int beginPol3RetObligId;
  protected int beginPol3RetShrArngCd;
  protected int beginPol3RetFundTypCd;
  protected int beginPol3RetPrdctKeyCd;
  protected int beginPol3RetMbrPrdctTypCd;
  protected int beginPol3RetSviTblTerNbr;
  protected int beginPol3NtfyCrdcEpInd;
  protected int beginPol3OncPolPrtcpCd;
  protected int beginPol3EvdBasDialgInd;
  protected int beginPol3CoreMedPrrAuthCd;
  protected int beginPol3RelSrvcInd;
  protected int beginPol3GenPolPrtcpCd;
  protected int beginPol3SecOpinVendCd;
  protected int beginPol3RetBhvHlthVendCd;
  protected int beginPol3RetSlot001;
  protected int beginPol3RetEff001;
  protected int beginPol3RetCanc001;
  protected int beginPol3RetSlot002;
  protected int beginPol3RetEff002;
  protected int beginPol3RetCanc002;
  protected int beginPol3RetSlot003;
  protected int beginPol3RetEff003;
  protected int beginPol3RetCanc003;
  protected int beginPol3RetSlot004;
  protected int beginPol3RetEff004;
  protected int beginPol3RetCanc004;
  protected int beginPol3RetSlot005;
  protected int beginPol3RetEff005;
  protected int beginPol3RetCanc005;
  protected int beginPol3RetSlot006;
  protected int beginPol3RetEff006;
  protected int beginPol3RetCanc006;
  protected int beginPol3RetSlot007;
  protected int beginPol3RetEff007;
  protected int beginPol3RetCanc007;
  protected int beginPol3RetSlot008;
  protected int beginPol3RetEff008;
  protected int beginPol3RetCanc008;
  protected int beginPol3RetSlot009;
  protected int beginPol3RetEff009;
  protected int beginPol3RetCanc009;
  protected int beginPol3RetSlot010;
  protected int beginPol3RetEff010;
  protected int beginPol3RetCanc010;
  protected int beginPol3RetSlot011;
  protected int beginPol3RetEff011;
  protected int beginPol3RetCanc011;
  protected int beginPol3RetSlot012;
  protected int beginPol3RetEff012;
  protected int beginPol3RetCanc012;
  protected int beginPol3RetSlot013;
  protected int beginPol3RetEff013;
  protected int beginPol3RetCanc013;
  protected int beginPol3RetSlot014;
  protected int beginPol3RetEff014;
  protected int beginPol3RetCanc014;
  protected int beginPol3RetSlot018;
  protected int beginPol3RetSlot019;
  protected int beginPol3RetSlot020;

  /** Constructor for Pol3RetArea3Serialized */
  public Pol3RetArea3Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol3RetArea3Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol3RetArea3Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol3RetArea3Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol3RetArea3Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol3RetArea3Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_3_RET_AREA_3_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol3StdPolNbr = getStartOffset() + 0; // set offset for serialization

    beginPol3StdPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginPol3RetNewOldSrvcInd = getStartOffset() + 10; // set offset for serialization

    beginPol3RetSviTblPriNbr = getStartOffset() + 11; // set offset for serialization

    beginPol3RetSlotTblId = getStartOffset() + 17; // set offset for serialization

    beginPol3RetObligId = getStartOffset() + 23; // set offset for serialization

    beginPol3RetShrArngCd = getStartOffset() + 25; // set offset for serialization

    beginPol3RetFundTypCd = getStartOffset() + 27; // set offset for serialization

    beginPol3RetPrdctKeyCd = getStartOffset() + 28; // set offset for serialization

    beginPol3RetMbrPrdctTypCd = getStartOffset() + 31; // set offset for serialization

    beginPol3RetSviTblTerNbr = getStartOffset() + 34; // set offset for serialization

    beginPol3NtfyCrdcEpInd = getStartOffset() + 40; // set offset for serialization

    beginPol3OncPolPrtcpCd = getStartOffset() + 41; // set offset for serialization

    beginPol3EvdBasDialgInd = getStartOffset() + 42; // set offset for serialization

    beginPol3CoreMedPrrAuthCd = getStartOffset() + 43; // set offset for serialization

    beginPol3RelSrvcInd = getStartOffset() + 44; // set offset for serialization

    beginPol3GenPolPrtcpCd = getStartOffset() + 45; // set offset for serialization

    beginPol3SecOpinVendCd = getStartOffset() + 46; // set offset for serialization

    beginPol3RetBhvHlthVendCd = getStartOffset() + 47; // set offset for serialization

    beginPol3RetSlot001 = getStartOffset() + 48; // set offset for serialization

    beginPol3RetEff001 = getStartOffset() + 54; // set offset for serialization

    beginPol3RetCanc001 = getStartOffset() + 64; // set offset for serialization

    beginPol3RetSlot002 = getStartOffset() + 74; // set offset for serialization

    beginPol3RetEff002 = getStartOffset() + 80; // set offset for serialization

    beginPol3RetCanc002 = getStartOffset() + 90; // set offset for serialization

    beginPol3RetSlot003 = getStartOffset() + 100; // set offset for serialization

    beginPol3RetEff003 = getStartOffset() + 106; // set offset for serialization

    beginPol3RetCanc003 = getStartOffset() + 116; // set offset for serialization

    beginPol3RetSlot004 = getStartOffset() + 126; // set offset for serialization

    beginPol3RetEff004 = getStartOffset() + 132; // set offset for serialization

    beginPol3RetCanc004 = getStartOffset() + 142; // set offset for serialization

    beginPol3RetSlot005 = getStartOffset() + 152; // set offset for serialization

    beginPol3RetEff005 = getStartOffset() + 158; // set offset for serialization

    beginPol3RetCanc005 = getStartOffset() + 168; // set offset for serialization

    beginPol3RetSlot006 = getStartOffset() + 178; // set offset for serialization

    beginPol3RetEff006 = getStartOffset() + 184; // set offset for serialization

    beginPol3RetCanc006 = getStartOffset() + 194; // set offset for serialization

    beginPol3RetSlot007 = getStartOffset() + 204; // set offset for serialization

    beginPol3RetEff007 = getStartOffset() + 210; // set offset for serialization

    beginPol3RetCanc007 = getStartOffset() + 220; // set offset for serialization

    beginPol3RetSlot008 = getStartOffset() + 230; // set offset for serialization

    beginPol3RetEff008 = getStartOffset() + 236; // set offset for serialization

    beginPol3RetCanc008 = getStartOffset() + 246; // set offset for serialization

    beginPol3RetSlot009 = getStartOffset() + 256; // set offset for serialization

    beginPol3RetEff009 = getStartOffset() + 262; // set offset for serialization

    beginPol3RetCanc009 = getStartOffset() + 272; // set offset for serialization

    beginPol3RetSlot010 = getStartOffset() + 282; // set offset for serialization

    beginPol3RetEff010 = getStartOffset() + 288; // set offset for serialization

    beginPol3RetCanc010 = getStartOffset() + 298; // set offset for serialization

    beginPol3RetSlot011 = getStartOffset() + 308; // set offset for serialization

    beginPol3RetEff011 = getStartOffset() + 314; // set offset for serialization

    beginPol3RetCanc011 = getStartOffset() + 324; // set offset for serialization

    beginPol3RetSlot012 = getStartOffset() + 334; // set offset for serialization

    beginPol3RetEff012 = getStartOffset() + 340; // set offset for serialization

    beginPol3RetCanc012 = getStartOffset() + 350; // set offset for serialization

    beginPol3RetSlot013 = getStartOffset() + 360; // set offset for serialization

    beginPol3RetEff013 = getStartOffset() + 366; // set offset for serialization

    beginPol3RetCanc013 = getStartOffset() + 376; // set offset for serialization

    beginPol3RetSlot014 = getStartOffset() + 386; // set offset for serialization

    beginPol3RetEff014 = getStartOffset() + 392; // set offset for serialization

    beginPol3RetCanc014 = getStartOffset() + 402; // set offset for serialization

    beginPol3RetSlot018 = getStartOffset() + 412; // set offset for serialization

    beginPol3RetSlot019 = getStartOffset() + 418; // set offset for serialization

    beginPol3RetSlot020 = getStartOffset() + 424; // set offset for serialization

    /*  end of offset */
  }

  int localPol3StdPolNbrCounter = -1;

  public boolean isPol3StdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3StdPolNbrCounter != sharedCounter;
    localPol3StdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_STD_POL_NBR_LEN = 6;
  /** serialize this Pol3StdPolNbr */
  protected void serializePol3StdPolNbr(char[] pol3StdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3StdPolNbr, 0, getStringValue(), beginPol3StdPolNbr, POL_3_STD_POL_NBR_LEN);
    localPol3StdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3StdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3StdPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3StdPolNbr() {
    return (substring(
        getStringValue(), beginPol3StdPolNbr, beginPol3StdPolNbr + POL_3_STD_POL_NBR_LEN));
  }

  int localPol3StdPlnNbrCounter = -1;

  public boolean isPol3StdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3StdPlnNbrCounter != sharedCounter;
    localPol3StdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol3StdPlnNbr
   *
   * @return pol3StdPlnNbr
   */
  public char[] getPol3StdPlnNbrString() {
    return getCharArray(beginPol3StdPlnNbr, POL_3_STD_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol3StdPlnNbrIsNumeric() {
    return isNumeric(
        beginPol3StdPlnNbr,
        beginPol3StdPlnNbr + POL_3_STD_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_3_STD_PLN_NBR_LEN = 4;
  /** serializePol3StdPlnNbr */
  protected void serializePol3StdPlnNbr(int pol3StdPlnNbr) {
    putNumber(
        beginPol3StdPlnNbr,
        pol3StdPlnNbr,
        POL_3_STD_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol3StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol3StdPlnNbr */
  protected int serializePol3StdPlnNbr(char[] value) {
    int pol3StdPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol3StdPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol3StdPlnNbr, 4);
    localPol3StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol3StdPlnNbr;
  }

  protected int checkPol3StdPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol3StdPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol3StdPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol3StdPlnNbr,
          POL_3_STD_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol3StdPlnNbr", beginPol3StdPlnNbr, POL_3_STD_PLN_NBR_LEN);
    }
  }

  int localPol3RetNewOldSrvcIndCounter = -1;

  public boolean isPol3RetNewOldSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetNewOldSrvcIndCounter != sharedCounter;
    localPol3RetNewOldSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_NEW_OLD_SRVC_IND_LEN = 1;
  /** serialize this Pol3RetNewOldSrvcInd */
  protected void serializePol3RetNewOldSrvcInd(char[] pol3RetNewOldSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetNewOldSrvcInd,
        0,
        getStringValue(),
        beginPol3RetNewOldSrvcInd,
        POL_3_RET_NEW_OLD_SRVC_IND_LEN);
    localPol3RetNewOldSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetNewOldSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3RetNewOldSrvcInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetNewOldSrvcInd() {
    return (substring(
        getStringValue(),
        beginPol3RetNewOldSrvcInd,
        beginPol3RetNewOldSrvcInd + POL_3_RET_NEW_OLD_SRVC_IND_LEN));
  }

  int localPol3RetSviTblPriNbrCounter = -1;

  public boolean isPol3RetSviTblPriNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSviTblPriNbrCounter != sharedCounter;
    localPol3RetSviTblPriNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SVI_TBL_PRI_NBR_LEN = 6;
  /** serialize this Pol3RetSviTblPriNbr */
  protected void serializePol3RetSviTblPriNbr(char[] pol3RetSviTblPriNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetSviTblPriNbr,
        0,
        getStringValue(),
        beginPol3RetSviTblPriNbr,
        POL_3_RET_SVI_TBL_PRI_NBR_LEN);
    localPol3RetSviTblPriNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSviTblPriNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSviTblPriNbr is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSviTblPriNbr() {
    return (substring(
        getStringValue(),
        beginPol3RetSviTblPriNbr,
        beginPol3RetSviTblPriNbr + POL_3_RET_SVI_TBL_PRI_NBR_LEN));
  }

  int localPol3RetSlotTblIdCounter = -1;

  public boolean isPol3RetSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlotTblIdCounter != sharedCounter;
    localPol3RetSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_TBL_ID_LEN = 6;
  /** serialize this Pol3RetSlotTblId */
  protected void serializePol3RetSlotTblId(char[] pol3RetSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetSlotTblId, 0, getStringValue(), beginPol3RetSlotTblId, POL_3_RET_SLOT_TBL_ID_LEN);
    localPol3RetSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlotTblId() {
    return (substring(
        getStringValue(),
        beginPol3RetSlotTblId,
        beginPol3RetSlotTblId + POL_3_RET_SLOT_TBL_ID_LEN));
  }

  int localPol3RetObligIdCounter = -1;

  public boolean isPol3RetObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetObligIdCounter != sharedCounter;
    localPol3RetObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_OBLIG_ID_LEN = 2;
  /** serialize this Pol3RetObligId */
  protected void serializePol3RetObligId(char[] pol3RetObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetObligId, 0, getStringValue(), beginPol3RetObligId, POL_3_RET_OBLIG_ID_LEN);
    localPol3RetObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol3RetObligId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetObligId() {
    return (substring(
        getStringValue(), beginPol3RetObligId, beginPol3RetObligId + POL_3_RET_OBLIG_ID_LEN));
  }

  int localPol3RetShrArngCdCounter = -1;

  public boolean isPol3RetShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetShrArngCdCounter != sharedCounter;
    localPol3RetShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SHR_ARNG_CD_LEN = 2;
  /** serialize this Pol3RetShrArngCd */
  protected void serializePol3RetShrArngCd(char[] pol3RetShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetShrArngCd, 0, getStringValue(), beginPol3RetShrArngCd, POL_3_RET_SHR_ARNG_CD_LEN);
    localPol3RetShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol3RetShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetShrArngCd() {
    return (substring(
        getStringValue(),
        beginPol3RetShrArngCd,
        beginPol3RetShrArngCd + POL_3_RET_SHR_ARNG_CD_LEN));
  }

  int localPol3RetFundTypCdCounter = -1;

  public boolean isPol3RetFundTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetFundTypCdCounter != sharedCounter;
    localPol3RetFundTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_FUND_TYP_CD_LEN = 1;
  /** serialize this Pol3RetFundTypCd */
  protected void serializePol3RetFundTypCd(char[] pol3RetFundTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetFundTypCd, 0, getStringValue(), beginPol3RetFundTypCd, POL_3_RET_FUND_TYP_CD_LEN);
    localPol3RetFundTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetFundTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3RetFundTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetFundTypCd() {
    return (substring(
        getStringValue(),
        beginPol3RetFundTypCd,
        beginPol3RetFundTypCd + POL_3_RET_FUND_TYP_CD_LEN));
  }

  int localPol3RetPrdctKeyCdCounter = -1;

  public boolean isPol3RetPrdctKeyCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetPrdctKeyCdCounter != sharedCounter;
    localPol3RetPrdctKeyCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_PRDCT_KEY_CD_LEN = 3;
  /** serialize this Pol3RetPrdctKeyCd */
  protected void serializePol3RetPrdctKeyCd(char[] pol3RetPrdctKeyCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetPrdctKeyCd, 0, getStringValue(), beginPol3RetPrdctKeyCd, POL_3_RET_PRDCT_KEY_CD_LEN);
    localPol3RetPrdctKeyCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetPrdctKeyCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol3RetPrdctKeyCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetPrdctKeyCd() {
    return (substring(
        getStringValue(),
        beginPol3RetPrdctKeyCd,
        beginPol3RetPrdctKeyCd + POL_3_RET_PRDCT_KEY_CD_LEN));
  }

  int localPol3RetMbrPrdctTypCdCounter = -1;

  public boolean isPol3RetMbrPrdctTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetMbrPrdctTypCdCounter != sharedCounter;
    localPol3RetMbrPrdctTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_MBR_PRDCT_TYP_CD_LEN = 3;
  /** serialize this Pol3RetMbrPrdctTypCd */
  protected void serializePol3RetMbrPrdctTypCd(char[] pol3RetMbrPrdctTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetMbrPrdctTypCd,
        0,
        getStringValue(),
        beginPol3RetMbrPrdctTypCd,
        POL_3_RET_MBR_PRDCT_TYP_CD_LEN);
    localPol3RetMbrPrdctTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetMbrPrdctTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol3RetMbrPrdctTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetMbrPrdctTypCd() {
    return (substring(
        getStringValue(),
        beginPol3RetMbrPrdctTypCd,
        beginPol3RetMbrPrdctTypCd + POL_3_RET_MBR_PRDCT_TYP_CD_LEN));
  }

  int localPol3RetSviTblTerNbrCounter = -1;

  public boolean isPol3RetSviTblTerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSviTblTerNbrCounter != sharedCounter;
    localPol3RetSviTblTerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SVI_TBL_TER_NBR_LEN = 6;
  /** serialize this Pol3RetSviTblTerNbr */
  protected void serializePol3RetSviTblTerNbr(char[] pol3RetSviTblTerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetSviTblTerNbr,
        0,
        getStringValue(),
        beginPol3RetSviTblTerNbr,
        POL_3_RET_SVI_TBL_TER_NBR_LEN);
    localPol3RetSviTblTerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSviTblTerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSviTblTerNbr is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSviTblTerNbr() {
    return (substring(
        getStringValue(),
        beginPol3RetSviTblTerNbr,
        beginPol3RetSviTblTerNbr + POL_3_RET_SVI_TBL_TER_NBR_LEN));
  }

  int localPol3NtfyCrdcEpIndCounter = -1;

  public boolean isPol3NtfyCrdcEpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3NtfyCrdcEpIndCounter != sharedCounter;
    localPol3NtfyCrdcEpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_NTFY_CRDC_EP_IND_LEN = 1;
  /** serialize this Pol3NtfyCrdcEpInd */
  protected void serializePol3NtfyCrdcEpInd(char[] pol3NtfyCrdcEpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3NtfyCrdcEpInd, 0, getStringValue(), beginPol3NtfyCrdcEpInd, POL_3_NTFY_CRDC_EP_IND_LEN);
    localPol3NtfyCrdcEpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3NtfyCrdcEpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3NtfyCrdcEpInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3NtfyCrdcEpInd() {
    return (substring(
        getStringValue(),
        beginPol3NtfyCrdcEpInd,
        beginPol3NtfyCrdcEpInd + POL_3_NTFY_CRDC_EP_IND_LEN));
  }

  int localPol3OncPolPrtcpCdCounter = -1;

  public boolean isPol3OncPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3OncPolPrtcpCdCounter != sharedCounter;
    localPol3OncPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_ONC_POL_PRTCP_CD_LEN = 1;
  /** serialize this Pol3OncPolPrtcpCd */
  protected void serializePol3OncPolPrtcpCd(char[] pol3OncPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3OncPolPrtcpCd, 0, getStringValue(), beginPol3OncPolPrtcpCd, POL_3_ONC_POL_PRTCP_CD_LEN);
    localPol3OncPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3OncPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3OncPolPrtcpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3OncPolPrtcpCd() {
    return (substring(
        getStringValue(),
        beginPol3OncPolPrtcpCd,
        beginPol3OncPolPrtcpCd + POL_3_ONC_POL_PRTCP_CD_LEN));
  }

  int localPol3EvdBasDialgIndCounter = -1;

  public boolean isPol3EvdBasDialgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3EvdBasDialgIndCounter != sharedCounter;
    localPol3EvdBasDialgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_EVD_BAS_DIALG_IND_LEN = 1;
  /** serialize this Pol3EvdBasDialgInd */
  protected void serializePol3EvdBasDialgInd(char[] pol3EvdBasDialgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3EvdBasDialgInd,
        0,
        getStringValue(),
        beginPol3EvdBasDialgInd,
        POL_3_EVD_BAS_DIALG_IND_LEN);
    localPol3EvdBasDialgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3EvdBasDialgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3EvdBasDialgInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3EvdBasDialgInd() {
    return (substring(
        getStringValue(),
        beginPol3EvdBasDialgInd,
        beginPol3EvdBasDialgInd + POL_3_EVD_BAS_DIALG_IND_LEN));
  }

  int localPol3CoreMedPrrAuthCdCounter = -1;

  public boolean isPol3CoreMedPrrAuthCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3CoreMedPrrAuthCdCounter != sharedCounter;
    localPol3CoreMedPrrAuthCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_CORE_MED_PRR_AUTH_CD_LEN = 1;
  /** serialize this Pol3CoreMedPrrAuthCd */
  protected void serializePol3CoreMedPrrAuthCd(char[] pol3CoreMedPrrAuthCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3CoreMedPrrAuthCd,
        0,
        getStringValue(),
        beginPol3CoreMedPrrAuthCd,
        POL_3_CORE_MED_PRR_AUTH_CD_LEN);
    localPol3CoreMedPrrAuthCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3CoreMedPrrAuthCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3CoreMedPrrAuthCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol3CoreMedPrrAuthCd() {
    return (substring(
        getStringValue(),
        beginPol3CoreMedPrrAuthCd,
        beginPol3CoreMedPrrAuthCd + POL_3_CORE_MED_PRR_AUTH_CD_LEN));
  }

  int localPol3RelSrvcIndCounter = -1;

  public boolean isPol3RelSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RelSrvcIndCounter != sharedCounter;
    localPol3RelSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_REL_SRVC_IND_LEN = 1;
  /** serialize this Pol3RelSrvcInd */
  protected void serializePol3RelSrvcInd(char[] pol3RelSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RelSrvcInd, 0, getStringValue(), beginPol3RelSrvcInd, POL_3_REL_SRVC_IND_LEN);
    localPol3RelSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RelSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3RelSrvcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RelSrvcInd() {
    return (substring(
        getStringValue(), beginPol3RelSrvcInd, beginPol3RelSrvcInd + POL_3_REL_SRVC_IND_LEN));
  }

  int localPol3GenPolPrtcpCdCounter = -1;

  public boolean isPol3GenPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3GenPolPrtcpCdCounter != sharedCounter;
    localPol3GenPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_GEN_POL_PRTCP_CD_LEN = 1;
  /** serialize this Pol3GenPolPrtcpCd */
  protected void serializePol3GenPolPrtcpCd(char[] pol3GenPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3GenPolPrtcpCd, 0, getStringValue(), beginPol3GenPolPrtcpCd, POL_3_GEN_POL_PRTCP_CD_LEN);
    localPol3GenPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3GenPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3GenPolPrtcpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3GenPolPrtcpCd() {
    return (substring(
        getStringValue(),
        beginPol3GenPolPrtcpCd,
        beginPol3GenPolPrtcpCd + POL_3_GEN_POL_PRTCP_CD_LEN));
  }

  int localPol3SecOpinVendCdCounter = -1;

  public boolean isPol3SecOpinVendCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3SecOpinVendCdCounter != sharedCounter;
    localPol3SecOpinVendCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_SEC_OPIN_VEND_CD_LEN = 1;
  /** serialize this Pol3SecOpinVendCd */
  protected void serializePol3SecOpinVendCd(char[] pol3SecOpinVendCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3SecOpinVendCd, 0, getStringValue(), beginPol3SecOpinVendCd, POL_3_SEC_OPIN_VEND_CD_LEN);
    localPol3SecOpinVendCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3SecOpinVendCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3SecOpinVendCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3SecOpinVendCd() {
    return (substring(
        getStringValue(),
        beginPol3SecOpinVendCd,
        beginPol3SecOpinVendCd + POL_3_SEC_OPIN_VEND_CD_LEN));
  }

  int localPol3RetBhvHlthVendCdCounter = -1;

  public boolean isPol3RetBhvHlthVendCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetBhvHlthVendCdCounter != sharedCounter;
    localPol3RetBhvHlthVendCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_BHV_HLTH_VEND_CD_LEN = 1;
  /** serialize this Pol3RetBhvHlthVendCd */
  protected void serializePol3RetBhvHlthVendCd(char[] pol3RetBhvHlthVendCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol3RetBhvHlthVendCd,
        0,
        getStringValue(),
        beginPol3RetBhvHlthVendCd,
        POL_3_RET_BHV_HLTH_VEND_CD_LEN);
    localPol3RetBhvHlthVendCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetBhvHlthVendCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol3RetBhvHlthVendCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetBhvHlthVendCd() {
    return (substring(
        getStringValue(),
        beginPol3RetBhvHlthVendCd,
        beginPol3RetBhvHlthVendCd + POL_3_RET_BHV_HLTH_VEND_CD_LEN));
  }

  int localPol3RetSlot001Counter = -1;

  public boolean isPol3RetSlot001Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot001Counter != sharedCounter;
    localPol3RetSlot001Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_001_LEN = 6;
  /** serialize this Pol3RetSlot001 */
  protected void serializePol3RetSlot001(char[] pol3RetSlot001) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot001, 0, getStringValue(), beginPol3RetSlot001, POL_3_RET_SLOT_001_LEN);
    localPol3RetSlot001Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot001Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot001 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot001() {
    return (substring(
        getStringValue(), beginPol3RetSlot001, beginPol3RetSlot001 + POL_3_RET_SLOT_001_LEN));
  }

  int localPol3RetEff001Counter = -1;

  public boolean isPol3RetEff001Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff001Counter != sharedCounter;
    localPol3RetEff001Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_001_LEN = 10;
  /** serialize this Pol3RetEff001 */
  protected void serializePol3RetEff001(char[] pol3RetEff001) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff001, 0, getStringValue(), beginPol3RetEff001, POL_3_RET_EFF_001_LEN);
    localPol3RetEff001Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff001Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff001 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff001() {
    return (substring(
        getStringValue(), beginPol3RetEff001, beginPol3RetEff001 + POL_3_RET_EFF_001_LEN));
  }

  int localPol3RetCanc001Counter = -1;

  public boolean isPol3RetCanc001Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc001Counter != sharedCounter;
    localPol3RetCanc001Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_001_LEN = 10;
  /** serialize this Pol3RetCanc001 */
  protected void serializePol3RetCanc001(char[] pol3RetCanc001) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc001, 0, getStringValue(), beginPol3RetCanc001, POL_3_RET_CANC_001_LEN);
    localPol3RetCanc001Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc001Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc001 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc001() {
    return (substring(
        getStringValue(), beginPol3RetCanc001, beginPol3RetCanc001 + POL_3_RET_CANC_001_LEN));
  }

  int localPol3RetSlot002Counter = -1;

  public boolean isPol3RetSlot002Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot002Counter != sharedCounter;
    localPol3RetSlot002Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_002_LEN = 6;
  /** serialize this Pol3RetSlot002 */
  protected void serializePol3RetSlot002(char[] pol3RetSlot002) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot002, 0, getStringValue(), beginPol3RetSlot002, POL_3_RET_SLOT_002_LEN);
    localPol3RetSlot002Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot002Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot002 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot002() {
    return (substring(
        getStringValue(), beginPol3RetSlot002, beginPol3RetSlot002 + POL_3_RET_SLOT_002_LEN));
  }

  int localPol3RetEff002Counter = -1;

  public boolean isPol3RetEff002Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff002Counter != sharedCounter;
    localPol3RetEff002Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_002_LEN = 10;
  /** serialize this Pol3RetEff002 */
  protected void serializePol3RetEff002(char[] pol3RetEff002) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff002, 0, getStringValue(), beginPol3RetEff002, POL_3_RET_EFF_002_LEN);
    localPol3RetEff002Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff002Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff002 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff002() {
    return (substring(
        getStringValue(), beginPol3RetEff002, beginPol3RetEff002 + POL_3_RET_EFF_002_LEN));
  }

  int localPol3RetCanc002Counter = -1;

  public boolean isPol3RetCanc002Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc002Counter != sharedCounter;
    localPol3RetCanc002Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_002_LEN = 10;
  /** serialize this Pol3RetCanc002 */
  protected void serializePol3RetCanc002(char[] pol3RetCanc002) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc002, 0, getStringValue(), beginPol3RetCanc002, POL_3_RET_CANC_002_LEN);
    localPol3RetCanc002Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc002Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc002 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc002() {
    return (substring(
        getStringValue(), beginPol3RetCanc002, beginPol3RetCanc002 + POL_3_RET_CANC_002_LEN));
  }

  int localPol3RetSlot003Counter = -1;

  public boolean isPol3RetSlot003Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot003Counter != sharedCounter;
    localPol3RetSlot003Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_003_LEN = 6;
  /** serialize this Pol3RetSlot003 */
  protected void serializePol3RetSlot003(char[] pol3RetSlot003) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot003, 0, getStringValue(), beginPol3RetSlot003, POL_3_RET_SLOT_003_LEN);
    localPol3RetSlot003Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot003Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot003 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot003() {
    return (substring(
        getStringValue(), beginPol3RetSlot003, beginPol3RetSlot003 + POL_3_RET_SLOT_003_LEN));
  }

  int localPol3RetEff003Counter = -1;

  public boolean isPol3RetEff003Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff003Counter != sharedCounter;
    localPol3RetEff003Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_003_LEN = 10;
  /** serialize this Pol3RetEff003 */
  protected void serializePol3RetEff003(char[] pol3RetEff003) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff003, 0, getStringValue(), beginPol3RetEff003, POL_3_RET_EFF_003_LEN);
    localPol3RetEff003Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff003Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff003 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff003() {
    return (substring(
        getStringValue(), beginPol3RetEff003, beginPol3RetEff003 + POL_3_RET_EFF_003_LEN));
  }

  int localPol3RetCanc003Counter = -1;

  public boolean isPol3RetCanc003Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc003Counter != sharedCounter;
    localPol3RetCanc003Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_003_LEN = 10;
  /** serialize this Pol3RetCanc003 */
  protected void serializePol3RetCanc003(char[] pol3RetCanc003) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc003, 0, getStringValue(), beginPol3RetCanc003, POL_3_RET_CANC_003_LEN);
    localPol3RetCanc003Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc003Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc003 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc003() {
    return (substring(
        getStringValue(), beginPol3RetCanc003, beginPol3RetCanc003 + POL_3_RET_CANC_003_LEN));
  }

  int localPol3RetSlot004Counter = -1;

  public boolean isPol3RetSlot004Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot004Counter != sharedCounter;
    localPol3RetSlot004Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_004_LEN = 6;
  /** serialize this Pol3RetSlot004 */
  protected void serializePol3RetSlot004(char[] pol3RetSlot004) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot004, 0, getStringValue(), beginPol3RetSlot004, POL_3_RET_SLOT_004_LEN);
    localPol3RetSlot004Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot004Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot004 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot004() {
    return (substring(
        getStringValue(), beginPol3RetSlot004, beginPol3RetSlot004 + POL_3_RET_SLOT_004_LEN));
  }

  int localPol3RetEff004Counter = -1;

  public boolean isPol3RetEff004Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff004Counter != sharedCounter;
    localPol3RetEff004Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_004_LEN = 10;
  /** serialize this Pol3RetEff004 */
  protected void serializePol3RetEff004(char[] pol3RetEff004) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff004, 0, getStringValue(), beginPol3RetEff004, POL_3_RET_EFF_004_LEN);
    localPol3RetEff004Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff004Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff004 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff004() {
    return (substring(
        getStringValue(), beginPol3RetEff004, beginPol3RetEff004 + POL_3_RET_EFF_004_LEN));
  }

  int localPol3RetCanc004Counter = -1;

  public boolean isPol3RetCanc004Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc004Counter != sharedCounter;
    localPol3RetCanc004Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_004_LEN = 10;
  /** serialize this Pol3RetCanc004 */
  protected void serializePol3RetCanc004(char[] pol3RetCanc004) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc004, 0, getStringValue(), beginPol3RetCanc004, POL_3_RET_CANC_004_LEN);
    localPol3RetCanc004Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc004Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc004 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc004() {
    return (substring(
        getStringValue(), beginPol3RetCanc004, beginPol3RetCanc004 + POL_3_RET_CANC_004_LEN));
  }

  int localPol3RetSlot005Counter = -1;

  public boolean isPol3RetSlot005Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot005Counter != sharedCounter;
    localPol3RetSlot005Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_005_LEN = 6;
  /** serialize this Pol3RetSlot005 */
  protected void serializePol3RetSlot005(char[] pol3RetSlot005) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot005, 0, getStringValue(), beginPol3RetSlot005, POL_3_RET_SLOT_005_LEN);
    localPol3RetSlot005Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot005Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot005 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot005() {
    return (substring(
        getStringValue(), beginPol3RetSlot005, beginPol3RetSlot005 + POL_3_RET_SLOT_005_LEN));
  }

  int localPol3RetEff005Counter = -1;

  public boolean isPol3RetEff005Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff005Counter != sharedCounter;
    localPol3RetEff005Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_005_LEN = 10;
  /** serialize this Pol3RetEff005 */
  protected void serializePol3RetEff005(char[] pol3RetEff005) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff005, 0, getStringValue(), beginPol3RetEff005, POL_3_RET_EFF_005_LEN);
    localPol3RetEff005Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff005Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff005 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff005() {
    return (substring(
        getStringValue(), beginPol3RetEff005, beginPol3RetEff005 + POL_3_RET_EFF_005_LEN));
  }

  int localPol3RetCanc005Counter = -1;

  public boolean isPol3RetCanc005Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc005Counter != sharedCounter;
    localPol3RetCanc005Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_005_LEN = 10;
  /** serialize this Pol3RetCanc005 */
  protected void serializePol3RetCanc005(char[] pol3RetCanc005) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc005, 0, getStringValue(), beginPol3RetCanc005, POL_3_RET_CANC_005_LEN);
    localPol3RetCanc005Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc005Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc005 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc005() {
    return (substring(
        getStringValue(), beginPol3RetCanc005, beginPol3RetCanc005 + POL_3_RET_CANC_005_LEN));
  }

  int localPol3RetSlot006Counter = -1;

  public boolean isPol3RetSlot006Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot006Counter != sharedCounter;
    localPol3RetSlot006Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_006_LEN = 6;
  /** serialize this Pol3RetSlot006 */
  protected void serializePol3RetSlot006(char[] pol3RetSlot006) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot006, 0, getStringValue(), beginPol3RetSlot006, POL_3_RET_SLOT_006_LEN);
    localPol3RetSlot006Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot006Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot006 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot006() {
    return (substring(
        getStringValue(), beginPol3RetSlot006, beginPol3RetSlot006 + POL_3_RET_SLOT_006_LEN));
  }

  int localPol3RetEff006Counter = -1;

  public boolean isPol3RetEff006Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff006Counter != sharedCounter;
    localPol3RetEff006Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_006_LEN = 10;
  /** serialize this Pol3RetEff006 */
  protected void serializePol3RetEff006(char[] pol3RetEff006) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff006, 0, getStringValue(), beginPol3RetEff006, POL_3_RET_EFF_006_LEN);
    localPol3RetEff006Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff006Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff006 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff006() {
    return (substring(
        getStringValue(), beginPol3RetEff006, beginPol3RetEff006 + POL_3_RET_EFF_006_LEN));
  }

  int localPol3RetCanc006Counter = -1;

  public boolean isPol3RetCanc006Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc006Counter != sharedCounter;
    localPol3RetCanc006Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_006_LEN = 10;
  /** serialize this Pol3RetCanc006 */
  protected void serializePol3RetCanc006(char[] pol3RetCanc006) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc006, 0, getStringValue(), beginPol3RetCanc006, POL_3_RET_CANC_006_LEN);
    localPol3RetCanc006Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc006Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc006 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc006() {
    return (substring(
        getStringValue(), beginPol3RetCanc006, beginPol3RetCanc006 + POL_3_RET_CANC_006_LEN));
  }

  int localPol3RetSlot007Counter = -1;

  public boolean isPol3RetSlot007Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot007Counter != sharedCounter;
    localPol3RetSlot007Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_007_LEN = 6;
  /** serialize this Pol3RetSlot007 */
  protected void serializePol3RetSlot007(char[] pol3RetSlot007) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot007, 0, getStringValue(), beginPol3RetSlot007, POL_3_RET_SLOT_007_LEN);
    localPol3RetSlot007Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot007Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot007 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot007() {
    return (substring(
        getStringValue(), beginPol3RetSlot007, beginPol3RetSlot007 + POL_3_RET_SLOT_007_LEN));
  }

  int localPol3RetEff007Counter = -1;

  public boolean isPol3RetEff007Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff007Counter != sharedCounter;
    localPol3RetEff007Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_007_LEN = 10;
  /** serialize this Pol3RetEff007 */
  protected void serializePol3RetEff007(char[] pol3RetEff007) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff007, 0, getStringValue(), beginPol3RetEff007, POL_3_RET_EFF_007_LEN);
    localPol3RetEff007Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff007Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff007 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff007() {
    return (substring(
        getStringValue(), beginPol3RetEff007, beginPol3RetEff007 + POL_3_RET_EFF_007_LEN));
  }

  int localPol3RetCanc007Counter = -1;

  public boolean isPol3RetCanc007Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc007Counter != sharedCounter;
    localPol3RetCanc007Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_007_LEN = 10;
  /** serialize this Pol3RetCanc007 */
  protected void serializePol3RetCanc007(char[] pol3RetCanc007) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc007, 0, getStringValue(), beginPol3RetCanc007, POL_3_RET_CANC_007_LEN);
    localPol3RetCanc007Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc007Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc007 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc007() {
    return (substring(
        getStringValue(), beginPol3RetCanc007, beginPol3RetCanc007 + POL_3_RET_CANC_007_LEN));
  }

  int localPol3RetSlot008Counter = -1;

  public boolean isPol3RetSlot008Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot008Counter != sharedCounter;
    localPol3RetSlot008Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_008_LEN = 6;
  /** serialize this Pol3RetSlot008 */
  protected void serializePol3RetSlot008(char[] pol3RetSlot008) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot008, 0, getStringValue(), beginPol3RetSlot008, POL_3_RET_SLOT_008_LEN);
    localPol3RetSlot008Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot008Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot008 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot008() {
    return (substring(
        getStringValue(), beginPol3RetSlot008, beginPol3RetSlot008 + POL_3_RET_SLOT_008_LEN));
  }

  int localPol3RetEff008Counter = -1;

  public boolean isPol3RetEff008Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff008Counter != sharedCounter;
    localPol3RetEff008Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_008_LEN = 10;
  /** serialize this Pol3RetEff008 */
  protected void serializePol3RetEff008(char[] pol3RetEff008) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff008, 0, getStringValue(), beginPol3RetEff008, POL_3_RET_EFF_008_LEN);
    localPol3RetEff008Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff008Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff008 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff008() {
    return (substring(
        getStringValue(), beginPol3RetEff008, beginPol3RetEff008 + POL_3_RET_EFF_008_LEN));
  }

  int localPol3RetCanc008Counter = -1;

  public boolean isPol3RetCanc008Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc008Counter != sharedCounter;
    localPol3RetCanc008Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_008_LEN = 10;
  /** serialize this Pol3RetCanc008 */
  protected void serializePol3RetCanc008(char[] pol3RetCanc008) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc008, 0, getStringValue(), beginPol3RetCanc008, POL_3_RET_CANC_008_LEN);
    localPol3RetCanc008Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc008Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc008 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc008() {
    return (substring(
        getStringValue(), beginPol3RetCanc008, beginPol3RetCanc008 + POL_3_RET_CANC_008_LEN));
  }

  int localPol3RetSlot009Counter = -1;

  public boolean isPol3RetSlot009Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot009Counter != sharedCounter;
    localPol3RetSlot009Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_009_LEN = 6;
  /** serialize this Pol3RetSlot009 */
  protected void serializePol3RetSlot009(char[] pol3RetSlot009) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot009, 0, getStringValue(), beginPol3RetSlot009, POL_3_RET_SLOT_009_LEN);
    localPol3RetSlot009Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot009Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot009 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot009() {
    return (substring(
        getStringValue(), beginPol3RetSlot009, beginPol3RetSlot009 + POL_3_RET_SLOT_009_LEN));
  }

  int localPol3RetEff009Counter = -1;

  public boolean isPol3RetEff009Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff009Counter != sharedCounter;
    localPol3RetEff009Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_009_LEN = 10;
  /** serialize this Pol3RetEff009 */
  protected void serializePol3RetEff009(char[] pol3RetEff009) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff009, 0, getStringValue(), beginPol3RetEff009, POL_3_RET_EFF_009_LEN);
    localPol3RetEff009Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff009Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff009 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff009() {
    return (substring(
        getStringValue(), beginPol3RetEff009, beginPol3RetEff009 + POL_3_RET_EFF_009_LEN));
  }

  int localPol3RetCanc009Counter = -1;

  public boolean isPol3RetCanc009Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc009Counter != sharedCounter;
    localPol3RetCanc009Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_009_LEN = 10;
  /** serialize this Pol3RetCanc009 */
  protected void serializePol3RetCanc009(char[] pol3RetCanc009) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc009, 0, getStringValue(), beginPol3RetCanc009, POL_3_RET_CANC_009_LEN);
    localPol3RetCanc009Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc009Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc009 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc009() {
    return (substring(
        getStringValue(), beginPol3RetCanc009, beginPol3RetCanc009 + POL_3_RET_CANC_009_LEN));
  }

  int localPol3RetSlot010Counter = -1;

  public boolean isPol3RetSlot010Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot010Counter != sharedCounter;
    localPol3RetSlot010Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_010_LEN = 6;
  /** serialize this Pol3RetSlot010 */
  protected void serializePol3RetSlot010(char[] pol3RetSlot010) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot010, 0, getStringValue(), beginPol3RetSlot010, POL_3_RET_SLOT_010_LEN);
    localPol3RetSlot010Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot010Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot010 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot010() {
    return (substring(
        getStringValue(), beginPol3RetSlot010, beginPol3RetSlot010 + POL_3_RET_SLOT_010_LEN));
  }

  int localPol3RetEff010Counter = -1;

  public boolean isPol3RetEff010Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff010Counter != sharedCounter;
    localPol3RetEff010Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_010_LEN = 10;
  /** serialize this Pol3RetEff010 */
  protected void serializePol3RetEff010(char[] pol3RetEff010) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff010, 0, getStringValue(), beginPol3RetEff010, POL_3_RET_EFF_010_LEN);
    localPol3RetEff010Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff010Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff010 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff010() {
    return (substring(
        getStringValue(), beginPol3RetEff010, beginPol3RetEff010 + POL_3_RET_EFF_010_LEN));
  }

  int localPol3RetCanc010Counter = -1;

  public boolean isPol3RetCanc010Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc010Counter != sharedCounter;
    localPol3RetCanc010Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_010_LEN = 10;
  /** serialize this Pol3RetCanc010 */
  protected void serializePol3RetCanc010(char[] pol3RetCanc010) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc010, 0, getStringValue(), beginPol3RetCanc010, POL_3_RET_CANC_010_LEN);
    localPol3RetCanc010Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc010Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc010 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc010() {
    return (substring(
        getStringValue(), beginPol3RetCanc010, beginPol3RetCanc010 + POL_3_RET_CANC_010_LEN));
  }

  int localPol3RetSlot011Counter = -1;

  public boolean isPol3RetSlot011Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot011Counter != sharedCounter;
    localPol3RetSlot011Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_011_LEN = 6;
  /** serialize this Pol3RetSlot011 */
  protected void serializePol3RetSlot011(char[] pol3RetSlot011) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot011, 0, getStringValue(), beginPol3RetSlot011, POL_3_RET_SLOT_011_LEN);
    localPol3RetSlot011Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot011Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot011 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot011() {
    return (substring(
        getStringValue(), beginPol3RetSlot011, beginPol3RetSlot011 + POL_3_RET_SLOT_011_LEN));
  }

  int localPol3RetEff011Counter = -1;

  public boolean isPol3RetEff011Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff011Counter != sharedCounter;
    localPol3RetEff011Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_011_LEN = 10;
  /** serialize this Pol3RetEff011 */
  protected void serializePol3RetEff011(char[] pol3RetEff011) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff011, 0, getStringValue(), beginPol3RetEff011, POL_3_RET_EFF_011_LEN);
    localPol3RetEff011Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff011Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff011 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff011() {
    return (substring(
        getStringValue(), beginPol3RetEff011, beginPol3RetEff011 + POL_3_RET_EFF_011_LEN));
  }

  int localPol3RetCanc011Counter = -1;

  public boolean isPol3RetCanc011Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc011Counter != sharedCounter;
    localPol3RetCanc011Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_011_LEN = 10;
  /** serialize this Pol3RetCanc011 */
  protected void serializePol3RetCanc011(char[] pol3RetCanc011) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc011, 0, getStringValue(), beginPol3RetCanc011, POL_3_RET_CANC_011_LEN);
    localPol3RetCanc011Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc011Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc011 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc011() {
    return (substring(
        getStringValue(), beginPol3RetCanc011, beginPol3RetCanc011 + POL_3_RET_CANC_011_LEN));
  }

  int localPol3RetSlot012Counter = -1;

  public boolean isPol3RetSlot012Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot012Counter != sharedCounter;
    localPol3RetSlot012Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_012_LEN = 6;
  /** serialize this Pol3RetSlot012 */
  protected void serializePol3RetSlot012(char[] pol3RetSlot012) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot012, 0, getStringValue(), beginPol3RetSlot012, POL_3_RET_SLOT_012_LEN);
    localPol3RetSlot012Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot012Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot012 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot012() {
    return (substring(
        getStringValue(), beginPol3RetSlot012, beginPol3RetSlot012 + POL_3_RET_SLOT_012_LEN));
  }

  int localPol3RetEff012Counter = -1;

  public boolean isPol3RetEff012Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff012Counter != sharedCounter;
    localPol3RetEff012Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_012_LEN = 10;
  /** serialize this Pol3RetEff012 */
  protected void serializePol3RetEff012(char[] pol3RetEff012) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff012, 0, getStringValue(), beginPol3RetEff012, POL_3_RET_EFF_012_LEN);
    localPol3RetEff012Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff012Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff012 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff012() {
    return (substring(
        getStringValue(), beginPol3RetEff012, beginPol3RetEff012 + POL_3_RET_EFF_012_LEN));
  }

  int localPol3RetCanc012Counter = -1;

  public boolean isPol3RetCanc012Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc012Counter != sharedCounter;
    localPol3RetCanc012Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_012_LEN = 10;
  /** serialize this Pol3RetCanc012 */
  protected void serializePol3RetCanc012(char[] pol3RetCanc012) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc012, 0, getStringValue(), beginPol3RetCanc012, POL_3_RET_CANC_012_LEN);
    localPol3RetCanc012Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc012Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc012 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc012() {
    return (substring(
        getStringValue(), beginPol3RetCanc012, beginPol3RetCanc012 + POL_3_RET_CANC_012_LEN));
  }

  int localPol3RetSlot013Counter = -1;

  public boolean isPol3RetSlot013Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot013Counter != sharedCounter;
    localPol3RetSlot013Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_013_LEN = 6;
  /** serialize this Pol3RetSlot013 */
  protected void serializePol3RetSlot013(char[] pol3RetSlot013) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot013, 0, getStringValue(), beginPol3RetSlot013, POL_3_RET_SLOT_013_LEN);
    localPol3RetSlot013Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot013Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot013 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot013() {
    return (substring(
        getStringValue(), beginPol3RetSlot013, beginPol3RetSlot013 + POL_3_RET_SLOT_013_LEN));
  }

  int localPol3RetEff013Counter = -1;

  public boolean isPol3RetEff013Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff013Counter != sharedCounter;
    localPol3RetEff013Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_013_LEN = 10;
  /** serialize this Pol3RetEff013 */
  protected void serializePol3RetEff013(char[] pol3RetEff013) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff013, 0, getStringValue(), beginPol3RetEff013, POL_3_RET_EFF_013_LEN);
    localPol3RetEff013Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff013Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff013 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff013() {
    return (substring(
        getStringValue(), beginPol3RetEff013, beginPol3RetEff013 + POL_3_RET_EFF_013_LEN));
  }

  int localPol3RetCanc013Counter = -1;

  public boolean isPol3RetCanc013Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc013Counter != sharedCounter;
    localPol3RetCanc013Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_013_LEN = 10;
  /** serialize this Pol3RetCanc013 */
  protected void serializePol3RetCanc013(char[] pol3RetCanc013) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc013, 0, getStringValue(), beginPol3RetCanc013, POL_3_RET_CANC_013_LEN);
    localPol3RetCanc013Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc013Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc013 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc013() {
    return (substring(
        getStringValue(), beginPol3RetCanc013, beginPol3RetCanc013 + POL_3_RET_CANC_013_LEN));
  }

  int localPol3RetSlot014Counter = -1;

  public boolean isPol3RetSlot014Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot014Counter != sharedCounter;
    localPol3RetSlot014Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_014_LEN = 6;
  /** serialize this Pol3RetSlot014 */
  protected void serializePol3RetSlot014(char[] pol3RetSlot014) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot014, 0, getStringValue(), beginPol3RetSlot014, POL_3_RET_SLOT_014_LEN);
    localPol3RetSlot014Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot014Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot014 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot014() {
    return (substring(
        getStringValue(), beginPol3RetSlot014, beginPol3RetSlot014 + POL_3_RET_SLOT_014_LEN));
  }

  int localPol3RetEff014Counter = -1;

  public boolean isPol3RetEff014Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetEff014Counter != sharedCounter;
    localPol3RetEff014Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_EFF_014_LEN = 10;
  /** serialize this Pol3RetEff014 */
  protected void serializePol3RetEff014(char[] pol3RetEff014) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetEff014, 0, getStringValue(), beginPol3RetEff014, POL_3_RET_EFF_014_LEN);
    localPol3RetEff014Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetEff014Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetEff014 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetEff014() {
    return (substring(
        getStringValue(), beginPol3RetEff014, beginPol3RetEff014 + POL_3_RET_EFF_014_LEN));
  }

  int localPol3RetCanc014Counter = -1;

  public boolean isPol3RetCanc014Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetCanc014Counter != sharedCounter;
    localPol3RetCanc014Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_CANC_014_LEN = 10;
  /** serialize this Pol3RetCanc014 */
  protected void serializePol3RetCanc014(char[] pol3RetCanc014) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetCanc014, 0, getStringValue(), beginPol3RetCanc014, POL_3_RET_CANC_014_LEN);
    localPol3RetCanc014Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetCanc014Constraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol3RetCanc014 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetCanc014() {
    return (substring(
        getStringValue(), beginPol3RetCanc014, beginPol3RetCanc014 + POL_3_RET_CANC_014_LEN));
  }

  int localPol3RetSlot018Counter = -1;

  public boolean isPol3RetSlot018Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot018Counter != sharedCounter;
    localPol3RetSlot018Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_018_LEN = 6;
  /** serialize this Pol3RetSlot018 */
  protected void serializePol3RetSlot018(char[] pol3RetSlot018) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot018, 0, getStringValue(), beginPol3RetSlot018, POL_3_RET_SLOT_018_LEN);
    localPol3RetSlot018Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot018Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot018 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot018() {
    return (substring(
        getStringValue(), beginPol3RetSlot018, beginPol3RetSlot018 + POL_3_RET_SLOT_018_LEN));
  }

  int localPol3RetSlot019Counter = -1;

  public boolean isPol3RetSlot019Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot019Counter != sharedCounter;
    localPol3RetSlot019Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_019_LEN = 6;
  /** serialize this Pol3RetSlot019 */
  protected void serializePol3RetSlot019(char[] pol3RetSlot019) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot019, 0, getStringValue(), beginPol3RetSlot019, POL_3_RET_SLOT_019_LEN);
    localPol3RetSlot019Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot019Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot019 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot019() {
    return (substring(
        getStringValue(), beginPol3RetSlot019, beginPol3RetSlot019 + POL_3_RET_SLOT_019_LEN));
  }

  int localPol3RetSlot020Counter = -1;

  public boolean isPol3RetSlot020Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol3RetSlot020Counter != sharedCounter;
    localPol3RetSlot020Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_3_RET_SLOT_020_LEN = 6;
  /** serialize this Pol3RetSlot020 */
  protected void serializePol3RetSlot020(char[] pol3RetSlot020) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol3RetSlot020, 0, getStringValue(), beginPol3RetSlot020, POL_3_RET_SLOT_020_LEN);
    localPol3RetSlot020Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol3RetSlot020Constraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol3RetSlot020 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol3RetSlot020() {
    return (substring(
        getStringValue(), beginPol3RetSlot020, beginPol3RetSlot020 + POL_3_RET_SLOT_020_LEN));
  }
}
