package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdCatalogName is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdCatalogName extends GdCatalogNameSerialized {

  private short gdCatalogNameL;

  private char[] gdCatalogNameT = Field.fillLowValue(128);

  /** Constructor for GdCatalogName */
  public GdCatalogName() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdCatalogName. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdCatalogName(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdCatalogNameL
   *
   * @return gdCatalogNameL
   */
  public short getGdCatalogNameL() throws CFException {
    if (isGdCatalogNameLModified()) {
      gdCatalogNameL = refreshGdCatalogNameL();
    }
    return gdCatalogNameL;
  }

  /**
   * Update GdCatalogNameL with the passed value Corresponding COBOL Variable is GD-CATALOG-NAME-L
   *
   * @param number
   */
  public void setGdCatalogNameL(short number) {
    // Truncate if the number is beyond +/- Max range
    gdCatalogNameL = checkGdCatalogNameLMaxLimit(number);
    serializeGdCatalogNameL(gdCatalogNameL);
  }

  public void setGdCatalogNameL(int number) {
    number =
        checkGdCatalogNameLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdCatalogNameL((short) number);
  }

  public void setGdCatalogNameL(long number) {
    number =
        checkGdCatalogNameLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdCatalogNameL((short) number);
  }

  /**
   * Returns the value of gdCatalogNameT
   *
   * @return gdCatalogNameT
   */
  public char[] getGdCatalogNameT() throws CFException {
    if (isGdCatalogNameTModified()) {
      gdCatalogNameT = refreshGdCatalogNameT();
    }
    return gdCatalogNameT;
  }

  /**
   * set variable gdCatalogNameT Corresponding COBOL Variable is GD-CATALOG-NAME-T
   *
   * @param value
   */
  public void setGdCatalogNameT(char[] value) {
    gdCatalogNameT = checkGdCatalogNameTConstraints(value);
    serializeGdCatalogNameT(gdCatalogNameT);
  }

  /**
   * Update GdCatalogNameT with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCatalogNameT(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCatalogNameT, gdCatalogNameT.length);
  }

  public void setGdCatalogNameT(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCatalogNameT, gdCatalogNameT.length);
  }

  /**
   * Update GdCatalogNameT with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCatalogNameT(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCatalogNameT + targetIndex, targetLen);
  }

  /**
   * Update GdCatalogNameT with another Field
   *
   * @param value
   */
  public void setGdCatalogNameT(Field source) {
    replace(source, 0, source.length(), beginGdCatalogNameT, GD_CATALOG_NAME_T_LEN);
  }

  /**
   * Update GdCatalogNameT with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCatalogNameT(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCatalogNameT, GD_CATALOG_NAME_T_LEN);
  }

  /**
   * Update GdCatalogNameT with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCatalogNameT(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCatalogNameT + targetIndex, targetLen);
  }

  public static int getGdCatalogNameFieldLength() {
    return GD_CATALOG_NAME_LENGTH;
  }
}
