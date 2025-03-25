package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet7Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet7Area extends DsmRet7AreaSerialized {

  private Pol7RetArea3 pol7RetArea3 = new Pol7RetArea3();

  /** Constructor for DsmRet7Area */
  public DsmRet7Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol7RetArea3.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol7RetArea3
   *
   * @return pol7RetArea3
   */
  public Pol7RetArea3 getPol7RetArea3() {
    return pol7RetArea3;
  }
  /**
   * Update Pol7RetArea3 with the passed value Corresponding COBOL Variable is POL7-RET-AREA3
   *
   * @param value
   */
  public void setPol7RetArea3(char[] value) {
    pol7RetArea3.setString(value);
  }

  /**
   * Update Pol7RetArea3 with a String from an offset and length
   *
   * @param value
   */
  public void setPol7RetArea3(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol7RetArea3.begin, pol7RetArea3.length());
  }

  /**
   * Update Pol7RetArea3 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol7RetArea3(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol7RetArea3.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol7RetArea3 with another Field
   *
   * @param value
   */
  public void setPol7RetArea3(Field source) {
    replace(source, 0, source.length(), pol7RetArea3.begin, pol7RetArea3.length());
  }

  /**
   * Update Pol7RetArea3 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol7RetArea3(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol7RetArea3.begin, pol7RetArea3.length());
  }

  /**
   * Update Pol7RetArea3 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol7RetArea3(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol7RetArea3.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet7Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol7RetArea3.initialize();
  }

  public static int getDsmRet7AreaFieldLength() {
    return DSM_RET_7_AREA_LENGTH;
  }
}
