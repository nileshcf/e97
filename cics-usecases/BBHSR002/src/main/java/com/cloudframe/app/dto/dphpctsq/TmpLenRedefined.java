package com.cloudframe.app.dto.dphpctsq;

/**
 * The class TmpLenRedefined is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class TmpLenRedefined extends TmpLenRedefinedSerialized {

  private char[] tmpLenByte4 = Field.fillLowValue(1);

  /** Constructor for TmpLenRedefined */
  public TmpLenRedefined() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for TmpLenRedefined. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public TmpLenRedefined(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of tmpLenByte4
   *
   * @return tmpLenByte4
   */
  public char[] getTmpLenByte4() throws CFException {
    if (isTmpLenByte4Modified()) {
      tmpLenByte4 = refreshTmpLenByte4();
    }
    return tmpLenByte4;
  }

  /**
   * set variable tmpLenByte4 Corresponding COBOL Variable is TMP-LEN-BYTE4
   *
   * @param value
   */
  public void setTmpLenByte4(char[] value) {
    tmpLenByte4 = checkTmpLenByte4Constraints(value);
    serializeTmpLenByte4(tmpLenByte4);
  }

  /**
   * Update TmpLenByte4 with a char[] from an offset and length
   *
   * @param value
   */
  public void setTmpLenByte4(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTmpLenByte4, tmpLenByte4.length);
  }

  public void setTmpLenByte4(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTmpLenByte4, tmpLenByte4.length);
  }

  /**
   * Update TmpLenByte4 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTmpLenByte4(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTmpLenByte4 + targetIndex, targetLen);
  }

  /**
   * Update TmpLenByte4 with another Field
   *
   * @param value
   */
  public void setTmpLenByte4(Field source) {
    replace(source, 0, source.length(), beginTmpLenByte4, TMP_LEN_BYTE_4_LEN);
  }

  /**
   * Update TmpLenByte4 with another Field from an offset and length
   *
   * @param value
   */
  public void setTmpLenByte4(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTmpLenByte4, TMP_LEN_BYTE_4_LEN);
  }

  /**
   * Update TmpLenByte4 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTmpLenByte4(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTmpLenByte4 + targetIndex, targetLen);
  }

  public static int getTmpLenRedefinedFieldLength() {
    return TMP_LEN_REDEFINED_LENGTH;
  }
}
