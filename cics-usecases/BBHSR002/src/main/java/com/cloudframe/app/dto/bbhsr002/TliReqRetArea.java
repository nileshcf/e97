package com.cloudframe.app.dto.bbhsr002;

/**
 * The class TliReqRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class TliReqRetArea extends TliReqRetAreaSerialized {

  private TliDataArea tliDataArea = new TliDataArea();

  /** Constructor for TliReqRetArea */
  public TliReqRetArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    tliDataArea.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of tliDataArea
   *
   * @return tliDataArea
   */
  public TliDataArea getTliDataArea() {
    return tliDataArea;
  }
  /**
   * Update TliDataArea with the passed value Corresponding COBOL Variable is TLI-DATA-AREA
   *
   * @param value
   */
  public void setTliDataArea(char[] value) {
    tliDataArea.setString(value);
  }

  /**
   * Update TliDataArea with a String from an offset and length
   *
   * @param value
   */
  public void setTliDataArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tliDataArea.begin, tliDataArea.length());
  }

  /**
   * Update TliDataArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliDataArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tliDataArea.begin + targetIndex, targetLen);
  }

  /**
   * Update TliDataArea with another Field
   *
   * @param value
   */
  public void setTliDataArea(Field source) {
    replace(source, 0, source.length(), tliDataArea.begin, tliDataArea.length());
  }

  /**
   * Update TliDataArea with another Field from an offset and length
   *
   * @param value
   */
  public void setTliDataArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tliDataArea.begin, tliDataArea.length());
  }

  /**
   * Update TliDataArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliDataArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tliDataArea.begin + targetIndex, targetLen);
  }

  /**
   * initializes TliReqRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    tliDataArea.initialize();
  }

  public static int getTliReqRetAreaFieldLength() {
    return TLI_REQ_RET_AREA_LENGTH;
  }
}
