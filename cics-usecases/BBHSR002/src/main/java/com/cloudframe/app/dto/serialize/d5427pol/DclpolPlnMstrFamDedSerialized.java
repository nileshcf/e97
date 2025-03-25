package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrFamDedSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrFamDedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrFamDedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_FAM_DED_LENGTH = 85;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDfdeCovTypCd;
  protected int beginDfdePolNbr;
  protected int beginDfdePlnNbr;
  protected int beginDfdeClssNbr;
  protected int beginDfdeSeqNbr;
  protected int beginDfdeDedAmt;
  protected int beginDfdeDedCaroCd;
  protected int beginDfdeDedCd;
  protected int beginDfdeDedCstCntnCd;
  protected int beginDfdeDedEeChrgAmt;
  protected int beginDfdeDedEePls1Amt;
  protected int beginDfdeDedEeSpoAmt;
  protected int beginDfdeDedFreqPrdCd;
  protected int beginDfdeDedMbrCnt;
  protected int beginDfdeDedMbrDesc;
  protected int beginDfdeDedMultFct;
  protected int beginDfdeDedMultSalryPct;
  protected int beginDfdeLstUpdtDttm;
  protected int beginDfdeLstUpdtUserId;
  protected int beginDfdeOopMultFct;

  /** Constructor for DclpolPlnMstrFamDedSerialized */
  public DclpolPlnMstrFamDedSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrFamDedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_FAM_DED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDfdeCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginDfdePolNbr = getStartOffset() + 1; // set offset for serialization

    beginDfdePlnNbr = getStartOffset() + 7; // set offset for serialization

    beginDfdeClssNbr = getStartOffset() + 11; // set offset for serialization

    beginDfdeSeqNbr = getStartOffset() + 15; // set offset for serialization

    beginDfdeDedAmt = getStartOffset() + 17; // set offset for serialization

    beginDfdeDedCaroCd = getStartOffset() + 21; // set offset for serialization

    beginDfdeDedCd = getStartOffset() + 22; // set offset for serialization

    beginDfdeDedCstCntnCd = getStartOffset() + 23; // set offset for serialization

    beginDfdeDedEeChrgAmt = getStartOffset() + 24; // set offset for serialization

    beginDfdeDedEePls1Amt = getStartOffset() + 28; // set offset for serialization

    beginDfdeDedEeSpoAmt = getStartOffset() + 32; // set offset for serialization

    beginDfdeDedFreqPrdCd = getStartOffset() + 36; // set offset for serialization

    beginDfdeDedMbrCnt = getStartOffset() + 37; // set offset for serialization

    beginDfdeDedMbrDesc = getStartOffset() + 38; // set offset for serialization

    beginDfdeDedMultFct = getStartOffset() + 44; // set offset for serialization

    beginDfdeDedMultSalryPct = getStartOffset() + 46; // set offset for serialization

    beginDfdeLstUpdtDttm = getStartOffset() + 48; // set offset for serialization

    beginDfdeLstUpdtUserId = getStartOffset() + 74; // set offset for serialization

    beginDfdeOopMultFct = getStartOffset() + 83; // set offset for serialization

    /*  end of offset */
  }

  int localDfdeCovTypCdCounter = -1;

  public boolean isDfdeCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeCovTypCdCounter != sharedCounter;
    localDfdeCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_COV_TYP_CD_LEN = 1;
  /** serialize this DfdeCovTypCd */
  protected void serializeDfdeCovTypCd(char[] dfdeCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdeCovTypCd, 0, getStringValue(), beginDfdeCovTypCd, DFDE_COV_TYP_CD_LEN);
    localDfdeCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDfdeCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeCovTypCd() {
    return (substring(
        getStringValue(), beginDfdeCovTypCd, beginDfdeCovTypCd + DFDE_COV_TYP_CD_LEN));
  }

  int localDfdePolNbrCounter = -1;

  public boolean isDfdePolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdePolNbrCounter != sharedCounter;
    localDfdePolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_POL_NBR_LEN = 6;
  /** serialize this DfdePolNbr */
  protected void serializeDfdePolNbr(char[] dfdePolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdePolNbr, 0, getStringValue(), beginDfdePolNbr, DFDE_POL_NBR_LEN);
    localDfdePolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdePolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDfdePolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDfdePolNbr() {
    return (substring(getStringValue(), beginDfdePolNbr, beginDfdePolNbr + DFDE_POL_NBR_LEN));
  }

  int localDfdePlnNbrCounter = -1;

  public boolean isDfdePlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdePlnNbrCounter != sharedCounter;
    localDfdePlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_PLN_NBR_LEN = 4;
  /** serialize this DfdePlnNbr */
  protected void serializeDfdePlnNbr(char[] dfdePlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdePlnNbr, 0, getStringValue(), beginDfdePlnNbr, DFDE_PLN_NBR_LEN);
    localDfdePlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdePlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDfdePlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDfdePlnNbr() {
    return (substring(getStringValue(), beginDfdePlnNbr, beginDfdePlnNbr + DFDE_PLN_NBR_LEN));
  }

  int localDfdeClssNbrCounter = -1;

  public boolean isDfdeClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeClssNbrCounter != sharedCounter;
    localDfdeClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_CLSS_NBR_LEN = 4;
  /** serialize this DfdeClssNbr */
  protected void serializeDfdeClssNbr(char[] dfdeClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdeClssNbr, 0, getStringValue(), beginDfdeClssNbr, DFDE_CLSS_NBR_LEN);
    localDfdeClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDfdeClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDfdeClssNbr() {
    return (substring(getStringValue(), beginDfdeClssNbr, beginDfdeClssNbr + DFDE_CLSS_NBR_LEN));
  }

  int localDfdeSeqNbrCounter = -1;

  public boolean isDfdeSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeSeqNbrCounter != sharedCounter;
    localDfdeSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_SEQ_NBR_LEN = 2;
  /** serializeDfdeSeqNbr */
  protected void serializeDfdeSeqNbr(short dfdeSeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(dfdeSeqNbr, DFDE_SEQ_NBR_LEN), beginDfdeSeqNbr, DFDE_SEQ_NBR_LEN);
    localDfdeSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDfdeSeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDfdeSeqNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshDfdeSeqNbr() {
    return (getShort(beginDfdeSeqNbr));
  }

  int localDfdeDedAmtCounter = -1;

  public boolean isDfdeDedAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedAmtCounter != sharedCounter;
    localDfdeDedAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_AMT_LEN = 4;
  /** serializeDfdeDedAmt */
  protected void serializeDfdeDedAmt(int dfdeDedAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dfdeDedAmt, DFDE_DED_AMT_LEN), beginDfdeDedAmt, DFDE_DED_AMT_LEN);
    localDfdeDedAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkDfdeDedAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshDfdeDedAmt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshDfdeDedAmt() {
    return (getInt(beginDfdeDedAmt));
  }

  int localDfdeDedCaroCdCounter = -1;

  public boolean isDfdeDedCaroCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedCaroCdCounter != sharedCounter;
    localDfdeDedCaroCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_CARO_CD_LEN = 1;
  /** serialize this DfdeDedCaroCd */
  protected void serializeDfdeDedCaroCd(char[] dfdeDedCaroCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdeDedCaroCd, 0, getStringValue(), beginDfdeDedCaroCd, DFDE_DED_CARO_CD_LEN);
    localDfdeDedCaroCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeDedCaroCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDfdeDedCaroCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeDedCaroCd() {
    return (substring(
        getStringValue(), beginDfdeDedCaroCd, beginDfdeDedCaroCd + DFDE_DED_CARO_CD_LEN));
  }

  int localDfdeDedCdCounter = -1;

  public boolean isDfdeDedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedCdCounter != sharedCounter;
    localDfdeDedCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_CD_LEN = 1;
  /** serialize this DfdeDedCd */
  protected void serializeDfdeDedCd(char[] dfdeDedCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdeDedCd, 0, getStringValue(), beginDfdeDedCd, DFDE_DED_CD_LEN);
    localDfdeDedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeDedCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDfdeDedCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDfdeDedCd() {
    return (substring(getStringValue(), beginDfdeDedCd, beginDfdeDedCd + DFDE_DED_CD_LEN));
  }

  int localDfdeDedCstCntnCdCounter = -1;

  public boolean isDfdeDedCstCntnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedCstCntnCdCounter != sharedCounter;
    localDfdeDedCstCntnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_CST_CNTN_CD_LEN = 1;
  /** serialize this DfdeDedCstCntnCd */
  protected void serializeDfdeDedCstCntnCd(char[] dfdeDedCstCntnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dfdeDedCstCntnCd, 0, getStringValue(), beginDfdeDedCstCntnCd, DFDE_DED_CST_CNTN_CD_LEN);
    localDfdeDedCstCntnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeDedCstCntnCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDfdeDedCstCntnCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeDedCstCntnCd() {
    return (substring(
        getStringValue(), beginDfdeDedCstCntnCd, beginDfdeDedCstCntnCd + DFDE_DED_CST_CNTN_CD_LEN));
  }

  int localDfdeDedEeChrgAmtCounter = -1;

  public boolean isDfdeDedEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedEeChrgAmtCounter != sharedCounter;
    localDfdeDedEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_EE_CHRG_AMT_LEN = 4;
  /** serializeDfdeDedEeChrgAmt */
  protected void serializeDfdeDedEeChrgAmt(int dfdeDedEeChrgAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dfdeDedEeChrgAmt, DFDE_DED_EE_CHRG_AMT_LEN),
        beginDfdeDedEeChrgAmt,
        DFDE_DED_EE_CHRG_AMT_LEN);
    localDfdeDedEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkDfdeDedEeChrgAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshDfdeDedEeChrgAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshDfdeDedEeChrgAmt() {
    return (getInt(beginDfdeDedEeChrgAmt));
  }

  int localDfdeDedEePls1AmtCounter = -1;

  public boolean isDfdeDedEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedEePls1AmtCounter != sharedCounter;
    localDfdeDedEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_EE_PLS_1_AMT_LEN = 4;
  /** serializeDfdeDedEePls1Amt */
  protected void serializeDfdeDedEePls1Amt(int dfdeDedEePls1Amt) {
    replaceValue( //  save the value as string
        getBinaryString(dfdeDedEePls1Amt, DFDE_DED_EE_PLS_1_AMT_LEN),
        beginDfdeDedEePls1Amt,
        DFDE_DED_EE_PLS_1_AMT_LEN);
    localDfdeDedEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkDfdeDedEePls1AmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshDfdeDedEePls1Amt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshDfdeDedEePls1Amt() {
    return (getInt(beginDfdeDedEePls1Amt));
  }

  int localDfdeDedEeSpoAmtCounter = -1;

  public boolean isDfdeDedEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedEeSpoAmtCounter != sharedCounter;
    localDfdeDedEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_EE_SPO_AMT_LEN = 4;
  /** serializeDfdeDedEeSpoAmt */
  protected void serializeDfdeDedEeSpoAmt(int dfdeDedEeSpoAmt) {
    replaceValue( //  save the value as string
        getBinaryString(dfdeDedEeSpoAmt, DFDE_DED_EE_SPO_AMT_LEN),
        beginDfdeDedEeSpoAmt,
        DFDE_DED_EE_SPO_AMT_LEN);
    localDfdeDedEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkDfdeDedEeSpoAmtMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshDfdeDedEeSpoAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshDfdeDedEeSpoAmt() {
    return (getInt(beginDfdeDedEeSpoAmt));
  }

  int localDfdeDedFreqPrdCdCounter = -1;

  public boolean isDfdeDedFreqPrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedFreqPrdCdCounter != sharedCounter;
    localDfdeDedFreqPrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_FREQ_PRD_CD_LEN = 1;
  /** serialize this DfdeDedFreqPrdCd */
  protected void serializeDfdeDedFreqPrdCd(char[] dfdeDedFreqPrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dfdeDedFreqPrdCd, 0, getStringValue(), beginDfdeDedFreqPrdCd, DFDE_DED_FREQ_PRD_CD_LEN);
    localDfdeDedFreqPrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeDedFreqPrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDfdeDedFreqPrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeDedFreqPrdCd() {
    return (substring(
        getStringValue(), beginDfdeDedFreqPrdCd, beginDfdeDedFreqPrdCd + DFDE_DED_FREQ_PRD_CD_LEN));
  }

  int localDfdeDedMbrCntCounter = -1;

  public boolean isDfdeDedMbrCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedMbrCntCounter != sharedCounter;
    localDfdeDedMbrCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_MBR_CNT_LEN = 1;
  /** serialize this DfdeDedMbrCnt */
  protected void serializeDfdeDedMbrCnt(char[] dfdeDedMbrCnt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdeDedMbrCnt, 0, getStringValue(), beginDfdeDedMbrCnt, DFDE_DED_MBR_CNT_LEN);
    localDfdeDedMbrCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeDedMbrCntConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDfdeDedMbrCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeDedMbrCnt() {
    return (substring(
        getStringValue(), beginDfdeDedMbrCnt, beginDfdeDedMbrCnt + DFDE_DED_MBR_CNT_LEN));
  }

  int localDfdeDedMbrDescCounter = -1;

  public boolean isDfdeDedMbrDescModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedMbrDescCounter != sharedCounter;
    localDfdeDedMbrDescCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_MBR_DESC_LEN = 6;
  /** serialize this DfdeDedMbrDesc */
  protected void serializeDfdeDedMbrDesc(char[] dfdeDedMbrDesc) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdeDedMbrDesc, 0, getStringValue(), beginDfdeDedMbrDesc, DFDE_DED_MBR_DESC_LEN);
    localDfdeDedMbrDescCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeDedMbrDescConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDfdeDedMbrDesc is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeDedMbrDesc() {
    return (substring(
        getStringValue(), beginDfdeDedMbrDesc, beginDfdeDedMbrDesc + DFDE_DED_MBR_DESC_LEN));
  }

  int localDfdeDedMultFctCounter = -1;

  public boolean isDfdeDedMultFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedMultFctCounter != sharedCounter;
    localDfdeDedMultFctCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_DED_MULT_FCT_LEN = 2;
  /** serializeDfdeDedMultFct */
  protected void serializeDfdeDedMultFct(short dfdeDedMultFct) {
    replaceValue( //  save the value as string
        getBinaryString(dfdeDedMultFct, DFDE_DED_MULT_FCT_LEN),
        beginDfdeDedMultFct,
        DFDE_DED_MULT_FCT_LEN);
    localDfdeDedMultFctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDfdeDedMultFctMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDfdeDedMultFct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshDfdeDedMultFct() {
    return (getShort(beginDfdeDedMultFct));
  }

  int localDfdeDedMultSalryPctCounter = -1;

  public boolean isDfdeDedMultSalryPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeDedMultSalryPctCounter != sharedCounter;
    localDfdeDedMultSalryPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean dfdeDedMultSalryPctIsNumeric() {
    return decimalIsNumeric(
        beginDfdeDedMultSalryPct,
        DFDE_DED_MULT_SALRY_PCT_LEN); // check Packed Decimal field to see if it contains valid
                                      // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dfdeDedMultSalryPctString() {
    return getPackedString(beginDfdeDedMultSalryPct, DFDE_DED_MULT_SALRY_PCT_LEN);
  }

  protected static final int DFDE_DED_MULT_SALRY_PCT_LEN = 2;
  protected static final int DFDE_DED_MULT_SALRY_PCT_SCALE = 2;
  /** serializeDfdeDedMultSalryPct */
  protected void serializeDfdeDedMultSalryPct(BigDecimal dfdeDedMultSalryPct) {
    putDecimal(
        beginDfdeDedMultSalryPct,
        dfdeDedMultSalryPct,
        DFDE_DED_MULT_SALRY_PCT_LEN,
        DFDE_DED_MULT_SALRY_PCT_SCALE,
        true);
    localDfdeDedMultSalryPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDfdeDedMultSalryPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }
  /**
   * refreshDfdeDedMultSalryPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshDfdeDedMultSalryPct() throws CFException {
    try {
      return (getDecimal(
          beginDfdeDedMultSalryPct, DFDE_DED_MULT_SALRY_PCT_LEN, DFDE_DED_MULT_SALRY_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "dfdeDedMultSalryPct", beginDfdeDedMultSalryPct, DFDE_DED_MULT_SALRY_PCT_LEN);
    }
  }

  int localDfdeLstUpdtDttmCounter = -1;

  public boolean isDfdeLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeLstUpdtDttmCounter != sharedCounter;
    localDfdeLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_LST_UPDT_DTTM_LEN = 26;
  /** serialize this DfdeLstUpdtDttm */
  protected void serializeDfdeLstUpdtDttm(char[] dfdeLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dfdeLstUpdtDttm, 0, getStringValue(), beginDfdeLstUpdtDttm, DFDE_LST_UPDT_DTTM_LEN);
    localDfdeLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDfdeLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeLstUpdtDttm() {
    return (substring(
        getStringValue(), beginDfdeLstUpdtDttm, beginDfdeLstUpdtDttm + DFDE_LST_UPDT_DTTM_LEN));
  }

  int localDfdeLstUpdtUserIdCounter = -1;

  public boolean isDfdeLstUpdtUserIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeLstUpdtUserIdCounter != sharedCounter;
    localDfdeLstUpdtUserIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DFDE_LST_UPDT_USER_ID_LEN = 9;
  /** serialize this DfdeLstUpdtUserId */
  protected void serializeDfdeLstUpdtUserId(char[] dfdeLstUpdtUserId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dfdeLstUpdtUserId, 0, getStringValue(), beginDfdeLstUpdtUserId, DFDE_LST_UPDT_USER_ID_LEN);
    localDfdeLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDfdeLstUpdtUserIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshDfdeLstUpdtUserId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDfdeLstUpdtUserId() {
    return (substring(
        getStringValue(),
        beginDfdeLstUpdtUserId,
        beginDfdeLstUpdtUserId + DFDE_LST_UPDT_USER_ID_LEN));
  }

  int localDfdeOopMultFctCounter = -1;

  public boolean isDfdeOopMultFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfdeOopMultFctCounter != sharedCounter;
    localDfdeOopMultFctCounter = sharedCounter;
    return hasModified;
  }

  public boolean dfdeOopMultFctIsNumeric() {
    return decimalIsNumeric(
        beginDfdeOopMultFct,
        DFDE_OOP_MULT_FCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dfdeOopMultFctString() {
    return getPackedString(beginDfdeOopMultFct, DFDE_OOP_MULT_FCT_LEN);
  }

  protected static final int DFDE_OOP_MULT_FCT_LEN = 2;
  protected static final int DFDE_OOP_MULT_FCT_SCALE = 2;
  /** serializeDfdeOopMultFct */
  protected void serializeDfdeOopMultFct(BigDecimal dfdeOopMultFct) {
    putDecimal(
        beginDfdeOopMultFct, dfdeOopMultFct, DFDE_OOP_MULT_FCT_LEN, DFDE_OOP_MULT_FCT_SCALE, true);
    localDfdeOopMultFctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDfdeOopMultFctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }
  /**
   * refreshDfdeOopMultFct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDfdeOopMultFct() throws CFException {
    try {
      return (getDecimal(beginDfdeOopMultFct, DFDE_OOP_MULT_FCT_LEN, DFDE_OOP_MULT_FCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dfdeOopMultFct", beginDfdeOopMultFct, DFDE_OOP_MULT_FCT_LEN);
    }
  }
}
