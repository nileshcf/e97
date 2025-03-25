package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmRet9Area is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmRet9Area extends DsmRet9AreaSerialized {

  private Pol9RetArea9 pol9RetArea9 = new Pol9RetArea9();

  /** Constructor for DsmRet9Area */
  public DsmRet9Area() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol9RetArea9.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol9RetArea9
   *
   * @return pol9RetArea9
   */
  public Pol9RetArea9 getPol9RetArea9() {
    return pol9RetArea9;
  }
  /**
   * Update Pol9RetArea9 with the passed value Corresponding COBOL Variable is POL9-RET-AREA9
   *
   * @param value
   */
  public void setPol9RetArea9(char[] value) {
    pol9RetArea9.setString(value);
  }

  /**
   * Update Pol9RetArea9 with a String from an offset and length
   *
   * @param value
   */
  public void setPol9RetArea9(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol9RetArea9.begin, pol9RetArea9.length());
  }

  /**
   * Update Pol9RetArea9 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetArea9(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol9RetArea9.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol9RetArea9 with another Field
   *
   * @param value
   */
  public void setPol9RetArea9(Field source) {
    replace(source, 0, source.length(), pol9RetArea9.begin, pol9RetArea9.length());
  }

  /**
   * Update Pol9RetArea9 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol9RetArea9(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol9RetArea9.begin, pol9RetArea9.length());
  }

  /**
   * Update Pol9RetArea9 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol9RetArea9(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol9RetArea9.begin + targetIndex, targetLen);
  }

  public static int getDsmRet9AreaFieldLength() {
    return DSM_RET_9_AREA_LENGTH;
  }
}
