package com.cloudframe.app.dto.d5427tli;

/**
 * The class TliDsmArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427tli.*;

public class TliDsmArea extends TliDsmAreaSerialized {

  private TliDataArea tliDataArea = new TliDataArea();

  /** Constructor for TliDsmArea */
  public TliDsmArea() {
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

  public static int getTliDsmAreaFieldLength() {
    return TLI_DSM_AREA_LENGTH;
  }
}
