package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol6RetIndvData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class Pol6RetIndvData extends Pol6RetIndvDataSerialized {

  private char[] pol6RetIndDedDesc = Field.fillLowValue(6);

  private char[] pol6RetIndDedNetTyp = Field.fillLowValue(1);

  private char[] pol6RetIndvDedCaroCd = Field.fillLowValue(1);

  /** Constructor for Pol6RetIndvData */
  public Pol6RetIndvData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol6RetIndvData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol6RetIndvData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol6RetIndDedDesc
   *
   * @return pol6RetIndDedDesc
   */
  public char[] getPol6RetIndDedDesc() throws CFException {
    if (isPol6RetIndDedDescModified()) {
      pol6RetIndDedDesc = refreshPol6RetIndDedDesc();
    }
    return pol6RetIndDedDesc;
  }

  /**
   * set variable pol6RetIndDedDesc Corresponding COBOL Variable is POL6-RET-IND-DED-DESC
   *
   * @param value
   */
  public void setPol6RetIndDedDesc(char[] value) {
    pol6RetIndDedDesc = checkPol6RetIndDedDescConstraints(value);
    serializePol6RetIndDedDesc(pol6RetIndDedDesc);
  }

  /**
   * Update Pol6RetIndDedDesc with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedDesc(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6RetIndDedDesc, pol6RetIndDedDesc.length);
  }

  public void setPol6RetIndDedDesc(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndDedDesc, pol6RetIndDedDesc.length);
  }

  /**
   * Update Pol6RetIndDedDesc with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedDesc(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndDedDesc + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetIndDedDesc with another Field
   *
   * @param value
   */
  public void setPol6RetIndDedDesc(Field source) {
    replace(source, 0, source.length(), beginPol6RetIndDedDesc, POL_6_RET_IND_DED_DESC_LEN);
  }

  /**
   * Update Pol6RetIndDedDesc with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedDesc(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndDedDesc, POL_6_RET_IND_DED_DESC_LEN);
  }

  /**
   * Update Pol6RetIndDedDesc with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedDesc(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndDedDesc + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetIndDedNetTyp
   *
   * @return pol6RetIndDedNetTyp
   */
  public char[] getPol6RetIndDedNetTyp() throws CFException {
    if (isPol6RetIndDedNetTypModified()) {
      pol6RetIndDedNetTyp = refreshPol6RetIndDedNetTyp();
    }
    return pol6RetIndDedNetTyp;
  }

  /**
   * set variable pol6RetIndDedNetTyp Corresponding COBOL Variable is POL6-RET-IND-DED-NET-TYP
   *
   * @param value
   */
  public void setPol6RetIndDedNetTyp(char[] value) {
    pol6RetIndDedNetTyp = checkPol6RetIndDedNetTypConstraints(value);
    serializePol6RetIndDedNetTyp(pol6RetIndDedNetTyp);
  }

  /**
   * Update Pol6RetIndDedNetTyp with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedNetTyp(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetIndDedNetTyp, pol6RetIndDedNetTyp.length);
  }

  public void setPol6RetIndDedNetTyp(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndDedNetTyp, pol6RetIndDedNetTyp.length);
  }

  /**
   * Update Pol6RetIndDedNetTyp with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedNetTyp(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndDedNetTyp + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetIndDedNetTyp with another Field
   *
   * @param value
   */
  public void setPol6RetIndDedNetTyp(Field source) {
    replace(source, 0, source.length(), beginPol6RetIndDedNetTyp, POL_6_RET_IND_DED_NET_TYP_LEN);
  }

  /**
   * Update Pol6RetIndDedNetTyp with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedNetTyp(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetIndDedNetTyp, POL_6_RET_IND_DED_NET_TYP_LEN);
  }

  /**
   * Update Pol6RetIndDedNetTyp with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetIndDedNetTyp(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndDedNetTyp + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetIndvDedCaroCd
   *
   * @return pol6RetIndvDedCaroCd
   */
  public char[] getPol6RetIndvDedCaroCd() throws CFException {
    if (isPol6RetIndvDedCaroCdModified()) {
      pol6RetIndvDedCaroCd = refreshPol6RetIndvDedCaroCd();
    }
    return pol6RetIndvDedCaroCd;
  }

  /**
   * set variable pol6RetIndvDedCaroCd Corresponding COBOL Variable is POL6-RET-INDV-DED-CARO-CD
   *
   * @param value
   */
  public void setPol6RetIndvDedCaroCd(char[] value) {
    pol6RetIndvDedCaroCd = checkPol6RetIndvDedCaroCdConstraints(value);
    serializePol6RetIndvDedCaroCd(pol6RetIndvDedCaroCd);
  }

  /**
   * Update Pol6RetIndvDedCaroCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetIndvDedCaroCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetIndvDedCaroCd, pol6RetIndvDedCaroCd.length);
  }

  public void setPol6RetIndvDedCaroCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndvDedCaroCd, pol6RetIndvDedCaroCd.length);
  }

  /**
   * Update Pol6RetIndvDedCaroCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetIndvDedCaroCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndvDedCaroCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetIndvDedCaroCd with another Field
   *
   * @param value
   */
  public void setPol6RetIndvDedCaroCd(Field source) {
    replace(source, 0, source.length(), beginPol6RetIndvDedCaroCd, POL_6_RET_INDV_DED_CARO_CD_LEN);
  }

  /**
   * Update Pol6RetIndvDedCaroCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetIndvDedCaroCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetIndvDedCaroCd, POL_6_RET_INDV_DED_CARO_CD_LEN);
  }

  /**
   * Update Pol6RetIndvDedCaroCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol6RetIndvDedCaroCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetIndvDedCaroCd + targetIndex, targetLen);
  }

  /**
   * initializes Pol6RetIndvData String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol6RetIndDedDesc(CONSTANTS.SPACE_6);
    setPol6RetIndDedNetTyp(CONSTANTS.SPACE);
    setPol6RetIndvDedCaroCd(CONSTANTS.SPACE);
  }

  public static int getPol6RetIndvDataFieldLength() {
    return POL_6_RET_INDV_DATA_LENGTH;
  }
}
