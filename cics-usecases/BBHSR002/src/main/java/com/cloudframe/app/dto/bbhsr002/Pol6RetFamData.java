package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol6RetFamData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class Pol6RetFamData extends Pol6RetFamDataSerialized {

  private char[] pol6RetFamDedDesc = Field.fillLowValue(6);

  private char[] pol6RetFamDedCaroCd = Field.fillLowValue(1);

  /** Constructor for Pol6RetFamData */
  public Pol6RetFamData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol6RetFamData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol6RetFamData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol6RetFamDedDesc
   *
   * @return pol6RetFamDedDesc
   */
  public char[] getPol6RetFamDedDesc() throws CFException {
    if (isPol6RetFamDedDescModified()) {
      pol6RetFamDedDesc = refreshPol6RetFamDedDesc();
    }
    return pol6RetFamDedDesc;
  }

  /**
   * set variable pol6RetFamDedDesc Corresponding COBOL Variable is POL6-RET-FAM-DED-DESC
   *
   * @param value
   */
  public void setPol6RetFamDedDesc(char[] value) {
    pol6RetFamDedDesc = checkPol6RetFamDedDescConstraints(value);
    serializePol6RetFamDedDesc(pol6RetFamDedDesc);
  }

  /**
   * Update Pol6RetFamDedDesc with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedDesc(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol6RetFamDedDesc, pol6RetFamDedDesc.length);
  }

  public void setPol6RetFamDedDesc(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetFamDedDesc, pol6RetFamDedDesc.length);
  }

  /**
   * Update Pol6RetFamDedDesc with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedDesc(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetFamDedDesc + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetFamDedDesc with another Field
   *
   * @param value
   */
  public void setPol6RetFamDedDesc(Field source) {
    replace(source, 0, source.length(), beginPol6RetFamDedDesc, POL_6_RET_FAM_DED_DESC_LEN);
  }

  /**
   * Update Pol6RetFamDedDesc with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedDesc(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetFamDedDesc, POL_6_RET_FAM_DED_DESC_LEN);
  }

  /**
   * Update Pol6RetFamDedDesc with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedDesc(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetFamDedDesc + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol6RetFamDedCaroCd
   *
   * @return pol6RetFamDedCaroCd
   */
  public char[] getPol6RetFamDedCaroCd() throws CFException {
    if (isPol6RetFamDedCaroCdModified()) {
      pol6RetFamDedCaroCd = refreshPol6RetFamDedCaroCd();
    }
    return pol6RetFamDedCaroCd;
  }

  /**
   * set variable pol6RetFamDedCaroCd Corresponding COBOL Variable is POL6-RET-FAM-DED-CARO-CD
   *
   * @param value
   */
  public void setPol6RetFamDedCaroCd(char[] value) {
    pol6RetFamDedCaroCd = checkPol6RetFamDedCaroCdConstraints(value);
    serializePol6RetFamDedCaroCd(pol6RetFamDedCaroCd);
  }

  /**
   * Update Pol6RetFamDedCaroCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedCaroCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol6RetFamDedCaroCd, pol6RetFamDedCaroCd.length);
  }

  public void setPol6RetFamDedCaroCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetFamDedCaroCd, pol6RetFamDedCaroCd.length);
  }

  /**
   * Update Pol6RetFamDedCaroCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedCaroCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetFamDedCaroCd + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetFamDedCaroCd with another Field
   *
   * @param value
   */
  public void setPol6RetFamDedCaroCd(Field source) {
    replace(source, 0, source.length(), beginPol6RetFamDedCaroCd, POL_6_RET_FAM_DED_CARO_CD_LEN);
  }

  /**
   * Update Pol6RetFamDedCaroCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedCaroCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol6RetFamDedCaroCd, POL_6_RET_FAM_DED_CARO_CD_LEN);
  }

  /**
   * Update Pol6RetFamDedCaroCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetFamDedCaroCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol6RetFamDedCaroCd + targetIndex, targetLen);
  }

  /**
   * initializes Pol6RetFamData String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol6RetFamDedDesc(CONSTANTS.SPACE_6);
    setPol6RetFamDedCaroCd(CONSTANTS.SPACE);
  }

  public static int getPol6RetFamDataFieldLength() {
    return POL_6_RET_FAM_DATA_LENGTH;
  }
}
