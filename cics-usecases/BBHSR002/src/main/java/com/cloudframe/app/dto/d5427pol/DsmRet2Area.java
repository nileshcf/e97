package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet2Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet2Area extends DsmRet2AreaSerialized {

  private Pol2RetArea2 pol2RetArea2 = new Pol2RetArea2();

  /** Constructor for DsmRet2Area */
  public DsmRet2Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol2RetArea2.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol2RetArea2
   *
   * @return pol2RetArea2
   */
  public Pol2RetArea2 getPol2RetArea2() {
    return pol2RetArea2;
  }
  /**
   * Update Pol2RetArea2 with the passed value Corresponding COBOL Variable is POL2-RET-AREA2
   *
   * @param value
   */
  public void setPol2RetArea2(char[] value) {
    pol2RetArea2.setString(value);
  }

  /**
   * Update Pol2RetArea2 with a String from an offset and length
   *
   * @param value
   */
  public void setPol2RetArea2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol2RetArea2.begin, pol2RetArea2.length());
  }

  /**
   * Update Pol2RetArea2 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetArea2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol2RetArea2.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol2RetArea2 with another Field
   *
   * @param value
   */
  public void setPol2RetArea2(Field source) {
    replace(source, 0, source.length(), pol2RetArea2.begin, pol2RetArea2.length());
  }

  /**
   * Update Pol2RetArea2 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol2RetArea2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol2RetArea2.begin, pol2RetArea2.length());
  }

  /**
   * Update Pol2RetArea2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol2RetArea2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol2RetArea2.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet2Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol2RetArea2.initialize();
  }

  public static int getDsmRet2AreaFieldLength() {
    return DSM_RET_2_AREA_LENGTH;
  }
}
