package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet5Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet5Area extends DsmRet5AreaSerialized {

  private Pol5RetArea5 pol5RetArea5 = new Pol5RetArea5();

  /** Constructor for DsmRet5Area */
  public DsmRet5Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol5RetArea5.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol5RetArea5
   *
   * @return pol5RetArea5
   */
  public Pol5RetArea5 getPol5RetArea5() {
    return pol5RetArea5;
  }
  /**
   * Update Pol5RetArea5 with the passed value Corresponding COBOL Variable is POL5-RET-AREA5
   *
   * @param value
   */
  public void setPol5RetArea5(char[] value) {
    pol5RetArea5.setString(value);
  }

  /**
   * Update Pol5RetArea5 with a String from an offset and length
   *
   * @param value
   */
  public void setPol5RetArea5(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol5RetArea5.begin, pol5RetArea5.length());
  }

  /**
   * Update Pol5RetArea5 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol5RetArea5(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol5RetArea5.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol5RetArea5 with another Field
   *
   * @param value
   */
  public void setPol5RetArea5(Field source) {
    replace(source, 0, source.length(), pol5RetArea5.begin, pol5RetArea5.length());
  }

  /**
   * Update Pol5RetArea5 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol5RetArea5(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol5RetArea5.begin, pol5RetArea5.length());
  }

  /**
   * Update Pol5RetArea5 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol5RetArea5(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol5RetArea5.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet5Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol5RetArea5.initialize();
  }

  public static int getDsmRet5AreaFieldLength() {
    return DSM_RET_5_AREA_LENGTH;
  }
}
