package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstrPhysMedcn is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclpolPlnMstrPhysMedcn extends DclpolPlnMstrPhysMedcnSerialized {

  private char[] dcpmTrpyTypCd = Field.fillLowValue(1);

  private char[] dcpmTrpyCtgyCd = Field.fillLowValue(2);

  private short dcpmTrpyBenLmtParCnt;

  private char[] dcpmNtwkStsParCd = Field.fillLowValue(1);

  private short dcpmTrpyBenLmtNparCnt;

  private char[] dcpmNtwkStsNparCd = Field.fillLowValue(1);

  /** Constructor for DclpolPlnMstrPhysMedcn */
  public DclpolPlnMstrPhysMedcn() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dcpmTrpyTypCd
   *
   * @return dcpmTrpyTypCd
   */
  public char[] getDcpmTrpyTypCd() throws CFException {
    if (isDcpmTrpyTypCdModified()) {
      dcpmTrpyTypCd = refreshDcpmTrpyTypCd();
    }
    return dcpmTrpyTypCd;
  }

  /**
   * set variable dcpmTrpyTypCd Corresponding COBOL Variable is DCPM-TRPY-TYP-CD
   *
   * @param value
   */
  public void setDcpmTrpyTypCd(char[] value) {
    dcpmTrpyTypCd = checkDcpmTrpyTypCdConstraints(value);
    serializeDcpmTrpyTypCd(dcpmTrpyTypCd);
  }

  /**
   * Update DcpmTrpyTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDcpmTrpyTypCd, dcpmTrpyTypCd.length);
  }

  public void setDcpmTrpyTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyTypCd, dcpmTrpyTypCd.length);
  }

  /**
   * Update DcpmTrpyTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyTypCd + targetIndex, targetLen);
  }

  /**
   * Update DcpmTrpyTypCd with another Field
   *
   * @param value
   */
  public void setDcpmTrpyTypCd(Field source) {
    replace(source, 0, source.length(), beginDcpmTrpyTypCd, DCPM_TRPY_TYP_CD_LEN);
  }

  /**
   * Update DcpmTrpyTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyTypCd, DCPM_TRPY_TYP_CD_LEN);
  }

  /**
   * Update DcpmTrpyTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dcpmTrpyCtgyCd
   *
   * @return dcpmTrpyCtgyCd
   */
  public char[] getDcpmTrpyCtgyCd() throws CFException {
    if (isDcpmTrpyCtgyCdModified()) {
      dcpmTrpyCtgyCd = refreshDcpmTrpyCtgyCd();
    }
    return dcpmTrpyCtgyCd;
  }

  /**
   * set variable dcpmTrpyCtgyCd Corresponding COBOL Variable is DCPM-TRPY-CTGY-CD
   *
   * @param value
   */
  public void setDcpmTrpyCtgyCd(char[] value) {
    dcpmTrpyCtgyCd = checkDcpmTrpyCtgyCdConstraints(value);
    serializeDcpmTrpyCtgyCd(dcpmTrpyCtgyCd);
  }

  /**
   * Update DcpmTrpyCtgyCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyCtgyCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDcpmTrpyCtgyCd, dcpmTrpyCtgyCd.length);
  }

  public void setDcpmTrpyCtgyCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyCtgyCd, dcpmTrpyCtgyCd.length);
  }

  /**
   * Update DcpmTrpyCtgyCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyCtgyCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyCtgyCd + targetIndex, targetLen);
  }

  /**
   * Update DcpmTrpyCtgyCd with another Field
   *
   * @param value
   */
  public void setDcpmTrpyCtgyCd(Field source) {
    replace(source, 0, source.length(), beginDcpmTrpyCtgyCd, DCPM_TRPY_CTGY_CD_LEN);
  }

  /**
   * Update DcpmTrpyCtgyCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyCtgyCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyCtgyCd, DCPM_TRPY_CTGY_CD_LEN);
  }

  /**
   * Update DcpmTrpyCtgyCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmTrpyCtgyCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmTrpyCtgyCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dcpmTrpyBenLmtParCnt
   *
   * @return dcpmTrpyBenLmtParCnt
   */
  public short getDcpmTrpyBenLmtParCnt() throws CFException {
    if (isDcpmTrpyBenLmtParCntModified()) {
      dcpmTrpyBenLmtParCnt = refreshDcpmTrpyBenLmtParCnt();
    }
    return dcpmTrpyBenLmtParCnt;
  }

  /**
   * Update DcpmTrpyBenLmtParCnt with the passed value Corresponding COBOL Variable is
   * DCPM-TRPY-BEN-LMT-PAR-CNT
   *
   * @param number
   */
  public void setDcpmTrpyBenLmtParCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    dcpmTrpyBenLmtParCnt = checkDcpmTrpyBenLmtParCntMaxLimit(number);
    serializeDcpmTrpyBenLmtParCnt(dcpmTrpyBenLmtParCnt);
  }

  public void setDcpmTrpyBenLmtParCnt(int number) {
    number =
        checkDcpmTrpyBenLmtParCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setDcpmTrpyBenLmtParCnt((short) number);
  }

  public void setDcpmTrpyBenLmtParCnt(long number) {
    number =
        checkDcpmTrpyBenLmtParCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setDcpmTrpyBenLmtParCnt((short) number);
  }

  /**
   * Returns the value of dcpmNtwkStsParCd
   *
   * @return dcpmNtwkStsParCd
   */
  public char[] getDcpmNtwkStsParCd() throws CFException {
    if (isDcpmNtwkStsParCdModified()) {
      dcpmNtwkStsParCd = refreshDcpmNtwkStsParCd();
    }
    return dcpmNtwkStsParCd;
  }

  /**
   * set variable dcpmNtwkStsParCd Corresponding COBOL Variable is DCPM-NTWK-STS-PAR-CD
   *
   * @param value
   */
  public void setDcpmNtwkStsParCd(char[] value) {
    dcpmNtwkStsParCd = checkDcpmNtwkStsParCdConstraints(value);
    serializeDcpmNtwkStsParCd(dcpmNtwkStsParCd);
  }

  /**
   * Update DcpmNtwkStsParCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsParCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDcpmNtwkStsParCd, dcpmNtwkStsParCd.length);
  }

  public void setDcpmNtwkStsParCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsParCd, dcpmNtwkStsParCd.length);
  }

  /**
   * Update DcpmNtwkStsParCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsParCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsParCd + targetIndex, targetLen);
  }

  /**
   * Update DcpmNtwkStsParCd with another Field
   *
   * @param value
   */
  public void setDcpmNtwkStsParCd(Field source) {
    replace(source, 0, source.length(), beginDcpmNtwkStsParCd, DCPM_NTWK_STS_PAR_CD_LEN);
  }

  /**
   * Update DcpmNtwkStsParCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsParCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsParCd, DCPM_NTWK_STS_PAR_CD_LEN);
  }

  /**
   * Update DcpmNtwkStsParCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsParCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsParCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dcpmTrpyBenLmtNparCnt
   *
   * @return dcpmTrpyBenLmtNparCnt
   */
  public short getDcpmTrpyBenLmtNparCnt() throws CFException {
    if (isDcpmTrpyBenLmtNparCntModified()) {
      dcpmTrpyBenLmtNparCnt = refreshDcpmTrpyBenLmtNparCnt();
    }
    return dcpmTrpyBenLmtNparCnt;
  }

  /**
   * Update DcpmTrpyBenLmtNparCnt with the passed value Corresponding COBOL Variable is
   * DCPM-TRPY-BEN-LMT-NPAR-CNT
   *
   * @param number
   */
  public void setDcpmTrpyBenLmtNparCnt(short number) {
    // Truncate if the number is beyond +/- Max range
    dcpmTrpyBenLmtNparCnt = checkDcpmTrpyBenLmtNparCntMaxLimit(number);
    serializeDcpmTrpyBenLmtNparCnt(dcpmTrpyBenLmtNparCnt);
  }

  public void setDcpmTrpyBenLmtNparCnt(int number) {
    number =
        checkDcpmTrpyBenLmtNparCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setDcpmTrpyBenLmtNparCnt((short) number);
  }

  public void setDcpmTrpyBenLmtNparCnt(long number) {
    number =
        checkDcpmTrpyBenLmtNparCntMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setDcpmTrpyBenLmtNparCnt((short) number);
  }

  /**
   * Returns the value of dcpmNtwkStsNparCd
   *
   * @return dcpmNtwkStsNparCd
   */
  public char[] getDcpmNtwkStsNparCd() throws CFException {
    if (isDcpmNtwkStsNparCdModified()) {
      dcpmNtwkStsNparCd = refreshDcpmNtwkStsNparCd();
    }
    return dcpmNtwkStsNparCd;
  }

  /**
   * set variable dcpmNtwkStsNparCd Corresponding COBOL Variable is DCPM-NTWK-STS-NPAR-CD
   *
   * @param value
   */
  public void setDcpmNtwkStsNparCd(char[] value) {
    dcpmNtwkStsNparCd = checkDcpmNtwkStsNparCdConstraints(value);
    serializeDcpmNtwkStsNparCd(dcpmNtwkStsNparCd);
  }

  /**
   * Update DcpmNtwkStsNparCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsNparCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDcpmNtwkStsNparCd, dcpmNtwkStsNparCd.length);
  }

  public void setDcpmNtwkStsNparCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsNparCd, dcpmNtwkStsNparCd.length);
  }

  /**
   * Update DcpmNtwkStsNparCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsNparCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsNparCd + targetIndex, targetLen);
  }

  /**
   * Update DcpmNtwkStsNparCd with another Field
   *
   * @param value
   */
  public void setDcpmNtwkStsNparCd(Field source) {
    replace(source, 0, source.length(), beginDcpmNtwkStsNparCd, DCPM_NTWK_STS_NPAR_CD_LEN);
  }

  /**
   * Update DcpmNtwkStsNparCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsNparCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsNparCd, DCPM_NTWK_STS_NPAR_CD_LEN);
  }

  /**
   * Update DcpmNtwkStsNparCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDcpmNtwkStsNparCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDcpmNtwkStsNparCd + targetIndex, targetLen);
  }

  public static int getDclpolPlnMstrPhysMedcnFieldLength() {
    return DCLPOL_PLN_MSTR_PHYS_MEDCN_LENGTH;
  }
}
