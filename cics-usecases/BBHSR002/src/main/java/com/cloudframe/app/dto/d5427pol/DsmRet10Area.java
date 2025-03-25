package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet10Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet10Area extends DsmRet10AreaSerialized {

  private Pol10RetArea10 pol10RetArea10 = new Pol10RetArea10();

  /** Constructor for DsmRet10Area */
  public DsmRet10Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol10RetArea10.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol10RetArea10
   *
   * @return pol10RetArea10
   */
  public Pol10RetArea10 getPol10RetArea10() {
    return pol10RetArea10;
  }
  /**
   * Update Pol10RetArea10 with the passed value Corresponding COBOL Variable is POL10-RET-AREA10
   *
   * @param value
   */
  public void setPol10RetArea10(char[] value) {
    pol10RetArea10.setString(value);
  }

  /**
   * Update Pol10RetArea10 with a String from an offset and length
   *
   * @param value
   */
  public void setPol10RetArea10(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol10RetArea10.begin, pol10RetArea10.length());
  }

  /**
   * Update Pol10RetArea10 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetArea10(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol10RetArea10.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol10RetArea10 with another Field
   *
   * @param value
   */
  public void setPol10RetArea10(Field source) {
    replace(source, 0, source.length(), pol10RetArea10.begin, pol10RetArea10.length());
  }

  /**
   * Update Pol10RetArea10 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol10RetArea10(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol10RetArea10.begin, pol10RetArea10.length());
  }

  /**
   * Update Pol10RetArea10 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol10RetArea10(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol10RetArea10.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet10Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol10RetArea10.initialize();
  }

  public static int getDsmRet10AreaFieldLength() {
    return DSM_RET_10_AREA_LENGTH;
  }
}
