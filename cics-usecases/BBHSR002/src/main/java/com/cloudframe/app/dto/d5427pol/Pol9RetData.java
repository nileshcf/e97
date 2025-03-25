package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol9RetData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class Pol9RetData extends Pol9RetDataSerialized {

  private char[] pol9RetTrpyTypCd = Field.fillLowValue(3);

  private char[] pol9RetTrpyCtgyCd = Field.fillLowValue(3);

  private int pol9RetTrpyBenLmtParCnt;

  private char[] pol9RetNtwkStsParCd = Field.fillLowValue(3);

  private int pol9RetTrpyBenLmtNparCnt;

  private char[] pol9RetNtwkStsNparCd = Field.fillLowValue(3);

  /** Constructor for Pol9RetData */
  public Pol9RetData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol9RetData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol9RetData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol9RetTrpyTypCd
   *
   * @return pol9RetTrpyTypCd
   */
  public char[] getPol9RetTrpyTypCd() throws CFException {
    if (isPol9RetTrpyTypCdModified()) {
      pol9RetTrpyTypCd = refreshPol9RetTrpyTypCd();
    }
    return pol9RetTrpyTypCd;
  }

  /**
   * set variable pol9RetTrpyTypCd Corresponding COBOL Variable is POL9-RET-TRPY-TYP-CD
   *
   * @param value
   */
  public void setPol9RetTrpyTypCd(char[] value) {
    pol9RetTrpyTypCd = checkPol9RetTrpyTypCdConstraints(value);
    serializePol9RetTrpyTypCd(pol9RetTrpyTypCd);
  }

  /**
   * Update Pol9RetTrpyTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol9RetTrpyTypCd, pol9RetTrpyTypCd.length);
  }

  public void setPol9RetTrpyTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyTypCd, pol9RetTrpyTypCd.length);
  }

  /**
   * Update Pol9RetTrpyTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyTypCd + targetIndex, targetLen);
  }

  /**
   * Update Pol9RetTrpyTypCd with another Field
   *
   * @param value
   */
  public void setPol9RetTrpyTypCd(Field source) {
    replace(source, 0, source.length(), beginPol9RetTrpyTypCd, POL_9_RET_TRPY_TYP_CD_LEN);
  }

  /**
   * Update Pol9RetTrpyTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyTypCd, POL_9_RET_TRPY_TYP_CD_LEN);
  }

  /**
   * Update Pol9RetTrpyTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol9RetTrpyCtgyCd
   *
   * @return pol9RetTrpyCtgyCd
   */
  public char[] getPol9RetTrpyCtgyCd() throws CFException {
    if (isPol9RetTrpyCtgyCdModified()) {
      pol9RetTrpyCtgyCd = refreshPol9RetTrpyCtgyCd();
    }
    return pol9RetTrpyCtgyCd;
  }

  /**
   * set variable pol9RetTrpyCtgyCd Corresponding COBOL Variable is POL9-RET-TRPY-CTGY-CD
   *
   * @param value
   */
  public void setPol9RetTrpyCtgyCd(char[] value) {
    pol9RetTrpyCtgyCd = checkPol9RetTrpyCtgyCdConstraints(value);
    serializePol9RetTrpyCtgyCd(pol9RetTrpyCtgyCd);
  }

  /**
   * Update Pol9RetTrpyCtgyCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyCtgyCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol9RetTrpyCtgyCd, pol9RetTrpyCtgyCd.length);
  }

  public void setPol9RetTrpyCtgyCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyCtgyCd, pol9RetTrpyCtgyCd.length);
  }

  /**
   * Update Pol9RetTrpyCtgyCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyCtgyCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyCtgyCd + targetIndex, targetLen);
  }

  /**
   * Update Pol9RetTrpyCtgyCd with another Field
   *
   * @param value
   */
  public void setPol9RetTrpyCtgyCd(Field source) {
    replace(source, 0, source.length(), beginPol9RetTrpyCtgyCd, POL_9_RET_TRPY_CTGY_CD_LEN);
  }

  /**
   * Update Pol9RetTrpyCtgyCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyCtgyCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyCtgyCd, POL_9_RET_TRPY_CTGY_CD_LEN);
  }

  /**
   * Update Pol9RetTrpyCtgyCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetTrpyCtgyCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetTrpyCtgyCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol9RetTrpyBenLmtParCnt
   *
   * @return pol9RetTrpyBenLmtParCnt
   */
  public int getPol9RetTrpyBenLmtParCnt() throws CFException {
    if (isPol9RetTrpyBenLmtParCntModified()) {
      pol9RetTrpyBenLmtParCnt = refreshPol9RetTrpyBenLmtParCnt();
    }
    return pol9RetTrpyBenLmtParCnt;
  }

  /**
   * Update Pol9RetTrpyBenLmtParCnt with the passed value Corresponding COBOL Variable is
   * POL9-RET-TRPY-BEN-LMT-PAR-CNT
   *
   * @param number
   */
  public void setPol9RetTrpyBenLmtParCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol9RetTrpyBenLmtParCnt = checkPol9RetTrpyBenLmtParCntMaxLimit(number);
    serializePol9RetTrpyBenLmtParCnt(pol9RetTrpyBenLmtParCnt);
  }

  public void setPol9RetTrpyBenLmtParCnt(long number) {
    number =
        checkPol9RetTrpyBenLmtParCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol9RetTrpyBenLmtParCnt((int) number);
  }

  /**
   * Update Pol9RetTrpyBenLmtParCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol9RetTrpyBenLmtParCnt(char[] value) throws CFException {
    pol9RetTrpyBenLmtParCnt = serializePol9RetTrpyBenLmtParCnt(value);
  }
  /**
   * Update Pol9RetTrpyBenLmtParCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol9RetTrpyBenLmtParCntString(char[] value) throws CFException {
    setPol9RetTrpyBenLmtParCnt(value);
  }
  /**
   * Returns the value of pol9RetNtwkStsParCd
   *
   * @return pol9RetNtwkStsParCd
   */
  public char[] getPol9RetNtwkStsParCd() throws CFException {
    if (isPol9RetNtwkStsParCdModified()) {
      pol9RetNtwkStsParCd = refreshPol9RetNtwkStsParCd();
    }
    return pol9RetNtwkStsParCd;
  }

  /**
   * set variable pol9RetNtwkStsParCd Corresponding COBOL Variable is POL9-RET-NTWK-STS-PAR-CD
   *
   * @param value
   */
  public void setPol9RetNtwkStsParCd(char[] value) {
    pol9RetNtwkStsParCd = checkPol9RetNtwkStsParCdConstraints(value);
    serializePol9RetNtwkStsParCd(pol9RetNtwkStsParCd);
  }

  /**
   * Update Pol9RetNtwkStsParCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol9RetNtwkStsParCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol9RetNtwkStsParCd, pol9RetNtwkStsParCd.length);
  }

  public void setPol9RetNtwkStsParCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetNtwkStsParCd, pol9RetNtwkStsParCd.length);
  }

  /**
   * Update Pol9RetNtwkStsParCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetNtwkStsParCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetNtwkStsParCd + targetIndex, targetLen);
  }

  /**
   * Update Pol9RetNtwkStsParCd with another Field
   *
   * @param value
   */
  public void setPol9RetNtwkStsParCd(Field source) {
    replace(source, 0, source.length(), beginPol9RetNtwkStsParCd, POL_9_RET_NTWK_STS_PAR_CD_LEN);
  }

  /**
   * Update Pol9RetNtwkStsParCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol9RetNtwkStsParCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol9RetNtwkStsParCd, POL_9_RET_NTWK_STS_PAR_CD_LEN);
  }

  /**
   * Update Pol9RetNtwkStsParCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetNtwkStsParCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetNtwkStsParCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol9RetTrpyBenLmtNparCnt
   *
   * @return pol9RetTrpyBenLmtNparCnt
   */
  public int getPol9RetTrpyBenLmtNparCnt() throws CFException {
    if (isPol9RetTrpyBenLmtNparCntModified()) {
      pol9RetTrpyBenLmtNparCnt = refreshPol9RetTrpyBenLmtNparCnt();
    }
    return pol9RetTrpyBenLmtNparCnt;
  }

  /**
   * Update Pol9RetTrpyBenLmtNparCnt with the passed value Corresponding COBOL Variable is
   * POL9-RET-TRPY-BEN-LMT-NPAR-CNT
   *
   * @param number
   */
  public void setPol9RetTrpyBenLmtNparCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol9RetTrpyBenLmtNparCnt = checkPol9RetTrpyBenLmtNparCntMaxLimit(number);
    serializePol9RetTrpyBenLmtNparCnt(pol9RetTrpyBenLmtNparCnt);
  }

  public void setPol9RetTrpyBenLmtNparCnt(long number) {
    number =
        checkPol9RetTrpyBenLmtNparCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol9RetTrpyBenLmtNparCnt((int) number);
  }

  /**
   * Update Pol9RetTrpyBenLmtNparCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol9RetTrpyBenLmtNparCnt(char[] value) throws CFException {
    pol9RetTrpyBenLmtNparCnt = serializePol9RetTrpyBenLmtNparCnt(value);
  }
  /**
   * Update Pol9RetTrpyBenLmtNparCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol9RetTrpyBenLmtNparCntString(char[] value) throws CFException {
    setPol9RetTrpyBenLmtNparCnt(value);
  }
  /**
   * Returns the value of pol9RetNtwkStsNparCd
   *
   * @return pol9RetNtwkStsNparCd
   */
  public char[] getPol9RetNtwkStsNparCd() throws CFException {
    if (isPol9RetNtwkStsNparCdModified()) {
      pol9RetNtwkStsNparCd = refreshPol9RetNtwkStsNparCd();
    }
    return pol9RetNtwkStsNparCd;
  }

  /**
   * set variable pol9RetNtwkStsNparCd Corresponding COBOL Variable is POL9-RET-NTWK-STS-NPAR-CD
   *
   * @param value
   */
  public void setPol9RetNtwkStsNparCd(char[] value) {
    pol9RetNtwkStsNparCd = checkPol9RetNtwkStsNparCdConstraints(value);
    serializePol9RetNtwkStsNparCd(pol9RetNtwkStsNparCd);
  }

  /**
   * Update Pol9RetNtwkStsNparCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol9RetNtwkStsNparCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginPol9RetNtwkStsNparCd, pol9RetNtwkStsNparCd.length);
  }

  public void setPol9RetNtwkStsNparCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetNtwkStsNparCd, pol9RetNtwkStsNparCd.length);
  }

  /**
   * Update Pol9RetNtwkStsNparCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetNtwkStsNparCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetNtwkStsNparCd + targetIndex, targetLen);
  }

  /**
   * Update Pol9RetNtwkStsNparCd with another Field
   *
   * @param value
   */
  public void setPol9RetNtwkStsNparCd(Field source) {
    replace(source, 0, source.length(), beginPol9RetNtwkStsNparCd, POL_9_RET_NTWK_STS_NPAR_CD_LEN);
  }

  /**
   * Update Pol9RetNtwkStsNparCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPol9RetNtwkStsNparCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginPol9RetNtwkStsNparCd, POL_9_RET_NTWK_STS_NPAR_CD_LEN);
  }

  /**
   * Update Pol9RetNtwkStsNparCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setPol9RetNtwkStsNparCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol9RetNtwkStsNparCd + targetIndex, targetLen);
  }

  public static int getPol9RetDataFieldLength() {
    return POL_9_RET_DATA_LENGTH;
  }
}
