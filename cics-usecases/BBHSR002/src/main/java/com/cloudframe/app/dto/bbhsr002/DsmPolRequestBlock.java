package com.cloudframe.app.dto.bbhsr002;

/**
 * The class DsmPolRequestBlock is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class DsmPolRequestBlock extends DsmPolRequestBlockSerialized {

  private PolReqArea polReqArea = new PolReqArea();

  /** Constructor for DsmPolRequestBlock */
  public DsmPolRequestBlock() {
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

  /**
   * initializes DsmPolRequestBlock String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    polReqArea.initialize();
  }

  public static int getDsmPolRequestBlockFieldLength() {
    return DSM_POL_REQUEST_BLOCK_LENGTH;
  }
}
