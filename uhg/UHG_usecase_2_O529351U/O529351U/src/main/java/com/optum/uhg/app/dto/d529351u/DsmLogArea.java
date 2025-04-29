package com.optum.uhg.app.dto.d529351u;

/**
 * The class DsmLogArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:33. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import com.optum.uhg.app.dto.serialize.d529351u.*;

public class DsmLogArea extends DsmLogAreaSerialized {

  private DsmSqlErrorMsgArea dsmSqlErrorMsgArea = new DsmSqlErrorMsgArea();
  private DsmRecDetailsArea dsmRecDetailsArea = new DsmRecDetailsArea();

  /** Constructor for DsmLogArea */
  public DsmLogArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for DsmLogArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public DsmLogArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    dsmSqlErrorMsgArea.setParent(this, getStartOffset() + 0);
    dsmRecDetailsArea.setParent(this, getStartOffset() + 120);
  }

  /**
   * Returns the value of dsmSqlErrorMsgArea
   *
   * @return dsmSqlErrorMsgArea
   */
  public DsmSqlErrorMsgArea getDsmSqlErrorMsgArea() {
    return dsmSqlErrorMsgArea;
  }
  /**
   * Update DsmSqlErrorMsgArea with the passed value Corresponding COBOL Variable is
   * DSM-SQL-ERROR-MSG-AREA
   *
   * @param value
   */
  public void setDsmSqlErrorMsgArea(char[] value) {
    dsmSqlErrorMsgArea.setString(value);
  }

  /**
   * Update DsmSqlErrorMsgArea with a String from an offset and length
   *
   * @param value
   */
  public void setDsmSqlErrorMsgArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dsmSqlErrorMsgArea.begin, dsmSqlErrorMsgArea.length());
  }

  /**
   * Update DsmSqlErrorMsgArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmSqlErrorMsgArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dsmSqlErrorMsgArea.begin + targetIndex, targetLen);
  }

  /**
   * Update DsmSqlErrorMsgArea with another Field
   *
   * @param value
   */
  public void setDsmSqlErrorMsgArea(Field source) {
    replace(source, 0, source.length(), dsmSqlErrorMsgArea.begin, dsmSqlErrorMsgArea.length());
  }

  /**
   * Update DsmSqlErrorMsgArea with another Field from an offset and length
   *
   * @param value
   */
  public void setDsmSqlErrorMsgArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dsmSqlErrorMsgArea.begin, dsmSqlErrorMsgArea.length());
  }

  /**
   * Update DsmSqlErrorMsgArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmSqlErrorMsgArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dsmSqlErrorMsgArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of dsmRecDetailsArea
   *
   * @return dsmRecDetailsArea
   */
  public DsmRecDetailsArea getDsmRecDetailsArea() {
    return dsmRecDetailsArea;
  }
  /**
   * Update DsmRecDetailsArea with the passed value Corresponding COBOL Variable is
   * DSM-REC-DETAILS-AREA
   *
   * @param value
   */
  public void setDsmRecDetailsArea(char[] value) {
    dsmRecDetailsArea.setString(value);
  }

  /**
   * Update DsmRecDetailsArea with a String from an offset and length
   *
   * @param value
   */
  public void setDsmRecDetailsArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dsmRecDetailsArea.begin, dsmRecDetailsArea.length());
  }

  /**
   * Update DsmRecDetailsArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmRecDetailsArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dsmRecDetailsArea.begin + targetIndex, targetLen);
  }

  /**
   * Update DsmRecDetailsArea with another Field
   *
   * @param value
   */
  public void setDsmRecDetailsArea(Field source) {
    replace(source, 0, source.length(), dsmRecDetailsArea.begin, dsmRecDetailsArea.length());
  }

  /**
   * Update DsmRecDetailsArea with another Field from an offset and length
   *
   * @param value
   */
  public void setDsmRecDetailsArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dsmRecDetailsArea.begin, dsmRecDetailsArea.length());
  }

  /**
   * Update DsmRecDetailsArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmRecDetailsArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dsmRecDetailsArea.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmLogArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    dsmSqlErrorMsgArea.initialize();

    dsmRecDetailsArea.initialize();
  }

  public static int getDsmLogAreaFieldLength() {
    return DSM_LOG_AREA_LENGTH;
  }
}
