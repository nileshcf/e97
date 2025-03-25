package com.cloudframe.app.dto.bbhsr002;

/**
 * The class WorkVariables is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;

public class WorkVariables extends WorkVariablesSerialized {

  private int bhiCnt;

  private char[] srvcCd = Field.fillLowValue(6);
  private DsmDt dsmDt = new DsmDt();

  private int posBhiCnt;
  private List<PosBhiInfo> posBhiInfo = new ArrayList<>();

  /** Constructor for WorkVariables */
  public WorkVariables() {
    super();
    /*  set the parent of each child as this which are a group variable */
    dsmDt.setParent(this, getStartOffset() + 8);
    for (int arrayIndex = 0; arrayIndex < POS_BHI_INFO_SIZE; arrayIndex++) {
      posBhiInfo.add(
          new PosBhiInfo(
              this, beginPosBhiInfo + arrayIndex * PosBhiInfo.getPosBhiInfoFieldLength()));
    }
    /*  end of offset */
  }

  /**
   * Returns the value of bhiCnt
   *
   * @return bhiCnt
   */
  public int getBhiCnt() throws CFException {
    if (isBhiCntModified()) {
      bhiCnt = refreshBhiCnt();
    }
    return bhiCnt;
  }

  /**
   * Update BhiCnt with the passed value Corresponding COBOL Variable is WS-BHI-CNT
   *
   * @param number
   */
  public void setBhiCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    bhiCnt = checkBhiCntMaxLimit(number);
    serializeBhiCnt(bhiCnt);
  }

  public void setBhiCnt(long number) {
    number = checkBhiCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setBhiCnt((int) number);
  }

  /**
   * Update BhiCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setBhiCnt(char[] value) throws CFException {
    bhiCnt = serializeBhiCnt(value);
  }
  /**
   * Update BhiCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setBhiCntString(char[] value) throws CFException {
    setBhiCnt(value);
  }
  /**
   * Returns the value of srvcCd
   *
   * @return srvcCd
   */
  public char[] getSrvcCd() throws CFException {
    if (isSrvcCdModified()) {
      srvcCd = refreshSrvcCd();
    }
    return srvcCd;
  }

  /**
   * set variable srvcCd Corresponding COBOL Variable is WS-SRVC-CD
   *
   * @param value
   */
  public void setSrvcCd(char[] value) {
    srvcCd = checkSrvcCdConstraints(value);
    serializeSrvcCd(srvcCd);
  }

  /**
   * Update SrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSrvcCd, srvcCd.length);
  }

  public void setSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSrvcCd, srvcCd.length);
  }

  /**
   * Update SrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update SrvcCd with another Field
   *
   * @param value
   */
  public void setSrvcCd(Field source) {
    replace(source, 0, source.length(), beginSrvcCd, SRVC_CD_LEN);
  }

  /**
   * Update SrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSrvcCd, SRVC_CD_LEN);
  }

  /**
   * Update SrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dsmDt
   *
   * @return dsmDt
   */
  public DsmDt getDsmDt() {
    return dsmDt;
  }
  /**
   * Update DsmDt with the passed value Corresponding COBOL Variable is WS-DSM-DT
   *
   * @param value
   */
  public void setDsmDt(char[] value) {
    dsmDt.setString(value);
  }

  /**
   * Update DsmDt with a String from an offset and length
   *
   * @param value
   */
  public void setDsmDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dsmDt.begin, dsmDt.length());
  }

  /**
   * Update DsmDt with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dsmDt.begin + targetIndex, targetLen);
  }

  /**
   * Update DsmDt with another Field
   *
   * @param value
   */
  public void setDsmDt(Field source) {
    replace(source, 0, source.length(), dsmDt.begin, dsmDt.length());
  }

  /**
   * Update DsmDt with another Field from an offset and length
   *
   * @param value
   */
  public void setDsmDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dsmDt.begin, dsmDt.length());
  }

  /**
   * Update DsmDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDsmDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dsmDt.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of posBhiCnt
   *
   * @return posBhiCnt
   */
  public int getPosBhiCnt() throws CFException {
    if (isPosBhiCntModified()) {
      posBhiCnt = refreshPosBhiCnt();
    }
    return posBhiCnt;
  }

  /**
   * Update PosBhiCnt with the passed value Corresponding COBOL Variable is WS-POS-BHI-CNT
   *
   * @param number
   */
  public void setPosBhiCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    posBhiCnt = checkPosBhiCntMaxLimit(number);
    serializePosBhiCnt(posBhiCnt);
  }

  public void setPosBhiCnt(long number) {
    number = checkPosBhiCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPosBhiCnt((int) number);
  }

  /**
   * Update PosBhiCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPosBhiCnt(char[] value) throws CFException {
    posBhiCnt = serializePosBhiCnt(value);
  }
  /**
   * Update PosBhiCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPosBhiCntString(char[] value) throws CFException {
    setPosBhiCnt(value);
  }
  /**
   * Returns the value of posBhiInfo Corresponding COBOL Variable is WS-POS-BHI-INFO
   *
   * @return posBhiInfo
   */
  public List<PosBhiInfo> getPosBhiInfo() {
    return posBhiInfo;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return posBhiInfo
   */
  public PosBhiInfo getPosBhiInfo(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPosBhiInfo(), resetting it to 0", index);
      index = 0;
    } else if (index >= POS_BHI_INFO_SIZE) {
      index = POS_BHI_INFO_SIZE - 1; // can't exceed max array size
      logger.trace(
          "posBhiInfo - Array index exceeded max Size {}, resetting it to max allowed",
          POS_BHI_INFO_SIZE);
    }
    if (index >= posBhiInfo.size()) {
      for (int fillIndex = posBhiInfo.size() - 1; fillIndex < index; fillIndex++) {
        posBhiInfo.add(null);
      }
      posBhiInfo.set(
          index,
          new PosBhiInfo(this, beginPosBhiInfo + index * PosBhiInfo.getPosBhiInfoFieldLength()));
    }
    PosBhiInfo value = posBhiInfo.get(index);
    if (value == null) {
      posBhiInfo.set(
          index,
          new PosBhiInfo(this, beginPosBhiInfo + index * PosBhiInfo.getPosBhiInfoFieldLength()));
      value = posBhiInfo.get(index);
    }
    return value;
  }

  /**
   * Update PosBhiInfo at index with the passed value Corresponding COBOL Variable is
   * WS-POS-BHI-INFO
   *
   * @param index
   * @param value
   */
  public void setPosBhiInfo(int index, char[] value) {
    getPosBhiInfo(index).setString(value);
  }

  public static int getWorkVariablesFieldLength() {
    return WORK_VARIABLES_LENGTH;
  }
}
