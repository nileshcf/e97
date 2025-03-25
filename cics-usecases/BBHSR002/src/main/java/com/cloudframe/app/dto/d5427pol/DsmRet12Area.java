package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet12Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet12Area extends DsmRet12AreaSerialized {

  private Pol12RetArea12 pol12RetArea12 = new Pol12RetArea12();

  /** Constructor for DsmRet12Area */
  public DsmRet12Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol12RetArea12.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol12RetArea12
   *
   * @return pol12RetArea12
   */
  public Pol12RetArea12 getPol12RetArea12() {
    return pol12RetArea12;
  }
  /**
   * Update Pol12RetArea12 with the passed value Corresponding COBOL Variable is POL12-RET-AREA12
   *
   * @param value
   */
  public void setPol12RetArea12(char[] value) {
    pol12RetArea12.setString(value);
  }

  /**
   * Update Pol12RetArea12 with a String from an offset and length
   *
   * @param value
   */
  public void setPol12RetArea12(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol12RetArea12.begin, pol12RetArea12.length());
  }

  /**
   * Update Pol12RetArea12 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetArea12(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol12RetArea12.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol12RetArea12 with another Field
   *
   * @param value
   */
  public void setPol12RetArea12(Field source) {
    replace(source, 0, source.length(), pol12RetArea12.begin, pol12RetArea12.length());
  }

  /**
   * Update Pol12RetArea12 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol12RetArea12(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol12RetArea12.begin, pol12RetArea12.length());
  }

  /**
   * Update Pol12RetArea12 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol12RetArea12(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol12RetArea12.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet12Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol12RetArea12.initialize();
  }

  public static int getDsmRet12AreaFieldLength() {
    return DSM_RET_12_AREA_LENGTH;
  }
}
