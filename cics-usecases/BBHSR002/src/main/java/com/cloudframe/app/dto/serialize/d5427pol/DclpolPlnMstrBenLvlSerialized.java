package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrBenLvlSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrBenLvlSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrBenLvlSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_BEN_LVL_LENGTH = 65;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDblvCovTypCd;
  protected int beginDblvPolNbr;
  protected int beginDblvPlnNbr;
  protected int beginDblvClssNbr;
  protected int beginDblvBenLvlTypCd;
  protected int beginDblvBasPctOvrlayCd;
  protected int beginDblvDedDescCd;
  protected int beginDblvIncntPntlyBasCd;
  protected int beginDblvIncntPntlyBasPct;
  protected int beginDblvIncntPntlyMedCd;
  protected int beginDblvIncntPntlyMedPct;
  protected int beginDblvLstUpdtDttm;
  protected int beginDblvLstUpdtUserId;
  protected int beginDblvNewCoinsCd;
  protected int beginDblvOverlayPctCd;

  /** Constructor for DclpolPlnMstrBenLvlSerialized */
  public DclpolPlnMstrBenLvlSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrBenLvlSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_BEN_LVL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDblvCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginDblvPolNbr = getStartOffset() + 1; // set offset for serialization

    beginDblvPlnNbr = getStartOffset() + 7; // set offset for serialization

    beginDblvClssNbr = getStartOffset() + 11; // set offset for serialization

    beginDblvBenLvlTypCd = getStartOffset() + 15; // set offset for serialization

    beginDblvBasPctOvrlayCd = getStartOffset() + 20; // set offset for serialization

    beginDblvDedDescCd = getStartOffset() + 21; // set offset for serialization

    beginDblvIncntPntlyBasCd = getStartOffset() + 22; // set offset for serialization

    beginDblvIncntPntlyBasPct = getStartOffset() + 23; // set offset for serialization

    beginDblvIncntPntlyMedCd = getStartOffset() + 25; // set offset for serialization

    beginDblvIncntPntlyMedPct = getStartOffset() + 26; // set offset for serialization

    beginDblvLstUpdtDttm = getStartOffset() + 28; // set offset for serialization

    beginDblvLstUpdtUserId = getStartOffset() + 54; // set offset for serialization

    beginDblvNewCoinsCd = getStartOffset() + 63; // set offset for serialization

    beginDblvOverlayPctCd = getStartOffset() + 64; // set offset for serialization

    /*  end of offset */
  }

  int localDblvCovTypCdCounter = -1;

  public boolean isDblvCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvCovTypCdCounter != sharedCounter;
    localDblvCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_COV_TYP_CD_LEN = 1;
  /** serialize this DblvCovTypCd */
  protected void serializeDblvCovTypCd(char[] dblvCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvCovTypCd, 0, getStringValue(), beginDblvCovTypCd, DBLV_COV_TYP_CD_LEN);
    localDblvCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDblvCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvCovTypCd() {
    return (substring(
        getStringValue(), beginDblvCovTypCd, beginDblvCovTypCd + DBLV_COV_TYP_CD_LEN));
  }

  int localDblvPolNbrCounter = -1;

  public boolean isDblvPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvPolNbrCounter != sharedCounter;
    localDblvPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_POL_NBR_LEN = 6;
  /** serialize this DblvPolNbr */
  protected void serializeDblvPolNbr(char[] dblvPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvPolNbr, 0, getStringValue(), beginDblvPolNbr, DBLV_POL_NBR_LEN);
    localDblvPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDblvPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDblvPolNbr() {
    return (substring(getStringValue(), beginDblvPolNbr, beginDblvPolNbr + DBLV_POL_NBR_LEN));
  }

  int localDblvPlnNbrCounter = -1;

  public boolean isDblvPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvPlnNbrCounter != sharedCounter;
    localDblvPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_PLN_NBR_LEN = 4;
  /** serialize this DblvPlnNbr */
  protected void serializeDblvPlnNbr(char[] dblvPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvPlnNbr, 0, getStringValue(), beginDblvPlnNbr, DBLV_PLN_NBR_LEN);
    localDblvPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDblvPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDblvPlnNbr() {
    return (substring(getStringValue(), beginDblvPlnNbr, beginDblvPlnNbr + DBLV_PLN_NBR_LEN));
  }

  int localDblvClssNbrCounter = -1;

  public boolean isDblvClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvClssNbrCounter != sharedCounter;
    localDblvClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_CLSS_NBR_LEN = 4;
  /** serialize this DblvClssNbr */
  protected void serializeDblvClssNbr(char[] dblvClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvClssNbr, 0, getStringValue(), beginDblvClssNbr, DBLV_CLSS_NBR_LEN);
    localDblvClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDblvClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDblvClssNbr() {
    return (substring(getStringValue(), beginDblvClssNbr, beginDblvClssNbr + DBLV_CLSS_NBR_LEN));
  }

  int localDblvBenLvlTypCdCounter = -1;

  public boolean isDblvBenLvlTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvBenLvlTypCdCounter != sharedCounter;
    localDblvBenLvlTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_BEN_LVL_TYP_CD_LEN = 5;
  /** serialize this DblvBenLvlTypCd */
  protected void serializeDblvBenLvlTypCd(char[] dblvBenLvlTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvBenLvlTypCd, 0, getStringValue(), beginDblvBenLvlTypCd, DBLV_BEN_LVL_TYP_CD_LEN);
    localDblvBenLvlTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvBenLvlTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshDblvBenLvlTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvBenLvlTypCd() {
    return (substring(
        getStringValue(), beginDblvBenLvlTypCd, beginDblvBenLvlTypCd + DBLV_BEN_LVL_TYP_CD_LEN));
  }

  int localDblvBasPctOvrlayCdCounter = -1;

  public boolean isDblvBasPctOvrlayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvBasPctOvrlayCdCounter != sharedCounter;
    localDblvBasPctOvrlayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_BAS_PCT_OVRLAY_CD_LEN = 1;
  /** serialize this DblvBasPctOvrlayCd */
  protected void serializeDblvBasPctOvrlayCd(char[] dblvBasPctOvrlayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dblvBasPctOvrlayCd,
        0,
        getStringValue(),
        beginDblvBasPctOvrlayCd,
        DBLV_BAS_PCT_OVRLAY_CD_LEN);
    localDblvBasPctOvrlayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvBasPctOvrlayCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDblvBasPctOvrlayCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvBasPctOvrlayCd() {
    return (substring(
        getStringValue(),
        beginDblvBasPctOvrlayCd,
        beginDblvBasPctOvrlayCd + DBLV_BAS_PCT_OVRLAY_CD_LEN));
  }

  int localDblvDedDescCdCounter = -1;

  public boolean isDblvDedDescCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvDedDescCdCounter != sharedCounter;
    localDblvDedDescCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_DED_DESC_CD_LEN = 1;
  /** serialize this DblvDedDescCd */
  protected void serializeDblvDedDescCd(char[] dblvDedDescCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvDedDescCd, 0, getStringValue(), beginDblvDedDescCd, DBLV_DED_DESC_CD_LEN);
    localDblvDedDescCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvDedDescCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDblvDedDescCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvDedDescCd() {
    return (substring(
        getStringValue(), beginDblvDedDescCd, beginDblvDedDescCd + DBLV_DED_DESC_CD_LEN));
  }

  int localDblvIncntPntlyBasCdCounter = -1;

  public boolean isDblvIncntPntlyBasCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvIncntPntlyBasCdCounter != sharedCounter;
    localDblvIncntPntlyBasCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_INCNT_PNTLY_BAS_CD_LEN = 1;
  /** serialize this DblvIncntPntlyBasCd */
  protected void serializeDblvIncntPntlyBasCd(char[] dblvIncntPntlyBasCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dblvIncntPntlyBasCd,
        0,
        getStringValue(),
        beginDblvIncntPntlyBasCd,
        DBLV_INCNT_PNTLY_BAS_CD_LEN);
    localDblvIncntPntlyBasCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvIncntPntlyBasCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDblvIncntPntlyBasCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDblvIncntPntlyBasCd() {
    return (substring(
        getStringValue(),
        beginDblvIncntPntlyBasCd,
        beginDblvIncntPntlyBasCd + DBLV_INCNT_PNTLY_BAS_CD_LEN));
  }

  int localDblvIncntPntlyBasPctCounter = -1;

  public boolean isDblvIncntPntlyBasPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvIncntPntlyBasPctCounter != sharedCounter;
    localDblvIncntPntlyBasPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean dblvIncntPntlyBasPctIsNumeric() {
    return decimalIsNumeric(
        beginDblvIncntPntlyBasPct,
        DBLV_INCNT_PNTLY_BAS_PCT_LEN); // check Packed Decimal field to see if it contains valid
                                       // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dblvIncntPntlyBasPctString() {
    return getPackedString(beginDblvIncntPntlyBasPct, DBLV_INCNT_PNTLY_BAS_PCT_LEN);
  }

  protected static final int DBLV_INCNT_PNTLY_BAS_PCT_LEN = 2;
  protected static final int DBLV_INCNT_PNTLY_BAS_PCT_SCALE = 2;
  /** serializeDblvIncntPntlyBasPct */
  protected void serializeDblvIncntPntlyBasPct(BigDecimal dblvIncntPntlyBasPct) {
    putDecimal(
        beginDblvIncntPntlyBasPct,
        dblvIncntPntlyBasPct,
        DBLV_INCNT_PNTLY_BAS_PCT_LEN,
        DBLV_INCNT_PNTLY_BAS_PCT_SCALE,
        true);
    localDblvIncntPntlyBasPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDblvIncntPntlyBasPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }
  /**
   * refreshDblvIncntPntlyBasPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshDblvIncntPntlyBasPct() throws CFException {
    try {
      return (getDecimal(
          beginDblvIncntPntlyBasPct, DBLV_INCNT_PNTLY_BAS_PCT_LEN, DBLV_INCNT_PNTLY_BAS_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "dblvIncntPntlyBasPct", beginDblvIncntPntlyBasPct, DBLV_INCNT_PNTLY_BAS_PCT_LEN);
    }
  }

  int localDblvIncntPntlyMedCdCounter = -1;

  public boolean isDblvIncntPntlyMedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvIncntPntlyMedCdCounter != sharedCounter;
    localDblvIncntPntlyMedCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_INCNT_PNTLY_MED_CD_LEN = 1;
  /** serialize this DblvIncntPntlyMedCd */
  protected void serializeDblvIncntPntlyMedCd(char[] dblvIncntPntlyMedCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dblvIncntPntlyMedCd,
        0,
        getStringValue(),
        beginDblvIncntPntlyMedCd,
        DBLV_INCNT_PNTLY_MED_CD_LEN);
    localDblvIncntPntlyMedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvIncntPntlyMedCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDblvIncntPntlyMedCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDblvIncntPntlyMedCd() {
    return (substring(
        getStringValue(),
        beginDblvIncntPntlyMedCd,
        beginDblvIncntPntlyMedCd + DBLV_INCNT_PNTLY_MED_CD_LEN));
  }

  int localDblvIncntPntlyMedPctCounter = -1;

  public boolean isDblvIncntPntlyMedPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvIncntPntlyMedPctCounter != sharedCounter;
    localDblvIncntPntlyMedPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean dblvIncntPntlyMedPctIsNumeric() {
    return decimalIsNumeric(
        beginDblvIncntPntlyMedPct,
        DBLV_INCNT_PNTLY_MED_PCT_LEN); // check Packed Decimal field to see if it contains valid
                                       // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dblvIncntPntlyMedPctString() {
    return getPackedString(beginDblvIncntPntlyMedPct, DBLV_INCNT_PNTLY_MED_PCT_LEN);
  }

  protected static final int DBLV_INCNT_PNTLY_MED_PCT_LEN = 2;
  protected static final int DBLV_INCNT_PNTLY_MED_PCT_SCALE = 2;
  /** serializeDblvIncntPntlyMedPct */
  protected void serializeDblvIncntPntlyMedPct(BigDecimal dblvIncntPntlyMedPct) {
    putDecimal(
        beginDblvIncntPntlyMedPct,
        dblvIncntPntlyMedPct,
        DBLV_INCNT_PNTLY_MED_PCT_LEN,
        DBLV_INCNT_PNTLY_MED_PCT_SCALE,
        true);
    localDblvIncntPntlyMedPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDblvIncntPntlyMedPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }
  /**
   * refreshDblvIncntPntlyMedPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshDblvIncntPntlyMedPct() throws CFException {
    try {
      return (getDecimal(
          beginDblvIncntPntlyMedPct, DBLV_INCNT_PNTLY_MED_PCT_LEN, DBLV_INCNT_PNTLY_MED_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "dblvIncntPntlyMedPct", beginDblvIncntPntlyMedPct, DBLV_INCNT_PNTLY_MED_PCT_LEN);
    }
  }

  int localDblvLstUpdtDttmCounter = -1;

  public boolean isDblvLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvLstUpdtDttmCounter != sharedCounter;
    localDblvLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_LST_UPDT_DTTM_LEN = 26;
  /** serialize this DblvLstUpdtDttm */
  protected void serializeDblvLstUpdtDttm(char[] dblvLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvLstUpdtDttm, 0, getStringValue(), beginDblvLstUpdtDttm, DBLV_LST_UPDT_DTTM_LEN);
    localDblvLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDblvLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvLstUpdtDttm() {
    return (substring(
        getStringValue(), beginDblvLstUpdtDttm, beginDblvLstUpdtDttm + DBLV_LST_UPDT_DTTM_LEN));
  }

  int localDblvLstUpdtUserIdCounter = -1;

  public boolean isDblvLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvLstUpdtUserIdCounter != sharedCounter;
    localDblvLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this DblvLstUpdtUserId */
  protected void serializeDblvLstUpdtUserId(char[] dblvLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dblvLstUpdtUserId, 0, getStringValue(), beginDblvLstUpdtUserId, DBLV_LST_UPDT_USER_ID_LEN);
    localDblvLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshDblvLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvLstUpdtUserId() {
    return (substring(
        getStringValue(),
        beginDblvLstUpdtUserId,
        beginDblvLstUpdtUserId + DBLV_LST_UPDT_USER_ID_LEN));
  }

  int localDblvNewCoinsCdCounter = -1;

  public boolean isDblvNewCoinsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvNewCoinsCdCounter != sharedCounter;
    localDblvNewCoinsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_NEW_COINS_CD_LEN = 1;
  /** serialize this DblvNewCoinsCd */
  protected void serializeDblvNewCoinsCd(char[] dblvNewCoinsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dblvNewCoinsCd, 0, getStringValue(), beginDblvNewCoinsCd, DBLV_NEW_COINS_CD_LEN);
    localDblvNewCoinsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvNewCoinsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDblvNewCoinsCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvNewCoinsCd() {
    return (substring(
        getStringValue(), beginDblvNewCoinsCd, beginDblvNewCoinsCd + DBLV_NEW_COINS_CD_LEN));
  }

  int localDblvOverlayPctCdCounter = -1;

  public boolean isDblvOverlayPctCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDblvOverlayPctCdCounter != sharedCounter;
    localDblvOverlayPctCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBLV_OVERLAY_PCT_CD_LEN = 1;
  /** serialize this DblvOverlayPctCd */
  protected void serializeDblvOverlayPctCd(char[] dblvOverlayPctCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dblvOverlayPctCd, 0, getStringValue(), beginDblvOverlayPctCd, DBLV_OVERLAY_PCT_CD_LEN);
    localDblvOverlayPctCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDblvOverlayPctCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDblvOverlayPctCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDblvOverlayPctCd() {
    return (substring(
        getStringValue(), beginDblvOverlayPctCd, beginDblvOverlayPctCd + DBLV_OVERLAY_PCT_CD_LEN));
  }
}
