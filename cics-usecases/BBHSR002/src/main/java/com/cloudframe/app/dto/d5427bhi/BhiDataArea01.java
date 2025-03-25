package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiDataArea01 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;

public class BhiDataArea01 extends BhiDataArea01Serialized {

  private BhiRequestArea bhiRequestArea = new BhiRequestArea();
  private BhiReturnArea bhiReturnArea = new BhiReturnArea();

  /** Constructor for BhiDataArea01 */
  public BhiDataArea01() {
    super();
    /*  set the parent of each child as this which are a group variable */
    bhiRequestArea.setParent(this, getStartOffset() + 0);
    bhiReturnArea.setParent(this, getStartOffset() + 1485);
    /*  end of offset */
  }

  /**
   * Returns the value of bhiRequestArea
   *
   * @return bhiRequestArea
   */
  public BhiRequestArea getBhiRequestArea() {
    return bhiRequestArea;
  }
  /**
   * Update BhiRequestArea with the passed value Corresponding COBOL Variable is BHI-REQUEST-AREA
   *
   * @param value
   */
  public void setBhiRequestArea(char[] value) {
    bhiRequestArea.setString(value);
  }

  /**
   * Update BhiRequestArea with a String from an offset and length
   *
   * @param value
   */
  public void setBhiRequestArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRequestArea.begin, bhiRequestArea.length());
  }

  /**
   * Update BhiRequestArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRequestArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRequestArea.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiRequestArea with another Field
   *
   * @param value
   */
  public void setBhiRequestArea(Field source) {
    replace(source, 0, source.length(), bhiRequestArea.begin, bhiRequestArea.length());
  }

  /**
   * Update BhiRequestArea with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRequestArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRequestArea.begin, bhiRequestArea.length());
  }

  /**
   * Update BhiRequestArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRequestArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRequestArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReturnArea
   *
   * @return bhiReturnArea
   */
  public BhiReturnArea getBhiReturnArea() {
    return bhiReturnArea;
  }
  /**
   * Update BhiReturnArea with the passed value Corresponding COBOL Variable is BHI-RETURN-AREA
   *
   * @param value
   */
  public void setBhiReturnArea(char[] value) {
    bhiReturnArea.setString(value);
  }

  /**
   * Update BhiReturnArea with a String from an offset and length
   *
   * @param value
   */
  public void setBhiReturnArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReturnArea.begin, bhiReturnArea.length());
  }

  /**
   * Update BhiReturnArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReturnArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReturnArea.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiReturnArea with another Field
   *
   * @param value
   */
  public void setBhiReturnArea(Field source) {
    replace(source, 0, source.length(), bhiReturnArea.begin, bhiReturnArea.length());
  }

  /**
   * Update BhiReturnArea with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReturnArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReturnArea.begin, bhiReturnArea.length());
  }

  /**
   * Update BhiReturnArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReturnArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReturnArea.begin + targetIndex, targetLen);
  }

  public static int getBhiDataArea01FieldLength() {
    return BHI_DATA_AREA_01_LENGTH;
  }
}
