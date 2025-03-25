package com.cloudframe.app.dto.dphpctsq;

/**
 * The class TmpPointerGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class TmpPointerGroup extends TmpPointerGroupSerialized {

  private int tmpPointer;

  private int tmpPointerBin;

  /** Constructor for TmpPointerGroup */
  public TmpPointerGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of tmpPointer
   *
   * @return tmpPointer
   */
  public int getTmpPointer() throws CFException {
    if (isTmpPointerModified()) {
      tmpPointer = refreshTmpPointer();
    }
    return tmpPointer;
  }

  /**
   * Update TmpPointer with the passed value Corresponding COBOL Variable is TMP-POINTER
   *
   * @param number
   */
  public void setTmpPointer(int number) {
    // Truncate if the number is beyond +/- Max range
    tmpPointer = checkTmpPointerMaxLimit(number);
    serializeTmpPointer(tmpPointer);
  }

  public void setTmpPointer(long number) {
    number = checkTmpPointerMaxLimit(number); // Truncate if value is beyond +/- Max range
    setTmpPointer((int) number);
  }

  /**
   * Returns the value of tmpPointerBin
   *
   * @return tmpPointerBin
   */
  public int getTmpPointerBin() throws CFException {
    if (isTmpPointerBinModified()) {
      tmpPointerBin = refreshTmpPointerBin();
    }
    return tmpPointerBin;
  }

  /**
   * Update TmpPointerBin with the passed value Corresponding COBOL Variable is TMP-POINTER-BIN
   *
   * @param number
   */
  public void setTmpPointerBin(int number) {
    // Truncate if the number is beyond +/- Max range
    tmpPointerBin = checkTmpPointerBinMaxLimit(number);
    serializeTmpPointerBin(tmpPointerBin);
  }

  public void setTmpPointerBin(long number) {
    number = checkTmpPointerBinMaxLimit(number); // Truncate if value is beyond +/- Max range
    setTmpPointerBin((int) number);
  }

  public static int getTmpPointerGroupFieldLength() {
    return TMP_POINTER_GROUP_LENGTH;
  }
}
