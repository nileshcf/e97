package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class BhiRetBhiDataSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiRetBhiDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiRetBhiDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_RET_BHI_DATA_LENGTH = 337;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiRetHipaaCode;
  protected int beginBhiRetSlotTblId;
  protected int beginBhiRetSrvcCode;
  protected int beginBhiRetPlOfSrvcCd;
  protected int beginBhiRetCausCd;
  protected int beginBhiRetBenLvlCd;
  protected int beginBhiRetNetInd;
  protected int beginBhiRetInNtwkClssCd;
  protected int beginBhiRetTier1NtwkClssCd;
  protected int beginBhiRetProcRangeFrom;
  protected int beginBhiRetProcRangeTo;
  protected int beginBhiRetRowProcType;
  protected int beginBhiRetProvOrgTypCd;
  protected int beginBhiRetHipaaCommtTxtLen;
  protected int beginBhiRetHipaaCommtTxt;

  /** Constructor for BhiRetBhiDataSerialized */
  public BhiRetBhiDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRetBhiDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRetBhiDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiRetBhiDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 30); // serialize this field at offset 30 by default
  }

  /**
   * sets parent for this BhiRetBhiDataSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 30 by default
  }
  /** initializes the field in BhiRetBhiDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_RET_BHI_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiRetHipaaCode = getStartOffset() + 0; // set offset for serialization

    beginBhiRetSlotTblId = getStartOffset() + 2; // set offset for serialization

    beginBhiRetSrvcCode = getStartOffset() + 8; // set offset for serialization

    beginBhiRetPlOfSrvcCd = getStartOffset() + 14; // set offset for serialization

    beginBhiRetCausCd = getStartOffset() + 16; // set offset for serialization

    beginBhiRetBenLvlCd = getStartOffset() + 17; // set offset for serialization

    beginBhiRetNetInd = getStartOffset() + 18; // set offset for serialization

    beginBhiRetInNtwkClssCd = getStartOffset() + 19; // set offset for serialization

    beginBhiRetTier1NtwkClssCd = getStartOffset() + 20; // set offset for serialization

    beginBhiRetProcRangeFrom = getStartOffset() + 21; // set offset for serialization

    beginBhiRetProcRangeTo = getStartOffset() + 26; // set offset for serialization

    beginBhiRetRowProcType = getStartOffset() + 31; // set offset for serialization

    beginBhiRetProvOrgTypCd = getStartOffset() + 32; // set offset for serialization

    beginBhiRetHipaaCommtTxtLen = getStartOffset() + 35; // set offset for serialization

    beginBhiRetHipaaCommtTxt = getStartOffset() + 37; // set offset for serialization

    /*  end of offset */
  }

  int localBhiRetHipaaCodeCounter = -1;

  public boolean isBhiRetHipaaCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetHipaaCodeCounter != sharedCounter;
    localBhiRetHipaaCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_HIPAA_CODE_LEN = 2;
  /** serialize this BhiRetHipaaCode */
  protected void serializeBhiRetHipaaCode(char[] bhiRetHipaaCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRetHipaaCode, 0, getStringValue(), beginBhiRetHipaaCode, BHI_RET_HIPAA_CODE_LEN);
    localBhiRetHipaaCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetHipaaCodeConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiRetHipaaCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetHipaaCode() {
    return (substring(
        getStringValue(), beginBhiRetHipaaCode, beginBhiRetHipaaCode + BHI_RET_HIPAA_CODE_LEN));
  }

  int localBhiRetSlotTblIdCounter = -1;

  public boolean isBhiRetSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetSlotTblIdCounter != sharedCounter;
    localBhiRetSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_SLOT_TBL_ID_LEN = 6;
  /** serialize this BhiRetSlotTblId */
  protected void serializeBhiRetSlotTblId(char[] bhiRetSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRetSlotTblId, 0, getStringValue(), beginBhiRetSlotTblId, BHI_RET_SLOT_TBL_ID_LEN);
    localBhiRetSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiRetSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetSlotTblId() {
    return (substring(
        getStringValue(), beginBhiRetSlotTblId, beginBhiRetSlotTblId + BHI_RET_SLOT_TBL_ID_LEN));
  }

  int localBhiRetSrvcCodeCounter = -1;

  public boolean isBhiRetSrvcCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetSrvcCodeCounter != sharedCounter;
    localBhiRetSrvcCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_SRVC_CODE_LEN = 6;
  /** serialize this BhiRetSrvcCode */
  protected void serializeBhiRetSrvcCode(char[] bhiRetSrvcCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRetSrvcCode, 0, getStringValue(), beginBhiRetSrvcCode, BHI_RET_SRVC_CODE_LEN);
    localBhiRetSrvcCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetSrvcCodeConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiRetSrvcCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetSrvcCode() {
    return (substring(
        getStringValue(), beginBhiRetSrvcCode, beginBhiRetSrvcCode + BHI_RET_SRVC_CODE_LEN));
  }

  int localBhiRetPlOfSrvcCdCounter = -1;

  public boolean isBhiRetPlOfSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetPlOfSrvcCdCounter != sharedCounter;
    localBhiRetPlOfSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_PL_OF_SRVC_CD_LEN = 2;
  /** serialize this BhiRetPlOfSrvcCd */
  protected void serializeBhiRetPlOfSrvcCd(char[] bhiRetPlOfSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetPlOfSrvcCd, 0, getStringValue(), beginBhiRetPlOfSrvcCd, BHI_RET_PL_OF_SRVC_CD_LEN);
    localBhiRetPlOfSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetPlOfSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiRetPlOfSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetPlOfSrvcCd() {
    return (substring(
        getStringValue(),
        beginBhiRetPlOfSrvcCd,
        beginBhiRetPlOfSrvcCd + BHI_RET_PL_OF_SRVC_CD_LEN));
  }

  int localBhiRetCausCdCounter = -1;

  public boolean isBhiRetCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetCausCdCounter != sharedCounter;
    localBhiRetCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_CAUS_CD_LEN = 1;
  /** serialize this BhiRetCausCd */
  protected void serializeBhiRetCausCd(char[] bhiRetCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRetCausCd, 0, getStringValue(), beginBhiRetCausCd, BHI_RET_CAUS_CD_LEN);
    localBhiRetCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRetCausCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetCausCd() {
    return (substring(
        getStringValue(), beginBhiRetCausCd, beginBhiRetCausCd + BHI_RET_CAUS_CD_LEN));
  }

  int localBhiRetBenLvlCdCounter = -1;

  public boolean isBhiRetBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetBenLvlCdCounter != sharedCounter;
    localBhiRetBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_BEN_LVL_CD_LEN = 1;
  /** serialize this BhiRetBenLvlCd */
  protected void serializeBhiRetBenLvlCd(char[] bhiRetBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRetBenLvlCd, 0, getStringValue(), beginBhiRetBenLvlCd, BHI_RET_BEN_LVL_CD_LEN);
    localBhiRetBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRetBenLvlCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetBenLvlCd() {
    return (substring(
        getStringValue(), beginBhiRetBenLvlCd, beginBhiRetBenLvlCd + BHI_RET_BEN_LVL_CD_LEN));
  }

  int localBhiRetNetIndCounter = -1;

  public boolean isBhiRetNetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetNetIndCounter != sharedCounter;
    localBhiRetNetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_NET_IND_LEN = 1;
  /** serialize this BhiRetNetInd */
  protected void serializeBhiRetNetInd(char[] bhiRetNetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRetNetInd, 0, getStringValue(), beginBhiRetNetInd, BHI_RET_NET_IND_LEN);
    localBhiRetNetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetNetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRetNetInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetNetInd() {
    return (substring(
        getStringValue(), beginBhiRetNetInd, beginBhiRetNetInd + BHI_RET_NET_IND_LEN));
  }

  int localBhiRetInNtwkClssCdCounter = -1;

  public boolean isBhiRetInNtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetInNtwkClssCdCounter != sharedCounter;
    localBhiRetInNtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_IN_NTWK_CLSS_CD_LEN = 1;
  /** serialize this BhiRetInNtwkClssCd */
  protected void serializeBhiRetInNtwkClssCd(char[] bhiRetInNtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetInNtwkClssCd,
        0,
        getStringValue(),
        beginBhiRetInNtwkClssCd,
        BHI_RET_IN_NTWK_CLSS_CD_LEN);
    localBhiRetInNtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetInNtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRetInNtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetInNtwkClssCd() {
    return (substring(
        getStringValue(),
        beginBhiRetInNtwkClssCd,
        beginBhiRetInNtwkClssCd + BHI_RET_IN_NTWK_CLSS_CD_LEN));
  }

  int localBhiRetTier1NtwkClssCdCounter = -1;

  public boolean isBhiRetTier1NtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetTier1NtwkClssCdCounter != sharedCounter;
    localBhiRetTier1NtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_TIER_1_NTWK_CLSS_CD_LEN = 1;
  /** serialize this BhiRetTier1NtwkClssCd */
  protected void serializeBhiRetTier1NtwkClssCd(char[] bhiRetTier1NtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetTier1NtwkClssCd,
        0,
        getStringValue(),
        beginBhiRetTier1NtwkClssCd,
        BHI_RET_TIER_1_NTWK_CLSS_CD_LEN);
    localBhiRetTier1NtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetTier1NtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRetTier1NtwkClssCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetTier1NtwkClssCd() {
    return (substring(
        getStringValue(),
        beginBhiRetTier1NtwkClssCd,
        beginBhiRetTier1NtwkClssCd + BHI_RET_TIER_1_NTWK_CLSS_CD_LEN));
  }

  int localBhiRetProcRangeFromCounter = -1;

  public boolean isBhiRetProcRangeFromModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetProcRangeFromCounter != sharedCounter;
    localBhiRetProcRangeFromCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_PROC_RANGE_FROM_LEN = 5;
  /** serialize this BhiRetProcRangeFrom */
  protected void serializeBhiRetProcRangeFrom(char[] bhiRetProcRangeFrom) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetProcRangeFrom,
        0,
        getStringValue(),
        beginBhiRetProcRangeFrom,
        BHI_RET_PROC_RANGE_FROM_LEN);
    localBhiRetProcRangeFromCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetProcRangeFromConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshBhiRetProcRangeFrom is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetProcRangeFrom() {
    return (substring(
        getStringValue(),
        beginBhiRetProcRangeFrom,
        beginBhiRetProcRangeFrom + BHI_RET_PROC_RANGE_FROM_LEN));
  }

  int localBhiRetProcRangeToCounter = -1;

  public boolean isBhiRetProcRangeToModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetProcRangeToCounter != sharedCounter;
    localBhiRetProcRangeToCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_PROC_RANGE_TO_LEN = 5;
  /** serialize this BhiRetProcRangeTo */
  protected void serializeBhiRetProcRangeTo(char[] bhiRetProcRangeTo) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetProcRangeTo, 0, getStringValue(), beginBhiRetProcRangeTo, BHI_RET_PROC_RANGE_TO_LEN);
    localBhiRetProcRangeToCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetProcRangeToConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshBhiRetProcRangeTo is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetProcRangeTo() {
    return (substring(
        getStringValue(),
        beginBhiRetProcRangeTo,
        beginBhiRetProcRangeTo + BHI_RET_PROC_RANGE_TO_LEN));
  }

  int localBhiRetRowProcTypeCounter = -1;

  public boolean isBhiRetRowProcTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetRowProcTypeCounter != sharedCounter;
    localBhiRetRowProcTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_ROW_PROC_TYPE_LEN = 1;
  /** serialize this BhiRetRowProcType */
  protected void serializeBhiRetRowProcType(char[] bhiRetRowProcType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetRowProcType, 0, getStringValue(), beginBhiRetRowProcType, BHI_RET_ROW_PROC_TYPE_LEN);
    localBhiRetRowProcTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetRowProcTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRetRowProcType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetRowProcType() {
    return (substring(
        getStringValue(),
        beginBhiRetRowProcType,
        beginBhiRetRowProcType + BHI_RET_ROW_PROC_TYPE_LEN));
  }

  int localBhiRetProvOrgTypCdCounter = -1;

  public boolean isBhiRetProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetProvOrgTypCdCounter != sharedCounter;
    localBhiRetProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this BhiRetProvOrgTypCd */
  protected void serializeBhiRetProvOrgTypCd(char[] bhiRetProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetProvOrgTypCd,
        0,
        getStringValue(),
        beginBhiRetProvOrgTypCd,
        BHI_RET_PROV_ORG_TYP_CD_LEN);
    localBhiRetProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshBhiRetProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetProvOrgTypCd() {
    return (substring(
        getStringValue(),
        beginBhiRetProvOrgTypCd,
        beginBhiRetProvOrgTypCd + BHI_RET_PROV_ORG_TYP_CD_LEN));
  }

  int localBhiRetHipaaCommtTxtLenCounter = -1;

  public boolean isBhiRetHipaaCommtTxtLenModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetHipaaCommtTxtLenCounter != sharedCounter;
    localBhiRetHipaaCommtTxtLenCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_HIPAA_COMMT_TXT_LEN_LEN = 2;
  /** serializeBhiRetHipaaCommtTxtLen */
  protected void serializeBhiRetHipaaCommtTxtLen(short bhiRetHipaaCommtTxtLen) {
    replaceValue( //  save the value as string
        getBinaryString(bhiRetHipaaCommtTxtLen, BHI_RET_HIPAA_COMMT_TXT_LEN_LEN),
        beginBhiRetHipaaCommtTxtLen,
        BHI_RET_HIPAA_COMMT_TXT_LEN_LEN);
    localBhiRetHipaaCommtTxtLenCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkBhiRetHipaaCommtTxtLenMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshBhiRetHipaaCommtTxtLen is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshBhiRetHipaaCommtTxtLen() {
    return (getShort(beginBhiRetHipaaCommtTxtLen));
  }

  int localBhiRetHipaaCommtTxtCounter = -1;

  public boolean isBhiRetHipaaCommtTxtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetHipaaCommtTxtCounter != sharedCounter;
    localBhiRetHipaaCommtTxtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_RET_HIPAA_COMMT_TXT_LEN = 300;
  /** serialize this BhiRetHipaaCommtTxt */
  protected void serializeBhiRetHipaaCommtTxt(char[] bhiRetHipaaCommtTxt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiRetHipaaCommtTxt,
        0,
        getStringValue(),
        beginBhiRetHipaaCommtTxt,
        BHI_RET_HIPAA_COMMT_TXT_LEN);
    localBhiRetHipaaCommtTxtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRetHipaaCommtTxtConstraints(char[] value) {
    return super.checkConstraints(value, 300, false, false);
  }
  /**
   * refreshBhiRetHipaaCommtTxt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshBhiRetHipaaCommtTxt() {
    return (substring(
        getStringValue(),
        beginBhiRetHipaaCommtTxt,
        beginBhiRetHipaaCommtTxt + BHI_RET_HIPAA_COMMT_TXT_LEN));
  }
}
