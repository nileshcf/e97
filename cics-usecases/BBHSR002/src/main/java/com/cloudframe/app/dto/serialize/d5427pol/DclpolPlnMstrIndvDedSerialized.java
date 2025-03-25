package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrIndvDedSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrIndvDedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrIndvDedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_INDV_DED_LENGTH = 91;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDideCovTypCd;
  protected int beginDidePolNbr;
  protected int beginDidePlnNbr;
  protected int beginDideClssNbr;
  protected int beginDideSeqNbr;
  protected int beginDideDedAccumCd;
  protected int beginDideDedAccumPdAmt;
  protected int beginDideDedAmt;
  protected int beginDideDedBenPdAmt;
  protected int beginDideDedCaroCd;
  protected int beginDideDedCd;
  protected int beginDideDedCobCd;
  protected int beginDideDedCstCntnCd;
  protected int beginDideDedEndDt;
  protected int beginDideDedFreqCd;
  protected int beginDideDedMntAmt;
  protected int beginDideDedMntCd;
  protected int beginDideDedMntPdAmt;
  protected int beginDideDedNtwkTypCd;
  protected int beginDideDedSemiPvtRtCd;
  protected int beginDideDedSrvcDesc;
  protected int beginDideLstUpdtDttm;
  protected int beginDideLstUpdtUserId;

  /** Constructor for DclpolPlnMstrIndvDedSerialized */
  public DclpolPlnMstrIndvDedSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrIndvDedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_INDV_DED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDideCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginDidePolNbr = getStartOffset() + 1; // set offset for serialization

    beginDidePlnNbr = getStartOffset() + 7; // set offset for serialization

    beginDideClssNbr = getStartOffset() + 11; // set offset for serialization

    beginDideSeqNbr = getStartOffset() + 15; // set offset for serialization

    beginDideDedAccumCd = getStartOffset() + 17; // set offset for serialization

    beginDideDedAccumPdAmt = getStartOffset() + 18; // set offset for serialization

    beginDideDedAmt = getStartOffset() + 20; // set offset for serialization

    beginDideDedBenPdAmt = getStartOffset() + 24; // set offset for serialization

    beginDideDedCaroCd = getStartOffset() + 26; // set offset for serialization

    beginDideDedCd = getStartOffset() + 27; // set offset for serialization

    beginDideDedCobCd = getStartOffset() + 28; // set offset for serialization

    beginDideDedCstCntnCd = getStartOffset() + 29; // set offset for serialization

    beginDideDedEndDt = getStartOffset() + 30; // set offset for serialization

    beginDideDedFreqCd = getStartOffset() + 40; // set offset for serialization

    beginDideDedMntAmt = getStartOffset() + 41; // set offset for serialization

    beginDideDedMntCd = getStartOffset() + 45; // set offset for serialization

    beginDideDedMntPdAmt = getStartOffset() + 46; // set offset for serialization

    beginDideDedNtwkTypCd = getStartOffset() + 48; // set offset for serialization

    beginDideDedSemiPvtRtCd = getStartOffset() + 49; // set offset for serialization

    beginDideDedSrvcDesc = getStartOffset() + 50; // set offset for serialization

    beginDideLstUpdtDttm = getStartOffset() + 56; // set offset for serialization

    beginDideLstUpdtUserId = getStartOffset() + 82; // set offset for serialization

    /*  end of offset */
  }

  int localDideCovTypCdCounter = -1;

  public boolean isDideCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideCovTypCdCounter != sharedCounter;
    localDideCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_COV_TYP_CD_LEN = 1;
  /** serialize this DideCovTypCd */
  protected void serializeDideCovTypCd(char[] dideCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideCovTypCd, 0, getStringValue(), beginDideCovTypCd, DIDE_COV_TYP_CD_LEN);
    localDideCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideCovTypCd() {
    return (substring(
        getStringValue(), beginDideCovTypCd, beginDideCovTypCd + DIDE_COV_TYP_CD_LEN));
  }

  int localDidePolNbrCounter = -1;

  public boolean isDidePolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDidePolNbrCounter != sharedCounter;
    localDidePolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_POL_NBR_LEN = 6;
  /** serialize this DidePolNbr */
  protected void serializeDidePolNbr(char[] didePolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(didePolNbr, 0, getStringValue(), beginDidePolNbr, DIDE_POL_NBR_LEN);
    localDidePolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDidePolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDidePolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDidePolNbr() {
    return (substring(getStringValue(), beginDidePolNbr, beginDidePolNbr + DIDE_POL_NBR_LEN));
  }

  int localDidePlnNbrCounter = -1;

  public boolean isDidePlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDidePlnNbrCounter != sharedCounter;
    localDidePlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_PLN_NBR_LEN = 4;
  /** serialize this DidePlnNbr */
  protected void serializeDidePlnNbr(char[] didePlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(didePlnNbr, 0, getStringValue(), beginDidePlnNbr, DIDE_PLN_NBR_LEN);
    localDidePlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDidePlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDidePlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDidePlnNbr() {
    return (substring(getStringValue(), beginDidePlnNbr, beginDidePlnNbr + DIDE_PLN_NBR_LEN));
  }

  int localDideClssNbrCounter = -1;

  public boolean isDideClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideClssNbrCounter != sharedCounter;
    localDideClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_CLSS_NBR_LEN = 4;
  /** serialize this DideClssNbr */
  protected void serializeDideClssNbr(char[] dideClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideClssNbr, 0, getStringValue(), beginDideClssNbr, DIDE_CLSS_NBR_LEN);
    localDideClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDideClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDideClssNbr() {
    return (substring(getStringValue(), beginDideClssNbr, beginDideClssNbr + DIDE_CLSS_NBR_LEN));
  }

  int localDideSeqNbrCounter = -1;

  public boolean isDideSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideSeqNbrCounter != sharedCounter;
    localDideSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_SEQ_NBR_LEN = 2;
  /** serializeDideSeqNbr */
  protected void serializeDideSeqNbr(short dideSeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(dideSeqNbr, DIDE_SEQ_NBR_LEN), beginDideSeqNbr, DIDE_SEQ_NBR_LEN);
    localDideSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDideSeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDideSeqNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshDideSeqNbr() {
    return (getShort(beginDideSeqNbr));
  }

  int localDideDedAccumCdCounter = -1;

  public boolean isDideDedAccumCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedAccumCdCounter != sharedCounter;
    localDideDedAccumCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_ACCUM_CD_LEN = 1;
  /** serialize this DideDedAccumCd */
  protected void serializeDideDedAccumCd(char[] dideDedAccumCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedAccumCd, 0, getStringValue(), beginDideDedAccumCd, DIDE_DED_ACCUM_CD_LEN);
    localDideDedAccumCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedAccumCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedAccumCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedAccumCd() {
    return (substring(
        getStringValue(), beginDideDedAccumCd, beginDideDedAccumCd + DIDE_DED_ACCUM_CD_LEN));
  }

  int localDideDedAccumPdAmtCounter = -1;

  public boolean isDideDedAccumPdAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedAccumPdAmtCounter != sharedCounter;
    localDideDedAccumPdAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_ACCUM_PD_AMT_LEN = 2;
  /** serializeDideDedAccumPdAmt */
  protected void serializeDideDedAccumPdAmt(short dideDedAccumPdAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dideDedAccumPdAmt, DIDE_DED_ACCUM_PD_AMT_LEN),
        beginDideDedAccumPdAmt,
        DIDE_DED_ACCUM_PD_AMT_LEN);
    localDideDedAccumPdAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDideDedAccumPdAmtMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDideDedAccumPdAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshDideDedAccumPdAmt() {
    return (getShort(beginDideDedAccumPdAmt));
  }

  int localDideDedAmtCounter = -1;

  public boolean isDideDedAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedAmtCounter != sharedCounter;
    localDideDedAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_AMT_LEN = 4;
  /** serializeDideDedAmt */
  protected void serializeDideDedAmt(int dideDedAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dideDedAmt, DIDE_DED_AMT_LEN), beginDideDedAmt, DIDE_DED_AMT_LEN);
    localDideDedAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkDideDedAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshDideDedAmt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshDideDedAmt() {
    return (getInt(beginDideDedAmt));
  }

  int localDideDedBenPdAmtCounter = -1;

  public boolean isDideDedBenPdAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedBenPdAmtCounter != sharedCounter;
    localDideDedBenPdAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_BEN_PD_AMT_LEN = 2;
  /** serializeDideDedBenPdAmt */
  protected void serializeDideDedBenPdAmt(short dideDedBenPdAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dideDedBenPdAmt, DIDE_DED_BEN_PD_AMT_LEN),
        beginDideDedBenPdAmt,
        DIDE_DED_BEN_PD_AMT_LEN);
    localDideDedBenPdAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDideDedBenPdAmtMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDideDedBenPdAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshDideDedBenPdAmt() {
    return (getShort(beginDideDedBenPdAmt));
  }

  int localDideDedCaroCdCounter = -1;

  public boolean isDideDedCaroCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedCaroCdCounter != sharedCounter;
    localDideDedCaroCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_CARO_CD_LEN = 1;
  /** serialize this DideDedCaroCd */
  protected void serializeDideDedCaroCd(char[] dideDedCaroCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedCaroCd, 0, getStringValue(), beginDideDedCaroCd, DIDE_DED_CARO_CD_LEN);
    localDideDedCaroCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedCaroCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedCaroCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedCaroCd() {
    return (substring(
        getStringValue(), beginDideDedCaroCd, beginDideDedCaroCd + DIDE_DED_CARO_CD_LEN));
  }

  int localDideDedCdCounter = -1;

  public boolean isDideDedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedCdCounter != sharedCounter;
    localDideDedCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_CD_LEN = 1;
  /** serialize this DideDedCd */
  protected void serializeDideDedCd(char[] dideDedCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedCd, 0, getStringValue(), beginDideDedCd, DIDE_DED_CD_LEN);
    localDideDedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDideDedCd() {
    return (substring(getStringValue(), beginDideDedCd, beginDideDedCd + DIDE_DED_CD_LEN));
  }

  int localDideDedCobCdCounter = -1;

  public boolean isDideDedCobCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedCobCdCounter != sharedCounter;
    localDideDedCobCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_COB_CD_LEN = 1;
  /** serialize this DideDedCobCd */
  protected void serializeDideDedCobCd(char[] dideDedCobCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedCobCd, 0, getStringValue(), beginDideDedCobCd, DIDE_DED_COB_CD_LEN);
    localDideDedCobCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedCobCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedCobCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedCobCd() {
    return (substring(
        getStringValue(), beginDideDedCobCd, beginDideDedCobCd + DIDE_DED_COB_CD_LEN));
  }

  int localDideDedCstCntnCdCounter = -1;

  public boolean isDideDedCstCntnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedCstCntnCdCounter != sharedCounter;
    localDideDedCstCntnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_CST_CNTN_CD_LEN = 1;
  /** serialize this DideDedCstCntnCd */
  protected void serializeDideDedCstCntnCd(char[] dideDedCstCntnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dideDedCstCntnCd, 0, getStringValue(), beginDideDedCstCntnCd, DIDE_DED_CST_CNTN_CD_LEN);
    localDideDedCstCntnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedCstCntnCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedCstCntnCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedCstCntnCd() {
    return (substring(
        getStringValue(), beginDideDedCstCntnCd, beginDideDedCstCntnCd + DIDE_DED_CST_CNTN_CD_LEN));
  }

  int localDideDedEndDtCounter = -1;

  public boolean isDideDedEndDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedEndDtCounter != sharedCounter;
    localDideDedEndDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_END_DT_LEN = 10;
  /** serialize this DideDedEndDt */
  protected void serializeDideDedEndDt(char[] dideDedEndDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedEndDt, 0, getStringValue(), beginDideDedEndDt, DIDE_DED_END_DT_LEN);
    localDideDedEndDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedEndDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshDideDedEndDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedEndDt() {
    return (substring(
        getStringValue(), beginDideDedEndDt, beginDideDedEndDt + DIDE_DED_END_DT_LEN));
  }

  int localDideDedFreqCdCounter = -1;

  public boolean isDideDedFreqCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedFreqCdCounter != sharedCounter;
    localDideDedFreqCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_FREQ_CD_LEN = 1;
  /** serialize this DideDedFreqCd */
  protected void serializeDideDedFreqCd(char[] dideDedFreqCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedFreqCd, 0, getStringValue(), beginDideDedFreqCd, DIDE_DED_FREQ_CD_LEN);
    localDideDedFreqCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedFreqCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedFreqCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedFreqCd() {
    return (substring(
        getStringValue(), beginDideDedFreqCd, beginDideDedFreqCd + DIDE_DED_FREQ_CD_LEN));
  }

  int localDideDedMntAmtCounter = -1;

  public boolean isDideDedMntAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedMntAmtCounter != sharedCounter;
    localDideDedMntAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_MNT_AMT_LEN = 4;
  /** serializeDideDedMntAmt */
  protected void serializeDideDedMntAmt(int dideDedMntAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dideDedMntAmt, DIDE_DED_MNT_AMT_LEN),
        beginDideDedMntAmt,
        DIDE_DED_MNT_AMT_LEN);
    localDideDedMntAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkDideDedMntAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshDideDedMntAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshDideDedMntAmt() {
    return (getInt(beginDideDedMntAmt));
  }

  int localDideDedMntCdCounter = -1;

  public boolean isDideDedMntCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedMntCdCounter != sharedCounter;
    localDideDedMntCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_MNT_CD_LEN = 1;
  /** serialize this DideDedMntCd */
  protected void serializeDideDedMntCd(char[] dideDedMntCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedMntCd, 0, getStringValue(), beginDideDedMntCd, DIDE_DED_MNT_CD_LEN);
    localDideDedMntCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedMntCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedMntCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedMntCd() {
    return (substring(
        getStringValue(), beginDideDedMntCd, beginDideDedMntCd + DIDE_DED_MNT_CD_LEN));
  }

  int localDideDedMntPdAmtCounter = -1;

  public boolean isDideDedMntPdAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedMntPdAmtCounter != sharedCounter;
    localDideDedMntPdAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_MNT_PD_AMT_LEN = 2;
  /** serializeDideDedMntPdAmt */
  protected void serializeDideDedMntPdAmt(short dideDedMntPdAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dideDedMntPdAmt, DIDE_DED_MNT_PD_AMT_LEN),
        beginDideDedMntPdAmt,
        DIDE_DED_MNT_PD_AMT_LEN);
    localDideDedMntPdAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDideDedMntPdAmtMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDideDedMntPdAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshDideDedMntPdAmt() {
    return (getShort(beginDideDedMntPdAmt));
  }

  int localDideDedNtwkTypCdCounter = -1;

  public boolean isDideDedNtwkTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedNtwkTypCdCounter != sharedCounter;
    localDideDedNtwkTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_NTWK_TYP_CD_LEN = 1;
  /** serialize this DideDedNtwkTypCd */
  protected void serializeDideDedNtwkTypCd(char[] dideDedNtwkTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dideDedNtwkTypCd, 0, getStringValue(), beginDideDedNtwkTypCd, DIDE_DED_NTWK_TYP_CD_LEN);
    localDideDedNtwkTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedNtwkTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedNtwkTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedNtwkTypCd() {
    return (substring(
        getStringValue(), beginDideDedNtwkTypCd, beginDideDedNtwkTypCd + DIDE_DED_NTWK_TYP_CD_LEN));
  }

  int localDideDedSemiPvtRtCdCounter = -1;

  public boolean isDideDedSemiPvtRtCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedSemiPvtRtCdCounter != sharedCounter;
    localDideDedSemiPvtRtCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_SEMI_PVT_RT_CD_LEN = 1;
  /** serialize this DideDedSemiPvtRtCd */
  protected void serializeDideDedSemiPvtRtCd(char[] dideDedSemiPvtRtCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dideDedSemiPvtRtCd,
        0,
        getStringValue(),
        beginDideDedSemiPvtRtCd,
        DIDE_DED_SEMI_PVT_RT_CD_LEN);
    localDideDedSemiPvtRtCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedSemiPvtRtCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDideDedSemiPvtRtCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedSemiPvtRtCd() {
    return (substring(
        getStringValue(),
        beginDideDedSemiPvtRtCd,
        beginDideDedSemiPvtRtCd + DIDE_DED_SEMI_PVT_RT_CD_LEN));
  }

  int localDideDedSrvcDescCounter = -1;

  public boolean isDideDedSrvcDescModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideDedSrvcDescCounter != sharedCounter;
    localDideDedSrvcDescCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_DED_SRVC_DESC_LEN = 6;
  /** serialize this DideDedSrvcDesc */
  protected void serializeDideDedSrvcDesc(char[] dideDedSrvcDesc) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideDedSrvcDesc, 0, getStringValue(), beginDideDedSrvcDesc, DIDE_DED_SRVC_DESC_LEN);
    localDideDedSrvcDescCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideDedSrvcDescConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDideDedSrvcDesc is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideDedSrvcDesc() {
    return (substring(
        getStringValue(), beginDideDedSrvcDesc, beginDideDedSrvcDesc + DIDE_DED_SRVC_DESC_LEN));
  }

  int localDideLstUpdtDttmCounter = -1;

  public boolean isDideLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideLstUpdtDttmCounter != sharedCounter;
    localDideLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_LST_UPDT_DTTM_LEN = 26;
  /** serialize this DideLstUpdtDttm */
  protected void serializeDideLstUpdtDttm(char[] dideLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dideLstUpdtDttm, 0, getStringValue(), beginDideLstUpdtDttm, DIDE_LST_UPDT_DTTM_LEN);
    localDideLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDideLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideLstUpdtDttm() {
    return (substring(
        getStringValue(), beginDideLstUpdtDttm, beginDideLstUpdtDttm + DIDE_LST_UPDT_DTTM_LEN));
  }

  int localDideLstUpdtUserIdCounter = -1;

  public boolean isDideLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDideLstUpdtUserIdCounter != sharedCounter;
    localDideLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DIDE_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this DideLstUpdtUserId */
  protected void serializeDideLstUpdtUserId(char[] dideLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dideLstUpdtUserId, 0, getStringValue(), beginDideLstUpdtUserId, DIDE_LST_UPDT_USER_ID_LEN);
    localDideLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDideLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshDideLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDideLstUpdtUserId() {
    return (substring(
        getStringValue(),
        beginDideLstUpdtUserId,
        beginDideLstUpdtUserId + DIDE_LST_UPDT_USER_ID_LEN));
  }
}
