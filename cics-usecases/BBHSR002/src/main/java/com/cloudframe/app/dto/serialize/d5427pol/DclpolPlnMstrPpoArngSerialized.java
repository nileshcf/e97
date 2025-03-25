package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrPpoArngSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrPpoArngSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrPpoArngSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_PPO_ARNG_LENGTH = 84;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDparCovTypCd;
  protected int beginDparPolNbr;
  protected int beginDparPlnNbr;
  protected int beginDparClssNbr;
  protected int beginDparSeqNbr;
  protected int beginDparContrArngCd;
  protected int beginDparIncExcInd;
  protected int beginDparIpaNbr;
  protected int beginDparLstUpdtDttm;
  protected int beginDparLstUpdtUserId;
  protected int beginDparMktNbr;
  protected int beginDparMktTypCd;
  protected int beginDparMntlHlthInd;
  protected int beginDparPrdctCd;
  protected int beginDparPrefNtwkCd;
  protected int beginDparPsv1Cd;
  protected int beginDparPsv2Cd;
  protected int beginDparPsv3Cd;
  protected int beginDparPsv4Cd;
  protected int beginDparPsv5Cd;
  protected int beginDparPsv6Cd;
  protected int beginDparPsv7Cd;
  protected int beginDparPsv8Cd;
  protected int beginDparPsv9Cd;
  protected int beginDparPsv10Cd;
  protected int beginDparTravBenCd;

  /** Constructor for DclpolPlnMstrPpoArngSerialized */
  public DclpolPlnMstrPpoArngSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrPpoArngSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_PPO_ARNG_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDparCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginDparPolNbr = getStartOffset() + 1; // set offset for serialization

    beginDparPlnNbr = getStartOffset() + 7; // set offset for serialization

    beginDparClssNbr = getStartOffset() + 11; // set offset for serialization

    beginDparSeqNbr = getStartOffset() + 15; // set offset for serialization

    beginDparContrArngCd = getStartOffset() + 17; // set offset for serialization

    beginDparIncExcInd = getStartOffset() + 18; // set offset for serialization

    beginDparIpaNbr = getStartOffset() + 19; // set offset for serialization

    beginDparLstUpdtDttm = getStartOffset() + 24; // set offset for serialization

    beginDparLstUpdtUserId = getStartOffset() + 50; // set offset for serialization

    beginDparMktNbr = getStartOffset() + 59; // set offset for serialization

    beginDparMktTypCd = getStartOffset() + 66; // set offset for serialization

    beginDparMntlHlthInd = getStartOffset() + 68; // set offset for serialization

    beginDparPrdctCd = getStartOffset() + 69; // set offset for serialization

    beginDparPrefNtwkCd = getStartOffset() + 72; // set offset for serialization

    beginDparPsv1Cd = getStartOffset() + 73; // set offset for serialization

    beginDparPsv2Cd = getStartOffset() + 74; // set offset for serialization

    beginDparPsv3Cd = getStartOffset() + 75; // set offset for serialization

    beginDparPsv4Cd = getStartOffset() + 76; // set offset for serialization

    beginDparPsv5Cd = getStartOffset() + 77; // set offset for serialization

    beginDparPsv6Cd = getStartOffset() + 78; // set offset for serialization

    beginDparPsv7Cd = getStartOffset() + 79; // set offset for serialization

    beginDparPsv8Cd = getStartOffset() + 80; // set offset for serialization

    beginDparPsv9Cd = getStartOffset() + 81; // set offset for serialization

    beginDparPsv10Cd = getStartOffset() + 82; // set offset for serialization

    beginDparTravBenCd = getStartOffset() + 83; // set offset for serialization

    /*  end of offset */
  }

  int localDparCovTypCdCounter = -1;

  public boolean isDparCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparCovTypCdCounter != sharedCounter;
    localDparCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_COV_TYP_CD_LEN = 1;
  /** serialize this DparCovTypCd */
  protected void serializeDparCovTypCd(char[] dparCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparCovTypCd, 0, getStringValue(), beginDparCovTypCd, DPAR_COV_TYP_CD_LEN);
    localDparCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparCovTypCd() {
    return (substring(
        getStringValue(), beginDparCovTypCd, beginDparCovTypCd + DPAR_COV_TYP_CD_LEN));
  }

  int localDparPolNbrCounter = -1;

  public boolean isDparPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPolNbrCounter != sharedCounter;
    localDparPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_POL_NBR_LEN = 6;
  /** serialize this DparPolNbr */
  protected void serializeDparPolNbr(char[] dparPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPolNbr, 0, getStringValue(), beginDparPolNbr, DPAR_POL_NBR_LEN);
    localDparPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDparPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPolNbr() {
    return (substring(getStringValue(), beginDparPolNbr, beginDparPolNbr + DPAR_POL_NBR_LEN));
  }

  int localDparPlnNbrCounter = -1;

  public boolean isDparPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPlnNbrCounter != sharedCounter;
    localDparPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PLN_NBR_LEN = 4;
  /** serialize this DparPlnNbr */
  protected void serializeDparPlnNbr(char[] dparPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPlnNbr, 0, getStringValue(), beginDparPlnNbr, DPAR_PLN_NBR_LEN);
    localDparPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDparPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPlnNbr() {
    return (substring(getStringValue(), beginDparPlnNbr, beginDparPlnNbr + DPAR_PLN_NBR_LEN));
  }

  int localDparClssNbrCounter = -1;

  public boolean isDparClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparClssNbrCounter != sharedCounter;
    localDparClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_CLSS_NBR_LEN = 4;
  /** serialize this DparClssNbr */
  protected void serializeDparClssNbr(char[] dparClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparClssNbr, 0, getStringValue(), beginDparClssNbr, DPAR_CLSS_NBR_LEN);
    localDparClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDparClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparClssNbr() {
    return (substring(getStringValue(), beginDparClssNbr, beginDparClssNbr + DPAR_CLSS_NBR_LEN));
  }

  int localDparSeqNbrCounter = -1;

  public boolean isDparSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparSeqNbrCounter != sharedCounter;
    localDparSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_SEQ_NBR_LEN = 2;
  /** serializeDparSeqNbr */
  protected void serializeDparSeqNbr(short dparSeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(dparSeqNbr, DPAR_SEQ_NBR_LEN), beginDparSeqNbr, DPAR_SEQ_NBR_LEN);
    localDparSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDparSeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDparSeqNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshDparSeqNbr() {
    return (getShort(beginDparSeqNbr));
  }

  int localDparContrArngCdCounter = -1;

  public boolean isDparContrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparContrArngCdCounter != sharedCounter;
    localDparContrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_CONTR_ARNG_CD_LEN = 1;
  /** serialize this DparContrArngCd */
  protected void serializeDparContrArngCd(char[] dparContrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparContrArngCd, 0, getStringValue(), beginDparContrArngCd, DPAR_CONTR_ARNG_CD_LEN);
    localDparContrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparContrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparContrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparContrArngCd() {
    return (substring(
        getStringValue(), beginDparContrArngCd, beginDparContrArngCd + DPAR_CONTR_ARNG_CD_LEN));
  }

  int localDparIncExcIndCounter = -1;

  public boolean isDparIncExcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparIncExcIndCounter != sharedCounter;
    localDparIncExcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_INC_EXC_IND_LEN = 1;
  /** serialize this DparIncExcInd */
  protected void serializeDparIncExcInd(char[] dparIncExcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparIncExcInd, 0, getStringValue(), beginDparIncExcInd, DPAR_INC_EXC_IND_LEN);
    localDparIncExcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparIncExcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparIncExcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparIncExcInd() {
    return (substring(
        getStringValue(), beginDparIncExcInd, beginDparIncExcInd + DPAR_INC_EXC_IND_LEN));
  }

  int localDparIpaNbrCounter = -1;

  public boolean isDparIpaNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparIpaNbrCounter != sharedCounter;
    localDparIpaNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_IPA_NBR_LEN = 5;
  /** serialize this DparIpaNbr */
  protected void serializeDparIpaNbr(char[] dparIpaNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparIpaNbr, 0, getStringValue(), beginDparIpaNbr, DPAR_IPA_NBR_LEN);
    localDparIpaNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparIpaNbrConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshDparIpaNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparIpaNbr() {
    return (substring(getStringValue(), beginDparIpaNbr, beginDparIpaNbr + DPAR_IPA_NBR_LEN));
  }

  int localDparLstUpdtDttmCounter = -1;

  public boolean isDparLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparLstUpdtDttmCounter != sharedCounter;
    localDparLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_LST_UPDT_DTTM_LEN = 26;
  /** serialize this DparLstUpdtDttm */
  protected void serializeDparLstUpdtDttm(char[] dparLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparLstUpdtDttm, 0, getStringValue(), beginDparLstUpdtDttm, DPAR_LST_UPDT_DTTM_LEN);
    localDparLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDparLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparLstUpdtDttm() {
    return (substring(
        getStringValue(), beginDparLstUpdtDttm, beginDparLstUpdtDttm + DPAR_LST_UPDT_DTTM_LEN));
  }

  int localDparLstUpdtUserIdCounter = -1;

  public boolean isDparLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparLstUpdtUserIdCounter != sharedCounter;
    localDparLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this DparLstUpdtUserId */
  protected void serializeDparLstUpdtUserId(char[] dparLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dparLstUpdtUserId, 0, getStringValue(), beginDparLstUpdtUserId, DPAR_LST_UPDT_USER_ID_LEN);
    localDparLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshDparLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparLstUpdtUserId() {
    return (substring(
        getStringValue(),
        beginDparLstUpdtUserId,
        beginDparLstUpdtUserId + DPAR_LST_UPDT_USER_ID_LEN));
  }

  int localDparMktNbrCounter = -1;

  public boolean isDparMktNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparMktNbrCounter != sharedCounter;
    localDparMktNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_MKT_NBR_LEN = 7;
  /** serialize this DparMktNbr */
  protected void serializeDparMktNbr(char[] dparMktNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparMktNbr, 0, getStringValue(), beginDparMktNbr, DPAR_MKT_NBR_LEN);
    localDparMktNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparMktNbrConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshDparMktNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparMktNbr() {
    return (substring(getStringValue(), beginDparMktNbr, beginDparMktNbr + DPAR_MKT_NBR_LEN));
  }

  int localDparMktTypCdCounter = -1;

  public boolean isDparMktTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparMktTypCdCounter != sharedCounter;
    localDparMktTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_MKT_TYP_CD_LEN = 2;
  /** serialize this DparMktTypCd */
  protected void serializeDparMktTypCd(char[] dparMktTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparMktTypCd, 0, getStringValue(), beginDparMktTypCd, DPAR_MKT_TYP_CD_LEN);
    localDparMktTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparMktTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDparMktTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparMktTypCd() {
    return (substring(
        getStringValue(), beginDparMktTypCd, beginDparMktTypCd + DPAR_MKT_TYP_CD_LEN));
  }

  int localDparMntlHlthIndCounter = -1;

  public boolean isDparMntlHlthIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparMntlHlthIndCounter != sharedCounter;
    localDparMntlHlthIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_MNTL_HLTH_IND_LEN = 1;
  /** serialize this DparMntlHlthInd */
  protected void serializeDparMntlHlthInd(char[] dparMntlHlthInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparMntlHlthInd, 0, getStringValue(), beginDparMntlHlthInd, DPAR_MNTL_HLTH_IND_LEN);
    localDparMntlHlthIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparMntlHlthIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparMntlHlthInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparMntlHlthInd() {
    return (substring(
        getStringValue(), beginDparMntlHlthInd, beginDparMntlHlthInd + DPAR_MNTL_HLTH_IND_LEN));
  }

  int localDparPrdctCdCounter = -1;

  public boolean isDparPrdctCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPrdctCdCounter != sharedCounter;
    localDparPrdctCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PRDCT_CD_LEN = 3;
  /** serialize this DparPrdctCd */
  protected void serializeDparPrdctCd(char[] dparPrdctCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPrdctCd, 0, getStringValue(), beginDparPrdctCd, DPAR_PRDCT_CD_LEN);
    localDparPrdctCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPrdctCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshDparPrdctCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPrdctCd() {
    return (substring(getStringValue(), beginDparPrdctCd, beginDparPrdctCd + DPAR_PRDCT_CD_LEN));
  }

  int localDparPrefNtwkCdCounter = -1;

  public boolean isDparPrefNtwkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPrefNtwkCdCounter != sharedCounter;
    localDparPrefNtwkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PREF_NTWK_CD_LEN = 1;
  /** serialize this DparPrefNtwkCd */
  protected void serializeDparPrefNtwkCd(char[] dparPrefNtwkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPrefNtwkCd, 0, getStringValue(), beginDparPrefNtwkCd, DPAR_PREF_NTWK_CD_LEN);
    localDparPrefNtwkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPrefNtwkCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPrefNtwkCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparPrefNtwkCd() {
    return (substring(
        getStringValue(), beginDparPrefNtwkCd, beginDparPrefNtwkCd + DPAR_PREF_NTWK_CD_LEN));
  }

  int localDparPsv1CdCounter = -1;

  public boolean isDparPsv1CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv1CdCounter != sharedCounter;
    localDparPsv1CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_1_CD_LEN = 1;
  /** serialize this DparPsv1Cd */
  protected void serializeDparPsv1Cd(char[] dparPsv1Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv1Cd, 0, getStringValue(), beginDparPsv1Cd, DPAR_PSV_1_CD_LEN);
    localDparPsv1CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv1CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv1Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv1Cd() {
    return (substring(getStringValue(), beginDparPsv1Cd, beginDparPsv1Cd + DPAR_PSV_1_CD_LEN));
  }

  int localDparPsv2CdCounter = -1;

  public boolean isDparPsv2CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv2CdCounter != sharedCounter;
    localDparPsv2CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_2_CD_LEN = 1;
  /** serialize this DparPsv2Cd */
  protected void serializeDparPsv2Cd(char[] dparPsv2Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv2Cd, 0, getStringValue(), beginDparPsv2Cd, DPAR_PSV_2_CD_LEN);
    localDparPsv2CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv2CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv2Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv2Cd() {
    return (substring(getStringValue(), beginDparPsv2Cd, beginDparPsv2Cd + DPAR_PSV_2_CD_LEN));
  }

  int localDparPsv3CdCounter = -1;

  public boolean isDparPsv3CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv3CdCounter != sharedCounter;
    localDparPsv3CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_3_CD_LEN = 1;
  /** serialize this DparPsv3Cd */
  protected void serializeDparPsv3Cd(char[] dparPsv3Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv3Cd, 0, getStringValue(), beginDparPsv3Cd, DPAR_PSV_3_CD_LEN);
    localDparPsv3CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv3CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv3Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv3Cd() {
    return (substring(getStringValue(), beginDparPsv3Cd, beginDparPsv3Cd + DPAR_PSV_3_CD_LEN));
  }

  int localDparPsv4CdCounter = -1;

  public boolean isDparPsv4CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv4CdCounter != sharedCounter;
    localDparPsv4CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_4_CD_LEN = 1;
  /** serialize this DparPsv4Cd */
  protected void serializeDparPsv4Cd(char[] dparPsv4Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv4Cd, 0, getStringValue(), beginDparPsv4Cd, DPAR_PSV_4_CD_LEN);
    localDparPsv4CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv4CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv4Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv4Cd() {
    return (substring(getStringValue(), beginDparPsv4Cd, beginDparPsv4Cd + DPAR_PSV_4_CD_LEN));
  }

  int localDparPsv5CdCounter = -1;

  public boolean isDparPsv5CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv5CdCounter != sharedCounter;
    localDparPsv5CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_5_CD_LEN = 1;
  /** serialize this DparPsv5Cd */
  protected void serializeDparPsv5Cd(char[] dparPsv5Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv5Cd, 0, getStringValue(), beginDparPsv5Cd, DPAR_PSV_5_CD_LEN);
    localDparPsv5CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv5CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv5Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv5Cd() {
    return (substring(getStringValue(), beginDparPsv5Cd, beginDparPsv5Cd + DPAR_PSV_5_CD_LEN));
  }

  int localDparPsv6CdCounter = -1;

  public boolean isDparPsv6CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv6CdCounter != sharedCounter;
    localDparPsv6CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_6_CD_LEN = 1;
  /** serialize this DparPsv6Cd */
  protected void serializeDparPsv6Cd(char[] dparPsv6Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv6Cd, 0, getStringValue(), beginDparPsv6Cd, DPAR_PSV_6_CD_LEN);
    localDparPsv6CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv6CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv6Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv6Cd() {
    return (substring(getStringValue(), beginDparPsv6Cd, beginDparPsv6Cd + DPAR_PSV_6_CD_LEN));
  }

  int localDparPsv7CdCounter = -1;

  public boolean isDparPsv7CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv7CdCounter != sharedCounter;
    localDparPsv7CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_7_CD_LEN = 1;
  /** serialize this DparPsv7Cd */
  protected void serializeDparPsv7Cd(char[] dparPsv7Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv7Cd, 0, getStringValue(), beginDparPsv7Cd, DPAR_PSV_7_CD_LEN);
    localDparPsv7CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv7CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv7Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv7Cd() {
    return (substring(getStringValue(), beginDparPsv7Cd, beginDparPsv7Cd + DPAR_PSV_7_CD_LEN));
  }

  int localDparPsv8CdCounter = -1;

  public boolean isDparPsv8CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv8CdCounter != sharedCounter;
    localDparPsv8CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_8_CD_LEN = 1;
  /** serialize this DparPsv8Cd */
  protected void serializeDparPsv8Cd(char[] dparPsv8Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv8Cd, 0, getStringValue(), beginDparPsv8Cd, DPAR_PSV_8_CD_LEN);
    localDparPsv8CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv8CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv8Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv8Cd() {
    return (substring(getStringValue(), beginDparPsv8Cd, beginDparPsv8Cd + DPAR_PSV_8_CD_LEN));
  }

  int localDparPsv9CdCounter = -1;

  public boolean isDparPsv9CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv9CdCounter != sharedCounter;
    localDparPsv9CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_9_CD_LEN = 1;
  /** serialize this DparPsv9Cd */
  protected void serializeDparPsv9Cd(char[] dparPsv9Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv9Cd, 0, getStringValue(), beginDparPsv9Cd, DPAR_PSV_9_CD_LEN);
    localDparPsv9CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv9CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv9Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv9Cd() {
    return (substring(getStringValue(), beginDparPsv9Cd, beginDparPsv9Cd + DPAR_PSV_9_CD_LEN));
  }

  int localDparPsv10CdCounter = -1;

  public boolean isDparPsv10CdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparPsv10CdCounter != sharedCounter;
    localDparPsv10CdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_PSV_10_CD_LEN = 1;
  /** serialize this DparPsv10Cd */
  protected void serializeDparPsv10Cd(char[] dparPsv10Cd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparPsv10Cd, 0, getStringValue(), beginDparPsv10Cd, DPAR_PSV_10_CD_LEN);
    localDparPsv10CdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparPsv10CdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparPsv10Cd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDparPsv10Cd() {
    return (substring(getStringValue(), beginDparPsv10Cd, beginDparPsv10Cd + DPAR_PSV_10_CD_LEN));
  }

  int localDparTravBenCdCounter = -1;

  public boolean isDparTravBenCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDparTravBenCdCounter != sharedCounter;
    localDparTravBenCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DPAR_TRAV_BEN_CD_LEN = 1;
  /** serialize this DparTravBenCd */
  protected void serializeDparTravBenCd(char[] dparTravBenCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dparTravBenCd, 0, getStringValue(), beginDparTravBenCd, DPAR_TRAV_BEN_CD_LEN);
    localDparTravBenCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDparTravBenCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDparTravBenCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDparTravBenCd() {
    return (substring(
        getStringValue(), beginDparTravBenCd, beginDparTravBenCd + DPAR_TRAV_BEN_CD_LEN));
  }
}
