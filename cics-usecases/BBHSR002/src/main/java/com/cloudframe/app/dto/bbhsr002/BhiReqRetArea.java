package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiReqRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class BhiReqRetArea extends BhiReqRetAreaSerialized {

  private BhiReqArea bhiReqArea = new BhiReqArea();
  private BhiRetArea bhiRetArea = new BhiRetArea();

  /** Constructor for BhiReqRetArea */
  public BhiReqRetArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    bhiReqArea.setParent(this, getStartOffset() + 0);
    bhiRetArea.setParent(this, getStartOffset() + 28);
    /*  end of offset */
  }

  /**
   * Returns the value of bhiReqArea
   *
   * @return bhiReqArea
   */
  public BhiReqArea getBhiReqArea() {
    return bhiReqArea;
  }
  /**
   * Update BhiReqArea with the passed value Corresponding COBOL Variable is BHI-REQ-AREA
   *
   * @param value
   */
  public void setBhiReqArea(char[] value) {
    bhiReqArea.setString(value);
  }

  /**
   * Update BhiReqArea with a String from an offset and length
   *
   * @param value
   */
  public void setBhiReqArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqArea.begin, bhiReqArea.length());
  }

  /**
   * Update BhiReqArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqArea.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiReqArea with another Field
   *
   * @param value
   */
  public void setBhiReqArea(Field source) {
    replace(source, 0, source.length(), bhiReqArea.begin, bhiReqArea.length());
  }

  /**
   * Update BhiReqArea with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqArea.begin, bhiReqArea.length());
  }

  /**
   * Update BhiReqArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetArea
   *
   * @return bhiRetArea
   */
  public BhiRetArea getBhiRetArea() {
    return bhiRetArea;
  }
  /**
   * Update BhiRetArea with the passed value Corresponding COBOL Variable is BHI-RET-AREA
   *
   * @param value
   */
  public void setBhiRetArea(char[] value) {
    bhiRetArea.setString(value);
  }

  /**
   * Update BhiRetArea with a String from an offset and length
   *
   * @param value
   */
  public void setBhiRetArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRetArea.begin, bhiRetArea.length());
  }

  /**
   * Update BhiRetArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRetArea.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiRetArea with another Field
   *
   * @param value
   */
  public void setBhiRetArea(Field source) {
    replace(source, 0, source.length(), bhiRetArea.begin, bhiRetArea.length());
  }

  /**
   * Update BhiRetArea with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRetArea.begin, bhiRetArea.length());
  }

  /**
   * Update BhiRetArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRetArea.begin + targetIndex, targetLen);
  }

  /**
   * initializes BhiReqRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    bhiReqArea.initialize();

    bhiRetArea.initialize();
  }

  public static int getBhiReqRetAreaFieldLength() {
    return BHI_REQ_RET_AREA_LENGTH;
  }
}
