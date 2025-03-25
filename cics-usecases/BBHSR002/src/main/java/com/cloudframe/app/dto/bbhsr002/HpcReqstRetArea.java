package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HpcReqstRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class HpcReqstRetArea extends HpcReqstRetAreaSerialized {

  private HpcReqRetArea hpcReqRetArea = new HpcReqRetArea();

  /** Constructor for HpcReqstRetArea */
  public HpcReqstRetArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    hpcReqRetArea.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of hpcReqRetArea
   *
   * @return hpcReqRetArea
   */
  public HpcReqRetArea getHpcReqRetArea() {
    return hpcReqRetArea;
  }
  /**
   * Update HpcReqRetArea with the passed value Corresponding COBOL Variable is HPC-REQ-RET-AREA
   *
   * @param value
   */
  public void setHpcReqRetArea(char[] value) {
    hpcReqRetArea.setString(value);
  }

  /**
   * Update HpcReqRetArea with a String from an offset and length
   *
   * @param value
   */
  public void setHpcReqRetArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hpcReqRetArea.begin, hpcReqRetArea.length());
  }

  /**
   * Update HpcReqRetArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqRetArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hpcReqRetArea.begin + targetIndex, targetLen);
  }

  /**
   * Update HpcReqRetArea with another Field
   *
   * @param value
   */
  public void setHpcReqRetArea(Field source) {
    replace(source, 0, source.length(), hpcReqRetArea.begin, hpcReqRetArea.length());
  }

  /**
   * Update HpcReqRetArea with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcReqRetArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hpcReqRetArea.begin, hpcReqRetArea.length());
  }

  /**
   * Update HpcReqRetArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqRetArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hpcReqRetArea.begin + targetIndex, targetLen);
  }

  /**
   * initializes HpcReqstRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    hpcReqRetArea.initialize();
  }

  public static int getHpcReqstRetAreaFieldLength() {
    return HPC_REQST_RET_AREA_LENGTH;
  }
}
