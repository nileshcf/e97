package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol4PolBenLvl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Pol4PolBenLvl extends Pol4PolBenLvlSerialized {

  private char[] pol4DblvBenLvlTypCd = Field.fillLowValue(5);

  private char[] pol4DblvBasPctOvrlayCd = Field.fillLowValue(1);

  private char[] pol4DblvIncntPntlyBasCd = Field.fillLowValue(1);

  private BigDecimal pol4DblvIncntPntlyBasPct = BigDecimal.ZERO;

  private char[] pol4DblvIncntPntlyMedCd = Field.fillLowValue(1);

  private BigDecimal pol4DblvIncntPntlyMedPct = BigDecimal.ZERO;

  private char[] pol4DblvOverlayPctCd = Field.fillLowValue(1);

  private char[] pol4DblvDedDescCd = Field.fillLowValue(1);

  /** Constructor for Pol4PolBenLvl */
  public Pol4PolBenLvl() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4PolBenLvl. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4PolBenLvl(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol4DblvBenLvlTypCd
   *
   * @return pol4DblvBenLvlTypCd
   */
  public char[] getPol4DblvBenLvlTypCd() throws CFException {
    if (isPol4DblvBenLvlTypCdModified()) {
      pol4DblvBenLvlTypCd = refreshPol4DblvBenLvlTypCd();
    }
    return pol4DblvBenLvlTypCd;
  }

  /**
   * set variable pol4DblvBenLvlTypCd Corresponding COBOL Variable is POL4-DBLV-BEN-LVL-TYP-CD
   *
   * @param value
   */
  public void setPol4DblvBenLvlTypCd(char[] value) {
    pol4DblvBenLvlTypCd = checkPol4DblvBenLvlTypCdConstraints(value);
    serializePol4DblvBenLvlTypCd(pol4DblvBenLvlTypCd);
  }

  /**
   * Update Pol4DblvBenLvlTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DblvBenLvlTypCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4DblvBenLvlTypCd, pol4DblvBenLvlTypCd.length);
  }

  public void setPol4DblvBenLvlTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvBenLvlTypCd, pol4DblvBenLvlTypCd.length);
  }

  /**
   * Update Pol4DblvBenLvlTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvBenLvlTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvBenLvlTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DblvBenLvlTypCd with another Field
   *
   * @param value
   */
  public void setPol4DblvBenLvlTypCd(Field source) {
    replace(source, 0, source.length(), beginPol4DblvBenLvlTypCd, POL_4_DBLV_BEN_LVL_TYP_CD_LEN);
  }

  /**
   * Update Pol4DblvBenLvlTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DblvBenLvlTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4DblvBenLvlTypCd, POL_4_DBLV_BEN_LVL_TYP_CD_LEN);
  }

  /**
   * Update Pol4DblvBenLvlTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvBenLvlTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvBenLvlTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DblvBasPctOvrlayCd
   *
   * @return pol4DblvBasPctOvrlayCd
   */
  public char[] getPol4DblvBasPctOvrlayCd() throws CFException {
    if (isPol4DblvBasPctOvrlayCdModified()) {
      pol4DblvBasPctOvrlayCd = refreshPol4DblvBasPctOvrlayCd();
    }
    return pol4DblvBasPctOvrlayCd;
  }

  /**
   * set variable pol4DblvBasPctOvrlayCd Corresponding COBOL Variable is POL4-DBLV-BAS-PCT-OVRLAY-CD
   *
   * @param value
   */
  public void setPol4DblvBasPctOvrlayCd(char[] value) {
    pol4DblvBasPctOvrlayCd = checkPol4DblvBasPctOvrlayCdConstraints(value);
    serializePol4DblvBasPctOvrlayCd(pol4DblvBasPctOvrlayCd);
  }

  /**
   * Update Pol4DblvBasPctOvrlayCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DblvBasPctOvrlayCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4DblvBasPctOvrlayCd,
        pol4DblvBasPctOvrlayCd.length);
  }

  public void setPol4DblvBasPctOvrlayCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4DblvBasPctOvrlayCd, pol4DblvBasPctOvrlayCd.length);
  }

  /**
   * Update Pol4DblvBasPctOvrlayCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvBasPctOvrlayCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvBasPctOvrlayCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DblvBasPctOvrlayCd with another Field
   *
   * @param value
   */
  public void setPol4DblvBasPctOvrlayCd(Field source) {
    replace(
        source, 0, source.length(), beginPol4DblvBasPctOvrlayCd, POL_4_DBLV_BAS_PCT_OVRLAY_CD_LEN);
  }

  /**
   * Update Pol4DblvBasPctOvrlayCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DblvBasPctOvrlayCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4DblvBasPctOvrlayCd,
        POL_4_DBLV_BAS_PCT_OVRLAY_CD_LEN);
  }

  /**
   * Update Pol4DblvBasPctOvrlayCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4DblvBasPctOvrlayCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvBasPctOvrlayCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DblvIncntPntlyBasCd
   *
   * @return pol4DblvIncntPntlyBasCd
   */
  public char[] getPol4DblvIncntPntlyBasCd() throws CFException {
    if (isPol4DblvIncntPntlyBasCdModified()) {
      pol4DblvIncntPntlyBasCd = refreshPol4DblvIncntPntlyBasCd();
    }
    return pol4DblvIncntPntlyBasCd;
  }

  /**
   * set variable pol4DblvIncntPntlyBasCd Corresponding COBOL Variable is
   * POL4-DBLV-INCNT-PNTLY-BAS-CD
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyBasCd(char[] value) {
    pol4DblvIncntPntlyBasCd = checkPol4DblvIncntPntlyBasCdConstraints(value);
    serializePol4DblvIncntPntlyBasCd(pol4DblvIncntPntlyBasCd);
  }

  /**
   * Update Pol4DblvIncntPntlyBasCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyBasCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4DblvIncntPntlyBasCd,
        pol4DblvIncntPntlyBasCd.length);
  }

  public void setPol4DblvIncntPntlyBasCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4DblvIncntPntlyBasCd,
        pol4DblvIncntPntlyBasCd.length);
  }

  /**
   * Update Pol4DblvIncntPntlyBasCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyBasCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvIncntPntlyBasCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DblvIncntPntlyBasCd with another Field
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyBasCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol4DblvIncntPntlyBasCd,
        POL_4_DBLV_INCNT_PNTLY_BAS_CD_LEN);
  }

  /**
   * Update Pol4DblvIncntPntlyBasCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyBasCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4DblvIncntPntlyBasCd,
        POL_4_DBLV_INCNT_PNTLY_BAS_CD_LEN);
  }

  /**
   * Update Pol4DblvIncntPntlyBasCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyBasCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvIncntPntlyBasCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DblvIncntPntlyBasPct
   *
   * @return pol4DblvIncntPntlyBasPct
   */
  public BigDecimal getPol4DblvIncntPntlyBasPct() throws CFException {
    if (isPol4DblvIncntPntlyBasPctModified()) {
      pol4DblvIncntPntlyBasPct = refreshPol4DblvIncntPntlyBasPct();
    }
    return pol4DblvIncntPntlyBasPct;
  }

  /**
   * Returns the String value of pol4DblvIncntPntlyBasPct
   *
   * @return pol4DblvIncntPntlyBasPct
   */
  public char[] getPol4DblvIncntPntlyBasPctActualString() {
    String value = String.valueOf(pol4DblvIncntPntlyBasPct).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4DblvIncntPntlyBasPct with the passed number Corresponding COBOL Variable is
   * POL4-DBLV-INCNT-PNTLY-BAS-PCT
   *
   * @param number
   */
  public void setPol4DblvIncntPntlyBasPct(BigDecimal number) {
    pol4DblvIncntPntlyBasPct = checkPol4DblvIncntPntlyBasPctMaxLimit(number);
    serializePol4DblvIncntPntlyBasPct(pol4DblvIncntPntlyBasPct);
  }
  /**
   * Update Pol4DblvIncntPntlyBasPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DblvIncntPntlyBasPct(char[] value) throws CFException {
    pol4DblvIncntPntlyBasPct = serializePol4DblvIncntPntlyBasPct(value);
  }
  /**
   * Returns the value of pol4DblvIncntPntlyMedCd
   *
   * @return pol4DblvIncntPntlyMedCd
   */
  public char[] getPol4DblvIncntPntlyMedCd() throws CFException {
    if (isPol4DblvIncntPntlyMedCdModified()) {
      pol4DblvIncntPntlyMedCd = refreshPol4DblvIncntPntlyMedCd();
    }
    return pol4DblvIncntPntlyMedCd;
  }

  /**
   * set variable pol4DblvIncntPntlyMedCd Corresponding COBOL Variable is
   * POL4-DBLV-INCNT-PNTLY-MED-CD
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyMedCd(char[] value) {
    pol4DblvIncntPntlyMedCd = checkPol4DblvIncntPntlyMedCdConstraints(value);
    serializePol4DblvIncntPntlyMedCd(pol4DblvIncntPntlyMedCd);
  }

  /**
   * Update Pol4DblvIncntPntlyMedCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyMedCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginPol4DblvIncntPntlyMedCd,
        pol4DblvIncntPntlyMedCd.length);
  }

  public void setPol4DblvIncntPntlyMedCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4DblvIncntPntlyMedCd,
        pol4DblvIncntPntlyMedCd.length);
  }

  /**
   * Update Pol4DblvIncntPntlyMedCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyMedCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvIncntPntlyMedCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DblvIncntPntlyMedCd with another Field
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyMedCd(Field source) {
    replace(
        source,
        0,
        source.length(),
        beginPol4DblvIncntPntlyMedCd,
        POL_4_DBLV_INCNT_PNTLY_MED_CD_LEN);
  }

  /**
   * Update Pol4DblvIncntPntlyMedCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyMedCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginPol4DblvIncntPntlyMedCd,
        POL_4_DBLV_INCNT_PNTLY_MED_CD_LEN);
  }

  /**
   * Update Pol4DblvIncntPntlyMedCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4DblvIncntPntlyMedCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvIncntPntlyMedCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DblvIncntPntlyMedPct
   *
   * @return pol4DblvIncntPntlyMedPct
   */
  public BigDecimal getPol4DblvIncntPntlyMedPct() throws CFException {
    if (isPol4DblvIncntPntlyMedPctModified()) {
      pol4DblvIncntPntlyMedPct = refreshPol4DblvIncntPntlyMedPct();
    }
    return pol4DblvIncntPntlyMedPct;
  }

  /**
   * Returns the String value of pol4DblvIncntPntlyMedPct
   *
   * @return pol4DblvIncntPntlyMedPct
   */
  public char[] getPol4DblvIncntPntlyMedPctActualString() {
    String value = String.valueOf(pol4DblvIncntPntlyMedPct).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update Pol4DblvIncntPntlyMedPct with the passed number Corresponding COBOL Variable is
   * POL4-DBLV-INCNT-PNTLY-MED-PCT
   *
   * @param number
   */
  public void setPol4DblvIncntPntlyMedPct(BigDecimal number) {
    pol4DblvIncntPntlyMedPct = checkPol4DblvIncntPntlyMedPctMaxLimit(number);
    serializePol4DblvIncntPntlyMedPct(pol4DblvIncntPntlyMedPct);
  }
  /**
   * Update Pol4DblvIncntPntlyMedPct with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol4DblvIncntPntlyMedPct(char[] value) throws CFException {
    pol4DblvIncntPntlyMedPct = serializePol4DblvIncntPntlyMedPct(value);
  }
  /**
   * Returns the value of pol4DblvOverlayPctCd
   *
   * @return pol4DblvOverlayPctCd
   */
  public char[] getPol4DblvOverlayPctCd() throws CFException {
    if (isPol4DblvOverlayPctCdModified()) {
      pol4DblvOverlayPctCd = refreshPol4DblvOverlayPctCd();
    }
    return pol4DblvOverlayPctCd;
  }

  /**
   * set variable pol4DblvOverlayPctCd Corresponding COBOL Variable is POL4-DBLV-OVERLAY-PCT-CD
   *
   * @param value
   */
  public void setPol4DblvOverlayPctCd(char[] value) {
    pol4DblvOverlayPctCd = checkPol4DblvOverlayPctCdConstraints(value);
    serializePol4DblvOverlayPctCd(pol4DblvOverlayPctCd);
  }

  /**
   * Update Pol4DblvOverlayPctCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DblvOverlayPctCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol4DblvOverlayPctCd, pol4DblvOverlayPctCd.length);
  }

  public void setPol4DblvOverlayPctCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvOverlayPctCd, pol4DblvOverlayPctCd.length);
  }

  /**
   * Update Pol4DblvOverlayPctCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvOverlayPctCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvOverlayPctCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DblvOverlayPctCd with another Field
   *
   * @param value
   */
  public void setPol4DblvOverlayPctCd(Field source) {
    replace(source, 0, source.length(), beginPol4DblvOverlayPctCd, POL_4_DBLV_OVERLAY_PCT_CD_LEN);
  }

  /**
   * Update Pol4DblvOverlayPctCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DblvOverlayPctCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol4DblvOverlayPctCd, POL_4_DBLV_OVERLAY_PCT_CD_LEN);
  }

  /**
   * Update Pol4DblvOverlayPctCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol4DblvOverlayPctCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvOverlayPctCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol4DblvDedDescCd
   *
   * @return pol4DblvDedDescCd
   */
  public char[] getPol4DblvDedDescCd() throws CFException {
    if (isPol4DblvDedDescCdModified()) {
      pol4DblvDedDescCd = refreshPol4DblvDedDescCd();
    }
    return pol4DblvDedDescCd;
  }

  /**
   * set variable pol4DblvDedDescCd Corresponding COBOL Variable is POL4-DBLV-DED-DESC-CD
   *
   * @param value
   */
  public void setPol4DblvDedDescCd(char[] value) {
    pol4DblvDedDescCd = checkPol4DblvDedDescCdConstraints(value);
    serializePol4DblvDedDescCd(pol4DblvDedDescCd);
  }

  /**
   * Update Pol4DblvDedDescCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol4DblvDedDescCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol4DblvDedDescCd, pol4DblvDedDescCd.length);
  }

  public void setPol4DblvDedDescCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvDedDescCd, pol4DblvDedDescCd.length);
  }

  /**
   * Update Pol4DblvDedDescCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvDedDescCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvDedDescCd + targetIndex, targetLen);
  }

  /**
   * Update Pol4DblvDedDescCd with another Field
   *
   * @param value
   */
  public void setPol4DblvDedDescCd(Field source) {
    replace(source, 0, source.length(), beginPol4DblvDedDescCd, POL_4_DBLV_DED_DESC_CD_LEN);
  }

  /**
   * Update Pol4DblvDedDescCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4DblvDedDescCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvDedDescCd, POL_4_DBLV_DED_DESC_CD_LEN);
  }

  /**
   * Update Pol4DblvDedDescCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4DblvDedDescCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol4DblvDedDescCd + targetIndex, targetLen);
  }

  /**
   * initializes Pol4PolBenLvl String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol4DblvBenLvlTypCd(CONSTANTS.SPACE_5);
    setPol4DblvBasPctOvrlayCd(CONSTANTS.SPACE);
    setPol4DblvIncntPntlyBasCd(CONSTANTS.SPACE);
    setPol4DblvIncntPntlyBasPct(BigDecimal.ZERO);
    setPol4DblvIncntPntlyMedCd(CONSTANTS.SPACE);
    setPol4DblvIncntPntlyMedPct(BigDecimal.ZERO);
    setPol4DblvOverlayPctCd(CONSTANTS.SPACE);
    setPol4DblvDedDescCd(CONSTANTS.SPACE);
  }

  public static int getPol4PolBenLvlFieldLength() {
    return POL_4_POL_BEN_LVL_LENGTH;
  }
}
