package com.cloudframe.app.dto.d5427hpc;

/**
 * The class HpcReqRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427hpc.*;

public class HpcReqRetArea extends HpcReqRetAreaSerialized {

  private HpcReqArea hpcReqArea = new HpcReqArea();
  private HpcRetArea hpcRetArea = new HpcRetArea();

  /** Constructor for HpcReqRetArea */
  public HpcReqRetArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HpcReqRetArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HpcReqRetArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    hpcReqArea.setParent(this, getStartOffset() + 0);
    hpcRetArea.setParent(this, getStartOffset() + 11);
  }

  /**
   * Returns the value of hpcReqArea
   *
   * @return hpcReqArea
   */
  public HpcReqArea getHpcReqArea() {
    return hpcReqArea;
  }
  /**
   * Update HpcReqArea with the passed value Corresponding COBOL Variable is HPC-REQ-AREA
   *
   * @param value
   */
  public void setHpcReqArea(char[] value) {
    hpcReqArea.setString(value);
  }

  /**
   * Update HpcReqArea with a String from an offset and length
   *
   * @param value
   */
  public void setHpcReqArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hpcReqArea.begin, hpcReqArea.length());
  }

  /**
   * Update HpcReqArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hpcReqArea.begin + targetIndex, targetLen);
  }

  /**
   * Update HpcReqArea with another Field
   *
   * @param value
   */
  public void setHpcReqArea(Field source) {
    replace(source, 0, source.length(), hpcReqArea.begin, hpcReqArea.length());
  }

  /**
   * Update HpcReqArea with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcReqArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hpcReqArea.begin, hpcReqArea.length());
  }

  /**
   * Update HpcReqArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcReqArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hpcReqArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of hpcRetArea
   *
   * @return hpcRetArea
   */
  public HpcRetArea getHpcRetArea() {
    return hpcRetArea;
  }
  /**
   * Update HpcRetArea with the passed value Corresponding COBOL Variable is HPC-RET-AREA
   *
   * @param value
   */
  public void setHpcRetArea(char[] value) {
    hpcRetArea.setString(value);
  }

  /**
   * Update HpcRetArea with a String from an offset and length
   *
   * @param value
   */
  public void setHpcRetArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hpcRetArea.begin, hpcRetArea.length());
  }

  /**
   * Update HpcRetArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hpcRetArea.begin + targetIndex, targetLen);
  }

  /**
   * Update HpcRetArea with another Field
   *
   * @param value
   */
  public void setHpcRetArea(Field source) {
    replace(source, 0, source.length(), hpcRetArea.begin, hpcRetArea.length());
  }

  /**
   * Update HpcRetArea with another Field from an offset and length
   *
   * @param value
   */
  public void setHpcRetArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hpcRetArea.begin, hpcRetArea.length());
  }

  /**
   * Update HpcRetArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHpcRetArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hpcRetArea.begin + targetIndex, targetLen);
  }

  public static int getHpcReqRetAreaFieldLength() {
    return HPC_REQ_RET_AREA_LENGTH;
  }
}
