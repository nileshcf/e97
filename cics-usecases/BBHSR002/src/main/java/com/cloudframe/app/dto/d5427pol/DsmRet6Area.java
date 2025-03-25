package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet6Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet6Area extends DsmRet6AreaSerialized {

  private Pol6RetArea6 pol6RetArea6 = new Pol6RetArea6();

  /** Constructor for DsmRet6Area */
  public DsmRet6Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol6RetArea6.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol6RetArea6
   *
   * @return pol6RetArea6
   */
  public Pol6RetArea6 getPol6RetArea6() {
    return pol6RetArea6;
  }
  /**
   * Update Pol6RetArea6 with the passed value Corresponding COBOL Variable is POL6-RET-AREA6
   *
   * @param value
   */
  public void setPol6RetArea6(char[] value) {
    pol6RetArea6.setString(value);
  }

  /**
   * Update Pol6RetArea6 with a String from an offset and length
   *
   * @param value
   */
  public void setPol6RetArea6(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol6RetArea6.begin, pol6RetArea6.length());
  }

  /**
   * Update Pol6RetArea6 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetArea6(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol6RetArea6.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol6RetArea6 with another Field
   *
   * @param value
   */
  public void setPol6RetArea6(Field source) {
    replace(source, 0, source.length(), pol6RetArea6.begin, pol6RetArea6.length());
  }

  /**
   * Update Pol6RetArea6 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol6RetArea6(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol6RetArea6.begin, pol6RetArea6.length());
  }

  /**
   * Update Pol6RetArea6 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol6RetArea6(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol6RetArea6.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmRet6Area String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol6RetArea6.initialize();
  }

  public static int getDsmRet6AreaFieldLength() {
    return DSM_RET_6_AREA_LENGTH;
  }
}
