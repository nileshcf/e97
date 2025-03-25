package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclpolPlnAccumRuleSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclpolPlnAccumRuleSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclpolPlnAccumRuleSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLPOL_PLN_ACCUM_RULE_LENGTH = 118;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDacmPolNbr;
  protected int beginDacmPlnNbr;
  protected int beginDacmClssNbr;
  protected int beginDacmCovTypCd;
  protected int beginDacmAccumRuleTypCd;
  protected int beginDacmAccumBenTypCd;
  protected int beginDacmIndvOopAmt;
  protected int beginDacmFamOopAmt;
  protected int beginDacmEePls1Amt;
  protected int beginDacmEePlsSpAmt;
  protected int beginDacmEePlsChAmt;
  protected int beginDacmIndvMaxAmt;
  protected int beginDacmFamMaxAmt;

  /** Constructor for DclpolPlnAccumRuleSerialized */
  public DclpolPlnAccumRuleSerialized() {
    init(0);
  }

  /** initializes the field in DclpolPlnAccumRuleSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLPOL_PLN_ACCUM_RULE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDacmPolNbr = getStartOffset() + 0; // set offset for serialization

    beginDacmPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginDacmClssNbr = getStartOffset() + 10; // set offset for serialization

    beginDacmCovTypCd = getStartOffset() + 14; // set offset for serialization

    beginDacmAccumRuleTypCd = getStartOffset() + 15; // set offset for serialization

    beginDacmAccumBenTypCd = getStartOffset() + 19; // set offset for serialization

    beginDacmIndvOopAmt = getStartOffset() + 20; // set offset for serialization

    beginDacmFamOopAmt = getStartOffset() + 29; // set offset for serialization

    beginDacmEePls1Amt = getStartOffset() + 38; // set offset for serialization

    beginDacmEePlsSpAmt = getStartOffset() + 47; // set offset for serialization

    beginDacmEePlsChAmt = getStartOffset() + 56; // set offset for serialization

    beginDacmIndvMaxAmt = getStartOffset() + 65; // set offset for serialization

    beginDacmFamMaxAmt = getStartOffset() + 74; // set offset for serialization

    /*  end of offset */
  }

  int localDacmPolNbrCounter = -1;

  public boolean isDacmPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmPolNbrCounter != sharedCounter;
    localDacmPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DACM_POL_NBR_LEN = 6;
  /** serialize this DacmPolNbr */
  protected void serializeDacmPolNbr(char[] dacmPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dacmPolNbr, 0, getStringValue(), beginDacmPolNbr, DACM_POL_NBR_LEN);
    localDacmPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDacmPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshDacmPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDacmPolNbr() {
    return (substring(getStringValue(), beginDacmPolNbr, beginDacmPolNbr + DACM_POL_NBR_LEN));
  }

  int localDacmPlnNbrCounter = -1;

  public boolean isDacmPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmPlnNbrCounter != sharedCounter;
    localDacmPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DACM_PLN_NBR_LEN = 4;
  /** serialize this DacmPlnNbr */
  protected void serializeDacmPlnNbr(char[] dacmPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dacmPlnNbr, 0, getStringValue(), beginDacmPlnNbr, DACM_PLN_NBR_LEN);
    localDacmPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDacmPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDacmPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDacmPlnNbr() {
    return (substring(getStringValue(), beginDacmPlnNbr, beginDacmPlnNbr + DACM_PLN_NBR_LEN));
  }

  int localDacmClssNbrCounter = -1;

  public boolean isDacmClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmClssNbrCounter != sharedCounter;
    localDacmClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DACM_CLSS_NBR_LEN = 4;
  /** serialize this DacmClssNbr */
  protected void serializeDacmClssNbr(char[] dacmClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dacmClssNbr, 0, getStringValue(), beginDacmClssNbr, DACM_CLSS_NBR_LEN);
    localDacmClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDacmClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDacmClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDacmClssNbr() {
    return (substring(getStringValue(), beginDacmClssNbr, beginDacmClssNbr + DACM_CLSS_NBR_LEN));
  }

  int localDacmCovTypCdCounter = -1;

  public boolean isDacmCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmCovTypCdCounter != sharedCounter;
    localDacmCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DACM_COV_TYP_CD_LEN = 1;
  /** serialize this DacmCovTypCd */
  protected void serializeDacmCovTypCd(char[] dacmCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dacmCovTypCd, 0, getStringValue(), beginDacmCovTypCd, DACM_COV_TYP_CD_LEN);
    localDacmCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDacmCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDacmCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDacmCovTypCd() {
    return (substring(
        getStringValue(), beginDacmCovTypCd, beginDacmCovTypCd + DACM_COV_TYP_CD_LEN));
  }

  int localDacmAccumRuleTypCdCounter = -1;

  public boolean isDacmAccumRuleTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmAccumRuleTypCdCounter != sharedCounter;
    localDacmAccumRuleTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DACM_ACCUM_RULE_TYP_CD_LEN = 4;
  /** serialize this DacmAccumRuleTypCd */
  protected void serializeDacmAccumRuleTypCd(char[] dacmAccumRuleTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dacmAccumRuleTypCd,
        0,
        getStringValue(),
        beginDacmAccumRuleTypCd,
        DACM_ACCUM_RULE_TYP_CD_LEN);
    localDacmAccumRuleTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDacmAccumRuleTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshDacmAccumRuleTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDacmAccumRuleTypCd() {
    return (substring(
        getStringValue(),
        beginDacmAccumRuleTypCd,
        beginDacmAccumRuleTypCd + DACM_ACCUM_RULE_TYP_CD_LEN));
  }

  int localDacmAccumBenTypCdCounter = -1;

  public boolean isDacmAccumBenTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmAccumBenTypCdCounter != sharedCounter;
    localDacmAccumBenTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DACM_ACCUM_BEN_TYP_CD_LEN = 1;
  /** serialize this DacmAccumBenTypCd */
  protected void serializeDacmAccumBenTypCd(char[] dacmAccumBenTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dacmAccumBenTypCd, 0, getStringValue(), beginDacmAccumBenTypCd, DACM_ACCUM_BEN_TYP_CD_LEN);
    localDacmAccumBenTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDacmAccumBenTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshDacmAccumBenTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshDacmAccumBenTypCd() {
    return (substring(
        getStringValue(),
        beginDacmAccumBenTypCd,
        beginDacmAccumBenTypCd + DACM_ACCUM_BEN_TYP_CD_LEN));
  }

  int localDacmIndvOopAmtCounter = -1;

  public boolean isDacmIndvOopAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmIndvOopAmtCounter != sharedCounter;
    localDacmIndvOopAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean dacmIndvOopAmtIsNumeric() {
    return decimalIsNumeric(
        beginDacmIndvOopAmt,
        DACM_INDV_OOP_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dacmIndvOopAmtString() {
    return getPackedString(beginDacmIndvOopAmt, DACM_INDV_OOP_AMT_LEN);
  }

  protected static final int DACM_INDV_OOP_AMT_LEN = 9;
  protected static final int DACM_INDV_OOP_AMT_SCALE = 2;
  /** serializeDacmIndvOopAmt */
  protected void serializeDacmIndvOopAmt(BigDecimal dacmIndvOopAmt) {
    putDecimal(
        beginDacmIndvOopAmt, dacmIndvOopAmt, DACM_INDV_OOP_AMT_LEN, DACM_INDV_OOP_AMT_SCALE, true);
    localDacmIndvOopAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDacmIndvOopAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshDacmIndvOopAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDacmIndvOopAmt() throws CFException {
    try {
      return (getDecimal(beginDacmIndvOopAmt, DACM_INDV_OOP_AMT_LEN, DACM_INDV_OOP_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dacmIndvOopAmt", beginDacmIndvOopAmt, DACM_INDV_OOP_AMT_LEN);
    }
  }

  int localDacmFamOopAmtCounter = -1;

  public boolean isDacmFamOopAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmFamOopAmtCounter != sharedCounter;
    localDacmFamOopAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean dacmFamOopAmtIsNumeric() {
    return decimalIsNumeric(
        beginDacmFamOopAmt,
        DACM_FAM_OOP_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dacmFamOopAmtString() {
    return getPackedString(beginDacmFamOopAmt, DACM_FAM_OOP_AMT_LEN);
  }

  protected static final int DACM_FAM_OOP_AMT_LEN = 9;
  protected static final int DACM_FAM_OOP_AMT_SCALE = 2;
  /** serializeDacmFamOopAmt */
  protected void serializeDacmFamOopAmt(BigDecimal dacmFamOopAmt) {
    putDecimal(
        beginDacmFamOopAmt, dacmFamOopAmt, DACM_FAM_OOP_AMT_LEN, DACM_FAM_OOP_AMT_SCALE, true);
    localDacmFamOopAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDacmFamOopAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshDacmFamOopAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDacmFamOopAmt() throws CFException {
    try {
      return (getDecimal(beginDacmFamOopAmt, DACM_FAM_OOP_AMT_LEN, DACM_FAM_OOP_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dacmFamOopAmt", beginDacmFamOopAmt, DACM_FAM_OOP_AMT_LEN);
    }
  }

  int localDacmEePls1AmtCounter = -1;

  public boolean isDacmEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmEePls1AmtCounter != sharedCounter;
    localDacmEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean dacmEePls1AmtIsNumeric() {
    return decimalIsNumeric(
        beginDacmEePls1Amt,
        DACM_EE_PLS_1_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dacmEePls1AmtString() {
    return getPackedString(beginDacmEePls1Amt, DACM_EE_PLS_1_AMT_LEN);
  }

  protected static final int DACM_EE_PLS_1_AMT_LEN = 9;
  protected static final int DACM_EE_PLS_1_AMT_SCALE = 2;
  /** serializeDacmEePls1Amt */
  protected void serializeDacmEePls1Amt(BigDecimal dacmEePls1Amt) {
    putDecimal(
        beginDacmEePls1Amt, dacmEePls1Amt, DACM_EE_PLS_1_AMT_LEN, DACM_EE_PLS_1_AMT_SCALE, true);
    localDacmEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDacmEePls1AmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshDacmEePls1Amt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDacmEePls1Amt() throws CFException {
    try {
      return (getDecimal(beginDacmEePls1Amt, DACM_EE_PLS_1_AMT_LEN, DACM_EE_PLS_1_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dacmEePls1Amt", beginDacmEePls1Amt, DACM_EE_PLS_1_AMT_LEN);
    }
  }

  int localDacmEePlsSpAmtCounter = -1;

  public boolean isDacmEePlsSpAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmEePlsSpAmtCounter != sharedCounter;
    localDacmEePlsSpAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean dacmEePlsSpAmtIsNumeric() {
    return decimalIsNumeric(
        beginDacmEePlsSpAmt,
        DACM_EE_PLS_SP_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dacmEePlsSpAmtString() {
    return getPackedString(beginDacmEePlsSpAmt, DACM_EE_PLS_SP_AMT_LEN);
  }

  protected static final int DACM_EE_PLS_SP_AMT_LEN = 9;
  protected static final int DACM_EE_PLS_SP_AMT_SCALE = 2;
  /** serializeDacmEePlsSpAmt */
  protected void serializeDacmEePlsSpAmt(BigDecimal dacmEePlsSpAmt) {
    putDecimal(
        beginDacmEePlsSpAmt,
        dacmEePlsSpAmt,
        DACM_EE_PLS_SP_AMT_LEN,
        DACM_EE_PLS_SP_AMT_SCALE,
        true);
    localDacmEePlsSpAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDacmEePlsSpAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshDacmEePlsSpAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDacmEePlsSpAmt() throws CFException {
    try {
      return (getDecimal(beginDacmEePlsSpAmt, DACM_EE_PLS_SP_AMT_LEN, DACM_EE_PLS_SP_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dacmEePlsSpAmt", beginDacmEePlsSpAmt, DACM_EE_PLS_SP_AMT_LEN);
    }
  }

  int localDacmEePlsChAmtCounter = -1;

  public boolean isDacmEePlsChAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmEePlsChAmtCounter != sharedCounter;
    localDacmEePlsChAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean dacmEePlsChAmtIsNumeric() {
    return decimalIsNumeric(
        beginDacmEePlsChAmt,
        DACM_EE_PLS_CH_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dacmEePlsChAmtString() {
    return getPackedString(beginDacmEePlsChAmt, DACM_EE_PLS_CH_AMT_LEN);
  }

  protected static final int DACM_EE_PLS_CH_AMT_LEN = 9;
  protected static final int DACM_EE_PLS_CH_AMT_SCALE = 2;
  /** serializeDacmEePlsChAmt */
  protected void serializeDacmEePlsChAmt(BigDecimal dacmEePlsChAmt) {
    putDecimal(
        beginDacmEePlsChAmt,
        dacmEePlsChAmt,
        DACM_EE_PLS_CH_AMT_LEN,
        DACM_EE_PLS_CH_AMT_SCALE,
        true);
    localDacmEePlsChAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDacmEePlsChAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshDacmEePlsChAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDacmEePlsChAmt() throws CFException {
    try {
      return (getDecimal(beginDacmEePlsChAmt, DACM_EE_PLS_CH_AMT_LEN, DACM_EE_PLS_CH_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dacmEePlsChAmt", beginDacmEePlsChAmt, DACM_EE_PLS_CH_AMT_LEN);
    }
  }

  int localDacmIndvMaxAmtCounter = -1;

  public boolean isDacmIndvMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmIndvMaxAmtCounter != sharedCounter;
    localDacmIndvMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean dacmIndvMaxAmtIsNumeric() {
    return decimalIsNumeric(
        beginDacmIndvMaxAmt,
        DACM_INDV_MAX_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dacmIndvMaxAmtString() {
    return getPackedString(beginDacmIndvMaxAmt, DACM_INDV_MAX_AMT_LEN);
  }

  protected static final int DACM_INDV_MAX_AMT_LEN = 9;
  protected static final int DACM_INDV_MAX_AMT_SCALE = 2;
  /** serializeDacmIndvMaxAmt */
  protected void serializeDacmIndvMaxAmt(BigDecimal dacmIndvMaxAmt) {
    putDecimal(
        beginDacmIndvMaxAmt, dacmIndvMaxAmt, DACM_INDV_MAX_AMT_LEN, DACM_INDV_MAX_AMT_SCALE, true);
    localDacmIndvMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDacmIndvMaxAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshDacmIndvMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDacmIndvMaxAmt() throws CFException {
    try {
      return (getDecimal(beginDacmIndvMaxAmt, DACM_INDV_MAX_AMT_LEN, DACM_INDV_MAX_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dacmIndvMaxAmt", beginDacmIndvMaxAmt, DACM_INDV_MAX_AMT_LEN);
    }
  }

  int localDacmFamMaxAmtCounter = -1;

  public boolean isDacmFamMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDacmFamMaxAmtCounter != sharedCounter;
    localDacmFamMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  public boolean dacmFamMaxAmtIsNumeric() {
    return decimalIsNumeric(
        beginDacmFamMaxAmt,
        DACM_FAM_MAX_AMT_LEN); // check Packed Decimal field to see if it contains valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] dacmFamMaxAmtString() {
    return getPackedString(beginDacmFamMaxAmt, DACM_FAM_MAX_AMT_LEN);
  }

  protected static final int DACM_FAM_MAX_AMT_LEN = 9;
  protected static final int DACM_FAM_MAX_AMT_SCALE = 2;
  /** serializeDacmFamMaxAmt */
  protected void serializeDacmFamMaxAmt(BigDecimal dacmFamMaxAmt) {
    putDecimal(
        beginDacmFamMaxAmt, dacmFamMaxAmt, DACM_FAM_MAX_AMT_LEN, DACM_FAM_MAX_AMT_SCALE, true);
    localDacmFamMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkDacmFamMaxAmtMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 16 /*precision*/);
  }
  /**
   * refreshDacmFamMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshDacmFamMaxAmt() throws CFException {
    try {
      return (getDecimal(beginDacmFamMaxAmt, DACM_FAM_MAX_AMT_LEN, DACM_FAM_MAX_AMT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend("dacmFamMaxAmt", beginDacmFamMaxAmt, DACM_FAM_MAX_AMT_LEN);
    }
  }
}
