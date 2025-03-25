package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdProdId is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdProdId extends GdProdIdSerialized {

  private short gdProdIdL;

  private char[] gdProdIdT = Field.fillLowValue(8);

  /** Constructor for GdProdId */
  public GdProdId() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdProdId. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdProdId(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdProdIdL
   *
   * @return gdProdIdL
   */
  public short getGdProdIdL() throws CFException {
    if (isGdProdIdLModified()) {
      gdProdIdL = refreshGdProdIdL();
    }
    return gdProdIdL;
  }

  /**
   * Update GdProdIdL with the passed value Corresponding COBOL Variable is GD-PROD-ID-L
   *
   * @param number
   */
  public void setGdProdIdL(short number) {
    // Truncate if the number is beyond +/- Max range
    gdProdIdL = checkGdProdIdLMaxLimit(number);
    serializeGdProdIdL(gdProdIdL);
  }

  public void setGdProdIdL(int number) {
    number = checkGdProdIdLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdProdIdL((short) number);
  }

  public void setGdProdIdL(long number) {
    number = checkGdProdIdLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdProdIdL((short) number);
  }

  /**
   * Returns the value of gdProdIdT
   *
   * @return gdProdIdT
   */
  public char[] getGdProdIdT() throws CFException {
    if (isGdProdIdTModified()) {
      gdProdIdT = refreshGdProdIdT();
    }
    return gdProdIdT;
  }

  /**
   * set variable gdProdIdT Corresponding COBOL Variable is GD-PROD-ID-T
   *
   * @param value
   */
  public void setGdProdIdT(char[] value) {
    gdProdIdT = checkGdProdIdTConstraints(value);
    serializeGdProdIdT(gdProdIdT);
  }

  /**
   * Update GdProdIdT with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdProdIdT(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdProdIdT, gdProdIdT.length);
  }

  public void setGdProdIdT(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdProdIdT, gdProdIdT.length);
  }

  /**
   * Update GdProdIdT with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdProdIdT(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdProdIdT + targetIndex, targetLen);
  }

  /**
   * Update GdProdIdT with another Field
   *
   * @param value
   */
  public void setGdProdIdT(Field source) {
    replace(source, 0, source.length(), beginGdProdIdT, GD_PROD_ID_T_LEN);
  }

  /**
   * Update GdProdIdT with another Field from an offset and length
   *
   * @param value
   */
  public void setGdProdIdT(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdProdIdT, GD_PROD_ID_T_LEN);
  }

  /**
   * Update GdProdIdT with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdProdIdT(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdProdIdT + targetIndex, targetLen);
  }

  public static int getGdProdIdFieldLength() {
    return GD_PROD_ID_LENGTH;
  }
}
