package com.optum.uhg.app.dto.d5427dt1;

/**
 * The class Dt1ReqContainer is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:47. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import com.optum.uhg.app.dto.serialize.d5427dt1.*;

public class Dt1ReqContainer extends Dt1ReqContainerSerialized {

  private Dt1RequestArea dt1RequestArea = new Dt1RequestArea();

  /** Constructor for Dt1ReqContainer */
  public Dt1ReqContainer() {
    super();
    /*  set the parent of each child as this which are a group variable */
    dt1RequestArea.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of dt1RequestArea
   *
   * @return dt1RequestArea
   */
  public Dt1RequestArea getDt1RequestArea() {
    return dt1RequestArea;
  }
  /**
   * Update Dt1RequestArea with the passed value Corresponding COBOL Variable is DT1-REQUEST-AREA
   *
   * @param value
   */
  public void setDt1RequestArea(char[] value) {
    dt1RequestArea.setString(value);
  }

  /**
   * Update Dt1RequestArea with a String from an offset and length
   *
   * @param value
   */
  public void setDt1RequestArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dt1RequestArea.begin, dt1RequestArea.length());
  }

  /**
   * Update Dt1RequestArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDt1RequestArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dt1RequestArea.begin + targetIndex, targetLen);
  }

  /**
   * Update Dt1RequestArea with another Field
   *
   * @param value
   */
  public void setDt1RequestArea(Field source) {
    replace(source, 0, source.length(), dt1RequestArea.begin, dt1RequestArea.length());
  }

  /**
   * Update Dt1RequestArea with another Field from an offset and length
   *
   * @param value
   */
  public void setDt1RequestArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dt1RequestArea.begin, dt1RequestArea.length());
  }

  /**
   * Update Dt1RequestArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDt1RequestArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dt1RequestArea.begin + targetIndex, targetLen);
  }

  public static int getDt1ReqContainerFieldLength() {
    return DT_1_REQ_CONTAINER_LENGTH;
  }
}
