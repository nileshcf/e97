package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrRequestArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class HsrRequestArea extends HsrRequestAreaSerialized {

  private HsrReqArea hsrReqArea = new HsrReqArea();

  /** Constructor for HsrRequestArea */
  public HsrRequestArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    hsrReqArea.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of hsrReqArea
   *
   * @return hsrReqArea
   */
  public HsrReqArea getHsrReqArea() {
    return hsrReqArea;
  }
  /**
   * Update HsrReqArea with the passed value Corresponding COBOL Variable is HSR-REQ-AREA
   *
   * @param value
   */
  public void setHsrReqArea(char[] value) {
    hsrReqArea.setString(value);
  }

  /**
   * Update HsrReqArea with a String from an offset and length
   *
   * @param value
   */
  public void setHsrReqArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrReqArea.begin, hsrReqArea.length());
  }

  /**
   * Update HsrReqArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqArea.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrReqArea with another Field
   *
   * @param value
   */
  public void setHsrReqArea(Field source) {
    replace(source, 0, source.length(), hsrReqArea.begin, hsrReqArea.length());
  }

  /**
   * Update HsrReqArea with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrReqArea.begin, hsrReqArea.length());
  }

  /**
   * Update HsrReqArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqArea.begin + targetIndex, targetLen);
  }

  public static int getHsrRequestAreaFieldLength() {
    return HSR_REQUEST_AREA_LENGTH;
  }
}
