package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnMstrSviInfo is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclpolPlnMstrSviInfo extends DclpolPlnMstrSviInfoSerialized {

  private char[] dsviPolNbr = Field.fillLowValue(6);

  private char[] dsviPlnNbr = Field.fillLowValue(4);

  private char[] dsviClssNbr = Field.fillLowValue(4);

  private char[] dsviCovTypCd = Field.fillLowValue(1);

  /** Constructor for DclpolPlnMstrSviInfo */
  public DclpolPlnMstrSviInfo() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dsviPolNbr
   *
   * @return dsviPolNbr
   */
  public char[] getDsviPolNbr() throws CFException {
    if (isDsviPolNbrModified()) {
      dsviPolNbr = refreshDsviPolNbr();
    }
    return dsviPolNbr;
  }

  /**
   * set variable dsviPolNbr Corresponding COBOL Variable is DSVI-POL-NBR
   *
   * @param value
   */
  public void setDsviPolNbr(char[] value) {
    dsviPolNbr = checkDsviPolNbrConstraints(value);
    serializeDsviPolNbr(dsviPolNbr);
  }

  /**
   * Update DsviPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDsviPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDsviPolNbr, dsviPolNbr.length);
  }

  public void setDsviPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPolNbr, dsviPolNbr.length);
  }

  /**
   * Update DsviPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPolNbr + targetIndex, targetLen);
  }

  /**
   * Update DsviPolNbr with another Field
   *
   * @param value
   */
  public void setDsviPolNbr(Field source) {
    replace(source, 0, source.length(), beginDsviPolNbr, DSVI_POL_NBR_LEN);
  }

  /**
   * Update DsviPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDsviPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPolNbr, DSVI_POL_NBR_LEN);
  }

  /**
   * Update DsviPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dsviPlnNbr
   *
   * @return dsviPlnNbr
   */
  public char[] getDsviPlnNbr() throws CFException {
    if (isDsviPlnNbrModified()) {
      dsviPlnNbr = refreshDsviPlnNbr();
    }
    return dsviPlnNbr;
  }

  /**
   * set variable dsviPlnNbr Corresponding COBOL Variable is DSVI-PLN-NBR
   *
   * @param value
   */
  public void setDsviPlnNbr(char[] value) {
    dsviPlnNbr = checkDsviPlnNbrConstraints(value);
    serializeDsviPlnNbr(dsviPlnNbr);
  }

  /**
   * Update DsviPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDsviPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDsviPlnNbr, dsviPlnNbr.length);
  }

  public void setDsviPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPlnNbr, dsviPlnNbr.length);
  }

  /**
   * Update DsviPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DsviPlnNbr with another Field
   *
   * @param value
   */
  public void setDsviPlnNbr(Field source) {
    replace(source, 0, source.length(), beginDsviPlnNbr, DSVI_PLN_NBR_LEN);
  }

  /**
   * Update DsviPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDsviPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPlnNbr, DSVI_PLN_NBR_LEN);
  }

  /**
   * Update DsviPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dsviClssNbr
   *
   * @return dsviClssNbr
   */
  public char[] getDsviClssNbr() throws CFException {
    if (isDsviClssNbrModified()) {
      dsviClssNbr = refreshDsviClssNbr();
    }
    return dsviClssNbr;
  }

  /**
   * set variable dsviClssNbr Corresponding COBOL Variable is DSVI-CLSS-NBR
   *
   * @param value
   */
  public void setDsviClssNbr(char[] value) {
    dsviClssNbr = checkDsviClssNbrConstraints(value);
    serializeDsviClssNbr(dsviClssNbr);
  }

  /**
   * Update DsviClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDsviClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDsviClssNbr, dsviClssNbr.length);
  }

  public void setDsviClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviClssNbr, dsviClssNbr.length);
  }

  /**
   * Update DsviClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DsviClssNbr with another Field
   *
   * @param value
   */
  public void setDsviClssNbr(Field source) {
    replace(source, 0, source.length(), beginDsviClssNbr, DSVI_CLSS_NBR_LEN);
  }

  /**
   * Update DsviClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDsviClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviClssNbr, DSVI_CLSS_NBR_LEN);
  }

  /**
   * Update DsviClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dsviCovTypCd
   *
   * @return dsviCovTypCd
   */
  public char[] getDsviCovTypCd() throws CFException {
    if (isDsviCovTypCdModified()) {
      dsviCovTypCd = refreshDsviCovTypCd();
    }
    return dsviCovTypCd;
  }

  /**
   * set variable dsviCovTypCd Corresponding COBOL Variable is DSVI-COV-TYP-CD
   *
   * @param value
   */
  public void setDsviCovTypCd(char[] value) {
    dsviCovTypCd = checkDsviCovTypCdConstraints(value);
    serializeDsviCovTypCd(dsviCovTypCd);
  }

  /**
   * Update DsviCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDsviCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDsviCovTypCd, dsviCovTypCd.length);
  }

  public void setDsviCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviCovTypCd, dsviCovTypCd.length);
  }

  /**
   * Update DsviCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update DsviCovTypCd with another Field
   *
   * @param value
   */
  public void setDsviCovTypCd(Field source) {
    replace(source, 0, source.length(), beginDsviCovTypCd, DSVI_COV_TYP_CD_LEN);
  }

  /**
   * Update DsviCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDsviCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDsviCovTypCd, DSVI_COV_TYP_CD_LEN);
  }

  /**
   * Update DsviCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsviCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDsviCovTypCd + targetIndex, targetLen);
  }

  public static int getDclpolPlnMstrSviInfoFieldLength() {
    return DCLPOL_PLN_MSTR_SVI_INFO_LENGTH;
  }
}
