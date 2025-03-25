package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol7RetArea3 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class Pol7RetArea3 extends Pol7RetArea3Serialized {

  private char[] pol7StdPolNbr = Field.fillLowValue(6);

  private int pol7StdPlnNbr;

  private char[] pol7RetNewOldSrvcInd = Field.fillLowValue(1);

  private char[] pol7RetPolPresentInd = Field.fillLowValue(1);

  /** Constructor for Pol7RetArea3 */
  public Pol7RetArea3() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol7RetArea3. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol7RetArea3(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol7StdPolNbr
   *
   * @return pol7StdPolNbr
   */
  public char[] getPol7StdPolNbr() throws CFException {
    if (isPol7StdPolNbrModified()) {
      pol7StdPolNbr = refreshPol7StdPolNbr();
    }
    return pol7StdPolNbr;
  }

  /**
   * set variable pol7StdPolNbr Corresponding COBOL Variable is POL7-STD-POL-NBR
   *
   * @param value
   */
  public void setPol7StdPolNbr(char[] value) {
    pol7StdPolNbr = checkPol7StdPolNbrConstraints(value);
    serializePol7StdPolNbr(pol7StdPolNbr);
  }

  /**
   * Update Pol7StdPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol7StdPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol7StdPolNbr, pol7StdPolNbr.length);
  }

  public void setPol7StdPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol7StdPolNbr, pol7StdPolNbr.length);
  }

  /**
   * Update Pol7StdPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol7StdPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol7StdPolNbr + targetIndex, targetLen);
  }

  /**
   * Update Pol7StdPolNbr with another Field
   *
   * @param value
   */
  public void setPol7StdPolNbr(Field source) {
    replace(source, 0, source.length(), beginPol7StdPolNbr, POL_7_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol7StdPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPol7StdPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol7StdPolNbr, POL_7_STD_POL_NBR_LEN);
  }

  /**
   * Update Pol7StdPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol7StdPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol7StdPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol7StdPlnNbr
   *
   * @return pol7StdPlnNbr
   */
  public int getPol7StdPlnNbr() throws CFException {
    if (isPol7StdPlnNbrModified()) {
      pol7StdPlnNbr = refreshPol7StdPlnNbr();
    }
    return pol7StdPlnNbr;
  }

  /**
   * Update Pol7StdPlnNbr with the passed value Corresponding COBOL Variable is POL7-STD-PLN-NBR
   *
   * @param number
   */
  public void setPol7StdPlnNbr(int number) {
    // Truncate if the number is beyond +/- Max range
    pol7StdPlnNbr = checkPol7StdPlnNbrMaxLimit(number);
    serializePol7StdPlnNbr(pol7StdPlnNbr);
  }

  public void setPol7StdPlnNbr(long number) {
    number = checkPol7StdPlnNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol7StdPlnNbr((int) number);
  }

  /**
   * Update Pol7StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol7StdPlnNbr(char[] value) throws CFException {
    pol7StdPlnNbr = serializePol7StdPlnNbr(value);
  }
  /**
   * Update Pol7StdPlnNbr with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol7StdPlnNbrString(char[] value) throws CFException {
    setPol7StdPlnNbr(value);
  }
  /**
   * Returns the value of pol7RetNewOldSrvcInd
   *
   * @return pol7RetNewOldSrvcInd
   */
  public char[] getPol7RetNewOldSrvcInd() throws CFException {
    if (isPol7RetNewOldSrvcIndModified()) {
      pol7RetNewOldSrvcInd = refreshPol7RetNewOldSrvcInd();
    }
    return pol7RetNewOldSrvcInd;
  }

  /**
   * set variable pol7RetNewOldSrvcInd Corresponding COBOL Variable is POL7-RET-NEW-OLD-SRVC-IND
   *
   * @param value
   */
  public void setPol7RetNewOldSrvcInd(char[] value) {
    pol7RetNewOldSrvcInd = checkPol7RetNewOldSrvcIndConstraints(value);
    serializePol7RetNewOldSrvcInd(pol7RetNewOldSrvcInd);
  }

  /**
   * Update Pol7RetNewOldSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol7RetNewOldSrvcInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol7RetNewOldSrvcInd, pol7RetNewOldSrvcInd.length);
  }

  public void setPol7RetNewOldSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol7RetNewOldSrvcInd, pol7RetNewOldSrvcInd.length);
  }

  /**
   * Update Pol7RetNewOldSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol7RetNewOldSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol7RetNewOldSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update Pol7RetNewOldSrvcInd with another Field
   *
   * @param value
   */
  public void setPol7RetNewOldSrvcInd(Field source) {
    replace(source, 0, source.length(), beginPol7RetNewOldSrvcInd, POL_7_RET_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update Pol7RetNewOldSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol7RetNewOldSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol7RetNewOldSrvcInd, POL_7_RET_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update Pol7RetNewOldSrvcInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol7RetNewOldSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol7RetNewOldSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol7RetPolPresentInd
   *
   * @return pol7RetPolPresentInd
   */
  public char[] getPol7RetPolPresentInd() throws CFException {
    if (isPol7RetPolPresentIndModified()) {
      pol7RetPolPresentInd = refreshPol7RetPolPresentInd();
    }
    return pol7RetPolPresentInd;
  }

  /**
   * set variable pol7RetPolPresentInd Corresponding COBOL Variable is POL7-RET-POL-PRESENT-IND
   *
   * @param value
   */
  public void setPol7RetPolPresentInd(char[] value) {
    pol7RetPolPresentInd = checkPol7RetPolPresentIndConstraints(value);
    serializePol7RetPolPresentInd(pol7RetPolPresentInd);
  }

  /**
   * Update Pol7RetPolPresentInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol7RetPolPresentInd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol7RetPolPresentInd, pol7RetPolPresentInd.length);
  }

  public void setPol7RetPolPresentInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol7RetPolPresentInd, pol7RetPolPresentInd.length);
  }

  /**
   * Update Pol7RetPolPresentInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol7RetPolPresentInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol7RetPolPresentInd + targetIndex, targetLen);
  }

  /**
   * Update Pol7RetPolPresentInd with another Field
   *
   * @param value
   */
  public void setPol7RetPolPresentInd(Field source) {
    replace(source, 0, source.length(), beginPol7RetPolPresentInd, POL_7_RET_POL_PRESENT_IND_LEN);
  }

  /**
   * Update Pol7RetPolPresentInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol7RetPolPresentInd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol7RetPolPresentInd, POL_7_RET_POL_PRESENT_IND_LEN);
  }

  /**
   * Update Pol7RetPolPresentInd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol7RetPolPresentInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol7RetPolPresentInd + targetIndex, targetLen);
  }

  /**
   * initializes Pol7RetArea3 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol7StdPolNbr(CONSTANTS.SPACE_6);
    setPol7StdPlnNbr(0);
    setPol7RetNewOldSrvcInd(CONSTANTS.SPACE);
    setPol7RetPolPresentInd(CONSTANTS.SPACE);
  }

  public static int getPol7RetArea3FieldLength() {
    return POL_7_RET_AREA_3_LENGTH;
  }
}
