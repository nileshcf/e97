package com.cloudframe.app.dto.d5427bhi;

/**
 * The class DclslotTbl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class DclslotTbl extends DclslotTblSerialized {

  private char[] hdrSlotTblId = Field.fillLowValue(6);

  /** Constructor for DclslotTbl */
  public DclslotTbl() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of hdrSlotTblId
   *
   * @return hdrSlotTblId
   */
  public char[] getHdrSlotTblId() throws CFException {
    if (isHdrSlotTblIdModified()) {
      hdrSlotTblId = refreshHdrSlotTblId();
    }
    return hdrSlotTblId;
  }

  /**
   * set variable hdrSlotTblId Corresponding COBOL Variable is HDR-SLOT-TBL-ID
   *
   * @param value
   */
  public void setHdrSlotTblId(char[] value) {
    hdrSlotTblId = checkHdrSlotTblIdConstraints(value);
    serializeHdrSlotTblId(hdrSlotTblId);
  }

  /**
   * Update HdrSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrSlotTblId, hdrSlotTblId.length);
  }

  public void setHdrSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId, hdrSlotTblId.length);
  }

  /**
   * Update HdrSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update HdrSlotTblId with another Field
   *
   * @param value
   */
  public void setHdrSlotTblId(Field source) {
    replace(source, 0, source.length(), beginHdrSlotTblId, HDR_SLOT_TBL_ID_LEN);
  }

  /**
   * Update HdrSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId, HDR_SLOT_TBL_ID_LEN);
  }

  /**
   * Update HdrSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId + targetIndex, targetLen);
  }

  public static int getDclslotTblFieldLength() {
    return DCLSLOT_TBL_LENGTH;
  }
}
