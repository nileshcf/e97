package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrRetNetInfoSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrRetNetInfoSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrRetNetInfoSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_RET_NET_INFO_LENGTH = 336;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrRetSlotTblId;
  protected int beginHsrRetSrvcCd;
  protected int beginHsrRetPlOfSrvcCd;
  protected int beginHsrRetCausCd;
  protected int beginHsrRetBenLvlCd;
  protected int beginHsrRetNetInd;
  protected int beginHsrRetInNtwkClssCd;
  protected int beginHsrRetT1NtwkClssCd;
  protected int beginHsrRetSrvcCdNbr;
  protected int beginHsrRetProcRangeFrom;
  protected int beginHsrRetProcRangeTo;
  protected int beginHsrRetProcCdType;
  protected int beginHsrRetProvOrgTypCd;
  protected int beginHsrRetHipaaCommtTxt;

  /** Constructor for HsrRetNetInfoSerialized */
  public HsrRetNetInfoSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetNetInfoSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetNetInfoSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrRetNetInfoSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 30); // serialize this field at offset 30 by default
  }

  /**
   * sets parent for this HsrRetNetInfoSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 30 by default
  }
  /** initializes the field in HsrRetNetInfoSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_RET_NET_INFO_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrRetSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginHsrRetSrvcCd = getStartOffset() + 6; // set offset for serialization

    beginHsrRetPlOfSrvcCd = getStartOffset() + 12; // set offset for serialization

    beginHsrRetCausCd = getStartOffset() + 14; // set offset for serialization

    beginHsrRetBenLvlCd = getStartOffset() + 15; // set offset for serialization

    beginHsrRetNetInd = getStartOffset() + 16; // set offset for serialization

    beginHsrRetInNtwkClssCd = getStartOffset() + 17; // set offset for serialization

    beginHsrRetT1NtwkClssCd = getStartOffset() + 18; // set offset for serialization

    beginHsrRetSrvcCdNbr = getStartOffset() + 19; // set offset for serialization

    beginHsrRetProcRangeFrom = getStartOffset() + 22; // set offset for serialization

    beginHsrRetProcRangeTo = getStartOffset() + 27; // set offset for serialization

    beginHsrRetProcCdType = getStartOffset() + 32; // set offset for serialization

    beginHsrRetProvOrgTypCd = getStartOffset() + 33; // set offset for serialization

    beginHsrRetHipaaCommtTxt = getStartOffset() + 36; // set offset for serialization

    /*  end of offset */
  }

  int localHsrRetSlotTblIdCounter = -1;

  public boolean isHsrRetSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetSlotTblIdCounter != sharedCounter;
    localHsrRetSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_SLOT_TBL_ID_LEN = 6;
  /** serialize this HsrRetSlotTblId */
  protected void serializeHsrRetSlotTblId(char[] hsrRetSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetSlotTblId, 0, getStringValue(), beginHsrRetSlotTblId, HSR_RET_SLOT_TBL_ID_LEN);
    localHsrRetSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshHsrRetSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetSlotTblId() {
    return (substring(
        getStringValue(), beginHsrRetSlotTblId, beginHsrRetSlotTblId + HSR_RET_SLOT_TBL_ID_LEN));
  }

  int localHsrRetSrvcCdCounter = -1;

  public boolean isHsrRetSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetSrvcCdCounter != sharedCounter;
    localHsrRetSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_SRVC_CD_LEN = 6;
  /** serialize this HsrRetSrvcCd */
  protected void serializeHsrRetSrvcCd(char[] hsrRetSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetSrvcCd, 0, getStringValue(), beginHsrRetSrvcCd, HSR_RET_SRVC_CD_LEN);
    localHsrRetSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshHsrRetSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetSrvcCd() {
    return (substring(
        getStringValue(), beginHsrRetSrvcCd, beginHsrRetSrvcCd + HSR_RET_SRVC_CD_LEN));
  }

  int localHsrRetPlOfSrvcCdCounter = -1;

  public boolean isHsrRetPlOfSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetPlOfSrvcCdCounter != sharedCounter;
    localHsrRetPlOfSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_PL_OF_SRVC_CD_LEN = 2;
  /** serialize this HsrRetPlOfSrvcCd */
  protected void serializeHsrRetPlOfSrvcCd(char[] hsrRetPlOfSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetPlOfSrvcCd, 0, getStringValue(), beginHsrRetPlOfSrvcCd, HSR_RET_PL_OF_SRVC_CD_LEN);
    localHsrRetPlOfSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetPlOfSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHsrRetPlOfSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetPlOfSrvcCd() {
    return (substring(
        getStringValue(),
        beginHsrRetPlOfSrvcCd,
        beginHsrRetPlOfSrvcCd + HSR_RET_PL_OF_SRVC_CD_LEN));
  }

  int localHsrRetCausCdCounter = -1;

  public boolean isHsrRetCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetCausCdCounter != sharedCounter;
    localHsrRetCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_CAUS_CD_LEN = 1;
  /** serialize this HsrRetCausCd */
  protected void serializeHsrRetCausCd(char[] hsrRetCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetCausCd, 0, getStringValue(), beginHsrRetCausCd, HSR_RET_CAUS_CD_LEN);
    localHsrRetCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetCausCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetCausCd() {
    return (substring(
        getStringValue(), beginHsrRetCausCd, beginHsrRetCausCd + HSR_RET_CAUS_CD_LEN));
  }

  int localHsrRetBenLvlCdCounter = -1;

  public boolean isHsrRetBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetBenLvlCdCounter != sharedCounter;
    localHsrRetBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_BEN_LVL_CD_LEN = 1;
  /** serialize this HsrRetBenLvlCd */
  protected void serializeHsrRetBenLvlCd(char[] hsrRetBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetBenLvlCd, 0, getStringValue(), beginHsrRetBenLvlCd, HSR_RET_BEN_LVL_CD_LEN);
    localHsrRetBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetBenLvlCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetBenLvlCd() {
    return (substring(
        getStringValue(), beginHsrRetBenLvlCd, beginHsrRetBenLvlCd + HSR_RET_BEN_LVL_CD_LEN));
  }

  int localHsrRetNetIndCounter = -1;

  public boolean isHsrRetNetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetNetIndCounter != sharedCounter;
    localHsrRetNetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_NET_IND_LEN = 1;
  /** serialize this HsrRetNetInd */
  protected void serializeHsrRetNetInd(char[] hsrRetNetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetNetInd, 0, getStringValue(), beginHsrRetNetInd, HSR_RET_NET_IND_LEN);
    localHsrRetNetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetNetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetNetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetNetInd() {
    return (substring(
        getStringValue(), beginHsrRetNetInd, beginHsrRetNetInd + HSR_RET_NET_IND_LEN));
  }

  int localHsrRetInNtwkClssCdCounter = -1;

  public boolean isHsrRetInNtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetInNtwkClssCdCounter != sharedCounter;
    localHsrRetInNtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_IN_NTWK_CLSS_CD_LEN = 1;
  /** serialize this HsrRetInNtwkClssCd */
  protected void serializeHsrRetInNtwkClssCd(char[] hsrRetInNtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetInNtwkClssCd,
        0,
        getStringValue(),
        beginHsrRetInNtwkClssCd,
        HSR_RET_IN_NTWK_CLSS_CD_LEN);
    localHsrRetInNtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetInNtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetInNtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetInNtwkClssCd() {
    return (substring(
        getStringValue(),
        beginHsrRetInNtwkClssCd,
        beginHsrRetInNtwkClssCd + HSR_RET_IN_NTWK_CLSS_CD_LEN));
  }

  int localHsrRetT1NtwkClssCdCounter = -1;

  public boolean isHsrRetT1NtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetT1NtwkClssCdCounter != sharedCounter;
    localHsrRetT1NtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_T_1_NTWK_CLSS_CD_LEN = 1;
  /** serialize this HsrRetT1NtwkClssCd */
  protected void serializeHsrRetT1NtwkClssCd(char[] hsrRetT1NtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetT1NtwkClssCd,
        0,
        getStringValue(),
        beginHsrRetT1NtwkClssCd,
        HSR_RET_T_1_NTWK_CLSS_CD_LEN);
    localHsrRetT1NtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetT1NtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetT1NtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetT1NtwkClssCd() {
    return (substring(
        getStringValue(),
        beginHsrRetT1NtwkClssCd,
        beginHsrRetT1NtwkClssCd + HSR_RET_T_1_NTWK_CLSS_CD_LEN));
  }

  int localHsrRetSrvcCdNbrCounter = -1;

  public boolean isHsrRetSrvcCdNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetSrvcCdNbrCounter != sharedCounter;
    localHsrRetSrvcCdNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_SRVC_CD_NBR_LEN = 3;
  /** serialize this HsrRetSrvcCdNbr */
  protected void serializeHsrRetSrvcCdNbr(char[] hsrRetSrvcCdNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetSrvcCdNbr, 0, getStringValue(), beginHsrRetSrvcCdNbr, HSR_RET_SRVC_CD_NBR_LEN);
    localHsrRetSrvcCdNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetSrvcCdNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshHsrRetSrvcCdNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetSrvcCdNbr() {
    return (substring(
        getStringValue(), beginHsrRetSrvcCdNbr, beginHsrRetSrvcCdNbr + HSR_RET_SRVC_CD_NBR_LEN));
  }

  int localHsrRetProcRangeFromCounter = -1;

  public boolean isHsrRetProcRangeFromModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetProcRangeFromCounter != sharedCounter;
    localHsrRetProcRangeFromCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_PROC_RANGE_FROM_LEN = 5;
  /** serialize this HsrRetProcRangeFrom */
  protected void serializeHsrRetProcRangeFrom(char[] hsrRetProcRangeFrom) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetProcRangeFrom,
        0,
        getStringValue(),
        beginHsrRetProcRangeFrom,
        HSR_RET_PROC_RANGE_FROM_LEN);
    localHsrRetProcRangeFromCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetProcRangeFromConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshHsrRetProcRangeFrom is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetProcRangeFrom() {
    return (substring(
        getStringValue(),
        beginHsrRetProcRangeFrom,
        beginHsrRetProcRangeFrom + HSR_RET_PROC_RANGE_FROM_LEN));
  }

  int localHsrRetProcRangeToCounter = -1;

  public boolean isHsrRetProcRangeToModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetProcRangeToCounter != sharedCounter;
    localHsrRetProcRangeToCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_PROC_RANGE_TO_LEN = 5;
  /** serialize this HsrRetProcRangeTo */
  protected void serializeHsrRetProcRangeTo(char[] hsrRetProcRangeTo) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetProcRangeTo, 0, getStringValue(), beginHsrRetProcRangeTo, HSR_RET_PROC_RANGE_TO_LEN);
    localHsrRetProcRangeToCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetProcRangeToConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshHsrRetProcRangeTo is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetProcRangeTo() {
    return (substring(
        getStringValue(),
        beginHsrRetProcRangeTo,
        beginHsrRetProcRangeTo + HSR_RET_PROC_RANGE_TO_LEN));
  }

  int localHsrRetProcCdTypeCounter = -1;

  public boolean isHsrRetProcCdTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetProcCdTypeCounter != sharedCounter;
    localHsrRetProcCdTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_PROC_CD_TYPE_LEN = 1;
  /** serialize this HsrRetProcCdType */
  protected void serializeHsrRetProcCdType(char[] hsrRetProcCdType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetProcCdType, 0, getStringValue(), beginHsrRetProcCdType, HSR_RET_PROC_CD_TYPE_LEN);
    localHsrRetProcCdTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetProcCdTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetProcCdType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetProcCdType() {
    return (substring(
        getStringValue(), beginHsrRetProcCdType, beginHsrRetProcCdType + HSR_RET_PROC_CD_TYPE_LEN));
  }

  int localHsrRetProvOrgTypCdCounter = -1;

  public boolean isHsrRetProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetProvOrgTypCdCounter != sharedCounter;
    localHsrRetProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this HsrRetProvOrgTypCd */
  protected void serializeHsrRetProvOrgTypCd(char[] hsrRetProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetProvOrgTypCd,
        0,
        getStringValue(),
        beginHsrRetProvOrgTypCd,
        HSR_RET_PROV_ORG_TYP_CD_LEN);
    localHsrRetProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshHsrRetProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetProvOrgTypCd() {
    return (substring(
        getStringValue(),
        beginHsrRetProvOrgTypCd,
        beginHsrRetProvOrgTypCd + HSR_RET_PROV_ORG_TYP_CD_LEN));
  }

  int localHsrRetHipaaCommtTxtCounter = -1;

  public boolean isHsrRetHipaaCommtTxtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetHipaaCommtTxtCounter != sharedCounter;
    localHsrRetHipaaCommtTxtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_HIPAA_COMMT_TXT_LEN = 300;
  /** serialize this HsrRetHipaaCommtTxt */
  protected void serializeHsrRetHipaaCommtTxt(char[] hsrRetHipaaCommtTxt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetHipaaCommtTxt,
        0,
        getStringValue(),
        beginHsrRetHipaaCommtTxt,
        HSR_RET_HIPAA_COMMT_TXT_LEN);
    localHsrRetHipaaCommtTxtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetHipaaCommtTxtConstraints(char[] value) {
    return super.checkConstraints(value, 300, false, false);
  }
  /**
   * refreshHsrRetHipaaCommtTxt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetHipaaCommtTxt() {
    return (substring(
        getStringValue(),
        beginHsrRetHipaaCommtTxt,
        beginHsrRetHipaaCommtTxt + HSR_RET_HIPAA_COMMT_TXT_LEN));
  }
}
