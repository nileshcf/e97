package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol4PolBenLvlSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol4PolBenLvlSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol4PolBenLvlSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_4_POL_BEN_LVL_LENGTH = 16;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol4DblvBenLvlTypCd;
  protected int beginPol4DblvBasPctOvrlayCd;
  protected int beginPol4DblvIncntPntlyBasCd;
  protected int beginPol4DblvIncntPntlyBasPct;
  protected int beginPol4DblvIncntPntlyMedCd;
  protected int beginPol4DblvIncntPntlyMedPct;
  protected int beginPol4DblvOverlayPctCd;
  protected int beginPol4DblvDedDescCd;

  /** Constructor for Pol4PolBenLvlSerialized */
  public Pol4PolBenLvlSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4PolBenLvlSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4PolBenLvlSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol4PolBenLvlSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 386); // serialize this field at offset 386 by default
  }

  /**
   * sets parent for this Pol4PolBenLvlSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 386 by default
  }
  /** initializes the field in Pol4PolBenLvlSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_4_POL_BEN_LVL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol4DblvBenLvlTypCd = getStartOffset() + 0; // set offset for serialization

    beginPol4DblvBasPctOvrlayCd = getStartOffset() + 5; // set offset for serialization

    beginPol4DblvIncntPntlyBasCd = getStartOffset() + 6; // set offset for serialization

    beginPol4DblvIncntPntlyBasPct = getStartOffset() + 7; // set offset for serialization

    beginPol4DblvIncntPntlyMedCd = getStartOffset() + 10; // set offset for serialization

    beginPol4DblvIncntPntlyMedPct = getStartOffset() + 11; // set offset for serialization

    beginPol4DblvOverlayPctCd = getStartOffset() + 14; // set offset for serialization

    beginPol4DblvDedDescCd = getStartOffset() + 15; // set offset for serialization

    /*  end of offset */
  }

  int localPol4DblvBenLvlTypCdCounter = -1;

  public boolean isPol4DblvBenLvlTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvBenLvlTypCdCounter != sharedCounter;
    localPol4DblvBenLvlTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DBLV_BEN_LVL_TYP_CD_LEN = 5;
  /** serialize this Pol4DblvBenLvlTypCd */
  protected void serializePol4DblvBenLvlTypCd(char[] pol4DblvBenLvlTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DblvBenLvlTypCd,
        0,
        getStringValue(),
        beginPol4DblvBenLvlTypCd,
        POL_4_DBLV_BEN_LVL_TYP_CD_LEN);
    localPol4DblvBenLvlTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DblvBenLvlTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshPol4DblvBenLvlTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DblvBenLvlTypCd() {
    return (substring(
        getStringValue(),
        beginPol4DblvBenLvlTypCd,
        beginPol4DblvBenLvlTypCd + POL_4_DBLV_BEN_LVL_TYP_CD_LEN));
  }

  int localPol4DblvBasPctOvrlayCdCounter = -1;

  public boolean isPol4DblvBasPctOvrlayCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvBasPctOvrlayCdCounter != sharedCounter;
    localPol4DblvBasPctOvrlayCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DBLV_BAS_PCT_OVRLAY_CD_LEN = 1;
  /** serialize this Pol4DblvBasPctOvrlayCd */
  protected void serializePol4DblvBasPctOvrlayCd(char[] pol4DblvBasPctOvrlayCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DblvBasPctOvrlayCd,
        0,
        getStringValue(),
        beginPol4DblvBasPctOvrlayCd,
        POL_4_DBLV_BAS_PCT_OVRLAY_CD_LEN);
    localPol4DblvBasPctOvrlayCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DblvBasPctOvrlayCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DblvBasPctOvrlayCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DblvBasPctOvrlayCd() {
    return (substring(
        getStringValue(),
        beginPol4DblvBasPctOvrlayCd,
        beginPol4DblvBasPctOvrlayCd + POL_4_DBLV_BAS_PCT_OVRLAY_CD_LEN));
  }

  int localPol4DblvIncntPntlyBasCdCounter = -1;

  public boolean isPol4DblvIncntPntlyBasCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvIncntPntlyBasCdCounter != sharedCounter;
    localPol4DblvIncntPntlyBasCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DBLV_INCNT_PNTLY_BAS_CD_LEN = 1;
  /** serialize this Pol4DblvIncntPntlyBasCd */
  protected void serializePol4DblvIncntPntlyBasCd(char[] pol4DblvIncntPntlyBasCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DblvIncntPntlyBasCd,
        0,
        getStringValue(),
        beginPol4DblvIncntPntlyBasCd,
        POL_4_DBLV_INCNT_PNTLY_BAS_CD_LEN);
    localPol4DblvIncntPntlyBasCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DblvIncntPntlyBasCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DblvIncntPntlyBasCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DblvIncntPntlyBasCd() {
    return (substring(
        getStringValue(),
        beginPol4DblvIncntPntlyBasCd,
        beginPol4DblvIncntPntlyBasCd + POL_4_DBLV_INCNT_PNTLY_BAS_CD_LEN));
  }

  int localPol4DblvIncntPntlyBasPctCounter = -1;

  public boolean isPol4DblvIncntPntlyBasPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvIncntPntlyBasPctCounter != sharedCounter;
    localPol4DblvIncntPntlyBasPctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DblvIncntPntlyBasPct
   *
   * @return pol4DblvIncntPntlyBasPct
   */
  public char[] getPol4DblvIncntPntlyBasPctString() {
    return getCharArray(beginPol4DblvIncntPntlyBasPct, POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DblvIncntPntlyBasPctIsNumeric() {
    return isNumeric(
        beginPol4DblvIncntPntlyBasPct,
        beginPol4DblvIncntPntlyBasPct + POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN = 3;
  protected static final int POL_4_DBLV_INCNT_PNTLY_BAS_PCT_SCALE = 2;

  protected BigDecimal checkPol4DblvIncntPntlyBasPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }

  /** serializePol4DblvIncntPntlyBasPct */
  protected void serializePol4DblvIncntPntlyBasPct(BigDecimal pol4DblvIncntPntlyBasPct) {
    putNumber(
        beginPol4DblvIncntPntlyBasPct,
        pol4DblvIncntPntlyBasPct,
        POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN,
        POL_4_DBLV_INCNT_PNTLY_BAS_PCT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DblvIncntPntlyBasPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4DblvIncntPntlyBasPct */
  protected BigDecimal serializePol4DblvIncntPntlyBasPct(char[] value) throws CFException {
    if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(3, value, true /*isSigned?*/), beginPol4DblvIncntPntlyBasPct, 3);
    localPol4DblvIncntPntlyBasPctCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN,
          POL_4_DBLV_INCNT_PNTLY_BAS_PCT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4DblvIncntPntlyBasPct",
          beginPol4DblvIncntPntlyBasPct,
          POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN);
    }
  }
  /**
   * refreshPol4DblvIncntPntlyBasPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4DblvIncntPntlyBasPct() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4DblvIncntPntlyBasPct,
          POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN,
          POL_4_DBLV_INCNT_PNTLY_BAS_PCT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4DblvIncntPntlyBasPct",
          beginPol4DblvIncntPntlyBasPct,
          POL_4_DBLV_INCNT_PNTLY_BAS_PCT_LEN);
    }
  }

  int localPol4DblvIncntPntlyMedCdCounter = -1;

  public boolean isPol4DblvIncntPntlyMedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvIncntPntlyMedCdCounter != sharedCounter;
    localPol4DblvIncntPntlyMedCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DBLV_INCNT_PNTLY_MED_CD_LEN = 1;
  /** serialize this Pol4DblvIncntPntlyMedCd */
  protected void serializePol4DblvIncntPntlyMedCd(char[] pol4DblvIncntPntlyMedCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DblvIncntPntlyMedCd,
        0,
        getStringValue(),
        beginPol4DblvIncntPntlyMedCd,
        POL_4_DBLV_INCNT_PNTLY_MED_CD_LEN);
    localPol4DblvIncntPntlyMedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DblvIncntPntlyMedCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DblvIncntPntlyMedCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DblvIncntPntlyMedCd() {
    return (substring(
        getStringValue(),
        beginPol4DblvIncntPntlyMedCd,
        beginPol4DblvIncntPntlyMedCd + POL_4_DBLV_INCNT_PNTLY_MED_CD_LEN));
  }

  int localPol4DblvIncntPntlyMedPctCounter = -1;

  public boolean isPol4DblvIncntPntlyMedPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvIncntPntlyMedPctCounter != sharedCounter;
    localPol4DblvIncntPntlyMedPctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DblvIncntPntlyMedPct
   *
   * @return pol4DblvIncntPntlyMedPct
   */
  public char[] getPol4DblvIncntPntlyMedPctString() {
    return getCharArray(beginPol4DblvIncntPntlyMedPct, POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DblvIncntPntlyMedPctIsNumeric() {
    return isNumeric(
        beginPol4DblvIncntPntlyMedPct,
        beginPol4DblvIncntPntlyMedPct + POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN = 3;
  protected static final int POL_4_DBLV_INCNT_PNTLY_MED_PCT_SCALE = 2;

  protected BigDecimal checkPol4DblvIncntPntlyMedPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }

  /** serializePol4DblvIncntPntlyMedPct */
  protected void serializePol4DblvIncntPntlyMedPct(BigDecimal pol4DblvIncntPntlyMedPct) {
    putNumber(
        beginPol4DblvIncntPntlyMedPct,
        pol4DblvIncntPntlyMedPct,
        POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN,
        POL_4_DBLV_INCNT_PNTLY_MED_PCT_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DblvIncntPntlyMedPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializePol4DblvIncntPntlyMedPct */
  protected BigDecimal serializePol4DblvIncntPntlyMedPct(char[] value) throws CFException {
    if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(3, value, true /*isSigned?*/), beginPol4DblvIncntPntlyMedPct, 3);
    localPol4DblvIncntPntlyMedPctCounter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN,
          POL_4_DBLV_INCNT_PNTLY_MED_PCT_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4DblvIncntPntlyMedPct",
          beginPol4DblvIncntPntlyMedPct,
          POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN);
    }
  }
  /**
   * refreshPol4DblvIncntPntlyMedPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4DblvIncntPntlyMedPct() throws CFException {
    try {
      return (getDecimalNumber(
          beginPol4DblvIncntPntlyMedPct,
          POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN,
          POL_4_DBLV_INCNT_PNTLY_MED_PCT_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4DblvIncntPntlyMedPct",
          beginPol4DblvIncntPntlyMedPct,
          POL_4_DBLV_INCNT_PNTLY_MED_PCT_LEN);
    }
  }

  int localPol4DblvOverlayPctCdCounter = -1;

  public boolean isPol4DblvOverlayPctCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvOverlayPctCdCounter != sharedCounter;
    localPol4DblvOverlayPctCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DBLV_OVERLAY_PCT_CD_LEN = 1;
  /** serialize this Pol4DblvOverlayPctCd */
  protected void serializePol4DblvOverlayPctCd(char[] pol4DblvOverlayPctCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DblvOverlayPctCd,
        0,
        getStringValue(),
        beginPol4DblvOverlayPctCd,
        POL_4_DBLV_OVERLAY_PCT_CD_LEN);
    localPol4DblvOverlayPctCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DblvOverlayPctCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DblvOverlayPctCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DblvOverlayPctCd() {
    return (substring(
        getStringValue(),
        beginPol4DblvOverlayPctCd,
        beginPol4DblvOverlayPctCd + POL_4_DBLV_OVERLAY_PCT_CD_LEN));
  }

  int localPol4DblvDedDescCdCounter = -1;

  public boolean isPol4DblvDedDescCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DblvDedDescCdCounter != sharedCounter;
    localPol4DblvDedDescCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DBLV_DED_DESC_CD_LEN = 1;
  /** serialize this Pol4DblvDedDescCd */
  protected void serializePol4DblvDedDescCd(char[] pol4DblvDedDescCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DblvDedDescCd, 0, getStringValue(), beginPol4DblvDedDescCd, POL_4_DBLV_DED_DESC_CD_LEN);
    localPol4DblvDedDescCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DblvDedDescCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DblvDedDescCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4DblvDedDescCd() {
    return (substring(
        getStringValue(),
        beginPol4DblvDedDescCd,
        beginPol4DblvDedDescCd + POL_4_DBLV_DED_DESC_CD_LEN));
  }
}
