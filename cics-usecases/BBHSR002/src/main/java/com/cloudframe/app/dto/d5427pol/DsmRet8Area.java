package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet8Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet8Area extends DsmRet8AreaSerialized {

  private Pol8RetArea2 pol8RetArea2 = new Pol8RetArea2();

  /** Constructor for DsmRet8Area */
  public DsmRet8Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol8RetArea2.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol8RetArea2
   *
   * @return pol8RetArea2
   */
  public Pol8RetArea2 getPol8RetArea2() {
    return pol8RetArea2;
  }
  /**
   * Update Pol8RetArea2 with the passed value Corresponding COBOL Variable is POL8-RET-AREA2
   *
   * @param value
   */
  public void setPol8RetArea2(char[] value) {
    pol8RetArea2.setString(value);
  }

  /**
   * Update Pol8RetArea2 with a String from an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin, pol8RetArea2.length());
  }

  /**
   * Update Pol8RetArea2 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetArea2 with another Field
   *
   * @param value
   */
  public void setPol8RetArea2(Field source) {
    replace(source, 0, source.length(), pol8RetArea2.begin, pol8RetArea2.length());
  }

  /**
   * Update Pol8RetArea2 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin, pol8RetArea2.length());
  }

  /**
   * Update Pol8RetArea2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet8Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol8RetArea2.initialize();
  }

  public static int getDsmRet8AreaFieldLength() {
    return DSM_RET_8_AREA_LENGTH;
  }
}
