package com.cloudframe.app.dto.serialize.d5427scn;

/**
 * The class DclsrvcCdTransTblSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclsrvcCdTransTblSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclsrvcCdTransTblSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLSRVC_CD_TRANS_TBL_LENGTH = 84;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginSvcaSrvcCd;
  protected int beginSvcaSrvcCdNbr;
  protected int beginSvcaSrvcCdTxt;
  protected int beginSvcaEffDt;
  protected int beginSvcaCancDt;
  protected int beginSvcaLstUpdtDttm;
  protected int beginSvcaLstUpdtUserId;

  /** Constructor for DclsrvcCdTransTblSerialized */
  public DclsrvcCdTransTblSerialized() {
    init(0);
  }

  /** initializes the field in DclsrvcCdTransTblSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLSRVC_CD_TRANS_TBL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginSvcaSrvcCd = getStartOffset() + 0; // set offset for serialization

    beginSvcaSrvcCdNbr = getStartOffset() + 6; // set offset for serialization

    beginSvcaSrvcCdTxt = getStartOffset() + 9; // set offset for serialization

    beginSvcaEffDt = getStartOffset() + 29; // set offset for serialization

    beginSvcaCancDt = getStartOffset() + 39; // set offset for serialization

    beginSvcaLstUpdtDttm = getStartOffset() + 49; // set offset for serialization

    beginSvcaLstUpdtUserId = getStartOffset() + 75; // set offset for serialization

    /*  end of offset */
  }

  int localSvcaSrvcCdCounter = -1;

  public boolean isSvcaSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvcaSrvcCdCounter != sharedCounter;
    localSvcaSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVCA_SRVC_CD_LEN = 6;
  /** serialize this SvcaSrvcCd */
  protected void serializeSvcaSrvcCd(char[] svcaSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(svcaSrvcCd, 0, getStringValue(), beginSvcaSrvcCd, SVCA_SRVC_CD_LEN);
    localSvcaSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvcaSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshSvcaSrvcCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshSvcaSrvcCd() {
    return (substring(getStringValue(), beginSvcaSrvcCd, beginSvcaSrvcCd + SVCA_SRVC_CD_LEN));
  }

  int localSvcaSrvcCdNbrCounter = -1;

  public boolean isSvcaSrvcCdNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvcaSrvcCdNbrCounter != sharedCounter;
    localSvcaSrvcCdNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVCA_SRVC_CD_NBR_LEN = 3;
  /** serialize this SvcaSrvcCdNbr */
  protected void serializeSvcaSrvcCdNbr(char[] svcaSrvcCdNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(svcaSrvcCdNbr, 0, getStringValue(), beginSvcaSrvcCdNbr, SVCA_SRVC_CD_NBR_LEN);
    localSvcaSrvcCdNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvcaSrvcCdNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshSvcaSrvcCdNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshSvcaSrvcCdNbr() {
    return (substring(
        getStringValue(), beginSvcaSrvcCdNbr, beginSvcaSrvcCdNbr + SVCA_SRVC_CD_NBR_LEN));
  }

  int localSvcaSrvcCdTxtCounter = -1;

  public boolean isSvcaSrvcCdTxtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvcaSrvcCdTxtCounter != sharedCounter;
    localSvcaSrvcCdTxtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVCA_SRVC_CD_TXT_LEN = 20;
  /** serialize this SvcaSrvcCdTxt */
  protected void serializeSvcaSrvcCdTxt(char[] svcaSrvcCdTxt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(svcaSrvcCdTxt, 0, getStringValue(), beginSvcaSrvcCdTxt, SVCA_SRVC_CD_TXT_LEN);
    localSvcaSrvcCdTxtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvcaSrvcCdTxtConstraints(char[] value) {
    return super.checkConstraints(value, 20, false, false);
  }
  /**
   * refreshSvcaSrvcCdTxt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshSvcaSrvcCdTxt() {
    return (substring(
        getStringValue(), beginSvcaSrvcCdTxt, beginSvcaSrvcCdTxt + SVCA_SRVC_CD_TXT_LEN));
  }

  int localSvcaEffDtCounter = -1;

  public boolean isSvcaEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvcaEffDtCounter != sharedCounter;
    localSvcaEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVCA_EFF_DT_LEN = 10;
  /** serialize this SvcaEffDt */
  protected void serializeSvcaEffDt(char[] svcaEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(svcaEffDt, 0, getStringValue(), beginSvcaEffDt, SVCA_EFF_DT_LEN);
    localSvcaEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvcaEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshSvcaEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshSvcaEffDt() {
    return (substring(getStringValue(), beginSvcaEffDt, beginSvcaEffDt + SVCA_EFF_DT_LEN));
  }

  int localSvcaCancDtCounter = -1;

  public boolean isSvcaCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvcaCancDtCounter != sharedCounter;
    localSvcaCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVCA_CANC_DT_LEN = 10;
  /** serialize this SvcaCancDt */
  protected void serializeSvcaCancDt(char[] svcaCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(svcaCancDt, 0, getStringValue(), beginSvcaCancDt, SVCA_CANC_DT_LEN);
    localSvcaCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvcaCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshSvcaCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshSvcaCancDt() {
    return (substring(getStringValue(), beginSvcaCancDt, beginSvcaCancDt + SVCA_CANC_DT_LEN));
  }

  int localSvcaLstUpdtDttmCounter = -1;

  public boolean isSvcaLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvcaLstUpdtDttmCounter != sharedCounter;
    localSvcaLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVCA_LST_UPDT_DTTM_LEN = 26;
  /** serialize this SvcaLstUpdtDttm */
  protected void serializeSvcaLstUpdtDttm(char[] svcaLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(svcaLstUpdtDttm, 0, getStringValue(), beginSvcaLstUpdtDttm, SVCA_LST_UPDT_DTTM_LEN);
    localSvcaLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvcaLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshSvcaLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshSvcaLstUpdtDttm() {
    return (substring(
        getStringValue(), beginSvcaLstUpdtDttm, beginSvcaLstUpdtDttm + SVCA_LST_UPDT_DTTM_LEN));
  }

  int localSvcaLstUpdtUserIdCounter = -1;

  public boolean isSvcaLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localSvcaLstUpdtUserIdCounter != sharedCounter;
    localSvcaLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SVCA_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this SvcaLstUpdtUserId */
  protected void serializeSvcaLstUpdtUserId(char[] svcaLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        svcaLstUpdtUserId, 0, getStringValue(), beginSvcaLstUpdtUserId, SVCA_LST_UPDT_USER_ID_LEN);
    localSvcaLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkSvcaLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshSvcaLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshSvcaLstUpdtUserId() {
    return (substring(
        getStringValue(),
        beginSvcaLstUpdtUserId,
        beginSvcaLstUpdtUserId + SVCA_LST_UPDT_USER_ID_LEN));
  }
}
