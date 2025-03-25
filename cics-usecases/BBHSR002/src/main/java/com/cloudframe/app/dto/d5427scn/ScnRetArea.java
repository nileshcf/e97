package com.cloudframe.app.dto.d5427scn;

/**
 * The class ScnRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class ScnRetArea extends ScnRetAreaSerialized {

  private char[] scnRetSrvcCdNbr = Field.fillLowValue(3);

  /** Constructor for ScnRetArea */
  public ScnRetArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ScnRetArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ScnRetArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of scnRetSrvcCdNbr
   *
   * @return scnRetSrvcCdNbr
   */
  public char[] getScnRetSrvcCdNbr() throws CFException {
    if (isScnRetSrvcCdNbrModified()) {
      scnRetSrvcCdNbr = refreshScnRetSrvcCdNbr();
    }
    return scnRetSrvcCdNbr;
  }

  /**
   * set variable scnRetSrvcCdNbr Corresponding COBOL Variable is SCN-RET-SRVC-CD-NBR
   *
   * @param value
   */
  public void setScnRetSrvcCdNbr(char[] value) {
    scnRetSrvcCdNbr = checkScnRetSrvcCdNbrConstraints(value);
    serializeScnRetSrvcCdNbr(scnRetSrvcCdNbr);
  }

  /**
   * Update ScnRetSrvcCdNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setScnRetSrvcCdNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginScnRetSrvcCdNbr, scnRetSrvcCdNbr.length);
  }

  public void setScnRetSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnRetSrvcCdNbr, scnRetSrvcCdNbr.length);
  }

  /**
   * Update ScnRetSrvcCdNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnRetSrvcCdNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnRetSrvcCdNbr + targetIndex, targetLen);
  }

  /**
   * Update ScnRetSrvcCdNbr with another Field
   *
   * @param value
   */
  public void setScnRetSrvcCdNbr(Field source) {
    replace(source, 0, source.length(), beginScnRetSrvcCdNbr, SCN_RET_SRVC_CD_NBR_LEN);
  }

  /**
   * Update ScnRetSrvcCdNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setScnRetSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginScnRetSrvcCdNbr, SCN_RET_SRVC_CD_NBR_LEN);
  }

  /**
   * Update ScnRetSrvcCdNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnRetSrvcCdNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginScnRetSrvcCdNbr + targetIndex, targetLen);
  }

  /**
   * initializes ScnRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setScnRetSrvcCdNbr(CONSTANTS.SPACE_3);
  }

  public static int getScnRetAreaFieldLength() {
    return SCN_RET_AREA_LENGTH;
  }
}
