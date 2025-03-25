package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnMstrPhysMedcnSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnMstrPhysMedcnSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnMstrPhysMedcnSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_MSTR_PHYS_MEDCN_LENGTH = 24;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDcpmTrpyTypCd;
  protected int beginDcpmTrpyCtgyCd;
  protected int beginDcpmTrpyBenLmtParCnt;
  protected int beginDcpmNtwkStsParCd;
  protected int beginDcpmTrpyBenLmtNparCnt;
  protected int beginDcpmNtwkStsNparCd;

  /** Constructor for DclpolPlnMstrPhysMedcnSerialized */
  public DclpolPlnMstrPhysMedcnSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnMstrPhysMedcnSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_MSTR_PHYS_MEDCN_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDcpmTrpyTypCd = getStartOffset() + 15; // set offset for serialization

    beginDcpmTrpyCtgyCd = getStartOffset() + 16; // set offset for serialization

    beginDcpmTrpyBenLmtParCnt = getStartOffset() + 18; // set offset for serialization

    beginDcpmNtwkStsParCd = getStartOffset() + 20; // set offset for serialization

    beginDcpmTrpyBenLmtNparCnt = getStartOffset() + 21; // set offset for serialization

    beginDcpmNtwkStsNparCd = getStartOffset() + 23; // set offset for serialization

    /*  end of offset */
  }

  int localDcpmTrpyTypCdCounter = -1;

  public boolean isDcpmTrpyTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDcpmTrpyTypCdCounter != sharedCounter;
    localDcpmTrpyTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DCPM_TRPY_TYP_CD_LEN = 1;
  /** serialize this DcpmTrpyTypCd */
  protected void serializeDcpmTrpyTypCd(char[] dcpmTrpyTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dcpmTrpyTypCd, 0, getStringValue(), beginDcpmTrpyTypCd, DCPM_TRPY_TYP_CD_LEN);
    localDcpmTrpyTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDcpmTrpyTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDcpmTrpyTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDcpmTrpyTypCd() {
    return (substring(
        getStringValue(), beginDcpmTrpyTypCd, beginDcpmTrpyTypCd + DCPM_TRPY_TYP_CD_LEN));
  }

  int localDcpmTrpyCtgyCdCounter = -1;

  public boolean isDcpmTrpyCtgyCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDcpmTrpyCtgyCdCounter != sharedCounter;
    localDcpmTrpyCtgyCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DCPM_TRPY_CTGY_CD_LEN = 2;
  /** serialize this DcpmTrpyCtgyCd */
  protected void serializeDcpmTrpyCtgyCd(char[] dcpmTrpyCtgyCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dcpmTrpyCtgyCd, 0, getStringValue(), beginDcpmTrpyCtgyCd, DCPM_TRPY_CTGY_CD_LEN);
    localDcpmTrpyCtgyCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDcpmTrpyCtgyCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDcpmTrpyCtgyCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDcpmTrpyCtgyCd() {
    return (substring(
        getStringValue(), beginDcpmTrpyCtgyCd, beginDcpmTrpyCtgyCd + DCPM_TRPY_CTGY_CD_LEN));
  }

  int localDcpmTrpyBenLmtParCntCounter = -1;

  public boolean isDcpmTrpyBenLmtParCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDcpmTrpyBenLmtParCntCounter != sharedCounter;
    localDcpmTrpyBenLmtParCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DCPM_TRPY_BEN_LMT_PAR_CNT_LEN = 2;
  /** serializeDcpmTrpyBenLmtParCnt */
  protected void serializeDcpmTrpyBenLmtParCnt(short dcpmTrpyBenLmtParCnt) {
    replaceValue( //  save the value as string
        getBinaryString(dcpmTrpyBenLmtParCnt, DCPM_TRPY_BEN_LMT_PAR_CNT_LEN),
        beginDcpmTrpyBenLmtParCnt,
        DCPM_TRPY_BEN_LMT_PAR_CNT_LEN);
    localDcpmTrpyBenLmtParCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDcpmTrpyBenLmtParCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDcpmTrpyBenLmtParCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshDcpmTrpyBenLmtParCnt() {
    return (getShort(beginDcpmTrpyBenLmtParCnt));
  }

  int localDcpmNtwkStsParCdCounter = -1;

  public boolean isDcpmNtwkStsParCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDcpmNtwkStsParCdCounter != sharedCounter;
    localDcpmNtwkStsParCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DCPM_NTWK_STS_PAR_CD_LEN = 1;
  /** serialize this DcpmNtwkStsParCd */
  protected void serializeDcpmNtwkStsParCd(char[] dcpmNtwkStsParCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dcpmNtwkStsParCd, 0, getStringValue(), beginDcpmNtwkStsParCd, DCPM_NTWK_STS_PAR_CD_LEN);
    localDcpmNtwkStsParCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDcpmNtwkStsParCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDcpmNtwkStsParCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDcpmNtwkStsParCd() {
    return (substring(
        getStringValue(), beginDcpmNtwkStsParCd, beginDcpmNtwkStsParCd + DCPM_NTWK_STS_PAR_CD_LEN));
  }

  int localDcpmTrpyBenLmtNparCntCounter = -1;

  public boolean isDcpmTrpyBenLmtNparCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDcpmTrpyBenLmtNparCntCounter != sharedCounter;
    localDcpmTrpyBenLmtNparCntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DCPM_TRPY_BEN_LMT_NPAR_CNT_LEN = 2;
  /** serializeDcpmTrpyBenLmtNparCnt */
  protected void serializeDcpmTrpyBenLmtNparCnt(short dcpmTrpyBenLmtNparCnt) {
    replaceValue( //  save the value as string
        getBinaryString(dcpmTrpyBenLmtNparCnt, DCPM_TRPY_BEN_LMT_NPAR_CNT_LEN),
        beginDcpmTrpyBenLmtNparCnt,
        DCPM_TRPY_BEN_LMT_NPAR_CNT_LEN);
    localDcpmTrpyBenLmtNparCntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDcpmTrpyBenLmtNparCntMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDcpmTrpyBenLmtNparCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshDcpmTrpyBenLmtNparCnt() {
    return (getShort(beginDcpmTrpyBenLmtNparCnt));
  }

  int localDcpmNtwkStsNparCdCounter = -1;

  public boolean isDcpmNtwkStsNparCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDcpmNtwkStsNparCdCounter != sharedCounter;
    localDcpmNtwkStsNparCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DCPM_NTWK_STS_NPAR_CD_LEN = 1;
  /** serialize this DcpmNtwkStsNparCd */
  protected void serializeDcpmNtwkStsNparCd(char[] dcpmNtwkStsNparCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dcpmNtwkStsNparCd, 0, getStringValue(), beginDcpmNtwkStsNparCd, DCPM_NTWK_STS_NPAR_CD_LEN);
    localDcpmNtwkStsNparCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDcpmNtwkStsNparCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDcpmNtwkStsNparCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDcpmNtwkStsNparCd() {
    return (substring(
        getStringValue(),
        beginDcpmNtwkStsNparCd,
        beginDcpmNtwkStsNparCd + DCPM_NTWK_STS_NPAR_CD_LEN));
  }
}
