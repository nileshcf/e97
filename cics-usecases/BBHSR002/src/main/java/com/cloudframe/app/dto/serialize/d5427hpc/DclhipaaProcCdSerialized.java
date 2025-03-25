package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class DclhipaaProcCdSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclhipaaProcCdSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclhipaaProcCdSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLHIPAA_PROC_CD_LENGTH = 138;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHipaaCd;
  protected int beginHipaaVerNbr;
  protected int beginEffDt;
  protected int beginCancDt;
  protected int beginCreatDttm;
  protected int beginLstUpdtDttm;
  protected int beginLstUpdtUserId;
  protected int beginBenFndViewInd;
  protected int beginHipaaCdTxt;
  protected int beginGrnrcRqstCd;
  protected int beginHipaaGrpCd;

  /** Constructor for DclhipaaProcCdSerialized */
  public DclhipaaProcCdSerialized() {
    init(0);
  }

  /** initializes the field in DclhipaaProcCdSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLHIPAA_PROC_CD_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHipaaCd = getStartOffset() + 0; // set offset for serialization

    beginHipaaVerNbr = getStartOffset() + 2; // set offset for serialization

    beginEffDt = getStartOffset() + 3; // set offset for serialization

    beginCancDt = getStartOffset() + 13; // set offset for serialization

    beginCreatDttm = getStartOffset() + 23; // set offset for serialization

    beginLstUpdtDttm = getStartOffset() + 49; // set offset for serialization

    beginLstUpdtUserId = getStartOffset() + 75; // set offset for serialization

    beginBenFndViewInd = getStartOffset() + 84; // set offset for serialization

    beginHipaaCdTxt = getStartOffset() + 85; // set offset for serialization

    beginGrnrcRqstCd = getStartOffset() + 135; // set offset for serialization

    beginHipaaGrpCd = getStartOffset() + 136; // set offset for serialization

    /*  end of offset */
  }

  int localHipaaCdCounter = -1;

  public boolean isHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCdCounter != sharedCounter;
    localHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HIPAA_CD_LEN = 2;
  /** serialize this HipaaCd */
  protected void serializeHipaaCd(char[] hipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hipaaCd, 0, getStringValue(), beginHipaaCd, HIPAA_CD_LEN);
    localHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHipaaCd is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHipaaCd() {
    return (substring(getStringValue(), beginHipaaCd, beginHipaaCd + HIPAA_CD_LEN));
  }

  int localHipaaVerNbrCounter = -1;

  public boolean isHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaVerNbrCounter != sharedCounter;
    localHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HIPAA_VER_NBR_LEN = 1;
  /** serialize this HipaaVerNbr */
  protected void serializeHipaaVerNbr(char[] hipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hipaaVerNbr, 0, getStringValue(), beginHipaaVerNbr, HIPAA_VER_NBR_LEN);
    localHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHipaaVerNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHipaaVerNbr() {
    return (substring(getStringValue(), beginHipaaVerNbr, beginHipaaVerNbr + HIPAA_VER_NBR_LEN));
  }

  int localEffDtCounter = -1;

  public boolean isEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localEffDtCounter != sharedCounter;
    localEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int EFF_DT_LEN = 10;
  /** serialize this EffDt */
  protected void serializeEffDt(char[] effDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(effDt, 0, getStringValue(), beginEffDt, EFF_DT_LEN);
    localEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshEffDt is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshEffDt() {
    return (substring(getStringValue(), beginEffDt, beginEffDt + EFF_DT_LEN));
  }

  int localCancDtCounter = -1;

  public boolean isCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCancDtCounter != sharedCounter;
    localCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CANC_DT_LEN = 10;
  /** serialize this CancDt */
  protected void serializeCancDt(char[] cancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(cancDt, 0, getStringValue(), beginCancDt, CANC_DT_LEN);
    localCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCancDt is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCancDt() {
    return (substring(getStringValue(), beginCancDt, beginCancDt + CANC_DT_LEN));
  }

  int localCreatDttmCounter = -1;

  public boolean isCreatDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCreatDttmCounter != sharedCounter;
    localCreatDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CREAT_DTTM_LEN = 26;
  /** serialize this CreatDttm */
  protected void serializeCreatDttm(char[] creatDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(creatDttm, 0, getStringValue(), beginCreatDttm, CREAT_DTTM_LEN);
    localCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCreatDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshCreatDttm is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCreatDttm() {
    return (substring(getStringValue(), beginCreatDttm, beginCreatDttm + CREAT_DTTM_LEN));
  }

  int localLstUpdtDttmCounter = -1;

  public boolean isLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLstUpdtDttmCounter != sharedCounter;
    localLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int LST_UPDT_DTTM_LEN = 26;
  /** serialize this LstUpdtDttm */
  protected void serializeLstUpdtDttm(char[] lstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(lstUpdtDttm, 0, getStringValue(), beginLstUpdtDttm, LST_UPDT_DTTM_LEN);
    localLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshLstUpdtDttm() {
    return (substring(getStringValue(), beginLstUpdtDttm, beginLstUpdtDttm + LST_UPDT_DTTM_LEN));
  }

  int localLstUpdtUserIdCounter = -1;

  public boolean isLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLstUpdtUserIdCounter != sharedCounter;
    localLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int LST_UPDT_USER_ID_LEN = 9;
  /** serialize this LstUpdtUserId */
  protected void serializeLstUpdtUserId(char[] lstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(lstUpdtUserId, 0, getStringValue(), beginLstUpdtUserId, LST_UPDT_USER_ID_LEN);
    localLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshLstUpdtUserId() {
    return (substring(
        getStringValue(), beginLstUpdtUserId, beginLstUpdtUserId + LST_UPDT_USER_ID_LEN));
  }

  int localBenFndViewIndCounter = -1;

  public boolean isBenFndViewIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBenFndViewIndCounter != sharedCounter;
    localBenFndViewIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BEN_FND_VIEW_IND_LEN = 1;
  /** serialize this BenFndViewInd */
  protected void serializeBenFndViewInd(char[] benFndViewInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(benFndViewInd, 0, getStringValue(), beginBenFndViewInd, BEN_FND_VIEW_IND_LEN);
    localBenFndViewIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBenFndViewIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBenFndViewInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBenFndViewInd() {
    return (substring(
        getStringValue(), beginBenFndViewInd, beginBenFndViewInd + BEN_FND_VIEW_IND_LEN));
  }

  int localHipaaCdTxtCounter = -1;

  public boolean isHipaaCdTxtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCdTxtCounter != sharedCounter;
    localHipaaCdTxtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HIPAA_CD_TXT_LEN = 50;
  /** serialize this HipaaCdTxt */
  protected void serializeHipaaCdTxt(char[] hipaaCdTxt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hipaaCdTxt, 0, getStringValue(), beginHipaaCdTxt, HIPAA_CD_TXT_LEN);
    localHipaaCdTxtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHipaaCdTxtConstraints(char[] value) {
    return super.checkConstraints(value, 50, false, false);
  }
  /**
   * refreshHipaaCdTxt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHipaaCdTxt() {
    return (substring(getStringValue(), beginHipaaCdTxt, beginHipaaCdTxt + HIPAA_CD_TXT_LEN));
  }

  int localGrnrcRqstCdCounter = -1;

  public boolean isGrnrcRqstCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGrnrcRqstCdCounter != sharedCounter;
    localGrnrcRqstCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GRNRC_RQST_CD_LEN = 1;
  /** serialize this GrnrcRqstCd */
  protected void serializeGrnrcRqstCd(char[] grnrcRqstCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(grnrcRqstCd, 0, getStringValue(), beginGrnrcRqstCd, GRNRC_RQST_CD_LEN);
    localGrnrcRqstCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGrnrcRqstCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshGrnrcRqstCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGrnrcRqstCd() {
    return (substring(getStringValue(), beginGrnrcRqstCd, beginGrnrcRqstCd + GRNRC_RQST_CD_LEN));
  }

  int localHipaaGrpCdCounter = -1;

  public boolean isHipaaGrpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaGrpCdCounter != sharedCounter;
    localHipaaGrpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HIPAA_GRP_CD_LEN = 2;
  /** serialize this HipaaGrpCd */
  protected void serializeHipaaGrpCd(char[] hipaaGrpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hipaaGrpCd, 0, getStringValue(), beginHipaaGrpCd, HIPAA_GRP_CD_LEN);
    localHipaaGrpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHipaaGrpCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHipaaGrpCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHipaaGrpCd() {
    return (substring(getStringValue(), beginHipaaGrpCd, beginHipaaGrpCd + HIPAA_GRP_CD_LEN));
  }
}
