package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnDenormSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnDenormSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnDenormSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_DENORM_LENGTH = 94;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDenCovTypCd;
  protected int beginDenPolNbr;
  protected int beginDenPlnNbr;
  protected int beginDenClssNbr;
  protected int beginDenPlnSeqNbr;
  protected int beginDenObsolete;
  protected int beginDenSlotTblId;
  protected int beginDenObligId;
  protected int beginDenShrArngCd;
  protected int beginDenRcprctyTblId;
  protected int beginDenNewOldSrvcInd;
  protected int beginDenCopayVarId;
  protected int beginDenLstUpdtDttm;
  protected int beginDenLstUpdtId;
  protected int beginDenStdPlnPolNbr;
  protected int beginDenStdPlnPlnNbr;
  protected int beginDenStdPlnClssNbr;
  protected int beginDenGtdHmoCd;

  /** Constructor for DclpolPlnDenormSerialized */
  public DclpolPlnDenormSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnDenormSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_DENORM_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDenCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginDenPolNbr = getStartOffset() + 1; // set offset for serialization

    beginDenPlnNbr = getStartOffset() + 7; // set offset for serialization

    beginDenClssNbr = getStartOffset() + 11; // set offset for serialization

    beginDenPlnSeqNbr = getStartOffset() + 15; // set offset for serialization

    beginDenObsolete = getStartOffset() + 17; // set offset for serialization

    beginDenSlotTblId = getStartOffset() + 23; // set offset for serialization

    beginDenObligId = getStartOffset() + 29; // set offset for serialization

    beginDenShrArngCd = getStartOffset() + 31; // set offset for serialization

    beginDenRcprctyTblId = getStartOffset() + 33; // set offset for serialization

    beginDenNewOldSrvcInd = getStartOffset() + 39; // set offset for serialization

    beginDenCopayVarId = getStartOffset() + 40; // set offset for serialization

    beginDenLstUpdtDttm = getStartOffset() + 44; // set offset for serialization

    beginDenLstUpdtId = getStartOffset() + 70; // set offset for serialization

    beginDenStdPlnPolNbr = getStartOffset() + 79; // set offset for serialization

    beginDenStdPlnPlnNbr = getStartOffset() + 85; // set offset for serialization

    beginDenStdPlnClssNbr = getStartOffset() + 89; // set offset for serialization

    beginDenGtdHmoCd = getStartOffset() + 93; // set offset for serialization

    /*  end of offset */
  }

  int localDenCovTypCdCounter = -1;

  public boolean isDenCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenCovTypCdCounter != sharedCounter;
    localDenCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_COV_TYP_CD_LEN = 1;
  /** serialize this DenCovTypCd */
  protected void serializeDenCovTypCd(char[] denCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denCovTypCd, 0, getStringValue(), beginDenCovTypCd, DEN_COV_TYP_CD_LEN);
    localDenCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDenCovTypCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDenCovTypCd() {
    return (substring(getStringValue(), beginDenCovTypCd, beginDenCovTypCd + DEN_COV_TYP_CD_LEN));
  }

  int localDenPolNbrCounter = -1;

  public boolean isDenPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenPolNbrCounter != sharedCounter;
    localDenPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_POL_NBR_LEN = 6;
  /** serialize this DenPolNbr */
  protected void serializeDenPolNbr(char[] denPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denPolNbr, 0, getStringValue(), beginDenPolNbr, DEN_POL_NBR_LEN);
    localDenPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDenPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDenPolNbr() {
    return (substring(getStringValue(), beginDenPolNbr, beginDenPolNbr + DEN_POL_NBR_LEN));
  }

  int localDenPlnNbrCounter = -1;

  public boolean isDenPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenPlnNbrCounter != sharedCounter;
    localDenPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_PLN_NBR_LEN = 4;
  /** serialize this DenPlnNbr */
  protected void serializeDenPlnNbr(char[] denPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denPlnNbr, 0, getStringValue(), beginDenPlnNbr, DEN_PLN_NBR_LEN);
    localDenPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDenPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDenPlnNbr() {
    return (substring(getStringValue(), beginDenPlnNbr, beginDenPlnNbr + DEN_PLN_NBR_LEN));
  }

  int localDenClssNbrCounter = -1;

  public boolean isDenClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenClssNbrCounter != sharedCounter;
    localDenClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_CLSS_NBR_LEN = 4;
  /** serialize this DenClssNbr */
  protected void serializeDenClssNbr(char[] denClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denClssNbr, 0, getStringValue(), beginDenClssNbr, DEN_CLSS_NBR_LEN);
    localDenClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDenClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDenClssNbr() {
    return (substring(getStringValue(), beginDenClssNbr, beginDenClssNbr + DEN_CLSS_NBR_LEN));
  }

  int localDenPlnSeqNbrCounter = -1;

  public boolean isDenPlnSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenPlnSeqNbrCounter != sharedCounter;
    localDenPlnSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_PLN_SEQ_NBR_LEN = 2;
  /** serializeDenPlnSeqNbr */
  protected void serializeDenPlnSeqNbr(short denPlnSeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(denPlnSeqNbr, DEN_PLN_SEQ_NBR_LEN), beginDenPlnSeqNbr, DEN_PLN_SEQ_NBR_LEN);
    localDenPlnSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDenPlnSeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDenPlnSeqNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshDenPlnSeqNbr() {
    return (getShort(beginDenPlnSeqNbr));
  }

  int localDenObsoleteCounter = -1;

  public boolean isDenObsoleteModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenObsoleteCounter != sharedCounter;
    localDenObsoleteCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_OBSOLETE_LEN = 6;
  /** serialize this DenObsolete */
  protected void serializeDenObsolete(char[] denObsolete) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denObsolete, 0, getStringValue(), beginDenObsolete, DEN_OBSOLETE_LEN);
    localDenObsoleteCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenObsoleteConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDenObsolete is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDenObsolete() {
    return (substring(getStringValue(), beginDenObsolete, beginDenObsolete + DEN_OBSOLETE_LEN));
  }

  int localDenSlotTblIdCounter = -1;

  public boolean isDenSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenSlotTblIdCounter != sharedCounter;
    localDenSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_SLOT_TBL_ID_LEN = 6;
  /** serialize this DenSlotTblId */
  protected void serializeDenSlotTblId(char[] denSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denSlotTblId, 0, getStringValue(), beginDenSlotTblId, DEN_SLOT_TBL_ID_LEN);
    localDenSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDenSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenSlotTblId() {
    return (substring(
        getStringValue(), beginDenSlotTblId, beginDenSlotTblId + DEN_SLOT_TBL_ID_LEN));
  }

  int localDenObligIdCounter = -1;

  public boolean isDenObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenObligIdCounter != sharedCounter;
    localDenObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_OBLIG_ID_LEN = 2;
  /** serialize this DenObligId */
  protected void serializeDenObligId(char[] denObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denObligId, 0, getStringValue(), beginDenObligId, DEN_OBLIG_ID_LEN);
    localDenObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDenObligId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDenObligId() {
    return (substring(getStringValue(), beginDenObligId, beginDenObligId + DEN_OBLIG_ID_LEN));
  }

  int localDenShrArngCdCounter = -1;

  public boolean isDenShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenShrArngCdCounter != sharedCounter;
    localDenShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_SHR_ARNG_CD_LEN = 2;
  /** serialize this DenShrArngCd */
  protected void serializeDenShrArngCd(char[] denShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denShrArngCd, 0, getStringValue(), beginDenShrArngCd, DEN_SHR_ARNG_CD_LEN);
    localDenShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDenShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenShrArngCd() {
    return (substring(
        getStringValue(), beginDenShrArngCd, beginDenShrArngCd + DEN_SHR_ARNG_CD_LEN));
  }

  int localDenRcprctyTblIdCounter = -1;

  public boolean isDenRcprctyTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenRcprctyTblIdCounter != sharedCounter;
    localDenRcprctyTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_RCPRCTY_TBL_ID_LEN = 6;
  /** serialize this DenRcprctyTblId */
  protected void serializeDenRcprctyTblId(char[] denRcprctyTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denRcprctyTblId, 0, getStringValue(), beginDenRcprctyTblId, DEN_RCPRCTY_TBL_ID_LEN);
    localDenRcprctyTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenRcprctyTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDenRcprctyTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenRcprctyTblId() {
    return (substring(
        getStringValue(), beginDenRcprctyTblId, beginDenRcprctyTblId + DEN_RCPRCTY_TBL_ID_LEN));
  }

  int localDenNewOldSrvcIndCounter = -1;

  public boolean isDenNewOldSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenNewOldSrvcIndCounter != sharedCounter;
    localDenNewOldSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_NEW_OLD_SRVC_IND_LEN = 1;
  /** serialize this DenNewOldSrvcInd */
  protected void serializeDenNewOldSrvcInd(char[] denNewOldSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        denNewOldSrvcInd, 0, getStringValue(), beginDenNewOldSrvcInd, DEN_NEW_OLD_SRVC_IND_LEN);
    localDenNewOldSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenNewOldSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDenNewOldSrvcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenNewOldSrvcInd() {
    return (substring(
        getStringValue(), beginDenNewOldSrvcInd, beginDenNewOldSrvcInd + DEN_NEW_OLD_SRVC_IND_LEN));
  }

  int localDenCopayVarIdCounter = -1;

  public boolean isDenCopayVarIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenCopayVarIdCounter != sharedCounter;
    localDenCopayVarIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_COPAY_VAR_ID_LEN = 4;
  /** serializeDenCopayVarId */
  protected void serializeDenCopayVarId(int denCopayVarId) {
    replaceValue( //  save the value as string
        getBinaryString(denCopayVarId, DEN_COPAY_VAR_ID_LEN),
        beginDenCopayVarId,
        DEN_COPAY_VAR_ID_LEN);
    localDenCopayVarIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkDenCopayVarIdMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshDenCopayVarId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshDenCopayVarId() {
    return (getInt(beginDenCopayVarId));
  }

  int localDenLstUpdtDttmCounter = -1;

  public boolean isDenLstUpdtDttmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenLstUpdtDttmCounter != sharedCounter;
    localDenLstUpdtDttmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_LST_UPDT_DTTM_LEN = 26;
  /** serialize this DenLstUpdtDttm */
  protected void serializeDenLstUpdtDttm(char[] denLstUpdtDttm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denLstUpdtDttm, 0, getStringValue(), beginDenLstUpdtDttm, DEN_LST_UPDT_DTTM_LEN);
    localDenLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenLstUpdtDttmConstraints(char[] value) {
    return super.checkConstraints(value, 26, false, false);
  }
  /**
   * refreshDenLstUpdtDttm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenLstUpdtDttm() {
    return (substring(
        getStringValue(), beginDenLstUpdtDttm, beginDenLstUpdtDttm + DEN_LST_UPDT_DTTM_LEN));
  }

  int localDenLstUpdtIdCounter = -1;

  public boolean isDenLstUpdtIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenLstUpdtIdCounter != sharedCounter;
    localDenLstUpdtIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_LST_UPDT_ID_LEN = 9;
  /** serialize this DenLstUpdtId */
  protected void serializeDenLstUpdtId(char[] denLstUpdtId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denLstUpdtId, 0, getStringValue(), beginDenLstUpdtId, DEN_LST_UPDT_ID_LEN);
    localDenLstUpdtIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenLstUpdtIdConstraints(char[] value) {
    return super.checkConstraints(value, 9, false, false);
  }
  /**
   * refreshDenLstUpdtId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenLstUpdtId() {
    return (substring(
        getStringValue(), beginDenLstUpdtId, beginDenLstUpdtId + DEN_LST_UPDT_ID_LEN));
  }

  int localDenStdPlnPolNbrCounter = -1;

  public boolean isDenStdPlnPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenStdPlnPolNbrCounter != sharedCounter;
    localDenStdPlnPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_STD_PLN_POL_NBR_LEN = 6;
  /** serialize this DenStdPlnPolNbr */
  protected void serializeDenStdPlnPolNbr(char[] denStdPlnPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denStdPlnPolNbr, 0, getStringValue(), beginDenStdPlnPolNbr, DEN_STD_PLN_POL_NBR_LEN);
    localDenStdPlnPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenStdPlnPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDenStdPlnPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenStdPlnPolNbr() {
    return (substring(
        getStringValue(), beginDenStdPlnPolNbr, beginDenStdPlnPolNbr + DEN_STD_PLN_POL_NBR_LEN));
  }

  int localDenStdPlnPlnNbrCounter = -1;

  public boolean isDenStdPlnPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenStdPlnPlnNbrCounter != sharedCounter;
    localDenStdPlnPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_STD_PLN_PLN_NBR_LEN = 4;
  /** serialize this DenStdPlnPlnNbr */
  protected void serializeDenStdPlnPlnNbr(char[] denStdPlnPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denStdPlnPlnNbr, 0, getStringValue(), beginDenStdPlnPlnNbr, DEN_STD_PLN_PLN_NBR_LEN);
    localDenStdPlnPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenStdPlnPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDenStdPlnPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenStdPlnPlnNbr() {
    return (substring(
        getStringValue(), beginDenStdPlnPlnNbr, beginDenStdPlnPlnNbr + DEN_STD_PLN_PLN_NBR_LEN));
  }

  int localDenStdPlnClssNbrCounter = -1;

  public boolean isDenStdPlnClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenStdPlnClssNbrCounter != sharedCounter;
    localDenStdPlnClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_STD_PLN_CLSS_NBR_LEN = 4;
  /** serialize this DenStdPlnClssNbr */
  protected void serializeDenStdPlnClssNbr(char[] denStdPlnClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        denStdPlnClssNbr, 0, getStringValue(), beginDenStdPlnClssNbr, DEN_STD_PLN_CLSS_NBR_LEN);
    localDenStdPlnClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenStdPlnClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDenStdPlnClssNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDenStdPlnClssNbr() {
    return (substring(
        getStringValue(), beginDenStdPlnClssNbr, beginDenStdPlnClssNbr + DEN_STD_PLN_CLSS_NBR_LEN));
  }

  int localDenGtdHmoCdCounter = -1;

  public boolean isDenGtdHmoCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDenGtdHmoCdCounter != sharedCounter;
    localDenGtdHmoCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DEN_GTD_HMO_CD_LEN = 1;
  /** serialize this DenGtdHmoCd */
  protected void serializeDenGtdHmoCd(char[] denGtdHmoCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(denGtdHmoCd, 0, getStringValue(), beginDenGtdHmoCd, DEN_GTD_HMO_CD_LEN);
    localDenGtdHmoCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDenGtdHmoCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDenGtdHmoCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDenGtdHmoCd() {
    return (substring(getStringValue(), beginDenGtdHmoCd, beginDenGtdHmoCd + DEN_GTD_HMO_CD_LEN));
  }
}
