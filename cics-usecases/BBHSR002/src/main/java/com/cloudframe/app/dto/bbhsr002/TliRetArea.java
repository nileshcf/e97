package com.cloudframe.app.dto.bbhsr002;

/**
 * The class TliRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class TliRetArea extends TliRetAreaSerialized {

  private char[] tliRetSlotTblId = Field.fillLowValue(6);

  /** Constructor for TliRetArea */
  public TliRetArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for TliRetArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public TliRetArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of tliRetSlotTblId
   *
   * @return tliRetSlotTblId
   */
  public char[] getTliRetSlotTblId() throws CFException {
    if (isTliRetSlotTblIdModified()) {
      tliRetSlotTblId = refreshTliRetSlotTblId();
    }
    return tliRetSlotTblId;
  }

  /**
   * set variable tliRetSlotTblId Corresponding COBOL Variable is TLI-RET-SLOT-TBL-ID
   *
   * @param value
   */
  public void setTliRetSlotTblId(char[] value) {
    tliRetSlotTblId = checkTliRetSlotTblIdConstraints(value);
    serializeTliRetSlotTblId(tliRetSlotTblId);
  }

  /**
   * Update TliRetSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setTliRetSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginTliRetSlotTblId, tliRetSlotTblId.length);
  }

  public void setTliRetSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliRetSlotTblId, tliRetSlotTblId.length);
  }

  /**
   * Update TliRetSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliRetSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliRetSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update TliRetSlotTblId with another Field
   *
   * @param value
   */
  public void setTliRetSlotTblId(Field source) {
    replace(source, 0, source.length(), beginTliRetSlotTblId, TLI_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update TliRetSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setTliRetSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginTliRetSlotTblId, TLI_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update TliRetSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliRetSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginTliRetSlotTblId + targetIndex, targetLen);
  }

  /**
   * initializes TliRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setTliRetSlotTblId(CONSTANTS.SPACE_6);
  }

  public static int getTliRetAreaFieldLength() {
    return TLI_RET_AREA_LENGTH;
  }
}
