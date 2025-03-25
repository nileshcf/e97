package com.cloudframe.app.dto.serialize.d5427tli;

/**
 * The class DclsrvcAsgnSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclsrvcAsgnSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclsrvcAsgnSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLSRVC_ASGN_LENGTH = 71;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHdrRulLvlTypId;
  protected int beginHdrObligId;
  protected int beginHdrShrArngCd;
  protected int beginHdrPolNbr;
  protected int beginHdrPlnNbr;
  protected int beginHdrProcDt;
  protected int beginHdrEffDt;
  protected int beginHdrCancDt;
  protected int beginHdrSlotTblId;
  protected int beginHdrLstUpdtDt;
  protected int beginHdrLstUpdtUserId;
  protected int beginHdrRowStsCd;

  /** Constructor for DclsrvcAsgnSerialized */
  public DclsrvcAsgnSerialized() {
    init(0);
  }

  /** initializes the field in DclsrvcAsgnSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLSRVC_ASGN_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHdrRulLvlTypId = getStartOffset() + 0; // set offset for serialization

    beginHdrObligId = getStartOffset() + 1; // set offset for serialization

    beginHdrShrArngCd = getStartOffset() + 3; // set offset for serialization

    beginHdrPolNbr = getStartOffset() + 5; // set offset for serialization

    beginHdrPlnNbr = getStartOffset() + 11; // set offset for serialization

    beginHdrProcDt = getStartOffset() + 15; // set offset for serialization

    beginHdrEffDt = getStartOffset() + 25; // set offset for serialization

    beginHdrCancDt = getStartOffset() + 35; // set offset for serialization

    beginHdrSlotTblId = getStartOffset() + 45; // set offset for serialization

    beginHdrLstUpdtDt = getStartOffset() + 51; // set offset for serialization

    beginHdrLstUpdtUserId = getStartOffset() + 61; // set offset for serialization

    beginHdrRowStsCd = getStartOffset() + 70; // set offset for serialization

    /*  end of offset */
  }

  int localHdrRulLvlTypIdCounter = -1;

  public boolean isHdrRulLvlTypIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrRulLvlTypIdCounter != sharedCounter;
    localHdrRulLvlTypIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_RUL_LVL_TYP_ID_LEN = 1;
  /** serialize this HdrRulLvlTypId */
  protected void serializeHdrRulLvlTypId(char[] hdrRulLvlTypId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrRulLvlTypId, 0, getStringValue(), beginHdrRulLvlTypId, HDR_RUL_LVL_TYP_ID_LEN);
    localHdrRulLvlTypIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrRulLvlTypIdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHdrRulLvlTypId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHdrRulLvlTypId() {
    return (substring(
        getStringValue(), beginHdrRulLvlTypId, beginHdrRulLvlTypId + HDR_RUL_LVL_TYP_ID_LEN));
  }

  int localHdrObligIdCounter = -1;

  public boolean isHdrObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrObligIdCounter != sharedCounter;
    localHdrObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_OBLIG_ID_LEN = 2;
  /** serialize this HdrObligId */
  protected void serializeHdrObligId(char[] hdrObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrObligId, 0, getStringValue(), beginHdrObligId, HDR_OBLIG_ID_LEN);
    localHdrObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHdrObligId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHdrObligId() {
    return (substring(getStringValue(), beginHdrObligId, beginHdrObligId + HDR_OBLIG_ID_LEN));
  }

  int localHdrShrArngCdCounter = -1;

  public boolean isHdrShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrShrArngCdCounter != sharedCounter;
    localHdrShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_SHR_ARNG_CD_LEN = 2;
  /** serialize this HdrShrArngCd */
  protected void serializeHdrShrArngCd(char[] hdrShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrShrArngCd, 0, getStringValue(), beginHdrShrArngCd, HDR_SHR_ARNG_CD_LEN);
    localHdrShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHdrShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHdrShrArngCd() {
    return (substring(
        getStringValue(), beginHdrShrArngCd, beginHdrShrArngCd + HDR_SHR_ARNG_CD_LEN));
  }

  int localHdrPolNbrCounter = -1;

  public boolean isHdrPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrPolNbrCounter != sharedCounter;
    localHdrPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_POL_NBR_LEN = 6;
  /** serialize this HdrPolNbr */
  protected void serializeHdrPolNbr(char[] hdrPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrPolNbr, 0, getStringValue(), beginHdrPolNbr, HDR_POL_NBR_LEN);
    localHdrPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshHdrPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHdrPolNbr() {
    return (substring(getStringValue(), beginHdrPolNbr, beginHdrPolNbr + HDR_POL_NBR_LEN));
  }

  int localHdrPlnNbrCounter = -1;

  public boolean isHdrPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrPlnNbrCounter != sharedCounter;
    localHdrPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_PLN_NBR_LEN = 4;
  /** serialize this HdrPlnNbr */
  protected void serializeHdrPlnNbr(char[] hdrPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrPlnNbr, 0, getStringValue(), beginHdrPlnNbr, HDR_PLN_NBR_LEN);
    localHdrPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshHdrPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHdrPlnNbr() {
    return (substring(getStringValue(), beginHdrPlnNbr, beginHdrPlnNbr + HDR_PLN_NBR_LEN));
  }

  int localHdrProcDtCounter = -1;

  public boolean isHdrProcDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrProcDtCounter != sharedCounter;
    localHdrProcDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_PROC_DT_LEN = 10;
  /** serialize this HdrProcDt */
  protected void serializeHdrProcDt(char[] hdrProcDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrProcDt, 0, getStringValue(), beginHdrProcDt, HDR_PROC_DT_LEN);
    localHdrProcDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrProcDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshHdrProcDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHdrProcDt() {
    return (substring(getStringValue(), beginHdrProcDt, beginHdrProcDt + HDR_PROC_DT_LEN));
  }

  int localHdrEffDtCounter = -1;

  public boolean isHdrEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrEffDtCounter != sharedCounter;
    localHdrEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_EFF_DT_LEN = 10;
  /** serialize this HdrEffDt */
  protected void serializeHdrEffDt(char[] hdrEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrEffDt, 0, getStringValue(), beginHdrEffDt, HDR_EFF_DT_LEN);
    localHdrEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshHdrEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHdrEffDt() {
    return (substring(getStringValue(), beginHdrEffDt, beginHdrEffDt + HDR_EFF_DT_LEN));
  }

  int localHdrCancDtCounter = -1;

  public boolean isHdrCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrCancDtCounter != sharedCounter;
    localHdrCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_CANC_DT_LEN = 10;
  /** serialize this HdrCancDt */
  protected void serializeHdrCancDt(char[] hdrCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrCancDt, 0, getStringValue(), beginHdrCancDt, HDR_CANC_DT_LEN);
    localHdrCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshHdrCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHdrCancDt() {
    return (substring(getStringValue(), beginHdrCancDt, beginHdrCancDt + HDR_CANC_DT_LEN));
  }

  int localHdrSlotTblIdCounter = -1;

  public boolean isHdrSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrSlotTblIdCounter != sharedCounter;
    localHdrSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_SLOT_TBL_ID_LEN = 6;
  /** serialize this HdrSlotTblId */
  protected void serializeHdrSlotTblId(char[] hdrSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrSlotTblId, 0, getStringValue(), beginHdrSlotTblId, HDR_SLOT_TBL_ID_LEN);
    localHdrSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshHdrSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHdrSlotTblId() {
    return (substring(
        getStringValue(), beginHdrSlotTblId, beginHdrSlotTblId + HDR_SLOT_TBL_ID_LEN));
  }

  int localHdrLstUpdtDtCounter = -1;

  public boolean isHdrLstUpdtDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrLstUpdtDtCounter != sharedCounter;
    localHdrLstUpdtDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_LST_UPDT_DT_LEN = 10;
  /** serialize this HdrLstUpdtDt */
  protected void serializeHdrLstUpdtDt(char[] hdrLstUpdtDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrLstUpdtDt, 0, getStringValue(), beginHdrLstUpdtDt, HDR_LST_UPDT_DT_LEN);
    localHdrLstUpdtDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrLstUpdtDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshHdrLstUpdtDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHdrLstUpdtDt() {
    return (substring(
        getStringValue(), beginHdrLstUpdtDt, beginHdrLstUpdtDt + HDR_LST_UPDT_DT_LEN));
  }

  int localHdrLstUpdtUserIdCounter = -1;

  public boolean isHdrLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrLstUpdtUserIdCounter != sharedCounter;
    localHdrLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this HdrLstUpdtUserId */
  protected void serializeHdrLstUpdtUserId(char[] hdrLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hdrLstUpdtUserId, 0, getStringValue(), beginHdrLstUpdtUserId, HDR_LST_UPDT_USER_ID_LEN);
    localHdrLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshHdrLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHdrLstUpdtUserId() {
    return (substring(
        getStringValue(), beginHdrLstUpdtUserId, beginHdrLstUpdtUserId + HDR_LST_UPDT_USER_ID_LEN));
  }

  int localHdrRowStsCdCounter = -1;

  public boolean isHdrRowStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrRowStsCdCounter != sharedCounter;
    localHdrRowStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_ROW_STS_CD_LEN = 1;
  /** serialize this HdrRowStsCd */
  protected void serializeHdrRowStsCd(char[] hdrRowStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrRowStsCd, 0, getStringValue(), beginHdrRowStsCd, HDR_ROW_STS_CD_LEN);
    localHdrRowStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrRowStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHdrRowStsCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHdrRowStsCd() {
    return (substring(getStringValue(), beginHdrRowStsCd, beginHdrRowStsCd + HDR_ROW_STS_CD_LEN));
  }
}
