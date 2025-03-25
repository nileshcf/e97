package com.cloudframe.app.dto.bbhsr002;

/**
 * The class AdaAcqDataAreaGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class AdaAcqDataAreaGroup extends AdaAcqDataAreaGroupSerialized {

  private char[] adaAcqDataArea = Field.fillLowValue(32000);

  /** Constructor for AdaAcqDataAreaGroup */
  public AdaAcqDataAreaGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of adaAcqDataArea
   *
   * @return adaAcqDataArea
   */
  public char[] getAdaAcqDataArea() throws CFException {
    if (isAdaAcqDataAreaModified()) {
      adaAcqDataArea = refreshAdaAcqDataArea();
    }
    return adaAcqDataArea;
  }

  /**
   * set variable adaAcqDataArea Corresponding COBOL Variable is ADA-ACQ-DATA-AREA
   *
   * @param value
   */
  public void setAdaAcqDataArea(char[] value) {
    adaAcqDataArea = checkAdaAcqDataAreaConstraints(value);
    serializeAdaAcqDataArea(adaAcqDataArea);
  }

  /**
   * Update AdaAcqDataArea with a char[] from an offset and length
   *
   * @param value
   */
  public void setAdaAcqDataArea(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginAdaAcqDataArea, adaAcqDataArea.length);
  }

  public void setAdaAcqDataArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginAdaAcqDataArea, adaAcqDataArea.length);
  }

  /**
   * Update AdaAcqDataArea with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setAdaAcqDataArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginAdaAcqDataArea + targetIndex, targetLen);
  }

  /**
   * Update AdaAcqDataArea with another Field
   *
   * @param value
   */
  public void setAdaAcqDataArea(Field source) {
    replace(source, 0, source.length(), beginAdaAcqDataArea, ADA_ACQ_DATA_AREA_LEN);
  }

  /**
   * Update AdaAcqDataArea with another Field from an offset and length
   *
   * @param value
   */
  public void setAdaAcqDataArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginAdaAcqDataArea, ADA_ACQ_DATA_AREA_LEN);
  }

  /**
   * Update AdaAcqDataArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setAdaAcqDataArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginAdaAcqDataArea + targetIndex, targetLen);
  }

  public static int getAdaAcqDataAreaGroupFieldLength() {
    return ADA_ACQ_DATA_AREA_GROUP_LENGTH;
  }
}
