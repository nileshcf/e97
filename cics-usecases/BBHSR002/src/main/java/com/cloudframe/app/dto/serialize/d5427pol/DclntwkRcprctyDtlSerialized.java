package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclntwkRcprctyDtlSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclntwkRcprctyDtlSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclntwkRcprctyDtlSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLNTWK_RCPRCTY_DTL_LENGTH = 38;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDtlRcprctyTblId;
  protected int beginDtlRcprctySeqNbr;
  protected int beginDtlPrdctCd;
  protected int beginDtlMktTypCd;
  protected int beginDtlMktNbr;
  protected int beginDtlIpaNbr;
  protected int beginDtlGrpTblNbr;
  protected int beginDtlPsvCd;
  protected int beginDtlPrefCd;
  protected int beginDtlContrArngNbr;
  protected int beginDtlInclXcldCd;
  protected int beginDtlMntlHlthNtwkCd;
  protected int beginDtlTravBenCd;
  protected int beginDtlRvrsTierInd;
  protected int beginDtlXwlkCrltCd;
  protected int beginDtlDemotedPremDesigInd;

  /** Constructor for DclntwkRcprctyDtlSerialized */
  public DclntwkRcprctyDtlSerialized() {
    init(0);
  }

  /** initializes the field in DclntwkRcprctyDtlSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLNTWK_RCPRCTY_DTL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDtlRcprctyTblId = getStartOffset() + 0; // set offset for serialization

    beginDtlRcprctySeqNbr = getStartOffset() + 6; // set offset for serialization

    beginDtlPrdctCd = getStartOffset() + 8; // set offset for serialization

    beginDtlMktTypCd = getStartOffset() + 11; // set offset for serialization

    beginDtlMktNbr = getStartOffset() + 13; // set offset for serialization

    beginDtlIpaNbr = getStartOffset() + 20; // set offset for serialization

    beginDtlGrpTblNbr = getStartOffset() + 25; // set offset for serialization

    beginDtlPsvCd = getStartOffset() + 29; // set offset for serialization

    beginDtlPrefCd = getStartOffset() + 30; // set offset for serialization

    beginDtlContrArngNbr = getStartOffset() + 31; // set offset for serialization

    beginDtlInclXcldCd = getStartOffset() + 32; // set offset for serialization

    beginDtlMntlHlthNtwkCd = getStartOffset() + 33; // set offset for serialization

    beginDtlTravBenCd = getStartOffset() + 34; // set offset for serialization

    beginDtlRvrsTierInd = getStartOffset() + 35; // set offset for serialization

    beginDtlXwlkCrltCd = getStartOffset() + 36; // set offset for serialization

    beginDtlDemotedPremDesigInd = getStartOffset() + 37; // set offset for serialization

    /*  end of offset */
  }

  int localDtlRcprctyTblIdCounter = -1;

  public boolean isDtlRcprctyTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlRcprctyTblIdCounter != sharedCounter;
    localDtlRcprctyTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_RCPRCTY_TBL_ID_LEN = 6;
  /** serialize this DtlRcprctyTblId */
  protected void serializeDtlRcprctyTblId(char[] dtlRcprctyTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlRcprctyTblId, 0, getStringValue(), beginDtlRcprctyTblId, DTL_RCPRCTY_TBL_ID_LEN);
    localDtlRcprctyTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlRcprctyTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDtlRcprctyTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlRcprctyTblId() {
    return (substring(
        getStringValue(), beginDtlRcprctyTblId, beginDtlRcprctyTblId + DTL_RCPRCTY_TBL_ID_LEN));
  }

  int localDtlRcprctySeqNbrCounter = -1;

  public boolean isDtlRcprctySeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlRcprctySeqNbrCounter != sharedCounter;
    localDtlRcprctySeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_RCPRCTY_SEQ_NBR_LEN = 2;
  /** serializeDtlRcprctySeqNbr */
  protected void serializeDtlRcprctySeqNbr(short dtlRcprctySeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(dtlRcprctySeqNbr, DTL_RCPRCTY_SEQ_NBR_LEN),
        beginDtlRcprctySeqNbr,
        DTL_RCPRCTY_SEQ_NBR_LEN);
    localDtlRcprctySeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDtlRcprctySeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDtlRcprctySeqNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshDtlRcprctySeqNbr() {
    return (getShort(beginDtlRcprctySeqNbr));
  }

  int localDtlPrdctCdCounter = -1;

  public boolean isDtlPrdctCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlPrdctCdCounter != sharedCounter;
    localDtlPrdctCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_PRDCT_CD_LEN = 3;
  /** serialize this DtlPrdctCd */
  protected void serializeDtlPrdctCd(char[] dtlPrdctCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlPrdctCd, 0, getStringValue(), beginDtlPrdctCd, DTL_PRDCT_CD_LEN);
    localDtlPrdctCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlPrdctCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshDtlPrdctCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDtlPrdctCd() {
    return (substring(getStringValue(), beginDtlPrdctCd, beginDtlPrdctCd + DTL_PRDCT_CD_LEN));
  }

  int localDtlMktTypCdCounter = -1;

  public boolean isDtlMktTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlMktTypCdCounter != sharedCounter;
    localDtlMktTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_MKT_TYP_CD_LEN = 2;
  /** serialize this DtlMktTypCd */
  protected void serializeDtlMktTypCd(char[] dtlMktTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlMktTypCd, 0, getStringValue(), beginDtlMktTypCd, DTL_MKT_TYP_CD_LEN);
    localDtlMktTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlMktTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshDtlMktTypCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDtlMktTypCd() {
    return (substring(getStringValue(), beginDtlMktTypCd, beginDtlMktTypCd + DTL_MKT_TYP_CD_LEN));
  }

  int localDtlMktNbrCounter = -1;

  public boolean isDtlMktNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlMktNbrCounter != sharedCounter;
    localDtlMktNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_MKT_NBR_LEN = 7;
  /** serialize this DtlMktNbr */
  protected void serializeDtlMktNbr(char[] dtlMktNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlMktNbr, 0, getStringValue(), beginDtlMktNbr, DTL_MKT_NBR_LEN);
    localDtlMktNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlMktNbrConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshDtlMktNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDtlMktNbr() {
    return (substring(getStringValue(), beginDtlMktNbr, beginDtlMktNbr + DTL_MKT_NBR_LEN));
  }

  int localDtlIpaNbrCounter = -1;

  public boolean isDtlIpaNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlIpaNbrCounter != sharedCounter;
    localDtlIpaNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_IPA_NBR_LEN = 5;
  /** serialize this DtlIpaNbr */
  protected void serializeDtlIpaNbr(char[] dtlIpaNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlIpaNbr, 0, getStringValue(), beginDtlIpaNbr, DTL_IPA_NBR_LEN);
    localDtlIpaNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlIpaNbrConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshDtlIpaNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDtlIpaNbr() {
    return (substring(getStringValue(), beginDtlIpaNbr, beginDtlIpaNbr + DTL_IPA_NBR_LEN));
  }

  int localDtlGrpTblNbrCounter = -1;

  public boolean isDtlGrpTblNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlGrpTblNbrCounter != sharedCounter;
    localDtlGrpTblNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_GRP_TBL_NBR_LEN = 4;
  /** serialize this DtlGrpTblNbr */
  protected void serializeDtlGrpTblNbr(char[] dtlGrpTblNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlGrpTblNbr, 0, getStringValue(), beginDtlGrpTblNbr, DTL_GRP_TBL_NBR_LEN);
    localDtlGrpTblNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlGrpTblNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDtlGrpTblNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlGrpTblNbr() {
    return (substring(
        getStringValue(), beginDtlGrpTblNbr, beginDtlGrpTblNbr + DTL_GRP_TBL_NBR_LEN));
  }

  int localDtlPsvCdCounter = -1;

  public boolean isDtlPsvCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlPsvCdCounter != sharedCounter;
    localDtlPsvCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_PSV_CD_LEN = 1;
  /** serialize this DtlPsvCd */
  protected void serializeDtlPsvCd(char[] dtlPsvCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlPsvCd, 0, getStringValue(), beginDtlPsvCd, DTL_PSV_CD_LEN);
    localDtlPsvCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlPsvCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlPsvCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDtlPsvCd() {
    return (substring(getStringValue(), beginDtlPsvCd, beginDtlPsvCd + DTL_PSV_CD_LEN));
  }

  int localDtlPrefCdCounter = -1;

  public boolean isDtlPrefCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlPrefCdCounter != sharedCounter;
    localDtlPrefCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_PREF_CD_LEN = 1;
  /** serialize this DtlPrefCd */
  protected void serializeDtlPrefCd(char[] dtlPrefCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlPrefCd, 0, getStringValue(), beginDtlPrefCd, DTL_PREF_CD_LEN);
    localDtlPrefCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlPrefCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlPrefCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDtlPrefCd() {
    return (substring(getStringValue(), beginDtlPrefCd, beginDtlPrefCd + DTL_PREF_CD_LEN));
  }

  int localDtlContrArngNbrCounter = -1;

  public boolean isDtlContrArngNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlContrArngNbrCounter != sharedCounter;
    localDtlContrArngNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_CONTR_ARNG_NBR_LEN = 1;
  /** serialize this DtlContrArngNbr */
  protected void serializeDtlContrArngNbr(char[] dtlContrArngNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlContrArngNbr, 0, getStringValue(), beginDtlContrArngNbr, DTL_CONTR_ARNG_NBR_LEN);
    localDtlContrArngNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlContrArngNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlContrArngNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlContrArngNbr() {
    return (substring(
        getStringValue(), beginDtlContrArngNbr, beginDtlContrArngNbr + DTL_CONTR_ARNG_NBR_LEN));
  }

  int localDtlInclXcldCdCounter = -1;

  public boolean isDtlInclXcldCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlInclXcldCdCounter != sharedCounter;
    localDtlInclXcldCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_INCL_XCLD_CD_LEN = 1;
  /** serialize this DtlInclXcldCd */
  protected void serializeDtlInclXcldCd(char[] dtlInclXcldCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlInclXcldCd, 0, getStringValue(), beginDtlInclXcldCd, DTL_INCL_XCLD_CD_LEN);
    localDtlInclXcldCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlInclXcldCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlInclXcldCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlInclXcldCd() {
    return (substring(
        getStringValue(), beginDtlInclXcldCd, beginDtlInclXcldCd + DTL_INCL_XCLD_CD_LEN));
  }

  int localDtlMntlHlthNtwkCdCounter = -1;

  public boolean isDtlMntlHlthNtwkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlMntlHlthNtwkCdCounter != sharedCounter;
    localDtlMntlHlthNtwkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_MNTL_HLTH_NTWK_CD_LEN = 1;
  /** serialize this DtlMntlHlthNtwkCd */
  protected void serializeDtlMntlHlthNtwkCd(char[] dtlMntlHlthNtwkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dtlMntlHlthNtwkCd, 0, getStringValue(), beginDtlMntlHlthNtwkCd, DTL_MNTL_HLTH_NTWK_CD_LEN);
    localDtlMntlHlthNtwkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlMntlHlthNtwkCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlMntlHlthNtwkCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlMntlHlthNtwkCd() {
    return (substring(
        getStringValue(),
        beginDtlMntlHlthNtwkCd,
        beginDtlMntlHlthNtwkCd + DTL_MNTL_HLTH_NTWK_CD_LEN));
  }

  int localDtlTravBenCdCounter = -1;

  public boolean isDtlTravBenCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlTravBenCdCounter != sharedCounter;
    localDtlTravBenCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_TRAV_BEN_CD_LEN = 1;
  /** serialize this DtlTravBenCd */
  protected void serializeDtlTravBenCd(char[] dtlTravBenCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlTravBenCd, 0, getStringValue(), beginDtlTravBenCd, DTL_TRAV_BEN_CD_LEN);
    localDtlTravBenCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlTravBenCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlTravBenCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlTravBenCd() {
    return (substring(
        getStringValue(), beginDtlTravBenCd, beginDtlTravBenCd + DTL_TRAV_BEN_CD_LEN));
  }

  int localDtlRvrsTierIndCounter = -1;

  public boolean isDtlRvrsTierIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlRvrsTierIndCounter != sharedCounter;
    localDtlRvrsTierIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_RVRS_TIER_IND_LEN = 1;
  /** serialize this DtlRvrsTierInd */
  protected void serializeDtlRvrsTierInd(char[] dtlRvrsTierInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlRvrsTierInd, 0, getStringValue(), beginDtlRvrsTierInd, DTL_RVRS_TIER_IND_LEN);
    localDtlRvrsTierIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlRvrsTierIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlRvrsTierInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlRvrsTierInd() {
    return (substring(
        getStringValue(), beginDtlRvrsTierInd, beginDtlRvrsTierInd + DTL_RVRS_TIER_IND_LEN));
  }

  int localDtlXwlkCrltCdCounter = -1;

  public boolean isDtlXwlkCrltCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlXwlkCrltCdCounter != sharedCounter;
    localDtlXwlkCrltCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_XWLK_CRLT_CD_LEN = 1;
  /** serialize this DtlXwlkCrltCd */
  protected void serializeDtlXwlkCrltCd(char[] dtlXwlkCrltCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dtlXwlkCrltCd, 0, getStringValue(), beginDtlXwlkCrltCd, DTL_XWLK_CRLT_CD_LEN);
    localDtlXwlkCrltCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlXwlkCrltCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlXwlkCrltCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDtlXwlkCrltCd() {
    return (substring(
        getStringValue(), beginDtlXwlkCrltCd, beginDtlXwlkCrltCd + DTL_XWLK_CRLT_CD_LEN));
  }

  int localDtlDemotedPremDesigIndCounter = -1;

  public boolean isDtlDemotedPremDesigIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDtlDemotedPremDesigIndCounter != sharedCounter;
    localDtlDemotedPremDesigIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DTL_DEMOTED_PREM_DESIG_IND_LEN = 1;
  /** serialize this DtlDemotedPremDesigInd */
  protected void serializeDtlDemotedPremDesigInd(char[] dtlDemotedPremDesigInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dtlDemotedPremDesigInd,
        0,
        getStringValue(),
        beginDtlDemotedPremDesigInd,
        DTL_DEMOTED_PREM_DESIG_IND_LEN);
    localDtlDemotedPremDesigIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDtlDemotedPremDesigIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDtlDemotedPremDesigInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDtlDemotedPremDesigInd() {
    return (substring(
        getStringValue(),
        beginDtlDemotedPremDesigInd,
        beginDtlDemotedPremDesigInd + DTL_DEMOTED_PREM_DESIG_IND_LEN));
  }
}
