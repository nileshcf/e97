package com.cloudframe.app.dto.d5427scn;

/**
 * The class ScnReqRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;

public class ScnReqRetArea extends ScnReqRetAreaSerialized {

  private ScnReqArea scnReqArea = new ScnReqArea();
  private ScnRetArea scnRetArea = new ScnRetArea();

  /** Constructor for ScnReqRetArea */
  public ScnReqRetArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ScnReqRetArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ScnReqRetArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    scnReqArea.setParent(this, getStartOffset() + 0);
    scnRetArea.setParent(this, getStartOffset() + 34);
  }

  /**
   * Returns the value of scnReqArea
   *
   * @return scnReqArea
   */
  public ScnReqArea getScnReqArea() {
    return scnReqArea;
  }
  /**
   * Update ScnReqArea with the passed value Corresponding COBOL Variable is SCN-REQ-AREA
   *
   * @param value
   */
  public void setScnReqArea(char[] value) {
    scnReqArea.setString(value);
  }

  /**
   * Update ScnReqArea with a String from an offset and length
   *
   * @param value
   */
  public void setScnReqArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, scnReqArea.begin, scnReqArea.length());
  }

  /**
   * Update ScnReqArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, scnReqArea.begin + targetIndex, targetLen);
  }

  /**
   * Update ScnReqArea with another Field
   *
   * @param value
   */
  public void setScnReqArea(Field source) {
    replace(source, 0, source.length(), scnReqArea.begin, scnReqArea.length());
  }

  /**
   * Update ScnReqArea with another Field from an offset and length
   *
   * @param value
   */
  public void setScnReqArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, scnReqArea.begin, scnReqArea.length());
  }

  /**
   * Update ScnReqArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnReqArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, scnReqArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of scnRetArea
   *
   * @return scnRetArea
   */
  public ScnRetArea getScnRetArea() {
    return scnRetArea;
  }
  /**
   * Update ScnRetArea with the passed value Corresponding COBOL Variable is SCN-RET-AREA
   *
   * @param value
   */
  public void setScnRetArea(char[] value) {
    scnRetArea.setString(value);
  }

  /**
   * Update ScnRetArea with a String from an offset and length
   *
   * @param value
   */
  public void setScnRetArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, scnRetArea.begin, scnRetArea.length());
  }

  /**
   * Update ScnRetArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnRetArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, scnRetArea.begin + targetIndex, targetLen);
  }

  /**
   * Update ScnRetArea with another Field
   *
   * @param value
   */
  public void setScnRetArea(Field source) {
    replace(source, 0, source.length(), scnRetArea.begin, scnRetArea.length());
  }

  /**
   * Update ScnRetArea with another Field from an offset and length
   *
   * @param value
   */
  public void setScnRetArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, scnRetArea.begin, scnRetArea.length());
  }

  /**
   * Update ScnRetArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setScnRetArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, scnRetArea.begin + targetIndex, targetLen);
  }

  public static int getScnReqRetAreaFieldLength() {
    return SCN_REQ_RET_AREA_LENGTH;
  }
}
