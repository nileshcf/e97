package com.cloudframe.app.dto.dphpctsq;

/**
 * The class SvindxHexX is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class SvindxHexX extends SvindxHexXSerialized {

  private char[] svindxHexLowByte = Field.fillLowValue(1);

  /** Constructor for SvindxHexX */
  public SvindxHexX() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for SvindxHexX. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public SvindxHexX(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of svindxHexLowByte
   *
   * @return svindxHexLowByte
   */
  public char[] getSvindxHexLowByte() throws CFException {
    if (isSvindxHexLowByteModified()) {
      svindxHexLowByte = refreshSvindxHexLowByte();
    }
    return svindxHexLowByte;
  }

  /**
   * set variable svindxHexLowByte Corresponding COBOL Variable is SVINDX-HEX-LOW-BYTE
   *
   * @param value
   */
  public void setSvindxHexLowByte(char[] value) {
    svindxHexLowByte = checkSvindxHexLowByteConstraints(value);
    serializeSvindxHexLowByte(svindxHexLowByte);
  }

  /**
   * Update SvindxHexLowByte with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvindxHexLowByte(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvindxHexLowByte, svindxHexLowByte.length);
  }

  public void setSvindxHexLowByte(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvindxHexLowByte, svindxHexLowByte.length);
  }

  /**
   * Update SvindxHexLowByte with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvindxHexLowByte(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvindxHexLowByte + targetIndex, targetLen);
  }

  /**
   * Update SvindxHexLowByte with another Field
   *
   * @param value
   */
  public void setSvindxHexLowByte(Field source) {
    replace(source, 0, source.length(), beginSvindxHexLowByte, SVINDX_HEX_LOW_BYTE_LEN);
  }

  /**
   * Update SvindxHexLowByte with another Field from an offset and length
   *
   * @param value
   */
  public void setSvindxHexLowByte(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvindxHexLowByte, SVINDX_HEX_LOW_BYTE_LEN);
  }

  /**
   * Update SvindxHexLowByte with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvindxHexLowByte(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvindxHexLowByte + targetIndex, targetLen);
  }

  public static int getSvindxHexXFieldLength() {
    return SVINDX_HEX_X_LENGTH;
  }
}
