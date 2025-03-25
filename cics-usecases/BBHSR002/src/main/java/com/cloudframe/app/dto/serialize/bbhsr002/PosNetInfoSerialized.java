package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class PosNetInfoSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PosNetInfoSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(PosNetInfoSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POS_NET_INFO_LENGTH = 336;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPosSlotTblId;
  protected int beginPosSrvcCd;
  protected int beginPosPlOfSrvcCd;
  protected int beginPosCausCd;
  protected int beginPosBenLvlCd;
  protected int beginPosNetInd;
  protected int beginPosInNtwkClssCd;
  protected int beginPosT1NtwkClssCd;
  protected int beginPosSrvcCdNbr;
  protected int beginPosProcRangeFrom;
  protected int beginPosProcRangeTo;
  protected int beginPosProcCdType;
  protected int beginPosProvOrgTypCd;
  protected int beginHipaaCommtTxt;

  /** Constructor for PosNetInfoSerialized */
  public PosNetInfoSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PosNetInfoSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PosNetInfoSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this PosNetInfoSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 31); // serialize this field at offset 31 by default
  }

  /**
   * sets parent for this PosNetInfoSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 31 by default
  }
  /** initializes the field in PosNetInfoSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POS_NET_INFO_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPosSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginPosSrvcCd = getStartOffset() + 6; // set offset for serialization

    beginPosPlOfSrvcCd = getStartOffset() + 12; // set offset for serialization

    beginPosCausCd = getStartOffset() + 14; // set offset for serialization

    beginPosBenLvlCd = getStartOffset() + 15; // set offset for serialization

    beginPosNetInd = getStartOffset() + 16; // set offset for serialization

    beginPosInNtwkClssCd = getStartOffset() + 17; // set offset for serialization

    beginPosT1NtwkClssCd = getStartOffset() + 18; // set offset for serialization

    beginPosSrvcCdNbr = getStartOffset() + 19; // set offset for serialization

    beginPosProcRangeFrom = getStartOffset() + 22; // set offset for serialization

    beginPosProcRangeTo = getStartOffset() + 27; // set offset for serialization

    beginPosProcCdType = getStartOffset() + 32; // set offset for serialization

    beginPosProvOrgTypCd = getStartOffset() + 33; // set offset for serialization

    beginHipaaCommtTxt = getStartOffset() + 36; // set offset for serialization

    /*  end of offset */
  }

  int localPosSlotTblIdCounter = -1;

  public boolean isPosSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosSlotTblIdCounter != sharedCounter;
    localPosSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_SLOT_TBL_ID_LEN = 6;
  /** serialize this PosSlotTblId */
  protected void serializePosSlotTblId(char[] posSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posSlotTblId, 0, getStringValue(), beginPosSlotTblId, POS_SLOT_TBL_ID_LEN);
    localPosSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPosSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosSlotTblId() {
    return (substring(
        getStringValue(), beginPosSlotTblId, beginPosSlotTblId + POS_SLOT_TBL_ID_LEN));
  }

  int localPosSrvcCdCounter = -1;

  public boolean isPosSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosSrvcCdCounter != sharedCounter;
    localPosSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_SRVC_CD_LEN = 6;
  /** serialize this PosSrvcCd */
  protected void serializePosSrvcCd(char[] posSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posSrvcCd, 0, getStringValue(), beginPosSrvcCd, POS_SRVC_CD_LEN);
    localPosSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPosSrvcCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPosSrvcCd() {
    return (substring(getStringValue(), beginPosSrvcCd, beginPosSrvcCd + POS_SRVC_CD_LEN));
  }

  int localPosPlOfSrvcCdCounter = -1;

  public boolean isPosPlOfSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosPlOfSrvcCdCounter != sharedCounter;
    localPosPlOfSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_PL_OF_SRVC_CD_LEN = 2;
  /** serialize this PosPlOfSrvcCd */
  protected void serializePosPlOfSrvcCd(char[] posPlOfSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posPlOfSrvcCd, 0, getStringValue(), beginPosPlOfSrvcCd, POS_PL_OF_SRVC_CD_LEN);
    localPosPlOfSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosPlOfSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPosPlOfSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosPlOfSrvcCd() {
    return (substring(
        getStringValue(), beginPosPlOfSrvcCd, beginPosPlOfSrvcCd + POS_PL_OF_SRVC_CD_LEN));
  }

  int localPosCausCdCounter = -1;

  public boolean isPosCausCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosCausCdCounter != sharedCounter;
    localPosCausCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_CAUS_CD_LEN = 1;
  /** serialize this PosCausCd */
  protected void serializePosCausCd(char[] posCausCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posCausCd, 0, getStringValue(), beginPosCausCd, POS_CAUS_CD_LEN);
    localPosCausCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosCausCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosCausCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPosCausCd() {
    return (substring(getStringValue(), beginPosCausCd, beginPosCausCd + POS_CAUS_CD_LEN));
  }

  int localPosBenLvlCdCounter = -1;

  public boolean isPosBenLvlCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosBenLvlCdCounter != sharedCounter;
    localPosBenLvlCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_BEN_LVL_CD_LEN = 1;
  /** serialize this PosBenLvlCd */
  protected void serializePosBenLvlCd(char[] posBenLvlCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posBenLvlCd, 0, getStringValue(), beginPosBenLvlCd, POS_BEN_LVL_CD_LEN);
    localPosBenLvlCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosBenLvlCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosBenLvlCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPosBenLvlCd() {
    return (substring(getStringValue(), beginPosBenLvlCd, beginPosBenLvlCd + POS_BEN_LVL_CD_LEN));
  }

  int localPosNetIndCounter = -1;

  public boolean isPosNetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosNetIndCounter != sharedCounter;
    localPosNetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_NET_IND_LEN = 1;
  /** serialize this PosNetInd */
  protected void serializePosNetInd(char[] posNetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posNetInd, 0, getStringValue(), beginPosNetInd, POS_NET_IND_LEN);
    localPosNetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosNetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosNetInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPosNetInd() {
    return (substring(getStringValue(), beginPosNetInd, beginPosNetInd + POS_NET_IND_LEN));
  }

  int localPosInNtwkClssCdCounter = -1;

  public boolean isPosInNtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosInNtwkClssCdCounter != sharedCounter;
    localPosInNtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_IN_NTWK_CLSS_CD_LEN = 1;
  /** serialize this PosInNtwkClssCd */
  protected void serializePosInNtwkClssCd(char[] posInNtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posInNtwkClssCd, 0, getStringValue(), beginPosInNtwkClssCd, POS_IN_NTWK_CLSS_CD_LEN);
    localPosInNtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosInNtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosInNtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosInNtwkClssCd() {
    return (substring(
        getStringValue(), beginPosInNtwkClssCd, beginPosInNtwkClssCd + POS_IN_NTWK_CLSS_CD_LEN));
  }

  int localPosT1NtwkClssCdCounter = -1;

  public boolean isPosT1NtwkClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosT1NtwkClssCdCounter != sharedCounter;
    localPosT1NtwkClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_T_1_NTWK_CLSS_CD_LEN = 1;
  /** serialize this PosT1NtwkClssCd */
  protected void serializePosT1NtwkClssCd(char[] posT1NtwkClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posT1NtwkClssCd, 0, getStringValue(), beginPosT1NtwkClssCd, POS_T_1_NTWK_CLSS_CD_LEN);
    localPosT1NtwkClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosT1NtwkClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosT1NtwkClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosT1NtwkClssCd() {
    return (substring(
        getStringValue(), beginPosT1NtwkClssCd, beginPosT1NtwkClssCd + POS_T_1_NTWK_CLSS_CD_LEN));
  }

  int localPosSrvcCdNbrCounter = -1;

  public boolean isPosSrvcCdNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosSrvcCdNbrCounter != sharedCounter;
    localPosSrvcCdNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_SRVC_CD_NBR_LEN = 3;
  /** serialize this PosSrvcCdNbr */
  protected void serializePosSrvcCdNbr(char[] posSrvcCdNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posSrvcCdNbr, 0, getStringValue(), beginPosSrvcCdNbr, POS_SRVC_CD_NBR_LEN);
    localPosSrvcCdNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosSrvcCdNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPosSrvcCdNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosSrvcCdNbr() {
    return (substring(
        getStringValue(), beginPosSrvcCdNbr, beginPosSrvcCdNbr + POS_SRVC_CD_NBR_LEN));
  }

  int localPosProcRangeFromCounter = -1;

  public boolean isPosProcRangeFromModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosProcRangeFromCounter != sharedCounter;
    localPosProcRangeFromCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_PROC_RANGE_FROM_LEN = 5;
  /** serialize this PosProcRangeFrom */
  protected void serializePosProcRangeFrom(char[] posProcRangeFrom) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        posProcRangeFrom, 0, getStringValue(), beginPosProcRangeFrom, POS_PROC_RANGE_FROM_LEN);
    localPosProcRangeFromCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosProcRangeFromConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshPosProcRangeFrom is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosProcRangeFrom() {
    return (substring(
        getStringValue(), beginPosProcRangeFrom, beginPosProcRangeFrom + POS_PROC_RANGE_FROM_LEN));
  }

  int localPosProcRangeToCounter = -1;

  public boolean isPosProcRangeToModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosProcRangeToCounter != sharedCounter;
    localPosProcRangeToCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_PROC_RANGE_TO_LEN = 5;
  /** serialize this PosProcRangeTo */
  protected void serializePosProcRangeTo(char[] posProcRangeTo) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posProcRangeTo, 0, getStringValue(), beginPosProcRangeTo, POS_PROC_RANGE_TO_LEN);
    localPosProcRangeToCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosProcRangeToConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshPosProcRangeTo is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosProcRangeTo() {
    return (substring(
        getStringValue(), beginPosProcRangeTo, beginPosProcRangeTo + POS_PROC_RANGE_TO_LEN));
  }

  int localPosProcCdTypeCounter = -1;

  public boolean isPosProcCdTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosProcCdTypeCounter != sharedCounter;
    localPosProcCdTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_PROC_CD_TYPE_LEN = 1;
  /** serialize this PosProcCdType */
  protected void serializePosProcCdType(char[] posProcCdType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posProcCdType, 0, getStringValue(), beginPosProcCdType, POS_PROC_CD_TYPE_LEN);
    localPosProcCdTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosProcCdTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosProcCdType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosProcCdType() {
    return (substring(
        getStringValue(), beginPosProcCdType, beginPosProcCdType + POS_PROC_CD_TYPE_LEN));
  }

  int localPosProvOrgTypCdCounter = -1;

  public boolean isPosProvOrgTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosProvOrgTypCdCounter != sharedCounter;
    localPosProvOrgTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_PROV_ORG_TYP_CD_LEN = 3;
  /** serialize this PosProvOrgTypCd */
  protected void serializePosProvOrgTypCd(char[] posProvOrgTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posProvOrgTypCd, 0, getStringValue(), beginPosProvOrgTypCd, POS_PROV_ORG_TYP_CD_LEN);
    localPosProvOrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosProvOrgTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPosProvOrgTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosProvOrgTypCd() {
    return (substring(
        getStringValue(), beginPosProvOrgTypCd, beginPosProvOrgTypCd + POS_PROV_ORG_TYP_CD_LEN));
  }

  int localHipaaCommtTxtCounter = -1;

  public boolean isHipaaCommtTxtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCommtTxtCounter != sharedCounter;
    localHipaaCommtTxtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HIPAA_COMMT_TXT_LEN = 300;
  /** serialize this HipaaCommtTxt */
  protected void serializeHipaaCommtTxt(char[] hipaaCommtTxt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hipaaCommtTxt, 0, getStringValue(), beginHipaaCommtTxt, HIPAA_COMMT_TXT_LEN);
    localHipaaCommtTxtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHipaaCommtTxtConstraints(char[] value) {
    return super.checkConstraints(value, 300, false, false);
  }
  /**
   * refreshHipaaCommtTxt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHipaaCommtTxt() {
    return (substring(
        getStringValue(), beginHipaaCommtTxt, beginHipaaCommtTxt + HIPAA_COMMT_TXT_LEN));
  }
}
