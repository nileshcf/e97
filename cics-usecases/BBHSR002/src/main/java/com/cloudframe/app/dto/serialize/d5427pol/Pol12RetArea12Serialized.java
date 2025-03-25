package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol12RetArea12Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol12RetArea12Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol12RetArea12Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_12_RET_AREA_12_LENGTH = 40;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol12StdPolNbr;
  protected int beginPol12StdPlnNbr;
  protected int beginPol12RetEvdBasDialgInd;
  protected int beginPol12RetNtfyCrdcEpInd;
  protected int beginPol12RetOncPolPrtcpCd;
  protected int beginPol12RetSiteSrvcPrtcpCd;
  protected int beginPol12RetContrStCd;
  protected int beginPol12RetFundTypCd;
  protected int beginPol12RetSiteCareProcCd;
  protected int beginPol12RetGenTstPolPrtcpCd;
  protected int beginPol12RetSpclRxInd;
  protected int beginPol12RetErisaInd;
  protected int beginPol12RetFiller;

  /** Constructor for Pol12RetArea12Serialized */
  public Pol12RetArea12Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol12RetArea12Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol12RetArea12Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol12RetArea12Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol12RetArea12Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol12RetArea12Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_12_RET_AREA_12_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol12StdPolNbr = getStartOffset() + 0; // set offset for serialization

    beginPol12StdPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginPol12RetEvdBasDialgInd = getStartOffset() + 10; // set offset for serialization

    beginPol12RetNtfyCrdcEpInd = getStartOffset() + 11; // set offset for serialization

    beginPol12RetOncPolPrtcpCd = getStartOffset() + 12; // set offset for serialization

    beginPol12RetSiteSrvcPrtcpCd = getStartOffset() + 13; // set offset for serialization

    beginPol12RetContrStCd = getStartOffset() + 14; // set offset for serialization

    beginPol12RetFundTypCd = getStartOffset() + 16; // set offset for serialization

    beginPol12RetSiteCareProcCd = getStartOffset() + 17; // set offset for serialization

    beginPol12RetGenTstPolPrtcpCd = getStartOffset() + 18; // set offset for serialization

    beginPol12RetSpclRxInd = getStartOffset() + 19; // set offset for serialization

    beginPol12RetErisaInd = getStartOffset() + 20; // set offset for serialization

    beginPol12RetFiller = getStartOffset() + 21; // set offset for serialization

    /*  end of offset */
  }

  int localPol12StdPolNbrCounter = -1;

  public boolean isPol12StdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12StdPolNbrCounter != sharedCounter;
    localPol12StdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_STD_POL_NBR_LEN = 6;
  /** serialize this Pol12StdPolNbr */
  protected void serializePol12StdPolNbr(char[] pol12StdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol12StdPolNbr, 0, getStringValue(), beginPol12StdPolNbr, POL_12_STD_POL_NBR_LEN);
    localPol12StdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12StdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol12StdPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol12StdPolNbr() {
    return (substring(
        getStringValue(), beginPol12StdPolNbr, beginPol12StdPolNbr + POL_12_STD_POL_NBR_LEN));
  }

  int localPol12StdPlnNbrCounter = -1;

  public boolean isPol12StdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12StdPlnNbrCounter != sharedCounter;
    localPol12StdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol12StdPlnNbr
   *
   * @return pol12StdPlnNbr
   */
  public char[] getPol12StdPlnNbrString() {
    return getCharArray(beginPol12StdPlnNbr, POL_12_STD_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol12StdPlnNbrIsNumeric() {
    return isNumeric(
        beginPol12StdPlnNbr,
        beginPol12StdPlnNbr + POL_12_STD_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_12_STD_PLN_NBR_LEN = 4;
  /** serializePol12StdPlnNbr */
  protected void serializePol12StdPlnNbr(int pol12StdPlnNbr) {
    putNumber(
        beginPol12StdPlnNbr,
        pol12StdPlnNbr,
        POL_12_STD_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol12StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol12StdPlnNbr */
  protected int serializePol12StdPlnNbr(char[] value) {
    int pol12StdPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol12StdPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol12StdPlnNbr, 4);
    localPol12StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol12StdPlnNbr;
  }

  protected int checkPol12StdPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol12StdPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol12StdPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol12StdPlnNbr,
          POL_12_STD_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol12StdPlnNbr", beginPol12StdPlnNbr, POL_12_STD_PLN_NBR_LEN);
    }
  }

  int localPol12RetEvdBasDialgIndCounter = -1;

  public boolean isPol12RetEvdBasDialgIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetEvdBasDialgIndCounter != sharedCounter;
    localPol12RetEvdBasDialgIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_EVD_BAS_DIALG_IND_LEN = 1;
  /** serialize this Pol12RetEvdBasDialgInd */
  protected void serializePol12RetEvdBasDialgInd(char[] pol12RetEvdBasDialgInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetEvdBasDialgInd,
        0,
        getStringValue(),
        beginPol12RetEvdBasDialgInd,
        POL_12_RET_EVD_BAS_DIALG_IND_LEN);
    localPol12RetEvdBasDialgIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetEvdBasDialgIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetEvdBasDialgInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetEvdBasDialgInd() {
    return (substring(
        getStringValue(),
        beginPol12RetEvdBasDialgInd,
        beginPol12RetEvdBasDialgInd + POL_12_RET_EVD_BAS_DIALG_IND_LEN));
  }

  int localPol12RetNtfyCrdcEpIndCounter = -1;

  public boolean isPol12RetNtfyCrdcEpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetNtfyCrdcEpIndCounter != sharedCounter;
    localPol12RetNtfyCrdcEpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_NTFY_CRDC_EP_IND_LEN = 1;
  /** serialize this Pol12RetNtfyCrdcEpInd */
  protected void serializePol12RetNtfyCrdcEpInd(char[] pol12RetNtfyCrdcEpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetNtfyCrdcEpInd,
        0,
        getStringValue(),
        beginPol12RetNtfyCrdcEpInd,
        POL_12_RET_NTFY_CRDC_EP_IND_LEN);
    localPol12RetNtfyCrdcEpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetNtfyCrdcEpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetNtfyCrdcEpInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetNtfyCrdcEpInd() {
    return (substring(
        getStringValue(),
        beginPol12RetNtfyCrdcEpInd,
        beginPol12RetNtfyCrdcEpInd + POL_12_RET_NTFY_CRDC_EP_IND_LEN));
  }

  int localPol12RetOncPolPrtcpCdCounter = -1;

  public boolean isPol12RetOncPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetOncPolPrtcpCdCounter != sharedCounter;
    localPol12RetOncPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_ONC_POL_PRTCP_CD_LEN = 1;
  /** serialize this Pol12RetOncPolPrtcpCd */
  protected void serializePol12RetOncPolPrtcpCd(char[] pol12RetOncPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetOncPolPrtcpCd,
        0,
        getStringValue(),
        beginPol12RetOncPolPrtcpCd,
        POL_12_RET_ONC_POL_PRTCP_CD_LEN);
    localPol12RetOncPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetOncPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetOncPolPrtcpCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetOncPolPrtcpCd() {
    return (substring(
        getStringValue(),
        beginPol12RetOncPolPrtcpCd,
        beginPol12RetOncPolPrtcpCd + POL_12_RET_ONC_POL_PRTCP_CD_LEN));
  }

  int localPol12RetSiteSrvcPrtcpCdCounter = -1;

  public boolean isPol12RetSiteSrvcPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetSiteSrvcPrtcpCdCounter != sharedCounter;
    localPol12RetSiteSrvcPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_SITE_SRVC_PRTCP_CD_LEN = 1;
  /** serialize this Pol12RetSiteSrvcPrtcpCd */
  protected void serializePol12RetSiteSrvcPrtcpCd(char[] pol12RetSiteSrvcPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetSiteSrvcPrtcpCd,
        0,
        getStringValue(),
        beginPol12RetSiteSrvcPrtcpCd,
        POL_12_RET_SITE_SRVC_PRTCP_CD_LEN);
    localPol12RetSiteSrvcPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetSiteSrvcPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetSiteSrvcPrtcpCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetSiteSrvcPrtcpCd() {
    return (substring(
        getStringValue(),
        beginPol12RetSiteSrvcPrtcpCd,
        beginPol12RetSiteSrvcPrtcpCd + POL_12_RET_SITE_SRVC_PRTCP_CD_LEN));
  }

  int localPol12RetContrStCdCounter = -1;

  public boolean isPol12RetContrStCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetContrStCdCounter != sharedCounter;
    localPol12RetContrStCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_CONTR_ST_CD_LEN = 2;
  /** serialize this Pol12RetContrStCd */
  protected void serializePol12RetContrStCd(char[] pol12RetContrStCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetContrStCd, 0, getStringValue(), beginPol12RetContrStCd, POL_12_RET_CONTR_ST_CD_LEN);
    localPol12RetContrStCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetContrStCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol12RetContrStCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetContrStCd() {
    return (substring(
        getStringValue(),
        beginPol12RetContrStCd,
        beginPol12RetContrStCd + POL_12_RET_CONTR_ST_CD_LEN));
  }

  int localPol12RetFundTypCdCounter = -1;

  public boolean isPol12RetFundTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetFundTypCdCounter != sharedCounter;
    localPol12RetFundTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_FUND_TYP_CD_LEN = 1;
  /** serialize this Pol12RetFundTypCd */
  protected void serializePol12RetFundTypCd(char[] pol12RetFundTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetFundTypCd, 0, getStringValue(), beginPol12RetFundTypCd, POL_12_RET_FUND_TYP_CD_LEN);
    localPol12RetFundTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetFundTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetFundTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetFundTypCd() {
    return (substring(
        getStringValue(),
        beginPol12RetFundTypCd,
        beginPol12RetFundTypCd + POL_12_RET_FUND_TYP_CD_LEN));
  }

  int localPol12RetSiteCareProcCdCounter = -1;

  public boolean isPol12RetSiteCareProcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetSiteCareProcCdCounter != sharedCounter;
    localPol12RetSiteCareProcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_SITE_CARE_PROC_CD_LEN = 1;
  /** serialize this Pol12RetSiteCareProcCd */
  protected void serializePol12RetSiteCareProcCd(char[] pol12RetSiteCareProcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetSiteCareProcCd,
        0,
        getStringValue(),
        beginPol12RetSiteCareProcCd,
        POL_12_RET_SITE_CARE_PROC_CD_LEN);
    localPol12RetSiteCareProcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetSiteCareProcCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetSiteCareProcCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetSiteCareProcCd() {
    return (substring(
        getStringValue(),
        beginPol12RetSiteCareProcCd,
        beginPol12RetSiteCareProcCd + POL_12_RET_SITE_CARE_PROC_CD_LEN));
  }

  int localPol12RetGenTstPolPrtcpCdCounter = -1;

  public boolean isPol12RetGenTstPolPrtcpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetGenTstPolPrtcpCdCounter != sharedCounter;
    localPol12RetGenTstPolPrtcpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_GEN_TST_POL_PRTCP_CD_LEN = 1;
  /** serialize this Pol12RetGenTstPolPrtcpCd */
  protected void serializePol12RetGenTstPolPrtcpCd(char[] pol12RetGenTstPolPrtcpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetGenTstPolPrtcpCd,
        0,
        getStringValue(),
        beginPol12RetGenTstPolPrtcpCd,
        POL_12_RET_GEN_TST_POL_PRTCP_CD_LEN);
    localPol12RetGenTstPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetGenTstPolPrtcpCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetGenTstPolPrtcpCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetGenTstPolPrtcpCd() {
    return (substring(
        getStringValue(),
        beginPol12RetGenTstPolPrtcpCd,
        beginPol12RetGenTstPolPrtcpCd + POL_12_RET_GEN_TST_POL_PRTCP_CD_LEN));
  }

  int localPol12RetSpclRxIndCounter = -1;

  public boolean isPol12RetSpclRxIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetSpclRxIndCounter != sharedCounter;
    localPol12RetSpclRxIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_SPCL_RX_IND_LEN = 1;
  /** serialize this Pol12RetSpclRxInd */
  protected void serializePol12RetSpclRxInd(char[] pol12RetSpclRxInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetSpclRxInd, 0, getStringValue(), beginPol12RetSpclRxInd, POL_12_RET_SPCL_RX_IND_LEN);
    localPol12RetSpclRxIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetSpclRxIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetSpclRxInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetSpclRxInd() {
    return (substring(
        getStringValue(),
        beginPol12RetSpclRxInd,
        beginPol12RetSpclRxInd + POL_12_RET_SPCL_RX_IND_LEN));
  }

  int localPol12RetErisaIndCounter = -1;

  public boolean isPol12RetErisaIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetErisaIndCounter != sharedCounter;
    localPol12RetErisaIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_ERISA_IND_LEN = 1;
  /** serialize this Pol12RetErisaInd */
  protected void serializePol12RetErisaInd(char[] pol12RetErisaInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol12RetErisaInd, 0, getStringValue(), beginPol12RetErisaInd, POL_12_RET_ERISA_IND_LEN);
    localPol12RetErisaIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetErisaIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol12RetErisaInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetErisaInd() {
    return (substring(
        getStringValue(), beginPol12RetErisaInd, beginPol12RetErisaInd + POL_12_RET_ERISA_IND_LEN));
  }

  int localPol12RetFillerCounter = -1;

  public boolean isPol12RetFillerModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol12RetFillerCounter != sharedCounter;
    localPol12RetFillerCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_12_RET_FILLER_LEN = 19;
  /** serialize this Pol12RetFiller */
  protected void serializePol12RetFiller(char[] pol12RetFiller) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol12RetFiller, 0, getStringValue(), beginPol12RetFiller, POL_12_RET_FILLER_LEN);
    localPol12RetFillerCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol12RetFillerConstraints(char[] value) {
    return super.checkConstraints(value, 19, false, false);
  }
  /**
   * refreshPol12RetFiller is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol12RetFiller() {
    return (substring(
        getStringValue(), beginPol12RetFiller, beginPol12RetFiller + POL_12_RET_FILLER_LEN));
  }
}
