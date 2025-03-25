package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiReqFilters is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiReqFilters extends BhiReqFiltersSerialized {

  private char[] bhiReqFiltTbl = Field.fillLowValue(6);

  private char[] bhiReqFiltStsCd = Field.fillLowValue(1);

  /** Constructor for BhiReqFilters */
  public BhiReqFilters() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqFilters. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqFilters(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiReqFiltTbl
   *
   * @return bhiReqFiltTbl
   */
  public char[] getBhiReqFiltTbl() throws CFException {
    if (isBhiReqFiltTblModified()) {
      bhiReqFiltTbl = refreshBhiReqFiltTbl();
    }
    return bhiReqFiltTbl;
  }

  /**
   * set variable bhiReqFiltTbl Corresponding COBOL Variable is BHI-REQ-FILT-TBL
   *
   * @param value
   */
  public void setBhiReqFiltTbl(char[] value) {
    bhiReqFiltTbl = checkBhiReqFiltTblConstraints(value);
    serializeBhiReqFiltTbl(bhiReqFiltTbl);
  }

  /**
   * Update BhiReqFiltTbl with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltTbl(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqFiltTbl, bhiReqFiltTbl.length);
  }

  public void setBhiReqFiltTbl(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltTbl, bhiReqFiltTbl.length);
  }

  /**
   * Update BhiReqFiltTbl with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltTbl(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltTbl + targetIndex, targetLen);
  }

  /**
   * Update BhiReqFiltTbl with another Field
   *
   * @param value
   */
  public void setBhiReqFiltTbl(Field source) {
    replace(source, 0, source.length(), beginBhiReqFiltTbl, BHI_REQ_FILT_TBL_LEN);
  }

  /**
   * Update BhiReqFiltTbl with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltTbl(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltTbl, BHI_REQ_FILT_TBL_LEN);
  }

  /**
   * Update BhiReqFiltTbl with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltTbl(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltTbl + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqFiltStsCd
   *
   * @return bhiReqFiltStsCd
   */
  public char[] getBhiReqFiltStsCd() throws CFException {
    if (isBhiReqFiltStsCdModified()) {
      bhiReqFiltStsCd = refreshBhiReqFiltStsCd();
    }
    return bhiReqFiltStsCd;
  }

  /**
   * set variable bhiReqFiltStsCd Corresponding COBOL Variable is BHI-REQ-FILT-STS-CD
   *
   * @param value
   */
  public void setBhiReqFiltStsCd(char[] value) {
    bhiReqFiltStsCd = checkBhiReqFiltStsCdConstraints(value);
    serializeBhiReqFiltStsCd(bhiReqFiltStsCd);
  }

  /**
   * Update BhiReqFiltStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqFiltStsCd, bhiReqFiltStsCd.length);
  }

  public void setBhiReqFiltStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltStsCd, bhiReqFiltStsCd.length);
  }

  /**
   * Update BhiReqFiltStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltStsCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqFiltStsCd with another Field
   *
   * @param value
   */
  public void setBhiReqFiltStsCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqFiltStsCd, BHI_REQ_FILT_STS_CD_LEN);
  }

  /**
   * Update BhiReqFiltStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltStsCd, BHI_REQ_FILT_STS_CD_LEN);
  }

  /**
   * Update BhiReqFiltStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqFiltStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqFiltStsCd + targetIndex, targetLen);
  }

  public static int getBhiReqFiltersFieldLength() {
    return BHI_REQ_FILTERS_LENGTH;
  }
}
