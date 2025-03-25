package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclcustPolPlnXrefSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclcustPolPlnXrefSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclcustPolPlnXrefSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLCUST_POL_PLN_XREF_LENGTH = 194;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginXrfCovTypCd;
  protected int beginXrfPolNbr;
  protected int beginXrfPlnNbr;
  protected int beginXrfClssNbr;
  protected int beginXrfPlnSeqNbr;
  protected int beginXrfStdPlnPolNbr;
  protected int beginXrfStdPlnPlnNbr;
  protected int beginXrfStdPlnClssNbr;
  protected int beginXrfCancRsnCd;
  protected int beginXrfTefraApplInd;
  protected int beginXrfEffDt;
  protected int beginXrfCancDt;
  protected int beginXrfEbdsSet2Id;
  protected int beginXrfAcnInd;
  protected int beginXrfUhPremDesgCd;
  protected int beginXrfGtdHmoCd;
  protected int beginXrfPolNmAdrInd;
  protected int beginXrfQcareRptSelCd;
  protected int beginXrfAutoAdjdInd;
  protected int beginXrfRptCdInd;
  protected int beginXrfMailCd;
  protected int beginXrfPolPrtypNbr;
  protected int beginXrfPlnPrtypNbr;
  protected int beginXrfClssPrtypNbr;
  protected int beginXrfSfxPrtypCd;
  protected int beginXrfFranchCd;
  protected int beginXrfBaseCovSetNbr;
  protected int beginXrfMmlCovSetNbr;
  protected int beginXrfMedcrCovSetNbr;
  protected int beginXrfEbdsSetId;
  protected int beginXrfAlldAnclInd;
  protected int beginXrfPrefPhrmPrdctCd;
  protected int beginXrfPrefPhrmIdcrdCd;
  protected int beginXrfPcsInd;
  protected int beginXrfCchInd;
  protected int beginXrfCapXclsInd;
  protected int beginXrfApportPct;
  protected int beginXrfPayLoc1Nbr;
  protected int beginXrfPayLoc2Nbr;
  protected int beginXrfMnnrpCd;
  protected int beginXrfMnnrpPct;
  protected int beginXrfIplnTypCd;
  protected int beginXrfObligId;
  protected int beginXrfShrArngCd;
  protected int beginXrfMedcrEstInd;
  protected int beginXrfPayEnrleeCd;
  protected int beginXrfPrdctPlnClssCd;
  protected int beginXrfFreelookInd;
  protected int beginXrfEvdBasDialgInd;
  protected int beginXrfLmtSrvcCd;
  protected int beginXrfOptoutUbhtierInd;
  protected int beginXrfHraIndAcssptAmt;
  protected int beginXrfHraFamAcssptAmt;
  protected int beginXrfDfltSrvcRcChrg;
  protected int beginXrfJqCdReimPct;
  protected int beginXrfAppealLangInd;
  protected int beginXrfReimPolEdtInd;
  protected int beginXrfPlnDedPrortInd;
  protected int beginXrfNbSprsInd;
  protected int beginXrfPrortEvnt;
  protected int beginXrfCoreMedPrrAuthCd;
  protected int beginXrfEnrpErInd;
  protected int beginXrfEnrpNonErInd;
  protected int beginXrfEnrpNonErPct;
  protected int beginXrfHcrEhbInd;
  protected int beginXrfEnrpEmrgFaclInd;
  protected int beginXrfEmergentWrpInd;
  protected int beginXrfMnnrpLabPct;
  protected int beginXrfMnnrpDmePct;
  protected int beginXrfBusSegPltfm;
  protected int beginXrfLglEntyCd;
  protected int beginXrfEnrpDfltPct;
  protected int beginXrfMnrpDfltPct;
  protected int beginXrfMnrpPtPct;
  protected int beginXrfSurprsMedBilCd;

  /** Constructor for DclcustPolPlnXrefSerialized */
  public DclcustPolPlnXrefSerialized() {
    init(0);
  }

  /** initializes the field in DclcustPolPlnXrefSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLCUST_POL_PLN_XREF_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginXrfCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginXrfPolNbr = getStartOffset() + 1; // set offset for serialization

    beginXrfPlnNbr = getStartOffset() + 7; // set offset for serialization

    beginXrfClssNbr = getStartOffset() + 11; // set offset for serialization

    beginXrfPlnSeqNbr = getStartOffset() + 15; // set offset for serialization

    beginXrfStdPlnPolNbr = getStartOffset() + 17; // set offset for serialization

    beginXrfStdPlnPlnNbr = getStartOffset() + 23; // set offset for serialization

    beginXrfStdPlnClssNbr = getStartOffset() + 27; // set offset for serialization

    beginXrfCancRsnCd = getStartOffset() + 31; // set offset for serialization

    beginXrfTefraApplInd = getStartOffset() + 32; // set offset for serialization

    beginXrfEffDt = getStartOffset() + 33; // set offset for serialization

    beginXrfCancDt = getStartOffset() + 43; // set offset for serialization

    beginXrfEbdsSet2Id = getStartOffset() + 53; // set offset for serialization

    beginXrfAcnInd = getStartOffset() + 54; // set offset for serialization

    beginXrfUhPremDesgCd = getStartOffset() + 55; // set offset for serialization

    beginXrfGtdHmoCd = getStartOffset() + 56; // set offset for serialization

    beginXrfPolNmAdrInd = getStartOffset() + 57; // set offset for serialization

    beginXrfQcareRptSelCd = getStartOffset() + 58; // set offset for serialization

    beginXrfAutoAdjdInd = getStartOffset() + 59; // set offset for serialization

    beginXrfRptCdInd = getStartOffset() + 60; // set offset for serialization

    beginXrfMailCd = getStartOffset() + 61; // set offset for serialization

    beginXrfPolPrtypNbr = getStartOffset() + 65; // set offset for serialization

    beginXrfPlnPrtypNbr = getStartOffset() + 71; // set offset for serialization

    beginXrfClssPrtypNbr = getStartOffset() + 75; // set offset for serialization

    beginXrfSfxPrtypCd = getStartOffset() + 79; // set offset for serialization

    beginXrfFranchCd = getStartOffset() + 81; // set offset for serialization

    beginXrfBaseCovSetNbr = getStartOffset() + 88; // set offset for serialization

    beginXrfMmlCovSetNbr = getStartOffset() + 91; // set offset for serialization

    beginXrfMedcrCovSetNbr = getStartOffset() + 94; // set offset for serialization

    beginXrfEbdsSetId = getStartOffset() + 97; // set offset for serialization

    beginXrfAlldAnclInd = getStartOffset() + 98; // set offset for serialization

    beginXrfPrefPhrmPrdctCd = getStartOffset() + 99; // set offset for serialization

    beginXrfPrefPhrmIdcrdCd = getStartOffset() + 105; // set offset for serialization

    beginXrfPcsInd = getStartOffset() + 106; // set offset for serialization

    beginXrfCchInd = getStartOffset() + 107; // set offset for serialization

    beginXrfCapXclsInd = getStartOffset() + 108; // set offset for serialization

    beginXrfApportPct = getStartOffset() + 109; // set offset for serialization

    beginXrfPayLoc1Nbr = getStartOffset() + 111; // set offset for serialization

    beginXrfPayLoc2Nbr = getStartOffset() + 114; // set offset for serialization

    beginXrfMnnrpCd = getStartOffset() + 117; // set offset for serialization

    beginXrfMnnrpPct = getStartOffset() + 118; // set offset for serialization

    beginXrfIplnTypCd = getStartOffset() + 120; // set offset for serialization

    beginXrfObligId = getStartOffset() + 121; // set offset for serialization

    beginXrfShrArngCd = getStartOffset() + 123; // set offset for serialization

    beginXrfMedcrEstInd = getStartOffset() + 125; // set offset for serialization

    beginXrfPayEnrleeCd = getStartOffset() + 126; // set offset for serialization

    beginXrfPrdctPlnClssCd = getStartOffset() + 127; // set offset for serialization

    beginXrfFreelookInd = getStartOffset() + 130; // set offset for serialization

    beginXrfEvdBasDialgInd = getStartOffset() + 131; // set offset for serialization

    beginXrfLmtSrvcCd = getStartOffset() + 132; // set offset for serialization

    beginXrfOptoutUbhtierInd = getStartOffset() + 133; // set offset for serialization

    beginXrfHraIndAcssptAmt = getStartOffset() + 134; // set offset for serialization

    beginXrfHraFamAcssptAmt = getStartOffset() + 143; // set offset for serialization

    beginXrfDfltSrvcRcChrg = getStartOffset() + 152; // set offset for serialization

    beginXrfJqCdReimPct = getStartOffset() + 154; // set offset for serialization

    beginXrfAppealLangInd = getStartOffset() + 156; // set offset for serialization

    beginXrfReimPolEdtInd = getStartOffset() + 157; // set offset for serialization

    beginXrfPlnDedPrortInd = getStartOffset() + 158; // set offset for serialization

    beginXrfNbSprsInd = getStartOffset() + 159; // set offset for serialization

    beginXrfPrortEvnt = getStartOffset() + 160; // set offset for serialization

    beginXrfCoreMedPrrAuthCd = getStartOffset() + 161; // set offset for serialization

    beginXrfEnrpErInd = getStartOffset() + 162; // set offset for serialization

    beginXrfEnrpNonErInd = getStartOffset() + 163; // set offset for serialization

    beginXrfEnrpNonErPct = getStartOffset() + 164; // set offset for serialization

    beginXrfHcrEhbInd = getStartOffset() + 167; // set offset for serialization

    beginXrfEnrpEmrgFaclInd = getStartOffset() + 168; // set offset for serialization

    beginXrfEmergentWrpInd = getStartOffset() + 169; // set offset for serialization

    beginXrfMnnrpLabPct = getStartOffset() + 170; // set offset for serialization

    beginXrfMnnrpDmePct = getStartOffset() + 173; // set offset for serialization

    beginXrfBusSegPltfm = getStartOffset() + 176; // set offset for serialization

    beginXrfLglEntyCd = getStartOffset() + 179; // set offset for serialization

    beginXrfEnrpDfltPct = getStartOffset() + 184; // set offset for serialization

    beginXrfMnrpDfltPct = getStartOffset() + 187; // set offset for serialization

    beginXrfMnrpPtPct = getStartOffset() + 190; // set offset for serialization

    beginXrfSurprsMedBilCd = getStartOffset() + 193; // set offset for serialization

    /*  end of offset */
  }

  int localXrfCovTypCdCounter = -1;

  public boolean isXrfCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfCovTypCdCounter != sharedCounter;
    localXrfCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_COV_TYP_CD_LEN = 1;
  /** serialize this XrfCovTypCd */
  protected void serializeXrfCovTypCd(char[] xrfCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfCovTypCd, 0, getStringValue(), beginXrfCovTypCd, XRF_COV_TYP_CD_LEN);
    localXrfCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfCovTypCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfCovTypCd() {
    return (substring(getStringValue(), beginXrfCovTypCd, beginXrfCovTypCd + XRF_COV_TYP_CD_LEN));
  }

  int localXrfPolNbrCounter = -1;

  public boolean isXrfPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPolNbrCounter != sharedCounter;
    localXrfPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_POL_NBR_LEN = 6;
  /** serialize this XrfPolNbr */
  protected void serializeXrfPolNbr(char[] xrfPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPolNbr, 0, getStringValue(), beginXrfPolNbr, XRF_POL_NBR_LEN);
    localXrfPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshXrfPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfPolNbr() {
    return (substring(getStringValue(), beginXrfPolNbr, beginXrfPolNbr + XRF_POL_NBR_LEN));
  }

  int localXrfPlnNbrCounter = -1;

  public boolean isXrfPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPlnNbrCounter != sharedCounter;
    localXrfPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PLN_NBR_LEN = 4;
  /** serialize this XrfPlnNbr */
  protected void serializeXrfPlnNbr(char[] xrfPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPlnNbr, 0, getStringValue(), beginXrfPlnNbr, XRF_PLN_NBR_LEN);
    localXrfPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshXrfPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfPlnNbr() {
    return (substring(getStringValue(), beginXrfPlnNbr, beginXrfPlnNbr + XRF_PLN_NBR_LEN));
  }

  int localXrfClssNbrCounter = -1;

  public boolean isXrfClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfClssNbrCounter != sharedCounter;
    localXrfClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_CLSS_NBR_LEN = 4;
  /** serialize this XrfClssNbr */
  protected void serializeXrfClssNbr(char[] xrfClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfClssNbr, 0, getStringValue(), beginXrfClssNbr, XRF_CLSS_NBR_LEN);
    localXrfClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshXrfClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfClssNbr() {
    return (substring(getStringValue(), beginXrfClssNbr, beginXrfClssNbr + XRF_CLSS_NBR_LEN));
  }

  int localXrfPlnSeqNbrCounter = -1;

  public boolean isXrfPlnSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPlnSeqNbrCounter != sharedCounter;
    localXrfPlnSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PLN_SEQ_NBR_LEN = 2;
  /** serializeXrfPlnSeqNbr */
  protected void serializeXrfPlnSeqNbr(short xrfPlnSeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(xrfPlnSeqNbr, XRF_PLN_SEQ_NBR_LEN), beginXrfPlnSeqNbr, XRF_PLN_SEQ_NBR_LEN);
    localXrfPlnSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkXrfPlnSeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshXrfPlnSeqNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshXrfPlnSeqNbr() {
    return (getShort(beginXrfPlnSeqNbr));
  }

  int localXrfStdPlnPolNbrCounter = -1;

  public boolean isXrfStdPlnPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfStdPlnPolNbrCounter != sharedCounter;
    localXrfStdPlnPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_STD_PLN_POL_NBR_LEN = 6;
  /** serialize this XrfStdPlnPolNbr */
  protected void serializeXrfStdPlnPolNbr(char[] xrfStdPlnPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfStdPlnPolNbr, 0, getStringValue(), beginXrfStdPlnPolNbr, XRF_STD_PLN_POL_NBR_LEN);
    localXrfStdPlnPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfStdPlnPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshXrfStdPlnPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfStdPlnPolNbr() {
    return (substring(
        getStringValue(), beginXrfStdPlnPolNbr, beginXrfStdPlnPolNbr + XRF_STD_PLN_POL_NBR_LEN));
  }

  int localXrfStdPlnPlnNbrCounter = -1;

  public boolean isXrfStdPlnPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfStdPlnPlnNbrCounter != sharedCounter;
    localXrfStdPlnPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_STD_PLN_PLN_NBR_LEN = 4;
  /** serialize this XrfStdPlnPlnNbr */
  protected void serializeXrfStdPlnPlnNbr(char[] xrfStdPlnPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfStdPlnPlnNbr, 0, getStringValue(), beginXrfStdPlnPlnNbr, XRF_STD_PLN_PLN_NBR_LEN);
    localXrfStdPlnPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfStdPlnPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshXrfStdPlnPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfStdPlnPlnNbr() {
    return (substring(
        getStringValue(), beginXrfStdPlnPlnNbr, beginXrfStdPlnPlnNbr + XRF_STD_PLN_PLN_NBR_LEN));
  }

  int localXrfStdPlnClssNbrCounter = -1;

  public boolean isXrfStdPlnClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfStdPlnClssNbrCounter != sharedCounter;
    localXrfStdPlnClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_STD_PLN_CLSS_NBR_LEN = 4;
  /** serialize this XrfStdPlnClssNbr */
  protected void serializeXrfStdPlnClssNbr(char[] xrfStdPlnClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfStdPlnClssNbr, 0, getStringValue(), beginXrfStdPlnClssNbr, XRF_STD_PLN_CLSS_NBR_LEN);
    localXrfStdPlnClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfStdPlnClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshXrfStdPlnClssNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfStdPlnClssNbr() {
    return (substring(
        getStringValue(), beginXrfStdPlnClssNbr, beginXrfStdPlnClssNbr + XRF_STD_PLN_CLSS_NBR_LEN));
  }

  int localXrfCancRsnCdCounter = -1;

  public boolean isXrfCancRsnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfCancRsnCdCounter != sharedCounter;
    localXrfCancRsnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_CANC_RSN_CD_LEN = 1;
  /** serialize this XrfCancRsnCd */
  protected void serializeXrfCancRsnCd(char[] xrfCancRsnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfCancRsnCd, 0, getStringValue(), beginXrfCancRsnCd, XRF_CANC_RSN_CD_LEN);
    localXrfCancRsnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfCancRsnCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfCancRsnCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfCancRsnCd() {
    return (substring(
        getStringValue(), beginXrfCancRsnCd, beginXrfCancRsnCd + XRF_CANC_RSN_CD_LEN));
  }

  int localXrfTefraApplIndCounter = -1;

  public boolean isXrfTefraApplIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfTefraApplIndCounter != sharedCounter;
    localXrfTefraApplIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_TEFRA_APPL_IND_LEN = 1;
  /** serialize this XrfTefraApplInd */
  protected void serializeXrfTefraApplInd(char[] xrfTefraApplInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfTefraApplInd, 0, getStringValue(), beginXrfTefraApplInd, XRF_TEFRA_APPL_IND_LEN);
    localXrfTefraApplIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfTefraApplIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfTefraApplInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfTefraApplInd() {
    return (substring(
        getStringValue(), beginXrfTefraApplInd, beginXrfTefraApplInd + XRF_TEFRA_APPL_IND_LEN));
  }

  int localXrfEffDtCounter = -1;

  public boolean isXrfEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEffDtCounter != sharedCounter;
    localXrfEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_EFF_DT_LEN = 10;
  /** serialize this XrfEffDt */
  protected void serializeXrfEffDt(char[] xrfEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfEffDt, 0, getStringValue(), beginXrfEffDt, XRF_EFF_DT_LEN);
    localXrfEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshXrfEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfEffDt() {
    return (substring(getStringValue(), beginXrfEffDt, beginXrfEffDt + XRF_EFF_DT_LEN));
  }

  int localXrfCancDtCounter = -1;

  public boolean isXrfCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfCancDtCounter != sharedCounter;
    localXrfCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_CANC_DT_LEN = 10;
  /** serialize this XrfCancDt */
  protected void serializeXrfCancDt(char[] xrfCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfCancDt, 0, getStringValue(), beginXrfCancDt, XRF_CANC_DT_LEN);
    localXrfCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshXrfCancDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfCancDt() {
    return (substring(getStringValue(), beginXrfCancDt, beginXrfCancDt + XRF_CANC_DT_LEN));
  }

  int localXrfEbdsSet2IdCounter = -1;

  public boolean isXrfEbdsSet2IdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEbdsSet2IdCounter != sharedCounter;
    localXrfEbdsSet2IdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_EBDS_SET_2_ID_LEN = 1;
  /** serialize this XrfEbdsSet2Id */
  protected void serializeXrfEbdsSet2Id(char[] xrfEbdsSet2Id) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfEbdsSet2Id, 0, getStringValue(), beginXrfEbdsSet2Id, XRF_EBDS_SET_2_ID_LEN);
    localXrfEbdsSet2IdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEbdsSet2IdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfEbdsSet2Id is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfEbdsSet2Id() {
    return (substring(
        getStringValue(), beginXrfEbdsSet2Id, beginXrfEbdsSet2Id + XRF_EBDS_SET_2_ID_LEN));
  }

  int localXrfAcnIndCounter = -1;

  public boolean isXrfAcnIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfAcnIndCounter != sharedCounter;
    localXrfAcnIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_ACN_IND_LEN = 1;
  /** serialize this XrfAcnInd */
  protected void serializeXrfAcnInd(char[] xrfAcnInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfAcnInd, 0, getStringValue(), beginXrfAcnInd, XRF_ACN_IND_LEN);
    localXrfAcnIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfAcnIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfAcnInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfAcnInd() {
    return (substring(getStringValue(), beginXrfAcnInd, beginXrfAcnInd + XRF_ACN_IND_LEN));
  }

  int localXrfUhPremDesgCdCounter = -1;

  public boolean isXrfUhPremDesgCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfUhPremDesgCdCounter != sharedCounter;
    localXrfUhPremDesgCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_UH_PREM_DESG_CD_LEN = 1;
  /** serialize this XrfUhPremDesgCd */
  protected void serializeXrfUhPremDesgCd(char[] xrfUhPremDesgCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfUhPremDesgCd, 0, getStringValue(), beginXrfUhPremDesgCd, XRF_UH_PREM_DESG_CD_LEN);
    localXrfUhPremDesgCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfUhPremDesgCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfUhPremDesgCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfUhPremDesgCd() {
    return (substring(
        getStringValue(), beginXrfUhPremDesgCd, beginXrfUhPremDesgCd + XRF_UH_PREM_DESG_CD_LEN));
  }

  int localXrfGtdHmoCdCounter = -1;

  public boolean isXrfGtdHmoCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfGtdHmoCdCounter != sharedCounter;
    localXrfGtdHmoCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_GTD_HMO_CD_LEN = 1;
  /** serialize this XrfGtdHmoCd */
  protected void serializeXrfGtdHmoCd(char[] xrfGtdHmoCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfGtdHmoCd, 0, getStringValue(), beginXrfGtdHmoCd, XRF_GTD_HMO_CD_LEN);
    localXrfGtdHmoCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfGtdHmoCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfGtdHmoCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfGtdHmoCd() {
    return (substring(getStringValue(), beginXrfGtdHmoCd, beginXrfGtdHmoCd + XRF_GTD_HMO_CD_LEN));
  }

  int localXrfPolNmAdrIndCounter = -1;

  public boolean isXrfPolNmAdrIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPolNmAdrIndCounter != sharedCounter;
    localXrfPolNmAdrIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_POL_NM_ADR_IND_LEN = 1;
  /** serialize this XrfPolNmAdrInd */
  protected void serializeXrfPolNmAdrInd(char[] xrfPolNmAdrInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPolNmAdrInd, 0, getStringValue(), beginXrfPolNmAdrInd, XRF_POL_NM_ADR_IND_LEN);
    localXrfPolNmAdrIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPolNmAdrIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfPolNmAdrInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPolNmAdrInd() {
    return (substring(
        getStringValue(), beginXrfPolNmAdrInd, beginXrfPolNmAdrInd + XRF_POL_NM_ADR_IND_LEN));
  }

  int localXrfQcareRptSelCdCounter = -1;

  public boolean isXrfQcareRptSelCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfQcareRptSelCdCounter != sharedCounter;
    localXrfQcareRptSelCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_QCARE_RPT_SEL_CD_LEN = 1;
  /** serialize this XrfQcareRptSelCd */
  protected void serializeXrfQcareRptSelCd(char[] xrfQcareRptSelCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfQcareRptSelCd, 0, getStringValue(), beginXrfQcareRptSelCd, XRF_QCARE_RPT_SEL_CD_LEN);
    localXrfQcareRptSelCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfQcareRptSelCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfQcareRptSelCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfQcareRptSelCd() {
    return (substring(
        getStringValue(), beginXrfQcareRptSelCd, beginXrfQcareRptSelCd + XRF_QCARE_RPT_SEL_CD_LEN));
  }

  int localXrfAutoAdjdIndCounter = -1;

  public boolean isXrfAutoAdjdIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfAutoAdjdIndCounter != sharedCounter;
    localXrfAutoAdjdIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_AUTO_ADJD_IND_LEN = 1;
  /** serialize this XrfAutoAdjdInd */
  protected void serializeXrfAutoAdjdInd(char[] xrfAutoAdjdInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfAutoAdjdInd, 0, getStringValue(), beginXrfAutoAdjdInd, XRF_AUTO_ADJD_IND_LEN);
    localXrfAutoAdjdIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfAutoAdjdIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfAutoAdjdInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfAutoAdjdInd() {
    return (substring(
        getStringValue(), beginXrfAutoAdjdInd, beginXrfAutoAdjdInd + XRF_AUTO_ADJD_IND_LEN));
  }

  int localXrfRptCdIndCounter = -1;

  public boolean isXrfRptCdIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfRptCdIndCounter != sharedCounter;
    localXrfRptCdIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_RPT_CD_IND_LEN = 1;
  /** serialize this XrfRptCdInd */
  protected void serializeXrfRptCdInd(char[] xrfRptCdInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfRptCdInd, 0, getStringValue(), beginXrfRptCdInd, XRF_RPT_CD_IND_LEN);
    localXrfRptCdIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfRptCdIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfRptCdInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfRptCdInd() {
    return (substring(getStringValue(), beginXrfRptCdInd, beginXrfRptCdInd + XRF_RPT_CD_IND_LEN));
  }

  int localXrfMailCdCounter = -1;

  public boolean isXrfMailCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMailCdCounter != sharedCounter;
    localXrfMailCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_MAIL_CD_LEN = 4;
  /** serialize this XrfMailCd */
  protected void serializeXrfMailCd(char[] xrfMailCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfMailCd, 0, getStringValue(), beginXrfMailCd, XRF_MAIL_CD_LEN);
    localXrfMailCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfMailCdConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshXrfMailCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfMailCd() {
    return (substring(getStringValue(), beginXrfMailCd, beginXrfMailCd + XRF_MAIL_CD_LEN));
  }

  int localXrfPolPrtypNbrCounter = -1;

  public boolean isXrfPolPrtypNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPolPrtypNbrCounter != sharedCounter;
    localXrfPolPrtypNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_POL_PRTYP_NBR_LEN = 6;
  /** serialize this XrfPolPrtypNbr */
  protected void serializeXrfPolPrtypNbr(char[] xrfPolPrtypNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPolPrtypNbr, 0, getStringValue(), beginXrfPolPrtypNbr, XRF_POL_PRTYP_NBR_LEN);
    localXrfPolPrtypNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPolPrtypNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshXrfPolPrtypNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPolPrtypNbr() {
    return (substring(
        getStringValue(), beginXrfPolPrtypNbr, beginXrfPolPrtypNbr + XRF_POL_PRTYP_NBR_LEN));
  }

  int localXrfPlnPrtypNbrCounter = -1;

  public boolean isXrfPlnPrtypNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPlnPrtypNbrCounter != sharedCounter;
    localXrfPlnPrtypNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PLN_PRTYP_NBR_LEN = 4;
  /** serialize this XrfPlnPrtypNbr */
  protected void serializeXrfPlnPrtypNbr(char[] xrfPlnPrtypNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPlnPrtypNbr, 0, getStringValue(), beginXrfPlnPrtypNbr, XRF_PLN_PRTYP_NBR_LEN);
    localXrfPlnPrtypNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPlnPrtypNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshXrfPlnPrtypNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPlnPrtypNbr() {
    return (substring(
        getStringValue(), beginXrfPlnPrtypNbr, beginXrfPlnPrtypNbr + XRF_PLN_PRTYP_NBR_LEN));
  }

  int localXrfClssPrtypNbrCounter = -1;

  public boolean isXrfClssPrtypNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfClssPrtypNbrCounter != sharedCounter;
    localXrfClssPrtypNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_CLSS_PRTYP_NBR_LEN = 4;
  /** serialize this XrfClssPrtypNbr */
  protected void serializeXrfClssPrtypNbr(char[] xrfClssPrtypNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfClssPrtypNbr, 0, getStringValue(), beginXrfClssPrtypNbr, XRF_CLSS_PRTYP_NBR_LEN);
    localXrfClssPrtypNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfClssPrtypNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshXrfClssPrtypNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfClssPrtypNbr() {
    return (substring(
        getStringValue(), beginXrfClssPrtypNbr, beginXrfClssPrtypNbr + XRF_CLSS_PRTYP_NBR_LEN));
  }

  int localXrfSfxPrtypCdCounter = -1;

  public boolean isXrfSfxPrtypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfSfxPrtypCdCounter != sharedCounter;
    localXrfSfxPrtypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_SFX_PRTYP_CD_LEN = 2;
  /** serialize this XrfSfxPrtypCd */
  protected void serializeXrfSfxPrtypCd(char[] xrfSfxPrtypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfSfxPrtypCd, 0, getStringValue(), beginXrfSfxPrtypCd, XRF_SFX_PRTYP_CD_LEN);
    localXrfSfxPrtypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfSfxPrtypCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshXrfSfxPrtypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfSfxPrtypCd() {
    return (substring(
        getStringValue(), beginXrfSfxPrtypCd, beginXrfSfxPrtypCd + XRF_SFX_PRTYP_CD_LEN));
  }

  int localXrfFranchCdCounter = -1;

  public boolean isXrfFranchCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfFranchCdCounter != sharedCounter;
    localXrfFranchCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_FRANCH_CD_LEN = 7;
  /** serialize this XrfFranchCd */
  protected void serializeXrfFranchCd(char[] xrfFranchCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfFranchCd, 0, getStringValue(), beginXrfFranchCd, XRF_FRANCH_CD_LEN);
    localXrfFranchCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfFranchCdConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshXrfFranchCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfFranchCd() {
    return (substring(getStringValue(), beginXrfFranchCd, beginXrfFranchCd + XRF_FRANCH_CD_LEN));
  }

  int localXrfBaseCovSetNbrCounter = -1;

  public boolean isXrfBaseCovSetNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfBaseCovSetNbrCounter != sharedCounter;
    localXrfBaseCovSetNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_BASE_COV_SET_NBR_LEN = 3;
  /** serialize this XrfBaseCovSetNbr */
  protected void serializeXrfBaseCovSetNbr(char[] xrfBaseCovSetNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfBaseCovSetNbr, 0, getStringValue(), beginXrfBaseCovSetNbr, XRF_BASE_COV_SET_NBR_LEN);
    localXrfBaseCovSetNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfBaseCovSetNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshXrfBaseCovSetNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfBaseCovSetNbr() {
    return (substring(
        getStringValue(), beginXrfBaseCovSetNbr, beginXrfBaseCovSetNbr + XRF_BASE_COV_SET_NBR_LEN));
  }

  int localXrfMmlCovSetNbrCounter = -1;

  public boolean isXrfMmlCovSetNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMmlCovSetNbrCounter != sharedCounter;
    localXrfMmlCovSetNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_MML_COV_SET_NBR_LEN = 3;
  /** serialize this XrfMmlCovSetNbr */
  protected void serializeXrfMmlCovSetNbr(char[] xrfMmlCovSetNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfMmlCovSetNbr, 0, getStringValue(), beginXrfMmlCovSetNbr, XRF_MML_COV_SET_NBR_LEN);
    localXrfMmlCovSetNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfMmlCovSetNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshXrfMmlCovSetNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfMmlCovSetNbr() {
    return (substring(
        getStringValue(), beginXrfMmlCovSetNbr, beginXrfMmlCovSetNbr + XRF_MML_COV_SET_NBR_LEN));
  }

  int localXrfMedcrCovSetNbrCounter = -1;

  public boolean isXrfMedcrCovSetNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMedcrCovSetNbrCounter != sharedCounter;
    localXrfMedcrCovSetNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_MEDCR_COV_SET_NBR_LEN = 3;
  /** serialize this XrfMedcrCovSetNbr */
  protected void serializeXrfMedcrCovSetNbr(char[] xrfMedcrCovSetNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfMedcrCovSetNbr, 0, getStringValue(), beginXrfMedcrCovSetNbr, XRF_MEDCR_COV_SET_NBR_LEN);
    localXrfMedcrCovSetNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfMedcrCovSetNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshXrfMedcrCovSetNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfMedcrCovSetNbr() {
    return (substring(
        getStringValue(),
        beginXrfMedcrCovSetNbr,
        beginXrfMedcrCovSetNbr + XRF_MEDCR_COV_SET_NBR_LEN));
  }

  int localXrfEbdsSetIdCounter = -1;

  public boolean isXrfEbdsSetIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEbdsSetIdCounter != sharedCounter;
    localXrfEbdsSetIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_EBDS_SET_ID_LEN = 1;
  /** serialize this XrfEbdsSetId */
  protected void serializeXrfEbdsSetId(char[] xrfEbdsSetId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfEbdsSetId, 0, getStringValue(), beginXrfEbdsSetId, XRF_EBDS_SET_ID_LEN);
    localXrfEbdsSetIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEbdsSetIdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfEbdsSetId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfEbdsSetId() {
    return (substring(
        getStringValue(), beginXrfEbdsSetId, beginXrfEbdsSetId + XRF_EBDS_SET_ID_LEN));
  }

  int localXrfAlldAnclIndCounter = -1;

  public boolean isXrfAlldAnclIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfAlldAnclIndCounter != sharedCounter;
    localXrfAlldAnclIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_ALLD_ANCL_IND_LEN = 1;
  /** serialize this XrfAlldAnclInd */
  protected void serializeXrfAlldAnclInd(char[] xrfAlldAnclInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfAlldAnclInd, 0, getStringValue(), beginXrfAlldAnclInd, XRF_ALLD_ANCL_IND_LEN);
    localXrfAlldAnclIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfAlldAnclIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfAlldAnclInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfAlldAnclInd() {
    return (substring(
        getStringValue(), beginXrfAlldAnclInd, beginXrfAlldAnclInd + XRF_ALLD_ANCL_IND_LEN));
  }

  int localXrfPrefPhrmPrdctCdCounter = -1;

  public boolean isXrfPrefPhrmPrdctCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPrefPhrmPrdctCdCounter != sharedCounter;
    localXrfPrefPhrmPrdctCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PREF_PHRM_PRDCT_CD_LEN = 6;
  /** serialize this XrfPrefPhrmPrdctCd */
  protected void serializeXrfPrefPhrmPrdctCd(char[] xrfPrefPhrmPrdctCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfPrefPhrmPrdctCd,
        0,
        getStringValue(),
        beginXrfPrefPhrmPrdctCd,
        XRF_PREF_PHRM_PRDCT_CD_LEN);
    localXrfPrefPhrmPrdctCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPrefPhrmPrdctCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshXrfPrefPhrmPrdctCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPrefPhrmPrdctCd() {
    return (substring(
        getStringValue(),
        beginXrfPrefPhrmPrdctCd,
        beginXrfPrefPhrmPrdctCd + XRF_PREF_PHRM_PRDCT_CD_LEN));
  }

  int localXrfPrefPhrmIdcrdCdCounter = -1;

  public boolean isXrfPrefPhrmIdcrdCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPrefPhrmIdcrdCdCounter != sharedCounter;
    localXrfPrefPhrmIdcrdCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PREF_PHRM_IDCRD_CD_LEN = 1;
  /** serialize this XrfPrefPhrmIdcrdCd */
  protected void serializeXrfPrefPhrmIdcrdCd(char[] xrfPrefPhrmIdcrdCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfPrefPhrmIdcrdCd,
        0,
        getStringValue(),
        beginXrfPrefPhrmIdcrdCd,
        XRF_PREF_PHRM_IDCRD_CD_LEN);
    localXrfPrefPhrmIdcrdCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPrefPhrmIdcrdCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfPrefPhrmIdcrdCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPrefPhrmIdcrdCd() {
    return (substring(
        getStringValue(),
        beginXrfPrefPhrmIdcrdCd,
        beginXrfPrefPhrmIdcrdCd + XRF_PREF_PHRM_IDCRD_CD_LEN));
  }

  int localXrfPcsIndCounter = -1;

  public boolean isXrfPcsIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPcsIndCounter != sharedCounter;
    localXrfPcsIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PCS_IND_LEN = 1;
  /** serialize this XrfPcsInd */
  protected void serializeXrfPcsInd(char[] xrfPcsInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPcsInd, 0, getStringValue(), beginXrfPcsInd, XRF_PCS_IND_LEN);
    localXrfPcsIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPcsIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfPcsInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfPcsInd() {
    return (substring(getStringValue(), beginXrfPcsInd, beginXrfPcsInd + XRF_PCS_IND_LEN));
  }

  int localXrfCchIndCounter = -1;

  public boolean isXrfCchIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfCchIndCounter != sharedCounter;
    localXrfCchIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_CCH_IND_LEN = 1;
  /** serialize this XrfCchInd */
  protected void serializeXrfCchInd(char[] xrfCchInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfCchInd, 0, getStringValue(), beginXrfCchInd, XRF_CCH_IND_LEN);
    localXrfCchIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfCchIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfCchInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfCchInd() {
    return (substring(getStringValue(), beginXrfCchInd, beginXrfCchInd + XRF_CCH_IND_LEN));
  }

  int localXrfCapXclsIndCounter = -1;

  public boolean isXrfCapXclsIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfCapXclsIndCounter != sharedCounter;
    localXrfCapXclsIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_CAP_XCLS_IND_LEN = 1;
  /** serialize this XrfCapXclsInd */
  protected void serializeXrfCapXclsInd(char[] xrfCapXclsInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfCapXclsInd, 0, getStringValue(), beginXrfCapXclsInd, XRF_CAP_XCLS_IND_LEN);
    localXrfCapXclsIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfCapXclsIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfCapXclsInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfCapXclsInd() {
    return (substring(
        getStringValue(), beginXrfCapXclsInd, beginXrfCapXclsInd + XRF_CAP_XCLS_IND_LEN));
  }

  int localXrfApportPctCounter = -1;

  public boolean isXrfApportPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfApportPctCounter != sharedCounter;
    localXrfApportPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfApportPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfApportPct,
        XRF_APPORT_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int XRF_APPORT_PCT_LEN = 2;
  /** serializeXrfApportPct */
  protected void serializeXrfApportPct(short xrfApportPct) {
    putDecimal(beginXrfApportPct, xrfApportPct, XRF_APPORT_PCT_LEN, true);
  }

  protected short checkXrfApportPctMaxLimit(long number) {
    return (short) checkMaxLimit(number, MAX_1000 /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshXrfApportPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshXrfApportPct() throws CFException {
    try {
      return (getShortDecimal(beginXrfApportPct, XRF_APPORT_PCT_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfApportPct", beginXrfApportPct, XRF_APPORT_PCT_LEN);
    }
  }

  int localXrfPayLoc1NbrCounter = -1;

  public boolean isXrfPayLoc1NbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPayLoc1NbrCounter != sharedCounter;
    localXrfPayLoc1NbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PAY_LOC_1_NBR_LEN = 3;
  /** serialize this XrfPayLoc1Nbr */
  protected void serializeXrfPayLoc1Nbr(char[] xrfPayLoc1Nbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPayLoc1Nbr, 0, getStringValue(), beginXrfPayLoc1Nbr, XRF_PAY_LOC_1_NBR_LEN);
    localXrfPayLoc1NbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPayLoc1NbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshXrfPayLoc1Nbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPayLoc1Nbr() {
    return (substring(
        getStringValue(), beginXrfPayLoc1Nbr, beginXrfPayLoc1Nbr + XRF_PAY_LOC_1_NBR_LEN));
  }

  int localXrfPayLoc2NbrCounter = -1;

  public boolean isXrfPayLoc2NbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPayLoc2NbrCounter != sharedCounter;
    localXrfPayLoc2NbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PAY_LOC_2_NBR_LEN = 3;
  /** serialize this XrfPayLoc2Nbr */
  protected void serializeXrfPayLoc2Nbr(char[] xrfPayLoc2Nbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPayLoc2Nbr, 0, getStringValue(), beginXrfPayLoc2Nbr, XRF_PAY_LOC_2_NBR_LEN);
    localXrfPayLoc2NbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPayLoc2NbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshXrfPayLoc2Nbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPayLoc2Nbr() {
    return (substring(
        getStringValue(), beginXrfPayLoc2Nbr, beginXrfPayLoc2Nbr + XRF_PAY_LOC_2_NBR_LEN));
  }

  int localXrfMnnrpCdCounter = -1;

  public boolean isXrfMnnrpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMnnrpCdCounter != sharedCounter;
    localXrfMnnrpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_MNNRP_CD_LEN = 1;
  /** serialize this XrfMnnrpCd */
  protected void serializeXrfMnnrpCd(char[] xrfMnnrpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfMnnrpCd, 0, getStringValue(), beginXrfMnnrpCd, XRF_MNNRP_CD_LEN);
    localXrfMnnrpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfMnnrpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfMnnrpCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfMnnrpCd() {
    return (substring(getStringValue(), beginXrfMnnrpCd, beginXrfMnnrpCd + XRF_MNNRP_CD_LEN));
  }

  int localXrfMnnrpPctCounter = -1;

  public boolean isXrfMnnrpPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMnnrpPctCounter != sharedCounter;
    localXrfMnnrpPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfMnnrpPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfMnnrpPct,
        XRF_MNNRP_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int XRF_MNNRP_PCT_LEN = 2;
  /** serializeXrfMnnrpPct */
  protected void serializeXrfMnnrpPct(short xrfMnnrpPct) {
    putDecimal(beginXrfMnnrpPct, xrfMnnrpPct, XRF_MNNRP_PCT_LEN, true);
  }

  protected short checkXrfMnnrpPctMaxLimit(long number) {
    return (short) checkMaxLimit(number, MAX_1000 /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshXrfMnnrpPct is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshXrfMnnrpPct() throws CFException {
    try {
      return (getShortDecimal(beginXrfMnnrpPct, XRF_MNNRP_PCT_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfMnnrpPct", beginXrfMnnrpPct, XRF_MNNRP_PCT_LEN);
    }
  }

  int localXrfIplnTypCdCounter = -1;

  public boolean isXrfIplnTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfIplnTypCdCounter != sharedCounter;
    localXrfIplnTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_IPLN_TYP_CD_LEN = 1;
  /** serialize this XrfIplnTypCd */
  protected void serializeXrfIplnTypCd(char[] xrfIplnTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfIplnTypCd, 0, getStringValue(), beginXrfIplnTypCd, XRF_IPLN_TYP_CD_LEN);
    localXrfIplnTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfIplnTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfIplnTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfIplnTypCd() {
    return (substring(
        getStringValue(), beginXrfIplnTypCd, beginXrfIplnTypCd + XRF_IPLN_TYP_CD_LEN));
  }

  int localXrfObligIdCounter = -1;

  public boolean isXrfObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfObligIdCounter != sharedCounter;
    localXrfObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_OBLIG_ID_LEN = 2;
  /** serialize this XrfObligId */
  protected void serializeXrfObligId(char[] xrfObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfObligId, 0, getStringValue(), beginXrfObligId, XRF_OBLIG_ID_LEN);
    localXrfObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshXrfObligId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshXrfObligId() {
    return (substring(getStringValue(), beginXrfObligId, beginXrfObligId + XRF_OBLIG_ID_LEN));
  }

  int localXrfShrArngCdCounter = -1;

  public boolean isXrfShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfShrArngCdCounter != sharedCounter;
    localXrfShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_SHR_ARNG_CD_LEN = 2;
  /** serialize this XrfShrArngCd */
  protected void serializeXrfShrArngCd(char[] xrfShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfShrArngCd, 0, getStringValue(), beginXrfShrArngCd, XRF_SHR_ARNG_CD_LEN);
    localXrfShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshXrfShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfShrArngCd() {
    return (substring(
        getStringValue(), beginXrfShrArngCd, beginXrfShrArngCd + XRF_SHR_ARNG_CD_LEN));
  }

  int localXrfMedcrEstIndCounter = -1;

  public boolean isXrfMedcrEstIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMedcrEstIndCounter != sharedCounter;
    localXrfMedcrEstIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_MEDCR_EST_IND_LEN = 1;
  /** serialize this XrfMedcrEstInd */
  protected void serializeXrfMedcrEstInd(char[] xrfMedcrEstInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfMedcrEstInd, 0, getStringValue(), beginXrfMedcrEstInd, XRF_MEDCR_EST_IND_LEN);
    localXrfMedcrEstIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfMedcrEstIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfMedcrEstInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfMedcrEstInd() {
    return (substring(
        getStringValue(), beginXrfMedcrEstInd, beginXrfMedcrEstInd + XRF_MEDCR_EST_IND_LEN));
  }

  int localXrfPayEnrleeCdCounter = -1;

  public boolean isXrfPayEnrleeCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPayEnrleeCdCounter != sharedCounter;
    localXrfPayEnrleeCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PAY_ENRLEE_CD_LEN = 1;
  /** serialize this XrfPayEnrleeCd */
  protected void serializeXrfPayEnrleeCd(char[] xrfPayEnrleeCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPayEnrleeCd, 0, getStringValue(), beginXrfPayEnrleeCd, XRF_PAY_ENRLEE_CD_LEN);
    localXrfPayEnrleeCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPayEnrleeCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfPayEnrleeCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPayEnrleeCd() {
    return (substring(
        getStringValue(), beginXrfPayEnrleeCd, beginXrfPayEnrleeCd + XRF_PAY_ENRLEE_CD_LEN));
  }

  int localXrfPrdctPlnClssCdCounter = -1;

  public boolean isXrfPrdctPlnClssCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPrdctPlnClssCdCounter != sharedCounter;
    localXrfPrdctPlnClssCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PRDCT_PLN_CLSS_CD_LEN = 3;
  /** serialize this XrfPrdctPlnClssCd */
  protected void serializeXrfPrdctPlnClssCd(char[] xrfPrdctPlnClssCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfPrdctPlnClssCd, 0, getStringValue(), beginXrfPrdctPlnClssCd, XRF_PRDCT_PLN_CLSS_CD_LEN);
    localXrfPrdctPlnClssCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPrdctPlnClssCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshXrfPrdctPlnClssCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPrdctPlnClssCd() {
    return (substring(
        getStringValue(),
        beginXrfPrdctPlnClssCd,
        beginXrfPrdctPlnClssCd + XRF_PRDCT_PLN_CLSS_CD_LEN));
  }

  int localXrfFreelookIndCounter = -1;

  public boolean isXrfFreelookIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfFreelookIndCounter != sharedCounter;
    localXrfFreelookIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_FREELOOK_IND_LEN = 1;
  /** serialize this XrfFreelookInd */
  protected void serializeXrfFreelookInd(char[] xrfFreelookInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfFreelookInd, 0, getStringValue(), beginXrfFreelookInd, XRF_FREELOOK_IND_LEN);
    localXrfFreelookIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfFreelookIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfFreelookInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfFreelookInd() {
    return (substring(
        getStringValue(), beginXrfFreelookInd, beginXrfFreelookInd + XRF_FREELOOK_IND_LEN));
  }

  int localXrfEvdBasDialgIndCounter = -1;

  public boolean isXrfEvdBasDialgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEvdBasDialgIndCounter != sharedCounter;
    localXrfEvdBasDialgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_EVD_BAS_DIALG_IND_LEN = 1;
  /** serialize this XrfEvdBasDialgInd */
  protected void serializeXrfEvdBasDialgInd(char[] xrfEvdBasDialgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfEvdBasDialgInd, 0, getStringValue(), beginXrfEvdBasDialgInd, XRF_EVD_BAS_DIALG_IND_LEN);
    localXrfEvdBasDialgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEvdBasDialgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfEvdBasDialgInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfEvdBasDialgInd() {
    return (substring(
        getStringValue(),
        beginXrfEvdBasDialgInd,
        beginXrfEvdBasDialgInd + XRF_EVD_BAS_DIALG_IND_LEN));
  }

  int localXrfLmtSrvcCdCounter = -1;

  public boolean isXrfLmtSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfLmtSrvcCdCounter != sharedCounter;
    localXrfLmtSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_LMT_SRVC_CD_LEN = 1;
  /** serialize this XrfLmtSrvcCd */
  protected void serializeXrfLmtSrvcCd(char[] xrfLmtSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfLmtSrvcCd, 0, getStringValue(), beginXrfLmtSrvcCd, XRF_LMT_SRVC_CD_LEN);
    localXrfLmtSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfLmtSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfLmtSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfLmtSrvcCd() {
    return (substring(
        getStringValue(), beginXrfLmtSrvcCd, beginXrfLmtSrvcCd + XRF_LMT_SRVC_CD_LEN));
  }

  int localXrfOptoutUbhtierIndCounter = -1;

  public boolean isXrfOptoutUbhtierIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfOptoutUbhtierIndCounter != sharedCounter;
    localXrfOptoutUbhtierIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_OPTOUT_UBHTIER_IND_LEN = 1;
  /** serialize this XrfOptoutUbhtierInd */
  protected void serializeXrfOptoutUbhtierInd(char[] xrfOptoutUbhtierInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfOptoutUbhtierInd,
        0,
        getStringValue(),
        beginXrfOptoutUbhtierInd,
        XRF_OPTOUT_UBHTIER_IND_LEN);
    localXrfOptoutUbhtierIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfOptoutUbhtierIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfOptoutUbhtierInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshXrfOptoutUbhtierInd() {
    return (substring(
        getStringValue(),
        beginXrfOptoutUbhtierInd,
        beginXrfOptoutUbhtierInd + XRF_OPTOUT_UBHTIER_IND_LEN));
  }

  int localXrfHraIndAcssptAmtCounter = -1;

  public boolean isXrfHraIndAcssptAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfHraIndAcssptAmtCounter != sharedCounter;
    localXrfHraIndAcssptAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfHraIndAcssptAmtIsNumeric() {
    return decimalIsNumeric(
        beginXrfHraIndAcssptAmt,
        XRF_HRA_IND_ACSSPT_AMT_LEN); // check Packed Decimal field to see if it contains valid
                                     // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfHraIndAcssptAmtString() {
    return getPackedString(beginXrfHraIndAcssptAmt, XRF_HRA_IND_ACSSPT_AMT_LEN);
  }

  protected static final int XRF_HRA_IND_ACSSPT_AMT_LEN = 9;
  protected static final int XRF_HRA_IND_ACSSPT_AMT_SCALE = 2;
  /** serializeXrfHraIndAcssptAmt */
  protected void serializeXrfHraIndAcssptAmt(BigDecimal xrfHraIndAcssptAmt) {
    putDecimal(
        beginXrfHraIndAcssptAmt,
        xrfHraIndAcssptAmt,
        XRF_HRA_IND_ACSSPT_AMT_LEN,
        XRF_HRA_IND_ACSSPT_AMT_SCALE,
        true);
    localXrfHraIndAcssptAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfHraIndAcssptAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshXrfHraIndAcssptAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfHraIndAcssptAmt() throws CFException {
    try {
      return (getDecimal(
          beginXrfHraIndAcssptAmt, XRF_HRA_IND_ACSSPT_AMT_LEN, XRF_HRA_IND_ACSSPT_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfHraIndAcssptAmt", beginXrfHraIndAcssptAmt, XRF_HRA_IND_ACSSPT_AMT_LEN);
    }
  }

  int localXrfHraFamAcssptAmtCounter = -1;

  public boolean isXrfHraFamAcssptAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfHraFamAcssptAmtCounter != sharedCounter;
    localXrfHraFamAcssptAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfHraFamAcssptAmtIsNumeric() {
    return decimalIsNumeric(
        beginXrfHraFamAcssptAmt,
        XRF_HRA_FAM_ACSSPT_AMT_LEN); // check Packed Decimal field to see if it contains valid
                                     // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfHraFamAcssptAmtString() {
    return getPackedString(beginXrfHraFamAcssptAmt, XRF_HRA_FAM_ACSSPT_AMT_LEN);
  }

  protected static final int XRF_HRA_FAM_ACSSPT_AMT_LEN = 9;
  protected static final int XRF_HRA_FAM_ACSSPT_AMT_SCALE = 2;
  /** serializeXrfHraFamAcssptAmt */
  protected void serializeXrfHraFamAcssptAmt(BigDecimal xrfHraFamAcssptAmt) {
    putDecimal(
        beginXrfHraFamAcssptAmt,
        xrfHraFamAcssptAmt,
        XRF_HRA_FAM_ACSSPT_AMT_LEN,
        XRF_HRA_FAM_ACSSPT_AMT_SCALE,
        true);
    localXrfHraFamAcssptAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfHraFamAcssptAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshXrfHraFamAcssptAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfHraFamAcssptAmt() throws CFException {
    try {
      return (getDecimal(
          beginXrfHraFamAcssptAmt, XRF_HRA_FAM_ACSSPT_AMT_LEN, XRF_HRA_FAM_ACSSPT_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfHraFamAcssptAmt", beginXrfHraFamAcssptAmt, XRF_HRA_FAM_ACSSPT_AMT_LEN);
    }
  }

  int localXrfDfltSrvcRcChrgCounter = -1;

  public boolean isXrfDfltSrvcRcChrgModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfDfltSrvcRcChrgCounter != sharedCounter;
    localXrfDfltSrvcRcChrgCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfDfltSrvcRcChrgIsNumeric() {
    return decimalIsNumeric(
        beginXrfDfltSrvcRcChrg,
        XRF_DFLT_SRVC_RC_CHRG_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int XRF_DFLT_SRVC_RC_CHRG_LEN = 2;
  /** serializeXrfDfltSrvcRcChrg */
  protected void serializeXrfDfltSrvcRcChrg(short xrfDfltSrvcRcChrg) {
    putDecimal(beginXrfDfltSrvcRcChrg, xrfDfltSrvcRcChrg, XRF_DFLT_SRVC_RC_CHRG_LEN, true);
  }

  protected short checkXrfDfltSrvcRcChrgMaxLimit(long number) {
    return (short) checkMaxLimit(number, MAX_100 /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshXrfDfltSrvcRcChrg is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshXrfDfltSrvcRcChrg() throws CFException {
    try {
      return (getShortDecimal(beginXrfDfltSrvcRcChrg, XRF_DFLT_SRVC_RC_CHRG_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfDfltSrvcRcChrg", beginXrfDfltSrvcRcChrg, XRF_DFLT_SRVC_RC_CHRG_LEN);
    }
  }

  int localXrfJqCdReimPctCounter = -1;

  public boolean isXrfJqCdReimPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfJqCdReimPctCounter != sharedCounter;
    localXrfJqCdReimPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfJqCdReimPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfJqCdReimPct,
        XRF_JQ_CD_REIM_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }

  protected static final int XRF_JQ_CD_REIM_PCT_LEN = 2;
  /** serializeXrfJqCdReimPct */
  protected void serializeXrfJqCdReimPct(short xrfJqCdReimPct) {
    putDecimal(beginXrfJqCdReimPct, xrfJqCdReimPct, XRF_JQ_CD_REIM_PCT_LEN, true);
  }

  protected short checkXrfJqCdReimPctMaxLimit(long number) {
    return (short) checkMaxLimit(number, MAX_1000 /*limit*/, true /*isSigned*/);
  }

  /**
   * refreshXrfJqCdReimPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshXrfJqCdReimPct() throws CFException {
    try {
      return (getShortDecimal(beginXrfJqCdReimPct, XRF_JQ_CD_REIM_PCT_LEN));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfJqCdReimPct", beginXrfJqCdReimPct, XRF_JQ_CD_REIM_PCT_LEN);
    }
  }

  int localXrfAppealLangIndCounter = -1;

  public boolean isXrfAppealLangIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfAppealLangIndCounter != sharedCounter;
    localXrfAppealLangIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_APPEAL_LANG_IND_LEN = 1;
  /** serialize this XrfAppealLangInd */
  protected void serializeXrfAppealLangInd(char[] xrfAppealLangInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfAppealLangInd, 0, getStringValue(), beginXrfAppealLangInd, XRF_APPEAL_LANG_IND_LEN);
    localXrfAppealLangIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfAppealLangIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfAppealLangInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfAppealLangInd() {
    return (substring(
        getStringValue(), beginXrfAppealLangInd, beginXrfAppealLangInd + XRF_APPEAL_LANG_IND_LEN));
  }

  int localXrfReimPolEdtIndCounter = -1;

  public boolean isXrfReimPolEdtIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfReimPolEdtIndCounter != sharedCounter;
    localXrfReimPolEdtIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_REIM_POL_EDT_IND_LEN = 1;
  /** serialize this XrfReimPolEdtInd */
  protected void serializeXrfReimPolEdtInd(char[] xrfReimPolEdtInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfReimPolEdtInd, 0, getStringValue(), beginXrfReimPolEdtInd, XRF_REIM_POL_EDT_IND_LEN);
    localXrfReimPolEdtIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfReimPolEdtIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfReimPolEdtInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfReimPolEdtInd() {
    return (substring(
        getStringValue(), beginXrfReimPolEdtInd, beginXrfReimPolEdtInd + XRF_REIM_POL_EDT_IND_LEN));
  }

  int localXrfPlnDedPrortIndCounter = -1;

  public boolean isXrfPlnDedPrortIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPlnDedPrortIndCounter != sharedCounter;
    localXrfPlnDedPrortIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PLN_DED_PRORT_IND_LEN = 1;
  /** serialize this XrfPlnDedPrortInd */
  protected void serializeXrfPlnDedPrortInd(char[] xrfPlnDedPrortInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfPlnDedPrortInd, 0, getStringValue(), beginXrfPlnDedPrortInd, XRF_PLN_DED_PRORT_IND_LEN);
    localXrfPlnDedPrortIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPlnDedPrortIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfPlnDedPrortInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPlnDedPrortInd() {
    return (substring(
        getStringValue(),
        beginXrfPlnDedPrortInd,
        beginXrfPlnDedPrortInd + XRF_PLN_DED_PRORT_IND_LEN));
  }

  int localXrfNbSprsIndCounter = -1;

  public boolean isXrfNbSprsIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfNbSprsIndCounter != sharedCounter;
    localXrfNbSprsIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_NB_SPRS_IND_LEN = 1;
  /** serialize this XrfNbSprsInd */
  protected void serializeXrfNbSprsInd(char[] xrfNbSprsInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfNbSprsInd, 0, getStringValue(), beginXrfNbSprsInd, XRF_NB_SPRS_IND_LEN);
    localXrfNbSprsIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfNbSprsIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfNbSprsInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfNbSprsInd() {
    return (substring(
        getStringValue(), beginXrfNbSprsInd, beginXrfNbSprsInd + XRF_NB_SPRS_IND_LEN));
  }

  int localXrfPrortEvntCounter = -1;

  public boolean isXrfPrortEvntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfPrortEvntCounter != sharedCounter;
    localXrfPrortEvntCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_PRORT_EVNT_LEN = 1;
  /** serialize this XrfPrortEvnt */
  protected void serializeXrfPrortEvnt(char[] xrfPrortEvnt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfPrortEvnt, 0, getStringValue(), beginXrfPrortEvnt, XRF_PRORT_EVNT_LEN);
    localXrfPrortEvntCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfPrortEvntConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfPrortEvnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfPrortEvnt() {
    return (substring(getStringValue(), beginXrfPrortEvnt, beginXrfPrortEvnt + XRF_PRORT_EVNT_LEN));
  }

  int localXrfCoreMedPrrAuthCdCounter = -1;

  public boolean isXrfCoreMedPrrAuthCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfCoreMedPrrAuthCdCounter != sharedCounter;
    localXrfCoreMedPrrAuthCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_CORE_MED_PRR_AUTH_CD_LEN = 1;
  /** serialize this XrfCoreMedPrrAuthCd */
  protected void serializeXrfCoreMedPrrAuthCd(char[] xrfCoreMedPrrAuthCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfCoreMedPrrAuthCd,
        0,
        getStringValue(),
        beginXrfCoreMedPrrAuthCd,
        XRF_CORE_MED_PRR_AUTH_CD_LEN);
    localXrfCoreMedPrrAuthCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfCoreMedPrrAuthCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfCoreMedPrrAuthCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshXrfCoreMedPrrAuthCd() {
    return (substring(
        getStringValue(),
        beginXrfCoreMedPrrAuthCd,
        beginXrfCoreMedPrrAuthCd + XRF_CORE_MED_PRR_AUTH_CD_LEN));
  }

  int localXrfEnrpErIndCounter = -1;

  public boolean isXrfEnrpErIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEnrpErIndCounter != sharedCounter;
    localXrfEnrpErIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_ENRP_ER_IND_LEN = 1;
  /** serialize this XrfEnrpErInd */
  protected void serializeXrfEnrpErInd(char[] xrfEnrpErInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfEnrpErInd, 0, getStringValue(), beginXrfEnrpErInd, XRF_ENRP_ER_IND_LEN);
    localXrfEnrpErIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEnrpErIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfEnrpErInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfEnrpErInd() {
    return (substring(
        getStringValue(), beginXrfEnrpErInd, beginXrfEnrpErInd + XRF_ENRP_ER_IND_LEN));
  }

  int localXrfEnrpNonErIndCounter = -1;

  public boolean isXrfEnrpNonErIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEnrpNonErIndCounter != sharedCounter;
    localXrfEnrpNonErIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_ENRP_NON_ER_IND_LEN = 1;
  /** serialize this XrfEnrpNonErInd */
  protected void serializeXrfEnrpNonErInd(char[] xrfEnrpNonErInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfEnrpNonErInd, 0, getStringValue(), beginXrfEnrpNonErInd, XRF_ENRP_NON_ER_IND_LEN);
    localXrfEnrpNonErIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEnrpNonErIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfEnrpNonErInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfEnrpNonErInd() {
    return (substring(
        getStringValue(), beginXrfEnrpNonErInd, beginXrfEnrpNonErInd + XRF_ENRP_NON_ER_IND_LEN));
  }

  int localXrfEnrpNonErPctCounter = -1;

  public boolean isXrfEnrpNonErPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEnrpNonErPctCounter != sharedCounter;
    localXrfEnrpNonErPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfEnrpNonErPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfEnrpNonErPct,
        XRF_ENRP_NON_ER_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfEnrpNonErPctString() {
    return getPackedString(beginXrfEnrpNonErPct, XRF_ENRP_NON_ER_PCT_LEN);
  }

  protected static final int XRF_ENRP_NON_ER_PCT_LEN = 3;
  protected static final int XRF_ENRP_NON_ER_PCT_SCALE = 2;
  /** serializeXrfEnrpNonErPct */
  protected void serializeXrfEnrpNonErPct(BigDecimal xrfEnrpNonErPct) {
    putDecimal(
        beginXrfEnrpNonErPct,
        xrfEnrpNonErPct,
        XRF_ENRP_NON_ER_PCT_LEN,
        XRF_ENRP_NON_ER_PCT_SCALE,
        true);
    localXrfEnrpNonErPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfEnrpNonErPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshXrfEnrpNonErPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfEnrpNonErPct() throws CFException {
    try {
      return (getDecimal(beginXrfEnrpNonErPct, XRF_ENRP_NON_ER_PCT_LEN, XRF_ENRP_NON_ER_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfEnrpNonErPct", beginXrfEnrpNonErPct, XRF_ENRP_NON_ER_PCT_LEN);
    }
  }

  int localXrfHcrEhbIndCounter = -1;

  public boolean isXrfHcrEhbIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfHcrEhbIndCounter != sharedCounter;
    localXrfHcrEhbIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_HCR_EHB_IND_LEN = 1;
  /** serialize this XrfHcrEhbInd */
  protected void serializeXrfHcrEhbInd(char[] xrfHcrEhbInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfHcrEhbInd, 0, getStringValue(), beginXrfHcrEhbInd, XRF_HCR_EHB_IND_LEN);
    localXrfHcrEhbIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfHcrEhbIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfHcrEhbInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfHcrEhbInd() {
    return (substring(
        getStringValue(), beginXrfHcrEhbInd, beginXrfHcrEhbInd + XRF_HCR_EHB_IND_LEN));
  }

  int localXrfEnrpEmrgFaclIndCounter = -1;

  public boolean isXrfEnrpEmrgFaclIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEnrpEmrgFaclIndCounter != sharedCounter;
    localXrfEnrpEmrgFaclIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_ENRP_EMRG_FACL_IND_LEN = 1;
  /** serialize this XrfEnrpEmrgFaclInd */
  protected void serializeXrfEnrpEmrgFaclInd(char[] xrfEnrpEmrgFaclInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfEnrpEmrgFaclInd,
        0,
        getStringValue(),
        beginXrfEnrpEmrgFaclInd,
        XRF_ENRP_EMRG_FACL_IND_LEN);
    localXrfEnrpEmrgFaclIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEnrpEmrgFaclIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfEnrpEmrgFaclInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfEnrpEmrgFaclInd() {
    return (substring(
        getStringValue(),
        beginXrfEnrpEmrgFaclInd,
        beginXrfEnrpEmrgFaclInd + XRF_ENRP_EMRG_FACL_IND_LEN));
  }

  int localXrfEmergentWrpIndCounter = -1;

  public boolean isXrfEmergentWrpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEmergentWrpIndCounter != sharedCounter;
    localXrfEmergentWrpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_EMERGENT_WRP_IND_LEN = 1;
  /** serialize this XrfEmergentWrpInd */
  protected void serializeXrfEmergentWrpInd(char[] xrfEmergentWrpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfEmergentWrpInd, 0, getStringValue(), beginXrfEmergentWrpInd, XRF_EMERGENT_WRP_IND_LEN);
    localXrfEmergentWrpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfEmergentWrpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfEmergentWrpInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfEmergentWrpInd() {
    return (substring(
        getStringValue(),
        beginXrfEmergentWrpInd,
        beginXrfEmergentWrpInd + XRF_EMERGENT_WRP_IND_LEN));
  }

  int localXrfMnnrpLabPctCounter = -1;

  public boolean isXrfMnnrpLabPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMnnrpLabPctCounter != sharedCounter;
    localXrfMnnrpLabPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfMnnrpLabPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfMnnrpLabPct,
        XRF_MNNRP_LAB_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfMnnrpLabPctString() {
    return getPackedString(beginXrfMnnrpLabPct, XRF_MNNRP_LAB_PCT_LEN);
  }

  protected static final int XRF_MNNRP_LAB_PCT_LEN = 3;
  protected static final int XRF_MNNRP_LAB_PCT_SCALE = 2;
  /** serializeXrfMnnrpLabPct */
  protected void serializeXrfMnnrpLabPct(BigDecimal xrfMnnrpLabPct) {
    putDecimal(
        beginXrfMnnrpLabPct, xrfMnnrpLabPct, XRF_MNNRP_LAB_PCT_LEN, XRF_MNNRP_LAB_PCT_SCALE, true);
    localXrfMnnrpLabPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfMnnrpLabPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshXrfMnnrpLabPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfMnnrpLabPct() throws CFException {
    try {
      return (getDecimal(beginXrfMnnrpLabPct, XRF_MNNRP_LAB_PCT_LEN, XRF_MNNRP_LAB_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfMnnrpLabPct", beginXrfMnnrpLabPct, XRF_MNNRP_LAB_PCT_LEN);
    }
  }

  int localXrfMnnrpDmePctCounter = -1;

  public boolean isXrfMnnrpDmePctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMnnrpDmePctCounter != sharedCounter;
    localXrfMnnrpDmePctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfMnnrpDmePctIsNumeric() {
    return decimalIsNumeric(
        beginXrfMnnrpDmePct,
        XRF_MNNRP_DME_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfMnnrpDmePctString() {
    return getPackedString(beginXrfMnnrpDmePct, XRF_MNNRP_DME_PCT_LEN);
  }

  protected static final int XRF_MNNRP_DME_PCT_LEN = 3;
  protected static final int XRF_MNNRP_DME_PCT_SCALE = 2;
  /** serializeXrfMnnrpDmePct */
  protected void serializeXrfMnnrpDmePct(BigDecimal xrfMnnrpDmePct) {
    putDecimal(
        beginXrfMnnrpDmePct, xrfMnnrpDmePct, XRF_MNNRP_DME_PCT_LEN, XRF_MNNRP_DME_PCT_SCALE, true);
    localXrfMnnrpDmePctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfMnnrpDmePctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshXrfMnnrpDmePct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfMnnrpDmePct() throws CFException {
    try {
      return (getDecimal(beginXrfMnnrpDmePct, XRF_MNNRP_DME_PCT_LEN, XRF_MNNRP_DME_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfMnnrpDmePct", beginXrfMnnrpDmePct, XRF_MNNRP_DME_PCT_LEN);
    }
  }

  int localXrfBusSegPltfmCounter = -1;

  public boolean isXrfBusSegPltfmModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfBusSegPltfmCounter != sharedCounter;
    localXrfBusSegPltfmCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_BUS_SEG_PLTFM_LEN = 3;
  /** serialize this XrfBusSegPltfm */
  protected void serializeXrfBusSegPltfm(char[] xrfBusSegPltfm) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfBusSegPltfm, 0, getStringValue(), beginXrfBusSegPltfm, XRF_BUS_SEG_PLTFM_LEN);
    localXrfBusSegPltfmCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfBusSegPltfmConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshXrfBusSegPltfm is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfBusSegPltfm() {
    return (substring(
        getStringValue(), beginXrfBusSegPltfm, beginXrfBusSegPltfm + XRF_BUS_SEG_PLTFM_LEN));
  }

  int localXrfLglEntyCdCounter = -1;

  public boolean isXrfLglEntyCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfLglEntyCdCounter != sharedCounter;
    localXrfLglEntyCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_LGL_ENTY_CD_LEN = 5;
  /** serialize this XrfLglEntyCd */
  protected void serializeXrfLglEntyCd(char[] xrfLglEntyCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(xrfLglEntyCd, 0, getStringValue(), beginXrfLglEntyCd, XRF_LGL_ENTY_CD_LEN);
    localXrfLglEntyCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfLglEntyCdConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshXrfLglEntyCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfLglEntyCd() {
    return (substring(
        getStringValue(), beginXrfLglEntyCd, beginXrfLglEntyCd + XRF_LGL_ENTY_CD_LEN));
  }

  int localXrfEnrpDfltPctCounter = -1;

  public boolean isXrfEnrpDfltPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfEnrpDfltPctCounter != sharedCounter;
    localXrfEnrpDfltPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfEnrpDfltPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfEnrpDfltPct,
        XRF_ENRP_DFLT_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfEnrpDfltPctString() {
    return getPackedString(beginXrfEnrpDfltPct, XRF_ENRP_DFLT_PCT_LEN);
  }

  protected static final int XRF_ENRP_DFLT_PCT_LEN = 3;
  protected static final int XRF_ENRP_DFLT_PCT_SCALE = 2;
  /** serializeXrfEnrpDfltPct */
  protected void serializeXrfEnrpDfltPct(BigDecimal xrfEnrpDfltPct) {
    putDecimal(
        beginXrfEnrpDfltPct, xrfEnrpDfltPct, XRF_ENRP_DFLT_PCT_LEN, XRF_ENRP_DFLT_PCT_SCALE, true);
    localXrfEnrpDfltPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfEnrpDfltPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshXrfEnrpDfltPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfEnrpDfltPct() throws CFException {
    try {
      return (getDecimal(beginXrfEnrpDfltPct, XRF_ENRP_DFLT_PCT_LEN, XRF_ENRP_DFLT_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfEnrpDfltPct", beginXrfEnrpDfltPct, XRF_ENRP_DFLT_PCT_LEN);
    }
  }

  int localXrfMnrpDfltPctCounter = -1;

  public boolean isXrfMnrpDfltPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMnrpDfltPctCounter != sharedCounter;
    localXrfMnrpDfltPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfMnrpDfltPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfMnrpDfltPct,
        XRF_MNRP_DFLT_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfMnrpDfltPctString() {
    return getPackedString(beginXrfMnrpDfltPct, XRF_MNRP_DFLT_PCT_LEN);
  }

  protected static final int XRF_MNRP_DFLT_PCT_LEN = 3;
  protected static final int XRF_MNRP_DFLT_PCT_SCALE = 2;
  /** serializeXrfMnrpDfltPct */
  protected void serializeXrfMnrpDfltPct(BigDecimal xrfMnrpDfltPct) {
    putDecimal(
        beginXrfMnrpDfltPct, xrfMnrpDfltPct, XRF_MNRP_DFLT_PCT_LEN, XRF_MNRP_DFLT_PCT_SCALE, true);
    localXrfMnrpDfltPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfMnrpDfltPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshXrfMnrpDfltPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfMnrpDfltPct() throws CFException {
    try {
      return (getDecimal(beginXrfMnrpDfltPct, XRF_MNRP_DFLT_PCT_LEN, XRF_MNRP_DFLT_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfMnrpDfltPct", beginXrfMnrpDfltPct, XRF_MNRP_DFLT_PCT_LEN);
    }
  }

  int localXrfMnrpPtPctCounter = -1;

  public boolean isXrfMnrpPtPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfMnrpPtPctCounter != sharedCounter;
    localXrfMnrpPtPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean xrfMnrpPtPctIsNumeric() {
    return decimalIsNumeric(
        beginXrfMnrpPtPct,
        XRF_MNRP_PT_PCT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] xrfMnrpPtPctString() {
    return getPackedString(beginXrfMnrpPtPct, XRF_MNRP_PT_PCT_LEN);
  }

  protected static final int XRF_MNRP_PT_PCT_LEN = 3;
  protected static final int XRF_MNRP_PT_PCT_SCALE = 2;
  /** serializeXrfMnrpPtPct */
  protected void serializeXrfMnrpPtPct(BigDecimal xrfMnrpPtPct) {
    putDecimal(beginXrfMnrpPtPct, xrfMnrpPtPct, XRF_MNRP_PT_PCT_LEN, XRF_MNRP_PT_PCT_SCALE, true);
    localXrfMnrpPtPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkXrfMnrpPtPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 5 /*precision*/);
  }
  /**
   * refreshXrfMnrpPtPct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshXrfMnrpPtPct() throws CFException {
    try {
      return (getDecimal(beginXrfMnrpPtPct, XRF_MNRP_PT_PCT_LEN, XRF_MNRP_PT_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("xrfMnrpPtPct", beginXrfMnrpPtPct, XRF_MNRP_PT_PCT_LEN);
    }
  }

  int localXrfSurprsMedBilCdCounter = -1;

  public boolean isXrfSurprsMedBilCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localXrfSurprsMedBilCdCounter != sharedCounter;
    localXrfSurprsMedBilCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int XRF_SURPRS_MED_BIL_CD_LEN = 1;
  /** serialize this XrfSurprsMedBilCd */
  protected void serializeXrfSurprsMedBilCd(char[] xrfSurprsMedBilCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        xrfSurprsMedBilCd, 0, getStringValue(), beginXrfSurprsMedBilCd, XRF_SURPRS_MED_BIL_CD_LEN);
    localXrfSurprsMedBilCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkXrfSurprsMedBilCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshXrfSurprsMedBilCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshXrfSurprsMedBilCd() {
    return (substring(
        getStringValue(),
        beginXrfSurprsMedBilCd,
        beginXrfSurprsMedBilCd + XRF_SURPRS_MED_BIL_CD_LEN));
  }
}
