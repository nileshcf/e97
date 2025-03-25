package com.cloudframe.app.dto.dphpctsq;

/**
 * The class WritetdqCommarea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;

public class WritetdqCommarea extends WritetdqCommareaSerialized {

  private WtdqRequestArea wtdqRequestArea = new WtdqRequestArea();

  /** Constructor for WritetdqCommarea */
  public WritetdqCommarea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    wtdqRequestArea.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of wtdqRequestArea
   *
   * @return wtdqRequestArea
   */
  public WtdqRequestArea getWtdqRequestArea() {
    return wtdqRequestArea;
  }
  /**
   * Update WtdqRequestArea with the passed value Corresponding COBOL Variable is WTDQ-REQUEST-AREA
   *
   * @param value
   */
  public void setWtdqRequestArea(char[] value) {
    wtdqRequestArea.setString(value);
  }

  /**
   * Update WtdqRequestArea with a String from an offset and length
   *
   * @param value
   */
  public void setWtdqRequestArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, wtdqRequestArea.begin, wtdqRequestArea.length());
  }

  /**
   * Update WtdqRequestArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqRequestArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, wtdqRequestArea.begin + targetIndex, targetLen);
  }

  /**
   * Update WtdqRequestArea with another Field
   *
   * @param value
   */
  public void setWtdqRequestArea(Field source) {
    replace(source, 0, source.length(), wtdqRequestArea.begin, wtdqRequestArea.length());
  }

  /**
   * Update WtdqRequestArea with another Field from an offset and length
   *
   * @param value
   */
  public void setWtdqRequestArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, wtdqRequestArea.begin, wtdqRequestArea.length());
  }

  /**
   * Update WtdqRequestArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqRequestArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, wtdqRequestArea.begin + targetIndex, targetLen);
  }

  public static int getWritetdqCommareaFieldLength() {
    return WRITETDQ_COMMAREA_LENGTH;
  }
}
