package com.optum.uhg.app.dto.d5427dt1;

/**
 * The class FormattedDateGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:47. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import com.optum.uhg.app.dto.serialize.d5427dt1.*;

public class FormattedDateGroup extends FormattedDateGroupSerialized {

  private char[] formattedDate = Field.fillLowValue(80);

  /** Constructor for FormattedDateGroup */
  public FormattedDateGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of formattedDate
   *
   * @return formattedDate
   */
  public char[] getFormattedDate() throws CFException {
    if (isFormattedDateModified()) {
      formattedDate = refreshFormattedDate();
    }
    return formattedDate;
  }

  /**
   * set variable formattedDate Corresponding COBOL Variable is FORMATTED-DATE
   *
   * @param value
   */
  public void setFormattedDate(char[] value) {
    formattedDate = checkFormattedDateConstraints(value);
    serializeFormattedDate(formattedDate);
  }

  /**
   * Update FormattedDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setFormattedDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginFormattedDate, formattedDate.length);
  }

  public void setFormattedDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFormattedDate, formattedDate.length);
  }

  /**
   * Update FormattedDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFormattedDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFormattedDate + targetIndex, targetLen);
  }

  /**
   * Update FormattedDate with another Field
   *
   * @param value
   */
  public void setFormattedDate(Field source) {
    replace(source, 0, source.length(), beginFormattedDate, FORMATTED_DATE_LEN);
  }

  /**
   * Update FormattedDate with another Field from an offset and length
   *
   * @param value
   */
  public void setFormattedDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginFormattedDate, FORMATTED_DATE_LEN);
  }

  /**
   * Update FormattedDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFormattedDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginFormattedDate + targetIndex, targetLen);
  }

  public static int getFormattedDateGroupFieldLength() {
    return FORMATTED_DATE_GROUP_LENGTH;
  }
}
