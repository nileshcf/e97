package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdSqlcaLineSizeGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdSqlcaLineSizeGroup extends GdSqlcaLineSizeGroupSerialized {

  private int gdSqlcaLineSize;

  /** Constructor for GdSqlcaLineSizeGroup */
  public GdSqlcaLineSizeGroup() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdSqlcaLineSizeGroup. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdSqlcaLineSizeGroup(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdSqlcaLineSize
   *
   * @return gdSqlcaLineSize
   */
  public int getGdSqlcaLineSize() throws CFException {
    if (isGdSqlcaLineSizeModified()) {
      gdSqlcaLineSize = refreshGdSqlcaLineSize();
    }
    return gdSqlcaLineSize;
  }

  /**
   * Update GdSqlcaLineSize with the passed value Corresponding COBOL Variable is GD-SQLCA-LINE-SIZE
   *
   * @param number
   */
  public void setGdSqlcaLineSize(int number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlcaLineSize = checkGdSqlcaLineSizeMaxLimit(number);
    serializeGdSqlcaLineSize(gdSqlcaLineSize);
  }

  public void setGdSqlcaLineSize(long number) {
    number = checkGdSqlcaLineSizeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setGdSqlcaLineSize((int) number);
  }

  public static int getGdSqlcaLineSizeGroupFieldLength() {
    return GD_SQLCA_LINE_SIZE_GROUP_LENGTH;
  }
}
