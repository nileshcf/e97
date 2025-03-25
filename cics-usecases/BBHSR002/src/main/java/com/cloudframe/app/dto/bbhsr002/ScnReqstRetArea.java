package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ScnReqstRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class ScnReqstRetArea extends ScnReqstRetAreaSerialized {

  private ScnReqRetArea scnReqRetArea = new ScnReqRetArea();

  /** Constructor for ScnReqstRetArea */
  public ScnReqstRetArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    scnReqRetArea.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of scnReqRetArea
   *
   * @return scnReqRetArea
   */
  public ScnReqRetArea getScnReqRetArea() {
    return scnReqRetArea;
  }
  /**
   * Update ScnReqRetArea with the passed value Corresponding COBOL Variable is SCN-REQ-RET-AREA
   *
   * @param value
   */
  public void setScnReqRetArea(char[] value) {
    scnReqRetArea.setString(value);
  }

  /**
   * Update ScnReqRetArea with a String from an offset and length
   *
   * @param value
   */
  public void setScnReqRetArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, scnReqRetArea.begin, scnReqRetArea.length());
  }

  /**
   * Update ScnReqRetArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqRetArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, scnReqRetArea.begin + targetIndex, targetLen);
  }

  /**
   * Update ScnReqRetArea with another Field
   *
   * @param value
   */
  public void setScnReqRetArea(Field source) {
    replace(source, 0, source.length(), scnReqRetArea.begin, scnReqRetArea.length());
  }

  /**
   * Update ScnReqRetArea with another Field from an offset and length
   *
   * @param value
   */
  public void setScnReqRetArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, scnReqRetArea.begin, scnReqRetArea.length());
  }

  /**
   * Update ScnReqRetArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqRetArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, scnReqRetArea.begin + targetIndex, targetLen);
  }

  /**
   * initializes ScnReqstRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    scnReqRetArea.initialize();
  }

  public static int getScnReqstRetAreaFieldLength() {
    return SCN_REQST_RET_AREA_LENGTH;
  }
}
