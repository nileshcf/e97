package com.cloudframe.app.dto.dphpctsq;

/**
 * The class SvindxHexGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class SvindxHexGroup extends SvindxHexGroupSerialized {

  private int svindxHex;
  private SvindxHexX svindxHexX = new SvindxHexX();
  private SvindxHexRedefined svindxHexRedefined = new SvindxHexRedefined();

  /** Constructor for SvindxHexGroup */
  public SvindxHexGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    svindxHexX.setParent(this, getStartOffset() + 0);
    svindxHexRedefined.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of svindxHex
   *
   * @return svindxHex
   */
  public int getSvindxHex() throws CFException {
    if (isSvindxHexModified()) {
      svindxHex = refreshSvindxHex();
    }
    return svindxHex;
  }

  /**
   * Update SvindxHex with the passed value Corresponding COBOL Variable is SVINDX-HEX
   *
   * @param number
   */
  public void setSvindxHex(int number) {
    // Truncate if the number is beyond +/- Max range
    svindxHex = checkSvindxHexMaxLimit(number);
    serializeSvindxHex(svindxHex);
  }

  public void setSvindxHex(long number) {
    number = checkSvindxHexMaxLimit(number); // Truncate if value is beyond +/- Max range
    setSvindxHex((int) number);
  }

  /**
   * Returns the value of svindxHexX
   *
   * @return svindxHexX
   */
  public SvindxHexX getSvindxHexX() {
    return svindxHexX;
  }
  /**
   * Update SvindxHexX with the passed value Corresponding COBOL Variable is SVINDX-HEX-X
   *
   * @param value
   */
  public void setSvindxHexX(char[] value) {
    svindxHexX.setString(value);
  }

  /**
   * Update SvindxHexX with a String from an offset and length
   *
   * @param value
   */
  public void setSvindxHexX(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, svindxHexX.begin, svindxHexX.length());
  }

  /**
   * Update SvindxHexX with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvindxHexX(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, svindxHexX.begin + targetIndex, targetLen);
  }

  /**
   * Update SvindxHexX with another Field
   *
   * @param value
   */
  public void setSvindxHexX(Field source) {
    replace(source, 0, source.length(), svindxHexX.begin, svindxHexX.length());
  }

  /**
   * Update SvindxHexX with another Field from an offset and length
   *
   * @param value
   */
  public void setSvindxHexX(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, svindxHexX.begin, svindxHexX.length());
  }

  /**
   * Update SvindxHexX with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvindxHexX(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, svindxHexX.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of svindxHexRedefined
   *
   * @return svindxHexRedefined
   */
  public SvindxHexRedefined getSvindxHexRedefined() {
    return svindxHexRedefined;
  }
  /**
   * Update SvindxHexRedefined with the passed value Corresponding COBOL Variable is
   * SVINDX-HEX-REDEFINED
   *
   * @param value
   */
  public void setSvindxHexRedefined(char[] value) {
    svindxHexRedefined.setString(value);
  }

  /**
   * Update SvindxHexRedefined with a String from an offset and length
   *
   * @param value
   */
  public void setSvindxHexRedefined(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, svindxHexRedefined.begin, svindxHexRedefined.length());
  }

  /**
   * Update SvindxHexRedefined with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvindxHexRedefined(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, svindxHexRedefined.begin + targetIndex, targetLen);
  }

  /**
   * Update SvindxHexRedefined with another Field
   *
   * @param value
   */
  public void setSvindxHexRedefined(Field source) {
    replace(source, 0, source.length(), svindxHexRedefined.begin, svindxHexRedefined.length());
  }

  /**
   * Update SvindxHexRedefined with another Field from an offset and length
   *
   * @param value
   */
  public void setSvindxHexRedefined(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, svindxHexRedefined.begin, svindxHexRedefined.length());
  }

  /**
   * Update SvindxHexRedefined with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvindxHexRedefined(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, svindxHexRedefined.begin + targetIndex, targetLen);
  }

  public static int getSvindxHexGroupFieldLength() {
    return SVINDX_HEX_GROUP_LENGTH;
  }
}
