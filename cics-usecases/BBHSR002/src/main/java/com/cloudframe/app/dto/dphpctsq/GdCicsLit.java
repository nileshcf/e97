package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdCicsLit is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdCicsLit extends GdCicsLitSerialized {

  private char[] gdEibtrnid = Field.fillLowValue(4);

  private char[] gdEibtaskn = Field.fillLowValue(8);

  private char[] gdEibdate = Field.fillLowValue(8);

  private char[] gdEibtime = Field.fillLowValue(8);

  private char[] gdDisplayLit = Field.fillLowValue(80);

  /** Constructor for GdCicsLit */
  public GdCicsLit() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdCicsLit. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdCicsLit(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    replaceValue( // serialize and save the value
        fillSpace(1), getStartOffset() + 4, 1);
    replaceValue( // serialize and save the value
        fillSpace(1), getStartOffset() + 13, 1);
    replaceValue( // serialize and save the value
        fillSpace(1), getStartOffset() + 22, 1);
    replaceValue( // serialize and save the value
        fillSpace(1), getStartOffset() + 31, 1);
  }

  /**
   * Returns the value of gdEibtrnid
   *
   * @return gdEibtrnid
   */
  public char[] getGdEibtrnid() throws CFException {
    if (isGdEibtrnidModified()) {
      gdEibtrnid = refreshGdEibtrnid();
    }
    return gdEibtrnid;
  }

  /**
   * set variable gdEibtrnid Corresponding COBOL Variable is GD-EIBTRNID
   *
   * @param value
   */
  public void setGdEibtrnid(char[] value) {
    gdEibtrnid = checkGdEibtrnidConstraints(value);
    serializeGdEibtrnid(gdEibtrnid);
  }

  /**
   * Update GdEibtrnid with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdEibtrnid(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdEibtrnid, gdEibtrnid.length);
  }

  public void setGdEibtrnid(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtrnid, gdEibtrnid.length);
  }

  /**
   * Update GdEibtrnid with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibtrnid(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtrnid + targetIndex, targetLen);
  }

  /**
   * Update GdEibtrnid with another Field
   *
   * @param value
   */
  public void setGdEibtrnid(Field source) {
    replace(source, 0, source.length(), beginGdEibtrnid, GD_EIBTRNID_LEN);
  }

  /**
   * Update GdEibtrnid with another Field from an offset and length
   *
   * @param value
   */
  public void setGdEibtrnid(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtrnid, GD_EIBTRNID_LEN);
  }

  /**
   * Update GdEibtrnid with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibtrnid(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtrnid + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdEibtaskn
   *
   * @return gdEibtaskn
   */
  public char[] getGdEibtaskn() throws CFException {
    if (isGdEibtasknModified()) {
      gdEibtaskn = refreshGdEibtaskn();
    }
    return gdEibtaskn;
  }

  /**
   * set variable gdEibtaskn Corresponding COBOL Variable is GD-EIBTASKN
   *
   * @param value
   */
  public void setGdEibtaskn(char[] value) {
    gdEibtaskn = checkGdEibtasknConstraints(value);
    serializeGdEibtaskn(gdEibtaskn);
  }

  /**
   * Update GdEibtaskn with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdEibtaskn(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdEibtaskn, gdEibtaskn.length);
  }

  public void setGdEibtaskn(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtaskn, gdEibtaskn.length);
  }

  /**
   * Update GdEibtaskn with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibtaskn(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtaskn + targetIndex, targetLen);
  }

  /**
   * Update GdEibtaskn with another Field
   *
   * @param value
   */
  public void setGdEibtaskn(Field source) {
    replace(source, 0, source.length(), beginGdEibtaskn, GD_EIBTASKN_LEN);
  }

  /**
   * Update GdEibtaskn with another Field from an offset and length
   *
   * @param value
   */
  public void setGdEibtaskn(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtaskn, GD_EIBTASKN_LEN);
  }

  /**
   * Update GdEibtaskn with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibtaskn(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtaskn + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdEibdate
   *
   * @return gdEibdate
   */
  public char[] getGdEibdate() throws CFException {
    if (isGdEibdateModified()) {
      gdEibdate = refreshGdEibdate();
    }
    return gdEibdate;
  }

  /**
   * set variable gdEibdate Corresponding COBOL Variable is GD-EIBDATE
   *
   * @param value
   */
  public void setGdEibdate(char[] value) {
    gdEibdate = checkGdEibdateConstraints(value);
    serializeGdEibdate(gdEibdate);
  }

  /**
   * Update GdEibdate with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdEibdate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdEibdate, gdEibdate.length);
  }

  public void setGdEibdate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibdate, gdEibdate.length);
  }

  /**
   * Update GdEibdate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibdate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibdate + targetIndex, targetLen);
  }

  /**
   * Update GdEibdate with another Field
   *
   * @param value
   */
  public void setGdEibdate(Field source) {
    replace(source, 0, source.length(), beginGdEibdate, GD_EIBDATE_LEN);
  }

  /**
   * Update GdEibdate with another Field from an offset and length
   *
   * @param value
   */
  public void setGdEibdate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibdate, GD_EIBDATE_LEN);
  }

  /**
   * Update GdEibdate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibdate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibdate + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdEibtime
   *
   * @return gdEibtime
   */
  public char[] getGdEibtime() throws CFException {
    if (isGdEibtimeModified()) {
      gdEibtime = refreshGdEibtime();
    }
    return gdEibtime;
  }

  /**
   * set variable gdEibtime Corresponding COBOL Variable is GD-EIBTIME
   *
   * @param value
   */
  public void setGdEibtime(char[] value) {
    gdEibtime = checkGdEibtimeConstraints(value);
    serializeGdEibtime(gdEibtime);
  }

  /**
   * Update GdEibtime with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdEibtime(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdEibtime, gdEibtime.length);
  }

  public void setGdEibtime(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtime, gdEibtime.length);
  }

  /**
   * Update GdEibtime with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibtime(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtime + targetIndex, targetLen);
  }

  /**
   * Update GdEibtime with another Field
   *
   * @param value
   */
  public void setGdEibtime(Field source) {
    replace(source, 0, source.length(), beginGdEibtime, GD_EIBTIME_LEN);
  }

  /**
   * Update GdEibtime with another Field from an offset and length
   *
   * @param value
   */
  public void setGdEibtime(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtime, GD_EIBTIME_LEN);
  }

  /**
   * Update GdEibtime with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdEibtime(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdEibtime + targetIndex, targetLen);
  }
  /**
   * Returns the value of gdDisplayLit
   *
   * @return gdDisplayLit
   */
  public char[] getGdDisplayLit() throws CFException {
    if (isGdDisplayLitModified()) {
      gdDisplayLit = refreshGdDisplayLit();
    }
    return gdDisplayLit;
  }

  /**
   * set variable gdDisplayLit Corresponding COBOL Variable is GD-DISPLAY-LIT
   *
   * @param value
   */
  public void setGdDisplayLit(char[] value) {
    gdDisplayLit = checkGdDisplayLitConstraints(value);
    serializeGdDisplayLit(gdDisplayLit);
  }

  /**
   * Update GdDisplayLit with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdDisplayLit(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdDisplayLit, gdDisplayLit.length);
  }

  public void setGdDisplayLit(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdDisplayLit, gdDisplayLit.length);
  }

  /**
   * Update GdDisplayLit with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdDisplayLit(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdDisplayLit + targetIndex, targetLen);
  }

  /**
   * Update GdDisplayLit with another Field
   *
   * @param value
   */
  public void setGdDisplayLit(Field source) {
    replace(source, 0, source.length(), beginGdDisplayLit, GD_DISPLAY_LIT_LEN);
  }

  /**
   * Update GdDisplayLit with another Field from an offset and length
   *
   * @param value
   */
  public void setGdDisplayLit(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdDisplayLit, GD_DISPLAY_LIT_LEN);
  }

  /**
   * Update GdDisplayLit with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdDisplayLit(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdDisplayLit + targetIndex, targetLen);
  }

  public static int getGdCicsLitFieldLength() {
    return GD_CICS_LIT_LENGTH;
  }
}
