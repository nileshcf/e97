package com.cloudframe.app.dto.bbhsr002;

/**
 * The class FoundnMsgCallerArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.ArrayList;
import java.util.List;

public class FoundnMsgCallerArea extends FoundnMsgCallerAreaSerialized {

  private FmaControlArea fmaControlArea = new FmaControlArea();
  private FmaFixedArea fmaFixedArea = new FmaFixedArea();
  private FmaEntryTable fmaEntryTable = new FmaEntryTable();
  private List<Short> fmaFieldNumber;

  /** Constructor for FoundnMsgCallerArea */
  public FoundnMsgCallerArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    fmaControlArea.setParent(this, getStartOffset() + 0);
    fmaFixedArea.setParent(this, getStartOffset() + 9);
    fmaEntryTable.setParent(this, getStartOffset() + 63);
    /*  end of offset */
  }

  /**
   * Returns the value of fmaControlArea
   *
   * @return fmaControlArea
   */
  public FmaControlArea getFmaControlArea() {
    return fmaControlArea;
  }
  /**
   * Update FmaControlArea with the passed value Corresponding COBOL Variable is FMA-CONTROL-AREA
   *
   * @param value
   */
  public void setFmaControlArea(char[] value) {
    fmaControlArea.setString(value);
  }

  /**
   * Update FmaControlArea with a String from an offset and length
   *
   * @param value
   */
  public void setFmaControlArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaControlArea.begin, fmaControlArea.length());
  }

  /**
   * Update FmaControlArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaControlArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaControlArea.begin + targetIndex, targetLen);
  }

  /**
   * Update FmaControlArea with another Field
   *
   * @param value
   */
  public void setFmaControlArea(Field source) {
    replace(source, 0, source.length(), fmaControlArea.begin, fmaControlArea.length());
  }

  /**
   * Update FmaControlArea with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaControlArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaControlArea.begin, fmaControlArea.length());
  }

  /**
   * Update FmaControlArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaControlArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaControlArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of fmaFixedArea
   *
   * @return fmaFixedArea
   */
  public FmaFixedArea getFmaFixedArea() {
    return fmaFixedArea;
  }
  /**
   * Update FmaFixedArea with the passed value Corresponding COBOL Variable is FMA-FIXED-AREA
   *
   * @param value
   */
  public void setFmaFixedArea(char[] value) {
    fmaFixedArea.setString(value);
  }

  /**
   * Update FmaFixedArea with a String from an offset and length
   *
   * @param value
   */
  public void setFmaFixedArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaFixedArea.begin, fmaFixedArea.length());
  }

  /**
   * Update FmaFixedArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaFixedArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaFixedArea.begin + targetIndex, targetLen);
  }

  /**
   * Update FmaFixedArea with another Field
   *
   * @param value
   */
  public void setFmaFixedArea(Field source) {
    replace(source, 0, source.length(), fmaFixedArea.begin, fmaFixedArea.length());
  }

  /**
   * Update FmaFixedArea with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaFixedArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaFixedArea.begin, fmaFixedArea.length());
  }

  /**
   * Update FmaFixedArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaFixedArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaFixedArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of fmaEntryTable
   *
   * @return fmaEntryTable
   */
  public FmaEntryTable getFmaEntryTable() {
    return fmaEntryTable;
  }
  /**
   * Update FmaEntryTable with the passed value Corresponding COBOL Variable is FMA-ENTRY-TABLE
   *
   * @param value
   */
  public void setFmaEntryTable(char[] value) {
    fmaEntryTable.setString(value);
  }

  /**
   * Update FmaEntryTable with a String from an offset and length
   *
   * @param value
   */
  public void setFmaEntryTable(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaEntryTable.begin, fmaEntryTable.length());
  }

  /**
   * Update FmaEntryTable with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaEntryTable(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaEntryTable.begin + targetIndex, targetLen);
  }

  /**
   * Update FmaEntryTable with another Field
   *
   * @param value
   */
  public void setFmaEntryTable(Field source) {
    replace(source, 0, source.length(), fmaEntryTable.begin, fmaEntryTable.length());
  }

  /**
   * Update FmaEntryTable with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaEntryTable(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaEntryTable.begin, fmaEntryTable.length());
  }

  /**
   * Update FmaEntryTable with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaEntryTable(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaEntryTable.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of fmaFieldNumber Corresponding COBOL Variable is FMA-FIELD-NUMBER
   *
   * @return fmaFieldNumber
   */
  public List<Short> getFmaFieldNumber() throws CFException {
    List<Short> list = new ArrayList<>();
    for (int index = 0; index < FMA_FIELD_NUMBER_SIZE; index++) {
      list.add(getFmaFieldNumber(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position from the list
   *
   * @param index
   * @return fmaFieldNumber
   */
  public short getFmaFieldNumber(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getFmaFieldNumber(), resetting it to 0", index);
      index = 0;
    } else if (index >= FMA_FIELD_NUMBER_SIZE) {
      index = FMA_FIELD_NUMBER_SIZE - 1; // can't exceed max array size
      logger.trace(
          "fmaFieldNumber - Array index exceeded max Size {}, resetting it to max allowed",
          FMA_FIELD_NUMBER_SIZE);
    }
    return getShortNumber(
        beginFmaFieldNumber + index * FMA_FIELD_NUMBER_LEN,
        FMA_FIELD_NUMBER_LEN,
        true /*isSigned*/,
        true /*isSignTrailing*/,
        false /*isSignStoredSeparate*/);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @param Integer
   * @return true if numeric value stored in the serialized String
   */
  public boolean fmaFieldNumberIsNumeric(int index) {
    return isNumeric(
        1143 + index * 3,
        1143 + (index + 1) * 3,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  /**
   * Returns String value of fmaFieldNumber
   *
   * @param index
   * @return fmaFieldNumber
   */
  public char[] getFmaFieldNumberString(int index) {
    return toCharArray((beginFmaFieldNumber + index * FMA_FIELD_NUMBER_LEN), FMA_FIELD_NUMBER_LEN);
  }
  /**
   * Update FmaFieldNumber at index with the passed value Corresponding COBOL Variable is
   * FMA-FIELD-NUMBER
   *
   * @param index
   * @param number
   */
  public void setFmaFieldNumber(int index, short number) {
    truncated = false; // reset left over truncated flag
    number = (number <= -MAX_1000 || number >= MAX_1000) ? truncate(number, MAX_1000) : number;
    setFmaFieldNumber(index, number, true);
  }

  public void setFmaFieldNumber(int index, int number) {
    number = (number <= -MAX_1000 || number >= MAX_1000) ? truncate(number, MAX_1000) : number;
    setFmaFieldNumber(index, (short) number, true);
  }

  public void setFmaFieldNumber(int index, long number) {
    number = (number <= -MAX_1000 || number >= MAX_1000) ? truncate(number, MAX_1000) : number;
    setFmaFieldNumber(index, (short) number, true);
  }

  /**
   * Update FmaFieldNumber at index with the passed value This method accepts a number value as
   * char[] char[] can also be in a format that COBOL accepts as number (may not look like a
   * number), which means, not all string will consists of digits In case of non digit value, this
   * method will mimic COBOL behavior and use only last 4 bits per char
   *
   * @param index
   * @param value
   */
  public void setFmaFieldNumber(int index, char[] value) {
    setFmaFieldNumber(index, value, true);
  }

  /**
   * Update FmaFieldNumber at index with the passed value and serialize the object if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified
   */
  private void setFmaFieldNumber(int index, short value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setFmaFieldNumber(int,char[],boolean), reset it to 0", index);
      index = 0;
    } else if (index >= FMA_FIELD_NUMBER_SIZE) {
      index = FMA_FIELD_NUMBER_SIZE - 1; // can't exceed max array size
      logger.trace(
          "fmaFieldNumber - Array index exceeded max Size {}, resetting it to max allowed",
          FMA_FIELD_NUMBER_SIZE);
    }
    if (setModified) {
      serializeFmaFieldNumber(index, value);
    }
  }

  /**
   * Update FmaFieldNumber at index with the passed value and serialize the object if setModified is
   * true This method can accept a number value as char[] char[] can also be in a format that COBOL
   * accepts as number (may not look like a number), which means, not all string will consists of
   * digits In case of non digit value, this method will mimic COBOL behavior and use only last 4
   * bits per char
   *
   * @param index
   * @param value
   * @param setModified
   */
  private void setFmaFieldNumber(int index, char[] value, boolean setModified) {
    if (setModified) {
      // serialize the value
      replaceValue(
          padNumber(3, value, true /*isSigned?*/),
          (beginFmaFieldNumber + index * FMA_FIELD_NUMBER_LEN),
          FMA_FIELD_NUMBER_LEN);
    }
  }

  /**
   * initializes FoundnMsgCallerArea String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    fmaControlArea.initialize();

    fmaFixedArea.initialize();

    fmaEntryTable.initialize();

    for (int index = 0; index < FMA_FIELD_NUMBER_SIZE; index++) {
      setFmaFieldNumber(index, (short) 0);
    }
  }

  public static int getFoundnMsgCallerAreaFieldLength() {
    return FOUNDN_MSG_CALLER_AREA_LENGTH;
  }
}
