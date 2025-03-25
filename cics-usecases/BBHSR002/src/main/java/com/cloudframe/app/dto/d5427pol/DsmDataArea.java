package com.cloudframe.app.dto.d5427pol;

/**
 * The class DsmDataArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;

public class DsmDataArea extends DsmDataAreaSerialized {

  private PolReqArea polReqArea = new PolReqArea();

  /** Constructor for DsmDataArea */
  public DsmDataArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    polReqArea.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of polReqArea
   *
   * @return polReqArea
   */
  public PolReqArea getPolReqArea() {
    return polReqArea;
  }
  /**
   * Update PolReqArea with the passed value Corresponding COBOL Variable is POL-REQ-AREA
   *
   * @param value
   */
  public void setPolReqArea(char[] value) {
    polReqArea.setString(value);
  }

  /**
   * Update PolReqArea with a String from an offset and length
   *
   * @param value
   */
  public void setPolReqArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, polReqArea.begin, polReqArea.length());
  }

  /**
   * Update PolReqArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, polReqArea.begin + targetIndex, targetLen);
  }

  /**
   * Update PolReqArea with another Field
   *
   * @param value
   */
  public void setPolReqArea(Field source) {
    replace(source, 0, source.length(), polReqArea.begin, polReqArea.length());
  }

  /**
   * Update PolReqArea with another Field from an offset and length
   *
   * @param value
   */
  public void setPolReqArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, polReqArea.begin, polReqArea.length());
  }

  /**
   * Update PolReqArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolReqArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, polReqArea.begin + targetIndex, targetLen);
  }

  public static int getDsmDataAreaFieldLength() {
    return DSM_DATA_AREA_LENGTH;
  }
}
