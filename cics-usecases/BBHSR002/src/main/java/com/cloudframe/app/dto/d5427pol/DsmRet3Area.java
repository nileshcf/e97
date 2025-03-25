package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet3Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet3Area extends DsmRet3AreaSerialized {

  private Pol3RetArea3 pol3RetArea3 = new Pol3RetArea3();

  /** Constructor for DsmRet3Area */
  public DsmRet3Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol3RetArea3.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol3RetArea3
   *
   * @return pol3RetArea3
   */
  public Pol3RetArea3 getPol3RetArea3() {
    return pol3RetArea3;
  }
  /**
   * Update Pol3RetArea3 with the passed value Corresponding COBOL Variable is POL3-RET-AREA3
   *
   * @param value
   */
  public void setPol3RetArea3(char[] value) {
    pol3RetArea3.setString(value);
  }

  /**
   * Update Pol3RetArea3 with a String from an offset and length
   *
   * @param value
   */
  public void setPol3RetArea3(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol3RetArea3.begin, pol3RetArea3.length());
  }

  /**
   * Update Pol3RetArea3 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetArea3(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol3RetArea3.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol3RetArea3 with another Field
   *
   * @param value
   */
  public void setPol3RetArea3(Field source) {
    replace(source, 0, source.length(), pol3RetArea3.begin, pol3RetArea3.length());
  }

  /**
   * Update Pol3RetArea3 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol3RetArea3(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol3RetArea3.begin, pol3RetArea3.length());
  }

  /**
   * Update Pol3RetArea3 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol3RetArea3(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol3RetArea3.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet3Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol3RetArea3.initialize();
  }

  public static int getDsmRet3AreaFieldLength() {
    return DSM_RET_3_AREA_LENGTH;
  }
}
