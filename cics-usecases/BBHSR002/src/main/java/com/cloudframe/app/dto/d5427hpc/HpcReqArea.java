package com.cloudframe.app.dto.d5427hpc;

/**
 * The class HpcReqArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class HpcReqArea extends HpcReqAreaSerialized {

  private char[] hpcReqHipaaCd = Field.fillLowValue(2);

  private char[] hpcReqHipaaVerNbr = Field.fillLowValue(1);

  private char[] hpcReqClngProg = Field.fillLowValue(8);

  /** Constructor for HpcReqArea */
  public HpcReqArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HpcReqArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HpcReqArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hpcReqHipaaCd
   *
   * @return hpcReqHipaaCd
   */
  public char[] getHpcReqHipaaCd() throws CFException {
    if (isHpcReqHipaaCdModified()) {
      hpcReqHipaaCd = refreshHpcReqHipaaCd();
    }
    return hpcReqHipaaCd;
  }

  /**
   * set variable hpcReqHipaaCd Corresponding COBOL Variable is HPC-REQ-HIPAA-CD
   *
   * @param value
   */
  public void setHpcReqHipaaCd(char[] value) {
    hpcReqHipaaCd = checkHpcReqHipaaCdConstraints(value);
    serializeHpcReqHipaaCd(hpcReqHipaaCd);
  }

  /**
   * Update HpcReqHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHpcReqHipaaCd, hpcReqHipaaCd.length);
  }

  public void setHpcReqHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaCd, hpcReqHipaaCd.length);
  }

  /**
   * Update HpcReqHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update HpcReqHipaaCd with another Field
   *
   * @param value
   */
  public void setHpcReqHipaaCd(Field source) {
    replace(source, 0, source.length(), beginHpcReqHipaaCd, HPC_REQ_HIPAA_CD_LEN);
  }

  /**
   * Update HpcReqHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaCd, HPC_REQ_HIPAA_CD_LEN);
  }

  /**
   * Update HpcReqHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hpcReqHipaaVerNbr
   *
   * @return hpcReqHipaaVerNbr
   */
  public char[] getHpcReqHipaaVerNbr() throws CFException {
    if (isHpcReqHipaaVerNbrModified()) {
      hpcReqHipaaVerNbr = refreshHpcReqHipaaVerNbr();
    }
    return hpcReqHipaaVerNbr;
  }

  /**
   * set variable hpcReqHipaaVerNbr Corresponding COBOL Variable is HPC-REQ-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setHpcReqHipaaVerNbr(char[] value) {
    hpcReqHipaaVerNbr = checkHpcReqHipaaVerNbrConstraints(value);
    serializeHpcReqHipaaVerNbr(hpcReqHipaaVerNbr);
  }

  /**
   * Update HpcReqHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHpcReqHipaaVerNbr, hpcReqHipaaVerNbr.length);
  }

  public void setHpcReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaVerNbr, hpcReqHipaaVerNbr.length);
  }

  /**
   * Update HpcReqHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update HpcReqHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setHpcReqHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginHpcReqHipaaVerNbr, HPC_REQ_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update HpcReqHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaVerNbr, HPC_REQ_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update HpcReqHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of hpcReqClngProg
   *
   * @return hpcReqClngProg
   */
  public char[] getHpcReqClngProg() throws CFException {
    if (isHpcReqClngProgModified()) {
      hpcReqClngProg = refreshHpcReqClngProg();
    }
    return hpcReqClngProg;
  }

  /**
   * set variable hpcReqClngProg Corresponding COBOL Variable is HPC-REQ-CLNG-PROG
   *
   * @param value
   */
  public void setHpcReqClngProg(char[] value) {
    hpcReqClngProg = checkHpcReqClngProgConstraints(value);
    serializeHpcReqClngProg(hpcReqClngProg);
  }

  /**
   * Update HpcReqClngProg with a char[] from an offset and length
   *
   * @param value
   */
  public void setHpcReqClngProg(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHpcReqClngProg, hpcReqClngProg.length);
  }

  public void setHpcReqClngProg(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqClngProg, hpcReqClngProg.length);
  }

  /**
   * Update HpcReqClngProg with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqClngProg(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqClngProg + targetIndex, targetLen);
  }

  /**
   * Update HpcReqClngProg with another Field
   *
   * @param value
   */
  public void setHpcReqClngProg(Field source) {
    replace(source, 0, source.length(), beginHpcReqClngProg, HPC_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update HpcReqClngProg with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcReqClngProg(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqClngProg, HPC_REQ_CLNG_PROG_LEN);
  }

  /**
   * Update HpcReqClngProg with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqClngProg(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHpcReqClngProg + targetIndex, targetLen);
  }

  public static int getHpcReqAreaFieldLength() {
    return HPC_REQ_AREA_LENGTH;
  }
}
