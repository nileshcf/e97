package com.cloudframe.app.dto.bbhsr002;

/**
 * The class FmaFixedArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class FmaFixedArea extends FmaFixedAreaSerialized {

  private FmaIpEntry fmaIpEntry = new FmaIpEntry();

  /** Constructor for FmaFixedArea */
  public FmaFixedArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaFixedArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaFixedArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    fmaIpEntry.setParent(this, getStartOffset() + 0);
  }

  /**
   * Returns the value of fmaIpEntry
   *
   * @return fmaIpEntry
   */
  public FmaIpEntry getFmaIpEntry() {
    return fmaIpEntry;
  }
  /**
   * Update FmaIpEntry with the passed value Corresponding COBOL Variable is FMA-IP-ENTRY
   *
   * @param value
   */
  public void setFmaIpEntry(char[] value) {
    fmaIpEntry.setString(value);
  }

  /**
   * Update FmaIpEntry with a String from an offset and length
   *
   * @param value
   */
  public void setFmaIpEntry(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaIpEntry.begin, fmaIpEntry.length());
  }

  /**
   * Update FmaIpEntry with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpEntry(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaIpEntry.begin + targetIndex, targetLen);
  }

  /**
   * Update FmaIpEntry with another Field
   *
   * @param value
   */
  public void setFmaIpEntry(Field source) {
    replace(source, 0, source.length(), fmaIpEntry.begin, fmaIpEntry.length());
  }

  /**
   * Update FmaIpEntry with another Field from an offset and length
   *
   * @param value
   */
  public void setFmaIpEntry(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, fmaIpEntry.begin, fmaIpEntry.length());
  }

  /**
   * Update FmaIpEntry with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setFmaIpEntry(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, fmaIpEntry.begin + targetIndex, targetLen);
  }

  /**
   * initializes FmaFixedArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    fmaIpEntry.initialize();
  }

  public static int getFmaFixedAreaFieldLength() {
    return FMA_FIXED_AREA_LENGTH;
  }
}
