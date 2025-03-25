package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet4Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet4Area extends DsmRet4AreaSerialized {

  private Pol4RetArea4 pol4RetArea4 = new Pol4RetArea4();

  /** Constructor for DsmRet4Area */
  public DsmRet4Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol4RetArea4.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol4RetArea4
   *
   * @return pol4RetArea4
   */
  public Pol4RetArea4 getPol4RetArea4() {
    return pol4RetArea4;
  }
  /**
   * Update Pol4RetArea4 with the passed value Corresponding COBOL Variable is POL4-RET-AREA4
   *
   * @param value
   */
  public void setPol4RetArea4(char[] value) {
    pol4RetArea4.setString(value);
  }

  /**
   * Update Pol4RetArea4 with a String from an offset and length
   *
   * @param value
   */
  public void setPol4RetArea4(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol4RetArea4.begin, pol4RetArea4.length());
  }

  /**
   * Update Pol4RetArea4 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetArea4(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol4RetArea4.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol4RetArea4 with another Field
   *
   * @param value
   */
  public void setPol4RetArea4(Field source) {
    replace(source, 0, source.length(), pol4RetArea4.begin, pol4RetArea4.length());
  }

  /**
   * Update Pol4RetArea4 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol4RetArea4(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol4RetArea4.begin, pol4RetArea4.length());
  }

  /**
   * Update Pol4RetArea4 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol4RetArea4(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol4RetArea4.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet4Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol4RetArea4.initialize();
  }

  public static int getDsmRet4AreaFieldLength() {
    return DSM_RET_4_AREA_LENGTH;
  }
}
